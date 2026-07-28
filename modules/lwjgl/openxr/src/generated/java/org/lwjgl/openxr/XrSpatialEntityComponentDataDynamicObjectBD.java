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
 * struct XrSpatialEntityComponentDataDynamicObjectBD {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrDynamicObjectDataBD XrDynamicObjectDataBD} data;
 * }</code></pre>
 */
public class XrSpatialEntityComponentDataDynamicObjectBD extends Struct<XrSpatialEntityComponentDataDynamicObjectBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DATA;

    static {
        XrDynamicObjectDataBD.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrDynamicObjectDataBD.SIZEOF, XrDynamicObjectDataBD.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected XrSpatialEntityComponentDataDynamicObjectBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataDynamicObjectBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataDynamicObjectBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataDynamicObjectBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataDynamicObjectBD(ByteBuffer container) {
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
    /** @return a {@link XrDynamicObjectDataBD} view of the {@code data} field. */
    public XrDynamicObjectDataBD data() { return ndata(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataDynamicObjectBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataDynamicObjectBD type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataDynamicObjectBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrDynamicObjectDataBD} to the {@code data} field. */
    public XrSpatialEntityComponentDataDynamicObjectBD data(XrDynamicObjectDataBD value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialEntityComponentDataDynamicObjectBD data(java.util.function.Consumer<XrDynamicObjectDataBD> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataDynamicObjectBD set(
        int type,
        long next,
        XrDynamicObjectDataBD data
    ) {
        type(type);
        next(next);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataDynamicObjectBD set(XrSpatialEntityComponentDataDynamicObjectBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataDynamicObjectBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataDynamicObjectBD malloc() {
        return new XrSpatialEntityComponentDataDynamicObjectBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataDynamicObjectBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataDynamicObjectBD calloc() {
        return new XrSpatialEntityComponentDataDynamicObjectBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataDynamicObjectBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataDynamicObjectBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataDynamicObjectBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataDynamicObjectBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataDynamicObjectBD create(long address) {
        return new XrSpatialEntityComponentDataDynamicObjectBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataDynamicObjectBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataDynamicObjectBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataDynamicObjectBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataDynamicObjectBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataDynamicObjectBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataDynamicObjectBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataDynamicObjectBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataDynamicObjectBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataDynamicObjectBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataDynamicObjectBD.NEXT); }
    /** Unsafe version of {@link #data}. */
    public static XrDynamicObjectDataBD ndata(long struct) { return XrDynamicObjectDataBD.create(struct + XrSpatialEntityComponentDataDynamicObjectBD.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataDynamicObjectBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataDynamicObjectBD.NEXT, value); }
    /** Unsafe version of {@link #data(XrDynamicObjectDataBD) data}. */
    public static void ndata(long struct, XrDynamicObjectDataBD value) { memCopy(value.address(), struct + XrSpatialEntityComponentDataDynamicObjectBD.DATA, XrDynamicObjectDataBD.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataDynamicObjectBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataDynamicObjectBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataDynamicObjectBD ELEMENT_FACTORY = XrSpatialEntityComponentDataDynamicObjectBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataDynamicObjectBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataDynamicObjectBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataDynamicObjectBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataDynamicObjectBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataDynamicObjectBD.nnext(address()); }
        /** @return a {@link XrDynamicObjectDataBD} view of the {@code data} field. */
        public XrDynamicObjectDataBD data() { return XrSpatialEntityComponentDataDynamicObjectBD.ndata(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataDynamicObjectBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataDynamicObjectBD.ntype(address(), value); return this; }
        /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataDynamicObjectBD.Buffer type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_DYNAMIC_OBJECT_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataDynamicObjectBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataDynamicObjectBD.nnext(address(), value); return this; }
        /** Copies the specified {@link XrDynamicObjectDataBD} to the {@code data} field. */
        public XrSpatialEntityComponentDataDynamicObjectBD.Buffer data(XrDynamicObjectDataBD value) { XrSpatialEntityComponentDataDynamicObjectBD.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialEntityComponentDataDynamicObjectBD.Buffer data(java.util.function.Consumer<XrDynamicObjectDataBD> consumer) { consumer.accept(data()); return this; }

    }

}