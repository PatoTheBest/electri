package net.prefixaut.deadalus.css.media;

import net.prefixaut.deadalus.css.MediaFeatureType;

public class ScanType implements MediaFeatureType<Scan> {
	
	private Scan scan;
	
	public ScanType(Scan scan) {
		this.scan = scan;
	}
	
	public Scan getScan() {
		return scan;
	}
	
	public void setScan(Scan scan) {
		this.scan = scan;
	}
	
	@Override
	public boolean check(Scan value) {
		return this.scan == value;
	}
	
	@Override
	public String toString() {
		return "scan: " + this.scan.name().toLowerCase();
	}
}
