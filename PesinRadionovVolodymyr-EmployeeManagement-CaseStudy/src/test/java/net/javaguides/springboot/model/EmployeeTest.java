package net.javaguides.springboot.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee test=new Employee();

	@Test
	void testGetId() {
		long Expectedfirstname=test.getId();
		String Actualfirstname="D1234" ;
		assertNotEquals(Expectedfirstname,Actualfirstname);
	
	}

	@Test
	void testGetFirstName() {
		String Expectedfirstname=test.getFirstName();
		String Actualfirstname="Volodymyr" ;
		assertNotEquals(Expectedfirstname,Actualfirstname);

	}

	@Test
	void testGetLastName() {
		String ExpectedLastName=test.getLastName();
		String ActualLastName="Pesin" ;
		assertNotEquals(ExpectedLastName,ActualLastName);

	}

	@Test
	void testGetEmail() {
			String ExpectedEmail=test.getEmail();
			String ActualEmail="radionov7888@gmail.com" ;
			assertNotEquals(ExpectedEmail, ActualEmail);
	}

}
