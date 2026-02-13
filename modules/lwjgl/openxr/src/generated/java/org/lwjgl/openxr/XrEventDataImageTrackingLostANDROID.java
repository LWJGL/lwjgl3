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
 * struct XrEventDataImageTrackingLostANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime time;
 * }}</pre>
 */
public class XrEventDataImageTrackingLostANDROID extends Struct<XrEventDataImageTrackingLostANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIME = layout.offsetof(2);
    }

    protected XrEventDataImageTrackingLostANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataImageTrackingLostANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataImageTrackingLostANDROID(address, container);
    }

    /**
     * Creates a {@code XrEventDataImageTrackingLostANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataImageTrackingLostANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataImageTrackingLostANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID} value to the {@code type} field. */
    public XrEventDataImageTrackingLostANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataImageTrackingLostANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataImageTrackingLostANDROID set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataImageTrackingLostANDROID set(XrEventDataImageTrackingLostANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataImageTrackingLostANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataImageTrackingLostANDROID malloc() {
        return new XrEventDataImageTrackingLostANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataImageTrackingLostANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataImageTrackingLostANDROID calloc() {
        return new XrEventDataImageTrackingLostANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataImageTrackingLostANDROID} instance allocated with {@link BufferUtils}. */
    public static XrEventDataImageTrackingLostANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataImageTrackingLostANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataImageTrackingLostANDROID} instance for the specified memory address. */
    public static XrEventDataImageTrackingLostANDROID create(long address) {
        return new XrEventDataImageTrackingLostANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataImageTrackingLostANDROID createSafe(long address) {
        return address == NULL ? null : new XrEventDataImageTrackingLostANDROID(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataImageTrackingLostANDROID}. */
    public static XrEventDataImageTrackingLostANDROID create(XrEventDataBaseHeader value) {
        return new XrEventDataImageTrackingLostANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataImageTrackingLostANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataImageTrackingLostANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataImageTrackingLostANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataImageTrackingLostANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataImageTrackingLostANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataImageTrackingLostANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataImageTrackingLostANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataImageTrackingLostANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataImageTrackingLostANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataImageTrackingLostANDROID.Buffer}. */
    public static XrEventDataImageTrackingLostANDROID.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataImageTrackingLostANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataImageTrackingLostANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataImageTrackingLostANDROID malloc(MemoryStack stack) {
        return new XrEventDataImageTrackingLostANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataImageTrackingLostANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataImageTrackingLostANDROID calloc(MemoryStack stack) {
        return new XrEventDataImageTrackingLostANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataImageTrackingLostANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataImageTrackingLostANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataImageTrackingLostANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataImageTrackingLostANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataImageTrackingLostANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataImageTrackingLostANDROID.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEventDataImageTrackingLostANDROID.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataImageTrackingLostANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataImageTrackingLostANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataImageTrackingLostANDROID} structs. */
    public static class Buffer extends StructBuffer<XrEventDataImageTrackingLostANDROID, Buffer> implements NativeResource {

        private static final XrEventDataImageTrackingLostANDROID ELEMENT_FACTORY = XrEventDataImageTrackingLostANDROID.create(-1L);

        /**
         * Creates a new {@code XrEventDataImageTrackingLostANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataImageTrackingLostANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataImageTrackingLostANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataImageTrackingLostANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataImageTrackingLostANDROID.nnext(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEventDataImageTrackingLostANDROID.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataImageTrackingLostANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataImageTrackingLostANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID} value to the {@code type} field. */
        public XrEventDataImageTrackingLostANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_EVENT_DATA_IMAGE_TRACKING_LOST_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataImageTrackingLostANDROID.Buffer next(@NativeType("void const *") long value) { XrEventDataImageTrackingLostANDROID.nnext(address(), value); return this; }

    }

}