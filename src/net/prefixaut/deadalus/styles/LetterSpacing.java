package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.css.Style;

public class LetterSpacing implements Style, Animatable<LetterSpacing>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000016L;
	private byte defID = 0;
	private boolean important = false;
	private Size space = new Size(0);
	public static final LetterSpacing NORMAL = new LetterSpacing((byte) 1);
	public static final LetterSpacing INHERIT = new LetterSpacing((byte) Byte.MAX_VALUE);
	
	private LetterSpacing(byte defID) {
		this.defID = defID;
	}
	
	public LetterSpacing(double space) {
		this.space = new Size(space);
	}
	
	public LetterSpacing(Size space) {
		this.space = space;
	}
	
	public Size space() {
		return space;
	}
	
	public void space(Size space) {
		this.space = space;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (space == null) ? 0 : space.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		LetterSpacing other = (LetterSpacing) obj;
		if (defID != other.defID) return false;
		if (space == null) {
			if (other.space != null) return false;
		} else if (!space.equals(other.space)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(LetterSpacing to, Animation an) {
		return () -> {
			this.space().animate(to.space(), an).run();
		};
	}
	
	@Override
	public String css() {
		return this.space().toString();
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