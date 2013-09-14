/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

DECLARE_CALLBACK(CLContextCallback);

static void CL_CALLBACK CLContextCallbackProc(
	const char *errinfo,
	const void *private_info,
	size_t cb,
	void *user_data
) {
	JNIEnv* env = getEnv();

	// user_data is a weak global reference
	jobject callback = (*env)->NewLocalRef(env, (jweak)user_data);
	if ( callback != NULL ) {
	    (*env)->CallVoidMethod(env, callback, CLContextCallbackInvoke,
	        (jlong)(intptr_t)errinfo,
	        (jlong)(intptr_t)private_info,
	        (jlong)cb
	    );
	    (*env)->DeleteLocalRef(env, callback);
    }
}

CALLBACK_SETUP(org_lwjgl_opencl_CLContextCallback, CLContextCallback)