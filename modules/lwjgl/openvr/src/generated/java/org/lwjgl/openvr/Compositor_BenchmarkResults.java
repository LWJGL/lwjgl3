/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides compositor benchmark results to the app.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct Compositor_BenchmarkResults {
 *     float {@link #m_flMegaPixelsPerSecond};
 *     float {@link #m_flHmdRecommendedMegaPixelsPerSecond};
 * }</code></pre>
 */
public class Compositor_BenchmarkResults extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_FLMEGAPIXELSPERSECOND,
        M_FLHMDRECOMMENDEDMEGAPIXELSPERSECOND;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_FLMEGAPIXELSPERSECOND = layout.offsetof(0);
        M_FLHMDRECOMMENDEDMEGAPIXELSPERSECOND = layout.offsetof(1);
    }

    /**
     * Creates a {@code Compositor_BenchmarkResults} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Compositor_BenchmarkResults(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Measurement of GPU MP/s performed by compositor benchmark */
    public float m_flMegaPixelsPerSecond() { return nm_flMegaPixelsPerSecond(address()); }
    /** Recommended default MP/s given the HMD resolution, refresh, and panel mask. */
    public float m_flHmdRecommendedMegaPixelsPerSecond() { return nm_flHmdRecommendedMegaPixelsPerSecond(address()); }

    // -----------------------------------

    /** Returns a new {@code Compositor_BenchmarkResults} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Compositor_BenchmarkResults malloc() {
        return wrap(Compositor_BenchmarkResults.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code Compositor_BenchmarkResults} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Compositor_BenchmarkResults calloc() {
        return wrap(Compositor_BenchmarkResults.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code Compositor_BenchmarkResults} instance allocated with {@link BufferUtils}. */
    public static Compositor_BenchmarkResults create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(Compositor_BenchmarkResults.class, memAddress(container), container);
    }

    /** Returns a new {@code Compositor_BenchmarkResults} instance for the specified memory address. */
    public static Compositor_BenchmarkResults create(long address) {
        return wrap(Compositor_BenchmarkResults.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Compositor_BenchmarkResults createSafe(long address) {
        return address == NULL ? null : wrap(Compositor_BenchmarkResults.class, address);
    }

    /**
     * Returns a new {@link Compositor_BenchmarkResults.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Compositor_BenchmarkResults.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Compositor_BenchmarkResults.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Compositor_BenchmarkResults.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Compositor_BenchmarkResults.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Compositor_BenchmarkResults.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Compositor_BenchmarkResults.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Compositor_BenchmarkResults.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Compositor_BenchmarkResults.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code Compositor_BenchmarkResults} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Compositor_BenchmarkResults malloc(MemoryStack stack) {
        return wrap(Compositor_BenchmarkResults.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code Compositor_BenchmarkResults} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Compositor_BenchmarkResults calloc(MemoryStack stack) {
        return wrap(Compositor_BenchmarkResults.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Compositor_BenchmarkResults.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Compositor_BenchmarkResults.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Compositor_BenchmarkResults.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Compositor_BenchmarkResults.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_flMegaPixelsPerSecond}. */
    public static float nm_flMegaPixelsPerSecond(long struct) { return UNSAFE.getFloat(null, struct + Compositor_BenchmarkResults.M_FLMEGAPIXELSPERSECOND); }
    /** Unsafe version of {@link #m_flHmdRecommendedMegaPixelsPerSecond}. */
    public static float nm_flHmdRecommendedMegaPixelsPerSecond(long struct) { return UNSAFE.getFloat(null, struct + Compositor_BenchmarkResults.M_FLHMDRECOMMENDEDMEGAPIXELSPERSECOND); }

    // -----------------------------------

    /** An array of {@link Compositor_BenchmarkResults} structs. */
    public static class Buffer extends StructBuffer<Compositor_BenchmarkResults, Buffer> implements NativeResource {

        private static final Compositor_BenchmarkResults ELEMENT_FACTORY = Compositor_BenchmarkResults.create(-1L);

        /**
         * Creates a new {@code Compositor_BenchmarkResults.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Compositor_BenchmarkResults#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Compositor_BenchmarkResults getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link Compositor_BenchmarkResults#m_flMegaPixelsPerSecond} field. */
        public float m_flMegaPixelsPerSecond() { return Compositor_BenchmarkResults.nm_flMegaPixelsPerSecond(address()); }
        /** @return the value of the {@link Compositor_BenchmarkResults#m_flHmdRecommendedMegaPixelsPerSecond} field. */
        public float m_flHmdRecommendedMegaPixelsPerSecond() { return Compositor_BenchmarkResults.nm_flHmdRecommendedMegaPixelsPerSecond(address()); }

    }

}