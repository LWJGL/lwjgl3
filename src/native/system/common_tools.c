/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include <stdlib.h>

static JavaVM *jvm;

inline void getThreadEnv(JNIEnv **env) {
	(*jvm)->GetEnv(jvm, (void **)env, JNI_VERSION_1_6);
}

inline JNIEnv *attachCurrentThread(void) {
    JNIEnv *env;
    (*jvm)->AttachCurrentThread(jvm, (void **)&env, NULL);
    if ( env == NULL ) {
        fprintf(stderr, "[LWJGL] Failed to attach to the JVM from native code.");
        exit(1);
    }
    return env;
}

inline void detachCurrentThread(void) {
    (*jvm)->DetachCurrentThread(jvm);
}

// Put JNIEnv in thread-local storage. getEnv() is ~2x faster than getThreadEnv().
#ifdef LWJGL_WINDOWS
	static __declspec(thread) JNIEnv* envTLS = NULL;

	void initEnvTLS() {
	}

	inline JNIEnv* getEnv() {
		if ( envTLS == NULL )
			getThreadEnv(&envTLS);
		return envTLS;
	}

	void destroyEnvTLS() {
		envTLS = NULL;
	}
#else
	#include <pthread.h>
	static pthread_key_t envTLS = 0;

	void initEnvTLS() {
		pthread_key_create(&envTLS, NULL);
	}

	inline JNIEnv* getEnv() {
		JNIEnv* env = (JNIEnv*)pthread_getspecific(envTLS);
		if ( !env ) {
			getThreadEnv(&env);
			pthread_setspecific(envTLS, env);
		}
		return env;
	}

	void destroyEnvTLS() {
		if ( envTLS ) {
			pthread_key_delete(envTLS);
			envTLS = 0;
		}
	}
#endif

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    jvm = vm;
    initEnvTLS();
    return JNI_VERSION_1_6;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
	destroyEnvTLS();
}