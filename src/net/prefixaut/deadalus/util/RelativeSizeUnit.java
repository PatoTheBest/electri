package net.prefixaut.deadalus.util;

import net.prefixaut.deadalus.SizeUnit;

public interface RelativeSizeUnit extends SizeUnit {
	
	@Override
	public default boolean relative() {
		return false;
	}
	
	public void setRelation(double relation);
	
	public double getRaltion();
}