package com.seshu.springdata.employeeedata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.seshu.springdata.employeeedata.entities.Employeee;
import com.seshu.springdata.employeeedata.repos.EmployeeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeedataApplicationTests {

	@Autowired
	EmployeeeRepository employeeerepository;

	@Test
	void contextLoads() {
	}

	// Create
	@Test
	public void testCreate() {
		Employeee e1 = new Employeee();
		e1.setId(1);
		e1.setFirstname("seshumani");
		e1.setLastname("s");
		e1.setDob(new Date());
		e1.setGender('f');

		employeeerepository.save(e1);
	}

	// Read
	@Test
	public void testRead() {
		Employeee e1 = employeeerepository.findById(1).get();
		assertNotNull(e1);
		assertEquals("seshumani", e1.getFirstname());
		System.out.println("-----------" + e1.getFirstname());
	}

	// Update
	@Test
	public void testUpdate() {
		Employeee e1 = employeeerepository.findById(1).get();
		e1.setLastname("sayani");
		employeeerepository.save(e1);

	}

	// Delete
	@Test
	public void testDelete() {
		if (employeeerepository.existsById(1)) {
			System.out.println("deleting...");
			employeeerepository.deleteById(1);
		}

	}

	// Find by Lastname
	@Test
	public void testfindBylastname() {
		List<Employeee> emps = employeeerepository.findBylastname("mani");
		emps.forEach(e -> System.out.println(e.getGender()));
	}

	// Find by dob
	@Test
	public void testfindBydob() {
		List<Employeee> emps = employeeerepository.findBydob(new Date());
		emps.forEach(e -> System.out.println(e.getFirstname()));
	}

	// Find by gender
	@Test
	public void testfindBygender() {
		List<Employeee> emps = employeeerepository.findBygender('m');
		emps.forEach(e -> System.out.println(e.getFirstname()));
	}

}
