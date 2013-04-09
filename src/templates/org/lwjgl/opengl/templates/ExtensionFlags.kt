/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB = "ARB"
val EXT = "EXT"

val AMD = "AMD"
val ATI = "ATI"

val INTEL = "INTEL"

val NV = "NV"

val SGI = "SGI"
val SGIX = "SGIX"

fun ARB_arrays_of_arrays() = EXT_FLAG.nativeClassGL("ARB_arrays_of_arrays", ARB)
fun ARB_compatibility() = EXT_FLAG.nativeClassGL("ARB_compatibility", ARB)
fun ARB_conservative_depth() = EXT_FLAG.nativeClassGL("ARB_conservative_depth", ARB)
fun ARB_explicit_attrib_location() = EXT_FLAG.nativeClassGL("ARB_explicit_attrib_location", ARB)
fun ARB_fragment_coord_conventions() = EXT_FLAG.nativeClassGL("ARB_fragment_coord_conventions", ARB)
fun ARB_fragment_layer_viewport() = EXT_FLAG.nativeClassGL("ARB_fragment_layer_viewport", ARB)
fun ARB_fragment_program_shadow() = EXT_FLAG.nativeClassGL("ARB_fragment_program_shadow", ARB)
fun ARB_robust_buffer_access_behavior() = EXT_FLAG.nativeClassGL("ARB_robust_buffer_access_behavior", ARB)
fun ARB_robustness_isolation() = EXT_FLAG.nativeClassGL("ARB_robustness_isolation", ARB)
fun ARB_shader_bit_encoding() = EXT_FLAG.nativeClassGL("ARB_shader_bit_encoding", ARB)
fun ARB_shader_image_size() = EXT_FLAG.nativeClassGL("ARB_shader_image_size", ARB)
fun ARB_shader_precision() = EXT_FLAG.nativeClassGL("ARB_shader_precision", ARB)
fun ARB_shader_stencil_export() = EXT_FLAG.nativeClassGL("ARB_shader_stencil_export", ARB)
fun ARB_shader_texture_lod() = EXT_FLAG.nativeClassGL("ARB_shader_texture_lod", ARB)
fun ARB_shading_language_420pack() = EXT_FLAG.nativeClassGL("ARB_shading_language_420pack", ARB)
fun ARB_shading_language_packing() = EXT_FLAG.nativeClassGL("ARB_shading_language_packing", ARB)
fun ARB_texture_buffer_object_rgb32() = EXT_FLAG.nativeClassGL("ARB_texture_buffer_object_rgb32", ARB)
fun ARB_texture_env_add() = EXT_FLAG.nativeClassGL("ARB_texture_env_add", ARB)
fun ARB_texture_env_crossbar() = EXT_FLAG.nativeClassGL("ARB_texture_env_crossbar", ARB)
fun ARB_texture_non_power_of_two() = EXT_FLAG.nativeClassGL("ARB_texture_non_power_of_two", ARB)
fun ARB_texture_query_levels() = EXT_FLAG.nativeClassGL("ARB_texture_query_levels", ARB)
fun ARB_texture_query_lod() = EXT_FLAG.nativeClassGL("ARB_texture_query_lod", ARB)

fun EXT_shadow_funcs() = EXT_FLAG.nativeClassGL("EXT_shadow_funcs", EXT)

fun AMD_conservative_depth() = EXT_FLAG.nativeClassGL("AMD_conservative_depth", AMD)
fun AMD_shader_stencil_export() = EXT_FLAG.nativeClassGL("AMD_shader_stencil_export", AMD)
fun AMD_shader_trinary_minmax() = EXT_FLAG.nativeClassGL("AMD_shader_trinary_minmax", AMD)
fun AMD_texture_texture4() = EXT_FLAG.nativeClassGL("AMD_texture_texture4", AMD)
fun AMD_transform_feedback3_lines_triangles() = "AMDTransformFeedback3LinesTriangles".nativeClassGL("AMD_transform_feedback3_lines_triangles", AMD)
fun AMD_vertex_shader_layer() = EXT_FLAG.nativeClassGL("AMD_vertex_shader_layer", AMD)
fun AMD_vertex_shader_viewport_index() = EXT_FLAG.nativeClassGL("AMD_vertex_shader_viewport_index", AMD)

fun ATI_shader_texture_lod() = EXT_FLAG.nativeClassGL("ATI_shader_texture_lod", ATI)

fun NV_blend_square() = EXT_FLAG.nativeClassGL("NV_blend_square", NV)
fun NV_fragment_program4() = EXT_FLAG.nativeClassGL("NV_fragment_program4", NV)
fun NV_fragment_program_option() = EXT_FLAG.nativeClassGL("NV_fragment_program_option", NV)
fun NV_geometry_shader4() = EXT_FLAG.nativeClassGL("NV_geometry_shader4", NV)
fun NV_parameter_buffer_object2() = EXT_FLAG.nativeClassGL("NV_parameter_buffer_object2", NV)
fun NV_shader_atomic_counters() = EXT_FLAG.nativeClassGL("NV_shader_atomic_counters", NV)
fun NV_shader_atomic_float() = EXT_FLAG.nativeClassGL("NV_shader_atomic_float", NV)
fun NV_shader_storage_buffer_object() = EXT_FLAG.nativeClassGL("NV_shader_storage_buffer_object", NV)
fun NV_vertex_program1_1() = EXT_FLAG.nativeClassGL("NV_vertex_program1_1", NV)
fun NV_vertex_program2() = EXT_FLAG.nativeClassGL("NV_vertex_program2", NV)
fun NV_vertex_program4() = EXT_FLAG.nativeClassGL("NV_vertex_program4", NV)

// Platform-specific

fun WGL_EXT_swap_control_tear() = EXT_FLAG.nativeClassWGL("WGL_EXT_swap_control_tear", EXT)
fun WGL_NV_DX_interop2() = EXT_FLAG.nativeClassWGL("WGL_NV_DX_interop2", NV)

fun GLX_ARB_create_context_profile() = EXT_FLAG.nativeClassGLX("GLX_ARB_create_context_profile", ARB)
fun GLX_ARB_robustness_share_group_isolation() = EXT_FLAG.nativeClassGLX("GLX_ARB_robustness_share_group_isolation", ARB)
fun GLX_EXT_framebuffer_sRGB() = EXT_FLAG.nativeClassGLX("GLX_EXT_framebuffer_sRGB", EXT) // Alias for GLX_ARB_framebuffer_sRGB