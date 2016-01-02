package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Centimeter implements AbsoluteSizeUnit {
	
	@Override
	public String getDefinition(double amount) {
		return amount + "cm";
	}
	
	@Override
	public double getKey() {
		return 96 / 2.54;
	}
}