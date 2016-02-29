package net.prefixaut.deadalus;

import java.io.File;

import net.prefixaut.prelib.xml.Document;

/**
 * A Loader is loading a File into the current Deadalus-Document. The Loader parses/executes Code, or reads an certain File-Format. When the loading is done, it'll either return a
 * String which represents the parsed code, or it'll use the loaded code to do something. For Example, appending a parsed CSS-File to the Document.
 * 
 * @author PreFiXAUT
 *		
 */
@FunctionalInterface
public interface Loader {
	
	public String load(Document<Component> doc, File file);
}