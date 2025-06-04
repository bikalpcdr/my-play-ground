package com.bikalp.myplayground.repository;

import com.bikalp.myplayground.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingJpaRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByServiceType(String serviceType);

    List<Booking> findByUserId(Long userId);

}