/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCString.*;
import static org.testng.Assert.*;

@State(Scope.Benchmark)
public class StrlenTest {

    private static final Unsafe UNSAFE = Bench.getUnsafeInstance();

    private static final int ARRAY_COUNT = 256;
    private static final int MAX_SIZE    = 1024;

    private ByteBuffer[] buffersAligned;
    private ByteBuffer[] buffers;

    @Setup
    public void setup() {
        Random rand = new Random(7);

        buffersAligned = new ByteBuffer[ARRAY_COUNT];
        buffers = new ByteBuffer[ARRAY_COUNT];
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int len = 8 + rand.nextInt(MAX_SIZE - 8);

            ByteBuffer buffer = memAlloc(len);
            for (int j = 0; j < len - 1; j++) {
                buffer.put(j, (byte)'a');
            }
            buffer.put(len - 1, (byte)0);

            int offset = i % 16 != 0 ? 0 : (1 + rand.nextInt(7)); // 6.25% misaligned head

            buffersAligned[i] = buffer;
            buffers[i] = memSlice(buffer, offset, len - offset);
        }

        assertEquals(lwjgl(), libc());
    }

    @TearDown
    public void tearDown() {
        for (ByteBuffer buffer : buffersAligned) {
            memFree(buffer);
        }
    }

    @Benchmark
    public long lwjgl() {
        long sum = 0L;
        for (ByteBuffer buffer : buffers) {
            sum += memLengthNT1(buffer);
        }
        return sum;
    }

    @Benchmark
    public long libc() {
        long sum = 0L;
        for (ByteBuffer buffer : buffers) {
            sum += strlen(buffer);
        }
        return sum;
    }

}