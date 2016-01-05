package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class Perspective implements Style, Animatable<Perspective>, Serializable {
	
	private static final long serialVersionUID = 0x100020002000001CL;
	private byte defID = 0;
	private Size view = new Size(0);
	public static final Perspective NONE = new Perspective((byte) 1);
	public static final Perspective INHERIT = new Perspective((byte) Byte.MAX_VALUE);
	
	private Perspective(byte defID) {
		this.defID = defID;
	}
	
	public Perspective(double view) {
		this.view = new Size(view);
	}
	
	public Perspective(Size view) {
		this.view = view;
	}
	
	public Size view() {
		return view;
	}
	
	public void view(Size view) {
		this.view = view;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (view == null) ? 0 : view.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Perspective other = (Perspective) obj;
		if (defID != other.defID) return false;
		if (view == null) {
			if (other.view != null) return false;
		} else if (!view.equals(other.view)) return false;
		return true;
	}
	
	@Override
	public Runnable animate(Perspective to, Animation an) {
		return () -> {
			this.view().animate(to.view(), an).run();
		};
	}

	@Override
	public String css() {
		return this.view().toString();
	}
}