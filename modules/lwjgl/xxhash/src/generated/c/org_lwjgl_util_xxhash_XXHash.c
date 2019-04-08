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

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32(jlong inputAddress, jlong length, jint seed) {
    void const *input = (void const *)(intptr_t)inputAddress;
    return (jint)XXH32(input, (size_t)length, (unsigned int)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32(inputAddress, length, seed);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1createState(void) {
    return (jlong)(intptr_t)XXH32_createState();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1createState();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1freeState(jlong statePtrAddress) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH32_freeState(statePtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1freeState(statePtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1copyState(jlong dst_stateAddress, jlong src_stateAddress) {
    XXH32_state_t *dst_state = (XXH32_state_t *)(intptr_t)dst_stateAddress;
    XXH32_state_t const *src_state = (XXH32_state_t const *)(intptr_t)src_stateAddress;
    XXH32_copyState(dst_state, src_state);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong src_stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1copyState(dst_stateAddress, src_stateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1reset(jlong statePtrAddress, jint seed) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH32_reset(statePtr, (unsigned int)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jint seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1reset(statePtrAddress, seed);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1update(jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    return (jint)XXH32_update(statePtr, input, (size_t)length);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1update(statePtrAddress, inputAddress, length);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1digest(jlong statePtrAddress) {
    XXH32_state_t const *statePtr = (XXH32_state_t const *)(intptr_t)statePtrAddress;
    return (jint)XXH32_digest(statePtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1digest(statePtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1canonicalFromHash(jlong dstAddress, jint hash) {
    XXH32_canonical_t *dst = (XXH32_canonical_t *)(intptr_t)dstAddress;
    XXH32_canonicalFromHash(dst, (XXH32_hash_t)hash);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jint hash) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1canonicalFromHash(dstAddress, hash);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1hashFromCanonical(jlong srcAddress) {
    XXH32_canonical_t const *src = (XXH32_canonical_t const *)(intptr_t)srcAddress;
    return (jint)XXH32_hashFromCanonical(src);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH32_1hashFromCanonical(srcAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64(jlong inputAddress, jlong length, jlong seed) {
    void const *input = (void const *)(intptr_t)inputAddress;
    return (jlong)XXH64(input, (size_t)length, (unsigned long long)seed);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jlong seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64(inputAddress, length, seed);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1createState(void) {
    return (jlong)(intptr_t)XXH64_createState();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1createState();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1freeState(jlong statePtrAddress) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH64_freeState(statePtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1freeState(statePtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1copyState(jlong dst_stateAddress, jlong src_stateAddress) {
    XXH64_state_t *dst_state = (XXH64_state_t *)(intptr_t)dst_stateAddress;
    XXH64_state_t const *src_state = (XXH64_state_t const *)(intptr_t)src_stateAddress;
    XXH64_copyState(dst_state, src_state);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong src_stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1copyState(dst_stateAddress, src_stateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1reset(jlong statePtrAddress, jlong seed) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH64_reset(statePtr, (unsigned long long)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1reset(statePtrAddress, seed);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1update(jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    return (jint)XXH64_update(statePtr, input, (size_t)length);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1update(statePtrAddress, inputAddress, length);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1digest(jlong statePtrAddress) {
    XXH64_state_t const *statePtr = (XXH64_state_t const *)(intptr_t)statePtrAddress;
    return (jlong)XXH64_digest(statePtr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1digest(statePtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1canonicalFromHash(jlong dstAddress, jlong hash) {
    XXH64_canonical_t *dst = (XXH64_canonical_t *)(intptr_t)dstAddress;
    XXH64_canonicalFromHash(dst, (XXH32_hash_t)hash);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hash) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1canonicalFromHash(dstAddress, hash);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1hashFromCanonical(jlong srcAddress) {
    XXH64_canonical_t const *src = (XXH64_canonical_t const *)(intptr_t)srcAddress;
    return (jlong)XXH64_hashFromCanonical(src);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH64_1hashFromCanonical(srcAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128(jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH128(data, (size_t)len, (unsigned long long)seed);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128(dataAddress, len, seed, __result);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(jlong dataAddress, jlong len) {
    void const *data = (void const *)(intptr_t)dataAddress;
    return (jlong)XXH3_64bits(data, (size_t)len);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(dataAddress, len);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(jlong dataAddress, jlong len, jlong seed) {
    void const *data = (void const *)(intptr_t)dataAddress;
    return (jlong)XXH3_64bits_withSeed(data, (size_t)len, (unsigned long long)seed);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(dataAddress, len, seed);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits(jlong dataAddress, jlong len, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits(data, (size_t)len);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits(dataAddress, len, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_withSeed(data, (size_t)len, (unsigned long long)seed);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(dataAddress, len, seed, __result);
}

EXTERN_C_EXIT
