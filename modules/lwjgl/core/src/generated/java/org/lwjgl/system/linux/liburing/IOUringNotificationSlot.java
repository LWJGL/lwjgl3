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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_notification_slot {
 *     __u64 tag;
 *     __u64 resv[3];
 * }</code></pre>
 */
@NativeType("struct io_uring_notification_slot")
public class IOUringNotificationSlot extends Struct<IOUringNotificationSlot> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TAG,
        RESV;

    static {
        Layout layout = __struct(
            __member(8),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TAG = layout.offsetof(0);
        RESV = layout.offsetof(1);
    }

    protected IOUringNotificationSlot(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOUringNotificationSlot create(long address, @Nullable ByteBuffer container) {
        return new IOUringNotificationSlot(address, container);
    }

    /**
     * Creates a {@code IOUringNotificationSlot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOUringNotificationSlot(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code tag} field. */
    @NativeType("__u64")
    public long tag() { return ntag(address()); }
    /** @return a {@link LongBuffer} view of the {@code resv} field. */
    @NativeType("__u64[3]")
    public LongBuffer resv() { return nresv(address()); }
    /** @return the value at the specified index of the {@code resv} field. */
    @NativeType("__u64")
    public long resv(int index) { return nresv(address(), index); }

    /** Sets the specified value to the {@code tag} field. */
    public IOUringNotificationSlot tag(@NativeType("__u64") long value) { ntag(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code resv} field. */
    public IOUringNotificationSlot resv(@NativeType("__u64[3]") LongBuffer value) { nresv(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code resv} field. */
    public IOUringNotificationSlot resv(int index, @NativeType("__u64") long value) { nresv(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public IOUringNotificationSlot set(
        long tag,
        LongBuffer resv
    ) {
        tag(tag);
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
    public IOUringNotificationSlot set(IOUringNotificationSlot src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOUringNotificationSlot} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOUringNotificationSlot malloc() {
        return new IOUringNotificationSlot(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOUringNotificationSlot} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOUringNotificationSlot calloc() {
        return new IOUringNotificationSlot(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOUringNotificationSlot} instance allocated with {@link BufferUtils}. */
    public static IOUringNotificationSlot create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOUringNotificationSlot(memAddress(container), container);
    }

    /** Returns a new {@code IOUringNotificationSlot} instance for the specified memory address. */
    public static IOUringNotificationSlot create(long address) {
        return new IOUringNotificationSlot(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOUringNotificationSlot createSafe(long address) {
        return address == NULL ? null : new IOUringNotificationSlot(address, null);
    }

    /**
     * Returns a new {@link IOUringNotificationSlot.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationSlot.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOUringNotificationSlot.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationSlot.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOUringNotificationSlot.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationSlot.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOUringNotificationSlot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationSlot.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOUringNotificationSlot.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOUringNotificationSlot} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOUringNotificationSlot malloc(MemoryStack stack) {
        return new IOUringNotificationSlot(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOUringNotificationSlot} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOUringNotificationSlot calloc(MemoryStack stack) {
        return new IOUringNotificationSlot(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOUringNotificationSlot.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationSlot.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOUringNotificationSlot.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOUringNotificationSlot.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tag}. */
    public static long ntag(long struct) { return UNSAFE.getLong(null, struct + IOUringNotificationSlot.TAG); }
    /** Unsafe version of {@link #resv}. */
    public static LongBuffer nresv(long struct) { return memLongBuffer(struct + IOUringNotificationSlot.RESV, 3); }
    /** Unsafe version of {@link #resv(int) resv}. */
    public static long nresv(long struct, int index) {
        return UNSAFE.getLong(null, struct + IOUringNotificationSlot.RESV + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #tag(long) tag}. */
    public static void ntag(long struct, long value) { UNSAFE.putLong(null, struct + IOUringNotificationSlot.TAG, value); }
    /** Unsafe version of {@link #resv(LongBuffer) resv}. */
    public static void nresv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOUringNotificationSlot.RESV, value.remaining() * 8);
    }
    /** Unsafe version of {@link #resv(int, long) resv}. */
    public static void nresv(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + IOUringNotificationSlot.RESV + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOUringNotificationSlot} structs. */
    public static class Buffer extends StructBuffer<IOUringNotificationSlot, Buffer> implements NativeResource {

        private static final IOUringNotificationSlot ELEMENT_FACTORY = IOUringNotificationSlot.create(-1L);

        /**
         * Creates a new {@code IOUringNotificationSlot.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOUringNotificationSlot#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOUringNotificationSlot getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code tag} field. */
        @NativeType("__u64")
        public long tag() { return IOUringNotificationSlot.ntag(address()); }
        /** @return a {@link LongBuffer} view of the {@code resv} field. */
        @NativeType("__u64[3]")
        public LongBuffer resv() { return IOUringNotificationSlot.nresv(address()); }
        /** @return the value at the specified index of the {@code resv} field. */
        @NativeType("__u64")
        public long resv(int index) { return IOUringNotificationSlot.nresv(address(), index); }

        /** Sets the specified value to the {@code tag} field. */
        public IOUringNotificationSlot.Buffer tag(@NativeType("__u64") long value) { IOUringNotificationSlot.ntag(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code resv} field. */
        public IOUringNotificationSlot.Buffer resv(@NativeType("__u64[3]") LongBuffer value) { IOUringNotificationSlot.nresv(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code resv} field. */
        public IOUringNotificationSlot.Buffer resv(int index, @NativeType("__u64") long value) { IOUringNotificationSlot.nresv(address(), index, value); return this; }

    }

}