package net.prefixaut.deadalus.util;

import java.io.File;
import java.net.URL;

public interface ScriptLoader {
	
	public void load(String code);
	
	public void load(File file);
	
	public void load(URL url);
}