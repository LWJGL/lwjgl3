/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

static jint JNICALL functionMissingAbort(void) {
    fprintf(stderr, "[LWJGL] No context is current or an unavailable function was called. The JVM will abort execution. Inspect the crash log to find the responsible Java code.\n");
    fflush(stderr);

    return *((volatile jint *)NULL); // force a segfault
}

EXTERN_C_ENTER

// getThreadJNIEnv()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getThreadJNIEnv(JNIEnv *env, jclass clazz) {
    UNUSED_PARAM(clazz)

    return (jlong)(uintptr_t)*env;
}

// setThreadJNIEnv(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_setThreadJNIEnv(JNIEnv *env, jclass clazz, jlong function_tableAddress) {
    UNUSED_PARAM(clazz)

    *((uintptr_t**)env) = (uintptr_t *)(uintptr_t)function_tableAddress;
}

// getFunctionMissingAbort()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getFunctionMissingAbort(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)
    return (jlong)(intptr_t)functionMissingAbort;
}

EXTERN_C_EXIT
