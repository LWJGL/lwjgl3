/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrAudioBufferBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrAudioBufferChannelLayoutBD channelLayout;
 *     uint32_t bufferChannels;
 *     uint32_t bufferLength;
 *     float * buffer;
 * }}</pre>
 */
public class XrAudioBufferBD extends Struct<XrAudioBufferBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CHANNELLAYOUT,
        BUFFERCHANNELS,
        BUFFERLENGTH,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CHANNELLAYOUT = layout.offsetof(2);
        BUFFERCHANNELS = layout.offsetof(3);
        BUFFERLENGTH = layout.offsetof(4);
        BUFFER = layout.offsetof(5);
    }

    protected XrAudioBufferBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrAudioBufferBD create(long address, @Nullable ByteBuffer container) {
        return new XrAudioBufferBD(address, container);
    }

    /**
     * Creates a {@code XrAudioBufferBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAudioBufferBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code channelLayout} field. */
    @NativeType("XrAudioBufferChannelLayoutBD")
    public int channelLayout() { return nchannelLayout(address()); }
    /** @return the value of the {@code bufferChannels} field. */
    @NativeType("uint32_t")
    public int bufferChannels() { return nbufferChannels(address()); }
    /** @return the value of the {@code bufferLength} field. */
    @NativeType("uint32_t")
    public int bufferLength() { return nbufferLength(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("float *")
    public FloatBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrAudioBufferBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_AUDIO_BUFFER_BD TYPE_AUDIO_BUFFER_BD} value to the {@code type} field. */
    public XrAudioBufferBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_AUDIO_BUFFER_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrAudioBufferBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code channelLayout} field. */
    public XrAudioBufferBD channelLayout(@NativeType("XrAudioBufferChannelLayoutBD") int value) { nchannelLayout(address(), value); return this; }
    /** Sets the specified value to the {@code bufferChannels} field. */
    public XrAudioBufferBD bufferChannels(@NativeType("uint32_t") int value) { nbufferChannels(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code buffer} field. */
    public XrAudioBufferBD buffer(@NativeType("float *") FloatBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrAudioBufferBD set(
        int type,
        long next,
        int channelLayout,
        int bufferChannels,
        FloatBuffer buffer
    ) {
        type(type);
        next(next);
        channelLayout(channelLayout);
        bufferChannels(bufferChannels);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrAudioBufferBD set(XrAudioBufferBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAudioBufferBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAudioBufferBD malloc() {
        return new XrAudioBufferBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrAudioBufferBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAudioBufferBD calloc() {
        return new XrAudioBufferBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrAudioBufferBD} instance allocated with {@link BufferUtils}. */
    public static XrAudioBufferBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrAudioBufferBD(memAddress(container), container);
    }

    /** Returns a new {@code XrAudioBufferBD} instance for the specified memory address. */
    public static XrAudioBufferBD create(long address) {
        return new XrAudioBufferBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrAudioBufferBD createSafe(long address) {
        return address == NULL ? null : new XrAudioBufferBD(address, null);
    }

    /**
     * Returns a new {@link XrAudioBufferBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAudioBufferBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAudioBufferBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAudioBufferBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAudioBufferBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAudioBufferBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrAudioBufferBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAudioBufferBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrAudioBufferBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrAudioBufferBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAudioBufferBD malloc(MemoryStack stack) {
        return new XrAudioBufferBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrAudioBufferBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAudioBufferBD calloc(MemoryStack stack) {
        return new XrAudioBufferBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrAudioBufferBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAudioBufferBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAudioBufferBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAudioBufferBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrAudioBufferBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrAudioBufferBD.NEXT); }
    /** Unsafe version of {@link #channelLayout}. */
    public static int nchannelLayout(long struct) { return memGetInt(struct + XrAudioBufferBD.CHANNELLAYOUT); }
    /** Unsafe version of {@link #bufferChannels}. */
    public static int nbufferChannels(long struct) { return memGetInt(struct + XrAudioBufferBD.BUFFERCHANNELS); }
    /** Unsafe version of {@link #bufferLength}. */
    public static int nbufferLength(long struct) { return memGetInt(struct + XrAudioBufferBD.BUFFERLENGTH); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static FloatBuffer nbuffer(long struct) { return memFloatBuffer(memGetAddress(struct + XrAudioBufferBD.BUFFER), nbufferLength(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrAudioBufferBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrAudioBufferBD.NEXT, value); }
    /** Unsafe version of {@link #channelLayout(int) channelLayout}. */
    public static void nchannelLayout(long struct, int value) { memPutInt(struct + XrAudioBufferBD.CHANNELLAYOUT, value); }
    /** Unsafe version of {@link #bufferChannels(int) bufferChannels}. */
    public static void nbufferChannels(long struct, int value) { memPutInt(struct + XrAudioBufferBD.BUFFERCHANNELS, value); }
    /** Sets the specified value to the {@code bufferLength} field of the specified {@code struct}. */
    public static void nbufferLength(long struct, int value) { memPutInt(struct + XrAudioBufferBD.BUFFERLENGTH, value); }
    /** Unsafe version of {@link #buffer(FloatBuffer) buffer}. */
    public static void nbuffer(long struct, FloatBuffer value) { memPutAddress(struct + XrAudioBufferBD.BUFFER, memAddress(value)); nbufferLength(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrAudioBufferBD.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrAudioBufferBD} structs. */
    public static class Buffer extends StructBuffer<XrAudioBufferBD, Buffer> implements NativeResource {

        private static final XrAudioBufferBD ELEMENT_FACTORY = XrAudioBufferBD.create(-1L);

        /**
         * Creates a new {@code XrAudioBufferBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAudioBufferBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrAudioBufferBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrAudioBufferBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrAudioBufferBD.nnext(address()); }
        /** @return the value of the {@code channelLayout} field. */
        @NativeType("XrAudioBufferChannelLayoutBD")
        public int channelLayout() { return XrAudioBufferBD.nchannelLayout(address()); }
        /** @return the value of the {@code bufferChannels} field. */
        @NativeType("uint32_t")
        public int bufferChannels() { return XrAudioBufferBD.nbufferChannels(address()); }
        /** @return the value of the {@code bufferLength} field. */
        @NativeType("uint32_t")
        public int bufferLength() { return XrAudioBufferBD.nbufferLength(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("float *")
        public FloatBuffer buffer() { return XrAudioBufferBD.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrAudioBufferBD.Buffer type(@NativeType("XrStructureType") int value) { XrAudioBufferBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_AUDIO_BUFFER_BD TYPE_AUDIO_BUFFER_BD} value to the {@code type} field. */
        public XrAudioBufferBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_AUDIO_BUFFER_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrAudioBufferBD.Buffer next(@NativeType("void const *") long value) { XrAudioBufferBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code channelLayout} field. */
        public XrAudioBufferBD.Buffer channelLayout(@NativeType("XrAudioBufferChannelLayoutBD") int value) { XrAudioBufferBD.nchannelLayout(address(), value); return this; }
        /** Sets the specified value to the {@code bufferChannels} field. */
        public XrAudioBufferBD.Buffer bufferChannels(@NativeType("uint32_t") int value) { XrAudioBufferBD.nbufferChannels(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code buffer} field. */
        public XrAudioBufferBD.Buffer buffer(@NativeType("float *") FloatBuffer value) { XrAudioBufferBD.nbuffer(address(), value); return this; }

    }

}