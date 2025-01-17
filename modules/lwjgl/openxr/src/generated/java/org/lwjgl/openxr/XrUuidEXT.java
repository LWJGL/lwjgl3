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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.XR11.*;

/**
 * <pre>{@code
 * struct XrUuidEXT {
 *     uint8_t data[XR_UUID_SIZE];
 * }}</pre>
 */
public class XrUuidEXT extends XrUuid {

    protected XrUuidEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrUuidEXT create(long address, @Nullable ByteBuffer container) {
        return new XrUuidEXT(address, container);
    }

    /**
     * Creates a {@code XrUuidEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrUuidEXT(ByteBuffer container) {
        super(container);
    }

    /** Copies the specified {@link ByteBuffer} to the {@code data} field. */
    @Override
    public XrUuidEXT data(@NativeType("uint8_t[XR_UUID_SIZE]") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data} field. */
    @Override
    public XrUuidEXT data(int index, @NativeType("uint8_t") byte value) { ndata(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrUuidEXT set(XrUuidEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrUuidEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrUuidEXT malloc() {
        return new XrUuidEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrUuidEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrUuidEXT calloc() {
        return new XrUuidEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrUuidEXT} instance allocated with {@link BufferUtils}. */
    public static XrUuidEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrUuidEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrUuidEXT} instance for the specified memory address. */
    public static XrUuidEXT create(long address) {
        return new XrUuidEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrUuidEXT createSafe(long address) {
        return address == NULL ? null : new XrUuidEXT(address, null);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrUuidEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrUuidEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrUuidEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuidEXT malloc(MemoryStack stack) {
        return new XrUuidEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrUuidEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuidEXT calloc(MemoryStack stack) {
        return new XrUuidEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrUuidEXT} structs. */
    public static class Buffer extends XrUuid.Buffer {

        private static final XrUuidEXT ELEMENT_FACTORY = XrUuidEXT.create(-1L);

        /**
         * Creates a new {@code XrUuidEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrUuidEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrUuidEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Copies the specified {@link ByteBuffer} to the {@code data} field. */
        @Override
        public XrUuidEXT.Buffer data(@NativeType("uint8_t[XR_UUID_SIZE]") ByteBuffer value) { XrUuidEXT.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data} field. */
        @Override
        public XrUuidEXT.Buffer data(int index, @NativeType("uint8_t") byte value) { XrUuidEXT.ndata(address(), index, value); return this; }

    }

}