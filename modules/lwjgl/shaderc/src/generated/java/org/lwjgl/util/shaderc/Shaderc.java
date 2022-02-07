/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the libshaderc C API of the <a target="_blank" href="https://github.com/google/shaderc/">shaderc</a> library. */
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
            compile_options_set_auto_map_locations                      = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_auto_map_locations"),
            compile_options_set_hlsl_register_set_and_binding_for_stage = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage"),
            compile_options_set_hlsl_register_set_and_binding           = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_register_set_and_binding"),
            compile_options_set_hlsl_functionality1                     = apiGetFunctionAddress(SHADERC, "shaderc_compile_options_set_hlsl_functionality1"),
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

    /**
     * {@code shaderc_target_env}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_target_env_vulkan target_env_vulkan} - SPIR-V under Vulkan semantics</li>
     * <li>{@link #shaderc_target_env_opengl target_env_opengl} - SPIR-V under OpenGL semantics. SPIR-V code generation is not supported for shaders under OpenGL compatibility profile.</li>
     * <li>{@link #shaderc_target_env_opengl_compat target_env_opengl_compat} - SPIR-V under OpenGL semantics, including compatibility profile functions</li>
     * <li>{@link #shaderc_target_env_webgpu target_env_webgpu} - deprecated, SPIR-V under WebGPU semantics</li>
     * <li>{@link #shaderc_target_env_default target_env_default}</li>
     * </ul>
     */
    public static final int
        shaderc_target_env_vulkan        = 0,
        shaderc_target_env_opengl        = 1,
        shaderc_target_env_opengl_compat = 2,
        shaderc_target_env_webgpu        = 3,
        shaderc_target_env_default       = shaderc_target_env_vulkan;

    /**
     * {@code shaderc_env_version}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_env_version_vulkan_1_0 env_version_vulkan_1_0}</li>
     * <li>{@link #shaderc_env_version_vulkan_1_1 env_version_vulkan_1_1}</li>
     * <li>{@link #shaderc_env_version_vulkan_1_2 env_version_vulkan_1_2}</li>
     * <li>{@link #shaderc_env_version_vulkan_1_3 env_version_vulkan_1_3}</li>
     * <li>{@link #shaderc_env_version_opengl_4_5 env_version_opengl_4_5}</li>
     * <li>{@link #shaderc_env_version_webgpu env_version_webgpu} - deprecated, WebGPU env never defined versions</li>
     * </ul>
     */
    public static final int
        shaderc_env_version_vulkan_1_0 = ((1 << 22)),
        shaderc_env_version_vulkan_1_1 = ((1 << 22) | (1 << 12)),
        shaderc_env_version_vulkan_1_2 = ((1 << 22) | (2 << 12)),
        shaderc_env_version_vulkan_1_3 = ((1 << 22) | (3 << 12)),
        shaderc_env_version_opengl_4_5 = 450,
        shaderc_env_version_webgpu     = 451;

    /**
     * The known versions of SPIR-V. ({@code shaderc_spirv_version}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spirv_version_1_0 spirv_version_1_0}</li>
     * <li>{@link #shaderc_spirv_version_1_1 spirv_version_1_1}</li>
     * <li>{@link #shaderc_spirv_version_1_2 spirv_version_1_2}</li>
     * <li>{@link #shaderc_spirv_version_1_3 spirv_version_1_3}</li>
     * <li>{@link #shaderc_spirv_version_1_4 spirv_version_1_4}</li>
     * <li>{@link #shaderc_spirv_version_1_5 spirv_version_1_5}</li>
     * <li>{@link #shaderc_spirv_version_1_6 spirv_version_1_6}</li>
     * </ul>
     */
    public static final int
        shaderc_spirv_version_1_0 = 0x10000,
        shaderc_spirv_version_1_1 = 0x10100,
        shaderc_spirv_version_1_2 = 0x10200,
        shaderc_spirv_version_1_3 = 0x10300,
        shaderc_spirv_version_1_4 = 0x10400,
        shaderc_spirv_version_1_5 = 0x10500,
        shaderc_spirv_version_1_6 = 0x10600;

    /**
     * Indicate the status of a compilation. ({@code shaderc_compilation_status})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_compilation_status_success compilation_status_success}</li>
     * <li>{@link #shaderc_compilation_status_invalid_stage compilation_status_invalid_stage} - error stage deduction</li>
     * <li>{@link #shaderc_compilation_status_compilation_error compilation_status_compilation_error}</li>
     * <li>{@link #shaderc_compilation_status_internal_error compilation_status_internal_error} - unexpected failure</li>
     * <li>{@link #shaderc_compilation_status_null_result_object compilation_status_null_result_object}</li>
     * <li>{@link #shaderc_compilation_status_invalid_assembly compilation_status_invalid_assembly}</li>
     * <li>{@link #shaderc_compilation_status_validation_error compilation_status_validation_error}</li>
     * <li>{@link #shaderc_compilation_status_transformation_error compilation_status_transformation_error}</li>
     * <li>{@link #shaderc_compilation_status_configuration_error compilation_status_configuration_error}</li>
     * </ul>
     */
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

    /**
     * Source language kind. ({@code shaderc_source_language})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_source_language_glsl source_language_glsl}</li>
     * <li>{@link #shaderc_source_language_hlsl source_language_hlsl}</li>
     * </ul>
     */
    public static final int
        shaderc_source_language_glsl = 0,
        shaderc_source_language_hlsl = 1;

    /**
     * {@code shaderc_shader_kind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_vertex_shader vertex_shader}</li>
     * <li>{@link #shaderc_fragment_shader fragment_shader} - Forced the compiler to compile the source code as a fragment shader.</li>
     * <li>{@link #shaderc_compute_shader compute_shader} - Forced the compiler to compile the source code as a compute shader.</li>
     * <li>{@link #shaderc_geometry_shader geometry_shader} - Forced the compiler to compile the source code as a geometry shader.</li>
     * <li>{@link #shaderc_tess_control_shader tess_control_shader} - Forced the compiler to compile the source code as a tessellation control shader.</li>
     * <li>{@link #shaderc_tess_evaluation_shader tess_evaluation_shader} - Forced the compiler to compile the source code as a tessellation evaluation shader.</li>
     * <li>{@link #shaderc_glsl_vertex_shader glsl_vertex_shader} - Forced the compiler to compile the source code as a GLSL vertex shader.</li>
     * <li>{@link #shaderc_glsl_fragment_shader glsl_fragment_shader} - Forced the compiler to compile the source code as a GLSL fragment shader.</li>
     * <li>{@link #shaderc_glsl_compute_shader glsl_compute_shader} - Forced the compiler to compile the source code as a GLSL compute shader.</li>
     * <li>{@link #shaderc_glsl_geometry_shader glsl_geometry_shader} - Forced the compiler to compile the source code as a GLSL geometry shader.</li>
     * <li>{@link #shaderc_glsl_tess_control_shader glsl_tess_control_shader} - Forced the compiler to compile the source code as a GLSL tessellation control shader.</li>
     * <li>{@link #shaderc_glsl_tess_evaluation_shader glsl_tess_evaluation_shader} - Forced the compiler to compile the source code as a GLSL tessellation evaluation shader.</li>
     * <li>{@link #shaderc_glsl_infer_from_source glsl_infer_from_source} - Deduce the shader kind from #pragma annotation in the source code. Compiler will emit error if #pragma annotation is not found.</li>
     * <li>{@link #shaderc_glsl_default_vertex_shader glsl_default_vertex_shader} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_glsl_default_fragment_shader glsl_default_fragment_shader} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_glsl_default_compute_shader glsl_default_compute_shader} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_glsl_default_geometry_shader glsl_default_geometry_shader} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_glsl_default_tess_control_shader glsl_default_tess_control_shader} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_glsl_default_tess_evaluation_shader glsl_default_tess_evaluation_shader} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_spirv_assembly spirv_assembly} - 
     * Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when #pragma annotation is not found in
     * the source code.
     * </li>
     * <li>{@link #shaderc_raygen_shader raygen_shader}</li>
     * <li>{@link #shaderc_anyhit_shader anyhit_shader}</li>
     * <li>{@link #shaderc_closesthit_shader closesthit_shader}</li>
     * <li>{@link #shaderc_miss_shader miss_shader}</li>
     * <li>{@link #shaderc_intersection_shader intersection_shader}</li>
     * <li>{@link #shaderc_callable_shader callable_shader}</li>
     * <li>{@link #shaderc_glsl_raygen_shader glsl_raygen_shader}</li>
     * <li>{@link #shaderc_glsl_anyhit_shader glsl_anyhit_shader}</li>
     * <li>{@link #shaderc_glsl_closesthit_shader glsl_closesthit_shader}</li>
     * <li>{@link #shaderc_glsl_miss_shader glsl_miss_shader}</li>
     * <li>{@link #shaderc_glsl_intersection_shader glsl_intersection_shader}</li>
     * <li>{@link #shaderc_glsl_callable_shader glsl_callable_shader}</li>
     * <li>{@link #shaderc_glsl_default_raygen_shader glsl_default_raygen_shader}</li>
     * <li>{@link #shaderc_glsl_default_anyhit_shader glsl_default_anyhit_shader}</li>
     * <li>{@link #shaderc_glsl_default_closesthit_shader glsl_default_closesthit_shader}</li>
     * <li>{@link #shaderc_glsl_default_miss_shader glsl_default_miss_shader}</li>
     * <li>{@link #shaderc_glsl_default_intersection_shader glsl_default_intersection_shader}</li>
     * <li>{@link #shaderc_glsl_default_callable_shader glsl_default_callable_shader}</li>
     * <li>{@link #shaderc_task_shader task_shader}</li>
     * <li>{@link #shaderc_mesh_shader mesh_shader}</li>
     * <li>{@link #shaderc_glsl_task_shader glsl_task_shader}</li>
     * <li>{@link #shaderc_glsl_mesh_shader glsl_mesh_shader}</li>
     * <li>{@link #shaderc_glsl_default_task_shader glsl_default_task_shader}</li>
     * <li>{@link #shaderc_glsl_default_mesh_shader glsl_default_mesh_shader}</li>
     * </ul>
     */
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

    /**
     * {@code shaderc_profile}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_profile_none profile_none} - Used if and only if GLSL version did not specify profiles.</li>
     * <li>{@link #shaderc_profile_core profile_core}</li>
     * <li>{@link #shaderc_profile_compatibility profile_compatibility} - Disabled. This generates an error.</li>
     * <li>{@link #shaderc_profile_es profile_es}</li>
     * </ul>
     */
    public static final int
        shaderc_profile_none          = 0,
        shaderc_profile_core          = 1,
        shaderc_profile_compatibility = 2,
        shaderc_profile_es            = 3;

    /**
     * Optimization level. ({@code shaderc_optimization_level})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_optimization_level_zero optimization_level_zero} - no optimization</li>
     * <li>{@link #shaderc_optimization_level_size optimization_level_size} - optimize towards reducing code size</li>
     * <li>{@link #shaderc_optimization_level_performance optimization_level_performance} - optimize towards performance</li>
     * </ul>
     */
    public static final int
        shaderc_optimization_level_zero        = 0,
        shaderc_optimization_level_size        = 1,
        shaderc_optimization_level_performance = 2;

    /**
     * Resource limits. ({@code shaderc_limit})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_limit_max_lights limit_max_lights}</li>
     * <li>{@link #shaderc_limit_max_clip_planes limit_max_clip_planes}</li>
     * <li>{@link #shaderc_limit_max_texture_units limit_max_texture_units}</li>
     * <li>{@link #shaderc_limit_max_texture_coords limit_max_texture_coords}</li>
     * <li>{@link #shaderc_limit_max_vertex_attribs limit_max_vertex_attribs}</li>
     * <li>{@link #shaderc_limit_max_vertex_uniform_components limit_max_vertex_uniform_components}</li>
     * <li>{@link #shaderc_limit_max_varying_floats limit_max_varying_floats}</li>
     * <li>{@link #shaderc_limit_max_vertex_texture_image_units limit_max_vertex_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_combined_texture_image_units limit_max_combined_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_texture_image_units limit_max_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_fragment_uniform_components limit_max_fragment_uniform_components}</li>
     * <li>{@link #shaderc_limit_max_draw_buffers limit_max_draw_buffers}</li>
     * <li>{@link #shaderc_limit_max_vertex_uniform_vectors limit_max_vertex_uniform_vectors}</li>
     * <li>{@link #shaderc_limit_max_varying_vectors limit_max_varying_vectors}</li>
     * <li>{@link #shaderc_limit_max_fragment_uniform_vectors limit_max_fragment_uniform_vectors}</li>
     * <li>{@link #shaderc_limit_max_vertex_output_vectors limit_max_vertex_output_vectors}</li>
     * <li>{@link #shaderc_limit_max_fragment_input_vectors limit_max_fragment_input_vectors}</li>
     * <li>{@link #shaderc_limit_min_program_texel_offset limit_min_program_texel_offset}</li>
     * <li>{@link #shaderc_limit_max_program_texel_offset limit_max_program_texel_offset}</li>
     * <li>{@link #shaderc_limit_max_clip_distances limit_max_clip_distances}</li>
     * <li>{@link #shaderc_limit_max_compute_work_group_count_x limit_max_compute_work_group_count_x}</li>
     * <li>{@link #shaderc_limit_max_compute_work_group_count_y limit_max_compute_work_group_count_y}</li>
     * <li>{@link #shaderc_limit_max_compute_work_group_count_z limit_max_compute_work_group_count_z}</li>
     * <li>{@link #shaderc_limit_max_compute_work_group_size_x limit_max_compute_work_group_size_x}</li>
     * <li>{@link #shaderc_limit_max_compute_work_group_size_y limit_max_compute_work_group_size_y}</li>
     * <li>{@link #shaderc_limit_max_compute_work_group_size_z limit_max_compute_work_group_size_z}</li>
     * <li>{@link #shaderc_limit_max_compute_uniform_components limit_max_compute_uniform_components}</li>
     * <li>{@link #shaderc_limit_max_compute_texture_image_units limit_max_compute_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_compute_image_uniforms limit_max_compute_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_compute_atomic_counters limit_max_compute_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_compute_atomic_counter_buffers limit_max_compute_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_varying_components limit_max_varying_components}</li>
     * <li>{@link #shaderc_limit_max_vertex_output_components limit_max_vertex_output_components}</li>
     * <li>{@link #shaderc_limit_max_geometry_input_components limit_max_geometry_input_components}</li>
     * <li>{@link #shaderc_limit_max_geometry_output_components limit_max_geometry_output_components}</li>
     * <li>{@link #shaderc_limit_max_fragment_input_components limit_max_fragment_input_components}</li>
     * <li>{@link #shaderc_limit_max_image_units limit_max_image_units}</li>
     * <li>{@link #shaderc_limit_max_combined_image_units_and_fragment_outputs limit_max_combined_image_units_and_fragment_outputs}</li>
     * <li>{@link #shaderc_limit_max_combined_shader_output_resources limit_max_combined_shader_output_resources}</li>
     * <li>{@link #shaderc_limit_max_image_samples limit_max_image_samples}</li>
     * <li>{@link #shaderc_limit_max_vertex_image_uniforms limit_max_vertex_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_tess_control_image_uniforms limit_max_tess_control_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_image_uniforms limit_max_tess_evaluation_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_geometry_image_uniforms limit_max_geometry_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_fragment_image_uniforms limit_max_fragment_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_combined_image_uniforms limit_max_combined_image_uniforms}</li>
     * <li>{@link #shaderc_limit_max_geometry_texture_image_units limit_max_geometry_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_geometry_output_vertices limit_max_geometry_output_vertices}</li>
     * <li>{@link #shaderc_limit_max_geometry_total_output_components limit_max_geometry_total_output_components}</li>
     * <li>{@link #shaderc_limit_max_geometry_uniform_components limit_max_geometry_uniform_components}</li>
     * <li>{@link #shaderc_limit_max_geometry_varying_components limit_max_geometry_varying_components}</li>
     * <li>{@link #shaderc_limit_max_tess_control_input_components limit_max_tess_control_input_components}</li>
     * <li>{@link #shaderc_limit_max_tess_control_output_components limit_max_tess_control_output_components}</li>
     * <li>{@link #shaderc_limit_max_tess_control_texture_image_units limit_max_tess_control_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_tess_control_uniform_components limit_max_tess_control_uniform_components}</li>
     * <li>{@link #shaderc_limit_max_tess_control_total_output_components limit_max_tess_control_total_output_components}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_input_components limit_max_tess_evaluation_input_components}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_output_components limit_max_tess_evaluation_output_components}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_texture_image_units limit_max_tess_evaluation_texture_image_units}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_uniform_components limit_max_tess_evaluation_uniform_components}</li>
     * <li>{@link #shaderc_limit_max_tess_patch_components limit_max_tess_patch_components}</li>
     * <li>{@link #shaderc_limit_max_patch_vertices limit_max_patch_vertices}</li>
     * <li>{@link #shaderc_limit_max_tess_gen_level limit_max_tess_gen_level}</li>
     * <li>{@link #shaderc_limit_max_viewports limit_max_viewports}</li>
     * <li>{@link #shaderc_limit_max_vertex_atomic_counters limit_max_vertex_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_tess_control_atomic_counters limit_max_tess_control_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_atomic_counters limit_max_tess_evaluation_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_geometry_atomic_counters limit_max_geometry_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_fragment_atomic_counters limit_max_fragment_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_combined_atomic_counters limit_max_combined_atomic_counters}</li>
     * <li>{@link #shaderc_limit_max_atomic_counter_bindings limit_max_atomic_counter_bindings}</li>
     * <li>{@link #shaderc_limit_max_vertex_atomic_counter_buffers limit_max_vertex_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_tess_control_atomic_counter_buffers limit_max_tess_control_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_tess_evaluation_atomic_counter_buffers limit_max_tess_evaluation_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_geometry_atomic_counter_buffers limit_max_geometry_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_fragment_atomic_counter_buffers limit_max_fragment_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_combined_atomic_counter_buffers limit_max_combined_atomic_counter_buffers}</li>
     * <li>{@link #shaderc_limit_max_atomic_counter_buffer_size limit_max_atomic_counter_buffer_size}</li>
     * <li>{@link #shaderc_limit_max_transform_feedback_buffers limit_max_transform_feedback_buffers}</li>
     * <li>{@link #shaderc_limit_max_transform_feedback_interleaved_components limit_max_transform_feedback_interleaved_components}</li>
     * <li>{@link #shaderc_limit_max_cull_distances limit_max_cull_distances}</li>
     * <li>{@link #shaderc_limit_max_combined_clip_and_cull_distances limit_max_combined_clip_and_cull_distances}</li>
     * <li>{@link #shaderc_limit_max_samples limit_max_samples}</li>
     * </ul>
     */
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
        shaderc_limit_max_samples                                   = 82;

    /**
     * Uniform resource kinds. In Vulkan, uniform resources are bound to the pipeline via descriptors with numbered bindings and sets.
     * 
     * <p>({@code shaderc_uniform_kind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_uniform_kind_image uniform_kind_image} - Image and image buffer.</li>
     * <li>{@link #shaderc_uniform_kind_sampler uniform_kind_sampler} - Pure sampler.</li>
     * <li>{@link #shaderc_uniform_kind_texture uniform_kind_texture} - Sampled texture in GLSL, and Shader Resource View in HLSL.</li>
     * <li>{@link #shaderc_uniform_kind_buffer uniform_kind_buffer} - Uniform Buffer Object (UBO) in GLSL.  Cbuffer in HLSL.</li>
     * <li>{@link #shaderc_uniform_kind_storage_buffer uniform_kind_storage_buffer} - Shader Storage Buffer Object (SSBO) in GLSL.</li>
     * <li>{@link #shaderc_uniform_kind_unordered_access_view uniform_kind_unordered_access_view} - Unordered Access View, in HLSL.  (Writable storage image or storage buffer.)</li>
     * </ul>
     */
    public static final int
        shaderc_uniform_kind_image                 = 0,
        shaderc_uniform_kind_sampler               = 1,
        shaderc_uniform_kind_texture               = 2,
        shaderc_uniform_kind_buffer                = 3,
        shaderc_uniform_kind_storage_buffer        = 4,
        shaderc_uniform_kind_unordered_access_view = 5;

    /**
     * The kinds of include requests.
     * 
     * <p>({@code enum shaderc_include_type})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_include_type_relative include_type_relative} - E.g. #include "source"</li>
     * <li>{@link #shaderc_include_type_standard include_type_standard} - E.g. #include &lt;source&gt;</li>
     * </ul>
     */
    public static final int
        shaderc_include_type_relative = 0,
        shaderc_include_type_standard = 1;

    protected Shaderc() {
        throw new UnsupportedOperationException();
    }

    // --- [ shaderc_compiler_initialize ] ---

    /**
     * Returns a {@code shaderc_compiler_t} that can be used to compile modules.
     * 
     * <p>A return of {@code NULL} indicates that there was an error initializing the compiler. Any function operating on {@code shaderc_compiler_t} must offer the
     * <a target="_blank" href="http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/">basic thread-safety guarantee</a>. That is: concurrent
     * invocation of these functions on DIFFERENT objects needs no synchronization; concurrent invocation of these functions on the SAME object requires
     * synchronization IF AND ONLY IF some of them take a non-const argument.</p>
     */
    @NativeType("shaderc_compiler_t")
    public static long shaderc_compiler_initialize() {
        long __functionAddress = Functions.compiler_initialize;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_compiler_release ] ---

    /**
     * Releases the resources held by the {@code shaderc_compiler_t}.
     * 
     * <p>After this call it is invalid to make any future calls to functions involving this {@code shaderc_compiler_t}.</p>
     */
    public static void shaderc_compiler_release(@NativeType("shaderc_compiler_t") long compiler) {
        long __functionAddress = Functions.compiler_release;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, __functionAddress);
    }

    // --- [ shaderc_compile_options_initialize ] ---

    /**
     * Returns a default-initialized {@code shaderc_compile_options_t} that can be used to modify the functionality of a compiled module.
     * 
     * <p>A return of {@code NULL} indicates that there was an error initializing the options. Any function operating on {@code shaderc_compile_options_t} must offer
     * the basic thread-safety guarantee.</p>
     */
    @NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_initialize() {
        long __functionAddress = Functions.compile_options_initialize;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_compile_options_clone ] ---

    /**
     * Returns a copy of the given {@code shaderc_compile_options_t}.
     * 
     * <p>If {@code NULL} is passed as the parameter the call is the same as {@link #shaderc_compile_options_initialize compile_options_initialize}.</p>
     */
    @NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_clone(@NativeType("shaderc_compile_options_t const") long options) {
        long __functionAddress = Functions.compile_options_clone;
        return invokePP(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_release ] ---

    /**
     * Releases the compilation options.
     * 
     * <p>It is invalid to use the given {@code shaderc_compile_options_t} object in any future calls. It is safe to pass {@code NULL} to this function, and doing such
     * will have no effect.</p>
     */
    public static void shaderc_compile_options_release(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_release;
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_add_macro_definition ] ---

    /** Unsafe version of: {@link #shaderc_compile_options_add_macro_definition compile_options_add_macro_definition} */
    public static void nshaderc_compile_options_add_macro_definition(long options, long name, long name_length, long value, long value_length) {
        long __functionAddress = Functions.compile_options_add_macro_definition;
        if (CHECKS) {
            check(options);
        }
        invokePPPPPV(options, name, name_length, value, value_length, __functionAddress);
    }

    /**
     * Adds a predefined macro to the compilation options.
     * 
     * <p>This has the same effect as passing {@code -Dname=value} to the command-line compiler. If {@code value} is {@code NULL}, it has the same effect as passing
     * {@code -Dname} to the command-line compiler. If a macro definition with the same name has previously been added, the value is replaced with the new
     * value. The macro name and value are passed in with char pointers, which point to their data, and the lengths of their data. The strings {@code name}
     * and {@code value} must remain valid for the duration of the call, but can be modified or deleted after this function has returned. In case of adding a
     * valueless macro, the {@code value} argument should be {@code null}.</p>
     */
    public static void shaderc_compile_options_add_macro_definition(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") ByteBuffer name, @Nullable @NativeType("char const *") ByteBuffer value) {
        nshaderc_compile_options_add_macro_definition(options, memAddress(name), name.remaining(), memAddressSafe(value), remainingSafe(value));
    }

    /**
     * Adds a predefined macro to the compilation options.
     * 
     * <p>This has the same effect as passing {@code -Dname=value} to the command-line compiler. If {@code value} is {@code NULL}, it has the same effect as passing
     * {@code -Dname} to the command-line compiler. If a macro definition with the same name has previously been added, the value is replaced with the new
     * value. The macro name and value are passed in with char pointers, which point to their data, and the lengths of their data. The strings {@code name}
     * and {@code value} must remain valid for the duration of the call, but can be modified or deleted after this function has returned. In case of adding a
     * valueless macro, the {@code value} argument should be {@code null}.</p>
     */
    public static void shaderc_compile_options_add_macro_definition(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") CharSequence name, @Nullable @NativeType("char const *") CharSequence value) {
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

    /**
     * Sets the source language.
     * 
     * <p>The default is GLSL.</p>
     */
    public static void shaderc_compile_options_set_source_language(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_source_language") int lang) {
        long __functionAddress = Functions.compile_options_set_source_language;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, lang, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_generate_debug_info ] ---

    /** Sets the compiler mode to generate debug information in the output. */
    public static void shaderc_compile_options_set_generate_debug_info(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_generate_debug_info;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_optimization_level ] ---

    /**
     * Sets the compiler optimization level to the given level.
     * 
     * <p>Only the last one takes effect if multiple calls of this function exist.</p>
     */
    public static void shaderc_compile_options_set_optimization_level(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_optimization_level") int level) {
        long __functionAddress = Functions.compile_options_set_optimization_level;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, level, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_forced_version_profile ] ---

    /**
     * Forces the GLSL language version and profile to a given pair.
     * 
     * <p>The {@code version} number is the same as would appear in the #version annotation in the source. The {@code version} and {@code profile} specified
     * here override the #version annotation in the source. Use {@code profile: 'shaderc_profile_none'} for GLSL versions that do not define profiles, e.g.
     * versions below 150.</p>
     */
    public static void shaderc_compile_options_set_forced_version_profile(@NativeType("shaderc_compile_options_t") long options, int version, @NativeType("shaderc_profile") int profile) {
        long __functionAddress = Functions.compile_options_set_forced_version_profile;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, profile, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_include_callbacks ] ---

    /** Unsafe version of: {@link #shaderc_compile_options_set_include_callbacks compile_options_set_include_callbacks} */
    public static void nshaderc_compile_options_set_include_callbacks(long options, long resolver, long result_releaser, long user_data) {
        long __functionAddress = Functions.compile_options_set_include_callbacks;
        if (CHECKS) {
            check(options);
        }
        invokePPPPV(options, resolver, result_releaser, user_data, __functionAddress);
    }

    /** Sets includer callback functions. */
    public static void shaderc_compile_options_set_include_callbacks(@NativeType("shaderc_compile_options_t") long options, @Nullable @NativeType("shaderc_include_resolve_fn") ShadercIncludeResolveI resolver, @Nullable @NativeType("shaderc_include_result_release_fn") ShadercIncludeResultReleaseI result_releaser, @NativeType("void *") long user_data) {
        nshaderc_compile_options_set_include_callbacks(options, memAddressSafe(resolver), memAddressSafe(result_releaser), user_data);
    }

    // --- [ shaderc_compile_options_set_suppress_warnings ] ---

    /**
     * Sets the compiler mode to suppress warnings, overriding warnings-as-errors mode.
     * 
     * <p>When both suppress-warnings and warnings-as-errors modes are turned on, warning messages will be inhibited, and will not be emitted as error messages.</p>
     */
    public static void shaderc_compile_options_set_suppress_warnings(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_suppress_warnings;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_target_env ] ---

    /**
     * Sets the target shader environment, affecting which warnings or errors will be issued.
     * 
     * <p>The {@code version} will be for distinguishing between different versions of the target environment. The {@code version} value should be either 0 or a
     * value listed in {@code shaderc_env_version}. The 0 value maps to Vulkan 1.0 if {@code target} is Vulkan, and it maps to OpenGL 4.5 if {@code target} is
     * OpenGL.</p>
     */
    public static void shaderc_compile_options_set_target_env(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_target_env") int target, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_target_env;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, target, version, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_target_spirv ] ---

    /**
     * Sets the target SPIR-V version.
     * 
     * <p>The generated module will use this version of SPIR-V. Each target environment determines what versions of SPIR-V it can consume. Defaults to the
     * highest version of SPIR-V 1.0 which is required to be supported by the target environment. E.g. Default to SPIR-V 1.0 for Vulkan 1.0 and SPIR-V 1.3 for
     * Vulkan 1.1.</p>
     */
    public static void shaderc_compile_options_set_target_spirv(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_spirv_version") int version) {
        long __functionAddress = Functions.compile_options_set_target_spirv;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_warnings_as_errors ] ---

    /**
     * Sets the compiler mode to treat all warnings as errors.
     * 
     * <p>Note the suppress-warnings mode overrides this option, i.e. if both warning-as-errors and suppress-warnings modes are set, warnings will not be emitted
     * as error messages.</p>
     */
    public static void shaderc_compile_options_set_warnings_as_errors(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_warnings_as_errors;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_limit ] ---

    /** Sets a resource limit. */
    public static void shaderc_compile_options_set_limit(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_limit") int limit, int value) {
        long __functionAddress = Functions.compile_options_set_limit;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, limit, value, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_auto_bind_uniforms ] ---

    /** Sets whether the compiler should automatically assign bindings to uniforms that aren't already explicitly bound in the shader source. */
    public static void shaderc_compile_options_set_auto_bind_uniforms(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean auto_bind) {
        long __functionAddress = Functions.compile_options_set_auto_bind_uniforms;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, auto_bind, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_auto_combined_image_sampler ] ---

    /** Sets whether the compiler should automatically remove sampler variables and convert image variables to combined image-sampler variables. */
    public static void shaderc_compile_options_set_auto_combined_image_sampler(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean upgrade) {
        long __functionAddress = Functions.compile_options_set_auto_combined_image_sampler;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, upgrade, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_io_mapping ] ---

    /**
     * Sets whether the compiler should use HLSL IO mapping rules for bindings.
     * 
     * <p>Defaults to {@code false}.</p>
     */
    public static void shaderc_compile_options_set_hlsl_io_mapping(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean hlsl_iomap) {
        long __functionAddress = Functions.compile_options_set_hlsl_io_mapping;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, hlsl_iomap, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_offsets ] ---

    /**
     * Sets whether the compiler should determine block member offsets using HLSL packing rules instead of standard GLSL rules.
     * 
     * <p>Defaults to {@code false}. Only affects GLSL compilation. HLSL rules are always used when compiling HLSL.</p>
     */
    public static void shaderc_compile_options_set_hlsl_offsets(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean hlsl_offsets) {
        long __functionAddress = Functions.compile_options_set_hlsl_offsets;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, hlsl_offsets, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_binding_base ] ---

    /**
     * Sets the base binding number used for for a uniform resource type when automatically assigning bindings.
     * 
     * <p>For GLSL compilation, sets the lowest automatically assigned number. For HLSL compilation, the register number assigned to the resource is added to
     * this specified base.</p>
     */
    public static void shaderc_compile_options_set_binding_base(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_uniform_kind") int kind, @NativeType("uint32_t") int base) {
        long __functionAddress = Functions.compile_options_set_binding_base;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, kind, base, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_binding_base_for_stage ] ---

    /**
     * Like {@link #shaderc_compile_options_set_binding_base compile_options_set_binding_base}, but only takes effect when compiling a given shader stage.
     * 
     * <p>The stage is assumed to be one of vertex, fragment, tessellation evaluation, tesselation control, geometry, or compute.</p>
     */
    public static void shaderc_compile_options_set_binding_base_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("shaderc_uniform_kind") int kind, @NativeType("uint32_t") int base) {
        long __functionAddress = Functions.compile_options_set_binding_base_for_stage;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, shader_kind, kind, base, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_auto_map_locations ] ---

    /** Sets whether the compiler should automatically assign locations to uniform variables that don't have explicit locations in the shader source. */
    public static void shaderc_compile_options_set_auto_map_locations(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean auto_map) {
        long __functionAddress = Functions.compile_options_set_auto_map_locations;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, auto_map, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage ] ---

    /** Unsafe version of: {@link #shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage compile_options_set_hlsl_register_set_and_binding_for_stage} */
    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(long options, int shader_kind, long reg, long set, long binding) {
        long __functionAddress = Functions.compile_options_set_hlsl_register_set_and_binding_for_stage;
        if (CHECKS) {
            check(options);
        }
        invokePPPPV(options, shader_kind, reg, set, binding, __functionAddress);
    }

    /** Sets a descriptor set and binding for an HLSL register in the given stage. This method keeps a copy of the string data. */
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer reg, @NativeType("char const *") ByteBuffer set, @NativeType("char const *") ByteBuffer binding) {
        if (CHECKS) {
            checkNT1(reg);
            checkNT1(set);
            checkNT1(binding);
        }
        nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(options, shader_kind, memAddress(reg), memAddress(set), memAddress(binding));
    }

    /** Sets a descriptor set and binding for an HLSL register in the given stage. This method keeps a copy of the string data. */
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

    /** Unsafe version of: {@link #shaderc_compile_options_set_hlsl_register_set_and_binding compile_options_set_hlsl_register_set_and_binding} */
    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding(long options, long reg, long set, long binding) {
        long __functionAddress = Functions.compile_options_set_hlsl_register_set_and_binding;
        if (CHECKS) {
            check(options);
        }
        invokePPPPV(options, reg, set, binding, __functionAddress);
    }

    /** Like {@link #shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage compile_options_set_hlsl_register_set_and_binding_for_stage}, but affects all shader stages. */
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") ByteBuffer reg, @NativeType("char const *") ByteBuffer set, @NativeType("char const *") ByteBuffer binding) {
        if (CHECKS) {
            checkNT1(reg);
            checkNT1(set);
            checkNT1(binding);
        }
        nshaderc_compile_options_set_hlsl_register_set_and_binding(options, memAddress(reg), memAddress(set), memAddress(binding));
    }

    /** Like {@link #shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage compile_options_set_hlsl_register_set_and_binding_for_stage}, but affects all shader stages. */
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

    /** Sets whether the compiler should enable extension {@code SPV_GOOGLE_hlsl_functionality1}. */
    public static void shaderc_compile_options_set_hlsl_functionality1(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_hlsl_functionality1;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_invert_y ] ---

    /** Sets whether the compiler should invert {@code position.Y} output in vertex shader. */
    public static void shaderc_compile_options_set_invert_y(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_invert_y;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_options_set_nan_clamp ] ---

    /**
     * Sets whether the compiler generates code for {@code max} and {@code min} builtins which, if given a {@code NaN} operand, will return the other operand.
     * 
     * <p>Similarly, the {@code clamp} builtin will favour the non-{@code NaN} operands, as if {@code clamp} were implemented as a composition of {@code max} and
     * {@code min}.</p>
     */
    public static void shaderc_compile_options_set_nan_clamp(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_nan_clamp;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, enable, __functionAddress);
    }

    // --- [ shaderc_compile_into_spv ] ---

    /** Unsafe version of: {@link #shaderc_compile_into_spv compile_into_spv} */
    public static long nshaderc_compile_into_spv(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_spv;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    /**
     * Takes a GLSL source string and the associated shader kind, input file name, compiles it according to the given {@code additional_options}.
     * 
     * <p>If the shader kind is not set to a specified kind, but {@link #shaderc_glsl_infer_from_source glsl_infer_from_source}, the compiler will try to deduce the shader kind from the source string
     * and a failure in deducing will generate an error. Currently only #pragma annotation is supported. If the shader kind is set to one of the default
     * shader kinds, the compiler will fall back to the default shader kind in case it failed to deduce the shader kind from source string. The
     * {@code input_file_name} is a null-termintated string. It is used as a tag to identify the source string in cases like emitting error messages. It
     * doesn't have to be a 'file name'. The source string will be compiled into SPIR-V binary and a {@code shaderc_compilation_result_t} will be returned to
     * hold the results. The {@code entry_point_name} null-terminated string defines the name of the entry point to associate with this GLSL source. If the
     * {@code additional_options} parameter is not {@code NULL}, then the compilation is modified by any options present. May be safely called from multiple threads
     * without explicit synchronization. If there was failure in allocating the compiler object, {@code NULL} will be returned.</p>
     */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (CHECKS) {
            checkNT1(input_file_name);
            checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_spv(compiler, memAddress(source_text), source_text.remaining(), shader_kind, memAddress(input_file_name), memAddress(entry_point_name), additional_options);
    }

    /**
     * Takes a GLSL source string and the associated shader kind, input file name, compiles it according to the given {@code additional_options}.
     * 
     * <p>If the shader kind is not set to a specified kind, but {@link #shaderc_glsl_infer_from_source glsl_infer_from_source}, the compiler will try to deduce the shader kind from the source string
     * and a failure in deducing will generate an error. Currently only #pragma annotation is supported. If the shader kind is set to one of the default
     * shader kinds, the compiler will fall back to the default shader kind in case it failed to deduce the shader kind from source string. The
     * {@code input_file_name} is a null-termintated string. It is used as a tag to identify the source string in cases like emitting error messages. It
     * doesn't have to be a 'file name'. The source string will be compiled into SPIR-V binary and a {@code shaderc_compilation_result_t} will be returned to
     * hold the results. The {@code entry_point_name} null-terminated string defines the name of the entry point to associate with this GLSL source. If the
     * {@code additional_options} parameter is not {@code NULL}, then the compilation is modified by any options present. May be safely called from multiple threads
     * without explicit synchronization. If there was failure in allocating the compiler object, {@code NULL} will be returned.</p>
     */
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

    /** Unsafe version of: {@link #shaderc_compile_into_spv_assembly compile_into_spv_assembly} */
    public static long nshaderc_compile_into_spv_assembly(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_spv_assembly;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    /**
     * Like {@link #shaderc_compile_into_spv compile_into_spv}, but the result contains SPIR-V assembly text instead of a SPIR-V binary module.
     * 
     * <p>The SPIR-V assembly syntax is as defined by the SPIRV-Tools open source project.</p>
     */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (CHECKS) {
            checkNT1(input_file_name);
            checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_spv_assembly(compiler, memAddress(source_text), source_text.remaining(), shader_kind, memAddress(input_file_name), memAddress(entry_point_name), additional_options);
    }

    /**
     * Like {@link #shaderc_compile_into_spv compile_into_spv}, but the result contains SPIR-V assembly text instead of a SPIR-V binary module.
     * 
     * <p>The SPIR-V assembly syntax is as defined by the SPIRV-Tools open source project.</p>
     */
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

    /** Unsafe version of: {@link #shaderc_compile_into_preprocessed_text compile_into_preprocessed_text} */
    public static long nshaderc_compile_into_preprocessed_text(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_preprocessed_text;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    /** Like {@link #shaderc_compile_into_spv compile_into_spv}, but the result contains preprocessed source code instead of a SPIR-V binary module */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (CHECKS) {
            checkNT1(input_file_name);
            checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_preprocessed_text(compiler, memAddress(source_text), source_text.remaining(), shader_kind, memAddress(input_file_name), memAddress(entry_point_name), additional_options);
    }

    /** Like {@link #shaderc_compile_into_spv compile_into_spv}, but the result contains preprocessed source code instead of a SPIR-V binary module */
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

    /** Unsafe version of: {@link #shaderc_assemble_into_spv assemble_into_spv} */
    public static long nshaderc_assemble_into_spv(long compiler, long source_assembly, long source_assembly_size, long additional_options) {
        long __functionAddress = Functions.assemble_into_spv;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPP(compiler, source_assembly, source_assembly_size, additional_options, __functionAddress);
    }

    /**
     * Takes an assembly string of the format defined in the <a target="_blank" href="https://github.com/KhronosGroup/SPIRV-Tools/blob/master/syntax.md">SPIRV-Tools project</a>,
     * assembles it into SPIR-V binary and a {@code shaderc_compilation_result_t} will be returned to hold the results. The assembling will pick options
     * suitable for assembling specified in the {@code additional_options} parameter. May be safely called from multiple threads without explicit
     * synchronization. If there was failure in allocating the compiler object, {@code NULL} will be returned.
     */
    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_assembly, @NativeType("shaderc_compile_options_t const") long additional_options) {
        return nshaderc_assemble_into_spv(compiler, memAddress(source_assembly), source_assembly.remaining(), additional_options);
    }

    /**
     * Takes an assembly string of the format defined in the <a target="_blank" href="https://github.com/KhronosGroup/SPIRV-Tools/blob/master/syntax.md">SPIRV-Tools project</a>,
     * assembles it into SPIR-V binary and a {@code shaderc_compilation_result_t} will be returned to hold the results. The assembling will pick options
     * suitable for assembling specified in the {@code additional_options} parameter. May be safely called from multiple threads without explicit
     * synchronization. If there was failure in allocating the compiler object, {@code NULL} will be returned.
     */
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

    /**
     * Releases the resources held by the {@code result} object.
     * 
     * <p>It is invalid to use the result object for any further operations.</p>
     */
    public static void shaderc_result_release(@NativeType("shaderc_compilation_result_t") long result) {
        long __functionAddress = Functions.result_release;
        if (CHECKS) {
            check(result);
        }
        invokePV(result, __functionAddress);
    }

    // --- [ shaderc_result_get_length ] ---

    /** Returns the number of bytes of the compilation output data in the given {@code result} object. */
    @NativeType("size_t")
    public static long shaderc_result_get_length(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_length;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    // --- [ shaderc_result_get_num_warnings ] ---

    /** Returns the number of warnings generated during the compilation. */
    @NativeType("size_t")
    public static long shaderc_result_get_num_warnings(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_num_warnings;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    // --- [ shaderc_result_get_num_errors ] ---

    /** Returns the number of errors generated during the compilation. */
    @NativeType("size_t")
    public static long shaderc_result_get_num_errors(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_num_errors;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    // --- [ shaderc_result_get_compilation_status ] ---

    /**
     * Returns the compilation status, indicating whether the compilation succeeded, or failed due to some reasons, like invalid shader stage or compilation
     * errors.
     */
    @NativeType("shaderc_compilation_status")
    public static int shaderc_result_get_compilation_status(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_compilation_status;
        if (CHECKS) {
            check(result);
        }
        return invokePI(result, __functionAddress);
    }

    // --- [ shaderc_result_get_bytes ] ---

    /** Unsafe version of: {@link #shaderc_result_get_bytes result_get_bytes} */
    public static long nshaderc_result_get_bytes(long result) {
        long __functionAddress = Functions.result_get_bytes;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /**
     * Returns the compilation output data bytes, either SPIR-V binary or char string.
     * 
     * <p>When the source string is compiled into SPIR-V binary, this is guaranteed to be castable to a {@code uint32_t*}. If the result contains assembly text
     * or preprocessed source text, the pointer will point to the resulting array of characters.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static ByteBuffer shaderc_result_get_bytes(@NativeType("shaderc_compilation_result_t const") long result) {
        long __result = nshaderc_result_get_bytes(result);
        return memByteBufferSafe(__result, (int)shaderc_result_get_length(result));
    }

    /**
     * Returns the compilation output data bytes, either SPIR-V binary or char string.
     * 
     * <p>When the source string is compiled into SPIR-V binary, this is guaranteed to be castable to a {@code uint32_t*}. If the result contains assembly text
     * or preprocessed source text, the pointer will point to the resulting array of characters.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static ByteBuffer shaderc_result_get_bytes(@NativeType("shaderc_compilation_result_t const") long result, long length) {
        long __result = nshaderc_result_get_bytes(result);
        return memByteBufferSafe(__result, (int)length);
    }

    // --- [ shaderc_result_get_error_message ] ---

    /** Unsafe version of: {@link #shaderc_result_get_error_message result_get_error_message} */
    public static long nshaderc_result_get_error_message(long result) {
        long __functionAddress = Functions.result_get_error_message;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /** Returns a null-terminated string that contains any error messages generated during the compilation. */
    @Nullable
    @NativeType("char const *")
    public static String shaderc_result_get_error_message(@NativeType("shaderc_compilation_result_t const") long result) {
        long __result = nshaderc_result_get_error_message(result);
        return memUTF8Safe(__result);
    }

    // --- [ shaderc_get_spv_version ] ---

    /** Unsafe version of: {@link #shaderc_get_spv_version get_spv_version} */
    public static void nshaderc_get_spv_version(long version, long revision) {
        long __functionAddress = Functions.get_spv_version;
        invokePPV(version, revision, __functionAddress);
    }

    /** Provides the version and revision of the SPIR-V which will be produced */
    public static void shaderc_get_spv_version(@NativeType("unsigned int *") IntBuffer version, @NativeType("unsigned int *") IntBuffer revision) {
        if (CHECKS) {
            check(version, 1);
            check(revision, 1);
        }
        nshaderc_get_spv_version(memAddress(version), memAddress(revision));
    }

    // --- [ shaderc_parse_version_profile ] ---

    /** Unsafe version of: {@link #shaderc_parse_version_profile parse_version_profile} */
    public static boolean nshaderc_parse_version_profile(long str, long version, long profile) {
        long __functionAddress = Functions.parse_version_profile;
        return invokePPPZ(str, version, profile, __functionAddress);
    }

    /**
     * Parses the version and profile from a given null-terminated string containing both version and profile, like: {@code '450core'}.
     * 
     * <p>Returns false if the string can not be parsed. Returns true when the parsing succeeds. The parsed version and profile are returned through arguments.</p>
     */
    @NativeType("bool")
    public static boolean shaderc_parse_version_profile(@NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer version, @NativeType("shaderc_profile *") IntBuffer profile) {
        if (CHECKS) {
            checkNT1(str);
            check(version, 1);
            check(profile, 1);
        }
        return nshaderc_parse_version_profile(memAddress(str), memAddress(version), memAddress(profile));
    }

    /**
     * Parses the version and profile from a given null-terminated string containing both version and profile, like: {@code '450core'}.
     * 
     * <p>Returns false if the string can not be parsed. Returns true when the parsing succeeds. The parsed version and profile are returned through arguments.</p>
     */
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