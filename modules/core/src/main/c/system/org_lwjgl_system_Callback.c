/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710))
#endif
#include "common_tools.h"
#include "ffi.h"

static jmethodID
	javaCallbackV,
	javaCallbackZ,
	javaCallbackB,
	javaCallbackS,
	javaCallbackI,
	javaCallbackJ,
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

noinline static void throwCallbackError(JNIEnv* env, const LWJGLCallback *cb, jboolean async) {
	(*env)->ThrowNew(env, (*env)->FindClass(env, "org/lwjgl/system/CallbackError"), cb->debug);

	if ( async )
		asyncCallbackException(env);
}

inline static jboolean verifyCallback(JNIEnv* env, jobject object, const LWJGLCallback *cb, jboolean async) {
	if ( (*env)->IsSameObject(env, object, NULL) ) {
		throwCallbackError(env, cb, async);
		return JNI_FALSE;
	}

	return JNI_TRUE;
}

static void ffiClosureV(ffi_cif* cif, void* ret, void** args, void* user_data) {
	jboolean async;
	JNIEnv* env = getEnv(&async);

	const LWJGLCallback *cb = (const LWJGLCallback *)user_data;

	// Dereference the weak global reference
	jobject object = (*env)->NewLocalRef(env, (jweak)cb->reference);

	UNUSED_PARAM(cif)
	UNUSED_PARAM(ret)

	// Verify that the callback has not been garbage collected
	if ( !verifyCallback(env, object, cb, async) )
		return;

	// Invoke the Java callback
	(*env)->CallVoidMethod(env,
		object,
		javaCallbackV,
		args
	);

	// Check for exception
	if ( (*env)->ExceptionCheck(env) && async )
		asyncCallbackException(env);
}

#define DEFINE_FFI_CLOSURE_FUN(Name, Type, JavaType) \
	static void ffiClosure##Name(ffi_cif* cif, void* ret, void** args, void* user_data) { \
		jboolean async; \
		JNIEnv* env = getEnv(&async); \
\
		const LWJGLCallback *cb = (const LWJGLCallback *)user_data; \
\
		jobject object = (*env)->NewLocalRef(env, (jweak)cb->reference); \
\
		UNUSED_PARAM(cif) \
\
		if ( !verifyCallback(env, object, cb, async) ) \
			return; \
\
		*(Type*)ret = (Type)(*env)->Call##JavaType##Method(env, \
			object, \
			javaCallback##Name, \
			args \
		); \
\
		if ( (*env)->ExceptionCheck(env) && async ) \
			asyncCallbackException(env); \
	}

DEFINE_FFI_CLOSURE_FUN(Z, jboolean, Boolean)
DEFINE_FFI_CLOSURE_FUN(B, jbyte,    Byte)
DEFINE_FFI_CLOSURE_FUN(S, jshort,   Short)
DEFINE_FFI_CLOSURE_FUN(I, jint,     Int)
DEFINE_FFI_CLOSURE_FUN(J, jlong,    Long)
DEFINE_FFI_CLOSURE_FUN(F, jfloat,   Float)
DEFINE_FFI_CLOSURE_FUN(D, jdouble,  Double)
DEFINE_FFI_CLOSURE_FUN(P, intptr_t, Long)

EXTERN_C_ENTER

#define SETUP_CALLBACK(Index, Type) \
	javaCallback##Type = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, Index)); \
	callbacks[Index] = (uintptr_t)&ffiClosure##Type;

JNIEXPORT void JNICALL Java_org_lwjgl_system_Callback_getNativeCallbacks(JNIEnv *env, jclass clazz, jobjectArray methods, jlong callbacksAddress) {
	uintptr_t* callbacks = (uintptr_t *)(intptr_t)callbacksAddress;

	UNUSED_PARAMS(env, clazz)
	
	SETUP_CALLBACK(0, V)
	SETUP_CALLBACK(1, Z)
	SETUP_CALLBACK(2, B)
	SETUP_CALLBACK(3, S)
	SETUP_CALLBACK(4, I)
	SETUP_CALLBACK(5, J)
	SETUP_CALLBACK(6, F)
	SETUP_CALLBACK(7, D)
	SETUP_CALLBACK(8, P)
}

EXTERN_C_EXIT
