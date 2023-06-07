/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

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
 * struct cmsghdr {
 *     socklen_t {@link #cmsg_len};
 *     int {@link #cmsg_level};
 *     int {@link #cmsg_type};
 *     char cmsg_data[0];
 * }</code></pre>
 */
@NativeType("struct cmsghdr")
public class CMsghdr extends Struct<CMsghdr> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CMSG_LEN,
        CMSG_LEVEL,
        CMSG_TYPE,
        CMSG_DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __array(1, 0)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CMSG_LEN = layout.offsetof(0);
        CMSG_LEVEL = layout.offsetof(1);
        CMSG_TYPE = layout.offsetof(2);
        CMSG_DATA = layout.offsetof(3);
    }

    protected CMsghdr(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CMsghdr create(long address, @Nullable ByteBuffer container) {
        return new CMsghdr(address, container);
    }

    /**
     * Creates a {@code CMsghdr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CMsghdr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** data byte count, including header */
    @NativeType("socklen_t")
    public int cmsg_len() { return ncmsg_len(address()); }
    /** originating protocol */
    public int cmsg_level() { return ncmsg_level(address()); }
    /** protocol-specific type */
    public int cmsg_type() { return ncmsg_type(address()); }
    /** @return a {@link ByteBuffer} view of the {@code cmsg_data} field. */
    @NativeType("char[0]")
    public ByteBuffer cmsg_data() { return ncmsg_data(address()); }
    /** @return the value at the specified index of the {@code cmsg_data} field. */
    @NativeType("char")
    public byte cmsg_data(int index) { return ncmsg_data(address(), index); }

    /** Sets the specified value to the {@link #cmsg_len} field. */
    public CMsghdr cmsg_len(@NativeType("socklen_t") int value) { ncmsg_len(address(), value); return this; }
    /** Sets the specified value to the {@link #cmsg_level} field. */
    public CMsghdr cmsg_level(int value) { ncmsg_level(address(), value); return this; }
    /** Sets the specified value to the {@link #cmsg_type} field. */
    public CMsghdr cmsg_type(int value) { ncmsg_type(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cmsg_data} field. */
    public CMsghdr cmsg_data(@NativeType("char[0]") ByteBuffer value) { ncmsg_data(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cmsg_data} field. */
    public CMsghdr cmsg_data(int index, @NativeType("char") byte value) { ncmsg_data(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CMsghdr set(
        int cmsg_len,
        int cmsg_level,
        int cmsg_type,
        ByteBuffer cmsg_data
    ) {
        cmsg_len(cmsg_len);
        cmsg_level(cmsg_level);
        cmsg_type(cmsg_type);
        cmsg_data(cmsg_data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CMsghdr set(CMsghdr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CMsghdr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CMsghdr malloc() {
        return new CMsghdr(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CMsghdr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CMsghdr calloc() {
        return new CMsghdr(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CMsghdr} instance allocated with {@link BufferUtils}. */
    public static CMsghdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CMsghdr(memAddress(container), container);
    }

    /** Returns a new {@code CMsghdr} instance for the specified memory address. */
    public static CMsghdr create(long address) {
        return new CMsghdr(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CMsghdr createSafe(long address) {
        return address == NULL ? null : new CMsghdr(address, null);
    }

    /**
     * Returns a new {@link CMsghdr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CMsghdr.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CMsghdr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CMsghdr.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CMsghdr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CMsghdr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CMsghdr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CMsghdr.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CMsghdr.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CMsghdr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CMsghdr malloc(MemoryStack stack) {
        return new CMsghdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CMsghdr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CMsghdr calloc(MemoryStack stack) {
        return new CMsghdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CMsghdr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CMsghdr.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CMsghdr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CMsghdr.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cmsg_len}. */
    public static int ncmsg_len(long struct) { return UNSAFE.getInt(null, struct + CMsghdr.CMSG_LEN); }
    /** Unsafe version of {@link #cmsg_level}. */
    public static int ncmsg_level(long struct) { return UNSAFE.getInt(null, struct + CMsghdr.CMSG_LEVEL); }
    /** Unsafe version of {@link #cmsg_type}. */
    public static int ncmsg_type(long struct) { return UNSAFE.getInt(null, struct + CMsghdr.CMSG_TYPE); }
    /** Unsafe version of {@link #cmsg_data}. */
    public static ByteBuffer ncmsg_data(long struct) { return memByteBuffer(struct + CMsghdr.CMSG_DATA, 0); }
    /** Unsafe version of {@link #cmsg_data(int) cmsg_data}. */
    public static byte ncmsg_data(long struct, int index) {
        return UNSAFE.getByte(null, struct + CMsghdr.CMSG_DATA + check(index, 0) * 1);
    }

    /** Unsafe version of {@link #cmsg_len(int) cmsg_len}. */
    public static void ncmsg_len(long struct, int value) { UNSAFE.putInt(null, struct + CMsghdr.CMSG_LEN, value); }
    /** Unsafe version of {@link #cmsg_level(int) cmsg_level}. */
    public static void ncmsg_level(long struct, int value) { UNSAFE.putInt(null, struct + CMsghdr.CMSG_LEVEL, value); }
    /** Unsafe version of {@link #cmsg_type(int) cmsg_type}. */
    public static void ncmsg_type(long struct, int value) { UNSAFE.putInt(null, struct + CMsghdr.CMSG_TYPE, value); }
    /** Unsafe version of {@link #cmsg_data(ByteBuffer) cmsg_data}. */
    public static void ncmsg_data(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 0); }
        memCopy(memAddress(value), struct + CMsghdr.CMSG_DATA, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cmsg_data(int, byte) cmsg_data}. */
    public static void ncmsg_data(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CMsghdr.CMSG_DATA + check(index, 0) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CMsghdr} structs. */
    public static class Buffer extends StructBuffer<CMsghdr, Buffer> implements NativeResource {

        private static final CMsghdr ELEMENT_FACTORY = CMsghdr.create(-1L);

        /**
         * Creates a new {@code CMsghdr.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CMsghdr#SIZEOF}, and its mark will be undefined.</p>
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
        protected CMsghdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CMsghdr#cmsg_len} field. */
        @NativeType("socklen_t")
        public int cmsg_len() { return CMsghdr.ncmsg_len(address()); }
        /** @return the value of the {@link CMsghdr#cmsg_level} field. */
        public int cmsg_level() { return CMsghdr.ncmsg_level(address()); }
        /** @return the value of the {@link CMsghdr#cmsg_type} field. */
        public int cmsg_type() { return CMsghdr.ncmsg_type(address()); }
        /** @return a {@link ByteBuffer} view of the {@code cmsg_data} field. */
        @NativeType("char[0]")
        public ByteBuffer cmsg_data() { return CMsghdr.ncmsg_data(address()); }
        /** @return the value at the specified index of the {@code cmsg_data} field. */
        @NativeType("char")
        public byte cmsg_data(int index) { return CMsghdr.ncmsg_data(address(), index); }

        /** Sets the specified value to the {@link CMsghdr#cmsg_len} field. */
        public CMsghdr.Buffer cmsg_len(@NativeType("socklen_t") int value) { CMsghdr.ncmsg_len(address(), value); return this; }
        /** Sets the specified value to the {@link CMsghdr#cmsg_level} field. */
        public CMsghdr.Buffer cmsg_level(int value) { CMsghdr.ncmsg_level(address(), value); return this; }
        /** Sets the specified value to the {@link CMsghdr#cmsg_type} field. */
        public CMsghdr.Buffer cmsg_type(int value) { CMsghdr.ncmsg_type(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cmsg_data} field. */
        public CMsghdr.Buffer cmsg_data(@NativeType("char[0]") ByteBuffer value) { CMsghdr.ncmsg_data(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cmsg_data} field. */
        public CMsghdr.Buffer cmsg_data(int index, @NativeType("char") byte value) { CMsghdr.ncmsg_data(address(), index, value); return this; }

    }

}