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
 * struct XrSpatialEntityComponentDataBoundingBox2DBD {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrRect2Df XrRect2Df} boundingBox2D;
 * }}</pre>
 */
public class XrSpatialEntityComponentDataBoundingBox2DBD extends Struct<XrSpatialEntityComponentDataBoundingBox2DBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BOUNDINGBOX2D;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrRect2Df.SIZEOF, XrRect2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BOUNDINGBOX2D = layout.offsetof(2);
    }

    protected XrSpatialEntityComponentDataBoundingBox2DBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataBoundingBox2DBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataBoundingBox2DBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataBoundingBox2DBD(ByteBuffer container) {
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
    /** @return a {@link XrRect2Df} view of the {@code boundingBox2D} field. */
    public XrRect2Df boundingBox2D() { return nboundingBox2D(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataBoundingBox2DBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataBoundingBox2DBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataBoundingBox2DBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrRect2Df} to the {@code boundingBox2D} field. */
    public XrSpatialEntityComponentDataBoundingBox2DBD boundingBox2D(XrRect2Df value) { nboundingBox2D(address(), value); return this; }
    /** Passes the {@code boundingBox2D} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialEntityComponentDataBoundingBox2DBD boundingBox2D(java.util.function.Consumer<XrRect2Df> consumer) { consumer.accept(boundingBox2D()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataBoundingBox2DBD set(
        int type,
        long next,
        XrRect2Df boundingBox2D
    ) {
        type(type);
        next(next);
        boundingBox2D(boundingBox2D);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataBoundingBox2DBD set(XrSpatialEntityComponentDataBoundingBox2DBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataBoundingBox2DBD malloc() {
        return new XrSpatialEntityComponentDataBoundingBox2DBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataBoundingBox2DBD calloc() {
        return new XrSpatialEntityComponentDataBoundingBox2DBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataBoundingBox2DBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataBoundingBox2DBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataBoundingBox2DBD create(long address) {
        return new XrSpatialEntityComponentDataBoundingBox2DBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataBoundingBox2DBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataBoundingBox2DBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataBoundingBox2DBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataBoundingBox2DBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataBoundingBox2DBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataBoundingBox2DBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataBoundingBox2DBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataBoundingBox2DBD.NEXT); }
    /** Unsafe version of {@link #boundingBox2D}. */
    public static XrRect2Df nboundingBox2D(long struct) { return XrRect2Df.create(struct + XrSpatialEntityComponentDataBoundingBox2DBD.BOUNDINGBOX2D); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataBoundingBox2DBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataBoundingBox2DBD.NEXT, value); }
    /** Unsafe version of {@link #boundingBox2D(XrRect2Df) boundingBox2D}. */
    public static void nboundingBox2D(long struct, XrRect2Df value) { memCopy(value.address(), struct + XrSpatialEntityComponentDataBoundingBox2DBD.BOUNDINGBOX2D, XrRect2Df.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataBoundingBox2DBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataBoundingBox2DBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataBoundingBox2DBD ELEMENT_FACTORY = XrSpatialEntityComponentDataBoundingBox2DBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataBoundingBox2DBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataBoundingBox2DBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataBoundingBox2DBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataBoundingBox2DBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataBoundingBox2DBD.nnext(address()); }
        /** @return a {@link XrRect2Df} view of the {@code boundingBox2D} field. */
        public XrRect2Df boundingBox2D() { return XrSpatialEntityComponentDataBoundingBox2DBD.nboundingBox2D(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataBoundingBox2DBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataBoundingBox2DBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataBoundingBox2DBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataBoundingBox2DBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataBoundingBox2DBD.nnext(address(), value); return this; }
        /** Copies the specified {@link XrRect2Df} to the {@code boundingBox2D} field. */
        public XrSpatialEntityComponentDataBoundingBox2DBD.Buffer boundingBox2D(XrRect2Df value) { XrSpatialEntityComponentDataBoundingBox2DBD.nboundingBox2D(address(), value); return this; }
        /** Passes the {@code boundingBox2D} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialEntityComponentDataBoundingBox2DBD.Buffer boundingBox2D(java.util.function.Consumer<XrRect2Df> consumer) { consumer.accept(boundingBox2D()); return this; }

    }

}