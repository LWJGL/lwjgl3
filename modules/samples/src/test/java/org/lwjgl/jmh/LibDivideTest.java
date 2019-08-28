/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.system.*;
import org.lwjgl.util.libdivide.*;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.*;

import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.libdivide.LibDivide.*;
import static org.testng.Assert.*;

@State(Scope.Benchmark)
public class LibDivideTest {

    @Param(value = {"1024"})
    private int size;

    @Param(value = {"3"})
    private int denom;

    private int[]  numers32;
    private long[] numers64;

    @Setup
    public void setup() {
        numers32 = new int[size];
        numers64 = new long[size];

        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < numers32.length; i++) {
            numers32[i] = rand.nextInt();
        }
        for (int i = 0; i < numers64.length; i++) {
            numers64[i] = rand.nextLong();
        }

        int ref32 = s32();
        assertEquals(s32_1_do(), ref32);
        assertEquals(s32_2_branchfree(), ref32);

        ref32 = u32();
        assertEquals(u32_1_do(), ref32);
        assertEquals(u32_2_branchfree(), ref32);

        long ref64 = s64();
        assertEquals(s64_1_do(), ref64);
        assertEquals(s64_2_branchfree(), ref64);

        ref64 = u64();
        assertEquals(u64_1_do(), ref64);
        assertEquals(u64_2_branchfree(), ref64);
    }

    // ----------------------------------------------------------------
    // ---------------------------- 32-bit ----------------------------
    // ----------------------------------------------------------------

    @Benchmark
    public int s32() {
        int sum = 0;
        for (int n : numers32) {
            sum += n / denom;
        }
        return sum;
    }

    @Benchmark
    public int s32_1_do() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS32 magic = LibDivideS32.mallocStack(stack);
            libdivide_s32_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_s32_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public int s32_2_branchfree() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS32BranchFree magic = LibDivideS32BranchFree.mallocStack(stack);
            libdivide_s32_branchfree_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_s32_branchfree_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public int u32() {
        int sum = 0;
        for (int n : numers32) {
            sum += Integer.divideUnsigned(n, denom);
        }
        return sum;
    }

    @Benchmark
    public int u32_1_do() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU32 magic = LibDivideU32.mallocStack(stack);
            libdivide_u32_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_u32_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public int u32_2_branchfree() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU32BranchFree magic = LibDivideU32BranchFree.mallocStack(stack);
            libdivide_u32_branchfree_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_u32_branchfree_do(n, magic);
            }
        }
        return sum;
    }

    // ----------------------------------------------------------------
    // ---------------------------- 64-bit ----------------------------
    // ----------------------------------------------------------------

    @Benchmark
    public long s64() {
        long sum = 0;
        for (long n : numers64) {
            sum += n / denom;
        }
        return sum;
    }

    @Benchmark
    public long s64_1_do() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS64 magic = LibDivideS64.mallocStack(stack);
            libdivide_s64_gen(denom, magic);
            for (long n : numers64) {
                sum += libdivide_s64_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public long s64_2_branchfree() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS64BranchFree magic = LibDivideS64BranchFree.mallocStack(stack);
            libdivide_s64_branchfree_gen(denom, magic);
            for (long n : numers64) {
                sum += libdivide_s64_branchfree_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public long u64() {
        long sum = 0;
        for (long n : numers64) {
            sum += mathDivideUnsigned(n, denom);
        }
        return sum;
    }

    @Benchmark
    public long u64_1_do() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU64 magic = LibDivideU64.mallocStack(stack);
            libdivide_u64_gen(denom, magic);
            for (long n : numers64) {
                sum += libdivide_u64_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public long u64_2_branchfree() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU64BranchFree magic = LibDivideU64BranchFree.mallocStack(stack);
            libdivide_u64_branchfree_gen(denom, magic);
            for (long n : numers64) {
                sum += libdivide_u64_branchfree_do(n, magic);
            }
        }
        return sum;
    }

}
