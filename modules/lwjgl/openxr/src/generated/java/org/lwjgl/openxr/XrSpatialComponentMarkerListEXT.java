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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpatialComponentMarkerListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t markerCount;
 *     {@link XrSpatialMarkerDataEXT XrSpatialMarkerDataEXT} * markers;
 * }}</pre>
 */
public class XrSpatialComponentMarkerListEXT extends Struct<XrSpatialComponentMarkerListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERCOUNT,
        MARKERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MARKERCOUNT = layout.offsetof(2);
        MARKERS = layout.offsetof(3);
    }

    protected XrSpatialComponentMarkerListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentMarkerListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentMarkerListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentMarkerListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentMarkerListEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code markerCount} field. */
    @NativeType("uint32_t")
    public int markerCount() { return nmarkerCount(address()); }
    /** @return a {@link XrSpatialMarkerDataEXT.Buffer} view of the struct array pointed to by the {@code markers} field. */
    @NativeType("XrSpatialMarkerDataEXT *")
    public XrSpatialMarkerDataEXT.Buffer markers() { return nmarkers(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentMarkerListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentMarkerListEXT type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentMarkerListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialMarkerDataEXT.Buffer} to the {@code markers} field. */
    public XrSpatialComponentMarkerListEXT markers(@NativeType("XrSpatialMarkerDataEXT *") XrSpatialMarkerDataEXT.Buffer value) { nmarkers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentMarkerListEXT set(
        int type,
        long next,
        XrSpatialMarkerDataEXT.Buffer markers
    ) {
        type(type);
        next(next);
        markers(markers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentMarkerListEXT set(XrSpatialComponentMarkerListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentMarkerListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentMarkerListEXT malloc() {
        return new XrSpatialComponentMarkerListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentMarkerListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentMarkerListEXT calloc() {
        return new XrSpatialComponentMarkerListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentMarkerListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentMarkerListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentMarkerListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentMarkerListEXT} instance for the specified memory address. */
    public static XrSpatialComponentMarkerListEXT create(long address) {
        return new XrSpatialComponentMarkerListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentMarkerListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentMarkerListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentMarkerListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMarkerListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentMarkerListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMarkerListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentMarkerListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMarkerListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentMarkerListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMarkerListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentMarkerListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentMarkerListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentMarkerListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentMarkerListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentMarkerListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentMarkerListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentMarkerListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentMarkerListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMarkerListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentMarkerListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMarkerListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentMarkerListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentMarkerListEXT.NEXT); }
    /** Unsafe version of {@link #markerCount}. */
    public static int nmarkerCount(long struct) { return memGetInt(struct + XrSpatialComponentMarkerListEXT.MARKERCOUNT); }
    /** Unsafe version of {@link #markers}. */
    public static XrSpatialMarkerDataEXT.Buffer nmarkers(long struct) { return XrSpatialMarkerDataEXT.create(memGetAddress(struct + XrSpatialComponentMarkerListEXT.MARKERS), nmarkerCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentMarkerListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentMarkerListEXT.NEXT, value); }
    /** Sets the specified value to the {@code markerCount} field of the specified {@code struct}. */
    public static void nmarkerCount(long struct, int value) { memPutInt(struct + XrSpatialComponentMarkerListEXT.MARKERCOUNT, value); }
    /** Unsafe version of {@link #markers(XrSpatialMarkerDataEXT.Buffer) markers}. */
    public static void nmarkers(long struct, XrSpatialMarkerDataEXT.Buffer value) { memPutAddress(struct + XrSpatialComponentMarkerListEXT.MARKERS, value.address()); nmarkerCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentMarkerListEXT.MARKERS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentMarkerListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentMarkerListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentMarkerListEXT ELEMENT_FACTORY = XrSpatialComponentMarkerListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentMarkerListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentMarkerListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentMarkerListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentMarkerListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentMarkerListEXT.nnext(address()); }
        /** @return the value of the {@code markerCount} field. */
        @NativeType("uint32_t")
        public int markerCount() { return XrSpatialComponentMarkerListEXT.nmarkerCount(address()); }
        /** @return a {@link XrSpatialMarkerDataEXT.Buffer} view of the struct array pointed to by the {@code markers} field. */
        @NativeType("XrSpatialMarkerDataEXT *")
        public XrSpatialMarkerDataEXT.Buffer markers() { return XrSpatialComponentMarkerListEXT.nmarkers(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentMarkerListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentMarkerListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialMarkerTracking#XR_TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentMarkerListEXT.Buffer type$Default() { return type(EXTSpatialMarkerTracking.XR_TYPE_SPATIAL_COMPONENT_MARKER_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentMarkerListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentMarkerListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialMarkerDataEXT.Buffer} to the {@code markers} field. */
        public XrSpatialComponentMarkerListEXT.Buffer markers(@NativeType("XrSpatialMarkerDataEXT *") XrSpatialMarkerDataEXT.Buffer value) { XrSpatialComponentMarkerListEXT.nmarkers(address(), value); return this; }

    }

}