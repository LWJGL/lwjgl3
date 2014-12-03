/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "ffi.h"

static void ffi_closure_funVoid(ffi_cif* cif, void* ret, void** args, void* user_data) {
	JNIEnv* env = getEnv();
	ClosureCallback* callback = (ClosureCallback*)user_data;

	// Dereference the weak global reference
	jobject object = (*env)->NewLocalRef(env, callback->object);

	UNUSED_PARAM(cif)
	UNUSED_PARAM(ret)

	// Verify
	if ( (*env)->IsSameObject(env, object, NULL) ) {
	    (*env)->ThrowNew(env, (*env)->FindClass(env, "org/lwjgl/system/libffi/ClosureError"), NULL);
		return;
	}

	// Invoke the Java callback
	(*env)->CallVoidMethodA(env,
		object,
		callback->method,
		(const jvalue *)args
	);
}

#define DEFINE_FFI_CLOSURE_FUN(Name, Type, Method) \
	static void ffi_closure_fun##Name(ffi_cif* cif, void* ret, void** args, void* user_data) { \
		JNIEnv* env = getEnv(); \
		ClosureCallback* callback = (ClosureCallback*)user_data; \
 \
		jobject object = (*env)->NewLocalRef(env, callback->object); \
 \
		UNUSED_PARAM(cif) \
 \
		if ( (*env)->IsSameObject(env, object, NULL) ) { \
		    (*env)->ThrowNew(env, (*env)->FindClass(env, "org/lwjgl/system/libffi/ClosureError"), NULL); \
			return; \
		} \
 \
		*(Type*)ret = (Type)(*env)->Call##Method##MethodA(env, \
			object, \
			callback->method, \
			(const jvalue *)args \
		); \
	}
	
DEFINE_FFI_CLOSURE_FUN(Byte,    jbyte,      Byte)
DEFINE_FFI_CLOSURE_FUN(Short,   jshort,     Short)
DEFINE_FFI_CLOSURE_FUN(Int,     jint,       Int)
DEFINE_FFI_CLOSURE_FUN(Long,    jlong,      Long)
DEFINE_FFI_CLOSURE_FUN(Float,   jfloat,     Float)
DEFINE_FFI_CLOSURE_FUN(Double,  jdouble,    Double)
DEFINE_FFI_CLOSURE_FUN(Ptr,     intptr_t,   Long)

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_Closure_getJavaCallback(JNIEnv *env, jobject object, jobject method, jlong callbackAddress) {
	ClosureCallback* callback = (ClosureCallback*)(uintptr_t)callbackAddress;

	callback->object = (*env)->NewWeakGlobalRef(env, object);
	callback->method = (*env)->FromReflectedMethod(env, method);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_Closure_getNativeCallbacks(JNIEnv *env, jclass clazz, jlong callbacksAddress) {
	uintptr_t* callbacks = (uintptr_t *)(intptr_t)callbacksAddress;

	UNUSED_PARAMS(env, clazz)

	callbacks[0] = (uintptr_t)&ffi_closure_funVoid;
	callbacks[1] = (uintptr_t)&ffi_closure_funByte;
	callbacks[2] = (uintptr_t)&ffi_closure_funShort;
	callbacks[3] = (uintptr_t)&ffi_closure_funInt;
	callbacks[4] = (uintptr_t)&ffi_closure_funLong;
	callbacks[5] = (uintptr_t)&ffi_closure_funFloat;
	callbacks[6] = (uintptr_t)&ffi_closure_funDouble;
	callbacks[7] = (uintptr_t)&ffi_closure_funPtr;
}

EXTERN_C_EXIT
