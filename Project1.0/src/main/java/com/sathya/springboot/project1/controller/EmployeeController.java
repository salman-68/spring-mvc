package com.sathya.springboot.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.springboot.project1.entity.EmployeeEntity;
import com.sathya.springboot.project1.model.EmployeeModel;
import com.sathya.springboot.project1.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
@GetMapping("/employee")
public String getform() {
	
	return "form";
}
@PostMapping("submit")
public String sendData(EmployeeModel employeeModel) {
 employeeService.savedData(employeeModel);
	return "success";
}
@GetMapping("/getallemployees")
public String getallproducts(Model model) {
	List<EmployeeEntity> employee=employeeService.getallemployees();
	model.addAttribute("Employee", employee);
	return "Employee-list";
}
}
