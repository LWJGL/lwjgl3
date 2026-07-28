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
 * struct spv_position_t {
 *     size_t line;
 *     size_t column;
 *     size_t index;
 * }}</pre>
 */
@NativeType("struct spv_position_t")
public class SPVPosition extends Struct<SPVPosition> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LINE,
        COLUMN,
        INDEX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LINE = layout.offsetof(0);
        COLUMN = layout.offsetof(1);
        INDEX = layout.offsetof(2);
    }

    protected SPVPosition(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SPVPosition create(long address, @Nullable ByteBuffer container) {
        return new SPVPosition(address, container);
    }

    /**
     * Creates a {@code SPVPosition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SPVPosition(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code line} field. */
    @NativeType("size_t")
    public long line() { return nline(address()); }
    /** @return the value of the {@code column} field. */
    @NativeType("size_t")
    public long column() { return ncolumn(address()); }
    /** @return the value of the {@code index} field. */
    @NativeType("size_t")
    public long index() { return nindex(address()); }

    /** Sets the specified value to the {@code line} field. */
    public SPVPosition line(@NativeType("size_t") long value) { nline(address(), value); return this; }
    /** Sets the specified value to the {@code column} field. */
    public SPVPosition column(@NativeType("size_t") long value) { ncolumn(address(), value); return this; }
    /** Sets the specified value to the {@code index} field. */
    public SPVPosition index(@NativeType("size_t") long value) { nindex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SPVPosition set(
        long line,
        long column,
        long index
    ) {
        line(line);
        column(column);
        index(index);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SPVPosition set(SPVPosition src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SPVPosition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SPVPosition malloc() {
        return new SPVPosition(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SPVPosition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SPVPosition calloc() {
        return new SPVPosition(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SPVPosition} instance allocated with {@link BufferUtils}. */
    public static SPVPosition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVPosition(memAddress(container), container);
    }

    /** Returns a new {@code SPVPosition} instance for the specified memory address. */
    public static SPVPosition create(long address) {
        return new SPVPosition(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SPVPosition createSafe(long address) {
        return address == NULL ? null : new SPVPosition(address, null);
    }

    /**
     * Returns a new {@link SPVPosition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVPosition.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SPVPosition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SPVPosition.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVPosition.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SPVPosition.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SPVPosition.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SPVPosition.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SPVPosition.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SPVPosition} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVPosition malloc(MemoryStack stack) {
        return new SPVPosition(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SPVPosition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SPVPosition calloc(MemoryStack stack) {
        return new SPVPosition(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SPVPosition.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVPosition.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SPVPosition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SPVPosition.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #line}. */
    public static long nline(long struct) { return memGetAddress(struct + SPVPosition.LINE); }
    /** Unsafe version of {@link #column}. */
    public static long ncolumn(long struct) { return memGetAddress(struct + SPVPosition.COLUMN); }
    /** Unsafe version of {@link #index}. */
    public static long nindex(long struct) { return memGetAddress(struct + SPVPosition.INDEX); }

    /** Unsafe version of {@link #line(long) line}. */
    public static void nline(long struct, long value) { memPutAddress(struct + SPVPosition.LINE, value); }
    /** Unsafe version of {@link #column(long) column}. */
    public static void ncolumn(long struct, long value) { memPutAddress(struct + SPVPosition.COLUMN, value); }
    /** Unsafe version of {@link #index(long) index}. */
    public static void nindex(long struct, long value) { memPutAddress(struct + SPVPosition.INDEX, value); }

    // -----------------------------------

    /** An array of {@link SPVPosition} structs. */
    public static class Buffer extends StructBuffer<SPVPosition, Buffer> implements NativeResource {

        private static final SPVPosition ELEMENT_FACTORY = SPVPosition.create(-1L);

        /**
         * Creates a new {@code SPVPosition.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SPVPosition#SIZEOF}, and its mark will be undefined.</p>
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
        protected SPVPosition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code line} field. */
        @NativeType("size_t")
        public long line() { return SPVPosition.nline(address()); }
        /** @return the value of the {@code column} field. */
        @NativeType("size_t")
        public long column() { return SPVPosition.ncolumn(address()); }
        /** @return the value of the {@code index} field. */
        @NativeType("size_t")
        public long index() { return SPVPosition.nindex(address()); }

        /** Sets the specified value to the {@code line} field. */
        public SPVPosition.Buffer line(@NativeType("size_t") long value) { SPVPosition.nline(address(), value); return this; }
        /** Sets the specified value to the {@code column} field. */
        public SPVPosition.Buffer column(@NativeType("size_t") long value) { SPVPosition.ncolumn(address(), value); return this; }
        /** Sets the specified value to the {@code index} field. */
        public SPVPosition.Buffer index(@NativeType("size_t") long value) { SPVPosition.nindex(address(), value); return this; }

    }

}