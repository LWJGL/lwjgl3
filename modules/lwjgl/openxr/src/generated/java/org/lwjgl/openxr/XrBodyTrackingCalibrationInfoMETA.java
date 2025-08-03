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
 * struct XrBodyTrackingCalibrationInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 *     float bodyHeight;
 * }}</pre>
 */
public class XrBodyTrackingCalibrationInfoMETA extends Struct<XrBodyTrackingCalibrationInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BODYHEIGHT;

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
        BODYHEIGHT = layout.offsetof(2);
    }

    protected XrBodyTrackingCalibrationInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackingCalibrationInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackingCalibrationInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackingCalibrationInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackingCalibrationInfoMETA(ByteBuffer container) {
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
    /** @return the value of the {@code bodyHeight} field. */
    public float bodyHeight() { return nbodyHeight(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackingCalibrationInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METABodyTrackingCalibration#XR_TYPE_BODY_TRACKING_CALIBRATION_INFO_META TYPE_BODY_TRACKING_CALIBRATION_INFO_META} value to the {@code type} field. */
    public XrBodyTrackingCalibrationInfoMETA type$Default() { return type(METABodyTrackingCalibration.XR_TYPE_BODY_TRACKING_CALIBRATION_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackingCalibrationInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code bodyHeight} field. */
    public XrBodyTrackingCalibrationInfoMETA bodyHeight(float value) { nbodyHeight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackingCalibrationInfoMETA set(
        int type,
        long next,
        float bodyHeight
    ) {
        type(type);
        next(next);
        bodyHeight(bodyHeight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyTrackingCalibrationInfoMETA set(XrBodyTrackingCalibrationInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackingCalibrationInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingCalibrationInfoMETA malloc() {
        return new XrBodyTrackingCalibrationInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingCalibrationInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingCalibrationInfoMETA calloc() {
        return new XrBodyTrackingCalibrationInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingCalibrationInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackingCalibrationInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackingCalibrationInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackingCalibrationInfoMETA} instance for the specified memory address. */
    public static XrBodyTrackingCalibrationInfoMETA create(long address) {
        return new XrBodyTrackingCalibrationInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackingCalibrationInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackingCalibrationInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackingCalibrationInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackingCalibrationInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackingCalibrationInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingCalibrationInfoMETA malloc(MemoryStack stack) {
        return new XrBodyTrackingCalibrationInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackingCalibrationInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingCalibrationInfoMETA calloc(MemoryStack stack) {
        return new XrBodyTrackingCalibrationInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackingCalibrationInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackingCalibrationInfoMETA.NEXT); }
    /** Unsafe version of {@link #bodyHeight}. */
    public static float nbodyHeight(long struct) { return memGetFloat(struct + XrBodyTrackingCalibrationInfoMETA.BODYHEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackingCalibrationInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackingCalibrationInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #bodyHeight(float) bodyHeight}. */
    public static void nbodyHeight(long struct, float value) { memPutFloat(struct + XrBodyTrackingCalibrationInfoMETA.BODYHEIGHT, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackingCalibrationInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackingCalibrationInfoMETA, Buffer> implements NativeResource {

        private static final XrBodyTrackingCalibrationInfoMETA ELEMENT_FACTORY = XrBodyTrackingCalibrationInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackingCalibrationInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackingCalibrationInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackingCalibrationInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackingCalibrationInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyTrackingCalibrationInfoMETA.nnext(address()); }
        /** @return the value of the {@code bodyHeight} field. */
        public float bodyHeight() { return XrBodyTrackingCalibrationInfoMETA.nbodyHeight(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackingCalibrationInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackingCalibrationInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METABodyTrackingCalibration#XR_TYPE_BODY_TRACKING_CALIBRATION_INFO_META TYPE_BODY_TRACKING_CALIBRATION_INFO_META} value to the {@code type} field. */
        public XrBodyTrackingCalibrationInfoMETA.Buffer type$Default() { return type(METABodyTrackingCalibration.XR_TYPE_BODY_TRACKING_CALIBRATION_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackingCalibrationInfoMETA.Buffer next(@NativeType("void const *") long value) { XrBodyTrackingCalibrationInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code bodyHeight} field. */
        public XrBodyTrackingCalibrationInfoMETA.Buffer bodyHeight(float value) { XrBodyTrackingCalibrationInfoMETA.nbodyHeight(address(), value); return this; }

    }

}