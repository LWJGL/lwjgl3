/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.libffi.FFIType;
import org.lwjgl.system.windows.GLYPHMETRICSFLOAT;
import org.lwjgl.system.windows.POINTFLOAT;
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
				GLYPHMETRICSFLOAT s = GLYPHMETRICSFLOAT.malloc();
				s.free();

				assertEquals(GLYPHMETRICSFLOAT.SIZEOF, 24);

				assertEquals(GLYPHMETRICSFLOAT.BLACKBOXX, 0);
				assertEquals(GLYPHMETRICSFLOAT.BLOCKBOXY, 4);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN, 8);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN + POINTFLOAT.X, 8);
				assertEquals(GLYPHMETRICSFLOAT.GLYPHORIGIN + POINTFLOAT.Y, 12);
				assertEquals(GLYPHMETRICSFLOAT.CELLINCX, 16);
				assertEquals(GLYPHMETRICSFLOAT.CELLINCY, 20);
				break;
			}
		}
	}

	public void testStructBuffer() {
		ByteBuffer s = memAlloc(FFIType.SIZEOF);
		FFIType.setSize(s, 4);
		FFIType.setAlignment(s, 8);
		FFIType.setType(s, FFI_TYPE_INT);
		FFIType.setElements(s, null);

		assertEquals(FFIType.getSize(s), 4);
		assertEquals(FFIType.getAlignment(s), 8);
		assertEquals(FFIType.getType(s), FFI_TYPE_INT);
		assertEquals(FFIType.getElements(s, 0), null);

		memFree(s);
	}

	public void testStructInstance() {
		FFIType type = FFIType.malloc().set(4, 8, FFI_TYPE_INT, null);

		assertEquals(type.getSize(), 4);
		assertEquals(type.getAlignment(), 8);
		assertEquals(type.getType(), FFI_TYPE_INT);
		assertEquals(type.getElements(0), null);

		type.free();
	}

}