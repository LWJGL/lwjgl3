/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;
import java.util.Set;
import org.lwjgl.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Defines the capabilities of an OpenGL ES context. */
public final class GLESCapabilities {

    public final long
        glActiveTexture,
        glAttachShader,
        glBindAttribLocation,
        glBindBuffer,
        glBindFramebuffer,
        glBindRenderbuffer,
        glBindTexture,
        glBlendColor,
        glBlendEquation,
        glBlendEquationSeparate,
        glBlendFunc,
        glBlendFuncSeparate,
        glBufferData,
        glBufferSubData,
        glCheckFramebufferStatus,
        glClear,
        glClearColor,
        glClearDepthf,
        glClearStencil,
        glColorMask,
        glCompileShader,
        glCompressedTexImage2D,
        glCompressedTexSubImage2D,
        glCopyTexImage2D,
        glCopyTexSubImage2D,
        glCreateProgram,
        glCreateShader,
        glCullFace,
        glDeleteBuffers,
        glDeleteFramebuffers,
        glDeleteProgram,
        glDeleteRenderbuffers,
        glDeleteShader,
        glDeleteTextures,
        glDepthFunc,
        glDepthMask,
        glDepthRangef,
        glDetachShader,
        glDisable,
        glDisableVertexAttribArray,
        glDrawArrays,
        glDrawElements,
        glEnable,
        glEnableVertexAttribArray,
        glFinish,
        glFlush,
        glFramebufferRenderbuffer,
        glFramebufferTexture2D,
        glFrontFace,
        glGenBuffers,
        glGenerateMipmap,
        glGenFramebuffers,
        glGenRenderbuffers,
        glGenTextures,
        glGetActiveAttrib,
        glGetActiveUniform,
        glGetAttachedShaders,
        glGetAttribLocation,
        glGetBooleanv,
        glGetBufferParameteriv,
        glGetError,
        glGetFloatv,
        glGetFramebufferAttachmentParameteriv,
        glGetIntegerv,
        glGetProgramiv,
        glGetProgramInfoLog,
        glGetRenderbufferParameteriv,
        glGetShaderiv,
        glGetShaderInfoLog,
        glGetShaderPrecisionFormat,
        glGetShaderSource,
        glGetString,
        glGetTexParameterfv,
        glGetTexParameteriv,
        glGetUniformfv,
        glGetUniformiv,
        glGetUniformLocation,
        glGetVertexAttribfv,
        glGetVertexAttribiv,
        glGetVertexAttribPointerv,
        glHint,
        glIsBuffer,
        glIsEnabled,
        glIsFramebuffer,
        glIsProgram,
        glIsRenderbuffer,
        glIsShader,
        glIsTexture,
        glLineWidth,
        glLinkProgram,
        glPixelStorei,
        glPolygonOffset,
        glReadPixels,
        glReleaseShaderCompiler,
        glRenderbufferStorage,
        glSampleCoverage,
        glScissor,
        glShaderBinary,
        glShaderSource,
        glStencilFunc,
        glStencilFuncSeparate,
        glStencilMask,
        glStencilMaskSeparate,
        glStencilOp,
        glStencilOpSeparate,
        glTexImage2D,
        glTexParameterf,
        glTexParameterfv,
        glTexParameteri,
        glTexParameteriv,
        glTexSubImage2D,
        glUniform1f,
        glUniform1fv,
        glUniform1i,
        glUniform1iv,
        glUniform2f,
        glUniform2fv,
        glUniform2i,
        glUniform2iv,
        glUniform3f,
        glUniform3fv,
        glUniform3i,
        glUniform3iv,
        glUniform4f,
        glUniform4fv,
        glUniform4i,
        glUniform4iv,
        glUniformMatrix2fv,
        glUniformMatrix3fv,
        glUniformMatrix4fv,
        glUseProgram,
        glValidateProgram,
        glVertexAttrib1f,
        glVertexAttrib1fv,
        glVertexAttrib2f,
        glVertexAttrib2fv,
        glVertexAttrib3f,
        glVertexAttrib3fv,
        glVertexAttrib4f,
        glVertexAttrib4fv,
        glVertexAttribPointer,
        glViewport,
        glReadBuffer,
        glDrawRangeElements,
        glTexImage3D,
        glTexSubImage3D,
        glCopyTexSubImage3D,
        glCompressedTexImage3D,
        glCompressedTexSubImage3D,
        glGenQueries,
        glDeleteQueries,
        glIsQuery,
        glBeginQuery,
        glEndQuery,
        glGetQueryiv,
        glGetQueryObjectuiv,
        glUnmapBuffer,
        glGetBufferPointerv,
        glDrawBuffers,
        glUniformMatrix2x3fv,
        glUniformMatrix3x2fv,
        glUniformMatrix2x4fv,
        glUniformMatrix4x2fv,
        glUniformMatrix3x4fv,
        glUniformMatrix4x3fv,
        glBlitFramebuffer,
        glRenderbufferStorageMultisample,
        glFramebufferTextureLayer,
        glMapBufferRange,
        glFlushMappedBufferRange,
        glBindVertexArray,
        glDeleteVertexArrays,
        glGenVertexArrays,
        glIsVertexArray,
        glGetIntegeri_v,
        glBeginTransformFeedback,
        glEndTransformFeedback,
        glBindBufferRange,
        glBindBufferBase,
        glTransformFeedbackVaryings,
        glGetTransformFeedbackVarying,
        glVertexAttribIPointer,
        glGetVertexAttribIiv,
        glGetVertexAttribIuiv,
        glVertexAttribI4i,
        glVertexAttribI4ui,
        glVertexAttribI4iv,
        glVertexAttribI4uiv,
        glGetUniformuiv,
        glGetFragDataLocation,
        glUniform1ui,
        glUniform2ui,
        glUniform3ui,
        glUniform4ui,
        glUniform1uiv,
        glUniform2uiv,
        glUniform3uiv,
        glUniform4uiv,
        glClearBufferiv,
        glClearBufferuiv,
        glClearBufferfv,
        glClearBufferfi,
        glGetStringi,
        glCopyBufferSubData,
        glGetUniformIndices,
        glGetActiveUniformsiv,
        glGetUniformBlockIndex,
        glGetActiveUniformBlockiv,
        glGetActiveUniformBlockName,
        glUniformBlockBinding,
        glDrawArraysInstanced,
        glDrawElementsInstanced,
        glFenceSync,
        glIsSync,
        glDeleteSync,
        glClientWaitSync,
        glWaitSync,
        glGetInteger64v,
        glGetSynciv,
        glGetInteger64i_v,
        glGetBufferParameteri64v,
        glGenSamplers,
        glDeleteSamplers,
        glIsSampler,
        glBindSampler,
        glSamplerParameteri,
        glSamplerParameteriv,
        glSamplerParameterf,
        glSamplerParameterfv,
        glGetSamplerParameteriv,
        glGetSamplerParameterfv,
        glVertexAttribDivisor,
        glBindTransformFeedback,
        glDeleteTransformFeedbacks,
        glGenTransformFeedbacks,
        glIsTransformFeedback,
        glPauseTransformFeedback,
        glResumeTransformFeedback,
        glGetProgramBinary,
        glProgramBinary,
        glProgramParameteri,
        glInvalidateFramebuffer,
        glInvalidateSubFramebuffer,
        glTexStorage2D,
        glTexStorage3D,
        glGetInternalformativ,
        glDispatchCompute,
        glDispatchComputeIndirect,
        glDrawArraysIndirect,
        glDrawElementsIndirect,
        glFramebufferParameteri,
        glGetFramebufferParameteriv,
        glGetProgramInterfaceiv,
        glGetProgramResourceIndex,
        glGetProgramResourceName,
        glGetProgramResourceiv,
        glGetProgramResourceLocation,
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
        glProgramUniformMatrix2fv,
        glProgramUniformMatrix3fv,
        glProgramUniformMatrix4fv,
        glProgramUniformMatrix2x3fv,
        glProgramUniformMatrix3x2fv,
        glProgramUniformMatrix2x4fv,
        glProgramUniformMatrix4x2fv,
        glProgramUniformMatrix3x4fv,
        glProgramUniformMatrix4x3fv,
        glValidateProgramPipeline,
        glGetProgramPipelineInfoLog,
        glBindImageTexture,
        glGetBooleani_v,
        glMemoryBarrier,
        glMemoryBarrierByRegion,
        glTexStorage2DMultisample,
        glGetMultisamplefv,
        glSampleMaski,
        glGetTexLevelParameteriv,
        glGetTexLevelParameterfv,
        glBindVertexBuffer,
        glVertexAttribFormat,
        glVertexAttribIFormat,
        glVertexAttribBinding,
        glVertexBindingDivisor,
        glBlendBarrier,
        glCopyImageSubData,
        glDebugMessageControl,
        glDebugMessageInsert,
        glDebugMessageCallback,
        glGetDebugMessageLog,
        glGetPointerv,
        glPushDebugGroup,
        glPopDebugGroup,
        glObjectLabel,
        glGetObjectLabel,
        glObjectPtrLabel,
        glGetObjectPtrLabel,
        glEnablei,
        glDisablei,
        glBlendEquationi,
        glBlendEquationSeparatei,
        glBlendFunci,
        glBlendFuncSeparatei,
        glColorMaski,
        glIsEnabledi,
        glDrawElementsBaseVertex,
        glDrawRangeElementsBaseVertex,
        glDrawElementsInstancedBaseVertex,
        glFramebufferTexture,
        glPrimitiveBoundingBox,
        glGetGraphicsResetStatus,
        glReadnPixels,
        glGetnUniformfv,
        glGetnUniformiv,
        glGetnUniformuiv,
        glMinSampleShading,
        glPatchParameteri,
        glTexParameterIiv,
        glTexParameterIuiv,
        glGetTexParameterIiv,
        glGetTexParameterIuiv,
        glSamplerParameterIiv,
        glSamplerParameterIuiv,
        glGetSamplerParameterIiv,
        glGetSamplerParameterIuiv,
        glTexBuffer,
        glTexBufferRange,
        glTexStorage3DMultisample,
        glRenderbufferStorageMultisampleAdvancedAMD,
        glNamedRenderbufferStorageMultisampleAdvancedAMD,
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
        glBlitFramebufferANGLE,
        glRenderbufferStorageMultisampleANGLE,
        glDrawArraysInstancedANGLE,
        glDrawElementsInstancedANGLE,
        glVertexAttribDivisorANGLE,
        glGetTranslatedShaderSourceANGLE,
        glCopyTextureLevelsAPPLE,
        glRenderbufferStorageMultisampleAPPLE,
        glResolveMultisampleFramebufferAPPLE,
        glFenceSyncAPPLE,
        glIsSyncAPPLE,
        glDeleteSyncAPPLE,
        glClientWaitSyncAPPLE,
        glWaitSyncAPPLE,
        glGetInteger64vAPPLE,
        glGetSyncivAPPLE,
        glDrawArraysInstancedBaseInstanceEXT,
        glDrawElementsInstancedBaseInstanceEXT,
        glDrawElementsInstancedBaseVertexBaseInstanceEXT,
        glBindFragDataLocationIndexedEXT,
        glGetFragDataIndexEXT,
        glBindFragDataLocationEXT,
        glGetProgramResourceLocationIndexEXT,
        glBufferStorageEXT,
        glNamedBufferStorageEXT,
        glClearTexImageEXT,
        glClearTexSubImageEXT,
        glClipControlEXT,
        glCopyImageSubDataEXT,
        glLabelObjectEXT,
        glGetObjectLabelEXT,
        glInsertEventMarkerEXT,
        glPushGroupMarkerEXT,
        glPopGroupMarkerEXT,
        glDiscardFramebufferEXT,
        glQueryCounterEXT,
        glGetQueryObjectivEXT,
        glGetQueryObjecti64vEXT,
        glGetQueryObjectui64vEXT,
        glGetInteger64vEXT,
        glDrawBuffersEXT,
        glEnableiEXT,
        glDisableiEXT,
        glBlendEquationiEXT,
        glBlendEquationSeparateiEXT,
        glBlendFunciEXT,
        glBlendFuncSeparateiEXT,
        glColorMaskiEXT,
        glIsEnablediEXT,
        glDrawElementsBaseVertexEXT,
        glDrawRangeElementsBaseVertexEXT,
        glDrawElementsInstancedBaseVertexEXT,
        glMultiDrawElementsBaseVertexEXT,
        glDrawTransformFeedbackEXT,
        glDrawTransformFeedbackInstancedEXT,
        glEGLImageTargetTexStorageEXT,
        glEGLImageTargetTextureStorageEXT,
        glBufferStorageExternalEXT,
        glNamedBufferStorageExternalEXT,
        glFramebufferTextureEXT,
        glDrawArraysInstancedEXT,
        glDrawElementsInstancedEXT,
        glVertexAttribDivisorEXT,
        glMapBufferRangeEXT,
        glFlushMappedBufferRangeEXT,
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
        glImportMemoryFdEXT,
        glImportMemoryWin32HandleEXT,
        glImportMemoryWin32NameEXT,
        glMultiDrawArraysEXT,
        glMultiDrawElementsEXT,
        glMultiDrawArraysIndirectEXT,
        glMultiDrawElementsIndirectEXT,
        glRenderbufferStorageMultisampleEXT,
        glFramebufferTexture2DMultisampleEXT,
        glReadBufferIndexedEXT,
        glDrawBuffersIndexedEXT,
        glGetIntegeri_vEXT,
        glGenQueriesEXT,
        glDeleteQueriesEXT,
        glIsQueryEXT,
        glBeginQueryEXT,
        glEndQueryEXT,
        glGetQueryivEXT,
        glGetQueryObjectuivEXT,
        glPolygonOffsetClampEXT,
        glPrimitiveBoundingBoxEXT,
        glRasterSamplesEXT,
        glGetGraphicsResetStatusEXT,
        glReadnPixelsEXT,
        glGetnUniformfvEXT,
        glGetnUniformivEXT,
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
        glActiveShaderProgramEXT,
        glBindProgramPipelineEXT,
        glCreateShaderProgramvEXT,
        glDeleteProgramPipelinesEXT,
        glGenProgramPipelinesEXT,
        glGetProgramPipelineInfoLogEXT,
        glGetProgramPipelineivEXT,
        glIsProgramPipelineEXT,
        glProgramParameteriEXT,
        glProgramUniform1fEXT,
        glProgramUniform1fvEXT,
        glProgramUniform1iEXT,
        glProgramUniform1ivEXT,
        glProgramUniform2fEXT,
        glProgramUniform2fvEXT,
        glProgramUniform2iEXT,
        glProgramUniform2ivEXT,
        glProgramUniform3fEXT,
        glProgramUniform3fvEXT,
        glProgramUniform3iEXT,
        glProgramUniform3ivEXT,
        glProgramUniform4fEXT,
        glProgramUniform4fvEXT,
        glProgramUniform4iEXT,
        glProgramUniform4ivEXT,
        glProgramUniformMatrix2fvEXT,
        glProgramUniformMatrix3fvEXT,
        glProgramUniformMatrix4fvEXT,
        glUseProgramStagesEXT,
        glValidateProgramPipelineEXT,
        glProgramUniform1uiEXT,
        glProgramUniform2uiEXT,
        glProgramUniform3uiEXT,
        glProgramUniform4uiEXT,
        glProgramUniform1uivEXT,
        glProgramUniform2uivEXT,
        glProgramUniform3uivEXT,
        glProgramUniform4uivEXT,
        glProgramUniformMatrix2x3fvEXT,
        glProgramUniformMatrix3x2fvEXT,
        glProgramUniformMatrix2x4fvEXT,
        glProgramUniformMatrix4x2fvEXT,
        glProgramUniformMatrix3x4fvEXT,
        glProgramUniformMatrix4x3fvEXT,
        glFramebufferFetchBarrierEXT,
        glFramebufferPixelLocalStorageSizeEXT,
        glGetFramebufferPixelLocalStorageSizeEXT,
        glClearPixelLocalStorageuiEXT,
        glTexPageCommitmentARB,
        glPatchParameteriEXT,
        glTexParameterIivEXT,
        glTexParameterIuivEXT,
        glGetTexParameterIivEXT,
        glGetTexParameterIuivEXT,
        glSamplerParameterIivEXT,
        glSamplerParameterIuivEXT,
        glGetSamplerParameterIivEXT,
        glGetSamplerParameterIuivEXT,
        glTexBufferEXT,
        glTexBufferRangeEXT,
        glTexStorage1DEXT,
        glTexStorage2DEXT,
        glTexStorage3DEXT,
        glTextureStorage1DEXT,
        glTextureStorage2DEXT,
        glTextureStorage3DEXT,
        glTextureViewEXT,
        glAcquireKeyedMutexWin32EXT,
        glReleaseKeyedMutexWin32EXT,
        glWindowRectanglesEXT,
        glFramebufferTexture2DDownsampleIMG,
        glFramebufferTextureLayerDownsampleIMG,
        glRenderbufferStorageMultisampleIMG,
        glFramebufferTexture2DMultisampleIMG,
        glApplyFramebufferAttachmentCMAAINTEL,
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
        glDebugMessageControlKHR,
        glDebugMessageInsertKHR,
        glDebugMessageCallbackKHR,
        glGetDebugMessageLogKHR,
        glGetPointervKHR,
        glPushDebugGroupKHR,
        glPopDebugGroupKHR,
        glObjectLabelKHR,
        glGetObjectLabelKHR,
        glObjectPtrLabelKHR,
        glGetObjectPtrLabelKHR,
        glMaxShaderCompilerThreadsKHR,
        glGetGraphicsResetStatusKHR,
        glReadnPixelsKHR,
        glGetnUniformfvKHR,
        glGetnUniformivKHR,
        glGetnUniformuivKHR,
        glAlphaToCoverageDitherControlNV,
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
        glBeginConditionalRenderNV,
        glEndConditionalRenderNV,
        glSubpixelPrecisionBiasNV,
        glConservativeRasterParameteriNV,
        glCopyBufferSubDataNV,
        glCoverageMaskNV,
        glCoverageOperationNV,
        glDrawBuffersNV,
        glDrawArraysInstancedNV,
        glDrawElementsInstancedNV,
        glDrawVkImageNV,
        glGetVkProcAddrNV,
        glWaitVkSemaphoreNV,
        glSignalVkSemaphoreNV,
        glSignalVkFenceNV,
        glDeleteFencesNV,
        glGenFencesNV,
        glIsFenceNV,
        glTestFenceNV,
        glGetFenceivNV,
        glFinishFenceNV,
        glSetFenceNV,
        glFragmentCoverageColorNV,
        glBlitFramebufferNV,
        glCoverageModulationTableNV,
        glGetCoverageModulationTableNV,
        glCoverageModulationNV,
        glRenderbufferStorageMultisampleNV,
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
        glProgramUniform4ui64vNV,
        glVertexAttribDivisorNV,
        glGetInternalformatSampleivNV,
        glGetMemoryObjectDetachedResourcesuivNV,
        glResetMemoryObjectParameterNV,
        glTexAttachMemoryNV,
        glBufferAttachMemoryNV,
        glTextureAttachMemoryNV,
        glNamedBufferAttachMemoryNV,
        glDrawMeshTasksNV,
        glDrawMeshTasksIndirectNV,
        glMultiDrawMeshTasksIndirectNV,
        glUniformMatrix2x3fvNV,
        glUniformMatrix3x2fvNV,
        glUniformMatrix2x4fvNV,
        glUniformMatrix4x2fvNV,
        glUniformMatrix3x4fvNV,
        glUniformMatrix4x3fvNV,
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
        glPolygonModeNV,
        glReadBufferNV,
        glFramebufferSampleLocationsfvNV,
        glNamedFramebufferSampleLocationsfvNV,
        glResolveDepthValuesNV,
        glScissorExclusiveArrayvNV,
        glScissorExclusiveNV,
        glTexImage3DNV,
        glTexSubImage3DNV,
        glCopyTexSubImage3DNV,
        glCompressedTexImage3DNV,
        glCompressedTexSubImage3DNV,
        glFramebufferTextureLayerNV,
        glTextureBarrierNV,
        glViewportArrayvNV,
        glViewportIndexedfNV,
        glViewportIndexedfvNV,
        glScissorArrayvNV,
        glScissorIndexedNV,
        glScissorIndexedvNV,
        glDepthRangeArrayfvNV,
        glDepthRangeIndexedfNV,
        glGetFloati_vNV,
        glEnableiNV,
        glDisableiNV,
        glIsEnablediNV,
        glViewportSwizzleNV,
        glCopyImageSubDataOES,
        glEnableiOES,
        glDisableiOES,
        glBlendEquationiOES,
        glBlendEquationSeparateiOES,
        glBlendFunciOES,
        glBlendFuncSeparateiOES,
        glColorMaskiOES,
        glIsEnablediOES,
        glDrawElementsBaseVertexOES,
        glDrawRangeElementsBaseVertexOES,
        glDrawElementsInstancedBaseVertexOES,
        glMultiDrawElementsBaseVertexOES,
        glEGLImageTargetTexture2DOES,
        glEGLImageTargetRenderbufferStorageOES,
        glFramebufferTextureOES,
        glGetProgramBinaryOES,
        glProgramBinaryOES,
        glMapBufferOES,
        glUnmapBufferOES,
        glGetBufferPointervOES,
        glPrimitiveBoundingBoxOES,
        glMinSampleShadingOES,
        glPatchParameteriOES,
        glTexImage3DOES,
        glTexSubImage3DOES,
        glCopyTexSubImage3DOES,
        glCompressedTexImage3DOES,
        glCompressedTexSubImage3DOES,
        glFramebufferTexture3DOES,
        glTexParameterIivOES,
        glTexParameterIuivOES,
        glGetTexParameterIivOES,
        glGetTexParameterIuivOES,
        glSamplerParameterIivOES,
        glSamplerParameterIuivOES,
        glGetSamplerParameterIivOES,
        glGetSamplerParameterIuivOES,
        glTexBufferOES,
        glTexBufferRangeOES,
        glTexStorage3DMultisampleOES,
        glTextureViewOES,
        glBindVertexArrayOES,
        glDeleteVertexArraysOES,
        glGenVertexArraysOES,
        glIsVertexArrayOES,
        glViewportArrayvOES,
        glViewportIndexedfOES,
        glViewportIndexedfvOES,
        glScissorArrayvOES,
        glScissorIndexedOES,
        glScissorIndexedvOES,
        glDepthRangeArrayfvOES,
        glDepthRangeIndexedfOES,
        glGetFloati_vOES,
        glFramebufferTextureMultiviewOVR,
        glFramebufferTextureMultisampleMultiviewOVR,
        glAlphaFuncQCOM,
        glGetDriverControlsQCOM,
        glGetDriverControlStringQCOM,
        glEnableDriverControlQCOM,
        glDisableDriverControlQCOM,
        glExtGetTexturesQCOM,
        glExtGetBuffersQCOM,
        glExtGetRenderbuffersQCOM,
        glExtGetFramebuffersQCOM,
        glExtGetTexLevelParameterivQCOM,
        glExtTexObjectStateOverrideiQCOM,
        glExtGetTexSubImageQCOM,
        glExtGetBufferPointervQCOM,
        glExtGetShadersQCOM,
        glExtGetProgramsQCOM,
        glExtIsProgramBinaryQCOM,
        glExtGetProgramBinarySourceQCOM,
        glFramebufferFoveationConfigQCOM,
        glFramebufferFoveationParametersQCOM,
        glFramebufferFetchBarrierQCOM,
        glTextureFoveationParametersQCOM,
        glStartTilingQCOM,
        glEndTilingQCOM;

