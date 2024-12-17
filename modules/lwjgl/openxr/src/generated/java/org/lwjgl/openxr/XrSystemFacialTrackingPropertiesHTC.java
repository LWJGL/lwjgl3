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
 * struct XrSystemFacialTrackingPropertiesHTC {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportEyeFacialTracking;
 *     XrBool32 supportLipFacialTracking;
 * }}</pre>
 */
public class XrSystemFacialTrackingPropertiesHTC extends Struct<XrSystemFacialTrackingPropertiesHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTEYEFACIALTRACKING,
        SUPPORTLIPFACIALTRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTEYEFACIALTRACKING = layout.offsetof(2);
        SUPPORTLIPFACIALTRACKING = layout.offsetof(3);
    }

    protected XrSystemFacialTrackingPropertiesHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemFacialTrackingPropertiesHTC create(long address, @Nullable ByteBuffer container) {
        return new XrSystemFacialTrackingPropertiesHTC(address, container);
    }

    /**
     * Creates a {@code XrSystemFacialTrackingPropertiesHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemFacialTrackingPropertiesHTC(ByteBuffer container) {
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
    /** @return the value of the {@code supportEyeFacialTracking} field. */
    @NativeType("XrBool32")
    public boolean supportEyeFacialTracking() { return nsupportEyeFacialTracking(address()) != 0; }
    /** @return the value of the {@code supportLipFacialTracking} field. */
    @NativeType("XrBool32")
    public boolean supportLipFacialTracking() { return nsupportLipFacialTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemFacialTrackingPropertiesHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFacialTracking#XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC} value to the {@code type} field. */
    public XrSystemFacialTrackingPropertiesHTC type$Default() { return type(HTCFacialTracking.XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemFacialTrackingPropertiesHTC next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemFacialTrackingPropertiesHTC set(
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
    public XrSystemFacialTrackingPropertiesHTC set(XrSystemFacialTrackingPropertiesHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemFacialTrackingPropertiesHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemFacialTrackingPropertiesHTC malloc() {
        return new XrSystemFacialTrackingPropertiesHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFacialTrackingPropertiesHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemFacialTrackingPropertiesHTC calloc() {
        return new XrSystemFacialTrackingPropertiesHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFacialTrackingPropertiesHTC} instance allocated with {@link BufferUtils}. */
    public static XrSystemFacialTrackingPropertiesHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemFacialTrackingPropertiesHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemFacialTrackingPropertiesHTC} instance for the specified memory address. */
    public static XrSystemFacialTrackingPropertiesHTC create(long address) {
        return new XrSystemFacialTrackingPropertiesHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemFacialTrackingPropertiesHTC createSafe(long address) {
        return address == NULL ? null : new XrSystemFacialTrackingPropertiesHTC(address, null);
    }

    /**
     * Returns a new {@link XrSystemFacialTrackingPropertiesHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFacialTrackingPropertiesHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemFacialTrackingPropertiesHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFacialTrackingPropertiesHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFacialTrackingPropertiesHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFacialTrackingPropertiesHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemFacialTrackingPropertiesHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemFacialTrackingPropertiesHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemFacialTrackingPropertiesHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemFacialTrackingPropertiesHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFacialTrackingPropertiesHTC malloc(MemoryStack stack) {
        return new XrSystemFacialTrackingPropertiesHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemFacialTrackingPropertiesHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFacialTrackingPropertiesHTC calloc(MemoryStack stack) {
        return new XrSystemFacialTrackingPropertiesHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemFacialTrackingPropertiesHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFacialTrackingPropertiesHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFacialTrackingPropertiesHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFacialTrackingPropertiesHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemFacialTrackingPropertiesHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemFacialTrackingPropertiesHTC.NEXT); }
    /** Unsafe version of {@link #supportEyeFacialTracking}. */
    public static int nsupportEyeFacialTracking(long struct) { return memGetInt(struct + XrSystemFacialTrackingPropertiesHTC.SUPPORTEYEFACIALTRACKING); }
    /** Unsafe version of {@link #supportLipFacialTracking}. */
    public static int nsupportLipFacialTracking(long struct) { return memGetInt(struct + XrSystemFacialTrackingPropertiesHTC.SUPPORTLIPFACIALTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemFacialTrackingPropertiesHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemFacialTrackingPropertiesHTC.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemFacialTrackingPropertiesHTC} structs. */
    public static class Buffer extends StructBuffer<XrSystemFacialTrackingPropertiesHTC, Buffer> implements NativeResource {

        private static final XrSystemFacialTrackingPropertiesHTC ELEMENT_FACTORY = XrSystemFacialTrackingPropertiesHTC.create(-1L);

        /**
         * Creates a new {@code XrSystemFacialTrackingPropertiesHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemFacialTrackingPropertiesHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemFacialTrackingPropertiesHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemFacialTrackingPropertiesHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemFacialTrackingPropertiesHTC.nnext(address()); }
        /** @return the value of the {@code supportEyeFacialTracking} field. */
        @NativeType("XrBool32")
        public boolean supportEyeFacialTracking() { return XrSystemFacialTrackingPropertiesHTC.nsupportEyeFacialTracking(address()) != 0; }
        /** @return the value of the {@code supportLipFacialTracking} field. */
        @NativeType("XrBool32")
        public boolean supportLipFacialTracking() { return XrSystemFacialTrackingPropertiesHTC.nsupportLipFacialTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemFacialTrackingPropertiesHTC.Buffer type(@NativeType("XrStructureType") int value) { XrSystemFacialTrackingPropertiesHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFacialTracking#XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC} value to the {@code type} field. */
        public XrSystemFacialTrackingPropertiesHTC.Buffer type$Default() { return type(HTCFacialTracking.XR_TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemFacialTrackingPropertiesHTC.Buffer next(@NativeType("void *") long value) { XrSystemFacialTrackingPropertiesHTC.nnext(address(), value); return this; }

    }

}