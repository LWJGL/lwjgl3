/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.opencl.cl_buffer_region;
import org.lwjgl.system.windows.GLYPHMETRICSFLOAT;
import org.lwjgl.system.windows.WNDCLASSEX;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.testng.Assert.*;

@Test
public class StructTest {

	public void testStructLayout() {
		ByteBuffer gmf = GLYPHMETRICSFLOAT.malloc();

		assertEquals(GLYPHMETRICSFLOAT.SIZEOF, 24);
		assertEquals(gmf.capacity(), GLYPHMETRICSFLOAT.SIZEOF);

		assertEquals(GLYPHMETRICSFLOAT.BLACKBOXX, 0);
		assertEquals(GLYPHMETRICSFLOAT.BLOCKBOXY, 4);
		assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN, 8);
		assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN_X, 8);
		assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN_Y, 12);
		assertEquals(GLYPHMETRICSFLOAT.CELLINCX, 16);
		assertEquals(GLYPHMETRICSFLOAT.CELLINCY, 20);
	}

	public void testFields() {
		ByteBuffer in = WNDCLASSEX.malloc();

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

		WNDCLASSEX.sizeSet(in, WNDCLASSEX.SIZEOF);
		WNDCLASSEX.styleSet(in, style);
		WNDCLASSEX.wndProcSet(in, wndProc);
		WNDCLASSEX.clsExtraSet(in, clsExtra);
		WNDCLASSEX.wndExtraSet(in, wndExtra);
		WNDCLASSEX.instanceSet(in, instance);
		WNDCLASSEX.iconSet(in, icon);
		WNDCLASSEX.cursorSet(in, cursor);
		WNDCLASSEX.backgroundSet(in, background);
		WNDCLASSEX.menuNameSet(in, menuName);
		WNDCLASSEX.classNameSet(in, className);
		WNDCLASSEX.iconSmSet(in, iconSm);

		assertEquals(WNDCLASSEX.sizeGet(in), WNDCLASSEX.SIZEOF);
		assertEquals(WNDCLASSEX.styleGet(in), style);
		assertEquals(WNDCLASSEX.wndProcGet(in), wndProc);
		assertEquals(WNDCLASSEX.clsExtraGet(in), clsExtra);
		assertEquals(WNDCLASSEX.wndExtraGet(in), wndExtra);
		assertEquals(WNDCLASSEX.instanceGet(in), instance);
		assertEquals(WNDCLASSEX.iconGet(in), icon);
		assertEquals(WNDCLASSEX.cursorGet(in), cursor);
		assertEquals(WNDCLASSEX.backgroundGet(in), background);
		assertEquals(WNDCLASSEX.menuNameGets(in), menuName);
		assertEquals(WNDCLASSEX.classNameGets(in), className);
		assertEquals(WNDCLASSEX.iconSmGet(in), iconSm);
	}

	public void testStructConstructor() {
		ByteBuffer br = cl_buffer_region.malloc(1337, 80085);

		assertEquals(cl_buffer_region.originGet(br), 1337);
		assertEquals(cl_buffer_region.sizeGet(br), 80085);
	}

}