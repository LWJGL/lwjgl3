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
 * struct io_uring_rsrc_update {
 *     __u32 offset;
 *     __u32 resv;
 *     __u64 data;
 * }</code></pre>
 */
@NativeType("struct io_uring_rsrc_update")
public class IOURingRSRCUpdate extends Struct<IOURingRSRCUpdate> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        RESV,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        RESV = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected IOURingRSRCUpdate(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingRSRCUpdate create(long address, @Nullable ByteBuffer container) {
        return new IOURingRSRCUpdate(address, container);
    }

    /**
     * Creates a {@code IOURingRSRCUpdate} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingRSRCUpdate(ByteBuffer container) {
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

    /** Sets the specified value to the {@code offset} field. */
    public IOURingRSRCUpdate offset(@NativeType("__u32") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingRSRCUpdate resv(@NativeType("__u32") int value) { nresv(address(), value); return this; }
    /** Sets the specified value to the {@code data} field. */
    public IOURingRSRCUpdate data(@NativeType("__u64") long value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingRSRCUpdate set(
        int offset,
        int resv,
        long data
    ) {
        offset(offset);
        resv(resv);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingRSRCUpdate set(IOURingRSRCUpdate src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingRSRCUpdate} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingRSRCUpdate malloc() {
        return new IOURingRSRCUpdate(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingRSRCUpdate} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingRSRCUpdate calloc() {
        return new IOURingRSRCUpdate(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingRSRCUpdate} instance allocated with {@link BufferUtils}. */
    public static IOURingRSRCUpdate create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRSRCUpdate(memAddress(container), container);
    }

    /** Returns a new {@code IOURingRSRCUpdate} instance for the specified memory address. */
    public static IOURingRSRCUpdate create(long address) {
        return new IOURingRSRCUpdate(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRSRCUpdate createSafe(long address) {
        return address == NULL ? null : new IOURingRSRCUpdate(address, null);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingRSRCUpdate.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRSRCUpdate.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingRSRCUpdate} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRSRCUpdate malloc(MemoryStack stack) {
        return new IOURingRSRCUpdate(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingRSRCUpdate} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRSRCUpdate calloc(MemoryStack stack) {
        return new IOURingRSRCUpdate(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCUpdate.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCUpdate.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCUpdate.OFFSET); }
    /** Unsafe version of {@link #resv}. */
    public static int nresv(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCUpdate.RESV); }
    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return UNSAFE.getLong(null, struct + IOURingRSRCUpdate.DATA); }

    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCUpdate.OFFSET, value); }
    /** Unsafe version of {@link #resv(int) resv}. */
    public static void nresv(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCUpdate.RESV, value); }
    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { UNSAFE.putLong(null, struct + IOURingRSRCUpdate.DATA, value); }

    // -----------------------------------

    /** An array of {@link IOURingRSRCUpdate} structs. */
    public static class Buffer extends StructBuffer<IOURingRSRCUpdate, Buffer> implements NativeResource {

        private static final IOURingRSRCUpdate ELEMENT_FACTORY = IOURingRSRCUpdate.create(-1L);

        /**
         * Creates a new {@code IOURingRSRCUpdate.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingRSRCUpdate#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingRSRCUpdate getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code offset} field. */
        @NativeType("__u32")
        public int offset() { return IOURingRSRCUpdate.noffset(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u32")
        public int resv() { return IOURingRSRCUpdate.nresv(address()); }
        /** @return the value of the {@code data} field. */
        @NativeType("__u64")
        public long data() { return IOURingRSRCUpdate.ndata(address()); }

        /** Sets the specified value to the {@code offset} field. */
        public IOURingRSRCUpdate.Buffer offset(@NativeType("__u32") int value) { IOURingRSRCUpdate.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingRSRCUpdate.Buffer resv(@NativeType("__u32") int value) { IOURingRSRCUpdate.nresv(address(), value); return this; }
        /** Sets the specified value to the {@code data} field. */
        public IOURingRSRCUpdate.Buffer data(@NativeType("__u64") long value) { IOURingRSRCUpdate.ndata(address(), value); return this; }

    }

}