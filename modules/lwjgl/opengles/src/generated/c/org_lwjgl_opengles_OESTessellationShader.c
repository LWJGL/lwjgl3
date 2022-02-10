/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glPatchParameteriOESPROC) (jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_OESTessellationShader_glPatchParameteriOES(JNIEnv *__env, jclass clazz, jint pname, jint value) {
    glPatchParameteriOESPROC glPatchParameteriOES = (glPatchParameteriOESPROC)tlsGetFunction(806);
    UNUSED_PARAM(clazz)
    glPatchParameteriOES(pname, value);
}

EXTERN_C_EXIT
