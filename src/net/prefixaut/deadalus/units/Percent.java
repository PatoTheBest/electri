package net.prefixaut.deadalus.units;

import net.prefixaut.deadalus.Component;
import net.prefixaut.deadalus.util.RelativeSizeUnit;

public class Percent implements RelativeSizeUnit {
	
	private double relation;
	private byte defID = 0;
	
	
	
	public Percent(Component parent, boolean useHeight) {
		if (!useHeight) relation = parent.getWidth().getUnit().convertToPixel(parent.getWidth());
		else relation = parent.getHeight().getUnit().convertToPixel(parent.getHeight());
	}
	
	public Percent(double relation) {
		this.relation = relation;
	}
	
	@Override
	public String getDefinition(double amount) {
		return amount + "%";
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