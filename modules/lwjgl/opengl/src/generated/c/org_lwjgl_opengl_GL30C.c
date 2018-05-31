/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef intptr_t (APIENTRY *glGetStringiPROC) (jint, jint);
typedef void (APIENTRY *glClearBufferivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glClearBufferuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glClearBufferfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glClearBufferfiPROC) (jint, jint, jfloat, jint);
typedef void (APIENTRY *glVertexAttribI1iPROC) (jint, jint);
typedef void (APIENTRY *glVertexAttribI2iPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI3iPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI4iPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI1uiPROC) (jint, jint);
typedef void (APIENTRY *glVertexAttribI2uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI3uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI4uiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexAttribI1ivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI2ivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI3ivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4ivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI1uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI2uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI3uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4bvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4svPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4ubvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribI4usvPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribIPointerPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexAttribIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform1uiPROC) (jint, jint);
typedef void (APIENTRY *glUniform2uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glUniform3uiPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glUniform4uiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glUniform1uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform2uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform3uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glUniform4uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetUniformuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glBindFragDataLocationPROC) (jint, jint, intptr_t);
typedef jint (APIENTRY *glGetFragDataLocationPROC) (jint, intptr_t);
typedef void (APIENTRY *glBeginConditionalRenderPROC) (jint, jint);
typedef void (APIENTRY *glEndConditionalRenderPROC) (void);
typedef intptr_t (APIENTRY *glMapBufferRangePROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glFlushMappedBufferRangePROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glClampColorPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsRenderbufferPROC) (jint);
typedef void (APIENTRY *glBindRenderbufferPROC) (jint, jint);
typedef void (APIENTRY *glDeleteRenderbuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenRenderbuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glRenderbufferStoragePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glRenderbufferStorageMultisamplePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetRenderbufferParameterivPROC) (jint, jint, intptr_t);
typedef jboolean (APIENTRY *glIsFramebufferPROC) (jint);
typedef void (APIENTRY *glBindFramebufferPROC) (jint, jint);
typedef void (APIENTRY *glDeleteFramebuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenFramebuffersPROC) (jint, intptr_t);
typedef jint (APIENTRY *glCheckFramebufferStatusPROC) (jint);
typedef void (APIENTRY *glFramebufferTexture1DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTexture3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferTextureLayerPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glFramebufferRenderbufferPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetFramebufferAttachmentParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glBlitFramebufferPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGenerateMipmapPROC) (jint);
typedef void (APIENTRY *glTexParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTexParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTexParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glColorMaskiPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef void (APIENTRY *glGetBooleani_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetIntegeri_vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glEnableiPROC) (jint, jint);
typedef void (APIENTRY *glDisableiPROC) (jint, jint);
typedef jboolean (APIENTRY *glIsEnablediPROC) (jint, jint);
typedef void (APIENTRY *glBindBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glBindBufferBasePROC) (jint, jint, jint);
typedef void (APIENTRY *glBeginTransformFeedbackPROC) (jint);
typedef void (APIENTRY *glEndTransformFeedbackPROC) (void);
typedef void (APIENTRY *glTransformFeedbackVaryingsPROC) (jint, jint, intptr_t, jint);
typedef void (APIENTRY *glGetTransformFeedbackVaryingPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glBindVertexArrayPROC) (jint);
typedef void (APIENTRY *glDeleteVertexArraysPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenVertexArraysPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsVertexArrayPROC) (jint);

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL30C_nglGetStringi(JNIEnv *__env, jclass clazz, jint name, jint index) {
    glGetStringiPROC glGetStringi = (glGetStringiPROC)tlsGetFunction(551);
    UNUSED_PARAM(clazz)
    return (jlong)glGetStringi(name, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglClearBufferiv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearBufferivPROC glClearBufferiv = (glClearBufferivPROC)tlsGetFunction(552);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearBufferiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglClearBufferuiv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearBufferuivPROC glClearBufferuiv = (glClearBufferuivPROC)tlsGetFunction(553);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearBufferuiv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglClearBufferfv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearBufferfvPROC glClearBufferfv = (glClearBufferfvPROC)tlsGetFunction(554);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearBufferfv(buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glClearBufferfi(JNIEnv *__env, jclass clazz, jint buffer, jint drawbuffer, jfloat depth, jint stencil) {
    glClearBufferfiPROC glClearBufferfi = (glClearBufferfiPROC)tlsGetFunction(555);
    UNUSED_PARAM(clazz)
    glClearBufferfi(buffer, drawbuffer, depth, stencil);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI1i(JNIEnv *__env, jclass clazz, jint index, jint x) {
    glVertexAttribI1iPROC glVertexAttribI1i = (glVertexAttribI1iPROC)tlsGetFunction(556);
    UNUSED_PARAM(clazz)
    glVertexAttribI1i(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI2i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y) {
    glVertexAttribI2iPROC glVertexAttribI2i = (glVertexAttribI2iPROC)tlsGetFunction(557);
    UNUSED_PARAM(clazz)
    glVertexAttribI2i(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI3i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z) {
    glVertexAttribI3iPROC glVertexAttribI3i = (glVertexAttribI3iPROC)tlsGetFunction(558);
    UNUSED_PARAM(clazz)
    glVertexAttribI3i(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI4i(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {
    glVertexAttribI4iPROC glVertexAttribI4i = (glVertexAttribI4iPROC)tlsGetFunction(559);
    UNUSED_PARAM(clazz)
    glVertexAttribI4i(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI1ui(JNIEnv *__env, jclass clazz, jint index, jint x) {
    glVertexAttribI1uiPROC glVertexAttribI1ui = (glVertexAttribI1uiPROC)tlsGetFunction(560);
    UNUSED_PARAM(clazz)
    glVertexAttribI1ui(index, x);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI2ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y) {
    glVertexAttribI2uiPROC glVertexAttribI2ui = (glVertexAttribI2uiPROC)tlsGetFunction(561);
    UNUSED_PARAM(clazz)
    glVertexAttribI2ui(index, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI3ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z) {
    glVertexAttribI3uiPROC glVertexAttribI3ui = (glVertexAttribI3uiPROC)tlsGetFunction(562);
    UNUSED_PARAM(clazz)
    glVertexAttribI3ui(index, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glVertexAttribI4ui(JNIEnv *__env, jclass clazz, jint index, jint x, jint y, jint z, jint w) {
    glVertexAttribI4uiPROC glVertexAttribI4ui = (glVertexAttribI4uiPROC)tlsGetFunction(563);
    UNUSED_PARAM(clazz)
    glVertexAttribI4ui(index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI1iv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI1ivPROC glVertexAttribI1iv = (glVertexAttribI1ivPROC)tlsGetFunction(564);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI1iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI2iv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI2ivPROC glVertexAttribI2iv = (glVertexAttribI2ivPROC)tlsGetFunction(565);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI2iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI3iv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI3ivPROC glVertexAttribI3iv = (glVertexAttribI3ivPROC)tlsGetFunction(566);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI3iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI4iv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI4ivPROC glVertexAttribI4iv = (glVertexAttribI4ivPROC)tlsGetFunction(567);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI4iv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI1uiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI1uivPROC glVertexAttribI1uiv = (glVertexAttribI1uivPROC)tlsGetFunction(568);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI1uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI2uiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI2uivPROC glVertexAttribI2uiv = (glVertexAttribI2uivPROC)tlsGetFunction(569);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI2uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI3uiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI3uivPROC glVertexAttribI3uiv = (glVertexAttribI3uivPROC)tlsGetFunction(570);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI3uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI4uiv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI4uivPROC glVertexAttribI4uiv = (glVertexAttribI4uivPROC)tlsGetFunction(571);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI4uiv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI4bv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI4bvPROC glVertexAttribI4bv = (glVertexAttribI4bvPROC)tlsGetFunction(572);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI4bv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI4sv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI4svPROC glVertexAttribI4sv = (glVertexAttribI4svPROC)tlsGetFunction(573);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI4sv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI4ubv(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI4ubvPROC glVertexAttribI4ubv = (glVertexAttribI4ubvPROC)tlsGetFunction(574);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI4ubv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribI4usv__IJ(JNIEnv *__env, jclass clazz, jint index, jlong vAddress) {
    glVertexAttribI4usvPROC glVertexAttribI4usv = (glVertexAttribI4usvPROC)tlsGetFunction(575);
    intptr_t v = (intptr_t)vAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribI4usv(index, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglVertexAttribIPointer(JNIEnv *__env, jclass clazz, jint index, jint size, jint type, jint stride, jlong pointerAddress) {
    glVertexAttribIPointerPROC glVertexAttribIPointer = (glVertexAttribIPointerPROC)tlsGetFunction(576);
    intptr_t pointer = (intptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribIPointer(index, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetVertexAttribIiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribIivPROC glGetVertexAttribIiv = (glGetVertexAttribIivPROC)tlsGetFunction(577);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribIiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetVertexAttribIuiv__IIJ(JNIEnv *__env, jclass clazz, jint index, jint pname, jlong paramsAddress) {
    glGetVertexAttribIuivPROC glGetVertexAttribIuiv = (glGetVertexAttribIuivPROC)tlsGetFunction(578);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetVertexAttribIuiv(index, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glUniform1ui(JNIEnv *__env, jclass clazz, jint location, jint v0) {
    glUniform1uiPROC glUniform1ui = (glUniform1uiPROC)tlsGetFunction(579);
    UNUSED_PARAM(clazz)
    glUniform1ui(location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glUniform2ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1) {
    glUniform2uiPROC glUniform2ui = (glUniform2uiPROC)tlsGetFunction(580);
    UNUSED_PARAM(clazz)
    glUniform2ui(location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glUniform3ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2) {
    glUniform3uiPROC glUniform3ui = (glUniform3uiPROC)tlsGetFunction(581);
    UNUSED_PARAM(clazz)
    glUniform3ui(location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glUniform4ui(JNIEnv *__env, jclass clazz, jint location, jint v0, jint v1, jint v2, jint v3) {
    glUniform4uiPROC glUniform4ui = (glUniform4uiPROC)tlsGetFunction(582);
    UNUSED_PARAM(clazz)
    glUniform4ui(location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglUniform1uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform1uivPROC glUniform1uiv = (glUniform1uivPROC)tlsGetFunction(583);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform1uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglUniform2uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform2uivPROC glUniform2uiv = (glUniform2uivPROC)tlsGetFunction(584);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform2uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglUniform3uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform3uivPROC glUniform3uiv = (glUniform3uivPROC)tlsGetFunction(585);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform3uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglUniform4uiv__IIJ(JNIEnv *__env, jclass clazz, jint location, jint count, jlong valueAddress) {
    glUniform4uivPROC glUniform4uiv = (glUniform4uivPROC)tlsGetFunction(586);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glUniform4uiv(location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetUniformuiv__IIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jlong paramsAddress) {
    glGetUniformuivPROC glGetUniformuiv = (glGetUniformuivPROC)tlsGetFunction(587);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetUniformuiv(program, location, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglBindFragDataLocation(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jlong nameAddress) {
    glBindFragDataLocationPROC glBindFragDataLocation = (glBindFragDataLocationPROC)tlsGetFunction(588);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindFragDataLocation(program, colorNumber, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL30C_nglGetFragDataLocation(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetFragDataLocationPROC glGetFragDataLocation = (glGetFragDataLocationPROC)tlsGetFunction(589);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetFragDataLocation(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBeginConditionalRender(JNIEnv *__env, jclass clazz, jint id, jint mode) {
    glBeginConditionalRenderPROC glBeginConditionalRender = (glBeginConditionalRenderPROC)tlsGetFunction(590);
    UNUSED_PARAM(clazz)
    glBeginConditionalRender(id, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glEndConditionalRender(JNIEnv *__env, jclass clazz) {
    glEndConditionalRenderPROC glEndConditionalRender = (glEndConditionalRenderPROC)tlsGetFunction(591);
    UNUSED_PARAM(clazz)
    glEndConditionalRender();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL30C_nglMapBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length, jint access) {
    glMapBufferRangePROC glMapBufferRange = (glMapBufferRangePROC)tlsGetFunction(592);
    UNUSED_PARAM(clazz)
    return (jlong)glMapBufferRange(target, (intptr_t)offset, (intptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glFlushMappedBufferRange(JNIEnv *__env, jclass clazz, jint target, jlong offset, jlong length) {
    glFlushMappedBufferRangePROC glFlushMappedBufferRange = (glFlushMappedBufferRangePROC)tlsGetFunction(593);
    UNUSED_PARAM(clazz)
    glFlushMappedBufferRange(target, (intptr_t)offset, (intptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glClampColor(JNIEnv *__env, jclass clazz, jint target, jint clamp) {
    glClampColorPROC glClampColor = (glClampColorPROC)tlsGetFunction(594);
    UNUSED_PARAM(clazz)
    glClampColor(target, clamp);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30C_glIsRenderbuffer(JNIEnv *__env, jclass clazz, jint renderbuffer) {
    glIsRenderbufferPROC glIsRenderbuffer = (glIsRenderbufferPROC)tlsGetFunction(595);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsRenderbuffer(renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBindRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint renderbuffer) {
    glBindRenderbufferPROC glBindRenderbuffer = (glBindRenderbufferPROC)tlsGetFunction(596);
    UNUSED_PARAM(clazz)
    glBindRenderbuffer(target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglDeleteRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glDeleteRenderbuffersPROC glDeleteRenderbuffers = (glDeleteRenderbuffersPROC)tlsGetFunction(597);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGenRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glGenRenderbuffersPROC glGenRenderbuffers = (glGenRenderbuffersPROC)tlsGetFunction(598);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glGenRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glRenderbufferStorage(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint width, jint height) {
    glRenderbufferStoragePROC glRenderbufferStorage = (glRenderbufferStoragePROC)tlsGetFunction(599);
    UNUSED_PARAM(clazz)
    glRenderbufferStorage(target, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height) {
    glRenderbufferStorageMultisamplePROC glRenderbufferStorageMultisample = (glRenderbufferStorageMultisamplePROC)tlsGetFunction(600);
    UNUSED_PARAM(clazz)
    glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetRenderbufferParameterivPROC glGetRenderbufferParameteriv = (glGetRenderbufferParameterivPROC)tlsGetFunction(601);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetRenderbufferParameteriv(target, pname, params);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30C_glIsFramebuffer(JNIEnv *__env, jclass clazz, jint framebuffer) {
    glIsFramebufferPROC glIsFramebuffer = (glIsFramebufferPROC)tlsGetFunction(602);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsFramebuffer(framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBindFramebuffer(JNIEnv *__env, jclass clazz, jint target, jint framebuffer) {
    glBindFramebufferPROC glBindFramebuffer = (glBindFramebufferPROC)tlsGetFunction(603);
    UNUSED_PARAM(clazz)
    glBindFramebuffer(target, framebuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglDeleteFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glDeleteFramebuffersPROC glDeleteFramebuffers = (glDeleteFramebuffersPROC)tlsGetFunction(604);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glDeleteFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGenFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glGenFramebuffersPROC glGenFramebuffers = (glGenFramebuffersPROC)tlsGetFunction(605);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glGenFramebuffers(n, framebuffers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL30C_glCheckFramebufferStatus(JNIEnv *__env, jclass clazz, jint target) {
    glCheckFramebufferStatusPROC glCheckFramebufferStatus = (glCheckFramebufferStatusPROC)tlsGetFunction(606);
    UNUSED_PARAM(clazz)
    return (jint)glCheckFramebufferStatus(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glFramebufferTexture1D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture1DPROC glFramebufferTexture1D = (glFramebufferTexture1DPROC)tlsGetFunction(607);
    UNUSED_PARAM(clazz)
    glFramebufferTexture1D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glFramebufferTexture2D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level) {
    glFramebufferTexture2DPROC glFramebufferTexture2D = (glFramebufferTexture2DPROC)tlsGetFunction(608);
    UNUSED_PARAM(clazz)
    glFramebufferTexture2D(target, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glFramebufferTexture3D(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint textarget, jint texture, jint level, jint layer) {
    glFramebufferTexture3DPROC glFramebufferTexture3D = (glFramebufferTexture3DPROC)tlsGetFunction(609);
    UNUSED_PARAM(clazz)
    glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level, jint layer) {
    glFramebufferTextureLayerPROC glFramebufferTextureLayer = (glFramebufferTextureLayerPROC)tlsGetFunction(610);
    UNUSED_PARAM(clazz)
    glFramebufferTextureLayer(target, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glFramebufferRenderbufferPROC glFramebufferRenderbuffer = (glFramebufferRenderbufferPROC)tlsGetFunction(611);
    UNUSED_PARAM(clazz)
    glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint pname, jlong paramsAddress) {
    glGetFramebufferAttachmentParameterivPROC glGetFramebufferAttachmentParameteriv = (glGetFramebufferAttachmentParameterivPROC)tlsGetFunction(612);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBlitFramebuffer(JNIEnv *__env, jclass clazz, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitFramebufferPROC glBlitFramebuffer = (glBlitFramebufferPROC)tlsGetFunction(613);
    UNUSED_PARAM(clazz)
    glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glGenerateMipmap(JNIEnv *__env, jclass clazz, jint target) {
    glGenerateMipmapPROC glGenerateMipmap = (glGenerateMipmapPROC)tlsGetFunction(614);
    UNUSED_PARAM(clazz)
    glGenerateMipmap(target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIivPROC glTexParameterIiv = (glTexParameterIivPROC)tlsGetFunction(615);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIuivPROC glTexParameterIuiv = (glTexParameterIuivPROC)tlsGetFunction(616);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIivPROC glGetTexParameterIiv = (glGetTexParameterIivPROC)tlsGetFunction(617);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIuivPROC glGetTexParameterIuiv = (glGetTexParameterIuivPROC)tlsGetFunction(618);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glColorMaski(JNIEnv *__env, jclass clazz, jint buf, jboolean r, jboolean g, jboolean b, jboolean a) {
    glColorMaskiPROC glColorMaski = (glColorMaskiPROC)tlsGetFunction(619);
    UNUSED_PARAM(clazz)
    glColorMaski(buf, r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetBooleani_1v(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetBooleani_vPROC glGetBooleani_v = (glGetBooleani_vPROC)tlsGetFunction(620);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetBooleani_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetIntegeri_1v__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong dataAddress) {
    glGetIntegeri_vPROC glGetIntegeri_v = (glGetIntegeri_vPROC)tlsGetFunction(621);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetIntegeri_v(target, index, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glEnablei(JNIEnv *__env, jclass clazz, jint cap, jint index) {
    glEnableiPROC glEnablei = (glEnableiPROC)tlsGetFunction(622);
    UNUSED_PARAM(clazz)
    glEnablei(cap, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glDisablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiPROC glDisablei = (glDisableiPROC)tlsGetFunction(623);
    UNUSED_PARAM(clazz)
    glDisablei(target, index);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30C_glIsEnabledi(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediPROC glIsEnabledi = (glIsEnablediPROC)tlsGetFunction(624);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabledi(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBindBufferRange(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer, jlong offset, jlong size) {
    glBindBufferRangePROC glBindBufferRange = (glBindBufferRangePROC)tlsGetFunction(625);
    UNUSED_PARAM(clazz)
    glBindBufferRange(target, index, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBindBufferBase(JNIEnv *__env, jclass clazz, jint target, jint index, jint buffer) {
    glBindBufferBasePROC glBindBufferBase = (glBindBufferBasePROC)tlsGetFunction(626);
    UNUSED_PARAM(clazz)
    glBindBufferBase(target, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBeginTransformFeedback(JNIEnv *__env, jclass clazz, jint primitiveMode) {
    glBeginTransformFeedbackPROC glBeginTransformFeedback = (glBeginTransformFeedbackPROC)tlsGetFunction(627);
    UNUSED_PARAM(clazz)
    glBeginTransformFeedback(primitiveMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glEndTransformFeedback(JNIEnv *__env, jclass clazz) {
    glEndTransformFeedbackPROC glEndTransformFeedback = (glEndTransformFeedbackPROC)tlsGetFunction(628);
    UNUSED_PARAM(clazz)
    glEndTransformFeedback();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglTransformFeedbackVaryings(JNIEnv *__env, jclass clazz, jint program, jint count, jlong varyingsAddress, jint bufferMode) {
    glTransformFeedbackVaryingsPROC glTransformFeedbackVaryings = (glTransformFeedbackVaryingsPROC)tlsGetFunction(629);
    intptr_t varyings = (intptr_t)varyingsAddress;
    UNUSED_PARAM(clazz)
    glTransformFeedbackVaryings(program, count, varyings, bufferMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGetTransformFeedbackVarying__IIIJJJJ(JNIEnv *__env, jclass clazz, jint program, jint index, jint bufSize, jlong lengthAddress, jlong sizeAddress, jlong typeAddress, jlong nameAddress) {
    glGetTransformFeedbackVaryingPROC glGetTransformFeedbackVarying = (glGetTransformFeedbackVaryingPROC)tlsGetFunction(630);
    intptr_t length = (intptr_t)lengthAddress;
    intptr_t size = (intptr_t)sizeAddress;
    intptr_t type = (intptr_t)typeAddress;
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_glBindVertexArray(JNIEnv *__env, jclass clazz, jint array) {
    glBindVertexArrayPROC glBindVertexArray = (glBindVertexArrayPROC)tlsGetFunction(631);
    UNUSED_PARAM(clazz)
    glBindVertexArray(array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglDeleteVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glDeleteVertexArraysPROC glDeleteVertexArrays = (glDeleteVertexArraysPROC)tlsGetFunction(632);
    intptr_t arrays = (intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glDeleteVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL30C_nglGenVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glGenVertexArraysPROC glGenVertexArrays = (glGenVertexArraysPROC)tlsGetFunction(633);
    intptr_t arrays = (intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glGenVertexArrays(n, arrays);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL30C_glIsVertexArray(JNIEnv *__env, jclass clazz, jint array) {
    glIsVertexArrayPROC glIsVertexArray = (glIsVertexArrayPROC)tlsGetFunction(634);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsVertexArray(array);
}

EXTERN_C_EXIT
