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

public final class GLESCapabilities {

    static final int ADDRESS_BUFFER_SIZE = 873;

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

    // ARM_shader_core_properties
    public final long
        glMaxActiveShaderCoresARM;

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
        glBufferStorageEXT;

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
        glTexPageCommitmentEXT;

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
        glFramebufferTextureMultiviewOVR,
        glNamedFramebufferTextureMultiviewOVR;

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

    /** When true, {@code GLES20} is supported. */
    public final boolean GLES20;
    /** When true, {@code GLES30} is supported. */
    public final boolean GLES30;
    /** When true, {@code GLES31} is supported. */
    public final boolean GLES31;
    /** When true, {@code GLES32} is supported. */
    public final boolean GLES32;
    /** When true, {@code AMD_compressed_3DC_texture} is supported. */
    public final boolean GL_AMD_compressed_3DC_texture;
    /** When true, {@code AMD_compressed_ATC_texture} is supported. */
    public final boolean GL_AMD_compressed_ATC_texture;
    /** When true, {@code AMD_framebuffer_multisample_advanced} is supported. */
    public final boolean GL_AMD_framebuffer_multisample_advanced;
    /** When true, {@code AMD_performance_monitor} is supported. */
    public final boolean GL_AMD_performance_monitor;
    /** When true, {@code AMD_program_binary_Z400} is supported. */
    public final boolean GL_AMD_program_binary_Z400;
    /** When true, {@code ANDROID_extension_pack_es31a} is supported. */
    public final boolean GL_ANDROID_extension_pack_es31a;
    /** When true, {@code ANGLE_depth_texture} is supported. */
    public final boolean GL_ANGLE_depth_texture;
    /** When true, {@code ANGLE_framebuffer_blit} is supported. */
    public final boolean GL_ANGLE_framebuffer_blit;
    /** When true, {@code ANGLE_framebuffer_multisample} is supported. */
    public final boolean GL_ANGLE_framebuffer_multisample;
    /** When true, {@code ANGLE_instanced_arrays} is supported. */
    public final boolean GL_ANGLE_instanced_arrays;
    /** When true, {@code ANGLE_pack_reverse_row_order} is supported. */
    public final boolean GL_ANGLE_pack_reverse_row_order;
    /** When true, {@code ANGLE_program_binary} is supported. */
    public final boolean GL_ANGLE_program_binary;
    /** When true, {@code ANGLE_texture_compression_dxt1} is supported. */
    public final boolean GL_ANGLE_texture_compression_dxt1;
    /** When true, {@code ANGLE_texture_compression_dxt3} is supported. */
    public final boolean GL_ANGLE_texture_compression_dxt3;
    /** When true, {@code ANGLE_texture_compression_dxt5} is supported. */
    public final boolean GL_ANGLE_texture_compression_dxt5;
    /** When true, {@code ANGLE_texture_usage} is supported. */
    public final boolean GL_ANGLE_texture_usage;
    /** When true, {@code ANGLE_translated_shader_source} is supported. */
    public final boolean GL_ANGLE_translated_shader_source;
    /** When true, {@code APPLE_clip_distance} is supported. */
    public final boolean GL_APPLE_clip_distance;
    /** When true, {@code APPLE_color_buffer_packed_float} is supported. */
    public final boolean GL_APPLE_color_buffer_packed_float;
    /** When true, {@code APPLE_copy_texture_levels} is supported. */
    public final boolean GL_APPLE_copy_texture_levels;
    /** When true, {@code APPLE_framebuffer_multisample} is supported. */
    public final boolean GL_APPLE_framebuffer_multisample;
    /** When true, {@code APPLE_rgb_422} is supported. */
    public final boolean GL_APPLE_rgb_422;
    /** When true, {@code APPLE_sync} is supported. */
    public final boolean GL_APPLE_sync;
    /** When true, {@code APPLE_texture_format_BGRA8888} is supported. */
    public final boolean GL_APPLE_texture_format_BGRA8888;
    /** When true, {@code APPLE_texture_max_level} is supported. */
    public final boolean GL_APPLE_texture_max_level;
    /** When true, {@code APPLE_texture_packed_float} is supported. */
    public final boolean GL_APPLE_texture_packed_float;
    /** When true, {@code ARM_mali_program_binary} is supported. */
    public final boolean GL_ARM_mali_program_binary;
    /** When true, {@code ARM_mali_shader_binary} is supported. */
    public final boolean GL_ARM_mali_shader_binary;
    /** When true, {@code ARM_rgba8} is supported. */
    public final boolean GL_ARM_rgba8;
    /** When true, {@code ARM_shader_core_properties} is supported. */
    public final boolean GL_ARM_shader_core_properties;
    /** When true, {@code ARM_shader_framebuffer_fetch} is supported. */
    public final boolean GL_ARM_shader_framebuffer_fetch;
    /** When true, {@code ARM_shader_framebuffer_fetch_depth_stencil} is supported. */
    public final boolean GL_ARM_shader_framebuffer_fetch_depth_stencil;
    /** When true, {@code ARM_texture_unnormalized_coordinates} is supported. */
    public final boolean GL_ARM_texture_unnormalized_coordinates;
    /** When true, {@code DMP_program_binary} is supported. */
    public final boolean GL_DMP_program_binary;
    /** When true, {@code DMP_shader_binary} is supported. */
    public final boolean GL_DMP_shader_binary;
    /** When true, {@code EXT_base_instance} is supported. */
    public final boolean GL_EXT_base_instance;
    /** When true, {@code EXT_blend_func_extended} is supported. */
    public final boolean GL_EXT_blend_func_extended;
    /** When true, {@code EXT_blend_minmax} is supported. */
    public final boolean GL_EXT_blend_minmax;
    /** When true, {@code EXT_buffer_storage} is supported. */
    public final boolean GL_EXT_buffer_storage;
    /** When true, {@code EXT_clear_texture} is supported. */
    public final boolean GL_EXT_clear_texture;
    /** When true, {@code EXT_clip_control} is supported. */
    public final boolean GL_EXT_clip_control;
    /** When true, {@code EXT_clip_cull_distance} is supported. */
    public final boolean GL_EXT_clip_cull_distance;
    /** When true, {@code EXT_color_buffer_float} is supported. */
    public final boolean GL_EXT_color_buffer_float;
    /** When true, {@code EXT_color_buffer_half_float} is supported. */
    public final boolean GL_EXT_color_buffer_half_float;
    /** When true, {@code EXT_compressed_ETC1_RGB8_sub_texture} is supported. */
    public final boolean GL_EXT_compressed_ETC1_RGB8_sub_texture;
    /** When true, {@code EXT_conservative_depth} is supported. */
    public final boolean GL_EXT_conservative_depth;
    /** When true, {@code EXT_copy_image} is supported. */
    public final boolean GL_EXT_copy_image;
    /** When true, {@code EXT_debug_label} is supported. */
    public final boolean GL_EXT_debug_label;
    /** When true, {@code EXT_debug_marker} is supported. */
    public final boolean GL_EXT_debug_marker;
    /** When true, {@code EXT_depth_clamp} is supported. */
    public final boolean GL_EXT_depth_clamp;
    /** When true, {@code EXT_discard_framebuffer} is supported. */
    public final boolean GL_EXT_discard_framebuffer;
    /** When true, {@code EXT_disjoint_timer_query} is supported. */
    public final boolean GL_EXT_disjoint_timer_query;
    /** When true, {@code EXT_draw_buffers} is supported. */
    public final boolean GL_EXT_draw_buffers;
    /** When true, {@code EXT_draw_buffers_indexed} is supported. */
    public final boolean GL_EXT_draw_buffers_indexed;
    /** When true, {@code EXT_draw_elements_base_vertex} is supported. */
    public final boolean GL_EXT_draw_elements_base_vertex;
    /** When true, {@code EXT_draw_instanced} is supported. */
    public final boolean GL_EXT_draw_instanced;
    /** When true, {@code EXT_draw_transform_feedback} is supported. */
    public final boolean GL_EXT_draw_transform_feedback;
    /** When true, {@code EXT_EGL_image_array} is supported. */
    public final boolean GL_EXT_EGL_image_array;
    /** When true, {@code EXT_EGL_image_external_wrap_modes} is supported. */
    public final boolean GL_EXT_EGL_image_external_wrap_modes;
    /** When true, {@code EXT_EGL_image_storage} is supported. */
    public final boolean GL_EXT_EGL_image_storage;
    /** When true, {@code EXT_EGL_image_storage_compression} is supported. */
    public final boolean GL_EXT_EGL_image_storage_compression;
    /** When true, {@code EXT_external_buffer} is supported. */
    public final boolean GL_EXT_external_buffer;
    /** When true, {@code EXT_float_blend} is supported. */
    public final boolean GL_EXT_float_blend;
    /** When true, {@code EXT_fragment_shading_rate} is supported. */
    public final boolean GL_EXT_fragment_shading_rate;
    /** When true, {@code EXT_fragment_shading_rate_attachment} is supported. */
    public final boolean GL_EXT_fragment_shading_rate_attachment;
    /** When true, {@code EXT_fragment_shading_rate_primitive} is supported. */
    public final boolean GL_EXT_fragment_shading_rate_primitive;
    /** When true, {@code EXT_framebuffer_blit_layers} is supported. */
    public final boolean GL_EXT_framebuffer_blit_layers;
    /** When true, {@code EXT_geometry_point_size} is supported. */
    public final boolean GL_EXT_geometry_point_size;
    /** When true, {@code EXT_geometry_shader} is supported. */
    public final boolean GL_EXT_geometry_shader;
    /** When true, {@code EXT_gpu_shader5} is supported. */
    public final boolean GL_EXT_gpu_shader5;
    /** When true, {@code EXT_instanced_arrays} is supported. */
    public final boolean GL_EXT_instanced_arrays;
    /** When true, {@code EXT_map_buffer_range} is supported. */
    public final boolean GL_EXT_map_buffer_range;
    /** When true, {@code EXT_memory_object} is supported. */
    public final boolean GL_EXT_memory_object;
    /** When true, {@code EXT_memory_object_fd} is supported. */
    public final boolean GL_EXT_memory_object_fd;
    /** When true, {@code EXT_memory_object_win32} is supported. */
    public final boolean GL_EXT_memory_object_win32;
    /** When true, {@code EXT_multi_draw_arrays} is supported. */
    public final boolean GL_EXT_multi_draw_arrays;
    /** When true, {@code EXT_multi_draw_indirect} is supported. */
    public final boolean GL_EXT_multi_draw_indirect;
    /** When true, {@code EXT_multisample_compatibility} is supported. */
    public final boolean GL_EXT_multisample_compatibility;
    /** When true, {@code EXT_multisampled_render_to_texture} is supported. */
    public final boolean GL_EXT_multisampled_render_to_texture;
    /** When true, {@code EXT_multisampled_render_to_texture2} is supported. */
    public final boolean GL_EXT_multisampled_render_to_texture2;
    /** When true, {@code EXT_multiview_draw_buffers} is supported. */
    public final boolean GL_EXT_multiview_draw_buffers;
    /** When true, {@code EXT_multiview_tessellation_geometry_shader} is supported. */
    public final boolean GL_EXT_multiview_tessellation_geometry_shader;
    /** When true, {@code EXT_multiview_texture_multisample} is supported. */
    public final boolean GL_EXT_multiview_texture_multisample;
    /** When true, {@code EXT_multiview_timer_query} is supported. */
    public final boolean GL_EXT_multiview_timer_query;
    /** When true, {@code EXT_occlusion_query_boolean} is supported. */
    public final boolean GL_EXT_occlusion_query_boolean;
    /** When true, {@code EXT_polygon_offset_clamp} is supported. */
    public final boolean GL_EXT_polygon_offset_clamp;
    /** When true, {@code EXT_post_depth_coverage} is supported. */
    public final boolean GL_EXT_post_depth_coverage;
    /** When true, {@code EXT_primitive_bounding_box} is supported. */
    public final boolean GL_EXT_primitive_bounding_box;
    /** When true, {@code EXT_protected_textures} is supported. */
    public final boolean GL_EXT_protected_textures;
    /** When true, {@code EXT_pvrtc_sRGB} is supported. */
    public final boolean GL_EXT_pvrtc_sRGB;
    /** When true, {@code EXT_raster_multisample} is supported. */
    public final boolean GL_EXT_raster_multisample;
    /** When true, {@code EXT_read_format_bgra} is supported. */
    public final boolean GL_EXT_read_format_bgra;
    /** When true, {@code EXT_render_snorm} is supported. */
    public final boolean GL_EXT_render_snorm;
    /** When true, {@code EXT_robustness} is supported. */
    public final boolean GL_EXT_robustness;
    /** When true, {@code EXT_semaphore} is supported. */
    public final boolean GL_EXT_semaphore;
    /** When true, {@code EXT_semaphore_fd} is supported. */
    public final boolean GL_EXT_semaphore_fd;
    /** When true, {@code EXT_semaphore_win32} is supported. */
    public final boolean GL_EXT_semaphore_win32;
    /** When true, {@code EXT_separate_depth_stencil} is supported. */
    public final boolean GL_EXT_separate_depth_stencil;
    /** When true, {@code EXT_separate_shader_objects} is supported. */
    public final boolean GL_EXT_separate_shader_objects;
    /** When true, {@code EXT_shader_framebuffer_fetch} is supported. */
    public final boolean GL_EXT_shader_framebuffer_fetch;
    /** When true, {@code EXT_shader_framebuffer_fetch_non_coherent} is supported. */
    public final boolean GL_EXT_shader_framebuffer_fetch_non_coherent;
    /** When true, {@code EXT_shader_group_vote} is supported. */
    public final boolean GL_EXT_shader_group_vote;
    /** When true, {@code EXT_shader_implicit_conversions} is supported. */
    public final boolean GL_EXT_shader_implicit_conversions;
    /** When true, {@code EXT_shader_integer_mix} is supported. */
    public final boolean GL_EXT_shader_integer_mix;
    /** When true, {@code EXT_shader_io_blocks} is supported. */
    public final boolean GL_EXT_shader_io_blocks;
    /** When true, {@code EXT_shader_non_constant_global_initializers} is supported. */
    public final boolean GL_EXT_shader_non_constant_global_initializers;
    /** When true, {@code EXT_shader_pixel_local_storage} is supported. */
    public final boolean GL_EXT_shader_pixel_local_storage;
    /** When true, {@code EXT_shader_pixel_local_storage2} is supported. */
    public final boolean GL_EXT_shader_pixel_local_storage2;
    /** When true, {@code EXT_shader_samples_identical} is supported. */
    public final boolean GL_EXT_shader_samples_identical;
    /** When true, {@code EXT_shader_texture_lod} is supported. */
    public final boolean GL_EXT_shader_texture_lod;
    /** When true, {@code EXT_shadow_samplers} is supported. */
    public final boolean GL_EXT_shadow_samplers;
    /** When true, {@code EXT_sparse_texture} is supported. */
    public final boolean GL_EXT_sparse_texture;
    /** When true, {@code EXT_sparse_texture2} is supported. */
    public final boolean GL_EXT_sparse_texture2;
    /** When true, {@code EXT_sRGB} is supported. */
    public final boolean GL_EXT_sRGB;
    /** When true, {@code EXT_sRGB_write_control} is supported. */
    public final boolean GL_EXT_sRGB_write_control;
    /** When true, {@code EXT_tessellation_point_size} is supported. */
    public final boolean GL_EXT_tessellation_point_size;
    /** When true, {@code EXT_tessellation_shader} is supported. */
    public final boolean GL_EXT_tessellation_shader;
    /** When true, {@code EXT_texture_border_clamp} is supported. */
    public final boolean GL_EXT_texture_border_clamp;
    /** When true, {@code EXT_texture_buffer} is supported. */
    public final boolean GL_EXT_texture_buffer;
    /** When true, {@code EXT_texture_compression_astc_decode_mode} is supported. */
    public final boolean GL_EXT_texture_compression_astc_decode_mode;
    /** When true, {@code EXT_texture_compression_bptc} is supported. */
    public final boolean GL_EXT_texture_compression_bptc;
    /** When true, {@code EXT_texture_compression_dxt1} is supported. */
    public final boolean GL_EXT_texture_compression_dxt1;
    /** When true, {@code EXT_texture_compression_rgtc} is supported. */
    public final boolean GL_EXT_texture_compression_rgtc;
    /** When true, {@code EXT_texture_compression_s3tc} is supported. */
    public final boolean GL_EXT_texture_compression_s3tc;
    /** When true, {@code EXT_texture_compression_s3tc_srgb} is supported. */
    public final boolean GL_EXT_texture_compression_s3tc_srgb;
    /** When true, {@code EXT_texture_cube_map_array} is supported. */
    public final boolean GL_EXT_texture_cube_map_array;
    /** When true, {@code EXT_texture_filter_anisotropic} is supported. */
    public final boolean GL_EXT_texture_filter_anisotropic;
    /** When true, {@code EXT_texture_filter_minmax} is supported. */
    public final boolean GL_EXT_texture_filter_minmax;
    /** When true, {@code EXT_texture_format_BGRA8888} is supported. */
    public final boolean GL_EXT_texture_format_BGRA8888;
    /** When true, {@code EXT_texture_format_sRGB_override} is supported. */
    public final boolean GL_EXT_texture_format_sRGB_override;
    /** When true, {@code EXT_texture_mirror_clamp_to_edge} is supported. */
    public final boolean GL_EXT_texture_mirror_clamp_to_edge;
    /** When true, {@code EXT_texture_norm16} is supported. */
    public final boolean GL_EXT_texture_norm16;
    /** When true, {@code EXT_texture_rg} is supported. */
    public final boolean GL_EXT_texture_rg;
    /** When true, {@code EXT_texture_shadow_lod} is supported. */
    public final boolean GL_EXT_texture_shadow_lod;
    /** When true, {@code EXT_texture_sRGB_decode} is supported. */
    public final boolean GL_EXT_texture_sRGB_decode;
    /** When true, {@code EXT_texture_sRGB_R8} is supported. */
    public final boolean GL_EXT_texture_sRGB_R8;
    /** When true, {@code EXT_texture_sRGB_RG8} is supported. */
    public final boolean GL_EXT_texture_sRGB_RG8;
    /** When true, {@code EXT_texture_storage} is supported. */
    public final boolean GL_EXT_texture_storage;
    /** When true, {@code EXT_texture_storage_compression} is supported. */
    public final boolean GL_EXT_texture_storage_compression;
    /** When true, {@code EXT_texture_type_2_10_10_10_REV} is supported. */
    public final boolean GL_EXT_texture_type_2_10_10_10_REV;
    /** When true, {@code EXT_texture_view} is supported. */
    public final boolean GL_EXT_texture_view;
    /** When true, {@code EXT_unpack_subimage} is supported. */
    public final boolean GL_EXT_unpack_subimage;
    /** When true, {@code EXT_win32_keyed_mutex} is supported. */
    public final boolean GL_EXT_win32_keyed_mutex;
    /** When true, {@code EXT_window_rectangles} is supported. */
    public final boolean GL_EXT_window_rectangles;
    /** When true, {@code EXT_YUV_target} is supported. */
    public final boolean GL_EXT_YUV_target;
    /** When true, {@code FJ_shader_binary_GCCSO} is supported. */
    public final boolean GL_FJ_shader_binary_GCCSO;
    /** When true, {@code GL_EXT_texture_compression_astc_decode_mode_rgb9e5} is supported. */
    public final boolean GL_EXT_texture_compression_astc_decode_mode_rgb9e5;
    /** When true, {@code GL_EXT_texture_query_lod} is supported. */
    public final boolean GL_EXT_texture_query_lod;
    /** When true, {@code IMG_framebuffer_downsample} is supported. */
    public final boolean GL_IMG_framebuffer_downsample;
    /** When true, {@code IMG_multisampled_render_to_texture} is supported. */
    public final boolean GL_IMG_multisampled_render_to_texture;
    /** When true, {@code IMG_program_binary} is supported. */
    public final boolean GL_IMG_program_binary;
    /** When true, {@code IMG_read_format} is supported. */
    public final boolean GL_IMG_read_format;
    /** When true, {@code IMG_shader_binary} is supported. */
    public final boolean GL_IMG_shader_binary;
    /** When true, {@code IMG_texture_compression_pvrtc} is supported. */
    public final boolean GL_IMG_texture_compression_pvrtc;
    /** When true, {@code IMG_texture_compression_pvrtc2} is supported. */
    public final boolean GL_IMG_texture_compression_pvrtc2;
    /** When true, {@code IMG_texture_filter_cubic} is supported. */
    public final boolean GL_IMG_texture_filter_cubic;
    /** When true, {@code INTEL_blackhole_render} is supported. */
    public final boolean GL_INTEL_blackhole_render;
    /** When true, {@code INTEL_conservative_rasterization} is supported. */
    public final boolean GL_INTEL_conservative_rasterization;
    /** When true, {@code INTEL_framebuffer_CMAA} is supported. */
    public final boolean GL_INTEL_framebuffer_CMAA;
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
    /** When true, {@code MESA_bgra} is supported. */
    public final boolean GL_MESA_bgra;
    /** When true, {@code MESA_framebuffer_flip_x} is supported. */
    public final boolean GL_MESA_framebuffer_flip_x;
    /** When true, {@code MESA_framebuffer_flip_y} is supported. */
    public final boolean GL_MESA_framebuffer_flip_y;
    /** When true, {@code MESA_framebuffer_swap_xy} is supported. */
    public final boolean GL_MESA_framebuffer_swap_xy;
    /** When true, {@code MESA_program_binary_formats} is supported. */
    public final boolean GL_MESA_program_binary_formats;
    /** When true, {@code MESA_tile_raster_order} is supported. */
    public final boolean GL_MESA_tile_raster_order;
    /** When true, {@code NV_alpha_to_coverage_dither_control} is supported. */
    public final boolean GL_NV_alpha_to_coverage_dither_control;
    /** When true, {@code NV_bindless_texture} is supported. */
    public final boolean GL_NV_bindless_texture;
    /** When true, {@code NV_blend_equation_advanced} is supported. */
    public final boolean GL_NV_blend_equation_advanced;
    /** When true, {@code NV_blend_equation_advanced_coherent} is supported. */
    public final boolean GL_NV_blend_equation_advanced_coherent;
    /** When true, {@code NV_blend_minmax_factor} is supported. */
    public final boolean GL_NV_blend_minmax_factor;
    /** When true, {@code NV_clip_space_w_scaling} is supported. */
    public final boolean GL_NV_clip_space_w_scaling;
    /** When true, {@code NV_compute_shader_derivatives} is supported. */
    public final boolean GL_NV_compute_shader_derivatives;
    /** When true, {@code NV_conditional_render} is supported. */
    public final boolean GL_NV_conditional_render;
    /** When true, {@code NV_conservative_raster} is supported. */
    public final boolean GL_NV_conservative_raster;
    /** When true, {@code NV_conservative_raster_pre_snap} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap;
    /** When true, {@code NV_conservative_raster_pre_snap_triangles} is supported. */
    public final boolean GL_NV_conservative_raster_pre_snap_triangles;
    /** When true, {@code NV_copy_buffer} is supported. */
    public final boolean GL_NV_copy_buffer;
    /** When true, {@code NV_coverage_sample} is supported. */
    public final boolean GL_NV_coverage_sample;
    /** When true, {@code NV_depth_nonlinear} is supported. */
    public final boolean GL_NV_depth_nonlinear;
    /** When true, {@code NV_draw_buffers} is supported. */
    public final boolean GL_NV_draw_buffers;
    /** When true, {@code NV_draw_instanced} is supported. */
    public final boolean GL_NV_draw_instanced;
    /** When true, {@code NV_draw_vulkan_image} is supported. */
    public final boolean GL_NV_draw_vulkan_image;
    /** When true, {@code NV_explicit_attrib_location} is supported. */
    public final boolean GL_NV_explicit_attrib_location;
    /** When true, {@code NV_fbo_color_attachments} is supported. */
    public final boolean GL_NV_fbo_color_attachments;
    /** When true, {@code NV_fence} is supported. */
    public final boolean GL_NV_fence;
    /** When true, {@code NV_fill_rectangle} is supported. */
    public final boolean GL_NV_fill_rectangle;
    /** When true, {@code NV_fragment_coverage_to_color} is supported. */
    public final boolean GL_NV_fragment_coverage_to_color;
    /** When true, {@code NV_fragment_shader_barycentric} is supported. */
    public final boolean GL_NV_fragment_shader_barycentric;
    /** When true, {@code NV_fragment_shader_interlock} is supported. */
    public final boolean GL_NV_fragment_shader_interlock;
    /** When true, {@code NV_framebuffer_blit} is supported. */
    public final boolean GL_NV_framebuffer_blit;
    /** When true, {@code NV_framebuffer_mixed_samples} is supported. */
    public final boolean GL_NV_framebuffer_mixed_samples;
    /** When true, {@code NV_framebuffer_multisample} is supported. */
    public final boolean GL_NV_framebuffer_multisample;
    /** When true, {@code NV_generate_mipmap_sRGB} is supported. */
    public final boolean GL_NV_generate_mipmap_sRGB;
    /** When true, {@code NV_geometry_shader_passthrough} is supported. */
    public final boolean GL_NV_geometry_shader_passthrough;
    /** When true, {@code NV_gpu_shader5} is supported. */
    public final boolean GL_NV_gpu_shader5;
    /** When true, {@code NV_image_formats} is supported. */
    public final boolean GL_NV_image_formats;
    /** When true, {@code NV_instanced_arrays} is supported. */
    public final boolean GL_NV_instanced_arrays;
    /** When true, {@code NV_internalformat_sample_query} is supported. */
    public final boolean GL_NV_internalformat_sample_query;
    /** When true, {@code NV_memory_attachment} is supported. */
    public final boolean GL_NV_memory_attachment;
    /** When true, {@code NV_memory_object_sparse} is supported. */
    public final boolean GL_NV_memory_object_sparse;
    /** When true, {@code NV_mesh_shader} is supported. */
    public final boolean GL_NV_mesh_shader;
    /** When true, {@code NV_non_square_matrices} is supported. */
    public final boolean GL_NV_non_square_matrices;
    /** When true, {@code NV_pack_subimage} is supported. */
    public final boolean GL_NV_pack_subimage;
    /** When true, {@code NV_path_rendering} is supported. */
    public final boolean GL_NV_path_rendering;
    /** When true, {@code NV_path_rendering_shared_edge} is supported. */
    public final boolean GL_NV_path_rendering_shared_edge;
    /** When true, {@code NV_polygon_mode} is supported. */
    public final boolean GL_NV_polygon_mode;
    /** When true, {@code NV_primitive_shading_rate} is supported. */
    public final boolean GL_NV_primitive_shading_rate;
    /** When true, {@code NV_read_buffer} is supported. */
    public final boolean GL_NV_read_buffer;
    /** When true, {@code NV_read_buffer_front} is supported. */
    public final boolean GL_NV_read_buffer_front;
    /** When true, {@code NV_read_depth} is supported. */
    public final boolean GL_NV_read_depth;
    /** When true, {@code NV_read_depth_stencil} is supported. */
    public final boolean GL_NV_read_depth_stencil;
    /** When true, {@code NV_read_stencil} is supported. */
    public final boolean GL_NV_read_stencil;
    /** When true, {@code NV_representative_fragment_test} is supported. */
    public final boolean GL_NV_representative_fragment_test;
    /** When true, {@code NV_sample_locations} is supported. */
    public final boolean GL_NV_sample_locations;
    /** When true, {@code NV_sample_mask_override_coverage} is supported. */
    public final boolean GL_NV_sample_mask_override_coverage;
    /** When true, {@code NV_scissor_exclusive} is supported. */
    public final boolean GL_NV_scissor_exclusive;
    /** When true, {@code NV_shader_atomic_fp16_vector} is supported. */
    public final boolean GL_NV_shader_atomic_fp16_vector;
    /** When true, {@code NV_shader_noperspective_interpolation} is supported. */
    public final boolean GL_NV_shader_noperspective_interpolation;
    /** When true, {@code NV_shader_subgroup_partitioned} is supported. */
    public final boolean GL_NV_shader_subgroup_partitioned;
    /** When true, {@code NV_shader_texture_footprint} is supported. */
    public final boolean GL_NV_shader_texture_footprint;
    /** When true, {@code NV_shadow_samplers_array} is supported. */
    public final boolean GL_NV_shadow_samplers_array;
    /** When true, {@code NV_shadow_samplers_cube} is supported. */
    public final boolean GL_NV_shadow_samplers_cube;
    /** When true, {@code NV_sRGB_formats} is supported. */
    public final boolean GL_NV_sRGB_formats;
    /** When true, {@code NV_stereo_view_rendering} is supported. */
    public final boolean GL_NV_stereo_view_rendering;
    /** When true, {@code NV_texture_array} is supported. */
    public final boolean GL_NV_texture_array;
    /** When true, {@code NV_texture_barrier} is supported. */
    public final boolean GL_NV_texture_barrier;
    /** When true, {@code NV_texture_border_clamp} is supported. */
    public final boolean GL_NV_texture_border_clamp;
    /** When true, {@code NV_texture_compression_s3tc} is supported. */
    public final boolean GL_NV_texture_compression_s3tc;
    /** When true, {@code NV_texture_compression_s3tc_update} is supported. */
    public final boolean GL_NV_texture_compression_s3tc_update;
    /** When true, {@code NV_texture_npot_2D_mipmap} is supported. */
    public final boolean GL_NV_texture_npot_2D_mipmap;
    /** When true, {@code NV_timeline_semaphore} is supported. */
    public final boolean GL_NV_timeline_semaphore;
    /** When true, {@code NV_viewport_array} is supported. */
    public final boolean GL_NV_viewport_array;
    /** When true, {@code NV_viewport_array2} is supported. */
    public final boolean GL_NV_viewport_array2;
    /** When true, {@code NV_viewport_swizzle} is supported. */
    public final boolean GL_NV_viewport_swizzle;
    /** When true, {@code NVX_blend_equation_advanced_multi_draw_buffers} is supported. */
    public final boolean GL_NVX_blend_equation_advanced_multi_draw_buffers;
    /** When true, {@code OES_compressed_ETC1_RGB8_texture} is supported. */
    public final boolean GL_OES_compressed_ETC1_RGB8_texture;
    /** When true, {@code OES_compressed_paletted_texture} is supported. */
    public final boolean GL_OES_compressed_paletted_texture;
    /** When true, {@code OES_copy_image} is supported. */
    public final boolean GL_OES_copy_image;
    /** When true, {@code OES_depth24} is supported. */
    public final boolean GL_OES_depth24;
    /** When true, {@code OES_depth32} is supported. */
    public final boolean GL_OES_depth32;
    /** When true, {@code OES_depth_texture} is supported. */
    public final boolean GL_OES_depth_texture;
    /** When true, {@code OES_depth_texture_cube_map} is supported. */
    public final boolean GL_OES_depth_texture_cube_map;
    /** When true, {@code OES_draw_buffers_indexed} is supported. */
    public final boolean GL_OES_draw_buffers_indexed;
    /** When true, {@code OES_draw_elements_base_vertex} is supported. */
    public final boolean GL_OES_draw_elements_base_vertex;
    /** When true, {@code OES_EGL_image} is supported. */
    public final boolean GL_OES_EGL_image;
    /** When true, {@code OES_EGL_image_external} is supported. */
    public final boolean GL_OES_EGL_image_external;
    /** When true, {@code OES_EGL_image_external_essl3} is supported. */
    public final boolean GL_OES_EGL_image_external_essl3;
    /** When true, {@code OES_element_index_uint} is supported. */
    public final boolean GL_OES_element_index_uint;
    /** When true, {@code OES_fbo_render_mipmap} is supported. */
    public final boolean GL_OES_fbo_render_mipmap;
    /** When true, {@code OES_geometry_point_size} is supported. */
    public final boolean GL_OES_geometry_point_size;
    /** When true, {@code OES_geometry_shader} is supported. */
    public final boolean GL_OES_geometry_shader;
    /** When true, {@code OES_get_program_binary} is supported. */
    public final boolean GL_OES_get_program_binary;
    /** When true, {@code OES_gpu_shader5} is supported. */
    public final boolean GL_OES_gpu_shader5;
    /** When true, {@code OES_mapbuffer} is supported. */
    public final boolean GL_OES_mapbuffer;
    /** When true, {@code OES_packed_depth_stencil} is supported. */
    public final boolean GL_OES_packed_depth_stencil;
    /** When true, {@code OES_primitive_bounding_box} is supported. */
    public final boolean GL_OES_primitive_bounding_box;
    /** When true, {@code OES_required_internalformat} is supported. */
    public final boolean GL_OES_required_internalformat;
    /** When true, {@code OES_rgb8_rgba8} is supported. */
    public final boolean GL_OES_rgb8_rgba8;
    /** When true, {@code OES_sample_shading} is supported. */
    public final boolean GL_OES_sample_shading;
    /** When true, {@code OES_sample_variables} is supported. */
    public final boolean GL_OES_sample_variables;
    /** When true, {@code OES_shader_image_atomic} is supported. */
    public final boolean GL_OES_shader_image_atomic;
    /** When true, {@code OES_shader_io_blocks} is supported. */
    public final boolean GL_OES_shader_io_blocks;
    /** When true, {@code OES_shader_multisample_interpolation} is supported. */
    public final boolean GL_OES_shader_multisample_interpolation;
    /** When true, {@code OES_standard_derivatives} is supported. */
    public final boolean GL_OES_standard_derivatives;
    /** When true, {@code OES_stencil1} is supported. */
    public final boolean GL_OES_stencil1;
    /** When true, {@code OES_stencil4} is supported. */
    public final boolean GL_OES_stencil4;
    /** When true, {@code OES_stencil8} is supported. */
    public final boolean GL_OES_stencil8;
    /** When true, {@code OES_surfaceless_context} is supported. */
    public final boolean GL_OES_surfaceless_context;
    /** When true, {@code OES_tessellation_point_size} is supported. */
    public final boolean GL_OES_tessellation_point_size;
    /** When true, {@code OES_tessellation_shader} is supported. */
    public final boolean GL_OES_tessellation_shader;
    /** When true, {@code OES_texture_3D} is supported. */
    public final boolean GL_OES_texture_3D;
    /** When true, {@code OES_texture_border_clamp} is supported. */
    public final boolean GL_OES_texture_border_clamp;
    /** When true, {@code OES_texture_buffer} is supported. */
    public final boolean GL_OES_texture_buffer;
    /** When true, {@code OES_texture_compression_astc} is supported. */
    public final boolean GL_OES_texture_compression_astc;
    /** When true, {@code OES_texture_cube_map_array} is supported. */
    public final boolean GL_OES_texture_cube_map_array;
    /** When true, {@code OES_texture_float} is supported. */
    public final boolean GL_OES_texture_float;
    /** When true, {@code OES_texture_float_linear} is supported. */
    public final boolean GL_OES_texture_float_linear;
    /** When true, {@code OES_texture_half_float} is supported. */
    public final boolean GL_OES_texture_half_float;
    /** When true, {@code OES_texture_half_float_linear} is supported. */
    public final boolean GL_OES_texture_half_float_linear;
    /** When true, {@code OES_texture_npot} is supported. */
    public final boolean GL_OES_texture_npot;
    /** When true, {@code OES_texture_stencil8} is supported. */
    public final boolean GL_OES_texture_stencil8;
    /** When true, {@code OES_texture_storage_multisample_2d_array} is supported. */
    public final boolean GL_OES_texture_storage_multisample_2d_array;
    /** When true, {@code OES_texture_view} is supported. */
    public final boolean GL_OES_texture_view;
    /** When true, {@code OES_vertex_array_object} is supported. */
    public final boolean GL_OES_vertex_array_object;
    /** When true, {@code OES_vertex_half_float} is supported. */
    public final boolean GL_OES_vertex_half_float;
    /** When true, {@code OES_vertex_type_10_10_10_2} is supported. */
    public final boolean GL_OES_vertex_type_10_10_10_2;
    /** When true, {@code OES_viewport_array} is supported. */
    public final boolean GL_OES_viewport_array;
    /** When true, {@code OVR_multiview} is supported. */
    public final boolean GL_OVR_multiview;
    /** When true, {@code OVR_multiview2} is supported. */
    public final boolean GL_OVR_multiview2;
    /** When true, {@code OVR_multiview_multisampled_render_to_texture} is supported. */
    public final boolean GL_OVR_multiview_multisampled_render_to_texture;
    /** When true, {@code QCOM_alpha_test} is supported. */
    public final boolean GL_QCOM_alpha_test;
    /** When true, {@code QCOM_binning_control} is supported. */
    public final boolean GL_QCOM_binning_control;
    /** When true, {@code QCOM_driver_control} is supported. */
    public final boolean GL_QCOM_driver_control;
    /** When true, {@code QCOM_extended_get} is supported. */
    public final boolean GL_QCOM_extended_get;
    /** When true, {@code QCOM_extended_get2} is supported. */
    public final boolean GL_QCOM_extended_get2;
    /** When true, {@code QCOM_frame_extrapolation} is supported. */
    public final boolean GL_QCOM_frame_extrapolation;
    /** When true, {@code QCOM_framebuffer_foveated} is supported. */
    public final boolean GL_QCOM_framebuffer_foveated;
    /** When true, {@code QCOM_motion_estimation} is supported. */
    public final boolean GL_QCOM_motion_estimation;
    /** When true, {@code QCOM_perfmon_global_mode} is supported. */
    public final boolean GL_QCOM_perfmon_global_mode;
    /** When true, {@code QCOM_render_shared_exponent} is supported. */
    public final boolean GL_QCOM_render_shared_exponent;
    /** When true, {@code QCOM_render_sRGB_R8_RG8} is supported. */
    public final boolean GL_QCOM_render_sRGB_R8_RG8;
    /** When true, {@code QCOM_shader_framebuffer_fetch_noncoherent} is supported. */
    public final boolean GL_QCOM_shader_framebuffer_fetch_noncoherent;
    /** When true, {@code QCOM_shader_framebuffer_fetch_rate} is supported. */
    public final boolean GL_QCOM_shader_framebuffer_fetch_rate;
    /** When true, {@code QCOM_shading_rate} is supported. */
    public final boolean GL_QCOM_shading_rate;
    /** When true, {@code QCOM_texture_foveated} is supported. */
    public final boolean GL_QCOM_texture_foveated;
    /** When true, {@code QCOM_texture_foveated2} is supported. */
    public final boolean GL_QCOM_texture_foveated2;
    /** When true, {@code QCOM_texture_foveated_subsampled_layout} is supported. */
    public final boolean GL_QCOM_texture_foveated_subsampled_layout;
    /** When true, {@code QCOM_texture_lod_bias} is supported. */
    public final boolean GL_QCOM_texture_lod_bias;
    /** When true, {@code QCOM_tiled_rendering} is supported. */
    public final boolean GL_QCOM_tiled_rendering;
    /** When true, {@code QCOM_writeonly_rendering} is supported. */
    public final boolean GL_QCOM_writeonly_rendering;
    /** When true, {@code QCOM_ycbcr_degamma} is supported. */
    public final boolean GL_QCOM_ycbcr_degamma;
    /** When true, {@code QCOM_YUV_texture_gather} is supported. */
    public final boolean GL_QCOM_YUV_texture_gather;
    /** When true, {@code VIV_shader_binary} is supported. */
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
        GL_ARM_shader_core_properties = check_ARM_shader_core_properties(provider, caps, ext);
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
        GL_QCOM_render_sRGB_R8_RG8 = ext.contains("GL_QCOM_render_sRGB_R8_RG8");
        GL_QCOM_shader_framebuffer_fetch_noncoherent = check_QCOM_shader_framebuffer_fetch_noncoherent(provider, caps, ext);
        GL_QCOM_shader_framebuffer_fetch_rate = ext.contains("GL_QCOM_shader_framebuffer_fetch_rate");
        GL_QCOM_shading_rate = ext.contains("GL_QCOM_shading_rate");
        GL_QCOM_texture_foveated = check_QCOM_texture_foveated(provider, caps, ext);
        GL_QCOM_texture_foveated2 = ext.contains("GL_QCOM_texture_foveated2");
        GL_QCOM_texture_foveated_subsampled_layout = ext.contains("GL_QCOM_texture_foveated_subsampled_layout");
        GL_QCOM_texture_lod_bias = ext.contains("GL_QCOM_texture_lod_bias");
        GL_QCOM_tiled_rendering = check_QCOM_tiled_rendering(provider, caps, ext);
        GL_QCOM_writeonly_rendering = ext.contains("GL_QCOM_writeonly_rendering");
        GL_QCOM_ycbcr_degamma = ext.contains("GL_QCOM_ycbcr_degamma");
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
        glMaxActiveShaderCoresARM = caps.get(387);
        glDrawArraysInstancedBaseInstanceEXT = caps.get(388);
        glDrawElementsInstancedBaseInstanceEXT = caps.get(389);
        glDrawElementsInstancedBaseVertexBaseInstanceEXT = caps.get(390);
        glBindFragDataLocationIndexedEXT = caps.get(391);
        glGetFragDataIndexEXT = caps.get(392);
        glBindFragDataLocationEXT = caps.get(393);
        glGetProgramResourceLocationIndexEXT = caps.get(394);
        glBufferStorageEXT = caps.get(395);
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
        glTexPageCommitmentEXT = caps.get(543);
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
        glNamedFramebufferTextureMultiviewOVR = caps.get(845);
        glFramebufferTextureMultisampleMultiviewOVR = caps.get(846);
        glAlphaFuncQCOM = caps.get(847);
        glGetDriverControlsQCOM = caps.get(848);
        glGetDriverControlStringQCOM = caps.get(849);
        glEnableDriverControlQCOM = caps.get(850);
        glDisableDriverControlQCOM = caps.get(851);
        glExtGetTexturesQCOM = caps.get(852);
        glExtGetBuffersQCOM = caps.get(853);
        glExtGetRenderbuffersQCOM = caps.get(854);
        glExtGetFramebuffersQCOM = caps.get(855);
        glExtGetTexLevelParameterivQCOM = caps.get(856);
        glExtTexObjectStateOverrideiQCOM = caps.get(857);
        glExtGetTexSubImageQCOM = caps.get(858);
        glExtGetBufferPointervQCOM = caps.get(859);
        glExtGetShadersQCOM = caps.get(860);
        glExtGetProgramsQCOM = caps.get(861);
        glExtIsProgramBinaryQCOM = caps.get(862);
        glExtGetProgramBinarySourceQCOM = caps.get(863);
        glExtrapolateTex2DQCOM = caps.get(864);
        glFramebufferFoveationConfigQCOM = caps.get(865);
        glFramebufferFoveationParametersQCOM = caps.get(866);
        glTexEstimateMotionQCOM = caps.get(867);
        glTexEstimateMotionRegionsQCOM = caps.get(868);
        glFramebufferFetchBarrierQCOM = caps.get(869);
        glTextureFoveationParametersQCOM = caps.get(870);
        glStartTilingQCOM = caps.get(871);
        glEndTilingQCOM = caps.get(872);

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

