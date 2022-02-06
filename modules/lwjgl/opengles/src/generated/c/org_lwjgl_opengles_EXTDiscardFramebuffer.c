/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glDiscardFramebufferEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_EXTDiscardFramebuffer_nglDiscardFramebufferEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress) {
    glDiscardFramebufferEXTPROC glDiscardFramebufferEXT = (glDiscardFramebufferEXTPROC)tlsGetFunction(405);
    uintptr_t attachments = (uintptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glDiscardFramebufferEXT(target, numAttachments, attachments);
}

EXTERN_C_EXIT
