package com.sathya.SpringBoot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.SpringBoot2.model.ProductModel;

@Controller
public class TestController {
@GetMapping("/test")
public String gt() {
	return "myview";
}
}