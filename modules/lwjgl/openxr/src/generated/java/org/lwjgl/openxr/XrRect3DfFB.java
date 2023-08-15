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
 * Represents a rectangular prism containing a region of space.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used for component values that may be fractional (floating-point).</p>
 * 
 * <p>The bounding box is defined by an {@code offset} and {@code extent}. The {@code offset} refers to the coordinate of the minimum corner of the box in the local space of the {@code XrSpace}; that is, the corner whose coordinate has the minimum value on each axis. The {@code extent} refers to the dimensions of the box along each axis. The maximum corner can therefore be computed as <code>offset extent</code>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using {@link XrRect3DfFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExtent3DfFB}, {@link XrOffset3DfFB}, {@link FBScene#xrGetSpaceBoundingBox3DFB GetSpaceBoundingBox3DFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRect3DfFB {
 *     {@link XrOffset3DfFB XrOffset3DfFB} {@link #offset};
 *     {@link XrExtent3DfFB XrExtent3DfFB} {@link #extent};
 * }</code></pre>
 */
public class XrRect3DfFB extends Struct<XrRect3DfFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(XrOffset3DfFB.SIZEOF, XrOffset3DfFB.ALIGNOF),
            __member(XrExtent3DfFB.SIZEOF, XrExtent3DfFB.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
    }

    protected XrRect3DfFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRect3DfFB create(long address, @Nullable ByteBuffer container) {
        return new XrRect3DfFB(address, container);
    }

    /**
     * Creates a {@code XrRect3DfFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRect3DfFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@link XrOffset3DfFB} specifying the rectangle offset. */
    public XrOffset3DfFB offset() { return noffset(address()); }
    /** the {@link XrExtent3DfFB} specifying the rectangle extent. */
    public XrExtent3DfFB extent() { return nextent(address()); }

    /** Copies the specified {@link XrOffset3DfFB} to the {@link #offset} field. */
    public XrRect3DfFB offset(XrOffset3DfFB value) { noffset(address(), value); return this; }
    /** Passes the {@link #offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRect3DfFB offset(java.util.function.Consumer<XrOffset3DfFB> consumer) { consumer.accept(offset()); return this; }
    /** Copies the specified {@link XrExtent3DfFB} to the {@link #extent} field. */
    public XrRect3DfFB extent(XrExtent3DfFB value) { nextent(address(), value); return this; }
    /** Passes the {@link #extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRect3DfFB extent(java.util.function.Consumer<XrExtent3DfFB> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public XrRect3DfFB set(
        XrOffset3DfFB offset,
        XrExtent3DfFB extent
    ) {
        offset(offset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRect3DfFB set(XrRect3DfFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRect3DfFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRect3DfFB malloc() {
        return new XrRect3DfFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRect3DfFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRect3DfFB calloc() {
        return new XrRect3DfFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRect3DfFB} instance allocated with {@link BufferUtils}. */
    public static XrRect3DfFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRect3DfFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRect3DfFB} instance for the specified memory address. */
    public static XrRect3DfFB create(long address) {
        return new XrRect3DfFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRect3DfFB createSafe(long address) {
        return address == NULL ? null : new XrRect3DfFB(address, null);
    }

    /**
     * Returns a new {@link XrRect3DfFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect3DfFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRect3DfFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect3DfFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRect3DfFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRect3DfFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRect3DfFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRect3DfFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrRect3DfFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRect3DfFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRect3DfFB malloc(MemoryStack stack) {
        return new XrRect3DfFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRect3DfFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRect3DfFB calloc(MemoryStack stack) {
        return new XrRect3DfFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRect3DfFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRect3DfFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRect3DfFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRect3DfFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static XrOffset3DfFB noffset(long struct) { return XrOffset3DfFB.create(struct + XrRect3DfFB.OFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static XrExtent3DfFB nextent(long struct) { return XrExtent3DfFB.create(struct + XrRect3DfFB.EXTENT); }

    /** Unsafe version of {@link #offset(XrOffset3DfFB) offset}. */
    public static void noffset(long struct, XrOffset3DfFB value) { memCopy(value.address(), struct + XrRect3DfFB.OFFSET, XrOffset3DfFB.SIZEOF); }
    /** Unsafe version of {@link #extent(XrExtent3DfFB) extent}. */
    public static void nextent(long struct, XrExtent3DfFB value) { memCopy(value.address(), struct + XrRect3DfFB.EXTENT, XrExtent3DfFB.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrRect3DfFB} structs. */
    public static class Buffer extends StructBuffer<XrRect3DfFB, Buffer> implements NativeResource {

        private static final XrRect3DfFB ELEMENT_FACTORY = XrRect3DfFB.create(-1L);

        /**
         * Creates a new {@code XrRect3DfFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRect3DfFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRect3DfFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrOffset3DfFB} view of the {@link XrRect3DfFB#offset} field. */
        public XrOffset3DfFB offset() { return XrRect3DfFB.noffset(address()); }
        /** @return a {@link XrExtent3DfFB} view of the {@link XrRect3DfFB#extent} field. */
        public XrExtent3DfFB extent() { return XrRect3DfFB.nextent(address()); }

        /** Copies the specified {@link XrOffset3DfFB} to the {@link XrRect3DfFB#offset} field. */
        public XrRect3DfFB.Buffer offset(XrOffset3DfFB value) { XrRect3DfFB.noffset(address(), value); return this; }
        /** Passes the {@link XrRect3DfFB#offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRect3DfFB.Buffer offset(java.util.function.Consumer<XrOffset3DfFB> consumer) { consumer.accept(offset()); return this; }
        /** Copies the specified {@link XrExtent3DfFB} to the {@link XrRect3DfFB#extent} field. */
        public XrRect3DfFB.Buffer extent(XrExtent3DfFB value) { XrRect3DfFB.nextent(address(), value); return this; }
        /** Passes the {@link XrRect3DfFB#extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRect3DfFB.Buffer extent(java.util.function.Consumer<XrExtent3DfFB> consumer) { consumer.accept(extent()); return this; }

    }

}