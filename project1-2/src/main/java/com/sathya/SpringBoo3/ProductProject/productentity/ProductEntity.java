package com.sathya.SpringBoo3.ProductProject.productentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String brand;
    private String madeIn;
    private double price;
    private int quantity;
    private double discountrate;
    private double taxrate;
    private double offerprice;
    private double finalprice;
    private double stockvalue;
    private double discountprice;

    // Method to calculate discount price
    public double calculateDiscountPrice() {
        this.discountprice = this.price * (this.discountrate / 100);
        return this.discountprice;
    }

    // Method to calculate final price after discount and tax
    public double calculateFinalPrice() {
        double discountedPrice = this.price - calculateDiscountPrice();
        this.finalprice = discountedPrice + (discountedPrice * (this.taxrate / 100));
        return this.finalprice;
    }

    // Method to calculate stock value
    public double calculateStockValue() {
        this.stockvalue = this.finalprice * this.quantity;
        return this.stockvalue;
    }

    // Method to calculate offer price (if applicable)
    public double calculateOfferPrice() {
        // Implement the logic for offer price calculation if needed
        // For now, we'll assume offer price is a percentage off the final price
        this.offerprice = this.finalprice - (this.finalprice * 0.1); // Assuming a 10% offer
        return this.offerprice;
    }
}
