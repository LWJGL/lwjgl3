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
 * struct XrMarkerDetectorSizeInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     float markerLength;
 * }}</pre>
 */
public class XrMarkerDetectorSizeInfoML extends Struct<XrMarkerDetectorSizeInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERLENGTH;

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
        MARKERLENGTH = layout.offsetof(2);
    }

    protected XrMarkerDetectorSizeInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerDetectorSizeInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerDetectorSizeInfoML(address, container);
    }

    /**
     * Creates a {@code XrMarkerDetectorSizeInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerDetectorSizeInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code markerLength} field. */
    public float markerLength() { return nmarkerLength(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMarkerDetectorSizeInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_SIZE_INFO_ML TYPE_MARKER_DETECTOR_SIZE_INFO_ML} value to the {@code type} field. */
    public XrMarkerDetectorSizeInfoML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_SIZE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrMarkerDetectorSizeInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code markerLength} field. */
    public XrMarkerDetectorSizeInfoML markerLength(float value) { nmarkerLength(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerDetectorSizeInfoML set(
        int type,
        long next,
        float markerLength
    ) {
        type(type);
        next(next);
        markerLength(markerLength);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerDetectorSizeInfoML set(XrMarkerDetectorSizeInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerDetectorSizeInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorSizeInfoML malloc() {
        return new XrMarkerDetectorSizeInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorSizeInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorSizeInfoML calloc() {
        return new XrMarkerDetectorSizeInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorSizeInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMarkerDetectorSizeInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerDetectorSizeInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerDetectorSizeInfoML} instance for the specified memory address. */
    public static XrMarkerDetectorSizeInfoML create(long address) {
        return new XrMarkerDetectorSizeInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMarkerDetectorSizeInfoML createSafe(long address) {
        return address == NULL ? null : new XrMarkerDetectorSizeInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorSizeInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorSizeInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorSizeInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorSizeInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorSizeInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorSizeInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerDetectorSizeInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorSizeInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMarkerDetectorSizeInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerDetectorSizeInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorSizeInfoML malloc(MemoryStack stack) {
        return new XrMarkerDetectorSizeInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerDetectorSizeInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorSizeInfoML calloc(MemoryStack stack) {
        return new XrMarkerDetectorSizeInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorSizeInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorSizeInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorSizeInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorSizeInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMarkerDetectorSizeInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerDetectorSizeInfoML.NEXT); }
    /** Unsafe version of {@link #markerLength}. */
    public static float nmarkerLength(long struct) { return memGetFloat(struct + XrMarkerDetectorSizeInfoML.MARKERLENGTH); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMarkerDetectorSizeInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerDetectorSizeInfoML.NEXT, value); }
    /** Unsafe version of {@link #markerLength(float) markerLength}. */
    public static void nmarkerLength(long struct, float value) { memPutFloat(struct + XrMarkerDetectorSizeInfoML.MARKERLENGTH, value); }

    // -----------------------------------

    /** An array of {@link XrMarkerDetectorSizeInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMarkerDetectorSizeInfoML, Buffer> implements NativeResource {

        private static final XrMarkerDetectorSizeInfoML ELEMENT_FACTORY = XrMarkerDetectorSizeInfoML.create(-1L);

        /**
         * Creates a new {@code XrMarkerDetectorSizeInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerDetectorSizeInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerDetectorSizeInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerDetectorSizeInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerDetectorSizeInfoML.nnext(address()); }
        /** @return the value of the {@code markerLength} field. */
        public float markerLength() { return XrMarkerDetectorSizeInfoML.nmarkerLength(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrMarkerDetectorSizeInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerDetectorSizeInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_SIZE_INFO_ML TYPE_MARKER_DETECTOR_SIZE_INFO_ML} value to the {@code type} field. */
        public XrMarkerDetectorSizeInfoML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_SIZE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrMarkerDetectorSizeInfoML.Buffer next(@NativeType("void const *") long value) { XrMarkerDetectorSizeInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code markerLength} field. */
        public XrMarkerDetectorSizeInfoML.Buffer markerLength(float value) { XrMarkerDetectorSizeInfoML.nmarkerLength(address(), value); return this; }

    }

}