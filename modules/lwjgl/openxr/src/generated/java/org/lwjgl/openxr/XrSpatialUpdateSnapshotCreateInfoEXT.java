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
 * struct XrSpatialUpdateSnapshotCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t entityCount;
 *     XrSpatialEntityEXT const * entities;
 *     uint32_t componentTypeCount;
 *     XrSpatialComponentTypeEXT const * componentTypes;
 *     XrSpace baseSpace;
 *     XrTime time;
 * }}</pre>
 */
public class XrSpatialUpdateSnapshotCreateInfoEXT extends Struct<XrSpatialUpdateSnapshotCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENTITYCOUNT,
        ENTITIES,
        COMPONENTTYPECOUNT,
        COMPONENTTYPES,
        BASESPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENTITYCOUNT = layout.offsetof(2);
        ENTITIES = layout.offsetof(3);
        COMPONENTTYPECOUNT = layout.offsetof(4);
        COMPONENTTYPES = layout.offsetof(5);
        BASESPACE = layout.offsetof(6);
        TIME = layout.offsetof(7);
    }

    protected XrSpatialUpdateSnapshotCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialUpdateSnapshotCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialUpdateSnapshotCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialUpdateSnapshotCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code entityCount} field. */
    @NativeType("uint32_t")
    public int entityCount() { return nentityCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code entities} field. */
    @NativeType("XrSpatialEntityEXT const *")
    public PointerBuffer entities() { return nentities(address()); }
    /** @return the value of the {@code componentTypeCount} field. */
    @NativeType("uint32_t")
    public int componentTypeCount() { return ncomponentTypeCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
    @NativeType("XrSpatialComponentTypeEXT const *")
    public @Nullable IntBuffer componentTypes() { return ncomponentTypes(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code entities} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT entities(@NativeType("XrSpatialEntityEXT const *") PointerBuffer value) { nentities(address(), value); return this; }
    /** Sets the specified value to the {@code componentTypeCount} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT componentTypeCount(@NativeType("uint32_t") int value) { ncomponentTypeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { ncomponentTypes(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialUpdateSnapshotCreateInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialUpdateSnapshotCreateInfoEXT set(
        int type,
        long next,
        PointerBuffer entities,
        int componentTypeCount,
        @Nullable IntBuffer componentTypes,
        XrSpace baseSpace,
        long time
    ) {
        type(type);
        next(next);
        entities(entities);
        componentTypeCount(componentTypeCount);
        componentTypes(componentTypes);
        baseSpace(baseSpace);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialUpdateSnapshotCreateInfoEXT set(XrSpatialUpdateSnapshotCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialUpdateSnapshotCreateInfoEXT malloc() {
        return new XrSpatialUpdateSnapshotCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialUpdateSnapshotCreateInfoEXT calloc() {
        return new XrSpatialUpdateSnapshotCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialUpdateSnapshotCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialUpdateSnapshotCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance for the specified memory address. */
    public static XrSpatialUpdateSnapshotCreateInfoEXT create(long address) {
        return new XrSpatialUpdateSnapshotCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialUpdateSnapshotCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialUpdateSnapshotCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialUpdateSnapshotCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialUpdateSnapshotCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialUpdateSnapshotCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialUpdateSnapshotCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialUpdateSnapshotCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #entityCount}. */
    public static int nentityCount(long struct) { return memGetInt(struct + XrSpatialUpdateSnapshotCreateInfoEXT.ENTITYCOUNT); }
    /** Unsafe version of {@link #entities() entities}. */
    public static PointerBuffer nentities(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.ENTITIES), nentityCount(struct)); }
    /** Unsafe version of {@link #componentTypeCount}. */
    public static int ncomponentTypeCount(long struct) { return memGetInt(struct + XrSpatialUpdateSnapshotCreateInfoEXT.COMPONENTTYPECOUNT); }
    /** Unsafe version of {@link #componentTypes() componentTypes}. */
    public static @Nullable IntBuffer ncomponentTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.COMPONENTTYPES), ncomponentTypeCount(struct)); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialUpdateSnapshotCreateInfoEXT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialUpdateSnapshotCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.NEXT, value); }
    /** Sets the specified value to the {@code entityCount} field of the specified {@code struct}. */
    public static void nentityCount(long struct, int value) { memPutInt(struct + XrSpatialUpdateSnapshotCreateInfoEXT.ENTITYCOUNT, value); }
    /** Unsafe version of {@link #entities(PointerBuffer) entities}. */
    public static void nentities(long struct, PointerBuffer value) { memPutAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.ENTITIES, memAddress(value)); nentityCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code componentTypeCount} field of the specified {@code struct}. */
    public static void ncomponentTypeCount(long struct, int value) { memPutInt(struct + XrSpatialUpdateSnapshotCreateInfoEXT.COMPONENTTYPECOUNT, value); }
    /** Unsafe version of {@link #componentTypes(IntBuffer) componentTypes}. */
    public static void ncomponentTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.COMPONENTTYPES, memAddressSafe(value)); if (value != null) { ncomponentTypeCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialUpdateSnapshotCreateInfoEXT.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.ENTITIES));
        check(memGetAddress(struct + XrSpatialUpdateSnapshotCreateInfoEXT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialUpdateSnapshotCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialUpdateSnapshotCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialUpdateSnapshotCreateInfoEXT ELEMENT_FACTORY = XrSpatialUpdateSnapshotCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialUpdateSnapshotCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialUpdateSnapshotCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialUpdateSnapshotCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialUpdateSnapshotCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialUpdateSnapshotCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code entityCount} field. */
        @NativeType("uint32_t")
        public int entityCount() { return XrSpatialUpdateSnapshotCreateInfoEXT.nentityCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code entities} field. */
        @NativeType("XrSpatialEntityEXT const *")
        public PointerBuffer entities() { return XrSpatialUpdateSnapshotCreateInfoEXT.nentities(address()); }
        /** @return the value of the {@code componentTypeCount} field. */
        @NativeType("uint32_t")
        public int componentTypeCount() { return XrSpatialUpdateSnapshotCreateInfoEXT.ncomponentTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code componentTypes} field. */
        @NativeType("XrSpatialComponentTypeEXT const *")
        public @Nullable IntBuffer componentTypes() { return XrSpatialUpdateSnapshotCreateInfoEXT.ncomponentTypes(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSpatialUpdateSnapshotCreateInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialUpdateSnapshotCreateInfoEXT.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialUpdateSnapshotCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialUpdateSnapshotCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code entities} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer entities(@NativeType("XrSpatialEntityEXT const *") PointerBuffer value) { XrSpatialUpdateSnapshotCreateInfoEXT.nentities(address(), value); return this; }
        /** Sets the specified value to the {@code componentTypeCount} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer componentTypeCount(@NativeType("uint32_t") int value) { XrSpatialUpdateSnapshotCreateInfoEXT.ncomponentTypeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code componentTypes} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer componentTypes(@Nullable @NativeType("XrSpatialComponentTypeEXT const *") IntBuffer value) { XrSpatialUpdateSnapshotCreateInfoEXT.ncomponentTypes(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer baseSpace(XrSpace value) { XrSpatialUpdateSnapshotCreateInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialUpdateSnapshotCreateInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrSpatialUpdateSnapshotCreateInfoEXT.ntime(address(), value); return this; }

    }

}