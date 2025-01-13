/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

const val ARB = "ARB"
const val EXT = "EXT"
const val KHR = "KHR"

const val `3DFX` = "3DFX"

const val AMD = "AMD"
const val ATI = "ATI"

const val GREMEDY = "GREMEDY"

const val INTEL = "INTEL"

const val MESA = "MESA"

const val NV = "NV"
const val NVX = "NVX"

const val OVR = "OVR"

const val S3TC = "S3TC"

const val SGI = "SGI"
const val SGIX = "SGIX"

private val NativeClass.cap: String get() = "{@link \\#$capName $templateName}"

val ARB_arrays_of_arrays = EXT_FLAG.nativeClassGL("ARB_arrays_of_arrays", postfix = ARB)
val ARB_compatibility = EXT_FLAG.nativeClassGL("ARB_compatibility", postfix = ARB)
val ARB_conservative_depth = EXT_FLAG.nativeClassGL("ARB_conservative_depth", postfix = ARB)
val ARB_derivative_control = EXT_FLAG.nativeClassGL("ARB_derivative_control", postfix = ARB)
val ARB_explicit_attrib_location = EXT_FLAG.nativeClassGL("ARB_explicit_attrib_location", postfix = ARB)
val ARB_fragment_coord_conventions = EXT_FLAG.nativeClassGL("ARB_fragment_coord_conventions", postfix = ARB)
val ARB_fragment_layer_viewport = EXT_FLAG.nativeClassGL("ARB_fragment_layer_viewport", postfix = ARB)
val ARB_fragment_program_shadow = EXT_FLAG.nativeClassGL("ARB_fragment_program_shadow", postfix = ARB)
val ARB_fragment_shader_interlock = EXT_FLAG.nativeClassGL("ARB_fragment_shader_interlock", postfix = ARB) 
val ARB_post_depth_coverage = EXT_FLAG.nativeClassGL("ARB_post_depth_coverage", postfix = ARB) 
val ARB_robust_buffer_access_behavior = EXT_FLAG.nativeClassGL("ARB_robust_buffer_access_behavior", postfix = ARB)
val ARB_robustness_application_isolation = EXT_FLAG.nativeClassGL("ARB_robustness_application_isolation", postfix = ARB) 
val ARB_robustness_share_group_isolation = EXT_FLAG.nativeClassGL("ARB_robustness_share_group_isolation", postfix = ARB) 
val ARB_shader_atomic_counter_ops = EXT_FLAG.nativeClassGL("ARB_shader_atomic_counter_ops", postfix = ARB) 
val ARB_shader_ballot = EXT_FLAG.nativeClassGL("ARB_shader_ballot", postfix = ARB)
val ARB_shader_bit_encoding = EXT_FLAG.nativeClassGL("ARB_shader_bit_encoding", postfix = ARB)
val ARB_shader_clock = EXT_FLAG.nativeClassGL("ARB_shader_clock", postfix = ARB)
val ARB_shader_draw_parameters = EXT_FLAG.nativeClassGL("ARB_shader_draw_parameters", postfix = ARB)
val ARB_shader_group_vote = EXT_FLAG.nativeClassGL("ARB_shader_group_vote", postfix = ARB) 
val ARB_shader_image_size = EXT_FLAG.nativeClassGL("ARB_shader_image_size", postfix = ARB)
val ARB_shader_precision = EXT_FLAG.nativeClassGL("ARB_shader_precision", postfix = ARB)
val ARB_shader_stencil_export = EXT_FLAG.nativeClassGL("ARB_shader_stencil_export", postfix = ARB)
val ARB_shader_texture_image_samples = EXT_FLAG.nativeClassGL("ARB_shader_texture_image_samples", postfix = ARB)
val ARB_shader_texture_lod = EXT_FLAG.nativeClassGL("ARB_shader_texture_lod", postfix = ARB) 
val ARB_shader_viewport_layer_array = EXT_FLAG.nativeClassGL("ARB_shader_viewport_layer_array", postfix = ARB)
val ARB_shading_language_420pack = EXT_FLAG.nativeClassGL("ARB_shading_language_420pack", postfix = ARB) 
val ARB_shading_language_packing = EXT_FLAG.nativeClassGL("ARB_shading_language_packing", postfix = ARB)
val ARB_sparse_texture2 = EXT_FLAG.nativeClassGL("ARB_sparse_texture2", postfix = ARB)
val ARB_sparse_texture_clamp = EXT_FLAG.nativeClassGL("ARB_sparse_texture_clamp", postfix = ARB)
val ARB_texture_buffer_object_rgb32 = EXT_FLAG.nativeClassGL("ARB_texture_buffer_object_rgb32", postfix = ARB)
val ARB_texture_env_add = EXT_FLAG.nativeClassGL("ARB_texture_env_add", postfix = ARB)
val ARB_texture_env_crossbar = EXT_FLAG.nativeClassGL("ARB_texture_env_crossbar", postfix = ARB)
val ARB_texture_non_power_of_two = EXT_FLAG.nativeClassGL("ARB_texture_non_power_of_two", postfix = ARB)
val ARB_texture_query_levels = EXT_FLAG.nativeClassGL("ARB_texture_query_levels", postfix = ARB)
val ARB_texture_query_lod = EXT_FLAG.nativeClassGL("ARB_texture_query_lod", postfix = ARB)
val ARB_texture_stencil8 = EXT_FLAG.nativeClassGL("ARB_texture_stencil8")
val ARB_vertex_type_10f_11f_11f_rev = EXT_FLAG.nativeClassGL("ARB_vertex_type_10f_11f_11f_rev")

