/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "OVR_CAPI_GL.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1CreateTextureSwapChainGL(jlong sessionAddress, jlong descAddress, jlong out_TextureSwapChainAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChainDesc const *desc = (ovrTextureSwapChainDesc const *)(intptr_t)descAddress;
    ovrTextureSwapChain *out_TextureSwapChain = (ovrTextureSwapChain *)(intptr_t)out_TextureSwapChainAddress;
    return (jint)ovr_CreateTextureSwapChainGL(session, desc, out_TextureSwapChain);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateTextureSwapChainGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong descAddress, jlong out_TextureSwapChainAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1CreateTextureSwapChainGL(sessionAddress, descAddress, out_TextureSwapChainAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJIJ(jlong sessionAddress, jlong chainAddress, jint index, jlong out_TexIdAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrTextureSwapChain chain = (ovrTextureSwapChain)(intptr_t)chainAddress;
    unsigned int *out_TexId = (unsigned int *)(intptr_t)out_TexIdAddress;
    return (jint)ovr_GetTextureSwapChainBufferGL(session, chain, index, out_TexId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJIJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jint index, jlong out_TexIdAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJIJ(sessionAddress, chainAddress, index, out_TexIdAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureWithOptionsGL(jlong sessionAddress, jlong descAddress, jlong out_MirrorTextureAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrMirrorTextureDesc const *desc = (ovrMirrorTextureDesc const *)(intptr_t)descAddress;
    ovrMirrorTexture *out_MirrorTexture = (ovrMirrorTexture *)(intptr_t)out_MirrorTextureAddress;
    return (jint)ovr_CreateMirrorTextureWithOptionsGL(session, desc, out_MirrorTexture);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureWithOptionsGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong descAddress, jlong out_MirrorTextureAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureWithOptionsGL(sessionAddress, descAddress, out_MirrorTextureAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureGL(jlong sessionAddress, jlong descAddress, jlong out_MirrorTextureAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrMirrorTextureDesc const *desc = (ovrMirrorTextureDesc const *)(intptr_t)descAddress;
    ovrMirrorTexture *out_MirrorTexture = (ovrMirrorTexture *)(intptr_t)out_MirrorTextureAddress;
    return (jint)ovr_CreateMirrorTextureGL(session, desc, out_MirrorTexture);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureGL(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong descAddress, jlong out_MirrorTextureAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1CreateMirrorTextureGL(sessionAddress, descAddress, out_MirrorTextureAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJJ(jlong sessionAddress, jlong mirrorTextureAddress, jlong out_TexIdAddress) {
    ovrSession session = (ovrSession)(intptr_t)sessionAddress;
    ovrMirrorTexture mirrorTexture = (ovrMirrorTexture)(intptr_t)mirrorTextureAddress;
    unsigned int *out_TexId = (unsigned int *)(intptr_t)out_TexIdAddress;
    return (jint)ovr_GetMirrorTextureBufferGL(session, mirrorTexture, out_TexId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJJ(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress, jlong out_TexIdAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJJ(sessionAddress, mirrorTextureAddress, out_TexIdAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJI_3I(jlong sessionAddress, jlong chainAddress, jint index, jint out_TexId__length, jint* out_TexId) {
    UNUSED_PARAM(out_TexId__length)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJIJ(sessionAddress, chainAddress, index, (intptr_t)out_TexId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJI_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong chainAddress, jint index, jintArray out_TexIdAddress) {
    jint __result;
    jint *out_TexId = (*__env)->GetPrimitiveArrayCritical(__env, out_TexIdAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetTextureSwapChainBufferGL__JJIJ(sessionAddress, chainAddress, index, (intptr_t)out_TexId);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_TexIdAddress, out_TexId, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJ_3I(jlong sessionAddress, jlong mirrorTextureAddress, jint out_TexId__length, jint* out_TexId) {
    UNUSED_PARAM(out_TexId__length)
    return JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJJ(sessionAddress, mirrorTextureAddress, (intptr_t)out_TexId);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJ_3I(JNIEnv *__env, jclass clazz, jlong sessionAddress, jlong mirrorTextureAddress, jintArray out_TexIdAddress) {
    jint __result;
    jint *out_TexId = (*__env)->GetPrimitiveArrayCritical(__env, out_TexIdAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_ovr_OVRGL_novr_1GetMirrorTextureBufferGL__JJJ(sessionAddress, mirrorTextureAddress, (intptr_t)out_TexId);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_TexIdAddress, out_TexId, 0);
    return __result;
}

EXTERN_C_EXIT
