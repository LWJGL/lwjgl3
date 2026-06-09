/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrDataSource {
 *     void * userdata;
 *     {@link ExrFetchCallbackI ExrFetchCallback} fetch;
 *     {@link ExrFetchCancelI ExrFetchCancel} cancel;
 *     uint64_t total_size;
 *     uint32_t flags;
 * }</code></pre>
 */
public class ExrDataSource extends Struct<ExrDataSource> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        FETCH,
        CANCEL,
        TOTAL_SIZE,
        FLAGS;

    static {
        java.util.Objects.requireNonNull(ExrFetchCallbackI.DESCRIPTOR);
        java.util.Objects.requireNonNull(ExrFetchCancelI.DESCRIPTOR);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        FETCH = layout.offsetof(1);
        CANCEL = layout.offsetof(2);
        TOTAL_SIZE = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected ExrDataSource(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDataSource create(long address, @Nullable ByteBuffer container) {
        return new ExrDataSource(address, container);
    }

    /**
     * Creates a {@code ExrDataSource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDataSource(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code fetch} field. */
    public ExrFetchCallback fetch() { return nfetch(address()); }
    /** @return the value of the {@code cancel} field. */
    public @Nullable ExrFetchCancel cancel() { return ncancel(address()); }
    /** @return the value of the {@code total_size} field. */
    @NativeType("uint64_t")
    public long total_size() { return ntotal_size(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code userdata} field. */
    public ExrDataSource userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code fetch} field. */
    public ExrDataSource fetch(@NativeType("ExrFetchCallback") ExrFetchCallbackI value) { nfetch(address(), value); return this; }
    /** Sets the specified value to the {@code cancel} field. */
    public ExrDataSource cancel(@Nullable @NativeType("ExrFetchCancel") ExrFetchCancelI value) { ncancel(address(), value); return this; }
    /** Sets the specified value to the {@code total_size} field. */
    public ExrDataSource total_size(@NativeType("uint64_t") long value) { ntotal_size(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrDataSource flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDataSource set(
        long userdata,
        ExrFetchCallbackI fetch,
        ExrFetchCancelI cancel,
        long total_size,
        int flags
    ) {
        userdata(userdata);
        fetch(fetch);
        cancel(cancel);
        total_size(total_size);
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
    public ExrDataSource set(ExrDataSource src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDataSource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDataSource malloc() {
        return new ExrDataSource(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDataSource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDataSource calloc() {
        return new ExrDataSource(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDataSource} instance allocated with {@link BufferUtils}. */
    public static ExrDataSource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDataSource(memAddress(container), container);
    }

    /** Returns a new {@code ExrDataSource} instance for the specified memory address. */
    public static ExrDataSource create(long address) {
        return new ExrDataSource(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDataSource createSafe(long address) {
        return address == NULL ? null : new ExrDataSource(address, null);
    }

    /**
     * Returns a new {@link ExrDataSource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDataSource.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDataSource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDataSource.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDataSource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDataSource.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDataSource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDataSource.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDataSource.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDataSource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDataSource malloc(MemoryStack stack) {
        return new ExrDataSource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDataSource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDataSource calloc(MemoryStack stack) {
        return new ExrDataSource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDataSource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDataSource.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDataSource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDataSource.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + ExrDataSource.USERDATA); }
    /** Unsafe version of {@link #fetch}. */
    public static ExrFetchCallback nfetch(long struct) { return ExrFetchCallback.create(memGetAddress(struct + ExrDataSource.FETCH)); }
    /** Unsafe version of {@link #cancel}. */
    public static @Nullable ExrFetchCancel ncancel(long struct) { return ExrFetchCancel.createSafe(memGetAddress(struct + ExrDataSource.CANCEL)); }
    /** Unsafe version of {@link #total_size}. */
    public static long ntotal_size(long struct) { return memGetLong(struct + ExrDataSource.TOTAL_SIZE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrDataSource.FLAGS); }

    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + ExrDataSource.USERDATA, value); }
    /** Unsafe version of {@link #fetch(ExrFetchCallbackI) fetch}. */
    public static void nfetch(long struct, ExrFetchCallbackI value) { memPutAddress(struct + ExrDataSource.FETCH, value.address()); }
    /** Unsafe version of {@link #cancel(ExrFetchCancelI) cancel}. */
    public static void ncancel(long struct, @Nullable ExrFetchCancelI value) { memPutAddress(struct + ExrDataSource.CANCEL, memAddressSafe(value)); }
    /** Unsafe version of {@link #total_size(long) total_size}. */
    public static void ntotal_size(long struct, long value) { memPutLong(struct + ExrDataSource.TOTAL_SIZE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrDataSource.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDataSource.FETCH));
    }

    // -----------------------------------

    /** An array of {@link ExrDataSource} structs. */
    public static class Buffer extends StructBuffer<ExrDataSource, Buffer> implements NativeResource {

        private static final ExrDataSource ELEMENT_FACTORY = ExrDataSource.create(-1L);

        /**
         * Creates a new {@code ExrDataSource.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDataSource#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDataSource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return ExrDataSource.nuserdata(address()); }
        /** @return the value of the {@code fetch} field. */
        public ExrFetchCallback fetch() { return ExrDataSource.nfetch(address()); }
        /** @return the value of the {@code cancel} field. */
        public @Nullable ExrFetchCancel cancel() { return ExrDataSource.ncancel(address()); }
        /** @return the value of the {@code total_size} field. */
        @NativeType("uint64_t")
        public long total_size() { return ExrDataSource.ntotal_size(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrDataSource.nflags(address()); }

        /** Sets the specified value to the {@code userdata} field. */
        public ExrDataSource.Buffer userdata(@NativeType("void *") long value) { ExrDataSource.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code fetch} field. */
        public ExrDataSource.Buffer fetch(@NativeType("ExrFetchCallback") ExrFetchCallbackI value) { ExrDataSource.nfetch(address(), value); return this; }
        /** Sets the specified value to the {@code cancel} field. */
        public ExrDataSource.Buffer cancel(@Nullable @NativeType("ExrFetchCancel") ExrFetchCancelI value) { ExrDataSource.ncancel(address(), value); return this; }
        /** Sets the specified value to the {@code total_size} field. */
        public ExrDataSource.Buffer total_size(@NativeType("uint64_t") long value) { ExrDataSource.ntotal_size(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrDataSource.Buffer flags(@NativeType("uint32_t") int value) { ExrDataSource.nflags(address(), value); return this; }

    }

}