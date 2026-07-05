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
 * <pre><code>
 * struct io_uring_task_restriction {
 *     __u16 flags;
 *     __u16 nr_res;
 *     __u32 resv[3];
 *     {@link IOURingRestriction struct io_uring_restriction} restrictions[0];
 * }</code></pre>
 */
@NativeType("struct io_uring_task_restriction")
public class IOURingTaskRestriction extends Struct<IOURingTaskRestriction> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        NR_RES,
        RESV,
        RESTRICTIONS;

    static {
        IOURingRestriction.createSafe(NULL);

        Layout layout = __struct(
            __member(2),
            __member(2),
            __array(4, 3),
            __array(IOURingRestriction.SIZEOF, IOURingRestriction.ALIGNOF, 0)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        NR_RES = layout.offsetof(1);
        RESV = layout.offsetof(2);
        RESTRICTIONS = layout.offsetof(3);
    }

    protected IOURingTaskRestriction(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingTaskRestriction create(long address, @Nullable ByteBuffer container) {
        return new IOURingTaskRestriction(address, container);
    }

    /**
     * Creates a {@code IOURingTaskRestriction} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingTaskRestriction(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("__u16")
    public short flags() { return nflags(address()); }
    /** @return the value of the {@code nr_res} field. */
    @NativeType("__u16")
    public short nr_res() { return nnr_res(address()); }
    /** @return a {@link IOURingRestriction}.Buffer view of the {@code restrictions} field. */
    @NativeType("struct io_uring_restriction[0]")
    public IOURingRestriction.Buffer restrictions() { return nrestrictions(address()); }
    /** @return a {@link IOURingRestriction} view of the struct at the specified index of the {@code restrictions} field. */
    @NativeType("struct io_uring_restriction")
    public IOURingRestriction restrictions(int index) { return nrestrictions(address(), index); }

    /** Sets the specified value to the {@code flags} field. */
    public IOURingTaskRestriction flags(@NativeType("__u16") short value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code nr_res} field. */
    public IOURingTaskRestriction nr_res(@NativeType("__u16") short value) { nnr_res(address(), value); return this; }
    /** Copies the specified {@link IOURingRestriction.Buffer} to the {@code restrictions} field. */
    public IOURingTaskRestriction restrictions(@NativeType("struct io_uring_restriction[0]") IOURingRestriction.Buffer value) { nrestrictions(address(), value); return this; }
    /** Copies the specified {@link IOURingRestriction} at the specified index of the {@code restrictions} field. */
    public IOURingTaskRestriction restrictions(int index, @NativeType("struct io_uring_restriction") IOURingRestriction value) { nrestrictions(address(), index, value); return this; }
    /** Passes the {@code restrictions} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingTaskRestriction restrictions(java.util.function.Consumer<IOURingRestriction.Buffer> consumer) { consumer.accept(restrictions()); return this; }
    /** Passes the element at {@code index} of the {@code restrictions} field to the specified {@link java.util.function.Consumer Consumer}. */
    public IOURingTaskRestriction restrictions(int index, java.util.function.Consumer<IOURingRestriction> consumer) { consumer.accept(restrictions(index)); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingTaskRestriction set(
        short flags,
        short nr_res,
        IOURingRestriction.Buffer restrictions
    ) {
        flags(flags);
        nr_res(nr_res);
        restrictions(restrictions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingTaskRestriction set(IOURingTaskRestriction src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingTaskRestriction} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingTaskRestriction malloc() {
        return new IOURingTaskRestriction(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingTaskRestriction} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingTaskRestriction calloc() {
        return new IOURingTaskRestriction(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingTaskRestriction} instance allocated with {@link BufferUtils}. */
    public static IOURingTaskRestriction create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingTaskRestriction(memAddress(container), container);
    }

    /** Returns a new {@code IOURingTaskRestriction} instance for the specified memory address. */
    public static IOURingTaskRestriction create(long address) {
        return new IOURingTaskRestriction(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingTaskRestriction createSafe(long address) {
        return address == NULL ? null : new IOURingTaskRestriction(address, null);
    }

    /**
     * Returns a new {@link IOURingTaskRestriction.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingTaskRestriction.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingTaskRestriction.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingTaskRestriction.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingTaskRestriction.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingTaskRestriction.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingTaskRestriction.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingTaskRestriction.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingTaskRestriction.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingTaskRestriction} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingTaskRestriction malloc(MemoryStack stack) {
        return new IOURingTaskRestriction(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingTaskRestriction} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingTaskRestriction calloc(MemoryStack stack) {
        return new IOURingTaskRestriction(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingTaskRestriction.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingTaskRestriction.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingTaskRestriction.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingTaskRestriction.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static short nflags(long struct) { return memGetShort(struct + IOURingTaskRestriction.FLAGS); }
    /** Unsafe version of {@link #nr_res}. */
    public static short nnr_res(long struct) { return memGetShort(struct + IOURingTaskRestriction.NR_RES); }
    static IntBuffer nresv(long struct) { return memIntBuffer(struct + IOURingTaskRestriction.RESV, 3); }
    static int nresv(long struct, int index) {
        return memGetInt(struct + IOURingTaskRestriction.RESV + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #restrictions}. */
    public static IOURingRestriction.Buffer nrestrictions(long struct) { return IOURingRestriction.create(struct + IOURingTaskRestriction.RESTRICTIONS, 0); }
    /** Unsafe version of {@link #restrictions(int) restrictions}. */
    public static IOURingRestriction nrestrictions(long struct, int index) {
        return IOURingRestriction.create(struct + IOURingTaskRestriction.RESTRICTIONS + check(index, 0) * IOURingRestriction.SIZEOF);
    }

    /** Unsafe version of {@link #flags(short) flags}. */
    public static void nflags(long struct, short value) { memPutShort(struct + IOURingTaskRestriction.FLAGS, value); }
    /** Unsafe version of {@link #nr_res(short) nr_res}. */
    public static void nnr_res(long struct, short value) { memPutShort(struct + IOURingTaskRestriction.NR_RES, value); }
    static void nresv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingTaskRestriction.RESV, value.remaining() * 4);
    }
    static void nresv(long struct, int index, int value) {
        memPutInt(struct + IOURingTaskRestriction.RESV + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #restrictions(IOURingRestriction.Buffer) restrictions}. */
    public static void nrestrictions(long struct, IOURingRestriction.Buffer value) {
        if (CHECKS) { checkGT(value, 0); }
        memCopy(value.address(), struct + IOURingTaskRestriction.RESTRICTIONS, value.remaining() * IOURingRestriction.SIZEOF);
    }
    /** Unsafe version of {@link #restrictions(int, IOURingRestriction) restrictions}. */
    public static void nrestrictions(long struct, int index, IOURingRestriction value) {
        memCopy(value.address(), struct + IOURingTaskRestriction.RESTRICTIONS + check(index, 0) * IOURingRestriction.SIZEOF, IOURingRestriction.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link IOURingTaskRestriction} structs. */
    public static class Buffer extends StructBuffer<IOURingTaskRestriction, Buffer> implements NativeResource {

        private static final IOURingTaskRestriction ELEMENT_FACTORY = IOURingTaskRestriction.create(-1L);

        /**
         * Creates a new {@code IOURingTaskRestriction.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingTaskRestriction#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingTaskRestriction getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("__u16")
        public short flags() { return IOURingTaskRestriction.nflags(address()); }
        /** @return the value of the {@code nr_res} field. */
        @NativeType("__u16")
        public short nr_res() { return IOURingTaskRestriction.nnr_res(address()); }
        /** @return a {@link IOURingRestriction}.Buffer view of the {@code restrictions} field. */
        @NativeType("struct io_uring_restriction[0]")
        public IOURingRestriction.Buffer restrictions() { return IOURingTaskRestriction.nrestrictions(address()); }
        /** @return a {@link IOURingRestriction} view of the struct at the specified index of the {@code restrictions} field. */
        @NativeType("struct io_uring_restriction")
        public IOURingRestriction restrictions(int index) { return IOURingTaskRestriction.nrestrictions(address(), index); }

        /** Sets the specified value to the {@code flags} field. */
        public IOURingTaskRestriction.Buffer flags(@NativeType("__u16") short value) { IOURingTaskRestriction.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code nr_res} field. */
        public IOURingTaskRestriction.Buffer nr_res(@NativeType("__u16") short value) { IOURingTaskRestriction.nnr_res(address(), value); return this; }
        /** Copies the specified {@link IOURingRestriction.Buffer} to the {@code restrictions} field. */
        public IOURingTaskRestriction.Buffer restrictions(@NativeType("struct io_uring_restriction[0]") IOURingRestriction.Buffer value) { IOURingTaskRestriction.nrestrictions(address(), value); return this; }
        /** Copies the specified {@link IOURingRestriction} at the specified index of the {@code restrictions} field. */
        public IOURingTaskRestriction.Buffer restrictions(int index, @NativeType("struct io_uring_restriction") IOURingRestriction value) { IOURingTaskRestriction.nrestrictions(address(), index, value); return this; }
        /** Passes the {@code restrictions} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingTaskRestriction.Buffer restrictions(java.util.function.Consumer<IOURingRestriction.Buffer> consumer) { consumer.accept(restrictions()); return this; }
        /** Passes the element at {@code index} of the {@code restrictions} field to the specified {@link java.util.function.Consumer Consumer}. */
        public IOURingTaskRestriction.Buffer restrictions(int index, java.util.function.Consumer<IOURingRestriction> consumer) { consumer.accept(restrictions(index)); return this; }

    }

}