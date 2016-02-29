package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Size;

public class BoxShadow implements Style, Animatable<BoxShadow>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000000AL;
	private byte defID = 0;
	private Size horizontalShadow = new Size(0), verticalShadow = new Size(0), blur = new Size(0), spread = new Size(0);
	private Color color;
	public static final BoxShadow INHERIT = new BoxShadow((byte) Byte.MAX_VALUE);
	
	private BoxShadow(byte defID) {
		this.defID = defID;
	}
	
	public BoxShadow(double shadow) {
		this.horizontalShadow = this.verticalShadow = new Size(shadow);
	}
	
	public BoxShadow(Size shadow) {
		this.horizontalShadow = this.verticalShadow = shadow;
	}
	
	public BoxShadow(double shadow, Color color) {
		this.horizontalShadow = this.verticalShadow = new Size(shadow);
		this.color = color;
	}
	
	public BoxShadow(Size shadow, Color color) {
		this.horizontalShadow = this.verticalShadow = shadow;
		this.color = color;
	}
	
	public BoxShadow(double horizontal, double vertical) {
		this.horizontalShadow = new Size(horizontal);
		this.verticalShadow = new Size(vertical);
	}
	
	public BoxShadow(Size horizontal, Size vertical) {
		this.horizontalShadow = horizontal;
		this.verticalShadow = vertical;
	}
	
	public BoxShadow(double horizontal, double vertical, Color color) {
		this.horizontalShadow = new Size(horizontal);
		this.verticalShadow = new Size(vertical);
		this.color = color;
	}
	
	public BoxShadow(Size horizontal, Size vertical, Color color) {
		this.horizontalShadow = horizontal;
		this.verticalShadow = vertical;
		this.color = color;
	}
	
	public BoxShadow(double horizontal, double vertical, double blur) {
		this.horizontalShadow = new Size(horizontal);
		this.verticalShadow = new Size(vertical);
		this.blur = new Size(blur);
	}
	
	public BoxShadow(Size horizontal, Size vertical, Size blur) {
		this.horizontalShadow = horizontal;
		this.verticalShadow = vertical;
		this.blur = blur;
	}
	
	public BoxShadow(double horizontal, double vertical, double blur, Color color) {
		this.horizontalShadow = new Size(horizontal);
		this.verticalShadow = new Size(vertical);
		this.blur = new Size(blur);
		this.color = color;
	}
	
	public BoxShadow(Size horizontal, Size vertical, Size blur, Color color) {
		this.horizontalShadow = horizontal;
		this.verticalShadow = vertical;
		this.blur = blur;
		this.color = color;
	}
	
	public BoxShadow(double horizontal, double vertical, double blur, double spread) {
		this.horizontalShadow = new Size(horizontal);
		this.verticalShadow = new Size(vertical);
		this.blur = new Size(blur);
		this.spread = new Size(spread);
	}
	
	public BoxShadow(Size horizontal, Size vertical, Size blur, Size spread) {
		this.horizontalShadow = horizontal;
		this.verticalShadow = vertical;
		this.blur = blur;
		this.spread = spread;
	}
	
	public BoxShadow(double horizontal, double vertical, double blur, double spread, Color color) {
		this.horizontalShadow = new Size(horizontal);
		this.verticalShadow = new Size(vertical);
		this.blur = new Size(blur);
		this.spread = new Size(spread);
		this.color = color;
	}
	
	public BoxShadow(Size horizontal, Size vertical, Size blur, Size spread, Color color) {
		this.horizontalShadow = horizontal;
		this.verticalShadow = vertical;
		this.blur = blur;
		this.spread = spread;
		this.color = color;
	}
	
	public Size horizontal() {
		return horizontalShadow;
	}
	
	public void horizontal(Size horizontalShadow) {
		this.horizontalShadow = horizontalShadow;
	}
	
	public Size vertical() {
		return verticalShadow;
	}
	
	public void vertical(Size verticalShadow) {
		this.verticalShadow = verticalShadow;
	}
	
	public Size blur() {
		return blur;
	}
	
	public void blur(Size blur) {
		this.blur = blur;
	}
	
	public Size spread() {
		return spread;
	}
	
	public void spread(Size spread) {
		this.spread = spread;
	}
	
	public Color color() {
		return color;
	}
	
	public void color(Color color) {
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (blur == null) ? 0 : blur.hashCode());
		result = prime * result + ( (color == null) ? 0 : color.hashCode());
		result = prime * result + defID;
		result = prime
				* result
				+ ( (horizontalShadow == null) ? 0 : horizontalShadow.hashCode());
		result = prime * result + ( (spread == null) ? 0 : spread.hashCode());
		result = prime * result
				+ ( (verticalShadow == null) ? 0 : verticalShadow.hashCode());
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
		BoxShadow other = (BoxShadow) obj;
		if (blur == null) {
			if (other.blur != null)
				return false;
		} else if (!blur.equals(other.blur))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (defID != other.defID)
			return false;
		if (horizontalShadow == null) {
			if (other.horizontalShadow != null)
				return false;
		} else if (!horizontalShadow.equals(other.horizontalShadow))
			return false;
		if (spread == null) {
			if (other.spread != null)
				return false;
		} else if (!spread.equals(other.spread))
			return false;
		if (verticalShadow == null) {
			if (other.verticalShadow != null)
				return false;
		} else if (!verticalShadow.equals(other.verticalShadow))
			return false;
		return true;
	}
	
	@Override
	public Runnable animate(BoxShadow to, Animation an) {
		return () -> {
			this.blur().animate(to.blur(), an).run();
			this.color().animate(to.color(), an).run();
			this.horizontal().animate(to.horizontal(), an).run();
			this.spread().animate(to.spread(), an).run();
			this.vertical().animate(to.vertical(), an).run();
		};
	}

	@Override
	public String css() {
		return this.horizontal() + " " + this.vertical() + " " + this.blur() + " " + this.spread() + " " + this.color();
	}
}