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
 * Two-dimensional vector.
 * 
 * <h5>Description</h5>
 * 
 * <p>If used to represent physical distances (rather than e.g. normalized direction) and not otherwise specified, values <b>must</b> be in meters.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActionStateVector2f}, {@link XrBoundary2DFB}, {@link XrCompositionLayerEquirectKHR}, {@link XrFoveationConfigurationHTC}, {@link XrFoveationEyeTrackedStateMETA}, {@link XrHandTrackingMeshFB}, {@link XrPlaneDetectorPolygonBufferEXT}, {@link XrPosef}, {@link XrQuaternionf}, {@link XrVector3f}, {@link XrVector4f}, {@link XrVisibilityMaskKHR}, {@link EXTConformanceAutomation#xrSetInputDeviceStateVector2fEXT SetInputDeviceStateVector2fEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVector2f {
 *     float {@link #x};
 *     float {@link #y};
 * }</code></pre>
 */
public class XrVector2f extends Struct<XrVector2f> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    protected XrVector2f(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVector2f create(long address, @Nullable ByteBuffer container) {
        return new XrVector2f(address, container);
    }

    /**
     * Creates a {@code XrVector2f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVector2f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x coordinate of the vector. */
    public float x() { return nx(address()); }
    /** the y coordinate of the vector. */
    public float y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public XrVector2f x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XrVector2f y(float value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVector2f set(
        float x,
        float y
    ) {
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVector2f set(XrVector2f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVector2f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVector2f malloc() {
        return new XrVector2f(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVector2f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVector2f calloc() {
        return new XrVector2f(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVector2f} instance allocated with {@link BufferUtils}. */
    public static XrVector2f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVector2f(memAddress(container), container);
    }

    /** Returns a new {@code XrVector2f} instance for the specified memory address. */
    public static XrVector2f create(long address) {
        return new XrVector2f(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVector2f createSafe(long address) {
        return address == NULL ? null : new XrVector2f(address, null);
    }

    /**
     * Returns a new {@link XrVector2f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector2f.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVector2f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector2f.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVector2f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector2f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVector2f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVector2f.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVector2f.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVector2f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVector2f malloc(MemoryStack stack) {
        return new XrVector2f(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVector2f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVector2f calloc(MemoryStack stack) {
        return new XrVector2f(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVector2f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVector2f.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVector2f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVector2f.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + XrVector2f.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + XrVector2f.Y); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + XrVector2f.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + XrVector2f.Y, value); }

    // -----------------------------------

    /** An array of {@link XrVector2f} structs. */
    public static class Buffer extends StructBuffer<XrVector2f, Buffer> implements NativeResource {

        private static final XrVector2f ELEMENT_FACTORY = XrVector2f.create(-1L);

        /**
         * Creates a new {@code XrVector2f.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVector2f#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVector2f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVector2f#x} field. */
        public float x() { return XrVector2f.nx(address()); }
        /** @return the value of the {@link XrVector2f#y} field. */
        public float y() { return XrVector2f.ny(address()); }

        /** Sets the specified value to the {@link XrVector2f#x} field. */
        public XrVector2f.Buffer x(float value) { XrVector2f.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XrVector2f#y} field. */
        public XrVector2f.Buffer y(float value) { XrVector2f.ny(address(), value); return this; }

    }

}