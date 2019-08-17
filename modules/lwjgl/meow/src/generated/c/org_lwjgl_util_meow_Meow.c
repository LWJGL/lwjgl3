/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "meow_intrinsics.h"
#include "meow_hash.h"
#include "meow_more.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meow_Meow_nMeowU64From(JNIEnv *__env, jclass clazz, jlong HashAddress) {
    meow_hash *Hash = (meow_hash *)(intptr_t)HashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)MeowU64From(*Hash, 0);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meow_Meow_nMeowU32From(JNIEnv *__env, jclass clazz, jlong HashAddress) {
    meow_hash *Hash = (meow_hash *)(intptr_t)HashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)MeowU32From(*Hash, 0);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashesAreEqual(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress) {
    meow_hash *A = (meow_hash *)(intptr_t)AAddress;
    meow_hash *B = (meow_hash *)(intptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)MeowHashesAreEqual(*A, *B);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHash_1Accelerated(JNIEnv *__env, jclass clazz, jlong Seed, jlong TotalLengthInBytes, jlong SourceInitAddress, jlong __result) {
    void *SourceInit = (void *)(intptr_t)SourceInitAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_hash*)(intptr_t)__result) = MeowHash_Accelerated((meow_u64)Seed, (meow_u64)TotalLengthInBytes, SourceInit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashBegin(JNIEnv *__env, jclass clazz, jlong StateAddress) {
    meow_hash_state *State = (meow_hash_state *)(intptr_t)StateAddress;
    UNUSED_PARAMS(__env, clazz)
    MeowHashBegin(State);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashAbsorb(JNIEnv *__env, jclass clazz, jlong StateAddress, jlong Len, jlong SourceInitAddress) {
    meow_hash_state *State = (meow_hash_state *)(intptr_t)StateAddress;
    void *SourceInit = (void *)(intptr_t)SourceInitAddress;
    UNUSED_PARAMS(__env, clazz)
    MeowHashAbsorb(State, (meow_u64)Len, SourceInit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashEnd(JNIEnv *__env, jclass clazz, jlong StateAddress, jlong Seed, jlong __result) {
    meow_hash_state *State = (meow_hash_state *)(intptr_t)StateAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_hash*)(intptr_t)__result) = MeowHashEnd(State, (meow_u64)Seed);
}

EXTERN_C_EXIT
