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

val VmaAllocationCreateFlags = "VmaAllocationCreateFlags".enumType
val VmaAllocatorCreateFlags = "VmaAllocatorCreateFlags".enumType
val VmaDefragmentationFlags = "VmaDefragmentationFlags".enumType
val VmaMemoryUsage = "VmaMemoryUsage".enumType
val VmaPoolCreateFlags = "VmaPoolCreateFlags".enumType
val VmaRecordFlags = "VmaRecordFlags".enumType

val PFN_vmaAllocateDeviceMemoryFunction = Module.VMA.callback {
    void(
        "VmaAllocateDeviceMemoryFunction",
        "Called after successful {@code vkAllocateMemory}.",

        VmaAllocator("allocator", ""),
        uint32_t("memoryType", ""),
        VkDeviceMemory("memory", ""),
        VkDeviceSize("size", ""),

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
}

val VmaVulkanFunctions = struct(Module.VMA, "VmaVulkanFunctions", skipBuffer = true) {
    javaImport("org.lwjgl.vulkan.*")
    documentation =
        """
        Pointers to some Vulkan functions - a subset used by the library.

        Used in ##VmaAllocatorCreateInfo{@code ::pVulkanFunctions}.
        """

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
    nullable.."PFN_vkGetBufferMemoryRequirements2KHR".handle("vkGetBufferMemoryRequirements2KHR", "")
    nullable.."PFN_vkGetImageMemoryRequirements2KHR".handle("vkGetImageMemoryRequirements2KHR", "")
    nullable.."PFN_vkBindBufferMemory2KHR".handle("vkBindBufferMemory2KHR", "")
    nullable.."PFN_vkBindImageMemory2KHR".handle("vkBindImageMemory2KHR", "")
    nullable.."PFN_vkGetPhysicalDeviceMemoryProperties2KHR".handle("vkGetPhysicalDeviceMemoryProperties2KHR", "")

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
            .vkGetPhysicalDeviceMemoryProperties2KHR(ic.vkGetPhysicalDeviceMemoryProperties2 != NULL ? ic.vkGetPhysicalDeviceMemoryProperties2 : ic.vkGetPhysicalDeviceMemoryProperties2KHR);
        return this;
    }""")
}

val VmaRecordSettings = struct(Module.VMA, "VmaRecordSettings") {
    documentation = "Parameters for recording calls to VMA functions. To be used in ##VmaAllocatorCreateInfo{@code ::pRecordSettings}."

    VmaRecordFlags("flags", "flags for recording").links("RECORD_\\w+")
    charASCII.const.p(
        "pFilePath",
        """
        path to the file that should be written by the recording.

        Suggested extension: "csv". If the file already exists, it will be overwritten. It will be opened for the whole time {@code VmaAllocator} object is
        alive. If opening this file fails, creation of the whole allocator object fails.
        """
    )
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
    uint32_t(
        "frameInUseCount",
        """
        Maximum number of additional frames that are in use at the same time as current frame.

        This value is used only when you make allocations with #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT flag. Such allocation cannot become lost if
        {@code allocation.lastUseFrameIndex >= allocator.currentFrameIndex - frameInUseCount}.

        For example, if you double-buffer your command buffers, so resources used for rendering in previous frame may still be in use by the GPU at the moment
        you allocate resources needed for the current frame, set this value to 1.

        If you want to allow any allocations other than used in the current frame to become lost, set this value to 0.
        """
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
    nullable..VmaRecordSettings.const.p(
        "pRecordSettings",
        """
        parameters for recording of VMA calls. Can be null.

        If not null, it enables recording of calls to VMA functions to a file. If support for recording is not enabled using {@code VMA_RECORDING_ENABLED}
        macro, creation of the allocator object fails with {@code VK_ERROR_FEATURE_NOT_PRESENT}.
        """
    )
    nullable..VkInstance(
        "instance",
        """
        Optional handle to Vulkan instance object.

        Optional, can be null. Must be set if #ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT flas is used or if {@code vulkanApiVersion >= VK_MAKE_VERSION(1, 1, 0)}.
        """
    )
    uint32_t(
        "vulkanApiVersion",
        """
        Optional. The highest version of Vulkan that the application is designed to use.

        It must be a value in the format as created by macro {@code VK_MAKE_VERSION} or a constant like: {@code VK_API_VERSION_1_1},
        {@code VK_API_VERSION_1_0}. The patch version number specified is ignored. Only the major and minor versions are considered. It must be less or equal
        (preferably equal) to value as passed to {@code vkCreateInstance} as {@code VkApplicationInfo::apiVersion}. Only versions 1.0 and 1.1 are supported by
        the current implementation.
    
        Leaving it initialized to zero is equivalent to {@code VK_API_VERSION_1_0}.
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

        It might be greater than {@code blockBytes} if there are some allocations in lost state, as they account to this value as well.
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

        Set to 0 if no additional flags are prefered. If {@code pool} is not null, this member is ignored.
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
}

