/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Properties of the physical device for ray tracing.
 * 
 * <h5>Description</h5>
 * 
 * <p>Due to the fact that the geometry, instance, and triangle counts are specified at acceleration structure creation as 32-bit values, {@code maxGeometryCount}, {@code maxInstanceCount}, and {@code maxTriangleCount} <b>must</b> not exceed <code>2<sup>32</sup>-1</code>.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>Limits specified by this structure <b>must</b> match those specified with the same name in {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR} and {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #shaderGroupHandleSize};
 *     uint32_t {@link #maxRecursionDepth};
 *     uint32_t {@link #maxShaderGroupStride};
 *     uint32_t {@link #shaderGroupBaseAlignment};
 *     uint64_t {@link #maxGeometryCount};
 *     uint64_t {@link #maxInstanceCount};
 *     uint64_t {@link #maxTriangleCount};
 *     uint32_t {@link #maxDescriptorSetAccelerationStructures};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingPropertiesNV extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the size in bytes of the shader header. */
    @NativeType("uint32_t")
    public int shaderGroupHandleSize() { return nshaderGroupHandleSize(address()); }
    /** the maximum number of levels of recursion allowed in a trace command. */
    @NativeType("uint32_t")
    public int maxRecursionDepth() { return nmaxRecursionDepth(address()); }
    /** the maximum stride in bytes allowed between shader groups in the shader binding table. */
    @NativeType("uint32_t")
    public int maxShaderGroupStride() { return nmaxShaderGroupStride(address()); }
    /** the <b>required</b> alignment in bytes for the base of the shader binding table. */
    @NativeType("uint32_t")
    public int shaderGroupBaseAlignment() { return nshaderGroupBaseAlignment(address()); }
    /** the maximum number of geometries in the bottom level acceleration structure. */
    @NativeType("uint64_t")
    public long maxGeometryCount() { return nmaxGeometryCount(address()); }
    /** the maximum number of instances in the top level acceleration structure. */
    @NativeType("uint64_t")
    public long maxInstanceCount() { return nmaxInstanceCount(address()); }
    /** the maximum number of triangles in all geometries in the bottom level acceleration structure. */
    @NativeType("uint64_t")
    public long maxTriangleCount() { return nmaxTriangleCount(address()); }
    /** the maximum number of acceleration structure descriptors that are allowed in a descriptor set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetAccelerationStructures() { return nmaxDescriptorSetAccelerationStructures(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPropertiesNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
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
        return wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPropertiesNV calloc() {
        return wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRayTracingPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #shaderGroupHandleSize}. */
    public static int nshaderGroupHandleSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.SHADERGROUPHANDLESIZE); }
    /** Unsafe version of {@link #maxRecursionDepth}. */
    public static int nmaxRecursionDepth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXRECURSIONDEPTH); }
    /** Unsafe version of {@link #maxShaderGroupStride}. */
    public static int nmaxShaderGroupStride(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXSHADERGROUPSTRIDE); }
    /** Unsafe version of {@link #shaderGroupBaseAlignment}. */
    public static int nshaderGroupBaseAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.SHADERGROUPBASEALIGNMENT); }
    /** Unsafe version of {@link #maxGeometryCount}. */
    public static long nmaxGeometryCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXGEOMETRYCOUNT); }
    /** Unsafe version of {@link #maxInstanceCount}. */
    public static long nmaxInstanceCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXINSTANCECOUNT); }
    /** Unsafe version of {@link #maxTriangleCount}. */
    public static long nmaxTriangleCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXTRIANGLECOUNT); }
    /** Unsafe version of {@link #maxDescriptorSetAccelerationStructures}. */
    public static int nmaxDescriptorSetAccelerationStructures(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.MAXDESCRIPTORSETACCELERATIONSTRUCTURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRayTracingPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#shaderGroupHandleSize} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleSize() { return VkPhysicalDeviceRayTracingPropertiesNV.nshaderGroupHandleSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#maxRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRecursionDepth() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxRecursionDepth(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#maxShaderGroupStride} field. */
        @NativeType("uint32_t")
        public int maxShaderGroupStride() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxShaderGroupStride(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#shaderGroupBaseAlignment} field. */
        @NativeType("uint32_t")
        public int shaderGroupBaseAlignment() { return VkPhysicalDeviceRayTracingPropertiesNV.nshaderGroupBaseAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#maxGeometryCount} field. */
        @NativeType("uint64_t")
        public long maxGeometryCount() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxGeometryCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#maxInstanceCount} field. */
        @NativeType("uint64_t")
        public long maxInstanceCount() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxInstanceCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#maxTriangleCount} field. */
        @NativeType("uint64_t")
        public long maxTriangleCount() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxTriangleCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPropertiesNV#maxDescriptorSetAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetAccelerationStructures() { return VkPhysicalDeviceRayTracingPropertiesNV.nmaxDescriptorSetAccelerationStructures(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPropertiesNV#sType} field. */
        public VkPhysicalDeviceRayTracingPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV} value to the {@link VkPhysicalDeviceRayTracingPropertiesNV#sType} field. */
        public VkPhysicalDeviceRayTracingPropertiesNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPropertiesNV#pNext} field. */
        public VkPhysicalDeviceRayTracingPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPropertiesNV.npNext(address(), value); return this; }

    }

}