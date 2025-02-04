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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_mem_region_reg {
 *     __u64 region_uptr;
 *     __u64 flags;
 *     __u64 __resv[2];
 * }}</pre>
 */
@NativeType("struct io_uring_mem_region_reg")
public class IOURingMemRegionReg extends Struct<IOURingMemRegionReg> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REGION_UPTR,
        FLAGS,
        __RESV;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __array(8, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REGION_UPTR = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        __RESV = layout.offsetof(2);
    }

    protected IOURingMemRegionReg(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingMemRegionReg create(long address, @Nullable ByteBuffer container) {
        return new IOURingMemRegionReg(address, container);
    }

    /**
     * Creates a {@code IOURingMemRegionReg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingMemRegionReg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code region_uptr} field. */
    @NativeType("__u64")
    public long region_uptr() { return nregion_uptr(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u64")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code region_uptr} field. */
    public IOURingMemRegionReg region_uptr(@NativeType("__u64") long value) { nregion_uptr(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingMemRegionReg flags(@NativeType("__u64") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingMemRegionReg set(
        long region_uptr,
        long flags
    ) {
        region_uptr(region_uptr);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingMemRegionReg set(IOURingMemRegionReg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingMemRegionReg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingMemRegionReg malloc() {
        return new IOURingMemRegionReg(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingMemRegionReg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingMemRegionReg calloc() {
        return new IOURingMemRegionReg(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingMemRegionReg} instance allocated with {@link BufferUtils}. */
    public static IOURingMemRegionReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingMemRegionReg(memAddress(container), container);
    }

    /** Returns a new {@code IOURingMemRegionReg} instance for the specified memory address. */
    public static IOURingMemRegionReg create(long address) {
        return new IOURingMemRegionReg(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingMemRegionReg createSafe(long address) {
        return address == NULL ? null : new IOURingMemRegionReg(address, null);
    }

    /**
     * Returns a new {@link IOURingMemRegionReg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingMemRegionReg.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingMemRegionReg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingMemRegionReg.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingMemRegionReg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingMemRegionReg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingMemRegionReg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingMemRegionReg.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingMemRegionReg.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingMemRegionReg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingMemRegionReg malloc(MemoryStack stack) {
        return new IOURingMemRegionReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingMemRegionReg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingMemRegionReg calloc(MemoryStack stack) {
        return new IOURingMemRegionReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingMemRegionReg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingMemRegionReg.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingMemRegionReg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingMemRegionReg.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #region_uptr}. */
    public static long nregion_uptr(long struct) { return memGetLong(struct + IOURingMemRegionReg.REGION_UPTR); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + IOURingMemRegionReg.FLAGS); }
    public static LongBuffer n__resv(long struct) { return memLongBuffer(struct + IOURingMemRegionReg.__RESV, 2); }
    public static long n__resv(long struct, int index) {
        return memGetLong(struct + IOURingMemRegionReg.__RESV + check(index, 2) * 8);
    }

    /** Unsafe version of {@link #region_uptr(long) region_uptr}. */
    public static void nregion_uptr(long struct, long value) { memPutLong(struct + IOURingMemRegionReg.REGION_UPTR, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + IOURingMemRegionReg.FLAGS, value); }
    public static void n__resv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + IOURingMemRegionReg.__RESV, value.remaining() * 8);
    }
    public static void n__resv(long struct, int index, long value) {
        memPutLong(struct + IOURingMemRegionReg.__RESV + check(index, 2) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingMemRegionReg} structs. */
    public static class Buffer extends StructBuffer<IOURingMemRegionReg, Buffer> implements NativeResource {

        private static final IOURingMemRegionReg ELEMENT_FACTORY = IOURingMemRegionReg.create(-1L);

        /**
         * Creates a new {@code IOURingMemRegionReg.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingMemRegionReg#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingMemRegionReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code region_uptr} field. */
        @NativeType("__u64")
        public long region_uptr() { return IOURingMemRegionReg.nregion_uptr(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u64")
        public long flags() { return IOURingMemRegionReg.nflags(address()); }

        /** Sets the specified value to the {@code region_uptr} field. */
        public IOURingMemRegionReg.Buffer region_uptr(@NativeType("__u64") long value) { IOURingMemRegionReg.nregion_uptr(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingMemRegionReg.Buffer flags(@NativeType("__u64") long value) { IOURingMemRegionReg.nflags(address(), value); return this; }

    }

}