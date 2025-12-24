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
 * struct io_uring_query_hdr {
 *     __u64 next_entry;
 *     __u64 query_data;
 *     __u32 query_op;
 *     __u32 size;
 *     __s32 result;
 *     __u32 __resv[3];
 * }}</pre>
 */
@NativeType("struct io_uring_query_hdr")
public class IOURingQueryHdr extends Struct<IOURingQueryHdr> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NEXT_ENTRY,
        QUERY_DATA,
        QUERY_OP,
        SIZE,
        RESULT,
        __RESV;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NEXT_ENTRY = layout.offsetof(0);
        QUERY_DATA = layout.offsetof(1);
        QUERY_OP = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        RESULT = layout.offsetof(4);
        __RESV = layout.offsetof(5);
    }

    protected IOURingQueryHdr(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingQueryHdr create(long address, @Nullable ByteBuffer container) {
        return new IOURingQueryHdr(address, container);
    }

    /**
     * Creates a {@code IOURingQueryHdr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingQueryHdr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code next_entry} field. */
    @NativeType("__u64")
    public long next_entry() { return nnext_entry(address()); }
    /** @return the value of the {@code query_data} field. */
    @NativeType("__u64")
    public long query_data() { return nquery_data(address()); }
    /** @return the value of the {@code query_op} field. */
    @NativeType("__u32")
    public int query_op() { return nquery_op(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("__u32")
    public int size() { return nsize(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("__s32")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@code next_entry} field. */
    public IOURingQueryHdr next_entry(@NativeType("__u64") long value) { nnext_entry(address(), value); return this; }
    /** Sets the specified value to the {@code query_data} field. */
    public IOURingQueryHdr query_data(@NativeType("__u64") long value) { nquery_data(address(), value); return this; }
    /** Sets the specified value to the {@code query_op} field. */
    public IOURingQueryHdr query_op(@NativeType("__u32") int value) { nquery_op(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public IOURingQueryHdr size(@NativeType("__u32") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code result} field. */
    public IOURingQueryHdr result(@NativeType("__s32") int value) { nresult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingQueryHdr set(
        long next_entry,
        long query_data,
        int query_op,
        int size,
        int result
    ) {
        next_entry(next_entry);
        query_data(query_data);
        query_op(query_op);
        size(size);
        result(result);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingQueryHdr set(IOURingQueryHdr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingQueryHdr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingQueryHdr malloc() {
        return new IOURingQueryHdr(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingQueryHdr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingQueryHdr calloc() {
        return new IOURingQueryHdr(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingQueryHdr} instance allocated with {@link BufferUtils}. */
    public static IOURingQueryHdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingQueryHdr(memAddress(container), container);
    }

    /** Returns a new {@code IOURingQueryHdr} instance for the specified memory address. */
    public static IOURingQueryHdr create(long address) {
        return new IOURingQueryHdr(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingQueryHdr createSafe(long address) {
        return address == NULL ? null : new IOURingQueryHdr(address, null);
    }

    /**
     * Returns a new {@link IOURingQueryHdr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingQueryHdr.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingQueryHdr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingQueryHdr.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingQueryHdr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingQueryHdr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingQueryHdr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingQueryHdr.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingQueryHdr.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingQueryHdr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingQueryHdr malloc(MemoryStack stack) {
        return new IOURingQueryHdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingQueryHdr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingQueryHdr calloc(MemoryStack stack) {
        return new IOURingQueryHdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingQueryHdr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingQueryHdr.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingQueryHdr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingQueryHdr.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #next_entry}. */
    public static long nnext_entry(long struct) { return memGetLong(struct + IOURingQueryHdr.NEXT_ENTRY); }
    /** Unsafe version of {@link #query_data}. */
    public static long nquery_data(long struct) { return memGetLong(struct + IOURingQueryHdr.QUERY_DATA); }
    /** Unsafe version of {@link #query_op}. */
    public static int nquery_op(long struct) { return memGetInt(struct + IOURingQueryHdr.QUERY_OP); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + IOURingQueryHdr.SIZE); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + IOURingQueryHdr.RESULT); }
    public static IntBuffer n__resv(long struct) { return memIntBuffer(struct + IOURingQueryHdr.__RESV, 3); }
    public static int n__resv(long struct, int index) {
        return memGetInt(struct + IOURingQueryHdr.__RESV + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #next_entry(long) next_entry}. */
    public static void nnext_entry(long struct, long value) { memPutLong(struct + IOURingQueryHdr.NEXT_ENTRY, value); }
    /** Unsafe version of {@link #query_data(long) query_data}. */
    public static void nquery_data(long struct, long value) { memPutLong(struct + IOURingQueryHdr.QUERY_DATA, value); }
    /** Unsafe version of {@link #query_op(int) query_op}. */
    public static void nquery_op(long struct, int value) { memPutInt(struct + IOURingQueryHdr.QUERY_OP, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + IOURingQueryHdr.SIZE, value); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { memPutInt(struct + IOURingQueryHdr.RESULT, value); }
    public static void n__resv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingQueryHdr.__RESV, value.remaining() * 4);
    }
    public static void n__resv(long struct, int index, int value) {
        memPutInt(struct + IOURingQueryHdr.__RESV + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingQueryHdr} structs. */
    public static class Buffer extends StructBuffer<IOURingQueryHdr, Buffer> implements NativeResource {

        private static final IOURingQueryHdr ELEMENT_FACTORY = IOURingQueryHdr.create(-1L);

        /**
         * Creates a new {@code IOURingQueryHdr.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingQueryHdr#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingQueryHdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code next_entry} field. */
        @NativeType("__u64")
        public long next_entry() { return IOURingQueryHdr.nnext_entry(address()); }
        /** @return the value of the {@code query_data} field. */
        @NativeType("__u64")
        public long query_data() { return IOURingQueryHdr.nquery_data(address()); }
        /** @return the value of the {@code query_op} field. */
        @NativeType("__u32")
        public int query_op() { return IOURingQueryHdr.nquery_op(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("__u32")
        public int size() { return IOURingQueryHdr.nsize(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("__s32")
        public int result() { return IOURingQueryHdr.nresult(address()); }

        /** Sets the specified value to the {@code next_entry} field. */
        public IOURingQueryHdr.Buffer next_entry(@NativeType("__u64") long value) { IOURingQueryHdr.nnext_entry(address(), value); return this; }
        /** Sets the specified value to the {@code query_data} field. */
        public IOURingQueryHdr.Buffer query_data(@NativeType("__u64") long value) { IOURingQueryHdr.nquery_data(address(), value); return this; }
        /** Sets the specified value to the {@code query_op} field. */
        public IOURingQueryHdr.Buffer query_op(@NativeType("__u32") int value) { IOURingQueryHdr.nquery_op(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public IOURingQueryHdr.Buffer size(@NativeType("__u32") int value) { IOURingQueryHdr.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code result} field. */
        public IOURingQueryHdr.Buffer result(@NativeType("__s32") int value) { IOURingQueryHdr.nresult(address(), value); return this; }

    }

}