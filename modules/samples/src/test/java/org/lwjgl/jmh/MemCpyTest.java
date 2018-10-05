/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCString.*;

@State(Scope.Benchmark)
public class MemCpyTest {

    private static final Unsafe UNSAFE = Bench.getUnsafeInstance();

    private static final int BUFFER_SIZE = 128 * 1024;

    private static final long f = nmemAlloc(BUFFER_SIZE);
    private static final long t = nmemAlloc(BUFFER_SIZE);

    private static final byte[] a = new byte[BUFFER_SIZE];
    private static final byte[] b = new byte[BUFFER_SIZE];

    @Param({"32", "256", "1024"})
    public int length;

    @Benchmark
    public void offheap_LWJGL() {
        memCopy(f, t, length);
    }

    @Benchmark
    public void offheap_baseline() {
        UNSAFE.copyMemory(null, f, null, t, length);
    }

    @Benchmark
    public void offheap_java() {
        memCopyAligned(f, t, length);
    }

    @Benchmark
    public void offheap_libc() {
        nmemcpy(t, f, length);
    }

    @Benchmark
    public void array_baseline() {
        System.arraycopy(a, 0, b, 0, length);
    }

    @Benchmark
    public void array_libc() {
        nmemcpy(b, a, length);
    }

    private static void memCopyAligned(long src, long dst, int bytes) {
        int i = 0;

        // Aligned longs for performance
        for (; i <= bytes - 8; i += 8) {
            UNSAFE.putLong(null, dst + i, UNSAFE.getLong(null, src + i));
        }

        // Aligned tail
        if (i < bytes) {
            UNSAFE.putLong(null, dst + i, merge(
                UNSAFE.getLong(null, src + i),
                UNSAFE.getLong(null, dst + i),
                shr(-1L, bytes - i)
            ));
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

}
