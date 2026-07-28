/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;

/*
Results on AMD 7950X3D, Windows 11, JDK 26+35:

level0 -> custom VarHandle
----------------------------------------------------------------------------------------------------------------------------
Benchmark                                               (offsetCount)  (segmentSize)  Mode  Cnt      Score     Error   Units
FFMVarHandleInlineTest.t0_reference                              2048           1024  avgt    3    389,724 ±  68,161   ns/op
FFMVarHandleInlineTest.t0_reference:gc.alloc.rate                2048           1024  avgt    3      0,007 ±   0,001  MB/sec

FFMVarHandleInlineTest.t1_level8                                 2048           1024  avgt    3    389,396 ±  15,902   ns/op
FFMVarHandleInlineTest.t1_level8:gc.alloc.rate                   2048           1024  avgt    3      0,007 ±   0,001  MB/sec

FFMVarHandleInlineTest.t2_level9                                 2048           1024  avgt    3    387,224 ±   0,617   ns/op
FFMVarHandleInlineTest.t2_level9:gc.alloc.rate                   2048           1024  avgt    3      0,007 ±   0,001  MB/sec

FFMVarHandleInlineTest.t3_level10                                2048           1024  avgt    3   7270,966 ± 350,820   ns/op
FFMVarHandleInlineTest.t3_level10:gc.alloc.rate                  2048           1024  avgt    3  10743,097 ± 517,756  MB/sec

FFMVarHandleInlineTest.t4_level11                                2048           1024  avgt    3  14752,415 ± 601,688   ns/op
FFMVarHandleInlineTest.t4_level11:gc.alloc.rate                  2048           1024  avgt    3   5294,881 ± 215,937  MB/sec

level0 -> MemorySegment.ofAddress(offset).reinterpret(8L).get(ValueLayout.JAVA_INT_UNALIGNED, 0L);
-----------------------------------------------------------------------------------------------------------------------------
Benchmark                                               (offsetCount)  (segmentSize)  Mode  Cnt       Score     Error   Units
FFMVarHandleInlineTest.t0_reference                              2048           1024  avgt    3     385,951 ±   7,583   ns/op
FFMVarHandleInlineTest.t0_reference:gc.alloc.rate                2048           1024  avgt    3       0,007 ±   0,001  MB/sec

FFMVarHandleInlineTest.t1_level8                                 2048           1024  avgt    3     386,355 ±   2,966   ns/op
FFMVarHandleInlineTest.t1_level8:gc.alloc.rate                   2048           1024  avgt    3       0,007 ±   0,001  MB/sec

FFMVarHandleInlineTest.t2_level9                                 2048           1024  avgt    3    7203,609 ±  29,192   ns/op
FFMVarHandleInlineTest.t2_level9:gc.alloc.rate                   2048           1024  avgt    3   10843,468 ±  47,051  MB/sec

FFMVarHandleInlineTest.t3_level10                                2048           1024  avgt    3   14792,473 ± 603,733   ns/op
FFMVarHandleInlineTest.t3_level10:gc.alloc.rate                  2048           1024  avgt    3    5280,540 ± 215,239  MB/sec

FFMVarHandleInlineTest.t4_level11                                2048           1024  avgt    3   19969,408 ± 366,820   ns/op
FFMVarHandleInlineTest.t4_level11:gc.alloc.rate                  2048           1024  avgt    3    7823,177 ± 139,066  MB/sec

Even though the VarHandle implementation can handle 1 extra level in this test, it is more common to hit the NodeCountInliningCutoff in real code. When that
happens, HotSpot can cope much better with the reference implementation.

Note: GraalVM does not have any trouble in this test, but when it hits limits like NodeCountInliningCutoff, it has catastrophic performance with the VarHandle
implementation.
 */

@State(Scope.Benchmark)
@Fork(jvmArgsAppend = {"-XX:MaxInlineLevel=15"}) // default is 15 anyway, but override to make sure
public class FFMVarHandleInlineTest {

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
        var ref = t0_reference();
        if (
            ref != t1_level8() ||
            ref != t2_level9() ||
            ref != t3_level10() ||
            ref != t4_level11()
        ) {
            throw new IllegalStateException();
        }
    }

    @Benchmark
    public int t0_reference() {
        var s = 0;
        for (var offset : offsets) {
            s += MemorySegment
                .ofAddress(offset)
                .reinterpret(8L)
                .get(ValueLayout.JAVA_INT_UNALIGNED, 0L);
        }
        return s;
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    @Benchmark
    public int t1_level8() {
        var s = 0;
        for (var offset : offsets) {
            s += level8(offset);
        }
        return s;
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    @Benchmark
    public int t2_level9() {
        var s = 0;
        for (var offset : offsets) {
            s += level9(offset);
        }
        return s;
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    @Benchmark
    public int t3_level10() {
        var s = 0;
        for (var offset : offsets) {
            s += level10(offset);
        }
        return s;
    }

    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    @Benchmark
    public int t4_level11() {
        var s = 0;
        for (var offset : offsets) {
            s += level11(offset);
        }
        return s;
    }

    private static int level11(long offset) { return level10(offset); }
    private static int level10(long offset) { return level9(offset); }
    private static int level9(long offset)  { return level8(offset); }
    private static int level8(long offset)  { return level7(offset); }
    private static int level7(long offset)  { return level6(offset); }
    private static int level6(long offset)  { return level5(offset); }
    private static int level5(long offset)  { return level4(offset); }
    private static int level4(long offset)  { return level3(offset); }
    private static int level3(long offset)  { return level2(offset); }
    private static int level2(long offset)  { return level1(offset); }
    private static int level1(long offset)  { return level0(offset); }
    private static int level0(long offset)  { return (int)JAVA_INT_UNALIGNED.get(offset); }
    //private static int level0(long offset)  { return MemorySegment.ofAddress(offset).reinterpret(8L).get(ValueLayout.JAVA_INT_UNALIGNED, 0L); }

}
