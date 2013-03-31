/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLNativeKernelMethod;

static void CL_CALLBACK CLNativeKernelFunction(
	void *args
) {
	// Grab the native kernel object from the first args slot
	jobject kernel = (jobject)*(intptr_t *)args;

	JNIEnv *env = getThreadEnv();
	jboolean async = env == NULL;
	if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
	}

    (*env)->CallVoidMethod(env, kernel, CLNativeKernelMethod,
        // Skip the native kernel object
        (jlong)((intptr_t)args + sizeof(jobject))
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, kernel);

	if ( async )
        detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLNativeKernel_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	CLNativeKernelMethod = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLNativeKernelFunction;
}