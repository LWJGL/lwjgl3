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
 * struct VkPhysicalDeviceRayTracingPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t shaderGroupHandleSize;
 *     uint32_t maxRecursionDepth;
 *     uint32_t maxShaderGroupStride;
 *     uint32_t shaderGroupBaseAlignment;
 *     uint64_t maxGeometryCount;
 *     uint64_t maxInstanceCount;
 *     uint64_t maxTriangleCount;
 *     uint32_t maxDescriptorSetAccelerationStructures;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingPropertiesNV extends Struct<VkPhysicalDeviceRayTracingPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERGROUPHANDLESIZE,
        MAXRECURSIONDEPTH,
        MAXSHADERGROUPSTRIDE,
        SHADERGROUPBASEALIGNMENT,
        MAXGEOMETRYCOUNT,
        MAXINSTANCECOUNT,
        MAXTRIANGLECOUNT,
        MAXDESCRIPTORSETACCELERATIONSTRUCTURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERGROUPHANDLESIZE = layout.offsetof(2);
        MAXRECURSIONDEPTH = layout.offsetof(3);
        MAXSHADERGROUPSTRIDE = layout.offsetof(4);
        SHADERGROUPBASEALIGNMENT = layout.offsetof(5);
        MAXGEOMETRYCOUNT = layout.offsetof(6);
        MAXINSTANCECOUNT = layout.offsetof(7);
        MAXTRIANGLECOUNT = layout.offsetof(8);
        MAXDESCRIPTORSETACCELERATIONSTRUCTURES = layout.offsetof(9);
    }

    protected VkPhysicalDeviceRayTracingPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code shaderGroupHandleSize} field. */
    @NativeType("uint32_t")
    public int shaderGroupHandleSize() { return nshaderGroupHandleSize(address()); }
    /** @return the value of the {@code maxRecursionDepth} field. */
    @NativeType("uint32_t")
    public int maxRecursionDepth() { return nmaxRecursionDepth(address()); }
    /** @return the value of the {@code maxShaderGroupStride} field. */
    @NativeType("uint32_t")
    public int maxShaderGroupStride() { return nmaxShaderGroupStride(address()); }
    /** @return the value of the {@code shaderGroupBaseAlignment} field. */
    @NativeType("uint32_t")
    public int shaderGroupBaseAlignment() { return nshaderGroupBaseAlignment(address()); }
    /** @return the value of the {@code maxGeometryCount} field. */
    @NativeType("uint64_t")
    public long maxGeometryCount() { return nmaxGeometryCount(address()); }
    /** @return the value of the {@code maxInstanceCount} field. */
    @NativeType("uint64_t")
    public long maxInstanceCount() { return nmaxInstanceCount(address()); }
    /** @return the value of the {@code maxTriangleCount} field. */
    @NativeType("uint64_t")
    public long maxTriangleCount() { return nmaxTriangleCount(address()); }
    /** @return the value of the {@code maxDescriptorSetAccelerationStructures} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetAccelerationStructures() { return nmaxDescriptorSetAccelerationStructures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingPropertiesNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingPropertiesNV set(
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
    public VkPhysicalDeviceRayTracingPropertiesNV set(VkPhysicalDeviceRayTracingPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPropertiesNV malloc() {
        return new VkPhysicalDeviceRayTracingPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPropertiesNV calloc() {
        return new VkPhysicalDeviceRayTracingPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPropertiesNV create(long address) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #shaderGroupHandleSize}. */
    public static int nshaderGroupHandleSize(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.SHADERGROUPHANDLESIZE); }
    /** Unsafe version of {@link #maxRecursionDepth}. */
    public static int nmaxRecursionDepth(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXRECURSIONDEPTH); }
    /** Unsafe version of {@link #maxShaderGroupStride}. */
    public static int nmaxShaderGroupStride(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXSHADERGROUPSTRIDE); }
    /** Unsafe version of {@link #shaderGroupBaseAlignment}. */
    public static int nshaderGroupBaseAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.SHADERGROUPBASEALIGNMENT); }
    /** Unsafe version of {@link #maxGeometryCount}. */
    public static long nmaxGeometryCount(long struct) { return memGetLong(struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXGEOMETRYCOUNT); }
    /** Unsafe version of {@link #maxInstanceCount}. */
    public static long nmaxInstanceCount(long struct) { return memGetLong(struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXINSTANCECOUNT); }
    /** Unsafe version of {@link #maxTriangleCount}. */
    public static long nmaxTriangleCount(long struct) { return memGetLong(struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXTRIANGLECOUNT); }
    /** Unsafe version of {@link #maxDescriptorSetAccelerationStructures}. */
    public static int nmaxDescriptorSetAccelerationStructures(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXDESCRIPTORSETACCELERATIONSTRUCTURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPropertiesNV.npNext(address()); }
        /** @return the value of the {@code shaderGroupHandleSize} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleSize() { return VkPhysicalDeviceRayTracingPropertiesNV.nshaderGroupHandleSize(address()); }
        /** @return the value of the {@code maxRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRecursionDepth() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxRecursionDepth(address()); }
        /** @return the value of the {@code maxShaderGroupStride} field. */
        @NativeType("uint32_t")
        public int maxShaderGroupStride() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxShaderGroupStride(address()); }
        /** @return the value of the {@code shaderGroupBaseAlignment} field. */
        @NativeType("uint32_t")
        public int shaderGroupBaseAlignment() { return VkPhysicalDeviceRayTracingPropertiesNV.nshaderGroupBaseAlignment(address()); }
        /** @return the value of the {@code maxGeometryCount} field. */
        @NativeType("uint64_t")
        public long maxGeometryCount() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxGeometryCount(address()); }
        /** @return the value of the {@code maxInstanceCount} field. */
        @NativeType("uint64_t")
        public long maxInstanceCount() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxInstanceCount(address()); }
        /** @return the value of the {@code maxTriangleCount} field. */
        @NativeType("uint64_t")
        public long maxTriangleCount() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxTriangleCount(address()); }
        /** @return the value of the {@code maxDescriptorSetAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetAccelerationStructures() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxDescriptorSetAccelerationStructures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingPropertiesNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPropertiesNV.npNext(address(), value); return this; }

    }

}