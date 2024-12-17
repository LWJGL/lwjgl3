/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ffi_type {
 *     size_t size;
 *     unsigned short alignment;
 *     unsigned short type;
 *     ffi_type * elements;
 * }}</pre>
 */
@NativeType("struct ffi_type")
public class FFIType extends Struct<FFIType> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        ALIGNMENT,
        TYPE,
        ELEMENTS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(2),
            __member(2),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ELEMENTS = layout.offsetof(3);
    }

    protected FFIType(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FFIType create(long address, @Nullable ByteBuffer container) {
        return new FFIType(address, container);
    }

    /**
     * Creates a {@code FFIType} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FFIType(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code alignment} field. */
    @NativeType("unsigned short")
    public short alignment() { return nalignment(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("unsigned short")
    public short type() { return ntype(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code elements} field. */
    @NativeType("ffi_type *")
    public @Nullable PointerBuffer elements(int capacity) { return nelements(address(), capacity); }

    /** Sets the specified value to the {@code size} field. */
    public FFIType size(@NativeType("size_t") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code alignment} field. */
    public FFIType alignment(@NativeType("unsigned short") short value) { nalignment(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public FFIType type(@NativeType("unsigned short") short value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code elements} field. */
    public FFIType elements(@Nullable @NativeType("ffi_type *") PointerBuffer value) { nelements(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FFIType set(
        long size,
        short alignment,
        short type,
        @Nullable PointerBuffer elements
    ) {
        size(size);
        alignment(alignment);
        type(type);
        elements(elements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FFIType set(FFIType src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FFIType} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FFIType malloc() {
        return new FFIType(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FFIType} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FFIType calloc() {
        return new FFIType(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FFIType} instance allocated with {@link BufferUtils}. */
    public static FFIType create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FFIType(memAddress(container), container);
    }

    /** Returns a new {@code FFIType} instance for the specified memory address. */
    public static FFIType create(long address) {
        return new FFIType(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FFIType createSafe(long address) {
        return address == NULL ? null : new FFIType(address, null);
    }

    /**
     * Returns a new {@link FFIType.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FFIType.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FFIType.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FFIType.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FFIType.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FFIType.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FFIType.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FFIType.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FFIType.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FFIType} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FFIType malloc(MemoryStack stack) {
        return new FFIType(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FFIType} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FFIType calloc(MemoryStack stack) {
        return new FFIType(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FFIType.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FFIType.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FFIType.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FFIType.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + FFIType.SIZE); }
    /** Unsafe version of {@link #alignment}. */
    public static short nalignment(long struct) { return memGetShort(struct + FFIType.ALIGNMENT); }
    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + FFIType.TYPE); }
    /** Unsafe version of {@link #elements(int) elements}. */
    public static @Nullable PointerBuffer nelements(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + FFIType.ELEMENTS), capacity); }

    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + FFIType.SIZE, value); }
    /** Unsafe version of {@link #alignment(short) alignment}. */
    public static void nalignment(long struct, short value) { memPutShort(struct + FFIType.ALIGNMENT, value); }
    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + FFIType.TYPE, value); }
    /** Unsafe version of {@link #elements(PointerBuffer) elements}. */
    public static void nelements(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + FFIType.ELEMENTS, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FFIType} structs. */
    public static class Buffer extends StructBuffer<FFIType, Buffer> implements NativeResource {

        private static final FFIType ELEMENT_FACTORY = FFIType.create(-1L);

        /**
         * Creates a new {@code FFIType.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FFIType#SIZEOF}, and its mark will be undefined.</p>
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
        protected FFIType getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return FFIType.nsize(address()); }
        /** @return the value of the {@code alignment} field. */
        @NativeType("unsigned short")
        public short alignment() { return FFIType.nalignment(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("unsigned short")
        public short type() { return FFIType.ntype(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code elements} field. */
        @NativeType("ffi_type *")
        public @Nullable PointerBuffer elements(int capacity) { return FFIType.nelements(address(), capacity); }

        /** Sets the specified value to the {@code size} field. */
        public FFIType.Buffer size(@NativeType("size_t") long value) { FFIType.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code alignment} field. */
        public FFIType.Buffer alignment(@NativeType("unsigned short") short value) { FFIType.nalignment(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public FFIType.Buffer type(@NativeType("unsigned short") short value) { FFIType.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code elements} field. */
        public FFIType.Buffer elements(@Nullable @NativeType("ffi_type *") PointerBuffer value) { FFIType.nelements(address(), value); return this; }

    }

}