/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengles.h"

typedef void (APIENTRY *glBlendBarrierPROC) (void);
typedef void (APIENTRY *glCopyImageSubDataPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glDebugMessageControlPROC) (jint, jint, jint, jint, uintptr_t, jboolean);
typedef void (APIENTRY *glDebugMessageInsertPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glDebugMessageCallbackPROC) (uintptr_t, uintptr_t);
typedef jint (APIENTRY *glGetDebugMessageLogPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetPointervPROC) (jint, uintptr_t);
typedef void (APIENTRY *glPushDebugGroupPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glPopDebugGroupPROC) (void);
typedef void (APIENTRY *glObjectLabelPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetObjectLabelPROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glObjectPtrLabelPROC) (uintptr_t, jint, uintptr_t);
typedef void (APIENTRY *glGetObjectPtrLabelPROC) (uintptr_t, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glEnableiPROC) (jint, jint);
typedef void (APIENTRY *glDisableiPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationiPROC) (jint, jint);
typedef void (APIENTRY *glBlendEquationSeparateiPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFunciPROC) (jint, jint, jint);
typedef void (APIENTRY *glBlendFuncSeparateiPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glColorMaskiPROC) (jint, jboolean, jboolean, jboolean, jboolean);
typedef jboolean (APIENTRY *glIsEnablediPROC) (jint, jint);
typedef void (APIENTRY *glDrawElementsBaseVertexPROC) (jint, jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glDrawRangeElementsBaseVertexPROC) (jint, jint, jint, jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glDrawElementsInstancedBaseVertexPROC) (jint, jint, jint, uintptr_t, jint, jint);
typedef void (APIENTRY *glFramebufferTexturePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glPrimitiveBoundingBoxPROC) (jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);
typedef jint (APIENTRY *glGetGraphicsResetStatusPROC) (void);
typedef void (APIENTRY *glReadnPixelsPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformfvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformuivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMinSampleShadingPROC) (jfloat);
typedef void (APIENTRY *glPatchParameteriPROC) (jint, jint);
typedef void (APIENTRY *glTexParameterIivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexParameterIuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterIivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTexParameterIuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glSamplerParameterIivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glSamplerParameterIuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetSamplerParameterIivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetSamplerParameterIuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTexBufferPROC) (jint, jint, jint);
typedef void (APIENTRY *glTexBufferRangePROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glTexStorage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendBarrier(JNIEnv *__env, jclass clazz) {
    glBlendBarrierPROC glBlendBarrier = (glBlendBarrierPROC)tlsGetFunction(314);
    UNUSED_PARAM(clazz)
    glBlendBarrier();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glCopyImageSubData(JNIEnv *__env, jclass clazz, jint srcName, jint srcTarget, jint srcLevel, jint srcX, jint srcY, jint srcZ, jint dstName, jint dstTarget, jint dstLevel, jint dstX, jint dstY, jint dstZ, jint srcWidth, jint srcHeight, jint srcDepth) {
    glCopyImageSubDataPROC glCopyImageSubData = (glCopyImageSubDataPROC)tlsGetFunction(315);
    UNUSED_PARAM(clazz)
    glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageControl__IIIIJZ(JNIEnv *__env, jclass clazz, jint source, jint type, jint severity, jint count, jlong idsAddress, jboolean enabled) {
    glDebugMessageControlPROC glDebugMessageControl = (glDebugMessageControlPROC)tlsGetFunction(316);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageControl(source, type, severity, count, ids, enabled);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageInsert(JNIEnv *__env, jclass clazz, jint source, jint type, jint id, jint severity, jint length, jlong messageAddress) {
    glDebugMessageInsertPROC glDebugMessageInsert = (glDebugMessageInsertPROC)tlsGetFunction(317);
    uintptr_t message = (uintptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageInsert(source, type, id, severity, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDebugMessageCallback(JNIEnv *__env, jclass clazz, jlong callbackAddress, jlong userParamAddress) {
    glDebugMessageCallbackPROC glDebugMessageCallback = (glDebugMessageCallbackPROC)tlsGetFunction(318);
    uintptr_t callback = (uintptr_t)callbackAddress;
    uintptr_t userParam = (uintptr_t)userParamAddress;
    UNUSED_PARAM(clazz)
    glDebugMessageCallback(callback, userParam);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_nglGetDebugMessageLog__IIJJJJJJ(JNIEnv *__env, jclass clazz, jint count, jint bufsize, jlong sourcesAddress, jlong typesAddress, jlong idsAddress, jlong severitiesAddress, jlong lengthsAddress, jlong messageLogAddress) {
    glGetDebugMessageLogPROC glGetDebugMessageLog = (glGetDebugMessageLogPROC)tlsGetFunction(319);
    uintptr_t sources = (uintptr_t)sourcesAddress;
    uintptr_t types = (uintptr_t)typesAddress;
    uintptr_t ids = (uintptr_t)idsAddress;
    uintptr_t severities = (uintptr_t)severitiesAddress;
    uintptr_t lengths = (uintptr_t)lengthsAddress;
    uintptr_t messageLog = (uintptr_t)messageLogAddress;
    UNUSED_PARAM(clazz)
    return (jint)glGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetPointerv(JNIEnv *__env, jclass clazz, jint pname, jlong paramsAddress) {
    glGetPointervPROC glGetPointerv = (glGetPointervPROC)tlsGetFunction(320);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointerv(pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglPushDebugGroup(JNIEnv *__env, jclass clazz, jint source, jint id, jint length, jlong messageAddress) {
    glPushDebugGroupPROC glPushDebugGroup = (glPushDebugGroupPROC)tlsGetFunction(321);
    uintptr_t message = (uintptr_t)messageAddress;
    UNUSED_PARAM(clazz)
    glPushDebugGroup(source, id, length, message);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glPopDebugGroup(JNIEnv *__env, jclass clazz) {
    glPopDebugGroupPROC glPopDebugGroup = (glPopDebugGroupPROC)tlsGetFunction(322);
    UNUSED_PARAM(clazz)
    glPopDebugGroup();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectLabel(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint length, jlong labelAddress) {
    glObjectLabelPROC glObjectLabel = (glObjectLabelPROC)tlsGetFunction(323);
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectLabel(identifier, name, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectLabel__IIIJJ(JNIEnv *__env, jclass clazz, jint identifier, jint name, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectLabelPROC glGetObjectLabel = (glGetObjectLabelPROC)tlsGetFunction(324);
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectLabel(identifier, name, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglObjectPtrLabel(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint length, jlong labelAddress) {
    glObjectPtrLabelPROC glObjectPtrLabel = (glObjectPtrLabelPROC)tlsGetFunction(325);
    uintptr_t ptr = (uintptr_t)ptrAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glObjectPtrLabel(ptr, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetObjectPtrLabel__JIJJ(JNIEnv *__env, jclass clazz, jlong ptrAddress, jint bufSize, jlong lengthAddress, jlong labelAddress) {
    glGetObjectPtrLabelPROC glGetObjectPtrLabel = (glGetObjectPtrLabelPROC)tlsGetFunction(326);
    uintptr_t ptr = (uintptr_t)ptrAddress;
    uintptr_t length = (uintptr_t)lengthAddress;
    uintptr_t label = (uintptr_t)labelAddress;
    UNUSED_PARAM(clazz)
    glGetObjectPtrLabel(ptr, bufSize, length, label);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glEnablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glEnableiPROC glEnablei = (glEnableiPROC)tlsGetFunction(327);
    UNUSED_PARAM(clazz)
    glEnablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glDisablei(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glDisableiPROC glDisablei = (glDisableiPROC)tlsGetFunction(328);
    UNUSED_PARAM(clazz)
    glDisablei(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendEquationi(JNIEnv *__env, jclass clazz, jint buf, jint mode) {
    glBlendEquationiPROC glBlendEquationi = (glBlendEquationiPROC)tlsGetFunction(329);
    UNUSED_PARAM(clazz)
    glBlendEquationi(buf, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendEquationSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint modeRGB, jint modeAlpha) {
    glBlendEquationSeparateiPROC glBlendEquationSeparatei = (glBlendEquationSeparateiPROC)tlsGetFunction(330);
    UNUSED_PARAM(clazz)
    glBlendEquationSeparatei(buf, modeRGB, modeAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendFunci(JNIEnv *__env, jclass clazz, jint buf, jint src, jint dst) {
    glBlendFunciPROC glBlendFunci = (glBlendFunciPROC)tlsGetFunction(331);
    UNUSED_PARAM(clazz)
    glBlendFunci(buf, src, dst);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glBlendFuncSeparatei(JNIEnv *__env, jclass clazz, jint buf, jint srcRGB, jint dstRGB, jint srcAlpha, jint dstAlpha) {
    glBlendFuncSeparateiPROC glBlendFuncSeparatei = (glBlendFuncSeparateiPROC)tlsGetFunction(332);
    UNUSED_PARAM(clazz)
    glBlendFuncSeparatei(buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glColorMaski(JNIEnv *__env, jclass clazz, jint index, jboolean r, jboolean g, jboolean b, jboolean a) {
    glColorMaskiPROC glColorMaski = (glColorMaskiPROC)tlsGetFunction(333);
    UNUSED_PARAM(clazz)
    glColorMaski(index, r, g, b, a);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengles_GLES32_glIsEnabledi(JNIEnv *__env, jclass clazz, jint target, jint index) {
    glIsEnablediPROC glIsEnabledi = (glIsEnablediPROC)tlsGetFunction(334);
    UNUSED_PARAM(clazz)
    return (jboolean)glIsEnabledi(target, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawElementsBaseVertexPROC glDrawElementsBaseVertex = (glDrawElementsBaseVertexPROC)tlsGetFunction(335);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawRangeElementsBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint start, jint end, jint count, jint type, jlong indicesAddress, jint basevertex) {
    glDrawRangeElementsBaseVertexPROC glDrawRangeElementsBaseVertex = (glDrawRangeElementsBaseVertexPROC)tlsGetFunction(336);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglDrawElementsInstancedBaseVertex(JNIEnv *__env, jclass clazz, jint mode, jint count, jint type, jlong indicesAddress, jint instancecount, jint basevertex) {
    glDrawElementsInstancedBaseVertexPROC glDrawElementsInstancedBaseVertex = (glDrawElementsInstancedBaseVertexPROC)tlsGetFunction(337);
    uintptr_t indices = (uintptr_t)indicesAddress;
    UNUSED_PARAM(clazz)
    glDrawElementsInstancedBaseVertex(mode, count, type, indices, instancecount, basevertex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glFramebufferTexture(JNIEnv *__env, jclass clazz, jint target, jint attachment, jint texture, jint level) {
    glFramebufferTexturePROC glFramebufferTexture = (glFramebufferTexturePROC)tlsGetFunction(338);
    UNUSED_PARAM(clazz)
    glFramebufferTexture(target, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glPrimitiveBoundingBox(JNIEnv *__env, jclass clazz, jfloat minX, jfloat minY, jfloat minZ, jfloat minW, jfloat maxX, jfloat maxY, jfloat maxZ, jfloat maxW) {
    glPrimitiveBoundingBoxPROC glPrimitiveBoundingBox = (glPrimitiveBoundingBoxPROC)tlsGetFunction(339);
    UNUSED_PARAM(clazz)
    glPrimitiveBoundingBox(minX, minY, minZ, minW, maxX, maxY, maxZ, maxW);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengles_GLES32_glGetGraphicsResetStatus(JNIEnv *__env, jclass clazz) {
    glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)tlsGetFunction(340);
    UNUSED_PARAM(clazz)
    return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglReadnPixels__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)tlsGetFunction(341);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformfv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)tlsGetFunction(342);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)tlsGetFunction(343);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetnUniformuiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)tlsGetFunction(344);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformuiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glMinSampleShading(JNIEnv *__env, jclass clazz, jfloat value) {
    glMinSampleShadingPROC glMinSampleShading = (glMinSampleShadingPROC)tlsGetFunction(345);
    UNUSED_PARAM(clazz)
    glMinSampleShading(value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glPatchParameteri(JNIEnv *__env, jclass clazz, jint pname, jint value) {
    glPatchParameteriPROC glPatchParameteri = (glPatchParameteriPROC)tlsGetFunction(346);
    UNUSED_PARAM(clazz)
    glPatchParameteri(pname, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIivPROC glTexParameterIiv = (glTexParameterIivPROC)tlsGetFunction(347);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glTexParameterIuivPROC glTexParameterIuiv = (glTexParameterIuivPROC)tlsGetFunction(348);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIivPROC glGetTexParameterIiv = (glGetTexParameterIivPROC)tlsGetFunction(349);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetTexParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint target, jint pname, jlong paramsAddress) {
    glGetTexParameterIuivPROC glGetTexParameterIuiv = (glGetTexParameterIuivPROC)tlsGetFunction(350);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTexParameterIuiv(target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIivPROC glSamplerParameterIiv = (glSamplerParameterIivPROC)tlsGetFunction(351);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glSamplerParameterIuivPROC glSamplerParameterIuiv = (glSamplerParameterIuivPROC)tlsGetFunction(352);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIivPROC glGetSamplerParameterIiv = (glGetSamplerParameterIivPROC)tlsGetFunction(353);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_nglGetSamplerParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint sampler, jint pname, jlong paramsAddress) {
    glGetSamplerParameterIuivPROC glGetSamplerParameterIuiv = (glGetSamplerParameterIuivPROC)tlsGetFunction(354);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetSamplerParameterIuiv(sampler, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glTexBuffer(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer) {
    glTexBufferPROC glTexBuffer = (glTexBufferPROC)tlsGetFunction(355);
    UNUSED_PARAM(clazz)
    glTexBuffer(target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glTexBufferRange(JNIEnv *__env, jclass clazz, jint target, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTexBufferRangePROC glTexBufferRange = (glTexBufferRangePROC)tlsGetFunction(356);
    UNUSED_PARAM(clazz)
    glTexBufferRange(target, internalformat, buffer, (uintptr_t)offset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengles_GLES32_glTexStorage3DMultisample(JNIEnv *__env, jclass clazz, jint target, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTexStorage3DMultisamplePROC glTexStorage3DMultisample = (glTexStorage3DMultisamplePROC)tlsGetFunction(357);
    UNUSED_PARAM(clazz)
    glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
}

EXTERN_C_EXIT
