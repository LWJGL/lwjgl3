/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;
import org.lwjgl.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines the capabilities of an OpenGL context. */
public final class GLCapabilities {

    public final long
        glAccum,
        glAlphaFunc,
        glAreTexturesResident,
        glArrayElement,
        glBegin,
        glBitmap,
        glCallList,
        glCallLists,
        glClearAccum,
        glClearIndex,
        glClipPlane,
        glColor3b,
        glColor3s,
        glColor3i,
        glColor3f,
        glColor3d,
        glColor3ub,
        glColor3us,
        glColor3ui,
        glColor3bv,
        glColor3sv,
        glColor3iv,
        glColor3fv,
        glColor3dv,
        glColor3ubv,
        glColor3usv,
        glColor3uiv,
        glColor4b,
        glColor4s,
        glColor4i,
        glColor4f,
        glColor4d,
        glColor4ub,
        glColor4us,
        glColor4ui,
        glColor4bv,
        glColor4sv,
        glColor4iv,
        glColor4fv,
        glColor4dv,
        glColor4ubv,
        glColor4usv,
        glColor4uiv,
        glColorMaterial,
        glColorPointer,
        glCopyPixels,
        glDeleteLists,
        glDisableClientState,
        glDrawPixels,
        glEdgeFlag,
        glEdgeFlagv,
        glEdgeFlagPointer,
        glEnableClientState,
        glEnd,
        glEvalCoord1f,
        glEvalCoord1fv,
        glEvalCoord1d,
        glEvalCoord1dv,
        glEvalCoord2f,
        glEvalCoord2fv,
        glEvalCoord2d,
        glEvalCoord2dv,
        glEvalMesh1,
        glEvalMesh2,
        glEvalPoint1,
        glEvalPoint2,
        glFeedbackBuffer,
        glFogi,
        glFogiv,
        glFogf,
        glFogfv,
        glGenLists,
        glGetClipPlane,
        glGetLightiv,
        glGetLightfv,
        glGetMapiv,
        glGetMapfv,
        glGetMapdv,
        glGetMaterialiv,
        glGetMaterialfv,
        glGetPixelMapfv,
        glGetPixelMapusv,
        glGetPixelMapuiv,
        glGetPolygonStipple,
        glGetTexEnviv,
        glGetTexEnvfv,
        glGetTexGeniv,
        glGetTexGenfv,
        glGetTexGendv,
        glIndexi,
        glIndexub,
        glIndexs,
        glIndexf,
        glIndexd,
        glIndexiv,
        glIndexubv,
        glIndexsv,
        glIndexfv,
        glIndexdv,
        glIndexMask,
        glIndexPointer,
        glInitNames,
        glInterleavedArrays,
        glIsList,
        glLightModeli,
        glLightModelf,
        glLightModeliv,
        glLightModelfv,
        glLighti,
        glLightf,
        glLightiv,
        glLightfv,
        glLineStipple,
        glListBase,
        glLoadMatrixf,
        glLoadMatrixd,
        glLoadIdentity,
        glLoadName,
        glMap1f,
        glMap1d,
        glMap2f,
        glMap2d,
        glMapGrid1f,
        glMapGrid1d,
        glMapGrid2f,
        glMapGrid2d,
        glMateriali,
        glMaterialf,
        glMaterialiv,
        glMaterialfv,
        glMatrixMode,
        glMultMatrixf,
        glMultMatrixd,
        glFrustum,
        glNewList,
        glEndList,
        glNormal3f,
        glNormal3b,
        glNormal3s,
        glNormal3i,
        glNormal3d,
        glNormal3fv,
        glNormal3bv,
        glNormal3sv,
        glNormal3iv,
        glNormal3dv,
        glNormalPointer,
        glOrtho,
        glPassThrough,
        glPixelMapfv,
        glPixelMapusv,
        glPixelMapuiv,
        glPixelTransferi,
        glPixelTransferf,
        glPixelZoom,
        glPolygonStipple,
        glPushAttrib,
        glPushClientAttrib,
        glPopAttrib,
        glPopClientAttrib,
        glPopMatrix,
        glPopName,
        glPrioritizeTextures,
        glPushMatrix,
        glPushName,
        glRasterPos2i,
        glRasterPos2s,
        glRasterPos2f,
        glRasterPos2d,
        glRasterPos2iv,
        glRasterPos2sv,
        glRasterPos2fv,
        glRasterPos2dv,
        glRasterPos3i,
        glRasterPos3s,
        glRasterPos3f,
        glRasterPos3d,
        glRasterPos3iv,
        glRasterPos3sv,
        glRasterPos3fv,
        glRasterPos3dv,
        glRasterPos4i,
        glRasterPos4s,
        glRasterPos4f,
        glRasterPos4d,
        glRasterPos4iv,
        glRasterPos4sv,
        glRasterPos4fv,
        glRasterPos4dv,
        glRecti,
        glRects,
        glRectf,
        glRectd,
        glRectiv,
        glRectsv,
        glRectfv,
        glRectdv,
        glRenderMode,
        glRotatef,
        glRotated,
        glScalef,
        glScaled,
        glSelectBuffer,
        glShadeModel,
        glTexCoord1f,
        glTexCoord1s,
        glTexCoord1i,
        glTexCoord1d,
        glTexCoord1fv,
        glTexCoord1sv,
        glTexCoord1iv,
        glTexCoord1dv,
        glTexCoord2f,
        glTexCoord2s,
        glTexCoord2i,
        glTexCoord2d,
        glTexCoord2fv,
        glTexCoord2sv,
        glTexCoord2iv,
        glTexCoord2dv,
        glTexCoord3f,
        glTexCoord3s,
        glTexCoord3i,
        glTexCoord3d,
        glTexCoord3fv,
        glTexCoord3sv,
        glTexCoord3iv,
        glTexCoord3dv,
        glTexCoord4f,
        glTexCoord4s,
        glTexCoord4i,
        glTexCoord4d,
        glTexCoord4fv,
        glTexCoord4sv,
        glTexCoord4iv,
        glTexCoord4dv,
        glTexCoordPointer,
        glTexEnvi,
        glTexEnviv,
        glTexEnvf,
        glTexEnvfv,
        glTexGeni,
        glTexGeniv,
        glTexGenf,
        glTexGenfv,
        glTexGend,
        glTexGendv,
        glTranslatef,
        glTranslated,
        glVertex2f,
        glVertex2s,
        glVertex2i,
        glVertex2d,
        glVertex2fv,
        glVertex2sv,
        glVertex2iv,
        glVertex2dv,
        glVertex3f,
        glVertex3s,
        glVertex3i,
        glVertex3d,
        glVertex3fv,
        glVertex3sv,
        glVertex3iv,
        glVertex3dv,
        glVertex4f,
        glVertex4s,
        glVertex4i,
        glVertex4d,
        glVertex4fv,
        glVertex4sv,
        glVertex4iv,
        glVertex4dv,
        glVertexPointer,
        glEnable,
        glDisable,
        glBindTexture,
        glBlendFunc,
        glClear,
        glClearColor,
        glClearDepth,
        glClearStencil,
        glColorMask,
        glCullFace,
        glDepthFunc,
        glDepthMask,
        glDepthRange,
        glDrawArrays,
        glDrawBuffer,
        glDrawElements,
        glFinish,
        glFlush,
        glFrontFace,
        glGenTextures,
        glDeleteTextures,
        glGetBooleanv,
        glGetFloatv,
        glGetIntegerv,
        glGetDoublev,
        glGetError,
        glGetPointerv,
        glGetString,
        glGetTexImage,
        glGetTexLevelParameteriv,
        glGetTexLevelParameterfv,
        glGetTexParameteriv,
        glGetTexParameterfv,
        glHint,
        glIsEnabled,
        glIsTexture,
        glLineWidth,
        glLogicOp,
        glPixelStorei,
        glPixelStoref,
        glPointSize,
        glPolygonMode,
        glPolygonOffset,
        glReadBuffer,
        glReadPixels,
        glScissor,
        glStencilFunc,
        glStencilMask,
        glStencilOp,
        glTexImage1D,
        glTexImage2D,
        glCopyTexImage1D,
        glCopyTexImage2D,
        glCopyTexSubImage1D,
        glCopyTexSubImage2D,
        glTexParameteri,
        glTexParameteriv,
        glTexParameterf,
        glTexParameterfv,
        glTexSubImage1D,
        glTexSubImage2D,
        glViewport,
        glTexImage3D,
        glTexSubImage3D,
        glCopyTexSubImage3D,
        glDrawRangeElements,
        glClientActiveTexture,
        glMultiTexCoord1f,
        glMultiTexCoord1s,
        glMultiTexCoord1i,
        glMultiTexCoord1d,
        glMultiTexCoord1fv,
        glMultiTexCoord1sv,
        glMultiTexCoord1iv,
        glMultiTexCoord1dv,
        glMultiTexCoord2f,
        glMultiTexCoord2s,
        glMultiTexCoord2i,
        glMultiTexCoord2d,
        glMultiTexCoord2fv,
        glMultiTexCoord2sv,
        glMultiTexCoord2iv,
        glMultiTexCoord2dv,
        glMultiTexCoord3f,
        glMultiTexCoord3s,
        glMultiTexCoord3i,
        glMultiTexCoord3d,
        glMultiTexCoord3fv,
        glMultiTexCoord3sv,
        glMultiTexCoord3iv,
        glMultiTexCoord3dv,
        glMultiTexCoord4f,
        glMultiTexCoord4s,
        glMultiTexCoord4i,
        glMultiTexCoord4d,
        glMultiTexCoord4fv,
        glMultiTexCoord4sv,
        glMultiTexCoord4iv,
        glMultiTexCoord4dv,
        glLoadTransposeMatrixf,
        glLoadTransposeMatrixd,
        glMultTransposeMatrixf,
        glMultTransposeMatrixd,
        glCompressedTexImage3D,
        glCompressedTexImage2D,
        glCompressedTexImage1D,
        glCompressedTexSubImage3D,
        glCompressedTexSubImage2D,
        glCompressedTexSubImage1D,
        glGetCompressedTexImage,
        glSampleCoverage,
        glActiveTexture,
        glFogCoordf,
        glFogCoordd,
        glFogCoordfv,
        glFogCoorddv,
        glFogCoordPointer,
        glSecondaryColor3b,
        glSecondaryColor3s,
        glSecondaryColor3i,
        glSecondaryColor3f,
        glSecondaryColor3d,
        glSecondaryColor3ub,
        glSecondaryColor3us,
        glSecondaryColor3ui,
        glSecondaryColor3bv,
        glSecondaryColor3sv,
        glSecondaryColor3iv,
        glSecondaryColor3fv,
        glSecondaryColor3dv,
        glSecondaryColor3ubv,
        glSecondaryColor3usv,
        glSecondaryColor3uiv,
        glSecondaryColorPointer,
        glWindowPos2i,
        glWindowPos2s,
        glWindowPos2f,
        glWindowPos2d,
        glWindowPos2iv,
        glWindowPos2sv,
        glWindowPos2fv,
        glWindowPos2dv,
        glWindowPos3i,
        glWindowPos3s,
        glWindowPos3f,
        glWindowPos3d,
        glWindowPos3iv,
        glWindowPos3sv,
        glWindowPos3fv,
        glWindowPos3dv,
        glBlendColor,
        glBlendEquation,
        glMultiDrawArrays,
        glMultiDrawElements,
        glPointParameterf,
        glPointParameteri,
        glPointParameterfv,
        glPointParameteriv,
        glBlendFuncSeparate,
        glBindBuffer,
        glDeleteBuffers,
        glGenBuffers,
        glIsBuffer,
        glBufferData,
        glBufferSubData,
        glGetBufferSubData,
        glMapBuffer,
        glUnmapBuffer,
        glGetBufferParameteriv,
        glGetBufferPointerv,
        glGenQueries,
        glDeleteQueries,
        glIsQuery,
        glBeginQuery,
        glEndQuery,
        glGetQueryiv,
        glGetQueryObjectiv,
        glGetQueryObjectuiv,
        glCreateProgram,
        glDeleteProgram,
        glIsProgram,
        glCreateShader,
        glDeleteShader,
        glIsShader,
        glAttachShader,
        glDetachShader,
        glShaderSource,
        glCompileShader,
        glLinkProgram,
        glUseProgram,
        glValidateProgram,
        glUniform1f,
        glUniform2f,
        glUniform3f,
        glUniform4f,
        glUniform1i,
        glUniform2i,
        glUniform3i,
        glUniform4i,
        glUniform1fv,
        glUniform2fv,
        glUniform3fv,
        glUniform4fv,
        glUniform1iv,
        glUniform2iv,
        glUniform3iv,
        glUniform4iv,
        glUniformMatrix2fv,
        glUniformMatrix3fv,
        glUniformMatrix4fv,
        glGetShaderiv,
        glGetProgramiv,
        glGetShaderInfoLog,
        glGetProgramInfoLog,
        glGetAttachedShaders,
        glGetUniformLocation,
        glGetActiveUniform,
        glGetUniformfv,
        glGetUniformiv,
        glGetShaderSource,
        glVertexAttrib1f,
        glVertexAttrib1s,
        glVertexAttrib1d,
        glVertexAttrib2f,
        glVertexAttrib2s,
        glVertexAttrib2d,
        glVertexAttrib3f,
        glVertexAttrib3s,
        glVertexAttrib3d,
        glVertexAttrib4f,
        glVertexAttrib4s,
        glVertexAttrib4d,
        glVertexAttrib4Nub,
        glVertexAttrib1fv,
        glVertexAttrib1sv,
        glVertexAttrib1dv,
        glVertexAttrib2fv,
        glVertexAttrib2sv,
        glVertexAttrib2dv,
        glVertexAttrib3fv,
        glVertexAttrib3sv,
        glVertexAttrib3dv,
        glVertexAttrib4fv,
        glVertexAttrib4sv,
        glVertexAttrib4dv,
        glVertexAttrib4iv,
        glVertexAttrib4bv,
        glVertexAttrib4ubv,
        glVertexAttrib4usv,
        glVertexAttrib4uiv,
        glVertexAttrib4Nbv,
        glVertexAttrib4Nsv,
        glVertexAttrib4Niv,
        glVertexAttrib4Nubv,
        glVertexAttrib4Nusv,
        glVertexAttrib4Nuiv,
        glVertexAttribPointer,
        glEnableVertexAttribArray,
        glDisableVertexAttribArray,
        glBindAttribLocation,
        glGetActiveAttrib,
        glGetAttribLocation,
        glGetVertexAttribiv,
        glGetVertexAttribfv,
        glGetVertexAttribdv,
        glGetVertexAttribPointerv,
        glDrawBuffers,
        glBlendEquationSeparate,
        glStencilOpSeparate,
        glStencilFuncSeparate,
        glStencilMaskSeparate,
        glUniformMatrix2x3fv,
        glUniformMatrix3x2fv,
        glUniformMatrix2x4fv,
        glUniformMatrix4x2fv,
        glUniformMatrix3x4fv,
        glUniformMatrix4x3fv,
        glGetStringi,
        glClearBufferiv,
        glClearBufferuiv,
        glClearBufferfv,
        glClearBufferfi,
        glVertexAttribI1i,
        glVertexAttribI2i,
        glVertexAttribI3i,
        glVertexAttribI4i,
        glVertexAttribI1ui,
        glVertexAttribI2ui,
        glVertexAttribI3ui,
        glVertexAttribI4ui,
        glVertexAttribI1iv,
        glVertexAttribI2iv,
        glVertexAttribI3iv,
        glVertexAttribI4iv,
        glVertexAttribI1uiv,
        glVertexAttribI2uiv,
        glVertexAttribI3uiv,
        glVertexAttribI4uiv,
        glVertexAttribI4bv,
        glVertexAttribI4sv,
        glVertexAttribI4ubv,
        glVertexAttribI4usv,
        glVertexAttribIPointer,
        glGetVertexAttribIiv,
        glGetVertexAttribIuiv,
        glUniform1ui,
        glUniform2ui,
        glUniform3ui,
        glUniform4ui,
        glUniform1uiv,
        glUniform2uiv,
        glUniform3uiv,
        glUniform4uiv,
        glGetUniformuiv,
        glBindFragDataLocation,
        glGetFragDataLocation,
        glBeginConditionalRender,
        glEndConditionalRender,
        glMapBufferRange,
        glFlushMappedBufferRange,
        glClampColor,
        glIsRenderbuffer,
        glBindRenderbuffer,
        glDeleteRenderbuffers,
        glGenRenderbuffers,
        glRenderbufferStorage,
        glRenderbufferStorageMultisample,
        glGetRenderbufferParameteriv,
        glIsFramebuffer,
        glBindFramebuffer,
        glDeleteFramebuffers,
        glGenFramebuffers,
        glCheckFramebufferStatus,
        glFramebufferTexture1D,
        glFramebufferTexture2D,
        glFramebufferTexture3D,
        glFramebufferTextureLayer,
        glFramebufferRenderbuffer,
        glGetFramebufferAttachmentParameteriv,
        glBlitFramebuffer,
        glGenerateMipmap,
        glTexParameterIiv,
        glTexParameterIuiv,
        glGetTexParameterIiv,
        glGetTexParameterIuiv,
        glColorMaski,
        glGetBooleani_v,
        glGetIntegeri_v,
        glEnablei,
        glDisablei,
        glIsEnabledi,
        glBindBufferRange,
        glBindBufferBase,
        glBeginTransformFeedback,
        glEndTransformFeedback,
        glTransformFeedbackVaryings,
        glGetTransformFeedbackVarying,
        glBindVertexArray,
        glDeleteVertexArrays,
        glGenVertexArrays,
        glIsVertexArray,
        glDrawArraysInstanced,
        glDrawElementsInstanced,
        glCopyBufferSubData,
        glPrimitiveRestartIndex,
        glTexBuffer,
        glGetUniformIndices,
        glGetActiveUniformsiv,
        glGetActiveUniformName,
        glGetUniformBlockIndex,
        glGetActiveUniformBlockiv,
        glGetActiveUniformBlockName,
        glUniformBlockBinding,
        glGetBufferParameteri64v,
        glDrawElementsBaseVertex,
        glDrawRangeElementsBaseVertex,
        glDrawElementsInstancedBaseVertex,
        glMultiDrawElementsBaseVertex,
        glProvokingVertex,
        glTexImage2DMultisample,
        glTexImage3DMultisample,
        glGetMultisamplefv,
        glSampleMaski,
        glFramebufferTexture,
        glFenceSync,
        glIsSync,
        glDeleteSync,
        glClientWaitSync,
        glWaitSync,
        glGetInteger64v,
        glGetInteger64i_v,
        glGetSynciv,
        glVertexP2ui,
        glVertexP3ui,
        glVertexP4ui,
        glVertexP2uiv,
        glVertexP3uiv,
        glVertexP4uiv,
        glTexCoordP1ui,
        glTexCoordP2ui,
        glTexCoordP3ui,
        glTexCoordP4ui,
        glTexCoordP1uiv,
        glTexCoordP2uiv,
        glTexCoordP3uiv,
        glTexCoordP4uiv,
        glMultiTexCoordP1ui,
        glMultiTexCoordP2ui,
        glMultiTexCoordP3ui,
        glMultiTexCoordP4ui,
        glMultiTexCoordP1uiv,
        glMultiTexCoordP2uiv,
        glMultiTexCoordP3uiv,
        glMultiTexCoordP4uiv,
        glNormalP3ui,
        glNormalP3uiv,
        glColorP3ui,
        glColorP4ui,
        glColorP3uiv,
        glColorP4uiv,
        glSecondaryColorP3ui,
        glSecondaryColorP3uiv,
        glBindFragDataLocationIndexed,
        glGetFragDataIndex,
        glGenSamplers,
        glDeleteSamplers,
        glIsSampler,
        glBindSampler,
        glSamplerParameteri,
        glSamplerParameterf,
        glSamplerParameteriv,
        glSamplerParameterfv,
        glSamplerParameterIiv,
        glSamplerParameterIuiv,
        glGetSamplerParameteriv,
        glGetSamplerParameterfv,
        glGetSamplerParameterIiv,
        glGetSamplerParameterIuiv,
        glQueryCounter,
        glGetQueryObjecti64v,
        glGetQueryObjectui64v,
        glVertexAttribDivisor,
        glVertexAttribP1ui,
        glVertexAttribP2ui,
        glVertexAttribP3ui,
        glVertexAttribP4ui,
        glVertexAttribP1uiv,
        glVertexAttribP2uiv,
        glVertexAttribP3uiv,
        glVertexAttribP4uiv,
        glBlendEquationi,
        glBlendEquationSeparatei,
        glBlendFunci,
        glBlendFuncSeparatei,
        glDrawArraysIndirect,
        glDrawElementsIndirect,
        glUniform1d,
        glUniform2d,
        glUniform3d,
        glUniform4d,
        glUniform1dv,
        glUniform2dv,
        glUniform3dv,
        glUniform4dv,
        glUniformMatrix2dv,
        glUniformMatrix3dv,
        glUniformMatrix4dv,
        glUniformMatrix2x3dv,
        glUniformMatrix2x4dv,
        glUniformMatrix3x2dv,
        glUniformMatrix3x4dv,
        glUniformMatrix4x2dv,
        glUniformMatrix4x3dv,
        glGetUniformdv,
        glMinSampleShading,
        glGetSubroutineUniformLocation,
        glGetSubroutineIndex,
        glGetActiveSubroutineUniformiv,
        glGetActiveSubroutineUniformName,
        glGetActiveSubroutineName,
        glUniformSubroutinesuiv,
        glGetUniformSubroutineuiv,
        glGetProgramStageiv,
        glPatchParameteri,
        glPatchParameterfv,
        glBindTransformFeedback,
        glDeleteTransformFeedbacks,
        glGenTransformFeedbacks,
        glIsTransformFeedback,
        glPauseTransformFeedback,
        glResumeTransformFeedback,
        glDrawTransformFeedback,
        glDrawTransformFeedbackStream,
        glBeginQueryIndexed,
        glEndQueryIndexed,
        glGetQueryIndexediv,
        glReleaseShaderCompiler,
        glShaderBinary,
        glGetShaderPrecisionFormat,
        glDepthRangef,
        glClearDepthf,
        glGetProgramBinary,
        glProgramBinary,
        glProgramParameteri,
        glUseProgramStages,
        glActiveShaderProgram,
        glCreateShaderProgramv,
        glBindProgramPipeline,
        glDeleteProgramPipelines,
        glGenProgramPipelines,
        glIsProgramPipeline,
        glGetProgramPipelineiv,
        glProgramUniform1i,
        glProgramUniform2i,
        glProgramUniform3i,
        glProgramUniform4i,
        glProgramUniform1ui,
        glProgramUniform2ui,
        glProgramUniform3ui,
        glProgramUniform4ui,
        glProgramUniform1f,
        glProgramUniform2f,
        glProgramUniform3f,
        glProgramUniform4f,
        glProgramUniform1d,
        glProgramUniform2d,
        glProgramUniform3d,
        glProgramUniform4d,
        glProgramUniform1iv,
        glProgramUniform2iv,
        glProgramUniform3iv,
        glProgramUniform4iv,
        glProgramUniform1uiv,
        glProgramUniform2uiv,
        glProgramUniform3uiv,
        glProgramUniform4uiv,
        glProgramUniform1fv,
        glProgramUniform2fv,
        glProgramUniform3fv,
        glProgramUniform4fv,
        glProgramUniform1dv,
        glProgramUniform2dv,
        glProgramUniform3dv,
        glProgramUniform4dv,
        glProgramUniformMatrix2fv,
        glProgramUniformMatrix3fv,
        glProgramUniformMatrix4fv,
        glProgramUniformMatrix2dv,
        glProgramUniformMatrix3dv,
        glProgramUniformMatrix4dv,
        glProgramUniformMatrix2x3fv,
        glProgramUniformMatrix3x2fv,
        glProgramUniformMatrix2x4fv,
        glProgramUniformMatrix4x2fv,
        glProgramUniformMatrix3x4fv,
        glProgramUniformMatrix4x3fv,
        glProgramUniformMatrix2x3dv,
        glProgramUniformMatrix3x2dv,
        glProgramUniformMatrix2x4dv,
        glProgramUniformMatrix4x2dv,
        glProgramUniformMatrix3x4dv,
        glProgramUniformMatrix4x3dv,
        glValidateProgramPipeline,
        glGetProgramPipelineInfoLog,
        glVertexAttribL1d,
        glVertexAttribL2d,
        glVertexAttribL3d,
        glVertexAttribL4d,
        glVertexAttribL1dv,
        glVertexAttribL2dv,
        glVertexAttribL3dv,
        glVertexAttribL4dv,
        glVertexAttribLPointer,
        glGetVertexAttribLdv,
        glViewportArrayv,
        glViewportIndexedf,
        glViewportIndexedfv,
        glScissorArrayv,
        glScissorIndexed,
        glScissorIndexedv,
        glDepthRangeArrayv,
        glDepthRangeIndexed,
        glGetFloati_v,
        glGetDoublei_v,
        glGetActiveAtomicCounterBufferiv,
        glTexStorage1D,
        glTexStorage2D,
        glTexStorage3D,
        glDrawTransformFeedbackInstanced,
        glDrawTransformFeedbackStreamInstanced,
        glDrawArraysInstancedBaseInstance,
        glDrawElementsInstancedBaseInstance,
        glDrawElementsInstancedBaseVertexBaseInstance,
        glBindImageTexture,
        glMemoryBarrier,
        glGetInternalformativ,
        glClearBufferData,
        glClearBufferSubData,
        glDispatchCompute,
        glDispatchComputeIndirect,
        glCopyImageSubData,
        glDebugMessageControl,
        glDebugMessageInsert,
        glDebugMessageCallback,
        glGetDebugMessageLog,
        glPushDebugGroup,
        glPopDebugGroup,
        glObjectLabel,
        glGetObjectLabel,
        glObjectPtrLabel,
        glGetObjectPtrLabel,
        glFramebufferParameteri,
        glGetFramebufferParameteriv,
        glGetInternalformati64v,
        glInvalidateTexSubImage,
        glInvalidateTexImage,
        glInvalidateBufferSubData,
        glInvalidateBufferData,
        glInvalidateFramebuffer,
        glInvalidateSubFramebuffer,
        glMultiDrawArraysIndirect,
        glMultiDrawElementsIndirect,
        glGetProgramInterfaceiv,
        glGetProgramResourceIndex,
        glGetProgramResourceName,
        glGetProgramResourceiv,
        glGetProgramResourceLocation,
        glGetProgramResourceLocationIndex,
        glShaderStorageBlockBinding,
        glTexBufferRange,
        glTexStorage2DMultisample,
        glTexStorage3DMultisample,
        glTextureView,
        glBindVertexBuffer,
        glVertexAttribFormat,
        glVertexAttribIFormat,
        glVertexAttribLFormat,
        glVertexAttribBinding,
        glVertexBindingDivisor,
        glBufferStorage,
        glClearTexSubImage,
        glClearTexImage,
        glBindBuffersBase,
        glBindBuffersRange,
        glBindTextures,
        glBindSamplers,
        glBindImageTextures,
        glBindVertexBuffers,
        glGetnMapdv,
        glGetnMapfv,
        glGetnMapiv,
        glGetnPixelMapfv,
        glGetnPixelMapuiv,
        glGetnPixelMapusv,
        glGetnPolygonStipple,
        glGetnColorTable,
        glGetnConvolutionFilter,
        glGetnSeparableFilter,
        glGetnHistogram,
        glGetnMinmax,
        glClipControl,
        glCreateTransformFeedbacks,
        glTransformFeedbackBufferBase,
        glTransformFeedbackBufferRange,
        glGetTransformFeedbackiv,
        glGetTransformFeedbacki_v,
        glGetTransformFeedbacki64_v,
        glCreateBuffers,
        glNamedBufferStorage,
        glNamedBufferData,
        glNamedBufferSubData,
        glCopyNamedBufferSubData,
        glClearNamedBufferData,
        glClearNamedBufferSubData,
        glMapNamedBuffer,
        glMapNamedBufferRange,
        glUnmapNamedBuffer,
        glFlushMappedNamedBufferRange,
        glGetNamedBufferParameteriv,
        glGetNamedBufferParameteri64v,
        glGetNamedBufferPointerv,
        glGetNamedBufferSubData,
        glCreateFramebuffers,
        glNamedFramebufferRenderbuffer,
        glNamedFramebufferParameteri,
        glNamedFramebufferTexture,
        glNamedFramebufferTextureLayer,
        glNamedFramebufferDrawBuffer,
        glNamedFramebufferDrawBuffers,
        glNamedFramebufferReadBuffer,
        glInvalidateNamedFramebufferData,
        glInvalidateNamedFramebufferSubData,
        glClearNamedFramebufferiv,
        glClearNamedFramebufferuiv,
        glClearNamedFramebufferfv,
        glClearNamedFramebufferfi,
        glBlitNamedFramebuffer,
        glCheckNamedFramebufferStatus,
        glGetNamedFramebufferParameteriv,
        glGetNamedFramebufferAttachmentParameteriv,
        glCreateRenderbuffers,
        glNamedRenderbufferStorage,
        glNamedRenderbufferStorageMultisample,
        glGetNamedRenderbufferParameteriv,
        glCreateTextures,
        glTextureBuffer,
        glTextureBufferRange,
        glTextureStorage1D,
        glTextureStorage2D,
        glTextureStorage3D,
        glTextureStorage2DMultisample,
        glTextureStorage3DMultisample,
        glTextureSubImage1D,
        glTextureSubImage2D,
        glTextureSubImage3D,
        glCompressedTextureSubImage1D,
        glCompressedTextureSubImage2D,
        glCompressedTextureSubImage3D,
        glCopyTextureSubImage1D,
        glCopyTextureSubImage2D,
        glCopyTextureSubImage3D,
        glTextureParameterf,
        glTextureParameterfv,
        glTextureParameteri,
        glTextureParameterIiv,
        glTextureParameterIuiv,
        glTextureParameteriv,
        glGenerateTextureMipmap,
        glBindTextureUnit,
        glGetTextureImage,
        glGetCompressedTextureImage,
        glGetTextureLevelParameterfv,
        glGetTextureLevelParameteriv,
        glGetTextureParameterfv,
        glGetTextureParameterIiv,
        glGetTextureParameterIuiv,
        glGetTextureParameteriv,
        glCreateVertexArrays,
        glDisableVertexArrayAttrib,
        glEnableVertexArrayAttrib,
        glVertexArrayElementBuffer,
        glVertexArrayVertexBuffer,
        glVertexArrayVertexBuffers,
        glVertexArrayAttribFormat,
        glVertexArrayAttribIFormat,
        glVertexArrayAttribLFormat,
        glVertexArrayAttribBinding,
        glVertexArrayBindingDivisor,
        glGetVertexArrayiv,
        glGetVertexArrayIndexediv,
        glGetVertexArrayIndexed64iv,
        glCreateSamplers,
        glCreateProgramPipelines,
        glCreateQueries,
        glGetQueryBufferObjectiv,
        glGetQueryBufferObjectuiv,
        glGetQueryBufferObjecti64v,
        glGetQueryBufferObjectui64v,
        glMemoryBarrierByRegion,
        glGetTextureSubImage,
        glGetCompressedTextureSubImage,
        glTextureBarrier,
        glGetGraphicsResetStatus,
        glGetnTexImage,
        glReadnPixels,
        glGetnCompressedTexImage,
        glGetnUniformfv,
        glGetnUniformdv,
        glGetnUniformiv,
        glGetnUniformuiv,
        glMultiDrawArraysIndirectCount,
        glMultiDrawElementsIndirectCount,
        glPolygonOffsetClamp,
        glSpecializeShader,
        glDebugMessageEnableAMD,
        glDebugMessageInsertAMD,
        glDebugMessageCallbackAMD,
        glGetDebugMessageLogAMD,
        glBlendFuncIndexedAMD,
        glBlendFuncSeparateIndexedAMD,
        glBlendEquationIndexedAMD,
        glBlendEquationSeparateIndexedAMD,
        glVertexAttribParameteriAMD,
        glQueryObjectParameteruiAMD,
        glGetPerfMonitorGroupsAMD,
        glGetPerfMonitorCountersAMD,
        glGetPerfMonitorGroupStringAMD,
        glGetPerfMonitorCounterStringAMD,
        glGetPerfMonitorCounterInfoAMD,
        glGenPerfMonitorsAMD,
        glDeletePerfMonitorsAMD,
        glSelectPerfMonitorCountersAMD,
        glBeginPerfMonitorAMD,
        glEndPerfMonitorAMD,
        glGetPerfMonitorCounterDataAMD,
        glSetMultisamplefvAMD,
        glTexStorageSparseAMD,
        glTextureStorageSparseAMD,
        glStencilOpValueAMD,
        glTessellationFactorAMD,
        glTessellationModeAMD,
        glGetTextureHandleARB,
        glGetTextureSamplerHandleARB,
        glMakeTextureHandleResidentARB,
        glMakeTextureHandleNonResidentARB,
        glGetImageHandleARB,
        glMakeImageHandleResidentARB,
        glMakeImageHandleNonResidentARB,
        glUniformHandleui64ARB,
        glUniformHandleui64vARB,
        glProgramUniformHandleui64ARB,
        glProgramUniformHandleui64vARB,
        glIsTextureHandleResidentARB,
        glIsImageHandleResidentARB,
        glVertexAttribL1ui64ARB,
        glVertexAttribL1ui64vARB,
        glGetVertexAttribLui64vARB,
        glNamedBufferStorageEXT,
        glCreateSyncFromCLeventARB,
        glClearNamedBufferDataEXT,
        glClearNamedBufferSubDataEXT,
        glClampColorARB,
        glDispatchComputeGroupSizeARB,
        glDebugMessageControlARB,
        glDebugMessageInsertARB,
        glDebugMessageCallbackARB,
        glGetDebugMessageLogARB,
        glDrawBuffersARB,
        glBlendEquationiARB,
        glBlendEquationSeparateiARB,
        glBlendFunciARB,
        glBlendFuncSeparateiARB,
        glDrawArraysInstancedARB,
        glDrawElementsInstancedARB,
        glPrimitiveBoundingBoxARB,
        glNamedFramebufferParameteriEXT,
        glGetNamedFramebufferParameterivEXT,
        glProgramParameteriARB,
        glFramebufferTextureARB,
        glFramebufferTextureLayerARB,
        glFramebufferTextureFaceARB,
        glSpecializeShaderARB,
        glProgramUniform1dEXT,
        glProgramUniform2dEXT,
        glProgramUniform3dEXT,
        glProgramUniform4dEXT,
        glProgramUniform1dvEXT,
        glProgramUniform2dvEXT,
        glProgramUniform3dvEXT,
        glProgramUniform4dvEXT,
        glProgramUniformMatrix2dvEXT,
        glProgramUniformMatrix3dvEXT,
        glProgramUniformMatrix4dvEXT,
        glProgramUniformMatrix2x3dvEXT,
        glProgramUniformMatrix2x4dvEXT,
        glProgramUniformMatrix3x2dvEXT,
        glProgramUniformMatrix3x4dvEXT,
        glProgramUniformMatrix4x2dvEXT,
        glProgramUniformMatrix4x3dvEXT,
        glUniform1i64ARB,
        glUniform1i64vARB,
        glProgramUniform1i64ARB,
        glProgramUniform1i64vARB,
        glUniform2i64ARB,
        glUniform2i64vARB,
        glProgramUniform2i64ARB,
        glProgramUniform2i64vARB,
        glUniform3i64ARB,
        glUniform3i64vARB,
        glProgramUniform3i64ARB,
        glProgramUniform3i64vARB,
        glUniform4i64ARB,
        glUniform4i64vARB,
        glProgramUniform4i64ARB,
        glProgramUniform4i64vARB,
        glUniform1ui64ARB,
        glUniform1ui64vARB,
        glProgramUniform1ui64ARB,
        glProgramUniform1ui64vARB,
        glUniform2ui64ARB,
        glUniform2ui64vARB,
        glProgramUniform2ui64ARB,
        glProgramUniform2ui64vARB,
        glUniform3ui64ARB,
        glUniform3ui64vARB,
        glProgramUniform3ui64ARB,
        glProgramUniform3ui64vARB,
        glUniform4ui64ARB,
        glUniform4ui64vARB,
        glProgramUniform4ui64ARB,
        glProgramUniform4ui64vARB,
        glGetUniformi64vARB,
        glGetUniformui64vARB,
        glGetnUniformi64vARB,
        glGetnUniformui64vARB,
        glColorTable,
        glCopyColorTable,
        glColorTableParameteriv,
        glColorTableParameterfv,
        glGetColorTable,
        glGetColorTableParameteriv,
        glGetColorTableParameterfv,
        glColorSubTable,
        glCopyColorSubTable,
        glConvolutionFilter1D,
        glConvolutionFilter2D,
        glCopyConvolutionFilter1D,
        glCopyConvolutionFilter2D,
        glGetConvolutionFilter,
        glSeparableFilter2D,
        glGetSeparableFilter,
        glConvolutionParameteri,
        glConvolutionParameteriv,
        glConvolutionParameterf,
        glConvolutionParameterfv,
        glGetConvolutionParameteriv,
        glGetConvolutionParameterfv,
        glHistogram,
        glResetHistogram,
        glGetHistogram,
        glGetHistogramParameteriv,
        glGetHistogramParameterfv,
        glMinmax,
        glResetMinmax,
        glGetMinmax,
        glGetMinmaxParameteriv,
        glGetMinmaxParameterfv,
        glMultiDrawArraysIndirectCountARB,
        glMultiDrawElementsIndirectCountARB,
        glVertexAttribDivisorARB,
        glVertexArrayVertexAttribDivisorEXT,
        glCurrentPaletteMatrixARB,
        glMatrixIndexuivARB,
        glMatrixIndexubvARB,
        glMatrixIndexusvARB,
        glMatrixIndexPointerARB,
        glSampleCoverageARB,
        glActiveTextureARB,
        glClientActiveTextureARB,
        glMultiTexCoord1fARB,
        glMultiTexCoord1sARB,
        glMultiTexCoord1iARB,
        glMultiTexCoord1dARB,
        glMultiTexCoord1fvARB,
        glMultiTexCoord1svARB,
        glMultiTexCoord1ivARB,
        glMultiTexCoord1dvARB,
        glMultiTexCoord2fARB,
        glMultiTexCoord2sARB,
        glMultiTexCoord2iARB,
        glMultiTexCoord2dARB,
        glMultiTexCoord2fvARB,
        glMultiTexCoord2svARB,
        glMultiTexCoord2ivARB,
        glMultiTexCoord2dvARB,
        glMultiTexCoord3fARB,
        glMultiTexCoord3sARB,
        glMultiTexCoord3iARB,
        glMultiTexCoord3dARB,
        glMultiTexCoord3fvARB,
        glMultiTexCoord3svARB,
        glMultiTexCoord3ivARB,
        glMultiTexCoord3dvARB,
        glMultiTexCoord4fARB,
        glMultiTexCoord4sARB,
        glMultiTexCoord4iARB,
        glMultiTexCoord4dARB,
        glMultiTexCoord4fvARB,
        glMultiTexCoord4svARB,
        glMultiTexCoord4ivARB,
        glMultiTexCoord4dvARB,
        glGenQueriesARB,
        glDeleteQueriesARB,
        glIsQueryARB,
        glBeginQueryARB,
        glEndQueryARB,
        glGetQueryivARB,
        glGetQueryObjectivARB,
        glGetQueryObjectuivARB,
        glMaxShaderCompilerThreadsARB,
        glPointParameterfARB,
        glPointParameterfvARB,
        glGetGraphicsResetStatusARB,
        glGetnMapdvARB,
        glGetnMapfvARB,
        glGetnMapivARB,
        glGetnPixelMapfvARB,
        glGetnPixelMapuivARB,
        glGetnPixelMapusvARB,
        glGetnPolygonStippleARB,
        glGetnTexImageARB,
        glReadnPixelsARB,
        glGetnColorTableARB,
        glGetnConvolutionFilterARB,
        glGetnSeparableFilterARB,
        glGetnHistogramARB,
        glGetnMinmaxARB,
        glGetnCompressedTexImageARB,
        glGetnUniformfvARB,
        glGetnUniformivARB,
        glGetnUniformuivARB,
        glGetnUniformdvARB,
        glFramebufferSampleLocationsfvARB,
        glNamedFramebufferSampleLocationsfvARB,
        glEvaluateDepthValuesARB,
        glMinSampleShadingARB,
        glDeleteObjectARB,
        glGetHandleARB,
        glDetachObjectARB,
        glCreateShaderObjectARB,
        glShaderSourceARB,
        glCompileShaderARB,
        glCreateProgramObjectARB,
        glAttachObjectARB,
        glLinkProgramARB,
        glUseProgramObjectARB,
        glValidateProgramARB,
        glUniform1fARB,
        glUniform2fARB,
        glUniform3fARB,
        glUniform4fARB,
        glUniform1iARB,
        glUniform2iARB,
        glUniform3iARB,
        glUniform4iARB,
        glUniform1fvARB,
        glUniform2fvARB,
        glUniform3fvARB,
        glUniform4fvARB,
        glUniform1ivARB,
        glUniform2ivARB,
        glUniform3ivARB,
        glUniform4ivARB,
        glUniformMatrix2fvARB,
        glUniformMatrix3fvARB,
        glUniformMatrix4fvARB,
        glGetObjectParameterfvARB,
        glGetObjectParameterivARB,
        glGetInfoLogARB,
        glGetAttachedObjectsARB,
        glGetUniformLocationARB,
        glGetActiveUniformARB,
        glGetUniformfvARB,
        glGetUniformivARB,
        glGetShaderSourceARB,
        glNamedStringARB,
        glDeleteNamedStringARB,
        glCompileShaderIncludeARB,
        glIsNamedStringARB,
        glGetNamedStringARB,
        glGetNamedStringivARB,
        glBufferPageCommitmentARB,
        glNamedBufferPageCommitmentEXT,
        glNamedBufferPageCommitmentARB,
        glTexPageCommitmentARB,
        glTexturePageCommitmentEXT,
        glTexBufferARB,
        glTextureBufferRangeEXT,
        glCompressedTexImage3DARB,
        glCompressedTexImage2DARB,
        glCompressedTexImage1DARB,
        glCompressedTexSubImage3DARB,
        glCompressedTexSubImage2DARB,
        glCompressedTexSubImage1DARB,
        glGetCompressedTexImageARB,
        glTextureStorage1DEXT,
        glTextureStorage2DEXT,
        glTextureStorage3DEXT,
        glTextureStorage2DMultisampleEXT,
        glTextureStorage3DMultisampleEXT,
        glLoadTransposeMatrixfARB,
        glLoadTransposeMatrixdARB,
        glMultTransposeMatrixfARB,
        glMultTransposeMatrixdARB,
        glVertexArrayVertexAttribLOffsetEXT,
        glVertexArrayBindVertexBufferEXT,
        glVertexArrayVertexAttribFormatEXT,
        glVertexArrayVertexAttribIFormatEXT,
        glVertexArrayVertexAttribLFormatEXT,
        glVertexArrayVertexAttribBindingEXT,
        glVertexArrayVertexBindingDivisorEXT,
        glWeightfvARB,
        glWeightbvARB,
        glWeightubvARB,
        glWeightsvARB,
        glWeightusvARB,
        glWeightivARB,
        glWeightuivARB,
        glWeightdvARB,
        glWeightPointerARB,
        glVertexBlendARB,
        glBindBufferARB,
        glDeleteBuffersARB,
        glGenBuffersARB,
        glIsBufferARB,
        glBufferDataARB,
        glBufferSubDataARB,
        glGetBufferSubDataARB,
        glMapBufferARB,
        glUnmapBufferARB,
        glGetBufferParameterivARB,
        glGetBufferPointervARB,
        glProgramStringARB,
        glBindProgramARB,
        glDeleteProgramsARB,
        glGenProgramsARB,
        glProgramEnvParameter4dARB,
        glProgramEnvParameter4dvARB,
        glProgramEnvParameter4fARB,
        glProgramEnvParameter4fvARB,
        glProgramLocalParameter4dARB,
        glProgramLocalParameter4dvARB,
        glProgramLocalParameter4fARB,
        glProgramLocalParameter4fvARB,
        glGetProgramEnvParameterfvARB,
        glGetProgramEnvParameterdvARB,
        glGetProgramLocalParameterfvARB,
        glGetProgramLocalParameterdvARB,
        glGetProgramivARB,
        glGetProgramStringARB,
        glIsProgramARB,
        glVertexAttrib1fARB,
        glVertexAttrib1sARB,
        glVertexAttrib1dARB,
        glVertexAttrib2fARB,
        glVertexAttrib2sARB,
        glVertexAttrib2dARB,
        glVertexAttrib3fARB,
        glVertexAttrib3sARB,
        glVertexAttrib3dARB,
        glVertexAttrib4fARB,
        glVertexAttrib4sARB,
        glVertexAttrib4dARB,
        glVertexAttrib4NubARB,
        glVertexAttrib1fvARB,
        glVertexAttrib1svARB,
        glVertexAttrib1dvARB,
        glVertexAttrib2fvARB,
        glVertexAttrib2svARB,
        glVertexAttrib2dvARB,
        glVertexAttrib3fvARB,
        glVertexAttrib3svARB,
        glVertexAttrib3dvARB,
        glVertexAttrib4fvARB,
        glVertexAttrib4svARB,
        glVertexAttrib4dvARB,
        glVertexAttrib4ivARB,
        glVertexAttrib4bvARB,
        glVertexAttrib4ubvARB,
        glVertexAttrib4usvARB,
        glVertexAttrib4uivARB,
        glVertexAttrib4NbvARB,
        glVertexAttrib4NsvARB,
        glVertexAttrib4NivARB,
        glVertexAttrib4NubvARB,
        glVertexAttrib4NusvARB,
        glVertexAttrib4NuivARB,
        glVertexAttribPointerARB,
        glEnableVertexAttribArrayARB,
        glDisableVertexAttribArrayARB,
        glBindAttribLocationARB,
        glGetActiveAttribARB,
        glGetAttribLocationARB,
        glGetVertexAttribivARB,
        glGetVertexAttribfvARB,
        glGetVertexAttribdvARB,
        glGetVertexAttribPointervARB,
        glWindowPos2iARB,
        glWindowPos2sARB,
        glWindowPos2fARB,
        glWindowPos2dARB,
        glWindowPos2ivARB,
        glWindowPos2svARB,
        glWindowPos2fvARB,
        glWindowPos2dvARB,
        glWindowPos3iARB,
        glWindowPos3sARB,
        glWindowPos3fARB,
        glWindowPos3dARB,
        glWindowPos3ivARB,
        glWindowPos3svARB,
        glWindowPos3fvARB,
        glWindowPos3dvARB,
        glUniformBufferEXT,
        glGetUniformBufferSizeEXT,
        glGetUniformOffsetEXT,
        glBlendColorEXT,
        glBlendEquationSeparateEXT,
        glBlendFuncSeparateEXT,
        glBlendEquationEXT,
        glLockArraysEXT,
        glUnlockArraysEXT,
        glLabelObjectEXT,
        glGetObjectLabelEXT,
        glInsertEventMarkerEXT,
        glPushGroupMarkerEXT,
        glPopGroupMarkerEXT,
        glDepthBoundsEXT,
        glClientAttribDefaultEXT,
        glPushClientAttribDefaultEXT,
        glMatrixLoadfEXT,
        glMatrixLoaddEXT,
        glMatrixMultfEXT,
        glMatrixMultdEXT,
        glMatrixLoadIdentityEXT,
        glMatrixRotatefEXT,
        glMatrixRotatedEXT,
        glMatrixScalefEXT,
        glMatrixScaledEXT,
        glMatrixTranslatefEXT,
        glMatrixTranslatedEXT,
        glMatrixOrthoEXT,
        glMatrixFrustumEXT,
        glMatrixPushEXT,
        glMatrixPopEXT,
        glTextureParameteriEXT,
        glTextureParameterivEXT,
        glTextureParameterfEXT,
        glTextureParameterfvEXT,
        glTextureImage1DEXT,
        glTextureImage2DEXT,
        glTextureSubImage1DEXT,
        glTextureSubImage2DEXT,
        glCopyTextureImage1DEXT,
        glCopyTextureImage2DEXT,
        glCopyTextureSubImage1DEXT,
        glCopyTextureSubImage2DEXT,
        glGetTextureImageEXT,
        glGetTextureParameterfvEXT,
        glGetTextureParameterivEXT,
        glGetTextureLevelParameterfvEXT,
        glGetTextureLevelParameterivEXT,
        glTextureImage3DEXT,
        glTextureSubImage3DEXT,
        glCopyTextureSubImage3DEXT,
        glBindMultiTextureEXT,
        glMultiTexCoordPointerEXT,
        glMultiTexEnvfEXT,
        glMultiTexEnvfvEXT,
        glMultiTexEnviEXT,
        glMultiTexEnvivEXT,
        glMultiTexGendEXT,
        glMultiTexGendvEXT,
        glMultiTexGenfEXT,
        glMultiTexGenfvEXT,
        glMultiTexGeniEXT,
        glMultiTexGenivEXT,
        glGetMultiTexEnvfvEXT,
        glGetMultiTexEnvivEXT,
        glGetMultiTexGendvEXT,
        glGetMultiTexGenfvEXT,
        glGetMultiTexGenivEXT,
        glMultiTexParameteriEXT,
        glMultiTexParameterivEXT,
        glMultiTexParameterfEXT,
        glMultiTexParameterfvEXT,
        glMultiTexImage1DEXT,
        glMultiTexImage2DEXT,
        glMultiTexSubImage1DEXT,
        glMultiTexSubImage2DEXT,
        glCopyMultiTexImage1DEXT,
        glCopyMultiTexImage2DEXT,
        glCopyMultiTexSubImage1DEXT,
        glCopyMultiTexSubImage2DEXT,
        glGetMultiTexImageEXT,
        glGetMultiTexParameterfvEXT,
        glGetMultiTexParameterivEXT,
        glGetMultiTexLevelParameterfvEXT,
        glGetMultiTexLevelParameterivEXT,
        glMultiTexImage3DEXT,
        glMultiTexSubImage3DEXT,
        glCopyMultiTexSubImage3DEXT,
        glEnableClientStateIndexedEXT,
        glDisableClientStateIndexedEXT,
        glEnableClientStateiEXT,
        glDisableClientStateiEXT,
        glGetFloatIndexedvEXT,
        glGetDoubleIndexedvEXT,
        glGetPointerIndexedvEXT,
        glGetFloati_vEXT,
        glGetDoublei_vEXT,
        glGetPointeri_vEXT,
        glNamedProgramStringEXT,
        glNamedProgramLocalParameter4dEXT,
        glNamedProgramLocalParameter4dvEXT,
        glNamedProgramLocalParameter4fEXT,
        glNamedProgramLocalParameter4fvEXT,
        glGetNamedProgramLocalParameterdvEXT,
        glGetNamedProgramLocalParameterfvEXT,
        glGetNamedProgramivEXT,
        glGetNamedProgramStringEXT,
        glCompressedTextureImage3DEXT,
        glCompressedTextureImage2DEXT,
        glCompressedTextureImage1DEXT,
        glCompressedTextureSubImage3DEXT,
        glCompressedTextureSubImage2DEXT,
        glCompressedTextureSubImage1DEXT,
        glGetCompressedTextureImageEXT,
        glCompressedMultiTexImage3DEXT,
        glCompressedMultiTexImage2DEXT,
        glCompressedMultiTexImage1DEXT,
        glCompressedMultiTexSubImage3DEXT,
        glCompressedMultiTexSubImage2DEXT,
        glCompressedMultiTexSubImage1DEXT,
        glGetCompressedMultiTexImageEXT,
        glMatrixLoadTransposefEXT,
        glMatrixLoadTransposedEXT,
        glMatrixMultTransposefEXT,
        glMatrixMultTransposedEXT,
        glNamedBufferDataEXT,
        glNamedBufferSubDataEXT,
        glMapNamedBufferEXT,
        glUnmapNamedBufferEXT,
        glGetNamedBufferParameterivEXT,
        glGetNamedBufferSubDataEXT,
        glProgramUniform1fEXT,
        glProgramUniform2fEXT,
        glProgramUniform3fEXT,
        glProgramUniform4fEXT,
        glProgramUniform1iEXT,
        glProgramUniform2iEXT,
        glProgramUniform3iEXT,
        glProgramUniform4iEXT,
        glProgramUniform1fvEXT,
        glProgramUniform2fvEXT,
        glProgramUniform3fvEXT,
        glProgramUniform4fvEXT,
        glProgramUniform1ivEXT,
        glProgramUniform2ivEXT,
        glProgramUniform3ivEXT,
        glProgramUniform4ivEXT,
        glProgramUniformMatrix2fvEXT,
        glProgramUniformMatrix3fvEXT,
        glProgramUniformMatrix4fvEXT,
        glProgramUniformMatrix2x3fvEXT,
        glProgramUniformMatrix3x2fvEXT,
        glProgramUniformMatrix2x4fvEXT,
        glProgramUniformMatrix4x2fvEXT,
        glProgramUniformMatrix3x4fvEXT,
        glProgramUniformMatrix4x3fvEXT,
        glTextureBufferEXT,
        glMultiTexBufferEXT,
        glTextureParameterIivEXT,
        glTextureParameterIuivEXT,
        glGetTextureParameterIivEXT,
        glGetTextureParameterIuivEXT,
        glMultiTexParameterIivEXT,
        glMultiTexParameterIuivEXT,
        glGetMultiTexParameterIivEXT,
        glGetMultiTexParameterIuivEXT,
        glProgramUniform1uiEXT,
        glProgramUniform2uiEXT,
        glProgramUniform3uiEXT,
        glProgramUniform4uiEXT,
        glProgramUniform1uivEXT,
        glProgramUniform2uivEXT,
        glProgramUniform3uivEXT,
        glProgramUniform4uivEXT,
        glNamedProgramLocalParameters4fvEXT,
        glNamedProgramLocalParameterI4iEXT,
        glNamedProgramLocalParameterI4ivEXT,
        glNamedProgramLocalParametersI4ivEXT,
        glNamedProgramLocalParameterI4uiEXT,
        glNamedProgramLocalParameterI4uivEXT,
        glNamedProgramLocalParametersI4uivEXT,
        glGetNamedProgramLocalParameterIivEXT,
        glGetNamedProgramLocalParameterIuivEXT,
        glNamedRenderbufferStorageEXT,
        glGetNamedRenderbufferParameterivEXT,
        glNamedRenderbufferStorageMultisampleEXT,
        glNamedRenderbufferStorageMultisampleCoverageEXT,
        glCheckNamedFramebufferStatusEXT,
        glNamedFramebufferTexture1DEXT,
        glNamedFramebufferTexture2DEXT,
        glNamedFramebufferTexture3DEXT,
        glNamedFramebufferRenderbufferEXT,
        glGetNamedFramebufferAttachmentParameterivEXT,
        glGenerateTextureMipmapEXT,
        glGenerateMultiTexMipmapEXT,
        glFramebufferDrawBufferEXT,
        glFramebufferDrawBuffersEXT,
        glFramebufferReadBufferEXT,
        glGetFramebufferParameterivEXT,
        glNamedCopyBufferSubDataEXT,
        glNamedFramebufferTextureEXT,
        glNamedFramebufferTextureLayerEXT,
        glNamedFramebufferTextureFaceEXT,
        glTextureRenderbufferEXT,
        glMultiTexRenderbufferEXT,
        glVertexArrayVertexOffsetEXT,
        glVertexArrayColorOffsetEXT,
        glVertexArrayEdgeFlagOffsetEXT,
        glVertexArrayIndexOffsetEXT,
        glVertexArrayNormalOffsetEXT,
        glVertexArrayTexCoordOffsetEXT,
        glVertexArrayMultiTexCoordOffsetEXT,
        glVertexArrayFogCoordOffsetEXT,
        glVertexArraySecondaryColorOffsetEXT,
        glVertexArrayVertexAttribOffsetEXT,
        glVertexArrayVertexAttribIOffsetEXT,
        glEnableVertexArrayEXT,
        glDisableVertexArrayEXT,
        glEnableVertexArrayAttribEXT,
        glDisableVertexArrayAttribEXT,
        glGetVertexArrayIntegervEXT,
        glGetVertexArrayPointervEXT,
        glGetVertexArrayIntegeri_vEXT,
        glGetVertexArrayPointeri_vEXT,
        glMapNamedBufferRangeEXT,
        glFlushMappedNamedBufferRangeEXT,
        glColorMaskIndexedEXT,
        glGetBooleanIndexedvEXT,
        glGetIntegerIndexedvEXT,
        glEnableIndexedEXT,
        glDisableIndexedEXT,
        glIsEnabledIndexedEXT,
        glDrawArraysInstancedEXT,
        glDrawElementsInstancedEXT,
        glEGLImageTargetTexStorageEXT,
        glEGLImageTargetTextureStorageEXT,
        glBufferStorageExternalEXT,
        glNamedBufferStorageExternalEXT,
        glBlitFramebufferEXT,
        glRenderbufferStorageMultisampleEXT,
        glIsRenderbufferEXT,
        glBindRenderbufferEXT,
        glDeleteRenderbuffersEXT,
        glGenRenderbuffersEXT,
        glRenderbufferStorageEXT,
        glGetRenderbufferParameterivEXT,
        glIsFramebufferEXT,
        glBindFramebufferEXT,
        glDeleteFramebuffersEXT,
        glGenFramebuffersEXT,
        glCheckFramebufferStatusEXT,
        glFramebufferTexture1DEXT,
        glFramebufferTexture2DEXT,
        glFramebufferTexture3DEXT,
        glFramebufferRenderbufferEXT,
        glGetFramebufferAttachmentParameterivEXT,
        glGenerateMipmapEXT,
        glProgramParameteriEXT,
        glFramebufferTextureEXT,
        glFramebufferTextureFaceEXT,
        glProgramEnvParameters4fvEXT,
        glProgramLocalParameters4fvEXT,
        glVertexAttribI1iEXT,
        glVertexAttribI2iEXT,
        glVertexAttribI3iEXT,
        glVertexAttribI4iEXT,
        glVertexAttribI1uiEXT,
        glVertexAttribI2uiEXT,
        glVertexAttribI3uiEXT,
        glVertexAttribI4uiEXT,
        glVertexAttribI1ivEXT,
        glVertexAttribI2ivEXT,
        glVertexAttribI3ivEXT,
        glVertexAttribI4ivEXT,
        glVertexAttribI1uivEXT,
        glVertexAttribI2uivEXT,
        glVertexAttribI3uivEXT,
        glVertexAttribI4uivEXT,
        glVertexAttribI4bvEXT,
        glVertexAttribI4svEXT,
        glVertexAttribI4ubvEXT,
        glVertexAttribI4usvEXT,
        glVertexAttribIPointerEXT,
        glGetVertexAttribIivEXT,
        glGetVertexAttribIuivEXT,
        glGetUniformuivEXT,
        glBindFragDataLocationEXT,
        glGetFragDataLocationEXT,
        glUniform1uiEXT,
        glUniform2uiEXT,
        glUniform3uiEXT,
        glUniform4uiEXT,
        glUniform1uivEXT,
        glUniform2uivEXT,
        glUniform3uivEXT,
        glUniform4uivEXT,
        glGetUnsignedBytevEXT,
        glGetUnsignedBytei_vEXT,
        glDeleteMemoryObjectsEXT,
        glIsMemoryObjectEXT,
        glCreateMemoryObjectsEXT,
        glMemoryObjectParameterivEXT,
        glGetMemoryObjectParameterivEXT,
        glTexStorageMem2DEXT,
        glTexStorageMem2DMultisampleEXT,
        glTexStorageMem3DEXT,
        glTexStorageMem3DMultisampleEXT,
        glBufferStorageMemEXT,
        glTextureStorageMem2DEXT,
        glTextureStorageMem2DMultisampleEXT,
        glTextureStorageMem3DEXT,
        glTextureStorageMem3DMultisampleEXT,
        glNamedBufferStorageMemEXT,
        glTexStorageMem1DEXT,
        glTextureStorageMem1DEXT,
        glImportMemoryFdEXT,
        glImportMemoryWin32HandleEXT,
        glImportMemoryWin32NameEXT,
        glPointParameterfEXT,
        glPointParameterfvEXT,
        glPolygonOffsetClampEXT,
        glProvokingVertexEXT,
        glRasterSamplesEXT,
        glSecondaryColor3bEXT,
        glSecondaryColor3sEXT,
        glSecondaryColor3iEXT,
        glSecondaryColor3fEXT,
        glSecondaryColor3dEXT,
        glSecondaryColor3ubEXT,
        glSecondaryColor3usEXT,
        glSecondaryColor3uiEXT,
        glSecondaryColor3bvEXT,
        glSecondaryColor3svEXT,
        glSecondaryColor3ivEXT,
        glSecondaryColor3fvEXT,
        glSecondaryColor3dvEXT,
        glSecondaryColor3ubvEXT,
        glSecondaryColor3usvEXT,
        glSecondaryColor3uivEXT,
        glSecondaryColorPointerEXT,
        glGenSemaphoresEXT,
        glDeleteSemaphoresEXT,
        glIsSemaphoreEXT,
        glSemaphoreParameterui64vEXT,
        glGetSemaphoreParameterui64vEXT,
        glWaitSemaphoreEXT,
        glSignalSemaphoreEXT,
        glImportSemaphoreFdEXT,
        glImportSemaphoreWin32HandleEXT,
        glImportSemaphoreWin32NameEXT,
        glUseShaderProgramEXT,
        glActiveProgramEXT,
        glCreateShaderProgramEXT,
        glFramebufferFetchBarrierEXT,
        glBindImageTextureEXT,
        glMemoryBarrierEXT,
        glStencilClearTagEXT,
        glActiveStencilFaceEXT,
        glFramebufferTextureLayerEXT,
        glTexBufferEXT,
        glClearColorIiEXT,
        glClearColorIuiEXT,
        glTexParameterIivEXT,
        glTexParameterIuivEXT,
        glGetTexParameterIivEXT,
        glGetTexParameterIuivEXT,
        glGetQueryObjecti64vEXT,
        glGetQueryObjectui64vEXT,
        glBindBufferRangeEXT,
        glBindBufferOffsetEXT,
        glBindBufferBaseEXT,
        glBeginTransformFeedbackEXT,
        glEndTransformFeedbackEXT,
        glTransformFeedbackVaryingsEXT,
        glGetTransformFeedbackVaryingEXT,
        glVertexAttribL1dEXT,
        glVertexAttribL2dEXT,
        glVertexAttribL3dEXT,
        glVertexAttribL4dEXT,
        glVertexAttribL1dvEXT,
        glVertexAttribL2dvEXT,
        glVertexAttribL3dvEXT,
        glVertexAttribL4dvEXT,
        glVertexAttribLPointerEXT,
        glGetVertexAttribLdvEXT,
        glAcquireKeyedMutexWin32EXT,
        glReleaseKeyedMutexWin32EXT,
        glWindowRectanglesEXT,
        glImportSyncEXT,
        glFrameTerminatorGREMEDY,
        glStringMarkerGREMEDY,
        glApplyFramebufferAttachmentCMAAINTEL,
        glSyncTextureINTEL,
        glUnmapTexture2DINTEL,
        glMapTexture2DINTEL,
        glBeginPerfQueryINTEL,
        glCreatePerfQueryINTEL,
        glDeletePerfQueryINTEL,
        glEndPerfQueryINTEL,
        glGetFirstPerfQueryIdINTEL,
        glGetNextPerfQueryIdINTEL,
        glGetPerfCounterInfoINTEL,
        glGetPerfQueryDataINTEL,
        glGetPerfQueryIdByNameINTEL,
        glGetPerfQueryInfoINTEL,
        glBlendBarrierKHR,
        glMaxShaderCompilerThreadsKHR,
        glAlphaToCoverageDitherControlNV,
        glMultiDrawArraysIndirectBindlessNV,
        glMultiDrawElementsIndirectBindlessNV,
        glMultiDrawArraysIndirectBindlessCountNV,
        glMultiDrawElementsIndirectBindlessCountNV,
        glGetTextureHandleNV,
        glGetTextureSamplerHandleNV,
        glMakeTextureHandleResidentNV,
        glMakeTextureHandleNonResidentNV,
        glGetImageHandleNV,
        glMakeImageHandleResidentNV,
        glMakeImageHandleNonResidentNV,
        glUniformHandleui64NV,
        glUniformHandleui64vNV,
        glProgramUniformHandleui64NV,
        glProgramUniformHandleui64vNV,
        glIsTextureHandleResidentNV,
        glIsImageHandleResidentNV,
        glBlendParameteriNV,
        glBlendBarrierNV,
        glViewportPositionWScaleNV,
        glCreateStatesNV,
        glDeleteStatesNV,
        glIsStateNV,
        glStateCaptureNV,
        glGetCommandHeaderNV,
        glGetStageIndexNV,
        glDrawCommandsNV,
        glDrawCommandsAddressNV,
        glDrawCommandsStatesNV,
        glDrawCommandsStatesAddressNV,
        glCreateCommandListsNV,
        glDeleteCommandListsNV,
        glIsCommandListNV,
        glListDrawCommandsStatesClientNV,
        glCommandListSegmentsNV,
        glCompileCommandListNV,
        glCallCommandListNV,
        glBeginConditionalRenderNV,
        glEndConditionalRenderNV,
        glSubpixelPrecisionBiasNV,
        glConservativeRasterParameterfNV,
        glConservativeRasterParameteriNV,
        glCopyImageSubDataNV,
        glDepthRangedNV,
        glClearDepthdNV,
        glDepthBoundsdNV,
        glDrawTextureNV,
        glDrawVkImageNV,
        glGetVkProcAddrNV,
        glWaitVkSemaphoreNV,
        glSignalVkSemaphoreNV,
        glSignalVkFenceNV,
        glGetMultisamplefvNV,
        glSampleMaskIndexedNV,
        glTexRenderbufferNV,
        glDeleteFencesNV,
        glGenFencesNV,
        glIsFenceNV,
        glTestFenceNV,
        glGetFenceivNV,
        glFinishFenceNV,
        glSetFenceNV,
        glFragmentCoverageColorNV,
        glCoverageModulationTableNV,
        glGetCoverageModulationTableNV,
        glCoverageModulationNV,
        glRenderbufferStorageMultisampleCoverageNV,
        glRenderGpuMaskNV,
        glMulticastBufferSubDataNV,
        glMulticastCopyBufferSubDataNV,
        glMulticastCopyImageSubDataNV,
        glMulticastBlitFramebufferNV,
        glMulticastFramebufferSampleLocationsfvNV,
        glMulticastBarrierNV,
        glMulticastWaitSyncNV,
        glMulticastGetQueryObjectivNV,
        glMulticastGetQueryObjectuivNV,
        glMulticastGetQueryObjecti64vNV,
        glMulticastGetQueryObjectui64vNV,
        glUniform1i64NV,
        glUniform2i64NV,
        glUniform3i64NV,
        glUniform4i64NV,
        glUniform1i64vNV,
        glUniform2i64vNV,
        glUniform3i64vNV,
        glUniform4i64vNV,
        glUniform1ui64NV,
        glUniform2ui64NV,
        glUniform3ui64NV,
        glUniform4ui64NV,
        glUniform1ui64vNV,
        glUniform2ui64vNV,
        glUniform3ui64vNV,
        glUniform4ui64vNV,
        glGetUniformi64vNV,
        glProgramUniform1i64NV,
        glProgramUniform2i64NV,
        glProgramUniform3i64NV,
        glProgramUniform4i64NV,
        glProgramUniform1i64vNV,
        glProgramUniform2i64vNV,
        glProgramUniform3i64vNV,
        glProgramUniform4i64vNV,
        glProgramUniform1ui64NV,
        glProgramUniform2ui64NV,
        glProgramUniform3ui64NV,
        glProgramUniform4ui64NV,
        glProgramUniform1ui64vNV,
        glProgramUniform2ui64vNV,
        glProgramUniform3ui64vNV,
        glProgramUniform4ui64vNV,
        glVertex2hNV,
        glVertex2hvNV,
        glVertex3hNV,
        glVertex3hvNV,
        glVertex4hNV,
        glVertex4hvNV,
        glNormal3hNV,
        glNormal3hvNV,
        glColor3hNV,
        glColor3hvNV,
        glColor4hNV,
        glColor4hvNV,
        glTexCoord1hNV,
        glTexCoord1hvNV,
        glTexCoord2hNV,
        glTexCoord2hvNV,
        glTexCoord3hNV,
        glTexCoord3hvNV,
        glTexCoord4hNV,
        glTexCoord4hvNV,
        glMultiTexCoord1hNV,
        glMultiTexCoord1hvNV,
        glMultiTexCoord2hNV,
        glMultiTexCoord2hvNV,
        glMultiTexCoord3hNV,
        glMultiTexCoord3hvNV,
        glMultiTexCoord4hNV,
        glMultiTexCoord4hvNV,
        glFogCoordhNV,
        glFogCoordhvNV,
        glSecondaryColor3hNV,
        glSecondaryColor3hvNV,
        glVertexWeighthNV,
        glVertexWeighthvNV,
        glVertexAttrib1hNV,
        glVertexAttrib1hvNV,
        glVertexAttrib2hNV,
        glVertexAttrib2hvNV,
        glVertexAttrib3hNV,
        glVertexAttrib3hvNV,
        glVertexAttrib4hNV,
        glVertexAttrib4hvNV,
        glVertexAttribs1hvNV,
        glVertexAttribs2hvNV,
        glVertexAttribs3hvNV,
        glVertexAttribs4hvNV,
        glGetInternalformatSampleivNV,
        glPathCommandsNV,
        glPathCoordsNV,
        glPathSubCommandsNV,
        glPathSubCoordsNV,
        glPathStringNV,
        glPathGlyphsNV,
        glPathGlyphRangeNV,
        glPathGlyphIndexArrayNV,
        glPathMemoryGlyphIndexArrayNV,
        glCopyPathNV,
        glWeightPathsNV,
        glInterpolatePathsNV,
        glTransformPathNV,
        glPathParameterivNV,
        glPathParameteriNV,
        glPathParameterfvNV,
        glPathParameterfNV,
        glPathDashArrayNV,
        glGenPathsNV,
        glDeletePathsNV,
        glIsPathNV,
        glPathStencilFuncNV,
        glPathStencilDepthOffsetNV,
        glStencilFillPathNV,
        glStencilStrokePathNV,
        glStencilFillPathInstancedNV,
        glStencilStrokePathInstancedNV,
        glPathCoverDepthFuncNV,
        glPathColorGenNV,
        glPathTexGenNV,
        glPathFogGenNV,
        glCoverFillPathNV,
        glCoverStrokePathNV,
        glCoverFillPathInstancedNV,
        glCoverStrokePathInstancedNV,
        glStencilThenCoverFillPathNV,
        glStencilThenCoverStrokePathNV,
        glStencilThenCoverFillPathInstancedNV,
        glStencilThenCoverStrokePathInstancedNV,
        glPathGlyphIndexRangeNV,
        glProgramPathFragmentInputGenNV,
        glGetPathParameterivNV,
        glGetPathParameterfvNV,
        glGetPathCommandsNV,
        glGetPathCoordsNV,
        glGetPathDashArrayNV,
        glGetPathMetricsNV,
        glGetPathMetricRangeNV,
        glGetPathSpacingNV,
        glGetPathColorGenivNV,
        glGetPathColorGenfvNV,
        glGetPathTexGenivNV,
        glGetPathTexGenfvNV,
        glIsPointInFillPathNV,
        glIsPointInStrokePathNV,
        glGetPathLengthNV,
        glPointAlongPathNV,
        glMatrixLoad3x2fNV,
        glMatrixLoad3x3fNV,
        glMatrixLoadTranspose3x3fNV,
        glMatrixMult3x2fNV,
        glMatrixMult3x3fNV,
        glMatrixMultTranspose3x3fNV,
        glGetProgramResourcefvNV,
        glPixelDataRangeNV,
        glFlushPixelDataRangeNV,
        glPointParameteriNV,
        glPointParameterivNV,
        glPrimitiveRestartNV,
        glPrimitiveRestartIndexNV,
        glQueryResourceNV,
        glGenQueryResourceTagNV,
        glDeleteQueryResourceTagNV,
        glQueryResourceTagNV,
        glFramebufferSampleLocationsfvNV,
        glNamedFramebufferSampleLocationsfvNV,
        glResolveDepthValuesNV,
        glMakeBufferResidentNV,
        glMakeBufferNonResidentNV,
        glIsBufferResidentNV,
        glMakeNamedBufferResidentNV,
        glMakeNamedBufferNonResidentNV,
        glIsNamedBufferResidentNV,
        glGetBufferParameterui64vNV,
        glGetNamedBufferParameterui64vNV,
        glGetIntegerui64vNV,
        glUniformui64NV,
        glUniformui64vNV,
        glGetUniformui64vNV,
        glProgramUniformui64NV,
        glProgramUniformui64vNV,
        glTextureBarrierNV,
        glTexImage2DMultisampleCoverageNV,
        glTexImage3DMultisampleCoverageNV,
        glTextureImage2DMultisampleNV,
        glTextureImage3DMultisampleNV,
        glTextureImage2DMultisampleCoverageNV,
        glTextureImage3DMultisampleCoverageNV,
        glBeginTransformFeedbackNV,
        glEndTransformFeedbackNV,
        glTransformFeedbackAttribsNV,
        glBindBufferRangeNV,
        glBindBufferOffsetNV,
        glBindBufferBaseNV,
        glTransformFeedbackVaryingsNV,
        glActiveVaryingNV,
        glGetVaryingLocationNV,
        glGetActiveVaryingNV,
        glGetTransformFeedbackVaryingNV,
        glTransformFeedbackStreamAttribsNV,
        glBindTransformFeedbackNV,
        glDeleteTransformFeedbacksNV,
        glGenTransformFeedbacksNV,
        glIsTransformFeedbackNV,
        glPauseTransformFeedbackNV,
        glResumeTransformFeedbackNV,
        glDrawTransformFeedbackNV,
        glVertexArrayRangeNV,
        glFlushVertexArrayRangeNV,
        glVertexAttribL1i64NV,
        glVertexAttribL2i64NV,
        glVertexAttribL3i64NV,
        glVertexAttribL4i64NV,
        glVertexAttribL1i64vNV,
        glVertexAttribL2i64vNV,
        glVertexAttribL3i64vNV,
        glVertexAttribL4i64vNV,
        glVertexAttribL1ui64NV,
        glVertexAttribL2ui64NV,
        glVertexAttribL3ui64NV,
        glVertexAttribL4ui64NV,
        glVertexAttribL1ui64vNV,
        glVertexAttribL2ui64vNV,
        glVertexAttribL3ui64vNV,
        glVertexAttribL4ui64vNV,
        glGetVertexAttribLi64vNV,
        glGetVertexAttribLui64vNV,
        glVertexAttribLFormatNV,
        glBufferAddressRangeNV,
        glVertexFormatNV,
        glNormalFormatNV,
        glColorFormatNV,
        glIndexFormatNV,
        glTexCoordFormatNV,
        glEdgeFlagFormatNV,
        glSecondaryColorFormatNV,
        glFogCoordFormatNV,
        glVertexAttribFormatNV,
        glVertexAttribIFormatNV,
        glGetIntegerui64i_vNV,
        glViewportSwizzleNV,
        glBeginConditionalRenderNVX,
        glEndConditionalRenderNVX,
        glFramebufferTextureMultiviewOVR,
        glNamedFramebufferTextureMultiviewOVR;

    /** When true, {@link GL11} is supported. */
    public final boolean OpenGL11;
    /** When true, {@link GL12} is supported. */
    public final boolean OpenGL12;
    /** When true, {@link GL13} is supported. */
    public final boolean OpenGL13;
    /** When true, {@link GL14} is supported. */
    public final boolean OpenGL14;
    /** When true, {@link GL15} is supported. */
    public final boolean OpenGL15;
    /** When true, {@link GL20} is supported. */
    public final boolean OpenGL20;
    /** When true, {@link GL21} is supported. */
    public final boolean OpenGL21;
    /** When true, {@link GL30} is supported. */
    public final boolean OpenGL30;
    /** When true, {@link GL31} is supported. */
    public final boolean OpenGL31;
    /** When true, {@link GL32} is supported. */
    public final boolean OpenGL32;
    /** When true, {@link GL33} is supported. */
    public final boolean OpenGL33;
    /** When true, {@link GL40} is supported. */
    public final boolean OpenGL40;
    /** When true, {@link GL41} is supported. */
    public final boolean OpenGL41;
    /** When true, {@link GL42} is supported. */
    public final boolean OpenGL42;
    /** When true, {@link GL43} is supported. */
    public final boolean OpenGL43;
    /** When true, {@link GL44} is supported. */
    public final boolean OpenGL44;
    /** When true, {@link GL45} is supported. */
    public final boolean OpenGL45;
    /** When true, {@link GL46} is supported. */
    public final boolean OpenGL46;
    /** When true, {@link AMDBlendMinmaxFactor} is supported. */
    public final boolean GL_AMD_blend_minmax_factor;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_conservative_depth.txt">AMD_conservative_depth</a> extension is supported.
     * 
     * <p>There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
     * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.</p>
     * 
     * <p>This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
     * does not write to the built-in {@code gl_FragDepth} output). There are, however a class of operations on the depth in the shader which could still be
     * performed while allowing the early depth test to operate.</p>
     * 
     * <p>This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
     */
    public final boolean GL_AMD_conservative_depth;
    /** When true, {@link AMDDebugOutput} is supported. */
    public final boolean GL_AMD_debug_output;
    /** When true, {@link AMDDepthClampSeparate} is supported. */
    public final boolean GL_AMD_depth_clamp_separate;
    /** When true, {@link AMDDrawBuffersBlend} is supported. */
    public final boolean GL_AMD_draw_buffers_blend;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_gcn_shader.txt">AMD_gcn_shader</a> extension is supported.
     * 
     * <p>This extension exposes miscellaneous features of the AMD "Graphics Core Next" shader architecture that do not cleanly fit into other extensions
     * and are not significant enough alone to warrant their own extensions. This includes cross-SIMD lane ballots, cube map query functions and a
     * functionality to query the elapsed shader core time.</p>
     * 
     * <p>Requires {@link #GL_AMD_gpu_shader_int64 AMD_gpu_shader_int64} or {@link #GL_NV_gpu_shader5 NV_gpu_shader5}.</p>
     */
    public final boolean GL_AMD_gcn_shader;
    /** When true, {@link AMDGPUShaderHalfFloat} is supported. */
    public final boolean GL_AMD_gpu_shader_half_float;
    /** When true, {@link AMDGPUShaderHalfFloatFetch} is supported. */
    public final boolean GL_AMD_gpu_shader_half_float_fetch;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_gpu_shader_int16.txt">AMD_gpu_shader_int16</a> extension is supported.
     * 
     * <p>This extension was developed to allow implementations supporting 16-bit integers to expose the feature in GLSL.</p>
     * 
     * <p>The extension introduces the following features for all shader types:</p>
     * 
     * <ul>
     * <li>new built-in functions to pack and unpack 32-bit integer types into a two-component 16-bit integer vector;</li>
     * <li>new built-in functions to convert half-precision floating-point values to or from their 16-bit integer bit encodings;</li>
     * <li>vector relational functions supporting comparisons of vectors of 16-bit integer types; and</li>
     * <li>common functions abs, frexp, ldexp, sign, min, max, clamp, and mix supporting arguments of 16-bit integer types.</li>
     * </ul>
     * 
     * <p>Requires GLSL 4.00.</p>
     */
    public final boolean GL_AMD_gpu_shader_int16;
    /** When true, {@link AMDGPUShaderInt64} is supported. */
    public final boolean GL_AMD_gpu_shader_int64;
    /** When true, {@link AMDInterleavedElements} is supported. */
    public final boolean GL_AMD_interleaved_elements;
    /** When true, {@link AMDOcclusionQueryEvent} is supported. */
    public final boolean GL_AMD_occlusion_query_event;
    /** When true, {@link AMDPerformanceMonitor} is supported. */
    public final boolean GL_AMD_performance_monitor;
    /** When true, {@link AMDPinnedMemory} is supported. */
    public final boolean GL_AMD_pinned_memory;
    /** When true, {@link AMDQueryBufferObject} is supported. */
    public final boolean GL_AMD_query_buffer_object;
    /** When true, {@link AMDSamplePositions} is supported. */
    public final boolean GL_AMD_sample_positions;
    /** When true, {@link AMDSeamlessCubemapPerTexture} is supported. */
    public final boolean GL_AMD_seamless_cubemap_per_texture;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_atomic_counter_ops.txt">AMD_shader_atomic_counter_ops</a> extension is supported.
     * 
     * <p>This extension is written against the OpenGL 4.3 (core) specification and the GLSL 4.30.7 specification.</p>
     * 
     * <p>Requires {@link GL42 OpenGL 4.2} or {@link #GL_ARB_shader_atomic_counters ARB_shader_atomic_counters}.</p>
     */
    public final boolean GL_AMD_shader_atomic_counter_ops;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_ballot.txt">AMD_shader_ballot</a> extension is supported.
     * 
     * <p>The extensions {@code ARB_shader_group_vote} and {@code ARB_shader_ballot} introduced the concept of sub-groups and a set of operations that allow data
     * exchange across shader invocations within a sub-group.</p>
     * 
     * <p>This extension further extends the capabilities of these extensions with additional sub-group operations.</p>
     * 
     * <p>Requires {@link #GL_ARB_shader_group_vote ARB_shader_group_vote}, {@link #GL_ARB_shader_ballot ARB_shader_ballot} and {@link ARBGPUShaderInt64 ARB_gpu_shader_int64} or {@link AMDGPUShaderInt64 AMD_gpu_shader_int64}.</p>
     */
    public final boolean GL_AMD_shader_ballot;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_explicit_vertex_parameter.txt">AMD_shader_explicit_vertex_parameter</a> extension is supported.
     * 
     * <p>Unextended GLSL provides a set of fixed function interpolation modes and even those are limited to certain types of interpolants (for example,
     * interpolation of integer and double isn't supported).</p>
     * 
     * <p>This extension introduces new built-in functions allowing access to vertex parameters explicitly in the fragment shader. It also exposes barycentric
     * coordinates as new built-in variables, which can be used to implement custom interpolation algorithms using shader code.</p>
     * 
     * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}.</p>
     */
    public final boolean GL_AMD_shader_explicit_vertex_parameter;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_image_load_store_lod.txt">AMD_shader_image_load_store_lod</a> extension is supported.
     * 
     * <p>This extension was developed based on the {@link ARBShaderImageLoadStore ARB_shader_image_load_store} extension to allow implementations supporting loads and stores on mipmap
     * texture images.</p>
     * 
     * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00</p>
     */
    public final boolean GL_AMD_shader_image_load_store_lod;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_stencil_export.txt">AMD_shader_stencil_export</a> extension is supported.
     * 
     * <p>In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
     * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.</p>
     * 
     * <p>This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
     * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this allows a value generated
     * in the shader to be written to the stencil buffer directly.</p>
     * 
     * <p>Requires {@link #GL_ARB_fragment_shader ARB_fragment_shader}.</p>
     */
    public final boolean GL_AMD_shader_stencil_export;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_shader_trinary_minmax.txt">AMD_shader_trinary_minmax</a> extension is supported.
     * 
     * <p>This extension introduces three new trinary built-in functions to the OpenGL Shading Languages. These functions allow the minimum, maximum or median of
     * three inputs to be found with a single function call. These operations may be useful for sorting and filtering operations, for example. By explicitly
     * performing a trinary operation with a single built-in function, shader compilers and optimizers may be able to generate better instruction sequences for
     * perform sorting and other multi-input functions.</p>
     * 
     * <p>Requires {@link GL20 OpenGL 2.0} or {@link #GL_ARB_shader_objects ARB_shader_objects}.</p>
     */
    public final boolean GL_AMD_shader_trinary_minmax;
    /** When true, {@link AMDSparseTexture} is supported. */
    public final boolean GL_AMD_sparse_texture;
    /** When true, {@link AMDStencilOperationExtended} is supported. */
    public final boolean GL_AMD_stencil_operation_extended;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_texture_gather_bias_lod.txt">AMD_texture_gather_bias_lod</a> extension is supported.
     * 
     * <p>This extension was developed based on existing built-in texture gather functions to allow implementations supporting bias of implicit level of detail
     * and explicit control of level of detail in texture gather operations.</p>
     */
    public final boolean GL_AMD_texture_gather_bias_lod;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_texture_texture4.txt">AMD_texture_texture4</a> extension is supported.
     * 
     * <p>This extension adds new shading language built-in texture functions to the shading language.</p>
     * 
     * <p>These texture functions may be used to access one component textures.</p>
     * 
     * <p>The {@code texture4} built-in function returns a texture value derived from a 2x2 set of texels in the image array of level levelbase is selected. These
     * texels are selected in the same way as when the value of {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER} is {@link GL11#GL_LINEAR LINEAR}, but instead of these texels being filtered to generate the
     * texture value, the R, G, B and A texture values are derived directly from these four texels.</p>
     */
    public final boolean GL_AMD_texture_texture4;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_transform_feedback3_lines_triangles.txt">AMD_transform_feedback3_lines_triangles</a> extension is supported.
     * 
     * <p>OpenGL 4.0 introduced the ability to record primitives into multiple output streams using transform feedback. However, the restriction that all streams
     * must output {@link GL11#GL_POINT POINT} primitives when more than one output stream is active was also introduced. This extension simply removes that restriction, allowing
     * the same set of primitives to be used with multiple transform feedback streams as with a single stream.</p>
     * 
     * <p>Requires {@link GL40 OpenGL 4.0} or {@link ARBTransformFeedback3 ARB_transform_feedback3}.</p>
     */
    public final boolean GL_AMD_transform_feedback3_lines_triangles;
    /** When true, {@link AMDTransformFeedback4} is supported. */
    public final boolean GL_AMD_transform_feedback4;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_layer.txt">AMD_vertex_shader_layer</a> extension is supported.
     * 
     * <p>The {@code gl_Layer} built-in shading language variable was introduced with the {@link #GL_ARB_geometry_shader4 ARB_geometry_shader4} extension and subsequently promoted to core
     * OpenGL in version 3.2. This variable is an output from the geometry shader stage that allows rendering to be directed to a specific layer of an array
     * texture, slice of a 3D texture or face of a cube map or cube map array attachment of the framebuffer. Thus, this extremely useful functionality is only
     * available if a geometry shader is present - even if the geometry shader is not otherwise required by the application. This adds overhead to the graphics
     * processing pipeline, and complexity to applications. It also precludes implementations that cannot support geometry shaders from supporting rendering to
     * layered framebuffer attachments.</p>
     * 
     * <p>This extension exposes the {@code gl_Layer} built-in variable in the vertex shader, allowing rendering to be directed to layered framebuffer attachments
     * with only a vertex and fragment shader present. Combined with features such as instancing, or static vertex attributes and so on, this allows a wide
     * variety of techniques to be implemented without the requirement for a geometry shader to be present.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0} or {@link #GL_EXT_texture_array EXT_texture_array}.</p>
     */
    public final boolean GL_AMD_vertex_shader_layer;
    /** When true, {@link AMDVertexShaderTessellator} is supported. */
    public final boolean GL_AMD_vertex_shader_tessellator;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_vertex_shader_viewport_index.txt">AMD_vertex_shader_viewport_index</a> extension is supported.
     * 
     * <p>The {@code gl_ViewportIndex} built-in variable was introduced by the {@link #GL_ARB_viewport_array ARB_viewport_array} extension and {@link GL41 OpenGL 4.1}. This variable is available
     * in un-extended OpenGL only to the geometry shader. When written in the geometry shader, it causes geometry to be directed to one of an array of several
     * independent viewport rectangles.</p>
     * 
     * <p>In order to use any viewport other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and potential
     * performance issues. This extension exposes the {@code gl_ViewportIndex} built-in variable to the vertex shader, allowing the functionality introduced by
     * ARB_viewport_array to be accessed without requiring a geometry shader to be present.</p>
     * 
     * <p>Requires {@link GL41 OpenGL 4.1} or {@link #GL_ARB_viewport_array ARB_viewport_array}.</p>
     */
    public final boolean GL_AMD_vertex_shader_viewport_index;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_arrays_of_arrays.txt">ARB_arrays_of_arrays</a> extension is supported.
     * 
     * <p>This extension removes the restriction that arrays cannot be formed into arrays, allowing arrays of arrays to be declared.</p>
     * 
     * <p>Requires GLSL 1.2. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
     */
    public final boolean GL_ARB_arrays_of_arrays;
    /** When true, {@link ARBBaseInstance} is supported. */
    public final boolean GL_ARB_base_instance;
    /** When true, {@link ARBBindlessTexture} is supported. */
    public final boolean GL_ARB_bindless_texture;
    /** When true, {@link ARBBlendFuncExtended} is supported. */
    public final boolean GL_ARB_blend_func_extended;
    /** When true, {@link ARBBufferStorage} is supported. */
    public final boolean GL_ARB_buffer_storage;
    /** When true, {@link ARBCLEvent} is supported. */
    public final boolean GL_ARB_cl_event;
    /** When true, {@link ARBClearBufferObject} is supported. */
    public final boolean GL_ARB_clear_buffer_object;
    /** When true, {@link ARBClearTexture} is supported. */
    public final boolean GL_ARB_clear_texture;
    /** When true, {@link ARBClipControl} is supported. */
    public final boolean GL_ARB_clip_control;
    /** When true, {@link ARBColorBufferFloat} is supported. */
    public final boolean GL_ARB_color_buffer_float;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_compatibility.txt">ARB_compatibility</a> extension is supported.
     * 
     * <p>This extension restores features deprecated by {@link GL30 OpenGL 3.0}.</p>
     */
    public final boolean GL_ARB_compatibility;
    /** When true, {@link ARBCompressedTexturePixelStorage} is supported. */
    public final boolean GL_ARB_compressed_texture_pixel_storage;
    /** When true, {@link ARBComputeShader} is supported. */
    public final boolean GL_ARB_compute_shader;
    /** When true, {@link ARBComputeVariableGroupSize} is supported. */
    public final boolean GL_ARB_compute_variable_group_size;
    /** When true, {@link ARBConditionalRenderInverted} is supported. */
    public final boolean GL_ARB_conditional_render_inverted;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_conservative_depth.txt">ARB_conservative_depth</a> extension is supported.
     * 
     * <p>There is a common optimization for hardware accelerated implementation of OpenGL which relies on an early depth test to be run before the fragment
     * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.</p>
     * 
     * <p>This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.: it
     * does not write to the built-in gl_FragDepth output). There are, however a class of operations on the depth in the shader which could still be performed
     * while allowing the early depth test to operate.</p>
     * 
     * <p>This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
     */
    public final boolean GL_ARB_conservative_depth;
    /** When true, {@link ARBCopyBuffer} is supported. */
    public final boolean GL_ARB_copy_buffer;
    /** When true, {@link ARBCopyImage} is supported. */
    public final boolean GL_ARB_copy_image;
    /** When true, {@link ARBCullDistance} is supported. */
    public final boolean GL_ARB_cull_distance;
    /** When true, {@link ARBDebugOutput} is supported. */
    public final boolean GL_ARB_debug_output;
    /** When true, {@link ARBDepthBufferFloat} is supported. */
    public final boolean GL_ARB_depth_buffer_float;
    /** When true, {@link ARBDepthClamp} is supported. */
    public final boolean GL_ARB_depth_clamp;
    /** When true, {@link ARBDepthTexture} is supported. */
    public final boolean GL_ARB_depth_texture;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_derivative_control.txt">ARB_derivative_control</a> extension is supported.
     * 
     * <p>This extension provides control over the spacial granularity at which the underlying implementation computes derivatives.</p>
     * 
     * <p>For example, for the coarse-granularity derivative, a single x derivative could be computed for each 2x2 group of pixels, using that same derivative
     * value for all 4 pixels. For the fine-granularity derivative, two derivatives could be computed for each 2x2 group of pixels; one for the top row and one
     * for the bottom row. Implementations vary somewhat on how this is done.</p>
     * 
     * <p>To select the coarse derivative, use:</p>
     * 
     * <pre><code>
     * dFdxCoarse(p)
     * dFdyCoarse(p)
     * fwidthCoarse(p)</code></pre>
     * 
     * <p>To select the fine derivative, use:</p>
     * 
     * <pre><code>
     * dFdxFine(p)
     * dFdyFine(p)
     * fwidthFine(p)</code></pre>
     * 
     * <p>To select which ever is "better" (based on performance, API hints, or other factors), use:</p>
     * 
     * <pre><code>
     * dFdx(p)
     * dFdy(p)
     * fwidth(p)</code></pre>
     * 
     * <p>This last set is the set of previously existing built-ins for derivatives, and continues to work in a backward compatible way.</p>
     * 
     * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
     */
    public final boolean GL_ARB_derivative_control;
    /** When true, {@link ARBDirectStateAccess} is supported. */
    public final boolean GL_ARB_direct_state_access;
    /** When true, {@link ARBDrawBuffers} is supported. */
    public final boolean GL_ARB_draw_buffers;
    /** When true, {@link ARBDrawBuffersBlend} is supported. */
    public final boolean GL_ARB_draw_buffers_blend;
    /** When true, {@link ARBDrawElementsBaseVertex} is supported. */
    public final boolean GL_ARB_draw_elements_base_vertex;
    /** When true, {@link ARBDrawIndirect} is supported. */
    public final boolean GL_ARB_draw_indirect;
    /** When true, {@link ARBDrawInstanced} is supported. */
    public final boolean GL_ARB_draw_instanced;
    /** When true, {@link ARBEnhancedLayouts} is supported. */
    public final boolean GL_ARB_enhanced_layouts;
    /** When true, {@link ARBES2Compatibility} is supported. */
    public final boolean GL_ARB_ES2_compatibility;
    /** When true, {@link ARBES31Compatibility} is supported. */
    public final boolean GL_ARB_ES3_1_compatibility;
    /** When true, {@link ARBES32Compatibility} is supported. */
    public final boolean GL_ARB_ES3_2_compatibility;
    /** When true, {@link ARBES3Compatibility} is supported. */
    public final boolean GL_ARB_ES3_compatibility;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_explicit_attrib_location.txt">ARB_explicit_attrib_location</a> extension is supported.
     * 
     * <p>This extension provides a method to pre-assign attribute locations to named vertex shader inputs and color numbers to named fragment shader outputs.
     * This allows applications to globally assign a particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location
     * without knowing how that attribute will be named in any particular shader.</p>
     * 
     * <p>Requires {@link GL20 OpenGL 2.0} or {@link #GL_ARB_vertex_shader ARB_vertex_shader}. Promoted to core in {@link GL33 OpenGL 3.3}.</p>
     */
    public final boolean GL_ARB_explicit_attrib_location;
    /** When true, {@link ARBExplicitUniformLocation} is supported. */
    public final boolean GL_ARB_explicit_uniform_location;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_coord_conventions.txt">ARB_fragment_coord_conventions</a> extension is supported.
     * 
     * <p>This extension provides alternative conventions for the fragment coordinate XY location available for programmable fragment processing.</p>
     * 
     * <p>The scope of this extension deals *only* with how the fragment coordinate XY location appears during programming fragment processing. Beyond the scope
     * of this extension are coordinate conventions used for rasterization or transformation.</p>
     * 
     * <p>In the case of the coordinate conventions for rasterization and transformation, some combination of the viewport, depth range, culling state, and
     * projection matrix state can be reconfigured to adopt other arbitrary clip-space and window-space coordinate space conventions. Adopting other clip-space
     * and window-space conventions involves adjusting existing OpenGL state. However it is non-trivial to massage an arbitrary fragment shader or program to
     * adopt a different window-space coordinate system because such shaders are encoded in various textual representations.</p>
     * 
     * <p>The dominant 2D and 3D rendering APIs make two basic choices of convention when locating fragments in window space. The two choices are:</p>
     * 
     * <ol>
     * <li>Is the origin nearest the lower-left- or upper-left-most pixel of the window?</li>
     * <li>Is the (x,y) location of the pixel nearest the origin at (0,0) or (0.5,0.5)?</li>
     * </ol>
     * 
     * <p>OpenGL assumes a lower-left origin for window coordinates and assumes pixel centers are located at half-pixel coordinates. This means the XY location
     * (0.5,0.5) corresponds to the lower-left-most pixel in a window.</p>
     * 
     * <p>Other window coordinate conventions exist for other rendering APIs. X11, GDI, and Direct3D version through DirectX 9 assume an upper-left window origin
     * and locate pixel centers at integer XY values. By this alternative convention, the XY location (0,0) corresponds to the upper-left-most pixel in a window.</p>
     * 
     * <p>Direct3D for DirectX 10 assumes an upper-left origin (as do prior DirectX versions) yet assumes half-pixel coordinates (unlike prior DirectX versions).
     * By the DirectX 10 convention, the XY location (0.5,0.5) corresponds to the upper-left-most pixel in a window.</p>
     * 
     * <p>Fragment shaders can directly access the location of a given processed fragment in window space. We call this location the "fragment coordinate".</p>
     * 
     * <p>This extension provides a means for fragment shaders written in GLSL or OpenGL assembly extensions to specify alternative conventions for determining
     * the fragment coordinate value accessed during programmable fragment processing.</p>
     * 
     * <p>The motivation for this extension is to provide an easy, efficient means for fragment shaders accessing a fragment's window-space location to adopt the
     * fragment coordinate convention for which the shader was originally written.</p>
     * 
     * <p>Promoted to core in {@link GL32 OpenGL 3.2}.</p>
     */
    public final boolean GL_ARB_fragment_coord_conventions;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_layer_viewport.txt">ARB_fragment_layer_viewport</a> extension is supported.
     * 
     * <p>The geometry shader has the special built-in variables gl_Layer and gl_ViewportIndex that specify which layer and viewport primitives are rendered to.
     * Currently the fragment shader does not know which layer or viewport the fragments are being written to without the application implementing their own
     * interface variables between the geometry and fragment shaders.</p>
     * 
     * <p>This extension specifies that the gl_Layer and gl_ViewportIndex built-in variables are also available to the fragment shader so the application doesn't
     * need to implement these manually.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0} and {@link #GL_ARB_geometry_shader4 ARB_geometry_shader4}, or {@link GL32 OpenGL 3.2}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
     */
    public final boolean GL_ARB_fragment_layer_viewport;
    /** When true, {@link ARBFragmentProgram} is supported. */
    public final boolean GL_ARB_fragment_program;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_program_shadow.txt">ARB_fragment_program_shadow</a> extension is supported.
     * 
     * <p>This extension extends ARB_fragment_program to remove the interaction with ARB_shadow and defines the program option "ARB_fragment_program_shadow".</p>
     * 
     * <p>Requires {@link #GL_ARB_fragment_program ARB_fragment_program} and {@link #GL_ARB_shadow ARB_shadow}.</p>
     */
    public final boolean GL_ARB_fragment_program_shadow;
    /** When true, {@link ARBFragmentShader} is supported. */
    public final boolean GL_ARB_fragment_shader;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_shader_interlock.txt">ARB_fragment_shader_interlock</a> extension is supported.
     * 
     * <p>In unextended OpenGL 4.5, applications may produce a large number of fragment shader invocations that perform loads and stores to memory using image
     * uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are performed by different
     * fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than once, one or more of the
     * following techniques may be required to ensure proper execution ordering:</p>
     * 
     * <ul>
     * <li>inserting Finish or WaitSync commands to drain the pipeline between different "passes" or "layers";</li>
     * <li>using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or</li>
     * <li>injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently.</li>
     * </ul>
     * 
     * <p>This extension provides new GLSL built-in functions beginInvocationInterlockARB() and endInvocationInterlockARB() that delimit a critical section of
     * fragment shader code. For pairs of shader invocations with "overlapping" coverage in a given pixel, the OpenGL implementation will guarantee that the
     * critical section of the fragment shader will be executed for only one fragment at a time.</p>
     * 
     * <p>There are four different interlock modes supported by this extension, which are identified by layout qualifiers. The qualifiers
     * "pixel_interlock_ordered" and "pixel_interlock_unordered" provides mutual exclusion in the critical section for any pair of fragments corresponding to
     * the same pixel. When using multisampling, the qualifiers "sample_interlock_ordered" and "sample_interlock_unordered" only provide mutual exclusion for
     * pairs of fragments that both cover at least one common sample in the same pixel; these are recommended for performance if shaders use per-sample data
     * structures.</p>
     * 
     * <p>Additionally, when the "pixel_interlock_ordered" or "sample_interlock_ordered" layout qualifier is used, the interlock also guarantees that the
     * critical section for multiple shader invocations with "overlapping" coverage will be executed in the order in which the primitives were processed by
     * the GL. Such a guarantee is useful for applications like blending in the fragment shader, where an application requires that fragment values to be
     * composited in the framebuffer in primitive order.</p>
     * 
     * <p>This extension can be useful for algorithms that need to access per-pixel data structures via shader loads and stores. Such algorithms using this
     * extension can access such data structures in the critical section without worrying about other invocations for the same pixel accessing the data
     * structures concurrently. Additionally, the ordering guarantees are useful for cases where the API ordering of fragments is meaningful. For example,
     * applications may be able to execute programmable blending operations in the fragment shader, where the destination buffer is read via image loads and
     * the final value is written via image stores.</p>
     * 
     * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBShaderImageLoadStore ARB_shader_image_load_store}.</p>
     */
    public final boolean GL_ARB_fragment_shader_interlock;
    /** When true, {@link ARBFramebufferNoAttachments} is supported. */
    public final boolean GL_ARB_framebuffer_no_attachments;
    /** When true, {@link ARBFramebufferObject} is supported. */
    public final boolean GL_ARB_framebuffer_object;
    /** When true, {@link ARBFramebufferSRGB} is supported. */
    public final boolean GL_ARB_framebuffer_sRGB;
    /** When true, {@link ARBGeometryShader4} is supported. */
    public final boolean GL_ARB_geometry_shader4;
    /** When true, {@link ARBGetProgramBinary} is supported. */
    public final boolean GL_ARB_get_program_binary;
    /** When true, {@link ARBGetTextureSubImage} is supported. */
    public final boolean GL_ARB_get_texture_sub_image;
    /** When true, {@link ARBGLSPIRV} is supported. */
    public final boolean GL_ARB_gl_spirv;
    /** When true, {@link ARBGPUShader5} is supported. */
    public final boolean GL_ARB_gpu_shader5;
    /** When true, {@link ARBGPUShaderFP64} is supported. */
    public final boolean GL_ARB_gpu_shader_fp64;
    /** When true, {@link ARBGPUShaderInt64} is supported. */
    public final boolean GL_ARB_gpu_shader_int64;
    /** When true, {@link ARBHalfFloatPixel} is supported. */
    public final boolean GL_ARB_half_float_pixel;
    /** When true, {@link ARBHalfFloatVertex} is supported. */
    public final boolean GL_ARB_half_float_vertex;
    /** When true, {@link ARBImaging} is supported. */
    public final boolean GL_ARB_imaging;
    /** When true, {@link ARBIndirectParameters} is supported. */
    public final boolean GL_ARB_indirect_parameters;
    /** When true, {@link ARBInstancedArrays} is supported. */
    public final boolean GL_ARB_instanced_arrays;
    /** When true, {@link ARBInternalformatQuery} is supported. */
    public final boolean GL_ARB_internalformat_query;
    /** When true, {@link ARBInternalformatQuery2} is supported. */
    public final boolean GL_ARB_internalformat_query2;
    /** When true, {@link ARBInvalidateSubdata} is supported. */
    public final boolean GL_ARB_invalidate_subdata;
    /** When true, {@link ARBMapBufferAlignment} is supported. */
    public final boolean GL_ARB_map_buffer_alignment;
    /** When true, {@link ARBMapBufferRange} is supported. */
    public final boolean GL_ARB_map_buffer_range;
    /** When true, {@link ARBMatrixPalette} is supported. */
    public final boolean GL_ARB_matrix_palette;
    /** When true, {@link ARBMultiBind} is supported. */
    public final boolean GL_ARB_multi_bind;
    /** When true, {@link ARBMultiDrawIndirect} is supported. */
    public final boolean GL_ARB_multi_draw_indirect;
    /** When true, {@link ARBMultisample} is supported. */
    public final boolean GL_ARB_multisample;
    /** When true, {@link ARBMultitexture} is supported. */
    public final boolean GL_ARB_multitexture;
    /** When true, {@link ARBOcclusionQuery} is supported. */
    public final boolean GL_ARB_occlusion_query;
    /** When true, {@link ARBOcclusionQuery2} is supported. */
    public final boolean GL_ARB_occlusion_query2;
    /** When true, {@link ARBParallelShaderCompile} is supported. */
    public final boolean GL_ARB_parallel_shader_compile;
    /** When true, {@link ARBPipelineStatisticsQuery} is supported. */
    public final boolean GL_ARB_pipeline_statistics_query;
    /** When true, {@link ARBPixelBufferObject} is supported. */
    public final boolean GL_ARB_pixel_buffer_object;
    /** When true, {@link ARBPointParameters} is supported. */
    public final boolean GL_ARB_point_parameters;
    /** When true, {@link ARBPointSprite} is supported. */
    public final boolean GL_ARB_point_sprite;
    /** When true, {@link ARBPolygonOffsetClamp} is supported. */
    public final boolean GL_ARB_polygon_offset_clamp;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_post_depth_coverage.txt">ARB_post_depth_coverage</a> extension is supported.
     * 
     * <p>This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
     * depth and stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:</p>
     * 
     * <pre><code>
     *         layout(post_depth_coverage) in;</code></pre>
     * 
     * <p>Use of this feature implicitly enables early fragment tests.</p>
     */
    public final boolean GL_ARB_post_depth_coverage;
    /** When true, {@link ARBProgramInterfaceQuery} is supported. */
    public final boolean GL_ARB_program_interface_query;
    /** When true, {@link ARBProvokingVertex} is supported. */
    public final boolean GL_ARB_provoking_vertex;
    /** When true, {@link ARBQueryBufferObject} is supported. */
    public final boolean GL_ARB_query_buffer_object;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_robust_buffer_access_behavior.txt">ARB_robust_buffer_access_behavior</a> extension is supported.
     * 
     * <p>This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing ARB_robustness extension
     * which stated that the application should not crash, but the behavior is otherwise undefined. This extension specifies the access protection provided by
     * the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
     * buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the
     * {@code CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB} feature enabled.</p>
     * 
     * <p>Requires {@link ARBRobustness ARB_robustness}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
     */
    public final boolean GL_ARB_robust_buffer_access_behavior;
    /** When true, {@link ARBRobustness} is supported. */
    public final boolean GL_ARB_robustness;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_robustness_application_isolation.txt">ARB_robustness_application_isolation</a> extension is supported.
     * 
     * <p>{@link ARBRobustness ARB_robustness} and supporting window system extensions allow creating an OpenGL context supporting graphics reset notification behavior. This
     * extension provides stronger guarantees about the possible side-effects of a graphics reset.</p>
     * 
     * <p>It is expected that there may be a performance cost associated with isolating an application or share group from other contexts on the GPU. For this
     * reason, ARB_robustness_isolation is phrased as an opt-in mechanism, with a new context creation bit defined in the window system bindings. It is
     * expected that implementations might only advertise the strings in this extension if both the implementation supports the desired isolation properties,
     * and the context was created with the appropriate reset isolation bit.</p>
     * 
     * <p>If the graphics driver advertises the {@code GL_ARB_robustness_application_isolation} extension string, then the driver guarantees that if a particular
     * application causes a graphics reset to occur:</p>
     * 
     * <ol>
     * <li>No other application on the system is affected by the graphics reset.</li>
     * <li>No other application on the system receives any notification that the graphics reset occurred.</li>
     * </ol>
     * 
     * <p>Requires {@link ARBRobustness ARB_robustness}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
     */
    public final boolean GL_ARB_robustness_application_isolation;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_robustness_application_isolation.txt">ARB_robustness_share_group_isolation</a> extension is supported.
     * 
     * <p>See {@link #GL_ARB_robustness_application_isolation ARB_robustness_application_isolation}.</p>
     * 
     * <p>If the graphics driver advertises the {@code GL_ARB_robustness_share_group_isolation} extension string, then the driver guarantees that if a context in
     * a particular share group causes a graphics reset to occur:</p>
     * 
     * <ol>
     * <li>No other share group within the application is affected by the graphics reset. Additionally, no other application on the system is affected by the
     * graphics reset.</li>
     * <li>No other share group within the application receives any notification that the graphics reset occurred. Additionally, no other application on the
     * system receives any notification that the graphics reset occurred.</li>
     * </ol>
     */
    public final boolean GL_ARB_robustness_share_group_isolation;
    /** When true, {@link ARBSampleLocations} is supported. */
    public final boolean GL_ARB_sample_locations;
    /** When true, {@link ARBSampleShading} is supported. */
    public final boolean GL_ARB_sample_shading;
    /** When true, {@link ARBSamplerObjects} is supported. */
    public final boolean GL_ARB_sampler_objects;
    /** When true, {@link ARBSeamlessCubeMap} is supported. */
    public final boolean GL_ARB_seamless_cube_map;
    /** When true, {@link ARBSeamlessCubemapPerTexture} is supported. */
    public final boolean GL_ARB_seamless_cubemap_per_texture;
    /** When true, {@link ARBSeparateShaderObjects} is supported. */
    public final boolean GL_ARB_separate_shader_objects;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_atomic_counter_ops.txt">ARB_shader_atomic_counter_ops</a> extension is supported.
     * 
     * <p>The {@link ARBShaderAtomicCounters ARB_shader_atomic_counters} extension introduced atomic counters, but it limits list of potential operations that can be performed on them
     * to increment, decrement, and query. This extension extends the list of GLSL built-in functions that can operate on atomic counters. The list of new
     * operations include:</p>
     * 
     * <ul>
     * <li>Addition and subtraction</li>
     * <li>Minimum and maximum</li>
     * <li>Bitwise operators (AND, OR, XOR, etc.)</li>
     * <li>Exchange, and compare and exchange operators</li>
     * </ul>
     * 
     * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBShaderAtomicCounters ARB_shader_atomic_counters}.</p>
     */
    public final boolean GL_ARB_shader_atomic_counter_ops;
    /** When true, {@link ARBShaderAtomicCounters} is supported. */
    public final boolean GL_ARB_shader_atomic_counters;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_ballot.txt">ARB_shader_ballot</a> extension is supported.
     * 
     * <p>This extension provides the ability for a group of invocations which execute in lockstep to do limited forms of cross-invocation communication via a
     * group broadcast of a invocation value, or broadcast of a bitarray representing a predicate value from each invocation in the group.</p>
     * 
     * <p>Requires {@link ARBGPUShaderInt64 ARB_gpu_shader_int64}.</p>
     */
    public final boolean GL_ARB_shader_ballot;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_bit_encoding.txt">ARB_shader_bit_encoding</a> extension is supported.
     * 
     * <p>This extension trivially adds built-in functions for getting/setting the bit encoding for floating-point values in the OpenGL Shading Language.</p>
     * 
     * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
     */
    public final boolean GL_ARB_shader_bit_encoding;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_clock.txt">ARB_shader_clock</a> extension is supported.
     * 
     * <p>This extension exposes a 64-bit monotonically incrementing shader counter which may be used to derive local timing information within a single shader
     * invocation.</p>
     */
    public final boolean GL_ARB_shader_clock;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_draw_parameters.txt">ARB_shader_draw_parameters</a> extension is supported.
     * 
     * <p>In unextended GL, vertex shaders have inputs named {@code gl_VertexID} and {@code gl_InstanceID}, which contain, respectively the index of the vertex
     * and instance. The value of {@code gl_VertexID} is the implicitly passed index of the vertex being processed, which includes the value of baseVertex, for
     * those commands that accept it. Meanwhile, {@code gl_InstanceID} is the integer index of the current instance being processed, but, even for commands
     * that accept a baseInstance parameter, it does not include the value of this argument. Furthermore, the equivalents to these variables in other graphics
     * APIs do not necessarily follow these conventions. The reason for this inconsistency is that there are legitimate use cases for both inclusion and
     * exclusion of the baseVertex or baseInstance parameters in {@code gl_VertexID} and {@code gl_InstanceID}, respectively.</p>
     * 
     * <p>Rather than change the semantics of either built-in variable, this extension adds two new built-in variables to the GL shading language,
     * {@code gl_BaseVertexARB} and {@code gl_BaseInstanceARB}, which contain the values passed in the baseVertex and baseInstance parameters, respectively.
     * Shaders provided by the application may use these variables to offset {@code gl_VertexID} or {@code gl_InstanceID} if desired, or use them for any other
     * purpose.</p>
     * 
     * <p>Additionally, this extension adds a further built-in variable, {@code gl_DrawID} to the shading language. This variable contains the index of the draw
     * currently being processed by a Multi* variant of a drawing command (such as {@link GL14C#glMultiDrawElements MultiDrawElements} or {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}).</p>
     * 
     * <p>Requires {@link GL31 OpenGL 3.1}. Promoted to core in {@link GL33 OpenGL 3.3}.</p>
     */
    public final boolean GL_ARB_shader_draw_parameters;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_group_vote.txt">ARB_shader_group_vote</a> extension is supported.
     * 
     * <p>This extension provides new built-in functions to compute the composite of a set of boolean conditions across a group of shader invocations. These
     * composite results may be used to execute shaders more efficiently on a single-instruction multiple-data (SIMD) processor. The set of shader invocations
     * across which boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader
     * invocations are assigned to such sets. In particular, the set of shader invocations has no necessary relationship with the compute shader local work
     * group -- a pair of shader invocations in a single compute shader work group may end up in different sets used by these built-ins.</p>
     * 
     * <p>Compute shaders operate on an explicitly specified group of threads (a local work group), but many implementations of OpenGL 4.3 will even group
     * non-compute shader invocations and execute them in a SIMD fashion. When executing code like</p>
     * 
     * <pre><code>
     * if (condition) {
     *     result = do_fast_path();
     * } else {
     *     result = do_general_path();
     * }</code></pre>
     * 
     * <p>where {@code condition} diverges between invocations, a SIMD implementation might first call do_fast_path() for the invocations where {@code condition}
     * is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition} is
     * false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just using
     * the general path for all invocations.</p>
     * 
     * <p>This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:</p>
     * 
     * <pre><code>
     * if (allInvocationsARB(condition)) {
     *     result = do_fast_path();
     * } else {
     *     result = do_general_path();
     * }</code></pre>
     * 
     * <p>The built-in function allInvocationsARB() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
     * or do_general_path(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation
     * of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result
     * (do_fast_path) while others require a larger number (do_general_path). In another example, shader code might want to evaluate a complex function
     * (do_general_path) that can be greatly simplified when assuming a specific value for one of its inputs (do_fast_path).</p>
     * 
     * <p>Requires {@link GL43 OpenGL 4.3} or {@link ARBComputeShader ARB_compute_shader}.</p>
     */
    public final boolean GL_ARB_shader_group_vote;
    /** When true, {@link ARBShaderImageLoadStore} is supported. */
    public final boolean GL_ARB_shader_image_load_store;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_image_size.txt">ARB_shader_image_size</a> extension is supported.
     * 
     * <p>This extension provides GLSL built-in functions allowing shaders to query the size of an image.</p>
     * 
     * <p>Requires {@link GL42 OpenGL 4.2} and GLSL 4.20. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
     */
    public final boolean GL_ARB_shader_image_size;
    /** When true, {@link ARBShaderObjects} is supported. */
    public final boolean GL_ARB_shader_objects;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_precision.txt">ARB_shader_precision</a> extension is supported.
     * 
     * <p>This extension more clearly restricts the precision requirements of implementations of the GLSL specification. These include precision of arithmetic
     * operations (operators '+', '/', ...), transcendentals (log, exp, pow, reciprocal sqrt, ...), when NaNs (not a number) and INFs (infinities) will be
     * supported and generated, and denorm flushing behavior.  Trigonometric built-ins and some other categories of built-ins are not addressed.</p>
     * 
     * <p>Requires {@link GL40 OpenGL 4.0}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
     */
    public final boolean GL_ARB_shader_precision;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_stencil_export.txt">ARB_shader_stencil_export</a> extension is supported.
     * 
     * <p>In OpenGL, the stencil test is a powerful mechanism to selectively discard fragments based on the content of the stencil buffer. However, facilites to
     * update the content of the stencil buffer are limited to operations such as incrementing the existing value, or overwriting with a fixed reference value.</p>
     * 
     * <p>This extension provides a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this
     * allows the test to be performed against the value generated in the shader. When the stencil operation is set to {@link GL11#GL_REPLACE REPLACE}, this allows a value generated
     * in the shader to be written to the stencil buffer directly.</p>
     * 
     * <p>Requires {@link #GL_ARB_fragment_shader ARB_fragment_shader}.</p>
     */
    public final boolean GL_ARB_shader_stencil_export;
    /** When true, {@link ARBShaderStorageBufferObject} is supported. */
    public final boolean GL_ARB_shader_storage_buffer_object;
    /** When true, {@link ARBShaderSubroutine} is supported. */
    public final boolean GL_ARB_shader_subroutine;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_texture_image_samples.txt">ARB_shader_texture_image_samples</a> extension is supported.
     * 
     * <p>This extension provides GLSL built-in functions allowing shaders to query the number of samples of a texture.</p>
     * 
     * <p>Requires GLSL 1.50 or {@link ARBTextureMultisample ARB_texture_multisample}.</p>
     */
    public final boolean GL_ARB_shader_texture_image_samples;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_texture_lod.txt">ARB_shader_texture_lod</a> extension is supported.
     * 
     * <p>This extension adds additional texture functions to the OpenGL Shading Language which provide the shader writer with explicit control of LOD.</p>
     * 
     * <p>Mipmap texture fetches and anisotropic texture fetches require an implicit derivatives to calculate rho, lambda and/or the line of anisotropy. These
     * implicit derivatives will be undefined for texture fetches occurring inside non-uniform control flow or for vertex shader texture fetches, resulting in
     * undefined texels.</p>
     * 
     * <p>The additional texture functions introduced with this extension provide explict control of LOD (isotropic texture functions) or provide explicit
     * derivatives (anisotropic texture functions).</p>
     * 
     * <p>Anisotropic texture functions return defined texels for mipmap texture fetches or anisotropic texture fetches, even inside non-uniform control flow.
     * Isotropic texture functions return defined texels for mipmap texture fetches, even inside non-uniform control flow. However, isotropic texture functions
     * return undefined texels for anisotropic texture fetches.</p>
     * 
     * <p>The existing isotropic vertex texture functions:</p>
     * 
     * <pre><code>
     * texture1DLod,   texture1DProjLod,
     * texture2DLod,   texture2DProjLod,
     * texture3DLod,   texture3DProjLod,
     * textureCubeLod,
     * shadow1DLod,    shadow1DProjLod,
     * shadow2DLod,    shadow2DProjLod</code></pre>
     * 
     * <p>are added to the built-in functions for fragment shaders.</p>
     * 
     * <p>New anisotropic texture functions, providing explicit derivatives:</p>
     * 
     * <pre><code>
     * texture1DGradARB(
     *     sampler1D sampler,
     *     float P, float dPdx, float dPdy);
     * texture1DProjGradARB(
     *     sampler1D sampler,
     *     vec2 P, float dPdx, float dPdy);
     * texture1DProjGradARB(
     *     sampler1D sampler,
     *     vec4 P, float dPdx, float dPdy);
     * texture2DGradARB(
     *     sampler2D sampler,
     *     vec2 P, vec2 dPdx, vec2 dPdy);
     * texture2DProjGradARB(
     *     sampler2D sampler,
     *     vec3 P, vec2 dPdx, vec2 dPdy);
     * texture2DProjGradARB(
     *     sampler2D sampler,
     *     vec4 P, vec2 dPdx, vec2 dPdy);
     * texture3DGradARB(
     *     sampler3D sampler,
     *     vec3 P, vec3 dPdx, vec3 dPdy);
     * texture3DProjGradARB(
     *     sampler3D sampler,
     *     vec4 P, vec3 dPdx, vec3 dPdy);
     * textureCubeGradARB(
     *     samplerCube sampler,
     *     vec3 P, vec3 dPdx, vec3 dPdy);
     * 
     * shadow1DGradARB(
     *     sampler1DShadow sampler,
     *     vec3 P, float dPdx, float dPdy);
     * shadow1DProjGradARB(
     *     sampler1DShadow sampler,
     *     vec4 P, float dPdx, float dPdy);
     * shadow2DGradARB(
     *     sampler2DShadow sampler,
     *     vec3 P, vec2 dPdx, vec2 dPdy);
     * shadow2DProjGradARB(
     *     sampler2DShadow sampler,
     *     vec4 P, vec2 dPdx, vec2 dPdy);
     * 
     * texture2DRectGradARB(
     *     sampler2DRect sampler,
     *     vec2 P, vec2 dPdx, vec2 dPdy);
     * texture2DRectProjGradARB(
     *     sampler2DRect sampler,
     *     vec3 P, vec2 dPdx, vec2 dPdy);
     * texture2DRectProjGradARB(
     *     sampler2DRect sampler,
     *     vec4 P, vec2 dPdx, vec2 dPdy);
     * 
     * shadow2DRectGradARB(
     *     sampler2DRectShadow sampler,
     *     vec3 P, vec2 dPdx, vec2 dPdy);
     * shadow2DRectProjGradARB(
     *     sampler2DRectShadow sampler,
     *     vec4 P, vec2 dPdx, vec2 dPdy);</code></pre>
     * 
     * <p>are added to the built-in functions for vertex shaders and fragment shaders.</p>
     * 
     * <p>Requires {@link #GL_ARB_shader_objects ARB_shader_objects}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
     */
    public final boolean GL_ARB_shader_texture_lod;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_viewport_layer_array.txt">ARB_shader_viewport_layer_array</a> extension is supported.
     * 
     * <p>The gl_ViewportIndex and gl_Layer built-in variables were introduced by the in OpenGL 4.1. These variables are available in un-extended OpenGL only to
     * the geometry shader. When written in the geometry shader, they cause geometry to be directed to one of an array of several independent viewport
     * rectangles or framebuffer attachment layers, respectively.</p>
     * 
     * <p>In order to use any viewport or attachment layer other than zero, a geometry shader must be present. Geometry shaders introduce processing overhead and
     * potential performance issues. The AMD_vertex_shader_layer and AMD_vertex_shader_viewport_index extensions allowed the gl_Layer and gl_ViewportIndex
     * outputs to be written directly from the vertex shader with no geometry shader present.</p>
     * 
     * <p>This extension effectively merges the AMD_vertex_shader_layer and AMD_vertex_shader_viewport_index extensions together and extends them further to
     * allow both outputs to be written from tessellation evaluation shaders.</p>
     * 
     * <p>Requires {@link GL41 OpenGL 4.1}.</p>
     */
    public final boolean GL_ARB_shader_viewport_layer_array;
    /** When true, {@link ARBShadingLanguage100} is supported. */
    public final boolean GL_ARB_shading_language_100;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shading_language_420pack.txt">ARB_shading_language_420pack</a> extension is supported.
     * 
     * <p>This is a language feature only extension formed from changes made to version 4.20 of GLSL. It includes:</p>
     * 
     * <ul>
     * <li>Add line-continuation using '', as in C++.</li>
     * <li>Change from ASCII to UTF-8 for the language character set and also allow any characters inside comments.</li>
     * <li>Allow implicit conversions of return values to the declared type of the function.</li>
     * <li>The *const* keyword can be used to declare variables within a function body with initializer expressions that are not constant expressions.</li>
     * <li>Qualifiers on variable declarations no longer have to follow a strict order. The layout qualifier can be used multiple times, and multiple parameter
     * qualifiers can be used. However, this is not as straightforward as saying declarations have arbitrary lists of initializers. Typically, one
     * qualifier from each class of qualifiers is allowed, so care is now taken to classify them and say so. Then, of these, order restrictions are removed.</li>
     * <li>Add layout qualifier identifier "binding" to bind the location of a uniform block. This requires version 1.4 of GLSL. If this extension is used with
     * an earlier version than 1.4, this feature is not present.</li>
     * <li>Add layout qualifier identifier "binding" to bind units to sampler and image variable declarations.</li>
     * <li>Add C-style curly brace initializer lists syntax for initializers. Full initialization of aggregates is required when these are used.</li>
     * <li>Allow ".length()" to be applied to vectors and matrices, returning the number of components or columns.</li>
     * <li>Allow swizzle operations on scalars.</li>
     * <li>Built-in constants for {@code gl_MinProgramTexelOffset} and {@code gl_MaxProgramTexelOffset}.</li>
     * </ul>
     * 
     * <p>Requires GLSL 1.30. Requires GLSL 1.40 for uniform block bindings. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
     */
    public final boolean GL_ARB_shading_language_420pack;
    /** When true, {@link ARBShadingLanguageInclude} is supported. */
    public final boolean GL_ARB_shading_language_include;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shading_language_packing.txt">ARB_shading_language_packing</a> extension is supported.
     * 
     * <p>This extension provides the GLSL built-in functions to convert a 32-bit unsigned integer holding a pair of 16-bit floating-point values to or from a
     * two-component floating-point vector (vec2).</p>
     * 
     * <p>This mechanism allows GLSL shaders to read and write 16-bit floating-point encodings (via 32-bit unsigned integers) without introducing a full set of
     * 16-bit floating-point data types.</p>
     * 
     * <p>This extension also adds the GLSL built-in packing functions included in GLSL version 4.00 and the ARB_gpu_shader5 extension which pack and unpack
     * vectors of small fixed-point data types into a larger scalar. By putting these packing functions in this separate extension it allows implementations to
     * provide these functions in hardware that supports them independent of the other {@link #GL_ARB_gpu_shader5 ARB_gpu_shader5} features.</p>
     * 
     * <p>In addition to the packing functions from ARB_gpu_shader5 this extension also adds the missing {@code [un]packSnorm2x16} for completeness.</p>
     * 
     * <p>Promoted to core in {@link GL42 OpenGL 4.2}.</p>
     */
    public final boolean GL_ARB_shading_language_packing;
    /** When true, {@link ARBShadow} is supported. */
    public final boolean GL_ARB_shadow;
    /** When true, {@link ARBShadowAmbient} is supported. */
    public final boolean GL_ARB_shadow_ambient;
    /** When true, {@link ARBSparseBuffer} is supported. */
    public final boolean GL_ARB_sparse_buffer;
    /** When true, {@link ARBSparseTexture} is supported. */
    public final boolean GL_ARB_sparse_texture;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_sparse_texture2.txt">ARB_sparse_texture2</a> extension is supported.
     * 
     * <p>This extension builds on the {@link ARBSparseTexture ARB_sparse_texture} extension, providing the following new functionality:</p>
     * 
     * <ul>
     * <li>New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
     * lookup accessed uncommitted texture memory.</li>
     * <li>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
     * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
     * memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
     * texture lookup functions.</li>
     * <li>Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were
     * undefined.</li>
     * <li>Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
     * be requested by leaving {@link ARBSparseTexture#GL_VIRTUAL_PAGE_SIZE_INDEX_ARB VIRTUAL_PAGE_SIZE_INDEX_ARB} at its initial value (0).</li>
     * <li>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
     * implementation-dependent.</li>
     * </ul>
     * 
     * <p>Requires {@link ARBSparseTexture ARB_sparse_texture}</p>
     */
    public final boolean GL_ARB_sparse_texture2;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_sparse_texture_clamp.txt">ARB_sparse_texture_clamp</a> extension is supported.
     * 
     * <p>This extension builds on the {@link #GL_ARB_sparse_texture2 ARB_sparse_texture2} extension, providing the following new functionality:</p>
     * 
     * <p>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
     * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the memory
     * accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse" texture lookup
     * functions.</p>
     * 
     * <p>Requires {@link #GL_ARB_sparse_texture2 ARB_sparse_texture2}</p>
     */
    public final boolean GL_ARB_sparse_texture_clamp;
    /** When true, {@link ARBSPIRVExtensions} is supported. */
    public final boolean GL_ARB_spirv_extensions;
    /** When true, {@link ARBStencilTexturing} is supported. */
    public final boolean GL_ARB_stencil_texturing;
    /** When true, {@link ARBSync} is supported. */
    public final boolean GL_ARB_sync;
    /** When true, {@link ARBTessellationShader} is supported. */
    public final boolean GL_ARB_tessellation_shader;
    /** When true, {@link ARBTextureBarrier} is supported. */
    public final boolean GL_ARB_texture_barrier;
    /** When true, {@link ARBTextureBorderClamp} is supported. */
    public final boolean GL_ARB_texture_border_clamp;
    /** When true, {@link ARBTextureBufferObject} is supported. */
    public final boolean GL_ARB_texture_buffer_object;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_buffer_object_rgb32.txt">ARB_texture_buffer_object_rgb32</a> extension is supported.
     * 
     * <p>This extension adds three new buffer texture formats - RGB32F, RGB32I, and RGB32UI. This partially addresses one of the limitations of buffer textures
     * in the original {@link #GL_EXT_texture_buffer_object EXT_texture_buffer_object} extension and in {@link GL31 OpenGL 3.1}, which provide no support for three-component formats.</p>
     * 
     * <p>Promoted to core in {@link GL40 OpenGL 4.0}.</p>
     */
    public final boolean GL_ARB_texture_buffer_object_rgb32;
    /** When true, {@link ARBTextureBufferRange} is supported. */
    public final boolean GL_ARB_texture_buffer_range;
    /** When true, {@link ARBTextureCompression} is supported. */
    public final boolean GL_ARB_texture_compression;
    /** When true, {@link ARBTextureCompressionBPTC} is supported. */
    public final boolean GL_ARB_texture_compression_bptc;
    /** When true, {@link ARBTextureCompressionRGTC} is supported. */
    public final boolean GL_ARB_texture_compression_rgtc;
    /** When true, {@link ARBTextureCubeMap} is supported. */
    public final boolean GL_ARB_texture_cube_map;
    /** When true, {@link ARBTextureCubeMapArray} is supported. */
    public final boolean GL_ARB_texture_cube_map_array;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_env_add.txt">ARB_texture_env_add</a> extension is supported.
     * 
     * <p>This extension adds a new texture environment function: ADD.</p>
     * 
     * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
     */
    public final boolean GL_ARB_texture_env_add;
    /** When true, {@link ARBTextureEnvCombine} is supported. */
    public final boolean GL_ARB_texture_env_combine;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_env_crossbar.txt">ARB_texture_env_crossbar</a> extension is supported.
     * 
     * <p>This extension adds the capability to use the texture color from other texture units as sources to the {@link ARBTextureEnvCombine#GL_COMBINE_ARB COMBINE_ARB} environment
     * function. The {@link ARBTextureEnvCombine ARB_texture_env_combine} extension defined texture environment functions which could use the color from the current texture unit
     * as a source. This extension adds the ability to use the color from any texture unit as a source.</p>
     * 
     * <p>Requires {@link #GL_ARB_multitexture ARB_multitexture} and {@link ARBTextureEnvCombine ARB_texture_env_combine}. Promoted to core in {@link GL14 OpenGL 1.4}.</p>
     */
    public final boolean GL_ARB_texture_env_crossbar;
    /** When true, {@link ARBTextureEnvDot3} is supported. */
    public final boolean GL_ARB_texture_env_dot3;
    /** When true, {@link ARBTextureFilterAnisotropic} is supported. */
    public final boolean GL_ARB_texture_filter_anisotropic;
    /** When true, {@link ARBTextureFilterMinmax} is supported. */
    public final boolean GL_ARB_texture_filter_minmax;
    /** When true, {@link ARBTextureFloat} is supported. */
    public final boolean GL_ARB_texture_float;
    /** When true, {@link ARBTextureGather} is supported. */
    public final boolean GL_ARB_texture_gather;
    /** When true, {@link ARBTextureMirrorClampToEdge} is supported. */
    public final boolean GL_ARB_texture_mirror_clamp_to_edge;
    /** When true, {@link ARBTextureMirroredRepeat} is supported. */
    public final boolean GL_ARB_texture_mirrored_repeat;
    /** When true, {@link ARBTextureMultisample} is supported. */
    public final boolean GL_ARB_texture_multisample;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_non_power_of_two.txt">ARB_texture_non_power_of_two</a> extension is supported.
     * 
     * <p>Conventional OpenGL texturing is limited to images with power-of-two dimensions and an optional 1-texel border. This extension relaxes the size
     * restrictions for the 1D, 2D, cube map, and 3D texture targets.</p>
     * 
     * <p>Promoted to core in {@link GL20 OpenGL 2.0}.</p>
     */
    public final boolean GL_ARB_texture_non_power_of_two;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_query_levels.txt">ARB_texture_query_levels</a> extension is supported.
     * 
     * <p>This extension provides a new set of texture functions ({@code textureQueryLevels}) in the OpenGL Shading Language that exposes the number of accessible
     * mipmap levels in the texture associated with a GLSL sampler variable. The set of accessible levels includes all the levels of the texture defined either
     * through TexImage*, TexStorage*, or TextureView* ({@link ARBTextureView ARB_texture_view}) APIs that are not below the {@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL} or above the
     * {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL} parameters. For textures defined with TexImage*, the set of resident levels is somewhat implementation-dependent. For fully
     * defined results, applications should use TexStorage*&#47;TextureView unless the texture has a full mipmap chain and is used with a mipmapped minification
     * filter.</p>
     * 
     * <p>These functions means that shaders are not required to manually recompute, approximate, or maintain a uniform holding a pre-computed level count, since
     * the true level count is already available to the implementation. This value can be used to avoid black or leaking pixel artifacts for rendering methods
     * which are using texture images as memory pages (eg: virtual textures); methods that can't only rely on the fixed pipeline texture functions which take
     * advantage of {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL} for their sampling.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0} and GLSL 1.30. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
     */
    public final boolean GL_ARB_texture_query_levels;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_query_lod.txt">ARB_texture_query_lod</a> extension is supported.
     * 
     * <p>This extension provides a new set of fragment shader texture functions ({@code textureLOD}) that return the results of automatic level-of-detail
     * computations that would be performed if a texture lookup were performed.</p>
     * 
     * <p>Requires {@link GL20 OpenGL 2.0}, {@link #GL_EXT_gpu_shader4 EXT_gpu_shader4}, {@link #GL_EXT_texture_array EXT_texture_array} and GLSL 1.30. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
     */
    public final boolean GL_ARB_texture_query_lod;
    /** When true, {@link ARBTextureRectangle} is supported. */
    public final boolean GL_ARB_texture_rectangle;
    /** When true, {@link ARBTextureRG} is supported. */
    public final boolean GL_ARB_texture_rg;
    /** When true, {@link ARBTextureRGB10_A2UI} is supported. */
    public final boolean GL_ARB_texture_rgb10_a2ui;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_stencil8.txt">ARB_texture_stencil8</a> extension is supported.
     * 
     * <p>This extension accepts {@link GL30#GL_STENCIL_INDEX8 STENCIL_INDEX8} as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the
     * need to use renderbuffers if a stencil-only format is desired.</p>
     * 
     * <p>Promoted to core in {@link GL44 OpenGL 4.4}.</p>
     */
    public final boolean GL_ARB_texture_stencil8;
    /** When true, {@link ARBTextureStorage} is supported. */
    public final boolean GL_ARB_texture_storage;
    /** When true, {@link ARBTextureStorageMultisample} is supported. */
    public final boolean GL_ARB_texture_storage_multisample;
    /** When true, {@link ARBTextureSwizzle} is supported. */
    public final boolean GL_ARB_texture_swizzle;
    /** When true, {@link ARBTextureView} is supported. */
    public final boolean GL_ARB_texture_view;
    /** When true, {@link ARBTimerQuery} is supported. */
    public final boolean GL_ARB_timer_query;
    /** When true, {@link ARBTransformFeedback2} is supported. */
    public final boolean GL_ARB_transform_feedback2;
    /** When true, {@link ARBTransformFeedback3} is supported. */
    public final boolean GL_ARB_transform_feedback3;
    /** When true, {@link ARBTransformFeedbackInstanced} is supported. */
    public final boolean GL_ARB_transform_feedback_instanced;
    /** When true, {@link ARBTransformFeedbackOverflowQuery} is supported. */
    public final boolean GL_ARB_transform_feedback_overflow_query;
    /** When true, {@link ARBTransposeMatrix} is supported. */
    public final boolean GL_ARB_transpose_matrix;
    /** When true, {@link ARBUniformBufferObject} is supported. */
    public final boolean GL_ARB_uniform_buffer_object;
    /** When true, {@link ARBVertexArrayBGRA} is supported. */
    public final boolean GL_ARB_vertex_array_bgra;
    /** When true, {@link ARBVertexArrayObject} is supported. */
    public final boolean GL_ARB_vertex_array_object;
    /** When true, {@link ARBVertexAttrib64Bit} is supported. */
    public final boolean GL_ARB_vertex_attrib_64bit;
    /** When true, {@link ARBVertexAttribBinding} is supported. */
    public final boolean GL_ARB_vertex_attrib_binding;
    /** When true, {@link ARBVertexBlend} is supported. */
    public final boolean GL_ARB_vertex_blend;
    /** When true, {@link ARBVertexBufferObject} is supported. */
    public final boolean GL_ARB_vertex_buffer_object;
    /** When true, {@link ARBVertexProgram} is supported. */
    public final boolean GL_ARB_vertex_program;
    /** When true, {@link ARBVertexShader} is supported. */
    public final boolean GL_ARB_vertex_shader;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_type_10f_11f_11f_rev.txt">ARB_vertex_type_10f_11f_11f_rev</a> extension is supported.
     * 
     * <p>This extension a new vertex attribute data format: a packed 11.11.10 unsigned float vertex data format. This vertex data format can be used to describe
     * a compressed 3 component stream of values that can be represented by 10- or 11-bit unsigned floating point values.</p>
     * 
     * <p>The {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV} vertex attribute type is equivalent to the {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F} texture internal format.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0} and {@link ARBVertexType2_10_10_10_REV ARB_vertex_type_2_10_10_10_rev}. Promoted to core in {@link GL44 OpenGL 4.4}.</p>
     */
    public final boolean GL_ARB_vertex_type_10f_11f_11f_rev;
    /** When true, {@link ARBVertexType2_10_10_10_REV} is supported. */
    public final boolean GL_ARB_vertex_type_2_10_10_10_rev;
    /** When true, {@link ARBViewportArray} is supported. */
    public final boolean GL_ARB_viewport_array;
    /** When true, {@link ARBWindowPos} is supported. */
    public final boolean GL_ARB_window_pos;
    /** When true, {@link ATIMeminfo} is supported. */
    public final boolean GL_ATI_meminfo;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ATI/ATI_shader_texture_lod.txt">ATI_shader_texture_lod</a> extension is supported. */
    public final boolean GL_ATI_shader_texture_lod;
    /** When true, {@link ATITextureCompression3DC} is supported. */
    public final boolean GL_ATI_texture_compression_3dc;
    /** When true, {@link EXT422Pixels} is supported. */
    public final boolean GL_EXT_422_pixels;
    /** When true, {@link EXTABGR} is supported. */
    public final boolean GL_EXT_abgr;
    /** When true, {@link EXTBGRA} is supported. */
    public final boolean GL_EXT_bgra;
    /** When true, {@link EXTBindableUniform} is supported. */
    public final boolean GL_EXT_bindable_uniform;
    /** When true, {@link EXTBlendColor} is supported. */
    public final boolean GL_EXT_blend_color;
    /** When true, {@link EXTBlendEquationSeparate} is supported. */
    public final boolean GL_EXT_blend_equation_separate;
    /** When true, {@link EXTBlendFuncSeparate} is supported. */
    public final boolean GL_EXT_blend_func_separate;
    /** When true, {@link EXTBlendMinmax} is supported. */
    public final boolean GL_EXT_blend_minmax;
    /** When true, {@link EXTBlendSubtract} is supported. */
    public final boolean GL_EXT_blend_subtract;
    /** When true, {@link EXTClipVolumeHint} is supported. */
    public final boolean GL_EXT_clip_volume_hint;
    /** When true, {@link EXTCompiledVertexArray} is supported. */
    public final boolean GL_EXT_compiled_vertex_array;
    /** When true, {@link EXTDebugLabel} is supported. */
    public final boolean GL_EXT_debug_label;
    /** When true, {@link EXTDebugMarker} is supported. */
    public final boolean GL_EXT_debug_marker;
    /** When true, {@link EXTDepthBoundsTest} is supported. */
    public final boolean GL_EXT_depth_bounds_test;
    /** When true, {@link EXTDirectStateAccess} is supported. */
    public final boolean GL_EXT_direct_state_access;
    /** When true, {@link EXTDrawBuffers2} is supported. */
    public final boolean GL_EXT_draw_buffers2;
    /** When true, {@link EXTDrawInstanced} is supported. */
    public final boolean GL_EXT_draw_instanced;
    /** When true, {@link EXTEGLImageStorage} is supported. */
    public final boolean GL_EXT_EGL_image_storage;
    /** When true, {@link EXTExternalBuffer} is supported. */
    public final boolean GL_EXT_external_buffer;
    /** When true, {@link EXTFramebufferBlit} is supported. */
    public final boolean GL_EXT_framebuffer_blit;
    /** When true, {@link EXTFramebufferMultisample} is supported. */
    public final boolean GL_EXT_framebuffer_multisample;
    /** When true, {@link EXTFramebufferMultisampleBlitScaled} is supported. */
    public final boolean GL_EXT_framebuffer_multisample_blit_scaled;
    /** When true, {@link EXTFramebufferObject} is supported. */
    public final boolean GL_EXT_framebuffer_object;
    /** When true, {@link EXTFramebufferSRGB} is supported. */
    public final boolean GL_EXT_framebuffer_sRGB;
    /** When true, {@link EXTGeometryShader4} is supported. */
    public final boolean GL_EXT_geometry_shader4;
    /** When true, {@link EXTGPUProgramParameters} is supported. */
    public final boolean GL_EXT_gpu_program_parameters;
    /** When true, {@link EXTGPUShader4} is supported. */
    public final boolean GL_EXT_gpu_shader4;
    /** When true, {@link EXTMemoryObject} is supported. */
    public final boolean GL_EXT_memory_object;
    /** When true, {@link EXTMemoryObjectFD} is supported. */
    public final boolean GL_EXT_memory_object_fd;
    /** When true, {@link EXTMemoryObjectWin32} is supported. */
    public final boolean GL_EXT_memory_object_win32;
    /** When true, {@link EXTPackedDepthStencil} is supported. */
    public final boolean GL_EXT_packed_depth_stencil;
    /** When true, {@link EXTPackedFloat} is supported. */
    public final boolean GL_EXT_packed_float;
    /** When true, {@link EXTPixelBufferObject} is supported. */
    public final boolean GL_EXT_pixel_buffer_object;
    /** When true, {@link EXTPointParameters} is supported. */
    public final boolean GL_EXT_point_parameters;
    /** When true, {@link EXTPolygonOffsetClamp} is supported. */
    public final boolean GL_EXT_polygon_offset_clamp;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
     * 
     * <p>This extension allows the fragment shader to control whether values in {@code gl_SampleMaskIn[]} reflect the coverage after application of the early
     * depth and stencil tests.  This feature can be enabled with the following layout qualifier in the fragment shader:</p>
     * 
     * <pre><code>
     * layout(post_depth_coverage) in;</code></pre>
     * 
     * <p>To use this feature, early fragment tests must also be enabled in the fragment shader via:</p>
     * 
     * <pre><code>
     * layout(early_fragment_tests) in;</code></pre>
     */
    public final boolean GL_EXT_post_depth_coverage;
    /** When true, {@link EXTProvokingVertex} is supported. */
    public final boolean GL_EXT_provoking_vertex;
    /** When true, {@link EXTRasterMultisample} is supported. */
    public final boolean GL_EXT_raster_multisample;
    /** When true, {@link EXTSecondaryColor} is supported. */
    public final boolean GL_EXT_secondary_color;
    /** When true, {@link EXTSemaphore} is supported. */
    public final boolean GL_EXT_semaphore;
    /** When true, {@link EXTSemaphoreFD} is supported. */
    public final boolean GL_EXT_semaphore_fd;
    /** When true, {@link EXTSemaphoreWin32} is supported. */
    public final boolean GL_EXT_semaphore_win32;
    /** When true, {@link EXTSeparateShaderObjects} is supported. */
    public final boolean GL_EXT_separate_shader_objects;
    /** When true, {@link EXTShaderFramebufferFetch} is supported. */
    public final boolean GL_EXT_shader_framebuffer_fetch;
    /** When true, {@link EXTShaderFramebufferFetchNonCoherent} is supported. */
    public final boolean GL_EXT_shader_framebuffer_fetch_non_coherent;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_image_load_formatted.txt">EXT_shader_image_load_formatted</a> extension is supported.
     * 
     * <p>{@link ARBShaderImageLoadStore ARB_shader_image_load_store} (and OpenGL 4.2) added support for random access load and store from/to texture images, but due to hardware
     * limitations, loads were required to declare the image format in the shader source. This extension relaxes that requirement, and the return values from
     * {@code imageLoad} can be format-converted based on the format of the image binding.</p>
     */
    public final boolean GL_EXT_shader_image_load_formatted;
    /** When true, {@link EXTShaderImageLoadStore} is supported. */
    public final boolean GL_EXT_shader_image_load_store;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_integer_mix.txt">EXT_shader_integer_mix</a> extension is supported.
     * 
     * <p>GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
     * extension extends mix() to select between int, uint, and bool components.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0}.</p>
     */
    public final boolean GL_EXT_shader_integer_mix;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shadow_funcs.txt">EXT_shadow_funcs</a> extension is supported.
     * 
     * <p>This extension generalizes the {@link #GL_ARB_shadow ARB_shadow} extension to support all eight binary texture comparison functions rather than just {@link GL11#GL_LEQUAL LEQUAL} and
     * {@link GL11#GL_GEQUAL GEQUAL}.</p>
     * 
     * <p>Requires {@link #GL_ARB_depth_texture ARB_depth_texture} and {@link #GL_ARB_shadow ARB_shadow}.</p>
     */
    public final boolean GL_EXT_shadow_funcs;
    /** When true, {@link EXTSharedTexturePalette} is supported. */
    public final boolean GL_EXT_shared_texture_palette;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_sparse_texture2.txt">EXT_sparse_texture2</a> extension is supported.
     * 
     * <p>This extension builds on the {@link ARBSparseTexture ARB_sparse_texture} extension, providing the following new functionality:</p>
     * 
     * <ul>
     * <li>New built-in GLSL texture lookup and image load functions are provided that return information on whether the texels accessed for the texture
     * lookup accessed uncommitted texture memory.
     * 
     * <p>New built-in GLSL texture lookup functions are provided that specify a minimum level of detail to use for lookups where the level of detail is
     * computed automatically. This allows shaders to avoid accessing unpopulated portions of high-resolution levels of detail when it knows that the
     * memory accessed is unpopulated, either from a priori knowledge or from feedback provided by the return value of previously executed "sparse"
     * texture lookup functions.</p>
     * 
     * <p>Reads of uncommitted texture memory will act as though such memory were filled with zeroes; previously, the values returned by reads were undefined.</p>
     * 
     * <p>Standard implementation-independent virtual page sizes for internal formats required to be supported with sparse textures. These standard sizes can
     * be requested by leaving {@link ARBSparseTexture#GL_VIRTUAL_PAGE_SIZE_INDEX_ARB VIRTUAL_PAGE_SIZE_INDEX_ARB} at its initial value (0).</p>
     * 
     * <p>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
     * implementation-dependent.</p></li>
     * </ul>
     * 
     * <p>Requires {@link ARBSparseTexture ARB_sparse_texture}.</p>
     */
    public final boolean GL_EXT_sparse_texture2;
    /** When true, {@link EXTStencilClearTag} is supported. */
    public final boolean GL_EXT_stencil_clear_tag;
    /** When true, {@link EXTStencilTwoSide} is supported. */
    public final boolean GL_EXT_stencil_two_side;
    /** When true, {@link EXTStencilWrap} is supported. */
    public final boolean GL_EXT_stencil_wrap;
    /** When true, {@link EXTTextureArray} is supported. */
    public final boolean GL_EXT_texture_array;
    /** When true, {@link EXTTextureBufferObject} is supported. */
    public final boolean GL_EXT_texture_buffer_object;
    /** When true, {@link EXTTextureCompressionLATC} is supported. */
    public final boolean GL_EXT_texture_compression_latc;
    /** When true, {@link EXTTextureCompressionRGTC} is supported. */
    public final boolean GL_EXT_texture_compression_rgtc;
    /** When true, {@link EXTTextureCompressionS3TC} is supported. */
    public final boolean GL_EXT_texture_compression_s3tc;
    /** When true, {@link EXTTextureFilterAnisotropic} is supported. */
    public final boolean GL_EXT_texture_filter_anisotropic;
    /** When true, {@link EXTTextureFilterMinmax} is supported. */
    public final boolean GL_EXT_texture_filter_minmax;
    /** When true, {@link EXTTextureInteger} is supported. */
    public final boolean GL_EXT_texture_integer;
    /** When true, {@link EXTTextureMirrorClamp} is supported. */
    public final boolean GL_EXT_texture_mirror_clamp;
    /** When true, {@link EXTTextureSharedExponent} is supported. */
    public final boolean GL_EXT_texture_shared_exponent;
    /** When true, {@link EXTTextureSnorm} is supported. */
    public final boolean GL_EXT_texture_snorm;
    /** When true, {@link EXTTextureSRGB} is supported. */
    public final boolean GL_EXT_texture_sRGB;
    /** When true, {@link EXTTextureSRGBDecode} is supported. */
    public final boolean GL_EXT_texture_sRGB_decode;
    /** When true, {@link EXTTextureSwizzle} is supported. */
    public final boolean GL_EXT_texture_swizzle;
    /** When true, {@link EXTTimerQuery} is supported. */
    public final boolean GL_EXT_timer_query;
    /** When true, {@link EXTTransformFeedback} is supported. */
    public final boolean GL_EXT_transform_feedback;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_vertex_array_bgra.txt">EXT_vertex_array_bgra</a> extension is supported.
     * 
     * <p>This extension provides a single new component format for vertex arrays to read 4-component unsigned byte vertex attributes with a BGRA component
     * ordering.</p>
     * 
     * <p>OpenGL expects vertex arrays containing 4 unsigned bytes per element to be in the RGBA, STRQ, or XYZW order (reading components left-to-right in their
     * lower address to higher address order). Essentially the order the components appear in memory is the order the components appear in the resulting
     * vertex attribute vector.</p>
     * 
     * <p>However Direct3D has color (diffuse and specular) vertex arrays containing 4 unsigned bytes per element that are in a BGRA order (again reading
     * components left-to-right in their lower address to higher address order). Direct3D calls this "ARGB" reading the components in the opposite order
     * (reading components left-to-right in their higher address to lower address order). This ordering is generalized in the DirectX 10 by the
     * DXGI_FORMAT_B8G8R8A8_UNORM format.</p>
     * 
     * <p>For an OpenGL application to source color data from a vertex buffer formatted for Direct3D's color array format conventions, the application is forced
     * to either:</p>
     * 
     * <ol>
     * <li>Rely on a vertex program or shader to swizzle the color components from the BGRA to conventional RGBA order.</li>
     * <li>Re-order the color data components in the vertex buffer from Direct3D's native BGRA order to OpenGL's native RGBA order.</li>
     * </ol>
     * 
     * <p>Neither option is entirely satisfactory.</p>
     * 
     * <p>Option 1 means vertex shaders have to be re-written to source colors differently. If the same vertex shader is used with vertex arrays configured to
     * source the color as 4 floating-point color components, the swizzle for BGRA colors stored as 4 unsigned bytes is no longer appropriate. The shader's
     * swizzling of colors becomes dependent on the type and number of color components. Ideally the vertex shader should be independent from the format and
     * component ordering of the data it sources.</p>
     * 
     * <p>Option 2 is expensive because vertex buffers may have to be reformatted prior to use. OpenGL treats the memory for vertex arrays (whether client-side
     * memory or buffer objects) as essentially untyped memory and vertex arrays can be stored separately, interleaved, or even interwoven (where multiple
     * arrays overlap with differing strides and formats).</p>
     * 
     * <p>Rather than force a re-ordering of either vertex array components in memory or a vertex array format-dependent re-ordering of vertex shader inputs,
     * OpenGL can simply provide a vertex array format that matches the Direct3D color component ordering.</p>
     * 
     * <p>This approach mimics that of the EXT_bgra extension for pixel and texel formats except for vertex instead of image data.</p>
     */
    public final boolean GL_EXT_vertex_array_bgra;
    /** When true, {@link EXTVertexAttrib64bit} is supported. */
    public final boolean GL_EXT_vertex_attrib_64bit;
    /** When true, {@link EXTWin32KeyedMutex} is supported. */
    public final boolean GL_EXT_win32_keyed_mutex;
    /** When true, {@link EXTWindowRectangles} is supported. */
    public final boolean GL_EXT_window_rectangles;
    /** When true, {@link EXTX11SyncObject} is supported. */
    public final boolean GL_EXT_x11_sync_object;
    /** When true, {@link GREMEDYFrameTerminator} is supported. */
    public final boolean GL_GREMEDY_frame_terminator;
    /** When true, {@link GREMEDYStringMarker} is supported. */
    public final boolean GL_GREMEDY_string_marker;
    /** When true, {@link INTELBlackholeRender} is supported. */
    public final boolean GL_INTEL_blackhole_render;
    /** When true, {@link INTELConservativeRasterization} is supported. */
    public final boolean GL_INTEL_conservative_rasterization;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_fragment_shader_ordering.txt">INTEL_fragment_shader_ordering</a> extension is supported.
     * 
     * <p>Graphics devices may execute in parallel fragment shaders referring to the same window xy coordinates. Framebuffer writes are guaranteed to be
     * processed in primitive rasterization order, but there is no order guarantee for other instructions and image or buffer object accesses in particular.</p>
     * 
     * <p>The extension introduces a new GLSL built-in function, beginFragmentShaderOrderingINTEL(), which blocks execution of a fragment shader invocation until
     * invocations from previous primitives that map to the same xy window coordinates (and same sample when per-sample shading is active) complete their
     * execution. All memory transactions from previous fragment shader invocations are made visible to the fragment shader invocation that called
     * beginFragmentShaderOrderingINTEL() when the function returns.</p>
     */
    public final boolean GL_INTEL_fragment_shader_ordering;
    /** When true, {@link INTELFramebufferCMAA} is supported. */
    public final boolean GL_INTEL_framebuffer_CMAA;
    /** When true, {@link INTELMapTexture} is supported. */
    public final boolean GL_INTEL_map_texture;
    /** When true, {@link INTELPerformanceQuery} is supported. */
    public final boolean GL_INTEL_performance_query;
    /** When true, {@link KHRBlendEquationAdvanced} is supported. */
    public final boolean GL_KHR_blend_equation_advanced;
    /** When true, {@link KHRBlendEquationAdvancedCoherent} is supported. */
    public final boolean GL_KHR_blend_equation_advanced_coherent;
    /** When true, {@link KHRContextFlushControl} is supported. */
    public final boolean GL_KHR_context_flush_control;
    /** When true, {@link KHRDebug} is supported. */
    public final boolean GL_KHR_debug;
    /** When true, {@link KHRNoError} is supported. */
    public final boolean GL_KHR_no_error;
    /** When true, {@link KHRParallelShaderCompile} is supported. */
    public final boolean GL_KHR_parallel_shader_compile;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_robust_buffer_access_behavior.txt">KHR_robust_buffer_access_behavior</a> extension is supported.
     * 
     * <p>This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing {@link #GL_KHR_robustness KHR_robustness}
     * extension which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection
     * provided by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained
     * within the buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag
     * set.</p>
     * 
     * <p>Requires {@link GL32 OpenGL 3.2} and {@link #GL_KHR_robustness KHR_robustness}.</p>
     */
    public final boolean GL_KHR_robust_buffer_access_behavior;
    /** When true, {@link KHRRobustness} is supported. */
    public final boolean GL_KHR_robustness;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_texture_compression_astc_hdr.txt">KHR_texture_compression_astc_hdr</a> extension is supported.
     * 
     * <p>This extension corresponds to the ASTC HDR Profile, see {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr} for details.</p>
     */
    public final boolean GL_KHR_texture_compression_astc_hdr;
    /** When true, {@link KHRTextureCompressionASTCLDR} is supported. */
    public final boolean GL_KHR_texture_compression_astc_ldr;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_texture_compression_astc_sliced_3d.txt">KHR_texture_compression_astc_sliced_3d</a> extension is supported.
     * 
     * <p>Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented flexibility, while producing better or
     * comparable results than existing texture compressions at all bit rates. It includes support for 2D and slice-based 3D textures, with low and high
     * dynamic range, at bitrates from below 1 bit/pixel up to 8 bits/pixel in fine steps.</p>
     * 
     * <p>This extension extends the functionality of {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr} to include slice-based 3D textures for textures using the LDR
     * profile in the same way as the HDR profile allows slice-based 3D textures.</p>
     * 
     * <p>Requires {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr}.</p>
     */
    public final boolean GL_KHR_texture_compression_astc_sliced_3d;
    /** When true, {@link NVAlphaToCoverageDitherControl} is supported. */
    public final boolean GL_NV_alpha_to_coverage_dither_control;
    /** When true, {@link NVBindlessMultiDrawIndirect} is supported. */
    public final boolean GL_NV_bindless_multi_draw_indirect;
    /** When true, {@link NVBindlessMultiDrawIndirectCount} is supported. */
    public final boolean GL_NV_bindless_multi_draw_indirect_count;
    /** When true, {@link NVBindlessTexture} is supported. */
    public final boolean GL_NV_bindless_texture;
    /** When true, {@link NVBlendEquationAdvanced} is supported. */
    public final boolean GL_NV_blend_equation_advanced;
    /** When true, {@link NVBlendEquationAdvancedCoherent} is supported. */
    public final boolean GL_NV_blend_equation_advanced_coherent;
    /** When true, {@link NVBlendMinmaxFactor} is supported. */
    public final boolean GL_NV_blend_minmax_factor;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_blend_square.txt">NV_blend_square</a> extension is supported. */
    public final boolean GL_NV_blend_square;
    /** When true, {@link NVClipSpaceWScaling} is supported. */
    public final boolean GL_NV_clip_space_w_scaling;
    /** When true, {@link NVCommandList} is supported. */
    public final boolean GL_NV_command_list;
    /** When true, {@link NVConditionalRender} is supported. */
    public final boolean GL_NV_conditional_render;
    /** When true, {@link NVConservativeRaster} is supported. */
    public final boolean GL_NV_conservative_raster;
    /** When true, {@link NVConservativeRasterDilate} is supported. */
    public final boolean GL_NV_conservative_raster_dilate;
    /** When true, {@link NVConservativeRasterPreSnap} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap;
    /** When true, {@link NVConservativeRasterPreSnapTriangles} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap_triangles;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_conservative_raster_underestimation.txt">NV_conservative_raster_underestimation</a> extension is supported.
     * 
     * <p>The extension {@link NVConservativeRaster NV_conservative_raster} provides a new rasterization mode known as "Overestimated Conservative Rasterization", where any pixel
     * that is partially covered, even if no sample location is covered, is treated as fully covered and a corresponding fragment will be shaded. There is
     * also an "Underestimated Conservative Rasterization" variant, where only the pixels that are completely covered by the primitive are rasterized.</p>
     * 
     * <p>This extension provides the underestimated conservative rasterization information for each fragment in the fragment shader through a new built-in
     * {@code gl_FragFullyCoveredNV}.</p>
     */
    public final boolean GL_NV_conservative_raster_underestimation;
    /** When true, {@link NVCopyDepthToColor} is supported. */
    public final boolean GL_NV_copy_depth_to_color;
    /** When true, {@link NVCopyImage} is supported. */
    public final boolean GL_NV_copy_image;
    /** When true, {@link NVDeepTexture3D} is supported. */
    public final boolean GL_NV_deep_texture3D;
    /** When true, {@link NVDepthBufferFloat} is supported. */
    public final boolean GL_NV_depth_buffer_float;
    /** When true, {@link NVDepthClamp} is supported. */
    public final boolean GL_NV_depth_clamp;
    /** When true, {@link NVDrawTexture} is supported. */
    public final boolean GL_NV_draw_texture;
    /** When true, {@link NVDrawVulkanImage} is supported. */
    public final boolean GL_NV_draw_vulkan_image;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_ES3_1_compatibility.txt">NV_ES3_1_compatibility</a> extension is supported. */
    public final boolean GL_NV_ES3_1_compatibility;
    /** When true, {@link NVExplicitMultisample} is supported. */
    public final boolean GL_NV_explicit_multisample;
    /** When true, {@link NVFence} is supported. */
    public final boolean GL_NV_fence;
    /** When true, {@link NVFillRectangle} is supported. */
    public final boolean GL_NV_fill_rectangle;
    /** When true, {@link NVFloatBuffer} is supported. */
    public final boolean GL_NV_float_buffer;
    /** When true, {@link NVFogDistance} is supported. */
    public final boolean GL_NV_fog_distance;
    /** When true, {@link NVFragmentCoverageToColor} is supported. */
    public final boolean GL_NV_fragment_coverage_to_color;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_program4.txt">NV_fragment_program4</a> extension is supported. */
    public final boolean GL_NV_fragment_program4;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_program_option.txt">NV_fragment_program_option</a> extension is supported. */
    public final boolean GL_NV_fragment_program_option;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_shader_interlock.txt">NV_fragment_shader_interlock</a> extension is supported.
     * 
     * <p>In unextended OpenGL 4.3, applications may produce a large number of fragment shader invocations that perform loads and stores to memory using image
     * uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are performed by different
     * fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than once, one or more of the
     * following techniques may be required to ensure proper execution ordering:</p>
     * 
     * <ul>
     * <li>inserting Finish or WaitSync commands to drain the pipeline between different "passes" or "layers";</li>
     * <li>using only atomic memory operations to write to shader memory (which may be relatively slow and limits how memory may be updated); or</li>
     * <li>injecting spin loops into shaders to prevent multiple shader invocations from touching the same memory concurrently.</li>
     * </ul>
     * 
     * <p>This extension provides new GLSL built-in functions beginInvocationInterlockNV() and endInvocationInterlockNV() that delimit a critical section of
     * fragment shader code. For pairs of shader invocations with "overlapping" coverage in a given pixel, the OpenGL implementation will guarantee that the
     * critical section of the fragment shader will be executed for only one fragment at a time.</p>
     * 
     * <p>There are four different interlock modes supported by this extension, which are identified by layout qualifiers. The qualifiers
     * "pixel_interlock_ordered" and "pixel_interlock_unordered" provides mutual exclusion in the critical section for any pair of fragments corresponding to
     * the same pixel. When using multisampling, the qualifiers "sample_interlock_ordered" and "sample_interlock_unordered" only provide mutual exclusion for
     * pairs of fragments that both cover at least one common sample in the same pixel; these are recommended for performance if shaders use per-sample data
     * structures.</p>
     * 
     * <p>Additionally, when the "pixel_interlock_ordered" or "sample_interlock_ordered" layout qualifier is used, the interlock also guarantees that the
     * critical section for multiple shader invocations with "overlapping" coverage will be executed in the order in which the primitives were processed by
     * the GL. Such a guarantee is useful for applications like blending in the fragment shader, where an application requires that fragment values to be
     * composited in the framebuffer in primitive order.</p>
     * 
     * <p>This extension can be useful for algorithms that need to access per-pixel data structures via shader loads and stores. Such algorithms using this
     * extension can access such data structures in the critical section without worrying about other invocations for the same pixel accessing the data
     * structures concurrently. Additionally, the ordering guarantees are useful for cases where the API ordering of fragments is meaningful. For example,
     * applications may be able to execute programmable blending operations in the fragment shader, where the destination buffer is read via image loads and
     * the final value is written via image stores.</p>
     * 
     * <p>Requires {@link GL43 OpenGL 4.3} and GLSL 4.30.</p>
     */
    public final boolean GL_NV_fragment_shader_interlock;
    /** When true, {@link NVFramebufferMixedSamples} is supported. */
    public final boolean GL_NV_framebuffer_mixed_samples;
    /** When true, {@link NVFramebufferMultisampleCoverage} is supported. */
    public final boolean GL_NV_framebuffer_multisample_coverage;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_geometry_shader4.txt">NV_geometry_shader4</a> extension is supported.
     * 
     * <p>This extension builds upon the {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4} specification to provide two additional capabilities:</p>
     * 
     * <ul>
     * <li>Support for QUADS, QUAD_STRIP, and POLYGON primitive types when geometry shaders are enabled.  Such primitives will be tessellated into individual
     * triangles.</li>
     * <li>Setting the value of GEOMETRY_VERTICES_OUT_EXT will take effect immediately. It is not necessary to link the program object in order for this change
     * to take effect, as is the case in the EXT version of this extension.</li>
     * </ul>
     * 
     * <p>Requires {@link #GL_EXT_geometry_shader4 EXT_geometry_shader4}.</p>
     */
    public final boolean GL_NV_geometry_shader4;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_geometry_shader_passthrough.txt">NV_geometry_shader_passthrough</a> extension is supported.
     * 
     * <p>This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
     * vertices to output vertices.</p>
     */
    public final boolean GL_NV_geometry_shader_passthrough;
    /** When true, {@link NVGPUMulticast} is supported. */
    public final boolean GL_NV_gpu_multicast;
    /** When true, {@link NVGPUShader5} is supported. */
    public final boolean GL_NV_gpu_shader5;
    /** When true, {@link NVHalfFloat} is supported. */
    public final boolean GL_NV_half_float;
    /** When true, {@link NVInternalformatSampleQuery} is supported. */
    public final boolean GL_NV_internalformat_sample_query;
    /** When true, {@link NVLightMaxExponent} is supported. */
    public final boolean GL_NV_light_max_exponent;
    /** When true, {@link NVMultisampleCoverage} is supported. */
    public final boolean GL_NV_multisample_coverage;
    /** When true, {@link NVMultisampleFilterHint} is supported. */
    public final boolean GL_NV_multisample_filter_hint;
    /** When true, {@link NVPackedDepthStencil} is supported. */
    public final boolean GL_NV_packed_depth_stencil;
    /** When true, {@link NVPathRendering} is supported. */
    public final boolean GL_NV_path_rendering;
    /** When true, {@link NVPathRenderingSharedEdge} is supported. */
    public final boolean GL_NV_path_rendering_shared_edge;
    /** When true, {@link NVPixelDataRange} is supported. */
    public final boolean GL_NV_pixel_data_range;
    /** When true, {@link NVPointSprite} is supported. */
    public final boolean GL_NV_point_sprite;
    /** When true, {@link NVPrimitiveRestart} is supported. */
    public final boolean GL_NV_primitive_restart;
    /** When true, {@link NVQueryResource} is supported. */
    public final boolean GL_NV_query_resource;
    /** When true, {@link NVQueryResourceTag} is supported. */
    public final boolean GL_NV_query_resource_tag;
    /** When true, {@link NVRobustnessVideoMemoryPurge} is supported. */
    public final boolean GL_NV_robustness_video_memory_purge;
    /** When true, {@link NVSampleLocations} is supported. */
    public final boolean GL_NV_sample_locations;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_sample_mask_override_coverage.txt">NV_sample_mask_override_coverage</a> extension is supported.
     * 
     * <p>This extension allows the fragment shader to control whether the gl_SampleMask output can enable samples that were not covered by the original
     * primitive, or that failed the early depth/stencil tests.</p>
     */
    public final boolean GL_NV_sample_mask_override_coverage;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_atomic_float.txt">NV_shader_atomic_float</a> extension is supported.
     * 
     * <p>This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
     * texture memory with floating-point components.  The set of atomic operations provided by this extension is limited to adds and exchanges. Providing
     * atomic add support allows shaders to atomically accumulate the sum of floating-point values into buffer or texture memory across multiple (possibly
     * concurrent) shader invocations.</p>
     * 
     * <p>This extension provides GLSL support for atomics targeting image uniforms (if GLSL 4.20, {@link #GL_ARB_shader_image_load_store ARB_shader_image_load_store}, or
     * {@link #GL_EXT_shader_image_load_store EXT_shader_image_load_store} is supported) or floating-point pointers (if {@link #GL_NV_gpu_shader5 NV_gpu_shader5} is supported). Additionally, assembly opcodes
     * for these operations is also provided if <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_gpu_program5.txt">NV_gpu_program5</a> is supported.</p>
     */
    public final boolean GL_NV_shader_atomic_float;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_atomic_float64.txt">NV_shader_atomic_float64</a> extension is supported.
     * 
     * <p>This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform atomic read-modify-write operations to buffer or
     * shared memory with double-precision floating-point components.  The set of atomic operations provided by this extension is limited to adds and
     * exchanges. Providing atomic add support allows shaders to atomically accumulate the sum of double-precision floating-point values into buffer memory
     * across multiple (possibly concurrent) shader invocations.</p>
     * 
     * <p>This extension provides GLSL support for atomics targeting double-precision floating-point pointers (if {@link NVGPUShader5 NV_gpu_shader5} is supported).
     * Additionally, assembly opcodes for these operations are also provided if {@code NV_gpu_program5} is supported.</p>
     * 
     * <p>Requires {@link ARBGPUShaderFP64 ARB_gpu_shader_fp64} or {@code NV_gpu_program_fp64}.</p>
     */
    public final boolean GL_NV_shader_atomic_float64;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_atomic_fp16_vector.txt">NV_shader_atomic_fp16_vector</a> extension is supported.
     * 
     * <p>This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform a limited set of atomic read-modify-write operations
     * to buffer or texture memory with 16-bit floating point vector surface formats.</p>
     * 
     * <p>Requires {@link #GL_NV_gpu_shader5 NV_gpu_shader5}.</p>
     */
    public final boolean GL_NV_shader_atomic_fp16_vector;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_atomic_int64.txt">NV_shader_atomic_int64</a> extension is supported.
     * 
     * <p>This extension provides additional GLSL built-in functions and assembly opcodes allowing shaders to perform additional atomic read-modify-write
     * operations on 64-bit signed and unsigned integers stored in buffer object memory.</p>
     */
    public final boolean GL_NV_shader_atomic_int64;
    /** When true, {@link NVShaderBufferLoad} is supported. */
    public final boolean GL_NV_shader_buffer_load;
    /** When true, {@link NVShaderBufferStore} is supported. */
    public final boolean GL_NV_shader_buffer_store;
    /** When true, {@link NVShaderThreadGroup} is supported. */
    public final boolean GL_NV_shader_thread_group;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_thread_shuffle.txt">NV_shader_thread_shuffle</a> extension is supported.
     * 
     * <p>Implementations of the OpenGL Shading Language may, but are not required, to run multiple shader threads for a single stage as a SIMD thread group,
     * where individual execution threads are assigned to thread groups in an undefined, implementation-dependent order.  This extension provides a set of
     * new features to the OpenGL Shading Language to share data between multiple threads within a thread group.</p>
     * 
     * <p>Requires {@link GL43 OpenGL 4.3} and GLSL 4.3.</p>
     */
    public final boolean GL_NV_shader_thread_shuffle;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_stereo_view_rendering.txt">NV_stereo_view_rendering</a> extension is supported.
     * 
     * <p>Virtual reality (VR) applications often render a single logical scene from multiple views corresponding to a pair of eyes. The views (eyes) are
     * separated by a fixed offset in the X direction.</p>
     * 
     * <p>Traditionally, multiple views are rendered via multiple rendering passes. This is expensive for the GPU because the objects in the scene must be
     * transformed, rasterized, shaded, and fragment processed redundantly. This is expensive for the CPU because the scene graph needs to be visited multiple
     * times and driver validation happens for each view. Rendering N passes tends to take N times longer than a single pass.</p>
     * 
     * <p>This extension provides a mechanism to render binocular (stereo) views from a single stream of OpenGL rendering commands. Vertex, tessellation, and
     * geometry (VTG) shaders can output two positions for each vertex corresponding to the two eye views. A built-in "gl_SecondaryPositionNV" is added to
     * specify the second position. The positions from each view may be sent to different viewports and/or layers. A built-in "gl_SecondaryViewportMaskNV[]"
     * is also added to specify the viewport mask for the second view. A new layout-qualifier "secondary_view_offset" is added for built-in output "gl_Layer"
     * which allows for the geometry from each view to be sent to different layers for rendering.</p>
     * 
     * <p>Requires {@link #GL_NV_viewport_array2 NV_viewport_array2}.</p>
     */
    public final boolean GL_NV_stereo_view_rendering;
    /** When true, {@link NVTexgenReflection} is supported. */
    public final boolean GL_NV_texgen_reflection;
    /** When true, {@link NVTextureBarrier} is supported. */
    public final boolean GL_NV_texture_barrier;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_compression_vtc.txt">NV_texture_compression_vtc</a> extension is supported.
     * 
     * <p>This extension adds support for the VTC 3D texture compression formats, which are analogous to the S3TC texture compression formats, with the addition
     * of some retiling in the Z direction. VTC has the same compression ratio as S3TC and uses 4x4x1, 4x4x2, (4x4x3 when non-power-of-two textures are
     * supported), or 4x4x4 blocks.</p>
     */
    public final boolean GL_NV_texture_compression_vtc;
    /** When true, {@link NVTextureMultisample} is supported. */
    public final boolean GL_NV_texture_multisample;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_rectangle_compressed.txt">NV_texture_rectangle_compressed</a> extension is supported.
     * 
     * <p>This extension allows applications to use compressed texture formats with the {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE} texture target, removing an old limitation that
     * prohibited such usage globally for rectangle textures.</p>
     */
    public final boolean GL_NV_texture_rectangle_compressed;
    /** When true, {@link NVTransformFeedback} is supported. */
    public final boolean GL_NV_transform_feedback;
    /** When true, {@link NVTransformFeedback2} is supported. */
    public final boolean GL_NV_transform_feedback2;
    /** When true, {@link NVUniformBufferUnifiedMemory} is supported. */
    public final boolean GL_NV_uniform_buffer_unified_memory;
    /** When true, {@link NVVertexArrayRange} is supported. */
    public final boolean GL_NV_vertex_array_range;
    /** When true, {@link NVVertexArrayRange2} is supported. */
    public final boolean GL_NV_vertex_array_range2;
    /** When true, {@link NVVertexAttribInteger64bit} is supported. */
    public final boolean GL_NV_vertex_attrib_integer_64bit;
    /** When true, {@link NVVertexBufferUnifiedMemory} is supported. */
    public final boolean GL_NV_vertex_buffer_unified_memory;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_viewport_array2.txt">NV_viewport_array2</a> extension is supported.
     * 
     * <p>This extension provides new support allowing a single primitive to be broadcast to multiple viewports and/or multiple layers. A shader output
     * gl_ViewportMask[] is provided, allowing a single primitive to be output to multiple viewports simultaneously. Also, a new shader option is provided to
     * control whether the effective viewport index is added into gl_Layer. These capabilities allow a single primitive to be output to multiple layers
     * simultaneously.</p>
     * 
     * <p>The gl_ViewportMask[] output is available in vertex, tessellation control, tessellation evaluation, and geometry shaders. gl_ViewportIndex and gl_Layer
     * are also made available in all these shader stages. The actual viewport index or mask and render target layer values are taken from the last active
     * shader stage from this set of stages.</p>
     * 
     * <p>This extension is a superset of the GL_AMD_vertex_shader_layer and GL_AMD_vertex_shader_viewport_index extensions, and thus those extension strings are
     * expected to be exported if GL_NV_viewport_array2 is supported.</p>
     */
    public final boolean GL_NV_viewport_array2;
    /** When true, {@link NVViewportSwizzle} is supported. */
    public final boolean GL_NV_viewport_swizzle;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NVX/NVX_blend_equation_advanced_multi_draw_buffers.txt">NVX_blend_equation_advanced_multi_draw_buffers</a> extension is supported.
     * 
     * <p>This extension adds support for using advanced blend equations introduced with {@link NVBlendEquationAdvanced NV_blend_equation_advanced} (and standardized by
     * {@link KHRBlendEquationAdvanced KHR_blend_equation_advanced}) in conjunction with multiple draw buffers. The NV_blend_equation_advanced extension supports advanced blending
     * equations only when rending to a single color buffer using fragment color zero and throws and {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error when multiple draw buffers are
     * used. This extension removes this restriction.</p>
     * 
     * <p>Requires either {@link NVBlendEquationAdvanced NV_blend_equation_advanced} or {@link KHRBlendEquationAdvanced KHR_blend_equation_advanced}.</p>
     */
    public final boolean GL_NVX_blend_equation_advanced_multi_draw_buffers;
    /** When true, {@link NVXConditionalRender} is supported. */
    public final boolean GL_NVX_conditional_render;
    /** When true, {@link NVXGPUMemoryInfo} is supported. */
    public final boolean GL_NVX_gpu_memory_info;
    /** When true, {@link OVRMultiview} is supported. */
    public final boolean GL_OVR_multiview;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OVR/OVR_multiview2.txt">OVR_multiview2</a> extension is supported.
     * 
     * <p>This extension relaxes the restriction in OVR_multiview that only {@code gl_Position} can depend on {@code ViewID} in the vertex shader.  With this
     * change, view-dependent outputs like reflection vectors and similar are allowed.</p>
     * 
     * <p>Requires {@link GL30 OpenGL 3.0} and {@link OVRMultiview OVR_multiview}.</p>
     */
    public final boolean GL_OVR_multiview2;

    /** When true, deprecated functions are not available. */
    public final boolean forwardCompatible;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    GLCapabilities(FunctionProvider provider, Set<String> ext, boolean fc) {
        forwardCompatible = fc;

        glAccum = getFunctionAddress(fc, provider, "glAccum");
        glAlphaFunc = getFunctionAddress(fc, provider, "glAlphaFunc");
        glAreTexturesResident = getFunctionAddress(fc, provider, "glAreTexturesResident");
        glArrayElement = getFunctionAddress(fc, provider, "glArrayElement");
        glBegin = getFunctionAddress(fc, provider, "glBegin");
        glBitmap = getFunctionAddress(fc, provider, "glBitmap");
        glCallList = getFunctionAddress(fc, provider, "glCallList");
        glCallLists = getFunctionAddress(fc, provider, "glCallLists");
        glClearAccum = getFunctionAddress(fc, provider, "glClearAccum");
        glClearIndex = getFunctionAddress(fc, provider, "glClearIndex");
        glClipPlane = getFunctionAddress(fc, provider, "glClipPlane");
        glColor3b = getFunctionAddress(fc, provider, "glColor3b");
        glColor3s = getFunctionAddress(fc, provider, "glColor3s");
        glColor3i = getFunctionAddress(fc, provider, "glColor3i");
        glColor3f = getFunctionAddress(fc, provider, "glColor3f");
        glColor3d = getFunctionAddress(fc, provider, "glColor3d");
        glColor3ub = getFunctionAddress(fc, provider, "glColor3ub");
        glColor3us = getFunctionAddress(fc, provider, "glColor3us");
        glColor3ui = getFunctionAddress(fc, provider, "glColor3ui");
        glColor3bv = getFunctionAddress(fc, provider, "glColor3bv");
        glColor3sv = getFunctionAddress(fc, provider, "glColor3sv");
        glColor3iv = getFunctionAddress(fc, provider, "glColor3iv");
        glColor3fv = getFunctionAddress(fc, provider, "glColor3fv");
        glColor3dv = getFunctionAddress(fc, provider, "glColor3dv");
        glColor3ubv = getFunctionAddress(fc, provider, "glColor3ubv");
        glColor3usv = getFunctionAddress(fc, provider, "glColor3usv");
        glColor3uiv = getFunctionAddress(fc, provider, "glColor3uiv");
        glColor4b = getFunctionAddress(fc, provider, "glColor4b");
        glColor4s = getFunctionAddress(fc, provider, "glColor4s");
        glColor4i = getFunctionAddress(fc, provider, "glColor4i");
        glColor4f = getFunctionAddress(fc, provider, "glColor4f");
        glColor4d = getFunctionAddress(fc, provider, "glColor4d");
        glColor4ub = getFunctionAddress(fc, provider, "glColor4ub");
        glColor4us = getFunctionAddress(fc, provider, "glColor4us");
        glColor4ui = getFunctionAddress(fc, provider, "glColor4ui");
        glColor4bv = getFunctionAddress(fc, provider, "glColor4bv");
        glColor4sv = getFunctionAddress(fc, provider, "glColor4sv");
        glColor4iv = getFunctionAddress(fc, provider, "glColor4iv");
        glColor4fv = getFunctionAddress(fc, provider, "glColor4fv");
        glColor4dv = getFunctionAddress(fc, provider, "glColor4dv");
        glColor4ubv = getFunctionAddress(fc, provider, "glColor4ubv");
        glColor4usv = getFunctionAddress(fc, provider, "glColor4usv");
        glColor4uiv = getFunctionAddress(fc, provider, "glColor4uiv");
        glColorMaterial = getFunctionAddress(fc, provider, "glColorMaterial");
        glColorPointer = getFunctionAddress(fc, provider, "glColorPointer");
        glCopyPixels = getFunctionAddress(fc, provider, "glCopyPixels");
        glDeleteLists = getFunctionAddress(fc, provider, "glDeleteLists");
        glDisableClientState = provider.getFunctionAddress("glDisableClientState");
        glDrawPixels = getFunctionAddress(fc, provider, "glDrawPixels");
        glEdgeFlag = getFunctionAddress(fc, provider, "glEdgeFlag");
        glEdgeFlagv = getFunctionAddress(fc, provider, "glEdgeFlagv");
        glEdgeFlagPointer = getFunctionAddress(fc, provider, "glEdgeFlagPointer");
        glEnableClientState = provider.getFunctionAddress("glEnableClientState");
        glEnd = getFunctionAddress(fc, provider, "glEnd");
        glEvalCoord1f = getFunctionAddress(fc, provider, "glEvalCoord1f");
        glEvalCoord1fv = getFunctionAddress(fc, provider, "glEvalCoord1fv");
        glEvalCoord1d = getFunctionAddress(fc, provider, "glEvalCoord1d");
        glEvalCoord1dv = getFunctionAddress(fc, provider, "glEvalCoord1dv");
        glEvalCoord2f = getFunctionAddress(fc, provider, "glEvalCoord2f");
        glEvalCoord2fv = getFunctionAddress(fc, provider, "glEvalCoord2fv");
        glEvalCoord2d = getFunctionAddress(fc, provider, "glEvalCoord2d");
        glEvalCoord2dv = getFunctionAddress(fc, provider, "glEvalCoord2dv");
        glEvalMesh1 = getFunctionAddress(fc, provider, "glEvalMesh1");
        glEvalMesh2 = getFunctionAddress(fc, provider, "glEvalMesh2");
        glEvalPoint1 = getFunctionAddress(fc, provider, "glEvalPoint1");
        glEvalPoint2 = getFunctionAddress(fc, provider, "glEvalPoint2");
        glFeedbackBuffer = getFunctionAddress(fc, provider, "glFeedbackBuffer");
        glFogi = getFunctionAddress(fc, provider, "glFogi");
        glFogiv = getFunctionAddress(fc, provider, "glFogiv");
        glFogf = getFunctionAddress(fc, provider, "glFogf");
        glFogfv = getFunctionAddress(fc, provider, "glFogfv");
        glGenLists = getFunctionAddress(fc, provider, "glGenLists");
        glGetClipPlane = getFunctionAddress(fc, provider, "glGetClipPlane");
        glGetLightiv = getFunctionAddress(fc, provider, "glGetLightiv");
        glGetLightfv = getFunctionAddress(fc, provider, "glGetLightfv");
        glGetMapiv = getFunctionAddress(fc, provider, "glGetMapiv");
        glGetMapfv = getFunctionAddress(fc, provider, "glGetMapfv");
        glGetMapdv = getFunctionAddress(fc, provider, "glGetMapdv");
        glGetMaterialiv = getFunctionAddress(fc, provider, "glGetMaterialiv");
        glGetMaterialfv = getFunctionAddress(fc, provider, "glGetMaterialfv");
        glGetPixelMapfv = getFunctionAddress(fc, provider, "glGetPixelMapfv");
        glGetPixelMapusv = getFunctionAddress(fc, provider, "glGetPixelMapusv");
        glGetPixelMapuiv = getFunctionAddress(fc, provider, "glGetPixelMapuiv");
        glGetPolygonStipple = getFunctionAddress(fc, provider, "glGetPolygonStipple");
        glGetTexEnviv = getFunctionAddress(fc, provider, "glGetTexEnviv");
        glGetTexEnvfv = getFunctionAddress(fc, provider, "glGetTexEnvfv");
        glGetTexGeniv = getFunctionAddress(fc, provider, "glGetTexGeniv");
        glGetTexGenfv = getFunctionAddress(fc, provider, "glGetTexGenfv");
        glGetTexGendv = getFunctionAddress(fc, provider, "glGetTexGendv");
        glIndexi = getFunctionAddress(fc, provider, "glIndexi");
        glIndexub = getFunctionAddress(fc, provider, "glIndexub");
        glIndexs = getFunctionAddress(fc, provider, "glIndexs");
        glIndexf = getFunctionAddress(fc, provider, "glIndexf");
        glIndexd = getFunctionAddress(fc, provider, "glIndexd");
        glIndexiv = getFunctionAddress(fc, provider, "glIndexiv");
        glIndexubv = getFunctionAddress(fc, provider, "glIndexubv");
        glIndexsv = getFunctionAddress(fc, provider, "glIndexsv");
        glIndexfv = getFunctionAddress(fc, provider, "glIndexfv");
        glIndexdv = getFunctionAddress(fc, provider, "glIndexdv");
        glIndexMask = getFunctionAddress(fc, provider, "glIndexMask");
        glIndexPointer = getFunctionAddress(fc, provider, "glIndexPointer");
        glInitNames = getFunctionAddress(fc, provider, "glInitNames");
        glInterleavedArrays = getFunctionAddress(fc, provider, "glInterleavedArrays");
        glIsList = getFunctionAddress(fc, provider, "glIsList");
        glLightModeli = getFunctionAddress(fc, provider, "glLightModeli");
        glLightModelf = getFunctionAddress(fc, provider, "glLightModelf");
        glLightModeliv = getFunctionAddress(fc, provider, "glLightModeliv");
        glLightModelfv = getFunctionAddress(fc, provider, "glLightModelfv");
        glLighti = getFunctionAddress(fc, provider, "glLighti");
        glLightf = getFunctionAddress(fc, provider, "glLightf");
        glLightiv = getFunctionAddress(fc, provider, "glLightiv");
        glLightfv = getFunctionAddress(fc, provider, "glLightfv");
        glLineStipple = getFunctionAddress(fc, provider, "glLineStipple");
        glListBase = getFunctionAddress(fc, provider, "glListBase");
        glLoadMatrixf = getFunctionAddress(fc, provider, "glLoadMatrixf");
        glLoadMatrixd = getFunctionAddress(fc, provider, "glLoadMatrixd");
        glLoadIdentity = getFunctionAddress(fc, provider, "glLoadIdentity");
        glLoadName = getFunctionAddress(fc, provider, "glLoadName");
        glMap1f = getFunctionAddress(fc, provider, "glMap1f");
        glMap1d = getFunctionAddress(fc, provider, "glMap1d");
        glMap2f = getFunctionAddress(fc, provider, "glMap2f");
        glMap2d = getFunctionAddress(fc, provider, "glMap2d");
        glMapGrid1f = getFunctionAddress(fc, provider, "glMapGrid1f");
        glMapGrid1d = getFunctionAddress(fc, provider, "glMapGrid1d");
        glMapGrid2f = getFunctionAddress(fc, provider, "glMapGrid2f");
        glMapGrid2d = getFunctionAddress(fc, provider, "glMapGrid2d");
        glMateriali = getFunctionAddress(fc, provider, "glMateriali");
        glMaterialf = getFunctionAddress(fc, provider, "glMaterialf");
        glMaterialiv = getFunctionAddress(fc, provider, "glMaterialiv");
        glMaterialfv = getFunctionAddress(fc, provider, "glMaterialfv");
        glMatrixMode = getFunctionAddress(fc, provider, "glMatrixMode");
        glMultMatrixf = getFunctionAddress(fc, provider, "glMultMatrixf");
        glMultMatrixd = getFunctionAddress(fc, provider, "glMultMatrixd");
        glFrustum = getFunctionAddress(fc, provider, "glFrustum");
        glNewList = getFunctionAddress(fc, provider, "glNewList");
        glEndList = getFunctionAddress(fc, provider, "glEndList");
        glNormal3f = getFunctionAddress(fc, provider, "glNormal3f");
        glNormal3b = getFunctionAddress(fc, provider, "glNormal3b");
        glNormal3s = getFunctionAddress(fc, provider, "glNormal3s");
        glNormal3i = getFunctionAddress(fc, provider, "glNormal3i");
        glNormal3d = getFunctionAddress(fc, provider, "glNormal3d");
        glNormal3fv = getFunctionAddress(fc, provider, "glNormal3fv");
        glNormal3bv = getFunctionAddress(fc, provider, "glNormal3bv");
        glNormal3sv = getFunctionAddress(fc, provider, "glNormal3sv");
        glNormal3iv = getFunctionAddress(fc, provider, "glNormal3iv");
        glNormal3dv = getFunctionAddress(fc, provider, "glNormal3dv");
        glNormalPointer = getFunctionAddress(fc, provider, "glNormalPointer");
        glOrtho = getFunctionAddress(fc, provider, "glOrtho");
        glPassThrough = getFunctionAddress(fc, provider, "glPassThrough");
        glPixelMapfv = getFunctionAddress(fc, provider, "glPixelMapfv");
        glPixelMapusv = getFunctionAddress(fc, provider, "glPixelMapusv");
        glPixelMapuiv = getFunctionAddress(fc, provider, "glPixelMapuiv");
        glPixelTransferi = getFunctionAddress(fc, provider, "glPixelTransferi");
        glPixelTransferf = getFunctionAddress(fc, provider, "glPixelTransferf");
        glPixelZoom = getFunctionAddress(fc, provider, "glPixelZoom");
        glPolygonStipple = getFunctionAddress(fc, provider, "glPolygonStipple");
        glPushAttrib = getFunctionAddress(fc, provider, "glPushAttrib");
        glPushClientAttrib = getFunctionAddress(fc, provider, "glPushClientAttrib");
        glPopAttrib = getFunctionAddress(fc, provider, "glPopAttrib");
        glPopClientAttrib = getFunctionAddress(fc, provider, "glPopClientAttrib");
        glPopMatrix = getFunctionAddress(fc, provider, "glPopMatrix");
        glPopName = getFunctionAddress(fc, provider, "glPopName");
        glPrioritizeTextures = getFunctionAddress(fc, provider, "glPrioritizeTextures");
        glPushMatrix = getFunctionAddress(fc, provider, "glPushMatrix");
        glPushName = getFunctionAddress(fc, provider, "glPushName");
        glRasterPos2i = getFunctionAddress(fc, provider, "glRasterPos2i");
        glRasterPos2s = getFunctionAddress(fc, provider, "glRasterPos2s");
        glRasterPos2f = getFunctionAddress(fc, provider, "glRasterPos2f");
        glRasterPos2d = getFunctionAddress(fc, provider, "glRasterPos2d");
        glRasterPos2iv = getFunctionAddress(fc, provider, "glRasterPos2iv");
        glRasterPos2sv = getFunctionAddress(fc, provider, "glRasterPos2sv");
        glRasterPos2fv = getFunctionAddress(fc, provider, "glRasterPos2fv");
        glRasterPos2dv = getFunctionAddress(fc, provider, "glRasterPos2dv");
        glRasterPos3i = getFunctionAddress(fc, provider, "glRasterPos3i");
        glRasterPos3s = getFunctionAddress(fc, provider, "glRasterPos3s");
        glRasterPos3f = getFunctionAddress(fc, provider, "glRasterPos3f");
        glRasterPos3d = getFunctionAddress(fc, provider, "glRasterPos3d");
        glRasterPos3iv = getFunctionAddress(fc, provider, "glRasterPos3iv");
        glRasterPos3sv = getFunctionAddress(fc, provider, "glRasterPos3sv");
        glRasterPos3fv = getFunctionAddress(fc, provider, "glRasterPos3fv");
        glRasterPos3dv = getFunctionAddress(fc, provider, "glRasterPos3dv");
        glRasterPos4i = getFunctionAddress(fc, provider, "glRasterPos4i");
        glRasterPos4s = getFunctionAddress(fc, provider, "glRasterPos4s");
        glRasterPos4f = getFunctionAddress(fc, provider, "glRasterPos4f");
        glRasterPos4d = getFunctionAddress(fc, provider, "glRasterPos4d");
        glRasterPos4iv = getFunctionAddress(fc, provider, "glRasterPos4iv");
        glRasterPos4sv = getFunctionAddress(fc, provider, "glRasterPos4sv");
        glRasterPos4fv = getFunctionAddress(fc, provider, "glRasterPos4fv");
        glRasterPos4dv = getFunctionAddress(fc, provider, "glRasterPos4dv");
        glRecti = getFunctionAddress(fc, provider, "glRecti");
        glRects = getFunctionAddress(fc, provider, "glRects");
        glRectf = getFunctionAddress(fc, provider, "glRectf");
        glRectd = getFunctionAddress(fc, provider, "glRectd");
        glRectiv = getFunctionAddress(fc, provider, "glRectiv");
        glRectsv = getFunctionAddress(fc, provider, "glRectsv");
        glRectfv = getFunctionAddress(fc, provider, "glRectfv");
        glRectdv = getFunctionAddress(fc, provider, "glRectdv");
        glRenderMode = getFunctionAddress(fc, provider, "glRenderMode");
        glRotatef = getFunctionAddress(fc, provider, "glRotatef");
        glRotated = getFunctionAddress(fc, provider, "glRotated");
        glScalef = getFunctionAddress(fc, provider, "glScalef");
        glScaled = getFunctionAddress(fc, provider, "glScaled");
        glSelectBuffer = getFunctionAddress(fc, provider, "glSelectBuffer");
        glShadeModel = getFunctionAddress(fc, provider, "glShadeModel");
        glTexCoord1f = getFunctionAddress(fc, provider, "glTexCoord1f");
        glTexCoord1s = getFunctionAddress(fc, provider, "glTexCoord1s");
        glTexCoord1i = getFunctionAddress(fc, provider, "glTexCoord1i");
        glTexCoord1d = getFunctionAddress(fc, provider, "glTexCoord1d");
        glTexCoord1fv = getFunctionAddress(fc, provider, "glTexCoord1fv");
        glTexCoord1sv = getFunctionAddress(fc, provider, "glTexCoord1sv");
        glTexCoord1iv = getFunctionAddress(fc, provider, "glTexCoord1iv");
        glTexCoord1dv = getFunctionAddress(fc, provider, "glTexCoord1dv");
        glTexCoord2f = getFunctionAddress(fc, provider, "glTexCoord2f");
        glTexCoord2s = getFunctionAddress(fc, provider, "glTexCoord2s");
        glTexCoord2i = getFunctionAddress(fc, provider, "glTexCoord2i");
        glTexCoord2d = getFunctionAddress(fc, provider, "glTexCoord2d");
        glTexCoord2fv = getFunctionAddress(fc, provider, "glTexCoord2fv");
        glTexCoord2sv = getFunctionAddress(fc, provider, "glTexCoord2sv");
        glTexCoord2iv = getFunctionAddress(fc, provider, "glTexCoord2iv");
        glTexCoord2dv = getFunctionAddress(fc, provider, "glTexCoord2dv");
        glTexCoord3f = getFunctionAddress(fc, provider, "glTexCoord3f");
        glTexCoord3s = getFunctionAddress(fc, provider, "glTexCoord3s");
        glTexCoord3i = getFunctionAddress(fc, provider, "glTexCoord3i");
        glTexCoord3d = getFunctionAddress(fc, provider, "glTexCoord3d");
        glTexCoord3fv = getFunctionAddress(fc, provider, "glTexCoord3fv");
        glTexCoord3sv = getFunctionAddress(fc, provider, "glTexCoord3sv");
        glTexCoord3iv = getFunctionAddress(fc, provider, "glTexCoord3iv");
        glTexCoord3dv = getFunctionAddress(fc, provider, "glTexCoord3dv");
        glTexCoord4f = getFunctionAddress(fc, provider, "glTexCoord4f");
        glTexCoord4s = getFunctionAddress(fc, provider, "glTexCoord4s");
        glTexCoord4i = getFunctionAddress(fc, provider, "glTexCoord4i");
        glTexCoord4d = getFunctionAddress(fc, provider, "glTexCoord4d");
        glTexCoord4fv = getFunctionAddress(fc, provider, "glTexCoord4fv");
        glTexCoord4sv = getFunctionAddress(fc, provider, "glTexCoord4sv");
        glTexCoord4iv = getFunctionAddress(fc, provider, "glTexCoord4iv");
        glTexCoord4dv = getFunctionAddress(fc, provider, "glTexCoord4dv");
        glTexCoordPointer = getFunctionAddress(fc, provider, "glTexCoordPointer");
        glTexEnvi = getFunctionAddress(fc, provider, "glTexEnvi");
        glTexEnviv = getFunctionAddress(fc, provider, "glTexEnviv");
        glTexEnvf = getFunctionAddress(fc, provider, "glTexEnvf");
        glTexEnvfv = getFunctionAddress(fc, provider, "glTexEnvfv");
        glTexGeni = getFunctionAddress(fc, provider, "glTexGeni");
        glTexGeniv = getFunctionAddress(fc, provider, "glTexGeniv");
        glTexGenf = getFunctionAddress(fc, provider, "glTexGenf");
        glTexGenfv = getFunctionAddress(fc, provider, "glTexGenfv");
        glTexGend = getFunctionAddress(fc, provider, "glTexGend");
        glTexGendv = getFunctionAddress(fc, provider, "glTexGendv");
        glTranslatef = getFunctionAddress(fc, provider, "glTranslatef");
        glTranslated = getFunctionAddress(fc, provider, "glTranslated");
        glVertex2f = getFunctionAddress(fc, provider, "glVertex2f");
        glVertex2s = getFunctionAddress(fc, provider, "glVertex2s");
        glVertex2i = getFunctionAddress(fc, provider, "glVertex2i");
        glVertex2d = getFunctionAddress(fc, provider, "glVertex2d");
        glVertex2fv = getFunctionAddress(fc, provider, "glVertex2fv");
        glVertex2sv = getFunctionAddress(fc, provider, "glVertex2sv");
        glVertex2iv = getFunctionAddress(fc, provider, "glVertex2iv");
        glVertex2dv = getFunctionAddress(fc, provider, "glVertex2dv");
        glVertex3f = getFunctionAddress(fc, provider, "glVertex3f");
        glVertex3s = getFunctionAddress(fc, provider, "glVertex3s");
        glVertex3i = getFunctionAddress(fc, provider, "glVertex3i");
        glVertex3d = getFunctionAddress(fc, provider, "glVertex3d");
        glVertex3fv = getFunctionAddress(fc, provider, "glVertex3fv");
        glVertex3sv = getFunctionAddress(fc, provider, "glVertex3sv");
        glVertex3iv = getFunctionAddress(fc, provider, "glVertex3iv");
        glVertex3dv = getFunctionAddress(fc, provider, "glVertex3dv");
        glVertex4f = getFunctionAddress(fc, provider, "glVertex4f");
        glVertex4s = getFunctionAddress(fc, provider, "glVertex4s");
        glVertex4i = getFunctionAddress(fc, provider, "glVertex4i");
        glVertex4d = getFunctionAddress(fc, provider, "glVertex4d");
        glVertex4fv = getFunctionAddress(fc, provider, "glVertex4fv");
        glVertex4sv = getFunctionAddress(fc, provider, "glVertex4sv");
        glVertex4iv = getFunctionAddress(fc, provider, "glVertex4iv");
        glVertex4dv = getFunctionAddress(fc, provider, "glVertex4dv");
        glVertexPointer = getFunctionAddress(fc, provider, "glVertexPointer");
        glEnable = provider.getFunctionAddress("glEnable");
        glDisable = provider.getFunctionAddress("glDisable");
        glBindTexture = provider.getFunctionAddress("glBindTexture");
        glBlendFunc = provider.getFunctionAddress("glBlendFunc");
        glClear = provider.getFunctionAddress("glClear");
        glClearColor = provider.getFunctionAddress("glClearColor");
        glClearDepth = provider.getFunctionAddress("glClearDepth");
        glClearStencil = provider.getFunctionAddress("glClearStencil");
        glColorMask = provider.getFunctionAddress("glColorMask");
        glCullFace = provider.getFunctionAddress("glCullFace");
        glDepthFunc = provider.getFunctionAddress("glDepthFunc");
        glDepthMask = provider.getFunctionAddress("glDepthMask");
        glDepthRange = provider.getFunctionAddress("glDepthRange");
        glDrawArrays = provider.getFunctionAddress("glDrawArrays");
        glDrawBuffer = provider.getFunctionAddress("glDrawBuffer");
        glDrawElements = provider.getFunctionAddress("glDrawElements");
        glFinish = provider.getFunctionAddress("glFinish");
        glFlush = provider.getFunctionAddress("glFlush");
        glFrontFace = provider.getFunctionAddress("glFrontFace");
        glGenTextures = provider.getFunctionAddress("glGenTextures");
        glDeleteTextures = provider.getFunctionAddress("glDeleteTextures");
        glGetBooleanv = provider.getFunctionAddress("glGetBooleanv");
        glGetFloatv = provider.getFunctionAddress("glGetFloatv");
        glGetIntegerv = provider.getFunctionAddress("glGetIntegerv");
        glGetDoublev = provider.getFunctionAddress("glGetDoublev");
        glGetError = provider.getFunctionAddress("glGetError");
        glGetPointerv = provider.getFunctionAddress("glGetPointerv");
        glGetString = provider.getFunctionAddress("glGetString");
        glGetTexImage = provider.getFunctionAddress("glGetTexImage");
        glGetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
        glGetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
        glGetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
        glGetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
        glHint = provider.getFunctionAddress("glHint");
        glIsEnabled = provider.getFunctionAddress("glIsEnabled");
        glIsTexture = provider.getFunctionAddress("glIsTexture");
        glLineWidth = provider.getFunctionAddress("glLineWidth");
        glLogicOp = provider.getFunctionAddress("glLogicOp");
        glPixelStorei = provider.getFunctionAddress("glPixelStorei");
        glPixelStoref = provider.getFunctionAddress("glPixelStoref");
        glPointSize = provider.getFunctionAddress("glPointSize");
        glPolygonMode = provider.getFunctionAddress("glPolygonMode");
        glPolygonOffset = provider.getFunctionAddress("glPolygonOffset");
        glReadBuffer = provider.getFunctionAddress("glReadBuffer");
        glReadPixels = provider.getFunctionAddress("glReadPixels");
        glScissor = provider.getFunctionAddress("glScissor");
        glStencilFunc = provider.getFunctionAddress("glStencilFunc");
        glStencilMask = provider.getFunctionAddress("glStencilMask");
        glStencilOp = provider.getFunctionAddress("glStencilOp");
        glTexImage1D = provider.getFunctionAddress("glTexImage1D");
        glTexImage2D = provider.getFunctionAddress("glTexImage2D");
        glCopyTexImage1D = provider.getFunctionAddress("glCopyTexImage1D");
        glCopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
        glCopyTexSubImage1D = provider.getFunctionAddress("glCopyTexSubImage1D");
        glCopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
        glTexParameteri = provider.getFunctionAddress("glTexParameteri");
        glTexParameteriv = provider.getFunctionAddress("glTexParameteriv");
        glTexParameterf = provider.getFunctionAddress("glTexParameterf");
        glTexParameterfv = provider.getFunctionAddress("glTexParameterfv");
        glTexSubImage1D = provider.getFunctionAddress("glTexSubImage1D");
        glTexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
        glViewport = provider.getFunctionAddress("glViewport");
        glTexImage3D = provider.getFunctionAddress("glTexImage3D");
        glTexSubImage3D = provider.getFunctionAddress("glTexSubImage3D");
        glCopyTexSubImage3D = provider.getFunctionAddress("glCopyTexSubImage3D");
        glDrawRangeElements = provider.getFunctionAddress("glDrawRangeElements");
        glClientActiveTexture = getFunctionAddress(fc, provider, "glClientActiveTexture");
        glMultiTexCoord1f = getFunctionAddress(fc, provider, "glMultiTexCoord1f");
        glMultiTexCoord1s = getFunctionAddress(fc, provider, "glMultiTexCoord1s");
        glMultiTexCoord1i = getFunctionAddress(fc, provider, "glMultiTexCoord1i");
        glMultiTexCoord1d = getFunctionAddress(fc, provider, "glMultiTexCoord1d");
        glMultiTexCoord1fv = getFunctionAddress(fc, provider, "glMultiTexCoord1fv");
        glMultiTexCoord1sv = getFunctionAddress(fc, provider, "glMultiTexCoord1sv");
        glMultiTexCoord1iv = getFunctionAddress(fc, provider, "glMultiTexCoord1iv");
        glMultiTexCoord1dv = getFunctionAddress(fc, provider, "glMultiTexCoord1dv");
        glMultiTexCoord2f = getFunctionAddress(fc, provider, "glMultiTexCoord2f");
        glMultiTexCoord2s = getFunctionAddress(fc, provider, "glMultiTexCoord2s");
        glMultiTexCoord2i = getFunctionAddress(fc, provider, "glMultiTexCoord2i");
        glMultiTexCoord2d = getFunctionAddress(fc, provider, "glMultiTexCoord2d");
        glMultiTexCoord2fv = getFunctionAddress(fc, provider, "glMultiTexCoord2fv");
        glMultiTexCoord2sv = getFunctionAddress(fc, provider, "glMultiTexCoord2sv");
        glMultiTexCoord2iv = getFunctionAddress(fc, provider, "glMultiTexCoord2iv");
        glMultiTexCoord2dv = getFunctionAddress(fc, provider, "glMultiTexCoord2dv");
        glMultiTexCoord3f = getFunctionAddress(fc, provider, "glMultiTexCoord3f");
        glMultiTexCoord3s = getFunctionAddress(fc, provider, "glMultiTexCoord3s");
        glMultiTexCoord3i = getFunctionAddress(fc, provider, "glMultiTexCoord3i");
        glMultiTexCoord3d = getFunctionAddress(fc, provider, "glMultiTexCoord3d");
        glMultiTexCoord3fv = getFunctionAddress(fc, provider, "glMultiTexCoord3fv");
        glMultiTexCoord3sv = getFunctionAddress(fc, provider, "glMultiTexCoord3sv");
        glMultiTexCoord3iv = getFunctionAddress(fc, provider, "glMultiTexCoord3iv");
        glMultiTexCoord3dv = getFunctionAddress(fc, provider, "glMultiTexCoord3dv");
        glMultiTexCoord4f = getFunctionAddress(fc, provider, "glMultiTexCoord4f");
        glMultiTexCoord4s = getFunctionAddress(fc, provider, "glMultiTexCoord4s");
        glMultiTexCoord4i = getFunctionAddress(fc, provider, "glMultiTexCoord4i");
        glMultiTexCoord4d = getFunctionAddress(fc, provider, "glMultiTexCoord4d");
        glMultiTexCoord4fv = getFunctionAddress(fc, provider, "glMultiTexCoord4fv");
        glMultiTexCoord4sv = getFunctionAddress(fc, provider, "glMultiTexCoord4sv");
        glMultiTexCoord4iv = getFunctionAddress(fc, provider, "glMultiTexCoord4iv");
        glMultiTexCoord4dv = getFunctionAddress(fc, provider, "glMultiTexCoord4dv");
        glLoadTransposeMatrixf = getFunctionAddress(fc, provider, "glLoadTransposeMatrixf");
        glLoadTransposeMatrixd = getFunctionAddress(fc, provider, "glLoadTransposeMatrixd");
        glMultTransposeMatrixf = getFunctionAddress(fc, provider, "glMultTransposeMatrixf");
        glMultTransposeMatrixd = getFunctionAddress(fc, provider, "glMultTransposeMatrixd");
        glCompressedTexImage3D = provider.getFunctionAddress("glCompressedTexImage3D");
        glCompressedTexImage2D = provider.getFunctionAddress("glCompressedTexImage2D");
        glCompressedTexImage1D = provider.getFunctionAddress("glCompressedTexImage1D");
        glCompressedTexSubImage3D = provider.getFunctionAddress("glCompressedTexSubImage3D");
        glCompressedTexSubImage2D = provider.getFunctionAddress("glCompressedTexSubImage2D");
        glCompressedTexSubImage1D = provider.getFunctionAddress("glCompressedTexSubImage1D");
        glGetCompressedTexImage = provider.getFunctionAddress("glGetCompressedTexImage");
        glSampleCoverage = provider.getFunctionAddress("glSampleCoverage");
        glActiveTexture = provider.getFunctionAddress("glActiveTexture");
        glFogCoordf = getFunctionAddress(fc, provider, "glFogCoordf");
        glFogCoordd = getFunctionAddress(fc, provider, "glFogCoordd");
        glFogCoordfv = getFunctionAddress(fc, provider, "glFogCoordfv");
        glFogCoorddv = getFunctionAddress(fc, provider, "glFogCoorddv");
        glFogCoordPointer = getFunctionAddress(fc, provider, "glFogCoordPointer");
        glSecondaryColor3b = getFunctionAddress(fc, provider, "glSecondaryColor3b");
        glSecondaryColor3s = getFunctionAddress(fc, provider, "glSecondaryColor3s");
        glSecondaryColor3i = getFunctionAddress(fc, provider, "glSecondaryColor3i");
        glSecondaryColor3f = getFunctionAddress(fc, provider, "glSecondaryColor3f");
        glSecondaryColor3d = getFunctionAddress(fc, provider, "glSecondaryColor3d");
        glSecondaryColor3ub = getFunctionAddress(fc, provider, "glSecondaryColor3ub");
        glSecondaryColor3us = getFunctionAddress(fc, provider, "glSecondaryColor3us");
        glSecondaryColor3ui = getFunctionAddress(fc, provider, "glSecondaryColor3ui");
        glSecondaryColor3bv = getFunctionAddress(fc, provider, "glSecondaryColor3bv");
        glSecondaryColor3sv = getFunctionAddress(fc, provider, "glSecondaryColor3sv");
        glSecondaryColor3iv = getFunctionAddress(fc, provider, "glSecondaryColor3iv");
        glSecondaryColor3fv = getFunctionAddress(fc, provider, "glSecondaryColor3fv");
        glSecondaryColor3dv = getFunctionAddress(fc, provider, "glSecondaryColor3dv");
        glSecondaryColor3ubv = getFunctionAddress(fc, provider, "glSecondaryColor3ubv");
        glSecondaryColor3usv = getFunctionAddress(fc, provider, "glSecondaryColor3usv");
        glSecondaryColor3uiv = getFunctionAddress(fc, provider, "glSecondaryColor3uiv");
        glSecondaryColorPointer = getFunctionAddress(fc, provider, "glSecondaryColorPointer");
        glWindowPos2i = getFunctionAddress(fc, provider, "glWindowPos2i");
        glWindowPos2s = getFunctionAddress(fc, provider, "glWindowPos2s");
        glWindowPos2f = getFunctionAddress(fc, provider, "glWindowPos2f");
        glWindowPos2d = getFunctionAddress(fc, provider, "glWindowPos2d");
        glWindowPos2iv = getFunctionAddress(fc, provider, "glWindowPos2iv");
        glWindowPos2sv = getFunctionAddress(fc, provider, "glWindowPos2sv");
        glWindowPos2fv = getFunctionAddress(fc, provider, "glWindowPos2fv");
        glWindowPos2dv = getFunctionAddress(fc, provider, "glWindowPos2dv");
        glWindowPos3i = getFunctionAddress(fc, provider, "glWindowPos3i");
        glWindowPos3s = getFunctionAddress(fc, provider, "glWindowPos3s");
        glWindowPos3f = getFunctionAddress(fc, provider, "glWindowPos3f");
        glWindowPos3d = getFunctionAddress(fc, provider, "glWindowPos3d");
        glWindowPos3iv = getFunctionAddress(fc, provider, "glWindowPos3iv");
        glWindowPos3sv = getFunctionAddress(fc, provider, "glWindowPos3sv");
        glWindowPos3fv = getFunctionAddress(fc, provider, "glWindowPos3fv");
        glWindowPos3dv = getFunctionAddress(fc, provider, "glWindowPos3dv");
        glBlendColor = provider.getFunctionAddress("glBlendColor");
        glBlendEquation = provider.getFunctionAddress("glBlendEquation");
        glMultiDrawArrays = provider.getFunctionAddress("glMultiDrawArrays");
        glMultiDrawElements = provider.getFunctionAddress("glMultiDrawElements");
        glPointParameterf = provider.getFunctionAddress("glPointParameterf");
        glPointParameteri = provider.getFunctionAddress("glPointParameteri");
        glPointParameterfv = provider.getFunctionAddress("glPointParameterfv");
        glPointParameteriv = provider.getFunctionAddress("glPointParameteriv");
        glBlendFuncSeparate = provider.getFunctionAddress("glBlendFuncSeparate");
        glBindBuffer = provider.getFunctionAddress("glBindBuffer");
        glDeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
        glGenBuffers = provider.getFunctionAddress("glGenBuffers");
        glIsBuffer = provider.getFunctionAddress("glIsBuffer");
        glBufferData = provider.getFunctionAddress("glBufferData");
        glBufferSubData = provider.getFunctionAddress("glBufferSubData");
        glGetBufferSubData = provider.getFunctionAddress("glGetBufferSubData");
        glMapBuffer = provider.getFunctionAddress("glMapBuffer");
        glUnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
        glGetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
        glGetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
        glGenQueries = provider.getFunctionAddress("glGenQueries");
        glDeleteQueries = provider.getFunctionAddress("glDeleteQueries");
        glIsQuery = provider.getFunctionAddress("glIsQuery");
        glBeginQuery = provider.getFunctionAddress("glBeginQuery");
        glEndQuery = provider.getFunctionAddress("glEndQuery");
        glGetQueryiv = provider.getFunctionAddress("glGetQueryiv");
        glGetQueryObjectiv = provider.getFunctionAddress("glGetQueryObjectiv");
        glGetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
        glCreateProgram = provider.getFunctionAddress("glCreateProgram");
        glDeleteProgram = provider.getFunctionAddress("glDeleteProgram");
        glIsProgram = provider.getFunctionAddress("glIsProgram");
        glCreateShader = provider.getFunctionAddress("glCreateShader");
        glDeleteShader = provider.getFunctionAddress("glDeleteShader");
        glIsShader = provider.getFunctionAddress("glIsShader");
        glAttachShader = provider.getFunctionAddress("glAttachShader");
        glDetachShader = provider.getFunctionAddress("glDetachShader");
        glShaderSource = provider.getFunctionAddress("glShaderSource");
        glCompileShader = provider.getFunctionAddress("glCompileShader");
        glLinkProgram = provider.getFunctionAddress("glLinkProgram");
        glUseProgram = provider.getFunctionAddress("glUseProgram");
        glValidateProgram = provider.getFunctionAddress("glValidateProgram");
        glUniform1f = provider.getFunctionAddress("glUniform1f");
        glUniform2f = provider.getFunctionAddress("glUniform2f");
        glUniform3f = provider.getFunctionAddress("glUniform3f");
        glUniform4f = provider.getFunctionAddress("glUniform4f");
        glUniform1i = provider.getFunctionAddress("glUniform1i");
        glUniform2i = provider.getFunctionAddress("glUniform2i");
        glUniform3i = provider.getFunctionAddress("glUniform3i");
        glUniform4i = provider.getFunctionAddress("glUniform4i");
        glUniform1fv = provider.getFunctionAddress("glUniform1fv");
        glUniform2fv = provider.getFunctionAddress("glUniform2fv");
        glUniform3fv = provider.getFunctionAddress("glUniform3fv");
        glUniform4fv = provider.getFunctionAddress("glUniform4fv");
        glUniform1iv = provider.getFunctionAddress("glUniform1iv");
        glUniform2iv = provider.getFunctionAddress("glUniform2iv");
        glUniform3iv = provider.getFunctionAddress("glUniform3iv");
        glUniform4iv = provider.getFunctionAddress("glUniform4iv");
        glUniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
        glUniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
        glUniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
        glGetShaderiv = provider.getFunctionAddress("glGetShaderiv");
        glGetProgramiv = provider.getFunctionAddress("glGetProgramiv");
        glGetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
        glGetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
        glGetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
        glGetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
        glGetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
        glGetUniformfv = provider.getFunctionAddress("glGetUniformfv");
        glGetUniformiv = provider.getFunctionAddress("glGetUniformiv");
        glGetShaderSource = provider.getFunctionAddress("glGetShaderSource");
        glVertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
        glVertexAttrib1s = provider.getFunctionAddress("glVertexAttrib1s");
        glVertexAttrib1d = provider.getFunctionAddress("glVertexAttrib1d");
        glVertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
        glVertexAttrib2s = provider.getFunctionAddress("glVertexAttrib2s");
        glVertexAttrib2d = provider.getFunctionAddress("glVertexAttrib2d");
        glVertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
        glVertexAttrib3s = provider.getFunctionAddress("glVertexAttrib3s");
        glVertexAttrib3d = provider.getFunctionAddress("glVertexAttrib3d");
        glVertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
        glVertexAttrib4s = provider.getFunctionAddress("glVertexAttrib4s");
        glVertexAttrib4d = provider.getFunctionAddress("glVertexAttrib4d");
        glVertexAttrib4Nub = provider.getFunctionAddress("glVertexAttrib4Nub");
        glVertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
        glVertexAttrib1sv = provider.getFunctionAddress("glVertexAttrib1sv");
        glVertexAttrib1dv = provider.getFunctionAddress("glVertexAttrib1dv");
        glVertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
        glVertexAttrib2sv = provider.getFunctionAddress("glVertexAttrib2sv");
        glVertexAttrib2dv = provider.getFunctionAddress("glVertexAttrib2dv");
        glVertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
        glVertexAttrib3sv = provider.getFunctionAddress("glVertexAttrib3sv");
        glVertexAttrib3dv = provider.getFunctionAddress("glVertexAttrib3dv");
        glVertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
        glVertexAttrib4sv = provider.getFunctionAddress("glVertexAttrib4sv");
        glVertexAttrib4dv = provider.getFunctionAddress("glVertexAttrib4dv");
        glVertexAttrib4iv = provider.getFunctionAddress("glVertexAttrib4iv");
        glVertexAttrib4bv = provider.getFunctionAddress("glVertexAttrib4bv");
        glVertexAttrib4ubv = provider.getFunctionAddress("glVertexAttrib4ubv");
        glVertexAttrib4usv = provider.getFunctionAddress("glVertexAttrib4usv");
        glVertexAttrib4uiv = provider.getFunctionAddress("glVertexAttrib4uiv");
        glVertexAttrib4Nbv = provider.getFunctionAddress("glVertexAttrib4Nbv");
        glVertexAttrib4Nsv = provider.getFunctionAddress("glVertexAttrib4Nsv");
        glVertexAttrib4Niv = provider.getFunctionAddress("glVertexAttrib4Niv");
        glVertexAttrib4Nubv = provider.getFunctionAddress("glVertexAttrib4Nubv");
        glVertexAttrib4Nusv = provider.getFunctionAddress("glVertexAttrib4Nusv");
        glVertexAttrib4Nuiv = provider.getFunctionAddress("glVertexAttrib4Nuiv");
        glVertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
        glEnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
        glDisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
        glBindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
        glGetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
        glGetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
        glGetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
        glGetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
        glGetVertexAttribdv = provider.getFunctionAddress("glGetVertexAttribdv");
        glGetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
        glDrawBuffers = provider.getFunctionAddress("glDrawBuffers");
        glBlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
        glStencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
        glStencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
        glStencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
        glUniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
        glUniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
        glUniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
        glUniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
        glUniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
        glUniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
        glGetStringi = provider.getFunctionAddress("glGetStringi");
        glClearBufferiv = provider.getFunctionAddress("glClearBufferiv");
        glClearBufferuiv = provider.getFunctionAddress("glClearBufferuiv");
        glClearBufferfv = provider.getFunctionAddress("glClearBufferfv");
        glClearBufferfi = provider.getFunctionAddress("glClearBufferfi");
        glVertexAttribI1i = provider.getFunctionAddress("glVertexAttribI1i");
        glVertexAttribI2i = provider.getFunctionAddress("glVertexAttribI2i");
        glVertexAttribI3i = provider.getFunctionAddress("glVertexAttribI3i");
        glVertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
        glVertexAttribI1ui = provider.getFunctionAddress("glVertexAttribI1ui");
        glVertexAttribI2ui = provider.getFunctionAddress("glVertexAttribI2ui");
        glVertexAttribI3ui = provider.getFunctionAddress("glVertexAttribI3ui");
        glVertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
        glVertexAttribI1iv = provider.getFunctionAddress("glVertexAttribI1iv");
        glVertexAttribI2iv = provider.getFunctionAddress("glVertexAttribI2iv");
        glVertexAttribI3iv = provider.getFunctionAddress("glVertexAttribI3iv");
        glVertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
        glVertexAttribI1uiv = provider.getFunctionAddress("glVertexAttribI1uiv");
        glVertexAttribI2uiv = provider.getFunctionAddress("glVertexAttribI2uiv");
        glVertexAttribI3uiv = provider.getFunctionAddress("glVertexAttribI3uiv");
        glVertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
        glVertexAttribI4bv = provider.getFunctionAddress("glVertexAttribI4bv");
        glVertexAttribI4sv = provider.getFunctionAddress("glVertexAttribI4sv");
        glVertexAttribI4ubv = provider.getFunctionAddress("glVertexAttribI4ubv");
        glVertexAttribI4usv = provider.getFunctionAddress("glVertexAttribI4usv");
        glVertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
        glGetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
        glGetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
        glUniform1ui = provider.getFunctionAddress("glUniform1ui");
        glUniform2ui = provider.getFunctionAddress("glUniform2ui");
        glUniform3ui = provider.getFunctionAddress("glUniform3ui");
        glUniform4ui = provider.getFunctionAddress("glUniform4ui");
        glUniform1uiv = provider.getFunctionAddress("glUniform1uiv");
        glUniform2uiv = provider.getFunctionAddress("glUniform2uiv");
        glUniform3uiv = provider.getFunctionAddress("glUniform3uiv");
        glUniform4uiv = provider.getFunctionAddress("glUniform4uiv");
        glGetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
        glBindFragDataLocation = provider.getFunctionAddress("glBindFragDataLocation");
        glGetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
        glBeginConditionalRender = provider.getFunctionAddress("glBeginConditionalRender");
        glEndConditionalRender = provider.getFunctionAddress("glEndConditionalRender");
        glMapBufferRange = provider.getFunctionAddress("glMapBufferRange");
        glFlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
        glClampColor = provider.getFunctionAddress("glClampColor");
        glIsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
        glBindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
        glDeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
        glGenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
        glRenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
        glRenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
        glGetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
        glIsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
        glBindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
        glDeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
        glGenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
        glCheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
        glFramebufferTexture1D = provider.getFunctionAddress("glFramebufferTexture1D");
        glFramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
        glFramebufferTexture3D = provider.getFunctionAddress("glFramebufferTexture3D");
        glFramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
        glFramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
        glGetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
        glBlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
        glGenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
        glTexParameterIiv = provider.getFunctionAddress("glTexParameterIiv");
        glTexParameterIuiv = provider.getFunctionAddress("glTexParameterIuiv");
        glGetTexParameterIiv = provider.getFunctionAddress("glGetTexParameterIiv");
        glGetTexParameterIuiv = provider.getFunctionAddress("glGetTexParameterIuiv");
        glColorMaski = provider.getFunctionAddress("glColorMaski");
        glGetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
        glGetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
        glEnablei = provider.getFunctionAddress("glEnablei");
        glDisablei = provider.getFunctionAddress("glDisablei");
        glIsEnabledi = provider.getFunctionAddress("glIsEnabledi");
        glBindBufferRange = provider.getFunctionAddress("glBindBufferRange");
        glBindBufferBase = provider.getFunctionAddress("glBindBufferBase");
        glBeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
        glEndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
        glTransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
        glGetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
        glBindVertexArray = provider.getFunctionAddress("glBindVertexArray");
        glDeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
        glGenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
        glIsVertexArray = provider.getFunctionAddress("glIsVertexArray");
        glDrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
        glDrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
        glCopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
        glPrimitiveRestartIndex = provider.getFunctionAddress("glPrimitiveRestartIndex");
        glTexBuffer = provider.getFunctionAddress("glTexBuffer");
        glGetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
        glGetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
        glGetActiveUniformName = provider.getFunctionAddress("glGetActiveUniformName");
        glGetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
        glGetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
        glGetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
        glUniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
        glGetBufferParameteri64v = provider.getFunctionAddress("glGetBufferParameteri64v");
        glDrawElementsBaseVertex = provider.getFunctionAddress("glDrawElementsBaseVertex");
        glDrawRangeElementsBaseVertex = provider.getFunctionAddress("glDrawRangeElementsBaseVertex");
        glDrawElementsInstancedBaseVertex = provider.getFunctionAddress("glDrawElementsInstancedBaseVertex");
        glMultiDrawElementsBaseVertex = provider.getFunctionAddress("glMultiDrawElementsBaseVertex");
        glProvokingVertex = provider.getFunctionAddress("glProvokingVertex");
        glTexImage2DMultisample = provider.getFunctionAddress("glTexImage2DMultisample");
        glTexImage3DMultisample = provider.getFunctionAddress("glTexImage3DMultisample");
        glGetMultisamplefv = provider.getFunctionAddress("glGetMultisamplefv");
        glSampleMaski = provider.getFunctionAddress("glSampleMaski");
        glFramebufferTexture = provider.getFunctionAddress("glFramebufferTexture");
        glFenceSync = provider.getFunctionAddress("glFenceSync");
        glIsSync = provider.getFunctionAddress("glIsSync");
        glDeleteSync = provider.getFunctionAddress("glDeleteSync");
        glClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
        glWaitSync = provider.getFunctionAddress("glWaitSync");
        glGetInteger64v = provider.getFunctionAddress("glGetInteger64v");
        glGetInteger64i_v = provider.getFunctionAddress("glGetInteger64i_v");
        glGetSynciv = provider.getFunctionAddress("glGetSynciv");
        glVertexP2ui = getFunctionAddress(fc, provider, "glVertexP2ui");
        glVertexP3ui = getFunctionAddress(fc, provider, "glVertexP3ui");
        glVertexP4ui = getFunctionAddress(fc, provider, "glVertexP4ui");
        glVertexP2uiv = getFunctionAddress(fc, provider, "glVertexP2uiv");
        glVertexP3uiv = getFunctionAddress(fc, provider, "glVertexP3uiv");
        glVertexP4uiv = getFunctionAddress(fc, provider, "glVertexP4uiv");
        glTexCoordP1ui = getFunctionAddress(fc, provider, "glTexCoordP1ui");
        glTexCoordP2ui = getFunctionAddress(fc, provider, "glTexCoordP2ui");
        glTexCoordP3ui = getFunctionAddress(fc, provider, "glTexCoordP3ui");
        glTexCoordP4ui = getFunctionAddress(fc, provider, "glTexCoordP4ui");
        glTexCoordP1uiv = getFunctionAddress(fc, provider, "glTexCoordP1uiv");
        glTexCoordP2uiv = getFunctionAddress(fc, provider, "glTexCoordP2uiv");
        glTexCoordP3uiv = getFunctionAddress(fc, provider, "glTexCoordP3uiv");
        glTexCoordP4uiv = getFunctionAddress(fc, provider, "glTexCoordP4uiv");
        glMultiTexCoordP1ui = getFunctionAddress(fc, provider, "glMultiTexCoordP1ui");
        glMultiTexCoordP2ui = getFunctionAddress(fc, provider, "glMultiTexCoordP2ui");
        glMultiTexCoordP3ui = getFunctionAddress(fc, provider, "glMultiTexCoordP3ui");
        glMultiTexCoordP4ui = getFunctionAddress(fc, provider, "glMultiTexCoordP4ui");
        glMultiTexCoordP1uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP1uiv");
        glMultiTexCoordP2uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP2uiv");
        glMultiTexCoordP3uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP3uiv");
        glMultiTexCoordP4uiv = getFunctionAddress(fc, provider, "glMultiTexCoordP4uiv");
        glNormalP3ui = getFunctionAddress(fc, provider, "glNormalP3ui");
        glNormalP3uiv = getFunctionAddress(fc, provider, "glNormalP3uiv");
        glColorP3ui = getFunctionAddress(fc, provider, "glColorP3ui");
        glColorP4ui = getFunctionAddress(fc, provider, "glColorP4ui");
        glColorP3uiv = getFunctionAddress(fc, provider, "glColorP3uiv");
        glColorP4uiv = getFunctionAddress(fc, provider, "glColorP4uiv");
        glSecondaryColorP3ui = getFunctionAddress(fc, provider, "glSecondaryColorP3ui");
        glSecondaryColorP3uiv = getFunctionAddress(fc, provider, "glSecondaryColorP3uiv");
        glBindFragDataLocationIndexed = provider.getFunctionAddress("glBindFragDataLocationIndexed");
        glGetFragDataIndex = provider.getFunctionAddress("glGetFragDataIndex");
        glGenSamplers = provider.getFunctionAddress("glGenSamplers");
        glDeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
        glIsSampler = provider.getFunctionAddress("glIsSampler");
        glBindSampler = provider.getFunctionAddress("glBindSampler");
        glSamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
        glSamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
        glSamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
        glSamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
        glSamplerParameterIiv = provider.getFunctionAddress("glSamplerParameterIiv");
        glSamplerParameterIuiv = provider.getFunctionAddress("glSamplerParameterIuiv");
        glGetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
        glGetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
        glGetSamplerParameterIiv = provider.getFunctionAddress("glGetSamplerParameterIiv");
        glGetSamplerParameterIuiv = provider.getFunctionAddress("glGetSamplerParameterIuiv");
        glQueryCounter = provider.getFunctionAddress("glQueryCounter");
        glGetQueryObjecti64v = provider.getFunctionAddress("glGetQueryObjecti64v");
        glGetQueryObjectui64v = provider.getFunctionAddress("glGetQueryObjectui64v");
        glVertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
        glVertexAttribP1ui = provider.getFunctionAddress("glVertexAttribP1ui");
        glVertexAttribP2ui = provider.getFunctionAddress("glVertexAttribP2ui");
        glVertexAttribP3ui = provider.getFunctionAddress("glVertexAttribP3ui");
        glVertexAttribP4ui = provider.getFunctionAddress("glVertexAttribP4ui");
        glVertexAttribP1uiv = provider.getFunctionAddress("glVertexAttribP1uiv");
        glVertexAttribP2uiv = provider.getFunctionAddress("glVertexAttribP2uiv");
        glVertexAttribP3uiv = provider.getFunctionAddress("glVertexAttribP3uiv");
        glVertexAttribP4uiv = provider.getFunctionAddress("glVertexAttribP4uiv");
        glBlendEquationi = provider.getFunctionAddress("glBlendEquationi");
        glBlendEquationSeparatei = provider.getFunctionAddress("glBlendEquationSeparatei");
        glBlendFunci = provider.getFunctionAddress("glBlendFunci");
        glBlendFuncSeparatei = provider.getFunctionAddress("glBlendFuncSeparatei");
        glDrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
        glDrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
        glUniform1d = provider.getFunctionAddress("glUniform1d");
        glUniform2d = provider.getFunctionAddress("glUniform2d");
        glUniform3d = provider.getFunctionAddress("glUniform3d");
        glUniform4d = provider.getFunctionAddress("glUniform4d");
        glUniform1dv = provider.getFunctionAddress("glUniform1dv");
        glUniform2dv = provider.getFunctionAddress("glUniform2dv");
        glUniform3dv = provider.getFunctionAddress("glUniform3dv");
        glUniform4dv = provider.getFunctionAddress("glUniform4dv");
        glUniformMatrix2dv = provider.getFunctionAddress("glUniformMatrix2dv");
        glUniformMatrix3dv = provider.getFunctionAddress("glUniformMatrix3dv");
        glUniformMatrix4dv = provider.getFunctionAddress("glUniformMatrix4dv");
        glUniformMatrix2x3dv = provider.getFunctionAddress("glUniformMatrix2x3dv");
        glUniformMatrix2x4dv = provider.getFunctionAddress("glUniformMatrix2x4dv");
        glUniformMatrix3x2dv = provider.getFunctionAddress("glUniformMatrix3x2dv");
        glUniformMatrix3x4dv = provider.getFunctionAddress("glUniformMatrix3x4dv");
        glUniformMatrix4x2dv = provider.getFunctionAddress("glUniformMatrix4x2dv");
        glUniformMatrix4x3dv = provider.getFunctionAddress("glUniformMatrix4x3dv");
        glGetUniformdv = provider.getFunctionAddress("glGetUniformdv");
        glMinSampleShading = provider.getFunctionAddress("glMinSampleShading");
        glGetSubroutineUniformLocation = provider.getFunctionAddress("glGetSubroutineUniformLocation");
        glGetSubroutineIndex = provider.getFunctionAddress("glGetSubroutineIndex");
        glGetActiveSubroutineUniformiv = provider.getFunctionAddress("glGetActiveSubroutineUniformiv");
        glGetActiveSubroutineUniformName = provider.getFunctionAddress("glGetActiveSubroutineUniformName");
        glGetActiveSubroutineName = provider.getFunctionAddress("glGetActiveSubroutineName");
        glUniformSubroutinesuiv = provider.getFunctionAddress("glUniformSubroutinesuiv");
        glGetUniformSubroutineuiv = provider.getFunctionAddress("glGetUniformSubroutineuiv");
        glGetProgramStageiv = provider.getFunctionAddress("glGetProgramStageiv");
        glPatchParameteri = provider.getFunctionAddress("glPatchParameteri");
        glPatchParameterfv = provider.getFunctionAddress("glPatchParameterfv");
        glBindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
        glDeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
        glGenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
        glIsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
        glPauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
        glResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
        glDrawTransformFeedback = provider.getFunctionAddress("glDrawTransformFeedback");
        glDrawTransformFeedbackStream = provider.getFunctionAddress("glDrawTransformFeedbackStream");
        glBeginQueryIndexed = provider.getFunctionAddress("glBeginQueryIndexed");
        glEndQueryIndexed = provider.getFunctionAddress("glEndQueryIndexed");
        glGetQueryIndexediv = provider.getFunctionAddress("glGetQueryIndexediv");
        glReleaseShaderCompiler = provider.getFunctionAddress("glReleaseShaderCompiler");
        glShaderBinary = provider.getFunctionAddress("glShaderBinary");
        glGetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
        glDepthRangef = provider.getFunctionAddress("glDepthRangef");
        glClearDepthf = provider.getFunctionAddress("glClearDepthf");
        glGetProgramBinary = provider.getFunctionAddress("glGetProgramBinary");
        glProgramBinary = provider.getFunctionAddress("glProgramBinary");
        glProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
        glUseProgramStages = provider.getFunctionAddress("glUseProgramStages");
        glActiveShaderProgram = provider.getFunctionAddress("glActiveShaderProgram");
        glCreateShaderProgramv = provider.getFunctionAddress("glCreateShaderProgramv");
        glBindProgramPipeline = provider.getFunctionAddress("glBindProgramPipeline");
        glDeleteProgramPipelines = provider.getFunctionAddress("glDeleteProgramPipelines");
        glGenProgramPipelines = provider.getFunctionAddress("glGenProgramPipelines");
        glIsProgramPipeline = provider.getFunctionAddress("glIsProgramPipeline");
        glGetProgramPipelineiv = provider.getFunctionAddress("glGetProgramPipelineiv");
        glProgramUniform1i = provider.getFunctionAddress("glProgramUniform1i");
        glProgramUniform2i = provider.getFunctionAddress("glProgramUniform2i");
        glProgramUniform3i = provider.getFunctionAddress("glProgramUniform3i");
        glProgramUniform4i = provider.getFunctionAddress("glProgramUniform4i");
        glProgramUniform1ui = provider.getFunctionAddress("glProgramUniform1ui");
        glProgramUniform2ui = provider.getFunctionAddress("glProgramUniform2ui");
        glProgramUniform3ui = provider.getFunctionAddress("glProgramUniform3ui");
        glProgramUniform4ui = provider.getFunctionAddress("glProgramUniform4ui");
        glProgramUniform1f = provider.getFunctionAddress("glProgramUniform1f");
        glProgramUniform2f = provider.getFunctionAddress("glProgramUniform2f");
        glProgramUniform3f = provider.getFunctionAddress("glProgramUniform3f");
        glProgramUniform4f = provider.getFunctionAddress("glProgramUniform4f");
        glProgramUniform1d = provider.getFunctionAddress("glProgramUniform1d");
        glProgramUniform2d = provider.getFunctionAddress("glProgramUniform2d");
        glProgramUniform3d = provider.getFunctionAddress("glProgramUniform3d");
        glProgramUniform4d = provider.getFunctionAddress("glProgramUniform4d");
        glProgramUniform1iv = provider.getFunctionAddress("glProgramUniform1iv");
        glProgramUniform2iv = provider.getFunctionAddress("glProgramUniform2iv");
        glProgramUniform3iv = provider.getFunctionAddress("glProgramUniform3iv");
        glProgramUniform4iv = provider.getFunctionAddress("glProgramUniform4iv");
        glProgramUniform1uiv = provider.getFunctionAddress("glProgramUniform1uiv");
        glProgramUniform2uiv = provider.getFunctionAddress("glProgramUniform2uiv");
        glProgramUniform3uiv = provider.getFunctionAddress("glProgramUniform3uiv");
        glProgramUniform4uiv = provider.getFunctionAddress("glProgramUniform4uiv");
        glProgramUniform1fv = provider.getFunctionAddress("glProgramUniform1fv");
        glProgramUniform2fv = provider.getFunctionAddress("glProgramUniform2fv");
        glProgramUniform3fv = provider.getFunctionAddress("glProgramUniform3fv");
        glProgramUniform4fv = provider.getFunctionAddress("glProgramUniform4fv");
        glProgramUniform1dv = provider.getFunctionAddress("glProgramUniform1dv");
        glProgramUniform2dv = provider.getFunctionAddress("glProgramUniform2dv");
        glProgramUniform3dv = provider.getFunctionAddress("glProgramUniform3dv");
        glProgramUniform4dv = provider.getFunctionAddress("glProgramUniform4dv");
        glProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
        glProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
        glProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
        glProgramUniformMatrix2dv = provider.getFunctionAddress("glProgramUniformMatrix2dv");
        glProgramUniformMatrix3dv = provider.getFunctionAddress("glProgramUniformMatrix3dv");
        glProgramUniformMatrix4dv = provider.getFunctionAddress("glProgramUniformMatrix4dv");
        glProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
        glProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
        glProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
        glProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
        glProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
        glProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
        glProgramUniformMatrix2x3dv = provider.getFunctionAddress("glProgramUniformMatrix2x3dv");
        glProgramUniformMatrix3x2dv = provider.getFunctionAddress("glProgramUniformMatrix3x2dv");
        glProgramUniformMatrix2x4dv = provider.getFunctionAddress("glProgramUniformMatrix2x4dv");
        glProgramUniformMatrix4x2dv = provider.getFunctionAddress("glProgramUniformMatrix4x2dv");
        glProgramUniformMatrix3x4dv = provider.getFunctionAddress("glProgramUniformMatrix3x4dv");
        glProgramUniformMatrix4x3dv = provider.getFunctionAddress("glProgramUniformMatrix4x3dv");
        glValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
        glGetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
        glVertexAttribL1d = provider.getFunctionAddress("glVertexAttribL1d");
        glVertexAttribL2d = provider.getFunctionAddress("glVertexAttribL2d");
        glVertexAttribL3d = provider.getFunctionAddress("glVertexAttribL3d");
        glVertexAttribL4d = provider.getFunctionAddress("glVertexAttribL4d");
        glVertexAttribL1dv = provider.getFunctionAddress("glVertexAttribL1dv");
        glVertexAttribL2dv = provider.getFunctionAddress("glVertexAttribL2dv");
        glVertexAttribL3dv = provider.getFunctionAddress("glVertexAttribL3dv");
        glVertexAttribL4dv = provider.getFunctionAddress("glVertexAttribL4dv");
        glVertexAttribLPointer = provider.getFunctionAddress("glVertexAttribLPointer");
        glGetVertexAttribLdv = provider.getFunctionAddress("glGetVertexAttribLdv");
        glViewportArrayv = provider.getFunctionAddress("glViewportArrayv");
        glViewportIndexedf = provider.getFunctionAddress("glViewportIndexedf");
        glViewportIndexedfv = provider.getFunctionAddress("glViewportIndexedfv");
        glScissorArrayv = provider.getFunctionAddress("glScissorArrayv");
        glScissorIndexed = provider.getFunctionAddress("glScissorIndexed");
        glScissorIndexedv = provider.getFunctionAddress("glScissorIndexedv");
        glDepthRangeArrayv = provider.getFunctionAddress("glDepthRangeArrayv");
        glDepthRangeIndexed = provider.getFunctionAddress("glDepthRangeIndexed");
        glGetFloati_v = provider.getFunctionAddress("glGetFloati_v");
        glGetDoublei_v = provider.getFunctionAddress("glGetDoublei_v");
        glGetActiveAtomicCounterBufferiv = provider.getFunctionAddress("glGetActiveAtomicCounterBufferiv");
        glTexStorage1D = provider.getFunctionAddress("glTexStorage1D");
        glTexStorage2D = provider.getFunctionAddress("glTexStorage2D");
        glTexStorage3D = provider.getFunctionAddress("glTexStorage3D");
        glDrawTransformFeedbackInstanced = provider.getFunctionAddress("glDrawTransformFeedbackInstanced");
        glDrawTransformFeedbackStreamInstanced = provider.getFunctionAddress("glDrawTransformFeedbackStreamInstanced");
        glDrawArraysInstancedBaseInstance = provider.getFunctionAddress("glDrawArraysInstancedBaseInstance");
        glDrawElementsInstancedBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseInstance");
        glDrawElementsInstancedBaseVertexBaseInstance = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstance");
        glBindImageTexture = provider.getFunctionAddress("glBindImageTexture");
        glMemoryBarrier = provider.getFunctionAddress("glMemoryBarrier");
        glGetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
        glClearBufferData = provider.getFunctionAddress("glClearBufferData");
        glClearBufferSubData = provider.getFunctionAddress("glClearBufferSubData");
        glDispatchCompute = provider.getFunctionAddress("glDispatchCompute");
        glDispatchComputeIndirect = provider.getFunctionAddress("glDispatchComputeIndirect");
        glCopyImageSubData = provider.getFunctionAddress("glCopyImageSubData");
        glDebugMessageControl = provider.getFunctionAddress("glDebugMessageControl");
        glDebugMessageInsert = provider.getFunctionAddress("glDebugMessageInsert");
        glDebugMessageCallback = provider.getFunctionAddress("glDebugMessageCallback");
        glGetDebugMessageLog = provider.getFunctionAddress("glGetDebugMessageLog");
        glPushDebugGroup = provider.getFunctionAddress("glPushDebugGroup");
        glPopDebugGroup = provider.getFunctionAddress("glPopDebugGroup");
        glObjectLabel = provider.getFunctionAddress("glObjectLabel");
        glGetObjectLabel = provider.getFunctionAddress("glGetObjectLabel");
        glObjectPtrLabel = provider.getFunctionAddress("glObjectPtrLabel");
        glGetObjectPtrLabel = provider.getFunctionAddress("glGetObjectPtrLabel");
        glFramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
        glGetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
        glGetInternalformati64v = provider.getFunctionAddress("glGetInternalformati64v");
        glInvalidateTexSubImage = provider.getFunctionAddress("glInvalidateTexSubImage");
        glInvalidateTexImage = provider.getFunctionAddress("glInvalidateTexImage");
        glInvalidateBufferSubData = provider.getFunctionAddress("glInvalidateBufferSubData");
        glInvalidateBufferData = provider.getFunctionAddress("glInvalidateBufferData");
        glInvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
        glInvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
        glMultiDrawArraysIndirect = provider.getFunctionAddress("glMultiDrawArraysIndirect");
        glMultiDrawElementsIndirect = provider.getFunctionAddress("glMultiDrawElementsIndirect");
        glGetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
        glGetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
        glGetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
        glGetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
        glGetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
        glGetProgramResourceLocationIndex = provider.getFunctionAddress("glGetProgramResourceLocationIndex");
        glShaderStorageBlockBinding = provider.getFunctionAddress("glShaderStorageBlockBinding");
        glTexBufferRange = provider.getFunctionAddress("glTexBufferRange");
        glTexStorage2DMultisample = provider.getFunctionAddress("glTexStorage2DMultisample");
        glTexStorage3DMultisample = provider.getFunctionAddress("glTexStorage3DMultisample");
        glTextureView = provider.getFunctionAddress("glTextureView");
        glBindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
        glVertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
        glVertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
        glVertexAttribLFormat = provider.getFunctionAddress("glVertexAttribLFormat");
        glVertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
        glVertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
        glBufferStorage = provider.getFunctionAddress("glBufferStorage");
        glClearTexSubImage = provider.getFunctionAddress("glClearTexSubImage");
        glClearTexImage = provider.getFunctionAddress("glClearTexImage");
        glBindBuffersBase = provider.getFunctionAddress("glBindBuffersBase");
        glBindBuffersRange = provider.getFunctionAddress("glBindBuffersRange");
        glBindTextures = provider.getFunctionAddress("glBindTextures");
        glBindSamplers = provider.getFunctionAddress("glBindSamplers");
        glBindImageTextures = provider.getFunctionAddress("glBindImageTextures");
        glBindVertexBuffers = provider.getFunctionAddress("glBindVertexBuffers");
        glGetnMapdv = provider.getFunctionAddress("glGetnMapdv");
        glGetnMapfv = provider.getFunctionAddress("glGetnMapfv");
        glGetnMapiv = provider.getFunctionAddress("glGetnMapiv");
        glGetnPixelMapfv = provider.getFunctionAddress("glGetnPixelMapfv");
        glGetnPixelMapuiv = provider.getFunctionAddress("glGetnPixelMapuiv");
        glGetnPixelMapusv = provider.getFunctionAddress("glGetnPixelMapusv");
        glGetnPolygonStipple = provider.getFunctionAddress("glGetnPolygonStipple");
        glGetnColorTable = provider.getFunctionAddress("glGetnColorTable");
        glGetnConvolutionFilter = provider.getFunctionAddress("glGetnConvolutionFilter");
        glGetnSeparableFilter = provider.getFunctionAddress("glGetnSeparableFilter");
        glGetnHistogram = provider.getFunctionAddress("glGetnHistogram");
        glGetnMinmax = provider.getFunctionAddress("glGetnMinmax");
        glClipControl = provider.getFunctionAddress("glClipControl");
        glCreateTransformFeedbacks = provider.getFunctionAddress("glCreateTransformFeedbacks");
        glTransformFeedbackBufferBase = provider.getFunctionAddress("glTransformFeedbackBufferBase");
        glTransformFeedbackBufferRange = provider.getFunctionAddress("glTransformFeedbackBufferRange");
        glGetTransformFeedbackiv = provider.getFunctionAddress("glGetTransformFeedbackiv");
        glGetTransformFeedbacki_v = provider.getFunctionAddress("glGetTransformFeedbacki_v");
        glGetTransformFeedbacki64_v = provider.getFunctionAddress("glGetTransformFeedbacki64_v");
        glCreateBuffers = provider.getFunctionAddress("glCreateBuffers");
        glNamedBufferStorage = provider.getFunctionAddress("glNamedBufferStorage");
        glNamedBufferData = provider.getFunctionAddress("glNamedBufferData");
        glNamedBufferSubData = provider.getFunctionAddress("glNamedBufferSubData");
        glCopyNamedBufferSubData = provider.getFunctionAddress("glCopyNamedBufferSubData");
        glClearNamedBufferData = provider.getFunctionAddress("glClearNamedBufferData");
        glClearNamedBufferSubData = provider.getFunctionAddress("glClearNamedBufferSubData");
        glMapNamedBuffer = provider.getFunctionAddress("glMapNamedBuffer");
        glMapNamedBufferRange = provider.getFunctionAddress("glMapNamedBufferRange");
        glUnmapNamedBuffer = provider.getFunctionAddress("glUnmapNamedBuffer");
        glFlushMappedNamedBufferRange = provider.getFunctionAddress("glFlushMappedNamedBufferRange");
        glGetNamedBufferParameteriv = provider.getFunctionAddress("glGetNamedBufferParameteriv");
        glGetNamedBufferParameteri64v = provider.getFunctionAddress("glGetNamedBufferParameteri64v");
        glGetNamedBufferPointerv = provider.getFunctionAddress("glGetNamedBufferPointerv");
        glGetNamedBufferSubData = provider.getFunctionAddress("glGetNamedBufferSubData");
        glCreateFramebuffers = provider.getFunctionAddress("glCreateFramebuffers");
        glNamedFramebufferRenderbuffer = provider.getFunctionAddress("glNamedFramebufferRenderbuffer");
        glNamedFramebufferParameteri = provider.getFunctionAddress("glNamedFramebufferParameteri");
        glNamedFramebufferTexture = provider.getFunctionAddress("glNamedFramebufferTexture");
        glNamedFramebufferTextureLayer = provider.getFunctionAddress("glNamedFramebufferTextureLayer");
        glNamedFramebufferDrawBuffer = provider.getFunctionAddress("glNamedFramebufferDrawBuffer");
        glNamedFramebufferDrawBuffers = provider.getFunctionAddress("glNamedFramebufferDrawBuffers");
        glNamedFramebufferReadBuffer = provider.getFunctionAddress("glNamedFramebufferReadBuffer");
        glInvalidateNamedFramebufferData = provider.getFunctionAddress("glInvalidateNamedFramebufferData");
        glInvalidateNamedFramebufferSubData = provider.getFunctionAddress("glInvalidateNamedFramebufferSubData");
        glClearNamedFramebufferiv = provider.getFunctionAddress("glClearNamedFramebufferiv");
        glClearNamedFramebufferuiv = provider.getFunctionAddress("glClearNamedFramebufferuiv");
        glClearNamedFramebufferfv = provider.getFunctionAddress("glClearNamedFramebufferfv");
        glClearNamedFramebufferfi = provider.getFunctionAddress("glClearNamedFramebufferfi");
        glBlitNamedFramebuffer = provider.getFunctionAddress("glBlitNamedFramebuffer");
        glCheckNamedFramebufferStatus = provider.getFunctionAddress("glCheckNamedFramebufferStatus");
        glGetNamedFramebufferParameteriv = provider.getFunctionAddress("glGetNamedFramebufferParameteriv");
        glGetNamedFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetNamedFramebufferAttachmentParameteriv");
        glCreateRenderbuffers = provider.getFunctionAddress("glCreateRenderbuffers");
        glNamedRenderbufferStorage = provider.getFunctionAddress("glNamedRenderbufferStorage");
        glNamedRenderbufferStorageMultisample = provider.getFunctionAddress("glNamedRenderbufferStorageMultisample");
        glGetNamedRenderbufferParameteriv = provider.getFunctionAddress("glGetNamedRenderbufferParameteriv");
        glCreateTextures = provider.getFunctionAddress("glCreateTextures");
        glTextureBuffer = provider.getFunctionAddress("glTextureBuffer");
        glTextureBufferRange = provider.getFunctionAddress("glTextureBufferRange");
        glTextureStorage1D = provider.getFunctionAddress("glTextureStorage1D");
        glTextureStorage2D = provider.getFunctionAddress("glTextureStorage2D");
        glTextureStorage3D = provider.getFunctionAddress("glTextureStorage3D");
        glTextureStorage2DMultisample = provider.getFunctionAddress("glTextureStorage2DMultisample");
        glTextureStorage3DMultisample = provider.getFunctionAddress("glTextureStorage3DMultisample");
        glTextureSubImage1D = provider.getFunctionAddress("glTextureSubImage1D");
        glTextureSubImage2D = provider.getFunctionAddress("glTextureSubImage2D");
        glTextureSubImage3D = provider.getFunctionAddress("glTextureSubImage3D");
        glCompressedTextureSubImage1D = provider.getFunctionAddress("glCompressedTextureSubImage1D");
        glCompressedTextureSubImage2D = provider.getFunctionAddress("glCompressedTextureSubImage2D");
        glCompressedTextureSubImage3D = provider.getFunctionAddress("glCompressedTextureSubImage3D");
        glCopyTextureSubImage1D = provider.getFunctionAddress("glCopyTextureSubImage1D");
        glCopyTextureSubImage2D = provider.getFunctionAddress("glCopyTextureSubImage2D");
        glCopyTextureSubImage3D = provider.getFunctionAddress("glCopyTextureSubImage3D");
        glTextureParameterf = provider.getFunctionAddress("glTextureParameterf");
        glTextureParameterfv = provider.getFunctionAddress("glTextureParameterfv");
        glTextureParameteri = provider.getFunctionAddress("glTextureParameteri");
        glTextureParameterIiv = provider.getFunctionAddress("glTextureParameterIiv");
        glTextureParameterIuiv = provider.getFunctionAddress("glTextureParameterIuiv");
        glTextureParameteriv = provider.getFunctionAddress("glTextureParameteriv");
        glGenerateTextureMipmap = provider.getFunctionAddress("glGenerateTextureMipmap");
        glBindTextureUnit = provider.getFunctionAddress("glBindTextureUnit");
        glGetTextureImage = provider.getFunctionAddress("glGetTextureImage");
        glGetCompressedTextureImage = provider.getFunctionAddress("glGetCompressedTextureImage");
        glGetTextureLevelParameterfv = provider.getFunctionAddress("glGetTextureLevelParameterfv");
        glGetTextureLevelParameteriv = provider.getFunctionAddress("glGetTextureLevelParameteriv");
        glGetTextureParameterfv = provider.getFunctionAddress("glGetTextureParameterfv");
        glGetTextureParameterIiv = provider.getFunctionAddress("glGetTextureParameterIiv");
        glGetTextureParameterIuiv = provider.getFunctionAddress("glGetTextureParameterIuiv");
        glGetTextureParameteriv = provider.getFunctionAddress("glGetTextureParameteriv");
        glCreateVertexArrays = provider.getFunctionAddress("glCreateVertexArrays");
        glDisableVertexArrayAttrib = provider.getFunctionAddress("glDisableVertexArrayAttrib");
        glEnableVertexArrayAttrib = provider.getFunctionAddress("glEnableVertexArrayAttrib");
        glVertexArrayElementBuffer = provider.getFunctionAddress("glVertexArrayElementBuffer");
        glVertexArrayVertexBuffer = provider.getFunctionAddress("glVertexArrayVertexBuffer");
        glVertexArrayVertexBuffers = provider.getFunctionAddress("glVertexArrayVertexBuffers");
        glVertexArrayAttribFormat = provider.getFunctionAddress("glVertexArrayAttribFormat");
        glVertexArrayAttribIFormat = provider.getFunctionAddress("glVertexArrayAttribIFormat");
        glVertexArrayAttribLFormat = provider.getFunctionAddress("glVertexArrayAttribLFormat");
        glVertexArrayAttribBinding = provider.getFunctionAddress("glVertexArrayAttribBinding");
        glVertexArrayBindingDivisor = provider.getFunctionAddress("glVertexArrayBindingDivisor");
        glGetVertexArrayiv = provider.getFunctionAddress("glGetVertexArrayiv");
        glGetVertexArrayIndexediv = provider.getFunctionAddress("glGetVertexArrayIndexediv");
        glGetVertexArrayIndexed64iv = provider.getFunctionAddress("glGetVertexArrayIndexed64iv");
        glCreateSamplers = provider.getFunctionAddress("glCreateSamplers");
        glCreateProgramPipelines = provider.getFunctionAddress("glCreateProgramPipelines");
        glCreateQueries = provider.getFunctionAddress("glCreateQueries");
        glGetQueryBufferObjectiv = provider.getFunctionAddress("glGetQueryBufferObjectiv");
        glGetQueryBufferObjectuiv = provider.getFunctionAddress("glGetQueryBufferObjectuiv");
        glGetQueryBufferObjecti64v = provider.getFunctionAddress("glGetQueryBufferObjecti64v");
        glGetQueryBufferObjectui64v = provider.getFunctionAddress("glGetQueryBufferObjectui64v");
        glMemoryBarrierByRegion = provider.getFunctionAddress("glMemoryBarrierByRegion");
        glGetTextureSubImage = provider.getFunctionAddress("glGetTextureSubImage");
        glGetCompressedTextureSubImage = provider.getFunctionAddress("glGetCompressedTextureSubImage");
        glTextureBarrier = provider.getFunctionAddress("glTextureBarrier");
        glGetGraphicsResetStatus = provider.getFunctionAddress("glGetGraphicsResetStatus");
        glGetnTexImage = provider.getFunctionAddress("glGetnTexImage");
        glReadnPixels = provider.getFunctionAddress("glReadnPixels");
        glGetnCompressedTexImage = provider.getFunctionAddress("glGetnCompressedTexImage");
        glGetnUniformfv = provider.getFunctionAddress("glGetnUniformfv");
        glGetnUniformdv = provider.getFunctionAddress("glGetnUniformdv");
        glGetnUniformiv = provider.getFunctionAddress("glGetnUniformiv");
        glGetnUniformuiv = provider.getFunctionAddress("glGetnUniformuiv");
        glMultiDrawArraysIndirectCount = provider.getFunctionAddress("glMultiDrawArraysIndirectCount");
        glMultiDrawElementsIndirectCount = provider.getFunctionAddress("glMultiDrawElementsIndirectCount");
        glPolygonOffsetClamp = provider.getFunctionAddress("glPolygonOffsetClamp");
        glSpecializeShader = provider.getFunctionAddress("glSpecializeShader");
        glDebugMessageEnableAMD = provider.getFunctionAddress("glDebugMessageEnableAMD");
        glDebugMessageInsertAMD = provider.getFunctionAddress("glDebugMessageInsertAMD");
        glDebugMessageCallbackAMD = provider.getFunctionAddress("glDebugMessageCallbackAMD");
        glGetDebugMessageLogAMD = provider.getFunctionAddress("glGetDebugMessageLogAMD");
        glBlendFuncIndexedAMD = provider.getFunctionAddress("glBlendFuncIndexedAMD");
        glBlendFuncSeparateIndexedAMD = provider.getFunctionAddress("glBlendFuncSeparateIndexedAMD");
        glBlendEquationIndexedAMD = provider.getFunctionAddress("glBlendEquationIndexedAMD");
        glBlendEquationSeparateIndexedAMD = provider.getFunctionAddress("glBlendEquationSeparateIndexedAMD");
        glVertexAttribParameteriAMD = provider.getFunctionAddress("glVertexAttribParameteriAMD");
        glQueryObjectParameteruiAMD = provider.getFunctionAddress("glQueryObjectParameteruiAMD");
        glGetPerfMonitorGroupsAMD = provider.getFunctionAddress("glGetPerfMonitorGroupsAMD");
        glGetPerfMonitorCountersAMD = provider.getFunctionAddress("glGetPerfMonitorCountersAMD");
        glGetPerfMonitorGroupStringAMD = provider.getFunctionAddress("glGetPerfMonitorGroupStringAMD");
        glGetPerfMonitorCounterStringAMD = provider.getFunctionAddress("glGetPerfMonitorCounterStringAMD");
        glGetPerfMonitorCounterInfoAMD = provider.getFunctionAddress("glGetPerfMonitorCounterInfoAMD");
        glGenPerfMonitorsAMD = provider.getFunctionAddress("glGenPerfMonitorsAMD");
        glDeletePerfMonitorsAMD = provider.getFunctionAddress("glDeletePerfMonitorsAMD");
        glSelectPerfMonitorCountersAMD = provider.getFunctionAddress("glSelectPerfMonitorCountersAMD");
        glBeginPerfMonitorAMD = provider.getFunctionAddress("glBeginPerfMonitorAMD");
        glEndPerfMonitorAMD = provider.getFunctionAddress("glEndPerfMonitorAMD");
        glGetPerfMonitorCounterDataAMD = provider.getFunctionAddress("glGetPerfMonitorCounterDataAMD");
        glSetMultisamplefvAMD = provider.getFunctionAddress("glSetMultisamplefvAMD");
        glTexStorageSparseAMD = provider.getFunctionAddress("glTexStorageSparseAMD");
        glTextureStorageSparseAMD = provider.getFunctionAddress("glTextureStorageSparseAMD");
        glStencilOpValueAMD = provider.getFunctionAddress("glStencilOpValueAMD");
        glTessellationFactorAMD = provider.getFunctionAddress("glTessellationFactorAMD");
        glTessellationModeAMD = provider.getFunctionAddress("glTessellationModeAMD");
        glGetTextureHandleARB = provider.getFunctionAddress("glGetTextureHandleARB");
        glGetTextureSamplerHandleARB = provider.getFunctionAddress("glGetTextureSamplerHandleARB");
        glMakeTextureHandleResidentARB = provider.getFunctionAddress("glMakeTextureHandleResidentARB");
        glMakeTextureHandleNonResidentARB = provider.getFunctionAddress("glMakeTextureHandleNonResidentARB");
        glGetImageHandleARB = provider.getFunctionAddress("glGetImageHandleARB");
        glMakeImageHandleResidentARB = provider.getFunctionAddress("glMakeImageHandleResidentARB");
        glMakeImageHandleNonResidentARB = provider.getFunctionAddress("glMakeImageHandleNonResidentARB");
        glUniformHandleui64ARB = provider.getFunctionAddress("glUniformHandleui64ARB");
        glUniformHandleui64vARB = provider.getFunctionAddress("glUniformHandleui64vARB");
        glProgramUniformHandleui64ARB = provider.getFunctionAddress("glProgramUniformHandleui64ARB");
        glProgramUniformHandleui64vARB = provider.getFunctionAddress("glProgramUniformHandleui64vARB");
        glIsTextureHandleResidentARB = provider.getFunctionAddress("glIsTextureHandleResidentARB");
        glIsImageHandleResidentARB = provider.getFunctionAddress("glIsImageHandleResidentARB");
        glVertexAttribL1ui64ARB = provider.getFunctionAddress("glVertexAttribL1ui64ARB");
        glVertexAttribL1ui64vARB = provider.getFunctionAddress("glVertexAttribL1ui64vARB");
        glGetVertexAttribLui64vARB = provider.getFunctionAddress("glGetVertexAttribLui64vARB");
        glNamedBufferStorageEXT = provider.getFunctionAddress("glNamedBufferStorageEXT");
        glCreateSyncFromCLeventARB = provider.getFunctionAddress("glCreateSyncFromCLeventARB");
        glClearNamedBufferDataEXT = provider.getFunctionAddress("glClearNamedBufferDataEXT");
        glClearNamedBufferSubDataEXT = provider.getFunctionAddress("glClearNamedBufferSubDataEXT");
        glClampColorARB = provider.getFunctionAddress("glClampColorARB");
        glDispatchComputeGroupSizeARB = provider.getFunctionAddress("glDispatchComputeGroupSizeARB");
        glDebugMessageControlARB = provider.getFunctionAddress("glDebugMessageControlARB");
        glDebugMessageInsertARB = provider.getFunctionAddress("glDebugMessageInsertARB");
        glDebugMessageCallbackARB = provider.getFunctionAddress("glDebugMessageCallbackARB");
        glGetDebugMessageLogARB = provider.getFunctionAddress("glGetDebugMessageLogARB");
        glDrawBuffersARB = provider.getFunctionAddress("glDrawBuffersARB");
        glBlendEquationiARB = provider.getFunctionAddress("glBlendEquationiARB");
        glBlendEquationSeparateiARB = provider.getFunctionAddress("glBlendEquationSeparateiARB");
        glBlendFunciARB = provider.getFunctionAddress("glBlendFunciARB");
        glBlendFuncSeparateiARB = provider.getFunctionAddress("glBlendFuncSeparateiARB");
        glDrawArraysInstancedARB = provider.getFunctionAddress("glDrawArraysInstancedARB");
        glDrawElementsInstancedARB = provider.getFunctionAddress("glDrawElementsInstancedARB");
        glPrimitiveBoundingBoxARB = provider.getFunctionAddress("glPrimitiveBoundingBoxARB");
        glNamedFramebufferParameteriEXT = provider.getFunctionAddress("glNamedFramebufferParameteriEXT");
        glGetNamedFramebufferParameterivEXT = provider.getFunctionAddress("glGetNamedFramebufferParameterivEXT");
        glProgramParameteriARB = provider.getFunctionAddress("glProgramParameteriARB");
        glFramebufferTextureARB = provider.getFunctionAddress("glFramebufferTextureARB");
        glFramebufferTextureLayerARB = provider.getFunctionAddress("glFramebufferTextureLayerARB");
        glFramebufferTextureFaceARB = provider.getFunctionAddress("glFramebufferTextureFaceARB");
        glSpecializeShaderARB = provider.getFunctionAddress("glSpecializeShaderARB");
        glProgramUniform1dEXT = provider.getFunctionAddress("glProgramUniform1dEXT");
        glProgramUniform2dEXT = provider.getFunctionAddress("glProgramUniform2dEXT");
        glProgramUniform3dEXT = provider.getFunctionAddress("glProgramUniform3dEXT");
        glProgramUniform4dEXT = provider.getFunctionAddress("glProgramUniform4dEXT");
        glProgramUniform1dvEXT = provider.getFunctionAddress("glProgramUniform1dvEXT");
        glProgramUniform2dvEXT = provider.getFunctionAddress("glProgramUniform2dvEXT");
        glProgramUniform3dvEXT = provider.getFunctionAddress("glProgramUniform3dvEXT");
        glProgramUniform4dvEXT = provider.getFunctionAddress("glProgramUniform4dvEXT");
        glProgramUniformMatrix2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2dvEXT");
        glProgramUniformMatrix3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3dvEXT");
        glProgramUniformMatrix4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4dvEXT");
        glProgramUniformMatrix2x3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3dvEXT");
        glProgramUniformMatrix2x4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4dvEXT");
        glProgramUniformMatrix3x2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2dvEXT");
        glProgramUniformMatrix3x4dvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4dvEXT");
        glProgramUniformMatrix4x2dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2dvEXT");
        glProgramUniformMatrix4x3dvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3dvEXT");
        glUniform1i64ARB = provider.getFunctionAddress("glUniform1i64ARB");
        glUniform1i64vARB = provider.getFunctionAddress("glUniform1i64vARB");
        glProgramUniform1i64ARB = provider.getFunctionAddress("glProgramUniform1i64ARB");
        glProgramUniform1i64vARB = provider.getFunctionAddress("glProgramUniform1i64vARB");
        glUniform2i64ARB = provider.getFunctionAddress("glUniform2i64ARB");
        glUniform2i64vARB = provider.getFunctionAddress("glUniform2i64vARB");
        glProgramUniform2i64ARB = provider.getFunctionAddress("glProgramUniform2i64ARB");
        glProgramUniform2i64vARB = provider.getFunctionAddress("glProgramUniform2i64vARB");
        glUniform3i64ARB = provider.getFunctionAddress("glUniform3i64ARB");
        glUniform3i64vARB = provider.getFunctionAddress("glUniform3i64vARB");
        glProgramUniform3i64ARB = provider.getFunctionAddress("glProgramUniform3i64ARB");
        glProgramUniform3i64vARB = provider.getFunctionAddress("glProgramUniform3i64vARB");
        glUniform4i64ARB = provider.getFunctionAddress("glUniform4i64ARB");
        glUniform4i64vARB = provider.getFunctionAddress("glUniform4i64vARB");
        glProgramUniform4i64ARB = provider.getFunctionAddress("glProgramUniform4i64ARB");
        glProgramUniform4i64vARB = provider.getFunctionAddress("glProgramUniform4i64vARB");
        glUniform1ui64ARB = provider.getFunctionAddress("glUniform1ui64ARB");
        glUniform1ui64vARB = provider.getFunctionAddress("glUniform1ui64vARB");
        glProgramUniform1ui64ARB = provider.getFunctionAddress("glProgramUniform1ui64ARB");
        glProgramUniform1ui64vARB = provider.getFunctionAddress("glProgramUniform1ui64vARB");
        glUniform2ui64ARB = provider.getFunctionAddress("glUniform2ui64ARB");
        glUniform2ui64vARB = provider.getFunctionAddress("glUniform2ui64vARB");
        glProgramUniform2ui64ARB = provider.getFunctionAddress("glProgramUniform2ui64ARB");
        glProgramUniform2ui64vARB = provider.getFunctionAddress("glProgramUniform2ui64vARB");
        glUniform3ui64ARB = provider.getFunctionAddress("glUniform3ui64ARB");
        glUniform3ui64vARB = provider.getFunctionAddress("glUniform3ui64vARB");
        glProgramUniform3ui64ARB = provider.getFunctionAddress("glProgramUniform3ui64ARB");
        glProgramUniform3ui64vARB = provider.getFunctionAddress("glProgramUniform3ui64vARB");
        glUniform4ui64ARB = provider.getFunctionAddress("glUniform4ui64ARB");
        glUniform4ui64vARB = provider.getFunctionAddress("glUniform4ui64vARB");
        glProgramUniform4ui64ARB = provider.getFunctionAddress("glProgramUniform4ui64ARB");
        glProgramUniform4ui64vARB = provider.getFunctionAddress("glProgramUniform4ui64vARB");
        glGetUniformi64vARB = provider.getFunctionAddress("glGetUniformi64vARB");
        glGetUniformui64vARB = provider.getFunctionAddress("glGetUniformui64vARB");
        glGetnUniformi64vARB = provider.getFunctionAddress("glGetnUniformi64vARB");
        glGetnUniformui64vARB = provider.getFunctionAddress("glGetnUniformui64vARB");
        glColorTable = getFunctionAddress(fc, provider, "glColorTable");
        glCopyColorTable = getFunctionAddress(fc, provider, "glCopyColorTable");
        glColorTableParameteriv = getFunctionAddress(fc, provider, "glColorTableParameteriv");
        glColorTableParameterfv = getFunctionAddress(fc, provider, "glColorTableParameterfv");
        glGetColorTable = getFunctionAddress(fc, provider, "glGetColorTable");
        glGetColorTableParameteriv = getFunctionAddress(fc, provider, "glGetColorTableParameteriv");
        glGetColorTableParameterfv = getFunctionAddress(fc, provider, "glGetColorTableParameterfv");
        glColorSubTable = getFunctionAddress(fc, provider, "glColorSubTable");
        glCopyColorSubTable = getFunctionAddress(fc, provider, "glCopyColorSubTable");
        glConvolutionFilter1D = getFunctionAddress(fc, provider, "glConvolutionFilter1D");
        glConvolutionFilter2D = getFunctionAddress(fc, provider, "glConvolutionFilter2D");
        glCopyConvolutionFilter1D = getFunctionAddress(fc, provider, "glCopyConvolutionFilter1D");
        glCopyConvolutionFilter2D = getFunctionAddress(fc, provider, "glCopyConvolutionFilter2D");
        glGetConvolutionFilter = getFunctionAddress(fc, provider, "glGetConvolutionFilter");
        glSeparableFilter2D = getFunctionAddress(fc, provider, "glSeparableFilter2D");
        glGetSeparableFilter = getFunctionAddress(fc, provider, "glGetSeparableFilter");
        glConvolutionParameteri = getFunctionAddress(fc, provider, "glConvolutionParameteri");
        glConvolutionParameteriv = getFunctionAddress(fc, provider, "glConvolutionParameteriv");
        glConvolutionParameterf = getFunctionAddress(fc, provider, "glConvolutionParameterf");
        glConvolutionParameterfv = getFunctionAddress(fc, provider, "glConvolutionParameterfv");
        glGetConvolutionParameteriv = getFunctionAddress(fc, provider, "glGetConvolutionParameteriv");
        glGetConvolutionParameterfv = getFunctionAddress(fc, provider, "glGetConvolutionParameterfv");
        glHistogram = getFunctionAddress(fc, provider, "glHistogram");
        glResetHistogram = getFunctionAddress(fc, provider, "glResetHistogram");
        glGetHistogram = getFunctionAddress(fc, provider, "glGetHistogram");
        glGetHistogramParameteriv = getFunctionAddress(fc, provider, "glGetHistogramParameteriv");
        glGetHistogramParameterfv = getFunctionAddress(fc, provider, "glGetHistogramParameterfv");
        glMinmax = getFunctionAddress(fc, provider, "glMinmax");
        glResetMinmax = getFunctionAddress(fc, provider, "glResetMinmax");
        glGetMinmax = getFunctionAddress(fc, provider, "glGetMinmax");
        glGetMinmaxParameteriv = getFunctionAddress(fc, provider, "glGetMinmaxParameteriv");
        glGetMinmaxParameterfv = getFunctionAddress(fc, provider, "glGetMinmaxParameterfv");
        glMultiDrawArraysIndirectCountARB = provider.getFunctionAddress("glMultiDrawArraysIndirectCountARB");
        glMultiDrawElementsIndirectCountARB = provider.getFunctionAddress("glMultiDrawElementsIndirectCountARB");
        glVertexAttribDivisorARB = provider.getFunctionAddress("glVertexAttribDivisorARB");
        glVertexArrayVertexAttribDivisorEXT = provider.getFunctionAddress("glVertexArrayVertexAttribDivisorEXT");
        glCurrentPaletteMatrixARB = provider.getFunctionAddress("glCurrentPaletteMatrixARB");
        glMatrixIndexuivARB = provider.getFunctionAddress("glMatrixIndexuivARB");
        glMatrixIndexubvARB = provider.getFunctionAddress("glMatrixIndexubvARB");
        glMatrixIndexusvARB = provider.getFunctionAddress("glMatrixIndexusvARB");
        glMatrixIndexPointerARB = provider.getFunctionAddress("glMatrixIndexPointerARB");
        glSampleCoverageARB = provider.getFunctionAddress("glSampleCoverageARB");
        glActiveTextureARB = provider.getFunctionAddress("glActiveTextureARB");
        glClientActiveTextureARB = provider.getFunctionAddress("glClientActiveTextureARB");
        glMultiTexCoord1fARB = provider.getFunctionAddress("glMultiTexCoord1fARB");
        glMultiTexCoord1sARB = provider.getFunctionAddress("glMultiTexCoord1sARB");
        glMultiTexCoord1iARB = provider.getFunctionAddress("glMultiTexCoord1iARB");
        glMultiTexCoord1dARB = provider.getFunctionAddress("glMultiTexCoord1dARB");
        glMultiTexCoord1fvARB = provider.getFunctionAddress("glMultiTexCoord1fvARB");
        glMultiTexCoord1svARB = provider.getFunctionAddress("glMultiTexCoord1svARB");
        glMultiTexCoord1ivARB = provider.getFunctionAddress("glMultiTexCoord1ivARB");
        glMultiTexCoord1dvARB = provider.getFunctionAddress("glMultiTexCoord1dvARB");
        glMultiTexCoord2fARB = provider.getFunctionAddress("glMultiTexCoord2fARB");
        glMultiTexCoord2sARB = provider.getFunctionAddress("glMultiTexCoord2sARB");
        glMultiTexCoord2iARB = provider.getFunctionAddress("glMultiTexCoord2iARB");
        glMultiTexCoord2dARB = provider.getFunctionAddress("glMultiTexCoord2dARB");
        glMultiTexCoord2fvARB = provider.getFunctionAddress("glMultiTexCoord2fvARB");
        glMultiTexCoord2svARB = provider.getFunctionAddress("glMultiTexCoord2svARB");
        glMultiTexCoord2ivARB = provider.getFunctionAddress("glMultiTexCoord2ivARB");
        glMultiTexCoord2dvARB = provider.getFunctionAddress("glMultiTexCoord2dvARB");
        glMultiTexCoord3fARB = provider.getFunctionAddress("glMultiTexCoord3fARB");
        glMultiTexCoord3sARB = provider.getFunctionAddress("glMultiTexCoord3sARB");
        glMultiTexCoord3iARB = provider.getFunctionAddress("glMultiTexCoord3iARB");
        glMultiTexCoord3dARB = provider.getFunctionAddress("glMultiTexCoord3dARB");
        glMultiTexCoord3fvARB = provider.getFunctionAddress("glMultiTexCoord3fvARB");
        glMultiTexCoord3svARB = provider.getFunctionAddress("glMultiTexCoord3svARB");
        glMultiTexCoord3ivARB = provider.getFunctionAddress("glMultiTexCoord3ivARB");
        glMultiTexCoord3dvARB = provider.getFunctionAddress("glMultiTexCoord3dvARB");
        glMultiTexCoord4fARB = provider.getFunctionAddress("glMultiTexCoord4fARB");
        glMultiTexCoord4sARB = provider.getFunctionAddress("glMultiTexCoord4sARB");
        glMultiTexCoord4iARB = provider.getFunctionAddress("glMultiTexCoord4iARB");
        glMultiTexCoord4dARB = provider.getFunctionAddress("glMultiTexCoord4dARB");
        glMultiTexCoord4fvARB = provider.getFunctionAddress("glMultiTexCoord4fvARB");
        glMultiTexCoord4svARB = provider.getFunctionAddress("glMultiTexCoord4svARB");
        glMultiTexCoord4ivARB = provider.getFunctionAddress("glMultiTexCoord4ivARB");
        glMultiTexCoord4dvARB = provider.getFunctionAddress("glMultiTexCoord4dvARB");
        glGenQueriesARB = provider.getFunctionAddress("glGenQueriesARB");
        glDeleteQueriesARB = provider.getFunctionAddress("glDeleteQueriesARB");
        glIsQueryARB = provider.getFunctionAddress("glIsQueryARB");
        glBeginQueryARB = provider.getFunctionAddress("glBeginQueryARB");
        glEndQueryARB = provider.getFunctionAddress("glEndQueryARB");
        glGetQueryivARB = provider.getFunctionAddress("glGetQueryivARB");
        glGetQueryObjectivARB = provider.getFunctionAddress("glGetQueryObjectivARB");
        glGetQueryObjectuivARB = provider.getFunctionAddress("glGetQueryObjectuivARB");
        glMaxShaderCompilerThreadsARB = provider.getFunctionAddress("glMaxShaderCompilerThreadsARB");
        glPointParameterfARB = provider.getFunctionAddress("glPointParameterfARB");
        glPointParameterfvARB = provider.getFunctionAddress("glPointParameterfvARB");
        glGetGraphicsResetStatusARB = provider.getFunctionAddress("glGetGraphicsResetStatusARB");
        glGetnMapdvARB = provider.getFunctionAddress("glGetnMapdvARB");
        glGetnMapfvARB = provider.getFunctionAddress("glGetnMapfvARB");
        glGetnMapivARB = provider.getFunctionAddress("glGetnMapivARB");
        glGetnPixelMapfvARB = provider.getFunctionAddress("glGetnPixelMapfvARB");
        glGetnPixelMapuivARB = provider.getFunctionAddress("glGetnPixelMapuivARB");
        glGetnPixelMapusvARB = provider.getFunctionAddress("glGetnPixelMapusvARB");
        glGetnPolygonStippleARB = provider.getFunctionAddress("glGetnPolygonStippleARB");
        glGetnTexImageARB = provider.getFunctionAddress("glGetnTexImageARB");
        glReadnPixelsARB = provider.getFunctionAddress("glReadnPixelsARB");
        glGetnColorTableARB = provider.getFunctionAddress("glGetnColorTableARB");
        glGetnConvolutionFilterARB = provider.getFunctionAddress("glGetnConvolutionFilterARB");
        glGetnSeparableFilterARB = provider.getFunctionAddress("glGetnSeparableFilterARB");
        glGetnHistogramARB = provider.getFunctionAddress("glGetnHistogramARB");
        glGetnMinmaxARB = provider.getFunctionAddress("glGetnMinmaxARB");
        glGetnCompressedTexImageARB = provider.getFunctionAddress("glGetnCompressedTexImageARB");
        glGetnUniformfvARB = provider.getFunctionAddress("glGetnUniformfvARB");
        glGetnUniformivARB = provider.getFunctionAddress("glGetnUniformivARB");
        glGetnUniformuivARB = provider.getFunctionAddress("glGetnUniformuivARB");
        glGetnUniformdvARB = provider.getFunctionAddress("glGetnUniformdvARB");
        glFramebufferSampleLocationsfvARB = provider.getFunctionAddress("glFramebufferSampleLocationsfvARB");
        glNamedFramebufferSampleLocationsfvARB = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvARB");
        glEvaluateDepthValuesARB = provider.getFunctionAddress("glEvaluateDepthValuesARB");
        glMinSampleShadingARB = provider.getFunctionAddress("glMinSampleShadingARB");
        glDeleteObjectARB = provider.getFunctionAddress("glDeleteObjectARB");
        glGetHandleARB = provider.getFunctionAddress("glGetHandleARB");
        glDetachObjectARB = provider.getFunctionAddress("glDetachObjectARB");
        glCreateShaderObjectARB = provider.getFunctionAddress("glCreateShaderObjectARB");
        glShaderSourceARB = provider.getFunctionAddress("glShaderSourceARB");
        glCompileShaderARB = provider.getFunctionAddress("glCompileShaderARB");
        glCreateProgramObjectARB = provider.getFunctionAddress("glCreateProgramObjectARB");
        glAttachObjectARB = provider.getFunctionAddress("glAttachObjectARB");
        glLinkProgramARB = provider.getFunctionAddress("glLinkProgramARB");
        glUseProgramObjectARB = provider.getFunctionAddress("glUseProgramObjectARB");
        glValidateProgramARB = provider.getFunctionAddress("glValidateProgramARB");
        glUniform1fARB = provider.getFunctionAddress("glUniform1fARB");
        glUniform2fARB = provider.getFunctionAddress("glUniform2fARB");
        glUniform3fARB = provider.getFunctionAddress("glUniform3fARB");
        glUniform4fARB = provider.getFunctionAddress("glUniform4fARB");
        glUniform1iARB = provider.getFunctionAddress("glUniform1iARB");
        glUniform2iARB = provider.getFunctionAddress("glUniform2iARB");
        glUniform3iARB = provider.getFunctionAddress("glUniform3iARB");
        glUniform4iARB = provider.getFunctionAddress("glUniform4iARB");
        glUniform1fvARB = provider.getFunctionAddress("glUniform1fvARB");
        glUniform2fvARB = provider.getFunctionAddress("glUniform2fvARB");
        glUniform3fvARB = provider.getFunctionAddress("glUniform3fvARB");
        glUniform4fvARB = provider.getFunctionAddress("glUniform4fvARB");
        glUniform1ivARB = provider.getFunctionAddress("glUniform1ivARB");
        glUniform2ivARB = provider.getFunctionAddress("glUniform2ivARB");
        glUniform3ivARB = provider.getFunctionAddress("glUniform3ivARB");
        glUniform4ivARB = provider.getFunctionAddress("glUniform4ivARB");
        glUniformMatrix2fvARB = provider.getFunctionAddress("glUniformMatrix2fvARB");
        glUniformMatrix3fvARB = provider.getFunctionAddress("glUniformMatrix3fvARB");
        glUniformMatrix4fvARB = provider.getFunctionAddress("glUniformMatrix4fvARB");
        glGetObjectParameterfvARB = provider.getFunctionAddress("glGetObjectParameterfvARB");
        glGetObjectParameterivARB = provider.getFunctionAddress("glGetObjectParameterivARB");
        glGetInfoLogARB = provider.getFunctionAddress("glGetInfoLogARB");
        glGetAttachedObjectsARB = provider.getFunctionAddress("glGetAttachedObjectsARB");
        glGetUniformLocationARB = provider.getFunctionAddress("glGetUniformLocationARB");
        glGetActiveUniformARB = provider.getFunctionAddress("glGetActiveUniformARB");
        glGetUniformfvARB = provider.getFunctionAddress("glGetUniformfvARB");
        glGetUniformivARB = provider.getFunctionAddress("glGetUniformivARB");
        glGetShaderSourceARB = provider.getFunctionAddress("glGetShaderSourceARB");
        glNamedStringARB = provider.getFunctionAddress("glNamedStringARB");
        glDeleteNamedStringARB = provider.getFunctionAddress("glDeleteNamedStringARB");
        glCompileShaderIncludeARB = provider.getFunctionAddress("glCompileShaderIncludeARB");
        glIsNamedStringARB = provider.getFunctionAddress("glIsNamedStringARB");
        glGetNamedStringARB = provider.getFunctionAddress("glGetNamedStringARB");
        glGetNamedStringivARB = provider.getFunctionAddress("glGetNamedStringivARB");
        glBufferPageCommitmentARB = provider.getFunctionAddress("glBufferPageCommitmentARB");
        glNamedBufferPageCommitmentEXT = provider.getFunctionAddress("glNamedBufferPageCommitmentEXT");
        glNamedBufferPageCommitmentARB = provider.getFunctionAddress("glNamedBufferPageCommitmentARB");
        glTexPageCommitmentARB = provider.getFunctionAddress("glTexPageCommitmentARB");
        glTexturePageCommitmentEXT = provider.getFunctionAddress("glTexturePageCommitmentEXT");
        glTexBufferARB = provider.getFunctionAddress("glTexBufferARB");
        glTextureBufferRangeEXT = provider.getFunctionAddress("glTextureBufferRangeEXT");
        glCompressedTexImage3DARB = provider.getFunctionAddress("glCompressedTexImage3DARB");
        glCompressedTexImage2DARB = provider.getFunctionAddress("glCompressedTexImage2DARB");
        glCompressedTexImage1DARB = provider.getFunctionAddress("glCompressedTexImage1DARB");
        glCompressedTexSubImage3DARB = provider.getFunctionAddress("glCompressedTexSubImage3DARB");
        glCompressedTexSubImage2DARB = provider.getFunctionAddress("glCompressedTexSubImage2DARB");
        glCompressedTexSubImage1DARB = provider.getFunctionAddress("glCompressedTexSubImage1DARB");
        glGetCompressedTexImageARB = provider.getFunctionAddress("glGetCompressedTexImageARB");
        glTextureStorage1DEXT = provider.getFunctionAddress("glTextureStorage1DEXT");
        glTextureStorage2DEXT = provider.getFunctionAddress("glTextureStorage2DEXT");
        glTextureStorage3DEXT = provider.getFunctionAddress("glTextureStorage3DEXT");
        glTextureStorage2DMultisampleEXT = provider.getFunctionAddress("glTextureStorage2DMultisampleEXT");
        glTextureStorage3DMultisampleEXT = provider.getFunctionAddress("glTextureStorage3DMultisampleEXT");
        glLoadTransposeMatrixfARB = provider.getFunctionAddress("glLoadTransposeMatrixfARB");
        glLoadTransposeMatrixdARB = provider.getFunctionAddress("glLoadTransposeMatrixdARB");
        glMultTransposeMatrixfARB = provider.getFunctionAddress("glMultTransposeMatrixfARB");
        glMultTransposeMatrixdARB = provider.getFunctionAddress("glMultTransposeMatrixdARB");
        glVertexArrayVertexAttribLOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribLOffsetEXT");
        glVertexArrayBindVertexBufferEXT = provider.getFunctionAddress("glVertexArrayBindVertexBufferEXT");
        glVertexArrayVertexAttribFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribFormatEXT");
        glVertexArrayVertexAttribIFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribIFormatEXT");
        glVertexArrayVertexAttribLFormatEXT = provider.getFunctionAddress("glVertexArrayVertexAttribLFormatEXT");
        glVertexArrayVertexAttribBindingEXT = provider.getFunctionAddress("glVertexArrayVertexAttribBindingEXT");
        glVertexArrayVertexBindingDivisorEXT = provider.getFunctionAddress("glVertexArrayVertexBindingDivisorEXT");
        glWeightfvARB = provider.getFunctionAddress("glWeightfvARB");
        glWeightbvARB = provider.getFunctionAddress("glWeightbvARB");
        glWeightubvARB = provider.getFunctionAddress("glWeightubvARB");
        glWeightsvARB = provider.getFunctionAddress("glWeightsvARB");
        glWeightusvARB = provider.getFunctionAddress("glWeightusvARB");
        glWeightivARB = provider.getFunctionAddress("glWeightivARB");
        glWeightuivARB = provider.getFunctionAddress("glWeightuivARB");
        glWeightdvARB = provider.getFunctionAddress("glWeightdvARB");
        glWeightPointerARB = provider.getFunctionAddress("glWeightPointerARB");
        glVertexBlendARB = provider.getFunctionAddress("glVertexBlendARB");
        glBindBufferARB = provider.getFunctionAddress("glBindBufferARB");
        glDeleteBuffersARB = provider.getFunctionAddress("glDeleteBuffersARB");
        glGenBuffersARB = provider.getFunctionAddress("glGenBuffersARB");
        glIsBufferARB = provider.getFunctionAddress("glIsBufferARB");
        glBufferDataARB = provider.getFunctionAddress("glBufferDataARB");
        glBufferSubDataARB = provider.getFunctionAddress("glBufferSubDataARB");
        glGetBufferSubDataARB = provider.getFunctionAddress("glGetBufferSubDataARB");
        glMapBufferARB = provider.getFunctionAddress("glMapBufferARB");
        glUnmapBufferARB = provider.getFunctionAddress("glUnmapBufferARB");
        glGetBufferParameterivARB = provider.getFunctionAddress("glGetBufferParameterivARB");
        glGetBufferPointervARB = provider.getFunctionAddress("glGetBufferPointervARB");
        glProgramStringARB = provider.getFunctionAddress("glProgramStringARB");
        glBindProgramARB = provider.getFunctionAddress("glBindProgramARB");
        glDeleteProgramsARB = provider.getFunctionAddress("glDeleteProgramsARB");
        glGenProgramsARB = provider.getFunctionAddress("glGenProgramsARB");
        glProgramEnvParameter4dARB = provider.getFunctionAddress("glProgramEnvParameter4dARB");
        glProgramEnvParameter4dvARB = provider.getFunctionAddress("glProgramEnvParameter4dvARB");
        glProgramEnvParameter4fARB = provider.getFunctionAddress("glProgramEnvParameter4fARB");
        glProgramEnvParameter4fvARB = provider.getFunctionAddress("glProgramEnvParameter4fvARB");
        glProgramLocalParameter4dARB = provider.getFunctionAddress("glProgramLocalParameter4dARB");
        glProgramLocalParameter4dvARB = provider.getFunctionAddress("glProgramLocalParameter4dvARB");
        glProgramLocalParameter4fARB = provider.getFunctionAddress("glProgramLocalParameter4fARB");
        glProgramLocalParameter4fvARB = provider.getFunctionAddress("glProgramLocalParameter4fvARB");
        glGetProgramEnvParameterfvARB = provider.getFunctionAddress("glGetProgramEnvParameterfvARB");
        glGetProgramEnvParameterdvARB = provider.getFunctionAddress("glGetProgramEnvParameterdvARB");
        glGetProgramLocalParameterfvARB = provider.getFunctionAddress("glGetProgramLocalParameterfvARB");
        glGetProgramLocalParameterdvARB = provider.getFunctionAddress("glGetProgramLocalParameterdvARB");
        glGetProgramivARB = provider.getFunctionAddress("glGetProgramivARB");
        glGetProgramStringARB = provider.getFunctionAddress("glGetProgramStringARB");
        glIsProgramARB = provider.getFunctionAddress("glIsProgramARB");
        glVertexAttrib1fARB = provider.getFunctionAddress("glVertexAttrib1fARB");
        glVertexAttrib1sARB = provider.getFunctionAddress("glVertexAttrib1sARB");
        glVertexAttrib1dARB = provider.getFunctionAddress("glVertexAttrib1dARB");
        glVertexAttrib2fARB = provider.getFunctionAddress("glVertexAttrib2fARB");
        glVertexAttrib2sARB = provider.getFunctionAddress("glVertexAttrib2sARB");
        glVertexAttrib2dARB = provider.getFunctionAddress("glVertexAttrib2dARB");
        glVertexAttrib3fARB = provider.getFunctionAddress("glVertexAttrib3fARB");
        glVertexAttrib3sARB = provider.getFunctionAddress("glVertexAttrib3sARB");
        glVertexAttrib3dARB = provider.getFunctionAddress("glVertexAttrib3dARB");
        glVertexAttrib4fARB = provider.getFunctionAddress("glVertexAttrib4fARB");
        glVertexAttrib4sARB = provider.getFunctionAddress("glVertexAttrib4sARB");
        glVertexAttrib4dARB = provider.getFunctionAddress("glVertexAttrib4dARB");
        glVertexAttrib4NubARB = provider.getFunctionAddress("glVertexAttrib4NubARB");
        glVertexAttrib1fvARB = provider.getFunctionAddress("glVertexAttrib1fvARB");
        glVertexAttrib1svARB = provider.getFunctionAddress("glVertexAttrib1svARB");
        glVertexAttrib1dvARB = provider.getFunctionAddress("glVertexAttrib1dvARB");
        glVertexAttrib2fvARB = provider.getFunctionAddress("glVertexAttrib2fvARB");
        glVertexAttrib2svARB = provider.getFunctionAddress("glVertexAttrib2svARB");
        glVertexAttrib2dvARB = provider.getFunctionAddress("glVertexAttrib2dvARB");
        glVertexAttrib3fvARB = provider.getFunctionAddress("glVertexAttrib3fvARB");
        glVertexAttrib3svARB = provider.getFunctionAddress("glVertexAttrib3svARB");
        glVertexAttrib3dvARB = provider.getFunctionAddress("glVertexAttrib3dvARB");
        glVertexAttrib4fvARB = provider.getFunctionAddress("glVertexAttrib4fvARB");
        glVertexAttrib4svARB = provider.getFunctionAddress("glVertexAttrib4svARB");
        glVertexAttrib4dvARB = provider.getFunctionAddress("glVertexAttrib4dvARB");
        glVertexAttrib4ivARB = provider.getFunctionAddress("glVertexAttrib4ivARB");
        glVertexAttrib4bvARB = provider.getFunctionAddress("glVertexAttrib4bvARB");
        glVertexAttrib4ubvARB = provider.getFunctionAddress("glVertexAttrib4ubvARB");
        glVertexAttrib4usvARB = provider.getFunctionAddress("glVertexAttrib4usvARB");
        glVertexAttrib4uivARB = provider.getFunctionAddress("glVertexAttrib4uivARB");
        glVertexAttrib4NbvARB = provider.getFunctionAddress("glVertexAttrib4NbvARB");
        glVertexAttrib4NsvARB = provider.getFunctionAddress("glVertexAttrib4NsvARB");
        glVertexAttrib4NivARB = provider.getFunctionAddress("glVertexAttrib4NivARB");
        glVertexAttrib4NubvARB = provider.getFunctionAddress("glVertexAttrib4NubvARB");
        glVertexAttrib4NusvARB = provider.getFunctionAddress("glVertexAttrib4NusvARB");
        glVertexAttrib4NuivARB = provider.getFunctionAddress("glVertexAttrib4NuivARB");
        glVertexAttribPointerARB = provider.getFunctionAddress("glVertexAttribPointerARB");
        glEnableVertexAttribArrayARB = provider.getFunctionAddress("glEnableVertexAttribArrayARB");
        glDisableVertexAttribArrayARB = provider.getFunctionAddress("glDisableVertexAttribArrayARB");
        glBindAttribLocationARB = provider.getFunctionAddress("glBindAttribLocationARB");
        glGetActiveAttribARB = provider.getFunctionAddress("glGetActiveAttribARB");
        glGetAttribLocationARB = provider.getFunctionAddress("glGetAttribLocationARB");
        glGetVertexAttribivARB = provider.getFunctionAddress("glGetVertexAttribivARB");
        glGetVertexAttribfvARB = provider.getFunctionAddress("glGetVertexAttribfvARB");
        glGetVertexAttribdvARB = provider.getFunctionAddress("glGetVertexAttribdvARB");
        glGetVertexAttribPointervARB = provider.getFunctionAddress("glGetVertexAttribPointervARB");
        glWindowPos2iARB = provider.getFunctionAddress("glWindowPos2iARB");
        glWindowPos2sARB = provider.getFunctionAddress("glWindowPos2sARB");
        glWindowPos2fARB = provider.getFunctionAddress("glWindowPos2fARB");
        glWindowPos2dARB = provider.getFunctionAddress("glWindowPos2dARB");
        glWindowPos2ivARB = provider.getFunctionAddress("glWindowPos2ivARB");
        glWindowPos2svARB = provider.getFunctionAddress("glWindowPos2svARB");
        glWindowPos2fvARB = provider.getFunctionAddress("glWindowPos2fvARB");
        glWindowPos2dvARB = provider.getFunctionAddress("glWindowPos2dvARB");
        glWindowPos3iARB = provider.getFunctionAddress("glWindowPos3iARB");
        glWindowPos3sARB = provider.getFunctionAddress("glWindowPos3sARB");
        glWindowPos3fARB = provider.getFunctionAddress("glWindowPos3fARB");
        glWindowPos3dARB = provider.getFunctionAddress("glWindowPos3dARB");
        glWindowPos3ivARB = provider.getFunctionAddress("glWindowPos3ivARB");
        glWindowPos3svARB = provider.getFunctionAddress("glWindowPos3svARB");
        glWindowPos3fvARB = provider.getFunctionAddress("glWindowPos3fvARB");
        glWindowPos3dvARB = provider.getFunctionAddress("glWindowPos3dvARB");
        glUniformBufferEXT = provider.getFunctionAddress("glUniformBufferEXT");
        glGetUniformBufferSizeEXT = provider.getFunctionAddress("glGetUniformBufferSizeEXT");
        glGetUniformOffsetEXT = provider.getFunctionAddress("glGetUniformOffsetEXT");
        glBlendColorEXT = provider.getFunctionAddress("glBlendColorEXT");
        glBlendEquationSeparateEXT = provider.getFunctionAddress("glBlendEquationSeparateEXT");
        glBlendFuncSeparateEXT = provider.getFunctionAddress("glBlendFuncSeparateEXT");
        glBlendEquationEXT = provider.getFunctionAddress("glBlendEquationEXT");
        glLockArraysEXT = provider.getFunctionAddress("glLockArraysEXT");
        glUnlockArraysEXT = provider.getFunctionAddress("glUnlockArraysEXT");
        glLabelObjectEXT = provider.getFunctionAddress("glLabelObjectEXT");
        glGetObjectLabelEXT = provider.getFunctionAddress("glGetObjectLabelEXT");
        glInsertEventMarkerEXT = provider.getFunctionAddress("glInsertEventMarkerEXT");
        glPushGroupMarkerEXT = provider.getFunctionAddress("glPushGroupMarkerEXT");
        glPopGroupMarkerEXT = provider.getFunctionAddress("glPopGroupMarkerEXT");
        glDepthBoundsEXT = provider.getFunctionAddress("glDepthBoundsEXT");
        glClientAttribDefaultEXT = provider.getFunctionAddress("glClientAttribDefaultEXT");
        glPushClientAttribDefaultEXT = provider.getFunctionAddress("glPushClientAttribDefaultEXT");
        glMatrixLoadfEXT = provider.getFunctionAddress("glMatrixLoadfEXT");
        glMatrixLoaddEXT = provider.getFunctionAddress("glMatrixLoaddEXT");
        glMatrixMultfEXT = provider.getFunctionAddress("glMatrixMultfEXT");
        glMatrixMultdEXT = provider.getFunctionAddress("glMatrixMultdEXT");
        glMatrixLoadIdentityEXT = provider.getFunctionAddress("glMatrixLoadIdentityEXT");
        glMatrixRotatefEXT = provider.getFunctionAddress("glMatrixRotatefEXT");
        glMatrixRotatedEXT = provider.getFunctionAddress("glMatrixRotatedEXT");
        glMatrixScalefEXT = provider.getFunctionAddress("glMatrixScalefEXT");
        glMatrixScaledEXT = provider.getFunctionAddress("glMatrixScaledEXT");
        glMatrixTranslatefEXT = provider.getFunctionAddress("glMatrixTranslatefEXT");
        glMatrixTranslatedEXT = provider.getFunctionAddress("glMatrixTranslatedEXT");
        glMatrixOrthoEXT = provider.getFunctionAddress("glMatrixOrthoEXT");
        glMatrixFrustumEXT = provider.getFunctionAddress("glMatrixFrustumEXT");
        glMatrixPushEXT = provider.getFunctionAddress("glMatrixPushEXT");
        glMatrixPopEXT = provider.getFunctionAddress("glMatrixPopEXT");
        glTextureParameteriEXT = provider.getFunctionAddress("glTextureParameteriEXT");
        glTextureParameterivEXT = provider.getFunctionAddress("glTextureParameterivEXT");
        glTextureParameterfEXT = provider.getFunctionAddress("glTextureParameterfEXT");
        glTextureParameterfvEXT = provider.getFunctionAddress("glTextureParameterfvEXT");
        glTextureImage1DEXT = provider.getFunctionAddress("glTextureImage1DEXT");
        glTextureImage2DEXT = provider.getFunctionAddress("glTextureImage2DEXT");
        glTextureSubImage1DEXT = provider.getFunctionAddress("glTextureSubImage1DEXT");
        glTextureSubImage2DEXT = provider.getFunctionAddress("glTextureSubImage2DEXT");
        glCopyTextureImage1DEXT = provider.getFunctionAddress("glCopyTextureImage1DEXT");
        glCopyTextureImage2DEXT = provider.getFunctionAddress("glCopyTextureImage2DEXT");
        glCopyTextureSubImage1DEXT = provider.getFunctionAddress("glCopyTextureSubImage1DEXT");
        glCopyTextureSubImage2DEXT = provider.getFunctionAddress("glCopyTextureSubImage2DEXT");
        glGetTextureImageEXT = provider.getFunctionAddress("glGetTextureImageEXT");
        glGetTextureParameterfvEXT = provider.getFunctionAddress("glGetTextureParameterfvEXT");
        glGetTextureParameterivEXT = provider.getFunctionAddress("glGetTextureParameterivEXT");
        glGetTextureLevelParameterfvEXT = provider.getFunctionAddress("glGetTextureLevelParameterfvEXT");
        glGetTextureLevelParameterivEXT = provider.getFunctionAddress("glGetTextureLevelParameterivEXT");
        glTextureImage3DEXT = provider.getFunctionAddress("glTextureImage3DEXT");
        glTextureSubImage3DEXT = provider.getFunctionAddress("glTextureSubImage3DEXT");
        glCopyTextureSubImage3DEXT = provider.getFunctionAddress("glCopyTextureSubImage3DEXT");
        glBindMultiTextureEXT = provider.getFunctionAddress("glBindMultiTextureEXT");
        glMultiTexCoordPointerEXT = provider.getFunctionAddress("glMultiTexCoordPointerEXT");
        glMultiTexEnvfEXT = provider.getFunctionAddress("glMultiTexEnvfEXT");
        glMultiTexEnvfvEXT = provider.getFunctionAddress("glMultiTexEnvfvEXT");
        glMultiTexEnviEXT = provider.getFunctionAddress("glMultiTexEnviEXT");
        glMultiTexEnvivEXT = provider.getFunctionAddress("glMultiTexEnvivEXT");
        glMultiTexGendEXT = provider.getFunctionAddress("glMultiTexGendEXT");
        glMultiTexGendvEXT = provider.getFunctionAddress("glMultiTexGendvEXT");
        glMultiTexGenfEXT = provider.getFunctionAddress("glMultiTexGenfEXT");
        glMultiTexGenfvEXT = provider.getFunctionAddress("glMultiTexGenfvEXT");
        glMultiTexGeniEXT = provider.getFunctionAddress("glMultiTexGeniEXT");
        glMultiTexGenivEXT = provider.getFunctionAddress("glMultiTexGenivEXT");
        glGetMultiTexEnvfvEXT = provider.getFunctionAddress("glGetMultiTexEnvfvEXT");
        glGetMultiTexEnvivEXT = provider.getFunctionAddress("glGetMultiTexEnvivEXT");
        glGetMultiTexGendvEXT = provider.getFunctionAddress("glGetMultiTexGendvEXT");
        glGetMultiTexGenfvEXT = provider.getFunctionAddress("glGetMultiTexGenfvEXT");
        glGetMultiTexGenivEXT = provider.getFunctionAddress("glGetMultiTexGenivEXT");
        glMultiTexParameteriEXT = provider.getFunctionAddress("glMultiTexParameteriEXT");
        glMultiTexParameterivEXT = provider.getFunctionAddress("glMultiTexParameterivEXT");
        glMultiTexParameterfEXT = provider.getFunctionAddress("glMultiTexParameterfEXT");
        glMultiTexParameterfvEXT = provider.getFunctionAddress("glMultiTexParameterfvEXT");
        glMultiTexImage1DEXT = provider.getFunctionAddress("glMultiTexImage1DEXT");
        glMultiTexImage2DEXT = provider.getFunctionAddress("glMultiTexImage2DEXT");
        glMultiTexSubImage1DEXT = provider.getFunctionAddress("glMultiTexSubImage1DEXT");
        glMultiTexSubImage2DEXT = provider.getFunctionAddress("glMultiTexSubImage2DEXT");
        glCopyMultiTexImage1DEXT = provider.getFunctionAddress("glCopyMultiTexImage1DEXT");
        glCopyMultiTexImage2DEXT = provider.getFunctionAddress("glCopyMultiTexImage2DEXT");
        glCopyMultiTexSubImage1DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage1DEXT");
        glCopyMultiTexSubImage2DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage2DEXT");
        glGetMultiTexImageEXT = provider.getFunctionAddress("glGetMultiTexImageEXT");
        glGetMultiTexParameterfvEXT = provider.getFunctionAddress("glGetMultiTexParameterfvEXT");
        glGetMultiTexParameterivEXT = provider.getFunctionAddress("glGetMultiTexParameterivEXT");
        glGetMultiTexLevelParameterfvEXT = provider.getFunctionAddress("glGetMultiTexLevelParameterfvEXT");
        glGetMultiTexLevelParameterivEXT = provider.getFunctionAddress("glGetMultiTexLevelParameterivEXT");
        glMultiTexImage3DEXT = provider.getFunctionAddress("glMultiTexImage3DEXT");
        glMultiTexSubImage3DEXT = provider.getFunctionAddress("glMultiTexSubImage3DEXT");
        glCopyMultiTexSubImage3DEXT = provider.getFunctionAddress("glCopyMultiTexSubImage3DEXT");
        glEnableClientStateIndexedEXT = provider.getFunctionAddress("glEnableClientStateIndexedEXT");
        glDisableClientStateIndexedEXT = provider.getFunctionAddress("glDisableClientStateIndexedEXT");
        glEnableClientStateiEXT = provider.getFunctionAddress("glEnableClientStateiEXT");
        glDisableClientStateiEXT = provider.getFunctionAddress("glDisableClientStateiEXT");
        glGetFloatIndexedvEXT = provider.getFunctionAddress("glGetFloatIndexedvEXT");
        glGetDoubleIndexedvEXT = provider.getFunctionAddress("glGetDoubleIndexedvEXT");
        glGetPointerIndexedvEXT = provider.getFunctionAddress("glGetPointerIndexedvEXT");
        glGetFloati_vEXT = provider.getFunctionAddress("glGetFloati_vEXT");
        glGetDoublei_vEXT = provider.getFunctionAddress("glGetDoublei_vEXT");
        glGetPointeri_vEXT = provider.getFunctionAddress("glGetPointeri_vEXT");
        glNamedProgramStringEXT = provider.getFunctionAddress("glNamedProgramStringEXT");
        glNamedProgramLocalParameter4dEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4dEXT");
        glNamedProgramLocalParameter4dvEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4dvEXT");
        glNamedProgramLocalParameter4fEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4fEXT");
        glNamedProgramLocalParameter4fvEXT = provider.getFunctionAddress("glNamedProgramLocalParameter4fvEXT");
        glGetNamedProgramLocalParameterdvEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterdvEXT");
        glGetNamedProgramLocalParameterfvEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterfvEXT");
        glGetNamedProgramivEXT = provider.getFunctionAddress("glGetNamedProgramivEXT");
        glGetNamedProgramStringEXT = provider.getFunctionAddress("glGetNamedProgramStringEXT");
        glCompressedTextureImage3DEXT = provider.getFunctionAddress("glCompressedTextureImage3DEXT");
        glCompressedTextureImage2DEXT = provider.getFunctionAddress("glCompressedTextureImage2DEXT");
        glCompressedTextureImage1DEXT = provider.getFunctionAddress("glCompressedTextureImage1DEXT");
        glCompressedTextureSubImage3DEXT = provider.getFunctionAddress("glCompressedTextureSubImage3DEXT");
        glCompressedTextureSubImage2DEXT = provider.getFunctionAddress("glCompressedTextureSubImage2DEXT");
        glCompressedTextureSubImage1DEXT = provider.getFunctionAddress("glCompressedTextureSubImage1DEXT");
        glGetCompressedTextureImageEXT = provider.getFunctionAddress("glGetCompressedTextureImageEXT");
        glCompressedMultiTexImage3DEXT = provider.getFunctionAddress("glCompressedMultiTexImage3DEXT");
        glCompressedMultiTexImage2DEXT = provider.getFunctionAddress("glCompressedMultiTexImage2DEXT");
        glCompressedMultiTexImage1DEXT = provider.getFunctionAddress("glCompressedMultiTexImage1DEXT");
        glCompressedMultiTexSubImage3DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage3DEXT");
        glCompressedMultiTexSubImage2DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage2DEXT");
        glCompressedMultiTexSubImage1DEXT = provider.getFunctionAddress("glCompressedMultiTexSubImage1DEXT");
        glGetCompressedMultiTexImageEXT = provider.getFunctionAddress("glGetCompressedMultiTexImageEXT");
        glMatrixLoadTransposefEXT = provider.getFunctionAddress("glMatrixLoadTransposefEXT");
        glMatrixLoadTransposedEXT = provider.getFunctionAddress("glMatrixLoadTransposedEXT");
        glMatrixMultTransposefEXT = provider.getFunctionAddress("glMatrixMultTransposefEXT");
        glMatrixMultTransposedEXT = provider.getFunctionAddress("glMatrixMultTransposedEXT");
        glNamedBufferDataEXT = provider.getFunctionAddress("glNamedBufferDataEXT");
        glNamedBufferSubDataEXT = provider.getFunctionAddress("glNamedBufferSubDataEXT");
        glMapNamedBufferEXT = provider.getFunctionAddress("glMapNamedBufferEXT");
        glUnmapNamedBufferEXT = provider.getFunctionAddress("glUnmapNamedBufferEXT");
        glGetNamedBufferParameterivEXT = provider.getFunctionAddress("glGetNamedBufferParameterivEXT");
        glGetNamedBufferSubDataEXT = provider.getFunctionAddress("glGetNamedBufferSubDataEXT");
        glProgramUniform1fEXT = provider.getFunctionAddress("glProgramUniform1fEXT");
        glProgramUniform2fEXT = provider.getFunctionAddress("glProgramUniform2fEXT");
        glProgramUniform3fEXT = provider.getFunctionAddress("glProgramUniform3fEXT");
        glProgramUniform4fEXT = provider.getFunctionAddress("glProgramUniform4fEXT");
        glProgramUniform1iEXT = provider.getFunctionAddress("glProgramUniform1iEXT");
        glProgramUniform2iEXT = provider.getFunctionAddress("glProgramUniform2iEXT");
        glProgramUniform3iEXT = provider.getFunctionAddress("glProgramUniform3iEXT");
        glProgramUniform4iEXT = provider.getFunctionAddress("glProgramUniform4iEXT");
        glProgramUniform1fvEXT = provider.getFunctionAddress("glProgramUniform1fvEXT");
        glProgramUniform2fvEXT = provider.getFunctionAddress("glProgramUniform2fvEXT");
        glProgramUniform3fvEXT = provider.getFunctionAddress("glProgramUniform3fvEXT");
        glProgramUniform4fvEXT = provider.getFunctionAddress("glProgramUniform4fvEXT");
        glProgramUniform1ivEXT = provider.getFunctionAddress("glProgramUniform1ivEXT");
        glProgramUniform2ivEXT = provider.getFunctionAddress("glProgramUniform2ivEXT");
        glProgramUniform3ivEXT = provider.getFunctionAddress("glProgramUniform3ivEXT");
        glProgramUniform4ivEXT = provider.getFunctionAddress("glProgramUniform4ivEXT");
        glProgramUniformMatrix2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2fvEXT");
        glProgramUniformMatrix3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3fvEXT");
        glProgramUniformMatrix4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4fvEXT");
        glProgramUniformMatrix2x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3fvEXT");
        glProgramUniformMatrix3x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2fvEXT");
        glProgramUniformMatrix2x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4fvEXT");
        glProgramUniformMatrix4x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2fvEXT");
        glProgramUniformMatrix3x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4fvEXT");
        glProgramUniformMatrix4x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3fvEXT");
        glTextureBufferEXT = provider.getFunctionAddress("glTextureBufferEXT");
        glMultiTexBufferEXT = provider.getFunctionAddress("glMultiTexBufferEXT");
        glTextureParameterIivEXT = provider.getFunctionAddress("glTextureParameterIivEXT");
        glTextureParameterIuivEXT = provider.getFunctionAddress("glTextureParameterIuivEXT");
        glGetTextureParameterIivEXT = provider.getFunctionAddress("glGetTextureParameterIivEXT");
        glGetTextureParameterIuivEXT = provider.getFunctionAddress("glGetTextureParameterIuivEXT");
        glMultiTexParameterIivEXT = provider.getFunctionAddress("glMultiTexParameterIivEXT");
        glMultiTexParameterIuivEXT = provider.getFunctionAddress("glMultiTexParameterIuivEXT");
        glGetMultiTexParameterIivEXT = provider.getFunctionAddress("glGetMultiTexParameterIivEXT");
        glGetMultiTexParameterIuivEXT = provider.getFunctionAddress("glGetMultiTexParameterIuivEXT");
        glProgramUniform1uiEXT = provider.getFunctionAddress("glProgramUniform1uiEXT");
        glProgramUniform2uiEXT = provider.getFunctionAddress("glProgramUniform2uiEXT");
        glProgramUniform3uiEXT = provider.getFunctionAddress("glProgramUniform3uiEXT");
        glProgramUniform4uiEXT = provider.getFunctionAddress("glProgramUniform4uiEXT");
        glProgramUniform1uivEXT = provider.getFunctionAddress("glProgramUniform1uivEXT");
        glProgramUniform2uivEXT = provider.getFunctionAddress("glProgramUniform2uivEXT");
        glProgramUniform3uivEXT = provider.getFunctionAddress("glProgramUniform3uivEXT");
        glProgramUniform4uivEXT = provider.getFunctionAddress("glProgramUniform4uivEXT");
        glNamedProgramLocalParameters4fvEXT = provider.getFunctionAddress("glNamedProgramLocalParameters4fvEXT");
        glNamedProgramLocalParameterI4iEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4iEXT");
        glNamedProgramLocalParameterI4ivEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4ivEXT");
        glNamedProgramLocalParametersI4ivEXT = provider.getFunctionAddress("glNamedProgramLocalParametersI4ivEXT");
        glNamedProgramLocalParameterI4uiEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4uiEXT");
        glNamedProgramLocalParameterI4uivEXT = provider.getFunctionAddress("glNamedProgramLocalParameterI4uivEXT");
        glNamedProgramLocalParametersI4uivEXT = provider.getFunctionAddress("glNamedProgramLocalParametersI4uivEXT");
        glGetNamedProgramLocalParameterIivEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterIivEXT");
        glGetNamedProgramLocalParameterIuivEXT = provider.getFunctionAddress("glGetNamedProgramLocalParameterIuivEXT");
        glNamedRenderbufferStorageEXT = provider.getFunctionAddress("glNamedRenderbufferStorageEXT");
        glGetNamedRenderbufferParameterivEXT = provider.getFunctionAddress("glGetNamedRenderbufferParameterivEXT");
        glNamedRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleEXT");
        glNamedRenderbufferStorageMultisampleCoverageEXT = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleCoverageEXT");
        glCheckNamedFramebufferStatusEXT = provider.getFunctionAddress("glCheckNamedFramebufferStatusEXT");
        glNamedFramebufferTexture1DEXT = provider.getFunctionAddress("glNamedFramebufferTexture1DEXT");
        glNamedFramebufferTexture2DEXT = provider.getFunctionAddress("glNamedFramebufferTexture2DEXT");
        glNamedFramebufferTexture3DEXT = provider.getFunctionAddress("glNamedFramebufferTexture3DEXT");
        glNamedFramebufferRenderbufferEXT = provider.getFunctionAddress("glNamedFramebufferRenderbufferEXT");
        glGetNamedFramebufferAttachmentParameterivEXT = provider.getFunctionAddress("glGetNamedFramebufferAttachmentParameterivEXT");
        glGenerateTextureMipmapEXT = provider.getFunctionAddress("glGenerateTextureMipmapEXT");
        glGenerateMultiTexMipmapEXT = provider.getFunctionAddress("glGenerateMultiTexMipmapEXT");
        glFramebufferDrawBufferEXT = provider.getFunctionAddress("glFramebufferDrawBufferEXT");
        glFramebufferDrawBuffersEXT = provider.getFunctionAddress("glFramebufferDrawBuffersEXT");
        glFramebufferReadBufferEXT = provider.getFunctionAddress("glFramebufferReadBufferEXT");
        glGetFramebufferParameterivEXT = provider.getFunctionAddress("glGetFramebufferParameterivEXT");
        glNamedCopyBufferSubDataEXT = provider.getFunctionAddress("glNamedCopyBufferSubDataEXT");
        glNamedFramebufferTextureEXT = provider.getFunctionAddress("glNamedFramebufferTextureEXT");
        glNamedFramebufferTextureLayerEXT = provider.getFunctionAddress("glNamedFramebufferTextureLayerEXT");
        glNamedFramebufferTextureFaceEXT = provider.getFunctionAddress("glNamedFramebufferTextureFaceEXT");
        glTextureRenderbufferEXT = provider.getFunctionAddress("glTextureRenderbufferEXT");
        glMultiTexRenderbufferEXT = provider.getFunctionAddress("glMultiTexRenderbufferEXT");
        glVertexArrayVertexOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexOffsetEXT");
        glVertexArrayColorOffsetEXT = provider.getFunctionAddress("glVertexArrayColorOffsetEXT");
        glVertexArrayEdgeFlagOffsetEXT = provider.getFunctionAddress("glVertexArrayEdgeFlagOffsetEXT");
        glVertexArrayIndexOffsetEXT = provider.getFunctionAddress("glVertexArrayIndexOffsetEXT");
        glVertexArrayNormalOffsetEXT = provider.getFunctionAddress("glVertexArrayNormalOffsetEXT");
        glVertexArrayTexCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayTexCoordOffsetEXT");
        glVertexArrayMultiTexCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayMultiTexCoordOffsetEXT");
        glVertexArrayFogCoordOffsetEXT = provider.getFunctionAddress("glVertexArrayFogCoordOffsetEXT");
        glVertexArraySecondaryColorOffsetEXT = provider.getFunctionAddress("glVertexArraySecondaryColorOffsetEXT");
        glVertexArrayVertexAttribOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribOffsetEXT");
        glVertexArrayVertexAttribIOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribIOffsetEXT");
        glEnableVertexArrayEXT = provider.getFunctionAddress("glEnableVertexArrayEXT");
        glDisableVertexArrayEXT = provider.getFunctionAddress("glDisableVertexArrayEXT");
        glEnableVertexArrayAttribEXT = provider.getFunctionAddress("glEnableVertexArrayAttribEXT");
        glDisableVertexArrayAttribEXT = provider.getFunctionAddress("glDisableVertexArrayAttribEXT");
        glGetVertexArrayIntegervEXT = provider.getFunctionAddress("glGetVertexArrayIntegervEXT");
        glGetVertexArrayPointervEXT = provider.getFunctionAddress("glGetVertexArrayPointervEXT");
        glGetVertexArrayIntegeri_vEXT = provider.getFunctionAddress("glGetVertexArrayIntegeri_vEXT");
        glGetVertexArrayPointeri_vEXT = provider.getFunctionAddress("glGetVertexArrayPointeri_vEXT");
        glMapNamedBufferRangeEXT = provider.getFunctionAddress("glMapNamedBufferRangeEXT");
        glFlushMappedNamedBufferRangeEXT = provider.getFunctionAddress("glFlushMappedNamedBufferRangeEXT");
        glColorMaskIndexedEXT = provider.getFunctionAddress("glColorMaskIndexedEXT");
        glGetBooleanIndexedvEXT = provider.getFunctionAddress("glGetBooleanIndexedvEXT");
        glGetIntegerIndexedvEXT = provider.getFunctionAddress("glGetIntegerIndexedvEXT");
        glEnableIndexedEXT = provider.getFunctionAddress("glEnableIndexedEXT");
        glDisableIndexedEXT = provider.getFunctionAddress("glDisableIndexedEXT");
        glIsEnabledIndexedEXT = provider.getFunctionAddress("glIsEnabledIndexedEXT");
        glDrawArraysInstancedEXT = provider.getFunctionAddress("glDrawArraysInstancedEXT");
        glDrawElementsInstancedEXT = provider.getFunctionAddress("glDrawElementsInstancedEXT");
        glEGLImageTargetTexStorageEXT = provider.getFunctionAddress("glEGLImageTargetTexStorageEXT");
        glEGLImageTargetTextureStorageEXT = provider.getFunctionAddress("glEGLImageTargetTextureStorageEXT");
        glBufferStorageExternalEXT = provider.getFunctionAddress("glBufferStorageExternalEXT");
        glNamedBufferStorageExternalEXT = provider.getFunctionAddress("glNamedBufferStorageExternalEXT");
        glBlitFramebufferEXT = provider.getFunctionAddress("glBlitFramebufferEXT");
        glRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glRenderbufferStorageMultisampleEXT");
        glIsRenderbufferEXT = provider.getFunctionAddress("glIsRenderbufferEXT");
        glBindRenderbufferEXT = provider.getFunctionAddress("glBindRenderbufferEXT");
        glDeleteRenderbuffersEXT = provider.getFunctionAddress("glDeleteRenderbuffersEXT");
        glGenRenderbuffersEXT = provider.getFunctionAddress("glGenRenderbuffersEXT");
        glRenderbufferStorageEXT = provider.getFunctionAddress("glRenderbufferStorageEXT");
        glGetRenderbufferParameterivEXT = provider.getFunctionAddress("glGetRenderbufferParameterivEXT");
        glIsFramebufferEXT = provider.getFunctionAddress("glIsFramebufferEXT");
        glBindFramebufferEXT = provider.getFunctionAddress("glBindFramebufferEXT");
        glDeleteFramebuffersEXT = provider.getFunctionAddress("glDeleteFramebuffersEXT");
        glGenFramebuffersEXT = provider.getFunctionAddress("glGenFramebuffersEXT");
        glCheckFramebufferStatusEXT = provider.getFunctionAddress("glCheckFramebufferStatusEXT");
        glFramebufferTexture1DEXT = provider.getFunctionAddress("glFramebufferTexture1DEXT");
        glFramebufferTexture2DEXT = provider.getFunctionAddress("glFramebufferTexture2DEXT");
        glFramebufferTexture3DEXT = provider.getFunctionAddress("glFramebufferTexture3DEXT");
        glFramebufferRenderbufferEXT = provider.getFunctionAddress("glFramebufferRenderbufferEXT");
        glGetFramebufferAttachmentParameterivEXT = provider.getFunctionAddress("glGetFramebufferAttachmentParameterivEXT");
        glGenerateMipmapEXT = provider.getFunctionAddress("glGenerateMipmapEXT");
        glProgramParameteriEXT = provider.getFunctionAddress("glProgramParameteriEXT");
        glFramebufferTextureEXT = provider.getFunctionAddress("glFramebufferTextureEXT");
        glFramebufferTextureFaceEXT = provider.getFunctionAddress("glFramebufferTextureFaceEXT");
        glProgramEnvParameters4fvEXT = provider.getFunctionAddress("glProgramEnvParameters4fvEXT");
        glProgramLocalParameters4fvEXT = provider.getFunctionAddress("glProgramLocalParameters4fvEXT");
        glVertexAttribI1iEXT = provider.getFunctionAddress("glVertexAttribI1iEXT");
        glVertexAttribI2iEXT = provider.getFunctionAddress("glVertexAttribI2iEXT");
        glVertexAttribI3iEXT = provider.getFunctionAddress("glVertexAttribI3iEXT");
        glVertexAttribI4iEXT = provider.getFunctionAddress("glVertexAttribI4iEXT");
        glVertexAttribI1uiEXT = provider.getFunctionAddress("glVertexAttribI1uiEXT");
        glVertexAttribI2uiEXT = provider.getFunctionAddress("glVertexAttribI2uiEXT");
        glVertexAttribI3uiEXT = provider.getFunctionAddress("glVertexAttribI3uiEXT");
        glVertexAttribI4uiEXT = provider.getFunctionAddress("glVertexAttribI4uiEXT");
        glVertexAttribI1ivEXT = provider.getFunctionAddress("glVertexAttribI1ivEXT");
        glVertexAttribI2ivEXT = provider.getFunctionAddress("glVertexAttribI2ivEXT");
        glVertexAttribI3ivEXT = provider.getFunctionAddress("glVertexAttribI3ivEXT");
        glVertexAttribI4ivEXT = provider.getFunctionAddress("glVertexAttribI4ivEXT");
        glVertexAttribI1uivEXT = provider.getFunctionAddress("glVertexAttribI1uivEXT");
        glVertexAttribI2uivEXT = provider.getFunctionAddress("glVertexAttribI2uivEXT");
        glVertexAttribI3uivEXT = provider.getFunctionAddress("glVertexAttribI3uivEXT");
        glVertexAttribI4uivEXT = provider.getFunctionAddress("glVertexAttribI4uivEXT");
        glVertexAttribI4bvEXT = provider.getFunctionAddress("glVertexAttribI4bvEXT");
        glVertexAttribI4svEXT = provider.getFunctionAddress("glVertexAttribI4svEXT");
        glVertexAttribI4ubvEXT = provider.getFunctionAddress("glVertexAttribI4ubvEXT");
        glVertexAttribI4usvEXT = provider.getFunctionAddress("glVertexAttribI4usvEXT");
        glVertexAttribIPointerEXT = provider.getFunctionAddress("glVertexAttribIPointerEXT");
        glGetVertexAttribIivEXT = provider.getFunctionAddress("glGetVertexAttribIivEXT");
        glGetVertexAttribIuivEXT = provider.getFunctionAddress("glGetVertexAttribIuivEXT");
        glGetUniformuivEXT = provider.getFunctionAddress("glGetUniformuivEXT");
        glBindFragDataLocationEXT = provider.getFunctionAddress("glBindFragDataLocationEXT");
        glGetFragDataLocationEXT = provider.getFunctionAddress("glGetFragDataLocationEXT");
        glUniform1uiEXT = provider.getFunctionAddress("glUniform1uiEXT");
        glUniform2uiEXT = provider.getFunctionAddress("glUniform2uiEXT");
        glUniform3uiEXT = provider.getFunctionAddress("glUniform3uiEXT");
        glUniform4uiEXT = provider.getFunctionAddress("glUniform4uiEXT");
        glUniform1uivEXT = provider.getFunctionAddress("glUniform1uivEXT");
        glUniform2uivEXT = provider.getFunctionAddress("glUniform2uivEXT");
        glUniform3uivEXT = provider.getFunctionAddress("glUniform3uivEXT");
        glUniform4uivEXT = provider.getFunctionAddress("glUniform4uivEXT");
        glGetUnsignedBytevEXT = provider.getFunctionAddress("glGetUnsignedBytevEXT");
        glGetUnsignedBytei_vEXT = provider.getFunctionAddress("glGetUnsignedBytei_vEXT");
        glDeleteMemoryObjectsEXT = provider.getFunctionAddress("glDeleteMemoryObjectsEXT");
        glIsMemoryObjectEXT = provider.getFunctionAddress("glIsMemoryObjectEXT");
        glCreateMemoryObjectsEXT = provider.getFunctionAddress("glCreateMemoryObjectsEXT");
        glMemoryObjectParameterivEXT = provider.getFunctionAddress("glMemoryObjectParameterivEXT");
        glGetMemoryObjectParameterivEXT = provider.getFunctionAddress("glGetMemoryObjectParameterivEXT");
        glTexStorageMem2DEXT = provider.getFunctionAddress("glTexStorageMem2DEXT");
        glTexStorageMem2DMultisampleEXT = provider.getFunctionAddress("glTexStorageMem2DMultisampleEXT");
        glTexStorageMem3DEXT = provider.getFunctionAddress("glTexStorageMem3DEXT");
        glTexStorageMem3DMultisampleEXT = provider.getFunctionAddress("glTexStorageMem3DMultisampleEXT");
        glBufferStorageMemEXT = provider.getFunctionAddress("glBufferStorageMemEXT");
        glTextureStorageMem2DEXT = provider.getFunctionAddress("glTextureStorageMem2DEXT");
        glTextureStorageMem2DMultisampleEXT = provider.getFunctionAddress("glTextureStorageMem2DMultisampleEXT");
        glTextureStorageMem3DEXT = provider.getFunctionAddress("glTextureStorageMem3DEXT");
        glTextureStorageMem3DMultisampleEXT = provider.getFunctionAddress("glTextureStorageMem3DMultisampleEXT");
        glNamedBufferStorageMemEXT = provider.getFunctionAddress("glNamedBufferStorageMemEXT");
        glTexStorageMem1DEXT = provider.getFunctionAddress("glTexStorageMem1DEXT");
        glTextureStorageMem1DEXT = provider.getFunctionAddress("glTextureStorageMem1DEXT");
        glImportMemoryFdEXT = provider.getFunctionAddress("glImportMemoryFdEXT");
        glImportMemoryWin32HandleEXT = provider.getFunctionAddress("glImportMemoryWin32HandleEXT");
        glImportMemoryWin32NameEXT = provider.getFunctionAddress("glImportMemoryWin32NameEXT");
        glPointParameterfEXT = provider.getFunctionAddress("glPointParameterfEXT");
        glPointParameterfvEXT = provider.getFunctionAddress("glPointParameterfvEXT");
        glPolygonOffsetClampEXT = provider.getFunctionAddress("glPolygonOffsetClampEXT");
        glProvokingVertexEXT = provider.getFunctionAddress("glProvokingVertexEXT");
        glRasterSamplesEXT = provider.getFunctionAddress("glRasterSamplesEXT");
        glSecondaryColor3bEXT = provider.getFunctionAddress("glSecondaryColor3bEXT");
        glSecondaryColor3sEXT = provider.getFunctionAddress("glSecondaryColor3sEXT");
        glSecondaryColor3iEXT = provider.getFunctionAddress("glSecondaryColor3iEXT");
        glSecondaryColor3fEXT = provider.getFunctionAddress("glSecondaryColor3fEXT");
        glSecondaryColor3dEXT = provider.getFunctionAddress("glSecondaryColor3dEXT");
        glSecondaryColor3ubEXT = provider.getFunctionAddress("glSecondaryColor3ubEXT");
        glSecondaryColor3usEXT = provider.getFunctionAddress("glSecondaryColor3usEXT");
        glSecondaryColor3uiEXT = provider.getFunctionAddress("glSecondaryColor3uiEXT");
        glSecondaryColor3bvEXT = provider.getFunctionAddress("glSecondaryColor3bvEXT");
        glSecondaryColor3svEXT = provider.getFunctionAddress("glSecondaryColor3svEXT");
        glSecondaryColor3ivEXT = provider.getFunctionAddress("glSecondaryColor3ivEXT");
        glSecondaryColor3fvEXT = provider.getFunctionAddress("glSecondaryColor3fvEXT");
        glSecondaryColor3dvEXT = provider.getFunctionAddress("glSecondaryColor3dvEXT");
        glSecondaryColor3ubvEXT = provider.getFunctionAddress("glSecondaryColor3ubvEXT");
        glSecondaryColor3usvEXT = provider.getFunctionAddress("glSecondaryColor3usvEXT");
        glSecondaryColor3uivEXT = provider.getFunctionAddress("glSecondaryColor3uivEXT");
        glSecondaryColorPointerEXT = provider.getFunctionAddress("glSecondaryColorPointerEXT");
        glGenSemaphoresEXT = provider.getFunctionAddress("glGenSemaphoresEXT");
        glDeleteSemaphoresEXT = provider.getFunctionAddress("glDeleteSemaphoresEXT");
        glIsSemaphoreEXT = provider.getFunctionAddress("glIsSemaphoreEXT");
        glSemaphoreParameterui64vEXT = provider.getFunctionAddress("glSemaphoreParameterui64vEXT");
        glGetSemaphoreParameterui64vEXT = provider.getFunctionAddress("glGetSemaphoreParameterui64vEXT");
        glWaitSemaphoreEXT = provider.getFunctionAddress("glWaitSemaphoreEXT");
        glSignalSemaphoreEXT = provider.getFunctionAddress("glSignalSemaphoreEXT");
        glImportSemaphoreFdEXT = provider.getFunctionAddress("glImportSemaphoreFdEXT");
        glImportSemaphoreWin32HandleEXT = provider.getFunctionAddress("glImportSemaphoreWin32HandleEXT");
        glImportSemaphoreWin32NameEXT = provider.getFunctionAddress("glImportSemaphoreWin32NameEXT");
        glUseShaderProgramEXT = provider.getFunctionAddress("glUseShaderProgramEXT");
        glActiveProgramEXT = provider.getFunctionAddress("glActiveProgramEXT");
        glCreateShaderProgramEXT = provider.getFunctionAddress("glCreateShaderProgramEXT");
        glFramebufferFetchBarrierEXT = provider.getFunctionAddress("glFramebufferFetchBarrierEXT");
        glBindImageTextureEXT = provider.getFunctionAddress("glBindImageTextureEXT");
        glMemoryBarrierEXT = provider.getFunctionAddress("glMemoryBarrierEXT");
        glStencilClearTagEXT = provider.getFunctionAddress("glStencilClearTagEXT");
        glActiveStencilFaceEXT = provider.getFunctionAddress("glActiveStencilFaceEXT");
        glFramebufferTextureLayerEXT = provider.getFunctionAddress("glFramebufferTextureLayerEXT");
        glTexBufferEXT = provider.getFunctionAddress("glTexBufferEXT");
        glClearColorIiEXT = provider.getFunctionAddress("glClearColorIiEXT");
        glClearColorIuiEXT = provider.getFunctionAddress("glClearColorIuiEXT");
        glTexParameterIivEXT = provider.getFunctionAddress("glTexParameterIivEXT");
        glTexParameterIuivEXT = provider.getFunctionAddress("glTexParameterIuivEXT");
        glGetTexParameterIivEXT = provider.getFunctionAddress("glGetTexParameterIivEXT");
        glGetTexParameterIuivEXT = provider.getFunctionAddress("glGetTexParameterIuivEXT");
        glGetQueryObjecti64vEXT = provider.getFunctionAddress("glGetQueryObjecti64vEXT");
        glGetQueryObjectui64vEXT = provider.getFunctionAddress("glGetQueryObjectui64vEXT");
        glBindBufferRangeEXT = provider.getFunctionAddress("glBindBufferRangeEXT");
        glBindBufferOffsetEXT = provider.getFunctionAddress("glBindBufferOffsetEXT");
        glBindBufferBaseEXT = provider.getFunctionAddress("glBindBufferBaseEXT");
        glBeginTransformFeedbackEXT = provider.getFunctionAddress("glBeginTransformFeedbackEXT");
        glEndTransformFeedbackEXT = provider.getFunctionAddress("glEndTransformFeedbackEXT");
        glTransformFeedbackVaryingsEXT = provider.getFunctionAddress("glTransformFeedbackVaryingsEXT");
        glGetTransformFeedbackVaryingEXT = provider.getFunctionAddress("glGetTransformFeedbackVaryingEXT");
        glVertexAttribL1dEXT = provider.getFunctionAddress("glVertexAttribL1dEXT");
        glVertexAttribL2dEXT = provider.getFunctionAddress("glVertexAttribL2dEXT");
        glVertexAttribL3dEXT = provider.getFunctionAddress("glVertexAttribL3dEXT");
        glVertexAttribL4dEXT = provider.getFunctionAddress("glVertexAttribL4dEXT");
        glVertexAttribL1dvEXT = provider.getFunctionAddress("glVertexAttribL1dvEXT");
        glVertexAttribL2dvEXT = provider.getFunctionAddress("glVertexAttribL2dvEXT");
        glVertexAttribL3dvEXT = provider.getFunctionAddress("glVertexAttribL3dvEXT");
        glVertexAttribL4dvEXT = provider.getFunctionAddress("glVertexAttribL4dvEXT");
        glVertexAttribLPointerEXT = provider.getFunctionAddress("glVertexAttribLPointerEXT");
        glGetVertexAttribLdvEXT = provider.getFunctionAddress("glGetVertexAttribLdvEXT");
        glAcquireKeyedMutexWin32EXT = provider.getFunctionAddress("glAcquireKeyedMutexWin32EXT");
        glReleaseKeyedMutexWin32EXT = provider.getFunctionAddress("glReleaseKeyedMutexWin32EXT");
        glWindowRectanglesEXT = provider.getFunctionAddress("glWindowRectanglesEXT");
        glImportSyncEXT = provider.getFunctionAddress("glImportSyncEXT");
        glFrameTerminatorGREMEDY = provider.getFunctionAddress("glFrameTerminatorGREMEDY");
        glStringMarkerGREMEDY = provider.getFunctionAddress("glStringMarkerGREMEDY");
        glApplyFramebufferAttachmentCMAAINTEL = provider.getFunctionAddress("glApplyFramebufferAttachmentCMAAINTEL");
        glSyncTextureINTEL = provider.getFunctionAddress("glSyncTextureINTEL");
        glUnmapTexture2DINTEL = provider.getFunctionAddress("glUnmapTexture2DINTEL");
        glMapTexture2DINTEL = provider.getFunctionAddress("glMapTexture2DINTEL");
        glBeginPerfQueryINTEL = provider.getFunctionAddress("glBeginPerfQueryINTEL");
        glCreatePerfQueryINTEL = provider.getFunctionAddress("glCreatePerfQueryINTEL");
        glDeletePerfQueryINTEL = provider.getFunctionAddress("glDeletePerfQueryINTEL");
        glEndPerfQueryINTEL = provider.getFunctionAddress("glEndPerfQueryINTEL");
        glGetFirstPerfQueryIdINTEL = provider.getFunctionAddress("glGetFirstPerfQueryIdINTEL");
        glGetNextPerfQueryIdINTEL = provider.getFunctionAddress("glGetNextPerfQueryIdINTEL");
        glGetPerfCounterInfoINTEL = provider.getFunctionAddress("glGetPerfCounterInfoINTEL");
        glGetPerfQueryDataINTEL = provider.getFunctionAddress("glGetPerfQueryDataINTEL");
        glGetPerfQueryIdByNameINTEL = provider.getFunctionAddress("glGetPerfQueryIdByNameINTEL");
        glGetPerfQueryInfoINTEL = provider.getFunctionAddress("glGetPerfQueryInfoINTEL");
        glBlendBarrierKHR = provider.getFunctionAddress("glBlendBarrierKHR");
        glMaxShaderCompilerThreadsKHR = provider.getFunctionAddress("glMaxShaderCompilerThreadsKHR");
        glAlphaToCoverageDitherControlNV = provider.getFunctionAddress("glAlphaToCoverageDitherControlNV");
        glMultiDrawArraysIndirectBindlessNV = provider.getFunctionAddress("glMultiDrawArraysIndirectBindlessNV");
        glMultiDrawElementsIndirectBindlessNV = provider.getFunctionAddress("glMultiDrawElementsIndirectBindlessNV");
        glMultiDrawArraysIndirectBindlessCountNV = provider.getFunctionAddress("glMultiDrawArraysIndirectBindlessCountNV");
        glMultiDrawElementsIndirectBindlessCountNV = provider.getFunctionAddress("glMultiDrawElementsIndirectBindlessCountNV");
        glGetTextureHandleNV = provider.getFunctionAddress("glGetTextureHandleNV");
        glGetTextureSamplerHandleNV = provider.getFunctionAddress("glGetTextureSamplerHandleNV");
        glMakeTextureHandleResidentNV = provider.getFunctionAddress("glMakeTextureHandleResidentNV");
        glMakeTextureHandleNonResidentNV = provider.getFunctionAddress("glMakeTextureHandleNonResidentNV");
        glGetImageHandleNV = provider.getFunctionAddress("glGetImageHandleNV");
        glMakeImageHandleResidentNV = provider.getFunctionAddress("glMakeImageHandleResidentNV");
        glMakeImageHandleNonResidentNV = provider.getFunctionAddress("glMakeImageHandleNonResidentNV");
        glUniformHandleui64NV = provider.getFunctionAddress("glUniformHandleui64NV");
        glUniformHandleui64vNV = provider.getFunctionAddress("glUniformHandleui64vNV");
        glProgramUniformHandleui64NV = provider.getFunctionAddress("glProgramUniformHandleui64NV");
        glProgramUniformHandleui64vNV = provider.getFunctionAddress("glProgramUniformHandleui64vNV");
        glIsTextureHandleResidentNV = provider.getFunctionAddress("glIsTextureHandleResidentNV");
        glIsImageHandleResidentNV = provider.getFunctionAddress("glIsImageHandleResidentNV");
        glBlendParameteriNV = provider.getFunctionAddress("glBlendParameteriNV");
        glBlendBarrierNV = provider.getFunctionAddress("glBlendBarrierNV");
        glViewportPositionWScaleNV = provider.getFunctionAddress("glViewportPositionWScaleNV");
        glCreateStatesNV = provider.getFunctionAddress("glCreateStatesNV");
        glDeleteStatesNV = provider.getFunctionAddress("glDeleteStatesNV");
        glIsStateNV = provider.getFunctionAddress("glIsStateNV");
        glStateCaptureNV = provider.getFunctionAddress("glStateCaptureNV");
        glGetCommandHeaderNV = provider.getFunctionAddress("glGetCommandHeaderNV");
        glGetStageIndexNV = provider.getFunctionAddress("glGetStageIndexNV");
        glDrawCommandsNV = provider.getFunctionAddress("glDrawCommandsNV");
        glDrawCommandsAddressNV = provider.getFunctionAddress("glDrawCommandsAddressNV");
        glDrawCommandsStatesNV = provider.getFunctionAddress("glDrawCommandsStatesNV");
        glDrawCommandsStatesAddressNV = provider.getFunctionAddress("glDrawCommandsStatesAddressNV");
        glCreateCommandListsNV = provider.getFunctionAddress("glCreateCommandListsNV");
        glDeleteCommandListsNV = provider.getFunctionAddress("glDeleteCommandListsNV");
        glIsCommandListNV = provider.getFunctionAddress("glIsCommandListNV");
        glListDrawCommandsStatesClientNV = provider.getFunctionAddress("glListDrawCommandsStatesClientNV");
        glCommandListSegmentsNV = provider.getFunctionAddress("glCommandListSegmentsNV");
        glCompileCommandListNV = provider.getFunctionAddress("glCompileCommandListNV");
        glCallCommandListNV = provider.getFunctionAddress("glCallCommandListNV");
        glBeginConditionalRenderNV = provider.getFunctionAddress("glBeginConditionalRenderNV");
        glEndConditionalRenderNV = provider.getFunctionAddress("glEndConditionalRenderNV");
        glSubpixelPrecisionBiasNV = provider.getFunctionAddress("glSubpixelPrecisionBiasNV");
        glConservativeRasterParameterfNV = provider.getFunctionAddress("glConservativeRasterParameterfNV");
        glConservativeRasterParameteriNV = provider.getFunctionAddress("glConservativeRasterParameteriNV");
        glCopyImageSubDataNV = provider.getFunctionAddress("glCopyImageSubDataNV");
        glDepthRangedNV = provider.getFunctionAddress("glDepthRangedNV");
        glClearDepthdNV = provider.getFunctionAddress("glClearDepthdNV");
        glDepthBoundsdNV = provider.getFunctionAddress("glDepthBoundsdNV");
        glDrawTextureNV = provider.getFunctionAddress("glDrawTextureNV");
        glDrawVkImageNV = provider.getFunctionAddress("glDrawVkImageNV");
        glGetVkProcAddrNV = provider.getFunctionAddress("glGetVkProcAddrNV");
        glWaitVkSemaphoreNV = provider.getFunctionAddress("glWaitVkSemaphoreNV");
        glSignalVkSemaphoreNV = provider.getFunctionAddress("glSignalVkSemaphoreNV");
        glSignalVkFenceNV = provider.getFunctionAddress("glSignalVkFenceNV");
        glGetMultisamplefvNV = provider.getFunctionAddress("glGetMultisamplefvNV");
        glSampleMaskIndexedNV = provider.getFunctionAddress("glSampleMaskIndexedNV");
        glTexRenderbufferNV = provider.getFunctionAddress("glTexRenderbufferNV");
        glDeleteFencesNV = provider.getFunctionAddress("glDeleteFencesNV");
        glGenFencesNV = provider.getFunctionAddress("glGenFencesNV");
        glIsFenceNV = provider.getFunctionAddress("glIsFenceNV");
        glTestFenceNV = provider.getFunctionAddress("glTestFenceNV");
        glGetFenceivNV = provider.getFunctionAddress("glGetFenceivNV");
        glFinishFenceNV = provider.getFunctionAddress("glFinishFenceNV");
        glSetFenceNV = provider.getFunctionAddress("glSetFenceNV");
        glFragmentCoverageColorNV = provider.getFunctionAddress("glFragmentCoverageColorNV");
        glCoverageModulationTableNV = provider.getFunctionAddress("glCoverageModulationTableNV");
        glGetCoverageModulationTableNV = provider.getFunctionAddress("glGetCoverageModulationTableNV");
        glCoverageModulationNV = provider.getFunctionAddress("glCoverageModulationNV");
        glRenderbufferStorageMultisampleCoverageNV = provider.getFunctionAddress("glRenderbufferStorageMultisampleCoverageNV");
        glRenderGpuMaskNV = provider.getFunctionAddress("glRenderGpuMaskNV");
        glMulticastBufferSubDataNV = provider.getFunctionAddress("glMulticastBufferSubDataNV");
        glMulticastCopyBufferSubDataNV = provider.getFunctionAddress("glMulticastCopyBufferSubDataNV");
        glMulticastCopyImageSubDataNV = provider.getFunctionAddress("glMulticastCopyImageSubDataNV");
        glMulticastBlitFramebufferNV = provider.getFunctionAddress("glMulticastBlitFramebufferNV");
        glMulticastFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glMulticastFramebufferSampleLocationsfvNV");
        glMulticastBarrierNV = provider.getFunctionAddress("glMulticastBarrierNV");
        glMulticastWaitSyncNV = provider.getFunctionAddress("glMulticastWaitSyncNV");
        glMulticastGetQueryObjectivNV = provider.getFunctionAddress("glMulticastGetQueryObjectivNV");
        glMulticastGetQueryObjectuivNV = provider.getFunctionAddress("glMulticastGetQueryObjectuivNV");
        glMulticastGetQueryObjecti64vNV = provider.getFunctionAddress("glMulticastGetQueryObjecti64vNV");
        glMulticastGetQueryObjectui64vNV = provider.getFunctionAddress("glMulticastGetQueryObjectui64vNV");
        glUniform1i64NV = provider.getFunctionAddress("glUniform1i64NV");
        glUniform2i64NV = provider.getFunctionAddress("glUniform2i64NV");
        glUniform3i64NV = provider.getFunctionAddress("glUniform3i64NV");
        glUniform4i64NV = provider.getFunctionAddress("glUniform4i64NV");
        glUniform1i64vNV = provider.getFunctionAddress("glUniform1i64vNV");
        glUniform2i64vNV = provider.getFunctionAddress("glUniform2i64vNV");
        glUniform3i64vNV = provider.getFunctionAddress("glUniform3i64vNV");
        glUniform4i64vNV = provider.getFunctionAddress("glUniform4i64vNV");
        glUniform1ui64NV = provider.getFunctionAddress("glUniform1ui64NV");
        glUniform2ui64NV = provider.getFunctionAddress("glUniform2ui64NV");
        glUniform3ui64NV = provider.getFunctionAddress("glUniform3ui64NV");
        glUniform4ui64NV = provider.getFunctionAddress("glUniform4ui64NV");
        glUniform1ui64vNV = provider.getFunctionAddress("glUniform1ui64vNV");
        glUniform2ui64vNV = provider.getFunctionAddress("glUniform2ui64vNV");
        glUniform3ui64vNV = provider.getFunctionAddress("glUniform3ui64vNV");
        glUniform4ui64vNV = provider.getFunctionAddress("glUniform4ui64vNV");
        glGetUniformi64vNV = provider.getFunctionAddress("glGetUniformi64vNV");
        glProgramUniform1i64NV = provider.getFunctionAddress("glProgramUniform1i64NV");
        glProgramUniform2i64NV = provider.getFunctionAddress("glProgramUniform2i64NV");
        glProgramUniform3i64NV = provider.getFunctionAddress("glProgramUniform3i64NV");
        glProgramUniform4i64NV = provider.getFunctionAddress("glProgramUniform4i64NV");
        glProgramUniform1i64vNV = provider.getFunctionAddress("glProgramUniform1i64vNV");
        glProgramUniform2i64vNV = provider.getFunctionAddress("glProgramUniform2i64vNV");
        glProgramUniform3i64vNV = provider.getFunctionAddress("glProgramUniform3i64vNV");
        glProgramUniform4i64vNV = provider.getFunctionAddress("glProgramUniform4i64vNV");
        glProgramUniform1ui64NV = provider.getFunctionAddress("glProgramUniform1ui64NV");
        glProgramUniform2ui64NV = provider.getFunctionAddress("glProgramUniform2ui64NV");
        glProgramUniform3ui64NV = provider.getFunctionAddress("glProgramUniform3ui64NV");
        glProgramUniform4ui64NV = provider.getFunctionAddress("glProgramUniform4ui64NV");
        glProgramUniform1ui64vNV = provider.getFunctionAddress("glProgramUniform1ui64vNV");
        glProgramUniform2ui64vNV = provider.getFunctionAddress("glProgramUniform2ui64vNV");
        glProgramUniform3ui64vNV = provider.getFunctionAddress("glProgramUniform3ui64vNV");
        glProgramUniform4ui64vNV = provider.getFunctionAddress("glProgramUniform4ui64vNV");
        glVertex2hNV = provider.getFunctionAddress("glVertex2hNV");
        glVertex2hvNV = provider.getFunctionAddress("glVertex2hvNV");
        glVertex3hNV = provider.getFunctionAddress("glVertex3hNV");
        glVertex3hvNV = provider.getFunctionAddress("glVertex3hvNV");
        glVertex4hNV = provider.getFunctionAddress("glVertex4hNV");
        glVertex4hvNV = provider.getFunctionAddress("glVertex4hvNV");
        glNormal3hNV = provider.getFunctionAddress("glNormal3hNV");
        glNormal3hvNV = provider.getFunctionAddress("glNormal3hvNV");
        glColor3hNV = provider.getFunctionAddress("glColor3hNV");
        glColor3hvNV = provider.getFunctionAddress("glColor3hvNV");
        glColor4hNV = provider.getFunctionAddress("glColor4hNV");
        glColor4hvNV = provider.getFunctionAddress("glColor4hvNV");
        glTexCoord1hNV = provider.getFunctionAddress("glTexCoord1hNV");
        glTexCoord1hvNV = provider.getFunctionAddress("glTexCoord1hvNV");
        glTexCoord2hNV = provider.getFunctionAddress("glTexCoord2hNV");
        glTexCoord2hvNV = provider.getFunctionAddress("glTexCoord2hvNV");
        glTexCoord3hNV = provider.getFunctionAddress("glTexCoord3hNV");
        glTexCoord3hvNV = provider.getFunctionAddress("glTexCoord3hvNV");
        glTexCoord4hNV = provider.getFunctionAddress("glTexCoord4hNV");
        glTexCoord4hvNV = provider.getFunctionAddress("glTexCoord4hvNV");
        glMultiTexCoord1hNV = provider.getFunctionAddress("glMultiTexCoord1hNV");
        glMultiTexCoord1hvNV = provider.getFunctionAddress("glMultiTexCoord1hvNV");
        glMultiTexCoord2hNV = provider.getFunctionAddress("glMultiTexCoord2hNV");
        glMultiTexCoord2hvNV = provider.getFunctionAddress("glMultiTexCoord2hvNV");
        glMultiTexCoord3hNV = provider.getFunctionAddress("glMultiTexCoord3hNV");
        glMultiTexCoord3hvNV = provider.getFunctionAddress("glMultiTexCoord3hvNV");
        glMultiTexCoord4hNV = provider.getFunctionAddress("glMultiTexCoord4hNV");
        glMultiTexCoord4hvNV = provider.getFunctionAddress("glMultiTexCoord4hvNV");
        glFogCoordhNV = provider.getFunctionAddress("glFogCoordhNV");
        glFogCoordhvNV = provider.getFunctionAddress("glFogCoordhvNV");
        glSecondaryColor3hNV = provider.getFunctionAddress("glSecondaryColor3hNV");
        glSecondaryColor3hvNV = provider.getFunctionAddress("glSecondaryColor3hvNV");
        glVertexWeighthNV = provider.getFunctionAddress("glVertexWeighthNV");
        glVertexWeighthvNV = provider.getFunctionAddress("glVertexWeighthvNV");
        glVertexAttrib1hNV = provider.getFunctionAddress("glVertexAttrib1hNV");
        glVertexAttrib1hvNV = provider.getFunctionAddress("glVertexAttrib1hvNV");
        glVertexAttrib2hNV = provider.getFunctionAddress("glVertexAttrib2hNV");
        glVertexAttrib2hvNV = provider.getFunctionAddress("glVertexAttrib2hvNV");
        glVertexAttrib3hNV = provider.getFunctionAddress("glVertexAttrib3hNV");
        glVertexAttrib3hvNV = provider.getFunctionAddress("glVertexAttrib3hvNV");
        glVertexAttrib4hNV = provider.getFunctionAddress("glVertexAttrib4hNV");
        glVertexAttrib4hvNV = provider.getFunctionAddress("glVertexAttrib4hvNV");
        glVertexAttribs1hvNV = provider.getFunctionAddress("glVertexAttribs1hvNV");
        glVertexAttribs2hvNV = provider.getFunctionAddress("glVertexAttribs2hvNV");
        glVertexAttribs3hvNV = provider.getFunctionAddress("glVertexAttribs3hvNV");
        glVertexAttribs4hvNV = provider.getFunctionAddress("glVertexAttribs4hvNV");
        glGetInternalformatSampleivNV = provider.getFunctionAddress("glGetInternalformatSampleivNV");
        glPathCommandsNV = provider.getFunctionAddress("glPathCommandsNV");
        glPathCoordsNV = provider.getFunctionAddress("glPathCoordsNV");
        glPathSubCommandsNV = provider.getFunctionAddress("glPathSubCommandsNV");
        glPathSubCoordsNV = provider.getFunctionAddress("glPathSubCoordsNV");
        glPathStringNV = provider.getFunctionAddress("glPathStringNV");
        glPathGlyphsNV = provider.getFunctionAddress("glPathGlyphsNV");
        glPathGlyphRangeNV = provider.getFunctionAddress("glPathGlyphRangeNV");
        glPathGlyphIndexArrayNV = provider.getFunctionAddress("glPathGlyphIndexArrayNV");
        glPathMemoryGlyphIndexArrayNV = provider.getFunctionAddress("glPathMemoryGlyphIndexArrayNV");
        glCopyPathNV = provider.getFunctionAddress("glCopyPathNV");
        glWeightPathsNV = provider.getFunctionAddress("glWeightPathsNV");
        glInterpolatePathsNV = provider.getFunctionAddress("glInterpolatePathsNV");
        glTransformPathNV = provider.getFunctionAddress("glTransformPathNV");
        glPathParameterivNV = provider.getFunctionAddress("glPathParameterivNV");
        glPathParameteriNV = provider.getFunctionAddress("glPathParameteriNV");
        glPathParameterfvNV = provider.getFunctionAddress("glPathParameterfvNV");
        glPathParameterfNV = provider.getFunctionAddress("glPathParameterfNV");
        glPathDashArrayNV = provider.getFunctionAddress("glPathDashArrayNV");
        glGenPathsNV = provider.getFunctionAddress("glGenPathsNV");
        glDeletePathsNV = provider.getFunctionAddress("glDeletePathsNV");
        glIsPathNV = provider.getFunctionAddress("glIsPathNV");
        glPathStencilFuncNV = provider.getFunctionAddress("glPathStencilFuncNV");
        glPathStencilDepthOffsetNV = provider.getFunctionAddress("glPathStencilDepthOffsetNV");
        glStencilFillPathNV = provider.getFunctionAddress("glStencilFillPathNV");
        glStencilStrokePathNV = provider.getFunctionAddress("glStencilStrokePathNV");
        glStencilFillPathInstancedNV = provider.getFunctionAddress("glStencilFillPathInstancedNV");
        glStencilStrokePathInstancedNV = provider.getFunctionAddress("glStencilStrokePathInstancedNV");
        glPathCoverDepthFuncNV = provider.getFunctionAddress("glPathCoverDepthFuncNV");
        glPathColorGenNV = provider.getFunctionAddress("glPathColorGenNV");
        glPathTexGenNV = provider.getFunctionAddress("glPathTexGenNV");
        glPathFogGenNV = provider.getFunctionAddress("glPathFogGenNV");
        glCoverFillPathNV = provider.getFunctionAddress("glCoverFillPathNV");
        glCoverStrokePathNV = provider.getFunctionAddress("glCoverStrokePathNV");
        glCoverFillPathInstancedNV = provider.getFunctionAddress("glCoverFillPathInstancedNV");
        glCoverStrokePathInstancedNV = provider.getFunctionAddress("glCoverStrokePathInstancedNV");
        glStencilThenCoverFillPathNV = provider.getFunctionAddress("glStencilThenCoverFillPathNV");
        glStencilThenCoverStrokePathNV = provider.getFunctionAddress("glStencilThenCoverStrokePathNV");
        glStencilThenCoverFillPathInstancedNV = provider.getFunctionAddress("glStencilThenCoverFillPathInstancedNV");
        glStencilThenCoverStrokePathInstancedNV = provider.getFunctionAddress("glStencilThenCoverStrokePathInstancedNV");
        glPathGlyphIndexRangeNV = provider.getFunctionAddress("glPathGlyphIndexRangeNV");
        glProgramPathFragmentInputGenNV = provider.getFunctionAddress("glProgramPathFragmentInputGenNV");
        glGetPathParameterivNV = provider.getFunctionAddress("glGetPathParameterivNV");
        glGetPathParameterfvNV = provider.getFunctionAddress("glGetPathParameterfvNV");
        glGetPathCommandsNV = provider.getFunctionAddress("glGetPathCommandsNV");
        glGetPathCoordsNV = provider.getFunctionAddress("glGetPathCoordsNV");
        glGetPathDashArrayNV = provider.getFunctionAddress("glGetPathDashArrayNV");
        glGetPathMetricsNV = provider.getFunctionAddress("glGetPathMetricsNV");
        glGetPathMetricRangeNV = provider.getFunctionAddress("glGetPathMetricRangeNV");
        glGetPathSpacingNV = provider.getFunctionAddress("glGetPathSpacingNV");
        glGetPathColorGenivNV = provider.getFunctionAddress("glGetPathColorGenivNV");
        glGetPathColorGenfvNV = provider.getFunctionAddress("glGetPathColorGenfvNV");
        glGetPathTexGenivNV = provider.getFunctionAddress("glGetPathTexGenivNV");
        glGetPathTexGenfvNV = provider.getFunctionAddress("glGetPathTexGenfvNV");
        glIsPointInFillPathNV = provider.getFunctionAddress("glIsPointInFillPathNV");
        glIsPointInStrokePathNV = provider.getFunctionAddress("glIsPointInStrokePathNV");
        glGetPathLengthNV = provider.getFunctionAddress("glGetPathLengthNV");
        glPointAlongPathNV = provider.getFunctionAddress("glPointAlongPathNV");
        glMatrixLoad3x2fNV = provider.getFunctionAddress("glMatrixLoad3x2fNV");
        glMatrixLoad3x3fNV = provider.getFunctionAddress("glMatrixLoad3x3fNV");
        glMatrixLoadTranspose3x3fNV = provider.getFunctionAddress("glMatrixLoadTranspose3x3fNV");
        glMatrixMult3x2fNV = provider.getFunctionAddress("glMatrixMult3x2fNV");
        glMatrixMult3x3fNV = provider.getFunctionAddress("glMatrixMult3x3fNV");
        glMatrixMultTranspose3x3fNV = provider.getFunctionAddress("glMatrixMultTranspose3x3fNV");
        glGetProgramResourcefvNV = provider.getFunctionAddress("glGetProgramResourcefvNV");
        glPixelDataRangeNV = provider.getFunctionAddress("glPixelDataRangeNV");
        glFlushPixelDataRangeNV = provider.getFunctionAddress("glFlushPixelDataRangeNV");
        glPointParameteriNV = provider.getFunctionAddress("glPointParameteriNV");
        glPointParameterivNV = provider.getFunctionAddress("glPointParameterivNV");
        glPrimitiveRestartNV = provider.getFunctionAddress("glPrimitiveRestartNV");
        glPrimitiveRestartIndexNV = provider.getFunctionAddress("glPrimitiveRestartIndexNV");
        glQueryResourceNV = provider.getFunctionAddress("glQueryResourceNV");
        glGenQueryResourceTagNV = provider.getFunctionAddress("glGenQueryResourceTagNV");
        glDeleteQueryResourceTagNV = provider.getFunctionAddress("glDeleteQueryResourceTagNV");
        glQueryResourceTagNV = provider.getFunctionAddress("glQueryResourceTagNV");
        glFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glFramebufferSampleLocationsfvNV");
        glNamedFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvNV");
        glResolveDepthValuesNV = provider.getFunctionAddress("glResolveDepthValuesNV");
        glMakeBufferResidentNV = provider.getFunctionAddress("glMakeBufferResidentNV");
        glMakeBufferNonResidentNV = provider.getFunctionAddress("glMakeBufferNonResidentNV");
        glIsBufferResidentNV = provider.getFunctionAddress("glIsBufferResidentNV");
        glMakeNamedBufferResidentNV = provider.getFunctionAddress("glMakeNamedBufferResidentNV");
        glMakeNamedBufferNonResidentNV = provider.getFunctionAddress("glMakeNamedBufferNonResidentNV");
        glIsNamedBufferResidentNV = provider.getFunctionAddress("glIsNamedBufferResidentNV");
        glGetBufferParameterui64vNV = provider.getFunctionAddress("glGetBufferParameterui64vNV");
        glGetNamedBufferParameterui64vNV = provider.getFunctionAddress("glGetNamedBufferParameterui64vNV");
        glGetIntegerui64vNV = provider.getFunctionAddress("glGetIntegerui64vNV");
        glUniformui64NV = provider.getFunctionAddress("glUniformui64NV");
        glUniformui64vNV = provider.getFunctionAddress("glUniformui64vNV");
        glGetUniformui64vNV = provider.getFunctionAddress("glGetUniformui64vNV");
        glProgramUniformui64NV = provider.getFunctionAddress("glProgramUniformui64NV");
        glProgramUniformui64vNV = provider.getFunctionAddress("glProgramUniformui64vNV");
        glTextureBarrierNV = provider.getFunctionAddress("glTextureBarrierNV");
        glTexImage2DMultisampleCoverageNV = provider.getFunctionAddress("glTexImage2DMultisampleCoverageNV");
        glTexImage3DMultisampleCoverageNV = provider.getFunctionAddress("glTexImage3DMultisampleCoverageNV");
        glTextureImage2DMultisampleNV = provider.getFunctionAddress("glTextureImage2DMultisampleNV");
        glTextureImage3DMultisampleNV = provider.getFunctionAddress("glTextureImage3DMultisampleNV");
        glTextureImage2DMultisampleCoverageNV = provider.getFunctionAddress("glTextureImage2DMultisampleCoverageNV");
        glTextureImage3DMultisampleCoverageNV = provider.getFunctionAddress("glTextureImage3DMultisampleCoverageNV");
        glBeginTransformFeedbackNV = provider.getFunctionAddress("glBeginTransformFeedbackNV");
        glEndTransformFeedbackNV = provider.getFunctionAddress("glEndTransformFeedbackNV");
        glTransformFeedbackAttribsNV = provider.getFunctionAddress("glTransformFeedbackAttribsNV");
        glBindBufferRangeNV = provider.getFunctionAddress("glBindBufferRangeNV");
        glBindBufferOffsetNV = provider.getFunctionAddress("glBindBufferOffsetNV");
        glBindBufferBaseNV = provider.getFunctionAddress("glBindBufferBaseNV");
        glTransformFeedbackVaryingsNV = provider.getFunctionAddress("glTransformFeedbackVaryingsNV");
        glActiveVaryingNV = provider.getFunctionAddress("glActiveVaryingNV");
        glGetVaryingLocationNV = provider.getFunctionAddress("glGetVaryingLocationNV");
        glGetActiveVaryingNV = provider.getFunctionAddress("glGetActiveVaryingNV");
        glGetTransformFeedbackVaryingNV = provider.getFunctionAddress("glGetTransformFeedbackVaryingNV");
        glTransformFeedbackStreamAttribsNV = provider.getFunctionAddress("glTransformFeedbackStreamAttribsNV");
        glBindTransformFeedbackNV = provider.getFunctionAddress("glBindTransformFeedbackNV");
        glDeleteTransformFeedbacksNV = provider.getFunctionAddress("glDeleteTransformFeedbacksNV");
        glGenTransformFeedbacksNV = provider.getFunctionAddress("glGenTransformFeedbacksNV");
        glIsTransformFeedbackNV = provider.getFunctionAddress("glIsTransformFeedbackNV");
        glPauseTransformFeedbackNV = provider.getFunctionAddress("glPauseTransformFeedbackNV");
        glResumeTransformFeedbackNV = provider.getFunctionAddress("glResumeTransformFeedbackNV");
        glDrawTransformFeedbackNV = provider.getFunctionAddress("glDrawTransformFeedbackNV");
        glVertexArrayRangeNV = provider.getFunctionAddress("glVertexArrayRangeNV");
        glFlushVertexArrayRangeNV = provider.getFunctionAddress("glFlushVertexArrayRangeNV");
        glVertexAttribL1i64NV = provider.getFunctionAddress("glVertexAttribL1i64NV");
        glVertexAttribL2i64NV = provider.getFunctionAddress("glVertexAttribL2i64NV");
        glVertexAttribL3i64NV = provider.getFunctionAddress("glVertexAttribL3i64NV");
        glVertexAttribL4i64NV = provider.getFunctionAddress("glVertexAttribL4i64NV");
        glVertexAttribL1i64vNV = provider.getFunctionAddress("glVertexAttribL1i64vNV");
        glVertexAttribL2i64vNV = provider.getFunctionAddress("glVertexAttribL2i64vNV");
        glVertexAttribL3i64vNV = provider.getFunctionAddress("glVertexAttribL3i64vNV");
        glVertexAttribL4i64vNV = provider.getFunctionAddress("glVertexAttribL4i64vNV");
        glVertexAttribL1ui64NV = provider.getFunctionAddress("glVertexAttribL1ui64NV");
        glVertexAttribL2ui64NV = provider.getFunctionAddress("glVertexAttribL2ui64NV");
        glVertexAttribL3ui64NV = provider.getFunctionAddress("glVertexAttribL3ui64NV");
        glVertexAttribL4ui64NV = provider.getFunctionAddress("glVertexAttribL4ui64NV");
        glVertexAttribL1ui64vNV = provider.getFunctionAddress("glVertexAttribL1ui64vNV");
        glVertexAttribL2ui64vNV = provider.getFunctionAddress("glVertexAttribL2ui64vNV");
        glVertexAttribL3ui64vNV = provider.getFunctionAddress("glVertexAttribL3ui64vNV");
        glVertexAttribL4ui64vNV = provider.getFunctionAddress("glVertexAttribL4ui64vNV");
        glGetVertexAttribLi64vNV = provider.getFunctionAddress("glGetVertexAttribLi64vNV");
        glGetVertexAttribLui64vNV = provider.getFunctionAddress("glGetVertexAttribLui64vNV");
        glVertexAttribLFormatNV = provider.getFunctionAddress("glVertexAttribLFormatNV");
        glBufferAddressRangeNV = provider.getFunctionAddress("glBufferAddressRangeNV");
        glVertexFormatNV = provider.getFunctionAddress("glVertexFormatNV");
        glNormalFormatNV = provider.getFunctionAddress("glNormalFormatNV");
        glColorFormatNV = provider.getFunctionAddress("glColorFormatNV");
        glIndexFormatNV = provider.getFunctionAddress("glIndexFormatNV");
        glTexCoordFormatNV = provider.getFunctionAddress("glTexCoordFormatNV");
        glEdgeFlagFormatNV = provider.getFunctionAddress("glEdgeFlagFormatNV");
        glSecondaryColorFormatNV = provider.getFunctionAddress("glSecondaryColorFormatNV");
        glFogCoordFormatNV = provider.getFunctionAddress("glFogCoordFormatNV");
        glVertexAttribFormatNV = provider.getFunctionAddress("glVertexAttribFormatNV");
        glVertexAttribIFormatNV = provider.getFunctionAddress("glVertexAttribIFormatNV");
        glGetIntegerui64i_vNV = provider.getFunctionAddress("glGetIntegerui64i_vNV");
        glViewportSwizzleNV = provider.getFunctionAddress("glViewportSwizzleNV");
        glBeginConditionalRenderNVX = provider.getFunctionAddress("glBeginConditionalRenderNVX");
        glEndConditionalRenderNVX = provider.getFunctionAddress("glEndConditionalRenderNVX");
        glFramebufferTextureMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultiviewOVR");
        glNamedFramebufferTextureMultiviewOVR = provider.getFunctionAddress("glNamedFramebufferTextureMultiviewOVR");

        OpenGL11 = ext.contains("OpenGL11") && checkExtension("OpenGL11", GL11.isAvailable(this, ext, fc));
        OpenGL12 = ext.contains("OpenGL12") && checkExtension("OpenGL12", GL12.isAvailable(this));
        OpenGL13 = ext.contains("OpenGL13") && checkExtension("OpenGL13", GL13.isAvailable(this, fc));
        OpenGL14 = ext.contains("OpenGL14") && checkExtension("OpenGL14", GL14.isAvailable(this, fc));
        OpenGL15 = ext.contains("OpenGL15") && checkExtension("OpenGL15", GL15.isAvailable(this));
        OpenGL20 = ext.contains("OpenGL20") && checkExtension("OpenGL20", GL20.isAvailable(this));
        OpenGL21 = ext.contains("OpenGL21") && checkExtension("OpenGL21", GL21.isAvailable(this));
        OpenGL30 = ext.contains("OpenGL30") && checkExtension("OpenGL30", GL30.isAvailable(this));
        OpenGL31 = ext.contains("OpenGL31") && checkExtension("OpenGL31", GL31.isAvailable(this));
        OpenGL32 = ext.contains("OpenGL32") && checkExtension("OpenGL32", GL32.isAvailable(this));
        OpenGL33 = ext.contains("OpenGL33") && checkExtension("OpenGL33", GL33.isAvailable(this, fc));
        OpenGL40 = ext.contains("OpenGL40") && checkExtension("OpenGL40", GL40.isAvailable(this));
        OpenGL41 = ext.contains("OpenGL41") && checkExtension("OpenGL41", GL41.isAvailable(this));
        OpenGL42 = ext.contains("OpenGL42") && checkExtension("OpenGL42", GL42.isAvailable(this));
        OpenGL43 = ext.contains("OpenGL43") && checkExtension("OpenGL43", GL43.isAvailable(this));
        OpenGL44 = ext.contains("OpenGL44") && checkExtension("OpenGL44", GL44.isAvailable(this));
        OpenGL45 = ext.contains("OpenGL45") && checkExtension("OpenGL45", GL45.isAvailable(this, ext));
        OpenGL46 = ext.contains("OpenGL46") && checkExtension("OpenGL46", GL46.isAvailable(this));
        GL_AMD_blend_minmax_factor = ext.contains("GL_AMD_blend_minmax_factor");
        GL_AMD_conservative_depth = ext.contains("GL_AMD_conservative_depth");
        GL_AMD_debug_output = ext.contains("GL_AMD_debug_output") && checkExtension("GL_AMD_debug_output", AMDDebugOutput.isAvailable(this));
        GL_AMD_depth_clamp_separate = ext.contains("GL_AMD_depth_clamp_separate");
        GL_AMD_draw_buffers_blend = ext.contains("GL_AMD_draw_buffers_blend") && checkExtension("GL_AMD_draw_buffers_blend", AMDDrawBuffersBlend.isAvailable(this));
        GL_AMD_gcn_shader = ext.contains("GL_AMD_gcn_shader");
        GL_AMD_gpu_shader_half_float = ext.contains("GL_AMD_gpu_shader_half_float");
        GL_AMD_gpu_shader_half_float_fetch = ext.contains("GL_AMD_gpu_shader_half_float_fetch");
        GL_AMD_gpu_shader_int16 = ext.contains("GL_AMD_gpu_shader_int16");
        GL_AMD_gpu_shader_int64 = ext.contains("GL_AMD_gpu_shader_int64") && checkExtension("GL_AMD_gpu_shader_int64", AMDGPUShaderInt64.isAvailable(this, ext));
        GL_AMD_interleaved_elements = ext.contains("GL_AMD_interleaved_elements") && checkExtension("GL_AMD_interleaved_elements", AMDInterleavedElements.isAvailable(this));
        GL_AMD_occlusion_query_event = ext.contains("GL_AMD_occlusion_query_event") && checkExtension("GL_AMD_occlusion_query_event", AMDOcclusionQueryEvent.isAvailable(this));
        GL_AMD_performance_monitor = ext.contains("GL_AMD_performance_monitor") && checkExtension("GL_AMD_performance_monitor", AMDPerformanceMonitor.isAvailable(this));
        GL_AMD_pinned_memory = ext.contains("GL_AMD_pinned_memory");
        GL_AMD_query_buffer_object = ext.contains("GL_AMD_query_buffer_object");
        GL_AMD_sample_positions = ext.contains("GL_AMD_sample_positions") && checkExtension("GL_AMD_sample_positions", AMDSamplePositions.isAvailable(this));
        GL_AMD_seamless_cubemap_per_texture = ext.contains("GL_AMD_seamless_cubemap_per_texture");
        GL_AMD_shader_atomic_counter_ops = ext.contains("GL_AMD_shader_atomic_counter_ops");
        GL_AMD_shader_ballot = ext.contains("GL_AMD_shader_ballot");
        GL_AMD_shader_explicit_vertex_parameter = ext.contains("GL_AMD_shader_explicit_vertex_parameter");
        GL_AMD_shader_image_load_store_lod = ext.contains("GL_AMD_shader_image_load_store_lod");
        GL_AMD_shader_stencil_export = ext.contains("GL_AMD_shader_stencil_export");
        GL_AMD_shader_trinary_minmax = ext.contains("GL_AMD_shader_trinary_minmax");
        GL_AMD_sparse_texture = ext.contains("GL_AMD_sparse_texture") && checkExtension("GL_AMD_sparse_texture", AMDSparseTexture.isAvailable(this));
        GL_AMD_stencil_operation_extended = ext.contains("GL_AMD_stencil_operation_extended") && checkExtension("GL_AMD_stencil_operation_extended", AMDStencilOperationExtended.isAvailable(this));
        GL_AMD_texture_gather_bias_lod = ext.contains("GL_AMD_texture_gather_bias_lod");
        GL_AMD_texture_texture4 = ext.contains("GL_AMD_texture_texture4");
        GL_AMD_transform_feedback3_lines_triangles = ext.contains("GL_AMD_transform_feedback3_lines_triangles");
        GL_AMD_transform_feedback4 = ext.contains("GL_AMD_transform_feedback4");
        GL_AMD_vertex_shader_layer = ext.contains("GL_AMD_vertex_shader_layer");
        GL_AMD_vertex_shader_tessellator = ext.contains("GL_AMD_vertex_shader_tessellator") && checkExtension("GL_AMD_vertex_shader_tessellator", AMDVertexShaderTessellator.isAvailable(this));
        GL_AMD_vertex_shader_viewport_index = ext.contains("GL_AMD_vertex_shader_viewport_index");
        GL_ARB_arrays_of_arrays = ext.contains("GL_ARB_arrays_of_arrays");
        GL_ARB_base_instance = ext.contains("GL_ARB_base_instance") && checkExtension("GL_ARB_base_instance", ARBBaseInstance.isAvailable(this));
        GL_ARB_bindless_texture = ext.contains("GL_ARB_bindless_texture") && checkExtension("GL_ARB_bindless_texture", ARBBindlessTexture.isAvailable(this));
        GL_ARB_blend_func_extended = ext.contains("GL_ARB_blend_func_extended") && checkExtension("GL_ARB_blend_func_extended", ARBBlendFuncExtended.isAvailable(this));
        GL_ARB_buffer_storage = ext.contains("GL_ARB_buffer_storage") && checkExtension("GL_ARB_buffer_storage", ARBBufferStorage.isAvailable(this, ext));
        GL_ARB_cl_event = ext.contains("GL_ARB_cl_event") && checkExtension("GL_ARB_cl_event", ARBCLEvent.isAvailable(this));
        GL_ARB_clear_buffer_object = ext.contains("GL_ARB_clear_buffer_object") && checkExtension("GL_ARB_clear_buffer_object", ARBClearBufferObject.isAvailable(this, ext));
        GL_ARB_clear_texture = ext.contains("GL_ARB_clear_texture") && checkExtension("GL_ARB_clear_texture", ARBClearTexture.isAvailable(this));
        GL_ARB_clip_control = ext.contains("GL_ARB_clip_control") && checkExtension("GL_ARB_clip_control", ARBClipControl.isAvailable(this));
        GL_ARB_color_buffer_float = ext.contains("GL_ARB_color_buffer_float") && checkExtension("GL_ARB_color_buffer_float", ARBColorBufferFloat.isAvailable(this));
        GL_ARB_compatibility = ext.contains("GL_ARB_compatibility");
        GL_ARB_compressed_texture_pixel_storage = ext.contains("GL_ARB_compressed_texture_pixel_storage");
        GL_ARB_compute_shader = ext.contains("GL_ARB_compute_shader") && checkExtension("GL_ARB_compute_shader", ARBComputeShader.isAvailable(this));
        GL_ARB_compute_variable_group_size = ext.contains("GL_ARB_compute_variable_group_size") && checkExtension("GL_ARB_compute_variable_group_size", ARBComputeVariableGroupSize.isAvailable(this));
        GL_ARB_conditional_render_inverted = ext.contains("GL_ARB_conditional_render_inverted");
        GL_ARB_conservative_depth = ext.contains("GL_ARB_conservative_depth");
        GL_ARB_copy_buffer = ext.contains("GL_ARB_copy_buffer") && checkExtension("GL_ARB_copy_buffer", ARBCopyBuffer.isAvailable(this));
        GL_ARB_copy_image = ext.contains("GL_ARB_copy_image") && checkExtension("GL_ARB_copy_image", ARBCopyImage.isAvailable(this));
        GL_ARB_cull_distance = ext.contains("GL_ARB_cull_distance");
        GL_ARB_debug_output = ext.contains("GL_ARB_debug_output") && checkExtension("GL_ARB_debug_output", ARBDebugOutput.isAvailable(this));
        GL_ARB_depth_buffer_float = ext.contains("GL_ARB_depth_buffer_float");
        GL_ARB_depth_clamp = ext.contains("GL_ARB_depth_clamp");
        GL_ARB_depth_texture = ext.contains("GL_ARB_depth_texture");
        GL_ARB_derivative_control = ext.contains("GL_ARB_derivative_control");
        GL_ARB_direct_state_access = ext.contains("GL_ARB_direct_state_access") && checkExtension("GL_ARB_direct_state_access", ARBDirectStateAccess.isAvailable(this, ext));
        GL_ARB_draw_buffers = ext.contains("GL_ARB_draw_buffers") && checkExtension("GL_ARB_draw_buffers", ARBDrawBuffers.isAvailable(this));
        GL_ARB_draw_buffers_blend = ext.contains("GL_ARB_draw_buffers_blend") && checkExtension("GL_ARB_draw_buffers_blend", ARBDrawBuffersBlend.isAvailable(this));
        GL_ARB_draw_elements_base_vertex = ext.contains("GL_ARB_draw_elements_base_vertex") && checkExtension("GL_ARB_draw_elements_base_vertex", ARBDrawElementsBaseVertex.isAvailable(this));
        GL_ARB_draw_indirect = ext.contains("GL_ARB_draw_indirect") && checkExtension("GL_ARB_draw_indirect", ARBDrawIndirect.isAvailable(this));
        GL_ARB_draw_instanced = ext.contains("GL_ARB_draw_instanced") && checkExtension("GL_ARB_draw_instanced", ARBDrawInstanced.isAvailable(this));
        GL_ARB_enhanced_layouts = ext.contains("GL_ARB_enhanced_layouts");
        GL_ARB_ES2_compatibility = ext.contains("GL_ARB_ES2_compatibility") && checkExtension("GL_ARB_ES2_compatibility", ARBES2Compatibility.isAvailable(this));
        GL_ARB_ES3_1_compatibility = ext.contains("GL_ARB_ES3_1_compatibility") && checkExtension("GL_ARB_ES3_1_compatibility", ARBES31Compatibility.isAvailable(this));
        GL_ARB_ES3_2_compatibility = ext.contains("GL_ARB_ES3_2_compatibility") && checkExtension("GL_ARB_ES3_2_compatibility", ARBES32Compatibility.isAvailable(this));
        GL_ARB_ES3_compatibility = ext.contains("GL_ARB_ES3_compatibility");
        GL_ARB_explicit_attrib_location = ext.contains("GL_ARB_explicit_attrib_location");
        GL_ARB_explicit_uniform_location = ext.contains("GL_ARB_explicit_uniform_location");
        GL_ARB_fragment_coord_conventions = ext.contains("GL_ARB_fragment_coord_conventions");
        GL_ARB_fragment_layer_viewport = ext.contains("GL_ARB_fragment_layer_viewport");
        GL_ARB_fragment_program = ext.contains("GL_ARB_fragment_program");
        GL_ARB_fragment_program_shadow = ext.contains("GL_ARB_fragment_program_shadow");
        GL_ARB_fragment_shader = ext.contains("GL_ARB_fragment_shader");
        GL_ARB_fragment_shader_interlock = ext.contains("GL_ARB_fragment_shader_interlock");
        GL_ARB_framebuffer_no_attachments = ext.contains("GL_ARB_framebuffer_no_attachments") && checkExtension("GL_ARB_framebuffer_no_attachments", ARBFramebufferNoAttachments.isAvailable(this, ext));
        GL_ARB_framebuffer_object = ext.contains("GL_ARB_framebuffer_object") && checkExtension("GL_ARB_framebuffer_object", ARBFramebufferObject.isAvailable(this));
        GL_ARB_framebuffer_sRGB = ext.contains("GL_ARB_framebuffer_sRGB");
        GL_ARB_geometry_shader4 = ext.contains("GL_ARB_geometry_shader4") && checkExtension("GL_ARB_geometry_shader4", ARBGeometryShader4.isAvailable(this));
        GL_ARB_get_program_binary = ext.contains("GL_ARB_get_program_binary") && checkExtension("GL_ARB_get_program_binary", ARBGetProgramBinary.isAvailable(this));
        GL_ARB_get_texture_sub_image = ext.contains("GL_ARB_get_texture_sub_image") && checkExtension("GL_ARB_get_texture_sub_image", ARBGetTextureSubImage.isAvailable(this));
        GL_ARB_gl_spirv = ext.contains("GL_ARB_gl_spirv") && checkExtension("GL_ARB_gl_spirv", ARBGLSPIRV.isAvailable(this));
        GL_ARB_gpu_shader5 = ext.contains("GL_ARB_gpu_shader5");
        GL_ARB_gpu_shader_fp64 = ext.contains("GL_ARB_gpu_shader_fp64") && checkExtension("GL_ARB_gpu_shader_fp64", ARBGPUShaderFP64.isAvailable(this, ext));
        GL_ARB_gpu_shader_int64 = ext.contains("GL_ARB_gpu_shader_int64") && checkExtension("GL_ARB_gpu_shader_int64", ARBGPUShaderInt64.isAvailable(this));
        GL_ARB_half_float_pixel = ext.contains("GL_ARB_half_float_pixel");
        GL_ARB_half_float_vertex = ext.contains("GL_ARB_half_float_vertex");
        GL_ARB_imaging = ext.contains("GL_ARB_imaging") && checkExtension("GL_ARB_imaging", ARBImaging.isAvailable(this, fc));
        GL_ARB_indirect_parameters = ext.contains("GL_ARB_indirect_parameters") && checkExtension("GL_ARB_indirect_parameters", ARBIndirectParameters.isAvailable(this));
        GL_ARB_instanced_arrays = ext.contains("GL_ARB_instanced_arrays") && checkExtension("GL_ARB_instanced_arrays", ARBInstancedArrays.isAvailable(this, ext));
        GL_ARB_internalformat_query = ext.contains("GL_ARB_internalformat_query") && checkExtension("GL_ARB_internalformat_query", ARBInternalformatQuery.isAvailable(this));
        GL_ARB_internalformat_query2 = ext.contains("GL_ARB_internalformat_query2") && checkExtension("GL_ARB_internalformat_query2", ARBInternalformatQuery2.isAvailable(this));
        GL_ARB_invalidate_subdata = ext.contains("GL_ARB_invalidate_subdata") && checkExtension("GL_ARB_invalidate_subdata", ARBInvalidateSubdata.isAvailable(this));
        GL_ARB_map_buffer_alignment = ext.contains("GL_ARB_map_buffer_alignment");
        GL_ARB_map_buffer_range = ext.contains("GL_ARB_map_buffer_range") && checkExtension("GL_ARB_map_buffer_range", ARBMapBufferRange.isAvailable(this));
        GL_ARB_matrix_palette = ext.contains("GL_ARB_matrix_palette") && checkExtension("GL_ARB_matrix_palette", ARBMatrixPalette.isAvailable(this));
        GL_ARB_multi_bind = ext.contains("GL_ARB_multi_bind") && checkExtension("GL_ARB_multi_bind", ARBMultiBind.isAvailable(this));
        GL_ARB_multi_draw_indirect = ext.contains("GL_ARB_multi_draw_indirect") && checkExtension("GL_ARB_multi_draw_indirect", ARBMultiDrawIndirect.isAvailable(this));
        GL_ARB_multisample = ext.contains("GL_ARB_multisample") && checkExtension("GL_ARB_multisample", ARBMultisample.isAvailable(this));
        GL_ARB_multitexture = ext.contains("GL_ARB_multitexture") && checkExtension("GL_ARB_multitexture", ARBMultitexture.isAvailable(this));
        GL_ARB_occlusion_query = ext.contains("GL_ARB_occlusion_query") && checkExtension("GL_ARB_occlusion_query", ARBOcclusionQuery.isAvailable(this));
        GL_ARB_occlusion_query2 = ext.contains("GL_ARB_occlusion_query2");
        GL_ARB_parallel_shader_compile = ext.contains("GL_ARB_parallel_shader_compile") && checkExtension("GL_ARB_parallel_shader_compile", ARBParallelShaderCompile.isAvailable(this));
        GL_ARB_pipeline_statistics_query = ext.contains("GL_ARB_pipeline_statistics_query");
        GL_ARB_pixel_buffer_object = ext.contains("GL_ARB_pixel_buffer_object");
        GL_ARB_point_parameters = ext.contains("GL_ARB_point_parameters") && checkExtension("GL_ARB_point_parameters", ARBPointParameters.isAvailable(this));
        GL_ARB_point_sprite = ext.contains("GL_ARB_point_sprite");
        GL_ARB_polygon_offset_clamp = ext.contains("GL_ARB_polygon_offset_clamp") && checkExtension("GL_ARB_polygon_offset_clamp", ARBPolygonOffsetClamp.isAvailable(this));
        GL_ARB_post_depth_coverage = ext.contains("GL_ARB_post_depth_coverage");
        GL_ARB_program_interface_query = ext.contains("GL_ARB_program_interface_query") && checkExtension("GL_ARB_program_interface_query", ARBProgramInterfaceQuery.isAvailable(this));
        GL_ARB_provoking_vertex = ext.contains("GL_ARB_provoking_vertex") && checkExtension("GL_ARB_provoking_vertex", ARBProvokingVertex.isAvailable(this));
        GL_ARB_query_buffer_object = ext.contains("GL_ARB_query_buffer_object");
        GL_ARB_robust_buffer_access_behavior = ext.contains("GL_ARB_robust_buffer_access_behavior");
        GL_ARB_robustness = ext.contains("GL_ARB_robustness") && checkExtension("GL_ARB_robustness", ARBRobustness.isAvailable(this, ext));
        GL_ARB_robustness_application_isolation = ext.contains("GL_ARB_robustness_application_isolation");
        GL_ARB_robustness_share_group_isolation = ext.contains("GL_ARB_robustness_share_group_isolation");
        GL_ARB_sample_locations = ext.contains("GL_ARB_sample_locations") && checkExtension("GL_ARB_sample_locations", ARBSampleLocations.isAvailable(this));
        GL_ARB_sample_shading = ext.contains("GL_ARB_sample_shading") && checkExtension("GL_ARB_sample_shading", ARBSampleShading.isAvailable(this));
        GL_ARB_sampler_objects = ext.contains("GL_ARB_sampler_objects") && checkExtension("GL_ARB_sampler_objects", ARBSamplerObjects.isAvailable(this));
        GL_ARB_seamless_cube_map = ext.contains("GL_ARB_seamless_cube_map");
        GL_ARB_seamless_cubemap_per_texture = ext.contains("GL_ARB_seamless_cubemap_per_texture");
        GL_ARB_separate_shader_objects = ext.contains("GL_ARB_separate_shader_objects") && checkExtension("GL_ARB_separate_shader_objects", ARBSeparateShaderObjects.isAvailable(this));
        GL_ARB_shader_atomic_counter_ops = ext.contains("GL_ARB_shader_atomic_counter_ops");
        GL_ARB_shader_atomic_counters = ext.contains("GL_ARB_shader_atomic_counters") && checkExtension("GL_ARB_shader_atomic_counters", ARBShaderAtomicCounters.isAvailable(this));
        GL_ARB_shader_ballot = ext.contains("GL_ARB_shader_ballot");
        GL_ARB_shader_bit_encoding = ext.contains("GL_ARB_shader_bit_encoding");
        GL_ARB_shader_clock = ext.contains("GL_ARB_shader_clock");
        GL_ARB_shader_draw_parameters = ext.contains("GL_ARB_shader_draw_parameters");
        GL_ARB_shader_group_vote = ext.contains("GL_ARB_shader_group_vote");
        GL_ARB_shader_image_load_store = ext.contains("GL_ARB_shader_image_load_store") && checkExtension("GL_ARB_shader_image_load_store", ARBShaderImageLoadStore.isAvailable(this));
        GL_ARB_shader_image_size = ext.contains("GL_ARB_shader_image_size");
        GL_ARB_shader_objects = ext.contains("GL_ARB_shader_objects") && checkExtension("GL_ARB_shader_objects", ARBShaderObjects.isAvailable(this));
        GL_ARB_shader_precision = ext.contains("GL_ARB_shader_precision");
        GL_ARB_shader_stencil_export = ext.contains("GL_ARB_shader_stencil_export");
        GL_ARB_shader_storage_buffer_object = ext.contains("GL_ARB_shader_storage_buffer_object") && checkExtension("GL_ARB_shader_storage_buffer_object", ARBShaderStorageBufferObject.isAvailable(this));
        GL_ARB_shader_subroutine = ext.contains("GL_ARB_shader_subroutine") && checkExtension("GL_ARB_shader_subroutine", ARBShaderSubroutine.isAvailable(this));
        GL_ARB_shader_texture_image_samples = ext.contains("GL_ARB_shader_texture_image_samples");
        GL_ARB_shader_texture_lod = ext.contains("GL_ARB_shader_texture_lod");
        GL_ARB_shader_viewport_layer_array = ext.contains("GL_ARB_shader_viewport_layer_array");
        GL_ARB_shading_language_100 = ext.contains("GL_ARB_shading_language_100");
        GL_ARB_shading_language_420pack = ext.contains("GL_ARB_shading_language_420pack");
        GL_ARB_shading_language_include = ext.contains("GL_ARB_shading_language_include") && checkExtension("GL_ARB_shading_language_include", ARBShadingLanguageInclude.isAvailable(this));
        GL_ARB_shading_language_packing = ext.contains("GL_ARB_shading_language_packing");
        GL_ARB_shadow = ext.contains("GL_ARB_shadow");
        GL_ARB_shadow_ambient = ext.contains("GL_ARB_shadow_ambient");
        GL_ARB_sparse_buffer = ext.contains("GL_ARB_sparse_buffer") && checkExtension("GL_ARB_sparse_buffer", ARBSparseBuffer.isAvailable(this, ext));
        GL_ARB_sparse_texture = ext.contains("GL_ARB_sparse_texture") && checkExtension("GL_ARB_sparse_texture", ARBSparseTexture.isAvailable(this, ext));
        GL_ARB_sparse_texture2 = ext.contains("GL_ARB_sparse_texture2");
        GL_ARB_sparse_texture_clamp = ext.contains("GL_ARB_sparse_texture_clamp");
        GL_ARB_spirv_extensions = ext.contains("GL_ARB_spirv_extensions");
        GL_ARB_stencil_texturing = ext.contains("GL_ARB_stencil_texturing");
        GL_ARB_sync = ext.contains("GL_ARB_sync") && checkExtension("GL_ARB_sync", ARBSync.isAvailable(this));
        GL_ARB_tessellation_shader = ext.contains("GL_ARB_tessellation_shader") && checkExtension("GL_ARB_tessellation_shader", ARBTessellationShader.isAvailable(this));
        GL_ARB_texture_barrier = ext.contains("GL_ARB_texture_barrier") && checkExtension("GL_ARB_texture_barrier", ARBTextureBarrier.isAvailable(this));
        GL_ARB_texture_border_clamp = ext.contains("GL_ARB_texture_border_clamp");
        GL_ARB_texture_buffer_object = ext.contains("GL_ARB_texture_buffer_object") && checkExtension("GL_ARB_texture_buffer_object", ARBTextureBufferObject.isAvailable(this));
        GL_ARB_texture_buffer_object_rgb32 = ext.contains("GL_ARB_texture_buffer_object_rgb32");
        GL_ARB_texture_buffer_range = ext.contains("GL_ARB_texture_buffer_range") && checkExtension("GL_ARB_texture_buffer_range", ARBTextureBufferRange.isAvailable(this, ext));
        GL_ARB_texture_compression = ext.contains("GL_ARB_texture_compression") && checkExtension("GL_ARB_texture_compression", ARBTextureCompression.isAvailable(this));
        GL_ARB_texture_compression_bptc = ext.contains("GL_ARB_texture_compression_bptc");
        GL_ARB_texture_compression_rgtc = ext.contains("GL_ARB_texture_compression_rgtc");
        GL_ARB_texture_cube_map = ext.contains("GL_ARB_texture_cube_map");
        GL_ARB_texture_cube_map_array = ext.contains("GL_ARB_texture_cube_map_array");
        GL_ARB_texture_env_add = ext.contains("GL_ARB_texture_env_add");
        GL_ARB_texture_env_combine = ext.contains("GL_ARB_texture_env_combine");
        GL_ARB_texture_env_crossbar = ext.contains("GL_ARB_texture_env_crossbar");
        GL_ARB_texture_env_dot3 = ext.contains("GL_ARB_texture_env_dot3");
        GL_ARB_texture_filter_anisotropic = ext.contains("GL_ARB_texture_filter_anisotropic");
        GL_ARB_texture_filter_minmax = ext.contains("GL_ARB_texture_filter_minmax");
        GL_ARB_texture_float = ext.contains("GL_ARB_texture_float");
        GL_ARB_texture_gather = ext.contains("GL_ARB_texture_gather");
        GL_ARB_texture_mirror_clamp_to_edge = ext.contains("GL_ARB_texture_mirror_clamp_to_edge");
        GL_ARB_texture_mirrored_repeat = ext.contains("GL_ARB_texture_mirrored_repeat");
        GL_ARB_texture_multisample = ext.contains("GL_ARB_texture_multisample") && checkExtension("GL_ARB_texture_multisample", ARBTextureMultisample.isAvailable(this));
        GL_ARB_texture_non_power_of_two = ext.contains("GL_ARB_texture_non_power_of_two");
        GL_ARB_texture_query_levels = ext.contains("GL_ARB_texture_query_levels");
        GL_ARB_texture_query_lod = ext.contains("GL_ARB_texture_query_lod");
        GL_ARB_texture_rectangle = ext.contains("GL_ARB_texture_rectangle");
        GL_ARB_texture_rg = ext.contains("GL_ARB_texture_rg");
        GL_ARB_texture_rgb10_a2ui = ext.contains("GL_ARB_texture_rgb10_a2ui");
        GL_ARB_texture_stencil8 = ext.contains("GL_ARB_texture_stencil8");
        GL_ARB_texture_storage = ext.contains("GL_ARB_texture_storage") && checkExtension("GL_ARB_texture_storage", ARBTextureStorage.isAvailable(this, ext));
        GL_ARB_texture_storage_multisample = ext.contains("GL_ARB_texture_storage_multisample") && checkExtension("GL_ARB_texture_storage_multisample", ARBTextureStorageMultisample.isAvailable(this, ext));
        GL_ARB_texture_swizzle = ext.contains("GL_ARB_texture_swizzle");
        GL_ARB_texture_view = ext.contains("GL_ARB_texture_view") && checkExtension("GL_ARB_texture_view", ARBTextureView.isAvailable(this));
        GL_ARB_timer_query = ext.contains("GL_ARB_timer_query") && checkExtension("GL_ARB_timer_query", ARBTimerQuery.isAvailable(this));
        GL_ARB_transform_feedback2 = ext.contains("GL_ARB_transform_feedback2") && checkExtension("GL_ARB_transform_feedback2", ARBTransformFeedback2.isAvailable(this));
        GL_ARB_transform_feedback3 = ext.contains("GL_ARB_transform_feedback3") && checkExtension("GL_ARB_transform_feedback3", ARBTransformFeedback3.isAvailable(this));
        GL_ARB_transform_feedback_instanced = ext.contains("GL_ARB_transform_feedback_instanced") && checkExtension("GL_ARB_transform_feedback_instanced", ARBTransformFeedbackInstanced.isAvailable(this));
        GL_ARB_transform_feedback_overflow_query = ext.contains("GL_ARB_transform_feedback_overflow_query");
        GL_ARB_transpose_matrix = ext.contains("GL_ARB_transpose_matrix") && checkExtension("GL_ARB_transpose_matrix", ARBTransposeMatrix.isAvailable(this));
        GL_ARB_uniform_buffer_object = ext.contains("GL_ARB_uniform_buffer_object") && checkExtension("GL_ARB_uniform_buffer_object", ARBUniformBufferObject.isAvailable(this));
        GL_ARB_vertex_array_bgra = ext.contains("GL_ARB_vertex_array_bgra");
        GL_ARB_vertex_array_object = ext.contains("GL_ARB_vertex_array_object") && checkExtension("GL_ARB_vertex_array_object", ARBVertexArrayObject.isAvailable(this));
        GL_ARB_vertex_attrib_64bit = ext.contains("GL_ARB_vertex_attrib_64bit") && checkExtension("GL_ARB_vertex_attrib_64bit", ARBVertexAttrib64Bit.isAvailable(this, ext));
        GL_ARB_vertex_attrib_binding = ext.contains("GL_ARB_vertex_attrib_binding") && checkExtension("GL_ARB_vertex_attrib_binding", ARBVertexAttribBinding.isAvailable(this, ext));
        GL_ARB_vertex_blend = ext.contains("GL_ARB_vertex_blend") && checkExtension("GL_ARB_vertex_blend", ARBVertexBlend.isAvailable(this));
        GL_ARB_vertex_buffer_object = ext.contains("GL_ARB_vertex_buffer_object") && checkExtension("GL_ARB_vertex_buffer_object", ARBVertexBufferObject.isAvailable(this));
        GL_ARB_vertex_program = ext.contains("GL_ARB_vertex_program") && checkExtension("GL_ARB_vertex_program", ARBVertexProgram.isAvailable(this));
        GL_ARB_vertex_shader = ext.contains("GL_ARB_vertex_shader") && checkExtension("GL_ARB_vertex_shader", ARBVertexShader.isAvailable(this));
        GL_ARB_vertex_type_10f_11f_11f_rev = ext.contains("GL_ARB_vertex_type_10f_11f_11f_rev");
        GL_ARB_vertex_type_2_10_10_10_rev = ext.contains("GL_ARB_vertex_type_2_10_10_10_rev") && checkExtension("GL_ARB_vertex_type_2_10_10_10_rev", ARBVertexType2_10_10_10_REV.isAvailable(this, fc));
        GL_ARB_viewport_array = ext.contains("GL_ARB_viewport_array") && checkExtension("GL_ARB_viewport_array", ARBViewportArray.isAvailable(this));
        GL_ARB_window_pos = ext.contains("GL_ARB_window_pos") && checkExtension("GL_ARB_window_pos", ARBWindowPos.isAvailable(this));
        GL_ATI_meminfo = ext.contains("GL_ATI_meminfo");
        GL_ATI_shader_texture_lod = ext.contains("GL_ATI_shader_texture_lod");
        GL_ATI_texture_compression_3dc = ext.contains("GL_ATI_texture_compression_3dc");
        GL_EXT_422_pixels = ext.contains("GL_EXT_422_pixels");
        GL_EXT_abgr = ext.contains("GL_EXT_abgr");
        GL_EXT_bgra = ext.contains("GL_EXT_bgra");
        GL_EXT_bindable_uniform = ext.contains("GL_EXT_bindable_uniform") && checkExtension("GL_EXT_bindable_uniform", EXTBindableUniform.isAvailable(this));
        GL_EXT_blend_color = ext.contains("GL_EXT_blend_color") && checkExtension("GL_EXT_blend_color", EXTBlendColor.isAvailable(this));
        GL_EXT_blend_equation_separate = ext.contains("GL_EXT_blend_equation_separate") && checkExtension("GL_EXT_blend_equation_separate", EXTBlendEquationSeparate.isAvailable(this));
        GL_EXT_blend_func_separate = ext.contains("GL_EXT_blend_func_separate") && checkExtension("GL_EXT_blend_func_separate", EXTBlendFuncSeparate.isAvailable(this));
        GL_EXT_blend_minmax = ext.contains("GL_EXT_blend_minmax") && checkExtension("GL_EXT_blend_minmax", EXTBlendMinmax.isAvailable(this));
        GL_EXT_blend_subtract = ext.contains("GL_EXT_blend_subtract");
        GL_EXT_clip_volume_hint = ext.contains("GL_EXT_clip_volume_hint");
        GL_EXT_compiled_vertex_array = ext.contains("GL_EXT_compiled_vertex_array") && checkExtension("GL_EXT_compiled_vertex_array", EXTCompiledVertexArray.isAvailable(this));
        GL_EXT_debug_label = ext.contains("GL_EXT_debug_label") && checkExtension("GL_EXT_debug_label", EXTDebugLabel.isAvailable(this));
        GL_EXT_debug_marker = ext.contains("GL_EXT_debug_marker") && checkExtension("GL_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
        GL_EXT_depth_bounds_test = ext.contains("GL_EXT_depth_bounds_test") && checkExtension("GL_EXT_depth_bounds_test", EXTDepthBoundsTest.isAvailable(this));
        GL_EXT_direct_state_access = ext.contains("GL_EXT_direct_state_access") && checkExtension("GL_EXT_direct_state_access", EXTDirectStateAccess.isAvailable(this, ext));
        GL_EXT_draw_buffers2 = ext.contains("GL_EXT_draw_buffers2") && checkExtension("GL_EXT_draw_buffers2", EXTDrawBuffers2.isAvailable(this));
        GL_EXT_draw_instanced = ext.contains("GL_EXT_draw_instanced") && checkExtension("GL_EXT_draw_instanced", EXTDrawInstanced.isAvailable(this));
        GL_EXT_EGL_image_storage = ext.contains("GL_EXT_EGL_image_storage") && checkExtension("GL_EXT_EGL_image_storage", EXTEGLImageStorage.isAvailable(this, ext));
        GL_EXT_external_buffer = ext.contains("GL_EXT_external_buffer") && checkExtension("GL_EXT_external_buffer", EXTExternalBuffer.isAvailable(this, ext));
        GL_EXT_framebuffer_blit = ext.contains("GL_EXT_framebuffer_blit") && checkExtension("GL_EXT_framebuffer_blit", EXTFramebufferBlit.isAvailable(this));
        GL_EXT_framebuffer_multisample = ext.contains("GL_EXT_framebuffer_multisample") && checkExtension("GL_EXT_framebuffer_multisample", EXTFramebufferMultisample.isAvailable(this));
        GL_EXT_framebuffer_multisample_blit_scaled = ext.contains("GL_EXT_framebuffer_multisample_blit_scaled");
        GL_EXT_framebuffer_object = ext.contains("GL_EXT_framebuffer_object") && checkExtension("GL_EXT_framebuffer_object", EXTFramebufferObject.isAvailable(this));
        GL_EXT_framebuffer_sRGB = ext.contains("GL_EXT_framebuffer_sRGB");
        GL_EXT_geometry_shader4 = ext.contains("GL_EXT_geometry_shader4") && checkExtension("GL_EXT_geometry_shader4", EXTGeometryShader4.isAvailable(this));
        GL_EXT_gpu_program_parameters = ext.contains("GL_EXT_gpu_program_parameters") && checkExtension("GL_EXT_gpu_program_parameters", EXTGPUProgramParameters.isAvailable(this));
        GL_EXT_gpu_shader4 = ext.contains("GL_EXT_gpu_shader4") && checkExtension("GL_EXT_gpu_shader4", EXTGPUShader4.isAvailable(this));
        GL_EXT_memory_object = ext.contains("GL_EXT_memory_object") && checkExtension("GL_EXT_memory_object", EXTMemoryObject.isAvailable(this, ext));
        GL_EXT_memory_object_fd = ext.contains("GL_EXT_memory_object_fd") && checkExtension("GL_EXT_memory_object_fd", EXTMemoryObjectFD.isAvailable(this));
        GL_EXT_memory_object_win32 = ext.contains("GL_EXT_memory_object_win32") && checkExtension("GL_EXT_memory_object_win32", EXTMemoryObjectWin32.isAvailable(this));
        GL_EXT_packed_depth_stencil = ext.contains("GL_EXT_packed_depth_stencil");
        GL_EXT_packed_float = ext.contains("GL_EXT_packed_float");
        GL_EXT_pixel_buffer_object = ext.contains("GL_EXT_pixel_buffer_object");
        GL_EXT_point_parameters = ext.contains("GL_EXT_point_parameters") && checkExtension("GL_EXT_point_parameters", EXTPointParameters.isAvailable(this));
        GL_EXT_polygon_offset_clamp = ext.contains("GL_EXT_polygon_offset_clamp") && checkExtension("GL_EXT_polygon_offset_clamp", EXTPolygonOffsetClamp.isAvailable(this));
        GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
        GL_EXT_provoking_vertex = ext.contains("GL_EXT_provoking_vertex") && checkExtension("GL_EXT_provoking_vertex", EXTProvokingVertex.isAvailable(this));
        GL_EXT_raster_multisample = ext.contains("GL_EXT_raster_multisample") && checkExtension("GL_EXT_raster_multisample", EXTRasterMultisample.isAvailable(this));
        GL_EXT_secondary_color = ext.contains("GL_EXT_secondary_color") && checkExtension("GL_EXT_secondary_color", EXTSecondaryColor.isAvailable(this));
        GL_EXT_semaphore = ext.contains("GL_EXT_semaphore") && checkExtension("GL_EXT_semaphore", EXTSemaphore.isAvailable(this));
        GL_EXT_semaphore_fd = ext.contains("GL_EXT_semaphore_fd") && checkExtension("GL_EXT_semaphore_fd", EXTSemaphoreFD.isAvailable(this));
        GL_EXT_semaphore_win32 = ext.contains("GL_EXT_semaphore_win32") && checkExtension("GL_EXT_semaphore_win32", EXTSemaphoreWin32.isAvailable(this));
        GL_EXT_separate_shader_objects = ext.contains("GL_EXT_separate_shader_objects") && checkExtension("GL_EXT_separate_shader_objects", EXTSeparateShaderObjects.isAvailable(this));
        GL_EXT_shader_framebuffer_fetch = ext.contains("GL_EXT_shader_framebuffer_fetch");
        GL_EXT_shader_framebuffer_fetch_non_coherent = ext.contains("GL_EXT_shader_framebuffer_fetch_non_coherent") && checkExtension("GL_EXT_shader_framebuffer_fetch_non_coherent", EXTShaderFramebufferFetchNonCoherent.isAvailable(this));
        GL_EXT_shader_image_load_formatted = ext.contains("GL_EXT_shader_image_load_formatted");
        GL_EXT_shader_image_load_store = ext.contains("GL_EXT_shader_image_load_store") && checkExtension("GL_EXT_shader_image_load_store", EXTShaderImageLoadStore.isAvailable(this));
        GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
        GL_EXT_shadow_funcs = ext.contains("GL_EXT_shadow_funcs");
        GL_EXT_shared_texture_palette = ext.contains("GL_EXT_shared_texture_palette");
        GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
        GL_EXT_stencil_clear_tag = ext.contains("GL_EXT_stencil_clear_tag") && checkExtension("GL_EXT_stencil_clear_tag", EXTStencilClearTag.isAvailable(this));
        GL_EXT_stencil_two_side = ext.contains("GL_EXT_stencil_two_side") && checkExtension("GL_EXT_stencil_two_side", EXTStencilTwoSide.isAvailable(this));
        GL_EXT_stencil_wrap = ext.contains("GL_EXT_stencil_wrap");
        GL_EXT_texture_array = ext.contains("GL_EXT_texture_array") && checkExtension("GL_EXT_texture_array", EXTTextureArray.isAvailable(this));
        GL_EXT_texture_buffer_object = ext.contains("GL_EXT_texture_buffer_object") && checkExtension("GL_EXT_texture_buffer_object", EXTTextureBufferObject.isAvailable(this));
        GL_EXT_texture_compression_latc = ext.contains("GL_EXT_texture_compression_latc");
        GL_EXT_texture_compression_rgtc = ext.contains("GL_EXT_texture_compression_rgtc");
        GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
        GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
        GL_EXT_texture_filter_minmax = ext.contains("GL_EXT_texture_filter_minmax");
        GL_EXT_texture_integer = ext.contains("GL_EXT_texture_integer") && checkExtension("GL_EXT_texture_integer", EXTTextureInteger.isAvailable(this));
        GL_EXT_texture_mirror_clamp = ext.contains("GL_EXT_texture_mirror_clamp");
        GL_EXT_texture_shared_exponent = ext.contains("GL_EXT_texture_shared_exponent");
        GL_EXT_texture_snorm = ext.contains("GL_EXT_texture_snorm");
        GL_EXT_texture_sRGB = ext.contains("GL_EXT_texture_sRGB");
        GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
        GL_EXT_texture_swizzle = ext.contains("GL_EXT_texture_swizzle");
        GL_EXT_timer_query = ext.contains("GL_EXT_timer_query") && checkExtension("GL_EXT_timer_query", EXTTimerQuery.isAvailable(this));
        GL_EXT_transform_feedback = ext.contains("GL_EXT_transform_feedback") && checkExtension("GL_EXT_transform_feedback", EXTTransformFeedback.isAvailable(this));
        GL_EXT_vertex_array_bgra = ext.contains("GL_EXT_vertex_array_bgra");
        GL_EXT_vertex_attrib_64bit = ext.contains("GL_EXT_vertex_attrib_64bit") && checkExtension("GL_EXT_vertex_attrib_64bit", EXTVertexAttrib64bit.isAvailable(this, ext));
        GL_EXT_win32_keyed_mutex = ext.contains("GL_EXT_win32_keyed_mutex") && checkExtension("GL_EXT_win32_keyed_mutex", EXTWin32KeyedMutex.isAvailable(this));
        GL_EXT_window_rectangles = ext.contains("GL_EXT_window_rectangles") && checkExtension("GL_EXT_window_rectangles", EXTWindowRectangles.isAvailable(this));
        GL_EXT_x11_sync_object = ext.contains("GL_EXT_x11_sync_object") && checkExtension("GL_EXT_x11_sync_object", EXTX11SyncObject.isAvailable(this));
        GL_GREMEDY_frame_terminator = ext.contains("GL_GREMEDY_frame_terminator") && checkExtension("GL_GREMEDY_frame_terminator", GREMEDYFrameTerminator.isAvailable(this));
        GL_GREMEDY_string_marker = ext.contains("GL_GREMEDY_string_marker") && checkExtension("GL_GREMEDY_string_marker", GREMEDYStringMarker.isAvailable(this));
        GL_INTEL_blackhole_render = ext.contains("GL_INTEL_blackhole_render");
        GL_INTEL_conservative_rasterization = ext.contains("GL_INTEL_conservative_rasterization");
        GL_INTEL_fragment_shader_ordering = ext.contains("GL_INTEL_fragment_shader_ordering");
        GL_INTEL_framebuffer_CMAA = ext.contains("GL_INTEL_framebuffer_CMAA") && checkExtension("GL_INTEL_framebuffer_CMAA", INTELFramebufferCMAA.isAvailable(this));
        GL_INTEL_map_texture = ext.contains("GL_INTEL_map_texture") && checkExtension("GL_INTEL_map_texture", INTELMapTexture.isAvailable(this));
        GL_INTEL_performance_query = ext.contains("GL_INTEL_performance_query") && checkExtension("GL_INTEL_performance_query", INTELPerformanceQuery.isAvailable(this));
        GL_KHR_blend_equation_advanced = ext.contains("GL_KHR_blend_equation_advanced") && checkExtension("GL_KHR_blend_equation_advanced", KHRBlendEquationAdvanced.isAvailable(this));
        GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
        GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
        GL_KHR_debug = ext.contains("GL_KHR_debug") && checkExtension("GL_KHR_debug", KHRDebug.isAvailable(this));
        GL_KHR_no_error = ext.contains("GL_KHR_no_error");
        GL_KHR_parallel_shader_compile = ext.contains("GL_KHR_parallel_shader_compile") && checkExtension("GL_KHR_parallel_shader_compile", KHRParallelShaderCompile.isAvailable(this));
        GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
        GL_KHR_robustness = ext.contains("GL_KHR_robustness") && checkExtension("GL_KHR_robustness", KHRRobustness.isAvailable(this));
        GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
        GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
        GL_KHR_texture_compression_astc_sliced_3d = ext.contains("GL_KHR_texture_compression_astc_sliced_3d");
        GL_NV_alpha_to_coverage_dither_control = ext.contains("GL_NV_alpha_to_coverage_dither_control") && checkExtension("GL_NV_alpha_to_coverage_dither_control", NVAlphaToCoverageDitherControl.isAvailable(this));
        GL_NV_bindless_multi_draw_indirect = ext.contains("GL_NV_bindless_multi_draw_indirect") && checkExtension("GL_NV_bindless_multi_draw_indirect", NVBindlessMultiDrawIndirect.isAvailable(this));
        GL_NV_bindless_multi_draw_indirect_count = ext.contains("GL_NV_bindless_multi_draw_indirect_count") && checkExtension("GL_NV_bindless_multi_draw_indirect_count", NVBindlessMultiDrawIndirectCount.isAvailable(this));
        GL_NV_bindless_texture = ext.contains("GL_NV_bindless_texture") && checkExtension("GL_NV_bindless_texture", NVBindlessTexture.isAvailable(this));
        GL_NV_blend_equation_advanced = ext.contains("GL_NV_blend_equation_advanced") && checkExtension("GL_NV_blend_equation_advanced", NVBlendEquationAdvanced.isAvailable(this));
        GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
        GL_NV_blend_minmax_factor = ext.contains("GL_NV_blend_minmax_factor");
        GL_NV_blend_square = ext.contains("GL_NV_blend_square");
        GL_NV_clip_space_w_scaling = ext.contains("GL_NV_clip_space_w_scaling") && checkExtension("GL_NV_clip_space_w_scaling", NVClipSpaceWScaling.isAvailable(this));
        GL_NV_command_list = ext.contains("GL_NV_command_list") && checkExtension("GL_NV_command_list", NVCommandList.isAvailable(this));
        GL_NV_conditional_render = ext.contains("GL_NV_conditional_render") && checkExtension("GL_NV_conditional_render", NVConditionalRender.isAvailable(this));
        GL_NV_conservative_raster = ext.contains("GL_NV_conservative_raster") && checkExtension("GL_NV_conservative_raster", NVConservativeRaster.isAvailable(this));
        GL_NV_conservative_raster_dilate = ext.contains("GL_NV_conservative_raster_dilate") && checkExtension("GL_NV_conservative_raster_dilate", NVConservativeRasterDilate.isAvailable(this));
        GL_NV_conservative_raster_pre_snap = ext.contains("GL_NV_conservative_raster_pre_snap");
        GL_NV_conservative_raster_pre_snap_triangles = ext.contains("GL_NV_conservative_raster_pre_snap_triangles") && checkExtension("GL_NV_conservative_raster_pre_snap_triangles", NVConservativeRasterPreSnapTriangles.isAvailable(this));
        GL_NV_conservative_raster_underestimation = ext.contains("GL_NV_conservative_raster_underestimation");
        GL_NV_copy_depth_to_color = ext.contains("GL_NV_copy_depth_to_color");
        GL_NV_copy_image = ext.contains("GL_NV_copy_image") && checkExtension("GL_NV_copy_image", NVCopyImage.isAvailable(this));
        GL_NV_deep_texture3D = ext.contains("GL_NV_deep_texture3D");
        GL_NV_depth_buffer_float = ext.contains("GL_NV_depth_buffer_float") && checkExtension("GL_NV_depth_buffer_float", NVDepthBufferFloat.isAvailable(this));
        GL_NV_depth_clamp = ext.contains("GL_NV_depth_clamp");
        GL_NV_draw_texture = ext.contains("GL_NV_draw_texture") && checkExtension("GL_NV_draw_texture", NVDrawTexture.isAvailable(this));
        GL_NV_draw_vulkan_image = ext.contains("GL_NV_draw_vulkan_image") && checkExtension("GL_NV_draw_vulkan_image", NVDrawVulkanImage.isAvailable(this));
        GL_NV_ES3_1_compatibility = ext.contains("GL_NV_ES3_1_compatibility");
        GL_NV_explicit_multisample = ext.contains("GL_NV_explicit_multisample") && checkExtension("GL_NV_explicit_multisample", NVExplicitMultisample.isAvailable(this));
        GL_NV_fence = ext.contains("GL_NV_fence") && checkExtension("GL_NV_fence", NVFence.isAvailable(this));
        GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
        GL_NV_float_buffer = ext.contains("GL_NV_float_buffer");
        GL_NV_fog_distance = ext.contains("GL_NV_fog_distance");
        GL_NV_fragment_coverage_to_color = ext.contains("GL_NV_fragment_coverage_to_color") && checkExtension("GL_NV_fragment_coverage_to_color", NVFragmentCoverageToColor.isAvailable(this));
        GL_NV_fragment_program4 = ext.contains("GL_NV_fragment_program4");
        GL_NV_fragment_program_option = ext.contains("GL_NV_fragment_program_option");
        GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
        GL_NV_framebuffer_mixed_samples = ext.contains("GL_NV_framebuffer_mixed_samples") && checkExtension("GL_NV_framebuffer_mixed_samples", NVFramebufferMixedSamples.isAvailable(this));
        GL_NV_framebuffer_multisample_coverage = ext.contains("GL_NV_framebuffer_multisample_coverage") && checkExtension("GL_NV_framebuffer_multisample_coverage", NVFramebufferMultisampleCoverage.isAvailable(this));
        GL_NV_geometry_shader4 = ext.contains("GL_NV_geometry_shader4");
        GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
        GL_NV_gpu_multicast = ext.contains("GL_NV_gpu_multicast") && checkExtension("GL_NV_gpu_multicast", NVGPUMulticast.isAvailable(this));
        GL_NV_gpu_shader5 = ext.contains("GL_NV_gpu_shader5") && checkExtension("GL_NV_gpu_shader5", NVGPUShader5.isAvailable(this, ext));
        GL_NV_half_float = ext.contains("GL_NV_half_float") && checkExtension("GL_NV_half_float", NVHalfFloat.isAvailable(this, ext));
        GL_NV_internalformat_sample_query = ext.contains("GL_NV_internalformat_sample_query") && checkExtension("GL_NV_internalformat_sample_query", NVInternalformatSampleQuery.isAvailable(this));
        GL_NV_light_max_exponent = ext.contains("GL_NV_light_max_exponent");
        GL_NV_multisample_coverage = ext.contains("GL_NV_multisample_coverage");
        GL_NV_multisample_filter_hint = ext.contains("GL_NV_multisample_filter_hint");
        GL_NV_packed_depth_stencil = ext.contains("GL_NV_packed_depth_stencil");
        GL_NV_path_rendering = ext.contains("GL_NV_path_rendering") && checkExtension("GL_NV_path_rendering", NVPathRendering.isAvailable(this));
        GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
        GL_NV_pixel_data_range = ext.contains("GL_NV_pixel_data_range") && checkExtension("GL_NV_pixel_data_range", NVPixelDataRange.isAvailable(this));
        GL_NV_point_sprite = ext.contains("GL_NV_point_sprite") && checkExtension("GL_NV_point_sprite", NVPointSprite.isAvailable(this));
        GL_NV_primitive_restart = ext.contains("GL_NV_primitive_restart") && checkExtension("GL_NV_primitive_restart", NVPrimitiveRestart.isAvailable(this));
        GL_NV_query_resource = ext.contains("GL_NV_query_resource") && checkExtension("GL_NV_query_resource", NVQueryResource.isAvailable(this));
        GL_NV_query_resource_tag = ext.contains("GL_NV_query_resource_tag") && checkExtension("GL_NV_query_resource_tag", NVQueryResourceTag.isAvailable(this));
        GL_NV_robustness_video_memory_purge = ext.contains("GL_NV_robustness_video_memory_purge");
        GL_NV_sample_locations = ext.contains("GL_NV_sample_locations") && checkExtension("GL_NV_sample_locations", NVSampleLocations.isAvailable(this));
        GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
        GL_NV_shader_atomic_float = ext.contains("GL_NV_shader_atomic_float");
        GL_NV_shader_atomic_float64 = ext.contains("GL_NV_shader_atomic_float64");
        GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
        GL_NV_shader_atomic_int64 = ext.contains("GL_NV_shader_atomic_int64");
        GL_NV_shader_buffer_load = ext.contains("GL_NV_shader_buffer_load") && checkExtension("GL_NV_shader_buffer_load", NVShaderBufferLoad.isAvailable(this));
        GL_NV_shader_buffer_store = ext.contains("GL_NV_shader_buffer_store");
        GL_NV_shader_thread_group = ext.contains("GL_NV_shader_thread_group");
        GL_NV_shader_thread_shuffle = ext.contains("GL_NV_shader_thread_shuffle");
        GL_NV_stereo_view_rendering = ext.contains("GL_NV_stereo_view_rendering");
        GL_NV_texgen_reflection = ext.contains("GL_NV_texgen_reflection");
        GL_NV_texture_barrier = ext.contains("GL_NV_texture_barrier") && checkExtension("GL_NV_texture_barrier", NVTextureBarrier.isAvailable(this));
        GL_NV_texture_compression_vtc = ext.contains("GL_NV_texture_compression_vtc");
        GL_NV_texture_multisample = ext.contains("GL_NV_texture_multisample") && checkExtension("GL_NV_texture_multisample", NVTextureMultisample.isAvailable(this));
        GL_NV_texture_rectangle_compressed = ext.contains("GL_NV_texture_rectangle_compressed");
        GL_NV_transform_feedback = ext.contains("GL_NV_transform_feedback") && checkExtension("GL_NV_transform_feedback", NVTransformFeedback.isAvailable(this));
        GL_NV_transform_feedback2 = ext.contains("GL_NV_transform_feedback2") && checkExtension("GL_NV_transform_feedback2", NVTransformFeedback2.isAvailable(this));
        GL_NV_uniform_buffer_unified_memory = ext.contains("GL_NV_uniform_buffer_unified_memory");
        GL_NV_vertex_array_range = ext.contains("GL_NV_vertex_array_range") && checkExtension("GL_NV_vertex_array_range", NVVertexArrayRange.isAvailable(this));
        GL_NV_vertex_array_range2 = ext.contains("GL_NV_vertex_array_range2");
        GL_NV_vertex_attrib_integer_64bit = ext.contains("GL_NV_vertex_attrib_integer_64bit") && checkExtension("GL_NV_vertex_attrib_integer_64bit", NVVertexAttribInteger64bit.isAvailable(this, ext));
        GL_NV_vertex_buffer_unified_memory = ext.contains("GL_NV_vertex_buffer_unified_memory") && checkExtension("GL_NV_vertex_buffer_unified_memory", NVVertexBufferUnifiedMemory.isAvailable(this));
        GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
        GL_NV_viewport_swizzle = ext.contains("GL_NV_viewport_swizzle") && checkExtension("GL_NV_viewport_swizzle", NVViewportSwizzle.isAvailable(this));
        GL_NVX_blend_equation_advanced_multi_draw_buffers = ext.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
        GL_NVX_conditional_render = ext.contains("GL_NVX_conditional_render") && checkExtension("GL_NVX_conditional_render", NVXConditionalRender.isAvailable(this));
        GL_NVX_gpu_memory_info = ext.contains("GL_NVX_gpu_memory_info");
        GL_OVR_multiview = ext.contains("GL_OVR_multiview") && checkExtension("GL_OVR_multiview", OVRMultiview.isAvailable(this, ext));
        GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
    }

    boolean hasDSA(Set<String> ext) {
        return ext.contains("GL45") || ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

    private static long getFunctionAddress(boolean fc, FunctionProvider provider, String functionName) {
        return fc ? NULL : provider.getFunctionAddress(functionName);
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[GL] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}