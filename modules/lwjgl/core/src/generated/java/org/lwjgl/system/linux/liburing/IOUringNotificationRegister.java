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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_notification_register {
 *     __u32 nr_slots;
 *     __u32 resv;
 *     __u64 resv2;
 *     __u64 data;
 *     __u64 resv3;
 * }</code></pre>
 */
@NativeType("struct io_uring_notification_register")
public class IOUringNotificationRegister extends Struct<IOUringNotificationRegister> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NR_SLOTS,
        RESV,
        RESV2,
        DATA,
        RESV3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NR_SLOTS = layout.offsetof(0);
        RESV = layout.offsetof(1);
        RESV2 = layout.offsetof(2);
        DATA = layout.offsetof(3);
        RESV3 = layout.offsetof(4);
    }

    protected IOUringNotificationRegister(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOUringNotificationRegister create(long address, @Nullable ByteBuffer container) {
        return new IOUringNotificationRegister(address, container);
    }

    /**
     * Creates a {@code IOUringNotificationRegister} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOUringNotificationRegister(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code nr_slots} field. */
    @NativeType("__u32")
    public int nr_slots() { return nnr_slots(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u32")
    public int resv() { return nresv(address()); }
    /** @return the value of the {@code resv2} field. */
    @NativeType("__u64")
    public long resv2() { return nresv2(address()); }
    /** @return the value of the {@code data} field. */
    @NativeType("__u64")
    public long data() { return ndata(address()); }
    /** @return the value of the {@code resv3} field. */
    @NativeType("__u64")
    public long resv3() { return nresv3(address()); }

    /** Sets the specified value to the {@code nr_slots} field. */
    public IOUringNotificationRegister nr_slots(@NativeType("__u32") int value) { nnr_slots(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOUringNotificationRegister resv(@NativeType("__u32") int value) { nresv(address(), value); return this; }
    /** Sets the specified value to the {@code resv2} field. */
    public IOUringNotificationRegister resv2(@NativeType("__u64") long value) { nresv2(address(), value); return this; }
    /** Sets the specified value to the {@code data} field. */
    public IOUringNotificationRegister data(@NativeType("__u64") long value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code resv3} field. */
    public IOUringNotificationRegister resv3(@NativeType("__u64") long value) { nresv3(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOUringNotificationRegister set(
        int nr_slots,
        int resv,
        long resv2,
        long data,
        long resv3
    ) {
        nr_slots(nr_slots);
        resv(resv);
        resv2(resv2);
        data(data);
        resv3(resv3);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOUringNotificationRegister set(IOUringNotificationRegister src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOUringNotificationRegister} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOUringNotificationRegister malloc() {
        return new IOUringNotificationRegister(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOUringNotificationRegister} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOUringNotificationRegister calloc() {
        return new IOUringNotificationRegister(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOUringNotificationRegister} instance allocated with {@link BufferUtils}. */
    public static IOUringNotificationRegister create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOUringNotificationRegister(memAddress(container), container);
    }

    /** Returns a new {@code IOUringNotificationRegister} instance for the specified memory address. */
    public static IOUringNotificationRegister create(long address) {
        return new IOUringNotificationRegister(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOUringNotificationRegister createSafe(long address) {
        return address == NULL ? null : new IOUringNotificationRegister(address, null);
    }

    /**
     * Returns a new {@link IOUringNotificationRegister.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationRegister.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOUringNotificationRegister.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationRegister.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOUringNotificationRegister.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationRegister.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOUringNotificationRegister.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationRegister.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOUringNotificationRegister.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOUringNotificationRegister} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOUringNotificationRegister malloc(MemoryStack stack) {
        return new IOUringNotificationRegister(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOUringNotificationRegister} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOUringNotificationRegister calloc(MemoryStack stack) {
        return new IOUringNotificationRegister(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOUringNotificationRegister.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationRegister.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOUringNotificationRegister.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationRegister.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nr_slots}. */
    public static int nnr_slots(long struct) { return UNSAFE.getInt(null, struct + IOUringNotificationRegister.NR_SLOTS); }
    /** Unsafe version of {@link #resv}. */
    public static int nresv(long struct) { return UNSAFE.getInt(null, struct + IOUringNotificationRegister.RESV); }
    /** Unsafe version of {@link #resv2}. */
    public static long nresv2(long struct) { return UNSAFE.getLong(null, struct + IOUringNotificationRegister.RESV2); }
    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return UNSAFE.getLong(null, struct + IOUringNotificationRegister.DATA); }
    /** Unsafe version of {@link #resv3}. */
    public static long nresv3(long struct) { return UNSAFE.getLong(null, struct + IOUringNotificationRegister.RESV3); }

    /** Unsafe version of {@link #nr_slots(int) nr_slots}. */
    public static void nnr_slots(long struct, int value) { UNSAFE.putInt(null, struct + IOUringNotificationRegister.NR_SLOTS, value); }
    /** Unsafe version of {@link #resv(int) resv}. */
    public static void nresv(long struct, int value) { UNSAFE.putInt(null, struct + IOUringNotificationRegister.RESV, value); }
    /** Unsafe version of {@link #resv2(long) resv2}. */
    public static void nresv2(long struct, long value) { UNSAFE.putLong(null, struct + IOUringNotificationRegister.RESV2, value); }
    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { UNSAFE.putLong(null, struct + IOUringNotificationRegister.DATA, value); }
    /** Unsafe version of {@link #resv3(long) resv3}. */
    public static void nresv3(long struct, long value) { UNSAFE.putLong(null, struct + IOUringNotificationRegister.RESV3, value); }

    // -----------------------------------

    /** An array of {@link IOUringNotificationRegister} structs. */
    public static class Buffer extends StructBuffer<IOUringNotificationRegister, Buffer> implements NativeResource {

        private static final IOUringNotificationRegister ELEMENT_FACTORY = IOUringNotificationRegister.create(-1L);

        /**
         * Creates a new {@code IOUringNotificationRegister.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOUringNotificationRegister#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOUringNotificationRegister getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code nr_slots} field. */
        @NativeType("__u32")
        public int nr_slots() { return IOUringNotificationRegister.nnr_slots(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u32")
        public int resv() { return IOUringNotificationRegister.nresv(address()); }
        /** @return the value of the {@code resv2} field. */
        @NativeType("__u64")
        public long resv2() { return IOUringNotificationRegister.nresv2(address()); }
        /** @return the value of the {@code data} field. */
        @NativeType("__u64")
        public long data() { return IOUringNotificationRegister.ndata(address()); }
        /** @return the value of the {@code resv3} field. */
        @NativeType("__u64")
        public long resv3() { return IOUringNotificationRegister.nresv3(address()); }

        /** Sets the specified value to the {@code nr_slots} field. */
        public IOUringNotificationRegister.Buffer nr_slots(@NativeType("__u32") int value) { IOUringNotificationRegister.nnr_slots(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOUringNotificationRegister.Buffer resv(@NativeType("__u32") int value) { IOUringNotificationRegister.nresv(address(), value); return this; }
        /** Sets the specified value to the {@code resv2} field. */
        public IOUringNotificationRegister.Buffer resv2(@NativeType("__u64") long value) { IOUringNotificationRegister.nresv2(address(), value); return this; }
        /** Sets the specified value to the {@code data} field. */
        public IOUringNotificationRegister.Buffer data(@NativeType("__u64") long value) { IOUringNotificationRegister.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code resv3} field. */
        public IOUringNotificationRegister.Buffer resv3(@NativeType("__u64") long value) { IOUringNotificationRegister.nresv3(address(), value); return this; }

    }

}