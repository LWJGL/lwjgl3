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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CGSize {
 *     CGFloat width;
 *     CGFloat height;
 * }</code></pre>
 */
public class CGSize extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
    }

    /**
     * Creates a {@code CGSize} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CGSize(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code width} field. */
    @NativeType("CGFloat")
    public double width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("CGFloat")
    public double height() { return nheight(address()); }

    /** Sets the specified value to the {@code width} field. */
    public CGSize width(@NativeType("CGFloat") double value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public CGSize height(@NativeType("CGFloat") double value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CGSize set(
        double width,
        double height
    ) {
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CGSize set(CGSize src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CGSize} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CGSize malloc() {
        return wrap(CGSize.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CGSize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CGSize calloc() {
        return wrap(CGSize.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CGSize} instance allocated with {@link BufferUtils}. */
    public static CGSize create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CGSize.class, memAddress(container), container);
    }

    /** Returns a new {@code CGSize} instance for the specified memory address. */
    public static CGSize create(long address) {
        return wrap(CGSize.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGSize createSafe(long address) {
        return address == NULL ? null : wrap(CGSize.class, address);
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CGSize.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CGSize.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CGSize} instance allocated on the thread-local {@link MemoryStack}. */
    public static CGSize mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CGSize} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CGSize callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CGSize} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CGSize mallocStack(MemoryStack stack) {
        return wrap(CGSize.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CGSize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CGSize callocStack(MemoryStack stack) {
        return wrap(CGSize.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CGSize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CGSize.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static double nwidth(long struct) { return UNSAFE.getDouble(null, struct + CGSize.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static double nheight(long struct) { return UNSAFE.getDouble(null, struct + CGSize.HEIGHT); }

    /** Unsafe version of {@link #width(double) width}. */
    public static void nwidth(long struct, double value) { UNSAFE.putDouble(null, struct + CGSize.WIDTH, value); }
    /** Unsafe version of {@link #height(double) height}. */
    public static void nheight(long struct, double value) { UNSAFE.putDouble(null, struct + CGSize.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link CGSize} structs. */
    public static class Buffer extends StructBuffer<CGSize, Buffer> implements NativeResource {

        private static final CGSize ELEMENT_FACTORY = CGSize.create(-1L);

        /**
         * Creates a new {@code CGSize.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CGSize#SIZEOF}, and its mark will be undefined.
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
        protected CGSize getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code width} field. */
        @NativeType("CGFloat")
        public double width() { return CGSize.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        @NativeType("CGFloat")
        public double height() { return CGSize.nheight(address()); }

        /** Sets the specified value to the {@code width} field. */
        public CGSize.Buffer width(@NativeType("CGFloat") double value) { CGSize.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public CGSize.Buffer height(@NativeType("CGFloat") double value) { CGSize.nheight(address(), value); return this; }

    }

}