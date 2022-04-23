package com.sjsu.hotelManagment_backend.controller;


import com.sjsu.hotelManagment_backend.model.Hotel;
import com.sjsu.hotelManagment_backend.service.HotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("*")

public class HotelController {

    private final HotelService hotelService;
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getUserProfiles() {
        return ResponseEntity.ok().body(hotelService.getAllHotels());
    }

    @GetMapping(path = "/getHotelById")
    public ResponseEntity<Hotel> getHotelById(@RequestParam("hotelId") Long hotelId) {
        return ResponseEntity.ok().body(hotelService.getHotelById(hotelId));
    }

    @GetMapping(path = "/getHotelsByCity")
    public ResponseEntity<List<Hotel>> getHotelByCity(@RequestParam("city") String city) {
        return ResponseEntity.ok().body(hotelService.getHotelByCity(city));
    }

    @GetMapping(path = "/getHotelsByZipCode")
    public ResponseEntity<List<Hotel>> getHotelByZipCode(@RequestParam("zipCode") String zipCode) {
        return ResponseEntity.ok().body(hotelService.getHotelByZipCode(zipCode));
    }

    @DeleteMapping(path="/deleteHotel")
    public ResponseEntity<Boolean> deleteHotel(@RequestParam("hotelId") Long hotelId) {
        hotelService.deleteHotel(hotelId);
        return  ResponseEntity.ok().body(true);
    }

    @PostMapping(path="/insertHotel")
    public ResponseEntity<Hotel> insertHotel(@RequestBody Hotel hotel){
        return ResponseEntity.ok().body(hotelService.insertHotel(hotel));
    }

}
