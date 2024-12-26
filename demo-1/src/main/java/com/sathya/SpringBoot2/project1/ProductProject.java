package com.sathya.SpringBoot2.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.SpringBoot2.model.ProductModel;

public class ProductProject {
@GetMapping("/pro")
public String greet() {
	return "add-product";
}
@PostMapping("/save Product")
public String meet(ProductModel productModel) {
	System.out.println(productModel);
	return "Success";
}
}
