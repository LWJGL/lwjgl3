/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct msdf_config {
 *     int overlap_support;
 * }}</pre>
 */
@NativeType("struct msdf_config")
public class MSDFGenConfig extends Struct<MSDFGenConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OVERLAP_SUPPORT;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OVERLAP_SUPPORT = layout.offsetof(0);
    }

    protected MSDFGenConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenConfig create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenConfig(address, container);
    }

    /**
     * Creates a {@code MSDFGenConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code overlap_support} field. */
    public int overlap_support() { return noverlap_support(address()); }

    /** Sets the specified value to the {@code overlap_support} field. */
    public MSDFGenConfig overlap_support(int value) { noverlap_support(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenConfig set(MSDFGenConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenConfig malloc() {
        return new MSDFGenConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenConfig calloc() {
        return new MSDFGenConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenConfig} instance allocated with {@link BufferUtils}. */
    public static MSDFGenConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenConfig(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenConfig} instance for the specified memory address. */
    public static MSDFGenConfig create(long address) {
        return new MSDFGenConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MSDFGenConfig createSafe(long address) {
        return address == NULL ? null : new MSDFGenConfig(address, null);
    }

    /**
     * Returns a new {@link MSDFGenConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MSDFGenConfig.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenConfig malloc(MemoryStack stack) {
        return new MSDFGenConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenConfig calloc(MemoryStack stack) {
        return new MSDFGenConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlap_support}. */
    public static int noverlap_support(long struct) { return memGetInt(struct + MSDFGenConfig.OVERLAP_SUPPORT); }

    /** Unsafe version of {@link #overlap_support(int) overlap_support}. */
    public static void noverlap_support(long struct, int value) { memPutInt(struct + MSDFGenConfig.OVERLAP_SUPPORT, value); }

    // -----------------------------------

    /** An array of {@link MSDFGenConfig} structs. */
    public static class Buffer extends StructBuffer<MSDFGenConfig, Buffer> implements NativeResource {

        private static final MSDFGenConfig ELEMENT_FACTORY = MSDFGenConfig.create(-1L);

        /**
         * Creates a new {@code MSDFGenConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code overlap_support} field. */
        public int overlap_support() { return MSDFGenConfig.noverlap_support(address()); }

        /** Sets the specified value to the {@code overlap_support} field. */
        public MSDFGenConfig.Buffer overlap_support(int value) { MSDFGenConfig.noverlap_support(address(), value); return this; }

    }

}