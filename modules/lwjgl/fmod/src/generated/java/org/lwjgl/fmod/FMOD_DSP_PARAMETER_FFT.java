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
 * struct FMOD_DSP_PARAMETER_FFT {
 *     int length;
 *     int numchannels;
 *     float * spectrum[32];
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_FFT extends Struct<FMOD_DSP_PARAMETER_FFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LENGTH,
        NUMCHANNELS,
        SPECTRUM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(POINTER_SIZE, 32)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LENGTH = layout.offsetof(0);
        NUMCHANNELS = layout.offsetof(1);
        SPECTRUM = layout.offsetof(2);
    }

    protected FMOD_DSP_PARAMETER_FFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_FFT create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_FFT(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_FFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_FFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code length} field. */
    public int length() { return nlength(address()); }
    /** @return the value of the {@code numchannels} field. */
    public int numchannels() { return nnumchannels(address()); }
    /** @return a {@link PointerBuffer} view of the {@code spectrum} field. */
    @NativeType("float *[32]")
    public PointerBuffer spectrum() { return nspectrum(address()); }
    /** @return the value at the specified index of the {@code spectrum} field. */
    @NativeType("float *")
    public long spectrum(int index) { return nspectrum(address(), index); }

    /** Sets the specified value to the {@code length} field. */
    public FMOD_DSP_PARAMETER_FFT length(int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@code numchannels} field. */
    public FMOD_DSP_PARAMETER_FFT numchannels(int value) { nnumchannels(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code spectrum} field. */
    public FMOD_DSP_PARAMETER_FFT spectrum(@NativeType("float *[32]") PointerBuffer value) { nspectrum(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code spectrum} field. */
    public FMOD_DSP_PARAMETER_FFT spectrum(int index, @NativeType("float *") FloatBuffer value) { nspectrum(address(), index, memAddressSafe(value)); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_FFT set(
        int length,
        int numchannels,
        PointerBuffer spectrum
    ) {
        length(length);
        numchannels(numchannels);
        spectrum(spectrum);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_FFT set(FMOD_DSP_PARAMETER_FFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_FFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_FFT malloc() {
        return new FMOD_DSP_PARAMETER_FFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_FFT calloc() {
        return new FMOD_DSP_PARAMETER_FFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FFT} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_FFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_FFT(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FFT} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_FFT create(long address) {
        return new FMOD_DSP_PARAMETER_FFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_FFT createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_FFT(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_FFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_FFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_FFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_FFT malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_FFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_FFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_FFT calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_FFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_FFT.LENGTH); }
    /** Unsafe version of {@link #numchannels}. */
    public static int nnumchannels(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_FFT.NUMCHANNELS); }
    /** Unsafe version of {@link #spectrum}. */
    public static PointerBuffer nspectrum(long struct) { return memPointerBuffer(struct + FMOD_DSP_PARAMETER_FFT.SPECTRUM, 32); }
    /** Unsafe version of {@link #spectrum(int) spectrum}. */
    public static long nspectrum(long struct, int index) {
        return memGetAddress(struct + FMOD_DSP_PARAMETER_FFT.SPECTRUM + check(index, 32) * POINTER_SIZE);
    }

    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_FFT.LENGTH, value); }
    /** Unsafe version of {@link #numchannels(int) numchannels}. */
    public static void nnumchannels(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_FFT.NUMCHANNELS, value); }
    /** Unsafe version of {@link #spectrum(PointerBuffer) spectrum}. */
    public static void nspectrum(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + FMOD_DSP_PARAMETER_FFT.SPECTRUM, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #spectrum(int, FloatBuffer) spectrum}. */
    public static void nspectrum(long struct, int index, long value) {
        memPutAddress(struct + FMOD_DSP_PARAMETER_FFT.SPECTRUM + check(index, 32) * POINTER_SIZE, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_PARAMETER_FFT.SPECTRUM));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_FFT} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_FFT, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_FFT ELEMENT_FACTORY = FMOD_DSP_PARAMETER_FFT.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_FFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_FFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_FFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code length} field. */
        public int length() { return FMOD_DSP_PARAMETER_FFT.nlength(address()); }
        /** @return the value of the {@code numchannels} field. */
        public int numchannels() { return FMOD_DSP_PARAMETER_FFT.nnumchannels(address()); }
        /** @return a {@link PointerBuffer} view of the {@code spectrum} field. */
        @NativeType("float *[32]")
        public PointerBuffer spectrum() { return FMOD_DSP_PARAMETER_FFT.nspectrum(address()); }
        /** @return the value at the specified index of the {@code spectrum} field. */
        @NativeType("float *")
        public long spectrum(int index) { return FMOD_DSP_PARAMETER_FFT.nspectrum(address(), index); }

        /** Sets the specified value to the {@code length} field. */
        public FMOD_DSP_PARAMETER_FFT.Buffer length(int value) { FMOD_DSP_PARAMETER_FFT.nlength(address(), value); return this; }
        /** Sets the specified value to the {@code numchannels} field. */
        public FMOD_DSP_PARAMETER_FFT.Buffer numchannels(int value) { FMOD_DSP_PARAMETER_FFT.nnumchannels(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code spectrum} field. */
        public FMOD_DSP_PARAMETER_FFT.Buffer spectrum(@NativeType("float *[32]") PointerBuffer value) { FMOD_DSP_PARAMETER_FFT.nspectrum(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code spectrum} field. */
        public FMOD_DSP_PARAMETER_FFT.Buffer spectrum(int index, @NativeType("float *") FloatBuffer value) { FMOD_DSP_PARAMETER_FFT.nspectrum(address(), index, memAddressSafe(value)); return this; }

    }

}