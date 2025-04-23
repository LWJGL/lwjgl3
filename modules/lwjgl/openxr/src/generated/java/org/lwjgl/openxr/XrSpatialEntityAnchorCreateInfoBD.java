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
 * struct XrSpatialEntityAnchorCreateInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSenseDataSnapshotBD snapshot;
 *     XrSpatialEntityIdBD entityId;
 * }}</pre>
 */
public class XrSpatialEntityAnchorCreateInfoBD extends Struct<XrSpatialEntityAnchorCreateInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SNAPSHOT,
        ENTITYID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SNAPSHOT = layout.offsetof(2);
        ENTITYID = layout.offsetof(3);
    }

    protected XrSpatialEntityAnchorCreateInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityAnchorCreateInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityAnchorCreateInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityAnchorCreateInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityAnchorCreateInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code snapshot} field. */
    @NativeType("XrSenseDataSnapshotBD")
    public long snapshot() { return nsnapshot(address()); }
    /** @return the value of the {@code entityId} field. */
    @NativeType("XrSpatialEntityIdBD")
    public long entityId() { return nentityId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityAnchorCreateInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD} value to the {@code type} field. */
    public XrSpatialEntityAnchorCreateInfoBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityAnchorCreateInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code snapshot} field. */
    public XrSpatialEntityAnchorCreateInfoBD snapshot(XrSenseDataSnapshotBD value) { nsnapshot(address(), value); return this; }
    /** Sets the specified value to the {@code entityId} field. */
    public XrSpatialEntityAnchorCreateInfoBD entityId(@NativeType("XrSpatialEntityIdBD") long value) { nentityId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityAnchorCreateInfoBD set(
        int type,
        long next,
        XrSenseDataSnapshotBD snapshot,
        long entityId
    ) {
        type(type);
        next(next);
        snapshot(snapshot);
        entityId(entityId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityAnchorCreateInfoBD set(XrSpatialEntityAnchorCreateInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityAnchorCreateInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityAnchorCreateInfoBD malloc() {
        return new XrSpatialEntityAnchorCreateInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityAnchorCreateInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityAnchorCreateInfoBD calloc() {
        return new XrSpatialEntityAnchorCreateInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityAnchorCreateInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityAnchorCreateInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityAnchorCreateInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityAnchorCreateInfoBD} instance for the specified memory address. */
    public static XrSpatialEntityAnchorCreateInfoBD create(long address) {
        return new XrSpatialEntityAnchorCreateInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityAnchorCreateInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityAnchorCreateInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityAnchorCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityAnchorCreateInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityAnchorCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityAnchorCreateInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityAnchorCreateInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityAnchorCreateInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityAnchorCreateInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityAnchorCreateInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityAnchorCreateInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityAnchorCreateInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityAnchorCreateInfoBD malloc(MemoryStack stack) {
        return new XrSpatialEntityAnchorCreateInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityAnchorCreateInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityAnchorCreateInfoBD calloc(MemoryStack stack) {
        return new XrSpatialEntityAnchorCreateInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityAnchorCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityAnchorCreateInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityAnchorCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityAnchorCreateInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityAnchorCreateInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityAnchorCreateInfoBD.NEXT); }
    /** Unsafe version of {@link #snapshot}. */
    public static long nsnapshot(long struct) { return memGetAddress(struct + XrSpatialEntityAnchorCreateInfoBD.SNAPSHOT); }
    /** Unsafe version of {@link #entityId}. */
    public static long nentityId(long struct) { return memGetLong(struct + XrSpatialEntityAnchorCreateInfoBD.ENTITYID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityAnchorCreateInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityAnchorCreateInfoBD.NEXT, value); }
    /** Unsafe version of {@link #snapshot(XrSenseDataSnapshotBD) snapshot}. */
    public static void nsnapshot(long struct, XrSenseDataSnapshotBD value) { memPutAddress(struct + XrSpatialEntityAnchorCreateInfoBD.SNAPSHOT, value.address()); }
    /** Unsafe version of {@link #entityId(long) entityId}. */
    public static void nentityId(long struct, long value) { memPutLong(struct + XrSpatialEntityAnchorCreateInfoBD.ENTITYID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialEntityAnchorCreateInfoBD.SNAPSHOT));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityAnchorCreateInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityAnchorCreateInfoBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityAnchorCreateInfoBD ELEMENT_FACTORY = XrSpatialEntityAnchorCreateInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityAnchorCreateInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityAnchorCreateInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityAnchorCreateInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityAnchorCreateInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialEntityAnchorCreateInfoBD.nnext(address()); }
        /** @return the value of the {@code snapshot} field. */
        @NativeType("XrSenseDataSnapshotBD")
        public long snapshot() { return XrSpatialEntityAnchorCreateInfoBD.nsnapshot(address()); }
        /** @return the value of the {@code entityId} field. */
        @NativeType("XrSpatialEntityIdBD")
        public long entityId() { return XrSpatialEntityAnchorCreateInfoBD.nentityId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityAnchorCreateInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityAnchorCreateInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD} value to the {@code type} field. */
        public XrSpatialEntityAnchorCreateInfoBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityAnchorCreateInfoBD.Buffer next(@NativeType("void const *") long value) { XrSpatialEntityAnchorCreateInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code snapshot} field. */
        public XrSpatialEntityAnchorCreateInfoBD.Buffer snapshot(XrSenseDataSnapshotBD value) { XrSpatialEntityAnchorCreateInfoBD.nsnapshot(address(), value); return this; }
        /** Sets the specified value to the {@code entityId} field. */
        public XrSpatialEntityAnchorCreateInfoBD.Buffer entityId(@NativeType("XrSpatialEntityIdBD") long value) { XrSpatialEntityAnchorCreateInfoBD.nentityId(address(), value); return this; }

    }

}