val VmaPoolCreateInfo = struct(Module.VMA, "VmaPoolCreateInfo") {
    documentation = "Describes parameter of created {@code VmaPool}."

    uint32_t("memoryTypeIndex", "Vulkan memory type index to allocate this pool from")
    VmaPoolCreateFlags("flags", "Use combination of {@code VmaPoolCreateFlagBits}.").links("POOL_CREATE_\\w+", LinkMode.BITFIELD)
    VkDeviceSize(
        "blockSize",
        """
        size of a single {@code VkDeviceMemory} block to be allocated as part of this pool, in bytes. Optional.

        Specify nonzero to set explicit, constant size of memory blocks used by this pool. Leave 0 to use default and let the library manage block sizes
        automatically. Sizes of particular blocks may vary.
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
    uint32_t(
        "frameInUseCount",
        """
        maximum number of additional frames that are in use at the same time as current frame.

        This value is used only when you make allocations with #ALLOCATION_CREATE_CAN_BECOME_LOST_BIT flag. Such allocation cannot become  lost if
        {@code allocation.lastUseFrameIndex >= allocator.currentFrameIndex - frameInUseCount}.

        For example, if you double-buffer your command buffers, so resources used for rendering in previous frame may still be in use by the GPU at the moment
        you allocate resources needed for the current frame, set this value to 1.

        If you want to allow any allocations other than used in the current frame to become lost, set this value to 0.
        """
    )
}

val VmaPoolStats = struct(Module.VMA, "VmaPoolStats", mutable = false) {
    documentation = "Describes parameter of existing {@code VmaPool}."
    VkDeviceSize("size", "total amount of {@code VkDeviceMemory} allocated from Vulkan for this pool, in bytes")
    VkDeviceSize("unusedSize", "total number of bytes in the pool not used by any {@code VmaAllocation}")
    size_t("allocationCount", "number of {@code VmaAllocation} objects created from this pool that were not destroyed or lost")
    size_t("unusedRangeCount", "number of continuous memory ranges in the pool not used by any {@code VmaAllocation}")
    VkDeviceSize(
        "unusedRangeSizeMax",
        """
        size of the largest continuous free memory region available for new allocation.

        Making a new allocation of that size is not guaranteed to succeed because of possible additional margin required to respect alignment and buffer/imag
        granularity.
        """
    )
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

        It can change after call to #Defragment() if this allocation is passed to the function, or if allocation is lost.

        If the allocation is lost, it is equal to {@code VK_NULL_HANDLE}.
        """
    )
    VkDeviceSize(
        "offset",
        """
        offset into {@code deviceMemory} object to the beginning of this allocation, in bytes. ({@code deviceMemory}, {@code offset}) pair is unique to this
        allocation.

        It can change after call to #Defragment() if this allocation is passed to the function, or if allocation is lost.
        """
    )
    VkDeviceSize(
        "size",
        """
        size of this allocation, in bytes.

        It never changes, unless allocation is lost.
        """
    )
    nullable..opaque_p(
        "pMappedData",
        """
        pointer to the beginning of this allocation as mapped data.

        If the allocation hasn't been mapped using #MapMemory() and hasn't been created with #ALLOCATION_CREATE_MAPPED_BIT flag, this value null.

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
    /** \brief
    */
    VmaAllocation.p(
        "pAllocations",
        """
        Pointer to array of allocations that can be defragmented.

        The array should have {@code allocationCount} elements. The array should not contain nulls. Elements in the array should be unique - same allocation
        cannot occur twice. It is safe to pass allocations that are in the lost state - they are ignored. All allocations not present in this array are
        considered non-moveable during this defragmentation.
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
    nullable..VmaPool.p(
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
        Maximum total numbers of bytes that can be copied while moving allocations to different places using transfers on CPU side, like {@code memcpy()},
        {@code memmove()}.

        {@code VK_WHOLE_SIZE} means no limit.
        """
    )
    uint32_t(
        "maxCpuAllocationsToMove",
        """
        Maximum number of allocations that can be moved to a different place using transfers on CPU side, like {@code memcpy()}, {@code memmove()}.

        {@code UINT32_MAX} means no limit.
        """
    )
    VkDeviceSize(
        "maxGpuBytesToMove",
        """
        Maximum total numbers of bytes that can be copied while moving allocations to different places using transfers on GPU side, posted to
        {@code commandBuffer}.

        {@code VK_WHOLE_SIZE} means no limit.
        """
    )
    uint32_t(
        "maxGpuAllocationsToMove",
        """
        Maximum number of allocations that can be moved to a different place using transfers on GPU side, posted to {@code commandBuffer}.

        {@code UINT32_MAX} means no limit.
        """
    )
    nullable..VkCommandBuffer(
        "commandBuffer",
        """
        Optional. Command buffer where GPU copy commands will be posted.

        If not null, it must be a valid command buffer handle that supports Transfer queue type. It must be in the recording state and outside of a render pass
        instance. You need to submit it and make sure it finished execution before calling #DefragmentationEnd().

        Passing null means that only CPU defragmentation will be performed.
        """
    )
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
    uint32_t("allocationsMoved", "tumber of allocations that have been moved to different places")
    uint32_t("deviceMemoryBlocksFreed", "number of empty {@code VkDeviceMemory} objects that have been released to the system")
}