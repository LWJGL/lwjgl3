/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Argument for {@link LibIOURing#IORING_REGISTER_FILE_ALLOC_RANGE REGISTER_FILE_ALLOC_RANGE}.
 * 
 * <p>The range is specified as {@code [off, off + len)}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_file_index_range {
 *     __u32 off;
 *     __u32 len;
 *     __u64 resv;
 * }</code></pre>
 */
@NativeType("struct io_uring_file_index_range")
public class IOURingFileIndexRange extends Struct<IOURingFileIndexRange> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFF,
        LEN,
        RESV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFF = layout.offsetof(0);
        LEN = layout.offsetof(1);
        RESV = layout.offsetof(2);
    }

    protected IOURingFileIndexRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingFileIndexRange create(long address, @Nullable ByteBuffer container) {
        return new IOURingFileIndexRange(address, container);
    }

    /**
     * Creates a {@code IOURingFileIndexRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingFileIndexRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code off} field. */
    @NativeType("__u32")
    public int off() { return noff(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("__u32")
    public int len() { return nlen(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u64")
    public long resv() { return nresv(address()); }

    /** Sets the specified value to the {@code off} field. */
    public IOURingFileIndexRange off(@NativeType("__u32") int value) { noff(address(), value); return this; }
    /** Sets the specified value to the {@code len} field. */
    public IOURingFileIndexRange len(@NativeType("__u32") int value) { nlen(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingFileIndexRange resv(@NativeType("__u64") long value) { nresv(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingFileIndexRange set(
        int off,
        int len,
        long resv
    ) {
        off(off);
        len(len);
        resv(resv);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingFileIndexRange set(IOURingFileIndexRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingFileIndexRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingFileIndexRange malloc() {
        return new IOURingFileIndexRange(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingFileIndexRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingFileIndexRange calloc() {
        return new IOURingFileIndexRange(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingFileIndexRange} instance allocated with {@link BufferUtils}. */
    public static IOURingFileIndexRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingFileIndexRange(memAddress(container), container);
    }

    /** Returns a new {@code IOURingFileIndexRange} instance for the specified memory address. */
    public static IOURingFileIndexRange create(long address) {
        return new IOURingFileIndexRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingFileIndexRange createSafe(long address) {
        return address == NULL ? null : new IOURingFileIndexRange(address, null);
    }

    /**
     * Returns a new {@link IOURingFileIndexRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingFileIndexRange.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingFileIndexRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingFileIndexRange.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingFileIndexRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingFileIndexRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingFileIndexRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingFileIndexRange.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingFileIndexRange.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingFileIndexRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingFileIndexRange malloc(MemoryStack stack) {
        return new IOURingFileIndexRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingFileIndexRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingFileIndexRange calloc(MemoryStack stack) {
        return new IOURingFileIndexRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingFileIndexRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingFileIndexRange.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingFileIndexRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingFileIndexRange.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #off}. */
    public static int noff(long struct) { return UNSAFE.getInt(null, struct + IOURingFileIndexRange.OFF); }
    /** Unsafe version of {@link #len}. */
    public static int nlen(long struct) { return UNSAFE.getInt(null, struct + IOURingFileIndexRange.LEN); }
    /** Unsafe version of {@link #resv}. */
    public static long nresv(long struct) { return UNSAFE.getLong(null, struct + IOURingFileIndexRange.RESV); }

    /** Unsafe version of {@link #off(int) off}. */
    public static void noff(long struct, int value) { UNSAFE.putInt(null, struct + IOURingFileIndexRange.OFF, value); }
    /** Unsafe version of {@link #len(int) len}. */
    public static void nlen(long struct, int value) { UNSAFE.putInt(null, struct + IOURingFileIndexRange.LEN, value); }
    /** Unsafe version of {@link #resv(long) resv}. */
    public static void nresv(long struct, long value) { UNSAFE.putLong(null, struct + IOURingFileIndexRange.RESV, value); }

    // -----------------------------------

    /** An array of {@link IOURingFileIndexRange} structs. */
    public static class Buffer extends StructBuffer<IOURingFileIndexRange, Buffer> implements NativeResource {

        private static final IOURingFileIndexRange ELEMENT_FACTORY = IOURingFileIndexRange.create(-1L);

        /**
         * Creates a new {@code IOURingFileIndexRange.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingFileIndexRange#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingFileIndexRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code off} field. */
        @NativeType("__u32")
        public int off() { return IOURingFileIndexRange.noff(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("__u32")
        public int len() { return IOURingFileIndexRange.nlen(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u64")
        public long resv() { return IOURingFileIndexRange.nresv(address()); }

        /** Sets the specified value to the {@code off} field. */
        public IOURingFileIndexRange.Buffer off(@NativeType("__u32") int value) { IOURingFileIndexRange.noff(address(), value); return this; }
        /** Sets the specified value to the {@code len} field. */
        public IOURingFileIndexRange.Buffer len(@NativeType("__u32") int value) { IOURingFileIndexRange.nlen(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingFileIndexRange.Buffer resv(@NativeType("__u64") long value) { IOURingFileIndexRange.nresv(address(), value); return this; }

    }

}