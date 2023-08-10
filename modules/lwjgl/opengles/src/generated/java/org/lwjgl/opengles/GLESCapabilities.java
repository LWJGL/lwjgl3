/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;
import java.util.Set;
import org.lwjgl.*;
import java.util.function.IntFunction;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/** Defines the capabilities of an OpenGL ES context. */
public final class GLESCapabilities {

    static final int ADDRESS_BUFFER_SIZE = 872;

    // GLES20
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
        glViewport;

    // GLES30
    public final long
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
        glGetInternalformativ;

    // GLES31
    public final long
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
        glVertexBindingDivisor;

    // GLES32
    public final long
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
        glTexStorage3DMultisample;

    // AMD_framebuffer_multisample_advanced
    public final long
        glRenderbufferStorageMultisampleAdvancedAMD,
        glNamedRenderbufferStorageMultisampleAdvancedAMD;

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

    // ANGLE_framebuffer_blit
    public final long
        glBlitFramebufferANGLE;

    // ANGLE_framebuffer_multisample
    public final long
        glRenderbufferStorageMultisampleANGLE;

    // ANGLE_instanced_arrays
    public final long
        glDrawArraysInstancedANGLE,
        glDrawElementsInstancedANGLE,
        glVertexAttribDivisorANGLE;

    // ANGLE_translated_shader_source
    public final long
        glGetTranslatedShaderSourceANGLE;

    // APPLE_copy_texture_levels
    public final long
        glCopyTextureLevelsAPPLE;

    // APPLE_framebuffer_multisample
    public final long
        glRenderbufferStorageMultisampleAPPLE,
        glResolveMultisampleFramebufferAPPLE;

    // APPLE_sync
    public final long
        glFenceSyncAPPLE,
        glIsSyncAPPLE,
        glDeleteSyncAPPLE,
        glClientWaitSyncAPPLE,
        glWaitSyncAPPLE,
        glGetInteger64vAPPLE,
        glGetSyncivAPPLE;

    // EXT_base_instance
    public final long
        glDrawArraysInstancedBaseInstanceEXT,
        glDrawElementsInstancedBaseInstanceEXT,
        glDrawElementsInstancedBaseVertexBaseInstanceEXT;

    // EXT_blend_func_extended
    public final long
        glBindFragDataLocationIndexedEXT,
        glGetFragDataIndexEXT,
        glBindFragDataLocationEXT,
        glGetProgramResourceLocationIndexEXT;

    // EXT_buffer_storage
    public final long
        glBufferStorageEXT,
        glNamedBufferStorageEXT;

    // EXT_clear_texture
    public final long
        glClearTexImageEXT,
        glClearTexSubImageEXT;

    // EXT_clip_control
    public final long
        glClipControlEXT;

    // EXT_copy_image
    public final long
        glCopyImageSubDataEXT;

    // EXT_debug_label
    public final long
        glLabelObjectEXT,
        glGetObjectLabelEXT;

    // EXT_debug_marker
    public final long
        glInsertEventMarkerEXT,
        glPushGroupMarkerEXT,
        glPopGroupMarkerEXT;

    // EXT_discard_framebuffer
    public final long
        glDiscardFramebufferEXT;

    // EXT_disjoint_timer_query
    public final long
        glGenQueriesEXT,
        glDeleteQueriesEXT,
        glIsQueryEXT,
        glBeginQueryEXT,
        glEndQueryEXT,
        glGetQueryivEXT,
        glGetQueryObjectuivEXT,
        glQueryCounterEXT,
        glGetQueryObjectivEXT,
        glGetQueryObjecti64vEXT,
        glGetQueryObjectui64vEXT,
        glGetInteger64vEXT;

    // EXT_draw_buffers
    public final long
        glDrawBuffersEXT;

    // EXT_draw_buffers_indexed
    public final long
        glEnableiEXT,
        glDisableiEXT,
        glBlendEquationiEXT,
        glBlendEquationSeparateiEXT,
        glBlendFunciEXT,
        glBlendFuncSeparateiEXT,
        glColorMaskiEXT,
        glIsEnablediEXT;

    // EXT_draw_elements_base_vertex
    public final long
        glDrawElementsBaseVertexEXT,
        glDrawRangeElementsBaseVertexEXT,
        glDrawElementsInstancedBaseVertexEXT,
        glMultiDrawElementsBaseVertexEXT;

    // EXT_draw_instanced
    public final long
        glDrawArraysInstancedEXT,
        glDrawElementsInstancedEXT;

    // EXT_draw_transform_feedback
    public final long
        glDrawTransformFeedbackEXT,
        glDrawTransformFeedbackInstancedEXT;

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

    // EXT_framebuffer_blit_layers
    public final long
        glBlitFramebufferLayersEXT,
        glBlitFramebufferLayerEXT;

    // EXT_geometry_shader
    public final long
        glFramebufferTextureEXT;

    // EXT_instanced_arrays
    public final long
        glVertexAttribDivisorEXT;

    // EXT_map_buffer_range
    public final long
        glMapBufferRangeEXT,
        glFlushMappedBufferRangeEXT;

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
        glNamedBufferStorageMemEXT;

    // EXT_memory_object_fd
    public final long
        glImportMemoryFdEXT;

    // EXT_memory_object_win32
    public final long
        glImportMemoryWin32HandleEXT,
        glImportMemoryWin32NameEXT;

    // EXT_multi_draw_arrays
    public final long
        glMultiDrawArraysEXT,
        glMultiDrawElementsEXT;

    // EXT_multi_draw_indirect
    public final long
        glMultiDrawArraysIndirectEXT,
        glMultiDrawElementsIndirectEXT;

    // EXT_multisampled_render_to_texture
    public final long
        glRenderbufferStorageMultisampleEXT,
        glFramebufferTexture2DMultisampleEXT;

    // EXT_multiview_draw_buffers
    public final long
        glReadBufferIndexedEXT,
        glDrawBuffersIndexedEXT,
        glGetIntegeri_vEXT;

    // EXT_polygon_offset_clamp
    public final long
        glPolygonOffsetClampEXT;

    // EXT_primitive_bounding_box
    public final long
        glPrimitiveBoundingBoxEXT;

    // EXT_raster_multisample
    public final long
        glRasterSamplesEXT;

    // EXT_robustness
    public final long
        glGetGraphicsResetStatusEXT,
        glReadnPixelsEXT,
        glGetnUniformfvEXT,
        glGetnUniformivEXT;

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
        glProgramUniformMatrix4x3fvEXT;

    // EXT_shader_framebuffer_fetch_non_coherent
    public final long
        glFramebufferFetchBarrierEXT;

    // EXT_shader_pixel_local_storage2
    public final long
        glFramebufferPixelLocalStorageSizeEXT,
        glGetFramebufferPixelLocalStorageSizeEXT,
        glClearPixelLocalStorageuiEXT;

    // EXT_sparse_texture
    public final long
        glTexPageCommitmentARB;

    // EXT_tessellation_shader
    public final long
        glPatchParameteriEXT;

    // EXT_texture_border_clamp
    public final long
        glTexParameterIivEXT,
        glTexParameterIuivEXT,
        glGetTexParameterIivEXT,
        glGetTexParameterIuivEXT,
        glSamplerParameterIivEXT,
        glSamplerParameterIuivEXT,
        glGetSamplerParameterIivEXT,
        glGetSamplerParameterIuivEXT;

    // EXT_texture_buffer
    public final long
        glTexBufferEXT,
        glTexBufferRangeEXT;

    // EXT_texture_storage
    public final long
        glTexStorage1DEXT,
        glTexStorage2DEXT,
        glTexStorage3DEXT,
        glTextureStorage1DEXT,
        glTextureStorage2DEXT,
        glTextureStorage3DEXT;

    // EXT_texture_storage_compression
    public final long
        glTexStorageAttribs2DEXT,
        glTexStorageAttribs3DEXT;

    // EXT_texture_view
    public final long
        glTextureViewEXT;

    // EXT_win32_keyed_mutex
    public final long
        glAcquireKeyedMutexWin32EXT,
        glReleaseKeyedMutexWin32EXT;

    // EXT_window_rectangles
    public final long
        glWindowRectanglesEXT;

    // IMG_framebuffer_downsample
    public final long
        glFramebufferTexture2DDownsampleIMG,
        glFramebufferTextureLayerDownsampleIMG;

    // IMG_multisampled_render_to_texture
    public final long
        glRenderbufferStorageMultisampleIMG,
        glFramebufferTexture2DMultisampleIMG;

    // INTEL_framebuffer_CMAA
    public final long
        glApplyFramebufferAttachmentCMAAINTEL;

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

    // KHR_debug
    public final long
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
        glGetObjectPtrLabelKHR;

    // KHR_parallel_shader_compile
    public final long
        glMaxShaderCompilerThreadsKHR;

    // KHR_robustness
    public final long
        glGetGraphicsResetStatusKHR,
        glReadnPixelsKHR,
        glGetnUniformfvKHR,
        glGetnUniformivKHR,
        glGetnUniformuivKHR;

    // MESA_framebuffer_flip_y
    public final long
        glFramebufferParameteriMESA,
        glGetFramebufferParameterivMESA;

    // NV_alpha_to_coverage_dither_control
    public final long
        glAlphaToCoverageDitherControlNV;

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

    // NV_conditional_render
    public final long
        glBeginConditionalRenderNV,
        glEndConditionalRenderNV;

    // NV_conservative_raster
    public final long
        glSubpixelPrecisionBiasNV;

    // NV_conservative_raster_pre_snap_triangles
    public final long
        glConservativeRasterParameteriNV;

    // NV_copy_buffer
    public final long
        glCopyBufferSubDataNV;

    // NV_coverage_sample
    public final long
        glCoverageMaskNV,
        glCoverageOperationNV;

    // NV_draw_buffers
    public final long
        glDrawBuffersNV;

    // NV_draw_instanced
    public final long
        glDrawArraysInstancedNV,
        glDrawElementsInstancedNV;

    // NV_draw_vulkan_image
    public final long
        glDrawVkImageNV,
        glGetVkProcAddrNV,
        glWaitVkSemaphoreNV,
        glSignalVkSemaphoreNV,
        glSignalVkFenceNV;

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

    // NV_framebuffer_blit
    public final long
        glBlitFramebufferNV;

    // NV_framebuffer_mixed_samples
    public final long
        glCoverageModulationTableNV,
        glGetCoverageModulationTableNV,
        glCoverageModulationNV;

    // NV_framebuffer_multisample
    public final long
        glRenderbufferStorageMultisampleNV;

    // NV_gpu_shader5
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

    // NV_instanced_arrays
    public final long
        glVertexAttribDivisorNV;

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
        glMultiDrawMeshTasksIndirectNV;

    // NV_non_square_matrices
    public final long
        glUniformMatrix2x3fvNV,
        glUniformMatrix3x2fvNV,
        glUniformMatrix2x4fvNV,
        glUniformMatrix4x2fvNV,
        glUniformMatrix3x4fvNV,
        glUniformMatrix4x3fvNV;

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
        glGetProgramResourcefvNV;

    // NV_polygon_mode
    public final long
        glPolygonModeNV;

    // NV_read_buffer
    public final long
        glReadBufferNV;

    // NV_sample_locations
    public final long
        glFramebufferSampleLocationsfvNV,
        glNamedFramebufferSampleLocationsfvNV,
        glResolveDepthValuesNV;

    // NV_scissor_exclusive
    public final long
        glScissorExclusiveArrayvNV,
        glScissorExclusiveNV;

    // NV_texture_array
    public final long
        glTexImage3DNV,
        glTexSubImage3DNV,
        glCopyTexSubImage3DNV,
        glCompressedTexImage3DNV,
        glCompressedTexSubImage3DNV,
        glFramebufferTextureLayerNV;

    // NV_texture_barrier
    public final long
        glTextureBarrierNV;

    // NV_timeline_semaphore
    public final long
        glCreateSemaphoresNV,
        glSemaphoreParameterivNV,
        glGetSemaphoreParameterivNV;

    // NV_viewport_array
    public final long
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
        glIsEnablediNV;

    // NV_viewport_swizzle
    public final long
        glViewportSwizzleNV;

    // OES_copy_image
    public final long
        glCopyImageSubDataOES;

    // OES_draw_buffers_indexed
    public final long
        glEnableiOES,
        glDisableiOES,
        glBlendEquationiOES,
        glBlendEquationSeparateiOES,
        glBlendFunciOES,
        glBlendFuncSeparateiOES,
        glColorMaskiOES,
        glIsEnablediOES;

    // OES_draw_elements_base_vertex
    public final long
        glDrawElementsBaseVertexOES,
        glDrawRangeElementsBaseVertexOES,
        glDrawElementsInstancedBaseVertexOES,
        glMultiDrawElementsBaseVertexOES;

    // OES_EGL_image
    public final long
        glEGLImageTargetTexture2DOES,
        glEGLImageTargetRenderbufferStorageOES;

    // OES_geometry_shader
    public final long
        glFramebufferTextureOES;

    // OES_get_program_binary
    public final long
        glGetProgramBinaryOES,
        glProgramBinaryOES;

    // OES_mapbuffer
    public final long
        glMapBufferOES,
        glUnmapBufferOES,
        glGetBufferPointervOES;

    // OES_primitive_bounding_box
    public final long
        glPrimitiveBoundingBoxOES;

    // OES_sample_shading
    public final long
        glMinSampleShadingOES;

    // OES_tessellation_shader
    public final long
        glPatchParameteriOES;

    // OES_texture_3D
    public final long
        glTexImage3DOES,
        glTexSubImage3DOES,
        glCopyTexSubImage3DOES,
        glCompressedTexImage3DOES,
        glCompressedTexSubImage3DOES,
        glFramebufferTexture3DOES;

    // OES_texture_border_clamp
    public final long
        glTexParameterIivOES,
        glTexParameterIuivOES,
        glGetTexParameterIivOES,
        glGetTexParameterIuivOES,
        glSamplerParameterIivOES,
        glSamplerParameterIuivOES,
        glGetSamplerParameterIivOES,
        glGetSamplerParameterIuivOES;

    // OES_texture_buffer
    public final long
        glTexBufferOES,
        glTexBufferRangeOES;

    // OES_texture_storage_multisample_2d_array
    public final long
        glTexStorage3DMultisampleOES;

    // OES_texture_view
    public final long
        glTextureViewOES;

    // OES_vertex_array_object
    public final long
        glBindVertexArrayOES,
        glDeleteVertexArraysOES,
        glGenVertexArraysOES,
        glIsVertexArrayOES;

    // OES_viewport_array
    public final long
        glViewportArrayvOES,
        glViewportIndexedfOES,
        glViewportIndexedfvOES,
        glScissorArrayvOES,
        glScissorIndexedOES,
        glScissorIndexedvOES,
        glDepthRangeArrayfvOES,
        glDepthRangeIndexedfOES,
        glGetFloati_vOES;

    // OVR_multiview
    public final long
        glFramebufferTextureMultiviewOVR;

    // OVR_multiview_multisampled_render_to_texture
    public final long
        glFramebufferTextureMultisampleMultiviewOVR;

    // QCOM_alpha_test
    public final long
        glAlphaFuncQCOM;

    // QCOM_driver_control
    public final long
        glGetDriverControlsQCOM,
        glGetDriverControlStringQCOM,
        glEnableDriverControlQCOM,
        glDisableDriverControlQCOM;

    // QCOM_extended_get
    public final long
        glExtGetTexturesQCOM,
        glExtGetBuffersQCOM,
        glExtGetRenderbuffersQCOM,
        glExtGetFramebuffersQCOM,
        glExtGetTexLevelParameterivQCOM,
        glExtTexObjectStateOverrideiQCOM,
        glExtGetTexSubImageQCOM,
        glExtGetBufferPointervQCOM;

    // QCOM_extended_get2
    public final long
        glExtGetShadersQCOM,
        glExtGetProgramsQCOM,
        glExtIsProgramBinaryQCOM,
        glExtGetProgramBinarySourceQCOM;

    // QCOM_frame_extrapolation
    public final long
        glExtrapolateTex2DQCOM;

    // QCOM_framebuffer_foveated
    public final long
        glFramebufferFoveationConfigQCOM,
        glFramebufferFoveationParametersQCOM;

    // QCOM_motion_estimation
    public final long
        glTexEstimateMotionQCOM,
        glTexEstimateMotionRegionsQCOM;

    // QCOM_shader_framebuffer_fetch_noncoherent
    public final long
        glFramebufferFetchBarrierQCOM;

    // QCOM_texture_foveated
    public final long
        glTextureFoveationParametersQCOM;

