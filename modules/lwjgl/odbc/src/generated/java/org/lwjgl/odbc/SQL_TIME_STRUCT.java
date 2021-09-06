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
 * struct SQL_TIME_STRUCT {
 *     SQLUSMALLINT hour;
 *     SQLUSMALLINT minute;
 *     SQLUSMALLINT second;
 * }</code></pre>
 */
public class SQL_TIME_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HOUR,
        MINUTE,
        SECOND;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HOUR = layout.offsetof(0);
        MINUTE = layout.offsetof(1);
        SECOND = layout.offsetof(2);
    }

    /**
     * Creates a {@code SQL_TIME_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_TIME_STRUCT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code hour} field. */
    @NativeType("SQLUSMALLINT")
    public short hour() { return nhour(address()); }
    /** @return the value of the {@code minute} field. */
    @NativeType("SQLUSMALLINT")
    public short minute() { return nminute(address()); }
    /** @return the value of the {@code second} field. */
    @NativeType("SQLUSMALLINT")
    public short second() { return nsecond(address()); }

    /** Sets the specified value to the {@code hour} field. */
    public SQL_TIME_STRUCT hour(@NativeType("SQLUSMALLINT") short value) { nhour(address(), value); return this; }
    /** Sets the specified value to the {@code minute} field. */
    public SQL_TIME_STRUCT minute(@NativeType("SQLUSMALLINT") short value) { nminute(address(), value); return this; }
    /** Sets the specified value to the {@code second} field. */
    public SQL_TIME_STRUCT second(@NativeType("SQLUSMALLINT") short value) { nsecond(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_TIME_STRUCT set(
        short hour,
        short minute,
        short second
    ) {
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
    public SQL_TIME_STRUCT set(SQL_TIME_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQL_TIME_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_TIME_STRUCT malloc() {
        return wrap(SQL_TIME_STRUCT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SQL_TIME_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_TIME_STRUCT calloc() {
        return wrap(SQL_TIME_STRUCT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SQL_TIME_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_TIME_STRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SQL_TIME_STRUCT.class, memAddress(container), container);
    }

    /** Returns a new {@code SQL_TIME_STRUCT} instance for the specified memory address. */
    public static SQL_TIME_STRUCT create(long address) {
        return wrap(SQL_TIME_STRUCT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_TIME_STRUCT createSafe(long address) {
        return address == NULL ? null : wrap(SQL_TIME_STRUCT.class, address);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIME_STRUCT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIME_STRUCT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_TIME_STRUCT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SQL_TIME_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_TIME_STRUCT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_TIME_STRUCT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_TIME_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQL_TIME_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_TIME_STRUCT malloc(MemoryStack stack) {
        return wrap(SQL_TIME_STRUCT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SQL_TIME_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_TIME_STRUCT calloc(MemoryStack stack) {
        return wrap(SQL_TIME_STRUCT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_TIME_STRUCT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_TIME_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_TIME_STRUCT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hour}. */
    public static short nhour(long struct) { return UNSAFE.getShort(null, struct + SQL_TIME_STRUCT.HOUR); }
    /** Unsafe version of {@link #minute}. */
    public static short nminute(long struct) { return UNSAFE.getShort(null, struct + SQL_TIME_STRUCT.MINUTE); }
    /** Unsafe version of {@link #second}. */
    public static short nsecond(long struct) { return UNSAFE.getShort(null, struct + SQL_TIME_STRUCT.SECOND); }

    /** Unsafe version of {@link #hour(short) hour}. */
    public static void nhour(long struct, short value) { UNSAFE.putShort(null, struct + SQL_TIME_STRUCT.HOUR, value); }
    /** Unsafe version of {@link #minute(short) minute}. */
    public static void nminute(long struct, short value) { UNSAFE.putShort(null, struct + SQL_TIME_STRUCT.MINUTE, value); }
    /** Unsafe version of {@link #second(short) second}. */
    public static void nsecond(long struct, short value) { UNSAFE.putShort(null, struct + SQL_TIME_STRUCT.SECOND, value); }

    // -----------------------------------

    /** An array of {@link SQL_TIME_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_TIME_STRUCT, Buffer> implements NativeResource {

        private static final SQL_TIME_STRUCT ELEMENT_FACTORY = SQL_TIME_STRUCT.create(-1L);

        /**
         * Creates a new {@code SQL_TIME_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_TIME_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_TIME_STRUCT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code hour} field. */
        @NativeType("SQLUSMALLINT")
        public short hour() { return SQL_TIME_STRUCT.nhour(address()); }
        /** @return the value of the {@code minute} field. */
        @NativeType("SQLUSMALLINT")
        public short minute() { return SQL_TIME_STRUCT.nminute(address()); }
        /** @return the value of the {@code second} field. */
        @NativeType("SQLUSMALLINT")
        public short second() { return SQL_TIME_STRUCT.nsecond(address()); }

        /** Sets the specified value to the {@code hour} field. */
        public SQL_TIME_STRUCT.Buffer hour(@NativeType("SQLUSMALLINT") short value) { SQL_TIME_STRUCT.nhour(address(), value); return this; }
        /** Sets the specified value to the {@code minute} field. */
        public SQL_TIME_STRUCT.Buffer minute(@NativeType("SQLUSMALLINT") short value) { SQL_TIME_STRUCT.nminute(address(), value); return this; }
        /** Sets the specified value to the {@code second} field. */
        public SQL_TIME_STRUCT.Buffer second(@NativeType("SQLUSMALLINT") short value) { SQL_TIME_STRUCT.nsecond(address(), value); return this; }

    }

}