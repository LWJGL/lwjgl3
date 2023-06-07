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
 * struct io_uring_getevents_arg {
 *     __u64 sigmask;
 *     __u32 sigmask_sz;
 *     __u32 pad;
 *     __u64 ts;
 * }</code></pre>
 */
@NativeType("struct io_uring_getevents_arg")
public class IOURingGeteventsArg extends Struct<IOURingGeteventsArg> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIGMASK,
        SIGMASK_SZ,
        PAD,
        TS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIGMASK = layout.offsetof(0);
        SIGMASK_SZ = layout.offsetof(1);
        PAD = layout.offsetof(2);
        TS = layout.offsetof(3);
    }

    protected IOURingGeteventsArg(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingGeteventsArg create(long address, @Nullable ByteBuffer container) {
        return new IOURingGeteventsArg(address, container);
    }

    /**
     * Creates a {@code IOURingGeteventsArg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingGeteventsArg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sigmask} field. */
    @NativeType("__u64")
    public long sigmask() { return nsigmask(address()); }
    /** @return the value of the {@code sigmask_sz} field. */
    @NativeType("__u32")
    public int sigmask_sz() { return nsigmask_sz(address()); }
    /** @return the value of the {@code pad} field. */
    @NativeType("__u32")
    public int pad() { return npad(address()); }
    /** @return the value of the {@code ts} field. */
    @NativeType("__u64")
    public long ts() { return nts(address()); }

    /** Sets the specified value to the {@code sigmask} field. */
    public IOURingGeteventsArg sigmask(@NativeType("__u64") long value) { nsigmask(address(), value); return this; }
    /** Sets the specified value to the {@code sigmask_sz} field. */
    public IOURingGeteventsArg sigmask_sz(@NativeType("__u32") int value) { nsigmask_sz(address(), value); return this; }
    /** Sets the specified value to the {@code pad} field. */
    public IOURingGeteventsArg pad(@NativeType("__u32") int value) { npad(address(), value); return this; }
    /** Sets the specified value to the {@code ts} field. */
    public IOURingGeteventsArg ts(@NativeType("__u64") long value) { nts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingGeteventsArg set(
        long sigmask,
        int sigmask_sz,
        int pad,
        long ts
    ) {
        sigmask(sigmask);
        sigmask_sz(sigmask_sz);
        pad(pad);
        ts(ts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingGeteventsArg set(IOURingGeteventsArg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingGeteventsArg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingGeteventsArg malloc() {
        return new IOURingGeteventsArg(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingGeteventsArg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingGeteventsArg calloc() {
        return new IOURingGeteventsArg(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingGeteventsArg} instance allocated with {@link BufferUtils}. */
    public static IOURingGeteventsArg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingGeteventsArg(memAddress(container), container);
    }

    /** Returns a new {@code IOURingGeteventsArg} instance for the specified memory address. */
    public static IOURingGeteventsArg create(long address) {
        return new IOURingGeteventsArg(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingGeteventsArg createSafe(long address) {
        return address == NULL ? null : new IOURingGeteventsArg(address, null);
    }

    /**
     * Returns a new {@link IOURingGeteventsArg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingGeteventsArg.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingGeteventsArg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingGeteventsArg.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingGeteventsArg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingGeteventsArg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingGeteventsArg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingGeteventsArg.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingGeteventsArg.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingGeteventsArg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingGeteventsArg malloc(MemoryStack stack) {
        return new IOURingGeteventsArg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingGeteventsArg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingGeteventsArg calloc(MemoryStack stack) {
        return new IOURingGeteventsArg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingGeteventsArg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingGeteventsArg.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingGeteventsArg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingGeteventsArg.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sigmask}. */
    public static long nsigmask(long struct) { return UNSAFE.getLong(null, struct + IOURingGeteventsArg.SIGMASK); }
    /** Unsafe version of {@link #sigmask_sz}. */
    public static int nsigmask_sz(long struct) { return UNSAFE.getInt(null, struct + IOURingGeteventsArg.SIGMASK_SZ); }
    /** Unsafe version of {@link #pad}. */
    public static int npad(long struct) { return UNSAFE.getInt(null, struct + IOURingGeteventsArg.PAD); }
    /** Unsafe version of {@link #ts}. */
    public static long nts(long struct) { return UNSAFE.getLong(null, struct + IOURingGeteventsArg.TS); }

    /** Unsafe version of {@link #sigmask(long) sigmask}. */
    public static void nsigmask(long struct, long value) { UNSAFE.putLong(null, struct + IOURingGeteventsArg.SIGMASK, value); }
    /** Unsafe version of {@link #sigmask_sz(int) sigmask_sz}. */
    public static void nsigmask_sz(long struct, int value) { UNSAFE.putInt(null, struct + IOURingGeteventsArg.SIGMASK_SZ, value); }
    /** Unsafe version of {@link #pad(int) pad}. */
    public static void npad(long struct, int value) { UNSAFE.putInt(null, struct + IOURingGeteventsArg.PAD, value); }
    /** Unsafe version of {@link #ts(long) ts}. */
    public static void nts(long struct, long value) { UNSAFE.putLong(null, struct + IOURingGeteventsArg.TS, value); }

    // -----------------------------------

    /** An array of {@link IOURingGeteventsArg} structs. */
    public static class Buffer extends StructBuffer<IOURingGeteventsArg, Buffer> implements NativeResource {

        private static final IOURingGeteventsArg ELEMENT_FACTORY = IOURingGeteventsArg.create(-1L);

        /**
         * Creates a new {@code IOURingGeteventsArg.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingGeteventsArg#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingGeteventsArg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sigmask} field. */
        @NativeType("__u64")
        public long sigmask() { return IOURingGeteventsArg.nsigmask(address()); }
        /** @return the value of the {@code sigmask_sz} field. */
        @NativeType("__u32")
        public int sigmask_sz() { return IOURingGeteventsArg.nsigmask_sz(address()); }
        /** @return the value of the {@code pad} field. */
        @NativeType("__u32")
        public int pad() { return IOURingGeteventsArg.npad(address()); }
        /** @return the value of the {@code ts} field. */
        @NativeType("__u64")
        public long ts() { return IOURingGeteventsArg.nts(address()); }

        /** Sets the specified value to the {@code sigmask} field. */
        public IOURingGeteventsArg.Buffer sigmask(@NativeType("__u64") long value) { IOURingGeteventsArg.nsigmask(address(), value); return this; }
        /** Sets the specified value to the {@code sigmask_sz} field. */
        public IOURingGeteventsArg.Buffer sigmask_sz(@NativeType("__u32") int value) { IOURingGeteventsArg.nsigmask_sz(address(), value); return this; }
        /** Sets the specified value to the {@code pad} field. */
        public IOURingGeteventsArg.Buffer pad(@NativeType("__u32") int value) { IOURingGeteventsArg.npad(address(), value); return this; }
        /** Sets the specified value to the {@code ts} field. */
        public IOURingGeteventsArg.Buffer ts(@NativeType("__u64") long value) { IOURingGeteventsArg.nts(address(), value); return this; }

    }

}