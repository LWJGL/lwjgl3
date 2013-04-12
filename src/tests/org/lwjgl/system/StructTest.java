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
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN_X, 8);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN_Y, 12);
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
				long wndProc = (long)Integer.MIN_VALUE - 1;
				int clsExtra = 12345;
				int wndExtra = 54321;
				long instance = (long)Integer.MAX_VALUE + 1;
				long icon = 0x0123456789ABCDEFL;
				long cursor = 0xFEDCBA9876543210L;
				long background = 1234567890987654321L;
				String menuName = "menu";
				String className = "class";
				long iconSm = 9876543210L;

				WNDCLASSEX.sizeSet(s, WNDCLASSEX.SIZEOF);
				WNDCLASSEX.styleSet(s, style);
				WNDCLASSEX.wndProcSet(s, wndProc);
				WNDCLASSEX.clsExtraSet(s, clsExtra);
				WNDCLASSEX.wndExtraSet(s, wndExtra);
				WNDCLASSEX.instanceSet(s, instance);
				WNDCLASSEX.iconSet(s, icon);
				WNDCLASSEX.cursorSet(s, cursor);
				WNDCLASSEX.backgroundSet(s, background);
				WNDCLASSEX.menuNameSet(s, menuName);
				WNDCLASSEX.classNameSet(s, className);
				WNDCLASSEX.iconSmSet(s, iconSm);

				assertEquals(WNDCLASSEX.sizeGet(s), WNDCLASSEX.SIZEOF);
				assertEquals(WNDCLASSEX.styleGet(s), style);
				assertEquals(WNDCLASSEX.wndProcGet(s), wndProc);
				assertEquals(WNDCLASSEX.clsExtraGet(s), clsExtra);
				assertEquals(WNDCLASSEX.wndExtraGet(s), wndExtra);
				assertEquals(WNDCLASSEX.instanceGet(s), instance);
				assertEquals(WNDCLASSEX.iconGet(s), icon);
				assertEquals(WNDCLASSEX.cursorGet(s), cursor);
				assertEquals(WNDCLASSEX.backgroundGet(s), background);
				assertEquals(WNDCLASSEX.menuNameGets(s), menuName);
				assertEquals(WNDCLASSEX.classNameGets(s), className);
				assertEquals(WNDCLASSEX.iconSmGet(s), iconSm);
				break;
			}
			case LINUX: {
				ByteBuffer s = XGCValues.malloc();

				int cap_style = X.CapRound;
				int arc_mode = X.ArcPieSlice;
				byte dashes = 0x3;

				XGCValues.cap_styleSet(s, cap_style);
				XGCValues.arc_modeSet(s, arc_mode);
				XGCValues.dashesSet(s, dashes);

				assertEquals(XGCValues.cap_styleGet(s), cap_style);
				assertEquals(XGCValues.arc_modeGet(s), arc_mode);
				assertEquals(XGCValues.dashesGet(s), dashes);
				break;
			}
		}

	}

	public void testStructConstructor() {
		ByteBuffer s = cl_buffer_region.malloc(1337, 80085);

		assertEquals(cl_buffer_region.originGet(s), 1337);
		assertEquals(cl_buffer_region.sizeGet(s), 80085);
	}

}