package net.prefixaut.deadalus;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.prefixaut.deadalus.util.Loader;
import net.prefixaut.deadalus.util.StyleConverter;
import net.prefixaut.prelib.xml.Document;

public class PILLDocument implements Document<Component> {
	
	/**
	 * Root of the Document
	 */
	private Component root;
	/**
	 * Variables of the Document which can be used to insert it somewhere dynamically
	 */
	private Map<String, Object> vars = new HashMap<>();
	/**
	 * File-Loaders which handle File loadings.
	 * Mapped by the lower-case name.
	 */
	private Map<String, Loader> loader = new HashMap<>();
	/**
	 * Style-Converters which convert a String/Data to a CSS-Format which can be used and inserted.
	 */
	private Map<String, StyleConverter> stylers = new HashMap<>();
	
	public PILLDocument(Component root) {
		this.root(root);
	}
	
	public boolean load(File file) {
		return false;
	}
	
	@Override
	public Component root() {
		return this.root;
	}
	
	@Override
	public void root(Component node) {
		this.root = node;
	}
	
	public Object variable(String name) {
		return this.vars.get(name);
	}
	
	public void variable(String name, Object obj) {
		this.vars.put(name, obj);
	}
	
	public Loader loader(String name) {
		return this.loader.get(name);
	}
	
	public void loader(String name, Loader loader) {
		this.loader.put(name, loader);
	}
	
	public StyleConverter styler(String name) {
		return this.stylers.get(name);
	}
	
	public void styler(String name, StyleConverter styler) {
		this.stylers.put(name, styler);
	}
}