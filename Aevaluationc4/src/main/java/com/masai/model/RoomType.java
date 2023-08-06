package com.masai.model;

import java.util.List;

public enum RoomType {

	SINGLE("SINGLE"),
	DOUBLE("DOUBLE"),
	DELUXE("DELUXE"),
	PREMIUM("PREMIUM");
	private String value;
	
	RoomType(String value){
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public Integer getRoomId() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookings() {
		// TODO Auto-generated method stub
		return null;
	}
}