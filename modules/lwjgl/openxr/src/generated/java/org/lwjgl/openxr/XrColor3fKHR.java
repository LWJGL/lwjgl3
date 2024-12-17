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
 * struct XrColor3fKHR {
 *     float r;
 *     float g;
 *     float b;
 * }}</pre>
 */
public class XrColor3fKHR extends XrColor3f {

    protected XrColor3fKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColor3fKHR create(long address, @Nullable ByteBuffer container) {
        return new XrColor3fKHR(address, container);
    }

    /**
     * Creates a {@code XrColor3fKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColor3fKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code r} field. */
    @Override
    public XrColor3fKHR r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    @Override
    public XrColor3fKHR g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    @Override
    public XrColor3fKHR b(float value) { nb(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrColor3fKHR set(
        float r,
        float g,
        float b
    ) {
        r(r);
        g(g);
        b(b);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrColor3fKHR set(XrColor3fKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColor3fKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColor3fKHR malloc() {
        return new XrColor3fKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColor3fKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColor3fKHR calloc() {
        return new XrColor3fKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColor3fKHR} instance allocated with {@link BufferUtils}. */
    public static XrColor3fKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColor3fKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrColor3fKHR} instance for the specified memory address. */
    public static XrColor3fKHR create(long address) {
        return new XrColor3fKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColor3fKHR createSafe(long address) {
        return address == NULL ? null : new XrColor3fKHR(address, null);
    }

    /**
     * Returns a new {@link XrColor3fKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor3fKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColor3fKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor3fKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColor3fKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor3fKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColor3fKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColor3fKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColor3fKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColor3fKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColor3fKHR malloc(MemoryStack stack) {
        return new XrColor3fKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColor3fKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColor3fKHR calloc(MemoryStack stack) {
        return new XrColor3fKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColor3fKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColor3fKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColor3fKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColor3fKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrColor3fKHR} structs. */
    public static class Buffer extends XrColor3f.Buffer {

        private static final XrColor3fKHR ELEMENT_FACTORY = XrColor3fKHR.create(-1L);

        /**
         * Creates a new {@code XrColor3fKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColor3fKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColor3fKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code r} field. */
        @Override
        public XrColor3fKHR.Buffer r(float value) { XrColor3fKHR.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        @Override
        public XrColor3fKHR.Buffer g(float value) { XrColor3fKHR.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        @Override
        public XrColor3fKHR.Buffer b(float value) { XrColor3fKHR.nb(address(), value); return this; }

    }

}