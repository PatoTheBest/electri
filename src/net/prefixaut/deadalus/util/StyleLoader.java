package net.prefixaut.deadalus.util;

import java.io.File;
import java.net.URL;

import net.prefixaut.deadalus.PILLDocument;

public interface StyleLoader {
	
	public void load(PILLDocument doc, String str);
	
	public void load(PILLDocument doc, File file);
	
	public void load(PILLDocument doc, URL url);
}