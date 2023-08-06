package com.masai.repo;

import java.util.List;

import com.masai.model.Reservation;

public abstract class ReservationRepository {

	public Reservation save(Reservation reservation) {
		return null;
	}

	public List<Reservation> findByUserId(int userId) {
		return null;
	}

	public Object findById(int reservationId) {
		return null;
	}

}
