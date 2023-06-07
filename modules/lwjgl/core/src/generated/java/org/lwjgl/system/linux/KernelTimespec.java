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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct __kernel_timespec {
 *     int64_t {@link #tv_sec};
 *     long long {@link #tv_nsec};
 * }</code></pre>
 */
@NativeType("struct __kernel_timespec")
public class KernelTimespec extends Struct<KernelTimespec> implements NativeResource {

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

    protected KernelTimespec(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected KernelTimespec create(long address, @Nullable ByteBuffer container) {
        return new KernelTimespec(address, container);
    }

    /**
     * Creates a {@code KernelTimespec} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public KernelTimespec(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** seconds */
    @NativeType("int64_t")
    public long tv_sec() { return ntv_sec(address()); }
    /** nanoseconds */
    @NativeType("long long")
    public long tv_nsec() { return ntv_nsec(address()); }

    /** Sets the specified value to the {@link #tv_sec} field. */
    public KernelTimespec tv_sec(@NativeType("int64_t") long value) { ntv_sec(address(), value); return this; }
    /** Sets the specified value to the {@link #tv_nsec} field. */
    public KernelTimespec tv_nsec(@NativeType("long long") long value) { ntv_nsec(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public KernelTimespec set(
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
    public KernelTimespec set(KernelTimespec src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code KernelTimespec} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static KernelTimespec malloc() {
        return new KernelTimespec(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code KernelTimespec} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static KernelTimespec calloc() {
        return new KernelTimespec(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code KernelTimespec} instance allocated with {@link BufferUtils}. */
    public static KernelTimespec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new KernelTimespec(memAddress(container), container);
    }

    /** Returns a new {@code KernelTimespec} instance for the specified memory address. */
    public static KernelTimespec create(long address) {
        return new KernelTimespec(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static KernelTimespec createSafe(long address) {
        return address == NULL ? null : new KernelTimespec(address, null);
    }

    /**
     * Returns a new {@link KernelTimespec.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static KernelTimespec.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link KernelTimespec.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static KernelTimespec.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link KernelTimespec.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static KernelTimespec.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link KernelTimespec.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static KernelTimespec.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static KernelTimespec.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code KernelTimespec} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static KernelTimespec malloc(MemoryStack stack) {
        return new KernelTimespec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code KernelTimespec} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static KernelTimespec calloc(MemoryStack stack) {
        return new KernelTimespec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link KernelTimespec.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static KernelTimespec.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link KernelTimespec.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static KernelTimespec.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tv_sec}. */
    public static long ntv_sec(long struct) { return UNSAFE.getLong(null, struct + KernelTimespec.TV_SEC); }
    /** Unsafe version of {@link #tv_nsec}. */
    public static long ntv_nsec(long struct) { return UNSAFE.getLong(null, struct + KernelTimespec.TV_NSEC); }

    /** Unsafe version of {@link #tv_sec(long) tv_sec}. */
    public static void ntv_sec(long struct, long value) { UNSAFE.putLong(null, struct + KernelTimespec.TV_SEC, value); }
    /** Unsafe version of {@link #tv_nsec(long) tv_nsec}. */
    public static void ntv_nsec(long struct, long value) { UNSAFE.putLong(null, struct + KernelTimespec.TV_NSEC, value); }

    // -----------------------------------

    /** An array of {@link KernelTimespec} structs. */
    public static class Buffer extends StructBuffer<KernelTimespec, Buffer> implements NativeResource {

        private static final KernelTimespec ELEMENT_FACTORY = KernelTimespec.create(-1L);

        /**
         * Creates a new {@code KernelTimespec.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link KernelTimespec#SIZEOF}, and its mark will be undefined.</p>
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
        protected KernelTimespec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link KernelTimespec#tv_sec} field. */
        @NativeType("int64_t")
        public long tv_sec() { return KernelTimespec.ntv_sec(address()); }
        /** @return the value of the {@link KernelTimespec#tv_nsec} field. */
        @NativeType("long long")
        public long tv_nsec() { return KernelTimespec.ntv_nsec(address()); }

        /** Sets the specified value to the {@link KernelTimespec#tv_sec} field. */
        public KernelTimespec.Buffer tv_sec(@NativeType("int64_t") long value) { KernelTimespec.ntv_sec(address(), value); return this; }
        /** Sets the specified value to the {@link KernelTimespec#tv_nsec} field. */
        public KernelTimespec.Buffer tv_nsec(@NativeType("long long") long value) { KernelTimespec.ntv_nsec(address(), value); return this; }

    }

}