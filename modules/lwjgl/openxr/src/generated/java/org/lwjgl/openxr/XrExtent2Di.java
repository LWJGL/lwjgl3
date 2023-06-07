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
 * <p>This variant is for representing discrete values such as texels. For representing physical distances, the floating-point variant <b>must</b> be used instead.</p>
 * 
 * <p>The {@code width} and {@code height} value <b>must</b> be non-negative.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrExternalCameraIntrinsicsOCULUS}, {@link XrOffset2Di}, {@link XrRect2Di}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExtent2Di {
 *     int32_t {@link #width};
 *     int32_t {@link #height};
 * }</code></pre>
 */
public class XrExtent2Di extends Struct<XrExtent2Di> implements NativeResource {

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

    protected XrExtent2Di(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExtent2Di create(long address, @Nullable ByteBuffer container) {
        return new XrExtent2Di(address, container);
    }

    /**
     * Creates a {@code XrExtent2Di} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent2Di(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the integer width of the extent. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** the integer height of the extent. */
    @NativeType("int32_t")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@link #width} field. */
    public XrExtent2Di width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public XrExtent2Di height(@NativeType("int32_t") int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtent2Di set(
        int width,
        int height
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
    public XrExtent2Di set(XrExtent2Di src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent2Di} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent2Di malloc() {
        return new XrExtent2Di(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExtent2Di} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent2Di calloc() {
        return new XrExtent2Di(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExtent2Di} instance allocated with {@link BufferUtils}. */
    public static XrExtent2Di create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExtent2Di(memAddress(container), container);
    }

    /** Returns a new {@code XrExtent2Di} instance for the specified memory address. */
    public static XrExtent2Di create(long address) {
        return new XrExtent2Di(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent2Di createSafe(long address) {
        return address == NULL ? null : new XrExtent2Di(address, null);
    }

    /**
     * Returns a new {@link XrExtent2Di.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent2Di.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent2Di.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent2Di.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent2Di.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent2Di.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExtent2Di.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent2Di.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtent2Di.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExtent2Di} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent2Di malloc(MemoryStack stack) {
        return new XrExtent2Di(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExtent2Di} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent2Di calloc(MemoryStack stack) {
        return new XrExtent2Di(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExtent2Di.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent2Di.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent2Di.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent2Di.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XrExtent2Di.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XrExtent2Di.HEIGHT); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XrExtent2Di.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XrExtent2Di.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link XrExtent2Di} structs. */
    public static class Buffer extends StructBuffer<XrExtent2Di, Buffer> implements NativeResource {

        private static final XrExtent2Di ELEMENT_FACTORY = XrExtent2Di.create(-1L);

        /**
         * Creates a new {@code XrExtent2Di.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent2Di#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExtent2Di getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExtent2Di#width} field. */
        @NativeType("int32_t")
        public int width() { return XrExtent2Di.nwidth(address()); }
        /** @return the value of the {@link XrExtent2Di#height} field. */
        @NativeType("int32_t")
        public int height() { return XrExtent2Di.nheight(address()); }

        /** Sets the specified value to the {@link XrExtent2Di#width} field. */
        public XrExtent2Di.Buffer width(@NativeType("int32_t") int value) { XrExtent2Di.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrExtent2Di#height} field. */
        public XrExtent2Di.Buffer height(@NativeType("int32_t") int value) { XrExtent2Di.nheight(address(), value); return this; }

    }

}