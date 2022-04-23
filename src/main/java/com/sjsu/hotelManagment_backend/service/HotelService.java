package com.sjsu.hotelManagment_backend.service;

import com.sjsu.hotelManagment_backend.dao.HotelRepository;
import com.sjsu.hotelManagment_backend.model.Hotel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class HotelService {

    @Autowired
    private final HotelRepository hotelRepo;

    public void saveHotel(Hotel hotel) {
        log.info("Saving new hotel to the database {} " , hotel.getHotelName());
        hotelRepo.save(hotel);
    }

    public List<Hotel> getHotelByCity(String city){
        return hotelRepo.findHotelByCity(city);
    }
    public List<Hotel> getHotelByZipCode(String zipCode){
        return hotelRepo.findHotelByZipCode(zipCode);
    }

    public Hotel getHotelById(Long id) {
        return hotelRepo.findHotelByHotelId(id);
    }

    public List<Hotel> getAllHotels() {
        log.info("get user by email {} ","adsd" );
        return hotelRepo.findAll();
    }

    public Integer deleteHotel(Long hotelId){
        return hotelRepo.deleteHotelsByHotelId(hotelId);
    }

    public Hotel insertHotel(Hotel hotel){
        return hotelRepo.save(hotel);
    }

}
