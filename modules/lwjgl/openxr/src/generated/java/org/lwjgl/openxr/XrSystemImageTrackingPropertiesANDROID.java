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
 * struct XrSystemImageTrackingPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsImageTracking;
 *     XrBool32 supportsPhysicalSizeEstimation;
 *     uint32_t maxTrackedImageCount;
 *     uint32_t maxLoadedImageCount;
 * }}</pre>
 */
public class XrSystemImageTrackingPropertiesANDROID extends Struct<XrSystemImageTrackingPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSIMAGETRACKING,
        SUPPORTSPHYSICALSIZEESTIMATION,
        MAXTRACKEDIMAGECOUNT,
        MAXLOADEDIMAGECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSIMAGETRACKING = layout.offsetof(2);
        SUPPORTSPHYSICALSIZEESTIMATION = layout.offsetof(3);
        MAXTRACKEDIMAGECOUNT = layout.offsetof(4);
        MAXLOADEDIMAGECOUNT = layout.offsetof(5);
    }

    protected XrSystemImageTrackingPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemImageTrackingPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemImageTrackingPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemImageTrackingPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemImageTrackingPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsImageTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsImageTracking() { return nsupportsImageTracking(address()) != 0; }
    /** @return the value of the {@code supportsPhysicalSizeEstimation} field. */
    @NativeType("XrBool32")
    public boolean supportsPhysicalSizeEstimation() { return nsupportsPhysicalSizeEstimation(address()) != 0; }
    /** @return the value of the {@code maxTrackedImageCount} field. */
    @NativeType("uint32_t")
    public int maxTrackedImageCount() { return nmaxTrackedImageCount(address()); }
    /** @return the value of the {@code maxLoadedImageCount} field. */
    @NativeType("uint32_t")
    public int maxLoadedImageCount() { return nmaxLoadedImageCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemImageTrackingPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemImageTrackingPropertiesANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemImageTrackingPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemImageTrackingPropertiesANDROID set(
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
    public XrSystemImageTrackingPropertiesANDROID set(XrSystemImageTrackingPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemImageTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemImageTrackingPropertiesANDROID malloc() {
        return new XrSystemImageTrackingPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemImageTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemImageTrackingPropertiesANDROID calloc() {
        return new XrSystemImageTrackingPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemImageTrackingPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemImageTrackingPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemImageTrackingPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemImageTrackingPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemImageTrackingPropertiesANDROID create(long address) {
        return new XrSystemImageTrackingPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemImageTrackingPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemImageTrackingPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemImageTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemImageTrackingPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemImageTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemImageTrackingPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemImageTrackingPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemImageTrackingPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemImageTrackingPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemImageTrackingPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemImageTrackingPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemImageTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemImageTrackingPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemImageTrackingPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemImageTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemImageTrackingPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemImageTrackingPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemImageTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemImageTrackingPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemImageTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemImageTrackingPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemImageTrackingPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemImageTrackingPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsImageTracking}. */
    public static int nsupportsImageTracking(long struct) { return memGetInt(struct + XrSystemImageTrackingPropertiesANDROID.SUPPORTSIMAGETRACKING); }
    /** Unsafe version of {@link #supportsPhysicalSizeEstimation}. */
    public static int nsupportsPhysicalSizeEstimation(long struct) { return memGetInt(struct + XrSystemImageTrackingPropertiesANDROID.SUPPORTSPHYSICALSIZEESTIMATION); }
    /** Unsafe version of {@link #maxTrackedImageCount}. */
    public static int nmaxTrackedImageCount(long struct) { return memGetInt(struct + XrSystemImageTrackingPropertiesANDROID.MAXTRACKEDIMAGECOUNT); }
    /** Unsafe version of {@link #maxLoadedImageCount}. */
    public static int nmaxLoadedImageCount(long struct) { return memGetInt(struct + XrSystemImageTrackingPropertiesANDROID.MAXLOADEDIMAGECOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemImageTrackingPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemImageTrackingPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemImageTrackingPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemImageTrackingPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemImageTrackingPropertiesANDROID ELEMENT_FACTORY = XrSystemImageTrackingPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemImageTrackingPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemImageTrackingPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemImageTrackingPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemImageTrackingPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemImageTrackingPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsImageTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsImageTracking() { return XrSystemImageTrackingPropertiesANDROID.nsupportsImageTracking(address()) != 0; }
        /** @return the value of the {@code supportsPhysicalSizeEstimation} field. */
        @NativeType("XrBool32")
        public boolean supportsPhysicalSizeEstimation() { return XrSystemImageTrackingPropertiesANDROID.nsupportsPhysicalSizeEstimation(address()) != 0; }
        /** @return the value of the {@code maxTrackedImageCount} field. */
        @NativeType("uint32_t")
        public int maxTrackedImageCount() { return XrSystemImageTrackingPropertiesANDROID.nmaxTrackedImageCount(address()); }
        /** @return the value of the {@code maxLoadedImageCount} field. */
        @NativeType("uint32_t")
        public int maxLoadedImageCount() { return XrSystemImageTrackingPropertiesANDROID.nmaxLoadedImageCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemImageTrackingPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemImageTrackingPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemImageTrackingPropertiesANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_SYSTEM_IMAGE_TRACKING_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemImageTrackingPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemImageTrackingPropertiesANDROID.nnext(address(), value); return this; }

    }

}