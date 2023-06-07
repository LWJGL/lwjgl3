/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

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
 * union hb_var_num_t {
 *     float f;
 *     uint32_t u32;
 *     int32_t i32;
 *     uint16_t u16[2];
 *     int16_t i16[2];
 *     uint8_t u8[4];
 *     int8_t i8[4];
 * }</code></pre>
 */
public class hb_var_num_t extends Struct<hb_var_num_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        F,
        U32,
        I32,
        U16,
        I16,
        U8,
        I8;

    static {
        Layout layout = __union(
            __member(4),
            __member(4),
            __member(4),
            __array(2, 2),
            __array(2, 2),
            __array(1, 4),
            __array(1, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        F = layout.offsetof(0);
        U32 = layout.offsetof(1);
        I32 = layout.offsetof(2);
        U16 = layout.offsetof(3);
        I16 = layout.offsetof(4);
        U8 = layout.offsetof(5);
        I8 = layout.offsetof(6);
    }

    protected hb_var_num_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_var_num_t create(long address, @Nullable ByteBuffer container) {
        return new hb_var_num_t(address, container);
    }

    /**
     * Creates a {@code hb_var_num_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_var_num_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code f} field. */
    public float f() { return nf(address()); }
    /** @return the value of the {@code u32} field. */
    @NativeType("uint32_t")
    public int u32() { return nu32(address()); }
    /** @return the value of the {@code i32} field. */
    @NativeType("int32_t")
    public int i32() { return ni32(address()); }
    /** @return a {@link ShortBuffer} view of the {@code u16} field. */
    @NativeType("uint16_t[2]")
    public ShortBuffer u16() { return nu16(address()); }
    /** @return the value at the specified index of the {@code u16} field. */
    @NativeType("uint16_t")
    public short u16(int index) { return nu16(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code i16} field. */
    @NativeType("int16_t[2]")
    public ShortBuffer i16() { return ni16(address()); }
    /** @return the value at the specified index of the {@code i16} field. */
    @NativeType("int16_t")
    public short i16(int index) { return ni16(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code u8} field. */
    @NativeType("uint8_t[4]")
    public ByteBuffer u8() { return nu8(address()); }
    /** @return the value at the specified index of the {@code u8} field. */
    @NativeType("uint8_t")
    public byte u8(int index) { return nu8(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code i8} field. */
    @NativeType("int8_t[4]")
    public ByteBuffer i8() { return ni8(address()); }
    /** @return the value at the specified index of the {@code i8} field. */
    @NativeType("int8_t")
    public byte i8(int index) { return ni8(address(), index); }

    /** Sets the specified value to the {@code f} field. */
    public hb_var_num_t f(float value) { nf(address(), value); return this; }
    /** Sets the specified value to the {@code u32} field. */
    public hb_var_num_t u32(@NativeType("uint32_t") int value) { nu32(address(), value); return this; }
    /** Sets the specified value to the {@code i32} field. */
    public hb_var_num_t i32(@NativeType("int32_t") int value) { ni32(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code u16} field. */
    public hb_var_num_t u16(@NativeType("uint16_t[2]") ShortBuffer value) { nu16(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code u16} field. */
    public hb_var_num_t u16(int index, @NativeType("uint16_t") short value) { nu16(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code i16} field. */
    public hb_var_num_t i16(@NativeType("int16_t[2]") ShortBuffer value) { ni16(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code i16} field. */
    public hb_var_num_t i16(int index, @NativeType("int16_t") short value) { ni16(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code u8} field. */
    public hb_var_num_t u8(@NativeType("uint8_t[4]") ByteBuffer value) { nu8(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code u8} field. */
    public hb_var_num_t u8(int index, @NativeType("uint8_t") byte value) { nu8(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code i8} field. */
    public hb_var_num_t i8(@NativeType("int8_t[4]") ByteBuffer value) { ni8(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code i8} field. */
    public hb_var_num_t i8(int index, @NativeType("int8_t") byte value) { ni8(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_var_num_t set(hb_var_num_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_var_num_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_var_num_t malloc() {
        return new hb_var_num_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_var_num_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_var_num_t calloc() {
        return new hb_var_num_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_var_num_t} instance allocated with {@link BufferUtils}. */
    public static hb_var_num_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_var_num_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_var_num_t} instance for the specified memory address. */
    public static hb_var_num_t create(long address) {
        return new hb_var_num_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_var_num_t createSafe(long address) {
        return address == NULL ? null : new hb_var_num_t(address, null);
    }

    /**
     * Returns a new {@link hb_var_num_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_var_num_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_var_num_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_var_num_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_var_num_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_var_num_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_var_num_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_var_num_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_var_num_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_var_num_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_var_num_t malloc(MemoryStack stack) {
        return new hb_var_num_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_var_num_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_var_num_t calloc(MemoryStack stack) {
        return new hb_var_num_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_var_num_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_var_num_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_var_num_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_var_num_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #f}. */
    public static float nf(long struct) { return UNSAFE.getFloat(null, struct + hb_var_num_t.F); }
    /** Unsafe version of {@link #u32}. */
    public static int nu32(long struct) { return UNSAFE.getInt(null, struct + hb_var_num_t.U32); }
    /** Unsafe version of {@link #i32}. */
    public static int ni32(long struct) { return UNSAFE.getInt(null, struct + hb_var_num_t.I32); }
    /** Unsafe version of {@link #u16}. */
    public static ShortBuffer nu16(long struct) { return memShortBuffer(struct + hb_var_num_t.U16, 2); }
    /** Unsafe version of {@link #u16(int) u16}. */
    public static short nu16(long struct, int index) {
        return UNSAFE.getShort(null, struct + hb_var_num_t.U16 + check(index, 2) * 2);
    }
    /** Unsafe version of {@link #i16}. */
    public static ShortBuffer ni16(long struct) { return memShortBuffer(struct + hb_var_num_t.I16, 2); }
    /** Unsafe version of {@link #i16(int) i16}. */
    public static short ni16(long struct, int index) {
        return UNSAFE.getShort(null, struct + hb_var_num_t.I16 + check(index, 2) * 2);
    }
    /** Unsafe version of {@link #u8}. */
    public static ByteBuffer nu8(long struct) { return memByteBuffer(struct + hb_var_num_t.U8, 4); }
    /** Unsafe version of {@link #u8(int) u8}. */
    public static byte nu8(long struct, int index) {
        return UNSAFE.getByte(null, struct + hb_var_num_t.U8 + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #i8}. */
    public static ByteBuffer ni8(long struct) { return memByteBuffer(struct + hb_var_num_t.I8, 4); }
    /** Unsafe version of {@link #i8(int) i8}. */
    public static byte ni8(long struct, int index) {
        return UNSAFE.getByte(null, struct + hb_var_num_t.I8 + check(index, 4) * 1);
    }

    /** Unsafe version of {@link #f(float) f}. */
    public static void nf(long struct, float value) { UNSAFE.putFloat(null, struct + hb_var_num_t.F, value); }
    /** Unsafe version of {@link #u32(int) u32}. */
    public static void nu32(long struct, int value) { UNSAFE.putInt(null, struct + hb_var_num_t.U32, value); }
    /** Unsafe version of {@link #i32(int) i32}. */
    public static void ni32(long struct, int value) { UNSAFE.putInt(null, struct + hb_var_num_t.I32, value); }
    /** Unsafe version of {@link #u16(ShortBuffer) u16}. */
    public static void nu16(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + hb_var_num_t.U16, value.remaining() * 2);
    }
    /** Unsafe version of {@link #u16(int, short) u16}. */
    public static void nu16(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + hb_var_num_t.U16 + check(index, 2) * 2, value);
    }
    /** Unsafe version of {@link #i16(ShortBuffer) i16}. */
    public static void ni16(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + hb_var_num_t.I16, value.remaining() * 2);
    }
    /** Unsafe version of {@link #i16(int, short) i16}. */
    public static void ni16(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + hb_var_num_t.I16 + check(index, 2) * 2, value);
    }
    /** Unsafe version of {@link #u8(ByteBuffer) u8}. */
    public static void nu8(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + hb_var_num_t.U8, value.remaining() * 1);
    }
    /** Unsafe version of {@link #u8(int, byte) u8}. */
    public static void nu8(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + hb_var_num_t.U8 + check(index, 4) * 1, value);
    }
    /** Unsafe version of {@link #i8(ByteBuffer) i8}. */
    public static void ni8(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + hb_var_num_t.I8, value.remaining() * 1);
    }
    /** Unsafe version of {@link #i8(int, byte) i8}. */
    public static void ni8(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + hb_var_num_t.I8 + check(index, 4) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link hb_var_num_t} structs. */
    public static class Buffer extends StructBuffer<hb_var_num_t, Buffer> implements NativeResource {

        private static final hb_var_num_t ELEMENT_FACTORY = hb_var_num_t.create(-1L);

        /**
         * Creates a new {@code hb_var_num_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_var_num_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_var_num_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code f} field. */
        public float f() { return hb_var_num_t.nf(address()); }
        /** @return the value of the {@code u32} field. */
        @NativeType("uint32_t")
        public int u32() { return hb_var_num_t.nu32(address()); }
        /** @return the value of the {@code i32} field. */
        @NativeType("int32_t")
        public int i32() { return hb_var_num_t.ni32(address()); }
        /** @return a {@link ShortBuffer} view of the {@code u16} field. */
        @NativeType("uint16_t[2]")
        public ShortBuffer u16() { return hb_var_num_t.nu16(address()); }
        /** @return the value at the specified index of the {@code u16} field. */
        @NativeType("uint16_t")
        public short u16(int index) { return hb_var_num_t.nu16(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code i16} field. */
        @NativeType("int16_t[2]")
        public ShortBuffer i16() { return hb_var_num_t.ni16(address()); }
        /** @return the value at the specified index of the {@code i16} field. */
        @NativeType("int16_t")
        public short i16(int index) { return hb_var_num_t.ni16(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code u8} field. */
        @NativeType("uint8_t[4]")
        public ByteBuffer u8() { return hb_var_num_t.nu8(address()); }
        /** @return the value at the specified index of the {@code u8} field. */
        @NativeType("uint8_t")
        public byte u8(int index) { return hb_var_num_t.nu8(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code i8} field. */
        @NativeType("int8_t[4]")
        public ByteBuffer i8() { return hb_var_num_t.ni8(address()); }
        /** @return the value at the specified index of the {@code i8} field. */
        @NativeType("int8_t")
        public byte i8(int index) { return hb_var_num_t.ni8(address(), index); }

        /** Sets the specified value to the {@code f} field. */
        public hb_var_num_t.Buffer f(float value) { hb_var_num_t.nf(address(), value); return this; }
        /** Sets the specified value to the {@code u32} field. */
        public hb_var_num_t.Buffer u32(@NativeType("uint32_t") int value) { hb_var_num_t.nu32(address(), value); return this; }
        /** Sets the specified value to the {@code i32} field. */
        public hb_var_num_t.Buffer i32(@NativeType("int32_t") int value) { hb_var_num_t.ni32(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code u16} field. */
        public hb_var_num_t.Buffer u16(@NativeType("uint16_t[2]") ShortBuffer value) { hb_var_num_t.nu16(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code u16} field. */
        public hb_var_num_t.Buffer u16(int index, @NativeType("uint16_t") short value) { hb_var_num_t.nu16(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code i16} field. */
        public hb_var_num_t.Buffer i16(@NativeType("int16_t[2]") ShortBuffer value) { hb_var_num_t.ni16(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code i16} field. */
        public hb_var_num_t.Buffer i16(int index, @NativeType("int16_t") short value) { hb_var_num_t.ni16(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code u8} field. */
        public hb_var_num_t.Buffer u8(@NativeType("uint8_t[4]") ByteBuffer value) { hb_var_num_t.nu8(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code u8} field. */
        public hb_var_num_t.Buffer u8(int index, @NativeType("uint8_t") byte value) { hb_var_num_t.nu8(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code i8} field. */
        public hb_var_num_t.Buffer i8(@NativeType("int8_t[4]") ByteBuffer value) { hb_var_num_t.ni8(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code i8} field. */
        public hb_var_num_t.Buffer i8(int index, @NativeType("int8_t") byte value) { hb_var_num_t.ni8(address(), index, value); return this; }

    }

}