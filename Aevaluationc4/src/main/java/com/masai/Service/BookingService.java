package com.masai.Service;

import java.util.List;

import com.masai.Exception.BookingException;
import com.masai.model.Booking;
import com.masai.model.RoomType;

public interface BookingService {
	 public Booking createBooking(Booking booking);
	 public Booking getBookingById(Integer id)throws BookingException;
	 public List<Booking> getAllBookings()throws BookingException;
	 public Booking deleteBooking(Integer id) throws BookingException;
	 public List<RoomType> searchRooms(String city, RoomType roomType) ;
}
