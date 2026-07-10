/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.system.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jemalloc.JEmalloc.*;
import static org.lwjgl.system.libc.LibCStdlib.*;
import static org.lwjgl.system.mimalloc.mimalloc.*;
import static org.lwjgl.system.rpmalloc.RPmalloc.*;

@Threads(1)
@Fork(1)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 3, time = 1)
@State(Scope.Thread)
public class MallocTest {

    @Param({"8", "32", "128", "1024"})
    public int size;

    @Param({"32"})
    public int alignment;

    public long theap;

    public MemoryStack stack;

    @Setup(Level.Trial)
    public void threadLocalSetup() {
        theap = mi_theap_get_default();
        stack = stackGet();
    }

    @CompilerControl(CompilerControl.Mode.INLINE)
    private void consume(Blackhole bh, ByteBuffer mem) {
        /*
        long sum = 0L;
        for (int i = 0, longs = size >> 3; i < longs; i++) {
            sum += memGetLongAtIndex(mem, i);
        }

        bh.consume(sum);
        //*/
        bh.consume(memAddress(mem));
    }

    /*@Benchmark
    public void t00_nio(Blackhole bh) {
        ByteBuffer mem = BufferUtils.createByteBuffer(size);
        consume(bh, mem);
        ((sun.nio.ch.DirectBuffer)mem).cleaner().clean(); // must be recompiled without JDK 8 bootclasspath on JDK 9+
    }*/

    @Benchmark
    public void t10_malloc(Blackhole bh) {
        ByteBuffer mem = malloc(size);
        consume(bh, mem);
        free(mem);
    }

    @Benchmark
    public void t11_calloc(Blackhole bh) {
        ByteBuffer mem = calloc(1, size);
        consume(bh, mem);
        free(mem);
    }

    @Benchmark
    public void t12_aligned_alloc(Blackhole bh) {
        ByteBuffer mem = aligned_alloc(alignment, size);
        consume(bh, mem);
        aligned_free(mem);
    }

    @Benchmark
    public void t20_mi_malloc(Blackhole bh) {
        ByteBuffer mem = mi_malloc(size);
        consume(bh, mem);
        mi_free(mem);
    }

    @Benchmark
    public void t20_mi_theap_malloc(Blackhole bh) {
        ByteBuffer mem = mi_theap_malloc(theap, size);
        consume(bh, mem);
        mi_free(mem);
    }

    @Benchmark
    public void t20_mi_theap_malloc_small(Blackhole bh) {
        ByteBuffer mem = mi_theap_malloc_small(theap, size);
        consume(bh, mem);
        mi_free(mem);
    }

    @Benchmark
    public void t21_mi_calloc(Blackhole bh) {
        ByteBuffer mem = mi_calloc(1, size);
        consume(bh, mem);
        mi_free(mem);
    }

    @Benchmark
    public void t23_mi_aligned_alloc(Blackhole bh) {
        ByteBuffer mem = mi_malloc_aligned(size, alignment);
        consume(bh, mem);
        mi_free(mem);
    }

    @Benchmark
    public void t30_je_malloc(Blackhole bh) {
        ByteBuffer mem = je_malloc(size);
        consume(bh, mem);
        je_free(mem);
    }

    @Benchmark
    public void t31_je_calloc(Blackhole bh) {
        ByteBuffer mem = je_calloc(1, size);
        consume(bh, mem);
        je_free(mem);
    }

    @Benchmark
    public void t33_je_aligned_alloc(Blackhole bh) {
        ByteBuffer mem = je_aligned_alloc(alignment, size);
        consume(bh, mem);
        je_free(mem);
    }

    @Benchmark
    public void t40_rpmalloc(Blackhole bh) {
        ByteBuffer mem = rpmalloc(size);
        consume(bh, mem);
        rpfree(mem);
    }

    @Benchmark
    public void t41_rpcalloc(Blackhole bh) {
        ByteBuffer mem = rpcalloc(1, size);
        consume(bh, mem);
        rpfree(mem);
    }

    @Benchmark
    public void t42_rpaligned_alloc(Blackhole bh) {
        ByteBuffer mem = rpaligned_alloc(alignment, size);
        consume(bh, mem);
        rpfree(mem);
    }

    @Benchmark
    public void t50_stack_malloc(Blackhole bh) {
        try (MemoryStack frame = stackPush()) {
            ByteBuffer mem = frame.malloc(size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t50_stack_malloc_nested(Blackhole bh) {
        try (MemoryStack frame = stack.push()) {
            ByteBuffer mem = frame.malloc(size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t51_stack_calloc(Blackhole bh) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer mem = stack.calloc(size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t51_stack_calloc_nested(Blackhole bh) {
        try (MemoryStack frame = stack.push()) {
            ByteBuffer mem = frame.calloc(size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t52_stack_aligned_alloc(Blackhole bh) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer mem = stack.malloc(alignment, size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t52_stack_aligned_alloc_nested(Blackhole bh) {
        try (MemoryStack frame = stack.push()) {
            ByteBuffer mem = frame.malloc(alignment, size);
            consume(bh, mem);
        }
    }

}
