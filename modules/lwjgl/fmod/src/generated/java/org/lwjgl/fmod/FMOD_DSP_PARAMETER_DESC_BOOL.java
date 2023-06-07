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
 * struct FMOD_DSP_PARAMETER_DESC_BOOL {
 *     FMOD_BOOL defaultval;
 *     char const * const * valuenames;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_DESC_BOOL extends Struct<FMOD_DSP_PARAMETER_DESC_BOOL> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEFAULTVAL,
        VALUENAMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEFAULTVAL = layout.offsetof(0);
        VALUENAMES = layout.offsetof(1);
    }

    protected FMOD_DSP_PARAMETER_DESC_BOOL(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_DESC_BOOL create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_DESC_BOOL(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_DESC_BOOL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code defaultval} field. */
    @NativeType("FMOD_BOOL")
    public int defaultval() { return ndefaultval(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code valuenames} field. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer valuenames() { return nvaluenames(address()); }

    /** Sets the specified value to the {@code defaultval} field. */
    public FMOD_DSP_PARAMETER_DESC_BOOL defaultval(@NativeType("FMOD_BOOL") int value) { ndefaultval(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code valuenames} field. */
    public FMOD_DSP_PARAMETER_DESC_BOOL valuenames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nvaluenames(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_DESC_BOOL set(
        int defaultval,
        @Nullable PointerBuffer valuenames
    ) {
        defaultval(defaultval);
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
    public FMOD_DSP_PARAMETER_DESC_BOOL set(FMOD_DSP_PARAMETER_DESC_BOOL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_BOOL malloc() {
        return new FMOD_DSP_PARAMETER_DESC_BOOL(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_BOOL calloc() {
        return new FMOD_DSP_PARAMETER_DESC_BOOL(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_DESC_BOOL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_DESC_BOOL(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_DESC_BOOL create(long address) {
        return new FMOD_DSP_PARAMETER_DESC_BOOL(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_BOOL createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_DESC_BOOL(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_BOOL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_BOOL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_BOOL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_BOOL.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #defaultval}. */
    public static int ndefaultval(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC_BOOL.DEFAULTVAL); }
    /** Unsafe version of {@link #valuenames() valuenames}. */
    @Nullable public static PointerBuffer nvaluenames(long struct) { return memPointerBufferSafe(memGetAddress(struct + FMOD_DSP_PARAMETER_DESC_BOOL.VALUENAMES), 2); }

    /** Unsafe version of {@link #defaultval(int) defaultval}. */
    public static void ndefaultval(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC_BOOL.DEFAULTVAL, value); }
    /** Unsafe version of {@link #valuenames(PointerBuffer) valuenames}. */
    public static void nvaluenames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + FMOD_DSP_PARAMETER_DESC_BOOL.VALUENAMES, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_DESC_BOOL} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_DESC_BOOL, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_DESC_BOOL ELEMENT_FACTORY = FMOD_DSP_PARAMETER_DESC_BOOL.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_DESC_BOOL.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_DESC_BOOL#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_DESC_BOOL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code defaultval} field. */
        @NativeType("FMOD_BOOL")
        public int defaultval() { return FMOD_DSP_PARAMETER_DESC_BOOL.ndefaultval(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code valuenames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer valuenames() { return FMOD_DSP_PARAMETER_DESC_BOOL.nvaluenames(address()); }

        /** Sets the specified value to the {@code defaultval} field. */
        public FMOD_DSP_PARAMETER_DESC_BOOL.Buffer defaultval(@NativeType("FMOD_BOOL") int value) { FMOD_DSP_PARAMETER_DESC_BOOL.ndefaultval(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code valuenames} field. */
        public FMOD_DSP_PARAMETER_DESC_BOOL.Buffer valuenames(@Nullable @NativeType("char const * const *") PointerBuffer value) { FMOD_DSP_PARAMETER_DESC_BOOL.nvaluenames(address(), value); return this; }

    }

}