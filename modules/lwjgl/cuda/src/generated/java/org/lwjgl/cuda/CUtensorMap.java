/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.cuda.CU.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUtensorMap {
 *     cuuint64_t opaque[CU_TENSOR_MAP_NUM_QWORDS];
 * }</code></pre>
 */
public class CUtensorMap extends Struct<CUtensorMap> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPAQUE;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, 64,
            __array(8, CU_TENSOR_MAP_NUM_QWORDS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPAQUE = layout.offsetof(0);
    }

    protected CUtensorMap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUtensorMap create(long address, @Nullable ByteBuffer container) {
        return new CUtensorMap(address, container);
    }

    /**
     * Creates a {@code CUtensorMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUtensorMap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LongBuffer} view of the {@code opaque} field. */
    @NativeType("cuuint64_t[CU_TENSOR_MAP_NUM_QWORDS]")
    public LongBuffer opaque() { return nopaque(address()); }
    /** @return the value at the specified index of the {@code opaque} field. */
    @NativeType("cuuint64_t")
    public long opaque(int index) { return nopaque(address(), index); }

    /** Copies the specified {@link LongBuffer} to the {@code opaque} field. */
    public CUtensorMap opaque(@NativeType("cuuint64_t[CU_TENSOR_MAP_NUM_QWORDS]") LongBuffer value) { nopaque(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code opaque} field. */
    public CUtensorMap opaque(int index, @NativeType("cuuint64_t") long value) { nopaque(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUtensorMap set(CUtensorMap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUtensorMap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUtensorMap malloc() {
        return new CUtensorMap(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUtensorMap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUtensorMap calloc() {
        return new CUtensorMap(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUtensorMap} instance allocated with {@link BufferUtils}. */
    public static CUtensorMap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUtensorMap(memAddress(container), container);
    }

    /** Returns a new {@code CUtensorMap} instance for the specified memory address. */
    public static CUtensorMap create(long address) {
        return new CUtensorMap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUtensorMap createSafe(long address) {
        return address == NULL ? null : new CUtensorMap(address, null);
    }

    /**
     * Returns a new {@link CUtensorMap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUtensorMap.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUtensorMap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUtensorMap.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUtensorMap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUtensorMap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUtensorMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUtensorMap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUtensorMap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUtensorMap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUtensorMap malloc(MemoryStack stack) {
        return new CUtensorMap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUtensorMap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUtensorMap calloc(MemoryStack stack) {
        return new CUtensorMap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUtensorMap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUtensorMap.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUtensorMap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUtensorMap.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #opaque}. */
    public static LongBuffer nopaque(long struct) { return memLongBuffer(struct + CUtensorMap.OPAQUE, CU_TENSOR_MAP_NUM_QWORDS); }
    /** Unsafe version of {@link #opaque(int) opaque}. */
    public static long nopaque(long struct, int index) {
        return UNSAFE.getLong(null, struct + CUtensorMap.OPAQUE + check(index, CU_TENSOR_MAP_NUM_QWORDS) * 8);
    }

    /** Unsafe version of {@link #opaque(LongBuffer) opaque}. */
    public static void nopaque(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, CU_TENSOR_MAP_NUM_QWORDS); }
        memCopy(memAddress(value), struct + CUtensorMap.OPAQUE, value.remaining() * 8);
    }
    /** Unsafe version of {@link #opaque(int, long) opaque}. */
    public static void nopaque(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + CUtensorMap.OPAQUE + check(index, CU_TENSOR_MAP_NUM_QWORDS) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link CUtensorMap} structs. */
    public static class Buffer extends StructBuffer<CUtensorMap, Buffer> implements NativeResource {

        private static final CUtensorMap ELEMENT_FACTORY = CUtensorMap.create(-1L);

        /**
         * Creates a new {@code CUtensorMap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUtensorMap#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUtensorMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LongBuffer} view of the {@code opaque} field. */
        @NativeType("cuuint64_t[CU_TENSOR_MAP_NUM_QWORDS]")
        public LongBuffer opaque() { return CUtensorMap.nopaque(address()); }
        /** @return the value at the specified index of the {@code opaque} field. */
        @NativeType("cuuint64_t")
        public long opaque(int index) { return CUtensorMap.nopaque(address(), index); }

        /** Copies the specified {@link LongBuffer} to the {@code opaque} field. */
        public CUtensorMap.Buffer opaque(@NativeType("cuuint64_t[CU_TENSOR_MAP_NUM_QWORDS]") LongBuffer value) { CUtensorMap.nopaque(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code opaque} field. */
        public CUtensorMap.Buffer opaque(int index, @NativeType("cuuint64_t") long value) { CUtensorMap.nopaque(address(), index, value); return this; }

    }

}