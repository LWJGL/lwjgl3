/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"
DISABLE_WARNINGS()
#if LWJGL_MACOS
    _Pragma("GCC diagnostic ignored \"-Wnullability-completeness\"")
#endif
#define VMA_IMPLEMENTATION
#define VMA_STATIC_VULKAN_FUNCTIONS 0
#define VMA_DYNAMIC_VULKAN_FUNCTIONS 0
#define VMA_SYSTEM_ALIGNED_MALLOC(size, alignment) org_lwjgl_aligned_alloc((alignment), (size))
#define VMA_SYSTEM_ALIGNED_FREE(ptr) org_lwjgl_aligned_free(ptr)
#define VMA_VULKAN_VERSION 1003000
#define VMA_DEDICATED_ALLOCATION 1
#define VMA_BIND_MEMORY2 1
#define VMA_MEMORY_BUDGET 1
#define VMA_BUFFER_DEVICE_ADDRESS 1
#define VMA_MEMORY_PRIORITY 1
#define VMA_EXTERNAL_MEMORY 1
#include "vk_mem_alloc.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateAllocator(JNIEnv *__env, jclass clazz, jlong pCreateInfoAddress, jlong pAllocatorAddress) {
    VmaAllocatorCreateInfo const *pCreateInfo = (VmaAllocatorCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaAllocator *pAllocator = (VmaAllocator *)(uintptr_t)pAllocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateAllocator(pCreateInfo, pAllocator);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyAllocator(JNIEnv *__env, jclass clazz, jlong allocatorAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyAllocator(allocator);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetAllocatorInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pAllocatorInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocatorInfo *pAllocatorInfo = (VmaAllocatorInfo *)(uintptr_t)pAllocatorInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetAllocatorInfo(allocator, pAllocatorInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPhysicalDeviceProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppPhysicalDevicePropertiesAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkPhysicalDeviceProperties const **ppPhysicalDeviceProperties = (VkPhysicalDeviceProperties const **)(uintptr_t)ppPhysicalDevicePropertiesAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetPhysicalDeviceProperties(allocator, ppPhysicalDeviceProperties);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetMemoryProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppPhysicalDeviceMemoryPropertiesAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkPhysicalDeviceMemoryProperties const **ppPhysicalDeviceMemoryProperties = (VkPhysicalDeviceMemoryProperties const **)(uintptr_t)ppPhysicalDeviceMemoryPropertiesAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetMemoryProperties(allocator, ppPhysicalDeviceMemoryProperties);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetMemoryTypeProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeIndex, jlong pFlagsAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkMemoryPropertyFlags *pFlags = (VkMemoryPropertyFlags *)(uintptr_t)pFlagsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetMemoryTypeProperties(allocator, (uint32_t)memoryTypeIndex, pFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetCurrentFrameIndex(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint frameIndex) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaSetCurrentFrameIndex(allocator, (uint32_t)frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCalculateStats(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaStats *pStats = (VmaStats *)(uintptr_t)pStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaCalculateStats(allocator, pStats);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetHeapBudgets(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBudgetAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaBudget *pBudget = (VmaBudget *)(uintptr_t)pBudgetAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetHeapBudgets(allocator, pBudget);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndex(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeBits, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(uintptr_t)pMemoryTypeIndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFindMemoryTypeIndex(allocator, (uint32_t)memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForBufferInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(uintptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(uintptr_t)pMemoryTypeIndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFindMemoryTypeIndexForBufferInfo(allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForImageInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkImageCreateInfo const *pImageCreateInfo = (VkImageCreateInfo const *)(uintptr_t)pImageCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(uintptr_t)pMemoryTypeIndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreatePool(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pCreateInfoAddress, jlong pPoolAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaPoolCreateInfo const *pCreateInfo = (VmaPoolCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaPool *pPool = (VmaPool *)(uintptr_t)pPoolAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreatePool(allocator, pCreateInfo, pPool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyPool(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(uintptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyPool(allocator, pool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPoolStats(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong pPoolStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(uintptr_t)poolAddress;
    VmaPoolStats *pPoolStats = (VmaPoolStats *)(uintptr_t)pPoolStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetPoolStats(allocator, pool, pPoolStats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCheckPoolCorruption(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(uintptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCheckPoolCorruption(allocator, pool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPoolName(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong ppNameAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(uintptr_t)poolAddress;
    char const **ppName = (char const **)(uintptr_t)ppNameAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetPoolName(allocator, pool, ppName);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetPoolName(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong pNameAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(uintptr_t)poolAddress;
    char const *pName = (char const *)(uintptr_t)pNameAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaSetPoolName(allocator, pool, pName);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkMemoryRequirements const *pVkMemoryRequirements = (VkMemoryRequirements const *)(uintptr_t)pVkMemoryRequirementsAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(uintptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemory(allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryPages(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong allocationCount, jlong pAllocationsAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkMemoryRequirements const *pVkMemoryRequirements = (VkMemoryRequirements const *)(uintptr_t)pVkMemoryRequirementsAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(uintptr_t)pAllocationsAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemoryPages(allocator, pVkMemoryRequirements, pCreateInfo, (size_t)allocationCount, pAllocations, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong buffer, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(uintptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemoryForBuffer(allocator, (VkBuffer)buffer, pCreateInfo, pAllocation, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong image, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(uintptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemoryForImage(allocator, (VkImage)image, pCreateInfo, pAllocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation const allocation = (VmaAllocation const)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeMemory(allocator, allocation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeMemoryPages(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationCount, jlong pAllocationsAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation const *pAllocations = (VmaAllocation const *)(uintptr_t)pAllocationsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeMemoryPages(allocator, (size_t)allocationCount, pAllocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetAllocationInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetAllocationInfo(allocator, allocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetAllocationUserData(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pUserDataAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    void *pUserData = (void *)(uintptr_t)pUserDataAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaSetAllocationUserData(allocator, allocation, pUserData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetAllocationMemoryProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pFlagsAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    VkMemoryPropertyFlags *pFlags = (VkMemoryPropertyFlags *)(uintptr_t)pFlagsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetAllocationMemoryProperties(allocator, allocation, pFlags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaMapMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong ppDataAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    void **ppData = (void **)(uintptr_t)ppDataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaMapMemory(allocator, allocation, ppData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaUnmapMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaUnmapMemory(allocator, allocation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFlushAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFlushAllocation(allocator, allocation, (VkDeviceSize)offset, (VkDeviceSize)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaInvalidateAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaInvalidateAllocation(allocator, allocation, (VkDeviceSize)offset, (VkDeviceSize)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFlushAllocations(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint allocationCount, jlong allocationsAddress, jlong offsetsAddress, jlong sizesAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation const *allocations = (VmaAllocation const *)(uintptr_t)allocationsAddress;
    VkDeviceSize const *offsets = (VkDeviceSize const *)(uintptr_t)offsetsAddress;
    VkDeviceSize const *sizes = (VkDeviceSize const *)(uintptr_t)sizesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFlushAllocations(allocator, (uint32_t)allocationCount, allocations, offsets, sizes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaInvalidateAllocations(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint allocationCount, jlong allocationsAddress, jlong offsetsAddress, jlong sizesAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation const *allocations = (VmaAllocation const *)(uintptr_t)allocationsAddress;
    VkDeviceSize const *offsets = (VkDeviceSize const *)(uintptr_t)offsetsAddress;
    VkDeviceSize const *sizes = (VkDeviceSize const *)(uintptr_t)sizesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaInvalidateAllocations(allocator, (uint32_t)allocationCount, allocations, offsets, sizes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCheckCorruption(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeBits) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCheckCorruption(allocator, (uint32_t)memoryTypeBits);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragmentationBegin(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pInfoAddress, jlong pStatsAddress, jlong pContextAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaDefragmentationInfo2 const *pInfo = (VmaDefragmentationInfo2 const *)(uintptr_t)pInfoAddress;
    VmaDefragmentationStats *pStats = (VmaDefragmentationStats *)(uintptr_t)pStatsAddress;
    VmaDefragmentationContext *pContext = (VmaDefragmentationContext *)(uintptr_t)pContextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaDefragmentationBegin(allocator, pInfo, pStats, pContext);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragmentationEnd(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong contextAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaDefragmentationContext context = (VmaDefragmentationContext)(uintptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaDefragmentationEnd(allocator, context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBeginDefragmentationPass(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong contextAddress, jlong pInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaDefragmentationContext context = (VmaDefragmentationContext)(uintptr_t)contextAddress;
    VmaDefragmentationPassInfo *pInfo = (VmaDefragmentationPassInfo *)(uintptr_t)pInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBeginDefragmentationPass(allocator, context, pInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaEndDefragmentationPass(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong contextAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaDefragmentationContext context = (VmaDefragmentationContext)(uintptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaEndDefragmentationPass(allocator, context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragment(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pAllocationsAddress, jlong allocationCount, jlong pAllocationsChangedAddress, jlong pDefragmentationInfoAddress, jlong pDefragmentationStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation const *pAllocations = (VmaAllocation const *)(uintptr_t)pAllocationsAddress;
    VkBool32 *pAllocationsChanged = (VkBool32 *)(uintptr_t)pAllocationsChangedAddress;
    VmaDefragmentationInfo const *pDefragmentationInfo = (VmaDefragmentationInfo const *)(uintptr_t)pDefragmentationInfoAddress;
    VmaDefragmentationStats *pDefragmentationStats = (VmaDefragmentationStats *)(uintptr_t)pDefragmentationStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaDefragment(allocator, pAllocations, (size_t)allocationCount, pAllocationsChanged, pDefragmentationInfo, pDefragmentationStats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindBufferMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong buffer) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBindBufferMemory(allocator, allocation, (VkBuffer)buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindBufferMemory2(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong allocationLocalOffset, jlong buffer, jlong pNextAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    void const *pNext = (void const *)(uintptr_t)pNextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBindBufferMemory2(allocator, allocation, (VkDeviceSize)allocationLocalOffset, (VkBuffer)buffer, pNext);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindImageMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong image) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBindImageMemory(allocator, allocation, (VkImage)image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindImageMemory2(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong allocationLocalOffset, jlong image, jlong pNextAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    void const *pNext = (void const *)(uintptr_t)pNextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBindImageMemory2(allocator, allocation, (VkDeviceSize)allocationLocalOffset, (VkImage)image, pNext);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pBufferAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(uintptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pAllocationCreateInfoAddress;
    VkBuffer *pBuffer = (VkBuffer *)(uintptr_t)pBufferAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(uintptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateBuffer(allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateBufferWithAlignment(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong minAlignment, jlong pBufferAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(uintptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pAllocationCreateInfoAddress;
    VkBuffer *pBuffer = (VkBuffer *)(uintptr_t)pBufferAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(uintptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateBufferWithAlignment(allocator, pBufferCreateInfo, pAllocationCreateInfo, (VkDeviceSize)minAlignment, pBuffer, pAllocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong buffer, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyBuffer(allocator, (VkBuffer)buffer, allocation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pImageAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VkImageCreateInfo const *pImageCreateInfo = (VkImageCreateInfo const *)(uintptr_t)pImageCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(uintptr_t)pAllocationCreateInfoAddress;
    VkImage *pImage = (VkImage *)(uintptr_t)pImageAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(uintptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(uintptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateImage(allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong image, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyImage(allocator, (VkImage)image, allocation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateVirtualBlock(JNIEnv *__env, jclass clazz, jlong pCreateInfoAddress, jlong pVirtualBlockAddress) {
    VmaVirtualBlockCreateInfo const *pCreateInfo = (VmaVirtualBlockCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaVirtualBlock *pVirtualBlock = (VmaVirtualBlock *)(uintptr_t)pVirtualBlockAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateVirtualBlock(pCreateInfo, pVirtualBlock);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyVirtualBlock(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyVirtualBlock(virtualBlock);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaIsVirtualBlockEmpty(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaIsVirtualBlockEmpty(virtualBlock);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetVirtualAllocationInfo(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong allocationAddress, jlong pVirtualAllocInfoAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    VmaVirtualAllocation allocation = (VmaVirtualAllocation)(uintptr_t)allocationAddress;
    VmaVirtualAllocationInfo *pVirtualAllocInfo = (VmaVirtualAllocationInfo *)(uintptr_t)pVirtualAllocInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetVirtualAllocationInfo(virtualBlock, allocation, pVirtualAllocInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaVirtualAllocate(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pOffsetAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    VmaVirtualAllocationCreateInfo const *pCreateInfo = (VmaVirtualAllocationCreateInfo const *)(uintptr_t)pCreateInfoAddress;
    VmaVirtualAllocation *pAllocation = (VmaVirtualAllocation *)(uintptr_t)pAllocationAddress;
    VkDeviceSize *pOffset = (VkDeviceSize *)(uintptr_t)pOffsetAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaVirtualAllocate(virtualBlock, pCreateInfo, pAllocation, pOffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaVirtualFree(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong allocationAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    VmaVirtualAllocation allocation = (VmaVirtualAllocation)(uintptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaVirtualFree(virtualBlock, allocation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaClearVirtualBlock(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaClearVirtualBlock(virtualBlock);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetVirtualAllocationUserData(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong allocationAddress, jlong pUserDataAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    VmaVirtualAllocation allocation = (VmaVirtualAllocation)(uintptr_t)allocationAddress;
    void *pUserData = (void *)(uintptr_t)pUserDataAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaSetVirtualAllocationUserData(virtualBlock, allocation, pUserData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCalculateVirtualBlockStats(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong pStatInfoAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    VmaStatInfo *pStatInfo = (VmaStatInfo *)(uintptr_t)pStatInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaCalculateVirtualBlockStats(virtualBlock, pStatInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBuildVirtualBlockStatsString(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong ppStatsStringAddress, jint detailedMap) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    char **ppStatsString = (char **)(uintptr_t)ppStatsStringAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaBuildVirtualBlockStatsString(virtualBlock, ppStatsString, (VkBool32)detailedMap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeVirtualBlockStatsString(JNIEnv *__env, jclass clazz, jlong virtualBlockAddress, jlong pStatsStringAddress) {
    VmaVirtualBlock virtualBlock = (VmaVirtualBlock)(uintptr_t)virtualBlockAddress;
    char *pStatsString = (char *)(uintptr_t)pStatsStringAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeVirtualBlockStatsString(virtualBlock, pStatsString);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBuildStatsString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppStatsStringAddress, jint detailedMap) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    char **ppStatsString = (char **)(uintptr_t)ppStatsStringAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaBuildStatsString(allocator, ppStatsString, (VkBool32)detailedMap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeStatsString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pStatsStringAddress) {
    VmaAllocator allocator = (VmaAllocator)(uintptr_t)allocatorAddress;
    char *pStatsString = (char *)(uintptr_t)pStatsStringAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeStatsString(allocator, pStatsString);
}

EXTERN_C_EXIT
