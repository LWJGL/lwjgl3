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
 * struct XrSpatialEntityComponentDataPlaneOrientationBD {
 *     XrStructureType type;
 *     void * next;
 *     XrPlaneOrientationBD orientation;
 * }}</pre>
 */
public class XrSpatialEntityComponentDataPlaneOrientationBD extends Struct<XrSpatialEntityComponentDataPlaneOrientationBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ORIENTATION;

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
        ORIENTATION = layout.offsetof(2);
    }

    protected XrSpatialEntityComponentDataPlaneOrientationBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataPlaneOrientationBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataPlaneOrientationBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataPlaneOrientationBD(ByteBuffer container) {
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
    /** @return the value of the {@code orientation} field. */
    @NativeType("XrPlaneOrientationBD")
    public int orientation() { return norientation(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataPlaneOrientationBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialPlane#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataPlaneOrientationBD type$Default() { return type(BDSpatialPlane.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataPlaneOrientationBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code orientation} field. */
    public XrSpatialEntityComponentDataPlaneOrientationBD orientation(@NativeType("XrPlaneOrientationBD") int value) { norientation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataPlaneOrientationBD set(
        int type,
        long next,
        int orientation
    ) {
        type(type);
        next(next);
        orientation(orientation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataPlaneOrientationBD set(XrSpatialEntityComponentDataPlaneOrientationBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataPlaneOrientationBD malloc() {
        return new XrSpatialEntityComponentDataPlaneOrientationBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataPlaneOrientationBD calloc() {
        return new XrSpatialEntityComponentDataPlaneOrientationBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataPlaneOrientationBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataPlaneOrientationBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataPlaneOrientationBD create(long address) {
        return new XrSpatialEntityComponentDataPlaneOrientationBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataPlaneOrientationBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataPlaneOrientationBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataPlaneOrientationBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataPlaneOrientationBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataPlaneOrientationBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataPlaneOrientationBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataPlaneOrientationBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataPlaneOrientationBD.NEXT); }
    /** Unsafe version of {@link #orientation}. */
    public static int norientation(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataPlaneOrientationBD.ORIENTATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataPlaneOrientationBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataPlaneOrientationBD.NEXT, value); }
    /** Unsafe version of {@link #orientation(int) orientation}. */
    public static void norientation(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataPlaneOrientationBD.ORIENTATION, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataPlaneOrientationBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataPlaneOrientationBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataPlaneOrientationBD ELEMENT_FACTORY = XrSpatialEntityComponentDataPlaneOrientationBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataPlaneOrientationBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataPlaneOrientationBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataPlaneOrientationBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataPlaneOrientationBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataPlaneOrientationBD.nnext(address()); }
        /** @return the value of the {@code orientation} field. */
        @NativeType("XrPlaneOrientationBD")
        public int orientation() { return XrSpatialEntityComponentDataPlaneOrientationBD.norientation(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataPlaneOrientationBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataPlaneOrientationBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialPlane#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataPlaneOrientationBD.Buffer type$Default() { return type(BDSpatialPlane.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_PLANE_ORIENTATION_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataPlaneOrientationBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataPlaneOrientationBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code orientation} field. */
        public XrSpatialEntityComponentDataPlaneOrientationBD.Buffer orientation(@NativeType("XrPlaneOrientationBD") int value) { XrSpatialEntityComponentDataPlaneOrientationBD.norientation(address(), value); return this; }

    }

}