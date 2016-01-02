package net.prefixaut.deadalus;

/**
 * Unit Interface to define and customize Size-Definitions. Used to identify and to work easier with different Size-Definitions since they are treated differently every time.
 * 
 * @author PreFiXAUT
 */
public interface SizeUnit {
	
	public String getDefinition(double amount);
	
	public boolean isRelative();
	
	public double getKey();
	
	public default double convertToPixel(Size amount) {
		return this.convertToPixel(amount.getSize());
	}
	
	public default double convertToPixel(double amount) {
		return amount / this.getKey();
	}
}