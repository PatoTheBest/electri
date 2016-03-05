package net.prefixaut.deadalus.util;

import java.io.File;
import java.net.URL;

/**
 * A FileLoader is loading a File and parses it (Mark-Down for example).
 * The parsed/loaded data is then returned by the Method.
 * If the Method returns NULL, it'll do nothing and remove the block completly.
 * @author PreFiXAUT
 *		
 */
public interface FileLoader {
	
	public String load(File file);
	
	public String load(URL url);
}