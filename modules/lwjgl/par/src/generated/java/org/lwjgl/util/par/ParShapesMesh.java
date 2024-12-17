/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct par_shapes_mesh {
 *     float * points;
 *     int npoints;
 *     PAR_SHAPES_T * triangles;
 *     int ntriangles;
 *     float * normals;
 *     float * tcoords;
 * }}</pre>
 */
@NativeType("struct par_shapes_mesh")
public class ParShapesMesh extends Struct<ParShapesMesh> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POINTS,
        NPOINTS,
        TRIANGLES,
        NTRIANGLES,
        NORMALS,
        TCOORDS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POINTS = layout.offsetof(0);
        NPOINTS = layout.offsetof(1);
        TRIANGLES = layout.offsetof(2);
        NTRIANGLES = layout.offsetof(3);
        NORMALS = layout.offsetof(4);
        TCOORDS = layout.offsetof(5);
    }

    protected ParShapesMesh(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ParShapesMesh create(long address, @Nullable ByteBuffer container) {
        return new ParShapesMesh(address, container);
    }

    /**
     * Creates a {@code ParShapesMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParShapesMesh(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code points} field. */
    @NativeType("float *")
    public FloatBuffer points(int capacity) { return npoints(address(), capacity); }
    /** @return the value of the {@code npoints} field. */
    public int npoints() { return nnpoints(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code triangles} field. */
    @NativeType("PAR_SHAPES_T *")
    public IntBuffer triangles(int capacity) { return ntriangles(address(), capacity); }
    /** @return the value of the {@code ntriangles} field. */
    public int ntriangles() { return nntriangles(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code normals} field. */
    @NativeType("float *")
    public @Nullable FloatBuffer normals(int capacity) { return nnormals(address(), capacity); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code tcoords} field. */
    @NativeType("float *")
    public @Nullable FloatBuffer tcoords(int capacity) { return ntcoords(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code ParShapesMesh} instance for the specified memory address. */
    public static ParShapesMesh create(long address) {
        return new ParShapesMesh(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ParShapesMesh createSafe(long address) {
        return address == NULL ? null : new ParShapesMesh(address, null);
    }

    /**
     * Create a {@link ParShapesMesh.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParShapesMesh.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ParShapesMesh.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #points(int) points}. */
    public static FloatBuffer npoints(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + ParShapesMesh.POINTS), capacity); }
    /** Unsafe version of {@link #npoints}. */
    public static int nnpoints(long struct) { return memGetInt(struct + ParShapesMesh.NPOINTS); }
    /** Unsafe version of {@link #triangles(int) triangles}. */
    public static IntBuffer ntriangles(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + ParShapesMesh.TRIANGLES), capacity); }
    /** Unsafe version of {@link #ntriangles}. */
    public static int nntriangles(long struct) { return memGetInt(struct + ParShapesMesh.NTRIANGLES); }
    /** Unsafe version of {@link #normals(int) normals}. */
    public static @Nullable FloatBuffer nnormals(long struct, int capacity) { return memFloatBufferSafe(memGetAddress(struct + ParShapesMesh.NORMALS), capacity); }
    /** Unsafe version of {@link #tcoords(int) tcoords}. */
    public static @Nullable FloatBuffer ntcoords(long struct, int capacity) { return memFloatBufferSafe(memGetAddress(struct + ParShapesMesh.TCOORDS), capacity); }

    // -----------------------------------

    /** An array of {@link ParShapesMesh} structs. */
    public static class Buffer extends StructBuffer<ParShapesMesh, Buffer> {

        private static final ParShapesMesh ELEMENT_FACTORY = ParShapesMesh.create(-1L);

        /**
         * Creates a new {@code ParShapesMesh.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParShapesMesh#SIZEOF}, and its mark will be undefined.</p>
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
        protected ParShapesMesh getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code points} field. */
        @NativeType("float *")
        public FloatBuffer points(int capacity) { return ParShapesMesh.npoints(address(), capacity); }
        /** @return the value of the {@code npoints} field. */
        public int npoints() { return ParShapesMesh.nnpoints(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code triangles} field. */
        @NativeType("PAR_SHAPES_T *")
        public IntBuffer triangles(int capacity) { return ParShapesMesh.ntriangles(address(), capacity); }
        /** @return the value of the {@code ntriangles} field. */
        public int ntriangles() { return ParShapesMesh.nntriangles(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code normals} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer normals(int capacity) { return ParShapesMesh.nnormals(address(), capacity); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code tcoords} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer tcoords(int capacity) { return ParShapesMesh.ntcoords(address(), capacity); }

    }

}