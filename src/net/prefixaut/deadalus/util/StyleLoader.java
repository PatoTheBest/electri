package net.prefixaut.deadalus.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import net.prefixaut.deadalus.css.StyleSheet;

public interface StyleLoader {
	
	public StyleSheet load(String str);
	
	public default StyleSheet load(File file) throws IOException {
		if (file == null) throw new IllegalArgumentException("NULL is not a valid File!");
		if (!file.isFile()) throw new IllegalArgumentException("The File has to be an actual File!");
		if (!file.canRead()) throw new IllegalArgumentException("Cannot read from the File!");
		try {
			String r = "", s = null;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((s = br.readLine()) != null) r += s + "/n";
			br.close();
			return this.load(r);
		} catch (IOException io) {
			throw new IOException("Couldn't read/access File!");
		}
	}
	
	public StyleSheet load(URL url);
}