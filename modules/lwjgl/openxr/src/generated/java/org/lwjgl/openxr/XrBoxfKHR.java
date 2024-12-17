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
 * struct XrBoxfKHR {
 *     {@link XrPosef XrPosef} center;
 *     {@link XrExtent3Df XrExtent3Df} extents;
 * }}</pre>
 */
public class XrBoxfKHR extends XrBoxf {

    protected XrBoxfKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBoxfKHR create(long address, @Nullable ByteBuffer container) {
        return new XrBoxfKHR(address, container);
    }

    /**
     * Creates a {@code XrBoxfKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBoxfKHR(ByteBuffer container) {
        super(container);
    }

    /** Copies the specified {@link XrPosef} to the {@code center} field. */
    @Override
    public XrBoxfKHR center(XrPosef value) { ncenter(address(), value); return this; }
    /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public XrBoxfKHR center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
    /** Copies the specified {@link XrExtent3Df} to the {@code extents} field. */
    @Override
    public XrBoxfKHR extents(XrExtent3Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public XrBoxfKHR extents(java.util.function.Consumer<XrExtent3Df> consumer) { consumer.accept(extents()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrBoxfKHR set(
        XrPosef center,
        XrExtent3Df extents
    ) {
        center(center);
        extents(extents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBoxfKHR set(XrBoxfKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBoxfKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBoxfKHR malloc() {
        return new XrBoxfKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBoxfKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBoxfKHR calloc() {
        return new XrBoxfKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBoxfKHR} instance allocated with {@link BufferUtils}. */
    public static XrBoxfKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBoxfKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrBoxfKHR} instance for the specified memory address. */
    public static XrBoxfKHR create(long address) {
        return new XrBoxfKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBoxfKHR createSafe(long address) {
        return address == NULL ? null : new XrBoxfKHR(address, null);
    }

    /**
     * Returns a new {@link XrBoxfKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoxfKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBoxfKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoxfKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBoxfKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoxfKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBoxfKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBoxfKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBoxfKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBoxfKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBoxfKHR malloc(MemoryStack stack) {
        return new XrBoxfKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBoxfKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBoxfKHR calloc(MemoryStack stack) {
        return new XrBoxfKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBoxfKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBoxfKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBoxfKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBoxfKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrBoxfKHR} structs. */
    public static class Buffer extends XrBoxf.Buffer {

        private static final XrBoxfKHR ELEMENT_FACTORY = XrBoxfKHR.create(-1L);

        /**
         * Creates a new {@code XrBoxfKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBoxfKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBoxfKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Copies the specified {@link XrPosef} to the {@code center} field. */
        @Override
        public XrBoxfKHR.Buffer center(XrPosef value) { XrBoxfKHR.ncenter(address(), value); return this; }
        /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public XrBoxfKHR.Buffer center(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(center()); return this; }
        /** Copies the specified {@link XrExtent3Df} to the {@code extents} field. */
        @Override
        public XrBoxfKHR.Buffer extents(XrExtent3Df value) { XrBoxfKHR.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public XrBoxfKHR.Buffer extents(java.util.function.Consumer<XrExtent3Df> consumer) { consumer.accept(extents()); return this; }

    }

}