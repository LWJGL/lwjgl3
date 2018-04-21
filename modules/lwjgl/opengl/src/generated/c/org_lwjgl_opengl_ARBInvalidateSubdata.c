/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glInvalidateTexSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glInvalidateTexImagePROC) (jint, jint);
typedef void (APIENTRY *glInvalidateBufferSubDataPROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glInvalidateBufferDataPROC) (jint);
typedef void (APIENTRY *glInvalidateFramebufferPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glInvalidateSubFramebufferPROC) (jint, jint, intptr_t, jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInvalidateSubdata_glInvalidateTexSubImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth) {
    glInvalidateTexSubImagePROC glInvalidateTexSubImage = (glInvalidateTexSubImagePROC)tlsGetFunction(888);
    UNUSED_PARAM(clazz)
    glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInvalidateSubdata_glInvalidateTexImage(JNIEnv *__env, jclass clazz, jint texture, jint level) {
    glInvalidateTexImagePROC glInvalidateTexImage = (glInvalidateTexImagePROC)tlsGetFunction(889);
    UNUSED_PARAM(clazz)
    glInvalidateTexImage(texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInvalidateSubdata_glInvalidateBufferSubData(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length) {
    glInvalidateBufferSubDataPROC glInvalidateBufferSubData = (glInvalidateBufferSubDataPROC)tlsGetFunction(890);
    UNUSED_PARAM(clazz)
    glInvalidateBufferSubData(buffer, (intptr_t)offset, (intptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInvalidateSubdata_glInvalidateBufferData(JNIEnv *__env, jclass clazz, jint buffer) {
    glInvalidateBufferDataPROC glInvalidateBufferData = (glInvalidateBufferDataPROC)tlsGetFunction(891);
    UNUSED_PARAM(clazz)
    glInvalidateBufferData(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInvalidateSubdata_nglInvalidateFramebuffer__IIJ(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress) {
    glInvalidateFramebufferPROC glInvalidateFramebuffer = (glInvalidateFramebufferPROC)tlsGetFunction(892);
    intptr_t attachments = (intptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateFramebuffer(target, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBInvalidateSubdata_nglInvalidateSubFramebuffer__IIJIIII(JNIEnv *__env, jclass clazz, jint target, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height) {
    glInvalidateSubFramebufferPROC glInvalidateSubFramebuffer = (glInvalidateSubFramebufferPROC)tlsGetFunction(893);
    intptr_t attachments = (intptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
}

EXTERN_C_EXIT
