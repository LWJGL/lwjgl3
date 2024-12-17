/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

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
public class RenderModel extends Struct<RenderModel> {

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

    protected RenderModel(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RenderModel create(long address, @Nullable ByteBuffer container) {
        return new RenderModel(address, container);
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

    /** Returns a new {@code RenderModel} instance for the specified memory address. */
    public static RenderModel create(long address) {
        return new RenderModel(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RenderModel createSafe(long address) {
        return address == NULL ? null : new RenderModel(address, null);
    }

    /**
     * Create a {@link RenderModel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RenderModel.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rVertexData}. */
    public static RenderModelVertex.Buffer nrVertexData(long struct) { return RenderModelVertex.create(memGetAddress(struct + RenderModel.RVERTEXDATA), nunVertexCount(struct)); }
    /** Unsafe version of {@link #unVertexCount}. */
    public static int nunVertexCount(long struct) { return memGetInt(struct + RenderModel.UNVERTEXCOUNT); }
    /** Unsafe version of {@link #IndexData() IndexData}. */
    public static ShortBuffer nIndexData(long struct) { return memShortBuffer(memGetAddress(struct + RenderModel.INDEXDATA), (nunTriangleCount(struct) * 3)); }
    /** Unsafe version of {@link #unTriangleCount}. */
    public static int nunTriangleCount(long struct) { return memGetInt(struct + RenderModel.UNTRIANGLECOUNT); }
    /** Unsafe version of {@link #diffuseTextureId}. */
    public static int ndiffuseTextureId(long struct) { return memGetInt(struct + RenderModel.DIFFUSETEXTUREID); }

    // -----------------------------------

    /** An array of {@link RenderModel} structs. */
    public static class Buffer extends StructBuffer<RenderModel, Buffer> {

        private static final RenderModel ELEMENT_FACTORY = RenderModel.create(-1L);

        /**
         * Creates a new {@code RenderModel.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModel#SIZEOF}, and its mark will be undefined.</p>
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