/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
#include <stdlib.h>
#include <stdio.h>

#ifdef LWJGL_ANDROID
    #define JNI_ENV_STRUCT struct JNINativeInterface
#else
    #define JNI_ENV_STRUCT struct JNINativeInterface_

DISABLE_WARNINGS()
#include <jvmti.h>
ENABLE_WARNINGS()

extern jvmtiEnv* jvmti;
#endif

static jint JNICALL functionMissingAbort(void) {
    fprintf(stderr, "[LWJGL] A function that is not available in the current context was called. The JVM will abort execution. Inspect the crash log to find the responsible Java frames.\n");

    return *((volatile jint *)NULL); // force a segfault
}

EXTERN_C_ENTER

// getThreadJNIEnv()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getThreadJNIEnv(JNIEnv *env, jclass clazz) {
    UNUSED_PARAM(clazz)

    return (jlong)(intptr_t)*env;
}

// setThreadJNIEnv(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_setThreadJNIEnv(JNIEnv *env, jclass clazz, jlong function_tableAddress) {
    UNUSED_PARAM(clazz)

    JNI_ENV_STRUCT *function_table = (JNI_ENV_STRUCT *)(intptr_t)function_tableAddress;
    *env = function_table;
}

// jvmtiGetJNIFunctionTable()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiGetJNIFunctionTable(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)

#ifdef LWJGL_ANDROID
    // Android does not have jvmti, so a copy must be created manually
    int functions;
    switch ((*env)->GetVersion(env)) {
        case JNI_VERSION_1_6:
        case /*JNI_VERSION_1_8*/0x00010008:
            functions = 229;
            break;
        case /*JNI_VERSION_9*/0x00090000:
        default:
            functions = 230; // adds GetModule
            break;
    }
    size_t structSize = sizeof(void *) * (4 /* reserved0-3 */ + functions);

    JNI_ENV_STRUCT *function_table = (JNI_ENV_STRUCT *)malloc(structSize);
    memcpy(function_table, *env, structSize);
#else
    jniNativeInterface *function_table = NULL;
    (*jvmti)->GetJNIFunctionTable(jvmti, &function_table);
#endif
    return (jlong)(intptr_t)function_table;
}

// jvmtiDeallocate(J)V
JNIEXPORT void JNICALL Java_org_lwjgl_system_ThreadLocalUtil_jvmtiDeallocate(JNIEnv *env, jclass clazz, jlong memAddress) {
    UNUSED_PARAMS(env, clazz)

#ifdef LWJGL_ANDROID
    free((void *)(intptr_t)memAddress);
#else
    (*jvmti)->Deallocate(jvmti, (unsigned char *)(intptr_t)memAddress);
#endif
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getFunctionMissingAbort(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)
    return (jlong)(intptr_t)functionMissingAbort;
}

EXTERN_C_EXIT
