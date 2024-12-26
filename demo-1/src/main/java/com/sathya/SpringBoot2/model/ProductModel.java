package com.sathya.SpringBoot2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
private String name;
private String brandy;
private String madeIn ;
private double price;
private int quantity;


}
