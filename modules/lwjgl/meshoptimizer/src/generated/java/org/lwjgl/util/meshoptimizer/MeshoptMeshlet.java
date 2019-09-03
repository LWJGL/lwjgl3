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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Experimental: Meshlet
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meshopt_Meshlet {
 *     unsigned int vertices[64];
 *     unsigned char indices[126][3];
 *     unsigned char triangle_count;
 *     unsigned char vertex_count;
 * }</code></pre>
 */
@NativeType("struct meshopt_Meshlet")
public class MeshoptMeshlet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTICES,
        INDICES,
        TRIANGLE_COUNT,
        VERTEX_COUNT;

    static {
        Layout layout = __struct(
            __array(4, 64),
            __array(1, 126 * 3),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTICES = layout.offsetof(0);
        INDICES = layout.offsetof(1);
        TRIANGLE_COUNT = layout.offsetof(2);
        VERTEX_COUNT = layout.offsetof(3);
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

    /** Returns a {@link IntBuffer} view of the {@code vertices} field. */
    @NativeType("unsigned int[64]")
    public IntBuffer vertices() { return nvertices(address()); }
    /** Returns the value at the specified index of the {@code vertices} field. */
    @NativeType("unsigned int")
    public int vertices(int index) { return nvertices(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code indices} field. */
    @NativeType("unsigned char[126][3]")
    public ByteBuffer indices() { return nindices(address()); }
    /** Returns the value at the specified index of the {@code indices} field. */
    @NativeType("unsigned char")
    public byte indices(int index) { return nindices(address(), index); }
    /** Returns the value of the {@code triangle_count} field. */
    @NativeType("unsigned char")
    public byte triangle_count() { return ntriangle_count(address()); }
    /** Returns the value of the {@code vertex_count} field. */
    @NativeType("unsigned char")
    public byte vertex_count() { return nvertex_count(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptMeshlet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptMeshlet malloc() {
        return wrap(MeshoptMeshlet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MeshoptMeshlet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptMeshlet calloc() {
        return wrap(MeshoptMeshlet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MeshoptMeshlet} instance allocated with {@link BufferUtils}. */
    public static MeshoptMeshlet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeshoptMeshlet.class, memAddress(container), container);
    }

    /** Returns a new {@code MeshoptMeshlet} instance for the specified memory address. */
    public static MeshoptMeshlet create(long address) {
        return wrap(MeshoptMeshlet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptMeshlet createSafe(long address) {
        return address == NULL ? null : wrap(MeshoptMeshlet.class, address);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeshoptMeshlet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptMeshlet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code MeshoptMeshlet} instance allocated on the thread-local {@link MemoryStack}. */
    public static MeshoptMeshlet mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code MeshoptMeshlet} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static MeshoptMeshlet callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code MeshoptMeshlet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptMeshlet mallocStack(MemoryStack stack) {
        return wrap(MeshoptMeshlet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MeshoptMeshlet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptMeshlet callocStack(MemoryStack stack) {
        return wrap(MeshoptMeshlet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptMeshlet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptMeshlet.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertices}. */
    public static IntBuffer nvertices(long struct) { return memIntBuffer(struct + MeshoptMeshlet.VERTICES, 64); }
    /** Unsafe version of {@link #vertices(int) vertices}. */
    public static int nvertices(long struct, int index) {
        return UNSAFE.getInt(null, struct + MeshoptMeshlet.VERTICES + check(index, 64) * 4);
    }
    /** Unsafe version of {@link #indices}. */
    public static ByteBuffer nindices(long struct) { return memByteBuffer(struct + MeshoptMeshlet.INDICES, 126 * 3); }
    /** Unsafe version of {@link #indices(int) indices}. */
    public static byte nindices(long struct, int index) {
        return UNSAFE.getByte(null, struct + MeshoptMeshlet.INDICES + check(index, 126 * 3) * 1);
    }
    /** Unsafe version of {@link #triangle_count}. */
    public static byte ntriangle_count(long struct) { return UNSAFE.getByte(null, struct + MeshoptMeshlet.TRIANGLE_COUNT); }
    /** Unsafe version of {@link #vertex_count}. */
    public static byte nvertex_count(long struct) { return UNSAFE.getByte(null, struct + MeshoptMeshlet.VERTEX_COUNT); }

    // -----------------------------------

    /** An array of {@link MeshoptMeshlet} structs. */
    public static class Buffer extends StructBuffer<MeshoptMeshlet, Buffer> implements NativeResource {

        private static final MeshoptMeshlet ELEMENT_FACTORY = MeshoptMeshlet.create(-1L);

        /**
         * Creates a new {@code MeshoptMeshlet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptMeshlet#SIZEOF}, and its mark will be undefined.
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

        /** Returns a {@link IntBuffer} view of the {@code vertices} field. */
        @NativeType("unsigned int[64]")
        public IntBuffer vertices() { return MeshoptMeshlet.nvertices(address()); }
        /** Returns the value at the specified index of the {@code vertices} field. */
        @NativeType("unsigned int")
        public int vertices(int index) { return MeshoptMeshlet.nvertices(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code indices} field. */
        @NativeType("unsigned char[126][3]")
        public ByteBuffer indices() { return MeshoptMeshlet.nindices(address()); }
        /** Returns the value at the specified index of the {@code indices} field. */
        @NativeType("unsigned char")
        public byte indices(int index) { return MeshoptMeshlet.nindices(address(), index); }
        /** Returns the value of the {@code triangle_count} field. */
        @NativeType("unsigned char")
        public byte triangle_count() { return MeshoptMeshlet.ntriangle_count(address()); }
        /** Returns the value of the {@code vertex_count} field. */
        @NativeType("unsigned char")
        public byte vertex_count() { return MeshoptMeshlet.nvertex_count(address()); }

    }

}