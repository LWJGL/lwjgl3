/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
#include <stdlib.h>
#include <errno.h>

static JavaVM *jvm;

mallocPROC lwjgl_malloc = malloc;
callocPROC lwjgl_calloc = calloc;
reallocPROC lwjgl_realloc = realloc;
freePROC lwjgl_free = free;

#ifdef LWJGL_WINDOWS
	aligned_allocPROC lwjgl_aligned_alloc = _aligned_malloc;
	aligned_freePROC lwjgl_aligned_free = _aligned_free;
#else
	static void* aligned_alloc(size_t alignment, size_t size) {
		void *p;
		if ( !posix_memalign(&p, alignment, size) )
			return p;
		return NULL;
	}
	aligned_allocPROC lwjgl_aligned_alloc = aligned_alloc;
	aligned_freePROC lwjgl_aligned_free = free
#endif

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
	if ( (*jvm)->DetachCurrentThread(jvm) != JNI_OK ) {
		fprintf(stderr, "[LWJGL] Failed to detach native thread from the JVM.");
		fflush(stderr);
	}
}

// Put JNIEnv in thread-local storage. getEnv() is ~2x faster than getThreadEnv().

// If getThreadEnv() returns NULL, getEnv() has been called in a foreign thread that must attach to the JVM to access JNI. Such threads are detached
// automatically using DllMain notifications (on Windows) or a pthread destructor (on Linux/OSX).

#ifdef LWJGL_WINDOWS
	#include <WindowsLWJGL.h>
	DWORD envTLS = TLS_OUT_OF_INDEXES;

	typedef struct {
		jboolean async;
		jboolean padding[sizeof(void*) - 1];
		JNIEnv* env;
		jint errnum;
		jint LastError;
	} EnvData;

	BOOL WINAPI DllMain(HINSTANCE hDLL, DWORD fdwReason, LPVOID lpvReserved) {
		UNUSED_PARAMS(hDLL, lpvReserved)
		if ( fdwReason == DLL_THREAD_DETACH && getThreadEnv() != NULL )
			detachCurrentThread();
		return TRUE;
	}

	static inline void envTLSInit(void) {
		envTLS = TlsAlloc();
		if ( envTLS == TLS_OUT_OF_INDEXES )
			fprintf(stderr, "Failed to allocate TLS for JNIEnv.");
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

	typedef struct {
		jboolean async;
		jboolean padding[sizeof(void*) - 1];
		JNIEnv* env;
		jint errnum;
	} EnvData;

	static void autoDetach(void* value) {
		UNUSED_PARAM(value)
		if ( getThreadEnv() != NULL )
            detachCurrentThread();
	}

	static inline void envTLSInit(void) {
		if ( pthread_key_create(&envTLS, autoDetach) != 0 )
			fprintf(stderr, "Failed to allocate TLS for JNIEnv.");
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

    envTLSInit();
    return JNI_VERSION_1_6;
}

JNIEXPORT void JNICALL JNI_OnUnload(JavaVM *vm, void *reserved) {
	UNUSED_PARAMS(vm, reserved);
	envTLSDestroy();
}

EXTERN_C_EXIT
