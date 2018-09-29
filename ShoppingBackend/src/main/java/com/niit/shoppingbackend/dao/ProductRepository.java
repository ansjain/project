package com.niit.shoppingbackend.dao;

import java.util.List;

import com.niit.shoppingbackend.model.Product;

public interface ProductRepository {
	public boolean addProduct(Product Product);
	public boolean updateProduct(Product Product);
	public boolean deleteProduct(int ProductId);
	public List<Product> getAllProduct();
	public Product getProductById(int ProductId);
	
}



