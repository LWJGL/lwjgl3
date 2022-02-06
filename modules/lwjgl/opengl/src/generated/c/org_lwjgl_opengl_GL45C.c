/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClipControlPROC) (jint, jint);
typedef void (APIENTRY *glCreateTransformFeedbacksPROC) (jint, uintptr_t);
typedef void (APIENTRY *glTransformFeedbackBufferBasePROC) (jint, jint, jint);
typedef void (APIENTRY *glTransformFeedbackBufferRangePROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetTransformFeedbackivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTransformFeedbacki_vPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTransformFeedbacki64_vPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCreateBuffersPROC) (jint, uintptr_t);
typedef void (APIENTRY *glNamedBufferStoragePROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glNamedBufferDataPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glNamedBufferSubDataPROC) (jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glCopyNamedBufferSubDataPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glClearNamedBufferDataPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glClearNamedBufferSubDataPROC) (jint, jint, uintptr_t, uintptr_t, jint, jint, uintptr_t);
typedef uintptr_t (APIENTRY *glMapNamedBufferPROC) (jint, jint);
typedef uintptr_t (APIENTRY *glMapNamedBufferRangePROC) (jint, uintptr_t, uintptr_t, jint);
typedef jboolean (APIENTRY *glUnmapNamedBufferPROC) (jint);
typedef void (APIENTRY *glFlushMappedNamedBufferRangePROC) (jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glGetNamedBufferParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedBufferParameteri64vPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedBufferPointervPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedBufferSubDataPROC) (jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glCreateFramebuffersPROC) (jint, uintptr_t);
typedef void (APIENTRY *glNamedFramebufferRenderbufferPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexturePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTextureLayerPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferDrawBufferPROC) (jint, jint);
typedef void (APIENTRY *glNamedFramebufferDrawBuffersPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedFramebufferReadBufferPROC) (jint, jint);
typedef void (APIENTRY *glInvalidateNamedFramebufferDataPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glInvalidateNamedFramebufferSubDataPROC) (jint, jint, uintptr_t, jint, jint, jint, jint);
typedef void (APIENTRY *glClearNamedFramebufferivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glClearNamedFramebufferuivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glClearNamedFramebufferfvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glClearNamedFramebufferfiPROC) (jint, jint, jint, jfloat, jint);
typedef void (APIENTRY *glBlitNamedFramebufferPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *glCheckNamedFramebufferStatusPROC) (jint, jint);
typedef void (APIENTRY *glGetNamedFramebufferParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedFramebufferAttachmentParameterivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCreateRenderbuffersPROC) (jint, uintptr_t);
typedef void (APIENTRY *glNamedRenderbufferStoragePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisamplePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetNamedRenderbufferParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glCreateTexturesPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureBufferPROC) (jint, jint, jint);
typedef void (APIENTRY *glTextureBufferRangePROC) (jint, jint, jint, uintptr_t, uintptr_t);
typedef void (APIENTRY *glTextureStorage1DPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureStorage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureSubImage1DPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage1DPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyTextureSubImage1DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTextureParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glTextureParameterIivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureParameterIuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGenerateTextureMipmapPROC) (jint);
typedef void (APIENTRY *glBindTextureUnitPROC) (jint, jint);
typedef void (APIENTRY *glGetTextureImagePROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetCompressedTextureImagePROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterfvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterfvPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterIivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterIuivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glCreateVertexArraysPROC) (jint, uintptr_t);
typedef void (APIENTRY *glDisableVertexArrayAttribPROC) (jint, jint);
typedef void (APIENTRY *glEnableVertexArrayAttribPROC) (jint, jint);
typedef void (APIENTRY *glVertexArrayElementBufferPROC) (jint, jint);
typedef void (APIENTRY *glVertexArrayVertexBufferPROC) (jint, jint, jint, uintptr_t, jint);
typedef void (APIENTRY *glVertexArrayVertexBuffersPROC) (jint, jint, jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glVertexArrayAttribFormatPROC) (jint, jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexArrayAttribIFormatPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayAttribLFormatPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayAttribBindingPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexArrayBindingDivisorPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetVertexArrayivPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetVertexArrayIndexedivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetVertexArrayIndexed64ivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCreateSamplersPROC) (jint, uintptr_t);
typedef void (APIENTRY *glCreateProgramPipelinesPROC) (jint, uintptr_t);
typedef void (APIENTRY *glCreateQueriesPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetQueryBufferObjectivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetQueryBufferObjectuivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetQueryBufferObjecti64vPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetQueryBufferObjectui64vPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMemoryBarrierByRegionPROC) (jint);
typedef void (APIENTRY *glGetTextureSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetCompressedTextureSubImagePROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureBarrierPROC) (void);
typedef jint (APIENTRY *glGetGraphicsResetStatusPROC) (void);
typedef void (APIENTRY *glGetnTexImagePROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glReadnPixelsPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnCompressedTexImagePROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformfvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformdvPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformivPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetnUniformuivPROC) (jint, jint, jint, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glClipControl(JNIEnv *__env, jclass clazz, jint origin, jint depth) {
    glClipControlPROC glClipControl = (glClipControlPROC)tlsGetFunction(922);
    UNUSED_PARAM(clazz)
    glClipControl(origin, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glCreateTransformFeedbacksPROC glCreateTransformFeedbacks = (glCreateTransformFeedbacksPROC)tlsGetFunction(923);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glCreateTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTransformFeedbackBufferBase(JNIEnv *__env, jclass clazz, jint xfb, jint index, jint buffer) {
    glTransformFeedbackBufferBasePROC glTransformFeedbackBufferBase = (glTransformFeedbackBufferBasePROC)tlsGetFunction(924);
    UNUSED_PARAM(clazz)
    glTransformFeedbackBufferBase(xfb, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTransformFeedbackBufferRange(JNIEnv *__env, jclass clazz, jint xfb, jint index, jint buffer, jlong offset, jlong size) {
    glTransformFeedbackBufferRangePROC glTransformFeedbackBufferRange = (glTransformFeedbackBufferRangePROC)tlsGetFunction(925);
    UNUSED_PARAM(clazz)
    glTransformFeedbackBufferRange(xfb, index, buffer, (uintptr_t)offset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTransformFeedbackiv__IIJ(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jlong paramAddress) {
    glGetTransformFeedbackivPROC glGetTransformFeedbackiv = (glGetTransformFeedbackivPROC)tlsGetFunction(926);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbackiv(xfb, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTransformFeedbacki_1v__IIIJ(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jint index, jlong paramAddress) {
    glGetTransformFeedbacki_vPROC glGetTransformFeedbacki_v = (glGetTransformFeedbacki_vPROC)tlsGetFunction(927);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbacki_v(xfb, pname, index, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTransformFeedbacki64_1v__IIIJ(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jint index, jlong paramAddress) {
    glGetTransformFeedbacki64_vPROC glGetTransformFeedbacki64_v = (glGetTransformFeedbacki64_vPROC)tlsGetFunction(928);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbacki64_v(xfb, pname, index, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
    glCreateBuffersPROC glCreateBuffers = (glCreateBuffersPROC)tlsGetFunction(929);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glCreateBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglNamedBufferStorage__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags) {
    glNamedBufferStoragePROC glNamedBufferStorage = (glNamedBufferStoragePROC)tlsGetFunction(930);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferStorage(buffer, (uintptr_t)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglNamedBufferData__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint usage) {
    glNamedBufferDataPROC glNamedBufferData = (glNamedBufferDataPROC)tlsGetFunction(931);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferData(buffer, (uintptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglNamedBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glNamedBufferSubDataPROC glNamedBufferSubData = (glNamedBufferSubDataPROC)tlsGetFunction(932);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferSubData(buffer, (uintptr_t)offset, (uintptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glCopyNamedBufferSubData(JNIEnv *__env, jclass clazz, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size) {
    glCopyNamedBufferSubDataPROC glCopyNamedBufferSubData = (glCopyNamedBufferSubDataPROC)tlsGetFunction(933);
    UNUSED_PARAM(clazz)
    glCopyNamedBufferSubData(readBuffer, writeBuffer, (uintptr_t)readOffset, (uintptr_t)writeOffset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglClearNamedBufferData__IIIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferDataPROC glClearNamedBufferData = (glClearNamedBufferDataPROC)tlsGetFunction(934);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferData(buffer, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglClearNamedBufferSubData__IIJJIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferSubDataPROC glClearNamedBufferSubData = (glClearNamedBufferSubDataPROC)tlsGetFunction(935);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferSubData(buffer, internalformat, (uintptr_t)offset, (uintptr_t)size, format, type, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL45C_nglMapNamedBuffer(JNIEnv *__env, jclass clazz, jint buffer, jint access) {
    glMapNamedBufferPROC glMapNamedBuffer = (glMapNamedBufferPROC)tlsGetFunction(936);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBuffer(buffer, access);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_GL45C_nglMapNamedBufferRange(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jint access) {
    glMapNamedBufferRangePROC glMapNamedBufferRange = (glMapNamedBufferRangePROC)tlsGetFunction(937);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBufferRange(buffer, (uintptr_t)offset, (uintptr_t)length, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_GL45C_glUnmapNamedBuffer(JNIEnv *__env, jclass clazz, jint buffer) {
    glUnmapNamedBufferPROC glUnmapNamedBuffer = (glUnmapNamedBufferPROC)tlsGetFunction(938);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapNamedBuffer(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glFlushMappedNamedBufferRange(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length) {
    glFlushMappedNamedBufferRangePROC glFlushMappedNamedBufferRange = (glFlushMappedNamedBufferRangePROC)tlsGetFunction(939);
    UNUSED_PARAM(clazz)
    glFlushMappedNamedBufferRange(buffer, (uintptr_t)offset, (uintptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedBufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameterivPROC glGetNamedBufferParameteriv = (glGetNamedBufferParameterivPROC)tlsGetFunction(940);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameteriv(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedBufferParameteri64v__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameteri64vPROC glGetNamedBufferParameteri64v = (glGetNamedBufferParameteri64vPROC)tlsGetFunction(941);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameteri64v(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedBufferPointerv(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferPointervPROC glGetNamedBufferPointerv = (glGetNamedBufferPointervPROC)tlsGetFunction(942);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferPointerv(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glGetNamedBufferSubDataPROC glGetNamedBufferSubData = (glGetNamedBufferSubDataPROC)tlsGetFunction(943);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferSubData(buffer, (uintptr_t)offset, (uintptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glCreateFramebuffersPROC glCreateFramebuffers = (glCreateFramebuffersPROC)tlsGetFunction(944);
    uintptr_t framebuffers = (uintptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glCreateFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glNamedFramebufferRenderbufferPROC glNamedFramebufferRenderbuffer = (glNamedFramebufferRenderbufferPROC)tlsGetFunction(945);
    UNUSED_PARAM(clazz)
    glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedFramebufferParameteri(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jint param) {
    glNamedFramebufferParameteriPROC glNamedFramebufferParameteri = (glNamedFramebufferParameteriPROC)tlsGetFunction(946);
    UNUSED_PARAM(clazz)
    glNamedFramebufferParameteri(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedFramebufferTexture(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level) {
    glNamedFramebufferTexturePROC glNamedFramebufferTexture = (glNamedFramebufferTexturePROC)tlsGetFunction(947);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture(framebuffer, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint layer) {
    glNamedFramebufferTextureLayerPROC glNamedFramebufferTextureLayer = (glNamedFramebufferTextureLayerPROC)tlsGetFunction(948);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedFramebufferDrawBuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint buf) {
    glNamedFramebufferDrawBufferPROC glNamedFramebufferDrawBuffer = (glNamedFramebufferDrawBufferPROC)tlsGetFunction(949);
    UNUSED_PARAM(clazz)
    glNamedFramebufferDrawBuffer(framebuffer, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglNamedFramebufferDrawBuffers__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint n, jlong bufsAddress) {
    glNamedFramebufferDrawBuffersPROC glNamedFramebufferDrawBuffers = (glNamedFramebufferDrawBuffersPROC)tlsGetFunction(950);
    uintptr_t bufs = (uintptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glNamedFramebufferDrawBuffers(framebuffer, n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedFramebufferReadBuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint src) {
    glNamedFramebufferReadBufferPROC glNamedFramebufferReadBuffer = (glNamedFramebufferReadBufferPROC)tlsGetFunction(951);
    UNUSED_PARAM(clazz)
    glNamedFramebufferReadBuffer(framebuffer, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglInvalidateNamedFramebufferData__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint numAttachments, jlong attachmentsAddress) {
    glInvalidateNamedFramebufferDataPROC glInvalidateNamedFramebufferData = (glInvalidateNamedFramebufferDataPROC)tlsGetFunction(952);
    uintptr_t attachments = (uintptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglInvalidateNamedFramebufferSubData__IIJIIII(JNIEnv *__env, jclass clazz, jint framebuffer, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height) {
    glInvalidateNamedFramebufferSubDataPROC glInvalidateNamedFramebufferSubData = (glInvalidateNamedFramebufferSubDataPROC)tlsGetFunction(953);
    uintptr_t attachments = (uintptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglClearNamedFramebufferiv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearNamedFramebufferivPROC glClearNamedFramebufferiv = (glClearNamedFramebufferivPROC)tlsGetFunction(954);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglClearNamedFramebufferuiv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearNamedFramebufferuivPROC glClearNamedFramebufferuiv = (glClearNamedFramebufferuivPROC)tlsGetFunction(955);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglClearNamedFramebufferfv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearNamedFramebufferfvPROC glClearNamedFramebufferfv = (glClearNamedFramebufferfvPROC)tlsGetFunction(956);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glClearNamedFramebufferfi(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jfloat depth, jint stencil) {
    glClearNamedFramebufferfiPROC glClearNamedFramebufferfi = (glClearNamedFramebufferfiPROC)tlsGetFunction(957);
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glBlitNamedFramebuffer(JNIEnv *__env, jclass clazz, jint readFramebuffer, jint drawFramebuffer, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitNamedFramebufferPROC glBlitNamedFramebuffer = (glBlitNamedFramebufferPROC)tlsGetFunction(958);
    UNUSED_PARAM(clazz)
    glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL45C_glCheckNamedFramebufferStatus(JNIEnv *__env, jclass clazz, jint framebuffer, jint target) {
    glCheckNamedFramebufferStatusPROC glCheckNamedFramebufferStatus = (glCheckNamedFramebufferStatusPROC)tlsGetFunction(959);
    UNUSED_PARAM(clazz)
    return (jint)glCheckNamedFramebufferStatus(framebuffer, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedFramebufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferParameterivPROC glGetNamedFramebufferParameteriv = (glGetNamedFramebufferParameterivPROC)tlsGetFunction(960);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferParameteriv(framebuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferAttachmentParameterivPROC glGetNamedFramebufferAttachmentParameteriv = (glGetNamedFramebufferAttachmentParameterivPROC)tlsGetFunction(961);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glCreateRenderbuffersPROC glCreateRenderbuffers = (glCreateRenderbuffersPROC)tlsGetFunction(962);
    uintptr_t renderbuffers = (uintptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glCreateRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedRenderbufferStorage(JNIEnv *__env, jclass clazz, jint renderbuffer, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStoragePROC glNamedRenderbufferStorage = (glNamedRenderbufferStoragePROC)tlsGetFunction(963);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glNamedRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisamplePROC glNamedRenderbufferStorageMultisample = (glNamedRenderbufferStorageMultisamplePROC)tlsGetFunction(964);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetNamedRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint renderbuffer, jint pname, jlong paramsAddress) {
    glGetNamedRenderbufferParameterivPROC glGetNamedRenderbufferParameteriv = (glGetNamedRenderbufferParameterivPROC)tlsGetFunction(965);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateTextures__IIJ(JNIEnv *__env, jclass clazz, jint target, jint n, jlong texturesAddress) {
    glCreateTexturesPROC glCreateTextures = (glCreateTexturesPROC)tlsGetFunction(966);
    uintptr_t textures = (uintptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glCreateTextures(target, n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureBuffer(JNIEnv *__env, jclass clazz, jint texture, jint internalformat, jint buffer) {
    glTextureBufferPROC glTextureBuffer = (glTextureBufferPROC)tlsGetFunction(967);
    UNUSED_PARAM(clazz)
    glTextureBuffer(texture, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureBufferRange(JNIEnv *__env, jclass clazz, jint texture, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTextureBufferRangePROC glTextureBufferRange = (glTextureBufferRangePROC)tlsGetFunction(968);
    UNUSED_PARAM(clazz)
    glTextureBufferRange(texture, internalformat, buffer, (uintptr_t)offset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureStorage1D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width) {
    glTextureStorage1DPROC glTextureStorage1D = (glTextureStorage1DPROC)tlsGetFunction(969);
    UNUSED_PARAM(clazz)
    glTextureStorage1D(texture, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureStorage2D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jint height) {
    glTextureStorage2DPROC glTextureStorage2D = (glTextureStorage2DPROC)tlsGetFunction(970);
    UNUSED_PARAM(clazz)
    glTextureStorage2D(texture, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureStorage3D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTextureStorage3DPROC glTextureStorage3D = (glTextureStorage3DPROC)tlsGetFunction(971);
    UNUSED_PARAM(clazz)
    glTextureStorage3D(texture, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureStorage2DMultisample(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTextureStorage2DMultisamplePROC glTextureStorage2DMultisample = (glTextureStorage2DMultisamplePROC)tlsGetFunction(972);
    UNUSED_PARAM(clazz)
    glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureStorage3DMultisample(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTextureStorage3DMultisamplePROC glTextureStorage3DMultisample = (glTextureStorage3DMultisamplePROC)tlsGetFunction(973);
    UNUSED_PARAM(clazz)
    glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureSubImage1D__IIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage1DPROC glTextureSubImage1D = (glTextureSubImage1DPROC)tlsGetFunction(974);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureSubImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage2DPROC glTextureSubImage2D = (glTextureSubImage2DPROC)tlsGetFunction(975);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureSubImage3D__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage3DPROC glTextureSubImage3D = (glTextureSubImage3DPROC)tlsGetFunction(976);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCompressedTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage1DPROC glCompressedTextureSubImage1D = (glCompressedTextureSubImage1DPROC)tlsGetFunction(977);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCompressedTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage2DPROC glCompressedTextureSubImage2D = (glCompressedTextureSubImage2DPROC)tlsGetFunction(978);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCompressedTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage3DPROC glCompressedTextureSubImage3D = (glCompressedTextureSubImage3DPROC)tlsGetFunction(979);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glCopyTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyTextureSubImage1DPROC glCopyTextureSubImage1D = (glCopyTextureSubImage1DPROC)tlsGetFunction(980);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glCopyTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage2DPROC glCopyTextureSubImage2D = (glCopyTextureSubImage2DPROC)tlsGetFunction(981);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glCopyTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage3DPROC glCopyTextureSubImage3D = (glCopyTextureSubImage3DPROC)tlsGetFunction(982);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureParameterf(JNIEnv *__env, jclass clazz, jint texture, jint pname, jfloat param) {
    glTextureParameterfPROC glTextureParameterf = (glTextureParameterfPROC)tlsGetFunction(983);
    UNUSED_PARAM(clazz)
    glTextureParameterf(texture, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterfvPROC glTextureParameterfv = (glTextureParameterfvPROC)tlsGetFunction(984);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterfv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureParameteri(JNIEnv *__env, jclass clazz, jint texture, jint pname, jint param) {
    glTextureParameteriPROC glTextureParameteri = (glTextureParameteriPROC)tlsGetFunction(985);
    UNUSED_PARAM(clazz)
    glTextureParameteri(texture, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterIivPROC glTextureParameterIiv = (glTextureParameterIivPROC)tlsGetFunction(986);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterIuivPROC glTextureParameterIuiv = (glTextureParameterIuivPROC)tlsGetFunction(987);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIuiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglTextureParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterivPROC glTextureParameteriv = (glTextureParameterivPROC)tlsGetFunction(988);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameteriv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glGenerateTextureMipmap(JNIEnv *__env, jclass clazz, jint texture) {
    glGenerateTextureMipmapPROC glGenerateTextureMipmap = (glGenerateTextureMipmapPROC)tlsGetFunction(989);
    UNUSED_PARAM(clazz)
    glGenerateTextureMipmap(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glBindTextureUnit(JNIEnv *__env, jclass clazz, jint unit, jint texture) {
    glBindTextureUnitPROC glBindTextureUnit = (glBindTextureUnitPROC)tlsGetFunction(990);
    UNUSED_PARAM(clazz)
    glBindTextureUnit(unit, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureImage__IIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glGetTextureImagePROC glGetTextureImage = (glGetTextureImagePROC)tlsGetFunction(991);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureImage(texture, level, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetCompressedTextureImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint bufSize, jlong pixelsAddress) {
    glGetCompressedTextureImagePROC glGetCompressedTextureImage = (glGetCompressedTextureImagePROC)tlsGetFunction(992);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTextureImage(texture, level, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureLevelParameterfv__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterfvPROC glGetTextureLevelParameterfv = (glGetTextureLevelParameterfvPROC)tlsGetFunction(993);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameterfv(texture, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureLevelParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterivPROC glGetTextureLevelParameteriv = (glGetTextureLevelParameterivPROC)tlsGetFunction(994);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameteriv(texture, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterfvPROC glGetTextureParameterfv = (glGetTextureParameterfvPROC)tlsGetFunction(995);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterfv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterIivPROC glGetTextureParameterIiv = (glGetTextureParameterIivPROC)tlsGetFunction(996);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterIuivPROC glGetTextureParameterIuiv = (glGetTextureParameterIuivPROC)tlsGetFunction(997);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIuiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterivPROC glGetTextureParameteriv = (glGetTextureParameterivPROC)tlsGetFunction(998);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameteriv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glCreateVertexArraysPROC glCreateVertexArrays = (glCreateVertexArraysPROC)tlsGetFunction(999);
    uintptr_t arrays = (uintptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glCreateVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glDisableVertexArrayAttrib(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glDisableVertexArrayAttribPROC glDisableVertexArrayAttrib = (glDisableVertexArrayAttribPROC)tlsGetFunction(1000);
    UNUSED_PARAM(clazz)
    glDisableVertexArrayAttrib(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glEnableVertexArrayAttrib(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glEnableVertexArrayAttribPROC glEnableVertexArrayAttrib = (glEnableVertexArrayAttribPROC)tlsGetFunction(1001);
    UNUSED_PARAM(clazz)
    glEnableVertexArrayAttrib(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayElementBuffer(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer) {
    glVertexArrayElementBufferPROC glVertexArrayElementBuffer = (glVertexArrayElementBufferPROC)tlsGetFunction(1002);
    UNUSED_PARAM(clazz)
    glVertexArrayElementBuffer(vaobj, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayVertexBuffer(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint buffer, jlong offset, jint stride) {
    glVertexArrayVertexBufferPROC glVertexArrayVertexBuffer = (glVertexArrayVertexBufferPROC)tlsGetFunction(1003);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, (uintptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglVertexArrayVertexBuffers__IIIJJJ(JNIEnv *__env, jclass clazz, jint vaobj, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress) {
    glVertexArrayVertexBuffersPROC glVertexArrayVertexBuffers = (glVertexArrayVertexBuffersPROC)tlsGetFunction(1004);
    uintptr_t buffers = (uintptr_t)buffersAddress;
    uintptr_t offsets = (uintptr_t)offsetsAddress;
    uintptr_t strides = (uintptr_t)stridesAddress;
    UNUSED_PARAM(clazz)
    glVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayAttribFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
    glVertexArrayAttribFormatPROC glVertexArrayAttribFormat = (glVertexArrayAttribFormatPROC)tlsGetFunction(1005);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayAttribIFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexArrayAttribIFormatPROC glVertexArrayAttribIFormat = (glVertexArrayAttribIFormatPROC)tlsGetFunction(1006);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayAttribLFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexArrayAttribLFormatPROC glVertexArrayAttribLFormat = (glVertexArrayAttribLFormatPROC)tlsGetFunction(1007);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayAttribBinding(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint bindingindex) {
    glVertexArrayAttribBindingPROC glVertexArrayAttribBinding = (glVertexArrayAttribBindingPROC)tlsGetFunction(1008);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glVertexArrayBindingDivisor(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint divisor) {
    glVertexArrayBindingDivisorPROC glVertexArrayBindingDivisor = (glVertexArrayBindingDivisorPROC)tlsGetFunction(1009);
    UNUSED_PARAM(clazz)
    glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetVertexArrayiv__IIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress) {
    glGetVertexArrayivPROC glGetVertexArrayiv = (glGetVertexArrayivPROC)tlsGetFunction(1010);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayiv(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetVertexArrayIndexediv__IIIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayIndexedivPROC glGetVertexArrayIndexediv = (glGetVertexArrayIndexedivPROC)tlsGetFunction(1011);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIndexediv(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetVertexArrayIndexed64iv__IIIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayIndexed64ivPROC glGetVertexArrayIndexed64iv = (glGetVertexArrayIndexed64ivPROC)tlsGetFunction(1012);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateSamplers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong samplersAddress) {
    glCreateSamplersPROC glCreateSamplers = (glCreateSamplersPROC)tlsGetFunction(1013);
    uintptr_t samplers = (uintptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glCreateSamplers(n, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glCreateProgramPipelinesPROC glCreateProgramPipelines = (glCreateProgramPipelinesPROC)tlsGetFunction(1014);
    uintptr_t pipelines = (uintptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glCreateProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglCreateQueries__IIJ(JNIEnv *__env, jclass clazz, jint target, jint n, jlong idsAddress) {
    glCreateQueriesPROC glCreateQueries = (glCreateQueriesPROC)tlsGetFunction(1015);
    uintptr_t ids = (uintptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glCreateQueries(target, n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glGetQueryBufferObjectiv(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjectivPROC glGetQueryBufferObjectiv = (glGetQueryBufferObjectivPROC)tlsGetFunction(1016);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjectiv(id, buffer, pname, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glGetQueryBufferObjectuiv(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjectuivPROC glGetQueryBufferObjectuiv = (glGetQueryBufferObjectuivPROC)tlsGetFunction(1017);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjectuiv(id, buffer, pname, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glGetQueryBufferObjecti64v(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjecti64vPROC glGetQueryBufferObjecti64v = (glGetQueryBufferObjecti64vPROC)tlsGetFunction(1018);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjecti64v(id, buffer, pname, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glGetQueryBufferObjectui64v(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjectui64vPROC glGetQueryBufferObjectui64v = (glGetQueryBufferObjectui64vPROC)tlsGetFunction(1019);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjectui64v(id, buffer, pname, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glMemoryBarrierByRegion(JNIEnv *__env, jclass clazz, jint barriers) {
    glMemoryBarrierByRegionPROC glMemoryBarrierByRegion = (glMemoryBarrierByRegionPROC)tlsGetFunction(1020);
    UNUSED_PARAM(clazz)
    glMemoryBarrierByRegion(barriers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetTextureSubImage__IIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glGetTextureSubImagePROC glGetTextureSubImage = (glGetTextureSubImagePROC)tlsGetFunction(1021);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetCompressedTextureSubImage__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint bufSize, jlong pixelsAddress) {
    glGetCompressedTextureSubImagePROC glGetCompressedTextureSubImage = (glGetCompressedTextureSubImagePROC)tlsGetFunction(1022);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_glTextureBarrier(JNIEnv *__env, jclass clazz) {
    glTextureBarrierPROC glTextureBarrier = (glTextureBarrierPROC)tlsGetFunction(1023);
    UNUSED_PARAM(clazz)
    glTextureBarrier();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GL45C_glGetGraphicsResetStatus(JNIEnv *__env, jclass clazz) {
    glGetGraphicsResetStatusPROC glGetGraphicsResetStatus = (glGetGraphicsResetStatusPROC)tlsGetFunction(1024);
    UNUSED_PARAM(clazz)
    return (jint)glGetGraphicsResetStatus();
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetnTexImage__IIIIIJ(JNIEnv *__env, jclass clazz, jint tex, jint level, jint format, jint type, jint bufSize, jlong imgAddress) {
    glGetnTexImagePROC glGetnTexImage = (glGetnTexImagePROC)tlsGetFunction(1032);
    uintptr_t img = (uintptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetnTexImage(tex, level, format, type, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglReadnPixels__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint x, jint y, jint width, jint height, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glReadnPixelsPROC glReadnPixels = (glReadnPixelsPROC)tlsGetFunction(1033);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetnCompressedTexImage(JNIEnv *__env, jclass clazz, jint target, jint level, jint bufSize, jlong imgAddress) {
    glGetnCompressedTexImagePROC glGetnCompressedTexImage = (glGetnCompressedTexImagePROC)tlsGetFunction(1039);
    uintptr_t img = (uintptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetnCompressedTexImage(target, level, bufSize, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetnUniformfv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformfvPROC glGetnUniformfv = (glGetnUniformfvPROC)tlsGetFunction(1040);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformfv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetnUniformdv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformdvPROC glGetnUniformdv = (glGetnUniformdvPROC)tlsGetFunction(1041);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformdv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetnUniformiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformivPROC glGetnUniformiv = (glGetnUniformivPROC)tlsGetFunction(1042);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformiv(program, location, bufSize, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_GL45C_nglGetnUniformuiv__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint bufSize, jlong paramsAddress) {
    glGetnUniformuivPROC glGetnUniformuiv = (glGetnUniformuivPROC)tlsGetFunction(1043);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetnUniformuiv(program, location, bufSize, params);
}

EXTERN_C_EXIT
