package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.Image;
import net.prefixaut.deadalus.css.Style;

public interface ImageFilter extends Style, Animatable<ImageFilter> {
	
	public Image applyFilterTo(Image image);
}