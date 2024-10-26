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
 * Describe a scene frustum.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code farZ} is less than or equal to zero.</p>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code nearZ} is less than zero.</p>
 * 
 * <p>See {@link XrFovf} for validity requirements on {@code fov}.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFovf}, {@link XrPosef}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFrustumf {
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrFovf XrFovf} {@link #fov};
 *     float {@link #nearZ};
 *     float {@link #farZ};
 * }</code></pre>
 */
public class XrFrustumf extends Struct<XrFrustumf> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSE,
        FOV,
        NEARZ,
        FARZ;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrFovf.SIZEOF, XrFovf.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSE = layout.offsetof(0);
        FOV = layout.offsetof(1);
        NEARZ = layout.offsetof(2);
        FARZ = layout.offsetof(3);
    }

    protected XrFrustumf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrustumf create(long address, @Nullable ByteBuffer container) {
        return new XrFrustumf(address, container);
    }

    /**
     * Creates a {@code XrFrustumf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrustumf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrPosef} defining the position and orientation of the tip of the frustum within the reference frame of the corresponding {@code XrSpace}. */
    public XrPosef pose() { return npose(address()); }
    /** an {@link XrFovf} for the four sides of the frustum where {@code angleLeft} and {@code angleRight} are along the X axis and {@code angleUp} and {@code angleDown} are along the Y axis of the frustum space. */
    public XrFovf fov() { return nfov(address()); }
    /** the positive distance of the near plane of the frustum bound along the -Z direction of the frustum space. */
    public float nearZ() { return nnearZ(address()); }
    /** the positive distance of the far plane of the frustum bound along the -Z direction of the frustum space. */
    public float farZ() { return nfarZ(address()); }

    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrFrustumf pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrustumf pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrFovf} to the {@link #fov} field. */
    public XrFrustumf fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@link #fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFrustumf fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
    /** Sets the specified value to the {@link #nearZ} field. */
    public XrFrustumf nearZ(float value) { nnearZ(address(), value); return this; }
    /** Sets the specified value to the {@link #farZ} field. */
    public XrFrustumf farZ(float value) { nfarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFrustumf set(
        XrPosef pose,
        XrFovf fov,
        float nearZ,
        float farZ
    ) {
        pose(pose);
        fov(fov);
        nearZ(nearZ);
        farZ(farZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFrustumf set(XrFrustumf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrustumf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrustumf malloc() {
        return new XrFrustumf(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrustumf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrustumf calloc() {
        return new XrFrustumf(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrustumf} instance allocated with {@link BufferUtils}. */
    public static XrFrustumf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrustumf(memAddress(container), container);
    }

    /** Returns a new {@code XrFrustumf} instance for the specified memory address. */
    public static XrFrustumf create(long address) {
        return new XrFrustumf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFrustumf createSafe(long address) {
        return address == NULL ? null : new XrFrustumf(address, null);
    }

    /**
     * Returns a new {@link XrFrustumf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrustumf.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrustumf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrustumf.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrustumf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrustumf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrustumf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrustumf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFrustumf.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrustumf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrustumf malloc(MemoryStack stack) {
        return new XrFrustumf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrustumf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrustumf calloc(MemoryStack stack) {
        return new XrFrustumf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrustumf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrustumf.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrustumf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrustumf.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrFrustumf.POSE); }
    /** Unsafe version of {@link #fov}. */
    public static XrFovf nfov(long struct) { return XrFovf.create(struct + XrFrustumf.FOV); }
    /** Unsafe version of {@link #nearZ}. */
    public static float nnearZ(long struct) { return memGetFloat(struct + XrFrustumf.NEARZ); }
    /** Unsafe version of {@link #farZ}. */
    public static float nfarZ(long struct) { return memGetFloat(struct + XrFrustumf.FARZ); }

    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrFrustumf.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #fov(XrFovf) fov}. */
    public static void nfov(long struct, XrFovf value) { memCopy(value.address(), struct + XrFrustumf.FOV, XrFovf.SIZEOF); }
    /** Unsafe version of {@link #nearZ(float) nearZ}. */
    public static void nnearZ(long struct, float value) { memPutFloat(struct + XrFrustumf.NEARZ, value); }
    /** Unsafe version of {@link #farZ(float) farZ}. */
    public static void nfarZ(long struct, float value) { memPutFloat(struct + XrFrustumf.FARZ, value); }

    // -----------------------------------

    /** An array of {@link XrFrustumf} structs. */
    public static class Buffer extends StructBuffer<XrFrustumf, Buffer> implements NativeResource {

        private static final XrFrustumf ELEMENT_FACTORY = XrFrustumf.create(-1L);

        /**
         * Creates a new {@code XrFrustumf.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrustumf#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFrustumf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@link XrFrustumf#pose} field. */
        public XrPosef pose() { return XrFrustumf.npose(address()); }
        /** @return a {@link XrFovf} view of the {@link XrFrustumf#fov} field. */
        public XrFovf fov() { return XrFrustumf.nfov(address()); }
        /** @return the value of the {@link XrFrustumf#nearZ} field. */
        public float nearZ() { return XrFrustumf.nnearZ(address()); }
        /** @return the value of the {@link XrFrustumf#farZ} field. */
        public float farZ() { return XrFrustumf.nfarZ(address()); }

        /** Copies the specified {@link XrPosef} to the {@link XrFrustumf#pose} field. */
        public XrFrustumf.Buffer pose(XrPosef value) { XrFrustumf.npose(address(), value); return this; }
        /** Passes the {@link XrFrustumf#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrustumf.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrFovf} to the {@link XrFrustumf#fov} field. */
        public XrFrustumf.Buffer fov(XrFovf value) { XrFrustumf.nfov(address(), value); return this; }
        /** Passes the {@link XrFrustumf#fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFrustumf.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
        /** Sets the specified value to the {@link XrFrustumf#nearZ} field. */
        public XrFrustumf.Buffer nearZ(float value) { XrFrustumf.nnearZ(address(), value); return this; }
        /** Sets the specified value to the {@link XrFrustumf#farZ} field. */
        public XrFrustumf.Buffer farZ(float value) { XrFrustumf.nfarZ(address(), value); return this; }

    }

}