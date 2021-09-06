/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrCameraExtrinsics {
 *     double {@link #LastChangedTimeSeconds};
 *     unsigned int {@link #CameraStatusFlags};
 *     ovrTrackedDeviceType {@link #AttachedToDevice};
 *     {@link OVRPosef ovrPosef} {@link #RelativePose};
 *     double {@link #LastExposureTimeSeconds};
 *     double {@link #ExposureLatencySeconds};
 *     double {@link #AdditionalLatencySeconds};
 * }</code></pre>
 */
@NativeType("struct ovrCameraExtrinsics")
public class OVRCameraExtrinsics extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LASTCHANGEDTIMESECONDS,
        CAMERASTATUSFLAGS,
        ATTACHEDTODEVICE,
        RELATIVEPOSE,
        LASTEXPOSURETIMESECONDS,
        EXPOSURELATENCYSECONDS,
        ADDITIONALLATENCYSECONDS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LASTCHANGEDTIMESECONDS = layout.offsetof(0);
        CAMERASTATUSFLAGS = layout.offsetof(1);
        ATTACHEDTODEVICE = layout.offsetof(2);
        RELATIVEPOSE = layout.offsetof(3);
        LASTEXPOSURETIMESECONDS = layout.offsetof(4);
        EXPOSURELATENCYSECONDS = layout.offsetof(5);
        ADDITIONALLATENCYSECONDS = layout.offsetof(6);
    }

    /**
     * Creates a {@code OVRCameraExtrinsics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRCameraExtrinsics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** time in seconds from last change to the parameters. For instance, if the pose changes, or a camera exposure happens, this struct will be updated. */
    public double LastChangedTimeSeconds() { return nLastChangedTimeSeconds(address()); }
    /** current Status of the camera, a mix of bits from {@code ovrCameraStatusFlags} */
    @NativeType("unsigned int")
    public int CameraStatusFlags() { return nCameraStatusFlags(address()); }
    /**
     * which Tracked device, if any, is the camera rigidly attached to. If set to {@link OVR#ovrTrackedDevice_None TrackedDevice_None}, then the camera is not attached to a tracked object. If
     * the external camera moves while unattached (i.e. set to {@code ovrTrackedDevice_None}), its {@code Pose} won't be updated.
     */
    @NativeType("ovrTrackedDeviceType")
    public int AttachedToDevice() { return nAttachedToDevice(address()); }
    /** the relative Pose of the External Camera. If {@code AttachedToDevice} is {@link OVR#ovrTrackedDevice_None TrackedDevice_None}, then this is a absolute pose in tracking space. */
    @NativeType("ovrPosef")
    public OVRPosef RelativePose() { return nRelativePose(address()); }
    /** the time, in seconds, when the last successful exposure was taken */
    public double LastExposureTimeSeconds() { return nLastExposureTimeSeconds(address()); }
    /** estimated exposure latency to get from the exposure time to the system */
    public double ExposureLatencySeconds() { return nExposureLatencySeconds(address()); }
    /** additional latency to get from the exposure time of the real camera to match the render time of the virtual camera */
    public double AdditionalLatencySeconds() { return nAdditionalLatencySeconds(address()); }

    /** Sets the specified value to the {@link #LastChangedTimeSeconds} field. */
    public OVRCameraExtrinsics LastChangedTimeSeconds(double value) { nLastChangedTimeSeconds(address(), value); return this; }
    /** Sets the specified value to the {@link #CameraStatusFlags} field. */
    public OVRCameraExtrinsics CameraStatusFlags(@NativeType("unsigned int") int value) { nCameraStatusFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #AttachedToDevice} field. */
    public OVRCameraExtrinsics AttachedToDevice(@NativeType("ovrTrackedDeviceType") int value) { nAttachedToDevice(address(), value); return this; }
    /** Copies the specified {@link OVRPosef} to the {@link #RelativePose} field. */
    public OVRCameraExtrinsics RelativePose(@NativeType("ovrPosef") OVRPosef value) { nRelativePose(address(), value); return this; }
    /** Passes the {@link #RelativePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRCameraExtrinsics RelativePose(java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RelativePose()); return this; }
    /** Sets the specified value to the {@link #LastExposureTimeSeconds} field. */
    public OVRCameraExtrinsics LastExposureTimeSeconds(double value) { nLastExposureTimeSeconds(address(), value); return this; }
    /** Sets the specified value to the {@link #ExposureLatencySeconds} field. */
    public OVRCameraExtrinsics ExposureLatencySeconds(double value) { nExposureLatencySeconds(address(), value); return this; }
    /** Sets the specified value to the {@link #AdditionalLatencySeconds} field. */
    public OVRCameraExtrinsics AdditionalLatencySeconds(double value) { nAdditionalLatencySeconds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRCameraExtrinsics set(
        double LastChangedTimeSeconds,
        int CameraStatusFlags,
        int AttachedToDevice,
        OVRPosef RelativePose,
        double LastExposureTimeSeconds,
        double ExposureLatencySeconds,
        double AdditionalLatencySeconds
    ) {
        LastChangedTimeSeconds(LastChangedTimeSeconds);
        CameraStatusFlags(CameraStatusFlags);
        AttachedToDevice(AttachedToDevice);
        RelativePose(RelativePose);
        LastExposureTimeSeconds(LastExposureTimeSeconds);
        ExposureLatencySeconds(ExposureLatencySeconds);
        AdditionalLatencySeconds(AdditionalLatencySeconds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRCameraExtrinsics set(OVRCameraExtrinsics src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRCameraExtrinsics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRCameraExtrinsics malloc() {
        return wrap(OVRCameraExtrinsics.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRCameraExtrinsics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRCameraExtrinsics calloc() {
        return wrap(OVRCameraExtrinsics.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRCameraExtrinsics} instance allocated with {@link BufferUtils}. */
    public static OVRCameraExtrinsics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRCameraExtrinsics.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRCameraExtrinsics} instance for the specified memory address. */
    public static OVRCameraExtrinsics create(long address) {
        return wrap(OVRCameraExtrinsics.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRCameraExtrinsics createSafe(long address) {
        return address == NULL ? null : wrap(OVRCameraExtrinsics.class, address);
    }

    /**
     * Returns a new {@link OVRCameraExtrinsics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRCameraExtrinsics.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRCameraExtrinsics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRCameraExtrinsics.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRCameraExtrinsics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRCameraExtrinsics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRCameraExtrinsics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRCameraExtrinsics.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRCameraExtrinsics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRCameraExtrinsics.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRCameraExtrinsics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRCameraExtrinsics malloc(MemoryStack stack) {
        return wrap(OVRCameraExtrinsics.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRCameraExtrinsics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRCameraExtrinsics calloc(MemoryStack stack) {
        return wrap(OVRCameraExtrinsics.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRCameraExtrinsics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRCameraExtrinsics.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRCameraExtrinsics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRCameraExtrinsics.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #LastChangedTimeSeconds}. */
    public static double nLastChangedTimeSeconds(long struct) { return UNSAFE.getDouble(null, struct + OVRCameraExtrinsics.LASTCHANGEDTIMESECONDS); }
    /** Unsafe version of {@link #CameraStatusFlags}. */
    public static int nCameraStatusFlags(long struct) { return UNSAFE.getInt(null, struct + OVRCameraExtrinsics.CAMERASTATUSFLAGS); }
    /** Unsafe version of {@link #AttachedToDevice}. */
    public static int nAttachedToDevice(long struct) { return UNSAFE.getInt(null, struct + OVRCameraExtrinsics.ATTACHEDTODEVICE); }
    /** Unsafe version of {@link #RelativePose}. */
    public static OVRPosef nRelativePose(long struct) { return OVRPosef.create(struct + OVRCameraExtrinsics.RELATIVEPOSE); }
    /** Unsafe version of {@link #LastExposureTimeSeconds}. */
    public static double nLastExposureTimeSeconds(long struct) { return UNSAFE.getDouble(null, struct + OVRCameraExtrinsics.LASTEXPOSURETIMESECONDS); }
    /** Unsafe version of {@link #ExposureLatencySeconds}. */
    public static double nExposureLatencySeconds(long struct) { return UNSAFE.getDouble(null, struct + OVRCameraExtrinsics.EXPOSURELATENCYSECONDS); }
    /** Unsafe version of {@link #AdditionalLatencySeconds}. */
    public static double nAdditionalLatencySeconds(long struct) { return UNSAFE.getDouble(null, struct + OVRCameraExtrinsics.ADDITIONALLATENCYSECONDS); }

    /** Unsafe version of {@link #LastChangedTimeSeconds(double) LastChangedTimeSeconds}. */
    public static void nLastChangedTimeSeconds(long struct, double value) { UNSAFE.putDouble(null, struct + OVRCameraExtrinsics.LASTCHANGEDTIMESECONDS, value); }
    /** Unsafe version of {@link #CameraStatusFlags(int) CameraStatusFlags}. */
    public static void nCameraStatusFlags(long struct, int value) { UNSAFE.putInt(null, struct + OVRCameraExtrinsics.CAMERASTATUSFLAGS, value); }
    /** Unsafe version of {@link #AttachedToDevice(int) AttachedToDevice}. */
    public static void nAttachedToDevice(long struct, int value) { UNSAFE.putInt(null, struct + OVRCameraExtrinsics.ATTACHEDTODEVICE, value); }
    /** Unsafe version of {@link #RelativePose(OVRPosef) RelativePose}. */
    public static void nRelativePose(long struct, OVRPosef value) { memCopy(value.address(), struct + OVRCameraExtrinsics.RELATIVEPOSE, OVRPosef.SIZEOF); }
    /** Unsafe version of {@link #LastExposureTimeSeconds(double) LastExposureTimeSeconds}. */
    public static void nLastExposureTimeSeconds(long struct, double value) { UNSAFE.putDouble(null, struct + OVRCameraExtrinsics.LASTEXPOSURETIMESECONDS, value); }
    /** Unsafe version of {@link #ExposureLatencySeconds(double) ExposureLatencySeconds}. */
    public static void nExposureLatencySeconds(long struct, double value) { UNSAFE.putDouble(null, struct + OVRCameraExtrinsics.EXPOSURELATENCYSECONDS, value); }
    /** Unsafe version of {@link #AdditionalLatencySeconds(double) AdditionalLatencySeconds}. */
    public static void nAdditionalLatencySeconds(long struct, double value) { UNSAFE.putDouble(null, struct + OVRCameraExtrinsics.ADDITIONALLATENCYSECONDS, value); }

    // -----------------------------------

    /** An array of {@link OVRCameraExtrinsics} structs. */
    public static class Buffer extends StructBuffer<OVRCameraExtrinsics, Buffer> implements NativeResource {

        private static final OVRCameraExtrinsics ELEMENT_FACTORY = OVRCameraExtrinsics.create(-1L);

        /**
         * Creates a new {@code OVRCameraExtrinsics.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRCameraExtrinsics#SIZEOF}, and its mark will be undefined.
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
        protected OVRCameraExtrinsics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRCameraExtrinsics#LastChangedTimeSeconds} field. */
        public double LastChangedTimeSeconds() { return OVRCameraExtrinsics.nLastChangedTimeSeconds(address()); }
        /** @return the value of the {@link OVRCameraExtrinsics#CameraStatusFlags} field. */
        @NativeType("unsigned int")
        public int CameraStatusFlags() { return OVRCameraExtrinsics.nCameraStatusFlags(address()); }
        /** @return the value of the {@link OVRCameraExtrinsics#AttachedToDevice} field. */
        @NativeType("ovrTrackedDeviceType")
        public int AttachedToDevice() { return OVRCameraExtrinsics.nAttachedToDevice(address()); }
        /** @return a {@link OVRPosef} view of the {@link OVRCameraExtrinsics#RelativePose} field. */
        @NativeType("ovrPosef")
        public OVRPosef RelativePose() { return OVRCameraExtrinsics.nRelativePose(address()); }
        /** @return the value of the {@link OVRCameraExtrinsics#LastExposureTimeSeconds} field. */
        public double LastExposureTimeSeconds() { return OVRCameraExtrinsics.nLastExposureTimeSeconds(address()); }
        /** @return the value of the {@link OVRCameraExtrinsics#ExposureLatencySeconds} field. */
        public double ExposureLatencySeconds() { return OVRCameraExtrinsics.nExposureLatencySeconds(address()); }
        /** @return the value of the {@link OVRCameraExtrinsics#AdditionalLatencySeconds} field. */
        public double AdditionalLatencySeconds() { return OVRCameraExtrinsics.nAdditionalLatencySeconds(address()); }

        /** Sets the specified value to the {@link OVRCameraExtrinsics#LastChangedTimeSeconds} field. */
        public OVRCameraExtrinsics.Buffer LastChangedTimeSeconds(double value) { OVRCameraExtrinsics.nLastChangedTimeSeconds(address(), value); return this; }
        /** Sets the specified value to the {@link OVRCameraExtrinsics#CameraStatusFlags} field. */
        public OVRCameraExtrinsics.Buffer CameraStatusFlags(@NativeType("unsigned int") int value) { OVRCameraExtrinsics.nCameraStatusFlags(address(), value); return this; }
        /** Sets the specified value to the {@link OVRCameraExtrinsics#AttachedToDevice} field. */
        public OVRCameraExtrinsics.Buffer AttachedToDevice(@NativeType("ovrTrackedDeviceType") int value) { OVRCameraExtrinsics.nAttachedToDevice(address(), value); return this; }
        /** Copies the specified {@link OVRPosef} to the {@link OVRCameraExtrinsics#RelativePose} field. */
        public OVRCameraExtrinsics.Buffer RelativePose(@NativeType("ovrPosef") OVRPosef value) { OVRCameraExtrinsics.nRelativePose(address(), value); return this; }
        /** Passes the {@link OVRCameraExtrinsics#RelativePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRCameraExtrinsics.Buffer RelativePose(java.util.function.Consumer<OVRPosef> consumer) { consumer.accept(RelativePose()); return this; }
        /** Sets the specified value to the {@link OVRCameraExtrinsics#LastExposureTimeSeconds} field. */
        public OVRCameraExtrinsics.Buffer LastExposureTimeSeconds(double value) { OVRCameraExtrinsics.nLastExposureTimeSeconds(address(), value); return this; }
        /** Sets the specified value to the {@link OVRCameraExtrinsics#ExposureLatencySeconds} field. */
        public OVRCameraExtrinsics.Buffer ExposureLatencySeconds(double value) { OVRCameraExtrinsics.nExposureLatencySeconds(address(), value); return this; }
        /** Sets the specified value to the {@link OVRCameraExtrinsics#AdditionalLatencySeconds} field. */
        public OVRCameraExtrinsics.Buffer AdditionalLatencySeconds(double value) { OVRCameraExtrinsics.nAdditionalLatencySeconds(address(), value); return this; }

    }

}