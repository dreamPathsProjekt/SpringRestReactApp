package org.restreact.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Autowired
	public Employee findByFirstName(String firstName);
		
	
}
