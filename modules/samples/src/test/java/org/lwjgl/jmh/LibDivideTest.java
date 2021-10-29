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

    private short[] numers16;
    private int[]   numers32;
    private long[]  numers64;

    @Setup
    public void setup() {
        numers16 = new short[size];
        numers32 = new int[size];
        numers64 = new long[size];

        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < numers16.length; i++) {
            numers16[i] = (short)rand.nextInt(1 << 16);
        }
        for (int i = 0; i < numers32.length; i++) {
            numers32[i] = rand.nextInt();
        }
        for (int i = 0; i < numers64.length; i++) {
            numers64[i] = rand.nextLong();
        }

        int ref16 = s16();
        assertEquals(s16_1_do(), ref16);
        assertEquals(s16_1_do_scalar(), ref16);
        assertEquals(s16_2_branchfree(), ref16);
        assertEquals(s16_2_branchfree_scalar(), ref16);

        ref16 = u16();
        assertEquals(u16_1_do(), ref16);
        assertEquals(u16_1_do_scalar(), ref16);
        assertEquals(u16_2_branchfree(), ref16);
        assertEquals(u16_2_branchfree_scalar(), ref16);

        int ref32 = s32();
        assertEquals(s32_1_do(), ref32);
        assertEquals(s32_1_do_scalar(), ref32);
        assertEquals(s32_2_branchfree(), ref32);
        assertEquals(s32_2_branchfree_scalar(), ref32);

        ref32 = u32();
        assertEquals(u32_1_do(), ref32);
        assertEquals(u32_1_do_scalar(), ref32);
        assertEquals(u32_2_branchfree(), ref32);
        assertEquals(u32_2_branchfree_scalar(), ref32);

        long ref64 = s64();
        assertEquals(s64_1_do(), ref64);
        assertEquals(s64_1_do_scalar(), ref64);
        assertEquals(s64_2_branchfree(), ref64);
        assertEquals(s64_2_branchfree_scalar(), ref64);

        ref64 = u64();
        assertEquals(u64_1_do(), ref64);
        assertEquals(u64_1_do_scalar(), ref64);
        assertEquals(u64_2_branchfree(), ref64);
        assertEquals(u64_2_branchfree_scalar(), ref64);
    }

    // ----------------------------------------------------------------
    // ---------------------------- 16-bit ----------------------------
    // ----------------------------------------------------------------

    @Benchmark
    public int s16() {
        int sum = 0;
        for (int n : numers16) {
            sum += (short)(n / denom);
        }
        return sum;
    }

    @Benchmark
    public int s16_1_do() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS16 s16 = LibDivideS16.malloc(stack);
            libdivide_s16_gen((short)denom, s16);
            for (short n : numers16) {
                sum += libdivide_s16_do(n, s16);
            }
        }
        return sum;
    }

    @Benchmark
    public int s16_1_do_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS16 s16 = LibDivideS16.malloc(stack);
            libdivide_s16_gen((short)denom, s16);
            short magic = s16.magic();
            byte  more  = s16.more();
            for (short n : numers16) {
                sum += libdivide_s16_do(n, magic, more);
            }
        }
        return sum;
    }

    @Benchmark
    public int s16_2_branchfree() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS16BranchFree s16 = LibDivideS16BranchFree.malloc(stack);
            libdivide_s16_branchfree_gen((short)denom, s16);
            for (short n : numers16) {
                sum += libdivide_s16_branchfree_do(n, s16);
            }
        }
        return sum;
    }

    @Benchmark
    public int s16_2_branchfree_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS16BranchFree s16 = LibDivideS16BranchFree.malloc(stack);
            libdivide_s16_branchfree_gen((short)denom, s16);
            short magic = s16.magic();
            byte  more  = s16.more();
            for (short n : numers16) {
                sum += libdivide_s16_branchfree_do(n, magic, more);
            }
        }
        return sum;
    }

    @Benchmark
    public int u16() {
        int sum = 0;
        for (short n : numers16) {
            sum += (short)(Short.toUnsignedInt(n) / Short.toUnsignedInt((short)denom));
        }
        return sum;
    }

    @Benchmark
    public int u16_1_do() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU16 u16 = LibDivideU16.malloc(stack);
            libdivide_u16_gen((short)denom, u16);
            for (short n : numers16) {
                sum += libdivide_u16_do(n, u16);
            }
        }
        return sum;
    }

    @Benchmark
    public int u16_1_do_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU16 u16 = LibDivideU16.malloc(stack);
            libdivide_u16_gen((short)denom, u16);
            short magic = u16.magic();
            byte  more  = u16.more();
            for (short n : numers16) {
                sum += libdivide_u16_do(n, magic, more);
            }
        }
        return sum;
    }

    @Benchmark
    public int u16_2_branchfree() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU16BranchFree u16 = LibDivideU16BranchFree.malloc(stack);
            libdivide_u16_branchfree_gen((short)denom, u16);
            for (short n : numers16) {
                sum += libdivide_u16_branchfree_do(n, u16);
            }
        }
        return sum;
    }

    @Benchmark
    public int u16_2_branchfree_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU16BranchFree u16 = LibDivideU16BranchFree.malloc(stack);
            libdivide_u16_branchfree_gen((short)denom, u16);
            short magic = u16.magic();
            byte  more  = u16.more();
            for (short n : numers16) {
                sum += libdivide_u16_branchfree_do(n, magic, more);
            }
        }
        return sum;
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
            LibDivideS32 magic = LibDivideS32.malloc(stack);
            libdivide_s32_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_s32_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public int s32_1_do_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS32 s32 = LibDivideS32.malloc(stack);
            libdivide_s32_gen(denom, s32);
            int  magic = s32.magic();
            byte more  = s32.more();
            for (int n : numers32) {
                sum += libdivide_s32_do(n, magic, more);
            }
        }
        return sum;
    }

    @Benchmark
    public int s32_2_branchfree() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS32BranchFree magic = LibDivideS32BranchFree.malloc(stack);
            libdivide_s32_branchfree_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_s32_branchfree_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public int s32_2_branchfree_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS32BranchFree s32 = LibDivideS32BranchFree.malloc(stack);
            libdivide_s32_branchfree_gen(denom, s32);
            int  magic = s32.magic();
            byte more  = s32.more();
            for (int n : numers32) {
                sum += libdivide_s32_branchfree_do(n, magic, more);
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
            LibDivideU32 u32 = LibDivideU32.malloc(stack);
            libdivide_u32_gen(denom, u32);
            for (int n : numers32) {
                sum += libdivide_u32_do(n, u32);
            }
        }
        return sum;
    }

    @Benchmark
    public int u32_1_do_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU32 u32 = LibDivideU32.malloc(stack);
            libdivide_u32_gen(denom, u32);
            int  magic = u32.magic();
            byte more  = u32.more();
            for (int n : numers32) {
                sum += libdivide_u32_do(n, magic, more);
            }
        }
        return sum;
    }

    @Benchmark
    public int u32_2_branchfree() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU32BranchFree magic = LibDivideU32BranchFree.malloc(stack);
            libdivide_u32_branchfree_gen(denom, magic);
            for (int n : numers32) {
                sum += libdivide_u32_branchfree_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public int u32_2_branchfree_scalar() {
        int sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU32BranchFree u32 = LibDivideU32BranchFree.malloc(stack);
            libdivide_u32_branchfree_gen(denom, u32);
            int  magic = u32.magic();
            byte more  = u32.more();
            for (int n : numers32) {
                sum += libdivide_u32_branchfree_do(n, magic, more);
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
            LibDivideS64 s64 = LibDivideS64.malloc(stack);
            libdivide_s64_gen(denom, s64);
            for (long n : numers64) {
                sum += libdivide_s64_do(n, s64);
            }
        }
        return sum;
    }

    @Benchmark
    public long s64_1_do_scalar() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS64 s64 = LibDivideS64.malloc(stack);
            libdivide_s64_gen(denom, s64);
            long magic = s64.magic();
            byte more  = s64.more();
            for (long n : numers64) {
                sum += libdivide_s64_do(n, magic, more);
            }
        }
        return sum;
    }

    @Benchmark
    public long s64_2_branchfree() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS64BranchFree s64 = LibDivideS64BranchFree.malloc(stack);
            libdivide_s64_branchfree_gen(denom, s64);
            for (long n : numers64) {
                sum += libdivide_s64_branchfree_do(n, s64);
            }
        }
        return sum;
    }

    @Benchmark
    public long s64_2_branchfree_scalar() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideS64BranchFree s64 = LibDivideS64BranchFree.malloc(stack);
            libdivide_s64_branchfree_gen(denom, s64);
            long magic = s64.magic();
            byte more  = s64.more();
            for (long n : numers64) {
                sum += libdivide_s64_branchfree_do(n, magic, more);
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
            LibDivideU64 u64 = LibDivideU64.malloc(stack);
            libdivide_u64_gen(denom, u64);
            for (long n : numers64) {
                sum += libdivide_u64_do(n, u64);
            }
        }
        return sum;
    }

    @Benchmark
    public long u64_1_do_scalar() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU64 u64 = LibDivideU64.malloc(stack);
            libdivide_u64_gen(denom, u64);
            long magic = u64.magic();
            byte more  = u64.more();
            for (long n : numers64) {
                sum += libdivide_u64_do(n, magic, more);
            }
        }
        return sum;
    }


    @Benchmark
    public long u64_2_branchfree() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU64BranchFree magic = LibDivideU64BranchFree.malloc(stack);
            libdivide_u64_branchfree_gen(denom, magic);
            for (long n : numers64) {
                sum += libdivide_u64_branchfree_do(n, magic);
            }
        }
        return sum;
    }

    @Benchmark
    public long u64_2_branchfree_scalar() {
        long sum = 0;
        try (MemoryStack stack = stackPush()) {
            LibDivideU64BranchFree u64 = LibDivideU64BranchFree.malloc(stack);
            libdivide_u64_branchfree_gen(denom, u64);
            long magic = u64.magic();
            byte more  = u64.more();
            for (long n : numers64) {
                sum += libdivide_u64_branchfree_do(n, magic, more);
            }
        }
        return sum;
    }

}
