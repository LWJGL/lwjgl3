/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vma

import org.lwjgl.generator.*
import vulkan.*

val VmaAllocation = "VmaAllocation".handle
val VmaAllocator = "VmaAllocator".handle
val VmaDefragmentationContext = "VmaDefragmentationContext".handle
val VmaPool = "VmaPool".handle
val VmaVirtualAllocation = "VmaVirtualAllocation".handle
val VmaVirtualBlock = "VmaVirtualBlock".handle

val VmaAllocationCreateFlags = "VmaAllocationCreateFlags".enumType
val VmaAllocatorCreateFlags = "VmaAllocatorCreateFlags".enumType
val VmaDefragmentationFlags = "VmaDefragmentationFlags".enumType
val VmaMemoryUsage = "VmaMemoryUsage".enumType
val VmaPoolCreateFlags = "VmaPoolCreateFlags".enumType
val VmaVirtualAllocationCreateFlags = typedef(VkFlags, "VmaVirtualAllocationCreateFlags")
val VmaVirtualBlockCreateFlagBits = "VmaVirtualBlockCreateFlagBits".enumType

val PFN_vmaAllocateDeviceMemoryFunction = Module.VMA.callback {
    void(
        "VmaAllocateDeviceMemoryFunction",
        "Called after successful {@code vkAllocateMemory}.",

        VmaAllocator("allocator", ""),
        uint32_t("memoryType", ""),
        VkDeviceMemory("memory", ""),
        VkDeviceSize("size", ""),
        nullable..opaque_p("pUserData", ""),

        nativeType = "PFN_vmaAllocateDeviceMemoryFunction"
    ) {
        documentation = "Instances of this interface may be set to the ##VmaDeviceMemoryCallbacks struct."
    }
}

val PFN_vmaFreeDeviceMemoryFunction = Module.VMA.callback {
    void(
        "VmaFreeDeviceMemoryFunction",
        "Called before {@code vkFreeMemory}.",

        VmaAllocator("allocator", ""),
        uint32_t("memoryType", ""),
        VkDeviceMemory("memory", ""),
        VkDeviceSize("size", ""),
        nullable..opaque_p("pUserData", ""),

        nativeType = "PFN_vmaFreeDeviceMemoryFunction"
    ) {
        documentation = "Instances of this interface may be set to the ##VmaDeviceMemoryCallbacks struct."
    }
}

val VmaDeviceMemoryCallbacks = struct(Module.VMA, "VmaDeviceMemoryCallbacks") {
    documentation =
        """
        Set of callbacks that the library will call for {@code vkAllocateMemory} and {@code vkFreeMemory}.

        Provided for informative purpose, e.g. to gather statistics about number of allocations or total amount of memory allocated in Vulkan.

        Used in ##VmaAllocatorCreateInfo{@code ::pDeviceMemoryCallbacks}.
        """
    nullable..PFN_vmaAllocateDeviceMemoryFunction("pfnAllocate", "")
    nullable..PFN_vmaFreeDeviceMemoryFunction("pfnFree", "")
    nullable..opaque_p("pUserData", "")
}

