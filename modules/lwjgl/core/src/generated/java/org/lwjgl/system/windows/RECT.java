/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines the coordinates of the upper-left and lower-right corners of a rectangle.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RECT {
 *     LONG {@link #left};
 *     LONG {@link #top};
 *     LONG {@link #right};
 *     LONG {@link #bottom};
 * }</code></pre>
 */
public class RECT extends Struct<RECT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LEFT,
        TOP,
        RIGHT,
        BOTTOM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LEFT = layout.offsetof(0);
        TOP = layout.offsetof(1);
        RIGHT = layout.offsetof(2);
        BOTTOM = layout.offsetof(3);
    }

    protected RECT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RECT create(long address, @Nullable ByteBuffer container) {
        return new RECT(address, container);
    }

    /**
     * Creates a {@code RECT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RECT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x-coordinate of the upper-left corner of the rectangle */
    @NativeType("LONG")
    public int left() { return nleft(address()); }
    /** the y-coordinate of the upper-left corner of the rectangle */
    @NativeType("LONG")
    public int top() { return ntop(address()); }
    /** the x-coordinate of the lower-right corner of the rectangle */
    @NativeType("LONG")
    public int right() { return nright(address()); }
    /** the y-coordinate of the lower-right corner of the rectangle */
    @NativeType("LONG")
    public int bottom() { return nbottom(address()); }

    /** Sets the specified value to the {@link #left} field. */
    public RECT left(@NativeType("LONG") int value) { nleft(address(), value); return this; }
    /** Sets the specified value to the {@link #top} field. */
    public RECT top(@NativeType("LONG") int value) { ntop(address(), value); return this; }
    /** Sets the specified value to the {@link #right} field. */
    public RECT right(@NativeType("LONG") int value) { nright(address(), value); return this; }
    /** Sets the specified value to the {@link #bottom} field. */
    public RECT bottom(@NativeType("LONG") int value) { nbottom(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RECT set(
        int left,
        int top,
        int right,
        int bottom
    ) {
        left(left);
        top(top);
        right(right);
        bottom(bottom);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RECT set(RECT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RECT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RECT malloc() {
        return new RECT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RECT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RECT calloc() {
        return new RECT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RECT} instance allocated with {@link BufferUtils}. */
    public static RECT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RECT(memAddress(container), container);
    }

    /** Returns a new {@code RECT} instance for the specified memory address. */
    public static RECT create(long address) {
        return new RECT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RECT createSafe(long address) {
        return address == NULL ? null : new RECT(address, null);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RECT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RECT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RECT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RECT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RECT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RECT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RECT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RECT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RECT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RECT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code RECT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RECT malloc(MemoryStack stack) {
        return new RECT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RECT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RECT calloc(MemoryStack stack) {
        return new RECT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #left}. */
    public static int nleft(long struct) { return UNSAFE.getInt(null, struct + RECT.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static int ntop(long struct) { return UNSAFE.getInt(null, struct + RECT.TOP); }
    /** Unsafe version of {@link #right}. */
    public static int nright(long struct) { return UNSAFE.getInt(null, struct + RECT.RIGHT); }
    /** Unsafe version of {@link #bottom}. */
    public static int nbottom(long struct) { return UNSAFE.getInt(null, struct + RECT.BOTTOM); }

    /** Unsafe version of {@link #left(int) left}. */
    public static void nleft(long struct, int value) { UNSAFE.putInt(null, struct + RECT.LEFT, value); }
    /** Unsafe version of {@link #top(int) top}. */
    public static void ntop(long struct, int value) { UNSAFE.putInt(null, struct + RECT.TOP, value); }
    /** Unsafe version of {@link #right(int) right}. */
    public static void nright(long struct, int value) { UNSAFE.putInt(null, struct + RECT.RIGHT, value); }
    /** Unsafe version of {@link #bottom(int) bottom}. */
    public static void nbottom(long struct, int value) { UNSAFE.putInt(null, struct + RECT.BOTTOM, value); }

    // -----------------------------------

    /** An array of {@link RECT} structs. */
    public static class Buffer extends StructBuffer<RECT, Buffer> implements NativeResource {

        private static final RECT ELEMENT_FACTORY = RECT.create(-1L);

        /**
         * Creates a new {@code RECT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RECT#SIZEOF}, and its mark will be undefined.</p>
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
        protected RECT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link RECT#left} field. */
        @NativeType("LONG")
        public int left() { return RECT.nleft(address()); }
        /** @return the value of the {@link RECT#top} field. */
        @NativeType("LONG")
        public int top() { return RECT.ntop(address()); }
        /** @return the value of the {@link RECT#right} field. */
        @NativeType("LONG")
        public int right() { return RECT.nright(address()); }
        /** @return the value of the {@link RECT#bottom} field. */
        @NativeType("LONG")
        public int bottom() { return RECT.nbottom(address()); }

        /** Sets the specified value to the {@link RECT#left} field. */
        public RECT.Buffer left(@NativeType("LONG") int value) { RECT.nleft(address(), value); return this; }
        /** Sets the specified value to the {@link RECT#top} field. */
        public RECT.Buffer top(@NativeType("LONG") int value) { RECT.ntop(address(), value); return this; }
        /** Sets the specified value to the {@link RECT#right} field. */
        public RECT.Buffer right(@NativeType("LONG") int value) { RECT.nright(address(), value); return this; }
        /** Sets the specified value to the {@link RECT#bottom} field. */
        public RECT.Buffer bottom(@NativeType("LONG") int value) { RECT.nbottom(address(), value); return this; }

    }

}