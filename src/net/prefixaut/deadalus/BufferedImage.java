package net.prefixaut.deadalus;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

public final class BufferedImage implements Image, Serializable {
	
	private static final long serialVersionUID = 0x1000200010000004L;
	private int width = 0, height = 0;
	/**
	 * Buffered-Image which contains all Pixels in Colors in a 2-D Array. The Array is Arranged to iterate through it, so it contains the height and then the width.
	 */
	private Color[][] buffer;
	
	public BufferedImage(File file) {
		this.load(file);
	}
	
	public BufferedImage(URL url) {
		this.load(url);
	}
	
	public BufferedImage(URI uri) {
		this.load(uri);
	}
	
	public BufferedImage(Path path) {
		this.load(path);
	}
	
	public BufferedImage(String path) {
		this.load(path);
	}
	
	public BufferedImage(int width, int height) {
		this.width(width);
		this.height(height);
		this.pixels(new Color[height][width]);
	}
	
	public BufferedImage(Color[][] buffer) {
		this.pixels(buffer);
	}
	
	@Override
	public boolean load(File file) {
		// TODO: Do Loading (+ Parsing)
		return false;
	}
	
	@Override
	public boolean save(File file) {
		// TODO: Do Saving (+ Parsing)
		return false;
	}
	
	@Override
	public int width() {
		return this.width;
	}
	
	@Override
	public void width(int width) {
		this.width = width;
	}
	
	@Override
	public int height() {
		return this.height;
	}
	
	@Override
	public void height(int height) {
		this.height = height;
	}
	
	@Override
	public Color pixel(int x, int y) {
		if (x < 0 || x > this.width() || y < 0 || y > this.height()) throw new IndexOutOfBoundsException();
		return this.buffer[y][x];
	}
	
	@Override
	public Color[][] pixels(int xFrom, int yFrom, int xTo, int yTo) {
		if (xFrom < 0 || xFrom > this.width() || yFrom < 0 || yFrom > this.height() || xTo < 0 || xTo > this.width() || yTo < 0 || yTo > this.height())
			throw new IndexOutOfBoundsException();
		if (xFrom > xTo || yFrom > yTo) throw new IllegalArgumentException();
		Color[][] r = new Color[xTo - xFrom + 1][yTo - yFrom + 1];
		int rx = 0, ry = 0;
		for (int y = yFrom; y <= yTo; y++, ry++) {
			rx = 0;
			for (int x = xFrom; x <= xTo; x++, rx++) {
				r[ry][rx] = this.buffer[y][x];
			}
		}
		return r;
	}
	
	@Override
	public Color[][] pixels() {
		return this.buffer;
	}
	
	@Override
	public void pixel(int x, int y, Color color) {
		if (color == null) throw new NullPointerException();
		if (x > this.width || y > this.height) throw new IndexOutOfBoundsException();
		this.buffer[x][y] = color;
	}
	
	@Override
	public void pixels(int x, int y, Color[][] colors) {
		if (colors == null) throw new NullPointerException();
		if (x > this.width || y > this.height) throw new IndexOutOfBoundsException();
		if (colors.length <= 0 || colors[0].length <= 0) throw new IllegalArgumentException();
		int h = colors.length, l = colors[0].length;
		if (x + l > this.width || y + h > this.height) {
			throw new IndexOutOfBoundsException();
		}
		for (int iy = 0; iy + y < h; iy++) {
			for (int ix = 0; ix + x < l; ix++) {
				this.buffer[y + iy][x + ix] = colors[iy][ix];
			}
		}
	}
	
	@Override
	public void pixels(Color[][] buffer) {
		if (buffer == null) throw new NullPointerException();
		if (buffer.length <= 0 || buffer[0].length <= 0) throw new IllegalArgumentException("An Buffer has to be at least 2-Dimensional (1x1)!");
		this.height(buffer.length);
		this.width(buffer[0].length);
		this.buffer = buffer;
	}
}