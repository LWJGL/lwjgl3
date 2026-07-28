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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSenseDataFilterPlaneOrientationBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t orientationCount;
 *     XrPlaneOrientationBD * orientations;
 * }}</pre>
 */
public class XrSenseDataFilterPlaneOrientationBD extends Struct<XrSenseDataFilterPlaneOrientationBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ORIENTATIONCOUNT,
        ORIENTATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ORIENTATIONCOUNT = layout.offsetof(2);
        ORIENTATIONS = layout.offsetof(3);
    }

    protected XrSenseDataFilterPlaneOrientationBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataFilterPlaneOrientationBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataFilterPlaneOrientationBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataFilterPlaneOrientationBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataFilterPlaneOrientationBD(ByteBuffer container) {
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
    /** @return the value of the {@code orientationCount} field. */
    @NativeType("uint32_t")
    public int orientationCount() { return norientationCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code orientations} field. */
    @NativeType("XrPlaneOrientationBD *")
    public IntBuffer orientations() { return norientations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataFilterPlaneOrientationBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialPlane#XR_TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD} value to the {@code type} field. */
    public XrSenseDataFilterPlaneOrientationBD type$Default() { return type(BDSpatialPlane.XR_TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataFilterPlaneOrientationBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code orientations} field. */
    public XrSenseDataFilterPlaneOrientationBD orientations(@NativeType("XrPlaneOrientationBD *") IntBuffer value) { norientations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataFilterPlaneOrientationBD set(
        int type,
        long next,
        IntBuffer orientations
    ) {
        type(type);
        next(next);
        orientations(orientations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataFilterPlaneOrientationBD set(XrSenseDataFilterPlaneOrientationBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataFilterPlaneOrientationBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterPlaneOrientationBD malloc() {
        return new XrSenseDataFilterPlaneOrientationBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterPlaneOrientationBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterPlaneOrientationBD calloc() {
        return new XrSenseDataFilterPlaneOrientationBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterPlaneOrientationBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataFilterPlaneOrientationBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataFilterPlaneOrientationBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataFilterPlaneOrientationBD} instance for the specified memory address. */
    public static XrSenseDataFilterPlaneOrientationBD create(long address) {
        return new XrSenseDataFilterPlaneOrientationBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataFilterPlaneOrientationBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataFilterPlaneOrientationBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterPlaneOrientationBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterPlaneOrientationBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterPlaneOrientationBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterPlaneOrientationBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterPlaneOrientationBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterPlaneOrientationBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataFilterPlaneOrientationBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterPlaneOrientationBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataFilterPlaneOrientationBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataFilterPlaneOrientationBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterPlaneOrientationBD malloc(MemoryStack stack) {
        return new XrSenseDataFilterPlaneOrientationBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataFilterPlaneOrientationBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterPlaneOrientationBD calloc(MemoryStack stack) {
        return new XrSenseDataFilterPlaneOrientationBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterPlaneOrientationBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterPlaneOrientationBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterPlaneOrientationBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterPlaneOrientationBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataFilterPlaneOrientationBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataFilterPlaneOrientationBD.NEXT); }
    /** Unsafe version of {@link #orientationCount}. */
    public static int norientationCount(long struct) { return memGetInt(struct + XrSenseDataFilterPlaneOrientationBD.ORIENTATIONCOUNT); }
    /** Unsafe version of {@link #orientations() orientations}. */
    public static IntBuffer norientations(long struct) { return memIntBuffer(memGetAddress(struct + XrSenseDataFilterPlaneOrientationBD.ORIENTATIONS), norientationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataFilterPlaneOrientationBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataFilterPlaneOrientationBD.NEXT, value); }
    /** Sets the specified value to the {@code orientationCount} field of the specified {@code struct}. */
    public static void norientationCount(long struct, int value) { memPutInt(struct + XrSenseDataFilterPlaneOrientationBD.ORIENTATIONCOUNT, value); }
    /** Unsafe version of {@link #orientations(IntBuffer) orientations}. */
    public static void norientations(long struct, IntBuffer value) { memPutAddress(struct + XrSenseDataFilterPlaneOrientationBD.ORIENTATIONS, memAddress(value)); norientationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSenseDataFilterPlaneOrientationBD.ORIENTATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrSenseDataFilterPlaneOrientationBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataFilterPlaneOrientationBD, Buffer> implements NativeResource {

        private static final XrSenseDataFilterPlaneOrientationBD ELEMENT_FACTORY = XrSenseDataFilterPlaneOrientationBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataFilterPlaneOrientationBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataFilterPlaneOrientationBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataFilterPlaneOrientationBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataFilterPlaneOrientationBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataFilterPlaneOrientationBD.nnext(address()); }
        /** @return the value of the {@code orientationCount} field. */
        @NativeType("uint32_t")
        public int orientationCount() { return XrSenseDataFilterPlaneOrientationBD.norientationCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code orientations} field. */
        @NativeType("XrPlaneOrientationBD *")
        public IntBuffer orientations() { return XrSenseDataFilterPlaneOrientationBD.norientations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataFilterPlaneOrientationBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataFilterPlaneOrientationBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialPlane#XR_TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD} value to the {@code type} field. */
        public XrSenseDataFilterPlaneOrientationBD.Buffer type$Default() { return type(BDSpatialPlane.XR_TYPE_SENSE_DATA_FILTER_PLANE_ORIENTATION_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataFilterPlaneOrientationBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataFilterPlaneOrientationBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code orientations} field. */
        public XrSenseDataFilterPlaneOrientationBD.Buffer orientations(@NativeType("XrPlaneOrientationBD *") IntBuffer value) { XrSenseDataFilterPlaneOrientationBD.norientations(address(), value); return this; }

    }

}