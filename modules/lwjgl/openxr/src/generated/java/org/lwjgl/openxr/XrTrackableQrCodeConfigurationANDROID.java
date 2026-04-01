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
 * struct XrTrackableQrCodeConfigurationANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrQrCodeTrackingModeANDROID trackingMode;
 *     float qrCodeEdgeSize;
 * }}</pre>
 */
public class XrTrackableQrCodeConfigurationANDROID extends Struct<XrTrackableQrCodeConfigurationANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGMODE,
        QRCODEEDGESIZE;

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
        TRACKINGMODE = layout.offsetof(2);
        QRCODEEDGESIZE = layout.offsetof(3);
    }

    protected XrTrackableQrCodeConfigurationANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableQrCodeConfigurationANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableQrCodeConfigurationANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableQrCodeConfigurationANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableQrCodeConfigurationANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackingMode} field. */
    @NativeType("XrQrCodeTrackingModeANDROID")
    public int trackingMode() { return ntrackingMode(address()); }
    /** @return the value of the {@code qrCodeEdgeSize} field. */
    public float qrCodeEdgeSize() { return nqrCodeEdgeSize(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableQrCodeConfigurationANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesQrCode#XR_TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID} value to the {@code type} field. */
    public XrTrackableQrCodeConfigurationANDROID type$Default() { return type(ANDROIDTrackablesQrCode.XR_TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableQrCodeConfigurationANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingMode} field. */
    public XrTrackableQrCodeConfigurationANDROID trackingMode(@NativeType("XrQrCodeTrackingModeANDROID") int value) { ntrackingMode(address(), value); return this; }
    /** Sets the specified value to the {@code qrCodeEdgeSize} field. */
    public XrTrackableQrCodeConfigurationANDROID qrCodeEdgeSize(float value) { nqrCodeEdgeSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableQrCodeConfigurationANDROID set(
        int type,
        long next,
        int trackingMode,
        float qrCodeEdgeSize
    ) {
        type(type);
        next(next);
        trackingMode(trackingMode);
        qrCodeEdgeSize(qrCodeEdgeSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableQrCodeConfigurationANDROID set(XrTrackableQrCodeConfigurationANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableQrCodeConfigurationANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableQrCodeConfigurationANDROID malloc() {
        return new XrTrackableQrCodeConfigurationANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableQrCodeConfigurationANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableQrCodeConfigurationANDROID calloc() {
        return new XrTrackableQrCodeConfigurationANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableQrCodeConfigurationANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableQrCodeConfigurationANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableQrCodeConfigurationANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableQrCodeConfigurationANDROID} instance for the specified memory address. */
    public static XrTrackableQrCodeConfigurationANDROID create(long address) {
        return new XrTrackableQrCodeConfigurationANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableQrCodeConfigurationANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableQrCodeConfigurationANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeConfigurationANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeConfigurationANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeConfigurationANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeConfigurationANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeConfigurationANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableQrCodeConfigurationANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeConfigurationANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableQrCodeConfigurationANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableQrCodeConfigurationANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableQrCodeConfigurationANDROID malloc(MemoryStack stack) {
        return new XrTrackableQrCodeConfigurationANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableQrCodeConfigurationANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableQrCodeConfigurationANDROID calloc(MemoryStack stack) {
        return new XrTrackableQrCodeConfigurationANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeConfigurationANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableQrCodeConfigurationANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableQrCodeConfigurationANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableQrCodeConfigurationANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableQrCodeConfigurationANDROID.NEXT); }
    /** Unsafe version of {@link #trackingMode}. */
    public static int ntrackingMode(long struct) { return memGetInt(struct + XrTrackableQrCodeConfigurationANDROID.TRACKINGMODE); }
    /** Unsafe version of {@link #qrCodeEdgeSize}. */
    public static float nqrCodeEdgeSize(long struct) { return memGetFloat(struct + XrTrackableQrCodeConfigurationANDROID.QRCODEEDGESIZE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableQrCodeConfigurationANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableQrCodeConfigurationANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingMode(int) trackingMode}. */
    public static void ntrackingMode(long struct, int value) { memPutInt(struct + XrTrackableQrCodeConfigurationANDROID.TRACKINGMODE, value); }
    /** Unsafe version of {@link #qrCodeEdgeSize(float) qrCodeEdgeSize}. */
    public static void nqrCodeEdgeSize(long struct, float value) { memPutFloat(struct + XrTrackableQrCodeConfigurationANDROID.QRCODEEDGESIZE, value); }

    // -----------------------------------

    /** An array of {@link XrTrackableQrCodeConfigurationANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableQrCodeConfigurationANDROID, Buffer> implements NativeResource {

        private static final XrTrackableQrCodeConfigurationANDROID ELEMENT_FACTORY = XrTrackableQrCodeConfigurationANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableQrCodeConfigurationANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableQrCodeConfigurationANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableQrCodeConfigurationANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableQrCodeConfigurationANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackableQrCodeConfigurationANDROID.nnext(address()); }
        /** @return the value of the {@code trackingMode} field. */
        @NativeType("XrQrCodeTrackingModeANDROID")
        public int trackingMode() { return XrTrackableQrCodeConfigurationANDROID.ntrackingMode(address()); }
        /** @return the value of the {@code qrCodeEdgeSize} field. */
        public float qrCodeEdgeSize() { return XrTrackableQrCodeConfigurationANDROID.nqrCodeEdgeSize(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableQrCodeConfigurationANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableQrCodeConfigurationANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesQrCode#XR_TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID} value to the {@code type} field. */
        public XrTrackableQrCodeConfigurationANDROID.Buffer type$Default() { return type(ANDROIDTrackablesQrCode.XR_TYPE_TRACKABLE_QR_CODE_CONFIGURATION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableQrCodeConfigurationANDROID.Buffer next(@NativeType("void *") long value) { XrTrackableQrCodeConfigurationANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingMode} field. */
        public XrTrackableQrCodeConfigurationANDROID.Buffer trackingMode(@NativeType("XrQrCodeTrackingModeANDROID") int value) { XrTrackableQrCodeConfigurationANDROID.ntrackingMode(address(), value); return this; }
        /** Sets the specified value to the {@code qrCodeEdgeSize} field. */
        public XrTrackableQrCodeConfigurationANDROID.Buffer qrCodeEdgeSize(float value) { XrTrackableQrCodeConfigurationANDROID.nqrCodeEdgeSize(address(), value); return this; }

    }

}