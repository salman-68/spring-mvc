package com.sathya.springboot.project3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationModel {
private String name;
private String password;
private long mobilenumber;
private String gender;
private String hobbies;
private String state;
private String qualification;
private String address;
}
