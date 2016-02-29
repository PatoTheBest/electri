package net.prefixaut.deadalus;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.prefixaut.prelib.xml.Document;

public class PILLDocument implements Document<Component> {
	
	private Component root;
	private Map<String, Object> vars = new HashMap<>();
	
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