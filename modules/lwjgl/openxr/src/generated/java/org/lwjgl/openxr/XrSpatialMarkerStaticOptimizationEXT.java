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
 * struct XrSpatialMarkerStaticOptimizationEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 optimizeForStaticMarker;
 * }}</pre>
 */
public class XrSpatialMarkerStaticOptimizationEXT extends Struct<XrSpatialMarkerStaticOptimizationEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        OPTIMIZEFORSTATICMARKER;

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
        OPTIMIZEFORSTATICMARKER = layout.offsetof(2);
    }

    protected XrSpatialMarkerStaticOptimizationEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialMarkerStaticOptimizationEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialMarkerStaticOptimizationEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialMarkerStaticOptimizationEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialMarkerStaticOptimizationEXT(ByteBuffer container) {
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
    /** @return the value of the {@code optimizeForStaticMarker} field. */
    @NativeType("XrBool32")
    public boolean optimizeForStaticMarker() { return noptimizeForStaticMarker(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialMarkerStaticOptimizationEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT} value to the {@code type} field. */
    public XrSpatialMarkerStaticOptimizationEXT type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialMarkerStaticOptimizationEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code optimizeForStaticMarker} field. */
    public XrSpatialMarkerStaticOptimizationEXT optimizeForStaticMarker(@NativeType("XrBool32") boolean value) { noptimizeForStaticMarker(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialMarkerStaticOptimizationEXT set(
        int type,
        long next,
        boolean optimizeForStaticMarker
    ) {
        type(type);
        next(next);
        optimizeForStaticMarker(optimizeForStaticMarker);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialMarkerStaticOptimizationEXT set(XrSpatialMarkerStaticOptimizationEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialMarkerStaticOptimizationEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialMarkerStaticOptimizationEXT malloc() {
        return new XrSpatialMarkerStaticOptimizationEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMarkerStaticOptimizationEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialMarkerStaticOptimizationEXT calloc() {
        return new XrSpatialMarkerStaticOptimizationEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialMarkerStaticOptimizationEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialMarkerStaticOptimizationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialMarkerStaticOptimizationEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialMarkerStaticOptimizationEXT} instance for the specified memory address. */
    public static XrSpatialMarkerStaticOptimizationEXT create(long address) {
        return new XrSpatialMarkerStaticOptimizationEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialMarkerStaticOptimizationEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialMarkerStaticOptimizationEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialMarkerStaticOptimizationEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerStaticOptimizationEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerStaticOptimizationEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerStaticOptimizationEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerStaticOptimizationEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerStaticOptimizationEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialMarkerStaticOptimizationEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerStaticOptimizationEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialMarkerStaticOptimizationEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialMarkerStaticOptimizationEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMarkerStaticOptimizationEXT malloc(MemoryStack stack) {
        return new XrSpatialMarkerStaticOptimizationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialMarkerStaticOptimizationEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialMarkerStaticOptimizationEXT calloc(MemoryStack stack) {
        return new XrSpatialMarkerStaticOptimizationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialMarkerStaticOptimizationEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerStaticOptimizationEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialMarkerStaticOptimizationEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialMarkerStaticOptimizationEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialMarkerStaticOptimizationEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialMarkerStaticOptimizationEXT.NEXT); }
    /** Unsafe version of {@link #optimizeForStaticMarker}. */
    public static int noptimizeForStaticMarker(long struct) { return memGetInt(struct + XrSpatialMarkerStaticOptimizationEXT.OPTIMIZEFORSTATICMARKER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialMarkerStaticOptimizationEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialMarkerStaticOptimizationEXT.NEXT, value); }
    /** Unsafe version of {@link #optimizeForStaticMarker(boolean) optimizeForStaticMarker}. */
    public static void noptimizeForStaticMarker(long struct, int value) { memPutInt(struct + XrSpatialMarkerStaticOptimizationEXT.OPTIMIZEFORSTATICMARKER, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialMarkerStaticOptimizationEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialMarkerStaticOptimizationEXT, Buffer> implements NativeResource {

        private static final XrSpatialMarkerStaticOptimizationEXT ELEMENT_FACTORY = XrSpatialMarkerStaticOptimizationEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialMarkerStaticOptimizationEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialMarkerStaticOptimizationEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialMarkerStaticOptimizationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialMarkerStaticOptimizationEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialMarkerStaticOptimizationEXT.nnext(address()); }
        /** @return the value of the {@code optimizeForStaticMarker} field. */
        @NativeType("XrBool32")
        public boolean optimizeForStaticMarker() { return XrSpatialMarkerStaticOptimizationEXT.noptimizeForStaticMarker(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialMarkerStaticOptimizationEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialMarkerStaticOptimizationEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT} value to the {@code type} field. */
        public XrSpatialMarkerStaticOptimizationEXT.Buffer type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_MARKER_STATIC_OPTIMIZATION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialMarkerStaticOptimizationEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialMarkerStaticOptimizationEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code optimizeForStaticMarker} field. */
        public XrSpatialMarkerStaticOptimizationEXT.Buffer optimizeForStaticMarker(@NativeType("XrBool32") boolean value) { XrSpatialMarkerStaticOptimizationEXT.noptimizeForStaticMarker(address(), value ? 1 : 0); return this; }

    }

}