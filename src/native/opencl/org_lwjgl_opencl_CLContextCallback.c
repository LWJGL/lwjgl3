/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLContextCallbackMethod;

static void CL_CALLBACK CLContextCallbackFunction(
	const char *errinfo,
	const void *private_info,
	size_t cb,
	void *user_data
) {
	jobject callback;

	JNIEnv *env = getThreadEnv();
	jboolean async = env == NULL;
	if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
	}

	// user_data is a weak global reference
	callback = (*env)->NewLocalRef(env, (jweak)user_data);
	if ( callback != NULL ) {
	    (*env)->CallVoidMethod(env, callback, CLContextCallbackMethod,
	        (jlong)(intptr_t)errinfo,
	        (jlong)(intptr_t)private_info,
	        (jlong)cb
	    );
	    (*env)->DeleteLocalRef(env, callback);
    }

	if ( async )
        detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLContextCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	CLContextCallbackMethod = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLContextCallbackFunction;
}