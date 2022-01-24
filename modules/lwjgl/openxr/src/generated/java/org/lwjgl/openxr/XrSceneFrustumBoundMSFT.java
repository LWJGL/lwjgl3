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
 * Describe a scene frustum bounds.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code farDistance} is less than or equal to zero. The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if the {@code fov} angles are not between between <code>-π/2</code> and <code>π/2</code> exclusively.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneFrustumBoundMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFovf}, {@link XrPosef}, {@link XrSceneBoundsMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneFrustumBoundMSFT {
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrFovf XrFovf} {@link #fov};
 *     float {@link #farDistance};
 * }</code></pre>
 */
public class XrSceneFrustumBoundMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSE,
        FOV,
        FARDISTANCE;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSE = layout.offsetof(0);
        FOV = layout.offsetof(1);
        FARDISTANCE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSceneFrustumBoundMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneFrustumBoundMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrPosef} defining the position and orientation of the tip of the frustum bound within the reference frame of the corresponding {@link XrSceneBoundsMSFT}{@code ::space}. */
    public XrPosef pose() { return npose(address()); }
    /** an {@link XrFovf} for the four sides of the frustum bound where {@code angleLeft} and {@code angleRight} are along the X axis and {@code angleUp} and {@code angleDown} are along the Y axis of the frustum bound space. */
    public XrFovf fov() { return nfov(address()); }
    /** the positive distance of the far plane of the frustum bound along the -Z direction of the frustum bound space. */
    public float farDistance() { return nfarDistance(address()); }

    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrSceneFrustumBoundMSFT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneFrustumBoundMSFT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrFovf} to the {@link #fov} field. */
    public XrSceneFrustumBoundMSFT fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@link #fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneFrustumBoundMSFT fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
    /** Sets the specified value to the {@link #farDistance} field. */
    public XrSceneFrustumBoundMSFT farDistance(float value) { nfarDistance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneFrustumBoundMSFT set(
        XrPosef pose,
        XrFovf fov,
        float farDistance
    ) {
        pose(pose);
        fov(fov);
        farDistance(farDistance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneFrustumBoundMSFT set(XrSceneFrustumBoundMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneFrustumBoundMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneFrustumBoundMSFT malloc() {
        return wrap(XrSceneFrustumBoundMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneFrustumBoundMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneFrustumBoundMSFT calloc() {
        return wrap(XrSceneFrustumBoundMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneFrustumBoundMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneFrustumBoundMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneFrustumBoundMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneFrustumBoundMSFT} instance for the specified memory address. */
    public static XrSceneFrustumBoundMSFT create(long address) {
        return wrap(XrSceneFrustumBoundMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneFrustumBoundMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneFrustumBoundMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneFrustumBoundMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneFrustumBoundMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneFrustumBoundMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneFrustumBoundMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneFrustumBoundMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneFrustumBoundMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneFrustumBoundMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneFrustumBoundMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneFrustumBoundMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneFrustumBoundMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneFrustumBoundMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneFrustumBoundMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneFrustumBoundMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneFrustumBoundMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneFrustumBoundMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneFrustumBoundMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneFrustumBoundMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneFrustumBoundMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneFrustumBoundMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSceneFrustumBoundMSFT.POSE); }
    /** Unsafe version of {@link #fov}. */
    public static XrFovf nfov(long struct) { return XrFovf.create(struct + XrSceneFrustumBoundMSFT.FOV); }
    /** Unsafe version of {@link #farDistance}. */
    public static float nfarDistance(long struct) { return UNSAFE.getFloat(null, struct + XrSceneFrustumBoundMSFT.FARDISTANCE); }

    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSceneFrustumBoundMSFT.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #fov(XrFovf) fov}. */
    public static void nfov(long struct, XrFovf value) { memCopy(value.address(), struct + XrSceneFrustumBoundMSFT.FOV, XrFovf.SIZEOF); }
    /** Unsafe version of {@link #farDistance(float) farDistance}. */
    public static void nfarDistance(long struct, float value) { UNSAFE.putFloat(null, struct + XrSceneFrustumBoundMSFT.FARDISTANCE, value); }

    // -----------------------------------

    /** An array of {@link XrSceneFrustumBoundMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneFrustumBoundMSFT, Buffer> implements NativeResource {

        private static final XrSceneFrustumBoundMSFT ELEMENT_FACTORY = XrSceneFrustumBoundMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneFrustumBoundMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneFrustumBoundMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneFrustumBoundMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@link XrSceneFrustumBoundMSFT#pose} field. */
        public XrPosef pose() { return XrSceneFrustumBoundMSFT.npose(address()); }
        /** @return a {@link XrFovf} view of the {@link XrSceneFrustumBoundMSFT#fov} field. */
        public XrFovf fov() { return XrSceneFrustumBoundMSFT.nfov(address()); }
        /** @return the value of the {@link XrSceneFrustumBoundMSFT#farDistance} field. */
        public float farDistance() { return XrSceneFrustumBoundMSFT.nfarDistance(address()); }

        /** Copies the specified {@link XrPosef} to the {@link XrSceneFrustumBoundMSFT#pose} field. */
        public XrSceneFrustumBoundMSFT.Buffer pose(XrPosef value) { XrSceneFrustumBoundMSFT.npose(address(), value); return this; }
        /** Passes the {@link XrSceneFrustumBoundMSFT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneFrustumBoundMSFT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrFovf} to the {@link XrSceneFrustumBoundMSFT#fov} field. */
        public XrSceneFrustumBoundMSFT.Buffer fov(XrFovf value) { XrSceneFrustumBoundMSFT.nfov(address(), value); return this; }
        /** Passes the {@link XrSceneFrustumBoundMSFT#fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneFrustumBoundMSFT.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
        /** Sets the specified value to the {@link XrSceneFrustumBoundMSFT#farDistance} field. */
        public XrSceneFrustumBoundMSFT.Buffer farDistance(float value) { XrSceneFrustumBoundMSFT.nfarDistance(address(), value); return this; }

    }

}