val VmaVulkanFunctions = struct(Module.VMA, "VmaVulkanFunctions", skipBuffer = true) {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Pointers to some Vulkan functions - a subset used by the library.

        Used in ##VmaAllocatorCreateInfo{@code ::pVulkanFunctions}.
        """

    nullable.."PFN_vkGetInstanceProcAddr".handle("vkGetInstanceProcAddr", "")
    nullable.."PFN_vkGetDeviceProcAddr".handle("vkGetDeviceProcAddr", "")
    "PFN_vkGetPhysicalDeviceProperties".handle("vkGetPhysicalDeviceProperties", "")
    "PFN_vkGetPhysicalDeviceMemoryProperties".handle("vkGetPhysicalDeviceMemoryProperties", "")
    "PFN_vkAllocateMemory".handle("vkAllocateMemory", "")
    "PFN_vkFreeMemory".handle("vkFreeMemory", "")
    "PFN_vkMapMemory".handle("vkMapMemory", "")
    "PFN_vkUnmapMemory".handle("vkUnmapMemory", "")
    "PFN_vkFlushMappedMemoryRanges".handle("vkFlushMappedMemoryRanges", "")
    "PFN_vkInvalidateMappedMemoryRanges".handle("vkInvalidateMappedMemoryRanges", "")
    "PFN_vkBindBufferMemory".handle("vkBindBufferMemory", "")
    "PFN_vkBindImageMemory".handle("vkBindImageMemory", "")
    "PFN_vkGetBufferMemoryRequirements".handle("vkGetBufferMemoryRequirements", "")
    "PFN_vkGetImageMemoryRequirements".handle("vkGetImageMemoryRequirements", "")
    "PFN_vkCreateBuffer".handle("vkCreateBuffer", "")
    "PFN_vkDestroyBuffer".handle("vkDestroyBuffer", "")
    "PFN_vkCreateImage".handle("vkCreateImage", "")
    "PFN_vkDestroyImage".handle("vkDestroyImage", "")
    "PFN_vkCmdCopyBuffer".handle("vkCmdCopyBuffer", "")
    nullable.."PFN_vkGetBufferMemoryRequirements2KHR".handle(
        "vkGetBufferMemoryRequirements2KHR",
        """
        {@code vkGetBufferMemoryRequirements2} on Vulkan &ge; 1.1, {@code vkGetBufferMemoryRequirements2KHR} when using {@code VK_KHR_dedicated_allocation}
        extension.
        """
    )
    nullable.."PFN_vkGetImageMemoryRequirements2KHR".handle(
        "vkGetImageMemoryRequirements2KHR",
        """
        {@code vkGetImageMemoryRequirements2} on Vulkan &ge; 1.1, {@code vkGetImageMemoryRequirements2KHR} when using {@code VK_KHR_dedicated_allocation}
        extension.
        """
    )
    nullable.."PFN_vkBindBufferMemory2KHR".handle(
        "vkBindBufferMemory2KHR",
        "{@code vkBindBufferMemory2} on Vulkan &ge; 1.1, {@code vkBindBufferMemory2KHR} when using {@code VK_KHR_bind_memory2} extension."
    )
    nullable.."PFN_vkBindImageMemory2KHR".handle(
        "vkBindImageMemory2KHR",
        "{@code vkBindImageMemory2} on Vulkan &ge; 1.1, {@code vkBindImageMemory2KHR} when using {@code VK_KHR_bind_memory2} extension."
    )
    nullable.."PFN_vkGetPhysicalDeviceMemoryProperties2KHR".handle("vkGetPhysicalDeviceMemoryProperties2KHR", "")
    nullable.."PFN_vkGetDeviceBufferMemoryRequirements".handle("vkGetDeviceBufferMemoryRequirements", "")
    nullable.."PFN_vkGetDeviceImageMemoryRequirements".handle("vkGetDeviceImageMemoryRequirements", "")

    customMethod("""
    /**
     * Helper method that populates this struct with required Vulkan function pointers from the specified Vulkan instance and device.
     *
     * @param instance a Vulkan instance
     * @param device   a Vulkan device
     */
    public VmaVulkanFunctions set(VkInstance instance, VkDevice device) {
        VKCapabilitiesInstance ic = instance.getCapabilities();
        VKCapabilitiesDevice   dc = device.getCapabilities();
        this
            .vkGetInstanceProcAddr(NULL)
            .vkGetDeviceProcAddr(NULL)
            .vkGetPhysicalDeviceProperties(ic.vkGetPhysicalDeviceProperties)
            .vkGetPhysicalDeviceMemoryProperties(ic.vkGetPhysicalDeviceMemoryProperties)
            .vkAllocateMemory(dc.vkAllocateMemory)
            .vkFreeMemory(dc.vkFreeMemory)
            .vkMapMemory(dc.vkMapMemory)
            .vkUnmapMemory(dc.vkUnmapMemory)
            .vkFlushMappedMemoryRanges(dc.vkFlushMappedMemoryRanges)
            .vkInvalidateMappedMemoryRanges(dc.vkInvalidateMappedMemoryRanges)
            .vkBindBufferMemory(dc.vkBindBufferMemory)
            .vkBindImageMemory(dc.vkBindImageMemory)
            .vkGetBufferMemoryRequirements(dc.vkGetBufferMemoryRequirements)
            .vkGetImageMemoryRequirements(dc.vkGetImageMemoryRequirements)
            .vkCreateBuffer(dc.vkCreateBuffer)
            .vkDestroyBuffer(dc.vkDestroyBuffer)
            .vkCreateImage(dc.vkCreateImage)
            .vkDestroyImage(dc.vkDestroyImage)
            .vkCmdCopyBuffer(dc.vkCmdCopyBuffer)
            .vkGetBufferMemoryRequirements2KHR(dc.vkGetBufferMemoryRequirements2 != NULL ? dc.vkGetBufferMemoryRequirements2 : dc.vkGetBufferMemoryRequirements2KHR)
            .vkGetImageMemoryRequirements2KHR(dc.vkGetImageMemoryRequirements2 != NULL ? dc.vkGetImageMemoryRequirements2 : dc.vkGetImageMemoryRequirements2KHR)
            .vkBindBufferMemory2KHR(dc.vkBindBufferMemory2 != NULL ? dc.vkBindBufferMemory2 : dc.vkBindBufferMemory2KHR)
            .vkBindImageMemory2KHR(dc.vkBindImageMemory2 != NULL ? dc.vkBindImageMemory2 : dc.vkBindImageMemory2KHR)
            .vkGetPhysicalDeviceMemoryProperties2KHR(ic.vkGetPhysicalDeviceMemoryProperties2 != NULL ? ic.vkGetPhysicalDeviceMemoryProperties2 : ic.vkGetPhysicalDeviceMemoryProperties2KHR)
            .vkGetDeviceBufferMemoryRequirements(dc.vkGetDeviceBufferMemoryRequirements != NULL ? dc.vkGetDeviceBufferMemoryRequirements : dc.vkGetDeviceBufferMemoryRequirementsKHR)
            .vkGetDeviceImageMemoryRequirements(dc.vkGetDeviceImageMemoryRequirements != NULL ? dc.vkGetDeviceImageMemoryRequirements : dc.vkGetDeviceImageMemoryRequirementsKHR);
        return this;
    }""")
}

val VmaAllocatorCreateInfo = struct(Module.VMA, "VmaAllocatorCreateInfo", skipBuffer = true) {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "Description of an Allocator to be created."

    VmaAllocatorCreateFlags("flags", "flags for created allocator. Use {@code VmaAllocatorCreateFlagBits} enum.").links("ALLOCATOR_CREATE_\\w+")
    VkPhysicalDevice("physicalDevice", "Vulkan physical device. It must be valid throughout whole lifetime of created allocator.")
    VkDevice("device", "Vulkan device. It must be valid throughout whole lifetime of created allocator.")
    VkDeviceSize(
        "preferredLargeHeapBlockSize",
        """
        preferred size of a single {@code VkDeviceMemory} block to be allocated from large heaps &gt; 1 GiB. Set to 0 to use default, which is currently 256
        MiB. Optional.
        """
    )
    nullable..VkAllocationCallbacks.const.p(
        "pAllocationCallbacks",
        "custom CPU memory allocation callbacks. Optional, can be null. When specified, will also be used for all CPU-side memory allocations. Optional."
    )
    nullable..VmaDeviceMemoryCallbacks.const.p(
        "pDeviceMemoryCallbacks",
        "informative callbacks for {@code vkAllocateMemory}, {@code vkFreeMemory}. Optional."
    )
    nullable..VkDeviceSize.const.p(
        "pHeapSizeLimit",
        """
        Either #NULL or a pointer to an array of limits on maximum number of bytes that can be allocated out of particular Vulkan memory heap.

        If not #NULL, it must be a pointer to an array of {@code VkPhysicalDeviceMemoryProperties::memoryHeapCount} elements, defining limit on maximum number
        of bytes that can be allocated out of particular Vulkan memory heap.

        Any of the elements may be equal to {@code VK_WHOLE_SIZE}, which means no limit on that heap. This is also the default in case of
        {@code pHeapSizeLimit = NULL}.

        If there is a limit defined for a heap:
        ${ul(
            "If user tries to allocate more memory from that heap using this allocator, the allocation fails with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY}.",
            """
            If the limit is smaller than heap size reported in {@code VkMemoryHeap::size}, the value of this limit will be reported instead when using
            #GetMemoryProperties().
            """
        )}

        Warning! Using this feature may not be equivalent to installing a GPU with smaller amount of memory, because graphics driver doesn't necessary fail new
        allocations with {@code VK_ERROR_OUT_OF_DEVICE_MEMORY} result when memory capacity is exceeded. It may return success and just silently migrate some
        device memory blocks to system RAM. This driver behavior can also be controlled using {@code VK_AMD_memory_overallocation_behavior} extension.
        """
    )
    VmaVulkanFunctions.const.p("pVulkanFunctions", "pointers to Vulkan functions")
    VkInstance("instance", "handle to Vulkan instance object.")
    uint32_t(
        "vulkanApiVersion",
        """
        the highest version of Vulkan that the application is designed to use. (optional)

        It must be a value in the format as created by macro {@code VK_MAKE_VERSION} or a constant like: {@code VK_API_VERSION_1_1},
        {@code VK_API_VERSION_1_0}. The patch version number specified is ignored. Only the major and minor versions are considered. It must be less or equal
        (preferably equal) to value as passed to {@code vkCreateInstance} as {@code VkApplicationInfo::apiVersion}. Only versions 1.0, 1.1, 1.2 and 1.3 are
        supported by the current implementation.

        Leaving it initialized to zero is equivalent to {@code VK_API_VERSION_1_0}.
        """
    )
    nullable..VkExternalMemoryHandleTypeFlagsKHR.const.p(
        "pTypeExternalMemoryHandleTypes",
        """
        Either null or a pointer to an array of external memory handle types for each Vulkan memory type.

        If not #NULL, it must be a pointer to an array of {@code VkPhysicalDeviceMemoryProperties::memoryTypeCount} elements, defining external memory handle
        types of particular Vulkan memory type, to be passed using {@code VkExportMemoryAllocateInfoKHR}.

        Any of the elements may be equal to 0, which means not to use {@code VkExportMemoryAllocateInfoKHR} on this memory type. This is also the default in
        case of {@code pTypeExternalMemoryHandleTypes = NULL}.
        """
    )
}

val VmaAllocatorInfo = struct(Module.VMA, "VmaAllocatorInfo", mutable = false) {
    documentation = "Information about existing {@code VmaAllocator} object."

    VkInstance(
        "instance",
        """
        Handle to Vulkan instance object.

        This is the same value as has been passed through ##VmaAllocatorCreateInfo{@code ::instance}.
        """
    )
    VkPhysicalDevice(
        "physicalDevice",
        """
        Handle to Vulkan physical device object.

        This is the same value as has been passed through ##VmaAllocatorCreateInfo{@code ::physicalDevice}.
        """
    )
    VkDevice(
        "device",
        """
        Handle to Vulkan device object.

        This is the same value as has been passed through ##VmaAllocatorCreateInfo{@code ::device}.
        """
    )
}

val VmaStatInfo = struct(Module.VMA, "VmaStatInfo", mutable = false) {
    documentation = "Calculated statistics of memory usage in entire allocator."

    uint32_t("blockCount", "number of {@code VkDeviceMemory} Vulkan memory blocks allocated")
    uint32_t("allocationCount", "number of {@code VmaAllocation} allocation objects allocated")
    uint32_t("unusedRangeCount", "number of free ranges of memory between allocations")
    VkDeviceSize("usedBytes", "total number of bytes occupied by all allocations")
    VkDeviceSize("unusedBytes", "total number of bytes occupied by unused ranges")
    VkDeviceSize("allocationSizeMin", "")
    VkDeviceSize("allocationSizeAvg", "")
    VkDeviceSize("allocationSizeMax", "")
    VkDeviceSize("unusedRangeSizeMin", "")
    VkDeviceSize("unusedRangeSizeAvg", "")
    VkDeviceSize("unusedRangeSizeMax", "")
}

private const val VK_MAX_MEMORY_TYPES = 32
private const val VK_MAX_MEMORY_HEAPS = 16

/// General statistics from current state of Allocator.
val VmaStats = struct(Module.VMA, "VmaStats", mutable = false) {
    documentation = "General statistics from current state of Allocator."

    VmaStatInfo("memoryType", "")[VK_MAX_MEMORY_TYPES]
    VmaStatInfo("memoryHeap", "")[VK_MAX_MEMORY_HEAPS]
    VmaStatInfo("total", "")
}

val VmaBudget = struct(Module.VMA, "VmaBudget", mutable = false) {
    documentation = "Statistics of current memory usage and available budget, in bytes, for specific memory heap."

    VkDeviceSize("blockBytes", "Sum size of all {@code VkDeviceMemory} blocks allocated from particular heap, in bytes.")
    VkDeviceSize(
        "allocationBytes",
        """
        Sum size of all allocations created in particular heap, in bytes.

        Usually less or equal than {@code blockBytes}. Difference {@code blockBytes - allocationBytes} is the amount of memory allocated but unused - available
        for new allocations or wasted due to fragmentation.
        """
    )
    VkDeviceSize(
        "usage",
        """
        Estimated current memory usage of the program, in bytes.

        Fetched from system using {@code VK_EXT_memory_budget} extension if enabled.

        It might be different than {@code blockBytes} (usually higher) due to additional implicit objects also occupying the memory, like swapchain, pipelines,
        descriptor heaps, command buffers, or {@code VkDeviceMemory} blocks allocated outside of this library, if any.
        """
    )
    VkDeviceSize(
        "budget",
        """
        Estimated amount of memory available to the program, in bytes.

        Fetched from system using {@code VK_EXT_memory_budget} extension if enabled.

        It might be different (most probably smaller) than {@code VkMemoryHeap::size[heapIndex]} due to factors external to the program, like other programs
        also consuming system resources. Difference {@code budget - usage} is the amount of additional memory that can probably be allocated without problems.
        Exceeding the budget may result in various problems.
        """
    )
}

val VmaAllocationCreateInfo = struct(Module.VMA, "VmaAllocationCreateInfo") {
    VmaAllocationCreateFlags("flags", "use {@code VmaAllocationCreateFlagBits} enum").links("ALLOCATION_CREATE_\\w+", LinkMode.BITFIELD)
    VmaMemoryUsage(
        "usage",
        """
        intended usage of memory.

        You can leave #MEMORY_USAGE_UNKNOWN if you specify memory requirements in other way. If {@code pool} is not null, this member is ignored.
        """
    ).links("MEMORY_USAGE_\\w+")
    VkMemoryPropertyFlags(
        "requiredFlags",
        """
        flags that must be set in a Memory Type chosen for an allocation.

        Leave 0 if you specify memory requirements in other way. If {@code pool} is not null, this member is ignored.
        """
    )
    VkMemoryPropertyFlags(
        "preferredFlags",
        """
        flags that preferably should be set in a memory type chosen for an allocation.

        Set to 0 if no additional flags are preferred. If {@code pool} is not null, this member is ignored.
        """
    )
    uint32_t(
        "memoryTypeBits",
        """
        bitmask containing one bit set for every memory type acceptable for this allocation.

        Value 0 is equivalent to {@code UINT32_MAX} - it means any memory type is accepted if it meets other requirements specified by this structure, with no
        further restrictions on memory type index. If {@code pool} is not null, this member is ignored.
        """
    )
    nullable..VmaPool(
        "pool",
        """
        pool that this allocation should be created in.

        Leave {@code VK_NULL_HANDLE} to allocate from default pool. If not null, members: {@code usage}, {@code requiredFlags}, {@code preferredFlags},
        {@code memoryTypeBits} are ignored.
        """
    )
    nullable..opaque_p(
        "pUserData",
        """
        custom general-purpose pointer that will be stored in {@code VmaAllocation}, can be read as ##VmaAllocationInfo{@code ::pUserData} and changed using
        #SetAllocationUserData().

        If #ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT is used, it must be either null or pointer to a null-terminated string. The string will be then copied
        to internal buffer, so it doesn't need to be valid after allocation call.
        """
    )
    float(
        "priority",
        """
        A floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations.

        It is used only when #ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT flag was used during creation of the {@code VmaAllocator} object and this allocation
        ends up as dedicated or is explicitly forced as dedicated using #ALLOCATION_CREATE_DEDICATED_MEMORY_BIT. Otherwise, it has the priority of a memory
        block where it is placed and this variable is ignored.
        """
    )
}

val VmaPoolCreateInfo = struct(Module.VMA, "VmaPoolCreateInfo") {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "Describes parameter of created {@code VmaPool}."

    uint32_t("memoryTypeIndex", "Vulkan memory type index to allocate this pool from")
    VmaPoolCreateFlags("flags", "Use combination of {@code VmaPoolCreateFlagBits}.").links("POOL_CREATE_\\w+", LinkMode.BITFIELD)
    VkDeviceSize(
        "blockSize",
        """
        size of a single {@code VkDeviceMemory} block to be allocated as part of this pool, in bytes. Optional.

        Specify nonzero to set explicit, constant size of memory blocks used by this pool. Leave 0 to use default and let the library manage block sizes
        automatically. Sizes of particular blocks may vary. In this case, the pool will also support dedicated allocations.
        """
    )
    size_t(
        "minBlockCount",
        """
        minimum number of blocks to be always allocated in this pool, even if they stay empty.

        Set to 0 to have no preallocated blocks and allow the pool be completely empty.
        """
    )
    size_t(
        "maxBlockCount",
        """
        maximum number of blocks that can be allocated in this pool. Optional.

        Set to 0 to use default, which is {@code SIZE_MAX}, which means no limit. Set to same value as ##VmaPoolCreateInfo{@code ::minBlockCount} to have fixed
        amount of memory allocated throughout whole lifetime of this pool.
        """
    )
    float(
        "priority",
        """
        A floating-point value between 0 and 1, indicating the priority of the allocations in this pool relative to other memory allocations.

        It is used only when #ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT flag was used during creation of the {@code VmaAllocator} object. Otherwise, this
        variable is ignored.
        """
    )
    VkDeviceSize(
        "minAllocationAlignment",
        """
        Additional minimum alignment to be used for all allocations created from this pool. Can be 0.

        Leave 0 (default) not to impose any additional alignment. If not 0, it must be a power of two. It can be useful in cases where alignment returned by
        Vulkan by functions like {@code vkGetBufferMemoryRequirements} is not enough, e.g. when doing interop with OpenGL.
        """
    )
    PointerSetter(
        *VkMemoryAllocateInfo.definition["pNext"].get<PointerSetter>().types,
        prepend = true,
        targetSetter = "pNext"
    )..nullable..opaque_p(
        "pMemoryAllocateNext",
        """
        Additional {@code pNext} chain to be attached to {@code VkMemoryAllocateInfo} used for every allocation made by this pool. Optional.

        Optional, can be null. If not null, it must point to a {@code pNext} chain of structures that can be attached to {@code VkMemoryAllocateInfo}. It can
        be useful for special needs such as adding {@code VkExportMemoryAllocateInfoKHR}. Structures pointed by this member must remain alive and unchanged for
        the whole lifetime of the custom pool.

        Please note that some structures, e.g. {@code VkMemoryPriorityAllocateInfoEXT}, {@code VkMemoryDedicatedAllocateInfoKHR}, can be attached automatically
        by this library when using other, more convenient of its features.
        """
    )
}

val VmaPoolStats = struct(Module.VMA, "VmaPoolStats", mutable = false) {
    documentation = "Describes parameter of existing {@code VmaPool}."
    VkDeviceSize("size", "total amount of {@code VkDeviceMemory} allocated from Vulkan for this pool, in bytes")
    VkDeviceSize("unusedSize", "total number of bytes in the pool not used by any {@code VmaAllocation}")
    size_t("allocationCount", "number of {@code VmaAllocation} objects created from this pool that were not destroyed")
    size_t("unusedRangeCount", "number of continuous memory ranges in the pool not used by any {@code VmaAllocation}")
    size_t("blockCount", "number of {@code VkDeviceMemory} blocks allocated for this pool")
}

val VmaAllocationInfo = struct(Module.VMA, "VmaAllocationInfo", mutable = false) {
    documentation = "Parameters of {@code VmaAllocation} objects, that can be retrieved using function #GetAllocationInfo()."

    uint32_t(
        "memoryType",
        """
        memory type index that this allocation was allocated from.

        It never changes.
        """
    )
    VkDeviceMemory(
        "deviceMemory",
        """
        handle to Vulkan memory object.

        Same memory object can be shared by multiple allocations.

        It can change after call to #Defragment() if this allocation is passed to the function.
        """
    )
    VkDeviceSize(
        "offset",
        """
        offset in {@code VkDeviceMemory} object to the beginning of this allocation, in bytes. {@code (deviceMemory, offset)} pair is unique to this allocation.

        You usually don't need to use this offset. If you create a buffer or an image together with the allocation using e.g. function #CreateBuffer(),
        #CreateImage(), functions that operate on these resources refer to the beginning of the buffer or image, not entire device memory block. Functions like
        #MapMemory(), #BindBufferMemory() also refer to the beginning of the allocation and apply this offset automatically.

        It can change after call to #Defragment() if this allocation is passed to the function.
        """
    )
    VkDeviceSize(
        "size",
        """
        size of this allocation, in bytes.

        It never changes.

        ${note("""
        Allocation size returned in this variable may be greater than the size requested for the resource e.g. as {@code VkBufferCreateInfo::size}. Whole size
        of the allocation is accessible for operations on memory e.g. using a pointer after mapping with #MapMemory(), but operations on the resource e.g.
        using {@code vkCmdCopyBuffer} must be limited to the size of the resource.""")}
        """
    )
    nullable..opaque_p(
        "pMappedData",
        """
        pointer to the beginning of this allocation as mapped data.

        If the allocation hasn't been mapped using #MapMemory() and hasn't been created with #ALLOCATION_CREATE_MAPPED_BIT flag, this value is null.

        It can change after call to #MapMemory(), #UnmapMemory(). It can also change after call to #Defragment() if this allocation is passed to the function.
        """
    )
    nullable..opaque_p(
        "pUserData",
        """
        custom general-purpose pointer that was passed as ##VmaAllocationCreateInfo{@code ::pUserData} or set using #SetAllocationUserData().

        It can change after call to #SetAllocationUserData() for this allocation.
        """
    )
}

val VmaDefragmentationInfo2 = struct(Module.VMA, "VmaDefragmentationInfo2") {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Parameters for defragmentation.

        To be used with function #DefragmentationBegin().
        """

    VmaDefragmentationFlags("flags", "reserved for future use. Should be 0.")
    AutoSize("pAllocations", "pAllocationsChanged")..uint32_t("allocationCount", "number of allocations in {@code pAllocations} array")
    VmaAllocation.p(
        "pAllocations",
        """
        pointer to array of allocations that can be defragmented.

        The array should have {@code allocationCount} elements. The array should not contain nulls. Elements in the array should be unique - same allocation
        cannot occur twice. All allocations not present in this array are considered non-moveable during this defragmentation.
        """
    )
    nullable..VkBool32.p(
        "pAllocationsChanged",
        """
        Optional, output. Pointer to array that will be filled with information whether the allocation at certain index has been changed during defragmentation.

        The array should have {@code allocationCount} elements. You can pass null if you are not interested in this information.
        """
    )
    AutoSize("pPools")..uint32_t("poolCount", "number of pools in {@code pPools} array")
    nullable..VmaPool.const.p(
        "pPools",
        """
        Either null or pointer to array of pools to be defragmented.

        All the allocations in the specified pools can be moved during defragmentation and there is no way to check if they were really moved as in
        {@code pAllocationsChanged}, so you must query all the allocations in all these pools for new {@code VkDeviceMemory} and offset using
        #GetAllocationInfo() if you might need to recreate buffers and images bound to them.

        The array should have {@code poolCount} elements. The array should not contain nulls. Elements in the array should be unique - same pool cannot occur
        twice.

        Using this array is equivalent to specifying all allocations from the pools in {@code pAllocations}. It might be more efficient.
        """
    )
    VkDeviceSize(
        "maxCpuBytesToMove",
        """
        maximum total numbers of bytes that can be copied while moving allocations to different places using transfers on CPU side, like {@code memcpy()},
        {@code memmove()}.

        {@code VK_WHOLE_SIZE} means no limit.
        """
    )
    uint32_t(
        "maxCpuAllocationsToMove",
        """
        maximum number of allocations that can be moved to a different place using transfers on CPU side, like {@code memcpy()}, {@code memmove()}.

        {@code UINT32_MAX} means no limit.
        """
    )
    VkDeviceSize(
        "maxGpuBytesToMove",
        """
        maximum total numbers of bytes that can be copied while moving allocations to different places using transfers on GPU side, posted to
        {@code commandBuffer}.

        {@code VK_WHOLE_SIZE} means no limit.
        """
    )
    uint32_t(
        "maxGpuAllocationsToMove",
        """
        maximum number of allocations that can be moved to a different place using transfers on GPU side, posted to {@code commandBuffer}.

        {@code UINT32_MAX} means no limit.
        """
    )
    nullable..VkCommandBuffer(
        "commandBuffer",
        """
        command buffer where GPU copy commands will be posted. Optional.

        If not null, it must be a valid command buffer handle that supports Transfer queue type. It must be in the recording state and outside of a render pass
        instance. You need to submit it and make sure it finished execution before calling #DefragmentationEnd().

        Passing null means that only CPU defragmentation will be performed.
        """
    )
}

