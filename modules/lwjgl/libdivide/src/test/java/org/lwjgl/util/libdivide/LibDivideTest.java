/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.libdivide;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.util.concurrent.*;
import java.util.function.*;

import static java.lang.Math.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.libdivide.LibDivide.*;
import static org.testng.Assert.*;

@Test()
public class LibDivideTest {

    private static final int RANDOM_NUMERS = 10000;
    private static final int RANDOM_DENOMS = 100;

    // libdivide.h uses #pragma pack(push, 1) by default, which LWJGL disables.
    // This makes sure it is not reverted by mistake.
    public void testStructLayout() {
        assertEquals(LibDivideS32.SIZEOF, 8);
        assertEquals(LibDivideS32BranchFree.SIZEOF, 8);
        assertEquals(LibDivideU32.SIZEOF, 8);
        assertEquals(LibDivideU32BranchFree.SIZEOF, 8);

        assertEquals(LibDivideS32.ALIGNOF, 4);
        assertEquals(LibDivideS32BranchFree.ALIGNOF, 4);
        assertEquals(LibDivideU32.ALIGNOF, 4);
        assertEquals(LibDivideU32BranchFree.ALIGNOF, 4);

        assertEquals(LibDivideS64.SIZEOF, 16);
        assertEquals(LibDivideS64BranchFree.SIZEOF, 16);
        assertEquals(LibDivideU64.SIZEOF, 16);
        assertEquals(LibDivideU64BranchFree.SIZEOF, 16);

        assertEquals(LibDivideS64.ALIGNOF, 8);
        assertEquals(LibDivideS64BranchFree.ALIGNOF, 8);
        assertEquals(LibDivideU64.ALIGNOF, 8);
        assertEquals(LibDivideU64BranchFree.ALIGNOF, 8);
    }

    public void testS32() {
        Native32 doNative = (numer, denom) -> numer / denom;

        test(
            LibDivideS32::mallocStack,
            LibDivide::libdivide_s32_gen,
            doNative,
            LibDivide::libdivide_s32_do_ref,
            LibDivide::libdivide_s32_do,
            false
        );

        test(
            LibDivideS32BranchFree::mallocStack,
            LibDivide::libdivide_s32_branchfree_gen,
            doNative,
            LibDivide::libdivide_s32_branchfree_do_ref,
            LibDivide::libdivide_s32_branchfree_do,
            true
        );

        test(
            LibDivideS32::mallocStack,
            LibDivide::libdivide_s32_gen,
            doNative,
            LibDivide::libdivide_s32_do_ref,
            (numer, denom) -> {
                switch (libdivide_s32_get_algorithm(denom)) {
                    case 0:
                        return libdivide_s32_do_alg0(numer, denom);
                    case 1:
                        return libdivide_s32_do_alg1(numer, denom);
                    case 2:
                        return libdivide_s32_do_alg2(numer, denom);
                    case 3:
                        return libdivide_s32_do_alg3(numer, denom);
                    case 4:
                        return libdivide_s32_do_alg4(numer, denom);
                    default:
                        throw new UnsupportedOperationException();
                }
            },
            false
        );
    }

    public void testU32() {
        Native32 doNative = Integer::divideUnsigned;

        test(
            LibDivideU32::mallocStack,
            LibDivide::libdivide_u32_gen,
            doNative,
            LibDivide::libdivide_u32_do_ref,
            LibDivide::libdivide_u32_do,
            false
        );

        test(
            LibDivideU32BranchFree::mallocStack,
            LibDivide::libdivide_u32_branchfree_gen,
            doNative,
            LibDivide::libdivide_u32_branchfree_do_ref,
            LibDivide::libdivide_u32_branchfree_do,
            true
        );

        test(
            LibDivideU32::mallocStack,
            LibDivide::libdivide_u32_gen,
            doNative,
            LibDivide::libdivide_u32_do_ref,
            (numer, denom) -> {
                switch (libdivide_u32_get_algorithm(denom)) {
                    case 0:
                        return libdivide_u32_do_alg0(numer, denom);
                    case 1:
                        return libdivide_u32_do_alg1(numer, denom);
                    case 2:
                        return libdivide_u32_do_alg2(numer, denom);
                    default:
                        throw new UnsupportedOperationException();
                }
            },
            false
        );
    }

