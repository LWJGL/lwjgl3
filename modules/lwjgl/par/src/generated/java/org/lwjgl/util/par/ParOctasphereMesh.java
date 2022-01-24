/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct par_octasphere_mesh {
 *     float * positions;
 *     float * normals;
 *     float * texcoords;
 *     uint16_t * indices;
 *     uint32_t num_indices;
 *     uint32_t num_vertices;
 * }</code></pre>
 */
@NativeType("struct par_octasphere_mesh")
public class ParOctasphereMesh extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITIONS,
        NORMALS,
        TEXCOORDS,
        INDICES,
        NUM_INDICES,
        NUM_VERTICES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITIONS = layout.offsetof(0);
        NORMALS = layout.offsetof(1);
        TEXCOORDS = layout.offsetof(2);
        INDICES = layout.offsetof(3);
        NUM_INDICES = layout.offsetof(4);
        NUM_VERTICES = layout.offsetof(5);
    }

    /**
     * Creates a {@code ParOctasphereMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParOctasphereMesh(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link FloatBuffer} view of the data pointed to by the {@code positions} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("float *")
    public FloatBuffer positions(int capacity) { return npositions(address(), capacity); }
    /**
     * @return a {@link FloatBuffer} view of the data pointed to by the {@code normals} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("float *")
    public FloatBuffer normals(int capacity) { return nnormals(address(), capacity); }
    /**
     * @return a {@link FloatBuffer} view of the data pointed to by the {@code texcoords} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("float *")
    public FloatBuffer texcoords(int capacity) { return ntexcoords(address(), capacity); }
    /**
     * @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("uint16_t *")
    public ShortBuffer indices(int capacity) { return nindices(address(), capacity); }
    /** @return the value of the {@code num_indices} field. */
    @NativeType("uint32_t")
    public int num_indices() { return nnum_indices(address()); }
    /** @return the value of the {@code num_vertices} field. */
    @NativeType("uint32_t")
    public int num_vertices() { return nnum_vertices(address()); }

    /** Sets the address of the specified {@link FloatBuffer} to the {@code positions} field. */
    public ParOctasphereMesh positions(@NativeType("float *") FloatBuffer value) { npositions(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code normals} field. */
    public ParOctasphereMesh normals(@Nullable @NativeType("float *") FloatBuffer value) { nnormals(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code texcoords} field. */
    public ParOctasphereMesh texcoords(@Nullable @NativeType("float *") FloatBuffer value) { ntexcoords(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
    public ParOctasphereMesh indices(@NativeType("uint16_t *") ShortBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ParOctasphereMesh set(
        FloatBuffer positions,
        @Nullable FloatBuffer normals,
        @Nullable FloatBuffer texcoords,
        ShortBuffer indices
    ) {
        positions(positions);
        normals(normals);
        texcoords(texcoords);
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
    public ParOctasphereMesh set(ParOctasphereMesh src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ParOctasphereMesh} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ParOctasphereMesh malloc() {
        return wrap(ParOctasphereMesh.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ParOctasphereMesh} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ParOctasphereMesh calloc() {
        return wrap(ParOctasphereMesh.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ParOctasphereMesh} instance allocated with {@link BufferUtils}. */
    public static ParOctasphereMesh create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ParOctasphereMesh.class, memAddress(container), container);
    }

    /** Returns a new {@code ParOctasphereMesh} instance for the specified memory address. */
    public static ParOctasphereMesh create(long address) {
        return wrap(ParOctasphereMesh.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParOctasphereMesh createSafe(long address) {
        return address == NULL ? null : wrap(ParOctasphereMesh.class, address);
    }

    /**
     * Returns a new {@link ParOctasphereMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParOctasphereMesh.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ParOctasphereMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParOctasphereMesh.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParOctasphereMesh.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ParOctasphereMesh.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ParOctasphereMesh.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParOctasphereMesh.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParOctasphereMesh.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ParOctasphereMesh} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ParOctasphereMesh malloc(MemoryStack stack) {
        return wrap(ParOctasphereMesh.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ParOctasphereMesh} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ParOctasphereMesh calloc(MemoryStack stack) {
        return wrap(ParOctasphereMesh.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ParOctasphereMesh.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParOctasphereMesh.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParOctasphereMesh.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParOctasphereMesh.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #positions(int) positions}. */
    public static FloatBuffer npositions(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + ParOctasphereMesh.POSITIONS), capacity); }
    /** Unsafe version of {@link #normals(int) normals}. */
    @Nullable public static FloatBuffer nnormals(long struct, int capacity) { return memFloatBufferSafe(memGetAddress(struct + ParOctasphereMesh.NORMALS), capacity); }
    /** Unsafe version of {@link #texcoords(int) texcoords}. */
    @Nullable public static FloatBuffer ntexcoords(long struct, int capacity) { return memFloatBufferSafe(memGetAddress(struct + ParOctasphereMesh.TEXCOORDS), capacity); }
    /** Unsafe version of {@link #indices(int) indices}. */
    public static ShortBuffer nindices(long struct, int capacity) { return memShortBuffer(memGetAddress(struct + ParOctasphereMesh.INDICES), capacity); }
    /** Unsafe version of {@link #num_indices}. */
    public static int nnum_indices(long struct) { return UNSAFE.getInt(null, struct + ParOctasphereMesh.NUM_INDICES); }
    /** Unsafe version of {@link #num_vertices}. */
    public static int nnum_vertices(long struct) { return UNSAFE.getInt(null, struct + ParOctasphereMesh.NUM_VERTICES); }

    /** Unsafe version of {@link #positions(FloatBuffer) positions}. */
    public static void npositions(long struct, FloatBuffer value) { memPutAddress(struct + ParOctasphereMesh.POSITIONS, memAddress(value)); }
    /** Unsafe version of {@link #normals(FloatBuffer) normals}. */
    public static void nnormals(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + ParOctasphereMesh.NORMALS, memAddressSafe(value)); }
    /** Unsafe version of {@link #texcoords(FloatBuffer) texcoords}. */
    public static void ntexcoords(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + ParOctasphereMesh.TEXCOORDS, memAddressSafe(value)); }
    /** Unsafe version of {@link #indices(ShortBuffer) indices}. */
    public static void nindices(long struct, ShortBuffer value) { memPutAddress(struct + ParOctasphereMesh.INDICES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ParOctasphereMesh.POSITIONS));
        check(memGetAddress(struct + ParOctasphereMesh.INDICES));
    }

    // -----------------------------------

    /** An array of {@link ParOctasphereMesh} structs. */
    public static class Buffer extends StructBuffer<ParOctasphereMesh, Buffer> implements NativeResource {

        private static final ParOctasphereMesh ELEMENT_FACTORY = ParOctasphereMesh.create(-1L);

        /**
         * Creates a new {@code ParOctasphereMesh.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParOctasphereMesh#SIZEOF}, and its mark will be undefined.
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
        protected ParOctasphereMesh getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link FloatBuffer} view of the data pointed to by the {@code positions} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("float *")
        public FloatBuffer positions(int capacity) { return ParOctasphereMesh.npositions(address(), capacity); }
        /**
         * @return a {@link FloatBuffer} view of the data pointed to by the {@code normals} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("float *")
        public FloatBuffer normals(int capacity) { return ParOctasphereMesh.nnormals(address(), capacity); }
        /**
         * @return a {@link FloatBuffer} view of the data pointed to by the {@code texcoords} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("float *")
        public FloatBuffer texcoords(int capacity) { return ParOctasphereMesh.ntexcoords(address(), capacity); }
        /**
         * @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint16_t *")
        public ShortBuffer indices(int capacity) { return ParOctasphereMesh.nindices(address(), capacity); }
        /** @return the value of the {@code num_indices} field. */
        @NativeType("uint32_t")
        public int num_indices() { return ParOctasphereMesh.nnum_indices(address()); }
        /** @return the value of the {@code num_vertices} field. */
        @NativeType("uint32_t")
        public int num_vertices() { return ParOctasphereMesh.nnum_vertices(address()); }

        /** Sets the address of the specified {@link FloatBuffer} to the {@code positions} field. */
        public ParOctasphereMesh.Buffer positions(@NativeType("float *") FloatBuffer value) { ParOctasphereMesh.npositions(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code normals} field. */
        public ParOctasphereMesh.Buffer normals(@Nullable @NativeType("float *") FloatBuffer value) { ParOctasphereMesh.nnormals(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code texcoords} field. */
        public ParOctasphereMesh.Buffer texcoords(@Nullable @NativeType("float *") FloatBuffer value) { ParOctasphereMesh.ntexcoords(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
        public ParOctasphereMesh.Buffer indices(@NativeType("uint16_t *") ShortBuffer value) { ParOctasphereMesh.nindices(address(), value); return this; }

    }

}