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
 * struct io_uring_query_opcode {
 *     __u32 nr_request_opcodes;
 *     __u32 nr_register_opcodes;
 *     __u64 feature_flags;
 *     __u64 ring_setup_flags;
 *     __u64 enter_flags;
 *     __u64 sqe_flags;
 * }}</pre>
 */
@NativeType("struct io_uring_query_opcode")
public class IOURingQueryOpcode extends Struct<IOURingQueryOpcode> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NR_REQUEST_OPCODES,
        NR_REGISTER_OPCODES,
        FEATURE_FLAGS,
        RING_SETUP_FLAGS,
        ENTER_FLAGS,
        SQE_FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NR_REQUEST_OPCODES = layout.offsetof(0);
        NR_REGISTER_OPCODES = layout.offsetof(1);
        FEATURE_FLAGS = layout.offsetof(2);
        RING_SETUP_FLAGS = layout.offsetof(3);
        ENTER_FLAGS = layout.offsetof(4);
        SQE_FLAGS = layout.offsetof(5);
    }

    protected IOURingQueryOpcode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingQueryOpcode create(long address, @Nullable ByteBuffer container) {
        return new IOURingQueryOpcode(address, container);
    }

    /**
     * Creates a {@code IOURingQueryOpcode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingQueryOpcode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code nr_request_opcodes} field. */
    @NativeType("__u32")
    public int nr_request_opcodes() { return nnr_request_opcodes(address()); }
    /** @return the value of the {@code nr_register_opcodes} field. */
    @NativeType("__u32")
    public int nr_register_opcodes() { return nnr_register_opcodes(address()); }
    /** @return the value of the {@code feature_flags} field. */
    @NativeType("__u64")
    public long feature_flags() { return nfeature_flags(address()); }
    /** @return the value of the {@code ring_setup_flags} field. */
    @NativeType("__u64")
    public long ring_setup_flags() { return nring_setup_flags(address()); }
    /** @return the value of the {@code enter_flags} field. */
    @NativeType("__u64")
    public long enter_flags() { return nenter_flags(address()); }
    /** @return the value of the {@code sqe_flags} field. */
    @NativeType("__u64")
    public long sqe_flags() { return nsqe_flags(address()); }

    /** Sets the specified value to the {@code nr_request_opcodes} field. */
    public IOURingQueryOpcode nr_request_opcodes(@NativeType("__u32") int value) { nnr_request_opcodes(address(), value); return this; }
    /** Sets the specified value to the {@code nr_register_opcodes} field. */
    public IOURingQueryOpcode nr_register_opcodes(@NativeType("__u32") int value) { nnr_register_opcodes(address(), value); return this; }
    /** Sets the specified value to the {@code feature_flags} field. */
    public IOURingQueryOpcode feature_flags(@NativeType("__u64") long value) { nfeature_flags(address(), value); return this; }
    /** Sets the specified value to the {@code ring_setup_flags} field. */
    public IOURingQueryOpcode ring_setup_flags(@NativeType("__u64") long value) { nring_setup_flags(address(), value); return this; }
    /** Sets the specified value to the {@code enter_flags} field. */
    public IOURingQueryOpcode enter_flags(@NativeType("__u64") long value) { nenter_flags(address(), value); return this; }
    /** Sets the specified value to the {@code sqe_flags} field. */
    public IOURingQueryOpcode sqe_flags(@NativeType("__u64") long value) { nsqe_flags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingQueryOpcode set(
        int nr_request_opcodes,
        int nr_register_opcodes,
        long feature_flags,
        long ring_setup_flags,
        long enter_flags,
        long sqe_flags
    ) {
        nr_request_opcodes(nr_request_opcodes);
        nr_register_opcodes(nr_register_opcodes);
        feature_flags(feature_flags);
        ring_setup_flags(ring_setup_flags);
        enter_flags(enter_flags);
        sqe_flags(sqe_flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingQueryOpcode set(IOURingQueryOpcode src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingQueryOpcode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingQueryOpcode malloc() {
        return new IOURingQueryOpcode(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingQueryOpcode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingQueryOpcode calloc() {
        return new IOURingQueryOpcode(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingQueryOpcode} instance allocated with {@link BufferUtils}. */
    public static IOURingQueryOpcode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingQueryOpcode(memAddress(container), container);
    }

    /** Returns a new {@code IOURingQueryOpcode} instance for the specified memory address. */
    public static IOURingQueryOpcode create(long address) {
        return new IOURingQueryOpcode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingQueryOpcode createSafe(long address) {
        return address == NULL ? null : new IOURingQueryOpcode(address, null);
    }

    /**
     * Returns a new {@link IOURingQueryOpcode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingQueryOpcode.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingQueryOpcode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingQueryOpcode.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingQueryOpcode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingQueryOpcode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingQueryOpcode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingQueryOpcode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingQueryOpcode.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingQueryOpcode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingQueryOpcode malloc(MemoryStack stack) {
        return new IOURingQueryOpcode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingQueryOpcode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingQueryOpcode calloc(MemoryStack stack) {
        return new IOURingQueryOpcode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingQueryOpcode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingQueryOpcode.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingQueryOpcode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingQueryOpcode.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nr_request_opcodes}. */
    public static int nnr_request_opcodes(long struct) { return memGetInt(struct + IOURingQueryOpcode.NR_REQUEST_OPCODES); }
    /** Unsafe version of {@link #nr_register_opcodes}. */
    public static int nnr_register_opcodes(long struct) { return memGetInt(struct + IOURingQueryOpcode.NR_REGISTER_OPCODES); }
    /** Unsafe version of {@link #feature_flags}. */
    public static long nfeature_flags(long struct) { return memGetLong(struct + IOURingQueryOpcode.FEATURE_FLAGS); }
    /** Unsafe version of {@link #ring_setup_flags}. */
    public static long nring_setup_flags(long struct) { return memGetLong(struct + IOURingQueryOpcode.RING_SETUP_FLAGS); }
    /** Unsafe version of {@link #enter_flags}. */
    public static long nenter_flags(long struct) { return memGetLong(struct + IOURingQueryOpcode.ENTER_FLAGS); }
    /** Unsafe version of {@link #sqe_flags}. */
    public static long nsqe_flags(long struct) { return memGetLong(struct + IOURingQueryOpcode.SQE_FLAGS); }

    /** Unsafe version of {@link #nr_request_opcodes(int) nr_request_opcodes}. */
    public static void nnr_request_opcodes(long struct, int value) { memPutInt(struct + IOURingQueryOpcode.NR_REQUEST_OPCODES, value); }
    /** Unsafe version of {@link #nr_register_opcodes(int) nr_register_opcodes}. */
    public static void nnr_register_opcodes(long struct, int value) { memPutInt(struct + IOURingQueryOpcode.NR_REGISTER_OPCODES, value); }
    /** Unsafe version of {@link #feature_flags(long) feature_flags}. */
    public static void nfeature_flags(long struct, long value) { memPutLong(struct + IOURingQueryOpcode.FEATURE_FLAGS, value); }
    /** Unsafe version of {@link #ring_setup_flags(long) ring_setup_flags}. */
    public static void nring_setup_flags(long struct, long value) { memPutLong(struct + IOURingQueryOpcode.RING_SETUP_FLAGS, value); }
    /** Unsafe version of {@link #enter_flags(long) enter_flags}. */
    public static void nenter_flags(long struct, long value) { memPutLong(struct + IOURingQueryOpcode.ENTER_FLAGS, value); }
    /** Unsafe version of {@link #sqe_flags(long) sqe_flags}. */
    public static void nsqe_flags(long struct, long value) { memPutLong(struct + IOURingQueryOpcode.SQE_FLAGS, value); }

    // -----------------------------------

    /** An array of {@link IOURingQueryOpcode} structs. */
    public static class Buffer extends StructBuffer<IOURingQueryOpcode, Buffer> implements NativeResource {

        private static final IOURingQueryOpcode ELEMENT_FACTORY = IOURingQueryOpcode.create(-1L);

        /**
         * Creates a new {@code IOURingQueryOpcode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingQueryOpcode#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingQueryOpcode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code nr_request_opcodes} field. */
        @NativeType("__u32")
        public int nr_request_opcodes() { return IOURingQueryOpcode.nnr_request_opcodes(address()); }
        /** @return the value of the {@code nr_register_opcodes} field. */
        @NativeType("__u32")
        public int nr_register_opcodes() { return IOURingQueryOpcode.nnr_register_opcodes(address()); }
        /** @return the value of the {@code feature_flags} field. */
        @NativeType("__u64")
        public long feature_flags() { return IOURingQueryOpcode.nfeature_flags(address()); }
        /** @return the value of the {@code ring_setup_flags} field. */
        @NativeType("__u64")
        public long ring_setup_flags() { return IOURingQueryOpcode.nring_setup_flags(address()); }
        /** @return the value of the {@code enter_flags} field. */
        @NativeType("__u64")
        public long enter_flags() { return IOURingQueryOpcode.nenter_flags(address()); }
        /** @return the value of the {@code sqe_flags} field. */
        @NativeType("__u64")
        public long sqe_flags() { return IOURingQueryOpcode.nsqe_flags(address()); }

        /** Sets the specified value to the {@code nr_request_opcodes} field. */
        public IOURingQueryOpcode.Buffer nr_request_opcodes(@NativeType("__u32") int value) { IOURingQueryOpcode.nnr_request_opcodes(address(), value); return this; }
        /** Sets the specified value to the {@code nr_register_opcodes} field. */
        public IOURingQueryOpcode.Buffer nr_register_opcodes(@NativeType("__u32") int value) { IOURingQueryOpcode.nnr_register_opcodes(address(), value); return this; }
        /** Sets the specified value to the {@code feature_flags} field. */
        public IOURingQueryOpcode.Buffer feature_flags(@NativeType("__u64") long value) { IOURingQueryOpcode.nfeature_flags(address(), value); return this; }
        /** Sets the specified value to the {@code ring_setup_flags} field. */
        public IOURingQueryOpcode.Buffer ring_setup_flags(@NativeType("__u64") long value) { IOURingQueryOpcode.nring_setup_flags(address(), value); return this; }
        /** Sets the specified value to the {@code enter_flags} field. */
        public IOURingQueryOpcode.Buffer enter_flags(@NativeType("__u64") long value) { IOURingQueryOpcode.nenter_flags(address(), value); return this; }
        /** Sets the specified value to the {@code sqe_flags} field. */
        public IOURingQueryOpcode.Buffer sqe_flags(@NativeType("__u64") long value) { IOURingQueryOpcode.nsqe_flags(address(), value); return this; }

    }

}