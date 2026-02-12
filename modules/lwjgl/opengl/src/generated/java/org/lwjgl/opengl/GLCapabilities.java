/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;
import java.util.Set;
import org.lwjgl.*;
import java.util.function.IntFunction;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class GLCapabilities {

    static final int ADDRESS_BUFFER_SIZE = 2270;

    // GL11
    public final long
        glEnable,
        glDisable,
        glAccum,
        glAlphaFunc,
        glAreTexturesResident,
        glArrayElement,
        glBegin,
        glBindTexture,
        glBitmap,
        glBlendFunc,
        glCallList,
        glCallLists,
        glClear,
        glClearAccum,
        glClearColor,
        glClearDepth,
        glClearIndex,
        glClearStencil,
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
        glColorMask,
        glColorMaterial,
        glColorPointer,
        glCopyPixels,
        glCullFace,
        glDeleteLists,
        glDepthFunc,
        glDepthMask,
        glDepthRange,
        glDisableClientState,
        glDrawArrays,
        glDrawBuffer,
        glDrawElements,
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
        glFinish,
        glFlush,
        glFogi,
        glFogiv,
        glFogf,
        glFogfv,
        glFrontFace,
        glGenLists,
        glGenTextures,
        glDeleteTextures,
        glGetClipPlane,
        glGetBooleanv,
        glGetFloatv,
        glGetIntegerv,
        glGetDoublev,
        glGetError,
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
        glGetPointerv,
        glGetPolygonStipple,
        glGetString,
        glGetTexEnviv,
        glGetTexEnvfv,
        glGetTexGeniv,
        glGetTexGenfv,
        glGetTexGendv,
        glGetTexImage,
        glGetTexLevelParameteriv,
        glGetTexLevelParameterfv,
        glGetTexParameteriv,
        glGetTexParameterfv,
        glHint,
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
        glIsEnabled,
        glIsList,
        glIsTexture,
        glLightModeli,
        glLightModelf,
        glLightModeliv,
        glLightModelfv,
        glLighti,
        glLightf,
        glLightiv,
        glLightfv,
        glLineStipple,
        glLineWidth,
        glListBase,
        glLoadMatrixf,
        glLoadMatrixd,
        glLoadIdentity,
        glLoadName,
        glLogicOp,
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
        glPixelStorei,
        glPixelStoref,
        glPixelTransferi,
        glPixelTransferf,
        glPixelZoom,
        glPointSize,
        glPolygonMode,
        glPolygonOffset,
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
        glReadBuffer,
        glReadPixels,
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
        glScissor,
        glSelectBuffer,
        glShadeModel,
        glStencilFunc,
        glStencilMask,
        glStencilOp,
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
        glViewport;

    // GL12
    public final long
        glTexImage3D,
        glTexSubImage3D,
        glCopyTexSubImage3D,
        glDrawRangeElements;

    // GL13
    public final long
        glCompressedTexImage3D,
        glCompressedTexImage2D,
        glCompressedTexImage1D,
        glCompressedTexSubImage3D,
        glCompressedTexSubImage2D,
        glCompressedTexSubImage1D,
        glGetCompressedTexImage,
        glSampleCoverage,
        glActiveTexture,
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
        glMultTransposeMatrixd;

    // GL14
    public final long
        glBlendColor,
        glBlendEquation,
        glFogCoordf,
        glFogCoordd,
        glFogCoordfv,
        glFogCoorddv,
        glFogCoordPointer,
        glMultiDrawArrays,
        glMultiDrawElements,
        glPointParameterf,
        glPointParameteri,
        glPointParameterfv,
        glPointParameteriv,
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
        glBlendFuncSeparate,
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
        glWindowPos3dv;

    // GL15
    public final long
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
        glGetQueryObjectuiv;

    // GL20
    public final long
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
        glStencilMaskSeparate;

    // GL21
    public final long
        glUniformMatrix2x3fv,
        glUniformMatrix3x2fv,
        glUniformMatrix2x4fv,
        glUniformMatrix4x2fv,
        glUniformMatrix3x4fv,
        glUniformMatrix4x3fv;

    // GL30
    public final long
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
        glIsVertexArray;

    // GL31
    public final long
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
        glUniformBlockBinding;

    // GL32
    public final long
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
        glGetSynciv;

    // GL33
    public final long
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
        glVertexAttribP1ui,
        glVertexAttribP2ui,
        glVertexAttribP3ui,
        glVertexAttribP4ui,
        glVertexAttribP1uiv,
        glVertexAttribP2uiv,
        glVertexAttribP3uiv,
        glVertexAttribP4uiv;

    // GL40
    public final long
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
        glGetQueryIndexediv;

    // GL41
    public final long
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
        glGetDoublei_v;

    // GL42
    public final long
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
        glGetInternalformativ;

    // GL43
    public final long
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
        glVertexBindingDivisor;

    // GL44
    public final long
        glBufferStorage,
        glClearTexSubImage,
        glClearTexImage,
        glBindBuffersBase,
        glBindBuffersRange,
        glBindTextures,
        glBindSamplers,
        glBindImageTextures,
        glBindVertexBuffers;

    // GL45
    public final long
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
        glGetnMapdv,
        glGetnMapfv,
        glGetnMapiv,
        glGetnPixelMapfv,
        glGetnPixelMapuiv,
        glGetnPixelMapusv,
        glGetnPolygonStipple,
        glGetnTexImage,
        glReadnPixels,
        glGetnColorTable,
        glGetnConvolutionFilter,
        glGetnSeparableFilter,
        glGetnHistogram,
        glGetnMinmax,
        glGetnCompressedTexImage,
        glGetnUniformfv,
        glGetnUniformdv,
        glGetnUniformiv,
        glGetnUniformuiv;

    // GL46
    public final long
        glMultiDrawArraysIndirectCount,
        glMultiDrawElementsIndirectCount,
        glPolygonOffsetClamp,
        glSpecializeShader;

    // AMD_debug_output
    public final long
        glDebugMessageEnableAMD,
        glDebugMessageInsertAMD,
        glDebugMessageCallbackAMD,
        glGetDebugMessageLogAMD;

    // AMD_draw_buffers_blend
    public final long
        glBlendFuncIndexedAMD,
        glBlendFuncSeparateIndexedAMD,
        glBlendEquationIndexedAMD,
        glBlendEquationSeparateIndexedAMD;

    // AMD_framebuffer_multisample_advanced
    public final long
        glRenderbufferStorageMultisampleAdvancedAMD,
        glNamedRenderbufferStorageMultisampleAdvancedAMD;

    // AMD_gpu_shader_int64
    public final long
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
        glGetUniformui64vNV,
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
        glProgramUniform4ui64vNV;

    // AMD_interleaved_elements
    public final long
        glVertexAttribParameteriAMD;

    // AMD_occlusion_query_event
    public final long
        glQueryObjectParameteruiAMD;

    // AMD_performance_monitor
    public final long
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
        glGetPerfMonitorCounterDataAMD;

    // AMD_sample_positions
    public final long
        glSetMultisamplefvAMD;

    // AMD_sparse_texture
    public final long
        glTexStorageSparseAMD,
        glTextureStorageSparseAMD;

    // AMD_stencil_operation_extended
    public final long
        glStencilOpValueAMD;

    // AMD_vertex_shader_tessellator
    public final long
        glTessellationFactorAMD,
        glTessellationModeAMD;

    // APPLE_element_array
    public final long
        glElementPointerAPPLE,
        glDrawElementArrayAPPLE,
        glDrawRangeElementArrayAPPLE,
        glMultiDrawElementArrayAPPLE,
        glMultiDrawRangeElementArrayAPPLE;

    // APPLE_fence
    public final long
        glGenFencesAPPLE,
        glDeleteFencesAPPLE,
        glSetFenceAPPLE,
        glIsFenceAPPLE,
        glTestFenceAPPLE,
        glFinishFenceAPPLE,
        glTestObjectAPPLE,
        glFinishObjectAPPLE;

    // APPLE_flush_buffer_range
    public final long
        glBufferParameteriAPPLE,
        glFlushMappedBufferRangeAPPLE;

    // APPLE_object_purgeable
    public final long
        glObjectPurgeableAPPLE,
        glObjectUnpurgeableAPPLE,
        glGetObjectParameterivAPPLE;

    // APPLE_texture_range
    public final long
        glTextureRangeAPPLE,
        glGetTexParameterPointervAPPLE;

    // APPLE_vertex_array_object
    public final long
        glBindVertexArrayAPPLE,
        glDeleteVertexArraysAPPLE,
        glGenVertexArraysAPPLE,
        glIsVertexArrayAPPLE;

    // APPLE_vertex_array_range
    public final long
        glVertexArrayRangeAPPLE,
        glFlushVertexArrayRangeAPPLE,
        glVertexArrayParameteriAPPLE;

    // APPLE_vertex_program_evaluators
    public final long
        glEnableVertexAttribAPPLE,
        glDisableVertexAttribAPPLE,
        glIsVertexAttribEnabledAPPLE,
        glMapVertexAttrib1dAPPLE,
        glMapVertexAttrib1fAPPLE,
        glMapVertexAttrib2dAPPLE,
        glMapVertexAttrib2fAPPLE;

    // ARB_bindless_texture
    public final long
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
        glGetVertexAttribLui64vARB;

    // ARB_buffer_storage
    public final long
        glNamedBufferStorageEXT;

    // ARB_cl_event
    public final long
        glCreateSyncFromCLeventARB;

    // ARB_clear_buffer_object
    public final long
        glClearNamedBufferDataEXT,
        glClearNamedBufferSubDataEXT;

    // ARB_color_buffer_float
    public final long
        glClampColorARB;

    // ARB_compute_variable_group_size
    public final long
        glDispatchComputeGroupSizeARB;

    // ARB_debug_output
    public final long
        glDebugMessageControlARB,
        glDebugMessageInsertARB,
        glDebugMessageCallbackARB,
        glGetDebugMessageLogARB;

    // ARB_draw_buffers
    public final long
        glDrawBuffersARB;

    // ARB_draw_buffers_blend
    public final long
        glBlendEquationiARB,
        glBlendEquationSeparateiARB,
        glBlendFunciARB,
        glBlendFuncSeparateiARB;

    // ARB_draw_instanced
    public final long
        glDrawArraysInstancedARB,
        glDrawElementsInstancedARB;

    // ARB_ES3_2_compatibility
    public final long
        glPrimitiveBoundingBoxARB;

    // ARB_framebuffer_no_attachments
    public final long
        glNamedFramebufferParameteriEXT,
        glGetNamedFramebufferParameterivEXT;

    // ARB_geometry_shader4
    public final long
        glProgramParameteriARB,
        glFramebufferTextureARB,
        glFramebufferTextureLayerARB,
        glFramebufferTextureFaceARB;

    // ARB_gl_spirv
    public final long
        glSpecializeShaderARB;

    // ARB_gpu_shader_fp64
    public final long
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
        glProgramUniformMatrix4x3dvEXT;

    // ARB_gpu_shader_int64
    public final long
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
        glGetnUniformui64vARB;

    // ARB_imaging
    public final long
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
        glGetMinmaxParameterfv;

    // ARB_indirect_parameters
    public final long
        glMultiDrawArraysIndirectCountARB,
        glMultiDrawElementsIndirectCountARB;

    // ARB_instanced_arrays
    public final long
        glVertexAttribDivisorARB,
        glVertexArrayVertexAttribDivisorEXT;

    // ARB_matrix_palette
    public final long
        glCurrentPaletteMatrixARB,
        glMatrixIndexuivARB,
        glMatrixIndexubvARB,
        glMatrixIndexusvARB,
        glMatrixIndexPointerARB;

    // ARB_multisample
    public final long
        glSampleCoverageARB;

    // ARB_multitexture
    public final long
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
        glMultiTexCoord4dvARB;

    // ARB_occlusion_query
    public final long
        glGenQueriesARB,
        glDeleteQueriesARB,
        glIsQueryARB,
        glBeginQueryARB,
        glEndQueryARB,
        glGetQueryivARB,
        glGetQueryObjectivARB,
        glGetQueryObjectuivARB;

    // ARB_parallel_shader_compile
    public final long
        glMaxShaderCompilerThreadsARB;

    // ARB_point_parameters
    public final long
        glPointParameterfARB,
        glPointParameterfvARB;

    // ARB_robustness
    public final long
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
        glGetnUniformdvARB;

    // ARB_sample_locations
    public final long
        glFramebufferSampleLocationsfvARB,
        glNamedFramebufferSampleLocationsfvARB,
        glEvaluateDepthValuesARB;

    // ARB_sample_shading
    public final long
        glMinSampleShadingARB;

    // ARB_shader_objects
    public final long
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
        glGetShaderSourceARB;

    // ARB_shading_language_include
    public final long
        glNamedStringARB,
        glDeleteNamedStringARB,
        glCompileShaderIncludeARB,
        glIsNamedStringARB,
        glGetNamedStringARB,
        glGetNamedStringivARB;

    // ARB_sparse_buffer
    public final long
        glBufferPageCommitmentARB,
        glNamedBufferPageCommitmentEXT,
        glNamedBufferPageCommitmentARB;

    // ARB_sparse_texture
    public final long
        glTexPageCommitmentARB,
        glTexturePageCommitmentEXT;

    // ARB_texture_buffer_object
    public final long
        glTexBufferARB;

    // ARB_texture_buffer_range
    public final long
        glTextureBufferRangeEXT;

    // ARB_texture_compression
    public final long
        glCompressedTexImage3DARB,
        glCompressedTexImage2DARB,
        glCompressedTexImage1DARB,
        glCompressedTexSubImage3DARB,
        glCompressedTexSubImage2DARB,
        glCompressedTexSubImage1DARB,
        glGetCompressedTexImageARB;

    // ARB_texture_storage
    public final long
        glTextureStorage1DEXT,
        glTextureStorage2DEXT,
        glTextureStorage3DEXT;

    // ARB_texture_storage_multisample
    public final long
        glTextureStorage2DMultisampleEXT,
        glTextureStorage3DMultisampleEXT;

    // ARB_transpose_matrix
    public final long
        glLoadTransposeMatrixfARB,
        glLoadTransposeMatrixdARB,
        glMultTransposeMatrixfARB,
        glMultTransposeMatrixdARB;

    // ARB_vertex_attrib_64bit
    public final long
        glVertexArrayVertexAttribLOffsetEXT;

    // ARB_vertex_attrib_binding
    public final long
        glVertexArrayBindVertexBufferEXT,
        glVertexArrayVertexAttribFormatEXT,
        glVertexArrayVertexAttribIFormatEXT,
        glVertexArrayVertexAttribLFormatEXT,
        glVertexArrayVertexAttribBindingEXT,
        glVertexArrayVertexBindingDivisorEXT;

    // ARB_vertex_blend
    public final long
        glWeightfvARB,
        glWeightbvARB,
        glWeightubvARB,
        glWeightsvARB,
        glWeightusvARB,
        glWeightivARB,
        glWeightuivARB,
        glWeightdvARB,
        glWeightPointerARB,
        glVertexBlendARB;

    // ARB_vertex_buffer_object
    public final long
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
        glGetBufferPointervARB;

    // ARB_vertex_program
    public final long
        glVertexAttrib1sARB,
        glVertexAttrib1fARB,
        glVertexAttrib1dARB,
        glVertexAttrib2sARB,
        glVertexAttrib2fARB,
        glVertexAttrib2dARB,
        glVertexAttrib3sARB,
        glVertexAttrib3fARB,
        glVertexAttrib3dARB,
        glVertexAttrib4sARB,
        glVertexAttrib4fARB,
        glVertexAttrib4dARB,
        glVertexAttrib4NubARB,
        glVertexAttrib1svARB,
        glVertexAttrib1fvARB,
        glVertexAttrib1dvARB,
        glVertexAttrib2svARB,
        glVertexAttrib2fvARB,
        glVertexAttrib2dvARB,
        glVertexAttrib3svARB,
        glVertexAttrib3fvARB,
        glVertexAttrib3dvARB,
        glVertexAttrib4fvARB,
        glVertexAttrib4bvARB,
        glVertexAttrib4svARB,
        glVertexAttrib4ivARB,
        glVertexAttrib4ubvARB,
        glVertexAttrib4usvARB,
        glVertexAttrib4uivARB,
        glVertexAttrib4dvARB,
        glVertexAttrib4NbvARB,
        glVertexAttrib4NsvARB,
        glVertexAttrib4NivARB,
        glVertexAttrib4NubvARB,
        glVertexAttrib4NusvARB,
        glVertexAttrib4NuivARB,
        glVertexAttribPointerARB,
        glEnableVertexAttribArrayARB,
        glDisableVertexAttribArrayARB,
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
        glGetVertexAttribfvARB,
        glGetVertexAttribdvARB,
        glGetVertexAttribivARB,
        glGetVertexAttribPointervARB,
        glIsProgramARB;

    // ARB_vertex_shader
    public final long
        glBindAttribLocationARB,
        glGetActiveAttribARB,
        glGetAttribLocationARB;

    // ARB_window_pos
    public final long
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
        glWindowPos3dvARB;

    // EXT_bindable_uniform
    public final long
        glUniformBufferEXT,
        glGetUniformBufferSizeEXT,
        glGetUniformOffsetEXT;

    // EXT_blend_color
    public final long
        glBlendColorEXT;

    // EXT_blend_equation_separate
    public final long
        glBlendEquationSeparateEXT;

    // EXT_blend_func_separate
    public final long
        glBlendFuncSeparateEXT;

    // EXT_blend_minmax
    public final long
        glBlendEquationEXT;

    // EXT_compiled_vertex_array
    public final long
        glLockArraysEXT,
        glUnlockArraysEXT;

    // EXT_debug_label
    public final long
        glLabelObjectEXT,
        glGetObjectLabelEXT;

    // EXT_debug_marker
    public final long
        glInsertEventMarkerEXT,
        glPushGroupMarkerEXT,
        glPopGroupMarkerEXT;

    // EXT_depth_bounds_test
    public final long
        glDepthBoundsEXT;

    // EXT_direct_state_access
    public final long
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
        glEnableIndexedEXT,
        glDisableIndexedEXT,
        glIsEnabledIndexedEXT,
        glGetIntegerIndexedvEXT,
        glGetBooleanIndexedvEXT,
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
        glFlushMappedNamedBufferRangeEXT;

    // EXT_draw_buffers2
    public final long
        glColorMaskIndexedEXT;

    // EXT_draw_instanced
    public final long
        glDrawArraysInstancedEXT,
        glDrawElementsInstancedEXT;

    // EXT_EGL_image_storage
    public final long
        glEGLImageTargetTexStorageEXT,
        glEGLImageTargetTextureStorageEXT;

    // EXT_external_buffer
    public final long
        glBufferStorageExternalEXT,
        glNamedBufferStorageExternalEXT;

    // EXT_fragment_shading_rate
    public final long
        glShadingRateEXT,
        glShadingRateCombinerOpsEXT,
        glFramebufferShadingRateEXT,
        glGetFragmentShadingRatesEXT;

    // EXT_framebuffer_blit
    public final long
        glBlitFramebufferEXT;

    // EXT_framebuffer_blit_layers
    public final long
        glBlitFramebufferLayersEXT,
        glBlitFramebufferLayerEXT;

    // EXT_framebuffer_multisample
    public final long
        glRenderbufferStorageMultisampleEXT;

    // EXT_framebuffer_object
    public final long
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
        glGenerateMipmapEXT;

    // EXT_geometry_shader4
    public final long
        glProgramParameteriEXT,
        glFramebufferTextureEXT,
        glFramebufferTextureLayerEXT,
        glFramebufferTextureFaceEXT;

    // EXT_gpu_program_parameters
    public final long
        glProgramEnvParameters4fvEXT,
        glProgramLocalParameters4fvEXT;

    // EXT_gpu_shader4
    public final long
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
        glUniform4uivEXT;

    // EXT_memory_object
    public final long
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
        glTextureStorageMem1DEXT;

    // EXT_memory_object_fd
    public final long
        glImportMemoryFdEXT;

    // EXT_memory_object_win32
    public final long
        glImportMemoryWin32HandleEXT,
        glImportMemoryWin32NameEXT;

    // EXT_mesh_shader
    public final long
        glDrawMeshTasksEXT,
        glDrawMeshTasksIndirectEXT,
        glMultiDrawMeshTasksIndirectEXT,
        glMultiDrawMeshTasksIndirectCountEXT;

    // EXT_point_parameters
    public final long
        glPointParameterfEXT,
        glPointParameterfvEXT;

    // EXT_polygon_offset_clamp
    public final long
        glPolygonOffsetClampEXT;

    // EXT_provoking_vertex
    public final long
        glProvokingVertexEXT;

    // EXT_raster_multisample
    public final long
        glRasterSamplesEXT;

    // EXT_secondary_color
    public final long
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
        glSecondaryColorPointerEXT;

    // EXT_semaphore
    public final long
        glGenSemaphoresEXT,
        glDeleteSemaphoresEXT,
        glIsSemaphoreEXT,
        glSemaphoreParameterui64vEXT,
        glGetSemaphoreParameterui64vEXT,
        glWaitSemaphoreEXT,
        glSignalSemaphoreEXT;

    // EXT_semaphore_fd
    public final long
        glImportSemaphoreFdEXT;

    // EXT_semaphore_win32
    public final long
        glImportSemaphoreWin32HandleEXT,
        glImportSemaphoreWin32NameEXT;

    // EXT_separate_shader_objects
    public final long
        glUseShaderProgramEXT,
        glActiveProgramEXT,
        glCreateShaderProgramEXT;

    // EXT_shader_framebuffer_fetch_non_coherent
    public final long
        glFramebufferFetchBarrierEXT;

    // EXT_shader_image_load_store
    public final long
        glBindImageTextureEXT,
        glMemoryBarrierEXT;

    // EXT_stencil_clear_tag
    public final long
        glStencilClearTagEXT;

    // EXT_stencil_two_side
    public final long
        glActiveStencilFaceEXT;

    // EXT_texture_buffer_object
    public final long
        glTexBufferEXT;

    // EXT_texture_integer
    public final long
        glClearColorIiEXT,
        glClearColorIuiEXT,
        glTexParameterIivEXT,
        glTexParameterIuivEXT,
        glGetTexParameterIivEXT,
        glGetTexParameterIuivEXT;

    // EXT_texture_storage
    public final long
        glTexStorage1DEXT,
        glTexStorage2DEXT,
        glTexStorage3DEXT;

    // EXT_timer_query
    public final long
        glGetQueryObjecti64vEXT,
        glGetQueryObjectui64vEXT;

    // EXT_transform_feedback
    public final long
        glBindBufferRangeEXT,
        glBindBufferOffsetEXT,
        glBindBufferBaseEXT,
        glBeginTransformFeedbackEXT,
        glEndTransformFeedbackEXT,
        glTransformFeedbackVaryingsEXT,
        glGetTransformFeedbackVaryingEXT;

    // EXT_vertex_attrib_64bit
    public final long
        glVertexAttribL1dEXT,
        glVertexAttribL2dEXT,
        glVertexAttribL3dEXT,
        glVertexAttribL4dEXT,
        glVertexAttribL1dvEXT,
        glVertexAttribL2dvEXT,
        glVertexAttribL3dvEXT,
        glVertexAttribL4dvEXT,
        glVertexAttribLPointerEXT,
        glGetVertexAttribLdvEXT;

    // EXT_win32_keyed_mutex
    public final long
        glAcquireKeyedMutexWin32EXT,
        glReleaseKeyedMutexWin32EXT;

    // EXT_window_rectangles
    public final long
        glWindowRectanglesEXT;

    // EXT_x11_sync_object
    public final long
        glImportSyncEXT;

    // GREMEDY_frame_terminator
    public final long
        glFrameTerminatorGREMEDY;

    // GREMEDY_string_marker
    public final long
        glStringMarkerGREMEDY;

    // INTEL_framebuffer_CMAA
    public final long
        glApplyFramebufferAttachmentCMAAINTEL;

    // INTEL_map_texture
    public final long
        glSyncTextureINTEL,
        glUnmapTexture2DINTEL,
        glMapTexture2DINTEL;

    // INTEL_performance_query
    public final long
        glBeginPerfQueryINTEL,
        glCreatePerfQueryINTEL,
        glDeletePerfQueryINTEL,
        glEndPerfQueryINTEL,
        glGetFirstPerfQueryIdINTEL,
        glGetNextPerfQueryIdINTEL,
        glGetPerfCounterInfoINTEL,
        glGetPerfQueryDataINTEL,
        glGetPerfQueryIdByNameINTEL,
        glGetPerfQueryInfoINTEL;

    // KHR_blend_equation_advanced
    public final long
        glBlendBarrierKHR;

    // KHR_parallel_shader_compile
    public final long
        glMaxShaderCompilerThreadsKHR;

    // MESA_framebuffer_flip_y
    public final long
        glFramebufferParameteriMESA,
        glGetFramebufferParameterivMESA;

    // NV_alpha_to_coverage_dither_control
    public final long
        glAlphaToCoverageDitherControlNV;

    // NV_bindless_multi_draw_indirect
    public final long
        glMultiDrawArraysIndirectBindlessNV,
        glMultiDrawElementsIndirectBindlessNV;

    // NV_bindless_multi_draw_indirect_count
    public final long
        glMultiDrawArraysIndirectBindlessCountNV,
        glMultiDrawElementsIndirectBindlessCountNV;

    // NV_bindless_texture
    public final long
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
        glIsImageHandleResidentNV;

    // NV_blend_equation_advanced
    public final long
        glBlendParameteriNV,
        glBlendBarrierNV;

    // NV_clip_space_w_scaling
    public final long
        glViewportPositionWScaleNV;

    // NV_command_list
    public final long
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
        glCallCommandListNV;

    // NV_conditional_render
    public final long
        glBeginConditionalRenderNV,
        glEndConditionalRenderNV;

    // NV_conservative_raster
    public final long
        glSubpixelPrecisionBiasNV;

    // NV_conservative_raster_dilate
    public final long
        glConservativeRasterParameterfNV;

    // NV_conservative_raster_pre_snap_triangles
    public final long
        glConservativeRasterParameteriNV;

    // NV_copy_image
    public final long
        glCopyImageSubDataNV;

    // NV_depth_buffer_float
    public final long
        glDepthRangedNV,
        glClearDepthdNV,
        glDepthBoundsdNV;

    // NV_draw_texture
    public final long
        glDrawTextureNV;

    // NV_draw_vulkan_image
    public final long
        glDrawVkImageNV,
        glGetVkProcAddrNV,
        glWaitVkSemaphoreNV,
        glSignalVkSemaphoreNV,
        glSignalVkFenceNV;

    // NV_explicit_multisample
    public final long
        glGetMultisamplefvNV,
        glSampleMaskIndexedNV,
        glTexRenderbufferNV;

    // NV_fence
    public final long
        glDeleteFencesNV,
        glGenFencesNV,
        glIsFenceNV,
        glTestFenceNV,
        glGetFenceivNV,
        glFinishFenceNV,
        glSetFenceNV;

    // NV_fragment_coverage_to_color
    public final long
        glFragmentCoverageColorNV;

    // NV_framebuffer_mixed_samples
    public final long
        glCoverageModulationTableNV,
        glGetCoverageModulationTableNV,
        glCoverageModulationNV;

    // NV_framebuffer_multisample_coverage
    public final long
        glRenderbufferStorageMultisampleCoverageNV;

    // NV_gpu_multicast
    public final long
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
        glMulticastGetQueryObjectui64vNV;

    // NV_half_float
    public final long
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
        glVertexAttribs4hvNV;

    // NV_internalformat_sample_query
    public final long
        glGetInternalformatSampleivNV;

    // NV_memory_attachment
    public final long
        glGetMemoryObjectDetachedResourcesuivNV,
        glResetMemoryObjectParameterNV,
        glTexAttachMemoryNV,
        glBufferAttachMemoryNV,
        glTextureAttachMemoryNV,
        glNamedBufferAttachMemoryNV;

    // NV_memory_object_sparse
    public final long
        glBufferPageCommitmentMemNV,
        glNamedBufferPageCommitmentMemNV,
        glTexPageCommitmentMemNV,
        glTexturePageCommitmentMemNV;

    // NV_mesh_shader
    public final long
        glDrawMeshTasksNV,
        glDrawMeshTasksIndirectNV,
        glMultiDrawMeshTasksIndirectNV,
        glMultiDrawMeshTasksIndirectCountNV;

    // NV_path_rendering
    public final long
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
        glGetProgramResourcefvNV;

    // NV_pixel_data_range
    public final long
        glPixelDataRangeNV,
        glFlushPixelDataRangeNV;

    // NV_point_sprite
    public final long
        glPointParameteriNV,
        glPointParameterivNV;

    // NV_primitive_restart
    public final long
        glPrimitiveRestartNV,
        glPrimitiveRestartIndexNV;

    // NV_query_resource
    public final long
        glQueryResourceNV;

    // NV_query_resource_tag
    public final long
        glGenQueryResourceTagNV,
        glDeleteQueryResourceTagNV,
        glQueryResourceTagNV;

    // NV_sample_locations
    public final long
        glFramebufferSampleLocationsfvNV,
        glNamedFramebufferSampleLocationsfvNV,
        glResolveDepthValuesNV;

    // NV_scissor_exclusive
    public final long
        glScissorExclusiveArrayvNV,
        glScissorExclusiveNV;

    // NV_shader_buffer_load
    public final long
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
        glProgramUniformui64NV,
        glProgramUniformui64vNV;

    // NV_shading_rate_image
    public final long
        glBindShadingRateImageNV,
        glShadingRateImagePaletteNV,
        glGetShadingRateImagePaletteNV,
        glShadingRateImageBarrierNV,
        glShadingRateSampleOrderNV,
        glShadingRateSampleOrderCustomNV,
        glGetShadingRateSampleLocationivNV;

    // NV_texture_barrier
    public final long
        glTextureBarrierNV;

    // NV_texture_multisample
    public final long
        glTexImage2DMultisampleCoverageNV,
        glTexImage3DMultisampleCoverageNV,
        glTextureImage2DMultisampleNV,
        glTextureImage3DMultisampleNV,
        glTextureImage2DMultisampleCoverageNV,
        glTextureImage3DMultisampleCoverageNV;

    // NV_timeline_semaphore
    public final long
        glCreateSemaphoresNV,
        glSemaphoreParameterivNV,
        glGetSemaphoreParameterivNV;

    // NV_transform_feedback
    public final long
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
        glTransformFeedbackStreamAttribsNV;

    // NV_transform_feedback2
    public final long
        glBindTransformFeedbackNV,
        glDeleteTransformFeedbacksNV,
        glGenTransformFeedbacksNV,
        glIsTransformFeedbackNV,
        glPauseTransformFeedbackNV,
        glResumeTransformFeedbackNV,
        glDrawTransformFeedbackNV;

    // NV_vertex_array_range
    public final long
        glVertexArrayRangeNV,
        glFlushVertexArrayRangeNV;

    // NV_vertex_attrib_integer_64bit
    public final long
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
        glVertexAttribLFormatNV;

    // NV_vertex_buffer_unified_memory
    public final long
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
        glGetIntegerui64i_vNV;

    // NV_viewport_swizzle
    public final long
        glViewportSwizzleNV;

    // NVX_conditional_render
    public final long
        glBeginConditionalRenderNVX,
        glEndConditionalRenderNVX;

    // NVX_gpu_multicast2
    public final long
        glAsyncCopyImageSubDataNVX,
        glAsyncCopyBufferSubDataNVX,
        glUploadGpuMaskNVX,
        glMulticastViewportArrayvNVX,
        glMulticastScissorArrayvNVX,
        glMulticastViewportPositionWScaleNVX;

    // NVX_progress_fence
    public final long
        glCreateProgressFenceNVX,
        glSignalSemaphoreui64NVX,
        glWaitSemaphoreui64NVX,
        glClientWaitSemaphoreui64NVX;

    // OVR_multiview
    public final long
        glFramebufferTextureMultiviewOVR,
        glNamedFramebufferTextureMultiviewOVR;

    /** When true, {@code GL11} is supported. */
    public final boolean OpenGL11;
    /** When true, {@code GL12} is supported. */
    public final boolean OpenGL12;
    /** When true, {@code GL13} is supported. */
    public final boolean OpenGL13;
    /** When true, {@code GL14} is supported. */
    public final boolean OpenGL14;
    /** When true, {@code GL15} is supported. */
    public final boolean OpenGL15;
    /** When true, {@code GL20} is supported. */
    public final boolean OpenGL20;
    /** When true, {@code GL21} is supported. */
    public final boolean OpenGL21;
    /** When true, {@code GL30} is supported. */
    public final boolean OpenGL30;
    /** When true, {@code GL31} is supported. */
    public final boolean OpenGL31;
    /** When true, {@code GL32} is supported. */
    public final boolean OpenGL32;
    /** When true, {@code GL33} is supported. */
    public final boolean OpenGL33;
    /** When true, {@code GL40} is supported. */
    public final boolean OpenGL40;
    /** When true, {@code GL41} is supported. */
    public final boolean OpenGL41;
    /** When true, {@code GL42} is supported. */
    public final boolean OpenGL42;
    /** When true, {@code GL43} is supported. */
    public final boolean OpenGL43;
    /** When true, {@code GL44} is supported. */
    public final boolean OpenGL44;
    /** When true, {@code GL45} is supported. */
    public final boolean OpenGL45;
    /** When true, {@code GL46} is supported. */
    public final boolean OpenGL46;
    /** When true, {@code 3DFX_texture_compression_FXT1} is supported. */
    public final boolean GL_3DFX_texture_compression_FXT1;
    /** When true, {@code AMD_blend_minmax_factor} is supported. */
    public final boolean GL_AMD_blend_minmax_factor;
    /** When true, {@code AMD_conservative_depth} is supported. */
    public final boolean GL_AMD_conservative_depth;
    /** When true, {@code AMD_debug_output} is supported. */
    public final boolean GL_AMD_debug_output;
    /** When true, {@code AMD_depth_clamp_separate} is supported. */
    public final boolean GL_AMD_depth_clamp_separate;
    /** When true, {@code AMD_draw_buffers_blend} is supported. */
    public final boolean GL_AMD_draw_buffers_blend;
    /** When true, {@code AMD_framebuffer_multisample_advanced} is supported. */
    public final boolean GL_AMD_framebuffer_multisample_advanced;
    /** When true, {@code AMD_gcn_shader} is supported. */
    public final boolean GL_AMD_gcn_shader;
    /** When true, {@code AMD_gpu_shader_half_float} is supported. */
    public final boolean GL_AMD_gpu_shader_half_float;
    /** When true, {@code AMD_gpu_shader_half_float_fetch} is supported. */
    public final boolean GL_AMD_gpu_shader_half_float_fetch;
    /** When true, {@code AMD_gpu_shader_int16} is supported. */
    public final boolean GL_AMD_gpu_shader_int16;
    /** When true, {@code AMD_gpu_shader_int64} is supported. */
    public final boolean GL_AMD_gpu_shader_int64;
    /** When true, {@code AMD_interleaved_elements} is supported. */
    public final boolean GL_AMD_interleaved_elements;
    /** When true, {@code AMD_occlusion_query_event} is supported. */
    public final boolean GL_AMD_occlusion_query_event;
    /** When true, {@code AMD_performance_monitor} is supported. */
    public final boolean GL_AMD_performance_monitor;
    /** When true, {@code AMD_pinned_memory} is supported. */
    public final boolean GL_AMD_pinned_memory;
    /** When true, {@code AMD_query_buffer_object} is supported. */
    public final boolean GL_AMD_query_buffer_object;
    /** When true, {@code AMD_sample_positions} is supported. */
    public final boolean GL_AMD_sample_positions;
    /** When true, {@code AMD_seamless_cubemap_per_texture} is supported. */
    public final boolean GL_AMD_seamless_cubemap_per_texture;
    /** When true, {@code AMD_shader_atomic_counter_ops} is supported. */
    public final boolean GL_AMD_shader_atomic_counter_ops;
    /** When true, {@code AMD_shader_ballot} is supported. */
    public final boolean GL_AMD_shader_ballot;
    /** When true, {@code AMD_shader_explicit_vertex_parameter} is supported. */
    public final boolean GL_AMD_shader_explicit_vertex_parameter;
    /** When true, {@code AMD_shader_image_load_store_lod} is supported. */
    public final boolean GL_AMD_shader_image_load_store_lod;
    /** When true, {@code AMD_shader_stencil_export} is supported. */
    public final boolean GL_AMD_shader_stencil_export;
    /** When true, {@code AMD_shader_trinary_minmax} is supported. */
    public final boolean GL_AMD_shader_trinary_minmax;
    /** When true, {@code AMD_sparse_texture} is supported. */
    public final boolean GL_AMD_sparse_texture;
    /** When true, {@code AMD_stencil_operation_extended} is supported. */
    public final boolean GL_AMD_stencil_operation_extended;
    /** When true, {@code AMD_texture_gather_bias_lod} is supported. */
    public final boolean GL_AMD_texture_gather_bias_lod;
    /** When true, {@code AMD_texture_texture4} is supported. */
    public final boolean GL_AMD_texture_texture4;
    /** When true, {@code AMD_transform_feedback3_lines_triangles} is supported. */
    public final boolean GL_AMD_transform_feedback3_lines_triangles;
    /** When true, {@code AMD_transform_feedback4} is supported. */
    public final boolean GL_AMD_transform_feedback4;
    /** When true, {@code AMD_vertex_shader_layer} is supported. */
    public final boolean GL_AMD_vertex_shader_layer;
    /** When true, {@code AMD_vertex_shader_tessellator} is supported. */
    public final boolean GL_AMD_vertex_shader_tessellator;
    /** When true, {@code AMD_vertex_shader_viewport_index} is supported. */
    public final boolean GL_AMD_vertex_shader_viewport_index;
    /** When true, {@code APPLE_aux_depth_stencil} is supported. */
    public final boolean GL_APPLE_aux_depth_stencil;
    /** When true, {@code APPLE_client_storage} is supported. */
    public final boolean GL_APPLE_client_storage;
    /** When true, {@code APPLE_element_array} is supported. */
    public final boolean GL_APPLE_element_array;
    /** When true, {@code APPLE_fence} is supported. */
    public final boolean GL_APPLE_fence;
    /** When true, {@code APPLE_float_pixels} is supported. */
    public final boolean GL_APPLE_float_pixels;
    /** When true, {@code APPLE_flush_buffer_range} is supported. */
    public final boolean GL_APPLE_flush_buffer_range;
    /** When true, {@code APPLE_object_purgeable} is supported. */
    public final boolean GL_APPLE_object_purgeable;
    /** When true, {@code APPLE_rgb_422} is supported. */
    public final boolean GL_APPLE_rgb_422;
    /** When true, {@code APPLE_row_bytes} is supported. */
    public final boolean GL_APPLE_row_bytes;
    /** When true, {@code APPLE_texture_range} is supported. */
    public final boolean GL_APPLE_texture_range;
    /** When true, {@code APPLE_vertex_array_object} is supported. */
    public final boolean GL_APPLE_vertex_array_object;
    /** When true, {@code APPLE_vertex_array_range} is supported. */
    public final boolean GL_APPLE_vertex_array_range;
    /** When true, {@code APPLE_vertex_program_evaluators} is supported. */
    public final boolean GL_APPLE_vertex_program_evaluators;
    /** When true, {@code APPLE_ycbcr_422} is supported. */
    public final boolean GL_APPLE_ycbcr_422;
    /** When true, {@code ARB_arrays_of_arrays} is supported. */
    public final boolean GL_ARB_arrays_of_arrays;
    /** When true, {@code ARB_base_instance} is supported. */
    public final boolean GL_ARB_base_instance;
    /** When true, {@code ARB_bindless_texture} is supported. */
    public final boolean GL_ARB_bindless_texture;
    /** When true, {@code ARB_blend_func_extended} is supported. */
    public final boolean GL_ARB_blend_func_extended;
    /** When true, {@code ARB_buffer_storage} is supported. */
    public final boolean GL_ARB_buffer_storage;
    /** When true, {@code ARB_cl_event} is supported. */
    public final boolean GL_ARB_cl_event;
    /** When true, {@code ARB_clear_buffer_object} is supported. */
    public final boolean GL_ARB_clear_buffer_object;
    /** When true, {@code ARB_clear_texture} is supported. */
    public final boolean GL_ARB_clear_texture;
    /** When true, {@code ARB_clip_control} is supported. */
    public final boolean GL_ARB_clip_control;
    /** When true, {@code ARB_color_buffer_float} is supported. */
    public final boolean GL_ARB_color_buffer_float;
    /** When true, {@code ARB_compatibility} is supported. */
    public final boolean GL_ARB_compatibility;
    /** When true, {@code ARB_compressed_texture_pixel_storage} is supported. */
    public final boolean GL_ARB_compressed_texture_pixel_storage;
    /** When true, {@code ARB_compute_shader} is supported. */
    public final boolean GL_ARB_compute_shader;
    /** When true, {@code ARB_compute_variable_group_size} is supported. */
    public final boolean GL_ARB_compute_variable_group_size;
    /** When true, {@code ARB_conditional_render_inverted} is supported. */
    public final boolean GL_ARB_conditional_render_inverted;
    /** When true, {@code ARB_conservative_depth} is supported. */
    public final boolean GL_ARB_conservative_depth;
    /** When true, {@code ARB_copy_buffer} is supported. */
    public final boolean GL_ARB_copy_buffer;
    /** When true, {@code ARB_copy_image} is supported. */
    public final boolean GL_ARB_copy_image;
    /** When true, {@code ARB_cull_distance} is supported. */
    public final boolean GL_ARB_cull_distance;
    /** When true, {@code ARB_debug_output} is supported. */
    public final boolean GL_ARB_debug_output;
    /** When true, {@code ARB_depth_buffer_float} is supported. */
    public final boolean GL_ARB_depth_buffer_float;
    /** When true, {@code ARB_depth_clamp} is supported. */
    public final boolean GL_ARB_depth_clamp;
    /** When true, {@code ARB_depth_texture} is supported. */
    public final boolean GL_ARB_depth_texture;
    /** When true, {@code ARB_derivative_control} is supported. */
    public final boolean GL_ARB_derivative_control;
    /** When true, {@code ARB_direct_state_access} is supported. */
    public final boolean GL_ARB_direct_state_access;
    /** When true, {@code ARB_draw_buffers} is supported. */
    public final boolean GL_ARB_draw_buffers;
    /** When true, {@code ARB_draw_buffers_blend} is supported. */
    public final boolean GL_ARB_draw_buffers_blend;
    /** When true, {@code ARB_draw_elements_base_vertex} is supported. */
    public final boolean GL_ARB_draw_elements_base_vertex;
    /** When true, {@code ARB_draw_indirect} is supported. */
    public final boolean GL_ARB_draw_indirect;
    /** When true, {@code ARB_draw_instanced} is supported. */
    public final boolean GL_ARB_draw_instanced;
    /** When true, {@code ARB_enhanced_layouts} is supported. */
    public final boolean GL_ARB_enhanced_layouts;
    /** When true, {@code ARB_ES2_compatibility} is supported. */
    public final boolean GL_ARB_ES2_compatibility;
    /** When true, {@code ARB_ES3_1_compatibility} is supported. */
    public final boolean GL_ARB_ES3_1_compatibility;
    /** When true, {@code ARB_ES3_2_compatibility} is supported. */
    public final boolean GL_ARB_ES3_2_compatibility;
    /** When true, {@code ARB_ES3_compatibility} is supported. */
    public final boolean GL_ARB_ES3_compatibility;
    /** When true, {@code ARB_explicit_attrib_location} is supported. */
    public final boolean GL_ARB_explicit_attrib_location;
    /** When true, {@code ARB_explicit_uniform_location} is supported. */
    public final boolean GL_ARB_explicit_uniform_location;
    /** When true, {@code ARB_fragment_coord_conventions} is supported. */
    public final boolean GL_ARB_fragment_coord_conventions;
    /** When true, {@code ARB_fragment_layer_viewport} is supported. */
    public final boolean GL_ARB_fragment_layer_viewport;
    /** When true, {@code ARB_fragment_program} is supported. */
    public final boolean GL_ARB_fragment_program;
    /** When true, {@code ARB_fragment_program_shadow} is supported. */
    public final boolean GL_ARB_fragment_program_shadow;
    /** When true, {@code ARB_fragment_shader} is supported. */
    public final boolean GL_ARB_fragment_shader;
    /** When true, {@code ARB_fragment_shader_interlock} is supported. */
    public final boolean GL_ARB_fragment_shader_interlock;
    /** When true, {@code ARB_framebuffer_no_attachments} is supported. */
    public final boolean GL_ARB_framebuffer_no_attachments;
    /** When true, {@code ARB_framebuffer_object} is supported. */
    public final boolean GL_ARB_framebuffer_object;
    /** When true, {@code ARB_framebuffer_sRGB} is supported. */
    public final boolean GL_ARB_framebuffer_sRGB;
    /** When true, {@code ARB_geometry_shader4} is supported. */
    public final boolean GL_ARB_geometry_shader4;
    /** When true, {@code ARB_get_program_binary} is supported. */
    public final boolean GL_ARB_get_program_binary;
    /** When true, {@code ARB_get_texture_sub_image} is supported. */
    public final boolean GL_ARB_get_texture_sub_image;
    /** When true, {@code ARB_gl_spirv} is supported. */
    public final boolean GL_ARB_gl_spirv;
    /** When true, {@code ARB_gpu_shader5} is supported. */
    public final boolean GL_ARB_gpu_shader5;
    /** When true, {@code ARB_gpu_shader_fp64} is supported. */
    public final boolean GL_ARB_gpu_shader_fp64;
    /** When true, {@code ARB_gpu_shader_int64} is supported. */
    public final boolean GL_ARB_gpu_shader_int64;
    /** When true, {@code ARB_half_float_pixel} is supported. */
    public final boolean GL_ARB_half_float_pixel;
    /** When true, {@code ARB_half_float_vertex} is supported. */
    public final boolean GL_ARB_half_float_vertex;
    /** When true, {@code ARB_imaging} is supported. */
    public final boolean GL_ARB_imaging;
    /** When true, {@code ARB_indirect_parameters} is supported. */
    public final boolean GL_ARB_indirect_parameters;
    /** When true, {@code ARB_instanced_arrays} is supported. */
    public final boolean GL_ARB_instanced_arrays;
    /** When true, {@code ARB_internalformat_query} is supported. */
    public final boolean GL_ARB_internalformat_query;
    /** When true, {@code ARB_internalformat_query2} is supported. */
    public final boolean GL_ARB_internalformat_query2;
    /** When true, {@code ARB_invalidate_subdata} is supported. */
    public final boolean GL_ARB_invalidate_subdata;
    /** When true, {@code ARB_map_buffer_alignment} is supported. */
    public final boolean GL_ARB_map_buffer_alignment;
    /** When true, {@code ARB_map_buffer_range} is supported. */
    public final boolean GL_ARB_map_buffer_range;
    /** When true, {@code ARB_matrix_palette} is supported. */
    public final boolean GL_ARB_matrix_palette;
    /** When true, {@code ARB_multi_bind} is supported. */
    public final boolean GL_ARB_multi_bind;
    /** When true, {@code ARB_multi_draw_indirect} is supported. */
    public final boolean GL_ARB_multi_draw_indirect;
    /** When true, {@code ARB_multisample} is supported. */
    public final boolean GL_ARB_multisample;
    /** When true, {@code ARB_multitexture} is supported. */
    public final boolean GL_ARB_multitexture;
    /** When true, {@code ARB_occlusion_query} is supported. */
    public final boolean GL_ARB_occlusion_query;
    /** When true, {@code ARB_occlusion_query2} is supported. */
    public final boolean GL_ARB_occlusion_query2;
    /** When true, {@code ARB_parallel_shader_compile} is supported. */
    public final boolean GL_ARB_parallel_shader_compile;
    /** When true, {@code ARB_pipeline_statistics_query} is supported. */
    public final boolean GL_ARB_pipeline_statistics_query;
    /** When true, {@code ARB_pixel_buffer_object} is supported. */
    public final boolean GL_ARB_pixel_buffer_object;
    /** When true, {@code ARB_point_parameters} is supported. */
    public final boolean GL_ARB_point_parameters;
    /** When true, {@code ARB_point_sprite} is supported. */
    public final boolean GL_ARB_point_sprite;
    /** When true, {@code ARB_polygon_offset_clamp} is supported. */
    public final boolean GL_ARB_polygon_offset_clamp;
    /** When true, {@code ARB_post_depth_coverage} is supported. */
    public final boolean GL_ARB_post_depth_coverage;
    /** When true, {@code ARB_program_interface_query} is supported. */
    public final boolean GL_ARB_program_interface_query;
    /** When true, {@code ARB_provoking_vertex} is supported. */
    public final boolean GL_ARB_provoking_vertex;
    /** When true, {@code ARB_query_buffer_object} is supported. */
    public final boolean GL_ARB_query_buffer_object;
    /** When true, {@code ARB_robust_buffer_access_behavior} is supported. */
    public final boolean GL_ARB_robust_buffer_access_behavior;
    /** When true, {@code ARB_robustness} is supported. */
    public final boolean GL_ARB_robustness;
    /** When true, {@code ARB_robustness_application_isolation} is supported. */
    public final boolean GL_ARB_robustness_application_isolation;
    /** When true, {@code ARB_robustness_share_group_isolation} is supported. */
    public final boolean GL_ARB_robustness_share_group_isolation;
    /** When true, {@code ARB_sample_locations} is supported. */
    public final boolean GL_ARB_sample_locations;
    /** When true, {@code ARB_sample_shading} is supported. */
    public final boolean GL_ARB_sample_shading;
    /** When true, {@code ARB_sampler_objects} is supported. */
    public final boolean GL_ARB_sampler_objects;
    /** When true, {@code ARB_seamless_cube_map} is supported. */
    public final boolean GL_ARB_seamless_cube_map;
    /** When true, {@code ARB_seamless_cubemap_per_texture} is supported. */
    public final boolean GL_ARB_seamless_cubemap_per_texture;
    /** When true, {@code ARB_separate_shader_objects} is supported. */
    public final boolean GL_ARB_separate_shader_objects;
    /** When true, {@code ARB_shader_atomic_counter_ops} is supported. */
    public final boolean GL_ARB_shader_atomic_counter_ops;
    /** When true, {@code ARB_shader_atomic_counters} is supported. */
    public final boolean GL_ARB_shader_atomic_counters;
    /** When true, {@code ARB_shader_ballot} is supported. */
    public final boolean GL_ARB_shader_ballot;
    /** When true, {@code ARB_shader_bit_encoding} is supported. */
    public final boolean GL_ARB_shader_bit_encoding;
    /** When true, {@code ARB_shader_clock} is supported. */
    public final boolean GL_ARB_shader_clock;
    /** When true, {@code ARB_shader_draw_parameters} is supported. */
    public final boolean GL_ARB_shader_draw_parameters;
    /** When true, {@code ARB_shader_group_vote} is supported. */
    public final boolean GL_ARB_shader_group_vote;
    /** When true, {@code ARB_shader_image_load_store} is supported. */
    public final boolean GL_ARB_shader_image_load_store;
    /** When true, {@code ARB_shader_image_size} is supported. */
    public final boolean GL_ARB_shader_image_size;
    /** When true, {@code ARB_shader_objects} is supported. */
    public final boolean GL_ARB_shader_objects;
    /** When true, {@code ARB_shader_precision} is supported. */
    public final boolean GL_ARB_shader_precision;
    /** When true, {@code ARB_shader_stencil_export} is supported. */
    public final boolean GL_ARB_shader_stencil_export;
    /** When true, {@code ARB_shader_storage_buffer_object} is supported. */
    public final boolean GL_ARB_shader_storage_buffer_object;
    /** When true, {@code ARB_shader_subroutine} is supported. */
    public final boolean GL_ARB_shader_subroutine;
    /** When true, {@code ARB_shader_texture_image_samples} is supported. */
    public final boolean GL_ARB_shader_texture_image_samples;
    /** When true, {@code ARB_shader_texture_lod} is supported. */
    public final boolean GL_ARB_shader_texture_lod;
    /** When true, {@code ARB_shader_viewport_layer_array} is supported. */
    public final boolean GL_ARB_shader_viewport_layer_array;
    /** When true, {@code ARB_shading_language_100} is supported. */
    public final boolean GL_ARB_shading_language_100;
    /** When true, {@code ARB_shading_language_420pack} is supported. */
    public final boolean GL_ARB_shading_language_420pack;
    /** When true, {@code ARB_shading_language_include} is supported. */
    public final boolean GL_ARB_shading_language_include;
    /** When true, {@code ARB_shading_language_packing} is supported. */
    public final boolean GL_ARB_shading_language_packing;
    /** When true, {@code ARB_shadow} is supported. */
    public final boolean GL_ARB_shadow;
    /** When true, {@code ARB_shadow_ambient} is supported. */
    public final boolean GL_ARB_shadow_ambient;
    /** When true, {@code ARB_sparse_buffer} is supported. */
    public final boolean GL_ARB_sparse_buffer;
    /** When true, {@code ARB_sparse_texture} is supported. */
    public final boolean GL_ARB_sparse_texture;
    /** When true, {@code ARB_sparse_texture2} is supported. */
    public final boolean GL_ARB_sparse_texture2;
    /** When true, {@code ARB_sparse_texture_clamp} is supported. */
    public final boolean GL_ARB_sparse_texture_clamp;
    /** When true, {@code ARB_spirv_extensions} is supported. */
    public final boolean GL_ARB_spirv_extensions;
    /** When true, {@code ARB_stencil_texturing} is supported. */
    public final boolean GL_ARB_stencil_texturing;
    /** When true, {@code ARB_sync} is supported. */
    public final boolean GL_ARB_sync;
    /** When true, {@code ARB_tessellation_shader} is supported. */
    public final boolean GL_ARB_tessellation_shader;
    /** When true, {@code ARB_texture_barrier} is supported. */
    public final boolean GL_ARB_texture_barrier;
    /** When true, {@code ARB_texture_border_clamp} is supported. */
    public final boolean GL_ARB_texture_border_clamp;
    /** When true, {@code ARB_texture_buffer_object} is supported. */
    public final boolean GL_ARB_texture_buffer_object;
    /** When true, {@code ARB_texture_buffer_object_rgb32} is supported. */
    public final boolean GL_ARB_texture_buffer_object_rgb32;
    /** When true, {@code ARB_texture_buffer_range} is supported. */
    public final boolean GL_ARB_texture_buffer_range;
    /** When true, {@code ARB_texture_compression} is supported. */
    public final boolean GL_ARB_texture_compression;
    /** When true, {@code ARB_texture_compression_bptc} is supported. */
    public final boolean GL_ARB_texture_compression_bptc;
    /** When true, {@code ARB_texture_compression_rgtc} is supported. */
    public final boolean GL_ARB_texture_compression_rgtc;
    /** When true, {@code ARB_texture_cube_map} is supported. */
    public final boolean GL_ARB_texture_cube_map;
    /** When true, {@code ARB_texture_cube_map_array} is supported. */
    public final boolean GL_ARB_texture_cube_map_array;
    /** When true, {@code ARB_texture_env_add} is supported. */
    public final boolean GL_ARB_texture_env_add;
    /** When true, {@code ARB_texture_env_combine} is supported. */
    public final boolean GL_ARB_texture_env_combine;
    /** When true, {@code ARB_texture_env_crossbar} is supported. */
    public final boolean GL_ARB_texture_env_crossbar;
    /** When true, {@code ARB_texture_env_dot3} is supported. */
    public final boolean GL_ARB_texture_env_dot3;
    /** When true, {@code ARB_texture_filter_anisotropic} is supported. */
    public final boolean GL_ARB_texture_filter_anisotropic;
    /** When true, {@code ARB_texture_filter_minmax} is supported. */
    public final boolean GL_ARB_texture_filter_minmax;
    /** When true, {@code ARB_texture_float} is supported. */
    public final boolean GL_ARB_texture_float;
    /** When true, {@code ARB_texture_gather} is supported. */
    public final boolean GL_ARB_texture_gather;
    /** When true, {@code ARB_texture_mirror_clamp_to_edge} is supported. */
    public final boolean GL_ARB_texture_mirror_clamp_to_edge;
    /** When true, {@code ARB_texture_mirrored_repeat} is supported. */
    public final boolean GL_ARB_texture_mirrored_repeat;
    /** When true, {@code ARB_texture_multisample} is supported. */
    public final boolean GL_ARB_texture_multisample;
    /** When true, {@code ARB_texture_non_power_of_two} is supported. */
    public final boolean GL_ARB_texture_non_power_of_two;
    /** When true, {@code ARB_texture_query_levels} is supported. */
    public final boolean GL_ARB_texture_query_levels;
    /** When true, {@code ARB_texture_query_lod} is supported. */
    public final boolean GL_ARB_texture_query_lod;
    /** When true, {@code ARB_texture_rectangle} is supported. */
    public final boolean GL_ARB_texture_rectangle;
    /** When true, {@code ARB_texture_rg} is supported. */
    public final boolean GL_ARB_texture_rg;
    /** When true, {@code ARB_texture_rgb10_a2ui} is supported. */
    public final boolean GL_ARB_texture_rgb10_a2ui;
    /** When true, {@code ARB_texture_stencil8} is supported. */
    public final boolean GL_ARB_texture_stencil8;
    /** When true, {@code ARB_texture_storage} is supported. */
    public final boolean GL_ARB_texture_storage;
    /** When true, {@code ARB_texture_storage_multisample} is supported. */
    public final boolean GL_ARB_texture_storage_multisample;
    /** When true, {@code ARB_texture_swizzle} is supported. */
    public final boolean GL_ARB_texture_swizzle;
    /** When true, {@code ARB_texture_view} is supported. */
    public final boolean GL_ARB_texture_view;
    /** When true, {@code ARB_timer_query} is supported. */
    public final boolean GL_ARB_timer_query;
    /** When true, {@code ARB_transform_feedback2} is supported. */
    public final boolean GL_ARB_transform_feedback2;
    /** When true, {@code ARB_transform_feedback3} is supported. */
    public final boolean GL_ARB_transform_feedback3;
    /** When true, {@code ARB_transform_feedback_instanced} is supported. */
    public final boolean GL_ARB_transform_feedback_instanced;
    /** When true, {@code ARB_transform_feedback_overflow_query} is supported. */
    public final boolean GL_ARB_transform_feedback_overflow_query;
    /** When true, {@code ARB_transpose_matrix} is supported. */
    public final boolean GL_ARB_transpose_matrix;
    /** When true, {@code ARB_uniform_buffer_object} is supported. */
    public final boolean GL_ARB_uniform_buffer_object;
    /** When true, {@code ARB_vertex_array_bgra} is supported. */
    public final boolean GL_ARB_vertex_array_bgra;
    /** When true, {@code ARB_vertex_array_object} is supported. */
    public final boolean GL_ARB_vertex_array_object;
    /** When true, {@code ARB_vertex_attrib_64bit} is supported. */
    public final boolean GL_ARB_vertex_attrib_64bit;
    /** When true, {@code ARB_vertex_attrib_binding} is supported. */
    public final boolean GL_ARB_vertex_attrib_binding;
    /** When true, {@code ARB_vertex_blend} is supported. */
    public final boolean GL_ARB_vertex_blend;
    /** When true, {@code ARB_vertex_buffer_object} is supported. */
    public final boolean GL_ARB_vertex_buffer_object;
    /** When true, {@code ARB_vertex_program} is supported. */
    public final boolean GL_ARB_vertex_program;
    /** When true, {@code ARB_vertex_shader} is supported. */
    public final boolean GL_ARB_vertex_shader;
    /** When true, {@code ARB_vertex_type_10f_11f_11f_rev} is supported. */
    public final boolean GL_ARB_vertex_type_10f_11f_11f_rev;
    /** When true, {@code ARB_vertex_type_2_10_10_10_rev} is supported. */
    public final boolean GL_ARB_vertex_type_2_10_10_10_rev;
    /** When true, {@code ARB_viewport_array} is supported. */
    public final boolean GL_ARB_viewport_array;
    /** When true, {@code ARB_window_pos} is supported. */
    public final boolean GL_ARB_window_pos;
    /** When true, {@code ATI_meminfo} is supported. */
    public final boolean GL_ATI_meminfo;
    /** When true, {@code ATI_shader_texture_lod} is supported. */
    public final boolean GL_ATI_shader_texture_lod;
    /** When true, {@code ATI_texture_compression_3dc} is supported. */
    public final boolean GL_ATI_texture_compression_3dc;
    /** When true, {@code EXT_422_pixels} is supported. */
    public final boolean GL_EXT_422_pixels;
    /** When true, {@code EXT_abgr} is supported. */
    public final boolean GL_EXT_abgr;
    /** When true, {@code EXT_bgra} is supported. */
    public final boolean GL_EXT_bgra;
    /** When true, {@code EXT_bindable_uniform} is supported. */
    public final boolean GL_EXT_bindable_uniform;
    /** When true, {@code EXT_blend_color} is supported. */
    public final boolean GL_EXT_blend_color;
    /** When true, {@code EXT_blend_equation_separate} is supported. */
    public final boolean GL_EXT_blend_equation_separate;
    /** When true, {@code EXT_blend_func_separate} is supported. */
    public final boolean GL_EXT_blend_func_separate;
    /** When true, {@code EXT_blend_minmax} is supported. */
    public final boolean GL_EXT_blend_minmax;
    /** When true, {@code EXT_blend_subtract} is supported. */
    public final boolean GL_EXT_blend_subtract;
    /** When true, {@code EXT_clip_volume_hint} is supported. */
    public final boolean GL_EXT_clip_volume_hint;
    /** When true, {@code EXT_compiled_vertex_array} is supported. */
    public final boolean GL_EXT_compiled_vertex_array;
    /** When true, {@code EXT_debug_label} is supported. */
    public final boolean GL_EXT_debug_label;
    /** When true, {@code EXT_debug_marker} is supported. */
    public final boolean GL_EXT_debug_marker;
    /** When true, {@code EXT_depth_bounds_test} is supported. */
    public final boolean GL_EXT_depth_bounds_test;
    /** When true, {@code EXT_direct_state_access} is supported. */
    public final boolean GL_EXT_direct_state_access;
    /** When true, {@code EXT_draw_buffers2} is supported. */
    public final boolean GL_EXT_draw_buffers2;
    /** When true, {@code EXT_draw_instanced} is supported. */
    public final boolean GL_EXT_draw_instanced;
    /** When true, {@code EXT_EGL_image_storage} is supported. */
    public final boolean GL_EXT_EGL_image_storage;
    /** When true, {@code EXT_EGL_sync} is supported. */
    public final boolean GL_EXT_EGL_sync;
    /** When true, {@code EXT_external_buffer} is supported. */
    public final boolean GL_EXT_external_buffer;
    /** When true, {@code EXT_fragment_shading_rate} is supported. */
    public final boolean GL_EXT_fragment_shading_rate;
    /** When true, {@code EXT_fragment_shading_rate_attachment} is supported. */
    public final boolean GL_EXT_fragment_shading_rate_attachment;
    /** When true, {@code EXT_fragment_shading_rate_primitive} is supported. */
    public final boolean GL_EXT_fragment_shading_rate_primitive;
    /** When true, {@code EXT_framebuffer_blit} is supported. */
    public final boolean GL_EXT_framebuffer_blit;
    /** When true, {@code EXT_framebuffer_blit_layers} is supported. */
    public final boolean GL_EXT_framebuffer_blit_layers;
    /** When true, {@code EXT_framebuffer_multisample} is supported. */
    public final boolean GL_EXT_framebuffer_multisample;
    /** When true, {@code EXT_framebuffer_multisample_blit_scaled} is supported. */
    public final boolean GL_EXT_framebuffer_multisample_blit_scaled;
    /** When true, {@code EXT_framebuffer_object} is supported. */
    public final boolean GL_EXT_framebuffer_object;
    /** When true, {@code EXT_framebuffer_sRGB} is supported. */
    public final boolean GL_EXT_framebuffer_sRGB;
    /** When true, {@code EXT_geometry_shader4} is supported. */
    public final boolean GL_EXT_geometry_shader4;
    /** When true, {@code EXT_gpu_program_parameters} is supported. */
    public final boolean GL_EXT_gpu_program_parameters;
    /** When true, {@code EXT_gpu_shader4} is supported. */
    public final boolean GL_EXT_gpu_shader4;
    /** When true, {@code EXT_memory_object} is supported. */
    public final boolean GL_EXT_memory_object;
    /** When true, {@code EXT_memory_object_fd} is supported. */
    public final boolean GL_EXT_memory_object_fd;
    /** When true, {@code EXT_memory_object_win32} is supported. */
    public final boolean GL_EXT_memory_object_win32;
    /** When true, {@code EXT_mesh_shader} is supported. */
    public final boolean GL_EXT_mesh_shader;
    /** When true, {@code EXT_multiview_tessellation_geometry_shader} is supported. */
    public final boolean GL_EXT_multiview_tessellation_geometry_shader;
    /** When true, {@code EXT_multiview_texture_multisample} is supported. */
    public final boolean GL_EXT_multiview_texture_multisample;
    /** When true, {@code EXT_multiview_timer_query} is supported. */
    public final boolean GL_EXT_multiview_timer_query;
    /** When true, {@code EXT_packed_depth_stencil} is supported. */
    public final boolean GL_EXT_packed_depth_stencil;
    /** When true, {@code EXT_packed_float} is supported. */
    public final boolean GL_EXT_packed_float;
    /** When true, {@code EXT_pixel_buffer_object} is supported. */
    public final boolean GL_EXT_pixel_buffer_object;
    /** When true, {@code EXT_point_parameters} is supported. */
    public final boolean GL_EXT_point_parameters;
    /** When true, {@code EXT_polygon_offset_clamp} is supported. */
    public final boolean GL_EXT_polygon_offset_clamp;
    /** When true, {@code EXT_post_depth_coverage} is supported. */
    public final boolean GL_EXT_post_depth_coverage;
    /** When true, {@code EXT_provoking_vertex} is supported. */
    public final boolean GL_EXT_provoking_vertex;
    /** When true, {@code EXT_raster_multisample} is supported. */
    public final boolean GL_EXT_raster_multisample;
    /** When true, {@code EXT_secondary_color} is supported. */
    public final boolean GL_EXT_secondary_color;
    /** When true, {@code EXT_semaphore} is supported. */
    public final boolean GL_EXT_semaphore;
    /** When true, {@code EXT_semaphore_fd} is supported. */
    public final boolean GL_EXT_semaphore_fd;
    /** When true, {@code EXT_semaphore_win32} is supported. */
    public final boolean GL_EXT_semaphore_win32;
    /** When true, {@code EXT_separate_shader_objects} is supported. */
    public final boolean GL_EXT_separate_shader_objects;
    /** When true, {@code EXT_shader_framebuffer_fetch} is supported. */
    public final boolean GL_EXT_shader_framebuffer_fetch;
    /** When true, {@code EXT_shader_framebuffer_fetch_non_coherent} is supported. */
    public final boolean GL_EXT_shader_framebuffer_fetch_non_coherent;
    /** When true, {@code EXT_shader_image_load_formatted} is supported. */
    public final boolean GL_EXT_shader_image_load_formatted;
    /** When true, {@code EXT_shader_image_load_store} is supported. */
    public final boolean GL_EXT_shader_image_load_store;
    /** When true, {@code EXT_shader_integer_mix} is supported. */
    public final boolean GL_EXT_shader_integer_mix;
    /** When true, {@code EXT_shader_realtime_clock} is supported. */
    public final boolean GL_EXT_shader_realtime_clock;
    /** When true, {@code EXT_shader_samples_identical} is supported. */
    public final boolean GL_EXT_shader_samples_identical;
    /** When true, {@code EXT_shader_texture_samples} is supported. */
    public final boolean GL_EXT_shader_texture_samples;
    /** When true, {@code EXT_shadow_funcs} is supported. */
    public final boolean GL_EXT_shadow_funcs;
    /** When true, {@code EXT_shared_texture_palette} is supported. */
    public final boolean GL_EXT_shared_texture_palette;
    /** When true, {@code EXT_sparse_texture2} is supported. */
    public final boolean GL_EXT_sparse_texture2;
    /** When true, {@code EXT_stencil_clear_tag} is supported. */
    public final boolean GL_EXT_stencil_clear_tag;
    /** When true, {@code EXT_stencil_two_side} is supported. */
    public final boolean GL_EXT_stencil_two_side;
    /** When true, {@code EXT_stencil_wrap} is supported. */
    public final boolean GL_EXT_stencil_wrap;
    /** When true, {@code EXT_texture_array} is supported. */
    public final boolean GL_EXT_texture_array;
    /** When true, {@code EXT_texture_buffer_object} is supported. */
    public final boolean GL_EXT_texture_buffer_object;
    /** When true, {@code EXT_texture_compression_latc} is supported. */
    public final boolean GL_EXT_texture_compression_latc;
    /** When true, {@code EXT_texture_compression_rgtc} is supported. */
    public final boolean GL_EXT_texture_compression_rgtc;
    /** When true, {@code EXT_texture_compression_s3tc} is supported. */
    public final boolean GL_EXT_texture_compression_s3tc;
    /** When true, {@code EXT_texture_filter_anisotropic} is supported. */
    public final boolean GL_EXT_texture_filter_anisotropic;
    /** When true, {@code EXT_texture_filter_minmax} is supported. */
    public final boolean GL_EXT_texture_filter_minmax;
    /** When true, {@code EXT_texture_integer} is supported. */
    public final boolean GL_EXT_texture_integer;
    /** When true, {@code EXT_texture_mirror_clamp} is supported. */
    public final boolean GL_EXT_texture_mirror_clamp;
    /** When true, {@code EXT_texture_shadow_lod} is supported. */
    public final boolean GL_EXT_texture_shadow_lod;
    /** When true, {@code EXT_texture_shared_exponent} is supported. */
    public final boolean GL_EXT_texture_shared_exponent;
    /** When true, {@code EXT_texture_snorm} is supported. */
    public final boolean GL_EXT_texture_snorm;
    /** When true, {@code EXT_texture_sRGB} is supported. */
    public final boolean GL_EXT_texture_sRGB;
    /** When true, {@code EXT_texture_sRGB_decode} is supported. */
    public final boolean GL_EXT_texture_sRGB_decode;
    /** When true, {@code EXT_texture_sRGB_R8} is supported. */
    public final boolean GL_EXT_texture_sRGB_R8;
    /** When true, {@code EXT_texture_sRGB_RG8} is supported. */
    public final boolean GL_EXT_texture_sRGB_RG8;
    /** When true, {@code EXT_texture_storage} is supported. */
    public final boolean GL_EXT_texture_storage;
    /** When true, {@code EXT_texture_swizzle} is supported. */
    public final boolean GL_EXT_texture_swizzle;
    /** When true, {@code EXT_timer_query} is supported. */
    public final boolean GL_EXT_timer_query;
    /** When true, {@code EXT_transform_feedback} is supported. */
    public final boolean GL_EXT_transform_feedback;
    /** When true, {@code EXT_vertex_array_bgra} is supported. */
    public final boolean GL_EXT_vertex_array_bgra;
    /** When true, {@code EXT_vertex_attrib_64bit} is supported. */
    public final boolean GL_EXT_vertex_attrib_64bit;
    /** When true, {@code EXT_win32_keyed_mutex} is supported. */
    public final boolean GL_EXT_win32_keyed_mutex;
    /** When true, {@code EXT_window_rectangles} is supported. */
    public final boolean GL_EXT_window_rectangles;
    /** When true, {@code EXT_x11_sync_object} is supported. */
    public final boolean GL_EXT_x11_sync_object;
    /** When true, {@code GREMEDY_frame_terminator} is supported. */
    public final boolean GL_GREMEDY_frame_terminator;
    /** When true, {@code GREMEDY_string_marker} is supported. */
    public final boolean GL_GREMEDY_string_marker;
    /** When true, {@code INTEL_blackhole_render} is supported. */
    public final boolean GL_INTEL_blackhole_render;
    /** When true, {@code INTEL_conservative_rasterization} is supported. */
    public final boolean GL_INTEL_conservative_rasterization;
    /** When true, {@code INTEL_fragment_shader_ordering} is supported. */
    public final boolean GL_INTEL_fragment_shader_ordering;
    /** When true, {@code INTEL_framebuffer_CMAA} is supported. */
    public final boolean GL_INTEL_framebuffer_CMAA;
    /** When true, {@code INTEL_map_texture} is supported. */
    public final boolean GL_INTEL_map_texture;
    /** When true, {@code INTEL_performance_query} is supported. */
    public final boolean GL_INTEL_performance_query;
    /** When true, {@code INTEL_shader_integer_functions2} is supported. */
    public final boolean GL_INTEL_shader_integer_functions2;
    /** When true, {@code KHR_blend_equation_advanced} is supported. */
    public final boolean GL_KHR_blend_equation_advanced;
    /** When true, {@code KHR_blend_equation_advanced_coherent} is supported. */
    public final boolean GL_KHR_blend_equation_advanced_coherent;
    /** When true, {@code KHR_context_flush_control} is supported. */
    public final boolean GL_KHR_context_flush_control;
    /** When true, {@code KHR_debug} is supported. */
    public final boolean GL_KHR_debug;
    /** When true, {@code KHR_no_error} is supported. */
    public final boolean GL_KHR_no_error;
    /** When true, {@code KHR_parallel_shader_compile} is supported. */
    public final boolean GL_KHR_parallel_shader_compile;
    /** When true, {@code KHR_robust_buffer_access_behavior} is supported. */
    public final boolean GL_KHR_robust_buffer_access_behavior;
    /** When true, {@code KHR_robustness} is supported. */
    public final boolean GL_KHR_robustness;
    /** When true, {@code KHR_shader_subgroup} is supported. */
    public final boolean GL_KHR_shader_subgroup;
    /** When true, {@code KHR_texture_compression_astc_hdr} is supported. */
    public final boolean GL_KHR_texture_compression_astc_hdr;
    /** When true, {@code KHR_texture_compression_astc_ldr} is supported. */
    public final boolean GL_KHR_texture_compression_astc_ldr;
    /** When true, {@code KHR_texture_compression_astc_sliced_3d} is supported. */
    public final boolean GL_KHR_texture_compression_astc_sliced_3d;
    /** When true, {@code MESA_framebuffer_flip_x} is supported. */
    public final boolean GL_MESA_framebuffer_flip_x;
    /** When true, {@code MESA_framebuffer_flip_y} is supported. */
    public final boolean GL_MESA_framebuffer_flip_y;
    /** When true, {@code MESA_framebuffer_swap_xy} is supported. */
    public final boolean GL_MESA_framebuffer_swap_xy;
    /** When true, {@code MESA_tile_raster_order} is supported. */
    public final boolean GL_MESA_tile_raster_order;
    /** When true, {@code NV_alpha_to_coverage_dither_control} is supported. */
    public final boolean GL_NV_alpha_to_coverage_dither_control;
    /** When true, {@code NV_bindless_multi_draw_indirect} is supported. */
    public final boolean GL_NV_bindless_multi_draw_indirect;
    /** When true, {@code NV_bindless_multi_draw_indirect_count} is supported. */
    public final boolean GL_NV_bindless_multi_draw_indirect_count;
    /** When true, {@code NV_bindless_texture} is supported. */
    public final boolean GL_NV_bindless_texture;
    /** When true, {@code NV_blend_equation_advanced} is supported. */
    public final boolean GL_NV_blend_equation_advanced;
    /** When true, {@code NV_blend_equation_advanced_coherent} is supported. */
    public final boolean GL_NV_blend_equation_advanced_coherent;
    /** When true, {@code NV_blend_minmax_factor} is supported. */
    public final boolean GL_NV_blend_minmax_factor;
    /** When true, {@code NV_blend_square} is supported. */
    public final boolean GL_NV_blend_square;
    /** When true, {@code NV_clip_space_w_scaling} is supported. */
    public final boolean GL_NV_clip_space_w_scaling;
    /** When true, {@code NV_command_list} is supported. */
    public final boolean GL_NV_command_list;
    /** When true, {@code NV_compute_shader_derivatives} is supported. */
    public final boolean GL_NV_compute_shader_derivatives;
    /** When true, {@code NV_conditional_render} is supported. */
    public final boolean GL_NV_conditional_render;
    /** When true, {@code NV_conservative_raster} is supported. */
    public final boolean GL_NV_conservative_raster;
    /** When true, {@code NV_conservative_raster_dilate} is supported. */
    public final boolean GL_NV_conservative_raster_dilate;
    /** When true, {@code NV_conservative_raster_pre_snap} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap;
    /** When true, {@code NV_conservative_raster_pre_snap_triangles} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap_triangles;
    /** When true, {@code NV_conservative_raster_underestimation} is supported. */
    public final boolean GL_NV_conservative_raster_underestimation;
    /** When true, {@code NV_copy_depth_to_color} is supported. */
    public final boolean GL_NV_copy_depth_to_color;
    /** When true, {@code NV_copy_image} is supported. */
    public final boolean GL_NV_copy_image;
    /** When true, {@code NV_deep_texture3D} is supported. */
    public final boolean GL_NV_deep_texture3D;
    /** When true, {@code NV_depth_buffer_float} is supported. */
    public final boolean GL_NV_depth_buffer_float;
    /** When true, {@code NV_depth_clamp} is supported. */
    public final boolean GL_NV_depth_clamp;
    /** When true, {@code NV_draw_texture} is supported. */
    public final boolean GL_NV_draw_texture;
    /** When true, {@code NV_draw_vulkan_image} is supported. */
    public final boolean GL_NV_draw_vulkan_image;
    /** When true, {@code NV_ES3_1_compatibility} is supported. */
    public final boolean GL_NV_ES3_1_compatibility;
    /** When true, {@code NV_explicit_multisample} is supported. */
    public final boolean GL_NV_explicit_multisample;
    /** When true, {@code NV_fence} is supported. */
    public final boolean GL_NV_fence;
    /** When true, {@code NV_fill_rectangle} is supported. */
    public final boolean GL_NV_fill_rectangle;
    /** When true, {@code NV_float_buffer} is supported. */
    public final boolean GL_NV_float_buffer;
    /** When true, {@code NV_fog_distance} is supported. */
    public final boolean GL_NV_fog_distance;
    /** When true, {@code NV_fragment_coverage_to_color} is supported. */
    public final boolean GL_NV_fragment_coverage_to_color;
    /** When true, {@code NV_fragment_program4} is supported. */
    public final boolean GL_NV_fragment_program4;
    /** When true, {@code NV_fragment_program_option} is supported. */
    public final boolean GL_NV_fragment_program_option;
    /** When true, {@code NV_fragment_shader_barycentric} is supported. */
    public final boolean GL_NV_fragment_shader_barycentric;
    /** When true, {@code NV_fragment_shader_interlock} is supported. */
    public final boolean GL_NV_fragment_shader_interlock;
    /** When true, {@code NV_framebuffer_mixed_samples} is supported. */
    public final boolean GL_NV_framebuffer_mixed_samples;
    /** When true, {@code NV_framebuffer_multisample_coverage} is supported. */
    public final boolean GL_NV_framebuffer_multisample_coverage;
    /** When true, {@code NV_geometry_shader4} is supported. */
    public final boolean GL_NV_geometry_shader4;
    /** When true, {@code NV_geometry_shader_passthrough} is supported. */
    public final boolean GL_NV_geometry_shader_passthrough;
    /** When true, {@code NV_gpu_multicast} is supported. */
    public final boolean GL_NV_gpu_multicast;
    /** When true, {@code NV_gpu_shader5} is supported. */
    public final boolean GL_NV_gpu_shader5;
    /** When true, {@code NV_half_float} is supported. */
    public final boolean GL_NV_half_float;
    /** When true, {@code NV_internalformat_sample_query} is supported. */
    public final boolean GL_NV_internalformat_sample_query;
    /** When true, {@code NV_light_max_exponent} is supported. */
    public final boolean GL_NV_light_max_exponent;
    /** When true, {@code NV_memory_attachment} is supported. */
    public final boolean GL_NV_memory_attachment;
    /** When true, {@code NV_memory_object_sparse} is supported. */
    public final boolean GL_NV_memory_object_sparse;
    /** When true, {@code NV_mesh_shader} is supported. */
    public final boolean GL_NV_mesh_shader;
    /** When true, {@code NV_multisample_coverage} is supported. */
    public final boolean GL_NV_multisample_coverage;
    /** When true, {@code NV_multisample_filter_hint} is supported. */
    public final boolean GL_NV_multisample_filter_hint;
    /** When true, {@code NV_packed_depth_stencil} is supported. */
    public final boolean GL_NV_packed_depth_stencil;
    /** When true, {@code NV_path_rendering} is supported. */
    public final boolean GL_NV_path_rendering;
    /** When true, {@code NV_path_rendering_shared_edge} is supported. */
    public final boolean GL_NV_path_rendering_shared_edge;
    /** When true, {@code NV_pixel_data_range} is supported. */
    public final boolean GL_NV_pixel_data_range;
    /** When true, {@code NV_point_sprite} is supported. */
    public final boolean GL_NV_point_sprite;
    /** When true, {@code NV_primitive_restart} is supported. */
    public final boolean GL_NV_primitive_restart;
    /** When true, {@code NV_primitive_shading_rate} is supported. */
    public final boolean GL_NV_primitive_shading_rate;
    /** When true, {@code NV_query_resource} is supported. */
    public final boolean GL_NV_query_resource;
    /** When true, {@code NV_query_resource_tag} is supported. */
    public final boolean GL_NV_query_resource_tag;
    /** When true, {@code NV_representative_fragment_test} is supported. */
    public final boolean GL_NV_representative_fragment_test;
    /** When true, {@code NV_robustness_video_memory_purge} is supported. */
    public final boolean GL_NV_robustness_video_memory_purge;
    /** When true, {@code NV_sample_locations} is supported. */
    public final boolean GL_NV_sample_locations;
    /** When true, {@code NV_sample_mask_override_coverage} is supported. */
    public final boolean GL_NV_sample_mask_override_coverage;
    /** When true, {@code NV_scissor_exclusive} is supported. */
    public final boolean GL_NV_scissor_exclusive;
    /** When true, {@code NV_shader_atomic_float} is supported. */
    public final boolean GL_NV_shader_atomic_float;
    /** When true, {@code NV_shader_atomic_float64} is supported. */
    public final boolean GL_NV_shader_atomic_float64;
    /** When true, {@code NV_shader_atomic_fp16_vector} is supported. */
    public final boolean GL_NV_shader_atomic_fp16_vector;
    /** When true, {@code NV_shader_atomic_int64} is supported. */
    public final boolean GL_NV_shader_atomic_int64;
    /** When true, {@code NV_shader_buffer_load} is supported. */
    public final boolean GL_NV_shader_buffer_load;
    /** When true, {@code NV_shader_buffer_store} is supported. */
    public final boolean GL_NV_shader_buffer_store;
    /** When true, {@code NV_shader_subgroup_partitioned} is supported. */
    public final boolean GL_NV_shader_subgroup_partitioned;
    /** When true, {@code NV_shader_texture_footprint} is supported. */
    public final boolean GL_NV_shader_texture_footprint;
    /** When true, {@code NV_shader_thread_group} is supported. */
    public final boolean GL_NV_shader_thread_group;
    /** When true, {@code NV_shader_thread_shuffle} is supported. */
    public final boolean GL_NV_shader_thread_shuffle;
    /** When true, {@code NV_shading_rate_image} is supported. */
    public final boolean GL_NV_shading_rate_image;
    /** When true, {@code NV_stereo_view_rendering} is supported. */
    public final boolean GL_NV_stereo_view_rendering;
    /** When true, {@code NV_texgen_reflection} is supported. */
    public final boolean GL_NV_texgen_reflection;
    /** When true, {@code NV_texture_barrier} is supported. */
    public final boolean GL_NV_texture_barrier;
    /** When true, {@code NV_texture_compression_vtc} is supported. */
    public final boolean GL_NV_texture_compression_vtc;
    /** When true, {@code NV_texture_multisample} is supported. */
    public final boolean GL_NV_texture_multisample;
    /** When true, {@code NV_texture_rectangle_compressed} is supported. */
    public final boolean GL_NV_texture_rectangle_compressed;
    /** When true, {@code NV_texture_shader} is supported. */
    public final boolean GL_NV_texture_shader;
    /** When true, {@code NV_texture_shader2} is supported. */
    public final boolean GL_NV_texture_shader2;
    /** When true, {@code NV_texture_shader3} is supported. */
    public final boolean GL_NV_texture_shader3;
    /** When true, {@code NV_timeline_semaphore} is supported. */
    public final boolean GL_NV_timeline_semaphore;
    /** When true, {@code NV_transform_feedback} is supported. */
    public final boolean GL_NV_transform_feedback;
    /** When true, {@code NV_transform_feedback2} is supported. */
    public final boolean GL_NV_transform_feedback2;
    /** When true, {@code NV_uniform_buffer_std430_layout} is supported. */
    public final boolean GL_NV_uniform_buffer_std430_layout;
    /** When true, {@code NV_uniform_buffer_unified_memory} is supported. */
    public final boolean GL_NV_uniform_buffer_unified_memory;
    /** When true, {@code NV_vertex_array_range} is supported. */
    public final boolean GL_NV_vertex_array_range;
    /** When true, {@code NV_vertex_array_range2} is supported. */
    public final boolean GL_NV_vertex_array_range2;
    /** When true, {@code NV_vertex_attrib_integer_64bit} is supported. */
    public final boolean GL_NV_vertex_attrib_integer_64bit;
    /** When true, {@code NV_vertex_buffer_unified_memory} is supported. */
    public final boolean GL_NV_vertex_buffer_unified_memory;
    /** When true, {@code NV_viewport_array2} is supported. */
    public final boolean GL_NV_viewport_array2;
    /** When true, {@code NV_viewport_swizzle} is supported. */
    public final boolean GL_NV_viewport_swizzle;
    /** When true, {@code NVX_blend_equation_advanced_multi_draw_buffers} is supported. */
    public final boolean GL_NVX_blend_equation_advanced_multi_draw_buffers;
    /** When true, {@code NVX_conditional_render} is supported. */
    public final boolean GL_NVX_conditional_render;
    /** When true, {@code NVX_gpu_memory_info} is supported. */
    public final boolean GL_NVX_gpu_memory_info;
    /** When true, {@code NVX_gpu_multicast2} is supported. */
    public final boolean GL_NVX_gpu_multicast2;
    /** When true, {@code NVX_progress_fence} is supported. */
    public final boolean GL_NVX_progress_fence;
    /** When true, {@code OVR_multiview} is supported. */
    public final boolean GL_OVR_multiview;
    /** When true, {@code OVR_multiview2} is supported. */
    public final boolean GL_OVR_multiview2;
    /** When true, {@code S3_s3tc} is supported. */
    public final boolean GL_S3_s3tc;

    /** When true, deprecated functions are not available. */
    public final boolean forwardCompatible;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    GLCapabilities(FunctionProvider provider, Set<String> ext, boolean fc, IntFunction<PointerBuffer> bufferFactory) {
        forwardCompatible = fc;

        PointerBuffer caps = bufferFactory.apply(ADDRESS_BUFFER_SIZE);

        OpenGL11 = check_GL11(provider, caps, ext, fc);
        OpenGL12 = check_GL12(provider, caps, ext);
        OpenGL13 = check_GL13(provider, caps, ext, fc);
        OpenGL14 = check_GL14(provider, caps, ext, fc);
        OpenGL15 = check_GL15(provider, caps, ext);
        OpenGL20 = check_GL20(provider, caps, ext);
        OpenGL21 = check_GL21(provider, caps, ext);
        OpenGL30 = check_GL30(provider, caps, ext);
        OpenGL31 = check_GL31(provider, caps, ext);
        OpenGL32 = check_GL32(provider, caps, ext);
        OpenGL33 = check_GL33(provider, caps, ext, fc);
        OpenGL40 = check_GL40(provider, caps, ext);
        OpenGL41 = check_GL41(provider, caps, ext);
        OpenGL42 = check_GL42(provider, caps, ext);
        OpenGL43 = check_GL43(provider, caps, ext);
        OpenGL44 = check_GL44(provider, caps, ext);
        OpenGL45 = check_GL45(provider, caps, ext);
        OpenGL46 = check_GL46(provider, caps, ext);
        GL_3DFX_texture_compression_FXT1 = ext.contains("GL_3DFX_texture_compression_FXT1");
        GL_AMD_blend_minmax_factor = ext.contains("GL_AMD_blend_minmax_factor");
        GL_AMD_conservative_depth = ext.contains("GL_AMD_conservative_depth");
        GL_AMD_debug_output = check_AMD_debug_output(provider, caps, ext);
        GL_AMD_depth_clamp_separate = ext.contains("GL_AMD_depth_clamp_separate");
        GL_AMD_draw_buffers_blend = check_AMD_draw_buffers_blend(provider, caps, ext);
        GL_AMD_framebuffer_multisample_advanced = check_AMD_framebuffer_multisample_advanced(provider, caps, ext);
        GL_AMD_gcn_shader = ext.contains("GL_AMD_gcn_shader");
        GL_AMD_gpu_shader_half_float = ext.contains("GL_AMD_gpu_shader_half_float");
        GL_AMD_gpu_shader_half_float_fetch = ext.contains("GL_AMD_gpu_shader_half_float_fetch");
        GL_AMD_gpu_shader_int16 = ext.contains("GL_AMD_gpu_shader_int16");
        GL_AMD_gpu_shader_int64 = check_AMD_gpu_shader_int64(provider, caps, ext);
        GL_AMD_interleaved_elements = check_AMD_interleaved_elements(provider, caps, ext);
        GL_AMD_occlusion_query_event = check_AMD_occlusion_query_event(provider, caps, ext);
        GL_AMD_performance_monitor = check_AMD_performance_monitor(provider, caps, ext);
        GL_AMD_pinned_memory = ext.contains("GL_AMD_pinned_memory");
        GL_AMD_query_buffer_object = ext.contains("GL_AMD_query_buffer_object");
        GL_AMD_sample_positions = check_AMD_sample_positions(provider, caps, ext);
        GL_AMD_seamless_cubemap_per_texture = ext.contains("GL_AMD_seamless_cubemap_per_texture");
        GL_AMD_shader_atomic_counter_ops = ext.contains("GL_AMD_shader_atomic_counter_ops");
        GL_AMD_shader_ballot = ext.contains("GL_AMD_shader_ballot");
        GL_AMD_shader_explicit_vertex_parameter = ext.contains("GL_AMD_shader_explicit_vertex_parameter");
        GL_AMD_shader_image_load_store_lod = ext.contains("GL_AMD_shader_image_load_store_lod");
        GL_AMD_shader_stencil_export = ext.contains("GL_AMD_shader_stencil_export");
        GL_AMD_shader_trinary_minmax = ext.contains("GL_AMD_shader_trinary_minmax");
        GL_AMD_sparse_texture = check_AMD_sparse_texture(provider, caps, ext);
        GL_AMD_stencil_operation_extended = check_AMD_stencil_operation_extended(provider, caps, ext);
        GL_AMD_texture_gather_bias_lod = ext.contains("GL_AMD_texture_gather_bias_lod");
        GL_AMD_texture_texture4 = ext.contains("GL_AMD_texture_texture4");
        GL_AMD_transform_feedback3_lines_triangles = ext.contains("GL_AMD_transform_feedback3_lines_triangles");
        GL_AMD_transform_feedback4 = ext.contains("GL_AMD_transform_feedback4");
        GL_AMD_vertex_shader_layer = ext.contains("GL_AMD_vertex_shader_layer");
        GL_AMD_vertex_shader_tessellator = check_AMD_vertex_shader_tessellator(provider, caps, ext);
        GL_AMD_vertex_shader_viewport_index = ext.contains("GL_AMD_vertex_shader_viewport_index");
        GL_APPLE_aux_depth_stencil = ext.contains("GL_APPLE_aux_depth_stencil");
        GL_APPLE_client_storage = ext.contains("GL_APPLE_client_storage");
        GL_APPLE_element_array = check_APPLE_element_array(provider, caps, ext);
        GL_APPLE_fence = check_APPLE_fence(provider, caps, ext);
        GL_APPLE_float_pixels = ext.contains("GL_APPLE_float_pixels");
        GL_APPLE_flush_buffer_range = check_APPLE_flush_buffer_range(provider, caps, ext);
        GL_APPLE_object_purgeable = check_APPLE_object_purgeable(provider, caps, ext);
        GL_APPLE_rgb_422 = ext.contains("GL_APPLE_rgb_422");
        GL_APPLE_row_bytes = ext.contains("GL_APPLE_row_bytes");
        GL_APPLE_texture_range = check_APPLE_texture_range(provider, caps, ext);
        GL_APPLE_vertex_array_object = check_APPLE_vertex_array_object(provider, caps, ext);
        GL_APPLE_vertex_array_range = check_APPLE_vertex_array_range(provider, caps, ext);
        GL_APPLE_vertex_program_evaluators = check_APPLE_vertex_program_evaluators(provider, caps, ext);
        GL_APPLE_ycbcr_422 = ext.contains("GL_APPLE_ycbcr_422");
        GL_ARB_arrays_of_arrays = ext.contains("GL_ARB_arrays_of_arrays");
        GL_ARB_base_instance = check_ARB_base_instance(provider, caps, ext);
        GL_ARB_bindless_texture = check_ARB_bindless_texture(provider, caps, ext);
        GL_ARB_blend_func_extended = check_ARB_blend_func_extended(provider, caps, ext);
        GL_ARB_buffer_storage = check_ARB_buffer_storage(provider, caps, ext);
        GL_ARB_cl_event = check_ARB_cl_event(provider, caps, ext);
        GL_ARB_clear_buffer_object = check_ARB_clear_buffer_object(provider, caps, ext);
        GL_ARB_clear_texture = check_ARB_clear_texture(provider, caps, ext);
        GL_ARB_clip_control = check_ARB_clip_control(provider, caps, ext);
        GL_ARB_color_buffer_float = check_ARB_color_buffer_float(provider, caps, ext);
        GL_ARB_compatibility = ext.contains("GL_ARB_compatibility");
        GL_ARB_compressed_texture_pixel_storage = ext.contains("GL_ARB_compressed_texture_pixel_storage");
        GL_ARB_compute_shader = check_ARB_compute_shader(provider, caps, ext);
        GL_ARB_compute_variable_group_size = check_ARB_compute_variable_group_size(provider, caps, ext);
        GL_ARB_conditional_render_inverted = ext.contains("GL_ARB_conditional_render_inverted");
        GL_ARB_conservative_depth = ext.contains("GL_ARB_conservative_depth");
        GL_ARB_copy_buffer = check_ARB_copy_buffer(provider, caps, ext);
        GL_ARB_copy_image = check_ARB_copy_image(provider, caps, ext);
        GL_ARB_cull_distance = ext.contains("GL_ARB_cull_distance");
        GL_ARB_debug_output = check_ARB_debug_output(provider, caps, ext);
        GL_ARB_depth_buffer_float = ext.contains("GL_ARB_depth_buffer_float");
        GL_ARB_depth_clamp = ext.contains("GL_ARB_depth_clamp");
        GL_ARB_depth_texture = ext.contains("GL_ARB_depth_texture");
        GL_ARB_derivative_control = ext.contains("GL_ARB_derivative_control");
        GL_ARB_direct_state_access = check_ARB_direct_state_access(provider, caps, ext);
        GL_ARB_draw_buffers = check_ARB_draw_buffers(provider, caps, ext);
        GL_ARB_draw_buffers_blend = check_ARB_draw_buffers_blend(provider, caps, ext);
        GL_ARB_draw_elements_base_vertex = check_ARB_draw_elements_base_vertex(provider, caps, ext);
        GL_ARB_draw_indirect = check_ARB_draw_indirect(provider, caps, ext);
        GL_ARB_draw_instanced = check_ARB_draw_instanced(provider, caps, ext);
        GL_ARB_enhanced_layouts = ext.contains("GL_ARB_enhanced_layouts");
        GL_ARB_ES2_compatibility = check_ARB_ES2_compatibility(provider, caps, ext);
        GL_ARB_ES3_1_compatibility = check_ARB_ES3_1_compatibility(provider, caps, ext);
        GL_ARB_ES3_2_compatibility = check_ARB_ES3_2_compatibility(provider, caps, ext);
        GL_ARB_ES3_compatibility = ext.contains("GL_ARB_ES3_compatibility");
        GL_ARB_explicit_attrib_location = ext.contains("GL_ARB_explicit_attrib_location");
        GL_ARB_explicit_uniform_location = ext.contains("GL_ARB_explicit_uniform_location");
        GL_ARB_fragment_coord_conventions = ext.contains("GL_ARB_fragment_coord_conventions");
        GL_ARB_fragment_layer_viewport = ext.contains("GL_ARB_fragment_layer_viewport");
        GL_ARB_fragment_program = ext.contains("GL_ARB_fragment_program");
        GL_ARB_fragment_program_shadow = ext.contains("GL_ARB_fragment_program_shadow");
        GL_ARB_fragment_shader = ext.contains("GL_ARB_fragment_shader");
        GL_ARB_fragment_shader_interlock = ext.contains("GL_ARB_fragment_shader_interlock");
        GL_ARB_framebuffer_no_attachments = check_ARB_framebuffer_no_attachments(provider, caps, ext);
        GL_ARB_framebuffer_object = check_ARB_framebuffer_object(provider, caps, ext);
        GL_ARB_framebuffer_sRGB = ext.contains("GL_ARB_framebuffer_sRGB");
        GL_ARB_geometry_shader4 = check_ARB_geometry_shader4(provider, caps, ext);
        GL_ARB_get_program_binary = check_ARB_get_program_binary(provider, caps, ext);
        GL_ARB_get_texture_sub_image = check_ARB_get_texture_sub_image(provider, caps, ext);
        GL_ARB_gl_spirv = check_ARB_gl_spirv(provider, caps, ext);
        GL_ARB_gpu_shader5 = ext.contains("GL_ARB_gpu_shader5");
        GL_ARB_gpu_shader_fp64 = check_ARB_gpu_shader_fp64(provider, caps, ext);
        GL_ARB_gpu_shader_int64 = check_ARB_gpu_shader_int64(provider, caps, ext);
        GL_ARB_half_float_pixel = ext.contains("GL_ARB_half_float_pixel");
        GL_ARB_half_float_vertex = ext.contains("GL_ARB_half_float_vertex");
        GL_ARB_imaging = check_ARB_imaging(provider, caps, ext, fc);
        GL_ARB_indirect_parameters = check_ARB_indirect_parameters(provider, caps, ext);
        GL_ARB_instanced_arrays = check_ARB_instanced_arrays(provider, caps, ext);
        GL_ARB_internalformat_query = check_ARB_internalformat_query(provider, caps, ext);
        GL_ARB_internalformat_query2 = check_ARB_internalformat_query2(provider, caps, ext);
        GL_ARB_invalidate_subdata = check_ARB_invalidate_subdata(provider, caps, ext);
        GL_ARB_map_buffer_alignment = ext.contains("GL_ARB_map_buffer_alignment");
        GL_ARB_map_buffer_range = check_ARB_map_buffer_range(provider, caps, ext);
        GL_ARB_matrix_palette = check_ARB_matrix_palette(provider, caps, ext);
        GL_ARB_multi_bind = check_ARB_multi_bind(provider, caps, ext);
        GL_ARB_multi_draw_indirect = check_ARB_multi_draw_indirect(provider, caps, ext);
        GL_ARB_multisample = check_ARB_multisample(provider, caps, ext);
        GL_ARB_multitexture = check_ARB_multitexture(provider, caps, ext);
        GL_ARB_occlusion_query = check_ARB_occlusion_query(provider, caps, ext);
        GL_ARB_occlusion_query2 = ext.contains("GL_ARB_occlusion_query2");
        GL_ARB_parallel_shader_compile = check_ARB_parallel_shader_compile(provider, caps, ext);
        GL_ARB_pipeline_statistics_query = ext.contains("GL_ARB_pipeline_statistics_query");
        GL_ARB_pixel_buffer_object = ext.contains("GL_ARB_pixel_buffer_object");
        GL_ARB_point_parameters = check_ARB_point_parameters(provider, caps, ext);
        GL_ARB_point_sprite = ext.contains("GL_ARB_point_sprite");
        GL_ARB_polygon_offset_clamp = check_ARB_polygon_offset_clamp(provider, caps, ext);
        GL_ARB_post_depth_coverage = ext.contains("GL_ARB_post_depth_coverage");
        GL_ARB_program_interface_query = check_ARB_program_interface_query(provider, caps, ext);
        GL_ARB_provoking_vertex = check_ARB_provoking_vertex(provider, caps, ext);
        GL_ARB_query_buffer_object = ext.contains("GL_ARB_query_buffer_object");
        GL_ARB_robust_buffer_access_behavior = ext.contains("GL_ARB_robust_buffer_access_behavior");
        GL_ARB_robustness = check_ARB_robustness(provider, caps, ext);
        GL_ARB_robustness_application_isolation = ext.contains("GL_ARB_robustness_application_isolation");
        GL_ARB_robustness_share_group_isolation = ext.contains("GL_ARB_robustness_share_group_isolation");
        GL_ARB_sample_locations = check_ARB_sample_locations(provider, caps, ext);
        GL_ARB_sample_shading = check_ARB_sample_shading(provider, caps, ext);
        GL_ARB_sampler_objects = check_ARB_sampler_objects(provider, caps, ext);
        GL_ARB_seamless_cube_map = ext.contains("GL_ARB_seamless_cube_map");
        GL_ARB_seamless_cubemap_per_texture = ext.contains("GL_ARB_seamless_cubemap_per_texture");
        GL_ARB_separate_shader_objects = check_ARB_separate_shader_objects(provider, caps, ext);
        GL_ARB_shader_atomic_counter_ops = ext.contains("GL_ARB_shader_atomic_counter_ops");
        GL_ARB_shader_atomic_counters = check_ARB_shader_atomic_counters(provider, caps, ext);
        GL_ARB_shader_ballot = ext.contains("GL_ARB_shader_ballot");
        GL_ARB_shader_bit_encoding = ext.contains("GL_ARB_shader_bit_encoding");
        GL_ARB_shader_clock = ext.contains("GL_ARB_shader_clock");
        GL_ARB_shader_draw_parameters = ext.contains("GL_ARB_shader_draw_parameters");
        GL_ARB_shader_group_vote = ext.contains("GL_ARB_shader_group_vote");
        GL_ARB_shader_image_load_store = check_ARB_shader_image_load_store(provider, caps, ext);
        GL_ARB_shader_image_size = ext.contains("GL_ARB_shader_image_size");
        GL_ARB_shader_objects = check_ARB_shader_objects(provider, caps, ext);
        GL_ARB_shader_precision = ext.contains("GL_ARB_shader_precision");
        GL_ARB_shader_stencil_export = ext.contains("GL_ARB_shader_stencil_export");
        GL_ARB_shader_storage_buffer_object = check_ARB_shader_storage_buffer_object(provider, caps, ext);
        GL_ARB_shader_subroutine = check_ARB_shader_subroutine(provider, caps, ext);
        GL_ARB_shader_texture_image_samples = ext.contains("GL_ARB_shader_texture_image_samples");
        GL_ARB_shader_texture_lod = ext.contains("GL_ARB_shader_texture_lod");
        GL_ARB_shader_viewport_layer_array = ext.contains("GL_ARB_shader_viewport_layer_array");
        GL_ARB_shading_language_100 = ext.contains("GL_ARB_shading_language_100");
        GL_ARB_shading_language_420pack = ext.contains("GL_ARB_shading_language_420pack");
        GL_ARB_shading_language_include = check_ARB_shading_language_include(provider, caps, ext);
        GL_ARB_shading_language_packing = ext.contains("GL_ARB_shading_language_packing");
        GL_ARB_shadow = ext.contains("GL_ARB_shadow");
        GL_ARB_shadow_ambient = ext.contains("GL_ARB_shadow_ambient");
        GL_ARB_sparse_buffer = check_ARB_sparse_buffer(provider, caps, ext);
        GL_ARB_sparse_texture = check_ARB_sparse_texture(provider, caps, ext);
        GL_ARB_sparse_texture2 = ext.contains("GL_ARB_sparse_texture2");
        GL_ARB_sparse_texture_clamp = ext.contains("GL_ARB_sparse_texture_clamp");
        GL_ARB_spirv_extensions = ext.contains("GL_ARB_spirv_extensions");
        GL_ARB_stencil_texturing = ext.contains("GL_ARB_stencil_texturing");
        GL_ARB_sync = check_ARB_sync(provider, caps, ext);
        GL_ARB_tessellation_shader = check_ARB_tessellation_shader(provider, caps, ext);
        GL_ARB_texture_barrier = check_ARB_texture_barrier(provider, caps, ext);
        GL_ARB_texture_border_clamp = ext.contains("GL_ARB_texture_border_clamp");
        GL_ARB_texture_buffer_object = check_ARB_texture_buffer_object(provider, caps, ext);
        GL_ARB_texture_buffer_object_rgb32 = ext.contains("GL_ARB_texture_buffer_object_rgb32");
        GL_ARB_texture_buffer_range = check_ARB_texture_buffer_range(provider, caps, ext);
        GL_ARB_texture_compression = check_ARB_texture_compression(provider, caps, ext);
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
        GL_ARB_texture_multisample = check_ARB_texture_multisample(provider, caps, ext);
        GL_ARB_texture_non_power_of_two = ext.contains("GL_ARB_texture_non_power_of_two");
        GL_ARB_texture_query_levels = ext.contains("GL_ARB_texture_query_levels");
        GL_ARB_texture_query_lod = ext.contains("GL_ARB_texture_query_lod");
        GL_ARB_texture_rectangle = ext.contains("GL_ARB_texture_rectangle");
        GL_ARB_texture_rg = ext.contains("GL_ARB_texture_rg");
        GL_ARB_texture_rgb10_a2ui = ext.contains("GL_ARB_texture_rgb10_a2ui");
        GL_ARB_texture_stencil8 = ext.contains("GL_ARB_texture_stencil8");
        GL_ARB_texture_storage = check_ARB_texture_storage(provider, caps, ext);
        GL_ARB_texture_storage_multisample = check_ARB_texture_storage_multisample(provider, caps, ext);
        GL_ARB_texture_swizzle = ext.contains("GL_ARB_texture_swizzle");
        GL_ARB_texture_view = check_ARB_texture_view(provider, caps, ext);
        GL_ARB_timer_query = check_ARB_timer_query(provider, caps, ext);
        GL_ARB_transform_feedback2 = check_ARB_transform_feedback2(provider, caps, ext);
        GL_ARB_transform_feedback3 = check_ARB_transform_feedback3(provider, caps, ext);
        GL_ARB_transform_feedback_instanced = check_ARB_transform_feedback_instanced(provider, caps, ext);
        GL_ARB_transform_feedback_overflow_query = ext.contains("GL_ARB_transform_feedback_overflow_query");
        GL_ARB_transpose_matrix = check_ARB_transpose_matrix(provider, caps, ext);
        GL_ARB_uniform_buffer_object = check_ARB_uniform_buffer_object(provider, caps, ext);
        GL_ARB_vertex_array_bgra = ext.contains("GL_ARB_vertex_array_bgra");
        GL_ARB_vertex_array_object = check_ARB_vertex_array_object(provider, caps, ext);
        GL_ARB_vertex_attrib_64bit = check_ARB_vertex_attrib_64bit(provider, caps, ext);
        GL_ARB_vertex_attrib_binding = check_ARB_vertex_attrib_binding(provider, caps, ext);
        GL_ARB_vertex_blend = check_ARB_vertex_blend(provider, caps, ext);
        GL_ARB_vertex_buffer_object = check_ARB_vertex_buffer_object(provider, caps, ext);
        GL_ARB_vertex_program = check_ARB_vertex_program(provider, caps, ext);
        GL_ARB_vertex_shader = check_ARB_vertex_shader(provider, caps, ext);
        GL_ARB_vertex_type_10f_11f_11f_rev = ext.contains("GL_ARB_vertex_type_10f_11f_11f_rev");
        GL_ARB_vertex_type_2_10_10_10_rev = check_ARB_vertex_type_2_10_10_10_rev(provider, caps, ext, fc);
        GL_ARB_viewport_array = check_ARB_viewport_array(provider, caps, ext);
        GL_ARB_window_pos = check_ARB_window_pos(provider, caps, ext);
        GL_ATI_meminfo = ext.contains("GL_ATI_meminfo");
        GL_ATI_shader_texture_lod = ext.contains("GL_ATI_shader_texture_lod");
        GL_ATI_texture_compression_3dc = ext.contains("GL_ATI_texture_compression_3dc");
        GL_EXT_422_pixels = ext.contains("GL_EXT_422_pixels");
        GL_EXT_abgr = ext.contains("GL_EXT_abgr");
        GL_EXT_bgra = ext.contains("GL_EXT_bgra");
        GL_EXT_bindable_uniform = check_EXT_bindable_uniform(provider, caps, ext);
        GL_EXT_blend_color = check_EXT_blend_color(provider, caps, ext);
        GL_EXT_blend_equation_separate = check_EXT_blend_equation_separate(provider, caps, ext);
        GL_EXT_blend_func_separate = check_EXT_blend_func_separate(provider, caps, ext);
        GL_EXT_blend_minmax = check_EXT_blend_minmax(provider, caps, ext);
        GL_EXT_blend_subtract = ext.contains("GL_EXT_blend_subtract");
        GL_EXT_clip_volume_hint = ext.contains("GL_EXT_clip_volume_hint");
        GL_EXT_compiled_vertex_array = check_EXT_compiled_vertex_array(provider, caps, ext);
        GL_EXT_debug_label = check_EXT_debug_label(provider, caps, ext);
        GL_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        GL_EXT_depth_bounds_test = check_EXT_depth_bounds_test(provider, caps, ext);
        GL_EXT_direct_state_access = check_EXT_direct_state_access(provider, caps, ext);
        GL_EXT_draw_buffers2 = check_EXT_draw_buffers2(provider, caps, ext);
        GL_EXT_draw_instanced = check_EXT_draw_instanced(provider, caps, ext);
        GL_EXT_EGL_image_storage = check_EXT_EGL_image_storage(provider, caps, ext);
        GL_EXT_EGL_sync = ext.contains("GL_EXT_EGL_sync");
        GL_EXT_external_buffer = check_EXT_external_buffer(provider, caps, ext);
        GL_EXT_fragment_shading_rate = check_EXT_fragment_shading_rate(provider, caps, ext);
        GL_EXT_fragment_shading_rate_attachment = ext.contains("GL_EXT_fragment_shading_rate_attachment");
        GL_EXT_fragment_shading_rate_primitive = ext.contains("GL_EXT_fragment_shading_rate_primitive");
        GL_EXT_framebuffer_blit = check_EXT_framebuffer_blit(provider, caps, ext);
        GL_EXT_framebuffer_blit_layers = check_EXT_framebuffer_blit_layers(provider, caps, ext);
        GL_EXT_framebuffer_multisample = check_EXT_framebuffer_multisample(provider, caps, ext);
        GL_EXT_framebuffer_multisample_blit_scaled = ext.contains("GL_EXT_framebuffer_multisample_blit_scaled");
        GL_EXT_framebuffer_object = check_EXT_framebuffer_object(provider, caps, ext);
        GL_EXT_framebuffer_sRGB = ext.contains("GL_EXT_framebuffer_sRGB");
        GL_EXT_geometry_shader4 = check_EXT_geometry_shader4(provider, caps, ext);
        GL_EXT_gpu_program_parameters = check_EXT_gpu_program_parameters(provider, caps, ext);
        GL_EXT_gpu_shader4 = check_EXT_gpu_shader4(provider, caps, ext);
        GL_EXT_memory_object = check_EXT_memory_object(provider, caps, ext);
        GL_EXT_memory_object_fd = check_EXT_memory_object_fd(provider, caps, ext);
        GL_EXT_memory_object_win32 = check_EXT_memory_object_win32(provider, caps, ext);
        GL_EXT_mesh_shader = check_EXT_mesh_shader(provider, caps, ext);
        GL_EXT_multiview_tessellation_geometry_shader = ext.contains("GL_EXT_multiview_tessellation_geometry_shader");
        GL_EXT_multiview_texture_multisample = ext.contains("GL_EXT_multiview_texture_multisample");
        GL_EXT_multiview_timer_query = ext.contains("GL_EXT_multiview_timer_query");
        GL_EXT_packed_depth_stencil = ext.contains("GL_EXT_packed_depth_stencil");
        GL_EXT_packed_float = ext.contains("GL_EXT_packed_float");
        GL_EXT_pixel_buffer_object = ext.contains("GL_EXT_pixel_buffer_object");
        GL_EXT_point_parameters = check_EXT_point_parameters(provider, caps, ext);
        GL_EXT_polygon_offset_clamp = check_EXT_polygon_offset_clamp(provider, caps, ext);
        GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
        GL_EXT_provoking_vertex = check_EXT_provoking_vertex(provider, caps, ext);
        GL_EXT_raster_multisample = check_EXT_raster_multisample(provider, caps, ext);
        GL_EXT_secondary_color = check_EXT_secondary_color(provider, caps, ext);
        GL_EXT_semaphore = check_EXT_semaphore(provider, caps, ext);
        GL_EXT_semaphore_fd = check_EXT_semaphore_fd(provider, caps, ext);
        GL_EXT_semaphore_win32 = check_EXT_semaphore_win32(provider, caps, ext);
        GL_EXT_separate_shader_objects = check_EXT_separate_shader_objects(provider, caps, ext);
        GL_EXT_shader_framebuffer_fetch = ext.contains("GL_EXT_shader_framebuffer_fetch");
        GL_EXT_shader_framebuffer_fetch_non_coherent = check_EXT_shader_framebuffer_fetch_non_coherent(provider, caps, ext);
        GL_EXT_shader_image_load_formatted = ext.contains("GL_EXT_shader_image_load_formatted");
        GL_EXT_shader_image_load_store = check_EXT_shader_image_load_store(provider, caps, ext);
        GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
        GL_EXT_shader_realtime_clock = ext.contains("GL_EXT_shader_realtime_clock");
        GL_EXT_shader_samples_identical = ext.contains("GL_EXT_shader_samples_identical");
        GL_EXT_shader_texture_samples = ext.contains("GL_EXT_shader_texture_samples");
        GL_EXT_shadow_funcs = ext.contains("GL_EXT_shadow_funcs");
        GL_EXT_shared_texture_palette = ext.contains("GL_EXT_shared_texture_palette");
        GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
        GL_EXT_stencil_clear_tag = check_EXT_stencil_clear_tag(provider, caps, ext);
        GL_EXT_stencil_two_side = check_EXT_stencil_two_side(provider, caps, ext);
        GL_EXT_stencil_wrap = ext.contains("GL_EXT_stencil_wrap");
        GL_EXT_texture_array = check_EXT_texture_array(provider, caps, ext);
        GL_EXT_texture_buffer_object = check_EXT_texture_buffer_object(provider, caps, ext);
        GL_EXT_texture_compression_latc = ext.contains("GL_EXT_texture_compression_latc");
        GL_EXT_texture_compression_rgtc = ext.contains("GL_EXT_texture_compression_rgtc");
        GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
        GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
        GL_EXT_texture_filter_minmax = ext.contains("GL_EXT_texture_filter_minmax");
        GL_EXT_texture_integer = check_EXT_texture_integer(provider, caps, ext);
        GL_EXT_texture_mirror_clamp = ext.contains("GL_EXT_texture_mirror_clamp");
        GL_EXT_texture_shadow_lod = ext.contains("GL_EXT_texture_shadow_lod");
        GL_EXT_texture_shared_exponent = ext.contains("GL_EXT_texture_shared_exponent");
        GL_EXT_texture_snorm = ext.contains("GL_EXT_texture_snorm");
        GL_EXT_texture_sRGB = ext.contains("GL_EXT_texture_sRGB");
        GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
        GL_EXT_texture_sRGB_R8 = ext.contains("GL_EXT_texture_sRGB_R8");
        GL_EXT_texture_sRGB_RG8 = ext.contains("GL_EXT_texture_sRGB_RG8");
        GL_EXT_texture_storage = check_EXT_texture_storage(provider, caps, ext);
        GL_EXT_texture_swizzle = ext.contains("GL_EXT_texture_swizzle");
        GL_EXT_timer_query = check_EXT_timer_query(provider, caps, ext);
        GL_EXT_transform_feedback = check_EXT_transform_feedback(provider, caps, ext);
        GL_EXT_vertex_array_bgra = ext.contains("GL_EXT_vertex_array_bgra");
        GL_EXT_vertex_attrib_64bit = check_EXT_vertex_attrib_64bit(provider, caps, ext);
        GL_EXT_win32_keyed_mutex = check_EXT_win32_keyed_mutex(provider, caps, ext);
        GL_EXT_window_rectangles = check_EXT_window_rectangles(provider, caps, ext);
        GL_EXT_x11_sync_object = check_EXT_x11_sync_object(provider, caps, ext);
        GL_GREMEDY_frame_terminator = check_GREMEDY_frame_terminator(provider, caps, ext);
        GL_GREMEDY_string_marker = check_GREMEDY_string_marker(provider, caps, ext);
        GL_INTEL_blackhole_render = ext.contains("GL_INTEL_blackhole_render");
        GL_INTEL_conservative_rasterization = ext.contains("GL_INTEL_conservative_rasterization");
        GL_INTEL_fragment_shader_ordering = ext.contains("GL_INTEL_fragment_shader_ordering");
        GL_INTEL_framebuffer_CMAA = check_INTEL_framebuffer_CMAA(provider, caps, ext);
        GL_INTEL_map_texture = check_INTEL_map_texture(provider, caps, ext);
        GL_INTEL_performance_query = check_INTEL_performance_query(provider, caps, ext);
        GL_INTEL_shader_integer_functions2 = ext.contains("GL_INTEL_shader_integer_functions2");
        GL_KHR_blend_equation_advanced = check_KHR_blend_equation_advanced(provider, caps, ext);
        GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
        GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
        GL_KHR_debug = check_KHR_debug(provider, caps, ext);
        GL_KHR_no_error = ext.contains("GL_KHR_no_error");
        GL_KHR_parallel_shader_compile = check_KHR_parallel_shader_compile(provider, caps, ext);
        GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
        GL_KHR_robustness = check_KHR_robustness(provider, caps, ext);
        GL_KHR_shader_subgroup = ext.contains("GL_KHR_shader_subgroup");
        GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
        GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
        GL_KHR_texture_compression_astc_sliced_3d = ext.contains("GL_KHR_texture_compression_astc_sliced_3d");
        GL_MESA_framebuffer_flip_x = ext.contains("GL_MESA_framebuffer_flip_x");
        GL_MESA_framebuffer_flip_y = check_MESA_framebuffer_flip_y(provider, caps, ext);
        GL_MESA_framebuffer_swap_xy = ext.contains("GL_MESA_framebuffer_swap_xy");
        GL_MESA_tile_raster_order = ext.contains("GL_MESA_tile_raster_order");
        GL_NV_alpha_to_coverage_dither_control = check_NV_alpha_to_coverage_dither_control(provider, caps, ext);
        GL_NV_bindless_multi_draw_indirect = check_NV_bindless_multi_draw_indirect(provider, caps, ext);
        GL_NV_bindless_multi_draw_indirect_count = check_NV_bindless_multi_draw_indirect_count(provider, caps, ext);
        GL_NV_bindless_texture = check_NV_bindless_texture(provider, caps, ext);
        GL_NV_blend_equation_advanced = check_NV_blend_equation_advanced(provider, caps, ext);
        GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
        GL_NV_blend_minmax_factor = ext.contains("GL_NV_blend_minmax_factor");
        GL_NV_blend_square = ext.contains("GL_NV_blend_square");
        GL_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        GL_NV_command_list = check_NV_command_list(provider, caps, ext);
        GL_NV_compute_shader_derivatives = ext.contains("GL_NV_compute_shader_derivatives");
        GL_NV_conditional_render = check_NV_conditional_render(provider, caps, ext);
        GL_NV_conservative_raster = check_NV_conservative_raster(provider, caps, ext);
        GL_NV_conservative_raster_dilate = check_NV_conservative_raster_dilate(provider, caps, ext);
        GL_NV_conservative_raster_pre_snap = ext.contains("GL_NV_conservative_raster_pre_snap");
        GL_NV_conservative_raster_pre_snap_triangles = check_NV_conservative_raster_pre_snap_triangles(provider, caps, ext);
        GL_NV_conservative_raster_underestimation = ext.contains("GL_NV_conservative_raster_underestimation");
        GL_NV_copy_depth_to_color = ext.contains("GL_NV_copy_depth_to_color");
        GL_NV_copy_image = check_NV_copy_image(provider, caps, ext);
        GL_NV_deep_texture3D = ext.contains("GL_NV_deep_texture3D");
        GL_NV_depth_buffer_float = check_NV_depth_buffer_float(provider, caps, ext);
        GL_NV_depth_clamp = ext.contains("GL_NV_depth_clamp");
        GL_NV_draw_texture = check_NV_draw_texture(provider, caps, ext);
        GL_NV_draw_vulkan_image = check_NV_draw_vulkan_image(provider, caps, ext);
        GL_NV_ES3_1_compatibility = ext.contains("GL_NV_ES3_1_compatibility");
        GL_NV_explicit_multisample = check_NV_explicit_multisample(provider, caps, ext);
        GL_NV_fence = check_NV_fence(provider, caps, ext);
        GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
        GL_NV_float_buffer = ext.contains("GL_NV_float_buffer");
        GL_NV_fog_distance = ext.contains("GL_NV_fog_distance");
        GL_NV_fragment_coverage_to_color = check_NV_fragment_coverage_to_color(provider, caps, ext);
        GL_NV_fragment_program4 = ext.contains("GL_NV_fragment_program4");
        GL_NV_fragment_program_option = ext.contains("GL_NV_fragment_program_option");
        GL_NV_fragment_shader_barycentric = ext.contains("GL_NV_fragment_shader_barycentric");
        GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
        GL_NV_framebuffer_mixed_samples = check_NV_framebuffer_mixed_samples(provider, caps, ext);
        GL_NV_framebuffer_multisample_coverage = check_NV_framebuffer_multisample_coverage(provider, caps, ext);
        GL_NV_geometry_shader4 = ext.contains("GL_NV_geometry_shader4");
        GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
        GL_NV_gpu_multicast = check_NV_gpu_multicast(provider, caps, ext);
        GL_NV_gpu_shader5 = check_NV_gpu_shader5(provider, caps, ext);
        GL_NV_half_float = check_NV_half_float(provider, caps, ext);
        GL_NV_internalformat_sample_query = check_NV_internalformat_sample_query(provider, caps, ext);
        GL_NV_light_max_exponent = ext.contains("GL_NV_light_max_exponent");
        GL_NV_memory_attachment = check_NV_memory_attachment(provider, caps, ext);
        GL_NV_memory_object_sparse = check_NV_memory_object_sparse(provider, caps, ext);
        GL_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        GL_NV_multisample_coverage = ext.contains("GL_NV_multisample_coverage");
        GL_NV_multisample_filter_hint = ext.contains("GL_NV_multisample_filter_hint");
        GL_NV_packed_depth_stencil = ext.contains("GL_NV_packed_depth_stencil");
        GL_NV_path_rendering = check_NV_path_rendering(provider, caps, ext);
        GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
        GL_NV_pixel_data_range = check_NV_pixel_data_range(provider, caps, ext);
        GL_NV_point_sprite = check_NV_point_sprite(provider, caps, ext);
        GL_NV_primitive_restart = check_NV_primitive_restart(provider, caps, ext);
        GL_NV_primitive_shading_rate = ext.contains("GL_NV_primitive_shading_rate");
        GL_NV_query_resource = check_NV_query_resource(provider, caps, ext);
        GL_NV_query_resource_tag = check_NV_query_resource_tag(provider, caps, ext);
        GL_NV_representative_fragment_test = ext.contains("GL_NV_representative_fragment_test");
        GL_NV_robustness_video_memory_purge = ext.contains("GL_NV_robustness_video_memory_purge");
        GL_NV_sample_locations = check_NV_sample_locations(provider, caps, ext);
        GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
        GL_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        GL_NV_shader_atomic_float = ext.contains("GL_NV_shader_atomic_float");
        GL_NV_shader_atomic_float64 = ext.contains("GL_NV_shader_atomic_float64");
        GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
        GL_NV_shader_atomic_int64 = ext.contains("GL_NV_shader_atomic_int64");
        GL_NV_shader_buffer_load = check_NV_shader_buffer_load(provider, caps, ext);
        GL_NV_shader_buffer_store = ext.contains("GL_NV_shader_buffer_store");
        GL_NV_shader_subgroup_partitioned = ext.contains("GL_NV_shader_subgroup_partitioned");
        GL_NV_shader_texture_footprint = ext.contains("GL_NV_shader_texture_footprint");
        GL_NV_shader_thread_group = ext.contains("GL_NV_shader_thread_group");
        GL_NV_shader_thread_shuffle = ext.contains("GL_NV_shader_thread_shuffle");
        GL_NV_shading_rate_image = check_NV_shading_rate_image(provider, caps, ext);
        GL_NV_stereo_view_rendering = ext.contains("GL_NV_stereo_view_rendering");
        GL_NV_texgen_reflection = ext.contains("GL_NV_texgen_reflection");
        GL_NV_texture_barrier = check_NV_texture_barrier(provider, caps, ext);
        GL_NV_texture_compression_vtc = ext.contains("GL_NV_texture_compression_vtc");
        GL_NV_texture_multisample = check_NV_texture_multisample(provider, caps, ext);
        GL_NV_texture_rectangle_compressed = ext.contains("GL_NV_texture_rectangle_compressed");
        GL_NV_texture_shader = ext.contains("GL_NV_texture_shader");
        GL_NV_texture_shader2 = ext.contains("GL_NV_texture_shader2");
        GL_NV_texture_shader3 = ext.contains("GL_NV_texture_shader3");
        GL_NV_timeline_semaphore = check_NV_timeline_semaphore(provider, caps, ext);
        GL_NV_transform_feedback = check_NV_transform_feedback(provider, caps, ext);
        GL_NV_transform_feedback2 = check_NV_transform_feedback2(provider, caps, ext);
        GL_NV_uniform_buffer_std430_layout = ext.contains("GL_NV_uniform_buffer_std430_layout");
        GL_NV_uniform_buffer_unified_memory = ext.contains("GL_NV_uniform_buffer_unified_memory");
        GL_NV_vertex_array_range = check_NV_vertex_array_range(provider, caps, ext);
        GL_NV_vertex_array_range2 = ext.contains("GL_NV_vertex_array_range2");
        GL_NV_vertex_attrib_integer_64bit = check_NV_vertex_attrib_integer_64bit(provider, caps, ext);
        GL_NV_vertex_buffer_unified_memory = check_NV_vertex_buffer_unified_memory(provider, caps, ext);
        GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
        GL_NV_viewport_swizzle = check_NV_viewport_swizzle(provider, caps, ext);
        GL_NVX_blend_equation_advanced_multi_draw_buffers = ext.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
        GL_NVX_conditional_render = check_NVX_conditional_render(provider, caps, ext);
        GL_NVX_gpu_memory_info = ext.contains("GL_NVX_gpu_memory_info");
        GL_NVX_gpu_multicast2 = check_NVX_gpu_multicast2(provider, caps, ext);
        GL_NVX_progress_fence = check_NVX_progress_fence(provider, caps, ext);
        GL_OVR_multiview = check_OVR_multiview(provider, caps, ext);
        GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
        GL_S3_s3tc = ext.contains("GL_S3_s3tc");

        glEnable = caps.get(0);
        glDisable = caps.get(1);
        glAccum = caps.get(2);
        glAlphaFunc = caps.get(3);
        glAreTexturesResident = caps.get(4);
        glArrayElement = caps.get(5);
        glBegin = caps.get(6);
        glBindTexture = caps.get(7);
        glBitmap = caps.get(8);
        glBlendFunc = caps.get(9);
        glCallList = caps.get(10);
        glCallLists = caps.get(11);
        glClear = caps.get(12);
        glClearAccum = caps.get(13);
        glClearColor = caps.get(14);
        glClearDepth = caps.get(15);
        glClearIndex = caps.get(16);
        glClearStencil = caps.get(17);
        glClipPlane = caps.get(18);
        glColor3b = caps.get(19);
        glColor3s = caps.get(20);
        glColor3i = caps.get(21);
        glColor3f = caps.get(22);
        glColor3d = caps.get(23);
        glColor3ub = caps.get(24);
        glColor3us = caps.get(25);
        glColor3ui = caps.get(26);
        glColor3bv = caps.get(27);
        glColor3sv = caps.get(28);
        glColor3iv = caps.get(29);
        glColor3fv = caps.get(30);
        glColor3dv = caps.get(31);
        glColor3ubv = caps.get(32);
        glColor3usv = caps.get(33);
        glColor3uiv = caps.get(34);
        glColor4b = caps.get(35);
        glColor4s = caps.get(36);
        glColor4i = caps.get(37);
        glColor4f = caps.get(38);
        glColor4d = caps.get(39);
        glColor4ub = caps.get(40);
        glColor4us = caps.get(41);
        glColor4ui = caps.get(42);
        glColor4bv = caps.get(43);
        glColor4sv = caps.get(44);
        glColor4iv = caps.get(45);
        glColor4fv = caps.get(46);
        glColor4dv = caps.get(47);
        glColor4ubv = caps.get(48);
        glColor4usv = caps.get(49);
        glColor4uiv = caps.get(50);
        glColorMask = caps.get(51);
        glColorMaterial = caps.get(52);
        glColorPointer = caps.get(53);
        glCopyPixels = caps.get(54);
        glCullFace = caps.get(55);
        glDeleteLists = caps.get(56);
        glDepthFunc = caps.get(57);
        glDepthMask = caps.get(58);
        glDepthRange = caps.get(59);
        glDisableClientState = caps.get(60);
        glDrawArrays = caps.get(61);
        glDrawBuffer = caps.get(62);
        glDrawElements = caps.get(63);
        glDrawPixels = caps.get(64);
        glEdgeFlag = caps.get(65);
        glEdgeFlagv = caps.get(66);
        glEdgeFlagPointer = caps.get(67);
        glEnableClientState = caps.get(68);
        glEnd = caps.get(69);
        glEvalCoord1f = caps.get(70);
        glEvalCoord1fv = caps.get(71);
        glEvalCoord1d = caps.get(72);
        glEvalCoord1dv = caps.get(73);
        glEvalCoord2f = caps.get(74);
        glEvalCoord2fv = caps.get(75);
        glEvalCoord2d = caps.get(76);
        glEvalCoord2dv = caps.get(77);
        glEvalMesh1 = caps.get(78);
        glEvalMesh2 = caps.get(79);
        glEvalPoint1 = caps.get(80);
        glEvalPoint2 = caps.get(81);
        glFeedbackBuffer = caps.get(82);
        glFinish = caps.get(83);
        glFlush = caps.get(84);
        glFogi = caps.get(85);
        glFogiv = caps.get(86);
        glFogf = caps.get(87);
        glFogfv = caps.get(88);
        glFrontFace = caps.get(89);
        glGenLists = caps.get(90);
        glGenTextures = caps.get(91);
        glDeleteTextures = caps.get(92);
        glGetClipPlane = caps.get(93);
        glGetBooleanv = caps.get(94);
        glGetFloatv = caps.get(95);
        glGetIntegerv = caps.get(96);
        glGetDoublev = caps.get(97);
        glGetError = caps.get(98);
        glGetLightiv = caps.get(99);
        glGetLightfv = caps.get(100);
        glGetMapiv = caps.get(101);
        glGetMapfv = caps.get(102);
        glGetMapdv = caps.get(103);
        glGetMaterialiv = caps.get(104);
        glGetMaterialfv = caps.get(105);
        glGetPixelMapfv = caps.get(106);
        glGetPixelMapusv = caps.get(107);
        glGetPixelMapuiv = caps.get(108);
        glGetPointerv = caps.get(109);
        glGetPolygonStipple = caps.get(110);
        glGetString = caps.get(111);
        glGetTexEnviv = caps.get(112);
        glGetTexEnvfv = caps.get(113);
        glGetTexGeniv = caps.get(114);
        glGetTexGenfv = caps.get(115);
        glGetTexGendv = caps.get(116);
        glGetTexImage = caps.get(117);
        glGetTexLevelParameteriv = caps.get(118);
        glGetTexLevelParameterfv = caps.get(119);
        glGetTexParameteriv = caps.get(120);
        glGetTexParameterfv = caps.get(121);
        glHint = caps.get(122);
        glIndexi = caps.get(123);
        glIndexub = caps.get(124);
        glIndexs = caps.get(125);
        glIndexf = caps.get(126);
        glIndexd = caps.get(127);
        glIndexiv = caps.get(128);
        glIndexubv = caps.get(129);
        glIndexsv = caps.get(130);
        glIndexfv = caps.get(131);
        glIndexdv = caps.get(132);
        glIndexMask = caps.get(133);
        glIndexPointer = caps.get(134);
        glInitNames = caps.get(135);
        glInterleavedArrays = caps.get(136);
        glIsEnabled = caps.get(137);
        glIsList = caps.get(138);
        glIsTexture = caps.get(139);
        glLightModeli = caps.get(140);
        glLightModelf = caps.get(141);
        glLightModeliv = caps.get(142);
        glLightModelfv = caps.get(143);
        glLighti = caps.get(144);
        glLightf = caps.get(145);
        glLightiv = caps.get(146);
        glLightfv = caps.get(147);
        glLineStipple = caps.get(148);
        glLineWidth = caps.get(149);
        glListBase = caps.get(150);
        glLoadMatrixf = caps.get(151);
        glLoadMatrixd = caps.get(152);
        glLoadIdentity = caps.get(153);
        glLoadName = caps.get(154);
        glLogicOp = caps.get(155);
        glMap1f = caps.get(156);
        glMap1d = caps.get(157);
        glMap2f = caps.get(158);
        glMap2d = caps.get(159);
        glMapGrid1f = caps.get(160);
        glMapGrid1d = caps.get(161);
        glMapGrid2f = caps.get(162);
        glMapGrid2d = caps.get(163);
        glMateriali = caps.get(164);
        glMaterialf = caps.get(165);
        glMaterialiv = caps.get(166);
        glMaterialfv = caps.get(167);
        glMatrixMode = caps.get(168);
        glMultMatrixf = caps.get(169);
        glMultMatrixd = caps.get(170);
        glFrustum = caps.get(171);
        glNewList = caps.get(172);
        glEndList = caps.get(173);
        glNormal3f = caps.get(174);
        glNormal3b = caps.get(175);
        glNormal3s = caps.get(176);
        glNormal3i = caps.get(177);
        glNormal3d = caps.get(178);
        glNormal3fv = caps.get(179);
        glNormal3bv = caps.get(180);
        glNormal3sv = caps.get(181);
        glNormal3iv = caps.get(182);
        glNormal3dv = caps.get(183);
        glNormalPointer = caps.get(184);
        glOrtho = caps.get(185);
        glPassThrough = caps.get(186);
        glPixelMapfv = caps.get(187);
        glPixelMapusv = caps.get(188);
        glPixelMapuiv = caps.get(189);
        glPixelStorei = caps.get(190);
        glPixelStoref = caps.get(191);
        glPixelTransferi = caps.get(192);
        glPixelTransferf = caps.get(193);
        glPixelZoom = caps.get(194);
        glPointSize = caps.get(195);
        glPolygonMode = caps.get(196);
        glPolygonOffset = caps.get(197);
        glPolygonStipple = caps.get(198);
        glPushAttrib = caps.get(199);
        glPushClientAttrib = caps.get(200);
        glPopAttrib = caps.get(201);
        glPopClientAttrib = caps.get(202);
        glPopMatrix = caps.get(203);
        glPopName = caps.get(204);
        glPrioritizeTextures = caps.get(205);
        glPushMatrix = caps.get(206);
        glPushName = caps.get(207);
        glRasterPos2i = caps.get(208);
        glRasterPos2s = caps.get(209);
        glRasterPos2f = caps.get(210);
        glRasterPos2d = caps.get(211);
        glRasterPos2iv = caps.get(212);
        glRasterPos2sv = caps.get(213);
        glRasterPos2fv = caps.get(214);
        glRasterPos2dv = caps.get(215);
        glRasterPos3i = caps.get(216);
        glRasterPos3s = caps.get(217);
        glRasterPos3f = caps.get(218);
        glRasterPos3d = caps.get(219);
        glRasterPos3iv = caps.get(220);
        glRasterPos3sv = caps.get(221);
        glRasterPos3fv = caps.get(222);
        glRasterPos3dv = caps.get(223);
        glRasterPos4i = caps.get(224);
        glRasterPos4s = caps.get(225);
        glRasterPos4f = caps.get(226);
        glRasterPos4d = caps.get(227);
        glRasterPos4iv = caps.get(228);
        glRasterPos4sv = caps.get(229);
        glRasterPos4fv = caps.get(230);
        glRasterPos4dv = caps.get(231);
        glReadBuffer = caps.get(232);
        glReadPixels = caps.get(233);
        glRecti = caps.get(234);
        glRects = caps.get(235);
        glRectf = caps.get(236);
        glRectd = caps.get(237);
        glRectiv = caps.get(238);
        glRectsv = caps.get(239);
        glRectfv = caps.get(240);
        glRectdv = caps.get(241);
        glRenderMode = caps.get(242);
        glRotatef = caps.get(243);
        glRotated = caps.get(244);
        glScalef = caps.get(245);
        glScaled = caps.get(246);
        glScissor = caps.get(247);
        glSelectBuffer = caps.get(248);
        glShadeModel = caps.get(249);
        glStencilFunc = caps.get(250);
        glStencilMask = caps.get(251);
        glStencilOp = caps.get(252);
        glTexCoord1f = caps.get(253);
        glTexCoord1s = caps.get(254);
        glTexCoord1i = caps.get(255);
        glTexCoord1d = caps.get(256);
        glTexCoord1fv = caps.get(257);
        glTexCoord1sv = caps.get(258);
        glTexCoord1iv = caps.get(259);
        glTexCoord1dv = caps.get(260);
        glTexCoord2f = caps.get(261);
        glTexCoord2s = caps.get(262);
        glTexCoord2i = caps.get(263);
        glTexCoord2d = caps.get(264);
        glTexCoord2fv = caps.get(265);
        glTexCoord2sv = caps.get(266);
        glTexCoord2iv = caps.get(267);
        glTexCoord2dv = caps.get(268);
        glTexCoord3f = caps.get(269);
        glTexCoord3s = caps.get(270);
        glTexCoord3i = caps.get(271);
        glTexCoord3d = caps.get(272);
        glTexCoord3fv = caps.get(273);
        glTexCoord3sv = caps.get(274);
        glTexCoord3iv = caps.get(275);
        glTexCoord3dv = caps.get(276);
        glTexCoord4f = caps.get(277);
        glTexCoord4s = caps.get(278);
        glTexCoord4i = caps.get(279);
        glTexCoord4d = caps.get(280);
        glTexCoord4fv = caps.get(281);
        glTexCoord4sv = caps.get(282);
        glTexCoord4iv = caps.get(283);
        glTexCoord4dv = caps.get(284);
        glTexCoordPointer = caps.get(285);
        glTexEnvi = caps.get(286);
        glTexEnviv = caps.get(287);
        glTexEnvf = caps.get(288);
        glTexEnvfv = caps.get(289);
        glTexGeni = caps.get(290);
        glTexGeniv = caps.get(291);
        glTexGenf = caps.get(292);
        glTexGenfv = caps.get(293);
        glTexGend = caps.get(294);
        glTexGendv = caps.get(295);
        glTexImage1D = caps.get(296);
        glTexImage2D = caps.get(297);
        glCopyTexImage1D = caps.get(298);
        glCopyTexImage2D = caps.get(299);
        glCopyTexSubImage1D = caps.get(300);
        glCopyTexSubImage2D = caps.get(301);
        glTexParameteri = caps.get(302);
        glTexParameteriv = caps.get(303);
        glTexParameterf = caps.get(304);
        glTexParameterfv = caps.get(305);
        glTexSubImage1D = caps.get(306);
        glTexSubImage2D = caps.get(307);
        glTranslatef = caps.get(308);
        glTranslated = caps.get(309);
        glVertex2f = caps.get(310);
        glVertex2s = caps.get(311);
        glVertex2i = caps.get(312);
        glVertex2d = caps.get(313);
        glVertex2fv = caps.get(314);
        glVertex2sv = caps.get(315);
        glVertex2iv = caps.get(316);
        glVertex2dv = caps.get(317);
        glVertex3f = caps.get(318);
        glVertex3s = caps.get(319);
        glVertex3i = caps.get(320);
        glVertex3d = caps.get(321);
        glVertex3fv = caps.get(322);
        glVertex3sv = caps.get(323);
        glVertex3iv = caps.get(324);
        glVertex3dv = caps.get(325);
        glVertex4f = caps.get(326);
        glVertex4s = caps.get(327);
        glVertex4i = caps.get(328);
        glVertex4d = caps.get(329);
        glVertex4fv = caps.get(330);
        glVertex4sv = caps.get(331);
        glVertex4iv = caps.get(332);
        glVertex4dv = caps.get(333);
        glVertexPointer = caps.get(334);
        glViewport = caps.get(335);
        glTexImage3D = caps.get(336);
        glTexSubImage3D = caps.get(337);
        glCopyTexSubImage3D = caps.get(338);
        glDrawRangeElements = caps.get(339);
        glCompressedTexImage3D = caps.get(340);
        glCompressedTexImage2D = caps.get(341);
        glCompressedTexImage1D = caps.get(342);
        glCompressedTexSubImage3D = caps.get(343);
        glCompressedTexSubImage2D = caps.get(344);
        glCompressedTexSubImage1D = caps.get(345);
        glGetCompressedTexImage = caps.get(346);
        glSampleCoverage = caps.get(347);
        glActiveTexture = caps.get(348);
        glClientActiveTexture = caps.get(349);
        glMultiTexCoord1f = caps.get(350);
        glMultiTexCoord1s = caps.get(351);
        glMultiTexCoord1i = caps.get(352);
        glMultiTexCoord1d = caps.get(353);
        glMultiTexCoord1fv = caps.get(354);
        glMultiTexCoord1sv = caps.get(355);
        glMultiTexCoord1iv = caps.get(356);
        glMultiTexCoord1dv = caps.get(357);
        glMultiTexCoord2f = caps.get(358);
        glMultiTexCoord2s = caps.get(359);
        glMultiTexCoord2i = caps.get(360);
        glMultiTexCoord2d = caps.get(361);
        glMultiTexCoord2fv = caps.get(362);
        glMultiTexCoord2sv = caps.get(363);
        glMultiTexCoord2iv = caps.get(364);
        glMultiTexCoord2dv = caps.get(365);
        glMultiTexCoord3f = caps.get(366);
        glMultiTexCoord3s = caps.get(367);
        glMultiTexCoord3i = caps.get(368);
        glMultiTexCoord3d = caps.get(369);
        glMultiTexCoord3fv = caps.get(370);
        glMultiTexCoord3sv = caps.get(371);
        glMultiTexCoord3iv = caps.get(372);
        glMultiTexCoord3dv = caps.get(373);
        glMultiTexCoord4f = caps.get(374);
        glMultiTexCoord4s = caps.get(375);
        glMultiTexCoord4i = caps.get(376);
        glMultiTexCoord4d = caps.get(377);
        glMultiTexCoord4fv = caps.get(378);
        glMultiTexCoord4sv = caps.get(379);
        glMultiTexCoord4iv = caps.get(380);
        glMultiTexCoord4dv = caps.get(381);
        glLoadTransposeMatrixf = caps.get(382);
        glLoadTransposeMatrixd = caps.get(383);
        glMultTransposeMatrixf = caps.get(384);
        glMultTransposeMatrixd = caps.get(385);
        glBlendColor = caps.get(386);
        glBlendEquation = caps.get(387);
        glFogCoordf = caps.get(388);
        glFogCoordd = caps.get(389);
        glFogCoordfv = caps.get(390);
        glFogCoorddv = caps.get(391);
        glFogCoordPointer = caps.get(392);
        glMultiDrawArrays = caps.get(393);
        glMultiDrawElements = caps.get(394);
        glPointParameterf = caps.get(395);
        glPointParameteri = caps.get(396);
        glPointParameterfv = caps.get(397);
        glPointParameteriv = caps.get(398);
        glSecondaryColor3b = caps.get(399);
        glSecondaryColor3s = caps.get(400);
        glSecondaryColor3i = caps.get(401);
        glSecondaryColor3f = caps.get(402);
        glSecondaryColor3d = caps.get(403);
        glSecondaryColor3ub = caps.get(404);
        glSecondaryColor3us = caps.get(405);
        glSecondaryColor3ui = caps.get(406);
        glSecondaryColor3bv = caps.get(407);
        glSecondaryColor3sv = caps.get(408);
        glSecondaryColor3iv = caps.get(409);
        glSecondaryColor3fv = caps.get(410);
        glSecondaryColor3dv = caps.get(411);
        glSecondaryColor3ubv = caps.get(412);
        glSecondaryColor3usv = caps.get(413);
        glSecondaryColor3uiv = caps.get(414);
        glSecondaryColorPointer = caps.get(415);
        glBlendFuncSeparate = caps.get(416);
        glWindowPos2i = caps.get(417);
        glWindowPos2s = caps.get(418);
        glWindowPos2f = caps.get(419);
        glWindowPos2d = caps.get(420);
        glWindowPos2iv = caps.get(421);
        glWindowPos2sv = caps.get(422);
        glWindowPos2fv = caps.get(423);
        glWindowPos2dv = caps.get(424);
        glWindowPos3i = caps.get(425);
        glWindowPos3s = caps.get(426);
        glWindowPos3f = caps.get(427);
        glWindowPos3d = caps.get(428);
        glWindowPos3iv = caps.get(429);
        glWindowPos3sv = caps.get(430);
        glWindowPos3fv = caps.get(431);
        glWindowPos3dv = caps.get(432);
        glBindBuffer = caps.get(433);
        glDeleteBuffers = caps.get(434);
        glGenBuffers = caps.get(435);
        glIsBuffer = caps.get(436);
        glBufferData = caps.get(437);
        glBufferSubData = caps.get(438);
        glGetBufferSubData = caps.get(439);
        glMapBuffer = caps.get(440);
        glUnmapBuffer = caps.get(441);
        glGetBufferParameteriv = caps.get(442);
        glGetBufferPointerv = caps.get(443);
        glGenQueries = caps.get(444);
        glDeleteQueries = caps.get(445);
        glIsQuery = caps.get(446);
        glBeginQuery = caps.get(447);
        glEndQuery = caps.get(448);
        glGetQueryiv = caps.get(449);
        glGetQueryObjectiv = caps.get(450);
        glGetQueryObjectuiv = caps.get(451);
        glCreateProgram = caps.get(452);
        glDeleteProgram = caps.get(453);
        glIsProgram = caps.get(454);
        glCreateShader = caps.get(455);
        glDeleteShader = caps.get(456);
        glIsShader = caps.get(457);
        glAttachShader = caps.get(458);
        glDetachShader = caps.get(459);
        glShaderSource = caps.get(460);
        glCompileShader = caps.get(461);
        glLinkProgram = caps.get(462);
        glUseProgram = caps.get(463);
        glValidateProgram = caps.get(464);
        glUniform1f = caps.get(465);
        glUniform2f = caps.get(466);
        glUniform3f = caps.get(467);
        glUniform4f = caps.get(468);
        glUniform1i = caps.get(469);
        glUniform2i = caps.get(470);
        glUniform3i = caps.get(471);
        glUniform4i = caps.get(472);
        glUniform1fv = caps.get(473);
        glUniform2fv = caps.get(474);
        glUniform3fv = caps.get(475);
        glUniform4fv = caps.get(476);
        glUniform1iv = caps.get(477);
        glUniform2iv = caps.get(478);
        glUniform3iv = caps.get(479);
        glUniform4iv = caps.get(480);
        glUniformMatrix2fv = caps.get(481);
        glUniformMatrix3fv = caps.get(482);
        glUniformMatrix4fv = caps.get(483);
        glGetShaderiv = caps.get(484);
        glGetProgramiv = caps.get(485);
        glGetShaderInfoLog = caps.get(486);
        glGetProgramInfoLog = caps.get(487);
        glGetAttachedShaders = caps.get(488);
        glGetUniformLocation = caps.get(489);
        glGetActiveUniform = caps.get(490);
        glGetUniformfv = caps.get(491);
        glGetUniformiv = caps.get(492);
        glGetShaderSource = caps.get(493);
        glVertexAttrib1f = caps.get(494);
        glVertexAttrib1s = caps.get(495);
        glVertexAttrib1d = caps.get(496);
        glVertexAttrib2f = caps.get(497);
        glVertexAttrib2s = caps.get(498);
        glVertexAttrib2d = caps.get(499);
        glVertexAttrib3f = caps.get(500);
        glVertexAttrib3s = caps.get(501);
        glVertexAttrib3d = caps.get(502);
        glVertexAttrib4f = caps.get(503);
        glVertexAttrib4s = caps.get(504);
        glVertexAttrib4d = caps.get(505);
        glVertexAttrib4Nub = caps.get(506);
        glVertexAttrib1fv = caps.get(507);
        glVertexAttrib1sv = caps.get(508);
        glVertexAttrib1dv = caps.get(509);
        glVertexAttrib2fv = caps.get(510);
        glVertexAttrib2sv = caps.get(511);
        glVertexAttrib2dv = caps.get(512);
        glVertexAttrib3fv = caps.get(513);
        glVertexAttrib3sv = caps.get(514);
        glVertexAttrib3dv = caps.get(515);
        glVertexAttrib4fv = caps.get(516);
        glVertexAttrib4sv = caps.get(517);
        glVertexAttrib4dv = caps.get(518);
        glVertexAttrib4iv = caps.get(519);
        glVertexAttrib4bv = caps.get(520);
        glVertexAttrib4ubv = caps.get(521);
        glVertexAttrib4usv = caps.get(522);
        glVertexAttrib4uiv = caps.get(523);
        glVertexAttrib4Nbv = caps.get(524);
        glVertexAttrib4Nsv = caps.get(525);
        glVertexAttrib4Niv = caps.get(526);
        glVertexAttrib4Nubv = caps.get(527);
        glVertexAttrib4Nusv = caps.get(528);
        glVertexAttrib4Nuiv = caps.get(529);
        glVertexAttribPointer = caps.get(530);
        glEnableVertexAttribArray = caps.get(531);
        glDisableVertexAttribArray = caps.get(532);
        glBindAttribLocation = caps.get(533);
        glGetActiveAttrib = caps.get(534);
        glGetAttribLocation = caps.get(535);
        glGetVertexAttribiv = caps.get(536);
        glGetVertexAttribfv = caps.get(537);
        glGetVertexAttribdv = caps.get(538);
        glGetVertexAttribPointerv = caps.get(539);
        glDrawBuffers = caps.get(540);
        glBlendEquationSeparate = caps.get(541);
        glStencilOpSeparate = caps.get(542);
        glStencilFuncSeparate = caps.get(543);
        glStencilMaskSeparate = caps.get(544);
        glUniformMatrix2x3fv = caps.get(545);
        glUniformMatrix3x2fv = caps.get(546);
        glUniformMatrix2x4fv = caps.get(547);
        glUniformMatrix4x2fv = caps.get(548);
        glUniformMatrix3x4fv = caps.get(549);
        glUniformMatrix4x3fv = caps.get(550);
        glGetStringi = caps.get(551);
        glClearBufferiv = caps.get(552);
        glClearBufferuiv = caps.get(553);
        glClearBufferfv = caps.get(554);
        glClearBufferfi = caps.get(555);
        glVertexAttribI1i = caps.get(556);
        glVertexAttribI2i = caps.get(557);
        glVertexAttribI3i = caps.get(558);
        glVertexAttribI4i = caps.get(559);
        glVertexAttribI1ui = caps.get(560);
        glVertexAttribI2ui = caps.get(561);
        glVertexAttribI3ui = caps.get(562);
        glVertexAttribI4ui = caps.get(563);
        glVertexAttribI1iv = caps.get(564);
        glVertexAttribI2iv = caps.get(565);
        glVertexAttribI3iv = caps.get(566);
        glVertexAttribI4iv = caps.get(567);
        glVertexAttribI1uiv = caps.get(568);
        glVertexAttribI2uiv = caps.get(569);
        glVertexAttribI3uiv = caps.get(570);
        glVertexAttribI4uiv = caps.get(571);
        glVertexAttribI4bv = caps.get(572);
        glVertexAttribI4sv = caps.get(573);
        glVertexAttribI4ubv = caps.get(574);
        glVertexAttribI4usv = caps.get(575);
        glVertexAttribIPointer = caps.get(576);
        glGetVertexAttribIiv = caps.get(577);
        glGetVertexAttribIuiv = caps.get(578);
        glUniform1ui = caps.get(579);
        glUniform2ui = caps.get(580);
        glUniform3ui = caps.get(581);
        glUniform4ui = caps.get(582);
        glUniform1uiv = caps.get(583);
        glUniform2uiv = caps.get(584);
        glUniform3uiv = caps.get(585);
        glUniform4uiv = caps.get(586);
        glGetUniformuiv = caps.get(587);
        glBindFragDataLocation = caps.get(588);
        glGetFragDataLocation = caps.get(589);
        glBeginConditionalRender = caps.get(590);
        glEndConditionalRender = caps.get(591);
        glMapBufferRange = caps.get(592);
        glFlushMappedBufferRange = caps.get(593);
        glClampColor = caps.get(594);
        glIsRenderbuffer = caps.get(595);
        glBindRenderbuffer = caps.get(596);
        glDeleteRenderbuffers = caps.get(597);
        glGenRenderbuffers = caps.get(598);
        glRenderbufferStorage = caps.get(599);
        glRenderbufferStorageMultisample = caps.get(600);
        glGetRenderbufferParameteriv = caps.get(601);
        glIsFramebuffer = caps.get(602);
        glBindFramebuffer = caps.get(603);
        glDeleteFramebuffers = caps.get(604);
        glGenFramebuffers = caps.get(605);
        glCheckFramebufferStatus = caps.get(606);
        glFramebufferTexture1D = caps.get(607);
        glFramebufferTexture2D = caps.get(608);
        glFramebufferTexture3D = caps.get(609);
        glFramebufferTextureLayer = caps.get(610);
        glFramebufferRenderbuffer = caps.get(611);
        glGetFramebufferAttachmentParameteriv = caps.get(612);
        glBlitFramebuffer = caps.get(613);
        glGenerateMipmap = caps.get(614);
        glTexParameterIiv = caps.get(615);
        glTexParameterIuiv = caps.get(616);
        glGetTexParameterIiv = caps.get(617);
        glGetTexParameterIuiv = caps.get(618);
        glColorMaski = caps.get(619);
        glGetBooleani_v = caps.get(620);
        glGetIntegeri_v = caps.get(621);
        glEnablei = caps.get(622);
        glDisablei = caps.get(623);
        glIsEnabledi = caps.get(624);
        glBindBufferRange = caps.get(625);
        glBindBufferBase = caps.get(626);
        glBeginTransformFeedback = caps.get(627);
        glEndTransformFeedback = caps.get(628);
        glTransformFeedbackVaryings = caps.get(629);
        glGetTransformFeedbackVarying = caps.get(630);
        glBindVertexArray = caps.get(631);
        glDeleteVertexArrays = caps.get(632);
        glGenVertexArrays = caps.get(633);
        glIsVertexArray = caps.get(634);
        glDrawArraysInstanced = caps.get(635);
        glDrawElementsInstanced = caps.get(636);
        glCopyBufferSubData = caps.get(637);
        glPrimitiveRestartIndex = caps.get(638);
        glTexBuffer = caps.get(639);
        glGetUniformIndices = caps.get(640);
        glGetActiveUniformsiv = caps.get(641);
        glGetActiveUniformName = caps.get(642);
        glGetUniformBlockIndex = caps.get(643);
        glGetActiveUniformBlockiv = caps.get(644);
        glGetActiveUniformBlockName = caps.get(645);
        glUniformBlockBinding = caps.get(646);
        glGetBufferParameteri64v = caps.get(647);
        glDrawElementsBaseVertex = caps.get(648);
        glDrawRangeElementsBaseVertex = caps.get(649);
        glDrawElementsInstancedBaseVertex = caps.get(650);
        glMultiDrawElementsBaseVertex = caps.get(651);
        glProvokingVertex = caps.get(652);
        glTexImage2DMultisample = caps.get(653);
        glTexImage3DMultisample = caps.get(654);
        glGetMultisamplefv = caps.get(655);
        glSampleMaski = caps.get(656);
        glFramebufferTexture = caps.get(657);
        glFenceSync = caps.get(658);
        glIsSync = caps.get(659);
        glDeleteSync = caps.get(660);
        glClientWaitSync = caps.get(661);
        glWaitSync = caps.get(662);
        glGetInteger64v = caps.get(663);
        glGetInteger64i_v = caps.get(664);
        glGetSynciv = caps.get(665);
        glBindFragDataLocationIndexed = caps.get(666);
        glGetFragDataIndex = caps.get(667);
        glGenSamplers = caps.get(668);
        glDeleteSamplers = caps.get(669);
        glIsSampler = caps.get(670);
        glBindSampler = caps.get(671);
        glSamplerParameteri = caps.get(672);
        glSamplerParameterf = caps.get(673);
        glSamplerParameteriv = caps.get(674);
        glSamplerParameterfv = caps.get(675);
        glSamplerParameterIiv = caps.get(676);
        glSamplerParameterIuiv = caps.get(677);
        glGetSamplerParameteriv = caps.get(678);
        glGetSamplerParameterfv = caps.get(679);
        glGetSamplerParameterIiv = caps.get(680);
        glGetSamplerParameterIuiv = caps.get(681);
        glQueryCounter = caps.get(682);
        glGetQueryObjecti64v = caps.get(683);
        glGetQueryObjectui64v = caps.get(684);
        glVertexAttribDivisor = caps.get(685);
        glVertexP2ui = caps.get(686);
        glVertexP3ui = caps.get(687);
        glVertexP4ui = caps.get(688);
        glVertexP2uiv = caps.get(689);
        glVertexP3uiv = caps.get(690);
        glVertexP4uiv = caps.get(691);
        glTexCoordP1ui = caps.get(692);
        glTexCoordP2ui = caps.get(693);
        glTexCoordP3ui = caps.get(694);
        glTexCoordP4ui = caps.get(695);
        glTexCoordP1uiv = caps.get(696);
        glTexCoordP2uiv = caps.get(697);
        glTexCoordP3uiv = caps.get(698);
        glTexCoordP4uiv = caps.get(699);
        glMultiTexCoordP1ui = caps.get(700);
        glMultiTexCoordP2ui = caps.get(701);
        glMultiTexCoordP3ui = caps.get(702);
        glMultiTexCoordP4ui = caps.get(703);
        glMultiTexCoordP1uiv = caps.get(704);
        glMultiTexCoordP2uiv = caps.get(705);
        glMultiTexCoordP3uiv = caps.get(706);
        glMultiTexCoordP4uiv = caps.get(707);
        glNormalP3ui = caps.get(708);
        glNormalP3uiv = caps.get(709);
        glColorP3ui = caps.get(710);
        glColorP4ui = caps.get(711);
        glColorP3uiv = caps.get(712);
        glColorP4uiv = caps.get(713);
        glSecondaryColorP3ui = caps.get(714);
        glSecondaryColorP3uiv = caps.get(715);
        glVertexAttribP1ui = caps.get(716);
        glVertexAttribP2ui = caps.get(717);
        glVertexAttribP3ui = caps.get(718);
        glVertexAttribP4ui = caps.get(719);
        glVertexAttribP1uiv = caps.get(720);
        glVertexAttribP2uiv = caps.get(721);
        glVertexAttribP3uiv = caps.get(722);
        glVertexAttribP4uiv = caps.get(723);
        glBlendEquationi = caps.get(724);
        glBlendEquationSeparatei = caps.get(725);
        glBlendFunci = caps.get(726);
        glBlendFuncSeparatei = caps.get(727);
        glDrawArraysIndirect = caps.get(728);
        glDrawElementsIndirect = caps.get(729);
        glUniform1d = caps.get(730);
        glUniform2d = caps.get(731);
        glUniform3d = caps.get(732);
        glUniform4d = caps.get(733);
        glUniform1dv = caps.get(734);
        glUniform2dv = caps.get(735);
        glUniform3dv = caps.get(736);
        glUniform4dv = caps.get(737);
        glUniformMatrix2dv = caps.get(738);
        glUniformMatrix3dv = caps.get(739);
        glUniformMatrix4dv = caps.get(740);
        glUniformMatrix2x3dv = caps.get(741);
        glUniformMatrix2x4dv = caps.get(742);
        glUniformMatrix3x2dv = caps.get(743);
        glUniformMatrix3x4dv = caps.get(744);
        glUniformMatrix4x2dv = caps.get(745);
        glUniformMatrix4x3dv = caps.get(746);
        glGetUniformdv = caps.get(747);
        glMinSampleShading = caps.get(748);
        glGetSubroutineUniformLocation = caps.get(749);
        glGetSubroutineIndex = caps.get(750);
        glGetActiveSubroutineUniformiv = caps.get(751);
        glGetActiveSubroutineUniformName = caps.get(752);
        glGetActiveSubroutineName = caps.get(753);
        glUniformSubroutinesuiv = caps.get(754);
        glGetUniformSubroutineuiv = caps.get(755);
        glGetProgramStageiv = caps.get(756);
        glPatchParameteri = caps.get(757);
        glPatchParameterfv = caps.get(758);
        glBindTransformFeedback = caps.get(759);
        glDeleteTransformFeedbacks = caps.get(760);
        glGenTransformFeedbacks = caps.get(761);
        glIsTransformFeedback = caps.get(762);
        glPauseTransformFeedback = caps.get(763);
        glResumeTransformFeedback = caps.get(764);
        glDrawTransformFeedback = caps.get(765);
        glDrawTransformFeedbackStream = caps.get(766);
        glBeginQueryIndexed = caps.get(767);
        glEndQueryIndexed = caps.get(768);
        glGetQueryIndexediv = caps.get(769);
        glReleaseShaderCompiler = caps.get(770);
        glShaderBinary = caps.get(771);
        glGetShaderPrecisionFormat = caps.get(772);
        glDepthRangef = caps.get(773);
        glClearDepthf = caps.get(774);
        glGetProgramBinary = caps.get(775);
        glProgramBinary = caps.get(776);
        glProgramParameteri = caps.get(777);
        glUseProgramStages = caps.get(778);
        glActiveShaderProgram = caps.get(779);
        glCreateShaderProgramv = caps.get(780);
        glBindProgramPipeline = caps.get(781);
        glDeleteProgramPipelines = caps.get(782);
        glGenProgramPipelines = caps.get(783);
        glIsProgramPipeline = caps.get(784);
        glGetProgramPipelineiv = caps.get(785);
        glProgramUniform1i = caps.get(786);
        glProgramUniform2i = caps.get(787);
        glProgramUniform3i = caps.get(788);
        glProgramUniform4i = caps.get(789);
        glProgramUniform1ui = caps.get(790);
        glProgramUniform2ui = caps.get(791);
        glProgramUniform3ui = caps.get(792);
        glProgramUniform4ui = caps.get(793);
        glProgramUniform1f = caps.get(794);
        glProgramUniform2f = caps.get(795);
        glProgramUniform3f = caps.get(796);
        glProgramUniform4f = caps.get(797);
        glProgramUniform1d = caps.get(798);
        glProgramUniform2d = caps.get(799);
        glProgramUniform3d = caps.get(800);
        glProgramUniform4d = caps.get(801);
        glProgramUniform1iv = caps.get(802);
        glProgramUniform2iv = caps.get(803);
        glProgramUniform3iv = caps.get(804);
        glProgramUniform4iv = caps.get(805);
        glProgramUniform1uiv = caps.get(806);
        glProgramUniform2uiv = caps.get(807);
        glProgramUniform3uiv = caps.get(808);
        glProgramUniform4uiv = caps.get(809);
        glProgramUniform1fv = caps.get(810);
        glProgramUniform2fv = caps.get(811);
        glProgramUniform3fv = caps.get(812);
        glProgramUniform4fv = caps.get(813);
        glProgramUniform1dv = caps.get(814);
        glProgramUniform2dv = caps.get(815);
        glProgramUniform3dv = caps.get(816);
        glProgramUniform4dv = caps.get(817);
        glProgramUniformMatrix2fv = caps.get(818);
        glProgramUniformMatrix3fv = caps.get(819);
        glProgramUniformMatrix4fv = caps.get(820);
        glProgramUniformMatrix2dv = caps.get(821);
        glProgramUniformMatrix3dv = caps.get(822);
        glProgramUniformMatrix4dv = caps.get(823);
        glProgramUniformMatrix2x3fv = caps.get(824);
        glProgramUniformMatrix3x2fv = caps.get(825);
        glProgramUniformMatrix2x4fv = caps.get(826);
        glProgramUniformMatrix4x2fv = caps.get(827);
        glProgramUniformMatrix3x4fv = caps.get(828);
        glProgramUniformMatrix4x3fv = caps.get(829);
        glProgramUniformMatrix2x3dv = caps.get(830);
        glProgramUniformMatrix3x2dv = caps.get(831);
        glProgramUniformMatrix2x4dv = caps.get(832);
        glProgramUniformMatrix4x2dv = caps.get(833);
        glProgramUniformMatrix3x4dv = caps.get(834);
        glProgramUniformMatrix4x3dv = caps.get(835);
        glValidateProgramPipeline = caps.get(836);
        glGetProgramPipelineInfoLog = caps.get(837);
        glVertexAttribL1d = caps.get(838);
        glVertexAttribL2d = caps.get(839);
        glVertexAttribL3d = caps.get(840);
        glVertexAttribL4d = caps.get(841);
        glVertexAttribL1dv = caps.get(842);
        glVertexAttribL2dv = caps.get(843);
        glVertexAttribL3dv = caps.get(844);
        glVertexAttribL4dv = caps.get(845);
        glVertexAttribLPointer = caps.get(846);
        glGetVertexAttribLdv = caps.get(847);
        glViewportArrayv = caps.get(848);
        glViewportIndexedf = caps.get(849);
        glViewportIndexedfv = caps.get(850);
        glScissorArrayv = caps.get(851);
        glScissorIndexed = caps.get(852);
        glScissorIndexedv = caps.get(853);
        glDepthRangeArrayv = caps.get(854);
        glDepthRangeIndexed = caps.get(855);
        glGetFloati_v = caps.get(856);
        glGetDoublei_v = caps.get(857);
        glGetActiveAtomicCounterBufferiv = caps.get(858);
        glTexStorage1D = caps.get(859);
        glTexStorage2D = caps.get(860);
        glTexStorage3D = caps.get(861);
        glDrawTransformFeedbackInstanced = caps.get(862);
        glDrawTransformFeedbackStreamInstanced = caps.get(863);
        glDrawArraysInstancedBaseInstance = caps.get(864);
        glDrawElementsInstancedBaseInstance = caps.get(865);
        glDrawElementsInstancedBaseVertexBaseInstance = caps.get(866);
        glBindImageTexture = caps.get(867);
        glMemoryBarrier = caps.get(868);
        glGetInternalformativ = caps.get(869);
        glClearBufferData = caps.get(870);
        glClearBufferSubData = caps.get(871);
        glDispatchCompute = caps.get(872);
        glDispatchComputeIndirect = caps.get(873);
        glCopyImageSubData = caps.get(874);
        glDebugMessageControl = caps.get(875);
        glDebugMessageInsert = caps.get(876);
        glDebugMessageCallback = caps.get(877);
        glGetDebugMessageLog = caps.get(878);
        glPushDebugGroup = caps.get(879);
        glPopDebugGroup = caps.get(880);
        glObjectLabel = caps.get(881);
        glGetObjectLabel = caps.get(882);
        glObjectPtrLabel = caps.get(883);
        glGetObjectPtrLabel = caps.get(884);
        glFramebufferParameteri = caps.get(885);
        glGetFramebufferParameteriv = caps.get(886);
        glGetInternalformati64v = caps.get(887);
        glInvalidateTexSubImage = caps.get(888);
        glInvalidateTexImage = caps.get(889);
        glInvalidateBufferSubData = caps.get(890);
        glInvalidateBufferData = caps.get(891);
        glInvalidateFramebuffer = caps.get(892);
        glInvalidateSubFramebuffer = caps.get(893);
        glMultiDrawArraysIndirect = caps.get(894);
        glMultiDrawElementsIndirect = caps.get(895);
        glGetProgramInterfaceiv = caps.get(896);
        glGetProgramResourceIndex = caps.get(897);
        glGetProgramResourceName = caps.get(898);
        glGetProgramResourceiv = caps.get(899);
        glGetProgramResourceLocation = caps.get(900);
        glGetProgramResourceLocationIndex = caps.get(901);
        glShaderStorageBlockBinding = caps.get(902);
        glTexBufferRange = caps.get(903);
        glTexStorage2DMultisample = caps.get(904);
        glTexStorage3DMultisample = caps.get(905);
        glTextureView = caps.get(906);
        glBindVertexBuffer = caps.get(907);
        glVertexAttribFormat = caps.get(908);
        glVertexAttribIFormat = caps.get(909);
        glVertexAttribLFormat = caps.get(910);
        glVertexAttribBinding = caps.get(911);
        glVertexBindingDivisor = caps.get(912);
        glBufferStorage = caps.get(913);
        glClearTexSubImage = caps.get(914);
        glClearTexImage = caps.get(915);
        glBindBuffersBase = caps.get(916);
        glBindBuffersRange = caps.get(917);
        glBindTextures = caps.get(918);
        glBindSamplers = caps.get(919);
        glBindImageTextures = caps.get(920);
        glBindVertexBuffers = caps.get(921);
        glClipControl = caps.get(922);
        glCreateTransformFeedbacks = caps.get(923);
        glTransformFeedbackBufferBase = caps.get(924);
        glTransformFeedbackBufferRange = caps.get(925);
        glGetTransformFeedbackiv = caps.get(926);
        glGetTransformFeedbacki_v = caps.get(927);
        glGetTransformFeedbacki64_v = caps.get(928);
        glCreateBuffers = caps.get(929);
        glNamedBufferStorage = caps.get(930);
        glNamedBufferData = caps.get(931);
        glNamedBufferSubData = caps.get(932);
        glCopyNamedBufferSubData = caps.get(933);
        glClearNamedBufferData = caps.get(934);
        glClearNamedBufferSubData = caps.get(935);
        glMapNamedBuffer = caps.get(936);
        glMapNamedBufferRange = caps.get(937);
        glUnmapNamedBuffer = caps.get(938);
        glFlushMappedNamedBufferRange = caps.get(939);
        glGetNamedBufferParameteriv = caps.get(940);
        glGetNamedBufferParameteri64v = caps.get(941);
        glGetNamedBufferPointerv = caps.get(942);
        glGetNamedBufferSubData = caps.get(943);
        glCreateFramebuffers = caps.get(944);
        glNamedFramebufferRenderbuffer = caps.get(945);
        glNamedFramebufferParameteri = caps.get(946);
        glNamedFramebufferTexture = caps.get(947);
        glNamedFramebufferTextureLayer = caps.get(948);
        glNamedFramebufferDrawBuffer = caps.get(949);
        glNamedFramebufferDrawBuffers = caps.get(950);
        glNamedFramebufferReadBuffer = caps.get(951);
        glInvalidateNamedFramebufferData = caps.get(952);
        glInvalidateNamedFramebufferSubData = caps.get(953);
        glClearNamedFramebufferiv = caps.get(954);
        glClearNamedFramebufferuiv = caps.get(955);
        glClearNamedFramebufferfv = caps.get(956);
        glClearNamedFramebufferfi = caps.get(957);
        glBlitNamedFramebuffer = caps.get(958);
        glCheckNamedFramebufferStatus = caps.get(959);
        glGetNamedFramebufferParameteriv = caps.get(960);
        glGetNamedFramebufferAttachmentParameteriv = caps.get(961);
        glCreateRenderbuffers = caps.get(962);
        glNamedRenderbufferStorage = caps.get(963);
        glNamedRenderbufferStorageMultisample = caps.get(964);
        glGetNamedRenderbufferParameteriv = caps.get(965);
        glCreateTextures = caps.get(966);
        glTextureBuffer = caps.get(967);
        glTextureBufferRange = caps.get(968);
        glTextureStorage1D = caps.get(969);
        glTextureStorage2D = caps.get(970);
        glTextureStorage3D = caps.get(971);
        glTextureStorage2DMultisample = caps.get(972);
        glTextureStorage3DMultisample = caps.get(973);
        glTextureSubImage1D = caps.get(974);
        glTextureSubImage2D = caps.get(975);
        glTextureSubImage3D = caps.get(976);
        glCompressedTextureSubImage1D = caps.get(977);
        glCompressedTextureSubImage2D = caps.get(978);
        glCompressedTextureSubImage3D = caps.get(979);
        glCopyTextureSubImage1D = caps.get(980);
        glCopyTextureSubImage2D = caps.get(981);
        glCopyTextureSubImage3D = caps.get(982);
        glTextureParameterf = caps.get(983);
        glTextureParameterfv = caps.get(984);
        glTextureParameteri = caps.get(985);
        glTextureParameterIiv = caps.get(986);
        glTextureParameterIuiv = caps.get(987);
        glTextureParameteriv = caps.get(988);
        glGenerateTextureMipmap = caps.get(989);
        glBindTextureUnit = caps.get(990);
        glGetTextureImage = caps.get(991);
        glGetCompressedTextureImage = caps.get(992);
        glGetTextureLevelParameterfv = caps.get(993);
        glGetTextureLevelParameteriv = caps.get(994);
        glGetTextureParameterfv = caps.get(995);
        glGetTextureParameterIiv = caps.get(996);
        glGetTextureParameterIuiv = caps.get(997);
        glGetTextureParameteriv = caps.get(998);
        glCreateVertexArrays = caps.get(999);
        glDisableVertexArrayAttrib = caps.get(1000);
        glEnableVertexArrayAttrib = caps.get(1001);
        glVertexArrayElementBuffer = caps.get(1002);
        glVertexArrayVertexBuffer = caps.get(1003);
        glVertexArrayVertexBuffers = caps.get(1004);
        glVertexArrayAttribFormat = caps.get(1005);
        glVertexArrayAttribIFormat = caps.get(1006);
        glVertexArrayAttribLFormat = caps.get(1007);
        glVertexArrayAttribBinding = caps.get(1008);
        glVertexArrayBindingDivisor = caps.get(1009);
        glGetVertexArrayiv = caps.get(1010);
        glGetVertexArrayIndexediv = caps.get(1011);
        glGetVertexArrayIndexed64iv = caps.get(1012);
        glCreateSamplers = caps.get(1013);
        glCreateProgramPipelines = caps.get(1014);
        glCreateQueries = caps.get(1015);
        glGetQueryBufferObjectiv = caps.get(1016);
        glGetQueryBufferObjectuiv = caps.get(1017);
        glGetQueryBufferObjecti64v = caps.get(1018);
        glGetQueryBufferObjectui64v = caps.get(1019);
        glMemoryBarrierByRegion = caps.get(1020);
        glGetTextureSubImage = caps.get(1021);
        glGetCompressedTextureSubImage = caps.get(1022);
        glTextureBarrier = caps.get(1023);
        glGetGraphicsResetStatus = caps.get(1024);
        glGetnMapdv = caps.get(1025);
        glGetnMapfv = caps.get(1026);
        glGetnMapiv = caps.get(1027);
        glGetnPixelMapfv = caps.get(1028);
        glGetnPixelMapuiv = caps.get(1029);
        glGetnPixelMapusv = caps.get(1030);
        glGetnPolygonStipple = caps.get(1031);
        glGetnTexImage = caps.get(1032);
        glReadnPixels = caps.get(1033);
        glGetnColorTable = caps.get(1034);
        glGetnConvolutionFilter = caps.get(1035);
        glGetnSeparableFilter = caps.get(1036);
        glGetnHistogram = caps.get(1037);
        glGetnMinmax = caps.get(1038);
        glGetnCompressedTexImage = caps.get(1039);
        glGetnUniformfv = caps.get(1040);
        glGetnUniformdv = caps.get(1041);
        glGetnUniformiv = caps.get(1042);
        glGetnUniformuiv = caps.get(1043);
        glMultiDrawArraysIndirectCount = caps.get(1044);
        glMultiDrawElementsIndirectCount = caps.get(1045);
        glPolygonOffsetClamp = caps.get(1046);
        glSpecializeShader = caps.get(1047);
        glDebugMessageEnableAMD = caps.get(1048);
        glDebugMessageInsertAMD = caps.get(1049);
        glDebugMessageCallbackAMD = caps.get(1050);
        glGetDebugMessageLogAMD = caps.get(1051);
        glBlendFuncIndexedAMD = caps.get(1052);
        glBlendFuncSeparateIndexedAMD = caps.get(1053);
        glBlendEquationIndexedAMD = caps.get(1054);
        glBlendEquationSeparateIndexedAMD = caps.get(1055);
        glRenderbufferStorageMultisampleAdvancedAMD = caps.get(1056);
        glNamedRenderbufferStorageMultisampleAdvancedAMD = caps.get(1057);
        glUniform1i64NV = caps.get(1058);
        glUniform2i64NV = caps.get(1059);
        glUniform3i64NV = caps.get(1060);
        glUniform4i64NV = caps.get(1061);
        glUniform1i64vNV = caps.get(1062);
        glUniform2i64vNV = caps.get(1063);
        glUniform3i64vNV = caps.get(1064);
        glUniform4i64vNV = caps.get(1065);
        glUniform1ui64NV = caps.get(1066);
        glUniform2ui64NV = caps.get(1067);
        glUniform3ui64NV = caps.get(1068);
        glUniform4ui64NV = caps.get(1069);
        glUniform1ui64vNV = caps.get(1070);
        glUniform2ui64vNV = caps.get(1071);
        glUniform3ui64vNV = caps.get(1072);
        glUniform4ui64vNV = caps.get(1073);
        glGetUniformi64vNV = caps.get(1074);
        glGetUniformui64vNV = caps.get(1075);
        glProgramUniform1i64NV = caps.get(1076);
        glProgramUniform2i64NV = caps.get(1077);
        glProgramUniform3i64NV = caps.get(1078);
        glProgramUniform4i64NV = caps.get(1079);
        glProgramUniform1i64vNV = caps.get(1080);
        glProgramUniform2i64vNV = caps.get(1081);
        glProgramUniform3i64vNV = caps.get(1082);
        glProgramUniform4i64vNV = caps.get(1083);
        glProgramUniform1ui64NV = caps.get(1084);
        glProgramUniform2ui64NV = caps.get(1085);
        glProgramUniform3ui64NV = caps.get(1086);
        glProgramUniform4ui64NV = caps.get(1087);
        glProgramUniform1ui64vNV = caps.get(1088);
        glProgramUniform2ui64vNV = caps.get(1089);
        glProgramUniform3ui64vNV = caps.get(1090);
        glProgramUniform4ui64vNV = caps.get(1091);
        glVertexAttribParameteriAMD = caps.get(1092);
        glQueryObjectParameteruiAMD = caps.get(1093);
        glGetPerfMonitorGroupsAMD = caps.get(1094);
        glGetPerfMonitorCountersAMD = caps.get(1095);
        glGetPerfMonitorGroupStringAMD = caps.get(1096);
        glGetPerfMonitorCounterStringAMD = caps.get(1097);
        glGetPerfMonitorCounterInfoAMD = caps.get(1098);
        glGenPerfMonitorsAMD = caps.get(1099);
        glDeletePerfMonitorsAMD = caps.get(1100);
        glSelectPerfMonitorCountersAMD = caps.get(1101);
        glBeginPerfMonitorAMD = caps.get(1102);
        glEndPerfMonitorAMD = caps.get(1103);
        glGetPerfMonitorCounterDataAMD = caps.get(1104);
        glSetMultisamplefvAMD = caps.get(1105);
        glTexStorageSparseAMD = caps.get(1106);
        glTextureStorageSparseAMD = caps.get(1107);
        glStencilOpValueAMD = caps.get(1108);
        glTessellationFactorAMD = caps.get(1109);
        glTessellationModeAMD = caps.get(1110);
        glElementPointerAPPLE = caps.get(1111);
        glDrawElementArrayAPPLE = caps.get(1112);
        glDrawRangeElementArrayAPPLE = caps.get(1113);
        glMultiDrawElementArrayAPPLE = caps.get(1114);
        glMultiDrawRangeElementArrayAPPLE = caps.get(1115);
        glGenFencesAPPLE = caps.get(1116);
        glDeleteFencesAPPLE = caps.get(1117);
        glSetFenceAPPLE = caps.get(1118);
        glIsFenceAPPLE = caps.get(1119);
        glTestFenceAPPLE = caps.get(1120);
        glFinishFenceAPPLE = caps.get(1121);
        glTestObjectAPPLE = caps.get(1122);
        glFinishObjectAPPLE = caps.get(1123);
        glBufferParameteriAPPLE = caps.get(1124);
        glFlushMappedBufferRangeAPPLE = caps.get(1125);
        glObjectPurgeableAPPLE = caps.get(1126);
        glObjectUnpurgeableAPPLE = caps.get(1127);
        glGetObjectParameterivAPPLE = caps.get(1128);
        glTextureRangeAPPLE = caps.get(1129);
        glGetTexParameterPointervAPPLE = caps.get(1130);
        glBindVertexArrayAPPLE = caps.get(1131);
        glDeleteVertexArraysAPPLE = caps.get(1132);
        glGenVertexArraysAPPLE = caps.get(1133);
        glIsVertexArrayAPPLE = caps.get(1134);
        glVertexArrayRangeAPPLE = caps.get(1135);
        glFlushVertexArrayRangeAPPLE = caps.get(1136);
        glVertexArrayParameteriAPPLE = caps.get(1137);
        glEnableVertexAttribAPPLE = caps.get(1138);
        glDisableVertexAttribAPPLE = caps.get(1139);
        glIsVertexAttribEnabledAPPLE = caps.get(1140);
        glMapVertexAttrib1dAPPLE = caps.get(1141);
        glMapVertexAttrib1fAPPLE = caps.get(1142);
        glMapVertexAttrib2dAPPLE = caps.get(1143);
        glMapVertexAttrib2fAPPLE = caps.get(1144);
        glGetTextureHandleARB = caps.get(1145);
        glGetTextureSamplerHandleARB = caps.get(1146);
        glMakeTextureHandleResidentARB = caps.get(1147);
        glMakeTextureHandleNonResidentARB = caps.get(1148);
        glGetImageHandleARB = caps.get(1149);
        glMakeImageHandleResidentARB = caps.get(1150);
        glMakeImageHandleNonResidentARB = caps.get(1151);
        glUniformHandleui64ARB = caps.get(1152);
        glUniformHandleui64vARB = caps.get(1153);
        glProgramUniformHandleui64ARB = caps.get(1154);
        glProgramUniformHandleui64vARB = caps.get(1155);
        glIsTextureHandleResidentARB = caps.get(1156);
        glIsImageHandleResidentARB = caps.get(1157);
        glVertexAttribL1ui64ARB = caps.get(1158);
        glVertexAttribL1ui64vARB = caps.get(1159);
        glGetVertexAttribLui64vARB = caps.get(1160);
        glNamedBufferStorageEXT = caps.get(1161);
        glCreateSyncFromCLeventARB = caps.get(1162);
        glClearNamedBufferDataEXT = caps.get(1163);
        glClearNamedBufferSubDataEXT = caps.get(1164);
        glClampColorARB = caps.get(1165);
        glDispatchComputeGroupSizeARB = caps.get(1166);
        glDebugMessageControlARB = caps.get(1167);
        glDebugMessageInsertARB = caps.get(1168);
        glDebugMessageCallbackARB = caps.get(1169);
        glGetDebugMessageLogARB = caps.get(1170);
        glDrawBuffersARB = caps.get(1171);
        glBlendEquationiARB = caps.get(1172);
        glBlendEquationSeparateiARB = caps.get(1173);
        glBlendFunciARB = caps.get(1174);
        glBlendFuncSeparateiARB = caps.get(1175);
        glDrawArraysInstancedARB = caps.get(1176);
        glDrawElementsInstancedARB = caps.get(1177);
        glPrimitiveBoundingBoxARB = caps.get(1178);
        glNamedFramebufferParameteriEXT = caps.get(1179);
        glGetNamedFramebufferParameterivEXT = caps.get(1180);
        glProgramParameteriARB = caps.get(1181);
        glFramebufferTextureARB = caps.get(1182);
        glFramebufferTextureLayerARB = caps.get(1183);
        glFramebufferTextureFaceARB = caps.get(1184);
        glSpecializeShaderARB = caps.get(1185);
        glProgramUniform1dEXT = caps.get(1186);
        glProgramUniform2dEXT = caps.get(1187);
        glProgramUniform3dEXT = caps.get(1188);
        glProgramUniform4dEXT = caps.get(1189);
        glProgramUniform1dvEXT = caps.get(1190);
        glProgramUniform2dvEXT = caps.get(1191);
        glProgramUniform3dvEXT = caps.get(1192);
        glProgramUniform4dvEXT = caps.get(1193);
        glProgramUniformMatrix2dvEXT = caps.get(1194);
        glProgramUniformMatrix3dvEXT = caps.get(1195);
        glProgramUniformMatrix4dvEXT = caps.get(1196);
        glProgramUniformMatrix2x3dvEXT = caps.get(1197);
        glProgramUniformMatrix2x4dvEXT = caps.get(1198);
        glProgramUniformMatrix3x2dvEXT = caps.get(1199);
        glProgramUniformMatrix3x4dvEXT = caps.get(1200);
        glProgramUniformMatrix4x2dvEXT = caps.get(1201);
        glProgramUniformMatrix4x3dvEXT = caps.get(1202);
        glUniform1i64ARB = caps.get(1203);
        glUniform1i64vARB = caps.get(1204);
        glProgramUniform1i64ARB = caps.get(1205);
        glProgramUniform1i64vARB = caps.get(1206);
        glUniform2i64ARB = caps.get(1207);
        glUniform2i64vARB = caps.get(1208);
        glProgramUniform2i64ARB = caps.get(1209);
        glProgramUniform2i64vARB = caps.get(1210);
        glUniform3i64ARB = caps.get(1211);
        glUniform3i64vARB = caps.get(1212);
        glProgramUniform3i64ARB = caps.get(1213);
        glProgramUniform3i64vARB = caps.get(1214);
        glUniform4i64ARB = caps.get(1215);
        glUniform4i64vARB = caps.get(1216);
        glProgramUniform4i64ARB = caps.get(1217);
        glProgramUniform4i64vARB = caps.get(1218);
        glUniform1ui64ARB = caps.get(1219);
        glUniform1ui64vARB = caps.get(1220);
        glProgramUniform1ui64ARB = caps.get(1221);
        glProgramUniform1ui64vARB = caps.get(1222);
        glUniform2ui64ARB = caps.get(1223);
        glUniform2ui64vARB = caps.get(1224);
        glProgramUniform2ui64ARB = caps.get(1225);
        glProgramUniform2ui64vARB = caps.get(1226);
        glUniform3ui64ARB = caps.get(1227);
        glUniform3ui64vARB = caps.get(1228);
        glProgramUniform3ui64ARB = caps.get(1229);
        glProgramUniform3ui64vARB = caps.get(1230);
        glUniform4ui64ARB = caps.get(1231);
        glUniform4ui64vARB = caps.get(1232);
        glProgramUniform4ui64ARB = caps.get(1233);
        glProgramUniform4ui64vARB = caps.get(1234);
        glGetUniformi64vARB = caps.get(1235);
        glGetUniformui64vARB = caps.get(1236);
        glGetnUniformi64vARB = caps.get(1237);
        glGetnUniformui64vARB = caps.get(1238);
        glColorTable = caps.get(1239);
        glCopyColorTable = caps.get(1240);
        glColorTableParameteriv = caps.get(1241);
        glColorTableParameterfv = caps.get(1242);
        glGetColorTable = caps.get(1243);
        glGetColorTableParameteriv = caps.get(1244);
        glGetColorTableParameterfv = caps.get(1245);
        glColorSubTable = caps.get(1246);
        glCopyColorSubTable = caps.get(1247);
        glConvolutionFilter1D = caps.get(1248);
        glConvolutionFilter2D = caps.get(1249);
        glCopyConvolutionFilter1D = caps.get(1250);
        glCopyConvolutionFilter2D = caps.get(1251);
        glGetConvolutionFilter = caps.get(1252);
        glSeparableFilter2D = caps.get(1253);
        glGetSeparableFilter = caps.get(1254);
        glConvolutionParameteri = caps.get(1255);
        glConvolutionParameteriv = caps.get(1256);
        glConvolutionParameterf = caps.get(1257);
        glConvolutionParameterfv = caps.get(1258);
        glGetConvolutionParameteriv = caps.get(1259);
        glGetConvolutionParameterfv = caps.get(1260);
        glHistogram = caps.get(1261);
        glResetHistogram = caps.get(1262);
        glGetHistogram = caps.get(1263);
        glGetHistogramParameteriv = caps.get(1264);
        glGetHistogramParameterfv = caps.get(1265);
        glMinmax = caps.get(1266);
        glResetMinmax = caps.get(1267);
        glGetMinmax = caps.get(1268);
        glGetMinmaxParameteriv = caps.get(1269);
        glGetMinmaxParameterfv = caps.get(1270);
        glMultiDrawArraysIndirectCountARB = caps.get(1271);
        glMultiDrawElementsIndirectCountARB = caps.get(1272);
        glVertexAttribDivisorARB = caps.get(1273);
        glVertexArrayVertexAttribDivisorEXT = caps.get(1274);
        glCurrentPaletteMatrixARB = caps.get(1275);
        glMatrixIndexuivARB = caps.get(1276);
        glMatrixIndexubvARB = caps.get(1277);
        glMatrixIndexusvARB = caps.get(1278);
        glMatrixIndexPointerARB = caps.get(1279);
        glSampleCoverageARB = caps.get(1280);
        glActiveTextureARB = caps.get(1281);
        glClientActiveTextureARB = caps.get(1282);
        glMultiTexCoord1fARB = caps.get(1283);
        glMultiTexCoord1sARB = caps.get(1284);
        glMultiTexCoord1iARB = caps.get(1285);
        glMultiTexCoord1dARB = caps.get(1286);
        glMultiTexCoord1fvARB = caps.get(1287);
        glMultiTexCoord1svARB = caps.get(1288);
        glMultiTexCoord1ivARB = caps.get(1289);
        glMultiTexCoord1dvARB = caps.get(1290);
        glMultiTexCoord2fARB = caps.get(1291);
        glMultiTexCoord2sARB = caps.get(1292);
        glMultiTexCoord2iARB = caps.get(1293);
        glMultiTexCoord2dARB = caps.get(1294);
        glMultiTexCoord2fvARB = caps.get(1295);
        glMultiTexCoord2svARB = caps.get(1296);
        glMultiTexCoord2ivARB = caps.get(1297);
        glMultiTexCoord2dvARB = caps.get(1298);
        glMultiTexCoord3fARB = caps.get(1299);
        glMultiTexCoord3sARB = caps.get(1300);
        glMultiTexCoord3iARB = caps.get(1301);
        glMultiTexCoord3dARB = caps.get(1302);
        glMultiTexCoord3fvARB = caps.get(1303);
        glMultiTexCoord3svARB = caps.get(1304);
        glMultiTexCoord3ivARB = caps.get(1305);
        glMultiTexCoord3dvARB = caps.get(1306);
        glMultiTexCoord4fARB = caps.get(1307);
        glMultiTexCoord4sARB = caps.get(1308);
        glMultiTexCoord4iARB = caps.get(1309);
        glMultiTexCoord4dARB = caps.get(1310);
        glMultiTexCoord4fvARB = caps.get(1311);
        glMultiTexCoord4svARB = caps.get(1312);
        glMultiTexCoord4ivARB = caps.get(1313);
        glMultiTexCoord4dvARB = caps.get(1314);
        glGenQueriesARB = caps.get(1315);
        glDeleteQueriesARB = caps.get(1316);
        glIsQueryARB = caps.get(1317);
        glBeginQueryARB = caps.get(1318);
        glEndQueryARB = caps.get(1319);
        glGetQueryivARB = caps.get(1320);
        glGetQueryObjectivARB = caps.get(1321);
        glGetQueryObjectuivARB = caps.get(1322);
        glMaxShaderCompilerThreadsARB = caps.get(1323);
        glPointParameterfARB = caps.get(1324);
        glPointParameterfvARB = caps.get(1325);
        glGetGraphicsResetStatusARB = caps.get(1326);
        glGetnMapdvARB = caps.get(1327);
        glGetnMapfvARB = caps.get(1328);
        glGetnMapivARB = caps.get(1329);
        glGetnPixelMapfvARB = caps.get(1330);
        glGetnPixelMapuivARB = caps.get(1331);
        glGetnPixelMapusvARB = caps.get(1332);
        glGetnPolygonStippleARB = caps.get(1333);
        glGetnTexImageARB = caps.get(1334);
        glReadnPixelsARB = caps.get(1335);
        glGetnColorTableARB = caps.get(1336);
        glGetnConvolutionFilterARB = caps.get(1337);
        glGetnSeparableFilterARB = caps.get(1338);
        glGetnHistogramARB = caps.get(1339);
        glGetnMinmaxARB = caps.get(1340);
        glGetnCompressedTexImageARB = caps.get(1341);
        glGetnUniformfvARB = caps.get(1342);
        glGetnUniformivARB = caps.get(1343);
        glGetnUniformuivARB = caps.get(1344);
        glGetnUniformdvARB = caps.get(1345);
        glFramebufferSampleLocationsfvARB = caps.get(1346);
        glNamedFramebufferSampleLocationsfvARB = caps.get(1347);
        glEvaluateDepthValuesARB = caps.get(1348);
        glMinSampleShadingARB = caps.get(1349);
        glDeleteObjectARB = caps.get(1350);
        glGetHandleARB = caps.get(1351);
        glDetachObjectARB = caps.get(1352);
        glCreateShaderObjectARB = caps.get(1353);
        glShaderSourceARB = caps.get(1354);
        glCompileShaderARB = caps.get(1355);
        glCreateProgramObjectARB = caps.get(1356);
        glAttachObjectARB = caps.get(1357);
        glLinkProgramARB = caps.get(1358);
        glUseProgramObjectARB = caps.get(1359);
        glValidateProgramARB = caps.get(1360);
        glUniform1fARB = caps.get(1361);
        glUniform2fARB = caps.get(1362);
        glUniform3fARB = caps.get(1363);
        glUniform4fARB = caps.get(1364);
        glUniform1iARB = caps.get(1365);
        glUniform2iARB = caps.get(1366);
        glUniform3iARB = caps.get(1367);
        glUniform4iARB = caps.get(1368);
        glUniform1fvARB = caps.get(1369);
        glUniform2fvARB = caps.get(1370);
        glUniform3fvARB = caps.get(1371);
        glUniform4fvARB = caps.get(1372);
        glUniform1ivARB = caps.get(1373);
        glUniform2ivARB = caps.get(1374);
        glUniform3ivARB = caps.get(1375);
        glUniform4ivARB = caps.get(1376);
        glUniformMatrix2fvARB = caps.get(1377);
        glUniformMatrix3fvARB = caps.get(1378);
        glUniformMatrix4fvARB = caps.get(1379);
        glGetObjectParameterfvARB = caps.get(1380);
        glGetObjectParameterivARB = caps.get(1381);
        glGetInfoLogARB = caps.get(1382);
        glGetAttachedObjectsARB = caps.get(1383);
        glGetUniformLocationARB = caps.get(1384);
        glGetActiveUniformARB = caps.get(1385);
        glGetUniformfvARB = caps.get(1386);
        glGetUniformivARB = caps.get(1387);
        glGetShaderSourceARB = caps.get(1388);
        glNamedStringARB = caps.get(1389);
        glDeleteNamedStringARB = caps.get(1390);
        glCompileShaderIncludeARB = caps.get(1391);
        glIsNamedStringARB = caps.get(1392);
        glGetNamedStringARB = caps.get(1393);
        glGetNamedStringivARB = caps.get(1394);
        glBufferPageCommitmentARB = caps.get(1395);
        glNamedBufferPageCommitmentEXT = caps.get(1396);
        glNamedBufferPageCommitmentARB = caps.get(1397);
        glTexPageCommitmentARB = caps.get(1398);
        glTexturePageCommitmentEXT = caps.get(1399);
        glTexBufferARB = caps.get(1400);
        glTextureBufferRangeEXT = caps.get(1401);
        glCompressedTexImage3DARB = caps.get(1402);
        glCompressedTexImage2DARB = caps.get(1403);
        glCompressedTexImage1DARB = caps.get(1404);
        glCompressedTexSubImage3DARB = caps.get(1405);
        glCompressedTexSubImage2DARB = caps.get(1406);
        glCompressedTexSubImage1DARB = caps.get(1407);
        glGetCompressedTexImageARB = caps.get(1408);
        glTextureStorage1DEXT = caps.get(1409);
        glTextureStorage2DEXT = caps.get(1410);
        glTextureStorage3DEXT = caps.get(1411);
        glTextureStorage2DMultisampleEXT = caps.get(1412);
        glTextureStorage3DMultisampleEXT = caps.get(1413);
        glLoadTransposeMatrixfARB = caps.get(1414);
        glLoadTransposeMatrixdARB = caps.get(1415);
        glMultTransposeMatrixfARB = caps.get(1416);
        glMultTransposeMatrixdARB = caps.get(1417);
        glVertexArrayVertexAttribLOffsetEXT = caps.get(1418);
        glVertexArrayBindVertexBufferEXT = caps.get(1419);
        glVertexArrayVertexAttribFormatEXT = caps.get(1420);
        glVertexArrayVertexAttribIFormatEXT = caps.get(1421);
        glVertexArrayVertexAttribLFormatEXT = caps.get(1422);
        glVertexArrayVertexAttribBindingEXT = caps.get(1423);
        glVertexArrayVertexBindingDivisorEXT = caps.get(1424);
        glWeightfvARB = caps.get(1425);
        glWeightbvARB = caps.get(1426);
        glWeightubvARB = caps.get(1427);
        glWeightsvARB = caps.get(1428);
        glWeightusvARB = caps.get(1429);
        glWeightivARB = caps.get(1430);
        glWeightuivARB = caps.get(1431);
        glWeightdvARB = caps.get(1432);
        glWeightPointerARB = caps.get(1433);
        glVertexBlendARB = caps.get(1434);
        glBindBufferARB = caps.get(1435);
        glDeleteBuffersARB = caps.get(1436);
        glGenBuffersARB = caps.get(1437);
        glIsBufferARB = caps.get(1438);
        glBufferDataARB = caps.get(1439);
        glBufferSubDataARB = caps.get(1440);
        glGetBufferSubDataARB = caps.get(1441);
        glMapBufferARB = caps.get(1442);
        glUnmapBufferARB = caps.get(1443);
        glGetBufferParameterivARB = caps.get(1444);
        glGetBufferPointervARB = caps.get(1445);
        glVertexAttrib1sARB = caps.get(1446);
        glVertexAttrib1fARB = caps.get(1447);
        glVertexAttrib1dARB = caps.get(1448);
        glVertexAttrib2sARB = caps.get(1449);
        glVertexAttrib2fARB = caps.get(1450);
        glVertexAttrib2dARB = caps.get(1451);
        glVertexAttrib3sARB = caps.get(1452);
        glVertexAttrib3fARB = caps.get(1453);
        glVertexAttrib3dARB = caps.get(1454);
        glVertexAttrib4sARB = caps.get(1455);
        glVertexAttrib4fARB = caps.get(1456);
        glVertexAttrib4dARB = caps.get(1457);
        glVertexAttrib4NubARB = caps.get(1458);
        glVertexAttrib1svARB = caps.get(1459);
        glVertexAttrib1fvARB = caps.get(1460);
        glVertexAttrib1dvARB = caps.get(1461);
        glVertexAttrib2svARB = caps.get(1462);
        glVertexAttrib2fvARB = caps.get(1463);
        glVertexAttrib2dvARB = caps.get(1464);
        glVertexAttrib3svARB = caps.get(1465);
        glVertexAttrib3fvARB = caps.get(1466);
        glVertexAttrib3dvARB = caps.get(1467);
        glVertexAttrib4fvARB = caps.get(1468);
        glVertexAttrib4bvARB = caps.get(1469);
        glVertexAttrib4svARB = caps.get(1470);
        glVertexAttrib4ivARB = caps.get(1471);
        glVertexAttrib4ubvARB = caps.get(1472);
        glVertexAttrib4usvARB = caps.get(1473);
        glVertexAttrib4uivARB = caps.get(1474);
        glVertexAttrib4dvARB = caps.get(1475);
        glVertexAttrib4NbvARB = caps.get(1476);
        glVertexAttrib4NsvARB = caps.get(1477);
        glVertexAttrib4NivARB = caps.get(1478);
        glVertexAttrib4NubvARB = caps.get(1479);
        glVertexAttrib4NusvARB = caps.get(1480);
        glVertexAttrib4NuivARB = caps.get(1481);
        glVertexAttribPointerARB = caps.get(1482);
        glEnableVertexAttribArrayARB = caps.get(1483);
        glDisableVertexAttribArrayARB = caps.get(1484);
        glProgramStringARB = caps.get(1485);
        glBindProgramARB = caps.get(1486);
        glDeleteProgramsARB = caps.get(1487);
        glGenProgramsARB = caps.get(1488);
        glProgramEnvParameter4dARB = caps.get(1489);
        glProgramEnvParameter4dvARB = caps.get(1490);
        glProgramEnvParameter4fARB = caps.get(1491);
        glProgramEnvParameter4fvARB = caps.get(1492);
        glProgramLocalParameter4dARB = caps.get(1493);
        glProgramLocalParameter4dvARB = caps.get(1494);
        glProgramLocalParameter4fARB = caps.get(1495);
        glProgramLocalParameter4fvARB = caps.get(1496);
        glGetProgramEnvParameterfvARB = caps.get(1497);
        glGetProgramEnvParameterdvARB = caps.get(1498);
        glGetProgramLocalParameterfvARB = caps.get(1499);
        glGetProgramLocalParameterdvARB = caps.get(1500);
        glGetProgramivARB = caps.get(1501);
        glGetProgramStringARB = caps.get(1502);
        glGetVertexAttribfvARB = caps.get(1503);
        glGetVertexAttribdvARB = caps.get(1504);
        glGetVertexAttribivARB = caps.get(1505);
        glGetVertexAttribPointervARB = caps.get(1506);
        glIsProgramARB = caps.get(1507);
        glBindAttribLocationARB = caps.get(1508);
        glGetActiveAttribARB = caps.get(1509);
        glGetAttribLocationARB = caps.get(1510);
        glWindowPos2iARB = caps.get(1511);
        glWindowPos2sARB = caps.get(1512);
        glWindowPos2fARB = caps.get(1513);
        glWindowPos2dARB = caps.get(1514);
        glWindowPos2ivARB = caps.get(1515);
        glWindowPos2svARB = caps.get(1516);
        glWindowPos2fvARB = caps.get(1517);
        glWindowPos2dvARB = caps.get(1518);
        glWindowPos3iARB = caps.get(1519);
        glWindowPos3sARB = caps.get(1520);
        glWindowPos3fARB = caps.get(1521);
        glWindowPos3dARB = caps.get(1522);
        glWindowPos3ivARB = caps.get(1523);
        glWindowPos3svARB = caps.get(1524);
        glWindowPos3fvARB = caps.get(1525);
        glWindowPos3dvARB = caps.get(1526);
        glUniformBufferEXT = caps.get(1527);
        glGetUniformBufferSizeEXT = caps.get(1528);
        glGetUniformOffsetEXT = caps.get(1529);
        glBlendColorEXT = caps.get(1530);
        glBlendEquationSeparateEXT = caps.get(1531);
        glBlendFuncSeparateEXT = caps.get(1532);
        glBlendEquationEXT = caps.get(1533);
        glLockArraysEXT = caps.get(1534);
        glUnlockArraysEXT = caps.get(1535);
        glLabelObjectEXT = caps.get(1536);
        glGetObjectLabelEXT = caps.get(1537);
        glInsertEventMarkerEXT = caps.get(1538);
        glPushGroupMarkerEXT = caps.get(1539);
        glPopGroupMarkerEXT = caps.get(1540);
        glDepthBoundsEXT = caps.get(1541);
        glClientAttribDefaultEXT = caps.get(1542);
        glPushClientAttribDefaultEXT = caps.get(1543);
        glMatrixLoadfEXT = caps.get(1544);
        glMatrixLoaddEXT = caps.get(1545);
        glMatrixMultfEXT = caps.get(1546);
        glMatrixMultdEXT = caps.get(1547);
        glMatrixLoadIdentityEXT = caps.get(1548);
        glMatrixRotatefEXT = caps.get(1549);
        glMatrixRotatedEXT = caps.get(1550);
        glMatrixScalefEXT = caps.get(1551);
        glMatrixScaledEXT = caps.get(1552);
        glMatrixTranslatefEXT = caps.get(1553);
        glMatrixTranslatedEXT = caps.get(1554);
        glMatrixOrthoEXT = caps.get(1555);
        glMatrixFrustumEXT = caps.get(1556);
        glMatrixPushEXT = caps.get(1557);
        glMatrixPopEXT = caps.get(1558);
        glTextureParameteriEXT = caps.get(1559);
        glTextureParameterivEXT = caps.get(1560);
        glTextureParameterfEXT = caps.get(1561);
        glTextureParameterfvEXT = caps.get(1562);
        glTextureImage1DEXT = caps.get(1563);
        glTextureImage2DEXT = caps.get(1564);
        glTextureSubImage1DEXT = caps.get(1565);
        glTextureSubImage2DEXT = caps.get(1566);
        glCopyTextureImage1DEXT = caps.get(1567);
        glCopyTextureImage2DEXT = caps.get(1568);
        glCopyTextureSubImage1DEXT = caps.get(1569);
        glCopyTextureSubImage2DEXT = caps.get(1570);
        glGetTextureImageEXT = caps.get(1571);
        glGetTextureParameterfvEXT = caps.get(1572);
        glGetTextureParameterivEXT = caps.get(1573);
        glGetTextureLevelParameterfvEXT = caps.get(1574);
        glGetTextureLevelParameterivEXT = caps.get(1575);
        glTextureImage3DEXT = caps.get(1576);
        glTextureSubImage3DEXT = caps.get(1577);
        glCopyTextureSubImage3DEXT = caps.get(1578);
        glBindMultiTextureEXT = caps.get(1579);
        glMultiTexCoordPointerEXT = caps.get(1580);
        glMultiTexEnvfEXT = caps.get(1581);
        glMultiTexEnvfvEXT = caps.get(1582);
        glMultiTexEnviEXT = caps.get(1583);
        glMultiTexEnvivEXT = caps.get(1584);
        glMultiTexGendEXT = caps.get(1585);
        glMultiTexGendvEXT = caps.get(1586);
        glMultiTexGenfEXT = caps.get(1587);
        glMultiTexGenfvEXT = caps.get(1588);
        glMultiTexGeniEXT = caps.get(1589);
        glMultiTexGenivEXT = caps.get(1590);
        glGetMultiTexEnvfvEXT = caps.get(1591);
        glGetMultiTexEnvivEXT = caps.get(1592);
        glGetMultiTexGendvEXT = caps.get(1593);
        glGetMultiTexGenfvEXT = caps.get(1594);
        glGetMultiTexGenivEXT = caps.get(1595);
        glMultiTexParameteriEXT = caps.get(1596);
        glMultiTexParameterivEXT = caps.get(1597);
        glMultiTexParameterfEXT = caps.get(1598);
        glMultiTexParameterfvEXT = caps.get(1599);
        glMultiTexImage1DEXT = caps.get(1600);
        glMultiTexImage2DEXT = caps.get(1601);
        glMultiTexSubImage1DEXT = caps.get(1602);
        glMultiTexSubImage2DEXT = caps.get(1603);
        glCopyMultiTexImage1DEXT = caps.get(1604);
        glCopyMultiTexImage2DEXT = caps.get(1605);
        glCopyMultiTexSubImage1DEXT = caps.get(1606);
        glCopyMultiTexSubImage2DEXT = caps.get(1607);
        glGetMultiTexImageEXT = caps.get(1608);
        glGetMultiTexParameterfvEXT = caps.get(1609);
        glGetMultiTexParameterivEXT = caps.get(1610);
        glGetMultiTexLevelParameterfvEXT = caps.get(1611);
        glGetMultiTexLevelParameterivEXT = caps.get(1612);
        glMultiTexImage3DEXT = caps.get(1613);
        glMultiTexSubImage3DEXT = caps.get(1614);
        glCopyMultiTexSubImage3DEXT = caps.get(1615);
        glEnableClientStateIndexedEXT = caps.get(1616);
        glDisableClientStateIndexedEXT = caps.get(1617);
        glEnableClientStateiEXT = caps.get(1618);
        glDisableClientStateiEXT = caps.get(1619);
        glGetFloatIndexedvEXT = caps.get(1620);
        glGetDoubleIndexedvEXT = caps.get(1621);
        glGetPointerIndexedvEXT = caps.get(1622);
        glGetFloati_vEXT = caps.get(1623);
        glGetDoublei_vEXT = caps.get(1624);
        glGetPointeri_vEXT = caps.get(1625);
        glEnableIndexedEXT = caps.get(1626);
        glDisableIndexedEXT = caps.get(1627);
        glIsEnabledIndexedEXT = caps.get(1628);
        glGetIntegerIndexedvEXT = caps.get(1629);
        glGetBooleanIndexedvEXT = caps.get(1630);
        glNamedProgramStringEXT = caps.get(1631);
        glNamedProgramLocalParameter4dEXT = caps.get(1632);
        glNamedProgramLocalParameter4dvEXT = caps.get(1633);
        glNamedProgramLocalParameter4fEXT = caps.get(1634);
        glNamedProgramLocalParameter4fvEXT = caps.get(1635);
        glGetNamedProgramLocalParameterdvEXT = caps.get(1636);
        glGetNamedProgramLocalParameterfvEXT = caps.get(1637);
        glGetNamedProgramivEXT = caps.get(1638);
        glGetNamedProgramStringEXT = caps.get(1639);
        glCompressedTextureImage3DEXT = caps.get(1640);
        glCompressedTextureImage2DEXT = caps.get(1641);
        glCompressedTextureImage1DEXT = caps.get(1642);
        glCompressedTextureSubImage3DEXT = caps.get(1643);
        glCompressedTextureSubImage2DEXT = caps.get(1644);
        glCompressedTextureSubImage1DEXT = caps.get(1645);
        glGetCompressedTextureImageEXT = caps.get(1646);
        glCompressedMultiTexImage3DEXT = caps.get(1647);
        glCompressedMultiTexImage2DEXT = caps.get(1648);
        glCompressedMultiTexImage1DEXT = caps.get(1649);
        glCompressedMultiTexSubImage3DEXT = caps.get(1650);
        glCompressedMultiTexSubImage2DEXT = caps.get(1651);
        glCompressedMultiTexSubImage1DEXT = caps.get(1652);
        glGetCompressedMultiTexImageEXT = caps.get(1653);
        glMatrixLoadTransposefEXT = caps.get(1654);
        glMatrixLoadTransposedEXT = caps.get(1655);
        glMatrixMultTransposefEXT = caps.get(1656);
        glMatrixMultTransposedEXT = caps.get(1657);
        glNamedBufferDataEXT = caps.get(1658);
        glNamedBufferSubDataEXT = caps.get(1659);
        glMapNamedBufferEXT = caps.get(1660);
        glUnmapNamedBufferEXT = caps.get(1661);
        glGetNamedBufferParameterivEXT = caps.get(1662);
        glGetNamedBufferSubDataEXT = caps.get(1663);
        glProgramUniform1fEXT = caps.get(1664);
        glProgramUniform2fEXT = caps.get(1665);
        glProgramUniform3fEXT = caps.get(1666);
        glProgramUniform4fEXT = caps.get(1667);
        glProgramUniform1iEXT = caps.get(1668);
        glProgramUniform2iEXT = caps.get(1669);
        glProgramUniform3iEXT = caps.get(1670);
        glProgramUniform4iEXT = caps.get(1671);
        glProgramUniform1fvEXT = caps.get(1672);
        glProgramUniform2fvEXT = caps.get(1673);
        glProgramUniform3fvEXT = caps.get(1674);
        glProgramUniform4fvEXT = caps.get(1675);
        glProgramUniform1ivEXT = caps.get(1676);
        glProgramUniform2ivEXT = caps.get(1677);
        glProgramUniform3ivEXT = caps.get(1678);
        glProgramUniform4ivEXT = caps.get(1679);
        glProgramUniformMatrix2fvEXT = caps.get(1680);
        glProgramUniformMatrix3fvEXT = caps.get(1681);
        glProgramUniformMatrix4fvEXT = caps.get(1682);
        glProgramUniformMatrix2x3fvEXT = caps.get(1683);
        glProgramUniformMatrix3x2fvEXT = caps.get(1684);
        glProgramUniformMatrix2x4fvEXT = caps.get(1685);
        glProgramUniformMatrix4x2fvEXT = caps.get(1686);
        glProgramUniformMatrix3x4fvEXT = caps.get(1687);
        glProgramUniformMatrix4x3fvEXT = caps.get(1688);
        glTextureBufferEXT = caps.get(1689);
        glMultiTexBufferEXT = caps.get(1690);
        glTextureParameterIivEXT = caps.get(1691);
        glTextureParameterIuivEXT = caps.get(1692);
        glGetTextureParameterIivEXT = caps.get(1693);
        glGetTextureParameterIuivEXT = caps.get(1694);
        glMultiTexParameterIivEXT = caps.get(1695);
        glMultiTexParameterIuivEXT = caps.get(1696);
        glGetMultiTexParameterIivEXT = caps.get(1697);
        glGetMultiTexParameterIuivEXT = caps.get(1698);
        glProgramUniform1uiEXT = caps.get(1699);
        glProgramUniform2uiEXT = caps.get(1700);
        glProgramUniform3uiEXT = caps.get(1701);
        glProgramUniform4uiEXT = caps.get(1702);
        glProgramUniform1uivEXT = caps.get(1703);
        glProgramUniform2uivEXT = caps.get(1704);
        glProgramUniform3uivEXT = caps.get(1705);
        glProgramUniform4uivEXT = caps.get(1706);
        glNamedProgramLocalParameters4fvEXT = caps.get(1707);
        glNamedProgramLocalParameterI4iEXT = caps.get(1708);
        glNamedProgramLocalParameterI4ivEXT = caps.get(1709);
        glNamedProgramLocalParametersI4ivEXT = caps.get(1710);
        glNamedProgramLocalParameterI4uiEXT = caps.get(1711);
        glNamedProgramLocalParameterI4uivEXT = caps.get(1712);
        glNamedProgramLocalParametersI4uivEXT = caps.get(1713);
        glGetNamedProgramLocalParameterIivEXT = caps.get(1714);
        glGetNamedProgramLocalParameterIuivEXT = caps.get(1715);
        glNamedRenderbufferStorageEXT = caps.get(1716);
        glGetNamedRenderbufferParameterivEXT = caps.get(1717);
        glNamedRenderbufferStorageMultisampleEXT = caps.get(1718);
        glNamedRenderbufferStorageMultisampleCoverageEXT = caps.get(1719);
        glCheckNamedFramebufferStatusEXT = caps.get(1720);
        glNamedFramebufferTexture1DEXT = caps.get(1721);
        glNamedFramebufferTexture2DEXT = caps.get(1722);
        glNamedFramebufferTexture3DEXT = caps.get(1723);
        glNamedFramebufferRenderbufferEXT = caps.get(1724);
        glGetNamedFramebufferAttachmentParameterivEXT = caps.get(1725);
        glGenerateTextureMipmapEXT = caps.get(1726);
        glGenerateMultiTexMipmapEXT = caps.get(1727);
        glFramebufferDrawBufferEXT = caps.get(1728);
        glFramebufferDrawBuffersEXT = caps.get(1729);
        glFramebufferReadBufferEXT = caps.get(1730);
        glGetFramebufferParameterivEXT = caps.get(1731);
        glNamedCopyBufferSubDataEXT = caps.get(1732);
        glNamedFramebufferTextureEXT = caps.get(1733);
        glNamedFramebufferTextureLayerEXT = caps.get(1734);
        glNamedFramebufferTextureFaceEXT = caps.get(1735);
        glTextureRenderbufferEXT = caps.get(1736);
        glMultiTexRenderbufferEXT = caps.get(1737);
        glVertexArrayVertexOffsetEXT = caps.get(1738);
        glVertexArrayColorOffsetEXT = caps.get(1739);
        glVertexArrayEdgeFlagOffsetEXT = caps.get(1740);
        glVertexArrayIndexOffsetEXT = caps.get(1741);
        glVertexArrayNormalOffsetEXT = caps.get(1742);
        glVertexArrayTexCoordOffsetEXT = caps.get(1743);
        glVertexArrayMultiTexCoordOffsetEXT = caps.get(1744);
        glVertexArrayFogCoordOffsetEXT = caps.get(1745);
        glVertexArraySecondaryColorOffsetEXT = caps.get(1746);
        glVertexArrayVertexAttribOffsetEXT = caps.get(1747);
        glVertexArrayVertexAttribIOffsetEXT = caps.get(1748);
        glEnableVertexArrayEXT = caps.get(1749);
        glDisableVertexArrayEXT = caps.get(1750);
        glEnableVertexArrayAttribEXT = caps.get(1751);
        glDisableVertexArrayAttribEXT = caps.get(1752);
        glGetVertexArrayIntegervEXT = caps.get(1753);
        glGetVertexArrayPointervEXT = caps.get(1754);
        glGetVertexArrayIntegeri_vEXT = caps.get(1755);
        glGetVertexArrayPointeri_vEXT = caps.get(1756);
        glMapNamedBufferRangeEXT = caps.get(1757);
        glFlushMappedNamedBufferRangeEXT = caps.get(1758);
        glColorMaskIndexedEXT = caps.get(1759);
        glDrawArraysInstancedEXT = caps.get(1760);
        glDrawElementsInstancedEXT = caps.get(1761);
        glEGLImageTargetTexStorageEXT = caps.get(1762);
        glEGLImageTargetTextureStorageEXT = caps.get(1763);
        glBufferStorageExternalEXT = caps.get(1764);
        glNamedBufferStorageExternalEXT = caps.get(1765);
        glShadingRateEXT = caps.get(1766);
        glShadingRateCombinerOpsEXT = caps.get(1767);
        glFramebufferShadingRateEXT = caps.get(1768);
        glGetFragmentShadingRatesEXT = caps.get(1769);
        glBlitFramebufferEXT = caps.get(1770);
        glBlitFramebufferLayersEXT = caps.get(1771);
        glBlitFramebufferLayerEXT = caps.get(1772);
        glRenderbufferStorageMultisampleEXT = caps.get(1773);
        glIsRenderbufferEXT = caps.get(1774);
        glBindRenderbufferEXT = caps.get(1775);
        glDeleteRenderbuffersEXT = caps.get(1776);
        glGenRenderbuffersEXT = caps.get(1777);
        glRenderbufferStorageEXT = caps.get(1778);
        glGetRenderbufferParameterivEXT = caps.get(1779);
        glIsFramebufferEXT = caps.get(1780);
        glBindFramebufferEXT = caps.get(1781);
        glDeleteFramebuffersEXT = caps.get(1782);
        glGenFramebuffersEXT = caps.get(1783);
        glCheckFramebufferStatusEXT = caps.get(1784);
        glFramebufferTexture1DEXT = caps.get(1785);
        glFramebufferTexture2DEXT = caps.get(1786);
        glFramebufferTexture3DEXT = caps.get(1787);
        glFramebufferRenderbufferEXT = caps.get(1788);
        glGetFramebufferAttachmentParameterivEXT = caps.get(1789);
        glGenerateMipmapEXT = caps.get(1790);
        glProgramParameteriEXT = caps.get(1791);
        glFramebufferTextureEXT = caps.get(1792);
        glFramebufferTextureLayerEXT = caps.get(1793);
        glFramebufferTextureFaceEXT = caps.get(1794);
        glProgramEnvParameters4fvEXT = caps.get(1795);
        glProgramLocalParameters4fvEXT = caps.get(1796);
        glVertexAttribI1iEXT = caps.get(1797);
        glVertexAttribI2iEXT = caps.get(1798);
        glVertexAttribI3iEXT = caps.get(1799);
        glVertexAttribI4iEXT = caps.get(1800);
        glVertexAttribI1uiEXT = caps.get(1801);
        glVertexAttribI2uiEXT = caps.get(1802);
        glVertexAttribI3uiEXT = caps.get(1803);
        glVertexAttribI4uiEXT = caps.get(1804);
        glVertexAttribI1ivEXT = caps.get(1805);
        glVertexAttribI2ivEXT = caps.get(1806);
        glVertexAttribI3ivEXT = caps.get(1807);
        glVertexAttribI4ivEXT = caps.get(1808);
        glVertexAttribI1uivEXT = caps.get(1809);
        glVertexAttribI2uivEXT = caps.get(1810);
        glVertexAttribI3uivEXT = caps.get(1811);
        glVertexAttribI4uivEXT = caps.get(1812);
        glVertexAttribI4bvEXT = caps.get(1813);
        glVertexAttribI4svEXT = caps.get(1814);
        glVertexAttribI4ubvEXT = caps.get(1815);
        glVertexAttribI4usvEXT = caps.get(1816);
        glVertexAttribIPointerEXT = caps.get(1817);
        glGetVertexAttribIivEXT = caps.get(1818);
        glGetVertexAttribIuivEXT = caps.get(1819);
        glGetUniformuivEXT = caps.get(1820);
        glBindFragDataLocationEXT = caps.get(1821);
        glGetFragDataLocationEXT = caps.get(1822);
        glUniform1uiEXT = caps.get(1823);
        glUniform2uiEXT = caps.get(1824);
        glUniform3uiEXT = caps.get(1825);
        glUniform4uiEXT = caps.get(1826);
        glUniform1uivEXT = caps.get(1827);
        glUniform2uivEXT = caps.get(1828);
        glUniform3uivEXT = caps.get(1829);
        glUniform4uivEXT = caps.get(1830);
        glGetUnsignedBytevEXT = caps.get(1831);
        glGetUnsignedBytei_vEXT = caps.get(1832);
        glDeleteMemoryObjectsEXT = caps.get(1833);
        glIsMemoryObjectEXT = caps.get(1834);
        glCreateMemoryObjectsEXT = caps.get(1835);
        glMemoryObjectParameterivEXT = caps.get(1836);
        glGetMemoryObjectParameterivEXT = caps.get(1837);
        glTexStorageMem2DEXT = caps.get(1838);
        glTexStorageMem2DMultisampleEXT = caps.get(1839);
        glTexStorageMem3DEXT = caps.get(1840);
        glTexStorageMem3DMultisampleEXT = caps.get(1841);
        glBufferStorageMemEXT = caps.get(1842);
        glTextureStorageMem2DEXT = caps.get(1843);
        glTextureStorageMem2DMultisampleEXT = caps.get(1844);
        glTextureStorageMem3DEXT = caps.get(1845);
        glTextureStorageMem3DMultisampleEXT = caps.get(1846);
        glNamedBufferStorageMemEXT = caps.get(1847);
        glTexStorageMem1DEXT = caps.get(1848);
        glTextureStorageMem1DEXT = caps.get(1849);
        glImportMemoryFdEXT = caps.get(1850);
        glImportMemoryWin32HandleEXT = caps.get(1851);
        glImportMemoryWin32NameEXT = caps.get(1852);
        glDrawMeshTasksEXT = caps.get(1853);
        glDrawMeshTasksIndirectEXT = caps.get(1854);
        glMultiDrawMeshTasksIndirectEXT = caps.get(1855);
        glMultiDrawMeshTasksIndirectCountEXT = caps.get(1856);
        glPointParameterfEXT = caps.get(1857);
        glPointParameterfvEXT = caps.get(1858);
        glPolygonOffsetClampEXT = caps.get(1859);
        glProvokingVertexEXT = caps.get(1860);
        glRasterSamplesEXT = caps.get(1861);
        glSecondaryColor3bEXT = caps.get(1862);
        glSecondaryColor3sEXT = caps.get(1863);
        glSecondaryColor3iEXT = caps.get(1864);
        glSecondaryColor3fEXT = caps.get(1865);
        glSecondaryColor3dEXT = caps.get(1866);
        glSecondaryColor3ubEXT = caps.get(1867);
        glSecondaryColor3usEXT = caps.get(1868);
        glSecondaryColor3uiEXT = caps.get(1869);
        glSecondaryColor3bvEXT = caps.get(1870);
        glSecondaryColor3svEXT = caps.get(1871);
        glSecondaryColor3ivEXT = caps.get(1872);
        glSecondaryColor3fvEXT = caps.get(1873);
        glSecondaryColor3dvEXT = caps.get(1874);
        glSecondaryColor3ubvEXT = caps.get(1875);
        glSecondaryColor3usvEXT = caps.get(1876);
        glSecondaryColor3uivEXT = caps.get(1877);
        glSecondaryColorPointerEXT = caps.get(1878);
        glGenSemaphoresEXT = caps.get(1879);
        glDeleteSemaphoresEXT = caps.get(1880);
        glIsSemaphoreEXT = caps.get(1881);
        glSemaphoreParameterui64vEXT = caps.get(1882);
        glGetSemaphoreParameterui64vEXT = caps.get(1883);
        glWaitSemaphoreEXT = caps.get(1884);
        glSignalSemaphoreEXT = caps.get(1885);
        glImportSemaphoreFdEXT = caps.get(1886);
        glImportSemaphoreWin32HandleEXT = caps.get(1887);
        glImportSemaphoreWin32NameEXT = caps.get(1888);
        glUseShaderProgramEXT = caps.get(1889);
        glActiveProgramEXT = caps.get(1890);
        glCreateShaderProgramEXT = caps.get(1891);
        glFramebufferFetchBarrierEXT = caps.get(1892);
        glBindImageTextureEXT = caps.get(1893);
        glMemoryBarrierEXT = caps.get(1894);
        glStencilClearTagEXT = caps.get(1895);
        glActiveStencilFaceEXT = caps.get(1896);
        glTexBufferEXT = caps.get(1897);
        glClearColorIiEXT = caps.get(1898);
        glClearColorIuiEXT = caps.get(1899);
        glTexParameterIivEXT = caps.get(1900);
        glTexParameterIuivEXT = caps.get(1901);
        glGetTexParameterIivEXT = caps.get(1902);
        glGetTexParameterIuivEXT = caps.get(1903);
        glTexStorage1DEXT = caps.get(1904);
        glTexStorage2DEXT = caps.get(1905);
        glTexStorage3DEXT = caps.get(1906);
        glGetQueryObjecti64vEXT = caps.get(1907);
        glGetQueryObjectui64vEXT = caps.get(1908);
        glBindBufferRangeEXT = caps.get(1909);
        glBindBufferOffsetEXT = caps.get(1910);
        glBindBufferBaseEXT = caps.get(1911);
        glBeginTransformFeedbackEXT = caps.get(1912);
        glEndTransformFeedbackEXT = caps.get(1913);
        glTransformFeedbackVaryingsEXT = caps.get(1914);
        glGetTransformFeedbackVaryingEXT = caps.get(1915);
        glVertexAttribL1dEXT = caps.get(1916);
        glVertexAttribL2dEXT = caps.get(1917);
        glVertexAttribL3dEXT = caps.get(1918);
        glVertexAttribL4dEXT = caps.get(1919);
        glVertexAttribL1dvEXT = caps.get(1920);
        glVertexAttribL2dvEXT = caps.get(1921);
        glVertexAttribL3dvEXT = caps.get(1922);
        glVertexAttribL4dvEXT = caps.get(1923);
        glVertexAttribLPointerEXT = caps.get(1924);
        glGetVertexAttribLdvEXT = caps.get(1925);
        glAcquireKeyedMutexWin32EXT = caps.get(1926);
        glReleaseKeyedMutexWin32EXT = caps.get(1927);
        glWindowRectanglesEXT = caps.get(1928);
        glImportSyncEXT = caps.get(1929);
        glFrameTerminatorGREMEDY = caps.get(1930);
        glStringMarkerGREMEDY = caps.get(1931);
        glApplyFramebufferAttachmentCMAAINTEL = caps.get(1932);
        glSyncTextureINTEL = caps.get(1933);
        glUnmapTexture2DINTEL = caps.get(1934);
        glMapTexture2DINTEL = caps.get(1935);
        glBeginPerfQueryINTEL = caps.get(1936);
        glCreatePerfQueryINTEL = caps.get(1937);
        glDeletePerfQueryINTEL = caps.get(1938);
        glEndPerfQueryINTEL = caps.get(1939);
        glGetFirstPerfQueryIdINTEL = caps.get(1940);
        glGetNextPerfQueryIdINTEL = caps.get(1941);
        glGetPerfCounterInfoINTEL = caps.get(1942);
        glGetPerfQueryDataINTEL = caps.get(1943);
        glGetPerfQueryIdByNameINTEL = caps.get(1944);
        glGetPerfQueryInfoINTEL = caps.get(1945);
        glBlendBarrierKHR = caps.get(1946);
        glMaxShaderCompilerThreadsKHR = caps.get(1947);
        glFramebufferParameteriMESA = caps.get(1948);
        glGetFramebufferParameterivMESA = caps.get(1949);
        glAlphaToCoverageDitherControlNV = caps.get(1950);
        glMultiDrawArraysIndirectBindlessNV = caps.get(1951);
        glMultiDrawElementsIndirectBindlessNV = caps.get(1952);
        glMultiDrawArraysIndirectBindlessCountNV = caps.get(1953);
        glMultiDrawElementsIndirectBindlessCountNV = caps.get(1954);
        glGetTextureHandleNV = caps.get(1955);
        glGetTextureSamplerHandleNV = caps.get(1956);
        glMakeTextureHandleResidentNV = caps.get(1957);
        glMakeTextureHandleNonResidentNV = caps.get(1958);
        glGetImageHandleNV = caps.get(1959);
        glMakeImageHandleResidentNV = caps.get(1960);
        glMakeImageHandleNonResidentNV = caps.get(1961);
        glUniformHandleui64NV = caps.get(1962);
        glUniformHandleui64vNV = caps.get(1963);
        glProgramUniformHandleui64NV = caps.get(1964);
        glProgramUniformHandleui64vNV = caps.get(1965);
        glIsTextureHandleResidentNV = caps.get(1966);
        glIsImageHandleResidentNV = caps.get(1967);
        glBlendParameteriNV = caps.get(1968);
        glBlendBarrierNV = caps.get(1969);
        glViewportPositionWScaleNV = caps.get(1970);
        glCreateStatesNV = caps.get(1971);
        glDeleteStatesNV = caps.get(1972);
        glIsStateNV = caps.get(1973);
        glStateCaptureNV = caps.get(1974);
        glGetCommandHeaderNV = caps.get(1975);
        glGetStageIndexNV = caps.get(1976);
        glDrawCommandsNV = caps.get(1977);
        glDrawCommandsAddressNV = caps.get(1978);
        glDrawCommandsStatesNV = caps.get(1979);
        glDrawCommandsStatesAddressNV = caps.get(1980);
        glCreateCommandListsNV = caps.get(1981);
        glDeleteCommandListsNV = caps.get(1982);
        glIsCommandListNV = caps.get(1983);
        glListDrawCommandsStatesClientNV = caps.get(1984);
        glCommandListSegmentsNV = caps.get(1985);
        glCompileCommandListNV = caps.get(1986);
        glCallCommandListNV = caps.get(1987);
        glBeginConditionalRenderNV = caps.get(1988);
        glEndConditionalRenderNV = caps.get(1989);
        glSubpixelPrecisionBiasNV = caps.get(1990);
        glConservativeRasterParameterfNV = caps.get(1991);
        glConservativeRasterParameteriNV = caps.get(1992);
        glCopyImageSubDataNV = caps.get(1993);
        glDepthRangedNV = caps.get(1994);
        glClearDepthdNV = caps.get(1995);
        glDepthBoundsdNV = caps.get(1996);
        glDrawTextureNV = caps.get(1997);
        glDrawVkImageNV = caps.get(1998);
        glGetVkProcAddrNV = caps.get(1999);
        glWaitVkSemaphoreNV = caps.get(2000);
        glSignalVkSemaphoreNV = caps.get(2001);
        glSignalVkFenceNV = caps.get(2002);
        glGetMultisamplefvNV = caps.get(2003);
        glSampleMaskIndexedNV = caps.get(2004);
        glTexRenderbufferNV = caps.get(2005);
        glDeleteFencesNV = caps.get(2006);
        glGenFencesNV = caps.get(2007);
        glIsFenceNV = caps.get(2008);
        glTestFenceNV = caps.get(2009);
        glGetFenceivNV = caps.get(2010);
        glFinishFenceNV = caps.get(2011);
        glSetFenceNV = caps.get(2012);
        glFragmentCoverageColorNV = caps.get(2013);
        glCoverageModulationTableNV = caps.get(2014);
        glGetCoverageModulationTableNV = caps.get(2015);
        glCoverageModulationNV = caps.get(2016);
        glRenderbufferStorageMultisampleCoverageNV = caps.get(2017);
        glRenderGpuMaskNV = caps.get(2018);
        glMulticastBufferSubDataNV = caps.get(2019);
        glMulticastCopyBufferSubDataNV = caps.get(2020);
        glMulticastCopyImageSubDataNV = caps.get(2021);
        glMulticastBlitFramebufferNV = caps.get(2022);
        glMulticastFramebufferSampleLocationsfvNV = caps.get(2023);
        glMulticastBarrierNV = caps.get(2024);
        glMulticastWaitSyncNV = caps.get(2025);
        glMulticastGetQueryObjectivNV = caps.get(2026);
        glMulticastGetQueryObjectuivNV = caps.get(2027);
        glMulticastGetQueryObjecti64vNV = caps.get(2028);
        glMulticastGetQueryObjectui64vNV = caps.get(2029);
        glVertex2hNV = caps.get(2030);
        glVertex2hvNV = caps.get(2031);
        glVertex3hNV = caps.get(2032);
        glVertex3hvNV = caps.get(2033);
        glVertex4hNV = caps.get(2034);
        glVertex4hvNV = caps.get(2035);
        glNormal3hNV = caps.get(2036);
        glNormal3hvNV = caps.get(2037);
        glColor3hNV = caps.get(2038);
        glColor3hvNV = caps.get(2039);
        glColor4hNV = caps.get(2040);
        glColor4hvNV = caps.get(2041);
        glTexCoord1hNV = caps.get(2042);
        glTexCoord1hvNV = caps.get(2043);
        glTexCoord2hNV = caps.get(2044);
        glTexCoord2hvNV = caps.get(2045);
        glTexCoord3hNV = caps.get(2046);
        glTexCoord3hvNV = caps.get(2047);
        glTexCoord4hNV = caps.get(2048);
        glTexCoord4hvNV = caps.get(2049);
        glMultiTexCoord1hNV = caps.get(2050);
        glMultiTexCoord1hvNV = caps.get(2051);
        glMultiTexCoord2hNV = caps.get(2052);
        glMultiTexCoord2hvNV = caps.get(2053);
        glMultiTexCoord3hNV = caps.get(2054);
        glMultiTexCoord3hvNV = caps.get(2055);
        glMultiTexCoord4hNV = caps.get(2056);
        glMultiTexCoord4hvNV = caps.get(2057);
        glFogCoordhNV = caps.get(2058);
        glFogCoordhvNV = caps.get(2059);
        glSecondaryColor3hNV = caps.get(2060);
        glSecondaryColor3hvNV = caps.get(2061);
        glVertexWeighthNV = caps.get(2062);
        glVertexWeighthvNV = caps.get(2063);
        glVertexAttrib1hNV = caps.get(2064);
        glVertexAttrib1hvNV = caps.get(2065);
        glVertexAttrib2hNV = caps.get(2066);
        glVertexAttrib2hvNV = caps.get(2067);
        glVertexAttrib3hNV = caps.get(2068);
        glVertexAttrib3hvNV = caps.get(2069);
        glVertexAttrib4hNV = caps.get(2070);
        glVertexAttrib4hvNV = caps.get(2071);
        glVertexAttribs1hvNV = caps.get(2072);
        glVertexAttribs2hvNV = caps.get(2073);
        glVertexAttribs3hvNV = caps.get(2074);
        glVertexAttribs4hvNV = caps.get(2075);
        glGetInternalformatSampleivNV = caps.get(2076);
        glGetMemoryObjectDetachedResourcesuivNV = caps.get(2077);
        glResetMemoryObjectParameterNV = caps.get(2078);
        glTexAttachMemoryNV = caps.get(2079);
        glBufferAttachMemoryNV = caps.get(2080);
        glTextureAttachMemoryNV = caps.get(2081);
        glNamedBufferAttachMemoryNV = caps.get(2082);
        glBufferPageCommitmentMemNV = caps.get(2083);
        glNamedBufferPageCommitmentMemNV = caps.get(2084);
        glTexPageCommitmentMemNV = caps.get(2085);
        glTexturePageCommitmentMemNV = caps.get(2086);
        glDrawMeshTasksNV = caps.get(2087);
        glDrawMeshTasksIndirectNV = caps.get(2088);
        glMultiDrawMeshTasksIndirectNV = caps.get(2089);
        glMultiDrawMeshTasksIndirectCountNV = caps.get(2090);
        glPathCommandsNV = caps.get(2091);
        glPathCoordsNV = caps.get(2092);
        glPathSubCommandsNV = caps.get(2093);
        glPathSubCoordsNV = caps.get(2094);
        glPathStringNV = caps.get(2095);
        glPathGlyphsNV = caps.get(2096);
        glPathGlyphRangeNV = caps.get(2097);
        glPathGlyphIndexArrayNV = caps.get(2098);
        glPathMemoryGlyphIndexArrayNV = caps.get(2099);
        glCopyPathNV = caps.get(2100);
        glWeightPathsNV = caps.get(2101);
        glInterpolatePathsNV = caps.get(2102);
        glTransformPathNV = caps.get(2103);
        glPathParameterivNV = caps.get(2104);
        glPathParameteriNV = caps.get(2105);
        glPathParameterfvNV = caps.get(2106);
        glPathParameterfNV = caps.get(2107);
        glPathDashArrayNV = caps.get(2108);
        glGenPathsNV = caps.get(2109);
        glDeletePathsNV = caps.get(2110);
        glIsPathNV = caps.get(2111);
        glPathStencilFuncNV = caps.get(2112);
        glPathStencilDepthOffsetNV = caps.get(2113);
        glStencilFillPathNV = caps.get(2114);
        glStencilStrokePathNV = caps.get(2115);
        glStencilFillPathInstancedNV = caps.get(2116);
        glStencilStrokePathInstancedNV = caps.get(2117);
        glPathCoverDepthFuncNV = caps.get(2118);
        glPathColorGenNV = caps.get(2119);
        glPathTexGenNV = caps.get(2120);
        glPathFogGenNV = caps.get(2121);
        glCoverFillPathNV = caps.get(2122);
        glCoverStrokePathNV = caps.get(2123);
        glCoverFillPathInstancedNV = caps.get(2124);
        glCoverStrokePathInstancedNV = caps.get(2125);
        glStencilThenCoverFillPathNV = caps.get(2126);
        glStencilThenCoverStrokePathNV = caps.get(2127);
        glStencilThenCoverFillPathInstancedNV = caps.get(2128);
        glStencilThenCoverStrokePathInstancedNV = caps.get(2129);
        glPathGlyphIndexRangeNV = caps.get(2130);
        glProgramPathFragmentInputGenNV = caps.get(2131);
        glGetPathParameterivNV = caps.get(2132);
        glGetPathParameterfvNV = caps.get(2133);
        glGetPathCommandsNV = caps.get(2134);
        glGetPathCoordsNV = caps.get(2135);
        glGetPathDashArrayNV = caps.get(2136);
        glGetPathMetricsNV = caps.get(2137);
        glGetPathMetricRangeNV = caps.get(2138);
        glGetPathSpacingNV = caps.get(2139);
        glGetPathColorGenivNV = caps.get(2140);
        glGetPathColorGenfvNV = caps.get(2141);
        glGetPathTexGenivNV = caps.get(2142);
        glGetPathTexGenfvNV = caps.get(2143);
        glIsPointInFillPathNV = caps.get(2144);
        glIsPointInStrokePathNV = caps.get(2145);
        glGetPathLengthNV = caps.get(2146);
        glPointAlongPathNV = caps.get(2147);
        glMatrixLoad3x2fNV = caps.get(2148);
        glMatrixLoad3x3fNV = caps.get(2149);
        glMatrixLoadTranspose3x3fNV = caps.get(2150);
        glMatrixMult3x2fNV = caps.get(2151);
        glMatrixMult3x3fNV = caps.get(2152);
        glMatrixMultTranspose3x3fNV = caps.get(2153);
        glGetProgramResourcefvNV = caps.get(2154);
        glPixelDataRangeNV = caps.get(2155);
        glFlushPixelDataRangeNV = caps.get(2156);
        glPointParameteriNV = caps.get(2157);
        glPointParameterivNV = caps.get(2158);
        glPrimitiveRestartNV = caps.get(2159);
        glPrimitiveRestartIndexNV = caps.get(2160);
        glQueryResourceNV = caps.get(2161);
        glGenQueryResourceTagNV = caps.get(2162);
        glDeleteQueryResourceTagNV = caps.get(2163);
        glQueryResourceTagNV = caps.get(2164);
        glFramebufferSampleLocationsfvNV = caps.get(2165);
        glNamedFramebufferSampleLocationsfvNV = caps.get(2166);
        glResolveDepthValuesNV = caps.get(2167);
        glScissorExclusiveArrayvNV = caps.get(2168);
        glScissorExclusiveNV = caps.get(2169);
        glMakeBufferResidentNV = caps.get(2170);
        glMakeBufferNonResidentNV = caps.get(2171);
        glIsBufferResidentNV = caps.get(2172);
        glMakeNamedBufferResidentNV = caps.get(2173);
        glMakeNamedBufferNonResidentNV = caps.get(2174);
        glIsNamedBufferResidentNV = caps.get(2175);
        glGetBufferParameterui64vNV = caps.get(2176);
        glGetNamedBufferParameterui64vNV = caps.get(2177);
        glGetIntegerui64vNV = caps.get(2178);
        glUniformui64NV = caps.get(2179);
        glUniformui64vNV = caps.get(2180);
        glProgramUniformui64NV = caps.get(2181);
        glProgramUniformui64vNV = caps.get(2182);
        glBindShadingRateImageNV = caps.get(2183);
        glShadingRateImagePaletteNV = caps.get(2184);
        glGetShadingRateImagePaletteNV = caps.get(2185);
        glShadingRateImageBarrierNV = caps.get(2186);
        glShadingRateSampleOrderNV = caps.get(2187);
        glShadingRateSampleOrderCustomNV = caps.get(2188);
        glGetShadingRateSampleLocationivNV = caps.get(2189);
        glTextureBarrierNV = caps.get(2190);
        glTexImage2DMultisampleCoverageNV = caps.get(2191);
        glTexImage3DMultisampleCoverageNV = caps.get(2192);
        glTextureImage2DMultisampleNV = caps.get(2193);
        glTextureImage3DMultisampleNV = caps.get(2194);
        glTextureImage2DMultisampleCoverageNV = caps.get(2195);
        glTextureImage3DMultisampleCoverageNV = caps.get(2196);
        glCreateSemaphoresNV = caps.get(2197);
        glSemaphoreParameterivNV = caps.get(2198);
        glGetSemaphoreParameterivNV = caps.get(2199);
        glBeginTransformFeedbackNV = caps.get(2200);
        glEndTransformFeedbackNV = caps.get(2201);
        glTransformFeedbackAttribsNV = caps.get(2202);
        glBindBufferRangeNV = caps.get(2203);
        glBindBufferOffsetNV = caps.get(2204);
        glBindBufferBaseNV = caps.get(2205);
        glTransformFeedbackVaryingsNV = caps.get(2206);
        glActiveVaryingNV = caps.get(2207);
        glGetVaryingLocationNV = caps.get(2208);
        glGetActiveVaryingNV = caps.get(2209);
        glGetTransformFeedbackVaryingNV = caps.get(2210);
        glTransformFeedbackStreamAttribsNV = caps.get(2211);
        glBindTransformFeedbackNV = caps.get(2212);
        glDeleteTransformFeedbacksNV = caps.get(2213);
        glGenTransformFeedbacksNV = caps.get(2214);
        glIsTransformFeedbackNV = caps.get(2215);
        glPauseTransformFeedbackNV = caps.get(2216);
        glResumeTransformFeedbackNV = caps.get(2217);
        glDrawTransformFeedbackNV = caps.get(2218);
        glVertexArrayRangeNV = caps.get(2219);
        glFlushVertexArrayRangeNV = caps.get(2220);
        glVertexAttribL1i64NV = caps.get(2221);
        glVertexAttribL2i64NV = caps.get(2222);
        glVertexAttribL3i64NV = caps.get(2223);
        glVertexAttribL4i64NV = caps.get(2224);
        glVertexAttribL1i64vNV = caps.get(2225);
        glVertexAttribL2i64vNV = caps.get(2226);
        glVertexAttribL3i64vNV = caps.get(2227);
        glVertexAttribL4i64vNV = caps.get(2228);
        glVertexAttribL1ui64NV = caps.get(2229);
        glVertexAttribL2ui64NV = caps.get(2230);
        glVertexAttribL3ui64NV = caps.get(2231);
        glVertexAttribL4ui64NV = caps.get(2232);
        glVertexAttribL1ui64vNV = caps.get(2233);
        glVertexAttribL2ui64vNV = caps.get(2234);
        glVertexAttribL3ui64vNV = caps.get(2235);
        glVertexAttribL4ui64vNV = caps.get(2236);
        glGetVertexAttribLi64vNV = caps.get(2237);
        glGetVertexAttribLui64vNV = caps.get(2238);
        glVertexAttribLFormatNV = caps.get(2239);
        glBufferAddressRangeNV = caps.get(2240);
        glVertexFormatNV = caps.get(2241);
        glNormalFormatNV = caps.get(2242);
        glColorFormatNV = caps.get(2243);
        glIndexFormatNV = caps.get(2244);
        glTexCoordFormatNV = caps.get(2245);
        glEdgeFlagFormatNV = caps.get(2246);
        glSecondaryColorFormatNV = caps.get(2247);
        glFogCoordFormatNV = caps.get(2248);
        glVertexAttribFormatNV = caps.get(2249);
        glVertexAttribIFormatNV = caps.get(2250);
        glGetIntegerui64i_vNV = caps.get(2251);
        glViewportSwizzleNV = caps.get(2252);
        glBeginConditionalRenderNVX = caps.get(2253);
        glEndConditionalRenderNVX = caps.get(2254);
        glAsyncCopyImageSubDataNVX = caps.get(2255);
        glAsyncCopyBufferSubDataNVX = caps.get(2256);
        glUploadGpuMaskNVX = caps.get(2257);
        glMulticastViewportArrayvNVX = caps.get(2258);
        glMulticastScissorArrayvNVX = caps.get(2259);
        glMulticastViewportPositionWScaleNVX = caps.get(2260);
        glCreateProgressFenceNVX = caps.get(2261);
        glSignalSemaphoreui64NVX = caps.get(2262);
        glWaitSemaphoreui64NVX = caps.get(2263);
        glClientWaitSemaphoreui64NVX = caps.get(2264);
        glFramebufferTextureMultiviewOVR = caps.get(2265);
        glNamedFramebufferTextureMultiviewOVR = caps.get(2266);

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenGL function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }

    /** Ensures that the lwjgl_opengl shared library has been loaded. */
    public static void initialize() {
        // intentionally empty to trigger static initializer
    }

    private static boolean check_GL11(FunctionProvider provider, PointerBuffer caps, Set<String> ext, boolean fc) {
        if (!ext.contains("OpenGL11")) {
            return false;
        }

        int flag0 = !fc || ext.contains("GL_NV_vertex_buffer_unified_memory") ? 0 : Integer.MIN_VALUE;

        return ((fc || checkFunctions(provider, caps, new int[] {
            2, 3, 4, 5, 6, 8, 10, 11, 13, 16, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 
            46, 47, 48, 49, 50, 52, 53, 54, 56, 64, 65, 66, 67, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 85, 86, 87, 88, 90, 93, 99, 100, 101, 
            102, 103, 104, 105, 106, 107, 108, 110, 112, 113, 114, 115, 116, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 138, 140, 
            141, 142, 143, 144, 145, 146, 147, 148, 150, 151, 152, 153, 154, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 
            172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 192, 193, 194, 198, 199, 200, 201, 202, 203, 204, 205, 
            206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 234, 235, 236, 
            237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 248, 249, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 
            270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 308, 309, 310, 
            311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334
        },
            "glAccum", "glAlphaFunc", "glAreTexturesResident", "glArrayElement", "glBegin", "glBitmap", "glCallList", "glCallLists", "glClearAccum", 
            "glClearIndex", "glClipPlane", "glColor3b", "glColor3s", "glColor3i", "glColor3f", "glColor3d", "glColor3ub", "glColor3us", "glColor3ui", 
            "glColor3bv", "glColor3sv", "glColor3iv", "glColor3fv", "glColor3dv", "glColor3ubv", "glColor3usv", "glColor3uiv", "glColor4b", "glColor4s", 
            "glColor4i", "glColor4f", "glColor4d", "glColor4ub", "glColor4us", "glColor4ui", "glColor4bv", "glColor4sv", "glColor4iv", "glColor4fv", 
            "glColor4dv", "glColor4ubv", "glColor4usv", "glColor4uiv", "glColorMaterial", "glColorPointer", "glCopyPixels", "glDeleteLists", "glDrawPixels", 
            "glEdgeFlag", "glEdgeFlagv", "glEdgeFlagPointer", "glEnd", "glEvalCoord1f", "glEvalCoord1fv", "glEvalCoord1d", "glEvalCoord1dv", "glEvalCoord2f", 
            "glEvalCoord2fv", "glEvalCoord2d", "glEvalCoord2dv", "glEvalMesh1", "glEvalMesh2", "glEvalPoint1", "glEvalPoint2", "glFeedbackBuffer", "glFogi", 
            "glFogiv", "glFogf", "glFogfv", "glGenLists", "glGetClipPlane", "glGetLightiv", "glGetLightfv", "glGetMapiv", "glGetMapfv", "glGetMapdv", 
            "glGetMaterialiv", "glGetMaterialfv", "glGetPixelMapfv", "glGetPixelMapusv", "glGetPixelMapuiv", "glGetPolygonStipple", "glGetTexEnviv", 
            "glGetTexEnvfv", "glGetTexGeniv", "glGetTexGenfv", "glGetTexGendv", "glIndexi", "glIndexub", "glIndexs", "glIndexf", "glIndexd", "glIndexiv", 
            "glIndexubv", "glIndexsv", "glIndexfv", "glIndexdv", "glIndexMask", "glIndexPointer", "glInitNames", "glInterleavedArrays", "glIsList", 
            "glLightModeli", "glLightModelf", "glLightModeliv", "glLightModelfv", "glLighti", "glLightf", "glLightiv", "glLightfv", "glLineStipple", 
            "glListBase", "glLoadMatrixf", "glLoadMatrixd", "glLoadIdentity", "glLoadName", "glMap1f", "glMap1d", "glMap2f", "glMap2d", "glMapGrid1f", 
            "glMapGrid1d", "glMapGrid2f", "glMapGrid2d", "glMateriali", "glMaterialf", "glMaterialiv", "glMaterialfv", "glMatrixMode", "glMultMatrixf", 
            "glMultMatrixd", "glFrustum", "glNewList", "glEndList", "glNormal3f", "glNormal3b", "glNormal3s", "glNormal3i", "glNormal3d", "glNormal3fv", 
            "glNormal3bv", "glNormal3sv", "glNormal3iv", "glNormal3dv", "glNormalPointer", "glOrtho", "glPassThrough", "glPixelMapfv", "glPixelMapusv", 
            "glPixelMapuiv", "glPixelTransferi", "glPixelTransferf", "glPixelZoom", "glPolygonStipple", "glPushAttrib", "glPushClientAttrib", "glPopAttrib", 
            "glPopClientAttrib", "glPopMatrix", "glPopName", "glPrioritizeTextures", "glPushMatrix", "glPushName", "glRasterPos2i", "glRasterPos2s", 
            "glRasterPos2f", "glRasterPos2d", "glRasterPos2iv", "glRasterPos2sv", "glRasterPos2fv", "glRasterPos2dv", "glRasterPos3i", "glRasterPos3s", 
            "glRasterPos3f", "glRasterPos3d", "glRasterPos3iv", "glRasterPos3sv", "glRasterPos3fv", "glRasterPos3dv", "glRasterPos4i", "glRasterPos4s", 
            "glRasterPos4f", "glRasterPos4d", "glRasterPos4iv", "glRasterPos4sv", "glRasterPos4fv", "glRasterPos4dv", "glRecti", "glRects", "glRectf", 
            "glRectd", "glRectiv", "glRectsv", "glRectfv", "glRectdv", "glRenderMode", "glRotatef", "glRotated", "glScalef", "glScaled", "glSelectBuffer", 
            "glShadeModel", "glTexCoord1f", "glTexCoord1s", "glTexCoord1i", "glTexCoord1d", "glTexCoord1fv", "glTexCoord1sv", "glTexCoord1iv", "glTexCoord1dv", 
            "glTexCoord2f", "glTexCoord2s", "glTexCoord2i", "glTexCoord2d", "glTexCoord2fv", "glTexCoord2sv", "glTexCoord2iv", "glTexCoord2dv", "glTexCoord3f", 
            "glTexCoord3s", "glTexCoord3i", "glTexCoord3d", "glTexCoord3fv", "glTexCoord3sv", "glTexCoord3iv", "glTexCoord3dv", "glTexCoord4f", "glTexCoord4s", 
            "glTexCoord4i", "glTexCoord4d", "glTexCoord4fv", "glTexCoord4sv", "glTexCoord4iv", "glTexCoord4dv", "glTexCoordPointer", "glTexEnvi", "glTexEnviv", 
            "glTexEnvf", "glTexEnvfv", "glTexGeni", "glTexGeniv", "glTexGenf", "glTexGenfv", "glTexGend", "glTexGendv", "glTranslatef", "glTranslated", 
            "glVertex2f", "glVertex2s", "glVertex2i", "glVertex2d", "glVertex2fv", "glVertex2sv", "glVertex2iv", "glVertex2dv", "glVertex3f", "glVertex3s", 
            "glVertex3i", "glVertex3d", "glVertex3fv", "glVertex3sv", "glVertex3iv", "glVertex3dv", "glVertex4f", "glVertex4s", "glVertex4i", "glVertex4d", 
            "glVertex4fv", "glVertex4sv", "glVertex4iv", "glVertex4dv", "glVertexPointer"
        )) && checkFunctions(provider, caps, new int[] {
            0, 1, 7, 9, 12, 14, 15, 17, 51, 55, 57, 58, 59, flag0 + 60, 61, 62, 63, flag0 + 68, 83, 84, 89, 91, 92, 94, 95, 96, 97, 98, 109, 111, 117, 118, 119, 
            120, 121, 122, 137, 139, 149, 155, 190, 191, 195, 196, 197, 232, 233, 247, 250, 251, 252, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 
            307, 335
        },
            "glEnable", "glDisable", "glBindTexture", "glBlendFunc", "glClear", "glClearColor", "glClearDepth", "glClearStencil", "glColorMask", "glCullFace", 
            "glDepthFunc", "glDepthMask", "glDepthRange", "glDisableClientState", "glDrawArrays", "glDrawBuffer", "glDrawElements", "glEnableClientState", 
            "glFinish", "glFlush", "glFrontFace", "glGenTextures", "glDeleteTextures", "glGetBooleanv", "glGetFloatv", "glGetIntegerv", "glGetDoublev", 
            "glGetError", "glGetPointerv", "glGetString", "glGetTexImage", "glGetTexLevelParameteriv", "glGetTexLevelParameterfv", "glGetTexParameteriv", 
            "glGetTexParameterfv", "glHint", "glIsEnabled", "glIsTexture", "glLineWidth", "glLogicOp", "glPixelStorei", "glPixelStoref", "glPointSize", 
            "glPolygonMode", "glPolygonOffset", "glReadBuffer", "glReadPixels", "glScissor", "glStencilFunc", "glStencilMask", "glStencilOp", "glTexImage1D", 
            "glTexImage2D", "glCopyTexImage1D", "glCopyTexImage2D", "glCopyTexSubImage1D", "glCopyTexSubImage2D", "glTexParameteri", "glTexParameteriv", 
            "glTexParameterf", "glTexParameterfv", "glTexSubImage1D", "glTexSubImage2D", "glViewport"
        )) || reportMissing("GL", "OpenGL11");
    }

    private static boolean check_GL12(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL12")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            336, 337, 338, 339
        },
            "glTexImage3D", "glTexSubImage3D", "glCopyTexSubImage3D", "glDrawRangeElements"
        )) || reportMissing("GL", "OpenGL12");
    }

    private static boolean check_GL13(FunctionProvider provider, PointerBuffer caps, Set<String> ext, boolean fc) {
        if (!ext.contains("OpenGL13")) {
            return false;
        }

        return ((fc || checkFunctions(provider, caps, new int[] {
            349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 
            378, 379, 380, 381, 382, 383, 384, 385
        },
            "glClientActiveTexture", "glMultiTexCoord1f", "glMultiTexCoord1s", "glMultiTexCoord1i", "glMultiTexCoord1d", "glMultiTexCoord1fv", 
            "glMultiTexCoord1sv", "glMultiTexCoord1iv", "glMultiTexCoord1dv", "glMultiTexCoord2f", "glMultiTexCoord2s", "glMultiTexCoord2i", 
            "glMultiTexCoord2d", "glMultiTexCoord2fv", "glMultiTexCoord2sv", "glMultiTexCoord2iv", "glMultiTexCoord2dv", "glMultiTexCoord3f", 
            "glMultiTexCoord3s", "glMultiTexCoord3i", "glMultiTexCoord3d", "glMultiTexCoord3fv", "glMultiTexCoord3sv", "glMultiTexCoord3iv", 
            "glMultiTexCoord3dv", "glMultiTexCoord4f", "glMultiTexCoord4s", "glMultiTexCoord4i", "glMultiTexCoord4d", "glMultiTexCoord4fv", 
            "glMultiTexCoord4sv", "glMultiTexCoord4iv", "glMultiTexCoord4dv", "glLoadTransposeMatrixf", "glLoadTransposeMatrixd", "glMultTransposeMatrixf", 
            "glMultTransposeMatrixd"
        )) && checkFunctions(provider, caps, new int[] {
            340, 341, 342, 343, 344, 345, 346, 347, 348
        },
            "glCompressedTexImage3D", "glCompressedTexImage2D", "glCompressedTexImage1D", "glCompressedTexSubImage3D", "glCompressedTexSubImage2D", 
            "glCompressedTexSubImage1D", "glGetCompressedTexImage", "glSampleCoverage", "glActiveTexture"
        )) || reportMissing("GL", "OpenGL13");
    }

    private static boolean check_GL14(FunctionProvider provider, PointerBuffer caps, Set<String> ext, boolean fc) {
        if (!ext.contains("OpenGL14")) {
            return false;
        }

        return ((fc || checkFunctions(provider, caps, new int[] {
            388, 389, 390, 391, 392, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 417, 418, 419, 420, 421, 422, 423, 
            424, 425, 426, 427, 428, 429, 430, 431, 432
        },
            "glFogCoordf", "glFogCoordd", "glFogCoordfv", "glFogCoorddv", "glFogCoordPointer", "glSecondaryColor3b", "glSecondaryColor3s", "glSecondaryColor3i", 
            "glSecondaryColor3f", "glSecondaryColor3d", "glSecondaryColor3ub", "glSecondaryColor3us", "glSecondaryColor3ui", "glSecondaryColor3bv", 
            "glSecondaryColor3sv", "glSecondaryColor3iv", "glSecondaryColor3fv", "glSecondaryColor3dv", "glSecondaryColor3ubv", "glSecondaryColor3usv", 
            "glSecondaryColor3uiv", "glSecondaryColorPointer", "glWindowPos2i", "glWindowPos2s", "glWindowPos2f", "glWindowPos2d", "glWindowPos2iv", 
            "glWindowPos2sv", "glWindowPos2fv", "glWindowPos2dv", "glWindowPos3i", "glWindowPos3s", "glWindowPos3f", "glWindowPos3d", "glWindowPos3iv", 
            "glWindowPos3sv", "glWindowPos3fv", "glWindowPos3dv"
        )) && checkFunctions(provider, caps, new int[] {
            386, 387, 393, 394, 395, 396, 397, 398, 416
        },
            "glBlendColor", "glBlendEquation", "glMultiDrawArrays", "glMultiDrawElements", "glPointParameterf", "glPointParameteri", "glPointParameterfv", 
            "glPointParameteriv", "glBlendFuncSeparate"
        )) || reportMissing("GL", "OpenGL14");
    }

    private static boolean check_GL15(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL15")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451
        },
            "glBindBuffer", "glDeleteBuffers", "glGenBuffers", "glIsBuffer", "glBufferData", "glBufferSubData", "glGetBufferSubData", "glMapBuffer", 
            "glUnmapBuffer", "glGetBufferParameteriv", "glGetBufferPointerv", "glGenQueries", "glDeleteQueries", "glIsQuery", "glBeginQuery", "glEndQuery", 
            "glGetQueryiv", "glGetQueryObjectiv", "glGetQueryObjectuiv"
        )) || reportMissing("GL", "OpenGL15");
    }

    private static boolean check_GL20(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL20")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 
            481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 
            510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538, 
            539, 540, 541, 542, 543, 544
        },
            "glCreateProgram", "glDeleteProgram", "glIsProgram", "glCreateShader", "glDeleteShader", "glIsShader", "glAttachShader", "glDetachShader", 
            "glShaderSource", "glCompileShader", "glLinkProgram", "glUseProgram", "glValidateProgram", "glUniform1f", "glUniform2f", "glUniform3f", 
            "glUniform4f", "glUniform1i", "glUniform2i", "glUniform3i", "glUniform4i", "glUniform1fv", "glUniform2fv", "glUniform3fv", "glUniform4fv", 
            "glUniform1iv", "glUniform2iv", "glUniform3iv", "glUniform4iv", "glUniformMatrix2fv", "glUniformMatrix3fv", "glUniformMatrix4fv", "glGetShaderiv", 
            "glGetProgramiv", "glGetShaderInfoLog", "glGetProgramInfoLog", "glGetAttachedShaders", "glGetUniformLocation", "glGetActiveUniform", 
            "glGetUniformfv", "glGetUniformiv", "glGetShaderSource", "glVertexAttrib1f", "glVertexAttrib1s", "glVertexAttrib1d", "glVertexAttrib2f", 
            "glVertexAttrib2s", "glVertexAttrib2d", "glVertexAttrib3f", "glVertexAttrib3s", "glVertexAttrib3d", "glVertexAttrib4f", "glVertexAttrib4s", 
            "glVertexAttrib4d", "glVertexAttrib4Nub", "glVertexAttrib1fv", "glVertexAttrib1sv", "glVertexAttrib1dv", "glVertexAttrib2fv", "glVertexAttrib2sv", 
            "glVertexAttrib2dv", "glVertexAttrib3fv", "glVertexAttrib3sv", "glVertexAttrib3dv", "glVertexAttrib4fv", "glVertexAttrib4sv", "glVertexAttrib4dv", 
            "glVertexAttrib4iv", "glVertexAttrib4bv", "glVertexAttrib4ubv", "glVertexAttrib4usv", "glVertexAttrib4uiv", "glVertexAttrib4Nbv", 
            "glVertexAttrib4Nsv", "glVertexAttrib4Niv", "glVertexAttrib4Nubv", "glVertexAttrib4Nusv", "glVertexAttrib4Nuiv", "glVertexAttribPointer", 
            "glEnableVertexAttribArray", "glDisableVertexAttribArray", "glBindAttribLocation", "glGetActiveAttrib", "glGetAttribLocation", 
            "glGetVertexAttribiv", "glGetVertexAttribfv", "glGetVertexAttribdv", "glGetVertexAttribPointerv", "glDrawBuffers", "glBlendEquationSeparate", 
            "glStencilOpSeparate", "glStencilFuncSeparate", "glStencilMaskSeparate"
        )) || reportMissing("GL", "OpenGL20");
    }

    private static boolean check_GL21(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL21")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            545, 546, 547, 548, 549, 550
        },
            "glUniformMatrix2x3fv", "glUniformMatrix3x2fv", "glUniformMatrix2x4fv", "glUniformMatrix4x2fv", "glUniformMatrix3x4fv", "glUniformMatrix4x3fv"
        )) || reportMissing("GL", "OpenGL21");
    }

    private static boolean check_GL30(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL30")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 
            580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 
            609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634
        },
            "glGetStringi", "glClearBufferiv", "glClearBufferuiv", "glClearBufferfv", "glClearBufferfi", "glVertexAttribI1i", "glVertexAttribI2i", 
            "glVertexAttribI3i", "glVertexAttribI4i", "glVertexAttribI1ui", "glVertexAttribI2ui", "glVertexAttribI3ui", "glVertexAttribI4ui", 
            "glVertexAttribI1iv", "glVertexAttribI2iv", "glVertexAttribI3iv", "glVertexAttribI4iv", "glVertexAttribI1uiv", "glVertexAttribI2uiv", 
            "glVertexAttribI3uiv", "glVertexAttribI4uiv", "glVertexAttribI4bv", "glVertexAttribI4sv", "glVertexAttribI4ubv", "glVertexAttribI4usv", 
            "glVertexAttribIPointer", "glGetVertexAttribIiv", "glGetVertexAttribIuiv", "glUniform1ui", "glUniform2ui", "glUniform3ui", "glUniform4ui", 
            "glUniform1uiv", "glUniform2uiv", "glUniform3uiv", "glUniform4uiv", "glGetUniformuiv", "glBindFragDataLocation", "glGetFragDataLocation", 
            "glBeginConditionalRender", "glEndConditionalRender", "glMapBufferRange", "glFlushMappedBufferRange", "glClampColor", "glIsRenderbuffer", 
            "glBindRenderbuffer", "glDeleteRenderbuffers", "glGenRenderbuffers", "glRenderbufferStorage", "glRenderbufferStorageMultisample", 
            "glGetRenderbufferParameteriv", "glIsFramebuffer", "glBindFramebuffer", "glDeleteFramebuffers", "glGenFramebuffers", "glCheckFramebufferStatus", 
            "glFramebufferTexture1D", "glFramebufferTexture2D", "glFramebufferTexture3D", "glFramebufferTextureLayer", "glFramebufferRenderbuffer", 
            "glGetFramebufferAttachmentParameteriv", "glBlitFramebuffer", "glGenerateMipmap", "glTexParameterIiv", "glTexParameterIuiv", "glGetTexParameterIiv", 
            "glGetTexParameterIuiv", "glColorMaski", "glGetBooleani_v", "glGetIntegeri_v", "glEnablei", "glDisablei", "glIsEnabledi", "glBindBufferRange", 
            "glBindBufferBase", "glBeginTransformFeedback", "glEndTransformFeedback", "glTransformFeedbackVaryings", "glGetTransformFeedbackVarying", 
            "glBindVertexArray", "glDeleteVertexArrays", "glGenVertexArrays", "glIsVertexArray"
        )) || reportMissing("GL", "OpenGL30");
    }

    private static boolean check_GL31(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL31")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646
        },
            "glDrawArraysInstanced", "glDrawElementsInstanced", "glCopyBufferSubData", "glPrimitiveRestartIndex", "glTexBuffer", "glGetUniformIndices", 
            "glGetActiveUniformsiv", "glGetActiveUniformName", "glGetUniformBlockIndex", "glGetActiveUniformBlockiv", "glGetActiveUniformBlockName", 
            "glUniformBlockBinding"
        )) || reportMissing("GL", "OpenGL31");
    }

    private static boolean check_GL32(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL32")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665
        },
            "glGetBufferParameteri64v", "glDrawElementsBaseVertex", "glDrawRangeElementsBaseVertex", "glDrawElementsInstancedBaseVertex", 
            "glMultiDrawElementsBaseVertex", "glProvokingVertex", "glTexImage2DMultisample", "glTexImage3DMultisample", "glGetMultisamplefv", "glSampleMaski", 
            "glFramebufferTexture", "glFenceSync", "glIsSync", "glDeleteSync", "glClientWaitSync", "glWaitSync", "glGetInteger64v", "glGetInteger64i_v", 
            "glGetSynciv"
        )) || reportMissing("GL", "OpenGL32");
    }

    private static boolean check_GL33(FunctionProvider provider, PointerBuffer caps, Set<String> ext, boolean fc) {
        if (!ext.contains("OpenGL33")) {
            return false;
        }

        return ((fc || checkFunctions(provider, caps, new int[] {
            686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 
            715
        },
            "glVertexP2ui", "glVertexP3ui", "glVertexP4ui", "glVertexP2uiv", "glVertexP3uiv", "glVertexP4uiv", "glTexCoordP1ui", "glTexCoordP2ui", 
            "glTexCoordP3ui", "glTexCoordP4ui", "glTexCoordP1uiv", "glTexCoordP2uiv", "glTexCoordP3uiv", "glTexCoordP4uiv", "glMultiTexCoordP1ui", 
            "glMultiTexCoordP2ui", "glMultiTexCoordP3ui", "glMultiTexCoordP4ui", "glMultiTexCoordP1uiv", "glMultiTexCoordP2uiv", "glMultiTexCoordP3uiv", 
            "glMultiTexCoordP4uiv", "glNormalP3ui", "glNormalP3uiv", "glColorP3ui", "glColorP4ui", "glColorP3uiv", "glColorP4uiv", "glSecondaryColorP3ui", 
            "glSecondaryColorP3uiv"
        )) && checkFunctions(provider, caps, new int[] {
            666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 716, 717, 718, 719, 720, 721, 722, 723
        },
            "glBindFragDataLocationIndexed", "glGetFragDataIndex", "glGenSamplers", "glDeleteSamplers", "glIsSampler", "glBindSampler", "glSamplerParameteri", 
            "glSamplerParameterf", "glSamplerParameteriv", "glSamplerParameterfv", "glSamplerParameterIiv", "glSamplerParameterIuiv", "glGetSamplerParameteriv", 
            "glGetSamplerParameterfv", "glGetSamplerParameterIiv", "glGetSamplerParameterIuiv", "glQueryCounter", "glGetQueryObjecti64v", 
            "glGetQueryObjectui64v", "glVertexAttribDivisor", "glVertexAttribP1ui", "glVertexAttribP2ui", "glVertexAttribP3ui", "glVertexAttribP4ui", 
            "glVertexAttribP1uiv", "glVertexAttribP2uiv", "glVertexAttribP3uiv", "glVertexAttribP4uiv"
        )) || reportMissing("GL", "OpenGL33");
    }

    private static boolean check_GL40(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL40")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 
            753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769
        },
            "glBlendEquationi", "glBlendEquationSeparatei", "glBlendFunci", "glBlendFuncSeparatei", "glDrawArraysIndirect", "glDrawElementsIndirect", 
            "glUniform1d", "glUniform2d", "glUniform3d", "glUniform4d", "glUniform1dv", "glUniform2dv", "glUniform3dv", "glUniform4dv", "glUniformMatrix2dv", 
            "glUniformMatrix3dv", "glUniformMatrix4dv", "glUniformMatrix2x3dv", "glUniformMatrix2x4dv", "glUniformMatrix3x2dv", "glUniformMatrix3x4dv", 
            "glUniformMatrix4x2dv", "glUniformMatrix4x3dv", "glGetUniformdv", "glMinSampleShading", "glGetSubroutineUniformLocation", "glGetSubroutineIndex", 
            "glGetActiveSubroutineUniformiv", "glGetActiveSubroutineUniformName", "glGetActiveSubroutineName", "glUniformSubroutinesuiv", 
            "glGetUniformSubroutineuiv", "glGetProgramStageiv", "glPatchParameteri", "glPatchParameterfv", "glBindTransformFeedback", 
            "glDeleteTransformFeedbacks", "glGenTransformFeedbacks", "glIsTransformFeedback", "glPauseTransformFeedback", "glResumeTransformFeedback", 
            "glDrawTransformFeedback", "glDrawTransformFeedbackStream", "glBeginQueryIndexed", "glEndQueryIndexed", "glGetQueryIndexediv"
        )) || reportMissing("GL", "OpenGL40");
    }

    private static boolean check_GL41(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL41")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 
            799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 
            828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 
            857
        },
            "glReleaseShaderCompiler", "glShaderBinary", "glGetShaderPrecisionFormat", "glDepthRangef", "glClearDepthf", "glGetProgramBinary", 
            "glProgramBinary", "glProgramParameteri", "glUseProgramStages", "glActiveShaderProgram", "glCreateShaderProgramv", "glBindProgramPipeline", 
            "glDeleteProgramPipelines", "glGenProgramPipelines", "glIsProgramPipeline", "glGetProgramPipelineiv", "glProgramUniform1i", "glProgramUniform2i", 
            "glProgramUniform3i", "glProgramUniform4i", "glProgramUniform1ui", "glProgramUniform2ui", "glProgramUniform3ui", "glProgramUniform4ui", 
            "glProgramUniform1f", "glProgramUniform2f", "glProgramUniform3f", "glProgramUniform4f", "glProgramUniform1d", "glProgramUniform2d", 
            "glProgramUniform3d", "glProgramUniform4d", "glProgramUniform1iv", "glProgramUniform2iv", "glProgramUniform3iv", "glProgramUniform4iv", 
            "glProgramUniform1uiv", "glProgramUniform2uiv", "glProgramUniform3uiv", "glProgramUniform4uiv", "glProgramUniform1fv", "glProgramUniform2fv", 
            "glProgramUniform3fv", "glProgramUniform4fv", "glProgramUniform1dv", "glProgramUniform2dv", "glProgramUniform3dv", "glProgramUniform4dv", 
            "glProgramUniformMatrix2fv", "glProgramUniformMatrix3fv", "glProgramUniformMatrix4fv", "glProgramUniformMatrix2dv", "glProgramUniformMatrix3dv", 
            "glProgramUniformMatrix4dv", "glProgramUniformMatrix2x3fv", "glProgramUniformMatrix3x2fv", "glProgramUniformMatrix2x4fv", 
            "glProgramUniformMatrix4x2fv", "glProgramUniformMatrix3x4fv", "glProgramUniformMatrix4x3fv", "glProgramUniformMatrix2x3dv", 
            "glProgramUniformMatrix3x2dv", "glProgramUniformMatrix2x4dv", "glProgramUniformMatrix4x2dv", "glProgramUniformMatrix3x4dv", 
            "glProgramUniformMatrix4x3dv", "glValidateProgramPipeline", "glGetProgramPipelineInfoLog", "glVertexAttribL1d", "glVertexAttribL2d", 
            "glVertexAttribL3d", "glVertexAttribL4d", "glVertexAttribL1dv", "glVertexAttribL2dv", "glVertexAttribL3dv", "glVertexAttribL4dv", 
            "glVertexAttribLPointer", "glGetVertexAttribLdv", "glViewportArrayv", "glViewportIndexedf", "glViewportIndexedfv", "glScissorArrayv", 
            "glScissorIndexed", "glScissorIndexedv", "glDepthRangeArrayv", "glDepthRangeIndexed", "glGetFloati_v", "glGetDoublei_v"
        )) || reportMissing("GL", "OpenGL41");
    }

    private static boolean check_GL42(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL42")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869
        },
            "glGetActiveAtomicCounterBufferiv", "glTexStorage1D", "glTexStorage2D", "glTexStorage3D", "glDrawTransformFeedbackInstanced", 
            "glDrawTransformFeedbackStreamInstanced", "glDrawArraysInstancedBaseInstance", "glDrawElementsInstancedBaseInstance", 
            "glDrawElementsInstancedBaseVertexBaseInstance", "glBindImageTexture", "glMemoryBarrier", "glGetInternalformativ"
        )) || reportMissing("GL", "OpenGL42");
    }

    private static boolean check_GL43(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL43")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 
            899, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912
        },
            "glClearBufferData", "glClearBufferSubData", "glDispatchCompute", "glDispatchComputeIndirect", "glCopyImageSubData", "glDebugMessageControl", 
            "glDebugMessageInsert", "glDebugMessageCallback", "glGetDebugMessageLog", "glPushDebugGroup", "glPopDebugGroup", "glObjectLabel", 
            "glGetObjectLabel", "glObjectPtrLabel", "glGetObjectPtrLabel", "glFramebufferParameteri", "glGetFramebufferParameteriv", "glGetInternalformati64v", 
            "glInvalidateTexSubImage", "glInvalidateTexImage", "glInvalidateBufferSubData", "glInvalidateBufferData", "glInvalidateFramebuffer", 
            "glInvalidateSubFramebuffer", "glMultiDrawArraysIndirect", "glMultiDrawElementsIndirect", "glGetProgramInterfaceiv", "glGetProgramResourceIndex", 
            "glGetProgramResourceName", "glGetProgramResourceiv", "glGetProgramResourceLocation", "glGetProgramResourceLocationIndex", 
            "glShaderStorageBlockBinding", "glTexBufferRange", "glTexStorage2DMultisample", "glTexStorage3DMultisample", "glTextureView", "glBindVertexBuffer", 
            "glVertexAttribFormat", "glVertexAttribIFormat", "glVertexAttribLFormat", "glVertexAttribBinding", "glVertexBindingDivisor"
        )) || reportMissing("GL", "OpenGL43");
    }

    private static boolean check_GL44(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL44")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            913, 914, 915, 916, 917, 918, 919, 920, 921
        },
            "glBufferStorage", "glClearTexSubImage", "glClearTexImage", "glBindBuffersBase", "glBindBuffersRange", "glBindTextures", "glBindSamplers", 
            "glBindImageTextures", "glBindVertexBuffers"
        )) || reportMissing("GL", "OpenGL44");
    }

    private static boolean check_GL45(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL45")) {
            return false;
        }

        int flag0 = provider.getFunctionAddress("glGetMapdv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag1 = provider.getFunctionAddress("glGetMapfv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag2 = provider.getFunctionAddress("glGetMapiv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag3 = provider.getFunctionAddress("glGetPixelMapfv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag4 = provider.getFunctionAddress("glGetPixelMapuiv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag5 = provider.getFunctionAddress("glGetPixelMapusv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag6 = provider.getFunctionAddress("glGetPolygonStipple") != NULL ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetColorTable") != NULL ? 0 : Integer.MIN_VALUE;
        int flag8 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetConvolutionFilter") != NULL ? 0 : Integer.MIN_VALUE;
        int flag9 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetSeparableFilter") != NULL ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetHistogram") != NULL ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetMinmax") != NULL ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 
            951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 
            980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 
            1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1022, 1023, 1024, 1033, 1040, 1042, 1043
        },
            "glClipControl", "glCreateTransformFeedbacks", "glTransformFeedbackBufferBase", "glTransformFeedbackBufferRange", "glGetTransformFeedbackiv", 
            "glGetTransformFeedbacki_v", "glGetTransformFeedbacki64_v", "glCreateBuffers", "glNamedBufferStorage", "glNamedBufferData", "glNamedBufferSubData", 
            "glCopyNamedBufferSubData", "glClearNamedBufferData", "glClearNamedBufferSubData", "glMapNamedBuffer", "glMapNamedBufferRange", 
            "glUnmapNamedBuffer", "glFlushMappedNamedBufferRange", "glGetNamedBufferParameteriv", "glGetNamedBufferParameteri64v", "glGetNamedBufferPointerv", 
            "glGetNamedBufferSubData", "glCreateFramebuffers", "glNamedFramebufferRenderbuffer", "glNamedFramebufferParameteri", "glNamedFramebufferTexture", 
            "glNamedFramebufferTextureLayer", "glNamedFramebufferDrawBuffer", "glNamedFramebufferDrawBuffers", "glNamedFramebufferReadBuffer", 
            "glInvalidateNamedFramebufferData", "glInvalidateNamedFramebufferSubData", "glClearNamedFramebufferiv", "glClearNamedFramebufferuiv", 
            "glClearNamedFramebufferfv", "glClearNamedFramebufferfi", "glBlitNamedFramebuffer", "glCheckNamedFramebufferStatus", 
            "glGetNamedFramebufferParameteriv", "glGetNamedFramebufferAttachmentParameteriv", "glCreateRenderbuffers", "glNamedRenderbufferStorage", 
            "glNamedRenderbufferStorageMultisample", "glGetNamedRenderbufferParameteriv", "glCreateTextures", "glTextureBuffer", "glTextureBufferRange", 
            "glTextureStorage1D", "glTextureStorage2D", "glTextureStorage3D", "glTextureStorage2DMultisample", "glTextureStorage3DMultisample", 
            "glTextureSubImage1D", "glTextureSubImage2D", "glTextureSubImage3D", "glCompressedTextureSubImage1D", "glCompressedTextureSubImage2D", 
            "glCompressedTextureSubImage3D", "glCopyTextureSubImage1D", "glCopyTextureSubImage2D", "glCopyTextureSubImage3D", "glTextureParameterf", 
            "glTextureParameterfv", "glTextureParameteri", "glTextureParameterIiv", "glTextureParameterIuiv", "glTextureParameteriv", "glGenerateTextureMipmap", 
            "glBindTextureUnit", "glGetTextureImage", "glGetCompressedTextureImage", "glGetTextureLevelParameterfv", "glGetTextureLevelParameteriv", 
            "glGetTextureParameterfv", "glGetTextureParameterIiv", "glGetTextureParameterIuiv", "glGetTextureParameteriv", "glCreateVertexArrays", 
            "glDisableVertexArrayAttrib", "glEnableVertexArrayAttrib", "glVertexArrayElementBuffer", "glVertexArrayVertexBuffer", "glVertexArrayVertexBuffers", 
            "glVertexArrayAttribFormat", "glVertexArrayAttribIFormat", "glVertexArrayAttribLFormat", "glVertexArrayAttribBinding", 
            "glVertexArrayBindingDivisor", "glGetVertexArrayiv", "glGetVertexArrayIndexediv", "glGetVertexArrayIndexed64iv", "glCreateSamplers", 
            "glCreateProgramPipelines", "glCreateQueries", "glGetQueryBufferObjectiv", "glGetQueryBufferObjectuiv", "glGetQueryBufferObjecti64v", 
            "glGetQueryBufferObjectui64v", "glMemoryBarrierByRegion", "glGetTextureSubImage", "glGetCompressedTextureSubImage", "glTextureBarrier", 
            "glGetGraphicsResetStatus", "glReadnPixels", "glGetnUniformfv", "glGetnUniformiv", "glGetnUniformuiv"
        )) || reportMissing("GL", "OpenGL45");
    }

    private static boolean check_GL46(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("OpenGL46")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1044, 1045, 1046, 1047
        },
            "glMultiDrawArraysIndirectCount", "glMultiDrawElementsIndirectCount", "glPolygonOffsetClamp", "glSpecializeShader"
        )) || reportMissing("GL", "OpenGL46");
    }

    private static boolean check_AMD_debug_output(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_debug_output")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1048, 1049, 1050, 1051
        },
            "glDebugMessageEnableAMD", "glDebugMessageInsertAMD", "glDebugMessageCallbackAMD", "glGetDebugMessageLogAMD"
        )) || reportMissing("GL", "GL_AMD_debug_output");
    }

    private static boolean check_AMD_draw_buffers_blend(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_draw_buffers_blend")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1052, 1053, 1054, 1055
        },
            "glBlendFuncIndexedAMD", "glBlendFuncSeparateIndexedAMD", "glBlendEquationIndexedAMD", "glBlendEquationSeparateIndexedAMD"
        )) || reportMissing("GL", "GL_AMD_draw_buffers_blend");
    }

    private static boolean check_AMD_framebuffer_multisample_advanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_framebuffer_multisample_advanced")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1056, 1057
        },
            "glRenderbufferStorageMultisampleAdvancedAMD", "glNamedRenderbufferStorageMultisampleAdvancedAMD"
        )) || reportMissing("GL", "GL_AMD_framebuffer_multisample_advanced");
    }

    private static boolean check_AMD_gpu_shader_int64(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_gpu_shader_int64")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1068, 1069, 1070, 1071, 1072, 1073, 1074, 1075, flag0 + 1076, flag0 + 1077, 
            flag0 + 1078, flag0 + 1079, flag0 + 1080, flag0 + 1081, flag0 + 1082, flag0 + 1083, flag0 + 1084, flag0 + 1085, flag0 + 1086, flag0 + 1087, 
            flag0 + 1088, flag0 + 1089, flag0 + 1090, flag0 + 1091
        },
            "glUniform1i64NV", "glUniform2i64NV", "glUniform3i64NV", "glUniform4i64NV", "glUniform1i64vNV", "glUniform2i64vNV", "glUniform3i64vNV", 
            "glUniform4i64vNV", "glUniform1ui64NV", "glUniform2ui64NV", "glUniform3ui64NV", "glUniform4ui64NV", "glUniform1ui64vNV", "glUniform2ui64vNV", 
            "glUniform3ui64vNV", "glUniform4ui64vNV", "glGetUniformi64vNV", "glGetUniformui64vNV", "glProgramUniform1i64NV", "glProgramUniform2i64NV", 
            "glProgramUniform3i64NV", "glProgramUniform4i64NV", "glProgramUniform1i64vNV", "glProgramUniform2i64vNV", "glProgramUniform3i64vNV", 
            "glProgramUniform4i64vNV", "glProgramUniform1ui64NV", "glProgramUniform2ui64NV", "glProgramUniform3ui64NV", "glProgramUniform4ui64NV", 
            "glProgramUniform1ui64vNV", "glProgramUniform2ui64vNV", "glProgramUniform3ui64vNV", "glProgramUniform4ui64vNV"
        )) || reportMissing("GL", "GL_AMD_gpu_shader_int64");
    }

    private static boolean check_AMD_interleaved_elements(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_interleaved_elements")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1092
        },
            "glVertexAttribParameteriAMD"
        )) || reportMissing("GL", "GL_AMD_interleaved_elements");
    }

    private static boolean check_AMD_occlusion_query_event(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_occlusion_query_event")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1093
        },
            "glQueryObjectParameteruiAMD"
        )) || reportMissing("GL", "GL_AMD_occlusion_query_event");
    }

    private static boolean check_AMD_performance_monitor(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_performance_monitor")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1094, 1095, 1096, 1097, 1098, 1099, 1100, 1101, 1102, 1103, 1104
        },
            "glGetPerfMonitorGroupsAMD", "glGetPerfMonitorCountersAMD", "glGetPerfMonitorGroupStringAMD", "glGetPerfMonitorCounterStringAMD", 
            "glGetPerfMonitorCounterInfoAMD", "glGenPerfMonitorsAMD", "glDeletePerfMonitorsAMD", "glSelectPerfMonitorCountersAMD", "glBeginPerfMonitorAMD", 
            "glEndPerfMonitorAMD", "glGetPerfMonitorCounterDataAMD"
        )) || reportMissing("GL", "GL_AMD_performance_monitor");
    }

    private static boolean check_AMD_sample_positions(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_sample_positions")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1105
        },
            "glSetMultisamplefvAMD"
        )) || reportMissing("GL", "GL_AMD_sample_positions");
    }

    private static boolean check_AMD_sparse_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_sparse_texture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1106, 1107
        },
            "glTexStorageSparseAMD", "glTextureStorageSparseAMD"
        )) || reportMissing("GL", "GL_AMD_sparse_texture");
    }

    private static boolean check_AMD_stencil_operation_extended(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_stencil_operation_extended")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1108
        },
            "glStencilOpValueAMD"
        )) || reportMissing("GL", "GL_AMD_stencil_operation_extended");
    }

    private static boolean check_AMD_vertex_shader_tessellator(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_vertex_shader_tessellator")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1109, 1110
        },
            "glTessellationFactorAMD", "glTessellationModeAMD"
        )) || reportMissing("GL", "GL_AMD_vertex_shader_tessellator");
    }

    private static boolean check_APPLE_element_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_element_array")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1111, 1112, 1113, 1114, 1115
        },
            "glElementPointerAPPLE", "glDrawElementArrayAPPLE", "glDrawRangeElementArrayAPPLE", "glMultiDrawElementArrayAPPLE", 
            "glMultiDrawRangeElementArrayAPPLE"
        )) || reportMissing("GL", "GL_APPLE_element_array");
    }

    private static boolean check_APPLE_fence(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_fence")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1116, 1117, 1118, 1119, 1120, 1121, 1122, 1123
        },
            "glGenFencesAPPLE", "glDeleteFencesAPPLE", "glSetFenceAPPLE", "glIsFenceAPPLE", "glTestFenceAPPLE", "glFinishFenceAPPLE", "glTestObjectAPPLE", 
            "glFinishObjectAPPLE"
        )) || reportMissing("GL", "GL_APPLE_fence");
    }

    private static boolean check_APPLE_flush_buffer_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_flush_buffer_range")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1124, 1125
        },
            "glBufferParameteriAPPLE", "glFlushMappedBufferRangeAPPLE"
        )) || reportMissing("GL", "GL_APPLE_flush_buffer_range");
    }

    private static boolean check_APPLE_object_purgeable(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_object_purgeable")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1126, 1127, 1128
        },
            "glObjectPurgeableAPPLE", "glObjectUnpurgeableAPPLE", "glGetObjectParameterivAPPLE"
        )) || reportMissing("GL", "GL_APPLE_object_purgeable");
    }

    private static boolean check_APPLE_texture_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_texture_range")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1129, 1130
        },
            "glTextureRangeAPPLE", "glGetTexParameterPointervAPPLE"
        )) || reportMissing("GL", "GL_APPLE_texture_range");
    }

    private static boolean check_APPLE_vertex_array_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_vertex_array_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1131, 1132, 1133, 1134
        },
            "glBindVertexArrayAPPLE", "glDeleteVertexArraysAPPLE", "glGenVertexArraysAPPLE", "glIsVertexArrayAPPLE"
        )) || reportMissing("GL", "GL_APPLE_vertex_array_object");
    }

    private static boolean check_APPLE_vertex_array_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_vertex_array_range")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1135, 1136, 1137
        },
            "glVertexArrayRangeAPPLE", "glFlushVertexArrayRangeAPPLE", "glVertexArrayParameteriAPPLE"
        )) || reportMissing("GL", "GL_APPLE_vertex_array_range");
    }

    private static boolean check_APPLE_vertex_program_evaluators(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_vertex_program_evaluators")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1138, 1139, 1140, 1141, 1142, 1143, 1144
        },
            "glEnableVertexAttribAPPLE", "glDisableVertexAttribAPPLE", "glIsVertexAttribEnabledAPPLE", "glMapVertexAttrib1dAPPLE", "glMapVertexAttrib1fAPPLE", 
            "glMapVertexAttrib2dAPPLE", "glMapVertexAttrib2fAPPLE"
        )) || reportMissing("GL", "GL_APPLE_vertex_program_evaluators");
    }

    private static boolean check_ARB_base_instance(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_base_instance")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            864, 865, 866
        },
            "glDrawArraysInstancedBaseInstance", "glDrawElementsInstancedBaseInstance", "glDrawElementsInstancedBaseVertexBaseInstance"
        )) || reportMissing("GL", "GL_ARB_base_instance");
    }

    private static boolean check_ARB_bindless_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_bindless_texture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1145, 1146, 1147, 1148, 1149, 1150, 1151, 1152, 1153, 1154, 1155, 1156, 1157, 1158, 1159, 1160
        },
            "glGetTextureHandleARB", "glGetTextureSamplerHandleARB", "glMakeTextureHandleResidentARB", "glMakeTextureHandleNonResidentARB", 
            "glGetImageHandleARB", "glMakeImageHandleResidentARB", "glMakeImageHandleNonResidentARB", "glUniformHandleui64ARB", "glUniformHandleui64vARB", 
            "glProgramUniformHandleui64ARB", "glProgramUniformHandleui64vARB", "glIsTextureHandleResidentARB", "glIsImageHandleResidentARB", 
            "glVertexAttribL1ui64ARB", "glVertexAttribL1ui64vARB", "glGetVertexAttribLui64vARB"
        )) || reportMissing("GL", "GL_ARB_bindless_texture");
    }

    private static boolean check_ARB_blend_func_extended(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_blend_func_extended")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            666, 667
        },
            "glBindFragDataLocationIndexed", "glGetFragDataIndex"
        )) || reportMissing("GL", "GL_ARB_blend_func_extended");
    }

    private static boolean check_ARB_buffer_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_buffer_storage")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            913, flag0 + 1161
        },
            "glBufferStorage", "glNamedBufferStorageEXT"
        )) || reportMissing("GL", "GL_ARB_buffer_storage");
    }

    private static boolean check_ARB_cl_event(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_cl_event")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1162
        },
            "glCreateSyncFromCLeventARB"
        )) || reportMissing("GL", "GL_ARB_cl_event");
    }

    private static boolean check_ARB_clear_buffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_clear_buffer_object")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            870, 871, flag0 + 1163, flag0 + 1164
        },
            "glClearBufferData", "glClearBufferSubData", "glClearNamedBufferDataEXT", "glClearNamedBufferSubDataEXT"
        )) || reportMissing("GL", "GL_ARB_clear_buffer_object");
    }

    private static boolean check_ARB_clear_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_clear_texture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            914, 915
        },
            "glClearTexSubImage", "glClearTexImage"
        )) || reportMissing("GL", "GL_ARB_clear_texture");
    }

    private static boolean check_ARB_clip_control(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_clip_control")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            922
        },
            "glClipControl"
        )) || reportMissing("GL", "GL_ARB_clip_control");
    }

    private static boolean check_ARB_color_buffer_float(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_color_buffer_float")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1165
        },
            "glClampColorARB"
        )) || reportMissing("GL", "GL_ARB_color_buffer_float");
    }

    private static boolean check_ARB_compute_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_compute_shader")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            872, 873
        },
            "glDispatchCompute", "glDispatchComputeIndirect"
        )) || reportMissing("GL", "GL_ARB_compute_shader");
    }

    private static boolean check_ARB_compute_variable_group_size(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_compute_variable_group_size")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1166
        },
            "glDispatchComputeGroupSizeARB"
        )) || reportMissing("GL", "GL_ARB_compute_variable_group_size");
    }

    private static boolean check_ARB_copy_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_copy_buffer")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            637
        },
            "glCopyBufferSubData"
        )) || reportMissing("GL", "GL_ARB_copy_buffer");
    }

    private static boolean check_ARB_copy_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_copy_image")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            874
        },
            "glCopyImageSubData"
        )) || reportMissing("GL", "GL_ARB_copy_image");
    }

    private static boolean check_ARB_debug_output(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_debug_output")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1167, 1168, 1169, 1170
        },
            "glDebugMessageControlARB", "glDebugMessageInsertARB", "glDebugMessageCallbackARB", "glGetDebugMessageLogARB"
        )) || reportMissing("GL", "GL_ARB_debug_output");
    }

    private static boolean check_ARB_direct_state_access(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_direct_state_access")) {
            return false;
        }

        int flag0 = ARB_transform_feedback2(ext) ? 0 : Integer.MIN_VALUE;
        int flag1 = ARB_uniform_buffer_object(ext) ? 0 : Integer.MIN_VALUE;
        int flag6 = ARB_buffer_storage(ext) ? 0 : Integer.MIN_VALUE;
        int flag7 = ARB_copy_buffer(ext) ? 0 : Integer.MIN_VALUE;
        int flag8 = ARB_clear_texture(ext) ? 0 : Integer.MIN_VALUE;
        int flag10 = ARB_map_buffer_range(ext) ? 0 : Integer.MIN_VALUE;
        int flag12 = ARB_framebuffer_object(ext) ? 0 : Integer.MIN_VALUE;
        int flag14 = ARB_framebuffer_no_attachments(ext) ? 0 : Integer.MIN_VALUE;
        int flag20 = ARB_invalidate_subdata(ext) ? 0 : Integer.MIN_VALUE;
        int flag34 = ARB_texture_buffer_object(ext) ? 0 : Integer.MIN_VALUE;
        int flag35 = ARB_texture_buffer_range(ext) ? 0 : Integer.MIN_VALUE;
        int flag36 = ARB_texture_storage(ext) ? 0 : Integer.MIN_VALUE;
        int flag39 = ARB_texture_storage_multisample(ext) ? 0 : Integer.MIN_VALUE;
        int flag42 = ARB_vertex_array_object(ext) ? 0 : Integer.MIN_VALUE;
        int flag46 = ARB_vertex_attrib_binding(ext) ? 0 : Integer.MIN_VALUE;
        int flag47 = ARB_multi_bind(ext) ? 0 : Integer.MIN_VALUE;
        int flag56 = ARB_sampler_objects(ext) ? 0 : Integer.MIN_VALUE;
        int flag57 = ARB_separate_shader_objects(ext) ? 0 : Integer.MIN_VALUE;
        int flag58 = ARB_query_buffer_object(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            flag0 + 923, flag1 + 924, flag1 + 925, flag0 + 926, flag0 + 927, flag0 + 928, 929, flag6 + 930, 931, 932, flag7 + 933, flag8 + 934, flag8 + 935, 
            936, flag10 + 937, 938, flag10 + 939, 940, 941, 942, 943, flag12 + 944, flag12 + 945, flag14 + 946, flag12 + 947, flag12 + 948, flag12 + 949, 
            flag12 + 950, flag12 + 951, flag20 + 952, flag20 + 953, flag12 + 954, flag12 + 955, flag12 + 956, flag12 + 957, flag12 + 958, flag12 + 959, 
            flag14 + 960, flag12 + 961, flag12 + 962, flag12 + 963, flag12 + 964, flag12 + 965, 966, flag34 + 967, flag35 + 968, flag36 + 969, flag36 + 970, 
            flag36 + 971, flag39 + 972, flag39 + 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, flag12 + 989, 990, 991, 992, 
            993, 994, 995, 996, 997, 998, flag42 + 999, flag42 + 1000, flag42 + 1001, flag42 + 1002, flag46 + 1003, flag47 + 1004, flag46 + 1005, flag46 + 1006, 
            flag46 + 1007, flag46 + 1008, flag46 + 1009, flag42 + 1010, flag42 + 1011, flag42 + 1012, flag56 + 1013, flag57 + 1014, 1015, flag58 + 1018, 
            flag58 + 1016, flag58 + 1019, flag58 + 1017
        },
            "glCreateTransformFeedbacks", "glTransformFeedbackBufferBase", "glTransformFeedbackBufferRange", "glGetTransformFeedbackiv", 
            "glGetTransformFeedbacki_v", "glGetTransformFeedbacki64_v", "glCreateBuffers", "glNamedBufferStorage", "glNamedBufferData", "glNamedBufferSubData", 
            "glCopyNamedBufferSubData", "glClearNamedBufferData", "glClearNamedBufferSubData", "glMapNamedBuffer", "glMapNamedBufferRange", 
            "glUnmapNamedBuffer", "glFlushMappedNamedBufferRange", "glGetNamedBufferParameteriv", "glGetNamedBufferParameteri64v", "glGetNamedBufferPointerv", 
            "glGetNamedBufferSubData", "glCreateFramebuffers", "glNamedFramebufferRenderbuffer", "glNamedFramebufferParameteri", "glNamedFramebufferTexture", 
            "glNamedFramebufferTextureLayer", "glNamedFramebufferDrawBuffer", "glNamedFramebufferDrawBuffers", "glNamedFramebufferReadBuffer", 
            "glInvalidateNamedFramebufferData", "glInvalidateNamedFramebufferSubData", "glClearNamedFramebufferiv", "glClearNamedFramebufferuiv", 
            "glClearNamedFramebufferfv", "glClearNamedFramebufferfi", "glBlitNamedFramebuffer", "glCheckNamedFramebufferStatus", 
            "glGetNamedFramebufferParameteriv", "glGetNamedFramebufferAttachmentParameteriv", "glCreateRenderbuffers", "glNamedRenderbufferStorage", 
            "glNamedRenderbufferStorageMultisample", "glGetNamedRenderbufferParameteriv", "glCreateTextures", "glTextureBuffer", "glTextureBufferRange", 
            "glTextureStorage1D", "glTextureStorage2D", "glTextureStorage3D", "glTextureStorage2DMultisample", "glTextureStorage3DMultisample", 
            "glTextureSubImage1D", "glTextureSubImage2D", "glTextureSubImage3D", "glCompressedTextureSubImage1D", "glCompressedTextureSubImage2D", 
            "glCompressedTextureSubImage3D", "glCopyTextureSubImage1D", "glCopyTextureSubImage2D", "glCopyTextureSubImage3D", "glTextureParameterf", 
            "glTextureParameterfv", "glTextureParameteri", "glTextureParameterIiv", "glTextureParameterIuiv", "glTextureParameteriv", "glGenerateTextureMipmap", 
            "glBindTextureUnit", "glGetTextureImage", "glGetCompressedTextureImage", "glGetTextureLevelParameterfv", "glGetTextureLevelParameteriv", 
            "glGetTextureParameterfv", "glGetTextureParameterIiv", "glGetTextureParameterIuiv", "glGetTextureParameteriv", "glCreateVertexArrays", 
            "glDisableVertexArrayAttrib", "glEnableVertexArrayAttrib", "glVertexArrayElementBuffer", "glVertexArrayVertexBuffer", "glVertexArrayVertexBuffers", 
            "glVertexArrayAttribFormat", "glVertexArrayAttribIFormat", "glVertexArrayAttribLFormat", "glVertexArrayAttribBinding", 
            "glVertexArrayBindingDivisor", "glGetVertexArrayiv", "glGetVertexArrayIndexediv", "glGetVertexArrayIndexed64iv", "glCreateSamplers", 
            "glCreateProgramPipelines", "glCreateQueries", "glGetQueryBufferObjecti64v", "glGetQueryBufferObjectiv", "glGetQueryBufferObjectui64v", 
            "glGetQueryBufferObjectuiv"
        )) || reportMissing("GL", "GL_ARB_direct_state_access");
    }

    private static boolean check_ARB_draw_buffers(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_draw_buffers")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1171
        },
            "glDrawBuffersARB"
        )) || reportMissing("GL", "GL_ARB_draw_buffers");
    }

    private static boolean check_ARB_draw_buffers_blend(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_draw_buffers_blend")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1172, 1173, 1174, 1175
        },
            "glBlendEquationiARB", "glBlendEquationSeparateiARB", "glBlendFunciARB", "glBlendFuncSeparateiARB"
        )) || reportMissing("GL", "GL_ARB_draw_buffers_blend");
    }

    private static boolean check_ARB_draw_elements_base_vertex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_draw_elements_base_vertex")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            648, 649, 650, 651
        },
            "glDrawElementsBaseVertex", "glDrawRangeElementsBaseVertex", "glDrawElementsInstancedBaseVertex", "glMultiDrawElementsBaseVertex"
        )) || reportMissing("GL", "GL_ARB_draw_elements_base_vertex");
    }

    private static boolean check_ARB_draw_indirect(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_draw_indirect")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            728, 729
        },
            "glDrawArraysIndirect", "glDrawElementsIndirect"
        )) || reportMissing("GL", "GL_ARB_draw_indirect");
    }

    private static boolean check_ARB_draw_instanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_draw_instanced")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1176, 1177
        },
            "glDrawArraysInstancedARB", "glDrawElementsInstancedARB"
        )) || reportMissing("GL", "GL_ARB_draw_instanced");
    }

    private static boolean check_ARB_ES2_compatibility(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_ES2_compatibility")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            770, 771, 772, 773, 774
        },
            "glReleaseShaderCompiler", "glShaderBinary", "glGetShaderPrecisionFormat", "glDepthRangef", "glClearDepthf"
        )) || reportMissing("GL", "GL_ARB_ES2_compatibility");
    }

    private static boolean check_ARB_ES3_1_compatibility(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_ES3_1_compatibility")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1020
        },
            "glMemoryBarrierByRegion"
        )) || reportMissing("GL", "GL_ARB_ES3_1_compatibility");
    }

    private static boolean check_ARB_ES3_2_compatibility(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_ES3_2_compatibility")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1178
        },
            "glPrimitiveBoundingBoxARB"
        )) || reportMissing("GL", "GL_ARB_ES3_2_compatibility");
    }

    private static boolean check_ARB_framebuffer_no_attachments(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_framebuffer_no_attachments")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            885, 886, flag0 + 1179, flag0 + 1180
        },
            "glFramebufferParameteri", "glGetFramebufferParameteriv", "glNamedFramebufferParameteriEXT", "glGetNamedFramebufferParameterivEXT"
        )) || reportMissing("GL", "GL_ARB_framebuffer_no_attachments");
    }

    private static boolean check_ARB_framebuffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_framebuffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614
        },
            "glIsRenderbuffer", "glBindRenderbuffer", "glDeleteRenderbuffers", "glGenRenderbuffers", "glRenderbufferStorage", 
            "glRenderbufferStorageMultisample", "glGetRenderbufferParameteriv", "glIsFramebuffer", "glBindFramebuffer", "glDeleteFramebuffers", 
            "glGenFramebuffers", "glCheckFramebufferStatus", "glFramebufferTexture1D", "glFramebufferTexture2D", "glFramebufferTexture3D", 
            "glFramebufferTextureLayer", "glFramebufferRenderbuffer", "glGetFramebufferAttachmentParameteriv", "glBlitFramebuffer", "glGenerateMipmap"
        )) || reportMissing("GL", "GL_ARB_framebuffer_object");
    }

    private static boolean check_ARB_geometry_shader4(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_geometry_shader4")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1181, 1182, 1183, 1184
        },
            "glProgramParameteriARB", "glFramebufferTextureARB", "glFramebufferTextureLayerARB", "glFramebufferTextureFaceARB"
        )) || reportMissing("GL", "GL_ARB_geometry_shader4");
    }

    private static boolean check_ARB_get_program_binary(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_get_program_binary")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            775, 776, 777
        },
            "glGetProgramBinary", "glProgramBinary", "glProgramParameteri"
        )) || reportMissing("GL", "GL_ARB_get_program_binary");
    }

    private static boolean check_ARB_get_texture_sub_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_get_texture_sub_image")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1021, 1022
        },
            "glGetTextureSubImage", "glGetCompressedTextureSubImage"
        )) || reportMissing("GL", "GL_ARB_get_texture_sub_image");
    }

    private static boolean check_ARB_gl_spirv(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_gl_spirv")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1185
        },
            "glSpecializeShaderARB"
        )) || reportMissing("GL", "GL_ARB_gl_spirv");
    }

    private static boolean check_ARB_gpu_shader_fp64(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_gpu_shader_fp64")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747
        },
            "glUniform1d", "glUniform2d", "glUniform3d", "glUniform4d", "glUniform1dv", "glUniform2dv", "glUniform3dv", "glUniform4dv", "glUniformMatrix2dv", 
            "glUniformMatrix3dv", "glUniformMatrix4dv", "glUniformMatrix2x3dv", "glUniformMatrix2x4dv", "glUniformMatrix3x2dv", "glUniformMatrix3x4dv", 
            "glUniformMatrix4x2dv", "glUniformMatrix4x3dv", "glGetUniformdv"
        )) || reportMissing("GL", "GL_ARB_gpu_shader_fp64");
    }

    private static boolean check_ARB_gpu_shader_int64(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_gpu_shader_int64")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210, 1211, 1212, 1213, 1214, 1215, 1216, 1217, 1218, 1219, 1220, 1221, 1222, 1223, 1224, 1225, 1226, 
            1227, 1228, 1229, 1230, 1231, 1232, 1233, 1234, 1235, 1236, 1237, 1238
        },
            "glUniform1i64ARB", "glUniform1i64vARB", "glProgramUniform1i64ARB", "glProgramUniform1i64vARB", "glUniform2i64ARB", "glUniform2i64vARB", 
            "glProgramUniform2i64ARB", "glProgramUniform2i64vARB", "glUniform3i64ARB", "glUniform3i64vARB", "glProgramUniform3i64ARB", 
            "glProgramUniform3i64vARB", "glUniform4i64ARB", "glUniform4i64vARB", "glProgramUniform4i64ARB", "glProgramUniform4i64vARB", "glUniform1ui64ARB", 
            "glUniform1ui64vARB", "glProgramUniform1ui64ARB", "glProgramUniform1ui64vARB", "glUniform2ui64ARB", "glUniform2ui64vARB", 
            "glProgramUniform2ui64ARB", "glProgramUniform2ui64vARB", "glUniform3ui64ARB", "glUniform3ui64vARB", "glProgramUniform3ui64ARB", 
            "glProgramUniform3ui64vARB", "glUniform4ui64ARB", "glUniform4ui64vARB", "glProgramUniform4ui64ARB", "glProgramUniform4ui64vARB", 
            "glGetUniformi64vARB", "glGetUniformui64vARB", "glGetnUniformi64vARB", "glGetnUniformui64vARB"
        )) || reportMissing("GL", "GL_ARB_gpu_shader_int64");
    }

    private static boolean check_ARB_imaging(FunctionProvider provider, PointerBuffer caps, Set<String> ext, boolean fc) {
        if (!ext.contains("GL_ARB_imaging")) {
            return false;
        }

        return ((fc || checkFunctions(provider, caps, new int[] {
            1239, 1240, 1241, 1242, 1243, 1244, 1245, 1246, 1247, 1248, 1249, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1257, 1258, 1259, 1260, 1261, 1262, 
            1263, 1264, 1265, 1266, 1267, 1268, 1269, 1270
        },
            "glColorTable", "glCopyColorTable", "glColorTableParameteriv", "glColorTableParameterfv", "glGetColorTable", "glGetColorTableParameteriv", 
            "glGetColorTableParameterfv", "glColorSubTable", "glCopyColorSubTable", "glConvolutionFilter1D", "glConvolutionFilter2D", 
            "glCopyConvolutionFilter1D", "glCopyConvolutionFilter2D", "glGetConvolutionFilter", "glSeparableFilter2D", "glGetSeparableFilter", 
            "glConvolutionParameteri", "glConvolutionParameteriv", "glConvolutionParameterf", "glConvolutionParameterfv", "glGetConvolutionParameteriv", 
            "glGetConvolutionParameterfv", "glHistogram", "glResetHistogram", "glGetHistogram", "glGetHistogramParameteriv", "glGetHistogramParameterfv", 
            "glMinmax", "glResetMinmax", "glGetMinmax", "glGetMinmaxParameteriv", "glGetMinmaxParameterfv"
        )) && checkFunctions(provider, caps, new int[] {
            386, 387
        },
            "glBlendColor", "glBlendEquation"
        )) || reportMissing("GL", "GL_ARB_imaging");
    }

    private static boolean check_ARB_indirect_parameters(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_indirect_parameters")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1271, 1272
        },
            "glMultiDrawArraysIndirectCountARB", "glMultiDrawElementsIndirectCountARB"
        )) || reportMissing("GL", "GL_ARB_indirect_parameters");
    }

    private static boolean check_ARB_instanced_arrays(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_instanced_arrays")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1273
        },
            "glVertexAttribDivisorARB"
        )) || reportMissing("GL", "GL_ARB_instanced_arrays");
    }

    private static boolean check_ARB_internalformat_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_internalformat_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            869
        },
            "glGetInternalformativ"
        )) || reportMissing("GL", "GL_ARB_internalformat_query");
    }

    private static boolean check_ARB_internalformat_query2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_internalformat_query2")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            887
        },
            "glGetInternalformati64v"
        )) || reportMissing("GL", "GL_ARB_internalformat_query2");
    }

    private static boolean check_ARB_invalidate_subdata(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_invalidate_subdata")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            888, 889, 890, 891, 892, 893
        },
            "glInvalidateTexSubImage", "glInvalidateTexImage", "glInvalidateBufferSubData", "glInvalidateBufferData", "glInvalidateFramebuffer", 
            "glInvalidateSubFramebuffer"
        )) || reportMissing("GL", "GL_ARB_invalidate_subdata");
    }

    private static boolean check_ARB_map_buffer_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_map_buffer_range")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            592, 593
        },
            "glMapBufferRange", "glFlushMappedBufferRange"
        )) || reportMissing("GL", "GL_ARB_map_buffer_range");
    }

    private static boolean check_ARB_matrix_palette(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_matrix_palette")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1275, 1276, 1277, 1278, 1279
        },
            "glCurrentPaletteMatrixARB", "glMatrixIndexuivARB", "glMatrixIndexubvARB", "glMatrixIndexusvARB", "glMatrixIndexPointerARB"
        )) || reportMissing("GL", "GL_ARB_matrix_palette");
    }

    private static boolean check_ARB_multi_bind(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_multi_bind")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            916, 917, 918, 919, 920, 921
        },
            "glBindBuffersBase", "glBindBuffersRange", "glBindTextures", "glBindSamplers", "glBindImageTextures", "glBindVertexBuffers"
        )) || reportMissing("GL", "GL_ARB_multi_bind");
    }

    private static boolean check_ARB_multi_draw_indirect(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_multi_draw_indirect")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            894, 895
        },
            "glMultiDrawArraysIndirect", "glMultiDrawElementsIndirect"
        )) || reportMissing("GL", "GL_ARB_multi_draw_indirect");
    }

    private static boolean check_ARB_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_multisample")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1280
        },
            "glSampleCoverageARB"
        )) || reportMissing("GL", "GL_ARB_multisample");
    }

    private static boolean check_ARB_multitexture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_multitexture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1281, 1282, 1283, 1284, 1285, 1286, 1287, 1288, 1289, 1290, 1291, 1292, 1293, 1294, 1295, 1296, 1297, 1298, 1299, 1300, 1301, 1302, 1303, 1304, 
            1305, 1306, 1307, 1308, 1309, 1310, 1311, 1312, 1313, 1314
        },
            "glActiveTextureARB", "glClientActiveTextureARB", "glMultiTexCoord1fARB", "glMultiTexCoord1sARB", "glMultiTexCoord1iARB", "glMultiTexCoord1dARB", 
            "glMultiTexCoord1fvARB", "glMultiTexCoord1svARB", "glMultiTexCoord1ivARB", "glMultiTexCoord1dvARB", "glMultiTexCoord2fARB", "glMultiTexCoord2sARB", 
            "glMultiTexCoord2iARB", "glMultiTexCoord2dARB", "glMultiTexCoord2fvARB", "glMultiTexCoord2svARB", "glMultiTexCoord2ivARB", "glMultiTexCoord2dvARB", 
            "glMultiTexCoord3fARB", "glMultiTexCoord3sARB", "glMultiTexCoord3iARB", "glMultiTexCoord3dARB", "glMultiTexCoord3fvARB", "glMultiTexCoord3svARB", 
            "glMultiTexCoord3ivARB", "glMultiTexCoord3dvARB", "glMultiTexCoord4fARB", "glMultiTexCoord4sARB", "glMultiTexCoord4iARB", "glMultiTexCoord4dARB", 
            "glMultiTexCoord4fvARB", "glMultiTexCoord4svARB", "glMultiTexCoord4ivARB", "glMultiTexCoord4dvARB"
        )) || reportMissing("GL", "GL_ARB_multitexture");
    }

    private static boolean check_ARB_occlusion_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_occlusion_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1315, 1316, 1317, 1318, 1319, 1320, 1321, 1322
        },
            "glGenQueriesARB", "glDeleteQueriesARB", "glIsQueryARB", "glBeginQueryARB", "glEndQueryARB", "glGetQueryivARB", "glGetQueryObjectivARB", 
            "glGetQueryObjectuivARB"
        )) || reportMissing("GL", "GL_ARB_occlusion_query");
    }

    private static boolean check_ARB_parallel_shader_compile(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_parallel_shader_compile")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1323
        },
            "glMaxShaderCompilerThreadsARB"
        )) || reportMissing("GL", "GL_ARB_parallel_shader_compile");
    }

    private static boolean check_ARB_point_parameters(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_point_parameters")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1324, 1325
        },
            "glPointParameterfARB", "glPointParameterfvARB"
        )) || reportMissing("GL", "GL_ARB_point_parameters");
    }

    private static boolean check_ARB_polygon_offset_clamp(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_polygon_offset_clamp")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1046
        },
            "glPolygonOffsetClamp"
        )) || reportMissing("GL", "GL_ARB_polygon_offset_clamp");
    }

    private static boolean check_ARB_program_interface_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_program_interface_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            896, 897, 898, 899, 900, 901
        },
            "glGetProgramInterfaceiv", "glGetProgramResourceIndex", "glGetProgramResourceName", "glGetProgramResourceiv", "glGetProgramResourceLocation", 
            "glGetProgramResourceLocationIndex"
        )) || reportMissing("GL", "GL_ARB_program_interface_query");
    }

    private static boolean check_ARB_provoking_vertex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_provoking_vertex")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            652
        },
            "glProvokingVertex"
        )) || reportMissing("GL", "GL_ARB_provoking_vertex");
    }

    private static boolean check_ARB_robustness(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_robustness")) {
            return false;
        }

        int flag0 = provider.getFunctionAddress("glGetMapdv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag1 = provider.getFunctionAddress("glGetMapfv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag2 = provider.getFunctionAddress("glGetMapiv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag3 = provider.getFunctionAddress("glGetPixelMapfv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag4 = provider.getFunctionAddress("glGetPixelMapuiv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag5 = provider.getFunctionAddress("glGetPixelMapusv") != NULL ? 0 : Integer.MIN_VALUE;
        int flag6 = provider.getFunctionAddress("glGetPolygonStipple") != NULL ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetColorTable") != NULL ? 0 : Integer.MIN_VALUE;
        int flag8 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetConvolutionFilter") != NULL ? 0 : Integer.MIN_VALUE;
        int flag9 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetSeparableFilter") != NULL ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetHistogram") != NULL ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("GL_ARB_imaging") && provider.getFunctionAddress("glGetMinmax") != NULL ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("OpenGL13") ? 0 : Integer.MIN_VALUE;
        int flag13 = ext.contains("OpenGL20") ? 0 : Integer.MIN_VALUE;
        int flag15 = ext.contains("OpenGL30") ? 0 : Integer.MIN_VALUE;
        int flag16 = ext.contains("OpenGL40") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1326, flag0 + 1327, flag1 + 1328, flag2 + 1329, flag3 + 1330, flag4 + 1331, flag5 + 1332, flag6 + 1333, 1334, 1335, flag7 + 1336, flag8 + 1337, 
            flag9 + 1338, flag10 + 1339, flag11 + 1340, flag12 + 1341, flag13 + 1342, flag13 + 1343, flag15 + 1344, flag16 + 1345
        },
            "glGetGraphicsResetStatusARB", "glGetnMapdvARB", "glGetnMapfvARB", "glGetnMapivARB", "glGetnPixelMapfvARB", "glGetnPixelMapuivARB", 
            "glGetnPixelMapusvARB", "glGetnPolygonStippleARB", "glGetnTexImageARB", "glReadnPixelsARB", "glGetnColorTableARB", "glGetnConvolutionFilterARB", 
            "glGetnSeparableFilterARB", "glGetnHistogramARB", "glGetnMinmaxARB", "glGetnCompressedTexImageARB", "glGetnUniformfvARB", "glGetnUniformivARB", 
            "glGetnUniformuivARB", "glGetnUniformdvARB"
        )) || reportMissing("GL", "GL_ARB_robustness");
    }

    private static boolean check_ARB_sample_locations(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_sample_locations")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1346, 1347, 1348
        },
            "glFramebufferSampleLocationsfvARB", "glNamedFramebufferSampleLocationsfvARB", "glEvaluateDepthValuesARB"
        )) || reportMissing("GL", "GL_ARB_sample_locations");
    }

    private static boolean check_ARB_sample_shading(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_sample_shading")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1349
        },
            "glMinSampleShadingARB"
        )) || reportMissing("GL", "GL_ARB_sample_shading");
    }

    private static boolean check_ARB_sampler_objects(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_sampler_objects")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681
        },
            "glGenSamplers", "glDeleteSamplers", "glIsSampler", "glBindSampler", "glSamplerParameteri", "glSamplerParameterf", "glSamplerParameteriv", 
            "glSamplerParameterfv", "glSamplerParameterIiv", "glSamplerParameterIuiv", "glGetSamplerParameteriv", "glGetSamplerParameterfv", 
            "glGetSamplerParameterIiv", "glGetSamplerParameterIuiv"
        )) || reportMissing("GL", "GL_ARB_sampler_objects");
    }

    private static boolean check_ARB_separate_shader_objects(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_separate_shader_objects")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            778, 779, 780, 781, 782, 783, 784, 777, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 
            806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 
            835, 836, 837
        },
            "glUseProgramStages", "glActiveShaderProgram", "glCreateShaderProgramv", "glBindProgramPipeline", "glDeleteProgramPipelines", 
            "glGenProgramPipelines", "glIsProgramPipeline", "glProgramParameteri", "glGetProgramPipelineiv", "glProgramUniform1i", "glProgramUniform2i", 
            "glProgramUniform3i", "glProgramUniform4i", "glProgramUniform1ui", "glProgramUniform2ui", "glProgramUniform3ui", "glProgramUniform4ui", 
            "glProgramUniform1f", "glProgramUniform2f", "glProgramUniform3f", "glProgramUniform4f", "glProgramUniform1d", "glProgramUniform2d", 
            "glProgramUniform3d", "glProgramUniform4d", "glProgramUniform1iv", "glProgramUniform2iv", "glProgramUniform3iv", "glProgramUniform4iv", 
            "glProgramUniform1uiv", "glProgramUniform2uiv", "glProgramUniform3uiv", "glProgramUniform4uiv", "glProgramUniform1fv", "glProgramUniform2fv", 
            "glProgramUniform3fv", "glProgramUniform4fv", "glProgramUniform1dv", "glProgramUniform2dv", "glProgramUniform3dv", "glProgramUniform4dv", 
            "glProgramUniformMatrix2fv", "glProgramUniformMatrix3fv", "glProgramUniformMatrix4fv", "glProgramUniformMatrix2dv", "glProgramUniformMatrix3dv", 
            "glProgramUniformMatrix4dv", "glProgramUniformMatrix2x3fv", "glProgramUniformMatrix3x2fv", "glProgramUniformMatrix2x4fv", 
            "glProgramUniformMatrix4x2fv", "glProgramUniformMatrix3x4fv", "glProgramUniformMatrix4x3fv", "glProgramUniformMatrix2x3dv", 
            "glProgramUniformMatrix3x2dv", "glProgramUniformMatrix2x4dv", "glProgramUniformMatrix4x2dv", "glProgramUniformMatrix3x4dv", 
            "glProgramUniformMatrix4x3dv", "glValidateProgramPipeline", "glGetProgramPipelineInfoLog"
        )) || reportMissing("GL", "GL_ARB_separate_shader_objects");
    }

    private static boolean check_ARB_shader_atomic_counters(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_shader_atomic_counters")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            858
        },
            "glGetActiveAtomicCounterBufferiv"
        )) || reportMissing("GL", "GL_ARB_shader_atomic_counters");
    }

    private static boolean check_ARB_shader_image_load_store(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_shader_image_load_store")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            867, 868
        },
            "glBindImageTexture", "glMemoryBarrier"
        )) || reportMissing("GL", "GL_ARB_shader_image_load_store");
    }

    private static boolean check_ARB_shader_objects(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_shader_objects")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1350, 1351, 1352, 1353, 1354, 1355, 1356, 1357, 1358, 1359, 1360, 1361, 1362, 1363, 1364, 1365, 1366, 1367, 1368, 1369, 1370, 1371, 1372, 1373, 
            1374, 1375, 1376, 1377, 1378, 1379, 1380, 1381, 1382, 1383, 1384, 1385, 1386, 1387, 1388
        },
            "glDeleteObjectARB", "glGetHandleARB", "glDetachObjectARB", "glCreateShaderObjectARB", "glShaderSourceARB", "glCompileShaderARB", 
            "glCreateProgramObjectARB", "glAttachObjectARB", "glLinkProgramARB", "glUseProgramObjectARB", "glValidateProgramARB", "glUniform1fARB", 
            "glUniform2fARB", "glUniform3fARB", "glUniform4fARB", "glUniform1iARB", "glUniform2iARB", "glUniform3iARB", "glUniform4iARB", "glUniform1fvARB", 
            "glUniform2fvARB", "glUniform3fvARB", "glUniform4fvARB", "glUniform1ivARB", "glUniform2ivARB", "glUniform3ivARB", "glUniform4ivARB", 
            "glUniformMatrix2fvARB", "glUniformMatrix3fvARB", "glUniformMatrix4fvARB", "glGetObjectParameterfvARB", "glGetObjectParameterivARB", 
            "glGetInfoLogARB", "glGetAttachedObjectsARB", "glGetUniformLocationARB", "glGetActiveUniformARB", "glGetUniformfvARB", "glGetUniformivARB", 
            "glGetShaderSourceARB"
        )) || reportMissing("GL", "GL_ARB_shader_objects");
    }

    private static boolean check_ARB_shader_storage_buffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_shader_storage_buffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            902
        },
            "glShaderStorageBlockBinding"
        )) || reportMissing("GL", "GL_ARB_shader_storage_buffer_object");
    }

    private static boolean check_ARB_shader_subroutine(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_shader_subroutine")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            749, 750, 751, 752, 753, 754, 755, 756
        },
            "glGetSubroutineUniformLocation", "glGetSubroutineIndex", "glGetActiveSubroutineUniformiv", "glGetActiveSubroutineUniformName", 
            "glGetActiveSubroutineName", "glUniformSubroutinesuiv", "glGetUniformSubroutineuiv", "glGetProgramStageiv"
        )) || reportMissing("GL", "GL_ARB_shader_subroutine");
    }

    private static boolean check_ARB_shading_language_include(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_shading_language_include")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1389, 1390, 1391, 1392, 1393, 1394
        },
            "glNamedStringARB", "glDeleteNamedStringARB", "glCompileShaderIncludeARB", "glIsNamedStringARB", "glGetNamedStringARB", "glGetNamedStringivARB"
        )) || reportMissing("GL", "GL_ARB_shading_language_include");
    }

    private static boolean check_ARB_sparse_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_sparse_buffer")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("GL_ARB_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1395
        },
            "glBufferPageCommitmentARB"
        )) || reportMissing("GL", "GL_ARB_sparse_buffer");
    }

    private static boolean check_ARB_sparse_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_sparse_texture")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1398, flag0 + 1399
        },
            "glTexPageCommitmentARB", "glTexturePageCommitmentEXT"
        )) || reportMissing("GL", "GL_ARB_sparse_texture");
    }

    private static boolean check_ARB_sync(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_sync")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            658, 659, 660, 661, 662, 663, 665
        },
            "glFenceSync", "glIsSync", "glDeleteSync", "glClientWaitSync", "glWaitSync", "glGetInteger64v", "glGetSynciv"
        )) || reportMissing("GL", "GL_ARB_sync");
    }

    private static boolean check_ARB_tessellation_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_tessellation_shader")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            757, 758
        },
            "glPatchParameteri", "glPatchParameterfv"
        )) || reportMissing("GL", "GL_ARB_tessellation_shader");
    }

    private static boolean check_ARB_texture_barrier(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_barrier")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1023
        },
            "glTextureBarrier"
        )) || reportMissing("GL", "GL_ARB_texture_barrier");
    }

    private static boolean check_ARB_texture_buffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_buffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1400
        },
            "glTexBufferARB"
        )) || reportMissing("GL", "GL_ARB_texture_buffer_object");
    }

    private static boolean check_ARB_texture_buffer_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_buffer_range")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            903, flag0 + 1401
        },
            "glTexBufferRange", "glTextureBufferRangeEXT"
        )) || reportMissing("GL", "GL_ARB_texture_buffer_range");
    }

    private static boolean check_ARB_texture_compression(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_compression")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1402, 1403, 1404, 1405, 1406, 1407, 1408
        },
            "glCompressedTexImage3DARB", "glCompressedTexImage2DARB", "glCompressedTexImage1DARB", "glCompressedTexSubImage3DARB", 
            "glCompressedTexSubImage2DARB", "glCompressedTexSubImage1DARB", "glGetCompressedTexImageARB"
        )) || reportMissing("GL", "GL_ARB_texture_compression");
    }

    private static boolean check_ARB_texture_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_multisample")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            653, 654, 655, 656
        },
            "glTexImage2DMultisample", "glTexImage3DMultisample", "glGetMultisamplefv", "glSampleMaski"
        )) || reportMissing("GL", "GL_ARB_texture_multisample");
    }

    private static boolean check_ARB_texture_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_storage")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            859, 860, 861, flag0 + 1409, flag0 + 1410, flag0 + 1411
        },
            "glTexStorage1D", "glTexStorage2D", "glTexStorage3D", "glTextureStorage1DEXT", "glTextureStorage2DEXT", "glTextureStorage3DEXT"
        )) || reportMissing("GL", "GL_ARB_texture_storage");
    }

    private static boolean check_ARB_texture_storage_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_storage_multisample")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            904, 905, flag0 + 1412, flag0 + 1413
        },
            "glTexStorage2DMultisample", "glTexStorage3DMultisample", "glTextureStorage2DMultisampleEXT", "glTextureStorage3DMultisampleEXT"
        )) || reportMissing("GL", "GL_ARB_texture_storage_multisample");
    }

    private static boolean check_ARB_texture_view(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_texture_view")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            906
        },
            "glTextureView"
        )) || reportMissing("GL", "GL_ARB_texture_view");
    }

    private static boolean check_ARB_timer_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_timer_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            682, 683, 684
        },
            "glQueryCounter", "glGetQueryObjecti64v", "glGetQueryObjectui64v"
        )) || reportMissing("GL", "GL_ARB_timer_query");
    }

    private static boolean check_ARB_transform_feedback2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_transform_feedback2")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            759, 760, 761, 762, 763, 764, 765
        },
            "glBindTransformFeedback", "glDeleteTransformFeedbacks", "glGenTransformFeedbacks", "glIsTransformFeedback", "glPauseTransformFeedback", 
            "glResumeTransformFeedback", "glDrawTransformFeedback"
        )) || reportMissing("GL", "GL_ARB_transform_feedback2");
    }

    private static boolean check_ARB_transform_feedback3(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_transform_feedback3")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            766, 767, 768, 769
        },
            "glDrawTransformFeedbackStream", "glBeginQueryIndexed", "glEndQueryIndexed", "glGetQueryIndexediv"
        )) || reportMissing("GL", "GL_ARB_transform_feedback3");
    }

    private static boolean check_ARB_transform_feedback_instanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_transform_feedback_instanced")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            862, 863
        },
            "glDrawTransformFeedbackInstanced", "glDrawTransformFeedbackStreamInstanced"
        )) || reportMissing("GL", "GL_ARB_transform_feedback_instanced");
    }

    private static boolean check_ARB_transpose_matrix(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_transpose_matrix")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1414, 1415, 1416, 1417
        },
            "glLoadTransposeMatrixfARB", "glLoadTransposeMatrixdARB", "glMultTransposeMatrixfARB", "glMultTransposeMatrixdARB"
        )) || reportMissing("GL", "GL_ARB_transpose_matrix");
    }

    private static boolean check_ARB_uniform_buffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_uniform_buffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            640, 641, 642, 643, 644, 645, 625, 626, 621, 646
        },
            "glGetUniformIndices", "glGetActiveUniformsiv", "glGetActiveUniformName", "glGetUniformBlockIndex", "glGetActiveUniformBlockiv", 
            "glGetActiveUniformBlockName", "glBindBufferRange", "glBindBufferBase", "glGetIntegeri_v", "glUniformBlockBinding"
        )) || reportMissing("GL", "GL_ARB_uniform_buffer_object");
    }

    private static boolean check_ARB_vertex_array_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_array_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            631, 632, 633, 634
        },
            "glBindVertexArray", "glDeleteVertexArrays", "glGenVertexArrays", "glIsVertexArray"
        )) || reportMissing("GL", "GL_ARB_vertex_array_object");
    }

    private static boolean check_ARB_vertex_attrib_64bit(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_attrib_64bit")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            838, 839, 840, 841, 842, 843, 844, 845, 846, 847, flag0 + 1418
        },
            "glVertexAttribL1d", "glVertexAttribL2d", "glVertexAttribL3d", "glVertexAttribL4d", "glVertexAttribL1dv", "glVertexAttribL2dv", 
            "glVertexAttribL3dv", "glVertexAttribL4dv", "glVertexAttribLPointer", "glGetVertexAttribLdv", "glVertexArrayVertexAttribLOffsetEXT"
        )) || reportMissing("GL", "GL_ARB_vertex_attrib_64bit");
    }

    private static boolean check_ARB_vertex_attrib_binding(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_attrib_binding")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            907, 908, 909, 910, 911, 912, flag0 + 1419, flag0 + 1420, flag0 + 1421, flag0 + 1422, flag0 + 1423, flag0 + 1424
        },
            "glBindVertexBuffer", "glVertexAttribFormat", "glVertexAttribIFormat", "glVertexAttribLFormat", "glVertexAttribBinding", "glVertexBindingDivisor", 
            "glVertexArrayBindVertexBufferEXT", "glVertexArrayVertexAttribFormatEXT", "glVertexArrayVertexAttribIFormatEXT", 
            "glVertexArrayVertexAttribLFormatEXT", "glVertexArrayVertexAttribBindingEXT", "glVertexArrayVertexBindingDivisorEXT"
        )) || reportMissing("GL", "GL_ARB_vertex_attrib_binding");
    }

    private static boolean check_ARB_vertex_blend(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_blend")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1425, 1426, 1427, 1428, 1429, 1430, 1431, 1432, 1433, 1434
        },
            "glWeightfvARB", "glWeightbvARB", "glWeightubvARB", "glWeightsvARB", "glWeightusvARB", "glWeightivARB", "glWeightuivARB", "glWeightdvARB", 
            "glWeightPointerARB", "glVertexBlendARB"
        )) || reportMissing("GL", "GL_ARB_vertex_blend");
    }

    private static boolean check_ARB_vertex_buffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_buffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1435, 1436, 1437, 1438, 1439, 1440, 1441, 1442, 1443, 1444, 1445
        },
            "glBindBufferARB", "glDeleteBuffersARB", "glGenBuffersARB", "glIsBufferARB", "glBufferDataARB", "glBufferSubDataARB", "glGetBufferSubDataARB", 
            "glMapBufferARB", "glUnmapBufferARB", "glGetBufferParameterivARB", "glGetBufferPointervARB"
        )) || reportMissing("GL", "GL_ARB_vertex_buffer_object");
    }

    private static boolean check_ARB_vertex_program(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_program")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1446, 1447, 1448, 1449, 1450, 1451, 1452, 1453, 1454, 1455, 1456, 1457, 1458, 1459, 1460, 1461, 1462, 1463, 1464, 1465, 1466, 1467, 1468, 1469, 
            1470, 1471, 1472, 1473, 1474, 1475, 1476, 1477, 1478, 1479, 1480, 1481, 1482, 1483, 1484, 1485, 1486, 1487, 1488, 1489, 1490, 1491, 1492, 1493, 
            1494, 1495, 1496, 1497, 1498, 1499, 1500, 1501, 1502, 1503, 1504, 1505, 1506, 1507
        },
            "glVertexAttrib1sARB", "glVertexAttrib1fARB", "glVertexAttrib1dARB", "glVertexAttrib2sARB", "glVertexAttrib2fARB", "glVertexAttrib2dARB", 
            "glVertexAttrib3sARB", "glVertexAttrib3fARB", "glVertexAttrib3dARB", "glVertexAttrib4sARB", "glVertexAttrib4fARB", "glVertexAttrib4dARB", 
            "glVertexAttrib4NubARB", "glVertexAttrib1svARB", "glVertexAttrib1fvARB", "glVertexAttrib1dvARB", "glVertexAttrib2svARB", "glVertexAttrib2fvARB", 
            "glVertexAttrib2dvARB", "glVertexAttrib3svARB", "glVertexAttrib3fvARB", "glVertexAttrib3dvARB", "glVertexAttrib4fvARB", "glVertexAttrib4bvARB", 
            "glVertexAttrib4svARB", "glVertexAttrib4ivARB", "glVertexAttrib4ubvARB", "glVertexAttrib4usvARB", "glVertexAttrib4uivARB", "glVertexAttrib4dvARB", 
            "glVertexAttrib4NbvARB", "glVertexAttrib4NsvARB", "glVertexAttrib4NivARB", "glVertexAttrib4NubvARB", "glVertexAttrib4NusvARB", 
            "glVertexAttrib4NuivARB", "glVertexAttribPointerARB", "glEnableVertexAttribArrayARB", "glDisableVertexAttribArrayARB", "glProgramStringARB", 
            "glBindProgramARB", "glDeleteProgramsARB", "glGenProgramsARB", "glProgramEnvParameter4dARB", "glProgramEnvParameter4dvARB", 
            "glProgramEnvParameter4fARB", "glProgramEnvParameter4fvARB", "glProgramLocalParameter4dARB", "glProgramLocalParameter4dvARB", 
            "glProgramLocalParameter4fARB", "glProgramLocalParameter4fvARB", "glGetProgramEnvParameterfvARB", "glGetProgramEnvParameterdvARB", 
            "glGetProgramLocalParameterfvARB", "glGetProgramLocalParameterdvARB", "glGetProgramivARB", "glGetProgramStringARB", "glGetVertexAttribfvARB", 
            "glGetVertexAttribdvARB", "glGetVertexAttribivARB", "glGetVertexAttribPointervARB", "glIsProgramARB"
        )) || reportMissing("GL", "GL_ARB_vertex_program");
    }

    private static boolean check_ARB_vertex_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_vertex_shader")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1447, 1446, 1448, 1450, 1449, 1451, 1453, 1452, 1454, 1456, 1455, 1457, 1458, 1460, 1459, 1461, 1463, 1462, 1464, 1466, 1465, 1467, 1468, 1470, 
            1475, 1471, 1469, 1472, 1473, 1474, 1476, 1477, 1478, 1479, 1480, 1481, 1482, 1483, 1484, 1508, 1509, 1510, 1505, 1503, 1504, 1506
        },
            "glVertexAttrib1fARB", "glVertexAttrib1sARB", "glVertexAttrib1dARB", "glVertexAttrib2fARB", "glVertexAttrib2sARB", "glVertexAttrib2dARB", 
            "glVertexAttrib3fARB", "glVertexAttrib3sARB", "glVertexAttrib3dARB", "glVertexAttrib4fARB", "glVertexAttrib4sARB", "glVertexAttrib4dARB", 
            "glVertexAttrib4NubARB", "glVertexAttrib1fvARB", "glVertexAttrib1svARB", "glVertexAttrib1dvARB", "glVertexAttrib2fvARB", "glVertexAttrib2svARB", 
            "glVertexAttrib2dvARB", "glVertexAttrib3fvARB", "glVertexAttrib3svARB", "glVertexAttrib3dvARB", "glVertexAttrib4fvARB", "glVertexAttrib4svARB", 
            "glVertexAttrib4dvARB", "glVertexAttrib4ivARB", "glVertexAttrib4bvARB", "glVertexAttrib4ubvARB", "glVertexAttrib4usvARB", "glVertexAttrib4uivARB", 
            "glVertexAttrib4NbvARB", "glVertexAttrib4NsvARB", "glVertexAttrib4NivARB", "glVertexAttrib4NubvARB", "glVertexAttrib4NusvARB", 
            "glVertexAttrib4NuivARB", "glVertexAttribPointerARB", "glEnableVertexAttribArrayARB", "glDisableVertexAttribArrayARB", "glBindAttribLocationARB", 
            "glGetActiveAttribARB", "glGetAttribLocationARB", "glGetVertexAttribivARB", "glGetVertexAttribfvARB", "glGetVertexAttribdvARB", 
            "glGetVertexAttribPointervARB"
        )) || reportMissing("GL", "GL_ARB_vertex_shader");
    }

    private static boolean check_ARB_vertex_type_2_10_10_10_rev(FunctionProvider provider, PointerBuffer caps, Set<String> ext, boolean fc) {
        if (!ext.contains("GL_ARB_vertex_type_2_10_10_10_rev")) {
            return false;
        }

        return ((fc || checkFunctions(provider, caps, new int[] {
            686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 
            715
        },
            "glVertexP2ui", "glVertexP3ui", "glVertexP4ui", "glVertexP2uiv", "glVertexP3uiv", "glVertexP4uiv", "glTexCoordP1ui", "glTexCoordP2ui", 
            "glTexCoordP3ui", "glTexCoordP4ui", "glTexCoordP1uiv", "glTexCoordP2uiv", "glTexCoordP3uiv", "glTexCoordP4uiv", "glMultiTexCoordP1ui", 
            "glMultiTexCoordP2ui", "glMultiTexCoordP3ui", "glMultiTexCoordP4ui", "glMultiTexCoordP1uiv", "glMultiTexCoordP2uiv", "glMultiTexCoordP3uiv", 
            "glMultiTexCoordP4uiv", "glNormalP3ui", "glNormalP3uiv", "glColorP3ui", "glColorP4ui", "glColorP3uiv", "glColorP4uiv", "glSecondaryColorP3ui", 
            "glSecondaryColorP3uiv"
        )) && checkFunctions(provider, caps, new int[] {
            716, 717, 718, 719, 720, 721, 722, 723
        },
            "glVertexAttribP1ui", "glVertexAttribP2ui", "glVertexAttribP3ui", "glVertexAttribP4ui", "glVertexAttribP1uiv", "glVertexAttribP2uiv", 
            "glVertexAttribP3uiv", "glVertexAttribP4uiv"
        )) || reportMissing("GL", "GL_ARB_vertex_type_2_10_10_10_rev");
    }

    private static boolean check_ARB_viewport_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_viewport_array")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            848, 849, 850, 851, 852, 853, 854, 855, 856, 857
        },
            "glViewportArrayv", "glViewportIndexedf", "glViewportIndexedfv", "glScissorArrayv", "glScissorIndexed", "glScissorIndexedv", "glDepthRangeArrayv", 
            "glDepthRangeIndexed", "glGetFloati_v", "glGetDoublei_v"
        )) || reportMissing("GL", "GL_ARB_viewport_array");
    }

    private static boolean check_ARB_window_pos(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARB_window_pos")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1511, 1512, 1513, 1514, 1515, 1516, 1517, 1518, 1519, 1520, 1521, 1522, 1523, 1524, 1525, 1526
        },
            "glWindowPos2iARB", "glWindowPos2sARB", "glWindowPos2fARB", "glWindowPos2dARB", "glWindowPos2ivARB", "glWindowPos2svARB", "glWindowPos2fvARB", 
            "glWindowPos2dvARB", "glWindowPos3iARB", "glWindowPos3sARB", "glWindowPos3fARB", "glWindowPos3dARB", "glWindowPos3ivARB", "glWindowPos3svARB", 
            "glWindowPos3fvARB", "glWindowPos3dvARB"
        )) || reportMissing("GL", "GL_ARB_window_pos");
    }

    private static boolean check_EXT_bindable_uniform(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_bindable_uniform")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1527, 1528, 1529
        },
            "glUniformBufferEXT", "glGetUniformBufferSizeEXT", "glGetUniformOffsetEXT"
        )) || reportMissing("GL", "GL_EXT_bindable_uniform");
    }

    private static boolean check_EXT_blend_color(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_blend_color")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1530
        },
            "glBlendColorEXT"
        )) || reportMissing("GL", "GL_EXT_blend_color");
    }

    private static boolean check_EXT_blend_equation_separate(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_blend_equation_separate")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1531
        },
            "glBlendEquationSeparateEXT"
        )) || reportMissing("GL", "GL_EXT_blend_equation_separate");
    }

    private static boolean check_EXT_blend_func_separate(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_blend_func_separate")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1532
        },
            "glBlendFuncSeparateEXT"
        )) || reportMissing("GL", "GL_EXT_blend_func_separate");
    }

    private static boolean check_EXT_blend_minmax(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_blend_minmax")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1533
        },
            "glBlendEquationEXT"
        )) || reportMissing("GL", "GL_EXT_blend_minmax");
    }

    private static boolean check_EXT_compiled_vertex_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_compiled_vertex_array")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1534, 1535
        },
            "glLockArraysEXT", "glUnlockArraysEXT"
        )) || reportMissing("GL", "GL_EXT_compiled_vertex_array");
    }

    private static boolean check_EXT_debug_label(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_debug_label")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1536, 1537
        },
            "glLabelObjectEXT", "glGetObjectLabelEXT"
        )) || reportMissing("GL", "GL_EXT_debug_label");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_debug_marker")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1538, 1539, 1540
        },
            "glInsertEventMarkerEXT", "glPushGroupMarkerEXT", "glPopGroupMarkerEXT"
        )) || reportMissing("GL", "GL_EXT_debug_marker");
    }

    private static boolean check_EXT_depth_bounds_test(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_depth_bounds_test")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1541
        },
            "glDepthBoundsEXT"
        )) || reportMissing("GL", "GL_EXT_depth_bounds_test");
    }

    private static boolean check_EXT_direct_state_access(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_direct_state_access")) {
            return false;
        }

        int flag0 = ext.contains("OpenGL12") ? 0 : Integer.MIN_VALUE;
        int flag3 = ext.contains("OpenGL13") ? 0 : Integer.MIN_VALUE;
        int flag42 = ext.contains("OpenGL30") ? 0 : Integer.MIN_VALUE;
        int flag55 = ext.contains("GL_ARB_vertex_program") ? 0 : Integer.MIN_VALUE;
        int flag82 = ext.contains("OpenGL15") ? 0 : Integer.MIN_VALUE;
        int flag88 = ext.contains("OpenGL20") ? 0 : Integer.MIN_VALUE;
        int flag107 = ext.contains("OpenGL21") ? 0 : Integer.MIN_VALUE;
        int flag113 = ext.contains("GL_EXT_texture_buffer_object") ? 0 : Integer.MIN_VALUE;
        int flag115 = ext.contains("GL_EXT_texture_integer") ? 0 : Integer.MIN_VALUE;
        int flag123 = ext.contains("GL_EXT_gpu_shader4") ? 0 : Integer.MIN_VALUE;
        int flag131 = ext.contains("GL_EXT_gpu_program_parameters") ? 0 : Integer.MIN_VALUE;
        int flag132 = ext.contains("GL_NV_gpu_program4") ? 0 : Integer.MIN_VALUE;
        int flag143 = ext.contains("GL_NV_framebuffer_multisample_coverage") ? 0 : Integer.MIN_VALUE;
        int flag157 = ext.contains("GL_EXT_geometry_shader4") || ext.contains("GL_NV_gpu_program4") ? 0 : Integer.MIN_VALUE;
        int flag160 = ext.contains("GL_NV_explicit_multisample") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1542, 1543, 1544, 1545, 1546, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1556, 1557, 1558, 1559, 1560, 1561, 1562, 1563, 1564, 1565, 
            1566, 1567, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, flag0 + 1576, flag0 + 1577, flag0 + 1578, flag3 + 1579, flag3 + 1580, flag3 + 1581, 
            flag3 + 1582, flag3 + 1583, flag3 + 1584, flag3 + 1585, flag3 + 1586, flag3 + 1587, flag3 + 1588, flag3 + 1589, flag3 + 1590, flag3 + 1591, 
            flag3 + 1592, flag3 + 1593, flag3 + 1594, flag3 + 1595, flag3 + 1596, flag3 + 1597, flag3 + 1598, flag3 + 1599, flag3 + 1600, flag3 + 1601, 
            flag3 + 1602, flag3 + 1603, flag3 + 1604, flag3 + 1605, flag3 + 1606, flag3 + 1607, flag3 + 1608, flag3 + 1609, flag3 + 1610, flag3 + 1611, 
            flag3 + 1612, flag3 + 1613, flag3 + 1614, flag3 + 1615, flag3 + 1616, flag3 + 1617, flag3 + 1620, flag3 + 1621, flag3 + 1622, flag3 + 1626, 
            flag3 + 1627, flag3 + 1628, flag3 + 1629, flag3 + 1630, flag55 + 1631, flag55 + 1632, flag55 + 1633, flag55 + 1634, flag55 + 1635, flag55 + 1636, 
            flag55 + 1637, flag55 + 1638, flag55 + 1639, flag3 + 1640, flag3 + 1641, flag3 + 1642, flag3 + 1643, flag3 + 1644, flag3 + 1645, flag3 + 1646, 
            flag3 + 1647, flag3 + 1648, flag3 + 1649, flag3 + 1650, flag3 + 1651, flag3 + 1652, flag3 + 1653, flag3 + 1654, flag3 + 1655, flag3 + 1656, 
            flag3 + 1657, flag82 + 1658, flag82 + 1659, flag82 + 1660, flag82 + 1661, flag82 + 1662, flag82 + 1663, flag88 + 1664, flag88 + 1665, flag88 + 1666, 
            flag88 + 1667, flag88 + 1668, flag88 + 1669, flag88 + 1670, flag88 + 1671, flag88 + 1672, flag88 + 1673, flag88 + 1674, flag88 + 1675, 
            flag88 + 1676, flag88 + 1677, flag88 + 1678, flag88 + 1679, flag88 + 1680, flag88 + 1681, flag88 + 1682, flag107 + 1683, flag107 + 1684, 
            flag107 + 1685, flag107 + 1686, flag107 + 1687, flag107 + 1688, flag113 + 1689, flag113 + 1690, flag115 + 1691, flag115 + 1692, flag115 + 1693, 
            flag115 + 1694, flag115 + 1695, flag115 + 1696, flag115 + 1697, flag115 + 1698, flag123 + 1699, flag123 + 1700, flag123 + 1701, flag123 + 1702, 
            flag123 + 1703, flag123 + 1704, flag123 + 1705, flag123 + 1706, flag131 + 1707, flag132 + 1708, flag132 + 1709, flag132 + 1710, flag132 + 1711, 
            flag132 + 1712, flag132 + 1713, flag132 + 1714, flag132 + 1715, flag42 + 1716, flag42 + 1717, flag42 + 1718, flag143 + 1719, flag42 + 1720, 
            flag42 + 1721, flag42 + 1722, flag42 + 1723, flag42 + 1724, flag42 + 1725, flag42 + 1726, flag42 + 1727, flag42 + 1728, flag42 + 1729, 
            flag42 + 1730, flag42 + 1731, flag42 + 1732, flag157 + 1733, flag157 + 1734, flag157 + 1735, flag160 + 1736, flag160 + 1737, flag42 + 1738, 
            flag42 + 1739, flag42 + 1740, flag42 + 1741, flag42 + 1742, flag42 + 1743, flag42 + 1744, flag42 + 1745, flag42 + 1746, flag42 + 1747, 
            flag42 + 1748, flag42 + 1749, flag42 + 1750, flag42 + 1751, flag42 + 1752, flag42 + 1753, flag42 + 1754, flag42 + 1755, flag42 + 1756, 
            flag42 + 1757, flag42 + 1758
        },
            "glClientAttribDefaultEXT", "glPushClientAttribDefaultEXT", "glMatrixLoadfEXT", "glMatrixLoaddEXT", "glMatrixMultfEXT", "glMatrixMultdEXT", 
            "glMatrixLoadIdentityEXT", "glMatrixRotatefEXT", "glMatrixRotatedEXT", "glMatrixScalefEXT", "glMatrixScaledEXT", "glMatrixTranslatefEXT", 
            "glMatrixTranslatedEXT", "glMatrixOrthoEXT", "glMatrixFrustumEXT", "glMatrixPushEXT", "glMatrixPopEXT", "glTextureParameteriEXT", 
            "glTextureParameterivEXT", "glTextureParameterfEXT", "glTextureParameterfvEXT", "glTextureImage1DEXT", "glTextureImage2DEXT", 
            "glTextureSubImage1DEXT", "glTextureSubImage2DEXT", "glCopyTextureImage1DEXT", "glCopyTextureImage2DEXT", "glCopyTextureSubImage1DEXT", 
            "glCopyTextureSubImage2DEXT", "glGetTextureImageEXT", "glGetTextureParameterfvEXT", "glGetTextureParameterivEXT", "glGetTextureLevelParameterfvEXT", 
            "glGetTextureLevelParameterivEXT", "glTextureImage3DEXT", "glTextureSubImage3DEXT", "glCopyTextureSubImage3DEXT", "glBindMultiTextureEXT", 
            "glMultiTexCoordPointerEXT", "glMultiTexEnvfEXT", "glMultiTexEnvfvEXT", "glMultiTexEnviEXT", "glMultiTexEnvivEXT", "glMultiTexGendEXT", 
            "glMultiTexGendvEXT", "glMultiTexGenfEXT", "glMultiTexGenfvEXT", "glMultiTexGeniEXT", "glMultiTexGenivEXT", "glGetMultiTexEnvfvEXT", 
            "glGetMultiTexEnvivEXT", "glGetMultiTexGendvEXT", "glGetMultiTexGenfvEXT", "glGetMultiTexGenivEXT", "glMultiTexParameteriEXT", 
            "glMultiTexParameterivEXT", "glMultiTexParameterfEXT", "glMultiTexParameterfvEXT", "glMultiTexImage1DEXT", "glMultiTexImage2DEXT", 
            "glMultiTexSubImage1DEXT", "glMultiTexSubImage2DEXT", "glCopyMultiTexImage1DEXT", "glCopyMultiTexImage2DEXT", "glCopyMultiTexSubImage1DEXT", 
            "glCopyMultiTexSubImage2DEXT", "glGetMultiTexImageEXT", "glGetMultiTexParameterfvEXT", "glGetMultiTexParameterivEXT", 
            "glGetMultiTexLevelParameterfvEXT", "glGetMultiTexLevelParameterivEXT", "glMultiTexImage3DEXT", "glMultiTexSubImage3DEXT", 
            "glCopyMultiTexSubImage3DEXT", "glEnableClientStateIndexedEXT", "glDisableClientStateIndexedEXT", "glGetFloatIndexedvEXT", "glGetDoubleIndexedvEXT", 
            "glGetPointerIndexedvEXT", "glEnableIndexedEXT", "glDisableIndexedEXT", "glIsEnabledIndexedEXT", "glGetIntegerIndexedvEXT", 
            "glGetBooleanIndexedvEXT", "glNamedProgramStringEXT", "glNamedProgramLocalParameter4dEXT", "glNamedProgramLocalParameter4dvEXT", 
            "glNamedProgramLocalParameter4fEXT", "glNamedProgramLocalParameter4fvEXT", "glGetNamedProgramLocalParameterdvEXT", 
            "glGetNamedProgramLocalParameterfvEXT", "glGetNamedProgramivEXT", "glGetNamedProgramStringEXT", "glCompressedTextureImage3DEXT", 
            "glCompressedTextureImage2DEXT", "glCompressedTextureImage1DEXT", "glCompressedTextureSubImage3DEXT", "glCompressedTextureSubImage2DEXT", 
            "glCompressedTextureSubImage1DEXT", "glGetCompressedTextureImageEXT", "glCompressedMultiTexImage3DEXT", "glCompressedMultiTexImage2DEXT", 
            "glCompressedMultiTexImage1DEXT", "glCompressedMultiTexSubImage3DEXT", "glCompressedMultiTexSubImage2DEXT", "glCompressedMultiTexSubImage1DEXT", 
            "glGetCompressedMultiTexImageEXT", "glMatrixLoadTransposefEXT", "glMatrixLoadTransposedEXT", "glMatrixMultTransposefEXT", 
            "glMatrixMultTransposedEXT", "glNamedBufferDataEXT", "glNamedBufferSubDataEXT", "glMapNamedBufferEXT", "glUnmapNamedBufferEXT", 
            "glGetNamedBufferParameterivEXT", "glGetNamedBufferSubDataEXT", "glProgramUniform1fEXT", "glProgramUniform2fEXT", "glProgramUniform3fEXT", 
            "glProgramUniform4fEXT", "glProgramUniform1iEXT", "glProgramUniform2iEXT", "glProgramUniform3iEXT", "glProgramUniform4iEXT", 
            "glProgramUniform1fvEXT", "glProgramUniform2fvEXT", "glProgramUniform3fvEXT", "glProgramUniform4fvEXT", "glProgramUniform1ivEXT", 
            "glProgramUniform2ivEXT", "glProgramUniform3ivEXT", "glProgramUniform4ivEXT", "glProgramUniformMatrix2fvEXT", "glProgramUniformMatrix3fvEXT", 
            "glProgramUniformMatrix4fvEXT", "glProgramUniformMatrix2x3fvEXT", "glProgramUniformMatrix3x2fvEXT", "glProgramUniformMatrix2x4fvEXT", 
            "glProgramUniformMatrix4x2fvEXT", "glProgramUniformMatrix3x4fvEXT", "glProgramUniformMatrix4x3fvEXT", "glTextureBufferEXT", "glMultiTexBufferEXT", 
            "glTextureParameterIivEXT", "glTextureParameterIuivEXT", "glGetTextureParameterIivEXT", "glGetTextureParameterIuivEXT", "glMultiTexParameterIivEXT", 
            "glMultiTexParameterIuivEXT", "glGetMultiTexParameterIivEXT", "glGetMultiTexParameterIuivEXT", "glProgramUniform1uiEXT", "glProgramUniform2uiEXT", 
            "glProgramUniform3uiEXT", "glProgramUniform4uiEXT", "glProgramUniform1uivEXT", "glProgramUniform2uivEXT", "glProgramUniform3uivEXT", 
            "glProgramUniform4uivEXT", "glNamedProgramLocalParameters4fvEXT", "glNamedProgramLocalParameterI4iEXT", "glNamedProgramLocalParameterI4ivEXT", 
            "glNamedProgramLocalParametersI4ivEXT", "glNamedProgramLocalParameterI4uiEXT", "glNamedProgramLocalParameterI4uivEXT", 
            "glNamedProgramLocalParametersI4uivEXT", "glGetNamedProgramLocalParameterIivEXT", "glGetNamedProgramLocalParameterIuivEXT", 
            "glNamedRenderbufferStorageEXT", "glGetNamedRenderbufferParameterivEXT", "glNamedRenderbufferStorageMultisampleEXT", 
            "glNamedRenderbufferStorageMultisampleCoverageEXT", "glCheckNamedFramebufferStatusEXT", "glNamedFramebufferTexture1DEXT", 
            "glNamedFramebufferTexture2DEXT", "glNamedFramebufferTexture3DEXT", "glNamedFramebufferRenderbufferEXT", 
            "glGetNamedFramebufferAttachmentParameterivEXT", "glGenerateTextureMipmapEXT", "glGenerateMultiTexMipmapEXT", "glFramebufferDrawBufferEXT", 
            "glFramebufferDrawBuffersEXT", "glFramebufferReadBufferEXT", "glGetFramebufferParameterivEXT", "glNamedCopyBufferSubDataEXT", 
            "glNamedFramebufferTextureEXT", "glNamedFramebufferTextureLayerEXT", "glNamedFramebufferTextureFaceEXT", "glTextureRenderbufferEXT", 
            "glMultiTexRenderbufferEXT", "glVertexArrayVertexOffsetEXT", "glVertexArrayColorOffsetEXT", "glVertexArrayEdgeFlagOffsetEXT", 
            "glVertexArrayIndexOffsetEXT", "glVertexArrayNormalOffsetEXT", "glVertexArrayTexCoordOffsetEXT", "glVertexArrayMultiTexCoordOffsetEXT", 
            "glVertexArrayFogCoordOffsetEXT", "glVertexArraySecondaryColorOffsetEXT", "glVertexArrayVertexAttribOffsetEXT", 
            "glVertexArrayVertexAttribIOffsetEXT", "glEnableVertexArrayEXT", "glDisableVertexArrayEXT", "glEnableVertexArrayAttribEXT", 
            "glDisableVertexArrayAttribEXT", "glGetVertexArrayIntegervEXT", "glGetVertexArrayPointervEXT", "glGetVertexArrayIntegeri_vEXT", 
            "glGetVertexArrayPointeri_vEXT", "glMapNamedBufferRangeEXT", "glFlushMappedNamedBufferRangeEXT"
        )) || reportMissing("GL", "GL_EXT_direct_state_access");
    }

    private static boolean check_EXT_draw_buffers2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_buffers2")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1759, 1630, 1629, 1626, 1627, 1628
        },
            "glColorMaskIndexedEXT", "glGetBooleanIndexedvEXT", "glGetIntegerIndexedvEXT", "glEnableIndexedEXT", "glDisableIndexedEXT", "glIsEnabledIndexedEXT"
        )) || reportMissing("GL", "GL_EXT_draw_buffers2");
    }

    private static boolean check_EXT_draw_instanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_instanced")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1760, 1761
        },
            "glDrawArraysInstancedEXT", "glDrawElementsInstancedEXT"
        )) || reportMissing("GL", "GL_EXT_draw_instanced");
    }

    private static boolean check_EXT_EGL_image_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_EGL_image_storage")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1762, flag0 + 1763
        },
            "glEGLImageTargetTexStorageEXT", "glEGLImageTargetTextureStorageEXT"
        )) || reportMissing("GL", "GL_EXT_EGL_image_storage");
    }

    private static boolean check_EXT_external_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_external_buffer")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1764, flag0 + 1765
        },
            "glBufferStorageExternalEXT", "glNamedBufferStorageExternalEXT"
        )) || reportMissing("GL", "GL_EXT_external_buffer");
    }

    private static boolean check_EXT_fragment_shading_rate(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_fragment_shading_rate")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1766, 1767, 1768, 1769
        },
            "glShadingRateEXT", "glShadingRateCombinerOpsEXT", "glFramebufferShadingRateEXT", "glGetFragmentShadingRatesEXT"
        )) || reportMissing("GL", "GL_EXT_fragment_shading_rate");
    }

    private static boolean check_EXT_framebuffer_blit(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_framebuffer_blit")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1770
        },
            "glBlitFramebufferEXT"
        )) || reportMissing("GL", "GL_EXT_framebuffer_blit");
    }

    private static boolean check_EXT_framebuffer_blit_layers(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_framebuffer_blit_layers")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1771, 1772
        },
            "glBlitFramebufferLayersEXT", "glBlitFramebufferLayerEXT"
        )) || reportMissing("GL", "GL_EXT_framebuffer_blit_layers");
    }

    private static boolean check_EXT_framebuffer_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_framebuffer_multisample")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1773
        },
            "glRenderbufferStorageMultisampleEXT"
        )) || reportMissing("GL", "GL_EXT_framebuffer_multisample");
    }

    private static boolean check_EXT_framebuffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_framebuffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1774, 1775, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 1786, 1787, 1788, 1789, 1790
        },
            "glIsRenderbufferEXT", "glBindRenderbufferEXT", "glDeleteRenderbuffersEXT", "glGenRenderbuffersEXT", "glRenderbufferStorageEXT", 
            "glGetRenderbufferParameterivEXT", "glIsFramebufferEXT", "glBindFramebufferEXT", "glDeleteFramebuffersEXT", "glGenFramebuffersEXT", 
            "glCheckFramebufferStatusEXT", "glFramebufferTexture1DEXT", "glFramebufferTexture2DEXT", "glFramebufferTexture3DEXT", 
            "glFramebufferRenderbufferEXT", "glGetFramebufferAttachmentParameterivEXT", "glGenerateMipmapEXT"
        )) || reportMissing("GL", "GL_EXT_framebuffer_object");
    }

    private static boolean check_EXT_geometry_shader4(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_geometry_shader4")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1791, 1792, 1793, 1794
        },
            "glProgramParameteriEXT", "glFramebufferTextureEXT", "glFramebufferTextureLayerEXT", "glFramebufferTextureFaceEXT"
        )) || reportMissing("GL", "GL_EXT_geometry_shader4");
    }

    private static boolean check_EXT_gpu_program_parameters(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_gpu_program_parameters")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1795, 1796
        },
            "glProgramEnvParameters4fvEXT", "glProgramLocalParameters4fvEXT"
        )) || reportMissing("GL", "GL_EXT_gpu_program_parameters");
    }

    private static boolean check_EXT_gpu_shader4(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_gpu_shader4")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 1806, 1807, 1808, 1809, 1810, 1811, 1812, 1813, 1814, 1815, 1816, 1817, 1818, 1819, 1820, 
            1821, 1822, 1823, 1824, 1825, 1826, 1827, 1828, 1829, 1830
        },
            "glVertexAttribI1iEXT", "glVertexAttribI2iEXT", "glVertexAttribI3iEXT", "glVertexAttribI4iEXT", "glVertexAttribI1uiEXT", "glVertexAttribI2uiEXT", 
            "glVertexAttribI3uiEXT", "glVertexAttribI4uiEXT", "glVertexAttribI1ivEXT", "glVertexAttribI2ivEXT", "glVertexAttribI3ivEXT", 
            "glVertexAttribI4ivEXT", "glVertexAttribI1uivEXT", "glVertexAttribI2uivEXT", "glVertexAttribI3uivEXT", "glVertexAttribI4uivEXT", 
            "glVertexAttribI4bvEXT", "glVertexAttribI4svEXT", "glVertexAttribI4ubvEXT", "glVertexAttribI4usvEXT", "glVertexAttribIPointerEXT", 
            "glGetVertexAttribIivEXT", "glGetVertexAttribIuivEXT", "glGetUniformuivEXT", "glBindFragDataLocationEXT", "glGetFragDataLocationEXT", 
            "glUniform1uiEXT", "glUniform2uiEXT", "glUniform3uiEXT", "glUniform4uiEXT", "glUniform1uivEXT", "glUniform2uivEXT", "glUniform3uivEXT", 
            "glUniform4uivEXT"
        )) || reportMissing("GL", "GL_EXT_gpu_shader4");
    }

    private static boolean check_EXT_memory_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_memory_object")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1831, 1832, 1833, 1834, 1835, 1836, 1837, 1838, 1839, 1840, 1841, 1842, flag0 + 1843, flag0 + 1844, flag0 + 1845, flag0 + 1846, flag0 + 1847, 1848, 
            flag0 + 1849
        },
            "glGetUnsignedBytevEXT", "glGetUnsignedBytei_vEXT", "glDeleteMemoryObjectsEXT", "glIsMemoryObjectEXT", "glCreateMemoryObjectsEXT", 
            "glMemoryObjectParameterivEXT", "glGetMemoryObjectParameterivEXT", "glTexStorageMem2DEXT", "glTexStorageMem2DMultisampleEXT", 
            "glTexStorageMem3DEXT", "glTexStorageMem3DMultisampleEXT", "glBufferStorageMemEXT", "glTextureStorageMem2DEXT", 
            "glTextureStorageMem2DMultisampleEXT", "glTextureStorageMem3DEXT", "glTextureStorageMem3DMultisampleEXT", "glNamedBufferStorageMemEXT", 
            "glTexStorageMem1DEXT", "glTextureStorageMem1DEXT"
        )) || reportMissing("GL", "GL_EXT_memory_object");
    }

    private static boolean check_EXT_memory_object_fd(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_memory_object_fd")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1850
        },
            "glImportMemoryFdEXT"
        )) || reportMissing("GL", "GL_EXT_memory_object_fd");
    }

    private static boolean check_EXT_memory_object_win32(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_memory_object_win32")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1851, 1852
        },
            "glImportMemoryWin32HandleEXT", "glImportMemoryWin32NameEXT"
        )) || reportMissing("GL", "GL_EXT_memory_object_win32");
    }

    private static boolean check_EXT_mesh_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_mesh_shader")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1853, 1854, 1855, 1856
        },
            "glDrawMeshTasksEXT", "glDrawMeshTasksIndirectEXT", "glMultiDrawMeshTasksIndirectEXT", "glMultiDrawMeshTasksIndirectCountEXT"
        )) || reportMissing("GL", "GL_EXT_mesh_shader");
    }

    private static boolean check_EXT_point_parameters(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_point_parameters")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1857, 1858
        },
            "glPointParameterfEXT", "glPointParameterfvEXT"
        )) || reportMissing("GL", "GL_EXT_point_parameters");
    }

    private static boolean check_EXT_polygon_offset_clamp(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_polygon_offset_clamp")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1859
        },
            "glPolygonOffsetClampEXT"
        )) || reportMissing("GL", "GL_EXT_polygon_offset_clamp");
    }

    private static boolean check_EXT_provoking_vertex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_provoking_vertex")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1860
        },
            "glProvokingVertexEXT"
        )) || reportMissing("GL", "GL_EXT_provoking_vertex");
    }

    private static boolean check_EXT_raster_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_raster_multisample")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1861
        },
            "glRasterSamplesEXT"
        )) || reportMissing("GL", "GL_EXT_raster_multisample");
    }

    private static boolean check_EXT_secondary_color(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_secondary_color")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1862, 1863, 1864, 1865, 1866, 1867, 1868, 1869, 1870, 1871, 1872, 1873, 1874, 1875, 1876, 1877, 1878
        },
            "glSecondaryColor3bEXT", "glSecondaryColor3sEXT", "glSecondaryColor3iEXT", "glSecondaryColor3fEXT", "glSecondaryColor3dEXT", 
            "glSecondaryColor3ubEXT", "glSecondaryColor3usEXT", "glSecondaryColor3uiEXT", "glSecondaryColor3bvEXT", "glSecondaryColor3svEXT", 
            "glSecondaryColor3ivEXT", "glSecondaryColor3fvEXT", "glSecondaryColor3dvEXT", "glSecondaryColor3ubvEXT", "glSecondaryColor3usvEXT", 
            "glSecondaryColor3uivEXT", "glSecondaryColorPointerEXT"
        )) || reportMissing("GL", "GL_EXT_secondary_color");
    }

    private static boolean check_EXT_semaphore(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_semaphore")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1831, 1832, 1879, 1880, 1881, 1882, 1883, 1884, 1885
        },
            "glGetUnsignedBytevEXT", "glGetUnsignedBytei_vEXT", "glGenSemaphoresEXT", "glDeleteSemaphoresEXT", "glIsSemaphoreEXT", 
            "glSemaphoreParameterui64vEXT", "glGetSemaphoreParameterui64vEXT", "glWaitSemaphoreEXT", "glSignalSemaphoreEXT"
        )) || reportMissing("GL", "GL_EXT_semaphore");
    }

    private static boolean check_EXT_semaphore_fd(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_semaphore_fd")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1886
        },
            "glImportSemaphoreFdEXT"
        )) || reportMissing("GL", "GL_EXT_semaphore_fd");
    }

    private static boolean check_EXT_semaphore_win32(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_semaphore_win32")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1887, 1888
        },
            "glImportSemaphoreWin32HandleEXT", "glImportSemaphoreWin32NameEXT"
        )) || reportMissing("GL", "GL_EXT_semaphore_win32");
    }

    private static boolean check_EXT_separate_shader_objects(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_separate_shader_objects")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1889, 1890, 1891
        },
            "glUseShaderProgramEXT", "glActiveProgramEXT", "glCreateShaderProgramEXT"
        )) || reportMissing("GL", "GL_EXT_separate_shader_objects");
    }

    private static boolean check_EXT_shader_framebuffer_fetch_non_coherent(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_shader_framebuffer_fetch_non_coherent")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1892
        },
            "glFramebufferFetchBarrierEXT"
        )) || reportMissing("GL", "GL_EXT_shader_framebuffer_fetch_non_coherent");
    }

    private static boolean check_EXT_shader_image_load_store(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_shader_image_load_store")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1893, 1894
        },
            "glBindImageTextureEXT", "glMemoryBarrierEXT"
        )) || reportMissing("GL", "GL_EXT_shader_image_load_store");
    }

    private static boolean check_EXT_stencil_clear_tag(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_stencil_clear_tag")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1895
        },
            "glStencilClearTagEXT"
        )) || reportMissing("GL", "GL_EXT_stencil_clear_tag");
    }

    private static boolean check_EXT_stencil_two_side(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_stencil_two_side")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1896
        },
            "glActiveStencilFaceEXT"
        )) || reportMissing("GL", "GL_EXT_stencil_two_side");
    }

    private static boolean check_EXT_texture_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_array")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1793
        },
            "glFramebufferTextureLayerEXT"
        )) || reportMissing("GL", "GL_EXT_texture_array");
    }

    private static boolean check_EXT_texture_buffer_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_buffer_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1897
        },
            "glTexBufferEXT"
        )) || reportMissing("GL", "GL_EXT_texture_buffer_object");
    }

    private static boolean check_EXT_texture_integer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_integer")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1898, 1899, 1900, 1901, 1902, 1903
        },
            "glClearColorIiEXT", "glClearColorIuiEXT", "glTexParameterIivEXT", "glTexParameterIuivEXT", "glGetTexParameterIivEXT", "glGetTexParameterIuivEXT"
        )) || reportMissing("GL", "GL_EXT_texture_integer");
    }

    private static boolean check_EXT_texture_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_storage")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1904, 1905, 1906, flag0 + 1409, flag0 + 1410, flag0 + 1411
        },
            "glTexStorage1DEXT", "glTexStorage2DEXT", "glTexStorage3DEXT", "glTextureStorage1DEXT", "glTextureStorage2DEXT", "glTextureStorage3DEXT"
        )) || reportMissing("GL", "GL_EXT_texture_storage");
    }

    private static boolean check_EXT_timer_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_timer_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1907, 1908
        },
            "glGetQueryObjecti64vEXT", "glGetQueryObjectui64vEXT"
        )) || reportMissing("GL", "GL_EXT_timer_query");
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_transform_feedback")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1909, 1910, 1911, 1912, 1913, 1914, 1915, 1629, 1630
        },
            "glBindBufferRangeEXT", "glBindBufferOffsetEXT", "glBindBufferBaseEXT", "glBeginTransformFeedbackEXT", "glEndTransformFeedbackEXT", 
            "glTransformFeedbackVaryingsEXT", "glGetTransformFeedbackVaryingEXT", "glGetIntegerIndexedvEXT", "glGetBooleanIndexedvEXT"
        )) || reportMissing("GL", "GL_EXT_transform_feedback");
    }

    private static boolean check_EXT_vertex_attrib_64bit(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_vertex_attrib_64bit")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1916, 1917, 1918, 1919, 1920, 1921, 1922, 1923, 1924, 1925, flag0 + 1418
        },
            "glVertexAttribL1dEXT", "glVertexAttribL2dEXT", "glVertexAttribL3dEXT", "glVertexAttribL4dEXT", "glVertexAttribL1dvEXT", "glVertexAttribL2dvEXT", 
            "glVertexAttribL3dvEXT", "glVertexAttribL4dvEXT", "glVertexAttribLPointerEXT", "glGetVertexAttribLdvEXT", "glVertexArrayVertexAttribLOffsetEXT"
        )) || reportMissing("GL", "GL_EXT_vertex_attrib_64bit");
    }

    private static boolean check_EXT_win32_keyed_mutex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_win32_keyed_mutex")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1926, 1927
        },
            "glAcquireKeyedMutexWin32EXT", "glReleaseKeyedMutexWin32EXT"
        )) || reportMissing("GL", "GL_EXT_win32_keyed_mutex");
    }

    private static boolean check_EXT_window_rectangles(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_window_rectangles")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1928
        },
            "glWindowRectanglesEXT"
        )) || reportMissing("GL", "GL_EXT_window_rectangles");
    }

    private static boolean check_EXT_x11_sync_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_x11_sync_object")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1929
        },
            "glImportSyncEXT"
        )) || reportMissing("GL", "GL_EXT_x11_sync_object");
    }

    private static boolean check_GREMEDY_frame_terminator(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_GREMEDY_frame_terminator")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1930
        },
            "glFrameTerminatorGREMEDY"
        )) || reportMissing("GL", "GL_GREMEDY_frame_terminator");
    }

    private static boolean check_GREMEDY_string_marker(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_GREMEDY_string_marker")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1931
        },
            "glStringMarkerGREMEDY"
        )) || reportMissing("GL", "GL_GREMEDY_string_marker");
    }

    private static boolean check_INTEL_framebuffer_CMAA(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_INTEL_framebuffer_CMAA")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1932
        },
            "glApplyFramebufferAttachmentCMAAINTEL"
        )) || reportMissing("GL", "GL_INTEL_framebuffer_CMAA");
    }

    private static boolean check_INTEL_map_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_INTEL_map_texture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1933, 1934, 1935
        },
            "glSyncTextureINTEL", "glUnmapTexture2DINTEL", "glMapTexture2DINTEL"
        )) || reportMissing("GL", "GL_INTEL_map_texture");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_INTEL_performance_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945
        },
            "glBeginPerfQueryINTEL", "glCreatePerfQueryINTEL", "glDeletePerfQueryINTEL", "glEndPerfQueryINTEL", "glGetFirstPerfQueryIdINTEL", 
            "glGetNextPerfQueryIdINTEL", "glGetPerfCounterInfoINTEL", "glGetPerfQueryDataINTEL", "glGetPerfQueryIdByNameINTEL", "glGetPerfQueryInfoINTEL"
        )) || reportMissing("GL", "GL_INTEL_performance_query");
    }

    private static boolean check_KHR_blend_equation_advanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_blend_equation_advanced")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1946
        },
            "glBlendBarrierKHR"
        )) || reportMissing("GL", "GL_KHR_blend_equation_advanced");
    }

    private static boolean check_KHR_debug(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_debug")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            875, 876, 877, 878, 879, 880, 881, 882, 883, 884
        },
            "glDebugMessageControl", "glDebugMessageInsert", "glDebugMessageCallback", "glGetDebugMessageLog", "glPushDebugGroup", "glPopDebugGroup", 
            "glObjectLabel", "glGetObjectLabel", "glObjectPtrLabel", "glGetObjectPtrLabel"
        )) || reportMissing("GL", "GL_KHR_debug");
    }

    private static boolean check_KHR_parallel_shader_compile(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_parallel_shader_compile")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1947
        },
            "glMaxShaderCompilerThreadsKHR"
        )) || reportMissing("GL", "GL_KHR_parallel_shader_compile");
    }

    private static boolean check_KHR_robustness(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_robustness")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1024, 1033, 1040, 1042, 1043
        },
            "glGetGraphicsResetStatus", "glReadnPixels", "glGetnUniformfv", "glGetnUniformiv", "glGetnUniformuiv"
        )) || reportMissing("GL", "GL_KHR_robustness");
    }

    private static boolean check_MESA_framebuffer_flip_y(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_MESA_framebuffer_flip_y")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1948, 1949
        },
            "glFramebufferParameteriMESA", "glGetFramebufferParameterivMESA"
        )) || reportMissing("GL", "GL_MESA_framebuffer_flip_y");
    }

    private static boolean check_NV_alpha_to_coverage_dither_control(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_alpha_to_coverage_dither_control")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1950
        },
            "glAlphaToCoverageDitherControlNV"
        )) || reportMissing("GL", "GL_NV_alpha_to_coverage_dither_control");
    }

    private static boolean check_NV_bindless_multi_draw_indirect(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_bindless_multi_draw_indirect")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1951, 1952
        },
            "glMultiDrawArraysIndirectBindlessNV", "glMultiDrawElementsIndirectBindlessNV"
        )) || reportMissing("GL", "GL_NV_bindless_multi_draw_indirect");
    }

    private static boolean check_NV_bindless_multi_draw_indirect_count(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_bindless_multi_draw_indirect_count")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1953, 1954
        },
            "glMultiDrawArraysIndirectBindlessCountNV", "glMultiDrawElementsIndirectBindlessCountNV"
        )) || reportMissing("GL", "GL_NV_bindless_multi_draw_indirect_count");
    }

    private static boolean check_NV_bindless_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_bindless_texture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967
        },
            "glGetTextureHandleNV", "glGetTextureSamplerHandleNV", "glMakeTextureHandleResidentNV", "glMakeTextureHandleNonResidentNV", "glGetImageHandleNV", 
            "glMakeImageHandleResidentNV", "glMakeImageHandleNonResidentNV", "glUniformHandleui64NV", "glUniformHandleui64vNV", "glProgramUniformHandleui64NV", 
            "glProgramUniformHandleui64vNV", "glIsTextureHandleResidentNV", "glIsImageHandleResidentNV"
        )) || reportMissing("GL", "GL_NV_bindless_texture");
    }

    private static boolean check_NV_blend_equation_advanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_blend_equation_advanced")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1968, 1969
        },
            "glBlendParameteriNV", "glBlendBarrierNV"
        )) || reportMissing("GL", "GL_NV_blend_equation_advanced");
    }

    private static boolean check_NV_clip_space_w_scaling(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_clip_space_w_scaling")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1970
        },
            "glViewportPositionWScaleNV"
        )) || reportMissing("GL", "GL_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_command_list(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_command_list")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987
        },
            "glCreateStatesNV", "glDeleteStatesNV", "glIsStateNV", "glStateCaptureNV", "glGetCommandHeaderNV", "glGetStageIndexNV", "glDrawCommandsNV", 
            "glDrawCommandsAddressNV", "glDrawCommandsStatesNV", "glDrawCommandsStatesAddressNV", "glCreateCommandListsNV", "glDeleteCommandListsNV", 
            "glIsCommandListNV", "glListDrawCommandsStatesClientNV", "glCommandListSegmentsNV", "glCompileCommandListNV", "glCallCommandListNV"
        )) || reportMissing("GL", "GL_NV_command_list");
    }

    private static boolean check_NV_conditional_render(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conditional_render")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1988, 1989
        },
            "glBeginConditionalRenderNV", "glEndConditionalRenderNV"
        )) || reportMissing("GL", "GL_NV_conditional_render");
    }

    private static boolean check_NV_conservative_raster(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conservative_raster")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1990
        },
            "glSubpixelPrecisionBiasNV"
        )) || reportMissing("GL", "GL_NV_conservative_raster");
    }

    private static boolean check_NV_conservative_raster_dilate(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conservative_raster_dilate")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1991
        },
            "glConservativeRasterParameterfNV"
        )) || reportMissing("GL", "GL_NV_conservative_raster_dilate");
    }

    private static boolean check_NV_conservative_raster_pre_snap_triangles(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conservative_raster_pre_snap_triangles")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1992
        },
            "glConservativeRasterParameteriNV"
        )) || reportMissing("GL", "GL_NV_conservative_raster_pre_snap_triangles");
    }

    private static boolean check_NV_copy_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_copy_image")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1993
        },
            "glCopyImageSubDataNV"
        )) || reportMissing("GL", "GL_NV_copy_image");
    }

    private static boolean check_NV_depth_buffer_float(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_depth_buffer_float")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1994, 1995, 1996
        },
            "glDepthRangedNV", "glClearDepthdNV", "glDepthBoundsdNV"
        )) || reportMissing("GL", "GL_NV_depth_buffer_float");
    }

    private static boolean check_NV_draw_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_draw_texture")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1997
        },
            "glDrawTextureNV"
        )) || reportMissing("GL", "GL_NV_draw_texture");
    }

    private static boolean check_NV_draw_vulkan_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_draw_vulkan_image")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1998, 1999, 2000, 2001, 2002
        },
            "glDrawVkImageNV", "glGetVkProcAddrNV", "glWaitVkSemaphoreNV", "glSignalVkSemaphoreNV", "glSignalVkFenceNV"
        )) || reportMissing("GL", "GL_NV_draw_vulkan_image");
    }

    private static boolean check_NV_explicit_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_explicit_multisample")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2003, 2004, 2005
        },
            "glGetMultisamplefvNV", "glSampleMaskIndexedNV", "glTexRenderbufferNV"
        )) || reportMissing("GL", "GL_NV_explicit_multisample");
    }

    private static boolean check_NV_fence(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_fence")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2006, 2007, 2008, 2009, 2010, 2011, 2012
        },
            "glDeleteFencesNV", "glGenFencesNV", "glIsFenceNV", "glTestFenceNV", "glGetFenceivNV", "glFinishFenceNV", "glSetFenceNV"
        )) || reportMissing("GL", "GL_NV_fence");
    }

    private static boolean check_NV_fragment_coverage_to_color(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_fragment_coverage_to_color")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2013
        },
            "glFragmentCoverageColorNV"
        )) || reportMissing("GL", "GL_NV_fragment_coverage_to_color");
    }

    private static boolean check_NV_framebuffer_mixed_samples(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_framebuffer_mixed_samples")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            1861, 2014, 2015, 2016
        },
            "glRasterSamplesEXT", "glCoverageModulationTableNV", "glGetCoverageModulationTableNV", "glCoverageModulationNV"
        )) || reportMissing("GL", "GL_NV_framebuffer_mixed_samples");
    }

    private static boolean check_NV_framebuffer_multisample_coverage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_framebuffer_multisample_coverage")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2017
        },
            "glRenderbufferStorageMultisampleCoverageNV"
        )) || reportMissing("GL", "GL_NV_framebuffer_multisample_coverage");
    }

    private static boolean check_NV_gpu_multicast(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_gpu_multicast")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029
        },
            "glRenderGpuMaskNV", "glMulticastBufferSubDataNV", "glMulticastCopyBufferSubDataNV", "glMulticastCopyImageSubDataNV", 
            "glMulticastBlitFramebufferNV", "glMulticastFramebufferSampleLocationsfvNV", "glMulticastBarrierNV", "glMulticastWaitSyncNV", 
            "glMulticastGetQueryObjectivNV", "glMulticastGetQueryObjectuivNV", "glMulticastGetQueryObjecti64vNV", "glMulticastGetQueryObjectui64vNV"
        )) || reportMissing("GL", "GL_NV_gpu_multicast");
    }

    private static boolean check_NV_gpu_shader5(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_gpu_shader5")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_direct_state_access") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            1058, 1059, 1060, 1061, 1062, 1063, 1064, 1065, 1066, 1067, 1068, 1069, 1070, 1071, 1072, 1073, 1074, 1075, flag0 + 1076, flag0 + 1077, 
            flag0 + 1078, flag0 + 1079, flag0 + 1080, flag0 + 1081, flag0 + 1082, flag0 + 1083, flag0 + 1084, flag0 + 1085, flag0 + 1086, flag0 + 1087, 
            flag0 + 1088, flag0 + 1089, flag0 + 1090, flag0 + 1091
        },
            "glUniform1i64NV", "glUniform2i64NV", "glUniform3i64NV", "glUniform4i64NV", "glUniform1i64vNV", "glUniform2i64vNV", "glUniform3i64vNV", 
            "glUniform4i64vNV", "glUniform1ui64NV", "glUniform2ui64NV", "glUniform3ui64NV", "glUniform4ui64NV", "glUniform1ui64vNV", "glUniform2ui64vNV", 
            "glUniform3ui64vNV", "glUniform4ui64vNV", "glGetUniformi64vNV", "glGetUniformui64vNV", "glProgramUniform1i64NV", "glProgramUniform2i64NV", 
            "glProgramUniform3i64NV", "glProgramUniform4i64NV", "glProgramUniform1i64vNV", "glProgramUniform2i64vNV", "glProgramUniform3i64vNV", 
            "glProgramUniform4i64vNV", "glProgramUniform1ui64NV", "glProgramUniform2ui64NV", "glProgramUniform3ui64NV", "glProgramUniform4ui64NV", 
            "glProgramUniform1ui64vNV", "glProgramUniform2ui64vNV", "glProgramUniform3ui64vNV", "glProgramUniform4ui64vNV"
        )) || reportMissing("GL", "GL_NV_gpu_shader5");
    }

    private static boolean check_NV_half_float(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_half_float")) {
            return false;
        }

        int flag0 = ext.contains("GL_EXT_fog_coord") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("GL_EXT_secondary_color") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("GL_EXT_vertex_weighting") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("GL_NV_vertex_program") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047, 2048, 2049, 2050, 2051, 2052, 2053, 
            2054, 2055, 2056, 2057, flag0 + 2058, flag0 + 2059, flag2 + 2060, flag2 + 2061, flag4 + 2062, flag4 + 2063, flag6 + 2064, flag6 + 2065, 
            flag6 + 2066, flag6 + 2067, flag6 + 2068, flag6 + 2069, flag6 + 2070, flag6 + 2071, flag6 + 2072, flag6 + 2073, flag6 + 2074, flag6 + 2075
        },
            "glVertex2hNV", "glVertex2hvNV", "glVertex3hNV", "glVertex3hvNV", "glVertex4hNV", "glVertex4hvNV", "glNormal3hNV", "glNormal3hvNV", "glColor3hNV", 
            "glColor3hvNV", "glColor4hNV", "glColor4hvNV", "glTexCoord1hNV", "glTexCoord1hvNV", "glTexCoord2hNV", "glTexCoord2hvNV", "glTexCoord3hNV", 
            "glTexCoord3hvNV", "glTexCoord4hNV", "glTexCoord4hvNV", "glMultiTexCoord1hNV", "glMultiTexCoord1hvNV", "glMultiTexCoord2hNV", 
            "glMultiTexCoord2hvNV", "glMultiTexCoord3hNV", "glMultiTexCoord3hvNV", "glMultiTexCoord4hNV", "glMultiTexCoord4hvNV", "glFogCoordhNV", 
            "glFogCoordhvNV", "glSecondaryColor3hNV", "glSecondaryColor3hvNV", "glVertexWeighthNV", "glVertexWeighthvNV", "glVertexAttrib1hNV", 
            "glVertexAttrib1hvNV", "glVertexAttrib2hNV", "glVertexAttrib2hvNV", "glVertexAttrib3hNV", "glVertexAttrib3hvNV", "glVertexAttrib4hNV", 
            "glVertexAttrib4hvNV", "glVertexAttribs1hvNV", "glVertexAttribs2hvNV", "glVertexAttribs3hvNV", "glVertexAttribs4hvNV"
        )) || reportMissing("GL", "GL_NV_half_float");
    }

    private static boolean check_NV_internalformat_sample_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_internalformat_sample_query")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2076
        },
            "glGetInternalformatSampleivNV"
        )) || reportMissing("GL", "GL_NV_internalformat_sample_query");
    }

    private static boolean check_NV_memory_attachment(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_memory_attachment")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            2077, 2078, 2079, 2080, flag0 + 2081, flag0 + 2082
        },
            "glGetMemoryObjectDetachedResourcesuivNV", "glResetMemoryObjectParameterNV", "glTexAttachMemoryNV", "glBufferAttachMemoryNV", 
            "glTextureAttachMemoryNV", "glNamedBufferAttachMemoryNV"
        )) || reportMissing("GL", "GL_NV_memory_attachment");
    }

    private static boolean check_NV_memory_object_sparse(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_memory_object_sparse")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2083, 2084, 2085, 2086
        },
            "glBufferPageCommitmentMemNV", "glNamedBufferPageCommitmentMemNV", "glTexPageCommitmentMemNV", "glTexturePageCommitmentMemNV"
        )) || reportMissing("GL", "GL_NV_memory_object_sparse");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_mesh_shader")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2087, 2088, 2089, 2090
        },
            "glDrawMeshTasksNV", "glDrawMeshTasksIndirectNV", "glMultiDrawMeshTasksIndirectNV", "glMultiDrawMeshTasksIndirectCountNV"
        )) || reportMissing("GL", "GL_NV_mesh_shader");
    }

    private static boolean check_NV_path_rendering(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_path_rendering")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2091, 2092, 2093, 2094, 2095, 2096, 2097, 2100, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2111, 2112, 2113, 2114, 2115, 2116, 2117, 
            2118, 2122, 2123, 2124, 2125, 2132, 2133, 2134, 2135, 2136, 2137, 2138, 2139, 2144, 2145, 2146, 2147
        },
            "glPathCommandsNV", "glPathCoordsNV", "glPathSubCommandsNV", "glPathSubCoordsNV", "glPathStringNV", "glPathGlyphsNV", "glPathGlyphRangeNV", 
            "glCopyPathNV", "glInterpolatePathsNV", "glTransformPathNV", "glPathParameterivNV", "glPathParameteriNV", "glPathParameterfvNV", 
            "glPathParameterfNV", "glPathDashArrayNV", "glGenPathsNV", "glDeletePathsNV", "glIsPathNV", "glPathStencilFuncNV", "glPathStencilDepthOffsetNV", 
            "glStencilFillPathNV", "glStencilStrokePathNV", "glStencilFillPathInstancedNV", "glStencilStrokePathInstancedNV", "glPathCoverDepthFuncNV", 
            "glCoverFillPathNV", "glCoverStrokePathNV", "glCoverFillPathInstancedNV", "glCoverStrokePathInstancedNV", "glGetPathParameterivNV", 
            "glGetPathParameterfvNV", "glGetPathCommandsNV", "glGetPathCoordsNV", "glGetPathDashArrayNV", "glGetPathMetricsNV", "glGetPathMetricRangeNV", 
            "glGetPathSpacingNV", "glIsPointInFillPathNV", "glIsPointInStrokePathNV", "glGetPathLengthNV", "glPointAlongPathNV"
        )) || reportMissing("GL", "GL_NV_path_rendering");
    }

    private static boolean check_NV_pixel_data_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_pixel_data_range")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2155, 2156
        },
            "glPixelDataRangeNV", "glFlushPixelDataRangeNV"
        )) || reportMissing("GL", "GL_NV_pixel_data_range");
    }

    private static boolean check_NV_point_sprite(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_point_sprite")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2157, 2158
        },
            "glPointParameteriNV", "glPointParameterivNV"
        )) || reportMissing("GL", "GL_NV_point_sprite");
    }

    private static boolean check_NV_primitive_restart(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_primitive_restart")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2159, 2160
        },
            "glPrimitiveRestartNV", "glPrimitiveRestartIndexNV"
        )) || reportMissing("GL", "GL_NV_primitive_restart");
    }

    private static boolean check_NV_query_resource(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_query_resource")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2161
        },
            "glQueryResourceNV"
        )) || reportMissing("GL", "GL_NV_query_resource");
    }

    private static boolean check_NV_query_resource_tag(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_query_resource_tag")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2162, 2163, 2164
        },
            "glGenQueryResourceTagNV", "glDeleteQueryResourceTagNV", "glQueryResourceTagNV"
        )) || reportMissing("GL", "GL_NV_query_resource_tag");
    }

    private static boolean check_NV_sample_locations(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_sample_locations")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2165, 2166, 2167
        },
            "glFramebufferSampleLocationsfvNV", "glNamedFramebufferSampleLocationsfvNV", "glResolveDepthValuesNV"
        )) || reportMissing("GL", "GL_NV_sample_locations");
    }

    private static boolean check_NV_scissor_exclusive(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_scissor_exclusive")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2168, 2169
        },
            "glScissorExclusiveArrayvNV", "glScissorExclusiveNV"
        )) || reportMissing("GL", "GL_NV_scissor_exclusive");
    }

    private static boolean check_NV_shader_buffer_load(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_shader_buffer_load")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2170, 2171, 2172, 2173, 2174, 2175, 2176, 2177, 2178, 2179, 2180, 1075, 2181, 2182
        },
            "glMakeBufferResidentNV", "glMakeBufferNonResidentNV", "glIsBufferResidentNV", "glMakeNamedBufferResidentNV", "glMakeNamedBufferNonResidentNV", 
            "glIsNamedBufferResidentNV", "glGetBufferParameterui64vNV", "glGetNamedBufferParameterui64vNV", "glGetIntegerui64vNV", "glUniformui64NV", 
            "glUniformui64vNV", "glGetUniformui64vNV", "glProgramUniformui64NV", "glProgramUniformui64vNV"
        )) || reportMissing("GL", "GL_NV_shader_buffer_load");
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_shading_rate_image")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2183, 2184, 2185, 2186, 2187, 2188, 2189
        },
            "glBindShadingRateImageNV", "glShadingRateImagePaletteNV", "glGetShadingRateImagePaletteNV", "glShadingRateImageBarrierNV", 
            "glShadingRateSampleOrderNV", "glShadingRateSampleOrderCustomNV", "glGetShadingRateSampleLocationivNV"
        )) || reportMissing("GL", "GL_NV_shading_rate_image");
    }

    private static boolean check_NV_texture_barrier(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_texture_barrier")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2190
        },
            "glTextureBarrierNV"
        )) || reportMissing("GL", "GL_NV_texture_barrier");
    }

    private static boolean check_NV_texture_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_texture_multisample")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2191, 2192, 2193, 2194, 2195, 2196
        },
            "glTexImage2DMultisampleCoverageNV", "glTexImage3DMultisampleCoverageNV", "glTextureImage2DMultisampleNV", "glTextureImage3DMultisampleNV", 
            "glTextureImage2DMultisampleCoverageNV", "glTextureImage3DMultisampleCoverageNV"
        )) || reportMissing("GL", "GL_NV_texture_multisample");
    }

    private static boolean check_NV_timeline_semaphore(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_timeline_semaphore")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2197, 2198, 2199
        },
            "glCreateSemaphoresNV", "glSemaphoreParameterivNV", "glGetSemaphoreParameterivNV"
        )) || reportMissing("GL", "GL_NV_timeline_semaphore");
    }

    private static boolean check_NV_transform_feedback(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_transform_feedback")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2200, 2201, 2202, 2203, 2204, 2205, 2206, 2207, 2208, 2209, 2210, 2211
        },
            "glBeginTransformFeedbackNV", "glEndTransformFeedbackNV", "glTransformFeedbackAttribsNV", "glBindBufferRangeNV", "glBindBufferOffsetNV", 
            "glBindBufferBaseNV", "glTransformFeedbackVaryingsNV", "glActiveVaryingNV", "glGetVaryingLocationNV", "glGetActiveVaryingNV", 
            "glGetTransformFeedbackVaryingNV", "glTransformFeedbackStreamAttribsNV"
        )) || reportMissing("GL", "GL_NV_transform_feedback");
    }

    private static boolean check_NV_transform_feedback2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_transform_feedback2")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2212, 2213, 2214, 2215, 2216, 2217, 2218
        },
            "glBindTransformFeedbackNV", "glDeleteTransformFeedbacksNV", "glGenTransformFeedbacksNV", "glIsTransformFeedbackNV", "glPauseTransformFeedbackNV", 
            "glResumeTransformFeedbackNV", "glDrawTransformFeedbackNV"
        )) || reportMissing("GL", "GL_NV_transform_feedback2");
    }

    private static boolean check_NV_vertex_array_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_vertex_array_range")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2219, 2220
        },
            "glVertexArrayRangeNV", "glFlushVertexArrayRangeNV"
        )) || reportMissing("GL", "GL_NV_vertex_array_range");
    }

    private static boolean check_NV_vertex_attrib_integer_64bit(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_vertex_attrib_integer_64bit")) {
            return false;
        }

        int flag0 = ext.contains("GL_NV_vertex_buffer_unified_memory") ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            2221, 2222, 2223, 2224, 2225, 2226, 2227, 2228, 2229, 2230, 2231, 2232, 2233, 2234, 2235, 2236, 2237, 2238, flag0 + 2239
        },
            "glVertexAttribL1i64NV", "glVertexAttribL2i64NV", "glVertexAttribL3i64NV", "glVertexAttribL4i64NV", "glVertexAttribL1i64vNV", 
            "glVertexAttribL2i64vNV", "glVertexAttribL3i64vNV", "glVertexAttribL4i64vNV", "glVertexAttribL1ui64NV", "glVertexAttribL2ui64NV", 
            "glVertexAttribL3ui64NV", "glVertexAttribL4ui64NV", "glVertexAttribL1ui64vNV", "glVertexAttribL2ui64vNV", "glVertexAttribL3ui64vNV", 
            "glVertexAttribL4ui64vNV", "glGetVertexAttribLi64vNV", "glGetVertexAttribLui64vNV", "glVertexAttribLFormatNV"
        )) || reportMissing("GL", "GL_NV_vertex_attrib_integer_64bit");
    }

    private static boolean check_NV_vertex_buffer_unified_memory(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_vertex_buffer_unified_memory")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2240, 2241, 2242, 2243, 2244, 2245, 2246, 2247, 2248, 2249, 2250, 2251
        },
            "glBufferAddressRangeNV", "glVertexFormatNV", "glNormalFormatNV", "glColorFormatNV", "glIndexFormatNV", "glTexCoordFormatNV", "glEdgeFlagFormatNV", 
            "glSecondaryColorFormatNV", "glFogCoordFormatNV", "glVertexAttribFormatNV", "glVertexAttribIFormatNV", "glGetIntegerui64i_vNV"
        )) || reportMissing("GL", "GL_NV_vertex_buffer_unified_memory");
    }

    private static boolean check_NV_viewport_swizzle(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_viewport_swizzle")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2252
        },
            "glViewportSwizzleNV"
        )) || reportMissing("GL", "GL_NV_viewport_swizzle");
    }

    private static boolean check_NVX_conditional_render(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NVX_conditional_render")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2253, 2254
        },
            "glBeginConditionalRenderNVX", "glEndConditionalRenderNVX"
        )) || reportMissing("GL", "GL_NVX_conditional_render");
    }

    private static boolean check_NVX_gpu_multicast2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NVX_gpu_multicast2")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2255, 2256, 2257, 2258, 2259, 2260
        },
            "glAsyncCopyImageSubDataNVX", "glAsyncCopyBufferSubDataNVX", "glUploadGpuMaskNVX", "glMulticastViewportArrayvNVX", "glMulticastScissorArrayvNVX", 
            "glMulticastViewportPositionWScaleNVX"
        )) || reportMissing("GL", "GL_NVX_gpu_multicast2");
    }

    private static boolean check_NVX_progress_fence(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NVX_progress_fence")) {
            return false;
        }

        return (checkFunctions(provider, caps, new int[] {
            2261, 2262, 2263, 2264
        },
            "glCreateProgressFenceNVX", "glSignalSemaphoreui64NVX", "glWaitSemaphoreui64NVX", "glClientWaitSemaphoreui64NVX"
        )) || reportMissing("GL", "GL_NVX_progress_fence");
    }

    private static boolean check_OVR_multiview(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OVR_multiview")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return (checkFunctions(provider, caps, new int[] {
            2265, flag0 + 2266
        },
            "glFramebufferTextureMultiviewOVR", "glNamedFramebufferTextureMultiviewOVR"
        )) || reportMissing("GL", "GL_OVR_multiview");
    }

    private static boolean hasDSA(Set<String> ext) {
        return ext.contains("GL45") || ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

    private static boolean ARB_framebuffer_object(Set<String> ext) { return ext.contains("OpenGL30") || ext.contains("GL_ARB_framebuffer_object"); }
    private static boolean ARB_map_buffer_range(Set<String> ext) { return ext.contains("OpenGL30") || ext.contains("GL_ARB_map_buffer_range"); }
    private static boolean ARB_vertex_array_object(Set<String> ext) { return ext.contains("OpenGL30") || ext.contains("GL_ARB_vertex_array_object"); }
    private static boolean ARB_copy_buffer(Set<String> ext) { return ext.contains("OpenGL31") || ext.contains("GL_ARB_copy_buffer"); }
    private static boolean ARB_texture_buffer_object(Set<String> ext) { return ext.contains("OpenGL31") || ext.contains("GL_ARB_texture_buffer_object"); }
    private static boolean ARB_uniform_buffer_object(Set<String> ext) { return ext.contains("OpenGL31") || ext.contains("GL_ARB_uniform_buffer_object"); }
    private static boolean ARB_instanced_arrays(Set<String> ext) { return ext.contains("OpenGL33") || ext.contains("GL_ARB_instanced_arrays"); }
    private static boolean ARB_sampler_objects(Set<String> ext) { return ext.contains("OpenGL33") || ext.contains("GL_ARB_sampler_objects"); }
    private static boolean ARB_transform_feedback2(Set<String> ext) { return ext.contains("OpenGL40") || ext.contains("GL_ARB_transform_feedback2"); }
    private static boolean ARB_vertex_attrib_64bit(Set<String> ext) { return ext.contains("OpenGL41") || ext.contains("GL_ARB_vertex_attrib_64bit"); }
    private static boolean ARB_separate_shader_objects(Set<String> ext) { return ext.contains("OpenGL41") || ext.contains("GL_ARB_separate_shader_objects"); }
    private static boolean ARB_texture_storage(Set<String> ext) { return ext.contains("OpenGL42") || ext.contains("GL_ARB_texture_storage"); }
    private static boolean ARB_texture_storage_multisample(Set<String> ext) { return ext.contains("OpenGL43") || ext.contains("GL_ARB_texture_storage_multisample"); }
    private static boolean ARB_vertex_attrib_binding(Set<String> ext) { return ext.contains("OpenGL43") || ext.contains("GL_ARB_vertex_attrib_binding"); }
    private static boolean ARB_invalidate_subdata(Set<String> ext) { return ext.contains("OpenGL43") || ext.contains("GL_ARB_invalidate_subdata"); }
    private static boolean ARB_texture_buffer_range(Set<String> ext) { return ext.contains("OpenGL43") || ext.contains("GL_ARB_texture_buffer_range"); }
    private static boolean ARB_clear_buffer_object(Set<String> ext) { return ext.contains("OpenGL43") || ext.contains("GL_ARB_clear_buffer_object"); }
    private static boolean ARB_framebuffer_no_attachments(Set<String> ext) { return ext.contains("OpenGL43") || ext.contains("GL_ARB_framebuffer_no_attachments"); }
    private static boolean ARB_buffer_storage(Set<String> ext) { return ext.contains("OpenGL44") || ext.contains("GL_ARB_buffer_storage"); }
    private static boolean ARB_clear_texture(Set<String> ext) { return ext.contains("OpenGL44") || ext.contains("GL_ARB_clear_texture"); }
    private static boolean ARB_multi_bind(Set<String> ext) { return ext.contains("OpenGL44") || ext.contains("GL_ARB_multi_bind"); }
    private static boolean ARB_query_buffer_object(Set<String> ext) { return ext.contains("OpenGL44") || ext.contains("GL_ARB_query_buffer_object"); }

}
