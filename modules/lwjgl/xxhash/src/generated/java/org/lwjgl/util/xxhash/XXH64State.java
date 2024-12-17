/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XXH64_state_t {
 *     XXH64_hash_t total_len;
 *     XXH64_hash_t acc[4];
 *     unsigned char buffer[32];
 *     XXH32_hash_t bufferedSize;
 *     XXH32_hash_t reserved32;
 *     XXH64_hash_t reserved64;
 * }}</pre>
 */
@NativeType("struct XXH64_state_t")
public class XXH64State extends Struct<XXH64State> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOTAL_LEN,
        ACC,
        BUFFER,
        BUFFEREDSIZE,
        RESERVED32,
        RESERVED64;

    static {
        Layout layout = __struct(
            __member(8),
            __array(8, 4),
            __array(1, 32),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOTAL_LEN = layout.offsetof(0);
        ACC = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        BUFFEREDSIZE = layout.offsetof(3);
        RESERVED32 = layout.offsetof(4);
        RESERVED64 = layout.offsetof(5);
    }

    protected XXH64State(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XXH64State create(long address, @Nullable ByteBuffer container) {
        return new XXH64State(address, container);
    }

    /**
     * Creates a {@code XXH64State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH64State(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code total_len} field. */
    @NativeType("XXH64_hash_t")
    public long total_len() { return ntotal_len(address()); }
    /** @return a {@link LongBuffer} view of the {@code acc} field. */
    @NativeType("XXH64_hash_t[4]")
    public LongBuffer acc() { return nacc(address()); }
    /** @return the value at the specified index of the {@code acc} field. */
    @NativeType("XXH64_hash_t")
    public long acc(int index) { return nacc(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
    @NativeType("unsigned char[32]")
    public ByteBuffer buffer() { return nbuffer(address()); }
    /** @return the value at the specified index of the {@code buffer} field. */
    @NativeType("unsigned char")
    public byte buffer(int index) { return nbuffer(address(), index); }
    /** @return the value of the {@code bufferedSize} field. */
    @NativeType("XXH32_hash_t")
    public int bufferedSize() { return nbufferedSize(address()); }
    /** @return the value of the {@code reserved32} field. */
    @NativeType("XXH32_hash_t")
    public int reserved32() { return nreserved32(address()); }
    /** @return the value of the {@code reserved64} field. */
    @NativeType("XXH64_hash_t")
    public long reserved64() { return nreserved64(address()); }

    // -----------------------------------

    /** Returns a new {@code XXH64State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH64State malloc() {
        return new XXH64State(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XXH64State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH64State calloc() {
        return new XXH64State(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XXH64State} instance allocated with {@link BufferUtils}. */
    public static XXH64State create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XXH64State(memAddress(container), container);
    }

    /** Returns a new {@code XXH64State} instance for the specified memory address. */
    public static XXH64State create(long address) {
        return new XXH64State(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XXH64State createSafe(long address) {
        return address == NULL ? null : new XXH64State(address, null);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XXH64State.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XXH64State.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH64State mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH64State callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH64State mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH64State callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64State.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64State.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64State.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH64State.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XXH64State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64State malloc(MemoryStack stack) {
        return new XXH64State(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XXH64State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64State calloc(MemoryStack stack) {
        return new XXH64State(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #total_len}. */
    public static long ntotal_len(long struct) { return memGetLong(struct + XXH64State.TOTAL_LEN); }
    /** Unsafe version of {@link #acc}. */
    public static LongBuffer nacc(long struct) { return memLongBuffer(struct + XXH64State.ACC, 4); }
    /** Unsafe version of {@link #acc(int) acc}. */
    public static long nacc(long struct, int index) {
        return memGetLong(struct + XXH64State.ACC + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(struct + XXH64State.BUFFER, 32); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static byte nbuffer(long struct, int index) {
        return memGetByte(struct + XXH64State.BUFFER + check(index, 32) * 1);
    }
    /** Unsafe version of {@link #bufferedSize}. */
    public static int nbufferedSize(long struct) { return memGetInt(struct + XXH64State.BUFFEREDSIZE); }
    /** Unsafe version of {@link #reserved32}. */
    public static int nreserved32(long struct) { return memGetInt(struct + XXH64State.RESERVED32); }
    /** Unsafe version of {@link #reserved64}. */
    public static long nreserved64(long struct) { return memGetLong(struct + XXH64State.RESERVED64); }

    // -----------------------------------

    /** An array of {@link XXH64State} structs. */
    public static class Buffer extends StructBuffer<XXH64State, Buffer> implements NativeResource {

        private static final XXH64State ELEMENT_FACTORY = XXH64State.create(-1L);

        /**
         * Creates a new {@code XXH64State.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH64State#SIZEOF}, and its mark will be undefined.</p>
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
        protected XXH64State getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code total_len} field. */
        @NativeType("XXH64_hash_t")
        public long total_len() { return XXH64State.ntotal_len(address()); }
        /** @return a {@link LongBuffer} view of the {@code acc} field. */
        @NativeType("XXH64_hash_t[4]")
        public LongBuffer acc() { return XXH64State.nacc(address()); }
        /** @return the value at the specified index of the {@code acc} field. */
        @NativeType("XXH64_hash_t")
        public long acc(int index) { return XXH64State.nacc(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
        @NativeType("unsigned char[32]")
        public ByteBuffer buffer() { return XXH64State.nbuffer(address()); }
        /** @return the value at the specified index of the {@code buffer} field. */
        @NativeType("unsigned char")
        public byte buffer(int index) { return XXH64State.nbuffer(address(), index); }
        /** @return the value of the {@code bufferedSize} field. */
        @NativeType("XXH32_hash_t")
        public int bufferedSize() { return XXH64State.nbufferedSize(address()); }
        /** @return the value of the {@code reserved32} field. */
        @NativeType("XXH32_hash_t")
        public int reserved32() { return XXH64State.nreserved32(address()); }
        /** @return the value of the {@code reserved64} field. */
        @NativeType("XXH64_hash_t")
        public long reserved64() { return XXH64State.nreserved64(address()); }

    }

}