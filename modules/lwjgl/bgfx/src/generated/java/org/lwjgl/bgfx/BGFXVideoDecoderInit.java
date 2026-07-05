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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct bgfx_video_decoder_init_t {
 *     uint32_t magic;
 *     bgfx_video_codec_t codec;
 *     uint8_t const * parameterSets;
 *     uint32_t parameterSetsSize;
 *     uint32_t cachedAuBytes;
 *     uint8_t flags;
 * }}</pre>
 */
@NativeType("struct bgfx_video_decoder_init_t")
public class BGFXVideoDecoderInit extends Struct<BGFXVideoDecoderInit> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAGIC,
        CODEC,
        PARAMETERSETS,
        PARAMETERSETSSIZE,
        CACHEDAUBYTES,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAGIC = layout.offsetof(0);
        CODEC = layout.offsetof(1);
        PARAMETERSETS = layout.offsetof(2);
        PARAMETERSETSSIZE = layout.offsetof(3);
        CACHEDAUBYTES = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
    }

    protected BGFXVideoDecoderInit(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXVideoDecoderInit create(long address, @Nullable ByteBuffer container) {
        return new BGFXVideoDecoderInit(address, container);
    }

    /**
     * Creates a {@code BGFXVideoDecoderInit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXVideoDecoderInit(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code magic} field. */
    @NativeType("uint32_t")
    public int magic() { return nmagic(address()); }
    /** @return the value of the {@code codec} field. */
    @NativeType("bgfx_video_codec_t")
    public int codec() { return ncodec(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code parameterSets} field. */
    @NativeType("uint8_t const *")
    public ByteBuffer parameterSets() { return nparameterSets(address()); }
    /** @return the value of the {@code parameterSetsSize} field. */
    @NativeType("uint32_t")
    public int parameterSetsSize() { return nparameterSetsSize(address()); }
    /** @return the value of the {@code cachedAuBytes} field. */
    @NativeType("uint32_t")
    public int cachedAuBytes() { return ncachedAuBytes(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint8_t")
    public byte flags() { return nflags(address()); }

    /** Sets the specified value to the {@code magic} field. */
    public BGFXVideoDecoderInit magic(@NativeType("uint32_t") int value) { nmagic(address(), value); return this; }
    /** Sets the specified value to the {@code codec} field. */
    public BGFXVideoDecoderInit codec(@NativeType("bgfx_video_codec_t") int value) { ncodec(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code parameterSets} field. */
    public BGFXVideoDecoderInit parameterSets(@NativeType("uint8_t const *") ByteBuffer value) { nparameterSets(address(), value); return this; }
    /** Sets the specified value to the {@code cachedAuBytes} field. */
    public BGFXVideoDecoderInit cachedAuBytes(@NativeType("uint32_t") int value) { ncachedAuBytes(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public BGFXVideoDecoderInit flags(@NativeType("uint8_t") byte value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXVideoDecoderInit set(
        int magic,
        int codec,
        ByteBuffer parameterSets,
        int cachedAuBytes,
        byte flags
    ) {
        magic(magic);
        codec(codec);
        parameterSets(parameterSets);
        cachedAuBytes(cachedAuBytes);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXVideoDecoderInit set(BGFXVideoDecoderInit src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXVideoDecoderInit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXVideoDecoderInit malloc() {
        return new BGFXVideoDecoderInit(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BGFXVideoDecoderInit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXVideoDecoderInit calloc() {
        return new BGFXVideoDecoderInit(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BGFXVideoDecoderInit} instance allocated with {@link BufferUtils}. */
    public static BGFXVideoDecoderInit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BGFXVideoDecoderInit(memAddress(container), container);
    }

    /** Returns a new {@code BGFXVideoDecoderInit} instance for the specified memory address. */
    public static BGFXVideoDecoderInit create(long address) {
        return new BGFXVideoDecoderInit(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXVideoDecoderInit createSafe(long address) {
        return address == NULL ? null : new BGFXVideoDecoderInit(address, null);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderInit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderInit.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderInit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderInit.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderInit.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderInit.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link BGFXVideoDecoderInit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderInit.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXVideoDecoderInit.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code BGFXVideoDecoderInit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVideoDecoderInit malloc(MemoryStack stack) {
        return new BGFXVideoDecoderInit(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BGFXVideoDecoderInit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVideoDecoderInit calloc(MemoryStack stack) {
        return new BGFXVideoDecoderInit(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderInit.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderInit.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVideoDecoderInit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVideoDecoderInit.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static int nmagic(long struct) { return memGetInt(struct + BGFXVideoDecoderInit.MAGIC); }
    /** Unsafe version of {@link #codec}. */
    public static int ncodec(long struct) { return memGetInt(struct + BGFXVideoDecoderInit.CODEC); }
    /** Unsafe version of {@link #parameterSets() parameterSets}. */
    public static ByteBuffer nparameterSets(long struct) { return memByteBuffer(memGetAddress(struct + BGFXVideoDecoderInit.PARAMETERSETS), nparameterSetsSize(struct)); }
    /** Unsafe version of {@link #parameterSetsSize}. */
    public static int nparameterSetsSize(long struct) { return memGetInt(struct + BGFXVideoDecoderInit.PARAMETERSETSSIZE); }
    /** Unsafe version of {@link #cachedAuBytes}. */
    public static int ncachedAuBytes(long struct) { return memGetInt(struct + BGFXVideoDecoderInit.CACHEDAUBYTES); }
    /** Unsafe version of {@link #flags}. */
    public static byte nflags(long struct) { return memGetByte(struct + BGFXVideoDecoderInit.FLAGS); }

    /** Unsafe version of {@link #magic(int) magic}. */
    public static void nmagic(long struct, int value) { memPutInt(struct + BGFXVideoDecoderInit.MAGIC, value); }
    /** Unsafe version of {@link #codec(int) codec}. */
    public static void ncodec(long struct, int value) { memPutInt(struct + BGFXVideoDecoderInit.CODEC, value); }
    /** Unsafe version of {@link #parameterSets(ByteBuffer) parameterSets}. */
    public static void nparameterSets(long struct, ByteBuffer value) { memPutAddress(struct + BGFXVideoDecoderInit.PARAMETERSETS, memAddress(value)); nparameterSetsSize(struct, value.remaining()); }
    /** Sets the specified value to the {@code parameterSetsSize} field of the specified {@code struct}. */
    public static void nparameterSetsSize(long struct, int value) { memPutInt(struct + BGFXVideoDecoderInit.PARAMETERSETSSIZE, value); }
    /** Unsafe version of {@link #cachedAuBytes(int) cachedAuBytes}. */
    public static void ncachedAuBytes(long struct, int value) { memPutInt(struct + BGFXVideoDecoderInit.CACHEDAUBYTES, value); }
    /** Unsafe version of {@link #flags(byte) flags}. */
    public static void nflags(long struct, byte value) { memPutByte(struct + BGFXVideoDecoderInit.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXVideoDecoderInit.PARAMETERSETS));
    }

    // -----------------------------------

    /** An array of {@link BGFXVideoDecoderInit} structs. */
    public static class Buffer extends StructBuffer<BGFXVideoDecoderInit, Buffer> implements NativeResource {

        private static final BGFXVideoDecoderInit ELEMENT_FACTORY = BGFXVideoDecoderInit.create(-1L);

        /**
         * Creates a new {@code BGFXVideoDecoderInit.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXVideoDecoderInit#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXVideoDecoderInit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code magic} field. */
        @NativeType("uint32_t")
        public int magic() { return BGFXVideoDecoderInit.nmagic(address()); }
        /** @return the value of the {@code codec} field. */
        @NativeType("bgfx_video_codec_t")
        public int codec() { return BGFXVideoDecoderInit.ncodec(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code parameterSets} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer parameterSets() { return BGFXVideoDecoderInit.nparameterSets(address()); }
        /** @return the value of the {@code parameterSetsSize} field. */
        @NativeType("uint32_t")
        public int parameterSetsSize() { return BGFXVideoDecoderInit.nparameterSetsSize(address()); }
        /** @return the value of the {@code cachedAuBytes} field. */
        @NativeType("uint32_t")
        public int cachedAuBytes() { return BGFXVideoDecoderInit.ncachedAuBytes(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint8_t")
        public byte flags() { return BGFXVideoDecoderInit.nflags(address()); }

        /** Sets the specified value to the {@code magic} field. */
        public BGFXVideoDecoderInit.Buffer magic(@NativeType("uint32_t") int value) { BGFXVideoDecoderInit.nmagic(address(), value); return this; }
        /** Sets the specified value to the {@code codec} field. */
        public BGFXVideoDecoderInit.Buffer codec(@NativeType("bgfx_video_codec_t") int value) { BGFXVideoDecoderInit.ncodec(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code parameterSets} field. */
        public BGFXVideoDecoderInit.Buffer parameterSets(@NativeType("uint8_t const *") ByteBuffer value) { BGFXVideoDecoderInit.nparameterSets(address(), value); return this; }
        /** Sets the specified value to the {@code cachedAuBytes} field. */
        public BGFXVideoDecoderInit.Buffer cachedAuBytes(@NativeType("uint32_t") int value) { BGFXVideoDecoderInit.ncachedAuBytes(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public BGFXVideoDecoderInit.Buffer flags(@NativeType("uint8_t") byte value) { BGFXVideoDecoderInit.nflags(address(), value); return this; }

    }

}