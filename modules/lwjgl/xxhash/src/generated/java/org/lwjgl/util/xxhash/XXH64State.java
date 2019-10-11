/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 64-bit XXH state for stack allocation. Unstable API.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code reserved32} &ndash; required for padding anyway</li>
 * <li>{@code reserved64} &ndash; never read nor write, might be removed in a future version</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH64_state_t {
 *     XXH32_hash_t total_len;
 *     XXH32_hash_t v1;
 *     XXH32_hash_t v2;
 *     XXH32_hash_t v3;
 *     XXH32_hash_t v4;
 *     XXH32_hash_t mem64[4];
 *     XXH32_hash_t memsize;
 *     XXH32_hash_t reserved32;
 *     XXH32_hash_t reserved64;
 * }</code></pre>
 */
@NativeType("struct XXH64_state_t")
public class XXH64State extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOTAL_LEN,
        V1,
        V2,
        V3,
        V4,
        MEM64,
        MEMSIZE,
        RESERVED32,
        RESERVED64;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __array(8, 4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOTAL_LEN = layout.offsetof(0);
        V1 = layout.offsetof(1);
        V2 = layout.offsetof(2);
        V3 = layout.offsetof(3);
        V4 = layout.offsetof(4);
        MEM64 = layout.offsetof(5);
        MEMSIZE = layout.offsetof(6);
        RESERVED32 = layout.offsetof(7);
        RESERVED64 = layout.offsetof(8);
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

    /** Returns the value of the {@code total_len} field. */
    @NativeType("XXH32_hash_t")
    public long total_len() { return ntotal_len(address()); }
    /** Returns the value of the {@code v1} field. */
    @NativeType("XXH32_hash_t")
    public long v1() { return nv1(address()); }
    /** Returns the value of the {@code v2} field. */
    @NativeType("XXH32_hash_t")
    public long v2() { return nv2(address()); }
    /** Returns the value of the {@code v3} field. */
    @NativeType("XXH32_hash_t")
    public long v3() { return nv3(address()); }
    /** Returns the value of the {@code v4} field. */
    @NativeType("XXH32_hash_t")
    public long v4() { return nv4(address()); }
    /** Returns a {@link LongBuffer} view of the {@code mem64} field. */
    @NativeType("XXH32_hash_t[4]")
    public LongBuffer mem64() { return nmem64(address()); }
    /** Returns the value at the specified index of the {@code mem64} field. */
    @NativeType("XXH32_hash_t")
    public long mem64(int index) { return nmem64(address(), index); }
    /** Returns the value of the {@code memsize} field. */
    @NativeType("XXH32_hash_t")
    public int memsize() { return nmemsize(address()); }
    /** Returns the value of the {@code reserved32} field. */
    @NativeType("XXH32_hash_t")
    public int reserved32() { return nreserved32(address()); }
    /** Returns the value of the {@code reserved64} field. */
    @NativeType("XXH32_hash_t")
    public long reserved64() { return nreserved64(address()); }

    // -----------------------------------

    /** Returns a new {@code XXH64State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH64State malloc() {
        return wrap(XXH64State.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XXH64State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH64State calloc() {
        return wrap(XXH64State.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XXH64State} instance allocated with {@link BufferUtils}. */
    public static XXH64State create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XXH64State.class, memAddress(container), container);
    }

    /** Returns a new {@code XXH64State} instance for the specified memory address. */
    public static XXH64State create(long address) {
        return wrap(XXH64State.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH64State createSafe(long address) {
        return address == NULL ? null : wrap(XXH64State.class, address);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XXH64State.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH64State.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XXH64State} instance allocated on the thread-local {@link MemoryStack}. */
    public static XXH64State mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XXH64State} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XXH64State callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XXH64State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64State mallocStack(MemoryStack stack) {
        return wrap(XXH64State.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XXH64State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64State callocStack(MemoryStack stack) {
        return wrap(XXH64State.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #total_len}. */
    public static long ntotal_len(long struct) { return UNSAFE.getLong(null, struct + XXH64State.TOTAL_LEN); }
    /** Unsafe version of {@link #v1}. */
    public static long nv1(long struct) { return UNSAFE.getLong(null, struct + XXH64State.V1); }
    /** Unsafe version of {@link #v2}. */
    public static long nv2(long struct) { return UNSAFE.getLong(null, struct + XXH64State.V2); }
    /** Unsafe version of {@link #v3}. */
    public static long nv3(long struct) { return UNSAFE.getLong(null, struct + XXH64State.V3); }
    /** Unsafe version of {@link #v4}. */
    public static long nv4(long struct) { return UNSAFE.getLong(null, struct + XXH64State.V4); }
    /** Unsafe version of {@link #mem64}. */
    public static LongBuffer nmem64(long struct) { return memLongBuffer(struct + XXH64State.MEM64, 4); }
    /** Unsafe version of {@link #mem64(int) mem64}. */
    public static long nmem64(long struct, int index) {
        return UNSAFE.getLong(null, struct + XXH64State.MEM64 + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #memsize}. */
    public static int nmemsize(long struct) { return UNSAFE.getInt(null, struct + XXH64State.MEMSIZE); }
    /** Unsafe version of {@link #reserved32}. */
    public static int nreserved32(long struct) { return UNSAFE.getInt(null, struct + XXH64State.RESERVED32); }
    /** Unsafe version of {@link #reserved64}. */
    public static long nreserved64(long struct) { return UNSAFE.getLong(null, struct + XXH64State.RESERVED64); }

    // -----------------------------------

    /** An array of {@link XXH64State} structs. */
    public static class Buffer extends StructBuffer<XXH64State, Buffer> implements NativeResource {

        private static final XXH64State ELEMENT_FACTORY = XXH64State.create(-1L);

        /**
         * Creates a new {@code XXH64State.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH64State#SIZEOF}, and its mark will be undefined.
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
        protected XXH64State getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code total_len} field. */
        @NativeType("XXH32_hash_t")
        public long total_len() { return XXH64State.ntotal_len(address()); }
        /** Returns the value of the {@code v1} field. */
        @NativeType("XXH32_hash_t")
        public long v1() { return XXH64State.nv1(address()); }
        /** Returns the value of the {@code v2} field. */
        @NativeType("XXH32_hash_t")
        public long v2() { return XXH64State.nv2(address()); }
        /** Returns the value of the {@code v3} field. */
        @NativeType("XXH32_hash_t")
        public long v3() { return XXH64State.nv3(address()); }
        /** Returns the value of the {@code v4} field. */
        @NativeType("XXH32_hash_t")
        public long v4() { return XXH64State.nv4(address()); }
        /** Returns a {@link LongBuffer} view of the {@code mem64} field. */
        @NativeType("XXH32_hash_t[4]")
        public LongBuffer mem64() { return XXH64State.nmem64(address()); }
        /** Returns the value at the specified index of the {@code mem64} field. */
        @NativeType("XXH32_hash_t")
        public long mem64(int index) { return XXH64State.nmem64(address(), index); }
        /** Returns the value of the {@code memsize} field. */
        @NativeType("XXH32_hash_t")
        public int memsize() { return XXH64State.nmemsize(address()); }
        /** Returns the value of the {@code reserved32} field. */
        @NativeType("XXH32_hash_t")
        public int reserved32() { return XXH64State.nreserved32(address()); }
        /** Returns the value of the {@code reserved64} field. */
        @NativeType("XXH32_hash_t")
        public long reserved64() { return XXH64State.nreserved64(address()); }

    }

}