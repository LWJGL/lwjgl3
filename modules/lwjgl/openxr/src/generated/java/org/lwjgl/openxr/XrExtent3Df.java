/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrExtent3Df {
 *     float width;
 *     float height;
 *     float depth;
 * }}</pre>
 */
public class XrExtent3Df extends Struct<XrExtent3Df> implements NativeResource {

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

    protected XrExtent3Df(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExtent3Df create(long address, @Nullable ByteBuffer container) {
        return new XrExtent3Df(address, container);
    }

    /**
     * Creates a {@code XrExtent3Df} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent3Df(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    public float width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public float height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    public float depth() { return ndepth(address()); }

    /** Sets the specified value to the {@code width} field. */
    public XrExtent3Df width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XrExtent3Df height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public XrExtent3Df depth(float value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtent3Df set(
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
    public XrExtent3Df set(XrExtent3Df src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent3Df} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent3Df malloc() {
        return new XrExtent3Df(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3Df} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent3Df calloc() {
        return new XrExtent3Df(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3Df} instance allocated with {@link BufferUtils}. */
    public static XrExtent3Df create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExtent3Df(memAddress(container), container);
    }

    /** Returns a new {@code XrExtent3Df} instance for the specified memory address. */
    public static XrExtent3Df create(long address) {
        return new XrExtent3Df(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrExtent3Df createSafe(long address) {
        return address == NULL ? null : new XrExtent3Df(address, null);
    }

    /**
     * Returns a new {@link XrExtent3Df.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3Df.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent3Df.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3Df.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3Df.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3Df.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExtent3Df.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent3Df.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrExtent3Df.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExtent3Df} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3Df malloc(MemoryStack stack) {
        return new XrExtent3Df(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExtent3Df} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3Df calloc(MemoryStack stack) {
        return new XrExtent3Df(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExtent3Df.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3Df.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3Df.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3Df.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return memGetFloat(struct + XrExtent3Df.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return memGetFloat(struct + XrExtent3Df.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static float ndepth(long struct) { return memGetFloat(struct + XrExtent3Df.DEPTH); }

    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { memPutFloat(struct + XrExtent3Df.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { memPutFloat(struct + XrExtent3Df.HEIGHT, value); }
    /** Unsafe version of {@link #depth(float) depth}. */
    public static void ndepth(long struct, float value) { memPutFloat(struct + XrExtent3Df.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link XrExtent3Df} structs. */
    public static class Buffer extends StructBuffer<XrExtent3Df, Buffer> implements NativeResource {

        private static final XrExtent3Df ELEMENT_FACTORY = XrExtent3Df.create(-1L);

        /**
         * Creates a new {@code XrExtent3Df.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent3Df#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExtent3Df getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        public float width() { return XrExtent3Df.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public float height() { return XrExtent3Df.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        public float depth() { return XrExtent3Df.ndepth(address()); }

        /** Sets the specified value to the {@code width} field. */
        public XrExtent3Df.Buffer width(float value) { XrExtent3Df.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XrExtent3Df.Buffer height(float value) { XrExtent3Df.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public XrExtent3Df.Buffer depth(float value) { XrExtent3Df.ndepth(address(), value); return this; }

    }

}