package com.bikalp.myplayground.repository;

import com.bikalp.myplayground.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentJpaRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByOrderId(Long orderId);

    List<Payment> findByStatus(Payment.PaymentStatus status);

    Optional<Payment> findByTransactionId(String transactionId);

    List<Payment> findByPaymentMethod(Payment.PaymentMethod paymentMethod);
}