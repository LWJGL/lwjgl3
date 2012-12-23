package org.lwjgl.system.windows;

import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.testng.Assert.*;

@Test
public class StructTest {

	public void testStructLayout() {
		final ByteBuffer gmf = GLYPHMETRICSFLOAT.malloc();

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

}