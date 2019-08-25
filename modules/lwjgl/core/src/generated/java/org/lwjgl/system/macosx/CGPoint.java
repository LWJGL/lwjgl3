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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the x-coordinate of the point</li>
 * <li>{@code y} &ndash; the y-coordinate of the point</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CGPoint {
 *     CGFloat x;
 *     CGFloat y;
 * }</code></pre>
 */
public class CGPoint extends Struct implements NativeResource {

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

    /** Returns the value of the {@code x} field. */
    @NativeType("CGFloat")
    public double x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("CGFloat")
    public double y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public CGPoint x(@NativeType("CGFloat") double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
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
        return wrap(CGPoint.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CGPoint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CGPoint calloc() {
        return wrap(CGPoint.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CGPoint} instance allocated with {@link BufferUtils}. */
    public static CGPoint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CGPoint.class, memAddress(container), container);
    }

    /** Returns a new {@code CGPoint} instance for the specified memory address. */
    public static CGPoint create(long address) {
        return wrap(CGPoint.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGPoint createSafe(long address) {
        return address == NULL ? null : wrap(CGPoint.class, address);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CGPoint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGPoint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CGPoint} instance allocated on the thread-local {@link MemoryStack}. */
    public static CGPoint mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CGPoint} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CGPoint callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CGPoint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CGPoint mallocStack(MemoryStack stack) {
        return wrap(CGPoint.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CGPoint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CGPoint callocStack(MemoryStack stack) {
        return wrap(CGPoint.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGPoint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGPoint.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CGPoint#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code x} field. */
        @NativeType("CGFloat")
        public double x() { return CGPoint.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("CGFloat")
        public double y() { return CGPoint.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public CGPoint.Buffer x(@NativeType("CGFloat") double value) { CGPoint.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public CGPoint.Buffer y(@NativeType("CGFloat") double value) { CGPoint.ny(address(), value); return this; }

    }

}