    public void testS64() {
        Native64 doNative = (numer, denom) -> numer / denom;

        test(
            LibDivideS64::mallocStack,
            LibDivide::libdivide_s64_gen,
            doNative,
            LibDivide::libdivide_s64_do_ref,
            LibDivide::libdivide_s64_do,
            false
        );

        test(
            LibDivideS64BranchFree::mallocStack,
            LibDivide::libdivide_s64_branchfree_gen,
            doNative,
            LibDivide::libdivide_s64_branchfree_do_ref,
            LibDivide::libdivide_s64_branchfree_do,
            true
        );

        test(
            LibDivideS64::mallocStack,
            LibDivide::libdivide_s64_gen,
            doNative,
            LibDivide::libdivide_s64_do_ref,
            (numer, denom) -> {
                switch (libdivide_s64_get_algorithm(denom)) {
                    case 0:
                        return libdivide_s64_do_alg0(numer, denom);
                    case 1:
                        return libdivide_s64_do_alg1(numer, denom);
                    case 2:
                        return libdivide_s64_do_alg2(numer, denom);
                    case 3:
                        return libdivide_s64_do_alg3(numer, denom);
                    case 4:
                        return libdivide_s64_do_alg4(numer, denom);
                    default:
                        throw new UnsupportedOperationException();
                }
            },
            false
        );
    }

    public void testU64() {
        Native64 doNative = Long::divideUnsigned;

        test(
            LibDivideU64::mallocStack,
            LibDivide::libdivide_u64_gen,
            doNative,
            LibDivide::libdivide_u64_do_ref,
            LibDivide::libdivide_u64_do,
            false
        );

        test(
            LibDivideU64BranchFree::mallocStack,
            LibDivide::libdivide_u64_branchfree_gen,
            doNative,
            LibDivide::libdivide_u64_branchfree_do_ref,
            LibDivide::libdivide_u64_branchfree_do,
            true
        );

        test(
            LibDivideU64::mallocStack,
            LibDivide::libdivide_u64_gen,
            doNative,
            LibDivide::libdivide_u64_do_ref,
            (numer, denom) -> {
                switch (libdivide_u64_get_algorithm(denom)) {
                    case 0:
                        return libdivide_u64_do_alg0(numer, denom);
                    case 1:
                        return libdivide_u64_do_alg1(numer, denom);
                    case 2:
                        return libdivide_u64_do_alg2(numer, denom);
                    default:
                        throw new UnsupportedOperationException();
                }
            },
            false
        );
    }

    private interface Gen32<T extends Struct> {
        T apply(int denom, T __result);
    }

    private interface Do32<T extends Struct> {
        int apply(int numer, T denom);
    }

    private interface Native32 {
        int apply(int numer, int denom);
    }

