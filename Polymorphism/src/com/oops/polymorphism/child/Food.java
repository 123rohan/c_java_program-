package com.oops.polymorphism.child;

public class Food extends Product {
		private String expDate;
		private boolean veg;
		
		
		public Food(double price, String brand, String expDate, boolean veg) {
			super(price, brand);
			this.expDate = expDate;
			this.veg = veg;
		}
		public Food() {
			// TODO Auto-generated constructor stub
		}
		public String getExpDate() {
			return expDate;
		}
		public void setExpDate(String expDate) {
			this.expDate = expDate;
		}
		public boolean isVeg() {
			return veg;
		}
		public void setVeg(boolean veg) {
			this.veg = veg;
		}
		@Override
		public String toString() {
			return "Food [expDate=" + expDate + ", veg=" + veg + "]";
		}
		
		
		
}
