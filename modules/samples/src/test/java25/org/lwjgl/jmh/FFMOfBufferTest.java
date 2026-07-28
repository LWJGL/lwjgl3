/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.*;

import java.lang.foreign.*;
import java.nio.*;

/*
Results on AMD 7950X3D, Windows 11, JDK 24-ea:
-----------------------------------------------------------------------------------------------
Benchmark                                               Mode  Cnt      Score      Error   Units
FFMOfBufferTest.ofBuffer                                avgt    3      6,542 ±    3,476   ns/op
FFMOfBufferTest.ofBuffer:gc.alloc.rate                  avgt    3  10499,839 ± 5496,416  MB/sec
FFMOfBufferTest.ofBuffer:gc.alloc.rate.norm             avgt    3     72,000 ±    0,001    B/op
FFMOfBufferTest.ofBuffer:gc.count                       avgt    3     17,000             counts
FFMOfBufferTest.ofBuffer:gc.time                        avgt    3     15,000                 ms

FFMOfBufferTest.ofBufferInlineFalse                     avgt    3      6,437 ±    1,909   ns/op
FFMOfBufferTest.ofBufferInlineFalse:gc.alloc.rate       avgt    3  10666,676 ± 3133,711  MB/sec
FFMOfBufferTest.ofBufferInlineFalse:gc.alloc.rate.norm  avgt    3     72,000 ±    0,001    B/op
FFMOfBufferTest.ofBufferInlineFalse:gc.count            avgt    3     17,000             counts
FFMOfBufferTest.ofBufferInlineFalse:gc.time             avgt    3     14,000                 ms

FFMOfBufferTest.ofBufferInlineTrue                      avgt    3      0,882 ±    0,507   ns/op
FFMOfBufferTest.ofBufferInlineTrue:gc.alloc.rate        avgt    3      2,157 ±   67,949  MB/sec
FFMOfBufferTest.ofBufferInlineTrue:gc.alloc.rate.norm   avgt    3      0,002 ±    0,061    B/op
FFMOfBufferTest.ofBufferInlineTrue:gc.count             avgt    3        ≈ 0             counts
 */
@State(Scope.Benchmark)
public class FFMOfBufferTest {

    private ByteBuffer buffer = ByteBuffer
        .allocateDirect(0x1000)
        .order(ByteOrder.nativeOrder());

    @Benchmark
    public void ofBuffer(Blackhole bh) {
        bh.consume(MemorySegment.ofBuffer(buffer).address());
    }

    @Benchmark
    @Fork(jvmArgsAppend = "-XX:CompileCommand=inline,jdk.internal.foreign.AbstractMemorySegmentImpl::ofBuffer,false")
    public void ofBufferInlineFalse(Blackhole bh) {
        bh.consume(MemorySegment.ofBuffer(buffer).address());
    }

    @Benchmark
    @Fork(jvmArgsAppend = "-XX:CompileCommand=inline,jdk.internal.foreign.AbstractMemorySegmentImpl::ofBuffer,true")
    public void ofBufferInlineTrue(Blackhole bh) {
        bh.consume(MemorySegment.ofBuffer(buffer).address());
    }

}