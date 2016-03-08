package net.prefixaut.deadalus.xml;

import java.util.List;

/**
 * Interface which is used to select only specific Elements in a Document.
 * 
 * @author PreFiXAUT
 *
 * @param <T> Class of Elements you want to select
 */
public interface ElementSelector<T extends Element<T>> {
	
	public List<T> select(Document<T> doc, String str);
}
