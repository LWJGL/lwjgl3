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
 * Camera extrinsics state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to using {@link XrExternalCameraExtrinsicsOCULUS}</li>
 * <li>{@code cameraStatusFlags} <b>must</b> be 0 or a valid combination of {@code XrExternalCameraStatusFlagBitsOCULUS} values</li>
 * <li>{@code attachedToDevice} <b>must</b> be a valid {@code XrExternalCameraAttachedToDeviceOCULUS} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExternalCameraOCULUS}, {@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExternalCameraExtrinsicsOCULUS {
 *     XrTime {@link #lastChangeTime};
 *     XrExternalCameraStatusFlagsOCULUS {@link #cameraStatusFlags};
 *     XrExternalCameraAttachedToDeviceOCULUS {@link #attachedToDevice};
 *     {@link XrPosef XrPosef} {@link #relativePose};
 * }</code></pre>
 */
public class XrExternalCameraExtrinsicsOCULUS extends Struct<XrExternalCameraExtrinsicsOCULUS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LASTCHANGETIME,
        CAMERASTATUSFLAGS,
        ATTACHEDTODEVICE,
        RELATIVEPOSE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LASTCHANGETIME = layout.offsetof(0);
        CAMERASTATUSFLAGS = layout.offsetof(1);
        ATTACHEDTODEVICE = layout.offsetof(2);
        RELATIVEPOSE = layout.offsetof(3);
    }

    protected XrExternalCameraExtrinsicsOCULUS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExternalCameraExtrinsicsOCULUS create(long address, @Nullable ByteBuffer container) {
        return new XrExternalCameraExtrinsicsOCULUS(address, container);
    }

    /**
     * Creates a {@code XrExternalCameraExtrinsicsOCULUS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExternalCameraExtrinsicsOCULUS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrTime} when this camera’s extrinsics last changed. */
    @NativeType("XrTime")
    public long lastChangeTime() { return nlastChangeTime(address()); }
    /** the {@code XrExternalCameraStatusFlagsOCULUS} for this camera’s status. */
    @NativeType("XrExternalCameraStatusFlagsOCULUS")
    public long cameraStatusFlags() { return ncameraStatusFlags(address()); }
    /** the {@code XrExternalCameraAttachedToDeviceOCULUS} for the device this camera is attached to */
    @NativeType("XrExternalCameraAttachedToDeviceOCULUS")
    public int attachedToDevice() { return nattachedToDevice(address()); }
    /** the {@link XrPosef} for offset of the camera from the device that the camera is attached to */
    public XrPosef relativePose() { return nrelativePose(address()); }

    /** Sets the specified value to the {@link #lastChangeTime} field. */
    public XrExternalCameraExtrinsicsOCULUS lastChangeTime(@NativeType("XrTime") long value) { nlastChangeTime(address(), value); return this; }
    /** Sets the specified value to the {@link #cameraStatusFlags} field. */
    public XrExternalCameraExtrinsicsOCULUS cameraStatusFlags(@NativeType("XrExternalCameraStatusFlagsOCULUS") long value) { ncameraStatusFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #attachedToDevice} field. */
    public XrExternalCameraExtrinsicsOCULUS attachedToDevice(@NativeType("XrExternalCameraAttachedToDeviceOCULUS") int value) { nattachedToDevice(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@link #relativePose} field. */
    public XrExternalCameraExtrinsicsOCULUS relativePose(XrPosef value) { nrelativePose(address(), value); return this; }
    /** Passes the {@link #relativePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrExternalCameraExtrinsicsOCULUS relativePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(relativePose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrExternalCameraExtrinsicsOCULUS set(
        long lastChangeTime,
        long cameraStatusFlags,
        int attachedToDevice,
        XrPosef relativePose
    ) {
        lastChangeTime(lastChangeTime);
        cameraStatusFlags(cameraStatusFlags);
        attachedToDevice(attachedToDevice);
        relativePose(relativePose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExternalCameraExtrinsicsOCULUS set(XrExternalCameraExtrinsicsOCULUS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExternalCameraExtrinsicsOCULUS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExternalCameraExtrinsicsOCULUS malloc() {
        return new XrExternalCameraExtrinsicsOCULUS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExternalCameraExtrinsicsOCULUS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExternalCameraExtrinsicsOCULUS calloc() {
        return new XrExternalCameraExtrinsicsOCULUS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExternalCameraExtrinsicsOCULUS} instance allocated with {@link BufferUtils}. */
    public static XrExternalCameraExtrinsicsOCULUS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExternalCameraExtrinsicsOCULUS(memAddress(container), container);
    }

    /** Returns a new {@code XrExternalCameraExtrinsicsOCULUS} instance for the specified memory address. */
    public static XrExternalCameraExtrinsicsOCULUS create(long address) {
        return new XrExternalCameraExtrinsicsOCULUS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExternalCameraExtrinsicsOCULUS createSafe(long address) {
        return address == NULL ? null : new XrExternalCameraExtrinsicsOCULUS(address, null);
    }

    /**
     * Returns a new {@link XrExternalCameraExtrinsicsOCULUS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraExtrinsicsOCULUS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraExtrinsicsOCULUS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraExtrinsicsOCULUS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraExtrinsicsOCULUS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraExtrinsicsOCULUS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExternalCameraExtrinsicsOCULUS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraExtrinsicsOCULUS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExternalCameraExtrinsicsOCULUS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExternalCameraExtrinsicsOCULUS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExternalCameraExtrinsicsOCULUS malloc(MemoryStack stack) {
        return new XrExternalCameraExtrinsicsOCULUS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExternalCameraExtrinsicsOCULUS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExternalCameraExtrinsicsOCULUS calloc(MemoryStack stack) {
        return new XrExternalCameraExtrinsicsOCULUS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExternalCameraExtrinsicsOCULUS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraExtrinsicsOCULUS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExternalCameraExtrinsicsOCULUS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExternalCameraExtrinsicsOCULUS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #lastChangeTime}. */
    public static long nlastChangeTime(long struct) { return UNSAFE.getLong(null, struct + XrExternalCameraExtrinsicsOCULUS.LASTCHANGETIME); }
    /** Unsafe version of {@link #cameraStatusFlags}. */
    public static long ncameraStatusFlags(long struct) { return UNSAFE.getLong(null, struct + XrExternalCameraExtrinsicsOCULUS.CAMERASTATUSFLAGS); }
    /** Unsafe version of {@link #attachedToDevice}. */
    public static int nattachedToDevice(long struct) { return UNSAFE.getInt(null, struct + XrExternalCameraExtrinsicsOCULUS.ATTACHEDTODEVICE); }
    /** Unsafe version of {@link #relativePose}. */
    public static XrPosef nrelativePose(long struct) { return XrPosef.create(struct + XrExternalCameraExtrinsicsOCULUS.RELATIVEPOSE); }

    /** Unsafe version of {@link #lastChangeTime(long) lastChangeTime}. */
    public static void nlastChangeTime(long struct, long value) { UNSAFE.putLong(null, struct + XrExternalCameraExtrinsicsOCULUS.LASTCHANGETIME, value); }
    /** Unsafe version of {@link #cameraStatusFlags(long) cameraStatusFlags}. */
    public static void ncameraStatusFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrExternalCameraExtrinsicsOCULUS.CAMERASTATUSFLAGS, value); }
    /** Unsafe version of {@link #attachedToDevice(int) attachedToDevice}. */
    public static void nattachedToDevice(long struct, int value) { UNSAFE.putInt(null, struct + XrExternalCameraExtrinsicsOCULUS.ATTACHEDTODEVICE, value); }
    /** Unsafe version of {@link #relativePose(XrPosef) relativePose}. */
    public static void nrelativePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrExternalCameraExtrinsicsOCULUS.RELATIVEPOSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrExternalCameraExtrinsicsOCULUS} structs. */
    public static class Buffer extends StructBuffer<XrExternalCameraExtrinsicsOCULUS, Buffer> implements NativeResource {

        private static final XrExternalCameraExtrinsicsOCULUS ELEMENT_FACTORY = XrExternalCameraExtrinsicsOCULUS.create(-1L);

        /**
         * Creates a new {@code XrExternalCameraExtrinsicsOCULUS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExternalCameraExtrinsicsOCULUS#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExternalCameraExtrinsicsOCULUS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExternalCameraExtrinsicsOCULUS#lastChangeTime} field. */
        @NativeType("XrTime")
        public long lastChangeTime() { return XrExternalCameraExtrinsicsOCULUS.nlastChangeTime(address()); }
        /** @return the value of the {@link XrExternalCameraExtrinsicsOCULUS#cameraStatusFlags} field. */
        @NativeType("XrExternalCameraStatusFlagsOCULUS")
        public long cameraStatusFlags() { return XrExternalCameraExtrinsicsOCULUS.ncameraStatusFlags(address()); }
        /** @return the value of the {@link XrExternalCameraExtrinsicsOCULUS#attachedToDevice} field. */
        @NativeType("XrExternalCameraAttachedToDeviceOCULUS")
        public int attachedToDevice() { return XrExternalCameraExtrinsicsOCULUS.nattachedToDevice(address()); }
        /** @return a {@link XrPosef} view of the {@link XrExternalCameraExtrinsicsOCULUS#relativePose} field. */
        public XrPosef relativePose() { return XrExternalCameraExtrinsicsOCULUS.nrelativePose(address()); }

        /** Sets the specified value to the {@link XrExternalCameraExtrinsicsOCULUS#lastChangeTime} field. */
        public XrExternalCameraExtrinsicsOCULUS.Buffer lastChangeTime(@NativeType("XrTime") long value) { XrExternalCameraExtrinsicsOCULUS.nlastChangeTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrExternalCameraExtrinsicsOCULUS#cameraStatusFlags} field. */
        public XrExternalCameraExtrinsicsOCULUS.Buffer cameraStatusFlags(@NativeType("XrExternalCameraStatusFlagsOCULUS") long value) { XrExternalCameraExtrinsicsOCULUS.ncameraStatusFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrExternalCameraExtrinsicsOCULUS#attachedToDevice} field. */
        public XrExternalCameraExtrinsicsOCULUS.Buffer attachedToDevice(@NativeType("XrExternalCameraAttachedToDeviceOCULUS") int value) { XrExternalCameraExtrinsicsOCULUS.nattachedToDevice(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@link XrExternalCameraExtrinsicsOCULUS#relativePose} field. */
        public XrExternalCameraExtrinsicsOCULUS.Buffer relativePose(XrPosef value) { XrExternalCameraExtrinsicsOCULUS.nrelativePose(address(), value); return this; }
        /** Passes the {@link XrExternalCameraExtrinsicsOCULUS#relativePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrExternalCameraExtrinsicsOCULUS.Buffer relativePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(relativePose()); return this; }

    }

}