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
 * <pre><code>
 * struct XrSpatialRaycastSnapshotCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t componentTypeCount;
 *     XrSpatialComponentTypeEXT const * componentTypes;
 *     {@link XrSpatialRaycastInfoANDROID XrSpatialRaycastInfoANDROID} const * raycastInfo;
 * }</code></pre>
 */
public class XrSpatialRaycastSnapshotCreateInfoANDROID extends Struct<XrSpatialRaycastSnapshotCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTTYPECOUNT,
        COMPONENTTYPES,
        RAYCASTINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMPONENTTYPECOUNT = layout.offsetof(2);
        COMPONENTTYPES = layout.offsetof(3);
        RAYCASTINFO = layout.offsetof(4);
    }

    protected XrSpatialRaycastSnapshotCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialRaycastSnapshotCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialRaycastSnapshotCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code componentTypeCount} field. */
    @NativeType("uint32_t")
    public int componentTypeCount() { return ncomponentTypeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
    @NativeType("XrSpatialComponentTypeEXT const *")
    public @Nullable IntBuffer componentTypes() { return ncomponentTypes(address()); }
    /** @return a {@link XrSpatialRaycastInfoANDROID} view of the struct pointed to by the {@code raycastInfo} field. */
    @NativeType("XrSpatialRaycastInfoANDROID const *")
    public XrSpatialRaycastInfoANDROID raycastInfo() { return nraycastInfo(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code componentTypeCount} field. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID componentTypeCount(@NativeType("uint32_t") int value) { ncomponentTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { ncomponentTypes(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialRaycastInfoANDROID} to the {@code raycastInfo} field. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID raycastInfo(@NativeType("XrSpatialRaycastInfoANDROID const *") XrSpatialRaycastInfoANDROID value) { nraycastInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialRaycastSnapshotCreateInfoANDROID set(
        int type,
        long next,
        int componentTypeCount,
        @Nullable IntBuffer componentTypes,
        XrSpatialRaycastInfoANDROID raycastInfo
    ) {
        type(type);
        next(next);
        componentTypeCount(componentTypeCount);
        componentTypes(componentTypes);
        raycastInfo(raycastInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialRaycastSnapshotCreateInfoANDROID set(XrSpatialRaycastSnapshotCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID malloc() {
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID calloc() {
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance for the specified memory address. */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID create(long address) {
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialRaycastSnapshotCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialRaycastSnapshotCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrSpatialRaycastSnapshotCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #componentTypeCount}. */
    public static int ncomponentTypeCount(long struct) { return memGetInt(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.COMPONENTTYPECOUNT); }
    /** Unsafe version of {@link #componentTypes() componentTypes}. */
    public static @Nullable IntBuffer ncomponentTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.COMPONENTTYPES), ncomponentTypeCount(struct)); }
    /** Unsafe version of {@link #raycastInfo}. */
    public static XrSpatialRaycastInfoANDROID nraycastInfo(long struct) { return XrSpatialRaycastInfoANDROID.create(memGetAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.RAYCASTINFO)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.NEXT, value); }
    /** Sets the specified value to the {@code componentTypeCount} field of the specified {@code struct}. */
    public static void ncomponentTypeCount(long struct, int value) { memPutInt(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.COMPONENTTYPECOUNT, value); }
    /** Unsafe version of {@link #componentTypes(IntBuffer) componentTypes}. */
    public static void ncomponentTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.COMPONENTTYPES, memAddressSafe(value)); if (value != null) { ncomponentTypeCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #raycastInfo(XrSpatialRaycastInfoANDROID) raycastInfo}. */
    public static void nraycastInfo(long struct, XrSpatialRaycastInfoANDROID value) { memPutAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.RAYCASTINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long raycastInfo = memGetAddress(struct + XrSpatialRaycastSnapshotCreateInfoANDROID.RAYCASTINFO);
        check(raycastInfo);
        XrSpatialRaycastInfoANDROID.validate(raycastInfo);
    }

    // -----------------------------------

    /** An array of {@link XrSpatialRaycastSnapshotCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialRaycastSnapshotCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrSpatialRaycastSnapshotCreateInfoANDROID ELEMENT_FACTORY = XrSpatialRaycastSnapshotCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialRaycastSnapshotCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialRaycastSnapshotCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialRaycastSnapshotCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialRaycastSnapshotCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code componentTypeCount} field. */
        @NativeType("uint32_t")
        public int componentTypeCount() { return XrSpatialRaycastSnapshotCreateInfoANDROID.ncomponentTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public @Nullable IntBuffer componentTypes() { return XrSpatialRaycastSnapshotCreateInfoANDROID.ncomponentTypes(address()); }
        /** @return a {@link XrSpatialRaycastInfoANDROID} view of the struct pointed to by the {@code raycastInfo} field. */
        @NativeType("XrSpatialRaycastInfoANDROID const *")
        public XrSpatialRaycastInfoANDROID raycastInfo() { return XrSpatialRaycastSnapshotCreateInfoANDROID.nraycastInfo(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialRaycastSnapshotCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_RAYCAST_SNAPSHOT_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialRaycastSnapshotCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code componentTypeCount} field. */
        public XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer componentTypeCount(@NativeType("uint32_t") int value) { XrSpatialRaycastSnapshotCreateInfoANDROID.ncomponentTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
        public XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialRaycastSnapshotCreateInfoANDROID.ncomponentTypes(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialRaycastInfoANDROID} to the {@code raycastInfo} field. */
        public XrSpatialRaycastSnapshotCreateInfoANDROID.Buffer raycastInfo(@NativeType("XrSpatialRaycastInfoANDROID const *") XrSpatialRaycastInfoANDROID value) { XrSpatialRaycastSnapshotCreateInfoANDROID.nraycastInfo(address(), value); return this; }

    }

}