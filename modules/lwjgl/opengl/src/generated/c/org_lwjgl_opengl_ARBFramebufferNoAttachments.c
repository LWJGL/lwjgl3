/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glFramebufferParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glNamedFramebufferParameteriEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetNamedFramebufferParameterivEXTPROC) (jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_glFramebufferParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glFramebufferParameteriPROC glFramebufferParameteri = (glFramebufferParameteriPROC)tlsGetFunction(885);
    UNUSED_PARAM(clazz)
    glFramebufferParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_nglGetFramebufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetFramebufferParameterivPROC glGetFramebufferParameteriv = (glGetFramebufferParameterivPROC)tlsGetFunction(886);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_glNamedFramebufferParameteriEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jint param) {
    glNamedFramebufferParameteriEXTPROC glNamedFramebufferParameteriEXT = (glNamedFramebufferParameteriEXTPROC)tlsGetFunction(1109);
    UNUSED_PARAM(clazz)
    glNamedFramebufferParameteriEXT(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBFramebufferNoAttachments_nglGetNamedFramebufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferParameterivEXTPROC glGetNamedFramebufferParameterivEXT = (glGetNamedFramebufferParameterivEXTPROC)tlsGetFunction(1110);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferParameterivEXT(framebuffer, pname, params);
}

EXTERN_C_EXIT
