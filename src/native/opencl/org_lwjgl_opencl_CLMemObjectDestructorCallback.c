/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

DECLARE_CALLBACK(CLMemObjectDestructorCallback)

static void CL_CALLBACK CLMemObjectDestructorCallbackProc(
	cl_mem memobj,
	void *user_data
) {
	JNIEnv* env = getEnv();

    (*env)->CallVoidMethod(env, (jobject)user_data, CLMemObjectDestructorCallbackInvoke,
        (jlong)(intptr_t)memobj
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);
}

CALLBACK_SETUP(org_lwjgl_opencl_CLMemObjectDestructorCallback, CLMemObjectDestructorCallback)
