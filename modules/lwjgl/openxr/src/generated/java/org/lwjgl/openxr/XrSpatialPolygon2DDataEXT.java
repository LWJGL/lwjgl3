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
 * <pre><code>
 * struct XrSpatialPolygon2DDataEXT {
 *     {@link XrPosef XrPosef} origin;
 *     {@link XrSpatialBufferEXT XrSpatialBufferEXT} vertexBuffer;
 * }</code></pre>
 */
public class XrSpatialPolygon2DDataEXT extends Struct<XrSpatialPolygon2DDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIGIN,
        VERTEXBUFFER;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrSpatialBufferEXT.SIZEOF, XrSpatialBufferEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIGIN = layout.offsetof(0);
        VERTEXBUFFER = layout.offsetof(1);
    }

    protected XrSpatialPolygon2DDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialPolygon2DDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialPolygon2DDataEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialPolygon2DDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialPolygon2DDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrPosef} view of the {@code origin} field. */
    public XrPosef origin() { return norigin(address()); }
    /** @return a {@link XrSpatialBufferEXT} view of the {@code vertexBuffer} field. */
    public XrSpatialBufferEXT vertexBuffer() { return nvertexBuffer(address()); }

    /** Copies the specified {@link XrPosef} to the {@code origin} field. */
    public XrSpatialPolygon2DDataEXT origin(XrPosef value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialPolygon2DDataEXT origin(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(origin()); return this; }
    /** Copies the specified {@link XrSpatialBufferEXT} to the {@code vertexBuffer} field. */
    public XrSpatialPolygon2DDataEXT vertexBuffer(XrSpatialBufferEXT value) { nvertexBuffer(address(), value); return this; }
    /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialPolygon2DDataEXT vertexBuffer(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(vertexBuffer()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialPolygon2DDataEXT set(
        XrPosef origin,
        XrSpatialBufferEXT vertexBuffer
    ) {
        origin(origin);
        vertexBuffer(vertexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialPolygon2DDataEXT set(XrSpatialPolygon2DDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialPolygon2DDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialPolygon2DDataEXT malloc() {
        return new XrSpatialPolygon2DDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialPolygon2DDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialPolygon2DDataEXT calloc() {
        return new XrSpatialPolygon2DDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialPolygon2DDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialPolygon2DDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialPolygon2DDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialPolygon2DDataEXT} instance for the specified memory address. */
    public static XrSpatialPolygon2DDataEXT create(long address) {
        return new XrSpatialPolygon2DDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialPolygon2DDataEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialPolygon2DDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialPolygon2DDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPolygon2DDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPolygon2DDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPolygon2DDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPolygon2DDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPolygon2DDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialPolygon2DDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialPolygon2DDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialPolygon2DDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialPolygon2DDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialPolygon2DDataEXT malloc(MemoryStack stack) {
        return new XrSpatialPolygon2DDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialPolygon2DDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialPolygon2DDataEXT calloc(MemoryStack stack) {
        return new XrSpatialPolygon2DDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialPolygon2DDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialPolygon2DDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPolygon2DDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialPolygon2DDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #origin}. */
    public static XrPosef norigin(long struct) { return XrPosef.create(struct + XrSpatialPolygon2DDataEXT.ORIGIN); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static XrSpatialBufferEXT nvertexBuffer(long struct) { return XrSpatialBufferEXT.create(struct + XrSpatialPolygon2DDataEXT.VERTEXBUFFER); }

    /** Unsafe version of {@link #origin(XrPosef) origin}. */
    public static void norigin(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialPolygon2DDataEXT.ORIGIN, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #vertexBuffer(XrSpatialBufferEXT) vertexBuffer}. */
    public static void nvertexBuffer(long struct, XrSpatialBufferEXT value) { memCopy(value.address(), struct + XrSpatialPolygon2DDataEXT.VERTEXBUFFER, XrSpatialBufferEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialPolygon2DDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialPolygon2DDataEXT, Buffer> implements NativeResource {

        private static final XrSpatialPolygon2DDataEXT ELEMENT_FACTORY = XrSpatialPolygon2DDataEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialPolygon2DDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialPolygon2DDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialPolygon2DDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@code origin} field. */
        public XrPosef origin() { return XrSpatialPolygon2DDataEXT.norigin(address()); }
        /** @return a {@link XrSpatialBufferEXT} view of the {@code vertexBuffer} field. */
        public XrSpatialBufferEXT vertexBuffer() { return XrSpatialPolygon2DDataEXT.nvertexBuffer(address()); }

        /** Copies the specified {@link XrPosef} to the {@code origin} field. */
        public XrSpatialPolygon2DDataEXT.Buffer origin(XrPosef value) { XrSpatialPolygon2DDataEXT.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialPolygon2DDataEXT.Buffer origin(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(origin()); return this; }
        /** Copies the specified {@link XrSpatialBufferEXT} to the {@code vertexBuffer} field. */
        public XrSpatialPolygon2DDataEXT.Buffer vertexBuffer(XrSpatialBufferEXT value) { XrSpatialPolygon2DDataEXT.nvertexBuffer(address(), value); return this; }
        /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialPolygon2DDataEXT.Buffer vertexBuffer(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(vertexBuffer()); return this; }

    }

}