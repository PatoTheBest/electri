package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Inch implements AbsoluteSizeUnit {
	
	@Override
	public String definition(double amount) {
		return amount + "in";
	}
	
	@Override
	public double key() {
		return 96;
	}
}