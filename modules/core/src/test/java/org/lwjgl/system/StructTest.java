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