    // QCOM_tiled_rendering
    public final long
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/ANDROID/ANDROID_extension_pack_es31a.txt">ANDROID_extension_pack_es31a</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_color_buffer_packed_float.txt">APPLE_color_buffer_packed_float</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_rgba8.txt">ARM_rgba8</a> extension is supported.
     * 
     * <p>This extension enables a RGBA8 renderbuffer storage format. It is similar to OES_rgb8_rgba8, but only exposes RGBA8.</p>
     * 
     * <p>Requires {@link GLES20 GLES 2.0}.</p>
     */
    public final boolean GL_ARM_rgba8;
    /** When true, {@link ARMShaderFramebufferFetch} is supported. */
    public final boolean GL_ARM_shader_framebuffer_fetch;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_shader_framebuffer_fetch_depth_stencil.txt">ARM_shader_framebuffer_fetch_depth_stencil</a> extension is supported.
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
    /** When true, {@link ARMTextureUnnormalizedCoordinates} is supported. */
    public final boolean GL_ARM_texture_unnormalized_coordinates;
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_color_buffer_float.txt">EXT_color_buffer_float</a> extension is supported.
     * 
     * <p>This extension allows a variety of floating point formats to be rendered to via framebuffer objects.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_EXT_color_buffer_float;
    /** When true, {@link EXTColorBufferHalfFloat} is supported. */
    public final boolean GL_EXT_color_buffer_half_float;
    /** When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_compressed_ETC1_RGB8_sub_texture.txt">EXT_compressed_ETC1_RGB8_sub_texture</a> extension is supported. */
    public final boolean GL_EXT_compressed_ETC1_RGB8_sub_texture;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_conservative_depth.txt">EXT_conservative_depth</a> extension is supported.
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
    /** When true, {@link EXTEGLImageStorageCompression} is supported. */
    public final boolean GL_EXT_EGL_image_storage_compression;
    /** When true, {@link EXTExternalBuffer} is supported. */
    public final boolean GL_EXT_external_buffer;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_float_blend.txt">EXT_float_blend</a> extension is supported.
     * 
     * <p>This extension expands upon the EXT_color_buffer_float extension to allow support for blending with 32-bit floating-point color buffers.</p>
     * 
     * <p>Requires {@link #GL_EXT_color_buffer_float EXT_color_buffer_float}.</p>
     */
    public final boolean GL_EXT_float_blend;
    /** When true, {@link EXTFragmentShadingRate} is supported. */
    public final boolean GL_EXT_fragment_shading_rate;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_fragment_shading_rate_attachment.txt">EXT_fragment_shading_rate_attachment</a> extension is supported.
     * 
     * <p>See {@link EXTFragmentShadingRate EXT_fragment_shading_rate} for more information.</p>
     */
    public final boolean GL_EXT_fragment_shading_rate_attachment;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_fragment_shading_rate_primitive.txt">EXT_fragment_shading_rate_primitive</a> extension is supported.
     * 
     * <p>See {@link EXTFragmentShadingRate EXT_fragment_shading_rate} for more information.</p>
     */
    public final boolean GL_EXT_fragment_shading_rate_primitive;
    /** When true, {@link EXTFramebufferBlitLayers} is supported. */
    public final boolean GL_EXT_framebuffer_blit_layers;
    /** When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_geometry_shader.txt">EXT_geometry_point_size</a> extension is supported. */
    public final boolean GL_EXT_geometry_point_size;
    /** When true, {@link EXTGeometryShader} is supported. */
    public final boolean GL_EXT_geometry_shader;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_gpu_shader5.txt">EXT_gpu_shader5</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_tessellation_geometry_shader.txt">EXT_multiview_tessellation_geometry_shader</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_texture_multisample.txt">EXT_multiview_texture_multisample</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multiview_timer_query.txt">EXT_multiview_timer_query</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_post_depth_coverage.txt">EXT_post_depth_coverage</a> extension is supported.
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
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_separate_depth_stencil.txt">EXT_separate_depth_stencil</a> extension is supported.
     * 
     * <p>This extension adds support for binding a different image to the depth and stencil attachments of a framebuffer object.</p>
     */
    public final boolean GL_EXT_separate_depth_stencil;
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_implicit_conversions.txt">EXT_shader_implicit_conversions</a> extension is supported.
     * 
     * <p>This extension provides support for implicitly converting signed integer types to unsigned types, as well as more general implicit conversion and
     * function overloading infrastructure to support new data types introduced by other extensions.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_EXT_shader_implicit_conversions;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_integer_mix.txt">EXT_shader_integer_mix</a> extension is supported.
     * 
     * <p>GLSL 1.30 (and GLSL ES 3.00) expanded the mix() built-in function to operate on a boolean third argument that does not interpolate but selects. This
     * extension extends mix() to select between int, uint, and bool components.</p>
     * 
     * <p>Requires {@link GLES30 GLES 3.0}.</p>
     */
    public final boolean GL_EXT_shader_integer_mix;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_io_blocks.txt">EXT_shader_io_blocks</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_non_constant_global_initializers.txt">EXT_shader_non_constant_global_initializers</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_samples_identical.txt">EXT_shader_samples_identical</a> extension is supported.
     * 
     * <p>Multisampled antialiasing has become a common method for improving the quality of rendered images. Multisampling differs from supersampling in that the
     * color of a primitive that covers all or part of a pixel is resolved once, regardless of the number of samples covered. If a large polygon is rendered,
     * the colors of all samples in each interior pixel will be the same. This suggests a simple compression scheme that can reduce the necessary memory
     * bandwidth requirements. In one such scheme, each sample is stored in a separate slice of the multisample surface. An additional multisample control
     * surface (MCS) contains a mapping from pixel samples to slices.</p>
     * 
     * <p>If all the values stored in the MCS for a particular pixel are the same, then all the samples have the same value. Applications can take advantage of
     * this information to reduce the bandwidth of reading multisample textures. A custom multisample resolve filter could optimize resolving pixels where
     * every sample is identical by reading the color once.</p>
     * 
     * <pre><code>
     * color = texelFetch(sampler, coordinate, 0);
     * if (!textureSamplesIdenticalEXT(sampler, coordinate)) {
     *     for (int i = 1; i &lt; MAX_SAMPLES; i++) {
     *         vec4 c = texelFetch(sampler, coordinate, i);
     * 
     *         //... accumulate c into color
     * 
     *     }
     * }</code></pre>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_EXT_shader_samples_identical;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_texture_lod.txt">EXT_shader_texture_lod</a> extension is supported.
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
    /** When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_tessellation_shader.txt">EXT_tessellation_point_size</a> extension is supported. */
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
    /** When true, {@link EXTTextureStorageCompression} is supported. */
    public final boolean GL_EXT_texture_storage_compression;
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/GL_EXT_texture_query_lod.txt">GL_EXT_texture_query_lod</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_shader_integer_functions2.txt">INTEL_shader_integer_functions2</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_robust_buffer_access_behavior.txt">KHR_robust_buffer_access_behavior</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_texture_compression_astc_hdr.txt">KHR_texture_compression_astc_hdr</a> extension is supported.
     * 
     * <p>This extension corresponds to the ASTC HDR Profile, see {@link KHRTextureCompressionASTCLDR KHR_texture_compression_astc_ldr} for details.</p>
     */
    public final boolean GL_KHR_texture_compression_astc_hdr;
    /** When true, {@link KHRTextureCompressionASTCLDR} is supported. */
    public final boolean GL_KHR_texture_compression_astc_ldr;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_texture_compression_astc_sliced_3d.txt">KHR_texture_compression_astc_sliced_3d</a> extension is supported.
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
    /** When true, {@link MESABGRA} is supported. */
    public final boolean GL_MESA_bgra;
    /** When true, {@link MESAFramebufferFlipX} is supported. */
    public final boolean GL_MESA_framebuffer_flip_x;
    /** When true, {@link MESAFramebufferFlipY} is supported. */
    public final boolean GL_MESA_framebuffer_flip_y;
    /** When true, {@link MESAFramebufferSwapXY} is supported. */
    public final boolean GL_MESA_framebuffer_swap_xy;
    /** When true, {@link MESAProgramBinaryFormats} is supported. */
    public final boolean GL_MESA_program_binary_formats;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/MESA/MESA_tile_raster_order.txt">MESA_tile_raster_order</a> extension is supported.
     * 
     * <p>This extension extends the sampling-from-the-framebuffer behavior provided by {@code GL_NV_texture_barrier} to allow setting the rasterization order of
     * the scene, so that overlapping blits can be implemented. This can be used for scrolling or window movement within in 2D scenes, without first copying
     * to a temporary.</p>
     * 
     * <p>Requires {@link NVTextureBarrier NV_texture_barrier}.</p>
     */
    public final boolean GL_MESA_tile_raster_order;
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_compute_shader_derivatives.txt">NV_compute_shader_derivatives</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_explicit_attrib_location.txt">NV_explicit_attrib_location</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_shader_barycentric.txt">NV_fragment_shader_barycentric</a> extension is supported.
     * 
     * <p>This extension advertises OpenGL support for the OpenGL Shading Language (GLSL) extension {@code "NV_fragment_shader_barycentric"}, which provides
     * fragment shader built-in variables holding barycentric weight vectors that identify the location of the fragment within its primitive. Additionally,
     * the GLSL extension allows fragment the ability to read raw attribute values for each of the vertices of the primitive that produced the fragment.</p>
     * 
     * <p>Requires {@link GLES32 GLES 3.2}.</p>
     */
    public final boolean GL_NV_fragment_shader_barycentric;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_fragment_shader_interlock.txt">NV_fragment_shader_interlock</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_generate_mipmap_sRGB.txt">NV_generate_mipmap_sRGB</a> extension is supported.
     * 
     * <p>EXT_sRGB requires GenerateMipmap() to throw INVALID_OPERATION on textures with sRGB encoding. NV_generate_mipmap_sRGB lifts this restriction.</p>
     * 
     * <p>Requires {@link EXTSRGB EXT_sRGB}.</p>
     */
    public final boolean GL_NV_generate_mipmap_sRGB;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_geometry_shader_passthrough.txt">NV_geometry_shader_passthrough</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_image_formats.txt">NV_image_formats</a> extension is supported.
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
    /** When true, {@link NVMemoryObjectSparse} is supported. */
    public final boolean GL_NV_memory_object_sparse;
    /** When true, {@link NVMeshShader} is supported. */
    public final boolean GL_NV_mesh_shader;
    /** When true, {@link NVNonSquareMatrices} is supported. */
    public final boolean GL_NV_non_square_matrices;
    /** When true, {@link NVPackSubimage} is supported. */
    public final boolean GL_NV_pack_subimage;
    /** When true, {@link NVPathRendering} is supported. */
    public final boolean GL_NV_path_rendering;
    /** When true, {@link NVPathRenderingSharedEdge} is supported. */
    public final boolean GL_NV_path_rendering_shared_edge;
    /** When true, {@link NVPolygonMode} is supported. */
    public final boolean GL_NV_polygon_mode;
    /** When true, {@link NVPrimitiveShadingRate} is supported. */
    public final boolean GL_NV_primitive_shading_rate;
    /** When true, {@link NVReadBuffer} is supported. */
    public final boolean GL_NV_read_buffer;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_buffer.txt">NV_read_buffer_front</a> extension is supported.
     * 
     * <p>Adds the ability to select the system-provided FRONT color buffer as the source for read operations when the system-provided framebuffer is bound and
     * contains both a front and back buffer.</p>
     * 
     * <p>Requires {@link NVReadBuffer NV_read_buffer}.</p>
     */
    public final boolean GL_NV_read_buffer_front;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_depth_stencil.txt">NV_read_depth</a> extension is supported.
     * 
     * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
     * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
     * 
     * <p>The NV_read_depth extension allows reading from the depth buffer using ReadPixels.</p>
     */
    public final boolean GL_NV_read_depth;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_depth_stencil.txt">NV_read_depth_stencil</a> extension is supported.
     * 
     * <p>Unextended OpenGL-ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
     * for debugging to be able to read from depth and stencil buffers. This extension re-introduces these features into OpenGL-ES 2.0.</p>
     * 
     * <p>The NV_read_depth_stencil extension allows reading from packed depth-stencil buffers using ReadPixels.</p>
     */
    public final boolean GL_NV_read_depth_stencil;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_depth_stencil.txt">NV_read_stencil</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_sample_mask_override_coverage.txt">NV_sample_mask_override_coverage</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_noperspective_interpolation.txt">NV_shader_noperspective_interpolation</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_texture_footprint.txt">NV_shader_texture_footprint</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_stereo_view_rendering.txt">NV_stereo_view_rendering</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_compression_s3tc_update.txt">NV_texture_compression_s3tc_update</a> extension is supported.
     * 
     * <p>This extension allows for full or partial image updates to a compressed 2D texture from an uncompressed texel data buffer using TexImage2D and
     * TexSubImage2D. Consquently, if a compressed internal format is used, all the restrictions associated with compressed textures will apply. These include
     * sub-image updates aligned to 4x4 pixel blocks and the restriction on usage as render targets.</p>
     * 
     * <p>Requires {@link NVTextureCompressionS3TC NV_texture_compression_s3tc}.</p>
     */
    public final boolean GL_NV_texture_compression_s3tc_update;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_npot_2D_mipmap.txt">NV_texture_npot_2D_mipmap</a> extension is supported.
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
    /** When true, {@link NVTimelineSemaphore} is supported. */
    public final boolean GL_NV_timeline_semaphore;
    /** When true, {@link NVViewportArray} is supported. */
    public final boolean GL_NV_viewport_array;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_viewport_array2.txt">NV_viewport_array2</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/NVX/NVX_blend_equation_advanced_multi_draw_buffers.txt">NVX_blend_equation_advanced_multi_draw_buffers</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_depth_texture.txt">OES_depth_texture</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_EGL_image_external_essl3.txt">OES_EGL_image_external_essl3</a> extension is supported.
     * 
     * <p>OES_EGL_image_external provides a mechanism for creating EGLImage texture targets from EGLImages, but only specified language interactions for the
     * OpenGL ES Shading Language version 1.0. This extension adds support for versions 3.x of the OpenGL ES Shading Language.</p>
     * 
     * <p>Requires {@link GLES30 GLES30} and {@link OESEGLImageExternal OES_EGL_image_external}.</p>
     */
    public final boolean GL_OES_EGL_image_external_essl3;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_element_index_uint.txt">OES_element_index_uint</a> extension is supported.
     * 
     * <p>OpenGL ES 1.0 supports DrawElements with {@code type} value of UNSIGNED_BYTE and UNSIGNED_SHORT. This extension adds support for UNSIGNED_INT
     * {@code type} values.</p>
     */
    public final boolean GL_OES_element_index_uint;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_fbo_render_mipmap.txt">OES_fbo_render_mipmap</a> extension is supported.
     * 
     * <p>OES_framebuffer_object allows rendering to the base level of a texture only. This extension removes this limitation by allowing implementations to
     * support rendering to any mip-level of a texture(s) that is attached to a framebuffer object(s).</p>
     * 
     * <p>If this extension is supported, FramebufferTexture2DOES, and FramebufferTexture3DOES can be used to render directly into any mip level of a texture
     * image</p>
     */
    public final boolean GL_OES_fbo_render_mipmap;
    /** When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_geometry_shader.txt">OES_geometry_point_size</a> extension is supported. */
    public final boolean GL_OES_geometry_point_size;
    /** When true, {@link OESGeometryShader} is supported. */
    public final boolean GL_OES_geometry_shader;
    /** When true, {@link OESGetProgramBinary} is supported. */
    public final boolean GL_OES_get_program_binary;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_gpu_shader5.txt">OES_gpu_shader5</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_sample_variables.txt">OES_sample_variables</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_shader_image_atomic.txt">OES_shader_image_atomic</a> extension is supported.
     * 
     * <p>This extension provides built-in functions allowing shaders to perform atomic read-modify-write operations to a single level of a texture object from
     * any shader stage. These built-in functions are named imageAtomic*(), and accept integer texel coordinates to identify the texel accessed. These
     * built-in functions extend the Images in ESSL 3.10.</p>
     * 
     * <p>Requires {@link GLES31 GLES 3.1}.</p>
     */
    public final boolean GL_OES_shader_image_atomic;
    /**
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_shader_io_blocks.txt">OES_shader_io_blocks</a> extension is supported.
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
    /** When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_tessellation_shader.txt">OES_tessellation_point_size</a> extension is supported. */
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float.txt">OES_texture_float</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float_linear.txt">OES_texture_float_linear</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_float_linear.txt">OES_texture_half_float_linear</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_npot.txt">OES_texture_npot</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_stencil8.txt">OES_texture_stencil8</a> extension is supported.
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
     * When true, the <a href="https://www.khronos.org/registry/OpenGL/extensions/OVR/OVR_multiview2.txt">OVR_multiview2</a> extension is supported.
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
    /** When true, {@link QCOMFrameExtrapolation} is supported. */
    public final boolean GL_QCOM_frame_extrapolation;
    /** When true, {@link QCOMFramebufferFoveated} is supported. */
    public final boolean GL_QCOM_framebuffer_foveated;
    /** When true, {@link QCOMMotionEstimation} is supported. */
    public final boolean GL_QCOM_motion_estimation;
    /** When true, {@link QCOMPerfmonGlobalMode} is supported. */
    public final boolean GL_QCOM_perfmon_global_mode;
    /** When true, {@link QCOMRenderSharedExponent} is supported. */
    public final boolean GL_QCOM_render_shared_exponent;
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
    /** When true, {@link QCOMShadingRate} is supported. */
    public final boolean GL_QCOM_shading_rate;
    /** When true, {@link QCOMTextureFoveated} is supported. */
    public final boolean GL_QCOM_texture_foveated;
    /** When true, {@link QCOMTextureFoveated2} is supported. */
    public final boolean GL_QCOM_texture_foveated2;
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

    GLESCapabilities(FunctionProvider provider, Set<String> ext, IntFunction<PointerBuffer> bufferFactory) {
        PointerBuffer caps = bufferFactory.apply(ADDRESS_BUFFER_SIZE);

        GLES20 = check_GLES20(provider, caps, ext);
        GLES30 = check_GLES30(provider, caps, ext);
        GLES31 = check_GLES31(provider, caps, ext);
        GLES32 = check_GLES32(provider, caps, ext);
        GL_AMD_compressed_3DC_texture = ext.contains("GL_AMD_compressed_3DC_texture");
        GL_AMD_compressed_ATC_texture = ext.contains("GL_AMD_compressed_ATC_texture");
        GL_AMD_framebuffer_multisample_advanced = check_AMD_framebuffer_multisample_advanced(provider, caps, ext);
        GL_AMD_performance_monitor = check_AMD_performance_monitor(provider, caps, ext);
        GL_AMD_program_binary_Z400 = ext.contains("GL_AMD_program_binary_Z400");
        GL_ANDROID_extension_pack_es31a = ext.contains("GL_ANDROID_extension_pack_es31a");
        GL_ANGLE_depth_texture = ext.contains("GL_ANGLE_depth_texture");
        GL_ANGLE_framebuffer_blit = check_ANGLE_framebuffer_blit(provider, caps, ext);
        GL_ANGLE_framebuffer_multisample = check_ANGLE_framebuffer_multisample(provider, caps, ext);
        GL_ANGLE_instanced_arrays = check_ANGLE_instanced_arrays(provider, caps, ext);
        GL_ANGLE_pack_reverse_row_order = ext.contains("GL_ANGLE_pack_reverse_row_order");
        GL_ANGLE_program_binary = ext.contains("GL_ANGLE_program_binary");
        GL_ANGLE_texture_compression_dxt1 = ext.contains("GL_ANGLE_texture_compression_dxt1");
        GL_ANGLE_texture_compression_dxt3 = ext.contains("GL_ANGLE_texture_compression_dxt3");
        GL_ANGLE_texture_compression_dxt5 = ext.contains("GL_ANGLE_texture_compression_dxt5");
        GL_ANGLE_texture_usage = ext.contains("GL_ANGLE_texture_usage");
        GL_ANGLE_translated_shader_source = check_ANGLE_translated_shader_source(provider, caps, ext);
        GL_APPLE_clip_distance = ext.contains("GL_APPLE_clip_distance");
        GL_APPLE_color_buffer_packed_float = ext.contains("GL_APPLE_color_buffer_packed_float");
        GL_APPLE_copy_texture_levels = check_APPLE_copy_texture_levels(provider, caps, ext);
        GL_APPLE_framebuffer_multisample = check_APPLE_framebuffer_multisample(provider, caps, ext);
        GL_APPLE_rgb_422 = ext.contains("GL_APPLE_rgb_422");
        GL_APPLE_sync = check_APPLE_sync(provider, caps, ext);
        GL_APPLE_texture_format_BGRA8888 = ext.contains("GL_APPLE_texture_format_BGRA8888");
        GL_APPLE_texture_max_level = ext.contains("GL_APPLE_texture_max_level");
        GL_APPLE_texture_packed_float = ext.contains("GL_APPLE_texture_packed_float");
        GL_ARM_mali_program_binary = ext.contains("GL_ARM_mali_program_binary");
        GL_ARM_mali_shader_binary = ext.contains("GL_ARM_mali_shader_binary");
        GL_ARM_rgba8 = ext.contains("GL_ARM_rgba8");
        GL_ARM_shader_framebuffer_fetch = ext.contains("GL_ARM_shader_framebuffer_fetch");
        GL_ARM_shader_framebuffer_fetch_depth_stencil = ext.contains("GL_ARM_shader_framebuffer_fetch_depth_stencil");
        GL_ARM_texture_unnormalized_coordinates = ext.contains("GL_ARM_texture_unnormalized_coordinates");
        GL_DMP_program_binary = ext.contains("GL_DMP_program_binary");
        GL_DMP_shader_binary = ext.contains("GL_DMP_shader_binary");
        GL_EXT_base_instance = check_EXT_base_instance(provider, caps, ext);
        GL_EXT_blend_func_extended = check_EXT_blend_func_extended(provider, caps, ext);
        GL_EXT_blend_minmax = ext.contains("GL_EXT_blend_minmax");
        GL_EXT_buffer_storage = check_EXT_buffer_storage(provider, caps, ext);
        GL_EXT_clear_texture = check_EXT_clear_texture(provider, caps, ext);
        GL_EXT_clip_control = check_EXT_clip_control(provider, caps, ext);
        GL_EXT_clip_cull_distance = ext.contains("GL_EXT_clip_cull_distance");
        GL_EXT_color_buffer_float = ext.contains("GL_EXT_color_buffer_float");
        GL_EXT_color_buffer_half_float = ext.contains("GL_EXT_color_buffer_half_float");
        GL_EXT_compressed_ETC1_RGB8_sub_texture = ext.contains("GL_EXT_compressed_ETC1_RGB8_sub_texture");
        GL_EXT_conservative_depth = ext.contains("GL_EXT_conservative_depth");
        GL_EXT_copy_image = check_EXT_copy_image(provider, caps, ext);
        GL_EXT_debug_label = check_EXT_debug_label(provider, caps, ext);
        GL_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        GL_EXT_depth_clamp = ext.contains("GL_EXT_depth_clamp");
        GL_EXT_discard_framebuffer = check_EXT_discard_framebuffer(provider, caps, ext);
        GL_EXT_disjoint_timer_query = check_EXT_disjoint_timer_query(provider, caps, ext);
        GL_EXT_draw_buffers = check_EXT_draw_buffers(provider, caps, ext);
        GL_EXT_draw_buffers_indexed = check_EXT_draw_buffers_indexed(provider, caps, ext);
        GL_EXT_draw_elements_base_vertex = check_EXT_draw_elements_base_vertex(provider, caps, ext);
        GL_EXT_draw_instanced = check_EXT_draw_instanced(provider, caps, ext);
        GL_EXT_draw_transform_feedback = check_EXT_draw_transform_feedback(provider, caps, ext);
        GL_EXT_EGL_image_array = ext.contains("GL_EXT_EGL_image_array");
        GL_EXT_EGL_image_external_wrap_modes = ext.contains("GL_EXT_EGL_image_external_wrap_modes");
        GL_EXT_EGL_image_storage = check_EXT_EGL_image_storage(provider, caps, ext);
        GL_EXT_EGL_image_storage_compression = ext.contains("GL_EXT_EGL_image_storage_compression");
        GL_EXT_external_buffer = check_EXT_external_buffer(provider, caps, ext);
        GL_EXT_float_blend = ext.contains("GL_EXT_float_blend");
        GL_EXT_fragment_shading_rate = check_EXT_fragment_shading_rate(provider, caps, ext);
        GL_EXT_fragment_shading_rate_attachment = ext.contains("GL_EXT_fragment_shading_rate_attachment");
        GL_EXT_fragment_shading_rate_primitive = ext.contains("GL_EXT_fragment_shading_rate_primitive");
        GL_EXT_framebuffer_blit_layers = check_EXT_framebuffer_blit_layers(provider, caps, ext);
        GL_EXT_geometry_point_size = ext.contains("GL_EXT_geometry_point_size");
        GL_EXT_geometry_shader = check_EXT_geometry_shader(provider, caps, ext);
        GL_EXT_gpu_shader5 = ext.contains("GL_EXT_gpu_shader5");
        GL_EXT_instanced_arrays = check_EXT_instanced_arrays(provider, caps, ext);
        GL_EXT_map_buffer_range = check_EXT_map_buffer_range(provider, caps, ext);
        GL_EXT_memory_object = check_EXT_memory_object(provider, caps, ext);
        GL_EXT_memory_object_fd = check_EXT_memory_object_fd(provider, caps, ext);
        GL_EXT_memory_object_win32 = check_EXT_memory_object_win32(provider, caps, ext);
        GL_EXT_multi_draw_arrays = check_EXT_multi_draw_arrays(provider, caps, ext);
        GL_EXT_multi_draw_indirect = check_EXT_multi_draw_indirect(provider, caps, ext);
        GL_EXT_multisample_compatibility = ext.contains("GL_EXT_multisample_compatibility");
        GL_EXT_multisampled_render_to_texture = check_EXT_multisampled_render_to_texture(provider, caps, ext);
        GL_EXT_multisampled_render_to_texture2 = ext.contains("GL_EXT_multisampled_render_to_texture2");
        GL_EXT_multiview_draw_buffers = check_EXT_multiview_draw_buffers(provider, caps, ext);
        GL_EXT_multiview_tessellation_geometry_shader = ext.contains("GL_EXT_multiview_tessellation_geometry_shader");
        GL_EXT_multiview_texture_multisample = ext.contains("GL_EXT_multiview_texture_multisample");
        GL_EXT_multiview_timer_query = ext.contains("GL_EXT_multiview_timer_query");
        GL_EXT_occlusion_query_boolean = check_EXT_occlusion_query_boolean(provider, caps, ext);
        GL_EXT_polygon_offset_clamp = check_EXT_polygon_offset_clamp(provider, caps, ext);
        GL_EXT_post_depth_coverage = ext.contains("GL_EXT_post_depth_coverage");
        GL_EXT_primitive_bounding_box = check_EXT_primitive_bounding_box(provider, caps, ext);
        GL_EXT_protected_textures = ext.contains("GL_EXT_protected_textures");
        GL_EXT_pvrtc_sRGB = ext.contains("GL_EXT_pvrtc_sRGB");
        GL_EXT_raster_multisample = check_EXT_raster_multisample(provider, caps, ext);
        GL_EXT_read_format_bgra = ext.contains("GL_EXT_read_format_bgra");
        GL_EXT_render_snorm = ext.contains("GL_EXT_render_snorm");
        GL_EXT_robustness = check_EXT_robustness(provider, caps, ext);
        GL_EXT_semaphore = check_EXT_semaphore(provider, caps, ext);
        GL_EXT_semaphore_fd = check_EXT_semaphore_fd(provider, caps, ext);
        GL_EXT_semaphore_win32 = check_EXT_semaphore_win32(provider, caps, ext);
        GL_EXT_separate_depth_stencil = ext.contains("GL_EXT_separate_depth_stencil");
        GL_EXT_separate_shader_objects = check_EXT_separate_shader_objects(provider, caps, ext);
        GL_EXT_shader_framebuffer_fetch = ext.contains("GL_EXT_shader_framebuffer_fetch");
        GL_EXT_shader_framebuffer_fetch_non_coherent = check_EXT_shader_framebuffer_fetch_non_coherent(provider, caps, ext);
        GL_EXT_shader_group_vote = ext.contains("GL_EXT_shader_group_vote");
        GL_EXT_shader_implicit_conversions = ext.contains("GL_EXT_shader_implicit_conversions");
        GL_EXT_shader_integer_mix = ext.contains("GL_EXT_shader_integer_mix");
        GL_EXT_shader_io_blocks = ext.contains("GL_EXT_shader_io_blocks");
        GL_EXT_shader_non_constant_global_initializers = ext.contains("GL_EXT_shader_non_constant_global_initializers");
        GL_EXT_shader_pixel_local_storage = ext.contains("GL_EXT_shader_pixel_local_storage");
        GL_EXT_shader_pixel_local_storage2 = check_EXT_shader_pixel_local_storage2(provider, caps, ext);
        GL_EXT_shader_samples_identical = ext.contains("GL_EXT_shader_samples_identical");
        GL_EXT_shader_texture_lod = ext.contains("GL_EXT_shader_texture_lod");
        GL_EXT_shadow_samplers = ext.contains("GL_EXT_shadow_samplers");
        GL_EXT_sparse_texture = check_EXT_sparse_texture(provider, caps, ext);
        GL_EXT_sparse_texture2 = ext.contains("GL_EXT_sparse_texture2");
        GL_EXT_sRGB = ext.contains("GL_EXT_sRGB");
        GL_EXT_sRGB_write_control = ext.contains("GL_EXT_sRGB_write_control");
        GL_EXT_tessellation_point_size = ext.contains("GL_EXT_tessellation_point_size");
        GL_EXT_tessellation_shader = check_EXT_tessellation_shader(provider, caps, ext);
        GL_EXT_texture_border_clamp = check_EXT_texture_border_clamp(provider, caps, ext);
        GL_EXT_texture_buffer = check_EXT_texture_buffer(provider, caps, ext);
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
        GL_EXT_texture_storage = check_EXT_texture_storage(provider, caps, ext);
        GL_EXT_texture_storage_compression = check_EXT_texture_storage_compression(provider, caps, ext);
        GL_EXT_texture_type_2_10_10_10_REV = ext.contains("GL_EXT_texture_type_2_10_10_10_REV");
        GL_EXT_texture_view = check_EXT_texture_view(provider, caps, ext);
        GL_EXT_unpack_subimage = ext.contains("GL_EXT_unpack_subimage");
        GL_EXT_win32_keyed_mutex = check_EXT_win32_keyed_mutex(provider, caps, ext);
        GL_EXT_window_rectangles = check_EXT_window_rectangles(provider, caps, ext);
        GL_EXT_YUV_target = ext.contains("GL_EXT_YUV_target");
        GL_FJ_shader_binary_GCCSO = ext.contains("GL_FJ_shader_binary_GCCSO");
        GL_EXT_texture_compression_astc_decode_mode_rgb9e5 = ext.contains("GL_EXT_texture_compression_astc_decode_mode_rgb9e5");
        GL_EXT_texture_query_lod = ext.contains("GL_EXT_texture_query_lod");
        GL_IMG_framebuffer_downsample = check_IMG_framebuffer_downsample(provider, caps, ext);
        GL_IMG_multisampled_render_to_texture = check_IMG_multisampled_render_to_texture(provider, caps, ext);
        GL_IMG_program_binary = ext.contains("GL_IMG_program_binary");
        GL_IMG_read_format = ext.contains("GL_IMG_read_format");
        GL_IMG_shader_binary = ext.contains("GL_IMG_shader_binary");
        GL_IMG_texture_compression_pvrtc = ext.contains("GL_IMG_texture_compression_pvrtc");
        GL_IMG_texture_compression_pvrtc2 = ext.contains("GL_IMG_texture_compression_pvrtc2");
        GL_IMG_texture_filter_cubic = ext.contains("GL_IMG_texture_filter_cubic");
        GL_INTEL_blackhole_render = ext.contains("GL_INTEL_blackhole_render");
        GL_INTEL_conservative_rasterization = ext.contains("GL_INTEL_conservative_rasterization");
        GL_INTEL_framebuffer_CMAA = check_INTEL_framebuffer_CMAA(provider, caps, ext);
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
        GL_MESA_bgra = ext.contains("GL_MESA_bgra");
        GL_MESA_framebuffer_flip_x = ext.contains("GL_MESA_framebuffer_flip_x");
        GL_MESA_framebuffer_flip_y = check_MESA_framebuffer_flip_y(provider, caps, ext);
        GL_MESA_framebuffer_swap_xy = ext.contains("GL_MESA_framebuffer_swap_xy");
        GL_MESA_program_binary_formats = ext.contains("GL_MESA_program_binary_formats");
        GL_MESA_tile_raster_order = ext.contains("GL_MESA_tile_raster_order");
        GL_NV_alpha_to_coverage_dither_control = check_NV_alpha_to_coverage_dither_control(provider, caps, ext);
        GL_NV_bindless_texture = check_NV_bindless_texture(provider, caps, ext);
        GL_NV_blend_equation_advanced = check_NV_blend_equation_advanced(provider, caps, ext);
        GL_NV_blend_equation_advanced_coherent = ext.contains("GL_NV_blend_equation_advanced_coherent");
        GL_NV_blend_minmax_factor = ext.contains("GL_NV_blend_minmax_factor");
        GL_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        GL_NV_compute_shader_derivatives = ext.contains("GL_NV_compute_shader_derivatives");
        GL_NV_conditional_render = check_NV_conditional_render(provider, caps, ext);
        GL_NV_conservative_raster = check_NV_conservative_raster(provider, caps, ext);
        GL_NV_conservative_raster_pre_snap = ext.contains("GL_NV_conservative_raster_pre_snap");
        GL_NV_conservative_raster_pre_snap_triangles = check_NV_conservative_raster_pre_snap_triangles(provider, caps, ext);
        GL_NV_copy_buffer = check_NV_copy_buffer(provider, caps, ext);
        GL_NV_coverage_sample = check_NV_coverage_sample(provider, caps, ext);
        GL_NV_depth_nonlinear = ext.contains("GL_NV_depth_nonlinear");
        GL_NV_draw_buffers = check_NV_draw_buffers(provider, caps, ext);
        GL_NV_draw_instanced = check_NV_draw_instanced(provider, caps, ext);
        GL_NV_draw_vulkan_image = check_NV_draw_vulkan_image(provider, caps, ext);
        GL_NV_explicit_attrib_location = ext.contains("GL_NV_explicit_attrib_location");
        GL_NV_fbo_color_attachments = ext.contains("GL_NV_fbo_color_attachments");
        GL_NV_fence = check_NV_fence(provider, caps, ext);
        GL_NV_fill_rectangle = ext.contains("GL_NV_fill_rectangle");
        GL_NV_fragment_coverage_to_color = check_NV_fragment_coverage_to_color(provider, caps, ext);
        GL_NV_fragment_shader_barycentric = ext.contains("GL_NV_fragment_shader_barycentric");
        GL_NV_fragment_shader_interlock = ext.contains("GL_NV_fragment_shader_interlock");
        GL_NV_framebuffer_blit = check_NV_framebuffer_blit(provider, caps, ext);
        GL_NV_framebuffer_mixed_samples = check_NV_framebuffer_mixed_samples(provider, caps, ext);
        GL_NV_framebuffer_multisample = check_NV_framebuffer_multisample(provider, caps, ext);
        GL_NV_generate_mipmap_sRGB = ext.contains("GL_NV_generate_mipmap_sRGB");
        GL_NV_geometry_shader_passthrough = ext.contains("GL_NV_geometry_shader_passthrough");
        GL_NV_gpu_shader5 = check_NV_gpu_shader5(provider, caps, ext);
        GL_NV_image_formats = ext.contains("GL_NV_image_formats");
        GL_NV_instanced_arrays = check_NV_instanced_arrays(provider, caps, ext);
        GL_NV_internalformat_sample_query = check_NV_internalformat_sample_query(provider, caps, ext);
        GL_NV_memory_attachment = check_NV_memory_attachment(provider, caps, ext);
        GL_NV_memory_object_sparse = check_NV_memory_object_sparse(provider, caps, ext);
        GL_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        GL_NV_non_square_matrices = check_NV_non_square_matrices(provider, caps, ext);
        GL_NV_pack_subimage = ext.contains("GL_NV_pack_subimage");
        GL_NV_path_rendering = check_NV_path_rendering(provider, caps, ext);
        GL_NV_path_rendering_shared_edge = ext.contains("GL_NV_path_rendering_shared_edge");
        GL_NV_polygon_mode = check_NV_polygon_mode(provider, caps, ext);
        GL_NV_primitive_shading_rate = ext.contains("GL_NV_primitive_shading_rate");
        GL_NV_read_buffer = check_NV_read_buffer(provider, caps, ext);
        GL_NV_read_buffer_front = ext.contains("GL_NV_read_buffer_front");
        GL_NV_read_depth = ext.contains("GL_NV_read_depth");
        GL_NV_read_depth_stencil = ext.contains("GL_NV_read_depth_stencil");
        GL_NV_read_stencil = ext.contains("GL_NV_read_stencil");
        GL_NV_representative_fragment_test = ext.contains("GL_NV_representative_fragment_test");
        GL_NV_sample_locations = check_NV_sample_locations(provider, caps, ext);
        GL_NV_sample_mask_override_coverage = ext.contains("GL_NV_sample_mask_override_coverage");
        GL_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        GL_NV_shader_atomic_fp16_vector = ext.contains("GL_NV_shader_atomic_fp16_vector");
        GL_NV_shader_noperspective_interpolation = ext.contains("GL_NV_shader_noperspective_interpolation");
        GL_NV_shader_subgroup_partitioned = ext.contains("GL_NV_shader_subgroup_partitioned");
        GL_NV_shader_texture_footprint = ext.contains("GL_NV_shader_texture_footprint");
        GL_NV_shadow_samplers_array = ext.contains("GL_NV_shadow_samplers_array");
        GL_NV_shadow_samplers_cube = ext.contains("GL_NV_shadow_samplers_cube");
        GL_NV_sRGB_formats = ext.contains("GL_NV_sRGB_formats");
        GL_NV_stereo_view_rendering = ext.contains("GL_NV_stereo_view_rendering");
        GL_NV_texture_array = check_NV_texture_array(provider, caps, ext);
        GL_NV_texture_barrier = check_NV_texture_barrier(provider, caps, ext);
        GL_NV_texture_border_clamp = ext.contains("GL_NV_texture_border_clamp");
        GL_NV_texture_compression_s3tc = ext.contains("GL_NV_texture_compression_s3tc");
        GL_NV_texture_compression_s3tc_update = ext.contains("GL_NV_texture_compression_s3tc_update");
        GL_NV_texture_npot_2D_mipmap = ext.contains("GL_NV_texture_npot_2D_mipmap");
        GL_NV_timeline_semaphore = check_NV_timeline_semaphore(provider, caps, ext);
        GL_NV_viewport_array = check_NV_viewport_array(provider, caps, ext);
        GL_NV_viewport_array2 = ext.contains("GL_NV_viewport_array2");
        GL_NV_viewport_swizzle = check_NV_viewport_swizzle(provider, caps, ext);
        GL_NVX_blend_equation_advanced_multi_draw_buffers = ext.contains("GL_NVX_blend_equation_advanced_multi_draw_buffers");
        GL_OES_compressed_ETC1_RGB8_texture = ext.contains("GL_OES_compressed_ETC1_RGB8_texture");
        GL_OES_compressed_paletted_texture = ext.contains("GL_OES_compressed_paletted_texture");
        GL_OES_copy_image = check_OES_copy_image(provider, caps, ext);
        GL_OES_depth24 = ext.contains("GL_OES_depth24");
        GL_OES_depth32 = ext.contains("GL_OES_depth32");
        GL_OES_depth_texture = ext.contains("GL_OES_depth_texture");
        GL_OES_depth_texture_cube_map = ext.contains("GL_OES_depth_texture_cube_map");
        GL_OES_draw_buffers_indexed = check_OES_draw_buffers_indexed(provider, caps, ext);
        GL_OES_draw_elements_base_vertex = check_OES_draw_elements_base_vertex(provider, caps, ext);
        GL_OES_EGL_image = check_OES_EGL_image(provider, caps, ext);
        GL_OES_EGL_image_external = ext.contains("GL_OES_EGL_image_external");
        GL_OES_EGL_image_external_essl3 = ext.contains("GL_OES_EGL_image_external_essl3");
        GL_OES_element_index_uint = ext.contains("GL_OES_element_index_uint");
        GL_OES_fbo_render_mipmap = ext.contains("GL_OES_fbo_render_mipmap");
        GL_OES_geometry_point_size = ext.contains("GL_OES_geometry_point_size");
        GL_OES_geometry_shader = check_OES_geometry_shader(provider, caps, ext);
        GL_OES_get_program_binary = check_OES_get_program_binary(provider, caps, ext);
        GL_OES_gpu_shader5 = ext.contains("GL_OES_gpu_shader5");
        GL_OES_mapbuffer = check_OES_mapbuffer(provider, caps, ext);
        GL_OES_packed_depth_stencil = ext.contains("GL_OES_packed_depth_stencil");
        GL_OES_primitive_bounding_box = check_OES_primitive_bounding_box(provider, caps, ext);
        GL_OES_required_internalformat = ext.contains("GL_OES_required_internalformat");
        GL_OES_rgb8_rgba8 = ext.contains("GL_OES_rgb8_rgba8");
        GL_OES_sample_shading = check_OES_sample_shading(provider, caps, ext);
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
        GL_OES_tessellation_shader = check_OES_tessellation_shader(provider, caps, ext);
        GL_OES_texture_3D = check_OES_texture_3D(provider, caps, ext);
        GL_OES_texture_border_clamp = check_OES_texture_border_clamp(provider, caps, ext);
        GL_OES_texture_buffer = check_OES_texture_buffer(provider, caps, ext);
        GL_OES_texture_compression_astc = ext.contains("GL_OES_texture_compression_astc");
        GL_OES_texture_cube_map_array = ext.contains("GL_OES_texture_cube_map_array");
        GL_OES_texture_float = ext.contains("GL_OES_texture_float");
        GL_OES_texture_float_linear = ext.contains("GL_OES_texture_float_linear");
        GL_OES_texture_half_float = ext.contains("GL_OES_texture_half_float");
        GL_OES_texture_half_float_linear = ext.contains("GL_OES_texture_half_float_linear");
        GL_OES_texture_npot = ext.contains("GL_OES_texture_npot");
        GL_OES_texture_stencil8 = ext.contains("GL_OES_texture_stencil8");
        GL_OES_texture_storage_multisample_2d_array = check_OES_texture_storage_multisample_2d_array(provider, caps, ext);
        GL_OES_texture_view = check_OES_texture_view(provider, caps, ext);
        GL_OES_vertex_array_object = check_OES_vertex_array_object(provider, caps, ext);
        GL_OES_vertex_half_float = ext.contains("GL_OES_vertex_half_float");
        GL_OES_vertex_type_10_10_10_2 = ext.contains("GL_OES_vertex_type_10_10_10_2");
        GL_OES_viewport_array = check_OES_viewport_array(provider, caps, ext);
        GL_OVR_multiview = check_OVR_multiview(provider, caps, ext);
        GL_OVR_multiview2 = ext.contains("GL_OVR_multiview2");
        GL_OVR_multiview_multisampled_render_to_texture = check_OVR_multiview_multisampled_render_to_texture(provider, caps, ext);
        GL_QCOM_alpha_test = check_QCOM_alpha_test(provider, caps, ext);
        GL_QCOM_binning_control = ext.contains("GL_QCOM_binning_control");
        GL_QCOM_driver_control = check_QCOM_driver_control(provider, caps, ext);
        GL_QCOM_extended_get = check_QCOM_extended_get(provider, caps, ext);
        GL_QCOM_extended_get2 = check_QCOM_extended_get2(provider, caps, ext);
        GL_QCOM_frame_extrapolation = check_QCOM_frame_extrapolation(provider, caps, ext);
        GL_QCOM_framebuffer_foveated = check_QCOM_framebuffer_foveated(provider, caps, ext);
        GL_QCOM_motion_estimation = check_QCOM_motion_estimation(provider, caps, ext);
        GL_QCOM_perfmon_global_mode = ext.contains("GL_QCOM_perfmon_global_mode");
        GL_QCOM_render_shared_exponent = ext.contains("GL_QCOM_render_shared_exponent");
        GL_QCOM_shader_framebuffer_fetch_noncoherent = check_QCOM_shader_framebuffer_fetch_noncoherent(provider, caps, ext);
        GL_QCOM_shader_framebuffer_fetch_rate = ext.contains("GL_QCOM_shader_framebuffer_fetch_rate");
        GL_QCOM_shading_rate = ext.contains("GL_QCOM_shading_rate");
        GL_QCOM_texture_foveated = check_QCOM_texture_foveated(provider, caps, ext);
        GL_QCOM_texture_foveated2 = ext.contains("GL_QCOM_texture_foveated2");
        GL_QCOM_texture_foveated_subsampled_layout = ext.contains("GL_QCOM_texture_foveated_subsampled_layout");
        GL_QCOM_tiled_rendering = check_QCOM_tiled_rendering(provider, caps, ext);
        GL_QCOM_writeonly_rendering = ext.contains("GL_QCOM_writeonly_rendering");
        GL_QCOM_YUV_texture_gather = ext.contains("GL_QCOM_YUV_texture_gather");
        GL_VIV_shader_binary = ext.contains("GL_VIV_shader_binary");

        glActiveTexture = caps.get(0);
        glAttachShader = caps.get(1);
        glBindAttribLocation = caps.get(2);
        glBindBuffer = caps.get(3);
        glBindFramebuffer = caps.get(4);
        glBindRenderbuffer = caps.get(5);
        glBindTexture = caps.get(6);
        glBlendColor = caps.get(7);
        glBlendEquation = caps.get(8);
        glBlendEquationSeparate = caps.get(9);
        glBlendFunc = caps.get(10);
        glBlendFuncSeparate = caps.get(11);
        glBufferData = caps.get(12);
        glBufferSubData = caps.get(13);
        glCheckFramebufferStatus = caps.get(14);
        glClear = caps.get(15);
        glClearColor = caps.get(16);
        glClearDepthf = caps.get(17);
        glClearStencil = caps.get(18);
        glColorMask = caps.get(19);
        glCompileShader = caps.get(20);
        glCompressedTexImage2D = caps.get(21);
        glCompressedTexSubImage2D = caps.get(22);
        glCopyTexImage2D = caps.get(23);
        glCopyTexSubImage2D = caps.get(24);
        glCreateProgram = caps.get(25);
        glCreateShader = caps.get(26);
        glCullFace = caps.get(27);
        glDeleteBuffers = caps.get(28);
        glDeleteFramebuffers = caps.get(29);
        glDeleteProgram = caps.get(30);
        glDeleteRenderbuffers = caps.get(31);
        glDeleteShader = caps.get(32);
        glDeleteTextures = caps.get(33);
        glDepthFunc = caps.get(34);
        glDepthMask = caps.get(35);
        glDepthRangef = caps.get(36);
        glDetachShader = caps.get(37);
        glDisable = caps.get(38);
        glDisableVertexAttribArray = caps.get(39);
        glDrawArrays = caps.get(40);
        glDrawElements = caps.get(41);
        glEnable = caps.get(42);
        glEnableVertexAttribArray = caps.get(43);
        glFinish = caps.get(44);
        glFlush = caps.get(45);
        glFramebufferRenderbuffer = caps.get(46);
        glFramebufferTexture2D = caps.get(47);
        glFrontFace = caps.get(48);
        glGenBuffers = caps.get(49);
        glGenerateMipmap = caps.get(50);
        glGenFramebuffers = caps.get(51);
        glGenRenderbuffers = caps.get(52);
        glGenTextures = caps.get(53);
        glGetActiveAttrib = caps.get(54);
        glGetActiveUniform = caps.get(55);
        glGetAttachedShaders = caps.get(56);
        glGetAttribLocation = caps.get(57);
        glGetBooleanv = caps.get(58);
        glGetBufferParameteriv = caps.get(59);
        glGetError = caps.get(60);
        glGetFloatv = caps.get(61);
        glGetFramebufferAttachmentParameteriv = caps.get(62);
        glGetIntegerv = caps.get(63);
        glGetProgramiv = caps.get(64);
        glGetProgramInfoLog = caps.get(65);
        glGetRenderbufferParameteriv = caps.get(66);
        glGetShaderiv = caps.get(67);
        glGetShaderInfoLog = caps.get(68);
        glGetShaderPrecisionFormat = caps.get(69);
        glGetShaderSource = caps.get(70);
        glGetString = caps.get(71);
        glGetTexParameterfv = caps.get(72);
        glGetTexParameteriv = caps.get(73);
        glGetUniformfv = caps.get(74);
        glGetUniformiv = caps.get(75);
        glGetUniformLocation = caps.get(76);
        glGetVertexAttribfv = caps.get(77);
        glGetVertexAttribiv = caps.get(78);
        glGetVertexAttribPointerv = caps.get(79);
        glHint = caps.get(80);
        glIsBuffer = caps.get(81);
        glIsEnabled = caps.get(82);
        glIsFramebuffer = caps.get(83);
        glIsProgram = caps.get(84);
        glIsRenderbuffer = caps.get(85);
        glIsShader = caps.get(86);
        glIsTexture = caps.get(87);
        glLineWidth = caps.get(88);
        glLinkProgram = caps.get(89);
        glPixelStorei = caps.get(90);
        glPolygonOffset = caps.get(91);
        glReadPixels = caps.get(92);
        glReleaseShaderCompiler = caps.get(93);
        glRenderbufferStorage = caps.get(94);
        glSampleCoverage = caps.get(95);
        glScissor = caps.get(96);
        glShaderBinary = caps.get(97);
        glShaderSource = caps.get(98);
        glStencilFunc = caps.get(99);
        glStencilFuncSeparate = caps.get(100);
        glStencilMask = caps.get(101);
        glStencilMaskSeparate = caps.get(102);
        glStencilOp = caps.get(103);
        glStencilOpSeparate = caps.get(104);
        glTexImage2D = caps.get(105);
        glTexParameterf = caps.get(106);
        glTexParameterfv = caps.get(107);
        glTexParameteri = caps.get(108);
        glTexParameteriv = caps.get(109);
        glTexSubImage2D = caps.get(110);
        glUniform1f = caps.get(111);
        glUniform1fv = caps.get(112);
        glUniform1i = caps.get(113);
        glUniform1iv = caps.get(114);
        glUniform2f = caps.get(115);
        glUniform2fv = caps.get(116);
        glUniform2i = caps.get(117);
        glUniform2iv = caps.get(118);
        glUniform3f = caps.get(119);
        glUniform3fv = caps.get(120);
        glUniform3i = caps.get(121);
        glUniform3iv = caps.get(122);
        glUniform4f = caps.get(123);
        glUniform4fv = caps.get(124);
        glUniform4i = caps.get(125);
        glUniform4iv = caps.get(126);
        glUniformMatrix2fv = caps.get(127);
        glUniformMatrix3fv = caps.get(128);
        glUniformMatrix4fv = caps.get(129);
        glUseProgram = caps.get(130);
        glValidateProgram = caps.get(131);
        glVertexAttrib1f = caps.get(132);
        glVertexAttrib1fv = caps.get(133);
        glVertexAttrib2f = caps.get(134);
        glVertexAttrib2fv = caps.get(135);
        glVertexAttrib3f = caps.get(136);
        glVertexAttrib3fv = caps.get(137);
        glVertexAttrib4f = caps.get(138);
        glVertexAttrib4fv = caps.get(139);
        glVertexAttribPointer = caps.get(140);
        glViewport = caps.get(141);
        glReadBuffer = caps.get(142);
        glDrawRangeElements = caps.get(143);
        glTexImage3D = caps.get(144);
        glTexSubImage3D = caps.get(145);
        glCopyTexSubImage3D = caps.get(146);
        glCompressedTexImage3D = caps.get(147);
        glCompressedTexSubImage3D = caps.get(148);
        glGenQueries = caps.get(149);
        glDeleteQueries = caps.get(150);
        glIsQuery = caps.get(151);
        glBeginQuery = caps.get(152);
        glEndQuery = caps.get(153);
        glGetQueryiv = caps.get(154);
        glGetQueryObjectuiv = caps.get(155);
        glUnmapBuffer = caps.get(156);
        glGetBufferPointerv = caps.get(157);
        glDrawBuffers = caps.get(158);
        glUniformMatrix2x3fv = caps.get(159);
        glUniformMatrix3x2fv = caps.get(160);
        glUniformMatrix2x4fv = caps.get(161);
        glUniformMatrix4x2fv = caps.get(162);
        glUniformMatrix3x4fv = caps.get(163);
        glUniformMatrix4x3fv = caps.get(164);
        glBlitFramebuffer = caps.get(165);
        glRenderbufferStorageMultisample = caps.get(166);
        glFramebufferTextureLayer = caps.get(167);
        glMapBufferRange = caps.get(168);
        glFlushMappedBufferRange = caps.get(169);
        glBindVertexArray = caps.get(170);
        glDeleteVertexArrays = caps.get(171);
        glGenVertexArrays = caps.get(172);
        glIsVertexArray = caps.get(173);
        glGetIntegeri_v = caps.get(174);
        glBeginTransformFeedback = caps.get(175);
        glEndTransformFeedback = caps.get(176);
        glBindBufferRange = caps.get(177);
        glBindBufferBase = caps.get(178);
        glTransformFeedbackVaryings = caps.get(179);
        glGetTransformFeedbackVarying = caps.get(180);
        glVertexAttribIPointer = caps.get(181);
        glGetVertexAttribIiv = caps.get(182);
        glGetVertexAttribIuiv = caps.get(183);
        glVertexAttribI4i = caps.get(184);
        glVertexAttribI4ui = caps.get(185);
        glVertexAttribI4iv = caps.get(186);
        glVertexAttribI4uiv = caps.get(187);
        glGetUniformuiv = caps.get(188);
        glGetFragDataLocation = caps.get(189);
        glUniform1ui = caps.get(190);
        glUniform2ui = caps.get(191);
        glUniform3ui = caps.get(192);
        glUniform4ui = caps.get(193);
        glUniform1uiv = caps.get(194);
        glUniform2uiv = caps.get(195);
        glUniform3uiv = caps.get(196);
        glUniform4uiv = caps.get(197);
        glClearBufferiv = caps.get(198);
        glClearBufferuiv = caps.get(199);
        glClearBufferfv = caps.get(200);
        glClearBufferfi = caps.get(201);
        glGetStringi = caps.get(202);
        glCopyBufferSubData = caps.get(203);
        glGetUniformIndices = caps.get(204);
        glGetActiveUniformsiv = caps.get(205);
        glGetUniformBlockIndex = caps.get(206);
        glGetActiveUniformBlockiv = caps.get(207);
        glGetActiveUniformBlockName = caps.get(208);
        glUniformBlockBinding = caps.get(209);
        glDrawArraysInstanced = caps.get(210);
        glDrawElementsInstanced = caps.get(211);
        glFenceSync = caps.get(212);
        glIsSync = caps.get(213);
        glDeleteSync = caps.get(214);
        glClientWaitSync = caps.get(215);
        glWaitSync = caps.get(216);
        glGetInteger64v = caps.get(217);
        glGetSynciv = caps.get(218);
        glGetInteger64i_v = caps.get(219);
        glGetBufferParameteri64v = caps.get(220);
        glGenSamplers = caps.get(221);
        glDeleteSamplers = caps.get(222);
        glIsSampler = caps.get(223);
        glBindSampler = caps.get(224);
        glSamplerParameteri = caps.get(225);
        glSamplerParameteriv = caps.get(226);
        glSamplerParameterf = caps.get(227);
        glSamplerParameterfv = caps.get(228);
        glGetSamplerParameteriv = caps.get(229);
        glGetSamplerParameterfv = caps.get(230);
        glVertexAttribDivisor = caps.get(231);
        glBindTransformFeedback = caps.get(232);
        glDeleteTransformFeedbacks = caps.get(233);
        glGenTransformFeedbacks = caps.get(234);
        glIsTransformFeedback = caps.get(235);
        glPauseTransformFeedback = caps.get(236);
        glResumeTransformFeedback = caps.get(237);
        glGetProgramBinary = caps.get(238);
        glProgramBinary = caps.get(239);
        glProgramParameteri = caps.get(240);
        glInvalidateFramebuffer = caps.get(241);
        glInvalidateSubFramebuffer = caps.get(242);
        glTexStorage2D = caps.get(243);
        glTexStorage3D = caps.get(244);
        glGetInternalformativ = caps.get(245);
        glDispatchCompute = caps.get(246);
        glDispatchComputeIndirect = caps.get(247);
        glDrawArraysIndirect = caps.get(248);
        glDrawElementsIndirect = caps.get(249);
        glFramebufferParameteri = caps.get(250);
        glGetFramebufferParameteriv = caps.get(251);
        glGetProgramInterfaceiv = caps.get(252);
        glGetProgramResourceIndex = caps.get(253);
        glGetProgramResourceName = caps.get(254);
        glGetProgramResourceiv = caps.get(255);
        glGetProgramResourceLocation = caps.get(256);
        glUseProgramStages = caps.get(257);
        glActiveShaderProgram = caps.get(258);
        glCreateShaderProgramv = caps.get(259);
        glBindProgramPipeline = caps.get(260);
        glDeleteProgramPipelines = caps.get(261);
        glGenProgramPipelines = caps.get(262);
        glIsProgramPipeline = caps.get(263);
        glGetProgramPipelineiv = caps.get(264);
        glProgramUniform1i = caps.get(265);
        glProgramUniform2i = caps.get(266);
        glProgramUniform3i = caps.get(267);
        glProgramUniform4i = caps.get(268);
        glProgramUniform1ui = caps.get(269);
        glProgramUniform2ui = caps.get(270);
        glProgramUniform3ui = caps.get(271);
        glProgramUniform4ui = caps.get(272);
        glProgramUniform1f = caps.get(273);
        glProgramUniform2f = caps.get(274);
        glProgramUniform3f = caps.get(275);
        glProgramUniform4f = caps.get(276);
        glProgramUniform1iv = caps.get(277);
        glProgramUniform2iv = caps.get(278);
        glProgramUniform3iv = caps.get(279);
        glProgramUniform4iv = caps.get(280);
        glProgramUniform1uiv = caps.get(281);
        glProgramUniform2uiv = caps.get(282);
        glProgramUniform3uiv = caps.get(283);
        glProgramUniform4uiv = caps.get(284);
        glProgramUniform1fv = caps.get(285);
        glProgramUniform2fv = caps.get(286);
        glProgramUniform3fv = caps.get(287);
        glProgramUniform4fv = caps.get(288);
        glProgramUniformMatrix2fv = caps.get(289);
        glProgramUniformMatrix3fv = caps.get(290);
        glProgramUniformMatrix4fv = caps.get(291);
        glProgramUniformMatrix2x3fv = caps.get(292);
        glProgramUniformMatrix3x2fv = caps.get(293);
        glProgramUniformMatrix2x4fv = caps.get(294);
        glProgramUniformMatrix4x2fv = caps.get(295);
        glProgramUniformMatrix3x4fv = caps.get(296);
        glProgramUniformMatrix4x3fv = caps.get(297);
        glValidateProgramPipeline = caps.get(298);
        glGetProgramPipelineInfoLog = caps.get(299);
        glBindImageTexture = caps.get(300);
        glGetBooleani_v = caps.get(301);
        glMemoryBarrier = caps.get(302);
        glMemoryBarrierByRegion = caps.get(303);
        glTexStorage2DMultisample = caps.get(304);
        glGetMultisamplefv = caps.get(305);
        glSampleMaski = caps.get(306);
        glGetTexLevelParameteriv = caps.get(307);
        glGetTexLevelParameterfv = caps.get(308);
        glBindVertexBuffer = caps.get(309);
        glVertexAttribFormat = caps.get(310);
        glVertexAttribIFormat = caps.get(311);
        glVertexAttribBinding = caps.get(312);
        glVertexBindingDivisor = caps.get(313);
        glBlendBarrier = caps.get(314);
        glCopyImageSubData = caps.get(315);
        glDebugMessageControl = caps.get(316);
        glDebugMessageInsert = caps.get(317);
        glDebugMessageCallback = caps.get(318);
        glGetDebugMessageLog = caps.get(319);
        glGetPointerv = caps.get(320);
        glPushDebugGroup = caps.get(321);
        glPopDebugGroup = caps.get(322);
        glObjectLabel = caps.get(323);
        glGetObjectLabel = caps.get(324);
        glObjectPtrLabel = caps.get(325);
        glGetObjectPtrLabel = caps.get(326);
        glEnablei = caps.get(327);
        glDisablei = caps.get(328);
        glBlendEquationi = caps.get(329);
        glBlendEquationSeparatei = caps.get(330);
        glBlendFunci = caps.get(331);
        glBlendFuncSeparatei = caps.get(332);
        glColorMaski = caps.get(333);
        glIsEnabledi = caps.get(334);
        glDrawElementsBaseVertex = caps.get(335);
        glDrawRangeElementsBaseVertex = caps.get(336);
        glDrawElementsInstancedBaseVertex = caps.get(337);
        glFramebufferTexture = caps.get(338);
        glPrimitiveBoundingBox = caps.get(339);
        glGetGraphicsResetStatus = caps.get(340);
        glReadnPixels = caps.get(341);
        glGetnUniformfv = caps.get(342);
        glGetnUniformiv = caps.get(343);
        glGetnUniformuiv = caps.get(344);
        glMinSampleShading = caps.get(345);
        glPatchParameteri = caps.get(346);
        glTexParameterIiv = caps.get(347);
        glTexParameterIuiv = caps.get(348);
        glGetTexParameterIiv = caps.get(349);
        glGetTexParameterIuiv = caps.get(350);
        glSamplerParameterIiv = caps.get(351);
        glSamplerParameterIuiv = caps.get(352);
        glGetSamplerParameterIiv = caps.get(353);
        glGetSamplerParameterIuiv = caps.get(354);
        glTexBuffer = caps.get(355);
        glTexBufferRange = caps.get(356);
        glTexStorage3DMultisample = caps.get(357);
        glRenderbufferStorageMultisampleAdvancedAMD = caps.get(358);
        glNamedRenderbufferStorageMultisampleAdvancedAMD = caps.get(359);
        glGetPerfMonitorGroupsAMD = caps.get(360);
        glGetPerfMonitorCountersAMD = caps.get(361);
        glGetPerfMonitorGroupStringAMD = caps.get(362);
        glGetPerfMonitorCounterStringAMD = caps.get(363);
        glGetPerfMonitorCounterInfoAMD = caps.get(364);
        glGenPerfMonitorsAMD = caps.get(365);
        glDeletePerfMonitorsAMD = caps.get(366);
        glSelectPerfMonitorCountersAMD = caps.get(367);
        glBeginPerfMonitorAMD = caps.get(368);
        glEndPerfMonitorAMD = caps.get(369);
        glGetPerfMonitorCounterDataAMD = caps.get(370);
        glBlitFramebufferANGLE = caps.get(371);
        glRenderbufferStorageMultisampleANGLE = caps.get(372);
        glDrawArraysInstancedANGLE = caps.get(373);
        glDrawElementsInstancedANGLE = caps.get(374);
        glVertexAttribDivisorANGLE = caps.get(375);
        glGetTranslatedShaderSourceANGLE = caps.get(376);
        glCopyTextureLevelsAPPLE = caps.get(377);
        glRenderbufferStorageMultisampleAPPLE = caps.get(378);
        glResolveMultisampleFramebufferAPPLE = caps.get(379);
        glFenceSyncAPPLE = caps.get(380);
        glIsSyncAPPLE = caps.get(381);
        glDeleteSyncAPPLE = caps.get(382);
        glClientWaitSyncAPPLE = caps.get(383);
        glWaitSyncAPPLE = caps.get(384);
        glGetInteger64vAPPLE = caps.get(385);
        glGetSyncivAPPLE = caps.get(386);
        glDrawArraysInstancedBaseInstanceEXT = caps.get(387);
        glDrawElementsInstancedBaseInstanceEXT = caps.get(388);
        glDrawElementsInstancedBaseVertexBaseInstanceEXT = caps.get(389);
        glBindFragDataLocationIndexedEXT = caps.get(390);
        glGetFragDataIndexEXT = caps.get(391);
        glBindFragDataLocationEXT = caps.get(392);
        glGetProgramResourceLocationIndexEXT = caps.get(393);
        glBufferStorageEXT = caps.get(394);
        glNamedBufferStorageEXT = caps.get(395);
        glClearTexImageEXT = caps.get(396);
        glClearTexSubImageEXT = caps.get(397);
        glClipControlEXT = caps.get(398);
        glCopyImageSubDataEXT = caps.get(399);
        glLabelObjectEXT = caps.get(400);
        glGetObjectLabelEXT = caps.get(401);
        glInsertEventMarkerEXT = caps.get(402);
        glPushGroupMarkerEXT = caps.get(403);
        glPopGroupMarkerEXT = caps.get(404);
        glDiscardFramebufferEXT = caps.get(405);
        glGenQueriesEXT = caps.get(406);
        glDeleteQueriesEXT = caps.get(407);
        glIsQueryEXT = caps.get(408);
        glBeginQueryEXT = caps.get(409);
        glEndQueryEXT = caps.get(410);
        glGetQueryivEXT = caps.get(411);
        glGetQueryObjectuivEXT = caps.get(412);
        glQueryCounterEXT = caps.get(413);
        glGetQueryObjectivEXT = caps.get(414);
        glGetQueryObjecti64vEXT = caps.get(415);
        glGetQueryObjectui64vEXT = caps.get(416);
        glGetInteger64vEXT = caps.get(417);
        glDrawBuffersEXT = caps.get(418);
        glEnableiEXT = caps.get(419);
        glDisableiEXT = caps.get(420);
        glBlendEquationiEXT = caps.get(421);
        glBlendEquationSeparateiEXT = caps.get(422);
        glBlendFunciEXT = caps.get(423);
        glBlendFuncSeparateiEXT = caps.get(424);
        glColorMaskiEXT = caps.get(425);
        glIsEnablediEXT = caps.get(426);
        glDrawElementsBaseVertexEXT = caps.get(427);
        glDrawRangeElementsBaseVertexEXT = caps.get(428);
        glDrawElementsInstancedBaseVertexEXT = caps.get(429);
        glMultiDrawElementsBaseVertexEXT = caps.get(430);
        glDrawArraysInstancedEXT = caps.get(431);
        glDrawElementsInstancedEXT = caps.get(432);
        glDrawTransformFeedbackEXT = caps.get(433);
        glDrawTransformFeedbackInstancedEXT = caps.get(434);
        glEGLImageTargetTexStorageEXT = caps.get(435);
        glEGLImageTargetTextureStorageEXT = caps.get(436);
        glBufferStorageExternalEXT = caps.get(437);
        glNamedBufferStorageExternalEXT = caps.get(438);
        glShadingRateEXT = caps.get(439);
        glShadingRateCombinerOpsEXT = caps.get(440);
        glFramebufferShadingRateEXT = caps.get(441);
        glGetFragmentShadingRatesEXT = caps.get(442);
        glBlitFramebufferLayersEXT = caps.get(443);
        glBlitFramebufferLayerEXT = caps.get(444);
        glFramebufferTextureEXT = caps.get(445);
        glVertexAttribDivisorEXT = caps.get(446);
        glMapBufferRangeEXT = caps.get(447);
        glFlushMappedBufferRangeEXT = caps.get(448);
        glGetUnsignedBytevEXT = caps.get(449);
        glGetUnsignedBytei_vEXT = caps.get(450);
        glDeleteMemoryObjectsEXT = caps.get(451);
        glIsMemoryObjectEXT = caps.get(452);
        glCreateMemoryObjectsEXT = caps.get(453);
        glMemoryObjectParameterivEXT = caps.get(454);
        glGetMemoryObjectParameterivEXT = caps.get(455);
        glTexStorageMem2DEXT = caps.get(456);
        glTexStorageMem2DMultisampleEXT = caps.get(457);
        glTexStorageMem3DEXT = caps.get(458);
        glTexStorageMem3DMultisampleEXT = caps.get(459);
        glBufferStorageMemEXT = caps.get(460);
        glTextureStorageMem2DEXT = caps.get(461);
        glTextureStorageMem2DMultisampleEXT = caps.get(462);
        glTextureStorageMem3DEXT = caps.get(463);
        glTextureStorageMem3DMultisampleEXT = caps.get(464);
        glNamedBufferStorageMemEXT = caps.get(465);
        glImportMemoryFdEXT = caps.get(466);
        glImportMemoryWin32HandleEXT = caps.get(467);
        glImportMemoryWin32NameEXT = caps.get(468);
        glMultiDrawArraysEXT = caps.get(469);
        glMultiDrawElementsEXT = caps.get(470);
        glMultiDrawArraysIndirectEXT = caps.get(471);
        glMultiDrawElementsIndirectEXT = caps.get(472);
        glRenderbufferStorageMultisampleEXT = caps.get(473);
        glFramebufferTexture2DMultisampleEXT = caps.get(474);
        glReadBufferIndexedEXT = caps.get(475);
        glDrawBuffersIndexedEXT = caps.get(476);
        glGetIntegeri_vEXT = caps.get(477);
        glPolygonOffsetClampEXT = caps.get(478);
        glPrimitiveBoundingBoxEXT = caps.get(479);
        glRasterSamplesEXT = caps.get(480);
        glGetGraphicsResetStatusEXT = caps.get(481);
        glReadnPixelsEXT = caps.get(482);
        glGetnUniformfvEXT = caps.get(483);
        glGetnUniformivEXT = caps.get(484);
        glGenSemaphoresEXT = caps.get(485);
        glDeleteSemaphoresEXT = caps.get(486);
        glIsSemaphoreEXT = caps.get(487);
        glSemaphoreParameterui64vEXT = caps.get(488);
        glGetSemaphoreParameterui64vEXT = caps.get(489);
        glWaitSemaphoreEXT = caps.get(490);
        glSignalSemaphoreEXT = caps.get(491);
        glImportSemaphoreFdEXT = caps.get(492);
        glImportSemaphoreWin32HandleEXT = caps.get(493);
        glImportSemaphoreWin32NameEXT = caps.get(494);
        glActiveShaderProgramEXT = caps.get(495);
        glBindProgramPipelineEXT = caps.get(496);
        glCreateShaderProgramvEXT = caps.get(497);
        glDeleteProgramPipelinesEXT = caps.get(498);
        glGenProgramPipelinesEXT = caps.get(499);
        glGetProgramPipelineInfoLogEXT = caps.get(500);
        glGetProgramPipelineivEXT = caps.get(501);
        glIsProgramPipelineEXT = caps.get(502);
        glProgramParameteriEXT = caps.get(503);
        glProgramUniform1fEXT = caps.get(504);
        glProgramUniform1fvEXT = caps.get(505);
        glProgramUniform1iEXT = caps.get(506);
        glProgramUniform1ivEXT = caps.get(507);
        glProgramUniform2fEXT = caps.get(508);
        glProgramUniform2fvEXT = caps.get(509);
        glProgramUniform2iEXT = caps.get(510);
        glProgramUniform2ivEXT = caps.get(511);
        glProgramUniform3fEXT = caps.get(512);
        glProgramUniform3fvEXT = caps.get(513);
        glProgramUniform3iEXT = caps.get(514);
        glProgramUniform3ivEXT = caps.get(515);
        glProgramUniform4fEXT = caps.get(516);
        glProgramUniform4fvEXT = caps.get(517);
        glProgramUniform4iEXT = caps.get(518);
        glProgramUniform4ivEXT = caps.get(519);
        glProgramUniformMatrix2fvEXT = caps.get(520);
        glProgramUniformMatrix3fvEXT = caps.get(521);
        glProgramUniformMatrix4fvEXT = caps.get(522);
        glUseProgramStagesEXT = caps.get(523);
        glValidateProgramPipelineEXT = caps.get(524);
        glProgramUniform1uiEXT = caps.get(525);
        glProgramUniform2uiEXT = caps.get(526);
        glProgramUniform3uiEXT = caps.get(527);
        glProgramUniform4uiEXT = caps.get(528);
        glProgramUniform1uivEXT = caps.get(529);
        glProgramUniform2uivEXT = caps.get(530);
        glProgramUniform3uivEXT = caps.get(531);
        glProgramUniform4uivEXT = caps.get(532);
        glProgramUniformMatrix2x3fvEXT = caps.get(533);
        glProgramUniformMatrix3x2fvEXT = caps.get(534);
        glProgramUniformMatrix2x4fvEXT = caps.get(535);
        glProgramUniformMatrix4x2fvEXT = caps.get(536);
        glProgramUniformMatrix3x4fvEXT = caps.get(537);
        glProgramUniformMatrix4x3fvEXT = caps.get(538);
        glFramebufferFetchBarrierEXT = caps.get(539);
        glFramebufferPixelLocalStorageSizeEXT = caps.get(540);
        glGetFramebufferPixelLocalStorageSizeEXT = caps.get(541);
        glClearPixelLocalStorageuiEXT = caps.get(542);
        glTexPageCommitmentARB = caps.get(543);
        glPatchParameteriEXT = caps.get(544);
        glTexParameterIivEXT = caps.get(545);
        glTexParameterIuivEXT = caps.get(546);
        glGetTexParameterIivEXT = caps.get(547);
        glGetTexParameterIuivEXT = caps.get(548);
        glSamplerParameterIivEXT = caps.get(549);
        glSamplerParameterIuivEXT = caps.get(550);
        glGetSamplerParameterIivEXT = caps.get(551);
        glGetSamplerParameterIuivEXT = caps.get(552);
        glTexBufferEXT = caps.get(553);
        glTexBufferRangeEXT = caps.get(554);
        glTexStorage1DEXT = caps.get(555);
        glTexStorage2DEXT = caps.get(556);
        glTexStorage3DEXT = caps.get(557);
        glTextureStorage1DEXT = caps.get(558);
        glTextureStorage2DEXT = caps.get(559);
        glTextureStorage3DEXT = caps.get(560);
        glTexStorageAttribs2DEXT = caps.get(561);
        glTexStorageAttribs3DEXT = caps.get(562);
        glTextureViewEXT = caps.get(563);
        glAcquireKeyedMutexWin32EXT = caps.get(564);
        glReleaseKeyedMutexWin32EXT = caps.get(565);
        glWindowRectanglesEXT = caps.get(566);
        glFramebufferTexture2DDownsampleIMG = caps.get(567);
        glFramebufferTextureLayerDownsampleIMG = caps.get(568);
        glRenderbufferStorageMultisampleIMG = caps.get(569);
        glFramebufferTexture2DMultisampleIMG = caps.get(570);
        glApplyFramebufferAttachmentCMAAINTEL = caps.get(571);
        glBeginPerfQueryINTEL = caps.get(572);
        glCreatePerfQueryINTEL = caps.get(573);
        glDeletePerfQueryINTEL = caps.get(574);
        glEndPerfQueryINTEL = caps.get(575);
        glGetFirstPerfQueryIdINTEL = caps.get(576);
        glGetNextPerfQueryIdINTEL = caps.get(577);
        glGetPerfCounterInfoINTEL = caps.get(578);
        glGetPerfQueryDataINTEL = caps.get(579);
        glGetPerfQueryIdByNameINTEL = caps.get(580);
        glGetPerfQueryInfoINTEL = caps.get(581);
        glBlendBarrierKHR = caps.get(582);
        glDebugMessageControlKHR = caps.get(583);
        glDebugMessageInsertKHR = caps.get(584);
        glDebugMessageCallbackKHR = caps.get(585);
        glGetDebugMessageLogKHR = caps.get(586);
        glGetPointervKHR = caps.get(587);
        glPushDebugGroupKHR = caps.get(588);
        glPopDebugGroupKHR = caps.get(589);
        glObjectLabelKHR = caps.get(590);
        glGetObjectLabelKHR = caps.get(591);
        glObjectPtrLabelKHR = caps.get(592);
        glGetObjectPtrLabelKHR = caps.get(593);
        glMaxShaderCompilerThreadsKHR = caps.get(594);
        glGetGraphicsResetStatusKHR = caps.get(595);
        glReadnPixelsKHR = caps.get(596);
        glGetnUniformfvKHR = caps.get(597);
        glGetnUniformivKHR = caps.get(598);
        glGetnUniformuivKHR = caps.get(599);
        glFramebufferParameteriMESA = caps.get(600);
        glGetFramebufferParameterivMESA = caps.get(601);
        glAlphaToCoverageDitherControlNV = caps.get(602);
        glGetTextureHandleNV = caps.get(603);
        glGetTextureSamplerHandleNV = caps.get(604);
        glMakeTextureHandleResidentNV = caps.get(605);
        glMakeTextureHandleNonResidentNV = caps.get(606);
        glGetImageHandleNV = caps.get(607);
        glMakeImageHandleResidentNV = caps.get(608);
        glMakeImageHandleNonResidentNV = caps.get(609);
        glUniformHandleui64NV = caps.get(610);
        glUniformHandleui64vNV = caps.get(611);
        glProgramUniformHandleui64NV = caps.get(612);
        glProgramUniformHandleui64vNV = caps.get(613);
        glIsTextureHandleResidentNV = caps.get(614);
        glIsImageHandleResidentNV = caps.get(615);
        glBlendParameteriNV = caps.get(616);
        glBlendBarrierNV = caps.get(617);
        glViewportPositionWScaleNV = caps.get(618);
        glBeginConditionalRenderNV = caps.get(619);
        glEndConditionalRenderNV = caps.get(620);
        glSubpixelPrecisionBiasNV = caps.get(621);
        glConservativeRasterParameteriNV = caps.get(622);
        glCopyBufferSubDataNV = caps.get(623);
        glCoverageMaskNV = caps.get(624);
        glCoverageOperationNV = caps.get(625);
        glDrawBuffersNV = caps.get(626);
        glDrawArraysInstancedNV = caps.get(627);
        glDrawElementsInstancedNV = caps.get(628);
        glDrawVkImageNV = caps.get(629);
        glGetVkProcAddrNV = caps.get(630);
        glWaitVkSemaphoreNV = caps.get(631);
        glSignalVkSemaphoreNV = caps.get(632);
        glSignalVkFenceNV = caps.get(633);
        glDeleteFencesNV = caps.get(634);
        glGenFencesNV = caps.get(635);
        glIsFenceNV = caps.get(636);
        glTestFenceNV = caps.get(637);
        glGetFenceivNV = caps.get(638);
        glFinishFenceNV = caps.get(639);
        glSetFenceNV = caps.get(640);
        glFragmentCoverageColorNV = caps.get(641);
        glBlitFramebufferNV = caps.get(642);
        glCoverageModulationTableNV = caps.get(643);
        glGetCoverageModulationTableNV = caps.get(644);
        glCoverageModulationNV = caps.get(645);
        glRenderbufferStorageMultisampleNV = caps.get(646);
        glUniform1i64NV = caps.get(647);
        glUniform2i64NV = caps.get(648);
        glUniform3i64NV = caps.get(649);
        glUniform4i64NV = caps.get(650);
        glUniform1i64vNV = caps.get(651);
        glUniform2i64vNV = caps.get(652);
        glUniform3i64vNV = caps.get(653);
        glUniform4i64vNV = caps.get(654);
        glUniform1ui64NV = caps.get(655);
        glUniform2ui64NV = caps.get(656);
        glUniform3ui64NV = caps.get(657);
        glUniform4ui64NV = caps.get(658);
        glUniform1ui64vNV = caps.get(659);
        glUniform2ui64vNV = caps.get(660);
        glUniform3ui64vNV = caps.get(661);
        glUniform4ui64vNV = caps.get(662);
        glGetUniformi64vNV = caps.get(663);
        glGetUniformui64vNV = caps.get(664);
        glProgramUniform1i64NV = caps.get(665);
        glProgramUniform2i64NV = caps.get(666);
        glProgramUniform3i64NV = caps.get(667);
        glProgramUniform4i64NV = caps.get(668);
        glProgramUniform1i64vNV = caps.get(669);
        glProgramUniform2i64vNV = caps.get(670);
        glProgramUniform3i64vNV = caps.get(671);
        glProgramUniform4i64vNV = caps.get(672);
        glProgramUniform1ui64NV = caps.get(673);
        glProgramUniform2ui64NV = caps.get(674);
        glProgramUniform3ui64NV = caps.get(675);
        glProgramUniform4ui64NV = caps.get(676);
        glProgramUniform1ui64vNV = caps.get(677);
        glProgramUniform2ui64vNV = caps.get(678);
        glProgramUniform3ui64vNV = caps.get(679);
        glProgramUniform4ui64vNV = caps.get(680);
        glVertexAttribDivisorNV = caps.get(681);
        glGetInternalformatSampleivNV = caps.get(682);
        glGetMemoryObjectDetachedResourcesuivNV = caps.get(683);
        glResetMemoryObjectParameterNV = caps.get(684);
        glTexAttachMemoryNV = caps.get(685);
        glBufferAttachMemoryNV = caps.get(686);
        glTextureAttachMemoryNV = caps.get(687);
        glNamedBufferAttachMemoryNV = caps.get(688);
        glBufferPageCommitmentMemNV = caps.get(689);
        glNamedBufferPageCommitmentMemNV = caps.get(690);
        glTexPageCommitmentMemNV = caps.get(691);
        glTexturePageCommitmentMemNV = caps.get(692);
        glDrawMeshTasksNV = caps.get(693);
        glDrawMeshTasksIndirectNV = caps.get(694);
        glMultiDrawMeshTasksIndirectNV = caps.get(695);
        glUniformMatrix2x3fvNV = caps.get(696);
        glUniformMatrix3x2fvNV = caps.get(697);
        glUniformMatrix2x4fvNV = caps.get(698);
        glUniformMatrix4x2fvNV = caps.get(699);
        glUniformMatrix3x4fvNV = caps.get(700);
        glUniformMatrix4x3fvNV = caps.get(701);
        glPathCommandsNV = caps.get(702);
        glPathCoordsNV = caps.get(703);
        glPathSubCommandsNV = caps.get(704);
        glPathSubCoordsNV = caps.get(705);
        glPathStringNV = caps.get(706);
        glPathGlyphsNV = caps.get(707);
        glPathGlyphRangeNV = caps.get(708);
        glPathGlyphIndexArrayNV = caps.get(709);
        glPathMemoryGlyphIndexArrayNV = caps.get(710);
        glCopyPathNV = caps.get(711);
        glWeightPathsNV = caps.get(712);
        glInterpolatePathsNV = caps.get(713);
        glTransformPathNV = caps.get(714);
        glPathParameterivNV = caps.get(715);
        glPathParameteriNV = caps.get(716);
        glPathParameterfvNV = caps.get(717);
        glPathParameterfNV = caps.get(718);
        glPathDashArrayNV = caps.get(719);
        glGenPathsNV = caps.get(720);
        glDeletePathsNV = caps.get(721);
        glIsPathNV = caps.get(722);
        glPathStencilFuncNV = caps.get(723);
        glPathStencilDepthOffsetNV = caps.get(724);
        glStencilFillPathNV = caps.get(725);
        glStencilStrokePathNV = caps.get(726);
        glStencilFillPathInstancedNV = caps.get(727);
        glStencilStrokePathInstancedNV = caps.get(728);
        glPathCoverDepthFuncNV = caps.get(729);
        glCoverFillPathNV = caps.get(730);
        glCoverStrokePathNV = caps.get(731);
        glCoverFillPathInstancedNV = caps.get(732);
        glCoverStrokePathInstancedNV = caps.get(733);
        glStencilThenCoverFillPathNV = caps.get(734);
        glStencilThenCoverStrokePathNV = caps.get(735);
        glStencilThenCoverFillPathInstancedNV = caps.get(736);
        glStencilThenCoverStrokePathInstancedNV = caps.get(737);
        glPathGlyphIndexRangeNV = caps.get(738);
        glProgramPathFragmentInputGenNV = caps.get(739);
        glGetPathParameterivNV = caps.get(740);
        glGetPathParameterfvNV = caps.get(741);
        glGetPathCommandsNV = caps.get(742);
        glGetPathCoordsNV = caps.get(743);
        glGetPathDashArrayNV = caps.get(744);
        glGetPathMetricsNV = caps.get(745);
        glGetPathMetricRangeNV = caps.get(746);
        glGetPathSpacingNV = caps.get(747);
        glIsPointInFillPathNV = caps.get(748);
        glIsPointInStrokePathNV = caps.get(749);
        glGetPathLengthNV = caps.get(750);
        glPointAlongPathNV = caps.get(751);
        glMatrixLoad3x2fNV = caps.get(752);
        glMatrixLoad3x3fNV = caps.get(753);
        glMatrixLoadTranspose3x3fNV = caps.get(754);
        glMatrixMult3x2fNV = caps.get(755);
        glMatrixMult3x3fNV = caps.get(756);
        glMatrixMultTranspose3x3fNV = caps.get(757);
        glGetProgramResourcefvNV = caps.get(758);
        glPolygonModeNV = caps.get(759);
        glReadBufferNV = caps.get(760);
        glFramebufferSampleLocationsfvNV = caps.get(761);
        glNamedFramebufferSampleLocationsfvNV = caps.get(762);
        glResolveDepthValuesNV = caps.get(763);
        glScissorExclusiveArrayvNV = caps.get(764);
        glScissorExclusiveNV = caps.get(765);
        glTexImage3DNV = caps.get(766);
        glTexSubImage3DNV = caps.get(767);
        glCopyTexSubImage3DNV = caps.get(768);
        glCompressedTexImage3DNV = caps.get(769);
        glCompressedTexSubImage3DNV = caps.get(770);
        glFramebufferTextureLayerNV = caps.get(771);
        glTextureBarrierNV = caps.get(772);
        glCreateSemaphoresNV = caps.get(773);
        glSemaphoreParameterivNV = caps.get(774);
        glGetSemaphoreParameterivNV = caps.get(775);
        glViewportArrayvNV = caps.get(776);
        glViewportIndexedfNV = caps.get(777);
        glViewportIndexedfvNV = caps.get(778);
        glScissorArrayvNV = caps.get(779);
        glScissorIndexedNV = caps.get(780);
        glScissorIndexedvNV = caps.get(781);
        glDepthRangeArrayfvNV = caps.get(782);
        glDepthRangeIndexedfNV = caps.get(783);
        glGetFloati_vNV = caps.get(784);
        glEnableiNV = caps.get(785);
        glDisableiNV = caps.get(786);
        glIsEnablediNV = caps.get(787);
        glViewportSwizzleNV = caps.get(788);
        glCopyImageSubDataOES = caps.get(789);
        glEnableiOES = caps.get(790);
        glDisableiOES = caps.get(791);
        glBlendEquationiOES = caps.get(792);
        glBlendEquationSeparateiOES = caps.get(793);
        glBlendFunciOES = caps.get(794);
        glBlendFuncSeparateiOES = caps.get(795);
        glColorMaskiOES = caps.get(796);
        glIsEnablediOES = caps.get(797);
        glDrawElementsBaseVertexOES = caps.get(798);
        glDrawRangeElementsBaseVertexOES = caps.get(799);
        glDrawElementsInstancedBaseVertexOES = caps.get(800);
        glMultiDrawElementsBaseVertexOES = caps.get(801);
        glEGLImageTargetTexture2DOES = caps.get(802);
        glEGLImageTargetRenderbufferStorageOES = caps.get(803);
        glFramebufferTextureOES = caps.get(804);
        glGetProgramBinaryOES = caps.get(805);
        glProgramBinaryOES = caps.get(806);
        glMapBufferOES = caps.get(807);
        glUnmapBufferOES = caps.get(808);
        glGetBufferPointervOES = caps.get(809);
        glPrimitiveBoundingBoxOES = caps.get(810);
        glMinSampleShadingOES = caps.get(811);
        glPatchParameteriOES = caps.get(812);
        glTexImage3DOES = caps.get(813);
        glTexSubImage3DOES = caps.get(814);
        glCopyTexSubImage3DOES = caps.get(815);
        glCompressedTexImage3DOES = caps.get(816);
        glCompressedTexSubImage3DOES = caps.get(817);
        glFramebufferTexture3DOES = caps.get(818);
        glTexParameterIivOES = caps.get(819);
        glTexParameterIuivOES = caps.get(820);
        glGetTexParameterIivOES = caps.get(821);
        glGetTexParameterIuivOES = caps.get(822);
        glSamplerParameterIivOES = caps.get(823);
        glSamplerParameterIuivOES = caps.get(824);
        glGetSamplerParameterIivOES = caps.get(825);
        glGetSamplerParameterIuivOES = caps.get(826);
        glTexBufferOES = caps.get(827);
        glTexBufferRangeOES = caps.get(828);
        glTexStorage3DMultisampleOES = caps.get(829);
        glTextureViewOES = caps.get(830);
        glBindVertexArrayOES = caps.get(831);
        glDeleteVertexArraysOES = caps.get(832);
        glGenVertexArraysOES = caps.get(833);
        glIsVertexArrayOES = caps.get(834);
        glViewportArrayvOES = caps.get(835);
        glViewportIndexedfOES = caps.get(836);
        glViewportIndexedfvOES = caps.get(837);
        glScissorArrayvOES = caps.get(838);
        glScissorIndexedOES = caps.get(839);
        glScissorIndexedvOES = caps.get(840);
        glDepthRangeArrayfvOES = caps.get(841);
        glDepthRangeIndexedfOES = caps.get(842);
        glGetFloati_vOES = caps.get(843);
        glFramebufferTextureMultiviewOVR = caps.get(844);
        glFramebufferTextureMultisampleMultiviewOVR = caps.get(845);
        glAlphaFuncQCOM = caps.get(846);
        glGetDriverControlsQCOM = caps.get(847);
        glGetDriverControlStringQCOM = caps.get(848);
        glEnableDriverControlQCOM = caps.get(849);
        glDisableDriverControlQCOM = caps.get(850);
        glExtGetTexturesQCOM = caps.get(851);
        glExtGetBuffersQCOM = caps.get(852);
        glExtGetRenderbuffersQCOM = caps.get(853);
        glExtGetFramebuffersQCOM = caps.get(854);
        glExtGetTexLevelParameterivQCOM = caps.get(855);
        glExtTexObjectStateOverrideiQCOM = caps.get(856);
        glExtGetTexSubImageQCOM = caps.get(857);
        glExtGetBufferPointervQCOM = caps.get(858);
        glExtGetShadersQCOM = caps.get(859);
        glExtGetProgramsQCOM = caps.get(860);
        glExtIsProgramBinaryQCOM = caps.get(861);
        glExtGetProgramBinarySourceQCOM = caps.get(862);
        glExtrapolateTex2DQCOM = caps.get(863);
        glFramebufferFoveationConfigQCOM = caps.get(864);
        glFramebufferFoveationParametersQCOM = caps.get(865);
        glTexEstimateMotionQCOM = caps.get(866);
        glTexEstimateMotionRegionsQCOM = caps.get(867);
        glFramebufferFetchBarrierQCOM = caps.get(868);
        glTextureFoveationParametersQCOM = caps.get(869);
        glStartTilingQCOM = caps.get(870);
        glEndTilingQCOM = caps.get(871);

        addresses = ThreadLocalUtil.setupAddressBuffer(caps);
    }

    /** Returns the buffer of OpenGL ES function pointers. */
    public PointerBuffer getAddressBuffer() {
        return addresses;
    }

    private static boolean check_GLES20(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GLES20")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 
            110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 
            139, 140, 141
        },
            "glActiveTexture", "glAttachShader", "glBindAttribLocation", "glBindBuffer", "glBindFramebuffer", "glBindRenderbuffer", "glBindTexture", 
            "glBlendColor", "glBlendEquation", "glBlendEquationSeparate", "glBlendFunc", "glBlendFuncSeparate", "glBufferData", "glBufferSubData", 
            "glCheckFramebufferStatus", "glClear", "glClearColor", "glClearDepthf", "glClearStencil", "glColorMask", "glCompileShader", 
            "glCompressedTexImage2D", "glCompressedTexSubImage2D", "glCopyTexImage2D", "glCopyTexSubImage2D", "glCreateProgram", "glCreateShader", "glCullFace", 
            "glDeleteBuffers", "glDeleteFramebuffers", "glDeleteProgram", "glDeleteRenderbuffers", "glDeleteShader", "glDeleteTextures", "glDepthFunc", 
            "glDepthMask", "glDepthRangef", "glDetachShader", "glDisable", "glDisableVertexAttribArray", "glDrawArrays", "glDrawElements", "glEnable", 
            "glEnableVertexAttribArray", "glFinish", "glFlush", "glFramebufferRenderbuffer", "glFramebufferTexture2D", "glFrontFace", "glGenBuffers", 
            "glGenerateMipmap", "glGenFramebuffers", "glGenRenderbuffers", "glGenTextures", "glGetActiveAttrib", "glGetActiveUniform", "glGetAttachedShaders", 
            "glGetAttribLocation", "glGetBooleanv", "glGetBufferParameteriv", "glGetError", "glGetFloatv", "glGetFramebufferAttachmentParameteriv", 
            "glGetIntegerv", "glGetProgramiv", "glGetProgramInfoLog", "glGetRenderbufferParameteriv", "glGetShaderiv", "glGetShaderInfoLog", 
            "glGetShaderPrecisionFormat", "glGetShaderSource", "glGetString", "glGetTexParameterfv", "glGetTexParameteriv", "glGetUniformfv", "glGetUniformiv", 
            "glGetUniformLocation", "glGetVertexAttribfv", "glGetVertexAttribiv", "glGetVertexAttribPointerv", "glHint", "glIsBuffer", "glIsEnabled", 
            "glIsFramebuffer", "glIsProgram", "glIsRenderbuffer", "glIsShader", "glIsTexture", "glLineWidth", "glLinkProgram", "glPixelStorei", 
            "glPolygonOffset", "glReadPixels", "glReleaseShaderCompiler", "glRenderbufferStorage", "glSampleCoverage", "glScissor", "glShaderBinary", 
            "glShaderSource", "glStencilFunc", "glStencilFuncSeparate", "glStencilMask", "glStencilMaskSeparate", "glStencilOp", "glStencilOpSeparate", 
            "glTexImage2D", "glTexParameterf", "glTexParameterfv", "glTexParameteri", "glTexParameteriv", "glTexSubImage2D", "glUniform1f", "glUniform1fv", 
            "glUniform1i", "glUniform1iv", "glUniform2f", "glUniform2fv", "glUniform2i", "glUniform2iv", "glUniform3f", "glUniform3fv", "glUniform3i", 
            "glUniform3iv", "glUniform4f", "glUniform4fv", "glUniform4i", "glUniform4iv", "glUniformMatrix2fv", "glUniformMatrix3fv", "glUniformMatrix4fv", 
            "glUseProgram", "glValidateProgram", "glVertexAttrib1f", "glVertexAttrib1fv", "glVertexAttrib2f", "glVertexAttrib2fv", "glVertexAttrib3f", 
            "glVertexAttrib3fv", "glVertexAttrib4f", "glVertexAttrib4fv", "glVertexAttribPointer", "glViewport"
        ) || reportMissing("GLES", "GLES20");
    }

    private static boolean check_GLES30(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GLES30")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 
            171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 
            200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 
            229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245
        },
            "glReadBuffer", "glDrawRangeElements", "glTexImage3D", "glTexSubImage3D", "glCopyTexSubImage3D", "glCompressedTexImage3D", 
            "glCompressedTexSubImage3D", "glGenQueries", "glDeleteQueries", "glIsQuery", "glBeginQuery", "glEndQuery", "glGetQueryiv", "glGetQueryObjectuiv", 
            "glUnmapBuffer", "glGetBufferPointerv", "glDrawBuffers", "glUniformMatrix2x3fv", "glUniformMatrix3x2fv", "glUniformMatrix2x4fv", 
            "glUniformMatrix4x2fv", "glUniformMatrix3x4fv", "glUniformMatrix4x3fv", "glBlitFramebuffer", "glRenderbufferStorageMultisample", 
            "glFramebufferTextureLayer", "glMapBufferRange", "glFlushMappedBufferRange", "glBindVertexArray", "glDeleteVertexArrays", "glGenVertexArrays", 
            "glIsVertexArray", "glGetIntegeri_v", "glBeginTransformFeedback", "glEndTransformFeedback", "glBindBufferRange", "glBindBufferBase", 
            "glTransformFeedbackVaryings", "glGetTransformFeedbackVarying", "glVertexAttribIPointer", "glGetVertexAttribIiv", "glGetVertexAttribIuiv", 
            "glVertexAttribI4i", "glVertexAttribI4ui", "glVertexAttribI4iv", "glVertexAttribI4uiv", "glGetUniformuiv", "glGetFragDataLocation", "glUniform1ui", 
            "glUniform2ui", "glUniform3ui", "glUniform4ui", "glUniform1uiv", "glUniform2uiv", "glUniform3uiv", "glUniform4uiv", "glClearBufferiv", 
            "glClearBufferuiv", "glClearBufferfv", "glClearBufferfi", "glGetStringi", "glCopyBufferSubData", "glGetUniformIndices", "glGetActiveUniformsiv", 
            "glGetUniformBlockIndex", "glGetActiveUniformBlockiv", "glGetActiveUniformBlockName", "glUniformBlockBinding", "glDrawArraysInstanced", 
            "glDrawElementsInstanced", "glFenceSync", "glIsSync", "glDeleteSync", "glClientWaitSync", "glWaitSync", "glGetInteger64v", "glGetSynciv", 
            "glGetInteger64i_v", "glGetBufferParameteri64v", "glGenSamplers", "glDeleteSamplers", "glIsSampler", "glBindSampler", "glSamplerParameteri", 
            "glSamplerParameteriv", "glSamplerParameterf", "glSamplerParameterfv", "glGetSamplerParameteriv", "glGetSamplerParameterfv", 
            "glVertexAttribDivisor", "glBindTransformFeedback", "glDeleteTransformFeedbacks", "glGenTransformFeedbacks", "glIsTransformFeedback", 
            "glPauseTransformFeedback", "glResumeTransformFeedback", "glGetProgramBinary", "glProgramBinary", "glProgramParameteri", "glInvalidateFramebuffer", 
            "glInvalidateSubFramebuffer", "glTexStorage2D", "glTexStorage3D", "glGetInternalformativ"
        ) || reportMissing("GLES", "GLES30");
    }

    private static boolean check_GLES31(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GLES31")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 
            275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 
            304, 305, 306, 307, 308, 309, 310, 311, 312, 313
        },
            "glDispatchCompute", "glDispatchComputeIndirect", "glDrawArraysIndirect", "glDrawElementsIndirect", "glFramebufferParameteri", 
            "glGetFramebufferParameteriv", "glGetProgramInterfaceiv", "glGetProgramResourceIndex", "glGetProgramResourceName", "glGetProgramResourceiv", 
            "glGetProgramResourceLocation", "glUseProgramStages", "glActiveShaderProgram", "glCreateShaderProgramv", "glBindProgramPipeline", 
            "glDeleteProgramPipelines", "glGenProgramPipelines", "glIsProgramPipeline", "glGetProgramPipelineiv", "glProgramUniform1i", "glProgramUniform2i", 
            "glProgramUniform3i", "glProgramUniform4i", "glProgramUniform1ui", "glProgramUniform2ui", "glProgramUniform3ui", "glProgramUniform4ui", 
            "glProgramUniform1f", "glProgramUniform2f", "glProgramUniform3f", "glProgramUniform4f", "glProgramUniform1iv", "glProgramUniform2iv", 
            "glProgramUniform3iv", "glProgramUniform4iv", "glProgramUniform1uiv", "glProgramUniform2uiv", "glProgramUniform3uiv", "glProgramUniform4uiv", 
            "glProgramUniform1fv", "glProgramUniform2fv", "glProgramUniform3fv", "glProgramUniform4fv", "glProgramUniformMatrix2fv", 
            "glProgramUniformMatrix3fv", "glProgramUniformMatrix4fv", "glProgramUniformMatrix2x3fv", "glProgramUniformMatrix3x2fv", 
            "glProgramUniformMatrix2x4fv", "glProgramUniformMatrix4x2fv", "glProgramUniformMatrix3x4fv", "glProgramUniformMatrix4x3fv", 
            "glValidateProgramPipeline", "glGetProgramPipelineInfoLog", "glBindImageTexture", "glGetBooleani_v", "glMemoryBarrier", "glMemoryBarrierByRegion", 
            "glTexStorage2DMultisample", "glGetMultisamplefv", "glSampleMaski", "glGetTexLevelParameteriv", "glGetTexLevelParameterfv", "glBindVertexBuffer", 
            "glVertexAttribFormat", "glVertexAttribIFormat", "glVertexAttribBinding", "glVertexBindingDivisor"
        ) || reportMissing("GLES", "GLES31");
    }

    private static boolean check_GLES32(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GLES32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 
            343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357
        },
            "glBlendBarrier", "glCopyImageSubData", "glDebugMessageControl", "glDebugMessageInsert", "glDebugMessageCallback", "glGetDebugMessageLog", 
            "glGetPointerv", "glPushDebugGroup", "glPopDebugGroup", "glObjectLabel", "glGetObjectLabel", "glObjectPtrLabel", "glGetObjectPtrLabel", "glEnablei", 
            "glDisablei", "glBlendEquationi", "glBlendEquationSeparatei", "glBlendFunci", "glBlendFuncSeparatei", "glColorMaski", "glIsEnabledi", 
            "glDrawElementsBaseVertex", "glDrawRangeElementsBaseVertex", "glDrawElementsInstancedBaseVertex", "glFramebufferTexture", "glPrimitiveBoundingBox", 
            "glGetGraphicsResetStatus", "glReadnPixels", "glGetnUniformfv", "glGetnUniformiv", "glGetnUniformuiv", "glMinSampleShading", "glPatchParameteri", 
            "glTexParameterIiv", "glTexParameterIuiv", "glGetTexParameterIiv", "glGetTexParameterIuiv", "glSamplerParameterIiv", "glSamplerParameterIuiv", 
            "glGetSamplerParameterIiv", "glGetSamplerParameterIuiv", "glTexBuffer", "glTexBufferRange", "glTexStorage3DMultisample"
        ) || reportMissing("GLES", "GLES32");
    }

    private static boolean check_AMD_framebuffer_multisample_advanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_framebuffer_multisample_advanced")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            358, 359
        },
            "glRenderbufferStorageMultisampleAdvancedAMD", "glNamedRenderbufferStorageMultisampleAdvancedAMD"
        ) || reportMissing("GLES", "GL_AMD_framebuffer_multisample_advanced");
    }

    private static boolean check_AMD_performance_monitor(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_AMD_performance_monitor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370
        },
            "glGetPerfMonitorGroupsAMD", "glGetPerfMonitorCountersAMD", "glGetPerfMonitorGroupStringAMD", "glGetPerfMonitorCounterStringAMD", 
            "glGetPerfMonitorCounterInfoAMD", "glGenPerfMonitorsAMD", "glDeletePerfMonitorsAMD", "glSelectPerfMonitorCountersAMD", "glBeginPerfMonitorAMD", 
            "glEndPerfMonitorAMD", "glGetPerfMonitorCounterDataAMD"
        ) || reportMissing("GLES", "GL_AMD_performance_monitor");
    }

    private static boolean check_ANGLE_framebuffer_blit(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ANGLE_framebuffer_blit")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            371
        },
            "glBlitFramebufferANGLE"
        ) || reportMissing("GLES", "GL_ANGLE_framebuffer_blit");
    }

    private static boolean check_ANGLE_framebuffer_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ANGLE_framebuffer_multisample")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            372
        },
            "glRenderbufferStorageMultisampleANGLE"
        ) || reportMissing("GLES", "GL_ANGLE_framebuffer_multisample");
    }

    private static boolean check_ANGLE_instanced_arrays(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ANGLE_instanced_arrays")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            373, 374, 375
        },
            "glDrawArraysInstancedANGLE", "glDrawElementsInstancedANGLE", "glVertexAttribDivisorANGLE"
        ) || reportMissing("GLES", "GL_ANGLE_instanced_arrays");
    }

    private static boolean check_ANGLE_translated_shader_source(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ANGLE_translated_shader_source")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            376
        },
            "glGetTranslatedShaderSourceANGLE"
        ) || reportMissing("GLES", "GL_ANGLE_translated_shader_source");
    }

    private static boolean check_APPLE_copy_texture_levels(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_copy_texture_levels")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            377
        },
            "glCopyTextureLevelsAPPLE"
        ) || reportMissing("GLES", "GL_APPLE_copy_texture_levels");
    }

    private static boolean check_APPLE_framebuffer_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_framebuffer_multisample")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            378, 379
        },
            "glRenderbufferStorageMultisampleAPPLE", "glResolveMultisampleFramebufferAPPLE"
        ) || reportMissing("GLES", "GL_APPLE_framebuffer_multisample");
    }

    private static boolean check_APPLE_sync(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_APPLE_sync")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            380, 381, 382, 383, 384, 385, 386
        },
            "glFenceSyncAPPLE", "glIsSyncAPPLE", "glDeleteSyncAPPLE", "glClientWaitSyncAPPLE", "glWaitSyncAPPLE", "glGetInteger64vAPPLE", "glGetSyncivAPPLE"
        ) || reportMissing("GLES", "GL_APPLE_sync");
    }

    private static boolean check_EXT_base_instance(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_base_instance")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            387, 388, 389
        },
            "glDrawArraysInstancedBaseInstanceEXT", "glDrawElementsInstancedBaseInstanceEXT", "glDrawElementsInstancedBaseVertexBaseInstanceEXT"
        ) || reportMissing("GLES", "GL_EXT_base_instance");
    }

    private static boolean check_EXT_blend_func_extended(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_blend_func_extended")) {
            return false;
        }

        int flag0 = ext.contains("GLES30") ? 0 : Integer.MIN_VALUE;
        int flag3 = ext.contains("GLES31") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 390, flag0 + 391, flag0 + 392
        },
            "glBindFragDataLocationIndexedEXT", "glGetFragDataIndexEXT", "glBindFragDataLocationEXT"
        ) || reportMissing("GLES", "GL_EXT_blend_func_extended");
    }

    private static boolean check_EXT_buffer_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_buffer_storage")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            394, flag0 + 395
        },
            "glBufferStorageEXT", "glNamedBufferStorageEXT"
        ) || reportMissing("GLES", "GL_EXT_buffer_storage");
    }

    private static boolean check_EXT_clear_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_clear_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            396, 397
        },
            "glClearTexImageEXT", "glClearTexSubImageEXT"
        ) || reportMissing("GLES", "GL_EXT_clear_texture");
    }

    private static boolean check_EXT_clip_control(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_clip_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            398
        },
            "glClipControlEXT"
        ) || reportMissing("GLES", "GL_EXT_clip_control");
    }

    private static boolean check_EXT_copy_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_copy_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            399
        },
            "glCopyImageSubDataEXT"
        ) || reportMissing("GLES", "GL_EXT_copy_image");
    }

    private static boolean check_EXT_debug_label(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_debug_label")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            400, 401
        },
            "glLabelObjectEXT", "glGetObjectLabelEXT"
        ) || reportMissing("GLES", "GL_EXT_debug_label");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_debug_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            402, 403, 404
        },
            "glInsertEventMarkerEXT", "glPushGroupMarkerEXT", "glPopGroupMarkerEXT"
        ) || reportMissing("GLES", "GL_EXT_debug_marker");
    }

    private static boolean check_EXT_discard_framebuffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_discard_framebuffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            405
        },
            "glDiscardFramebufferEXT"
        ) || reportMissing("GLES", "GL_EXT_discard_framebuffer");
    }

    private static boolean check_EXT_disjoint_timer_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_disjoint_timer_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            406, 407, 408, 409, 410, 411, 412, 413, 415, 416
        },
            "glGenQueriesEXT", "glDeleteQueriesEXT", "glIsQueryEXT", "glBeginQueryEXT", "glEndQueryEXT", "glGetQueryivEXT", "glGetQueryObjectuivEXT", 
            "glQueryCounterEXT", "glGetQueryObjecti64vEXT", "glGetQueryObjectui64vEXT"
        ) || reportMissing("GLES", "GL_EXT_disjoint_timer_query");
    }

    private static boolean check_EXT_draw_buffers(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_buffers")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            418
        },
            "glDrawBuffersEXT"
        ) || reportMissing("GLES", "GL_EXT_draw_buffers");
    }

    private static boolean check_EXT_draw_buffers_indexed(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_buffers_indexed")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            419, 420, 421, 422, 423, 424, 425, 426
        },
            "glEnableiEXT", "glDisableiEXT", "glBlendEquationiEXT", "glBlendEquationSeparateiEXT", "glBlendFunciEXT", "glBlendFuncSeparateiEXT", 
            "glColorMaskiEXT", "glIsEnablediEXT"
        ) || reportMissing("GLES", "GL_EXT_draw_buffers_indexed");
    }

    private static boolean check_EXT_draw_elements_base_vertex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_elements_base_vertex")) {
            return false;
        }

        int flag0 = ext.contains("GLES30") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("GL_EXT_multi_draw_arrays") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            427, flag0 + 428, flag0 + 429, flag2 + 430
        },
            "glDrawElementsBaseVertexEXT", "glDrawRangeElementsBaseVertexEXT", "glDrawElementsInstancedBaseVertexEXT", "glMultiDrawElementsBaseVertexEXT"
        ) || reportMissing("GLES", "GL_EXT_draw_elements_base_vertex");
    }

    private static boolean check_EXT_draw_instanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_instanced")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            431, 432
        },
            "glDrawArraysInstancedEXT", "glDrawElementsInstancedEXT"
        ) || reportMissing("GLES", "GL_EXT_draw_instanced");
    }

    private static boolean check_EXT_draw_transform_feedback(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_draw_transform_feedback")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            433, 434
        },
            "glDrawTransformFeedbackEXT", "glDrawTransformFeedbackInstancedEXT"
        ) || reportMissing("GLES", "GL_EXT_draw_transform_feedback");
    }

    private static boolean check_EXT_EGL_image_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_EGL_image_storage")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            435, flag0 + 436
        },
            "glEGLImageTargetTexStorageEXT", "glEGLImageTargetTextureStorageEXT"
        ) || reportMissing("GLES", "GL_EXT_EGL_image_storage");
    }

    private static boolean check_EXT_external_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_external_buffer")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            437, flag0 + 438
        },
            "glBufferStorageExternalEXT", "glNamedBufferStorageExternalEXT"
        ) || reportMissing("GLES", "GL_EXT_external_buffer");
    }

    private static boolean check_EXT_fragment_shading_rate(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            439, 440, 441, 442
        },
            "glShadingRateEXT", "glShadingRateCombinerOpsEXT", "glFramebufferShadingRateEXT", "glGetFragmentShadingRatesEXT"
        ) || reportMissing("GLES", "GL_EXT_fragment_shading_rate");
    }

    private static boolean check_EXT_framebuffer_blit_layers(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_framebuffer_blit_layers")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            443, 444
        },
            "glBlitFramebufferLayersEXT", "glBlitFramebufferLayerEXT"
        ) || reportMissing("GLES", "GL_EXT_framebuffer_blit_layers");
    }

    private static boolean check_EXT_geometry_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_geometry_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            445
        },
            "glFramebufferTextureEXT"
        ) || reportMissing("GLES", "GL_EXT_geometry_shader");
    }

    private static boolean check_EXT_instanced_arrays(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_instanced_arrays")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            431, 432, 446
        },
            "glDrawArraysInstancedEXT", "glDrawElementsInstancedEXT", "glVertexAttribDivisorEXT"
        ) || reportMissing("GLES", "GL_EXT_instanced_arrays");
    }

    private static boolean check_EXT_map_buffer_range(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_map_buffer_range")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            447, 448
        },
            "glMapBufferRangeEXT", "glFlushMappedBufferRangeEXT"
        ) || reportMissing("GLES", "GL_EXT_map_buffer_range");
    }

    private static boolean check_EXT_memory_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_memory_object")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            449, 450, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, flag0 + 461, flag0 + 462, flag0 + 463, flag0 + 464, flag0 + 465
        },
            "glGetUnsignedBytevEXT", "glGetUnsignedBytei_vEXT", "glDeleteMemoryObjectsEXT", "glIsMemoryObjectEXT", "glCreateMemoryObjectsEXT", 
            "glMemoryObjectParameterivEXT", "glGetMemoryObjectParameterivEXT", "glTexStorageMem2DEXT", "glTexStorageMem2DMultisampleEXT", 
            "glTexStorageMem3DEXT", "glTexStorageMem3DMultisampleEXT", "glBufferStorageMemEXT", "glTextureStorageMem2DEXT", 
            "glTextureStorageMem2DMultisampleEXT", "glTextureStorageMem3DEXT", "glTextureStorageMem3DMultisampleEXT", "glNamedBufferStorageMemEXT"
        ) || reportMissing("GLES", "GL_EXT_memory_object");
    }

    private static boolean check_EXT_memory_object_fd(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_memory_object_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            466
        },
            "glImportMemoryFdEXT"
        ) || reportMissing("GLES", "GL_EXT_memory_object_fd");
    }

    private static boolean check_EXT_memory_object_win32(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_memory_object_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            467, 468
        },
            "glImportMemoryWin32HandleEXT", "glImportMemoryWin32NameEXT"
        ) || reportMissing("GLES", "GL_EXT_memory_object_win32");
    }

    private static boolean check_EXT_multi_draw_arrays(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_multi_draw_arrays")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            469, 470
        },
            "glMultiDrawArraysEXT", "glMultiDrawElementsEXT"
        ) || reportMissing("GLES", "GL_EXT_multi_draw_arrays");
    }

    private static boolean check_EXT_multi_draw_indirect(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_multi_draw_indirect")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            471, 472
        },
            "glMultiDrawArraysIndirectEXT", "glMultiDrawElementsIndirectEXT"
        ) || reportMissing("GLES", "GL_EXT_multi_draw_indirect");
    }

    private static boolean check_EXT_multisampled_render_to_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_multisampled_render_to_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            473, 474
        },
            "glRenderbufferStorageMultisampleEXT", "glFramebufferTexture2DMultisampleEXT"
        ) || reportMissing("GLES", "GL_EXT_multisampled_render_to_texture");
    }

    private static boolean check_EXT_multiview_draw_buffers(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_multiview_draw_buffers")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            475, 476, 477
        },
            "glReadBufferIndexedEXT", "glDrawBuffersIndexedEXT", "glGetIntegeri_vEXT"
        ) || reportMissing("GLES", "GL_EXT_multiview_draw_buffers");
    }

    private static boolean check_EXT_occlusion_query_boolean(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_occlusion_query_boolean")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            406, 407, 408, 409, 410, 411, 412
        },
            "glGenQueriesEXT", "glDeleteQueriesEXT", "glIsQueryEXT", "glBeginQueryEXT", "glEndQueryEXT", "glGetQueryivEXT", "glGetQueryObjectuivEXT"
        ) || reportMissing("GLES", "GL_EXT_occlusion_query_boolean");
    }

    private static boolean check_EXT_polygon_offset_clamp(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_polygon_offset_clamp")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            478
        },
            "glPolygonOffsetClampEXT"
        ) || reportMissing("GLES", "GL_EXT_polygon_offset_clamp");
    }

    private static boolean check_EXT_primitive_bounding_box(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_primitive_bounding_box")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            479
        },
            "glPrimitiveBoundingBoxEXT"
        ) || reportMissing("GLES", "GL_EXT_primitive_bounding_box");
    }

    private static boolean check_EXT_raster_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_raster_multisample")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            480
        },
            "glRasterSamplesEXT"
        ) || reportMissing("GLES", "GL_EXT_raster_multisample");
    }

    private static boolean check_EXT_robustness(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_robustness")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            481, 482, 483, 484
        },
            "glGetGraphicsResetStatusEXT", "glReadnPixelsEXT", "glGetnUniformfvEXT", "glGetnUniformivEXT"
        ) || reportMissing("GLES", "GL_EXT_robustness");
    }

    private static boolean check_EXT_semaphore(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_semaphore")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            449, 450, 485, 486, 487, 488, 489, 490, 491
        },
            "glGetUnsignedBytevEXT", "glGetUnsignedBytei_vEXT", "glGenSemaphoresEXT", "glDeleteSemaphoresEXT", "glIsSemaphoreEXT", 
            "glSemaphoreParameterui64vEXT", "glGetSemaphoreParameterui64vEXT", "glWaitSemaphoreEXT", "glSignalSemaphoreEXT"
        ) || reportMissing("GLES", "GL_EXT_semaphore");
    }

    private static boolean check_EXT_semaphore_fd(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_semaphore_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            492
        },
            "glImportSemaphoreFdEXT"
        ) || reportMissing("GLES", "GL_EXT_semaphore_fd");
    }

    private static boolean check_EXT_semaphore_win32(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_semaphore_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            493, 494
        },
            "glImportSemaphoreWin32HandleEXT", "glImportSemaphoreWin32NameEXT"
        ) || reportMissing("GLES", "GL_EXT_semaphore_win32");
    }

    private static boolean check_EXT_separate_shader_objects(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_separate_shader_objects")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 
            524, 525, 526, 527, 528, 529, 530, 531, 532, 533, 534, 535, 536, 537, 538
        },
            "glActiveShaderProgramEXT", "glBindProgramPipelineEXT", "glCreateShaderProgramvEXT", "glDeleteProgramPipelinesEXT", "glGenProgramPipelinesEXT", 
            "glGetProgramPipelineInfoLogEXT", "glGetProgramPipelineivEXT", "glIsProgramPipelineEXT", "glProgramParameteriEXT", "glProgramUniform1fEXT", 
            "glProgramUniform1fvEXT", "glProgramUniform1iEXT", "glProgramUniform1ivEXT", "glProgramUniform2fEXT", "glProgramUniform2fvEXT", 
            "glProgramUniform2iEXT", "glProgramUniform2ivEXT", "glProgramUniform3fEXT", "glProgramUniform3fvEXT", "glProgramUniform3iEXT", 
            "glProgramUniform3ivEXT", "glProgramUniform4fEXT", "glProgramUniform4fvEXT", "glProgramUniform4iEXT", "glProgramUniform4ivEXT", 
            "glProgramUniformMatrix2fvEXT", "glProgramUniformMatrix3fvEXT", "glProgramUniformMatrix4fvEXT", "glUseProgramStagesEXT", 
            "glValidateProgramPipelineEXT", "glProgramUniform1uiEXT", "glProgramUniform2uiEXT", "glProgramUniform3uiEXT", "glProgramUniform4uiEXT", 
            "glProgramUniform1uivEXT", "glProgramUniform2uivEXT", "glProgramUniform3uivEXT", "glProgramUniform4uivEXT", "glProgramUniformMatrix2x3fvEXT", 
            "glProgramUniformMatrix3x2fvEXT", "glProgramUniformMatrix2x4fvEXT", "glProgramUniformMatrix4x2fvEXT", "glProgramUniformMatrix3x4fvEXT", 
            "glProgramUniformMatrix4x3fvEXT"
        ) || reportMissing("GLES", "GL_EXT_separate_shader_objects");
    }

    private static boolean check_EXT_shader_framebuffer_fetch_non_coherent(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_shader_framebuffer_fetch_non_coherent")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            539
        },
            "glFramebufferFetchBarrierEXT"
        ) || reportMissing("GLES", "GL_EXT_shader_framebuffer_fetch_non_coherent");
    }

    private static boolean check_EXT_shader_pixel_local_storage2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_shader_pixel_local_storage2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            540, 541, 542
        },
            "glFramebufferPixelLocalStorageSizeEXT", "glGetFramebufferPixelLocalStorageSizeEXT", "glClearPixelLocalStorageuiEXT"
        ) || reportMissing("GLES", "GL_EXT_shader_pixel_local_storage2");
    }

    private static boolean check_EXT_sparse_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_sparse_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            543
        },
            "glTexPageCommitmentARB"
        ) || reportMissing("GLES", "GL_EXT_sparse_texture");
    }

    private static boolean check_EXT_tessellation_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_tessellation_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            544
        },
            "glPatchParameteriEXT"
        ) || reportMissing("GLES", "GL_EXT_tessellation_shader");
    }

    private static boolean check_EXT_texture_border_clamp(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_border_clamp")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            545, 546, 547, 548, 549, 550, 551, 552
        },
            "glTexParameterIivEXT", "glTexParameterIuivEXT", "glGetTexParameterIivEXT", "glGetTexParameterIuivEXT", "glSamplerParameterIivEXT", 
            "glSamplerParameterIuivEXT", "glGetSamplerParameterIivEXT", "glGetSamplerParameterIuivEXT"
        ) || reportMissing("GLES", "GL_EXT_texture_border_clamp");
    }

    private static boolean check_EXT_texture_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            553, 554
        },
            "glTexBufferEXT", "glTexBufferRangeEXT"
        ) || reportMissing("GLES", "GL_EXT_texture_buffer");
    }

    private static boolean check_EXT_texture_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_storage")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            555, 556, 557, flag0 + 558, flag0 + 559, flag0 + 560
        },
            "glTexStorage1DEXT", "glTexStorage2DEXT", "glTexStorage3DEXT", "glTextureStorage1DEXT", "glTextureStorage2DEXT", "glTextureStorage3DEXT"
        ) || reportMissing("GLES", "GL_EXT_texture_storage");
    }

    private static boolean check_EXT_texture_storage_compression(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_storage_compression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            561, 562
        },
            "glTexStorageAttribs2DEXT", "glTexStorageAttribs3DEXT"
        ) || reportMissing("GLES", "GL_EXT_texture_storage_compression");
    }

    private static boolean check_EXT_texture_view(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_texture_view")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            563
        },
            "glTextureViewEXT"
        ) || reportMissing("GLES", "GL_EXT_texture_view");
    }

    private static boolean check_EXT_win32_keyed_mutex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_win32_keyed_mutex")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            564, 565
        },
            "glAcquireKeyedMutexWin32EXT", "glReleaseKeyedMutexWin32EXT"
        ) || reportMissing("GLES", "GL_EXT_win32_keyed_mutex");
    }

    private static boolean check_EXT_window_rectangles(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_window_rectangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            566
        },
            "glWindowRectanglesEXT"
        ) || reportMissing("GLES", "GL_EXT_window_rectangles");
    }

    private static boolean check_IMG_framebuffer_downsample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_IMG_framebuffer_downsample")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            567, 568
        },
            "glFramebufferTexture2DDownsampleIMG", "glFramebufferTextureLayerDownsampleIMG"
        ) || reportMissing("GLES", "GL_IMG_framebuffer_downsample");
    }

    private static boolean check_IMG_multisampled_render_to_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_IMG_multisampled_render_to_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            569, 570
        },
            "glRenderbufferStorageMultisampleIMG", "glFramebufferTexture2DMultisampleIMG"
        ) || reportMissing("GLES", "GL_IMG_multisampled_render_to_texture");
    }

    private static boolean check_INTEL_framebuffer_CMAA(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_INTEL_framebuffer_CMAA")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            571
        },
            "glApplyFramebufferAttachmentCMAAINTEL"
        ) || reportMissing("GLES", "GL_INTEL_framebuffer_CMAA");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_INTEL_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            572, 573, 574, 575, 576, 577, 578, 579, 580, 581
        },
            "glBeginPerfQueryINTEL", "glCreatePerfQueryINTEL", "glDeletePerfQueryINTEL", "glEndPerfQueryINTEL", "glGetFirstPerfQueryIdINTEL", 
            "glGetNextPerfQueryIdINTEL", "glGetPerfCounterInfoINTEL", "glGetPerfQueryDataINTEL", "glGetPerfQueryIdByNameINTEL", "glGetPerfQueryInfoINTEL"
        ) || reportMissing("GLES", "GL_INTEL_performance_query");
    }

    private static boolean check_KHR_blend_equation_advanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_blend_equation_advanced")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            582
        },
            "glBlendBarrierKHR"
        ) || reportMissing("GLES", "GL_KHR_blend_equation_advanced");
    }

    private static boolean check_KHR_debug(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_debug")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            583, 584, 585, 586, 587, 588, 589, 590, 591, 592, 593
        },
            "glDebugMessageControlKHR", "glDebugMessageInsertKHR", "glDebugMessageCallbackKHR", "glGetDebugMessageLogKHR", "glGetPointervKHR", 
            "glPushDebugGroupKHR", "glPopDebugGroupKHR", "glObjectLabelKHR", "glGetObjectLabelKHR", "glObjectPtrLabelKHR", "glGetObjectPtrLabelKHR"
        ) || reportMissing("GLES", "GL_KHR_debug");
    }

    private static boolean check_KHR_parallel_shader_compile(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_parallel_shader_compile")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            594
        },
            "glMaxShaderCompilerThreadsKHR"
        ) || reportMissing("GLES", "GL_KHR_parallel_shader_compile");
    }

    private static boolean check_KHR_robustness(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_KHR_robustness")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            595, 596, 597, 598, 599
        },
            "glGetGraphicsResetStatusKHR", "glReadnPixelsKHR", "glGetnUniformfvKHR", "glGetnUniformivKHR", "glGetnUniformuivKHR"
        ) || reportMissing("GLES", "GL_KHR_robustness");
    }

    private static boolean check_MESA_framebuffer_flip_y(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_MESA_framebuffer_flip_y")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            600, 601
        },
            "glFramebufferParameteriMESA", "glGetFramebufferParameterivMESA"
        ) || reportMissing("GLES", "GL_MESA_framebuffer_flip_y");
    }

    private static boolean check_NV_alpha_to_coverage_dither_control(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_alpha_to_coverage_dither_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            602
        },
            "glAlphaToCoverageDitherControlNV"
        ) || reportMissing("GLES", "GL_NV_alpha_to_coverage_dither_control");
    }

    private static boolean check_NV_bindless_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_bindless_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615
        },
            "glGetTextureHandleNV", "glGetTextureSamplerHandleNV", "glMakeTextureHandleResidentNV", "glMakeTextureHandleNonResidentNV", "glGetImageHandleNV", 
            "glMakeImageHandleResidentNV", "glMakeImageHandleNonResidentNV", "glUniformHandleui64NV", "glUniformHandleui64vNV", "glProgramUniformHandleui64NV", 
            "glProgramUniformHandleui64vNV", "glIsTextureHandleResidentNV", "glIsImageHandleResidentNV"
        ) || reportMissing("GLES", "GL_NV_bindless_texture");
    }

    private static boolean check_NV_blend_equation_advanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_blend_equation_advanced")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            616, 617
        },
            "glBlendParameteriNV", "glBlendBarrierNV"
        ) || reportMissing("GLES", "GL_NV_blend_equation_advanced");
    }

    private static boolean check_NV_clip_space_w_scaling(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_clip_space_w_scaling")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            618
        },
            "glViewportPositionWScaleNV"
        ) || reportMissing("GLES", "GL_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_conditional_render(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conditional_render")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            619, 620
        },
            "glBeginConditionalRenderNV", "glEndConditionalRenderNV"
        ) || reportMissing("GLES", "GL_NV_conditional_render");
    }

    private static boolean check_NV_conservative_raster(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conservative_raster")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            621
        },
            "glSubpixelPrecisionBiasNV"
        ) || reportMissing("GLES", "GL_NV_conservative_raster");
    }

    private static boolean check_NV_conservative_raster_pre_snap_triangles(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_conservative_raster_pre_snap_triangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            622
        },
            "glConservativeRasterParameteriNV"
        ) || reportMissing("GLES", "GL_NV_conservative_raster_pre_snap_triangles");
    }

    private static boolean check_NV_copy_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_copy_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            623
        },
            "glCopyBufferSubDataNV"
        ) || reportMissing("GLES", "GL_NV_copy_buffer");
    }

    private static boolean check_NV_coverage_sample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_coverage_sample")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            624, 625
        },
            "glCoverageMaskNV", "glCoverageOperationNV"
        ) || reportMissing("GLES", "GL_NV_coverage_sample");
    }

    private static boolean check_NV_draw_buffers(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_draw_buffers")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            626
        },
            "glDrawBuffersNV"
        ) || reportMissing("GLES", "GL_NV_draw_buffers");
    }

    private static boolean check_NV_draw_instanced(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_draw_instanced")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            627, 628
        },
            "glDrawArraysInstancedNV", "glDrawElementsInstancedNV"
        ) || reportMissing("GLES", "GL_NV_draw_instanced");
    }

    private static boolean check_NV_draw_vulkan_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_draw_vulkan_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            629, 630, 631, 632, 633
        },
            "glDrawVkImageNV", "glGetVkProcAddrNV", "glWaitVkSemaphoreNV", "glSignalVkSemaphoreNV", "glSignalVkFenceNV"
        ) || reportMissing("GLES", "GL_NV_draw_vulkan_image");
    }

    private static boolean check_NV_fence(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_fence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            634, 635, 636, 637, 638, 639, 640
        },
            "glDeleteFencesNV", "glGenFencesNV", "glIsFenceNV", "glTestFenceNV", "glGetFenceivNV", "glFinishFenceNV", "glSetFenceNV"
        ) || reportMissing("GLES", "GL_NV_fence");
    }

    private static boolean check_NV_fragment_coverage_to_color(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_fragment_coverage_to_color")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            641
        },
            "glFragmentCoverageColorNV"
        ) || reportMissing("GLES", "GL_NV_fragment_coverage_to_color");
    }

    private static boolean check_NV_framebuffer_blit(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_framebuffer_blit")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            642
        },
            "glBlitFramebufferNV"
        ) || reportMissing("GLES", "GL_NV_framebuffer_blit");
    }

    private static boolean check_NV_framebuffer_mixed_samples(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_framebuffer_mixed_samples")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            480, 643, 644, 645
        },
            "glRasterSamplesEXT", "glCoverageModulationTableNV", "glGetCoverageModulationTableNV", "glCoverageModulationNV"
        ) || reportMissing("GLES", "GL_NV_framebuffer_mixed_samples");
    }

    private static boolean check_NV_framebuffer_multisample(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_framebuffer_multisample")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            646
        },
            "glRenderbufferStorageMultisampleNV"
        ) || reportMissing("GLES", "GL_NV_framebuffer_multisample");
    }

    private static boolean check_NV_gpu_shader5(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_gpu_shader5")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 
            676, 677, 678, 679, 680
        },
            "glUniform1i64NV", "glUniform2i64NV", "glUniform3i64NV", "glUniform4i64NV", "glUniform1i64vNV", "glUniform2i64vNV", "glUniform3i64vNV", 
            "glUniform4i64vNV", "glUniform1ui64NV", "glUniform2ui64NV", "glUniform3ui64NV", "glUniform4ui64NV", "glUniform1ui64vNV", "glUniform2ui64vNV", 
            "glUniform3ui64vNV", "glUniform4ui64vNV", "glGetUniformi64vNV", "glGetUniformui64vNV", "glProgramUniform1i64NV", "glProgramUniform2i64NV", 
            "glProgramUniform3i64NV", "glProgramUniform4i64NV", "glProgramUniform1i64vNV", "glProgramUniform2i64vNV", "glProgramUniform3i64vNV", 
            "glProgramUniform4i64vNV", "glProgramUniform1ui64NV", "glProgramUniform2ui64NV", "glProgramUniform3ui64NV", "glProgramUniform4ui64NV", 
            "glProgramUniform1ui64vNV", "glProgramUniform2ui64vNV", "glProgramUniform3ui64vNV", "glProgramUniform4ui64vNV"
        ) || reportMissing("GLES", "GL_NV_gpu_shader5");
    }

    private static boolean check_NV_instanced_arrays(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_instanced_arrays")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            681
        },
            "glVertexAttribDivisorNV"
        ) || reportMissing("GLES", "GL_NV_instanced_arrays");
    }

    private static boolean check_NV_internalformat_sample_query(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_internalformat_sample_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            682
        },
            "glGetInternalformatSampleivNV"
        ) || reportMissing("GLES", "GL_NV_internalformat_sample_query");
    }

    private static boolean check_NV_memory_attachment(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_memory_attachment")) {
            return false;
        }

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            683, 684, 685, 686, flag0 + 687, flag0 + 688
        },
            "glGetMemoryObjectDetachedResourcesuivNV", "glResetMemoryObjectParameterNV", "glTexAttachMemoryNV", "glBufferAttachMemoryNV", 
            "glTextureAttachMemoryNV", "glNamedBufferAttachMemoryNV"
        ) || reportMissing("GLES", "GL_NV_memory_attachment");
    }

    private static boolean check_NV_memory_object_sparse(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_memory_object_sparse")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            689, 690, 691, 692
        },
            "glBufferPageCommitmentMemNV", "glNamedBufferPageCommitmentMemNV", "glTexPageCommitmentMemNV", "glTexturePageCommitmentMemNV"
        ) || reportMissing("GLES", "GL_NV_memory_object_sparse");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_mesh_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            693, 694, 695
        },
            "glDrawMeshTasksNV", "glDrawMeshTasksIndirectNV", "glMultiDrawMeshTasksIndirectNV"
        ) || reportMissing("GLES", "GL_NV_mesh_shader");
    }

    private static boolean check_NV_non_square_matrices(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_non_square_matrices")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            696, 697, 698, 699, 700, 701
        },
            "glUniformMatrix2x3fvNV", "glUniformMatrix3x2fvNV", "glUniformMatrix2x4fvNV", "glUniformMatrix4x2fvNV", "glUniformMatrix3x4fvNV", 
            "glUniformMatrix4x3fvNV"
        ) || reportMissing("GLES", "GL_NV_non_square_matrices");
    }

    private static boolean check_NV_path_rendering(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_path_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            702, 703, 704, 705, 706, 707, 708, 711, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 
            740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751
        },
            "glPathCommandsNV", "glPathCoordsNV", "glPathSubCommandsNV", "glPathSubCoordsNV", "glPathStringNV", "glPathGlyphsNV", "glPathGlyphRangeNV", 
            "glCopyPathNV", "glInterpolatePathsNV", "glTransformPathNV", "glPathParameterivNV", "glPathParameteriNV", "glPathParameterfvNV", 
            "glPathParameterfNV", "glPathDashArrayNV", "glGenPathsNV", "glDeletePathsNV", "glIsPathNV", "glPathStencilFuncNV", "glPathStencilDepthOffsetNV", 
            "glStencilFillPathNV", "glStencilStrokePathNV", "glStencilFillPathInstancedNV", "glStencilStrokePathInstancedNV", "glPathCoverDepthFuncNV", 
            "glCoverFillPathNV", "glCoverStrokePathNV", "glCoverFillPathInstancedNV", "glCoverStrokePathInstancedNV", "glGetPathParameterivNV", 
            "glGetPathParameterfvNV", "glGetPathCommandsNV", "glGetPathCoordsNV", "glGetPathDashArrayNV", "glGetPathMetricsNV", "glGetPathMetricRangeNV", 
            "glGetPathSpacingNV", "glIsPointInFillPathNV", "glIsPointInStrokePathNV", "glGetPathLengthNV", "glPointAlongPathNV"
        ) || reportMissing("GLES", "GL_NV_path_rendering");
    }

    private static boolean check_NV_polygon_mode(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_polygon_mode")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            759
        },
            "glPolygonModeNV"
        ) || reportMissing("GLES", "GL_NV_polygon_mode");
    }

    private static boolean check_NV_read_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_read_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            760
        },
            "glReadBufferNV"
        ) || reportMissing("GLES", "GL_NV_read_buffer");
    }

    private static boolean check_NV_sample_locations(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            761, 762, 763
        },
            "glFramebufferSampleLocationsfvNV", "glNamedFramebufferSampleLocationsfvNV", "glResolveDepthValuesNV"
        ) || reportMissing("GLES", "GL_NV_sample_locations");
    }

    private static boolean check_NV_scissor_exclusive(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_scissor_exclusive")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            764, 765
        },
            "glScissorExclusiveArrayvNV", "glScissorExclusiveNV"
        ) || reportMissing("GLES", "GL_NV_scissor_exclusive");
    }

    private static boolean check_NV_texture_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_texture_array")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            766, 767, 768, 769, 770, 771
        },
            "glTexImage3DNV", "glTexSubImage3DNV", "glCopyTexSubImage3DNV", "glCompressedTexImage3DNV", "glCompressedTexSubImage3DNV", 
            "glFramebufferTextureLayerNV"
        ) || reportMissing("GLES", "GL_NV_texture_array");
    }

    private static boolean check_NV_texture_barrier(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_texture_barrier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            772
        },
            "glTextureBarrierNV"
        ) || reportMissing("GLES", "GL_NV_texture_barrier");
    }

    private static boolean check_NV_timeline_semaphore(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_timeline_semaphore")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            773, 774, 775
        },
            "glCreateSemaphoresNV", "glSemaphoreParameterivNV", "glGetSemaphoreParameterivNV"
        ) || reportMissing("GLES", "GL_NV_timeline_semaphore");
    }

    private static boolean check_NV_viewport_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_viewport_array")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787
        },
            "glViewportArrayvNV", "glViewportIndexedfNV", "glViewportIndexedfvNV", "glScissorArrayvNV", "glScissorIndexedNV", "glScissorIndexedvNV", 
            "glDepthRangeArrayfvNV", "glDepthRangeIndexedfNV", "glGetFloati_vNV", "glEnableiNV", "glDisableiNV", "glIsEnablediNV"
        ) || reportMissing("GLES", "GL_NV_viewport_array");
    }

    private static boolean check_NV_viewport_swizzle(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_NV_viewport_swizzle")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            788
        },
            "glViewportSwizzleNV"
        ) || reportMissing("GLES", "GL_NV_viewport_swizzle");
    }

    private static boolean check_OES_copy_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_copy_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            789
        },
            "glCopyImageSubDataOES"
        ) || reportMissing("GLES", "GL_OES_copy_image");
    }

    private static boolean check_OES_draw_buffers_indexed(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_draw_buffers_indexed")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            790, 791, 792, 793, 794, 795, 796, 797
        },
            "glEnableiOES", "glDisableiOES", "glBlendEquationiOES", "glBlendEquationSeparateiOES", "glBlendFunciOES", "glBlendFuncSeparateiOES", 
            "glColorMaskiOES", "glIsEnablediOES"
        ) || reportMissing("GLES", "GL_OES_draw_buffers_indexed");
    }

    private static boolean check_OES_draw_elements_base_vertex(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_draw_elements_base_vertex")) {
            return false;
        }

        int flag0 = ext.contains("GLES30") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("EXT_multi_draw_arrays") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            798, flag0 + 799, flag0 + 800, flag2 + 801
        },
            "glDrawElementsBaseVertexOES", "glDrawRangeElementsBaseVertexOES", "glDrawElementsInstancedBaseVertexOES", "glMultiDrawElementsBaseVertexOES"
        ) || reportMissing("GLES", "GL_OES_draw_elements_base_vertex");
    }

    private static boolean check_OES_EGL_image(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_EGL_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            802, 803
        },
            "glEGLImageTargetTexture2DOES", "glEGLImageTargetRenderbufferStorageOES"
        ) || reportMissing("GLES", "GL_OES_EGL_image");
    }

    private static boolean check_OES_geometry_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_geometry_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            804
        },
            "glFramebufferTextureOES"
        ) || reportMissing("GLES", "GL_OES_geometry_shader");
    }

    private static boolean check_OES_get_program_binary(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_get_program_binary")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            805, 806
        },
            "glGetProgramBinaryOES", "glProgramBinaryOES"
        ) || reportMissing("GLES", "GL_OES_get_program_binary");
    }

    private static boolean check_OES_mapbuffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_mapbuffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            807, 808, 809
        },
            "glMapBufferOES", "glUnmapBufferOES", "glGetBufferPointervOES"
        ) || reportMissing("GLES", "GL_OES_mapbuffer");
    }

    private static boolean check_OES_primitive_bounding_box(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_primitive_bounding_box")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            810
        },
            "glPrimitiveBoundingBoxOES"
        ) || reportMissing("GLES", "GL_OES_primitive_bounding_box");
    }

    private static boolean check_OES_sample_shading(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_sample_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            811
        },
            "glMinSampleShadingOES"
        ) || reportMissing("GLES", "GL_OES_sample_shading");
    }

    private static boolean check_OES_tessellation_shader(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_tessellation_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            812
        },
            "glPatchParameteriOES"
        ) || reportMissing("GLES", "GL_OES_tessellation_shader");
    }

    private static boolean check_OES_texture_3D(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_texture_3D")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            813, 814, 815, 816, 817, 818
        },
            "glTexImage3DOES", "glTexSubImage3DOES", "glCopyTexSubImage3DOES", "glCompressedTexImage3DOES", "glCompressedTexSubImage3DOES", 
            "glFramebufferTexture3DOES"
        ) || reportMissing("GLES", "GL_OES_texture_3D");
    }

    private static boolean check_OES_texture_border_clamp(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_texture_border_clamp")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            819, 820, 821, 822, 823, 824, 825, 826
        },
            "glTexParameterIivOES", "glTexParameterIuivOES", "glGetTexParameterIivOES", "glGetTexParameterIuivOES", "glSamplerParameterIivOES", 
            "glSamplerParameterIuivOES", "glGetSamplerParameterIivOES", "glGetSamplerParameterIuivOES"
        ) || reportMissing("GLES", "GL_OES_texture_border_clamp");
    }

    private static boolean check_OES_texture_buffer(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_texture_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            827, 828
        },
            "glTexBufferOES", "glTexBufferRangeOES"
        ) || reportMissing("GLES", "GL_OES_texture_buffer");
    }

    private static boolean check_OES_texture_storage_multisample_2d_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_texture_storage_multisample_2d_array")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            829
        },
            "glTexStorage3DMultisampleOES"
        ) || reportMissing("GLES", "GL_OES_texture_storage_multisample_2d_array");
    }

    private static boolean check_OES_texture_view(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_texture_view")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            830
        },
            "glTextureViewOES"
        ) || reportMissing("GLES", "GL_OES_texture_view");
    }

    private static boolean check_OES_vertex_array_object(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_vertex_array_object")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            831, 832, 833, 834
        },
            "glBindVertexArrayOES", "glDeleteVertexArraysOES", "glGenVertexArraysOES", "glIsVertexArrayOES"
        ) || reportMissing("GLES", "GL_OES_vertex_array_object");
    }

    private static boolean check_OES_viewport_array(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OES_viewport_array")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            835, 836, 837, 838, 839, 840, 841, 842, 843, 790, 791, 797
        },
            "glViewportArrayvOES", "glViewportIndexedfOES", "glViewportIndexedfvOES", "glScissorArrayvOES", "glScissorIndexedOES", "glScissorIndexedvOES", 
            "glDepthRangeArrayfvOES", "glDepthRangeIndexedfOES", "glGetFloati_vOES", "glEnableiOES", "glDisableiOES", "glIsEnablediOES"
        ) || reportMissing("GLES", "GL_OES_viewport_array");
    }

    private static boolean check_OVR_multiview(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OVR_multiview")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            844
        },
            "glFramebufferTextureMultiviewOVR"
        ) || reportMissing("GLES", "GL_OVR_multiview");
    }

    private static boolean check_OVR_multiview_multisampled_render_to_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OVR_multiview_multisampled_render_to_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            845
        },
            "glFramebufferTextureMultisampleMultiviewOVR"
        ) || reportMissing("GLES", "GL_OVR_multiview_multisampled_render_to_texture");
    }

    private static boolean check_QCOM_alpha_test(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_alpha_test")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            846
        },
            "glAlphaFuncQCOM"
        ) || reportMissing("GLES", "GL_QCOM_alpha_test");
    }

    private static boolean check_QCOM_driver_control(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_driver_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            847, 848, 849, 850
        },
            "glGetDriverControlsQCOM", "glGetDriverControlStringQCOM", "glEnableDriverControlQCOM", "glDisableDriverControlQCOM"
        ) || reportMissing("GLES", "GL_QCOM_driver_control");
    }

    private static boolean check_QCOM_extended_get(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_extended_get")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            851, 852, 853, 854, 855, 856, 857, 858
        },
            "glExtGetTexturesQCOM", "glExtGetBuffersQCOM", "glExtGetRenderbuffersQCOM", "glExtGetFramebuffersQCOM", "glExtGetTexLevelParameterivQCOM", 
            "glExtTexObjectStateOverrideiQCOM", "glExtGetTexSubImageQCOM", "glExtGetBufferPointervQCOM"
        ) || reportMissing("GLES", "GL_QCOM_extended_get");
    }

    private static boolean check_QCOM_extended_get2(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_extended_get2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            859, 860, 861, 862
        },
            "glExtGetShadersQCOM", "glExtGetProgramsQCOM", "glExtIsProgramBinaryQCOM", "glExtGetProgramBinarySourceQCOM"
        ) || reportMissing("GLES", "GL_QCOM_extended_get2");
    }

    private static boolean check_QCOM_frame_extrapolation(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_frame_extrapolation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            863
        },
            "glExtrapolateTex2DQCOM"
        ) || reportMissing("GLES", "GL_QCOM_frame_extrapolation");
    }

    private static boolean check_QCOM_framebuffer_foveated(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_framebuffer_foveated")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            864, 865
        },
            "glFramebufferFoveationConfigQCOM", "glFramebufferFoveationParametersQCOM"
        ) || reportMissing("GLES", "GL_QCOM_framebuffer_foveated");
    }

    private static boolean check_QCOM_motion_estimation(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_motion_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            866, 867
        },
            "glTexEstimateMotionQCOM", "glTexEstimateMotionRegionsQCOM"
        ) || reportMissing("GLES", "GL_QCOM_motion_estimation");
    }

    private static boolean check_QCOM_shader_framebuffer_fetch_noncoherent(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_shader_framebuffer_fetch_noncoherent")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            868
        },
            "glFramebufferFetchBarrierQCOM"
        ) || reportMissing("GLES", "GL_QCOM_shader_framebuffer_fetch_noncoherent");
    }

    private static boolean check_QCOM_texture_foveated(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_texture_foveated")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            869
        },
            "glTextureFoveationParametersQCOM"
        ) || reportMissing("GLES", "GL_QCOM_texture_foveated");
    }

    private static boolean check_QCOM_tiled_rendering(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_tiled_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            870, 871
        },
            "glStartTilingQCOM", "glEndTilingQCOM"
        ) || reportMissing("GLES", "GL_QCOM_tiled_rendering");
    }

    private static boolean hasDSA(Set<String> ext) {
        return ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

}
