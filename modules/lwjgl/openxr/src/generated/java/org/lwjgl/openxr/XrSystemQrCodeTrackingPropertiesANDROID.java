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
 * struct XrSystemQrCodeTrackingPropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsQrCodeTracking;
 *     XrBool32 supportsQrCodeSizeEstimation;
 *     uint16_t maxQrCodeCount;
 * }}</pre>
 */
public class XrSystemQrCodeTrackingPropertiesANDROID extends Struct<XrSystemQrCodeTrackingPropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSQRCODETRACKING,
        SUPPORTSQRCODESIZEESTIMATION,
        MAXQRCODECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSQRCODETRACKING = layout.offsetof(2);
        SUPPORTSQRCODESIZEESTIMATION = layout.offsetof(3);
        MAXQRCODECOUNT = layout.offsetof(4);
    }

    protected XrSystemQrCodeTrackingPropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemQrCodeTrackingPropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemQrCodeTrackingPropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemQrCodeTrackingPropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemQrCodeTrackingPropertiesANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code supportsQrCodeTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsQrCodeTracking() { return nsupportsQrCodeTracking(address()) != 0; }
    /** @return the value of the {@code supportsQrCodeSizeEstimation} field. */
    @NativeType("XrBool32")
    public boolean supportsQrCodeSizeEstimation() { return nsupportsQrCodeSizeEstimation(address()) != 0; }
    /** @return the value of the {@code maxQrCodeCount} field. */
    @NativeType("uint16_t")
    public short maxQrCodeCount() { return nmaxQrCodeCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemQrCodeTrackingPropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesQrCode#XR_TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemQrCodeTrackingPropertiesANDROID type$Default() { return type(ANDROIDTrackablesQrCode.XR_TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemQrCodeTrackingPropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemQrCodeTrackingPropertiesANDROID set(
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
    public XrSystemQrCodeTrackingPropertiesANDROID set(XrSystemQrCodeTrackingPropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemQrCodeTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemQrCodeTrackingPropertiesANDROID malloc() {
        return new XrSystemQrCodeTrackingPropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemQrCodeTrackingPropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemQrCodeTrackingPropertiesANDROID calloc() {
        return new XrSystemQrCodeTrackingPropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemQrCodeTrackingPropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemQrCodeTrackingPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemQrCodeTrackingPropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemQrCodeTrackingPropertiesANDROID} instance for the specified memory address. */
    public static XrSystemQrCodeTrackingPropertiesANDROID create(long address) {
        return new XrSystemQrCodeTrackingPropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemQrCodeTrackingPropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemQrCodeTrackingPropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemQrCodeTrackingPropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemQrCodeTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemQrCodeTrackingPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemQrCodeTrackingPropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemQrCodeTrackingPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemQrCodeTrackingPropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemQrCodeTrackingPropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemQrCodeTrackingPropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsQrCodeTracking}. */
    public static int nsupportsQrCodeTracking(long struct) { return memGetInt(struct + XrSystemQrCodeTrackingPropertiesANDROID.SUPPORTSQRCODETRACKING); }
    /** Unsafe version of {@link #supportsQrCodeSizeEstimation}. */
    public static int nsupportsQrCodeSizeEstimation(long struct) { return memGetInt(struct + XrSystemQrCodeTrackingPropertiesANDROID.SUPPORTSQRCODESIZEESTIMATION); }
    /** Unsafe version of {@link #maxQrCodeCount}. */
    public static short nmaxQrCodeCount(long struct) { return memGetShort(struct + XrSystemQrCodeTrackingPropertiesANDROID.MAXQRCODECOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemQrCodeTrackingPropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemQrCodeTrackingPropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemQrCodeTrackingPropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemQrCodeTrackingPropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemQrCodeTrackingPropertiesANDROID ELEMENT_FACTORY = XrSystemQrCodeTrackingPropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemQrCodeTrackingPropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemQrCodeTrackingPropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemQrCodeTrackingPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemQrCodeTrackingPropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemQrCodeTrackingPropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsQrCodeTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsQrCodeTracking() { return XrSystemQrCodeTrackingPropertiesANDROID.nsupportsQrCodeTracking(address()) != 0; }
        /** @return the value of the {@code supportsQrCodeSizeEstimation} field. */
        @NativeType("XrBool32")
        public boolean supportsQrCodeSizeEstimation() { return XrSystemQrCodeTrackingPropertiesANDROID.nsupportsQrCodeSizeEstimation(address()) != 0; }
        /** @return the value of the {@code maxQrCodeCount} field. */
        @NativeType("uint16_t")
        public short maxQrCodeCount() { return XrSystemQrCodeTrackingPropertiesANDROID.nmaxQrCodeCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemQrCodeTrackingPropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemQrCodeTrackingPropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesQrCode#XR_TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemQrCodeTrackingPropertiesANDROID.Buffer type$Default() { return type(ANDROIDTrackablesQrCode.XR_TYPE_SYSTEM_QR_CODE_TRACKING_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemQrCodeTrackingPropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemQrCodeTrackingPropertiesANDROID.nnext(address(), value); return this; }

    }

}