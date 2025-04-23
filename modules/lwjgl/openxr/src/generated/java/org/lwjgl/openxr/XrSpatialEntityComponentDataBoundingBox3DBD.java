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
 * struct XrSpatialEntityComponentDataBoundingBox3DBD {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrBoxf XrBoxf} boundingBox3D;
 * }}</pre>
 */
public class XrSpatialEntityComponentDataBoundingBox3DBD extends Struct<XrSpatialEntityComponentDataBoundingBox3DBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BOUNDINGBOX3D;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrBoxf.SIZEOF, XrBoxf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BOUNDINGBOX3D = layout.offsetof(2);
    }

    protected XrSpatialEntityComponentDataBoundingBox3DBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataBoundingBox3DBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataBoundingBox3DBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataBoundingBox3DBD(ByteBuffer container) {
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
    /** @return a {@link XrBoxf} view of the {@code boundingBox3D} field. */
    public XrBoxf boundingBox3D() { return nboundingBox3D(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataBoundingBox3DBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataBoundingBox3DBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataBoundingBox3DBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrBoxf} to the {@code boundingBox3D} field. */
    public XrSpatialEntityComponentDataBoundingBox3DBD boundingBox3D(XrBoxf value) { nboundingBox3D(address(), value); return this; }
    /** Passes the {@code boundingBox3D} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialEntityComponentDataBoundingBox3DBD boundingBox3D(java.util.function.Consumer<XrBoxf> consumer) { consumer.accept(boundingBox3D()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataBoundingBox3DBD set(
        int type,
        long next,
        XrBoxf boundingBox3D
    ) {
        type(type);
        next(next);
        boundingBox3D(boundingBox3D);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataBoundingBox3DBD set(XrSpatialEntityComponentDataBoundingBox3DBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataBoundingBox3DBD malloc() {
        return new XrSpatialEntityComponentDataBoundingBox3DBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataBoundingBox3DBD calloc() {
        return new XrSpatialEntityComponentDataBoundingBox3DBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataBoundingBox3DBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataBoundingBox3DBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataBoundingBox3DBD create(long address) {
        return new XrSpatialEntityComponentDataBoundingBox3DBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataBoundingBox3DBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataBoundingBox3DBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataBoundingBox3DBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataBoundingBox3DBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataBoundingBox3DBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox3DBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataBoundingBox3DBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataBoundingBox3DBD.NEXT); }
    /** Unsafe version of {@link #boundingBox3D}. */
    public static XrBoxf nboundingBox3D(long struct) { return XrBoxf.create(struct + XrSpatialEntityComponentDataBoundingBox3DBD.BOUNDINGBOX3D); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataBoundingBox3DBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataBoundingBox3DBD.NEXT, value); }
    /** Unsafe version of {@link #boundingBox3D(XrBoxf) boundingBox3D}. */
    public static void nboundingBox3D(long struct, XrBoxf value) { memCopy(value.address(), struct + XrSpatialEntityComponentDataBoundingBox3DBD.BOUNDINGBOX3D, XrBoxf.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataBoundingBox3DBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataBoundingBox3DBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataBoundingBox3DBD ELEMENT_FACTORY = XrSpatialEntityComponentDataBoundingBox3DBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataBoundingBox3DBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataBoundingBox3DBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataBoundingBox3DBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataBoundingBox3DBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataBoundingBox3DBD.nnext(address()); }
        /** @return a {@link XrBoxf} view of the {@code boundingBox3D} field. */
        public XrBoxf boundingBox3D() { return XrSpatialEntityComponentDataBoundingBox3DBD.nboundingBox3D(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataBoundingBox3DBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataBoundingBox3DBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataBoundingBox3DBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataBoundingBox3DBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataBoundingBox3DBD.nnext(address(), value); return this; }
        /** Copies the specified {@link XrBoxf} to the {@code boundingBox3D} field. */
        public XrSpatialEntityComponentDataBoundingBox3DBD.Buffer boundingBox3D(XrBoxf value) { XrSpatialEntityComponentDataBoundingBox3DBD.nboundingBox3D(address(), value); return this; }
        /** Passes the {@code boundingBox3D} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialEntityComponentDataBoundingBox3DBD.Buffer boundingBox3D(java.util.function.Consumer<XrBoxf> consumer) { consumer.accept(boundingBox3D()); return this; }

    }

}