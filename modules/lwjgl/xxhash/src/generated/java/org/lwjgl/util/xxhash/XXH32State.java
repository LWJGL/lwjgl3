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
 * 32-bit XXH state for stack allocation. Unstable API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XXH32_state_t {
 *     unsigned total_len_32;
 *     unsigned large_len;
 *     unsigned v1;
 *     unsigned v2;
 *     unsigned v3;
 *     unsigned v4;
 *     unsigned mem32[4];
 *     unsigned memsize;
 *     unsigned reserved;
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
        V1,
        V2,
        V3,
        V4,
        MEM32,
        MEMSIZE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOTAL_LEN_32 = layout.offsetof(0);
        LARGE_LEN = layout.offsetof(1);
        V1 = layout.offsetof(2);
        V2 = layout.offsetof(3);
        V3 = layout.offsetof(4);
        V4 = layout.offsetof(5);
        MEM32 = layout.offsetof(6);
        MEMSIZE = layout.offsetof(7);
        RESERVED = layout.offsetof(8);
    }

    XXH32State(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link XXH32State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH32State(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code total_len_32} field. */
    @NativeType("unsigned")
    public int total_len_32() { return ntotal_len_32(address()); }
    /** Returns the value of the {@code large_len} field. */
    @NativeType("unsigned")
    public int large_len() { return nlarge_len(address()); }
    /** Returns the value of the {@code v1} field. */
    @NativeType("unsigned")
    public int v1() { return nv1(address()); }
    /** Returns the value of the {@code v2} field. */
    @NativeType("unsigned")
    public int v2() { return nv2(address()); }
    /** Returns the value of the {@code v3} field. */
    @NativeType("unsigned")
    public int v3() { return nv3(address()); }
    /** Returns the value of the {@code v4} field. */
    @NativeType("unsigned")
    public int v4() { return nv4(address()); }
    /** Returns a {@link IntBuffer} view of the {@code mem32} field. */
    @NativeType("unsigned[4]")
    public IntBuffer mem32() { return nmem32(address()); }
    /** Returns the value at the specified index of the {@code mem32} field. */
    @NativeType("unsigned")
    public int mem32(int index) { return nmem32(address(), index); }
    /** Returns the value of the {@code memsize} field. */
    @NativeType("unsigned")
    public int memsize() { return nmemsize(address()); }
    /** Returns the value of the {@code reserved} field. */
    @NativeType("unsigned")
    public int reserved() { return nreserved(address()); }

    /** Sets the specified value to the {@code total_len_32} field. */
    public XXH32State total_len_32(@NativeType("unsigned") int value) { ntotal_len_32(address(), value); return this; }
    /** Sets the specified value to the {@code large_len} field. */
    public XXH32State large_len(@NativeType("unsigned") int value) { nlarge_len(address(), value); return this; }
    /** Sets the specified value to the {@code v1} field. */
    public XXH32State v1(@NativeType("unsigned") int value) { nv1(address(), value); return this; }
    /** Sets the specified value to the {@code v2} field. */
    public XXH32State v2(@NativeType("unsigned") int value) { nv2(address(), value); return this; }
    /** Sets the specified value to the {@code v3} field. */
    public XXH32State v3(@NativeType("unsigned") int value) { nv3(address(), value); return this; }
    /** Sets the specified value to the {@code v4} field. */
    public XXH32State v4(@NativeType("unsigned") int value) { nv4(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code mem32} field. */
    public XXH32State mem32(@NativeType("unsigned[4]") IntBuffer value) { nmem32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code mem32} field. */
    public XXH32State mem32(int index, @NativeType("unsigned") int value) { nmem32(address(), index, value); return this; }
    /** Sets the specified value to the {@code memsize} field. */
    public XXH32State memsize(@NativeType("unsigned") int value) { nmemsize(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public XXH32State reserved(@NativeType("unsigned") int value) { nreserved(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XXH32State set(
        int total_len_32,
        int large_len,
        int v1,
        int v2,
        int v3,
        int v4,
        IntBuffer mem32,
        int memsize,
        int reserved
    ) {
        total_len_32(total_len_32);
        large_len(large_len);
        v1(v1);
        v2(v2);
        v3(v3);
        v4(v4);
        mem32(mem32);
        memsize(memsize);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XXH32State set(XXH32State src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link XXH32State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH32State malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link XXH32State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH32State calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link XXH32State} instance allocated with {@link BufferUtils}. */
    public static XXH32State create() {
        return new XXH32State(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link XXH32State} instance for the specified memory address. */
    public static XXH32State create(long address) {
        return new XXH32State(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH32State createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link XXH32State.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH32State.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link XXH32State} instance allocated on the thread-local {@link MemoryStack}. */
    public static XXH32State mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link XXH32State} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XXH32State callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link XXH32State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32State mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link XXH32State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32State callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #total_len_32}. */
    public static int ntotal_len_32(long struct) { return memGetInt(struct + XXH32State.TOTAL_LEN_32); }
    /** Unsafe version of {@link #large_len}. */
    public static int nlarge_len(long struct) { return memGetInt(struct + XXH32State.LARGE_LEN); }
    /** Unsafe version of {@link #v1}. */
    public static int nv1(long struct) { return memGetInt(struct + XXH32State.V1); }
    /** Unsafe version of {@link #v2}. */
    public static int nv2(long struct) { return memGetInt(struct + XXH32State.V2); }
    /** Unsafe version of {@link #v3}. */
    public static int nv3(long struct) { return memGetInt(struct + XXH32State.V3); }
    /** Unsafe version of {@link #v4}. */
    public static int nv4(long struct) { return memGetInt(struct + XXH32State.V4); }
    /** Unsafe version of {@link #mem32}. */
    public static IntBuffer nmem32(long struct) { return memIntBuffer(struct + XXH32State.MEM32, 4); }
    /** Unsafe version of {@link #mem32(int) mem32}. */
    public static int nmem32(long struct, int index) {
        return memGetInt(struct + XXH32State.MEM32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #memsize}. */
    public static int nmemsize(long struct) { return memGetInt(struct + XXH32State.MEMSIZE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + XXH32State.RESERVED); }

    /** Unsafe version of {@link #total_len_32(int) total_len_32}. */
    public static void ntotal_len_32(long struct, int value) { memPutInt(struct + XXH32State.TOTAL_LEN_32, value); }
    /** Unsafe version of {@link #large_len(int) large_len}. */
    public static void nlarge_len(long struct, int value) { memPutInt(struct + XXH32State.LARGE_LEN, value); }
    /** Unsafe version of {@link #v1(int) v1}. */
    public static void nv1(long struct, int value) { memPutInt(struct + XXH32State.V1, value); }
    /** Unsafe version of {@link #v2(int) v2}. */
    public static void nv2(long struct, int value) { memPutInt(struct + XXH32State.V2, value); }
    /** Unsafe version of {@link #v3(int) v3}. */
    public static void nv3(long struct, int value) { memPutInt(struct + XXH32State.V3, value); }
    /** Unsafe version of {@link #v4(int) v4}. */
    public static void nv4(long struct, int value) { memPutInt(struct + XXH32State.V4, value); }
    /** Unsafe version of {@link #mem32(IntBuffer) mem32}. */
    public static void nmem32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + XXH32State.MEM32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #mem32(int, int) mem32}. */
    public static void nmem32(long struct, int index, int value) {
        memPutInt(struct + XXH32State.MEM32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #memsize(int) memsize}. */
    public static void nmemsize(long struct, int value) { memPutInt(struct + XXH32State.MEMSIZE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + XXH32State.RESERVED, value); }

    // -----------------------------------

    /** An array of {@link XXH32State} structs. */
    public static class Buffer extends StructBuffer<XXH32State, Buffer> implements NativeResource {

        /**
         * Creates a new {@link XXH32State.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected XXH32State newInstance(long address) {
            return new XXH32State(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code total_len_32} field. */
        @NativeType("unsigned")
        public int total_len_32() { return XXH32State.ntotal_len_32(address()); }
        /** Returns the value of the {@code large_len} field. */
        @NativeType("unsigned")
        public int large_len() { return XXH32State.nlarge_len(address()); }
        /** Returns the value of the {@code v1} field. */
        @NativeType("unsigned")
        public int v1() { return XXH32State.nv1(address()); }
        /** Returns the value of the {@code v2} field. */
        @NativeType("unsigned")
        public int v2() { return XXH32State.nv2(address()); }
        /** Returns the value of the {@code v3} field. */
        @NativeType("unsigned")
        public int v3() { return XXH32State.nv3(address()); }
        /** Returns the value of the {@code v4} field. */
        @NativeType("unsigned")
        public int v4() { return XXH32State.nv4(address()); }
        /** Returns a {@link IntBuffer} view of the {@code mem32} field. */
        @NativeType("unsigned[4]")
        public IntBuffer mem32() { return XXH32State.nmem32(address()); }
        /** Returns the value at the specified index of the {@code mem32} field. */
        @NativeType("unsigned")
        public int mem32(int index) { return XXH32State.nmem32(address(), index); }
        /** Returns the value of the {@code memsize} field. */
        @NativeType("unsigned")
        public int memsize() { return XXH32State.nmemsize(address()); }
        /** Returns the value of the {@code reserved} field. */
        @NativeType("unsigned")
        public int reserved() { return XXH32State.nreserved(address()); }

        /** Sets the specified value to the {@code total_len_32} field. */
        public XXH32State.Buffer total_len_32(@NativeType("unsigned") int value) { XXH32State.ntotal_len_32(address(), value); return this; }
        /** Sets the specified value to the {@code large_len} field. */
        public XXH32State.Buffer large_len(@NativeType("unsigned") int value) { XXH32State.nlarge_len(address(), value); return this; }
        /** Sets the specified value to the {@code v1} field. */
        public XXH32State.Buffer v1(@NativeType("unsigned") int value) { XXH32State.nv1(address(), value); return this; }
        /** Sets the specified value to the {@code v2} field. */
        public XXH32State.Buffer v2(@NativeType("unsigned") int value) { XXH32State.nv2(address(), value); return this; }
        /** Sets the specified value to the {@code v3} field. */
        public XXH32State.Buffer v3(@NativeType("unsigned") int value) { XXH32State.nv3(address(), value); return this; }
        /** Sets the specified value to the {@code v4} field. */
        public XXH32State.Buffer v4(@NativeType("unsigned") int value) { XXH32State.nv4(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code mem32} field. */
        public XXH32State.Buffer mem32(@NativeType("unsigned[4]") IntBuffer value) { XXH32State.nmem32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code mem32} field. */
        public XXH32State.Buffer mem32(int index, @NativeType("unsigned") int value) { XXH32State.nmem32(address(), index, value); return this; }
        /** Sets the specified value to the {@code memsize} field. */
        public XXH32State.Buffer memsize(@NativeType("unsigned") int value) { XXH32State.nmemsize(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public XXH32State.Buffer reserved(@NativeType("unsigned") int value) { XXH32State.nreserved(address(), value); return this; }

    }

}