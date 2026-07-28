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
 * struct XrBodyTrackingCalibrationStatusMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBodyTrackingCalibrationStateMETA status;
 * }}</pre>
 */
public class XrBodyTrackingCalibrationStatusMETA extends Struct<XrBodyTrackingCalibrationStatusMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATUS;

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
        STATUS = layout.offsetof(2);
    }

    protected XrBodyTrackingCalibrationStatusMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackingCalibrationStatusMETA create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackingCalibrationStatusMETA(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackingCalibrationStatusMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackingCalibrationStatusMETA(ByteBuffer container) {
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
    /** @return the value of the {@code status} field. */
    @NativeType("XrBodyTrackingCalibrationStateMETA")
    public int status() { return nstatus(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackingCalibrationStatusMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METABodyTrackingCalibration#XR_TYPE_BODY_TRACKING_CALIBRATION_STATUS_META TYPE_BODY_TRACKING_CALIBRATION_STATUS_META} value to the {@code type} field. */
    public XrBodyTrackingCalibrationStatusMETA type$Default() { return type(METABodyTrackingCalibration.XR_TYPE_BODY_TRACKING_CALIBRATION_STATUS_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackingCalibrationStatusMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackingCalibrationStatusMETA set(
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
    public XrBodyTrackingCalibrationStatusMETA set(XrBodyTrackingCalibrationStatusMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackingCalibrationStatusMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingCalibrationStatusMETA malloc() {
        return new XrBodyTrackingCalibrationStatusMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingCalibrationStatusMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingCalibrationStatusMETA calloc() {
        return new XrBodyTrackingCalibrationStatusMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingCalibrationStatusMETA} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackingCalibrationStatusMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackingCalibrationStatusMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackingCalibrationStatusMETA} instance for the specified memory address. */
    public static XrBodyTrackingCalibrationStatusMETA create(long address) {
        return new XrBodyTrackingCalibrationStatusMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackingCalibrationStatusMETA createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackingCalibrationStatusMETA(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationStatusMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationStatusMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationStatusMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationStatusMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationStatusMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationStatusMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackingCalibrationStatusMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationStatusMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackingCalibrationStatusMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackingCalibrationStatusMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingCalibrationStatusMETA malloc(MemoryStack stack) {
        return new XrBodyTrackingCalibrationStatusMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackingCalibrationStatusMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingCalibrationStatusMETA calloc(MemoryStack stack) {
        return new XrBodyTrackingCalibrationStatusMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationStatusMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationStatusMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingCalibrationStatusMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingCalibrationStatusMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackingCalibrationStatusMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackingCalibrationStatusMETA.NEXT); }
    /** Unsafe version of {@link #status}. */
    public static int nstatus(long struct) { return memGetInt(struct + XrBodyTrackingCalibrationStatusMETA.STATUS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackingCalibrationStatusMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackingCalibrationStatusMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackingCalibrationStatusMETA} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackingCalibrationStatusMETA, Buffer> implements NativeResource {

        private static final XrBodyTrackingCalibrationStatusMETA ELEMENT_FACTORY = XrBodyTrackingCalibrationStatusMETA.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackingCalibrationStatusMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackingCalibrationStatusMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackingCalibrationStatusMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackingCalibrationStatusMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyTrackingCalibrationStatusMETA.nnext(address()); }
        /** @return the value of the {@code status} field. */
        @NativeType("XrBodyTrackingCalibrationStateMETA")
        public int status() { return XrBodyTrackingCalibrationStatusMETA.nstatus(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackingCalibrationStatusMETA.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackingCalibrationStatusMETA.ntype(address(), value); return this; }
        /** Sets the {@link METABodyTrackingCalibration#XR_TYPE_BODY_TRACKING_CALIBRATION_STATUS_META TYPE_BODY_TRACKING_CALIBRATION_STATUS_META} value to the {@code type} field. */
        public XrBodyTrackingCalibrationStatusMETA.Buffer type$Default() { return type(METABodyTrackingCalibration.XR_TYPE_BODY_TRACKING_CALIBRATION_STATUS_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackingCalibrationStatusMETA.Buffer next(@NativeType("void *") long value) { XrBodyTrackingCalibrationStatusMETA.nnext(address(), value); return this; }

    }

}