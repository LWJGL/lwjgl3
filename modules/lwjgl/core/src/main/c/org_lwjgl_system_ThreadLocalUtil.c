/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

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
