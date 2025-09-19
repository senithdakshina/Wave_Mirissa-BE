package com.wave.Mirissa.controllers;

import com.wave.Mirissa.dtos.ReviewRequestDTO;
import com.wave.Mirissa.dtos.ReviewResponseDTO;
import com.wave.Mirissa.models.Review;
import com.wave.Mirissa.services.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:5173")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/submit")
    public Review submitOrUpdateReview(@RequestBody ReviewRequestDTO request) {
        return reviewService.submitOrUpdateReview(
                request.getOrderItemId(),
                request.getProductId(),
                request.getUserId(),
                request.getRating(),
                request.getComment()
        );
    }

    @GetMapping("/user/{userId}/product/{productId}")
    public Review getUserProductReview(@PathVariable Long userId, @PathVariable Long productId) {
        return reviewService.getReviewForUserAndProduct(userId, productId)
                .orElse(null); // return null if no review exists
    }

    // Get reviews for a product
    @GetMapping("/product/{productId}")
    public List<ReviewResponseDTO> getProductReviews(@PathVariable Long productId) {
        return reviewService.getReviewsByProductId(productId);
    }


}
