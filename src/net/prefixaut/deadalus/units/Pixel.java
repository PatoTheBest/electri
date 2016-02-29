package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public final class Pixel implements AbsoluteSizeUnit {
	
	@Override
	public String getDefinition(double amount) {
		return amount + "px";
	}
	
	@Override
	public double getKey() {
		return 1;
	}
}