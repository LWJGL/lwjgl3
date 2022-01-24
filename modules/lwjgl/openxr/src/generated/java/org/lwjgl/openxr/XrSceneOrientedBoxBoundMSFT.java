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
 * Describe a scene oriented box bounds.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if any component of {@code extents} is not finite or less than or equal to zero.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneOrientedBoxBoundMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPosef}, {@link XrSceneBoundsMSFT}, {@link XrVector3f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneOrientedBoxBoundMSFT {
 *     {@link XrPosef XrPosef} {@link #pose};
 *     {@link XrVector3f XrVector3f} {@link #extents};
 * }</code></pre>
 */
public class XrSceneOrientedBoxBoundMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSE,
        EXTENTS;

    static {
        Layout layout = __struct(
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSE = layout.offsetof(0);
        EXTENTS = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSceneOrientedBoxBoundMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneOrientedBoxBoundMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@link XrPosef} defining the center position and orientation of the oriented bounding box bound within the reference frame of the corresponding {@link XrSceneBoundsMSFT}{@code ::space}. */
    public XrPosef pose() { return npose(address()); }
    /** an {@link XrVector3f} defining the edge-to-edge length of the box along each dimension with {@code pose} as the center. */
    public XrVector3f extents() { return nextents(address()); }

    /** Copies the specified {@link XrPosef} to the {@link #pose} field. */
    public XrSceneOrientedBoxBoundMSFT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@link #pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneOrientedBoxBoundMSFT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@link #extents} field. */
    public XrSceneOrientedBoxBoundMSFT extents(XrVector3f value) { nextents(address(), value); return this; }
    /** Passes the {@link #extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSceneOrientedBoxBoundMSFT extents(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(extents()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneOrientedBoxBoundMSFT set(
        XrPosef pose,
        XrVector3f extents
    ) {
        pose(pose);
        extents(extents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneOrientedBoxBoundMSFT set(XrSceneOrientedBoxBoundMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneOrientedBoxBoundMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneOrientedBoxBoundMSFT malloc() {
        return wrap(XrSceneOrientedBoxBoundMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneOrientedBoxBoundMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneOrientedBoxBoundMSFT calloc() {
        return wrap(XrSceneOrientedBoxBoundMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneOrientedBoxBoundMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneOrientedBoxBoundMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneOrientedBoxBoundMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneOrientedBoxBoundMSFT} instance for the specified memory address. */
    public static XrSceneOrientedBoxBoundMSFT create(long address) {
        return wrap(XrSceneOrientedBoxBoundMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneOrientedBoxBoundMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneOrientedBoxBoundMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneOrientedBoxBoundMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneOrientedBoxBoundMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneOrientedBoxBoundMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneOrientedBoxBoundMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneOrientedBoxBoundMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneOrientedBoxBoundMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneOrientedBoxBoundMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneOrientedBoxBoundMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneOrientedBoxBoundMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneOrientedBoxBoundMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneOrientedBoxBoundMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneOrientedBoxBoundMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneOrientedBoxBoundMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneOrientedBoxBoundMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneOrientedBoxBoundMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneOrientedBoxBoundMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneOrientedBoxBoundMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneOrientedBoxBoundMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneOrientedBoxBoundMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSceneOrientedBoxBoundMSFT.POSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrVector3f nextents(long struct) { return XrVector3f.create(struct + XrSceneOrientedBoxBoundMSFT.EXTENTS); }

    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSceneOrientedBoxBoundMSFT.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrVector3f) extents}. */
    public static void nextents(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSceneOrientedBoxBoundMSFT.EXTENTS, XrVector3f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSceneOrientedBoxBoundMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneOrientedBoxBoundMSFT, Buffer> implements NativeResource {

        private static final XrSceneOrientedBoxBoundMSFT ELEMENT_FACTORY = XrSceneOrientedBoxBoundMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneOrientedBoxBoundMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneOrientedBoxBoundMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneOrientedBoxBoundMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrPosef} view of the {@link XrSceneOrientedBoxBoundMSFT#pose} field. */
        public XrPosef pose() { return XrSceneOrientedBoxBoundMSFT.npose(address()); }
        /** @return a {@link XrVector3f} view of the {@link XrSceneOrientedBoxBoundMSFT#extents} field. */
        public XrVector3f extents() { return XrSceneOrientedBoxBoundMSFT.nextents(address()); }

        /** Copies the specified {@link XrPosef} to the {@link XrSceneOrientedBoxBoundMSFT#pose} field. */
        public XrSceneOrientedBoxBoundMSFT.Buffer pose(XrPosef value) { XrSceneOrientedBoxBoundMSFT.npose(address(), value); return this; }
        /** Passes the {@link XrSceneOrientedBoxBoundMSFT#pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneOrientedBoxBoundMSFT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@link XrSceneOrientedBoxBoundMSFT#extents} field. */
        public XrSceneOrientedBoxBoundMSFT.Buffer extents(XrVector3f value) { XrSceneOrientedBoxBoundMSFT.nextents(address(), value); return this; }
        /** Passes the {@link XrSceneOrientedBoxBoundMSFT#extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSceneOrientedBoxBoundMSFT.Buffer extents(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(extents()); return this; }

    }

}