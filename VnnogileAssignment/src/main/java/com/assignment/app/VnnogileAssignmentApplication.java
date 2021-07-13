package com.assignment.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.app.entities.Person;

@SpringBootApplication
public class VnnogileAssignmentApplication implements CommandLineRunner{

	@Autowired
	private PersonDoa personDoa;
	public static void main(String[] args) {
		SpringApplication.run(VnnogileAssignmentApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Person person = getPerson();
		personDoa.createPerson(person);
	}
	
	private Person getPerson() {
		Person person = new Person();
		person.setName("Jack");
		person.setAddress("Kalyan");
		person.setDob(new Date());
		return person;
	}
}
