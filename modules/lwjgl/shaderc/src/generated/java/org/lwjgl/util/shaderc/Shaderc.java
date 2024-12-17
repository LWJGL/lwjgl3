/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Shaderc {

    private static final SharedLibrary SHADERC = Library.loadNative(Shaderc.class, "org.lwjgl.shaderc", Configuration.SHADERC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc")), true);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            compiler_initialize                                         = apiGetFunctionAddress(SHADERC, "shaderc_compiler_initialize"),
            compiler_release                                            = apiGetFunctionAddress(SHADERC, "shaderc_compiler_release"),
            compile_options_initialize                                  = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_initialize"),
            compile_options_clone                                       = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_clone"),
            compile_options_release                                     = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_release"),
            compile_options_add_macro_definition                        = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_add_macro_definition"),
            compile_options_set_source_language                         = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_source_language"),
            compile_options_set_generate_debug_info                     = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_generate_debug_info"),
            compile_options_set_optimization_level                      = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_optimization_level"),
            compile_options_set_forced_version_profile                  = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_forced_version_profile"),
            compile_options_set_include_callbacks                       = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_include_callbacks"),
            compile_options_set_suppress_warnings                       = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_suppress_warnings"),
            compile_options_set_target_env                              = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_target_env"),
            compile_options_set_target_spirv                            = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_target_spirv"),
            compile_options_set_warnings_as_errors                      = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_warnings_as_errors"),
            compile_options_set_limit                                   = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_limit"),
            compile_options_set_auto_bind_uniforms                      = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_auto_bind_uniforms"),
            compile_options_set_auto_combined_image_sampler             = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_auto_combined_image_sampler"),
            compile_options_set_hlsl_io_mapping                         = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_io_mapping"),
            compile_options_set_hlsl_offsets                            = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_offsets"),
            compile_options_set_binding_base                            = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_binding_base"),
            compile_options_set_binding_base_for_stage                  = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_binding_base_for_stage"),
            compile_options_set_preserve_bindings                       = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_preserve_bindings"),
            compile_options_set_auto_map_locations                      = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_auto_map_locations"),
            compile_options_set_hlsl_register_set_and_binding_for_stage = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage"),
            compile_options_set_hlsl_register_set_and_binding           = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_register_set_and_binding"),
            compile_options_set_hlsl_functionality1                     = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_functionality1"),
            compile_options_set_hlsl_16bit_types                        = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_16bit_types"),
            compile_options_set_vulkan_rules_relaxed                    = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_vulkan_rules_relaxed"),
            compile_options_set_invert_y                                = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_invert_y"),
            compile_options_set_nan_clamp                               = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_nan_clamp"),
            compile_into_spv                                            = apiGetFunctionAddress(SHADERC, "shaderc_compile_into_spv"),
            compile_into_spv_assembly                                   = apiGetFunctionAddress(SHADERC, "shaderc_compile_into_spv_assembly"),
            compile_into_preprocessed_text                              = apiGetFunctionAddress(SHADERC, "shaderc_compile_into_preprocessed_text"),
            assemble_into_spv                                           = apiGetFunctionAddress(SHADERC, "shaderc_assemble_into_spv"),
            result_release                                              = apiGetFunctionAddress(SHADERC, "shaderc_result_release"),
            result_get_length                                           = apiGetFunctionAddress(SHADERC, "shaderc_result_get_length"),
            result_get_num_warnings                                     = apiGetFunctionAddress(SHADERC, "shaderc_result_get_num_warnings"),
            result_get_num_errors                                       = apiGetFunctionAddress(SHADERC, "shaderc_result_get_num_errors"),
            result_get_compilation_status                               = apiGetFunctionAddress(SHADERC, "shaderc_result_get_compilation_status"),
            result_get_bytes                                            = apiGetFunctionAddress(SHADERC, "shaderc_result_get_bytes"),
            result_get_error_message                                    = apiGetFunctionAddress(SHADERC, "shaderc_result_get_error_message"),
            get_spv_version                                             = apiGetFunctionAddress(SHADERC, "shaderc_get_spv_version"),
            parse_version_profile                                       = apiGetFunctionAddress(SHADERC, "shaderc_parse_version_profile");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    public static final int
        shaderc_target_env_vulkan        = 0,
        shaderc_target_env_opengl        = 1,
        shaderc_target_env_opengl_compat = 2,
        shaderc_target_env_webgpu        = 3,
        shaderc_target_env_default       = shaderc_target_env_vulkan;

    public static final int
        shaderc_env_version_vulkan_1_0 = ((1 << 22)),
        shaderc_env_version_vulkan_1_1 = ((1 << 22) | (1 << 12)),
        shaderc_env_version_vulkan_1_2 = ((1 << 22) | (2 << 12)),
        shaderc_env_version_vulkan_1_3 = ((1 << 22) | (3 << 12)),
        shaderc_env_version_vulkan_1_4 = ((1 << 22) | (4 << 12)),
        shaderc_env_version_opengl_4_5 = 450,
        shaderc_env_version_webgpu     = 451;

    public static final int
        shaderc_spirv_version_1_0 = 0x10000,
        shaderc_spirv_version_1_1 = 0x10100,
        shaderc_spirv_version_1_2 = 0x10200,
        shaderc_spirv_version_1_3 = 0x10300,
        shaderc_spirv_version_1_4 = 0x10400,
        shaderc_spirv_version_1_5 = 0x10500,
        shaderc_spirv_version_1_6 = 0x10600;

    public static final int
        shaderc_compilation_status_success              = 0,
        shaderc_compilation_status_invalid_stage        = 1,
        shaderc_compilation_status_compilation_error    = 2,
        shaderc_compilation_status_internal_error       = 3,
        shaderc_compilation_status_null_result_object   = 4,
        shaderc_compilation_status_invalid_assembly     = 5,
        shaderc_compilation_status_validation_error     = 6,
        shaderc_compilation_status_transformation_error = 7,
        shaderc_compilation_status_configuration_error  = 8;

    public static final int
        shaderc_source_language_glsl = 0,
        shaderc_source_language_hlsl = 1;

    public static final int
        shaderc_vertex_shader                       = 0,
        shaderc_fragment_shader                     = 1,
        shaderc_compute_shader                      = 2,
        shaderc_geometry_shader                     = 3,
        shaderc_tess_control_shader                 = 4,
        shaderc_tess_evaluation_shader              = 5,
        shaderc_glsl_vertex_shader                  = shaderc_vertex_shader,
        shaderc_glsl_fragment_shader                = shaderc_fragment_shader,
        shaderc_glsl_compute_shader                 = shaderc_compute_shader,
        shaderc_glsl_geometry_shader                = shaderc_geometry_shader,
        shaderc_glsl_tess_control_shader            = shaderc_tess_control_shader,
        shaderc_glsl_tess_evaluation_shader         = shaderc_tess_evaluation_shader,
        shaderc_glsl_infer_from_source              = 6,
        shaderc_glsl_default_vertex_shader          = 7,
        shaderc_glsl_default_fragment_shader        = 8,
        shaderc_glsl_default_compute_shader         = 9,
        shaderc_glsl_default_geometry_shader        = 10,
        shaderc_glsl_default_tess_control_shader    = 11,
        shaderc_glsl_default_tess_evaluation_shader = 12,
        shaderc_spirv_assembly                      = 13,
        shaderc_raygen_shader                       = 14,
        shaderc_anyhit_shader                       = 15,
        shaderc_closesthit_shader                   = 16,
        shaderc_miss_shader                         = 17,
        shaderc_intersection_shader                 = 18,
        shaderc_callable_shader                     = 19,
        shaderc_glsl_raygen_shader                  = shaderc_raygen_shader,
        shaderc_glsl_anyhit_shader                  = shaderc_anyhit_shader,
        shaderc_glsl_closesthit_shader              = shaderc_closesthit_shader,
        shaderc_glsl_miss_shader                    = shaderc_miss_shader,
        shaderc_glsl_intersection_shader            = shaderc_intersection_shader,
        shaderc_glsl_callable_shader                = shaderc_callable_shader,
        shaderc_glsl_default_raygen_shader          = 20,
        shaderc_glsl_default_anyhit_shader          = 21,
        shaderc_glsl_default_closesthit_shader      = 22,
        shaderc_glsl_default_miss_shader            = 23,
        shaderc_glsl_default_intersection_shader    = 24,
        shaderc_glsl_default_callable_shader        = 25,
        shaderc_task_shader                         = 26,
        shaderc_mesh_shader                         = 27,
        shaderc_glsl_task_shader                    = shaderc_task_shader,
        shaderc_glsl_mesh_shader                    = shaderc_mesh_shader,
        shaderc_glsl_default_task_shader            = 28,
        shaderc_glsl_default_mesh_shader            = 29;

    public static final int
        shaderc_profile_none          = 0,
        shaderc_profile_core          = 1,
        shaderc_profile_compatibility = 2,
        shaderc_profile_es            = 3;

    public static final int
        shaderc_optimization_level_zero        = 0,
        shaderc_optimization_level_size        = 1,
        shaderc_optimization_level_performance = 2;

    public static final int
        shaderc_limit_max_lights                                    = 0,
        shaderc_limit_max_clip_planes                               = 1,
        shaderc_limit_max_texture_units                             = 2,
        shaderc_limit_max_texture_coords                            = 3,
        shaderc_limit_max_vertex_attribs                            = 4,
        shaderc_limit_max_vertex_uniform_components                 = 5,
        shaderc_limit_max_varying_floats                            = 6,
        shaderc_limit_max_vertex_texture_image_units                = 7,
        shaderc_limit_max_combined_texture_image_units              = 8,
        shaderc_limit_max_texture_image_units                       = 9,
        shaderc_limit_max_fragment_uniform_components               = 10,
        shaderc_limit_max_draw_buffers                              = 11,
        shaderc_limit_max_vertex_uniform_vectors                    = 12,
        shaderc_limit_max_varying_vectors                           = 13,
        shaderc_limit_max_fragment_uniform_vectors                  = 14,
        shaderc_limit_max_vertex_output_vectors                     = 15,
        shaderc_limit_max_fragment_input_vectors                    = 16,
        shaderc_limit_min_program_texel_offset                      = 17,
        shaderc_limit_max_program_texel_offset                      = 18,
        shaderc_limit_max_clip_distances                            = 19,
        shaderc_limit_max_compute_work_group_count_x                = 20,
        shaderc_limit_max_compute_work_group_count_y                = 21,
        shaderc_limit_max_compute_work_group_count_z                = 22,
        shaderc_limit_max_compute_work_group_size_x                 = 23,
        shaderc_limit_max_compute_work_group_size_y                 = 24,
        shaderc_limit_max_compute_work_group_size_z                 = 25,
        shaderc_limit_max_compute_uniform_components                = 26,
        shaderc_limit_max_compute_texture_image_units               = 27,
        shaderc_limit_max_compute_image_uniforms                    = 28,
        shaderc_limit_max_compute_atomic_counters                   = 29,
        shaderc_limit_max_compute_atomic_counter_buffers            = 30,
        shaderc_limit_max_varying_components                        = 31,
        shaderc_limit_max_vertex_output_components                  = 32,
        shaderc_limit_max_geometry_input_components                 = 33,
        shaderc_limit_max_geometry_output_components                = 34,
        shaderc_limit_max_fragment_input_components                 = 35,
        shaderc_limit_max_image_units                               = 36,
        shaderc_limit_max_combined_image_units_and_fragment_outputs = 37,
        shaderc_limit_max_combined_shader_output_resources          = 38,
        shaderc_limit_max_image_samples                             = 39,
        shaderc_limit_max_vertex_image_uniforms                     = 40,
        shaderc_limit_max_tess_control_image_uniforms               = 41,
        shaderc_limit_max_tess_evaluation_image_uniforms            = 42,
        shaderc_limit_max_geometry_image_uniforms                   = 43,
        shaderc_limit_max_fragment_image_uniforms                   = 44,
        shaderc_limit_max_combined_image_uniforms                   = 45,
        shaderc_limit_max_geometry_texture_image_units              = 46,
        shaderc_limit_max_geometry_output_vertices                  = 47,
        shaderc_limit_max_geometry_total_output_components          = 48,
        shaderc_limit_max_geometry_uniform_components               = 49,
        shaderc_limit_max_geometry_varying_components               = 50,
        shaderc_limit_max_tess_control_input_components             = 51,
        shaderc_limit_max_tess_control_output_components            = 52,
        shaderc_limit_max_tess_control_texture_image_units          = 53,
        shaderc_limit_max_tess_control_uniform_components           = 54,
        shaderc_limit_max_tess_control_total_output_components      = 55,
        shaderc_limit_max_tess_evaluation_input_components          = 56,
        shaderc_limit_max_tess_evaluation_output_components         = 57,
        shaderc_limit_max_tess_evaluation_texture_image_units       = 58,
        shaderc_limit_max_tess_evaluation_uniform_components        = 59,
        shaderc_limit_max_tess_patch_components                     = 60,
        shaderc_limit_max_patch_vertices                            = 61,
        shaderc_limit_max_tess_gen_level                            = 62,
        shaderc_limit_max_viewports                                 = 63,
        shaderc_limit_max_vertex_atomic_counters                    = 64,
        shaderc_limit_max_tess_control_atomic_counters              = 65,
        shaderc_limit_max_tess_evaluation_atomic_counters           = 66,
        shaderc_limit_max_geometry_atomic_counters                  = 67,
        shaderc_limit_max_fragment_atomic_counters                  = 68,
        shaderc_limit_max_combined_atomic_counters                  = 69,
        shaderc_limit_max_atomic_counter_bindings                   = 70,
        shaderc_limit_max_vertex_atomic_counter_buffers             = 71,
        shaderc_limit_max_tess_control_atomic_counter_buffers       = 72,
        shaderc_limit_max_tess_evaluation_atomic_counter_buffers    = 73,
        shaderc_limit_max_geometry_atomic_counter_buffers           = 74,
        shaderc_limit_max_fragment_atomic_counter_buffers           = 75,
        shaderc_limit_max_combined_atomic_counter_buffers           = 76,
        shaderc_limit_max_atomic_counter_buffer_size                = 77,
        shaderc_limit_max_transform_feedback_buffers                = 78,
        shaderc_limit_max_transform_feedback_interleaved_components = 79,
        shaderc_limit_max_cull_distances                            = 80,
        shaderc_limit_max_combined_clip_and_cull_distances          = 81,
        shaderc_limit_max_samples                                   = 82,
        shaderc_limit_max_mesh_output_vertices_nv                   = 83,
        shaderc_limit_max_mesh_output_primitives_nv                 = 84,
        shaderc_limit_max_mesh_work_group_size_x_nv                 = 85,
        shaderc_limit_max_mesh_work_group_size_y_nv                 = 86,
        shaderc_limit_max_mesh_work_group_size_z_nv                 = 87,
        shaderc_limit_max_task_work_group_size_x_nv                 = 88,
        shaderc_limit_max_task_work_group_size_y_nv                 = 89,
        shaderc_limit_max_task_work_group_size_z_nv                 = 90,
        shaderc_limit_max_mesh_view_count_nv                        = 91,
        shaderc_limit_max_mesh_output_vertices_ext                  = 92,
        shaderc_limit_max_mesh_output_primitives_ext                = 93,
        shaderc_limit_max_mesh_work_group_size_x_ext                = 94,
        shaderc_limit_max_mesh_work_group_size_y_ext                = 95,
        shaderc_limit_max_mesh_work_group_size_z_ext                = 96,
        shaderc_limit_max_task_work_group_size_x_ext                = 97,
        shaderc_limit_max_task_work_group_size_y_ext                = 98,
        shaderc_limit_max_task_work_group_size_z_ext                = 99,
        shaderc_limit_max_mesh_view_count_ext                       = 100,
        shaderc_limit_max_dual_source_draw_buffers_ext              = 101;

    public static final int
        shaderc_uniform_kind_image                 = 0,
        shaderc_uniform_kind_sampler               = 1,
        shaderc_uniform_kind_texture               = 2,
        shaderc_uniform_kind_buffer                = 3,
        shaderc_uniform_kind_storage_buffer        = 4,
        shaderc_uniform_kind_unordered_access_view = 5;

    public static final int
        shaderc_include_type_relative = 0,
        shaderc_include_type_standard = 1;

    protected Shaderc() {
        throw new UnsupportedOperationException();
    }

    // --- [ shaderc_compiler_initialize ] ---

    /** {@code shaderc_compiler_t shaderc_compiler_initialize(void)} */
    @NativeType("shaderc_compiler_t")
    public static long shaderc_compiler_initialize() {
        long __functionAddress = Functions.compiler_initialize;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_compiler_release ] ---

    /** {@code void shaderc_compiler_release(shaderc_compiler_t compiler)} */
    public static void shaderc_compiler_release(@NativeType("shaderc_compiler_t") long compiler) {
        long __functionAddress = Functions.compiler_release;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, __functionAddress);
    }

    // --- [ shaderc_compile_options_initialize ] ---

    /** {@code shaderc_compile_options_t shaderc_compile_options_initialize(void)} */
    @NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_initialize() {
        long __functionAddress = Functions.compile_options_initialize;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_compile_options_clone ] ---

    /** {@code shaderc_compile_options_t shaderc_compile_options_clone(shaderc_compile_options_t const options)} */
    @NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_clone(@NativeType("shaderc_compile_options_t const") long options) {
        long __functionAddress = Functions.compile_options_clone;
        return invokePP(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_release ] ---

    /** {@code void shaderc_compile_options_release(shaderc_compile_options_t options)} */
    public static void shaderc_compile_options_release(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_release;
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_add_macro_definition ] ---

    /** {@code void shaderc_compile_options_add_macro_definition(shaderc_compile_options_t options, char const * name, size_t name_length, char const * value, size_t value_length)} */
    public static void nshaderc_compile_options_add_macro_definition(long options, long name, long name_length, long value, long value_length) {
        long __functionAddress = Functions.compile_options_add_macro_definition;
        if (CHECKS) {
            check(options);
        }
        invokePPPPPV(options, name, name_length, value, value_length, __functionAddress);
    }

    /** {@code void shaderc_compile_options_add_macro_definition(shaderc_compile_options_t options, char const * name, size_t name_length, char const * value, size_t value_length)} */
    public static void shaderc_compile_options_add_macro_definition(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") @Nullable ByteBuffer value) {
        nshaderc_compile_options_add_macro_definition(options, memAddress(name), name.remaining(), memAddressSafe(value), remainingSafe(value));
    }

    /** {@code void shaderc_compile_options_add_macro_definition(shaderc_compile_options_t options, char const * name, size_t name_length, char const * value, size_t value_length)} */
    public static void shaderc_compile_options_add_macro_definition(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") CharSequence name, @NativeType("char const *") @Nullable CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nUTF8(name, false);
            long nameEncoded = stack.getPointerAddress();
            int valueEncodedLength = stack.nUTF8Safe(value, false);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            nshaderc_compile_options_add_macro_definition(options, nameEncoded, nameEncodedLength, valueEncoded, valueEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_compile_options_set_source_language ] ---

    /** {@code void shaderc_compile_options_set_source_language(shaderc_compile_options_t options, shaderc_source_language lang)} */
    public static void shaderc_compile_options_set_source_language(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_source_language") int lang) {
        long __functionAddress = Functions.compile_options_set_source_language;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, lang, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_generate_debug_info ] ---

    /** {@code void shaderc_compile_options_set_generate_debug_info(shaderc_compile_options_t options)} */
    public static void shaderc_compile_options_set_generate_debug_info(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_generate_debug_info;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_optimization_level ] ---

    /** {@code void shaderc_compile_options_set_optimization_level(shaderc_compile_options_t options, shaderc_optimization_level level)} */
    public static void shaderc_compile_options_set_optimization_level(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_optimization_level") int level) {
        long __functionAddress = Functions.compile_options_set_optimization_level;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, level, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_forced_version_profile ] ---

    /** {@code void shaderc_compile_options_set_forced_version_profile(shaderc_compile_options_t options, int version, shaderc_profile profile)} */
    public static void shaderc_compile_options_set_forced_version_profile(@NativeType("shaderc_compile_options_t") long options, int version, @NativeType("shaderc_profile") int profile) {
        long __functionAddress = Functions.compile_options_set_forced_version_profile;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, profile, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_include_callbacks ] ---

    /** {@code void shaderc_compile_options_set_include_callbacks(shaderc_compile_options_t options, shaderc_include_resolve_fn resolver, shaderc_include_result_release_fn result_releaser, void * user_data)} */
    public static void nshaderc_compile_options_set_include_callbacks(long options, long resolver, long result_releaser, long user_data) {
        long __functionAddress = Functions.compile_options_set_include_callbacks;
        if (CHECKS) {
            check(options);
        }
        invokePPPPV(options, resolver, result_releaser, user_data, __functionAddress);
    }

    /** {@code void shaderc_compile_options_set_include_callbacks(shaderc_compile_options_t options, shaderc_include_resolve_fn resolver, shaderc_include_result_release_fn result_releaser, void * user_data)} */
    public static void shaderc_compile_options_set_include_callbacks(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_include_resolve_fn") @Nullable ShadercIncludeResolveI resolver, @NativeType("shaderc_include_result_release_fn") @Nullable ShadercIncludeResultReleaseI result_releaser, @NativeType("void *") long user_data) {
        nshaderc_compile_options_set_include_callbacks(options, memAddressSafe(resolver), memAddressSafe(result_releaser), user_data);
    }

    // --- [ shaderc_compile_options_set_suppress_warnings ] ---

    /** {@code void shaderc_compile_options_set_suppress_warnings(shaderc_compile_options_t options)} */
    public static void shaderc_compile_options_set_suppress_warnings(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_suppress_warnings;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_target_env ] ---

    /** {@code void shaderc_compile_options_set_target_env(shaderc_compile_options_t options, shaderc_target_env target, uint32_t version)} */
    public static void shaderc_compile_options_set_target_env(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_target_env") int target, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_target_env;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, target, version, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_target_spirv ] ---

    /** {@code void shaderc_compile_options_set_target_spirv(shaderc_compile_options_t options, shaderc_spirv_version version)} */
    public static void shaderc_compile_options_set_target_spirv(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_spirv_version") int version) {
        long __functionAddress = Functions.compile_options_set_target_spirv;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_warnings_as_errors ] ---

    /** {@code void shaderc_compile_options_set_warnings_as_errors(shaderc_compile_options_t options)} */
    public static void shaderc_compile_options_set_warnings_as_errors(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_warnings_as_errors;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_limit ] ---

    /** {@code void shaderc_compile_options_set_limit(shaderc_compile_options_t options, shaderc_limit limit, int value)} */
    public static void shaderc_compile_options_set_limit(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_limit") int limit, int value) {
        long __functionAddress = Functions.compile_options_set_limit;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, limit, value, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_auto_bind_uniforms ] ---

    /** {@code void shaderc_compile_options_set_auto_bind_uniforms(shaderc_compile_options_t options, bool auto_bind)} */
    public static void shaderc_compile_options_set_auto_bind_uniforms(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean auto_bind) {
        long __functionAddress = Functions.compile_options_set_auto_bind_uniforms;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, auto_bind, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_auto_combined_image_sampler ] ---

    /** {@code void shaderc_compile_options_set_auto_combined_image_sampler(shaderc_compile_options_t options, bool upgrade)} */
    public static void shaderc_compile_options_set_auto_combined_image_sampler(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean upgrade) {
        long __functionAddress = Functions.compile_options_set_auto_combined_image_sampler;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, upgrade, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_io_mapping ] ---

    /** {@code void shaderc_compile_options_set_hlsl_io_mapping(shaderc_compile_options_t options, bool hlsl_iomap)} */
    public static void shaderc_compile_options_set_hlsl_io_mapping(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean hlsl_iomap) {
        long __functionAddress = Functions.compile_options_set_hlsl_io_mapping;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, hlsl_iomap, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_offsets ] ---

    /** {@code void shaderc_compile_options_set_hlsl_offsets(shaderc_compile_options_t options, bool hlsl_offsets)} */
    public static void shaderc_compile_options_set_hlsl_offsets(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean hlsl_offsets) {
        long __functionAddress = Functions.compile_options_set_hlsl_offsets;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, hlsl_offsets, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_binding_base ] ---

    /** {@code void shaderc_compile_options_set_binding_base(shaderc_compile_options_t options, shaderc_uniform_kind kind, uint32_t base)} */
    public static void shaderc_compile_options_set_binding_base(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_uniform_kind") int kind, @NativeType("uint32_t") int base) {
        long __functionAddress = Functions.compile_options_set_binding_base;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, kind, base, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_binding_base_for_stage ] ---

    /** {@code void shaderc_compile_options_set_binding_base_for_stage(shaderc_compile_options_t options, shaderc_shader_kind shader_kind, shaderc_uniform_kind kind, uint32_t base)} */
    public static void shaderc_compile_options_set_binding_base_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("shaderc_uniform_kind") int kind, @NativeType("uint32_t") int base) {
        long __functionAddress = Functions.compile_options_set_binding_base_for_stage;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, shader_kind, kind, base, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_preserve_bindings ] ---

    /** {@code void shaderc_compile_options_set_preserve_bindings(shaderc_compile_options_t options, bool preserve_bindings)} */
    public static void shaderc_compile_options_set_preserve_bindings(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean preserve_bindings) {
        long __functionAddress = Functions.compile_options_set_preserve_bindings;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, preserve_bindings, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_auto_map_locations ] ---

    /** {@code void shaderc_compile_options_set_auto_map_locations(shaderc_compile_options_t options, bool auto_map)} */
    public static void shaderc_compile_options_set_auto_map_locations(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean auto_map) {
        long __functionAddress = Functions.compile_options_set_auto_map_locations;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, auto_map, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage ] ---

    /** {@code void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(shaderc_compile_options_t options, shaderc_shader_kind shader_kind, char const * reg, char const * set, char const * binding)} */
    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(long options, int shader_kind, long reg, long set, long binding) {
        long __functionAddress = Functions.compile_options_set_hlsl_register_set_and_binding_for_stage;
        if (CHECKS) {
            check(options);
        }
        invokePPPPV(options, shader_kind, reg, set, binding, __functionAddress);
    }

    /** {@code void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(shaderc_compile_options_t options, shaderc_shader_kind shader_kind, char const * reg, char const * set, char const * binding)} */
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer reg, @NativeType("char const *") ByteBuffer set, @NativeType("char const *") ByteBuffer binding) {
        if (CHECKS) {
            checkNT1(reg);
            checkNT1(set);
            checkNT1(binding);
        }
        nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(options, shader_kind, memAddress(reg), memAddress(set), memAddress(binding));
    }

    /** {@code void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(shaderc_compile_options_t options, shaderc_shader_kind shader_kind, char const * reg, char const * set, char const * binding)} */
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence reg, @NativeType("char const *") CharSequence set, @NativeType("char const *") CharSequence binding) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(reg, true);
            long regEncoded = stack.getPointerAddress();
            stack.nUTF8(set, true);
            long setEncoded = stack.getPointerAddress();
            stack.nUTF8(binding, true);
            long bindingEncoded = stack.getPointerAddress();
            nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(options, shader_kind, regEncoded, setEncoded, bindingEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_compile_options_set_hlsl_register_set_and_binding ] ---

    /** {@code void shaderc_compile_options_set_hlsl_register_set_and_binding(shaderc_compile_options_t options, char const * reg, char const * set, char const * binding)} */
    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding(long options, long reg, long set, long binding) {
        long __functionAddress = Functions.compile_options_set_hlsl_register_set_and_binding;
        if (CHECKS) {
            check(options);
        }
        invokePPPPV(options, reg, set, binding, __functionAddress);
    }

    /** {@code void shaderc_compile_options_set_hlsl_register_set_and_binding(shaderc_compile_options_t options, char const * reg, char const * set, char const * binding)} */
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") ByteBuffer reg, @NativeType("char const *") ByteBuffer set, @NativeType("char const *") ByteBuffer binding) {
        if (CHECKS) {
            checkNT1(reg);
            checkNT1(set);
            checkNT1(binding);
        }
        nshaderc_compile_options_set_hlsl_register_set_and_binding(options, memAddress(reg), memAddress(set), memAddress(binding));
    }

    /** {@code void shaderc_compile_options_set_hlsl_register_set_and_binding(shaderc_compile_options_t options, char const * reg, char const * set, char const * binding)} */
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") CharSequence reg, @NativeType("char const *") CharSequence set, @NativeType("char const *") CharSequence binding) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(reg, true);
            long regEncoded = stack.getPointerAddress();
            stack.nUTF8(set, true);
            long setEncoded = stack.getPointerAddress();
            stack.nUTF8(binding, true);
            long bindingEncoded = stack.getPointerAddress();
            nshaderc_compile_options_set_hlsl_register_set_and_binding(options, regEncoded, setEncoded, bindingEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_compile_options_set_hlsl_functionality1 ] ---

    /** {@code void shaderc_compile_options_set_hlsl_functionality1(shaderc_compile_options_t options, bool enable)} */
    public static void shaderc_compile_options_set_hlsl_functionality1(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_hlsl_functionality1;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_16bit_types ] ---

    /** {@code void shaderc_compile_options_set_hlsl_16bit_types(shaderc_compile_options_t options, bool enable)} */
    public static void shaderc_compile_options_set_hlsl_16bit_types(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_hlsl_16bit_types;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_vulkan_rules_relaxed ] ---

    /** {@code void shaderc_compile_options_set_vulkan_rules_relaxed(shaderc_compile_options_t options, bool enable)} */
    public static void shaderc_compile_options_set_vulkan_rules_relaxed(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_vulkan_rules_relaxed;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_invert_y ] ---

    /** {@code void shaderc_compile_options_set_invert_y(shaderc_compile_options_t options, bool enable)} */
    public static void shaderc_compile_options_set_invert_y(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_invert_y;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_nan_clamp ] ---

    /** {@code void shaderc_compile_options_set_nan_clamp(shaderc_compile_options_t options, bool enable)} */
    public static void shaderc_compile_options_set_nan_clamp(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_nan_clamp;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_into_spv ] ---

    /** {@code shaderc_compilation_result_t shaderc_compile_into_spv(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    public static long nshaderc_compile_into_spv(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_spv;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    /** {@code shaderc_compilation_result_t shaderc_compile_into_spv(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (CHECKS) {
            checkNT1(input_file_name);
            checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_spv(compiler, memAddress(source_text), source_text.remaining(), shader_kind, memAddress(input_file_name), memAddress(entry_point_name), additional_options);
    }

    /** {@code shaderc_compilation_result_t shaderc_compile_into_spv(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence input_file_name, @NativeType("char const *") CharSequence entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int source_textEncodedLength = stack.nUTF8(source_text, false);
            long source_textEncoded = stack.getPointerAddress();
            stack.nUTF8(input_file_name, true);
            long input_file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(entry_point_name, true);
            long entry_point_nameEncoded = stack.getPointerAddress();
            return nshaderc_compile_into_spv(compiler, source_textEncoded, source_textEncodedLength, shader_kind, input_file_nameEncoded, entry_point_nameEncoded, additional_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_compile_into_spv_assembly ] ---

    /** {@code shaderc_compilation_result_t shaderc_compile_into_spv_assembly(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    public static long nshaderc_compile_into_spv_assembly(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_spv_assembly;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    /** {@code shaderc_compilation_result_t shaderc_compile_into_spv_assembly(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (CHECKS) {
            checkNT1(input_file_name);
            checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_spv_assembly(compiler, memAddress(source_text), source_text.remaining(), shader_kind, memAddress(input_file_name), memAddress(entry_point_name), additional_options);
    }

    /** {@code shaderc_compilation_result_t shaderc_compile_into_spv_assembly(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence input_file_name, @NativeType("char const *") CharSequence entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int source_textEncodedLength = stack.nUTF8(source_text, false);
            long source_textEncoded = stack.getPointerAddress();
            stack.nUTF8(input_file_name, true);
            long input_file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(entry_point_name, true);
            long entry_point_nameEncoded = stack.getPointerAddress();
            return nshaderc_compile_into_spv_assembly(compiler, source_textEncoded, source_textEncodedLength, shader_kind, input_file_nameEncoded, entry_point_nameEncoded, additional_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_compile_into_preprocessed_text ] ---

    /** {@code shaderc_compilation_result_t shaderc_compile_into_preprocessed_text(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    public static long nshaderc_compile_into_preprocessed_text(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_preprocessed_text;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    /** {@code shaderc_compilation_result_t shaderc_compile_into_preprocessed_text(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (CHECKS) {
            checkNT1(input_file_name);
            checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_preprocessed_text(compiler, memAddress(source_text), source_text.remaining(), shader_kind, memAddress(input_file_name), memAddress(entry_point_name), additional_options);
    }

    /** {@code shaderc_compilation_result_t shaderc_compile_into_preprocessed_text(shaderc_compiler_t const compiler, char const * source_text, size_t source_text_size, shaderc_shader_kind shader_kind, char const * input_file_name, char const * entry_point_name, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence input_file_name, @NativeType("char const *") CharSequence entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int source_textEncodedLength = stack.nUTF8(source_text, false);
            long source_textEncoded = stack.getPointerAddress();
            stack.nUTF8(input_file_name, true);
            long input_file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(entry_point_name, true);
            long entry_point_nameEncoded = stack.getPointerAddress();
            return nshaderc_compile_into_preprocessed_text(compiler, source_textEncoded, source_textEncodedLength, shader_kind, input_file_nameEncoded, entry_point_nameEncoded, additional_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_assemble_into_spv ] ---

    /** {@code shaderc_compilation_result_t shaderc_assemble_into_spv(shaderc_compiler_t const compiler, char const * source_assembly, size_t source_assembly_size, shaderc_compile_options_t const additional_options)} */
    public static long nshaderc_assemble_into_spv(long compiler, long source_assembly, long source_assembly_size, long additional_options) {
        long __functionAddress = Functions.assemble_into_spv;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPP(compiler, source_assembly, source_assembly_size, additional_options, __functionAddress);
    }

    /** {@code shaderc_compilation_result_t shaderc_assemble_into_spv(shaderc_compiler_t const compiler, char const * source_assembly, size_t source_assembly_size, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_assembly, @NativeType("shaderc_compile_options_t const") long additional_options) {
        return nshaderc_assemble_into_spv(compiler, memAddress(source_assembly), source_assembly.remaining(), additional_options);
    }

    /** {@code shaderc_compilation_result_t shaderc_assemble_into_spv(shaderc_compiler_t const compiler, char const * source_assembly, size_t source_assembly_size, shaderc_compile_options_t const additional_options)} */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_assembly, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int source_assemblyEncodedLength = stack.nUTF8(source_assembly, false);
            long source_assemblyEncoded = stack.getPointerAddress();
            return nshaderc_assemble_into_spv(compiler, source_assemblyEncoded, source_assemblyEncodedLength, additional_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_result_release ] ---

    /** {@code void shaderc_result_release(shaderc_compilation_result_t result)} */
    public static void shaderc_result_release(@NativeType("shaderc_compilation_result_t") long result) {
        long __functionAddress = Functions.result_release;
        if (CHECKS) {
            check(result);
        }
        invokePV(result, __functionAddress);
    }

    // --- [ shaderc_result_get_length ] ---

    /** {@code size_t shaderc_result_get_length(shaderc_compilation_result_t const result)} */
    @NativeType("size_t")
    public static long shaderc_result_get_length(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_length;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    // --- [ shaderc_result_get_num_warnings ] ---

    /** {@code size_t shaderc_result_get_num_warnings(shaderc_compilation_result_t const result)} */
    @NativeType("size_t")
    public static long shaderc_result_get_num_warnings(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_num_warnings;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    // --- [ shaderc_result_get_num_errors ] ---

    /** {@code size_t shaderc_result_get_num_errors(shaderc_compilation_result_t const result)} */
    @NativeType("size_t")
    public static long shaderc_result_get_num_errors(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_num_errors;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    // --- [ shaderc_result_get_compilation_status ] ---

    /** {@code shaderc_compilation_status shaderc_result_get_compilation_status(shaderc_compilation_result_t const result)} */
    @NativeType("shaderc_compilation_status")
    public static int shaderc_result_get_compilation_status(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_compilation_status;
        if (CHECKS) {
            check(result);
        }
        return invokePI(result, __functionAddress);
    }

    // --- [ shaderc_result_get_bytes ] ---

    /** {@code char const * shaderc_result_get_bytes(shaderc_compilation_result_t const result)} */
    public static long nshaderc_result_get_bytes(long result) {
        long __functionAddress = Functions.result_get_bytes;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /** {@code char const * shaderc_result_get_bytes(shaderc_compilation_result_t const result)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer shaderc_result_get_bytes(@NativeType("shaderc_compilation_result_t const") long result) {
        long __result = nshaderc_result_get_bytes(result);
        return memByteBufferSafe(__result, (int)shaderc_result_get_length(result));
    }

    /** {@code char const * shaderc_result_get_bytes(shaderc_compilation_result_t const result)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer shaderc_result_get_bytes(@NativeType("shaderc_compilation_result_t const") long result, long length) {
        long __result = nshaderc_result_get_bytes(result);
        return memByteBufferSafe(__result, (int)length);
    }

    // --- [ shaderc_result_get_error_message ] ---

    /** {@code char const * shaderc_result_get_error_message(shaderc_compilation_result_t const result)} */
    public static long nshaderc_result_get_error_message(long result) {
        long __functionAddress = Functions.result_get_error_message;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /** {@code char const * shaderc_result_get_error_message(shaderc_compilation_result_t const result)} */
    @NativeType("char const *")
    public static @Nullable String shaderc_result_get_error_message(@NativeType("shaderc_compilation_result_t const") long result) {
        long __result = nshaderc_result_get_error_message(result);
        return memUTF8Safe(__result);
    }

    // --- [ shaderc_get_spv_version ] ---

    /** {@code void shaderc_get_spv_version(unsigned int * version, unsigned int * revision)} */
    public static void nshaderc_get_spv_version(long version, long revision) {
        long __functionAddress = Functions.get_spv_version;
        invokePPV(version, revision, __functionAddress);
    }

    /** {@code void shaderc_get_spv_version(unsigned int * version, unsigned int * revision)} */
    public static void shaderc_get_spv_version(@NativeType("unsigned int *") IntBuffer version, @NativeType("unsigned int *") IntBuffer revision) {
        if (CHECKS) {
            check(version, 1);
            check(revision, 1);
        }
        nshaderc_get_spv_version(memAddress(version), memAddress(revision));
    }

    // --- [ shaderc_parse_version_profile ] ---

    /** {@code bool shaderc_parse_version_profile(char const * str, int * version, shaderc_profile * profile)} */
    public static boolean nshaderc_parse_version_profile(long str, long version, long profile) {
        long __functionAddress = Functions.parse_version_profile;
        return invokePPPZ(str, version, profile, __functionAddress);
    }

    /** {@code bool shaderc_parse_version_profile(char const * str, int * version, shaderc_profile * profile)} */
    @NativeType("bool")
    public static boolean shaderc_parse_version_profile(@NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer version, @NativeType("shaderc_profile *") IntBuffer profile) {
        if (CHECKS) {
            checkNT1(str);
            check(version, 1);
            check(profile, 1);
        }
        return nshaderc_parse_version_profile(memAddress(str), memAddress(version), memAddress(profile));
    }

    /** {@code bool shaderc_parse_version_profile(char const * str, int * version, shaderc_profile * profile)} */
    @NativeType("bool")
    public static boolean shaderc_parse_version_profile(@NativeType("char const *") CharSequence str, @NativeType("int *") IntBuffer version, @NativeType("shaderc_profile *") IntBuffer profile) {
        if (CHECKS) {
            check(version, 1);
            check(profile, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nshaderc_parse_version_profile(strEncoded, memAddress(version), memAddress(profile));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}