package net.prefixaut.deadalus.styles;

import java.io.Serializable;
import java.util.Collection;

import net.prefixaut.deadalus.css.Style;
import net.prefixaut.prelib.sync.SyncArrayList;

public class Quotes implements Style, Serializable {
	
	private static final long serialVersionUID = 0x100020002000001FL;
	private byte defID = 0;
	private boolean important = false;
	private SyncArrayList<Quote> quotes = new SyncArrayList<>();
	public static final Quotes NONE = new Quotes((byte) 1);
	public static final Quotes INHERIT = new Quotes((byte) Byte.MAX_VALUE);
	
	private Quotes(byte defID) {
		this.defID = defID;
	}
	
	public Quotes(Quote... quotes) {
		this.quotes = new SyncArrayList<>(quotes);
	}
	
	public Quotes(Collection<Quote> quotes) {
		this.quotes = new SyncArrayList<>(quotes);
	}
	
	public SyncArrayList<Quote> getQuotes() {
		return quotes.getCopy();
	}
	
	public void setQuotes(Collection<Quote> quotes) {
		this.quotes = new SyncArrayList<>(quotes);
	}
	
	public void setQuotes(Quote... quotes) {
		this.quotes = new SyncArrayList<>(quotes);
	}
	
	public boolean addQuote(Quote quote) {
		return this.quotes.add(quote);
	}
	
	public boolean removeQuote(Quote quote) {
		return this.quotes.remove(quote);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defID;
		result = prime * result + ( (quotes == null) ? 0 : quotes.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Quotes other = (Quotes) obj;
		if (defID != other.defID) return false;
		if (quotes == null) {
			if (other.quotes != null) return false;
		} else if (!quotes.equals(other.quotes)) return false;
		return true;
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