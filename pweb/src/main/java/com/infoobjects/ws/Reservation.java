package com.infoobjects.ws;

import java.util.Date;

public class Reservation {

	private int id;
	private String licensePlate;
	private int spotId;
	private Date checkinTime;
	private Date checkoutTime;
	public void setId(int id) {
		this.id = id;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}
	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}
	public void setCheckoutTime(Date checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	public Reservation(int id, String licensePlate, int spotId,
			Date checkinTime, Date checkoutTime) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
		this.spotId = spotId;
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
	}
	
	
	
}
