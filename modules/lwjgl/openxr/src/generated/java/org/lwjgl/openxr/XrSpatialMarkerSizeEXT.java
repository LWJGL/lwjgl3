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
 * struct XrSpatialMarkerSizeEXT {
 *     XrStructureType type;
 *     void const * next;
 *     float markerSideLength;
 * }}</pre>
 */
public class XrSpatialMarkerSizeEXT extends Struct<XrSpatialMarkerSizeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERSIDELENGTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MARKERSIDELENGTH = layout.offsetof(2);
    }

    protected XrSpatialMarkerSizeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialMarkerSizeEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialMarkerSizeEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialMarkerSizeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialMarkerSizeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code markerSideLength} field. */
    public float markerSideLength() { return nmarkerSideLength(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialMarkerSizeEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_MARKER_SIZE_EXT TYPE_SPATIAL_MARKER_SIZE_EXT} value to the {@code type} field. */
    public XrSpatialMarkerSizeEXT type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_MARKER_SIZE_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialMarkerSizeEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code markerSideLength} field. */
    public XrSpatialMarkerSizeEXT markerSideLength(float value) { nmarkerSideLength(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialMarkerSizeEXT set(
        int type,
        long next,
        float markerSideLength
    ) {
        type(type);
        next(next);
        markerSideLength(markerSideLength);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialMarkerSizeEXT set(XrSpatialMarkerSizeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialMarkerSizeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialMarkerSizeEXT malloc() {
        return new XrSpatialMarkerSizeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMarkerSizeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialMarkerSizeEXT calloc() {
        return new XrSpatialMarkerSizeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMarkerSizeEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialMarkerSizeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialMarkerSizeEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialMarkerSizeEXT} instance for the specified memory address. */
    public static XrSpatialMarkerSizeEXT create(long address) {
        return new XrSpatialMarkerSizeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialMarkerSizeEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialMarkerSizeEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialMarkerSizeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerSizeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerSizeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerSizeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerSizeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerSizeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialMarkerSizeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerSizeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialMarkerSizeEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialMarkerSizeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMarkerSizeEXT malloc(MemoryStack stack) {
        return new XrSpatialMarkerSizeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialMarkerSizeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMarkerSizeEXT calloc(MemoryStack stack) {
        return new XrSpatialMarkerSizeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialMarkerSizeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerSizeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerSizeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerSizeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialMarkerSizeEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialMarkerSizeEXT.NEXT); }
    /** Unsafe version of {@link #markerSideLength}. */
    public static float nmarkerSideLength(long struct) { return memGetFloat(struct + XrSpatialMarkerSizeEXT.MARKERSIDELENGTH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialMarkerSizeEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialMarkerSizeEXT.NEXT, value); }
    /** Unsafe version of {@link #markerSideLength(float) markerSideLength}. */
    public static void nmarkerSideLength(long struct, float value) { memPutFloat(struct + XrSpatialMarkerSizeEXT.MARKERSIDELENGTH, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialMarkerSizeEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialMarkerSizeEXT, Buffer> implements NativeResource {

        private static final XrSpatialMarkerSizeEXT ELEMENT_FACTORY = XrSpatialMarkerSizeEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialMarkerSizeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialMarkerSizeEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialMarkerSizeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialMarkerSizeEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialMarkerSizeEXT.nnext(address()); }
        /** @return the value of the {@code markerSideLength} field. */
        public float markerSideLength() { return XrSpatialMarkerSizeEXT.nmarkerSideLength(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialMarkerSizeEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialMarkerSizeEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_MARKER_SIZE_EXT TYPE_SPATIAL_MARKER_SIZE_EXT} value to the {@code type} field. */
        public XrSpatialMarkerSizeEXT.Buffer type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_MARKER_SIZE_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialMarkerSizeEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialMarkerSizeEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code markerSideLength} field. */
        public XrSpatialMarkerSizeEXT.Buffer markerSideLength(float value) { XrSpatialMarkerSizeEXT.nmarkerSideLength(address(), value); return this; }

    }

}