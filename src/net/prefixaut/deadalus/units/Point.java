package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Point implements AbsoluteSizeUnit {
	
	@Override
	public String getDefinition(double amount) {
		return amount + "pt";
	}
	
	@Override
	public double getKey() {
		return 96 / 72;
	}
}