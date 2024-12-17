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
 * struct XrSpherefKHR {
 *     {@link XrPosef XrPosef} center;
 *     float radius;
 * }}</pre>
 */
public class XrSpherefKHR extends XrSpheref {

    protected XrSpherefKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpherefKHR create(long address, @Nullable ByteBuffer container) {
        return new XrSpherefKHR(address, container);
    }

    /**
     * Creates a {@code XrSpherefKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpherefKHR(ByteBuffer container) {
        super(container);
    }

    /** Copies the specified {@link XrPosef} to the {@code center} field. */
    @Override
    public XrSpherefKHR center(XrPosef value) { ncenter(address(), value); return this; }
    /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public XrSpherefKHR center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
    /** Sets the specified value to the {@code radius} field. */
    @Override
    public XrSpherefKHR radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrSpherefKHR set(
        XrPosef center,
        float radius
    ) {
        center(center);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpherefKHR set(XrSpherefKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpherefKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpherefKHR malloc() {
        return new XrSpherefKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpherefKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpherefKHR calloc() {
        return new XrSpherefKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpherefKHR} instance allocated with {@link BufferUtils}. */
    public static XrSpherefKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpherefKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrSpherefKHR} instance for the specified memory address. */
    public static XrSpherefKHR create(long address) {
        return new XrSpherefKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpherefKHR createSafe(long address) {
        return address == NULL ? null : new XrSpherefKHR(address, null);
    }

    /**
     * Returns a new {@link XrSpherefKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpherefKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpherefKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpherefKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpherefKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpherefKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpherefKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpherefKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpherefKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpherefKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpherefKHR malloc(MemoryStack stack) {
        return new XrSpherefKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpherefKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpherefKHR calloc(MemoryStack stack) {
        return new XrSpherefKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpherefKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpherefKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpherefKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpherefKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrSpherefKHR} structs. */
    public static class Buffer extends XrSpheref.Buffer {

        private static final XrSpherefKHR ELEMENT_FACTORY = XrSpherefKHR.create(-1L);

        /**
         * Creates a new {@code XrSpherefKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpherefKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpherefKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Copies the specified {@link XrPosef} to the {@code center} field. */
        @Override
        public XrSpherefKHR.Buffer center(XrPosef value) { XrSpherefKHR.ncenter(address(), value); return this; }
        /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public XrSpherefKHR.Buffer center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
        /** Sets the specified value to the {@code radius} field. */
        @Override
        public XrSpherefKHR.Buffer radius(float value) { XrSpherefKHR.nradius(address(), value); return this; }

    }

}