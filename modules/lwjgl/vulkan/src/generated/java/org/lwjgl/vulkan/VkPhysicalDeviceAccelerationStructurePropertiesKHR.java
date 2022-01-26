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
 * Properties of the physical device for acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>Due to the fact that the geometry, instance, and primitive counts are specified at acceleration structure creation as 32-bit values, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxGeometryCount">{@code maxGeometryCount}</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxInstanceCount">{@code maxInstanceCount}</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxPrimitiveCount">{@code maxPrimitiveCount}</a> <b>must</b> not exceed <code>2<sup>32</sup>-1</code>.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>Limits specified by this structure <b>must</b> match those specified with the same name in {@link VkPhysicalDeviceRayTracingPropertiesNV}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint64_t {@link #maxGeometryCount};
 *     uint64_t {@link #maxInstanceCount};
 *     uint64_t {@link #maxPrimitiveCount};
 *     uint32_t {@link #maxPerStageDescriptorAccelerationStructures};
 *     uint32_t {@link #maxPerStageDescriptorUpdateAfterBindAccelerationStructures};
 *     uint32_t {@link #maxDescriptorSetAccelerationStructures};
 *     uint32_t {@link #maxDescriptorSetUpdateAfterBindAccelerationStructures};
 *     uint32_t {@link #minAccelerationStructureScratchOffsetAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceAccelerationStructurePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXGEOMETRYCOUNT,
        MAXINSTANCECOUNT,
        MAXPRIMITIVECOUNT,
        MAXPERSTAGEDESCRIPTORACCELERATIONSTRUCTURES,
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDACCELERATIONSTRUCTURES,
        MAXDESCRIPTORSETACCELERATIONSTRUCTURES,
        MAXDESCRIPTORSETUPDATEAFTERBINDACCELERATIONSTRUCTURES,
        MINACCELERATIONSTRUCTURESCRATCHOFFSETALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
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
        MAXGEOMETRYCOUNT = layout.offsetof(2);
        MAXINSTANCECOUNT = layout.offsetof(3);
        MAXPRIMITIVECOUNT = layout.offsetof(4);
        MAXPERSTAGEDESCRIPTORACCELERATIONSTRUCTURES = layout.offsetof(5);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDACCELERATIONSTRUCTURES = layout.offsetof(6);
        MAXDESCRIPTORSETACCELERATIONSTRUCTURES = layout.offsetof(7);
        MAXDESCRIPTORSETUPDATEAFTERBINDACCELERATIONSTRUCTURES = layout.offsetof(8);
        MINACCELERATIONSTRUCTURESCRATCHOFFSETALIGNMENT = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR(ByteBuffer container) {
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
    /** the maximum number of geometries in the bottom level acceleration structure. */
    @NativeType("uint64_t")
    public long maxGeometryCount() { return nmaxGeometryCount(address()); }
    /** the maximum number of instances in the top level acceleration structure. */
    @NativeType("uint64_t")
    public long maxInstanceCount() { return nmaxInstanceCount(address()); }
    /** the maximum number of triangles or AABBs in all geometries in the bottom level acceleration structure. */
    @NativeType("uint64_t")
    public long maxPrimitiveCount() { return nmaxPrimitiveCount(address()); }
    /** the maximum number of acceleration structure bindings that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptor bindings with a descriptor type of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorAccelerationStructures() { return nmaxPerStageDescriptorAccelerationStructures(address()); }
    /** similar to {@code maxPerStageDescriptorAccelerationStructures} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(address()); }
    /** the maximum number of acceleration structure descriptors that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. */
    @NativeType("uint32_t")
    public int maxDescriptorSetAccelerationStructures() { return nmaxDescriptorSetAccelerationStructures(address()); }
    /** similar to {@code maxDescriptorSetAccelerationStructures} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return nmaxDescriptorSetUpdateAfterBindAccelerationStructures(address()); }
    /** the minimum <b>required</b> alignment, in bytes, for scratch data passed in to an acceleration structure build command. The value <b>must</b> be a power of two. */
    @NativeType("uint32_t")
    public int minAccelerationStructureScratchOffsetAlignment() { return nminAccelerationStructureScratchOffsetAlignment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR set(
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
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR set(VkPhysicalDeviceAccelerationStructurePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR malloc() {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR calloc() {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxGeometryCount}. */
    public static long nmaxGeometryCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXGEOMETRYCOUNT); }
    /** Unsafe version of {@link #maxInstanceCount}. */
    public static long nmaxInstanceCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXINSTANCECOUNT); }
    /** Unsafe version of {@link #maxPrimitiveCount}. */
    public static long nmaxPrimitiveCount(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXPRIMITIVECOUNT); }
    /** Unsafe version of {@link #maxPerStageDescriptorAccelerationStructures}. */
    public static int nmaxPerStageDescriptorAccelerationStructures(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXPERSTAGEDESCRIPTORACCELERATIONSTRUCTURES); }
    /** Unsafe version of {@link #maxPerStageDescriptorUpdateAfterBindAccelerationStructures}. */
    public static int nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDACCELERATIONSTRUCTURES); }
    /** Unsafe version of {@link #maxDescriptorSetAccelerationStructures}. */
    public static int nmaxDescriptorSetAccelerationStructures(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXDESCRIPTORSETACCELERATIONSTRUCTURES); }
    /** Unsafe version of {@link #maxDescriptorSetUpdateAfterBindAccelerationStructures}. */
    public static int nmaxDescriptorSetUpdateAfterBindAccelerationStructures(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MAXDESCRIPTORSETUPDATEAFTERBINDACCELERATIONSTRUCTURES); }
    /** Unsafe version of {@link #minAccelerationStructureScratchOffsetAlignment}. */
    public static int nminAccelerationStructureScratchOffsetAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.MINACCELERATIONSTRUCTURESCRATCHOFFSETALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAccelerationStructurePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAccelerationStructurePropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAccelerationStructurePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceAccelerationStructurePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceAccelerationStructurePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxGeometryCount} field. */
        @NativeType("uint64_t")
        public long maxGeometryCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxGeometryCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxInstanceCount} field. */
        @NativeType("uint64_t")
        public long maxInstanceCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxInstanceCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxPrimitiveCount} field. */
        @NativeType("uint64_t")
        public long maxPrimitiveCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPrimitiveCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxPerStageDescriptorAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPerStageDescriptorAccelerationStructures(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxPerStageDescriptorUpdateAfterBindAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxDescriptorSetAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxDescriptorSetAccelerationStructures(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#maxDescriptorSetUpdateAfterBindAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxDescriptorSetUpdateAfterBindAccelerationStructures(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#minAccelerationStructureScratchOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minAccelerationStructureScratchOffsetAlignment() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nminAccelerationStructureScratchOffsetAlignment(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#sType} field. */
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#sType} field. */
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#pNext} field. */
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.npNext(address(), value); return this; }

    }

}