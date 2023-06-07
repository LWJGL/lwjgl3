/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure that contains a point in a two-dimensional coordinate system.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CGPoint {
 *     CGFloat {@link #x};
 *     CGFloat {@link #y};
 * }</code></pre>
 */
public class CGPoint extends Struct<CGPoint> implements NativeResource {

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
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected CGPoint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CGPoint create(long address, @Nullable ByteBuffer container) {
        return new CGPoint(address, container);
    }

    /**
     * Creates a {@code CGPoint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CGPoint(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x-coordinate of the point */
    @NativeType("CGFloat")
    public double x() { return nx(address()); }
    /** the y-coordinate of the point */
    @NativeType("CGFloat")
    public double y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public CGPoint x(@NativeType("CGFloat") double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public CGPoint y(@NativeType("CGFloat") double value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CGPoint set(
        double x,
        double y
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
    public CGPoint set(CGPoint src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CGPoint} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CGPoint malloc() {
        return new CGPoint(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CGPoint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CGPoint calloc() {
        return new CGPoint(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CGPoint} instance allocated with {@link BufferUtils}. */
    public static CGPoint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CGPoint(memAddress(container), container);
    }

    /** Returns a new {@code CGPoint} instance for the specified memory address. */
    public static CGPoint create(long address) {
        return new CGPoint(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGPoint createSafe(long address) {
        return address == NULL ? null : new CGPoint(address, null);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CGPoint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGPoint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CGPoint mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CGPoint callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CGPoint mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CGPoint callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CGPoint.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CGPoint.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CGPoint.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CGPoint.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CGPoint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CGPoint malloc(MemoryStack stack) {
        return new CGPoint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CGPoint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CGPoint calloc(MemoryStack stack) {
        return new CGPoint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static double nx(long struct) { return UNSAFE.getDouble(null, struct + CGPoint.X); }
    /** Unsafe version of {@link #y}. */
    public static double ny(long struct) { return UNSAFE.getDouble(null, struct + CGPoint.Y); }

    /** Unsafe version of {@link #x(double) x}. */
    public static void nx(long struct, double value) { UNSAFE.putDouble(null, struct + CGPoint.X, value); }
    /** Unsafe version of {@link #y(double) y}. */
    public static void ny(long struct, double value) { UNSAFE.putDouble(null, struct + CGPoint.Y, value); }

    // -----------------------------------

    /** An array of {@link CGPoint} structs. */
    public static class Buffer extends StructBuffer<CGPoint, Buffer> implements NativeResource {

        private static final CGPoint ELEMENT_FACTORY = CGPoint.create(-1L);

        /**
         * Creates a new {@code CGPoint.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CGPoint#SIZEOF}, and its mark will be undefined.</p>
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
        protected CGPoint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CGPoint#x} field. */
        @NativeType("CGFloat")
        public double x() { return CGPoint.nx(address()); }
        /** @return the value of the {@link CGPoint#y} field. */
        @NativeType("CGFloat")
        public double y() { return CGPoint.ny(address()); }

        /** Sets the specified value to the {@link CGPoint#x} field. */
        public CGPoint.Buffer x(@NativeType("CGFloat") double value) { CGPoint.nx(address(), value); return this; }
        /** Sets the specified value to the {@link CGPoint#y} field. */
        public CGPoint.Buffer y(@NativeType("CGFloat") double value) { CGPoint.ny(address(), value); return this; }

    }

}