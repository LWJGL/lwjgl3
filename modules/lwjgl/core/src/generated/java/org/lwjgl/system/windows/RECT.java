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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code left} &ndash; the x-coordinate of the upper-left corner of the rectangle</li>
 * <li>{@code top} &ndash; the y-coordinate of the upper-left corner of the rectangle</li>
 * <li>{@code right} &ndash; the x-coordinate of the lower-right corner of the rectangle</li>
 * <li>{@code bottom} &ndash; the y-coordinate of the lower-right corner of the rectangle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RECT {
 *     LONG left;
 *     LONG top;
 *     LONG right;
 *     LONG bottom;
 * }</code></pre>
 */
public class RECT extends Struct implements NativeResource {

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

    /** Returns the value of the {@code left} field. */
    @NativeType("LONG")
    public int left() { return nleft(address()); }
    /** Returns the value of the {@code top} field. */
    @NativeType("LONG")
    public int top() { return ntop(address()); }
    /** Returns the value of the {@code right} field. */
    @NativeType("LONG")
    public int right() { return nright(address()); }
    /** Returns the value of the {@code bottom} field. */
    @NativeType("LONG")
    public int bottom() { return nbottom(address()); }

    /** Sets the specified value to the {@code left} field. */
    public RECT left(@NativeType("LONG") int value) { nleft(address(), value); return this; }
    /** Sets the specified value to the {@code top} field. */
    public RECT top(@NativeType("LONG") int value) { ntop(address(), value); return this; }
    /** Sets the specified value to the {@code right} field. */
    public RECT right(@NativeType("LONG") int value) { nright(address(), value); return this; }
    /** Sets the specified value to the {@code bottom} field. */
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
        return wrap(RECT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RECT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RECT calloc() {
        return wrap(RECT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RECT} instance allocated with {@link BufferUtils}. */
    public static RECT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RECT.class, memAddress(container), container);
    }

    /** Returns a new {@code RECT} instance for the specified memory address. */
    public static RECT create(long address) {
        return wrap(RECT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RECT createSafe(long address) {
        return address == NULL ? null : wrap(RECT.class, address);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link RECT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RECT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code RECT} instance allocated on the thread-local {@link MemoryStack}. */
    public static RECT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code RECT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RECT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code RECT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RECT mallocStack(MemoryStack stack) {
        return wrap(RECT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RECT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RECT callocStack(MemoryStack stack) {
        return wrap(RECT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RECT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RECT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RECT#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code left} field. */
        @NativeType("LONG")
        public int left() { return RECT.nleft(address()); }
        /** Returns the value of the {@code top} field. */
        @NativeType("LONG")
        public int top() { return RECT.ntop(address()); }
        /** Returns the value of the {@code right} field. */
        @NativeType("LONG")
        public int right() { return RECT.nright(address()); }
        /** Returns the value of the {@code bottom} field. */
        @NativeType("LONG")
        public int bottom() { return RECT.nbottom(address()); }

        /** Sets the specified value to the {@code left} field. */
        public RECT.Buffer left(@NativeType("LONG") int value) { RECT.nleft(address(), value); return this; }
        /** Sets the specified value to the {@code top} field. */
        public RECT.Buffer top(@NativeType("LONG") int value) { RECT.ntop(address(), value); return this; }
        /** Sets the specified value to the {@code right} field. */
        public RECT.Buffer right(@NativeType("LONG") int value) { RECT.nright(address(), value); return this; }
        /** Sets the specified value to the {@code bottom} field. */
        public RECT.Buffer bottom(@NativeType("LONG") int value) { RECT.nbottom(address(), value); return this; }

    }

}