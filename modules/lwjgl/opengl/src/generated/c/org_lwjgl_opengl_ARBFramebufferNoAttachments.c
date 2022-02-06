/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glNamedFramebufferParameteriEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetNamedFramebufferParameterivEXTPROC) (jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_glNamedFramebufferParameteriEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jint param) {
    glNamedFramebufferParameteriEXTPROC glNamedFramebufferParameteriEXT = (glNamedFramebufferParameteriEXTPROC)tlsGetFunction(1145);
    UNUSED_PARAM(clazz)
    glNamedFramebufferParameteriEXT(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_nglGetNamedFramebufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferParameterivEXTPROC glGetNamedFramebufferParameterivEXT = (glGetNamedFramebufferParameterivEXTPROC)tlsGetFunction(1146);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferParameterivEXT(framebuffer, pname, params);
}

EXTERN_C_EXIT
