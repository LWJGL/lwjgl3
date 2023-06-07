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
 * struct io_cqring_offsets {
 *     __u32 head;
 *     __u32 tail;
 *     __u32 ring_mask;
 *     __u32 ring_entries;
 *     __u32 overflow;
 *     __u32 cqes;
 *     __u32 flags;
 *     __u32 resv1;
 *     __u64 resv2;
 * }</code></pre>
 */
@NativeType("struct io_cqring_offsets")
public class IOCQRingOffsets extends Struct<IOCQRingOffsets> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEAD,
        TAIL,
        RING_MASK,
        RING_ENTRIES,
        OVERFLOW,
        CQES,
        FLAGS,
        RESV1,
        RESV2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        TAIL = layout.offsetof(1);
        RING_MASK = layout.offsetof(2);
        RING_ENTRIES = layout.offsetof(3);
        OVERFLOW = layout.offsetof(4);
        CQES = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
        RESV1 = layout.offsetof(7);
        RESV2 = layout.offsetof(8);
    }

    protected IOCQRingOffsets(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOCQRingOffsets create(long address, @Nullable ByteBuffer container) {
        return new IOCQRingOffsets(address, container);
    }

    /**
     * Creates a {@code IOCQRingOffsets} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOCQRingOffsets(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code head} field. */
    @NativeType("__u32")
    public int head() { return nhead(address()); }
    /** @return the value of the {@code tail} field. */
    @NativeType("__u32")
    public int tail() { return ntail(address()); }
    /** @return the value of the {@code ring_mask} field. */
    @NativeType("__u32")
    public int ring_mask() { return nring_mask(address()); }
    /** @return the value of the {@code ring_entries} field. */
    @NativeType("__u32")
    public int ring_entries() { return nring_entries(address()); }
    /** @return the value of the {@code overflow} field. */
    @NativeType("__u32")
    public int overflow() { return noverflow(address()); }
    /** @return the value of the {@code cqes} field. */
    @NativeType("__u32")
    public int cqes() { return ncqes(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code head} field. */
    public IOCQRingOffsets head(@NativeType("__u32") int value) { nhead(address(), value); return this; }
    /** Sets the specified value to the {@code tail} field. */
    public IOCQRingOffsets tail(@NativeType("__u32") int value) { ntail(address(), value); return this; }
    /** Sets the specified value to the {@code ring_mask} field. */
    public IOCQRingOffsets ring_mask(@NativeType("__u32") int value) { nring_mask(address(), value); return this; }
    /** Sets the specified value to the {@code ring_entries} field. */
    public IOCQRingOffsets ring_entries(@NativeType("__u32") int value) { nring_entries(address(), value); return this; }
    /** Sets the specified value to the {@code overflow} field. */
    public IOCQRingOffsets overflow(@NativeType("__u32") int value) { noverflow(address(), value); return this; }
    /** Sets the specified value to the {@code cqes} field. */
    public IOCQRingOffsets cqes(@NativeType("__u32") int value) { ncqes(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOCQRingOffsets flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOCQRingOffsets set(
        int head,
        int tail,
        int ring_mask,
        int ring_entries,
        int overflow,
        int cqes,
        int flags
    ) {
        head(head);
        tail(tail);
        ring_mask(ring_mask);
        ring_entries(ring_entries);
        overflow(overflow);
        cqes(cqes);
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
    public IOCQRingOffsets set(IOCQRingOffsets src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOCQRingOffsets} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOCQRingOffsets malloc() {
        return new IOCQRingOffsets(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOCQRingOffsets} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOCQRingOffsets calloc() {
        return new IOCQRingOffsets(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOCQRingOffsets} instance allocated with {@link BufferUtils}. */
    public static IOCQRingOffsets create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOCQRingOffsets(memAddress(container), container);
    }

    /** Returns a new {@code IOCQRingOffsets} instance for the specified memory address. */
    public static IOCQRingOffsets create(long address) {
        return new IOCQRingOffsets(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOCQRingOffsets createSafe(long address) {
        return address == NULL ? null : new IOCQRingOffsets(address, null);
    }

    /**
     * Returns a new {@link IOCQRingOffsets.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOCQRingOffsets.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOCQRingOffsets.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOCQRingOffsets.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOCQRingOffsets.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOCQRingOffsets.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOCQRingOffsets.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOCQRingOffsets.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOCQRingOffsets.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOCQRingOffsets} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOCQRingOffsets malloc(MemoryStack stack) {
        return new IOCQRingOffsets(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOCQRingOffsets} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOCQRingOffsets calloc(MemoryStack stack) {
        return new IOCQRingOffsets(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOCQRingOffsets.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOCQRingOffsets.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOCQRingOffsets.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOCQRingOffsets.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.HEAD); }
    /** Unsafe version of {@link #tail}. */
    public static int ntail(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.TAIL); }
    /** Unsafe version of {@link #ring_mask}. */
    public static int nring_mask(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.RING_MASK); }
    /** Unsafe version of {@link #ring_entries}. */
    public static int nring_entries(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.RING_ENTRIES); }
    /** Unsafe version of {@link #overflow}. */
    public static int noverflow(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.OVERFLOW); }
    /** Unsafe version of {@link #cqes}. */
    public static int ncqes(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.CQES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.FLAGS); }
    public static int nresv1(long struct) { return UNSAFE.getInt(null, struct + IOCQRingOffsets.RESV1); }
    public static long nresv2(long struct) { return UNSAFE.getLong(null, struct + IOCQRingOffsets.RESV2); }

    /** Unsafe version of {@link #head(int) head}. */
    public static void nhead(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.HEAD, value); }
    /** Unsafe version of {@link #tail(int) tail}. */
    public static void ntail(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.TAIL, value); }
    /** Unsafe version of {@link #ring_mask(int) ring_mask}. */
    public static void nring_mask(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.RING_MASK, value); }
    /** Unsafe version of {@link #ring_entries(int) ring_entries}. */
    public static void nring_entries(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.RING_ENTRIES, value); }
    /** Unsafe version of {@link #overflow(int) overflow}. */
    public static void noverflow(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.OVERFLOW, value); }
    /** Unsafe version of {@link #cqes(int) cqes}. */
    public static void ncqes(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.CQES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.FLAGS, value); }
    public static void nresv1(long struct, int value) { UNSAFE.putInt(null, struct + IOCQRingOffsets.RESV1, value); }
    public static void nresv2(long struct, long value) { UNSAFE.putLong(null, struct + IOCQRingOffsets.RESV2, value); }

    // -----------------------------------

    /** An array of {@link IOCQRingOffsets} structs. */
    public static class Buffer extends StructBuffer<IOCQRingOffsets, Buffer> implements NativeResource {

        private static final IOCQRingOffsets ELEMENT_FACTORY = IOCQRingOffsets.create(-1L);

        /**
         * Creates a new {@code IOCQRingOffsets.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOCQRingOffsets#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOCQRingOffsets getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code head} field. */
        @NativeType("__u32")
        public int head() { return IOCQRingOffsets.nhead(address()); }
        /** @return the value of the {@code tail} field. */
        @NativeType("__u32")
        public int tail() { return IOCQRingOffsets.ntail(address()); }
        /** @return the value of the {@code ring_mask} field. */
        @NativeType("__u32")
        public int ring_mask() { return IOCQRingOffsets.nring_mask(address()); }
        /** @return the value of the {@code ring_entries} field. */
        @NativeType("__u32")
        public int ring_entries() { return IOCQRingOffsets.nring_entries(address()); }
        /** @return the value of the {@code overflow} field. */
        @NativeType("__u32")
        public int overflow() { return IOCQRingOffsets.noverflow(address()); }
        /** @return the value of the {@code cqes} field. */
        @NativeType("__u32")
        public int cqes() { return IOCQRingOffsets.ncqes(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOCQRingOffsets.nflags(address()); }

        /** Sets the specified value to the {@code head} field. */
        public IOCQRingOffsets.Buffer head(@NativeType("__u32") int value) { IOCQRingOffsets.nhead(address(), value); return this; }
        /** Sets the specified value to the {@code tail} field. */
        public IOCQRingOffsets.Buffer tail(@NativeType("__u32") int value) { IOCQRingOffsets.ntail(address(), value); return this; }
        /** Sets the specified value to the {@code ring_mask} field. */
        public IOCQRingOffsets.Buffer ring_mask(@NativeType("__u32") int value) { IOCQRingOffsets.nring_mask(address(), value); return this; }
        /** Sets the specified value to the {@code ring_entries} field. */
        public IOCQRingOffsets.Buffer ring_entries(@NativeType("__u32") int value) { IOCQRingOffsets.nring_entries(address(), value); return this; }
        /** Sets the specified value to the {@code overflow} field. */
        public IOCQRingOffsets.Buffer overflow(@NativeType("__u32") int value) { IOCQRingOffsets.noverflow(address(), value); return this; }
        /** Sets the specified value to the {@code cqes} field. */
        public IOCQRingOffsets.Buffer cqes(@NativeType("__u32") int value) { IOCQRingOffsets.ncqes(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOCQRingOffsets.Buffer flags(@NativeType("__u32") int value) { IOCQRingOffsets.nflags(address(), value); return this; }

    }

}