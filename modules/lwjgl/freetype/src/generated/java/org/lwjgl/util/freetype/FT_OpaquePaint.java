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
 * A structure representing an offset to a {@code Paint} value stored in any of the paint tables of a {@code COLR} v1 font.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_OpaquePaintRec {
 *     FT_Byte * p;
 *     FT_Bool insert_root_transform;
 * }</code></pre>
 */
@NativeType("struct FT_OpaquePaintRec")
public class FT_OpaquePaint extends Struct<FT_OpaquePaint> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        P,
        INSERT_ROOT_TRANSFORM;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        P = layout.offsetof(0);
        INSERT_ROOT_TRANSFORM = layout.offsetof(1);
    }

    protected FT_OpaquePaint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_OpaquePaint create(long address, @Nullable ByteBuffer container) {
        return new FT_OpaquePaint(address, container);
    }

    /**
     * Creates a {@code FT_OpaquePaint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_OpaquePaint(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code p} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("FT_Byte *")
    public ByteBuffer p(int capacity) { return np(address(), capacity); }
    /** @return the value of the {@code insert_root_transform} field. */
    @NativeType("FT_Bool")
    public boolean insert_root_transform() { return ninsert_root_transform(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_OpaquePaint} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_OpaquePaint malloc() {
        return new FT_OpaquePaint(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_OpaquePaint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_OpaquePaint calloc() {
        return new FT_OpaquePaint(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_OpaquePaint} instance allocated with {@link BufferUtils}. */
    public static FT_OpaquePaint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_OpaquePaint(memAddress(container), container);
    }

    /** Returns a new {@code FT_OpaquePaint} instance for the specified memory address. */
    public static FT_OpaquePaint create(long address) {
        return new FT_OpaquePaint(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_OpaquePaint createSafe(long address) {
        return address == NULL ? null : new FT_OpaquePaint(address, null);
    }

    /**
     * Returns a new {@link FT_OpaquePaint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_OpaquePaint.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_OpaquePaint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_OpaquePaint.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_OpaquePaint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_OpaquePaint.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_OpaquePaint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_OpaquePaint.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_OpaquePaint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_OpaquePaint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_OpaquePaint malloc(MemoryStack stack) {
        return new FT_OpaquePaint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_OpaquePaint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_OpaquePaint calloc(MemoryStack stack) {
        return new FT_OpaquePaint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_OpaquePaint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_OpaquePaint.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_OpaquePaint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_OpaquePaint.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #p(int) p}. */
    @Nullable public static ByteBuffer np(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_OpaquePaint.P), capacity); }
    /** Unsafe version of {@link #insert_root_transform}. */
    public static boolean ninsert_root_transform(long struct) { return UNSAFE.getByte(null, struct + FT_OpaquePaint.INSERT_ROOT_TRANSFORM) != 0; }

    // -----------------------------------

    /** An array of {@link FT_OpaquePaint} structs. */
    public static class Buffer extends StructBuffer<FT_OpaquePaint, Buffer> implements NativeResource {

        private static final FT_OpaquePaint ELEMENT_FACTORY = FT_OpaquePaint.create(-1L);

        /**
         * Creates a new {@code FT_OpaquePaint.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_OpaquePaint#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_OpaquePaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code p} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("FT_Byte *")
        public ByteBuffer p(int capacity) { return FT_OpaquePaint.np(address(), capacity); }
        /** @return the value of the {@code insert_root_transform} field. */
        @NativeType("FT_Bool")
        public boolean insert_root_transform() { return FT_OpaquePaint.ninsert_root_transform(address()); }

    }

}