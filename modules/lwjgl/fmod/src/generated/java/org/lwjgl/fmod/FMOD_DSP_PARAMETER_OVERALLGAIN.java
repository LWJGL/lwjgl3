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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_DSP_PARAMETER_OVERALLGAIN {
 *     float linear_gain;
 *     float linear_gain_additive;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_OVERALLGAIN extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LINEAR_GAIN,
        LINEAR_GAIN_ADDITIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LINEAR_GAIN = layout.offsetof(0);
        LINEAR_GAIN_ADDITIVE = layout.offsetof(1);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_OVERALLGAIN(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code linear_gain} field. */
    public float linear_gain() { return nlinear_gain(address()); }
    /** @return the value of the {@code linear_gain_additive} field. */
    public float linear_gain_additive() { return nlinear_gain_additive(address()); }

    /** Sets the specified value to the {@code linear_gain} field. */
    public FMOD_DSP_PARAMETER_OVERALLGAIN linear_gain(float value) { nlinear_gain(address(), value); return this; }
    /** Sets the specified value to the {@code linear_gain_additive} field. */
    public FMOD_DSP_PARAMETER_OVERALLGAIN linear_gain_additive(float value) { nlinear_gain_additive(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_OVERALLGAIN set(
        float linear_gain,
        float linear_gain_additive
    ) {
        linear_gain(linear_gain);
        linear_gain_additive(linear_gain_additive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_OVERALLGAIN set(FMOD_DSP_PARAMETER_OVERALLGAIN src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN malloc() {
        return wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN calloc() {
        return wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN create(long address) {
        return wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_OVERALLGAIN createSafe(long address) {
        return address == NULL ? null : wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, address);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN malloc(MemoryStack stack) {
        return wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN calloc(MemoryStack stack) {
        return wrap(FMOD_DSP_PARAMETER_OVERALLGAIN.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #linear_gain}. */
    public static float nlinear_gain(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_OVERALLGAIN.LINEAR_GAIN); }
    /** Unsafe version of {@link #linear_gain_additive}. */
    public static float nlinear_gain_additive(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_OVERALLGAIN.LINEAR_GAIN_ADDITIVE); }

    /** Unsafe version of {@link #linear_gain(float) linear_gain}. */
    public static void nlinear_gain(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_OVERALLGAIN.LINEAR_GAIN, value); }
    /** Unsafe version of {@link #linear_gain_additive(float) linear_gain_additive}. */
    public static void nlinear_gain_additive(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_OVERALLGAIN.LINEAR_GAIN_ADDITIVE, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_OVERALLGAIN} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_OVERALLGAIN, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_OVERALLGAIN ELEMENT_FACTORY = FMOD_DSP_PARAMETER_OVERALLGAIN.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_OVERALLGAIN#SIZEOF}, and its mark will be undefined.
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
        protected FMOD_DSP_PARAMETER_OVERALLGAIN getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code linear_gain} field. */
        public float linear_gain() { return FMOD_DSP_PARAMETER_OVERALLGAIN.nlinear_gain(address()); }
        /** @return the value of the {@code linear_gain_additive} field. */
        public float linear_gain_additive() { return FMOD_DSP_PARAMETER_OVERALLGAIN.nlinear_gain_additive(address()); }

        /** Sets the specified value to the {@code linear_gain} field. */
        public FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer linear_gain(float value) { FMOD_DSP_PARAMETER_OVERALLGAIN.nlinear_gain(address(), value); return this; }
        /** Sets the specified value to the {@code linear_gain_additive} field. */
        public FMOD_DSP_PARAMETER_OVERALLGAIN.Buffer linear_gain_additive(float value) { FMOD_DSP_PARAMETER_OVERALLGAIN.nlinear_gain_additive(address(), value); return this; }

    }

}