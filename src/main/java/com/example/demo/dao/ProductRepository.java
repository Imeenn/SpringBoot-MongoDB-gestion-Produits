package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;

public interface ProductRepository  extends MongoRepository<Product, String>{

}
