package com.sathya.SpringBoo3.ProductProject.productmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
private String name;
private String brand;
private String madeIn;
private double price;
private int quantity;
private double discountrate;
}
