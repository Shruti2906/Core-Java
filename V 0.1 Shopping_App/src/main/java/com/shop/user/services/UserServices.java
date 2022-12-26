package com.shop.user.services;

import java.util.List;

import com.shop.admin.model.Product;

public interface UserServices {
	
	//String create(List<Product> lst);
	//List<Product> retreiveProduct(int productId);
	List<Product> displayAll();
	//String deleteProduct(int productId);
	List<Product> getProductById(int prodId);
}
