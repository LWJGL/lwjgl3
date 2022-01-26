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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying physical device properties for functionality promoted to Vulkan 1.1.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVulkan11Properties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These properties correspond to Vulkan 1.1 functionality.</p>
 * 
 * <p>The members of {@link VkPhysicalDeviceVulkan11Properties} have the same values as the corresponding members of {@link VkPhysicalDeviceIDProperties}, {@link VkPhysicalDeviceSubgroupProperties}, {@link VkPhysicalDevicePointClippingProperties}, {@link VkPhysicalDeviceMultiviewProperties}, {@link VkPhysicalDeviceProtectedMemoryProperties}, and {@link VkPhysicalDeviceMaintenance3Properties}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkan11Properties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint8_t {@link #deviceUUID}[VK_UUID_SIZE];
 *     uint8_t {@link #driverUUID}[VK_UUID_SIZE];
 *     uint8_t {@link #deviceLUID}[VK_LUID_SIZE];
 *     uint32_t {@link #deviceNodeMask};
 *     VkBool32 {@link #deviceLUIDValid};
 *     uint32_t {@link #subgroupSize};
 *     VkShaderStageFlags {@link #subgroupSupportedStages};
 *     VkSubgroupFeatureFlags {@link #subgroupSupportedOperations};
 *     VkBool32 {@link #subgroupQuadOperationsInAllStages};
 *     VkPointClippingBehavior {@link #pointClippingBehavior};
 *     uint32_t {@link #maxMultiviewViewCount};
 *     uint32_t {@link #maxMultiviewInstanceIndex};
 *     VkBool32 {@link #protectedNoFault};
 *     uint32_t {@link #maxPerSetDescriptors};
 *     VkDeviceSize {@link #maxMemoryAllocationSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkan11Properties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEUUID,
        DRIVERUUID,
        DEVICELUID,
        DEVICENODEMASK,
        DEVICELUIDVALID,
        SUBGROUPSIZE,
        SUBGROUPSUPPORTEDSTAGES,
        SUBGROUPSUPPORTEDOPERATIONS,
        SUBGROUPQUADOPERATIONSINALLSTAGES,
        POINTCLIPPINGBEHAVIOR,
        MAXMULTIVIEWVIEWCOUNT,
        MAXMULTIVIEWINSTANCEINDEX,
        PROTECTEDNOFAULT,
        MAXPERSETDESCRIPTORS,
        MAXMEMORYALLOCATIONSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_LUID_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
        SUBGROUPSIZE = layout.offsetof(7);
        SUBGROUPSUPPORTEDSTAGES = layout.offsetof(8);
        SUBGROUPSUPPORTEDOPERATIONS = layout.offsetof(9);
        SUBGROUPQUADOPERATIONSINALLSTAGES = layout.offsetof(10);
        POINTCLIPPINGBEHAVIOR = layout.offsetof(11);
        MAXMULTIVIEWVIEWCOUNT = layout.offsetof(12);
        MAXMULTIVIEWINSTANCEINDEX = layout.offsetof(13);
        PROTECTEDNOFAULT = layout.offsetof(14);
        MAXPERSETDESCRIPTORS = layout.offsetof(15);
        MAXMEMORYALLOCATIONSIZE = layout.offsetof(16);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan11Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan11Properties(ByteBuffer container) {
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
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the device. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() { return ndeviceUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the device. */
    @NativeType("uint8_t")
    public byte deviceUUID(int index) { return ndeviceUUID(address(), index); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the driver build in use by the device. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() { return ndriverUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the driver build in use by the device. */
    @NativeType("uint8_t")
    public byte driverUUID(int index) { return ndriverUUID(address(), index); }
    /** an array of {@link VK10#VK_LUID_SIZE LUID_SIZE} {@code uint8_t} values representing a locally unique identifier for the device. */
    @NativeType("uint8_t[VK_LUID_SIZE]")
    public ByteBuffer deviceLUID() { return ndeviceLUID(address()); }
    /** an array of {@link VK10#VK_LUID_SIZE LUID_SIZE} {@code uint8_t} values representing a locally unique identifier for the device. */
    @NativeType("uint8_t")
    public byte deviceLUID(int index) { return ndeviceLUID(address(), index); }
    /** a {@code uint32_t} bitfield identifying the node within a linked device adapter corresponding to the device. */
    @NativeType("uint32_t")
    public int deviceNodeMask() { return ndeviceNodeMask(address()); }
    /** a boolean value that will be {@link VK10#VK_TRUE TRUE} if {@code deviceLUID} contains a valid LUID and {@code deviceNodeMask} contains a valid node mask, and {@link VK10#VK_FALSE FALSE} if they do not. */
    @NativeType("VkBool32")
    public boolean deviceLUIDValid() { return ndeviceLUIDValid(address()) != 0; }
    /** the default number of invocations in each subgroup. {@code subgroupSize} is at least 1 if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code subgroupSize} is a power-of-two. */
    @NativeType("uint32_t")
    public int subgroupSize() { return nsubgroupSize(address()); }
    /** a bitfield of {@code VkShaderStageFlagBits} describing the shader stages that <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-group-operations">group operations</a> with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-subgroup">subgroup scope</a> are supported in. {@code subgroupSupportedStages} will have the {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} bit set if any of the physical device’s queues support {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. */
    @NativeType("VkShaderStageFlags")
    public int subgroupSupportedStages() { return nsubgroupSupportedStages(address()); }
    /** a bitmask of {@code VkSubgroupFeatureFlagBits} specifying the sets of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-group-operations">group operations</a> with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-subgroup">subgroup scope</a> supported on this device. {@code subgroupSupportedOperations} will have the {@link VK11#VK_SUBGROUP_FEATURE_BASIC_BIT SUBGROUP_FEATURE_BASIC_BIT} bit set if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. */
    @NativeType("VkSubgroupFeatureFlags")
    public int subgroupSupportedOperations() { return nsubgroupSupportedOperations(address()); }
    /** a boolean specifying whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-quad-operations">quad group operations</a> are available in all stages, or are restricted to fragment and compute stages. */
    @NativeType("VkBool32")
    public boolean subgroupQuadOperationsInAllStages() { return nsubgroupQuadOperationsInAllStages(address()) != 0; }
    /** a {@code VkPointClippingBehavior} value specifying the point clipping behavior supported by the implementation. */
    @NativeType("VkPointClippingBehavior")
    public int pointClippingBehavior() { return npointClippingBehavior(address()); }
    /** one greater than the maximum view index that <b>can</b> be used in a subpass. */
    @NativeType("uint32_t")
    public int maxMultiviewViewCount() { return nmaxMultiviewViewCount(address()); }
    /** the maximum valid value of instance index allowed to be generated by a drawing command recorded within a subpass of a multiview render pass instance. */
    @NativeType("uint32_t")
    public int maxMultiviewInstanceIndex() { return nmaxMultiviewInstanceIndex(address()); }
    /** specifies how an implementation behaves when an application attempts to write to unprotected memory in a protected queue operation, read from protected memory in an unprotected queue operation, or perform a query in a protected queue operation. If this limit is {@link VK10#VK_TRUE TRUE}, such writes will be discarded or have undefined values written, reads and queries will return undefined values. If this limit is {@link VK10#VK_FALSE FALSE}, applications <b>must</b> not perform these operations. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-protected-access-rules">memory-protected-access-rules</a> for more information. */
    @NativeType("VkBool32")
    public boolean protectedNoFault() { return nprotectedNoFault(address()) != 0; }
    /** a maximum number of descriptors (summed over all descriptor types) in a single descriptor set that is guaranteed to satisfy any implementation-dependent constraints on the size of a descriptor set itself. Applications <b>can</b> query whether a descriptor set that goes beyond this limit is supported using {@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}. */
    @NativeType("uint32_t")
    public int maxPerSetDescriptors() { return nmaxPerSetDescriptors(address()); }
    /** the maximum size of a memory allocation that <b>can</b> be created, even if there is more space available in the heap. */
    @NativeType("VkDeviceSize")
    public long maxMemoryAllocationSize() { return nmaxMemoryAllocationSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan11Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceVulkan11Properties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVulkan11Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan11Properties set(
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
    public VkPhysicalDeviceVulkan11Properties set(VkPhysicalDeviceVulkan11Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Properties malloc() {
        return wrap(VkPhysicalDeviceVulkan11Properties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan11Properties calloc() {
        return wrap(VkPhysicalDeviceVulkan11Properties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan11Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVulkan11Properties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan11Properties create(long address) {
        return wrap(VkPhysicalDeviceVulkan11Properties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan11Properties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVulkan11Properties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVulkan11Properties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Properties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan11Properties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan11Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan11Properties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVulkan11Properties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan11Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan11Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan11Properties.PNEXT); }
    /** Unsafe version of {@link #deviceUUID}. */
    public static ByteBuffer ndeviceUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan11Properties.DEVICEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #deviceUUID(int) deviceUUID}. */
    public static byte ndeviceUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceVulkan11Properties.DEVICEUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #driverUUID}. */
    public static ByteBuffer ndriverUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan11Properties.DRIVERUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #driverUUID(int) driverUUID}. */
    public static byte ndriverUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceVulkan11Properties.DRIVERUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceLUID}. */
    public static ByteBuffer ndeviceLUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan11Properties.DEVICELUID, VK_LUID_SIZE); }
    /** Unsafe version of {@link #deviceLUID(int) deviceLUID}. */
    public static byte ndeviceLUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceVulkan11Properties.DEVICELUID + check(index, VK_LUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceNodeMask}. */
    public static int ndeviceNodeMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.DEVICENODEMASK); }
    /** Unsafe version of {@link #deviceLUIDValid}. */
    public static int ndeviceLUIDValid(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.DEVICELUIDVALID); }
    /** Unsafe version of {@link #subgroupSize}. */
    public static int nsubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPSIZE); }
    /** Unsafe version of {@link #subgroupSupportedStages}. */
    public static int nsubgroupSupportedStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPSUPPORTEDSTAGES); }
    /** Unsafe version of {@link #subgroupSupportedOperations}. */
    public static int nsubgroupSupportedOperations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPSUPPORTEDOPERATIONS); }
    /** Unsafe version of {@link #subgroupQuadOperationsInAllStages}. */
    public static int nsubgroupQuadOperationsInAllStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.SUBGROUPQUADOPERATIONSINALLSTAGES); }
    /** Unsafe version of {@link #pointClippingBehavior}. */
    public static int npointClippingBehavior(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.POINTCLIPPINGBEHAVIOR); }
    /** Unsafe version of {@link #maxMultiviewViewCount}. */
    public static int nmaxMultiviewViewCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.MAXMULTIVIEWVIEWCOUNT); }
    /** Unsafe version of {@link #maxMultiviewInstanceIndex}. */
    public static int nmaxMultiviewInstanceIndex(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.MAXMULTIVIEWINSTANCEINDEX); }
    /** Unsafe version of {@link #protectedNoFault}. */
    public static int nprotectedNoFault(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.PROTECTEDNOFAULT); }
    /** Unsafe version of {@link #maxPerSetDescriptors}. */
    public static int nmaxPerSetDescriptors(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVulkan11Properties.MAXPERSETDESCRIPTORS); }
    /** Unsafe version of {@link #maxMemoryAllocationSize}. */
    public static long nmaxMemoryAllocationSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceVulkan11Properties.MAXMEMORYALLOCATIONSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVulkan11Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan11Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan11Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan11Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan11Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan11Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan11Properties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan11Properties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVulkan11Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan11Properties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan11Properties.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceVulkan11Properties#deviceUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() { return VkPhysicalDeviceVulkan11Properties.ndeviceUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceVulkan11Properties#deviceUUID} field. */
        @NativeType("uint8_t")
        public byte deviceUUID(int index) { return VkPhysicalDeviceVulkan11Properties.ndeviceUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceVulkan11Properties#driverUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() { return VkPhysicalDeviceVulkan11Properties.ndriverUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceVulkan11Properties#driverUUID} field. */
        @NativeType("uint8_t")
        public byte driverUUID(int index) { return VkPhysicalDeviceVulkan11Properties.ndriverUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceVulkan11Properties#deviceLUID} field. */
        @NativeType("uint8_t[VK_LUID_SIZE]")
        public ByteBuffer deviceLUID() { return VkPhysicalDeviceVulkan11Properties.ndeviceLUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceVulkan11Properties#deviceLUID} field. */
        @NativeType("uint8_t")
        public byte deviceLUID(int index) { return VkPhysicalDeviceVulkan11Properties.ndeviceLUID(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#deviceNodeMask} field. */
        @NativeType("uint32_t")
        public int deviceNodeMask() { return VkPhysicalDeviceVulkan11Properties.ndeviceNodeMask(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#deviceLUIDValid} field. */
        @NativeType("VkBool32")
        public boolean deviceLUIDValid() { return VkPhysicalDeviceVulkan11Properties.ndeviceLUIDValid(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#subgroupSize} field. */
        @NativeType("uint32_t")
        public int subgroupSize() { return VkPhysicalDeviceVulkan11Properties.nsubgroupSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#subgroupSupportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int subgroupSupportedStages() { return VkPhysicalDeviceVulkan11Properties.nsubgroupSupportedStages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#subgroupSupportedOperations} field. */
        @NativeType("VkSubgroupFeatureFlags")
        public int subgroupSupportedOperations() { return VkPhysicalDeviceVulkan11Properties.nsubgroupSupportedOperations(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#subgroupQuadOperationsInAllStages} field. */
        @NativeType("VkBool32")
        public boolean subgroupQuadOperationsInAllStages() { return VkPhysicalDeviceVulkan11Properties.nsubgroupQuadOperationsInAllStages(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#pointClippingBehavior} field. */
        @NativeType("VkPointClippingBehavior")
        public int pointClippingBehavior() { return VkPhysicalDeviceVulkan11Properties.npointClippingBehavior(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#maxMultiviewViewCount} field. */
        @NativeType("uint32_t")
        public int maxMultiviewViewCount() { return VkPhysicalDeviceVulkan11Properties.nmaxMultiviewViewCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#maxMultiviewInstanceIndex} field. */
        @NativeType("uint32_t")
        public int maxMultiviewInstanceIndex() { return VkPhysicalDeviceVulkan11Properties.nmaxMultiviewInstanceIndex(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#protectedNoFault} field. */
        @NativeType("VkBool32")
        public boolean protectedNoFault() { return VkPhysicalDeviceVulkan11Properties.nprotectedNoFault(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#maxPerSetDescriptors} field. */
        @NativeType("uint32_t")
        public int maxPerSetDescriptors() { return VkPhysicalDeviceVulkan11Properties.nmaxPerSetDescriptors(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVulkan11Properties#maxMemoryAllocationSize} field. */
        @NativeType("VkDeviceSize")
        public long maxMemoryAllocationSize() { return VkPhysicalDeviceVulkan11Properties.nmaxMemoryAllocationSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Properties#sType} field. */
        public VkPhysicalDeviceVulkan11Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan11Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES} value to the {@link VkPhysicalDeviceVulkan11Properties#sType} field. */
        public VkPhysicalDeviceVulkan11Properties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVulkan11Properties#pNext} field. */
        public VkPhysicalDeviceVulkan11Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan11Properties.npNext(address(), value); return this; }

    }

}