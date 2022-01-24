/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Ogg Opus bitstream information. This contains the basic playback parameters for a stream, and corresponds to the initial ID header packet of an Ogg
 * Opus stream.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct OpusHead {
 *     int {@link #version};
 *     int {@link #channel_count};
 *     unsigned int {@link #pre_skip};
 *     opus_uint32 {@link #input_sample_rate};
 *     int {@link #output_gain};
 *     int {@link #mapping_family};
 *     int {@link #stream_count};
 *     int {@link #coupled_count};
 *     unsigned char {@link #mapping}[255];
 * }</code></pre>
 */
public class OpusHead extends Struct implements NativeResource {

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

    /**
     * the Ogg Opus format version, in the range {@code 0...255}.
     * 
     * <p>The top 4 bits represent a "major" version, and the bottom four bits represent backwards-compatible "minor" revisions. The current specification
     * describes version 1. This library will recognize versions up through 15 as backwards compatible with the current specification. An earlier draft of the
     * specification described a version 0, but the only difference between version 1 and version 0 is that version 0 did not specify the semantics for
     * handling the version field.</p>
     */
    public int version() { return nversion(address()); }
    /** the number of channels, in the range {@code 1...255}. */
    public int channel_count() { return nchannel_count(address()); }
    /** the number of samples that should be discarded from the beginning of the stream */
    @NativeType("unsigned int")
    public int pre_skip() { return npre_skip(address()); }
    /**
     * the sampling rate of the original input.
     * 
     * <p>All Opus audio is coded at 48 kHz, and should also be decoded at 48 kHz for playback (unless the target hardware does not support this sampling rate).
     * However, this field may be used to resample the audio back to the original sampling rate, for example, when saving the output to a file.</p>
     */
    @NativeType("opus_uint32")
    public int input_sample_rate() { return ninput_sample_rate(address()); }
    /**
     * the gain to apply to the decoded output, in dB, as a {@code Q8} value in the range {@code -32768...32767}.
     * 
     * <p>The libopusfile API will automatically apply this gain to the decoded output before returning it, scaling it by
     * {@code pow(10,output_gain/(20.0*256))}. You can adjust this behavior with {@link OpusFile#op_set_gain_offset}.</p>
     */
    public int output_gain() { return noutput_gain(address()); }
    /**
     * the channel mapping family, in the range {@code 0...255}.
     * 
     * <p>Channel mapping family 0 covers mono or stereo in a single stream. Channel mapping family 1 covers 1 to 8 channels in one or more streams, using the
     * Vorbis speaker assignments. Channel mapping family 255 covers 1 to 255 channels in one or more streams, but without any defined speaker assignment.</p>
     */
    public int mapping_family() { return nmapping_family(address()); }
    /** the number of Opus streams in each Ogg packet, in the range {@code 1...255}. */
    public int stream_count() { return nstream_count(address()); }
    /**
     * the number of coupled Opus streams in each Ogg packet, in the range {@code 0...127}.
     * 
     * <p>This must satisfy {@code 0 <= coupled_count <= stream_count} and {@code coupled_count + stream_count <= 255}. The coupled streams appear first, before
     * all uncoupled streams, in an Ogg Opus packet.</p>
     */
    public int coupled_count() { return ncoupled_count(address()); }
    /**
     * the mapping from coded stream channels to output channels.
     * 
     * <p>Let {@code index=mapping[k]} be the value for channel {@code k}. If {@code index < 2*coupled_count}, then it refers to the left channel from stream
     * {@code (index/2)} if even, and the right channel from stream {@code (index/2)} if odd. Otherwise, it refers to the output of the uncoupled stream
     * {@code (index-coupled_count)}.</p>
     */
    @NativeType("unsigned char[255]")
    public ByteBuffer mapping() { return nmapping(address()); }
    /**
     * the mapping from coded stream channels to output channels.
     * 
     * <p>Let {@code index=mapping[k]} be the value for channel {@code k}. If {@code index < 2*coupled_count}, then it refers to the left channel from stream
     * {@code (index/2)} if even, and the right channel from stream {@code (index/2)} if odd. Otherwise, it refers to the output of the uncoupled stream
     * {@code (index-coupled_count)}.</p>
     */
    @NativeType("unsigned char")
    public byte mapping(int index) { return nmapping(address(), index); }

    // -----------------------------------

    /** Returns a new {@code OpusHead} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusHead malloc() {
        return wrap(OpusHead.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OpusHead} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusHead calloc() {
        return wrap(OpusHead.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OpusHead} instance allocated with {@link BufferUtils}. */
    public static OpusHead create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OpusHead.class, memAddress(container), container);
    }

    /** Returns a new {@code OpusHead} instance for the specified memory address. */
    public static OpusHead create(long address) {
        return wrap(OpusHead.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusHead createSafe(long address) {
        return address == NULL ? null : wrap(OpusHead.class, address);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OpusHead.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusHead.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code OpusHead} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusHead malloc(MemoryStack stack) {
        return wrap(OpusHead.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OpusHead} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusHead calloc(MemoryStack stack) {
        return wrap(OpusHead.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusHead.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusHead.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + OpusHead.VERSION); }
    /** Unsafe version of {@link #channel_count}. */
    public static int nchannel_count(long struct) { return UNSAFE.getInt(null, struct + OpusHead.CHANNEL_COUNT); }
    /** Unsafe version of {@link #pre_skip}. */
    public static int npre_skip(long struct) { return UNSAFE.getInt(null, struct + OpusHead.PRE_SKIP); }
    /** Unsafe version of {@link #input_sample_rate}. */
    public static int ninput_sample_rate(long struct) { return UNSAFE.getInt(null, struct + OpusHead.INPUT_SAMPLE_RATE); }
    /** Unsafe version of {@link #output_gain}. */
    public static int noutput_gain(long struct) { return UNSAFE.getInt(null, struct + OpusHead.OUTPUT_GAIN); }
    /** Unsafe version of {@link #mapping_family}. */
    public static int nmapping_family(long struct) { return UNSAFE.getInt(null, struct + OpusHead.MAPPING_FAMILY); }
    /** Unsafe version of {@link #stream_count}. */
    public static int nstream_count(long struct) { return UNSAFE.getInt(null, struct + OpusHead.STREAM_COUNT); }
    /** Unsafe version of {@link #coupled_count}. */
    public static int ncoupled_count(long struct) { return UNSAFE.getInt(null, struct + OpusHead.COUPLED_COUNT); }
    /** Unsafe version of {@link #mapping}. */
    public static ByteBuffer nmapping(long struct) { return memByteBuffer(struct + OpusHead.MAPPING, 255); }
    /** Unsafe version of {@link #mapping(int) mapping}. */
    public static byte nmapping(long struct, int index) {
        return UNSAFE.getByte(null, struct + OpusHead.MAPPING + check(index, 255) * 1);
    }

    // -----------------------------------

    /** An array of {@link OpusHead} structs. */
    public static class Buffer extends StructBuffer<OpusHead, Buffer> implements NativeResource {

        private static final OpusHead ELEMENT_FACTORY = OpusHead.create(-1L);

        /**
         * Creates a new {@code OpusHead.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusHead#SIZEOF}, and its mark will be undefined.
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
        protected OpusHead getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OpusHead#version} field. */
        public int version() { return OpusHead.nversion(address()); }
        /** @return the value of the {@link OpusHead#channel_count} field. */
        public int channel_count() { return OpusHead.nchannel_count(address()); }
        /** @return the value of the {@link OpusHead#pre_skip} field. */
        @NativeType("unsigned int")
        public int pre_skip() { return OpusHead.npre_skip(address()); }
        /** @return the value of the {@link OpusHead#input_sample_rate} field. */
        @NativeType("opus_uint32")
        public int input_sample_rate() { return OpusHead.ninput_sample_rate(address()); }
        /** @return the value of the {@link OpusHead#output_gain} field. */
        public int output_gain() { return OpusHead.noutput_gain(address()); }
        /** @return the value of the {@link OpusHead#mapping_family} field. */
        public int mapping_family() { return OpusHead.nmapping_family(address()); }
        /** @return the value of the {@link OpusHead#stream_count} field. */
        public int stream_count() { return OpusHead.nstream_count(address()); }
        /** @return the value of the {@link OpusHead#coupled_count} field. */
        public int coupled_count() { return OpusHead.ncoupled_count(address()); }
        /** @return a {@link ByteBuffer} view of the {@link OpusHead#mapping} field. */
        @NativeType("unsigned char[255]")
        public ByteBuffer mapping() { return OpusHead.nmapping(address()); }
        /** @return the value at the specified index of the {@link OpusHead#mapping} field. */
        @NativeType("unsigned char")
        public byte mapping(int index) { return OpusHead.nmapping(address(), index); }

    }

}