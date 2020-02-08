package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.howtodoinjava.demo.model.Employee;


@RestController
public class EmployeeController {

	@RequestMapping("/")
	public List<Employee> getEmployees(){
		
		
		List<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(new Employee(1,"Lokesh","gupta","howtodo@gmail.com"));
		return EmployeeList;
		
	}
}