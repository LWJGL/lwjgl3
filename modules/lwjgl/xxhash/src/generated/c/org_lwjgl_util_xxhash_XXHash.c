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

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(jlong dataAddress, jlong len) {
    void const *data = (void const *)(intptr_t)dataAddress;
    return (jlong)XXH3_64bits(data, (size_t)len);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits(dataAddress, len);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSecret(jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize) {
    void const *data = (void const *)(intptr_t)dataAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    return (jlong)XXH3_64bits_withSecret(data, (size_t)len, secret, (size_t)secretSize);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSecret(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSecret(dataAddress, len, secretAddress, secretSize);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(jlong dataAddress, jlong len, jlong seed) {
    void const *data = (void const *)(intptr_t)dataAddress;
    return (jlong)XXH3_64bits_withSeed(data, (size_t)len, (XXH32_hash_t)seed);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1withSeed(dataAddress, len, seed);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1createState(void) {
    return (jlong)(intptr_t)XXH3_createState();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1createState(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1createState();
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1freeState(jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH3_freeState(statePtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1freeState(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1freeState(statePtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1copyState(jlong dst_stateAddress, jlong srct_stateAddress) {
    XXH3_state_t *dst_state = (XXH3_state_t *)(intptr_t)dst_stateAddress;
    XXH3_state_t const *srct_state = (XXH3_state_t const *)(intptr_t)srct_stateAddress;
    XXH3_copyState(dst_state, srct_state);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1copyState(JNIEnv *__env, jclass clazz, jlong dst_stateAddress, jlong srct_stateAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1copyState(dst_stateAddress, srct_stateAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset(jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH3_64bits_reset(statePtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset(statePtrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSeed(jlong statePtrAddress, jlong seed) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH3_64bits_reset_withSeed(statePtr, (XXH32_hash_t)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSeed(statePtrAddress, seed);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSecret(jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    return (jint)XXH3_64bits_reset_withSecret(statePtr, secret, (size_t)secretSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSecret(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1reset_1withSecret(statePtrAddress, secretAddress, secretSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1update(jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    return (jint)XXH3_64bits_update(statePtr, input, (size_t)length);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1update(statePtrAddress, inputAddress, length);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1digest(jlong statePtrAddress) {
    XXH3_state_t const *statePtr = (XXH3_state_t const *)(intptr_t)statePtrAddress;
    return (jlong)XXH3_64bits_digest(statePtr);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_164bits_1digest(statePtrAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128(jlong dataAddress, jlong len, jlong seed, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH128(data, (size_t)len, (XXH32_hash_t)seed);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128(dataAddress, len, seed, __result);
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
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_withSeed(data, (size_t)len, (XXH32_hash_t)seed);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong seed, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSeed(dataAddress, len, seed, __result);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSecret(jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize, jlong __result) {
    void const *data = (void const *)(intptr_t)dataAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_withSecret(data, (size_t)len, secret, (size_t)secretSize);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSecret(JNIEnv *__env, jclass clazz, jlong dataAddress, jlong len, jlong secretAddress, jlong secretSize, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1withSecret(dataAddress, len, secretAddress, secretSize, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset(jlong statePtrAddress) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH3_128bits_reset(statePtr);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset(JNIEnv *__env, jclass clazz, jlong statePtrAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset(statePtrAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSeed(jlong statePtrAddress, jlong seed) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    return (jint)XXH3_128bits_reset_withSeed(statePtr, (XXH32_hash_t)seed);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSeed(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong seed) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSeed(statePtrAddress, seed);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSecret(jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *secret = (void const *)(intptr_t)secretAddress;
    return (jint)XXH3_128bits_reset_withSecret(statePtr, secret, (size_t)secretSize);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSecret(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong secretAddress, jlong secretSize) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1reset_1withSecret(statePtrAddress, secretAddress, secretSize);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1update(jlong statePtrAddress, jlong inputAddress, jlong length) {
    XXH3_state_t *statePtr = (XXH3_state_t *)(intptr_t)statePtrAddress;
    void const *input = (void const *)(intptr_t)inputAddress;
    return (jint)XXH3_128bits_update(statePtr, input, (size_t)length);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1update(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong inputAddress, jlong length) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1update(statePtrAddress, inputAddress, length);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1digest(jlong statePtrAddress, jlong __result) {
    XXH3_state_t const *statePtr = (XXH3_state_t const *)(intptr_t)statePtrAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH3_128bits_digest(statePtr);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1digest(JNIEnv *__env, jclass clazz, jlong statePtrAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH3_1128bits_1digest(statePtrAddress, __result);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1isEqual(jlong h1Address, jlong h2Address) {
    XXH128_hash_t *h1 = (XXH128_hash_t *)(intptr_t)h1Address;
    XXH128_hash_t *h2 = (XXH128_hash_t *)(intptr_t)h2Address;
    return (jint)XXH128_isEqual(*h1, *h2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1isEqual(JNIEnv *__env, jclass clazz, jlong h1Address, jlong h2Address) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1isEqual(h1Address, h2Address);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1cmp(jlong h128_1Address, jlong h128_2Address) {
    void const *h128_1 = (void const *)(intptr_t)h128_1Address;
    void const *h128_2 = (void const *)(intptr_t)h128_2Address;
    return (jint)XXH128_cmp(h128_1, h128_2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1cmp(JNIEnv *__env, jclass clazz, jlong h128_1Address, jlong h128_2Address) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1cmp(h128_1Address, h128_2Address);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1canonicalFromHash(jlong dstAddress, jlong hashAddress) {
    XXH128_canonical_t *dst = (XXH128_canonical_t *)(intptr_t)dstAddress;
    XXH128_hash_t *hash = (XXH128_hash_t *)(intptr_t)hashAddress;
    XXH128_canonicalFromHash(dst, *hash);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1canonicalFromHash(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong hashAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1canonicalFromHash(dstAddress, hashAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1hashFromCanonical(jlong srcAddress, jlong __result) {
    XXH128_canonical_t const *src = (XXH128_canonical_t const *)(intptr_t)srcAddress;
    *((XXH128_hash_t*)(intptr_t)__result) = XXH128_hashFromCanonical(src);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_xxhash_XXHash_nXXH128_1hashFromCanonical(JNIEnv *__env, jclass clazz, jlong srcAddress, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_xxhash_XXHash_nXXH128_1hashFromCanonical(srcAddress, __result);
}

EXTERN_C_EXIT
