package com.MainApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MainApp.Entity.Product;

import com.MainApp.Repository.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	public void insertPro(Product p) {
		pRepo.save(p);
	}
	
	public List<Product> readPro(){
		return (List<Product>) pRepo.findAll();
	}
	
	public void deletePro(int pid) {
		pRepo.deleteById(pid);
		
	}
	
	public void updatePro(Product p) {
		pRepo.save(p);
		
	}
	public Product getProduct(int pid) {
		return pRepo.findById(pid);
	}
	
	public Product getProById(int pid) {
		return pRepo.findById(pid);
		
	}

}
