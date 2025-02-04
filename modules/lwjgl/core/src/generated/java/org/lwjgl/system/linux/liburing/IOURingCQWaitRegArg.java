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

/**
 * <pre>{@code
 * struct io_uring_cqwait_reg_arg {
 *     __u32 flags;
 *     __u32 struct_size;
 *     __u32 nr_entries;
 *     __u32 pad;
 *     __u64 user_addr;
 *     __u64 pad2[3];
 * }}</pre>
 */
@NativeType("struct io_uring_cqwait_reg_arg")
public class IOURingCQWaitRegArg extends Struct<IOURingCQWaitRegArg> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        STRUCT_SIZE,
        NR_ENTRIES,
        PAD,
        USER_ADDR,
        PAD2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __array(8, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        STRUCT_SIZE = layout.offsetof(1);
        NR_ENTRIES = layout.offsetof(2);
        PAD = layout.offsetof(3);
        USER_ADDR = layout.offsetof(4);
        PAD2 = layout.offsetof(5);
    }

    protected IOURingCQWaitRegArg(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingCQWaitRegArg create(long address, @Nullable ByteBuffer container) {
        return new IOURingCQWaitRegArg(address, container);
    }

    /**
     * Creates a {@code IOURingCQWaitRegArg} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingCQWaitRegArg(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code struct_size} field. */
    @NativeType("__u32")
    public int struct_size() { return nstruct_size(address()); }
    /** @return the value of the {@code nr_entries} field. */
    @NativeType("__u32")
    public int nr_entries() { return nnr_entries(address()); }
    /** @return the value of the {@code pad} field. */
    @NativeType("__u32")
    public int pad() { return npad(address()); }
    /** @return the value of the {@code user_addr} field. */
    @NativeType("__u64")
    public long user_addr() { return nuser_addr(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public IOURingCQWaitRegArg flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code struct_size} field. */
    public IOURingCQWaitRegArg struct_size(@NativeType("__u32") int value) { nstruct_size(address(), value); return this; }
    /** Sets the specified value to the {@code nr_entries} field. */
    public IOURingCQWaitRegArg nr_entries(@NativeType("__u32") int value) { nnr_entries(address(), value); return this; }
    /** Sets the specified value to the {@code pad} field. */
    public IOURingCQWaitRegArg pad(@NativeType("__u32") int value) { npad(address(), value); return this; }
    /** Sets the specified value to the {@code user_addr} field. */
    public IOURingCQWaitRegArg user_addr(@NativeType("__u64") long value) { nuser_addr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingCQWaitRegArg set(
        int flags,
        int struct_size,
        int nr_entries,
        int pad,
        long user_addr
    ) {
        flags(flags);
        struct_size(struct_size);
        nr_entries(nr_entries);
        pad(pad);
        user_addr(user_addr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingCQWaitRegArg set(IOURingCQWaitRegArg src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingCQWaitRegArg} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingCQWaitRegArg malloc() {
        return new IOURingCQWaitRegArg(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingCQWaitRegArg} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingCQWaitRegArg calloc() {
        return new IOURingCQWaitRegArg(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingCQWaitRegArg} instance allocated with {@link BufferUtils}. */
    public static IOURingCQWaitRegArg create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingCQWaitRegArg(memAddress(container), container);
    }

    /** Returns a new {@code IOURingCQWaitRegArg} instance for the specified memory address. */
    public static IOURingCQWaitRegArg create(long address) {
        return new IOURingCQWaitRegArg(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingCQWaitRegArg createSafe(long address) {
        return address == NULL ? null : new IOURingCQWaitRegArg(address, null);
    }

    /**
     * Returns a new {@link IOURingCQWaitRegArg.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQWaitRegArg.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingCQWaitRegArg.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQWaitRegArg.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQWaitRegArg.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQWaitRegArg.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingCQWaitRegArg.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingCQWaitRegArg.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingCQWaitRegArg.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingCQWaitRegArg} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQWaitRegArg malloc(MemoryStack stack) {
        return new IOURingCQWaitRegArg(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingCQWaitRegArg} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQWaitRegArg calloc(MemoryStack stack) {
        return new IOURingCQWaitRegArg(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingCQWaitRegArg.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQWaitRegArg.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQWaitRegArg.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQWaitRegArg.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingCQWaitRegArg.FLAGS); }
    /** Unsafe version of {@link #struct_size}. */
    public static int nstruct_size(long struct) { return memGetInt(struct + IOURingCQWaitRegArg.STRUCT_SIZE); }
    /** Unsafe version of {@link #nr_entries}. */
    public static int nnr_entries(long struct) { return memGetInt(struct + IOURingCQWaitRegArg.NR_ENTRIES); }
    /** Unsafe version of {@link #pad}. */
    public static int npad(long struct) { return memGetInt(struct + IOURingCQWaitRegArg.PAD); }
    /** Unsafe version of {@link #user_addr}. */
    public static long nuser_addr(long struct) { return memGetLong(struct + IOURingCQWaitRegArg.USER_ADDR); }
    public static LongBuffer npad2(long struct) { return memLongBuffer(struct + IOURingCQWaitRegArg.PAD2, 3); }
    public static long npad2(long struct, int index) {
        return memGetLong(struct + IOURingCQWaitRegArg.PAD2 + check(index, 3) * 8);
    }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingCQWaitRegArg.FLAGS, value); }
    /** Unsafe version of {@link #struct_size(int) struct_size}. */
    public static void nstruct_size(long struct, int value) { memPutInt(struct + IOURingCQWaitRegArg.STRUCT_SIZE, value); }
    /** Unsafe version of {@link #nr_entries(int) nr_entries}. */
    public static void nnr_entries(long struct, int value) { memPutInt(struct + IOURingCQWaitRegArg.NR_ENTRIES, value); }
    /** Unsafe version of {@link #pad(int) pad}. */
    public static void npad(long struct, int value) { memPutInt(struct + IOURingCQWaitRegArg.PAD, value); }
    /** Unsafe version of {@link #user_addr(long) user_addr}. */
    public static void nuser_addr(long struct, long value) { memPutLong(struct + IOURingCQWaitRegArg.USER_ADDR, value); }
    public static void npad2(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingCQWaitRegArg.PAD2, value.remaining() * 8);
    }
    public static void npad2(long struct, int index, long value) {
        memPutLong(struct + IOURingCQWaitRegArg.PAD2 + check(index, 3) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingCQWaitRegArg} structs. */
    public static class Buffer extends StructBuffer<IOURingCQWaitRegArg, Buffer> implements NativeResource {

        private static final IOURingCQWaitRegArg ELEMENT_FACTORY = IOURingCQWaitRegArg.create(-1L);

        /**
         * Creates a new {@code IOURingCQWaitRegArg.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingCQWaitRegArg#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingCQWaitRegArg getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingCQWaitRegArg.nflags(address()); }
        /** @return the value of the {@code struct_size} field. */
        @NativeType("__u32")
        public int struct_size() { return IOURingCQWaitRegArg.nstruct_size(address()); }
        /** @return the value of the {@code nr_entries} field. */
        @NativeType("__u32")
        public int nr_entries() { return IOURingCQWaitRegArg.nnr_entries(address()); }
        /** @return the value of the {@code pad} field. */
        @NativeType("__u32")
        public int pad() { return IOURingCQWaitRegArg.npad(address()); }
        /** @return the value of the {@code user_addr} field. */
        @NativeType("__u64")
        public long user_addr() { return IOURingCQWaitRegArg.nuser_addr(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public IOURingCQWaitRegArg.Buffer flags(@NativeType("__u32") int value) { IOURingCQWaitRegArg.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code struct_size} field. */
        public IOURingCQWaitRegArg.Buffer struct_size(@NativeType("__u32") int value) { IOURingCQWaitRegArg.nstruct_size(address(), value); return this; }
        /** Sets the specified value to the {@code nr_entries} field. */
        public IOURingCQWaitRegArg.Buffer nr_entries(@NativeType("__u32") int value) { IOURingCQWaitRegArg.nnr_entries(address(), value); return this; }
        /** Sets the specified value to the {@code pad} field. */
        public IOURingCQWaitRegArg.Buffer pad(@NativeType("__u32") int value) { IOURingCQWaitRegArg.npad(address(), value); return this; }
        /** Sets the specified value to the {@code user_addr} field. */
        public IOURingCQWaitRegArg.Buffer user_addr(@NativeType("__u64") long value) { IOURingCQWaitRegArg.nuser_addr(address(), value); return this; }

    }

}