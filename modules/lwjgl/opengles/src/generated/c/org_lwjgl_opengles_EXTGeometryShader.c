/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferTextureEXTPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTGeometryShader_glFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTextureEXTPROC glFramebufferTextureEXT = (glFramebufferTextureEXTPROC)tlsGetFunction(439);
    UNUSED_PARAM(clazz)
    glFramebufferTextureEXT(target, attachment, texture, level);
}

EXTERN_C_EXIT
