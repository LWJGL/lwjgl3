/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.libdivide;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct libdivide_u64_t {
 *     uint64_t magic;
 *     uint8_t more;
 * }</code></pre>
 */
@NativeType("struct libdivide_u64_t")
public class LibDivideU64 extends Struct<LibDivideU64> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAGIC,
        MORE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAGIC = layout.offsetof(0);
        MORE = layout.offsetof(1);
    }

    protected LibDivideU64(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LibDivideU64 create(long address, @Nullable ByteBuffer container) {
        return new LibDivideU64(address, container);
    }

    /**
     * Creates a {@code LibDivideU64} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LibDivideU64(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code magic} field. */
    @NativeType("uint64_t")
    public long magic() { return nmagic(address()); }
    /** @return the value of the {@code more} field. */
    @NativeType("uint8_t")
    public byte more() { return nmore(address()); }

    /** Sets the specified value to the {@code magic} field. */
    public LibDivideU64 magic(@NativeType("uint64_t") long value) { nmagic(address(), value); return this; }
    /** Sets the specified value to the {@code more} field. */
    public LibDivideU64 more(@NativeType("uint8_t") byte value) { nmore(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LibDivideU64 set(
        long magic,
        byte more
    ) {
        magic(magic);
        more(more);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LibDivideU64 set(LibDivideU64 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LibDivideU64} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LibDivideU64 malloc() {
        return new LibDivideU64(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LibDivideU64} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LibDivideU64 calloc() {
        return new LibDivideU64(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LibDivideU64} instance allocated with {@link BufferUtils}. */
    public static LibDivideU64 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LibDivideU64(memAddress(container), container);
    }

    /** Returns a new {@code LibDivideU64} instance for the specified memory address. */
    public static LibDivideU64 create(long address) {
        return new LibDivideU64(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LibDivideU64 createSafe(long address) {
        return address == NULL ? null : new LibDivideU64(address, null);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LibDivideU64.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LibDivideU64.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LibDivideU64 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LibDivideU64 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LibDivideU64 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LibDivideU64 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LibDivideU64.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LibDivideU64.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LibDivideU64.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LibDivideU64.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LibDivideU64} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideU64 malloc(MemoryStack stack) {
        return new LibDivideU64(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LibDivideU64} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LibDivideU64 calloc(MemoryStack stack) {
        return new LibDivideU64(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LibDivideU64.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LibDivideU64.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #magic}. */
    public static long nmagic(long struct) { return memGetLong(struct + LibDivideU64.MAGIC); }
    /** Unsafe version of {@link #more}. */
    public static byte nmore(long struct) { return memGetByte(struct + LibDivideU64.MORE); }

    /** Unsafe version of {@link #magic(long) magic}. */
    public static void nmagic(long struct, long value) { memPutLong(struct + LibDivideU64.MAGIC, value); }
    /** Unsafe version of {@link #more(byte) more}. */
    public static void nmore(long struct, byte value) { memPutByte(struct + LibDivideU64.MORE, value); }

    // -----------------------------------

    /** An array of {@link LibDivideU64} structs. */
    public static class Buffer extends StructBuffer<LibDivideU64, Buffer> implements NativeResource {

        private static final LibDivideU64 ELEMENT_FACTORY = LibDivideU64.create(-1L);

        /**
         * Creates a new {@code LibDivideU64.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LibDivideU64#SIZEOF}, and its mark will be undefined.</p>
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
        protected LibDivideU64 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code magic} field. */
        @NativeType("uint64_t")
        public long magic() { return LibDivideU64.nmagic(address()); }
        /** @return the value of the {@code more} field. */
        @NativeType("uint8_t")
        public byte more() { return LibDivideU64.nmore(address()); }

        /** Sets the specified value to the {@code magic} field. */
        public LibDivideU64.Buffer magic(@NativeType("uint64_t") long value) { LibDivideU64.nmagic(address(), value); return this; }
        /** Sets the specified value to the {@code more} field. */
        public LibDivideU64.Buffer more(@NativeType("uint8_t") byte value) { LibDivideU64.nmore(address(), value); return this; }

    }

}