/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glGetMemoryObjectDetachedResourcesuivNVPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glResetMemoryObjectParameterNVPROC) (jint, jint);
typedef void (APIENTRY *glTexAttachMemoryNVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glBufferAttachMemoryNVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glTextureAttachMemoryNVPROC) (jint, jint, jlong);
typedef void (APIENTRY *glNamedBufferAttachMemoryNVPROC) (jint, jint, jlong);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryAttachment_nglGetMemoryObjectDetachedResourcesuivNV__IIIIJ(JNIEnv *__env, jclass clazz, jint memory, jint pname, jint first, jint count, jlong paramsAddress) {
    glGetMemoryObjectDetachedResourcesuivNVPROC glGetMemoryObjectDetachedResourcesuivNV = (glGetMemoryObjectDetachedResourcesuivNVPROC)tlsGetFunction(2033);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMemoryObjectDetachedResourcesuivNV(memory, pname, first, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryAttachment_glResetMemoryObjectParameterNV(JNIEnv *__env, jclass clazz, jint memory, jint pname) {
    glResetMemoryObjectParameterNVPROC glResetMemoryObjectParameterNV = (glResetMemoryObjectParameterNVPROC)tlsGetFunction(2034);
    UNUSED_PARAM(clazz)
    glResetMemoryObjectParameterNV(memory, pname);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryAttachment_glTexAttachMemoryNV(JNIEnv *__env, jclass clazz, jint target, jint memory, jlong offset) {
    glTexAttachMemoryNVPROC glTexAttachMemoryNV = (glTexAttachMemoryNVPROC)tlsGetFunction(2035);
    UNUSED_PARAM(clazz)
    glTexAttachMemoryNV(target, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryAttachment_glBufferAttachMemoryNV(JNIEnv *__env, jclass clazz, jint target, jint memory, jlong offset) {
    glBufferAttachMemoryNVPROC glBufferAttachMemoryNV = (glBufferAttachMemoryNVPROC)tlsGetFunction(2036);
    UNUSED_PARAM(clazz)
    glBufferAttachMemoryNV(target, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryAttachment_glTextureAttachMemoryNV(JNIEnv *__env, jclass clazz, jint texture, jint memory, jlong offset) {
    glTextureAttachMemoryNVPROC glTextureAttachMemoryNV = (glTextureAttachMemoryNVPROC)tlsGetFunction(2037);
    UNUSED_PARAM(clazz)
    glTextureAttachMemoryNV(texture, memory, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_NVMemoryAttachment_glNamedBufferAttachMemoryNV(JNIEnv *__env, jclass clazz, jint buffer, jint memory, jlong offset) {
    glNamedBufferAttachMemoryNVPROC glNamedBufferAttachMemoryNV = (glNamedBufferAttachMemoryNVPROC)tlsGetFunction(2038);
    UNUSED_PARAM(clazz)
    glNamedBufferAttachMemoryNV(buffer, memory, offset);
}

EXTERN_C_EXIT
