/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "libdivide.h"

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s16_1gen_1ref(JNIEnv *__env, jclass clazz, jshort denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_s16_t*)(uintptr_t)__result) = libdivide_s16_gen((int16_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u16_1gen_1ref(JNIEnv *__env, jclass clazz, jshort denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_u16_t*)(uintptr_t)__result) = libdivide_u16_gen((uint16_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s32_1gen_1ref(JNIEnv *__env, jclass clazz, jint denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_s32_t*)(uintptr_t)__result) = libdivide_s32_gen((int32_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u32_1gen_1ref(JNIEnv *__env, jclass clazz, jint denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_u32_t*)(uintptr_t)__result) = libdivide_u32_gen((uint32_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s64_1gen_1ref(JNIEnv *__env, jclass clazz, jlong denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_s64_t*)(uintptr_t)__result) = libdivide_s64_gen((int64_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u64_1gen_1ref(JNIEnv *__env, jclass clazz, jlong denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_u64_t*)(uintptr_t)__result) = libdivide_u64_gen((uint64_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s16_1branchfree_1gen_1ref(JNIEnv *__env, jclass clazz, jshort denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_s16_branchfree_t*)(uintptr_t)__result) = libdivide_s16_branchfree_gen((int16_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u16_1branchfree_1gen_1ref(JNIEnv *__env, jclass clazz, jshort denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_u16_branchfree_t*)(uintptr_t)__result) = libdivide_u16_branchfree_gen((uint16_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s32_1branchfree_1gen_1ref(JNIEnv *__env, jclass clazz, jint denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_s32_branchfree_t*)(uintptr_t)__result) = libdivide_s32_branchfree_gen((int32_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u32_1branchfree_1gen_1ref(JNIEnv *__env, jclass clazz, jint denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_u32_branchfree_t*)(uintptr_t)__result) = libdivide_u32_branchfree_gen((uint32_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s64_1branchfree_1gen_1ref(JNIEnv *__env, jclass clazz, jlong denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_s64_branchfree_t*)(uintptr_t)__result) = libdivide_s64_branchfree_gen((int64_t)denom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u64_1branchfree_1gen_1ref(JNIEnv *__env, jclass clazz, jlong denom, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct libdivide_u64_branchfree_t*)(uintptr_t)__result) = libdivide_u64_branchfree_gen((uint64_t)denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s16_1do_1ref(JNIEnv *__env, jclass clazz, jshort numer, jlong denomAddress) {
    struct libdivide_s16_t const *denom = (struct libdivide_s16_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_s16_do((int16_t)numer, denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u16_1do_1ref(JNIEnv *__env, jclass clazz, jshort numer, jlong denomAddress) {
    struct libdivide_u16_t const *denom = (struct libdivide_u16_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_u16_do((uint16_t)numer, denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s32_1do_1ref(JNIEnv *__env, jclass clazz, jint numer, jlong denomAddress) {
    struct libdivide_s32_t const *denom = (struct libdivide_s32_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_s32_do((int32_t)numer, denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u32_1do_1ref(JNIEnv *__env, jclass clazz, jint numer, jlong denomAddress) {
    struct libdivide_u32_t const *denom = (struct libdivide_u32_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_u32_do((uint32_t)numer, denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s64_1do_1ref(JNIEnv *__env, jclass clazz, jlong numer, jlong denomAddress) {
    struct libdivide_s64_t const *denom = (struct libdivide_s64_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_s64_do((int64_t)numer, denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u64_1do_1ref(JNIEnv *__env, jclass clazz, jlong numer, jlong denomAddress) {
    struct libdivide_u64_t const *denom = (struct libdivide_u64_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_u64_do((uint64_t)numer, denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s16_1branchfree_1do_1ref(JNIEnv *__env, jclass clazz, jshort numer, jlong denomAddress) {
    struct libdivide_s16_branchfree_t const *denom = (struct libdivide_s16_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_s16_branchfree_do((int16_t)numer, denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u16_1branchfree_1do_1ref(JNIEnv *__env, jclass clazz, jshort numer, jlong denomAddress) {
    struct libdivide_u16_branchfree_t const *denom = (struct libdivide_u16_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_u16_branchfree_do((uint16_t)numer, denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s32_1branchfree_1do_1ref(JNIEnv *__env, jclass clazz, jint numer, jlong denomAddress) {
    struct libdivide_s32_branchfree_t const *denom = (struct libdivide_s32_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_s32_branchfree_do((int32_t)numer, denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u32_1branchfree_1do_1ref(JNIEnv *__env, jclass clazz, jint numer, jlong denomAddress) {
    struct libdivide_u32_branchfree_t const *denom = (struct libdivide_u32_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_u32_branchfree_do((uint32_t)numer, denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s64_1branchfree_1do_1ref(JNIEnv *__env, jclass clazz, jlong numer, jlong denomAddress) {
    struct libdivide_s64_branchfree_t const *denom = (struct libdivide_s64_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_s64_branchfree_do((int64_t)numer, denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u64_1branchfree_1do_1ref(JNIEnv *__env, jclass clazz, jlong numer, jlong denomAddress) {
    struct libdivide_u64_branchfree_t const *denom = (struct libdivide_u64_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_u64_branchfree_do((uint64_t)numer, denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s16_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_s16_t const *denom = (struct libdivide_s16_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_s16_recover(denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u16_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_u16_t const *denom = (struct libdivide_u16_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_u16_recover(denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s32_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_s32_t const *denom = (struct libdivide_s32_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_s32_recover(denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u32_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_u32_t const *denom = (struct libdivide_u32_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_u32_recover(denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s64_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_s64_t const *denom = (struct libdivide_s64_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_s64_recover(denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u64_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_u64_t const *denom = (struct libdivide_u64_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_u64_recover(denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s16_1branchfree_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_s16_branchfree_t const *denom = (struct libdivide_s16_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_s16_branchfree_recover(denom);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u16_1branchfree_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_u16_branchfree_t const *denom = (struct libdivide_u16_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jshort)libdivide_u16_branchfree_recover(denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s32_1branchfree_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_s32_branchfree_t const *denom = (struct libdivide_s32_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_s32_branchfree_recover(denom);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u32_1branchfree_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_u32_branchfree_t const *denom = (struct libdivide_u32_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)libdivide_u32_branchfree_recover(denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1s64_1branchfree_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_s64_branchfree_t const *denom = (struct libdivide_s64_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_s64_branchfree_recover(denom);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_libdivide_LibDivide_nlibdivide_1u64_1branchfree_1recover(JNIEnv *__env, jclass clazz, jlong denomAddress) {
    struct libdivide_u64_branchfree_t const *denom = (struct libdivide_u64_branchfree_t const *)(uintptr_t)denomAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)libdivide_u64_branchfree_recover(denom);
}

EXTERN_C_EXIT
