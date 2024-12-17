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
 * struct XrRect2Di {
 *     {@link XrOffset2Di XrOffset2Di} offset;
 *     {@link XrExtent2Di XrExtent2Di} extent;
 * }}</pre>
 */
public class XrRect2Di extends Struct<XrRect2Di> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(XrOffset2Di.SIZEOF, XrOffset2Di.ALIGNOF),
            __member(XrExtent2Di.SIZEOF, XrExtent2Di.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
    }

    protected XrRect2Di(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRect2Di create(long address, @Nullable ByteBuffer container) {
        return new XrRect2Di(address, container);
    }

    /**
     * Creates a {@code XrRect2Di} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRect2Di(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrOffset2Di} view of the {@code offset} field. */
    public XrOffset2Di offset() { return noffset(address()); }
    /** @return a {@link XrExtent2Di} view of the {@code extent} field. */
    public XrExtent2Di extent() { return nextent(address()); }

    /** Copies the specified {@link XrOffset2Di} to the {@code offset} field. */
    public XrRect2Di offset(XrOffset2Di value) { noffset(address(), value); return this; }
    /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRect2Di offset(java.util.function.Consumer<XrOffset2Di> consumer) { consumer.accept(offset()); return this; }
    /** Copies the specified {@link XrExtent2Di} to the {@code extent} field. */
    public XrRect2Di extent(XrExtent2Di value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRect2Di extent(java.util.function.Consumer<XrExtent2Di> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public XrRect2Di set(
        XrOffset2Di offset,
        XrExtent2Di extent
    ) {
        offset(offset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRect2Di set(XrRect2Di src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRect2Di} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRect2Di malloc() {
        return new XrRect2Di(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRect2Di} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRect2Di calloc() {
        return new XrRect2Di(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRect2Di} instance allocated with {@link BufferUtils}. */
    public static XrRect2Di create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRect2Di(memAddress(container), container);
    }

    /** Returns a new {@code XrRect2Di} instance for the specified memory address. */
    public static XrRect2Di create(long address) {
        return new XrRect2Di(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRect2Di createSafe(long address) {
        return address == NULL ? null : new XrRect2Di(address, null);
    }

    /**
     * Returns a new {@link XrRect2Di.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect2Di.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRect2Di.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect2Di.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRect2Di.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect2Di.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRect2Di.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRect2Di.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRect2Di.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRect2Di} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRect2Di malloc(MemoryStack stack) {
        return new XrRect2Di(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRect2Di} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRect2Di calloc(MemoryStack stack) {
        return new XrRect2Di(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRect2Di.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRect2Di.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRect2Di.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRect2Di.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static XrOffset2Di noffset(long struct) { return XrOffset2Di.create(struct + XrRect2Di.OFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static XrExtent2Di nextent(long struct) { return XrExtent2Di.create(struct + XrRect2Di.EXTENT); }

    /** Unsafe version of {@link #offset(XrOffset2Di) offset}. */
    public static void noffset(long struct, XrOffset2Di value) { memCopy(value.address(), struct + XrRect2Di.OFFSET, XrOffset2Di.SIZEOF); }
    /** Unsafe version of {@link #extent(XrExtent2Di) extent}. */
    public static void nextent(long struct, XrExtent2Di value) { memCopy(value.address(), struct + XrRect2Di.EXTENT, XrExtent2Di.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrRect2Di} structs. */
    public static class Buffer extends StructBuffer<XrRect2Di, Buffer> implements NativeResource {

        private static final XrRect2Di ELEMENT_FACTORY = XrRect2Di.create(-1L);

        /**
         * Creates a new {@code XrRect2Di.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRect2Di#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRect2Di getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrOffset2Di} view of the {@code offset} field. */
        public XrOffset2Di offset() { return XrRect2Di.noffset(address()); }
        /** @return a {@link XrExtent2Di} view of the {@code extent} field. */
        public XrExtent2Di extent() { return XrRect2Di.nextent(address()); }

        /** Copies the specified {@link XrOffset2Di} to the {@code offset} field. */
        public XrRect2Di.Buffer offset(XrOffset2Di value) { XrRect2Di.noffset(address(), value); return this; }
        /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRect2Di.Buffer offset(java.util.function.Consumer<XrOffset2Di> consumer) { consumer.accept(offset()); return this; }
        /** Copies the specified {@link XrExtent2Di} to the {@code extent} field. */
        public XrRect2Di.Buffer extent(XrExtent2Di value) { XrRect2Di.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRect2Di.Buffer extent(java.util.function.Consumer<XrExtent2Di> consumer) { consumer.accept(extent()); return this; }

    }

}