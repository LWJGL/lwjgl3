/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

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
 * <p>This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values <b>must</b> be in meters.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Df}, {@link XrRect2Df}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrOffset2Df {
 *     float {@link #x};
 *     float {@link #y};
 * }</code></pre>
 */
public class XrOffset2Df extends Struct implements NativeResource {

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
        return wrap(XrOffset2Df.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrOffset2Df} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrOffset2Df calloc() {
        return wrap(XrOffset2Df.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrOffset2Df} instance allocated with {@link BufferUtils}. */
    public static XrOffset2Df create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrOffset2Df.class, memAddress(container), container);
    }

    /** Returns a new {@code XrOffset2Df} instance for the specified memory address. */
    public static XrOffset2Df create(long address) {
        return wrap(XrOffset2Df.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrOffset2Df createSafe(long address) {
        return address == NULL ? null : wrap(XrOffset2Df.class, address);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrOffset2Df.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrOffset2Df.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrOffset2Df} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset2Df malloc(MemoryStack stack) {
        return wrap(XrOffset2Df.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrOffset2Df} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset2Df calloc(MemoryStack stack) {
        return wrap(XrOffset2Df.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset2Df.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset2Df.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + XrOffset2Df.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + XrOffset2Df.Y); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + XrOffset2Df.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + XrOffset2Df.Y, value); }

    // -----------------------------------

    /** An array of {@link XrOffset2Df} structs. */
    public static class Buffer extends StructBuffer<XrOffset2Df, Buffer> implements NativeResource {

        private static final XrOffset2Df ELEMENT_FACTORY = XrOffset2Df.create(-1L);

        /**
         * Creates a new {@code XrOffset2Df.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrOffset2Df#SIZEOF}, and its mark will be undefined.
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