/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glProgramParameteriEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureFaceEXTPROC) (jint, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_glProgramParameteriEXT(JNIEnv *__env, jclass clazz, jint program, jint pname, jint value) {
    glProgramParameteriEXTPROC glProgramParameteriEXT = (glProgramParameteriEXTPROC)tlsGetFunction(1751);
    UNUSED_PARAM(clazz)
    glProgramParameteriEXT(program, pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_glFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTextureEXTPROC glFramebufferTextureEXT = (glFramebufferTextureEXTPROC)tlsGetFunction(1752);
    UNUSED_PARAM(clazz)
    glFramebufferTextureEXT(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTGeometryShader4_glFramebufferTextureFaceEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint face) {
    glFramebufferTextureFaceEXTPROC glFramebufferTextureFaceEXT = (glFramebufferTextureFaceEXTPROC)tlsGetFunction(1754);
    UNUSED_PARAM(clazz)
    glFramebufferTextureFaceEXT(target, attachment, texture, level, face);
}

EXTERN_C_EXIT
