/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenGL.h"

static jmethodID DEBUGPROCInvoke;

static void APIENTRY DEBUGPROCProc(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, const GLchar* message, GLvoid* userParam) {
	ENTER_ENV()

    (*env)->CallVoidMethod(env, (jobject)userParam, DEBUGPROCInvoke,
        (jint)source,
        (jint)type,
        (jint)id,
        (jint)severity,
        (jint)length,
        (jlong)(intptr_t)message
    );

    EXIT_ENV()
}

CALLBACK_SETUP(org_lwjgl_opengl_DEBUGPROC, DEBUGPROC)