package net.prefixaut.deadalus.styles;

import net.prefixaut.deadalus.Image;

public interface ImageFilter extends Style, Animatable<ImageFilter> {
	
	public Image convert(Image image);
}