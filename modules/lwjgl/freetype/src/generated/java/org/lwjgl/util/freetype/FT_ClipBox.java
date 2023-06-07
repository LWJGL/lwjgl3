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
 * A structure representing a {@code COLR} v1 {@code ClipBox} table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ClipBox {
 *     {@link FT_Vector FT_Vector} bottom_left;
 *     {@link FT_Vector FT_Vector} top_left;
 *     {@link FT_Vector FT_Vector} top_right;
 *     {@link FT_Vector FT_Vector} bottom_right;
 * }</code></pre>
 */
public class FT_ClipBox extends Struct<FT_ClipBox> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BOTTOM_LEFT,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT;

    static {
        Layout layout = __struct(
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BOTTOM_LEFT = layout.offsetof(0);
        TOP_LEFT = layout.offsetof(1);
        TOP_RIGHT = layout.offsetof(2);
        BOTTOM_RIGHT = layout.offsetof(3);
    }

    protected FT_ClipBox(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_ClipBox create(long address, @Nullable ByteBuffer container) {
        return new FT_ClipBox(address, container);
    }

    /**
     * Creates a {@code FT_ClipBox} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_ClipBox(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Vector} view of the {@code bottom_left} field. */
    public FT_Vector bottom_left() { return nbottom_left(address()); }
    /** @return a {@link FT_Vector} view of the {@code top_left} field. */
    public FT_Vector top_left() { return ntop_left(address()); }
    /** @return a {@link FT_Vector} view of the {@code top_right} field. */
    public FT_Vector top_right() { return ntop_right(address()); }
    /** @return a {@link FT_Vector} view of the {@code bottom_right} field. */
    public FT_Vector bottom_right() { return nbottom_right(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_ClipBox} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_ClipBox malloc() {
        return new FT_ClipBox(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_ClipBox} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_ClipBox calloc() {
        return new FT_ClipBox(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_ClipBox} instance allocated with {@link BufferUtils}. */
    public static FT_ClipBox create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_ClipBox(memAddress(container), container);
    }

    /** Returns a new {@code FT_ClipBox} instance for the specified memory address. */
    public static FT_ClipBox create(long address) {
        return new FT_ClipBox(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ClipBox createSafe(long address) {
        return address == NULL ? null : new FT_ClipBox(address, null);
    }

    /**
     * Returns a new {@link FT_ClipBox.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ClipBox.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_ClipBox.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ClipBox.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_ClipBox.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_ClipBox.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_ClipBox.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_ClipBox.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ClipBox.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_ClipBox} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_ClipBox malloc(MemoryStack stack) {
        return new FT_ClipBox(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_ClipBox} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_ClipBox calloc(MemoryStack stack) {
        return new FT_ClipBox(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_ClipBox.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_ClipBox.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_ClipBox.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_ClipBox.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bottom_left}. */
    public static FT_Vector nbottom_left(long struct) { return FT_Vector.create(struct + FT_ClipBox.BOTTOM_LEFT); }
    /** Unsafe version of {@link #top_left}. */
    public static FT_Vector ntop_left(long struct) { return FT_Vector.create(struct + FT_ClipBox.TOP_LEFT); }
    /** Unsafe version of {@link #top_right}. */
    public static FT_Vector ntop_right(long struct) { return FT_Vector.create(struct + FT_ClipBox.TOP_RIGHT); }
    /** Unsafe version of {@link #bottom_right}. */
    public static FT_Vector nbottom_right(long struct) { return FT_Vector.create(struct + FT_ClipBox.BOTTOM_RIGHT); }

    // -----------------------------------

    /** An array of {@link FT_ClipBox} structs. */
    public static class Buffer extends StructBuffer<FT_ClipBox, Buffer> implements NativeResource {

        private static final FT_ClipBox ELEMENT_FACTORY = FT_ClipBox.create(-1L);

        /**
         * Creates a new {@code FT_ClipBox.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_ClipBox#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_ClipBox getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Vector} view of the {@code bottom_left} field. */
        public FT_Vector bottom_left() { return FT_ClipBox.nbottom_left(address()); }
        /** @return a {@link FT_Vector} view of the {@code top_left} field. */
        public FT_Vector top_left() { return FT_ClipBox.ntop_left(address()); }
        /** @return a {@link FT_Vector} view of the {@code top_right} field. */
        public FT_Vector top_right() { return FT_ClipBox.ntop_right(address()); }
        /** @return a {@link FT_Vector} view of the {@code bottom_right} field. */
        public FT_Vector bottom_right() { return FT_ClipBox.nbottom_right(address()); }

    }

}