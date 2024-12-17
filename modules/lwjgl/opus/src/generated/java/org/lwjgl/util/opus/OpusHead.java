/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct OpusHead {
 *     int version;
 *     int channel_count;
 *     unsigned int pre_skip;
 *     opus_uint32 input_sample_rate;
 *     int output_gain;
 *     int mapping_family;
 *     int stream_count;
 *     int coupled_count;
 *     unsigned char mapping[255];
 * }}</pre>
 */
public class OpusHead extends Struct<OpusHead> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        CHANNEL_COUNT,
        PRE_SKIP,
        INPUT_SAMPLE_RATE,
        OUTPUT_GAIN,
        MAPPING_FAMILY,
        STREAM_COUNT,
        COUPLED_COUNT,
        MAPPING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(1, 255)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        CHANNEL_COUNT = layout.offsetof(1);
        PRE_SKIP = layout.offsetof(2);
        INPUT_SAMPLE_RATE = layout.offsetof(3);
        OUTPUT_GAIN = layout.offsetof(4);
        MAPPING_FAMILY = layout.offsetof(5);
        STREAM_COUNT = layout.offsetof(6);
        COUPLED_COUNT = layout.offsetof(7);
        MAPPING = layout.offsetof(8);
    }

    protected OpusHead(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OpusHead create(long address, @Nullable ByteBuffer container) {
        return new OpusHead(address, container);
    }

    /**
     * Creates a {@code OpusHead} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpusHead(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    public int version() { return nversion(address()); }
    /** @return the value of the {@code channel_count} field. */
    public int channel_count() { return nchannel_count(address()); }
    /** @return the value of the {@code pre_skip} field. */
    @NativeType("unsigned int")
    public int pre_skip() { return npre_skip(address()); }
    /** @return the value of the {@code input_sample_rate} field. */
    @NativeType("opus_uint32")
    public int input_sample_rate() { return ninput_sample_rate(address()); }
    /** @return the value of the {@code output_gain} field. */
    public int output_gain() { return noutput_gain(address()); }
    /** @return the value of the {@code mapping_family} field. */
    public int mapping_family() { return nmapping_family(address()); }
    /** @return the value of the {@code stream_count} field. */
    public int stream_count() { return nstream_count(address()); }
    /** @return the value of the {@code coupled_count} field. */
    public int coupled_count() { return ncoupled_count(address()); }
    /** @return a {@link ByteBuffer} view of the {@code mapping} field. */
    @NativeType("unsigned char[255]")
    public ByteBuffer mapping() { return nmapping(address()); }
    /** @return the value at the specified index of the {@code mapping} field. */
    @NativeType("unsigned char")
    public byte mapping(int index) { return nmapping(address(), index); }

    // -----------------------------------

    /** Returns a new {@code OpusHead} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusHead malloc() {
        return new OpusHead(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OpusHead} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusHead calloc() {
        return new OpusHead(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OpusHead} instance allocated with {@link BufferUtils}. */
    public static OpusHead create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OpusHead(memAddress(container), container);
    }

    /** Returns a new {@code OpusHead} instance for the specified memory address. */
    public static OpusHead create(long address) {
        return new OpusHead(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OpusHead createSafe(long address) {
        return address == NULL ? null : new OpusHead(address, null);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OpusHead.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OpusHead.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code OpusHead} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusHead malloc(MemoryStack stack) {
        return new OpusHead(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OpusHead} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusHead calloc(MemoryStack stack) {
        return new OpusHead(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + OpusHead.VERSION); }
    /** Unsafe version of {@link #channel_count}. */
    public static int nchannel_count(long struct) { return memGetInt(struct + OpusHead.CHANNEL_COUNT); }
    /** Unsafe version of {@link #pre_skip}. */
    public static int npre_skip(long struct) { return memGetInt(struct + OpusHead.PRE_SKIP); }
    /** Unsafe version of {@link #input_sample_rate}. */
    public static int ninput_sample_rate(long struct) { return memGetInt(struct + OpusHead.INPUT_SAMPLE_RATE); }
    /** Unsafe version of {@link #output_gain}. */
    public static int noutput_gain(long struct) { return memGetInt(struct + OpusHead.OUTPUT_GAIN); }
    /** Unsafe version of {@link #mapping_family}. */
    public static int nmapping_family(long struct) { return memGetInt(struct + OpusHead.MAPPING_FAMILY); }
    /** Unsafe version of {@link #stream_count}. */
    public static int nstream_count(long struct) { return memGetInt(struct + OpusHead.STREAM_COUNT); }
    /** Unsafe version of {@link #coupled_count}. */
    public static int ncoupled_count(long struct) { return memGetInt(struct + OpusHead.COUPLED_COUNT); }
    /** Unsafe version of {@link #mapping}. */
    public static ByteBuffer nmapping(long struct) { return memByteBuffer(struct + OpusHead.MAPPING, 255); }
    /** Unsafe version of {@link #mapping(int) mapping}. */
    public static byte nmapping(long struct, int index) {
        return memGetByte(struct + OpusHead.MAPPING + check(index, 255) * 1);
    }

    // -----------------------------------

    /** An array of {@link OpusHead} structs. */
    public static class Buffer extends StructBuffer<OpusHead, Buffer> implements NativeResource {

        private static final OpusHead ELEMENT_FACTORY = OpusHead.create(-1L);

        /**
         * Creates a new {@code OpusHead.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusHead#SIZEOF}, and its mark will be undefined.</p>
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
        protected OpusHead getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        public int version() { return OpusHead.nversion(address()); }
        /** @return the value of the {@code channel_count} field. */
        public int channel_count() { return OpusHead.nchannel_count(address()); }
        /** @return the value of the {@code pre_skip} field. */
        @NativeType("unsigned int")
        public int pre_skip() { return OpusHead.npre_skip(address()); }
        /** @return the value of the {@code input_sample_rate} field. */
        @NativeType("opus_uint32")
        public int input_sample_rate() { return OpusHead.ninput_sample_rate(address()); }
        /** @return the value of the {@code output_gain} field. */
        public int output_gain() { return OpusHead.noutput_gain(address()); }
        /** @return the value of the {@code mapping_family} field. */
        public int mapping_family() { return OpusHead.nmapping_family(address()); }
        /** @return the value of the {@code stream_count} field. */
        public int stream_count() { return OpusHead.nstream_count(address()); }
        /** @return the value of the {@code coupled_count} field. */
        public int coupled_count() { return OpusHead.ncoupled_count(address()); }
        /** @return a {@link ByteBuffer} view of the {@code mapping} field. */
        @NativeType("unsigned char[255]")
        public ByteBuffer mapping() { return OpusHead.nmapping(address()); }
        /** @return the value at the specified index of the {@code mapping} field. */
        @NativeType("unsigned char")
        public byte mapping(int index) { return OpusHead.nmapping(address(), index); }

    }

}