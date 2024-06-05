package com.oops.polymorphism.child;

public class Product {

	
	private double price;
	private String brand;
	public Product(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", brand=" + brand + "]";
	}
}
