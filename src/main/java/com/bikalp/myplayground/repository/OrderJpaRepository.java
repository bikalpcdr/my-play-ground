package com.bikalp.myplayground.repository;

import com.bikalp.myplayground.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderJpaRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);

    List<Order> findByStatus(Order.OrderStatus status);

    List<Order> findByPaymentId(Long paymentId);
}