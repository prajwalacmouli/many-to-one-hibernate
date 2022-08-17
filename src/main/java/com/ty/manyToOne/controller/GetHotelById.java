package com.ty.manyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Hotel;
import com.ty.manyToOne.dto.Room;

public class GetHotelById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
//		
//		Room room = manager.find(Room.class, 1);
//		System.out.println(room);
		
		Hotel hotel = manager.find(Hotel.class, 1);
		System.out.println(hotel);
	}

}
