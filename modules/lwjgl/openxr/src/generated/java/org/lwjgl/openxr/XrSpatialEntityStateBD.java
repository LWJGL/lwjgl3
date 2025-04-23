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
 * struct XrSpatialEntityStateBD {
 *     XrStructureType type;
 *     void * next;
 *     XrSpatialEntityIdBD entityId;
 *     XrTime lastUpdateTime;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 * }}</pre>
 */
public class XrSpatialEntityStateBD extends Struct<XrSpatialEntityStateBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENTITYID,
        LASTUPDATETIME,
        UUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENTITYID = layout.offsetof(2);
        LASTUPDATETIME = layout.offsetof(3);
        UUID = layout.offsetof(4);
    }

    protected XrSpatialEntityStateBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityStateBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityStateBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityStateBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityStateBD(ByteBuffer container) {
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
    /** @return the value of the {@code entityId} field. */
    @NativeType("XrSpatialEntityIdBD")
    public long entityId() { return nentityId(address()); }
    /** @return the value of the {@code lastUpdateTime} field. */
    @NativeType("XrTime")
    public long lastUpdateTime() { return nlastUpdateTime(address()); }
    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityStateBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_STATE_BD TYPE_SPATIAL_ENTITY_STATE_BD} value to the {@code type} field. */
    public XrSpatialEntityStateBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_STATE_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityStateBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code entityId} field. */
    public XrSpatialEntityStateBD entityId(@NativeType("XrSpatialEntityIdBD") long value) { nentityId(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdateTime} field. */
    public XrSpatialEntityStateBD lastUpdateTime(@NativeType("XrTime") long value) { nlastUpdateTime(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
    public XrSpatialEntityStateBD uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialEntityStateBD uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityStateBD set(
        int type,
        long next,
        long entityId,
        long lastUpdateTime,
        XrUuidEXT uuid
    ) {
        type(type);
        next(next);
        entityId(entityId);
        lastUpdateTime(lastUpdateTime);
        uuid(uuid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityStateBD set(XrSpatialEntityStateBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityStateBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityStateBD malloc() {
        return new XrSpatialEntityStateBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityStateBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityStateBD calloc() {
        return new XrSpatialEntityStateBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityStateBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityStateBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityStateBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityStateBD} instance for the specified memory address. */
    public static XrSpatialEntityStateBD create(long address) {
        return new XrSpatialEntityStateBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityStateBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityStateBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityStateBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityStateBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityStateBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityStateBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityStateBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityStateBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityStateBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityStateBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityStateBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityStateBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityStateBD malloc(MemoryStack stack) {
        return new XrSpatialEntityStateBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityStateBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityStateBD calloc(MemoryStack stack) {
        return new XrSpatialEntityStateBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityStateBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityStateBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityStateBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityStateBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityStateBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityStateBD.NEXT); }
    /** Unsafe version of {@link #entityId}. */
    public static long nentityId(long struct) { return memGetLong(struct + XrSpatialEntityStateBD.ENTITYID); }
    /** Unsafe version of {@link #lastUpdateTime}. */
    public static long nlastUpdateTime(long struct) { return memGetLong(struct + XrSpatialEntityStateBD.LASTUPDATETIME); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrSpatialEntityStateBD.UUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityStateBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityStateBD.NEXT, value); }
    /** Unsafe version of {@link #entityId(long) entityId}. */
    public static void nentityId(long struct, long value) { memPutLong(struct + XrSpatialEntityStateBD.ENTITYID, value); }
    /** Unsafe version of {@link #lastUpdateTime(long) lastUpdateTime}. */
    public static void nlastUpdateTime(long struct, long value) { memPutLong(struct + XrSpatialEntityStateBD.LASTUPDATETIME, value); }
    /** Unsafe version of {@link #uuid(XrUuidEXT) uuid}. */
    public static void nuuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrSpatialEntityStateBD.UUID, XrUuidEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityStateBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityStateBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityStateBD ELEMENT_FACTORY = XrSpatialEntityStateBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityStateBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityStateBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityStateBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityStateBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityStateBD.nnext(address()); }
        /** @return the value of the {@code entityId} field. */
        @NativeType("XrSpatialEntityIdBD")
        public long entityId() { return XrSpatialEntityStateBD.nentityId(address()); }
        /** @return the value of the {@code lastUpdateTime} field. */
        @NativeType("XrTime")
        public long lastUpdateTime() { return XrSpatialEntityStateBD.nlastUpdateTime(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrSpatialEntityStateBD.nuuid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityStateBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityStateBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_STATE_BD TYPE_SPATIAL_ENTITY_STATE_BD} value to the {@code type} field. */
        public XrSpatialEntityStateBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_STATE_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityStateBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityStateBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code entityId} field. */
        public XrSpatialEntityStateBD.Buffer entityId(@NativeType("XrSpatialEntityIdBD") long value) { XrSpatialEntityStateBD.nentityId(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdateTime} field. */
        public XrSpatialEntityStateBD.Buffer lastUpdateTime(@NativeType("XrTime") long value) { XrSpatialEntityStateBD.nlastUpdateTime(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
        public XrSpatialEntityStateBD.Buffer uuid(XrUuidEXT value) { XrSpatialEntityStateBD.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialEntityStateBD.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }

    }

}