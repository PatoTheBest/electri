package net.prefixaut.deadalus;

public final class Screen {
	
	/**
	 * Width and Height in Pixels of the Screen.
	 */
	private int width, height;
	/**
	 * Refresh-Rate of the Screen (How many Updates there are per second.)
	 */
	private int refreshRate;
	/**
	 * Name if present - Producer + Model
	 */
	private String name;
	private double dpi;
	
	public int width() {
		return this.width;
	}
	
	public int height() {
		return this.height;
	}
	
	public int refreshRate() {
		return this.refreshRate;
	}
	
	public String name() {
		return this.name;
	}
	
	public double dpi() {
		return this.dpi;
	}
}