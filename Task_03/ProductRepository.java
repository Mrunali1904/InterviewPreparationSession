package com.MainApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.MainApp.Entity.Product;


public interface ProductRepository extends CrudRepository<Product, Integer>{
	public Product findById(int pid);
}
