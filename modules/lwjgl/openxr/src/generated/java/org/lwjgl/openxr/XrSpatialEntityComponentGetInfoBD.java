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
 * struct XrSpatialEntityComponentGetInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialEntityIdBD entityId;
 *     XrSpatialEntityComponentTypeBD componentType;
 * }}</pre>
 */
public class XrSpatialEntityComponentGetInfoBD extends Struct<XrSpatialEntityComponentGetInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENTITYID,
        COMPONENTTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENTITYID = layout.offsetof(2);
        COMPONENTTYPE = layout.offsetof(3);
    }

    protected XrSpatialEntityComponentGetInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentGetInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentGetInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentGetInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentGetInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code entityId} field. */
    @NativeType("XrSpatialEntityIdBD")
    public long entityId() { return nentityId(address()); }
    /** @return the value of the {@code componentType} field. */
    @NativeType("XrSpatialEntityComponentTypeBD")
    public int componentType() { return ncomponentType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentGetInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentGetInfoBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentGetInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code entityId} field. */
    public XrSpatialEntityComponentGetInfoBD entityId(@NativeType("XrSpatialEntityIdBD") long value) { nentityId(address(), value); return this; }
    /** Sets the specified value to the {@code componentType} field. */
    public XrSpatialEntityComponentGetInfoBD componentType(@NativeType("XrSpatialEntityComponentTypeBD") int value) { ncomponentType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentGetInfoBD set(
        int type,
        long next,
        long entityId,
        int componentType
    ) {
        type(type);
        next(next);
        entityId(entityId);
        componentType(componentType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentGetInfoBD set(XrSpatialEntityComponentGetInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentGetInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentGetInfoBD malloc() {
        return new XrSpatialEntityComponentGetInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentGetInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentGetInfoBD calloc() {
        return new XrSpatialEntityComponentGetInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentGetInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentGetInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentGetInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentGetInfoBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentGetInfoBD create(long address) {
        return new XrSpatialEntityComponentGetInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentGetInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentGetInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentGetInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentGetInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentGetInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentGetInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentGetInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentGetInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentGetInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentGetInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentGetInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentGetInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentGetInfoBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentGetInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentGetInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentGetInfoBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentGetInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentGetInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentGetInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentGetInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentGetInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentGetInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentGetInfoBD.NEXT); }
    /** Unsafe version of {@link #entityId}. */
    public static long nentityId(long struct) { return memGetLong(struct + XrSpatialEntityComponentGetInfoBD.ENTITYID); }
    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return memGetInt(struct + XrSpatialEntityComponentGetInfoBD.COMPONENTTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentGetInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentGetInfoBD.NEXT, value); }
    /** Unsafe version of {@link #entityId(long) entityId}. */
    public static void nentityId(long struct, long value) { memPutLong(struct + XrSpatialEntityComponentGetInfoBD.ENTITYID, value); }
    /** Unsafe version of {@link #componentType(int) componentType}. */
    public static void ncomponentType(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentGetInfoBD.COMPONENTTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentGetInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentGetInfoBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentGetInfoBD ELEMENT_FACTORY = XrSpatialEntityComponentGetInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentGetInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentGetInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentGetInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentGetInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialEntityComponentGetInfoBD.nnext(address()); }
        /** @return the value of the {@code entityId} field. */
        @NativeType("XrSpatialEntityIdBD")
        public long entityId() { return XrSpatialEntityComponentGetInfoBD.nentityId(address()); }
        /** @return the value of the {@code componentType} field. */
        @NativeType("XrSpatialEntityComponentTypeBD")
        public int componentType() { return XrSpatialEntityComponentGetInfoBD.ncomponentType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentGetInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentGetInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentGetInfoBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentGetInfoBD.Buffer next(@NativeType("void const *") long value) { XrSpatialEntityComponentGetInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code entityId} field. */
        public XrSpatialEntityComponentGetInfoBD.Buffer entityId(@NativeType("XrSpatialEntityIdBD") long value) { XrSpatialEntityComponentGetInfoBD.nentityId(address(), value); return this; }
        /** Sets the specified value to the {@code componentType} field. */
        public XrSpatialEntityComponentGetInfoBD.Buffer componentType(@NativeType("XrSpatialEntityComponentTypeBD") int value) { XrSpatialEntityComponentGetInfoBD.ncomponentType(address(), value); return this; }

    }

}