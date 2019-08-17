/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "YGLayout.h"
#include <stddef.h>
#ifdef LWJGL_WINDOWS
    #define alignof __alignof
#else
    #include <stdalign.h>
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGLayout_offsets(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    jint *buffer = (jint *)(intptr_t)bufferAddress;

    UNUSED_PARAMS(__env, clazz)

    buffer[0] = (jint)offsetof(YGLayout, position);
    buffer[1] = (jint)offsetof(YGLayout, dimensions);
    buffer[2] = (jint)offsetof(YGLayout, margin);
    buffer[3] = (jint)offsetof(YGLayout, border);
    buffer[4] = (jint)offsetof(YGLayout, padding);
    buffer[5] = (jint)offsetof(YGLayout, computedFlexBasisGeneration);
    buffer[6] = (jint)offsetof(YGLayout, computedFlexBasis);
    buffer[7] = (jint)offsetof(YGLayout, generationCount);
    buffer[8] = (jint)offsetof(YGLayout, lastOwnerDirection);
    buffer[9] = (jint)offsetof(YGLayout, nextCachedMeasurementsIndex);
    buffer[10] = (jint)offsetof(YGLayout, cachedMeasurements);
    buffer[11] = (jint)offsetof(YGLayout, measuredDimensions);
    buffer[12] = (jint)offsetof(YGLayout, cachedLayout);

    buffer[13] = alignof(YGLayout);

    return sizeof(YGLayout);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_yoga_YGLayout_ndirection__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGLayout *buffer = (YGLayout *)(intptr_t)bufferAddress;
    return (jint)buffer->direction;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGLayout_ndidUseLegacyFlag__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGLayout *buffer = (YGLayout *)(intptr_t)bufferAddress;
    return (jboolean)buffer->didUseLegacyFlag;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGLayout_ndoesLegacyStretchFlagAffectsLayout__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGLayout *buffer = (YGLayout *)(intptr_t)bufferAddress;
    return (jboolean)buffer->doesLegacyStretchFlagAffectsLayout;
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_util_yoga_YGLayout_nhadOverflow__J(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    UNUSED_PARAMS(__env, clazz)
    YGLayout *buffer = (YGLayout *)(intptr_t)bufferAddress;
    return (jboolean)buffer->hadOverflow;
}

EXTERN_C_EXIT
