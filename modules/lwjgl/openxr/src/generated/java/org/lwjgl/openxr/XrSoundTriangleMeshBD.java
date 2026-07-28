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
 * struct XrSoundTriangleMeshBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t vertexCount;
 *     {@link XrVector3f XrVector3f} * vertices;
 *     uint32_t indexCount;
 *     uint32_t * indices;
 * }</code></pre>
 */
public class XrSoundTriangleMeshBD extends Struct<XrSoundTriangleMeshBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VERTEXCOUNT,
        VERTICES,
        INDEXCOUNT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VERTEXCOUNT = layout.offsetof(2);
        VERTICES = layout.offsetof(3);
        INDEXCOUNT = layout.offsetof(4);
        INDICES = layout.offsetof(5);
    }

    protected XrSoundTriangleMeshBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundTriangleMeshBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundTriangleMeshBD(address, container);
    }

    /**
     * Creates a {@code XrSoundTriangleMeshBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundTriangleMeshBD(ByteBuffer container) {
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
    /** @return the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer vertices() { return nvertices(address()); }
    /** @return the value of the {@code indexCount} field. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("uint32_t *")
    public IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundTriangleMeshBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_TRIANGLE_MESH_BD TYPE_SOUND_TRIANGLE_MESH_BD} value to the {@code type} field. */
    public XrSoundTriangleMeshBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_TRIANGLE_MESH_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundTriangleMeshBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
    public XrSoundTriangleMeshBD vertices(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nvertices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
    public XrSoundTriangleMeshBD indices(@NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundTriangleMeshBD set(
        int type,
        long next,
        XrVector3f.Buffer vertices,
        IntBuffer indices
    ) {
        type(type);
        next(next);
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
    public XrSoundTriangleMeshBD set(XrSoundTriangleMeshBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundTriangleMeshBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundTriangleMeshBD malloc() {
        return new XrSoundTriangleMeshBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundTriangleMeshBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundTriangleMeshBD calloc() {
        return new XrSoundTriangleMeshBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundTriangleMeshBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundTriangleMeshBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundTriangleMeshBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundTriangleMeshBD} instance for the specified memory address. */
    public static XrSoundTriangleMeshBD create(long address) {
        return new XrSoundTriangleMeshBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundTriangleMeshBD createSafe(long address) {
        return address == NULL ? null : new XrSoundTriangleMeshBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundTriangleMeshBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundTriangleMeshBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundTriangleMeshBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundTriangleMeshBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundTriangleMeshBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundTriangleMeshBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundTriangleMeshBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundTriangleMeshBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundTriangleMeshBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundTriangleMeshBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundTriangleMeshBD malloc(MemoryStack stack) {
        return new XrSoundTriangleMeshBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundTriangleMeshBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundTriangleMeshBD calloc(MemoryStack stack) {
        return new XrSoundTriangleMeshBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundTriangleMeshBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundTriangleMeshBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundTriangleMeshBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundTriangleMeshBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundTriangleMeshBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundTriangleMeshBD.NEXT); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return memGetInt(struct + XrSoundTriangleMeshBD.VERTEXCOUNT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector3f.Buffer nvertices(long struct) { return XrVector3f.create(memGetAddress(struct + XrSoundTriangleMeshBD.VERTICES), nvertexCount(struct)); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return memGetInt(struct + XrSoundTriangleMeshBD.INDEXCOUNT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static IntBuffer nindices(long struct) { return memIntBuffer(memGetAddress(struct + XrSoundTriangleMeshBD.INDICES), nindexCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundTriangleMeshBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundTriangleMeshBD.NEXT, value); }
    /** Sets the specified value to the {@code vertexCount} field of the specified {@code struct}. */
    public static void nvertexCount(long struct, int value) { memPutInt(struct + XrSoundTriangleMeshBD.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #vertices(XrVector3f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector3f.Buffer value) { memPutAddress(struct + XrSoundTriangleMeshBD.VERTICES, value.address()); nvertexCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code indexCount} field of the specified {@code struct}. */
    public static void nindexCount(long struct, int value) { memPutInt(struct + XrSoundTriangleMeshBD.INDEXCOUNT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, IntBuffer value) { memPutAddress(struct + XrSoundTriangleMeshBD.INDICES, memAddress(value)); nindexCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSoundTriangleMeshBD.VERTICES));
        check(memGetAddress(struct + XrSoundTriangleMeshBD.INDICES));
    }

    // -----------------------------------

    /** An array of {@link XrSoundTriangleMeshBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundTriangleMeshBD, Buffer> implements NativeResource {

        private static final XrSoundTriangleMeshBD ELEMENT_FACTORY = XrSoundTriangleMeshBD.create(-1L);

        /**
         * Creates a new {@code XrSoundTriangleMeshBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundTriangleMeshBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundTriangleMeshBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundTriangleMeshBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundTriangleMeshBD.nnext(address()); }
        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return XrSoundTriangleMeshBD.nvertexCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer vertices() { return XrSoundTriangleMeshBD.nvertices(address()); }
        /** @return the value of the {@code indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return XrSoundTriangleMeshBD.nindexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint32_t *")
        public IntBuffer indices() { return XrSoundTriangleMeshBD.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundTriangleMeshBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundTriangleMeshBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_TRIANGLE_MESH_BD TYPE_SOUND_TRIANGLE_MESH_BD} value to the {@code type} field. */
        public XrSoundTriangleMeshBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_TRIANGLE_MESH_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundTriangleMeshBD.Buffer next(@NativeType("void const *") long value) { XrSoundTriangleMeshBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertices} field. */
        public XrSoundTriangleMeshBD.Buffer vertices(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrSoundTriangleMeshBD.nvertices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
        public XrSoundTriangleMeshBD.Buffer indices(@NativeType("uint32_t *") IntBuffer value) { XrSoundTriangleMeshBD.nindices(address(), value); return this; }

    }

}