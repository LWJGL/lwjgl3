/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"

JavaVM *jvm;

inline JNIEnv *getThreadEnv(void) {
	JNIEnv *env;
	(*jvm)->GetEnv(jvm, (void **)&env, JNI_VERSION_1_6);
	return env;
}

inline JNIEnv *attachCurrentThreadAsDaemon(void) {
    JNIEnv *env;
    (*jvm)->AttachCurrentThreadAsDaemon(jvm, (void **)&env, NULL);
    if ( env == NULL ) {
        fprintf(stderr, "[LWJGL] Failed to attach native thread to the JVM.");
        exit(1);
    }
    return env;
}

inline JNIEnv *attachCurrentThread(void) {
    JNIEnv *env;
    (*jvm)->AttachCurrentThread(jvm, (void **)&env, NULL);
    if ( env == NULL ) {
        fprintf(stderr, "[LWJGL] Failed to attach native thread to the JVM.");
        exit(1);
    }
    return env;
}

inline void detachCurrentThread(void) {
    (*jvm)->DetachCurrentThread(jvm);
}

// Put JNIEnv in thread-local storage. getEnv() is ~2x faster than getThreadEnv().

// If getThreadEnv() returns NULL, we are in a foreign thread and we fall-back to attachCurrentThreadAsDaemon(). We never detach such threads. This is ok
// because daemon threads don't block the JVM from shutting down normally. Even though this looks like a memory leak, it won't be an issue for our usage
// scenarios. We're expecting that foreign threads will be few in numbers and as long lived as the Java application (OpenGL async debug output, OpenCL
// callbacks, etc).

// If the above assumptions do not hold for some cases, we'll need to add a cleanup function below, that calls DetachCurrentThread and also clears the
// thread-local value.

#ifdef LWJGL_WINDOWS
	#include <WindowsLWJGL.h>
	DWORD envTLS = TLS_OUT_OF_INDEXES;

	static inline void envTLSInit(void) {
		envTLS = TlsAlloc();
		if ( envTLS == TLS_OUT_OF_INDEXES )
			fprintf(stderr, "Failed to allocate TLS for JNIEnv.");
	}

	static inline void envTLSDestroy(void) {
		TlsFree(envTLS);
	}

	JNIEnv* envTLSGet(void) {
		JNIEnv* env = getThreadEnv();
    	if ( env == NULL )
    	    env = attachCurrentThreadAsDaemon();

		TlsSetValue(envTLS, (LPVOID)env);
		return env;
	}

	inline JNIEnv* getEnv(void) {
		JNIEnv* env = (JNIEnv*)TlsGetValue(envTLS);
		if ( env == NULL )
			env = envTLSGet();
		return env;
	}
#else
	#include <pthread.h>
	pthread_key_t envTLS = 0;

	static inline void envTLSInit(void) {
		if ( pthread_key_create(&envTLS, NULL) != 0 )
			fprintf(stderr, "Failed to allocate TLS for JNIEnv.");
	}

	static inline void envTLSDestroy(void) {
		if ( envTLS ) {
			pthread_key_delete(envTLS);
			envTLS = 0;
		}
	}

	JNIEnv* envTLSGet(void) {
		JNIEnv* env = getThreadEnv();
    	if ( env == NULL )
            env = attachCurrentThreadAsDaemon();

    	pthread_setspecific(envTLS, env);
    	return env;
	}

	inline JNIEnv* getEnv(void) {
		JNIEnv* env = (JNIEnv*)pthread_getspecific(envTLS);
		if ( !env )
			env = envTLSGet();
		return env;
	}
#endif

EXTERN_C_ENTER

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
	UNUSED_PARAM(reserved)

	jvm = vm;

    envTLSInit();
    return JNI_VERSION_1_6;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
	UNUSED_PARAMS(vm, reserved);
	envTLSDestroy();
}

EXTERN_C_EXIT
