package net.prefixaut.deadalus.styles;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Path;

import net.prefixaut.deadalus.css.Style;

public class FontFamily implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000013L;
	private boolean important = false;
	private String name;
	private String author;
	private String copyright;
	private FontType type;
	
	public FontFamily(File file) {
		// TODO: Load Font
	}
	
	public FontFamily(String path) {
		this(new File(path));
	}
	
	public FontFamily(Path path) {
		this(path.toFile());
	}
	
	public FontFamily(InputStream stream) {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCopyright() {
		return copyright;
	}
	
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	
	public FontType getType() {
		return type;
	}
	
	public void setType(FontType type) {
		this.type = type;
	}
	
	@Override
	public String css() {
		// TODO:
		return null;
	}
	
	@Override
	public boolean important() {
		return this.important;
	}
	
	@Override
	public void important(boolean important) {
		this.important = important;
	}
}