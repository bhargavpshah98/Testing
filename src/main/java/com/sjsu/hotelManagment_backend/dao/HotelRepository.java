package com.sjsu.hotelManagment_backend.dao;

import com.sjsu.hotelManagment_backend.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

    Hotel findHotelByHotelId(Long id);

    List<Hotel> findHotelByCity(String city);

    List<Hotel> findHotelByZipCode(String zipCode);

    List<Hotel> findAll();
//    @Query(value="select * from Hotels where hotel_id= :hotelId", nativeQuery = true)
//    Hotel findByHotelId(@Param("hotelId") Long hotelId);

//    @Query(value="select * from Hotels", nativeQuery = true)
//    List<Hotel> getAllHotels();



//    @Query(value="select * from Hotels where city= :city", nativeQuery = true)
//    List<Hotel> findByCity(@Param("city") String city);
    Integer deleteHotelsByHotelId(Long id);
}
