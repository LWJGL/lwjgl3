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
    return (jint)XXH32(input, (size_t)length, (XXH32_hash_t)seed);
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
    return (jint)XXH32_reset(statePtr, (XXH32_hash_t)seed);
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
    return (jlong)XXH64(input, (size_t)length, (XXH32_hash_t)seed);
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
    return (jint)XXH64_reset(statePtr, (XXH32_hash_t)seed);
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

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len) {
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits(data, (size_t)len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSecret(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize) {
    void const *data = (void const *)(intptr_t)dataAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_withSecret(data, (size_t)len, secret, (size_t)secretSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed) {
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_withSeed(data, (size_t)len, (XXH32_hash_t)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)XXH3_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_freeState(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong srct_stateAddress) {
    XXH3_state_t *dst_state = (XXH3_state_t *)(intptr_t)dst_stateAddress;
    XXH3_state_t const *srct_state = (XXH3_state_t const *)(intptr_t)srct_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH3_copyState(dst_state, srct_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset_withSeed(statePtr, (XXH32_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSecret(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset_withSecret(statePtr, secret, (size_t)secretSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_update(statePtr, input, (size_t)length);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t const *statePtr = (XXH3_state_t const *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(intptr_t)__result) = XXH128(data, (size_t)len, (XXH32_hash_t)seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits(data, (size_t)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_withSeed(data, (size_t)len, (XXH32_hash_t)seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSecret(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_withSecret(data, (size_t)len, secret, (size_t)secretSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset_withSeed(statePtr, (XXH32_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSecret(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset_withSecret(statePtr, secret, (size_t)secretSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_update(statePtr, input, (size_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong __result) {
    XXH3_state_t const *statePtr = (XXH3_state_t const *)(intptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_digest(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1isEqual(JNIEnv *__env, jclass clazz, jlong h1Address, jlong h2Address) {
    XXH128_hash_t *h1 = (XXH128_hash_t *)(intptr_t)h1Address;
    XXH128_hash_t *h2 = (XXH128_hash_t *)(intptr_t)h2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH128_isEqual(*h1, *h2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1cmp(JNIEnv *__env, jclass clazz, jlong h128_1Address, jlong h128_2Address) {
    void const *h128_1 = (void const *)(intptr_t)h128_1Address;
    void const *h128_2 = (void const *)(intptr_t)h128_2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH128_cmp(h128_1, h128_2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hashAddress) {
    XXH128_canonical_t *dst = (XXH128_canonical_t *)(intptr_t)dstAddress;
    XXH128_hash_t *hash = (XXH128_hash_t *)(intptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH128_canonicalFromHash(dst, *hash);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong __result) {
    XXH128_canonical_t const *src = (XXH128_canonical_t const *)(intptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(intptr_t)__result) = XXH128_hashFromCanonical(src);
}

EXTERN_C_EXIT
