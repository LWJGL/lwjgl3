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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct meshopt_CoverageStatistics {
 *     float coverage[3];
 *     float extent;
 * }}</pre>
 */
@NativeType("struct meshopt_CoverageStatistics")
public class MeshoptCoverageStatistics extends Struct<MeshoptCoverageStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COVERAGE,
        EXTENT;

    static {
        Layout layout = __struct(
            __array(4, 3),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COVERAGE = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
    }

    protected MeshoptCoverageStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MeshoptCoverageStatistics create(long address, @Nullable ByteBuffer container) {
        return new MeshoptCoverageStatistics(address, container);
    }

    /**
     * Creates a {@code MeshoptCoverageStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptCoverageStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code coverage} field. */
    @NativeType("float[3]")
    public FloatBuffer coverage() { return ncoverage(address()); }
    /** @return the value at the specified index of the {@code coverage} field. */
    public float coverage(int index) { return ncoverage(address(), index); }
    /** @return the value of the {@code extent} field. */
    public float extent() { return nextent(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptCoverageStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptCoverageStatistics malloc() {
        return new MeshoptCoverageStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MeshoptCoverageStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptCoverageStatistics calloc() {
        return new MeshoptCoverageStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MeshoptCoverageStatistics} instance allocated with {@link BufferUtils}. */
    public static MeshoptCoverageStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MeshoptCoverageStatistics(memAddress(container), container);
    }

    /** Returns a new {@code MeshoptCoverageStatistics} instance for the specified memory address. */
    public static MeshoptCoverageStatistics create(long address) {
        return new MeshoptCoverageStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MeshoptCoverageStatistics createSafe(long address) {
        return address == NULL ? null : new MeshoptCoverageStatistics(address, null);
    }

    /**
     * Returns a new {@link MeshoptCoverageStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptCoverageStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptCoverageStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptCoverageStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptCoverageStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptCoverageStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MeshoptCoverageStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptCoverageStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MeshoptCoverageStatistics.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MeshoptCoverageStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptCoverageStatistics malloc(MemoryStack stack) {
        return new MeshoptCoverageStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MeshoptCoverageStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptCoverageStatistics calloc(MemoryStack stack) {
        return new MeshoptCoverageStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MeshoptCoverageStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptCoverageStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptCoverageStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptCoverageStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #coverage}. */
    public static FloatBuffer ncoverage(long struct) { return memFloatBuffer(struct + MeshoptCoverageStatistics.COVERAGE, 3); }
    /** Unsafe version of {@link #coverage(int) coverage}. */
    public static float ncoverage(long struct, int index) {
        return memGetFloat(struct + MeshoptCoverageStatistics.COVERAGE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #extent}. */
    public static float nextent(long struct) { return memGetFloat(struct + MeshoptCoverageStatistics.EXTENT); }

    // -----------------------------------

    /** An array of {@link MeshoptCoverageStatistics} structs. */
    public static class Buffer extends StructBuffer<MeshoptCoverageStatistics, Buffer> implements NativeResource {

        private static final MeshoptCoverageStatistics ELEMENT_FACTORY = MeshoptCoverageStatistics.create(-1L);

        /**
         * Creates a new {@code MeshoptCoverageStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptCoverageStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected MeshoptCoverageStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code coverage} field. */
        @NativeType("float[3]")
        public FloatBuffer coverage() { return MeshoptCoverageStatistics.ncoverage(address()); }
        /** @return the value at the specified index of the {@code coverage} field. */
        public float coverage(int index) { return MeshoptCoverageStatistics.ncoverage(address(), index); }
        /** @return the value of the {@code extent} field. */
        public float extent() { return MeshoptCoverageStatistics.nextent(address()); }

    }

}