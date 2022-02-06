/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glSetMultisamplefvAMDPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_AMDSamplePositions_nglSetMultisamplefvAMD__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong valAddress) {
    glSetMultisamplefvAMDPROC glSetMultisamplefvAMD = (glSetMultisamplefvAMDPROC)tlsGetFunction(1105);
    uintptr_t val = (uintptr_t)valAddress;
    UNUSED_PARAM(clazz)
    glSetMultisamplefvAMD(pname, index, val);
}

EXTERN_C_EXIT
