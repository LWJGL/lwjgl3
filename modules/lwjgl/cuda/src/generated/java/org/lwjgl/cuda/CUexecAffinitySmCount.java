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
 * Value for {@link CU#CU_EXEC_AFFINITY_TYPE_SM_COUNT EXEC_AFFINITY_TYPE_SM_COUNT}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUexecAffinitySmCount {
 *     unsigned int {@link #val};
 * }</code></pre>
 */
public class CUexecAffinitySmCount extends Struct implements NativeResource {

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

    /** the number of SMs the context is limited to use */
    @NativeType("unsigned int")
    public int val() { return nval(address()); }

    /** Sets the specified value to the {@link #val} field. */
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
        return wrap(CUexecAffinitySmCount.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUexecAffinitySmCount} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUexecAffinitySmCount calloc() {
        return wrap(CUexecAffinitySmCount.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUexecAffinitySmCount} instance allocated with {@link BufferUtils}. */
    public static CUexecAffinitySmCount create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUexecAffinitySmCount.class, memAddress(container), container);
    }

    /** Returns a new {@code CUexecAffinitySmCount} instance for the specified memory address. */
    public static CUexecAffinitySmCount create(long address) {
        return wrap(CUexecAffinitySmCount.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUexecAffinitySmCount createSafe(long address) {
        return address == NULL ? null : wrap(CUexecAffinitySmCount.class, address);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUexecAffinitySmCount.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUexecAffinitySmCount.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUexecAffinitySmCount} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUexecAffinitySmCount malloc(MemoryStack stack) {
        return wrap(CUexecAffinitySmCount.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUexecAffinitySmCount} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUexecAffinitySmCount calloc(MemoryStack stack) {
        return wrap(CUexecAffinitySmCount.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUexecAffinitySmCount.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUexecAffinitySmCount.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUexecAffinitySmCount#SIZEOF}, and its mark will be undefined.
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

        /** @return the value of the {@link CUexecAffinitySmCount#val} field. */
        @NativeType("unsigned int")
        public int val() { return CUexecAffinitySmCount.nval(address()); }

        /** Sets the specified value to the {@link CUexecAffinitySmCount#val} field. */
        public CUexecAffinitySmCount.Buffer val(@NativeType("unsigned int") int value) { CUexecAffinitySmCount.nval(address(), value); return this; }

    }

}