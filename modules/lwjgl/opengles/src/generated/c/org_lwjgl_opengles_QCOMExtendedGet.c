/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glExtGetTexturesQCOMPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glExtGetBuffersQCOMPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glExtGetRenderbuffersQCOMPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glExtGetFramebuffersQCOMPROC) (intptr_t, jint, intptr_t);
typedef void (APIENTRY *glExtGetTexLevelParameterivQCOMPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glExtTexObjectStateOverrideiQCOMPROC) (jint, jint, jint);
typedef void (APIENTRY *glExtGetTexSubImageQCOMPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glExtGetBufferPointervQCOMPROC) (jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexturesQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong texturesAddress, jint maxTextures, jlong numTexturesAddress) {
    glExtGetTexturesQCOMPROC glExtGetTexturesQCOM = (glExtGetTexturesQCOMPROC)tlsGetFunction(834);
    intptr_t textures = (intptr_t)texturesAddress;
    intptr_t numTextures = (intptr_t)numTexturesAddress;
    UNUSED_PARAM(clazz)
    glExtGetTexturesQCOM(textures, maxTextures, numTextures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetBuffersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong buffersAddress, jint maxBuffers, jlong numBuffersAddress) {
    glExtGetBuffersQCOMPROC glExtGetBuffersQCOM = (glExtGetBuffersQCOMPROC)tlsGetFunction(835);
    intptr_t buffers = (intptr_t)buffersAddress;
    intptr_t numBuffers = (intptr_t)numBuffersAddress;
    UNUSED_PARAM(clazz)
    glExtGetBuffersQCOM(buffers, maxBuffers, numBuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetRenderbuffersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong renderbuffersAddress, jint maxRenderbuffers, jlong numRenderbuffersAddress) {
    glExtGetRenderbuffersQCOMPROC glExtGetRenderbuffersQCOM = (glExtGetRenderbuffersQCOMPROC)tlsGetFunction(836);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    intptr_t numRenderbuffers = (intptr_t)numRenderbuffersAddress;
    UNUSED_PARAM(clazz)
    glExtGetRenderbuffersQCOM(renderbuffers, maxRenderbuffers, numRenderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetFramebuffersQCOM__JIJ(JNIEnv *__env, jclass clazz, jlong framebuffersAddress, jint maxFramebuffers, jlong numFramebuffersAddress) {
    glExtGetFramebuffersQCOMPROC glExtGetFramebuffersQCOM = (glExtGetFramebuffersQCOMPROC)tlsGetFunction(837);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    intptr_t numFramebuffers = (intptr_t)numFramebuffersAddress;
    UNUSED_PARAM(clazz)
    glExtGetFramebuffersQCOM(framebuffers, maxFramebuffers, numFramebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexLevelParameterivQCOM__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint face, jint level, jint pname, jlong paramsAddress) {
    glExtGetTexLevelParameterivQCOMPROC glExtGetTexLevelParameterivQCOM = (glExtGetTexLevelParameterivQCOMPROC)tlsGetFunction(838);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glExtGetTexLevelParameterivQCOM(texture, face, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_glExtTexObjectStateOverrideiQCOM(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glExtTexObjectStateOverrideiQCOMPROC glExtTexObjectStateOverrideiQCOM = (glExtTexObjectStateOverrideiQCOMPROC)tlsGetFunction(839);
    UNUSED_PARAM(clazz)
    glExtTexObjectStateOverrideiQCOM(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetTexSubImageQCOM(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong texelsAddress) {
    glExtGetTexSubImageQCOMPROC glExtGetTexSubImageQCOM = (glExtGetTexSubImageQCOMPROC)tlsGetFunction(840);
    intptr_t texels = (intptr_t)texelsAddress;
    UNUSED_PARAM(clazz)
    glExtGetTexSubImageQCOM(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, texels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_QCOMExtendedGet_nglExtGetBufferPointervQCOM(JNIEnv *__env, jclass clazz, jint target, jlong paramsAddress) {
    glExtGetBufferPointervQCOMPROC glExtGetBufferPointervQCOM = (glExtGetBufferPointervQCOMPROC)tlsGetFunction(841);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glExtGetBufferPointervQCOM(target, params);
}

EXTERN_C_EXIT
