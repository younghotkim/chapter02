package com.javaex.ex08;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	///////////////////////////////////////////////////

	public TV() {

	}
	///////////////////////////////////////////////////

	public TV(int channel, int volume, boolean power) {

		this.channel = channel;
		this.volume = volume;
		this.power = power;

	}

	/////////////////////////////////////////////////
	public int getChannel() {

		return channel;

	}

	public int getVolume() {

		return volume;

	}

	public boolean getPower() {

		return power;
		
	}


	public void status() {

		System.out.println("Channel: " + channel);
		System.out.println("Volume: " + volume);
		System.out.println("Power: " + power);
		System.out.println("===================");

	}

	public void power(boolean on) {
		
	if (on==true) {
		this.power = true;
	} else {
		this.power = false;
	}
		

	}

	public void channel (int channel) {
		
		this.channel = channel;
		if (channel>256) {
			this.channel = 255;
		} else if (channel<1) {
			this.channel = 1;
		}
	}
	
	
	public void channel (boolean up) {
		if(up==true && channel < 256) {
		this.channel += 1;
		} else if (up==false) {
			this.channel -= 1;		}
		
	}
	
	public void volume (int volume) {
		
		this.volume = volume;
		if (volume < 0 ) {
			this.volume = 0;
		} else if (volume > 100) {
			this.volume = 100;
		}
	}
	
	public void volume (boolean up) {
		
		if(up==true && volume < 100) {
			this.volume = volume+1;
		}
		else if (up==false) {
			this.volume = volume-1;
		}
	}

			
}
