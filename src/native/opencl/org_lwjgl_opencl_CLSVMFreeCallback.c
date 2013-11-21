/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

DECLARE_CALLBACK(CLSVMFreeCallback)

static void CL_CALLBACK CLSVMFreeCallbackProc(
	cl_command_queue queue,
	cl_uint num_svm_pointers,
	void* svm_pointers[],
	void *user_data
) {
	JNIEnv* env = getEnv();

    (*env)->CallVoidMethod(env, (jobject)user_data, CLSVMFreeCallbackInvoke,
        (jlong)(intptr_t)queue,
        num_svm_pointers,
        (jlong)(intptr_t)svm_pointers
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);
}

CALLBACK_SETUP(org_lwjgl_opencl_CLSVMFreeCallback, CLSVMFreeCallback)
