package com.caneroksuz;

public abstract class NormalLocation extends Location{

	public NormalLocation(Player player,String name) {
		super(player);
		this.name = name;
		
	}
	
	public boolean getLocation() {
		return true;
	}

}
