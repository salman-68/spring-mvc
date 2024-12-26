package com.sathya.SpringBoo3.ProductProject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.sathya.SpringBoo3.ProductProject.productmodel.ProductModel;

@Controller
public class ModelClass {

    @GetMapping("/testy")
    public String getData() {
        return "pro"; // Ensure this matches your HTML file name without the extension
    }

    @PostMapping("/test")
    public String sendData(ProductModel productModel) {
        System.out.println(productModel);
        return "success";
    }
}
