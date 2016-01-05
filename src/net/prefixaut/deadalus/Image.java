package net.prefixaut.deadalus;

import java.io.Serializable;

import net.prefixaut.prelib.util.Loadable;
import net.prefixaut.prelib.util.Saveable;

/**
 * Interface to define an Image. Is used to interact with Images the easiest way.
 * 
 * @author PreFiXAUT
 */
public interface Image extends Media, Loadable, Saveable, Serializable {
	
	/**
	 * @param x
	 *            X-Coordinate (Width/Horizontal Axis).
	 * @param y
	 *            Y-Coordinate (Height/Vertical Axis).
	 * @return The Pixel/Color on the specified Coordinates.
	 */
	public Color pixel(int x, int y);
	
	/**
	 * Creates a Sub-Image on the given Coordinates and gives out the Pixels in it.
	 * 
	 * @return An 2D Array to iterate through (Starting with the Vertical Axis as Key/1st Array).
	 */
	public Color[][] pixels(int xFrom, int yFrom, int xTo, int yTo);
	
	/**
	 * Gets all Pixels of the Image.
	 * 
	 * @return An 2D Array to iterate through (Starting with the Vertical Axis as Key/1st Array).
	 */
	public Color[][] pixels();
	
	/**
	 * Sets the Pixel on the given Coordinates to the given Color.
	 * 
	 * @param x
	 *            X-Coordinate (Width/Horizontal Axis).
	 * @param y
	 *            Y-Coordinate (Height/Vertical Axis).
	 * @param color
	 *            Color of the Pixel you want to set.
	 */
	public void pixel(int x, int y, Color color);
	
	/**
	 * Sets the Pixels from the Array, beginning at the given X and Y Coordinates. So Pixel (X+0/Y+0) = colors[0][0], (X+0/Y+1) = colors[1][0], etc.
	 * 
	 * @param x
	 *            X-Coordinate from where the beginning of the colors is.
	 * @param y
	 *            Y-Coordinate from where the beginning of the colors is.
	 * @param colors
	 *            Color/Pixel-Array which is getting applied onto the Image.
	 */
	public void pixels(int x, int y, Color[][] colors);
	
	/**
	 * Does the same as {@link #pixels(int, int, Color[][])} just from the beginning from the Image (0,0).
	 */
	public default void pixels(Color[][] colors) {
		this.pixels(0, 0, colors);
	}
}