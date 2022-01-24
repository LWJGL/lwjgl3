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
 * Tracking-related properties of a particular system.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemGraphicsProperties}, {@link XrSystemProperties}, {@link XR10#xrGetSystem GetSystem}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemTrackingProperties {
 *     XrBool32 {@link #orientationTracking};
 *     XrBool32 {@link #positionTracking};
 * }</code></pre>
 */
public class XrSystemTrackingProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIENTATIONTRACKING,
        POSITIONTRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIENTATIONTRACKING = layout.offsetof(0);
        POSITIONTRACKING = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSystemTrackingProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemTrackingProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** set to {@link XR10#XR_TRUE TRUE} to indicate the system supports orientational tracking of the view pose(s), {@link XR10#XR_FALSE FALSE} otherwise. */
    @NativeType("XrBool32")
    public boolean orientationTracking() { return norientationTracking(address()) != 0; }
    /** set to {@link XR10#XR_TRUE TRUE} to indicate the system supports positional tracking of the view pose(s), {@link XR10#XR_FALSE FALSE} otherwise. */
    @NativeType("XrBool32")
    public boolean positionTracking() { return npositionTracking(address()) != 0; }

    /** Sets the specified value to the {@link #orientationTracking} field. */
    public XrSystemTrackingProperties orientationTracking(@NativeType("XrBool32") boolean value) { norientationTracking(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #positionTracking} field. */
    public XrSystemTrackingProperties positionTracking(@NativeType("XrBool32") boolean value) { npositionTracking(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemTrackingProperties set(
        boolean orientationTracking,
        boolean positionTracking
    ) {
        orientationTracking(orientationTracking);
        positionTracking(positionTracking);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemTrackingProperties set(XrSystemTrackingProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemTrackingProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemTrackingProperties malloc() {
        return wrap(XrSystemTrackingProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemTrackingProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemTrackingProperties calloc() {
        return wrap(XrSystemTrackingProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemTrackingProperties} instance allocated with {@link BufferUtils}. */
    public static XrSystemTrackingProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemTrackingProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemTrackingProperties} instance for the specified memory address. */
    public static XrSystemTrackingProperties create(long address) {
        return wrap(XrSystemTrackingProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemTrackingProperties createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemTrackingProperties.class, address);
    }

    /**
     * Returns a new {@link XrSystemTrackingProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackingProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemTrackingProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackingProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemTrackingProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackingProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemTrackingProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackingProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemTrackingProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemTrackingProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemTrackingProperties malloc(MemoryStack stack) {
        return wrap(XrSystemTrackingProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemTrackingProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemTrackingProperties calloc(MemoryStack stack) {
        return wrap(XrSystemTrackingProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemTrackingProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackingProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemTrackingProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemTrackingProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #orientationTracking}. */
    public static int norientationTracking(long struct) { return UNSAFE.getInt(null, struct + XrSystemTrackingProperties.ORIENTATIONTRACKING); }
    /** Unsafe version of {@link #positionTracking}. */
    public static int npositionTracking(long struct) { return UNSAFE.getInt(null, struct + XrSystemTrackingProperties.POSITIONTRACKING); }

    /** Unsafe version of {@link #orientationTracking(boolean) orientationTracking}. */
    public static void norientationTracking(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemTrackingProperties.ORIENTATIONTRACKING, value); }
    /** Unsafe version of {@link #positionTracking(boolean) positionTracking}. */
    public static void npositionTracking(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemTrackingProperties.POSITIONTRACKING, value); }

    // -----------------------------------

    /** An array of {@link XrSystemTrackingProperties} structs. */
    public static class Buffer extends StructBuffer<XrSystemTrackingProperties, Buffer> implements NativeResource {

        private static final XrSystemTrackingProperties ELEMENT_FACTORY = XrSystemTrackingProperties.create(-1L);

        /**
         * Creates a new {@code XrSystemTrackingProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemTrackingProperties#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemTrackingProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemTrackingProperties#orientationTracking} field. */
        @NativeType("XrBool32")
        public boolean orientationTracking() { return XrSystemTrackingProperties.norientationTracking(address()) != 0; }
        /** @return the value of the {@link XrSystemTrackingProperties#positionTracking} field. */
        @NativeType("XrBool32")
        public boolean positionTracking() { return XrSystemTrackingProperties.npositionTracking(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemTrackingProperties#orientationTracking} field. */
        public XrSystemTrackingProperties.Buffer orientationTracking(@NativeType("XrBool32") boolean value) { XrSystemTrackingProperties.norientationTracking(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrSystemTrackingProperties#positionTracking} field. */
        public XrSystemTrackingProperties.Buffer positionTracking(@NativeType("XrBool32") boolean value) { XrSystemTrackingProperties.npositionTracking(address(), value ? 1 : 0); return this; }

    }

}