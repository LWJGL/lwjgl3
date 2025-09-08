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
 * <pre><code>
 * struct XrBodyJointLocationHTC {
 *     XrSpaceLocationFlags locationFlags;
 *     {@link XrPosef XrPosef} pose;
 * }</code></pre>
 */
public class XrBodyJointLocationHTC extends Struct<XrBodyJointLocationHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATIONFLAGS,
        POSE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATIONFLAGS = layout.offsetof(0);
        POSE = layout.offsetof(1);
    }

    protected XrBodyJointLocationHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code locationFlags} field. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationHTC malloc() {
        return new XrBodyJointLocationHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationHTC calloc() {
        return new XrBodyJointLocationHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationHTC} instance for the specified memory address. */
    public static XrBodyJointLocationHTC create(long address) {
        return new XrBodyJointLocationHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointLocationHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointLocationHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationHTC malloc(MemoryStack stack) {
        return new XrBodyJointLocationHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationHTC calloc(MemoryStack stack) {
        return new XrBodyJointLocationHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return memGetLong(struct + XrBodyJointLocationHTC.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrBodyJointLocationHTC.POSE); }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationHTC, Buffer> implements NativeResource {

        private static final XrBodyJointLocationHTC ELEMENT_FACTORY = XrBodyJointLocationHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrBodyJointLocationHTC.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrBodyJointLocationHTC.npose(address()); }

    }

}