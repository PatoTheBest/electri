package net.prefixaut.deadalus;

import net.prefixaut.prelib.Loadable;
import net.prefixaut.prelib.Saveable;

public interface Image extends Loadable, Saveable {
	
	public int width();
	public void width(int width);
	
	public int height();
	public void height(int height);
	
	public Color pixel(int x, int y);
	public Color[][] pixels(int xFrom, int yFrom, int xTo, int yTo);
	public Color[][] pixels();
	
	public void pixel(int x, int y, Color color);
	public void pixels(int x, int y, Color[][] colors);
	public void pixels(Color[][] colors);
}