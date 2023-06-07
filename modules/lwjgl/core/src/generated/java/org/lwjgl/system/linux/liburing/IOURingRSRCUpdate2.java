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
 * struct io_uring_rsrc_update2 {
 *     __u32 offset;
 *     __u32 resv;
 *     __u64 data;
 *     __u64 tags;
 *     __u32 nr;
 *     __u32 resv2;
 * }</code></pre>
 */
@NativeType("struct io_uring_rsrc_update2")
public class IOURingRSRCUpdate2 extends Struct<IOURingRSRCUpdate2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        RESV,
        DATA,
        TAGS,
        NR,
        RESV2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        RESV = layout.offsetof(1);
        DATA = layout.offsetof(2);
        TAGS = layout.offsetof(3);
        NR = layout.offsetof(4);
        RESV2 = layout.offsetof(5);
    }

    protected IOURingRSRCUpdate2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingRSRCUpdate2 create(long address, @Nullable ByteBuffer container) {
        return new IOURingRSRCUpdate2(address, container);
    }

    /**
     * Creates a {@code IOURingRSRCUpdate2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingRSRCUpdate2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code offset} field. */
    @NativeType("__u32")
    public int offset() { return noffset(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u32")
    public int resv() { return nresv(address()); }
    /** @return the value of the {@code data} field. */
    @NativeType("__u64")
    public long data() { return ndata(address()); }
    /** @return the value of the {@code tags} field. */
    @NativeType("__u64")
    public long tags() { return ntags(address()); }
    /** @return the value of the {@code nr} field. */
    @NativeType("__u32")
    public int nr() { return nnr(address()); }
    /** @return the value of the {@code resv2} field. */
    @NativeType("__u32")
    public int resv2() { return nresv2(address()); }

    /** Sets the specified value to the {@code offset} field. */
    public IOURingRSRCUpdate2 offset(@NativeType("__u32") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingRSRCUpdate2 resv(@NativeType("__u32") int value) { nresv(address(), value); return this; }
    /** Sets the specified value to the {@code data} field. */
    public IOURingRSRCUpdate2 data(@NativeType("__u64") long value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code tags} field. */
    public IOURingRSRCUpdate2 tags(@NativeType("__u64") long value) { ntags(address(), value); return this; }
    /** Sets the specified value to the {@code nr} field. */
    public IOURingRSRCUpdate2 nr(@NativeType("__u32") int value) { nnr(address(), value); return this; }
    /** Sets the specified value to the {@code resv2} field. */
    public IOURingRSRCUpdate2 resv2(@NativeType("__u32") int value) { nresv2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingRSRCUpdate2 set(
        int offset,
        int resv,
        long data,
        long tags,
        int nr,
        int resv2
    ) {
        offset(offset);
        resv(resv);
        data(data);
        tags(tags);
        nr(nr);
        resv2(resv2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingRSRCUpdate2 set(IOURingRSRCUpdate2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingRSRCUpdate2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingRSRCUpdate2 malloc() {
        return new IOURingRSRCUpdate2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingRSRCUpdate2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingRSRCUpdate2 calloc() {
        return new IOURingRSRCUpdate2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingRSRCUpdate2} instance allocated with {@link BufferUtils}. */
    public static IOURingRSRCUpdate2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRSRCUpdate2(memAddress(container), container);
    }

    /** Returns a new {@code IOURingRSRCUpdate2} instance for the specified memory address. */
    public static IOURingRSRCUpdate2 create(long address) {
        return new IOURingRSRCUpdate2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRSRCUpdate2 createSafe(long address) {
        return address == NULL ? null : new IOURingRSRCUpdate2(address, null);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingRSRCUpdate2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRSRCUpdate2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingRSRCUpdate2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRSRCUpdate2 malloc(MemoryStack stack) {
        return new IOURingRSRCUpdate2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingRSRCUpdate2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRSRCUpdate2 calloc(MemoryStack stack) {
        return new IOURingRSRCUpdate2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCUpdate2.OFFSET); }
    /** Unsafe version of {@link #resv}. */
    public static int nresv(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCUpdate2.RESV); }
    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return UNSAFE.getLong(null, struct + IOURingRSRCUpdate2.DATA); }
    /** Unsafe version of {@link #tags}. */
    public static long ntags(long struct) { return UNSAFE.getLong(null, struct + IOURingRSRCUpdate2.TAGS); }
    /** Unsafe version of {@link #nr}. */
    public static int nnr(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCUpdate2.NR); }
    /** Unsafe version of {@link #resv2}. */
    public static int nresv2(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCUpdate2.RESV2); }

    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCUpdate2.OFFSET, value); }
    /** Unsafe version of {@link #resv(int) resv}. */
    public static void nresv(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCUpdate2.RESV, value); }
    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { UNSAFE.putLong(null, struct + IOURingRSRCUpdate2.DATA, value); }
    /** Unsafe version of {@link #tags(long) tags}. */
    public static void ntags(long struct, long value) { UNSAFE.putLong(null, struct + IOURingRSRCUpdate2.TAGS, value); }
    /** Unsafe version of {@link #nr(int) nr}. */
    public static void nnr(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCUpdate2.NR, value); }
    /** Unsafe version of {@link #resv2(int) resv2}. */
    public static void nresv2(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCUpdate2.RESV2, value); }

    // -----------------------------------

    /** An array of {@link IOURingRSRCUpdate2} structs. */
    public static class Buffer extends StructBuffer<IOURingRSRCUpdate2, Buffer> implements NativeResource {

        private static final IOURingRSRCUpdate2 ELEMENT_FACTORY = IOURingRSRCUpdate2.create(-1L);

        /**
         * Creates a new {@code IOURingRSRCUpdate2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingRSRCUpdate2#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingRSRCUpdate2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code offset} field. */
        @NativeType("__u32")
        public int offset() { return IOURingRSRCUpdate2.noffset(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u32")
        public int resv() { return IOURingRSRCUpdate2.nresv(address()); }
        /** @return the value of the {@code data} field. */
        @NativeType("__u64")
        public long data() { return IOURingRSRCUpdate2.ndata(address()); }
        /** @return the value of the {@code tags} field. */
        @NativeType("__u64")
        public long tags() { return IOURingRSRCUpdate2.ntags(address()); }
        /** @return the value of the {@code nr} field. */
        @NativeType("__u32")
        public int nr() { return IOURingRSRCUpdate2.nnr(address()); }
        /** @return the value of the {@code resv2} field. */
        @NativeType("__u32")
        public int resv2() { return IOURingRSRCUpdate2.nresv2(address()); }

        /** Sets the specified value to the {@code offset} field. */
        public IOURingRSRCUpdate2.Buffer offset(@NativeType("__u32") int value) { IOURingRSRCUpdate2.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingRSRCUpdate2.Buffer resv(@NativeType("__u32") int value) { IOURingRSRCUpdate2.nresv(address(), value); return this; }
        /** Sets the specified value to the {@code data} field. */
        public IOURingRSRCUpdate2.Buffer data(@NativeType("__u64") long value) { IOURingRSRCUpdate2.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code tags} field. */
        public IOURingRSRCUpdate2.Buffer tags(@NativeType("__u64") long value) { IOURingRSRCUpdate2.ntags(address(), value); return this; }
        /** Sets the specified value to the {@code nr} field. */
        public IOURingRSRCUpdate2.Buffer nr(@NativeType("__u32") int value) { IOURingRSRCUpdate2.nnr(address(), value); return this; }
        /** Sets the specified value to the {@code resv2} field. */
        public IOURingRSRCUpdate2.Buffer resv2(@NativeType("__u32") int value) { IOURingRSRCUpdate2.nresv2(address(), value); return this; }

    }

}