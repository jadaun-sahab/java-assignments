package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Booking;
import com.masai.model.Customer;
import com.masai.model.RoomType;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    List<Booking> findByCustomer(Customer customer);
    List<Booking> findByRoomType(RoomType roomType);
}

