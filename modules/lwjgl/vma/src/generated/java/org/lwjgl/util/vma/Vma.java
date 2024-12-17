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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

public class Vma {

    static { LibVma.initialize(); }

    public static final int
        VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT    = 0x1,
        VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT   = 0x2,
        VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT           = 0x4,
        VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT          = 0x8,
        VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 0x10,
        VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT      = 0x20,
        VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT        = 0x40,
        VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT           = 0x80,
        VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT           = 0x100,
        VMA_ALLOCATOR_CREATE_KHR_EXTERNAL_MEMORY_WIN32_BIT  = 0x200;

    public static final int
        VMA_MEMORY_USAGE_UNKNOWN              = 0,
        VMA_MEMORY_USAGE_GPU_ONLY             = 1,
        VMA_MEMORY_USAGE_CPU_ONLY             = 2,
        VMA_MEMORY_USAGE_CPU_TO_GPU           = 3,
        VMA_MEMORY_USAGE_GPU_TO_CPU           = 4,
        VMA_MEMORY_USAGE_CPU_COPY             = 5,
        VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6,
        VMA_MEMORY_USAGE_AUTO                 = 7,
        VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE   = 8,
        VMA_MEMORY_USAGE_AUTO_PREFER_HOST     = 9;

    public static final int
        VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT                   = 0x00000001,
        VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT                     = 0x00000002,
        VMA_ALLOCATION_CREATE_MAPPED_BIT                             = 0x00000004,
        VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT              = 0x00000020,
        VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT                      = 0x00000040,
        VMA_ALLOCATION_CREATE_DONT_BIND_BIT                          = 0x00000080,
        VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT                      = 0x00000100,
        VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT                          = 0x00000200,
        VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT       = 0x00000400,
        VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT                 = 0x00000800,
        VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 0x00001000,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT                = 0x00010000,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT                  = 0x00020000,
        VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT                = 0x00040000,
        VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT                  = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT,
        VMA_VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT             = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT,
        VMA_ALLOCATION_CREATE_STRATEGY_MASK                          = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT;

    public static final int
        VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 0x2,
        VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT                = 0x4,
        VMA_POOL_CREATE_ALGORITHM_MASK                      = VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT;

    public static final int
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT      = 0x1,
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT  = 0x2,
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT      = 0x4,
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 0x8,
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK          = VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT;

    public static final int
        VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY    = 0,
        VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE  = 1,
        VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY = 2;

    public static final int
        VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 0x1,
        VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK       = VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT;

    public static final int
        VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT       = VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT   = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT,
        VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK           = VMA_ALLOCATION_CREATE_STRATEGY_MASK;

    protected Vma() {
        throw new UnsupportedOperationException();
    }

    // --- [ vmaCreateAllocator ] ---

    /** {@code VkResult vmaCreateAllocator(VmaAllocatorCreateInfo const * pCreateInfo, VmaAllocator * pAllocator)} */
    public static native int nvmaCreateAllocator(long pCreateInfo, long pAllocator);

    /** {@code VkResult vmaCreateAllocator(VmaAllocatorCreateInfo const * pCreateInfo, VmaAllocator * pAllocator)} */
    @NativeType("VkResult")
    public static int vmaCreateAllocator(@NativeType("VmaAllocatorCreateInfo const *") VmaAllocatorCreateInfo pCreateInfo, @NativeType("VmaAllocator *") PointerBuffer pAllocator) {
        if (CHECKS) {
            check(pAllocator, 1);
            VmaAllocatorCreateInfo.validate(pCreateInfo.address());
        }
        return nvmaCreateAllocator(pCreateInfo.address(), memAddress(pAllocator));
    }

    // --- [ vmaDestroyAllocator ] ---

    /** {@code void vmaDestroyAllocator(VmaAllocator allocator)} */
    public static native void nvmaDestroyAllocator(long allocator);

