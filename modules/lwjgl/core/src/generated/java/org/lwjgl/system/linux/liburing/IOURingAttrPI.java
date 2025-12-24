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
 * struct io_uring_attr_pi {
 *     __u16 flags;
 *     __u16 app_tag;
 *     __u32 len;
 *     __u64 addr;
 *     __u64 seed;
 *     __u64 rsvd;
 * }}</pre>
 */
@NativeType("struct io_uring_attr_pi")
public class IOURingAttrPI extends Struct<IOURingAttrPI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        APP_TAG,
        LEN,
        ADDR,
        SEED,
        RSVD;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        APP_TAG = layout.offsetof(1);
        LEN = layout.offsetof(2);
        ADDR = layout.offsetof(3);
        SEED = layout.offsetof(4);
        RSVD = layout.offsetof(5);
    }

    protected IOURingAttrPI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingAttrPI create(long address, @Nullable ByteBuffer container) {
        return new IOURingAttrPI(address, container);
    }

    /**
     * Creates a {@code IOURingAttrPI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingAttrPI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("__u16")
    public short flags() { return nflags(address()); }
    /** @return the value of the {@code app_tag} field. */
    @NativeType("__u16")
    public short app_tag() { return napp_tag(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("__u32")
    public int len() { return nlen(address()); }
    /** @return the value of the {@code addr} field. */
    @NativeType("__u64")
    public long addr() { return naddr(address()); }
    /** @return the value of the {@code seed} field. */
    @NativeType("__u64")
    public long seed() { return nseed(address()); }
    /** @return the value of the {@code rsvd} field. */
    @NativeType("__u64")
    public long rsvd() { return nrsvd(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public IOURingAttrPI flags(@NativeType("__u16") short value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code app_tag} field. */
    public IOURingAttrPI app_tag(@NativeType("__u16") short value) { napp_tag(address(), value); return this; }
    /** Sets the specified value to the {@code len} field. */
    public IOURingAttrPI len(@NativeType("__u32") int value) { nlen(address(), value); return this; }
    /** Sets the specified value to the {@code addr} field. */
    public IOURingAttrPI addr(@NativeType("__u64") long value) { naddr(address(), value); return this; }
    /** Sets the specified value to the {@code seed} field. */
    public IOURingAttrPI seed(@NativeType("__u64") long value) { nseed(address(), value); return this; }
    /** Sets the specified value to the {@code rsvd} field. */
    public IOURingAttrPI rsvd(@NativeType("__u64") long value) { nrsvd(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingAttrPI set(
        short flags,
        short app_tag,
        int len,
        long addr,
        long seed,
        long rsvd
    ) {
        flags(flags);
        app_tag(app_tag);
        len(len);
        addr(addr);
        seed(seed);
        rsvd(rsvd);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingAttrPI set(IOURingAttrPI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingAttrPI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingAttrPI malloc() {
        return new IOURingAttrPI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingAttrPI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingAttrPI calloc() {
        return new IOURingAttrPI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingAttrPI} instance allocated with {@link BufferUtils}. */
    public static IOURingAttrPI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingAttrPI(memAddress(container), container);
    }

    /** Returns a new {@code IOURingAttrPI} instance for the specified memory address. */
    public static IOURingAttrPI create(long address) {
        return new IOURingAttrPI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingAttrPI createSafe(long address) {
        return address == NULL ? null : new IOURingAttrPI(address, null);
    }

    /**
     * Returns a new {@link IOURingAttrPI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingAttrPI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingAttrPI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingAttrPI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingAttrPI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingAttrPI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingAttrPI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingAttrPI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingAttrPI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingAttrPI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingAttrPI malloc(MemoryStack stack) {
        return new IOURingAttrPI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingAttrPI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingAttrPI calloc(MemoryStack stack) {
        return new IOURingAttrPI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingAttrPI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingAttrPI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingAttrPI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingAttrPI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static short nflags(long struct) { return memGetShort(struct + IOURingAttrPI.FLAGS); }
    /** Unsafe version of {@link #app_tag}. */
    public static short napp_tag(long struct) { return memGetShort(struct + IOURingAttrPI.APP_TAG); }
    /** Unsafe version of {@link #len}. */
    public static int nlen(long struct) { return memGetInt(struct + IOURingAttrPI.LEN); }
    /** Unsafe version of {@link #addr}. */
    public static long naddr(long struct) { return memGetLong(struct + IOURingAttrPI.ADDR); }
    /** Unsafe version of {@link #seed}. */
    public static long nseed(long struct) { return memGetLong(struct + IOURingAttrPI.SEED); }
    /** Unsafe version of {@link #rsvd}. */
    public static long nrsvd(long struct) { return memGetLong(struct + IOURingAttrPI.RSVD); }

    /** Unsafe version of {@link #flags(short) flags}. */
    public static void nflags(long struct, short value) { memPutShort(struct + IOURingAttrPI.FLAGS, value); }
    /** Unsafe version of {@link #app_tag(short) app_tag}. */
    public static void napp_tag(long struct, short value) { memPutShort(struct + IOURingAttrPI.APP_TAG, value); }
    /** Unsafe version of {@link #len(int) len}. */
    public static void nlen(long struct, int value) { memPutInt(struct + IOURingAttrPI.LEN, value); }
    /** Unsafe version of {@link #addr(long) addr}. */
    public static void naddr(long struct, long value) { memPutLong(struct + IOURingAttrPI.ADDR, value); }
    /** Unsafe version of {@link #seed(long) seed}. */
    public static void nseed(long struct, long value) { memPutLong(struct + IOURingAttrPI.SEED, value); }
    /** Unsafe version of {@link #rsvd(long) rsvd}. */
    public static void nrsvd(long struct, long value) { memPutLong(struct + IOURingAttrPI.RSVD, value); }

    // -----------------------------------

    /** An array of {@link IOURingAttrPI} structs. */
    public static class Buffer extends StructBuffer<IOURingAttrPI, Buffer> implements NativeResource {

        private static final IOURingAttrPI ELEMENT_FACTORY = IOURingAttrPI.create(-1L);

        /**
         * Creates a new {@code IOURingAttrPI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingAttrPI#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingAttrPI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("__u16")
        public short flags() { return IOURingAttrPI.nflags(address()); }
        /** @return the value of the {@code app_tag} field. */
        @NativeType("__u16")
        public short app_tag() { return IOURingAttrPI.napp_tag(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("__u32")
        public int len() { return IOURingAttrPI.nlen(address()); }
        /** @return the value of the {@code addr} field. */
        @NativeType("__u64")
        public long addr() { return IOURingAttrPI.naddr(address()); }
        /** @return the value of the {@code seed} field. */
        @NativeType("__u64")
        public long seed() { return IOURingAttrPI.nseed(address()); }
        /** @return the value of the {@code rsvd} field. */
        @NativeType("__u64")
        public long rsvd() { return IOURingAttrPI.nrsvd(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public IOURingAttrPI.Buffer flags(@NativeType("__u16") short value) { IOURingAttrPI.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code app_tag} field. */
        public IOURingAttrPI.Buffer app_tag(@NativeType("__u16") short value) { IOURingAttrPI.napp_tag(address(), value); return this; }
        /** Sets the specified value to the {@code len} field. */
        public IOURingAttrPI.Buffer len(@NativeType("__u32") int value) { IOURingAttrPI.nlen(address(), value); return this; }
        /** Sets the specified value to the {@code addr} field. */
        public IOURingAttrPI.Buffer addr(@NativeType("__u64") long value) { IOURingAttrPI.naddr(address(), value); return this; }
        /** Sets the specified value to the {@code seed} field. */
        public IOURingAttrPI.Buffer seed(@NativeType("__u64") long value) { IOURingAttrPI.nseed(address(), value); return this; }
        /** Sets the specified value to the {@code rsvd} field. */
        public IOURingAttrPI.Buffer rsvd(@NativeType("__u64") long value) { IOURingAttrPI.nrsvd(address(), value); return this; }

    }

}