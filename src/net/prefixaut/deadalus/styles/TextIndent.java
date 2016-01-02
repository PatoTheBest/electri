package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class TextIndent implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000021L;
	private byte defID = 0;
	private Size indent = new Size(0);
	public static final TextIndent INHERIT = new TextIndent((byte) Byte.MAX_VALUE);
	
	private TextIndent(byte defID) {
		this.defID = defID;
	}
	
	public TextIndent() {}
	
	public TextIndent(double indent) {
		this.indent = new Size(indent);
	}
	
	public TextIndent(Size indent) {
		this.indent = indent;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (indent == null) ? 0 : indent.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		TextIndent other = (TextIndent) obj;
		if (defID != other.defID) return false;
		if (indent == null) {
			if (other.indent != null) return false;
		} else if (!indent.equals(other.indent)) return false;
		return true;
	}
}