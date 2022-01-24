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
 * Location and orientation in a space.
 * 
 * <h5>Description</h5>
 * 
 * <p>A runtime <b>must</b> return {@link XR10#XR_ERROR_POSE_INVALID ERROR_POSE_INVALID} if the {@code orientation} norm deviates by more than 1% from unit length.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActionSpaceCreateInfo}, {@link XrCompositionLayerCylinderKHR}, {@link XrCompositionLayerEquirect2KHR}, {@link XrCompositionLayerEquirectKHR}, {@link XrCompositionLayerProjectionView}, {@link XrCompositionLayerQuad}, {@link XrCompositionLayerSpaceWarpInfoFB}, {@link XrControllerModelNodeStateMSFT}, {@link XrEventDataReferenceSpaceChangePending}, {@link XrGeometryInstanceCreateInfoFB}, {@link XrGeometryInstanceTransformFB}, {@link XrHandJointLocationEXT}, {@link XrHandMeshSpaceCreateInfoMSFT}, {@link XrHandTrackingAimStateFB}, {@link XrHandTrackingMeshFB}, {@link XrMarkerSpaceCreateInfoVARJO}, {@link XrQuaternionf}, {@link XrReferenceSpaceCreateInfo}, {@link XrSceneComponentLocationMSFT}, {@link XrSceneFrustumBoundMSFT}, {@link XrSceneOrientedBoxBoundMSFT}, {@link XrSpaceLocation}, {@link XrSpatialAnchorCreateInfoMSFT}, {@link XrSpatialAnchorSpaceCreateInfoMSFT}, {@link XrSpatialGraphNodeSpaceCreateInfoMSFT}, {@link XrVector2f}, {@link XrVector3f}, {@link XrVector4f}, {@link XrView}, {@link EXTConformanceAutomation#xrSetInputDeviceLocationEXT SetInputDeviceLocationEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPosef {
 *     {@link XrQuaternionf XrQuaternionf} {@link #orientation};
 *     {@link XrVector3f XrVector3f} {@link #position$ position};
 * }</code></pre>
 */
public class XrPosef extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIENTATION,
        POSITION;

    static {
        Layout layout = __struct(
            __member(XrQuaternionf.SIZEOF, XrQuaternionf.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIENTATION = layout.offsetof(0);
        POSITION = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrPosef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPosef(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrQuaternionf} representing the orientation within a space. */
    public XrQuaternionf orientation() { return norientation(address()); }
    /** an {@link XrVector3f} representing position within a space. */
    public XrVector3f position$() { return nposition$(address()); }

    /** Copies the specified {@link XrQuaternionf} to the {@link #orientation} field. */
    public XrPosef orientation(XrQuaternionf value) { norientation(address(), value); return this; }
    /** Passes the {@link #orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPosef orientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(orientation()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #position$} field. */
    public XrPosef position$(XrVector3f value) { nposition$(address(), value); return this; }
    /** Passes the {@link #position$} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPosef position$(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(position$()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPosef set(
        XrQuaternionf orientation,
        XrVector3f position$
    ) {
        orientation(orientation);
        position$(position$);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPosef set(XrPosef src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPosef} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPosef malloc() {
        return wrap(XrPosef.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrPosef} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPosef calloc() {
        return wrap(XrPosef.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrPosef} instance allocated with {@link BufferUtils}. */
    public static XrPosef create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrPosef.class, memAddress(container), container);
    }

    /** Returns a new {@code XrPosef} instance for the specified memory address. */
    public static XrPosef create(long address) {
        return wrap(XrPosef.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPosef createSafe(long address) {
        return address == NULL ? null : wrap(XrPosef.class, address);
    }

    /**
     * Returns a new {@link XrPosef.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPosef.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPosef.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPosef.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPosef.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPosef.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrPosef.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPosef.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPosef.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrPosef} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPosef malloc(MemoryStack stack) {
        return wrap(XrPosef.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrPosef} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPosef calloc(MemoryStack stack) {
        return wrap(XrPosef.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrPosef.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPosef.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPosef.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPosef.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #orientation}. */
    public static XrQuaternionf norientation(long struct) { return XrQuaternionf.create(struct + XrPosef.ORIENTATION); }
    /** Unsafe version of {@link #position$}. */
    public static XrVector3f nposition$(long struct) { return XrVector3f.create(struct + XrPosef.POSITION); }

    /** Unsafe version of {@link #orientation(XrQuaternionf) orientation}. */
    public static void norientation(long struct, XrQuaternionf value) { memCopy(value.address(), struct + XrPosef.ORIENTATION, XrQuaternionf.SIZEOF); }
    /** Unsafe version of {@link #position$(XrVector3f) position$}. */
    public static void nposition$(long struct, XrVector3f value) { memCopy(value.address(), struct + XrPosef.POSITION, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrPosef} structs. */
    public static class Buffer extends StructBuffer<XrPosef, Buffer> implements NativeResource {

        private static final XrPosef ELEMENT_FACTORY = XrPosef.create(-1L);

        /**
         * Creates a new {@code XrPosef.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPosef#SIZEOF}, and its mark will be undefined.
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
        protected XrPosef getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrQuaternionf} view of the {@link XrPosef#orientation} field. */
        public XrQuaternionf orientation() { return XrPosef.norientation(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrPosef#position$} field. */
        public XrVector3f position$() { return XrPosef.nposition$(address()); }

        /** Copies the specified {@link XrQuaternionf} to the {@link XrPosef#orientation} field. */
        public XrPosef.Buffer orientation(XrQuaternionf value) { XrPosef.norientation(address(), value); return this; }
        /** Passes the {@link XrPosef#orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPosef.Buffer orientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(orientation()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrPosef#position$} field. */
        public XrPosef.Buffer position$(XrVector3f value) { XrPosef.nposition$(address(), value); return this; }
        /** Passes the {@link XrPosef#position$} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPosef.Buffer position$(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(position$()); return this; }

    }

}