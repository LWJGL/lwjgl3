/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glExtGetTexturesQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glExtGetBuffersQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glExtGetRenderbuffersQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glExtGetFramebuffersQCOMPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glExtGetTexLevelParameterivQCOMPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glExtTexObjectStateOverrideiQCOMPROC) (jint, jint, jint);
typedef void (APIENTRY *glExtGetTexSubImageQCOMPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glExtGetBufferPointervQCOMPROC) (jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexturesQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong texturesAddress, jint maxTextures, jlong numTexturesAddress) {
    glExtGetTexturesQCOMPROC glExtGetTexturesQCOM = (glExtGetTexturesQCOMPROC)tlsGetFunction(845);
    uintptr_t textures = (uintptr_t)texturesAddress;
    uintptr_t numTextures = (uintptr_t)numTexturesAddress;
    UNUSED_PARAM(clazz)
    glExtGetTexturesQCOM(textures, maxTextures, numTextures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetBuffersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong buffersAddress, jint maxBuffers, jlong numBuffersAddress) {
    glExtGetBuffersQCOMPROC glExtGetBuffersQCOM = (glExtGetBuffersQCOMPROC)tlsGetFunction(846);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    uintptr_t numBuffers = (uintptr_t)numBuffersAddress;
    UNUSED_PARAM(clazz)
    glExtGetBuffersQCOM(buffers, maxBuffers, numBuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetRenderbuffersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong renderbuffersAddress, jint maxRenderbuffers, jlong numRenderbuffersAddress) {
    glExtGetRenderbuffersQCOMPROC glExtGetRenderbuffersQCOM = (glExtGetRenderbuffersQCOMPROC)tlsGetFunction(847);
    uintptr_t renderbuffers = (uintptr_t)renderbuffersAddress;
    uintptr_t numRenderbuffers = (uintptr_t)numRenderbuffersAddress;
    UNUSED_PARAM(clazz)
    glExtGetRenderbuffersQCOM(renderbuffers, maxRenderbuffers, numRenderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetFramebuffersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong framebuffersAddress, jint maxFramebuffers, jlong numFramebuffersAddress) {
    glExtGetFramebuffersQCOMPROC glExtGetFramebuffersQCOM = (glExtGetFramebuffersQCOMPROC)tlsGetFunction(848);
    uintptr_t framebuffers = (uintptr_t)framebuffersAddress;
    uintptr_t numFramebuffers = (uintptr_t)numFramebuffersAddress;
    UNUSED_PARAM(clazz)
    glExtGetFramebuffersQCOM(framebuffers, maxFramebuffers, numFramebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexLevelParameterivQCOM__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint face, jint level, jint pname, jlong paramsAddress) {
    glExtGetTexLevelParameterivQCOMPROC glExtGetTexLevelParameterivQCOM = (glExtGetTexLevelParameterivQCOMPROC)tlsGetFunction(849);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glExtGetTexLevelParameterivQCOM(texture, face, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_glExtTexObjectStateOverrideiQCOM(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glExtTexObjectStateOverrideiQCOMPROC glExtTexObjectStateOverrideiQCOM = (glExtTexObjectStateOverrideiQCOMPROC)tlsGetFunction(850);
    UNUSED_PARAM(clazz)
    glExtTexObjectStateOverrideiQCOM(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexSubImageQCOM(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong texelsAddress) {
    glExtGetTexSubImageQCOMPROC glExtGetTexSubImageQCOM = (glExtGetTexSubImageQCOMPROC)tlsGetFunction(851);
    uintptr_t texels = (uintptr_t)texelsAddress;
    UNUSED_PARAM(clazz)
    glExtGetTexSubImageQCOM(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, texels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetBufferPointervQCOM(JNIEnv *__env, jclass clazz, jint target, jlong paramsAddress) {
    glExtGetBufferPointervQCOMPROC glExtGetBufferPointervQCOM = (glExtGetBufferPointervQCOMPROC)tlsGetFunction(852);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glExtGetBufferPointervQCOM(target, params);
}

EXTERN_C_EXIT