val EXT_EGL_sync = EXT_FLAG.nativeClassGL("EXT_EGL_sync", postfix = EXT)
val EXT_multiview_timer_query = EXT_FLAG.nativeClassGL("EXT_multiview_timer_query", postfix = EXT)
val EXT_multiview_texture_multisample = EXT_FLAG.nativeClassGL("EXT_multiview_texture_multisample", postfix = EXT)
val EXT_multiview_tessellation_geometry_shader = EXT_FLAG.nativeClassGL("EXT_multiview_tessellation_geometry_shader", postfix = EXT)
val EXT_post_depth_coverage = EXT_FLAG.nativeClassGL("EXT_post_depth_coverage", postfix = EXT)
val EXT_shader_image_load_formatted = EXT_FLAG.nativeClassGL("EXT_shader_image_load_formatted", postfix = EXT)
val EXT_shader_integer_mix = EXT_FLAG.nativeClassGL("EXT_shader_integer_mix", postfix = EXT)
val EXT_shader_samples_identical = EXT_FLAG.nativeClassGL("EXT_shader_samples_identical", postfix = EXT)
val EXT_shadow_funcs = EXT_FLAG.nativeClassGL("EXT_shadow_funcs", postfix = EXT)
val EXT_sparse_texture2 = EXT_FLAG.nativeClassGL("EXT_sparse_texture2", postfix = EXT)
val EXT_texture_shadow_lod = EXT_FLAG.nativeClassGL("EXT_texture_shadow_lod", postfix = EXT)
val EXT_vertex_array_bgra = EXT_FLAG.nativeClassGL("EXT_vertex_array_bgra", postfix = EXT)

val AMD_conservative_depth = EXT_FLAG.nativeClassGL("AMD_conservative_depth", postfix = AMD)
val AMD_gcn_shader = EXT_FLAG.nativeClassGL("AMD_gcn_shader", postfix = AMD)
val AMD_gpu_shader_int16 = EXT_FLAG.nativeClassGL("AMD_gpu_shader_int16", postfix = AMD) 
val AMD_shader_atomic_counter_ops = EXT_FLAG.nativeClassGL("AMD_shader_atomic_counter_ops", postfix = AMD)
val AMD_shader_ballot = EXT_FLAG.nativeClassGL("AMD_shader_ballot", postfix = AMD)
val AMD_shader_explicit_vertex_parameter = EXT_FLAG.nativeClassGL("AMD_shader_explicit_vertex_parameter", postfix = AMD)
val AMD_shader_image_load_store_lod = EXT_FLAG.nativeClassGL("AMD_shader_image_load_store_lod", postfix = AMD)
val AMD_shader_stencil_export = EXT_FLAG.nativeClassGL("AMD_shader_stencil_export", postfix = AMD)
val AMD_shader_trinary_minmax = EXT_FLAG.nativeClassGL("AMD_shader_trinary_minmax", postfix = AMD)
val AMD_texture_gather_bias_lod = EXT_FLAG.nativeClassGL("AMD_texture_gather_bias_lod", postfix = AMD)
val AMD_texture_texture4 = EXT_FLAG.nativeClassGL("AMD_texture_texture4", postfix = AMD)
val AMD_transform_feedback3_lines_triangles = EXT_FLAG.nativeClassGL("AMD_transform_feedback3_lines_triangles", postfix = AMD)
val AMD_vertex_shader_layer = EXT_FLAG.nativeClassGL("AMD_vertex_shader_layer", postfix = AMD)
val AMD_vertex_shader_viewport_index = EXT_FLAG.nativeClassGL("AMD_vertex_shader_viewport_index", postfix = AMD)

val ATI_shader_texture_lod = EXT_FLAG.nativeClassGL("ATI_shader_texture_lod", postfix = ATI)

