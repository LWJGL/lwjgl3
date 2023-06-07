/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A simple structure to pass more or less generic parameters to {@link FreeType#FT_Open_Face Open_Face} and {@link FreeType#FT_Face_Properties Face_Properties}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Parameter {
 *     FT_ULong tag;
 *     FT_Pointer data;
 * }</code></pre>
 */
public class FT_Parameter extends Struct<FT_Parameter> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TAG,
        DATA;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TAG = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected FT_Parameter(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Parameter create(long address, @Nullable ByteBuffer container) {
        return new FT_Parameter(address, container);
    }

    /**
     * Creates a {@code FT_Parameter} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Parameter(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code tag} field. */
    @NativeType("FT_ULong")
    public long tag() { return ntag(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("FT_Pointer")
    public ByteBuffer data(int capacity) { return ndata(address(), capacity); }

    /** Sets the specified value to the {@code tag} field. */
    public FT_Parameter tag(@NativeType("FT_ULong") long value) { ntag(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public FT_Parameter data(@Nullable @NativeType("FT_Pointer") ByteBuffer value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Parameter set(
        long tag,
        @Nullable ByteBuffer data
    ) {
        tag(tag);
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
    public FT_Parameter set(FT_Parameter src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Parameter} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Parameter malloc() {
        return new FT_Parameter(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Parameter} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Parameter calloc() {
        return new FT_Parameter(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Parameter} instance allocated with {@link BufferUtils}. */
    public static FT_Parameter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Parameter(memAddress(container), container);
    }

    /** Returns a new {@code FT_Parameter} instance for the specified memory address. */
    public static FT_Parameter create(long address) {
        return new FT_Parameter(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Parameter createSafe(long address) {
        return address == NULL ? null : new FT_Parameter(address, null);
    }

    /**
     * Returns a new {@link FT_Parameter.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Parameter.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Parameter.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Parameter.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Parameter.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Parameter.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Parameter.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Parameter.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Parameter.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Parameter} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Parameter malloc(MemoryStack stack) {
        return new FT_Parameter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Parameter} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Parameter calloc(MemoryStack stack) {
        return new FT_Parameter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Parameter.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Parameter.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Parameter.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Parameter.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tag}. */
    public static long ntag(long struct) { return memGetCLong(struct + FT_Parameter.TAG); }
    /** Unsafe version of {@link #data(int) data}. */
    @Nullable public static ByteBuffer ndata(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_Parameter.DATA), capacity); }

    /** Unsafe version of {@link #tag(long) tag}. */
    public static void ntag(long struct, long value) { memPutCLong(struct + FT_Parameter.TAG, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Parameter.DATA, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FT_Parameter} structs. */
    public static class Buffer extends StructBuffer<FT_Parameter, Buffer> implements NativeResource {

        private static final FT_Parameter ELEMENT_FACTORY = FT_Parameter.create(-1L);

        /**
         * Creates a new {@code FT_Parameter.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Parameter#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Parameter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code tag} field. */
        @NativeType("FT_ULong")
        public long tag() { return FT_Parameter.ntag(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("FT_Pointer")
        public ByteBuffer data(int capacity) { return FT_Parameter.ndata(address(), capacity); }

        /** Sets the specified value to the {@code tag} field. */
        public FT_Parameter.Buffer tag(@NativeType("FT_ULong") long value) { FT_Parameter.ntag(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public FT_Parameter.Buffer data(@Nullable @NativeType("FT_Pointer") ByteBuffer value) { FT_Parameter.ndata(address(), value); return this; }

    }

}