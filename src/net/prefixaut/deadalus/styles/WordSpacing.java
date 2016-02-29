package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class WordSpacing implements Style, Animatable<WordSpacing>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000027L;
	private byte defID = 0;
	private Size space = new Size(0);
	public static final WordSpacing NORMAL = new WordSpacing((byte) 1);
	public static final WordSpacing INHERIT = new WordSpacing((byte) Byte.MAX_VALUE);
	
	private WordSpacing(byte defID) {
		this.defID = defID;
	}
	
	public WordSpacing(double space) {
		this.space = new Size(space);
	}
	
	public WordSpacing(Size space) {
		this.space = space;
	}
	
	public Size space() {
		return space;
	}
	
	public void space(double space) {
		this.space = new Size(space);
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
		WordSpacing other = (WordSpacing) obj;
		if (defID != other.defID) return false;
		if (space == null) {
			if (other.space != null) return false;
		} else if (!space.equals(other.space)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(WordSpacing to, Animation an) {
		return () -> {
			this.space().animate(to.space(), an).run();
		};
	}

	@Override
	public String css() {
		return this.space().toString();
	}
}