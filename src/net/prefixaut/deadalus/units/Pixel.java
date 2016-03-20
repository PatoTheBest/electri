package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public final class Pixel implements AbsoluteSizeUnit {
	
	@Override
	public String definition(double amount) {
		return amount + "px";
	}
	
	@Override
	public double key() {
		return 1;
	}
}