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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Timestamp structure for the timestamps in {@code struct statx}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct statx_timestamp {
 *     __s64 {@link #tv_sec};
 *     __u32 {@link #tv_nsec};
 *     __s32 __reserved;
 * }</code></pre>
 */
@NativeType("struct statx_timestamp")
public class StatxTimestamp extends Struct<StatxTimestamp> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TV_SEC,
        TV_NSEC,
        __RESERVED;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TV_SEC = layout.offsetof(0);
        TV_NSEC = layout.offsetof(1);
        __RESERVED = layout.offsetof(2);
    }

    protected StatxTimestamp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StatxTimestamp create(long address, @Nullable ByteBuffer container) {
        return new StatxTimestamp(address, container);
    }

    /**
     * Creates a {@code StatxTimestamp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StatxTimestamp(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of seconds before (negative) or after (positive) {@code 00:00:00 1st January 1970 UTC} */
    @NativeType("__s64")
    public long tv_sec() { return ntv_sec(address()); }
    /** a number of nanoseconds (0..999,999,999) after the {@code tv_sec} time */
    @NativeType("__u32")
    public int tv_nsec() { return ntv_nsec(address()); }

    /** Sets the specified value to the {@link #tv_sec} field. */
    public StatxTimestamp tv_sec(@NativeType("__s64") long value) { ntv_sec(address(), value); return this; }
    /** Sets the specified value to the {@link #tv_nsec} field. */
    public StatxTimestamp tv_nsec(@NativeType("__u32") int value) { ntv_nsec(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StatxTimestamp set(
        long tv_sec,
        int tv_nsec
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
    public StatxTimestamp set(StatxTimestamp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StatxTimestamp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StatxTimestamp malloc() {
        return new StatxTimestamp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StatxTimestamp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StatxTimestamp calloc() {
        return new StatxTimestamp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StatxTimestamp} instance allocated with {@link BufferUtils}. */
    public static StatxTimestamp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StatxTimestamp(memAddress(container), container);
    }

    /** Returns a new {@code StatxTimestamp} instance for the specified memory address. */
    public static StatxTimestamp create(long address) {
        return new StatxTimestamp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StatxTimestamp createSafe(long address) {
        return address == NULL ? null : new StatxTimestamp(address, null);
    }

    /**
     * Returns a new {@link StatxTimestamp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StatxTimestamp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StatxTimestamp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StatxTimestamp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StatxTimestamp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StatxTimestamp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StatxTimestamp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StatxTimestamp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StatxTimestamp.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StatxTimestamp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StatxTimestamp malloc(MemoryStack stack) {
        return new StatxTimestamp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StatxTimestamp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StatxTimestamp calloc(MemoryStack stack) {
        return new StatxTimestamp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StatxTimestamp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StatxTimestamp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StatxTimestamp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StatxTimestamp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tv_sec}. */
    public static long ntv_sec(long struct) { return UNSAFE.getLong(null, struct + StatxTimestamp.TV_SEC); }
    /** Unsafe version of {@link #tv_nsec}. */
    public static int ntv_nsec(long struct) { return UNSAFE.getInt(null, struct + StatxTimestamp.TV_NSEC); }
    public static int n__reserved(long struct) { return UNSAFE.getInt(null, struct + StatxTimestamp.__RESERVED); }

    /** Unsafe version of {@link #tv_sec(long) tv_sec}. */
    public static void ntv_sec(long struct, long value) { UNSAFE.putLong(null, struct + StatxTimestamp.TV_SEC, value); }
    /** Unsafe version of {@link #tv_nsec(int) tv_nsec}. */
    public static void ntv_nsec(long struct, int value) { UNSAFE.putInt(null, struct + StatxTimestamp.TV_NSEC, value); }
    public static void n__reserved(long struct, int value) { UNSAFE.putInt(null, struct + StatxTimestamp.__RESERVED, value); }

    // -----------------------------------

    /** An array of {@link StatxTimestamp} structs. */
    public static class Buffer extends StructBuffer<StatxTimestamp, Buffer> implements NativeResource {

        private static final StatxTimestamp ELEMENT_FACTORY = StatxTimestamp.create(-1L);

        /**
         * Creates a new {@code StatxTimestamp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StatxTimestamp#SIZEOF}, and its mark will be undefined.</p>
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
        protected StatxTimestamp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link StatxTimestamp#tv_sec} field. */
        @NativeType("__s64")
        public long tv_sec() { return StatxTimestamp.ntv_sec(address()); }
        /** @return the value of the {@link StatxTimestamp#tv_nsec} field. */
        @NativeType("__u32")
        public int tv_nsec() { return StatxTimestamp.ntv_nsec(address()); }

        /** Sets the specified value to the {@link StatxTimestamp#tv_sec} field. */
        public StatxTimestamp.Buffer tv_sec(@NativeType("__s64") long value) { StatxTimestamp.ntv_sec(address(), value); return this; }
        /** Sets the specified value to the {@link StatxTimestamp#tv_nsec} field. */
        public StatxTimestamp.Buffer tv_nsec(@NativeType("__u32") int value) { StatxTimestamp.ntv_nsec(address(), value); return this; }

    }

}