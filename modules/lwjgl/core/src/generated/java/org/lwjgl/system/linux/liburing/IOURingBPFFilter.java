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
 * struct io_uring_bpf_filter {
 *     __u32 opcode;
 *     __u32 flags;
 *     __u32 filter_len;
 *     __u8 pdu_size;
 *     __u8 resv[3];
 *     __u64 filter_ptr;
 *     __u64 resv2[5];
 * }}</pre>
 */
@NativeType("struct io_uring_bpf_filter")
public class IOURingBPFFilter extends Struct<IOURingBPFFilter> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPCODE,
        FLAGS,
        FILTER_LEN,
        PDU_SIZE,
        RESV,
        FILTER_PTR,
        RESV2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __array(1, 3),
            __member(8),
            __array(8, 5)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPCODE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        FILTER_LEN = layout.offsetof(2);
        PDU_SIZE = layout.offsetof(3);
        RESV = layout.offsetof(4);
        FILTER_PTR = layout.offsetof(5);
        RESV2 = layout.offsetof(6);
    }

    protected IOURingBPFFilter(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingBPFFilter create(long address, @Nullable ByteBuffer container) {
        return new IOURingBPFFilter(address, container);
    }

    /**
     * Creates a {@code IOURingBPFFilter} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBPFFilter(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code opcode} field. */
    @NativeType("__u32")
    public int opcode() { return nopcode(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code filter_len} field. */
    @NativeType("__u32")
    public int filter_len() { return nfilter_len(address()); }
    /** @return the value of the {@code pdu_size} field. */
    @NativeType("__u8")
    public byte pdu_size() { return npdu_size(address()); }
    /** @return the value of the {@code filter_ptr} field. */
    @NativeType("__u64")
    public long filter_ptr() { return nfilter_ptr(address()); }

    /** Sets the specified value to the {@code opcode} field. */
    public IOURingBPFFilter opcode(@NativeType("__u32") int value) { nopcode(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingBPFFilter flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code filter_len} field. */
    public IOURingBPFFilter filter_len(@NativeType("__u32") int value) { nfilter_len(address(), value); return this; }
    /** Sets the specified value to the {@code pdu_size} field. */
    public IOURingBPFFilter pdu_size(@NativeType("__u8") byte value) { npdu_size(address(), value); return this; }
    /** Sets the specified value to the {@code filter_ptr} field. */
    public IOURingBPFFilter filter_ptr(@NativeType("__u64") long value) { nfilter_ptr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingBPFFilter set(
        int opcode,
        int flags,
        int filter_len,
        byte pdu_size,
        long filter_ptr
    ) {
        opcode(opcode);
        flags(flags);
        filter_len(filter_len);
        pdu_size(pdu_size);
        filter_ptr(filter_ptr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBPFFilter set(IOURingBPFFilter src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBPFFilter} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBPFFilter malloc() {
        return new IOURingBPFFilter(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingBPFFilter} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBPFFilter calloc() {
        return new IOURingBPFFilter(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingBPFFilter} instance allocated with {@link BufferUtils}. */
    public static IOURingBPFFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBPFFilter(memAddress(container), container);
    }

    /** Returns a new {@code IOURingBPFFilter} instance for the specified memory address. */
    public static IOURingBPFFilter create(long address) {
        return new IOURingBPFFilter(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingBPFFilter createSafe(long address) {
        return address == NULL ? null : new IOURingBPFFilter(address, null);
    }

    /**
     * Returns a new {@link IOURingBPFFilter.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPFFilter.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBPFFilter.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPFFilter.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBPFFilter.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBPFFilter.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingBPFFilter.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBPFFilter.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingBPFFilter.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingBPFFilter} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBPFFilter malloc(MemoryStack stack) {
        return new IOURingBPFFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingBPFFilter} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBPFFilter calloc(MemoryStack stack) {
        return new IOURingBPFFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingBPFFilter.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBPFFilter.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBPFFilter.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBPFFilter.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #opcode}. */
    public static int nopcode(long struct) { return memGetInt(struct + IOURingBPFFilter.OPCODE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingBPFFilter.FLAGS); }
    /** Unsafe version of {@link #filter_len}. */
    public static int nfilter_len(long struct) { return memGetInt(struct + IOURingBPFFilter.FILTER_LEN); }
    /** Unsafe version of {@link #pdu_size}. */
    public static byte npdu_size(long struct) { return memGetByte(struct + IOURingBPFFilter.PDU_SIZE); }
    static ByteBuffer nresv(long struct) { return memByteBuffer(struct + IOURingBPFFilter.RESV, 3); }
    static byte nresv(long struct, int index) {
        return memGetByte(struct + IOURingBPFFilter.RESV + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #filter_ptr}. */
    public static long nfilter_ptr(long struct) { return memGetLong(struct + IOURingBPFFilter.FILTER_PTR); }
    static LongBuffer nresv2(long struct) { return memLongBuffer(struct + IOURingBPFFilter.RESV2, 5); }
    static long nresv2(long struct, int index) {
        return memGetLong(struct + IOURingBPFFilter.RESV2 + check(index, 5) * 8);
    }

    /** Unsafe version of {@link #opcode(int) opcode}. */
    public static void nopcode(long struct, int value) { memPutInt(struct + IOURingBPFFilter.OPCODE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingBPFFilter.FLAGS, value); }
    /** Unsafe version of {@link #filter_len(int) filter_len}. */
    public static void nfilter_len(long struct, int value) { memPutInt(struct + IOURingBPFFilter.FILTER_LEN, value); }
    /** Unsafe version of {@link #pdu_size(byte) pdu_size}. */
    public static void npdu_size(long struct, byte value) { memPutByte(struct + IOURingBPFFilter.PDU_SIZE, value); }
    static void nresv(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingBPFFilter.RESV, value.remaining() * 1);
    }
    static void nresv(long struct, int index, byte value) {
        memPutByte(struct + IOURingBPFFilter.RESV + check(index, 3) * 1, value);
    }
    /** Unsafe version of {@link #filter_ptr(long) filter_ptr}. */
    public static void nfilter_ptr(long struct, long value) { memPutLong(struct + IOURingBPFFilter.FILTER_PTR, value); }
    static void nresv2(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + IOURingBPFFilter.RESV2, value.remaining() * 8);
    }
    static void nresv2(long struct, int index, long value) {
        memPutLong(struct + IOURingBPFFilter.RESV2 + check(index, 5) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingBPFFilter} structs. */
    public static class Buffer extends StructBuffer<IOURingBPFFilter, Buffer> implements NativeResource {

        private static final IOURingBPFFilter ELEMENT_FACTORY = IOURingBPFFilter.create(-1L);

        /**
         * Creates a new {@code IOURingBPFFilter.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBPFFilter#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingBPFFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code opcode} field. */
        @NativeType("__u32")
        public int opcode() { return IOURingBPFFilter.nopcode(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingBPFFilter.nflags(address()); }
        /** @return the value of the {@code filter_len} field. */
        @NativeType("__u32")
        public int filter_len() { return IOURingBPFFilter.nfilter_len(address()); }
        /** @return the value of the {@code pdu_size} field. */
        @NativeType("__u8")
        public byte pdu_size() { return IOURingBPFFilter.npdu_size(address()); }
        /** @return the value of the {@code filter_ptr} field. */
        @NativeType("__u64")
        public long filter_ptr() { return IOURingBPFFilter.nfilter_ptr(address()); }

        /** Sets the specified value to the {@code opcode} field. */
        public IOURingBPFFilter.Buffer opcode(@NativeType("__u32") int value) { IOURingBPFFilter.nopcode(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingBPFFilter.Buffer flags(@NativeType("__u32") int value) { IOURingBPFFilter.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code filter_len} field. */
        public IOURingBPFFilter.Buffer filter_len(@NativeType("__u32") int value) { IOURingBPFFilter.nfilter_len(address(), value); return this; }
        /** Sets the specified value to the {@code pdu_size} field. */
        public IOURingBPFFilter.Buffer pdu_size(@NativeType("__u8") byte value) { IOURingBPFFilter.npdu_size(address(), value); return this; }
        /** Sets the specified value to the {@code filter_ptr} field. */
        public IOURingBPFFilter.Buffer filter_ptr(@NativeType("__u64") long value) { IOURingBPFFilter.nfilter_ptr(address(), value); return this; }

    }

}