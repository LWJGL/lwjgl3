package org.eclipse.fx.drift.internal;

import com.sun.javafx.font.PGFont;

import javafx.scene.text.Font;

public class DriftUtil {
	public static PGFont getFont(Font font) {
		return (PGFont) font.impl_getNativeFont();
	}
}
