package com.niit.shoppingbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class Product {
	@Id   //primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ProductId;
	private String ProductName;
	private String ProductDescription;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int ProductId) {
		this.ProductId = ProductId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String ProductDescription) {
		this.ProductDescription = ProductDescription;
	}
	
	
	
	
	
	
	

}
