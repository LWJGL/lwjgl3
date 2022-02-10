/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glFramebufferFetchBarrierQCOMPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMShaderFramebufferFetchNoncoherent_glFramebufferFetchBarrierQCOM(JNIEnv *__env, jclass clazz) {
    glFramebufferFetchBarrierQCOMPROC glFramebufferFetchBarrierQCOM = (glFramebufferFetchBarrierQCOMPROC)tlsGetFunction(862);
    UNUSED_PARAM(clazz)
    glFramebufferFetchBarrierQCOM();
}

EXTERN_C_EXIT
