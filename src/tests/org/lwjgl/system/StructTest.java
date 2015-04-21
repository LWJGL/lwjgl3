/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.libffi.FFIType;
import org.lwjgl.system.linux.X;
import org.lwjgl.system.linux.XColor;
import org.lwjgl.system.linux.XGCValues;
import org.lwjgl.system.windows.GLYPHMETRICSFLOAT;
import org.lwjgl.system.windows.POINTFLOAT;
import org.lwjgl.system.windows.WNDCLASSEX;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.testng.Assert.*;

@Test
public class StructTest {

	public void testStructLayout() {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS: {
				GLYPHMETRICSFLOAT s = new GLYPHMETRICSFLOAT();

				assertEquals(GLYPHMETRICSFLOAT.SIZEOF, 24);
				assertEquals(s.buffer().capacity(), GLYPHMETRICSFLOAT.SIZEOF);

				assertEquals(GLYPHMETRICSFLOAT.BLACKBOXX, 0);
				assertEquals(GLYPHMETRICSFLOAT.BLOCKBOXY, 4);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN, 8);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN + POINTFLOAT.X, 8);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN + POINTFLOAT.Y, 12);
				assertEquals(GLYPHMETRICSFLOAT.CELLINCX, 16);
				assertEquals(GLYPHMETRICSFLOAT.CELLINCY, 20);
				break;
			}

			case LINUX: {
				XColor s = new XColor();

				assertEquals(XColor.SIZEOF, 16);
				assertEquals(s.buffer().capacity(), XColor.SIZEOF);

				assertEquals(XColor.PIXEL, 0);
				assertEquals(XColor.RED, 8);
				assertEquals(XColor.GREEN, 10);
				assertEquals(XColor.BLUE, 12);
				assertEquals(XColor.FLAGS, 14);
				assertEquals(XColor.PAD, 15);
				break;
			}
		}
	}

	public void testFields() {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS: {
				WNDCLASSEX s = new WNDCLASSEX();

				int style = 1337;
				long wndProc = (1L << 32) - 1;
				int clsExtra = 12345;
				int wndExtra = 54321;
				long instance = Integer.MAX_VALUE + 1L;
				long icon = 0x89ABCDEFL;
				long cursor = 0x76543210L;
				long background = 987654321L;
				String menuName = "menu";
				ByteBuffer menuNameEncoded = memEncodeUTF16(menuName);
				String className = "class";
				ByteBuffer classNameEncoded = memEncodeUTF16(className);
				long iconSm = 876543210L;

				s.setSize(WNDCLASSEX.SIZEOF);
				s.setStyle(style);
				s.setWndProc(wndProc);
				s.setClsExtra(clsExtra);
				s.setWndExtra(wndExtra);
				s.setInstance(instance);
				s.setIcon(icon);
				s.setCursor(cursor);
				s.setBackground(background);
				s.setMenuName(menuNameEncoded);
				s.setClassName(classNameEncoded);
				s.setIconSm(iconSm);

				assertEquals(s.getSize(), WNDCLASSEX.SIZEOF);
				assertEquals(s.getStyle(), style);
				assertEquals(s.getWndProc(), wndProc);
				assertEquals(s.getClsExtra(), clsExtra);
				assertEquals(s.getWndExtra(), wndExtra);
				assertEquals(s.getInstance(), instance);
				assertEquals(s.getIcon(), icon);
				assertEquals(s.getCursor(), cursor);
				assertEquals(s.getBackground(), background);
				assertEquals(s.getMenuNameString(), menuName);
				assertEquals(s.getClassNameString(), className);
				assertEquals(s.getIconSm(), iconSm);
				break;
			}
			case LINUX: {
				XGCValues s = new XGCValues();

				int cap_style = X.CapRound;
				int arc_mode = X.ArcPieSlice;
				byte dashes = 0x3;

				s.setCapStyle(cap_style);
				s.setArcMode(arc_mode);
				s.setDashes(dashes);

				assertEquals(s.getCapStyle(), cap_style);
				assertEquals(s.getArcMode(), arc_mode);
				assertEquals(s.getDashes(), dashes);
				break;
			}
		}

	}

	public void testStructConstructor() {
		ByteBuffer s = FFIType.malloc(4, 4, FFI_TYPE_INT, null);

		assertEquals(FFIType.size(s), 4);
		assertEquals(FFIType.alignment(s), 4);
		assertEquals(FFIType.type(s), FFI_TYPE_INT);
		assertEquals(FFIType.elements(s), NULL);
	}

	public void testStructInstance() {
		FFIType type = new FFIType();
		type.setSize(4);
		type.setAlignment(4);
		type.setType(FFI_TYPE_INT);

		ByteBuffer s = type.buffer();

		assertEquals(FFIType.size(s), 4);
		assertEquals(FFIType.alignment(s), 4);
		assertEquals(FFIType.type(s), FFI_TYPE_INT);
		assertEquals(FFIType.elements(s), NULL);
	}

}