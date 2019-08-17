/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.util.meow.*;
import org.openjdk.jmh.annotations.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.meow.Meow.*;
import static org.lwjgl.util.xxhash.XXHash.*;
import static org.testng.Assert.*;

/** Benchmark of non-cryptographic hashes. */
@State(Scope.Benchmark)
public class HashingTest {

    @Param({"32", "512", "8192"})
    private int length;

    private ByteBuffer buffer;
    private MeowHash   hash;

    @Setup
    public void setup() {
        buffer = memAlignedAlloc(16, length);

        Random rand = new Random(13);
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i, (byte)(rand.nextInt() & 0xFF));
        }

        hash = MeowHash.create(nmemAlignedAlloc(MeowHash.ALIGNOF, MeowHash.SIZEOF));

        assertEquals(xxhashJava(), xxhash());
    }

    @TearDown
    public void tearDown() {
        nmemAlignedFree(hash.address());
        memAlignedFree(buffer);
    }

    @Benchmark
    public long java() {
        //return buffer.hashCode();

        long h = 0L;

        long a = memAddress(buffer);

        int i = 0, len = buffer.remaining();
        for (; i + 8 <= len; i += 8) {
            h = 31L * 31L * 31L * 31L * 31L * 31L * 31L * 31L * h
                + 31L * 31L * 31L * 31L * 31L * 31L * 31L * (memGetByte(a + i + 0) & 0xFFL)
                + 31L * 31L * 31L * 31L * 31L * 31L * (memGetByte(a + i + 1) & 0xFFL)
                + 31L * 31L * 31L * 31L * 31L * (memGetByte(a + i + 2) & 0xFFL)
                + 31L * 31L * 31L * 31L * (memGetByte(a + i + 3) & 0xFFL)
                + 31L * 31L * 31L * (memGetByte(a + i + 4) & 0xFFL)
                + 31L * 31L * (memGetByte(a + i + 5) & 0xFFL)
                + 31L * (memGetByte(a + i + 6) & 0xFFL)
                + (memGetByte(a + i + 7) & 0xFFL);
        }
        for (; i < len; i++) {
            h = 31L * h + (memGetByte(a + i) & 0xFFL);
        }

        return h;
    }

    @Benchmark
    public long meow() {
        return MeowHash_Accelerated(7, buffer, hash).u64(0);
    }

    @Benchmark
    public long xxhash() {
        return XXH64(buffer, 7);
    }

    @Benchmark
    public long xxhash3() {
        return XXH3_64bits_withSeed(buffer, 7);
    }

    @Benchmark
    public long xxhashJava() {
        return XXH64Java(memAddress(buffer), buffer.remaining(), 7);
    }

    // ------------------------------------------
    // xxHash port to Java, aligned 64-bits only.
    // ------------------------------------------

    private static final long PRIME64_1 = 0x9E3779B185EBCA87L;
    private static final long PRIME64_2 = 0xC2B2AE3D27D4EB4FL;
    private static final long PRIME64_3 = 0x165667B19E3779F9L;
    private static final long PRIME64_4 = 0x85EBCA77C2B2AE63L;
    private static final long PRIME64_5 = 0x27D4EB2F165667C5L;

    private static long XXH64Java(long input, int length, long seed) {
        long h64;

        int p = 0;
        if (32 <= length) {
            long v1 = seed + PRIME64_1 + PRIME64_2;
            long v2 = seed + PRIME64_2;
            long v3 = seed + 0;
            long v4 = seed - PRIME64_1;

            do {
                v1 = XXH64_round(v1, memGetLong(input + p + 0));
                v2 = XXH64_round(v2, memGetLong(input + p + 8));
                v3 = XXH64_round(v3, memGetLong(input + p + 16));
                v4 = XXH64_round(v4, memGetLong(input + p + 24));
                p += 32;
            } while (p <= length - 32);

            h64 = Long.rotateLeft(v1, 1) +
                  Long.rotateLeft(v2, 7) +
                  Long.rotateLeft(v3, 12) +
                  Long.rotateLeft(v4, 18);

            h64 = XXH64_mergeRound(h64, v1);
            h64 = XXH64_mergeRound(h64, v2);
            h64 = XXH64_mergeRound(h64, v3);
            h64 = XXH64_mergeRound(h64, v4);
        } else {
            h64 = seed + PRIME64_5;
        }

        return XXH64_finalize(h64 + length, input + p, length);
    }

    private static long XXH64_round(long acc, long input) {
        acc += input * PRIME64_2;
        acc = Long.rotateLeft(acc, 31);
        acc *= PRIME64_1;
        return acc;
    }

    private static long XXH64_mergeRound(long acc, long val) {
        val = XXH64_round(0, val);
        acc ^= val;
        acc = acc * PRIME64_1 + PRIME64_4;
        return acc;
    }

    @SuppressWarnings("fallthrough")
    private static long XXH64_finalize(long h64, long ptr, int length) {
        long p = ptr;

        switch (length & 31) {
            case 24:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 16:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 8:
                h64 = PROCESS8_64(p, h64);
                return XXH64_avalanche(h64);

            case 28:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 20:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 12:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 4:
                h64 = PROCESS4_64(p, h64);
                return XXH64_avalanche(h64);

            case 25:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 17:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 9:
                h64 = PROCESS8_64(p, h64);
                h64 = PROCESS1_64(p + 8, h64);
                return XXH64_avalanche(h64);

            case 29:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 21:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 13:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 5:
                h64 = PROCESS4_64(p, h64);
                h64 = PROCESS1_64(p + 4, h64);
                return XXH64_avalanche(h64);

            case 26:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 18:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 10:
                h64 = PROCESS8_64(p, h64);
                h64 = PROCESS1_64(p + 8, h64);
                h64 = PROCESS1_64(p + 9, h64);
                return XXH64_avalanche(h64);

            case 30:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 22:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 14:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 6:
                h64 = PROCESS4_64(p, h64);
                h64 = PROCESS1_64(p + 4, h64);
                h64 = PROCESS1_64(p + 5, h64);
                return XXH64_avalanche(h64);

            case 27:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 19:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 11:
                h64 = PROCESS8_64(p, h64);
                h64 = PROCESS1_64(p + 8, h64);
                h64 = PROCESS1_64(p + 9, h64);
                h64 = PROCESS1_64(p + 10, h64);
                return XXH64_avalanche(h64);

            case 31:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 23:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 15:
                h64 = PROCESS8_64(p, h64);
                p += 8;
            case 7:
                h64 = PROCESS4_64(p, h64);
                p += 4;
            case 3:
                h64 = PROCESS1_64(p, h64);
                p++;
            case 2:
                h64 = PROCESS1_64(p, h64);
                p++;
            case 1:
                h64 = PROCESS1_64(p, h64);
            case 0:
                return XXH64_avalanche(h64);
        }

        // impossible to reach
        return 0;
    }

    private static long PROCESS1_64(long p, long h64) {
        h64 ^= (memGetByte(p) & 0xFFL) * PRIME64_5;
        return Long.rotateLeft(h64, 11) * PRIME64_1;
    }

    private static long PROCESS4_64(long p, long h64) {
        h64 ^= Integer.toUnsignedLong(memGetInt(p)) * PRIME64_1;
        return Long.rotateLeft(h64, 23) * PRIME64_2 + PRIME64_3;
    }

    private static long PROCESS8_64(long p, long h64) {
        long k1 = XXH64_round(0, memGetLong(p));
        h64 ^= k1;
        return Long.rotateLeft(h64, 27) * PRIME64_1 + PRIME64_4;
    }

    private static long XXH64_avalanche(long h64) {
        h64 ^= h64 >>> 33;
        h64 *= PRIME64_2;
        h64 ^= h64 >>> 29;
        h64 *= PRIME64_3;
        h64 ^= h64 >>> 32;
        return h64;
    }

}
