package net.prefixaut.deadalus.css;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StyleSheet {
	
	private List<StyleBlock> blocks;
	
	public StyleSheet(StyleBlock...blocks) {
		this.blocks(blocks);
	}
	
	public List<StyleBlock> blocks() {
		return this.blocks;
	}
	
	public void blocks(StyleBlock...blocks) {
		this.blocks = Arrays.asList(blocks);
	}
	
	public void blocks(Collection<StyleBlock> blocks) {
		this.blocks = new ArrayList<>(blocks);
	}
}