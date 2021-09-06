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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.odbc.SQL.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SQL_NUMERIC_STRUCT {
 *     SQLCHAR precision;
 *     SQLSCHAR scale;
 *     SQLCHAR sign;
 *     SQLCHAR val[SQL_MAX_NUMERIC_LEN];
 * }</code></pre>
 */
public class SQL_NUMERIC_STRUCT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRECISION,
        SCALE,
        SIGN,
        VAL;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __array(1, SQL_MAX_NUMERIC_LEN)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRECISION = layout.offsetof(0);
        SCALE = layout.offsetof(1);
        SIGN = layout.offsetof(2);
        VAL = layout.offsetof(3);
    }

    /**
     * Creates a {@code SQL_NUMERIC_STRUCT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SQL_NUMERIC_STRUCT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code precision} field. */
    @NativeType("SQLCHAR")
    public byte precision() { return nprecision(address()); }
    /** @return the value of the {@code scale} field. */
    @NativeType("SQLSCHAR")
    public byte scale() { return nscale(address()); }
    /** @return the value of the {@code sign} field. */
    @NativeType("SQLCHAR")
    public byte sign() { return nsign(address()); }
    /** @return a {@link ByteBuffer} view of the {@code val} field. */
    @NativeType("SQLCHAR[SQL_MAX_NUMERIC_LEN]")
    public ByteBuffer val() { return nval(address()); }
    /** @return the value at the specified index of the {@code val} field. */
    @NativeType("SQLCHAR")
    public byte val(int index) { return nval(address(), index); }

    /** Sets the specified value to the {@code precision} field. */
    public SQL_NUMERIC_STRUCT precision(@NativeType("SQLCHAR") byte value) { nprecision(address(), value); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public SQL_NUMERIC_STRUCT scale(@NativeType("SQLSCHAR") byte value) { nscale(address(), value); return this; }
    /** Sets the specified value to the {@code sign} field. */
    public SQL_NUMERIC_STRUCT sign(@NativeType("SQLCHAR") byte value) { nsign(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code val} field. */
    public SQL_NUMERIC_STRUCT val(@NativeType("SQLCHAR[SQL_MAX_NUMERIC_LEN]") ByteBuffer value) { nval(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code val} field. */
    public SQL_NUMERIC_STRUCT val(int index, @NativeType("SQLCHAR") byte value) { nval(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SQL_NUMERIC_STRUCT set(
        byte precision,
        byte scale,
        byte sign,
        ByteBuffer val
    ) {
        precision(precision);
        scale(scale);
        sign(sign);
        val(val);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SQL_NUMERIC_STRUCT set(SQL_NUMERIC_STRUCT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SQL_NUMERIC_STRUCT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SQL_NUMERIC_STRUCT malloc() {
        return wrap(SQL_NUMERIC_STRUCT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SQL_NUMERIC_STRUCT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SQL_NUMERIC_STRUCT calloc() {
        return wrap(SQL_NUMERIC_STRUCT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SQL_NUMERIC_STRUCT} instance allocated with {@link BufferUtils}. */
    public static SQL_NUMERIC_STRUCT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SQL_NUMERIC_STRUCT.class, memAddress(container), container);
    }

    /** Returns a new {@code SQL_NUMERIC_STRUCT} instance for the specified memory address. */
    public static SQL_NUMERIC_STRUCT create(long address) {
        return wrap(SQL_NUMERIC_STRUCT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_NUMERIC_STRUCT createSafe(long address) {
        return address == NULL ? null : wrap(SQL_NUMERIC_STRUCT.class, address);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_NUMERIC_STRUCT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_NUMERIC_STRUCT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SQL_NUMERIC_STRUCT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SQL_NUMERIC_STRUCT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SQL_NUMERIC_STRUCT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SQL_NUMERIC_STRUCT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static SQL_NUMERIC_STRUCT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code SQL_NUMERIC_STRUCT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_NUMERIC_STRUCT malloc(MemoryStack stack) {
        return wrap(SQL_NUMERIC_STRUCT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SQL_NUMERIC_STRUCT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SQL_NUMERIC_STRUCT calloc(MemoryStack stack) {
        return wrap(SQL_NUMERIC_STRUCT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_NUMERIC_STRUCT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SQL_NUMERIC_STRUCT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SQL_NUMERIC_STRUCT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #precision}. */
    public static byte nprecision(long struct) { return UNSAFE.getByte(null, struct + SQL_NUMERIC_STRUCT.PRECISION); }
    /** Unsafe version of {@link #scale}. */
    public static byte nscale(long struct) { return UNSAFE.getByte(null, struct + SQL_NUMERIC_STRUCT.SCALE); }
    /** Unsafe version of {@link #sign}. */
    public static byte nsign(long struct) { return UNSAFE.getByte(null, struct + SQL_NUMERIC_STRUCT.SIGN); }
    /** Unsafe version of {@link #val}. */
    public static ByteBuffer nval(long struct) { return memByteBuffer(struct + SQL_NUMERIC_STRUCT.VAL, SQL_MAX_NUMERIC_LEN); }
    /** Unsafe version of {@link #val(int) val}. */
    public static byte nval(long struct, int index) {
        return UNSAFE.getByte(null, struct + SQL_NUMERIC_STRUCT.VAL + check(index, SQL_MAX_NUMERIC_LEN) * 1);
    }

    /** Unsafe version of {@link #precision(byte) precision}. */
    public static void nprecision(long struct, byte value) { UNSAFE.putByte(null, struct + SQL_NUMERIC_STRUCT.PRECISION, value); }
    /** Unsafe version of {@link #scale(byte) scale}. */
    public static void nscale(long struct, byte value) { UNSAFE.putByte(null, struct + SQL_NUMERIC_STRUCT.SCALE, value); }
    /** Unsafe version of {@link #sign(byte) sign}. */
    public static void nsign(long struct, byte value) { UNSAFE.putByte(null, struct + SQL_NUMERIC_STRUCT.SIGN, value); }
    /** Unsafe version of {@link #val(ByteBuffer) val}. */
    public static void nval(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, SQL_MAX_NUMERIC_LEN); }
        memCopy(memAddress(value), struct + SQL_NUMERIC_STRUCT.VAL, value.remaining() * 1);
    }
    /** Unsafe version of {@link #val(int, byte) val}. */
    public static void nval(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + SQL_NUMERIC_STRUCT.VAL + check(index, SQL_MAX_NUMERIC_LEN) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link SQL_NUMERIC_STRUCT} structs. */
    public static class Buffer extends StructBuffer<SQL_NUMERIC_STRUCT, Buffer> implements NativeResource {

        private static final SQL_NUMERIC_STRUCT ELEMENT_FACTORY = SQL_NUMERIC_STRUCT.create(-1L);

        /**
         * Creates a new {@code SQL_NUMERIC_STRUCT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SQL_NUMERIC_STRUCT#SIZEOF}, and its mark will be undefined.
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
        protected SQL_NUMERIC_STRUCT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code precision} field. */
        @NativeType("SQLCHAR")
        public byte precision() { return SQL_NUMERIC_STRUCT.nprecision(address()); }
        /** @return the value of the {@code scale} field. */
        @NativeType("SQLSCHAR")
        public byte scale() { return SQL_NUMERIC_STRUCT.nscale(address()); }
        /** @return the value of the {@code sign} field. */
        @NativeType("SQLCHAR")
        public byte sign() { return SQL_NUMERIC_STRUCT.nsign(address()); }
        /** @return a {@link ByteBuffer} view of the {@code val} field. */
        @NativeType("SQLCHAR[SQL_MAX_NUMERIC_LEN]")
        public ByteBuffer val() { return SQL_NUMERIC_STRUCT.nval(address()); }
        /** @return the value at the specified index of the {@code val} field. */
        @NativeType("SQLCHAR")
        public byte val(int index) { return SQL_NUMERIC_STRUCT.nval(address(), index); }

        /** Sets the specified value to the {@code precision} field. */
        public SQL_NUMERIC_STRUCT.Buffer precision(@NativeType("SQLCHAR") byte value) { SQL_NUMERIC_STRUCT.nprecision(address(), value); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public SQL_NUMERIC_STRUCT.Buffer scale(@NativeType("SQLSCHAR") byte value) { SQL_NUMERIC_STRUCT.nscale(address(), value); return this; }
        /** Sets the specified value to the {@code sign} field. */
        public SQL_NUMERIC_STRUCT.Buffer sign(@NativeType("SQLCHAR") byte value) { SQL_NUMERIC_STRUCT.nsign(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code val} field. */
        public SQL_NUMERIC_STRUCT.Buffer val(@NativeType("SQLCHAR[SQL_MAX_NUMERIC_LEN]") ByteBuffer value) { SQL_NUMERIC_STRUCT.nval(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code val} field. */
        public SQL_NUMERIC_STRUCT.Buffer val(int index, @NativeType("SQLCHAR") byte value) { SQL_NUMERIC_STRUCT.nval(address(), index, value); return this; }

    }

}