/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef jboolean (APIENTRY *glIsRenderbufferEXTPROC) (jint);
typedef void (APIENTRY *glBindRenderbufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glDeleteRenderbuffersEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenRenderbuffersEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glRenderbufferStorageEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetRenderbufferParameterivEXTPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsFramebufferEXTPROC) (jint);
typedef void (APIENTRY *glBindFramebufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glDeleteFramebuffersEXTPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenFramebuffersEXTPROC) (jint, intptr_t);
typedef jint (APIENTRY *glCheckFramebufferStatusEXTPROC) (jint);
typedef void (APIENTRY *glFramebufferTexture1DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture3DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferRenderbufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferAttachmentParameterivEXTPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGenerateMipmapEXTPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glIsRenderbufferEXT(JNIEnv *__env, jclass clazz, jint renderbuffer) {
    glIsRenderbufferEXTPROC glIsRenderbufferEXT = (glIsRenderbufferEXTPROC)tlsGetFunction(1700);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsRenderbufferEXT(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glBindRenderbufferEXT(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
    glBindRenderbufferEXTPROC glBindRenderbufferEXT = (glBindRenderbufferEXTPROC)tlsGetFunction(1701);
    UNUSED_PARAM(clazz)
    glBindRenderbufferEXT(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglDeleteRenderbuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glDeleteRenderbuffersEXTPROC glDeleteRenderbuffersEXT = (glDeleteRenderbuffersEXTPROC)tlsGetFunction(1702);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteRenderbuffersEXT(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenRenderbuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glGenRenderbuffersEXTPROC glGenRenderbuffersEXT = (glGenRenderbuffersEXTPROC)tlsGetFunction(1703);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glGenRenderbuffersEXT(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glRenderbufferStorageEXT(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
    glRenderbufferStorageEXTPROC glRenderbufferStorageEXT = (glRenderbufferStorageEXTPROC)tlsGetFunction(1704);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageEXT(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGetRenderbufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetRenderbufferParameterivEXTPROC glGetRenderbufferParameterivEXT = (glGetRenderbufferParameterivEXTPROC)tlsGetFunction(1705);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetRenderbufferParameterivEXT(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glIsFramebufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer) {
    glIsFramebufferEXTPROC glIsFramebufferEXT = (glIsFramebufferEXTPROC)tlsGetFunction(1706);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsFramebufferEXT(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glBindFramebufferEXT(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
    glBindFramebufferEXTPROC glBindFramebufferEXT = (glBindFramebufferEXTPROC)tlsGetFunction(1707);
    UNUSED_PARAM(clazz)
    glBindFramebufferEXT(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglDeleteFramebuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glDeleteFramebuffersEXTPROC glDeleteFramebuffersEXT = (glDeleteFramebuffersEXTPROC)tlsGetFunction(1708);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteFramebuffersEXT(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGenFramebuffersEXT__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glGenFramebuffersEXTPROC glGenFramebuffersEXT = (glGenFramebuffersEXTPROC)tlsGetFunction(1709);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glGenFramebuffersEXT(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glCheckFramebufferStatusEXT(JNIEnv *__env, jclass clazz, jint target) {
    glCheckFramebufferStatusEXTPROC glCheckFramebufferStatusEXT = (glCheckFramebufferStatusEXTPROC)tlsGetFunction(1710);
    UNUSED_PARAM(clazz)
    return (jint)glCheckFramebufferStatusEXT(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glFramebufferTexture1DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture1DEXTPROC glFramebufferTexture1DEXT = (glFramebufferTexture1DEXTPROC)tlsGetFunction(1711);
    UNUSED_PARAM(clazz)
    glFramebufferTexture1DEXT(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glFramebufferTexture2DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture2DEXTPROC glFramebufferTexture2DEXT = (glFramebufferTexture2DEXTPROC)tlsGetFunction(1712);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2DEXT(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glFramebufferTexture3DEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint zoffset) {
    glFramebufferTexture3DEXTPROC glFramebufferTexture3DEXT = (glFramebufferTexture3DEXTPROC)tlsGetFunction(1713);
    UNUSED_PARAM(clazz)
    glFramebufferTexture3DEXT(target, attachment, textarget, texture, level, zoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glFramebufferRenderbufferEXT(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glFramebufferRenderbufferEXTPROC glFramebufferRenderbufferEXT = (glFramebufferRenderbufferEXTPROC)tlsGetFunction(1714);
    UNUSED_PARAM(clazz)
    glFramebufferRenderbufferEXT(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_nglGetFramebufferAttachmentParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
    glGetFramebufferAttachmentParameterivEXTPROC glGetFramebufferAttachmentParameterivEXT = (glGetFramebufferAttachmentParameterivEXTPROC)tlsGetFunction(1715);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferAttachmentParameterivEXT(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTFramebufferObject_glGenerateMipmapEXT(JNIEnv *__env, jclass clazz, jint target) {
    glGenerateMipmapEXTPROC glGenerateMipmapEXT = (glGenerateMipmapEXTPROC)tlsGetFunction(1716);
    UNUSED_PARAM(clazz)
    glGenerateMipmapEXT(target);
}

EXTERN_C_EXIT
