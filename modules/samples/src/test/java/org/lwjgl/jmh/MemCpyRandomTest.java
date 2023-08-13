/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.*;
import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCString.*;

@State(Scope.Benchmark)
public class MemCpyRandomTest {

    private static final Unsafe UNSAFE = Bench.getUnsafeInstance();

    private static final int ARRAY_COUNT = 512;
    private static final int MAX_SIZE    = 32;

    private byte[][]      arraySRC;
    private byte[][]      arrayTRG;
    private PointerBuffer bufferSRC;
    private PointerBuffer bufferTRG;

    private int[] offsets;

    @Setup
    public void setup() {
        Random rand = new Random(7);

        arraySRC = new byte[ARRAY_COUNT][];
        arrayTRG = new byte[ARRAY_COUNT][];

        bufferSRC = memAllocPointer(ARRAY_COUNT);
        bufferTRG = memAllocPointer(ARRAY_COUNT);

        offsets = new int[ARRAY_COUNT];

        for (int i = 0; i < ARRAY_COUNT; i++) {
            int len = 8 + rand.nextInt(MAX_SIZE - 8);

            arraySRC[i] = new byte[len];
            arrayTRG[i] = new byte[len];

            bufferSRC.put(i, nmemAlloc(len));
            bufferTRG.put(i, nmemAlloc(len));

            offsets[i] = i % 16 != 0 ? 0 : (1 + rand.nextInt(7)); // 6.25% unaligned head
        }
    }

    @TearDown
    public void tearDown() {
        for (int i = 0; i < bufferTRG.capacity(); i++) {
            nmemFree(bufferTRG.get(i));
        }
        for (int i = 0; i < bufferSRC.capacity(); i++) {
            nmemFree(bufferSRC.get(i));
        }
        bufferTRG.free();
        bufferSRC.free();
    }

    @Benchmark
    public void offheap_LWJGL() {
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int o = offsets[i];
            memCopy(bufferSRC.get(i) + o, bufferTRG.get(i) + o, arraySRC[i].length - o);
        }
    }

    @Benchmark
    public void offheap_baseline() {
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int o = offsets[i];
            UNSAFE.copyMemory(null, bufferSRC.get(i) + o, null, bufferTRG.get(i) + o, arraySRC[i].length - o);
        }
    }

    @Benchmark
    public void offheap_java() {
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int o = offsets[i];
            memCopyAligned(bufferSRC.get(i) + o, bufferTRG.get(i) + o, arraySRC[i].length - o);
        }
    }

    @Benchmark
    public void offheap_libc() {
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int o = offsets[i];
            nmemcpy(bufferTRG.get(i) + o, bufferSRC.get(i) + o, arraySRC[i].length - o);
        }
    }

    @Benchmark
    public void array_baseline() {
        for (int i = 0; i < ARRAY_COUNT; i++) {
            int o = offsets[i];
            System.arraycopy(arraySRC[i], o, arrayTRG[i], o, arraySRC[i].length - o);
        }
    }

    private static void memCopyAligned(long src, long dst, int bytes) {
        // Aligned longs for performance

        // if bytes is multiple of 8, bytes & ~7 == bytes, no tail
        // if bytes is not multiple of 8, bytes & ~7 == bytes - (bytes % 8), bytes % 8 tail
        int aligned = bytes & ~7;
        for (int i = 0; i < aligned; i += 8) {
            UNSAFE.putLong(null, dst + i, UNSAFE.getLong(null, src + i));
        }
        // Tail
        for (int i = aligned; i < bytes; i++) {
            UNSAFE.putByte(null, dst + i, UNSAFE.getByte(null, src + i));
        }
    }

}
