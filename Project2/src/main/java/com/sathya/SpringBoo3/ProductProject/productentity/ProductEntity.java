package com.sathya.SpringBoo3.ProductProject.productentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table used to change the table name 
@Table(name = "Product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String brand;
    private String madeIn;
    private double price;
   
    private int quantity;
    @Column(name = "DR")
    private double discountrate;
    private double offerprice;
    private double taxprice;
    private double finalprice;
    private double stockvalue;
    private double discountprice;
}
