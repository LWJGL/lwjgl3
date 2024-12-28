/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_DateTime {
 *     int year;
 *     int month;
 *     int day;
 *     int hour;
 *     int minute;
 *     int second;
 *     int nanosecond;
 *     int day_of_week;
 *     int utc_offset;
 * }}</pre>
 */
public class SDL_DateTime extends Struct<SDL_DateTime> implements NativeResource {

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
        NANOSECOND,
        DAY_OF_WEEK,
        UTC_OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
        HOUR = layout.offsetof(3);
        MINUTE = layout.offsetof(4);
        SECOND = layout.offsetof(5);
        NANOSECOND = layout.offsetof(6);
        DAY_OF_WEEK = layout.offsetof(7);
        UTC_OFFSET = layout.offsetof(8);
    }

    protected SDL_DateTime(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_DateTime create(long address, @Nullable ByteBuffer container) {
        return new SDL_DateTime(address, container);
    }

    /**
     * Creates a {@code SDL_DateTime} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_DateTime(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code year} field. */
    public int year() { return nyear(address()); }
    /** @return the value of the {@code month} field. */
    public int month() { return nmonth(address()); }
    /** @return the value of the {@code day} field. */
    public int day() { return nday(address()); }
    /** @return the value of the {@code hour} field. */
    public int hour() { return nhour(address()); }
    /** @return the value of the {@code minute} field. */
    public int minute() { return nminute(address()); }
    /** @return the value of the {@code second} field. */
    public int second() { return nsecond(address()); }
    /** @return the value of the {@code nanosecond} field. */
    public int nanosecond() { return nnanosecond(address()); }
    /** @return the value of the {@code day_of_week} field. */
    public int day_of_week() { return nday_of_week(address()); }
    /** @return the value of the {@code utc_offset} field. */
    public int utc_offset() { return nutc_offset(address()); }

    /** Sets the specified value to the {@code year} field. */
    public SDL_DateTime year(int value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SDL_DateTime month(int value) { nmonth(address(), value); return this; }
    /** Sets the specified value to the {@code day} field. */
    public SDL_DateTime day(int value) { nday(address(), value); return this; }
    /** Sets the specified value to the {@code hour} field. */
    public SDL_DateTime hour(int value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SDL_DateTime minute(int value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SDL_DateTime second(int value) { nsecond(address(), value); return this; }
    /** Sets the specified value to the {@code nanosecond} field. */
    public SDL_DateTime nanosecond(int value) { nnanosecond(address(), value); return this; }
    /** Sets the specified value to the {@code day_of_week} field. */
    public SDL_DateTime day_of_week(int value) { nday_of_week(address(), value); return this; }
    /** Sets the specified value to the {@code utc_offset} field. */
    public SDL_DateTime utc_offset(int value) { nutc_offset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_DateTime set(
        int year,
        int month,
        int day,
        int hour,
        int minute,
        int second,
        int nanosecond,
        int day_of_week,
        int utc_offset
    ) {
        year(year);
        month(month);
        day(day);
        hour(hour);
        minute(minute);
        second(second);
        nanosecond(nanosecond);
        day_of_week(day_of_week);
        utc_offset(utc_offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_DateTime set(SDL_DateTime src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_DateTime} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_DateTime malloc() {
        return new SDL_DateTime(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_DateTime} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_DateTime calloc() {
        return new SDL_DateTime(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_DateTime} instance allocated with {@link BufferUtils}. */
    public static SDL_DateTime create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DateTime(memAddress(container), container);
    }

    /** Returns a new {@code SDL_DateTime} instance for the specified memory address. */
    public static SDL_DateTime create(long address) {
        return new SDL_DateTime(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_DateTime createSafe(long address) {
        return address == NULL ? null : new SDL_DateTime(address, null);
    }

    /**
     * Returns a new {@link SDL_DateTime.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DateTime.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_DateTime.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DateTime.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DateTime.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DateTime.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_DateTime.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_DateTime.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_DateTime.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_DateTime} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DateTime malloc(MemoryStack stack) {
        return new SDL_DateTime(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_DateTime} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DateTime calloc(MemoryStack stack) {
        return new SDL_DateTime(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_DateTime.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DateTime.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DateTime.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DateTime.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static int nyear(long struct) { return memGetInt(struct + SDL_DateTime.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static int nmonth(long struct) { return memGetInt(struct + SDL_DateTime.MONTH); }
    /** Unsafe version of {@link #day}. */
    public static int nday(long struct) { return memGetInt(struct + SDL_DateTime.DAY); }
    /** Unsafe version of {@link #hour}. */
    public static int nhour(long struct) { return memGetInt(struct + SDL_DateTime.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static int nminute(long struct) { return memGetInt(struct + SDL_DateTime.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static int nsecond(long struct) { return memGetInt(struct + SDL_DateTime.SECOND); }
    /** Unsafe version of {@link #nanosecond}. */
    public static int nnanosecond(long struct) { return memGetInt(struct + SDL_DateTime.NANOSECOND); }
    /** Unsafe version of {@link #day_of_week}. */
    public static int nday_of_week(long struct) { return memGetInt(struct + SDL_DateTime.DAY_OF_WEEK); }
    /** Unsafe version of {@link #utc_offset}. */
    public static int nutc_offset(long struct) { return memGetInt(struct + SDL_DateTime.UTC_OFFSET); }

    /** Unsafe version of {@link #year(int) year}. */
    public static void nyear(long struct, int value) { memPutInt(struct + SDL_DateTime.YEAR, value); }
    /** Unsafe version of {@link #month(int) month}. */
    public static void nmonth(long struct, int value) { memPutInt(struct + SDL_DateTime.MONTH, value); }
    /** Unsafe version of {@link #day(int) day}. */
    public static void nday(long struct, int value) { memPutInt(struct + SDL_DateTime.DAY, value); }
    /** Unsafe version of {@link #hour(int) hour}. */
    public static void nhour(long struct, int value) { memPutInt(struct + SDL_DateTime.HOUR, value); }
    /** Unsafe version of {@link #minute(int) minute}. */
    public static void nminute(long struct, int value) { memPutInt(struct + SDL_DateTime.MINUTE, value); }
    /** Unsafe version of {@link #second(int) second}. */
    public static void nsecond(long struct, int value) { memPutInt(struct + SDL_DateTime.SECOND, value); }
    /** Unsafe version of {@link #nanosecond(int) nanosecond}. */
    public static void nnanosecond(long struct, int value) { memPutInt(struct + SDL_DateTime.NANOSECOND, value); }
    /** Unsafe version of {@link #day_of_week(int) day_of_week}. */
    public static void nday_of_week(long struct, int value) { memPutInt(struct + SDL_DateTime.DAY_OF_WEEK, value); }
    /** Unsafe version of {@link #utc_offset(int) utc_offset}. */
    public static void nutc_offset(long struct, int value) { memPutInt(struct + SDL_DateTime.UTC_OFFSET, value); }

    // -----------------------------------

    /** An array of {@link SDL_DateTime} structs. */
    public static class Buffer extends StructBuffer<SDL_DateTime, Buffer> implements NativeResource {

        private static final SDL_DateTime ELEMENT_FACTORY = SDL_DateTime.create(-1L);

        /**
         * Creates a new {@code SDL_DateTime.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_DateTime#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_DateTime getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code year} field. */
        public int year() { return SDL_DateTime.nyear(address()); }
        /** @return the value of the {@code month} field. */
        public int month() { return SDL_DateTime.nmonth(address()); }
        /** @return the value of the {@code day} field. */
        public int day() { return SDL_DateTime.nday(address()); }
        /** @return the value of the {@code hour} field. */
        public int hour() { return SDL_DateTime.nhour(address()); }
        /** @return the value of the {@code minute} field. */
        public int minute() { return SDL_DateTime.nminute(address()); }
        /** @return the value of the {@code second} field. */
        public int second() { return SDL_DateTime.nsecond(address()); }
        /** @return the value of the {@code nanosecond} field. */
        public int nanosecond() { return SDL_DateTime.nnanosecond(address()); }
        /** @return the value of the {@code day_of_week} field. */
        public int day_of_week() { return SDL_DateTime.nday_of_week(address()); }
        /** @return the value of the {@code utc_offset} field. */
        public int utc_offset() { return SDL_DateTime.nutc_offset(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SDL_DateTime.Buffer year(int value) { SDL_DateTime.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SDL_DateTime.Buffer month(int value) { SDL_DateTime.nmonth(address(), value); return this; }
        /** Sets the specified value to the {@code day} field. */
        public SDL_DateTime.Buffer day(int value) { SDL_DateTime.nday(address(), value); return this; }
        /** Sets the specified value to the {@code hour} field. */
        public SDL_DateTime.Buffer hour(int value) { SDL_DateTime.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SDL_DateTime.Buffer minute(int value) { SDL_DateTime.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SDL_DateTime.Buffer second(int value) { SDL_DateTime.nsecond(address(), value); return this; }
        /** Sets the specified value to the {@code nanosecond} field. */
        public SDL_DateTime.Buffer nanosecond(int value) { SDL_DateTime.nnanosecond(address(), value); return this; }
        /** Sets the specified value to the {@code day_of_week} field. */
        public SDL_DateTime.Buffer day_of_week(int value) { SDL_DateTime.nday_of_week(address(), value); return this; }
        /** Sets the specified value to the {@code utc_offset} field. */
        public SDL_DateTime.Buffer utc_offset(int value) { SDL_DateTime.nutc_offset(address(), value); return this; }

    }

}