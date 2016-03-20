package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Point implements AbsoluteSizeUnit {
	
	@Override
	public String definition(double amount) {
		return amount + "pt";
	}
	
	@Override
	public double key() {
		return 96 / 72;
	}
}