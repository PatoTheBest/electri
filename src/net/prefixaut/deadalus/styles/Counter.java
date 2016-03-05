package net.prefixaut.deadalus.styles;

import java.util.HashMap;
import java.util.Map;

import net.prefixaut.deadalus.css.Style;

public final class Counter implements Style {
	
	private Counter() {}
	
	private static final Map<String, Double> counters = new HashMap<>();
	
	public static boolean setCounters(String id, double amount) {
		Double r = Counter.counters.put(id, amount);
		return r != null;
	}
	
	public static double addCounters(String id, double amount) {
		double current = 0;
		if (Counter.counters.containsKey(id)) current = Counter.counters.get(id);
		current += amount;
		Counter.counters.put(id, current);
		return current;
	}
	
	public static double decreaseCounters(String id, double amount) {
		double current = 0;
		if (Counter.counters.containsKey(id)) current = Counter.counters.get(id);
		current -= amount;
		Counter.counters.put(id, current);
		return current;
	}
	
	public static double getCounters(String id) {
		return Counter.counters.get(id);
	}

	@Override
	public String css() {
		// TODO:
		return null;
	}

	@Override
	public boolean important() {
		// TODO: Wat
		return false;
	}

	@Override
	public void important(boolean important) {
		// TODO: Wat
	}
}