package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Size;
import net.prefixaut.deadalus.styles.PerspectiveOrigin;

public interface PerspectiveOriginSupport {
	
	public void setPerspective(PerspectiveOrigin origin);
	
	public PerspectiveOrigin getPerspective();
	
	public default void setPerspectiveX(Size x) {
		PerspectiveOrigin p = this.getPerspective();
		p.setX(x);
		this.setPerspective(p);
	}
	
	public default Size getPerspectiveX() {
		return this.getPerspective().getX();
	}
	
	public default void setPerspectiveY(Size y) {
		PerspectiveOrigin p = this.getPerspective();
		p.setY(y);
		this.setPerspective(p);
	}
	
	public default Size getPerspectiveY() {
		return this.getPerspective().getY();
	}
}