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
 * <pre><code>
 * struct XrSurfaceAnchorCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrGeospatialTrackerANDROID geospatialTracker;
 *     XrSurfaceAnchorTypeANDROID surfaceAnchorType;
 *     {@link XrQuaternionf XrQuaternionf} eastUpSouthOrientation;
 *     double latitude;
 *     double longitude;
 *     double altitudeRelativeToSurface;
 * }</code></pre>
 */
public class XrSurfaceAnchorCreateInfoANDROID extends Struct<XrSurfaceAnchorCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GEOSPATIALTRACKER,
        SURFACEANCHORTYPE,
        EASTUPSOUTHORIENTATION,
        LATITUDE,
        LONGITUDE,
        ALTITUDERELATIVETOSURFACE;

    static {
        XrQuaternionf.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrQuaternionf.SIZEOF, XrQuaternionf.ALIGNOF),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GEOSPATIALTRACKER = layout.offsetof(2);
        SURFACEANCHORTYPE = layout.offsetof(3);
        EASTUPSOUTHORIENTATION = layout.offsetof(4);
        LATITUDE = layout.offsetof(5);
        LONGITUDE = layout.offsetof(6);
        ALTITUDERELATIVETOSURFACE = layout.offsetof(7);
    }

    protected XrSurfaceAnchorCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSurfaceAnchorCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSurfaceAnchorCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrSurfaceAnchorCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSurfaceAnchorCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code geospatialTracker} field. */
    @NativeType("XrGeospatialTrackerANDROID")
    public long geospatialTracker() { return ngeospatialTracker(address()); }
    /** @return the value of the {@code surfaceAnchorType} field. */
    @NativeType("XrSurfaceAnchorTypeANDROID")
    public int surfaceAnchorType() { return nsurfaceAnchorType(address()); }
    /** @return a {@link XrQuaternionf} view of the {@code eastUpSouthOrientation} field. */
    public XrQuaternionf eastUpSouthOrientation() { return neastUpSouthOrientation(address()); }
    /** @return the value of the {@code latitude} field. */
    public double latitude() { return nlatitude(address()); }
    /** @return the value of the {@code longitude} field. */
    public double longitude() { return nlongitude(address()); }
    /** @return the value of the {@code altitudeRelativeToSurface} field. */
    public double altitudeRelativeToSurface() { return naltitudeRelativeToSurface(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSurfaceAnchorCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrSurfaceAnchorCreateInfoANDROID type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSurfaceAnchorCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code geospatialTracker} field. */
    public XrSurfaceAnchorCreateInfoANDROID geospatialTracker(XrGeospatialTrackerANDROID value) { ngeospatialTracker(address(), value); return this; }
    /** Sets the specified value to the {@code surfaceAnchorType} field. */
    public XrSurfaceAnchorCreateInfoANDROID surfaceAnchorType(@NativeType("XrSurfaceAnchorTypeANDROID") int value) { nsurfaceAnchorType(address(), value); return this; }
    /** Copies the specified {@link XrQuaternionf} to the {@code eastUpSouthOrientation} field. */
    public XrSurfaceAnchorCreateInfoANDROID eastUpSouthOrientation(XrQuaternionf value) { neastUpSouthOrientation(address(), value); return this; }
    /** Passes the {@code eastUpSouthOrientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSurfaceAnchorCreateInfoANDROID eastUpSouthOrientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(eastUpSouthOrientation()); return this; }
    /** Sets the specified value to the {@code latitude} field. */
    public XrSurfaceAnchorCreateInfoANDROID latitude(double value) { nlatitude(address(), value); return this; }
    /** Sets the specified value to the {@code longitude} field. */
    public XrSurfaceAnchorCreateInfoANDROID longitude(double value) { nlongitude(address(), value); return this; }
    /** Sets the specified value to the {@code altitudeRelativeToSurface} field. */
    public XrSurfaceAnchorCreateInfoANDROID altitudeRelativeToSurface(double value) { naltitudeRelativeToSurface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSurfaceAnchorCreateInfoANDROID set(
        int type,
        long next,
        XrGeospatialTrackerANDROID geospatialTracker,
        int surfaceAnchorType,
        XrQuaternionf eastUpSouthOrientation,
        double latitude,
        double longitude,
        double altitudeRelativeToSurface
    ) {
        type(type);
        next(next);
        geospatialTracker(geospatialTracker);
        surfaceAnchorType(surfaceAnchorType);
        eastUpSouthOrientation(eastUpSouthOrientation);
        latitude(latitude);
        longitude(longitude);
        altitudeRelativeToSurface(altitudeRelativeToSurface);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSurfaceAnchorCreateInfoANDROID set(XrSurfaceAnchorCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSurfaceAnchorCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSurfaceAnchorCreateInfoANDROID malloc() {
        return new XrSurfaceAnchorCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSurfaceAnchorCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSurfaceAnchorCreateInfoANDROID calloc() {
        return new XrSurfaceAnchorCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSurfaceAnchorCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSurfaceAnchorCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSurfaceAnchorCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSurfaceAnchorCreateInfoANDROID} instance for the specified memory address. */
    public static XrSurfaceAnchorCreateInfoANDROID create(long address) {
        return new XrSurfaceAnchorCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSurfaceAnchorCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrSurfaceAnchorCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSurfaceAnchorCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSurfaceAnchorCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSurfaceAnchorCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSurfaceAnchorCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrSurfaceAnchorCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSurfaceAnchorCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSurfaceAnchorCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrSurfaceAnchorCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSurfaceAnchorCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSurfaceAnchorCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #geospatialTracker}. */
    public static long ngeospatialTracker(long struct) { return memGetAddress(struct + XrSurfaceAnchorCreateInfoANDROID.GEOSPATIALTRACKER); }
    /** Unsafe version of {@link #surfaceAnchorType}. */
    public static int nsurfaceAnchorType(long struct) { return memGetInt(struct + XrSurfaceAnchorCreateInfoANDROID.SURFACEANCHORTYPE); }
    /** Unsafe version of {@link #eastUpSouthOrientation}. */
    public static XrQuaternionf neastUpSouthOrientation(long struct) { return XrQuaternionf.create(struct + XrSurfaceAnchorCreateInfoANDROID.EASTUPSOUTHORIENTATION); }
    /** Unsafe version of {@link #latitude}. */
    public static double nlatitude(long struct) { return memGetDouble(struct + XrSurfaceAnchorCreateInfoANDROID.LATITUDE); }
    /** Unsafe version of {@link #longitude}. */
    public static double nlongitude(long struct) { return memGetDouble(struct + XrSurfaceAnchorCreateInfoANDROID.LONGITUDE); }
    /** Unsafe version of {@link #altitudeRelativeToSurface}. */
    public static double naltitudeRelativeToSurface(long struct) { return memGetDouble(struct + XrSurfaceAnchorCreateInfoANDROID.ALTITUDERELATIVETOSURFACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSurfaceAnchorCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSurfaceAnchorCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #geospatialTracker(XrGeospatialTrackerANDROID) geospatialTracker}. */
    public static void ngeospatialTracker(long struct, XrGeospatialTrackerANDROID value) { memPutAddress(struct + XrSurfaceAnchorCreateInfoANDROID.GEOSPATIALTRACKER, value.address()); }
    /** Unsafe version of {@link #surfaceAnchorType(int) surfaceAnchorType}. */
    public static void nsurfaceAnchorType(long struct, int value) { memPutInt(struct + XrSurfaceAnchorCreateInfoANDROID.SURFACEANCHORTYPE, value); }
    /** Unsafe version of {@link #eastUpSouthOrientation(XrQuaternionf) eastUpSouthOrientation}. */
    public static void neastUpSouthOrientation(long struct, XrQuaternionf value) { memCopy(value.address(), struct + XrSurfaceAnchorCreateInfoANDROID.EASTUPSOUTHORIENTATION, XrQuaternionf.SIZEOF); }
    /** Unsafe version of {@link #latitude(double) latitude}. */
    public static void nlatitude(long struct, double value) { memPutDouble(struct + XrSurfaceAnchorCreateInfoANDROID.LATITUDE, value); }
    /** Unsafe version of {@link #longitude(double) longitude}. */
    public static void nlongitude(long struct, double value) { memPutDouble(struct + XrSurfaceAnchorCreateInfoANDROID.LONGITUDE, value); }
    /** Unsafe version of {@link #altitudeRelativeToSurface(double) altitudeRelativeToSurface}. */
    public static void naltitudeRelativeToSurface(long struct, double value) { memPutDouble(struct + XrSurfaceAnchorCreateInfoANDROID.ALTITUDERELATIVETOSURFACE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSurfaceAnchorCreateInfoANDROID.GEOSPATIALTRACKER));
    }

    // -----------------------------------

    /** An array of {@link XrSurfaceAnchorCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSurfaceAnchorCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrSurfaceAnchorCreateInfoANDROID ELEMENT_FACTORY = XrSurfaceAnchorCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrSurfaceAnchorCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSurfaceAnchorCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSurfaceAnchorCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSurfaceAnchorCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSurfaceAnchorCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code geospatialTracker} field. */
        @NativeType("XrGeospatialTrackerANDROID")
        public long geospatialTracker() { return XrSurfaceAnchorCreateInfoANDROID.ngeospatialTracker(address()); }
        /** @return the value of the {@code surfaceAnchorType} field. */
        @NativeType("XrSurfaceAnchorTypeANDROID")
        public int surfaceAnchorType() { return XrSurfaceAnchorCreateInfoANDROID.nsurfaceAnchorType(address()); }
        /** @return a {@link XrQuaternionf} view of the {@code eastUpSouthOrientation} field. */
        public XrQuaternionf eastUpSouthOrientation() { return XrSurfaceAnchorCreateInfoANDROID.neastUpSouthOrientation(address()); }
        /** @return the value of the {@code latitude} field. */
        public double latitude() { return XrSurfaceAnchorCreateInfoANDROID.nlatitude(address()); }
        /** @return the value of the {@code longitude} field. */
        public double longitude() { return XrSurfaceAnchorCreateInfoANDROID.nlongitude(address()); }
        /** @return the value of the {@code altitudeRelativeToSurface} field. */
        public double altitudeRelativeToSurface() { return XrSurfaceAnchorCreateInfoANDROID.naltitudeRelativeToSurface(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSurfaceAnchorCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_SURFACE_ANCHOR_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrSurfaceAnchorCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code geospatialTracker} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer geospatialTracker(XrGeospatialTrackerANDROID value) { XrSurfaceAnchorCreateInfoANDROID.ngeospatialTracker(address(), value); return this; }
        /** Sets the specified value to the {@code surfaceAnchorType} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer surfaceAnchorType(@NativeType("XrSurfaceAnchorTypeANDROID") int value) { XrSurfaceAnchorCreateInfoANDROID.nsurfaceAnchorType(address(), value); return this; }
        /** Copies the specified {@link XrQuaternionf} to the {@code eastUpSouthOrientation} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer eastUpSouthOrientation(XrQuaternionf value) { XrSurfaceAnchorCreateInfoANDROID.neastUpSouthOrientation(address(), value); return this; }
        /** Passes the {@code eastUpSouthOrientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer eastUpSouthOrientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(eastUpSouthOrientation()); return this; }
        /** Sets the specified value to the {@code latitude} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer latitude(double value) { XrSurfaceAnchorCreateInfoANDROID.nlatitude(address(), value); return this; }
        /** Sets the specified value to the {@code longitude} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer longitude(double value) { XrSurfaceAnchorCreateInfoANDROID.nlongitude(address(), value); return this; }
        /** Sets the specified value to the {@code altitudeRelativeToSurface} field. */
        public XrSurfaceAnchorCreateInfoANDROID.Buffer altitudeRelativeToSurface(double value) { XrSurfaceAnchorCreateInfoANDROID.naltitudeRelativeToSurface(address(), value); return this; }

    }

}