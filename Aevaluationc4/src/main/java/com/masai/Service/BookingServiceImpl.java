package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.BookingException;
import com.masai.Exception.CustomerException;
import com.masai.Exception.RoomException;
import com.masai.model.Booking;
import com.masai.model.Customer;
import com.masai.model.RoomType;
import com.masai.repository.*;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository br;
	

	@Autowired
	private CustomerRepository cr;
	
	@Autowired
	private RoomTypeRepository rtr;
	
	@Override
	public Booking createBooking(Booking booking) throws CustomerException,RoomException{
		Optional<Customer> c = cr.findById(booking.getCustomer().getCustomerId());
		if(c.isEmpty()) {
			throw new CustomerException("Customer should registered first");
		}
		Optional<RoomType> r = rtr.findById(booking.getRoomType().getRoomId());
		if(r.isEmpty()) {
			throw new RoomException("No room is available");
		}
		Booking newBooking = br.save(booking);
		c.get().getBookings().add(newBooking);
		r.get().getBookings().add(newBooking);
		return newBooking;
	}

	@Override
	public Booking getBookingById(Integer id) throws BookingException {
		Optional<Booking> opt = br.findById(id);
		if(opt.isEmpty()) {
			throw new BookingException("No Booking found");
		}
		return opt.get();
	}

	@Override
	public List<Booking> getAllBookings() throws BookingException {
		List<Booking> list = br.findAll();
		if(list.size()==0) {
			throw new BookingException("No Booking Still now.");
		}
		return list;
	}

	@Override
	public Booking deleteBooking(Integer id) throws BookingException {
		Optional<Booking> opt = br.findById(id);
		if(opt.isPresent()) {
			Booking b = opt.get();
			br.delete(b);
			return b;
		}else {
			throw new BookingException("No booking found with this id");
		}
		
	}
	
	@Override
    public List<RoomType> searchRooms(String city, RoomType roomType) {
      
        return null;
    }

}
