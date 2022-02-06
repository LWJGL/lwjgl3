/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glEnablePROC) (jint);
typedef void (APIENTRY *glDisablePROC) (jint);
typedef void (APIENTRY *glBindTexturePROC) (jint, jint);
typedef void (APIENTRY *glBlendFuncPROC) (jint, jint);
typedef void (APIENTRY *glClearPROC) (jint);
typedef void (APIENTRY *glClearColorPROC) (jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glClearDepthPROC) (jdouble);
typedef void (APIENTRY *glClearStencilPROC) (jint);
typedef void (APIENTRY *glColorMaskPROC) (jboolean, jboolean, jboolean, jboolean);
typedef void (APIENTRY *glCullFacePROC) (jint);
typedef void (APIENTRY *glDepthFuncPROC) (jint);
typedef void (APIENTRY *glDepthMaskPROC) (jboolean);
typedef void (APIENTRY *glDepthRangePROC) (jdouble, jdouble);
typedef void (APIENTRY *glDrawArraysPROC) (jint, jint, jint);
typedef void (APIENTRY *glDrawBufferPROC) (jint);
typedef void (APIENTRY *glDrawElementsPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glFinishPROC) (void);
typedef void (APIENTRY *glFlushPROC) (void);
typedef void (APIENTRY *glFrontFacePROC) (jint);
typedef void (APIENTRY *glGenTexturesPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDeleteTexturesPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetBooleanvPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetFloatvPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetIntegervPROC) (jint, uintptr_t);
typedef void (APIENTRY *glGetDoublevPROC) (jint, uintptr_t);
typedef jint (APIENTRY *glGetErrorPROC) (void);
typedef void (APIENTRY *glGetPointervPROC) (jint, uintptr_t);
typedef uintptr_t (APIENTRY *glGetStringPROC) (jint);
typedef void (APIENTRY *glGetTexImagePROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexLevelParameterivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexLevelParameterfvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glHintPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsEnabledPROC) (jint);
typedef jboolean (APIENTRY *glIsTexturePROC) (jint);
typedef void (APIENTRY *glLineWidthPROC) (jfloat);
typedef void (APIENTRY *glLogicOpPROC) (jint);
typedef void (APIENTRY *glPixelStoreiPROC) (jint, jint);
typedef void (APIENTRY *glPixelStorefPROC) (jint, jfloat);
typedef void (APIENTRY *glPointSizePROC) (jfloat);
typedef void (APIENTRY *glPolygonModePROC) (jint, jint);
typedef void (APIENTRY *glPolygonOffsetPROC) (jfloat, jfloat);
typedef void (APIENTRY *glReadBufferPROC) (jint);
typedef void (APIENTRY *glReadPixelsPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glScissorPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glStencilFuncPROC) (jint, jint, jint);
typedef void (APIENTRY *glStencilMaskPROC) (jint);
typedef void (APIENTRY *glStencilOpPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexImage1DPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyTexImage1DPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexSubImage1DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTexParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTexParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexSubImage1DPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTexSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glViewportPROC) (jint, jint, jint, jint);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glEnable(JNIEnv *__env, jclass clazz, jint target) {
    glEnablePROC glEnable = (glEnablePROC)tlsGetFunction(0);
    UNUSED_PARAM(clazz)
    glEnable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glDisable(JNIEnv *__env, jclass clazz, jint target) {
    glDisablePROC glDisable = (glDisablePROC)tlsGetFunction(1);
    UNUSED_PARAM(clazz)
    glDisable(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glBindTexture(JNIEnv *__env, jclass clazz, jint target, jint texture) {
    glBindTexturePROC glBindTexture = (glBindTexturePROC)tlsGetFunction(7);
    UNUSED_PARAM(clazz)
    glBindTexture(target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glBlendFunc(JNIEnv *__env, jclass clazz, jint sfactor, jint dfactor) {
    glBlendFuncPROC glBlendFunc = (glBlendFuncPROC)tlsGetFunction(9);
    UNUSED_PARAM(clazz)
    glBlendFunc(sfactor, dfactor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glClear(JNIEnv *__env, jclass clazz, jint mask) {
    glClearPROC glClear = (glClearPROC)tlsGetFunction(12);
    UNUSED_PARAM(clazz)
    glClear(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glClearColor(JNIEnv *__env, jclass clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    glClearColorPROC glClearColor = (glClearColorPROC)tlsGetFunction(14);
    UNUSED_PARAM(clazz)
    glClearColor(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glClearDepth(JNIEnv *__env, jclass clazz, jdouble depth) {
    glClearDepthPROC glClearDepth = (glClearDepthPROC)tlsGetFunction(15);
    UNUSED_PARAM(clazz)
    glClearDepth(depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glClearStencil(JNIEnv *__env, jclass clazz, jint s) {
    glClearStencilPROC glClearStencil = (glClearStencilPROC)tlsGetFunction(17);
    UNUSED_PARAM(clazz)
    glClearStencil(s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glColorMask(JNIEnv *__env, jclass clazz, jboolean red, jboolean green, jboolean blue, jboolean alpha) {
    glColorMaskPROC glColorMask = (glColorMaskPROC)tlsGetFunction(51);
    UNUSED_PARAM(clazz)
    glColorMask(red, green, blue, alpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glCullFace(JNIEnv *__env, jclass clazz, jint mode) {
    glCullFacePROC glCullFace = (glCullFacePROC)tlsGetFunction(55);
    UNUSED_PARAM(clazz)
    glCullFace(mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glDepthFunc(JNIEnv *__env, jclass clazz, jint func) {
    glDepthFuncPROC glDepthFunc = (glDepthFuncPROC)tlsGetFunction(57);
    UNUSED_PARAM(clazz)
    glDepthFunc(func);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glDepthMask(JNIEnv *__env, jclass clazz, jboolean flag) {
    glDepthMaskPROC glDepthMask = (glDepthMaskPROC)tlsGetFunction(58);
    UNUSED_PARAM(clazz)
    glDepthMask(flag);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glDepthRange(JNIEnv *__env, jclass clazz, jdouble zNear, jdouble zFar) {
    glDepthRangePROC glDepthRange = (glDepthRangePROC)tlsGetFunction(59);
    UNUSED_PARAM(clazz)
    glDepthRange(zNear, zFar);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glDrawArrays(JNIEnv *__env, jclass clazz, jint mode, jint first, jint count) {
    glDrawArraysPROC glDrawArrays = (glDrawArraysPROC)tlsGetFunction(61);
    UNUSED_PARAM(clazz)
    glDrawArrays(mode, first, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glDrawBuffer(JNIEnv *__env, jclass clazz, jint buf) {
    glDrawBufferPROC glDrawBuffer = (glDrawBufferPROC)tlsGetFunction(62);
    UNUSED_PARAM(clazz)
    glDrawBuffer(buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglDrawElements(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress) {
    glDrawElementsPROC glDrawElements = (glDrawElementsPROC)tlsGetFunction(63);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElements(mode, count, type, indices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glFinish(JNIEnv *__env, jclass clazz) {
    glFinishPROC glFinish = (glFinishPROC)tlsGetFunction(83);
    UNUSED_PARAM(clazz)
    glFinish();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glFlush(JNIEnv *__env, jclass clazz) {
    glFlushPROC glFlush = (glFlushPROC)tlsGetFunction(84);
    UNUSED_PARAM(clazz)
    glFlush();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glFrontFace(JNIEnv *__env, jclass clazz, jint dir) {
    glFrontFacePROC glFrontFace = (glFrontFacePROC)tlsGetFunction(89);
    UNUSED_PARAM(clazz)
    glFrontFace(dir);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGenTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
    glGenTexturesPROC glGenTextures = (glGenTexturesPROC)tlsGetFunction(91);
    uintptr_t textures = (uintptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glGenTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglDeleteTextures__IJ(JNIEnv *__env, jclass clazz, jint n, jlong texturesAddress) {
    glDeleteTexturesPROC glDeleteTextures = (glDeleteTexturesPROC)tlsGetFunction(92);
    uintptr_t textures = (uintptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glDeleteTextures(n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetBooleanv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetBooleanvPROC glGetBooleanv = (glGetBooleanvPROC)tlsGetFunction(94);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetBooleanv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetFloatv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetFloatvPROC glGetFloatv = (glGetFloatvPROC)tlsGetFunction(95);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFloatv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetIntegerv__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetIntegervPROC glGetIntegerv = (glGetIntegervPROC)tlsGetFunction(96);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetIntegerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetDoublev__IJ(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetDoublevPROC glGetDoublev = (glGetDoublevPROC)tlsGetFunction(97);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetDoublev(pname, params);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL11C_glGetError(JNIEnv *__env, jclass clazz) {
    glGetErrorPROC glGetError = (glGetErrorPROC)tlsGetFunction(98);
    UNUSED_PARAM(clazz)
    return (jint)glGetError();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetPointerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetPointervPROC glGetPointerv = (glGetPointervPROC)tlsGetFunction(109);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointerv(pname, params);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL11C_nglGetString(JNIEnv *__env, jclass clazz, jint name) {
    glGetStringPROC glGetString = (glGetStringPROC)tlsGetFunction(111);
    UNUSED_PARAM(clazz)
    return (jlong)glGetString(name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetTexImage__IIIIJ(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jlong pixelsAddress) {
    glGetTexImagePROC glGetTexImage = (glGetTexImagePROC)tlsGetFunction(117);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTexImage(tex, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetTexLevelParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTexLevelParameterivPROC glGetTexLevelParameteriv = (glGetTexLevelParameterivPROC)tlsGetFunction(118);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexLevelParameteriv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetTexLevelParameterfv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTexLevelParameterfvPROC glGetTexLevelParameterfv = (glGetTexLevelParameterfvPROC)tlsGetFunction(119);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexLevelParameterfv(target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterivPROC glGetTexParameteriv = (glGetTexParameterivPROC)tlsGetFunction(120);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglGetTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterfvPROC glGetTexParameterfv = (glGetTexParameterfvPROC)tlsGetFunction(121);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glHint(JNIEnv *__env, jclass clazz, jint target, jint hint) {
    glHintPROC glHint = (glHintPROC)tlsGetFunction(122);
    UNUSED_PARAM(clazz)
    glHint(target, hint);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11C_glIsEnabled(JNIEnv *__env, jclass clazz, jint cap) {
    glIsEnabledPROC glIsEnabled = (glIsEnabledPROC)tlsGetFunction(137);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabled(cap);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL11C_glIsTexture(JNIEnv *__env, jclass clazz, jint texture) {
    glIsTexturePROC glIsTexture = (glIsTexturePROC)tlsGetFunction(139);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsTexture(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glLineWidth(JNIEnv *__env, jclass clazz, jfloat width) {
    glLineWidthPROC glLineWidth = (glLineWidthPROC)tlsGetFunction(149);
    UNUSED_PARAM(clazz)
    glLineWidth(width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glLogicOp(JNIEnv *__env, jclass clazz, jint op) {
    glLogicOpPROC glLogicOp = (glLogicOpPROC)tlsGetFunction(155);
    UNUSED_PARAM(clazz)
    glLogicOp(op);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glPixelStorei(JNIEnv *__env, jclass clazz, jint pname, jint param) {
    glPixelStoreiPROC glPixelStorei = (glPixelStoreiPROC)tlsGetFunction(190);
    UNUSED_PARAM(clazz)
    glPixelStorei(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glPixelStoref(JNIEnv *__env, jclass clazz, jint pname, jfloat param) {
    glPixelStorefPROC glPixelStoref = (glPixelStorefPROC)tlsGetFunction(191);
    UNUSED_PARAM(clazz)
    glPixelStoref(pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glPointSize(JNIEnv *__env, jclass clazz, jfloat size) {
    glPointSizePROC glPointSize = (glPointSizePROC)tlsGetFunction(195);
    UNUSED_PARAM(clazz)
    glPointSize(size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glPolygonMode(JNIEnv *__env, jclass clazz, jint face, jint mode) {
    glPolygonModePROC glPolygonMode = (glPolygonModePROC)tlsGetFunction(196);
    UNUSED_PARAM(clazz)
    glPolygonMode(face, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glPolygonOffset(JNIEnv *__env, jclass clazz, jfloat factor, jfloat units) {
    glPolygonOffsetPROC glPolygonOffset = (glPolygonOffsetPROC)tlsGetFunction(197);
    UNUSED_PARAM(clazz)
    glPolygonOffset(factor, units);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glReadBuffer(JNIEnv *__env, jclass clazz, jint src) {
    glReadBufferPROC glReadBuffer = (glReadBufferPROC)tlsGetFunction(232);
    UNUSED_PARAM(clazz)
    glReadBuffer(src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglReadPixels__IIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glReadPixelsPROC glReadPixels = (glReadPixelsPROC)tlsGetFunction(233);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadPixels(x, y, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glScissor(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height) {
    glScissorPROC glScissor = (glScissorPROC)tlsGetFunction(247);
    UNUSED_PARAM(clazz)
    glScissor(x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glStencilFunc(JNIEnv *__env, jclass clazz, jint func, jint ref, jint mask) {
    glStencilFuncPROC glStencilFunc = (glStencilFuncPROC)tlsGetFunction(250);
    UNUSED_PARAM(clazz)
    glStencilFunc(func, ref, mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glStencilMask(JNIEnv *__env, jclass clazz, jint mask) {
    glStencilMaskPROC glStencilMask = (glStencilMaskPROC)tlsGetFunction(251);
    UNUSED_PARAM(clazz)
    glStencilMask(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glStencilOp(JNIEnv *__env, jclass clazz, jint sfail, jint dpfail, jint dppass) {
    glStencilOpPROC glStencilOp = (glStencilOpPROC)tlsGetFunction(252);
    UNUSED_PARAM(clazz)
    glStencilOp(sfail, dpfail, dppass);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglTexImage1D__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage1DPROC glTexImage1D = (glTexImage1DPROC)tlsGetFunction(296);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglTexImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glTexImage2DPROC glTexImage2D = (glTexImage2DPROC)tlsGetFunction(297);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glCopyTexImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint border) {
    glCopyTexImage1DPROC glCopyTexImage1D = (glCopyTexImage1DPROC)tlsGetFunction(298);
    UNUSED_PARAM(clazz)
    glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glCopyTexImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint internalFormat, jint x, jint y, jint width, jint height, jint border) {
    glCopyTexImage2DPROC glCopyTexImage2D = (glCopyTexImage2DPROC)tlsGetFunction(299);
    UNUSED_PARAM(clazz)
    glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glCopyTexSubImage1D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyTexSubImage1DPROC glCopyTexSubImage1D = (glCopyTexSubImage1DPROC)tlsGetFunction(300);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage1D(target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glCopyTexSubImage2D(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTexSubImage2DPROC glCopyTexSubImage2D = (glCopyTexSubImage2DPROC)tlsGetFunction(301);
    UNUSED_PARAM(clazz)
    glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glTexParameteri(JNIEnv *__env, jclass clazz, jint target, jint pname, jint param) {
    glTexParameteriPROC glTexParameteri = (glTexParameteriPROC)tlsGetFunction(302);
    UNUSED_PARAM(clazz)
    glTexParameteri(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglTexParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterivPROC glTexParameteriv = (glTexParameterivPROC)tlsGetFunction(303);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameteriv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glTexParameterf(JNIEnv *__env, jclass clazz, jint target, jint pname, jfloat param) {
    glTexParameterfPROC glTexParameterf = (glTexParameterfPROC)tlsGetFunction(304);
    UNUSED_PARAM(clazz)
    glTexParameterf(target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglTexParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterfvPROC glTexParameterfv = (glTexParameterfvPROC)tlsGetFunction(305);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterfv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglTexSubImage1D__IIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage1DPROC glTexSubImage1D = (glTexSubImage1DPROC)tlsGetFunction(306);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_nglTexSubImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTexSubImage2DPROC glTexSubImage2D = (glTexSubImage2DPROC)tlsGetFunction(307);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL11C_glViewport(JNIEnv *__env, jclass clazz, jint x, jint y, jint w, jint h) {
    glViewportPROC glViewport = (glViewportPROC)tlsGetFunction(335);
    UNUSED_PARAM(clazz)
    glViewport(x, y, w, h);
}

EXTERN_C_EXIT
