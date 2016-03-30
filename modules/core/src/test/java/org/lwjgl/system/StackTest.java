/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.testng.annotations.Test;

import static org.lwjgl.system.MemoryStack.*;
import static org.testng.Assert.*;

@Test
public class StackTest {

	public void testPushPop() {
		MemoryStack stack = stackGet();

		int size = stack.getSize();

		assertEquals(stack.getPointer(), size);
		assertEquals(stack.getFrameIndex(), 0);

		stack.push();
		{
			stack.malloc(8);
			assertEquals(stack.getPointer(), size - 8);
			assertEquals(stack.getFrameIndex(), 1);
		}
		stack.pop();

		assertEquals(stack.getPointer(), size);
		assertEquals(stack.getFrameIndex(), 0);
	}

	public void testAlignment() {
		MemoryStack stack = stackGet();

		int size = stack.getSize();

		assertEquals(stack.getPointer(), size);

		stack.push();
		try {
			stack.malloc(1);
			assertEquals(stack.getPointer(), size - 1);
		} finally {
			stack.pop();
		}

		stack.push();
		try {
			stack.malloc(1);
			stack.mallocShort(1);
			assertEquals(stack.getPointer(), size - 4);
		} finally {
			stack.pop();
		}

		stack.push();
		try {
			stack.malloc(1);
			stack.mallocInt(1);
			assertEquals(stack.getPointer(), size - 8);
		} finally {
			stack.pop();
		}

		stack.push();
		try {
			stack.malloc(1);
			stack.mallocLong(1);
			assertEquals(stack.getPointer(), size - 16);
		} finally {
			stack.pop();
		}
	}

	@Test(expectedExceptions = OutOfMemoryError.class)
	public void testOOME() {
		MemoryStack stack = new MemoryStack(8);

		stack.push();
		stack.malloc(8);
		stack.malloc(1);
		stack.pop();
	}

	@Test(expectedExceptions = StackOverflowError.class)
	public void testSOE() {
		MemoryStack stack = MemoryStack.create();

		// Test growing of the stack frame array,
		// the Java stack should overflow before we have any issues
		recursivePush(stack);
	}

	private static void recursivePush(MemoryStack stack) {
		stack.push();
		recursivePush(stack);
	}

}