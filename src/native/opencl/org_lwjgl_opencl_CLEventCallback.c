/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLEventCallbackMethod;

static void CL_CALLBACK CLEventCallbackFunction(
	cl_event event,
	cl_int event_command_exec_status,
	void *user_data
) {
	JNIEnv *env = getThreadEnv();
	jboolean async = env == NULL;
	if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
	}

    (*env)->CallVoidMethod(env, (jobject)user_data, CLEventCallbackMethod,
        (jlong)(intptr_t)event,
        (jint)event_command_exec_status
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);

	if ( async )
        detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLEventCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	CLEventCallbackMethod = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLEventCallbackFunction;
}