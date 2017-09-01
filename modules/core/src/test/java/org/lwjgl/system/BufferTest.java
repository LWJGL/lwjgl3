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

}
