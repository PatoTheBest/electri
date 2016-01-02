package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class BorderSpacing implements Style, Animatable<BorderSpacing>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000009L;
	private byte defID = 0;
	private Size horizontal = new Size(0), vertical = new Size(0);
	public static final BorderSpacing INHERIT = new BorderSpacing((byte) Byte.MAX_VALUE);
	
	private BorderSpacing(byte defID) {
		this.defID = defID;
	}
	
	public BorderSpacing(double both) {
		this.horizontal = this.vertical = new Size(both);
	}
	
	public BorderSpacing(Size both) {
		this.horizontal = this.vertical = both;
	}
	
	public BorderSpacing(double horizontal, double vertical) {
		this.horizontal = new Size(horizontal);
		this.vertical = new Size(vertical);
	}
	
	public BorderSpacing(double horizontal, Size vertical) {
		this.horizontal = new Size(horizontal);
		this.vertical = vertical;
	}
	
	public BorderSpacing(Size horizontal, double vertical) {
		this.horizontal = horizontal;
		this.vertical = new Size(vertical);
	}
	
	public BorderSpacing(Size horizontal, Size vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}
	
	public Size getHotizontal() {
		return horizontal;
	}
	
	public void setHorizontal(double horizontal) {
		this.setHorizontal(new Size(horizontal));
	}
	
	public void setHorizontal(Size hotizontal) {
		this.horizontal = hotizontal;
	}
	
	public Size getVertical() {
		return vertical;
	}
	
	public void setVertical(double vertical) {
		this.setVertical(new Size(vertical));
	}
	
	public void setVertical(Size vertical) {
		this.vertical = vertical;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result
				+ ( (horizontal == null) ? 0 : horizontal.hashCode());
		result = prime * result
				+ ( (vertical == null) ? 0 : vertical.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BorderSpacing other = (BorderSpacing) obj;
		if (defID != other.defID)
			return false;
		if (horizontal == null) {
			if (other.horizontal != null)
				return false;
		} else if (!horizontal.equals(other.horizontal))
			return false;
		if (vertical == null) {
			if (other.vertical != null)
				return false;
		} else if (!vertical.equals(other.vertical))
			return false;
		return true;
	}
	
	@Override
	public Runnable animate(BorderSpacing to, Animation an) {
		return () -> {
			this.getHotizontal().animate(to.getHotizontal(), an).run();
			this.getVertical().animate(to.getVertical(), an).run();
		};
	}
}