    /** {@code void vmaDestroyAllocator(VmaAllocator allocator)} */
    public static void vmaDestroyAllocator(@NativeType("VmaAllocator") long allocator) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaDestroyAllocator(allocator);
    }

    // --- [ vmaGetAllocatorInfo ] ---

    /** {@code void vmaGetAllocatorInfo(VmaAllocator allocator, VmaAllocatorInfo * pAllocatorInfo)} */
    public static native void nvmaGetAllocatorInfo(long allocator, long pAllocatorInfo);

    /** {@code void vmaGetAllocatorInfo(VmaAllocator allocator, VmaAllocatorInfo * pAllocatorInfo)} */
    public static void vmaGetAllocatorInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocatorInfo *") VmaAllocatorInfo pAllocatorInfo) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaGetAllocatorInfo(allocator, pAllocatorInfo.address());
    }

    // --- [ vmaGetPhysicalDeviceProperties ] ---

    /** {@code void vmaGetPhysicalDeviceProperties(VmaAllocator allocator, VkPhysicalDeviceProperties const ** ppPhysicalDeviceProperties)} */
    public static native void nvmaGetPhysicalDeviceProperties(long allocator, long ppPhysicalDeviceProperties);

    /** {@code void vmaGetPhysicalDeviceProperties(VmaAllocator allocator, VkPhysicalDeviceProperties const ** ppPhysicalDeviceProperties)} */
    public static void vmaGetPhysicalDeviceProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VkPhysicalDeviceProperties const **") PointerBuffer ppPhysicalDeviceProperties) {
        if (CHECKS) {
            check(allocator);
            check(ppPhysicalDeviceProperties, 1);
        }
        nvmaGetPhysicalDeviceProperties(allocator, memAddress(ppPhysicalDeviceProperties));
    }

    // --- [ vmaGetMemoryProperties ] ---

    /** {@code void vmaGetMemoryProperties(VmaAllocator allocator, VkPhysicalDeviceMemoryProperties const ** ppPhysicalDeviceMemoryProperties)} */
    public static native void nvmaGetMemoryProperties(long allocator, long ppPhysicalDeviceMemoryProperties);

    /** {@code void vmaGetMemoryProperties(VmaAllocator allocator, VkPhysicalDeviceMemoryProperties const ** ppPhysicalDeviceMemoryProperties)} */
    public static void vmaGetMemoryProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VkPhysicalDeviceMemoryProperties const **") PointerBuffer ppPhysicalDeviceMemoryProperties) {
        if (CHECKS) {
            check(allocator);
            check(ppPhysicalDeviceMemoryProperties, 1);
        }
        nvmaGetMemoryProperties(allocator, memAddress(ppPhysicalDeviceMemoryProperties));
    }

    // --- [ vmaGetMemoryTypeProperties ] ---

    /** {@code void vmaGetMemoryTypeProperties(VmaAllocator allocator, uint32_t memoryTypeIndex, VkMemoryPropertyFlags * pFlags)} */
    public static native void nvmaGetMemoryTypeProperties(long allocator, int memoryTypeIndex, long pFlags);

    /** {@code void vmaGetMemoryTypeProperties(VmaAllocator allocator, uint32_t memoryTypeIndex, VkMemoryPropertyFlags * pFlags)} */
    public static void vmaGetMemoryTypeProperties(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeIndex, @NativeType("VkMemoryPropertyFlags *") IntBuffer pFlags) {
        if (CHECKS) {
            check(allocator);
            check(pFlags, 1);
        }
        nvmaGetMemoryTypeProperties(allocator, memoryTypeIndex, memAddress(pFlags));
    }

    // --- [ vmaSetCurrentFrameIndex ] ---

    /** {@code void vmaSetCurrentFrameIndex(VmaAllocator allocator, uint32_t frameIndex)} */
    public static native void nvmaSetCurrentFrameIndex(long allocator, int frameIndex);

    /** {@code void vmaSetCurrentFrameIndex(VmaAllocator allocator, uint32_t frameIndex)} */
    public static void vmaSetCurrentFrameIndex(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int frameIndex) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaSetCurrentFrameIndex(allocator, frameIndex);
    }

    // --- [ vmaCalculateStatistics ] ---

    /** {@code void vmaCalculateStatistics(VmaAllocator allocator, VmaTotalStatistics * pStats)} */
    public static native void nvmaCalculateStatistics(long allocator, long pStats);

    /** {@code void vmaCalculateStatistics(VmaAllocator allocator, VmaTotalStatistics * pStats)} */
    public static void vmaCalculateStatistics(@NativeType("VmaAllocator") long allocator, @NativeType("VmaTotalStatistics *") VmaTotalStatistics pStats) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaCalculateStatistics(allocator, pStats.address());
    }

    // --- [ vmaGetHeapBudgets ] ---

    /** {@code void vmaGetHeapBudgets(VmaAllocator allocator, VmaBudget * pBudget)} */
    public static native void nvmaGetHeapBudgets(long allocator, long pBudget);

    /** {@code void vmaGetHeapBudgets(VmaAllocator allocator, VmaBudget * pBudget)} */
    public static void vmaGetHeapBudgets(@NativeType("VmaAllocator") long allocator, @NativeType("VmaBudget *") VmaBudget.Buffer pBudget) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaGetHeapBudgets(allocator, pBudget.address());
    }

    // --- [ vmaFindMemoryTypeIndex ] ---

    /** {@code VkResult vmaFindMemoryTypeIndex(VmaAllocator allocator, uint32_t memoryTypeBits, VmaAllocationCreateInfo const * pAllocationCreateInfo, uint32_t * pMemoryTypeIndex)} */
    public static native int nvmaFindMemoryTypeIndex(long allocator, int memoryTypeBits, long pAllocationCreateInfo, long pMemoryTypeIndex);

    /** {@code VkResult vmaFindMemoryTypeIndex(VmaAllocator allocator, uint32_t memoryTypeBits, VmaAllocationCreateInfo const * pAllocationCreateInfo, uint32_t * pMemoryTypeIndex)} */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndex(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeBits, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndex(allocator, memoryTypeBits, pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaFindMemoryTypeIndexForBufferInfo ] ---

    /** {@code VkResult vmaFindMemoryTypeIndexForBufferInfo(VmaAllocator allocator, VkBufferCreateInfo const * pBufferCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, uint32_t * pMemoryTypeIndex)} */
    public static native int nvmaFindMemoryTypeIndexForBufferInfo(long allocator, long pBufferCreateInfo, long pAllocationCreateInfo, long pMemoryTypeIndex);

    /** {@code VkResult vmaFindMemoryTypeIndexForBufferInfo(VmaAllocator allocator, VkBufferCreateInfo const * pBufferCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, uint32_t * pMemoryTypeIndex)} */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForBufferInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndexForBufferInfo(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaFindMemoryTypeIndexForImageInfo ] ---

    /** {@code VkResult vmaFindMemoryTypeIndexForImageInfo(VmaAllocator allocator, VkImageCreateInfo const * pImageCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, uint32_t * pMemoryTypeIndex)} */
    public static native int nvmaFindMemoryTypeIndexForImageInfo(long allocator, long pImageCreateInfo, long pAllocationCreateInfo, long pMemoryTypeIndex);

    /** {@code VkResult vmaFindMemoryTypeIndexForImageInfo(VmaAllocator allocator, VkImageCreateInfo const * pImageCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, uint32_t * pMemoryTypeIndex)} */
    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForImageInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (CHECKS) {
            check(allocator);
            check(pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pMemoryTypeIndex));
    }

    // --- [ vmaCreatePool ] ---

    /** {@code VkResult vmaCreatePool(VmaAllocator allocator, VmaPoolCreateInfo const * pCreateInfo, VmaPool * pPool)} */
    public static native int nvmaCreatePool(long allocator, long pCreateInfo, long pPool);

    /** {@code VkResult vmaCreatePool(VmaAllocator allocator, VmaPoolCreateInfo const * pCreateInfo, VmaPool * pPool)} */
    @NativeType("VkResult")
    public static int vmaCreatePool(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPoolCreateInfo const *") VmaPoolCreateInfo pCreateInfo, @NativeType("VmaPool *") PointerBuffer pPool) {
        if (CHECKS) {
            check(allocator);
            check(pPool, 1);
        }
        return nvmaCreatePool(allocator, pCreateInfo.address(), memAddress(pPool));
    }

    // --- [ vmaDestroyPool ] ---

    /** {@code void vmaDestroyPool(VmaAllocator allocator, VmaPool pool)} */
    public static native void nvmaDestroyPool(long allocator, long pool);

    /** {@code void vmaDestroyPool(VmaAllocator allocator, VmaPool pool)} */
    public static void vmaDestroyPool(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        nvmaDestroyPool(allocator, pool);
    }

    // --- [ vmaGetPoolStatistics ] ---

    /** {@code void vmaGetPoolStatistics(VmaAllocator allocator, VmaPool pool, VmaStatistics * pPoolStats)} */
    public static native void nvmaGetPoolStatistics(long allocator, long pool, long pPoolStats);

    /** {@code void vmaGetPoolStatistics(VmaAllocator allocator, VmaPool pool, VmaStatistics * pPoolStats)} */
    public static void vmaGetPoolStatistics(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("VmaStatistics *") VmaStatistics pPoolStats) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        nvmaGetPoolStatistics(allocator, pool, pPoolStats.address());
    }

    // --- [ vmaCalculatePoolStatistics ] ---

    /** {@code void vmaCalculatePoolStatistics(VmaAllocator allocator, VmaPool pool, VmaDetailedStatistics * pPoolStats)} */
    public static native void nvmaCalculatePoolStatistics(long allocator, long pool, long pPoolStats);

    /** {@code void vmaCalculatePoolStatistics(VmaAllocator allocator, VmaPool pool, VmaDetailedStatistics * pPoolStats)} */
    public static void vmaCalculatePoolStatistics(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("VmaDetailedStatistics *") VmaDetailedStatistics pPoolStats) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        nvmaCalculatePoolStatistics(allocator, pool, pPoolStats.address());
    }

    // --- [ vmaCheckPoolCorruption ] ---

    /** {@code VkResult vmaCheckPoolCorruption(VmaAllocator allocator, VmaPool pool)} */
    public static native int nvmaCheckPoolCorruption(long allocator, long pool);

    /** {@code VkResult vmaCheckPoolCorruption(VmaAllocator allocator, VmaPool pool)} */
    @NativeType("VkResult")
    public static int vmaCheckPoolCorruption(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        return nvmaCheckPoolCorruption(allocator, pool);
    }

    // --- [ vmaGetPoolName ] ---

    /** {@code void vmaGetPoolName(VmaAllocator allocator, VmaPool pool, char const ** ppName)} */
    public static native void nvmaGetPoolName(long allocator, long pool, long ppName);

    /** {@code void vmaGetPoolName(VmaAllocator allocator, VmaPool pool, char const ** ppName)} */
    public static void vmaGetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const **") PointerBuffer ppName) {
        if (CHECKS) {
            check(allocator);
            check(pool);
            check(ppName, 1);
        }
        nvmaGetPoolName(allocator, pool, memAddress(ppName));
    }

    // --- [ vmaSetPoolName ] ---

    /** {@code void vmaSetPoolName(VmaAllocator allocator, VmaPool pool, char const * pName)} */
    public static native void nvmaSetPoolName(long allocator, long pool, long pName);

    /** {@code void vmaSetPoolName(VmaAllocator allocator, VmaPool pool, char const * pName)} */
    public static void vmaSetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const *") @Nullable ByteBuffer pName) {
        if (CHECKS) {
            check(allocator);
            check(pool);
            checkNT1Safe(pName);
        }
        nvmaSetPoolName(allocator, pool, memAddressSafe(pName));
    }

    /** {@code void vmaSetPoolName(VmaAllocator allocator, VmaPool pool, char const * pName)} */
    public static void vmaSetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const *") @Nullable CharSequence pName) {
        if (CHECKS) {
            check(allocator);
            check(pool);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(pName, true);
            long pNameEncoded = pName == null ? NULL : stack.getPointerAddress();
            nvmaSetPoolName(allocator, pool, pNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vmaAllocateMemory ] ---

    /** {@code VkResult vmaAllocateMemory(VmaAllocator allocator, VkMemoryRequirements const * pVkMemoryRequirements, VmaAllocationCreateInfo const * pCreateInfo, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaAllocateMemory(long allocator, long pVkMemoryRequirements, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /** {@code VkResult vmaAllocateMemory(VmaAllocator allocator, VkMemoryRequirements const * pVkMemoryRequirements, VmaAllocationCreateInfo const * pCreateInfo, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaAllocateMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VkMemoryRequirements const *") VkMemoryRequirements pVkMemoryRequirements, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") @Nullable VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        return nvmaAllocateMemory(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaAllocateMemoryPages ] ---

    /** {@code VkResult vmaAllocateMemoryPages(VmaAllocator allocator, VkMemoryRequirements const * pVkMemoryRequirements, VmaAllocationCreateInfo const * pCreateInfo, size_t allocationCount, VmaAllocation * pAllocations, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaAllocateMemoryPages(long allocator, long pVkMemoryRequirements, long pCreateInfo, long allocationCount, long pAllocations, long pAllocationInfo);

    /** {@code VkResult vmaAllocateMemoryPages(VmaAllocator allocator, VkMemoryRequirements const * pVkMemoryRequirements, VmaAllocationCreateInfo const * pCreateInfo, size_t allocationCount, VmaAllocation * pAllocations, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaAllocateMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VkMemoryRequirements const *") VkMemoryRequirements pVkMemoryRequirements, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocations, @NativeType("VmaAllocationInfo *") VmaAllocationInfo.@Nullable Buffer pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            checkSafe(pAllocationInfo, pAllocations.remaining());
            check(pAllocations, 1);
        }
        return nvmaAllocateMemoryPages(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), pAllocations.remaining(), memAddress(pAllocations), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaAllocateMemoryForBuffer ] ---

    /** {@code VkResult vmaAllocateMemoryForBuffer(VmaAllocator allocator, VkBuffer buffer, VmaAllocationCreateInfo const * pCreateInfo, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaAllocateMemoryForBuffer(long allocator, long buffer, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /** {@code VkResult vmaAllocateMemoryForBuffer(VmaAllocator allocator, VkBuffer buffer, VmaAllocationCreateInfo const * pCreateInfo, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaAllocateMemoryForBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBuffer") long buffer, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") @Nullable VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        return nvmaAllocateMemoryForBuffer(allocator, buffer, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaAllocateMemoryForImage ] ---

    /** {@code VkResult vmaAllocateMemoryForImage(VmaAllocator allocator, VkImage image, VmaAllocationCreateInfo const * pCreateInfo, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaAllocateMemoryForImage(long allocator, long image, long pCreateInfo, long pAllocation, long pAllocationInfo);

    /** {@code VkResult vmaAllocateMemoryForImage(VmaAllocator allocator, VkImage image, VmaAllocationCreateInfo const * pCreateInfo, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaAllocateMemoryForImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImage") long image, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") @Nullable VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pAllocation, 1);
        }
        return nvmaAllocateMemoryForImage(allocator, image, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaFreeMemory ] ---

    /** {@code void vmaFreeMemory(VmaAllocator allocator, VmaAllocation const allocation)} */
    public static native void nvmaFreeMemory(long allocator, long allocation);

    /** {@code void vmaFreeMemory(VmaAllocator allocator, VmaAllocation const allocation)} */
    public static void vmaFreeMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const") long allocation) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeMemory(allocator, allocation);
    }

    // --- [ vmaFreeMemoryPages ] ---

    /** {@code void vmaFreeMemoryPages(VmaAllocator allocator, size_t allocationCount, VmaAllocation const * pAllocations)} */
    public static native void nvmaFreeMemoryPages(long allocator, long allocationCount, long pAllocations);

    /** {@code void vmaFreeMemoryPages(VmaAllocator allocator, size_t allocationCount, VmaAllocation const * pAllocations)} */
    public static void vmaFreeMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer pAllocations) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeMemoryPages(allocator, pAllocations.remaining(), memAddress(pAllocations));
    }

    // --- [ vmaGetAllocationInfo ] ---

    /** {@code void vmaGetAllocationInfo(VmaAllocator allocator, VmaAllocation allocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native void nvmaGetAllocationInfo(long allocator, long allocation, long pAllocationInfo);

    /** {@code void vmaGetAllocationInfo(VmaAllocator allocator, VmaAllocation allocation, VmaAllocationInfo * pAllocationInfo)} */
    public static void vmaGetAllocationInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaGetAllocationInfo(allocator, allocation, pAllocationInfo.address());
    }

    // --- [ vmaGetAllocationInfo2 ] ---

    /** {@code void vmaGetAllocationInfo2(VmaAllocator allocator, VmaAllocation allocation, VmaAllocationInfo2 * pAllocationInfo)} */
    public static native void nvmaGetAllocationInfo2(long allocator, long allocation, long pAllocationInfo);

    /** {@code void vmaGetAllocationInfo2(VmaAllocator allocator, VmaAllocation allocation, VmaAllocationInfo2 * pAllocationInfo)} */
    public static void vmaGetAllocationInfo2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VmaAllocationInfo2 *") VmaAllocationInfo2 pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaGetAllocationInfo2(allocator, allocation, pAllocationInfo.address());
    }

    // --- [ vmaSetAllocationUserData ] ---

    /** {@code void vmaSetAllocationUserData(VmaAllocator allocator, VmaAllocation allocation, void * pUserData)} */
    public static native void nvmaSetAllocationUserData(long allocator, long allocation, long pUserData);

    /** {@code void vmaSetAllocationUserData(VmaAllocator allocator, VmaAllocation allocation, void * pUserData)} */
    public static void vmaSetAllocationUserData(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("void *") long pUserData) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaSetAllocationUserData(allocator, allocation, pUserData);
    }

    // --- [ vmaSetAllocationName ] ---

    /** {@code void vmaSetAllocationName(VmaAllocator allocator, VmaAllocation allocation, char const * pName)} */
    public static native void nvmaSetAllocationName(long allocator, long allocation, long pName);

    /** {@code void vmaSetAllocationName(VmaAllocator allocator, VmaAllocation allocation, char const * pName)} */
    public static void vmaSetAllocationName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("char const *") @Nullable ByteBuffer pName) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            checkNT1Safe(pName);
        }
        nvmaSetAllocationName(allocator, allocation, memAddressSafe(pName));
    }

    /** {@code void vmaSetAllocationName(VmaAllocator allocator, VmaAllocation allocation, char const * pName)} */
    public static void vmaSetAllocationName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("char const *") @Nullable CharSequence pName) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pName, true);
            long pNameEncoded = pName == null ? NULL : stack.getPointerAddress();
            nvmaSetAllocationName(allocator, allocation, pNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ vmaGetAllocationMemoryProperties ] ---

    /** {@code void vmaGetAllocationMemoryProperties(VmaAllocator allocator, VmaAllocation allocation, VkMemoryPropertyFlags * pFlags)} */
    public static native void nvmaGetAllocationMemoryProperties(long allocator, long allocation, long pFlags);

    /** {@code void vmaGetAllocationMemoryProperties(VmaAllocator allocator, VmaAllocation allocation, VkMemoryPropertyFlags * pFlags)} */
    public static void vmaGetAllocationMemoryProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkMemoryPropertyFlags *") IntBuffer pFlags) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pFlags, 1);
        }
        nvmaGetAllocationMemoryProperties(allocator, allocation, memAddress(pFlags));
    }

    // --- [ vmaGetMemoryWin32Handle ] ---

    /** {@code VkResult vmaGetMemoryWin32Handle(VmaAllocator allocator, VmaAllocation allocation, HANDLE hTargetProcess, HANDLE * pHandle)} */
    public static native int nvmaGetMemoryWin32Handle(long allocator, long allocation, long hTargetProcess, long pHandle);

    /** {@code VkResult vmaGetMemoryWin32Handle(VmaAllocator allocator, VmaAllocation allocation, HANDLE hTargetProcess, HANDLE * pHandle)} */
    @NativeType("VkResult")
    public static int vmaGetMemoryWin32Handle(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("HANDLE") long hTargetProcess, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pHandle, 1);
        }
        return nvmaGetMemoryWin32Handle(allocator, allocation, hTargetProcess, memAddress(pHandle));
    }

    // --- [ vmaMapMemory ] ---

    /** {@code VkResult vmaMapMemory(VmaAllocator allocator, VmaAllocation allocation, void ** ppData)} */
    public static native int nvmaMapMemory(long allocator, long allocation, long ppData);

    /** {@code VkResult vmaMapMemory(VmaAllocator allocator, VmaAllocation allocation, void ** ppData)} */
    @NativeType("VkResult")
    public static int vmaMapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(ppData, 1);
        }
        return nvmaMapMemory(allocator, allocation, memAddress(ppData));
    }

    // --- [ vmaUnmapMemory ] ---

    /** {@code void vmaUnmapMemory(VmaAllocator allocator, VmaAllocation allocation)} */
    public static native void nvmaUnmapMemory(long allocator, long allocation);

    /** {@code void vmaUnmapMemory(VmaAllocator allocator, VmaAllocation allocation)} */
    public static void vmaUnmapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaUnmapMemory(allocator, allocation);
    }

    // --- [ vmaFlushAllocation ] ---

    /** {@code void vmaFlushAllocation(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize offset, VkDeviceSize size)} */
    public static native void nvmaFlushAllocation(long allocator, long allocation, long offset, long size);

    /** {@code void vmaFlushAllocation(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize offset, VkDeviceSize size)} */
    public static void vmaFlushAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaFlushAllocation(allocator, allocation, offset, size);
    }

    // --- [ vmaInvalidateAllocation ] ---

    /** {@code void vmaInvalidateAllocation(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize offset, VkDeviceSize size)} */
    public static native void nvmaInvalidateAllocation(long allocator, long allocation, long offset, long size);

    /** {@code void vmaInvalidateAllocation(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize offset, VkDeviceSize size)} */
    public static void vmaInvalidateAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        nvmaInvalidateAllocation(allocator, allocation, offset, size);
    }

    // --- [ vmaFlushAllocations ] ---

    /** {@code VkResult vmaFlushAllocations(VmaAllocator allocator, uint32_t allocationCount, VmaAllocation const * allocations, VkDeviceSize const * offsets, VkDeviceSize const * sizes)} */
    public static native int nvmaFlushAllocations(long allocator, int allocationCount, long allocations, long offsets, long sizes);

    /** {@code VkResult vmaFlushAllocations(VmaAllocator allocator, uint32_t allocationCount, VmaAllocation const * allocations, VkDeviceSize const * offsets, VkDeviceSize const * sizes)} */
    @NativeType("VkResult")
    public static int vmaFlushAllocations(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer allocations, @NativeType("VkDeviceSize const *") @Nullable LongBuffer offsets, @NativeType("VkDeviceSize const *") @Nullable LongBuffer sizes) {
        if (CHECKS) {
            check(allocator);
            checkSafe(offsets, allocations.remaining());
            checkSafe(sizes, allocations.remaining());
        }
        return nvmaFlushAllocations(allocator, allocations.remaining(), memAddress(allocations), memAddressSafe(offsets), memAddressSafe(sizes));
    }

    // --- [ vmaInvalidateAllocations ] ---

    /** {@code VkResult vmaInvalidateAllocations(VmaAllocator allocator, uint32_t allocationCount, VmaAllocation const * allocations, VkDeviceSize const * offsets, VkDeviceSize const * sizes)} */
    public static native int nvmaInvalidateAllocations(long allocator, int allocationCount, long allocations, long offsets, long sizes);

    /** {@code VkResult vmaInvalidateAllocations(VmaAllocator allocator, uint32_t allocationCount, VmaAllocation const * allocations, VkDeviceSize const * offsets, VkDeviceSize const * sizes)} */
    @NativeType("VkResult")
    public static int vmaInvalidateAllocations(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer allocations, @NativeType("VkDeviceSize const *") @Nullable LongBuffer offsets, @NativeType("VkDeviceSize const *") @Nullable LongBuffer sizes) {
        if (CHECKS) {
            check(allocator);
            checkSafe(offsets, allocations.remaining());
            checkSafe(sizes, allocations.remaining());
        }
        return nvmaInvalidateAllocations(allocator, allocations.remaining(), memAddress(allocations), memAddressSafe(offsets), memAddressSafe(sizes));
    }

    // --- [ vmaCopyMemoryToAllocation ] ---

    /** {@code VkResult vmaCopyMemoryToAllocation(VmaAllocator allocator, void const * pSrcHostPointer, VmaAllocation dstAllocation, VkDeviceSize dstAllocationLocalOffset, VkDeviceSize size)} */
    public static native int nvmaCopyMemoryToAllocation(long allocator, long pSrcHostPointer, long dstAllocation, long dstAllocationLocalOffset, long size);

    /** {@code VkResult vmaCopyMemoryToAllocation(VmaAllocator allocator, void const * pSrcHostPointer, VmaAllocation dstAllocation, VkDeviceSize dstAllocationLocalOffset, VkDeviceSize size)} */
    @NativeType("VkResult")
    public static int vmaCopyMemoryToAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("void const *") ByteBuffer pSrcHostPointer, @NativeType("VmaAllocation") long dstAllocation, @NativeType("VkDeviceSize") long dstAllocationLocalOffset) {
        if (CHECKS) {
            check(allocator);
            check(dstAllocation);
        }
        return nvmaCopyMemoryToAllocation(allocator, memAddress(pSrcHostPointer), dstAllocation, dstAllocationLocalOffset, pSrcHostPointer.remaining());
    }

    // --- [ vmaCopyAllocationToMemory ] ---

    /** {@code VkResult vmaCopyAllocationToMemory(VmaAllocator allocator, VmaAllocation srcAllocation, VkDeviceSize srcAllocationLocalOffset, void * pDstHostPointer, VkDeviceSize size)} */
    public static native int nvmaCopyAllocationToMemory(long allocator, long srcAllocation, long srcAllocationLocalOffset, long pDstHostPointer, long size);

    /** {@code VkResult vmaCopyAllocationToMemory(VmaAllocator allocator, VmaAllocation srcAllocation, VkDeviceSize srcAllocationLocalOffset, void * pDstHostPointer, VkDeviceSize size)} */
    @NativeType("VkResult")
    public static int vmaCopyAllocationToMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long srcAllocation, @NativeType("VkDeviceSize") long srcAllocationLocalOffset, @NativeType("void *") ByteBuffer pDstHostPointer) {
        if (CHECKS) {
            check(allocator);
            check(srcAllocation);
        }
        return nvmaCopyAllocationToMemory(allocator, srcAllocation, srcAllocationLocalOffset, memAddress(pDstHostPointer), pDstHostPointer.remaining());
    }

    // --- [ vmaCheckCorruption ] ---

    /** {@code VkResult vmaCheckCorruption(VmaAllocator allocator, uint32_t memoryTypeBits)} */
    public static native int nvmaCheckCorruption(long allocator, int memoryTypeBits);

    /** {@code VkResult vmaCheckCorruption(VmaAllocator allocator, uint32_t memoryTypeBits)} */
    @NativeType("VkResult")
    public static int vmaCheckCorruption(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeBits) {
        if (CHECKS) {
            check(allocator);
        }
        return nvmaCheckCorruption(allocator, memoryTypeBits);
    }

    // --- [ vmaBeginDefragmentation ] ---

    /** {@code VkResult vmaBeginDefragmentation(VmaAllocator allocator, VmaDefragmentationInfo const * pInfo, VmaDefragmentationContext * pContext)} */
    public static native int nvmaBeginDefragmentation(long allocator, long pInfo, long pContext);

    /** {@code VkResult vmaBeginDefragmentation(VmaAllocator allocator, VmaDefragmentationInfo const * pInfo, VmaDefragmentationContext * pContext)} */
    @NativeType("VkResult")
    public static int vmaBeginDefragmentation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationInfo const *") VmaDefragmentationInfo pInfo, @NativeType("VmaDefragmentationContext *") PointerBuffer pContext) {
        if (CHECKS) {
            check(allocator);
            check(pContext, 1);
        }
        return nvmaBeginDefragmentation(allocator, pInfo.address(), memAddress(pContext));
    }

    // --- [ vmaEndDefragmentation ] ---

    /** {@code void vmaEndDefragmentation(VmaAllocator allocator, VmaDefragmentationContext context, VmaDefragmentationStats * pStats)} */
    public static native void nvmaEndDefragmentation(long allocator, long context, long pStats);

    /** {@code void vmaEndDefragmentation(VmaAllocator allocator, VmaDefragmentationContext context, VmaDefragmentationStats * pStats)} */
    public static void vmaEndDefragmentation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationStats *") @Nullable VmaDefragmentationStats pStats) {
        if (CHECKS) {
            check(allocator);
            check(context);
        }
        nvmaEndDefragmentation(allocator, context, memAddressSafe(pStats));
    }

    // --- [ vmaBeginDefragmentationPass ] ---

    /** {@code VkResult vmaBeginDefragmentationPass(VmaAllocator allocator, VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo * pInfo)} */
    public static native int nvmaBeginDefragmentationPass(long allocator, long context, long pInfo);

    /** {@code VkResult vmaBeginDefragmentationPass(VmaAllocator allocator, VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo * pInfo)} */
    @NativeType("VkResult")
    public static int vmaBeginDefragmentationPass(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationPassMoveInfo *") VmaDefragmentationPassMoveInfo pInfo) {
        if (CHECKS) {
            check(allocator);
            check(context);
        }
        return nvmaBeginDefragmentationPass(allocator, context, pInfo.address());
    }

    // --- [ vmaEndDefragmentationPass ] ---

    /** {@code VkResult vmaEndDefragmentationPass(VmaAllocator allocator, VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo * pPassInfo)} */
    public static native int nvmaEndDefragmentationPass(long allocator, long context, long pPassInfo);

    /** {@code VkResult vmaEndDefragmentationPass(VmaAllocator allocator, VmaDefragmentationContext context, VmaDefragmentationPassMoveInfo * pPassInfo)} */
    @NativeType("VkResult")
    public static int vmaEndDefragmentationPass(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationPassMoveInfo *") VmaDefragmentationPassMoveInfo pPassInfo) {
        if (CHECKS) {
            check(allocator);
            check(context);
        }
        return nvmaEndDefragmentationPass(allocator, context, pPassInfo.address());
    }

    // --- [ vmaBindBufferMemory ] ---

    /** {@code VkResult vmaBindBufferMemory(VmaAllocator allocator, VmaAllocation allocation, VkBuffer buffer)} */
    public static native int nvmaBindBufferMemory(long allocator, long allocation, long buffer);

    /** {@code VkResult vmaBindBufferMemory(VmaAllocator allocator, VmaAllocation allocation, VkBuffer buffer)} */
    @NativeType("VkResult")
    public static int vmaBindBufferMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkBuffer") long buffer) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindBufferMemory(allocator, allocation, buffer);
    }

    // --- [ vmaBindBufferMemory2 ] ---

    /** {@code VkResult vmaBindBufferMemory2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkBuffer buffer, void const * pNext)} */
    public static native int nvmaBindBufferMemory2(long allocator, long allocation, long allocationLocalOffset, long buffer, long pNext);

    /** {@code VkResult vmaBindBufferMemory2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkBuffer buffer, void const * pNext)} */
    @NativeType("VkResult")
    public static int vmaBindBufferMemory2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkBuffer") long buffer, @NativeType("void const *") long pNext) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindBufferMemory2(allocator, allocation, allocationLocalOffset, buffer, pNext);
    }

    // --- [ vmaBindImageMemory ] ---

    /** {@code VkResult vmaBindImageMemory(VmaAllocator allocator, VmaAllocation allocation, VkImage image)} */
    public static native int nvmaBindImageMemory(long allocator, long allocation, long image);

    /** {@code VkResult vmaBindImageMemory(VmaAllocator allocator, VmaAllocation allocation, VkImage image)} */
    @NativeType("VkResult")
    public static int vmaBindImageMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkImage") long image) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindImageMemory(allocator, allocation, image);
    }

    // --- [ vmaBindImageMemory2 ] ---

    /** {@code VkResult vmaBindImageMemory2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkImage image, void const * pNext)} */
    public static native int nvmaBindImageMemory2(long allocator, long allocation, long allocationLocalOffset, long image, long pNext);

    /** {@code VkResult vmaBindImageMemory2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkImage image, void const * pNext)} */
    @NativeType("VkResult")
    public static int vmaBindImageMemory2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkImage") long image, @NativeType("void const *") long pNext) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
        }
        return nvmaBindImageMemory2(allocator, allocation, allocationLocalOffset, image, pNext);
    }

    // --- [ vmaCreateBuffer ] ---

    /** {@code VkResult vmaCreateBuffer(VmaAllocator allocator, VkBufferCreateInfo const * pBufferCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, VkBuffer * pBuffer, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaCreateBuffer(long allocator, long pBufferCreateInfo, long pAllocationCreateInfo, long pBuffer, long pAllocation, long pAllocationInfo);

    /** {@code VkResult vmaCreateBuffer(VmaAllocator allocator, VkBufferCreateInfo const * pBufferCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, VkBuffer * pBuffer, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaCreateBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") @Nullable VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pBuffer, 1);
            check(pAllocation, 1);
        }
        return nvmaCreateBuffer(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pBuffer), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaCreateBufferWithAlignment ] ---

    /** {@code VkResult vmaCreateBufferWithAlignment(VmaAllocator allocator, VkBufferCreateInfo const * pBufferCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, VkDeviceSize minAlignment, VkBuffer * pBuffer, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaCreateBufferWithAlignment(long allocator, long pBufferCreateInfo, long pAllocationCreateInfo, long minAlignment, long pBuffer, long pAllocation, long pAllocationInfo);

    /** {@code VkResult vmaCreateBufferWithAlignment(VmaAllocator allocator, VkBufferCreateInfo const * pBufferCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, VkDeviceSize minAlignment, VkBuffer * pBuffer, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaCreateBufferWithAlignment(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkDeviceSize") long minAlignment, @NativeType("VkBuffer *") LongBuffer pBuffer, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") @Nullable VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pBuffer, 1);
            check(pAllocation, 1);
        }
        return nvmaCreateBufferWithAlignment(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), minAlignment, memAddress(pBuffer), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaCreateAliasingBuffer ] ---

    /** {@code VkResult vmaCreateAliasingBuffer(VmaAllocator allocator, VmaAllocation allocation, VkBufferCreateInfo const * pBufferCreateInfo, VkBuffer * pBuffer)} */
    public static native int nvmaCreateAliasingBuffer(long allocator, long allocation, long pBufferCreateInfo, long pBuffer);

    /** {@code VkResult vmaCreateAliasingBuffer(VmaAllocator allocator, VmaAllocation allocation, VkBufferCreateInfo const * pBufferCreateInfo, VkBuffer * pBuffer)} */
    @NativeType("VkResult")
    public static int vmaCreateAliasingBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pBuffer, 1);
        }
        return nvmaCreateAliasingBuffer(allocator, allocation, pBufferCreateInfo.address(), memAddress(pBuffer));
    }

    // --- [ vmaCreateAliasingBuffer2 ] ---

    /** {@code VkResult vmaCreateAliasingBuffer2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkBufferCreateInfo const * pBufferCreateInfo, VkBuffer * pBuffer)} */
    public static native int nvmaCreateAliasingBuffer2(long allocator, long allocation, long allocationLocalOffset, long pBufferCreateInfo, long pBuffer);

    /** {@code VkResult vmaCreateAliasingBuffer2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkBufferCreateInfo const * pBufferCreateInfo, VkBuffer * pBuffer)} */
    @NativeType("VkResult")
    public static int vmaCreateAliasingBuffer2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pBuffer, 1);
        }
        return nvmaCreateAliasingBuffer2(allocator, allocation, allocationLocalOffset, pBufferCreateInfo.address(), memAddress(pBuffer));
    }

    // --- [ vmaDestroyBuffer ] ---

    /** {@code void vmaDestroyBuffer(VmaAllocator allocator, VkBuffer buffer, VmaAllocation allocation)} */
    public static native void nvmaDestroyBuffer(long allocator, long buffer, long allocation);

    /** {@code void vmaDestroyBuffer(VmaAllocator allocator, VkBuffer buffer, VmaAllocation allocation)} */
    public static void vmaDestroyBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBuffer") long buffer, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaDestroyBuffer(allocator, buffer, allocation);
    }

    // --- [ vmaCreateImage ] ---

    /** {@code VkResult vmaCreateImage(VmaAllocator allocator, VkImageCreateInfo const * pImageCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, VkImage * pImage, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    public static native int nvmaCreateImage(long allocator, long pImageCreateInfo, long pAllocationCreateInfo, long pImage, long pAllocation, long pAllocationInfo);

    /** {@code VkResult vmaCreateImage(VmaAllocator allocator, VkImageCreateInfo const * pImageCreateInfo, VmaAllocationCreateInfo const * pAllocationCreateInfo, VkImage * pImage, VmaAllocation * pAllocation, VmaAllocationInfo * pAllocationInfo)} */
    @NativeType("VkResult")
    public static int vmaCreateImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkImage *") LongBuffer pImage, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") @Nullable VmaAllocationInfo pAllocationInfo) {
        if (CHECKS) {
            check(allocator);
            check(pImage, 1);
            check(pAllocation, 1);
        }
        return nvmaCreateImage(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), memAddress(pImage), memAddress(pAllocation), memAddressSafe(pAllocationInfo));
    }

    // --- [ vmaCreateAliasingImage ] ---

    /** {@code VkResult vmaCreateAliasingImage(VmaAllocator allocator, VmaAllocation allocation, VkImageCreateInfo const * pImageCreateInfo, VkImage * pImage)} */
    public static native int nvmaCreateAliasingImage(long allocator, long allocation, long pImageCreateInfo, long pImage);

    /** {@code VkResult vmaCreateAliasingImage(VmaAllocator allocator, VmaAllocation allocation, VkImageCreateInfo const * pImageCreateInfo, VkImage * pImage)} */
    @NativeType("VkResult")
    public static int vmaCreateAliasingImage(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VkImage *") LongBuffer pImage) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pImage, 1);
        }
        return nvmaCreateAliasingImage(allocator, allocation, pImageCreateInfo.address(), memAddress(pImage));
    }

    // --- [ vmaCreateAliasingImage2 ] ---

    /** {@code VkResult vmaCreateAliasingImage2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkImageCreateInfo const * pImageCreateInfo, VkImage * pImage)} */
    public static native int nvmaCreateAliasingImage2(long allocator, long allocation, long allocationLocalOffset, long pImageCreateInfo, long pImage);

    /** {@code VkResult vmaCreateAliasingImage2(VmaAllocator allocator, VmaAllocation allocation, VkDeviceSize allocationLocalOffset, VkImageCreateInfo const * pImageCreateInfo, VkImage * pImage)} */
    @NativeType("VkResult")
    public static int vmaCreateAliasingImage2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VkImage *") LongBuffer pImage) {
        if (CHECKS) {
            check(allocator);
            check(allocation);
            check(pImage, 1);
        }
        return nvmaCreateAliasingImage2(allocator, allocation, allocationLocalOffset, pImageCreateInfo.address(), memAddress(pImage));
    }

    // --- [ vmaDestroyImage ] ---

    /** {@code void vmaDestroyImage(VmaAllocator allocator, VkImage image, VmaAllocation allocation)} */
    public static native void nvmaDestroyImage(long allocator, long image, long allocation);

    /** {@code void vmaDestroyImage(VmaAllocator allocator, VkImage image, VmaAllocation allocation)} */
    public static void vmaDestroyImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImage") long image, @NativeType("VmaAllocation") long allocation) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaDestroyImage(allocator, image, allocation);
    }

    // --- [ vmaCreateVirtualBlock ] ---

    /** {@code VkResult vmaCreateVirtualBlock(VmaVirtualBlockCreateInfo const * pCreateInfo, VmaVirtualBlock * pVirtualBlock)} */
    public static native int nvmaCreateVirtualBlock(long pCreateInfo, long pVirtualBlock);

    /** {@code VkResult vmaCreateVirtualBlock(VmaVirtualBlockCreateInfo const * pCreateInfo, VmaVirtualBlock * pVirtualBlock)} */
    @NativeType("VkResult")
    public static int vmaCreateVirtualBlock(@NativeType("VmaVirtualBlockCreateInfo const *") VmaVirtualBlockCreateInfo pCreateInfo, @NativeType("VmaVirtualBlock *") PointerBuffer pVirtualBlock) {
        if (CHECKS) {
            check(pVirtualBlock, 1);
        }
        return nvmaCreateVirtualBlock(pCreateInfo.address(), memAddress(pVirtualBlock));
    }

    // --- [ vmaDestroyVirtualBlock ] ---

    /** {@code void vmaDestroyVirtualBlock(VmaVirtualBlock virtualBlock)} */
    public static native void nvmaDestroyVirtualBlock(long virtualBlock);

    /** {@code void vmaDestroyVirtualBlock(VmaVirtualBlock virtualBlock)} */
    public static void vmaDestroyVirtualBlock(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaDestroyVirtualBlock(virtualBlock);
    }

    // --- [ vmaIsVirtualBlockEmpty ] ---

    /** {@code VkBool32 vmaIsVirtualBlockEmpty(VmaVirtualBlock virtualBlock)} */
    public static native int nvmaIsVirtualBlockEmpty(long virtualBlock);

    /** {@code VkBool32 vmaIsVirtualBlockEmpty(VmaVirtualBlock virtualBlock)} */
    @NativeType("VkBool32")
    public static boolean vmaIsVirtualBlockEmpty(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (CHECKS) {
            check(virtualBlock);
        }
        return nvmaIsVirtualBlockEmpty(virtualBlock) != 0;
    }

    // --- [ vmaGetVirtualAllocationInfo ] ---

    /** {@code void vmaGetVirtualAllocationInfo(VmaVirtualBlock virtualBlock, VmaVirtualAllocation allocation, VmaVirtualAllocationInfo * pVirtualAllocInfo)} */
    public static native void nvmaGetVirtualAllocationInfo(long virtualBlock, long allocation, long pVirtualAllocInfo);

    /** {@code void vmaGetVirtualAllocationInfo(VmaVirtualBlock virtualBlock, VmaVirtualAllocation allocation, VmaVirtualAllocationInfo * pVirtualAllocInfo)} */
    public static void vmaGetVirtualAllocationInfo(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation, @NativeType("VmaVirtualAllocationInfo *") VmaVirtualAllocationInfo pVirtualAllocInfo) {
        if (CHECKS) {
            check(virtualBlock);
            check(allocation);
        }
        nvmaGetVirtualAllocationInfo(virtualBlock, allocation, pVirtualAllocInfo.address());
    }

    // --- [ vmaVirtualAllocate ] ---

    /** {@code VkResult vmaVirtualAllocate(VmaVirtualBlock virtualBlock, VmaVirtualAllocationCreateInfo const * pCreateInfo, VmaVirtualAllocation * pAllocation, VkDeviceSize * pOffset)} */
    public static native int nvmaVirtualAllocate(long virtualBlock, long pCreateInfo, long pAllocation, long pOffset);

    /** {@code VkResult vmaVirtualAllocate(VmaVirtualBlock virtualBlock, VmaVirtualAllocationCreateInfo const * pCreateInfo, VmaVirtualAllocation * pAllocation, VkDeviceSize * pOffset)} */
    @NativeType("VkResult")
    public static int vmaVirtualAllocate(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocationCreateInfo const *") VmaVirtualAllocationCreateInfo pCreateInfo, @NativeType("VmaVirtualAllocation *") PointerBuffer pAllocation, @NativeType("VkDeviceSize *") @Nullable LongBuffer pOffset) {
        if (CHECKS) {
            check(virtualBlock);
            check(pAllocation, 1);
            checkSafe(pOffset, 1);
        }
        return nvmaVirtualAllocate(virtualBlock, pCreateInfo.address(), memAddress(pAllocation), memAddressSafe(pOffset));
    }

    // --- [ vmaVirtualFree ] ---

    /** {@code void vmaVirtualFree(VmaVirtualBlock virtualBlock, VmaVirtualAllocation allocation)} */
    public static native void nvmaVirtualFree(long virtualBlock, long allocation);

    /** {@code void vmaVirtualFree(VmaVirtualBlock virtualBlock, VmaVirtualAllocation allocation)} */
    public static void vmaVirtualFree(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaVirtualFree(virtualBlock, allocation);
    }

    // --- [ vmaClearVirtualBlock ] ---

    /** {@code void vmaClearVirtualBlock(VmaVirtualBlock virtualBlock)} */
    public static native void nvmaClearVirtualBlock(long virtualBlock);

    /** {@code void vmaClearVirtualBlock(VmaVirtualBlock virtualBlock)} */
    public static void vmaClearVirtualBlock(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaClearVirtualBlock(virtualBlock);
    }

    // --- [ vmaSetVirtualAllocationUserData ] ---

    /** {@code void vmaSetVirtualAllocationUserData(VmaVirtualBlock virtualBlock, VmaVirtualAllocation allocation, void * pUserData)} */
    public static native void nvmaSetVirtualAllocationUserData(long virtualBlock, long allocation, long pUserData);

    /** {@code void vmaSetVirtualAllocationUserData(VmaVirtualBlock virtualBlock, VmaVirtualAllocation allocation, void * pUserData)} */
    public static void vmaSetVirtualAllocationUserData(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation, @NativeType("void *") long pUserData) {
        if (CHECKS) {
            check(virtualBlock);
            check(allocation);
            check(pUserData);
        }
        nvmaSetVirtualAllocationUserData(virtualBlock, allocation, pUserData);
    }

    // --- [ vmaGetVirtualBlockStatistics ] ---

    /** {@code void vmaGetVirtualBlockStatistics(VmaVirtualBlock virtualBlock, VmaStatistics * pStats)} */
    public static native void nvmaGetVirtualBlockStatistics(long virtualBlock, long pStats);

    /** {@code void vmaGetVirtualBlockStatistics(VmaVirtualBlock virtualBlock, VmaStatistics * pStats)} */
    public static void vmaGetVirtualBlockStatistics(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaStatistics *") VmaStatistics pStats) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaGetVirtualBlockStatistics(virtualBlock, pStats.address());
    }

    // --- [ vmaCalculateVirtualBlockStatistics ] ---

    /** {@code void vmaCalculateVirtualBlockStatistics(VmaVirtualBlock virtualBlock, VmaDetailedStatistics * pStats)} */
    public static native void nvmaCalculateVirtualBlockStatistics(long virtualBlock, long pStats);

    /** {@code void vmaCalculateVirtualBlockStatistics(VmaVirtualBlock virtualBlock, VmaDetailedStatistics * pStats)} */
    public static void vmaCalculateVirtualBlockStatistics(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaDetailedStatistics *") VmaDetailedStatistics pStats) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaCalculateVirtualBlockStatistics(virtualBlock, pStats.address());
    }

    // --- [ vmaBuildVirtualBlockStatsString ] ---

    /** {@code void vmaBuildVirtualBlockStatsString(VmaVirtualBlock virtualBlock, char ** ppStatsString, VkBool32 detailedMap)} */
    public static native void nvmaBuildVirtualBlockStatsString(long virtualBlock, long ppStatsString, int detailedMap);

    /** {@code void vmaBuildVirtualBlockStatsString(VmaVirtualBlock virtualBlock, char ** ppStatsString, VkBool32 detailedMap)} */
    public static void vmaBuildVirtualBlockStatsString(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("char **") PointerBuffer ppStatsString, @NativeType("VkBool32") boolean detailedMap) {
        if (CHECKS) {
            check(virtualBlock);
            check(ppStatsString, 1);
        }
        nvmaBuildVirtualBlockStatsString(virtualBlock, memAddress(ppStatsString), detailedMap ? 1 : 0);
    }

    // --- [ vmaFreeVirtualBlockStatsString ] ---

    /** {@code void vmaFreeVirtualBlockStatsString(VmaVirtualBlock virtualBlock, char * pStatsString)} */
    public static native void nvmaFreeVirtualBlockStatsString(long virtualBlock, long pStatsString);

    /** {@code void vmaFreeVirtualBlockStatsString(VmaVirtualBlock virtualBlock, char * pStatsString)} */
    public static void vmaFreeVirtualBlockStatsString(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("char *") ByteBuffer pStatsString) {
        if (CHECKS) {
            check(virtualBlock);
        }
        nvmaFreeVirtualBlockStatsString(virtualBlock, memAddress(pStatsString));
    }

    // --- [ vmaBuildStatsString ] ---

    /** {@code void vmaBuildStatsString(VmaAllocator allocator, char ** ppStatsString, VkBool32 detailedMap)} */
    public static native void nvmaBuildStatsString(long allocator, long ppStatsString, int detailedMap);

    /** {@code void vmaBuildStatsString(VmaAllocator allocator, char ** ppStatsString, VkBool32 detailedMap)} */
    public static void vmaBuildStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char **") PointerBuffer ppStatsString, @NativeType("VkBool32") boolean detailedMap) {
        if (CHECKS) {
            check(allocator);
            check(ppStatsString, 1);
        }
        nvmaBuildStatsString(allocator, memAddress(ppStatsString), detailedMap ? 1 : 0);
    }

    // --- [ vmaFreeStatsString ] ---

    /** {@code void vmaFreeStatsString(VmaAllocator allocator, char * pStatsString)} */
    public static native void nvmaFreeStatsString(long allocator, long pStatsString);

    /** {@code void vmaFreeStatsString(VmaAllocator allocator, char * pStatsString)} */
    public static void vmaFreeStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char *") ByteBuffer pStatsString) {
        if (CHECKS) {
            check(allocator);
        }
        nvmaFreeStatsString(allocator, memAddress(pStatsString));
    }

}