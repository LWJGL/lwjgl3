/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

const val EXT = "EXT"
const val KHR = "KHR"

const val AMD = "AMD"
const val ANDROID = "ANDROID"
const val ANGLE = "ANGLE"
const val APPLE = "APPLE"
const val ARM = "ARM"
const val DMP = "DMP"
const val FJ = "FJ"
const val IMG = "IMG"
const val INTEL = "INTEL"
const val MESA = "MESA"
const val NV = "NV"
const val NVX = "NVX"
const val OES = "OES"
const val OVR = "OVR"
const val QCOM = "QCOM"
const val VIV = "VIV"

private val NativeClass.cap: String get() = "{@link \\#$capName $templateName}"

val ANDROID_extension_pack_es31a = EXT_FLAG.nativeClassGLES("ANDROID_extension_pack_es31a", postfix = ANDROID)

val APPLE_color_buffer_packed_float = EXT_FLAG.nativeClassGLES("APPLE_color_buffer_packed_float", postfix = APPLE)

val ARM_rgba8 = EXT_FLAG.nativeClassGLES("ARM_rgba8", postfix = ARM)
val ARM_shader_framebuffer_fetch_depth_stencil = EXT_FLAG.nativeClassGLES("ARM_shader_framebuffer_fetch_depth_stencil", postfix = ARM)

val EXT_color_buffer_float = EXT_FLAG.nativeClassGLES("EXT_color_buffer_float", postfix = EXT)
val EXT_compressed_ETC1_RGB8_sub_texture = EXT_FLAG.nativeClassGLES("EXT_compressed_ETC1_RGB8_sub_texture", postfix = EXT)
val EXT_conservative_depth = EXT_FLAG.nativeClassGLES("EXT_conservative_depth", postfix = EXT)
val EXT_EGL_image_array = EXT_FLAG.nativeClassGLES("EXT_EGL_image_array", postfix = EXT)
val EXT_EGL_image_external_wrap_modes = EXT_FLAG.nativeClassGLES("EXT_EGL_image_external_wrap_modes", postfix = EXT)
val EXT_float_blend = EXT_FLAG.nativeClassGLES("EXT_float_blend", postfix = EXT)
val EXT_fragment_shading_rate_attachment = EXT_FLAG.nativeClassGLES("EXT_fragment_shading_rate_attachment", postfix = EXT)
val EXT_fragment_shading_rate_primitive = EXT_FLAG.nativeClassGLES("EXT_fragment_shading_rate_primitive", postfix = EXT)
val EXT_gpu_shader5 = EXT_FLAG.nativeClassGLES("EXT_gpu_shader5", postfix = EXT)
val EXT_multisampled_render_to_texture2 = EXT_FLAG.nativeClassGLES("EXT_multisampled_render_to_texture2", postfix = EXT)
val EXT_multiview_timer_query = EXT_FLAG.nativeClassGLES("EXT_multiview_timer_query", postfix = EXT)
val EXT_multiview_texture_multisample = EXT_FLAG.nativeClassGLES("EXT_multiview_texture_multisample", postfix = EXT)
val EXT_multiview_tessellation_geometry_shader = EXT_FLAG.nativeClassGLES("EXT_multiview_tessellation_geometry_shader", postfix = EXT)
val EXT_post_depth_coverage = EXT_FLAG.nativeClassGLES("EXT_post_depth_coverage", postfix = EXT)
val EXT_separate_depth_stencil = EXT_FLAG.nativeClassGLES("EXT_separate_depth_stencil", postfix = EXT)
val EXT_shader_group_vote = EXT_FLAG.nativeClassGLES("EXT_shader_group_vote", postfix = EXT)
val EXT_shader_implicit_conversions = EXT_FLAG.nativeClassGLES("EXT_shader_implicit_conversions", postfix = EXT)
val EXT_shader_integer_mix = EXT_FLAG.nativeClassGLES("EXT_shader_integer_mix", postfix = EXT)
val EXT_shader_io_blocks = EXT_FLAG.nativeClassGLES("EXT_shader_io_blocks", postfix = EXT)
val EXT_shader_non_constant_global_initializers = EXT_FLAG.nativeClassGLES("EXT_shader_non_constant_global_initializers", postfix = EXT)
val EXT_shader_samples_identical = EXT_FLAG.nativeClassGLES("EXT_shader_samples_identical", postfix = EXT)
val EXT_shader_texture_lod = EXT_FLAG.nativeClassGLES("EXT_shader_texture_lod", postfix = EXT)
val EXT_sparse_texture2 = EXT_FLAG.nativeClassGLES("EXT_sparse_texture2", postfix = EXT)
val EXT_texture_compression_astc_decode_mode_rgb9e5 = EXT_FLAG.nativeClassGLES("GL_EXT_texture_compression_astc_decode_mode_rgb9e5", postfix = EXT)
val EXT_texture_query_lod = EXT_FLAG.nativeClassGLES("GL_EXT_texture_query_lod", postfix = EXT)
val EXT_texture_shadow_lod = EXT_FLAG.nativeClassGLES("EXT_texture_shadow_lod", postfix = EXT)

