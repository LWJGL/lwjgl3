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
 * struct XrSpaceTriangleMeshMETA {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector3f XrVector3f} * vertices;
 *     uint32_t indexCapacityInput;
 *     uint32_t indexCountOutput;
 *     uint32_t * indices;
 * }}</pre>
 */
public class XrSpaceTriangleMeshMETA extends Struct<XrSpaceTriangleMeshMETA> implements NativeResource {

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

    protected XrSpaceTriangleMeshMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceTriangleMeshMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceTriangleMeshMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceTriangleMeshMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceTriangleMeshMETA(ByteBuffer container) {
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
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("uint32_t *")
    public @Nullable IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceTriangleMeshMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityMesh#XR_TYPE_SPACE_TRIANGLE_MESH_META TYPE_SPACE_TRIANGLE_MESH_META} value to the {@code type} field. */
    public XrSpaceTriangleMeshMETA type$Default() { return type(METASpatialEntityMesh.XR_TYPE_SPACE_TRIANGLE_MESH_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceTriangleMeshMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceTriangleMeshMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceTriangleMeshMETA set(XrSpaceTriangleMeshMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceTriangleMeshMETA malloc() {
        return new XrSpaceTriangleMeshMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceTriangleMeshMETA calloc() {
        return new XrSpaceTriangleMeshMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceTriangleMeshMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceTriangleMeshMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceTriangleMeshMETA} instance for the specified memory address. */
    public static XrSpaceTriangleMeshMETA create(long address) {
        return new XrSpaceTriangleMeshMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceTriangleMeshMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceTriangleMeshMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceTriangleMeshMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceTriangleMeshMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceTriangleMeshMETA malloc(MemoryStack stack) {
        return new XrSpaceTriangleMeshMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceTriangleMeshMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceTriangleMeshMETA calloc(MemoryStack stack) {
        return new XrSpaceTriangleMeshMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceTriangleMeshMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceTriangleMeshMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceTriangleMeshMETA.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.@Nullable Buffer nvertices(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrSpaceTriangleMeshMETA.VERTICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrSpaceTriangleMeshMETA.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpaceTriangleMeshMETA.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceTriangleMeshMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceTriangleMeshMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceTriangleMeshMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceTriangleMeshMETA, Buffer> implements NativeResource {

        private static final XrSpaceTriangleMeshMETA ELEMENT_FACTORY = XrSpaceTriangleMeshMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceTriangleMeshMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceTriangleMeshMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceTriangleMeshMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceTriangleMeshMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceTriangleMeshMETA.nnext(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrSpaceTriangleMeshMETA.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrSpaceTriangleMeshMETA.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.@Nullable Buffer vertices() { return XrSpaceTriangleMeshMETA.nvertices(address()); }
        /** @return the value of the {@code indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrSpaceTriangleMeshMETA.nindexCapacityInput(address()); }
        /** @return the value of the {@code indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrSpaceTriangleMeshMETA.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint32_t *")
        public @Nullable IntBuffer indices() { return XrSpaceTriangleMeshMETA.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceTriangleMeshMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceTriangleMeshMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityMesh#XR_TYPE_SPACE_TRIANGLE_MESH_META TYPE_SPACE_TRIANGLE_MESH_META} value to the {@code type} field. */
        public XrSpaceTriangleMeshMETA.Buffer type$Default() { return type(METASpatialEntityMesh.XR_TYPE_SPACE_TRIANGLE_MESH_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceTriangleMeshMETA.Buffer next(@NativeType("void *") long value) { XrSpaceTriangleMeshMETA.nnext(address(), value); return this; }

    }

}