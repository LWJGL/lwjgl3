package org.eclipse.fx.drift.internal;

import com.sun.javafx.font.PGFont;
import com.sun.javafx.scene.text.FontHelper;

import javafx.scene.text.Font;

public class DriftUtil {

	public static PGFont getFont(Font font) {
		System.err.println("Java 11 :: getFont");
		return (PGFont) FontHelper.getNativeFont(font);
	}
}
