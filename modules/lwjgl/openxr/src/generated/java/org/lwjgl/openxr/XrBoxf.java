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
 * struct XrBoxf {
 *     {@link XrPosef XrPosef} center;
 *     {@link XrExtent3Df XrExtent3Df} extents;
 * }}</pre>
 */
public class XrBoxf extends Struct<XrBoxf> implements NativeResource {

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
            __member(XrExtent3Df.SIZEOF, XrExtent3Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CENTER = layout.offsetof(0);
        EXTENTS = layout.offsetof(1);
    }

    protected XrBoxf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBoxf create(long address, @Nullable ByteBuffer container) {
        return new XrBoxf(address, container);
    }

    /**
     * Creates a {@code XrBoxf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBoxf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrPosef} view of the {@code center} field. */
    public XrPosef center() { return ncenter(address()); }
    /** @return a {@link XrExtent3Df} view of the {@code extents} field. */
    public XrExtent3Df extents() { return nextents(address()); }

    /** Copies the specified {@link XrPosef} to the {@code center} field. */
    public XrBoxf center(XrPosef value) { ncenter(address(), value); return this; }
    /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBoxf center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
    /** Copies the specified {@link XrExtent3Df} to the {@code extents} field. */
    public XrBoxf extents(XrExtent3Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBoxf extents(java.util.function.Consumer<XrExtent3Df> consumer) { consumer.accept(extents()); return this; }

    /** Initializes this struct with the specified values. */
    public XrBoxf set(
        XrPosef center,
        XrExtent3Df extents
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
    public XrBoxf set(XrBoxf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBoxf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBoxf malloc() {
        return new XrBoxf(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBoxf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBoxf calloc() {
        return new XrBoxf(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBoxf} instance allocated with {@link BufferUtils}. */
    public static XrBoxf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBoxf(memAddress(container), container);
    }

    /** Returns a new {@code XrBoxf} instance for the specified memory address. */
    public static XrBoxf create(long address) {
        return new XrBoxf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBoxf createSafe(long address) {
        return address == NULL ? null : new XrBoxf(address, null);
    }

    /**
     * Returns a new {@link XrBoxf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoxf.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBoxf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoxf.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBoxf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoxf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBoxf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBoxf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBoxf.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBoxf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBoxf malloc(MemoryStack stack) {
        return new XrBoxf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBoxf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBoxf calloc(MemoryStack stack) {
        return new XrBoxf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBoxf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBoxf.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBoxf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBoxf.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #center}. */
    public static XrPosef ncenter(long struct) { return XrPosef.create(struct + XrBoxf.CENTER); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent3Df nextents(long struct) { return XrExtent3Df.create(struct + XrBoxf.EXTENTS); }

    /** Unsafe version of {@link #center(XrPosef) center}. */
    public static void ncenter(long struct, XrPosef value) { memCopy(value.address(), struct + XrBoxf.CENTER, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent3Df) extents}. */
    public static void nextents(long struct, XrExtent3Df value) { memCopy(value.address(), struct + XrBoxf.EXTENTS, XrExtent3Df.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrBoxf} structs. */
    public static class Buffer extends StructBuffer<XrBoxf, Buffer> implements NativeResource {

        private static final XrBoxf ELEMENT_FACTORY = XrBoxf.create(-1L);

        /**
         * Creates a new {@code XrBoxf.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBoxf#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBoxf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@code center} field. */
        public XrPosef center() { return XrBoxf.ncenter(address()); }
        /** @return a {@link XrExtent3Df} view of the {@code extents} field. */
        public XrExtent3Df extents() { return XrBoxf.nextents(address()); }

        /** Copies the specified {@link XrPosef} to the {@code center} field. */
        public XrBoxf.Buffer center(XrPosef value) { XrBoxf.ncenter(address(), value); return this; }
        /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBoxf.Buffer center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
        /** Copies the specified {@link XrExtent3Df} to the {@code extents} field. */
        public XrBoxf.Buffer extents(XrExtent3Df value) { XrBoxf.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBoxf.Buffer extents(java.util.function.Consumer<XrExtent3Df> consumer) { consumer.accept(extents()); return this; }

    }

}