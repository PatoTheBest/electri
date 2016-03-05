package net.prefixaut.deadalus.css;

public interface Style {
	
	/**
	 * Gets the CSS-Value as String.
	 */
	public String css();
	
	/**
	 * @return Weather the Style is meant to be flagged as important or not.
	 */
	public boolean important();
	
	/**
	 * Flags the Style as important or not.
	 */
	public void important(boolean important);
}