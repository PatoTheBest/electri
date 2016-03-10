package net.prefixaut.deadalus.util;

import java.net.URL;

import net.prefixaut.deadalus.css.StyleSheet;

/**
 * Default CSS-Loader to parse normal CSS-Files.
 * 
 * @since 1.0.0
 * @author PreFiXAUT
 * @version 1.0.0
 */
public class CSSLoader implements StyleLoader {
	
	private static CSSLoader instance = new CSSLoader();
	
	private CSSLoader() {}
	
	public static CSSLoader instance() {
		return CSSLoader.instance;
	}
	
	@Override
	public StyleSheet load(String str) {
		// TODO: Parsing
		return null;
	}
	
	@Override
	public StyleSheet load(URL url) {
		// TODO: Loading and getting raw-String, then call load(String)
		return null;
	}
}