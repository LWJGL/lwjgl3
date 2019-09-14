/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <QuartzCore/CoreAnimation.h>

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreAnimation_nCALayerGetBounds(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong __result) {
    CALayer *_this = (CALayer *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    *((CGRect *)(intptr_t)__result) = _this.bounds;
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_macosx_CoreAnimation_nCALayerSetBounds(JNIEnv *__env, jclass clazz, jlong _thisAddress, jlong boundsAddress) {
    CALayer *_this = (CALayer *)(intptr_t)_thisAddress;
    CGRect *bounds = (CGRect *)(intptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    _this.bounds = *bounds;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreAnimation_CAMetalLayerLayer(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)[CAMetalLayer layer];
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_CoreAnimation_nCAMetalLayerNextDrawable(JNIEnv *__env, jclass clazz, jlong _thisAddress) {
    CAMetalLayer *_this = (CAMetalLayer *)(intptr_t)_thisAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)[_this nextDrawable];
}

EXTERN_C_EXIT
