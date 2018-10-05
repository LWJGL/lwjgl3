/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.*;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jemalloc.JEmalloc.*;
import static org.lwjgl.system.libc.LibCStdlib.*;
import static org.lwjgl.system.rpmalloc.RPmalloc.*;

@Threads(1)
@State(Scope.Thread)
public class MallocTest {

    static {
        rpmalloc_initialize();
    }

    @Param({"8", "32", "128", "1024"})
    public int size;

    @Param({"32"})
    public int alignment;

    @Setup(Level.Trial)
    public void rpmallocInitThread() {
        rpmalloc_thread_initialize();
    }

    @CompilerControl(CompilerControl.Mode.INLINE)
    private void consume(Blackhole bh, ByteBuffer mem) {
        long a = memAddress(mem);

        long sum = 0L;
        for (int i = 0; i < size / Long.BYTES; i++) {
            sum += memGetLong(a + i * Long.BYTES);
        }

        bh.consume(sum);
    }

    @Benchmark
    public void t00_nio(Blackhole bh) {
        ByteBuffer mem = BufferUtils.createByteBuffer(size);
        consume(bh, mem);
        ((sun.nio.ch.DirectBuffer)mem).cleaner().clean(); // must be recompiled without JDK 8 bootclasspath on JDK 9+
    }

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
    public void t20_je_malloc(Blackhole bh) {
        ByteBuffer mem = je_malloc(size);
        consume(bh, mem);
        je_free(mem);
    }

    @Benchmark
    public void t21_je_calloc(Blackhole bh) {
        ByteBuffer mem = je_calloc(1, size);
        consume(bh, mem);
        je_free(mem);
    }

    @Benchmark
    public void t23_je_aligned_alloc(Blackhole bh) {
        ByteBuffer mem = je_aligned_alloc(alignment, size);
        consume(bh, mem);
        je_free(mem);
    }

    @Benchmark
    public void t30_rpmalloc(Blackhole bh) {
        ByteBuffer mem = rpmalloc(size);
        consume(bh, mem);
        rpfree(mem);
    }

    @Benchmark
    public void t31_rpcalloc(Blackhole bh) {
        ByteBuffer mem = rpcalloc(1, size);
        consume(bh, mem);
        rpfree(mem);
    }

    @Benchmark
    public void t32_rpaligned_alloc(Blackhole bh) {
        ByteBuffer mem = rpaligned_alloc(alignment, size);
        consume(bh, mem);
        rpfree(mem);
    }

    @Benchmark
    public void t40_stack_malloc(Blackhole bh) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer mem = stack.malloc(size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t41_stack_calloc(Blackhole bh) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer mem = stack.calloc(size);
            consume(bh, mem);
        }
    }

    @Benchmark
    public void t42_stack_aligned_alloc(Blackhole bh) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer mem = stack.malloc(alignment, size);
            consume(bh, mem);
        }
    }

}
