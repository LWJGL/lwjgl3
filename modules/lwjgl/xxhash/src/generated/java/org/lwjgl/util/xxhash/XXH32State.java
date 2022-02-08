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
 * The opaque state struct for the XXH32 streaming API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH32_state_t {
 *     XXH32_hash_t {@link #total_len_32};
 *     XXH32_hash_t {@link #large_len};
 *     XXH32_hash_t {@link #v}[4];
 *     XXH32_hash_t {@link #mem32}[4];
 *     XXH32_hash_t {@link #memsize};
 *     XXH32_hash_t {@link #reserved};
 * }</code></pre>
 */
@NativeType("struct XXH32_state_t")
public class XXH32State extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOTAL_LEN_32,
        LARGE_LEN,
        V,
        MEM32,
        MEMSIZE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(4, 4),
            __array(4, 4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOTAL_LEN_32 = layout.offsetof(0);
        LARGE_LEN = layout.offsetof(1);
        V = layout.offsetof(2);
        MEM32 = layout.offsetof(3);
        MEMSIZE = layout.offsetof(4);
        RESERVED = layout.offsetof(5);
    }

    /**
     * Creates a {@code XXH32State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH32State(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** total length hashed, modulo {@code 2^32} */
    @NativeType("XXH32_hash_t")
    public int total_len_32() { return ntotal_len_32(address()); }
    /** whether the hash is &ge; 16 (handles {@code total_len_32} overflow) */
    @NativeType("XXH32_hash_t")
    public int large_len() { return nlarge_len(address()); }
    /** accumulator lanes */
    @NativeType("XXH32_hash_t[4]")
    public IntBuffer v() { return nv(address()); }
    /** accumulator lanes */
    @NativeType("XXH32_hash_t")
    public int v(int index) { return nv(address(), index); }
    /** internal buffer for partial reads. Treated as {@code unsigned char[16]}. */
    @NativeType("XXH32_hash_t[4]")
    public IntBuffer mem32() { return nmem32(address()); }
    /** internal buffer for partial reads. Treated as {@code unsigned char[16]}. */
    @NativeType("XXH32_hash_t")
    public int mem32(int index) { return nmem32(address(), index); }
    /** amount of data in {@code mem32} */
    @NativeType("XXH32_hash_t")
    public int memsize() { return nmemsize(address()); }
    /** reserved field. Do not read or write to it, it may be removed. */
    @NativeType("XXH32_hash_t")
    public int reserved() { return nreserved(address()); }

    // -----------------------------------

    /** Returns a new {@code XXH32State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH32State malloc() {
        return wrap(XXH32State.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XXH32State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH32State calloc() {
        return wrap(XXH32State.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XXH32State} instance allocated with {@link BufferUtils}. */
    public static XXH32State create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XXH32State.class, memAddress(container), container);
    }

    /** Returns a new {@code XXH32State} instance for the specified memory address. */
    public static XXH32State create(long address) {
        return wrap(XXH32State.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH32State createSafe(long address) {
        return address == NULL ? null : wrap(XXH32State.class, address);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XXH32State.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH32State.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XXH32State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32State malloc(MemoryStack stack) {
        return wrap(XXH32State.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XXH32State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32State calloc(MemoryStack stack) {
        return wrap(XXH32State.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #total_len_32}. */
    public static int ntotal_len_32(long struct) { return UNSAFE.getInt(null, struct + XXH32State.TOTAL_LEN_32); }
    /** Unsafe version of {@link #large_len}. */
    public static int nlarge_len(long struct) { return UNSAFE.getInt(null, struct + XXH32State.LARGE_LEN); }
    /** Unsafe version of {@link #v}. */
    public static IntBuffer nv(long struct) { return memIntBuffer(struct + XXH32State.V, 4); }
    /** Unsafe version of {@link #v(int) v}. */
    public static int nv(long struct, int index) {
        return UNSAFE.getInt(null, struct + XXH32State.V + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #mem32}. */
    public static IntBuffer nmem32(long struct) { return memIntBuffer(struct + XXH32State.MEM32, 4); }
    /** Unsafe version of {@link #mem32(int) mem32}. */
    public static int nmem32(long struct, int index) {
        return UNSAFE.getInt(null, struct + XXH32State.MEM32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #memsize}. */
    public static int nmemsize(long struct) { return UNSAFE.getInt(null, struct + XXH32State.MEMSIZE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return UNSAFE.getInt(null, struct + XXH32State.RESERVED); }

    // -----------------------------------

    /** An array of {@link XXH32State} structs. */
    public static class Buffer extends StructBuffer<XXH32State, Buffer> implements NativeResource {

        private static final XXH32State ELEMENT_FACTORY = XXH32State.create(-1L);

        /**
         * Creates a new {@code XXH32State.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH32State#SIZEOF}, and its mark will be undefined.
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
        protected XXH32State getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XXH32State#total_len_32} field. */
        @NativeType("XXH32_hash_t")
        public int total_len_32() { return XXH32State.ntotal_len_32(address()); }
        /** @return the value of the {@link XXH32State#large_len} field. */
        @NativeType("XXH32_hash_t")
        public int large_len() { return XXH32State.nlarge_len(address()); }
        /** @return a {@link IntBuffer} view of the {@link XXH32State#v} field. */
        @NativeType("XXH32_hash_t[4]")
        public IntBuffer v() { return XXH32State.nv(address()); }
        /** @return the value at the specified index of the {@link XXH32State#v} field. */
        @NativeType("XXH32_hash_t")
        public int v(int index) { return XXH32State.nv(address(), index); }
        /** @return a {@link IntBuffer} view of the {@link XXH32State#mem32} field. */
        @NativeType("XXH32_hash_t[4]")
        public IntBuffer mem32() { return XXH32State.nmem32(address()); }
        /** @return the value at the specified index of the {@link XXH32State#mem32} field. */
        @NativeType("XXH32_hash_t")
        public int mem32(int index) { return XXH32State.nmem32(address(), index); }
        /** @return the value of the {@link XXH32State#memsize} field. */
        @NativeType("XXH32_hash_t")
        public int memsize() { return XXH32State.nmemsize(address()); }
        /** @return the value of the {@link XXH32State#reserved} field. */
        @NativeType("XXH32_hash_t")
        public int reserved() { return XXH32State.nreserved(address()); }

    }

}