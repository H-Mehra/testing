package com.q1a;

public class Treasury {

	private long noOfGoldBricks;
	
	public Treasury(long noOfGoldBricks)
	{
		this.noOfGoldBricks=noOfGoldBricks;
	}
	public long addGold(long noOfBricks) {
		this.noOfGoldBricks += noOfBricks;
		return this.noOfGoldBricks;
	}

	public long removeGold(long noOfBricks) {
		this.noOfGoldBricks -= noOfBricks;
		return this.noOfGoldBricks;
	}

	public long getGold() {
		return this.noOfGoldBricks;
	}

}
