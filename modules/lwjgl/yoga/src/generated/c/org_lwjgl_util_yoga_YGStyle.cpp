/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "YGStyle.h"
#include <stddef.h>
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(intptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = (jint)offsetof(YGStyle, flex);
    buffer[1] = (jint)offsetof(YGStyle, flexGrow);
    buffer[2] = (jint)offsetof(YGStyle, flexShrink);
    buffer[3] = (jint)offsetof(YGStyle, flexBasis);
    buffer[4] = (jint)offsetof(YGStyle, margin);
    buffer[5] = (jint)offsetof(YGStyle, position);
    buffer[6] = (jint)offsetof(YGStyle, padding);
    buffer[7] = (jint)offsetof(YGStyle, border);
    buffer[8] = (jint)offsetof(YGStyle, dimensions);
    buffer[9] = (jint)offsetof(YGStyle, minDimensions);
    buffer[10] = (jint)offsetof(YGStyle, maxDimensions);
    buffer[11] = (jint)offsetof(YGStyle, aspectRatio);

    buffer[12] = alignof(YGStyle);

    return sizeof(YGStyle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_ndirection__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->direction;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_nflexDirection__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->flexDirection;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_njustifyContent__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->justifyContent;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_nalignContent__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->alignContent;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_nalignItems__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->alignItems;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_nalignSelf__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->alignSelf;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_npositionType__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->positionType;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_nflexWrap__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->flexWrap;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_noverflow__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->overflow;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGStyle_ndisplay__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGStyle *buffer = (YGStyle *)(intptr_t)bufferAddress;
    return (jint)buffer->display;
}

EXTERN_C_EXIT
