package com.wave.Mirissa.repositories;

import com.wave.Mirissa.models.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);

    // Pageable query without fetch joins
    Page<Order> findByStatus(String status, Pageable pageable);

    // For non-paginated fallback
    java.util.List<Order> findByStatus(String status);
}
