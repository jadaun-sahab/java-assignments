package com.masai.Service;

import java.util.List;
import com.masai.model.Room;
import com.masai.model.RoomType;


public interface RoomService {

	public Room createRoom(Room room);
	public Room getRoomById(int id)throws RuntimeException ;
	public List<Room> getAllRoom()throws RuntimeException ;
	public void deleteRoom(int id);
	public RoomType createRoom(RoomType roomTypeDto);
}
