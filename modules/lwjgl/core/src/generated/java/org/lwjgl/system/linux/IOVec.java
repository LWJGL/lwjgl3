/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

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
 * struct iovec {
 *     void * {@link #iov_base};
 *     size_t {@link #iov_len};
 * }</code></pre>
 */
@NativeType("struct iovec")
public class IOVec extends Struct<IOVec> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IOV_BASE,
        IOV_LEN;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IOV_BASE = layout.offsetof(0);
        IOV_LEN = layout.offsetof(1);
    }

    protected IOVec(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOVec create(long address, @Nullable ByteBuffer container) {
        return new IOVec(address, container);
    }

    /**
     * Creates a {@code IOVec} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOVec(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** starting address */
    @Nullable
    @NativeType("void *")
    public ByteBuffer iov_base() { return niov_base(address()); }
    /** number of bytes to transfer */
    @NativeType("size_t")
    public long iov_len() { return niov_len(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #iov_base} field. */
    public IOVec iov_base(@Nullable @NativeType("void *") ByteBuffer value) { niov_base(address(), value); return this; }
    /** Sets the specified value to the {@link #iov_len} field. */
    public IOVec iov_len(@NativeType("size_t") long value) { niov_len(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOVec set(
        @Nullable ByteBuffer iov_base,
        long iov_len
    ) {
        iov_base(iov_base);
        iov_len(iov_len);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOVec set(IOVec src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOVec} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOVec malloc() {
        return new IOVec(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOVec} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOVec calloc() {
        return new IOVec(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOVec} instance allocated with {@link BufferUtils}. */
    public static IOVec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOVec(memAddress(container), container);
    }

    /** Returns a new {@code IOVec} instance for the specified memory address. */
    public static IOVec create(long address) {
        return new IOVec(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOVec createSafe(long address) {
        return address == NULL ? null : new IOVec(address, null);
    }

    /**
     * Returns a new {@link IOVec.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOVec.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOVec.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOVec.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOVec.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOVec.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOVec.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOVec.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOVec.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOVec} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOVec malloc(MemoryStack stack) {
        return new IOVec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOVec} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOVec calloc(MemoryStack stack) {
        return new IOVec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOVec.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOVec.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOVec.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOVec.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #iov_base() iov_base}. */
    @Nullable public static ByteBuffer niov_base(long struct) { return memByteBufferSafe(memGetAddress(struct + IOVec.IOV_BASE), (int)niov_len(struct)); }
    /** Unsafe version of {@link #iov_len}. */
    public static long niov_len(long struct) { return memGetAddress(struct + IOVec.IOV_LEN); }

    /** Unsafe version of {@link #iov_base(ByteBuffer) iov_base}. */
    public static void niov_base(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + IOVec.IOV_BASE, memAddressSafe(value)); }
    /** Unsafe version of {@link #iov_len(long) iov_len}. */
    public static void niov_len(long struct, long value) { memPutAddress(struct + IOVec.IOV_LEN, value); }

    // -----------------------------------

    /** An array of {@link IOVec} structs. */
    public static class Buffer extends StructBuffer<IOVec, Buffer> implements NativeResource {

        private static final IOVec ELEMENT_FACTORY = IOVec.create(-1L);

        /**
         * Creates a new {@code IOVec.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOVec#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOVec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link IOVec#iov_base} field. */
        @Nullable
        @NativeType("void *")
        public ByteBuffer iov_base() { return IOVec.niov_base(address()); }
        /** @return the value of the {@link IOVec#iov_len} field. */
        @NativeType("size_t")
        public long iov_len() { return IOVec.niov_len(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link IOVec#iov_base} field. */
        public IOVec.Buffer iov_base(@Nullable @NativeType("void *") ByteBuffer value) { IOVec.niov_base(address(), value); return this; }
        /** Sets the specified value to the {@link IOVec#iov_len} field. */
        public IOVec.Buffer iov_len(@NativeType("size_t") long value) { IOVec.niov_len(address(), value); return this; }

    }

}