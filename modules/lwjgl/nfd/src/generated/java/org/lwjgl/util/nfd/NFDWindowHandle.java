/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct nfdwindowhandle_t {
 *     size_t type;
 *     void * handle;
 * }}</pre>
 */
@NativeType("struct nfdwindowhandle_t")
public class NFDWindowHandle extends Struct<NFDWindowHandle> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        HANDLE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
    }

    protected NFDWindowHandle(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NFDWindowHandle create(long address, @Nullable ByteBuffer container) {
        return new NFDWindowHandle(address, container);
    }

    /**
     * Creates a {@code NFDWindowHandle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NFDWindowHandle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("size_t")
    public long type() { return ntype(address()); }
    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }

    /** Sets the specified value to the {@code type} field. */
    public NFDWindowHandle type(@NativeType("size_t") long value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code handle} field. */
    public NFDWindowHandle handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NFDWindowHandle set(
        long type,
        long handle
    ) {
        type(type);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NFDWindowHandle set(NFDWindowHandle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NFDWindowHandle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NFDWindowHandle malloc() {
        return new NFDWindowHandle(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NFDWindowHandle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NFDWindowHandle calloc() {
        return new NFDWindowHandle(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NFDWindowHandle} instance allocated with {@link BufferUtils}. */
    public static NFDWindowHandle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NFDWindowHandle(memAddress(container), container);
    }

    /** Returns a new {@code NFDWindowHandle} instance for the specified memory address. */
    public static NFDWindowHandle create(long address) {
        return new NFDWindowHandle(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NFDWindowHandle createSafe(long address) {
        return address == NULL ? null : new NFDWindowHandle(address, null);
    }

    /**
     * Returns a new {@link NFDWindowHandle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDWindowHandle.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NFDWindowHandle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDWindowHandle.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDWindowHandle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NFDWindowHandle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NFDWindowHandle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NFDWindowHandle.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NFDWindowHandle.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NFDWindowHandle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDWindowHandle malloc(MemoryStack stack) {
        return new NFDWindowHandle(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NFDWindowHandle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDWindowHandle calloc(MemoryStack stack) {
        return new NFDWindowHandle(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NFDWindowHandle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDWindowHandle.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDWindowHandle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDWindowHandle.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static long ntype(long struct) { return memGetAddress(struct + NFDWindowHandle.TYPE); }
    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + NFDWindowHandle.HANDLE); }

    /** Unsafe version of {@link #type(long) type}. */
    public static void ntype(long struct, long value) { memPutAddress(struct + NFDWindowHandle.TYPE, value); }
    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + NFDWindowHandle.HANDLE, value); }

    // -----------------------------------

    /** An array of {@link NFDWindowHandle} structs. */
    public static class Buffer extends StructBuffer<NFDWindowHandle, Buffer> implements NativeResource {

        private static final NFDWindowHandle ELEMENT_FACTORY = NFDWindowHandle.create(-1L);

        /**
         * Creates a new {@code NFDWindowHandle.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NFDWindowHandle#SIZEOF}, and its mark will be undefined.</p>
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
        protected NFDWindowHandle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("size_t")
        public long type() { return NFDWindowHandle.ntype(address()); }
        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return NFDWindowHandle.nhandle(address()); }

        /** Sets the specified value to the {@code type} field. */
        public NFDWindowHandle.Buffer type(@NativeType("size_t") long value) { NFDWindowHandle.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code handle} field. */
        public NFDWindowHandle.Buffer handle(@NativeType("void *") long value) { NFDWindowHandle.nhandle(address(), value); return this; }

    }

}