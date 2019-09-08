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
 * struct driftfx::math::Vec2i {
 *     int x;
 *     int y;
 * }</code></pre>
 */
@NativeType("struct driftfx::math::Vec2i")
public class Vec2i extends Struct implements NativeResource {

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
     * Creates a {@code Vec2i} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Vec2i(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public int y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public Vec2i x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public Vec2i y(int value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Vec2i set(
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
    public Vec2i set(Vec2i src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Vec2i} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Vec2i malloc() {
        return wrap(Vec2i.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code Vec2i} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Vec2i calloc() {
        return wrap(Vec2i.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code Vec2i} instance allocated with {@link BufferUtils}. */
    public static Vec2i create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(Vec2i.class, memAddress(container), container);
    }

    /** Returns a new {@code Vec2i} instance for the specified memory address. */
    public static Vec2i create(long address) {
        return wrap(Vec2i.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Vec2i createSafe(long address) {
        return address == NULL ? null : wrap(Vec2i.class, address);
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Vec2i.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Vec2i.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code Vec2i} instance allocated on the thread-local {@link MemoryStack}. */
    public static Vec2i mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code Vec2i} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static Vec2i callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code Vec2i} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Vec2i mallocStack(MemoryStack stack) {
        return wrap(Vec2i.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code Vec2i} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Vec2i callocStack(MemoryStack stack) {
        return wrap(Vec2i.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Vec2i.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Vec2i.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + Vec2i.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + Vec2i.Y); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + Vec2i.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + Vec2i.Y, value); }

    // -----------------------------------

    /** An array of {@link Vec2i} structs. */
    public static class Buffer extends StructBuffer<Vec2i, Buffer> implements NativeResource {

        private static final Vec2i ELEMENT_FACTORY = Vec2i.create(-1L);

        /**
         * Creates a new {@code Vec2i.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Vec2i#SIZEOF}, and its mark will be undefined.
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
        protected Vec2i getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        public int x() { return Vec2i.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return Vec2i.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public Vec2i.Buffer x(int value) { Vec2i.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public Vec2i.Buffer y(int value) { Vec2i.ny(address(), value); return this; }

    }

}