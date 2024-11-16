/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meshopt_VertexFetchStatistics {
 *     unsigned int bytes_fetched;
 *     float {@link #overfetch};
 * }</code></pre>
 */
@NativeType("struct meshopt_VertexFetchStatistics")
public class MeshoptVertexFetchStatistics extends Struct<MeshoptVertexFetchStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BYTES_FETCHED,
        OVERFETCH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BYTES_FETCHED = layout.offsetof(0);
        OVERFETCH = layout.offsetof(1);
    }

    protected MeshoptVertexFetchStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MeshoptVertexFetchStatistics create(long address, @Nullable ByteBuffer container) {
        return new MeshoptVertexFetchStatistics(address, container);
    }

    /**
     * Creates a {@code MeshoptVertexFetchStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptVertexFetchStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bytes_fetched} field. */
    @NativeType("unsigned int")
    public int bytes_fetched() { return nbytes_fetched(address()); }
    /** fetched bytes / vertex buffer size; best case 1.0 (each byte is fetched once) */
    public float overfetch() { return noverfetch(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptVertexFetchStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptVertexFetchStatistics malloc() {
        return new MeshoptVertexFetchStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MeshoptVertexFetchStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptVertexFetchStatistics calloc() {
        return new MeshoptVertexFetchStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MeshoptVertexFetchStatistics} instance allocated with {@link BufferUtils}. */
    public static MeshoptVertexFetchStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MeshoptVertexFetchStatistics(memAddress(container), container);
    }

    /** Returns a new {@code MeshoptVertexFetchStatistics} instance for the specified memory address. */
    public static MeshoptVertexFetchStatistics create(long address) {
        return new MeshoptVertexFetchStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MeshoptVertexFetchStatistics createSafe(long address) {
        return address == NULL ? null : new MeshoptVertexFetchStatistics(address, null);
    }

    /**
     * Returns a new {@link MeshoptVertexFetchStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexFetchStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptVertexFetchStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexFetchStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptVertexFetchStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexFetchStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MeshoptVertexFetchStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexFetchStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MeshoptVertexFetchStatistics.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MeshoptVertexFetchStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptVertexFetchStatistics malloc(MemoryStack stack) {
        return new MeshoptVertexFetchStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MeshoptVertexFetchStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptVertexFetchStatistics calloc(MemoryStack stack) {
        return new MeshoptVertexFetchStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MeshoptVertexFetchStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexFetchStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptVertexFetchStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptVertexFetchStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bytes_fetched}. */
    public static int nbytes_fetched(long struct) { return memGetInt(struct + MeshoptVertexFetchStatistics.BYTES_FETCHED); }
    /** Unsafe version of {@link #overfetch}. */
    public static float noverfetch(long struct) { return memGetFloat(struct + MeshoptVertexFetchStatistics.OVERFETCH); }

    // -----------------------------------

    /** An array of {@link MeshoptVertexFetchStatistics} structs. */
    public static class Buffer extends StructBuffer<MeshoptVertexFetchStatistics, Buffer> implements NativeResource {

        private static final MeshoptVertexFetchStatistics ELEMENT_FACTORY = MeshoptVertexFetchStatistics.create(-1L);

        /**
         * Creates a new {@code MeshoptVertexFetchStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptVertexFetchStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected MeshoptVertexFetchStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bytes_fetched} field. */
        @NativeType("unsigned int")
        public int bytes_fetched() { return MeshoptVertexFetchStatistics.nbytes_fetched(address()); }
        /** @return the value of the {@link MeshoptVertexFetchStatistics#overfetch} field. */
        public float overfetch() { return MeshoptVertexFetchStatistics.noverfetch(address()); }

    }

}