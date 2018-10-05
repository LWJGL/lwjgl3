/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCString.*;

@State(Scope.Benchmark)
public class MemSetTest {

    private static final Unsafe UNSAFE = Bench.getUnsafeInstance();

    private static final int BUFFER_SIZE = 128 * 1024;

    private static final long m = nmemAlignedAlloc(64, BUFFER_SIZE);

    private static final byte[] a = new byte[BUFFER_SIZE];

    @Param({"32", "256", "1024"})
    public int length;

    @Benchmark
    public void offheap_LWJGL() {
        memSet(m, 0, length);
    }

    @Benchmark
    public void offheap_baseline() {
        UNSAFE.setMemory(null, m, length, (byte)0);
    }

    @Benchmark
    public void offheap_java() {
        memSetLoop(m, (byte)0, length);
    }

    @Benchmark
    public void offheap_libc() {
        nmemset(m, 0, length);
    }

    @Benchmark
    public void array_baseline() {
        Arrays.fill(a, 0, length, (byte)0);
    }

    @Benchmark
    public void array_libc() {
        nmemset(a, 0, length);
    }

    private static void memSetLoop(long dst, byte value, int bytes) {
        int i = 0;

        int  misalignment = (int)dst & 7;
        long fill         = fill(value);

        if (8 <= bytes) {
            if (misalignment != 0) {
                UNSAFE.putLong(null, dst - misalignment, merge(UNSAFE.getLong(null, dst - misalignment), fill, shr(-1L, misalignment)));
                i += 8 - misalignment;
            }

            // Aligned longs for performance
            for (; i <= bytes - 8; i += 8) {
                UNSAFE.putLong(null, dst + i, fill);
            }
        } else if (misalignment != 0 && 0 < bytes) {
            UNSAFE.putLong(null, dst - misalignment, merge(UNSAFE.getLong(null, dst - misalignment), fill, shr(shl(-1L, 8 - bytes), misalignment)));
            i += 8 - misalignment;
        }

        // Aligned tail
        if (i < bytes) {
            UNSAFE.putLong(null, dst + i, merge(UNSAFE.getLong(null, dst + i), fill, shl(-1L, 8 - (bytes - i))));
        }
    }

    private static long shl(long value, int bytes) {
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            return value << (bytes << 3);
        } else {
            return value >>> (bytes << 3);
        }
    }

    private static long shr(long value, int bytes) {
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            return value >>> (bytes << 3);
        } else {
            return value << (bytes << 3);
        }
    }

    private static long merge(long a, long b, long mask) {
        return a ^ ((a ^ b) & mask);
    }

    private static long fill(byte value) {
        long fill = value;

        if (value != 0) {
            fill |= fill << 8;
            fill |= fill << 16;
            fill |= fill << 32;
        }

        return fill;
    }

}