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
 * Represents a rectangular prism.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values must be in meters. The width, height, and depth values must be non-negative.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using {@link XrExtent3DfFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrRect3DfFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExtent3DfFB {
 *     float {@link #width};
 *     float {@link #height};
 *     float {@link #depth};
 * }</code></pre>
 */
public class XrExtent3DfFB extends Struct<XrExtent3DfFB> implements NativeResource {

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

    protected XrExtent3DfFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExtent3DfFB create(long address, @Nullable ByteBuffer container) {
        return new XrExtent3DfFB(address, container);
    }

    /**
     * Creates a {@code XrExtent3DfFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent3DfFB(ByteBuffer container) {
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
    public XrExtent3DfFB width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public XrExtent3DfFB height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #depth} field. */
    public XrExtent3DfFB depth(float value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtent3DfFB set(
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
    public XrExtent3DfFB set(XrExtent3DfFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent3DfFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent3DfFB malloc() {
        return new XrExtent3DfFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DfFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent3DfFB calloc() {
        return new XrExtent3DfFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DfFB} instance allocated with {@link BufferUtils}. */
    public static XrExtent3DfFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExtent3DfFB(memAddress(container), container);
    }

    /** Returns a new {@code XrExtent3DfFB} instance for the specified memory address. */
    public static XrExtent3DfFB create(long address) {
        return new XrExtent3DfFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent3DfFB createSafe(long address) {
        return address == NULL ? null : new XrExtent3DfFB(address, null);
    }

    /**
     * Returns a new {@link XrExtent3DfFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExtent3DfFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent3DfFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExtent3DfFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DfFB malloc(MemoryStack stack) {
        return new XrExtent3DfFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExtent3DfFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DfFB calloc(MemoryStack stack) {
        return new XrExtent3DfFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExtent3DfFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + XrExtent3DfFB.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + XrExtent3DfFB.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static float ndepth(long struct) { return UNSAFE.getFloat(null, struct + XrExtent3DfFB.DEPTH); }

    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent3DfFB.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent3DfFB.HEIGHT, value); }
    /** Unsafe version of {@link #depth(float) depth}. */
    public static void ndepth(long struct, float value) { UNSAFE.putFloat(null, struct + XrExtent3DfFB.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link XrExtent3DfFB} structs. */
    public static class Buffer extends StructBuffer<XrExtent3DfFB, Buffer> implements NativeResource {

        private static final XrExtent3DfFB ELEMENT_FACTORY = XrExtent3DfFB.create(-1L);

        /**
         * Creates a new {@code XrExtent3DfFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent3DfFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExtent3DfFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExtent3DfFB#width} field. */
        public float width() { return XrExtent3DfFB.nwidth(address()); }
        /** @return the value of the {@link XrExtent3DfFB#height} field. */
        public float height() { return XrExtent3DfFB.nheight(address()); }
        /** @return the value of the {@link XrExtent3DfFB#depth} field. */
        public float depth() { return XrExtent3DfFB.ndepth(address()); }

        /** Sets the specified value to the {@link XrExtent3DfFB#width} field. */
        public XrExtent3DfFB.Buffer width(float value) { XrExtent3DfFB.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrExtent3DfFB#height} field. */
        public XrExtent3DfFB.Buffer height(float value) { XrExtent3DfFB.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link XrExtent3DfFB#depth} field. */
        public XrExtent3DfFB.Buffer depth(float value) { XrExtent3DfFB.ndepth(address(), value); return this; }

    }

}