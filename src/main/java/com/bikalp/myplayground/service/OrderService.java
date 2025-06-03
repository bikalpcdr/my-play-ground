package com.bikalp.myplayground.service;

import com.bikalp.myplayground.entity.Order;
import com.bikalp.myplayground.repository.OrderJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderJpaRepository orderJpaRepository;

    // JPA operations for saving
    public Order saveOrder(Order order) {
        return orderJpaRepository.save(order);
    }

    public Order updateOrder(Order order) {
        return orderJpaRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderJpaRepository.deleteById(id);
    }

    // MyBatis operations for fetching
    public List<Order> getAllOrders() {
        return orderJpaRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orderJpaRepository.findByUserId(userId);
    }

    public List<Order> getOrdersByStatus(Order.OrderStatus status) {
        return orderJpaRepository.findByStatus(status);
    }

    public List<Order> getOrdersByPaymentId(Long paymentId) {
        return orderJpaRepository.findByPaymentId(paymentId);
    }
}