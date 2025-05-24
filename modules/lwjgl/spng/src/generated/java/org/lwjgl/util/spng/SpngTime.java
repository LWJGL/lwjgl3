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
public class SpngTime extends Struct<SpngTime> implements NativeResource {

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

    protected SpngTime(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngTime create(long address, @Nullable ByteBuffer container) {
        return new SpngTime(address, container);
    }

    /**
     * Creates a {@code SpngTime} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngTime(ByteBuffer container) {
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
    public SpngTime year(@NativeType("uint16_t") short value) { nyear(address(), value); return this; }
    /** Sets the specified value to the {@code month} field. */
    public SpngTime month(@NativeType("uint8_t") byte value) { nmonth(address(), value); return this; }
    /** Sets the specified value to the {@code day} field. */
    public SpngTime day(@NativeType("uint8_t") byte value) { nday(address(), value); return this; }
    /** Sets the specified value to the {@code hour} field. */
    public SpngTime hour(@NativeType("uint8_t") byte value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SpngTime minute(@NativeType("uint8_t") byte value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SpngTime second(@NativeType("uint8_t") byte value) { nsecond(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngTime set(
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
    public SpngTime set(SpngTime src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngTime} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngTime malloc() {
        return new SpngTime(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngTime} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngTime calloc() {
        return new SpngTime(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngTime} instance allocated with {@link BufferUtils}. */
    public static SpngTime create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngTime(memAddress(container), container);
    }

    /** Returns a new {@code SpngTime} instance for the specified memory address. */
    public static SpngTime create(long address) {
        return new SpngTime(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngTime createSafe(long address) {
        return address == NULL ? null : new SpngTime(address, null);
    }

    /**
     * Returns a new {@link SpngTime.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngTime.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngTime.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngTime.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngTime.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngTime.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngTime.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngTime.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngTime.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngTime} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngTime malloc(MemoryStack stack) {
        return new SpngTime(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngTime} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngTime calloc(MemoryStack stack) {
        return new SpngTime(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngTime.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngTime.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngTime.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngTime.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #year}. */
    public static short nyear(long struct) { return memGetShort(struct + SpngTime.YEAR); }
    /** Unsafe version of {@link #month}. */
    public static byte nmonth(long struct) { return memGetByte(struct + SpngTime.MONTH); }
    /** Unsafe version of {@link #day}. */
    public static byte nday(long struct) { return memGetByte(struct + SpngTime.DAY); }
    /** Unsafe version of {@link #hour}. */
    public static byte nhour(long struct) { return memGetByte(struct + SpngTime.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static byte nminute(long struct) { return memGetByte(struct + SpngTime.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static byte nsecond(long struct) { return memGetByte(struct + SpngTime.SECOND); }

    /** Unsafe version of {@link #year(short) year}. */
    public static void nyear(long struct, short value) { memPutShort(struct + SpngTime.YEAR, value); }
    /** Unsafe version of {@link #month(byte) month}. */
    public static void nmonth(long struct, byte value) { memPutByte(struct + SpngTime.MONTH, value); }
    /** Unsafe version of {@link #day(byte) day}. */
    public static void nday(long struct, byte value) { memPutByte(struct + SpngTime.DAY, value); }
    /** Unsafe version of {@link #hour(byte) hour}. */
    public static void nhour(long struct, byte value) { memPutByte(struct + SpngTime.HOUR, value); }
    /** Unsafe version of {@link #minute(byte) minute}. */
    public static void nminute(long struct, byte value) { memPutByte(struct + SpngTime.MINUTE, value); }
    /** Unsafe version of {@link #second(byte) second}. */
    public static void nsecond(long struct, byte value) { memPutByte(struct + SpngTime.SECOND, value); }

    // -----------------------------------

    /** An array of {@link SpngTime} structs. */
    public static class Buffer extends StructBuffer<SpngTime, Buffer> implements NativeResource {

        private static final SpngTime ELEMENT_FACTORY = SpngTime.create(-1L);

        /**
         * Creates a new {@code SpngTime.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngTime#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngTime getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code year} field. */
        @NativeType("uint16_t")
        public short year() { return SpngTime.nyear(address()); }
        /** @return the value of the {@code month} field. */
        @NativeType("uint8_t")
        public byte month() { return SpngTime.nmonth(address()); }
        /** @return the value of the {@code day} field. */
        @NativeType("uint8_t")
        public byte day() { return SpngTime.nday(address()); }
        /** @return the value of the {@code hour} field. */
        @NativeType("uint8_t")
        public byte hour() { return SpngTime.nhour(address()); }
        /** @return the value of the {@code minute} field. */
        @NativeType("uint8_t")
        public byte minute() { return SpngTime.nminute(address()); }
        /** @return the value of the {@code second} field. */
        @NativeType("uint8_t")
        public byte second() { return SpngTime.nsecond(address()); }

        /** Sets the specified value to the {@code year} field. */
        public SpngTime.Buffer year(@NativeType("uint16_t") short value) { SpngTime.nyear(address(), value); return this; }
        /** Sets the specified value to the {@code month} field. */
        public SpngTime.Buffer month(@NativeType("uint8_t") byte value) { SpngTime.nmonth(address(), value); return this; }
        /** Sets the specified value to the {@code day} field. */
        public SpngTime.Buffer day(@NativeType("uint8_t") byte value) { SpngTime.nday(address(), value); return this; }
        /** Sets the specified value to the {@code hour} field. */
        public SpngTime.Buffer hour(@NativeType("uint8_t") byte value) { SpngTime.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SpngTime.Buffer minute(@NativeType("uint8_t") byte value) { SpngTime.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SpngTime.Buffer second(@NativeType("uint8_t") byte value) { SpngTime.nsecond(address(), value); return this; }

    }

}