package com.lcwd.hotel.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setHotelid(hotelId);
		
		return hotelRepository.save(hotel);
	}
	
	public Hotel getHotel(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id is not found on server !! "+hotelId));
	}
	
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}
}
