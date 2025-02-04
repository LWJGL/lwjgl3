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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.linux.*;

/**
 * <pre>{@code
 * struct io_uring_reg_wait {
 *     {@link KernelTimespec struct __kernel_timespec} ts;
 *     __u32 min_wait_usec;
 *     __u32 flags;
 *     __u64 sigmask;
 *     __u32 sigmask_sz;
 *     __u32 pad[3];
 *     __u64 pad2[2];
 * }}</pre>
 */
@NativeType("struct io_uring_reg_wait")
public class IOURingRegWait extends Struct<IOURingRegWait> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TS,
        MIN_WAIT_USEC,
        FLAGS,
        SIGMASK,
        SIGMASK_SZ,
        PAD,
        PAD2;

    static {
        Layout layout = __struct(
            __member(KernelTimespec.SIZEOF, KernelTimespec.ALIGNOF),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __array(4, 3),
            __array(8, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TS = layout.offsetof(0);
        MIN_WAIT_USEC = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SIGMASK = layout.offsetof(3);
        SIGMASK_SZ = layout.offsetof(4);
        PAD = layout.offsetof(5);
        PAD2 = layout.offsetof(6);
    }

    protected IOURingRegWait(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingRegWait create(long address, @Nullable ByteBuffer container) {
        return new IOURingRegWait(address, container);
    }

    /**
     * Creates a {@code IOURingRegWait} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingRegWait(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link KernelTimespec} view of the {@code ts} field. */
    @NativeType("struct __kernel_timespec")
    public KernelTimespec ts() { return nts(address()); }
    /** @return the value of the {@code min_wait_usec} field. */
    @NativeType("__u32")
    public int min_wait_usec() { return nmin_wait_usec(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code sigmask} field. */
    @NativeType("__u64")
    public long sigmask() { return nsigmask(address()); }
    /** @return the value of the {@code sigmask_sz} field. */
    @NativeType("__u32")
    public int sigmask_sz() { return nsigmask_sz(address()); }

    /** Copies the specified {@link KernelTimespec} to the {@code ts} field. */
    public IOURingRegWait ts(@NativeType("struct __kernel_timespec") KernelTimespec value) { nts(address(), value); return this; }
    /** Passes the {@code ts} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingRegWait ts(java.util.function.Consumer<KernelTimespec> consumer) { consumer.accept(ts()); return this; }
    /** Sets the specified value to the {@code min_wait_usec} field. */
    public IOURingRegWait min_wait_usec(@NativeType("__u32") int value) { nmin_wait_usec(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingRegWait flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code sigmask} field. */
    public IOURingRegWait sigmask(@NativeType("__u64") long value) { nsigmask(address(), value); return this; }
    /** Sets the specified value to the {@code sigmask_sz} field. */
    public IOURingRegWait sigmask_sz(@NativeType("__u32") int value) { nsigmask_sz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingRegWait set(
        KernelTimespec ts,
        int min_wait_usec,
        int flags,
        long sigmask,
        int sigmask_sz
    ) {
        ts(ts);
        min_wait_usec(min_wait_usec);
        flags(flags);
        sigmask(sigmask);
        sigmask_sz(sigmask_sz);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingRegWait set(IOURingRegWait src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingRegWait} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingRegWait malloc() {
        return new IOURingRegWait(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingRegWait} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingRegWait calloc() {
        return new IOURingRegWait(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingRegWait} instance allocated with {@link BufferUtils}. */
    public static IOURingRegWait create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingRegWait(memAddress(container), container);
    }

    /** Returns a new {@code IOURingRegWait} instance for the specified memory address. */
    public static IOURingRegWait create(long address) {
        return new IOURingRegWait(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingRegWait createSafe(long address) {
        return address == NULL ? null : new IOURingRegWait(address, null);
    }

    /**
     * Returns a new {@link IOURingRegWait.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRegWait.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingRegWait.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRegWait.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRegWait.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingRegWait.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingRegWait.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingRegWait.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingRegWait.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingRegWait} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRegWait malloc(MemoryStack stack) {
        return new IOURingRegWait(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingRegWait} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingRegWait calloc(MemoryStack stack) {
        return new IOURingRegWait(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingRegWait.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRegWait.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingRegWait.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingRegWait.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ts}. */
    public static KernelTimespec nts(long struct) { return KernelTimespec.create(struct + IOURingRegWait.TS); }
    /** Unsafe version of {@link #min_wait_usec}. */
    public static int nmin_wait_usec(long struct) { return memGetInt(struct + IOURingRegWait.MIN_WAIT_USEC); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingRegWait.FLAGS); }
    /** Unsafe version of {@link #sigmask}. */
    public static long nsigmask(long struct) { return memGetLong(struct + IOURingRegWait.SIGMASK); }
    /** Unsafe version of {@link #sigmask_sz}. */
    public static int nsigmask_sz(long struct) { return memGetInt(struct + IOURingRegWait.SIGMASK_SZ); }
    public static IntBuffer npad(long struct) { return memIntBuffer(struct + IOURingRegWait.PAD, 3); }
    public static int npad(long struct, int index) {
        return memGetInt(struct + IOURingRegWait.PAD + check(index, 3) * 4);
    }
    public static LongBuffer npad2(long struct) { return memLongBuffer(struct + IOURingRegWait.PAD2, 2); }
    public static long npad2(long struct, int index) {
        return memGetLong(struct + IOURingRegWait.PAD2 + check(index, 2) * 8);
    }

    /** Unsafe version of {@link #ts(KernelTimespec) ts}. */
    public static void nts(long struct, KernelTimespec value) { memCopy(value.address(), struct + IOURingRegWait.TS, KernelTimespec.SIZEOF); }
    /** Unsafe version of {@link #min_wait_usec(int) min_wait_usec}. */
    public static void nmin_wait_usec(long struct, int value) { memPutInt(struct + IOURingRegWait.MIN_WAIT_USEC, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingRegWait.FLAGS, value); }
    /** Unsafe version of {@link #sigmask(long) sigmask}. */
    public static void nsigmask(long struct, long value) { memPutLong(struct + IOURingRegWait.SIGMASK, value); }
    /** Unsafe version of {@link #sigmask_sz(int) sigmask_sz}. */
    public static void nsigmask_sz(long struct, int value) { memPutInt(struct + IOURingRegWait.SIGMASK_SZ, value); }
    public static void npad(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingRegWait.PAD, value.remaining() * 4);
    }
    public static void npad(long struct, int index, int value) {
        memPutInt(struct + IOURingRegWait.PAD + check(index, 3) * 4, value);
    }
    public static void npad2(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + IOURingRegWait.PAD2, value.remaining() * 8);
    }
    public static void npad2(long struct, int index, long value) {
        memPutLong(struct + IOURingRegWait.PAD2 + check(index, 2) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingRegWait} structs. */
    public static class Buffer extends StructBuffer<IOURingRegWait, Buffer> implements NativeResource {

        private static final IOURingRegWait ELEMENT_FACTORY = IOURingRegWait.create(-1L);

        /**
         * Creates a new {@code IOURingRegWait.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingRegWait#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingRegWait getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link KernelTimespec} view of the {@code ts} field. */
        @NativeType("struct __kernel_timespec")
        public KernelTimespec ts() { return IOURingRegWait.nts(address()); }
        /** @return the value of the {@code min_wait_usec} field. */
        @NativeType("__u32")
        public int min_wait_usec() { return IOURingRegWait.nmin_wait_usec(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingRegWait.nflags(address()); }
        /** @return the value of the {@code sigmask} field. */
        @NativeType("__u64")
        public long sigmask() { return IOURingRegWait.nsigmask(address()); }
        /** @return the value of the {@code sigmask_sz} field. */
        @NativeType("__u32")
        public int sigmask_sz() { return IOURingRegWait.nsigmask_sz(address()); }

        /** Copies the specified {@link KernelTimespec} to the {@code ts} field. */
        public IOURingRegWait.Buffer ts(@NativeType("struct __kernel_timespec") KernelTimespec value) { IOURingRegWait.nts(address(), value); return this; }
        /** Passes the {@code ts} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingRegWait.Buffer ts(java.util.function.Consumer<KernelTimespec> consumer) { consumer.accept(ts()); return this; }
        /** Sets the specified value to the {@code min_wait_usec} field. */
        public IOURingRegWait.Buffer min_wait_usec(@NativeType("__u32") int value) { IOURingRegWait.nmin_wait_usec(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingRegWait.Buffer flags(@NativeType("__u32") int value) { IOURingRegWait.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code sigmask} field. */
        public IOURingRegWait.Buffer sigmask(@NativeType("__u64") long value) { IOURingRegWait.nsigmask(address(), value); return this; }
        /** Sets the specified value to the {@code sigmask_sz} field. */
        public IOURingRegWait.Buffer sigmask_sz(@NativeType("__u32") int value) { IOURingRegWait.nsigmask_sz(address(), value); return this; }

    }

}