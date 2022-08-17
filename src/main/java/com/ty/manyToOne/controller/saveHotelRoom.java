package com.ty.manyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Hotel;
import com.ty.manyToOne.dto.Room;

public class saveHotelRoom {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Hotel hotel = new Hotel();
		Hotel hotel2 = new Hotel();

		hotel.setName("Taj West End");
		hotel.setAddress("Bangalore");
		

		hotel2.setName("Maruthi");
		hotel2.setAddress("Malleshwarm");

		Room room1 = new Room();
        room1.setCapacity(145);
		room1.setType("AC");
		room1.setHotel(hotel);

		Room room2 = new Room();
		room2.setCapacity(123);
		room2.setType("Non AC");
		room2.setHotel(hotel);

		Room room3 = new Room();
		room3.setCapacity(150);
		room3.setType("Delux");
		room3.setHotel(hotel);
		
		Room room4 = new Room();
        room4.setCapacity(165);
		room4.setType("DoubleDeluxAC");
		room4.setHotel(hotel2);
		
		Room room5 = new Room();
		room5.setCapacity(155);
		room5.setType("Normal");
		room5.setHotel(hotel2);


		transaction.begin();
		manager.persist(hotel);
		manager.persist(room1);
		manager.persist(room2);
		manager.persist(room3);
		manager.persist(hotel2);
		manager.persist(room4);
		manager .persist(room5);
		transaction.commit();

	}

}
