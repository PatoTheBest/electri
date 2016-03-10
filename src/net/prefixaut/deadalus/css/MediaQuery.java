package net.prefixaut.deadalus.css;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MediaQuery {
	
	// SYNTAX
	// @media <not|only>[only] <mediatype>[type] <and|not <media-feature>[feature], ...>
	private MediaType type;
	/**
	 * TRUE = ONLY FASLE = NOT
	 */
	private boolean only = true;
	private List<MediaFeature<?>> features;
	
	public MediaQuery(MediaType type, Collection<MediaFeature<?>> features) {
		this.type = type;
		this.features = new ArrayList<>(features);
	}
	
	public MediaQuery(MediaType type, MediaFeature<?>... features) {
		this.type = type;
		this.features = Arrays.asList(features);
	}
	
	public MediaType type() {
		return this.type;
	}
	
	public void type(MediaType type) {
		this.type = type;
	}
	
	public boolean only() {
		return this.only;
	}
	
	public boolean not() {
		return !this.only;
	}
	
	public void only(boolean only) {
		this.only = only;
	}
	
	public void not(boolean not) {
		this.only = !not;
	}
	
	public List<MediaFeature<?>> features() {
		return this.features;
	}
	
	public void features(Collection<MediaFeature<?>> features) {
		this.features = new ArrayList<>(features);
	}
	
	@Override
	public String toString() {
		// TODO: Do features
		return "@media " + (only ? "only " : "not ") + type.name().toLowerCase();
	}
}