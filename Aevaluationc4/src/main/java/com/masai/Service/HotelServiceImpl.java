package com.masai.Service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.BookingException;
import com.masai.Exception.HotelException;
import com.masai.model.Hotel;
import com.masai.repository.*;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hr;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		Hotel h = hr.save(hotel);
		return h;
	}

	@Override
	public Hotel getHotelById(Integer id) throws HotelException {
		Optional<Hotel> opt = hr.findById(id);
		if(opt.isEmpty()) {
			throw new HotelException("No hotel found with this id");
		}
		return opt.get();
	}

	@Override
	public List<Hotel> getAllHotels() throws HotelException {
		List<Hotel> list = hr.findAll();
		if(list.size()==0) {
			throw new HotelException("No hotel registered");
		}
		return list;
	}

	@Override
	public Hotel deleteHotel(Integer id) {
		Optional<Hotel> opt = hr.findById(id);
		if(opt.isPresent()) {
			Hotel b = opt.get();
			hr.delete(b);
			return b;
		}else {
			throw new BookingException("No Hotel found with this id");
		}
		
		
	}

}
