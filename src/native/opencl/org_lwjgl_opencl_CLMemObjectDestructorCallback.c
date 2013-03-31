/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLMemObjectDestructorCallbackMethod;

static void CL_CALLBACK CLMemObjectDestructorCallbackFunction(
	cl_mem memobj,
	void *user_data
) {
	JNIEnv *env = getThreadEnv();
	jboolean async = env == NULL;
	if ( async ) {
        env = attachCurrentThread();
        if ( env == NULL )
            return;
	}

    (*env)->CallVoidMethod(env, (jobject)user_data, CLMemObjectDestructorCallbackMethod,
        (jlong)(intptr_t)memobj
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);

	if ( async )
        detachCurrentThread();
}

// setCallback(Ljava/lang/reflect/Method;)J
JNIEXPORT jlong JNICALL Java_org_lwjgl_opencl_CLMemObjectDestructorCallback_setCallback(JNIEnv *env, jclass clazz,
	jobject method
) {
	CLMemObjectDestructorCallbackMethod = (*env)->FromReflectedMethod(env, method);
	return (jlong)(intptr_t)&CLMemObjectDestructorCallbackFunction;
}