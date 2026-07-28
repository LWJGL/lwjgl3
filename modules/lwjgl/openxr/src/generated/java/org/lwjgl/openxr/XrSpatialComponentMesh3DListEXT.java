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
 * struct XrSpatialComponentMesh3DListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t meshCount;
 *     {@link XrSpatialMeshDataEXT XrSpatialMeshDataEXT} * meshes;
 * }</code></pre>
 */
public class XrSpatialComponentMesh3DListEXT extends Struct<XrSpatialComponentMesh3DListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESHCOUNT,
        MESHES;

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
        MESHCOUNT = layout.offsetof(2);
        MESHES = layout.offsetof(3);
    }

    protected XrSpatialComponentMesh3DListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentMesh3DListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentMesh3DListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentMesh3DListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentMesh3DListEXT(ByteBuffer container) {
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
    /** @return the value of the {@code meshCount} field. */
    @NativeType("uint32_t")
    public int meshCount() { return nmeshCount(address()); }
    /** @return a {@link XrSpatialMeshDataEXT.Buffer} view of the struct array pointed to by the {@code meshes} field. */
    @NativeType("XrSpatialMeshDataEXT *")
    public XrSpatialMeshDataEXT.Buffer meshes() { return nmeshes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentMesh3DListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentMesh3DListEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentMesh3DListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialMeshDataEXT.Buffer} to the {@code meshes} field. */
    public XrSpatialComponentMesh3DListEXT meshes(@NativeType("XrSpatialMeshDataEXT *") XrSpatialMeshDataEXT.Buffer value) { nmeshes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentMesh3DListEXT set(
        int type,
        long next,
        XrSpatialMeshDataEXT.Buffer meshes
    ) {
        type(type);
        next(next);
        meshes(meshes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentMesh3DListEXT set(XrSpatialComponentMesh3DListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentMesh3DListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentMesh3DListEXT malloc() {
        return new XrSpatialComponentMesh3DListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentMesh3DListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentMesh3DListEXT calloc() {
        return new XrSpatialComponentMesh3DListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentMesh3DListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentMesh3DListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentMesh3DListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentMesh3DListEXT} instance for the specified memory address. */
    public static XrSpatialComponentMesh3DListEXT create(long address) {
        return new XrSpatialComponentMesh3DListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentMesh3DListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentMesh3DListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentMesh3DListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMesh3DListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentMesh3DListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMesh3DListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentMesh3DListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMesh3DListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentMesh3DListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMesh3DListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentMesh3DListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentMesh3DListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentMesh3DListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentMesh3DListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentMesh3DListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentMesh3DListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentMesh3DListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentMesh3DListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMesh3DListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentMesh3DListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentMesh3DListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentMesh3DListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentMesh3DListEXT.NEXT); }
    /** Unsafe version of {@link #meshCount}. */
    public static int nmeshCount(long struct) { return memGetInt(struct + XrSpatialComponentMesh3DListEXT.MESHCOUNT); }
    /** Unsafe version of {@link #meshes}. */
    public static XrSpatialMeshDataEXT.Buffer nmeshes(long struct) { return XrSpatialMeshDataEXT.create(memGetAddress(struct + XrSpatialComponentMesh3DListEXT.MESHES), nmeshCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentMesh3DListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentMesh3DListEXT.NEXT, value); }
    /** Sets the specified value to the {@code meshCount} field of the specified {@code struct}. */
    public static void nmeshCount(long struct, int value) { memPutInt(struct + XrSpatialComponentMesh3DListEXT.MESHCOUNT, value); }
    /** Unsafe version of {@link #meshes(XrSpatialMeshDataEXT.Buffer) meshes}. */
    public static void nmeshes(long struct, XrSpatialMeshDataEXT.Buffer value) { memPutAddress(struct + XrSpatialComponentMesh3DListEXT.MESHES, value.address()); nmeshCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentMesh3DListEXT.MESHES));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentMesh3DListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentMesh3DListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentMesh3DListEXT ELEMENT_FACTORY = XrSpatialComponentMesh3DListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentMesh3DListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentMesh3DListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentMesh3DListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentMesh3DListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentMesh3DListEXT.nnext(address()); }
        /** @return the value of the {@code meshCount} field. */
        @NativeType("uint32_t")
        public int meshCount() { return XrSpatialComponentMesh3DListEXT.nmeshCount(address()); }
        /** @return a {@link XrSpatialMeshDataEXT.Buffer} view of the struct array pointed to by the {@code meshes} field. */
        @NativeType("XrSpatialMeshDataEXT *")
        public XrSpatialMeshDataEXT.Buffer meshes() { return XrSpatialComponentMesh3DListEXT.nmeshes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentMesh3DListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentMesh3DListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentMesh3DListEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentMesh3DListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentMesh3DListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialMeshDataEXT.Buffer} to the {@code meshes} field. */
        public XrSpatialComponentMesh3DListEXT.Buffer meshes(@NativeType("XrSpatialMeshDataEXT *") XrSpatialMeshDataEXT.Buffer value) { XrSpatialComponentMesh3DListEXT.nmeshes(address(), value); return this; }

    }

}