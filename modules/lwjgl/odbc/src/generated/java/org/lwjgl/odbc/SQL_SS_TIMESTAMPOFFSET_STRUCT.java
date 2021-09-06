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
 * struct SQL_SS_TIMESTAMPOFFSET_STRUCT {
 *     SQLSMALLINT year;
 *     SQLUSMALLINT month;
 *     SQLUSMALLINT day;
 *     SQLUSMALLINT hour;
 *     SQLUSMALLINT minute;
 *     SQLUSMALLINT second;
 *     SQLUINTEGER fraction;
 *     SQLSMALLINT timezone_hour;
 *     SQLSMALLINT timezone_minute;
 * }</code></pre>
 */
public class SQL_SS_TIMESTAMPOFFSET_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        YEAR,
        MONTH,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        FRACTION,
        TIMEZONE_HOUR,
        TIMEZONE_MINUTE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
        HOUR = layout.offsetof(3);
        MINUTE = layout.offsetof(4);
        SECOND = layout.offsetof(5);
        FRACTION = layout.offsetof(6);
        TIMEZONE_HOUR = layout.offsetof(7);
        TIMEZONE_MINUTE = layout.offsetof(8);
    }

    /**
     * Creates a {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT(ByteBuffer container) {
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
    /** @return the value of the {@code hour} field. */
    @NativeType("SQLUSMALLINT")
    public short hour() { return nhour(address()); }
    /** @return the value of the {@code minute} field. */
    @NativeType("SQLUSMALLINT")
    public short minute() { return nminute(address()); }
    /** @return the value of the {@code second} field. */
    @NativeType("SQLUSMALLINT")
    public short second() { return nsecond(address()); }
    /** @return the value of the {@code fraction} field. */
    @NativeType("SQLUINTEGER")
    public int fraction() { return nfraction(address()); }
    /** @return the value of the {@code timezone_hour} field. */
    @NativeType("SQLSMALLINT")
    public short timezone_hour() { return ntimezone_hour(address()); }
    /** @return the value of the {@code timezone_minute} field. */
    @NativeType("SQLSMALLINT")
    public short timezone_minute() { return ntimezone_minute(address()); }

    /** Sets the specified value to the {@code year} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT year(@NativeType("SQLSMALLINT") short value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT month(@NativeType("SQLUSMALLINT") short value) { nmonth(address(), value); return this; }
    /** Sets the specified value to the {@code day} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT day(@NativeType("SQLUSMALLINT") short value) { nday(address(), value); return this; }
    /** Sets the specified value to the {@code hour} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT hour(@NativeType("SQLUSMALLINT") short value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT minute(@NativeType("SQLUSMALLINT") short value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT second(@NativeType("SQLUSMALLINT") short value) { nsecond(address(), value); return this; }
    /** Sets the specified value to the {@code fraction} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT fraction(@NativeType("SQLUINTEGER") int value) { nfraction(address(), value); return this; }
    /** Sets the specified value to the {@code timezone_hour} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT timezone_hour(@NativeType("SQLSMALLINT") short value) { ntimezone_hour(address(), value); return this; }
    /** Sets the specified value to the {@code timezone_minute} field. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT timezone_minute(@NativeType("SQLSMALLINT") short value) { ntimezone_minute(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT set(
        short year,
        short month,
        short day,
        short hour,
        short minute,
        short second,
        int fraction,
        short timezone_hour,
        short timezone_minute
    ) {
        year(year);
        month(month);
        day(day);
        hour(hour);
        minute(minute);
        second(second);
        fraction(fraction);
        timezone_hour(timezone_hour);
        timezone_minute(timezone_minute);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_SS_TIMESTAMPOFFSET_STRUCT set(SQL_SS_TIMESTAMPOFFSET_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT malloc() {
        return wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT calloc() {
        return wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, memAddress(container), container);
    }

    /** Returns a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance for the specified memory address. */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT create(long address) {
        return wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT createSafe(long address) {
        return address == NULL ? null : wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, address);
    }

    /**
     * Returns a new {@link SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT malloc(MemoryStack stack) {
        return wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT calloc(MemoryStack stack) {
        return wrap(SQL_SS_TIMESTAMPOFFSET_STRUCT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static short nyear(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static short nmonth(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.MONTH); }
    /** Unsafe version of {@link #day}. */
    public static short nday(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.DAY); }
    /** Unsafe version of {@link #hour}. */
    public static short nhour(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static short nminute(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static short nsecond(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.SECOND); }
    /** Unsafe version of {@link #fraction}. */
    public static int nfraction(long struct) { return UNSAFE.getInt(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.FRACTION); }
    /** Unsafe version of {@link #timezone_hour}. */
    public static short ntimezone_hour(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.TIMEZONE_HOUR); }
    /** Unsafe version of {@link #timezone_minute}. */
    public static short ntimezone_minute(long struct) { return UNSAFE.getShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.TIMEZONE_MINUTE); }

    /** Unsafe version of {@link #year(short) year}. */
    public static void nyear(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.YEAR, value); }
    /** Unsafe version of {@link #month(short) month}. */
    public static void nmonth(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.MONTH, value); }
    /** Unsafe version of {@link #day(short) day}. */
    public static void nday(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.DAY, value); }
    /** Unsafe version of {@link #hour(short) hour}. */
    public static void nhour(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.HOUR, value); }
    /** Unsafe version of {@link #minute(short) minute}. */
    public static void nminute(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.MINUTE, value); }
    /** Unsafe version of {@link #second(short) second}. */
    public static void nsecond(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.SECOND, value); }
    /** Unsafe version of {@link #fraction(int) fraction}. */
    public static void nfraction(long struct, int value) { UNSAFE.putInt(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.FRACTION, value); }
    /** Unsafe version of {@link #timezone_hour(short) timezone_hour}. */
    public static void ntimezone_hour(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.TIMEZONE_HOUR, value); }
    /** Unsafe version of {@link #timezone_minute(short) timezone_minute}. */
    public static void ntimezone_minute(long struct, short value) { UNSAFE.putShort(null, struct + SQL_SS_TIMESTAMPOFFSET_STRUCT.TIMEZONE_MINUTE, value); }

    // -----------------------------------

    /** An array of {@link SQL_SS_TIMESTAMPOFFSET_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_SS_TIMESTAMPOFFSET_STRUCT, Buffer> implements NativeResource {

        private static final SQL_SS_TIMESTAMPOFFSET_STRUCT ELEMENT_FACTORY = SQL_SS_TIMESTAMPOFFSET_STRUCT.create(-1L);

        /**
         * Creates a new {@code SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_SS_TIMESTAMPOFFSET_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_SS_TIMESTAMPOFFSET_STRUCT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code year} field. */
        @NativeType("SQLSMALLINT")
        public short year() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nyear(address()); }
        /** @return the value of the {@code month} field. */
        @NativeType("SQLUSMALLINT")
        public short month() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nmonth(address()); }
        /** @return the value of the {@code day} field. */
        @NativeType("SQLUSMALLINT")
        public short day() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nday(address()); }
        /** @return the value of the {@code hour} field. */
        @NativeType("SQLUSMALLINT")
        public short hour() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nhour(address()); }
        /** @return the value of the {@code minute} field. */
        @NativeType("SQLUSMALLINT")
        public short minute() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nminute(address()); }
        /** @return the value of the {@code second} field. */
        @NativeType("SQLUSMALLINT")
        public short second() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nsecond(address()); }
        /** @return the value of the {@code fraction} field. */
        @NativeType("SQLUINTEGER")
        public int fraction() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.nfraction(address()); }
        /** @return the value of the {@code timezone_hour} field. */
        @NativeType("SQLSMALLINT")
        public short timezone_hour() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.ntimezone_hour(address()); }
        /** @return the value of the {@code timezone_minute} field. */
        @NativeType("SQLSMALLINT")
        public short timezone_minute() { return SQL_SS_TIMESTAMPOFFSET_STRUCT.ntimezone_minute(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer year(@NativeType("SQLSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer month(@NativeType("SQLUSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nmonth(address(), value); return this; }
        /** Sets the specified value to the {@code day} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer day(@NativeType("SQLUSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nday(address(), value); return this; }
        /** Sets the specified value to the {@code hour} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer hour(@NativeType("SQLUSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer minute(@NativeType("SQLUSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer second(@NativeType("SQLUSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nsecond(address(), value); return this; }
        /** Sets the specified value to the {@code fraction} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer fraction(@NativeType("SQLUINTEGER") int value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.nfraction(address(), value); return this; }
        /** Sets the specified value to the {@code timezone_hour} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer timezone_hour(@NativeType("SQLSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.ntimezone_hour(address(), value); return this; }
        /** Sets the specified value to the {@code timezone_minute} field. */
        public SQL_SS_TIMESTAMPOFFSET_STRUCT.Buffer timezone_minute(@NativeType("SQLSMALLINT") short value) { SQL_SS_TIMESTAMPOFFSET_STRUCT.ntimezone_minute(address(), value); return this; }

    }

}