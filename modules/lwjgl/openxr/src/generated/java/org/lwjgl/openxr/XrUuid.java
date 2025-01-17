/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.XR11.*;

/**
 * <pre>{@code
 * struct XrUuid {
 *     uint8_t data[XR_UUID_SIZE];
 * }}</pre>
 */
public class XrUuid extends Struct<XrUuid> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __array(1, XR_UUID_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    protected XrUuid(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrUuid create(long address, @Nullable ByteBuffer container) {
        return new XrUuid(address, container);
    }

    /**
     * Creates a {@code XrUuid} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrUuid(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code data} field. */
    @NativeType("uint8_t[XR_UUID_SIZE]")
    public ByteBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    @NativeType("uint8_t")
    public byte data(int index) { return ndata(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code data} field. */
    public XrUuid data(@NativeType("uint8_t[XR_UUID_SIZE]") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data} field. */
    public XrUuid data(int index, @NativeType("uint8_t") byte value) { ndata(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrUuid set(XrUuid src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrUuid} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrUuid malloc() {
        return new XrUuid(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrUuid} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrUuid calloc() {
        return new XrUuid(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrUuid} instance allocated with {@link BufferUtils}. */
    public static XrUuid create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrUuid(memAddress(container), container);
    }

    /** Returns a new {@code XrUuid} instance for the specified memory address. */
    public static XrUuid create(long address) {
        return new XrUuid(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrUuid createSafe(long address) {
        return address == NULL ? null : new XrUuid(address, null);
    }

    /**
     * Returns a new {@link XrUuid.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuid.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrUuid.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuid.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuid.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuid.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrUuid.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrUuid.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrUuid.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrUuid} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuid malloc(MemoryStack stack) {
        return new XrUuid(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrUuid} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuid calloc(MemoryStack stack) {
        return new XrUuid(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrUuid.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuid.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuid.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuid.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(struct + XrUuid.DATA, XR_UUID_SIZE); }
    /** Unsafe version of {@link #data(int) data}. */
    public static byte ndata(long struct, int index) {
        return memGetByte(struct + XrUuid.DATA + check(index, XR_UUID_SIZE) * 1);
    }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, XR_UUID_SIZE); }
        memCopy(memAddress(value), struct + XrUuid.DATA, value.remaining() * 1);
    }
    /** Unsafe version of {@link #data(int, byte) data}. */
    public static void ndata(long struct, int index, byte value) {
        memPutByte(struct + XrUuid.DATA + check(index, XR_UUID_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link XrUuid} structs. */
    public static class Buffer extends StructBuffer<XrUuid, Buffer> implements NativeResource {

        private static final XrUuid ELEMENT_FACTORY = XrUuid.create(-1L);

        /**
         * Creates a new {@code XrUuid.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrUuid#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrUuid getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code data} field. */
        @NativeType("uint8_t[XR_UUID_SIZE]")
        public ByteBuffer data() { return XrUuid.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        @NativeType("uint8_t")
        public byte data(int index) { return XrUuid.ndata(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code data} field. */
        public XrUuid.Buffer data(@NativeType("uint8_t[XR_UUID_SIZE]") ByteBuffer value) { XrUuid.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data} field. */
        public XrUuid.Buffer data(int index, @NativeType("uint8_t") byte value) { XrUuid.ndata(address(), index, value); return this; }

    }

}