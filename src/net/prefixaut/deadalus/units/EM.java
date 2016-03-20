package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.util.RelativeSizeUnit;

public final class EM implements RelativeSizeUnit {
	
	private double relation = 16;
	
	public EM() {}
	
	public EM(double relation) {
		this.relation = relation;
	}
	
	@Override
	public String definition(double amount) {
		return amount + "em";
	}
	
	@Override
	public double key() {
		return relation;
	}
	
	@Override
	public void setRelation(double relation) {
		this.relation = relation;
	}
	
	@Override
	public double getRaltion() {
		return this.relation;
	}
}