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

/**
 * See {@link XrSpaceLocations}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceLocationsKHR {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t locationCount;
 *     {@link XrSpaceLocationData XrSpaceLocationData} * locations;
 * }</code></pre>
 */
public class XrSpaceLocationsKHR extends XrSpaceLocations {

    protected XrSpaceLocationsKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceLocationsKHR create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceLocationsKHR(address, container);
    }

    /**
     * Creates a {@code XrSpaceLocationsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceLocationsKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code type} field. */
    @Override
    public XrSpaceLocationsKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR11#XR_TYPE_SPACE_LOCATIONS TYPE_SPACE_LOCATIONS} value to the {@code type} field. */
    @Override
    public XrSpaceLocationsKHR type$Default() { return type(XR11.XR_TYPE_SPACE_LOCATIONS); }
    /** Sets the specified value to the {@code next} field. */
    @Override
    public XrSpaceLocationsKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceLocationData.Buffer} to the {@code locations} field. */
    @Override
    public XrSpaceLocationsKHR locations(@NativeType("XrSpaceLocationData *") XrSpaceLocationData.Buffer value) { nlocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrSpaceLocationsKHR set(
        int type,
        long next,
        XrSpaceLocationData.Buffer locations
    ) {
        type(type);
        next(next);
        locations(locations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceLocationsKHR set(XrSpaceLocationsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceLocationsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceLocationsKHR malloc() {
        return new XrSpaceLocationsKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceLocationsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceLocationsKHR calloc() {
        return new XrSpaceLocationsKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceLocationsKHR} instance allocated with {@link BufferUtils}. */
    public static XrSpaceLocationsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceLocationsKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceLocationsKHR} instance for the specified memory address. */
    public static XrSpaceLocationsKHR create(long address) {
        return new XrSpaceLocationsKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceLocationsKHR createSafe(long address) {
        return address == NULL ? null : new XrSpaceLocationsKHR(address, null);
    }

    /**
     * Returns a new {@link XrSpaceLocationsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationsKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocationsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationsKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocationsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceLocationsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationsKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceLocationsKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceLocationsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocationsKHR malloc(MemoryStack stack) {
        return new XrSpaceLocationsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceLocationsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocationsKHR calloc(MemoryStack stack) {
        return new XrSpaceLocationsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceLocationsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocationsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocationsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrSpaceLocationsKHR} structs. */
    public static class Buffer extends XrSpaceLocations.Buffer {

        private static final XrSpaceLocationsKHR ELEMENT_FACTORY = XrSpaceLocationsKHR.create(-1L);

        /**
         * Creates a new {@code XrSpaceLocationsKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceLocationsKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceLocationsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code type} field. */
        @Override
        public XrSpaceLocationsKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceLocationsKHR.ntype(address(), value); return this; }
        /** Sets the {@link XR11#XR_TYPE_SPACE_LOCATIONS TYPE_SPACE_LOCATIONS} value to the {@code type} field. */
        @Override
        public XrSpaceLocationsKHR.Buffer type$Default() { return type(XR11.XR_TYPE_SPACE_LOCATIONS); }
        /** Sets the specified value to the {@code next} field. */
        @Override
        public XrSpaceLocationsKHR.Buffer next(@NativeType("void *") long value) { XrSpaceLocationsKHR.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceLocationData.Buffer} to the {@code locations} field. */
        @Override
        public XrSpaceLocationsKHR.Buffer locations(@NativeType("XrSpaceLocationData *") XrSpaceLocationData.Buffer value) { XrSpaceLocationsKHR.nlocations(address(), value); return this; }

    }

}