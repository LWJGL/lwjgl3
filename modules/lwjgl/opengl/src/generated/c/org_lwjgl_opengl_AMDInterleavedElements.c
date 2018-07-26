/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glVertexAttribParameteriAMDPROC) (jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDInterleavedElements_glVertexAttribParameteriAMD(JNIEnv *__env, jclass clazz, jint index, jint pname, jint param) {
    glVertexAttribParameteriAMDPROC glVertexAttribParameteriAMD = (glVertexAttribParameteriAMDPROC)tlsGetFunction(1058);
    UNUSED_PARAM(clazz)
    glVertexAttribParameteriAMD(index, pname, param);
}

EXTERN_C_EXIT
