/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define RMT_USE_OPENGL 1
#define RMT_ASSUME_LITTLE_ENDIAN 1
#ifdef LWJGL_LINUX
    #define RMT_USE_POSIX_THREADNAMES 1
#elif LWJGL_MACOS
    #define RMT_USE_METAL 1
#endif
#include "Remotery.c"
#ifdef LWJGL_MACOS
    #include "RemoteryMetal.mm"
#endif
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1GetLastErrorMessage(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_GetLastErrorMessage();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1Settings(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_Settings();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1CreateGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    Remotery **remotery = (Remotery **)(uintptr_t)remoteryAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_CreateGlobalInstance(remotery);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1DestroyGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    Remotery *remotery = (Remotery *)(uintptr_t)remoteryAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_DestroyGlobalInstance(remotery);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SetGlobalInstance(JNIEnv *__env, jclass clazz, jlong remoteryAddress) {
    Remotery *remotery = (Remotery *)(uintptr_t)remoteryAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_SetGlobalInstance(remotery);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1GetGlobalInstance(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_GetGlobalInstance();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SetCurrentThreadName(JNIEnv *__env, jclass clazz, jlong thread_nameAddress) {
    rmtPStr thread_name = (rmtPStr)(uintptr_t)thread_nameAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_SetCurrentThreadName(thread_name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1LogText(JNIEnv *__env, jclass clazz, jlong textAddress) {
    rmtPStr text = (rmtPStr)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_LogText(text);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1BeginCPUSample(JNIEnv *__env, jclass clazz, jlong nameAddress, jint flags, jlong hash_cacheAddress) {
    rmtPStr name = (rmtPStr)(uintptr_t)nameAddress;
    rmtU32 *hash_cache = (rmtU32 *)(uintptr_t)hash_cacheAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_BeginCPUSample(name, flags, hash_cache);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1EndCPUSample(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_EndCPUSample();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1MarkFrame(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_MarkFrame();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1PropertySnapshotAll(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_PropertySnapshotAll();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_rmt_1PropertyFrameResetAll(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    rmt_PropertyFrameResetAll();
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1IterateChildren(JNIEnv *__env, jclass clazz, jlong iterAddress, jlong sampleAddress) {
    rmtSampleIterator *iter = (rmtSampleIterator *)(uintptr_t)iterAddress;
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_IterateChildren(iter, sample);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1IterateNext(JNIEnv *__env, jclass clazz, jlong iterAddress) {
    rmtSampleIterator *iter = (rmtSampleIterator *)(uintptr_t)iterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_IterateNext(iter);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleTreeGetThreadName(JNIEnv *__env, jclass clazz, jlong sample_treeAddress) {
    rmtSampleTree *sample_tree = (rmtSampleTree *)(uintptr_t)sample_treeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_SampleTreeGetThreadName(sample_tree);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleTreeGetRootSample(JNIEnv *__env, jclass clazz, jlong sample_treeAddress) {
    rmtSampleTree *sample_tree = (rmtSampleTree *)(uintptr_t)sample_treeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_SampleTreeGetRootSample(sample_tree);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetName(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_SampleGetName(sample);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetNameHash(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_SampleGetNameHash(sample);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetCallCount(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_SampleGetCallCount(sample);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetStart(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)rmt_SampleGetStart(sample);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetTime(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)rmt_SampleGetTime(sample);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetSelfTime(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)rmt_SampleGetSelfTime(sample);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetColour(JNIEnv *__env, jclass clazz, jlong sampleAddress, jlong rAddress, jlong gAddress, jlong bAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    rmtU8 *r = (rmtU8 *)(uintptr_t)rAddress;
    rmtU8 *g = (rmtU8 *)(uintptr_t)gAddress;
    rmtU8 *b = (rmtU8 *)(uintptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_SampleGetColour(sample, r, g, b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1SampleGetType(JNIEnv *__env, jclass clazz, jlong sampleAddress) {
    rmtSample *sample = (rmtSample *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_SampleGetType(sample);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1PropertyIterateChildren(JNIEnv *__env, jclass clazz, jlong iterAddress, jlong sampleAddress) {
    rmtPropertyIterator *iter = (rmtPropertyIterator *)(uintptr_t)iterAddress;
    rmtProperty *sample = (rmtProperty *)(uintptr_t)sampleAddress;
    UNUSED_PARAMS(__env, clazz)
    rmt_PropertyIterateChildren(iter, sample);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1PropertyIterateNext(JNIEnv *__env, jclass clazz, jlong iterAddress) {
    rmtPropertyIterator *iter = (rmtPropertyIterator *)(uintptr_t)iterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_PropertyIterateNext(iter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1PropertyGetType(JNIEnv *__env, jclass clazz, jlong propertyAddress) {
    rmtProperty *property = (rmtProperty *)(uintptr_t)propertyAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)rmt_PropertyGetType(property);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1PropertyGetName(JNIEnv *__env, jclass clazz, jlong propertyAddress) {
    rmtProperty *property = (rmtProperty *)(uintptr_t)propertyAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_PropertyGetName(property);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1PropertyGetDescription(JNIEnv *__env, jclass clazz, jlong propertyAddress) {
    rmtProperty *property = (rmtProperty *)(uintptr_t)propertyAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)rmt_PropertyGetDescription(property);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_nrmt_1PropertyGetValue(JNIEnv *__env, jclass clazz, jlong propertyAddress, jlong __result) {
    rmtProperty *property = (rmtProperty *)(uintptr_t)propertyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((rmtPropertyValue*)(uintptr_t)__result) = rmt_PropertyGetValue(property);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_n_1rmt_1PropertySetValue(JNIEnv *__env, jclass clazz, jlong propertyAddress) {
    rmtProperty *property = (rmtProperty *)(uintptr_t)propertyAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_PropertySetValue(property);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_remotery_Remotery_n_1rmt_1PropertyAddValue(JNIEnv *__env, jclass clazz, jlong propertyAddress, jlong add_valueAddress) {
    rmtProperty *property = (rmtProperty *)(uintptr_t)propertyAddress;
    rmtPropertyValue *add_value = (rmtPropertyValue *)(uintptr_t)add_valueAddress;
    UNUSED_PARAMS(__env, clazz)
    _rmt_PropertyAddValue(property, *add_value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_remotery_Remotery_n_1rmt_1HashString32(JNIEnv *__env, jclass clazz, jlong sAddress, jint len, jint seed) {
    char const *s = (char const *)(uintptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)_rmt_HashString32(s, len, (rmtU32)seed);
}

EXTERN_C_EXIT
