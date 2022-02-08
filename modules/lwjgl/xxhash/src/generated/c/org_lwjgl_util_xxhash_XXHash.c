/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "lwjgl_malloc.h"
#if defined(LWJGL_arm64) || defined(LWJGL_arm32)
    #define XXH_INLINE_ALL
    #include "xxhash.h"
#else
    #include "xxh_x86dispatch.c"
    #include "xxh_x86dispatch.h"
#endif
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jint seed) {
    void const *input = (void const *)(uintptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32(input, (size_t)length, (XXH32_hash_t)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)XXH32_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_freeState(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong src_stateAddress) {
    XXH32_state_t *dst_state = (XXH32_state_t *)(uintptr_t)dst_stateAddress;
    XXH32_state_t const *src_state = (XXH32_state_t const *)(uintptr_t)src_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH32_copyState(dst_state, src_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jint seed) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_reset(statePtr, (XXH32_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH32_state_t *statePtr = (XXH32_state_t *)(uintptr_t)statePtrAddress;
    void const *input = (void const *)(uintptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_update(statePtr, input, (size_t)length);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH32_state_t const *statePtr = (XXH32_state_t const *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jint hash) {
    XXH32_canonical_t *dst = (XXH32_canonical_t *)(uintptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH32_canonicalFromHash(dst, (XXH32_hash_t)hash);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH32_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
    XXH32_canonical_t const *src = (XXH32_canonical_t const *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH32_hashFromCanonical(src);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64(JNIEnv *__env, jclass clazz, jlong inputAddress, jlong length, jlong seed) {
    void const *input = (void const *)(uintptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH64(input, (size_t)length, (XXH64_hash_t)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)XXH64_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH64_freeState(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong src_stateAddress) {
    XXH64_state_t *dst_state = (XXH64_state_t *)(uintptr_t)dst_stateAddress;
    XXH64_state_t const *src_state = (XXH64_state_t const *)(uintptr_t)src_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH64_copyState(dst_state, src_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH64_reset(statePtr, (XXH64_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH64_state_t *statePtr = (XXH64_state_t *)(uintptr_t)statePtrAddress;
    void const *input = (void const *)(uintptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH64_update(statePtr, input, (size_t)length);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH64_state_t const *statePtr = (XXH64_state_t const *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH64_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hash) {
    XXH64_canonical_t *dst = (XXH64_canonical_t *)(uintptr_t)dstAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH64_canonicalFromHash(dst, (XXH64_hash_t)hash);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH64_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress) {
    XXH64_canonical_t const *src = (XXH64_canonical_t const *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH64_hashFromCanonical(src);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits(data, (size_t)len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_withSeed(data, (size_t)len, (XXH64_hash_t)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSecret(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_withSecret(data, (size_t)len, secret, (size_t)secretSize);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)XXH3_createState();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_freeState(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong srct_stateAddress) {
    XXH3_state_t *dst_state = (XXH3_state_t *)(uintptr_t)dst_stateAddress;
    XXH3_state_t const *srct_state = (XXH3_state_t const *)(uintptr_t)srct_stateAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH3_copyState(dst_state, srct_state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset_withSeed(statePtr, (XXH64_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSecret(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset_withSecret(statePtr, secret, (size_t)secretSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    void const *input = (void const *)(uintptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_update(statePtr, input, (size_t)length);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t const *statePtr = (XXH3_state_t const *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_digest(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong __result) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH3_128bits(data, (size_t)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH3_128bits_withSeed(data, (size_t)len, (XXH64_hash_t)seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSecret(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize, jlong __result) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH3_128bits_withSecret(data, (size_t)len, secret, (size_t)secretSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset_withSeed(statePtr, (XXH64_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSecret(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset_withSecret(statePtr, secret, (size_t)secretSize);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    void const *input = (void const *)(uintptr_t)inputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_update(statePtr, input, (size_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong __result) {
    XXH3_state_t const *statePtr = (XXH3_state_t const *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH3_128bits_digest(statePtr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1isEqual(JNIEnv *__env, jclass clazz, jlong h1Address, jlong h2Address) {
    XXH128_hash_t *h1 = (XXH128_hash_t *)(uintptr_t)h1Address;
    XXH128_hash_t *h2 = (XXH128_hash_t *)(uintptr_t)h2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH128_isEqual(*h1, *h2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1cmp(JNIEnv *__env, jclass clazz, jlong h128_1Address, jlong h128_2Address) {
    void const *h128_1 = (void const *)(uintptr_t)h128_1Address;
    void const *h128_2 = (void const *)(uintptr_t)h128_2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH128_cmp(h128_1, h128_2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hashAddress) {
    XXH128_canonical_t *dst = (XXH128_canonical_t *)(uintptr_t)dstAddress;
    XXH128_hash_t *hash = (XXH128_hash_t *)(uintptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH128_canonicalFromHash(dst, *hash);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong __result) {
    XXH128_canonical_t const *src = (XXH128_canonical_t const *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH128_hashFromCanonical(src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1INITSTATE(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH3_INITSTATE(statePtr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH128(data, (size_t)len, (XXH64_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1generateSecret(JNIEnv *__env, jclass clazz, jlong secretBufferAddress, jlong secretSize, jlong customSeedAddress, jlong customSeedSize) {
    void *secretBuffer = (void *)(uintptr_t)secretBufferAddress;
    void const *customSeed = (void const *)(uintptr_t)customSeedAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_generateSecret(secretBuffer, (size_t)secretSize, customSeed, (size_t)customSeedSize);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1generateSecret_1fromSeed(JNIEnv *__env, jclass clazz, jlong secretBufferAddress, jlong seed) {
    void *secretBuffer = (void *)(uintptr_t)secretBufferAddress;
    UNUSED_PARAMS(__env, clazz)
    XXH3_generateSecret_fromSeed(secretBuffer, (XXH64_hash_t)seed);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSecretandSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize, jlong seed) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)XXH3_64bits_withSecretandSeed(data, (size_t)len, secret, (size_t)secretSize, (XXH64_hash_t)seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSecretandSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize, jlong seed, jlong __result) {
    void const *data = (void const *)(uintptr_t)dataAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    *((XXH128_hash_t*)(uintptr_t)__result) = XXH3_128bits_withSecretandSeed(data, (size_t)len, secret, (size_t)secretSize, (XXH64_hash_t)seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSecretandSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize, jlong seed64) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_64bits_reset_withSecretandSeed(statePtr, secret, (size_t)secretSize, (XXH64_hash_t)seed64);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSecretandSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize, jlong seed64) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(uintptr_t)statePtrAddress;
    void const *secret = (void const *)(uintptr_t)secretAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)XXH3_128bits_reset_withSecretandSeed(statePtr, secret, (size_t)secretSize, (XXH64_hash_t)seed64);
}

EXTERN_C_EXIT
