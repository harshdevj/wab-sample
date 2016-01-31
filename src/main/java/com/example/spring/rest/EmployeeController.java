package com.example.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring.model.Employee;

//@Controller
//@RequestMapping("/employees")
public class EmployeeController {

	Employee employee = new Employee();

	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Employee getEmployeeInJSON(@PathVariable String name) {

		employee.setName(name);
		employee.setEmail("employee1@genuitec.com");

		return employee;

	}

	@RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
	public @ResponseBody Employee getEmployeeInXML(@PathVariable String name) {

		employee.setName(name);
		employee.setEmail("employee1@genuitec.com");

		return employee;

	}

}