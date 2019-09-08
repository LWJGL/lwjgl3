/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.driftfx;

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
 * struct driftfx::math::Vec2d {
 *     double x;
 *     double y;
 * }</code></pre>
 */
@NativeType("struct driftfx::math::Vec2d")
public class Vec2d extends Struct implements NativeResource {

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
     * Creates a {@code Vec2d} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Vec2d(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public double x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public double y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public Vec2d x(double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public Vec2d y(double value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Vec2d set(
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
    public Vec2d set(Vec2d src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Vec2d} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Vec2d malloc() {
        return wrap(Vec2d.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code Vec2d} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Vec2d calloc() {
        return wrap(Vec2d.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code Vec2d} instance allocated with {@link BufferUtils}. */
    public static Vec2d create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(Vec2d.class, memAddress(container), container);
    }

    /** Returns a new {@code Vec2d} instance for the specified memory address. */
    public static Vec2d create(long address) {
        return wrap(Vec2d.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Vec2d createSafe(long address) {
        return address == NULL ? null : wrap(Vec2d.class, address);
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Vec2d.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Vec2d.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code Vec2d} instance allocated on the thread-local {@link MemoryStack}. */
    public static Vec2d mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code Vec2d} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static Vec2d callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code Vec2d} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Vec2d mallocStack(MemoryStack stack) {
        return wrap(Vec2d.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code Vec2d} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Vec2d callocStack(MemoryStack stack) {
        return wrap(Vec2d.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Vec2d.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Vec2d.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static double nx(long struct) { return UNSAFE.getDouble(null, struct + Vec2d.X); }
    /** Unsafe version of {@link #y}. */
    public static double ny(long struct) { return UNSAFE.getDouble(null, struct + Vec2d.Y); }

    /** Unsafe version of {@link #x(double) x}. */
    public static void nx(long struct, double value) { UNSAFE.putDouble(null, struct + Vec2d.X, value); }
    /** Unsafe version of {@link #y(double) y}. */
    public static void ny(long struct, double value) { UNSAFE.putDouble(null, struct + Vec2d.Y, value); }

    // -----------------------------------

    /** An array of {@link Vec2d} structs. */
    public static class Buffer extends StructBuffer<Vec2d, Buffer> implements NativeResource {

        private static final Vec2d ELEMENT_FACTORY = Vec2d.create(-1L);

        /**
         * Creates a new {@code Vec2d.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Vec2d#SIZEOF}, and its mark will be undefined.
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
        protected Vec2d getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        public double x() { return Vec2d.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public double y() { return Vec2d.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public Vec2d.Buffer x(double value) { Vec2d.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public Vec2d.Buffer y(double value) { Vec2d.ny(address(), value); return this; }

    }

}