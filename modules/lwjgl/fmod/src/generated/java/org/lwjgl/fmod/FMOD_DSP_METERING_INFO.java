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
 * struct FMOD_DSP_METERING_INFO {
 *     int numsamples;
 *     float peaklevel[32];
 *     float rmslevel[32];
 *     short numchannels;
 * }</code></pre>
 */
public class FMOD_DSP_METERING_INFO extends Struct<FMOD_DSP_METERING_INFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMSAMPLES,
        PEAKLEVEL,
        RMSLEVEL,
        NUMCHANNELS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 32),
            __array(4, 32),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMSAMPLES = layout.offsetof(0);
        PEAKLEVEL = layout.offsetof(1);
        RMSLEVEL = layout.offsetof(2);
        NUMCHANNELS = layout.offsetof(3);
    }

    protected FMOD_DSP_METERING_INFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_METERING_INFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_METERING_INFO(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_METERING_INFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_METERING_INFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numsamples} field. */
    public int numsamples() { return nnumsamples(address()); }
    /** @return a {@link FloatBuffer} view of the {@code peaklevel} field. */
    @NativeType("float[32]")
    public FloatBuffer peaklevel() { return npeaklevel(address()); }
    /** @return the value at the specified index of the {@code peaklevel} field. */
    public float peaklevel(int index) { return npeaklevel(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code rmslevel} field. */
    @NativeType("float[32]")
    public FloatBuffer rmslevel() { return nrmslevel(address()); }
    /** @return the value at the specified index of the {@code rmslevel} field. */
    public float rmslevel(int index) { return nrmslevel(address(), index); }
    /** @return the value of the {@code numchannels} field. */
    public short numchannels() { return nnumchannels(address()); }

    /** Sets the specified value to the {@code numsamples} field. */
    public FMOD_DSP_METERING_INFO numsamples(int value) { nnumsamples(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code peaklevel} field. */
    public FMOD_DSP_METERING_INFO peaklevel(@NativeType("float[32]") FloatBuffer value) { npeaklevel(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code peaklevel} field. */
    public FMOD_DSP_METERING_INFO peaklevel(int index, float value) { npeaklevel(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code rmslevel} field. */
    public FMOD_DSP_METERING_INFO rmslevel(@NativeType("float[32]") FloatBuffer value) { nrmslevel(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code rmslevel} field. */
    public FMOD_DSP_METERING_INFO rmslevel(int index, float value) { nrmslevel(address(), index, value); return this; }
    /** Sets the specified value to the {@code numchannels} field. */
    public FMOD_DSP_METERING_INFO numchannels(short value) { nnumchannels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_METERING_INFO set(
        int numsamples,
        FloatBuffer peaklevel,
        FloatBuffer rmslevel,
        short numchannels
    ) {
        numsamples(numsamples);
        peaklevel(peaklevel);
        rmslevel(rmslevel);
        numchannels(numchannels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_METERING_INFO set(FMOD_DSP_METERING_INFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_METERING_INFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_METERING_INFO malloc() {
        return new FMOD_DSP_METERING_INFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_METERING_INFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_METERING_INFO calloc() {
        return new FMOD_DSP_METERING_INFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_METERING_INFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_METERING_INFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_METERING_INFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_METERING_INFO} instance for the specified memory address. */
    public static FMOD_DSP_METERING_INFO create(long address) {
        return new FMOD_DSP_METERING_INFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_METERING_INFO createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_METERING_INFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_METERING_INFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_METERING_INFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_METERING_INFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_METERING_INFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_METERING_INFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_METERING_INFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_METERING_INFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_METERING_INFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_METERING_INFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_METERING_INFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_METERING_INFO malloc(MemoryStack stack) {
        return new FMOD_DSP_METERING_INFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_METERING_INFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_METERING_INFO calloc(MemoryStack stack) {
        return new FMOD_DSP_METERING_INFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_METERING_INFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_METERING_INFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_METERING_INFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_METERING_INFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numsamples}. */
    public static int nnumsamples(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_METERING_INFO.NUMSAMPLES); }
    /** Unsafe version of {@link #peaklevel}. */
    public static FloatBuffer npeaklevel(long struct) { return memFloatBuffer(struct + FMOD_DSP_METERING_INFO.PEAKLEVEL, 32); }
    /** Unsafe version of {@link #peaklevel(int) peaklevel}. */
    public static float npeaklevel(long struct, int index) {
        return UNSAFE.getFloat(null, struct + FMOD_DSP_METERING_INFO.PEAKLEVEL + check(index, 32) * 4);
    }
    /** Unsafe version of {@link #rmslevel}. */
    public static FloatBuffer nrmslevel(long struct) { return memFloatBuffer(struct + FMOD_DSP_METERING_INFO.RMSLEVEL, 32); }
    /** Unsafe version of {@link #rmslevel(int) rmslevel}. */
    public static float nrmslevel(long struct, int index) {
        return UNSAFE.getFloat(null, struct + FMOD_DSP_METERING_INFO.RMSLEVEL + check(index, 32) * 4);
    }
    /** Unsafe version of {@link #numchannels}. */
    public static short nnumchannels(long struct) { return UNSAFE.getShort(null, struct + FMOD_DSP_METERING_INFO.NUMCHANNELS); }

    /** Unsafe version of {@link #numsamples(int) numsamples}. */
    public static void nnumsamples(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_METERING_INFO.NUMSAMPLES, value); }
    /** Unsafe version of {@link #peaklevel(FloatBuffer) peaklevel}. */
    public static void npeaklevel(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + FMOD_DSP_METERING_INFO.PEAKLEVEL, value.remaining() * 4);
    }
    /** Unsafe version of {@link #peaklevel(int, float) peaklevel}. */
    public static void npeaklevel(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + FMOD_DSP_METERING_INFO.PEAKLEVEL + check(index, 32) * 4, value);
    }
    /** Unsafe version of {@link #rmslevel(FloatBuffer) rmslevel}. */
    public static void nrmslevel(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + FMOD_DSP_METERING_INFO.RMSLEVEL, value.remaining() * 4);
    }
    /** Unsafe version of {@link #rmslevel(int, float) rmslevel}. */
    public static void nrmslevel(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + FMOD_DSP_METERING_INFO.RMSLEVEL + check(index, 32) * 4, value);
    }
    /** Unsafe version of {@link #numchannels(short) numchannels}. */
    public static void nnumchannels(long struct, short value) { UNSAFE.putShort(null, struct + FMOD_DSP_METERING_INFO.NUMCHANNELS, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_METERING_INFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_METERING_INFO, Buffer> implements NativeResource {

        private static final FMOD_DSP_METERING_INFO ELEMENT_FACTORY = FMOD_DSP_METERING_INFO.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_METERING_INFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_METERING_INFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_METERING_INFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numsamples} field. */
        public int numsamples() { return FMOD_DSP_METERING_INFO.nnumsamples(address()); }
        /** @return a {@link FloatBuffer} view of the {@code peaklevel} field. */
        @NativeType("float[32]")
        public FloatBuffer peaklevel() { return FMOD_DSP_METERING_INFO.npeaklevel(address()); }
        /** @return the value at the specified index of the {@code peaklevel} field. */
        public float peaklevel(int index) { return FMOD_DSP_METERING_INFO.npeaklevel(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code rmslevel} field. */
        @NativeType("float[32]")
        public FloatBuffer rmslevel() { return FMOD_DSP_METERING_INFO.nrmslevel(address()); }
        /** @return the value at the specified index of the {@code rmslevel} field. */
        public float rmslevel(int index) { return FMOD_DSP_METERING_INFO.nrmslevel(address(), index); }
        /** @return the value of the {@code numchannels} field. */
        public short numchannels() { return FMOD_DSP_METERING_INFO.nnumchannels(address()); }

        /** Sets the specified value to the {@code numsamples} field. */
        public FMOD_DSP_METERING_INFO.Buffer numsamples(int value) { FMOD_DSP_METERING_INFO.nnumsamples(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code peaklevel} field. */
        public FMOD_DSP_METERING_INFO.Buffer peaklevel(@NativeType("float[32]") FloatBuffer value) { FMOD_DSP_METERING_INFO.npeaklevel(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code peaklevel} field. */
        public FMOD_DSP_METERING_INFO.Buffer peaklevel(int index, float value) { FMOD_DSP_METERING_INFO.npeaklevel(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code rmslevel} field. */
        public FMOD_DSP_METERING_INFO.Buffer rmslevel(@NativeType("float[32]") FloatBuffer value) { FMOD_DSP_METERING_INFO.nrmslevel(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code rmslevel} field. */
        public FMOD_DSP_METERING_INFO.Buffer rmslevel(int index, float value) { FMOD_DSP_METERING_INFO.nrmslevel(address(), index, value); return this; }
        /** Sets the specified value to the {@code numchannels} field. */
        public FMOD_DSP_METERING_INFO.Buffer numchannels(short value) { FMOD_DSP_METERING_INFO.nnumchannels(address(), value); return this; }

    }

}