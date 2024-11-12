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
 * Block Vertex Data.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code normalCount} <b>must</b> be equal to {@code vertexCount} if {@link MLWorldMeshDetection#XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML} was specified during {@code XrWorldMeshDetectorML} creation, otherwise 0.</p>
 * 
 * <p>{@code confidenceCount} <b>must</b> be equal to {@code vertexCount} if {@link MLWorldMeshDetection#XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML} was specified during {@code XrWorldMeshDetectorML} creation, otherwise 0.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to using {@link XrWorldMeshBlockML}</li>
 * <li>{@code type} <b>must</b> be {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_ML TYPE_WORLD_MESH_BLOCK_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code blockResult} <b>must</b> be a valid {@code XrWorldMeshBlockResultML} value</li>
 * <li>{@code lod} <b>must</b> be a valid {@code XrWorldMeshDetectorLodML} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code XrWorldMeshDetectorFlagBitsML} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code indexBuffer} <b>must</b> be a pointer to an array of {@code indexCount} {@code uint16_t} values</li>
 * <li>{@code vertexBuffer} <b>must</b> be a pointer to an array of {@code vertexCount} {@link XrVector3f} structures</li>
 * <li>{@code normalBuffer} <b>must</b> be a pointer to an array of {@code normalCount} {@link XrVector3f} structures</li>
 * <li>{@code confidenceBuffer} <b>must</b> be a pointer to an array of {@code confidenceCount} {@code float} values</li>
 * <li>The {@code indexCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code vertexCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code normalCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code confidenceCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidEXT}, {@link XrVector3f}, {@link XrWorldMeshRequestCompletionML}, {@link MLWorldMeshDetection#xrRequestWorldMeshCompleteML RequestWorldMeshCompleteML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrWorldMeshBlockML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     {@link XrUuidEXT XrUuidEXT} {@link #uuid};
 *     XrWorldMeshBlockResultML {@link #blockResult};
 *     XrWorldMeshDetectorLodML {@link #lod};
 *     XrWorldMeshDetectorFlagsML {@link #flags};
 *     uint32_t {@link #indexCount};
 *     uint16_t * {@link #indexBuffer};
 *     uint32_t {@link #vertexCount};
 *     {@link XrVector3f XrVector3f} * {@link #vertexBuffer};
 *     uint32_t {@link #normalCount};
 *     {@link XrVector3f XrVector3f} * {@link #normalBuffer};
 *     uint32_t {@link #confidenceCount};
 *     float * {@link #confidenceBuffer};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the {@link XrUuidEXT} of the mesh block */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** the {@code XrWorldMeshBlockResultML} of the mesh block. */
    @NativeType("XrWorldMeshBlockResultML")
    public int blockResult() { return nblockResult(address()); }
    /** the {@code XrWorldMeshDetectorLodML} used to generated this mesh block. */
    @NativeType("XrWorldMeshDetectorLodML")
    public int lod() { return nlod(address()); }
    /** are the detector flags defined by {@code XrWorldMeshDetectorFlagBitsML}. */
    @NativeType("XrWorldMeshDetectorFlagsML")
    public long flags() { return nflags(address()); }
    /** the number of indices in the {@code indexBuffer}. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** the index buffer of type {@code uint16_t}. In the indexBuffer each value is the index of a vertex in the vertexBuffer. Three indices define one triangle. For example, the first triangle will have the vertices: {@code vertexBuffer[index[0]]}, {@code vertexBuffer[index[1]]}, {@code vertexBuffer[index[2]]}. Index order is defined by the {@link MLWorldMeshDetection#XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML} flag. */
    @NativeType("uint16_t *")
    public ShortBuffer indexBuffer() { return nindexBuffer(address()); }
    /** the number of vertices in the {@code vertexBuffer}. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** the vertex buffer of type {@link XrVector3f}. Vertex data will be provided in the {@link XrWorldMeshStateRequestInfoML}{@code ::baseSpace} at time {@link XrWorldMeshBlockStateML}{@code ::lastUpdateTime}. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer vertexBuffer() { return nvertexBuffer(address()); }
    /** the number of normals in the {@code normalBuffer}. */
    @NativeType("uint32_t")
    public int normalCount() { return nnormalCount(address()); }
    /** the normal buffer of type {@link XrVector3f}. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer normalBuffer() { return nnormalBuffer(address()); }
    /** the number of confidence values in the {@code confidenceBuffer}. */
    @NativeType("uint32_t")
    public int confidenceCount() { return nconfidenceCount(address()); }
    /** the confidence buffer of type {@code float} with range 0.0 - 1.0. */
    @NativeType("float *")
    public FloatBuffer confidenceBuffer() { return nconfidenceBuffer(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrWorldMeshBlockML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_ML TYPE_WORLD_MESH_BLOCK_ML} value to the {@link #type} field. */
    public XrWorldMeshBlockML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrWorldMeshBlockML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@link #uuid} field. */
    public XrWorldMeshBlockML uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@link #uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrWorldMeshBlockML uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
    /** Sets the specified value to the {@link #blockResult} field. */
    public XrWorldMeshBlockML blockResult(@NativeType("XrWorldMeshBlockResultML") int value) { nblockResult(address(), value); return this; }
    /** Sets the specified value to the {@link #lod} field. */
    public XrWorldMeshBlockML lod(@NativeType("XrWorldMeshDetectorLodML") int value) { nlod(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrWorldMeshBlockML flags(@NativeType("XrWorldMeshDetectorFlagsML") long value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@link #indexBuffer} field. */
    public XrWorldMeshBlockML indexBuffer(@NativeType("uint16_t *") ShortBuffer value) { nindexBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link #vertexBuffer} field. */
    public XrWorldMeshBlockML vertexBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nvertexBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link #normalBuffer} field. */
    public XrWorldMeshBlockML normalBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nnormalBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #confidenceBuffer} field. */
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

        /** @return the value of the {@link XrWorldMeshBlockML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBlockML.ntype(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshBlockML.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@link XrWorldMeshBlockML#uuid} field. */
        public XrUuidEXT uuid() { return XrWorldMeshBlockML.nuuid(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#blockResult} field. */
        @NativeType("XrWorldMeshBlockResultML")
        public int blockResult() { return XrWorldMeshBlockML.nblockResult(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#lod} field. */
        @NativeType("XrWorldMeshDetectorLodML")
        public int lod() { return XrWorldMeshBlockML.nlod(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#flags} field. */
        @NativeType("XrWorldMeshDetectorFlagsML")
        public long flags() { return XrWorldMeshBlockML.nflags(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return XrWorldMeshBlockML.nindexCount(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@link XrWorldMeshBlockML#indexBuffer} field. */
        @NativeType("uint16_t *")
        public ShortBuffer indexBuffer() { return XrWorldMeshBlockML.nindexBuffer(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return XrWorldMeshBlockML.nvertexCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrWorldMeshBlockML#vertexBuffer} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer vertexBuffer() { return XrWorldMeshBlockML.nvertexBuffer(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#normalCount} field. */
        @NativeType("uint32_t")
        public int normalCount() { return XrWorldMeshBlockML.nnormalCount(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrWorldMeshBlockML#normalBuffer} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer normalBuffer() { return XrWorldMeshBlockML.nnormalBuffer(address()); }
        /** @return the value of the {@link XrWorldMeshBlockML#confidenceCount} field. */
        @NativeType("uint32_t")
        public int confidenceCount() { return XrWorldMeshBlockML.nconfidenceCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link XrWorldMeshBlockML#confidenceBuffer} field. */
        @NativeType("float *")
        public FloatBuffer confidenceBuffer() { return XrWorldMeshBlockML.nconfidenceBuffer(address()); }

        /** Sets the specified value to the {@link XrWorldMeshBlockML#type} field. */
        public XrWorldMeshBlockML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBlockML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BLOCK_ML TYPE_WORLD_MESH_BLOCK_ML} value to the {@link XrWorldMeshBlockML#type} field. */
        public XrWorldMeshBlockML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BLOCK_ML); }
        /** Sets the specified value to the {@link XrWorldMeshBlockML#next} field. */
        public XrWorldMeshBlockML.Buffer next(@NativeType("void *") long value) { XrWorldMeshBlockML.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@link XrWorldMeshBlockML#uuid} field. */
        public XrWorldMeshBlockML.Buffer uuid(XrUuidEXT value) { XrWorldMeshBlockML.nuuid(address(), value); return this; }
        /** Passes the {@link XrWorldMeshBlockML#uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrWorldMeshBlockML.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
        /** Sets the specified value to the {@link XrWorldMeshBlockML#blockResult} field. */
        public XrWorldMeshBlockML.Buffer blockResult(@NativeType("XrWorldMeshBlockResultML") int value) { XrWorldMeshBlockML.nblockResult(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshBlockML#lod} field. */
        public XrWorldMeshBlockML.Buffer lod(@NativeType("XrWorldMeshDetectorLodML") int value) { XrWorldMeshBlockML.nlod(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshBlockML#flags} field. */
        public XrWorldMeshBlockML.Buffer flags(@NativeType("XrWorldMeshDetectorFlagsML") long value) { XrWorldMeshBlockML.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@link XrWorldMeshBlockML#indexBuffer} field. */
        public XrWorldMeshBlockML.Buffer indexBuffer(@NativeType("uint16_t *") ShortBuffer value) { XrWorldMeshBlockML.nindexBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link XrWorldMeshBlockML#vertexBuffer} field. */
        public XrWorldMeshBlockML.Buffer vertexBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrWorldMeshBlockML.nvertexBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link XrWorldMeshBlockML#normalBuffer} field. */
        public XrWorldMeshBlockML.Buffer normalBuffer(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrWorldMeshBlockML.nnormalBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link XrWorldMeshBlockML#confidenceBuffer} field. */
        public XrWorldMeshBlockML.Buffer confidenceBuffer(@NativeType("float *") FloatBuffer value) { XrWorldMeshBlockML.nconfidenceBuffer(address(), value); return this; }

    }

}