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
 * struct io_uring_rsrc_register {
 *     __u32 nr;
 *     __u32 resv;
 *     __u64 resv2;
 *     __u64 data;
 *     __u64 tags;
 * }</code></pre>
 */
@NativeType("struct io_uring_rsrc_register")
public class IOURingRSRCRegister extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NR,
        RESV,
        RESV2,
        DATA,
        TAGS;

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

        NR = layout.offsetof(0);
        RESV = layout.offsetof(1);
        RESV2 = layout.offsetof(2);
        DATA = layout.offsetof(3);
        TAGS = layout.offsetof(4);
    }

    /**
     * Creates a {@code IOURingRSRCRegister} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingRSRCRegister(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code nr} field. */
    @NativeType("__u32")
    public int nr() { return nnr(address()); }
    /** @return the value of the {@code resv} field. */
    @NativeType("__u32")
    public int resv() { return nresv(address()); }
    /** @return the value of the {@code resv2} field. */
    @NativeType("__u64")
    public long resv2() { return nresv2(address()); }
    /** @return the value of the {@code data} field. */
    @NativeType("__u64")
    public long data() { return ndata(address()); }
    /** @return the value of the {@code tags} field. */
    @NativeType("__u64")
    public long tags() { return ntags(address()); }

    /** Sets the specified value to the {@code nr} field. */
    public IOURingRSRCRegister nr(@NativeType("__u32") int value) { nnr(address(), value); return this; }
    /** Sets the specified value to the {@code resv} field. */
    public IOURingRSRCRegister resv(@NativeType("__u32") int value) { nresv(address(), value); return this; }
    /** Sets the specified value to the {@code resv2} field. */
    public IOURingRSRCRegister resv2(@NativeType("__u64") long value) { nresv2(address(), value); return this; }
    /** Sets the specified value to the {@code data} field. */
    public IOURingRSRCRegister data(@NativeType("__u64") long value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code tags} field. */
    public IOURingRSRCRegister tags(@NativeType("__u64") long value) { ntags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingRSRCRegister set(
        int nr,
        int resv,
        long resv2,
        long data,
        long tags
    ) {
        nr(nr);
        resv(resv);
        resv2(resv2);
        data(data);
        tags(tags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingRSRCRegister set(IOURingRSRCRegister src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingRSRCRegister} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingRSRCRegister malloc() {
        return wrap(IOURingRSRCRegister.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code IOURingRSRCRegister} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingRSRCRegister calloc() {
        return wrap(IOURingRSRCRegister.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code IOURingRSRCRegister} instance allocated with {@link BufferUtils}. */
    public static IOURingRSRCRegister create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(IOURingRSRCRegister.class, memAddress(container), container);
    }

    /** Returns a new {@code IOURingRSRCRegister} instance for the specified memory address. */
    public static IOURingRSRCRegister create(long address) {
        return wrap(IOURingRSRCRegister.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRSRCRegister createSafe(long address) {
        return address == NULL ? null : wrap(IOURingRSRCRegister.class, address);
    }

    /**
     * Returns a new {@link IOURingRSRCRegister.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCRegister.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCRegister.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCRegister.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCRegister.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCRegister.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link IOURingRSRCRegister.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCRegister.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRSRCRegister.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code IOURingRSRCRegister} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRSRCRegister malloc(MemoryStack stack) {
        return wrap(IOURingRSRCRegister.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code IOURingRSRCRegister} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRSRCRegister calloc(MemoryStack stack) {
        return wrap(IOURingRSRCRegister.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link IOURingRSRCRegister.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCRegister.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRSRCRegister.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRSRCRegister.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nr}. */
    public static int nnr(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCRegister.NR); }
    /** Unsafe version of {@link #resv}. */
    public static int nresv(long struct) { return UNSAFE.getInt(null, struct + IOURingRSRCRegister.RESV); }
    /** Unsafe version of {@link #resv2}. */
    public static long nresv2(long struct) { return UNSAFE.getLong(null, struct + IOURingRSRCRegister.RESV2); }
    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return UNSAFE.getLong(null, struct + IOURingRSRCRegister.DATA); }
    /** Unsafe version of {@link #tags}. */
    public static long ntags(long struct) { return UNSAFE.getLong(null, struct + IOURingRSRCRegister.TAGS); }

    /** Unsafe version of {@link #nr(int) nr}. */
    public static void nnr(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCRegister.NR, value); }
    /** Unsafe version of {@link #resv(int) resv}. */
    public static void nresv(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRSRCRegister.RESV, value); }
    /** Unsafe version of {@link #resv2(long) resv2}. */
    public static void nresv2(long struct, long value) { UNSAFE.putLong(null, struct + IOURingRSRCRegister.RESV2, value); }
    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { UNSAFE.putLong(null, struct + IOURingRSRCRegister.DATA, value); }
    /** Unsafe version of {@link #tags(long) tags}. */
    public static void ntags(long struct, long value) { UNSAFE.putLong(null, struct + IOURingRSRCRegister.TAGS, value); }

    // -----------------------------------

    /** An array of {@link IOURingRSRCRegister} structs. */
    public static class Buffer extends StructBuffer<IOURingRSRCRegister, Buffer> implements NativeResource {

        private static final IOURingRSRCRegister ELEMENT_FACTORY = IOURingRSRCRegister.create(-1L);

        /**
         * Creates a new {@code IOURingRSRCRegister.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingRSRCRegister#SIZEOF}, and its mark will be undefined.
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
        protected IOURingRSRCRegister getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code nr} field. */
        @NativeType("__u32")
        public int nr() { return IOURingRSRCRegister.nnr(address()); }
        /** @return the value of the {@code resv} field. */
        @NativeType("__u32")
        public int resv() { return IOURingRSRCRegister.nresv(address()); }
        /** @return the value of the {@code resv2} field. */
        @NativeType("__u64")
        public long resv2() { return IOURingRSRCRegister.nresv2(address()); }
        /** @return the value of the {@code data} field. */
        @NativeType("__u64")
        public long data() { return IOURingRSRCRegister.ndata(address()); }
        /** @return the value of the {@code tags} field. */
        @NativeType("__u64")
        public long tags() { return IOURingRSRCRegister.ntags(address()); }

        /** Sets the specified value to the {@code nr} field. */
        public IOURingRSRCRegister.Buffer nr(@NativeType("__u32") int value) { IOURingRSRCRegister.nnr(address(), value); return this; }
        /** Sets the specified value to the {@code resv} field. */
        public IOURingRSRCRegister.Buffer resv(@NativeType("__u32") int value) { IOURingRSRCRegister.nresv(address(), value); return this; }
        /** Sets the specified value to the {@code resv2} field. */
        public IOURingRSRCRegister.Buffer resv2(@NativeType("__u64") long value) { IOURingRSRCRegister.nresv2(address(), value); return this; }
        /** Sets the specified value to the {@code data} field. */
        public IOURingRSRCRegister.Buffer data(@NativeType("__u64") long value) { IOURingRSRCRegister.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code tags} field. */
        public IOURingRSRCRegister.Buffer tags(@NativeType("__u64") long value) { IOURingRSRCRegister.ntags(address(), value); return this; }

    }

}