/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glCreateTransformFeedbacksPROC) (jint, intptr_t);
typedef void (APIENTRY *glTransformFeedbackBufferBasePROC) (jint, jint, jint);
typedef void (APIENTRY *glTransformFeedbackBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetTransformFeedbackivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTransformFeedbacki_vPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTransformFeedbacki64_vPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCreateBuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glNamedBufferStoragePROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glNamedBufferDataPROC) (jint, intptr_t, intptr_t, jint);
typedef void (APIENTRY *glNamedBufferSubDataPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glCopyNamedBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glClearNamedBufferDataPROC) (jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearNamedBufferSubDataPROC) (jint, jint, intptr_t, intptr_t, jint, jint, intptr_t);
typedef intptr_t (APIENTRY *glMapNamedBufferPROC) (jint, jint);
typedef intptr_t (APIENTRY *glMapNamedBufferRangePROC) (jint, intptr_t, intptr_t, jint);
typedef jboolean (APIENTRY *glUnmapNamedBufferPROC) (jint);
typedef void (APIENTRY *glFlushMappedNamedBufferRangePROC) (jint, intptr_t, intptr_t);
typedef void (APIENTRY *glGetNamedBufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedBufferParameteri64vPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedBufferPointervPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedBufferSubDataPROC) (jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glCreateFramebuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glNamedFramebufferRenderbufferPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexturePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTextureLayerPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferDrawBufferPROC) (jint, jint);
typedef void (APIENTRY *glNamedFramebufferDrawBuffersPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glNamedFramebufferReadBufferPROC) (jint, jint);
typedef void (APIENTRY *glInvalidateNamedFramebufferDataPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glInvalidateNamedFramebufferSubDataPROC) (jint, jint, intptr_t, jint, jint, jint, jint);
typedef void (APIENTRY *glClearNamedFramebufferivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearNamedFramebufferuivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearNamedFramebufferfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glClearNamedFramebufferfiPROC) (jint, jint, jint, jfloat, jint);
typedef void (APIENTRY *glBlitNamedFramebufferPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *glCheckNamedFramebufferStatusPROC) (jint, jint);
typedef void (APIENTRY *glGetNamedFramebufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetNamedFramebufferAttachmentParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCreateRenderbuffersPROC) (jint, intptr_t);
typedef void (APIENTRY *glNamedRenderbufferStoragePROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisamplePROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetNamedRenderbufferParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glCreateTexturesPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTextureBufferPROC) (jint, jint, jint);
typedef void (APIENTRY *glTextureBufferRangePROC) (jint, jint, jint, intptr_t, intptr_t);
typedef void (APIENTRY *glTextureStorage1DPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage2DPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage3DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureStorage2DMultisamplePROC) (jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureStorage3DMultisamplePROC) (jint, jint, jint, jint, jint, jint, jboolean);
typedef void (APIENTRY *glTextureSubImage1DPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTextureSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glTextureSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage1DPROC) (jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCopyTextureSubImage1DPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage2DPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage3DPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureParameterfPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glTextureParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTextureParameteriPROC) (jint, jint, jint);
typedef void (APIENTRY *glTextureParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTextureParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glTextureParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGenerateTextureMipmapPROC) (jint);
typedef void (APIENTRY *glBindTextureUnitPROC) (jint, jint);
typedef void (APIENTRY *glGetTextureImagePROC) (jint, jint, jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetCompressedTextureImagePROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterfvPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterfvPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterIivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterIuivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetTextureParameterivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glCreateVertexArraysPROC) (jint, intptr_t);
typedef void (APIENTRY *glDisableVertexArrayAttribPROC) (jint, jint);
typedef void (APIENTRY *glEnableVertexArrayAttribPROC) (jint, jint);
typedef void (APIENTRY *glVertexArrayElementBufferPROC) (jint, jint);
typedef void (APIENTRY *glVertexArrayVertexBufferPROC) (jint, jint, jint, intptr_t, jint);
typedef void (APIENTRY *glVertexArrayVertexBuffersPROC) (jint, jint, jint, intptr_t, intptr_t, intptr_t);
typedef void (APIENTRY *glVertexArrayAttribFormatPROC) (jint, jint, jint, jint, jboolean, jint);
typedef void (APIENTRY *glVertexArrayAttribIFormatPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayAttribLFormatPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glVertexArrayAttribBindingPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexArrayBindingDivisorPROC) (jint, jint, jint);
typedef void (APIENTRY *glGetVertexArrayivPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexArrayIndexedivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetVertexArrayIndexed64ivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glCreateSamplersPROC) (jint, intptr_t);
typedef void (APIENTRY *glCreateProgramPipelinesPROC) (jint, intptr_t);
typedef void (APIENTRY *glCreateQueriesPROC) (jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryBufferObjecti64vPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryBufferObjectivPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryBufferObjectui64vPROC) (jint, jint, jint, intptr_t);
typedef void (APIENTRY *glGetQueryBufferObjectuivPROC) (jint, jint, jint, intptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateTransformFeedbacks__IJ(JNIEnv *__env, jclass clazz, jint n, jlong idsAddress) {
    glCreateTransformFeedbacksPROC glCreateTransformFeedbacks = (glCreateTransformFeedbacksPROC)tlsGetFunction(923);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glCreateTransformFeedbacks(n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTransformFeedbackBufferBase(JNIEnv *__env, jclass clazz, jint xfb, jint index, jint buffer) {
    glTransformFeedbackBufferBasePROC glTransformFeedbackBufferBase = (glTransformFeedbackBufferBasePROC)tlsGetFunction(924);
    UNUSED_PARAM(clazz)
    glTransformFeedbackBufferBase(xfb, index, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTransformFeedbackBufferRange(JNIEnv *__env, jclass clazz, jint xfb, jint index, jint buffer, jlong offset, jlong size) {
    glTransformFeedbackBufferRangePROC glTransformFeedbackBufferRange = (glTransformFeedbackBufferRangePROC)tlsGetFunction(925);
    UNUSED_PARAM(clazz)
    glTransformFeedbackBufferRange(xfb, index, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTransformFeedbackiv__IIJ(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jlong paramAddress) {
    glGetTransformFeedbackivPROC glGetTransformFeedbackiv = (glGetTransformFeedbackivPROC)tlsGetFunction(926);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbackiv(xfb, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTransformFeedbacki_1v__IIIJ(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jint index, jlong paramAddress) {
    glGetTransformFeedbacki_vPROC glGetTransformFeedbacki_v = (glGetTransformFeedbacki_vPROC)tlsGetFunction(927);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbacki_v(xfb, pname, index, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTransformFeedbacki64_1v__IIIJ(JNIEnv *__env, jclass clazz, jint xfb, jint pname, jint index, jlong paramAddress) {
    glGetTransformFeedbacki64_vPROC glGetTransformFeedbacki64_v = (glGetTransformFeedbacki64_vPROC)tlsGetFunction(928);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetTransformFeedbacki64_v(xfb, pname, index, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateBuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong buffersAddress) {
    glCreateBuffersPROC glCreateBuffers = (glCreateBuffersPROC)tlsGetFunction(929);
    intptr_t buffers = (intptr_t)buffersAddress;
    UNUSED_PARAM(clazz)
    glCreateBuffers(n, buffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglNamedBufferStorage__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint flags) {
    glNamedBufferStoragePROC glNamedBufferStorage = (glNamedBufferStoragePROC)tlsGetFunction(930);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferStorage(buffer, (intptr_t)size, data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglNamedBufferData__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint usage) {
    glNamedBufferDataPROC glNamedBufferData = (glNamedBufferDataPROC)tlsGetFunction(931);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferData(buffer, (intptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglNamedBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glNamedBufferSubDataPROC glNamedBufferSubData = (glNamedBufferSubDataPROC)tlsGetFunction(932);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferSubData(buffer, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glCopyNamedBufferSubData(JNIEnv *__env, jclass clazz, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size) {
    glCopyNamedBufferSubDataPROC glCopyNamedBufferSubData = (glCopyNamedBufferSubDataPROC)tlsGetFunction(933);
    UNUSED_PARAM(clazz)
    glCopyNamedBufferSubData(readBuffer, writeBuffer, (intptr_t)readOffset, (intptr_t)writeOffset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglClearNamedBufferData__IIIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferDataPROC glClearNamedBufferData = (glClearNamedBufferDataPROC)tlsGetFunction(934);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferData(buffer, internalformat, format, type, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglClearNamedBufferSubData__IIJJIIJ(JNIEnv *__env, jclass clazz, jint buffer, jint internalformat, jlong offset, jlong size, jint format, jint type, jlong dataAddress) {
    glClearNamedBufferSubDataPROC glClearNamedBufferSubData = (glClearNamedBufferSubDataPROC)tlsGetFunction(935);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glClearNamedBufferSubData(buffer, internalformat, (intptr_t)offset, (intptr_t)size, format, type, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglMapNamedBuffer(JNIEnv *__env, jclass clazz, jint buffer, jint access) {
    glMapNamedBufferPROC glMapNamedBuffer = (glMapNamedBufferPROC)tlsGetFunction(936);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBuffer(buffer, access);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglMapNamedBufferRange(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jint access) {
    glMapNamedBufferRangePROC glMapNamedBufferRange = (glMapNamedBufferRangePROC)tlsGetFunction(937);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBufferRange(buffer, (intptr_t)offset, (intptr_t)length, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glUnmapNamedBuffer(JNIEnv *__env, jclass clazz, jint buffer) {
    glUnmapNamedBufferPROC glUnmapNamedBuffer = (glUnmapNamedBufferPROC)tlsGetFunction(938);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapNamedBuffer(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glFlushMappedNamedBufferRange(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length) {
    glFlushMappedNamedBufferRangePROC glFlushMappedNamedBufferRange = (glFlushMappedNamedBufferRangePROC)tlsGetFunction(939);
    UNUSED_PARAM(clazz)
    glFlushMappedNamedBufferRange(buffer, (intptr_t)offset, (intptr_t)length);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedBufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameterivPROC glGetNamedBufferParameteriv = (glGetNamedBufferParameterivPROC)tlsGetFunction(940);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameteriv(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedBufferParameteri64v__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameteri64vPROC glGetNamedBufferParameteri64v = (glGetNamedBufferParameteri64vPROC)tlsGetFunction(941);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameteri64v(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedBufferPointerv(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferPointervPROC glGetNamedBufferPointerv = (glGetNamedBufferPointervPROC)tlsGetFunction(942);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferPointerv(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedBufferSubData__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glGetNamedBufferSubDataPROC glGetNamedBufferSubData = (glGetNamedBufferSubDataPROC)tlsGetFunction(943);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferSubData(buffer, (intptr_t)offset, (intptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateFramebuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong framebuffersAddress) {
    glCreateFramebuffersPROC glCreateFramebuffers = (glCreateFramebuffersPROC)tlsGetFunction(944);
    intptr_t framebuffers = (intptr_t)framebuffersAddress;
    UNUSED_PARAM(clazz)
    glCreateFramebuffers(n, framebuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedFramebufferRenderbuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glNamedFramebufferRenderbufferPROC glNamedFramebufferRenderbuffer = (glNamedFramebufferRenderbufferPROC)tlsGetFunction(945);
    UNUSED_PARAM(clazz)
    glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedFramebufferParameteri(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jint param) {
    glNamedFramebufferParameteriPROC glNamedFramebufferParameteri = (glNamedFramebufferParameteriPROC)tlsGetFunction(946);
    UNUSED_PARAM(clazz)
    glNamedFramebufferParameteri(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedFramebufferTexture(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level) {
    glNamedFramebufferTexturePROC glNamedFramebufferTexture = (glNamedFramebufferTexturePROC)tlsGetFunction(947);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture(framebuffer, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedFramebufferTextureLayer(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint layer) {
    glNamedFramebufferTextureLayerPROC glNamedFramebufferTextureLayer = (glNamedFramebufferTextureLayerPROC)tlsGetFunction(948);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedFramebufferDrawBuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint buf) {
    glNamedFramebufferDrawBufferPROC glNamedFramebufferDrawBuffer = (glNamedFramebufferDrawBufferPROC)tlsGetFunction(949);
    UNUSED_PARAM(clazz)
    glNamedFramebufferDrawBuffer(framebuffer, buf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglNamedFramebufferDrawBuffers__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint n, jlong bufsAddress) {
    glNamedFramebufferDrawBuffersPROC glNamedFramebufferDrawBuffers = (glNamedFramebufferDrawBuffersPROC)tlsGetFunction(950);
    intptr_t bufs = (intptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glNamedFramebufferDrawBuffers(framebuffer, n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedFramebufferReadBuffer(JNIEnv *__env, jclass clazz, jint framebuffer, jint src) {
    glNamedFramebufferReadBufferPROC glNamedFramebufferReadBuffer = (glNamedFramebufferReadBufferPROC)tlsGetFunction(951);
    UNUSED_PARAM(clazz)
    glNamedFramebufferReadBuffer(framebuffer, src);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglInvalidateNamedFramebufferData__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint numAttachments, jlong attachmentsAddress) {
    glInvalidateNamedFramebufferDataPROC glInvalidateNamedFramebufferData = (glInvalidateNamedFramebufferDataPROC)tlsGetFunction(952);
    intptr_t attachments = (intptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglInvalidateNamedFramebufferSubData__IIJIIII(JNIEnv *__env, jclass clazz, jint framebuffer, jint numAttachments, jlong attachmentsAddress, jint x, jint y, jint width, jint height) {
    glInvalidateNamedFramebufferSubDataPROC glInvalidateNamedFramebufferSubData = (glInvalidateNamedFramebufferSubDataPROC)tlsGetFunction(953);
    intptr_t attachments = (intptr_t)attachmentsAddress;
    UNUSED_PARAM(clazz)
    glInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglClearNamedFramebufferiv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearNamedFramebufferivPROC glClearNamedFramebufferiv = (glClearNamedFramebufferivPROC)tlsGetFunction(954);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglClearNamedFramebufferuiv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearNamedFramebufferuivPROC glClearNamedFramebufferuiv = (glClearNamedFramebufferuivPROC)tlsGetFunction(955);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglClearNamedFramebufferfv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jlong valueAddress) {
    glClearNamedFramebufferfvPROC glClearNamedFramebufferfv = (glClearNamedFramebufferfvPROC)tlsGetFunction(956);
    intptr_t value = (intptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glClearNamedFramebufferfi(JNIEnv *__env, jclass clazz, jint framebuffer, jint buffer, jint drawbuffer, jfloat depth, jint stencil) {
    glClearNamedFramebufferfiPROC glClearNamedFramebufferfi = (glClearNamedFramebufferfiPROC)tlsGetFunction(957);
    UNUSED_PARAM(clazz)
    glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glBlitNamedFramebuffer(JNIEnv *__env, jclass clazz, jint readFramebuffer, jint drawFramebuffer, jint srcX0, jint srcY0, jint srcX1, jint srcY1, jint dstX0, jint dstY0, jint dstX1, jint dstY1, jint mask, jint filter) {
    glBlitNamedFramebufferPROC glBlitNamedFramebuffer = (glBlitNamedFramebufferPROC)tlsGetFunction(958);
    UNUSED_PARAM(clazz)
    glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glCheckNamedFramebufferStatus(JNIEnv *__env, jclass clazz, jint framebuffer, jint target) {
    glCheckNamedFramebufferStatusPROC glCheckNamedFramebufferStatus = (glCheckNamedFramebufferStatusPROC)tlsGetFunction(959);
    UNUSED_PARAM(clazz)
    return (jint)glCheckNamedFramebufferStatus(framebuffer, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedFramebufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferParameterivPROC glGetNamedFramebufferParameteriv = (glGetNamedFramebufferParameterivPROC)tlsGetFunction(960);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferParameteriv(framebuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedFramebufferAttachmentParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferAttachmentParameterivPROC glGetNamedFramebufferAttachmentParameteriv = (glGetNamedFramebufferAttachmentParameterivPROC)tlsGetFunction(961);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateRenderbuffers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong renderbuffersAddress) {
    glCreateRenderbuffersPROC glCreateRenderbuffers = (glCreateRenderbuffersPROC)tlsGetFunction(962);
    intptr_t renderbuffers = (intptr_t)renderbuffersAddress;
    UNUSED_PARAM(clazz)
    glCreateRenderbuffers(n, renderbuffers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedRenderbufferStorage(JNIEnv *__env, jclass clazz, jint renderbuffer, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStoragePROC glNamedRenderbufferStorage = (glNamedRenderbufferStoragePROC)tlsGetFunction(963);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glNamedRenderbufferStorageMultisample(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisamplePROC glNamedRenderbufferStorageMultisample = (glNamedRenderbufferStorageMultisamplePROC)tlsGetFunction(964);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetNamedRenderbufferParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint renderbuffer, jint pname, jlong paramsAddress) {
    glGetNamedRenderbufferParameterivPROC glGetNamedRenderbufferParameteriv = (glGetNamedRenderbufferParameterivPROC)tlsGetFunction(965);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateTextures__IIJ(JNIEnv *__env, jclass clazz, jint target, jint n, jlong texturesAddress) {
    glCreateTexturesPROC glCreateTextures = (glCreateTexturesPROC)tlsGetFunction(966);
    intptr_t textures = (intptr_t)texturesAddress;
    UNUSED_PARAM(clazz)
    glCreateTextures(target, n, textures);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureBuffer(JNIEnv *__env, jclass clazz, jint texture, jint internalformat, jint buffer) {
    glTextureBufferPROC glTextureBuffer = (glTextureBufferPROC)tlsGetFunction(967);
    UNUSED_PARAM(clazz)
    glTextureBuffer(texture, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureBufferRange(JNIEnv *__env, jclass clazz, jint texture, jint internalformat, jint buffer, jlong offset, jlong size) {
    glTextureBufferRangePROC glTextureBufferRange = (glTextureBufferRangePROC)tlsGetFunction(968);
    UNUSED_PARAM(clazz)
    glTextureBufferRange(texture, internalformat, buffer, (intptr_t)offset, (intptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureStorage1D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width) {
    glTextureStorage1DPROC glTextureStorage1D = (glTextureStorage1DPROC)tlsGetFunction(969);
    UNUSED_PARAM(clazz)
    glTextureStorage1D(texture, levels, internalformat, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureStorage2D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jint height) {
    glTextureStorage2DPROC glTextureStorage2D = (glTextureStorage2DPROC)tlsGetFunction(970);
    UNUSED_PARAM(clazz)
    glTextureStorage2D(texture, levels, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureStorage3D(JNIEnv *__env, jclass clazz, jint texture, jint levels, jint internalformat, jint width, jint height, jint depth) {
    glTextureStorage3DPROC glTextureStorage3D = (glTextureStorage3DPROC)tlsGetFunction(971);
    UNUSED_PARAM(clazz)
    glTextureStorage3D(texture, levels, internalformat, width, height, depth);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureStorage2DMultisample(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalformat, jint width, jint height, jboolean fixedsamplelocations) {
    glTextureStorage2DMultisamplePROC glTextureStorage2DMultisample = (glTextureStorage2DMultisamplePROC)tlsGetFunction(972);
    UNUSED_PARAM(clazz)
    glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureStorage3DMultisample(JNIEnv *__env, jclass clazz, jint texture, jint samples, jint internalformat, jint width, jint height, jint depth, jboolean fixedsamplelocations) {
    glTextureStorage3DMultisamplePROC glTextureStorage3DMultisample = (glTextureStorage3DMultisamplePROC)tlsGetFunction(973);
    UNUSED_PARAM(clazz)
    glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureSubImage1D__IIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage1DPROC glTextureSubImage1D = (glTextureSubImage1DPROC)tlsGetFunction(974);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureSubImage2D__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage2DPROC glTextureSubImage2D = (glTextureSubImage2DPROC)tlsGetFunction(975);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureSubImage3D__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage3DPROC glTextureSubImage3D = (glTextureSubImage3DPROC)tlsGetFunction(976);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCompressedTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage1DPROC glCompressedTextureSubImage1D = (glCompressedTextureSubImage1DPROC)tlsGetFunction(977);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCompressedTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage2DPROC glCompressedTextureSubImage2D = (glCompressedTextureSubImage2DPROC)tlsGetFunction(978);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCompressedTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage3DPROC glCompressedTextureSubImage3D = (glCompressedTextureSubImage3DPROC)tlsGetFunction(979);
    intptr_t data = (intptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glCopyTextureSubImage1D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyTextureSubImage1DPROC glCopyTextureSubImage1D = (glCopyTextureSubImage1DPROC)tlsGetFunction(980);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glCopyTextureSubImage2D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage2DPROC glCopyTextureSubImage2D = (glCopyTextureSubImage2DPROC)tlsGetFunction(981);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glCopyTextureSubImage3D(JNIEnv *__env, jclass clazz, jint texture, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage3DPROC glCopyTextureSubImage3D = (glCopyTextureSubImage3DPROC)tlsGetFunction(982);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureParameterf(JNIEnv *__env, jclass clazz, jint texture, jint pname, jfloat param) {
    glTextureParameterfPROC glTextureParameterf = (glTextureParameterfPROC)tlsGetFunction(983);
    UNUSED_PARAM(clazz)
    glTextureParameterf(texture, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterfvPROC glTextureParameterfv = (glTextureParameterfvPROC)tlsGetFunction(984);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterfv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glTextureParameteri(JNIEnv *__env, jclass clazz, jint texture, jint pname, jint param) {
    glTextureParameteriPROC glTextureParameteri = (glTextureParameteriPROC)tlsGetFunction(985);
    UNUSED_PARAM(clazz)
    glTextureParameteri(texture, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterIivPROC glTextureParameterIiv = (glTextureParameterIivPROC)tlsGetFunction(986);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterIuivPROC glTextureParameterIuiv = (glTextureParameterIuivPROC)tlsGetFunction(987);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIuiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglTextureParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glTextureParameterivPROC glTextureParameteriv = (glTextureParameterivPROC)tlsGetFunction(988);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameteriv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glGenerateTextureMipmap(JNIEnv *__env, jclass clazz, jint texture) {
    glGenerateTextureMipmapPROC glGenerateTextureMipmap = (glGenerateTextureMipmapPROC)tlsGetFunction(989);
    UNUSED_PARAM(clazz)
    glGenerateTextureMipmap(texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glBindTextureUnit(JNIEnv *__env, jclass clazz, jint unit, jint texture) {
    glBindTextureUnitPROC glBindTextureUnit = (glBindTextureUnitPROC)tlsGetFunction(990);
    UNUSED_PARAM(clazz)
    glBindTextureUnit(unit, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureImage__IIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint format, jint type, jint bufSize, jlong pixelsAddress) {
    glGetTextureImagePROC glGetTextureImage = (glGetTextureImagePROC)tlsGetFunction(991);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureImage(texture, level, format, type, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetCompressedTextureImage(JNIEnv *__env, jclass clazz, jint texture, jint level, jint bufSize, jlong pixelsAddress) {
    glGetCompressedTextureImagePROC glGetCompressedTextureImage = (glGetCompressedTextureImagePROC)tlsGetFunction(992);
    intptr_t pixels = (intptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTextureImage(texture, level, bufSize, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureLevelParameterfv__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterfvPROC glGetTextureLevelParameterfv = (glGetTextureLevelParameterfvPROC)tlsGetFunction(993);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameterfv(texture, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureLevelParameteriv__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterivPROC glGetTextureLevelParameteriv = (glGetTextureLevelParameterivPROC)tlsGetFunction(994);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameteriv(texture, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureParameterfv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterfvPROC glGetTextureParameterfv = (glGetTextureParameterfvPROC)tlsGetFunction(995);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterfv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureParameterIiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterIivPROC glGetTextureParameterIiv = (glGetTextureParameterIivPROC)tlsGetFunction(996);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureParameterIuiv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterIuivPROC glGetTextureParameterIuiv = (glGetTextureParameterIuivPROC)tlsGetFunction(997);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIuiv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetTextureParameteriv__IIJ(JNIEnv *__env, jclass clazz, jint texture, jint pname, jlong paramsAddress) {
    glGetTextureParameterivPROC glGetTextureParameteriv = (glGetTextureParameterivPROC)tlsGetFunction(998);
    intptr_t params = (intptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameteriv(texture, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateVertexArrays__IJ(JNIEnv *__env, jclass clazz, jint n, jlong arraysAddress) {
    glCreateVertexArraysPROC glCreateVertexArrays = (glCreateVertexArraysPROC)tlsGetFunction(999);
    intptr_t arrays = (intptr_t)arraysAddress;
    UNUSED_PARAM(clazz)
    glCreateVertexArrays(n, arrays);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glDisableVertexArrayAttrib(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glDisableVertexArrayAttribPROC glDisableVertexArrayAttrib = (glDisableVertexArrayAttribPROC)tlsGetFunction(1000);
    UNUSED_PARAM(clazz)
    glDisableVertexArrayAttrib(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glEnableVertexArrayAttrib(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glEnableVertexArrayAttribPROC glEnableVertexArrayAttrib = (glEnableVertexArrayAttribPROC)tlsGetFunction(1001);
    UNUSED_PARAM(clazz)
    glEnableVertexArrayAttrib(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayElementBuffer(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer) {
    glVertexArrayElementBufferPROC glVertexArrayElementBuffer = (glVertexArrayElementBufferPROC)tlsGetFunction(1002);
    UNUSED_PARAM(clazz)
    glVertexArrayElementBuffer(vaobj, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayVertexBuffer(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint buffer, jlong offset, jint stride) {
    glVertexArrayVertexBufferPROC glVertexArrayVertexBuffer = (glVertexArrayVertexBufferPROC)tlsGetFunction(1003);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, (intptr_t)offset, stride);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglVertexArrayVertexBuffers__IIIJJJ(JNIEnv *__env, jclass clazz, jint vaobj, jint first, jint count, jlong buffersAddress, jlong offsetsAddress, jlong stridesAddress) {
    glVertexArrayVertexBuffersPROC glVertexArrayVertexBuffers = (glVertexArrayVertexBuffersPROC)tlsGetFunction(1004);
    intptr_t buffers = (intptr_t)buffersAddress;
    intptr_t offsets = (intptr_t)offsetsAddress;
    intptr_t strides = (intptr_t)stridesAddress;
    UNUSED_PARAM(clazz)
    glVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayAttribFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jboolean normalized, jint relativeoffset) {
    glVertexArrayAttribFormatPROC glVertexArrayAttribFormat = (glVertexArrayAttribFormatPROC)tlsGetFunction(1005);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayAttribIFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexArrayAttribIFormatPROC glVertexArrayAttribIFormat = (glVertexArrayAttribIFormatPROC)tlsGetFunction(1006);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayAttribLFormat(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint size, jint type, jint relativeoffset) {
    glVertexArrayAttribLFormatPROC glVertexArrayAttribLFormat = (glVertexArrayAttribLFormatPROC)tlsGetFunction(1007);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayAttribBinding(JNIEnv *__env, jclass clazz, jint vaobj, jint attribindex, jint bindingindex) {
    glVertexArrayAttribBindingPROC glVertexArrayAttribBinding = (glVertexArrayAttribBindingPROC)tlsGetFunction(1008);
    UNUSED_PARAM(clazz)
    glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glVertexArrayBindingDivisor(JNIEnv *__env, jclass clazz, jint vaobj, jint bindingindex, jint divisor) {
    glVertexArrayBindingDivisorPROC glVertexArrayBindingDivisor = (glVertexArrayBindingDivisorPROC)tlsGetFunction(1009);
    UNUSED_PARAM(clazz)
    glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetVertexArrayiv__IIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress) {
    glGetVertexArrayivPROC glGetVertexArrayiv = (glGetVertexArrayivPROC)tlsGetFunction(1010);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayiv(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetVertexArrayIndexediv__IIIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayIndexedivPROC glGetVertexArrayIndexediv = (glGetVertexArrayIndexedivPROC)tlsGetFunction(1011);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIndexediv(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglGetVertexArrayIndexed64iv__IIIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayIndexed64ivPROC glGetVertexArrayIndexed64iv = (glGetVertexArrayIndexed64ivPROC)tlsGetFunction(1012);
    intptr_t param = (intptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateSamplers__IJ(JNIEnv *__env, jclass clazz, jint n, jlong samplersAddress) {
    glCreateSamplersPROC glCreateSamplers = (glCreateSamplersPROC)tlsGetFunction(1013);
    intptr_t samplers = (intptr_t)samplersAddress;
    UNUSED_PARAM(clazz)
    glCreateSamplers(n, samplers);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateProgramPipelines__IJ(JNIEnv *__env, jclass clazz, jint n, jlong pipelinesAddress) {
    glCreateProgramPipelinesPROC glCreateProgramPipelines = (glCreateProgramPipelinesPROC)tlsGetFunction(1014);
    intptr_t pipelines = (intptr_t)pipelinesAddress;
    UNUSED_PARAM(clazz)
    glCreateProgramPipelines(n, pipelines);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_nglCreateQueries__IIJ(JNIEnv *__env, jclass clazz, jint target, jint n, jlong idsAddress) {
    glCreateQueriesPROC glCreateQueries = (glCreateQueriesPROC)tlsGetFunction(1015);
    intptr_t ids = (intptr_t)idsAddress;
    UNUSED_PARAM(clazz)
    glCreateQueries(target, n, ids);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glGetQueryBufferObjecti64v(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjecti64vPROC glGetQueryBufferObjecti64v = (glGetQueryBufferObjecti64vPROC)tlsGetFunction(1018);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjecti64v(id, buffer, pname, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glGetQueryBufferObjectiv(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjectivPROC glGetQueryBufferObjectiv = (glGetQueryBufferObjectivPROC)tlsGetFunction(1016);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjectiv(id, buffer, pname, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glGetQueryBufferObjectui64v(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjectui64vPROC glGetQueryBufferObjectui64v = (glGetQueryBufferObjectui64vPROC)tlsGetFunction(1019);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjectui64v(id, buffer, pname, (intptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_ARBDirectStateAccess_glGetQueryBufferObjectuiv(JNIEnv *__env, jclass clazz, jint id, jint buffer, jint pname, jlong offset) {
    glGetQueryBufferObjectuivPROC glGetQueryBufferObjectuiv = (glGetQueryBufferObjectuivPROC)tlsGetFunction(1017);
    UNUSED_PARAM(clazz)
    glGetQueryBufferObjectuiv(id, buffer, pname, (intptr_t)offset);
}

EXTERN_C_EXIT
