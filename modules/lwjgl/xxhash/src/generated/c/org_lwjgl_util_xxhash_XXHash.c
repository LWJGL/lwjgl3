/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#define XXH_INLINE_ALL
#include "lwjgl_malloc.h"
#include "xxhash.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jint seed) {
    void const *input = (void const *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32(input, (size_t)length, (unsigned int)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)XXH32_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_freeState(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong src_stateAddress) {
    XXH32_state_t *dst_state = (XXH32_state_t *)(intptr_t)dst_stateAddress;
    XXH32_state_t const *src_state = (XXH32_state_t const *)(intptr_t)src_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH32_copyState(dst_state, src_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jint seed) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_reset(statePtr, (unsigned int)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_update(statePtr, input, (size_t)length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH32_state_t const *statePtr = (XXH32_state_t const *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jint hash) {
    XXH32_canonical_t *dst = (XXH32_canonical_t *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH32_canonicalFromHash(dst, (XXH32_hash_t)hash);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
    XXH32_canonical_t const *src = (XXH32_canonical_t const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_hashFromCanonical(src);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jlong seed) {
    void const *input = (void const *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH64(input, (size_t)length, (unsigned long long)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)XXH64_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH64_freeState(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong src_stateAddress) {
    XXH64_state_t *dst_state = (XXH64_state_t *)(intptr_t)dst_stateAddress;
    XXH64_state_t const *src_state = (XXH64_state_t const *)(intptr_t)src_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH64_copyState(dst_state, src_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH64_reset(statePtr, (unsigned long long)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH64_update(statePtr, input, (size_t)length);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH64_state_t const *statePtr = (XXH64_state_t const *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH64_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hash) {
    XXH64_canonical_t *dst = (XXH64_canonical_t *)(intptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH64_canonicalFromHash(dst, (XXH32_hash_t)hash);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
    XXH64_canonical_t const *src = (XXH64_canonical_t const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH64_hashFromCanonical(src);
}

EXTERN_C_EXIT
