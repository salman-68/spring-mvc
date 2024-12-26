package com.sathya.SpringBoo3.ProductProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.SpringBoo3.ProductProject.productmodel.ProductModel;
import com.sathya.SpringBoo3.ProductProject.service.ProductService;

@Controller
public class TestController {
	@Autowired
	ProductService productService;
@GetMapping("/product")
public String getForm() {
	return "product";
}
@PostMapping("/test")
public String postMethodName(ProductModel productModel) {
    
    System.out.println(productModel);
    return "success";
}

}
