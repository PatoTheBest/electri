package net.prefixaut.deadalus.css;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StyleBlock {
	
	/**
	 * Media-Query this Block has
	 */
	private MediaQuery query = null;
	/**
	 * The CSS-Path, put into an Array to make it easier to work with
	 */
	private String[] selection;
	/**
	 * Styles in this Block
	 */
	private List<Style> styles;
	
	public StyleBlock(String[] selection, Collection<Style> styles) {
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(String[] selection, Style...styles) {
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(String selection, Collection<Style> styles) {
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(String selection, Style...styles) {
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(MediaQuery query, String[] selection, Collection<Style> styles) {
		this.query(query);
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(MediaQuery query, String[] selection, Style...styles) {
		this.query(query);
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(MediaQuery query, String selection, Collection<Style> styles) {
		this.query(query);
		this.selection(selection);
		this.styles(styles);
	}
	
	public StyleBlock(MediaQuery query, String selection, Style...styles) {
		this.query(query);
		this.selection(selection);
		this.styles(styles);
	}
	
	public MediaQuery query() {
		return this.query;
	}
	
	public void query(MediaQuery query) {
		this.query = query;
	}
	
	public String[] selection() {
		return this.selection;
	}
	
	public void selection(String[] selection) {
		this.selection = selection;
	}
	
	public void selection(Collection<String> selection) {
		this.selection = selection.toArray(new String[selection.size()]);
	}
	
	public void selection(String selection) {
		int i = selection.indexOf(",");
		if (i > -1) selection = selection.substring(0, i);
		this.selection = selection.split("[\\s]*[\\S]*[\\s]*");
	}
	
	public List<Style> styles() {
		return this.styles;
	}
	
	public void styles(Collection<Style> styles) {
		this.styles = new ArrayList<>(styles);
	}
	
	public void styles(Style...styles) {
		this.styles = Arrays.asList(styles);
	}
}