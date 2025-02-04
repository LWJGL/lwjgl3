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
 * struct VkPhysicalDeviceClusterAccelerationStructurePropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxVerticesPerCluster;
 *     uint32_t maxTrianglesPerCluster;
 *     uint32_t clusterScratchByteAlignment;
 *     uint32_t clusterByteAlignment;
 *     uint32_t clusterTemplateByteAlignment;
 *     uint32_t clusterBottomLevelByteAlignment;
 *     uint32_t clusterTemplateBoundsByteAlignment;
 *     uint32_t maxClusterGeometryIndex;
 * }}</pre>
 */
public class VkPhysicalDeviceClusterAccelerationStructurePropertiesNV extends Struct<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVERTICESPERCLUSTER,
        MAXTRIANGLESPERCLUSTER,
        CLUSTERSCRATCHBYTEALIGNMENT,
        CLUSTERBYTEALIGNMENT,
        CLUSTERTEMPLATEBYTEALIGNMENT,
        CLUSTERBOTTOMLEVELBYTEALIGNMENT,
        CLUSTERTEMPLATEBOUNDSBYTEALIGNMENT,
        MAXCLUSTERGEOMETRYINDEX;

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
        MAXVERTICESPERCLUSTER = layout.offsetof(2);
        MAXTRIANGLESPERCLUSTER = layout.offsetof(3);
        CLUSTERSCRATCHBYTEALIGNMENT = layout.offsetof(4);
        CLUSTERBYTEALIGNMENT = layout.offsetof(5);
        CLUSTERTEMPLATEBYTEALIGNMENT = layout.offsetof(6);
        CLUSTERBOTTOMLEVELBYTEALIGNMENT = layout.offsetof(7);
        CLUSTERTEMPLATEBOUNDSBYTEALIGNMENT = layout.offsetof(8);
        MAXCLUSTERGEOMETRYINDEX = layout.offsetof(9);
    }

    protected VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceClusterAccelerationStructurePropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxVerticesPerCluster} field. */
    @NativeType("uint32_t")
    public int maxVerticesPerCluster() { return nmaxVerticesPerCluster(address()); }
    /** @return the value of the {@code maxTrianglesPerCluster} field. */
    @NativeType("uint32_t")
    public int maxTrianglesPerCluster() { return nmaxTrianglesPerCluster(address()); }
    /** @return the value of the {@code clusterScratchByteAlignment} field. */
    @NativeType("uint32_t")
    public int clusterScratchByteAlignment() { return nclusterScratchByteAlignment(address()); }
    /** @return the value of the {@code clusterByteAlignment} field. */
    @NativeType("uint32_t")
    public int clusterByteAlignment() { return nclusterByteAlignment(address()); }
    /** @return the value of the {@code clusterTemplateByteAlignment} field. */
    @NativeType("uint32_t")
    public int clusterTemplateByteAlignment() { return nclusterTemplateByteAlignment(address()); }
    /** @return the value of the {@code clusterBottomLevelByteAlignment} field. */
    @NativeType("uint32_t")
    public int clusterBottomLevelByteAlignment() { return nclusterBottomLevelByteAlignment(address()); }
    /** @return the value of the {@code clusterTemplateBoundsByteAlignment} field. */
    @NativeType("uint32_t")
    public int clusterTemplateBoundsByteAlignment() { return nclusterTemplateBoundsByteAlignment(address()); }
    /** @return the value of the {@code maxClusterGeometryIndex} field. */
    @NativeType("uint32_t")
    public int maxClusterGeometryIndex() { return nmaxClusterGeometryIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV set(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV malloc() {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV calloc() {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV create(long address) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceClusterAccelerationStructurePropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxVerticesPerCluster}. */
    public static int nmaxVerticesPerCluster(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.MAXVERTICESPERCLUSTER); }
    /** Unsafe version of {@link #maxTrianglesPerCluster}. */
    public static int nmaxTrianglesPerCluster(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.MAXTRIANGLESPERCLUSTER); }
    /** Unsafe version of {@link #clusterScratchByteAlignment}. */
    public static int nclusterScratchByteAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.CLUSTERSCRATCHBYTEALIGNMENT); }
    /** Unsafe version of {@link #clusterByteAlignment}. */
    public static int nclusterByteAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.CLUSTERBYTEALIGNMENT); }
    /** Unsafe version of {@link #clusterTemplateByteAlignment}. */
    public static int nclusterTemplateByteAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.CLUSTERTEMPLATEBYTEALIGNMENT); }
    /** Unsafe version of {@link #clusterBottomLevelByteAlignment}. */
    public static int nclusterBottomLevelByteAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.CLUSTERBOTTOMLEVELBYTEALIGNMENT); }
    /** Unsafe version of {@link #clusterTemplateBoundsByteAlignment}. */
    public static int nclusterTemplateBoundsByteAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.CLUSTERTEMPLATEBOUNDSBYTEALIGNMENT); }
    /** Unsafe version of {@link #maxClusterGeometryIndex}. */
    public static int nmaxClusterGeometryIndex(long struct) { return memGetInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.MAXCLUSTERGEOMETRYINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceClusterAccelerationStructurePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.npNext(address()); }
        /** @return the value of the {@code maxVerticesPerCluster} field. */
        @NativeType("uint32_t")
        public int maxVerticesPerCluster() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nmaxVerticesPerCluster(address()); }
        /** @return the value of the {@code maxTrianglesPerCluster} field. */
        @NativeType("uint32_t")
        public int maxTrianglesPerCluster() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nmaxTrianglesPerCluster(address()); }
        /** @return the value of the {@code clusterScratchByteAlignment} field. */
        @NativeType("uint32_t")
        public int clusterScratchByteAlignment() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterScratchByteAlignment(address()); }
        /** @return the value of the {@code clusterByteAlignment} field. */
        @NativeType("uint32_t")
        public int clusterByteAlignment() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterByteAlignment(address()); }
        /** @return the value of the {@code clusterTemplateByteAlignment} field. */
        @NativeType("uint32_t")
        public int clusterTemplateByteAlignment() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterTemplateByteAlignment(address()); }
        /** @return the value of the {@code clusterBottomLevelByteAlignment} field. */
        @NativeType("uint32_t")
        public int clusterBottomLevelByteAlignment() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterBottomLevelByteAlignment(address()); }
        /** @return the value of the {@code clusterTemplateBoundsByteAlignment} field. */
        @NativeType("uint32_t")
        public int clusterTemplateBoundsByteAlignment() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterTemplateBoundsByteAlignment(address()); }
        /** @return the value of the {@code maxClusterGeometryIndex} field. */
        @NativeType("uint32_t")
        public int maxClusterGeometryIndex() { return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nmaxClusterGeometryIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.npNext(address(), value); return this; }

    }

}