    private static boolean check_ARM_shader_core_properties(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_ARM_shader_core_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            387
        },
            "glMaxActiveShaderCoresARM"
        ) || reportMissing("GLES", "GL_ARM_shader_core_properties");
    }

    private static boolean check_EXT_base_instance(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_base_instance")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            388, 389, 390
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
            flag0 + 391, flag0 + 392, flag0 + 393
        },
            "glBindFragDataLocationIndexedEXT", "glGetFragDataIndexEXT", "glBindFragDataLocationEXT"
        ) || reportMissing("GLES", "GL_EXT_blend_func_extended");
    }

    private static boolean check_EXT_buffer_storage(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_EXT_buffer_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            395
        },
            "glBufferStorageEXT"
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
            "glTexPageCommitmentEXT"
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

        int flag0 = hasDSA(ext) ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            844, flag0 + 845
        },
            "glFramebufferTextureMultiviewOVR", "glNamedFramebufferTextureMultiviewOVR"
        ) || reportMissing("GLES", "GL_OVR_multiview");
    }

    private static boolean check_OVR_multiview_multisampled_render_to_texture(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_OVR_multiview_multisampled_render_to_texture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            846
        },
            "glFramebufferTextureMultisampleMultiviewOVR"
        ) || reportMissing("GLES", "GL_OVR_multiview_multisampled_render_to_texture");
    }

    private static boolean check_QCOM_alpha_test(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_alpha_test")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            847
        },
            "glAlphaFuncQCOM"
        ) || reportMissing("GLES", "GL_QCOM_alpha_test");
    }

    private static boolean check_QCOM_driver_control(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_driver_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            848, 849, 850, 851
        },
            "glGetDriverControlsQCOM", "glGetDriverControlStringQCOM", "glEnableDriverControlQCOM", "glDisableDriverControlQCOM"
        ) || reportMissing("GLES", "GL_QCOM_driver_control");
    }

    private static boolean check_QCOM_extended_get(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_extended_get")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            852, 853, 854, 855, 856, 857, 858, 859
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
            860, 861, 862, 863
        },
            "glExtGetShadersQCOM", "glExtGetProgramsQCOM", "glExtIsProgramBinaryQCOM", "glExtGetProgramBinarySourceQCOM"
        ) || reportMissing("GLES", "GL_QCOM_extended_get2");
    }

    private static boolean check_QCOM_frame_extrapolation(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_frame_extrapolation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            864
        },
            "glExtrapolateTex2DQCOM"
        ) || reportMissing("GLES", "GL_QCOM_frame_extrapolation");
    }

    private static boolean check_QCOM_framebuffer_foveated(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_framebuffer_foveated")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            865, 866
        },
            "glFramebufferFoveationConfigQCOM", "glFramebufferFoveationParametersQCOM"
        ) || reportMissing("GLES", "GL_QCOM_framebuffer_foveated");
    }

    private static boolean check_QCOM_motion_estimation(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_motion_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            867, 868
        },
            "glTexEstimateMotionQCOM", "glTexEstimateMotionRegionsQCOM"
        ) || reportMissing("GLES", "GL_QCOM_motion_estimation");
    }

    private static boolean check_QCOM_shader_framebuffer_fetch_noncoherent(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_shader_framebuffer_fetch_noncoherent")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            869
        },
            "glFramebufferFetchBarrierQCOM"
        ) || reportMissing("GLES", "GL_QCOM_shader_framebuffer_fetch_noncoherent");
    }

    private static boolean check_QCOM_texture_foveated(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_texture_foveated")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            870
        },
            "glTextureFoveationParametersQCOM"
        ) || reportMissing("GLES", "GL_QCOM_texture_foveated");
    }

    private static boolean check_QCOM_tiled_rendering(FunctionProvider provider, PointerBuffer caps, Set<String> ext) {
        if (!ext.contains("GL_QCOM_tiled_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            871, 872
        },
            "glStartTilingQCOM", "glEndTilingQCOM"
        ) || reportMissing("GLES", "GL_QCOM_tiled_rendering");
    }

    private static boolean hasDSA(Set<String> ext) {
        return ext.contains("GL_ARB_direct_state_access") || ext.contains("GL_EXT_direct_state_access");
    }

}
