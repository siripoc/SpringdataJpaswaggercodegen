package com.seshu.springdata.employeeedata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seshu.springdata.employeeedata.entities.Employeee;
import com.seshu.springdata.employeeedata.repos.EmployeeeRepository;

@RestController
public class EmployeeeController {
	@Autowired
	EmployeeeRepository employeeerepository;

	// READ
	@RequestMapping(value = "/employeees/", method = RequestMethod.GET)
	public List<Employeee> getEmployeees() {
		return (List<Employeee>) employeeerepository.findAll();
	}

	// CREATE
	@RequestMapping(value = "/employeees/", method = RequestMethod.POST)
	public Employeee createEmployeee(Employeee employeee) {
		return employeeerepository.save(employeee);
	}

	// UPDATE
	@RequestMapping(value = "/employeees/", method = RequestMethod.PUT)
	public Employeee updateEmployeee(Employeee employeee) {
		return employeeerepository.save(employeee);
	}

	// DELETE
	@RequestMapping(value = "/employeees/{id}", method = RequestMethod.DELETE)
	public void deleteEmployeee(@PathVariable("id") int id) {
		employeeerepository.deleteById(id);
	}

}
