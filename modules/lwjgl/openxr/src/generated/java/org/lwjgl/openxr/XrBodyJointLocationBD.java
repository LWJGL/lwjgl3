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
 * struct XrBodyJointLocationBD {
 *     XrSpaceLocationFlags locationFlags;
 *     {@link XrPosef XrPosef} pose;
 * }}</pre>
 */
public class XrBodyJointLocationBD extends Struct<XrBodyJointLocationBD> implements NativeResource {

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

    protected XrBodyJointLocationBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationBD(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code locationFlags} field. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code locationFlags} field. */
    public XrBodyJointLocationBD locationFlags(@NativeType("XrSpaceLocationFlags") long value) { nlocationFlags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrBodyJointLocationBD pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrBodyJointLocationBD pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointLocationBD set(
        long locationFlags,
        XrPosef pose
    ) {
        locationFlags(locationFlags);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointLocationBD set(XrBodyJointLocationBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationBD malloc() {
        return new XrBodyJointLocationBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationBD calloc() {
        return new XrBodyJointLocationBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationBD} instance for the specified memory address. */
    public static XrBodyJointLocationBD create(long address) {
        return new XrBodyJointLocationBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointLocationBD createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointLocationBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationBD malloc(MemoryStack stack) {
        return new XrBodyJointLocationBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationBD calloc(MemoryStack stack) {
        return new XrBodyJointLocationBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return memGetLong(struct + XrBodyJointLocationBD.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrBodyJointLocationBD.POSE); }

    /** Unsafe version of {@link #locationFlags(long) locationFlags}. */
    public static void nlocationFlags(long struct, long value) { memPutLong(struct + XrBodyJointLocationBD.LOCATIONFLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrBodyJointLocationBD.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationBD, Buffer> implements NativeResource {

        private static final XrBodyJointLocationBD ELEMENT_FACTORY = XrBodyJointLocationBD.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrBodyJointLocationBD.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrBodyJointLocationBD.npose(address()); }

        /** Sets the specified value to the {@code locationFlags} field. */
        public XrBodyJointLocationBD.Buffer locationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrBodyJointLocationBD.nlocationFlags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrBodyJointLocationBD.Buffer pose(XrPosef value) { XrBodyJointLocationBD.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrBodyJointLocationBD.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}