/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.system.jemalloc.JEmalloc.*;

/** A {@link MemoryAllocator} implementation using the jemalloc library. */
public class JEmallocAllocator implements MemoryAllocator {

    static {
        // initialize jemalloc
        JEmalloc.getLibrary();
    }

    @Override
    public long getMalloc() { return JEmalloc.Functions.malloc; }

    @Override
    public long getCalloc() { return JEmalloc.Functions.calloc; }

    @Override
    public long getRealloc() { return JEmalloc.Functions.realloc; }

    @Override
    public long getFree() { return JEmalloc.Functions.free; }

    @Override
    public long getAlignedAlloc() { return JEmalloc.Functions.aligned_alloc; }

    @Override
    public long getAlignedFree() { return JEmalloc.Functions.free; }

    @Override
    public long malloc(long size) {
        return nje_malloc(size);
    }

    @Override
    public long calloc(long num, long size) {
        return nje_calloc(num, size);
    }

    @Override
    public long realloc(long ptr, long size) {
        return nje_realloc(ptr, size);
    }

    @Override
    public void free(long ptr) {
        nje_free(ptr);
    }

    @Override
    public long aligned_alloc(long alignment, long size) {
        return nje_aligned_alloc(alignment, size);
    }

    @Override
    public void aligned_free(long ptr) {
        nje_free(ptr);
    }

}
