package net.prefixaut.deadalus.util;

import net.prefixaut.deadalus.styles.Style;

@FunctionalInterface
public interface IStyleConverter {
	
	public Style[] convertStyles(String data);
}