package com.sathya.springboot.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
private String name;
private String email;
private long mobilenumber;
private String department;
private String jobtitle;
private double bsalary;
private String gender;
private String address;
private int experience;
private String dateofjoining;

}
