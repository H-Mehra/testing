package com.infoobjects.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.infoobjects.ws.ParkingService")
public class ParkingServiceImpl implements ParkingService{
	
	@WebMethod
	public String addParkingSpot() {
		
		return "Added Parkin Spot";
	}
	

}
