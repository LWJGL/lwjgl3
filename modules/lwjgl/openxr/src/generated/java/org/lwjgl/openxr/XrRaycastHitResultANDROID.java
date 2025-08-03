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
 * struct XrRaycastHitResultANDROID {
 *     XrTrackableTypeANDROID type;
 *     XrTrackableANDROID trackable;
 *     {@link XrPosef XrPosef} pose;
 * }}</pre>
 */
public class XrRaycastHitResultANDROID extends Struct<XrRaycastHitResultANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        TRACKABLE,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        TRACKABLE = layout.offsetof(1);
        POSE = layout.offsetof(2);
    }

    protected XrRaycastHitResultANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRaycastHitResultANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrRaycastHitResultANDROID(address, container);
    }

    /**
     * Creates a {@code XrRaycastHitResultANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRaycastHitResultANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrTrackableTypeANDROID")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code trackable} field. */
    @NativeType("XrTrackableANDROID")
    public long trackable() { return ntrackable(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    // -----------------------------------

    /** Returns a new {@code XrRaycastHitResultANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRaycastHitResultANDROID malloc() {
        return new XrRaycastHitResultANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRaycastHitResultANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRaycastHitResultANDROID calloc() {
        return new XrRaycastHitResultANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRaycastHitResultANDROID} instance allocated with {@link BufferUtils}. */
    public static XrRaycastHitResultANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRaycastHitResultANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrRaycastHitResultANDROID} instance for the specified memory address. */
    public static XrRaycastHitResultANDROID create(long address) {
        return new XrRaycastHitResultANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRaycastHitResultANDROID createSafe(long address) {
        return address == NULL ? null : new XrRaycastHitResultANDROID(address, null);
    }

    /**
     * Returns a new {@link XrRaycastHitResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRaycastHitResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRaycastHitResultANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRaycastHitResultANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRaycastHitResultANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRaycastHitResultANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRaycastHitResultANDROID malloc(MemoryStack stack) {
        return new XrRaycastHitResultANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRaycastHitResultANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRaycastHitResultANDROID calloc(MemoryStack stack) {
        return new XrRaycastHitResultANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRaycastHitResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRaycastHitResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRaycastHitResultANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRaycastHitResultANDROID.TYPE); }
    /** Unsafe version of {@link #trackable}. */
    public static long ntrackable(long struct) { return memGetLong(struct + XrRaycastHitResultANDROID.TRACKABLE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrRaycastHitResultANDROID.POSE); }

    // -----------------------------------

    /** An array of {@link XrRaycastHitResultANDROID} structs. */
    public static class Buffer extends StructBuffer<XrRaycastHitResultANDROID, Buffer> implements NativeResource {

        private static final XrRaycastHitResultANDROID ELEMENT_FACTORY = XrRaycastHitResultANDROID.create(-1L);

        /**
         * Creates a new {@code XrRaycastHitResultANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRaycastHitResultANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRaycastHitResultANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrTrackableTypeANDROID")
        public int type() { return XrRaycastHitResultANDROID.ntype(address()); }
        /** @return the value of the {@code trackable} field. */
        @NativeType("XrTrackableANDROID")
        public long trackable() { return XrRaycastHitResultANDROID.ntrackable(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrRaycastHitResultANDROID.npose(address()); }

    }

}