/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI_Vk.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetInstanceExtensionsVk__JJJ(JNIEnv *__env, jclass clazz, jlong luidAddress, jlong extensionNamesAddress, jlong inoutExtensionNamesSizeAddress) {
    ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(uintptr_t)luidAddress;
    char *extensionNames = (char *)(uintptr_t)extensionNamesAddress;
    uint32_t *inoutExtensionNamesSize = (uint32_t *)(uintptr_t)inoutExtensionNamesSizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetInstanceExtensionsVk(*luid, extensionNames, inoutExtensionNamesSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetDeviceExtensionsVk__JJJ(JNIEnv *__env, jclass clazz, jlong luidAddress, jlong extensionNamesAddress, jlong inoutExtensionNamesSizeAddress) {
    ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(uintptr_t)luidAddress;
    char *extensionNames = (char *)(uintptr_t)extensionNamesAddress;
    uint32_t *inoutExtensionNamesSize = (uint32_t *)(uintptr_t)inoutExtensionNamesSizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetDeviceExtensionsVk(*luid, extensionNames, inoutExtensionNamesSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetSessionPhysicalDeviceVk(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong luidAddress, jlong instanceAddress, jlong out_physicalDeviceAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(uintptr_t)luidAddress;
    VkInstance instance = (VkInstance)(uintptr_t)instanceAddress;
    VkPhysicalDevice *out_physicalDevice = (VkPhysicalDevice *)(uintptr_t)out_physicalDeviceAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetSessionPhysicalDeviceVk(session, *luid, instance, out_physicalDevice);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1SetSynchronizationQueueVk(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong queueAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    VkQueue queue = (VkQueue)(uintptr_t)queueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_SetSynchronizationQueueVk(session, queue);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1CreateTextureSwapChainVk(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong deviceAddress, jlong descAddress, jlong out_TextureSwapChainAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    VkDevice device = (VkDevice)(uintptr_t)deviceAddress;
    ovrTextureSwapChainDesc const *desc = (ovrTextureSwapChainDesc const *)(uintptr_t)descAddress;
    ovrTextureSwapChain *out_TextureSwapChain = (ovrTextureSwapChain *)(uintptr_t)out_TextureSwapChainAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_CreateTextureSwapChainVk(session, device, desc, out_TextureSwapChain);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetTextureSwapChainBufferVk__JJIJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jint index, jlong out_ImageAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    VkImage *out_Image = (VkImage *)(uintptr_t)out_ImageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetTextureSwapChainBufferVk(session, chain, index, out_Image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1CreateMirrorTextureWithOptionsVk(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong deviceAddress, jlong descAddress, jlong out_MirrorTextureAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    VkDevice device = (VkDevice)(uintptr_t)deviceAddress;
    ovrMirrorTextureDesc const *desc = (ovrMirrorTextureDesc const *)(uintptr_t)descAddress;
    ovrMirrorTexture *out_MirrorTexture = (ovrMirrorTexture *)(uintptr_t)out_MirrorTextureAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_CreateMirrorTextureWithOptionsVk(session, device, desc, out_MirrorTexture);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetMirrorTextureBufferVk__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress, jlong out_ImageAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(uintptr_t)mirrorTextureAddress;
    VkImage *out_Image = (VkImage *)(uintptr_t)out_ImageAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ovr_GetMirrorTextureBufferVk(session, mirrorTexture, out_Image);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetInstanceExtensionsVk__JJ_3I(JNIEnv *__env, jclass clazz, jlong luidAddress, jlong extensionNamesAddress, jintArray inoutExtensionNamesSizeAddress) {
    ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(uintptr_t)luidAddress;
    char *extensionNames = (char *)(uintptr_t)extensionNamesAddress;
    jint __result;
    jint *inoutExtensionNamesSize = (*__env)->GetIntArrayElements(__env, inoutExtensionNamesSizeAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetInstanceExtensionsVk(*luid, extensionNames, (uint32_t *)inoutExtensionNamesSize);
    (*__env)->ReleaseIntArrayElements(__env, inoutExtensionNamesSizeAddress, inoutExtensionNamesSize, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetDeviceExtensionsVk__JJ_3I(JNIEnv *__env, jclass clazz, jlong luidAddress, jlong extensionNamesAddress, jintArray inoutExtensionNamesSizeAddress) {
    ovrGraphicsLuid *luid = (ovrGraphicsLuid *)(uintptr_t)luidAddress;
    char *extensionNames = (char *)(uintptr_t)extensionNamesAddress;
    jint __result;
    jint *inoutExtensionNamesSize = (*__env)->GetIntArrayElements(__env, inoutExtensionNamesSizeAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetDeviceExtensionsVk(*luid, extensionNames, (uint32_t *)inoutExtensionNamesSize);
    (*__env)->ReleaseIntArrayElements(__env, inoutExtensionNamesSizeAddress, inoutExtensionNamesSize, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetTextureSwapChainBufferVk__JJI_3J(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jint index, jlongArray out_ImageAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(uintptr_t)chainAddress;
    jint __result;
    jlong *out_Image = (*__env)->GetLongArrayElements(__env, out_ImageAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetTextureSwapChainBufferVk(session, chain, index, (VkImage *)out_Image);
    (*__env)->ReleaseLongArrayElements(__env, out_ImageAddress, out_Image, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRVk_novr_1GetMirrorTextureBufferVk__JJ_3J(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress, jlongArray out_ImageAddress) {
    ovrSession session = (ovrSession)(uintptr_t)sessionAddress;
    ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(uintptr_t)mirrorTextureAddress;
    jint __result;
    jlong *out_Image = (*__env)->GetLongArrayElements(__env, out_ImageAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)ovr_GetMirrorTextureBufferVk(session, mirrorTexture, (VkImage *)out_Image);
    (*__env)->ReleaseLongArrayElements(__env, out_ImageAddress, out_Image, 0);
    return __result;
}

EXTERN_C_EXIT
