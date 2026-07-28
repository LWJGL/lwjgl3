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
 * struct XrGeospatialTrackerAnchorTrackingInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 shouldTrackPlanes;
 * }}</pre>
 */
public class XrGeospatialTrackerAnchorTrackingInfoANDROID extends Struct<XrGeospatialTrackerAnchorTrackingInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SHOULDTRACKPLANES;

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
        SHOULDTRACKPLANES = layout.offsetof(2);
    }

    protected XrGeospatialTrackerAnchorTrackingInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGeospatialTrackerAnchorTrackingInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code shouldTrackPlanes} field. */
    @NativeType("XrBool32")
    public boolean shouldTrackPlanes() { return nshouldTrackPlanes(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID} value to the {@code type} field. */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code shouldTrackPlanes} field. */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID shouldTrackPlanes(@NativeType("XrBool32") boolean value) { nshouldTrackPlanes(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID set(
        int type,
        long next,
        boolean shouldTrackPlanes
    ) {
        type(type);
        next(next);
        shouldTrackPlanes(shouldTrackPlanes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGeospatialTrackerAnchorTrackingInfoANDROID set(XrGeospatialTrackerAnchorTrackingInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID malloc() {
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID calloc() {
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance for the specified memory address. */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID create(long address) {
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGeospatialTrackerAnchorTrackingInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrGeospatialTrackerAnchorTrackingInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID malloc(MemoryStack stack) {
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID calloc(MemoryStack stack) {
        return new XrGeospatialTrackerAnchorTrackingInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGeospatialTrackerAnchorTrackingInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeospatialTrackerAnchorTrackingInfoANDROID.NEXT); }
    /** Unsafe version of {@link #shouldTrackPlanes}. */
    public static int nshouldTrackPlanes(long struct) { return memGetInt(struct + XrGeospatialTrackerAnchorTrackingInfoANDROID.SHOULDTRACKPLANES); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGeospatialTrackerAnchorTrackingInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeospatialTrackerAnchorTrackingInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #shouldTrackPlanes(boolean) shouldTrackPlanes}. */
    public static void nshouldTrackPlanes(long struct, int value) { memPutInt(struct + XrGeospatialTrackerAnchorTrackingInfoANDROID.SHOULDTRACKPLANES, value); }

    // -----------------------------------

    /** An array of {@link XrGeospatialTrackerAnchorTrackingInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGeospatialTrackerAnchorTrackingInfoANDROID, Buffer> implements NativeResource {

        private static final XrGeospatialTrackerAnchorTrackingInfoANDROID ELEMENT_FACTORY = XrGeospatialTrackerAnchorTrackingInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeospatialTrackerAnchorTrackingInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGeospatialTrackerAnchorTrackingInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeospatialTrackerAnchorTrackingInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGeospatialTrackerAnchorTrackingInfoANDROID.nnext(address()); }
        /** @return the value of the {@code shouldTrackPlanes} field. */
        @NativeType("XrBool32")
        public boolean shouldTrackPlanes() { return XrGeospatialTrackerAnchorTrackingInfoANDROID.nshouldTrackPlanes(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGeospatialTrackerAnchorTrackingInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID} value to the {@code type} field. */
        public XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_GEOSPATIAL_TRACKER_ANCHOR_TRACKING_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrGeospatialTrackerAnchorTrackingInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code shouldTrackPlanes} field. */
        public XrGeospatialTrackerAnchorTrackingInfoANDROID.Buffer shouldTrackPlanes(@NativeType("XrBool32") boolean value) { XrGeospatialTrackerAnchorTrackingInfoANDROID.nshouldTrackPlanes(address(), value ? 1 : 0); return this; }

    }

}