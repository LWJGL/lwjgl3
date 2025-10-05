/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_timespec {
 *     __u64 tv_sec;
 *     __u64 tv_nsec;
 * }}</pre>
 */
@NativeType("struct io_timespec")
public class IOTimespec extends Struct<IOTimespec> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TV_SEC,
        TV_NSEC;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TV_SEC = layout.offsetof(0);
        TV_NSEC = layout.offsetof(1);
    }

    protected IOTimespec(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOTimespec create(long address, @Nullable ByteBuffer container) {
        return new IOTimespec(address, container);
    }

    /**
     * Creates a {@code IOTimespec} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOTimespec(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code tv_sec} field. */
    @NativeType("__u64")
    public long tv_sec() { return ntv_sec(address()); }
    /** @return the value of the {@code tv_nsec} field. */
    @NativeType("__u64")
    public long tv_nsec() { return ntv_nsec(address()); }

    /** Sets the specified value to the {@code tv_sec} field. */
    public IOTimespec tv_sec(@NativeType("__u64") long value) { ntv_sec(address(), value); return this; }
    /** Sets the specified value to the {@code tv_nsec} field. */
    public IOTimespec tv_nsec(@NativeType("__u64") long value) { ntv_nsec(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOTimespec set(
        long tv_sec,
        long tv_nsec
    ) {
        tv_sec(tv_sec);
        tv_nsec(tv_nsec);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOTimespec set(IOTimespec src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOTimespec} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOTimespec malloc() {
        return new IOTimespec(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOTimespec} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOTimespec calloc() {
        return new IOTimespec(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOTimespec} instance allocated with {@link BufferUtils}. */
    public static IOTimespec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOTimespec(memAddress(container), container);
    }

    /** Returns a new {@code IOTimespec} instance for the specified memory address. */
    public static IOTimespec create(long address) {
        return new IOTimespec(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOTimespec createSafe(long address) {
        return address == NULL ? null : new IOTimespec(address, null);
    }

    /**
     * Returns a new {@link IOTimespec.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOTimespec.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOTimespec.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOTimespec.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOTimespec.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOTimespec.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOTimespec.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOTimespec.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOTimespec.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOTimespec} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOTimespec malloc(MemoryStack stack) {
        return new IOTimespec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOTimespec} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOTimespec calloc(MemoryStack stack) {
        return new IOTimespec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOTimespec.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOTimespec.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOTimespec.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOTimespec.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tv_sec}. */
    public static long ntv_sec(long struct) { return memGetLong(struct + IOTimespec.TV_SEC); }
    /** Unsafe version of {@link #tv_nsec}. */
    public static long ntv_nsec(long struct) { return memGetLong(struct + IOTimespec.TV_NSEC); }

    /** Unsafe version of {@link #tv_sec(long) tv_sec}. */
    public static void ntv_sec(long struct, long value) { memPutLong(struct + IOTimespec.TV_SEC, value); }
    /** Unsafe version of {@link #tv_nsec(long) tv_nsec}. */
    public static void ntv_nsec(long struct, long value) { memPutLong(struct + IOTimespec.TV_NSEC, value); }

    // -----------------------------------

    /** An array of {@link IOTimespec} structs. */
    public static class Buffer extends StructBuffer<IOTimespec, Buffer> implements NativeResource {

        private static final IOTimespec ELEMENT_FACTORY = IOTimespec.create(-1L);

        /**
         * Creates a new {@code IOTimespec.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOTimespec#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOTimespec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code tv_sec} field. */
        @NativeType("__u64")
        public long tv_sec() { return IOTimespec.ntv_sec(address()); }
        /** @return the value of the {@code tv_nsec} field. */
        @NativeType("__u64")
        public long tv_nsec() { return IOTimespec.ntv_nsec(address()); }

        /** Sets the specified value to the {@code tv_sec} field. */
        public IOTimespec.Buffer tv_sec(@NativeType("__u64") long value) { IOTimespec.ntv_sec(address(), value); return this; }
        /** Sets the specified value to the {@code tv_nsec} field. */
        public IOTimespec.Buffer tv_nsec(@NativeType("__u64") long value) { IOTimespec.ntv_nsec(address(), value); return this; }

    }

}