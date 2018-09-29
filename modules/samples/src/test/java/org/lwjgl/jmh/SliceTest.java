/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * This benchmark examines the performance of creating a slice with offset from a java.nio buffer object, in a thread-safe way.
 *
 * <p>It also demonstrates how easy it is to hit Hotspot's inlining limits when working with objects in a deep class hierarchy, like the java.nio buffer
 * classes.</p>
 */
public class SliceTest {

    private static final ByteBuffer buffer = memAlloc(100);

    // Slice and preserve ByteOrder. Consumes 1 inline level,
    // crossing the MaxInlineLevel threshold on Java 9+
    // because of the new overrides in buffer classes.
    private static ByteBuffer slicePBO(ByteBuffer buffer) {
        return buffer.slice().order(buffer.order());
    }

    private static void consume(ByteBuffer buffer) {
        buffer.putInt(0, 0);
    }

    @Fork(jvmArgsAppend = {
        // Required for zero garbage on Java 9+ Hotspot
        //"-XX:MaxInlineLevel=10"
    })
    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void simpleBaseline() {
        consume(slicePBO(buffer));
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void simpleLWJGL() {
        consume(memSlice(buffer));
    }

    // Thread-safe, slow
    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void offsetBaseline() {
        ByteBuffer copy = buffer.duplicate();
        copy.limit(80);
        copy.position(10);

        consume(copy.slice().order(buffer.order()));
    }

    // Not thread-safe, fast
    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void offsetMutating() {
        int limit    = buffer.limit();
        int position = buffer.position();

        try {
            buffer.limit(position + (10 + 80));
            buffer.position(position + 10);

            consume(buffer.slice().order(buffer.order()));
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
    }

    // Thread-safe, fast
    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void offsetLWJGL() {
        consume(memSlice(buffer, 10, 80));
    }

}
