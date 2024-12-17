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
 * struct io_uring_params {
 *     __u32 sq_entries;
 *     __u32 cq_entries;
 *     __u32 flags;
 *     __u32 sq_thread_cpu;
 *     __u32 sq_thread_idle;
 *     __u32 features;
 *     __u32 wq_fd;
 *     __u32 resv[3];
 *     {@link IOSQRingOffsets struct io_sqring_offsets} sq_off;
 *     {@link IOCQRingOffsets struct io_cqring_offsets} cq_off;
 * }}</pre>
 */
@NativeType("struct io_uring_params")
public class IOURingParams extends Struct<IOURingParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SQ_ENTRIES,
        CQ_ENTRIES,
        FLAGS,
        SQ_THREAD_CPU,
        SQ_THREAD_IDLE,
        FEATURES,
        WQ_FD,
        RESV,
        SQ_OFF,
        CQ_OFF;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3),
            __member(IOSQRingOffsets.SIZEOF, IOSQRingOffsets.ALIGNOF),
            __member(IOCQRingOffsets.SIZEOF, IOCQRingOffsets.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SQ_ENTRIES = layout.offsetof(0);
        CQ_ENTRIES = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SQ_THREAD_CPU = layout.offsetof(3);
        SQ_THREAD_IDLE = layout.offsetof(4);
        FEATURES = layout.offsetof(5);
        WQ_FD = layout.offsetof(6);
        RESV = layout.offsetof(7);
        SQ_OFF = layout.offsetof(8);
        CQ_OFF = layout.offsetof(9);
    }

    protected IOURingParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingParams create(long address, @Nullable ByteBuffer container) {
        return new IOURingParams(address, container);
    }

    /**
     * Creates a {@code IOURingParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sq_entries} field. */
    @NativeType("__u32")
    public int sq_entries() { return nsq_entries(address()); }
    /** @return the value of the {@code cq_entries} field. */
    @NativeType("__u32")
    public int cq_entries() { return ncq_entries(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code sq_thread_cpu} field. */
    @NativeType("__u32")
    public int sq_thread_cpu() { return nsq_thread_cpu(address()); }
    /** @return the value of the {@code sq_thread_idle} field. */
    @NativeType("__u32")
    public int sq_thread_idle() { return nsq_thread_idle(address()); }
    /** @return the value of the {@code features} field. */
    @NativeType("__u32")
    public int features() { return nfeatures(address()); }
    /** @return the value of the {@code wq_fd} field. */
    @NativeType("__u32")
    public int wq_fd() { return nwq_fd(address()); }
    /** @return a {@link IOSQRingOffsets} view of the {@code sq_off} field. */
    @NativeType("struct io_sqring_offsets")
    public IOSQRingOffsets sq_off() { return nsq_off(address()); }
    /** @return a {@link IOCQRingOffsets} view of the {@code cq_off} field. */
    @NativeType("struct io_cqring_offsets")
    public IOCQRingOffsets cq_off() { return ncq_off(address()); }

    /** Sets the specified value to the {@code sq_entries} field. */
    public IOURingParams sq_entries(@NativeType("__u32") int value) { nsq_entries(address(), value); return this; }
    /** Sets the specified value to the {@code cq_entries} field. */
    public IOURingParams cq_entries(@NativeType("__u32") int value) { ncq_entries(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingParams flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code sq_thread_cpu} field. */
    public IOURingParams sq_thread_cpu(@NativeType("__u32") int value) { nsq_thread_cpu(address(), value); return this; }
    /** Sets the specified value to the {@code sq_thread_idle} field. */
    public IOURingParams sq_thread_idle(@NativeType("__u32") int value) { nsq_thread_idle(address(), value); return this; }
    /** Sets the specified value to the {@code features} field. */
    public IOURingParams features(@NativeType("__u32") int value) { nfeatures(address(), value); return this; }
    /** Sets the specified value to the {@code wq_fd} field. */
    public IOURingParams wq_fd(@NativeType("__u32") int value) { nwq_fd(address(), value); return this; }
    /** Copies the specified {@link IOSQRingOffsets} to the {@code sq_off} field. */
    public IOURingParams sq_off(@NativeType("struct io_sqring_offsets") IOSQRingOffsets value) { nsq_off(address(), value); return this; }
    /** Passes the {@code sq_off} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingParams sq_off(java.util.function.Consumer<IOSQRingOffsets> consumer) { consumer.accept(sq_off()); return this; }
    /** Copies the specified {@link IOCQRingOffsets} to the {@code cq_off} field. */
    public IOURingParams cq_off(@NativeType("struct io_cqring_offsets") IOCQRingOffsets value) { ncq_off(address(), value); return this; }
    /** Passes the {@code cq_off} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingParams cq_off(java.util.function.Consumer<IOCQRingOffsets> consumer) { consumer.accept(cq_off()); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingParams set(
        int sq_entries,
        int cq_entries,
        int flags,
        int sq_thread_cpu,
        int sq_thread_idle,
        int features,
        int wq_fd,
        IOSQRingOffsets sq_off,
        IOCQRingOffsets cq_off
    ) {
        sq_entries(sq_entries);
        cq_entries(cq_entries);
        flags(flags);
        sq_thread_cpu(sq_thread_cpu);
        sq_thread_idle(sq_thread_idle);
        features(features);
        wq_fd(wq_fd);
        sq_off(sq_off);
        cq_off(cq_off);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingParams set(IOURingParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingParams malloc() {
        return new IOURingParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingParams calloc() {
        return new IOURingParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingParams} instance allocated with {@link BufferUtils}. */
    public static IOURingParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingParams(memAddress(container), container);
    }

    /** Returns a new {@code IOURingParams} instance for the specified memory address. */
    public static IOURingParams create(long address) {
        return new IOURingParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingParams createSafe(long address) {
        return address == NULL ? null : new IOURingParams(address, null);
    }

    /**
     * Returns a new {@link IOURingParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingParams.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingParams malloc(MemoryStack stack) {
        return new IOURingParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingParams calloc(MemoryStack stack) {
        return new IOURingParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sq_entries}. */
    public static int nsq_entries(long struct) { return memGetInt(struct + IOURingParams.SQ_ENTRIES); }
    /** Unsafe version of {@link #cq_entries}. */
    public static int ncq_entries(long struct) { return memGetInt(struct + IOURingParams.CQ_ENTRIES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingParams.FLAGS); }
    /** Unsafe version of {@link #sq_thread_cpu}. */
    public static int nsq_thread_cpu(long struct) { return memGetInt(struct + IOURingParams.SQ_THREAD_CPU); }
    /** Unsafe version of {@link #sq_thread_idle}. */
    public static int nsq_thread_idle(long struct) { return memGetInt(struct + IOURingParams.SQ_THREAD_IDLE); }
    /** Unsafe version of {@link #features}. */
    public static int nfeatures(long struct) { return memGetInt(struct + IOURingParams.FEATURES); }
    /** Unsafe version of {@link #wq_fd}. */
    public static int nwq_fd(long struct) { return memGetInt(struct + IOURingParams.WQ_FD); }
    public static IntBuffer nresv(long struct) { return memIntBuffer(struct + IOURingParams.RESV, 3); }
    public static int nresv(long struct, int index) {
        return memGetInt(struct + IOURingParams.RESV + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #sq_off}. */
    public static IOSQRingOffsets nsq_off(long struct) { return IOSQRingOffsets.create(struct + IOURingParams.SQ_OFF); }
    /** Unsafe version of {@link #cq_off}. */
    public static IOCQRingOffsets ncq_off(long struct) { return IOCQRingOffsets.create(struct + IOURingParams.CQ_OFF); }

    /** Unsafe version of {@link #sq_entries(int) sq_entries}. */
    public static void nsq_entries(long struct, int value) { memPutInt(struct + IOURingParams.SQ_ENTRIES, value); }
    /** Unsafe version of {@link #cq_entries(int) cq_entries}. */
    public static void ncq_entries(long struct, int value) { memPutInt(struct + IOURingParams.CQ_ENTRIES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingParams.FLAGS, value); }
    /** Unsafe version of {@link #sq_thread_cpu(int) sq_thread_cpu}. */
    public static void nsq_thread_cpu(long struct, int value) { memPutInt(struct + IOURingParams.SQ_THREAD_CPU, value); }
    /** Unsafe version of {@link #sq_thread_idle(int) sq_thread_idle}. */
    public static void nsq_thread_idle(long struct, int value) { memPutInt(struct + IOURingParams.SQ_THREAD_IDLE, value); }
    /** Unsafe version of {@link #features(int) features}. */
    public static void nfeatures(long struct, int value) { memPutInt(struct + IOURingParams.FEATURES, value); }
    /** Unsafe version of {@link #wq_fd(int) wq_fd}. */
    public static void nwq_fd(long struct, int value) { memPutInt(struct + IOURingParams.WQ_FD, value); }
    public static void nresv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingParams.RESV, value.remaining() * 4);
    }
    public static void nresv(long struct, int index, int value) {
        memPutInt(struct + IOURingParams.RESV + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #sq_off(IOSQRingOffsets) sq_off}. */
    public static void nsq_off(long struct, IOSQRingOffsets value) { memCopy(value.address(), struct + IOURingParams.SQ_OFF, IOSQRingOffsets.SIZEOF); }
    /** Unsafe version of {@link #cq_off(IOCQRingOffsets) cq_off}. */
    public static void ncq_off(long struct, IOCQRingOffsets value) { memCopy(value.address(), struct + IOURingParams.CQ_OFF, IOCQRingOffsets.SIZEOF); }

    // -----------------------------------

    /** An array of {@link IOURingParams} structs. */
    public static class Buffer extends StructBuffer<IOURingParams, Buffer> implements NativeResource {

        private static final IOURingParams ELEMENT_FACTORY = IOURingParams.create(-1L);

        /**
         * Creates a new {@code IOURingParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sq_entries} field. */
        @NativeType("__u32")
        public int sq_entries() { return IOURingParams.nsq_entries(address()); }
        /** @return the value of the {@code cq_entries} field. */
        @NativeType("__u32")
        public int cq_entries() { return IOURingParams.ncq_entries(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingParams.nflags(address()); }
        /** @return the value of the {@code sq_thread_cpu} field. */
        @NativeType("__u32")
        public int sq_thread_cpu() { return IOURingParams.nsq_thread_cpu(address()); }
        /** @return the value of the {@code sq_thread_idle} field. */
        @NativeType("__u32")
        public int sq_thread_idle() { return IOURingParams.nsq_thread_idle(address()); }
        /** @return the value of the {@code features} field. */
        @NativeType("__u32")
        public int features() { return IOURingParams.nfeatures(address()); }
        /** @return the value of the {@code wq_fd} field. */
        @NativeType("__u32")
        public int wq_fd() { return IOURingParams.nwq_fd(address()); }
        /** @return a {@link IOSQRingOffsets} view of the {@code sq_off} field. */
        @NativeType("struct io_sqring_offsets")
        public IOSQRingOffsets sq_off() { return IOURingParams.nsq_off(address()); }
        /** @return a {@link IOCQRingOffsets} view of the {@code cq_off} field. */
        @NativeType("struct io_cqring_offsets")
        public IOCQRingOffsets cq_off() { return IOURingParams.ncq_off(address()); }

        /** Sets the specified value to the {@code sq_entries} field. */
        public IOURingParams.Buffer sq_entries(@NativeType("__u32") int value) { IOURingParams.nsq_entries(address(), value); return this; }
        /** Sets the specified value to the {@code cq_entries} field. */
        public IOURingParams.Buffer cq_entries(@NativeType("__u32") int value) { IOURingParams.ncq_entries(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingParams.Buffer flags(@NativeType("__u32") int value) { IOURingParams.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code sq_thread_cpu} field. */
        public IOURingParams.Buffer sq_thread_cpu(@NativeType("__u32") int value) { IOURingParams.nsq_thread_cpu(address(), value); return this; }
        /** Sets the specified value to the {@code sq_thread_idle} field. */
        public IOURingParams.Buffer sq_thread_idle(@NativeType("__u32") int value) { IOURingParams.nsq_thread_idle(address(), value); return this; }
        /** Sets the specified value to the {@code features} field. */
        public IOURingParams.Buffer features(@NativeType("__u32") int value) { IOURingParams.nfeatures(address(), value); return this; }
        /** Sets the specified value to the {@code wq_fd} field. */
        public IOURingParams.Buffer wq_fd(@NativeType("__u32") int value) { IOURingParams.nwq_fd(address(), value); return this; }
        /** Copies the specified {@link IOSQRingOffsets} to the {@code sq_off} field. */
        public IOURingParams.Buffer sq_off(@NativeType("struct io_sqring_offsets") IOSQRingOffsets value) { IOURingParams.nsq_off(address(), value); return this; }
        /** Passes the {@code sq_off} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingParams.Buffer sq_off(java.util.function.Consumer<IOSQRingOffsets> consumer) { consumer.accept(sq_off()); return this; }
        /** Copies the specified {@link IOCQRingOffsets} to the {@code cq_off} field. */
        public IOURingParams.Buffer cq_off(@NativeType("struct io_cqring_offsets") IOCQRingOffsets value) { IOURingParams.ncq_off(address(), value); return this; }
        /** Passes the {@code cq_off} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingParams.Buffer cq_off(java.util.function.Consumer<IOCQRingOffsets> consumer) { consumer.accept(cq_off()); return this; }

    }

}