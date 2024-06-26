/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.lang.foreign.*;

@State(Scope.Benchmark)
public class FFMOfAddressTest {

    private static final MemorySegment VIRTUAL_MEMORY = MemorySegment.ofAddress(0L).reinterpret(Long.MAX_VALUE);

    private MemorySegment segment = Arena.ofAuto().allocate(1024L);

    @Param({"256"})
    private long sliceOffset;

    @Benchmark
    public int ofAddress() {
        var s = MemorySegment.ofAddress(segment.address() + sliceOffset).reinterpret(8L);
        return s.get(ValueLayout.JAVA_INT_UNALIGNED, 0L);
    }

    @Benchmark
    public int asSlice() {
        var s = VIRTUAL_MEMORY.asSlice(segment.address() + sliceOffset, 8L);
        return s.get(ValueLayout.JAVA_INT_UNALIGNED, 0L);
    }

}