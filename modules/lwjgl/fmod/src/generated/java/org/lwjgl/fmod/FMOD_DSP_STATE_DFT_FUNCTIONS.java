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
 * struct FMOD_DSP_STATE_DFT_FUNCTIONS {
 *     {@link FMOD_DSP_DFT_FFTREAL_FUNCI FMOD_DSP_DFT_FFTREAL_FUNC} fftreal;
 *     {@link FMOD_DSP_DFT_IFFTREAL_FUNCI FMOD_DSP_DFT_IFFTREAL_FUNC} inversefftreal;
 * }</code></pre>
 */
public class FMOD_DSP_STATE_DFT_FUNCTIONS extends Struct<FMOD_DSP_STATE_DFT_FUNCTIONS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FFTREAL,
        INVERSEFFTREAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FFTREAL = layout.offsetof(0);
        INVERSEFFTREAL = layout.offsetof(1);
    }

    protected FMOD_DSP_STATE_DFT_FUNCTIONS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_STATE_DFT_FUNCTIONS create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_STATE_DFT_FUNCTIONS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code fftreal} field. */
    public FMOD_DSP_DFT_FFTREAL_FUNC fftreal() { return nfftreal(address()); }
    /** @return the value of the {@code inversefftreal} field. */
    public FMOD_DSP_DFT_IFFTREAL_FUNC inversefftreal() { return ninversefftreal(address()); }

    /** Sets the specified value to the {@code fftreal} field. */
    public FMOD_DSP_STATE_DFT_FUNCTIONS fftreal(@NativeType("FMOD_DSP_DFT_FFTREAL_FUNC") FMOD_DSP_DFT_FFTREAL_FUNCI value) { nfftreal(address(), value); return this; }
    /** Sets the specified value to the {@code inversefftreal} field. */
    public FMOD_DSP_STATE_DFT_FUNCTIONS inversefftreal(@NativeType("FMOD_DSP_DFT_IFFTREAL_FUNC") FMOD_DSP_DFT_IFFTREAL_FUNCI value) { ninversefftreal(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_STATE_DFT_FUNCTIONS set(
        FMOD_DSP_DFT_FFTREAL_FUNCI fftreal,
        FMOD_DSP_DFT_IFFTREAL_FUNCI inversefftreal
    ) {
        fftreal(fftreal);
        inversefftreal(inversefftreal);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_STATE_DFT_FUNCTIONS set(FMOD_DSP_STATE_DFT_FUNCTIONS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS malloc() {
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS calloc() {
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance for the specified memory address. */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS create(long address) {
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE_DFT_FUNCTIONS createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_STATE_DFT_FUNCTIONS(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS malloc(MemoryStack stack) {
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS calloc(MemoryStack stack) {
        return new FMOD_DSP_STATE_DFT_FUNCTIONS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fftreal}. */
    public static FMOD_DSP_DFT_FFTREAL_FUNC nfftreal(long struct) { return FMOD_DSP_DFT_FFTREAL_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_DFT_FUNCTIONS.FFTREAL)); }
    /** Unsafe version of {@link #inversefftreal}. */
    public static FMOD_DSP_DFT_IFFTREAL_FUNC ninversefftreal(long struct) { return FMOD_DSP_DFT_IFFTREAL_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_DFT_FUNCTIONS.INVERSEFFTREAL)); }

    /** Unsafe version of {@link #fftreal(FMOD_DSP_DFT_FFTREAL_FUNCI) fftreal}. */
    public static void nfftreal(long struct, FMOD_DSP_DFT_FFTREAL_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_DFT_FUNCTIONS.FFTREAL, value.address()); }
    /** Unsafe version of {@link #inversefftreal(FMOD_DSP_DFT_IFFTREAL_FUNCI) inversefftreal}. */
    public static void ninversefftreal(long struct, FMOD_DSP_DFT_IFFTREAL_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_DFT_FUNCTIONS.INVERSEFFTREAL, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_STATE_DFT_FUNCTIONS.FFTREAL));
        check(memGetAddress(struct + FMOD_DSP_STATE_DFT_FUNCTIONS.INVERSEFFTREAL));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_STATE_DFT_FUNCTIONS} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_STATE_DFT_FUNCTIONS, Buffer> implements NativeResource {

        private static final FMOD_DSP_STATE_DFT_FUNCTIONS ELEMENT_FACTORY = FMOD_DSP_STATE_DFT_FUNCTIONS.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_STATE_DFT_FUNCTIONS#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_STATE_DFT_FUNCTIONS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code fftreal} field. */
        public FMOD_DSP_DFT_FFTREAL_FUNC fftreal() { return FMOD_DSP_STATE_DFT_FUNCTIONS.nfftreal(address()); }
        /** @return the value of the {@code inversefftreal} field. */
        public FMOD_DSP_DFT_IFFTREAL_FUNC inversefftreal() { return FMOD_DSP_STATE_DFT_FUNCTIONS.ninversefftreal(address()); }

        /** Sets the specified value to the {@code fftreal} field. */
        public FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer fftreal(@NativeType("FMOD_DSP_DFT_FFTREAL_FUNC") FMOD_DSP_DFT_FFTREAL_FUNCI value) { FMOD_DSP_STATE_DFT_FUNCTIONS.nfftreal(address(), value); return this; }
        /** Sets the specified value to the {@code inversefftreal} field. */
        public FMOD_DSP_STATE_DFT_FUNCTIONS.Buffer inversefftreal(@NativeType("FMOD_DSP_DFT_IFFTREAL_FUNC") FMOD_DSP_DFT_IFFTREAL_FUNCI value) { FMOD_DSP_STATE_DFT_FUNCTIONS.ninversefftreal(address(), value); return this; }

    }

}