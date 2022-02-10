/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glAlphaFuncQCOMPROC) (jint, jfloat);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMAlphaTest_glAlphaFuncQCOM(JNIEnv *__env, jclass clazz, jint func, jfloat ref) {
    glAlphaFuncQCOMPROC glAlphaFuncQCOM = (glAlphaFuncQCOMPROC)tlsGetFunction(840);
    UNUSED_PARAM(clazz)
    glAlphaFuncQCOM(func, ref);
}

EXTERN_C_EXIT
