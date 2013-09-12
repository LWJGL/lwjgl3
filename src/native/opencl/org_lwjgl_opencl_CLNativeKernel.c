/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLNativeKernelInvoke;

static void CL_CALLBACK CLNativeKernelProc(
	void *args
) {
	// Grab the native kernel object from the first args slot
	jobject kernel = (jobject)*(intptr_t *)args;

	ATTACH_THREAD()

    (*env)->CallVoidMethod(env, kernel, CLNativeKernelInvoke,
        // Skip the native kernel object
        (jlong)((intptr_t)args + sizeof(jobject))
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, kernel);

	DETACH_THREAD()
}

CALLBACK_SETUP(org_lwjgl_opencl_CLNativeKernel, CLNativeKernel)