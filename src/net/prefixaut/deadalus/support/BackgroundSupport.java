package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.Color;
import net.prefixaut.deadalus.Image;
import net.prefixaut.deadalus.styles.Background;
import net.prefixaut.deadalus.styles.BackgroundAttachment;
import net.prefixaut.deadalus.styles.BackgroundPosition;
import net.prefixaut.deadalus.styles.BackgroundRepeat;

public interface BackgroundSupport {
	
	public void setBackground(Background background);
	
	public Background getBackground();
	
	public default void setBackgroundPosition(BackgroundPosition position) {
		Background bg = this.getBackground();
		bg.setPosition(position);
		this.setBackground(bg);
	}
	
	public default BackgroundPosition getBackgroundPosition() {
		return this.getBackground().getPosition();
	}
	
	public default void setBackgroundAttachment(BackgroundAttachment attachment) {
		Background bg = this.getBackground();
		bg.setAttachment(attachment);
		this.setBackground(bg);
	}
	
	public default BackgroundAttachment getBackgroundAttachment() {
		return this.getBackground().getAttachment();
	}
	
	public default void setBackgroundRepeat(BackgroundRepeat repeat) {
		Background bg = this.getBackground();
		bg.setRepeat(repeat);
		this.setBackground(bg);
	}
	
	public default BackgroundRepeat getBackgroundRepeat() {
		return this.getBackground().getRepeat();
	}
	
	public default void setBackgroundImage(Image image) {
		Background bg = this.getBackground();
		bg.setImage(image);
		this.setBackground(bg);
	}
	
	public default Image getBackgroundImage() {
		return this.getBackground().getImage();
	}
	
	public default void setBackgroundColor(Color color) {
		Background bg = this.getBackground();
		bg.setColor(color);
		this.setBackground(bg);
	}
	
	public default Color getBackgroundColor() {
		return this.getBackground().getColor();
	}
}