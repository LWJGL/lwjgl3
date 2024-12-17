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
 * struct XrExtent3DfFB {
 *     float width;
 *     float height;
 *     float depth;
 * }}</pre>
 */
public class XrExtent3DfFB extends XrExtent3Df {

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
        super(container);
    }

    /** Sets the specified value to the {@code width} field. */
    @Override
    public XrExtent3DfFB width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    @Override
    public XrExtent3DfFB height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    @Override
    public XrExtent3DfFB depth(float value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
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
    public static @Nullable XrExtent3DfFB createSafe(long address) {
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
    public static XrExtent3DfFB.@Nullable Buffer createSafe(long address, int capacity) {
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

    /** An array of {@link XrExtent3DfFB} structs. */
    public static class Buffer extends XrExtent3Df.Buffer {

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
            super(container);
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
        protected XrExtent3DfFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code width} field. */
        @Override
        public XrExtent3DfFB.Buffer width(float value) { XrExtent3DfFB.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        @Override
        public XrExtent3DfFB.Buffer height(float value) { XrExtent3DfFB.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        @Override
        public XrExtent3DfFB.Buffer depth(float value) { XrExtent3DfFB.ndepth(address(), value); return this; }

    }

}