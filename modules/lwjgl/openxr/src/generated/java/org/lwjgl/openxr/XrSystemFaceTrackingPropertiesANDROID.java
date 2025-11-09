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
 * struct XrSystemFaceTrackingPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsFaceTracking;
 * }}</pre>
 */
public class XrSystemFaceTrackingPropertiesANDROID extends Struct<XrSystemFaceTrackingPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSFACETRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSFACETRACKING = layout.offsetof(2);
    }

    protected XrSystemFaceTrackingPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemFaceTrackingPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemFaceTrackingPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemFaceTrackingPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemFaceTrackingPropertiesANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsFaceTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsFaceTracking() { return nsupportsFaceTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemFaceTrackingPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDFaceTracking#XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemFaceTrackingPropertiesANDROID type$Default() { return type(ANDROIDFaceTracking.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemFaceTrackingPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemFaceTrackingPropertiesANDROID set(
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
    public XrSystemFaceTrackingPropertiesANDROID set(XrSystemFaceTrackingPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemFaceTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemFaceTrackingPropertiesANDROID malloc() {
        return new XrSystemFaceTrackingPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFaceTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemFaceTrackingPropertiesANDROID calloc() {
        return new XrSystemFaceTrackingPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFaceTrackingPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemFaceTrackingPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemFaceTrackingPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemFaceTrackingPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemFaceTrackingPropertiesANDROID create(long address) {
        return new XrSystemFaceTrackingPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemFaceTrackingPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemFaceTrackingPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemFaceTrackingPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemFaceTrackingPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemFaceTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFaceTrackingPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemFaceTrackingPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemFaceTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFaceTrackingPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemFaceTrackingPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFaceTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFaceTrackingPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemFaceTrackingPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemFaceTrackingPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsFaceTracking}. */
    public static int nsupportsFaceTracking(long struct) { return memGetInt(struct + XrSystemFaceTrackingPropertiesANDROID.SUPPORTSFACETRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemFaceTrackingPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemFaceTrackingPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemFaceTrackingPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemFaceTrackingPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemFaceTrackingPropertiesANDROID ELEMENT_FACTORY = XrSystemFaceTrackingPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemFaceTrackingPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemFaceTrackingPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemFaceTrackingPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemFaceTrackingPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemFaceTrackingPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsFaceTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsFaceTracking() { return XrSystemFaceTrackingPropertiesANDROID.nsupportsFaceTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemFaceTrackingPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemFaceTrackingPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDFaceTracking#XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemFaceTrackingPropertiesANDROID.Buffer type$Default() { return type(ANDROIDFaceTracking.XR_TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemFaceTrackingPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemFaceTrackingPropertiesANDROID.nnext(address(), value); return this; }

    }

}