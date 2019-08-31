/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
#include "dyncall_callback.h"

static jmethodID
    javaCallbackV,
    javaCallbackZ,
    javaCallbackB,
    javaCallbackS,
    javaCallbackI,
    javaCallbackJ,
    javaCallbackN,
    javaCallbackF,
    javaCallbackD,
    javaCallbackP;

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

static char cbHandlerV(DCCallback *cb, DCArgs *args, DCValue *result, void *userdata) {
    jboolean async;
    JNIEnv* env = getEnv(&async);

    UNUSED_PARAM(cb)
    UNUSED_PARAM(result)

    // Invoke the Java callback
    (*env)->CallVoidMethod(env,
        (jobject)userdata,
        javaCallbackV,
        (jlong)(intptr_t)args
    );

    // Check for exception
    if ( (*env)->ExceptionCheck(env) && async )
        asyncCallbackException(env);

    return 'v';
}

#define DEFINE_CB_HANDLER(Name, Type, TypeSig, JavaType) \
    static char cbHandler##Name(DCCallback *cb, DCArgs *args, DCValue *result, void *userdata) { \
        jboolean async; \
        JNIEnv* env = getEnv(&async); \
\
        UNUSED_PARAM(cb) \
\
        *(Type*)result = (Type)(*env)->Call##JavaType##Method(env, \
            (jobject)userdata, \
            javaCallback##Name, \
            (jlong)(intptr_t)args \
        ); \
\
        if ( (*env)->ExceptionCheck(env) && async ) \
            asyncCallbackException(env); \
\
        return TypeSig; \
    }

DEFINE_CB_HANDLER(Z, jboolean, 'B', Boolean)
DEFINE_CB_HANDLER(B, jbyte,    'c', Byte)
DEFINE_CB_HANDLER(S, jshort,   's', Short)
DEFINE_CB_HANDLER(I, jint,     'i', Int)
DEFINE_CB_HANDLER(J, jlong,    'l', Long)
DEFINE_CB_HANDLER(N, long,     'j', Long)
DEFINE_CB_HANDLER(F, jfloat,   'f', Float)
DEFINE_CB_HANDLER(D, jdouble,  'd', Double)
DEFINE_CB_HANDLER(P, intptr_t, 'p', Long)

EXTERN_C_ENTER

#define SETUP_CALLBACK(Index, Type) \
    javaCallback##Type = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, Index)); \
    callbacks[Index] = (uintptr_t)&cbHandler##Type;

JNIEXPORT void JNICALL Java_org_lwjgl_system_Callback_getNativeCallbacks(JNIEnv *env, jclass clazz, jobjectArray methods, jlong callbacksAddress) {
    uintptr_t* callbacks = (uintptr_t *)(intptr_t)callbacksAddress;

    UNUSED_PARAMS(env, clazz)
    
    SETUP_CALLBACK(0, V)
    SETUP_CALLBACK(1, Z)
    SETUP_CALLBACK(2, B)
    SETUP_CALLBACK(3, S)
    SETUP_CALLBACK(4, I)
    SETUP_CALLBACK(5, J)
    SETUP_CALLBACK(6, N)
    SETUP_CALLBACK(7, F)
    SETUP_CALLBACK(8, D)
    SETUP_CALLBACK(9, P)
}

EXTERN_C_EXIT
