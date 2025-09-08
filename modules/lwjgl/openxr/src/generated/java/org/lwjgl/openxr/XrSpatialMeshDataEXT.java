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
 * struct XrSpatialMeshDataEXT {
 *     {@link XrPosef XrPosef} origin;
 *     {@link XrSpatialBufferEXT XrSpatialBufferEXT} vertexBuffer;
 *     {@link XrSpatialBufferEXT XrSpatialBufferEXT} indexBuffer;
 * }</code></pre>
 */
public class XrSpatialMeshDataEXT extends Struct<XrSpatialMeshDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIGIN,
        VERTEXBUFFER,
        INDEXBUFFER;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrSpatialBufferEXT.SIZEOF, XrSpatialBufferEXT.ALIGNOF),
            __member(XrSpatialBufferEXT.SIZEOF, XrSpatialBufferEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIGIN = layout.offsetof(0);
        VERTEXBUFFER = layout.offsetof(1);
        INDEXBUFFER = layout.offsetof(2);
    }

    protected XrSpatialMeshDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialMeshDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialMeshDataEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialMeshDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialMeshDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrPosef} view of the {@code origin} field. */
    public XrPosef origin() { return norigin(address()); }
    /** @return a {@link XrSpatialBufferEXT} view of the {@code vertexBuffer} field. */
    public XrSpatialBufferEXT vertexBuffer() { return nvertexBuffer(address()); }
    /** @return a {@link XrSpatialBufferEXT} view of the {@code indexBuffer} field. */
    public XrSpatialBufferEXT indexBuffer() { return nindexBuffer(address()); }

    /** Copies the specified {@link XrPosef} to the {@code origin} field. */
    public XrSpatialMeshDataEXT origin(XrPosef value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialMeshDataEXT origin(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(origin()); return this; }
    /** Copies the specified {@link XrSpatialBufferEXT} to the {@code vertexBuffer} field. */
    public XrSpatialMeshDataEXT vertexBuffer(XrSpatialBufferEXT value) { nvertexBuffer(address(), value); return this; }
    /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialMeshDataEXT vertexBuffer(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(vertexBuffer()); return this; }
    /** Copies the specified {@link XrSpatialBufferEXT} to the {@code indexBuffer} field. */
    public XrSpatialMeshDataEXT indexBuffer(XrSpatialBufferEXT value) { nindexBuffer(address(), value); return this; }
    /** Passes the {@code indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialMeshDataEXT indexBuffer(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(indexBuffer()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialMeshDataEXT set(
        XrPosef origin,
        XrSpatialBufferEXT vertexBuffer,
        XrSpatialBufferEXT indexBuffer
    ) {
        origin(origin);
        vertexBuffer(vertexBuffer);
        indexBuffer(indexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialMeshDataEXT set(XrSpatialMeshDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialMeshDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialMeshDataEXT malloc() {
        return new XrSpatialMeshDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMeshDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialMeshDataEXT calloc() {
        return new XrSpatialMeshDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMeshDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialMeshDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialMeshDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialMeshDataEXT} instance for the specified memory address. */
    public static XrSpatialMeshDataEXT create(long address) {
        return new XrSpatialMeshDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialMeshDataEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialMeshDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialMeshDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMeshDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMeshDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMeshDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMeshDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMeshDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialMeshDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialMeshDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialMeshDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialMeshDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMeshDataEXT malloc(MemoryStack stack) {
        return new XrSpatialMeshDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialMeshDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMeshDataEXT calloc(MemoryStack stack) {
        return new XrSpatialMeshDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialMeshDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMeshDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMeshDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMeshDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #origin}. */
    public static XrPosef norigin(long struct) { return XrPosef.create(struct + XrSpatialMeshDataEXT.ORIGIN); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static XrSpatialBufferEXT nvertexBuffer(long struct) { return XrSpatialBufferEXT.create(struct + XrSpatialMeshDataEXT.VERTEXBUFFER); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static XrSpatialBufferEXT nindexBuffer(long struct) { return XrSpatialBufferEXT.create(struct + XrSpatialMeshDataEXT.INDEXBUFFER); }

    /** Unsafe version of {@link #origin(XrPosef) origin}. */
    public static void norigin(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialMeshDataEXT.ORIGIN, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #vertexBuffer(XrSpatialBufferEXT) vertexBuffer}. */
    public static void nvertexBuffer(long struct, XrSpatialBufferEXT value) { memCopy(value.address(), struct + XrSpatialMeshDataEXT.VERTEXBUFFER, XrSpatialBufferEXT.SIZEOF); }
    /** Unsafe version of {@link #indexBuffer(XrSpatialBufferEXT) indexBuffer}. */
    public static void nindexBuffer(long struct, XrSpatialBufferEXT value) { memCopy(value.address(), struct + XrSpatialMeshDataEXT.INDEXBUFFER, XrSpatialBufferEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialMeshDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialMeshDataEXT, Buffer> implements NativeResource {

        private static final XrSpatialMeshDataEXT ELEMENT_FACTORY = XrSpatialMeshDataEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialMeshDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialMeshDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialMeshDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@code origin} field. */
        public XrPosef origin() { return XrSpatialMeshDataEXT.norigin(address()); }
        /** @return a {@link XrSpatialBufferEXT} view of the {@code vertexBuffer} field. */
        public XrSpatialBufferEXT vertexBuffer() { return XrSpatialMeshDataEXT.nvertexBuffer(address()); }
        /** @return a {@link XrSpatialBufferEXT} view of the {@code indexBuffer} field. */
        public XrSpatialBufferEXT indexBuffer() { return XrSpatialMeshDataEXT.nindexBuffer(address()); }

        /** Copies the specified {@link XrPosef} to the {@code origin} field. */
        public XrSpatialMeshDataEXT.Buffer origin(XrPosef value) { XrSpatialMeshDataEXT.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialMeshDataEXT.Buffer origin(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(origin()); return this; }
        /** Copies the specified {@link XrSpatialBufferEXT} to the {@code vertexBuffer} field. */
        public XrSpatialMeshDataEXT.Buffer vertexBuffer(XrSpatialBufferEXT value) { XrSpatialMeshDataEXT.nvertexBuffer(address(), value); return this; }
        /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialMeshDataEXT.Buffer vertexBuffer(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(vertexBuffer()); return this; }
        /** Copies the specified {@link XrSpatialBufferEXT} to the {@code indexBuffer} field. */
        public XrSpatialMeshDataEXT.Buffer indexBuffer(XrSpatialBufferEXT value) { XrSpatialMeshDataEXT.nindexBuffer(address(), value); return this; }
        /** Passes the {@code indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialMeshDataEXT.Buffer indexBuffer(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(indexBuffer()); return this; }

    }

}