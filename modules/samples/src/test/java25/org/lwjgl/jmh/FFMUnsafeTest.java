/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;

/*
Results on AMD 7950X3D, Windows 11, JDK 24-beta+20:
------------------------------------------------------------------------------------------------------------------
Benchmark                                         (offsetCount)  (segmentSize)  Mode  Cnt    Score    Error  Units
FFMUnsafeTest.t0_unsafe                                    2048           1024  avgt    3  387,883 ± 19,360  ns/op

FFMUnsafeTest.t1_unaligned                                 2048           1024  avgt    3  414,030 ±  6,860  ns/op
FFMUnsafeTest.t1_unaligned_masked_length                   2048           1024  avgt    3  392,332 ± 21,713  ns/op

FFMUnsafeTest.t2_aligned                                   2048           1024  avgt    3  591,884 ± 24,593  ns/op
FFMUnsafeTest.t2_aligned_masked_alignment                  2048           1024  avgt    3  487,851 ± 19,524  ns/op
FFMUnsafeTest.t2_aligned_masked_length                     2048           1024  avgt    3  497,973 ± 59,621  ns/op
FFMUnsafeTest.t2_aligned_masked_length_alignment           2048           1024  avgt    3  391,932 ± 23,186  ns/op

FFMUnsafeTest.t3_newSegment                                2048           1024  avgt    3  388,440 ± 23,968  ns/op
FFMUnsafeTest.t3_newSegmentVH                              2048           1024  avgt    3  387,813 ±  1,563  ns/op

Update with new findings:

The masked implementations do not perform well across the board (read vs write, bytes vs ints). The new segment
implementation is the only consistent one.
 */

/** Compares the performance of different ways to access memory via MemorySegment with the equivalent Unsafe baseline. */
@State(Scope.Benchmark)
public class FFMUnsafeTest {

    private static final Unsafe UNSAFE = Bench.getUnsafeInstance();

    private static final MemorySegment VIRTUAL_MEMORY = MemorySegment
        .ofAddress(0L)
        .reinterpret(Long.MAX_VALUE);

    /**
     * Implements the following:
     * <pre>{@code
     * int JAVA_INT_UNALIGNED(long offset) {
     *     return MemorySegment
     *         .ofAddress(offset)
     *         .reinterpret(8L)
     *         .get(ValueLayout.JAVA_INT_UNALIGNED, 0L)
     * }
     * }</pre>
     */
    private static final VarHandle JAVA_INT_UNALIGNED;

    static {
        try {
            var ofAddress = MethodHandles.lookup()
                .findStatic(MemorySegment.class, "ofAddress", MethodType.methodType(MemorySegment.class, long.class));

            var reinterpret = MethodHandles.lookup()
                .findVirtual(MemorySegment.class, "reinterpret", MethodType.methodType(MemorySegment.class, long.class));

            var vh = ValueLayout.JAVA_INT_UNALIGNED.varHandle();

            vh = MethodHandles.insertCoordinates(vh, 1, 0L);
            vh = MethodHandles.filterCoordinates(vh, 0, MethodHandles.filterReturnValue(
                ofAddress,
                MethodHandles.insertArguments(reinterpret, 1, 8L)
            ));

            JAVA_INT_UNALIGNED = vh.withInvokeExactBehavior();
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // segment + offsets should comfortably fit in L1 cache

    private MemorySegment segment;

    private long[] offsets;

    @Param(value = {
        "1024", // 1kb
    })
    private int segmentSize;

    @Param(value = {
        //"8", // 64b
        //"512", // 4kb
        "2048", // 16kb
    })
    private int offsetCount;

    @Setup
    public void init() {
        var rand = new Random(7);

        // initialize segment with random values
        segment = Arena.ofAuto().allocate(segmentSize);
        for (var i = 0; i < segment.byteSize() / 8; i++) {
            segment.set(ValueLayout.JAVA_LONG, i * 8, rand.nextLong());
        }

        var ints = (int)(segment.byteSize() >> 2);

        // initialize offset array
        offsets = new long[offsetCount];
        for (var i = 0; i < offsets.length; i++) {
            offsets[i] = segment.address() + (rand.nextInt(ints) << 2); // random
            //offsets[i] = segment.address() + ((i % ints) << 2); // sequential
        }

        // validate that all loops are implemented correctly
        var ref = t2_aligned();
        if (
            ref != t0_unsafe() ||
            ref != t1_unaligned() ||
            ref != t1_unaligned_masked_length() ||
            ref != t2_aligned_masked_length() ||
            ref != t2_aligned_masked_alignment() ||
            ref != t2_aligned_masked_length_alignment() ||
            ref != t3_newSegment() ||
            ref != t3_newSegmentVH()
        ) {
            throw new IllegalStateException();
        }
    }

    @Benchmark
    public int t0_unsafe() {
        var s = 0;
        for (var offset : offsets) {
            s += UNSAFE.getInt(null, offset);
        }
        return s;
    }

    @Benchmark
    public int t1_unaligned() {
        var s = 0;
        for (var offset : offsets) {
            s += VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, offset);
        }
        return s;
    }

    @Benchmark
    public int t1_unaligned_masked_length() {
        var s = 0;
        for (var offset : offsets) {
            s += VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, offset & 0b00111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L);
        }
        return s;
    }

    @Benchmark
    public int t2_aligned() {
        var s = 0;
        for (var offset : offsets) {
            s += VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT, offset);
        }
        return s;
    }

    @Benchmark
    public int t2_aligned_masked_length() {
        var s = 0;
        for (var offset : offsets) {
            s += VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT, offset & 0b00111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L);
        }
        return s;
    }

    @Benchmark
    public int t2_aligned_masked_alignment() {
        var s = 0;
        for (var offset : offsets) {
            s += VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT, offset & 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111100L);
        }
        return s;
    }

    @Benchmark
    public int t2_aligned_masked_length_alignment() {
        var s = 0;
        for (var offset : offsets) {
            s += VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT, offset & 0b00111111_11111111_11111111_11111111_11111111_11111111_11111111_11111100L);
        }
        return s;
    }

    @Benchmark
    public int t3_newSegment() {
        var s = 0;
        for (var offset : offsets) {
            s += MemorySegment
                .ofAddress(offset)
                .reinterpret(8L)
                .get(ValueLayout.JAVA_INT_UNALIGNED, 0L);
        }
        return s;
    }

    @Benchmark
    public int t3_newSegmentVH() {
        var s = 0;
        for (var offset : offsets) {
            s += (int)JAVA_INT_UNALIGNED.get(offset);
        }
        return s;
    }

}