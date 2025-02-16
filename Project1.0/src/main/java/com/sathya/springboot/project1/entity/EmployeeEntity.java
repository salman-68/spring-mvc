package com.sathya.springboot.project1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Emplpoyee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
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
	private String IncMonth;
	private double bonus;
	private double tax;
	private double pf;
	private double incentives;
	private double totalsalary;
}
