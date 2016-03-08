package net.prefixaut.deadalus.xml;

/**
 * Interface for a very basic XML-Document.
 * 
 * @author PreFiXAUT
 *
 * @param <T> Type of Element you want to store in this Document.
 */
public interface Document<T extends Element<T>> {
	
	public T root();
	public void root(T root);
}