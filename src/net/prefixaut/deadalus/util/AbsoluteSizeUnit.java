package net.prefixaut.deadalus.util;

import net.prefixaut.deadalus.SizeUnit;

public interface AbsoluteSizeUnit extends SizeUnit {
	
	@Override
	public default boolean isRelative() {
		return true;
	}
}