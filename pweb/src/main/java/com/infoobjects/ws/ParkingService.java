package com.infoobjects.ws;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(style = Style.RPC)
@WebService
public interface ParkingService {
	@WebMethod
	public String addParkingSpot() ;
	
}
