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
 * Extent in two dimensions.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values <b>must</b> be in meters.</p>
 * 
 * <p>The {@code width} and {@code height} value <b>must</b> be non-negative.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerQuad}, {@link XrOffset2Df}, {@link XrRect2Df}, {@link XrScenePlaneMSFT}, {@link VARJOMarkerTracking#xrGetMarkerSizeVARJO GetMarkerSizeVARJO}, {@link XR10#xrGetReferenceSpaceBoundsRect GetReferenceSpaceBoundsRect}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExtent2Df {
 *     float {@link #width};
 *     float {@link #height};
 * }</code></pre>
 */
public class XrExtent2Df extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrExtent2Df} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent2Df(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the floating-point width of the extent. */
    public float width() { return nwidth(address()); }
    /** the floating-point height of the extent. */
    public float height() { return nheight(address()); }

    /** Sets the specified value to the {@link #width} field. */
    public XrExtent2Df width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public XrExtent2Df height(float value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtent2Df set(
        float width,
        float height
    ) {
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExtent2Df set(XrExtent2Df src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent2Df} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent2Df malloc() {
        return wrap(XrExtent2Df.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrExtent2Df} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent2Df calloc() {
        return wrap(XrExtent2Df.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrExtent2Df} instance allocated with {@link BufferUtils}. */
    public static XrExtent2Df create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrExtent2Df.class, memAddress(container), container);
    }

    /** Returns a new {@code XrExtent2Df} instance for the specified memory address. */
    public static XrExtent2Df create(long address) {
        return wrap(XrExtent2Df.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent2Df createSafe(long address) {
        return address == NULL ? null : wrap(XrExtent2Df.class, address);
    }

    /**
     * Returns a new {@link XrExtent2Df.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent2Df.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent2Df.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent2Df.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent2Df.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent2Df.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrExtent2Df.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent2Df.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent2Df.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrExtent2Df} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent2Df malloc(MemoryStack stack) {
        return wrap(XrExtent2Df.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrExtent2Df} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent2Df calloc(MemoryStack stack) {
        return wrap(XrExtent2Df.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrExtent2Df.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent2Df.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent2Df.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent2Df.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + XrExtent2Df.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + XrExtent2Df.HEIGHT); }

    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent2Df.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent2Df.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link XrExtent2Df} structs. */
    public static class Buffer extends StructBuffer<XrExtent2Df, Buffer> implements NativeResource {

        private static final XrExtent2Df ELEMENT_FACTORY = XrExtent2Df.create(-1L);

        /**
         * Creates a new {@code XrExtent2Df.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent2Df#SIZEOF}, and its mark will be undefined.
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
        protected XrExtent2Df getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExtent2Df#width} field. */
        public float width() { return XrExtent2Df.nwidth(address()); }
        /** @return the value of the {@link XrExtent2Df#height} field. */
        public float height() { return XrExtent2Df.nheight(address()); }

        /** Sets the specified value to the {@link XrExtent2Df#width} field. */
        public XrExtent2Df.Buffer width(float value) { XrExtent2Df.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrExtent2Df#height} field. */
        public XrExtent2Df.Buffer height(float value) { XrExtent2Df.nheight(address(), value); return this; }

    }

}