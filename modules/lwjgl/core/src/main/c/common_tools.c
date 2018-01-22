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
#include <stdlib.h>
#include <errno.h>

JavaVM *jvm;
jvmtiEnv *jvmti;

inline JNIEnv *getThreadEnv(void) {
    JNIEnv *env;
    (*jvm)->GetEnv(jvm, (void **)&env, JNI_VERSION_1_8);
    return env;
}

inline JNIEnv *attachCurrentThreadAsDaemon(void) {
    JNIEnv *env;
    (*jvm)->AttachCurrentThreadAsDaemon(jvm, (void **)&env, NULL);
    if ( env == NULL ) {
        fprintf(stderr, "[LWJGL] Failed to attach native thread to the JVM.");
        fflush(stderr);
        exit(1);
    }
    return env;
}

inline void detachCurrentThread(void) {
    if ( (*jvm)->DetachCurrentThread(jvm) != JNI_OK ) {
        fprintf(stderr, "[LWJGL] Failed to detach native thread from the JVM.");
        fflush(stderr);
    }
}

// Put JNIEnv in thread-local storage. getEnv() is ~2x faster than getThreadEnv().

// If getThreadEnv() returns NULL, getEnv() has been called in a foreign thread that must attach to the JVM to access JNI. Such threads are detached
// automatically using DllMain notifications (on Windows) or a pthread destructor (on Linux/OSX).

typedef struct EnvData_ {
    jboolean async;
    char padding[sizeof(void *) - sizeof(jboolean)];
    JNIEnv* env;
    jint errnum;
#ifdef LWJGL_WINDOWS
    jint LastError;
#endif
} EnvData;

#ifdef LWJGL_WINDOWS
    #include <WindowsLWJGL.h>
    DWORD envTLS = TLS_OUT_OF_INDEXES;

    BOOL WINAPI DllMain(HINSTANCE hDLL, DWORD fdwReason, LPVOID lpvReserved) {
        UNUSED_PARAMS(hDLL, lpvReserved)

        if ( fdwReason == DLL_THREAD_DETACH ) {
            EnvData* data = (EnvData*)TlsGetValue(envTLS);
            if ( data != NULL ) {
                TlsSetValue(envTLS, NULL);
                free(data);
            }

            if ( getThreadEnv() != NULL )
                detachCurrentThread();
        }

        return TRUE;
    }

    static inline void envTLSInit(void) {
        envTLS = TlsAlloc();
        if ( envTLS == TLS_OUT_OF_INDEXES ) {
            fprintf(stderr, "[LWJGL] Failed to allocate TLS for JNIEnv.");
            fflush(stderr);
        }
    }

    static inline void envTLSDestroy(void) {
        TlsFree(envTLS);
    }

    EnvData* envTLSGet(void) {
        EnvData* data = (EnvData*)malloc(sizeof(EnvData));

        jboolean async = 0;
        JNIEnv* env = getThreadEnv();

        if ( env == NULL ) {
            async = 1;
            env = attachCurrentThreadAsDaemon();
        }

        data->async = async;
        data->env = env;

        TlsSetValue(envTLS, (LPVOID)data);

        return data;
    }

    inline EnvData* getEnvData(void) {
        EnvData* data = (EnvData*)TlsGetValue(envTLS);
        if ( data == NULL )
            data = envTLSGet();
        return data;
    }

    inline void saveLastError(void) {
        jint err = (jint)GetLastError();
        getEnvData()->LastError = err;
    }
    inline jint getLastError(void) { return getEnvData()->LastError; }
#else
    #include <pthread.h>
    pthread_key_t envTLS = 0;

    static void autoDetach(void* value) {
        pthread_setspecific(envTLS, NULL);
        free(value);
        if ( getThreadEnv() != NULL )
            detachCurrentThread();
    }

    static inline void envTLSInit(void) {
        if ( pthread_key_create(&envTLS, autoDetach) != 0 ) {
            fprintf(stderr, "[LWJGL] Failed to allocate TLS for JNIEnv.");
            fflush(stderr);
        }
    }

    static inline void envTLSDestroy(void) {
        if ( envTLS ) {
            pthread_key_delete(envTLS);
            envTLS = 0;
        }
    }

    EnvData* envTLSGet(void) {
        EnvData* data = (EnvData*)malloc(sizeof(EnvData));

        jboolean async = 0;
        JNIEnv* env = getThreadEnv();

        if ( env == NULL ) {
            async = 1;
            env = attachCurrentThreadAsDaemon();
        }

        data->async = async;
        data->env = env;

        pthread_setspecific(envTLS, data);

        return data;
    }

    inline EnvData* getEnvData(void) {
        EnvData* data = (EnvData*)pthread_getspecific(envTLS);
        if ( data == NULL )
            data = envTLSGet();
        return data;
    }
#endif

inline JNIEnv* getEnv(jboolean *async) {
    EnvData* data = getEnvData();
    *async = data->async;
    return data->env;
}

inline void saveErrno(void) {
    jint errnum = (jint)errno;
    getEnvData()->errnum = errnum;
}
inline jint getErrno(void) { return getEnvData()->errnum; }

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    UNUSED_PARAM(reserved)

    jvm = vm;

    if ((*jvm)->GetEnv(jvm, (void **)&jvmti, JVMTI_VERSION_1_2) != JNI_OK) {
        fprintf(stderr, "[LWJGL] Failed to retrieve the JVMTI interface pointer.");
        fflush(stderr);
    }

    envTLSInit();
    return JNI_VERSION_1_8;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
    UNUSED_PARAMS(vm, reserved);
    envTLSDestroy();

    (*jvmti)->DisposeEnvironment(jvmti);
}

EXTERN_C_EXIT
