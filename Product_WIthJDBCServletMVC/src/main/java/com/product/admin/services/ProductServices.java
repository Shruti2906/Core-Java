package com.product.admin.services;

import java.util.List;

import com.product.admin.model.Product;

public interface ProductServices {

	String create(List<Product> lst);
	List<Product> retreiveProduct(int productId);
	List<Product> displayAll();
	String deleteProduct(int productId);
}
