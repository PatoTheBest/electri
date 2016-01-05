package net.prefixaut.deadalus.styles;

import java.io.Serializable;

public class Quote implements Serializable {
	
	private static final long serialVersionUID = 0x100020002000001EL;
	private String open, close;
	
	public Quote(String openNclose) {
		this.open = openNclose;
		this.close = openNclose;
	}
	
	public Quote(String open, String close) {
		this.open = open;
		this.close = close;
	}
	
	public String open() {
		return open;
	}
	
	public void open(String open) {
		this.open = open;
	}
	
	public String close() {
		return close;
	}
	
	public void close(String close) {
		this.close = close;
	}
}