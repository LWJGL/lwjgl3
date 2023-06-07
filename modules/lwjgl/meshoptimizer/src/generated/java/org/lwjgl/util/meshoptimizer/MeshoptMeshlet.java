/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Experimental: Meshlet
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meshopt_Meshlet {
 *     unsigned int {@link #vertex_offset};
 *     unsigned int {@link #triangle_offset};
 *     unsigned int {@link #vertex_count};
 *     unsigned int {@link #triangle_count};
 * }</code></pre>
 */
@NativeType("struct meshopt_Meshlet")
public class MeshoptMeshlet extends Struct<MeshoptMeshlet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEX_OFFSET,
        TRIANGLE_OFFSET,
        VERTEX_COUNT,
        TRIANGLE_COUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEX_OFFSET = layout.offsetof(0);
        TRIANGLE_OFFSET = layout.offsetof(1);
        VERTEX_COUNT = layout.offsetof(2);
        TRIANGLE_COUNT = layout.offsetof(3);
    }

    protected MeshoptMeshlet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MeshoptMeshlet create(long address, @Nullable ByteBuffer container) {
        return new MeshoptMeshlet(address, container);
    }

    /**
     * Creates a {@code MeshoptMeshlet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptMeshlet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** offset within {@code meshlet_vertices} array with meshlet data */
    @NativeType("unsigned int")
    public int vertex_offset() { return nvertex_offset(address()); }
    /** offset within {@code meshlet_triangles} array with meshlet data */
    @NativeType("unsigned int")
    public int triangle_offset() { return ntriangle_offset(address()); }
    /** number of vertices used in the meshlet; data is stored in consecutive range defined by offset and count */
    @NativeType("unsigned int")
    public int vertex_count() { return nvertex_count(address()); }
    /** number of triangles used in the meshlet; data is stored in consecutive range defined by offset and count */
    @NativeType("unsigned int")
    public int triangle_count() { return ntriangle_count(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptMeshlet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptMeshlet malloc() {
        return new MeshoptMeshlet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MeshoptMeshlet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptMeshlet calloc() {
        return new MeshoptMeshlet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MeshoptMeshlet} instance allocated with {@link BufferUtils}. */
    public static MeshoptMeshlet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MeshoptMeshlet(memAddress(container), container);
    }

    /** Returns a new {@code MeshoptMeshlet} instance for the specified memory address. */
    public static MeshoptMeshlet create(long address) {
        return new MeshoptMeshlet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptMeshlet createSafe(long address) {
        return address == NULL ? null : new MeshoptMeshlet(address, null);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MeshoptMeshlet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptMeshlet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MeshoptMeshlet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptMeshlet malloc(MemoryStack stack) {
        return new MeshoptMeshlet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MeshoptMeshlet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptMeshlet calloc(MemoryStack stack) {
        return new MeshoptMeshlet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertex_offset}. */
    public static int nvertex_offset(long struct) { return UNSAFE.getInt(null, struct + MeshoptMeshlet.VERTEX_OFFSET); }
    /** Unsafe version of {@link #triangle_offset}. */
    public static int ntriangle_offset(long struct) { return UNSAFE.getInt(null, struct + MeshoptMeshlet.TRIANGLE_OFFSET); }
    /** Unsafe version of {@link #vertex_count}. */
    public static int nvertex_count(long struct) { return UNSAFE.getInt(null, struct + MeshoptMeshlet.VERTEX_COUNT); }
    /** Unsafe version of {@link #triangle_count}. */
    public static int ntriangle_count(long struct) { return UNSAFE.getInt(null, struct + MeshoptMeshlet.TRIANGLE_COUNT); }

    // -----------------------------------

    /** An array of {@link MeshoptMeshlet} structs. */
    public static class Buffer extends StructBuffer<MeshoptMeshlet, Buffer> implements NativeResource {

        private static final MeshoptMeshlet ELEMENT_FACTORY = MeshoptMeshlet.create(-1L);

        /**
         * Creates a new {@code MeshoptMeshlet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptMeshlet#SIZEOF}, and its mark will be undefined.</p>
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
        protected MeshoptMeshlet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link MeshoptMeshlet#vertex_offset} field. */
        @NativeType("unsigned int")
        public int vertex_offset() { return MeshoptMeshlet.nvertex_offset(address()); }
        /** @return the value of the {@link MeshoptMeshlet#triangle_offset} field. */
        @NativeType("unsigned int")
        public int triangle_offset() { return MeshoptMeshlet.ntriangle_offset(address()); }
        /** @return the value of the {@link MeshoptMeshlet#vertex_count} field. */
        @NativeType("unsigned int")
        public int vertex_count() { return MeshoptMeshlet.nvertex_count(address()); }
        /** @return the value of the {@link MeshoptMeshlet#triangle_count} field. */
        @NativeType("unsigned int")
        public int triangle_count() { return MeshoptMeshlet.ntriangle_count(address()); }

    }

}