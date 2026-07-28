/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct bgfx_video_decoder_au_t {
 *     uint32_t size;
 *     int64_t ptsUs;
 * }}</pre>
 */
@NativeType("struct bgfx_video_decoder_au_t")
public class BGFXVideoDecoderAU extends Struct<BGFXVideoDecoderAU> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        PTSUS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        PTSUS = layout.offsetof(1);
    }

    protected BGFXVideoDecoderAU(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXVideoDecoderAU create(long address, @Nullable ByteBuffer container) {
        return new BGFXVideoDecoderAU(address, container);
    }

    /**
     * Creates a {@code BGFXVideoDecoderAU} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXVideoDecoderAU(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** @return the value of the {@code ptsUs} field. */
    @NativeType("int64_t")
    public long ptsUs() { return nptsUs(address()); }

    /** Sets the specified value to the {@code size} field. */
    public BGFXVideoDecoderAU size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code ptsUs} field. */
    public BGFXVideoDecoderAU ptsUs(@NativeType("int64_t") long value) { nptsUs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXVideoDecoderAU set(
        int size,
        long ptsUs
    ) {
        size(size);
        ptsUs(ptsUs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXVideoDecoderAU set(BGFXVideoDecoderAU src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXVideoDecoderAU} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXVideoDecoderAU malloc() {
        return new BGFXVideoDecoderAU(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BGFXVideoDecoderAU} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXVideoDecoderAU calloc() {
        return new BGFXVideoDecoderAU(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BGFXVideoDecoderAU} instance allocated with {@link BufferUtils}. */
    public static BGFXVideoDecoderAU create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BGFXVideoDecoderAU(memAddress(container), container);
    }

    /** Returns a new {@code BGFXVideoDecoderAU} instance for the specified memory address. */
    public static BGFXVideoDecoderAU create(long address) {
        return new BGFXVideoDecoderAU(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXVideoDecoderAU createSafe(long address) {
        return address == NULL ? null : new BGFXVideoDecoderAU(address, null);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderAU.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderAU.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderAU.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderAU.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderAU.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderAU.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link BGFXVideoDecoderAU.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderAU.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXVideoDecoderAU.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code BGFXVideoDecoderAU} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVideoDecoderAU malloc(MemoryStack stack) {
        return new BGFXVideoDecoderAU(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BGFXVideoDecoderAU} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVideoDecoderAU calloc(MemoryStack stack) {
        return new BGFXVideoDecoderAU(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderAU.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderAU.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderAU.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderAU.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + BGFXVideoDecoderAU.SIZE); }
    /** Unsafe version of {@link #ptsUs}. */
    public static long nptsUs(long struct) { return memGetLong(struct + BGFXVideoDecoderAU.PTSUS); }

    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + BGFXVideoDecoderAU.SIZE, value); }
    /** Unsafe version of {@link #ptsUs(long) ptsUs}. */
    public static void nptsUs(long struct, long value) { memPutLong(struct + BGFXVideoDecoderAU.PTSUS, value); }

    // -----------------------------------

    /** An array of {@link BGFXVideoDecoderAU} structs. */
    public static class Buffer extends StructBuffer<BGFXVideoDecoderAU, Buffer> implements NativeResource {

        private static final BGFXVideoDecoderAU ELEMENT_FACTORY = BGFXVideoDecoderAU.create(-1L);

        /**
         * Creates a new {@code BGFXVideoDecoderAU.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXVideoDecoderAU#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXVideoDecoderAU getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return BGFXVideoDecoderAU.nsize(address()); }
        /** @return the value of the {@code ptsUs} field. */
        @NativeType("int64_t")
        public long ptsUs() { return BGFXVideoDecoderAU.nptsUs(address()); }

        /** Sets the specified value to the {@code size} field. */
        public BGFXVideoDecoderAU.Buffer size(@NativeType("uint32_t") int value) { BGFXVideoDecoderAU.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code ptsUs} field. */
        public BGFXVideoDecoderAU.Buffer ptsUs(@NativeType("int64_t") long value) { BGFXVideoDecoderAU.nptsUs(address(), value); return this; }

    }

}