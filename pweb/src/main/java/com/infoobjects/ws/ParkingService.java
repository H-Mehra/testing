package com.infoobjects.ws;

@WebService
public class ParkingService {

	public boolean addParkingSpot(int spotId) {

		ParkingSpot spot = new ParkingSpot(spotId);

		return true;

	}

	public ParkingSpot getParkingSpot(int spotId) {
          return new ParkingSpot(spotId);
	}

	public void deleteSpot(int spotId) {

	}
}
