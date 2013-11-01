/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

DECLARE_CALLBACK(CLProgramCallback)

static void CL_CALLBACK CLProgramCallbackProc(
	cl_program program,
	void *user_data
) {
	JNIEnv* env = getEnv();

    (*env)->CallVoidMethod(env, (jobject)user_data, CLProgramCallbackInvoke,
        (jlong)(intptr_t)program
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);
}

CALLBACK_SETUP(org_lwjgl_opencl_CLProgramCallback, CLProgramCallback)
