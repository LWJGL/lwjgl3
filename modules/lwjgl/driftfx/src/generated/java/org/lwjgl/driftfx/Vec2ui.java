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
 * struct driftfx::math::Vec2ui {
 *     unsigned int x;
 *     unsigned int y;
 * }</code></pre>
 */
@NativeType("struct driftfx::math::Vec2ui")
public class Vec2ui extends Struct implements NativeResource {

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
     * Creates a {@code Vec2ui} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Vec2ui(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    @NativeType("unsigned int")
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("unsigned int")
    public int y() { return ny(address()); }

    /** Sets the specified value to the {@code x} field. */
    public Vec2ui x(@NativeType("unsigned int") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public Vec2ui y(@NativeType("unsigned int") int value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Vec2ui set(
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
    public Vec2ui set(Vec2ui src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Vec2ui} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Vec2ui malloc() {
        return wrap(Vec2ui.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code Vec2ui} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Vec2ui calloc() {
        return wrap(Vec2ui.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code Vec2ui} instance allocated with {@link BufferUtils}. */
    public static Vec2ui create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(Vec2ui.class, memAddress(container), container);
    }

    /** Returns a new {@code Vec2ui} instance for the specified memory address. */
    public static Vec2ui create(long address) {
        return wrap(Vec2ui.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Vec2ui createSafe(long address) {
        return address == NULL ? null : wrap(Vec2ui.class, address);
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Vec2ui.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Vec2ui.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code Vec2ui} instance allocated on the thread-local {@link MemoryStack}. */
    public static Vec2ui mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code Vec2ui} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static Vec2ui callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code Vec2ui} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Vec2ui mallocStack(MemoryStack stack) {
        return wrap(Vec2ui.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code Vec2ui} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Vec2ui callocStack(MemoryStack stack) {
        return wrap(Vec2ui.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Vec2ui.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Vec2ui.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + Vec2ui.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + Vec2ui.Y); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + Vec2ui.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + Vec2ui.Y, value); }

    // -----------------------------------

    /** An array of {@link Vec2ui} structs. */
    public static class Buffer extends StructBuffer<Vec2ui, Buffer> implements NativeResource {

        private static final Vec2ui ELEMENT_FACTORY = Vec2ui.create(-1L);

        /**
         * Creates a new {@code Vec2ui.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Vec2ui#SIZEOF}, and its mark will be undefined.
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
        protected Vec2ui getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        @NativeType("unsigned int")
        public int x() { return Vec2ui.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("unsigned int")
        public int y() { return Vec2ui.ny(address()); }

        /** Sets the specified value to the {@code x} field. */
        public Vec2ui.Buffer x(@NativeType("unsigned int") int value) { Vec2ui.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public Vec2ui.Buffer y(@NativeType("unsigned int") int value) { Vec2ui.ny(address(), value); return this; }

    }

}