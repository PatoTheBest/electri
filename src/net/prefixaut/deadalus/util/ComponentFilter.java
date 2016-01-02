package net.prefixaut.deadalus.util;

import net.prefixaut.deadalus.Component;
import net.prefixaut.prelib.util.Filter;

/**
 * Extension of the {@link Filter} to remove the Generic so it can be used in Lambda-Code.
 * @author PreFiXAUT
 */
@FunctionalInterface
public interface ComponentFilter extends Filter<Component> {
	
	public boolean allow(Component component);
}