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
 * struct FMOD_DSP_PARAMETER_ATTENUATION_RANGE {
 *     float min;
 *     float max;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_ATTENUATION_RANGE extends Struct<FMOD_DSP_PARAMETER_ATTENUATION_RANGE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MIN,
        MAX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MIN = layout.offsetof(0);
        MAX = layout.offsetof(1);
    }

    protected FMOD_DSP_PARAMETER_ATTENUATION_RANGE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_ATTENUATION_RANGE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_ATTENUATION_RANGE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code min} field. */
    public float min() { return nmin(address()); }
    /** @return the value of the {@code max} field. */
    public float max() { return nmax(address()); }

    /** Sets the specified value to the {@code min} field. */
    public FMOD_DSP_PARAMETER_ATTENUATION_RANGE min(float value) { nmin(address(), value); return this; }
    /** Sets the specified value to the {@code max} field. */
    public FMOD_DSP_PARAMETER_ATTENUATION_RANGE max(float value) { nmax(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_ATTENUATION_RANGE set(
        float min,
        float max
    ) {
        min(min);
        max(max);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_ATTENUATION_RANGE set(FMOD_DSP_PARAMETER_ATTENUATION_RANGE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE malloc() {
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE calloc() {
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE create(long address) {
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_ATTENUATION_RANGE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #min}. */
    public static float nmin(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_ATTENUATION_RANGE.MIN); }
    /** Unsafe version of {@link #max}. */
    public static float nmax(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_ATTENUATION_RANGE.MAX); }

    /** Unsafe version of {@link #min(float) min}. */
    public static void nmin(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_ATTENUATION_RANGE.MIN, value); }
    /** Unsafe version of {@link #max(float) max}. */
    public static void nmax(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_ATTENUATION_RANGE.MAX, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_ATTENUATION_RANGE, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_ATTENUATION_RANGE ELEMENT_FACTORY = FMOD_DSP_PARAMETER_ATTENUATION_RANGE.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_ATTENUATION_RANGE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_ATTENUATION_RANGE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code min} field. */
        public float min() { return FMOD_DSP_PARAMETER_ATTENUATION_RANGE.nmin(address()); }
        /** @return the value of the {@code max} field. */
        public float max() { return FMOD_DSP_PARAMETER_ATTENUATION_RANGE.nmax(address()); }

        /** Sets the specified value to the {@code min} field. */
        public FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer min(float value) { FMOD_DSP_PARAMETER_ATTENUATION_RANGE.nmin(address(), value); return this; }
        /** Sets the specified value to the {@code max} field. */
        public FMOD_DSP_PARAMETER_ATTENUATION_RANGE.Buffer max(float value) { FMOD_DSP_PARAMETER_ATTENUATION_RANGE.nmax(address(), value); return this; }

    }

}