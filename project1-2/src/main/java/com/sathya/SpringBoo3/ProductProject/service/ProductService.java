package com.sathya.SpringBoo3.ProductProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.SpringBoo3.ProductProject.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
ProductRepository productRepository;

}
