package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.css.MediaFeatureType;

public class GridType implements MediaFeatureType<Boolean> {

	private boolean isGrid;
	
	public GridType(boolean isGrid) {
		this.isGrid = isGrid;
	}
	
	public void setGrid(boolean isGrid) {
		this.isGrid = isGrid;
	}
	
	public boolean isGrid() {
		return this.isGrid;
	}
	
	@Override
	public boolean check(Boolean isGrid) {
		return this.isGrid && isGrid;
	}
	
	@Override
	public String toString() {
		return isGrid ? "grid: 1" : "grid: 0";
	}
}