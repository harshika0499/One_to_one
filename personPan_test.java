package com.mapping.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mappi.dto.Pancard;
import com.mappi.dto.Person;

public class personPan_test
{

		public void insertvalue() 
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Harshika");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Person person = new Person();
			person.setId(1);
			person.setName("Anupama");
			
			 Pancard pan =new Pancard();
		        pan.setId(1);
				pan.setPno("due848sd");
				pan.setDob("04/06/1999");
				
			
			et.begin();
			em.persist(pan);
			et.commit();
			
			System.out.println("data saved ");
			
		}
		public void getvalue() 
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Harshika");
			EntityManager entityManager = entityManagerFactory.createEntityManager();

			Person  p=entityManager.find(Person.class,1);
			System.out.println(p);
		}
		
		
		public void deletevalue()
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Harshika");
			 EntityManager em=emf.createEntityManager();
			 EntityTransaction et=em.getTransaction();
				Person person = em.find(Person.class, 1);
				et.begin();
				em.persist(person);
				et.commit();
				System.out.println("deleted successfully");
			}
		
		
		
}