val INTEL_shader_integer_functions2 = EXT_FLAG.nativeClassGLES("INTEL_shader_integer_functions2", postfix = INTEL)

val KHR_robust_buffer_access_behavior = EXT_FLAG.nativeClassGLES("KHR_robust_buffer_access_behavior", postfix = KHR)
val KHR_texture_compression_astc_sliced_3d = EXT_FLAG.nativeClassGLES("KHR_texture_compression_astc_sliced_3d", postfix = KHR)

val MESA_tile_raster_order = EXT_FLAG.nativeClassGLES("MESA_tile_raster_order", postfix = MESA)

val NV_compute_shader_derivatives = EXT_FLAG.nativeClassGLES("NV_compute_shader_derivatives", postfix = NV)
val NV_explicit_attrib_location = EXT_FLAG.nativeClassGLES("NV_explicit_attrib_location", postfix = NV)
val NV_fragment_shader_barycentric = EXT_FLAG.nativeClassGLES("NV_fragment_shader_barycentric", postfix = NV)
val NV_fragment_shader_interlock = EXT_FLAG.nativeClassGLES("NV_fragment_shader_interlock", postfix = NV)
val NV_generate_mipmap_sRGB = EXT_FLAG.nativeClassGLES("NV_generate_mipmap_sRGB", postfix = NV)
val NV_geometry_shader_passthrough = EXT_FLAG.nativeClassGLES("NV_geometry_shader_passthrough", postfix = NV)
val NV_image_formats = EXT_FLAG.nativeClassGLES("NV_image_formats", postfix = NV)
val NV_sample_mask_override_coverage = EXT_FLAG.nativeClassGLES("NV_sample_mask_override_coverage", postfix = NV)
val NV_shader_atomic_fp16_vector = EXT_FLAG.nativeClassGLES("NV_shader_atomic_fp16_vector", postfix = NV)
val NV_shader_noperspective_interpolation = EXT_FLAG.nativeClassGLES("NV_shader_noperspective_interpolation", postfix = NV)
val NV_shader_texture_footprint = EXT_FLAG.nativeClassGLES("NV_shader_texture_footprint", postfix = NV)
val NV_stereo_view_rendering = EXT_FLAG.nativeClassGLES("NV_stereo_view_rendering", postfix = NV)
val NV_texture_compression_s3tc_update = EXT_FLAG.nativeClassGLES("NV_texture_compression_s3tc_update", postfix = NV)
val NV_texture_npot_2D_mipmap = EXT_FLAG.nativeClassGLES("NV_texture_npot_2D_mipmap", postfix = NV)
val NV_viewport_array2 = EXT_FLAG.nativeClassGLES("NV_viewport_array2", postfix = NV)
val NVX_blend_equation_advanced_multi_draw_buffers = EXT_FLAG.nativeClassGLES("NVX_blend_equation_advanced_multi_draw_buffers", postfix = NVX)

val OES_depth_texture = EXT_FLAG.nativeClassGLES("OES_depth_texture", postfix = OES)
val OES_EGL_image_external_essl3 = EXT_FLAG.nativeClassGLES("OES_EGL_image_external_essl3", postfix = OES)
val OES_element_index_uint = EXT_FLAG.nativeClassGLES("OES_element_index_uint", postfix = OES)
val OES_fbo_render_mipmap = EXT_FLAG.nativeClassGLES("OES_fbo_render_mipmap", postfix = OES)
val OES_gpu_shader5 = EXT_FLAG.nativeClassGLES("OES_gpu_shader5", postfix = OES)
val OES_sample_variables = EXT_FLAG.nativeClassGLES("OES_sample_variables", postfix = OES)
val OES_shader_image_atomic = EXT_FLAG.nativeClassGLES("OES_shader_image_atomic", postfix = OES)
val OES_shader_io_blocks = EXT_FLAG.nativeClassGLES("OES_shader_io_blocks", postfix = OES)
val OES_texture_float_linear = EXT_FLAG.nativeClassGLES("OES_texture_float_linear", postfix = OES)
val OES_texture_half_float_linear = EXT_FLAG.nativeClassGLES("OES_texture_half_float_linear", postfix = OES)
val OES_texture_npot = EXT_FLAG.nativeClassGLES("OES_texture_npot", postfix = OES)
val OES_texture_stencil8 = EXT_FLAG.nativeClassGLES("OES_texture_stencil8", postfix = OES)

val OVR_multiview2 = EXT_FLAG.nativeClassGLES("OVR_multiview2", postfix = OVR)

val QCOM_render_sRGB_R8_RG8 = EXT_FLAG.nativeClassGLES("QCOM_render_sRGB_R8_RG8", postfix = QCOM)
val QCOM_shader_framebuffer_fetch_rate = EXT_FLAG.nativeClassGLES("QCOM_shader_framebuffer_fetch_rate", postfix = QCOM)
val QCOM_YUV_texture_gather = EXT_FLAG.nativeClassGLES("QCOM_YUV_texture_gather", postfix = QCOM)