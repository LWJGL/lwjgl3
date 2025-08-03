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
 * struct XrSystemMarkerTrackingPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsMarkerTracking;
 *     XrBool32 supportsMarkerSizeEstimation;
 *     uint16_t maxMarkerCount;
 * }}</pre>
 */
public class XrSystemMarkerTrackingPropertiesANDROID extends Struct<XrSystemMarkerTrackingPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSMARKERTRACKING,
        SUPPORTSMARKERSIZEESTIMATION,
        MAXMARKERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSMARKERTRACKING = layout.offsetof(2);
        SUPPORTSMARKERSIZEESTIMATION = layout.offsetof(3);
        MAXMARKERCOUNT = layout.offsetof(4);
    }

    protected XrSystemMarkerTrackingPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemMarkerTrackingPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemMarkerTrackingPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemMarkerTrackingPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemMarkerTrackingPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsMarkerTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsMarkerTracking() { return nsupportsMarkerTracking(address()) != 0; }
    /** @return the value of the {@code supportsMarkerSizeEstimation} field. */
    @NativeType("XrBool32")
    public boolean supportsMarkerSizeEstimation() { return nsupportsMarkerSizeEstimation(address()) != 0; }
    /** @return the value of the {@code maxMarkerCount} field. */
    @NativeType("uint16_t")
    public short maxMarkerCount() { return nmaxMarkerCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemMarkerTrackingPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesMarker#XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemMarkerTrackingPropertiesANDROID type$Default() { return type(ANDROIDTrackablesMarker.XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemMarkerTrackingPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemMarkerTrackingPropertiesANDROID set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemMarkerTrackingPropertiesANDROID set(XrSystemMarkerTrackingPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemMarkerTrackingPropertiesANDROID malloc() {
        return new XrSystemMarkerTrackingPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemMarkerTrackingPropertiesANDROID calloc() {
        return new XrSystemMarkerTrackingPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemMarkerTrackingPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemMarkerTrackingPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemMarkerTrackingPropertiesANDROID create(long address) {
        return new XrSystemMarkerTrackingPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemMarkerTrackingPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemMarkerTrackingPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemMarkerTrackingPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemMarkerTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemMarkerTrackingPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemMarkerTrackingPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemMarkerTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemMarkerTrackingPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemMarkerTrackingPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemMarkerTrackingPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemMarkerTrackingPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsMarkerTracking}. */
    public static int nsupportsMarkerTracking(long struct) { return memGetInt(struct + XrSystemMarkerTrackingPropertiesANDROID.SUPPORTSMARKERTRACKING); }
    /** Unsafe version of {@link #supportsMarkerSizeEstimation}. */
    public static int nsupportsMarkerSizeEstimation(long struct) { return memGetInt(struct + XrSystemMarkerTrackingPropertiesANDROID.SUPPORTSMARKERSIZEESTIMATION); }
    /** Unsafe version of {@link #maxMarkerCount}. */
    public static short nmaxMarkerCount(long struct) { return memGetShort(struct + XrSystemMarkerTrackingPropertiesANDROID.MAXMARKERCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemMarkerTrackingPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemMarkerTrackingPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemMarkerTrackingPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemMarkerTrackingPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemMarkerTrackingPropertiesANDROID ELEMENT_FACTORY = XrSystemMarkerTrackingPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemMarkerTrackingPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemMarkerTrackingPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemMarkerTrackingPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemMarkerTrackingPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemMarkerTrackingPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsMarkerTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsMarkerTracking() { return XrSystemMarkerTrackingPropertiesANDROID.nsupportsMarkerTracking(address()) != 0; }
        /** @return the value of the {@code supportsMarkerSizeEstimation} field. */
        @NativeType("XrBool32")
        public boolean supportsMarkerSizeEstimation() { return XrSystemMarkerTrackingPropertiesANDROID.nsupportsMarkerSizeEstimation(address()) != 0; }
        /** @return the value of the {@code maxMarkerCount} field. */
        @NativeType("uint16_t")
        public short maxMarkerCount() { return XrSystemMarkerTrackingPropertiesANDROID.nmaxMarkerCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemMarkerTrackingPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemMarkerTrackingPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesMarker#XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemMarkerTrackingPropertiesANDROID.Buffer type$Default() { return type(ANDROIDTrackablesMarker.XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemMarkerTrackingPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemMarkerTrackingPropertiesANDROID.nnext(address(), value); return this; }

    }

}