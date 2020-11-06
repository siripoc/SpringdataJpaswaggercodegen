package com.seshu.springdata.employeeedata.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.seshu.springdata.employeeedata.entities.Employeee;

public interface EmployeeeRepository extends CrudRepository<Employeee, Integer> {

	List<Employeee> findBylastname(String lastname);

	List<Employeee> findBydob(Date dob);
	
	List<Employeee> findBygender(char gender);

}
