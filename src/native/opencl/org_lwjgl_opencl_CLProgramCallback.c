/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLProgramCallbackMethod;

static void CL_CALLBACK CLProgramCallbackFunction(
	cl_program program,
	void *user_data
) {
	JNIEnv *env = getThreadEnv();
	jboolean async = env == NULL;
	if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
	}

    (*env)->CallVoidMethod(env, (jobject)user_data, CLProgramCallbackMethod,
        (jlong)(intptr_t)program
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);

	if ( async )
        detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLProgramCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	CLProgramCallbackMethod = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLProgramCallbackFunction;
}