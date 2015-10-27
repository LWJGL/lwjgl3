/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "ffi.h"

static jmethodID
	javaCallbackVoid,
	javaCallbackByte,
	javaCallbackShort,
	javaCallbackInt,
	javaCallbackLong,
	javaCallbackFloat,
	javaCallbackDouble,
	javaCallbackPtr;

typedef struct LWJGLCallback {
	jweak reference;
	const char* debug;
} LWJGLCallback;

static void asyncCallbackException(JNIEnv* env) {
	fprintf(stderr, "[LWJGL] Exception in closure that was invoked asynchronously from a native thread.\n");
    fflush(stderr);

	(*env)->ExceptionDescribe(env);
	(*env)->ExceptionClear(env);
}

static void throwClosureError(JNIEnv* env, const LWJGLCallback *cb, jboolean async) {
	(*env)->ThrowNew(env, (*env)->FindClass(env, "org/lwjgl/system/libffi/ClosureError"), cb->debug);

	if ( async )
		asyncCallbackException(env);
}

inline static jboolean verifyCallback(JNIEnv* env, jobject object, const LWJGLCallback *cb, jboolean async) {
	if ( (*env)->IsSameObject(env, object, NULL) ) {
		throwClosureError(env, cb, async);
		return JNI_FALSE;
	}

	return JNI_TRUE;
}

static void ffiClosureVoid(ffi_cif* cif, void* ret, void** args, void* user_data) {
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
		javaCallbackVoid,
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
	
DEFINE_FFI_CLOSURE_FUN(Byte,    jbyte,      Byte)
DEFINE_FFI_CLOSURE_FUN(Short,   jshort,     Short)
DEFINE_FFI_CLOSURE_FUN(Int,     jint,       Int)
DEFINE_FFI_CLOSURE_FUN(Long,    jlong,      Long)
DEFINE_FFI_CLOSURE_FUN(Float,   jfloat,     Float)
DEFINE_FFI_CLOSURE_FUN(Double,  jdouble,    Double)
DEFINE_FFI_CLOSURE_FUN(Ptr,     intptr_t,   Long)

EXTERN_C_ENTER

#define SETUP_CALLBACK(Index, Type) \
	javaCallback##Type = (*env)->FromReflectedMethod(env, (*env)->GetObjectArrayElement(env, methods, Index)); \
	callbacks[Index] = (uintptr_t)&ffiClosure##Type;

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_Closure_getNativeCallbacks(JNIEnv *env, jclass clazz, jobjectArray methods, jlong callbacksAddress) {
	uintptr_t* callbacks = (uintptr_t *)(intptr_t)callbacksAddress;

	UNUSED_PARAMS(env, clazz)
	
	SETUP_CALLBACK(0, Void)
	SETUP_CALLBACK(1, Byte)
	SETUP_CALLBACK(2, Short)
	SETUP_CALLBACK(3, Int)
	SETUP_CALLBACK(4, Long)
	SETUP_CALLBACK(5, Float)
	SETUP_CALLBACK(6, Double)
	SETUP_CALLBACK(7, Ptr)
}

EXTERN_C_EXIT
