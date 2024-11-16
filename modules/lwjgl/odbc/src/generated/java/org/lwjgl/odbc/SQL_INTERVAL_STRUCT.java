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
 * struct SQL_INTERVAL_STRUCT {
 *     SQLINTERVAL interval_type;
 *     SQLSMALLINT interval_sign;
 *     struct {
 *         {@link SQL_YEAR_MONTH_STRUCT SQL_YEAR_MONTH_STRUCT} year_month;
 *         {@link SQL_DAY_SECOND_STRUCT SQL_DAY_SECOND_STRUCT} day_second;
 *     } intval;
 * }</code></pre>
 */
public class SQL_INTERVAL_STRUCT extends Struct<SQL_INTERVAL_STRUCT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INTERVAL_TYPE,
        INTERVAL_SIGN,
        INTVAL,
            INTVAL_YEAR_MONTH,
            INTVAL_DAY_SECOND;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __struct(
                __member(SQL_YEAR_MONTH_STRUCT.SIZEOF, SQL_YEAR_MONTH_STRUCT.ALIGNOF),
                __member(SQL_DAY_SECOND_STRUCT.SIZEOF, SQL_DAY_SECOND_STRUCT.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INTERVAL_TYPE = layout.offsetof(0);
        INTERVAL_SIGN = layout.offsetof(1);
        INTVAL = layout.offsetof(2);
            INTVAL_YEAR_MONTH = layout.offsetof(3);
            INTVAL_DAY_SECOND = layout.offsetof(4);
    }

    protected SQL_INTERVAL_STRUCT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SQL_INTERVAL_STRUCT create(long address, @Nullable ByteBuffer container) {
        return new SQL_INTERVAL_STRUCT(address, container);
    }

    /**
     * Creates a {@code SQL_INTERVAL_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_INTERVAL_STRUCT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code interval_type} field. */
    @NativeType("SQLINTERVAL")
    public int interval_type() { return ninterval_type(address()); }
    /** @return the value of the {@code interval_sign} field. */
    @NativeType("SQLSMALLINT")
    public short interval_sign() { return ninterval_sign(address()); }
    /** @return a {@link SQL_YEAR_MONTH_STRUCT} view of the {@code intval.year_month} field. */
    public SQL_YEAR_MONTH_STRUCT intval_year_month() { return nintval_year_month(address()); }
    /** @return a {@link SQL_DAY_SECOND_STRUCT} view of the {@code intval.day_second} field. */
    public SQL_DAY_SECOND_STRUCT intval_day_second() { return nintval_day_second(address()); }

    /** Sets the specified value to the {@code interval_type} field. */
    public SQL_INTERVAL_STRUCT interval_type(@NativeType("SQLINTERVAL") int value) { ninterval_type(address(), value); return this; }
    /** Sets the specified value to the {@code interval_sign} field. */
    public SQL_INTERVAL_STRUCT interval_sign(@NativeType("SQLSMALLINT") short value) { ninterval_sign(address(), value); return this; }
    /** Copies the specified {@link SQL_YEAR_MONTH_STRUCT} to the {@code year_month} field. */
    public SQL_INTERVAL_STRUCT intval_year_month(SQL_YEAR_MONTH_STRUCT value) { nintval_year_month(address(), value); return this; }
    /** Passes the {@code year_month} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SQL_INTERVAL_STRUCT intval_year_month(java.util.function.Consumer<SQL_YEAR_MONTH_STRUCT> consumer) { consumer.accept(intval_year_month()); return this; }
    /** Copies the specified {@link SQL_DAY_SECOND_STRUCT} to the {@code day_second} field. */
    public SQL_INTERVAL_STRUCT intval_day_second(SQL_DAY_SECOND_STRUCT value) { nintval_day_second(address(), value); return this; }
    /** Passes the {@code day_second} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SQL_INTERVAL_STRUCT intval_day_second(java.util.function.Consumer<SQL_DAY_SECOND_STRUCT> consumer) { consumer.accept(intval_day_second()); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_INTERVAL_STRUCT set(
        int interval_type,
        short interval_sign,
        SQL_YEAR_MONTH_STRUCT intval_year_month,
        SQL_DAY_SECOND_STRUCT intval_day_second
    ) {
        interval_type(interval_type);
        interval_sign(interval_sign);
        intval_year_month(intval_year_month);
        intval_day_second(intval_day_second);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_INTERVAL_STRUCT set(SQL_INTERVAL_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQL_INTERVAL_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_INTERVAL_STRUCT malloc() {
        return new SQL_INTERVAL_STRUCT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SQL_INTERVAL_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_INTERVAL_STRUCT calloc() {
        return new SQL_INTERVAL_STRUCT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SQL_INTERVAL_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_INTERVAL_STRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SQL_INTERVAL_STRUCT(memAddress(container), container);
    }

    /** Returns a new {@code SQL_INTERVAL_STRUCT} instance for the specified memory address. */
    public static SQL_INTERVAL_STRUCT create(long address) {
        return new SQL_INTERVAL_STRUCT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SQL_INTERVAL_STRUCT createSafe(long address) {
        return address == NULL ? null : new SQL_INTERVAL_STRUCT(address, null);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_INTERVAL_STRUCT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_INTERVAL_STRUCT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_INTERVAL_STRUCT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SQL_INTERVAL_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_INTERVAL_STRUCT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SQL_INTERVAL_STRUCT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_INTERVAL_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQL_INTERVAL_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_INTERVAL_STRUCT malloc(MemoryStack stack) {
        return new SQL_INTERVAL_STRUCT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SQL_INTERVAL_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_INTERVAL_STRUCT calloc(MemoryStack stack) {
        return new SQL_INTERVAL_STRUCT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_INTERVAL_STRUCT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_INTERVAL_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_INTERVAL_STRUCT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #interval_type}. */
    public static int ninterval_type(long struct) { return memGetInt(struct + SQL_INTERVAL_STRUCT.INTERVAL_TYPE); }
    /** Unsafe version of {@link #interval_sign}. */
    public static short ninterval_sign(long struct) { return memGetShort(struct + SQL_INTERVAL_STRUCT.INTERVAL_SIGN); }
    /** Unsafe version of {@link #intval_year_month}. */
    public static SQL_YEAR_MONTH_STRUCT nintval_year_month(long struct) { return SQL_YEAR_MONTH_STRUCT.create(struct + SQL_INTERVAL_STRUCT.INTVAL_YEAR_MONTH); }
    /** Unsafe version of {@link #intval_day_second}. */
    public static SQL_DAY_SECOND_STRUCT nintval_day_second(long struct) { return SQL_DAY_SECOND_STRUCT.create(struct + SQL_INTERVAL_STRUCT.INTVAL_DAY_SECOND); }

    /** Unsafe version of {@link #interval_type(int) interval_type}. */
    public static void ninterval_type(long struct, int value) { memPutInt(struct + SQL_INTERVAL_STRUCT.INTERVAL_TYPE, value); }
    /** Unsafe version of {@link #interval_sign(short) interval_sign}. */
    public static void ninterval_sign(long struct, short value) { memPutShort(struct + SQL_INTERVAL_STRUCT.INTERVAL_SIGN, value); }
    /** Unsafe version of {@link #intval_year_month(SQL_YEAR_MONTH_STRUCT) intval_year_month}. */
    public static void nintval_year_month(long struct, SQL_YEAR_MONTH_STRUCT value) { memCopy(value.address(), struct + SQL_INTERVAL_STRUCT.INTVAL_YEAR_MONTH, SQL_YEAR_MONTH_STRUCT.SIZEOF); }
    /** Unsafe version of {@link #intval_day_second(SQL_DAY_SECOND_STRUCT) intval_day_second}. */
    public static void nintval_day_second(long struct, SQL_DAY_SECOND_STRUCT value) { memCopy(value.address(), struct + SQL_INTERVAL_STRUCT.INTVAL_DAY_SECOND, SQL_DAY_SECOND_STRUCT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SQL_INTERVAL_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_INTERVAL_STRUCT, Buffer> implements NativeResource {

        private static final SQL_INTERVAL_STRUCT ELEMENT_FACTORY = SQL_INTERVAL_STRUCT.create(-1L);

        /**
         * Creates a new {@code SQL_INTERVAL_STRUCT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_INTERVAL_STRUCT#SIZEOF}, and its mark will be undefined.</p>
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
        protected SQL_INTERVAL_STRUCT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code interval_type} field. */
        @NativeType("SQLINTERVAL")
        public int interval_type() { return SQL_INTERVAL_STRUCT.ninterval_type(address()); }
        /** @return the value of the {@code interval_sign} field. */
        @NativeType("SQLSMALLINT")
        public short interval_sign() { return SQL_INTERVAL_STRUCT.ninterval_sign(address()); }
        /** @return a {@link SQL_YEAR_MONTH_STRUCT} view of the {@code intval.year_month} field. */
        public SQL_YEAR_MONTH_STRUCT intval_year_month() { return SQL_INTERVAL_STRUCT.nintval_year_month(address()); }
        /** @return a {@link SQL_DAY_SECOND_STRUCT} view of the {@code intval.day_second} field. */
        public SQL_DAY_SECOND_STRUCT intval_day_second() { return SQL_INTERVAL_STRUCT.nintval_day_second(address()); }

        /** Sets the specified value to the {@code interval_type} field. */
        public SQL_INTERVAL_STRUCT.Buffer interval_type(@NativeType("SQLINTERVAL") int value) { SQL_INTERVAL_STRUCT.ninterval_type(address(), value); return this; }
        /** Sets the specified value to the {@code interval_sign} field. */
        public SQL_INTERVAL_STRUCT.Buffer interval_sign(@NativeType("SQLSMALLINT") short value) { SQL_INTERVAL_STRUCT.ninterval_sign(address(), value); return this; }
        /** Copies the specified {@link SQL_YEAR_MONTH_STRUCT} to the {@code year_month} field. */
        public SQL_INTERVAL_STRUCT.Buffer intval_year_month(SQL_YEAR_MONTH_STRUCT value) { SQL_INTERVAL_STRUCT.nintval_year_month(address(), value); return this; }
        /** Passes the {@code year_month} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SQL_INTERVAL_STRUCT.Buffer intval_year_month(java.util.function.Consumer<SQL_YEAR_MONTH_STRUCT> consumer) { consumer.accept(intval_year_month()); return this; }
        /** Copies the specified {@link SQL_DAY_SECOND_STRUCT} to the {@code day_second} field. */
        public SQL_INTERVAL_STRUCT.Buffer intval_day_second(SQL_DAY_SECOND_STRUCT value) { SQL_INTERVAL_STRUCT.nintval_day_second(address(), value); return this; }
        /** Passes the {@code day_second} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SQL_INTERVAL_STRUCT.Buffer intval_day_second(java.util.function.Consumer<SQL_DAY_SECOND_STRUCT> consumer) { consumer.accept(intval_day_second()); return this; }

    }

}