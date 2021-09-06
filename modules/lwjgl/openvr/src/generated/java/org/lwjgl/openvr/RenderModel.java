/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RenderModel_t {
 *     {@link RenderModelVertex RenderModel_Vertex_t} const * {@link #rVertexData};
 *     uint32_t {@link #unVertexCount};
 *     uint16_t const * {@link #IndexData};
 *     uint32_t {@link #unTriangleCount};
 *     TextureID_t {@link #diffuseTextureId};
 * }</code></pre>
 */
@NativeType("struct RenderModel_t")
public class RenderModel extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RVERTEXDATA,
        UNVERTEXCOUNT,
        INDEXDATA,
        UNTRIANGLECOUNT,
        DIFFUSETEXTUREID;

    static {
        Layout layout = __struct(
            Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT, DEFAULT_ALIGN_AS,
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RVERTEXDATA = layout.offsetof(0);
        UNVERTEXCOUNT = layout.offsetof(1);
        INDEXDATA = layout.offsetof(2);
        UNTRIANGLECOUNT = layout.offsetof(3);
        DIFFUSETEXTUREID = layout.offsetof(4);
    }

    /**
     * Creates a {@code RenderModel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModel(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Vertex data for the mesh */
    @NativeType("RenderModel_Vertex_t const *")
    public RenderModelVertex.Buffer rVertexData() { return nrVertexData(address()); }
    /** Number of vertices in the vertex data */
    @NativeType("uint32_t")
    public int unVertexCount() { return nunVertexCount(address()); }
    /** Indices into the vertex data for each triangle */
    @NativeType("uint16_t const *")
    public ShortBuffer IndexData() { return nIndexData(address()); }
    /** Number of triangles in the mesh. Index count is 3 * TriangleCount. */
    @NativeType("uint32_t")
    public int unTriangleCount() { return nunTriangleCount(address()); }
    /** Session unique texture identifier. Rendermodels which share the same texture will have the same id. 0 == texture not present. */
    @NativeType("TextureID_t")
    public int diffuseTextureId() { return ndiffuseTextureId(address()); }

    // -----------------------------------

    /** Returns a new {@code RenderModel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModel malloc() {
        return wrap(RenderModel.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RenderModel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModel calloc() {
        return wrap(RenderModel.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RenderModel} instance allocated with {@link BufferUtils}. */
    public static RenderModel create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RenderModel.class, memAddress(container), container);
    }

    /** Returns a new {@code RenderModel} instance for the specified memory address. */
    public static RenderModel create(long address) {
        return wrap(RenderModel.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModel createSafe(long address) {
        return address == NULL ? null : wrap(RenderModel.class, address);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link RenderModel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModel.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RenderModel mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RenderModel callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RenderModel mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RenderModel callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModel.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModel.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModel.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RenderModel.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code RenderModel} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModel malloc(MemoryStack stack) {
        return wrap(RenderModel.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RenderModel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModel calloc(MemoryStack stack) {
        return wrap(RenderModel.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rVertexData}. */
    public static RenderModelVertex.Buffer nrVertexData(long struct) { return RenderModelVertex.create(memGetAddress(struct + RenderModel.RVERTEXDATA), nunVertexCount(struct)); }
    /** Unsafe version of {@link #unVertexCount}. */
    public static int nunVertexCount(long struct) { return UNSAFE.getInt(null, struct + RenderModel.UNVERTEXCOUNT); }
    /** Unsafe version of {@link #IndexData() IndexData}. */
    public static ShortBuffer nIndexData(long struct) { return memShortBuffer(memGetAddress(struct + RenderModel.INDEXDATA), (nunTriangleCount(struct) * 3)); }
    /** Unsafe version of {@link #unTriangleCount}. */
    public static int nunTriangleCount(long struct) { return UNSAFE.getInt(null, struct + RenderModel.UNTRIANGLECOUNT); }
    /** Unsafe version of {@link #diffuseTextureId}. */
    public static int ndiffuseTextureId(long struct) { return UNSAFE.getInt(null, struct + RenderModel.DIFFUSETEXTUREID); }

    // -----------------------------------

    /** An array of {@link RenderModel} structs. */
    public static class Buffer extends StructBuffer<RenderModel, Buffer> implements NativeResource {

        private static final RenderModel ELEMENT_FACTORY = RenderModel.create(-1L);

        /**
         * Creates a new {@code RenderModel.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModel#SIZEOF}, and its mark will be undefined.
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
        protected RenderModel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link RenderModelVertex.Buffer} view of the struct array pointed to by the {@link RenderModel#rVertexData} field. */
        @NativeType("RenderModel_Vertex_t const *")
        public RenderModelVertex.Buffer rVertexData() { return RenderModel.nrVertexData(address()); }
        /** @return the value of the {@link RenderModel#unVertexCount} field. */
        @NativeType("uint32_t")
        public int unVertexCount() { return RenderModel.nunVertexCount(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@link RenderModel#IndexData} field. */
        @NativeType("uint16_t const *")
        public ShortBuffer IndexData() { return RenderModel.nIndexData(address()); }
        /** @return the value of the {@link RenderModel#unTriangleCount} field. */
        @NativeType("uint32_t")
        public int unTriangleCount() { return RenderModel.nunTriangleCount(address()); }
        /** @return the value of the {@link RenderModel#diffuseTextureId} field. */
        @NativeType("TextureID_t")
        public int diffuseTextureId() { return RenderModel.ndiffuseTextureId(address()); }

    }

}