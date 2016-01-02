package net.prefixaut.deadalus.support;

import net.prefixaut.deadalus.styles.TextDecoration;
import net.prefixaut.deadalus.styles.TextDecorationStyle;

public interface TextDecorationSupport {
	
	public void setTextDecoration(TextDecoration decoration);
	
	public TextDecoration getTextDecoration();
	
	public void setTextDecorationStyle(TextDecorationStyle style);
	
	public TextDecorationStyle getTextDecorationStlye();
}