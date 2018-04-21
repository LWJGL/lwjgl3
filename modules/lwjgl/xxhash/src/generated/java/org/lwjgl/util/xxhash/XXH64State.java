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
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct XXH64_state_t {
 *     long long total_len;
 *     long long v1;
 *     long long v2;
 *     long long v3;
 *     long long v4;
 *     long long mem64[4];
 *     unsigned memsize;
 *     unsigned reserved[2];
 * }</pre></code>
 */
@NativeType("struct XXH64_state_t")
public class XXH64State extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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
        RESERVED;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __array(8, 4),
            __member(4),
            __array(4, 2)
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
        RESERVED = layout.offsetof(7);
    }

    XXH64State(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link XXH64State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH64State(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code total_len} field. */
    @NativeType("long long")
    public long total_len() { return ntotal_len(address()); }
    /** Returns the value of the {@code v1} field. */
    @NativeType("long long")
    public long v1() { return nv1(address()); }
    /** Returns the value of the {@code v2} field. */
    @NativeType("long long")
    public long v2() { return nv2(address()); }
    /** Returns the value of the {@code v3} field. */
    @NativeType("long long")
    public long v3() { return nv3(address()); }
    /** Returns the value of the {@code v4} field. */
    @NativeType("long long")
    public long v4() { return nv4(address()); }
    /** Returns a {@link LongBuffer} view of the {@code mem64} field. */
    @NativeType("long long[4]")
    public LongBuffer mem64() { return nmem64(address()); }
    /** Returns the value at the specified index of the {@code mem64} field. */
    @NativeType("long long")
    public long mem64(int index) { return nmem64(address(), index); }
    /** Returns the value of the {@code memsize} field. */
    @NativeType("unsigned")
    public int memsize() { return nmemsize(address()); }
    /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned[2]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** Returns the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code total_len} field. */
    public XXH64State total_len(@NativeType("long long") long value) { ntotal_len(address(), value); return this; }
    /** Sets the specified value to the {@code v1} field. */
    public XXH64State v1(@NativeType("long long") long value) { nv1(address(), value); return this; }
    /** Sets the specified value to the {@code v2} field. */
    public XXH64State v2(@NativeType("long long") long value) { nv2(address(), value); return this; }
    /** Sets the specified value to the {@code v3} field. */
    public XXH64State v3(@NativeType("long long") long value) { nv3(address(), value); return this; }
    /** Sets the specified value to the {@code v4} field. */
    public XXH64State v4(@NativeType("long long") long value) { nv4(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code mem64} field. */
    public XXH64State mem64(@NativeType("long long[4]") LongBuffer value) { nmem64(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code mem64} field. */
    public XXH64State mem64(int index, @NativeType("long long") long value) { nmem64(address(), index, value); return this; }
    /** Sets the specified value to the {@code memsize} field. */
    public XXH64State memsize(@NativeType("unsigned") int value) { nmemsize(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public XXH64State reserved(@NativeType("unsigned[2]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public XXH64State reserved(int index, @NativeType("unsigned") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XXH64State set(
        long total_len,
        long v1,
        long v2,
        long v3,
        long v4,
        LongBuffer mem64,
        int memsize,
        IntBuffer reserved
    ) {
        total_len(total_len);
        v1(v1);
        v2(v2);
        v3(v3);
        v4(v4);
        mem64(mem64);
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
    public XXH64State set(XXH64State src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link XXH64State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH64State malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link XXH64State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH64State calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link XXH64State} instance allocated with {@link BufferUtils}. */
    public static XXH64State create() {
        return new XXH64State(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link XXH64State} instance for the specified memory address. */
    public static XXH64State create(long address) {
        return new XXH64State(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XXH64State createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static XXH64State.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link XXH64State} instance allocated on the thread-local {@link MemoryStack}. */
    public static XXH64State mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link XXH64State} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XXH64State callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link XXH64State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64State mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link XXH64State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH64State callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
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
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH64State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH64State.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #total_len}. */
    public static long ntotal_len(long struct) { return memGetLong(struct + XXH64State.TOTAL_LEN); }
    /** Unsafe version of {@link #v1}. */
    public static long nv1(long struct) { return memGetLong(struct + XXH64State.V1); }
    /** Unsafe version of {@link #v2}. */
    public static long nv2(long struct) { return memGetLong(struct + XXH64State.V2); }
    /** Unsafe version of {@link #v3}. */
    public static long nv3(long struct) { return memGetLong(struct + XXH64State.V3); }
    /** Unsafe version of {@link #v4}. */
    public static long nv4(long struct) { return memGetLong(struct + XXH64State.V4); }
    /** Unsafe version of {@link #mem64}. */
    public static LongBuffer nmem64(long struct) { return memLongBuffer(struct + XXH64State.MEM64, 4); }
    /** Unsafe version of {@link #mem64(int) mem64}. */
    public static long nmem64(long struct, int index) {
        return memGetLong(struct + XXH64State.MEM64 + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #memsize}. */
    public static int nmemsize(long struct) { return memGetInt(struct + XXH64State.MEMSIZE); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + XXH64State.RESERVED, 2); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return memGetInt(struct + XXH64State.RESERVED + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #total_len(long) total_len}. */
    public static void ntotal_len(long struct, long value) { memPutLong(struct + XXH64State.TOTAL_LEN, value); }
    /** Unsafe version of {@link #v1(long) v1}. */
    public static void nv1(long struct, long value) { memPutLong(struct + XXH64State.V1, value); }
    /** Unsafe version of {@link #v2(long) v2}. */
    public static void nv2(long struct, long value) { memPutLong(struct + XXH64State.V2, value); }
    /** Unsafe version of {@link #v3(long) v3}. */
    public static void nv3(long struct, long value) { memPutLong(struct + XXH64State.V3, value); }
    /** Unsafe version of {@link #v4(long) v4}. */
    public static void nv4(long struct, long value) { memPutLong(struct + XXH64State.V4, value); }
    /** Unsafe version of {@link #mem64(LongBuffer) mem64}. */
    public static void nmem64(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + XXH64State.MEM64, value.remaining() * 8);
    }
    /** Unsafe version of {@link #mem64(int, long) mem64}. */
    public static void nmem64(long struct, int index, long value) {
        memPutLong(struct + XXH64State.MEM64 + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #memsize(int) memsize}. */
    public static void nmemsize(long struct, int value) { memPutInt(struct + XXH64State.MEMSIZE, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + XXH64State.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        memPutInt(struct + XXH64State.RESERVED + check(index, 2) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link XXH64State} structs. */
    public static class Buffer extends StructBuffer<XXH64State, Buffer> implements NativeResource {

        /**
         * Creates a new {@link XXH64State.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected XXH64State newInstance(long address) {
            return new XXH64State(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code total_len} field. */
        @NativeType("long long")
        public long total_len() { return XXH64State.ntotal_len(address()); }
        /** Returns the value of the {@code v1} field. */
        @NativeType("long long")
        public long v1() { return XXH64State.nv1(address()); }
        /** Returns the value of the {@code v2} field. */
        @NativeType("long long")
        public long v2() { return XXH64State.nv2(address()); }
        /** Returns the value of the {@code v3} field. */
        @NativeType("long long")
        public long v3() { return XXH64State.nv3(address()); }
        /** Returns the value of the {@code v4} field. */
        @NativeType("long long")
        public long v4() { return XXH64State.nv4(address()); }
        /** Returns a {@link LongBuffer} view of the {@code mem64} field. */
        @NativeType("long long[4]")
        public LongBuffer mem64() { return XXH64State.nmem64(address()); }
        /** Returns the value at the specified index of the {@code mem64} field. */
        @NativeType("long long")
        public long mem64(int index) { return XXH64State.nmem64(address(), index); }
        /** Returns the value of the {@code memsize} field. */
        @NativeType("unsigned")
        public int memsize() { return XXH64State.nmemsize(address()); }
        /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned[2]")
        public IntBuffer reserved() { return XXH64State.nreserved(address()); }
        /** Returns the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned")
        public int reserved(int index) { return XXH64State.nreserved(address(), index); }

        /** Sets the specified value to the {@code total_len} field. */
        public XXH64State.Buffer total_len(@NativeType("long long") long value) { XXH64State.ntotal_len(address(), value); return this; }
        /** Sets the specified value to the {@code v1} field. */
        public XXH64State.Buffer v1(@NativeType("long long") long value) { XXH64State.nv1(address(), value); return this; }
        /** Sets the specified value to the {@code v2} field. */
        public XXH64State.Buffer v2(@NativeType("long long") long value) { XXH64State.nv2(address(), value); return this; }
        /** Sets the specified value to the {@code v3} field. */
        public XXH64State.Buffer v3(@NativeType("long long") long value) { XXH64State.nv3(address(), value); return this; }
        /** Sets the specified value to the {@code v4} field. */
        public XXH64State.Buffer v4(@NativeType("long long") long value) { XXH64State.nv4(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code mem64} field. */
        public XXH64State.Buffer mem64(@NativeType("long long[4]") LongBuffer value) { XXH64State.nmem64(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code mem64} field. */
        public XXH64State.Buffer mem64(int index, @NativeType("long long") long value) { XXH64State.nmem64(address(), index, value); return this; }
        /** Sets the specified value to the {@code memsize} field. */
        public XXH64State.Buffer memsize(@NativeType("unsigned") int value) { XXH64State.nmemsize(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public XXH64State.Buffer reserved(@NativeType("unsigned[2]") IntBuffer value) { XXH64State.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public XXH64State.Buffer reserved(int index, @NativeType("unsigned") int value) { XXH64State.nreserved(address(), index, value); return this; }

    }

}