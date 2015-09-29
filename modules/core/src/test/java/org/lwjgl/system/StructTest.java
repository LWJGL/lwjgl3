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

	public void testStructContainer() {
		ByteBuffer c = memAlloc(FFIType.SIZEOF);
		FFIType.setSize(c, 4);
		FFIType.setAlignment(c, 8);
		FFIType.setType(c, FFI_TYPE_INT);
		FFIType.setElements(c, null);

		assertEquals(FFIType.getSize(c), 4);
		assertEquals(FFIType.getAlignment(c), 8);
		assertEquals(FFIType.getType(c), FFI_TYPE_INT);
		assertEquals(FFIType.getElements(c, 0), null);

		memFree(c);
	}

	public void testStructInstance() {
		FFIType s = FFIType.malloc().set(4, 8, FFI_TYPE_INT, null);

		assertEquals(s.getSize(), 4);
		assertEquals(s.getAlignment(), 8);
		assertEquals(s.getType(), FFI_TYPE_INT);
		assertEquals(s.getElements(0), null);

		s.free();
	}

	public void testStructBuffer() {
		FFIType.Buffer b = FFIType.callocBuffer(1);

		// copy
		FFIType copy = FFIType.malloc();
		memSet(copy.address(), 0xFF, FFIType.SIZEOF); // garbage
		b.get(0, copy); // calloc above has filled with zeroes

		// view
		FFIType view = b.get(0);

		// flyweight API
		b
			.setSize(4)
			.setAlignment(8)
			.setType(FFI_TYPE_INT)
			.setElements(null);

		// buffer changed
		assertEquals(b.getSize(), 4);
		assertEquals(b.getAlignment(), 8);
		assertEquals(b.getType(), FFI_TYPE_INT);
		assertEquals(b.getElements(0), null);

		// view changed
		assertEquals(view.getSize(), 4);
		assertEquals(view.getAlignment(), 8);
		assertEquals(view.getType(), FFI_TYPE_INT);
		assertEquals(view.getElements(0), null);

		// copy not changed
		assertEquals(copy.getSize(), 0);
		assertEquals(copy.getAlignment(), 0);
		assertEquals(copy.getType(), NULL);
		assertEquals(copy.getElements(0), null);

		memFree(b);
	}

}