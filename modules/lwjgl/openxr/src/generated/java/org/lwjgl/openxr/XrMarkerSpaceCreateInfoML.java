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
 * struct XrMarkerSpaceCreateInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     XrMarkerDetectorML markerDetector;
 *     XrMarkerML marker;
 *     {@link XrPosef XrPosef} poseInMarkerSpace;
 * }}</pre>
 */
public class XrMarkerSpaceCreateInfoML extends Struct<XrMarkerSpaceCreateInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERDETECTOR,
        MARKER,
        POSEINMARKERSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MARKERDETECTOR = layout.offsetof(2);
        MARKER = layout.offsetof(3);
        POSEINMARKERSPACE = layout.offsetof(4);
    }

    protected XrMarkerSpaceCreateInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerSpaceCreateInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerSpaceCreateInfoML(address, container);
    }

    /**
     * Creates a {@code XrMarkerSpaceCreateInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerSpaceCreateInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code markerDetector} field. */
    @NativeType("XrMarkerDetectorML")
    public long markerDetector() { return nmarkerDetector(address()); }
    /** @return the value of the {@code marker} field. */
    @NativeType("XrMarkerML")
    public long marker() { return nmarker(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInMarkerSpace} field. */
    public XrPosef poseInMarkerSpace() { return nposeInMarkerSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMarkerSpaceCreateInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_SPACE_CREATE_INFO_ML TYPE_MARKER_SPACE_CREATE_INFO_ML} value to the {@code type} field. */
    public XrMarkerSpaceCreateInfoML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_SPACE_CREATE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrMarkerSpaceCreateInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code markerDetector} field. */
    public XrMarkerSpaceCreateInfoML markerDetector(XrMarkerDetectorML value) { nmarkerDetector(address(), value); return this; }
    /** Sets the specified value to the {@code marker} field. */
    public XrMarkerSpaceCreateInfoML marker(@NativeType("XrMarkerML") long value) { nmarker(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInMarkerSpace} field. */
    public XrMarkerSpaceCreateInfoML poseInMarkerSpace(XrPosef value) { nposeInMarkerSpace(address(), value); return this; }
    /** Passes the {@code poseInMarkerSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrMarkerSpaceCreateInfoML poseInMarkerSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInMarkerSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerSpaceCreateInfoML set(
        int type,
        long next,
        XrMarkerDetectorML markerDetector,
        long marker,
        XrPosef poseInMarkerSpace
    ) {
        type(type);
        next(next);
        markerDetector(markerDetector);
        marker(marker);
        poseInMarkerSpace(poseInMarkerSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerSpaceCreateInfoML set(XrMarkerSpaceCreateInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerSpaceCreateInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerSpaceCreateInfoML malloc() {
        return new XrMarkerSpaceCreateInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerSpaceCreateInfoML calloc() {
        return new XrMarkerSpaceCreateInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMarkerSpaceCreateInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerSpaceCreateInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoML} instance for the specified memory address. */
    public static XrMarkerSpaceCreateInfoML create(long address) {
        return new XrMarkerSpaceCreateInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMarkerSpaceCreateInfoML createSafe(long address) {
        return address == NULL ? null : new XrMarkerSpaceCreateInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerSpaceCreateInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMarkerSpaceCreateInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerSpaceCreateInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerSpaceCreateInfoML malloc(MemoryStack stack) {
        return new XrMarkerSpaceCreateInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerSpaceCreateInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerSpaceCreateInfoML calloc(MemoryStack stack) {
        return new XrMarkerSpaceCreateInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerSpaceCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerSpaceCreateInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMarkerSpaceCreateInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerSpaceCreateInfoML.NEXT); }
    /** Unsafe version of {@link #markerDetector}. */
    public static long nmarkerDetector(long struct) { return memGetAddress(struct + XrMarkerSpaceCreateInfoML.MARKERDETECTOR); }
    /** Unsafe version of {@link #marker}. */
    public static long nmarker(long struct) { return memGetLong(struct + XrMarkerSpaceCreateInfoML.MARKER); }
    /** Unsafe version of {@link #poseInMarkerSpace}. */
    public static XrPosef nposeInMarkerSpace(long struct) { return XrPosef.create(struct + XrMarkerSpaceCreateInfoML.POSEINMARKERSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMarkerSpaceCreateInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerSpaceCreateInfoML.NEXT, value); }
    /** Unsafe version of {@link #markerDetector(XrMarkerDetectorML) markerDetector}. */
    public static void nmarkerDetector(long struct, XrMarkerDetectorML value) { memPutAddress(struct + XrMarkerSpaceCreateInfoML.MARKERDETECTOR, value.address()); }
    /** Unsafe version of {@link #marker(long) marker}. */
    public static void nmarker(long struct, long value) { memPutLong(struct + XrMarkerSpaceCreateInfoML.MARKER, value); }
    /** Unsafe version of {@link #poseInMarkerSpace(XrPosef) poseInMarkerSpace}. */
    public static void nposeInMarkerSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrMarkerSpaceCreateInfoML.POSEINMARKERSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrMarkerSpaceCreateInfoML.MARKERDETECTOR));
    }

    // -----------------------------------

    /** An array of {@link XrMarkerSpaceCreateInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMarkerSpaceCreateInfoML, Buffer> implements NativeResource {

        private static final XrMarkerSpaceCreateInfoML ELEMENT_FACTORY = XrMarkerSpaceCreateInfoML.create(-1L);

        /**
         * Creates a new {@code XrMarkerSpaceCreateInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerSpaceCreateInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerSpaceCreateInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerSpaceCreateInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerSpaceCreateInfoML.nnext(address()); }
        /** @return the value of the {@code markerDetector} field. */
        @NativeType("XrMarkerDetectorML")
        public long markerDetector() { return XrMarkerSpaceCreateInfoML.nmarkerDetector(address()); }
        /** @return the value of the {@code marker} field. */
        @NativeType("XrMarkerML")
        public long marker() { return XrMarkerSpaceCreateInfoML.nmarker(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInMarkerSpace} field. */
        public XrPosef poseInMarkerSpace() { return XrMarkerSpaceCreateInfoML.nposeInMarkerSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrMarkerSpaceCreateInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerSpaceCreateInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_SPACE_CREATE_INFO_ML TYPE_MARKER_SPACE_CREATE_INFO_ML} value to the {@code type} field. */
        public XrMarkerSpaceCreateInfoML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_SPACE_CREATE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrMarkerSpaceCreateInfoML.Buffer next(@NativeType("void const *") long value) { XrMarkerSpaceCreateInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code markerDetector} field. */
        public XrMarkerSpaceCreateInfoML.Buffer markerDetector(XrMarkerDetectorML value) { XrMarkerSpaceCreateInfoML.nmarkerDetector(address(), value); return this; }
        /** Sets the specified value to the {@code marker} field. */
        public XrMarkerSpaceCreateInfoML.Buffer marker(@NativeType("XrMarkerML") long value) { XrMarkerSpaceCreateInfoML.nmarker(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInMarkerSpace} field. */
        public XrMarkerSpaceCreateInfoML.Buffer poseInMarkerSpace(XrPosef value) { XrMarkerSpaceCreateInfoML.nposeInMarkerSpace(address(), value); return this; }
        /** Passes the {@code poseInMarkerSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrMarkerSpaceCreateInfoML.Buffer poseInMarkerSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInMarkerSpace()); return this; }

    }

}