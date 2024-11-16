/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SQL_YEAR_MONTH_STRUCT {
 *     SQLUINTEGER year;
 *     SQLUINTEGER month;
 * }</code></pre>
 */
public class SQL_YEAR_MONTH_STRUCT extends Struct<SQL_YEAR_MONTH_STRUCT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        YEAR,
        MONTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
    }

    protected SQL_YEAR_MONTH_STRUCT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SQL_YEAR_MONTH_STRUCT create(long address, @Nullable ByteBuffer container) {
        return new SQL_YEAR_MONTH_STRUCT(address, container);
    }

    /**
     * Creates a {@code SQL_YEAR_MONTH_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_YEAR_MONTH_STRUCT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code year} field. */
    @NativeType("SQLUINTEGER")
    public int year() { return nyear(address()); }
    /** @return the value of the {@code month} field. */
    @NativeType("SQLUINTEGER")
    public int month() { return nmonth(address()); }

    /** Sets the specified value to the {@code year} field. */
    public SQL_YEAR_MONTH_STRUCT year(@NativeType("SQLUINTEGER") int value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SQL_YEAR_MONTH_STRUCT month(@NativeType("SQLUINTEGER") int value) { nmonth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_YEAR_MONTH_STRUCT set(
        int year,
        int month
    ) {
        year(year);
        month(month);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_YEAR_MONTH_STRUCT set(SQL_YEAR_MONTH_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQL_YEAR_MONTH_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_YEAR_MONTH_STRUCT malloc() {
        return new SQL_YEAR_MONTH_STRUCT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SQL_YEAR_MONTH_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_YEAR_MONTH_STRUCT calloc() {
        return new SQL_YEAR_MONTH_STRUCT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SQL_YEAR_MONTH_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_YEAR_MONTH_STRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SQL_YEAR_MONTH_STRUCT(memAddress(container), container);
    }

    /** Returns a new {@code SQL_YEAR_MONTH_STRUCT} instance for the specified memory address. */
    public static SQL_YEAR_MONTH_STRUCT create(long address) {
        return new SQL_YEAR_MONTH_STRUCT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SQL_YEAR_MONTH_STRUCT createSafe(long address) {
        return address == NULL ? null : new SQL_YEAR_MONTH_STRUCT(address, null);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_YEAR_MONTH_STRUCT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_YEAR_MONTH_STRUCT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_YEAR_MONTH_STRUCT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_YEAR_MONTH_STRUCT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SQL_YEAR_MONTH_STRUCT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_YEAR_MONTH_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQL_YEAR_MONTH_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_YEAR_MONTH_STRUCT malloc(MemoryStack stack) {
        return new SQL_YEAR_MONTH_STRUCT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SQL_YEAR_MONTH_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_YEAR_MONTH_STRUCT calloc(MemoryStack stack) {
        return new SQL_YEAR_MONTH_STRUCT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_YEAR_MONTH_STRUCT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_YEAR_MONTH_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_YEAR_MONTH_STRUCT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static int nyear(long struct) { return memGetInt(struct + SQL_YEAR_MONTH_STRUCT.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static int nmonth(long struct) { return memGetInt(struct + SQL_YEAR_MONTH_STRUCT.MONTH); }

    /** Unsafe version of {@link #year(int) year}. */
    public static void nyear(long struct, int value) { memPutInt(struct + SQL_YEAR_MONTH_STRUCT.YEAR, value); }
    /** Unsafe version of {@link #month(int) month}. */
    public static void nmonth(long struct, int value) { memPutInt(struct + SQL_YEAR_MONTH_STRUCT.MONTH, value); }

    // -----------------------------------

    /** An array of {@link SQL_YEAR_MONTH_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_YEAR_MONTH_STRUCT, Buffer> implements NativeResource {

        private static final SQL_YEAR_MONTH_STRUCT ELEMENT_FACTORY = SQL_YEAR_MONTH_STRUCT.create(-1L);

        /**
         * Creates a new {@code SQL_YEAR_MONTH_STRUCT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_YEAR_MONTH_STRUCT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SQL_YEAR_MONTH_STRUCT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code year} field. */
        @NativeType("SQLUINTEGER")
        public int year() { return SQL_YEAR_MONTH_STRUCT.nyear(address()); }
        /** @return the value of the {@code month} field. */
        @NativeType("SQLUINTEGER")
        public int month() { return SQL_YEAR_MONTH_STRUCT.nmonth(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SQL_YEAR_MONTH_STRUCT.Buffer year(@NativeType("SQLUINTEGER") int value) { SQL_YEAR_MONTH_STRUCT.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SQL_YEAR_MONTH_STRUCT.Buffer month(@NativeType("SQLUINTEGER") int value) { SQL_YEAR_MONTH_STRUCT.nmonth(address(), value); return this; }

    }

}