/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE {
 *     int numchannels;
 *     float rms[32];
 * }}</pre>
 */
public class FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE extends Struct<FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMCHANNELS,
        RMS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 32)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMCHANNELS = layout.offsetof(0);
        RMS = layout.offsetof(1);
    }

    protected FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numchannels} field. */
    public int numchannels() { return nnumchannels(address()); }
    /** @return a {@link FloatBuffer} view of the {@code rms} field. */
    @NativeType("float[32]")
    public FloatBuffer rms() { return nrms(address()); }
    /** @return the value at the specified index of the {@code rms} field. */
    public float rms(int index) { return nrms(address(), index); }

    /** Sets the specified value to the {@code numchannels} field. */
    public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE numchannels(int value) { nnumchannels(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code rms} field. */
    public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE rms(@NativeType("float[32]") FloatBuffer value) { nrms(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code rms} field. */
    public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE rms(int index, float value) { nrms(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE set(
        int numchannels,
        FloatBuffer rms
    ) {
        numchannels(numchannels);
        rms(rms);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE set(FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE malloc() {
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE calloc() {
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE create(long address) {
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numchannels}. */
    public static int nnumchannels(long struct) { return memGetInt(struct + FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.NUMCHANNELS); }
    /** Unsafe version of {@link #rms}. */
    public static FloatBuffer nrms(long struct) { return memFloatBuffer(struct + FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.RMS, 32); }
    /** Unsafe version of {@link #rms(int) rms}. */
    public static float nrms(long struct, int index) {
        return memGetFloat(struct + FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.RMS + check(index, 32) * 4);
    }

    /** Unsafe version of {@link #numchannels(int) numchannels}. */
    public static void nnumchannels(long struct, int value) { memPutInt(struct + FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.NUMCHANNELS, value); }
    /** Unsafe version of {@link #rms(FloatBuffer) rms}. */
    public static void nrms(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.RMS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #rms(int, float) rms}. */
    public static void nrms(long struct, int index, float value) {
        memPutFloat(struct + FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.RMS + check(index, 32) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE ELEMENT_FACTORY = FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numchannels} field. */
        public int numchannels() { return FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.nnumchannels(address()); }
        /** @return a {@link FloatBuffer} view of the {@code rms} field. */
        @NativeType("float[32]")
        public FloatBuffer rms() { return FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.nrms(address()); }
        /** @return the value at the specified index of the {@code rms} field. */
        public float rms(int index) { return FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.nrms(address(), index); }

        /** Sets the specified value to the {@code numchannels} field. */
        public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer numchannels(int value) { FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.nnumchannels(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code rms} field. */
        public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer rms(@NativeType("float[32]") FloatBuffer value) { FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.nrms(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code rms} field. */
        public FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.Buffer rms(int index, float value) { FMOD_DSP_PARAMETER_DYNAMIC_RESPONSE.nrms(address(), index, value); return this; }

    }

}