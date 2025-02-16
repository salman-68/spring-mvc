package com.sathya.springboot.project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springboot.project1.entity.EmployeeEntity;
import com.sathya.springboot.project1.model.EmployeeModel;
import com.sathya.springboot.project1.repo.EmployeeRepository;
@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;	
public void savedData(EmployeeModel employeeModel) {
	double tax;
	tax=employeeModel.getBsalary()*0.20;
	double bonus;
	bonus=employeeModel.getBsalary()*0.25;
	double pf;
	pf=employeeModel.getBsalary()*0.12;
	double incentives;
	incentives=employeeModel.getBsalary()*0.1;
	double totalsalary;
	totalsalary=employeeModel.getBsalary()+pf+incentives-tax;
	String IncMonth;
	IncMonth="April";
	
	EmployeeEntity employeeEntity=new EmployeeEntity();
	employeeEntity.setName(employeeModel.getName());
	employeeEntity.setEmail(employeeModel.getEmail());
	employeeEntity.setAddress(employeeModel.getAddress());
	employeeEntity.setDateofjoining(employeeModel.getDateofjoining());
	employeeEntity.setDepartment(employeeModel.getDepartment());
	employeeEntity.setExperience(employeeModel.getExperience());
	employeeEntity.setGender(employeeModel.getGender());
	employeeEntity.setMobilenumber(employeeModel.getMobilenumber());
	employeeEntity.setBsalary(employeeModel.getBsalary());
	employeeEntity.setJobtitle(employeeModel.getJobtitle());
	employeeEntity.setIncentives(incentives);
	employeeEntity.setBonus(bonus);
	employeeEntity.setPf(pf);
	employeeEntity.setTax(tax);
	employeeEntity.setIncMonth(IncMonth);
	employeeEntity.setTotalsalary(totalsalary);
employeeRepository.save(employeeEntity);
	
}
public List<EmployeeEntity> getallemployees() {
	return employeeRepository.findAll();
}
}


