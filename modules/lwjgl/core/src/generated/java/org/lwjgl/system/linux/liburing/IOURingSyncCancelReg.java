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

import org.lwjgl.system.linux.*;

/**
 * Argument for {@link LibIOURing#IORING_REGISTER_SYNC_CANCEL REGISTER_SYNC_CANCEL}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_sync_cancel_reg {
 *     __u64 addr;
 *     __s32 fd;
 *     __u32 flags;
 *     {@link KernelTimespec struct __kernel_timespec} timeout;
 *     __u64 pad[4];
 * }</code></pre>
 */
@NativeType("struct io_uring_sync_cancel_reg")
public class IOURingSyncCancelReg extends Struct<IOURingSyncCancelReg> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDR,
        FD,
        FLAGS,
        TIMEOUT,
        PAD;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(KernelTimespec.SIZEOF, KernelTimespec.ALIGNOF),
            __array(8, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDR = layout.offsetof(0);
        FD = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
        PAD = layout.offsetof(4);
    }

    protected IOURingSyncCancelReg(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingSyncCancelReg create(long address, @Nullable ByteBuffer container) {
        return new IOURingSyncCancelReg(address, container);
    }

    /**
     * Creates a {@code IOURingSyncCancelReg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingSyncCancelReg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code addr} field. */
    @NativeType("__u64")
    public long addr() { return naddr(address()); }
    /** @return the value of the {@code fd} field. */
    @NativeType("__s32")
    public int fd() { return nfd(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return a {@link KernelTimespec} view of the {@code timeout} field. */
    @NativeType("struct __kernel_timespec")
    public KernelTimespec timeout() { return ntimeout(address()); }

    /** Sets the specified value to the {@code addr} field. */
    public IOURingSyncCancelReg addr(@NativeType("__u64") long value) { naddr(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
    public IOURingSyncCancelReg fd(@NativeType("__s32") int value) { nfd(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingSyncCancelReg flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link KernelTimespec} to the {@code timeout} field. */
    public IOURingSyncCancelReg timeout(@NativeType("struct __kernel_timespec") KernelTimespec value) { ntimeout(address(), value); return this; }
    /** Passes the {@code timeout} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingSyncCancelReg timeout(java.util.function.Consumer<KernelTimespec> consumer) { consumer.accept(timeout()); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingSyncCancelReg set(
        long addr,
        int fd,
        int flags,
        KernelTimespec timeout
    ) {
        addr(addr);
        fd(fd);
        flags(flags);
        timeout(timeout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingSyncCancelReg set(IOURingSyncCancelReg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingSyncCancelReg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingSyncCancelReg malloc() {
        return new IOURingSyncCancelReg(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingSyncCancelReg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingSyncCancelReg calloc() {
        return new IOURingSyncCancelReg(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingSyncCancelReg} instance allocated with {@link BufferUtils}. */
    public static IOURingSyncCancelReg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingSyncCancelReg(memAddress(container), container);
    }

    /** Returns a new {@code IOURingSyncCancelReg} instance for the specified memory address. */
    public static IOURingSyncCancelReg create(long address) {
        return new IOURingSyncCancelReg(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingSyncCancelReg createSafe(long address) {
        return address == NULL ? null : new IOURingSyncCancelReg(address, null);
    }

    /**
     * Returns a new {@link IOURingSyncCancelReg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSyncCancelReg.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingSyncCancelReg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSyncCancelReg.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingSyncCancelReg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSyncCancelReg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingSyncCancelReg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingSyncCancelReg.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingSyncCancelReg.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingSyncCancelReg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingSyncCancelReg malloc(MemoryStack stack) {
        return new IOURingSyncCancelReg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingSyncCancelReg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingSyncCancelReg calloc(MemoryStack stack) {
        return new IOURingSyncCancelReg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingSyncCancelReg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingSyncCancelReg.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingSyncCancelReg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingSyncCancelReg.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #addr}. */
    public static long naddr(long struct) { return UNSAFE.getLong(null, struct + IOURingSyncCancelReg.ADDR); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return UNSAFE.getInt(null, struct + IOURingSyncCancelReg.FD); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + IOURingSyncCancelReg.FLAGS); }
    /** Unsafe version of {@link #timeout}. */
    public static KernelTimespec ntimeout(long struct) { return KernelTimespec.create(struct + IOURingSyncCancelReg.TIMEOUT); }
    public static LongBuffer npad(long struct) { return memLongBuffer(struct + IOURingSyncCancelReg.PAD, 4); }
    public static long npad(long struct, int index) {
        return UNSAFE.getLong(null, struct + IOURingSyncCancelReg.PAD + check(index, 4) * 8);
    }

    /** Unsafe version of {@link #addr(long) addr}. */
    public static void naddr(long struct, long value) { UNSAFE.putLong(null, struct + IOURingSyncCancelReg.ADDR, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { UNSAFE.putInt(null, struct + IOURingSyncCancelReg.FD, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + IOURingSyncCancelReg.FLAGS, value); }
    /** Unsafe version of {@link #timeout(KernelTimespec) timeout}. */
    public static void ntimeout(long struct, KernelTimespec value) { memCopy(value.address(), struct + IOURingSyncCancelReg.TIMEOUT, KernelTimespec.SIZEOF); }
    public static void npad(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + IOURingSyncCancelReg.PAD, value.remaining() * 8);
    }
    public static void npad(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + IOURingSyncCancelReg.PAD + check(index, 4) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingSyncCancelReg} structs. */
    public static class Buffer extends StructBuffer<IOURingSyncCancelReg, Buffer> implements NativeResource {

        private static final IOURingSyncCancelReg ELEMENT_FACTORY = IOURingSyncCancelReg.create(-1L);

        /**
         * Creates a new {@code IOURingSyncCancelReg.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingSyncCancelReg#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingSyncCancelReg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code addr} field. */
        @NativeType("__u64")
        public long addr() { return IOURingSyncCancelReg.naddr(address()); }
        /** @return the value of the {@code fd} field. */
        @NativeType("__s32")
        public int fd() { return IOURingSyncCancelReg.nfd(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingSyncCancelReg.nflags(address()); }
        /** @return a {@link KernelTimespec} view of the {@code timeout} field. */
        @NativeType("struct __kernel_timespec")
        public KernelTimespec timeout() { return IOURingSyncCancelReg.ntimeout(address()); }

        /** Sets the specified value to the {@code addr} field. */
        public IOURingSyncCancelReg.Buffer addr(@NativeType("__u64") long value) { IOURingSyncCancelReg.naddr(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public IOURingSyncCancelReg.Buffer fd(@NativeType("__s32") int value) { IOURingSyncCancelReg.nfd(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingSyncCancelReg.Buffer flags(@NativeType("__u32") int value) { IOURingSyncCancelReg.nflags(address(), value); return this; }
        /** Copies the specified {@link KernelTimespec} to the {@code timeout} field. */
        public IOURingSyncCancelReg.Buffer timeout(@NativeType("struct __kernel_timespec") KernelTimespec value) { IOURingSyncCancelReg.ntimeout(address(), value); return this; }
        /** Passes the {@code timeout} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingSyncCancelReg.Buffer timeout(java.util.function.Consumer<KernelTimespec> consumer) { consumer.accept(timeout()); return this; }

    }

}