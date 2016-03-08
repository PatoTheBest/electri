package net.prefixaut.deadalus.xml;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Very basic XML-Element with all it's core features
 * 
 * @author PreFiXAUT
 *
 * @param <T> The own Type
 */
public interface Element<T extends Element<T>> {
	
	public String name();
	
	public void name(String name);
	
	public List<T> children();
	
	/*
	 * Problems can't occur
	 */
	@SuppressWarnings("unchecked")
	public boolean children(T... children);
	
	public boolean children(Collection<T> children);
	
	public Map<String, Object> attributes();
	
	public boolean attributes(String key, Object value);
	
	public boolean attributes(Map<String, Object> map);
	
	public T parent();
	
	public void parent(T element);
}