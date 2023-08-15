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
 * Extent in three dimensions.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrExtent3DfEXT} structure describes a axis aligned three-dimensional floating-point extent: This structure is used for component values that <b>may</b> be fractional (floating-point). If used to represent physical distances, values <b>must</b> be in meters.</p>
 * 
 * <p>The {@code width} (X), {@code height} (Y) and {@code depth} (Z) values <b>must</b> be non-negative.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent2Df}, {@link XrPlaneDetectorBeginInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExtent3DfEXT {
 *     float {@link #width};
 *     float {@link #height};
 *     float {@link #depth};
 * }</code></pre>
 */
public class XrExtent3DfEXT extends Struct<XrExtent3DfEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DEPTH = layout.offsetof(2);
    }

    protected XrExtent3DfEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExtent3DfEXT create(long address, @Nullable ByteBuffer container) {
        return new XrExtent3DfEXT(address, container);
    }

    /**
     * Creates a {@code XrExtent3DfEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent3DfEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the floating-point width of the extent. */
    public float width() { return nwidth(address()); }
    /** the floating-point height of the extent. */
    public float height() { return nheight(address()); }
    /** the floating-point depth of the extent. */
    public float depth() { return ndepth(address()); }

    /** Sets the specified value to the {@link #width} field. */
    public XrExtent3DfEXT width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public XrExtent3DfEXT height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #depth} field. */
    public XrExtent3DfEXT depth(float value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtent3DfEXT set(
        float width,
        float height,
        float depth
    ) {
        width(width);
        height(height);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExtent3DfEXT set(XrExtent3DfEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent3DfEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent3DfEXT malloc() {
        return new XrExtent3DfEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DfEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent3DfEXT calloc() {
        return new XrExtent3DfEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DfEXT} instance allocated with {@link BufferUtils}. */
    public static XrExtent3DfEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExtent3DfEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrExtent3DfEXT} instance for the specified memory address. */
    public static XrExtent3DfEXT create(long address) {
        return new XrExtent3DfEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent3DfEXT createSafe(long address) {
        return address == NULL ? null : new XrExtent3DfEXT(address, null);
    }

    /**
     * Returns a new {@link XrExtent3DfEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExtent3DfEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent3DfEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExtent3DfEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DfEXT malloc(MemoryStack stack) {
        return new XrExtent3DfEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExtent3DfEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DfEXT calloc(MemoryStack stack) {
        return new XrExtent3DfEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExtent3DfEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + XrExtent3DfEXT.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + XrExtent3DfEXT.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static float ndepth(long struct) { return UNSAFE.getFloat(null, struct + XrExtent3DfEXT.DEPTH); }

    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent3DfEXT.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent3DfEXT.HEIGHT, value); }
    /** Unsafe version of {@link #depth(float) depth}. */
    public static void ndepth(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent3DfEXT.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link XrExtent3DfEXT} structs. */
    public static class Buffer extends StructBuffer<XrExtent3DfEXT, Buffer> implements NativeResource {

        private static final XrExtent3DfEXT ELEMENT_FACTORY = XrExtent3DfEXT.create(-1L);

        /**
         * Creates a new {@code XrExtent3DfEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent3DfEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExtent3DfEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExtent3DfEXT#width} field. */
        public float width() { return XrExtent3DfEXT.nwidth(address()); }
        /** @return the value of the {@link XrExtent3DfEXT#height} field. */
        public float height() { return XrExtent3DfEXT.nheight(address()); }
        /** @return the value of the {@link XrExtent3DfEXT#depth} field. */
        public float depth() { return XrExtent3DfEXT.ndepth(address()); }

        /** Sets the specified value to the {@link XrExtent3DfEXT#width} field. */
        public XrExtent3DfEXT.Buffer width(float value) { XrExtent3DfEXT.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrExtent3DfEXT#height} field. */
        public XrExtent3DfEXT.Buffer height(float value) { XrExtent3DfEXT.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link XrExtent3DfEXT#depth} field. */
        public XrExtent3DfEXT.Buffer depth(float value) { XrExtent3DfEXT.ndepth(address(), value); return this; }

    }

}