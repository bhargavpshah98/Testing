package com.sjsu.hotelManagment_backend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long hotelId;

    @Column(nullable = false, length = 512)
    private String hotelName;

    @Column(name="hotelAddress",length = 512)
    private String hotelAddress;

    @Column(length = 512)
    private String city;

    @Column(length = 512)
    private String zipCode;

    @Column(length = 512)
    private float rating;

    @Column(length = 512)
    private int numberOfRooms;

    @Column(length = 512)
    private String hotelOverview;

}
