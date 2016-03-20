package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.AbsoluteSizeUnit;

public class Picas implements AbsoluteSizeUnit {
	
	@Override
	public String definition(double amount) {
		return amount + "pc";
	}
	
	@Override
	public double key() {
		return (96 / 72) * 12;
	}
}