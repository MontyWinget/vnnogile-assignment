package com.assignment.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignment.app.entities.Person;

@Repository
public class PersonDoa {

	@Autowired
	private SessionFactory sessionFactory;
	public void createPerson(Person person) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Integer id = (Integer)session.save(person);
			System.out.println("Record added with Id : " + id);
			System.out.println("Name: " + person.getName() + " Address: "  + person.getAddress() + " Date: " + person.getDob());
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
