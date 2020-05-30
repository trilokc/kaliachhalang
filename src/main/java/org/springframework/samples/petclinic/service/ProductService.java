package org.springframework.samples.petclinic.service;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	
	
	List<Product> getAllProducts() { 
		
		return null; 
	}
	
	Product getproductByName(String name) {
		
		return null; 
	}
	
	Product getProductById(int id) { 
		
		return new Product(); 
	}
	
	List<Product> getCheapestProduct(double price) { 
		
		return new ArrayList(); 
	}
	
	List<Product> getCheapestProduct() { 
		
		return new ArrayList(); 
	}

}

class Product { }
