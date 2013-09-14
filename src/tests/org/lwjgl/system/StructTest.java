/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.opencl.cl_buffer_region;
import org.lwjgl.system.linux.X;
import org.lwjgl.system.linux.XColor;
import org.lwjgl.system.linux.XGCValues;
import org.lwjgl.system.windows.GLYPHMETRICSFLOAT;
import org.lwjgl.system.windows.POINTFLOAT;
import org.lwjgl.system.windows.WNDCLASSEX;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.testng.Assert.*;

@Test
public class StructTest {

	public void testStructLayout() {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS: {
				ByteBuffer s = GLYPHMETRICSFLOAT.malloc();

				assertEquals(GLYPHMETRICSFLOAT.SIZEOF, 24);
				assertEquals(s.capacity(), GLYPHMETRICSFLOAT.SIZEOF);

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
				ByteBuffer s = XColor.malloc();

				assertEquals(XColor.SIZEOF, 16);
				assertEquals(s.capacity(), XColor.SIZEOF);

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
				ByteBuffer s = WNDCLASSEX.malloc();

				int style = 1337;
				long wndProc = (1L << 32) - 1;
				int clsExtra = 12345;
				int wndExtra = 54321;
				long instance = Integer.MAX_VALUE + 1L;
				long icon = 0x89ABCDEFL;
				long cursor = 0x76543210L;
				long background = 987654321L;
				String menuName = "menu";
				String className = "class";
				long iconSm = 876543210L;

				WNDCLASSEX.size(s, WNDCLASSEX.SIZEOF);
				WNDCLASSEX.style(s, style);
				WNDCLASSEX.wndProc(s, wndProc);
				WNDCLASSEX.clsExtra(s, clsExtra);
				WNDCLASSEX.wndExtra(s, wndExtra);
				WNDCLASSEX.instance(s, instance);
				WNDCLASSEX.icon(s, icon);
				WNDCLASSEX.cursor(s, cursor);
				WNDCLASSEX.background(s, background);
				WNDCLASSEX.menuNameSet(s, menuName);
				WNDCLASSEX.classNameSet(s, className);
				WNDCLASSEX.iconSm(s, iconSm);

				assertEquals(WNDCLASSEX.size(s), WNDCLASSEX.SIZEOF);
				assertEquals(WNDCLASSEX.style(s), style);
				assertEquals(WNDCLASSEX.wndProc(s), wndProc);
				assertEquals(WNDCLASSEX.clsExtra(s), clsExtra);
				assertEquals(WNDCLASSEX.wndExtra(s), wndExtra);
				assertEquals(WNDCLASSEX.instance(s), instance);
				assertEquals(WNDCLASSEX.icon(s), icon);
				assertEquals(WNDCLASSEX.cursor(s), cursor);
				assertEquals(WNDCLASSEX.background(s), background);
				assertEquals(WNDCLASSEX.menuNameGets(s), menuName);
				assertEquals(WNDCLASSEX.classNameGets(s), className);
				assertEquals(WNDCLASSEX.iconSm(s), iconSm);
				break;
			}
			case LINUX: {
				ByteBuffer s = XGCValues.malloc();

				int cap_style = X.CapRound;
				int arc_mode = X.ArcPieSlice;
				byte dashes = 0x3;

				XGCValues.cap_style(s, cap_style);
				XGCValues.arc_mode(s, arc_mode);
				XGCValues.dashes(s, dashes);

				assertEquals(XGCValues.cap_style(s), cap_style);
				assertEquals(XGCValues.arc_mode(s), arc_mode);
				assertEquals(XGCValues.dashes(s), dashes);
				break;
			}
		}

	}

	public void testStructConstructor() {
		ByteBuffer s = cl_buffer_region.malloc(1337, 80085);

		assertEquals(cl_buffer_region.origin(s), 1337);
		assertEquals(cl_buffer_region.size(s), 80085);
	}

}