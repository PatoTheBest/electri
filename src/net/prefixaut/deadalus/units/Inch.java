package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Inch implements AbsoluteSizeUnit {
	
	@Override
	public String getDefinition(double amount) {
		return amount + "in";
	}
	
	@Override
	public double getKey() {
		return 96;
	}
}