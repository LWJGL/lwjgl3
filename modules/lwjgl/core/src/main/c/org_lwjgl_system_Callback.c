/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "ffi.h"
ENABLE_WARNINGS()

static jmethodID javaCallback;

typedef struct LWJGLCallback {
    jweak reference;
    const char* debug;
} LWJGLCallback;

#if LWJGL_WINDOWS
    #define noinline __declspec(noinline)
#else
    #define noinline __attribute__((noinline))
#endif

noinline static void asyncCallbackException(JNIEnv* env) {
    fprintf(stderr, "[LWJGL] Exception in callback that was invoked asynchronously from a native thread.\n");
    fflush(stderr);

    (*env)->ExceptionDescribe(env);
    (*env)->ExceptionClear(env);
}

static void cbHandler(ffi_cif *cif, void *ret, void **args, void *user_data) {
    jboolean async;
    JNIEnv* env = getEnv(&async);

    UNUSED_PARAM(cif)
    UNUSED_PARAM(ret)

    // Invoke the Java callback
    (*env)->CallVoidMethod(env,
        (jobject)user_data,
        javaCallback,
        (jlong)(intptr_t)ret,
        (jlong)(intptr_t)args
    );

    // Check for exception
    if ((*env)->ExceptionCheck(env) && async) {
        asyncCallbackException(env);
    }
}

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_Callback_getCallbackHandler(JNIEnv *env, jclass clazz, jobject method) {
    UNUSED_PARAMS(env, clazz)

    javaCallback = (*env)->FromReflectedMethod(env, method);
    return (jlong)(uintptr_t)&cbHandler;
}

EXTERN_C_EXIT
