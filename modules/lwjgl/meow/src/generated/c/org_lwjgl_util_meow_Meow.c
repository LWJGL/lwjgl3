/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "meow_intrinsics.h"
#include "meow_hash.h"

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_meow_Meow_nMeowU64From(JNIEnv *__env, jclass clazz, jlong HashAddress) {
    meow_u128 *Hash = (meow_u128 *)(intptr_t)HashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)MeowU64From(*Hash);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meow_Meow_nMeowU32From(JNIEnv *__env, jclass clazz, jlong HashAddress) {
    meow_u128 *Hash = (meow_u128 *)(intptr_t)HashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)MeowU32From(*Hash);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashesAreEqual(JNIEnv *__env, jclass clazz, jlong AAddress, jlong BAddress) {
    meow_u128 *A = (meow_u128 *)(intptr_t)AAddress;
    meow_u128 *B = (meow_u128 *)(intptr_t)BAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)MeowHashesAreEqual(*A, *B);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHash1__JJJJ(JNIEnv *__env, jclass clazz, jlong Seed, jlong TotalLengthInBytes, jlong SourceInitAddress, jlong __result) {
    void *SourceInit = (void *)(intptr_t)SourceInitAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_u128*)(intptr_t)__result) = MeowHash1((meow_u64)Seed, (meow_u64)TotalLengthInBytes, SourceInit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashBegin(JNIEnv *__env, jclass clazz, jlong StateAddress) {
    meow_hash_state *State = (meow_hash_state *)(intptr_t)StateAddress;
    UNUSED_PARAMS(__env, clazz)
    MeowHashBegin(State);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashAbsorb1(JNIEnv *__env, jclass clazz, jlong StateAddress, jlong Len, jlong SourceInitAddress) {
    meow_hash_state *State = (meow_hash_state *)(intptr_t)StateAddress;
    void *SourceInit = (void *)(intptr_t)SourceInitAddress;
    UNUSED_PARAMS(__env, clazz)
    MeowHashAbsorb1(State, (meow_u64)Len, SourceInit);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_meow_Meow_nMeowHashEnd(JNIEnv *__env, jclass clazz, jlong StateAddress, jlong Seed, jlong __result) {
    meow_hash_state *State = (meow_hash_state *)(intptr_t)StateAddress;
    UNUSED_PARAMS(__env, clazz)
    *((meow_u128*)(intptr_t)__result) = MeowHashEnd(State, (meow_u64)Seed);
}

EXTERN_C_EXIT
