/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Camera intrintics state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to using {@link XrExternalCameraIntrinsicsOCULUS}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Di}, {@link XrExternalCameraOCULUS}, {@link XrFovf}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExternalCameraIntrinsicsOCULUS {
 *     XrTime {@link #lastChangeTime};
 *     {@link XrFovf XrFovf} {@link #fov};
 *     float {@link #virtualNearPlaneDistance};
 *     float {@link #virtualFarPlaneDistance};
 *     {@link XrExtent2Di XrExtent2Di} {@link #imageSensorPixelResolution};
 * }</code></pre>
 */
public class XrExternalCameraIntrinsicsOCULUS extends Struct<XrExternalCameraIntrinsicsOCULUS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LASTCHANGETIME,
        FOV,
        VIRTUALNEARPLANEDISTANCE,
        VIRTUALFARPLANEDISTANCE,
        IMAGESENSORPIXELRESOLUTION;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF),
            __member(4),
            __member(4),
            __member(XrExtent2Di.SIZEOF, XrExtent2Di.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LASTCHANGETIME = layout.offsetof(0);
        FOV = layout.offsetof(1);
        VIRTUALNEARPLANEDISTANCE = layout.offsetof(2);
        VIRTUALFARPLANEDISTANCE = layout.offsetof(3);
        IMAGESENSORPIXELRESOLUTION = layout.offsetof(4);
    }

    protected XrExternalCameraIntrinsicsOCULUS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExternalCameraIntrinsicsOCULUS create(long address, @Nullable ByteBuffer container) {
        return new XrExternalCameraIntrinsicsOCULUS(address, container);
    }

    /**
     * Creates a {@code XrExternalCameraIntrinsicsOCULUS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExternalCameraIntrinsicsOCULUS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrTime} when this camera’s intrinsics last changed. */
    @NativeType("XrTime")
    public long lastChangeTime() { return nlastChangeTime(address()); }
    /** the {@link XrFovf} for this camera’s viewport. */
    public XrFovf fov() { return nfov(address()); }
    /** the near plane distance of the virtual camera used to match the external camera */
    public float virtualNearPlaneDistance() { return nvirtualNearPlaneDistance(address()); }
    /** the far plane distance of the virtual camera used to match the external camera */
    public float virtualFarPlaneDistance() { return nvirtualFarPlaneDistance(address()); }
    /** the {@link XrExtent2Di} specifying the camera’s resolution (in pixels). */
    public XrExtent2Di imageSensorPixelResolution() { return nimageSensorPixelResolution(address()); }

    /** Sets the specified value to the {@link #lastChangeTime} field. */
    public XrExternalCameraIntrinsicsOCULUS lastChangeTime(@NativeType("XrTime") long value) { nlastChangeTime(address(), value); return this; }
    /** Copies the specified {@link XrFovf} to the {@link #fov} field. */
    public XrExternalCameraIntrinsicsOCULUS fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@link #fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrExternalCameraIntrinsicsOCULUS fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
    /** Sets the specified value to the {@link #virtualNearPlaneDistance} field. */
    public XrExternalCameraIntrinsicsOCULUS virtualNearPlaneDistance(float value) { nvirtualNearPlaneDistance(address(), value); return this; }
    /** Sets the specified value to the {@link #virtualFarPlaneDistance} field. */
    public XrExternalCameraIntrinsicsOCULUS virtualFarPlaneDistance(float value) { nvirtualFarPlaneDistance(address(), value); return this; }
    /** Copies the specified {@link XrExtent2Di} to the {@link #imageSensorPixelResolution} field. */
    public XrExternalCameraIntrinsicsOCULUS imageSensorPixelResolution(XrExtent2Di value) { nimageSensorPixelResolution(address(), value); return this; }
    /** Passes the {@link #imageSensorPixelResolution} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrExternalCameraIntrinsicsOCULUS imageSensorPixelResolution(java.util.function.Consumer<XrExtent2Di> consumer) { consumer.accept(imageSensorPixelResolution()); return this; }

    /** Initializes this struct with the specified values. */
    public XrExternalCameraIntrinsicsOCULUS set(
        long lastChangeTime,
        XrFovf fov,
        float virtualNearPlaneDistance,
        float virtualFarPlaneDistance,
        XrExtent2Di imageSensorPixelResolution
    ) {
        lastChangeTime(lastChangeTime);
        fov(fov);
        virtualNearPlaneDistance(virtualNearPlaneDistance);
        virtualFarPlaneDistance(virtualFarPlaneDistance);
        imageSensorPixelResolution(imageSensorPixelResolution);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExternalCameraIntrinsicsOCULUS set(XrExternalCameraIntrinsicsOCULUS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExternalCameraIntrinsicsOCULUS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExternalCameraIntrinsicsOCULUS malloc() {
        return new XrExternalCameraIntrinsicsOCULUS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExternalCameraIntrinsicsOCULUS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExternalCameraIntrinsicsOCULUS calloc() {
        return new XrExternalCameraIntrinsicsOCULUS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExternalCameraIntrinsicsOCULUS} instance allocated with {@link BufferUtils}. */
    public static XrExternalCameraIntrinsicsOCULUS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExternalCameraIntrinsicsOCULUS(memAddress(container), container);
    }

    /** Returns a new {@code XrExternalCameraIntrinsicsOCULUS} instance for the specified memory address. */
    public static XrExternalCameraIntrinsicsOCULUS create(long address) {
        return new XrExternalCameraIntrinsicsOCULUS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExternalCameraIntrinsicsOCULUS createSafe(long address) {
        return address == NULL ? null : new XrExternalCameraIntrinsicsOCULUS(address, null);
    }

    /**
     * Returns a new {@link XrExternalCameraIntrinsicsOCULUS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraIntrinsicsOCULUS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraIntrinsicsOCULUS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraIntrinsicsOCULUS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraIntrinsicsOCULUS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraIntrinsicsOCULUS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExternalCameraIntrinsicsOCULUS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraIntrinsicsOCULUS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExternalCameraIntrinsicsOCULUS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExternalCameraIntrinsicsOCULUS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExternalCameraIntrinsicsOCULUS malloc(MemoryStack stack) {
        return new XrExternalCameraIntrinsicsOCULUS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExternalCameraIntrinsicsOCULUS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExternalCameraIntrinsicsOCULUS calloc(MemoryStack stack) {
        return new XrExternalCameraIntrinsicsOCULUS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExternalCameraIntrinsicsOCULUS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraIntrinsicsOCULUS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraIntrinsicsOCULUS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraIntrinsicsOCULUS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #lastChangeTime}. */
    public static long nlastChangeTime(long struct) { return UNSAFE.getLong(null, struct + XrExternalCameraIntrinsicsOCULUS.LASTCHANGETIME); }
    /** Unsafe version of {@link #fov}. */
    public static XrFovf nfov(long struct) { return XrFovf.create(struct + XrExternalCameraIntrinsicsOCULUS.FOV); }
    /** Unsafe version of {@link #virtualNearPlaneDistance}. */
    public static float nvirtualNearPlaneDistance(long struct) { return UNSAFE.getFloat(null, struct + XrExternalCameraIntrinsicsOCULUS.VIRTUALNEARPLANEDISTANCE); }
    /** Unsafe version of {@link #virtualFarPlaneDistance}. */
    public static float nvirtualFarPlaneDistance(long struct) { return UNSAFE.getFloat(null, struct + XrExternalCameraIntrinsicsOCULUS.VIRTUALFARPLANEDISTANCE); }
    /** Unsafe version of {@link #imageSensorPixelResolution}. */
    public static XrExtent2Di nimageSensorPixelResolution(long struct) { return XrExtent2Di.create(struct + XrExternalCameraIntrinsicsOCULUS.IMAGESENSORPIXELRESOLUTION); }

    /** Unsafe version of {@link #lastChangeTime(long) lastChangeTime}. */
    public static void nlastChangeTime(long struct, long value) { UNSAFE.putLong(null, struct + XrExternalCameraIntrinsicsOCULUS.LASTCHANGETIME, value); }
    /** Unsafe version of {@link #fov(XrFovf) fov}. */
    public static void nfov(long struct, XrFovf value) { memCopy(value.address(), struct + XrExternalCameraIntrinsicsOCULUS.FOV, XrFovf.SIZEOF); }
    /** Unsafe version of {@link #virtualNearPlaneDistance(float) virtualNearPlaneDistance}. */
    public static void nvirtualNearPlaneDistance(long struct, float value) { UNSAFE.putFloat(null, struct + XrExternalCameraIntrinsicsOCULUS.VIRTUALNEARPLANEDISTANCE, value); }
    /** Unsafe version of {@link #virtualFarPlaneDistance(float) virtualFarPlaneDistance}. */
    public static void nvirtualFarPlaneDistance(long struct, float value) { UNSAFE.putFloat(null, struct + XrExternalCameraIntrinsicsOCULUS.VIRTUALFARPLANEDISTANCE, value); }
    /** Unsafe version of {@link #imageSensorPixelResolution(XrExtent2Di) imageSensorPixelResolution}. */
    public static void nimageSensorPixelResolution(long struct, XrExtent2Di value) { memCopy(value.address(), struct + XrExternalCameraIntrinsicsOCULUS.IMAGESENSORPIXELRESOLUTION, XrExtent2Di.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrExternalCameraIntrinsicsOCULUS} structs. */
    public static class Buffer extends StructBuffer<XrExternalCameraIntrinsicsOCULUS, Buffer> implements NativeResource {

        private static final XrExternalCameraIntrinsicsOCULUS ELEMENT_FACTORY = XrExternalCameraIntrinsicsOCULUS.create(-1L);

        /**
         * Creates a new {@code XrExternalCameraIntrinsicsOCULUS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExternalCameraIntrinsicsOCULUS#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExternalCameraIntrinsicsOCULUS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExternalCameraIntrinsicsOCULUS#lastChangeTime} field. */
        @NativeType("XrTime")
        public long lastChangeTime() { return XrExternalCameraIntrinsicsOCULUS.nlastChangeTime(address()); }
        /** @return a {@link XrFovf} view of the {@link XrExternalCameraIntrinsicsOCULUS#fov} field. */
        public XrFovf fov() { return XrExternalCameraIntrinsicsOCULUS.nfov(address()); }
        /** @return the value of the {@link XrExternalCameraIntrinsicsOCULUS#virtualNearPlaneDistance} field. */
        public float virtualNearPlaneDistance() { return XrExternalCameraIntrinsicsOCULUS.nvirtualNearPlaneDistance(address()); }
        /** @return the value of the {@link XrExternalCameraIntrinsicsOCULUS#virtualFarPlaneDistance} field. */
        public float virtualFarPlaneDistance() { return XrExternalCameraIntrinsicsOCULUS.nvirtualFarPlaneDistance(address()); }
        /** @return a {@link XrExtent2Di} view of the {@link XrExternalCameraIntrinsicsOCULUS#imageSensorPixelResolution} field. */
        public XrExtent2Di imageSensorPixelResolution() { return XrExternalCameraIntrinsicsOCULUS.nimageSensorPixelResolution(address()); }

        /** Sets the specified value to the {@link XrExternalCameraIntrinsicsOCULUS#lastChangeTime} field. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer lastChangeTime(@NativeType("XrTime") long value) { XrExternalCameraIntrinsicsOCULUS.nlastChangeTime(address(), value); return this; }
        /** Copies the specified {@link XrFovf} to the {@link XrExternalCameraIntrinsicsOCULUS#fov} field. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer fov(XrFovf value) { XrExternalCameraIntrinsicsOCULUS.nfov(address(), value); return this; }
        /** Passes the {@link XrExternalCameraIntrinsicsOCULUS#fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
        /** Sets the specified value to the {@link XrExternalCameraIntrinsicsOCULUS#virtualNearPlaneDistance} field. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer virtualNearPlaneDistance(float value) { XrExternalCameraIntrinsicsOCULUS.nvirtualNearPlaneDistance(address(), value); return this; }
        /** Sets the specified value to the {@link XrExternalCameraIntrinsicsOCULUS#virtualFarPlaneDistance} field. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer virtualFarPlaneDistance(float value) { XrExternalCameraIntrinsicsOCULUS.nvirtualFarPlaneDistance(address(), value); return this; }
        /** Copies the specified {@link XrExtent2Di} to the {@link XrExternalCameraIntrinsicsOCULUS#imageSensorPixelResolution} field. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer imageSensorPixelResolution(XrExtent2Di value) { XrExternalCameraIntrinsicsOCULUS.nimageSensorPixelResolution(address(), value); return this; }
        /** Passes the {@link XrExternalCameraIntrinsicsOCULUS#imageSensorPixelResolution} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrExternalCameraIntrinsicsOCULUS.Buffer imageSensorPixelResolution(java.util.function.Consumer<XrExtent2Di> consumer) { consumer.accept(imageSensorPixelResolution()); return this; }

    }

}