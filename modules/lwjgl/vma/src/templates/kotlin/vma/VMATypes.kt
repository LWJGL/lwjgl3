/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vma

import org.lwjgl.generator.*
import vulkan.*

const val VMA_LIBRARY = "LibVma.initialize();"

fun config() {
    packageInfo(
        Module.VMA,
        """
        Contains bindings to ${url("https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator", "Vulkan")}, an easy to integrate Vulkan memory
        allocation library.

        <h4>Problem</h4>

        Memory allocation and resource (buffer and image) creation in Vulkan is difficult (comparing to older graphics API-s, like D3D11 or OpenGL) for several
        reasons:
        ${ul(
            "It requires a lot of boilerplate code, just like everything else in Vulkan, because it is a low-level and high-performance API.",
            """
            There is additional level of indirection: {@code VkDeviceMemory} is allocated separately from creating {@code VkBuffer/VkImage} and they must be
            bound together. The binding cannot be changed later - resource must be recreated.
            """,
            "Driver must be queried for supported memory heaps and memory types. Different IHVs provide different types of it.",
            "It is recommended practice to allocate bigger chunks of memory and assign parts of them to particular resources."
        )}

        <h4>Features</h4>

        This library can help game developers to manage memory allocations and resource creation by offering some higher-level functions. Features of the
        library are divided into several layers, low level to high level:

        ${ol(
            """
            Functions that help to choose correct and optimal memory type based on intended usage of the memory.

            - Required or preferred traits of the memory are expressed using higher-level description comparing to Vulkan flags.
            """,
            """
            Functions that allocate memory blocks, reserve and return parts of them (`VkDeviceMemory` + offset + size) to the user.

            - Library keeps track of allocated memory blocks, used and unused ranges inside them, finds best matching unused ranges for new allocations, takes
            all the rules of alignment and buffer/image granularity into consideration.
            """,
            "Functions that can create an image/buffer, allocate memory for it and bind them together - all in one call."
        )}

        Additional features:

        ${ul(
            "Thread-safety: Library is designed to be used by multithreaded code.",
            "Configuration: Fill optional members of CreateInfo structure to provide custom CPU memory allocator and other parameters.",
            """
            Customization: Predefine appropriate macros to provide your own implementation of all external facilities used by the library, from assert, mutex,
            and atomic, to vector and linked list.
            """,
            """
            Support memory mapping, reference-counted internally. Support for persistently mapped memory: Just allocate with appropriate flag and you get
            access to mapped pointer.
            """,
            "Custom memory pools: Create a pool with desired parameters (e.g. fixed or limited maximum size) and allocate memory out of it.",
            "Support for VK_KHR_dedicated_allocation extension: Enable it and it will be used automatically by the library.",
            "Defragmentation: Call one function and let the library move data around to free some memory blocks and make your allocations better compacted.",
            """
            Lost allocations: Allocate memory with appropriate flags and let the library remove allocations that are not used for many frames to make room for
            new ones.
            """,
            """
            Statistics: Obtain detailed statistics about the amount of memory used, unused, number of allocated blocks, number of allocations etc. - globally,
            per memory heap, and per memory type.
            """,
            "Debug annotations: Associate string with name or opaque pointer to your own data with every allocation.",
            "JSON dump: Obtain a string in JSON format with detailed map of internal state, including list of allocations and gaps between them."
        )}
        """
    )

    Generator.registerLibraryInit(Module.VMA, "LibVma", "vma", setupAllocator = true, cpp = true)
}

val VmaAllocator = "VmaAllocator".handle
val VmaAllocation = "VmaAllocation".handle
val VmaPool = "VmaPool".handle

val VmaRecordFlags = "VmaRecordFlags".enumType
val VmaAllocatorCreateFlags = "VmaAllocatorCreateFlags".enumType
val VmaAllocationCreateFlags = "VmaAllocationCreateFlags".enumType
val VmaMemoryUsage = "VmaMemoryUsage".enumType
val VmaPoolCreateFlags = "VmaPoolCreateFlags".enumType

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
    nullable.."PFN_vkGetBufferMemoryRequirements2KHR".handle("vkGetBufferMemoryRequirements2KHR", "")
    nullable.."PFN_vkGetImageMemoryRequirements2KHR".handle("vkGetImageMemoryRequirements2KHR", "")

    customMethod("""
    /**
     * Helper method that populates this struct with required Vulkan function pointers from the specified Vulkan instance and device.
     *
     * @param instance         a Vulkan instance
     * @param device           a Vulkan device
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
            .vkGetBufferMemoryRequirements2KHR(dc.vkGetBufferMemoryRequirements2 != NULL ? dc.vkGetBufferMemoryRequirements2 : dc.vkGetBufferMemoryRequirements2KHR)
            .vkGetImageMemoryRequirements2KHR(dc.vkGetImageMemoryRequirements2 != NULL ? dc.vkGetImageMemoryRequirements2 : dc.vkGetImageMemoryRequirements2KHR);
        return this;
    }""")
}

val VmaRecordSettings = struct(Module.VMA, "VmaRecordSettings") {
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

val VmaDefragmentationInfo = struct(Module.VMA, "VmaDefragmentationInfo") {
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