/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <dlfcn.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlopen(JNIEnv *__env, jclass clazz, jlong filenameAddress, jint mode) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlopen(filename, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlerror(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlerror();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlsym(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
    void *handle = (void *)(intptr_t)handleAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)dlsym(handle, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_DynamicLinkLoader_ndlclose(JNIEnv *__env, jclass clazz, jlong handleAddress) {
    void *handle = (void *)(intptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)dlclose(handle);
}

EXTERN_C_EXIT
