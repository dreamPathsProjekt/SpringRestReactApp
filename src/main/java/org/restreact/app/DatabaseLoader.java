package org.restreact.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{
	
	private final EmployeeRepository repository;

	
	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		//super();
		this.repository = repository;
	}



	@Override
	public void run(String... arg0) throws Exception {
		Employee dummyEmployee = new Employee("Ioannis", "Dritsas", "Full-Suck Developer");
		this.repository.save(dummyEmployee);
		
	}

}
