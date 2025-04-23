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
 * struct XrSenseDataProviderCreateInfoSpatialMeshBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialMeshConfigFlagsBD configFlags;
 *     XrSpatialMeshLodBD lod;
 * }}</pre>
 */
public class XrSenseDataProviderCreateInfoSpatialMeshBD extends Struct<XrSenseDataProviderCreateInfoSpatialMeshBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CONFIGFLAGS,
        LOD;

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
        CONFIGFLAGS = layout.offsetof(2);
        LOD = layout.offsetof(3);
    }

    protected XrSenseDataProviderCreateInfoSpatialMeshBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataProviderCreateInfoSpatialMeshBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataProviderCreateInfoSpatialMeshBD(ByteBuffer container) {
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
    /** @return the value of the {@code configFlags} field. */
    @NativeType("XrSpatialMeshConfigFlagsBD")
    public long configFlags() { return nconfigFlags(address()); }
    /** @return the value of the {@code lod} field. */
    @NativeType("XrSpatialMeshLodBD")
    public int lod() { return nlod(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataProviderCreateInfoSpatialMeshBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialMesh#XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD} value to the {@code type} field. */
    public XrSenseDataProviderCreateInfoSpatialMeshBD type$Default() { return type(BDSpatialMesh.XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataProviderCreateInfoSpatialMeshBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code configFlags} field. */
    public XrSenseDataProviderCreateInfoSpatialMeshBD configFlags(@NativeType("XrSpatialMeshConfigFlagsBD") long value) { nconfigFlags(address(), value); return this; }
    /** Sets the specified value to the {@code lod} field. */
    public XrSenseDataProviderCreateInfoSpatialMeshBD lod(@NativeType("XrSpatialMeshLodBD") int value) { nlod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataProviderCreateInfoSpatialMeshBD set(
        int type,
        long next,
        long configFlags,
        int lod
    ) {
        type(type);
        next(next);
        configFlags(configFlags);
        lod(lod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataProviderCreateInfoSpatialMeshBD set(XrSenseDataProviderCreateInfoSpatialMeshBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD malloc() {
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD calloc() {
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance for the specified memory address. */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD create(long address) {
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataProviderCreateInfoSpatialMeshBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataProviderCreateInfoSpatialMeshBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD malloc(MemoryStack stack) {
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD calloc(MemoryStack stack) {
        return new XrSenseDataProviderCreateInfoSpatialMeshBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.NEXT); }
    /** Unsafe version of {@link #configFlags}. */
    public static long nconfigFlags(long struct) { return memGetLong(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.CONFIGFLAGS); }
    /** Unsafe version of {@link #lod}. */
    public static int nlod(long struct) { return memGetInt(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.LOD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.NEXT, value); }
    /** Unsafe version of {@link #configFlags(long) configFlags}. */
    public static void nconfigFlags(long struct, long value) { memPutLong(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.CONFIGFLAGS, value); }
    /** Unsafe version of {@link #lod(int) lod}. */
    public static void nlod(long struct, int value) { memPutInt(struct + XrSenseDataProviderCreateInfoSpatialMeshBD.LOD, value); }

    // -----------------------------------

    /** An array of {@link XrSenseDataProviderCreateInfoSpatialMeshBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataProviderCreateInfoSpatialMeshBD, Buffer> implements NativeResource {

        private static final XrSenseDataProviderCreateInfoSpatialMeshBD ELEMENT_FACTORY = XrSenseDataProviderCreateInfoSpatialMeshBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataProviderCreateInfoSpatialMeshBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataProviderCreateInfoSpatialMeshBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataProviderCreateInfoSpatialMeshBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataProviderCreateInfoSpatialMeshBD.nnext(address()); }
        /** @return the value of the {@code configFlags} field. */
        @NativeType("XrSpatialMeshConfigFlagsBD")
        public long configFlags() { return XrSenseDataProviderCreateInfoSpatialMeshBD.nconfigFlags(address()); }
        /** @return the value of the {@code lod} field. */
        @NativeType("XrSpatialMeshLodBD")
        public int lod() { return XrSenseDataProviderCreateInfoSpatialMeshBD.nlod(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataProviderCreateInfoSpatialMeshBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialMesh#XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD} value to the {@code type} field. */
        public XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer type$Default() { return type(BDSpatialMesh.XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_SPATIAL_MESH_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataProviderCreateInfoSpatialMeshBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code configFlags} field. */
        public XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer configFlags(@NativeType("XrSpatialMeshConfigFlagsBD") long value) { XrSenseDataProviderCreateInfoSpatialMeshBD.nconfigFlags(address(), value); return this; }
        /** Sets the specified value to the {@code lod} field. */
        public XrSenseDataProviderCreateInfoSpatialMeshBD.Buffer lod(@NativeType("XrSpatialMeshLodBD") int value) { XrSenseDataProviderCreateInfoSpatialMeshBD.nlod(address(), value); return this; }

    }

}