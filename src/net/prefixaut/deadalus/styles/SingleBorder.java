package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

@SuppressWarnings("rawtypes")
interface SingleBorder<T extends SingleBorder> extends Style, Animatable<T>, Serializable {
	
	public Size width();
	public void width(Size width);
	public default void width(double width) {
		this.width(new Size(width));
	}
}