package com.wave.Mirissa.services;

import com.wave.Mirissa.models.*;
import com.wave.Mirissa.repositories.OrderItemRepository;
import com.wave.Mirissa.repositories.ProductRepository;
import com.wave.Mirissa.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productsRepository;

    public ReviewService(ReviewRepository reviewRepository, OrderItemRepository orderItemRepository,
                         ProductRepository productsRepository) {
        this.reviewRepository = reviewRepository;
        this.orderItemRepository = orderItemRepository;
        this.productsRepository = productsRepository;
    }

    public Review submitReview(Long orderItemId, Long productId, Long userId, int rating, String comment) {

        System.out.println("submitReview() called with:");
        System.out.println("orderItemId = " + orderItemId);
        System.out.println("productId   = " + productId);
        System.out.println("userId      = " + userId);
        System.out.println("rating      = " + rating);
        System.out.println("comment     = " + comment);


        OrderItem orderItem = orderItemRepository.findById(orderItemId)
                .orElseThrow(() -> new RuntimeException("Order item not found"));

        Products product = productsRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Check if order is delivered
        if (orderItem.getOrder().getOrderStatus() != OrderStatus.DELIVERED) {
            throw new RuntimeException("Cannot review undelivered products");
        }

        // Check if user owns this order
        if (!orderItem.getOrder().getUser().getId().equals(userId)) {
            throw new RuntimeException("Unauthorized");
        }

        // Save review
        Review review = new Review();
        review.setOrderItem(orderItem);
        review.setProduct(product); // link to the product
        review.setUser(orderItem.getOrder().getUser());
        review.setRating(rating);
        review.setComment(comment);

        return reviewRepository.save(review);
    }



}
