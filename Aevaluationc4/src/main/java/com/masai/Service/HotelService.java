package com.masai.Service;

import java.util.List;

import com.masai.Exception.HotelException;
import com.masai.model.Hotel;

public interface HotelService {
	public Hotel createHotel(Hotel hotel);
	public Hotel getHotelById(Integer id)throws HotelException;
	public List<Hotel> getAllHotels() throws HotelException;
	public Hotel deleteHotel(Integer id);
}
