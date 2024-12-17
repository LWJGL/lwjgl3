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
 * <pre>{@code
 * struct XrWorldMeshBlockML {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     XrWorldMeshBlockResultML blockResult;
 *     XrWorldMeshDetectorLodML lod;
 *     XrWorldMeshDetectorFlagsML flags;
 *     uint32_t indexCount;
 *     uint16_t * indexBuffer;
 *     uint32_t vertexCount;
 *     {@link XrVector3f XrVector3f} * vertexBuffer;
 *     uint32_t normalCount;
 *     {@link XrVector3f XrVector3f} * normalBuffer;
 *     uint32_t confidenceCount;
 *     float * confidenceBuffer;
 * }}</pre>
 */
public class XrWorldMeshBlockML extends Struct<XrWorldMeshBlockML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUID,
        BLOCKRESULT,
        LOD,
        FLAGS,
        INDEXCOUNT,
        INDEXBUFFER,
        VERTEXCOUNT,
        VERTEXBUFFER,
        NORMALCOUNT,
        NORMALBUFFER,
        CONFIDENCECOUNT,
        CONFIDENCEBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
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
        UUID = layout.offsetof(2);
        BLOCKRESULT = layout.offsetof(3);
        LOD = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
        INDEXCOUNT = layout.offsetof(6);
        INDEXBUFFER = layout.offsetof(7);
        VERTEXCOUNT = layout.offsetof(8);
        VERTEXBUFFER = layout.offsetof(9);
        NORMALCOUNT = layout.offsetof(10);
        NORMALBUFFER = layout.offsetof(11);
        CONFIDENCECOUNT = layout.offsetof(12);
        CONFIDENCEBUFFER = layout.offsetof(13);
    }

    protected XrWorldMeshBlockML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshBlockML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshBlockML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshBlockML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshBlockML(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** @return the value of the {@code blockResult} field. */
    @NativeType("XrWorldMeshBlockResultML")
    public int blockResult() { return nblockResult(address()); }
    /** @return the value of the {@code lod} field. */
    @NativeType("XrWorldMeshDetectorLodML")
    public int lod() { return nlod(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("XrWorldMeshDetectorFlagsML")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code indexCount} field. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indexBuffer} field. */
    @NativeType("uint16_t *")
    public ShortBuffer indexBuffer() { return nindexBuffer(address()); }
    /** @return the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexBuffer} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer vertexBuffer() { return nvertexBuffer(address()); }
    /** @return the value of the {@code normalCount} field. */
    @NativeType("uint32_t")
    public int normalCount() { return nnormalCount(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code normalBuffer} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer normalBuffer() { return nnormalBuffer(address()); }
    /** @return the value of the {@code confidenceCount} field. */
    @NativeType("uint32_t")
    public int confidenceCount() { return nconfidenceCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code confidenceBuffer} field. */
    @NativeType("float *")
    public FloatBuffer confidenceBuffer() { return nconfidenceBuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshBlockML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_ML TYPE_WORLD_MESH_BLOCK_ML} value to the {@code type} field. */
    public XrWorldMeshBlockML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshBlockML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
    public XrWorldMeshBlockML uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshBlockML uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
    /** Sets the specified value to the {@code blockResult} field. */
    public XrWorldMeshBlockML blockResult(@NativeType("XrWorldMeshBlockResultML") int value) { nblockResult(address(), value); return this; }
    /** Sets the specified value to the {@code lod} field. */
    public XrWorldMeshBlockML lod(@NativeType("XrWorldMeshDetectorLodML") int value) { nlod(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrWorldMeshBlockML flags(@NativeType("XrWorldMeshDetectorFlagsML") long value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code indexBuffer} field. */
    public XrWorldMeshBlockML indexBuffer(@NativeType("uint16_t *") ShortBuffer value) { nindexBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexBuffer} field. */
    public XrWorldMeshBlockML vertexBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nvertexBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code normalBuffer} field. */
    public XrWorldMeshBlockML normalBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nnormalBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code confidenceBuffer} field. */
    public XrWorldMeshBlockML confidenceBuffer(@NativeType("float *") FloatBuffer value) { nconfidenceBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshBlockML set(
        int type,
        long next,
        XrUuidEXT uuid,
        int blockResult,
        int lod,
        long flags,
        ShortBuffer indexBuffer,
        XrVector3f.Buffer vertexBuffer,
        XrVector3f.Buffer normalBuffer,
        FloatBuffer confidenceBuffer
    ) {
        type(type);
        next(next);
        uuid(uuid);
        blockResult(blockResult);
        lod(lod);
        flags(flags);
        indexBuffer(indexBuffer);
        vertexBuffer(vertexBuffer);
        normalBuffer(normalBuffer);
        confidenceBuffer(confidenceBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshBlockML set(XrWorldMeshBlockML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshBlockML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBlockML malloc() {
        return new XrWorldMeshBlockML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBlockML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBlockML calloc() {
        return new XrWorldMeshBlockML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBlockML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshBlockML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshBlockML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshBlockML} instance for the specified memory address. */
    public static XrWorldMeshBlockML create(long address) {
        return new XrWorldMeshBlockML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshBlockML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshBlockML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshBlockML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshBlockML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshBlockML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBlockML malloc(MemoryStack stack) {
        return new XrWorldMeshBlockML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshBlockML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBlockML calloc(MemoryStack stack) {
        return new XrWorldMeshBlockML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBlockML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBlockML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshBlockML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshBlockML.NEXT); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrWorldMeshBlockML.UUID); }
    /** Unsafe version of {@link #blockResult}. */
    public static int nblockResult(long struct) { return memGetInt(struct + XrWorldMeshBlockML.BLOCKRESULT); }
    /** Unsafe version of {@link #lod}. */
    public static int nlod(long struct) { return memGetInt(struct + XrWorldMeshBlockML.LOD); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrWorldMeshBlockML.FLAGS); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return memGetInt(struct + XrWorldMeshBlockML.INDEXCOUNT); }
    /** Unsafe version of {@link #indexBuffer() indexBuffer}. */
    public static ShortBuffer nindexBuffer(long struct) { return memShortBuffer(memGetAddress(struct + XrWorldMeshBlockML.INDEXBUFFER), nindexCount(struct)); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return memGetInt(struct + XrWorldMeshBlockML.VERTEXCOUNT); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static XrVector3f.Buffer nvertexBuffer(long struct) { return XrVector3f.create(memGetAddress(struct + XrWorldMeshBlockML.VERTEXBUFFER), nvertexCount(struct)); }
    /** Unsafe version of {@link #normalCount}. */
    public static int nnormalCount(long struct) { return memGetInt(struct + XrWorldMeshBlockML.NORMALCOUNT); }
    /** Unsafe version of {@link #normalBuffer}. */
    public static XrVector3f.Buffer nnormalBuffer(long struct) { return XrVector3f.create(memGetAddress(struct + XrWorldMeshBlockML.NORMALBUFFER), nnormalCount(struct)); }
    /** Unsafe version of {@link #confidenceCount}. */
    public static int nconfidenceCount(long struct) { return memGetInt(struct + XrWorldMeshBlockML.CONFIDENCECOUNT); }
    /** Unsafe version of {@link #confidenceBuffer() confidenceBuffer}. */
    public static FloatBuffer nconfidenceBuffer(long struct) { return memFloatBuffer(memGetAddress(struct + XrWorldMeshBlockML.CONFIDENCEBUFFER), nconfidenceCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshBlockML.NEXT, value); }
    /** Unsafe version of {@link #uuid(XrUuidEXT) uuid}. */
    public static void nuuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrWorldMeshBlockML.UUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #blockResult(int) blockResult}. */
    public static void nblockResult(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.BLOCKRESULT, value); }
    /** Unsafe version of {@link #lod(int) lod}. */
    public static void nlod(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.LOD, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrWorldMeshBlockML.FLAGS, value); }
    /** Sets the specified value to the {@code indexCount} field of the specified {@code struct}. */
    public static void nindexCount(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.INDEXCOUNT, value); }
    /** Unsafe version of {@link #indexBuffer(ShortBuffer) indexBuffer}. */
    public static void nindexBuffer(long struct, ShortBuffer value) { memPutAddress(struct + XrWorldMeshBlockML.INDEXBUFFER, memAddress(value)); nindexCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code vertexCount} field of the specified {@code struct}. */
    public static void nvertexCount(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #vertexBuffer(XrVector3f.Buffer) vertexBuffer}. */
    public static void nvertexBuffer(long struct, XrVector3f.Buffer value) { memPutAddress(struct + XrWorldMeshBlockML.VERTEXBUFFER, value.address()); nvertexCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code normalCount} field of the specified {@code struct}. */
    public static void nnormalCount(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.NORMALCOUNT, value); }
    /** Unsafe version of {@link #normalBuffer(XrVector3f.Buffer) normalBuffer}. */
    public static void nnormalBuffer(long struct, XrVector3f.Buffer value) { memPutAddress(struct + XrWorldMeshBlockML.NORMALBUFFER, value.address()); nnormalCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code confidenceCount} field of the specified {@code struct}. */
    public static void nconfidenceCount(long struct, int value) { memPutInt(struct + XrWorldMeshBlockML.CONFIDENCECOUNT, value); }
    /** Unsafe version of {@link #confidenceBuffer(FloatBuffer) confidenceBuffer}. */
    public static void nconfidenceBuffer(long struct, FloatBuffer value) { memPutAddress(struct + XrWorldMeshBlockML.CONFIDENCEBUFFER, memAddress(value)); nconfidenceCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrWorldMeshBlockML.INDEXBUFFER));
        check(memGetAddress(struct + XrWorldMeshBlockML.VERTEXBUFFER));
        check(memGetAddress(struct + XrWorldMeshBlockML.NORMALBUFFER));
        check(memGetAddress(struct + XrWorldMeshBlockML.CONFIDENCEBUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrWorldMeshBlockML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshBlockML, Buffer> implements NativeResource {

        private static final XrWorldMeshBlockML ELEMENT_FACTORY = XrWorldMeshBlockML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshBlockML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshBlockML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshBlockML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBlockML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshBlockML.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrWorldMeshBlockML.nuuid(address()); }
        /** @return the value of the {@code blockResult} field. */
        @NativeType("XrWorldMeshBlockResultML")
        public int blockResult() { return XrWorldMeshBlockML.nblockResult(address()); }
        /** @return the value of the {@code lod} field. */
        @NativeType("XrWorldMeshDetectorLodML")
        public int lod() { return XrWorldMeshBlockML.nlod(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrWorldMeshDetectorFlagsML")
        public long flags() { return XrWorldMeshBlockML.nflags(address()); }
        /** @return the value of the {@code indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return XrWorldMeshBlockML.nindexCount(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indexBuffer} field. */
        @NativeType("uint16_t *")
        public ShortBuffer indexBuffer() { return XrWorldMeshBlockML.nindexBuffer(address()); }
        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return XrWorldMeshBlockML.nvertexCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexBuffer} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer vertexBuffer() { return XrWorldMeshBlockML.nvertexBuffer(address()); }
        /** @return the value of the {@code normalCount} field. */
        @NativeType("uint32_t")
        public int normalCount() { return XrWorldMeshBlockML.nnormalCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code normalBuffer} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer normalBuffer() { return XrWorldMeshBlockML.nnormalBuffer(address()); }
        /** @return the value of the {@code confidenceCount} field. */
        @NativeType("uint32_t")
        public int confidenceCount() { return XrWorldMeshBlockML.nconfidenceCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code confidenceBuffer} field. */
        @NativeType("float *")
        public FloatBuffer confidenceBuffer() { return XrWorldMeshBlockML.nconfidenceBuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshBlockML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBlockML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_ML TYPE_WORLD_MESH_BLOCK_ML} value to the {@code type} field. */
        public XrWorldMeshBlockML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshBlockML.Buffer next(@NativeType("void *") long value) { XrWorldMeshBlockML.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
        public XrWorldMeshBlockML.Buffer uuid(XrUuidEXT value) { XrWorldMeshBlockML.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshBlockML.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
        /** Sets the specified value to the {@code blockResult} field. */
        public XrWorldMeshBlockML.Buffer blockResult(@NativeType("XrWorldMeshBlockResultML") int value) { XrWorldMeshBlockML.nblockResult(address(), value); return this; }
        /** Sets the specified value to the {@code lod} field. */
        public XrWorldMeshBlockML.Buffer lod(@NativeType("XrWorldMeshDetectorLodML") int value) { XrWorldMeshBlockML.nlod(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrWorldMeshBlockML.Buffer flags(@NativeType("XrWorldMeshDetectorFlagsML") long value) { XrWorldMeshBlockML.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code indexBuffer} field. */
        public XrWorldMeshBlockML.Buffer indexBuffer(@NativeType("uint16_t *") ShortBuffer value) { XrWorldMeshBlockML.nindexBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexBuffer} field. */
        public XrWorldMeshBlockML.Buffer vertexBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrWorldMeshBlockML.nvertexBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code normalBuffer} field. */
        public XrWorldMeshBlockML.Buffer normalBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrWorldMeshBlockML.nnormalBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code confidenceBuffer} field. */
        public XrWorldMeshBlockML.Buffer confidenceBuffer(@NativeType("float *") FloatBuffer value) { XrWorldMeshBlockML.nconfidenceBuffer(address(), value); return this; }

    }

}