val INTEL_fragment_shader_ordering = EXT_FLAG.nativeClassGL("INTEL_fragment_shader_ordering", postfix = INTEL)
val INTEL_shader_integer_functions2 = EXT_FLAG.nativeClassGL("INTEL_shader_integer_functions2", postfix = INTEL)

val KHR_robust_buffer_access_behavior = EXT_FLAG.nativeClassGL("KHR_robust_buffer_access_behavior", postfix = KHR)
val KHR_texture_compression_astc_hdr = EXT_FLAG.nativeClassGL("KHR_texture_compression_astc_hdr", postfix = KHR)
val KHR_texture_compression_astc_sliced_3d = EXT_FLAG.nativeClassGL("KHR_texture_compression_astc_sliced_3d", postfix = KHR)

val MESA_tile_raster_order = EXT_FLAG.nativeClassGL("MESA_tile_raster_order", postfix = MESA)

val NV_blend_square = EXT_FLAG.nativeClassGL("NV_blend_square", postfix = NV)
val NV_compute_shader_derivatives = EXT_FLAG.nativeClassGL("NV_compute_shader_derivatives", postfix = NV)
val NV_conservative_raster_underestimation = EXT_FLAG.nativeClassGL("NV_conservative_raster_underestimation", postfix = NV)
val NV_ES3_1_compatibility = EXT_FLAG.nativeClassGL("NV_ES3_1_compatibility", postfix = NV)
val NV_fragment_program4 = EXT_FLAG.nativeClassGL("NV_fragment_program4", postfix = NV)
val NV_fragment_program_option = EXT_FLAG.nativeClassGL("NV_fragment_program_option", postfix = NV)
val NV_fragment_shader_barycentric = EXT_FLAG.nativeClassGL("NV_fragment_shader_barycentric", postfix = NV)
val NV_fragment_shader_interlock = EXT_FLAG.nativeClassGL("NV_fragment_shader_interlock", postfix = NV)
val NV_geometry_shader4 = EXT_FLAG.nativeClassGL("NV_geometry_shader4", postfix = NV)
val NV_geometry_shader_passthrough = EXT_FLAG.nativeClassGL("NV_geometry_shader_passthrough", postfix = NV)
val NV_sample_mask_override_coverage = EXT_FLAG.nativeClassGL("NV_sample_mask_override_coverage", postfix = NV)
val NV_shader_atomic_float = EXT_FLAG.nativeClassGL("NV_shader_atomic_float", postfix = NV)
val NV_shader_atomic_float64 = EXT_FLAG.nativeClassGL("NV_shader_atomic_float64", postfix = NV)
val NV_shader_atomic_fp16_vector = EXT_FLAG.nativeClassGL("NV_shader_atomic_fp16_vector", postfix = NV)
val NV_shader_atomic_int64 = EXT_FLAG.nativeClassGL("NV_shader_atomic_int64", postfix = NV)
val NV_shader_texture_footprint = EXT_FLAG.nativeClassGL("NV_shader_texture_footprint", postfix = NV)
val NV_shader_thread_shuffle = EXT_FLAG.nativeClassGL("NV_shader_thread_shuffle", postfix = NV)
val NV_stereo_view_rendering = EXT_FLAG.nativeClassGL("NV_stereo_view_rendering", postfix = NV)
val NV_texture_compression_vtc = EXT_FLAG.nativeClassGL("NV_texture_compression_vtc", postfix = NV)
val NV_texture_rectangle_compressed = EXT_FLAG.nativeClassGL("NV_texture_rectangle_compressed", postfix = NV)
val NV_uniform_buffer_std430_layout = EXT_FLAG.nativeClassGL("NV_uniform_buffer_std430_layout", postfix = NV)
val NV_viewport_array2 = EXT_FLAG.nativeClassGL("NV_viewport_array2", postfix = NV)
val NVX_blend_equation_advanced_multi_draw_buffers = EXT_FLAG.nativeClassGL("NVX_blend_equation_advanced_multi_draw_buffers", postfix = NVX)

val OVR_multiview2 = EXT_FLAG.nativeClassGL("OVR_multiview2", postfix = OVR)

// Platform-specific

val GLX_EXT_get_drawable_type = EXT_FLAG.nativeClassGLX("GLX_EXT_get_drawable_type", EXT)
val GLX_EXT_no_config_context = EXT_FLAG.nativeClassGLX("GLX_EXT_no_config_context", postfix = EXT)

val WGL_EXT_swap_control_tear = EXT_FLAG.nativeClassWGL("WGL_EXT_swap_control_tear", postfix = EXT)
val WGL_NV_DX_interop2 = EXT_FLAG.nativeClassWGL("WGL_NV_DX_interop2", postfix = NV)