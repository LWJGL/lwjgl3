/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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
 * struct FMOD_GUID {
 *     unsigned int Data1;
 *     unsigned short Data2;
 *     unsigned short Data3;
 *     unsigned char Data4[8];
 * }</code></pre>
 */
public class FMOD_GUID extends Struct<FMOD_GUID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA1,
        DATA2,
        DATA3,
        DATA4;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __array(1, 8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA1 = layout.offsetof(0);
        DATA2 = layout.offsetof(1);
        DATA3 = layout.offsetof(2);
        DATA4 = layout.offsetof(3);
    }

    protected FMOD_GUID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_GUID create(long address, @Nullable ByteBuffer container) {
        return new FMOD_GUID(address, container);
    }

    /**
     * Creates a {@code FMOD_GUID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_GUID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Data1} field. */
    @NativeType("unsigned int")
    public int Data1() { return nData1(address()); }
    /** @return the value of the {@code Data2} field. */
    @NativeType("unsigned short")
    public short Data2() { return nData2(address()); }
    /** @return the value of the {@code Data3} field. */
    @NativeType("unsigned short")
    public short Data3() { return nData3(address()); }
    /** @return a {@link ByteBuffer} view of the {@code Data4} field. */
    @NativeType("unsigned char[8]")
    public ByteBuffer Data4() { return nData4(address()); }
    /** @return the value at the specified index of the {@code Data4} field. */
    @NativeType("unsigned char")
    public byte Data4(int index) { return nData4(address(), index); }

    /** Sets the specified value to the {@code Data1} field. */
    public FMOD_GUID Data1(@NativeType("unsigned int") int value) { nData1(address(), value); return this; }
    /** Sets the specified value to the {@code Data2} field. */
    public FMOD_GUID Data2(@NativeType("unsigned short") short value) { nData2(address(), value); return this; }
    /** Sets the specified value to the {@code Data3} field. */
    public FMOD_GUID Data3(@NativeType("unsigned short") short value) { nData3(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code Data4} field. */
    public FMOD_GUID Data4(@NativeType("unsigned char[8]") ByteBuffer value) { nData4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code Data4} field. */
    public FMOD_GUID Data4(int index, @NativeType("unsigned char") byte value) { nData4(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_GUID set(
        int Data1,
        short Data2,
        short Data3,
        ByteBuffer Data4
    ) {
        Data1(Data1);
        Data2(Data2);
        Data3(Data3);
        Data4(Data4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_GUID set(FMOD_GUID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_GUID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_GUID malloc() {
        return new FMOD_GUID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_GUID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_GUID calloc() {
        return new FMOD_GUID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_GUID} instance allocated with {@link BufferUtils}. */
    public static FMOD_GUID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_GUID(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_GUID} instance for the specified memory address. */
    public static FMOD_GUID create(long address) {
        return new FMOD_GUID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_GUID createSafe(long address) {
        return address == NULL ? null : new FMOD_GUID(address, null);
    }

    /**
     * Returns a new {@link FMOD_GUID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_GUID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_GUID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_GUID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_GUID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_GUID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_GUID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_GUID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_GUID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_GUID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_GUID malloc(MemoryStack stack) {
        return new FMOD_GUID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_GUID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_GUID calloc(MemoryStack stack) {
        return new FMOD_GUID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_GUID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_GUID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_GUID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_GUID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Data1}. */
    public static int nData1(long struct) { return UNSAFE.getInt(null, struct + FMOD_GUID.DATA1); }
    /** Unsafe version of {@link #Data2}. */
    public static short nData2(long struct) { return UNSAFE.getShort(null, struct + FMOD_GUID.DATA2); }
    /** Unsafe version of {@link #Data3}. */
    public static short nData3(long struct) { return UNSAFE.getShort(null, struct + FMOD_GUID.DATA3); }
    /** Unsafe version of {@link #Data4}. */
    public static ByteBuffer nData4(long struct) { return memByteBuffer(struct + FMOD_GUID.DATA4, 8); }
    /** Unsafe version of {@link #Data4(int) Data4}. */
    public static byte nData4(long struct, int index) {
        return UNSAFE.getByte(null, struct + FMOD_GUID.DATA4 + check(index, 8) * 1);
    }

    /** Unsafe version of {@link #Data1(int) Data1}. */
    public static void nData1(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_GUID.DATA1, value); }
    /** Unsafe version of {@link #Data2(short) Data2}. */
    public static void nData2(long struct, short value) { UNSAFE.putShort(null, struct + FMOD_GUID.DATA2, value); }
    /** Unsafe version of {@link #Data3(short) Data3}. */
    public static void nData3(long struct, short value) { UNSAFE.putShort(null, struct + FMOD_GUID.DATA3, value); }
    /** Unsafe version of {@link #Data4(ByteBuffer) Data4}. */
    public static void nData4(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(memAddress(value), struct + FMOD_GUID.DATA4, value.remaining() * 1);
    }
    /** Unsafe version of {@link #Data4(int, byte) Data4}. */
    public static void nData4(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + FMOD_GUID.DATA4 + check(index, 8) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link FMOD_GUID} structs. */
    public static class Buffer extends StructBuffer<FMOD_GUID, Buffer> implements NativeResource {

        private static final FMOD_GUID ELEMENT_FACTORY = FMOD_GUID.create(-1L);

        /**
         * Creates a new {@code FMOD_GUID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_GUID#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_GUID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Data1} field. */
        @NativeType("unsigned int")
        public int Data1() { return FMOD_GUID.nData1(address()); }
        /** @return the value of the {@code Data2} field. */
        @NativeType("unsigned short")
        public short Data2() { return FMOD_GUID.nData2(address()); }
        /** @return the value of the {@code Data3} field. */
        @NativeType("unsigned short")
        public short Data3() { return FMOD_GUID.nData3(address()); }
        /** @return a {@link ByteBuffer} view of the {@code Data4} field. */
        @NativeType("unsigned char[8]")
        public ByteBuffer Data4() { return FMOD_GUID.nData4(address()); }
        /** @return the value at the specified index of the {@code Data4} field. */
        @NativeType("unsigned char")
        public byte Data4(int index) { return FMOD_GUID.nData4(address(), index); }

        /** Sets the specified value to the {@code Data1} field. */
        public FMOD_GUID.Buffer Data1(@NativeType("unsigned int") int value) { FMOD_GUID.nData1(address(), value); return this; }
        /** Sets the specified value to the {@code Data2} field. */
        public FMOD_GUID.Buffer Data2(@NativeType("unsigned short") short value) { FMOD_GUID.nData2(address(), value); return this; }
        /** Sets the specified value to the {@code Data3} field. */
        public FMOD_GUID.Buffer Data3(@NativeType("unsigned short") short value) { FMOD_GUID.nData3(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code Data4} field. */
        public FMOD_GUID.Buffer Data4(@NativeType("unsigned char[8]") ByteBuffer value) { FMOD_GUID.nData4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code Data4} field. */
        public FMOD_GUID.Buffer Data4(int index, @NativeType("unsigned char") byte value) { FMOD_GUID.nData4(address(), index, value); return this; }

    }

}