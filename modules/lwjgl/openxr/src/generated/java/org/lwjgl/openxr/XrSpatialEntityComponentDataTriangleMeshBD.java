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
 * struct XrSpatialEntityComponentDataTriangleMeshBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector3f XrVector3f} * vertices;
 *     uint32_t indexCapacityInput;
 *     uint32_t indexCountOutput;
 *     uint16_t * indices;
 * }}</pre>
 */
public class XrSpatialEntityComponentDataTriangleMeshBD extends Struct<XrSpatialEntityComponentDataTriangleMeshBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTICES,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VERTEXCAPACITYINPUT = layout.offsetof(2);
        VERTEXCOUNTOUTPUT = layout.offsetof(3);
        VERTICES = layout.offsetof(4);
        INDEXCAPACITYINPUT = layout.offsetof(5);
        INDEXCOUNTOUTPUT = layout.offsetof(6);
        INDICES = layout.offsetof(7);
    }

    protected XrSpatialEntityComponentDataTriangleMeshBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataTriangleMeshBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataTriangleMeshBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataTriangleMeshBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataTriangleMeshBD(ByteBuffer container) {
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
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.@Nullable Buffer vertices() { return nvertices(address()); }
    /** @return the value of the {@code indexCapacityInput} field. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** @return the value of the {@code indexCountOutput} field. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("uint16_t *")
    public @Nullable ShortBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD vertices(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { nvertices(address(), value); return this; }
    /** Sets the specified value to the {@code indexCapacityInput} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code indexCountOutput} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
    public XrSpatialEntityComponentDataTriangleMeshBD indices(@Nullable @NativeType("uint16_t *") ShortBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataTriangleMeshBD set(
        int type,
        long next,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector3f.@Nullable Buffer vertices,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable ShortBuffer indices
    ) {
        type(type);
        next(next);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertices(vertices);
        indexCapacityInput(indexCapacityInput);
        indexCountOutput(indexCountOutput);
        indices(indices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataTriangleMeshBD set(XrSpatialEntityComponentDataTriangleMeshBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataTriangleMeshBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataTriangleMeshBD malloc() {
        return new XrSpatialEntityComponentDataTriangleMeshBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataTriangleMeshBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataTriangleMeshBD calloc() {
        return new XrSpatialEntityComponentDataTriangleMeshBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataTriangleMeshBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataTriangleMeshBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataTriangleMeshBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataTriangleMeshBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataTriangleMeshBD create(long address) {
        return new XrSpatialEntityComponentDataTriangleMeshBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataTriangleMeshBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataTriangleMeshBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataTriangleMeshBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataTriangleMeshBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataTriangleMeshBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataTriangleMeshBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataTriangleMeshBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataTriangleMeshBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataTriangleMeshBD.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.@Nullable Buffer nvertices(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrSpatialEntityComponentDataTriangleMeshBD.VERTICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable ShortBuffer nindices(long struct) { return memShortBufferSafe(memGetAddress(struct + XrSpatialEntityComponentDataTriangleMeshBD.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataTriangleMeshBD.NEXT, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrVector3f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrSpatialEntityComponentDataTriangleMeshBD.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataTriangleMeshBD.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(ShortBuffer) indices}. */
    public static void nindices(long struct, @Nullable ShortBuffer value) { memPutAddress(struct + XrSpatialEntityComponentDataTriangleMeshBD.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataTriangleMeshBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataTriangleMeshBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataTriangleMeshBD ELEMENT_FACTORY = XrSpatialEntityComponentDataTriangleMeshBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataTriangleMeshBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataTriangleMeshBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataTriangleMeshBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataTriangleMeshBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataTriangleMeshBD.nnext(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrSpatialEntityComponentDataTriangleMeshBD.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrSpatialEntityComponentDataTriangleMeshBD.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertices() { return XrSpatialEntityComponentDataTriangleMeshBD.nvertices(address()); }
        /** @return the value of the {@code indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrSpatialEntityComponentDataTriangleMeshBD.nindexCapacityInput(address()); }
        /** @return the value of the {@code indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrSpatialEntityComponentDataTriangleMeshBD.nindexCountOutput(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint16_t *")
        public @Nullable ShortBuffer indices() { return XrSpatialEntityComponentDataTriangleMeshBD.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataTriangleMeshBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataTriangleMeshBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrSpatialEntityComponentDataTriangleMeshBD.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrSpatialEntityComponentDataTriangleMeshBD.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer vertices(@NativeType("XrVector3f *") XrVector3f.@Nullable Buffer value) { XrSpatialEntityComponentDataTriangleMeshBD.nvertices(address(), value); return this; }
        /** Sets the specified value to the {@code indexCapacityInput} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrSpatialEntityComponentDataTriangleMeshBD.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code indexCountOutput} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrSpatialEntityComponentDataTriangleMeshBD.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
        public XrSpatialEntityComponentDataTriangleMeshBD.Buffer indices(@Nullable @NativeType("uint16_t *") ShortBuffer value) { XrSpatialEntityComponentDataTriangleMeshBD.nindices(address(), value); return this; }

    }

}