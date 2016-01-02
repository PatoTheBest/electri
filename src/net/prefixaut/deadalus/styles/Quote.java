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
	
	public String getOpen() {
		return open;
	}
	
	public void setOpen(String open) {
		this.open = open;
	}
	
	public String getClose() {
		return close;
	}
	
	public void setClose(String close) {
		this.close = close;
	}
}