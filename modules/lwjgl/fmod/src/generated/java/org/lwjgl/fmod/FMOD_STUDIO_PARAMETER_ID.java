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
 * struct FMOD_STUDIO_PARAMETER_ID {
 *     unsigned int data1;
 *     unsigned int data2;
 * }</code></pre>
 */
public class FMOD_STUDIO_PARAMETER_ID extends Struct<FMOD_STUDIO_PARAMETER_ID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA1,
        DATA2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA1 = layout.offsetof(0);
        DATA2 = layout.offsetof(1);
    }

    protected FMOD_STUDIO_PARAMETER_ID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_PARAMETER_ID create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_PARAMETER_ID(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_PARAMETER_ID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_PARAMETER_ID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code data1} field. */
    @NativeType("unsigned int")
    public int data1() { return ndata1(address()); }
    /** @return the value of the {@code data2} field. */
    @NativeType("unsigned int")
    public int data2() { return ndata2(address()); }

    /** Sets the specified value to the {@code data1} field. */
    public FMOD_STUDIO_PARAMETER_ID data1(@NativeType("unsigned int") int value) { ndata1(address(), value); return this; }
    /** Sets the specified value to the {@code data2} field. */
    public FMOD_STUDIO_PARAMETER_ID data2(@NativeType("unsigned int") int value) { ndata2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_PARAMETER_ID set(
        int data1,
        int data2
    ) {
        data1(data1);
        data2(data2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_PARAMETER_ID set(FMOD_STUDIO_PARAMETER_ID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_ID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_PARAMETER_ID malloc() {
        return new FMOD_STUDIO_PARAMETER_ID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_ID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_PARAMETER_ID calloc() {
        return new FMOD_STUDIO_PARAMETER_ID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_ID} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_PARAMETER_ID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_PARAMETER_ID(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_PARAMETER_ID} instance for the specified memory address. */
    public static FMOD_STUDIO_PARAMETER_ID create(long address) {
        return new FMOD_STUDIO_PARAMETER_ID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_PARAMETER_ID createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_PARAMETER_ID(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_ID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_ID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_ID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_ID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_ID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_ID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_PARAMETER_ID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_ID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_PARAMETER_ID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_PARAMETER_ID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_PARAMETER_ID malloc(MemoryStack stack) {
        return new FMOD_STUDIO_PARAMETER_ID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_PARAMETER_ID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_PARAMETER_ID calloc(MemoryStack stack) {
        return new FMOD_STUDIO_PARAMETER_ID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_ID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_ID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_PARAMETER_ID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_PARAMETER_ID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data1}. */
    public static int ndata1(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_PARAMETER_ID.DATA1); }
    /** Unsafe version of {@link #data2}. */
    public static int ndata2(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_PARAMETER_ID.DATA2); }

    /** Unsafe version of {@link #data1(int) data1}. */
    public static void ndata1(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_PARAMETER_ID.DATA1, value); }
    /** Unsafe version of {@link #data2(int) data2}. */
    public static void ndata2(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_PARAMETER_ID.DATA2, value); }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_PARAMETER_ID} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_PARAMETER_ID, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_PARAMETER_ID ELEMENT_FACTORY = FMOD_STUDIO_PARAMETER_ID.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_PARAMETER_ID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_PARAMETER_ID#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_PARAMETER_ID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code data1} field. */
        @NativeType("unsigned int")
        public int data1() { return FMOD_STUDIO_PARAMETER_ID.ndata1(address()); }
        /** @return the value of the {@code data2} field. */
        @NativeType("unsigned int")
        public int data2() { return FMOD_STUDIO_PARAMETER_ID.ndata2(address()); }

        /** Sets the specified value to the {@code data1} field. */
        public FMOD_STUDIO_PARAMETER_ID.Buffer data1(@NativeType("unsigned int") int value) { FMOD_STUDIO_PARAMETER_ID.ndata1(address(), value); return this; }
        /** Sets the specified value to the {@code data2} field. */
        public FMOD_STUDIO_PARAMETER_ID.Buffer data2(@NativeType("unsigned int") int value) { FMOD_STUDIO_PARAMETER_ID.ndata2(address(), value); return this; }

    }

}