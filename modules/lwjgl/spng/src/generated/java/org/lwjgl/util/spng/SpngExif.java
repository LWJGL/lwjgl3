/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_exif {
 *     size_t length;
 *     char * data;
 * }}</pre>
 */
@NativeType("struct spng_exif")
public class SpngExif extends Struct<SpngExif> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LENGTH,
        DATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LENGTH = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected SpngExif(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngExif create(long address, @Nullable ByteBuffer container) {
        return new SpngExif(address, container);
    }

    /**
     * Creates a {@code SpngExif} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngExif(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code length} field. */
    @NativeType("size_t")
    public long length() { return nlength(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("char *")
    public ByteBuffer data(int capacity) { return ndata(address(), capacity); }

    /** Sets the specified value to the {@code length} field. */
    public SpngExif length(@NativeType("size_t") long value) { nlength(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public SpngExif data(@NativeType("char *") ByteBuffer value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngExif set(
        long length,
        ByteBuffer data
    ) {
        length(length);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpngExif set(SpngExif src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngExif} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngExif malloc() {
        return new SpngExif(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngExif} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngExif calloc() {
        return new SpngExif(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngExif} instance allocated with {@link BufferUtils}. */
    public static SpngExif create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngExif(memAddress(container), container);
    }

    /** Returns a new {@code SpngExif} instance for the specified memory address. */
    public static SpngExif create(long address) {
        return new SpngExif(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngExif createSafe(long address) {
        return address == NULL ? null : new SpngExif(address, null);
    }

    /**
     * Returns a new {@link SpngExif.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngExif.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngExif.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngExif.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngExif.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngExif.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngExif.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngExif.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngExif.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngExif} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngExif malloc(MemoryStack stack) {
        return new SpngExif(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngExif} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngExif calloc(MemoryStack stack) {
        return new SpngExif(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngExif.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngExif.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngExif.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngExif.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + SpngExif.LENGTH); }
    /** Unsafe version of {@link #data(int) data}. */
    public static ByteBuffer ndata(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SpngExif.DATA), capacity); }

    /** Unsafe version of {@link #length(long) length}. */
    public static void nlength(long struct, long value) { memPutAddress(struct + SpngExif.LENGTH, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + SpngExif.DATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpngExif.DATA));
    }

    // -----------------------------------

    /** An array of {@link SpngExif} structs. */
    public static class Buffer extends StructBuffer<SpngExif, Buffer> implements NativeResource {

        private static final SpngExif ELEMENT_FACTORY = SpngExif.create(-1L);

        /**
         * Creates a new {@code SpngExif.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngExif#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngExif getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return SpngExif.nlength(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("char *")
        public ByteBuffer data(int capacity) { return SpngExif.ndata(address(), capacity); }

        /** Sets the specified value to the {@code length} field. */
        public SpngExif.Buffer length(@NativeType("size_t") long value) { SpngExif.nlength(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public SpngExif.Buffer data(@NativeType("char *") ByteBuffer value) { SpngExif.ndata(address(), value); return this; }

    }

}