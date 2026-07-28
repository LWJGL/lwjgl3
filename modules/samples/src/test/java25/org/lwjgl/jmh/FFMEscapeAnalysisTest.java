/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.system.*;
import org.openjdk.jmh.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/*
Benchmark                                              Mode  Cnt      Score      Error   Units
FFMEscapeAnalysisTest.noop_params0                     avgt    3      3,063 ?    0,120   ns/op
FFMEscapeAnalysisTest.noop_params0:gc.alloc.rate       avgt    3      0,006 ?    0,001  MB/sec
FFMEscapeAnalysisTest.noop_params0:gc.alloc.rate.norm  avgt    3     ? 10??               B/op
FFMEscapeAnalysisTest.noop_params0:gc.count            avgt    3        ? 0             counts
FFMEscapeAnalysisTest.noop_params1                     avgt    3      3,063 ?    0,242   ns/op
FFMEscapeAnalysisTest.noop_params1:gc.alloc.rate       avgt    3      0,006 ?    0,001  MB/sec
FFMEscapeAnalysisTest.noop_params1:gc.alloc.rate.norm  avgt    3     ? 10??               B/op
FFMEscapeAnalysisTest.noop_params1:gc.count            avgt    3        ? 0             counts
FFMEscapeAnalysisTest.noop_params2                     avgt    3      3,081 ?    0,279   ns/op
FFMEscapeAnalysisTest.noop_params2:gc.alloc.rate       avgt    3      0,006 ?    0,001  MB/sec
FFMEscapeAnalysisTest.noop_params2:gc.alloc.rate.norm  avgt    3     ? 10??               B/op
FFMEscapeAnalysisTest.noop_params2:gc.count            avgt    3        ? 0             counts
FFMEscapeAnalysisTest.noop_params3                     avgt    3      3,049 ?    0,216   ns/op
FFMEscapeAnalysisTest.noop_params3:gc.alloc.rate       avgt    3      0,006 ?    0,001  MB/sec
FFMEscapeAnalysisTest.noop_params3:gc.alloc.rate.norm  avgt    3     ? 10??               B/op
FFMEscapeAnalysisTest.noop_params3:gc.count            avgt    3        ? 0             counts
FFMEscapeAnalysisTest.noop_params4                     avgt    3     10,699 ?    5,993   ns/op
FFMEscapeAnalysisTest.noop_params4:gc.alloc.rate       avgt    3  14268,496 ? 7896,022  MB/sec
FFMEscapeAnalysisTest.noop_params4:gc.alloc.rate.norm  avgt    3    160,000 ?    0,001    B/op
FFMEscapeAnalysisTest.noop_params4:gc.count            avgt    3     18,000             counts
FFMEscapeAnalysisTest.noop_params4:gc.time             avgt    3     17,000                 ms
FFMEscapeAnalysisTest.noop_params5                     avgt    3     12,622 ?    4,869   ns/op
FFMEscapeAnalysisTest.noop_params5:gc.alloc.rate       avgt    3  15113,469 ? 5822,389  MB/sec
FFMEscapeAnalysisTest.noop_params5:gc.alloc.rate.norm  avgt    3    200,000 ?    0,001    B/op
FFMEscapeAnalysisTest.noop_params5:gc.count            avgt    3     19,000             counts
FFMEscapeAnalysisTest.noop_params5:gc.time             avgt    3     15,000                 ms
 */
@State(Scope.Benchmark)
public class FFMEscapeAnalysisTest {

    static {
        Library.initialize();
    }

    // A shared library that exports the functions below
    private static final SymbolLookup LOOKUP = SymbolLookup.libraryLookup("lwjgl", Arena.global());

    // void noop_params0() {}
    private static final MethodHandle MH_NOOP_PARAMS0 = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid())
        .bindTo(LOOKUP.find("noop_params0").orElseThrow());

    // void noop_params1(void *param0) {}
    private static final MethodHandle MH_NOOP_PARAMS1 = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        ))
        .bindTo(LOOKUP.find("noop_params1").orElseThrow());

    // void noop_params2(void *param0, void *param1) {}
    private static final MethodHandle MH_NOOP_PARAMS2 = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        ))
        .bindTo(LOOKUP.find("noop_params2").orElseThrow());

    // void noop_params3(void *param0, void *param1, void *param2) {}
    private static final MethodHandle MH_NOOP_PARAMS3 = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        ))
        .bindTo(LOOKUP.find("noop_params3").orElseThrow());

    // void noop_params4(void *param0, void *param1, void *param2, void *param3) {}
    private static final MethodHandle MH_NOOP_PARAMS4 = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        ))
        .bindTo(LOOKUP.find("noop_params4").orElseThrow());

    // void noop_params5(int param0, int param1, void *param2, void *param3, void *param4) {}
    private static final MethodHandle MH_NOOP_PARAMS5 = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        ))
        .bindTo(LOOKUP.find("noop_params5").orElseThrow());

    @Benchmark
    public void noop_params0() {
        try {
            MH_NOOP_PARAMS0.invokeExact();
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    @Benchmark
    public void noop_params1() {
        try {
            MH_NOOP_PARAMS1.invokeExact(
                MemorySegment.ofAddress(0L)
            );
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    @Benchmark
    public void noop_params2() {
        try {
            MH_NOOP_PARAMS2.invokeExact(
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L)
            );
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    @Benchmark
    public void noop_params3() {
        try {
            MH_NOOP_PARAMS3.invokeExact(
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L)
            );
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    @Benchmark
    public void noop_params4() {
        try {
            MH_NOOP_PARAMS4.invokeExact(
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L)
            );
            /*var p = MemorySegment.ofAddress(0L);
            MH_NOOP_PARAMS4.invokeExact(p, p, p, p);*/
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    @Benchmark
    public void noop_params5() {
        try {
            MH_NOOP_PARAMS5.invokeExact(
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L),
                MemorySegment.ofAddress(0L)
            );
            /*var p = MemorySegment.ofAddress(0L);
            MH_NOOP_PARAMS5.invokeExact(p, p, p, p, p);*/
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }
}