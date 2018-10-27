/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.testng.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
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

        for (int i = 0; i < 32; i++) {
            int pot = 1 << i;
            if (size <= pot) {
                break;
            }
            try (MemoryStack frame = stack.push()) {
                frame.nmalloc(1);
                assertEquals(frame.nmalloc(pot, pot) & (pot - 1), 0);
            }
        }
    }

    public void testExternalMemory() {
        ByteBuffer buffer = memAlloc(32);
        for (int i = 0; i < 8; i++) {
            buffer.putInt(i * 4, i);
        }

        MemoryStack stack = MemoryStack.create(buffer);

        try (MemoryStack frame = stack.push()) {
            IntBuffer pi = frame.mallocInt(8);
            for (int i = 0; i < pi.capacity(); i++) {
                assertEquals(pi.get(i), i);
            }
        }

        try (MemoryStack frame = stack.push()) {
            IntBuffer pi = frame.callocInt(8);
            for (int i = 0; i < pi.capacity(); i++) {
                assertEquals(pi.get(i), 0);
            }
        }

        for (int i = 0; i < 8; i++) {
            assertEquals(buffer.get(i * 4), 0);
        }

        memFree(buffer);
    }

    public void testOOME() {
        if (!CHECKS) {
            throw new SkipException("This test may not run with checks disabled.");
        }

        expectThrows(OutOfMemoryError.class, () -> {
            try (MemoryStack stack = MemoryStack.create(8).push()) {
                stack.malloc(8);
                stack.malloc(1);
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
        recursivePush(stack.push());
    }

}