package net.prefixaut.deadalus;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.prefixaut.deadalus.util.FileLoader;
import net.prefixaut.deadalus.util.ScriptLoader;
import net.prefixaut.deadalus.util.StyleLoader;
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
	private Map<String, FileLoader> loader = new HashMap<>();
	/**
	 * TypeLoaders which load/parse a File/String and append it as CSS-Block into the Document.
	 * Mapped by the lower-case type-name.
	 */
	private Map<String, StyleLoader> stylers = new HashMap<>();
	/**
	 * TypeLoaaders which load/parse a File/String and executes the Code.
	 * Mapped by the lower-case type-name.
	 */
	private Map<String, ScriptLoader> scripters = new HashMap<>();
	
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
	
	public FileLoader loader(String name) {
		return this.loader.get(name);
	}
	
	public void loader(String name, FileLoader loader) {
		this.loader.put(name, loader);
	}
	
	public StyleLoader styler(String name) {
		return this.stylers.get(name);
	}
	
	public void styler(String name, StyleLoader styler) {
		this.stylers.put(name, styler);
	}
	
	public ScriptLoader scripter(String name) {
		return this.scripters.get(name);
	}
	
	public void scripter(String name, ScriptLoader scripter) {
		this.scripters.put(name, scripter);
	}
}