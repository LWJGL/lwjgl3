/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A 2D vector with float components.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrVector2f {
 *     float {@link #x};
 *     float {@link #y};
 * }</code></pre>
 */
@NativeType("struct ovrVector2f")
public class OVRVector2f extends Struct<OVRVector2f> implements NativeResource {

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

    protected OVRVector2f(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRVector2f create(long address, @Nullable ByteBuffer container) {
        return new OVRVector2f(address, container);
    }

    /**
     * Creates a {@code OVRVector2f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRVector2f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the vector x component */
    public float x() { return nx(address()); }
    /** the vector y component */
    public float y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public OVRVector2f x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public OVRVector2f y(float value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRVector2f set(
        float x,
        float y
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
    public OVRVector2f set(OVRVector2f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRVector2f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRVector2f malloc() {
        return new OVRVector2f(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRVector2f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRVector2f calloc() {
        return new OVRVector2f(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRVector2f} instance allocated with {@link BufferUtils}. */
    public static OVRVector2f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRVector2f(memAddress(container), container);
    }

    /** Returns a new {@code OVRVector2f} instance for the specified memory address. */
    public static OVRVector2f create(long address) {
        return new OVRVector2f(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRVector2f createSafe(long address) {
        return address == NULL ? null : new OVRVector2f(address, null);
    }

    /**
     * Returns a new {@link OVRVector2f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector2f.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRVector2f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector2f.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRVector2f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector2f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRVector2f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRVector2f.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRVector2f.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRVector2f mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRVector2f callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRVector2f mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRVector2f callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRVector2f.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRVector2f.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRVector2f.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRVector2f.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRVector2f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRVector2f malloc(MemoryStack stack) {
        return new OVRVector2f(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRVector2f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRVector2f calloc(MemoryStack stack) {
        return new OVRVector2f(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRVector2f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRVector2f.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRVector2f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRVector2f.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + OVRVector2f.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + OVRVector2f.Y); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + OVRVector2f.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + OVRVector2f.Y, value); }

    // -----------------------------------

    /** An array of {@link OVRVector2f} structs. */
    public static class Buffer extends StructBuffer<OVRVector2f, Buffer> implements NativeResource {

        private static final OVRVector2f ELEMENT_FACTORY = OVRVector2f.create(-1L);

        /**
         * Creates a new {@code OVRVector2f.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRVector2f#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected OVRVector2f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRVector2f#x} field. */
        public float x() { return OVRVector2f.nx(address()); }
        /** @return the value of the {@link OVRVector2f#y} field. */
        public float y() { return OVRVector2f.ny(address()); }

        /** Sets the specified value to the {@link OVRVector2f#x} field. */
        public OVRVector2f.Buffer x(float value) { OVRVector2f.nx(address(), value); return this; }
        /** Sets the specified value to the {@link OVRVector2f#y} field. */
        public OVRVector2f.Buffer y(float value) { OVRVector2f.ny(address(), value); return this; }

    }

}