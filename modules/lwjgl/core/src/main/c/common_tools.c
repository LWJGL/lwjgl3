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
    EnvData* data = (EnvData*)calloc(1, sizeof(EnvData));

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
                if (data->async && getThreadEnv() != NULL) {
                    detachCurrentThread();
                }

                TlsSetValue(envTLS, NULL);

                JNIEnv env = data->envCopy;
                if (env != NULL) {
                    free((void *)env);
                }
                free(data);
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
        EnvData* data = (EnvData*)TlsGetValue(envTLS);
        if (data == NULL) {
            data = createEnvData(0, env);
            TlsSetValue(envTLS, (LPVOID)data);
        }

        linkEnvData(data, env);

        return data;
    }

    static inline EnvData* tlsGetEnvData(void) {
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

        if (data->async && getThreadEnv() != NULL) {
            detachCurrentThread();
        }

        JNIEnv env = data->envCopy;
        if (env != NULL) {
            free((void *)env);
        }

        free(data);
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

    static inline EnvData* tlsGetEnvData(void) {
        EnvData* data = (EnvData*)pthread_getspecific(envTLS);
        if (data == NULL) {
            data = tlsCreateEnvData();
        }
        return data;
    }
#endif

JNIEnv* getEnv(jboolean *async) {
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

// Intentionally empty functions for benchmarking purposes
JNIEXPORT void JNICALL org_lwjgl_system_noop(void) {}
JNIEXPORT void JNICALL org_lwjgl_system_noop_params(void *param0, void *param1, int param2) {
    UNUSED_PARAMS(param0, param1);
    UNUSED_PARAM(param2);
}

JNIEXPORT void noop_params0(void) {}
JNIEXPORT void noop_params1(void *param0) { UNUSED_PARAM(param0); }
JNIEXPORT void noop_params2(void *param0, void *param1) { UNUSED_PARAMS(param0, param1); }
JNIEXPORT void noop_params3(void *param0, void *param1, void *param2) { UNUSED_PARAMS(param0, param1); UNUSED_PARAM(param2); }
JNIEXPORT void noop_params4(void *param0, void *param1, void *param2, void *param3) { UNUSED_PARAMS(param0, param1); UNUSED_PARAMS(param2, param3); }
JNIEXPORT void noop_params5(int param0, int param1, void *param2, void *param3, void *param4) { UNUSED_PARAMS(param0, param1); UNUSED_PARAMS(param2, param3); UNUSED_PARAM(param4); }

EXTERN_C_EXIT
