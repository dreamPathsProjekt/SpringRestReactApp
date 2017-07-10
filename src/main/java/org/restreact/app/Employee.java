package org.restreact.app;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	
	



	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String firstName;
	private String lastName;
	private String description;

	private Employee() {
		
	}

	public Employee(String firstName, String lastName, String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
	
	
	

}
