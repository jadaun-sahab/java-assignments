package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.BookingService;
import com.masai.Service.CustomerService;
import com.masai.Service.HotelService;
import com.masai.Service.RoomService;
import com.masai.model.Booking;
import com.masai.model.Customer;
import com.masai.model.Hotel;
import com.masai.model.RoomType;

@RestController
@RequestMapping("/api")
public class BookingController {

	@Autowired
    private CustomerService customerService;
	@Autowired
    private HotelService hotelService;
	@Autowired
    private BookingService bookingService;
	@Autowired
    private RoomService roomService;


    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
    	Customer createdCustomer = customerService.createCustomer(customer);
    	return new ResponseEntity<>(createdCustomer, HttpStatus.ACCEPTED);
    }

    @PostMapping("/hotels")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel Hotel) {
    	Hotel createdHotel = hotelService.createHotel(Hotel);
        return ResponseEntity.ok(createdHotel);
    }

    @PostMapping("/bookings")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking Booking) {
    	Booking createdBooking = bookingService.createBooking(Booking);
        return ResponseEntity.ok(createdBooking);
    }

    @PostMapping("/hotels/{hotelId}/roomTypes")
    public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomTypeDto) {
        RoomType createdRoomType = roomService.createRoom(roomTypeDto);
        return ResponseEntity.ok(createdRoomType);
    }

    @GetMapping("/customers/bookings")
    public ResponseEntity<Booking> getCustomerBookings(@RequestBody Booking booking) {
        Booking bookings = bookingService.createBooking(booking);
        return ResponseEntity.ok(bookings);
    }

    @GetMapping("/search")
    public ResponseEntity<List<RoomType>> searchRooms(@RequestParam String city, @RequestParam RoomType roomType) {
        List<RoomType> availableRoomTypes = bookingService.searchRooms(city, roomType);
        return ResponseEntity.ok(availableRoomTypes);
    }
}