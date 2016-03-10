package net.prefixaut.deadalus.css;

public interface Style {
	
	/**
	 * Gets Style-Value as it would be shown in a CSS-File.
	 */
	public String css();
	
	/**
	 * @return Weather the Style is meant to be flagged to be important or not.
	 */
	public boolean important();
	
	/**
	 * Flags the Style to be important or not.
	 */
	public void important(boolean important);
}