/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.lwjgl.*;
import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCString.*;

@State(Scope.Benchmark)
public class MemSetTest {

    private static final Unsafe UNSAFE = Bench.getUnsafeInstance();

    private static final int ARRAY_COUNT = 2048;
    private static final int MAX_SIZE    = 260;

    private byte[][]      arrays;
    private PointerBuffer buffers;
    private int[]         offsets;

    @Param("0")
    private byte value;

    @Setup
    public void setup() {
        Random rand = new Random(7);

        arrays = new byte[ARRAY_COUNT][];
        buffers = memAllocPointer(ARRAY_COUNT);
        offsets = new int[ARRAY_COUNT];
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int len = 8 + rand.nextInt(MAX_SIZE - 8);

            arrays[i] = new byte[len];
            buffers.put(i, nmemAlloc(len));
            offsets[i] = i % 4 != 0 ? 0 : (1 + rand.nextInt(7)); // 25% unaligned head
        }
    }

    @TearDown
    public void tearDown() {
        for (int i = 0; i < buffers.capacity(); i++) {
            nmemFree(buffers.get(i));
        }
        buffers.free();
    }

    @Benchmark
    public void offheap_LWJGL() {
        for (int i = 0; i < buffers.capacity(); i++) {
            int offset = offsets[i];
            memSet(buffers.get(i) + offset, value, arrays[i].length - offset);
        }
    }

    @Benchmark
    public void offheap_baseline() {
        for (int i = 0; i < buffers.capacity(); i++) {
            int offset = offsets[i];
            UNSAFE.setMemory(null, buffers.get(i) + offset, arrays[i].length - offset, value);
        }
    }

    @Benchmark
    public void offheap_libc() {
        for (int i = 0; i < buffers.capacity(); i++) {
            int offset = offsets[i];
            nmemset(buffers.get(i) + offset, value, arrays[i].length - offset);
        }
    }

    @Benchmark
    public void array_baseline() {
        for (int i = 0; i < arrays.length; i++) {
            byte[] array  = arrays[i];
            int    offset = offsets[i];
            Arrays.fill(array, offset, array.length, value);
        }
    }

}