/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <vulkan/vulkan.h>
DISABLE_WARNINGS()
#define RMT_USE_OPENGL 1
#define RMT_USE_VULKAN 1
#define RMT_ASSUME_LITTLE_ENDIAN 1
#ifdef LWJGL_LINUX
    #define RMT_USE_POSIX_THREADNAMES 1
#elif LWJGL_MACOS
    #define RMT_USE_METAL 1
#endif
#include "Remotery.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryVulkan_nrmt_1BindVulkan(JNIEnv *__env, jclass clazz, jlong instanceAddress, jlong physical_deviceAddress, jlong deviceAddress, jlong queueAddress, jlong funcsAddress, jlong out_bindAddress) {
    VkInstance instance = (VkInstance)(uintptr_t)instanceAddress;
    VkPhysicalDevice physical_device = (VkPhysicalDevice)(uintptr_t)physical_deviceAddress;
    VkDevice device = (VkDevice)(uintptr_t)deviceAddress;
    VkQueue queue = (VkQueue)(uintptr_t)queueAddress;
    rmtVulkanFunctions const *funcs = (rmtVulkanFunctions const *)(uintptr_t)funcsAddress;
    rmtVulkanBind **out_bind = (rmtVulkanBind **)(uintptr_t)out_bindAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_BindVulkan(instance, physical_device, device, queue, funcs, out_bind);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryVulkan_nrmt_1UnbindVulkan(JNIEnv *__env, jclass clazz, jlong bindAddress) {
    rmtVulkanBind *bind = (rmtVulkanBind *)(uintptr_t)bindAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_UnbindVulkan(bind);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryVulkan_nrmt_1BeginVulkanSample(JNIEnv *__env, jclass clazz, jlong bindAddress, jlong command_bufferAddress, jlong nameAddress, jlong hash_cacheAddress) {
    rmtVulkanBind *bind = (rmtVulkanBind *)(uintptr_t)bindAddress;
    VkCommandBuffer command_buffer = (VkCommandBuffer)(uintptr_t)command_bufferAddress;
    rmtPStr name = (rmtPStr)(uintptr_t)nameAddress;
    rmtU32 *hash_cache = (rmtU32 *)(uintptr_t)hash_cacheAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_BeginVulkanSample(bind, command_buffer, name, hash_cache);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_RemoteryVulkan_rmt_1EndVulkanSample(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_EndVulkanSample();
}

EXTERN_C_EXIT
