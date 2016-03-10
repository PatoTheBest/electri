package net.prefixaut.deadalus.css;

public class MediaFeature<T extends Comparable<T>> {
	
	private MediaSelectType selectType;
	private MediaFeatureType<T> type;
	private Comparable<?> value;
	
	public MediaFeature(MediaSelectType selectType, MediaFeatureType<T> type, Comparable<?> value) {
		this.selectType = selectType;
		this.type = type;
		this.value = value;
	}
	
	public synchronized MediaSelectType selectType() {
		return selectType;
	}
	
	public synchronized void selectType(MediaSelectType selectType) {
		this.selectType = selectType;
	}
	
	public synchronized MediaFeatureType<T> type() {
		return type;
	}
	
	public synchronized void setType(MediaFeatureType<T> type) {
		this.type = type;
	}
	
	public synchronized Comparable<?> getValue() {
		return value;
	}
	
	public synchronized void setValue(Comparable<?> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return selectType.toString() + " (" + type.toString() + ": " + value.toString() + ")";
	}
	
	
}