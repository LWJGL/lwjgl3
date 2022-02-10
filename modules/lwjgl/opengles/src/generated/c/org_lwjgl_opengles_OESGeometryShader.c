/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferTextureOESPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESGeometryShader_glFramebufferTextureOES(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTextureOESPROC glFramebufferTextureOES = (glFramebufferTextureOESPROC)tlsGetFunction(798);
    UNUSED_PARAM(clazz)
    glFramebufferTextureOES(target, attachment, texture, level);
}

EXTERN_C_EXIT
