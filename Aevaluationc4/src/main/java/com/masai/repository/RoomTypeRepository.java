package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Hotel;
import com.masai.model.RoomType;

public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> {
    List<RoomType> findByHotel(Hotel hotel);
}

