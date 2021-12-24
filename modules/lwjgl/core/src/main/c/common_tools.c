/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
#include <stdlib.h>
#include <errno.h>

JavaVM *jvm;

static inline JNIEnv* getThreadEnv(void) {
    JNIEnv *env;
    (*jvm)->GetEnv(jvm, (void **)&env, JNI_VERSION_1_6);
    return env;
}

static inline JNIEnv* attachCurrentThreadAsDaemon(void) {
    JNIEnv *env;
    (*jvm)->AttachCurrentThreadAsDaemon(jvm, (void **)&env, NULL);
    if (env == NULL) {
        fprintf(stderr, "[LWJGL] Failed to attach native thread to the JVM.");
        fflush(stderr);
        exit(1);
    }
    return env;
}

static inline void detachCurrentThread(void) {
    if ((*jvm)->DetachCurrentThread(jvm) != JNI_OK) {
        fprintf(stderr, "[LWJGL] Failed to detach native thread from the JVM.");
        fflush(stderr);
    }
}

static inline EnvData* createEnvData(jboolean async, JNIEnv* env) {
    EnvData* data = (EnvData*)calloc(sizeof(EnvData), 1);

    data->async = async;
    data->env = env;

    return data;
}

static inline void linkEnvData(EnvData* data, JNIEnv *env) {
    data->envCopy = *env;
    ((void **)*env)[2] = (void *)data;
}

#ifdef LWJGL_WINDOWS
    #include <WindowsLWJGL.h>
    DWORD envTLS = TLS_OUT_OF_INDEXES;

    BOOL WINAPI DllMain(HINSTANCE hDLL, DWORD fdwReason, LPVOID lpvReserved) {
        UNUSED_PARAMS(hDLL, lpvReserved)

        if (fdwReason == DLL_THREAD_DETACH && lpvReserved == NULL/* see: https://docs.microsoft.com/en-us/windows/win32/dlls/dllmain */) {
            EnvData* data = (EnvData*)TlsGetValue(envTLS);
            if (data != NULL) {
                TlsSetValue(envTLS, NULL);

                JNIEnv env = data->envCopy;
                if (env != NULL) {
                    free((void *)env);
                }
                free(data);
            }

            if (getThreadEnv() != NULL) {
                detachCurrentThread();
            }
        }

        return TRUE;
    }

    static inline void tlsInit(void) {
        envTLS = TlsAlloc();
        if (envTLS == TLS_OUT_OF_INDEXES) {
            fprintf(stderr, "[LWJGL] Failed to allocate TLS for JNIEnv.");
            fflush(stderr);
        }
    }

    static inline void tlsDestroy(void) {
        TlsFree(envTLS);
    }

    EnvData* tlsCreateEnvData(void) {
        jboolean async = 0;
        JNIEnv* env = getThreadEnv();

        if (env == NULL) {
            async = 1;
            env = attachCurrentThreadAsDaemon();
        }

        EnvData* data = createEnvData(async, env);

        TlsSetValue(envTLS, (LPVOID)data);

        return data;
    }

    EnvData* tlsCreateEnvDataWithCopy(JNIEnv *env) {
        EnvData* data = createEnvData(0, env);
        linkEnvData(data, env);

        TlsSetValue(envTLS, (LPVOID)data);

        return data;
    }

    inline EnvData* tlsGetEnvData(void) {
        EnvData* data = (EnvData*)TlsGetValue(envTLS);
        if (data == NULL) {
            data = tlsCreateEnvData();
        }
        return data;
    }
#else
    #include <pthread.h>
    pthread_key_t envTLS = 0;

    static void autoDetach(void* value) {
        EnvData* data = (EnvData *)value;

        JNIEnv env = data->envCopy;
        if (env != NULL) {
            free((void *)env);
        }

        free(data);

        if (getThreadEnv() != NULL) {
            detachCurrentThread();
        }
    }

    static inline void tlsInit(void) {
        if (pthread_key_create(&envTLS, autoDetach) != 0) {
            fprintf(stderr, "[LWJGL] Failed to allocate TLS for JNIEnv.");
            fflush(stderr);
        }
    }

    static inline void tlsDestroy(void) {
        if (envTLS) {
            pthread_key_delete(envTLS);
            envTLS = 0;
        }
    }

    EnvData* tlsCreateEnvData(void) {
        jboolean async = 0;
        JNIEnv* env = getThreadEnv();

        if (env == NULL) {
            async = 1;
            env = attachCurrentThreadAsDaemon();
        }

        EnvData* data = createEnvData(async, env);

        pthread_setspecific(envTLS, data);

        return data;
    }

    EnvData* tlsCreateEnvDataWithCopy(JNIEnv* env) {
        EnvData* data = createEnvData(0, env);
        linkEnvData(data, env);

        pthread_setspecific(envTLS, data);

        return data;
    }

    inline EnvData* tlsGetEnvData(void) {
        EnvData* data = (EnvData*)pthread_getspecific(envTLS);
        if (data == NULL) {
            data = tlsCreateEnvData();
        }
        return data;
    }
#endif

inline JNIEnv* getEnv(jboolean *async) {
    EnvData* data = tlsGetEnvData();
    *async = data->async;
    return data->env;
}

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    UNUSED_PARAM(reserved)

    jvm = vm;

    tlsInit();
    return JNI_VERSION_1_6;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
    UNUSED_PARAMS(vm, reserved);
    tlsDestroy();
}

EXTERN_C_EXIT
