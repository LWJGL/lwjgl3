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
 * <pre>{@code
 * struct XrSpatialBounded2DDataEXT {
 *     {@link XrPosef XrPosef} center;
 *     {@link XrExtent2Df XrExtent2Df} extents;
 * }}</pre>
 */
public class XrSpatialBounded2DDataEXT extends Struct<XrSpatialBounded2DDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CENTER,
        EXTENTS;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CENTER = layout.offsetof(0);
        EXTENTS = layout.offsetof(1);
    }

    protected XrSpatialBounded2DDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialBounded2DDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialBounded2DDataEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialBounded2DDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialBounded2DDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrPosef} view of the {@code center} field. */
    public XrPosef center() { return ncenter(address()); }
    /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
    public XrExtent2Df extents() { return nextents(address()); }

    /** Copies the specified {@link XrPosef} to the {@code center} field. */
    public XrSpatialBounded2DDataEXT center(XrPosef value) { ncenter(address(), value); return this; }
    /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialBounded2DDataEXT center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
    public XrSpatialBounded2DDataEXT extents(XrExtent2Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialBounded2DDataEXT extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialBounded2DDataEXT set(
        XrPosef center,
        XrExtent2Df extents
    ) {
        center(center);
        extents(extents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialBounded2DDataEXT set(XrSpatialBounded2DDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialBounded2DDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialBounded2DDataEXT malloc() {
        return new XrSpatialBounded2DDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBounded2DDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialBounded2DDataEXT calloc() {
        return new XrSpatialBounded2DDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBounded2DDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialBounded2DDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialBounded2DDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialBounded2DDataEXT} instance for the specified memory address. */
    public static XrSpatialBounded2DDataEXT create(long address) {
        return new XrSpatialBounded2DDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialBounded2DDataEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialBounded2DDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialBounded2DDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBounded2DDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBounded2DDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBounded2DDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBounded2DDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBounded2DDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialBounded2DDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialBounded2DDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialBounded2DDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialBounded2DDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBounded2DDataEXT malloc(MemoryStack stack) {
        return new XrSpatialBounded2DDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialBounded2DDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBounded2DDataEXT calloc(MemoryStack stack) {
        return new XrSpatialBounded2DDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialBounded2DDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBounded2DDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBounded2DDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBounded2DDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #center}. */
    public static XrPosef ncenter(long struct) { return XrPosef.create(struct + XrSpatialBounded2DDataEXT.CENTER); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent2Df nextents(long struct) { return XrExtent2Df.create(struct + XrSpatialBounded2DDataEXT.EXTENTS); }

    /** Unsafe version of {@link #center(XrPosef) center}. */
    public static void ncenter(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialBounded2DDataEXT.CENTER, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent2Df) extents}. */
    public static void nextents(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrSpatialBounded2DDataEXT.EXTENTS, XrExtent2Df.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialBounded2DDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialBounded2DDataEXT, Buffer> implements NativeResource {

        private static final XrSpatialBounded2DDataEXT ELEMENT_FACTORY = XrSpatialBounded2DDataEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialBounded2DDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialBounded2DDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialBounded2DDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@code center} field. */
        public XrPosef center() { return XrSpatialBounded2DDataEXT.ncenter(address()); }
        /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
        public XrExtent2Df extents() { return XrSpatialBounded2DDataEXT.nextents(address()); }

        /** Copies the specified {@link XrPosef} to the {@code center} field. */
        public XrSpatialBounded2DDataEXT.Buffer center(XrPosef value) { XrSpatialBounded2DDataEXT.ncenter(address(), value); return this; }
        /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialBounded2DDataEXT.Buffer center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
        public XrSpatialBounded2DDataEXT.Buffer extents(XrExtent2Df value) { XrSpatialBounded2DDataEXT.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialBounded2DDataEXT.Buffer extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }

    }

}