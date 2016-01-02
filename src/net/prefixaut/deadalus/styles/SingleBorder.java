package net.prefixaut.deadalus.styles;

import java.io.Serializable;

@SuppressWarnings("rawtypes")
interface SingleBorder<T extends SingleBorder> extends Style, Animatable<T>, Serializable {}