val VmaDefragmentationPassMoveInfo = struct(Module.VMA, "VmaDefragmentationPassMoveInfo", mutable = false) {
    VmaAllocation("allocation", "")
    VkDeviceMemory("memory", "")
    VkDeviceSize("offset", "")
}

val VmaDefragmentationPassInfo = struct(Module.VMA, "VmaDefragmentationPassInfo", mutable = false) {
    documentation =
        """
        Parameters for incremental defragmentation steps.

        To be used with function #BeginDefragmentationPass().
        """

    AutoSize("pMoves")..uint32_t("moveCount", "")
    VmaDefragmentationPassMoveInfo.p("pMoves", "")
}

val VmaDefragmentationInfo = struct(Module.VMA, "VmaDefragmentationInfo") {
    documentation =
        """
        Deprecated. Optional configuration parameters to be passed to function #Defragment().

        This is a part of the old interface. It is recommended to use structure ##VmaDefragmentationInfo2 and function #DefragmentationBegin() instead.
        """

    VkDeviceSize(
        "maxBytesToMove",
        """
        maximum total numbers of bytes that can be copied while moving allocations to different places.

        Default is {@code VK_WHOLE_SIZ}E, which means no limit.
        """
    )
    uint32_t(
        "maxAllocationsToMove",
        """
        maximum number of allocations that can be moved to different place.

        Default is {@code UINT32_MAX}, which means no limit.
        """
    )
}

