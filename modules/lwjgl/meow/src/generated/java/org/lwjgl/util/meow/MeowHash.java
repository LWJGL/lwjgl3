/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meow;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union meow_hash {
 *     {@link MeowU128 meow_u128} u128;
 *     meow_u64 u64[2];
 *     meow_u32 u32[4];
 * }</code></pre>
 */
@NativeType("union meow_hash")
public class MeowHash extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        U128,
        U64,
        U32;

    static {
        Layout layout = __union(
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __array(8, 2),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        U128 = layout.offsetof(0);
        U64 = layout.offsetof(1);
        U32 = layout.offsetof(2);
    }

    /**
     * Creates a {@code MeowHash} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeowHash(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link MeowU128} view of the {@code u128} field. */
    @NativeType("meow_u128")
    public MeowU128 u128() { return nu128(address()); }
    /** @return a {@link LongBuffer} view of the {@code u64} field. */
    @NativeType("meow_u64[2]")
    public LongBuffer u64() { return nu64(address()); }
    /** @return the value at the specified index of the {@code u64} field. */
    @NativeType("meow_u64")
    public long u64(int index) { return nu64(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code u32} field. */
    @NativeType("meow_u32[4]")
    public IntBuffer u32() { return nu32(address()); }
    /** @return the value at the specified index of the {@code u32} field. */
    @NativeType("meow_u32")
    public int u32(int index) { return nu32(address(), index); }

    // -----------------------------------

    /** Returns a new {@code MeowHash} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeowHash malloc() {
        return wrap(MeowHash.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MeowHash} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeowHash calloc() {
        return wrap(MeowHash.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MeowHash} instance allocated with {@link BufferUtils}. */
    public static MeowHash create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeowHash.class, memAddress(container), container);
    }

    /** Returns a new {@code MeowHash} instance for the specified memory address. */
    public static MeowHash create(long address) {
        return wrap(MeowHash.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowHash createSafe(long address) {
        return address == NULL ? null : wrap(MeowHash.class, address);
    }

    /**
     * Returns a new {@link MeowHash.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowHash.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeowHash.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowHash.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowHash.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowHash.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeowHash.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeowHash.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowHash.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MeowHash mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MeowHash callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MeowHash mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MeowHash callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MeowHash.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MeowHash.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MeowHash.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MeowHash.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code MeowHash} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowHash malloc(MemoryStack stack) {
        return wrap(MeowHash.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MeowHash} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowHash calloc(MemoryStack stack) {
        return wrap(MeowHash.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeowHash.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowHash.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowHash.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowHash.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #u128}. */
    public static MeowU128 nu128(long struct) { return MeowU128.create(struct + MeowHash.U128); }
    /** Unsafe version of {@link #u64}. */
    public static LongBuffer nu64(long struct) { return memLongBuffer(struct + MeowHash.U64, 2); }
    /** Unsafe version of {@link #u64(int) u64}. */
    public static long nu64(long struct, int index) {
        return UNSAFE.getLong(null, struct + MeowHash.U64 + check(index, 2) * 8);
    }
    /** Unsafe version of {@link #u32}. */
    public static IntBuffer nu32(long struct) { return memIntBuffer(struct + MeowHash.U32, 4); }
    /** Unsafe version of {@link #u32(int) u32}. */
    public static int nu32(long struct, int index) {
        return UNSAFE.getInt(null, struct + MeowHash.U32 + check(index, 4) * 4);
    }

    // -----------------------------------

    /** An array of {@link MeowHash} structs. */
    public static class Buffer extends StructBuffer<MeowHash, Buffer> implements NativeResource {

        private static final MeowHash ELEMENT_FACTORY = MeowHash.create(-1L);

        /**
         * Creates a new {@code MeowHash.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeowHash#SIZEOF}, and its mark will be undefined.
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
        protected MeowHash getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link MeowU128} view of the {@code u128} field. */
        @NativeType("meow_u128")
        public MeowU128 u128() { return MeowHash.nu128(address()); }
        /** @return a {@link LongBuffer} view of the {@code u64} field. */
        @NativeType("meow_u64[2]")
        public LongBuffer u64() { return MeowHash.nu64(address()); }
        /** @return the value at the specified index of the {@code u64} field. */
        @NativeType("meow_u64")
        public long u64(int index) { return MeowHash.nu64(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code u32} field. */
        @NativeType("meow_u32[4]")
        public IntBuffer u32() { return MeowHash.nu32(address()); }
        /** @return the value at the specified index of the {@code u32} field. */
        @NativeType("meow_u32")
        public int u32(int index) { return MeowHash.nu32(address(), index); }

    }

}