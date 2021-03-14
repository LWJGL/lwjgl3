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
 * <p>If the {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <p>Limits specified by this structure <b>must</b> match those specified with the same name in {@link VkPhysicalDeviceRayTracingPropertiesNV}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code maxGeometryCount} &ndash; the maximum number of geometries in the bottom level acceleration structure.</li>
 * <li>{@code maxInstanceCount} &ndash; the maximum number of instances in the top level acceleration structure.</li>
 * <li>{@code maxPrimitiveCount} &ndash; the maximum number of triangles or AABBs in all geometries in the bottom level acceleration structure.</li>
 * <li>{@code maxPerStageDescriptorAccelerationStructures} &ndash; the maximum number of acceleration structure bindings that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptor bindings with a descriptor type of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit.</li>
 * <li>{@code maxPerStageDescriptorUpdateAfterBindAccelerationStructures} &ndash; similar to {@code maxPerStageDescriptorAccelerationStructures} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code maxDescriptorSetAccelerationStructures} &ndash; the maximum number of acceleration structure descriptors that <b>can</b> be included in descriptor bindings in a pipeline layout across all pipeline shader stages and descriptor set numbers. Descriptor bindings with a descriptor type of {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} count against this limit. Only descriptor bindings in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit.</li>
 * <li>{@code maxDescriptorSetUpdateAfterBindAccelerationStructures} &ndash; similar to {@code maxDescriptorSetAccelerationStructures} but counts descriptor bindings from descriptor sets created with or without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set.</li>
 * <li>{@code minAccelerationStructureScratchOffsetAlignment} &ndash; the minimum required: alignment, in bytes, for scratch data passed in to an acceleration structure build command.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint64_t maxGeometryCount;
 *     uint64_t maxInstanceCount;
 *     uint64_t maxPrimitiveCount;
 *     uint32_t maxPerStageDescriptorAccelerationStructures;
 *     uint32_t maxPerStageDescriptorUpdateAfterBindAccelerationStructures;
 *     uint32_t maxDescriptorSetAccelerationStructures;
 *     uint32_t maxDescriptorSetUpdateAfterBindAccelerationStructures;
 *     uint32_t minAccelerationStructureScratchOffsetAlignment;
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxGeometryCount} field. */
    @NativeType("uint64_t")
    public long maxGeometryCount() { return nmaxGeometryCount(address()); }
    /** Returns the value of the {@code maxInstanceCount} field. */
    @NativeType("uint64_t")
    public long maxInstanceCount() { return nmaxInstanceCount(address()); }
    /** Returns the value of the {@code maxPrimitiveCount} field. */
    @NativeType("uint64_t")
    public long maxPrimitiveCount() { return nmaxPrimitiveCount(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorAccelerationStructures} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorAccelerationStructures() { return nmaxPerStageDescriptorAccelerationStructures(address()); }
    /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindAccelerationStructures} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(address()); }
    /** Returns the value of the {@code maxDescriptorSetAccelerationStructures} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetAccelerationStructures() { return nmaxDescriptorSetAccelerationStructures(address()); }
    /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindAccelerationStructures} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return nmaxDescriptorSetUpdateAfterBindAccelerationStructures(address()); }
    /** Returns the value of the {@code minAccelerationStructureScratchOffsetAlignment} field. */
    @NativeType("uint32_t")
    public int minAccelerationStructureScratchOffsetAlignment() { return nminAccelerationStructureScratchOffsetAlignment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
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

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructurePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAccelerationStructurePropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code maxGeometryCount} field. */
        @NativeType("uint64_t")
        public long maxGeometryCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxGeometryCount(address()); }
        /** Returns the value of the {@code maxInstanceCount} field. */
        @NativeType("uint64_t")
        public long maxInstanceCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxInstanceCount(address()); }
        /** Returns the value of the {@code maxPrimitiveCount} field. */
        @NativeType("uint64_t")
        public long maxPrimitiveCount() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPrimitiveCount(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPerStageDescriptorAccelerationStructures(address()); }
        /** Returns the value of the {@code maxPerStageDescriptorUpdateAfterBindAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(address()); }
        /** Returns the value of the {@code maxDescriptorSetAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxDescriptorSetAccelerationStructures(address()); }
        /** Returns the value of the {@code maxDescriptorSetUpdateAfterBindAccelerationStructures} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindAccelerationStructures() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxDescriptorSetUpdateAfterBindAccelerationStructures(address()); }
        /** Returns the value of the {@code minAccelerationStructureScratchOffsetAlignment} field. */
        @NativeType("uint32_t")
        public int minAccelerationStructureScratchOffsetAlignment() { return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nminAccelerationStructureScratchOffsetAlignment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAccelerationStructurePropertiesKHR.npNext(address(), value); return this; }

    }

}