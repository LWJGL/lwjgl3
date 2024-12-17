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
 * struct XrExtent3DfKHR {
 *     float width;
 *     float height;
 *     float depth;
 * }}</pre>
 */
public class XrExtent3DfKHR extends XrExtent3Df {

    protected XrExtent3DfKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExtent3DfKHR create(long address, @Nullable ByteBuffer container) {
        return new XrExtent3DfKHR(address, container);
    }

    /**
     * Creates a {@code XrExtent3DfKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent3DfKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code width} field. */
    @Override
    public XrExtent3DfKHR width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    @Override
    public XrExtent3DfKHR height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    @Override
    public XrExtent3DfKHR depth(float value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrExtent3DfKHR set(
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
    public XrExtent3DfKHR set(XrExtent3DfKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent3DfKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent3DfKHR malloc() {
        return new XrExtent3DfKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DfKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent3DfKHR calloc() {
        return new XrExtent3DfKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DfKHR} instance allocated with {@link BufferUtils}. */
    public static XrExtent3DfKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExtent3DfKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrExtent3DfKHR} instance for the specified memory address. */
    public static XrExtent3DfKHR create(long address) {
        return new XrExtent3DfKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrExtent3DfKHR createSafe(long address) {
        return address == NULL ? null : new XrExtent3DfKHR(address, null);
    }

    /**
     * Returns a new {@link XrExtent3DfKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExtent3DfKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrExtent3DfKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExtent3DfKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DfKHR malloc(MemoryStack stack) {
        return new XrExtent3DfKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExtent3DfKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DfKHR calloc(MemoryStack stack) {
        return new XrExtent3DfKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExtent3DfKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DfKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DfKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrExtent3DfKHR} structs. */
    public static class Buffer extends XrExtent3Df.Buffer {

        private static final XrExtent3DfKHR ELEMENT_FACTORY = XrExtent3DfKHR.create(-1L);

        /**
         * Creates a new {@code XrExtent3DfKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent3DfKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExtent3DfKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code width} field. */
        @Override
        public XrExtent3DfKHR.Buffer width(float value) { XrExtent3DfKHR.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        @Override
        public XrExtent3DfKHR.Buffer height(float value) { XrExtent3DfKHR.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        @Override
        public XrExtent3DfKHR.Buffer depth(float value) { XrExtent3DfKHR.ndepth(address(), value); return this; }

    }

}