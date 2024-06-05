package com.oops.polymorphism.child;

public class Electronics extends Product  {

	private boolean battery;
	private boolean wireless;
	
	public Electronics(double price, String brand, boolean battery, boolean wireless) {
		super(price, brand);
		this.battery = battery;
		this.wireless = wireless;
	}
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	public boolean isBattery() {
		return battery;
	}
	public void setBattery(boolean battery) {
		this.battery = battery;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	@Override
	public String toString() {
		return "Electronics [battery=" + battery + ", wireless=" + wireless + "]";
	}
	
}
