/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkClusterAccelerationStructureTriangleClusterInputNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormat vertexFormat;
 *     uint32_t maxGeometryIndexValue;
 *     uint32_t maxClusterUniqueGeometryCount;
 *     uint32_t maxClusterTriangleCount;
 *     uint32_t maxClusterVertexCount;
 *     uint32_t maxTotalTriangleCount;
 *     uint32_t maxTotalVertexCount;
 *     uint32_t minPositionTruncateBitCount;
 * }}</pre>
 */
public class VkClusterAccelerationStructureTriangleClusterInputNV extends Struct<VkClusterAccelerationStructureTriangleClusterInputNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXFORMAT,
        MAXGEOMETRYINDEXVALUE,
        MAXCLUSTERUNIQUEGEOMETRYCOUNT,
        MAXCLUSTERTRIANGLECOUNT,
        MAXCLUSTERVERTEXCOUNT,
        MAXTOTALTRIANGLECOUNT,
        MAXTOTALVERTEXCOUNT,
        MINPOSITIONTRUNCATEBITCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXFORMAT = layout.offsetof(2);
        MAXGEOMETRYINDEXVALUE = layout.offsetof(3);
        MAXCLUSTERUNIQUEGEOMETRYCOUNT = layout.offsetof(4);
        MAXCLUSTERTRIANGLECOUNT = layout.offsetof(5);
        MAXCLUSTERVERTEXCOUNT = layout.offsetof(6);
        MAXTOTALTRIANGLECOUNT = layout.offsetof(7);
        MAXTOTALVERTEXCOUNT = layout.offsetof(8);
        MINPOSITIONTRUNCATEBITCOUNT = layout.offsetof(9);
    }

    protected VkClusterAccelerationStructureTriangleClusterInputNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureTriangleClusterInputNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureTriangleClusterInputNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code vertexFormat} field. */
    @NativeType("VkFormat")
    public int vertexFormat() { return nvertexFormat(address()); }
    /** @return the value of the {@code maxGeometryIndexValue} field. */
    @NativeType("uint32_t")
    public int maxGeometryIndexValue() { return nmaxGeometryIndexValue(address()); }
    /** @return the value of the {@code maxClusterUniqueGeometryCount} field. */
    @NativeType("uint32_t")
    public int maxClusterUniqueGeometryCount() { return nmaxClusterUniqueGeometryCount(address()); }
    /** @return the value of the {@code maxClusterTriangleCount} field. */
    @NativeType("uint32_t")
    public int maxClusterTriangleCount() { return nmaxClusterTriangleCount(address()); }
    /** @return the value of the {@code maxClusterVertexCount} field. */
    @NativeType("uint32_t")
    public int maxClusterVertexCount() { return nmaxClusterVertexCount(address()); }
    /** @return the value of the {@code maxTotalTriangleCount} field. */
    @NativeType("uint32_t")
    public int maxTotalTriangleCount() { return nmaxTotalTriangleCount(address()); }
    /** @return the value of the {@code maxTotalVertexCount} field. */
    @NativeType("uint32_t")
    public int maxTotalVertexCount() { return nmaxTotalVertexCount(address()); }
    /** @return the value of the {@code minPositionTruncateBitCount} field. */
    @NativeType("uint32_t")
    public int minPositionTruncateBitCount() { return nminPositionTruncateBitCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV} value to the {@code sType} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexFormat} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormat(@NativeType("VkFormat") int value) { nvertexFormat(address(), value); return this; }
    /** Sets the specified value to the {@code maxGeometryIndexValue} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValue(@NativeType("uint32_t") int value) { nmaxGeometryIndexValue(address(), value); return this; }
    /** Sets the specified value to the {@code maxClusterUniqueGeometryCount} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCount(@NativeType("uint32_t") int value) { nmaxClusterUniqueGeometryCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxClusterTriangleCount} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCount(@NativeType("uint32_t") int value) { nmaxClusterTriangleCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxClusterVertexCount} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCount(@NativeType("uint32_t") int value) { nmaxClusterVertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxTotalTriangleCount} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCount(@NativeType("uint32_t") int value) { nmaxTotalTriangleCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxTotalVertexCount} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCount(@NativeType("uint32_t") int value) { nmaxTotalVertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code minPositionTruncateBitCount} field. */
    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCount(@NativeType("uint32_t") int value) { nminPositionTruncateBitCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureTriangleClusterInputNV set(
        int sType,
        long pNext,
        int vertexFormat,
        int maxGeometryIndexValue,
        int maxClusterUniqueGeometryCount,
        int maxClusterTriangleCount,
        int maxClusterVertexCount,
        int maxTotalTriangleCount,
        int maxTotalVertexCount,
        int minPositionTruncateBitCount
    ) {
        sType(sType);
        pNext(pNext);
        vertexFormat(vertexFormat);
        maxGeometryIndexValue(maxGeometryIndexValue);
        maxClusterUniqueGeometryCount(maxClusterUniqueGeometryCount);
        maxClusterTriangleCount(maxClusterTriangleCount);
        maxClusterVertexCount(maxClusterVertexCount);
        maxTotalTriangleCount(maxTotalTriangleCount);
        maxTotalVertexCount(maxTotalVertexCount);
        minPositionTruncateBitCount(minPositionTruncateBitCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureTriangleClusterInputNV set(VkClusterAccelerationStructureTriangleClusterInputNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureTriangleClusterInputNV malloc() {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureTriangleClusterInputNV calloc() {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureTriangleClusterInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureTriangleClusterInputNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureTriangleClusterInputNV create(long address) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureTriangleClusterInputNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureTriangleClusterInputNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureTriangleClusterInputNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureTriangleClusterInputNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkClusterAccelerationStructureTriangleClusterInputNV.PNEXT); }
    /** Unsafe version of {@link #vertexFormat}. */
    public static int nvertexFormat(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.VERTEXFORMAT); }
    /** Unsafe version of {@link #maxGeometryIndexValue}. */
    public static int nmaxGeometryIndexValue(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXGEOMETRYINDEXVALUE); }
    /** Unsafe version of {@link #maxClusterUniqueGeometryCount}. */
    public static int nmaxClusterUniqueGeometryCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXCLUSTERUNIQUEGEOMETRYCOUNT); }
    /** Unsafe version of {@link #maxClusterTriangleCount}. */
    public static int nmaxClusterTriangleCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXCLUSTERTRIANGLECOUNT); }
    /** Unsafe version of {@link #maxClusterVertexCount}. */
    public static int nmaxClusterVertexCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXCLUSTERVERTEXCOUNT); }
    /** Unsafe version of {@link #maxTotalTriangleCount}. */
    public static int nmaxTotalTriangleCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXTOTALTRIANGLECOUNT); }
    /** Unsafe version of {@link #maxTotalVertexCount}. */
    public static int nmaxTotalVertexCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXTOTALVERTEXCOUNT); }
    /** Unsafe version of {@link #minPositionTruncateBitCount}. */
    public static int nminPositionTruncateBitCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MINPOSITIONTRUNCATEBITCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkClusterAccelerationStructureTriangleClusterInputNV.PNEXT, value); }
    /** Unsafe version of {@link #vertexFormat(int) vertexFormat}. */
    public static void nvertexFormat(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.VERTEXFORMAT, value); }
    /** Unsafe version of {@link #maxGeometryIndexValue(int) maxGeometryIndexValue}. */
    public static void nmaxGeometryIndexValue(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXGEOMETRYINDEXVALUE, value); }
    /** Unsafe version of {@link #maxClusterUniqueGeometryCount(int) maxClusterUniqueGeometryCount}. */
    public static void nmaxClusterUniqueGeometryCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXCLUSTERUNIQUEGEOMETRYCOUNT, value); }
    /** Unsafe version of {@link #maxClusterTriangleCount(int) maxClusterTriangleCount}. */
    public static void nmaxClusterTriangleCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXCLUSTERTRIANGLECOUNT, value); }
    /** Unsafe version of {@link #maxClusterVertexCount(int) maxClusterVertexCount}. */
    public static void nmaxClusterVertexCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXCLUSTERVERTEXCOUNT, value); }
    /** Unsafe version of {@link #maxTotalTriangleCount(int) maxTotalTriangleCount}. */
    public static void nmaxTotalTriangleCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXTOTALTRIANGLECOUNT, value); }
    /** Unsafe version of {@link #maxTotalVertexCount(int) maxTotalVertexCount}. */
    public static void nmaxTotalVertexCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MAXTOTALVERTEXCOUNT, value); }
    /** Unsafe version of {@link #minPositionTruncateBitCount(int) minPositionTruncateBitCount}. */
    public static void nminPositionTruncateBitCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureTriangleClusterInputNV.MINPOSITIONTRUNCATEBITCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureTriangleClusterInputNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureTriangleClusterInputNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureTriangleClusterInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureTriangleClusterInputNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureTriangleClusterInputNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureTriangleClusterInputNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureTriangleClusterInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkClusterAccelerationStructureTriangleClusterInputNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkClusterAccelerationStructureTriangleClusterInputNV.npNext(address()); }
        /** @return the value of the {@code vertexFormat} field. */
        @NativeType("VkFormat")
        public int vertexFormat() { return VkClusterAccelerationStructureTriangleClusterInputNV.nvertexFormat(address()); }
        /** @return the value of the {@code maxGeometryIndexValue} field. */
        @NativeType("uint32_t")
        public int maxGeometryIndexValue() { return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxGeometryIndexValue(address()); }
        /** @return the value of the {@code maxClusterUniqueGeometryCount} field. */
        @NativeType("uint32_t")
        public int maxClusterUniqueGeometryCount() { return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterUniqueGeometryCount(address()); }
        /** @return the value of the {@code maxClusterTriangleCount} field. */
        @NativeType("uint32_t")
        public int maxClusterTriangleCount() { return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterTriangleCount(address()); }
        /** @return the value of the {@code maxClusterVertexCount} field. */
        @NativeType("uint32_t")
        public int maxClusterVertexCount() { return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterVertexCount(address()); }
        /** @return the value of the {@code maxTotalTriangleCount} field. */
        @NativeType("uint32_t")
        public int maxTotalTriangleCount() { return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalTriangleCount(address()); }
        /** @return the value of the {@code maxTotalVertexCount} field. */
        @NativeType("uint32_t")
        public int maxTotalVertexCount() { return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalVertexCount(address()); }
        /** @return the value of the {@code minPositionTruncateBitCount} field. */
        @NativeType("uint32_t")
        public int minPositionTruncateBitCount() { return VkClusterAccelerationStructureTriangleClusterInputNV.nminPositionTruncateBitCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer sType(@NativeType("VkStructureType") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV} value to the {@code sType} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer pNext(@NativeType("void *") long value) { VkClusterAccelerationStructureTriangleClusterInputNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexFormat} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer vertexFormat(@NativeType("VkFormat") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nvertexFormat(address(), value); return this; }
        /** Sets the specified value to the {@code maxGeometryIndexValue} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer maxGeometryIndexValue(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nmaxGeometryIndexValue(address(), value); return this; }
        /** Sets the specified value to the {@code maxClusterUniqueGeometryCount} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer maxClusterUniqueGeometryCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterUniqueGeometryCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxClusterTriangleCount} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer maxClusterTriangleCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterTriangleCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxClusterVertexCount} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer maxClusterVertexCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterVertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxTotalTriangleCount} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer maxTotalTriangleCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalTriangleCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxTotalVertexCount} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer maxTotalVertexCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalVertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code minPositionTruncateBitCount} field. */
        public VkClusterAccelerationStructureTriangleClusterInputNV.Buffer minPositionTruncateBitCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureTriangleClusterInputNV.nminPositionTruncateBitCount(address(), value); return this; }

    }

}