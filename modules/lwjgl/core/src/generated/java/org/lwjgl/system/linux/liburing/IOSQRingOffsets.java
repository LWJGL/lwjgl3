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
 * Filled with the offset for {@code mmap(2)}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_sqring_offsets {
 *     __u32 head;
 *     __u32 tail;
 *     __u32 ring_mask;
 *     __u32 ring_entries;
 *     __u32 flags;
 *     __u32 dropped;
 *     __u32 array;
 *     __u32 resv1;
 *     __u64 resv2;
 * }</code></pre>
 */
@NativeType("struct io_sqring_offsets")
public class IOSQRingOffsets extends Struct<IOSQRingOffsets> implements NativeResource {

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
        FLAGS,
        DROPPED,
        ARRAY,
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
        FLAGS = layout.offsetof(4);
        DROPPED = layout.offsetof(5);
        ARRAY = layout.offsetof(6);
        RESV1 = layout.offsetof(7);
        RESV2 = layout.offsetof(8);
    }

    protected IOSQRingOffsets(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOSQRingOffsets create(long address, @Nullable ByteBuffer container) {
        return new IOSQRingOffsets(address, container);
    }

    /**
     * Creates a {@code IOSQRingOffsets} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOSQRingOffsets(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code dropped} field. */
    @NativeType("__u32")
    public int dropped() { return ndropped(address()); }
    /** @return the value of the {@code array} field. */
    @NativeType("__u32")
    public int array() { return narray(address()); }

    /** Sets the specified value to the {@code head} field. */
    public IOSQRingOffsets head(@NativeType("__u32") int value) { nhead(address(), value); return this; }
    /** Sets the specified value to the {@code tail} field. */
    public IOSQRingOffsets tail(@NativeType("__u32") int value) { ntail(address(), value); return this; }
    /** Sets the specified value to the {@code ring_mask} field. */
    public IOSQRingOffsets ring_mask(@NativeType("__u32") int value) { nring_mask(address(), value); return this; }
    /** Sets the specified value to the {@code ring_entries} field. */
    public IOSQRingOffsets ring_entries(@NativeType("__u32") int value) { nring_entries(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOSQRingOffsets flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dropped} field. */
    public IOSQRingOffsets dropped(@NativeType("__u32") int value) { ndropped(address(), value); return this; }
    /** Sets the specified value to the {@code array} field. */
    public IOSQRingOffsets array(@NativeType("__u32") int value) { narray(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOSQRingOffsets set(
        int head,
        int tail,
        int ring_mask,
        int ring_entries,
        int flags,
        int dropped,
        int array
    ) {
        head(head);
        tail(tail);
        ring_mask(ring_mask);
        ring_entries(ring_entries);
        flags(flags);
        dropped(dropped);
        array(array);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOSQRingOffsets set(IOSQRingOffsets src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOSQRingOffsets} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOSQRingOffsets malloc() {
        return new IOSQRingOffsets(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOSQRingOffsets} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOSQRingOffsets calloc() {
        return new IOSQRingOffsets(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOSQRingOffsets} instance allocated with {@link BufferUtils}. */
    public static IOSQRingOffsets create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOSQRingOffsets(memAddress(container), container);
    }

    /** Returns a new {@code IOSQRingOffsets} instance for the specified memory address. */
    public static IOSQRingOffsets create(long address) {
        return new IOSQRingOffsets(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOSQRingOffsets createSafe(long address) {
        return address == NULL ? null : new IOSQRingOffsets(address, null);
    }

    /**
     * Returns a new {@link IOSQRingOffsets.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOSQRingOffsets.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOSQRingOffsets.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOSQRingOffsets.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOSQRingOffsets.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOSQRingOffsets.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOSQRingOffsets.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOSQRingOffsets.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOSQRingOffsets.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOSQRingOffsets} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOSQRingOffsets malloc(MemoryStack stack) {
        return new IOSQRingOffsets(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOSQRingOffsets} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOSQRingOffsets calloc(MemoryStack stack) {
        return new IOSQRingOffsets(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOSQRingOffsets.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOSQRingOffsets.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOSQRingOffsets.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOSQRingOffsets.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.HEAD); }
    /** Unsafe version of {@link #tail}. */
    public static int ntail(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.TAIL); }
    /** Unsafe version of {@link #ring_mask}. */
    public static int nring_mask(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.RING_MASK); }
    /** Unsafe version of {@link #ring_entries}. */
    public static int nring_entries(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.RING_ENTRIES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.FLAGS); }
    /** Unsafe version of {@link #dropped}. */
    public static int ndropped(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.DROPPED); }
    /** Unsafe version of {@link #array}. */
    public static int narray(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.ARRAY); }
    public static int nresv1(long struct) { return UNSAFE.getInt(null, struct + IOSQRingOffsets.RESV1); }
    public static long nresv2(long struct) { return UNSAFE.getLong(null, struct + IOSQRingOffsets.RESV2); }

    /** Unsafe version of {@link #head(int) head}. */
    public static void nhead(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.HEAD, value); }
    /** Unsafe version of {@link #tail(int) tail}. */
    public static void ntail(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.TAIL, value); }
    /** Unsafe version of {@link #ring_mask(int) ring_mask}. */
    public static void nring_mask(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.RING_MASK, value); }
    /** Unsafe version of {@link #ring_entries(int) ring_entries}. */
    public static void nring_entries(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.RING_ENTRIES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.FLAGS, value); }
    /** Unsafe version of {@link #dropped(int) dropped}. */
    public static void ndropped(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.DROPPED, value); }
    /** Unsafe version of {@link #array(int) array}. */
    public static void narray(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.ARRAY, value); }
    public static void nresv1(long struct, int value) { UNSAFE.putInt(null, struct + IOSQRingOffsets.RESV1, value); }
    public static void nresv2(long struct, long value) { UNSAFE.putLong(null, struct + IOSQRingOffsets.RESV2, value); }

    // -----------------------------------

    /** An array of {@link IOSQRingOffsets} structs. */
    public static class Buffer extends StructBuffer<IOSQRingOffsets, Buffer> implements NativeResource {

        private static final IOSQRingOffsets ELEMENT_FACTORY = IOSQRingOffsets.create(-1L);

        /**
         * Creates a new {@code IOSQRingOffsets.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOSQRingOffsets#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOSQRingOffsets getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code head} field. */
        @NativeType("__u32")
        public int head() { return IOSQRingOffsets.nhead(address()); }
        /** @return the value of the {@code tail} field. */
        @NativeType("__u32")
        public int tail() { return IOSQRingOffsets.ntail(address()); }
        /** @return the value of the {@code ring_mask} field. */
        @NativeType("__u32")
        public int ring_mask() { return IOSQRingOffsets.nring_mask(address()); }
        /** @return the value of the {@code ring_entries} field. */
        @NativeType("__u32")
        public int ring_entries() { return IOSQRingOffsets.nring_entries(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOSQRingOffsets.nflags(address()); }
        /** @return the value of the {@code dropped} field. */
        @NativeType("__u32")
        public int dropped() { return IOSQRingOffsets.ndropped(address()); }
        /** @return the value of the {@code array} field. */
        @NativeType("__u32")
        public int array() { return IOSQRingOffsets.narray(address()); }

        /** Sets the specified value to the {@code head} field. */
        public IOSQRingOffsets.Buffer head(@NativeType("__u32") int value) { IOSQRingOffsets.nhead(address(), value); return this; }
        /** Sets the specified value to the {@code tail} field. */
        public IOSQRingOffsets.Buffer tail(@NativeType("__u32") int value) { IOSQRingOffsets.ntail(address(), value); return this; }
        /** Sets the specified value to the {@code ring_mask} field. */
        public IOSQRingOffsets.Buffer ring_mask(@NativeType("__u32") int value) { IOSQRingOffsets.nring_mask(address(), value); return this; }
        /** Sets the specified value to the {@code ring_entries} field. */
        public IOSQRingOffsets.Buffer ring_entries(@NativeType("__u32") int value) { IOSQRingOffsets.nring_entries(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOSQRingOffsets.Buffer flags(@NativeType("__u32") int value) { IOSQRingOffsets.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dropped} field. */
        public IOSQRingOffsets.Buffer dropped(@NativeType("__u32") int value) { IOSQRingOffsets.ndropped(address(), value); return this; }
        /** Sets the specified value to the {@code array} field. */
        public IOSQRingOffsets.Buffer array(@NativeType("__u32") int value) { IOSQRingOffsets.narray(address(), value); return this; }

    }

}