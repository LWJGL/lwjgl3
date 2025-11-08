/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spv_binary_t {
 *     uint32_t * code;
 *     size_t wordCount;
 * }}</pre>
 */
@NativeType("struct spv_binary_t")
public class SPVBinary extends Struct<SPVBinary> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CODE,
        WORDCOUNT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CODE = layout.offsetof(0);
        WORDCOUNT = layout.offsetof(1);
    }

    protected SPVBinary(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVBinary create(long address, @Nullable ByteBuffer container) {
        return new SPVBinary(address, container);
    }

    /**
     * Creates a {@code SPVBinary} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVBinary(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the data pointed to by the {@code code} field. */
    @NativeType("uint32_t *")
    public IntBuffer code() { return ncode(address()); }
    /** @return the value of the {@code wordCount} field. */
    @NativeType("size_t")
    public long wordCount() { return nwordCount(address()); }

    // -----------------------------------

    /** Returns a new {@code SPVBinary} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SPVBinary malloc() {
        return new SPVBinary(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SPVBinary} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SPVBinary calloc() {
        return new SPVBinary(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SPVBinary} instance allocated with {@link BufferUtils}. */
    public static SPVBinary create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVBinary(memAddress(container), container);
    }

    /** Returns a new {@code SPVBinary} instance for the specified memory address. */
    public static SPVBinary create(long address) {
        return new SPVBinary(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVBinary createSafe(long address) {
        return address == NULL ? null : new SPVBinary(address, null);
    }

    /**
     * Returns a new {@link SPVBinary.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVBinary.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SPVBinary.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVBinary.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVBinary.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SPVBinary.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SPVBinary.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVBinary.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVBinary.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SPVBinary} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVBinary malloc(MemoryStack stack) {
        return new SPVBinary(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SPVBinary} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVBinary calloc(MemoryStack stack) {
        return new SPVBinary(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SPVBinary.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVBinary.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVBinary.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVBinary.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #code() code}. */
    public static IntBuffer ncode(long struct) { return memIntBuffer(memGetAddress(struct + SPVBinary.CODE), (int)nwordCount(struct)); }
    /** Unsafe version of {@link #wordCount}. */
    public static long nwordCount(long struct) { return memGetAddress(struct + SPVBinary.WORDCOUNT); }

    // -----------------------------------

    /** An array of {@link SPVBinary} structs. */
    public static class Buffer extends StructBuffer<SPVBinary, Buffer> implements NativeResource {

        private static final SPVBinary ELEMENT_FACTORY = SPVBinary.create(-1L);

        /**
         * Creates a new {@code SPVBinary.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVBinary#SIZEOF}, and its mark will be undefined.</p>
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
        protected SPVBinary getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the data pointed to by the {@code code} field. */
        @NativeType("uint32_t *")
        public IntBuffer code() { return SPVBinary.ncode(address()); }
        /** @return the value of the {@code wordCount} field. */
        @NativeType("size_t")
        public long wordCount() { return SPVBinary.nwordCount(address()); }

    }

}