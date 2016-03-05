package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.css.MediaFeatureType;

public class OrientationType implements MediaFeatureType<Orientation> {
	
	private Orientation orientation;
	
	public OrientationType(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	@Override
	public boolean check(Orientation value) {
		return this.orientation == value;
	}
	
	@Override
	public String toString() {
		return "orientation: " + this.orientation.name().toLowerCase();
	}
}