package com.sathya.SpringBoo3.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
private String name;
private String department;
private double salary;
private String gender;
private int experience;
private String address;
}
