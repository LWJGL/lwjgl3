/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code buf} &ndash; Pointer to the data</li>
 * <li>{@code sz} &ndash; Length of the buffer, in chars</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_fixed_buf_t {
 *     void * buf;
 *     size_t sz;
 * }</code></pre>
 */
public class vpx_fixed_buf_t extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUF,
        SZ;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUF = layout.offsetof(0);
        SZ = layout.offsetof(1);
    }

    /**
     * Creates a {@code vpx_fixed_buf_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_fixed_buf_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code buf} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer buf(int capacity) { return nbuf(address(), capacity); }
    /** Returns the value of the {@code sz} field. */
    @NativeType("size_t")
    public long sz() { return nsz(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code buf} field. */
    public vpx_fixed_buf_t buf(@NativeType("void *") ByteBuffer value) { nbuf(address(), value); return this; }
    /** Sets the specified value to the {@code sz} field. */
    public vpx_fixed_buf_t sz(@NativeType("size_t") long value) { nsz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public vpx_fixed_buf_t set(
        ByteBuffer buf,
        long sz
    ) {
        buf(buf);
        sz(sz);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_fixed_buf_t set(vpx_fixed_buf_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_fixed_buf_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_fixed_buf_t malloc() {
        return wrap(vpx_fixed_buf_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_fixed_buf_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_fixed_buf_t calloc() {
        return wrap(vpx_fixed_buf_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_fixed_buf_t} instance allocated with {@link BufferUtils}. */
    public static vpx_fixed_buf_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_fixed_buf_t.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_fixed_buf_t} instance for the specified memory address. */
    public static vpx_fixed_buf_t create(long address) {
        return wrap(vpx_fixed_buf_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_fixed_buf_t createSafe(long address) {
        return address == NULL ? null : wrap(vpx_fixed_buf_t.class, address);
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_fixed_buf_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_fixed_buf_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_fixed_buf_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_fixed_buf_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_fixed_buf_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_fixed_buf_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_fixed_buf_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_fixed_buf_t mallocStack(MemoryStack stack) {
        return wrap(vpx_fixed_buf_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_fixed_buf_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_fixed_buf_t callocStack(MemoryStack stack) {
        return wrap(vpx_fixed_buf_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_fixed_buf_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_fixed_buf_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buf(int) buf}. */
    public static ByteBuffer nbuf(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_fixed_buf_t.BUF), capacity); }
    /** Unsafe version of {@link #sz}. */
    public static long nsz(long struct) { return memGetAddress(struct + vpx_fixed_buf_t.SZ); }

    /** Unsafe version of {@link #buf(ByteBuffer) buf}. */
    public static void nbuf(long struct, ByteBuffer value) { memPutAddress(struct + vpx_fixed_buf_t.BUF, memAddress(value)); }
    /** Unsafe version of {@link #sz(long) sz}. */
    public static void nsz(long struct, long value) { memPutAddress(struct + vpx_fixed_buf_t.SZ, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + vpx_fixed_buf_t.BUF));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link vpx_fixed_buf_t} structs. */
    public static class Buffer extends StructBuffer<vpx_fixed_buf_t, Buffer> implements NativeResource {

        private static final vpx_fixed_buf_t ELEMENT_FACTORY = vpx_fixed_buf_t.create(-1L);

        /**
         * Creates a new {@code vpx_fixed_buf_t.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_fixed_buf_t#SIZEOF}, and its mark will be undefined.
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
        protected vpx_fixed_buf_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code buf} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer buf(int capacity) { return vpx_fixed_buf_t.nbuf(address(), capacity); }
        /** Returns the value of the {@code sz} field. */
        @NativeType("size_t")
        public long sz() { return vpx_fixed_buf_t.nsz(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code buf} field. */
        public vpx_fixed_buf_t.Buffer buf(@NativeType("void *") ByteBuffer value) { vpx_fixed_buf_t.nbuf(address(), value); return this; }
        /** Sets the specified value to the {@code sz} field. */
        public vpx_fixed_buf_t.Buffer sz(@NativeType("size_t") long value) { vpx_fixed_buf_t.nsz(address(), value); return this; }

    }

}