/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

DECLARE_CALLBACK(CLNativeKernel)

static void CL_CALLBACK CLNativeKernelProc(
	void *args
) {
	intptr_t *kernel_args = (intptr_t *)args;

	// Grab the native kernel object and cb_args and increment the args pointer
	jobject kernel = (jobject)*kernel_args++;
	jint cb_args = *(jint *)kernel_args++;

	JNIEnv* env = getEnv();

    (*env)->CallVoidMethod(env, kernel, CLNativeKernelInvoke,
        (jlong)(intptr_t)kernel_args,
        cb_args
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, kernel);
}

CALLBACK_SETUP(org_lwjgl_opencl_CLNativeKernel, CLNativeKernel)
