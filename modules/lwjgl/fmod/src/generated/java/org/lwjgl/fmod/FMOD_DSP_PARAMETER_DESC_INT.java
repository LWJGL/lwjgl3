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
 * struct FMOD_DSP_PARAMETER_DESC_INT {
 *     int min;
 *     int max;
 *     int defaultval;
 *     FMOD_BOOL goestoinf;
 *     char const * const * valuenames;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_DESC_INT extends Struct<FMOD_DSP_PARAMETER_DESC_INT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MIN,
        MAX,
        DEFAULTVAL,
        GOESTOINF,
        VALUENAMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MIN = layout.offsetof(0);
        MAX = layout.offsetof(1);
        DEFAULTVAL = layout.offsetof(2);
        GOESTOINF = layout.offsetof(3);
        VALUENAMES = layout.offsetof(4);
    }

    protected FMOD_DSP_PARAMETER_DESC_INT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_DESC_INT create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_DESC_INT(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_DESC_INT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_DESC_INT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code min} field. */
    public int min() { return nmin(address()); }
    /** @return the value of the {@code max} field. */
    public int max() { return nmax(address()); }
    /** @return the value of the {@code defaultval} field. */
    public int defaultval() { return ndefaultval(address()); }
    /** @return the value of the {@code goestoinf} field. */
    @NativeType("FMOD_BOOL")
    public int goestoinf() { return ngoestoinf(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code valuenames} field. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer valuenames() { return nvaluenames(address()); }

    /** Sets the specified value to the {@code min} field. */
    public FMOD_DSP_PARAMETER_DESC_INT min(int value) { nmin(address(), value); return this; }
    /** Sets the specified value to the {@code max} field. */
    public FMOD_DSP_PARAMETER_DESC_INT max(int value) { nmax(address(), value); return this; }
    /** Sets the specified value to the {@code defaultval} field. */
    public FMOD_DSP_PARAMETER_DESC_INT defaultval(int value) { ndefaultval(address(), value); return this; }
    /** Sets the specified value to the {@code goestoinf} field. */
    public FMOD_DSP_PARAMETER_DESC_INT goestoinf(@NativeType("FMOD_BOOL") int value) { ngoestoinf(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code valuenames} field. */
    public FMOD_DSP_PARAMETER_DESC_INT valuenames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nvaluenames(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_DESC_INT set(
        int min,
        int max,
        int defaultval,
        int goestoinf,
        @Nullable PointerBuffer valuenames
    ) {
        min(min);
        max(max);
        defaultval(defaultval);
        goestoinf(goestoinf);
        valuenames(valuenames);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_DESC_INT set(FMOD_DSP_PARAMETER_DESC_INT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_INT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_INT malloc() {
        return new FMOD_DSP_PARAMETER_DESC_INT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_INT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_INT calloc() {
        return new FMOD_DSP_PARAMETER_DESC_INT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_INT} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_DESC_INT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_DESC_INT(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_INT} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_DESC_INT create(long address) {
        return new FMOD_DSP_PARAMETER_DESC_INT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_INT createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_DESC_INT(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_INT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_INT malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_INT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_INT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_INT calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_INT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_INT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #min}. */
    public static int nmin(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.MIN); }
    /** Unsafe version of {@link #max}. */
    public static int nmax(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.MAX); }
    /** Unsafe version of {@link #defaultval}. */
    public static int ndefaultval(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.DEFAULTVAL); }
    /** Unsafe version of {@link #goestoinf}. */
    public static int ngoestoinf(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.GOESTOINF); }
    /** Unsafe version of {@link #valuenames() valuenames}. */
    @Nullable public static PointerBuffer nvaluenames(long struct) { return memPointerBufferSafe(memGetAddress(struct + FMOD_DSP_PARAMETER_DESC_INT.VALUENAMES), nmax(struct) - nmin(struct) + 1); }

    /** Unsafe version of {@link #min(int) min}. */
    public static void nmin(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.MIN, value); }
    /** Unsafe version of {@link #max(int) max}. */
    public static void nmax(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.MAX, value); }
    /** Unsafe version of {@link #defaultval(int) defaultval}. */
    public static void ndefaultval(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.DEFAULTVAL, value); }
    /** Unsafe version of {@link #goestoinf(int) goestoinf}. */
    public static void ngoestoinf(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC_INT.GOESTOINF, value); }
    /** Unsafe version of {@link #valuenames(PointerBuffer) valuenames}. */
    public static void nvaluenames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + FMOD_DSP_PARAMETER_DESC_INT.VALUENAMES, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_DESC_INT} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_DESC_INT, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_DESC_INT ELEMENT_FACTORY = FMOD_DSP_PARAMETER_DESC_INT.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_DESC_INT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_DESC_INT#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_DESC_INT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code min} field. */
        public int min() { return FMOD_DSP_PARAMETER_DESC_INT.nmin(address()); }
        /** @return the value of the {@code max} field. */
        public int max() { return FMOD_DSP_PARAMETER_DESC_INT.nmax(address()); }
        /** @return the value of the {@code defaultval} field. */
        public int defaultval() { return FMOD_DSP_PARAMETER_DESC_INT.ndefaultval(address()); }
        /** @return the value of the {@code goestoinf} field. */
        @NativeType("FMOD_BOOL")
        public int goestoinf() { return FMOD_DSP_PARAMETER_DESC_INT.ngoestoinf(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code valuenames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer valuenames() { return FMOD_DSP_PARAMETER_DESC_INT.nvaluenames(address()); }

        /** Sets the specified value to the {@code min} field. */
        public FMOD_DSP_PARAMETER_DESC_INT.Buffer min(int value) { FMOD_DSP_PARAMETER_DESC_INT.nmin(address(), value); return this; }
        /** Sets the specified value to the {@code max} field. */
        public FMOD_DSP_PARAMETER_DESC_INT.Buffer max(int value) { FMOD_DSP_PARAMETER_DESC_INT.nmax(address(), value); return this; }
        /** Sets the specified value to the {@code defaultval} field. */
        public FMOD_DSP_PARAMETER_DESC_INT.Buffer defaultval(int value) { FMOD_DSP_PARAMETER_DESC_INT.ndefaultval(address(), value); return this; }
        /** Sets the specified value to the {@code goestoinf} field. */
        public FMOD_DSP_PARAMETER_DESC_INT.Buffer goestoinf(@NativeType("FMOD_BOOL") int value) { FMOD_DSP_PARAMETER_DESC_INT.ngoestoinf(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code valuenames} field. */
        public FMOD_DSP_PARAMETER_DESC_INT.Buffer valuenames(@Nullable @NativeType("char const * const *") PointerBuffer value) { FMOD_DSP_PARAMETER_DESC_INT.nvaluenames(address(), value); return this; }

    }

}