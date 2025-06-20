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
 * struct XrSpatialDiscoverySnapshotCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t componentTypeCount;
 *     XrSpatialComponentTypeEXT const * componentTypes;
 * }}</pre>
 */
public class XrSpatialDiscoverySnapshotCreateInfoEXT extends Struct<XrSpatialDiscoverySnapshotCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTTYPECOUNT,
        COMPONENTTYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMPONENTTYPECOUNT = layout.offsetof(2);
        COMPONENTTYPES = layout.offsetof(3);
    }

    protected XrSpatialDiscoverySnapshotCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialDiscoverySnapshotCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialDiscoverySnapshotCreateInfoEXT(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialDiscoveryPersistenceUuidFilterEXT} value to the {@code next} chain. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT next(XrSpatialDiscoveryPersistenceUuidFilterEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpatialFilterTrackingStateEXT} value to the {@code next} chain. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT next(XrSpatialFilterTrackingStateEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code componentTypeCount} field. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT componentTypeCount(@NativeType("uint32_t") int value) { ncomponentTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { ncomponentTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialDiscoverySnapshotCreateInfoEXT set(
        int type,
        long next,
        int componentTypeCount,
        @Nullable IntBuffer componentTypes
    ) {
        type(type);
        next(next);
        componentTypeCount(componentTypeCount);
        componentTypes(componentTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialDiscoverySnapshotCreateInfoEXT set(XrSpatialDiscoverySnapshotCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT malloc() {
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT calloc() {
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance for the specified memory address. */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT create(long address) {
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialDiscoverySnapshotCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialDiscoverySnapshotCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialDiscoverySnapshotCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #componentTypeCount}. */
    public static int ncomponentTypeCount(long struct) { return memGetInt(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.COMPONENTTYPECOUNT); }
    /** Unsafe version of {@link #componentTypes() componentTypes}. */
    public static @Nullable IntBuffer ncomponentTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.COMPONENTTYPES), ncomponentTypeCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.NEXT, value); }
    /** Sets the specified value to the {@code componentTypeCount} field of the specified {@code struct}. */
    public static void ncomponentTypeCount(long struct, int value) { memPutInt(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.COMPONENTTYPECOUNT, value); }
    /** Unsafe version of {@link #componentTypes(IntBuffer) componentTypes}. */
    public static void ncomponentTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpatialDiscoverySnapshotCreateInfoEXT.COMPONENTTYPES, memAddressSafe(value)); if (value != null) { ncomponentTypeCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialDiscoverySnapshotCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialDiscoverySnapshotCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialDiscoverySnapshotCreateInfoEXT ELEMENT_FACTORY = XrSpatialDiscoverySnapshotCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialDiscoverySnapshotCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialDiscoverySnapshotCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialDiscoverySnapshotCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialDiscoverySnapshotCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code componentTypeCount} field. */
        @NativeType("uint32_t")
        public int componentTypeCount() { return XrSpatialDiscoverySnapshotCreateInfoEXT.ncomponentTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public @Nullable IntBuffer componentTypes() { return XrSpatialDiscoverySnapshotCreateInfoEXT.ncomponentTypes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialDiscoverySnapshotCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialDiscoverySnapshotCreateInfoEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialDiscoveryPersistenceUuidFilterEXT} value to the {@code next} chain. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer next(XrSpatialDiscoveryPersistenceUuidFilterEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpatialFilterTrackingStateEXT} value to the {@code next} chain. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer next(XrSpatialFilterTrackingStateEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code componentTypeCount} field. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer componentTypeCount(@NativeType("uint32_t") int value) { XrSpatialDiscoverySnapshotCreateInfoEXT.ncomponentTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
        public XrSpatialDiscoverySnapshotCreateInfoEXT.Buffer componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialDiscoverySnapshotCreateInfoEXT.ncomponentTypes(address(), value); return this; }

    }

}