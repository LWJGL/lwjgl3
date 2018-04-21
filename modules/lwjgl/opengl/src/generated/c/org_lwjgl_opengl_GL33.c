/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glBindFragDataLocationIndexedPROC) (jint, jint, jint, intptr_t);
typedef jint (APIENTRY *glGetFragDataIndexPROC) (jint, intptr_t);
typedef void (APIENTRY *glGenSamplersPROC) (jint, intptr_t);
typedef void (APIENTRY *glDeleteSamplersPROC) (jint, intptr_t);
typedef jboolean (APIENTRY *glIsSamplerPROC) (jint);
typedef void (APIENTRY *glBindSamplerPROC) (jint, jint);
typedef void (APIENTRY *glSamplerParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glSamplerParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glSamplerParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glSamplerParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetSamplerParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glQueryCounterPROC) (jint, jint);
typedef void (APIENTRY *glGetQueryObjecti64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryObjectui64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glVertexAttribDivisorPROC) (jint, jint);
typedef void (APIENTRY *glVertexP2uiPROC) (jint, jint);
typedef void (APIENTRY *glVertexP3uiPROC) (jint, jint);
typedef void (APIENTRY *glVertexP4uiPROC) (jint, jint);
typedef void (APIENTRY *glVertexP2uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexP3uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexP4uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glTexCoordP1uiPROC) (jint, jint);
typedef void (APIENTRY *glTexCoordP2uiPROC) (jint, jint);
typedef void (APIENTRY *glTexCoordP3uiPROC) (jint, jint);
typedef void (APIENTRY *glTexCoordP4uiPROC) (jint, jint);
typedef void (APIENTRY *glTexCoordP1uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glTexCoordP2uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glTexCoordP3uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glTexCoordP4uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glMultiTexCoordP1uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoordP2uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoordP3uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoordP4uiPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoordP1uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMultiTexCoordP2uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMultiTexCoordP3uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glMultiTexCoordP4uivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glNormalP3uiPROC) (jint, jint);
typedef void (APIENTRY *glNormalP3uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glColorP3uiPROC) (jint, jint);
typedef void (APIENTRY *glColorP4uiPROC) (jint, jint);
typedef void (APIENTRY *glColorP3uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glColorP4uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glSecondaryColorP3uiPROC) (jint, jint);
typedef void (APIENTRY *glSecondaryColorP3uivPROC) (jint, intptr_t);
typedef void (APIENTRY *glVertexAttribP1uiPROC) (jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribP2uiPROC) (jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribP3uiPROC) (jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribP4uiPROC) (jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexAttribP1uivPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glVertexAttribP2uivPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glVertexAttribP3uivPROC) (jint, jint, jboolean, intptr_t);
typedef void (APIENTRY *glVertexAttribP4uivPROC) (jint, jint, jboolean, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglBindFragDataLocationIndexed(JNIEnv *__env, jclass clazz, jint program, jint colorNumber, jint index, jlong nameAddress) {
    glBindFragDataLocationIndexedPROC glBindFragDataLocationIndexed = (glBindFragDataLocationIndexedPROC)tlsGetFunction(666);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    glBindFragDataLocationIndexed(program, colorNumber, index, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL33_nglGetFragDataIndex(JNIEnv *__env, jclass clazz, jint program, jlong nameAddress) {
    glGetFragDataIndexPROC glGetFragDataIndex = (glGetFragDataIndexPROC)tlsGetFunction(667);
    intptr_t name = (intptr_t)nameAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetFragDataIndex(program, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGenSamplers__IJ(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress) {
    glGenSamplersPROC glGenSamplers = (glGenSamplersPROC)tlsGetFunction(668);
    intptr_t samplers = (intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glGenSamplers(count, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglDeleteSamplers__IJ(JNIEnv *__env, jclass clazz, jint count, jlong samplersAddress) {
    glDeleteSamplersPROC glDeleteSamplers = (glDeleteSamplersPROC)tlsGetFunction(669);
    intptr_t samplers = (intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glDeleteSamplers(count, samplers);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL33_glIsSampler(JNIEnv *__env, jclass clazz, jint sampler) {
    glIsSamplerPROC glIsSampler = (glIsSamplerPROC)tlsGetFunction(670);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsSampler(sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glBindSampler(JNIEnv *__env, jclass clazz, jint unit, jint sampler) {
    glBindSamplerPROC glBindSampler = (glBindSamplerPROC)tlsGetFunction(671);
    UNUSED_PARAM(clazz)
    glBindSampler(unit, sampler);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glSamplerParameteri(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jint param) {
    glSamplerParameteriPROC glSamplerParameteri = (glSamplerParameteriPROC)tlsGetFunction(672);
    UNUSED_PARAM(clazz)
    glSamplerParameteri(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glSamplerParameterf(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jfloat param) {
    glSamplerParameterfPROC glSamplerParameterf = (glSamplerParameterfPROC)tlsGetFunction(673);
    UNUSED_PARAM(clazz)
    glSamplerParameterf(sampler, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterivPROC glSamplerParameteriv = (glSamplerParameterivPROC)tlsGetFunction(674);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterfvPROC glSamplerParameterfv = (glSamplerParameterfvPROC)tlsGetFunction(675);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)tlsGetFunction(676);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)tlsGetFunction(677);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterivPROC glGetSamplerParameteriv = (glGetSamplerParameterivPROC)tlsGetFunction(678);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameteriv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterfvPROC glGetSamplerParameterfv = (glGetSamplerParameterfvPROC)tlsGetFunction(679);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterfv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)tlsGetFunction(680);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)tlsGetFunction(681);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glQueryCounter(JNIEnv *__env, jclass clazz, jint id, jint target) {
    glQueryCounterPROC glQueryCounter = (glQueryCounterPROC)tlsGetFunction(682);
    UNUSED_PARAM(clazz)
    glQueryCounter(id, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetQueryObjecti64v__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjecti64vPROC glGetQueryObjecti64v = (glGetQueryObjecti64vPROC)tlsGetFunction(683);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjecti64v(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglGetQueryObjectui64v__IIJ(JNIEnv *__env, jclass clazz, jint id, jint pname, jlong paramsAddress) {
    glGetQueryObjectui64vPROC glGetQueryObjectui64v = (glGetQueryObjectui64vPROC)tlsGetFunction(684);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetQueryObjectui64v(id, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexAttribDivisor(JNIEnv *__env, jclass clazz, jint index, jint divisor) {
    glVertexAttribDivisorPROC glVertexAttribDivisor = (glVertexAttribDivisorPROC)tlsGetFunction(685);
    UNUSED_PARAM(clazz)
    glVertexAttribDivisor(index, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexP2ui(JNIEnv *__env, jclass clazz, jint type, jint value) {
    glVertexP2uiPROC glVertexP2ui = (glVertexP2uiPROC)tlsGetFunction(694);
    UNUSED_PARAM(clazz)
    glVertexP2ui(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexP3ui(JNIEnv *__env, jclass clazz, jint type, jint value) {
    glVertexP3uiPROC glVertexP3ui = (glVertexP3uiPROC)tlsGetFunction(695);
    UNUSED_PARAM(clazz)
    glVertexP3ui(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexP4ui(JNIEnv *__env, jclass clazz, jint type, jint value) {
    glVertexP4uiPROC glVertexP4ui = (glVertexP4uiPROC)tlsGetFunction(696);
    UNUSED_PARAM(clazz)
    glVertexP4ui(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP2uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong valueAddress) {
    glVertexP2uivPROC glVertexP2uiv = (glVertexP2uivPROC)tlsGetFunction(697);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexP2uiv(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP3uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong valueAddress) {
    glVertexP3uivPROC glVertexP3uiv = (glVertexP3uivPROC)tlsGetFunction(698);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexP3uiv(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexP4uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong valueAddress) {
    glVertexP4uivPROC glVertexP4uiv = (glVertexP4uivPROC)tlsGetFunction(699);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexP4uiv(type, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glTexCoordP1ui(JNIEnv *__env, jclass clazz, jint type, jint coords) {
    glTexCoordP1uiPROC glTexCoordP1ui = (glTexCoordP1uiPROC)tlsGetFunction(700);
    UNUSED_PARAM(clazz)
    glTexCoordP1ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glTexCoordP2ui(JNIEnv *__env, jclass clazz, jint type, jint coords) {
    glTexCoordP2uiPROC glTexCoordP2ui = (glTexCoordP2uiPROC)tlsGetFunction(701);
    UNUSED_PARAM(clazz)
    glTexCoordP2ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glTexCoordP3ui(JNIEnv *__env, jclass clazz, jint type, jint coords) {
    glTexCoordP3uiPROC glTexCoordP3ui = (glTexCoordP3uiPROC)tlsGetFunction(702);
    UNUSED_PARAM(clazz)
    glTexCoordP3ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glTexCoordP4ui(JNIEnv *__env, jclass clazz, jint type, jint coords) {
    glTexCoordP4uiPROC glTexCoordP4ui = (glTexCoordP4uiPROC)tlsGetFunction(703);
    UNUSED_PARAM(clazz)
    glTexCoordP4ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP1uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress) {
    glTexCoordP1uivPROC glTexCoordP1uiv = (glTexCoordP1uivPROC)tlsGetFunction(704);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glTexCoordP1uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP2uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress) {
    glTexCoordP2uivPROC glTexCoordP2uiv = (glTexCoordP2uivPROC)tlsGetFunction(705);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glTexCoordP2uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP3uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress) {
    glTexCoordP3uivPROC glTexCoordP3uiv = (glTexCoordP3uivPROC)tlsGetFunction(706);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glTexCoordP3uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglTexCoordP4uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress) {
    glTexCoordP4uivPROC glTexCoordP4uiv = (glTexCoordP4uivPROC)tlsGetFunction(707);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glTexCoordP4uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glMultiTexCoordP1ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords) {
    glMultiTexCoordP1uiPROC glMultiTexCoordP1ui = (glMultiTexCoordP1uiPROC)tlsGetFunction(708);
    UNUSED_PARAM(clazz)
    glMultiTexCoordP1ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glMultiTexCoordP2ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords) {
    glMultiTexCoordP2uiPROC glMultiTexCoordP2ui = (glMultiTexCoordP2uiPROC)tlsGetFunction(709);
    UNUSED_PARAM(clazz)
    glMultiTexCoordP2ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glMultiTexCoordP3ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords) {
    glMultiTexCoordP3uiPROC glMultiTexCoordP3ui = (glMultiTexCoordP3uiPROC)tlsGetFunction(710);
    UNUSED_PARAM(clazz)
    glMultiTexCoordP3ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glMultiTexCoordP4ui(JNIEnv *__env, jclass clazz, jint texture, jint type, jint coords) {
    glMultiTexCoordP4uiPROC glMultiTexCoordP4ui = (glMultiTexCoordP4uiPROC)tlsGetFunction(711);
    UNUSED_PARAM(clazz)
    glMultiTexCoordP4ui(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP1uiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress) {
    glMultiTexCoordP1uivPROC glMultiTexCoordP1uiv = (glMultiTexCoordP1uivPROC)tlsGetFunction(712);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoordP1uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP2uiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress) {
    glMultiTexCoordP2uivPROC glMultiTexCoordP2uiv = (glMultiTexCoordP2uivPROC)tlsGetFunction(713);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoordP2uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP3uiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress) {
    glMultiTexCoordP3uivPROC glMultiTexCoordP3uiv = (glMultiTexCoordP3uivPROC)tlsGetFunction(714);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoordP3uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglMultiTexCoordP4uiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint type, jlong coordsAddress) {
    glMultiTexCoordP4uivPROC glMultiTexCoordP4uiv = (glMultiTexCoordP4uivPROC)tlsGetFunction(715);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoordP4uiv(texture, type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glNormalP3ui(JNIEnv *__env, jclass clazz, jint type, jint coords) {
    glNormalP3uiPROC glNormalP3ui = (glNormalP3uiPROC)tlsGetFunction(716);
    UNUSED_PARAM(clazz)
    glNormalP3ui(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglNormalP3uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong coordsAddress) {
    glNormalP3uivPROC glNormalP3uiv = (glNormalP3uivPROC)tlsGetFunction(717);
    intptr_t coords = (intptr_t)coordsAddress;
    UNUSED_PARAM(clazz)
    glNormalP3uiv(type, coords);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glColorP3ui(JNIEnv *__env, jclass clazz, jint type, jint color) {
    glColorP3uiPROC glColorP3ui = (glColorP3uiPROC)tlsGetFunction(718);
    UNUSED_PARAM(clazz)
    glColorP3ui(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glColorP4ui(JNIEnv *__env, jclass clazz, jint type, jint color) {
    glColorP4uiPROC glColorP4ui = (glColorP4uiPROC)tlsGetFunction(719);
    UNUSED_PARAM(clazz)
    glColorP4ui(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglColorP3uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong colorAddress) {
    glColorP3uivPROC glColorP3uiv = (glColorP3uivPROC)tlsGetFunction(720);
    intptr_t color = (intptr_t)colorAddress;
    UNUSED_PARAM(clazz)
    glColorP3uiv(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglColorP4uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong colorAddress) {
    glColorP4uivPROC glColorP4uiv = (glColorP4uivPROC)tlsGetFunction(721);
    intptr_t color = (intptr_t)colorAddress;
    UNUSED_PARAM(clazz)
    glColorP4uiv(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glSecondaryColorP3ui(JNIEnv *__env, jclass clazz, jint type, jint color) {
    glSecondaryColorP3uiPROC glSecondaryColorP3ui = (glSecondaryColorP3uiPROC)tlsGetFunction(722);
    UNUSED_PARAM(clazz)
    glSecondaryColorP3ui(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglSecondaryColorP3uiv__IJ(JNIEnv *__env, jclass clazz, jint type, jlong colorAddress) {
    glSecondaryColorP3uivPROC glSecondaryColorP3uiv = (glSecondaryColorP3uivPROC)tlsGetFunction(723);
    intptr_t color = (intptr_t)colorAddress;
    UNUSED_PARAM(clazz)
    glSecondaryColorP3uiv(type, color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexAttribP1ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value) {
    glVertexAttribP1uiPROC glVertexAttribP1ui = (glVertexAttribP1uiPROC)tlsGetFunction(686);
    UNUSED_PARAM(clazz)
    glVertexAttribP1ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexAttribP2ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value) {
    glVertexAttribP2uiPROC glVertexAttribP2ui = (glVertexAttribP2uiPROC)tlsGetFunction(687);
    UNUSED_PARAM(clazz)
    glVertexAttribP2ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexAttribP3ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value) {
    glVertexAttribP3uiPROC glVertexAttribP3ui = (glVertexAttribP3uiPROC)tlsGetFunction(688);
    UNUSED_PARAM(clazz)
    glVertexAttribP3ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_glVertexAttribP4ui(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jint value) {
    glVertexAttribP4uiPROC glVertexAttribP4ui = (glVertexAttribP4uiPROC)tlsGetFunction(689);
    UNUSED_PARAM(clazz)
    glVertexAttribP4ui(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP1uiv__IIZJ(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress) {
    glVertexAttribP1uivPROC glVertexAttribP1uiv = (glVertexAttribP1uivPROC)tlsGetFunction(690);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribP1uiv(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP2uiv__IIZJ(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress) {
    glVertexAttribP2uivPROC glVertexAttribP2uiv = (glVertexAttribP2uivPROC)tlsGetFunction(691);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribP2uiv(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP3uiv__IIZJ(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress) {
    glVertexAttribP3uivPROC glVertexAttribP3uiv = (glVertexAttribP3uivPROC)tlsGetFunction(692);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribP3uiv(index, type, normalized, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL33_nglVertexAttribP4uiv__IIZJ(JNIEnv *__env, jclass clazz, jint index, jint type, jboolean normalized, jlong valueAddress) {
    glVertexAttribP4uivPROC glVertexAttribP4uiv = (glVertexAttribP4uivPROC)tlsGetFunction(693);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glVertexAttribP4uiv(index, type, normalized, value);
}

EXTERN_C_EXIT
