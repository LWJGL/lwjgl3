/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ovrCameraIntrinsics {
 *     double LastChangedTime;
 *     {@link OVRFovPort ovrFovPort} FOVPort;
 *     float VirtualNearPlaneDistanceMeters;
 *     float VirtualFarPlaneDistanceMeters;
 *     {@link OVRSizei ovrSizei} ImageSensorPixelResolution;
 *     {@link OVRMatrix4f ovrMatrix4f} LensDistortionMatrix;
 *     double ExposurePeriodSeconds;
 *     double ExposureDurationSeconds;
 * }}</pre>
 */
@NativeType("struct ovrCameraIntrinsics")
public class OVRCameraIntrinsics extends Struct<OVRCameraIntrinsics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LASTCHANGEDTIME,
        FOVPORT,
        VIRTUALNEARPLANEDISTANCEMETERS,
        VIRTUALFARPLANEDISTANCEMETERS,
        IMAGESENSORPIXELRESOLUTION,
        LENSDISTORTIONMATRIX,
        EXPOSUREPERIODSECONDS,
        EXPOSUREDURATIONSECONDS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(OVRFovPort.SIZEOF, OVRFovPort.ALIGNOF),
            __member(4),
            __member(4),
            __member(OVRSizei.SIZEOF, OVRSizei.ALIGNOF),
            __member(OVRMatrix4f.SIZEOF, OVRMatrix4f.ALIGNOF),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LASTCHANGEDTIME = layout.offsetof(0);
        FOVPORT = layout.offsetof(1);
        VIRTUALNEARPLANEDISTANCEMETERS = layout.offsetof(2);
        VIRTUALFARPLANEDISTANCEMETERS = layout.offsetof(3);
        IMAGESENSORPIXELRESOLUTION = layout.offsetof(4);
        LENSDISTORTIONMATRIX = layout.offsetof(5);
        EXPOSUREPERIODSECONDS = layout.offsetof(6);
        EXPOSUREDURATIONSECONDS = layout.offsetof(7);
    }

    protected OVRCameraIntrinsics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRCameraIntrinsics create(long address, @Nullable ByteBuffer container) {
        return new OVRCameraIntrinsics(address, container);
    }

    /**
     * Creates a {@code OVRCameraIntrinsics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRCameraIntrinsics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code LastChangedTime} field. */
    public double LastChangedTime() { return nLastChangedTime(address()); }
    /** @return a {@link OVRFovPort} view of the {@code FOVPort} field. */
    @NativeType("ovrFovPort")
    public OVRFovPort FOVPort() { return nFOVPort(address()); }
    /** @return the value of the {@code VirtualNearPlaneDistanceMeters} field. */
    public float VirtualNearPlaneDistanceMeters() { return nVirtualNearPlaneDistanceMeters(address()); }
    /** @return the value of the {@code VirtualFarPlaneDistanceMeters} field. */
    public float VirtualFarPlaneDistanceMeters() { return nVirtualFarPlaneDistanceMeters(address()); }
    /** @return a {@link OVRSizei} view of the {@code ImageSensorPixelResolution} field. */
    @NativeType("ovrSizei")
    public OVRSizei ImageSensorPixelResolution() { return nImageSensorPixelResolution(address()); }
    /** @return a {@link OVRMatrix4f} view of the {@code LensDistortionMatrix} field. */
    @NativeType("ovrMatrix4f")
    public OVRMatrix4f LensDistortionMatrix() { return nLensDistortionMatrix(address()); }
    /** @return the value of the {@code ExposurePeriodSeconds} field. */
    public double ExposurePeriodSeconds() { return nExposurePeriodSeconds(address()); }
    /** @return the value of the {@code ExposureDurationSeconds} field. */
    public double ExposureDurationSeconds() { return nExposureDurationSeconds(address()); }

    /** Sets the specified value to the {@code LastChangedTime} field. */
    public OVRCameraIntrinsics LastChangedTime(double value) { nLastChangedTime(address(), value); return this; }
    /** Copies the specified {@link OVRFovPort} to the {@code FOVPort} field. */
    public OVRCameraIntrinsics FOVPort(@NativeType("ovrFovPort") OVRFovPort value) { nFOVPort(address(), value); return this; }
    /** Passes the {@code FOVPort} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRCameraIntrinsics FOVPort(java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(FOVPort()); return this; }
    /** Sets the specified value to the {@code VirtualNearPlaneDistanceMeters} field. */
    public OVRCameraIntrinsics VirtualNearPlaneDistanceMeters(float value) { nVirtualNearPlaneDistanceMeters(address(), value); return this; }
    /** Sets the specified value to the {@code VirtualFarPlaneDistanceMeters} field. */
    public OVRCameraIntrinsics VirtualFarPlaneDistanceMeters(float value) { nVirtualFarPlaneDistanceMeters(address(), value); return this; }
    /** Copies the specified {@link OVRSizei} to the {@code ImageSensorPixelResolution} field. */
    public OVRCameraIntrinsics ImageSensorPixelResolution(@NativeType("ovrSizei") OVRSizei value) { nImageSensorPixelResolution(address(), value); return this; }
    /** Passes the {@code ImageSensorPixelResolution} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRCameraIntrinsics ImageSensorPixelResolution(java.util.function.Consumer<OVRSizei> consumer) { consumer.accept(ImageSensorPixelResolution()); return this; }
    /** Copies the specified {@link OVRMatrix4f} to the {@code LensDistortionMatrix} field. */
    public OVRCameraIntrinsics LensDistortionMatrix(@NativeType("ovrMatrix4f") OVRMatrix4f value) { nLensDistortionMatrix(address(), value); return this; }
    /** Passes the {@code LensDistortionMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRCameraIntrinsics LensDistortionMatrix(java.util.function.Consumer<OVRMatrix4f> consumer) { consumer.accept(LensDistortionMatrix()); return this; }
    /** Sets the specified value to the {@code ExposurePeriodSeconds} field. */
    public OVRCameraIntrinsics ExposurePeriodSeconds(double value) { nExposurePeriodSeconds(address(), value); return this; }
    /** Sets the specified value to the {@code ExposureDurationSeconds} field. */
    public OVRCameraIntrinsics ExposureDurationSeconds(double value) { nExposureDurationSeconds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRCameraIntrinsics set(
        double LastChangedTime,
        OVRFovPort FOVPort,
        float VirtualNearPlaneDistanceMeters,
        float VirtualFarPlaneDistanceMeters,
        OVRSizei ImageSensorPixelResolution,
        OVRMatrix4f LensDistortionMatrix,
        double ExposurePeriodSeconds,
        double ExposureDurationSeconds
    ) {
        LastChangedTime(LastChangedTime);
        FOVPort(FOVPort);
        VirtualNearPlaneDistanceMeters(VirtualNearPlaneDistanceMeters);
        VirtualFarPlaneDistanceMeters(VirtualFarPlaneDistanceMeters);
        ImageSensorPixelResolution(ImageSensorPixelResolution);
        LensDistortionMatrix(LensDistortionMatrix);
        ExposurePeriodSeconds(ExposurePeriodSeconds);
        ExposureDurationSeconds(ExposureDurationSeconds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRCameraIntrinsics set(OVRCameraIntrinsics src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRCameraIntrinsics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRCameraIntrinsics malloc() {
        return new OVRCameraIntrinsics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRCameraIntrinsics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRCameraIntrinsics calloc() {
        return new OVRCameraIntrinsics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRCameraIntrinsics} instance allocated with {@link BufferUtils}. */
    public static OVRCameraIntrinsics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRCameraIntrinsics(memAddress(container), container);
    }

    /** Returns a new {@code OVRCameraIntrinsics} instance for the specified memory address. */
    public static OVRCameraIntrinsics create(long address) {
        return new OVRCameraIntrinsics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRCameraIntrinsics createSafe(long address) {
        return address == NULL ? null : new OVRCameraIntrinsics(address, null);
    }

    /**
     * Returns a new {@link OVRCameraIntrinsics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRCameraIntrinsics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRCameraIntrinsics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRCameraIntrinsics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRCameraIntrinsics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRCameraIntrinsics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRCameraIntrinsics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRCameraIntrinsics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OVRCameraIntrinsics.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraIntrinsics.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRCameraIntrinsics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRCameraIntrinsics malloc(MemoryStack stack) {
        return new OVRCameraIntrinsics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRCameraIntrinsics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRCameraIntrinsics calloc(MemoryStack stack) {
        return new OVRCameraIntrinsics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRCameraIntrinsics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRCameraIntrinsics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRCameraIntrinsics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRCameraIntrinsics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #LastChangedTime}. */
    public static double nLastChangedTime(long struct) { return memGetDouble(struct + OVRCameraIntrinsics.LASTCHANGEDTIME); }
    /** Unsafe version of {@link #FOVPort}. */
    public static OVRFovPort nFOVPort(long struct) { return OVRFovPort.create(struct + OVRCameraIntrinsics.FOVPORT); }
    /** Unsafe version of {@link #VirtualNearPlaneDistanceMeters}. */
    public static float nVirtualNearPlaneDistanceMeters(long struct) { return memGetFloat(struct + OVRCameraIntrinsics.VIRTUALNEARPLANEDISTANCEMETERS); }
    /** Unsafe version of {@link #VirtualFarPlaneDistanceMeters}. */
    public static float nVirtualFarPlaneDistanceMeters(long struct) { return memGetFloat(struct + OVRCameraIntrinsics.VIRTUALFARPLANEDISTANCEMETERS); }
    /** Unsafe version of {@link #ImageSensorPixelResolution}. */
    public static OVRSizei nImageSensorPixelResolution(long struct) { return OVRSizei.create(struct + OVRCameraIntrinsics.IMAGESENSORPIXELRESOLUTION); }
    /** Unsafe version of {@link #LensDistortionMatrix}. */
    public static OVRMatrix4f nLensDistortionMatrix(long struct) { return OVRMatrix4f.create(struct + OVRCameraIntrinsics.LENSDISTORTIONMATRIX); }
    /** Unsafe version of {@link #ExposurePeriodSeconds}. */
    public static double nExposurePeriodSeconds(long struct) { return memGetDouble(struct + OVRCameraIntrinsics.EXPOSUREPERIODSECONDS); }
    /** Unsafe version of {@link #ExposureDurationSeconds}. */
    public static double nExposureDurationSeconds(long struct) { return memGetDouble(struct + OVRCameraIntrinsics.EXPOSUREDURATIONSECONDS); }

    /** Unsafe version of {@link #LastChangedTime(double) LastChangedTime}. */
    public static void nLastChangedTime(long struct, double value) { memPutDouble(struct + OVRCameraIntrinsics.LASTCHANGEDTIME, value); }
    /** Unsafe version of {@link #FOVPort(OVRFovPort) FOVPort}. */
    public static void nFOVPort(long struct, OVRFovPort value) { memCopy(value.address(), struct + OVRCameraIntrinsics.FOVPORT, OVRFovPort.SIZEOF); }
    /** Unsafe version of {@link #VirtualNearPlaneDistanceMeters(float) VirtualNearPlaneDistanceMeters}. */
    public static void nVirtualNearPlaneDistanceMeters(long struct, float value) { memPutFloat(struct + OVRCameraIntrinsics.VIRTUALNEARPLANEDISTANCEMETERS, value); }
    /** Unsafe version of {@link #VirtualFarPlaneDistanceMeters(float) VirtualFarPlaneDistanceMeters}. */
    public static void nVirtualFarPlaneDistanceMeters(long struct, float value) { memPutFloat(struct + OVRCameraIntrinsics.VIRTUALFARPLANEDISTANCEMETERS, value); }
    /** Unsafe version of {@link #ImageSensorPixelResolution(OVRSizei) ImageSensorPixelResolution}. */
    public static void nImageSensorPixelResolution(long struct, OVRSizei value) { memCopy(value.address(), struct + OVRCameraIntrinsics.IMAGESENSORPIXELRESOLUTION, OVRSizei.SIZEOF); }
    /** Unsafe version of {@link #LensDistortionMatrix(OVRMatrix4f) LensDistortionMatrix}. */
    public static void nLensDistortionMatrix(long struct, OVRMatrix4f value) { memCopy(value.address(), struct + OVRCameraIntrinsics.LENSDISTORTIONMATRIX, OVRMatrix4f.SIZEOF); }
    /** Unsafe version of {@link #ExposurePeriodSeconds(double) ExposurePeriodSeconds}. */
    public static void nExposurePeriodSeconds(long struct, double value) { memPutDouble(struct + OVRCameraIntrinsics.EXPOSUREPERIODSECONDS, value); }
    /** Unsafe version of {@link #ExposureDurationSeconds(double) ExposureDurationSeconds}. */
    public static void nExposureDurationSeconds(long struct, double value) { memPutDouble(struct + OVRCameraIntrinsics.EXPOSUREDURATIONSECONDS, value); }

    // -----------------------------------

    /** An array of {@link OVRCameraIntrinsics} structs. */
    public static class Buffer extends StructBuffer<OVRCameraIntrinsics, Buffer> implements NativeResource {

        private static final OVRCameraIntrinsics ELEMENT_FACTORY = OVRCameraIntrinsics.create(-1L);

        /**
         * Creates a new {@code OVRCameraIntrinsics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRCameraIntrinsics#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRCameraIntrinsics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code LastChangedTime} field. */
        public double LastChangedTime() { return OVRCameraIntrinsics.nLastChangedTime(address()); }
        /** @return a {@link OVRFovPort} view of the {@code FOVPort} field. */
        @NativeType("ovrFovPort")
        public OVRFovPort FOVPort() { return OVRCameraIntrinsics.nFOVPort(address()); }
        /** @return the value of the {@code VirtualNearPlaneDistanceMeters} field. */
        public float VirtualNearPlaneDistanceMeters() { return OVRCameraIntrinsics.nVirtualNearPlaneDistanceMeters(address()); }
        /** @return the value of the {@code VirtualFarPlaneDistanceMeters} field. */
        public float VirtualFarPlaneDistanceMeters() { return OVRCameraIntrinsics.nVirtualFarPlaneDistanceMeters(address()); }
        /** @return a {@link OVRSizei} view of the {@code ImageSensorPixelResolution} field. */
        @NativeType("ovrSizei")
        public OVRSizei ImageSensorPixelResolution() { return OVRCameraIntrinsics.nImageSensorPixelResolution(address()); }
        /** @return a {@link OVRMatrix4f} view of the {@code LensDistortionMatrix} field. */
        @NativeType("ovrMatrix4f")
        public OVRMatrix4f LensDistortionMatrix() { return OVRCameraIntrinsics.nLensDistortionMatrix(address()); }
        /** @return the value of the {@code ExposurePeriodSeconds} field. */
        public double ExposurePeriodSeconds() { return OVRCameraIntrinsics.nExposurePeriodSeconds(address()); }
        /** @return the value of the {@code ExposureDurationSeconds} field. */
        public double ExposureDurationSeconds() { return OVRCameraIntrinsics.nExposureDurationSeconds(address()); }

        /** Sets the specified value to the {@code LastChangedTime} field. */
        public OVRCameraIntrinsics.Buffer LastChangedTime(double value) { OVRCameraIntrinsics.nLastChangedTime(address(), value); return this; }
        /** Copies the specified {@link OVRFovPort} to the {@code FOVPort} field. */
        public OVRCameraIntrinsics.Buffer FOVPort(@NativeType("ovrFovPort") OVRFovPort value) { OVRCameraIntrinsics.nFOVPort(address(), value); return this; }
        /** Passes the {@code FOVPort} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRCameraIntrinsics.Buffer FOVPort(java.util.function.Consumer<OVRFovPort> consumer) { consumer.accept(FOVPort()); return this; }
        /** Sets the specified value to the {@code VirtualNearPlaneDistanceMeters} field. */
        public OVRCameraIntrinsics.Buffer VirtualNearPlaneDistanceMeters(float value) { OVRCameraIntrinsics.nVirtualNearPlaneDistanceMeters(address(), value); return this; }
        /** Sets the specified value to the {@code VirtualFarPlaneDistanceMeters} field. */
        public OVRCameraIntrinsics.Buffer VirtualFarPlaneDistanceMeters(float value) { OVRCameraIntrinsics.nVirtualFarPlaneDistanceMeters(address(), value); return this; }
        /** Copies the specified {@link OVRSizei} to the {@code ImageSensorPixelResolution} field. */
        public OVRCameraIntrinsics.Buffer ImageSensorPixelResolution(@NativeType("ovrSizei") OVRSizei value) { OVRCameraIntrinsics.nImageSensorPixelResolution(address(), value); return this; }
        /** Passes the {@code ImageSensorPixelResolution} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRCameraIntrinsics.Buffer ImageSensorPixelResolution(java.util.function.Consumer<OVRSizei> consumer) { consumer.accept(ImageSensorPixelResolution()); return this; }
        /** Copies the specified {@link OVRMatrix4f} to the {@code LensDistortionMatrix} field. */
        public OVRCameraIntrinsics.Buffer LensDistortionMatrix(@NativeType("ovrMatrix4f") OVRMatrix4f value) { OVRCameraIntrinsics.nLensDistortionMatrix(address(), value); return this; }
        /** Passes the {@code LensDistortionMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRCameraIntrinsics.Buffer LensDistortionMatrix(java.util.function.Consumer<OVRMatrix4f> consumer) { consumer.accept(LensDistortionMatrix()); return this; }
        /** Sets the specified value to the {@code ExposurePeriodSeconds} field. */
        public OVRCameraIntrinsics.Buffer ExposurePeriodSeconds(double value) { OVRCameraIntrinsics.nExposurePeriodSeconds(address(), value); return this; }
        /** Sets the specified value to the {@code ExposureDurationSeconds} field. */
        public OVRCameraIntrinsics.Buffer ExposureDurationSeconds(double value) { OVRCameraIntrinsics.nExposureDurationSeconds(address(), value); return this; }

    }

}