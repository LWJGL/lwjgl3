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
 * struct io_uring_zcrx_ifq_reg {
 *     __u32 if_idx;
 *     __u32 if_rxq;
 *     __u32 rq_entries;
 *     __u32 flags;
 *     __u64 area_ptr;
 *     __u64 region_ptr;
 *     {@link IOURingZCRXOffsets struct io_uring_zcrx_offsets} offsets;
 *     __u32 zcrx_id;
 *     __u32 __resv2;
 *     __u64 __resv[3];
 * }}</pre>
 */
@NativeType("struct io_uring_zcrx_ifq_reg")
public class IOURingZCRXIfqReg extends Struct<IOURingZCRXIfqReg> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IF_IDX,
        IF_RXQ,
        RQ_ENTRIES,
        FLAGS,
        AREA_PTR,
        REGION_PTR,
        OFFSETS,
        ZCRX_ID,
        __RESV2,
        __RESV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(IOURingZCRXOffsets.SIZEOF, IOURingZCRXOffsets.ALIGNOF),
            __member(4),
            __member(4),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IF_IDX = layout.offsetof(0);
        IF_RXQ = layout.offsetof(1);
        RQ_ENTRIES = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        AREA_PTR = layout.offsetof(4);
        REGION_PTR = layout.offsetof(5);
        OFFSETS = layout.offsetof(6);
        ZCRX_ID = layout.offsetof(7);
        __RESV2 = layout.offsetof(8);
        __RESV = layout.offsetof(9);
    }

    protected IOURingZCRXIfqReg(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXIfqReg create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXIfqReg(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXIfqReg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXIfqReg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code if_idx} field. */
    @NativeType("__u32")
    public int if_idx() { return nif_idx(address()); }
    /** @return the value of the {@code if_rxq} field. */
    @NativeType("__u32")
    public int if_rxq() { return nif_rxq(address()); }
    /** @return the value of the {@code rq_entries} field. */
    @NativeType("__u32")
    public int rq_entries() { return nrq_entries(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code area_ptr} field. */
    @NativeType("__u64")
    public long area_ptr() { return narea_ptr(address()); }
    /** @return the value of the {@code region_ptr} field. */
    @NativeType("__u64")
    public long region_ptr() { return nregion_ptr(address()); }
    /** @return a {@link IOURingZCRXOffsets} view of the {@code offsets} field. */
    @NativeType("struct io_uring_zcrx_offsets")
    public IOURingZCRXOffsets offsets() { return noffsets(address()); }
    /** @return the value of the {@code zcrx_id} field. */
    @NativeType("__u32")
    public int zcrx_id() { return nzcrx_id(address()); }

    /** Sets the specified value to the {@code if_idx} field. */
    public IOURingZCRXIfqReg if_idx(@NativeType("__u32") int value) { nif_idx(address(), value); return this; }
    /** Sets the specified value to the {@code if_rxq} field. */
    public IOURingZCRXIfqReg if_rxq(@NativeType("__u32") int value) { nif_rxq(address(), value); return this; }
    /** Sets the specified value to the {@code rq_entries} field. */
    public IOURingZCRXIfqReg rq_entries(@NativeType("__u32") int value) { nrq_entries(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingZCRXIfqReg flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code area_ptr} field. */
    public IOURingZCRXIfqReg area_ptr(@NativeType("__u64") long value) { narea_ptr(address(), value); return this; }
    /** Sets the specified value to the {@code region_ptr} field. */
    public IOURingZCRXIfqReg region_ptr(@NativeType("__u64") long value) { nregion_ptr(address(), value); return this; }
    /** Copies the specified {@link IOURingZCRXOffsets} to the {@code offsets} field. */
    public IOURingZCRXIfqReg offsets(@NativeType("struct io_uring_zcrx_offsets") IOURingZCRXOffsets value) { noffsets(address(), value); return this; }
    /** Passes the {@code offsets} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingZCRXIfqReg offsets(java.util.function.Consumer<IOURingZCRXOffsets> consumer) { consumer.accept(offsets()); return this; }
    /** Sets the specified value to the {@code zcrx_id} field. */
    public IOURingZCRXIfqReg zcrx_id(@NativeType("__u32") int value) { nzcrx_id(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingZCRXIfqReg set(
        int if_idx,
        int if_rxq,
        int rq_entries,
        int flags,
        long area_ptr,
        long region_ptr,
        IOURingZCRXOffsets offsets,
        int zcrx_id
    ) {
        if_idx(if_idx);
        if_rxq(if_rxq);
        rq_entries(rq_entries);
        flags(flags);
        area_ptr(area_ptr);
        region_ptr(region_ptr);
        offsets(offsets);
        zcrx_id(zcrx_id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXIfqReg set(IOURingZCRXIfqReg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXIfqReg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXIfqReg malloc() {
        return new IOURingZCRXIfqReg(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXIfqReg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXIfqReg calloc() {
        return new IOURingZCRXIfqReg(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXIfqReg} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXIfqReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXIfqReg(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXIfqReg} instance for the specified memory address. */
    public static IOURingZCRXIfqReg create(long address) {
        return new IOURingZCRXIfqReg(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXIfqReg createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXIfqReg(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXIfqReg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXIfqReg.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXIfqReg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXIfqReg.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXIfqReg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXIfqReg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXIfqReg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXIfqReg.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXIfqReg.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXIfqReg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXIfqReg malloc(MemoryStack stack) {
        return new IOURingZCRXIfqReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXIfqReg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXIfqReg calloc(MemoryStack stack) {
        return new IOURingZCRXIfqReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXIfqReg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXIfqReg.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXIfqReg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXIfqReg.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #if_idx}. */
    public static int nif_idx(long struct) { return memGetInt(struct + IOURingZCRXIfqReg.IF_IDX); }
    /** Unsafe version of {@link #if_rxq}. */
    public static int nif_rxq(long struct) { return memGetInt(struct + IOURingZCRXIfqReg.IF_RXQ); }
    /** Unsafe version of {@link #rq_entries}. */
    public static int nrq_entries(long struct) { return memGetInt(struct + IOURingZCRXIfqReg.RQ_ENTRIES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingZCRXIfqReg.FLAGS); }
    /** Unsafe version of {@link #area_ptr}. */
    public static long narea_ptr(long struct) { return memGetLong(struct + IOURingZCRXIfqReg.AREA_PTR); }
    /** Unsafe version of {@link #region_ptr}. */
    public static long nregion_ptr(long struct) { return memGetLong(struct + IOURingZCRXIfqReg.REGION_PTR); }
    /** Unsafe version of {@link #offsets}. */
    public static IOURingZCRXOffsets noffsets(long struct) { return IOURingZCRXOffsets.create(struct + IOURingZCRXIfqReg.OFFSETS); }
    /** Unsafe version of {@link #zcrx_id}. */
    public static int nzcrx_id(long struct) { return memGetInt(struct + IOURingZCRXIfqReg.ZCRX_ID); }
    public static int n__resv2(long struct) { return memGetInt(struct + IOURingZCRXIfqReg.__RESV2); }
    public static LongBuffer n__resv(long struct) { return memLongBuffer(struct + IOURingZCRXIfqReg.__RESV, 3); }
    public static long n__resv(long struct, int index) {
        return memGetLong(struct + IOURingZCRXIfqReg.__RESV + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #if_idx(int) if_idx}. */
    public static void nif_idx(long struct, int value) { memPutInt(struct + IOURingZCRXIfqReg.IF_IDX, value); }
    /** Unsafe version of {@link #if_rxq(int) if_rxq}. */
    public static void nif_rxq(long struct, int value) { memPutInt(struct + IOURingZCRXIfqReg.IF_RXQ, value); }
    /** Unsafe version of {@link #rq_entries(int) rq_entries}. */
    public static void nrq_entries(long struct, int value) { memPutInt(struct + IOURingZCRXIfqReg.RQ_ENTRIES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingZCRXIfqReg.FLAGS, value); }
    /** Unsafe version of {@link #area_ptr(long) area_ptr}. */
    public static void narea_ptr(long struct, long value) { memPutLong(struct + IOURingZCRXIfqReg.AREA_PTR, value); }
    /** Unsafe version of {@link #region_ptr(long) region_ptr}. */
    public static void nregion_ptr(long struct, long value) { memPutLong(struct + IOURingZCRXIfqReg.REGION_PTR, value); }
    /** Unsafe version of {@link #offsets(IOURingZCRXOffsets) offsets}. */
    public static void noffsets(long struct, IOURingZCRXOffsets value) { memCopy(value.address(), struct + IOURingZCRXIfqReg.OFFSETS, IOURingZCRXOffsets.SIZEOF); }
    /** Unsafe version of {@link #zcrx_id(int) zcrx_id}. */
    public static void nzcrx_id(long struct, int value) { memPutInt(struct + IOURingZCRXIfqReg.ZCRX_ID, value); }
    public static void n__resv2(long struct, int value) { memPutInt(struct + IOURingZCRXIfqReg.__RESV2, value); }
    public static void n__resv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingZCRXIfqReg.__RESV, value.remaining() * 8);
    }
    public static void n__resv(long struct, int index, long value) {
        memPutLong(struct + IOURingZCRXIfqReg.__RESV + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingZCRXIfqReg} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXIfqReg, Buffer> implements NativeResource {

        private static final IOURingZCRXIfqReg ELEMENT_FACTORY = IOURingZCRXIfqReg.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXIfqReg.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXIfqReg#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXIfqReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code if_idx} field. */
        @NativeType("__u32")
        public int if_idx() { return IOURingZCRXIfqReg.nif_idx(address()); }
        /** @return the value of the {@code if_rxq} field. */
        @NativeType("__u32")
        public int if_rxq() { return IOURingZCRXIfqReg.nif_rxq(address()); }
        /** @return the value of the {@code rq_entries} field. */
        @NativeType("__u32")
        public int rq_entries() { return IOURingZCRXIfqReg.nrq_entries(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingZCRXIfqReg.nflags(address()); }
        /** @return the value of the {@code area_ptr} field. */
        @NativeType("__u64")
        public long area_ptr() { return IOURingZCRXIfqReg.narea_ptr(address()); }
        /** @return the value of the {@code region_ptr} field. */
        @NativeType("__u64")
        public long region_ptr() { return IOURingZCRXIfqReg.nregion_ptr(address()); }
        /** @return a {@link IOURingZCRXOffsets} view of the {@code offsets} field. */
        @NativeType("struct io_uring_zcrx_offsets")
        public IOURingZCRXOffsets offsets() { return IOURingZCRXIfqReg.noffsets(address()); }
        /** @return the value of the {@code zcrx_id} field. */
        @NativeType("__u32")
        public int zcrx_id() { return IOURingZCRXIfqReg.nzcrx_id(address()); }

        /** Sets the specified value to the {@code if_idx} field. */
        public IOURingZCRXIfqReg.Buffer if_idx(@NativeType("__u32") int value) { IOURingZCRXIfqReg.nif_idx(address(), value); return this; }
        /** Sets the specified value to the {@code if_rxq} field. */
        public IOURingZCRXIfqReg.Buffer if_rxq(@NativeType("__u32") int value) { IOURingZCRXIfqReg.nif_rxq(address(), value); return this; }
        /** Sets the specified value to the {@code rq_entries} field. */
        public IOURingZCRXIfqReg.Buffer rq_entries(@NativeType("__u32") int value) { IOURingZCRXIfqReg.nrq_entries(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingZCRXIfqReg.Buffer flags(@NativeType("__u32") int value) { IOURingZCRXIfqReg.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code area_ptr} field. */
        public IOURingZCRXIfqReg.Buffer area_ptr(@NativeType("__u64") long value) { IOURingZCRXIfqReg.narea_ptr(address(), value); return this; }
        /** Sets the specified value to the {@code region_ptr} field. */
        public IOURingZCRXIfqReg.Buffer region_ptr(@NativeType("__u64") long value) { IOURingZCRXIfqReg.nregion_ptr(address(), value); return this; }
        /** Copies the specified {@link IOURingZCRXOffsets} to the {@code offsets} field. */
        public IOURingZCRXIfqReg.Buffer offsets(@NativeType("struct io_uring_zcrx_offsets") IOURingZCRXOffsets value) { IOURingZCRXIfqReg.noffsets(address(), value); return this; }
        /** Passes the {@code offsets} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingZCRXIfqReg.Buffer offsets(java.util.function.Consumer<IOURingZCRXOffsets> consumer) { consumer.accept(offsets()); return this; }
        /** Sets the specified value to the {@code zcrx_id} field. */
        public IOURingZCRXIfqReg.Buffer zcrx_id(@NativeType("__u32") int value) { IOURingZCRXIfqReg.nzcrx_id(address(), value); return this; }

    }

}