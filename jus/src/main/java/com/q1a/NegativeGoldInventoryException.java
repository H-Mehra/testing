package com.q1a;

public class NegativeGoldInventoryException extends Exception {
	public NegativeGoldInventoryException(){
		System.out.println("We do not have enough gold!!");
	}
}
