package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

import com.sun.javafx.css.SizeUnits;

public class BackgroundPosition implements Style, Animatable<BackgroundPosition>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000007L;
	private byte defID = 0;
	private Size x = new Size(0), y = new Size(0);
	public static final BackgroundPosition INHERIT = new BackgroundPosition(Byte.MAX_VALUE);
	
	private BackgroundPosition(byte defID) {
		this.defID = defID;
	}
	
	public BackgroundPosition(double both) {
		this.x = this.y = new Size(both);
	}
	
	public BackgroundPosition(Size both) {
		this.x = this.y = both;
	}
	
	public BackgroundPosition(double x, double y) {
		this.x = new Size(x);
		this.y = new Size(y);
	}
	
	public BackgroundPosition(Size x, Size y) {
		this.x = x;
		this.y = y;
	}
	
	public void x(Size x) {
		this.x = x;
	}
	
	public Size x() {
		return this.x;
	}
	
	public void y(Size y) {
		this.y = y;
	}
	
	public Size y() {
		return this.y;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (x == null) ? 0 : x.hashCode());
		result = prime * result + ( (y == null) ? 0 : y.hashCode());
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
		BackgroundPosition other = (BackgroundPosition) obj;
		if (defID != other.defID)
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
	
	@Override
	public Runnable animate(BackgroundPosition to, Animation an) {
		return () -> {
			this.x().animate(to.x(), an).run();
			this.y().animate(to.y(), an).run();
		};
	}

	@Override
	public String css() {
		return x + " " + y;
	}
	
//	TODO: Clean up this Mess
//	public static final BackgroundPosition LEFT_TOP = new BackgroundPosition(new Size(0), new Size(0));
//	public static final BackgroundPosition LEFT_CENTER = new BackgroundPosition(new Size(0), new Size(SizeUnits.PERCENT, 50));
//	public static final BackgroundPosition LEFT_BOTTOM = new BackgroundPosition(new Size(0), new Size(SizeUnits.PERCENT, 100));
//	public static final BackgroundPosition RIGHT_TOP = new BackgroundPosition(new Size(SizeUnits.PERCENT, 100), new Size(0));
//	public static final BackgroundPosition RIGHT_CENTER = new BackgroundPosition(new Size(SizeUnits.PERCENT, 100), new Size(SizeUnits.PERCENT, 50));
//	public static final BackgroundPosition RIGHT_BOTTOM = new BackgroundPosition(new Size(SizeUnits.PERCENT, 100), new Size(SizeUnits.PERCENT, 100));
//	public static final BackgroundPosition CENTER_TOP = new BackgroundPosition(new Size(SizeUnits.PERCENT, 50), new Size(0));
//	public static final BackgroundPosition CENTER_CENTER = new BackgroundPosition(new Size(SizeUnits.PERCENT, 50), new Size(SizeUnits.PERCENT, 50));
//	public static final BackgroundPosition CENTER_BOTTOM = new BackgroundPosition(new Size(SizeUnits.PERCENT, 50), new Size(SizeUnits.PERCENT, 100));
}