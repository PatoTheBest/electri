package net.prefixaut.deadalus;

import java.io.File;

import net.prefixaut.deadalus.xml.Document;

public class PILLDocument implements Document<Component> {
	
	/**
	 * Root of the Document
	 */
	private Component root;
	
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
}