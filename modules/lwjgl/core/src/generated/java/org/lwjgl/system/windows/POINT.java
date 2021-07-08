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
 * Defines the x- and y- coordinates of a point.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct POINT {
 *     LONG {@link #x};
 *     LONG {@link #y};
 * }</code></pre>
 */
public class POINT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    /**
     * Creates a {@code POINT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public POINT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x-coordinate of the point */
    @NativeType("LONG")
    public int x() { return nx(address()); }
    /** the y-coordinate of the point */
    @NativeType("LONG")
    public int y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public POINT x(@NativeType("LONG") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public POINT y(@NativeType("LONG") int value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public POINT set(
        int x,
        int y
    ) {
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public POINT set(POINT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code POINT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static POINT malloc() {
        return wrap(POINT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code POINT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static POINT calloc() {
        return wrap(POINT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code POINT} instance allocated with {@link BufferUtils}. */
    public static POINT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(POINT.class, memAddress(container), container);
    }

    /** Returns a new {@code POINT} instance for the specified memory address. */
    public static POINT create(long address) {
        return wrap(POINT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static POINT createSafe(long address) {
        return address == NULL ? null : wrap(POINT.class, address);
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link POINT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static POINT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code POINT} instance allocated on the thread-local {@link MemoryStack}. */
    public static POINT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code POINT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static POINT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code POINT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static POINT mallocStack(MemoryStack stack) {
        return wrap(POINT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code POINT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static POINT callocStack(MemoryStack stack) {
        return wrap(POINT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link POINT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static POINT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + POINT.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + POINT.Y); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + POINT.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + POINT.Y, value); }

    // -----------------------------------

    /** An array of {@link POINT} structs. */
    public static class Buffer extends StructBuffer<POINT, Buffer> implements NativeResource {

        private static final POINT ELEMENT_FACTORY = POINT.create(-1L);

        /**
         * Creates a new {@code POINT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link POINT#SIZEOF}, and its mark will be undefined.
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
        protected POINT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link POINT#x} field. */
        @NativeType("LONG")
        public int x() { return POINT.nx(address()); }
        /** @return the value of the {@link POINT#y} field. */
        @NativeType("LONG")
        public int y() { return POINT.ny(address()); }

        /** Sets the specified value to the {@link POINT#x} field. */
        public POINT.Buffer x(@NativeType("LONG") int value) { POINT.nx(address(), value); return this; }
        /** Sets the specified value to the {@link POINT#y} field. */
        public POINT.Buffer y(@NativeType("LONG") int value) { POINT.ny(address(), value); return this; }

    }

}