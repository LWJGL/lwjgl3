/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenGL.h"

DECLARE_CALLBACK(DEBUGPROCAMD)

static void APIENTRY DEBUGPROCAMDProc(GLuint id, GLenum category, GLenum severity, GLsizei length, const GLchar* message, GLvoid* userParam) {
	JNIEnv* env = getEnv();
	(*env)->CallVoidMethod(env, (jobject)userParam, DEBUGPROCAMDInvoke,
        (jint)id,
        (jint)category,
        (jint)severity,
        (jint)length,
        (jlong)(intptr_t)message
    );
}

CALLBACK_SETUP(org_lwjgl_opengl_DEBUGPROCAMD, DEBUGPROCAMD)
