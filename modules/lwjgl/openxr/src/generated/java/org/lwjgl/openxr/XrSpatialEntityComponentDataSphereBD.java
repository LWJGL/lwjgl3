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
 * <pre><code>
 * struct XrSpatialEntityComponentDataSphereBD {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrSpheref XrSpheref} sphere;
 * }</code></pre>
 */
public class XrSpatialEntityComponentDataSphereBD extends Struct<XrSpatialEntityComponentDataSphereBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPHERE;

    static {
        XrSpheref.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrSpheref.SIZEOF, XrSpheref.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPHERE = layout.offsetof(2);
    }

    protected XrSpatialEntityComponentDataSphereBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataSphereBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataSphereBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataSphereBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataSphereBD(ByteBuffer container) {
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
    /** @return a {@link XrSpheref} view of the {@code sphere} field. */
    public XrSpheref sphere() { return nsphere(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataSphereBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SPHERE_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SPHERE_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataSphereBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SPHERE_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataSphereBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrSpheref} to the {@code sphere} field. */
    public XrSpatialEntityComponentDataSphereBD sphere(XrSpheref value) { nsphere(address(), value); return this; }
    /** Passes the {@code sphere} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialEntityComponentDataSphereBD sphere(java.util.function.Consumer<XrSpheref> consumer) { consumer.accept(sphere()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataSphereBD set(
        int type,
        long next,
        XrSpheref sphere
    ) {
        type(type);
        next(next);
        sphere(sphere);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataSphereBD set(XrSpatialEntityComponentDataSphereBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataSphereBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataSphereBD malloc() {
        return new XrSpatialEntityComponentDataSphereBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataSphereBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataSphereBD calloc() {
        return new XrSpatialEntityComponentDataSphereBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataSphereBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataSphereBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataSphereBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataSphereBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataSphereBD create(long address) {
        return new XrSpatialEntityComponentDataSphereBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataSphereBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataSphereBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSphereBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSphereBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSphereBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSphereBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSphereBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSphereBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataSphereBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSphereBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataSphereBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataSphereBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataSphereBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataSphereBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataSphereBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataSphereBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataSphereBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSphereBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSphereBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSphereBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSphereBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataSphereBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataSphereBD.NEXT); }
    /** Unsafe version of {@link #sphere}. */
    public static XrSpheref nsphere(long struct) { return XrSpheref.create(struct + XrSpatialEntityComponentDataSphereBD.SPHERE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataSphereBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataSphereBD.NEXT, value); }
    /** Unsafe version of {@link #sphere(XrSpheref) sphere}. */
    public static void nsphere(long struct, XrSpheref value) { memCopy(value.address(), struct + XrSpatialEntityComponentDataSphereBD.SPHERE, XrSpheref.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataSphereBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataSphereBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataSphereBD ELEMENT_FACTORY = XrSpatialEntityComponentDataSphereBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataSphereBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataSphereBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataSphereBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataSphereBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataSphereBD.nnext(address()); }
        /** @return a {@link XrSpheref} view of the {@code sphere} field. */
        public XrSpheref sphere() { return XrSpatialEntityComponentDataSphereBD.nsphere(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataSphereBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataSphereBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SPHERE_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SPHERE_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataSphereBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SPHERE_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataSphereBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataSphereBD.nnext(address(), value); return this; }
        /** Copies the specified {@link XrSpheref} to the {@code sphere} field. */
        public XrSpatialEntityComponentDataSphereBD.Buffer sphere(XrSpheref value) { XrSpatialEntityComponentDataSphereBD.nsphere(address(), value); return this; }
        /** Passes the {@code sphere} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialEntityComponentDataSphereBD.Buffer sphere(java.util.function.Consumer<XrSpheref> consumer) { consumer.accept(sphere()); return this; }

    }

}