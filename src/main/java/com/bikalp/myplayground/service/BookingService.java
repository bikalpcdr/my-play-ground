package com.bikalp.myplayground.service;

import com.bikalp.myplayground.entity.Booking;
import com.bikalp.myplayground.repository.BookingJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookingService {

    private final BookingJpaRepository bookingJpaRepository;

    public BookingService(BookingJpaRepository bookingJpaRepository) {
        this.bookingJpaRepository = bookingJpaRepository;
    }


    // JPA operations for saving
    public Booking saveBooking(Booking booking) {
        return bookingJpaRepository.save(booking);
    }

    public Booking updateBooking(Booking booking) {
        return bookingJpaRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        bookingJpaRepository.deleteById(id);
    }

    // MyBatis operations for fetching
    public List<Booking> getAllBookings() {
        return bookingJpaRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
    }

    public List<Booking> getBookingsByUserId(Long userId) {
        return bookingJpaRepository.findByUserId(userId);
    }

    public List<Booking> getBookingsByServiceType(String serviceType) {
        return bookingJpaRepository.findByServiceType(serviceType);
    }
}