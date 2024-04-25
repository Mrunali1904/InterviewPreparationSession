package com.MainApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MainApp.Entity.Product;

import com.MainApp.Service.ProductService;


@RestController
public class MasterController {
	@Autowired
	private ProductService pService;
	
	
	//insert Product
	@PostMapping("/saveProduct")
	public String insertPro(@RequestBody Product pro) {
		pService.insertPro(pro);
		return "Product Inserted Successfully";
	}
	
	
	//read Product
	@GetMapping(value = "/readProducts")
	public List<Product> readAllProduct(){
		return pService.readPro();
	}
	
	
	//delete Product
	@DeleteMapping("/deleteProduct/{pid}")
	public String deletePro(@PathVariable int pid) {
		Product p=pService.getProduct(pid);
		if(p!=null) {
			pService.deletePro(pid);
			return "Product Deleted sucessfully";
		}
		else {
			return "Product Not Exist";
		}
		
	}
	//localhost:8081/deleteStudent/1
	
	
	@PutMapping("/updateProduct")
	public String updatePro(@RequestBody Product pro) {
		Product p=pService.getProduct(pro.getPid());
		if(p!=null) {
			pService.updatePro(pro);
			return "Updated successfully";
			
		}
		else {
			return "Product not Exist";
		}
		
	}
	
	@GetMapping("/getspecific/{pid}")
	public Product getProById(@PathVariable int pid) {

			return pService.getProById(pid);
	
	}
	
	

}
