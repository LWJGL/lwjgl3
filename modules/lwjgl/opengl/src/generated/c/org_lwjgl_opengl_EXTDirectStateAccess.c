/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "opengl.h"

typedef void (APIENTRY *glClientAttribDefaultEXTPROC) (jint);
typedef void (APIENTRY *glPushClientAttribDefaultEXTPROC) (jint);
typedef void (APIENTRY *glMatrixLoadfEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixLoaddEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMultfEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMultdEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixLoadIdentityEXTPROC) (jint);
typedef void (APIENTRY *glMatrixRotatefEXTPROC) (jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMatrixRotatedEXTPROC) (jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixScalefEXTPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMatrixScaledEXTPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixTranslatefEXTPROC) (jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glMatrixTranslatedEXTPROC) (jint, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixOrthoEXTPROC) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixFrustumEXTPROC) (jint, jdouble, jdouble, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glMatrixPushEXTPROC) (jint);
typedef void (APIENTRY *glMatrixPopEXTPROC) (jint);
typedef void (APIENTRY *glTextureParameteriEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTextureParameterivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureParameterfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glTextureParameterfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyTextureImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyTextureSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetTextureImageEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterfvEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureLevelParameterivEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyTextureSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glBindMultiTextureEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexCoordPointerEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexEnvfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glMultiTexEnvfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexEnviEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexEnvivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexGendEXTPROC) (jint, jint, jint, jdouble);
typedef void (APIENTRY *glMultiTexGendvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexGenfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glMultiTexGenfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexGeniEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexGenivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexEnvfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexEnvivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexGendvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexGenfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexGenivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexParameteriEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexParameterivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexParameterfEXTPROC) (jint, jint, jint, jfloat);
typedef void (APIENTRY *glMultiTexParameterfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyMultiTexImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyMultiTexImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyMultiTexSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glCopyMultiTexSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glGetMultiTexImageEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexParameterfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexParameterivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexLevelParameterfvEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexLevelParameterivEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCopyMultiTexSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glEnableClientStateIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableClientStateIndexedEXTPROC) (jint, jint);
typedef void (APIENTRY *glEnableClientStateiEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableClientStateiEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetFloatIndexedvEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetDoubleIndexedvEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPointerIndexedvEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetFloati_vEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetDoublei_vEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetPointeri_vEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramStringEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameter4dEXTPROC) (jint, jint, jint, jdouble, jdouble, jdouble, jdouble);
typedef void (APIENTRY *glNamedProgramLocalParameter4dvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameter4fEXTPROC) (jint, jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glNamedProgramLocalParameter4fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterdvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterfvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedProgramivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedProgramStringEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedTextureSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetCompressedTextureImageEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedMultiTexImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedMultiTexImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedMultiTexImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedMultiTexSubImage3DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedMultiTexSubImage2DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glCompressedMultiTexSubImage1DEXTPROC) (jint, jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetCompressedMultiTexImageEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMatrixLoadTransposefEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixLoadTransposedEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMultTransposefEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glMatrixMultTransposedEXTPROC) (jint, uintptr_t);
typedef void (APIENTRY *glNamedBufferDataEXTPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glNamedBufferSubDataEXTPROC) (jint, uintptr_t, uintptr_t, uintptr_t);
typedef uintptr_t (APIENTRY *glMapNamedBufferEXTPROC) (jint, jint);
typedef jboolean (APIENTRY *glUnmapNamedBufferEXTPROC) (jint);
typedef void (APIENTRY *glGetNamedBufferParameterivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedBufferSubDataEXTPROC) (jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glProgramUniform1fEXTPROC) (jint, jint, jfloat);
typedef void (APIENTRY *glProgramUniform2fEXTPROC) (jint, jint, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform3fEXTPROC) (jint, jint, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform4fEXTPROC) (jint, jint, jfloat, jfloat, jfloat, jfloat);
typedef void (APIENTRY *glProgramUniform1iEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2iEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3iEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4iEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4fvEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform1ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x3fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x2fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix2x4fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x2fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix3x4fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glProgramUniformMatrix4x3fvEXTPROC) (jint, jint, jint, jboolean, uintptr_t);
typedef void (APIENTRY *glTextureBufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glMultiTexBufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glTextureParameterIivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glTextureParameterIuivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterIivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetTextureParameterIuivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexParameterIivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glMultiTexParameterIuivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexParameterIivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetMultiTexParameterIuivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform1uiEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glProgramUniform2uiEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform3uiEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform4uiEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glProgramUniform1uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform2uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform3uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glProgramUniform4uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameters4fvEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameterI4iEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedProgramLocalParameterI4ivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParametersI4ivEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParameterI4uiEXTPROC) (jint, jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedProgramLocalParameterI4uivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedProgramLocalParametersI4uivEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterIivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetNamedProgramLocalParameterIuivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedRenderbufferStorageEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetNamedRenderbufferParameterivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedRenderbufferStorageMultisampleCoverageEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef jint (APIENTRY *glCheckNamedFramebufferStatusEXTPROC) (jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexture1DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexture2DEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTexture3DEXTPROC) (jint, jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferRenderbufferEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glGetNamedFramebufferAttachmentParameterivEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGenerateTextureMipmapEXTPROC) (jint, jint);
typedef void (APIENTRY *glGenerateMultiTexMipmapEXTPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferDrawBufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glFramebufferDrawBuffersEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glFramebufferReadBufferEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetFramebufferParameterivEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glNamedCopyBufferSubDataEXTPROC) (jint, jint, uintptr_t, uintptr_t, uintptr_t);
typedef void (APIENTRY *glNamedFramebufferTextureEXTPROC) (jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTextureLayerEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glNamedFramebufferTextureFaceEXTPROC) (jint, jint, jint, jint, jint);
typedef void (APIENTRY *glTextureRenderbufferEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glMultiTexRenderbufferEXTPROC) (jint, jint, jint);
typedef void (APIENTRY *glVertexArrayVertexOffsetEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayColorOffsetEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayEdgeFlagOffsetEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayIndexOffsetEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayNormalOffsetEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayTexCoordOffsetEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayMultiTexCoordOffsetEXTPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayFogCoordOffsetEXTPROC) (jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArraySecondaryColorOffsetEXTPROC) (jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayVertexAttribOffsetEXTPROC) (jint, jint, jint, jint, jint, jboolean, jint, uintptr_t);
typedef void (APIENTRY *glVertexArrayVertexAttribIOffsetEXTPROC) (jint, jint, jint, jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glEnableVertexArrayEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableVertexArrayEXTPROC) (jint, jint);
typedef void (APIENTRY *glEnableVertexArrayAttribEXTPROC) (jint, jint);
typedef void (APIENTRY *glDisableVertexArrayAttribEXTPROC) (jint, jint);
typedef void (APIENTRY *glGetVertexArrayIntegervEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetVertexArrayPointervEXTPROC) (jint, jint, uintptr_t);
typedef void (APIENTRY *glGetVertexArrayIntegeri_vEXTPROC) (jint, jint, jint, uintptr_t);
typedef void (APIENTRY *glGetVertexArrayPointeri_vEXTPROC) (jint, jint, jint, uintptr_t);
typedef uintptr_t (APIENTRY *glMapNamedBufferRangeEXTPROC) (jint, uintptr_t, uintptr_t, jint);
typedef void (APIENTRY *glFlushMappedNamedBufferRangeEXTPROC) (jint, uintptr_t, uintptr_t);

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glClientAttribDefaultEXT(JNIEnv *__env, jclass clazz, jint mask) {
    glClientAttribDefaultEXTPROC glClientAttribDefaultEXT = (glClientAttribDefaultEXTPROC)tlsGetFunction(1508);
    UNUSED_PARAM(clazz)
    glClientAttribDefaultEXT(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glPushClientAttribDefaultEXT(JNIEnv *__env, jclass clazz, jint mask) {
    glPushClientAttribDefaultEXTPROC glPushClientAttribDefaultEXT = (glPushClientAttribDefaultEXTPROC)tlsGetFunction(1509);
    UNUSED_PARAM(clazz)
    glPushClientAttribDefaultEXT(mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadfEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadfEXTPROC glMatrixLoadfEXT = (glMatrixLoadfEXTPROC)tlsGetFunction(1510);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadfEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoaddEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoaddEXTPROC glMatrixLoaddEXT = (glMatrixLoaddEXTPROC)tlsGetFunction(1511);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoaddEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultfEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultfEXTPROC glMatrixMultfEXT = (glMatrixMultfEXTPROC)tlsGetFunction(1512);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultfEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultdEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultdEXTPROC glMatrixMultdEXT = (glMatrixMultdEXTPROC)tlsGetFunction(1513);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultdEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixLoadIdentityEXT(JNIEnv *__env, jclass clazz, jint matrixMode) {
    glMatrixLoadIdentityEXTPROC glMatrixLoadIdentityEXT = (glMatrixLoadIdentityEXTPROC)tlsGetFunction(1514);
    UNUSED_PARAM(clazz)
    glMatrixLoadIdentityEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixRotatefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat angle, jfloat x, jfloat y, jfloat z) {
    glMatrixRotatefEXTPROC glMatrixRotatefEXT = (glMatrixRotatefEXTPROC)tlsGetFunction(1515);
    UNUSED_PARAM(clazz)
    glMatrixRotatefEXT(matrixMode, angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixRotatedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble angle, jdouble x, jdouble y, jdouble z) {
    glMatrixRotatedEXTPROC glMatrixRotatedEXT = (glMatrixRotatedEXTPROC)tlsGetFunction(1516);
    UNUSED_PARAM(clazz)
    glMatrixRotatedEXT(matrixMode, angle, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixScalefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat x, jfloat y, jfloat z) {
    glMatrixScalefEXTPROC glMatrixScalefEXT = (glMatrixScalefEXTPROC)tlsGetFunction(1517);
    UNUSED_PARAM(clazz)
    glMatrixScalefEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixScaledEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble x, jdouble y, jdouble z) {
    glMatrixScaledEXTPROC glMatrixScaledEXT = (glMatrixScaledEXTPROC)tlsGetFunction(1518);
    UNUSED_PARAM(clazz)
    glMatrixScaledEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixTranslatefEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jfloat x, jfloat y, jfloat z) {
    glMatrixTranslatefEXTPROC glMatrixTranslatefEXT = (glMatrixTranslatefEXTPROC)tlsGetFunction(1519);
    UNUSED_PARAM(clazz)
    glMatrixTranslatefEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixTranslatedEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble x, jdouble y, jdouble z) {
    glMatrixTranslatedEXTPROC glMatrixTranslatedEXT = (glMatrixTranslatedEXTPROC)tlsGetFunction(1520);
    UNUSED_PARAM(clazz)
    glMatrixTranslatedEXT(matrixMode, x, y, z);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixOrthoEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glMatrixOrthoEXTPROC glMatrixOrthoEXT = (glMatrixOrthoEXTPROC)tlsGetFunction(1521);
    UNUSED_PARAM(clazz)
    glMatrixOrthoEXT(matrixMode, l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixFrustumEXT(JNIEnv *__env, jclass clazz, jint matrixMode, jdouble l, jdouble r, jdouble b, jdouble t, jdouble n, jdouble f) {
    glMatrixFrustumEXTPROC glMatrixFrustumEXT = (glMatrixFrustumEXTPROC)tlsGetFunction(1522);
    UNUSED_PARAM(clazz)
    glMatrixFrustumEXT(matrixMode, l, r, b, t, n, f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixPushEXT(JNIEnv *__env, jclass clazz, jint matrixMode) {
    glMatrixPushEXTPROC glMatrixPushEXT = (glMatrixPushEXTPROC)tlsGetFunction(1523);
    UNUSED_PARAM(clazz)
    glMatrixPushEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMatrixPopEXT(JNIEnv *__env, jclass clazz, jint matrixMode) {
    glMatrixPopEXTPROC glMatrixPopEXT = (glMatrixPopEXTPROC)tlsGetFunction(1524);
    UNUSED_PARAM(clazz)
    glMatrixPopEXT(matrixMode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureParameteriEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jint param) {
    glTextureParameteriEXTPROC glTextureParameteriEXT = (glTextureParameteriEXTPROC)tlsGetFunction(1525);
    UNUSED_PARAM(clazz)
    glTextureParameteriEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramAddress) {
    glTextureParameterivEXTPROC glTextureParameterivEXT = (glTextureParameterivEXTPROC)tlsGetFunction(1526);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterivEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureParameterfEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jfloat param) {
    glTextureParameterfEXTPROC glTextureParameterfEXT = (glTextureParameterfEXTPROC)tlsGetFunction(1527);
    UNUSED_PARAM(clazz)
    glTextureParameterfEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramAddress) {
    glTextureParameterfvEXTPROC glTextureParameterfvEXT = (glTextureParameterfvEXTPROC)tlsGetFunction(1528);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterfvEXT(texture, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage1DEXT__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress) {
    glTextureImage1DEXTPROC glTextureImage1DEXT = (glTextureImage1DEXTPROC)tlsGetFunction(1529);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureImage1DEXT(texture, target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glTextureImage2DEXTPROC glTextureImage2DEXT = (glTextureImage2DEXTPROC)tlsGetFunction(1530);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureImage2DEXT(texture, target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage1DEXT__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage1DEXTPROC glTextureSubImage1DEXT = (glTextureSubImage1DEXTPROC)tlsGetFunction(1531);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage1DEXT(texture, target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage2DEXTPROC glTextureSubImage2DEXT = (glTextureSubImage2DEXTPROC)tlsGetFunction(1532);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {
    glCopyTextureImage1DEXTPROC glCopyTextureImage1DEXT = (glCopyTextureImage1DEXTPROC)tlsGetFunction(1533);
    UNUSED_PARAM(clazz)
    glCopyTextureImage1DEXT(texture, target, level, internalformat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
    glCopyTextureImage2DEXTPROC glCopyTextureImage2DEXT = (glCopyTextureImage2DEXTPROC)tlsGetFunction(1534);
    UNUSED_PARAM(clazz)
    glCopyTextureImage2DEXT(texture, target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyTextureSubImage1DEXTPROC glCopyTextureSubImage1DEXT = (glCopyTextureSubImage1DEXTPROC)tlsGetFunction(1535);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage1DEXT(texture, target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage2DEXTPROC glCopyTextureSubImage2DEXT = (glCopyTextureSubImage2DEXTPROC)tlsGetFunction(1536);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureImageEXT__IIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint format, jint type, jlong pixelsAddress) {
    glGetTextureImageEXTPROC glGetTextureImageEXT = (glGetTextureImageEXTPROC)tlsGetFunction(1537);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureImageEXT(texture, target, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterfvEXTPROC glGetTextureParameterfvEXT = (glGetTextureParameterfvEXTPROC)tlsGetFunction(1538);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterfvEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterivEXTPROC glGetTextureParameterivEXT = (glGetTextureParameterivEXTPROC)tlsGetFunction(1539);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureLevelParameterfvEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterfvEXTPROC glGetTextureLevelParameterfvEXT = (glGetTextureLevelParameterfvEXTPROC)tlsGetFunction(1540);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameterfvEXT(texture, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureLevelParameterivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetTextureLevelParameterivEXTPROC glGetTextureLevelParameterivEXT = (glGetTextureLevelParameterivEXTPROC)tlsGetFunction(1541);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureLevelParameterivEXT(texture, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureImage3DEXT__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glTextureImage3DEXTPROC glTextureImage3DEXT = (glTextureImage3DEXTPROC)tlsGetFunction(1542);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureSubImage3DEXT__IIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glTextureSubImage3DEXTPROC glTextureSubImage3DEXT = (glTextureSubImage3DEXTPROC)tlsGetFunction(1543);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyTextureSubImage3DEXTPROC glCopyTextureSubImage3DEXT = (glCopyTextureSubImage3DEXTPROC)tlsGetFunction(1544);
    UNUSED_PARAM(clazz)
    glCopyTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glBindMultiTextureEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint texture) {
    glBindMultiTextureEXTPROC glBindMultiTextureEXT = (glBindMultiTextureEXTPROC)tlsGetFunction(1545);
    UNUSED_PARAM(clazz)
    glBindMultiTextureEXT(texunit, target, texture);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexCoordPointerEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint size, jint type, jint stride, jlong pointerAddress) {
    glMultiTexCoordPointerEXTPROC glMultiTexCoordPointerEXT = (glMultiTexCoordPointerEXTPROC)tlsGetFunction(1546);
    uintptr_t pointer = (uintptr_t)pointerAddress;
    UNUSED_PARAM(clazz)
    glMultiTexCoordPointerEXT(texunit, size, type, stride, pointer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexEnvfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jfloat param) {
    glMultiTexEnvfEXTPROC glMultiTexEnvfEXT = (glMultiTexEnvfEXTPROC)tlsGetFunction(1547);
    UNUSED_PARAM(clazz)
    glMultiTexEnvfEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexEnvfvEXTPROC glMultiTexEnvfvEXT = (glMultiTexEnvfvEXTPROC)tlsGetFunction(1548);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexEnvfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexEnviEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jint param) {
    glMultiTexEnviEXTPROC glMultiTexEnviEXT = (glMultiTexEnviEXTPROC)tlsGetFunction(1549);
    UNUSED_PARAM(clazz)
    glMultiTexEnviEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexEnvivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexEnvivEXTPROC glMultiTexEnvivEXT = (glMultiTexEnvivEXTPROC)tlsGetFunction(1550);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexEnvivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexGendEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jdouble param) {
    glMultiTexGendEXTPROC glMultiTexGendEXT = (glMultiTexGendEXTPROC)tlsGetFunction(1551);
    UNUSED_PARAM(clazz)
    glMultiTexGendEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGendvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glMultiTexGendvEXTPROC glMultiTexGendvEXT = (glMultiTexGendvEXTPROC)tlsGetFunction(1552);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexGendvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexGenfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jfloat param) {
    glMultiTexGenfEXTPROC glMultiTexGenfEXT = (glMultiTexGenfEXTPROC)tlsGetFunction(1553);
    UNUSED_PARAM(clazz)
    glMultiTexGenfEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glMultiTexGenfvEXTPROC glMultiTexGenfvEXT = (glMultiTexGenfvEXTPROC)tlsGetFunction(1554);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexGenfvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexGeniEXT(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jint param) {
    glMultiTexGeniEXTPROC glMultiTexGeniEXT = (glMultiTexGeniEXTPROC)tlsGetFunction(1555);
    UNUSED_PARAM(clazz)
    glMultiTexGeniEXT(texunit, coord, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexGenivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glMultiTexGenivEXTPROC glMultiTexGenivEXT = (glMultiTexGenivEXTPROC)tlsGetFunction(1556);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexGenivEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexEnvfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexEnvfvEXTPROC glGetMultiTexEnvfvEXT = (glGetMultiTexEnvfvEXTPROC)tlsGetFunction(1557);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexEnvfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexEnvivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexEnvivEXTPROC glGetMultiTexEnvivEXT = (glGetMultiTexEnvivEXTPROC)tlsGetFunction(1558);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexEnvivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGendvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glGetMultiTexGendvEXTPROC glGetMultiTexGendvEXT = (glGetMultiTexGendvEXTPROC)tlsGetFunction(1559);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexGendvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGenfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glGetMultiTexGenfvEXTPROC glGetMultiTexGenfvEXT = (glGetMultiTexGenfvEXTPROC)tlsGetFunction(1560);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexGenfvEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexGenivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint coord, jint pname, jlong paramsAddress) {
    glGetMultiTexGenivEXTPROC glGetMultiTexGenivEXT = (glGetMultiTexGenivEXTPROC)tlsGetFunction(1561);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexGenivEXT(texunit, coord, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexParameteriEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jint param) {
    glMultiTexParameteriEXTPROC glMultiTexParameteriEXT = (glMultiTexParameteriEXTPROC)tlsGetFunction(1562);
    UNUSED_PARAM(clazz)
    glMultiTexParameteriEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramAddress) {
    glMultiTexParameterivEXTPROC glMultiTexParameterivEXT = (glMultiTexParameterivEXTPROC)tlsGetFunction(1563);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterivEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexParameterfEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jfloat param) {
    glMultiTexParameterfEXTPROC glMultiTexParameterfEXT = (glMultiTexParameterfEXTPROC)tlsGetFunction(1564);
    UNUSED_PARAM(clazz)
    glMultiTexParameterfEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramAddress) {
    glMultiTexParameterfvEXTPROC glMultiTexParameterfvEXT = (glMultiTexParameterfvEXTPROC)tlsGetFunction(1565);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterfvEXT(texunit, target, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage1DEXT__IIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixelsAddress) {
    glMultiTexImage1DEXTPROC glMultiTexImage1DEXT = (glMultiTexImage1DEXTPROC)tlsGetFunction(1566);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixelsAddress) {
    glMultiTexImage2DEXTPROC glMultiTexImage2DEXT = (glMultiTexImage2DEXTPROC)tlsGetFunction(1567);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage1DEXT__IIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixelsAddress) {
    glMultiTexSubImage1DEXTPROC glMultiTexSubImage1DEXT = (glMultiTexSubImage1DEXTPROC)tlsGetFunction(1568);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage2DEXT__IIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixelsAddress) {
    glMultiTexSubImage2DEXTPROC glMultiTexSubImage2DEXT = (glMultiTexSubImage2DEXTPROC)tlsGetFunction(1569);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {
    glCopyMultiTexImage1DEXTPROC glCopyMultiTexImage1DEXT = (glCopyMultiTexImage1DEXTPROC)tlsGetFunction(1570);
    UNUSED_PARAM(clazz)
    glCopyMultiTexImage1DEXT(texunit, target, level, internalformat, x, y, width, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
    glCopyMultiTexImage2DEXTPROC glCopyMultiTexImage2DEXT = (glCopyMultiTexImage2DEXTPROC)tlsGetFunction(1571);
    UNUSED_PARAM(clazz)
    glCopyMultiTexImage2DEXT(texunit, target, level, internalformat, x, y, width, height, border);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    glCopyMultiTexSubImage1DEXTPROC glCopyMultiTexSubImage1DEXT = (glCopyMultiTexSubImage1DEXTPROC)tlsGetFunction(1572);
    UNUSED_PARAM(clazz)
    glCopyMultiTexSubImage1DEXT(texunit, target, level, xoffset, x, y, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    glCopyMultiTexSubImage2DEXTPROC glCopyMultiTexSubImage2DEXT = (glCopyMultiTexSubImage2DEXTPROC)tlsGetFunction(1573);
    UNUSED_PARAM(clazz)
    glCopyMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexImageEXT__IIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint format, jint type, jlong pixelsAddress) {
    glGetMultiTexImageEXTPROC glGetMultiTexImageEXT = (glGetMultiTexImageEXTPROC)tlsGetFunction(1574);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexImageEXT(texunit, target, level, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterfvEXTPROC glGetMultiTexParameterfvEXT = (glGetMultiTexParameterfvEXTPROC)tlsGetFunction(1575);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterfvEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterivEXTPROC glGetMultiTexParameterivEXT = (glGetMultiTexParameterivEXTPROC)tlsGetFunction(1576);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexLevelParameterfvEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetMultiTexLevelParameterfvEXTPROC glGetMultiTexLevelParameterfvEXT = (glGetMultiTexLevelParameterfvEXTPROC)tlsGetFunction(1577);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexLevelParameterfvEXT(texunit, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexLevelParameterivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint pname, jlong paramsAddress) {
    glGetMultiTexLevelParameterivEXTPROC glGetMultiTexLevelParameterivEXT = (glGetMultiTexLevelParameterivEXTPROC)tlsGetFunction(1578);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexLevelParameterivEXT(texunit, target, level, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexImage3DEXT__IIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint format, jint type, jlong pixelsAddress) {
    glMultiTexImage3DEXTPROC glMultiTexImage3DEXT = (glMultiTexImage3DEXTPROC)tlsGetFunction(1579);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexSubImage3DEXT__IIIIIIIIIIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint type, jlong pixelsAddress) {
    glMultiTexSubImage3DEXTPROC glMultiTexSubImage3DEXT = (glMultiTexSubImage3DEXTPROC)tlsGetFunction(1580);
    uintptr_t pixels = (uintptr_t)pixelsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCopyMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint x, jint y, jint width, jint height) {
    glCopyMultiTexSubImage3DEXTPROC glCopyMultiTexSubImage3DEXT = (glCopyMultiTexSubImage3DEXTPROC)tlsGetFunction(1581);
    UNUSED_PARAM(clazz)
    glCopyMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableClientStateIndexedEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glEnableClientStateIndexedEXTPROC glEnableClientStateIndexedEXT = (glEnableClientStateIndexedEXTPROC)tlsGetFunction(1582);
    UNUSED_PARAM(clazz)
    glEnableClientStateIndexedEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableClientStateIndexedEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glDisableClientStateIndexedEXTPROC glDisableClientStateIndexedEXT = (glDisableClientStateIndexedEXTPROC)tlsGetFunction(1583);
    UNUSED_PARAM(clazz)
    glDisableClientStateIndexedEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableClientStateiEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glEnableClientStateiEXTPROC glEnableClientStateiEXT = (glEnableClientStateiEXTPROC)tlsGetFunction(1584);
    UNUSED_PARAM(clazz)
    glEnableClientStateiEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableClientStateiEXT(JNIEnv *__env, jclass clazz, jint array, jint index) {
    glDisableClientStateiEXTPROC glDisableClientStateiEXT = (glDisableClientStateiEXTPROC)tlsGetFunction(1585);
    UNUSED_PARAM(clazz)
    glDisableClientStateiEXT(array, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFloatIndexedvEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetFloatIndexedvEXTPROC glGetFloatIndexedvEXT = (glGetFloatIndexedvEXTPROC)tlsGetFunction(1586);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFloatIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetDoubleIndexedvEXT__IIJ(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetDoubleIndexedvEXTPROC glGetDoubleIndexedvEXT = (glGetDoubleIndexedvEXTPROC)tlsGetFunction(1587);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetDoubleIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetPointerIndexedvEXT(JNIEnv *__env, jclass clazz, jint target, jint index, jlong paramsAddress) {
    glGetPointerIndexedvEXTPROC glGetPointerIndexedvEXT = (glGetPointerIndexedvEXTPROC)tlsGetFunction(1588);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointerIndexedvEXT(target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFloati_1vEXT__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetFloati_vEXTPROC glGetFloati_vEXT = (glGetFloati_vEXTPROC)tlsGetFunction(1589);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetFloati_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetDoublei_1vEXT__IIJ(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetDoublei_vEXTPROC glGetDoublei_vEXT = (glGetDoublei_vEXTPROC)tlsGetFunction(1590);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetDoublei_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetPointeri_1vEXT(JNIEnv *__env, jclass clazz, jint pname, jint index, jlong paramsAddress) {
    glGetPointeri_vEXTPROC glGetPointeri_vEXT = (glGetPointeri_vEXTPROC)tlsGetFunction(1591);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetPointeri_vEXT(pname, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramStringEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint format, jint len, jlong stringAddress) {
    glNamedProgramStringEXTPROC glNamedProgramStringEXT = (glNamedProgramStringEXTPROC)tlsGetFunction(1597);
    uintptr_t string = (uintptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramStringEXT(program, target, format, len, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameter4dEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jdouble x, jdouble y, jdouble z, jdouble w) {
    glNamedProgramLocalParameter4dEXTPROC glNamedProgramLocalParameter4dEXT = (glNamedProgramLocalParameter4dEXTPROC)tlsGetFunction(1598);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4dEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4dvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameter4dvEXTPROC glNamedProgramLocalParameter4dvEXT = (glNamedProgramLocalParameter4dvEXTPROC)tlsGetFunction(1599);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4dvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameter4fEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jfloat x, jfloat y, jfloat z, jfloat w) {
    glNamedProgramLocalParameter4fEXTPROC glNamedProgramLocalParameter4fEXT = (glNamedProgramLocalParameter4fEXTPROC)tlsGetFunction(1600);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4fEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameter4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameter4fvEXTPROC glNamedProgramLocalParameter4fvEXT = (glNamedProgramLocalParameter4fvEXTPROC)tlsGetFunction(1601);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameter4fvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterdvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterdvEXTPROC glGetNamedProgramLocalParameterdvEXT = (glGetNamedProgramLocalParameterdvEXTPROC)tlsGetFunction(1602);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterdvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterfvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterfvEXTPROC glGetNamedProgramLocalParameterfvEXT = (glGetNamedProgramLocalParameterfvEXTPROC)tlsGetFunction(1603);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterfvEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint pname, jlong paramsAddress) {
    glGetNamedProgramivEXTPROC glGetNamedProgramivEXT = (glGetNamedProgramivEXTPROC)tlsGetFunction(1604);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramivEXT(program, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramStringEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint pname, jlong stringAddress) {
    glGetNamedProgramStringEXTPROC glGetNamedProgramStringEXT = (glGetNamedProgramStringEXTPROC)tlsGetFunction(1605);
    uintptr_t string = (uintptr_t)stringAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramStringEXT(program, target, pname, string);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTextureImage3DEXTPROC glCompressedTextureImage3DEXT = (glCompressedTextureImage3DEXTPROC)tlsGetFunction(1606);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureImage3DEXT(texture, target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTextureImage2DEXTPROC glCompressedTextureImage2DEXT = (glCompressedTextureImage2DEXTPROC)tlsGetFunction(1607);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureImage2DEXT(texture, target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress) {
    glCompressedTextureImage1DEXTPROC glCompressedTextureImage1DEXT = (glCompressedTextureImage1DEXTPROC)tlsGetFunction(1608);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureImage1DEXT(texture, target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage3DEXTPROC glCompressedTextureSubImage3DEXT = (glCompressedTextureSubImage3DEXTPROC)tlsGetFunction(1609);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage3DEXT(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage2DEXTPROC glCompressedTextureSubImage2DEXT = (glCompressedTextureSubImage2DEXTPROC)tlsGetFunction(1610);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage2DEXT(texture, target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedTextureSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedTextureSubImage1DEXTPROC glCompressedTextureSubImage1DEXT = (glCompressedTextureSubImage1DEXTPROC)tlsGetFunction(1611);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedTextureSubImage1DEXT(texture, target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetCompressedTextureImageEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint level, jlong imgAddress) {
    glGetCompressedTextureImageEXTPROC glGetCompressedTextureImageEXT = (glGetCompressedTextureImageEXTPROC)tlsGetFunction(1612);
    uintptr_t img = (uintptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedTextureImageEXT(texture, target, level, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint depth, jint border, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexImage3DEXTPROC glCompressedMultiTexImage3DEXT = (glCompressedMultiTexImage3DEXTPROC)tlsGetFunction(1613);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexImage3DEXT(texunit, target, level, internalformat, width, height, depth, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexImage2DEXTPROC glCompressedMultiTexImage2DEXT = (glCompressedMultiTexImage2DEXTPROC)tlsGetFunction(1614);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexImage2DEXT(texunit, target, level, internalformat, width, height, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint internalformat, jint width, jint border, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexImage1DEXTPROC glCompressedMultiTexImage1DEXT = (glCompressedMultiTexImage1DEXTPROC)tlsGetFunction(1615);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexImage1DEXT(texunit, target, level, internalformat, width, border, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage3DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint zoffset, jint width, jint height, jint depth, jint format, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexSubImage3DEXTPROC glCompressedMultiTexSubImage3DEXT = (glCompressedMultiTexSubImage3DEXTPROC)tlsGetFunction(1616);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexSubImage3DEXT(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage2DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexSubImage2DEXTPROC glCompressedMultiTexSubImage2DEXT = (glCompressedMultiTexSubImage2DEXTPROC)tlsGetFunction(1617);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexSubImage2DEXT(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglCompressedMultiTexSubImage1DEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jint xoffset, jint width, jint format, jint imageSize, jlong dataAddress) {
    glCompressedMultiTexSubImage1DEXTPROC glCompressedMultiTexSubImage1DEXT = (glCompressedMultiTexSubImage1DEXTPROC)tlsGetFunction(1618);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glCompressedMultiTexSubImage1DEXT(texunit, target, level, xoffset, width, format, imageSize, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetCompressedMultiTexImageEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint level, jlong imgAddress) {
    glGetCompressedMultiTexImageEXTPROC glGetCompressedMultiTexImageEXT = (glGetCompressedMultiTexImageEXTPROC)tlsGetFunction(1619);
    uintptr_t img = (uintptr_t)imgAddress;
    UNUSED_PARAM(clazz)
    glGetCompressedMultiTexImageEXT(texunit, target, level, img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadTransposefEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadTransposefEXTPROC glMatrixLoadTransposefEXT = (glMatrixLoadTransposefEXTPROC)tlsGetFunction(1620);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadTransposefEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixLoadTransposedEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixLoadTransposedEXTPROC glMatrixLoadTransposedEXT = (glMatrixLoadTransposedEXTPROC)tlsGetFunction(1621);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixLoadTransposedEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultTransposefEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultTransposefEXTPROC glMatrixMultTransposefEXT = (glMatrixMultTransposefEXTPROC)tlsGetFunction(1622);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultTransposefEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMatrixMultTransposedEXT__IJ(JNIEnv *__env, jclass clazz, jint matrixMode, jlong mAddress) {
    glMatrixMultTransposedEXTPROC glMatrixMultTransposedEXT = (glMatrixMultTransposedEXTPROC)tlsGetFunction(1623);
    uintptr_t m = (uintptr_t)mAddress;
    UNUSED_PARAM(clazz)
    glMatrixMultTransposedEXT(matrixMode, m);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedBufferDataEXT__IJJI(JNIEnv *__env, jclass clazz, jint buffer, jlong size, jlong dataAddress, jint usage) {
    glNamedBufferDataEXTPROC glNamedBufferDataEXT = (glNamedBufferDataEXTPROC)tlsGetFunction(1624);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferDataEXT(buffer, (uintptr_t)size, data, usage);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedBufferSubDataEXT__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glNamedBufferSubDataEXTPROC glNamedBufferSubDataEXT = (glNamedBufferSubDataEXTPROC)tlsGetFunction(1625);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glNamedBufferSubDataEXT(buffer, (uintptr_t)offset, (uintptr_t)size, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMapNamedBufferEXT(JNIEnv *__env, jclass clazz, jint buffer, jint access) {
    glMapNamedBufferEXTPROC glMapNamedBufferEXT = (glMapNamedBufferEXTPROC)tlsGetFunction(1626);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBufferEXT(buffer, access);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glUnmapNamedBufferEXT(JNIEnv *__env, jclass clazz, jint buffer) {
    glUnmapNamedBufferEXTPROC glUnmapNamedBufferEXT = (glUnmapNamedBufferEXTPROC)tlsGetFunction(1627);
    UNUSED_PARAM(clazz)
    return (jboolean)glUnmapNamedBufferEXT(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedBufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint buffer, jint pname, jlong paramsAddress) {
    glGetNamedBufferParameterivEXTPROC glGetNamedBufferParameterivEXT = (glGetNamedBufferParameterivEXTPROC)tlsGetFunction(1628);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferParameterivEXT(buffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedBufferSubDataEXT__IJJJ(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong size, jlong dataAddress) {
    glGetNamedBufferSubDataEXTPROC glGetNamedBufferSubDataEXT = (glGetNamedBufferSubDataEXTPROC)tlsGetFunction(1629);
    uintptr_t data = (uintptr_t)dataAddress;
    UNUSED_PARAM(clazz)
    glGetNamedBufferSubDataEXT(buffer, (uintptr_t)offset, (uintptr_t)size, data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform1fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0) {
    glProgramUniform1fEXTPROC glProgramUniform1fEXT = (glProgramUniform1fEXTPROC)tlsGetFunction(1630);
    UNUSED_PARAM(clazz)
    glProgramUniform1fEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform2fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1) {
    glProgramUniform2fEXTPROC glProgramUniform2fEXT = (glProgramUniform2fEXTPROC)tlsGetFunction(1631);
    UNUSED_PARAM(clazz)
    glProgramUniform2fEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform3fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2) {
    glProgramUniform3fEXTPROC glProgramUniform3fEXT = (glProgramUniform3fEXTPROC)tlsGetFunction(1632);
    UNUSED_PARAM(clazz)
    glProgramUniform3fEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform4fEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jfloat v0, jfloat v1, jfloat v2, jfloat v3) {
    glProgramUniform4fEXTPROC glProgramUniform4fEXT = (glProgramUniform4fEXTPROC)tlsGetFunction(1633);
    UNUSED_PARAM(clazz)
    glProgramUniform4fEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform1iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1iEXTPROC glProgramUniform1iEXT = (glProgramUniform1iEXTPROC)tlsGetFunction(1634);
    UNUSED_PARAM(clazz)
    glProgramUniform1iEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform2iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2iEXTPROC glProgramUniform2iEXT = (glProgramUniform2iEXTPROC)tlsGetFunction(1635);
    UNUSED_PARAM(clazz)
    glProgramUniform2iEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform3iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3iEXTPROC glProgramUniform3iEXT = (glProgramUniform3iEXTPROC)tlsGetFunction(1636);
    UNUSED_PARAM(clazz)
    glProgramUniform3iEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform4iEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4iEXTPROC glProgramUniform4iEXT = (glProgramUniform4iEXTPROC)tlsGetFunction(1637);
    UNUSED_PARAM(clazz)
    glProgramUniform4iEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1fvEXTPROC glProgramUniform1fvEXT = (glProgramUniform1fvEXTPROC)tlsGetFunction(1638);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2fvEXTPROC glProgramUniform2fvEXT = (glProgramUniform2fvEXTPROC)tlsGetFunction(1639);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3fvEXTPROC glProgramUniform3fvEXT = (glProgramUniform3fvEXTPROC)tlsGetFunction(1640);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4fvEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4fvEXTPROC glProgramUniform4fvEXT = (glProgramUniform4fvEXTPROC)tlsGetFunction(1641);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4fvEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1ivEXTPROC glProgramUniform1ivEXT = (glProgramUniform1ivEXTPROC)tlsGetFunction(1642);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2ivEXTPROC glProgramUniform2ivEXT = (glProgramUniform2ivEXTPROC)tlsGetFunction(1643);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3ivEXTPROC glProgramUniform3ivEXT = (glProgramUniform3ivEXTPROC)tlsGetFunction(1644);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4ivEXTPROC glProgramUniform4ivEXT = (glProgramUniform4ivEXTPROC)tlsGetFunction(1645);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4ivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2fvEXTPROC glProgramUniformMatrix2fvEXT = (glProgramUniformMatrix2fvEXTPROC)tlsGetFunction(1646);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3fvEXTPROC glProgramUniformMatrix3fvEXT = (glProgramUniformMatrix3fvEXTPROC)tlsGetFunction(1647);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4fvEXTPROC glProgramUniformMatrix4fvEXT = (glProgramUniformMatrix4fvEXTPROC)tlsGetFunction(1648);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2x3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x3fvEXTPROC glProgramUniformMatrix2x3fvEXT = (glProgramUniformMatrix2x3fvEXTPROC)tlsGetFunction(1649);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3x2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x2fvEXTPROC glProgramUniformMatrix3x2fvEXT = (glProgramUniformMatrix3x2fvEXTPROC)tlsGetFunction(1650);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix2x4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix2x4fvEXTPROC glProgramUniformMatrix2x4fvEXT = (glProgramUniformMatrix2x4fvEXTPROC)tlsGetFunction(1651);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix2x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4x2fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x2fvEXTPROC glProgramUniformMatrix4x2fvEXT = (glProgramUniformMatrix4x2fvEXTPROC)tlsGetFunction(1652);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x2fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix3x4fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix3x4fvEXTPROC glProgramUniformMatrix3x4fvEXT = (glProgramUniformMatrix3x4fvEXTPROC)tlsGetFunction(1653);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix3x4fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniformMatrix4x3fvEXT__IIIZJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jboolean transpose, jlong valueAddress) {
    glProgramUniformMatrix4x3fvEXTPROC glProgramUniformMatrix4x3fvEXT = (glProgramUniformMatrix4x3fvEXTPROC)tlsGetFunction(1654);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniformMatrix4x3fvEXT(program, location, count, transpose, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureBufferEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint internalformat, jint buffer) {
    glTextureBufferEXTPROC glTextureBufferEXT = (glTextureBufferEXTPROC)tlsGetFunction(1655);
    UNUSED_PARAM(clazz)
    glTextureBufferEXT(texture, target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexBufferEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint internalformat, jint buffer) {
    glMultiTexBufferEXTPROC glMultiTexBufferEXT = (glMultiTexBufferEXTPROC)tlsGetFunction(1656);
    UNUSED_PARAM(clazz)
    glMultiTexBufferEXT(texunit, target, internalformat, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glTextureParameterIivEXTPROC glTextureParameterIivEXT = (glTextureParameterIivEXTPROC)tlsGetFunction(1657);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglTextureParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glTextureParameterIuivEXTPROC glTextureParameterIuivEXT = (glTextureParameterIuivEXTPROC)tlsGetFunction(1658);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glTextureParameterIuivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterIivEXTPROC glGetTextureParameterIivEXT = (glGetTextureParameterIivEXTPROC)tlsGetFunction(1659);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetTextureParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texture, jint target, jint pname, jlong paramsAddress) {
    glGetTextureParameterIuivEXTPROC glGetTextureParameterIuivEXT = (glGetTextureParameterIuivEXTPROC)tlsGetFunction(1660);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetTextureParameterIuivEXT(texture, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexParameterIivEXTPROC glMultiTexParameterIivEXT = (glMultiTexParameterIivEXTPROC)tlsGetFunction(1661);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterIivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMultiTexParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glMultiTexParameterIuivEXTPROC glMultiTexParameterIuivEXT = (glMultiTexParameterIuivEXTPROC)tlsGetFunction(1662);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glMultiTexParameterIuivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterIivEXTPROC glGetMultiTexParameterIivEXT = (glGetMultiTexParameterIivEXTPROC)tlsGetFunction(1663);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterIivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetMultiTexParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint pname, jlong paramsAddress) {
    glGetMultiTexParameterIuivEXTPROC glGetMultiTexParameterIuivEXT = (glGetMultiTexParameterIuivEXTPROC)tlsGetFunction(1664);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetMultiTexParameterIuivEXT(texunit, target, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform1uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0) {
    glProgramUniform1uiEXTPROC glProgramUniform1uiEXT = (glProgramUniform1uiEXTPROC)tlsGetFunction(1665);
    UNUSED_PARAM(clazz)
    glProgramUniform1uiEXT(program, location, v0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform2uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1) {
    glProgramUniform2uiEXTPROC glProgramUniform2uiEXT = (glProgramUniform2uiEXTPROC)tlsGetFunction(1666);
    UNUSED_PARAM(clazz)
    glProgramUniform2uiEXT(program, location, v0, v1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform3uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2) {
    glProgramUniform3uiEXTPROC glProgramUniform3uiEXT = (glProgramUniform3uiEXTPROC)tlsGetFunction(1667);
    UNUSED_PARAM(clazz)
    glProgramUniform3uiEXT(program, location, v0, v1, v2);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glProgramUniform4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint location, jint v0, jint v1, jint v2, jint v3) {
    glProgramUniform4uiEXTPROC glProgramUniform4uiEXT = (glProgramUniform4uiEXTPROC)tlsGetFunction(1668);
    UNUSED_PARAM(clazz)
    glProgramUniform4uiEXT(program, location, v0, v1, v2, v3);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform1uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform1uivEXTPROC glProgramUniform1uivEXT = (glProgramUniform1uivEXTPROC)tlsGetFunction(1669);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform1uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform2uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform2uivEXTPROC glProgramUniform2uivEXT = (glProgramUniform2uivEXTPROC)tlsGetFunction(1670);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform2uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform3uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform3uivEXTPROC glProgramUniform3uivEXT = (glProgramUniform3uivEXTPROC)tlsGetFunction(1671);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform3uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglProgramUniform4uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint location, jint count, jlong valueAddress) {
    glProgramUniform4uivEXTPROC glProgramUniform4uivEXT = (glProgramUniform4uivEXTPROC)tlsGetFunction(1672);
    uintptr_t value = (uintptr_t)valueAddress;
    UNUSED_PARAM(clazz)
    glProgramUniform4uivEXT(program, location, count, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameters4fvEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress) {
    glNamedProgramLocalParameters4fvEXTPROC glNamedProgramLocalParameters4fvEXT = (glNamedProgramLocalParameters4fvEXTPROC)tlsGetFunction(1673);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameters4fvEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameterI4iEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint x, jint y, jint z, jint w) {
    glNamedProgramLocalParameterI4iEXTPROC glNamedProgramLocalParameterI4iEXT = (glNamedProgramLocalParameterI4iEXTPROC)tlsGetFunction(1674);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4iEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4ivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameterI4ivEXTPROC glNamedProgramLocalParameterI4ivEXT = (glNamedProgramLocalParameterI4ivEXTPROC)tlsGetFunction(1675);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4ivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParametersI4ivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress) {
    glNamedProgramLocalParametersI4ivEXTPROC glNamedProgramLocalParametersI4ivEXT = (glNamedProgramLocalParametersI4ivEXTPROC)tlsGetFunction(1676);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParametersI4ivEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedProgramLocalParameterI4uiEXT(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint x, jint y, jint z, jint w) {
    glNamedProgramLocalParameterI4uiEXTPROC glNamedProgramLocalParameterI4uiEXT = (glNamedProgramLocalParameterI4uiEXTPROC)tlsGetFunction(1677);
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4uiEXT(program, target, index, x, y, z, w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParameterI4uivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glNamedProgramLocalParameterI4uivEXTPROC glNamedProgramLocalParameterI4uivEXT = (glNamedProgramLocalParameterI4uivEXTPROC)tlsGetFunction(1678);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParameterI4uivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglNamedProgramLocalParametersI4uivEXT__IIIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jint count, jlong paramsAddress) {
    glNamedProgramLocalParametersI4uivEXTPROC glNamedProgramLocalParametersI4uivEXT = (glNamedProgramLocalParametersI4uivEXTPROC)tlsGetFunction(1679);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glNamedProgramLocalParametersI4uivEXT(program, target, index, count, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterIivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterIivEXTPROC glGetNamedProgramLocalParameterIivEXT = (glGetNamedProgramLocalParameterIivEXTPROC)tlsGetFunction(1680);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterIivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedProgramLocalParameterIuivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint program, jint target, jint index, jlong paramsAddress) {
    glGetNamedProgramLocalParameterIuivEXTPROC glGetNamedProgramLocalParameterIuivEXT = (glGetNamedProgramLocalParameterIuivEXTPROC)tlsGetFunction(1681);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedProgramLocalParameterIuivEXT(program, target, index, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedRenderbufferStorageEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageEXTPROC glNamedRenderbufferStorageEXT = (glNamedRenderbufferStorageEXTPROC)tlsGetFunction(1682);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageEXT(renderbuffer, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedRenderbufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint renderbuffer, jint pname, jlong paramsAddress) {
    glGetNamedRenderbufferParameterivEXTPROC glGetNamedRenderbufferParameterivEXT = (glGetNamedRenderbufferParameterivEXTPROC)tlsGetFunction(1683);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedRenderbufferParameterivEXT(renderbuffer, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedRenderbufferStorageMultisampleEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint samples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisampleEXTPROC glNamedRenderbufferStorageMultisampleEXT = (glNamedRenderbufferStorageMultisampleEXTPROC)tlsGetFunction(1684);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisampleEXT(renderbuffer, samples, internalformat, width, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedRenderbufferStorageMultisampleCoverageEXT(JNIEnv *__env, jclass clazz, jint renderbuffer, jint coverageSamples, jint colorSamples, jint internalformat, jint width, jint height) {
    glNamedRenderbufferStorageMultisampleCoverageEXTPROC glNamedRenderbufferStorageMultisampleCoverageEXT = (glNamedRenderbufferStorageMultisampleCoverageEXTPROC)tlsGetFunction(1685);
    UNUSED_PARAM(clazz)
    glNamedRenderbufferStorageMultisampleCoverageEXT(renderbuffer, coverageSamples, colorSamples, internalformat, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glCheckNamedFramebufferStatusEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint target) {
    glCheckNamedFramebufferStatusEXTPROC glCheckNamedFramebufferStatusEXT = (glCheckNamedFramebufferStatusEXTPROC)tlsGetFunction(1686);
    UNUSED_PARAM(clazz)
    return (jint)glCheckNamedFramebufferStatusEXT(framebuffer, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTexture1DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level) {
    glNamedFramebufferTexture1DEXTPROC glNamedFramebufferTexture1DEXT = (glNamedFramebufferTexture1DEXTPROC)tlsGetFunction(1687);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture1DEXT(framebuffer, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTexture2DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level) {
    glNamedFramebufferTexture2DEXTPROC glNamedFramebufferTexture2DEXT = (glNamedFramebufferTexture2DEXTPROC)tlsGetFunction(1688);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture2DEXT(framebuffer, attachment, textarget, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTexture3DEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint textarget, jint texture, jint level, jint zoffset) {
    glNamedFramebufferTexture3DEXTPROC glNamedFramebufferTexture3DEXT = (glNamedFramebufferTexture3DEXTPROC)tlsGetFunction(1689);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTexture3DEXT(framebuffer, attachment, textarget, texture, level, zoffset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferRenderbufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint renderbuffertarget, jint renderbuffer) {
    glNamedFramebufferRenderbufferEXTPROC glNamedFramebufferRenderbufferEXT = (glNamedFramebufferRenderbufferEXTPROC)tlsGetFunction(1690);
    UNUSED_PARAM(clazz)
    glNamedFramebufferRenderbufferEXT(framebuffer, attachment, renderbuffertarget, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetNamedFramebufferAttachmentParameterivEXT__IIIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint pname, jlong paramsAddress) {
    glGetNamedFramebufferAttachmentParameterivEXTPROC glGetNamedFramebufferAttachmentParameterivEXT = (glGetNamedFramebufferAttachmentParameterivEXTPROC)tlsGetFunction(1691);
    uintptr_t params = (uintptr_t)paramsAddress;
    UNUSED_PARAM(clazz)
    glGetNamedFramebufferAttachmentParameterivEXT(framebuffer, attachment, pname, params);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glGenerateTextureMipmapEXT(JNIEnv *__env, jclass clazz, jint texture, jint target) {
    glGenerateTextureMipmapEXTPROC glGenerateTextureMipmapEXT = (glGenerateTextureMipmapEXTPROC)tlsGetFunction(1692);
    UNUSED_PARAM(clazz)
    glGenerateTextureMipmapEXT(texture, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glGenerateMultiTexMipmapEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target) {
    glGenerateMultiTexMipmapEXTPROC glGenerateMultiTexMipmapEXT = (glGenerateMultiTexMipmapEXTPROC)tlsGetFunction(1693);
    UNUSED_PARAM(clazz)
    glGenerateMultiTexMipmapEXT(texunit, target);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glFramebufferDrawBufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint mode) {
    glFramebufferDrawBufferEXTPROC glFramebufferDrawBufferEXT = (glFramebufferDrawBufferEXTPROC)tlsGetFunction(1694);
    UNUSED_PARAM(clazz)
    glFramebufferDrawBufferEXT(framebuffer, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglFramebufferDrawBuffersEXT__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint n, jlong bufsAddress) {
    glFramebufferDrawBuffersEXTPROC glFramebufferDrawBuffersEXT = (glFramebufferDrawBuffersEXTPROC)tlsGetFunction(1695);
    uintptr_t bufs = (uintptr_t)bufsAddress;
    UNUSED_PARAM(clazz)
    glFramebufferDrawBuffersEXT(framebuffer, n, bufs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glFramebufferReadBufferEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint mode) {
    glFramebufferReadBufferEXTPROC glFramebufferReadBufferEXT = (glFramebufferReadBufferEXTPROC)tlsGetFunction(1696);
    UNUSED_PARAM(clazz)
    glFramebufferReadBufferEXT(framebuffer, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetFramebufferParameterivEXT__IIJ(JNIEnv *__env, jclass clazz, jint framebuffer, jint pname, jlong paramAddress) {
    glGetFramebufferParameterivEXTPROC glGetFramebufferParameterivEXT = (glGetFramebufferParameterivEXTPROC)tlsGetFunction(1697);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetFramebufferParameterivEXT(framebuffer, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedCopyBufferSubDataEXT(JNIEnv *__env, jclass clazz, jint readBuffer, jint writeBuffer, jlong readOffset, jlong writeOffset, jlong size) {
    glNamedCopyBufferSubDataEXTPROC glNamedCopyBufferSubDataEXT = (glNamedCopyBufferSubDataEXTPROC)tlsGetFunction(1698);
    UNUSED_PARAM(clazz)
    glNamedCopyBufferSubDataEXT(readBuffer, writeBuffer, (uintptr_t)readOffset, (uintptr_t)writeOffset, (uintptr_t)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTextureEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level) {
    glNamedFramebufferTextureEXTPROC glNamedFramebufferTextureEXT = (glNamedFramebufferTextureEXTPROC)tlsGetFunction(1699);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureEXT(framebuffer, attachment, texture, level);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTextureLayerEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint layer) {
    glNamedFramebufferTextureLayerEXTPROC glNamedFramebufferTextureLayerEXT = (glNamedFramebufferTextureLayerEXTPROC)tlsGetFunction(1700);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureLayerEXT(framebuffer, attachment, texture, level, layer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glNamedFramebufferTextureFaceEXT(JNIEnv *__env, jclass clazz, jint framebuffer, jint attachment, jint texture, jint level, jint face) {
    glNamedFramebufferTextureFaceEXTPROC glNamedFramebufferTextureFaceEXT = (glNamedFramebufferTextureFaceEXTPROC)tlsGetFunction(1701);
    UNUSED_PARAM(clazz)
    glNamedFramebufferTextureFaceEXT(framebuffer, attachment, texture, level, face);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glTextureRenderbufferEXT(JNIEnv *__env, jclass clazz, jint texture, jint target, jint renderbuffer) {
    glTextureRenderbufferEXTPROC glTextureRenderbufferEXT = (glTextureRenderbufferEXTPROC)tlsGetFunction(1702);
    UNUSED_PARAM(clazz)
    glTextureRenderbufferEXT(texture, target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glMultiTexRenderbufferEXT(JNIEnv *__env, jclass clazz, jint texunit, jint target, jint renderbuffer) {
    glMultiTexRenderbufferEXTPROC glMultiTexRenderbufferEXT = (glMultiTexRenderbufferEXTPROC)tlsGetFunction(1703);
    UNUSED_PARAM(clazz)
    glMultiTexRenderbufferEXT(texunit, target, renderbuffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayVertexOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayVertexOffsetEXTPROC glVertexArrayVertexOffsetEXT = (glVertexArrayVertexOffsetEXTPROC)tlsGetFunction(1704);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexOffsetEXT(vaobj, buffer, size, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayColorOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayColorOffsetEXTPROC glVertexArrayColorOffsetEXT = (glVertexArrayColorOffsetEXTPROC)tlsGetFunction(1705);
    UNUSED_PARAM(clazz)
    glVertexArrayColorOffsetEXT(vaobj, buffer, size, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayEdgeFlagOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint stride, jlong offset) {
    glVertexArrayEdgeFlagOffsetEXTPROC glVertexArrayEdgeFlagOffsetEXT = (glVertexArrayEdgeFlagOffsetEXTPROC)tlsGetFunction(1706);
    UNUSED_PARAM(clazz)
    glVertexArrayEdgeFlagOffsetEXT(vaobj, buffer, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayIndexOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset) {
    glVertexArrayIndexOffsetEXTPROC glVertexArrayIndexOffsetEXT = (glVertexArrayIndexOffsetEXTPROC)tlsGetFunction(1707);
    UNUSED_PARAM(clazz)
    glVertexArrayIndexOffsetEXT(vaobj, buffer, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayNormalOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset) {
    glVertexArrayNormalOffsetEXTPROC glVertexArrayNormalOffsetEXT = (glVertexArrayNormalOffsetEXTPROC)tlsGetFunction(1708);
    UNUSED_PARAM(clazz)
    glVertexArrayNormalOffsetEXT(vaobj, buffer, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayTexCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayTexCoordOffsetEXTPROC glVertexArrayTexCoordOffsetEXT = (glVertexArrayTexCoordOffsetEXTPROC)tlsGetFunction(1709);
    UNUSED_PARAM(clazz)
    glVertexArrayTexCoordOffsetEXT(vaobj, buffer, size, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayMultiTexCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint texunit, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayMultiTexCoordOffsetEXTPROC glVertexArrayMultiTexCoordOffsetEXT = (glVertexArrayMultiTexCoordOffsetEXTPROC)tlsGetFunction(1710);
    UNUSED_PARAM(clazz)
    glVertexArrayMultiTexCoordOffsetEXT(vaobj, buffer, texunit, size, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayFogCoordOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint type, jint stride, jlong offset) {
    glVertexArrayFogCoordOffsetEXTPROC glVertexArrayFogCoordOffsetEXT = (glVertexArrayFogCoordOffsetEXTPROC)tlsGetFunction(1711);
    UNUSED_PARAM(clazz)
    glVertexArrayFogCoordOffsetEXT(vaobj, buffer, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArraySecondaryColorOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint size, jint type, jint stride, jlong offset) {
    glVertexArraySecondaryColorOffsetEXTPROC glVertexArraySecondaryColorOffsetEXT = (glVertexArraySecondaryColorOffsetEXTPROC)tlsGetFunction(1712);
    UNUSED_PARAM(clazz)
    glVertexArraySecondaryColorOffsetEXT(vaobj, buffer, size, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayVertexAttribOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jboolean normalized, jint stride, jlong offset) {
    glVertexArrayVertexAttribOffsetEXTPROC glVertexArrayVertexAttribOffsetEXT = (glVertexArrayVertexAttribOffsetEXTPROC)tlsGetFunction(1713);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribOffsetEXT(vaobj, buffer, index, size, type, normalized, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glVertexArrayVertexAttribIOffsetEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint buffer, jint index, jint size, jint type, jint stride, jlong offset) {
    glVertexArrayVertexAttribIOffsetEXTPROC glVertexArrayVertexAttribIOffsetEXT = (glVertexArrayVertexAttribIOffsetEXTPROC)tlsGetFunction(1714);
    UNUSED_PARAM(clazz)
    glVertexArrayVertexAttribIOffsetEXT(vaobj, buffer, index, size, type, stride, (uintptr_t)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableVertexArrayEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint array) {
    glEnableVertexArrayEXTPROC glEnableVertexArrayEXT = (glEnableVertexArrayEXTPROC)tlsGetFunction(1715);
    UNUSED_PARAM(clazz)
    glEnableVertexArrayEXT(vaobj, array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableVertexArrayEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint array) {
    glDisableVertexArrayEXTPROC glDisableVertexArrayEXT = (glDisableVertexArrayEXTPROC)tlsGetFunction(1716);
    UNUSED_PARAM(clazz)
    glDisableVertexArrayEXT(vaobj, array);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glEnableVertexArrayAttribEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glEnableVertexArrayAttribEXTPROC glEnableVertexArrayAttribEXT = (glEnableVertexArrayAttribEXTPROC)tlsGetFunction(1717);
    UNUSED_PARAM(clazz)
    glEnableVertexArrayAttribEXT(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glDisableVertexArrayAttribEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index) {
    glDisableVertexArrayAttribEXTPROC glDisableVertexArrayAttribEXT = (glDisableVertexArrayAttribEXTPROC)tlsGetFunction(1718);
    UNUSED_PARAM(clazz)
    glDisableVertexArrayAttribEXT(vaobj, index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayIntegervEXT__IIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress) {
    glGetVertexArrayIntegervEXTPROC glGetVertexArrayIntegervEXT = (glGetVertexArrayIntegervEXTPROC)tlsGetFunction(1719);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIntegervEXT(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayPointervEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint pname, jlong paramAddress) {
    glGetVertexArrayPointervEXTPROC glGetVertexArrayPointervEXT = (glGetVertexArrayPointervEXTPROC)tlsGetFunction(1720);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayPointervEXT(vaobj, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayIntegeri_1vEXT__IIIJ(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayIntegeri_vEXTPROC glGetVertexArrayIntegeri_vEXT = (glGetVertexArrayIntegeri_vEXTPROC)tlsGetFunction(1721);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayIntegeri_vEXT(vaobj, index, pname, param);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglGetVertexArrayPointeri_1vEXT(JNIEnv *__env, jclass clazz, jint vaobj, jint index, jint pname, jlong paramAddress) {
    glGetVertexArrayPointeri_vEXTPROC glGetVertexArrayPointeri_vEXT = (glGetVertexArrayPointeri_vEXTPROC)tlsGetFunction(1722);
    uintptr_t param = (uintptr_t)paramAddress;
    UNUSED_PARAM(clazz)
    glGetVertexArrayPointeri_vEXT(vaobj, index, pname, param);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_nglMapNamedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length, jint access) {
    glMapNamedBufferRangeEXTPROC glMapNamedBufferRangeEXT = (glMapNamedBufferRangeEXTPROC)tlsGetFunction(1723);
    UNUSED_PARAM(clazz)
    return (jlong)glMapNamedBufferRangeEXT(buffer, (uintptr_t)offset, (uintptr_t)length, access);
}

JNIEXPORT void JNICALL Java_org_lwjgl_opengl_EXTDirectStateAccess_glFlushMappedNamedBufferRangeEXT(JNIEnv *__env, jclass clazz, jint buffer, jlong offset, jlong length) {
    glFlushMappedNamedBufferRangeEXTPROC glFlushMappedNamedBufferRangeEXT = (glFlushMappedNamedBufferRangeEXTPROC)tlsGetFunction(1724);
    UNUSED_PARAM(clazz)
    glFlushMappedNamedBufferRangeEXT(buffer, (uintptr_t)offset, (uintptr_t)length);
}

EXTERN_C_EXIT
