/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glQueryObjectParameteruiAMDPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDOcclusionQueryEvent_glQueryObjectParameteruiAMD(JNIEnv *__env, jclass clazz, jint target, jint id, jint pname, jint param) {
    glQueryObjectParameteruiAMDPROC glQueryObjectParameteruiAMD = (glQueryObjectParameteruiAMDPROC)tlsGetFunction(1059);
    UNUSED_PARAM(clazz)
    glQueryObjectParameteruiAMD(target, id, pname, param);
}

EXTERN_C_EXIT