    /** When true, {@link GLES20} is supported. */
    public final boolean GLES20;
    /** When true, {@link GLES30} is supported. */
    public final boolean GLES30;
    /** When true, {@link GLES31} is supported. */
    public final boolean GLES31;
    /** When true, {@link GLES32} is supported. */
    public final boolean GLES32;
    /** When true, {@link AMDCompressed3DCTexture} is supported. */
    public final boolean GL_AMD_compressed_3DC_texture;
    /** When true, {@link AMDCompressedATCTexture} is supported. */
    public final boolean GL_AMD_compressed_ATC_texture;
    /** When true, {@link AMDFramebufferMultisampleAdvanced} is supported. */
    public final boolean GL_AMD_framebuffer_multisample_advanced;
    /** When true, {@link AMDPerformanceMonitor} is supported. */
    public final boolean GL_AMD_performance_monitor;
    /** When true, {@link AMDProgramBinaryZ400} is supported. */
    public final boolean GL_AMD_program_binary_Z400;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ANDROID/ANDROID_extension_pack_es31a.txt">ANDROID_extension_pack_es31a</a> extension is supported.
     * 
     * <p>This extension changes little functionality directly. Instead it serves to roll up the 20 extensions it requires, allowing applications to check for
     * all of them at once, and enable all of their shading language features with a single #extension statement. The Android platform provides special
     * support outside of OpenGL ES to help applications target this set of extensions.</p>
     * 
     * <p>In addition, this extension ensures support for images, shader storage buffers, and atomic counters in fragment shaders. In unextended OpenGL ES the
     * minimum value of the relevant implementation-defined limits is zero; this extension raises these minimums to match the minimums for compute shaders.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_ANDROID_extension_pack_es31a;
    /** When true, {@link ANGLEDepthTexture} is supported. */
    public final boolean GL_ANGLE_depth_texture;
    /** When true, {@link ANGLEFramebufferBlit} is supported. */
    public final boolean GL_ANGLE_framebuffer_blit;
    /** When true, {@link ANGLEFramebufferMultisample} is supported. */
    public final boolean GL_ANGLE_framebuffer_multisample;
    /** When true, {@link ANGLEInstancedArrays} is supported. */
    public final boolean GL_ANGLE_instanced_arrays;
    /** When true, {@link ANGLEPackReverseRowOrder} is supported. */
    public final boolean GL_ANGLE_pack_reverse_row_order;
    /** When true, {@link ANGLEProgramBinary} is supported. */
    public final boolean GL_ANGLE_program_binary;
    /** When true, {@link ANGLETextureCompressionDXT1} is supported. */
    public final boolean GL_ANGLE_texture_compression_dxt1;
    /** When true, {@link ANGLETextureCompressionDXT3} is supported. */
    public final boolean GL_ANGLE_texture_compression_dxt3;
    /** When true, {@link ANGLETextureCompressionDXT5} is supported. */
    public final boolean GL_ANGLE_texture_compression_dxt5;
    /** When true, {@link ANGLETextureUsage} is supported. */
    public final boolean GL_ANGLE_texture_usage;
    /** When true, {@link ANGLETranslatedShaderSource} is supported. */
    public final boolean GL_ANGLE_translated_shader_source;
    /** When true, {@link APPLEClipDistance} is supported. */
    public final boolean GL_APPLE_clip_distance;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_color_buffer_packed_float.txt">APPLE_color_buffer_packed_float</a> extension is supported.
     * 
     * <p>This extension allows two packed floating point formats R11F_G11F_B10F and as RGB9_E5 defined in APPLE_texture_packed_float or OpenGL ES 3.0 or to be
     * rendered to via framebuffer objects.</p>
     * 
     * <p>Requires {@link EXTColorBufferHalfFloat EXT_color_buffer_half_float} and {@link GLES30 GLES 3.0} or {@link APPLETexturePackedFloat APPLE_texture_packed_float}.</p>
     */
    public final boolean GL_APPLE_color_buffer_packed_float;
    /** When true, {@link APPLECopyTextureLevels} is supported. */
    public final boolean GL_APPLE_copy_texture_levels;
    /** When true, {@link APPLEFramebufferMultisample} is supported. */
    public final boolean GL_APPLE_framebuffer_multisample;
    /** When true, {@link APPLERGB422} is supported. */
    public final boolean GL_APPLE_rgb_422;
    /** When true, {@link APPLESync} is supported. */
    public final boolean GL_APPLE_sync;
    /** When true, {@link APPLETextureFormatBGRA8888} is supported. */
    public final boolean GL_APPLE_texture_format_BGRA8888;
    /** When true, {@link APPLETextureMaxLevel} is supported. */
    public final boolean GL_APPLE_texture_max_level;
    /** When true, {@link APPLETexturePackedFloat} is supported. */
    public final boolean GL_APPLE_texture_packed_float;
    /** When true, {@link ARMMaliProgramBinary} is supported. */
    public final boolean GL_ARM_mali_program_binary;
    /** When true, {@link ARMMaliShaderBinary} is supported. */
    public final boolean GL_ARM_mali_shader_binary;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_rgba8.txt">ARM_rgba8</a> extension is supported.
     * 
     * <p>This extension enables a RGBA8 renderbuffer storage format. It is similar to OES_rgb8_rgba8, but only exposes RGBA8.</p>
     * 
     * <p>Requires {@link GLES20 GLES 2.0}.</p>
     */
    public final boolean GL_ARM_rgba8;
    /** When true, {@link ARMShaderFramebufferFetch} is supported. */
    public final boolean GL_ARM_shader_framebuffer_fetch;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_shader_framebuffer_fetch_depth_stencil.txt">ARM_shader_framebuffer_fetch_depth_stencil</a> extension is supported.
     * 
     * <p>Existing extensions, such as EXT_shader_framebuffer_fetch, allow fragment shaders to read existing framebuffer color data as input. This enables
     * use-cases such as programmable blending, and other operations that may not be possible to implement with fixed-function blending.</p>
     * 
     * <p>This extension adds similar capabilities for depth and stencil values.</p>
     * 
     * <p>One use-case for this is soft depth-blending of particles. Normally, this would require two render passes: one that writes out the depth values of the
     * background geometry to a depth texture, and one that renders the particles while reading from the depth texture to do the blending. This extension
     * allows this to be done in a single pass.</p>
     * 
     * <p>Requires {@link GLES20 GLES 2.0}.</p>
     */
    public final boolean GL_ARM_shader_framebuffer_fetch_depth_stencil;
    /** When true, {@link DMPProgramBinary} is supported. */
    public final boolean GL_DMP_program_binary;
    /** When true, {@link DMPShaderBinary} is supported. */
    public final boolean GL_DMP_shader_binary;
    /** When true, {@link EXTBaseInstance} is supported. */
    public final boolean GL_EXT_base_instance;
    /** When true, {@link EXTBlendFuncExtended} is supported. */
    public final boolean GL_EXT_blend_func_extended;
    /** When true, {@link EXTBlendMinmax} is supported. */
    public final boolean GL_EXT_blend_minmax;
    /** When true, {@link EXTBufferStorage} is supported. */
    public final boolean GL_EXT_buffer_storage;
    /** When true, {@link EXTClearTexture} is supported. */
    public final boolean GL_EXT_clear_texture;
    /** When true, {@link EXTClipControl} is supported. */
    public final boolean GL_EXT_clip_control;
    /** When true, {@link EXTClipCullDistance} is supported. */
    public final boolean GL_EXT_clip_cull_distance;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_color_buffer_float.txt">EXT_color_buffer_float</a> extension is supported.
     * 
     * <p>This extension allows a variety of floating point formats to be rendered to via framebuffer objects.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_EXT_color_buffer_float;
    /** When true, {@link EXTColorBufferHalfFloat} is supported. */
    public final boolean GL_EXT_color_buffer_half_float;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_compressed_ETC1_RGB8_sub_texture.txt">EXT_compressed_ETC1_RGB8_sub_texture</a> extension is supported. */
    public final boolean GL_EXT_compressed_ETC1_RGB8_sub_texture;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_conservative_depth.txt">EXT_conservative_depth</a> extension is supported.
     * 
     * <p>There is a common optimization for hardware accelerated implementation of OpenGL ES which relies on an early depth test to be run before the fragment
     * shader so that the shader evaluation can be skipped if the fragment ends up being discarded because it is occluded.</p>
     * 
     * <p>This optimization does not affect the final rendering, and is typically possible when the fragment does not change the depth programmatically. (i.e.:
     * it does not write to the built-in {@code gl_FragDepth} output). There are, however a class of operations on the depth in the shader which could still
     * be performed while allowing the early depth test to operate.</p>
     * 
     * <p>This extension allows the application to pass enough information to the GL implementation to activate such optimizations safely.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_EXT_conservative_depth;
    /** When true, {@link EXTCopyImage} is supported. */
    public final boolean GL_EXT_copy_image;
    /** When true, {@link EXTDebugLabel} is supported. */
    public final boolean GL_EXT_debug_label;
    /** When true, {@link EXTDebugMarker} is supported. */
    public final boolean GL_EXT_debug_marker;
    /** When true, {@link EXTDepthClamp} is supported. */
    public final boolean GL_EXT_depth_clamp;
    /** When true, {@link EXTDiscardFramebuffer} is supported. */
    public final boolean GL_EXT_discard_framebuffer;
    /** When true, {@link EXTDisjointTimerQuery} is supported. */
    public final boolean GL_EXT_disjoint_timer_query;
    /** When true, {@link EXTDrawBuffers} is supported. */
    public final boolean GL_EXT_draw_buffers;
    /** When true, {@link EXTDrawBuffersIndexed} is supported. */
    public final boolean GL_EXT_draw_buffers_indexed;
    /** When true, {@link EXTDrawElementsBaseVertex} is supported. */
    public final boolean GL_EXT_draw_elements_base_vertex;
    /** When true, {@link EXTDrawInstanced} is supported. */
    public final boolean GL_EXT_draw_instanced;
    /** When true, {@link EXTDrawTransformFeedback} is supported. */
    public final boolean GL_EXT_draw_transform_feedback;
    /**
     * This extension adds functionality to that provided by {@link OESEGLImage OES_EGL_image} in order to support EGLImage 2D arrays. It extends the existing
     * {@code EGLImageTargetTexture2DOES} entry point from {@code OES_EGL_image}. Render buffers are not extended to include array support.
     * 
     * <p>{@code EGLImage} 2D arrays can be created using extended versions of {@code eglCreateImageKHR}. For example, {@code EGL_ANDROID_image_native_buffer}
     * can import image array native buffers on devices where such native buffers can be created.</p>
     */
    public final boolean GL_EXT_EGL_image_array;
    /**
     * This extension builds on {@link OESEGLImageExternal OES_EGL_image_external}, which only allows a external images to use a single clamping wrap mode: {@link GLES20#GL_CLAMP_TO_EDGE CLAMP_TO_EDGE}. This
     * extension relaxes that restriction, allowing wrap modes {@link GLES20#GL_REPEAT REPEAT} and {@link GLES20#GL_MIRRORED_REPEAT MIRRORED_REPEAT}. If {@link OESTextureBorderClamp OES_texture_border_clamp} is supported, then
     * {@link GLES32#GL_CLAMP_TO_BORDER CLAMP_TO_BORDER} is also allowed.
     * 
     * <p>This extension similarly adds to the capabilities of {@code OES_EGL_image_external_essl3}, allowing the same additional wrap modes.</p>
     * 
     * <p>Since external images can be non-RGB, this extension clarifies how border color values are specified for non-RGB external images.</p>
     */
    public final boolean GL_EXT_EGL_image_external_wrap_modes;
    /** When true, {@link EXTEGLImageStorage} is supported. */
    public final boolean GL_EXT_EGL_image_storage;
    /** When true, {@link EXTExternalBuffer} is supported. */
    public final boolean GL_EXT_external_buffer;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_float_blend.txt">EXT_float_blend</a> extension is supported.
     * 
     * <p>This extension expands upon the EXT_color_buffer_float extension to allow support for blending with 32-bit floating-point color buffers.</p>
     * 
     * <p>Requires {@link #GL_EXT_color_buffer_float EXT_color_buffer_float}.</p>
     */
    public final boolean GL_EXT_float_blend;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_geometry_shader.txt">EXT_geometry_point_size</a> extension is supported. */
    public final boolean GL_EXT_geometry_point_size;
    /** When true, {@link EXTGeometryShader} is supported. */
    public final boolean GL_EXT_geometry_shader;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_gpu_shader5.txt">EXT_gpu_shader5</a> extension is supported.
     * 
     * <p>This extension provides a set of new features to the OpenGL ES Shading Language and related APIs to support capabilities of new GPUs, extending the
     * capabilities of version 3.10 of the OpenGL ES Shading Language. Shaders using the new functionality provided by this extension should enable this
     * functionality via the construct</p>
     * 
     * <pre><code>
     *     #extension GL_EXT_gpu_shader5 : require (or enable)</code></pre>
     * 
     * <p>This extension provides a variety of new features for all shader types, including:</p>
     * 
     * <ul>
     * <li>support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;</li>
     * <li>support for indexing into arrays of images and shader storage blocks using only constant integral expressions;</li>
     * <li>extending the uniform block capability to allow shaders to index into an array of uniform blocks;</li>
     * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
     * issues (which might cause cracking in tessellation);</li>
     * <li>new built-in functions supporting:
     * 
     * <ul>
     * <li>fused floating-point multiply-add operations;</li>
     * </ul></li>
     * <li>extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
     * 
     * <ul>
     * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
     * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
     * </ul></li>
     * </ul>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_EXT_gpu_shader5;
    /** When true, {@link EXTInstancedArrays} is supported. */
    public final boolean GL_EXT_instanced_arrays;
    /** When true, {@link EXTMapBufferRange} is supported. */
    public final boolean GL_EXT_map_buffer_range;
    /** When true, {@link EXTMemoryObject} is supported. */
    public final boolean GL_EXT_memory_object;
    /** When true, {@link EXTMemoryObjectFD} is supported. */
    public final boolean GL_EXT_memory_object_fd;
    /** When true, {@link EXTMemoryObjectWin32} is supported. */
    public final boolean GL_EXT_memory_object_win32;
    /** When true, {@link EXTMultiDrawArrays} is supported. */
    public final boolean GL_EXT_multi_draw_arrays;
    /** When true, {@link EXTMultiDrawIndirect} is supported. */
    public final boolean GL_EXT_multi_draw_indirect;
    /** When true, {@link EXTMultisampleCompatibility} is supported. */
    public final boolean GL_EXT_multisample_compatibility;
    /** When true, {@link EXTMultisampledRenderToTexture} is supported. */
    public final boolean GL_EXT_multisampled_render_to_texture;
    /**
     * The {@code attachment} parameters for {@link EXTMultisampledRenderToTexture#glFramebufferTexture2DMultisampleEXT FramebufferTexture2DMultisampleEXT} is no longer required to be {@link GLES20#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}. The attachment parameter
     * now matches what is allowed in {@link GLES20#glFramebufferTexture2D FramebufferTexture2D}. This means values like {@code GL_COLOR_ATTACHMENTi}, {@link GLES20#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link GLES20#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, or
     * {@link GLES30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT} may be used. After the application has rendered into the mutisampled buffer, the application should be careful to not
     * trigger an implicit flush by performing a client side read of the buffer (readpixels, copyteximage, blitframebuffer, etc) before any subsequent
     * rendering which uses the contents of the buffer. This may cause the attachment to be downsampled before the following draw, which would potentially
     * cause corruption.
     */
    public final boolean GL_EXT_multisampled_render_to_texture2;
    /** When true, {@link EXTMultiviewDrawBuffers} is supported. */
    public final boolean GL_EXT_multiview_draw_buffers;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_tessellation_geometry_shader.txt">EXT_multiview_tessellation_geometry_shader</a> extension is supported.
     * 
     * <p>This extension removes one of the limitations of the {@code OVR_multiview} extension by allowing the use of tessellation control, tessellation
     * evaluation, and geometry shaders during multiview rendering. {@code OVR_multiview} by itself forbids the use of any of these shader types.</p>
     * 
     * <p>When using tessellation control, tessellation evaluation, and geometry shaders during multiview rendering, any such shader must use the
     * "{@code num_views}" layout qualifier provided by the matching shading language extension to specify a view count. The view count specified in these
     * shaders must match the count specified in the vertex shader. Additionally, the shading language extension allows these shaders to use the
     * {@code gl_ViewID_OVR} built-in to handle tessellation or geometry shader processing differently for each view.</p>
     * 
     * <p>{@code OVR_multiview2} extends {@code OVR_multiview} by allowing view-dependent values for any vertex attributes instead of just the position. This new
     * extension does not imply the availability of {@code OVR_multiview2}, but if both are available, view-dependent values for any vertex attributes are
     * also allowed in tessellation control, tessellation evaluation, and geometry shaders.</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2} and {@link OVRMultiview OVR_multiview}.</p>
     */
    public final boolean GL_EXT_multiview_tessellation_geometry_shader;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_texture_multisample.txt">EXT_multiview_texture_multisample</a> extension is supported.
     * 
     * <p>This extension removes one of the limitations of the {@code OVR_multiview} extension by allowing the use of multisample textures during multiview
     * rendering.</p>
     * 
     * <p>This is one of two extensions that allow multisampling when using {@code OVR_multiview}. Each supports one of the two different approaches to
     * multisampling in OpenGL ES:</p>
     * 
     * <p>OpenGL ES 3.1+ has explicit support for multisample texture types, such as {@link GLES31#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}. Applications can access the values of individual
     * samples and can explicitly "resolve" the samples of each pixel down to a single color.</p>
     * 
     * <p>The extension {@link EXTMultisampledRenderToTexture EXT_multisampled_render_to_texture} provides support for multisampled rendering to non-multisample texture types, such as
     * {@link GLES20#GL_TEXTURE_2D TEXTURE_2D}. The individual samples for each pixel are maintained internally by the implementation and can not be accessed directly by applications.
     * These samples are eventually resolved implicitly to a single color for each pixel.</p>
     * 
     * <p>This extension supports the first multisampling style with multiview rendering; the {@link OVRMultiviewMultisampledRenderToTexture OVR_multiview_multisampled_render_to_texture} extension
     * supports the second style. Note that support for one of these multiview extensions does not imply support for the other.</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2} and {@link OVRMultiview OVR_multiview}.</p>
     */
    public final boolean GL_EXT_multiview_texture_multisample;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_timer_query.txt">EXT_multiview_timer_query</a> extension is supported.
     * 
     * <p>This extension removes one of the limitations of the {@code OVR_multiview} extension by allowing the use of timer queries during multiview rendering.
     * {@code OVR_multiview} does not specify defined behavior for such usage (if {@link EXTDisjointTimerQuery EXT_disjoint_timer_query} is present).</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2} and {@link OVRMultiview OVR_multiview}.</p>
     */
    public final boolean GL_EXT_multiview_timer_query;
    /** When true, {@link EXTOcclusionQueryBoolean} is supported. */
    public final boolean GL_EXT_occlusion_query_boolean;
    /** When true, {@link EXTPolygonOffsetClamp} is supported. */
    public final boolean GL_EXT_polygon_offset_clamp;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
     * 
     * <p>This extension allows the fragment shader to control whether values in gl_SampleMaskIn[] reflect the coverage after application of the early depth and
     * stencil tests. This feature can be enabled with the following layout qualifier in the fragment shader:</p>
     * 
     * <pre><code>
     *     layout(post_depth_coverage) in;</code></pre>
     * 
     * <p>To use this feature, early fragment tests must also be enabled in the fragment shader via:</p>
     * 
     * <pre><code>
     *     layout(early_fragment_tests) in;</code></pre>
     * 
     * <p>Requires {@link #GL_OES_sample_variables OES_sample_variables}.</p>
     */
    public final boolean GL_EXT_post_depth_coverage;
    /** When true, {@link EXTPrimitiveBoundingBox} is supported. */
    public final boolean GL_EXT_primitive_bounding_box;
    /** When true, {@link EXTProtectedTextures} is supported. */
    public final boolean GL_EXT_protected_textures;
    /** When true, {@link EXTPVRTCSRGB} is supported. */
    public final boolean GL_EXT_pvrtc_sRGB;
    /** When true, {@link EXTRasterMultisample} is supported. */
    public final boolean GL_EXT_raster_multisample;
    /** When true, {@link EXTReadFormatBGRA} is supported. */
    public final boolean GL_EXT_read_format_bgra;
    /** When true, {@link EXTRenderSnorm} is supported. */
    public final boolean GL_EXT_render_snorm;
    /** When true, {@link EXTRobustness} is supported. */
    public final boolean GL_EXT_robustness;
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
     * This extension provides new built-in functions to compute the composite of a set of boolean conditions across a group of shader invocations. These
     * composite results may be used to execute shaders more efficiently on a single-instruction multiple-data (SIMD) processor. The set of shader invocations
     * across which boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader
     * invocations are assigned to such sets. In particular, the set of shader invocations has no necessary relationship with the compute shader local work
     * group -- a pair of shader invocations in a single compute shader work group may end up in different sets used by these built-ins.
     * 
     * <p>Compute shaders operate on an explicitly specified group of threads (a local work group), but many implementations of OpenGL ES 3.0 will even group
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
     * is true and leave the other invocations dormant. Once do_fast_path() returns, it might call do_general_path() for invocations where {@code condition}
     * is false and leave the other invocations dormant. In this case, the shader executes *both* the fast and the general path and might be better off just
     * using the general path for all invocations.</p>
     * 
     * <p>This extension provides the ability to avoid divergent execution by evaluting a condition across an entire SIMD invocation group using code like:</p>
     * 
     * <pre><code>
     * if (allInvocationsEXT(condition)) {
     *     result = do_fast_path();
     * } else {
     *     result = do_general_path();
     * }</code></pre>
     * 
     * <p>The built-in function allInvocationsEXT() will return the same value for all invocations in the group, so the group will either execute do_fast_path()
     * or do_general_path(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation
     * of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result
     * (do_fast_path) while others require a larger number (do_general_path). In another example, shader code might want to evaluate a complex function
     * (do_general_path) that can be greatly simplified when assuming a specific value for one of its inputs (do_fast_path).</p>
     */
    public final boolean GL_EXT_shader_group_vote;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_implicit_conversions.txt">EXT_shader_implicit_conversions</a> extension is supported.
     * 
     * <p>This extension provides support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and
     * function overloading infrastructure to support new data types introduced by other extensions.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_EXT_shader_implicit_conversions;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_integer_mix.txt">EXT_shader_integer_mix</a> extension is supported.
     * 
     * <p>GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
     * extension extends mix() to select between int, uint, and bool components.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_EXT_shader_integer_mix;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_io_blocks.txt">EXT_shader_io_blocks</a> extension is supported.
     * 
     * <p>This extension extends the functionality of interface blocks to support input and output interfaces in the OpenGL ES Shading Language.</p>
     * 
     * <p>Input and output interface blocks are used for forming the interfaces between vertex, tessellation control, tessellation evaluation, geometry and
     * fragment shaders. This accommodates passing arrays between stages, which otherwise would require multi-dimensional array support for tessellation
     * control outputs and for tessellation control, tessellation evaluation, and geometry shader inputs.</p>
     * 
     * <p>This extension provides support for application defined interface blocks which are used for passing application-specific information between shader
     * stages.</p>
     * 
     * <p>This extension moves the built-in "per-vertex" in/out variables to a new built-in gl_PerVertex block. This is necessary for tessellation and geometry
     * shaders which require a separate instance for each vertex, but it can also be useful for vertex shaders.</p>
     * 
     * <p>Finally, this extension allows the redeclaration of the gl_PerVertex block in order to reduce the set of variables that must be passed between shaders.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_EXT_shader_io_blocks;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_non_constant_global_initializers.txt">EXT_shader_non_constant_global_initializers</a> extension is supported.
     * 
     * <p>This extension adds the ability to use non-constant initializers for global variables in the OpenGL ES Shading Language specifications. This
     * functionality is already present in the OpenGL Shading language specification.</p>
     */
    public final boolean GL_EXT_shader_non_constant_global_initializers;
    /** When true, {@link EXTShaderPixelLocalStorage} is supported. */
    public final boolean GL_EXT_shader_pixel_local_storage;
    /** When true, {@link EXTShaderPixelLocalStorage2} is supported. */
    public final boolean GL_EXT_shader_pixel_local_storage2;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_texture_lod.txt">EXT_shader_texture_lod</a> extension is supported.
     * 
     * <p>This extension adds additional texture functions to the OpenGL ES Shading Language which provide the shader writer with explicit control of LOD.</p>
     * 
     * <p>Mipmap texture fetches and anisotropic texture fetches require implicit derivatives to calculate rho, lambda and/or the line of anisotropy. These
     * implicit derivatives will be undefined for texture fetches occurring inside non-uniform control flow or for vertex shader texture fetches, resulting in
     * undefined texels.</p>
     * 
     * <p>The additional texture functions introduced with this extension provide explicit control of LOD (isotropic texture functions) or provide explicit
     * derivatives (anisotropic texture functions).</p>
     * 
     * <p>Anisotropic texture functions return defined texels for mipmap texture fetches or anisotropic texture fetches, even inside non-uniform control flow.
     * Isotropic texture functions return defined texels for mipmap texture fetches, even inside non-uniform control flow. However, isotropic texture
     * functions return undefined texels for anisotropic texture fetches.</p>
     * 
     * <p>The existing isotropic vertex texture functions:</p>
     * 
     * <pre><code>
     *     vec4 texture2DLodEXT(sampler2D sampler,
     *                          vec2 coord,
     *                          float lod);
     *     vec4 texture2DProjLodEXT(sampler2D sampler,
     *                              vec3 coord,
     *                              float lod);
     *     vec4 texture2DProjLodEXT(sampler2D sampler,
     *                              vec4 coord,
     *                              float lod);
     * 
     *     vec4 textureCubeLodEXT(samplerCube sampler,
     *                            vec3 coord,
     *                            float lod);</code></pre>
     * 
     * <p>are added to the built-in functions for fragment shaders with "EXT" suffix appended.</p>
     * 
     * <p>New anisotropic texture functions, providing explicit derivatives:</p>
     * 
     * <pre><code>
     *     vec4 texture2DGradEXT(sampler2D sampler,
     *                           vec2 P,
     *                           vec2 dPdx,
     *                           vec2  dPdy);
     *     vec4 texture2DProjGradEXT(sampler2D sampler,
     *                               vec3 P,
     *                               vec2 dPdx,
     *                               vec2 dPdy);
     *     vec4 texture2DProjGradEXT(sampler2D sampler,
     *                               vec4 P,
     *                               vec2 dPdx,
     *                               vec2 dPdy);
     * 
     *     vec4 textureCubeGradEXT(samplerCube sampler,
     *                             vec3 P,
     *                             vec3 dPdx,
     *                             vec3 dPdy);</code></pre>
     * 
     * <p>are added to the built-in functions for vertex shaders and fragment shaders.</p>
     */
    public final boolean GL_EXT_shader_texture_lod;
    /** When true, {@link EXTShadowSamplers} is supported. */
    public final boolean GL_EXT_shadow_samplers;
    /** When true, {@link EXTSparseTexture} is supported. */
    public final boolean GL_EXT_sparse_texture;
    /**
     * This extension builds on the EXT_sparse_texture extension, providing the following new functionality:
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
     * be requested by leaving {@link EXTSparseTexture#GL_VIRTUAL_PAGE_SIZE_INDEX_EXT VIRTUAL_PAGE_SIZE_INDEX_EXT} at its initial value (0).</li>
     * <li>Support for creating sparse multisample and multisample array textures is added. However, the virtual page sizes for such textures remain fully
     * implementation-dependent.</li>
     * </ul>
     * 
     * <p>Requires {@link EXTSparseTexture EXT_sparse_texture}.</p>
     */
    public final boolean GL_EXT_sparse_texture2;
    /** When true, {@link EXTSRGB} is supported. */
    public final boolean GL_EXT_sRGB;
    /** When true, {@link EXTSRGBWriteControl} is supported. */
    public final boolean GL_EXT_sRGB_write_control;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_tessellation_shader.txt">EXT_tessellation_point_size</a> extension is supported. */
    public final boolean GL_EXT_tessellation_point_size;
    /** When true, {@link EXTTessellationShader} is supported. */
    public final boolean GL_EXT_tessellation_shader;
    /** When true, {@link EXTTextureBorderClamp} is supported. */
    public final boolean GL_EXT_texture_border_clamp;
    /** When true, {@link EXTTextureBuffer} is supported. */
    public final boolean GL_EXT_texture_buffer;
    /** When true, {@link EXTTextureCompressionASTCDecodeMode} is supported. */
    public final boolean GL_EXT_texture_compression_astc_decode_mode;
    /** When true, {@link EXTTextureCompressionBPTC} is supported. */
    public final boolean GL_EXT_texture_compression_bptc;
    /** When true, {@link EXTTextureCompressionDXT1} is supported. */
    public final boolean GL_EXT_texture_compression_dxt1;
    /** When true, {@link EXTTextureCompressionRGTC} is supported. */
    public final boolean GL_EXT_texture_compression_rgtc;
    /** When true, {@link EXTTextureCompressionS3TC} is supported. */
    public final boolean GL_EXT_texture_compression_s3tc;
    /** When true, {@link EXTTextureCompressionS3TCSRGB} is supported. */
    public final boolean GL_EXT_texture_compression_s3tc_srgb;
    /** When true, {@link EXTTextureCubeMapArray} is supported. */
    public final boolean GL_EXT_texture_cube_map_array;
    /** When true, {@link EXTTextureFilterAnisotropic} is supported. */
    public final boolean GL_EXT_texture_filter_anisotropic;
    /** When true, {@link EXTTextureFilterMinmax} is supported. */
    public final boolean GL_EXT_texture_filter_minmax;
    /** When true, {@link EXTTextureFormatBGRA8888} is supported. */
    public final boolean GL_EXT_texture_format_BGRA8888;
    /** When true, {@link EXTTextureFormatSRGBOverride} is supported. */
    public final boolean GL_EXT_texture_format_sRGB_override;
    /** When true, {@link EXTTextureMirrorClampToEdge} is supported. */
    public final boolean GL_EXT_texture_mirror_clamp_to_edge;
    /** When true, {@link EXTTextureNorm16} is supported. */
    public final boolean GL_EXT_texture_norm16;
    /** When true, {@link EXTTextureRG} is supported. */
    public final boolean GL_EXT_texture_rg;
    /**
     * This extension adds support for various shadow sampler types with texture functions having interactions with the LOD of texture lookups.
     * 
     * <p>Modern shading languages support LOD queries for shadow sampler types, but until now the OpenGL Shading Language Specification has excluded multiple
     * texture function overloads involving LOD calculations with various shadow samplers. Shading languages for other APIs do support the equivalent
     * LOD-based texture sampling functions for these types which has made porting between those shading languages to GLSL cumbersome and has required the
     * usage of sub-optimal workarounds.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0} and {@code EXT_gpu_shader4} or equivalent functionality.</p>
     */
    public final boolean GL_EXT_texture_shadow_lod;
    /** When true, {@link EXTTextureSRGBDecode} is supported. */
    public final boolean GL_EXT_texture_sRGB_decode;
    /** When true, {@link EXTTextureSRGBR8} is supported. */
    public final boolean GL_EXT_texture_sRGB_R8;
    /** When true, {@link EXTTextureSRGBRG8} is supported. */
    public final boolean GL_EXT_texture_sRGB_RG8;
    /** When true, {@link EXTTextureStorage} is supported. */
    public final boolean GL_EXT_texture_storage;
    /** When true, {@link EXTTextureType2101010REV} is supported. */
    public final boolean GL_EXT_texture_type_2_10_10_10_REV;
    /** When true, {@link EXTTextureView} is supported. */
    public final boolean GL_EXT_texture_view;
    /** When true, {@link EXTUnpackSubimage} is supported. */
    public final boolean GL_EXT_unpack_subimage;
    /** When true, {@link EXTWin32KeyedMutex} is supported. */
    public final boolean GL_EXT_win32_keyed_mutex;
    /** When true, {@link EXTWindowRectangles} is supported. */
    public final boolean GL_EXT_window_rectangles;
    /** When true, {@link EXTYUVTarget} is supported. */
    public final boolean GL_EXT_YUV_target;
    /** When true, {@link FJShaderBinaryGCCSO} is supported. */
    public final boolean GL_FJ_shader_binary_GCCSO;
    /** See {@link EXTTextureCompressionASTCDecodeMode EXT_texture_compression_astc_decode_mode}. */
    public final boolean GL_EXT_texture_compression_astc_decode_mode_rgb9e5;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GL_EXT_texture_query_lod.txt">GL_EXT_texture_query_lod</a> extension is supported.
     * 
     * <p>This extension adds a new set of fragment shader texture functions ({@code textureLOD}) that return the results of automatic level-of-detail
     * computations that would be performed if a texture lookup were performed.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_EXT_texture_query_lod;
    /** When true, {@link IMGFramebufferDownsample} is supported. */
    public final boolean GL_IMG_framebuffer_downsample;
    /** When true, {@link IMGMultisampledRenderToTexture} is supported. */
    public final boolean GL_IMG_multisampled_render_to_texture;
    /** When true, {@link IMGProgramBinary} is supported. */
    public final boolean GL_IMG_program_binary;
    /** When true, {@link IMGReadFormat} is supported. */
    public final boolean GL_IMG_read_format;
    /** When true, {@link IMGShaderBinary} is supported. */
    public final boolean GL_IMG_shader_binary;
    /** When true, {@link IMGTextureCompressionPVRTC} is supported. */
    public final boolean GL_IMG_texture_compression_pvrtc;
    /** When true, {@link IMGTextureCompressionPVRTC2} is supported. */
    public final boolean GL_IMG_texture_compression_pvrtc2;
    /** When true, {@link IMGTextureFilterCubic} is supported. */
    public final boolean GL_IMG_texture_filter_cubic;
    /** When true, {@link INTELBlackholeRender} is supported. */
    public final boolean GL_INTEL_blackhole_render;
    /** When true, {@link INTELConservativeRasterization} is supported. */
    public final boolean GL_INTEL_conservative_rasterization;
    /** When true, {@link INTELFramebufferCMAA} is supported. */
    public final boolean GL_INTEL_framebuffer_CMAA;
    /** When true, {@link INTELPerformanceQuery} is supported. */
    public final boolean GL_INTEL_performance_query;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_shader_integer_functions2.txt">INTEL_shader_integer_functions2</a> extension is supported.
     * 
     * <p>OpenCL and other GPU programming environments provides a number of useful functions operating on integer data. Many of these functions are supported by
     * specialized instructions various GPUs. Correct GLSL implementations for some of these functions are non-trivial. Recognizing open-coded versions of
     * these functions is often impractical. As a result, potential performance improvements go unrealized.</p>
     * 
     * <p>This extension makes available a number of functions that have specialized instruction support on Intel GPUs.</p>
     * 
     * <p>Requires GLSL ES 3.00.</p>
     */
    public final boolean GL_INTEL_shader_integer_functions2;
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
     * <p>This extension specifies the behavior of out-of-bounds buffer and array accesses. This is an improvement over the existing KHR_robustness extension
     * which states that the application should not crash, but that behavior is otherwise undefined. This extension specifies the access protection provided
     * by the GL to ensure that out-of-bounds accesses cannot read from or write to data not owned by the application. All accesses are contained within the
     * buffer object and program area they reference. These additional robustness guarantees apply to contexts created with the robust access flag set.</p>
     * 
     * <p>Requires {@link GLES20 GLES 2.0} and {@link KHRRobustness KHR_robustness}.</p>
     */
    public final boolean GL_KHR_robust_buffer_access_behavior;
    /** When true, {@link KHRRobustness} is supported. */
    public final boolean GL_KHR_robustness;
    /** When true, {@link KHRShaderSubgroup} is supported. */
    public final boolean GL_KHR_shader_subgroup;
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
    /** When true, {@link NVBindlessTexture} is supported. */
    public final boolean GL_NV_bindless_texture;
    /** When true, {@link NVBlendEquationAdvanced} is supported. */
    public final boolean GL_NV_blend_equation_advanced;
    /** When true, {@link NVBlendEquationAdvancedCoherent} is supported. */
    public final boolean GL_NV_blend_equation_advanced_coherent;
    /** When true, {@link NVBlendMinmaxFactor} is supported. */
    public final boolean GL_NV_blend_minmax_factor;
    /** When true, {@link NVClipSpaceWScaling} is supported. */
    public final boolean GL_NV_clip_space_w_scaling;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_compute_shader_derivatives.txt">NV_compute_shader_derivatives</a> extension is supported.
     * 
     * <p>This extension adds OpenGL ES API support for the OpenGL Shading Language (GLSL) extension {@code "NV_compute_shader_derivatives"}.</p>
     * 
     * <p>That extension, when enabled, allows applications to use derivatives in compute shaders. It adds compute shader support for explicit derivative
     * built-in functions like {@code dFdx()}, automatic derivative computation in texture lookup functions like {@code texture()}, use of the optional LOD
     * bias parameter to adjust the computed level of detail values in texture lookup functions, and the texture level of detail query function
     * {@code textureQueryLod()}.</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2}.</p>
     */
    public final boolean GL_NV_compute_shader_derivatives;
    /** When true, {@link NVConditionalRender} is supported. */
    public final boolean GL_NV_conditional_render;
    /** When true, {@link NVConservativeRaster} is supported. */
    public final boolean GL_NV_conservative_raster;
    /** When true, {@link NVConservativeRasterPreSnap} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap;
    /** When true, {@link NVConservativeRasterPreSnapTriangles} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap_triangles;
    /** When true, {@link NVCopyBuffer} is supported. */
    public final boolean GL_NV_copy_buffer;
    /** When true, {@link NVCoverageSample} is supported. */
    public final boolean GL_NV_coverage_sample;
    /** When true, {@link NVDepthNonlinear} is supported. */
    public final boolean GL_NV_depth_nonlinear;
    /** When true, {@link NVDrawBuffers} is supported. */
    public final boolean GL_NV_draw_buffers;
    /** When true, {@link NVDrawInstanced} is supported. */
    public final boolean GL_NV_draw_instanced;
    /** When true, {@link NVDrawVulkanImage} is supported. */
    public final boolean GL_NV_draw_vulkan_image;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_explicit_attrib_location.txt">NV_explicit_attrib_location</a> extension is supported.
     * 
     * <p>This extension provides a method to pre-assign attribute locations to named vertex shader inputs. This allows applications to globally assign a
     * particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute location without knowing how that attribute will be
     * named in any particular shader.</p>
     * 
     * <p>Requires {@link GLES20 GLES 2.0}.</p>
     */
    public final boolean GL_NV_explicit_attrib_location;
    /** When true, {@link NVFboColorAttachments} is supported. */
    public final boolean GL_NV_fbo_color_attachments;
    /** When true, {@link NVFence} is supported. */
    public final boolean GL_NV_fence;
    /** When true, {@link NVFillRectangle} is supported. */
    public final boolean GL_NV_fill_rectangle;
    /** When true, {@link NVFragmentCoverageToColor} is supported. */
    public final boolean GL_NV_fragment_coverage_to_color;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_shader_barycentric.txt">NV_fragment_shader_barycentric</a> extension is supported.
     * 
     * <p>This extension advertises OpenGL support for the OpenGL Shading Language (GLSL) extension {@code "NV_fragment_shader_barycentric"}, which provides
     * fragment shader built-in variables holding barycentric weight vectors that identify the location of the fragment within its primitive. Additionally,
     * the GLSL extension allows fragment the ability to read raw attribute values for each of the vertices of the primitive that produced the fragment.</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2}.</p>
     */
    public final boolean GL_NV_fragment_shader_barycentric;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_shader_interlock.txt">NV_fragment_shader_interlock</a> extension is supported.
     * 
     * <p>In unextended OpenGL 4.3 or OpenGL ES 3.1, applications may produce a large number of fragment shader invocations that perform loads and stores to
     * memory using image uniforms, atomic counter uniforms, buffer variables, or pointers. The order in which loads and stores to common addresses are
     * performed by different fragment shader invocations is largely undefined. For algorithms that use shader writes and touch the same pixels more than
     * once, one or more of the following techniques may be required to ensure proper execution ordering:</p>
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
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_NV_fragment_shader_interlock;
    /** When true, {@link NVFramebufferBlit} is supported. */
    public final boolean GL_NV_framebuffer_blit;
    /** When true, {@link NVFramebufferMixedSamples} is supported. */
    public final boolean GL_NV_framebuffer_mixed_samples;
    /** When true, {@link NVFramebufferMultisample} is supported. */
    public final boolean GL_NV_framebuffer_multisample;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_generate_mipmap_sRGB.txt">NV_generate_mipmap_sRGB</a> extension is supported.
     * 
     * <p>EXT_sRGB requires GenerateMipmap() to throw INVALID_OPERATION on textures with sRGB encoding. NV_generate_mipmap_sRGB lifts this restriction.</p>
     * 
     * <p>Requires {@link EXTSRGB EXT_sRGB}.</p>
     */
    public final boolean GL_NV_generate_mipmap_sRGB;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_geometry_shader_passthrough.txt">NV_geometry_shader_passthrough</a> extension is supported.
     * 
     * <p>Geometry shaders provide the ability for applications to process each primitive sent through the GL using a programmable shader. While geometry shaders
     * can be used to perform a number of different operations, including subdividing primitives and changing primitive type, one common use case treats
     * geometry shaders as largely "passthrough". In this use case, the bulk of the geometry shader code simply copies inputs from each vertex of the input
     * primitive to corresponding outputs in the vertices of the output primitive. Such shaders might also compute values for additional built-in or
     * user-defined per-primitive attributes (e.g., gl_Layer) to be assigned to all the vertices of the output primitive.</p>
     * 
     * <p>This extension provides a shading language abstraction to express such shaders without requiring explicit logic to manually copy attributes from input
     * vertices to output vertices. For example, consider the following simple geometry shader in unextended OpenGL:</p>
     * 
     * <pre><code>
     *       layout(triangles) in;
     *       layout(triangle_strip) out;
     *       layout(max_vertices=3) out;
     * 
     *       in Inputs {
     *         vec2 texcoord;
     *         vec4 baseColor;
     *       } v_in[];
     *       out Outputs {
     *         vec2 texcoord;
     *         vec4 baseColor;
     *       };
     * 
     *       void main()
     *       {
     *         int layer = compute_layer();
     *         for (int i = 0; i &lt; 3; i++) {
     *           gl_Position = gl_in[i].gl_Position;
     *           texcoord = v_in[i].texcoord;
     *           baseColor = v_in[i].baseColor;
     *           gl_Layer = layer;
     *           EmitVertex();
     *         }
     *       }</code></pre>
     * 
     * <p>In this shader, the inputs "gl_Position", "Inputs.texcoord", and "Inputs.baseColor" are simply copied from the input vertex to the corresponding output
     * vertex. The only "interesting" work done by the geometry shader is computing and emitting a gl_Layer value for the primitive.</p>
     * 
     * <p>The following geometry shader, using this extension, is equivalent:</p>
     * 
     * <pre><code>
     *       #extension GL_NV_geometry_shader_passthrough : require
     * 
     *       layout(triangles) in;
     *       // No output primitive layout qualifiers required.
     * 
     *       // Redeclare gl_PerVertex to pass through "gl_Position".
     *       layout(passthrough) in gl_PerVertex {
     *         vec4 gl_Position;
     *       };
     * 
     *       // Declare "Inputs" with "passthrough" to automatically copy members.
     *       layout(passthrough) in Inputs {
     *         vec2 texcoord;
     *         vec4 baseColor;
     *       };
     * 
     *       // No output block declaration required.
     * 
     *       void main()
     *       {
     *         // The shader simply computes and writes gl_Layer.  We don't
     *         // loop over three vertices or call EmitVertex().
     *         gl_Layer = compute_layer();
     *       }</code></pre>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_NV_geometry_shader_passthrough;
    /** When true, {@link NVGPUShader5} is supported. */
    public final boolean GL_NV_gpu_shader5;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_image_formats.txt">NV_image_formats</a> extension is supported.
     * 
     * <p>OpenGL ES 3.1 specifies a variety of formats required to be usable with texture images. This extension introduces the texture image formats missing for
     * parity with OpenGL 4.4.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_NV_image_formats;
    /** When true, {@link NVInstancedArrays} is supported. */
    public final boolean GL_NV_instanced_arrays;
    /** When true, {@link NVInternalformatSampleQuery} is supported. */
    public final boolean GL_NV_internalformat_sample_query;
    /** When true, {@link NVMemoryAttachment} is supported. */
    public final boolean GL_NV_memory_attachment;
    /** When true, {@link NVMeshShader} is supported. */
    public final boolean GL_NV_mesh_shader;
    /** When true, {@link NVNonSquareMatrices} is supported. */
    public final boolean GL_NV_non_square_matrices;
    /** When true, {@link NVPathRendering} is supported. */
    public final boolean GL_NV_path_rendering;
    /** When true, {@link NVPathRenderingSharedEdge} is supported. */
    public final boolean GL_NV_path_rendering_shared_edge;
    /** When true, {@link NVPolygonMode} is supported. */
    public final boolean GL_NV_polygon_mode;
    /** When true, {@link NVReadBuffer} is supported. */
    public final boolean GL_NV_read_buffer;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_buffer.txt">NV_read_buffer_front</a> extension is supported.
     * 
     * <p>Adds the ability to select the system-provided FRONT color buffer as the source for read operations when the system-provided framebuffer is bound and
     * contains both a front and back buffer.</p>
     * 
     * <p>Requires {@link NVReadBuffer NV_read_buffer}.</p>
     */
    public final boolean GL_NV_read_buffer_front;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_depth_stencil.txt">NV_read_depth</a> extension is supported.
     * 
     * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
     * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
     * 
     * <p>The NV_read_depth extension allows reading from the depth buffer using ReadPixels.</p>
     */
    public final boolean GL_NV_read_depth;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_depth_stencil.txt">NV_read_depth_stencil</a> extension is supported.
     * 
     * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
     * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
     * 
     * <p>The NV_read_depth_stencil extension allows reading from packed depth-stencil buffers using ReadPixels.</p>
     */
    public final boolean GL_NV_read_depth_stencil;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_depth_stencil.txt">NV_read_stencil</a> extension is supported.
     * 
     * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
     * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
     * 
     * <p>The NV_read_stencil extension allows reading from the stencil buffer using ReadPixels.</p>
     */
    public final boolean GL_NV_read_stencil;
    /** When true, {@link NVRepresentativeFragmentTest} is supported. */
    public final boolean GL_NV_representative_fragment_test;
    /** When true, {@link NVSampleLocations} is supported. */
    public final boolean GL_NV_sample_locations;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_sample_mask_override_coverage.txt">NV_sample_mask_override_coverage</a> extension is supported.
     * 
     * <p>This extension allows the fragment shader to control whether the gl_SampleMask output can enable samples that were not covered by the original
     * primitive, or that failed the early depth/stencil tests. This can be enabled by redeclaring the gl_SampleMask output with the "override_coverage"
     * layout qualifier:</p>
     * 
     * <pre><code>
     *     layout(override_coverage) out int gl_SampleMask[];</code></pre>
     * 
     * <p>Requires {@link #GL_OES_sample_variables OES_sample_variables}.</p>
     */
    public final boolean GL_NV_sample_mask_override_coverage;
    /** When true, {@link NVScissorExclusive} is supported. */
    public final boolean GL_NV_scissor_exclusive;
    /**
     * This extension provides GLSL built-in functions and assembly opcodes allowing shaders to perform a limited set of atomic read-modify-write operations
     * to buffer or texture memory with 16-bit floating point vector surface formats.
     * 
     * <p>Requires {@link NVGPUShader5 NV_gpu_shader5}.</p>
     */
    public final boolean GL_NV_shader_atomic_fp16_vector;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_noperspective_interpolation.txt">NV_shader_noperspective_interpolation</a> extension is supported.
     * 
     * <p>In OpenGL 3.0 and later, and in other APIs, there are three types of interpolation qualifiers that are available for fragment shader inputs: flat,
     * smooth, and noperspective. The 'flat' qualifier indicates that no interpolation should be used. This is mandatory for integer-type variables. The
     * 'smooth' qualifier indicates that interpolation should be performed in a perspective0correct manner. This is the default for floating-point type
     * variables. The 'noperspective' qualifier indicates that interpolation should be performed linearly in screen space.</p>
     * 
     * <p>While perspective-correct (smooth) and non-interpolated (flat) are the two types of interpolation that most commonly used, there are important use
     * cases for linear (noperspective) interpolation. In particular, in some work loads where screen-space aligned geometry is common, the use of linear
     * interpolation can result in performance and/or power improvements.</p>
     * 
     * <p>The smooth and flat interpolation qualifiers are already supported in OpenGL ES 3.0 and later. This extension adds support for noperspective
     * interpolation to OpenGL ES.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_NV_shader_noperspective_interpolation;
    /** When true, {@link NVShaderSubgroupPartitioned} is supported. */
    public final boolean GL_NV_shader_subgroup_partitioned;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_texture_footprint.txt">NV_shader_texture_footprint</a> extension is supported.
     * 
     * <p>This extension adds OpenGL API support for the OpenGL Shading Language (GLSL) extension {@code "NV_shader_texture_footprint"}. That extension adds a
     * new set of texture query functions ({@code "textureFootprint*NV"}) to GLSL. These built-in functions prepare to perform a filtered texture lookup based
     * on coordinates and other parameters passed in by the calling code. However, instead of returning data from the provided texture image, these query
     * functions instead return data identifying the <em>texture footprint</em> for an equivalent texture access. The texture footprint identifies a set of
     * texels that may be accessed in order to return a filtered result for the texture access.</p>
     * 
     * <p>The footprint itself is a structure that includes integer values that identify a small neighborhood of texels in the texture being accessed and a
     * bitfield that indicates which texels in that neighborhood would be used. Each bit in the returned bitfield identifies whether any texel in a small
     * aligned block of texels would be fetched by the texture lookup. The size of each block is specified by an access <em>granularity</em> provided by the
     * shader. The minimum granularity supported by this extension is 2x2 (for 2D textures) and 2x2x2 (for 3D textures); the maximum granularity is 256x256
     * (for 2D textures) or 64x32x32 (for 3D textures). Each footprint query returns the footprint from a single texture level. When using minification
     * filters that combine accesses from multiple mipmap levels, shaders must perform separate queries for the two levels accessed ("fine" and "coarse"). The
     * footprint query also returns a flag indicating if the texture lookup would access texels from only one mipmap level or from two neighboring levels.</p>
     * 
     * <p>This extension should be useful for multi-pass rendering operations that do an initial expensive rendering pass to produce a first image that is then
     * used as a texture for a second pass. If the second pass ends up accessing only portions of the first image (e.g., due to visibility), the work spent
     * rendering the non-accessed portion of the first image was wasted. With this feature, an application can limit this waste using an initial pass over the
     * geometry in the second image that performs a footprint query for each visible pixel to determine the set of pixels that it needs from the first image.
     * This pass would accumulate an aggregate footprint of all visible pixels into a separate "footprint texture" using shader atomics. Then, when rendering
     * the first image, the application can kill all shading work for pixels not in this aggregate footprint.</p>
     * 
     * <p>The implementation of this extension has a number of limitations. The texture footprint query functions are only supported for two- and
     * three-dimensional textures ({@link GLES20#GL_TEXTURE_2D TEXTURE_2D}, {@link GLES30#GL_TEXTURE_3D TEXTURE_3D}). Texture footprint evaluation only supports the {@link GLES20#GL_CLAMP_TO_EDGE CLAMP_TO_EDGE} wrap mode; results are undefined
     * for all other wrap modes. The implementation supports only a limited set of granularity values and does not support separate coverage information for
     * each texel in the original texture.</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2}.</p>
     */
    public final boolean GL_NV_shader_texture_footprint;
    /** When true, {@link NVShadowSamplersArray} is supported. */
    public final boolean GL_NV_shadow_samplers_array;
    /** When true, {@link NVShadowSamplersCube} is supported. */
    public final boolean GL_NV_shadow_samplers_cube;
    /** When true, {@link NVSRGBFormats} is supported. */
    public final boolean GL_NV_sRGB_formats;
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
    /** When true, {@link NVTextureArray} is supported. */
    public final boolean GL_NV_texture_array;
    /** When true, {@link NVTextureBarrier} is supported. */
    public final boolean GL_NV_texture_barrier;
    /** When true, {@link NVTextureBorderClamp} is supported. */
    public final boolean GL_NV_texture_border_clamp;
    /** When true, {@link NVTextureCompressionS3TC} is supported. */
    public final boolean GL_NV_texture_compression_s3tc;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_compression_s3tc_update.txt">NV_texture_compression_s3tc_update</a> extension is supported.
     * 
     * <p>This extension allows for full or partial image updates to a compressed 2D texture from an uncompressed texel data buffer using TexImage2D and
     * TexSubImage2D. Consquently, if a compressed internal format is used, all the restrictions associated with compressed textures will apply. These include
     * sub-image updates aligned to 4x4 pixel blocks and the restriction on usage as render targets.</p>
     * 
     * <p>Requires {@link NVTextureCompressionS3TC NV_texture_compression_s3tc}.</p>
     */
    public final boolean GL_NV_texture_compression_s3tc_update;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_npot_2D_mipmap.txt">NV_texture_npot_2D_mipmap</a> extension is supported.
     * 
     * <p>Conventional OpenGL ES 2.0 allows the use of non-power-of-two (NPOT) textures with the limitation that mipmap minification filters can not be used.
     * This extension relaxes this restriction and adds limited mipmap support for 2D NPOT textures.</p>
     * 
     * <p>With this extension, NPOT textures are specified and applied identically to mipmapped power-of-two 2D textures with the following limitations:</p>
     * 
     * <ul>
     * <li>The texture wrap modes must be CLAMP_TO_EDGE.</li>
     * <li>Coordinates used for texture sampling on an NPOT texture using a mipmapped minification filter must lie within the range [0,1]. Coordinate clamping
     * is not performed by the GL in this case, causing values outside this range to produce undefined results.</li>
     * </ul>
     */
    public final boolean GL_NV_texture_npot_2D_mipmap;
    /** When true, {@link NVViewportArray} is supported. */
    public final boolean GL_NV_viewport_array;
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
     * expected to be exported if GL_NV_viewport_array2 is supported. This extension includes the edits for those extensions, recast against the reorganized
     * OpenGL 4.3 specification.</p>
     * 
     * <p>Requires {@link NVViewportArray NV_viewport_array}, {@link EXTGeometryShader EXT_geometry_shader} and {@link #GL_EXT_shader_io_blocks EXT_shader_io_blocks}.</p>
     */
    public final boolean GL_NV_viewport_array2;
    /** When true, {@link NVViewportSwizzle} is supported. */
    public final boolean GL_NV_viewport_swizzle;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NVX/NVX_blend_equation_advanced_multi_draw_buffers.txt">NVX_blend_equation_advanced_multi_draw_buffers</a> extension is supported.
     * 
     * <p>This extension adds support for using advanced blend equations introduced with {@link NVBlendEquationAdvanced NV_blend_equation_advanced} (and standardized by
     * {@link KHRBlendEquationAdvanced KHR_blend_equation_advanced}) in conjunction with multiple draw buffers. The NV_blend_equation_advanced extension supports advanced blending
     * equations only when rending to a single color buffer using fragment color zero and throws and {@link GLES20#GL_INVALID_OPERATION INVALID_OPERATION} error when multiple draw buffers are
     * used. This extension removes this restriction.</p>
     * 
     * <p>Requires either {@link NVBlendEquationAdvanced NV_blend_equation_advanced} or {@link KHRBlendEquationAdvanced KHR_blend_equation_advanced}.</p>
     */
    public final boolean GL_NVX_blend_equation_advanced_multi_draw_buffers;
    /** When true, {@link OESCompressedETC1RGB8Texture} is supported. */
    public final boolean GL_OES_compressed_ETC1_RGB8_texture;
    /** When true, {@link OESCompressedPalettedTexture} is supported. */
    public final boolean GL_OES_compressed_paletted_texture;
    /** When true, {@link OESCopyImage} is supported. */
    public final boolean GL_OES_copy_image;
    /** When true, {@link OESDepth24} is supported. */
    public final boolean GL_OES_depth24;
    /** When true, {@link OESDepth32} is supported. */
    public final boolean GL_OES_depth32;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_depth_texture.txt">OES_depth_texture</a> extension is supported.
     * 
     * <p>This extension defines a new texture format that stores depth values in the texture. Depth texture images are widely used for shadow casting but can
     * also be used for other effects such as image based rendering, displacement mapping etc.</p>
     * 
     * <p>Requires {@link GLES20 GLES 2.0}.</p>
     */
    public final boolean GL_OES_depth_texture;
    /** When true, {@link OESDepthTextureCubeMap} is supported. */
    public final boolean GL_OES_depth_texture_cube_map;
    /** When true, {@link OESDrawBuffersIndexed} is supported. */
    public final boolean GL_OES_draw_buffers_indexed;
    /** When true, {@link OESDrawElementsBaseVertex} is supported. */
    public final boolean GL_OES_draw_elements_base_vertex;
    /** When true, {@link OESEGLImage} is supported. */
    public final boolean GL_OES_EGL_image;
    /** When true, {@link OESEGLImageExternal} is supported. */
    public final boolean GL_OES_EGL_image_external;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_EGL_image_external_essl3.txt">OES_EGL_image_external_essl3</a> extension is supported.
     * 
     * <p>OES_EGL_image_external provides a mechanism for creating EGLImage texture targets from EGLImages, but only specified language interactions for the
     * OpenGL ES Shading Language version 1.0. This extension adds support for versions 3.x of the OpenGL ES Shading Language.</p>
     * 
     * <p>Requires {@link GLES30 GLES30} and {@link OESEGLImageExternal OES_EGL_image_external}.</p>
     */
    public final boolean GL_OES_EGL_image_external_essl3;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_element_index_uint.txt">OES_element_index_uint</a> extension is supported.
     * 
     * <p>OpenGL ES 1.0 supports DrawElements with {@code type} value of UNSIGNED_BYTE and UNSIGNED_SHORT. This extension adds support for UNSIGNED_INT
     * {@code type} values.</p>
     */
    public final boolean GL_OES_element_index_uint;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_fbo_render_mipmap.txt">OES_fbo_render_mipmap</a> extension is supported.
     * 
     * <p>OES_framebuffer_object allows rendering to the base level of a texture only. This extension removes this limitation by allowing implementations to
     * support rendering to any mip-level of a texture(s) that is attached to a framebuffer object(s).</p>
     * 
     * <p>If this extension is supported, FramebufferTexture2DOES, and FramebufferTexture3DOES can be used to render directly into any mip level of a texture
     * image</p>
     */
    public final boolean GL_OES_fbo_render_mipmap;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_geometry_shader.txt">OES_geometry_point_size</a> extension is supported. */
    public final boolean GL_OES_geometry_point_size;
    /** When true, {@link OESGeometryShader} is supported. */
    public final boolean GL_OES_geometry_shader;
    /** When true, {@link OESGetProgramBinary} is supported. */
    public final boolean GL_OES_get_program_binary;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_gpu_shader5.txt">OES_gpu_shader5</a> extension is supported.
     * 
     * <p>This extension provides a set of new features to the OpenGL ES Shading Language and related APIs to support capabilities of new GPUs, extending the
     * capabilities of version 3.10 of the OpenGL ES Shading Language. Shaders using the new functionality provided by this extension should enable this
     * functionality via the construct</p>
     * 
     * <pre><code>
     *     #extension GL_OES_gpu_shader5 : require (or enable)</code></pre>
     * 
     * <p>This extension provides a variety of new features for all shader types, including:</p>
     * 
     * <ul>
     * <li>support for indexing into arrays of opaque types (samplers, and atomic counters) using dynamically uniform integer expressions;</li>
     * <li>support for indexing into arrays of images and shader storage blocks using only constant integral expressions;</li>
     * <li>extending the uniform block capability to allow shaders to index into an array of uniform blocks;</li>
     * <li>a "precise" qualifier allowing computations to be carried out exactly as specified in the shader source to avoid optimization-induced invariance
     * issues (which might cause cracking in tessellation);</li>
     * <li>new built-in functions supporting:
     * 
     * <ul>
     * <li>fused floating-point multiply-add operations;</li>
     * </ul></li>
     * <li>extending the textureGather() built-in functions provided by OpenGL ES Shading Language 3.10:
     * 
     * <ul>
     * <li>allowing shaders to use arbitrary offsets computed at run-time to select a 2x2 footprint to gather from; and</li>
     * <li>allowing shaders to use separate independent offsets for each of the four texels returned, instead of requiring a fixed 2x2 footprint.</li>
     * </ul></li>
     * </ul>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_OES_gpu_shader5;
    /** When true, {@link OESMapbuffer} is supported. */
    public final boolean GL_OES_mapbuffer;
    /** When true, {@link OESPackedDepthStencil} is supported. */
    public final boolean GL_OES_packed_depth_stencil;
    /** When true, {@link OESPrimitiveBoundingBox} is supported. */
    public final boolean GL_OES_primitive_bounding_box;
    /** When true, {@link OESRequiredInternalformat} is supported. */
    public final boolean GL_OES_required_internalformat;
    /** When true, {@link OESRGB8RGBA8} is supported. */
    public final boolean GL_OES_rgb8_rgba8;
    /** When true, {@link OESSampleShading} is supported. */
    public final boolean GL_OES_sample_shading;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_sample_variables.txt">OES_sample_variables</a> extension is supported.
     * 
     * <p>This extension allows fragment shaders more control over multisample rendering. The mask of samples covered by a fragment can be read by the shader and
     * individual samples can be masked out. Additionally fragment shaders can be run on individual samples and the sample's ID and position read to allow
     * better interaction with multisample resources such as textures.</p>
     * 
     * <p>In multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample, which then allows the
     * optimization where the shader is only evaluated once and then distributed to the samples that have been determined to be covered by the primitive
     * currently being rasterized. This extension does not change how values are interpolated, but it makes some details of the current sample available. This
     * means that where these features are used (gl_SampleID and gl_SamplePosition), implementations must run the fragment shader for each sample.</p>
     * 
     * <p>In order to obtain per-sample interpolation on fragment inputs, either OES_sample_shading or OES_shader_multisample_interpolation must be used in
     * conjunction with the features from this extension.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_OES_sample_variables;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_shader_image_atomic.txt">OES_shader_image_atomic</a> extension is supported.
     * 
     * <p>This extension provides built-in functions allowing shaders to perform atomic read-modify-write operations to a single level of a texture object from
     * any shader stage. These built-in functions are named imageAtomic*(), and accept integer texel coordinates to identify the texel accessed. These
     * built-in functions extend the Images in ESSL 3.10.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_OES_shader_image_atomic;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_shader_io_blocks.txt">OES_shader_io_blocks</a> extension is supported.
     * 
     * <p>This extension extends the functionality of interface blocks to support input and output interfaces in the OpenGL ES Shading Language.</p>
     * 
     * <p>Input and output interface blocks are used for forming the interfaces between vertex, tessellation control, tessellation evaluation, geometry and
     * fragment shaders. This accommodates passing arrays between stages, which otherwise would require multi-dimensional array support for tessellation
     * control outputs and for tessellation control, tessellation evaluation, and geometry shader inputs.</p>
     * 
     * <p>This extension provides support for application defined interface blocks which are used for passing application-specific information between shader
     * stages.</p>
     * 
     * <p>This extension moves the built-in "per-vertex" in/out variables to a new built-in gl_PerVertex block. This is necessary for tessellation and geometry
     * shaders which require a separate instance for each vertex, but it can also be useful for vertex shaders.</p>
     * 
     * <p>Finally, this extension allows the redeclaration of the gl_PerVertex block in order to reduce the set of variables that must be passed between shaders.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_OES_shader_io_blocks;
    /** When true, {@link OESShaderMultisampleInterpolation} is supported. */
    public final boolean GL_OES_shader_multisample_interpolation;
    /** When true, {@link OESStandardDerivatives} is supported. */
    public final boolean GL_OES_standard_derivatives;
    /** When true, {@link OESStencil1} is supported. */
    public final boolean GL_OES_stencil1;
    /** When true, {@link OESStencil4} is supported. */
    public final boolean GL_OES_stencil4;
    /** When true, {@link OESStencil8} is supported. */
    public final boolean GL_OES_stencil8;
    /** When true, {@link OESSurfacelessContext} is supported. */
    public final boolean GL_OES_surfaceless_context;
    /** When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_tessellation_shader.txt">OES_tessellation_point_size</a> extension is supported. */
    public final boolean GL_OES_tessellation_point_size;
    /** When true, {@link OESTessellationShader} is supported. */
    public final boolean GL_OES_tessellation_shader;
    /** When true, {@link OESTexture3D} is supported. */
    public final boolean GL_OES_texture_3D;
    /** When true, {@link OESTextureBorderClamp} is supported. */
    public final boolean GL_OES_texture_border_clamp;
    /** When true, {@link OESTextureBuffer} is supported. */
    public final boolean GL_OES_texture_buffer;
    /** When true, {@link OESTextureCompressionASTC} is supported. */
    public final boolean GL_OES_texture_compression_astc;
    /** When true, {@link OESTextureCubeMapArray} is supported. */
    public final boolean GL_OES_texture_cube_map_array;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float.txt">OES_texture_float</a> extension is supported.
     * 
     * <p>These extensions add texture formats with 16- (aka half float) and 32-bit floating-point components. The 32-bit floating-point components are in the
     * standard IEEE float format. The 16-bit floating-point components have 1 sign bit, 5 exponent bits, and 10 mantissa bits. Floating-point components are
     * clamped to the limits of the range representable by their format.</p>
     * 
     * <p>The OES_texture_float extension string indicates that the implementation supports 32-bit floating pt texture formats.</p>
     * 
     * <p>Both these extensions only require NEAREST magnification filter and NEAREST, and NEAREST_MIPMAP_NEAREST minification filters to be supported.</p>
     */
    public final boolean GL_OES_texture_float;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float_linear.txt">OES_texture_float_linear</a> extension is supported.
     * 
     * <p>These extensions expand upon the OES_texture_half_float and OES_texture_float extensions by allowing support for LINEAR magnification filter and
     * LINEAR, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_NEAREST and LINEAR_MIPMAP_NEAREST minification filters.</p>
     * 
     * <p>When implemented against OpenGL ES 3.0 or later versions, sized 32-bit floating-point formats become texture-filterable. This should be noted by, for
     * example, checking the ``TF'' column of table 8.13 in the ES 3.1 Specification (``Correspondence of sized internal formats to base internal formats ...
     * and use cases ...'') for the R32F, RG32F, RGB32F, and RGBA32F formats.</p>
     * 
     * <p>Requires {@link #GL_OES_texture_float OES_texture_float}.</p>
     */
    public final boolean GL_OES_texture_float_linear;
    /** When true, {@link OESTextureHalfFloat} is supported. */
    public final boolean GL_OES_texture_half_float;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float_linear.txt">OES_texture_half_float_linear</a> extension is supported.
     * 
     * <p>These extensions expand upon the OES_texture_half_float and OES_texture_float extensions by allowing support for LINEAR magnification filter and
     * LINEAR, NEAREST_MIPMAP_LINEAR, LINEAR_MIPMAP_NEAREST and LINEAR_MIPMAP_NEAREST minification filters.</p>
     * 
     * <p>When implemented against OpenGL ES 3.0 or later versions, sized 32-bit floating-point formats become texture-filterable. This should be noted by, for
     * example, checking the ``TF'' column of table 8.13 in the ES 3.1 Specification (``Correspondence of sized internal formats to base internal formats ...
     * and use cases ...'') for the R32F, RG32F, RGB32F, and RGBA32F formats.</p>
     * 
     * <p>Requires {@link OESTextureHalfFloat OES_texture_half_float}.</p>
     */
    public final boolean GL_OES_texture_half_float_linear;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_npot.txt">OES_texture_npot</a> extension is supported.
     * 
     * <p>This extension adds support for the REPEAT and MIRRORED_REPEAT texture wrap modes and the minification filters supported for non-power of two 2D
     * textures, cubemaps and for 3D textures, if the OES_texture_3D extension is supported.</p>
     * 
     * <p>Section 3.8.2 of the OpenGL ES 2.0 specification describes rules for sampling from an incomplete texture. There were specific rules added for non-power
     * of two textures i.e. if the texture wrap mode is not CLAMP_TO_EDGE or minification filter is not NEAREST or LINEAR and the texture is a
     * non-power-of-two texture, then sampling the texture will return (0, 0, 0, 1).</p>
     * 
     * <p>These rules are no longer applied by an implementation that supports this extension.</p>
     */
    public final boolean GL_OES_texture_npot;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_stencil8.txt">OES_texture_stencil8</a> extension is supported.
     * 
     * <p>This extension accepts STENCIL_INDEX8 as a texture internal format, and adds STENCIL_INDEX8 to the required internal format list. This removes the need
     * to use renderbuffers if a stencil-only format is desired.</p>
     */
    public final boolean GL_OES_texture_stencil8;
    /** When true, {@link OESTextureStorageMultisample2DArray} is supported. */
    public final boolean GL_OES_texture_storage_multisample_2d_array;
    /** When true, {@link OESTextureView} is supported. */
    public final boolean GL_OES_texture_view;
    /** When true, {@link OESVertexArrayObject} is supported. */
    public final boolean GL_OES_vertex_array_object;
    /** When true, {@link OESVertexHalfFloat} is supported. */
    public final boolean GL_OES_vertex_half_float;
    /** When true, {@link OESVertexType1010102} is supported. */
    public final boolean GL_OES_vertex_type_10_10_10_2;
    /** When true, {@link OESViewportArray} is supported. */
    public final boolean GL_OES_viewport_array;
    /** When true, {@link OVRMultiview} is supported. */
    public final boolean GL_OVR_multiview;
    /**
     * When true, the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/OVR/OVR_multiview2.txt">OVR_multiview2</a> extension is supported.
     * 
     * <p>This extension relaxes the restriction in OVR_multiview that only gl_Position can depend on ViewID in the vertex shader. With this change,
     * view-dependent outputs like reflection vectors and similar are allowed.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0} and {@link OVRMultiview OVR_multiview}.</p>
     */
    public final boolean GL_OVR_multiview2;
    /** When true, {@link OVRMultiviewMultisampledRenderToTexture} is supported. */
    public final boolean GL_OVR_multiview_multisampled_render_to_texture;
    /** When true, {@link QCOMAlphaTest} is supported. */
    public final boolean GL_QCOM_alpha_test;
    /** When true, {@link QCOMBinningControl} is supported. */
    public final boolean GL_QCOM_binning_control;
    /** When true, {@link QCOMDriverControl} is supported. */
    public final boolean GL_QCOM_driver_control;
    /** When true, {@link QCOMExtendedGet} is supported. */
    public final boolean GL_QCOM_extended_get;
    /** When true, {@link QCOMExtendedGet2} is supported. */
    public final boolean GL_QCOM_extended_get2;
    /** When true, {@link QCOMFramebufferFoveated} is supported. */
    public final boolean GL_QCOM_framebuffer_foveated;
    /** When true, {@link QCOMPerfmonGlobalMode} is supported. */
    public final boolean GL_QCOM_perfmon_global_mode;
    /** When true, {@link QCOMShaderFramebufferFetchNoncoherent} is supported. */
    public final boolean GL_QCOM_shader_framebuffer_fetch_noncoherent;
    /**
     * When certain built-ins (e.g. {@code gl_LastFragData}, {@code gl_LastFragStencilARM}) are referenced in the shader, the shader is required to execute at
     * sample-rate if the attachments are multisampled. In some use-cases executing such shaders at fragment-rate is actually the preferred behavior. When
     * this extension is enabled, such GLSL shaders will execute at fragment-rate and the built-in will return a per-fragment value. This avoids the
     * significant performance penalty that would otherwise be incurred with sample-rate shading.
     * 
     * <p>The following built-ins are affected when the this extension is enabled:</p>
     * 
     * <ul>
     * <li>{@code gl_LastFragData} (from {@link EXTShaderFramebufferFetch EXT_shader_framebuffer_fetch})</li>
     * <li>{@code gl_LastFragDepthARM} (from {@link #GL_ARM_shader_framebuffer_fetch_depth_stencil ARM_shader_framebuffer_fetch_depth_stencil})</li>
     * </ul>
     * 
     * <p>The following built-ins are disallowed when this extension is enabled:</p>
     * 
     * <ul>
     * <li>gl_SampleID</li>
     * <li>gl_SamplePosition</li>
     * <li>interpolateAtSample()</li>
     * </ul>
     */
    public final boolean GL_QCOM_shader_framebuffer_fetch_rate;
    /** When true, {@link QCOMTextureFoveated} is supported. */
    public final boolean GL_QCOM_texture_foveated;
    /** When true, {@link QCOMTextureFoveatedSubsampledLayout} is supported. */
    public final boolean GL_QCOM_texture_foveated_subsampled_layout;
    /** When true, {@link QCOMTiledRendering} is supported. */
    public final boolean GL_QCOM_tiled_rendering;
    /** When true, {@link QCOMWriteonlyRendering} is supported. */
    public final boolean GL_QCOM_writeonly_rendering;
    /**
     * Extension {@link #GL_EXT_gpu_shader5 EXT_gpu_shader5} introduced the texture gather built-in functions. Extension {@link EXTYUVTarget EXT_YUV_target} adds the ability to sample from YUV
     * textures, but does not include gather functions. This extension allows gather function to be used in combination with the YUV textures exposed in
     * {@code EXT_YUV_target}.
     */
    public final boolean GL_QCOM_YUV_texture_gather;
    /** When true, {@link VIVShaderBinary} is supported. */
    public final boolean GL_VIV_shader_binary;

    /** Off-heap array of the above function addresses. */
    final PointerBuffer addresses;

    GLESCapabilities(FunctionProvider provider, Set<String> ext) {
        glActiveTexture = provider.getFunctionAddress("glActiveTexture");
        glAttachShader = provider.getFunctionAddress("glAttachShader");
        glBindAttribLocation = provider.getFunctionAddress("glBindAttribLocation");
        glBindBuffer = provider.getFunctionAddress("glBindBuffer");
        glBindFramebuffer = provider.getFunctionAddress("glBindFramebuffer");
        glBindRenderbuffer = provider.getFunctionAddress("glBindRenderbuffer");
        glBindTexture = provider.getFunctionAddress("glBindTexture");
        glBlendColor = provider.getFunctionAddress("glBlendColor");
        glBlendEquation = provider.getFunctionAddress("glBlendEquation");
        glBlendEquationSeparate = provider.getFunctionAddress("glBlendEquationSeparate");
        glBlendFunc = provider.getFunctionAddress("glBlendFunc");
        glBlendFuncSeparate = provider.getFunctionAddress("glBlendFuncSeparate");
        glBufferData = provider.getFunctionAddress("glBufferData");
        glBufferSubData = provider.getFunctionAddress("glBufferSubData");
        glCheckFramebufferStatus = provider.getFunctionAddress("glCheckFramebufferStatus");
        glClear = provider.getFunctionAddress("glClear");
        glClearColor = provider.getFunctionAddress("glClearColor");
        glClearDepthf = provider.getFunctionAddress("glClearDepthf");
        glClearStencil = provider.getFunctionAddress("glClearStencil");
        glColorMask = provider.getFunctionAddress("glColorMask");
        glCompileShader = provider.getFunctionAddress("glCompileShader");
        glCompressedTexImage2D = provider.getFunctionAddress("glCompressedTexImage2D");
        glCompressedTexSubImage2D = provider.getFunctionAddress("glCompressedTexSubImage2D");
        glCopyTexImage2D = provider.getFunctionAddress("glCopyTexImage2D");
        glCopyTexSubImage2D = provider.getFunctionAddress("glCopyTexSubImage2D");
        glCreateProgram = provider.getFunctionAddress("glCreateProgram");
        glCreateShader = provider.getFunctionAddress("glCreateShader");
        glCullFace = provider.getFunctionAddress("glCullFace");
        glDeleteBuffers = provider.getFunctionAddress("glDeleteBuffers");
        glDeleteFramebuffers = provider.getFunctionAddress("glDeleteFramebuffers");
        glDeleteProgram = provider.getFunctionAddress("glDeleteProgram");
        glDeleteRenderbuffers = provider.getFunctionAddress("glDeleteRenderbuffers");
        glDeleteShader = provider.getFunctionAddress("glDeleteShader");
        glDeleteTextures = provider.getFunctionAddress("glDeleteTextures");
        glDepthFunc = provider.getFunctionAddress("glDepthFunc");
        glDepthMask = provider.getFunctionAddress("glDepthMask");
        glDepthRangef = provider.getFunctionAddress("glDepthRangef");
        glDetachShader = provider.getFunctionAddress("glDetachShader");
        glDisable = provider.getFunctionAddress("glDisable");
        glDisableVertexAttribArray = provider.getFunctionAddress("glDisableVertexAttribArray");
        glDrawArrays = provider.getFunctionAddress("glDrawArrays");
        glDrawElements = provider.getFunctionAddress("glDrawElements");
        glEnable = provider.getFunctionAddress("glEnable");
        glEnableVertexAttribArray = provider.getFunctionAddress("glEnableVertexAttribArray");
        glFinish = provider.getFunctionAddress("glFinish");
        glFlush = provider.getFunctionAddress("glFlush");
        glFramebufferRenderbuffer = provider.getFunctionAddress("glFramebufferRenderbuffer");
        glFramebufferTexture2D = provider.getFunctionAddress("glFramebufferTexture2D");
        glFrontFace = provider.getFunctionAddress("glFrontFace");
        glGenBuffers = provider.getFunctionAddress("glGenBuffers");
        glGenerateMipmap = provider.getFunctionAddress("glGenerateMipmap");
        glGenFramebuffers = provider.getFunctionAddress("glGenFramebuffers");
        glGenRenderbuffers = provider.getFunctionAddress("glGenRenderbuffers");
        glGenTextures = provider.getFunctionAddress("glGenTextures");
        glGetActiveAttrib = provider.getFunctionAddress("glGetActiveAttrib");
        glGetActiveUniform = provider.getFunctionAddress("glGetActiveUniform");
        glGetAttachedShaders = provider.getFunctionAddress("glGetAttachedShaders");
        glGetAttribLocation = provider.getFunctionAddress("glGetAttribLocation");
        glGetBooleanv = provider.getFunctionAddress("glGetBooleanv");
        glGetBufferParameteriv = provider.getFunctionAddress("glGetBufferParameteriv");
        glGetError = provider.getFunctionAddress("glGetError");
        glGetFloatv = provider.getFunctionAddress("glGetFloatv");
        glGetFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetFramebufferAttachmentParameteriv");
        glGetIntegerv = provider.getFunctionAddress("glGetIntegerv");
        glGetProgramiv = provider.getFunctionAddress("glGetProgramiv");
        glGetProgramInfoLog = provider.getFunctionAddress("glGetProgramInfoLog");
        glGetRenderbufferParameteriv = provider.getFunctionAddress("glGetRenderbufferParameteriv");
        glGetShaderiv = provider.getFunctionAddress("glGetShaderiv");
        glGetShaderInfoLog = provider.getFunctionAddress("glGetShaderInfoLog");
        glGetShaderPrecisionFormat = provider.getFunctionAddress("glGetShaderPrecisionFormat");
        glGetShaderSource = provider.getFunctionAddress("glGetShaderSource");
        glGetString = provider.getFunctionAddress("glGetString");
        glGetTexParameterfv = provider.getFunctionAddress("glGetTexParameterfv");
        glGetTexParameteriv = provider.getFunctionAddress("glGetTexParameteriv");
        glGetUniformfv = provider.getFunctionAddress("glGetUniformfv");
        glGetUniformiv = provider.getFunctionAddress("glGetUniformiv");
        glGetUniformLocation = provider.getFunctionAddress("glGetUniformLocation");
        glGetVertexAttribfv = provider.getFunctionAddress("glGetVertexAttribfv");
        glGetVertexAttribiv = provider.getFunctionAddress("glGetVertexAttribiv");
        glGetVertexAttribPointerv = provider.getFunctionAddress("glGetVertexAttribPointerv");
        glHint = provider.getFunctionAddress("glHint");
        glIsBuffer = provider.getFunctionAddress("glIsBuffer");
        glIsEnabled = provider.getFunctionAddress("glIsEnabled");
        glIsFramebuffer = provider.getFunctionAddress("glIsFramebuffer");
        glIsProgram = provider.getFunctionAddress("glIsProgram");
        glIsRenderbuffer = provider.getFunctionAddress("glIsRenderbuffer");
        glIsShader = provider.getFunctionAddress("glIsShader");
        glIsTexture = provider.getFunctionAddress("glIsTexture");
        glLineWidth = provider.getFunctionAddress("glLineWidth");
        glLinkProgram = provider.getFunctionAddress("glLinkProgram");
        glPixelStorei = provider.getFunctionAddress("glPixelStorei");
        glPolygonOffset = provider.getFunctionAddress("glPolygonOffset");
        glReadPixels = provider.getFunctionAddress("glReadPixels");
        glReleaseShaderCompiler = provider.getFunctionAddress("glReleaseShaderCompiler");
        glRenderbufferStorage = provider.getFunctionAddress("glRenderbufferStorage");
        glSampleCoverage = provider.getFunctionAddress("glSampleCoverage");
        glScissor = provider.getFunctionAddress("glScissor");
        glShaderBinary = provider.getFunctionAddress("glShaderBinary");
        glShaderSource = provider.getFunctionAddress("glShaderSource");
        glStencilFunc = provider.getFunctionAddress("glStencilFunc");
        glStencilFuncSeparate = provider.getFunctionAddress("glStencilFuncSeparate");
        glStencilMask = provider.getFunctionAddress("glStencilMask");
        glStencilMaskSeparate = provider.getFunctionAddress("glStencilMaskSeparate");
        glStencilOp = provider.getFunctionAddress("glStencilOp");
        glStencilOpSeparate = provider.getFunctionAddress("glStencilOpSeparate");
        glTexImage2D = provider.getFunctionAddress("glTexImage2D");
        glTexParameterf = provider.getFunctionAddress("glTexParameterf");
        glTexParameterfv = provider.getFunctionAddress("glTexParameterfv");
        glTexParameteri = provider.getFunctionAddress("glTexParameteri");
        glTexParameteriv = provider.getFunctionAddress("glTexParameteriv");
        glTexSubImage2D = provider.getFunctionAddress("glTexSubImage2D");
        glUniform1f = provider.getFunctionAddress("glUniform1f");
        glUniform1fv = provider.getFunctionAddress("glUniform1fv");
        glUniform1i = provider.getFunctionAddress("glUniform1i");
        glUniform1iv = provider.getFunctionAddress("glUniform1iv");
        glUniform2f = provider.getFunctionAddress("glUniform2f");
        glUniform2fv = provider.getFunctionAddress("glUniform2fv");
        glUniform2i = provider.getFunctionAddress("glUniform2i");
        glUniform2iv = provider.getFunctionAddress("glUniform2iv");
        glUniform3f = provider.getFunctionAddress("glUniform3f");
        glUniform3fv = provider.getFunctionAddress("glUniform3fv");
        glUniform3i = provider.getFunctionAddress("glUniform3i");
        glUniform3iv = provider.getFunctionAddress("glUniform3iv");
        glUniform4f = provider.getFunctionAddress("glUniform4f");
        glUniform4fv = provider.getFunctionAddress("glUniform4fv");
        glUniform4i = provider.getFunctionAddress("glUniform4i");
        glUniform4iv = provider.getFunctionAddress("glUniform4iv");
        glUniformMatrix2fv = provider.getFunctionAddress("glUniformMatrix2fv");
        glUniformMatrix3fv = provider.getFunctionAddress("glUniformMatrix3fv");
        glUniformMatrix4fv = provider.getFunctionAddress("glUniformMatrix4fv");
        glUseProgram = provider.getFunctionAddress("glUseProgram");
        glValidateProgram = provider.getFunctionAddress("glValidateProgram");
        glVertexAttrib1f = provider.getFunctionAddress("glVertexAttrib1f");
        glVertexAttrib1fv = provider.getFunctionAddress("glVertexAttrib1fv");
        glVertexAttrib2f = provider.getFunctionAddress("glVertexAttrib2f");
        glVertexAttrib2fv = provider.getFunctionAddress("glVertexAttrib2fv");
        glVertexAttrib3f = provider.getFunctionAddress("glVertexAttrib3f");
        glVertexAttrib3fv = provider.getFunctionAddress("glVertexAttrib3fv");
        glVertexAttrib4f = provider.getFunctionAddress("glVertexAttrib4f");
        glVertexAttrib4fv = provider.getFunctionAddress("glVertexAttrib4fv");
        glVertexAttribPointer = provider.getFunctionAddress("glVertexAttribPointer");
        glViewport = provider.getFunctionAddress("glViewport");
        glReadBuffer = provider.getFunctionAddress("glReadBuffer");
        glDrawRangeElements = provider.getFunctionAddress("glDrawRangeElements");
        glTexImage3D = provider.getFunctionAddress("glTexImage3D");
        glTexSubImage3D = provider.getFunctionAddress("glTexSubImage3D");
        glCopyTexSubImage3D = provider.getFunctionAddress("glCopyTexSubImage3D");
        glCompressedTexImage3D = provider.getFunctionAddress("glCompressedTexImage3D");
        glCompressedTexSubImage3D = provider.getFunctionAddress("glCompressedTexSubImage3D");
        glGenQueries = provider.getFunctionAddress("glGenQueries");
        glDeleteQueries = provider.getFunctionAddress("glDeleteQueries");
        glIsQuery = provider.getFunctionAddress("glIsQuery");
        glBeginQuery = provider.getFunctionAddress("glBeginQuery");
        glEndQuery = provider.getFunctionAddress("glEndQuery");
        glGetQueryiv = provider.getFunctionAddress("glGetQueryiv");
        glGetQueryObjectuiv = provider.getFunctionAddress("glGetQueryObjectuiv");
        glUnmapBuffer = provider.getFunctionAddress("glUnmapBuffer");
        glGetBufferPointerv = provider.getFunctionAddress("glGetBufferPointerv");
        glDrawBuffers = provider.getFunctionAddress("glDrawBuffers");
        glUniformMatrix2x3fv = provider.getFunctionAddress("glUniformMatrix2x3fv");
        glUniformMatrix3x2fv = provider.getFunctionAddress("glUniformMatrix3x2fv");
        glUniformMatrix2x4fv = provider.getFunctionAddress("glUniformMatrix2x4fv");
        glUniformMatrix4x2fv = provider.getFunctionAddress("glUniformMatrix4x2fv");
        glUniformMatrix3x4fv = provider.getFunctionAddress("glUniformMatrix3x4fv");
        glUniformMatrix4x3fv = provider.getFunctionAddress("glUniformMatrix4x3fv");
        glBlitFramebuffer = provider.getFunctionAddress("glBlitFramebuffer");
        glRenderbufferStorageMultisample = provider.getFunctionAddress("glRenderbufferStorageMultisample");
        glFramebufferTextureLayer = provider.getFunctionAddress("glFramebufferTextureLayer");
        glMapBufferRange = provider.getFunctionAddress("glMapBufferRange");
        glFlushMappedBufferRange = provider.getFunctionAddress("glFlushMappedBufferRange");
        glBindVertexArray = provider.getFunctionAddress("glBindVertexArray");
        glDeleteVertexArrays = provider.getFunctionAddress("glDeleteVertexArrays");
        glGenVertexArrays = provider.getFunctionAddress("glGenVertexArrays");
        glIsVertexArray = provider.getFunctionAddress("glIsVertexArray");
        glGetIntegeri_v = provider.getFunctionAddress("glGetIntegeri_v");
        glBeginTransformFeedback = provider.getFunctionAddress("glBeginTransformFeedback");
        glEndTransformFeedback = provider.getFunctionAddress("glEndTransformFeedback");
        glBindBufferRange = provider.getFunctionAddress("glBindBufferRange");
        glBindBufferBase = provider.getFunctionAddress("glBindBufferBase");
        glTransformFeedbackVaryings = provider.getFunctionAddress("glTransformFeedbackVaryings");
        glGetTransformFeedbackVarying = provider.getFunctionAddress("glGetTransformFeedbackVarying");
        glVertexAttribIPointer = provider.getFunctionAddress("glVertexAttribIPointer");
        glGetVertexAttribIiv = provider.getFunctionAddress("glGetVertexAttribIiv");
        glGetVertexAttribIuiv = provider.getFunctionAddress("glGetVertexAttribIuiv");
        glVertexAttribI4i = provider.getFunctionAddress("glVertexAttribI4i");
        glVertexAttribI4ui = provider.getFunctionAddress("glVertexAttribI4ui");
        glVertexAttribI4iv = provider.getFunctionAddress("glVertexAttribI4iv");
        glVertexAttribI4uiv = provider.getFunctionAddress("glVertexAttribI4uiv");
        glGetUniformuiv = provider.getFunctionAddress("glGetUniformuiv");
        glGetFragDataLocation = provider.getFunctionAddress("glGetFragDataLocation");
        glUniform1ui = provider.getFunctionAddress("glUniform1ui");
        glUniform2ui = provider.getFunctionAddress("glUniform2ui");
        glUniform3ui = provider.getFunctionAddress("glUniform3ui");
        glUniform4ui = provider.getFunctionAddress("glUniform4ui");
        glUniform1uiv = provider.getFunctionAddress("glUniform1uiv");
        glUniform2uiv = provider.getFunctionAddress("glUniform2uiv");
        glUniform3uiv = provider.getFunctionAddress("glUniform3uiv");
        glUniform4uiv = provider.getFunctionAddress("glUniform4uiv");
        glClearBufferiv = provider.getFunctionAddress("glClearBufferiv");
        glClearBufferuiv = provider.getFunctionAddress("glClearBufferuiv");
        glClearBufferfv = provider.getFunctionAddress("glClearBufferfv");
        glClearBufferfi = provider.getFunctionAddress("glClearBufferfi");
        glGetStringi = provider.getFunctionAddress("glGetStringi");
        glCopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
        glGetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
        glGetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
        glGetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
        glGetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
        glGetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
        glUniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
        glDrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
        glDrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
        glFenceSync = provider.getFunctionAddress("glFenceSync");
        glIsSync = provider.getFunctionAddress("glIsSync");
        glDeleteSync = provider.getFunctionAddress("glDeleteSync");
        glClientWaitSync = provider.getFunctionAddress("glClientWaitSync");
        glWaitSync = provider.getFunctionAddress("glWaitSync");
        glGetInteger64v = provider.getFunctionAddress("glGetInteger64v");
        glGetSynciv = provider.getFunctionAddress("glGetSynciv");
        glGetInteger64i_v = provider.getFunctionAddress("glGetInteger64i_v");
        glGetBufferParameteri64v = provider.getFunctionAddress("glGetBufferParameteri64v");
        glGenSamplers = provider.getFunctionAddress("glGenSamplers");
        glDeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
        glIsSampler = provider.getFunctionAddress("glIsSampler");
        glBindSampler = provider.getFunctionAddress("glBindSampler");
        glSamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
        glSamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
        glSamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
        glSamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
        glGetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
        glGetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
        glVertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
        glBindTransformFeedback = provider.getFunctionAddress("glBindTransformFeedback");
        glDeleteTransformFeedbacks = provider.getFunctionAddress("glDeleteTransformFeedbacks");
        glGenTransformFeedbacks = provider.getFunctionAddress("glGenTransformFeedbacks");
        glIsTransformFeedback = provider.getFunctionAddress("glIsTransformFeedback");
        glPauseTransformFeedback = provider.getFunctionAddress("glPauseTransformFeedback");
        glResumeTransformFeedback = provider.getFunctionAddress("glResumeTransformFeedback");
        glGetProgramBinary = provider.getFunctionAddress("glGetProgramBinary");
        glProgramBinary = provider.getFunctionAddress("glProgramBinary");
        glProgramParameteri = provider.getFunctionAddress("glProgramParameteri");
        glInvalidateFramebuffer = provider.getFunctionAddress("glInvalidateFramebuffer");
        glInvalidateSubFramebuffer = provider.getFunctionAddress("glInvalidateSubFramebuffer");
        glTexStorage2D = provider.getFunctionAddress("glTexStorage2D");
        glTexStorage3D = provider.getFunctionAddress("glTexStorage3D");
        glGetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
        glDispatchCompute = provider.getFunctionAddress("glDispatchCompute");
        glDispatchComputeIndirect = provider.getFunctionAddress("glDispatchComputeIndirect");
        glDrawArraysIndirect = provider.getFunctionAddress("glDrawArraysIndirect");
        glDrawElementsIndirect = provider.getFunctionAddress("glDrawElementsIndirect");
        glFramebufferParameteri = provider.getFunctionAddress("glFramebufferParameteri");
        glGetFramebufferParameteriv = provider.getFunctionAddress("glGetFramebufferParameteriv");
        glGetProgramInterfaceiv = provider.getFunctionAddress("glGetProgramInterfaceiv");
        glGetProgramResourceIndex = provider.getFunctionAddress("glGetProgramResourceIndex");
        glGetProgramResourceName = provider.getFunctionAddress("glGetProgramResourceName");
        glGetProgramResourceiv = provider.getFunctionAddress("glGetProgramResourceiv");
        glGetProgramResourceLocation = provider.getFunctionAddress("glGetProgramResourceLocation");
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
        glProgramUniformMatrix2fv = provider.getFunctionAddress("glProgramUniformMatrix2fv");
        glProgramUniformMatrix3fv = provider.getFunctionAddress("glProgramUniformMatrix3fv");
        glProgramUniformMatrix4fv = provider.getFunctionAddress("glProgramUniformMatrix4fv");
        glProgramUniformMatrix2x3fv = provider.getFunctionAddress("glProgramUniformMatrix2x3fv");
        glProgramUniformMatrix3x2fv = provider.getFunctionAddress("glProgramUniformMatrix3x2fv");
        glProgramUniformMatrix2x4fv = provider.getFunctionAddress("glProgramUniformMatrix2x4fv");
        glProgramUniformMatrix4x2fv = provider.getFunctionAddress("glProgramUniformMatrix4x2fv");
        glProgramUniformMatrix3x4fv = provider.getFunctionAddress("glProgramUniformMatrix3x4fv");
        glProgramUniformMatrix4x3fv = provider.getFunctionAddress("glProgramUniformMatrix4x3fv");
        glValidateProgramPipeline = provider.getFunctionAddress("glValidateProgramPipeline");
        glGetProgramPipelineInfoLog = provider.getFunctionAddress("glGetProgramPipelineInfoLog");
        glBindImageTexture = provider.getFunctionAddress("glBindImageTexture");
        glGetBooleani_v = provider.getFunctionAddress("glGetBooleani_v");
        glMemoryBarrier = provider.getFunctionAddress("glMemoryBarrier");
        glMemoryBarrierByRegion = provider.getFunctionAddress("glMemoryBarrierByRegion");
        glTexStorage2DMultisample = provider.getFunctionAddress("glTexStorage2DMultisample");
        glGetMultisamplefv = provider.getFunctionAddress("glGetMultisamplefv");
        glSampleMaski = provider.getFunctionAddress("glSampleMaski");
        glGetTexLevelParameteriv = provider.getFunctionAddress("glGetTexLevelParameteriv");
        glGetTexLevelParameterfv = provider.getFunctionAddress("glGetTexLevelParameterfv");
        glBindVertexBuffer = provider.getFunctionAddress("glBindVertexBuffer");
        glVertexAttribFormat = provider.getFunctionAddress("glVertexAttribFormat");
        glVertexAttribIFormat = provider.getFunctionAddress("glVertexAttribIFormat");
        glVertexAttribBinding = provider.getFunctionAddress("glVertexAttribBinding");
        glVertexBindingDivisor = provider.getFunctionAddress("glVertexBindingDivisor");
        glBlendBarrier = provider.getFunctionAddress("glBlendBarrier");
        glCopyImageSubData = provider.getFunctionAddress("glCopyImageSubData");
        glDebugMessageControl = provider.getFunctionAddress("glDebugMessageControl");
        glDebugMessageInsert = provider.getFunctionAddress("glDebugMessageInsert");
        glDebugMessageCallback = provider.getFunctionAddress("glDebugMessageCallback");
        glGetDebugMessageLog = provider.getFunctionAddress("glGetDebugMessageLog");
        glGetPointerv = provider.getFunctionAddress("glGetPointerv");
        glPushDebugGroup = provider.getFunctionAddress("glPushDebugGroup");
        glPopDebugGroup = provider.getFunctionAddress("glPopDebugGroup");
        glObjectLabel = provider.getFunctionAddress("glObjectLabel");
        glGetObjectLabel = provider.getFunctionAddress("glGetObjectLabel");
        glObjectPtrLabel = provider.getFunctionAddress("glObjectPtrLabel");
        glGetObjectPtrLabel = provider.getFunctionAddress("glGetObjectPtrLabel");
        glEnablei = provider.getFunctionAddress("glEnablei");
        glDisablei = provider.getFunctionAddress("glDisablei");
        glBlendEquationi = provider.getFunctionAddress("glBlendEquationi");
        glBlendEquationSeparatei = provider.getFunctionAddress("glBlendEquationSeparatei");
        glBlendFunci = provider.getFunctionAddress("glBlendFunci");
        glBlendFuncSeparatei = provider.getFunctionAddress("glBlendFuncSeparatei");
        glColorMaski = provider.getFunctionAddress("glColorMaski");
        glIsEnabledi = provider.getFunctionAddress("glIsEnabledi");
        glDrawElementsBaseVertex = provider.getFunctionAddress("glDrawElementsBaseVertex");
        glDrawRangeElementsBaseVertex = provider.getFunctionAddress("glDrawRangeElementsBaseVertex");
        glDrawElementsInstancedBaseVertex = provider.getFunctionAddress("glDrawElementsInstancedBaseVertex");
        glFramebufferTexture = provider.getFunctionAddress("glFramebufferTexture");
        glPrimitiveBoundingBox = provider.getFunctionAddress("glPrimitiveBoundingBox");
        glGetGraphicsResetStatus = provider.getFunctionAddress("glGetGraphicsResetStatus");
        glReadnPixels = provider.getFunctionAddress("glReadnPixels");
        glGetnUniformfv = provider.getFunctionAddress("glGetnUniformfv");
        glGetnUniformiv = provider.getFunctionAddress("glGetnUniformiv");
        glGetnUniformuiv = provider.getFunctionAddress("glGetnUniformuiv");
        glMinSampleShading = provider.getFunctionAddress("glMinSampleShading");
        glPatchParameteri = provider.getFunctionAddress("glPatchParameteri");
        glTexParameterIiv = provider.getFunctionAddress("glTexParameterIiv");
        glTexParameterIuiv = provider.getFunctionAddress("glTexParameterIuiv");
        glGetTexParameterIiv = provider.getFunctionAddress("glGetTexParameterIiv");
        glGetTexParameterIuiv = provider.getFunctionAddress("glGetTexParameterIuiv");
        glSamplerParameterIiv = provider.getFunctionAddress("glSamplerParameterIiv");
        glSamplerParameterIuiv = provider.getFunctionAddress("glSamplerParameterIuiv");
        glGetSamplerParameterIiv = provider.getFunctionAddress("glGetSamplerParameterIiv");
        glGetSamplerParameterIuiv = provider.getFunctionAddress("glGetSamplerParameterIuiv");
        glTexBuffer = provider.getFunctionAddress("glTexBuffer");
        glTexBufferRange = provider.getFunctionAddress("glTexBufferRange");
        glTexStorage3DMultisample = provider.getFunctionAddress("glTexStorage3DMultisample");
        glRenderbufferStorageMultisampleAdvancedAMD = provider.getFunctionAddress("glRenderbufferStorageMultisampleAdvancedAMD");
        glNamedRenderbufferStorageMultisampleAdvancedAMD = provider.getFunctionAddress("glNamedRenderbufferStorageMultisampleAdvancedAMD");
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
        glBlitFramebufferANGLE = provider.getFunctionAddress("glBlitFramebufferANGLE");
        glRenderbufferStorageMultisampleANGLE = provider.getFunctionAddress("glRenderbufferStorageMultisampleANGLE");
        glDrawArraysInstancedANGLE = provider.getFunctionAddress("glDrawArraysInstancedANGLE");
        glDrawElementsInstancedANGLE = provider.getFunctionAddress("glDrawElementsInstancedANGLE");
        glVertexAttribDivisorANGLE = provider.getFunctionAddress("glVertexAttribDivisorANGLE");
        glGetTranslatedShaderSourceANGLE = provider.getFunctionAddress("glGetTranslatedShaderSourceANGLE");
        glCopyTextureLevelsAPPLE = provider.getFunctionAddress("glCopyTextureLevelsAPPLE");
        glRenderbufferStorageMultisampleAPPLE = provider.getFunctionAddress("glRenderbufferStorageMultisampleAPPLE");
        glResolveMultisampleFramebufferAPPLE = provider.getFunctionAddress("glResolveMultisampleFramebufferAPPLE");
        glFenceSyncAPPLE = provider.getFunctionAddress("glFenceSyncAPPLE");
        glIsSyncAPPLE = provider.getFunctionAddress("glIsSyncAPPLE");
        glDeleteSyncAPPLE = provider.getFunctionAddress("glDeleteSyncAPPLE");
        glClientWaitSyncAPPLE = provider.getFunctionAddress("glClientWaitSyncAPPLE");
        glWaitSyncAPPLE = provider.getFunctionAddress("glWaitSyncAPPLE");
        glGetInteger64vAPPLE = provider.getFunctionAddress("glGetInteger64vAPPLE");
        glGetSyncivAPPLE = provider.getFunctionAddress("glGetSyncivAPPLE");
        glDrawArraysInstancedBaseInstanceEXT = provider.getFunctionAddress("glDrawArraysInstancedBaseInstanceEXT");
        glDrawElementsInstancedBaseInstanceEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseInstanceEXT");
        glDrawElementsInstancedBaseVertexBaseInstanceEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexBaseInstanceEXT");
        glBindFragDataLocationIndexedEXT = provider.getFunctionAddress("glBindFragDataLocationIndexedEXT");
        glGetFragDataIndexEXT = provider.getFunctionAddress("glGetFragDataIndexEXT");
        glBindFragDataLocationEXT = provider.getFunctionAddress("glBindFragDataLocationEXT");
        glGetProgramResourceLocationIndexEXT = provider.getFunctionAddress("glGetProgramResourceLocationIndexEXT");
        glBufferStorageEXT = provider.getFunctionAddress("glBufferStorageEXT");
        glNamedBufferStorageEXT = provider.getFunctionAddress("glNamedBufferStorageEXT");
        glClearTexImageEXT = provider.getFunctionAddress("glClearTexImageEXT");
        glClearTexSubImageEXT = provider.getFunctionAddress("glClearTexSubImageEXT");
        glClipControlEXT = provider.getFunctionAddress("glClipControlEXT");
        glCopyImageSubDataEXT = provider.getFunctionAddress("glCopyImageSubDataEXT");
        glLabelObjectEXT = provider.getFunctionAddress("glLabelObjectEXT");
        glGetObjectLabelEXT = provider.getFunctionAddress("glGetObjectLabelEXT");
        glInsertEventMarkerEXT = provider.getFunctionAddress("glInsertEventMarkerEXT");
        glPushGroupMarkerEXT = provider.getFunctionAddress("glPushGroupMarkerEXT");
        glPopGroupMarkerEXT = provider.getFunctionAddress("glPopGroupMarkerEXT");
        glDiscardFramebufferEXT = provider.getFunctionAddress("glDiscardFramebufferEXT");
        glQueryCounterEXT = provider.getFunctionAddress("glQueryCounterEXT");
        glGetQueryObjectivEXT = provider.getFunctionAddress("glGetQueryObjectivEXT");
        glGetQueryObjecti64vEXT = provider.getFunctionAddress("glGetQueryObjecti64vEXT");
        glGetQueryObjectui64vEXT = provider.getFunctionAddress("glGetQueryObjectui64vEXT");
        glGetInteger64vEXT = provider.getFunctionAddress("glGetInteger64vEXT");
        glDrawBuffersEXT = provider.getFunctionAddress("glDrawBuffersEXT");
        glEnableiEXT = provider.getFunctionAddress("glEnableiEXT");
        glDisableiEXT = provider.getFunctionAddress("glDisableiEXT");
        glBlendEquationiEXT = provider.getFunctionAddress("glBlendEquationiEXT");
        glBlendEquationSeparateiEXT = provider.getFunctionAddress("glBlendEquationSeparateiEXT");
        glBlendFunciEXT = provider.getFunctionAddress("glBlendFunciEXT");
        glBlendFuncSeparateiEXT = provider.getFunctionAddress("glBlendFuncSeparateiEXT");
        glColorMaskiEXT = provider.getFunctionAddress("glColorMaskiEXT");
        glIsEnablediEXT = provider.getFunctionAddress("glIsEnablediEXT");
        glDrawElementsBaseVertexEXT = provider.getFunctionAddress("glDrawElementsBaseVertexEXT");
        glDrawRangeElementsBaseVertexEXT = provider.getFunctionAddress("glDrawRangeElementsBaseVertexEXT");
        glDrawElementsInstancedBaseVertexEXT = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexEXT");
        glMultiDrawElementsBaseVertexEXT = provider.getFunctionAddress("glMultiDrawElementsBaseVertexEXT");
        glDrawTransformFeedbackEXT = provider.getFunctionAddress("glDrawTransformFeedbackEXT");
        glDrawTransformFeedbackInstancedEXT = provider.getFunctionAddress("glDrawTransformFeedbackInstancedEXT");
        glEGLImageTargetTexStorageEXT = provider.getFunctionAddress("glEGLImageTargetTexStorageEXT");
        glEGLImageTargetTextureStorageEXT = provider.getFunctionAddress("glEGLImageTargetTextureStorageEXT");
        glBufferStorageExternalEXT = provider.getFunctionAddress("glBufferStorageExternalEXT");
        glNamedBufferStorageExternalEXT = provider.getFunctionAddress("glNamedBufferStorageExternalEXT");
        glFramebufferTextureEXT = provider.getFunctionAddress("glFramebufferTextureEXT");
        glDrawArraysInstancedEXT = provider.getFunctionAddress("glDrawArraysInstancedEXT");
        glDrawElementsInstancedEXT = provider.getFunctionAddress("glDrawElementsInstancedEXT");
        glVertexAttribDivisorEXT = provider.getFunctionAddress("glVertexAttribDivisorEXT");
        glMapBufferRangeEXT = provider.getFunctionAddress("glMapBufferRangeEXT");
        glFlushMappedBufferRangeEXT = provider.getFunctionAddress("glFlushMappedBufferRangeEXT");
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
        glImportMemoryFdEXT = provider.getFunctionAddress("glImportMemoryFdEXT");
        glImportMemoryWin32HandleEXT = provider.getFunctionAddress("glImportMemoryWin32HandleEXT");
        glImportMemoryWin32NameEXT = provider.getFunctionAddress("glImportMemoryWin32NameEXT");
        glMultiDrawArraysEXT = provider.getFunctionAddress("glMultiDrawArraysEXT");
        glMultiDrawElementsEXT = provider.getFunctionAddress("glMultiDrawElementsEXT");
        glMultiDrawArraysIndirectEXT = provider.getFunctionAddress("glMultiDrawArraysIndirectEXT");
        glMultiDrawElementsIndirectEXT = provider.getFunctionAddress("glMultiDrawElementsIndirectEXT");
        glRenderbufferStorageMultisampleEXT = provider.getFunctionAddress("glRenderbufferStorageMultisampleEXT");
        glFramebufferTexture2DMultisampleEXT = provider.getFunctionAddress("glFramebufferTexture2DMultisampleEXT");
        glReadBufferIndexedEXT = provider.getFunctionAddress("glReadBufferIndexedEXT");
        glDrawBuffersIndexedEXT = provider.getFunctionAddress("glDrawBuffersIndexedEXT");
        glGetIntegeri_vEXT = provider.getFunctionAddress("glGetIntegeri_vEXT");
        glGenQueriesEXT = provider.getFunctionAddress("glGenQueriesEXT");
        glDeleteQueriesEXT = provider.getFunctionAddress("glDeleteQueriesEXT");
        glIsQueryEXT = provider.getFunctionAddress("glIsQueryEXT");
        glBeginQueryEXT = provider.getFunctionAddress("glBeginQueryEXT");
        glEndQueryEXT = provider.getFunctionAddress("glEndQueryEXT");
        glGetQueryivEXT = provider.getFunctionAddress("glGetQueryivEXT");
        glGetQueryObjectuivEXT = provider.getFunctionAddress("glGetQueryObjectuivEXT");
        glPolygonOffsetClampEXT = provider.getFunctionAddress("glPolygonOffsetClampEXT");
        glPrimitiveBoundingBoxEXT = provider.getFunctionAddress("glPrimitiveBoundingBoxEXT");
        glRasterSamplesEXT = provider.getFunctionAddress("glRasterSamplesEXT");
        glGetGraphicsResetStatusEXT = provider.getFunctionAddress("glGetGraphicsResetStatusEXT");
        glReadnPixelsEXT = provider.getFunctionAddress("glReadnPixelsEXT");
        glGetnUniformfvEXT = provider.getFunctionAddress("glGetnUniformfvEXT");
        glGetnUniformivEXT = provider.getFunctionAddress("glGetnUniformivEXT");
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
        glActiveShaderProgramEXT = provider.getFunctionAddress("glActiveShaderProgramEXT");
        glBindProgramPipelineEXT = provider.getFunctionAddress("glBindProgramPipelineEXT");
        glCreateShaderProgramvEXT = provider.getFunctionAddress("glCreateShaderProgramvEXT");
        glDeleteProgramPipelinesEXT = provider.getFunctionAddress("glDeleteProgramPipelinesEXT");
        glGenProgramPipelinesEXT = provider.getFunctionAddress("glGenProgramPipelinesEXT");
        glGetProgramPipelineInfoLogEXT = provider.getFunctionAddress("glGetProgramPipelineInfoLogEXT");
        glGetProgramPipelineivEXT = provider.getFunctionAddress("glGetProgramPipelineivEXT");
        glIsProgramPipelineEXT = provider.getFunctionAddress("glIsProgramPipelineEXT");
        glProgramParameteriEXT = provider.getFunctionAddress("glProgramParameteriEXT");
        glProgramUniform1fEXT = provider.getFunctionAddress("glProgramUniform1fEXT");
        glProgramUniform1fvEXT = provider.getFunctionAddress("glProgramUniform1fvEXT");
        glProgramUniform1iEXT = provider.getFunctionAddress("glProgramUniform1iEXT");
        glProgramUniform1ivEXT = provider.getFunctionAddress("glProgramUniform1ivEXT");
        glProgramUniform2fEXT = provider.getFunctionAddress("glProgramUniform2fEXT");
        glProgramUniform2fvEXT = provider.getFunctionAddress("glProgramUniform2fvEXT");
        glProgramUniform2iEXT = provider.getFunctionAddress("glProgramUniform2iEXT");
        glProgramUniform2ivEXT = provider.getFunctionAddress("glProgramUniform2ivEXT");
        glProgramUniform3fEXT = provider.getFunctionAddress("glProgramUniform3fEXT");
        glProgramUniform3fvEXT = provider.getFunctionAddress("glProgramUniform3fvEXT");
        glProgramUniform3iEXT = provider.getFunctionAddress("glProgramUniform3iEXT");
        glProgramUniform3ivEXT = provider.getFunctionAddress("glProgramUniform3ivEXT");
        glProgramUniform4fEXT = provider.getFunctionAddress("glProgramUniform4fEXT");
        glProgramUniform4fvEXT = provider.getFunctionAddress("glProgramUniform4fvEXT");
        glProgramUniform4iEXT = provider.getFunctionAddress("glProgramUniform4iEXT");
        glProgramUniform4ivEXT = provider.getFunctionAddress("glProgramUniform4ivEXT");
        glProgramUniformMatrix2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2fvEXT");
        glProgramUniformMatrix3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3fvEXT");
        glProgramUniformMatrix4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4fvEXT");
        glUseProgramStagesEXT = provider.getFunctionAddress("glUseProgramStagesEXT");
        glValidateProgramPipelineEXT = provider.getFunctionAddress("glValidateProgramPipelineEXT");
        glProgramUniform1uiEXT = provider.getFunctionAddress("glProgramUniform1uiEXT");
        glProgramUniform2uiEXT = provider.getFunctionAddress("glProgramUniform2uiEXT");
        glProgramUniform3uiEXT = provider.getFunctionAddress("glProgramUniform3uiEXT");
        glProgramUniform4uiEXT = provider.getFunctionAddress("glProgramUniform4uiEXT");
        glProgramUniform1uivEXT = provider.getFunctionAddress("glProgramUniform1uivEXT");
        glProgramUniform2uivEXT = provider.getFunctionAddress("glProgramUniform2uivEXT");
        glProgramUniform3uivEXT = provider.getFunctionAddress("glProgramUniform3uivEXT");
        glProgramUniform4uivEXT = provider.getFunctionAddress("glProgramUniform4uivEXT");
        glProgramUniformMatrix2x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x3fvEXT");
        glProgramUniformMatrix3x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x2fvEXT");
        glProgramUniformMatrix2x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix2x4fvEXT");
        glProgramUniformMatrix4x2fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x2fvEXT");
        glProgramUniformMatrix3x4fvEXT = provider.getFunctionAddress("glProgramUniformMatrix3x4fvEXT");
        glProgramUniformMatrix4x3fvEXT = provider.getFunctionAddress("glProgramUniformMatrix4x3fvEXT");
        glFramebufferFetchBarrierEXT = provider.getFunctionAddress("glFramebufferFetchBarrierEXT");
        glFramebufferPixelLocalStorageSizeEXT = provider.getFunctionAddress("glFramebufferPixelLocalStorageSizeEXT");
        glGetFramebufferPixelLocalStorageSizeEXT = provider.getFunctionAddress("glGetFramebufferPixelLocalStorageSizeEXT");
        glClearPixelLocalStorageuiEXT = provider.getFunctionAddress("glClearPixelLocalStorageuiEXT");
        glTexPageCommitmentARB = provider.getFunctionAddress("glTexPageCommitmentARB");
        glPatchParameteriEXT = provider.getFunctionAddress("glPatchParameteriEXT");
        glTexParameterIivEXT = provider.getFunctionAddress("glTexParameterIivEXT");
        glTexParameterIuivEXT = provider.getFunctionAddress("glTexParameterIuivEXT");
        glGetTexParameterIivEXT = provider.getFunctionAddress("glGetTexParameterIivEXT");
        glGetTexParameterIuivEXT = provider.getFunctionAddress("glGetTexParameterIuivEXT");
        glSamplerParameterIivEXT = provider.getFunctionAddress("glSamplerParameterIivEXT");
        glSamplerParameterIuivEXT = provider.getFunctionAddress("glSamplerParameterIuivEXT");
        glGetSamplerParameterIivEXT = provider.getFunctionAddress("glGetSamplerParameterIivEXT");
        glGetSamplerParameterIuivEXT = provider.getFunctionAddress("glGetSamplerParameterIuivEXT");
        glTexBufferEXT = provider.getFunctionAddress("glTexBufferEXT");
        glTexBufferRangeEXT = provider.getFunctionAddress("glTexBufferRangeEXT");
        glTexStorage1DEXT = provider.getFunctionAddress("glTexStorage1DEXT");
        glTexStorage2DEXT = provider.getFunctionAddress("glTexStorage2DEXT");
        glTexStorage3DEXT = provider.getFunctionAddress("glTexStorage3DEXT");
        glTextureStorage1DEXT = provider.getFunctionAddress("glTextureStorage1DEXT");
        glTextureStorage2DEXT = provider.getFunctionAddress("glTextureStorage2DEXT");
        glTextureStorage3DEXT = provider.getFunctionAddress("glTextureStorage3DEXT");
        glTextureViewEXT = provider.getFunctionAddress("glTextureViewEXT");
        glAcquireKeyedMutexWin32EXT = provider.getFunctionAddress("glAcquireKeyedMutexWin32EXT");
        glReleaseKeyedMutexWin32EXT = provider.getFunctionAddress("glReleaseKeyedMutexWin32EXT");
        glWindowRectanglesEXT = provider.getFunctionAddress("glWindowRectanglesEXT");
        glFramebufferTexture2DDownsampleIMG = provider.getFunctionAddress("glFramebufferTexture2DDownsampleIMG");
        glFramebufferTextureLayerDownsampleIMG = provider.getFunctionAddress("glFramebufferTextureLayerDownsampleIMG");
        glRenderbufferStorageMultisampleIMG = provider.getFunctionAddress("glRenderbufferStorageMultisampleIMG");
        glFramebufferTexture2DMultisampleIMG = provider.getFunctionAddress("glFramebufferTexture2DMultisampleIMG");
        glApplyFramebufferAttachmentCMAAINTEL = provider.getFunctionAddress("glApplyFramebufferAttachmentCMAAINTEL");
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
        glDebugMessageControlKHR = provider.getFunctionAddress("glDebugMessageControlKHR");
        glDebugMessageInsertKHR = provider.getFunctionAddress("glDebugMessageInsertKHR");
        glDebugMessageCallbackKHR = provider.getFunctionAddress("glDebugMessageCallbackKHR");
        glGetDebugMessageLogKHR = provider.getFunctionAddress("glGetDebugMessageLogKHR");
        glGetPointervKHR = provider.getFunctionAddress("glGetPointervKHR");
        glPushDebugGroupKHR = provider.getFunctionAddress("glPushDebugGroupKHR");
        glPopDebugGroupKHR = provider.getFunctionAddress("glPopDebugGroupKHR");
        glObjectLabelKHR = provider.getFunctionAddress("glObjectLabelKHR");
        glGetObjectLabelKHR = provider.getFunctionAddress("glGetObjectLabelKHR");
        glObjectPtrLabelKHR = provider.getFunctionAddress("glObjectPtrLabelKHR");
        glGetObjectPtrLabelKHR = provider.getFunctionAddress("glGetObjectPtrLabelKHR");
        glMaxShaderCompilerThreadsKHR = provider.getFunctionAddress("glMaxShaderCompilerThreadsKHR");
        glGetGraphicsResetStatusKHR = provider.getFunctionAddress("glGetGraphicsResetStatusKHR");
        glReadnPixelsKHR = provider.getFunctionAddress("glReadnPixelsKHR");
        glGetnUniformfvKHR = provider.getFunctionAddress("glGetnUniformfvKHR");
        glGetnUniformivKHR = provider.getFunctionAddress("glGetnUniformivKHR");
        glGetnUniformuivKHR = provider.getFunctionAddress("glGetnUniformuivKHR");
        glAlphaToCoverageDitherControlNV = provider.getFunctionAddress("glAlphaToCoverageDitherControlNV");
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
        glBeginConditionalRenderNV = provider.getFunctionAddress("glBeginConditionalRenderNV");
        glEndConditionalRenderNV = provider.getFunctionAddress("glEndConditionalRenderNV");
        glSubpixelPrecisionBiasNV = provider.getFunctionAddress("glSubpixelPrecisionBiasNV");
        glConservativeRasterParameteriNV = provider.getFunctionAddress("glConservativeRasterParameteriNV");
        glCopyBufferSubDataNV = provider.getFunctionAddress("glCopyBufferSubDataNV");
        glCoverageMaskNV = provider.getFunctionAddress("glCoverageMaskNV");
        glCoverageOperationNV = provider.getFunctionAddress("glCoverageOperationNV");
        glDrawBuffersNV = provider.getFunctionAddress("glDrawBuffersNV");
        glDrawArraysInstancedNV = provider.getFunctionAddress("glDrawArraysInstancedNV");
        glDrawElementsInstancedNV = provider.getFunctionAddress("glDrawElementsInstancedNV");
        glDrawVkImageNV = provider.getFunctionAddress("glDrawVkImageNV");
        glGetVkProcAddrNV = provider.getFunctionAddress("glGetVkProcAddrNV");
        glWaitVkSemaphoreNV = provider.getFunctionAddress("glWaitVkSemaphoreNV");
        glSignalVkSemaphoreNV = provider.getFunctionAddress("glSignalVkSemaphoreNV");
        glSignalVkFenceNV = provider.getFunctionAddress("glSignalVkFenceNV");
        glDeleteFencesNV = provider.getFunctionAddress("glDeleteFencesNV");
        glGenFencesNV = provider.getFunctionAddress("glGenFencesNV");
        glIsFenceNV = provider.getFunctionAddress("glIsFenceNV");
        glTestFenceNV = provider.getFunctionAddress("glTestFenceNV");
        glGetFenceivNV = provider.getFunctionAddress("glGetFenceivNV");
        glFinishFenceNV = provider.getFunctionAddress("glFinishFenceNV");
        glSetFenceNV = provider.getFunctionAddress("glSetFenceNV");
        glFragmentCoverageColorNV = provider.getFunctionAddress("glFragmentCoverageColorNV");
        glBlitFramebufferNV = provider.getFunctionAddress("glBlitFramebufferNV");
        glCoverageModulationTableNV = provider.getFunctionAddress("glCoverageModulationTableNV");
        glGetCoverageModulationTableNV = provider.getFunctionAddress("glGetCoverageModulationTableNV");
        glCoverageModulationNV = provider.getFunctionAddress("glCoverageModulationNV");
        glRenderbufferStorageMultisampleNV = provider.getFunctionAddress("glRenderbufferStorageMultisampleNV");
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
        glGetUniformui64vNV = provider.getFunctionAddress("glGetUniformui64vNV");
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
        glVertexAttribDivisorNV = provider.getFunctionAddress("glVertexAttribDivisorNV");
        glGetInternalformatSampleivNV = provider.getFunctionAddress("glGetInternalformatSampleivNV");
        glGetMemoryObjectDetachedResourcesuivNV = provider.getFunctionAddress("glGetMemoryObjectDetachedResourcesuivNV");
        glResetMemoryObjectParameterNV = provider.getFunctionAddress("glResetMemoryObjectParameterNV");
        glTexAttachMemoryNV = provider.getFunctionAddress("glTexAttachMemoryNV");
        glBufferAttachMemoryNV = provider.getFunctionAddress("glBufferAttachMemoryNV");
        glTextureAttachMemoryNV = provider.getFunctionAddress("glTextureAttachMemoryNV");
        glNamedBufferAttachMemoryNV = provider.getFunctionAddress("glNamedBufferAttachMemoryNV");
        glDrawMeshTasksNV = provider.getFunctionAddress("glDrawMeshTasksNV");
        glDrawMeshTasksIndirectNV = provider.getFunctionAddress("glDrawMeshTasksIndirectNV");
        glMultiDrawMeshTasksIndirectNV = provider.getFunctionAddress("glMultiDrawMeshTasksIndirectNV");
        glUniformMatrix2x3fvNV = provider.getFunctionAddress("glUniformMatrix2x3fvNV");
        glUniformMatrix3x2fvNV = provider.getFunctionAddress("glUniformMatrix3x2fvNV");
        glUniformMatrix2x4fvNV = provider.getFunctionAddress("glUniformMatrix2x4fvNV");
        glUniformMatrix4x2fvNV = provider.getFunctionAddress("glUniformMatrix4x2fvNV");
        glUniformMatrix3x4fvNV = provider.getFunctionAddress("glUniformMatrix3x4fvNV");
        glUniformMatrix4x3fvNV = provider.getFunctionAddress("glUniformMatrix4x3fvNV");
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
        glPolygonModeNV = provider.getFunctionAddress("glPolygonModeNV");
        glReadBufferNV = provider.getFunctionAddress("glReadBufferNV");
        glFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glFramebufferSampleLocationsfvNV");
        glNamedFramebufferSampleLocationsfvNV = provider.getFunctionAddress("glNamedFramebufferSampleLocationsfvNV");
        glResolveDepthValuesNV = provider.getFunctionAddress("glResolveDepthValuesNV");
        glScissorExclusiveArrayvNV = provider.getFunctionAddress("glScissorExclusiveArrayvNV");
        glScissorExclusiveNV = provider.getFunctionAddress("glScissorExclusiveNV");
        glTexImage3DNV = provider.getFunctionAddress("glTexImage3DNV");
        glTexSubImage3DNV = provider.getFunctionAddress("glTexSubImage3DNV");
        glCopyTexSubImage3DNV = provider.getFunctionAddress("glCopyTexSubImage3DNV");
        glCompressedTexImage3DNV = provider.getFunctionAddress("glCompressedTexImage3DNV");
        glCompressedTexSubImage3DNV = provider.getFunctionAddress("glCompressedTexSubImage3DNV");
        glFramebufferTextureLayerNV = provider.getFunctionAddress("glFramebufferTextureLayerNV");
        glTextureBarrierNV = provider.getFunctionAddress("glTextureBarrierNV");
        glViewportArrayvNV = provider.getFunctionAddress("glViewportArrayvNV");
        glViewportIndexedfNV = provider.getFunctionAddress("glViewportIndexedfNV");
        glViewportIndexedfvNV = provider.getFunctionAddress("glViewportIndexedfvNV");
        glScissorArrayvNV = provider.getFunctionAddress("glScissorArrayvNV");
        glScissorIndexedNV = provider.getFunctionAddress("glScissorIndexedNV");
        glScissorIndexedvNV = provider.getFunctionAddress("glScissorIndexedvNV");
        glDepthRangeArrayfvNV = provider.getFunctionAddress("glDepthRangeArrayfvNV");
        glDepthRangeIndexedfNV = provider.getFunctionAddress("glDepthRangeIndexedfNV");
        glGetFloati_vNV = provider.getFunctionAddress("glGetFloati_vNV");
        glEnableiNV = provider.getFunctionAddress("glEnableiNV");
        glDisableiNV = provider.getFunctionAddress("glDisableiNV");
        glIsEnablediNV = provider.getFunctionAddress("glIsEnablediNV");
        glViewportSwizzleNV = provider.getFunctionAddress("glViewportSwizzleNV");
        glCopyImageSubDataOES = provider.getFunctionAddress("glCopyImageSubDataOES");
        glEnableiOES = provider.getFunctionAddress("glEnableiOES");
        glDisableiOES = provider.getFunctionAddress("glDisableiOES");
        glBlendEquationiOES = provider.getFunctionAddress("glBlendEquationiOES");
        glBlendEquationSeparateiOES = provider.getFunctionAddress("glBlendEquationSeparateiOES");
        glBlendFunciOES = provider.getFunctionAddress("glBlendFunciOES");
        glBlendFuncSeparateiOES = provider.getFunctionAddress("glBlendFuncSeparateiOES");
        glColorMaskiOES = provider.getFunctionAddress("glColorMaskiOES");
        glIsEnablediOES = provider.getFunctionAddress("glIsEnablediOES");
        glDrawElementsBaseVertexOES = provider.getFunctionAddress("glDrawElementsBaseVertexOES");
        glDrawRangeElementsBaseVertexOES = provider.getFunctionAddress("glDrawRangeElementsBaseVertexOES");
        glDrawElementsInstancedBaseVertexOES = provider.getFunctionAddress("glDrawElementsInstancedBaseVertexOES");
        glMultiDrawElementsBaseVertexOES = provider.getFunctionAddress("glMultiDrawElementsBaseVertexOES");
        glEGLImageTargetTexture2DOES = provider.getFunctionAddress("glEGLImageTargetTexture2DOES");
        glEGLImageTargetRenderbufferStorageOES = provider.getFunctionAddress("glEGLImageTargetRenderbufferStorageOES");
        glFramebufferTextureOES = provider.getFunctionAddress("glFramebufferTextureOES");
        glGetProgramBinaryOES = provider.getFunctionAddress("glGetProgramBinaryOES");
        glProgramBinaryOES = provider.getFunctionAddress("glProgramBinaryOES");
        glMapBufferOES = provider.getFunctionAddress("glMapBufferOES");
        glUnmapBufferOES = provider.getFunctionAddress("glUnmapBufferOES");
        glGetBufferPointervOES = provider.getFunctionAddress("glGetBufferPointervOES");
        glPrimitiveBoundingBoxOES = provider.getFunctionAddress("glPrimitiveBoundingBoxOES");
        glMinSampleShadingOES = provider.getFunctionAddress("glMinSampleShadingOES");
        glPatchParameteriOES = provider.getFunctionAddress("glPatchParameteriOES");
        glTexImage3DOES = provider.getFunctionAddress("glTexImage3DOES");
        glTexSubImage3DOES = provider.getFunctionAddress("glTexSubImage3DOES");
        glCopyTexSubImage3DOES = provider.getFunctionAddress("glCopyTexSubImage3DOES");
        glCompressedTexImage3DOES = provider.getFunctionAddress("glCompressedTexImage3DOES");
        glCompressedTexSubImage3DOES = provider.getFunctionAddress("glCompressedTexSubImage3DOES");
        glFramebufferTexture3DOES = provider.getFunctionAddress("glFramebufferTexture3DOES");
        glTexParameterIivOES = provider.getFunctionAddress("glTexParameterIivOES");
        glTexParameterIuivOES = provider.getFunctionAddress("glTexParameterIuivOES");
        glGetTexParameterIivOES = provider.getFunctionAddress("glGetTexParameterIivOES");
        glGetTexParameterIuivOES = provider.getFunctionAddress("glGetTexParameterIuivOES");
        glSamplerParameterIivOES = provider.getFunctionAddress("glSamplerParameterIivOES");
        glSamplerParameterIuivOES = provider.getFunctionAddress("glSamplerParameterIuivOES");
        glGetSamplerParameterIivOES = provider.getFunctionAddress("glGetSamplerParameterIivOES");
        glGetSamplerParameterIuivOES = provider.getFunctionAddress("glGetSamplerParameterIuivOES");
        glTexBufferOES = provider.getFunctionAddress("glTexBufferOES");
        glTexBufferRangeOES = provider.getFunctionAddress("glTexBufferRangeOES");
        glTexStorage3DMultisampleOES = provider.getFunctionAddress("glTexStorage3DMultisampleOES");
        glTextureViewOES = provider.getFunctionAddress("glTextureViewOES");
        glBindVertexArrayOES = provider.getFunctionAddress("glBindVertexArrayOES");
        glDeleteVertexArraysOES = provider.getFunctionAddress("glDeleteVertexArraysOES");
        glGenVertexArraysOES = provider.getFunctionAddress("glGenVertexArraysOES");
        glIsVertexArrayOES = provider.getFunctionAddress("glIsVertexArrayOES");
        glViewportArrayvOES = provider.getFunctionAddress("glViewportArrayvOES");
        glViewportIndexedfOES = provider.getFunctionAddress("glViewportIndexedfOES");
        glViewportIndexedfvOES = provider.getFunctionAddress("glViewportIndexedfvOES");
        glScissorArrayvOES = provider.getFunctionAddress("glScissorArrayvOES");
        glScissorIndexedOES = provider.getFunctionAddress("glScissorIndexedOES");
        glScissorIndexedvOES = provider.getFunctionAddress("glScissorIndexedvOES");
        glDepthRangeArrayfvOES = provider.getFunctionAddress("glDepthRangeArrayfvOES");
        glDepthRangeIndexedfOES = provider.getFunctionAddress("glDepthRangeIndexedfOES");
        glGetFloati_vOES = provider.getFunctionAddress("glGetFloati_vOES");
        glFramebufferTextureMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultiviewOVR");
        glFramebufferTextureMultisampleMultiviewOVR = provider.getFunctionAddress("glFramebufferTextureMultisampleMultiviewOVR");
        glAlphaFuncQCOM = provider.getFunctionAddress("glAlphaFuncQCOM");
        glGetDriverControlsQCOM = provider.getFunctionAddress("glGetDriverControlsQCOM");
        glGetDriverControlStringQCOM = provider.getFunctionAddress("glGetDriverControlStringQCOM");
        glEnableDriverControlQCOM = provider.getFunctionAddress("glEnableDriverControlQCOM");
        glDisableDriverControlQCOM = provider.getFunctionAddress("glDisableDriverControlQCOM");
        glExtGetTexturesQCOM = provider.getFunctionAddress("glExtGetTexturesQCOM");
        glExtGetBuffersQCOM = provider.getFunctionAddress("glExtGetBuffersQCOM");
        glExtGetRenderbuffersQCOM = provider.getFunctionAddress("glExtGetRenderbuffersQCOM");
        glExtGetFramebuffersQCOM = provider.getFunctionAddress("glExtGetFramebuffersQCOM");
        glExtGetTexLevelParameterivQCOM = provider.getFunctionAddress("glExtGetTexLevelParameterivQCOM");
        glExtTexObjectStateOverrideiQCOM = provider.getFunctionAddress("glExtTexObjectStateOverrideiQCOM");
        glExtGetTexSubImageQCOM = provider.getFunctionAddress("glExtGetTexSubImageQCOM");
        glExtGetBufferPointervQCOM = provider.getFunctionAddress("glExtGetBufferPointervQCOM");
        glExtGetShadersQCOM = provider.getFunctionAddress("glExtGetShadersQCOM");
        glExtGetProgramsQCOM = provider.getFunctionAddress("glExtGetProgramsQCOM");
        glExtIsProgramBinaryQCOM = provider.getFunctionAddress("glExtIsProgramBinaryQCOM");
        glExtGetProgramBinarySourceQCOM = provider.getFunctionAddress("glExtGetProgramBinarySourceQCOM");
        glFramebufferFoveationConfigQCOM = provider.getFunctionAddress("glFramebufferFoveationConfigQCOM");
        glFramebufferFoveationParametersQCOM = provider.getFunctionAddress("glFramebufferFoveationParametersQCOM");
        glFramebufferFetchBarrierQCOM = provider.getFunctionAddress("glFramebufferFetchBarrierQCOM");
        glTextureFoveationParametersQCOM = provider.getFunctionAddress("glTextureFoveationParametersQCOM");
        glStartTilingQCOM = provider.getFunctionAddress("glStartTilingQCOM");
        glEndTilingQCOM = provider.getFunctionAddress("glEndTilingQCOM");

        GLES20 = ext.contains("GLES20") && checkExtension("GLES20", org.lwjgl.opengles.GLES20.isAvailable(this));
        GLES30 = ext.contains("GLES30") && checkExtension("GLES30", org.lwjgl.opengles.GLES30.isAvailable(this));
        GLES31 = ext.contains("GLES31") && checkExtension("GLES31", org.lwjgl.opengles.GLES31.isAvailable(this));
        GLES32 = ext.contains("GLES32") && checkExtension("GLES32", org.lwjgl.opengles.GLES32.isAvailable(this));
        GL_AMD_compressed_3DC_texture = ext.contains("GL_AMD_compressed_3DC_texture");
        GL_AMD_compressed_ATC_texture = ext.contains("GL_AMD_compressed_ATC_texture");
        GL_AMD_framebuffer_multisample_advanced = ext.contains("GL_AMD_framebuffer_multisample_advanced") && checkExtension("GL_AMD_framebuffer_multisample_advanced", AMDFramebufferMultisampleAdvanced.isAvailable(this));
        GL_AMD_performance_monitor = ext.contains("GL_AMD_performance_monitor") && checkExtension("GL_AMD_performance_monitor", AMDPerformanceMonitor.isAvailable(this));
        GL_AMD_program_binary_Z400 = ext.contains("GL_AMD_program_binary_Z400");
        GL_ANDROID_extension_pack_es31a = ext.contains("GL_ANDROID_extension_pack_es31a");
        GL_ANGLE_depth_texture = ext.contains("GL_ANGLE_depth_texture");
        GL_ANGLE_framebuffer_blit = ext.contains("GL_ANGLE_framebuffer_blit") && checkExtension("GL_ANGLE_framebuffer_blit", ANGLEFramebufferBlit.isAvailable(this));
        GL_ANGLE_framebuffer_multisample = ext.contains("GL_ANGLE_framebuffer_multisample") && checkExtension("GL_ANGLE_framebuffer_multisample", ANGLEFramebufferMultisample.isAvailable(this));
        GL_ANGLE_instanced_arrays = ext.contains("GL_ANGLE_instanced_arrays") && checkExtension("GL_ANGLE_instanced_arrays", ANGLEInstancedArrays.isAvailable(this));
        GL_ANGLE_pack_reverse_row_order = ext.contains("GL_ANGLE_pack_reverse_row_order");
        GL_ANGLE_program_binary = ext.contains("GL_ANGLE_program_binary");
        GL_ANGLE_texture_compression_dxt1 = ext.contains("GL_ANGLE_texture_compression_dxt1");
        GL_ANGLE_texture_compression_dxt3 = ext.contains("GL_ANGLE_texture_compression_dxt3");
        GL_ANGLE_texture_compression_dxt5 = ext.contains("GL_ANGLE_texture_compression_dxt5");
        GL_ANGLE_texture_usage = ext.contains("GL_ANGLE_texture_usage");
        GL_ANGLE_translated_shader_source = ext.contains("GL_ANGLE_translated_shader_source") && checkExtension("GL_ANGLE_translated_shader_source", ANGLETranslatedShaderSource.isAvailable(this));
        GL_APPLE_clip_distance = ext.contains("GL_APPLE_clip_distance");
        GL_APPLE_color_buffer_packed_float = ext.contains("GL_APPLE_color_buffer_packed_float");
        GL_APPLE_copy_texture_levels = ext.contains("GL_APPLE_copy_texture_levels") && checkExtension("GL_APPLE_copy_texture_levels", APPLECopyTextureLevels.isAvailable(this));
        GL_APPLE_framebuffer_multisample = ext.contains("GL_APPLE_framebuffer_multisample") && checkExtension("GL_APPLE_framebuffer_multisample", APPLEFramebufferMultisample.isAvailable(this));
        GL_APPLE_rgb_422 = ext.contains("GL_APPLE_rgb_422");
        GL_APPLE_sync = ext.contains("GL_APPLE_sync") && checkExtension("GL_APPLE_sync", APPLESync.isAvailable(this));
        GL_APPLE_texture_format_BGRA8888 = ext.contains("GL_APPLE_texture_format_BGRA8888");
        GL_APPLE_texture_max_level = ext.contains("GL_APPLE_texture_max_level");
        GL_APPLE_texture_packed_float = ext.contains("GL_APPLE_texture_packed_float");
        GL_ARM_mali_program_binary = ext.contains("GL_ARM_mali_program_binary");
        GL_ARM_mali_shader_binary = ext.contains("GL_ARM_mali_shader_binary");
        GL_ARM_rgba8 = ext.contains("GL_ARM_rgba8");
        GL_ARM_shader_framebuffer_fetch = ext.contains("GL_ARM_shader_framebuffer_fetch");
        GL_ARM_shader_framebuffer_fetch_depth_stencil = ext.contains("GL_ARM_shader_framebuffer_fetch_depth_stencil");
        GL_DMP_program_binary = ext.contains("GL_DMP_program_binary");
        GL_DMP_shader_binary = ext.contains("GL_DMP_shader_binary");
        GL_EXT_base_instance = ext.contains("GL_EXT_base_instance") && checkExtension("GL_EXT_base_instance", EXTBaseInstance.isAvailable(this));
        GL_EXT_blend_func_extended = ext.contains("GL_EXT_blend_func_extended") && checkExtension("GL_EXT_blend_func_extended", EXTBlendFuncExtended.isAvailable(this));
        GL_EXT_blend_minmax = ext.contains("GL_EXT_blend_minmax");
        GL_EXT_buffer_storage = ext.contains("GL_EXT_buffer_storage") && checkExtension("GL_EXT_buffer_storage", EXTBufferStorage.isAvailable(this, ext));
        GL_EXT_clear_texture = ext.contains("GL_EXT_clear_texture") && checkExtension("GL_EXT_clear_texture", EXTClearTexture.isAvailable(this));
        GL_EXT_clip_control = ext.contains("GL_EXT_clip_control") && checkExtension("GL_EXT_clip_control", EXTClipControl.isAvailable(this));
        GL_EXT_clip_cull_distance = ext.contains("GL_EXT_clip_cull_distance");
        GL_EXT_color_buffer_float = ext.contains("GL_EXT_color_buffer_float");
        GL_EXT_color_buffer_half_float = ext.contains("GL_EXT_color_buffer_half_float");
        GL_EXT_compressed_ETC1_RGB8_sub_texture = ext.contains("GL_EXT_compressed_ETC1_RGB8_sub_texture");
        GL_EXT_conservative_depth = ext.contains("GL_EXT_conservative_depth");
        GL_EXT_copy_image = ext.contains("GL_EXT_copy_image") && checkExtension("GL_EXT_copy_image", EXTCopyImage.isAvailable(this));
        GL_EXT_debug_label = ext.contains("GL_EXT_debug_label") && checkExtension("GL_EXT_debug_label", EXTDebugLabel.isAvailable(this));
        GL_EXT_debug_marker = ext.contains("GL_EXT_debug_marker") && checkExtension("GL_EXT_debug_marker", EXTDebugMarker.isAvailable(this));
        GL_EXT_depth_clamp = ext.contains("GL_EXT_depth_clamp");
        GL_EXT_discard_framebuffer = ext.contains("GL_EXT_discard_framebuffer") && checkExtension("GL_EXT_discard_framebuffer", EXTDiscardFramebuffer.isAvailable(this));
        GL_EXT_disjoint_timer_query = ext.contains("GL_EXT_disjoint_timer_query") && checkExtension("GL_EXT_disjoint_timer_query", EXTDisjointTimerQuery.isAvailable(this));
        GL_EXT_draw_buffers = ext.contains("GL_EXT_draw_buffers") && checkExtension("GL_EXT_draw_buffers", EXTDrawBuffers.isAvailable(this));
        GL_EXT_draw_buffers_indexed = ext.contains("GL_EXT_draw_buffers_indexed") && checkExtension("GL_EXT_draw_buffers_indexed", EXTDrawBuffersIndexed.isAvailable(this));
        GL_EXT_draw_elements_base_vertex = ext.contains("GL_EXT_draw_elements_base_vertex") && checkExtension("GL_EXT_draw_elements_base_vertex", EXTDrawElementsBaseVertex.isAvailable(this, ext));
        GL_EXT_draw_instanced = ext.contains("GL_EXT_draw_instanced") && checkExtension("GL_EXT_draw_instanced", EXTDrawInstanced.isAvailable(this));
        GL_EXT_draw_transform_feedback = ext.contains("GL_EXT_draw_transform_feedback") && checkExtension("GL_EXT_draw_transform_feedback", EXTDrawTransformFeedback.isAvailable(this));
        GL_EXT_EGL_image_array = ext.contains("GL_EXT_EGL_image_array");
        GL_EXT_EGL_image_external_wrap_modes = ext.contains("GL_EXT_EGL_image_external_wrap_modes");
        GL_EXT_EGL_image_storage = ext.contains("GL_EXT_EGL_image_storage") && checkExtension("GL_EXT_EGL_image_storage", EXTEGLImageStorage.isAvailable(this, ext));
        GL_EXT_external_buffer = ext.contains("GL_EXT_external_buffer") && checkExtension("GL_EXT_external_buffer", EXTExternalBuffer.isAvailable(this, ext));
        GL_EXT_float_blend = ext.contains("GL_EXT_float_blend");
        GL_EXT_geometry_point_size = ext.contains("GL_EXT_geometry_point_size");
        GL_EXT_geometry_shader = ext.contains("GL_EXT_geometry_shader") && checkExtension("GL_EXT_geometry_shader", EXTGeometryShader.isAvailable(this));
        GL_EXT_gpu_shader5 = ext.contains("GL_EXT_gpu_shader5");
        GL_EXT_instanced_arrays = ext.contains("GL_EXT_instanced_arrays") && checkExtension("GL_EXT_instanced_arrays", EXTInstancedArrays.isAvailable(this));
        GL_EXT_map_buffer_range = ext.contains("GL_EXT_map_buffer_range") && checkExtension("GL_EXT_map_buffer_range", EXTMapBufferRange.isAvailable(this));
        GL_EXT_memory_object = ext.contains("GL_EXT_memory_object") && checkExtension("GL_EXT_memory_object", EXTMemoryObject.isAvailable(this, ext));
        GL_EXT_memory_object_fd = ext.contains("GL_EXT_memory_object_fd") && checkExtension("GL_EXT_memory_object_fd", EXTMemoryObjectFD.isAvailable(this));
        GL_EXT_memory_object_win32 = ext.contains("GL_EXT_memory_object_win32") && checkExtension("GL_EXT_memory_object_win32", EXTMemoryObjectWin32.isAvailable(this));
        GL_EXT_multi_draw_arrays = ext.contains("GL_EXT_multi_draw_arrays") && checkExtension("GL_EXT_multi_draw_arrays", EXTMultiDrawArrays.isAvailable(this));
        GL_EXT_multi_draw_indirect = ext.contains("GL_EXT_multi_draw_indirect") && checkExtension("GL_EXT_multi_draw_indirect", EXTMultiDrawIndirect.isAvailable(this));
        GL_EXT_multisample_compatibility = ext.contains("GL_EXT_multisample_compatibility");
        GL_EXT_multisampled_render_to_texture = ext.contains("GL_EXT_multisampled_render_to_texture") && checkExtension("GL_EXT_multisampled_render_to_texture", EXTMultisampledRenderToTexture.isAvailable(this));
        GL_EXT_multisampled_render_to_texture2 = ext.contains("GL_EXT_multisampled_render_to_texture2");
        GL_EXT_multiview_draw_buffers = ext.contains("GL_EXT_multiview_draw_buffers") && checkExtension("GL_EXT_multiview_draw_buffers", EXTMultiviewDrawBuffers.isAvailable(this));
        GL_EXT_multiview_tessellation_geometry_shader = ext.contains("GL_EXT_multiview_tessellation_geometry_shader");
        GL_EXT_multiview_texture_multisample = ext.contains("GL_EXT_multiview_texture_multisample");
        GL_EXT_multiview_timer_query = ext.contains("GL_EXT_multiview_timer_query");
        GL_EXT_occlusion_query_boolean = ext.contains("GL_EXT_occlusion_query_boolean") && checkExtension("GL_EXT_occlusion_query_boolean", EXTOcclusionQueryBoolean.isAvailable(this));
        GL_EXT_polygon_offset_clamp = ext.contains("GL_EXT_polygon_offset_clamp") && checkExtension("GL_EXT_polygon_offset_clamp", EXTPolygonOffsetClamp.isAvailable(this));
        GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
        GL_EXT_primitive_bounding_box = ext.contains("GL_EXT_primitive_bounding_box") && checkExtension("GL_EXT_primitive_bounding_box", EXTPrimitiveBoundingBox.isAvailable(this));
        GL_EXT_protected_textures = ext.contains("GL_EXT_protected_textures");
        GL_EXT_pvrtc_sRGB = ext.contains("GL_EXT_pvrtc_sRGB");
        GL_EXT_raster_multisample = ext.contains("GL_EXT_raster_multisample") && checkExtension("GL_EXT_raster_multisample", EXTRasterMultisample.isAvailable(this));
        GL_EXT_read_format_bgra = ext.contains("GL_EXT_read_format_bgra");
        GL_EXT_render_snorm = ext.contains("GL_EXT_render_snorm");
        GL_EXT_robustness = ext.contains("GL_EXT_robustness") && checkExtension("GL_EXT_robustness", EXTRobustness.isAvailable(this));
        GL_EXT_semaphore = ext.contains("GL_EXT_semaphore") && checkExtension("GL_EXT_semaphore", EXTSemaphore.isAvailable(this));
        GL_EXT_semaphore_fd = ext.contains("GL_EXT_semaphore_fd") && checkExtension("GL_EXT_semaphore_fd", EXTSemaphoreFD.isAvailable(this));
        GL_EXT_semaphore_win32 = ext.contains("GL_EXT_semaphore_win32") && checkExtension("GL_EXT_semaphore_win32", EXTSemaphoreWin32.isAvailable(this));
        GL_EXT_separate_shader_objects = ext.contains("GL_EXT_separate_shader_objects") && checkExtension("GL_EXT_separate_shader_objects", EXTSeparateShaderObjects.isAvailable(this));
        GL_EXT_shader_framebuffer_fetch = ext.contains("GL_EXT_shader_framebuffer_fetch");
        GL_EXT_shader_framebuffer_fetch_non_coherent = ext.contains("GL_EXT_shader_framebuffer_fetch_non_coherent") && checkExtension("GL_EXT_shader_framebuffer_fetch_non_coherent", EXTShaderFramebufferFetchNonCoherent.isAvailable(this));
        GL_EXT_shader_group_vote = ext.contains("GL_EXT_shader_group_vote");
        GL_EXT_shader_implicit_conversions = ext.contains("GL_EXT_shader_implicit_conversions");
        GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
        GL_EXT_shader_io_blocks = ext.contains("GL_EXT_shader_io_blocks");
        GL_EXT_shader_non_constant_global_initializers = ext.contains("GL_EXT_shader_non_constant_global_initializers");
        GL_EXT_shader_pixel_local_storage = ext.contains("GL_EXT_shader_pixel_local_storage");
        GL_EXT_shader_pixel_local_storage2 = ext.contains("GL_EXT_shader_pixel_local_storage2") && checkExtension("GL_EXT_shader_pixel_local_storage2", EXTShaderPixelLocalStorage2.isAvailable(this));
        GL_EXT_shader_texture_lod = ext.contains("GL_EXT_shader_texture_lod");
        GL_EXT_shadow_samplers = ext.contains("GL_EXT_shadow_samplers");
        GL_EXT_sparse_texture = ext.contains("GL_EXT_sparse_texture") && checkExtension("GL_EXT_sparse_texture", EXTSparseTexture.isAvailable(this));
        GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
        GL_EXT_sRGB = ext.contains("GL_EXT_sRGB");
        GL_EXT_sRGB_write_control = ext.contains("GL_EXT_sRGB_write_control");
        GL_EXT_tessellation_point_size = ext.contains("GL_EXT_tessellation_point_size");
        GL_EXT_tessellation_shader = ext.contains("GL_EXT_tessellation_shader") && checkExtension("GL_EXT_tessellation_shader", EXTTessellationShader.isAvailable(this));
        GL_EXT_texture_border_clamp = ext.contains("GL_EXT_texture_border_clamp") && checkExtension("GL_EXT_texture_border_clamp", EXTTextureBorderClamp.isAvailable(this));
        GL_EXT_texture_buffer = ext.contains("GL_EXT_texture_buffer") && checkExtension("GL_EXT_texture_buffer", EXTTextureBuffer.isAvailable(this));
        GL_EXT_texture_compression_astc_decode_mode = ext.contains("GL_EXT_texture_compression_astc_decode_mode");
        GL_EXT_texture_compression_bptc = ext.contains("GL_EXT_texture_compression_bptc");
        GL_EXT_texture_compression_dxt1 = ext.contains("GL_EXT_texture_compression_dxt1");
        GL_EXT_texture_compression_rgtc = ext.contains("GL_EXT_texture_compression_rgtc");
        GL_EXT_texture_compression_s3tc = ext.contains("GL_EXT_texture_compression_s3tc");
        GL_EXT_texture_compression_s3tc_srgb = ext.contains("GL_EXT_texture_compression_s3tc_srgb");
        GL_EXT_texture_cube_map_array = ext.contains("GL_EXT_texture_cube_map_array");
        GL_EXT_texture_filter_anisotropic = ext.contains("GL_EXT_texture_filter_anisotropic");
        GL_EXT_texture_filter_minmax = ext.contains("GL_EXT_texture_filter_minmax");
        GL_EXT_texture_format_BGRA8888 = ext.contains("GL_EXT_texture_format_BGRA8888");
        GL_EXT_texture_format_sRGB_override = ext.contains("GL_EXT_texture_format_sRGB_override");
        GL_EXT_texture_mirror_clamp_to_edge = ext.contains("GL_EXT_texture_mirror_clamp_to_edge");
        GL_EXT_texture_norm16 = ext.contains("GL_EXT_texture_norm16");
        GL_EXT_texture_rg = ext.contains("GL_EXT_texture_rg");
        GL_EXT_texture_shadow_lod = ext.contains("GL_EXT_texture_shadow_lod");
        GL_EXT_texture_sRGB_decode = ext.contains("GL_EXT_texture_sRGB_decode");
        GL_EXT_texture_sRGB_R8 = ext.contains("GL_EXT_texture_sRGB_R8");
        GL_EXT_texture_sRGB_RG8 = ext.contains("GL_EXT_texture_sRGB_RG8");
        GL_EXT_texture_storage = ext.contains("GL_EXT_texture_storage") && checkExtension("GL_EXT_texture_storage", EXTTextureStorage.isAvailable(this, ext));
        GL_EXT_texture_type_2_10_10_10_REV = ext.contains("GL_EXT_texture_type_2_10_10_10_REV");
        GL_EXT_texture_view = ext.contains("GL_EXT_texture_view") && checkExtension("GL_EXT_texture_view", EXTTextureView.isAvailable(this));
        GL_EXT_unpack_subimage = ext.contains("GL_EXT_unpack_subimage");
        GL_EXT_win32_keyed_mutex = ext.contains("GL_EXT_win32_keyed_mutex") && checkExtension("GL_EXT_win32_keyed_mutex", EXTWin32KeyedMutex.isAvailable(this));
        GL_EXT_window_rectangles = ext.contains("GL_EXT_window_rectangles") && checkExtension("GL_EXT_window_rectangles", EXTWindowRectangles.isAvailable(this));
        GL_EXT_YUV_target = ext.contains("GL_EXT_YUV_target");
        GL_FJ_shader_binary_GCCSO = ext.contains("GL_FJ_shader_binary_GCCSO");
        GL_EXT_texture_compression_astc_decode_mode_rgb9e5 = ext.contains("GL_EXT_texture_compression_astc_decode_mode_rgb9e5");
        GL_EXT_texture_query_lod = ext.contains("GL_EXT_texture_query_lod");
        GL_IMG_framebuffer_downsample = ext.contains("GL_IMG_framebuffer_downsample") && checkExtension("GL_IMG_framebuffer_downsample", IMGFramebufferDownsample.isAvailable(this));
        GL_IMG_multisampled_render_to_texture = ext.contains("GL_IMG_multisampled_render_to_texture") && checkExtension("GL_IMG_multisampled_render_to_texture", IMGMultisampledRenderToTexture.isAvailable(this));
        GL_IMG_program_binary = ext.contains("GL_IMG_program_binary");
        GL_IMG_read_format = ext.contains("GL_IMG_read_format");
        GL_IMG_shader_binary = ext.contains("GL_IMG_shader_binary");
        GL_IMG_texture_compression_pvrtc = ext.contains("GL_IMG_texture_compression_pvrtc");
        GL_IMG_texture_compression_pvrtc2 = ext.contains("GL_IMG_texture_compression_pvrtc2");
        GL_IMG_texture_filter_cubic = ext.contains("GL_IMG_texture_filter_cubic");
        GL_INTEL_blackhole_render = ext.contains("GL_INTEL_blackhole_render");
        GL_INTEL_conservative_rasterization = ext.contains("GL_INTEL_conservative_rasterization");
        GL_INTEL_framebuffer_CMAA = ext.contains("GL_INTEL_framebuffer_CMAA") && checkExtension("GL_INTEL_framebuffer_CMAA", INTELFramebufferCMAA.isAvailable(this));
        GL_INTEL_performance_query = ext.contains("GL_INTEL_performance_query") && checkExtension("GL_INTEL_performance_query", INTELPerformanceQuery.isAvailable(this));
        GL_INTEL_shader_integer_functions2 = ext.contains("GL_INTEL_shader_integer_functions2");
        GL_KHR_blend_equation_advanced = ext.contains("GL_KHR_blend_equation_advanced") && checkExtension("GL_KHR_blend_equation_advanced", KHRBlendEquationAdvanced.isAvailable(this));
        GL_KHR_blend_equation_advanced_coherent = ext.contains("GL_KHR_blend_equation_advanced_coherent");
        GL_KHR_context_flush_control = ext.contains("GL_KHR_context_flush_control");
        GL_KHR_debug = ext.contains("GL_KHR_debug") && checkExtension("GL_KHR_debug", KHRDebug.isAvailable(this));
        GL_KHR_no_error = ext.contains("GL_KHR_no_error");
        GL_KHR_parallel_shader_compile = ext.contains("GL_KHR_parallel_shader_compile") && checkExtension("GL_KHR_parallel_shader_compile", KHRParallelShaderCompile.isAvailable(this));
        GL_KHR_robust_buffer_access_behavior = ext.contains("GL_KHR_robust_buffer_access_behavior");
        GL_KHR_robustness = ext.contains("GL_KHR_robustness") && checkExtension("GL_KHR_robustness", KHRRobustness.isAvailable(this));
        GL_KHR_shader_subgroup = ext.contains("GL_KHR_shader_subgroup");
        GL_KHR_texture_compression_astc_hdr = ext.contains("GL_KHR_texture_compression_astc_hdr");
        GL_KHR_texture_compression_astc_ldr = ext.contains("GL_KHR_texture_compression_astc_ldr");
        GL_KHR_texture_compression_astc_sliced_3d = ext.contains("GL_KHR_texture_compression_astc_sliced_3d");
        GL_NV_alpha_to_coverage_dither_control = ext.contains("GL_NV_alpha_to_coverage_dither_control") && checkExtension("GL_NV_alpha_to_coverage_dither_control", NVAlphaToCoverageDitherControl.isAvailable(this));
        GL_NV_bindless_texture = ext.contains("GL_NV_bindless_texture") && checkExtension("GL_NV_bindless_texture", NVBindlessTexture.isAvailable(this));
        GL_NV_blend_equation_advanced = ext.contains("GL_NV_blend_equation_advanced") && checkExtension("GL_NV_blend_equation_advanced", NVBlendEquationAdvanced.isAvailable(this));
        GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
        GL_NV_blend_minmax_factor = ext.contains("GL_NV_blend_minmax_factor");
        GL_NV_clip_space_w_scaling = ext.contains("GL_NV_clip_space_w_scaling") && checkExtension("GL_NV_clip_space_w_scaling", NVClipSpaceWScaling.isAvailable(this));
        GL_NV_compute_shader_derivatives = ext.contains("GL_NV_compute_shader_derivatives");
        GL_NV_conditional_render = ext.contains("GL_NV_conditional_render") && checkExtension("GL_NV_conditional_render", NVConditionalRender.isAvailable(this));
        GL_NV_conservative_raster = ext.contains("GL_NV_conservative_raster") && checkExtension("GL_NV_conservative_raster", NVConservativeRaster.isAvailable(this));
        GL_NV_conservative_raster_pre_snap = ext.contains("GL_NV_conservative_raster_pre_snap");
        GL_NV_conservative_raster_pre_snap_triangles = ext.contains("GL_NV_conservative_raster_pre_snap_triangles") && checkExtension("GL_NV_conservative_raster_pre_snap_triangles", NVConservativeRasterPreSnapTriangles.isAvailable(this));
        GL_NV_copy_buffer = ext.contains("GL_NV_copy_buffer") && checkExtension("GL_NV_copy_buffer", NVCopyBuffer.isAvailable(this));
        GL_NV_coverage_sample = ext.contains("GL_NV_coverage_sample") && checkExtension("GL_NV_coverage_sample", NVCoverageSample.isAvailable(this));
        GL_NV_depth_nonlinear = ext.contains("GL_NV_depth_nonlinear");
        GL_NV_draw_buffers = ext.contains("GL_NV_draw_buffers") && checkExtension("GL_NV_draw_buffers", NVDrawBuffers.isAvailable(this));
        GL_NV_draw_instanced = ext.contains("GL_NV_draw_instanced") && checkExtension("GL_NV_draw_instanced", NVDrawInstanced.isAvailable(this));
        GL_NV_draw_vulkan_image = ext.contains("GL_NV_draw_vulkan_image") && checkExtension("GL_NV_draw_vulkan_image", NVDrawVulkanImage.isAvailable(this));
        GL_NV_explicit_attrib_location = ext.contains("GL_NV_explicit_attrib_location");
        GL_NV_fbo_color_attachments = ext.contains("GL_NV_fbo_color_attachments");
        GL_NV_fence = ext.contains("GL_NV_fence") && checkExtension("GL_NV_fence", NVFence.isAvailable(this));
        GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
        GL_NV_fragment_coverage_to_color = ext.contains("GL_NV_fragment_coverage_to_color") && checkExtension("GL_NV_fragment_coverage_to_color", NVFragmentCoverageToColor.isAvailable(this));
        GL_NV_fragment_shader_barycentric = ext.contains("GL_NV_fragment_shader_barycentric");
        GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
        GL_NV_framebuffer_blit = ext.contains("GL_NV_framebuffer_blit") && checkExtension("GL_NV_framebuffer_blit", NVFramebufferBlit.isAvailable(this));
        GL_NV_framebuffer_mixed_samples = ext.contains("GL_NV_framebuffer_mixed_samples") && checkExtension("GL_NV_framebuffer_mixed_samples", NVFramebufferMixedSamples.isAvailable(this));
        GL_NV_framebuffer_multisample = ext.contains("GL_NV_framebuffer_multisample") && checkExtension("GL_NV_framebuffer_multisample", NVFramebufferMultisample.isAvailable(this));
        GL_NV_generate_mipmap_sRGB = ext.contains("GL_NV_generate_mipmap_sRGB");
        GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
        GL_NV_gpu_shader5 = ext.contains("GL_NV_gpu_shader5") && checkExtension("GL_NV_gpu_shader5", NVGPUShader5.isAvailable(this));
        GL_NV_image_formats = ext.contains("GL_NV_image_formats");
        GL_NV_instanced_arrays = ext.contains("GL_NV_instanced_arrays") && checkExtension("GL_NV_instanced_arrays", NVInstancedArrays.isAvailable(this));
        GL_NV_internalformat_sample_query = ext.contains("GL_NV_internalformat_sample_query") && checkExtension("GL_NV_internalformat_sample_query", NVInternalformatSampleQuery.isAvailable(this));
        GL_NV_memory_attachment = ext.contains("GL_NV_memory_attachment") && checkExtension("GL_NV_memory_attachment", NVMemoryAttachment.isAvailable(this, ext));
        GL_NV_mesh_shader = ext.contains("GL_NV_mesh_shader") && checkExtension("GL_NV_mesh_shader", NVMeshShader.isAvailable(this));
        GL_NV_non_square_matrices = ext.contains("GL_NV_non_square_matrices") && checkExtension("GL_NV_non_square_matrices", NVNonSquareMatrices.isAvailable(this));
        GL_NV_path_rendering = ext.contains("GL_NV_path_rendering") && checkExtension("GL_NV_path_rendering", NVPathRendering.isAvailable(this));
        GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
        GL_NV_polygon_mode = ext.contains("GL_NV_polygon_mode") && checkExtension("GL_NV_polygon_mode", NVPolygonMode.isAvailable(this));
        GL_NV_read_buffer = ext.contains("GL_NV_read_buffer") && checkExtension("GL_NV_read_buffer", NVReadBuffer.isAvailable(this));
        GL_NV_read_buffer_front = ext.contains("GL_NV_read_buffer_front");
        GL_NV_read_depth = ext.contains("GL_NV_read_depth");
        GL_NV_read_depth_stencil = ext.contains("GL_NV_read_depth_stencil");
        GL_NV_read_stencil = ext.contains("GL_NV_read_stencil");
        GL_NV_representative_fragment_test = ext.contains("GL_NV_representative_fragment_test");
        GL_NV_sample_locations = ext.contains("GL_NV_sample_locations") && checkExtension("GL_NV_sample_locations", NVSampleLocations.isAvailable(this));
        GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
        GL_NV_scissor_exclusive = ext.contains("GL_NV_scissor_exclusive") && checkExtension("GL_NV_scissor_exclusive", NVScissorExclusive.isAvailable(this));
        GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
        GL_NV_shader_noperspective_interpolation = ext.contains("GL_NV_shader_noperspective_interpolation");
        GL_NV_shader_subgroup_partitioned = ext.contains("GL_NV_shader_subgroup_partitioned");
        GL_NV_shader_texture_footprint = ext.contains("GL_NV_shader_texture_footprint");
        GL_NV_shadow_samplers_array = ext.contains("GL_NV_shadow_samplers_array");
        GL_NV_shadow_samplers_cube = ext.contains("GL_NV_shadow_samplers_cube");
        GL_NV_sRGB_formats = ext.contains("GL_NV_sRGB_formats");
        GL_NV_stereo_view_rendering = ext.contains("GL_NV_stereo_view_rendering");
        GL_NV_texture_array = ext.contains("GL_NV_texture_array") && checkExtension("GL_NV_texture_array", NVTextureArray.isAvailable(this));
        GL_NV_texture_barrier = ext.contains("GL_NV_texture_barrier") && checkExtension("GL_NV_texture_barrier", NVTextureBarrier.isAvailable(this));
        GL_NV_texture_border_clamp = ext.contains("GL_NV_texture_border_clamp");
        GL_NV_texture_compression_s3tc = ext.contains("GL_NV_texture_compression_s3tc");
        GL_NV_texture_compression_s3tc_update = ext.contains("GL_NV_texture_compression_s3tc_update");
        GL_NV_texture_npot_2D_mipmap = ext.contains("GL_NV_texture_npot_2D_mipmap");
        GL_NV_viewport_array = ext.contains("GL_NV_viewport_array") && checkExtension("GL_NV_viewport_array", NVViewportArray.isAvailable(this));
        GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
        GL_NV_viewport_swizzle = ext.contains("GL_NV_viewport_swizzle") && checkExtension("GL_NV_viewport_swizzle", NVViewportSwizzle.isAvailable(this));
        GL_NVX_blend_equation_advanced_multi_draw_buffers = ext.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
        GL_OES_compressed_ETC1_RGB8_texture = ext.contains("GL_OES_compressed_ETC1_RGB8_texture");
        GL_OES_compressed_paletted_texture = ext.contains("GL_OES_compressed_paletted_texture");
        GL_OES_copy_image = ext.contains("GL_OES_copy_image") && checkExtension("GL_OES_copy_image", OESCopyImage.isAvailable(this));
        GL_OES_depth24 = ext.contains("GL_OES_depth24");
        GL_OES_depth32 = ext.contains("GL_OES_depth32");
        GL_OES_depth_texture = ext.contains("GL_OES_depth_texture");
        GL_OES_depth_texture_cube_map = ext.contains("GL_OES_depth_texture_cube_map");
        GL_OES_draw_buffers_indexed = ext.contains("GL_OES_draw_buffers_indexed") && checkExtension("GL_OES_draw_buffers_indexed", OESDrawBuffersIndexed.isAvailable(this));
        GL_OES_draw_elements_base_vertex = ext.contains("GL_OES_draw_elements_base_vertex") && checkExtension("GL_OES_draw_elements_base_vertex", OESDrawElementsBaseVertex.isAvailable(this, ext));
        GL_OES_EGL_image = ext.contains("GL_OES_EGL_image") && checkExtension("GL_OES_EGL_image", OESEGLImage.isAvailable(this));
        GL_OES_EGL_image_external = ext.contains("GL_OES_EGL_image_external");
        GL_OES_EGL_image_external_essl3 = ext.contains("GL_OES_EGL_image_external_essl3");
        GL_OES_element_index_uint = ext.contains("GL_OES_element_index_uint");
        GL_OES_fbo_render_mipmap = ext.contains("GL_OES_fbo_render_mipmap");
        GL_OES_geometry_point_size = ext.contains("GL_OES_geometry_point_size");
        GL_OES_geometry_shader = ext.contains("GL_OES_geometry_shader") && checkExtension("GL_OES_geometry_shader", OESGeometryShader.isAvailable(this));
        GL_OES_get_program_binary = ext.contains("GL_OES_get_program_binary") && checkExtension("GL_OES_get_program_binary", OESGetProgramBinary.isAvailable(this));
        GL_OES_gpu_shader5 = ext.contains("GL_OES_gpu_shader5");
        GL_OES_mapbuffer = ext.contains("GL_OES_mapbuffer") && checkExtension("GL_OES_mapbuffer", OESMapbuffer.isAvailable(this));
        GL_OES_packed_depth_stencil = ext.contains("GL_OES_packed_depth_stencil");
        GL_OES_primitive_bounding_box = ext.contains("GL_OES_primitive_bounding_box") && checkExtension("GL_OES_primitive_bounding_box", OESPrimitiveBoundingBox.isAvailable(this));
        GL_OES_required_internalformat = ext.contains("GL_OES_required_internalformat");
        GL_OES_rgb8_rgba8 = ext.contains("GL_OES_rgb8_rgba8");
        GL_OES_sample_shading = ext.contains("GL_OES_sample_shading") && checkExtension("GL_OES_sample_shading", OESSampleShading.isAvailable(this));
        GL_OES_sample_variables = ext.contains("GL_OES_sample_variables");
        GL_OES_shader_image_atomic = ext.contains("GL_OES_shader_image_atomic");
        GL_OES_shader_io_blocks = ext.contains("GL_OES_shader_io_blocks");
        GL_OES_shader_multisample_interpolation = ext.contains("GL_OES_shader_multisample_interpolation");
        GL_OES_standard_derivatives = ext.contains("GL_OES_standard_derivatives");
        GL_OES_stencil1 = ext.contains("GL_OES_stencil1");
        GL_OES_stencil4 = ext.contains("GL_OES_stencil4");
        GL_OES_stencil8 = ext.contains("GL_OES_stencil8");
        GL_OES_surfaceless_context = ext.contains("GL_OES_surfaceless_context");
        GL_OES_tessellation_point_size = ext.contains("GL_OES_tessellation_point_size");
        GL_OES_tessellation_shader = ext.contains("GL_OES_tessellation_shader") && checkExtension("GL_OES_tessellation_shader", OESTessellationShader.isAvailable(this));
        GL_OES_texture_3D = ext.contains("GL_OES_texture_3D") && checkExtension("GL_OES_texture_3D", OESTexture3D.isAvailable(this));
        GL_OES_texture_border_clamp = ext.contains("GL_OES_texture_border_clamp") && checkExtension("GL_OES_texture_border_clamp", OESTextureBorderClamp.isAvailable(this));
        GL_OES_texture_buffer = ext.contains("GL_OES_texture_buffer") && checkExtension("GL_OES_texture_buffer", OESTextureBuffer.isAvailable(this));
        GL_OES_texture_compression_astc = ext.contains("GL_OES_texture_compression_astc");
        GL_OES_texture_cube_map_array = ext.contains("GL_OES_texture_cube_map_array");
        GL_OES_texture_float = ext.contains("GL_OES_texture_float");
        GL_OES_texture_float_linear = ext.contains("GL_OES_texture_float_linear");
        GL_OES_texture_half_float = ext.contains("GL_OES_texture_half_float");
        GL_OES_texture_half_float_linear = ext.contains("GL_OES_texture_half_float_linear");
        GL_OES_texture_npot = ext.contains("GL_OES_texture_npot");
        GL_OES_texture_stencil8 = ext.contains("GL_OES_texture_stencil8");
        GL_OES_texture_storage_multisample_2d_array = ext.contains("GL_OES_texture_storage_multisample_2d_array") && checkExtension("GL_OES_texture_storage_multisample_2d_array", OESTextureStorageMultisample2DArray.isAvailable(this));
        GL_OES_texture_view = ext.contains("GL_OES_texture_view") && checkExtension("GL_OES_texture_view", OESTextureView.isAvailable(this));
        GL_OES_vertex_array_object = ext.contains("GL_OES_vertex_array_object") && checkExtension("GL_OES_vertex_array_object", OESVertexArrayObject.isAvailable(this));
        GL_OES_vertex_half_float = ext.contains("GL_OES_vertex_half_float");
        GL_OES_vertex_type_10_10_10_2 = ext.contains("GL_OES_vertex_type_10_10_10_2");
        GL_OES_viewport_array = ext.contains("GL_OES_viewport_array") && checkExtension("GL_OES_viewport_array", OESViewportArray.isAvailable(this));
        GL_OVR_multiview = ext.contains("GL_OVR_multiview") && checkExtension("GL_OVR_multiview", OVRMultiview.isAvailable(this));
        GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
        GL_OVR_multiview_multisampled_render_to_texture = ext.contains("GL_OVR_multiview_multisampled_render_to_texture") && checkExtension("GL_OVR_multiview_multisampled_render_to_texture", OVRMultiviewMultisampledRenderToTexture.isAvailable(this));
        GL_QCOM_alpha_test = ext.contains("GL_QCOM_alpha_test") && checkExtension("GL_QCOM_alpha_test", QCOMAlphaTest.isAvailable(this));
        GL_QCOM_binning_control = ext.contains("GL_QCOM_binning_control");
        GL_QCOM_driver_control = ext.contains("GL_QCOM_driver_control") && checkExtension("GL_QCOM_driver_control", QCOMDriverControl.isAvailable(this));
        GL_QCOM_extended_get = ext.contains("GL_QCOM_extended_get") && checkExtension("GL_QCOM_extended_get", QCOMExtendedGet.isAvailable(this));
        GL_QCOM_extended_get2 = ext.contains("GL_QCOM_extended_get2") && checkExtension("GL_QCOM_extended_get2", QCOMExtendedGet2.isAvailable(this));
        GL_QCOM_framebuffer_foveated = ext.contains("GL_QCOM_framebuffer_foveated") && checkExtension("GL_QCOM_framebuffer_foveated", QCOMFramebufferFoveated.isAvailable(this));
        GL_QCOM_perfmon_global_mode = ext.contains("GL_QCOM_perfmon_global_mode");
        GL_QCOM_shader_framebuffer_fetch_noncoherent = ext.contains("GL_QCOM_shader_framebuffer_fetch_noncoherent") && checkExtension("GL_QCOM_shader_framebuffer_fetch_noncoherent", QCOMShaderFramebufferFetchNoncoherent.isAvailable(this));
        GL_QCOM_shader_framebuffer_fetch_rate = ext.contains("GL_QCOM_shader_framebuffer_fetch_rate");
        GL_QCOM_texture_foveated = ext.contains("GL_QCOM_texture_foveated") && checkExtension("GL_QCOM_texture_foveated", QCOMTextureFoveated.isAvailable(this));
        GL_QCOM_texture_foveated_subsampled_layout = ext.contains("GL_QCOM_texture_foveated_subsampled_layout");
        GL_QCOM_tiled_rendering = ext.contains("GL_QCOM_tiled_rendering") && checkExtension("GL_QCOM_tiled_rendering", QCOMTiledRendering.isAvailable(this));
        GL_QCOM_writeonly_rendering = ext.contains("GL_QCOM_writeonly_rendering");
        GL_QCOM_YUV_texture_gather = ext.contains("GL_QCOM_YUV_texture_gather");
        GL_VIV_shader_binary = ext.contains("GL_VIV_shader_binary");

        addresses = ThreadLocalUtil.getAddressesFromCapabilities(this);
    }

    boolean hasDSA(Set<String> ext) {
        return ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

    private static boolean checkExtension(String extension, boolean supported) {
        if (supported) {
            return true;
        }

        apiLog("[GLES] " + extension + " was reported as available but an entry point is missing.");
        return false;
    }

}