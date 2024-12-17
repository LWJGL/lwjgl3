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
 * struct XrEventDataEyeCalibrationChangedML {
 *     XrStructureType type;
 *     void const * next;
 *     XrEyeCalibrationStatusML status;
 * }}</pre>
 */
public class XrEventDataEyeCalibrationChangedML extends Struct<XrEventDataEyeCalibrationChangedML> implements NativeResource {

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

    protected XrEventDataEyeCalibrationChangedML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataEyeCalibrationChangedML create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataEyeCalibrationChangedML(address, container);
    }

    /**
     * Creates a {@code XrEventDataEyeCalibrationChangedML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataEyeCalibrationChangedML(ByteBuffer container) {
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
    /** @return the value of the {@code status} field. */
    @NativeType("XrEyeCalibrationStatusML")
    public int status() { return nstatus(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataEyeCalibrationChangedML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLUserCalibration#XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML} value to the {@code type} field. */
    public XrEventDataEyeCalibrationChangedML type$Default() { return type(MLUserCalibration.XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataEyeCalibrationChangedML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataEyeCalibrationChangedML set(
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
    public XrEventDataEyeCalibrationChangedML set(XrEventDataEyeCalibrationChangedML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataEyeCalibrationChangedML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataEyeCalibrationChangedML malloc() {
        return new XrEventDataEyeCalibrationChangedML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataEyeCalibrationChangedML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataEyeCalibrationChangedML calloc() {
        return new XrEventDataEyeCalibrationChangedML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataEyeCalibrationChangedML} instance allocated with {@link BufferUtils}. */
    public static XrEventDataEyeCalibrationChangedML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataEyeCalibrationChangedML(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataEyeCalibrationChangedML} instance for the specified memory address. */
    public static XrEventDataEyeCalibrationChangedML create(long address) {
        return new XrEventDataEyeCalibrationChangedML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataEyeCalibrationChangedML createSafe(long address) {
        return address == NULL ? null : new XrEventDataEyeCalibrationChangedML(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataEyeCalibrationChangedML}. */
    public static XrEventDataEyeCalibrationChangedML create(XrEventDataBaseHeader value) {
        return new XrEventDataEyeCalibrationChangedML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataEyeCalibrationChangedML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEyeCalibrationChangedML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEyeCalibrationChangedML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEyeCalibrationChangedML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEyeCalibrationChangedML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEyeCalibrationChangedML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataEyeCalibrationChangedML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataEyeCalibrationChangedML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataEyeCalibrationChangedML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataEyeCalibrationChangedML.Buffer}. */
    public static XrEventDataEyeCalibrationChangedML.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataEyeCalibrationChangedML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataEyeCalibrationChangedML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEyeCalibrationChangedML malloc(MemoryStack stack) {
        return new XrEventDataEyeCalibrationChangedML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataEyeCalibrationChangedML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEyeCalibrationChangedML calloc(MemoryStack stack) {
        return new XrEventDataEyeCalibrationChangedML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataEyeCalibrationChangedML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEyeCalibrationChangedML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEyeCalibrationChangedML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEyeCalibrationChangedML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataEyeCalibrationChangedML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataEyeCalibrationChangedML.NEXT); }
    /** Unsafe version of {@link #status}. */
    public static int nstatus(long struct) { return memGetInt(struct + XrEventDataEyeCalibrationChangedML.STATUS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataEyeCalibrationChangedML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataEyeCalibrationChangedML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataEyeCalibrationChangedML} structs. */
    public static class Buffer extends StructBuffer<XrEventDataEyeCalibrationChangedML, Buffer> implements NativeResource {

        private static final XrEventDataEyeCalibrationChangedML ELEMENT_FACTORY = XrEventDataEyeCalibrationChangedML.create(-1L);

        /**
         * Creates a new {@code XrEventDataEyeCalibrationChangedML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataEyeCalibrationChangedML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataEyeCalibrationChangedML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataEyeCalibrationChangedML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataEyeCalibrationChangedML.nnext(address()); }
        /** @return the value of the {@code status} field. */
        @NativeType("XrEyeCalibrationStatusML")
        public int status() { return XrEventDataEyeCalibrationChangedML.nstatus(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataEyeCalibrationChangedML.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataEyeCalibrationChangedML.ntype(address(), value); return this; }
        /** Sets the {@link MLUserCalibration#XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML} value to the {@code type} field. */
        public XrEventDataEyeCalibrationChangedML.Buffer type$Default() { return type(MLUserCalibration.XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataEyeCalibrationChangedML.Buffer next(@NativeType("void const *") long value) { XrEventDataEyeCalibrationChangedML.nnext(address(), value); return this; }

    }

}