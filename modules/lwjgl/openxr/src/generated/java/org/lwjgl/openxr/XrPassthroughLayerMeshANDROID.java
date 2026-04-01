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
 * struct XrPassthroughLayerMeshANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrWindingOrderANDROID windingOrder;
 *     uint32_t vertexCount;
 *     {@link XrVector3f XrVector3f} const * vertices;
 *     uint32_t indexCount;
 *     uint16_t const * indices;
 * }</code></pre>
 */
public class XrPassthroughLayerMeshANDROID extends Struct<XrPassthroughLayerMeshANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        WINDINGORDER,
        VERTEXCOUNT,
        VERTICES,
        INDEXCOUNT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        WINDINGORDER = layout.offsetof(2);
        VERTEXCOUNT = layout.offsetof(3);
        VERTICES = layout.offsetof(4);
        INDEXCOUNT = layout.offsetof(5);
        INDICES = layout.offsetof(6);
    }

    protected XrPassthroughLayerMeshANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughLayerMeshANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughLayerMeshANDROID(address, container);
    }

    /**
     * Creates a {@code XrPassthroughLayerMeshANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughLayerMeshANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code windingOrder} field. */
    @NativeType("XrWindingOrderANDROID")
    public int windingOrder() { return nwindingOrder(address()); }
    /** @return the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrVector3f const *")
    public XrVector3f.@Nullable Buffer vertices() { return nvertices(address()); }
    /** @return the value of the {@code indexCount} field. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("uint16_t const *")
    public @Nullable ShortBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughLayerMeshANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_PASSTHROUGH_LAYER_MESH_ANDROID TYPE_PASSTHROUGH_LAYER_MESH_ANDROID} value to the {@code type} field. */
    public XrPassthroughLayerMeshANDROID type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_PASSTHROUGH_LAYER_MESH_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughLayerMeshANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code windingOrder} field. */
    public XrPassthroughLayerMeshANDROID windingOrder(@NativeType("XrWindingOrderANDROID") int value) { nwindingOrder(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
    public XrPassthroughLayerMeshANDROID vertices(@NativeType("XrVector3f const *") XrVector3f.@Nullable Buffer value) { nvertices(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
    public XrPassthroughLayerMeshANDROID indices(@Nullable @NativeType("uint16_t const *") ShortBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughLayerMeshANDROID set(
        int type,
        long next,
        int windingOrder,
        XrVector3f.@Nullable Buffer vertices,
        @Nullable ShortBuffer indices
    ) {
        type(type);
        next(next);
        windingOrder(windingOrder);
        vertices(vertices);
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
    public XrPassthroughLayerMeshANDROID set(XrPassthroughLayerMeshANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughLayerMeshANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughLayerMeshANDROID malloc() {
        return new XrPassthroughLayerMeshANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughLayerMeshANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughLayerMeshANDROID calloc() {
        return new XrPassthroughLayerMeshANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughLayerMeshANDROID} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughLayerMeshANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughLayerMeshANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughLayerMeshANDROID} instance for the specified memory address. */
    public static XrPassthroughLayerMeshANDROID create(long address) {
        return new XrPassthroughLayerMeshANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughLayerMeshANDROID createSafe(long address) {
        return address == NULL ? null : new XrPassthroughLayerMeshANDROID(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughLayerMeshANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerMeshANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughLayerMeshANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerMeshANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughLayerMeshANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerMeshANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughLayerMeshANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerMeshANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughLayerMeshANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughLayerMeshANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughLayerMeshANDROID malloc(MemoryStack stack) {
        return new XrPassthroughLayerMeshANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughLayerMeshANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughLayerMeshANDROID calloc(MemoryStack stack) {
        return new XrPassthroughLayerMeshANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughLayerMeshANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerMeshANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughLayerMeshANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughLayerMeshANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughLayerMeshANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughLayerMeshANDROID.NEXT); }
    /** Unsafe version of {@link #windingOrder}. */
    public static int nwindingOrder(long struct) { return memGetInt(struct + XrPassthroughLayerMeshANDROID.WINDINGORDER); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return memGetInt(struct + XrPassthroughLayerMeshANDROID.VERTEXCOUNT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.@Nullable Buffer nvertices(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrPassthroughLayerMeshANDROID.VERTICES), nvertexCount(struct)); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return memGetInt(struct + XrPassthroughLayerMeshANDROID.INDEXCOUNT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable ShortBuffer nindices(long struct) { return memShortBufferSafe(memGetAddress(struct + XrPassthroughLayerMeshANDROID.INDICES), nindexCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughLayerMeshANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughLayerMeshANDROID.NEXT, value); }
    /** Unsafe version of {@link #windingOrder(int) windingOrder}. */
    public static void nwindingOrder(long struct, int value) { memPutInt(struct + XrPassthroughLayerMeshANDROID.WINDINGORDER, value); }
    /** Sets the specified value to the {@code vertexCount} field of the specified {@code struct}. */
    public static void nvertexCount(long struct, int value) { memPutInt(struct + XrPassthroughLayerMeshANDROID.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #vertices(XrVector3f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector3f.@Nullable Buffer value) { memPutAddress(struct + XrPassthroughLayerMeshANDROID.VERTICES, memAddressSafe(value)); nvertexCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code indexCount} field of the specified {@code struct}. */
    public static void nindexCount(long struct, int value) { memPutInt(struct + XrPassthroughLayerMeshANDROID.INDEXCOUNT, value); }
    /** Unsafe version of {@link #indices(ShortBuffer) indices}. */
    public static void nindices(long struct, @Nullable ShortBuffer value) { memPutAddress(struct + XrPassthroughLayerMeshANDROID.INDICES, memAddressSafe(value)); nindexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nvertexCount(struct) != 0) {
            check(memGetAddress(struct + XrPassthroughLayerMeshANDROID.VERTICES));
        }
        if (nindexCount(struct) != 0) {
            check(memGetAddress(struct + XrPassthroughLayerMeshANDROID.INDICES));
        }
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughLayerMeshANDROID} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughLayerMeshANDROID, Buffer> implements NativeResource {

        private static final XrPassthroughLayerMeshANDROID ELEMENT_FACTORY = XrPassthroughLayerMeshANDROID.create(-1L);

        /**
         * Creates a new {@code XrPassthroughLayerMeshANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughLayerMeshANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughLayerMeshANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughLayerMeshANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughLayerMeshANDROID.nnext(address()); }
        /** @return the value of the {@code windingOrder} field. */
        @NativeType("XrWindingOrderANDROID")
        public int windingOrder() { return XrPassthroughLayerMeshANDROID.nwindingOrder(address()); }
        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return XrPassthroughLayerMeshANDROID.nvertexCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector3f const *")
        public XrVector3f.@Nullable Buffer vertices() { return XrPassthroughLayerMeshANDROID.nvertices(address()); }
        /** @return the value of the {@code indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return XrPassthroughLayerMeshANDROID.nindexCount(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint16_t const *")
        public @Nullable ShortBuffer indices() { return XrPassthroughLayerMeshANDROID.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughLayerMeshANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughLayerMeshANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDCompositionLayerPassthroughMesh#XR_TYPE_PASSTHROUGH_LAYER_MESH_ANDROID TYPE_PASSTHROUGH_LAYER_MESH_ANDROID} value to the {@code type} field. */
        public XrPassthroughLayerMeshANDROID.Buffer type$Default() { return type(ANDROIDCompositionLayerPassthroughMesh.XR_TYPE_PASSTHROUGH_LAYER_MESH_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughLayerMeshANDROID.Buffer next(@NativeType("void const *") long value) { XrPassthroughLayerMeshANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code windingOrder} field. */
        public XrPassthroughLayerMeshANDROID.Buffer windingOrder(@NativeType("XrWindingOrderANDROID") int value) { XrPassthroughLayerMeshANDROID.nwindingOrder(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
        public XrPassthroughLayerMeshANDROID.Buffer vertices(@NativeType("XrVector3f const *") XrVector3f.@Nullable Buffer value) { XrPassthroughLayerMeshANDROID.nvertices(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
        public XrPassthroughLayerMeshANDROID.Buffer indices(@Nullable @NativeType("uint16_t const *") ShortBuffer value) { XrPassthroughLayerMeshANDROID.nindices(address(), value); return this; }

    }

}