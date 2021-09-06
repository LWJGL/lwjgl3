/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

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
 * struct SQL_DATE_STRUCT {
 *     SQLSMALLINT year;
 *     SQLUSMALLINT month;
 *     SQLUSMALLINT day;
 * }</code></pre>
 */
public class SQL_DATE_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        YEAR,
        MONTH,
        DAY;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
    }

    /**
     * Creates a {@code SQL_DATE_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_DATE_STRUCT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code year} field. */
    @NativeType("SQLSMALLINT")
    public short year() { return nyear(address()); }
    /** @return the value of the {@code month} field. */
    @NativeType("SQLUSMALLINT")
    public short month() { return nmonth(address()); }
    /** @return the value of the {@code day} field. */
    @NativeType("SQLUSMALLINT")
    public short day() { return nday(address()); }

    /** Sets the specified value to the {@code year} field. */
    public SQL_DATE_STRUCT year(@NativeType("SQLSMALLINT") short value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SQL_DATE_STRUCT month(@NativeType("SQLUSMALLINT") short value) { nmonth(address(), value); return this; }
    /** Sets the specified value to the {@code day} field. */
    public SQL_DATE_STRUCT day(@NativeType("SQLUSMALLINT") short value) { nday(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_DATE_STRUCT set(
        short year,
        short month,
        short day
    ) {
        year(year);
        month(month);
        day(day);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_DATE_STRUCT set(SQL_DATE_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQL_DATE_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_DATE_STRUCT malloc() {
        return wrap(SQL_DATE_STRUCT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SQL_DATE_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_DATE_STRUCT calloc() {
        return wrap(SQL_DATE_STRUCT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SQL_DATE_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_DATE_STRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SQL_DATE_STRUCT.class, memAddress(container), container);
    }

    /** Returns a new {@code SQL_DATE_STRUCT} instance for the specified memory address. */
    public static SQL_DATE_STRUCT create(long address) {
        return wrap(SQL_DATE_STRUCT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_DATE_STRUCT createSafe(long address) {
        return address == NULL ? null : wrap(SQL_DATE_STRUCT.class, address);
    }

    /**
     * Returns a new {@link SQL_DATE_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DATE_STRUCT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQL_DATE_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DATE_STRUCT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_DATE_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_DATE_STRUCT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SQL_DATE_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_DATE_STRUCT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_DATE_STRUCT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_DATE_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQL_DATE_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_DATE_STRUCT malloc(MemoryStack stack) {
        return wrap(SQL_DATE_STRUCT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SQL_DATE_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_DATE_STRUCT calloc(MemoryStack stack) {
        return wrap(SQL_DATE_STRUCT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_DATE_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_DATE_STRUCT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_DATE_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_DATE_STRUCT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static short nyear(long struct) { return UNSAFE.getShort(null, struct + SQL_DATE_STRUCT.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static short nmonth(long struct) { return UNSAFE.getShort(null, struct + SQL_DATE_STRUCT.MONTH); }
    /** Unsafe version of {@link #day}. */
    public static short nday(long struct) { return UNSAFE.getShort(null, struct + SQL_DATE_STRUCT.DAY); }

    /** Unsafe version of {@link #year(short) year}. */
    public static void nyear(long struct, short value) { UNSAFE.putShort(null, struct + SQL_DATE_STRUCT.YEAR, value); }
    /** Unsafe version of {@link #month(short) month}. */
    public static void nmonth(long struct, short value) { UNSAFE.putShort(null, struct + SQL_DATE_STRUCT.MONTH, value); }
    /** Unsafe version of {@link #day(short) day}. */
    public static void nday(long struct, short value) { UNSAFE.putShort(null, struct + SQL_DATE_STRUCT.DAY, value); }

    // -----------------------------------

    /** An array of {@link SQL_DATE_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_DATE_STRUCT, Buffer> implements NativeResource {

        private static final SQL_DATE_STRUCT ELEMENT_FACTORY = SQL_DATE_STRUCT.create(-1L);

        /**
         * Creates a new {@code SQL_DATE_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_DATE_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_DATE_STRUCT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code year} field. */
        @NativeType("SQLSMALLINT")
        public short year() { return SQL_DATE_STRUCT.nyear(address()); }
        /** @return the value of the {@code month} field. */
        @NativeType("SQLUSMALLINT")
        public short month() { return SQL_DATE_STRUCT.nmonth(address()); }
        /** @return the value of the {@code day} field. */
        @NativeType("SQLUSMALLINT")
        public short day() { return SQL_DATE_STRUCT.nday(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SQL_DATE_STRUCT.Buffer year(@NativeType("SQLSMALLINT") short value) { SQL_DATE_STRUCT.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SQL_DATE_STRUCT.Buffer month(@NativeType("SQLUSMALLINT") short value) { SQL_DATE_STRUCT.nmonth(address(), value); return this; }
        /** Sets the specified value to the {@code day} field. */
        public SQL_DATE_STRUCT.Buffer day(@NativeType("SQLUSMALLINT") short value) { SQL_DATE_STRUCT.nday(address(), value); return this; }

    }

}