val VmaDefragmentationStats = struct(Module.VMA, "VmaDefragmentationStats", mutable = false) {
    documentation = "Statistics returned by function #Defragment()."

    VkDeviceSize("bytesMoved", "total number of bytes that have been copied while moving allocations to different places")
    VkDeviceSize("bytesFreed", "total number of bytes that have been released to the system by freeing empty {@code VkDeviceMemory} objects")
    uint32_t("allocationsMoved", "number of allocations that have been moved to different places")
    uint32_t("deviceMemoryBlocksFreed", "number of empty {@code VkDeviceMemory} objects that have been released to the system")
}

val VmaVirtualBlockCreateInfo = struct(Module.VMA, "VmaVirtualBlockCreateInfo") {
    javaImport("org.lwjgl.vulkan.*")
    documentation = "Parameters of created {@code VmaVirtualBlock} object to be passed to #CreateVirtualBlock()."

    VkDeviceSize(
        "size",
        """
        total size of the virtual block.

        Sizes can be expressed in bytes or any units you want as long as you are consistent in using them. For example, if you allocate from some array of
        structures, 1 can mean single instance of entire structure.
        """
    )
    VmaVirtualBlockCreateFlagBits("flags", "use combination of {@code VmaVirtualBlockCreateFlagBits}").links("VIRTUAL_BLOCK_CREATE_\\w+", LinkMode.BITFIELD)
    nullable..VkAllocationCallbacks.const.p(
        "pAllocationCallbacks",
        """
        custom CPU memory allocation callbacks. Optional.

        Optional, can be null. When specified, they will be used for all CPU-side memory allocations.
        """
    )
}

