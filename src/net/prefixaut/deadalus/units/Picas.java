package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Picas implements AbsoluteSizeUnit {
	
	@Override
	public String getDefinition(double amount) {
		return amount + "pc";
	}
	
	@Override
	public double getKey() {
		return (96 / 72) * 12;
	}
}