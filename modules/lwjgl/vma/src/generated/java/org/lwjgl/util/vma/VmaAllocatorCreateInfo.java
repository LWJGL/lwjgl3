/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Description of an Allocator to be created.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaAllocatorCreateInfo {
 *     VmaAllocatorCreateFlags {@link #flags};
 *     VkPhysicalDevice {@link #physicalDevice};
 *     VkDevice {@link #device};
 *     VkDeviceSize {@link #preferredLargeHeapBlockSize};
 *     {@link VkAllocationCallbacks VkAllocationCallbacks} const * {@link #pAllocationCallbacks};
 *     {@link VmaDeviceMemoryCallbacks VmaDeviceMemoryCallbacks} const * {@link #pDeviceMemoryCallbacks};
 *     VkDeviceSize const * {@link #pHeapSizeLimit};
 *     {@link VmaVulkanFunctions VmaVulkanFunctions} const * {@link #pVulkanFunctions};
 *     VkInstance {@link #instance};
 *     uint32_t {@link #vulkanApiVersion};
 *     VkExternalMemoryHandleTypeFlagsKHR const * {@link #pTypeExternalMemoryHandleTypes};
 * }</code></pre>
 */
public class VmaAllocatorCreateInfo extends Struct<VmaAllocatorCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PHYSICALDEVICE,
        DEVICE,
        PREFERREDLARGEHEAPBLOCKSIZE,
        PALLOCATIONCALLBACKS,
        PDEVICEMEMORYCALLBACKS,
        PHEAPSIZELIMIT,
        PVULKANFUNCTIONS,
        INSTANCE,
        VULKANAPIVERSION,
        PTYPEEXTERNALMEMORYHANDLETYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PHYSICALDEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
        PREFERREDLARGEHEAPBLOCKSIZE = layout.offsetof(3);
        PALLOCATIONCALLBACKS = layout.offsetof(4);
        PDEVICEMEMORYCALLBACKS = layout.offsetof(5);
        PHEAPSIZELIMIT = layout.offsetof(6);
        PVULKANFUNCTIONS = layout.offsetof(7);
        INSTANCE = layout.offsetof(8);
        VULKANAPIVERSION = layout.offsetof(9);
        PTYPEEXTERNALMEMORYHANDLETYPES = layout.offsetof(10);
    }

    protected VmaAllocatorCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaAllocatorCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VmaAllocatorCreateInfo(address, container);
    }

    /**
     * Creates a {@code VmaAllocatorCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocatorCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** flags for created allocator. Use {@code VmaAllocatorCreateFlagBits} enum. One of:<br><table><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT}</td></tr><tr><td>{@link Vma#VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT}</td></tr></table> */
    @NativeType("VmaAllocatorCreateFlags")
    public int flags() { return nflags(address()); }
    /** Vulkan physical device. It must be valid throughout whole lifetime of created allocator. */
    @NativeType("VkPhysicalDevice")
    public long physicalDevice() { return nphysicalDevice(address()); }
    /** Vulkan device. It must be valid throughout whole lifetime of created allocator. */
    @NativeType("VkDevice")
    public long device() { return ndevice(address()); }
    /**
     * preferred size of a single {@code VkDeviceMemory} block to be allocated from large heaps &gt; 1 GiB. Set to 0 to use default, which is currently 256
     * MiB. Optional.
     */
    @NativeType("VkDeviceSize")
    public long preferredLargeHeapBlockSize() { return npreferredLargeHeapBlockSize(address()); }
    /** custom CPU memory allocation callbacks. Optional, can be null. When specified, will also be used for all CPU-side memory allocations. Optional. */
    @NativeType("VkAllocationCallbacks const *")
    public @Nullable VkAllocationCallbacks pAllocationCallbacks() { return npAllocationCallbacks(address()); }
    /** informative callbacks for {@code vkAllocateMemory}, {@code vkFreeMemory}. Optional. */
    @NativeType("VmaDeviceMemoryCallbacks const *")
    public @Nullable VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() { return npDeviceMemoryCallbacks(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Either {@code NULL} or a pointer to an array of limits on maximum number of bytes that can be allocated out of particular Vulkan memory heap.
     *         
     *         <p>If not {@code NULL}, it must be a pointer to an array of {@code VkPhysicalDeviceMemoryProperties::memoryHeapCount} elements, defining limit on maximum number
     *         of bytes that can be allocated out of particular Vulkan memory heap.</p>
     *         
     *         <p>Any of the elements may be equal to {@code VK_WHOLE_SIZE}, which means no limit on that heap. This is also the default in case of
     *         {@code pHeapSizeLimit = NULL}.</p>
     *         
     *         <p>If there is a limit defined for a heap:</p>
     *         
     *         <ul>
     *         <li>If user tries to allocate more memory from that heap using this allocator, the allocation fails with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}.</li>
     *         <li>If the limit is smaller than heap size reported in {@code VkMemoryHeap::size}, the value of this limit will be reported instead when using
     *         {@link Vma#vmaGetMemoryProperties GetMemoryProperties}.</li>
     *         </ul>
     *         
     *         <p>Warning! Using this feature may not be equivalent to installing a GPU with smaller amount of memory, because graphics driver doesn't necessary fail new
     *         allocations with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} result when memory capacity is exceeded. It may return success and just silently migrate some
     *         device memory blocks to system RAM. This driver behavior can also be controlled using {@code VK_AMD_memory_overallocation_behavior} extension.</p>
     */
    @NativeType("VkDeviceSize const *")
    public @Nullable LongBuffer pHeapSizeLimit(int capacity) { return npHeapSizeLimit(address(), capacity); }
    /** pointers to Vulkan functions */
    @NativeType("VmaVulkanFunctions const *")
    public VmaVulkanFunctions pVulkanFunctions() { return npVulkanFunctions(address()); }
    /** handle to Vulkan instance object. */
    @NativeType("VkInstance")
    public long instance() { return ninstance(address()); }
    /**
     * Vulkan version that the application uses. (optional)
     * 
     * <p>It must be a value in the format as created by macro {@code VK_MAKE_VERSION} or a constant like: {@code VK_API_VERSION_1_1},
     * {@code VK_API_VERSION_1_0}. The patch version number specified is ignored. Only the major and minor versions are considered. Only versions 1.0, 1.1,
     * 1.2 and 1.3 are supported by the current implementation.</p>
     * 
     * <p>Leaving it initialized to zero is equivalent to {@code VK_API_VERSION_1_0}.</p>
     * 
     * <p>It must match the Vulkan version used by the application and supported on the selected physical device, so it must be no higher than
     * {@code VkApplicationInfo::apiVersion} passed to {@code vkCreateInstance} and no higher than {@code VkPhysicalDeviceProperties::apiVersion} found on the
     * physical device used.</p>
     */
    @NativeType("uint32_t")
    public int vulkanApiVersion() { return nvulkanApiVersion(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Either null or a pointer to an array of external memory handle types for each Vulkan memory type.
     *         
     *         <p>If not {@code NULL}, it must be a pointer to an array of {@code VkPhysicalDeviceMemoryProperties::memoryTypeCount} elements, defining external memory handle
     *         types of particular Vulkan memory type, to be passed using {@code VkExportMemoryAllocateInfoKHR}.</p>
     *         
     *         <p>Any of the elements may be equal to 0, which means not to use {@code VkExportMemoryAllocateInfoKHR} on this memory type. This is also the default in
     *         case of {@code pTypeExternalMemoryHandleTypes = NULL}.</p>
     */
    @NativeType("VkExternalMemoryHandleTypeFlagsKHR const *")
    public @Nullable IntBuffer pTypeExternalMemoryHandleTypes(int capacity) { return npTypeExternalMemoryHandleTypes(address(), capacity); }

    /** Sets the specified value to the {@link #flags} field. */
    public VmaAllocatorCreateInfo flags(@NativeType("VmaAllocatorCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #physicalDevice} field. */
    public VmaAllocatorCreateInfo physicalDevice(VkPhysicalDevice value) { nphysicalDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #device} field. */
    public VmaAllocatorCreateInfo device(VkDevice value) { ndevice(address(), value); return this; }
    /** Sets the specified value to the {@link #preferredLargeHeapBlockSize} field. */
    public VmaAllocatorCreateInfo preferredLargeHeapBlockSize(@NativeType("VkDeviceSize") long value) { npreferredLargeHeapBlockSize(address(), value); return this; }
    /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@link #pAllocationCallbacks} field. */
    public VmaAllocatorCreateInfo pAllocationCallbacks(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { npAllocationCallbacks(address(), value); return this; }
    /** Sets the address of the specified {@link VmaDeviceMemoryCallbacks} to the {@link #pDeviceMemoryCallbacks} field. */
    public VmaAllocatorCreateInfo pDeviceMemoryCallbacks(@Nullable @NativeType("VmaDeviceMemoryCallbacks const *") VmaDeviceMemoryCallbacks value) { npDeviceMemoryCallbacks(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pHeapSizeLimit} field. */
    public VmaAllocatorCreateInfo pHeapSizeLimit(@Nullable @NativeType("VkDeviceSize const *") LongBuffer value) { npHeapSizeLimit(address(), value); return this; }
    /** Sets the address of the specified {@link VmaVulkanFunctions} to the {@link #pVulkanFunctions} field. */
    public VmaAllocatorCreateInfo pVulkanFunctions(@NativeType("VmaVulkanFunctions const *") VmaVulkanFunctions value) { npVulkanFunctions(address(), value); return this; }
    /** Sets the specified value to the {@link #instance} field. */
    public VmaAllocatorCreateInfo instance(VkInstance value) { ninstance(address(), value); return this; }
    /** Sets the specified value to the {@link #vulkanApiVersion} field. */
    public VmaAllocatorCreateInfo vulkanApiVersion(@NativeType("uint32_t") int value) { nvulkanApiVersion(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pTypeExternalMemoryHandleTypes} field. */
    public VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypes(@Nullable @NativeType("VkExternalMemoryHandleTypeFlagsKHR const *") IntBuffer value) { npTypeExternalMemoryHandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaAllocatorCreateInfo set(
        int flags,
        VkPhysicalDevice physicalDevice,
        VkDevice device,
        long preferredLargeHeapBlockSize,
        @Nullable VkAllocationCallbacks pAllocationCallbacks,
        @Nullable VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks,
        @Nullable LongBuffer pHeapSizeLimit,
        VmaVulkanFunctions pVulkanFunctions,
        VkInstance instance,
        int vulkanApiVersion,
        @Nullable IntBuffer pTypeExternalMemoryHandleTypes
    ) {
        flags(flags);
        physicalDevice(physicalDevice);
        device(device);
        preferredLargeHeapBlockSize(preferredLargeHeapBlockSize);
        pAllocationCallbacks(pAllocationCallbacks);
        pDeviceMemoryCallbacks(pDeviceMemoryCallbacks);
        pHeapSizeLimit(pHeapSizeLimit);
        pVulkanFunctions(pVulkanFunctions);
        instance(instance);
        vulkanApiVersion(vulkanApiVersion);
        pTypeExternalMemoryHandleTypes(pTypeExternalMemoryHandleTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaAllocatorCreateInfo set(VmaAllocatorCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaAllocatorCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocatorCreateInfo malloc() {
        return new VmaAllocatorCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocatorCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocatorCreateInfo calloc() {
        return new VmaAllocatorCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocatorCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocatorCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocatorCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocatorCreateInfo} instance for the specified memory address. */
    public static VmaAllocatorCreateInfo create(long address) {
        return new VmaAllocatorCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaAllocatorCreateInfo createSafe(long address) {
        return address == NULL ? null : new VmaAllocatorCreateInfo(address, null);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocatorCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocatorCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocatorCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocatorCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code VmaAllocatorCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocatorCreateInfo malloc(MemoryStack stack) {
        return new VmaAllocatorCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaAllocatorCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocatorCreateInfo calloc(MemoryStack stack) {
        return new VmaAllocatorCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VmaAllocatorCreateInfo.FLAGS); }
    /** Unsafe version of {@link #physicalDevice}. */
    public static long nphysicalDevice(long struct) { return memGetAddress(struct + VmaAllocatorCreateInfo.PHYSICALDEVICE); }
    /** Unsafe version of {@link #device}. */
    public static long ndevice(long struct) { return memGetAddress(struct + VmaAllocatorCreateInfo.DEVICE); }
    /** Unsafe version of {@link #preferredLargeHeapBlockSize}. */
    public static long npreferredLargeHeapBlockSize(long struct) { return memGetLong(struct + VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE); }
    /** Unsafe version of {@link #pAllocationCallbacks}. */
    public static @Nullable VkAllocationCallbacks npAllocationCallbacks(long struct) { return VkAllocationCallbacks.createSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS)); }
    /** Unsafe version of {@link #pDeviceMemoryCallbacks}. */
    public static @Nullable VmaDeviceMemoryCallbacks npDeviceMemoryCallbacks(long struct) { return VmaDeviceMemoryCallbacks.createSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS)); }
    /** Unsafe version of {@link #pHeapSizeLimit(int) pHeapSizeLimit}. */
    public static @Nullable LongBuffer npHeapSizeLimit(long struct, int capacity) { return memLongBufferSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PHEAPSIZELIMIT), capacity); }
    /** Unsafe version of {@link #pVulkanFunctions}. */
    public static VmaVulkanFunctions npVulkanFunctions(long struct) { return VmaVulkanFunctions.create(memGetAddress(struct + VmaAllocatorCreateInfo.PVULKANFUNCTIONS)); }
    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + VmaAllocatorCreateInfo.INSTANCE); }
    /** Unsafe version of {@link #vulkanApiVersion}. */
    public static int nvulkanApiVersion(long struct) { return memGetInt(struct + VmaAllocatorCreateInfo.VULKANAPIVERSION); }
    /** Unsafe version of {@link #pTypeExternalMemoryHandleTypes(int) pTypeExternalMemoryHandleTypes}. */
    public static @Nullable IntBuffer npTypeExternalMemoryHandleTypes(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + VmaAllocatorCreateInfo.PTYPEEXTERNALMEMORYHANDLETYPES), capacity); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VmaAllocatorCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #physicalDevice(VkPhysicalDevice) physicalDevice}. */
    public static void nphysicalDevice(long struct, VkPhysicalDevice value) { memPutAddress(struct + VmaAllocatorCreateInfo.PHYSICALDEVICE, value.address()); }
    /** Unsafe version of {@link #device(VkDevice) device}. */
    public static void ndevice(long struct, VkDevice value) { memPutAddress(struct + VmaAllocatorCreateInfo.DEVICE, value.address()); }
    /** Unsafe version of {@link #preferredLargeHeapBlockSize(long) preferredLargeHeapBlockSize}. */
    public static void npreferredLargeHeapBlockSize(long struct, long value) { memPutLong(struct + VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE, value); }
    /** Unsafe version of {@link #pAllocationCallbacks(VkAllocationCallbacks) pAllocationCallbacks}. */
    public static void npAllocationCallbacks(long struct, @Nullable VkAllocationCallbacks value) { memPutAddress(struct + VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDeviceMemoryCallbacks(VmaDeviceMemoryCallbacks) pDeviceMemoryCallbacks}. */
    public static void npDeviceMemoryCallbacks(long struct, @Nullable VmaDeviceMemoryCallbacks value) { memPutAddress(struct + VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pHeapSizeLimit(LongBuffer) pHeapSizeLimit}. */
    public static void npHeapSizeLimit(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VmaAllocatorCreateInfo.PHEAPSIZELIMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #pVulkanFunctions(VmaVulkanFunctions) pVulkanFunctions}. */
    public static void npVulkanFunctions(long struct, VmaVulkanFunctions value) { memPutAddress(struct + VmaAllocatorCreateInfo.PVULKANFUNCTIONS, value.address()); }
    /** Unsafe version of {@link #instance(VkInstance) instance}. */
    public static void ninstance(long struct, VkInstance value) { memPutAddress(struct + VmaAllocatorCreateInfo.INSTANCE, value.address()); }
    /** Unsafe version of {@link #vulkanApiVersion(int) vulkanApiVersion}. */
    public static void nvulkanApiVersion(long struct, int value) { memPutInt(struct + VmaAllocatorCreateInfo.VULKANAPIVERSION, value); }
    /** Unsafe version of {@link #pTypeExternalMemoryHandleTypes(IntBuffer) pTypeExternalMemoryHandleTypes}. */
    public static void npTypeExternalMemoryHandleTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VmaAllocatorCreateInfo.PTYPEEXTERNALMEMORYHANDLETYPES, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaAllocatorCreateInfo.PHYSICALDEVICE));
        check(memGetAddress(struct + VmaAllocatorCreateInfo.DEVICE));
        long pVulkanFunctions = memGetAddress(struct + VmaAllocatorCreateInfo.PVULKANFUNCTIONS);
        check(pVulkanFunctions);
        VmaVulkanFunctions.validate(pVulkanFunctions);
        check(memGetAddress(struct + VmaAllocatorCreateInfo.INSTANCE));
    }

}