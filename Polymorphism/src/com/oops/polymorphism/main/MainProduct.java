package com.oops.polymorphism.main;

import com.oops.polymorphism.child.Electronics;
import com.oops.polymorphism.child.Food;
import com.oops.polymorphism.child.Product;

public class MainProduct {

public static void main(String[] args) {
	Product product=new Product();
	Electronics charger=new Electronics();
	Food milk=new Food();
	
	charger.setBrand("mi");
	charger.setPrice(100.0);
	charger.setBattery(false);
	charger.setWireless(false);
	
	milk.setBrand(null);
	milk.setPrice(0);
	milk.setExpDate("06-06-2024");
	milk.setVeg(true);
	
	System.out.println(product.ge);
}
}
