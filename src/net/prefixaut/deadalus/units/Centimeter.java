package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Centimeter implements AbsoluteSizeUnit {
	
	@Override
	public String definition(double amount) {
		return amount + "cm";
	}
	
	@Override
	public double key() {
		return 96 / 2.54;
	}
}