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
 * struct XrFrustumfKHR {
 *     {@link XrPosef XrPosef} pose;
 *     {@link XrFovf XrFovf} fov;
 *     float nearZ;
 *     float farZ;
 * }}</pre>
 */
public class XrFrustumfKHR extends XrFrustumf {

    protected XrFrustumfKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrustumfKHR create(long address, @Nullable ByteBuffer container) {
        return new XrFrustumfKHR(address, container);
    }

    /**
     * Creates a {@code XrFrustumfKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrustumfKHR(ByteBuffer container) {
        super(container);
    }

    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    @Override
    public XrFrustumfKHR pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public XrFrustumfKHR pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrFovf} to the {@code fov} field. */
    @Override
    public XrFrustumfKHR fov(XrFovf value) { nfov(address(), value); return this; }
    /** Passes the {@code fov} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public XrFrustumfKHR fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
    /** Sets the specified value to the {@code nearZ} field. */
    @Override
    public XrFrustumfKHR nearZ(float value) { nnearZ(address(), value); return this; }
    /** Sets the specified value to the {@code farZ} field. */
    @Override
    public XrFrustumfKHR farZ(float value) { nfarZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrFrustumfKHR set(
        XrPosef pose,
        XrFovf fov,
        float nearZ,
        float farZ
    ) {
        pose(pose);
        fov(fov);
        nearZ(nearZ);
        farZ(farZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFrustumfKHR set(XrFrustumfKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrustumfKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrustumfKHR malloc() {
        return new XrFrustumfKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrustumfKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrustumfKHR calloc() {
        return new XrFrustumfKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrustumfKHR} instance allocated with {@link BufferUtils}. */
    public static XrFrustumfKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrustumfKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrFrustumfKHR} instance for the specified memory address. */
    public static XrFrustumfKHR create(long address) {
        return new XrFrustumfKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFrustumfKHR createSafe(long address) {
        return address == NULL ? null : new XrFrustumfKHR(address, null);
    }

    /**
     * Returns a new {@link XrFrustumfKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrustumfKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrustumfKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrustumfKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrustumfKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrustumfKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrustumfKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrustumfKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFrustumfKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrustumfKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrustumfKHR malloc(MemoryStack stack) {
        return new XrFrustumfKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrustumfKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrustumfKHR calloc(MemoryStack stack) {
        return new XrFrustumfKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrustumfKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrustumfKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrustumfKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrustumfKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrFrustumfKHR} structs. */
    public static class Buffer extends XrFrustumf.Buffer {

        private static final XrFrustumfKHR ELEMENT_FACTORY = XrFrustumfKHR.create(-1L);

        /**
         * Creates a new {@code XrFrustumfKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrustumfKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFrustumfKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        @Override
        public XrFrustumfKHR.Buffer pose(XrPosef value) { XrFrustumfKHR.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public XrFrustumfKHR.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrFovf} to the {@code fov} field. */
        @Override
        public XrFrustumfKHR.Buffer fov(XrFovf value) { XrFrustumfKHR.nfov(address(), value); return this; }
        /** Passes the {@code fov} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public XrFrustumfKHR.Buffer fov(java.util.function.Consumer<XrFovf> consumer) { consumer.accept(fov()); return this; }
        /** Sets the specified value to the {@code nearZ} field. */
        @Override
        public XrFrustumfKHR.Buffer nearZ(float value) { XrFrustumfKHR.nnearZ(address(), value); return this; }
        /** Sets the specified value to the {@code farZ} field. */
        @Override
        public XrFrustumfKHR.Buffer farZ(float value) { XrFrustumfKHR.nfarZ(address(), value); return this; }

    }

}