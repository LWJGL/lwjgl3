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
 * struct XrSystemSpatialSensingPropertiesBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsSpatialSensing;
 * }}</pre>
 */
public class XrSystemSpatialSensingPropertiesBD extends Struct<XrSystemSpatialSensingPropertiesBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSPATIALSENSING;

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
        SUPPORTSSPATIALSENSING = layout.offsetof(2);
    }

    protected XrSystemSpatialSensingPropertiesBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSpatialSensingPropertiesBD create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSpatialSensingPropertiesBD(address, container);
    }

    /**
     * Creates a {@code XrSystemSpatialSensingPropertiesBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSpatialSensingPropertiesBD(ByteBuffer container) {
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
    /** @return the value of the {@code supportsSpatialSensing} field. */
    @NativeType("XrBool32")
    public boolean supportsSpatialSensing() { return nsupportsSpatialSensing(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemSpatialSensingPropertiesBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD} value to the {@code type} field. */
    public XrSystemSpatialSensingPropertiesBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemSpatialSensingPropertiesBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSpatialSensingPropertiesBD set(
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
    public XrSystemSpatialSensingPropertiesBD set(XrSystemSpatialSensingPropertiesBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSpatialSensingPropertiesBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialSensingPropertiesBD malloc() {
        return new XrSystemSpatialSensingPropertiesBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialSensingPropertiesBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialSensingPropertiesBD calloc() {
        return new XrSystemSpatialSensingPropertiesBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialSensingPropertiesBD} instance allocated with {@link BufferUtils}. */
    public static XrSystemSpatialSensingPropertiesBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSpatialSensingPropertiesBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSpatialSensingPropertiesBD} instance for the specified memory address. */
    public static XrSystemSpatialSensingPropertiesBD create(long address) {
        return new XrSystemSpatialSensingPropertiesBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemSpatialSensingPropertiesBD createSafe(long address) {
        return address == NULL ? null : new XrSystemSpatialSensingPropertiesBD(address, null);
    }

    /**
     * Returns a new {@link XrSystemSpatialSensingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialSensingPropertiesBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialSensingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialSensingPropertiesBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialSensingPropertiesBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialSensingPropertiesBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSpatialSensingPropertiesBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialSensingPropertiesBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemSpatialSensingPropertiesBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSpatialSensingPropertiesBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialSensingPropertiesBD malloc(MemoryStack stack) {
        return new XrSystemSpatialSensingPropertiesBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSpatialSensingPropertiesBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialSensingPropertiesBD calloc(MemoryStack stack) {
        return new XrSystemSpatialSensingPropertiesBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSpatialSensingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialSensingPropertiesBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialSensingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialSensingPropertiesBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemSpatialSensingPropertiesBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSpatialSensingPropertiesBD.NEXT); }
    /** Unsafe version of {@link #supportsSpatialSensing}. */
    public static int nsupportsSpatialSensing(long struct) { return memGetInt(struct + XrSystemSpatialSensingPropertiesBD.SUPPORTSSPATIALSENSING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemSpatialSensingPropertiesBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSpatialSensingPropertiesBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSpatialSensingPropertiesBD} structs. */
    public static class Buffer extends StructBuffer<XrSystemSpatialSensingPropertiesBD, Buffer> implements NativeResource {

        private static final XrSystemSpatialSensingPropertiesBD ELEMENT_FACTORY = XrSystemSpatialSensingPropertiesBD.create(-1L);

        /**
         * Creates a new {@code XrSystemSpatialSensingPropertiesBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSpatialSensingPropertiesBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSpatialSensingPropertiesBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSpatialSensingPropertiesBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemSpatialSensingPropertiesBD.nnext(address()); }
        /** @return the value of the {@code supportsSpatialSensing} field. */
        @NativeType("XrBool32")
        public boolean supportsSpatialSensing() { return XrSystemSpatialSensingPropertiesBD.nsupportsSpatialSensing(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemSpatialSensingPropertiesBD.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSpatialSensingPropertiesBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD} value to the {@code type} field. */
        public XrSystemSpatialSensingPropertiesBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemSpatialSensingPropertiesBD.Buffer next(@NativeType("void *") long value) { XrSystemSpatialSensingPropertiesBD.nnext(address(), value); return this; }

    }

}