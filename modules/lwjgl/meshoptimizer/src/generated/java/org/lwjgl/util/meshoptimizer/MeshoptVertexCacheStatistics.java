/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meshopt_VertexCacheStatistics {
 *     unsigned int vertices_transformed;
 *     unsigned int warps_executed;
 *     float {@link #acmr};
 *     float {@link #atvr};
 * }</code></pre>
 */
@NativeType("struct meshopt_VertexCacheStatistics")
public class MeshoptVertexCacheStatistics extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTICES_TRANSFORMED,
        WARPS_EXECUTED,
        ACMR,
        ATVR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTICES_TRANSFORMED = layout.offsetof(0);
        WARPS_EXECUTED = layout.offsetof(1);
        ACMR = layout.offsetof(2);
        ATVR = layout.offsetof(3);
    }

    /**
     * Creates a {@code MeshoptVertexCacheStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptVertexCacheStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vertices_transformed} field. */
    @NativeType("unsigned int")
    public int vertices_transformed() { return nvertices_transformed(address()); }
    /** @return the value of the {@code warps_executed} field. */
    @NativeType("unsigned int")
    public int warps_executed() { return nwarps_executed(address()); }
    /** transformed vertices / triangle count; best case 0.5, worst case 3.0, optimum depends on topology */
    public float acmr() { return nacmr(address()); }
    /** transformed vertices / vertex count; best case 1.0, worst case 6.0, optimum is 1.0 (each vertex is transformed once) */
    public float atvr() { return natvr(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptVertexCacheStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptVertexCacheStatistics malloc() {
        return wrap(MeshoptVertexCacheStatistics.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MeshoptVertexCacheStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptVertexCacheStatistics calloc() {
        return wrap(MeshoptVertexCacheStatistics.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MeshoptVertexCacheStatistics} instance allocated with {@link BufferUtils}. */
    public static MeshoptVertexCacheStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeshoptVertexCacheStatistics.class, memAddress(container), container);
    }

    /** Returns a new {@code MeshoptVertexCacheStatistics} instance for the specified memory address. */
    public static MeshoptVertexCacheStatistics create(long address) {
        return wrap(MeshoptVertexCacheStatistics.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptVertexCacheStatistics createSafe(long address) {
        return address == NULL ? null : wrap(MeshoptVertexCacheStatistics.class, address);
    }

    /**
     * Returns a new {@link MeshoptVertexCacheStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexCacheStatistics.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptVertexCacheStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexCacheStatistics.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptVertexCacheStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexCacheStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeshoptVertexCacheStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexCacheStatistics.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptVertexCacheStatistics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code MeshoptVertexCacheStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptVertexCacheStatistics malloc(MemoryStack stack) {
        return wrap(MeshoptVertexCacheStatistics.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MeshoptVertexCacheStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptVertexCacheStatistics calloc(MemoryStack stack) {
        return wrap(MeshoptVertexCacheStatistics.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeshoptVertexCacheStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexCacheStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptVertexCacheStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexCacheStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertices_transformed}. */
    public static int nvertices_transformed(long struct) { return UNSAFE.getInt(null, struct + MeshoptVertexCacheStatistics.VERTICES_TRANSFORMED); }
    /** Unsafe version of {@link #warps_executed}. */
    public static int nwarps_executed(long struct) { return UNSAFE.getInt(null, struct + MeshoptVertexCacheStatistics.WARPS_EXECUTED); }
    /** Unsafe version of {@link #acmr}. */
    public static float nacmr(long struct) { return UNSAFE.getFloat(null, struct + MeshoptVertexCacheStatistics.ACMR); }
    /** Unsafe version of {@link #atvr}. */
    public static float natvr(long struct) { return UNSAFE.getFloat(null, struct + MeshoptVertexCacheStatistics.ATVR); }

    // -----------------------------------

    /** An array of {@link MeshoptVertexCacheStatistics} structs. */
    public static class Buffer extends StructBuffer<MeshoptVertexCacheStatistics, Buffer> implements NativeResource {

        private static final MeshoptVertexCacheStatistics ELEMENT_FACTORY = MeshoptVertexCacheStatistics.create(-1L);

        /**
         * Creates a new {@code MeshoptVertexCacheStatistics.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptVertexCacheStatistics#SIZEOF}, and its mark will be undefined.
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
        protected MeshoptVertexCacheStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vertices_transformed} field. */
        @NativeType("unsigned int")
        public int vertices_transformed() { return MeshoptVertexCacheStatistics.nvertices_transformed(address()); }
        /** @return the value of the {@code warps_executed} field. */
        @NativeType("unsigned int")
        public int warps_executed() { return MeshoptVertexCacheStatistics.nwarps_executed(address()); }
        /** @return the value of the {@link MeshoptVertexCacheStatistics#acmr} field. */
        public float acmr() { return MeshoptVertexCacheStatistics.nacmr(address()); }
        /** @return the value of the {@link MeshoptVertexCacheStatistics#atvr} field. */
        public float atvr() { return MeshoptVertexCacheStatistics.natvr(address()); }

    }

}