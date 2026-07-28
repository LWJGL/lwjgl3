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
 * struct XrTrackableMarkerDatabaseEntryANDROID {
 *     int32_t id;
 *     float edgeSize;
 * }}</pre>
 */
public class XrTrackableMarkerDatabaseEntryANDROID extends Struct<XrTrackableMarkerDatabaseEntryANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        EDGESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        EDGESIZE = layout.offsetof(1);
    }

    protected XrTrackableMarkerDatabaseEntryANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableMarkerDatabaseEntryANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableMarkerDatabaseEntryANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableMarkerDatabaseEntryANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableMarkerDatabaseEntryANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code id} field. */
    @NativeType("int32_t")
    public int id() { return nid(address()); }
    /** @return the value of the {@code edgeSize} field. */
    public float edgeSize() { return nedgeSize(address()); }

    /** Sets the specified value to the {@code id} field. */
    public XrTrackableMarkerDatabaseEntryANDROID id(@NativeType("int32_t") int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@code edgeSize} field. */
    public XrTrackableMarkerDatabaseEntryANDROID edgeSize(float value) { nedgeSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableMarkerDatabaseEntryANDROID set(
        int id,
        float edgeSize
    ) {
        id(id);
        edgeSize(edgeSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableMarkerDatabaseEntryANDROID set(XrTrackableMarkerDatabaseEntryANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableMarkerDatabaseEntryANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerDatabaseEntryANDROID malloc() {
        return new XrTrackableMarkerDatabaseEntryANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerDatabaseEntryANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerDatabaseEntryANDROID calloc() {
        return new XrTrackableMarkerDatabaseEntryANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerDatabaseEntryANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableMarkerDatabaseEntryANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableMarkerDatabaseEntryANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableMarkerDatabaseEntryANDROID} instance for the specified memory address. */
    public static XrTrackableMarkerDatabaseEntryANDROID create(long address) {
        return new XrTrackableMarkerDatabaseEntryANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableMarkerDatabaseEntryANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableMarkerDatabaseEntryANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseEntryANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseEntryANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseEntryANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseEntryANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableMarkerDatabaseEntryANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableMarkerDatabaseEntryANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerDatabaseEntryANDROID malloc(MemoryStack stack) {
        return new XrTrackableMarkerDatabaseEntryANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableMarkerDatabaseEntryANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerDatabaseEntryANDROID calloc(MemoryStack stack) {
        return new XrTrackableMarkerDatabaseEntryANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseEntryANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerDatabaseEntryANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return memGetInt(struct + XrTrackableMarkerDatabaseEntryANDROID.ID); }
    /** Unsafe version of {@link #edgeSize}. */
    public static float nedgeSize(long struct) { return memGetFloat(struct + XrTrackableMarkerDatabaseEntryANDROID.EDGESIZE); }

    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { memPutInt(struct + XrTrackableMarkerDatabaseEntryANDROID.ID, value); }
    /** Unsafe version of {@link #edgeSize(float) edgeSize}. */
    public static void nedgeSize(long struct, float value) { memPutFloat(struct + XrTrackableMarkerDatabaseEntryANDROID.EDGESIZE, value); }

    // -----------------------------------

    /** An array of {@link XrTrackableMarkerDatabaseEntryANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableMarkerDatabaseEntryANDROID, Buffer> implements NativeResource {

        private static final XrTrackableMarkerDatabaseEntryANDROID ELEMENT_FACTORY = XrTrackableMarkerDatabaseEntryANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableMarkerDatabaseEntryANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableMarkerDatabaseEntryANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableMarkerDatabaseEntryANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code id} field. */
        @NativeType("int32_t")
        public int id() { return XrTrackableMarkerDatabaseEntryANDROID.nid(address()); }
        /** @return the value of the {@code edgeSize} field. */
        public float edgeSize() { return XrTrackableMarkerDatabaseEntryANDROID.nedgeSize(address()); }

        /** Sets the specified value to the {@code id} field. */
        public XrTrackableMarkerDatabaseEntryANDROID.Buffer id(@NativeType("int32_t") int value) { XrTrackableMarkerDatabaseEntryANDROID.nid(address(), value); return this; }
        /** Sets the specified value to the {@code edgeSize} field. */
        public XrTrackableMarkerDatabaseEntryANDROID.Buffer edgeSize(float value) { XrTrackableMarkerDatabaseEntryANDROID.nedgeSize(address(), value); return this; }

    }

}