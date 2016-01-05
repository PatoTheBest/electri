package net.prefixaut.deadalus.styles;

import java.io.Serializable;

import net.prefixaut.deadalus.Size;

public class VerticalAlign implements Style, Animatable<VerticalAlign>, Serializable {
	
	private static final long serialVersionUID = 0x1000200020000026L;
	public static final VerticalAlign BASELINE = new VerticalAlign(0);
	public static final VerticalAlign SUB = new VerticalAlign(1);
	public static final VerticalAlign SUPER = new VerticalAlign(2);
	public static final VerticalAlign TOP = new VerticalAlign(3);
	public static final VerticalAlign TEXT_TOP = new VerticalAlign(4);
	public static final VerticalAlign MIDDLE = new VerticalAlign(5);
	public static final VerticalAlign BOTTOM = new VerticalAlign(6);
	public static final VerticalAlign TEXT_BOTTOM = new VerticalAlign(7);
	public static final VerticalAlign INHERIT = new VerticalAlign(8);
	private int preDefValue = -1;
	private Size amount;
	
	private VerticalAlign(int preDefValue) {
		this.preDefValue = preDefValue;
	}
	
	public VerticalAlign(double amount) {
		this.amount = new Size(amount);
	}
	
	public VerticalAlign(Size amount) {
		this.amount = amount;
	}
	
	public Size amount() {
		return amount;
	}
	
	public void amount(double amount) {
		this.amount = new Size(amount);
	}
	
	public void amount(Size amount) {
		this.amount = amount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (amount == null) ? 0 : amount.hashCode());
		result = prime * result + preDefValue;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VerticalAlign other = (VerticalAlign) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (preDefValue != other.preDefValue)
			return false;
		return true;
	}
	
	@Override
	public Runnable animate(VerticalAlign to, Animation an) {
		return () -> {
			this.amount().animate(to.amount(), an).run();
		};
	}

	@Override
	public String css() {
		return this.amount().toString();
	}
}