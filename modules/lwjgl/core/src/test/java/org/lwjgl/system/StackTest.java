/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.testng.*;
import org.testng.annotations.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.testng.Assert.*;

@Test
public class StackTest {

    public void testPushPop() {
        MemoryStack stack = stackGet();

        int size = stack.getSize();

        assertEquals(stack.getPointer(), size);
        assertEquals(stack.getFrameIndex(), 0);

        try (MemoryStack frame = stack.push()) {
            frame.malloc(8);
            assertEquals(frame.getPointer(), size - 8);
            assertEquals(frame.getFrameIndex(), 1);
        }

        assertEquals(stack.getPointer(), size);
        assertEquals(stack.getFrameIndex(), 0);
    }

    public void testAlignment() {
        MemoryStack stack = stackGet();

        int size = stack.getSize();

        assertEquals(stack.getPointer(), size);

        try (MemoryStack frame = stack.push()) {
            frame.malloc(1);
            assertEquals(frame.getPointer(), size - 1);
        }

        try (MemoryStack frame = stack.push()) {
            frame.malloc(1);
            frame.mallocShort(1);
            assertEquals(frame.getPointer(), size - 4);
        }

        try (MemoryStack frame = stack.push()) {
            frame.malloc(1);
            frame.mallocInt(1);
            assertEquals(frame.getPointer(), size - 8);
        }

        try (MemoryStack frame = stack.push()) {
            frame.malloc(1);
            frame.mallocLong(1);
            assertEquals(frame.getPointer(), size - 16);
        }
    }

    public void testOOME() {
        if (!CHECKS) {
            throw new SkipException("This test may not run with checks disabled.");
        }

        expectThrows(OutOfMemoryError.class, () -> {
            MemoryStack stack = new MemoryStack(8);

            try (MemoryStack frame = stack.push()) {
                frame.malloc(8);
                frame.malloc(1);
            }
        });
    }

    public void testSOE() {
        expectThrows(StackOverflowError.class, () -> {
            MemoryStack stack = MemoryStack.create();

            // Test growing of the stack frame array,
            // the Java stack should overflow before we have any issues
            recursivePush(stack);
        });
    }

    private static void recursivePush(MemoryStack stack) {
        stack.push();
        recursivePush(stack);
    }

}