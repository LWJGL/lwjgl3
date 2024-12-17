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
val VmaDefragmentationMoveOperation = "VmaDefragmentationMoveOperation".enumType
val VmaMemoryUsage = "VmaMemoryUsage".enumType
val VmaPoolCreateFlags = "VmaPoolCreateFlags".enumType
val VmaVirtualAllocationCreateFlags = typedef(VkFlags, "VmaVirtualAllocationCreateFlags")
val VmaVirtualBlockCreateFlagBits = "VmaVirtualBlockCreateFlagBits".enumType

val PFN_vmaAllocateDeviceMemoryFunction = Module.VMA.callback {
    void(
        "VmaAllocateDeviceMemoryFunction",

        VmaAllocator("allocator"),
        uint32_t("memoryType"),
        VkDeviceMemory("memory"),
        VkDeviceSize("size"),
        nullable..opaque_p("pUserData"),

        nativeType = "PFN_vmaAllocateDeviceMemoryFunction"
    ) {}
}

val PFN_vmaFreeDeviceMemoryFunction = Module.VMA.callback {
    void(
        "VmaFreeDeviceMemoryFunction",

        VmaAllocator("allocator"),
        uint32_t("memoryType"),
        VkDeviceMemory("memory"),
        VkDeviceSize("size"),
        nullable..opaque_p("pUserData"),

        nativeType = "PFN_vmaFreeDeviceMemoryFunction"
    ) {}
}

val VmaDeviceMemoryCallbacks = struct(Module.VMA, "VmaDeviceMemoryCallbacks") {
    nullable..PFN_vmaAllocateDeviceMemoryFunction("pfnAllocate")
    nullable..PFN_vmaFreeDeviceMemoryFunction("pfnFree")
    nullable..opaque_p("pUserData")
}

