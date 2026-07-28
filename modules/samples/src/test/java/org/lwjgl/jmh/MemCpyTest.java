/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

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

    @Param({"32", "160", "256", "1024"})
    public int length;

    @Benchmark
    public void offheap_LWJGL() {
        memCopy(f, t, length);
    }

    @Benchmark
    public void offheap_baseline() {
        // Much better performance on Java 16+
        //UNSAFE.copyMemory(null, f, null, t, length);

        // TODO: reevaluate in future JDKs

        // On x64, set/copyMemory have degraded performance with even byte counts (>2x slower).
        // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
        // Does not hurt on non-x64.
        long lastByteIndex = length - 1L;
        UNSAFE.copyMemory(null, f, null, t, lastByteIndex + (length & 1L));
        UNSAFE.putByte(null, t + lastByteIndex, UNSAFE.getByte(null, f + lastByteIndex));
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

}
