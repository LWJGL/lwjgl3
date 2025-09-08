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
 * struct XrSpatialMarkerDataEXT {
 *     XrSpatialCapabilityEXT capability;
 *     uint32_t markerId;
 *     {@link XrSpatialBufferEXT XrSpatialBufferEXT} data;
 * }</code></pre>
 */
public class XrSpatialMarkerDataEXT extends Struct<XrSpatialMarkerDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CAPABILITY,
        MARKERID,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(XrSpatialBufferEXT.SIZEOF, XrSpatialBufferEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CAPABILITY = layout.offsetof(0);
        MARKERID = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected XrSpatialMarkerDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialMarkerDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialMarkerDataEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialMarkerDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialMarkerDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code capability} field. */
    @NativeType("XrSpatialCapabilityEXT")
    public int capability() { return ncapability(address()); }
    /** @return the value of the {@code markerId} field. */
    @NativeType("uint32_t")
    public int markerId() { return nmarkerId(address()); }
    /** @return a {@link XrSpatialBufferEXT} view of the {@code data} field. */
    public XrSpatialBufferEXT data() { return ndata(address()); }

    /** Sets the specified value to the {@code capability} field. */
    public XrSpatialMarkerDataEXT capability(@NativeType("XrSpatialCapabilityEXT") int value) { ncapability(address(), value); return this; }
    /** Sets the specified value to the {@code markerId} field. */
    public XrSpatialMarkerDataEXT markerId(@NativeType("uint32_t") int value) { nmarkerId(address(), value); return this; }
    /** Copies the specified {@link XrSpatialBufferEXT} to the {@code data} field. */
    public XrSpatialMarkerDataEXT data(XrSpatialBufferEXT value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialMarkerDataEXT data(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialMarkerDataEXT set(
        int capability,
        int markerId,
        XrSpatialBufferEXT data
    ) {
        capability(capability);
        markerId(markerId);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialMarkerDataEXT set(XrSpatialMarkerDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialMarkerDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialMarkerDataEXT malloc() {
        return new XrSpatialMarkerDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMarkerDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialMarkerDataEXT calloc() {
        return new XrSpatialMarkerDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMarkerDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialMarkerDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialMarkerDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialMarkerDataEXT} instance for the specified memory address. */
    public static XrSpatialMarkerDataEXT create(long address) {
        return new XrSpatialMarkerDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialMarkerDataEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialMarkerDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialMarkerDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialMarkerDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialMarkerDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialMarkerDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMarkerDataEXT malloc(MemoryStack stack) {
        return new XrSpatialMarkerDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialMarkerDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMarkerDataEXT calloc(MemoryStack stack) {
        return new XrSpatialMarkerDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialMarkerDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #capability}. */
    public static int ncapability(long struct) { return memGetInt(struct + XrSpatialMarkerDataEXT.CAPABILITY); }
    /** Unsafe version of {@link #markerId}. */
    public static int nmarkerId(long struct) { return memGetInt(struct + XrSpatialMarkerDataEXT.MARKERID); }
    /** Unsafe version of {@link #data}. */
    public static XrSpatialBufferEXT ndata(long struct) { return XrSpatialBufferEXT.create(struct + XrSpatialMarkerDataEXT.DATA); }

    /** Unsafe version of {@link #capability(int) capability}. */
    public static void ncapability(long struct, int value) { memPutInt(struct + XrSpatialMarkerDataEXT.CAPABILITY, value); }
    /** Unsafe version of {@link #markerId(int) markerId}. */
    public static void nmarkerId(long struct, int value) { memPutInt(struct + XrSpatialMarkerDataEXT.MARKERID, value); }
    /** Unsafe version of {@link #data(XrSpatialBufferEXT) data}. */
    public static void ndata(long struct, XrSpatialBufferEXT value) { memCopy(value.address(), struct + XrSpatialMarkerDataEXT.DATA, XrSpatialBufferEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialMarkerDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialMarkerDataEXT, Buffer> implements NativeResource {

        private static final XrSpatialMarkerDataEXT ELEMENT_FACTORY = XrSpatialMarkerDataEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialMarkerDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialMarkerDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialMarkerDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code capability} field. */
        @NativeType("XrSpatialCapabilityEXT")
        public int capability() { return XrSpatialMarkerDataEXT.ncapability(address()); }
        /** @return the value of the {@code markerId} field. */
        @NativeType("uint32_t")
        public int markerId() { return XrSpatialMarkerDataEXT.nmarkerId(address()); }
        /** @return a {@link XrSpatialBufferEXT} view of the {@code data} field. */
        public XrSpatialBufferEXT data() { return XrSpatialMarkerDataEXT.ndata(address()); }

        /** Sets the specified value to the {@code capability} field. */
        public XrSpatialMarkerDataEXT.Buffer capability(@NativeType("XrSpatialCapabilityEXT") int value) { XrSpatialMarkerDataEXT.ncapability(address(), value); return this; }
        /** Sets the specified value to the {@code markerId} field. */
        public XrSpatialMarkerDataEXT.Buffer markerId(@NativeType("uint32_t") int value) { XrSpatialMarkerDataEXT.nmarkerId(address(), value); return this; }
        /** Copies the specified {@link XrSpatialBufferEXT} to the {@code data} field. */
        public XrSpatialMarkerDataEXT.Buffer data(XrSpatialBufferEXT value) { XrSpatialMarkerDataEXT.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialMarkerDataEXT.Buffer data(java.util.function.Consumer<XrSpatialBufferEXT> consumer) { consumer.accept(data()); return this; }

    }

}