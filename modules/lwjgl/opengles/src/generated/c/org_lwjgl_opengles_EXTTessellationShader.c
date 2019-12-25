/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glPatchParameteriEXTPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTTessellationShader_glPatchParameteriEXT(JNIEnv *__env, jclass clazz, jint pname, jint value) {
    glPatchParameteriEXTPROC glPatchParameteriEXT = (glPatchParameteriEXTPROC)tlsGetFunction(538);
    UNUSED_PARAM(clazz)
    glPatchParameteriEXT(pname, value);
}

EXTERN_C_EXIT
