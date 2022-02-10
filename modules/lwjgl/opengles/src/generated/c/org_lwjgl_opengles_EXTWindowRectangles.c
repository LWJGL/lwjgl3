/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glWindowRectanglesEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTWindowRectangles_nglWindowRectanglesEXT__IIJ(JNIEnv *__env, jclass clazz, jint mode, jint count, jlong boxAddress) {
    glWindowRectanglesEXTPROC glWindowRectanglesEXT = (glWindowRectanglesEXTPROC)tlsGetFunction(560);
    uintptr_t box = (uintptr_t)boxAddress;
    UNUSED_PARAM(clazz)
    glWindowRectanglesEXT(mode, count, box);
}

EXTERN_C_EXIT
