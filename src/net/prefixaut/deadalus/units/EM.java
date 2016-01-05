package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.support.FontSupport;
import net.prefixaut.deadalus.util.RelativeSizeUnit;

public final class EM implements RelativeSizeUnit {
	
	private double relation = 16;
	
	public EM() {}
	
	public EM(double relation) {
		this.relation = relation;
	}
	
	public EM(FontSupport parent) {
		this.relation = parent.getFontSize().unit().convertToPixel(parent.getFontSize());
	}
	
	@Override
	public String getDefinition(double amount) {
		return amount + "em";
	}
	
	@Override
	public double getKey() {
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