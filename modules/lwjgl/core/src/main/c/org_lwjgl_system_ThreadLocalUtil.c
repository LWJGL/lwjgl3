/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#include <jvmti.h>
ENABLE_WARNINGS()

extern jvmtiEnv* jvmti;

static jint JNICALL functionMissingAbort(void) {
    fprintf(stderr, "[LWJGL] A function that is not available in the current context was called. The JVM will abort execution. Inspect the crash log to find the responsible Java frames.\n");

    return *((volatile jint *)NULL); // force a segfault
}

EXTERN_C_ENTER

// getJNIEnv()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getThreadJNIEnv(JNIEnv *env, jclass clazz) {
    UNUSED_PARAM(clazz)

    return (jlong)(intptr_t)*env;
}

// setJNIEnv(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_setThreadJNIEnv(JNIEnv *env, jclass clazz, jlong function_tableAddress) {
    UNUSED_PARAM(clazz)

    jniNativeInterface *function_table = (jniNativeInterface *)(intptr_t)function_tableAddress;
    *env = function_table;
}

// jvmtiGetJNIFunctionTable()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiGetJNIFunctionTable(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)

    jniNativeInterface *function_table = NULL;
    (*jvmti)->GetJNIFunctionTable(jvmti, &function_table);
    return (jlong)(intptr_t)function_table;
}

// jvmtiDeallocate(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiDeallocate(JNIEnv *env, jclass clazz, jlong memAddress) {
    UNUSED_PARAMS(env, clazz)

    unsigned char *mem = (unsigned char *)(intptr_t)memAddress;
    (*jvmti)->Deallocate(jvmti, mem);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getFunctionMissingAbort(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)
    return (jlong)(intptr_t)functionMissingAbort;
}

EXTERN_C_EXIT
