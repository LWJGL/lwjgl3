/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE {
 *     float channelweight[32];
 * }</code></pre>
 */
public class FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE extends Struct<FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CHANNELWEIGHT;

    static {
        Layout layout = __struct(
            __array(4, 32)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CHANNELWEIGHT = layout.offsetof(0);
    }

    protected FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code channelweight} field. */
    @NativeType("float[32]")
    public FloatBuffer channelweight() { return nchannelweight(address()); }
    /** @return the value at the specified index of the {@code channelweight} field. */
    public float channelweight(int index) { return nchannelweight(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code channelweight} field. */
    public FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE channelweight(@NativeType("float[32]") FloatBuffer value) { nchannelweight(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code channelweight} field. */
    public FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE channelweight(int index, float value) { nchannelweight(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE set(FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE malloc() {
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE calloc() {
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance for the specified memory address. */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE create(long address) {
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE malloc(MemoryStack stack) {
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE calloc(MemoryStack stack) {
        return new FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #channelweight}. */
    public static FloatBuffer nchannelweight(long struct) { return memFloatBuffer(struct + FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.CHANNELWEIGHT, 32); }
    /** Unsafe version of {@link #channelweight(int) channelweight}. */
    public static float nchannelweight(long struct, int index) {
        return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.CHANNELWEIGHT + check(index, 32) * 4);
    }

    /** Unsafe version of {@link #channelweight(FloatBuffer) channelweight}. */
    public static void nchannelweight(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.CHANNELWEIGHT, value.remaining() * 4);
    }
    /** Unsafe version of {@link #channelweight(int, float) channelweight}. */
    public static void nchannelweight(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.CHANNELWEIGHT + check(index, 32) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE, Buffer> implements NativeResource {

        private static final FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE ELEMENT_FACTORY = FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code channelweight} field. */
        @NativeType("float[32]")
        public FloatBuffer channelweight() { return FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.nchannelweight(address()); }
        /** @return the value at the specified index of the {@code channelweight} field. */
        public float channelweight(int index) { return FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.nchannelweight(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code channelweight} field. */
        public FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer channelweight(@NativeType("float[32]") FloatBuffer value) { FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.nchannelweight(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code channelweight} field. */
        public FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.Buffer channelweight(int index, float value) { FMOD_DSP_LOUDNESS_METER_WEIGHTING_TYPE.nchannelweight(address(), index, value); return this; }

    }

}