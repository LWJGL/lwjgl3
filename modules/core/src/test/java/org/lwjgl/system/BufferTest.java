/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.jni.*;
import org.testng.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class BufferTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testLargeBufferNIO() {
        // ByteBuffer.allocateDirect supports up to Integer.MAX_VALUE bytes
        BufferUtils.createShortBuffer(0x3FFFFFFF + 1);
    }

    public static void testLargeBuffer() {
        ShortBuffer buffer = memCallocShort(0x3FFFFFFF + 1);
        if (buffer == null) {
            throw new SkipException("Large buffer allocation failed."); // 32-bit JVM
        }

        buffer.put(buffer.limit() - 1, (short)0xBEEF);
        assertEquals(buffer.get(buffer.limit() - 1), (short)0xBEEF);

        memFree(buffer);
    }

    private static long fillBuffer(JNINativeMethod.Buffer buffer) {
        long sum = 0;
        for (int i = 0; i < buffer.remaining(); i++) {
            buffer.get(i).fnPtr(i + 1);
            sum += (i + 1);
        }
        return sum;
    }

    public void testStructBufferIterable() {
        JNINativeMethod.Buffer buffer = JNINativeMethod.calloc(10);

        long expected = fillBuffer(buffer);
        long actual   = 0;
        for (JNINativeMethod struct : buffer) {
            actual += struct.fnPtr();
        }

        assertEquals(actual, expected);

        buffer.free();
    }

    public void testStructBufferStream() {
        JNINativeMethod.Buffer buffer = JNINativeMethod.calloc(10);

        long expected = fillBuffer(buffer);
        long actual = buffer
            .stream()
            .mapToLong(JNINativeMethod::fnPtr)
            .sum();

        assertEquals(actual, expected);

        buffer.free();
    }

    public void testStructBufferParallelStream() {
        JNINativeMethod.Buffer buffer = JNINativeMethod.calloc(10 * 1024);

        long expected = fillBuffer(buffer);
        long actual = buffer
            .parallelStream()
            .mapToLong(JNINativeMethod::fnPtr)
            .sum();

        assertEquals(actual, expected);

        buffer.free();
    }

}
