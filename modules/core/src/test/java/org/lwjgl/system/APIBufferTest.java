/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.testng.annotations.Test;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.APIUtil.*;
import static org.testng.Assert.*;

@Test
public class APIBufferTest {

	public void testAlignment() {
		APIBuffer __buffer = apiBuffer();

		int b = __buffer.byteParam();
		assertEquals(b, 0);

		int s = __buffer.shortParam();
		__buffer.byteParam();

		int i = __buffer.intParam();
		__buffer.byteParam();

		int l = __buffer.longParam();
		__buffer.byteParam();

		int f = __buffer.floatParam();
		__buffer.byteParam();

		int d = __buffer.doubleParam();
		__buffer.byteParam();

		int p = __buffer.pointerParam();
		__buffer.byteParam();

		assertTrue(s % 2 == 0);
		assertTrue(i % 4 == 0);
		assertTrue(l % 8 == 0);
		assertTrue(f % 4 == 0);
		assertTrue(d % 8 == 0);
		assertTrue(p % POINTER_SIZE == 0);
	}

	public void testReset() {
		APIBuffer __buffer = apiBuffer();

		int x = __buffer.intParam();
		int y = __buffer.intParam();

		assertEquals(x, 0);
		assertEquals(y, 4);

		apiBuffer();

		x = __buffer.intParam();
		y = __buffer.intParam();

		assertEquals(x, 0);
		assertEquals(y, 4);
	}

	public void testStack() {
		APIBuffer __buffer = apiBuffer();

		int x = __buffer.intParam();
		int y = __buffer.intParam();

		assertEquals(x, 0);
		assertEquals(y, 4);

		{
			APIBuffer nestedBuffer = apiStack();

			int z = nestedBuffer.intParam();
			int w = nestedBuffer.intParam();

			assertEquals(z, 8);
			assertEquals(w, 12);

			nestedBuffer.pop();
		}

		int z = __buffer.intParam();
		int w = __buffer.intParam();

		assertEquals(z, 8);
		assertEquals(w, 12);
	}

	public void testStackAlignment() {
		APIBuffer __buffer = apiBuffer();

		int x = __buffer.shortParam();
		int y = __buffer.byteParam();

		assertEquals(x, 0);
		assertEquals(y, 2);

		{
			APIBuffer nestedBuffer = apiStack();

			int z = nestedBuffer.intParam();
			int w = nestedBuffer.intParam();

			assertEquals(z, POINTER_SIZE);
			assertEquals(w, POINTER_SIZE + 4);

			nestedBuffer.pop();
		}

		int z = __buffer.intParam();
		int w = __buffer.intParam();

		assertEquals(z, 4);
		assertEquals(w, 8);
	}

}