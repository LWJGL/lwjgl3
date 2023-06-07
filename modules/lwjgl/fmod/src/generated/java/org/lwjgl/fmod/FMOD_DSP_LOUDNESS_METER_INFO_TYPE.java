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
 * struct FMOD_DSP_LOUDNESS_METER_INFO_TYPE {
 *     float momentaryloudness;
 *     float shorttermloudness;
 *     float integratedloudness;
 *     float loudness10thpercentile;
 *     float loudness95thpercentile;
 *     float loudnesshistogram[66];
 *     float maxtruepeak;
 *     float maxmomentaryloudness;
 * }</code></pre>
 */
public class FMOD_DSP_LOUDNESS_METER_INFO_TYPE extends Struct<FMOD_DSP_LOUDNESS_METER_INFO_TYPE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MOMENTARYLOUDNESS,
        SHORTTERMLOUDNESS,
        INTEGRATEDLOUDNESS,
        LOUDNESS10THPERCENTILE,
        LOUDNESS95THPERCENTILE,
        LOUDNESSHISTOGRAM,
        MAXTRUEPEAK,
        MAXMOMENTARYLOUDNESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 66),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MOMENTARYLOUDNESS = layout.offsetof(0);
        SHORTTERMLOUDNESS = layout.offsetof(1);
        INTEGRATEDLOUDNESS = layout.offsetof(2);
        LOUDNESS10THPERCENTILE = layout.offsetof(3);
        LOUDNESS95THPERCENTILE = layout.offsetof(4);
        LOUDNESSHISTOGRAM = layout.offsetof(5);
        MAXTRUEPEAK = layout.offsetof(6);
        MAXMOMENTARYLOUDNESS = layout.offsetof(7);
    }

    protected FMOD_DSP_LOUDNESS_METER_INFO_TYPE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_LOUDNESS_METER_INFO_TYPE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code momentaryloudness} field. */
    public float momentaryloudness() { return nmomentaryloudness(address()); }
    /** @return the value of the {@code shorttermloudness} field. */
    public float shorttermloudness() { return nshorttermloudness(address()); }
    /** @return the value of the {@code integratedloudness} field. */
    public float integratedloudness() { return nintegratedloudness(address()); }
    /** @return the value of the {@code loudness10thpercentile} field. */
    public float loudness10thpercentile() { return nloudness10thpercentile(address()); }
    /** @return the value of the {@code loudness95thpercentile} field. */
    public float loudness95thpercentile() { return nloudness95thpercentile(address()); }
    /** @return a {@link FloatBuffer} view of the {@code loudnesshistogram} field. */
    @NativeType("float[66]")
    public FloatBuffer loudnesshistogram() { return nloudnesshistogram(address()); }
    /** @return the value at the specified index of the {@code loudnesshistogram} field. */
    public float loudnesshistogram(int index) { return nloudnesshistogram(address(), index); }
    /** @return the value of the {@code maxtruepeak} field. */
    public float maxtruepeak() { return nmaxtruepeak(address()); }
    /** @return the value of the {@code maxmomentaryloudness} field. */
    public float maxmomentaryloudness() { return nmaxmomentaryloudness(address()); }

    /** Sets the specified value to the {@code momentaryloudness} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE momentaryloudness(float value) { nmomentaryloudness(address(), value); return this; }
    /** Sets the specified value to the {@code shorttermloudness} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE shorttermloudness(float value) { nshorttermloudness(address(), value); return this; }
    /** Sets the specified value to the {@code integratedloudness} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE integratedloudness(float value) { nintegratedloudness(address(), value); return this; }
    /** Sets the specified value to the {@code loudness10thpercentile} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE loudness10thpercentile(float value) { nloudness10thpercentile(address(), value); return this; }
    /** Sets the specified value to the {@code loudness95thpercentile} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE loudness95thpercentile(float value) { nloudness95thpercentile(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code loudnesshistogram} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE loudnesshistogram(@NativeType("float[66]") FloatBuffer value) { nloudnesshistogram(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code loudnesshistogram} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE loudnesshistogram(int index, float value) { nloudnesshistogram(address(), index, value); return this; }
    /** Sets the specified value to the {@code maxtruepeak} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE maxtruepeak(float value) { nmaxtruepeak(address(), value); return this; }
    /** Sets the specified value to the {@code maxmomentaryloudness} field. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE maxmomentaryloudness(float value) { nmaxmomentaryloudness(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE set(
        float momentaryloudness,
        float shorttermloudness,
        float integratedloudness,
        float loudness10thpercentile,
        float loudness95thpercentile,
        FloatBuffer loudnesshistogram,
        float maxtruepeak,
        float maxmomentaryloudness
    ) {
        momentaryloudness(momentaryloudness);
        shorttermloudness(shorttermloudness);
        integratedloudness(integratedloudness);
        loudness10thpercentile(loudness10thpercentile);
        loudness95thpercentile(loudness95thpercentile);
        loudnesshistogram(loudnesshistogram);
        maxtruepeak(maxtruepeak);
        maxmomentaryloudness(maxmomentaryloudness);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_LOUDNESS_METER_INFO_TYPE set(FMOD_DSP_LOUDNESS_METER_INFO_TYPE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE malloc() {
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE calloc() {
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance for the specified memory address. */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE create(long address) {
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE malloc(MemoryStack stack) {
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE calloc(MemoryStack stack) {
        return new FMOD_DSP_LOUDNESS_METER_INFO_TYPE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #momentaryloudness}. */
    public static float nmomentaryloudness(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.MOMENTARYLOUDNESS); }
    /** Unsafe version of {@link #shorttermloudness}. */
    public static float nshorttermloudness(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.SHORTTERMLOUDNESS); }
    /** Unsafe version of {@link #integratedloudness}. */
    public static float nintegratedloudness(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.INTEGRATEDLOUDNESS); }
    /** Unsafe version of {@link #loudness10thpercentile}. */
    public static float nloudness10thpercentile(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESS10THPERCENTILE); }
    /** Unsafe version of {@link #loudness95thpercentile}. */
    public static float nloudness95thpercentile(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESS95THPERCENTILE); }
    /** Unsafe version of {@link #loudnesshistogram}. */
    public static FloatBuffer nloudnesshistogram(long struct) { return memFloatBuffer(struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESSHISTOGRAM, 66); }
    /** Unsafe version of {@link #loudnesshistogram(int) loudnesshistogram}. */
    public static float nloudnesshistogram(long struct, int index) {
        return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESSHISTOGRAM + check(index, 66) * 4);
    }
    /** Unsafe version of {@link #maxtruepeak}. */
    public static float nmaxtruepeak(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.MAXTRUEPEAK); }
    /** Unsafe version of {@link #maxmomentaryloudness}. */
    public static float nmaxmomentaryloudness(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.MAXMOMENTARYLOUDNESS); }

    /** Unsafe version of {@link #momentaryloudness(float) momentaryloudness}. */
    public static void nmomentaryloudness(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.MOMENTARYLOUDNESS, value); }
    /** Unsafe version of {@link #shorttermloudness(float) shorttermloudness}. */
    public static void nshorttermloudness(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.SHORTTERMLOUDNESS, value); }
    /** Unsafe version of {@link #integratedloudness(float) integratedloudness}. */
    public static void nintegratedloudness(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.INTEGRATEDLOUDNESS, value); }
    /** Unsafe version of {@link #loudness10thpercentile(float) loudness10thpercentile}. */
    public static void nloudness10thpercentile(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESS10THPERCENTILE, value); }
    /** Unsafe version of {@link #loudness95thpercentile(float) loudness95thpercentile}. */
    public static void nloudness95thpercentile(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESS95THPERCENTILE, value); }
    /** Unsafe version of {@link #loudnesshistogram(FloatBuffer) loudnesshistogram}. */
    public static void nloudnesshistogram(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 66); }
        memCopy(memAddress(value), struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESSHISTOGRAM, value.remaining() * 4);
    }
    /** Unsafe version of {@link #loudnesshistogram(int, float) loudnesshistogram}. */
    public static void nloudnesshistogram(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.LOUDNESSHISTOGRAM + check(index, 66) * 4, value);
    }
    /** Unsafe version of {@link #maxtruepeak(float) maxtruepeak}. */
    public static void nmaxtruepeak(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.MAXTRUEPEAK, value); }
    /** Unsafe version of {@link #maxmomentaryloudness(float) maxmomentaryloudness}. */
    public static void nmaxmomentaryloudness(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_LOUDNESS_METER_INFO_TYPE.MAXMOMENTARYLOUDNESS, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_LOUDNESS_METER_INFO_TYPE, Buffer> implements NativeResource {

        private static final FMOD_DSP_LOUDNESS_METER_INFO_TYPE ELEMENT_FACTORY = FMOD_DSP_LOUDNESS_METER_INFO_TYPE.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_LOUDNESS_METER_INFO_TYPE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_LOUDNESS_METER_INFO_TYPE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code momentaryloudness} field. */
        public float momentaryloudness() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nmomentaryloudness(address()); }
        /** @return the value of the {@code shorttermloudness} field. */
        public float shorttermloudness() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nshorttermloudness(address()); }
        /** @return the value of the {@code integratedloudness} field. */
        public float integratedloudness() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nintegratedloudness(address()); }
        /** @return the value of the {@code loudness10thpercentile} field. */
        public float loudness10thpercentile() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudness10thpercentile(address()); }
        /** @return the value of the {@code loudness95thpercentile} field. */
        public float loudness95thpercentile() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudness95thpercentile(address()); }
        /** @return a {@link FloatBuffer} view of the {@code loudnesshistogram} field. */
        @NativeType("float[66]")
        public FloatBuffer loudnesshistogram() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudnesshistogram(address()); }
        /** @return the value at the specified index of the {@code loudnesshistogram} field. */
        public float loudnesshistogram(int index) { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudnesshistogram(address(), index); }
        /** @return the value of the {@code maxtruepeak} field. */
        public float maxtruepeak() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nmaxtruepeak(address()); }
        /** @return the value of the {@code maxmomentaryloudness} field. */
        public float maxmomentaryloudness() { return FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nmaxmomentaryloudness(address()); }

        /** Sets the specified value to the {@code momentaryloudness} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer momentaryloudness(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nmomentaryloudness(address(), value); return this; }
        /** Sets the specified value to the {@code shorttermloudness} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer shorttermloudness(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nshorttermloudness(address(), value); return this; }
        /** Sets the specified value to the {@code integratedloudness} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer integratedloudness(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nintegratedloudness(address(), value); return this; }
        /** Sets the specified value to the {@code loudness10thpercentile} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer loudness10thpercentile(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudness10thpercentile(address(), value); return this; }
        /** Sets the specified value to the {@code loudness95thpercentile} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer loudness95thpercentile(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudness95thpercentile(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code loudnesshistogram} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer loudnesshistogram(@NativeType("float[66]") FloatBuffer value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudnesshistogram(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code loudnesshistogram} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer loudnesshistogram(int index, float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nloudnesshistogram(address(), index, value); return this; }
        /** Sets the specified value to the {@code maxtruepeak} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer maxtruepeak(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nmaxtruepeak(address(), value); return this; }
        /** Sets the specified value to the {@code maxmomentaryloudness} field. */
        public FMOD_DSP_LOUDNESS_METER_INFO_TYPE.Buffer maxmomentaryloudness(float value) { FMOD_DSP_LOUDNESS_METER_INFO_TYPE.nmaxmomentaryloudness(address(), value); return this; }

    }

}