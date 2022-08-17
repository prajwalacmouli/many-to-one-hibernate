package com.ty.manyToOne.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manyToOne.dto.Product;
import com.ty.manyToOne.dto.Review;

public class TestSaveReview {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Product p1 = new Product();
		p1.setName("Pixel");
		p1.setBrand("Google");
		p1.setCost(63000);

		Product p2 = new Product();
		p2.setName("AirBuds");
		p2.setBrand("Baot");
		p2.setCost(3000);

		Review r1 = new Review();
		r1.setUserName("Riya");
		r1.setDescription("Good Phone");
		r1.setProduct(p1);

		Review r2 = new Review();
		r2.setUserName("Rajesh");
		r2.setDescription("Nice Camera");
		r2.setProduct(p1);

		Review r3 = new Review();
		r3.setUserName("Kiran");
		r3.setDescription("Good Sound");
		r3.setProduct(p2);

		Review r4 = new Review();
		r4.setUserName("Anil");
		r4.setDescription("Type C Interface and Mic");
		r4.setProduct(p2);

		transaction.begin();
		manager.persist(r4);
		manager.persist(r3);
		manager.persist(r2);
		manager.persist(r1);
		manager.persist(p2);
		manager.persist(p1);
		transaction.commit();

		System.out.println("Done!!!!");

	}

}
