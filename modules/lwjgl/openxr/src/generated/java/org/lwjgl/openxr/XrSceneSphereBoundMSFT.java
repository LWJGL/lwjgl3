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
 * Describe a scene sphere bounds.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code radius} is not a finite positive value.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneSphereBoundMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneBoundsMSFT}, {@link XrVector3f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneSphereBoundMSFT {
 *     {@link XrVector3f XrVector3f} {@link #center};
 *     float {@link #radius};
 * }</code></pre>
 */
public class XrSceneSphereBoundMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CENTER,
        RADIUS;

    static {
        Layout layout = __struct(
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CENTER = layout.offsetof(0);
        RADIUS = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSceneSphereBoundMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneSphereBoundMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrVector3f} representing the center of the sphere bound within the reference frame of the corresponding {@link XrSceneBoundsMSFT}{@code ::space}. */
    public XrVector3f center() { return ncenter(address()); }
    /** the finite positive radius of the sphere bound. */
    public float radius() { return nradius(address()); }

    /** Copies the specified {@link XrVector3f} to the {@link #center} field. */
    public XrSceneSphereBoundMSFT center(XrVector3f value) { ncenter(address(), value); return this; }
    /** Passes the {@link #center} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneSphereBoundMSFT center(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(center()); return this; }
    /** Sets the specified value to the {@link #radius} field. */
    public XrSceneSphereBoundMSFT radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneSphereBoundMSFT set(
        XrVector3f center,
        float radius
    ) {
        center(center);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneSphereBoundMSFT set(XrSceneSphereBoundMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneSphereBoundMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneSphereBoundMSFT malloc() {
        return wrap(XrSceneSphereBoundMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneSphereBoundMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneSphereBoundMSFT calloc() {
        return wrap(XrSceneSphereBoundMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneSphereBoundMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneSphereBoundMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneSphereBoundMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneSphereBoundMSFT} instance for the specified memory address. */
    public static XrSceneSphereBoundMSFT create(long address) {
        return wrap(XrSceneSphereBoundMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneSphereBoundMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneSphereBoundMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneSphereBoundMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSphereBoundMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneSphereBoundMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSphereBoundMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneSphereBoundMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneSphereBoundMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneSphereBoundMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneSphereBoundMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneSphereBoundMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneSphereBoundMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneSphereBoundMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneSphereBoundMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneSphereBoundMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneSphereBoundMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneSphereBoundMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneSphereBoundMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneSphereBoundMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneSphereBoundMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneSphereBoundMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #center}. */
    public static XrVector3f ncenter(long struct) { return XrVector3f.create(struct + XrSceneSphereBoundMSFT.CENTER); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return UNSAFE.getFloat(null, struct + XrSceneSphereBoundMSFT.RADIUS); }

    /** Unsafe version of {@link #center(XrVector3f) center}. */
    public static void ncenter(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSceneSphereBoundMSFT.CENTER, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { UNSAFE.putFloat(null, struct + XrSceneSphereBoundMSFT.RADIUS, value); }

    // -----------------------------------

    /** An array of {@link XrSceneSphereBoundMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneSphereBoundMSFT, Buffer> implements NativeResource {

        private static final XrSceneSphereBoundMSFT ELEMENT_FACTORY = XrSceneSphereBoundMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneSphereBoundMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneSphereBoundMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneSphereBoundMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrVector3f} view of the {@link XrSceneSphereBoundMSFT#center} field. */
        public XrVector3f center() { return XrSceneSphereBoundMSFT.ncenter(address()); }
        /** @return the value of the {@link XrSceneSphereBoundMSFT#radius} field. */
        public float radius() { return XrSceneSphereBoundMSFT.nradius(address()); }

        /** Copies the specified {@link XrVector3f} to the {@link XrSceneSphereBoundMSFT#center} field. */
        public XrSceneSphereBoundMSFT.Buffer center(XrVector3f value) { XrSceneSphereBoundMSFT.ncenter(address(), value); return this; }
        /** Passes the {@link XrSceneSphereBoundMSFT#center} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneSphereBoundMSFT.Buffer center(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(center()); return this; }
        /** Sets the specified value to the {@link XrSceneSphereBoundMSFT#radius} field. */
        public XrSceneSphereBoundMSFT.Buffer radius(float value) { XrSceneSphereBoundMSFT.nradius(address(), value); return this; }

    }

}