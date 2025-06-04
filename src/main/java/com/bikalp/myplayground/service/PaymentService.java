package com.bikalp.myplayground.service;

import com.bikalp.myplayground.entity.Payment;
import com.bikalp.myplayground.repository.PaymentJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaymentService {

    private final PaymentJpaRepository paymentJpaRepository;

    public PaymentService(PaymentJpaRepository paymentJpaRepository) {
        this.paymentJpaRepository = paymentJpaRepository;
    }

    // JPA operations for saving
    public Payment savePayment(Payment payment) {
        return paymentJpaRepository.save(payment);
    }

    public Payment updatePayment(Payment payment) {
        return paymentJpaRepository.save(payment);
    }

    public void deletePayment(Long id) {
        paymentJpaRepository.deleteById(id);
    }

    // MyBatis operations for fetching
    public List<Payment> getAllPayments() {
        return paymentJpaRepository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return paymentJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found with id: " + id));
    }

    public List<Payment> getPaymentsByOrderId(Long orderId) {
        return paymentJpaRepository.findByOrderId(orderId);
    }

    public List<Payment> getPaymentsByStatus(Payment.PaymentStatus status) {
        return paymentJpaRepository.findByStatus(status);
    }

    public Payment getPaymentByTransactionId(String transactionId) {
        return paymentJpaRepository.findByTransactionId(transactionId)
                .orElseThrow(() -> new RuntimeException("Payment not found with transaction id: " + transactionId));
    }

    public List<Payment> getPaymentsByPaymentMethod(Payment.PaymentMethod paymentMethod) {
        return paymentJpaRepository.findByPaymentMethod(paymentMethod);
    }
}