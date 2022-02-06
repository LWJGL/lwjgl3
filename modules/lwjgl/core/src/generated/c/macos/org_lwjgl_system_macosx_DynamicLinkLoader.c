/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <dlfcn.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlopen(JNIEnv *__env, jclass clazz, jlong pathAddress, jint mode) {
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)dlopen(path, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlerror(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)dlerror();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlsym(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
    void *handle = (void *)(uintptr_t)handleAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)dlsym(handle, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlclose(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    void *handle = (void *)(uintptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dlclose(handle);
}

EXTERN_C_EXIT
