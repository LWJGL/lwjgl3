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
 * struct XrGeospatialPoseANDROID {
 *     {@link XrQuaternionf XrQuaternionf} eastUpSouthOrientation;
 *     double latitude;
 *     double longitude;
 *     double altitude;
 * }</code></pre>
 */
public class XrGeospatialPoseANDROID extends Struct<XrGeospatialPoseANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EASTUPSOUTHORIENTATION,
        LATITUDE,
        LONGITUDE,
        ALTITUDE;

    static {
        XrQuaternionf.createSafe(NULL);

        Layout layout = __struct(
            __member(XrQuaternionf.SIZEOF, XrQuaternionf.ALIGNOF),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EASTUPSOUTHORIENTATION = layout.offsetof(0);
        LATITUDE = layout.offsetof(1);
        LONGITUDE = layout.offsetof(2);
        ALTITUDE = layout.offsetof(3);
    }

    protected XrGeospatialPoseANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGeospatialPoseANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGeospatialPoseANDROID(address, container);
    }

    /**
     * Creates a {@code XrGeospatialPoseANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeospatialPoseANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrQuaternionf} view of the {@code eastUpSouthOrientation} field. */
    public XrQuaternionf eastUpSouthOrientation() { return neastUpSouthOrientation(address()); }
    /** @return the value of the {@code latitude} field. */
    public double latitude() { return nlatitude(address()); }
    /** @return the value of the {@code longitude} field. */
    public double longitude() { return nlongitude(address()); }
    /** @return the value of the {@code altitude} field. */
    public double altitude() { return naltitude(address()); }

    /** Copies the specified {@link XrQuaternionf} to the {@code eastUpSouthOrientation} field. */
    public XrGeospatialPoseANDROID eastUpSouthOrientation(XrQuaternionf value) { neastUpSouthOrientation(address(), value); return this; }
    /** Passes the {@code eastUpSouthOrientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeospatialPoseANDROID eastUpSouthOrientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(eastUpSouthOrientation()); return this; }
    /** Sets the specified value to the {@code latitude} field. */
    public XrGeospatialPoseANDROID latitude(double value) { nlatitude(address(), value); return this; }
    /** Sets the specified value to the {@code longitude} field. */
    public XrGeospatialPoseANDROID longitude(double value) { nlongitude(address(), value); return this; }
    /** Sets the specified value to the {@code altitude} field. */
    public XrGeospatialPoseANDROID altitude(double value) { naltitude(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeospatialPoseANDROID set(
        XrQuaternionf eastUpSouthOrientation,
        double latitude,
        double longitude,
        double altitude
    ) {
        eastUpSouthOrientation(eastUpSouthOrientation);
        latitude(latitude);
        longitude(longitude);
        altitude(altitude);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGeospatialPoseANDROID set(XrGeospatialPoseANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeospatialPoseANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseANDROID malloc() {
        return new XrGeospatialPoseANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseANDROID calloc() {
        return new XrGeospatialPoseANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGeospatialPoseANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGeospatialPoseANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGeospatialPoseANDROID} instance for the specified memory address. */
    public static XrGeospatialPoseANDROID create(long address) {
        return new XrGeospatialPoseANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGeospatialPoseANDROID createSafe(long address) {
        return address == NULL ? null : new XrGeospatialPoseANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGeospatialPoseANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGeospatialPoseANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGeospatialPoseANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseANDROID malloc(MemoryStack stack) {
        return new XrGeospatialPoseANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGeospatialPoseANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseANDROID calloc(MemoryStack stack) {
        return new XrGeospatialPoseANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eastUpSouthOrientation}. */
    public static XrQuaternionf neastUpSouthOrientation(long struct) { return XrQuaternionf.create(struct + XrGeospatialPoseANDROID.EASTUPSOUTHORIENTATION); }
    /** Unsafe version of {@link #latitude}. */
    public static double nlatitude(long struct) { return memGetDouble(struct + XrGeospatialPoseANDROID.LATITUDE); }
    /** Unsafe version of {@link #longitude}. */
    public static double nlongitude(long struct) { return memGetDouble(struct + XrGeospatialPoseANDROID.LONGITUDE); }
    /** Unsafe version of {@link #altitude}. */
    public static double naltitude(long struct) { return memGetDouble(struct + XrGeospatialPoseANDROID.ALTITUDE); }

    /** Unsafe version of {@link #eastUpSouthOrientation(XrQuaternionf) eastUpSouthOrientation}. */
    public static void neastUpSouthOrientation(long struct, XrQuaternionf value) { memCopy(value.address(), struct + XrGeospatialPoseANDROID.EASTUPSOUTHORIENTATION, XrQuaternionf.SIZEOF); }
    /** Unsafe version of {@link #latitude(double) latitude}. */
    public static void nlatitude(long struct, double value) { memPutDouble(struct + XrGeospatialPoseANDROID.LATITUDE, value); }
    /** Unsafe version of {@link #longitude(double) longitude}. */
    public static void nlongitude(long struct, double value) { memPutDouble(struct + XrGeospatialPoseANDROID.LONGITUDE, value); }
    /** Unsafe version of {@link #altitude(double) altitude}. */
    public static void naltitude(long struct, double value) { memPutDouble(struct + XrGeospatialPoseANDROID.ALTITUDE, value); }

    // -----------------------------------

    /** An array of {@link XrGeospatialPoseANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGeospatialPoseANDROID, Buffer> implements NativeResource {

        private static final XrGeospatialPoseANDROID ELEMENT_FACTORY = XrGeospatialPoseANDROID.create(-1L);

        /**
         * Creates a new {@code XrGeospatialPoseANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeospatialPoseANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGeospatialPoseANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrQuaternionf} view of the {@code eastUpSouthOrientation} field. */
        public XrQuaternionf eastUpSouthOrientation() { return XrGeospatialPoseANDROID.neastUpSouthOrientation(address()); }
        /** @return the value of the {@code latitude} field. */
        public double latitude() { return XrGeospatialPoseANDROID.nlatitude(address()); }
        /** @return the value of the {@code longitude} field. */
        public double longitude() { return XrGeospatialPoseANDROID.nlongitude(address()); }
        /** @return the value of the {@code altitude} field. */
        public double altitude() { return XrGeospatialPoseANDROID.naltitude(address()); }

        /** Copies the specified {@link XrQuaternionf} to the {@code eastUpSouthOrientation} field. */
        public XrGeospatialPoseANDROID.Buffer eastUpSouthOrientation(XrQuaternionf value) { XrGeospatialPoseANDROID.neastUpSouthOrientation(address(), value); return this; }
        /** Passes the {@code eastUpSouthOrientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeospatialPoseANDROID.Buffer eastUpSouthOrientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(eastUpSouthOrientation()); return this; }
        /** Sets the specified value to the {@code latitude} field. */
        public XrGeospatialPoseANDROID.Buffer latitude(double value) { XrGeospatialPoseANDROID.nlatitude(address(), value); return this; }
        /** Sets the specified value to the {@code longitude} field. */
        public XrGeospatialPoseANDROID.Buffer longitude(double value) { XrGeospatialPoseANDROID.nlongitude(address(), value); return this; }
        /** Sets the specified value to the {@code altitude} field. */
        public XrGeospatialPoseANDROID.Buffer altitude(double value) { XrGeospatialPoseANDROID.naltitude(address(), value); return this; }

    }

}