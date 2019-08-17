/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define ZDICT_STATIC_LINKING_ONLY
#include "zdict.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1trainFromBuffer(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictBufferCapacity, jlong samplesBufferAddress, jlong samplesSizesAddress, jint nbSamples) {
    void *dictBuffer = (void *)(intptr_t)dictBufferAddress;
    void const *samplesBuffer = (void const *)(intptr_t)samplesBufferAddress;
    size_t const *samplesSizes = (size_t const *)(intptr_t)samplesSizesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZDICT_trainFromBuffer(dictBuffer, (size_t)dictBufferCapacity, samplesBuffer, samplesSizes, (unsigned int)nbSamples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1getDictID(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictSize) {
    void const *dictBuffer = (void const *)(intptr_t)dictBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZDICT_getDictID(dictBuffer, (size_t)dictSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1isError(JNIEnv *__env, jclass clazz, jlong errorCode) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)ZDICT_isError((size_t)errorCode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1getErrorName(JNIEnv *__env, jclass clazz, jlong errorCode) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)ZDICT_getErrorName((size_t)errorCode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1trainFromBuffer_1cover(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictBufferCapacity, jlong samplesBufferAddress, jlong samplesSizesAddress, jint nbSamples, jlong parametersAddress) {
    void *dictBuffer = (void *)(intptr_t)dictBufferAddress;
    void const *samplesBuffer = (void const *)(intptr_t)samplesBufferAddress;
    size_t const *samplesSizes = (size_t const *)(intptr_t)samplesSizesAddress;
    ZDICT_cover_params_t *parameters = (ZDICT_cover_params_t *)(intptr_t)parametersAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZDICT_trainFromBuffer_cover(dictBuffer, (size_t)dictBufferCapacity, samplesBuffer, samplesSizes, (unsigned int)nbSamples, *parameters);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1optimizeTrainFromBuffer_1cover(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictBufferCapacity, jlong samplesBufferAddress, jlong samplesSizesAddress, jint nbSamples, jlong parametersAddress) {
    void *dictBuffer = (void *)(intptr_t)dictBufferAddress;
    void const *samplesBuffer = (void const *)(intptr_t)samplesBufferAddress;
    size_t const *samplesSizes = (size_t const *)(intptr_t)samplesSizesAddress;
    ZDICT_cover_params_t *parameters = (ZDICT_cover_params_t *)(intptr_t)parametersAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZDICT_optimizeTrainFromBuffer_cover(dictBuffer, (size_t)dictBufferCapacity, samplesBuffer, samplesSizes, (unsigned int)nbSamples, parameters);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1trainFromBuffer_1fastCover(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictBufferCapacity, jlong samplesBufferAddress, jlong samplesSizesAddress, jint nbSamples, jlong parametersAddress) {
    void *dictBuffer = (void *)(intptr_t)dictBufferAddress;
    void const *samplesBuffer = (void const *)(intptr_t)samplesBufferAddress;
    size_t const *samplesSizes = (size_t const *)(intptr_t)samplesSizesAddress;
    ZDICT_fastCover_params_t *parameters = (ZDICT_fastCover_params_t *)(intptr_t)parametersAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZDICT_trainFromBuffer_fastCover(dictBuffer, (size_t)dictBufferCapacity, samplesBuffer, samplesSizes, (unsigned)nbSamples, *parameters);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1optimizeTrainFromBuffer_1fastCover(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictBufferCapacity, jlong samplesBufferAddress, jlong samplesSizesAddress, jint nbSamples, jlong parametersAddress) {
    void *dictBuffer = (void *)(intptr_t)dictBufferAddress;
    void const *samplesBuffer = (void const *)(intptr_t)samplesBufferAddress;
    size_t const *samplesSizes = (size_t const *)(intptr_t)samplesSizesAddress;
    ZDICT_fastCover_params_t *parameters = (ZDICT_fastCover_params_t *)(intptr_t)parametersAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZDICT_optimizeTrainFromBuffer_fastCover(dictBuffer, (size_t)dictBufferCapacity, samplesBuffer, samplesSizes, (unsigned int)nbSamples, parameters);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_zstd_Zdict_nZDICT_1finalizeDictionary(JNIEnv *__env, jclass clazz, jlong dictBufferAddress, jlong dictBufferCapacity, jlong dictContentAddress, jlong dictContentSize, jlong samplesBufferAddress, jlong samplesSizesAddress, jint nbSamples, jlong parametersAddress) {
    void *dictBuffer = (void *)(intptr_t)dictBufferAddress;
    void const *dictContent = (void const *)(intptr_t)dictContentAddress;
    void const *samplesBuffer = (void const *)(intptr_t)samplesBufferAddress;
    size_t const *samplesSizes = (size_t const *)(intptr_t)samplesSizesAddress;
    ZDICT_params_t *parameters = (ZDICT_params_t *)(intptr_t)parametersAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ZDICT_finalizeDictionary(dictBuffer, (size_t)dictBufferCapacity, dictContent, (size_t)dictContentSize, samplesBuffer, samplesSizes, (unsigned int)nbSamples, *parameters);
}

EXTERN_C_EXIT
