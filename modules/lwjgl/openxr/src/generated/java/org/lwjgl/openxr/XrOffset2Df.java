/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Float offset in two dimensions.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used for component values that may be real numbers, represented with single-precision floating point. For representing offsets in discrete values, such as texels, the integer variant {@link XrOffset2Di} is used instead.</p>
 * 
 * <p>If used to represent physical distances, values <b>must</b> be in meters.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Df}, {@link XrRect2Df}, {@link XrSceneMarkerMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrOffset2Df {
 *     float {@link #x};
 *     float {@link #y};
 * }</code></pre>
 */
public class XrOffset2Df extends Struct<XrOffset2Df> implements NativeResource {

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

    protected XrOffset2Df(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrOffset2Df create(long address, @Nullable ByteBuffer container) {
        return new XrOffset2Df(address, container);
    }

    /**
     * Creates a {@code XrOffset2Df} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrOffset2Df(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the floating-point offset in the x direction. */
    public float x() { return nx(address()); }
    /** the floating-point offset in the y direction. */
    public float y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public XrOffset2Df x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XrOffset2Df y(float value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrOffset2Df set(
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
    public XrOffset2Df set(XrOffset2Df src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrOffset2Df} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrOffset2Df malloc() {
        return new XrOffset2Df(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrOffset2Df} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrOffset2Df calloc() {
        return new XrOffset2Df(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrOffset2Df} instance allocated with {@link BufferUtils}. */
    public static XrOffset2Df create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrOffset2Df(memAddress(container), container);
    }

    /** Returns a new {@code XrOffset2Df} instance for the specified memory address. */
    public static XrOffset2Df create(long address) {
        return new XrOffset2Df(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrOffset2Df createSafe(long address) {
        return address == NULL ? null : new XrOffset2Df(address, null);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrOffset2Df.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrOffset2Df.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrOffset2Df} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset2Df malloc(MemoryStack stack) {
        return new XrOffset2Df(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrOffset2Df} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset2Df calloc(MemoryStack stack) {
        return new XrOffset2Df(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + XrOffset2Df.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + XrOffset2Df.Y); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + XrOffset2Df.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + XrOffset2Df.Y, value); }

    // -----------------------------------

    /** An array of {@link XrOffset2Df} structs. */
    public static class Buffer extends StructBuffer<XrOffset2Df, Buffer> implements NativeResource {

        private static final XrOffset2Df ELEMENT_FACTORY = XrOffset2Df.create(-1L);

        /**
         * Creates a new {@code XrOffset2Df.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrOffset2Df#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrOffset2Df getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrOffset2Df#x} field. */
        public float x() { return XrOffset2Df.nx(address()); }
        /** @return the value of the {@link XrOffset2Df#y} field. */
        public float y() { return XrOffset2Df.ny(address()); }

        /** Sets the specified value to the {@link XrOffset2Df#x} field. */
        public XrOffset2Df.Buffer x(float value) { XrOffset2Df.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XrOffset2Df#y} field. */
        public XrOffset2Df.Buffer y(float value) { XrOffset2Df.ny(address(), value); return this; }

    }

}