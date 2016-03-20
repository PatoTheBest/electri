package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Millimeter implements AbsoluteSizeUnit {
	
	@Override
	public String definition(double amount) {
		return amount + "mm";
	}
	
	@Override
	public double key() {
		return (96 / 2.54) * 10;
	}
}