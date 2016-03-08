package net.prefixaut.deadalus.styles;

import java.io.Serializable;
import java.util.Collection;

import net.prefixaut.deadalus.css.Style;
import net.prefixaut.prelib.sync.SyncArrayList;

public class Keyframe implements Style, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000015L;
	private boolean important = false;
	private String name;
	private double selector;
	private SyncArrayList<Animatable<?>> styles;
	
	public Keyframe(String name, double selector, Animatable<?>... styles) {
		if (styles == null || styles.length < 1) throw new IllegalArgumentException();
		this.name = name;
		this.selector = selector;
		this.styles = new SyncArrayList<>(styles);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSelector() {
		return selector;
	}
	
	public void setSelector(double selector) {
		this.selector = selector;
	}
	
	public SyncArrayList<Animatable<?>> getStyles() {
		return styles;
	}
	
	public void setStyles(Collection<Animatable<?>> styles) {
		if (styles == null) throw new NullPointerException();
		this.styles = new SyncArrayList<>(styles);
	}
	
	public void setStyles(Animatable<?>... styles) {
		if (styles == null) throw new NullPointerException();
		this.styles = new SyncArrayList<>(styles);
	}
	
	@Override
	public String css() {
		// TODO:
		return null;
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