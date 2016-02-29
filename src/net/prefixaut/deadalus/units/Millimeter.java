package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Millimeter implements AbsoluteSizeUnit {
	
	@Override
	public String getDefinition(double amount) {
		return amount + "mm";
	}
	
	@Override
	public double getKey() {
		return (96 / 2.54) * 10;
	}
}