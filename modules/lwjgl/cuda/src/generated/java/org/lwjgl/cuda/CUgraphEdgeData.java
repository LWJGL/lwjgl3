/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

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
 * struct CUgraphEdgeData {
 *     unsigned char from_port;
 *     unsigned char to_port;
 *     unsigned char type;
 *     unsigned char reserved[5];
 * }</code></pre>
 */
public class CUgraphEdgeData extends Struct<CUgraphEdgeData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FROM_PORT,
        TO_PORT,
        TYPE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __array(1, 5)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FROM_PORT = layout.offsetof(0);
        TO_PORT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        RESERVED = layout.offsetof(3);
    }

    protected CUgraphEdgeData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUgraphEdgeData create(long address, @Nullable ByteBuffer container) {
        return new CUgraphEdgeData(address, container);
    }

    /**
     * Creates a {@code CUgraphEdgeData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUgraphEdgeData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code from_port} field. */
    @NativeType("unsigned char")
    public byte from_port() { return nfrom_port(address()); }
    /** @return the value of the {@code to_port} field. */
    @NativeType("unsigned char")
    public byte to_port() { return nto_port(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("unsigned char")
    public byte type() { return ntype(address()); }

    /** Sets the specified value to the {@code from_port} field. */
    public CUgraphEdgeData from_port(@NativeType("unsigned char") byte value) { nfrom_port(address(), value); return this; }
    /** Sets the specified value to the {@code to_port} field. */
    public CUgraphEdgeData to_port(@NativeType("unsigned char") byte value) { nto_port(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public CUgraphEdgeData type(@NativeType("unsigned char") byte value) { ntype(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUgraphEdgeData set(
        byte from_port,
        byte to_port,
        byte type
    ) {
        from_port(from_port);
        to_port(to_port);
        type(type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUgraphEdgeData set(CUgraphEdgeData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUgraphEdgeData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUgraphEdgeData malloc() {
        return new CUgraphEdgeData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUgraphEdgeData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUgraphEdgeData calloc() {
        return new CUgraphEdgeData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUgraphEdgeData} instance allocated with {@link BufferUtils}. */
    public static CUgraphEdgeData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUgraphEdgeData(memAddress(container), container);
    }

    /** Returns a new {@code CUgraphEdgeData} instance for the specified memory address. */
    public static CUgraphEdgeData create(long address) {
        return new CUgraphEdgeData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUgraphEdgeData createSafe(long address) {
        return address == NULL ? null : new CUgraphEdgeData(address, null);
    }

    /**
     * Returns a new {@link CUgraphEdgeData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphEdgeData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUgraphEdgeData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphEdgeData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUgraphEdgeData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphEdgeData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUgraphEdgeData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUgraphEdgeData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUgraphEdgeData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUgraphEdgeData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUgraphEdgeData malloc(MemoryStack stack) {
        return new CUgraphEdgeData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUgraphEdgeData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUgraphEdgeData calloc(MemoryStack stack) {
        return new CUgraphEdgeData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUgraphEdgeData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUgraphEdgeData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUgraphEdgeData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUgraphEdgeData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #from_port}. */
    public static byte nfrom_port(long struct) { return UNSAFE.getByte(null, struct + CUgraphEdgeData.FROM_PORT); }
    /** Unsafe version of {@link #to_port}. */
    public static byte nto_port(long struct) { return UNSAFE.getByte(null, struct + CUgraphEdgeData.TO_PORT); }
    /** Unsafe version of {@link #type}. */
    public static byte ntype(long struct) { return UNSAFE.getByte(null, struct + CUgraphEdgeData.TYPE); }
    public static ByteBuffer nreserved(long struct) { return memByteBuffer(struct + CUgraphEdgeData.RESERVED, 5); }
    public static byte nreserved(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUgraphEdgeData.RESERVED + check(index, 5) * 1);
    }

    /** Unsafe version of {@link #from_port(byte) from_port}. */
    public static void nfrom_port(long struct, byte value) { UNSAFE.putByte(null, struct + CUgraphEdgeData.FROM_PORT, value); }
    /** Unsafe version of {@link #to_port(byte) to_port}. */
    public static void nto_port(long struct, byte value) { UNSAFE.putByte(null, struct + CUgraphEdgeData.TO_PORT, value); }
    /** Unsafe version of {@link #type(byte) type}. */
    public static void ntype(long struct, byte value) { UNSAFE.putByte(null, struct + CUgraphEdgeData.TYPE, value); }
    public static void nreserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + CUgraphEdgeData.RESERVED, value.remaining() * 1);
    }
    public static void nreserved(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUgraphEdgeData.RESERVED + check(index, 5) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CUgraphEdgeData} structs. */
    public static class Buffer extends StructBuffer<CUgraphEdgeData, Buffer> implements NativeResource {

        private static final CUgraphEdgeData ELEMENT_FACTORY = CUgraphEdgeData.create(-1L);

        /**
         * Creates a new {@code CUgraphEdgeData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUgraphEdgeData#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUgraphEdgeData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code from_port} field. */
        @NativeType("unsigned char")
        public byte from_port() { return CUgraphEdgeData.nfrom_port(address()); }
        /** @return the value of the {@code to_port} field. */
        @NativeType("unsigned char")
        public byte to_port() { return CUgraphEdgeData.nto_port(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("unsigned char")
        public byte type() { return CUgraphEdgeData.ntype(address()); }

        /** Sets the specified value to the {@code from_port} field. */
        public CUgraphEdgeData.Buffer from_port(@NativeType("unsigned char") byte value) { CUgraphEdgeData.nfrom_port(address(), value); return this; }
        /** Sets the specified value to the {@code to_port} field. */
        public CUgraphEdgeData.Buffer to_port(@NativeType("unsigned char") byte value) { CUgraphEdgeData.nto_port(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public CUgraphEdgeData.Buffer type(@NativeType("unsigned char") byte value) { CUgraphEdgeData.ntype(address(), value); return this; }

    }

}