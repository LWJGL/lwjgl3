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

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaCreateAllocator(jlong pCreateInfoAddress, jlong pAllocatorAddress) {
    VmaAllocatorCreateInfo const *pCreateInfo = (VmaAllocatorCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocator *pAllocator = (VmaAllocator *)(intptr_t)pAllocatorAddress;
    return (jint)vmaCreateAllocator(pCreateInfo, pAllocator);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateAllocator(JNIEnv *__env, jclass clazz, jlong pCreateInfoAddress, jlong pAllocatorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaCreateAllocator(pCreateInfoAddress, pAllocatorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyAllocator(jlong allocatorAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    vmaDestroyAllocator(allocator);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyAllocator(JNIEnv *__env, jclass clazz, jlong allocatorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyAllocator(allocatorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetPhysicalDeviceProperties(jlong allocatorAddress, jlong ppPhysicalDevicePropertiesAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkPhysicalDeviceProperties const **ppPhysicalDeviceProperties = (VkPhysicalDeviceProperties const **)(intptr_t)ppPhysicalDevicePropertiesAddress;
    vmaGetPhysicalDeviceProperties(allocator, ppPhysicalDeviceProperties);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPhysicalDeviceProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppPhysicalDevicePropertiesAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetPhysicalDeviceProperties(allocatorAddress, ppPhysicalDevicePropertiesAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetMemoryProperties(jlong allocatorAddress, jlong ppPhysicalDeviceMemoryPropertiesAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkPhysicalDeviceMemoryProperties const **ppPhysicalDeviceMemoryProperties = (VkPhysicalDeviceMemoryProperties const **)(intptr_t)ppPhysicalDeviceMemoryPropertiesAddress;
    vmaGetMemoryProperties(allocator, ppPhysicalDeviceMemoryProperties);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetMemoryProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppPhysicalDeviceMemoryPropertiesAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetMemoryProperties(allocatorAddress, ppPhysicalDeviceMemoryPropertiesAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetMemoryTypeProperties(jlong allocatorAddress, jint memoryTypeIndex, jlong pFlagsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkMemoryPropertyFlags *pFlags = (VkMemoryPropertyFlags *)(intptr_t)pFlagsAddress;
    vmaGetMemoryTypeProperties(allocator, (uint32_t)memoryTypeIndex, pFlags);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetMemoryTypeProperties(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeIndex, jlong pFlagsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetMemoryTypeProperties(allocatorAddress, memoryTypeIndex, pFlagsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaSetCurrentFrameIndex(jlong allocatorAddress, jint frameIndex) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    vmaSetCurrentFrameIndex(allocator, (uint32_t)frameIndex);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetCurrentFrameIndex(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint frameIndex) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaSetCurrentFrameIndex(allocatorAddress, frameIndex);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaCalculateStats(jlong allocatorAddress, jlong pStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaStats *pStats = (VmaStats *)(intptr_t)pStatsAddress;
    vmaCalculateStats(allocator, pStats);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCalculateStats(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pStatsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaCalculateStats(allocatorAddress, pStatsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaBuildStatsString(jlong allocatorAddress, jlong ppStatsStringAddress, jint detailedMap) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    char **ppStatsString = (char **)(intptr_t)ppStatsStringAddress;
    vmaBuildStatsString(allocator, ppStatsString, (VkBool32)detailedMap);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBuildStatsString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong ppStatsStringAddress, jint detailedMap) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaBuildStatsString(allocatorAddress, ppStatsStringAddress, detailedMap);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFreeStatsString(jlong allocatorAddress, jlong pStatsStringAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    char *pStatsString = (char *)(intptr_t)pStatsStringAddress;
    vmaFreeStatsString(allocator, pStatsString);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeStatsString(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pStatsStringAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaFreeStatsString(allocatorAddress, pStatsStringAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndex(jlong allocatorAddress, jint memoryTypeBits, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(intptr_t)pMemoryTypeIndexAddress;
    return (jint)vmaFindMemoryTypeIndex(allocator, (uint32_t)memoryTypeBits, pAllocationCreateInfo, pMemoryTypeIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndex(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeBits, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndex(allocatorAddress, memoryTypeBits, pAllocationCreateInfoAddress, pMemoryTypeIndexAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForBufferInfo(jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(intptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(intptr_t)pMemoryTypeIndexAddress;
    return (jint)vmaFindMemoryTypeIndexForBufferInfo(allocator, pBufferCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForBufferInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForBufferInfo(allocatorAddress, pBufferCreateInfoAddress, pAllocationCreateInfoAddress, pMemoryTypeIndexAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForImageInfo(jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkImageCreateInfo const *pImageCreateInfo = (VkImageCreateInfo const *)(intptr_t)pImageCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    uint32_t *pMemoryTypeIndex = (uint32_t *)(intptr_t)pMemoryTypeIndexAddress;
    return (jint)vmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo, pAllocationCreateInfo, pMemoryTypeIndex);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForImageInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pMemoryTypeIndexAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaFindMemoryTypeIndexForImageInfo(allocatorAddress, pImageCreateInfoAddress, pAllocationCreateInfoAddress, pMemoryTypeIndexAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaCreatePool(jlong allocatorAddress, jlong pCreateInfoAddress, jlong pPoolAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPoolCreateInfo const *pCreateInfo = (VmaPoolCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaPool *pPool = (VmaPool *)(intptr_t)pPoolAddress;
    return (jint)vmaCreatePool(allocator, pCreateInfo, pPool);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreatePool(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pCreateInfoAddress, jlong pPoolAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaCreatePool(allocatorAddress, pCreateInfoAddress, pPoolAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyPool(jlong allocatorAddress, jlong poolAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    vmaDestroyPool(allocator, pool);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyPool(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyPool(allocatorAddress, poolAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetPoolStats(jlong allocatorAddress, jlong poolAddress, jlong pPoolStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    VmaPoolStats *pPoolStats = (VmaPoolStats *)(intptr_t)pPoolStatsAddress;
    vmaGetPoolStats(allocator, pool, pPoolStats);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetPoolStats(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong pPoolStatsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetPoolStats(allocatorAddress, poolAddress, pPoolStatsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaMakePoolAllocationsLost(jlong allocatorAddress, jlong poolAddress, jlong pLostAllocationCountAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    size_t *pLostAllocationCount = (size_t *)(intptr_t)pLostAllocationCountAddress;
    vmaMakePoolAllocationsLost(allocator, pool, pLostAllocationCount);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaMakePoolAllocationsLost(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress, jlong pLostAllocationCountAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaMakePoolAllocationsLost(allocatorAddress, poolAddress, pLostAllocationCountAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaCheckPoolCorruption(jlong allocatorAddress, jlong poolAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaPool pool = (VmaPool)(intptr_t)poolAddress;
    return (jint)vmaCheckPoolCorruption(allocator, pool);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCheckPoolCorruption(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong poolAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaCheckPoolCorruption(allocatorAddress, poolAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaAllocateMemory(jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkMemoryRequirements const *pVkMemoryRequirements = (VkMemoryRequirements const *)(intptr_t)pVkMemoryRequirementsAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    return (jint)vmaAllocateMemory(allocator, pVkMemoryRequirements, pCreateInfo, pAllocation, pAllocationInfo);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaAllocateMemory(allocatorAddress, pVkMemoryRequirementsAddress, pCreateInfoAddress, pAllocationAddress, pAllocationInfoAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_vma_Vma_nvmaAllocateMemoryPages)(jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong allocationCount, jlong pAllocationsAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkMemoryRequirements const *pVkMemoryRequirements = (VkMemoryRequirements const *)(intptr_t)pVkMemoryRequirementsAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(intptr_t)pAllocationsAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    return (jint)vmaAllocateMemoryPages(allocator, pVkMemoryRequirements, pCreateInfo, (size_t)allocationCount, pAllocations, pAllocationInfo);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryPages(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pVkMemoryRequirementsAddress, jlong pCreateInfoAddress, jlong allocationCount, jlong pAllocationsAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_vma_Vma_nvmaAllocateMemoryPages)(allocatorAddress, pVkMemoryRequirementsAddress, pCreateInfoAddress, allocationCount, pAllocationsAddress, pAllocationInfoAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForBuffer(jlong allocatorAddress, jlong buffer, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    return (jint)vmaAllocateMemoryForBuffer(allocator, (VkBuffer)buffer, pCreateInfo, pAllocation, pAllocationInfo);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong buffer, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForBuffer(allocatorAddress, buffer, pCreateInfoAddress, pAllocationAddress, pAllocationInfoAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForImage(jlong allocatorAddress, jlong image, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocationCreateInfo const *pCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pCreateInfoAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    return (jint)vmaAllocateMemoryForImage(allocator, (VkImage)image, pCreateInfo, pAllocation, pAllocationInfo);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong image, jlong pCreateInfoAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaAllocateMemoryForImage(allocatorAddress, image, pCreateInfoAddress, pAllocationAddress, pAllocationInfoAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFreeMemory(jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    vmaFreeMemory(allocator, allocation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaFreeMemory(allocatorAddress, allocationAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFreeMemoryPages(jlong allocatorAddress, jlong allocationCount, jlong pAllocationsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(intptr_t)pAllocationsAddress;
    vmaFreeMemoryPages(allocator, (size_t)allocationCount, pAllocations);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFreeMemoryPages(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationCount, jlong pAllocationsAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaFreeMemoryPages(allocatorAddress, allocationCount, pAllocationsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaResizeAllocation(jlong allocatorAddress, jlong allocationAddress, jlong newSize) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    return (jint)vmaResizeAllocation(allocator, allocation, (VkDeviceSize)newSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaResizeAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong newSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaResizeAllocation(allocatorAddress, allocationAddress, newSize);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetAllocationInfo(jlong allocatorAddress, jlong allocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    vmaGetAllocationInfo(allocator, allocation, pAllocationInfo);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaGetAllocationInfo(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaGetAllocationInfo(allocatorAddress, allocationAddress, pAllocationInfoAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaTouchAllocation(jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    return (jint)vmaTouchAllocation(allocator, allocation);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaTouchAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaTouchAllocation(allocatorAddress, allocationAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaSetAllocationUserData(jlong allocatorAddress, jlong allocationAddress, jlong pUserDataAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    void *pUserData = (void *)(intptr_t)pUserDataAddress;
    vmaSetAllocationUserData(allocator, allocation, pUserData);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaSetAllocationUserData(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong pUserDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaSetAllocationUserData(allocatorAddress, allocationAddress, pUserDataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaCreateLostAllocation(jlong allocatorAddress, jlong pAllocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    vmaCreateLostAllocation(allocator, pAllocation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateLostAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pAllocationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaCreateLostAllocation(allocatorAddress, pAllocationAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaMapMemory(jlong allocatorAddress, jlong allocationAddress, jlong ppDataAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    void **ppData = (void **)(intptr_t)ppDataAddress;
    return (jint)vmaMapMemory(allocator, allocation, ppData);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaMapMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong ppDataAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaMapMemory(allocatorAddress, allocationAddress, ppDataAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaUnmapMemory(jlong allocatorAddress, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    vmaUnmapMemory(allocator, allocation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaUnmapMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaUnmapMemory(allocatorAddress, allocationAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaFlushAllocation(jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    vmaFlushAllocation(allocator, allocation, (VkDeviceSize)offset, (VkDeviceSize)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaFlushAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaFlushAllocation(allocatorAddress, allocationAddress, offset, size);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaInvalidateAllocation(jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    vmaInvalidateAllocation(allocator, allocation, (VkDeviceSize)offset, (VkDeviceSize)size);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaInvalidateAllocation(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong offset, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaInvalidateAllocation(allocatorAddress, allocationAddress, offset, size);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaCheckCorruption(jlong allocatorAddress, jint memoryTypeBits) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    return (jint)vmaCheckCorruption(allocator, (uint32_t)memoryTypeBits);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCheckCorruption(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jint memoryTypeBits) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaCheckCorruption(allocatorAddress, memoryTypeBits);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaDefragmentationBegin(jlong allocatorAddress, jlong pInfoAddress, jlong pStatsAddress, jlong pContextAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaDefragmentationInfo2 const *pInfo = (VmaDefragmentationInfo2 const *)(intptr_t)pInfoAddress;
    VmaDefragmentationStats *pStats = (VmaDefragmentationStats *)(intptr_t)pStatsAddress;
    VmaDefragmentationContext *pContext = (VmaDefragmentationContext *)(intptr_t)pContextAddress;
    return (jint)vmaDefragmentationBegin(allocator, pInfo, pStats, pContext);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragmentationBegin(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pInfoAddress, jlong pStatsAddress, jlong pContextAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaDefragmentationBegin(allocatorAddress, pInfoAddress, pStatsAddress, pContextAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaDefragmentationEnd(jlong allocatorAddress, jlong contextAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaDefragmentationContext context = (VmaDefragmentationContext)(intptr_t)contextAddress;
    return (jint)vmaDefragmentationEnd(allocator, context);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragmentationEnd(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong contextAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaDefragmentationEnd(allocatorAddress, contextAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_vma_Vma_nvmaDefragment)(jlong allocatorAddress, jlong pAllocationsAddress, jlong allocationCount, jlong pAllocationsChangedAddress, jlong pDefragmentationInfoAddress, jlong pDefragmentationStatsAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation *pAllocations = (VmaAllocation *)(intptr_t)pAllocationsAddress;
    VkBool32 *pAllocationsChanged = (VkBool32 *)(intptr_t)pAllocationsChangedAddress;
    VmaDefragmentationInfo const *pDefragmentationInfo = (VmaDefragmentationInfo const *)(intptr_t)pDefragmentationInfoAddress;
    VmaDefragmentationStats *pDefragmentationStats = (VmaDefragmentationStats *)(intptr_t)pDefragmentationStatsAddress;
    return (jint)vmaDefragment(allocator, pAllocations, (size_t)allocationCount, pAllocationsChanged, pDefragmentationInfo, pDefragmentationStats);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDefragment(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pAllocationsAddress, jlong allocationCount, jlong pAllocationsChangedAddress, jlong pDefragmentationInfoAddress, jlong pDefragmentationStatsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_vma_Vma_nvmaDefragment)(allocatorAddress, pAllocationsAddress, allocationCount, pAllocationsChangedAddress, pDefragmentationInfoAddress, pDefragmentationStatsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaBindBufferMemory(jlong allocatorAddress, jlong allocationAddress, jlong buffer) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    return (jint)vmaBindBufferMemory(allocator, allocation, (VkBuffer)buffer);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindBufferMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong buffer) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaBindBufferMemory(allocatorAddress, allocationAddress, buffer);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaBindImageMemory(jlong allocatorAddress, jlong allocationAddress, jlong image) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    return (jint)vmaBindImageMemory(allocator, allocation, (VkImage)image);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaBindImageMemory(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong allocationAddress, jlong image) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_vma_Vma_nvmaBindImageMemory(allocatorAddress, allocationAddress, image);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_vma_Vma_nvmaCreateBuffer)(jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pBufferAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkBufferCreateInfo const *pBufferCreateInfo = (VkBufferCreateInfo const *)(intptr_t)pBufferCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    VkBuffer *pBuffer = (VkBuffer *)(intptr_t)pBufferAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    return (jint)vmaCreateBuffer(allocator, pBufferCreateInfo, pAllocationCreateInfo, pBuffer, pAllocation, pAllocationInfo);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pBufferCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pBufferAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_vma_Vma_nvmaCreateBuffer)(allocatorAddress, pBufferCreateInfoAddress, pAllocationCreateInfoAddress, pBufferAddress, pAllocationAddress, pAllocationInfoAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyBuffer(jlong allocatorAddress, jlong buffer, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    vmaDestroyBuffer(allocator, (VkBuffer)buffer, allocation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyBuffer(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong buffer, jlong allocationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyBuffer(allocatorAddress, buffer, allocationAddress);
}

JNIEXPORT_CRITICAL jint JNICALL CRITICAL(org_lwjgl_util_vma_Vma_nvmaCreateImage)(jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pImageAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VkImageCreateInfo const *pImageCreateInfo = (VkImageCreateInfo const *)(intptr_t)pImageCreateInfoAddress;
    VmaAllocationCreateInfo const *pAllocationCreateInfo = (VmaAllocationCreateInfo const *)(intptr_t)pAllocationCreateInfoAddress;
    VkImage *pImage = (VkImage *)(intptr_t)pImageAddress;
    VmaAllocation *pAllocation = (VmaAllocation *)(intptr_t)pAllocationAddress;
    VmaAllocationInfo *pAllocationInfo = (VmaAllocationInfo *)(intptr_t)pAllocationInfoAddress;
    return (jint)vmaCreateImage(allocator, pImageCreateInfo, pAllocationCreateInfo, pImage, pAllocation, pAllocationInfo);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_vma_Vma_nvmaCreateImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong pImageCreateInfoAddress, jlong pAllocationCreateInfoAddress, jlong pImageAddress, jlong pAllocationAddress, jlong pAllocationInfoAddress) {
    UNUSED_PARAMS(__env, clazz)
    return CRITICAL(org_lwjgl_util_vma_Vma_nvmaCreateImage)(allocatorAddress, pImageCreateInfoAddress, pAllocationCreateInfoAddress, pImageAddress, pAllocationAddress, pAllocationInfoAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyImage(jlong allocatorAddress, jlong image, jlong allocationAddress) {
    VmaAllocator allocator = (VmaAllocator)(intptr_t)allocatorAddress;
    VmaAllocation allocation = (VmaAllocation)(intptr_t)allocationAddress;
    vmaDestroyImage(allocator, (VkImage)image, allocation);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_vma_Vma_nvmaDestroyImage(JNIEnv *__env, jclass clazz, jlong allocatorAddress, jlong image, jlong allocationAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_vma_Vma_nvmaDestroyImage(allocatorAddress, image, allocationAddress);
}

EXTERN_C_EXIT
