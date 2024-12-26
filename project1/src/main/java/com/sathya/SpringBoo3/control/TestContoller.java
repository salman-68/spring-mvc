package com.sathya.SpringBoo3.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.SpringBoo3.Product.ProductModel;
 

@Controller
public class TestContoller{
	@GetMapping("/proj")
	public String showProduct() {
		return "product";
	}
	@PostMapping("/SaveProduct")
	public String sendDetails(ProductModel productModel) {
		System.out.println(productModel);
		return "success";
	}
	
	
	}

