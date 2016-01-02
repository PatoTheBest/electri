package net.prefixaut.deadalus.styles;

import java.io.Serializable;

public class TextOverflow implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000023L;
	private byte defID = 0;
	private String clippedText = null;
	public static final TextOverflow CLIP = new TextOverflow((byte) 1);
	public static final TextOverflow ELLIPSIS = new TextOverflow((byte) 2);
	public static final TextOverflow INHERIT = new TextOverflow((byte) Byte.MAX_VALUE);
	
	private TextOverflow(byte defID) {
		this.defID = defID;
	}
	
	public TextOverflow(String str) {
		this.clippedText = str;
	}
	
	public String getClippedText() {
		return clippedText;
	}
	
	public void setClippedText(String clippedText) {
		this.clippedText = clippedText;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (clippedText == null) ? 0 : clippedText.hashCode());
		result = prime * result + defID;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		TextOverflow other = (TextOverflow) obj;
		if (clippedText == null) {
			if (other.clippedText != null) return false;
		} else if (!clippedText.equals(other.clippedText)) return false;
		if (defID != other.defID) return false;
		return true;
	}
}