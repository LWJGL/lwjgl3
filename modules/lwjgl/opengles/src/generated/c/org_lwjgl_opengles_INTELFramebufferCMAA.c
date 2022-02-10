/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glApplyFramebufferAttachmentCMAAINTELPROC) (void);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_INTELFramebufferCMAA_glApplyFramebufferAttachmentCMAAINTEL(JNIEnv *__env, jclass clazz) {
    glApplyFramebufferAttachmentCMAAINTELPROC glApplyFramebufferAttachmentCMAAINTEL = (glApplyFramebufferAttachmentCMAAINTELPROC)tlsGetFunction(565);
    UNUSED_PARAM(clazz)
    glApplyFramebufferAttachmentCMAAINTEL();
}

EXTERN_C_EXIT
