package com.sathya.SpringBoo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.SpringBoo3.employee.Employee;

@Controller
public class TestyControl {
@GetMapping("/testy")
public String getData() {
	return "emp";
}
@PostMapping("saveEmployee")
public String sendData(Employee employee) {
	System.out.println(employee);
	return "success";
}
}
