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

static void ffiClosureVoid(ffi_cif* cif, void* ret, void** args, void* user_data) {
	JNIEnv* env = getEnv();

	// Dereference the weak global reference
	jobject object = (*env)->NewLocalRef(env, (jweak)user_data);

	UNUSED_PARAM(cif)
	UNUSED_PARAM(ret)

	// Verify
	if ( (*env)->IsSameObject(env, object, NULL) ) {
	    (*env)->ThrowNew(env, (*env)->FindClass(env, "org/lwjgl/system/libffi/ClosureError"), NULL);
		return;
	}

	// Invoke the Java callback
	(*env)->CallVoidMethod(env,
		object,
		javaCallbackVoid,
		args
	);
}

#define DEFINE_FFI_CLOSURE_FUN(Name, Type, JavaType) \
	static void ffiClosure##Name(ffi_cif* cif, void* ret, void** args, void* user_data) { \
		JNIEnv* env = getEnv(); \
 \
		jobject object = (*env)->NewLocalRef(env, (jweak)user_data); \
 \
		UNUSED_PARAM(cif) \
 \
		if ( (*env)->IsSameObject(env, object, NULL) ) { \
		    (*env)->ThrowNew(env, (*env)->FindClass(env, "org/lwjgl/system/libffi/ClosureError"), NULL); \
			return; \
		} \
 \
		*(Type*)ret = (Type)(*env)->Call##JavaType##Method(env, \
			object, \
			javaCallback##Name, \
			args \
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
