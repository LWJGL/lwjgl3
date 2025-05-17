/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vma.templates

import org.lwjgl.generator.*
import vma.*
import vulkan.*

val VMA = "Vma".nativeClass(Module.VMA, "Vma", prefix = "VMA") {
    nativeDirective(
        """#include "lwjgl_malloc.h"
DISABLE_WARNINGS()
#ifdef __clang__
    _Pragma("GCC diagnostic ignored \"-Wnullability-completeness\"")
#endif
#define VMA_IMPLEMENTATION
#define VMA_STATIC_VULKAN_FUNCTIONS 0
#define VMA_DYNAMIC_VULKAN_FUNCTIONS 0
#define VMA_SYSTEM_ALIGNED_MALLOC(size, alignment) org_lwjgl_aligned_alloc((alignment), (size))
#define VMA_SYSTEM_ALIGNED_FREE(ptr) org_lwjgl_aligned_free(ptr)
#define VMA_VULKAN_VERSION 1004000
#define VMA_DEDICATED_ALLOCATION 1
#define VMA_BIND_MEMORY2 1
#define VMA_MEMORY_BUDGET 1
#define VMA_BUFFER_DEVICE_ADDRESS 1
#define VMA_MEMORY_PRIORITY 1
#define VMA_EXTERNAL_MEMORY 1
#ifdef LWJGL_WINDOWS
    #define VMA_EXTERNAL_MEMORY_WIN32 1
    #define VK_USE_PLATFORM_WIN32_KHR 1
#endif
#define VMA_KHR_MAINTENANCE4 1
#define VMA_KHR_MAINTENANCE5 1
#include "vk_mem_alloc.h"
ENABLE_WARNINGS()"""
    )
    javaImport("org.lwjgl.vulkan.*")

    cpp = true

    EnumConstant(
        "ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT".enum(0x00000001),
        "ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT".enum(0x00000002),
        "ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT".enum(0x00000004),
        "ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT".enum(0x00000008),
        "ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT".enum(0x00000010),
        "ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT".enum(0x00000020),
        "ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT".enum(0x00000040),
        "ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT".enum(0x00000080),
        "ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT".enum(0x00000100),
        "ALLOCATOR_CREATE_KHR_EXTERNAL_MEMORY_WIN32_BIT".enum(0x00000200)
    )

    EnumConstant(
        "MEMORY_USAGE_UNKNOWN".enum("0"),
        "MEMORY_USAGE_GPU_ONLY".enum,
        "MEMORY_USAGE_CPU_ONLY".enum,
        "MEMORY_USAGE_CPU_TO_GPU".enum,
        "MEMORY_USAGE_GPU_TO_CPU".enum,
        "MEMORY_USAGE_CPU_COPY".enum,
        "MEMORY_USAGE_GPU_LAZILY_ALLOCATED".enum,
        "MEMORY_USAGE_AUTO".enum,
        "MEMORY_USAGE_AUTO_PREFER_DEVICE".enum,
        "MEMORY_USAGE_AUTO_PREFER_HOST".enum
    )

    EnumConstant(
        "ALLOCATION_CREATE_DEDICATED_MEMORY_BIT".enum("0x00000001"),
        "ALLOCATION_CREATE_NEVER_ALLOCATE_BIT".enum("0x00000002"),
        "ALLOCATION_CREATE_MAPPED_BIT".enum("0x00000004"),
        "ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT".enum("0x00000020"),
        "ALLOCATION_CREATE_UPPER_ADDRESS_BIT".enum("0x00000040"),
        "ALLOCATION_CREATE_DONT_BIND_BIT".enum("0x00000080"),
        "ALLOCATION_CREATE_WITHIN_BUDGET_BIT".enum("0x00000100"),
        "ALLOCATION_CREATE_CAN_ALIAS_BIT".enum("0x00000200"),
        "ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT".enum("0x00000400"),
        "ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT".enum("0x00000800"),
        "ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT".enum("0x00001000"),
        "ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT".enum("0x00010000"),
        "ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT".enum("0x00020000"),
        "ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT".enum("0x00040000"),
        "ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT".enum("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT"),
        "VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT".enum("VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT"),
        "ALLOCATION_CREATE_STRATEGY_MASK".enum("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT")
    )

    EnumConstant(
        "POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT".enum(0x00000002),
        "POOL_CREATE_LINEAR_ALGORITHM_BIT".enum(0x00000004),
        "POOL_CREATE_ALGORITHM_MASK".enum("VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT")
    )

    EnumConstant(
        "DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT".enum("0x1"),
        "DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT".enum("0x2"),
        "DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT".enum("0x4"),
        "DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT".enum("0x8"),
        "DEFRAGMENTATION_FLAG_ALGORITHM_MASK".enum("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT")
    )

    EnumConstant(
        "DEFRAGMENTATION_MOVE_OPERATION_COPY".enum("0"),
        "DEFRAGMENTATION_MOVE_OPERATION_IGNORE".enum,
        "DEFRAGMENTATION_MOVE_OPERATION_DESTROY".enum,
    )

    EnumConstant(
        "VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT".enum(0x00000001),
        "VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK".enum("VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT")
    )

    EnumConstant(
        "VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT".enum("VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT"),
        "VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT".enum("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT"),
        "VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT".enum("VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT"),
        "VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT".enum("VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT"),
        "VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK".enum("VMA_ALLOCATION_CREATE_STRATEGY_MASK")
    )

    VkResult(
        "CreateAllocator",

        VmaAllocatorCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaAllocator.p("pAllocator")
    )

    void(
        "DestroyAllocator",

        VmaAllocator("allocator")
    )

    void(
        "GetAllocatorInfo",

        VmaAllocator("allocator"),
        VmaAllocatorInfo.p("pAllocatorInfo")
    )

    void(
        "GetPhysicalDeviceProperties",

        VmaAllocator("allocator"),
        Check(1)..VkPhysicalDeviceProperties.const.p.p("ppPhysicalDeviceProperties")
    )

    void(
        "GetMemoryProperties",

        VmaAllocator("allocator"),
        Check(1)..VkPhysicalDeviceMemoryProperties.const.p.p("ppPhysicalDeviceMemoryProperties")
    )

    void(
        "GetMemoryTypeProperties",

        VmaAllocator("allocator"),
        uint32_t("memoryTypeIndex"),
        Check(1)..VkMemoryPropertyFlags.p("pFlags")
    )

    void(
        "SetCurrentFrameIndex",

        VmaAllocator("allocator"),
        uint32_t("frameIndex")
    )

    void(
        "CalculateStatistics",

        VmaAllocator("allocator"),
        VmaTotalStatistics.p("pStats")
    )

    void(
        "GetHeapBudgets",

        VmaAllocator("allocator"),
        Unsafe..VmaBudget.p("pBudget")
    )

    VkResult(
        "FindMemoryTypeIndex",

        VmaAllocator("allocator"),
        uint32_t("memoryTypeBits"),
        VmaAllocationCreateInfo.const.p("pAllocationCreateInfo"),
        Check(1)..uint32_t.p("pMemoryTypeIndex")
    )

    VkResult(
        "FindMemoryTypeIndexForBufferInfo",

        VmaAllocator("allocator"),
        VkBufferCreateInfo.const.p("pBufferCreateInfo"),
        VmaAllocationCreateInfo.const.p("pAllocationCreateInfo"),
        Check(1)..uint32_t.p("pMemoryTypeIndex")
    )

    VkResult(
        "FindMemoryTypeIndexForImageInfo",

        VmaAllocator("allocator"),
        VkImageCreateInfo.const.p("pImageCreateInfo"),
        VmaAllocationCreateInfo.const.p("pAllocationCreateInfo"),
        Check(1)..uint32_t.p("pMemoryTypeIndex")
    )

    VkResult(
        "CreatePool",

        VmaAllocator("allocator"),
        VmaPoolCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaPool.p("pPool")
    )

    void(
        "DestroyPool",

        VmaAllocator("allocator"),
        VmaPool("pool")
    )

    void(
        "GetPoolStatistics",

        VmaAllocator("allocator"),
        VmaPool("pool"),
        VmaStatistics.p("pPoolStats")
    )

    void(
        "CalculatePoolStatistics",

        VmaAllocator("allocator"),
        VmaPool("pool"),
        VmaDetailedStatistics.p("pPoolStats")
    )

    VkResult(
        "CheckPoolCorruption",

        VmaAllocator("allocator"),
        VmaPool("pool")
    )

    void(
        "GetPoolName",

        VmaAllocator("allocator"),
        VmaPool("pool"),
        Check(1)..charASCII.const.p.p("ppName")
    )

    void(
        "SetPoolName",

        VmaAllocator("allocator"),
        VmaPool("pool"),
        nullable..charASCII.const.p("pName")
    )

    VkResult(
        "AllocateMemory",

        VmaAllocator("allocator"),
        VkMemoryRequirements.const.p("pVkMemoryRequirements"),
        VmaAllocationCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaAllocation.p("pAllocation"),
        nullable..VmaAllocationInfo.p("pAllocationInfo")
    )

    VkResult(
        "AllocateMemoryPages",

        VmaAllocator("allocator"),
        VkMemoryRequirements.const.p("pVkMemoryRequirements"),
        VmaAllocationCreateInfo.const.p("pCreateInfo"),
        AutoSize("pAllocations", "pAllocationInfo")..size_t("allocationCount"),
        Check(1)..VmaAllocation.p("pAllocations"),
        nullable..VmaAllocationInfo.p("pAllocationInfo")
    )

    VkResult(
        "AllocateMemoryForBuffer",

        VmaAllocator("allocator"),
        VkBuffer("buffer"),
        VmaAllocationCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaAllocation.p("pAllocation"),
        nullable..VmaAllocationInfo.p("pAllocationInfo")
    )

    VkResult(
        "AllocateMemoryForImage",

        VmaAllocator("allocator"),
        VkImage("image"),
        VmaAllocationCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaAllocation.p("pAllocation"),
        nullable..VmaAllocationInfo.p("pAllocationInfo")
    )

    void(
        "FreeMemory",

        VmaAllocator("allocator"),
        nullable..VmaAllocation("allocation")
    )

    void(
        "FreeMemoryPages",

        VmaAllocator("allocator"),
        AutoSize("pAllocations")..size_t("allocationCount"),
        VmaAllocation.const.p("pAllocations")
    )

    void(
        "GetAllocationInfo",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VmaAllocationInfo.p("pAllocationInfo")
    )

    void(
        "GetAllocationInfo2",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VmaAllocationInfo2.p("pAllocationInfo")
    )

    void(
        "SetAllocationUserData",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        nullable..opaque_p("pUserData")
    )

    void(
        "SetAllocationName",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        nullable..charUTF8.const.p("pName")
    )

    void(
        "GetAllocationMemoryProperties",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        Check(1)..VkMemoryPropertyFlags.p("pFlags")
    )

    VkResult(
        "GetMemoryWin32Handle",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        nullable.."HANDLE".handle("hTargetProcess"),
        Check(1).."HANDLE".handle.p("pHandle")
    ).ifDirective("def LWJGL_WINDOWS")

    VkResult(
        "MapMemory",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        Check(1)..void.p.p("ppData")
    )

    void(
        "UnmapMemory",

        VmaAllocator("allocator"),
        VmaAllocation("allocation")
    )

    void(
        "FlushAllocation",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkDeviceSize("offset"),
        VkDeviceSize("size")
    )

    void(
        "InvalidateAllocation",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkDeviceSize("offset"),
        VkDeviceSize("size")
    )

    VkResult(
        "FlushAllocations",

        VmaAllocator("allocator"),
        AutoSize(
            "allocations",
            "offsets",
            "sizes"
        )..uint32_t("allocationCount"),
        VmaAllocation.const.p("allocations"),
        nullable..VkDeviceSize.const.p("offsets"),
        nullable..VkDeviceSize.const.p("sizes")
    )

    VkResult(
        "InvalidateAllocations",

        VmaAllocator("allocator"),
        AutoSize(
            "allocations",
            "offsets",
            "sizes"
        )..uint32_t("allocationCount"),
        VmaAllocation.const.p("allocations"),
        nullable..VkDeviceSize.const.p("offsets"),
        nullable..VkDeviceSize.const.p("sizes")
    )

    VkResult(
        "CopyMemoryToAllocation",

        VmaAllocator("allocator"),
        void.const.p("pSrcHostPointer"),
        VmaAllocation("dstAllocation"),
        VkDeviceSize("dstAllocationLocalOffset"),
        AutoSize("pSrcHostPointer")..VkDeviceSize("size")
    )

    VkResult(
        "CopyAllocationToMemory",

        VmaAllocator("allocator"),
        VmaAllocation("srcAllocation"),
        VkDeviceSize("srcAllocationLocalOffset"),
        void.p("pDstHostPointer"),
        AutoSize("pDstHostPointer")..VkDeviceSize("size")
    )

    VkResult(
        "CheckCorruption",

        VmaAllocator("allocator"),
        uint32_t("memoryTypeBits")
    )

    VkResult(
        "BeginDefragmentation",

        VmaAllocator("allocator"),
        VmaDefragmentationInfo.const.p("pInfo"),
        Check(1)..VmaDefragmentationContext.p("pContext")
    )

    void(
        "EndDefragmentation",

        VmaAllocator("allocator"),
        VmaDefragmentationContext("context"),
        nullable..VmaDefragmentationStats.p("pStats")
    )

    VkResult(
        "BeginDefragmentationPass",

        VmaAllocator("allocator"),
        VmaDefragmentationContext("context"),
        VmaDefragmentationPassMoveInfo.p("pInfo")
    )

    VkResult(
        "EndDefragmentationPass",

        VmaAllocator("allocator"),
        VmaDefragmentationContext("context"),
        VmaDefragmentationPassMoveInfo.p("pPassInfo")
    )

    VkResult(
        "BindBufferMemory",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkBuffer("buffer")
    )

    VkResult(
        "BindBufferMemory2",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkDeviceSize("allocationLocalOffset"),
        VkBuffer("buffer"),
        nullable..opaque_const_p("pNext")
    )

    VkResult(
        "BindImageMemory",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkImage("image")
    )

    VkResult(
        "BindImageMemory2",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkDeviceSize("allocationLocalOffset"),
        VkImage("image"),
        nullable..opaque_const_p("pNext")
    )

    val CreateBuffer = VkResult(
        "CreateBuffer",

        VmaAllocator("allocator"),
        VkBufferCreateInfo.const.p("pBufferCreateInfo"),
        VmaAllocationCreateInfo.const.p("pAllocationCreateInfo"),
        Check(1)..VkBuffer.p("pBuffer"),
        Check(1)..VmaAllocation.p("pAllocation"),
        nullable..VmaAllocationInfo.p("pAllocationInfo")
    )

    VkResult(
        "CreateBufferWithAlignment",

        CreateBuffer["allocator"],
        CreateBuffer["pBufferCreateInfo"],
        CreateBuffer["pAllocationCreateInfo"],
        VkDeviceSize("minAlignment"),
        CreateBuffer["pBuffer"],
        CreateBuffer["pAllocation"],
        CreateBuffer["pAllocationInfo"]
    )

    VkResult(
        "CreateAliasingBuffer",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkBufferCreateInfo.const.p("pBufferCreateInfo"),
        Check(1)..VkBuffer.p("pBuffer")
    )

    VkResult(
        "CreateAliasingBuffer2",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkDeviceSize("allocationLocalOffset"),
        VkBufferCreateInfo.const.p("pBufferCreateInfo"),
        Check(1)..VkBuffer.p("pBuffer")
    )

    void(
        "DestroyBuffer",

        VmaAllocator("allocator"),
        VkBuffer("buffer"),
        nullable..VmaAllocation("allocation")
    )

    VkResult(
        "CreateImage",

        VmaAllocator("allocator"),
        VkImageCreateInfo.const.p("pImageCreateInfo"),
        VmaAllocationCreateInfo.const.p("pAllocationCreateInfo"),
        Check(1)..VkImage.p("pImage"),
        Check(1)..VmaAllocation.p("pAllocation"),
        nullable..VmaAllocationInfo.p("pAllocationInfo")
    )

    VkResult(
        "CreateAliasingImage",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkImageCreateInfo.const.p("pImageCreateInfo"),
        Check(1)..VkImage.p("pImage")
    )

    ///
    VkResult(
        "CreateAliasingImage2",

        VmaAllocator("allocator"),
        VmaAllocation("allocation"),
        VkDeviceSize("allocationLocalOffset"),
        VkImageCreateInfo.const.p("pImageCreateInfo"),
        Check(1)..VkImage.p("pImage")
    )

    void(
        "DestroyImage",

        VmaAllocator("allocator"),
        VkImage("image"),
        nullable..VmaAllocation("allocation")
    )

    VkResult(
        "CreateVirtualBlock",

        VmaVirtualBlockCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaVirtualBlock.p("pVirtualBlock")
    )

    void(
        "DestroyVirtualBlock",

        VmaVirtualBlock("virtualBlock")
    )

    VkBool32(
        "IsVirtualBlockEmpty",

        VmaVirtualBlock("virtualBlock")
    )

    void(
        "GetVirtualAllocationInfo",

        VmaVirtualBlock("virtualBlock"),
        VmaVirtualAllocation("allocation"),
        VmaVirtualAllocationInfo.p("pVirtualAllocInfo")
    )

    VkResult(
        "VirtualAllocate",

        VmaVirtualBlock("virtualBlock"),
        VmaVirtualAllocationCreateInfo.const.p("pCreateInfo"),
        Check(1)..VmaVirtualAllocation.p("pAllocation"),
        Check(1)..nullable..VkDeviceSize.p("pOffset")
    )

    void(
        "VirtualFree",

        VmaVirtualBlock("virtualBlock"),
        nullable..VmaVirtualAllocation("allocation")
    )

    void(
        "ClearVirtualBlock",

        VmaVirtualBlock("virtualBlock")
    )

    void(
        "SetVirtualAllocationUserData",

        VmaVirtualBlock("virtualBlock"),
        VmaVirtualAllocation("allocation"),
        opaque_p("pUserData")
    )

    void(
        "GetVirtualBlockStatistics",

        VmaVirtualBlock("virtualBlock"),
        VmaStatistics.p("pStats")
    )

    void(
        "CalculateVirtualBlockStatistics",

        VmaVirtualBlock("virtualBlock"),
        VmaDetailedStatistics.p("pStats")
    )

    void(
        "BuildVirtualBlockStatsString",

        VmaVirtualBlock("virtualBlock"),
        Check(1)..charUTF8.p.p("ppStatsString"),
        VkBool32("detailedMap")
    )

    void(
        "FreeVirtualBlockStatsString",

        VmaVirtualBlock("virtualBlock"),
        Unsafe..char.p("pStatsString")
    )

    void(
        "BuildStatsString",

        VmaAllocator("allocator"),
        Check(1)..charASCII.p.p("ppStatsString"),
        VkBool32("detailedMap")
    )

    void(
        "FreeStatsString",

        VmaAllocator("allocator"),
        Unsafe..char.p("pStatsString")
    )
}