/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "lwjgl_malloc.h"
DISABLE_WARNINGS()
#define VMA_IMPLEMENTATION
#define VMA_STATIC_VULKAN_FUNCTIONS 0
#define VMA_SYSTEM_ALIGNED_MALLOC(size, alignment) org_lwjgl_aligned_alloc((alignment), (size))
#define VMA_SYSTEM_FREE(ptr) org_lwjgl_aligned_free(ptr)
#define VMA_DEDICATED_ALLOCATION 1
#include "vk_mem_alloc.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateAllocator(JNIEnv *__env, jclass clazz, jlong pCreateInfoAddress, jlong pAllocatorAddress) {
    VmaAllocatorCreateInfo const *pCreateInfo = (VmaAllocatorCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocator *pAllocator = (VmaAllocator *)(intptr_t)pAllocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateAllocator(pCreateInfo, pAllocator);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyAllocator(JNIEnv *__env, jclass clazz, jlong allocatorAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyAllocator(allocator);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPhysicalDeviceProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppPhysicalDevicePropertiesAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkPhysicalDeviceProperties const **ppPhysicalDeviceProperties = (VkPhysicalDeviceProperties const **)(intptr_t)ppPhysicalDevicePropertiesAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetPhysicalDeviceProperties(allocator, ppPhysicalDeviceProperties);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetMemoryProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppPhysicalDeviceMemoryPropertiesAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkPhysicalDeviceMemoryProperties const **ppPhysicalDeviceMemoryProperties = (VkPhysicalDeviceMemoryProperties const **)(intptr_t)ppPhysicalDeviceMemoryPropertiesAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetMemoryProperties(allocator, ppPhysicalDeviceMemoryProperties);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetMemoryTypeProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeIndex, jlong pFlagsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkMemoryPropertyFlags *pFlags = (VkMemoryPropertyFlags *)(intptr_t)pFlagsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetMemoryTypeProperties(allocator, (uint32_t)memoryTypeIndex, pFlags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetCurrentFrameIndex(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint frameIndex) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaSetCurrentFrameIndex(allocator, (uint32_t)frameIndex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCalculateStats(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaStats *pStats = (VmaStats *)(intptr_t)pStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaCalculateStats(allocator, pStats);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBuildStatsString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppStatsStringAddress, jint detailedMap) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    char **ppStatsString = (char **)(intptr_t)ppStatsStringAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaBuildStatsString(allocator, ppStatsString, (VkBool32)detailedMap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeStatsString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pStatsStringAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    char *pStatsString = (char *)(intptr_t)pStatsStringAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeStatsString(allocator, pStatsString);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndex(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeBits, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(intptr_t)pMemoryTypeIndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFindMemoryTypeIndex(allocator, (uint32_t)memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForBufferInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(intptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(intptr_t)pMemoryTypeIndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFindMemoryTypeIndexForBufferInfo(allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForImageInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkImageCreateInfo const *pImageCreateInfo = (VkImageCreateInfo const *)(intptr_t)pImageCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(intptr_t)pMemoryTypeIndexAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreatePool(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pCreateInfoAddress, jlong pPoolAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPoolCreateInfo const *pCreateInfo = (VmaPoolCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaPool *pPool = (VmaPool *)(intptr_t)pPoolAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreatePool(allocator, pCreateInfo, pPool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyPool(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyPool(allocator, pool);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPoolStats(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong pPoolStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    VmaPoolStats *pPoolStats = (VmaPoolStats *)(intptr_t)pPoolStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetPoolStats(allocator, pool, pPoolStats);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaMakePoolAllocationsLost(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong pLostAllocationCountAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    size_t *pLostAllocationCount = (size_t *)(intptr_t)pLostAllocationCountAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaMakePoolAllocationsLost(allocator, pool, pLostAllocationCount);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCheckPoolCorruption(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCheckPoolCorruption(allocator, pool);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkMemoryRequirements const *pVkMemoryRequirements = (VkMemoryRequirements const *)(intptr_t)pVkMemoryRequirementsAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemory(allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryPages(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong allocationCount, jlong pAllocationsAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkMemoryRequirements const *pVkMemoryRequirements = (VkMemoryRequirements const *)(intptr_t)pVkMemoryRequirementsAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(intptr_t)pAllocationsAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemoryPages(allocator, pVkMemoryRequirements, pCreateInfo, (size_t)allocationCount, pAllocations, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong buffer, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemoryForBuffer(allocator, (VkBuffer)buffer, pCreateInfo, pAllocation, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong image, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaAllocateMemoryForImage(allocator, (VkImage)image, pCreateInfo, pAllocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeMemory(allocator, allocation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeMemoryPages(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationCount, jlong pAllocationsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(intptr_t)pAllocationsAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFreeMemoryPages(allocator, (size_t)allocationCount, pAllocations);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaResizeAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong newSize) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaResizeAllocation(allocator, allocation, (VkDeviceSize)newSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetAllocationInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaGetAllocationInfo(allocator, allocation, pAllocationInfo);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaTouchAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaTouchAllocation(allocator, allocation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetAllocationUserData(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pUserDataAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    void *pUserData = (void *)(intptr_t)pUserDataAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaSetAllocationUserData(allocator, allocation, pUserData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateLostAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pAllocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaCreateLostAllocation(allocator, pAllocation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaMapMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong ppDataAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    void **ppData = (void **)(intptr_t)ppDataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaMapMemory(allocator, allocation, ppData);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaUnmapMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaUnmapMemory(allocator, allocation);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFlushAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaFlushAllocation(allocator, allocation, (VkDeviceSize)offset, (VkDeviceSize)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaInvalidateAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaInvalidateAllocation(allocator, allocation, (VkDeviceSize)offset, (VkDeviceSize)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCheckCorruption(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeBits) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCheckCorruption(allocator, (uint32_t)memoryTypeBits);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragmentationBegin(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pInfoAddress, jlong pStatsAddress, jlong pContextAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaDefragmentationInfo2 const *pInfo = (VmaDefragmentationInfo2 const *)(intptr_t)pInfoAddress;
    VmaDefragmentationStats *pStats = (VmaDefragmentationStats *)(intptr_t)pStatsAddress;
    VmaDefragmentationContext *pContext = (VmaDefragmentationContext *)(intptr_t)pContextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaDefragmentationBegin(allocator, pInfo, pStats, pContext);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragmentationEnd(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong contextAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaDefragmentationContext context = (VmaDefragmentationContext)(intptr_t)contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaDefragmentationEnd(allocator, context);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragment(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pAllocationsAddress, jlong allocationCount, jlong pAllocationsChangedAddress, jlong pDefragmentationInfoAddress, jlong pDefragmentationStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(intptr_t)pAllocationsAddress;
    VkBool32 *pAllocationsChanged = (VkBool32 *)(intptr_t)pAllocationsChangedAddress;
    VmaDefragmentationInfo const *pDefragmentationInfo = (VmaDefragmentationInfo const *)(intptr_t)pDefragmentationInfoAddress;
    VmaDefragmentationStats *pDefragmentationStats = (VmaDefragmentationStats *)(intptr_t)pDefragmentationStatsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaDefragment(allocator, pAllocations, (size_t)allocationCount, pAllocationsChanged, pDefragmentationInfo, pDefragmentationStats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindBufferMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong buffer) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBindBufferMemory(allocator, allocation, (VkBuffer)buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindImageMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong image) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaBindImageMemory(allocator, allocation, (VkImage)image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pBufferAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(intptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    VkBuffer *pBuffer = (VkBuffer *)(intptr_t)pBufferAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateBuffer(allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong buffer, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyBuffer(allocator, (VkBuffer)buffer, allocation);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pImageAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkImageCreateInfo const *pImageCreateInfo = (VkImageCreateInfo const *)(intptr_t)pImageCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    VkImage *pImage = (VkImage *)(intptr_t)pImageAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)vmaCreateImage(allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong image, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    UNUSED_PARAMS(__env, clazz)
    vmaDestroyImage(allocator, (VkImage)image, allocation);
}

EXTERN_C_EXIT
