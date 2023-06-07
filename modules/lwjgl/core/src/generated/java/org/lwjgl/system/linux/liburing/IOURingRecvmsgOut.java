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
 * struct io_uring_recvmsg_out {
 *     __u32 namelen;
 *     __u32 controllen;
 *     __u32 payloadlen;
 *     __u32 flags;
 * }</code></pre>
 */
@NativeType("struct io_uring_recvmsg_out")
public class IOURingRecvmsgOut extends Struct<IOURingRecvmsgOut> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAMELEN,
        CONTROLLEN,
        PAYLOADLEN,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAMELEN = layout.offsetof(0);
        CONTROLLEN = layout.offsetof(1);
        PAYLOADLEN = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected IOURingRecvmsgOut(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingRecvmsgOut create(long address, @Nullable ByteBuffer container) {
        return new IOURingRecvmsgOut(address, container);
    }

    /**
     * Creates a {@code IOURingRecvmsgOut} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingRecvmsgOut(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code namelen} field. */
    @NativeType("__u32")
    public int namelen() { return nnamelen(address()); }
    /** @return the value of the {@code controllen} field. */
    @NativeType("__u32")
    public int controllen() { return ncontrollen(address()); }
    /** @return the value of the {@code payloadlen} field. */
    @NativeType("__u32")
    public int payloadlen() { return npayloadlen(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code namelen} field. */
    public IOURingRecvmsgOut namelen(@NativeType("__u32") int value) { nnamelen(address(), value); return this; }
    /** Sets the specified value to the {@code controllen} field. */
    public IOURingRecvmsgOut controllen(@NativeType("__u32") int value) { ncontrollen(address(), value); return this; }
    /** Sets the specified value to the {@code payloadlen} field. */
    public IOURingRecvmsgOut payloadlen(@NativeType("__u32") int value) { npayloadlen(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingRecvmsgOut flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingRecvmsgOut set(
        int namelen,
        int controllen,
        int payloadlen,
        int flags
    ) {
        namelen(namelen);
        controllen(controllen);
        payloadlen(payloadlen);
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
    public IOURingRecvmsgOut set(IOURingRecvmsgOut src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingRecvmsgOut} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingRecvmsgOut malloc() {
        return new IOURingRecvmsgOut(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingRecvmsgOut} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingRecvmsgOut calloc() {
        return new IOURingRecvmsgOut(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingRecvmsgOut} instance allocated with {@link BufferUtils}. */
    public static IOURingRecvmsgOut create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRecvmsgOut(memAddress(container), container);
    }

    /** Returns a new {@code IOURingRecvmsgOut} instance for the specified memory address. */
    public static IOURingRecvmsgOut create(long address) {
        return new IOURingRecvmsgOut(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRecvmsgOut createSafe(long address) {
        return address == NULL ? null : new IOURingRecvmsgOut(address, null);
    }

    /**
     * Returns a new {@link IOURingRecvmsgOut.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRecvmsgOut.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingRecvmsgOut.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRecvmsgOut.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRecvmsgOut.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRecvmsgOut.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingRecvmsgOut.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingRecvmsgOut.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingRecvmsgOut.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingRecvmsgOut} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRecvmsgOut malloc(MemoryStack stack) {
        return new IOURingRecvmsgOut(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingRecvmsgOut} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRecvmsgOut calloc(MemoryStack stack) {
        return new IOURingRecvmsgOut(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingRecvmsgOut.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRecvmsgOut.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRecvmsgOut.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRecvmsgOut.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #namelen}. */
    public static int nnamelen(long struct) { return UNSAFE.getInt(null, struct + IOURingRecvmsgOut.NAMELEN); }
    /** Unsafe version of {@link #controllen}. */
    public static int ncontrollen(long struct) { return UNSAFE.getInt(null, struct + IOURingRecvmsgOut.CONTROLLEN); }
    /** Unsafe version of {@link #payloadlen}. */
    public static int npayloadlen(long struct) { return UNSAFE.getInt(null, struct + IOURingRecvmsgOut.PAYLOADLEN); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + IOURingRecvmsgOut.FLAGS); }

    /** Unsafe version of {@link #namelen(int) namelen}. */
    public static void nnamelen(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRecvmsgOut.NAMELEN, value); }
    /** Unsafe version of {@link #controllen(int) controllen}. */
    public static void ncontrollen(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRecvmsgOut.CONTROLLEN, value); }
    /** Unsafe version of {@link #payloadlen(int) payloadlen}. */
    public static void npayloadlen(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRecvmsgOut.PAYLOADLEN, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + IOURingRecvmsgOut.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link IOURingRecvmsgOut} structs. */
    public static class Buffer extends StructBuffer<IOURingRecvmsgOut, Buffer> implements NativeResource {

        private static final IOURingRecvmsgOut ELEMENT_FACTORY = IOURingRecvmsgOut.create(-1L);

        /**
         * Creates a new {@code IOURingRecvmsgOut.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingRecvmsgOut#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingRecvmsgOut getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code namelen} field. */
        @NativeType("__u32")
        public int namelen() { return IOURingRecvmsgOut.nnamelen(address()); }
        /** @return the value of the {@code controllen} field. */
        @NativeType("__u32")
        public int controllen() { return IOURingRecvmsgOut.ncontrollen(address()); }
        /** @return the value of the {@code payloadlen} field. */
        @NativeType("__u32")
        public int payloadlen() { return IOURingRecvmsgOut.npayloadlen(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingRecvmsgOut.nflags(address()); }

        /** Sets the specified value to the {@code namelen} field. */
        public IOURingRecvmsgOut.Buffer namelen(@NativeType("__u32") int value) { IOURingRecvmsgOut.nnamelen(address(), value); return this; }
        /** Sets the specified value to the {@code controllen} field. */
        public IOURingRecvmsgOut.Buffer controllen(@NativeType("__u32") int value) { IOURingRecvmsgOut.ncontrollen(address(), value); return this; }
        /** Sets the specified value to the {@code payloadlen} field. */
        public IOURingRecvmsgOut.Buffer payloadlen(@NativeType("__u32") int value) { IOURingRecvmsgOut.npayloadlen(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingRecvmsgOut.Buffer flags(@NativeType("__u32") int value) { IOURingRecvmsgOut.nflags(address(), value); return this; }

    }

}