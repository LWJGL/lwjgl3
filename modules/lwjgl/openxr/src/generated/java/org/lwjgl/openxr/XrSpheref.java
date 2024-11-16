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
 * Describe a sphere bounds.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code radius} is not a finite positive value.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpheref {
 *     {@link XrPosef XrPosef} {@link #center};
 *     float {@link #radius};
 * }</code></pre>
 */
public class XrSpheref extends Struct<XrSpheref> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CENTER,
        RADIUS;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CENTER = layout.offsetof(0);
        RADIUS = layout.offsetof(1);
    }

    protected XrSpheref(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpheref create(long address, @Nullable ByteBuffer container) {
        return new XrSpheref(address, container);
    }

    /**
     * Creates a {@code XrSpheref} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpheref(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrPosef} representing the pose of the center of the sphere within the reference frame of the corresponding {@code XrSpace}. */
    public XrPosef center() { return ncenter(address()); }
    /** the finite non-negative radius of the sphere. */
    public float radius() { return nradius(address()); }

    /** Copies the specified {@link XrPosef} to the {@link #center} field. */
    public XrSpheref center(XrPosef value) { ncenter(address(), value); return this; }
    /** Passes the {@link #center} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpheref center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
    /** Sets the specified value to the {@link #radius} field. */
    public XrSpheref radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpheref set(
        XrPosef center,
        float radius
    ) {
        center(center);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpheref set(XrSpheref src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpheref} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpheref malloc() {
        return new XrSpheref(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpheref} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpheref calloc() {
        return new XrSpheref(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpheref} instance allocated with {@link BufferUtils}. */
    public static XrSpheref create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpheref(memAddress(container), container);
    }

    /** Returns a new {@code XrSpheref} instance for the specified memory address. */
    public static XrSpheref create(long address) {
        return new XrSpheref(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpheref createSafe(long address) {
        return address == NULL ? null : new XrSpheref(address, null);
    }

    /**
     * Returns a new {@link XrSpheref.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpheref.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpheref.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpheref.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpheref.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpheref.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpheref.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpheref.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpheref.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpheref} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpheref malloc(MemoryStack stack) {
        return new XrSpheref(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpheref} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpheref calloc(MemoryStack stack) {
        return new XrSpheref(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpheref.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpheref.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpheref.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpheref.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #center}. */
    public static XrPosef ncenter(long struct) { return XrPosef.create(struct + XrSpheref.CENTER); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return memGetFloat(struct + XrSpheref.RADIUS); }

    /** Unsafe version of {@link #center(XrPosef) center}. */
    public static void ncenter(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpheref.CENTER, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { memPutFloat(struct + XrSpheref.RADIUS, value); }

    // -----------------------------------

    /** An array of {@link XrSpheref} structs. */
    public static class Buffer extends StructBuffer<XrSpheref, Buffer> implements NativeResource {

        private static final XrSpheref ELEMENT_FACTORY = XrSpheref.create(-1L);

        /**
         * Creates a new {@code XrSpheref.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpheref#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpheref getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@link XrSpheref#center} field. */
        public XrPosef center() { return XrSpheref.ncenter(address()); }
        /** @return the value of the {@link XrSpheref#radius} field. */
        public float radius() { return XrSpheref.nradius(address()); }

        /** Copies the specified {@link XrPosef} to the {@link XrSpheref#center} field. */
        public XrSpheref.Buffer center(XrPosef value) { XrSpheref.ncenter(address(), value); return this; }
        /** Passes the {@link XrSpheref#center} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpheref.Buffer center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
        /** Sets the specified value to the {@link XrSpheref#radius} field. */
        public XrSpheref.Buffer radius(float value) { XrSpheref.nradius(address(), value); return this; }

    }

}