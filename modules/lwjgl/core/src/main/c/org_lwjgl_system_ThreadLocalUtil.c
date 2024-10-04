/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"
#include <string.h>

static void JNICALL functionMissingAbort(void) {
    jboolean async;
    JNIEnv* env = getEnv(&async);

    jclass Thread = (*env)->FindClass(env, "java/lang/Thread");
    jobject thread     = (*env)->CallStaticObjectMethod(env, Thread, (*env)->GetStaticMethodID(env, Thread, "currentThread", "()Ljava/lang/Thread;"));
    jstring threadName = (*env)->      CallObjectMethod(env, thread, (*env)->      GetMethodID(env, Thread,      "toString", "()Ljava/lang/String;"));

    char msg[256];
    snprintf(
        msg, 256,
        "%s: No context is current or a function that is not available in the current context was called. The JVM will abort execution.",
        (*env)->GetStringUTFChars(env, threadName, NULL)
    );
    (*env)->FatalError(env, msg);
}

EXTERN_C_ENTER

// getThreadJNIEnv()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getThreadJNIEnv(JNIEnv *env, jclass clazz) {
    UNUSED_PARAM(clazz)

    return (jlong)(uintptr_t)env;
}

// getFunctionMissingAbort()J
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_getFunctionMissingAbort(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)
    return (jlong)(uintptr_t)functionMissingAbort;
}

extern EnvData* tlsCreateEnvDataWithCopy(JNIEnv* env);
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_ThreadLocalUtil_setupEnvData(JNIEnv *env, jclass clazz, jint functionCount) {
    UNUSED_PARAM(clazz)

    void *envCopy = malloc(functionCount * sizeof(void *));
    memcpy(envCopy, *env, functionCount * sizeof(void *));
    *(void **)env = envCopy;

    return (jlong)(uintptr_t)tlsCreateEnvDataWithCopy(env);
}

EXTERN_C_EXIT
