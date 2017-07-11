package org.restreact.app;

import javax.persistence.Entity;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	
	public Employee() {
		
	}



	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String firstName;
	private String lastName;
	private String description;



	
	
	

}
