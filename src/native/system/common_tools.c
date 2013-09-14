/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include <stdlib.h>

static JavaVM *jvm;

jmethodID getDeclaringClass;

inline JNIEnv *getThreadEnv() {
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
	static __declspec(thread) JNIEnv* envTLS = NULL;

	void envTLSInit() {}
	void envTLSDestroy() {}

	JNIEnv* envTLSGet() {
		JNIEnv* env = getThreadEnv();
    	if ( env == NULL )
    	    env = attachCurrentThreadAsDaemon();

		return envTLS = env;
	}

	inline JNIEnv* getEnv() {
		JNIEnv* env = envTLS;
		if ( env == NULL )
			env = envTLSGet();
		return env;
	}
#else
	#include <pthread.h>
	static pthread_key_t envTLS = 0;

	void envTLSInit() {
		pthread_key_create(&envTLS, NULL);
	}

	void envTLSDestroy() {
		if ( envTLS ) {
			pthread_key_delete(envTLS);
			envTLS = 0;
		}
	}

	JNIEnv* envTLSGet() {
		JNIEnv* env = getThreadEnv();
    	if ( env == NULL )
            env = attachCurrentThreadAsDaemon();

    	pthread_setspecific(envTLS, env);
    	return env;
	}

	inline JNIEnv* getEnv() {
		JNIEnv* env = (JNIEnv*)pthread_getspecific(envTLS);
		if ( !env )
			env = envTLSGet();
		return env;
	}
#endif

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv* env;
    jclass Method;

	jvm = vm;

    env = getThreadEnv();

    Method = (*env)->FindClass(env, "java/lang/reflect/Method");
    getDeclaringClass = (*env)->GetMethodID(env, Method, "getDeclaringClass", "()Ljava/lang/Class;");

    envTLSInit();
    return JNI_VERSION_1_6;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
	envTLSDestroy();
}