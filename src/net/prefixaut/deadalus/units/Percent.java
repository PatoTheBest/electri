package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.RelativeSizeUnit;

public class Percent implements RelativeSizeUnit {
	
	private Percent() {}
	
	public static Percent PERCENT = new Percent();
	
	@Override
	public String definition(double amount) {
		return amount + "%";
	}
	
	@Override
	public double key() {
		return 1;
	}
	
	@Override
	public void setRelation(double relation) {}
	
	@Override
	public double getRaltion() {
		return 1;
	}
}