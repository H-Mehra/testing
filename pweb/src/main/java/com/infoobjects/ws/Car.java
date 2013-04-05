package com.infoobjects.ws;
public class Car {

	private String licensePlate;

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Car(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}

}
