/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_time {
 *     uint16_t year;
 *     uint8_t month;
 *     uint8_t day;
 *     uint8_t hour;
 *     uint8_t minute;
 *     uint8_t second;
 * }}</pre>
 */
@NativeType("struct spng_time")
public class spng_time extends Struct<spng_time> implements NativeResource {

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
        SECOND;

    static {
        Layout layout = __struct(
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        YEAR = layout.offsetof(0);
        MONTH = layout.offsetof(1);
        DAY = layout.offsetof(2);
        HOUR = layout.offsetof(3);
        MINUTE = layout.offsetof(4);
        SECOND = layout.offsetof(5);
    }

    protected spng_time(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_time create(long address, @Nullable ByteBuffer container) {
        return new spng_time(address, container);
    }

    /**
     * Creates a {@code spng_time} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_time(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code year} field. */
    @NativeType("uint16_t")
    public short year() { return nyear(address()); }
    /** @return the value of the {@code month} field. */
    @NativeType("uint8_t")
    public byte month() { return nmonth(address()); }
    /** @return the value of the {@code day} field. */
    @NativeType("uint8_t")
    public byte day() { return nday(address()); }
    /** @return the value of the {@code hour} field. */
    @NativeType("uint8_t")
    public byte hour() { return nhour(address()); }
    /** @return the value of the {@code minute} field. */
    @NativeType("uint8_t")
    public byte minute() { return nminute(address()); }
    /** @return the value of the {@code second} field. */
    @NativeType("uint8_t")
    public byte second() { return nsecond(address()); }

    /** Sets the specified value to the {@code year} field. */
    public spng_time year(@NativeType("uint16_t") short value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public spng_time month(@NativeType("uint8_t") byte value) { nmonth(address(), value); return this; }
    /** Sets the specified value to the {@code day} field. */
    public spng_time day(@NativeType("uint8_t") byte value) { nday(address(), value); return this; }
    /** Sets the specified value to the {@code hour} field. */
    public spng_time hour(@NativeType("uint8_t") byte value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public spng_time minute(@NativeType("uint8_t") byte value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public spng_time second(@NativeType("uint8_t") byte value) { nsecond(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_time set(
        short year,
        byte month,
        byte day,
        byte hour,
        byte minute,
        byte second
    ) {
        year(year);
        month(month);
        day(day);
        hour(hour);
        minute(minute);
        second(second);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_time set(spng_time src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_time} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_time malloc() {
        return new spng_time(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_time} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_time calloc() {
        return new spng_time(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_time} instance allocated with {@link BufferUtils}. */
    public static spng_time create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_time(memAddress(container), container);
    }

    /** Returns a new {@code spng_time} instance for the specified memory address. */
    public static spng_time create(long address) {
        return new spng_time(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_time createSafe(long address) {
        return address == NULL ? null : new spng_time(address, null);
    }

    /**
     * Returns a new {@link spng_time.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_time.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_time.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_time.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_time.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_time.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_time.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_time.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_time.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_time} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_time malloc(MemoryStack stack) {
        return new spng_time(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_time} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_time calloc(MemoryStack stack) {
        return new spng_time(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_time.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_time.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_time.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_time.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static short nyear(long struct) { return memGetShort(struct + spng_time.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static byte nmonth(long struct) { return memGetByte(struct + spng_time.MONTH); }
    /** Unsafe version of {@link #day}. */
    public static byte nday(long struct) { return memGetByte(struct + spng_time.DAY); }
    /** Unsafe version of {@link #hour}. */
    public static byte nhour(long struct) { return memGetByte(struct + spng_time.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static byte nminute(long struct) { return memGetByte(struct + spng_time.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static byte nsecond(long struct) { return memGetByte(struct + spng_time.SECOND); }

    /** Unsafe version of {@link #year(short) year}. */
    public static void nyear(long struct, short value) { memPutShort(struct + spng_time.YEAR, value); }
    /** Unsafe version of {@link #month(byte) month}. */
    public static void nmonth(long struct, byte value) { memPutByte(struct + spng_time.MONTH, value); }
    /** Unsafe version of {@link #day(byte) day}. */
    public static void nday(long struct, byte value) { memPutByte(struct + spng_time.DAY, value); }
    /** Unsafe version of {@link #hour(byte) hour}. */
    public static void nhour(long struct, byte value) { memPutByte(struct + spng_time.HOUR, value); }
    /** Unsafe version of {@link #minute(byte) minute}. */
    public static void nminute(long struct, byte value) { memPutByte(struct + spng_time.MINUTE, value); }
    /** Unsafe version of {@link #second(byte) second}. */
    public static void nsecond(long struct, byte value) { memPutByte(struct + spng_time.SECOND, value); }

    // -----------------------------------

    /** An array of {@link spng_time} structs. */
    public static class Buffer extends StructBuffer<spng_time, Buffer> implements NativeResource {

        private static final spng_time ELEMENT_FACTORY = spng_time.create(-1L);

        /**
         * Creates a new {@code spng_time.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_time#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_time getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code year} field. */
        @NativeType("uint16_t")
        public short year() { return spng_time.nyear(address()); }
        /** @return the value of the {@code month} field. */
        @NativeType("uint8_t")
        public byte month() { return spng_time.nmonth(address()); }
        /** @return the value of the {@code day} field. */
        @NativeType("uint8_t")
        public byte day() { return spng_time.nday(address()); }
        /** @return the value of the {@code hour} field. */
        @NativeType("uint8_t")
        public byte hour() { return spng_time.nhour(address()); }
        /** @return the value of the {@code minute} field. */
        @NativeType("uint8_t")
        public byte minute() { return spng_time.nminute(address()); }
        /** @return the value of the {@code second} field. */
        @NativeType("uint8_t")
        public byte second() { return spng_time.nsecond(address()); }

        /** Sets the specified value to the {@code year} field. */
        public spng_time.Buffer year(@NativeType("uint16_t") short value) { spng_time.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public spng_time.Buffer month(@NativeType("uint8_t") byte value) { spng_time.nmonth(address(), value); return this; }
        /** Sets the specified value to the {@code day} field. */
        public spng_time.Buffer day(@NativeType("uint8_t") byte value) { spng_time.nday(address(), value); return this; }
        /** Sets the specified value to the {@code hour} field. */
        public spng_time.Buffer hour(@NativeType("uint8_t") byte value) { spng_time.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public spng_time.Buffer minute(@NativeType("uint8_t") byte value) { spng_time.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public spng_time.Buffer second(@NativeType("uint8_t") byte value) { spng_time.nsecond(address(), value); return this; }

    }

}