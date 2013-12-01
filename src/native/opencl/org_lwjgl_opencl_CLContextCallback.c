/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

DECLARE_CALLBACK(CLContextCallback)

static void CL_CALLBACK CLContextCallbackProc(
	const char *errinfo,
	const void *private_info,
	size_t cb,
	void *user_data
) {
	JNIEnv* env = getEnv();

    (*env)->CallVoidMethod(env, (jobject)user_data, CLContextCallbackInvoke,
        (jlong)(intptr_t)errinfo,
        (jlong)(intptr_t)private_info,
        (jlong)cb
    );
}

CALLBACK_SETUP(org_lwjgl_opencl_CLContextCallback, CLContextCallback)
