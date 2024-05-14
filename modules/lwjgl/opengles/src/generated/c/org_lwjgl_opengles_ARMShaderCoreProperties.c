/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glMaxActiveShaderCoresARMPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_ARMShaderCoreProperties_glMaxActiveShaderCoresARM(JNIEnv *__env, jclass clazz, jint count) {
    glMaxActiveShaderCoresARMPROC glMaxActiveShaderCoresARM = (glMaxActiveShaderCoresARMPROC)tlsGetFunction(387);
    UNUSED_PARAM(clazz)
    glMaxActiveShaderCoresARM(count);
}

EXTERN_C_EXIT