val VmaVirtualAllocationCreateInfo = struct(Module.VMA, "VmaVirtualAllocationCreateInfo") {
    documentation = "Parameters of created virtual allocation to be passed to #VirtualAllocate()."

    VkDeviceSize(
        "size",
        """
        size of the allocation.

        Cannot be zero.
        """
    )
    VkDeviceSize(
        "alignment",
        """
        required alignment of the allocation. Optional.

        Must be power of two. Special value 0 has the same meaning as 1 - means no special alignment is required, so allocation can start at any offset.
        """
    )
    VmaVirtualAllocationCreateFlags("flags", "use combination of {@code VmaVirtualAllocationCreateFlagBits}").links("VIRTUAL_ALLOCATION_CREATE_\\w+", LinkMode.BITFIELD)
    nullable..opaque_p(
        "pUserData",
        """
        custom pointer to be associated with the allocation. Optional.

        It can be any value and can be used for user-defined purposes. It can be fetched or changed later.
        """
    )
}

val VmaVirtualAllocationInfo = struct(Module.VMA, "VmaVirtualAllocationInfo", mutable = false) {
    documentation = "Parameters of an existing virtual allocation, returned by #GetVirtualAllocationInfo()."

    VkDeviceSize(
        "offset",
        """
        offset of the allocation.

        Offset at which the allocation was made.
        """
    )
    VkDeviceSize(
        "size",
        """
        size of the allocation.

        Same value as passed in ##VmaVirtualAllocationCreateInfo{@code ::size}.
        """
    )
    nullable..opaque_p(
        "pUserData",
        """
        custom pointer associated with the allocation.

        Same value as passed in ##VmaVirtualAllocationCreateInfo{@code ::pUserData} or to #SetVirtualAllocationUserData().
        """
    )
}
