/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

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
 * struct HACD_Vec3_long {
 *     long m_data[3];
 * }</code></pre>
 */
@NativeType("struct HACD_Vec3_long")
public class HACDVec3Long extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        __VTABLE,
        M_DATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __array(CLONG_SIZE, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        __VTABLE = layout.offsetof(0);
        M_DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code HACDVec3Long} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HACDVec3Long(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link CLongBuffer} view of the {@code m_data} field. */
    @NativeType("long[3]")
    public CLongBuffer m_data() { return nm_data(address()); }
    /** Returns the value at the specified index of the {@code m_data} field. */
    public long m_data(int index) { return nm_data(address(), index); }

    /** Copies the specified {@link CLongBuffer} to the {@code m_data} field. */
    public HACDVec3Long m_data(@NativeType("long[3]") CLongBuffer value) { nm_data(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_data} field. */
    public HACDVec3Long m_data(int index, long value) { nm_data(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HACDVec3Long set(HACDVec3Long src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HACDVec3Long} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HACDVec3Long malloc() {
        return wrap(HACDVec3Long.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code HACDVec3Long} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HACDVec3Long calloc() {
        return wrap(HACDVec3Long.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code HACDVec3Long} instance allocated with {@link BufferUtils}. */
    public static HACDVec3Long create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(HACDVec3Long.class, memAddress(container), container);
    }

    /** Returns a new {@code HACDVec3Long} instance for the specified memory address. */
    public static HACDVec3Long create(long address) {
        return wrap(HACDVec3Long.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HACDVec3Long createSafe(long address) {
        return address == NULL ? null : wrap(HACDVec3Long.class, address);
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link HACDVec3Long.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HACDVec3Long.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code HACDVec3Long} instance allocated on the thread-local {@link MemoryStack}. */
    public static HACDVec3Long mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code HACDVec3Long} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HACDVec3Long callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code HACDVec3Long} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HACDVec3Long mallocStack(MemoryStack stack) {
        return wrap(HACDVec3Long.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code HACDVec3Long} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HACDVec3Long callocStack(MemoryStack stack) {
        return wrap(HACDVec3Long.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HACDVec3Long.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HACDVec3Long.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static long n__VTABLE(long struct) { return memGetAddress(struct + HACDVec3Long.__VTABLE); }
    /** Unsafe version of {@link #m_data}. */
    public static CLongBuffer nm_data(long struct) { return memCLongBuffer(struct + HACDVec3Long.M_DATA, 3); }
    /** Unsafe version of {@link #m_data(int) m_data}. */
    public static long nm_data(long struct, int index) {
        return memGetCLong(struct + HACDVec3Long.M_DATA + check(index, 3) * CLONG_SIZE);
    }

    public static void n__VTABLE(long struct, long value) { memPutAddress(struct + HACDVec3Long.__VTABLE, check(value)); }
    /** Unsafe version of {@link #m_data(CLongBuffer) m_data}. */
    public static void nm_data(long struct, CLongBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + HACDVec3Long.M_DATA, value.remaining() * CLONG_SIZE);
    }
    /** Unsafe version of {@link #m_data(int, long) m_data}. */
    public static void nm_data(long struct, int index, long value) {
        memPutCLong(struct + HACDVec3Long.M_DATA + check(index, 3) * CLONG_SIZE, value);
    }

    // -----------------------------------

    /** An array of {@link HACDVec3Long} structs. */
    public static class Buffer extends StructBuffer<HACDVec3Long, Buffer> implements NativeResource {

        private static final HACDVec3Long ELEMENT_FACTORY = HACDVec3Long.create(-1L);

        /**
         * Creates a new {@code HACDVec3Long.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HACDVec3Long#SIZEOF}, and its mark will be undefined.
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
        protected HACDVec3Long getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link CLongBuffer} view of the {@code m_data} field. */
        @NativeType("long[3]")
        public CLongBuffer m_data() { return HACDVec3Long.nm_data(address()); }
        /** Returns the value at the specified index of the {@code m_data} field. */
        public long m_data(int index) { return HACDVec3Long.nm_data(address(), index); }

        /** Copies the specified {@link CLongBuffer} to the {@code m_data} field. */
        public HACDVec3Long.Buffer m_data(@NativeType("long[3]") CLongBuffer value) { HACDVec3Long.nm_data(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_data} field. */
        public HACDVec3Long.Buffer m_data(int index, long value) { HACDVec3Long.nm_data(address(), index, value); return this; }

    }

}