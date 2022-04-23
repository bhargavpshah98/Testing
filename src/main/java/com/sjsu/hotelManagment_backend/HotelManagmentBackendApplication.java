package com.sjsu.hotelManagment_backend;

import com.sjsu.hotelManagment_backend.dao.HotelRepository;
import com.sjsu.hotelManagment_backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class HotelManagmentBackendApplication implements CommandLineRunner {

	@Autowired
	public HotelService hotelService;

	@Autowired
	private HotelRepository hotelRepo;

	public static void main(String[] args) {
		SpringApplication.run(HotelManagmentBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("APP STARTED. . . ");
		int selection = 0;
		while(selection<8){
			Scanner input = new Scanner(System.in);
			selection = input.nextInt();
			switch (selection){
				case 1:
					System.out.println("findByHotelId : add hotel id");
					long i =input.nextLong();
					System.out.println(hotelRepo.findHotelByHotelId(i));
					break;
				case 2:
					System.out.println("fetching id 1");
					long id =input.nextLong();
					System.out.println(hotelRepo.findHotelByHotelId(id));
					long j =1;
					break;
				case 3:
					System.out.println("Please enter amount");
					long k =1;
					break;
				default:
					System.out.println("Default");
					break;
			}
		}

	}
}