val VmaVulkanFunctions = struct(Module.VMA, "VmaVulkanFunctions", skipBuffer = true) {
    javaImport("org.lwjgl.vulkan.*")

    nullable.."PFN_vkGetInstanceProcAddr".handle("vkGetInstanceProcAddr")
    nullable.."PFN_vkGetDeviceProcAddr".handle("vkGetDeviceProcAddr")
    "PFN_vkGetPhysicalDeviceProperties".handle("vkGetPhysicalDeviceProperties")
    "PFN_vkGetPhysicalDeviceMemoryProperties".handle("vkGetPhysicalDeviceMemoryProperties")
    "PFN_vkAllocateMemory".handle("vkAllocateMemory")
    "PFN_vkFreeMemory".handle("vkFreeMemory")
    "PFN_vkMapMemory".handle("vkMapMemory")
    "PFN_vkUnmapMemory".handle("vkUnmapMemory")
    "PFN_vkFlushMappedMemoryRanges".handle("vkFlushMappedMemoryRanges")
    "PFN_vkInvalidateMappedMemoryRanges".handle("vkInvalidateMappedMemoryRanges")
    "PFN_vkBindBufferMemory".handle("vkBindBufferMemory")
    "PFN_vkBindImageMemory".handle("vkBindImageMemory")
    "PFN_vkGetBufferMemoryRequirements".handle("vkGetBufferMemoryRequirements")
    "PFN_vkGetImageMemoryRequirements".handle("vkGetImageMemoryRequirements")
    "PFN_vkCreateBuffer".handle("vkCreateBuffer")
    "PFN_vkDestroyBuffer".handle("vkDestroyBuffer")
    "PFN_vkCreateImage".handle("vkCreateImage")
    "PFN_vkDestroyImage".handle("vkDestroyImage")
    "PFN_vkCmdCopyBuffer".handle("vkCmdCopyBuffer")
    nullable.."PFN_vkGetBufferMemoryRequirements2KHR".handle("vkGetBufferMemoryRequirements2KHR")
    nullable.."PFN_vkGetImageMemoryRequirements2KHR".handle("vkGetImageMemoryRequirements2KHR")
    nullable.."PFN_vkBindBufferMemory2KHR".handle("vkBindBufferMemory2KHR")
    nullable.."PFN_vkBindImageMemory2KHR".handle("vkBindImageMemory2KHR")
    nullable.."PFN_vkGetPhysicalDeviceMemoryProperties2KHR".handle("vkGetPhysicalDeviceMemoryProperties2KHR")
    nullable.."PFN_vkGetDeviceBufferMemoryRequirementsKHR".handle("vkGetDeviceBufferMemoryRequirements")
    nullable.."PFN_vkGetDeviceImageMemoryRequirementsKHR".handle("vkGetDeviceImageMemoryRequirements")
    nullable.."PFN_vkGetMemoryWin32HandleKHR".handle("vkGetMemoryWin32HandleKHR")

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
            .vkGetDeviceImageMemoryRequirements(dc.vkGetDeviceImageMemoryRequirements != NULL ? dc.vkGetDeviceImageMemoryRequirements : dc.vkGetDeviceImageMemoryRequirementsKHR)
            .vkGetMemoryWin32HandleKHR(dc.vkGetMemoryWin32HandleKHR);
        return this;
    }""")
}

val VmaAllocatorCreateInfo = struct(Module.VMA, "VmaAllocatorCreateInfo", skipBuffer = true) {
    javaImport("org.lwjgl.vulkan.*")

    VmaAllocatorCreateFlags("flags")
    VkPhysicalDevice("physicalDevice")
    VkDevice("device")
    VkDeviceSize("preferredLargeHeapBlockSize")
    nullable..VkAllocationCallbacks.const.p("pAllocationCallbacks")
    nullable..VmaDeviceMemoryCallbacks.const.p("pDeviceMemoryCallbacks")
    nullable..VkDeviceSize.const.p("pHeapSizeLimit")
    VmaVulkanFunctions.const.p("pVulkanFunctions")
    VkInstance("instance")
    uint32_t("vulkanApiVersion")
    nullable..VkExternalMemoryHandleTypeFlagsKHR.const.p("pTypeExternalMemoryHandleTypes")
}

val VmaAllocatorInfo = struct(Module.VMA, "VmaAllocatorInfo", mutable = false) {
    VkInstance("instance")
    VkPhysicalDevice("physicalDevice")
    VkDevice("device")
}

val VmaStatistics = struct(Module.VMA, "VmaStatistics", mutable = false) {
    uint32_t("blockCount")
    uint32_t("allocationCount")
    VkDeviceSize("blockBytes")
    VkDeviceSize("allocationBytes")
}

val VmaDetailedStatistics = struct(Module.VMA, "VmaDetailedStatistics", mutable = false) {
    VmaStatistics("statistics")
    uint32_t("unusedRangeCount")
    VkDeviceSize("allocationSizeMin")
    VkDeviceSize("allocationSizeMax")
    VkDeviceSize("unusedRangeSizeMin")
    VkDeviceSize("unusedRangeSizeMax")
}

private const val VK_MAX_MEMORY_TYPES = 32
private const val VK_MAX_MEMORY_HEAPS = 16

val VmaTotalStatistics = struct(Module.VMA, "VmaTotalStatistics", mutable = false) {
    VmaDetailedStatistics("memoryType")[VK_MAX_MEMORY_TYPES]
    VmaDetailedStatistics("memoryHeap")[VK_MAX_MEMORY_HEAPS]
    VmaDetailedStatistics("total")
}

val VmaBudget = struct(Module.VMA, "VmaBudget", mutable = false) {
    VmaStatistics("statistics")
    VkDeviceSize("usage")
    VkDeviceSize("budget")
}

val VmaAllocationCreateInfo = struct(Module.VMA, "VmaAllocationCreateInfo") {
    VmaAllocationCreateFlags("flags")
    VmaMemoryUsage("usage")
    VkMemoryPropertyFlags("requiredFlags")
    VkMemoryPropertyFlags("preferredFlags")
    uint32_t("memoryTypeBits")
    nullable..VmaPool("pool")
    nullable..opaque_p("pUserData")
    float("priority")
}

val VmaPoolCreateInfo = struct(Module.VMA, "VmaPoolCreateInfo") {
    javaImport("org.lwjgl.vulkan.*")

    uint32_t("memoryTypeIndex")
    VmaPoolCreateFlags("flags")
    VkDeviceSize("blockSize")
    size_t("minBlockCount")
    size_t("maxBlockCount")
    float("priority")
    VkDeviceSize("minAllocationAlignment")
    PointerSetter(
        *VkMemoryAllocateInfo.definition["pNext"].get<PointerSetter>().types,
        prepend = true,
        targetSetter = "pNext"
    )..nullable..opaque_p("pMemoryAllocateNext")
}

val VmaAllocationInfo = struct(Module.VMA, "VmaAllocationInfo", mutable = false) {
    uint32_t("memoryType")
    VkDeviceMemory("deviceMemory")
    VkDeviceSize("offset")
    VkDeviceSize("size")
    nullable..opaque_p("pMappedData")
    nullable..opaque_p("pUserData")
    nullable..charUTF8.const.p("pName")
}

val VmaAllocationInfo2 = struct(Module.VMA, "VmaAllocationInfo2", mutable = false) {
    VmaAllocationInfo("allocationInfo")
    VkDeviceSize("blockSize")
    VkBool32("dedicatedMemory")
}

val PFN_vmaCheckDefragmentationBreakFunction = Module.VMA.callback {
    VkBool32(
        "VmaCheckDefragmentationBreakFunction",

        nullable..opaque_p("pUserData"),

        nativeType = "PFN_vmaCheckDefragmentationBreakFunction"
    ) {
    }
}

val VmaDefragmentationInfo = struct(Module.VMA, "VmaDefragmentationInfo") {
    javaImport("org.lwjgl.vulkan.*")

    VmaDefragmentationFlags("flags")
    nullable..VmaPool("pool")
    VkDeviceSize("maxBytesPerPass")
    uint32_t("maxAllocationsPerPass")
    nullable..PFN_vmaCheckDefragmentationBreakFunction("pfnBreakCallback")
    nullable..opaque_p("pBreakCallbackUserData")
}

val VmaDefragmentationMove = struct(Module.VMA, "VmaDefragmentationMove")  {
    VmaDefragmentationMoveOperation("operation")
    VmaAllocation("srcAllocation")
    VmaAllocation("dstTmpAllocation")
}

val VmaDefragmentationPassMoveInfo = struct(Module.VMA, "VmaDefragmentationPassMoveInfo") {
    AutoSize("pMoves")..uint32_t("moveCount")
    nullable..VmaDefragmentationMove.p("pMoves")
}

val VmaDefragmentationStats = struct(Module.VMA, "VmaDefragmentationStats", mutable = false) {
    VkDeviceSize("bytesMoved")
    VkDeviceSize("bytesFreed")
    uint32_t("allocationsMoved")
    uint32_t("deviceMemoryBlocksFreed")
}

val VmaVirtualBlockCreateInfo = struct(Module.VMA, "VmaVirtualBlockCreateInfo") {
    javaImport("org.lwjgl.vulkan.*")

    VkDeviceSize("size")
    VmaVirtualBlockCreateFlagBits("flags")
    nullable..VkAllocationCallbacks.const.p("pAllocationCallbacks")
}

val VmaVirtualAllocationCreateInfo = struct(Module.VMA, "VmaVirtualAllocationCreateInfo") {
    VkDeviceSize("size")
    VkDeviceSize("alignment")
    VmaVirtualAllocationCreateFlags("flags")
    nullable..opaque_p("pUserData")
}

val VmaVirtualAllocationInfo = struct(Module.VMA, "VmaVirtualAllocationInfo", mutable = false) {
    VkDeviceSize("offset")
    VkDeviceSize("size")
    nullable..opaque_p("pUserData")
}