    private static <T extends Struct> void test(Function<MemoryStack, T> malloc, Gen32<T> gen32, Native32 doNative, Do32<T> doRef, Do32<T> doJava, boolean branchFree) {
        try (MemoryStack stack = stackPush()) {
            T magic = malloc.apply(stack);

            // Corner cases
            if (!branchFree) {
                test(magic, gen32, doNative, doRef, doJava, -1, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
                test(magic, gen32, doNative, doRef, doJava, 1, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
            test(magic, gen32, doNative, doRef, doJava, -2, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen32, doNative, doRef, doJava, 2, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen32, doNative, doRef, doJava, -3, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen32, doNative, doRef, doJava, 3, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen32, doNative, doRef, doJava, Integer.MIN_VALUE, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen32, doNative, doRef, doJava, Integer.MAX_VALUE, 0, -1, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);

            // Random
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            for (int i = 0; i < RANDOM_DENOMS; i++) {
                int d;
                do {
                    d = rand.nextInt();
                } while (branchFree && abs(d) == 1);

                gen32.apply(d, magic);

                for (int j = 0; j < RANDOM_NUMERS; j++) {
                    test(magic, doNative, doRef, doJava, d, rand.nextInt());
                }
            }
        }
    }

    private static <T extends Struct> void test(T magic, Gen32<T> gen32, Native32 doNative, Do32<T> doRef, Do32<T> doJava, int d, int... numers) {
        gen32.apply(d, magic);
        for (int n : numers) {
            test(magic, doNative, doRef, doJava, d, n);
        }
    }

    private static <T extends Struct> void test(T magic, Native32 doNative, Do32<T> doRef, Do32<T> doJava, int d, int n) {
        int refNative = doNative.apply(n, d);

        int ref = doRef.apply(n, magic);
        if (ref != refNative) {
            throw new IllegalStateException(n + " / " + d + ", expected native [" + refNative + "] but found libdivide [" + ref + "]");
        }

        int java = doJava.apply(n, magic);
        if (java != ref) {
            throw new IllegalStateException(n + " / " + d + ", expected libdivide [" + ref + "] but found LWJGL [" + java + "]");
        }
    }

    private interface Gen64<T extends Struct> {
        T apply(long denom, T __result);
    }

    private interface Do64<T extends Struct> {
        long apply(long numer, T denom);
    }

    private interface Native64 {
        long apply(long numer, long denom);
    }

    private static <T extends Struct> void test(Function<MemoryStack, T> malloc, Gen64<T> gen64, Native64 doNative, Do64<T> doRef, Do64<T> doJava, boolean branchFree) {
        try (MemoryStack stack = stackPush()) {

            T magic = malloc.apply(stack);

            // Corner cases
            if (!branchFree) {
                test(magic, gen64, doNative, doRef, doJava, -1L, 0L, -1L, 1L, Integer.MIN_VALUE, Integer.MAX_VALUE);
                test(magic, gen64, doNative, doRef, doJava, 1L, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);
            }
            test(magic, gen64, doNative, doRef, doJava, -2L, 0L, -1L, 1L, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, 2L, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, -3L, 0L, -1L, 1L, Integer.MIN_VALUE, Integer.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, 3L, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, Integer.MIN_VALUE, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, Integer.MAX_VALUE, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, Long.MIN_VALUE, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);
            test(magic, gen64, doNative, doRef, doJava, Long.MAX_VALUE, 0L, -1L, 1L, Long.MIN_VALUE, Long.MAX_VALUE);

            // Random
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            for (int i = 0; i < RANDOM_DENOMS; i++) {
                long d;
                do {
                    d = rand.nextLong();
                } while (branchFree && abs(d) == 1L);

                gen64.apply(d, magic);
                for (int j = 0; j < RANDOM_NUMERS; j++) {
                    test(magic, doNative, doRef, doJava, d, rand.nextLong());
                }
            }
        }
    }

    private static <T extends Struct> void test(T magic, Gen64<T> gen64, Native64 doNative, Do64<T> doRef, Do64<T> doJava, long d, long... numers) {
        gen64.apply(d, magic);
        for (long n : numers) {
            test(magic, doNative, doRef, doJava, d, n);
        }
    }

    private static <T extends Struct> void test(T magic, Native64 doNative, Do64<T> doRef, Do64<T> doJava, long d, long n) {
        long refNative = doNative.apply(n, d);

        long ref = doRef.apply(n, magic);
        if (ref != refNative) {
            throw new IllegalStateException(n + " / " + d + ", expected native [" + refNative + "] but found libdivide [" + ref + "]");
        }

        long java = doJava.apply(n, magic);
        if (java != ref) {
            throw new IllegalStateException(n + " / " + d + ", expected libdivide [" + ref + "] but found LWJGL [" + java + "]");
        }
    }

}