package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import com.javainuse.model.Employee;

@RestController
public class TestController {

	@Value("${USERHELLO}")
		String user_hello;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp2");
		emp.setDesignation("ceo");
		emp.setEmpId("2");
		emp.setSalary(6000);
		emp.setMotto(user_hello);
		
		return emp;
	}

}