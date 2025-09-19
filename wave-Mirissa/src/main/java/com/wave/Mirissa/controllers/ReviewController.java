package com.wave.Mirissa.controllers;

import com.wave.Mirissa.dtos.ReviewRequestDTO;
import com.wave.Mirissa.models.Review;
import com.wave.Mirissa.services.ReviewService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:5173")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/submit")
    public Review submitReview(@RequestBody ReviewRequestDTO request) {
        return reviewService.submitReview(
                request.getOrderItemId(),
                request.getProductId(),
                request.getUserId(),
                request.getRating(),
                request.getComment()
        );
    }
}
