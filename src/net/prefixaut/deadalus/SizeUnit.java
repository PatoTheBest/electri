package net.prefixaut.deadalus;

/**
 * Unit Interface to define and customize Size-Definitions. Used to identify and to work easier with different Size-Definitions since they are treated differently every time.
 * 
 * @author PreFiXAUT
 */
public interface SizeUnit {
	
	public String definition(double amount);
	
	public boolean relative();
	
	public double key();
	
	public default double convertToPixel(Size amount) {
		return this.convertToPixel(amount.size());
	}
	
	public default double convertToPixel(double amount) {
		return amount / this.key();
	}
}