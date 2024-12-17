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
 * <pre>{@code
 * struct XrSpaceVelocitiesKHR {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t velocityCount;
 *     {@link XrSpaceVelocityData XrSpaceVelocityData} * velocities;
 * }}</pre>
 */
public class XrSpaceVelocitiesKHR extends XrSpaceVelocities {

    protected XrSpaceVelocitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceVelocitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceVelocitiesKHR(address, container);
    }

    /**
     * Creates a {@code XrSpaceVelocitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceVelocitiesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code type} field. */
    @Override
    public XrSpaceVelocitiesKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR11#XR_TYPE_SPACE_VELOCITIES TYPE_SPACE_VELOCITIES} value to the {@code type} field. */
    @Override
    public XrSpaceVelocitiesKHR type$Default() { return type(XR11.XR_TYPE_SPACE_VELOCITIES); }
    /** Sets the specified value to the {@code next} field. */
    @Override
    public XrSpaceVelocitiesKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceVelocityData.Buffer} to the {@code velocities} field. */
    @Override
    public XrSpaceVelocitiesKHR velocities(@NativeType("XrSpaceVelocityData *") XrSpaceVelocityData.Buffer value) { nvelocities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrSpaceVelocitiesKHR set(
        int type,
        long next,
        XrSpaceVelocityData.Buffer velocities
    ) {
        type(type);
        next(next);
        velocities(velocities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceVelocitiesKHR set(XrSpaceVelocitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceVelocitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocitiesKHR malloc() {
        return new XrSpaceVelocitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceVelocitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceVelocitiesKHR calloc() {
        return new XrSpaceVelocitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceVelocitiesKHR} instance allocated with {@link BufferUtils}. */
    public static XrSpaceVelocitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceVelocitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceVelocitiesKHR} instance for the specified memory address. */
    public static XrSpaceVelocitiesKHR create(long address) {
        return new XrSpaceVelocitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceVelocitiesKHR createSafe(long address) {
        return address == NULL ? null : new XrSpaceVelocitiesKHR(address, null);
    }

    /**
     * Returns a new {@link XrSpaceVelocitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceVelocitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceVelocitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceVelocitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocitiesKHR malloc(MemoryStack stack) {
        return new XrSpaceVelocitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceVelocitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceVelocitiesKHR calloc(MemoryStack stack) {
        return new XrSpaceVelocitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceVelocitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceVelocitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceVelocitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrSpaceVelocitiesKHR} structs. */
    public static class Buffer extends XrSpaceVelocities.Buffer {

        private static final XrSpaceVelocitiesKHR ELEMENT_FACTORY = XrSpaceVelocitiesKHR.create(-1L);

        /**
         * Creates a new {@code XrSpaceVelocitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceVelocitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceVelocitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code type} field. */
        @Override
        public XrSpaceVelocitiesKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceVelocitiesKHR.ntype(address(), value); return this; }
        /** Sets the {@link XR11#XR_TYPE_SPACE_VELOCITIES TYPE_SPACE_VELOCITIES} value to the {@code type} field. */
        @Override
        public XrSpaceVelocitiesKHR.Buffer type$Default() { return type(XR11.XR_TYPE_SPACE_VELOCITIES); }
        /** Sets the specified value to the {@code next} field. */
        @Override
        public XrSpaceVelocitiesKHR.Buffer next(@NativeType("void *") long value) { XrSpaceVelocitiesKHR.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceVelocityData.Buffer} to the {@code velocities} field. */
        @Override
        public XrSpaceVelocitiesKHR.Buffer velocities(@NativeType("XrSpaceVelocityData *") XrSpaceVelocityData.Buffer value) { XrSpaceVelocitiesKHR.nvelocities(address(), value); return this; }

    }

}