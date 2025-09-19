package com.wave.Mirissa.repositories;

import com.wave.Mirissa.models.Review;
import com.wave.Mirissa.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByOrderItem(OrderItem orderItem);
}
