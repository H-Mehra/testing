package com.infoobjects.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class ParkingServiceClient {

	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://127.0.0.1:9876/parking?wsdl");
			QName qname = new QName("http://ws.infoobjects.com/","ParkingServiceImplService");
		Service service = Service.create(url,qname);
		ParkingService eif = service.getPort(ParkingService.class);
		System.out.println(eif.addParkingSpot());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
