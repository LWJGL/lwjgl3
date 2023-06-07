/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

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
 * struct CUexecAffinitySmCount {
 *     unsigned int val;
 * }</code></pre>
 */
public class CUexecAffinitySmCount extends Struct<CUexecAffinitySmCount> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VAL;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VAL = layout.offsetof(0);
    }

    protected CUexecAffinitySmCount(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUexecAffinitySmCount create(long address, @Nullable ByteBuffer container) {
        return new CUexecAffinitySmCount(address, container);
    }

    /**
     * Creates a {@code CUexecAffinitySmCount} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUexecAffinitySmCount(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code val} field. */
    @NativeType("unsigned int")
    public int val() { return nval(address()); }

    /** Sets the specified value to the {@code val} field. */
    public CUexecAffinitySmCount val(@NativeType("unsigned int") int value) { nval(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUexecAffinitySmCount set(CUexecAffinitySmCount src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUexecAffinitySmCount} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUexecAffinitySmCount malloc() {
        return new CUexecAffinitySmCount(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUexecAffinitySmCount} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUexecAffinitySmCount calloc() {
        return new CUexecAffinitySmCount(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUexecAffinitySmCount} instance allocated with {@link BufferUtils}. */
    public static CUexecAffinitySmCount create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUexecAffinitySmCount(memAddress(container), container);
    }

    /** Returns a new {@code CUexecAffinitySmCount} instance for the specified memory address. */
    public static CUexecAffinitySmCount create(long address) {
        return new CUexecAffinitySmCount(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUexecAffinitySmCount createSafe(long address) {
        return address == NULL ? null : new CUexecAffinitySmCount(address, null);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUexecAffinitySmCount.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUexecAffinitySmCount.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUexecAffinitySmCount} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUexecAffinitySmCount malloc(MemoryStack stack) {
        return new CUexecAffinitySmCount(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUexecAffinitySmCount} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUexecAffinitySmCount calloc(MemoryStack stack) {
        return new CUexecAffinitySmCount(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #val}. */
    public static int nval(long struct) { return UNSAFE.getInt(null, struct + CUexecAffinitySmCount.VAL); }

    /** Unsafe version of {@link #val(int) val}. */
    public static void nval(long struct, int value) { UNSAFE.putInt(null, struct + CUexecAffinitySmCount.VAL, value); }

    // -----------------------------------

    /** An array of {@link CUexecAffinitySmCount} structs. */
    public static class Buffer extends StructBuffer<CUexecAffinitySmCount, Buffer> implements NativeResource {

        private static final CUexecAffinitySmCount ELEMENT_FACTORY = CUexecAffinitySmCount.create(-1L);

        /**
         * Creates a new {@code CUexecAffinitySmCount.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUexecAffinitySmCount#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUexecAffinitySmCount getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code val} field. */
        @NativeType("unsigned int")
        public int val() { return CUexecAffinitySmCount.nval(address()); }

        /** Sets the specified value to the {@code val} field. */
        public CUexecAffinitySmCount.Buffer val(@NativeType("unsigned int") int value) { CUexecAffinitySmCount.nval(address(), value); return this; }

    }

}