package com.niit.shoppingbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.niit.shoppingbackend.model.Product;

@Repository
@Transactional

public class ProductRepositoryImpl implements ProductRepository{
	public boolean addProduct(Product Product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProduct(Product Product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProduct(int ProductId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProductById(int ProductId) {
		// TODO Auto-generated method stub
		return null;
	}

}
