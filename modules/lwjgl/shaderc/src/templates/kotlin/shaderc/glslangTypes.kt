/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc

import org.lwjgl.generator.*

val glslang_mapper_t = "glslang_mapper_t".opaque
val glslang_program_t = "glslang_program_t".opaque
val glslang_resolver_t = "glslang_resolver_t".opaque
val glslang_shader_t = "glslang_shader_t".opaque

val glslang_client_t = "glslang_client_t".enumType
val glslang_executable_t = "glslang_executable_t".enumType
val glslang_messages_t = "glslang_messages_t".enumType
val glslang_optimization_level_t = "glslang_optimization_level_t".enumType
val glslang_profile_t = "glslang_profile_t".enumType
val glslang_reflection_options_t = "glslang_reflection_options_t".enumType
val glslang_resource_type_t = "glslang_resource_type_t".enumType
val glslang_shader_options_t = "glslang_shader_options_t".enumType
val glslang_source_t = "glslang_source_t".enumType
val glslang_stage_mask_t = "glslang_stage_mask_t".enumType
val glslang_stage_t = "glslang_stage_t".enumType
val glslang_target_client_version_t = "glslang_target_client_version_t".enumType
val glslang_target_language_t = "glslang_target_language_t".enumType
val glslang_target_language_version_t = "glslang_target_language_version_t".enumType
val glslang_texture_sampler_transform_mode_t = "glslang_texture_sampler_transform_mode_t".enumType

val glslang_version_t = struct(Module.SHADERC, "GLSLangVersion", nativeName = "glslang_version_t", mutable = false) {
    int("major")
    int("minor")
    int("patch")
    charASCII.const.p("flavor")
}

val glslang_limits_t = struct(Module.SHADERC, "GLSLangLimits", nativeName = "glslang_limits_t") {
    bool("non_inductive_for_loops")
    bool("while_loops")
    bool("do_while_loops")
    bool("general_uniform_indexing")
    bool("general_attribute_matrix_vector_indexing")
    bool("general_varying_indexing")
    bool("general_sampler_indexing")
    bool("general_variable_indexing")
    bool("general_constant_matrix_vector_indexing")
}

val glslang_resource_t = struct(Module.SHADERC, "GLSLangResource", nativeName = "glslang_resource_t") {
    int("max_lights")
    int("max_clip_planes")
    int("max_texture_units")
    int("max_texture_coords")
    int("max_vertex_attribs")
    int("max_vertex_uniform_components")
    int("max_varying_floats")
    int("max_vertex_texture_image_units")
    int("max_combined_texture_image_units")
    int("max_texture_image_units")
    int("max_fragment_uniform_components")
    int("max_draw_buffers")
    int("max_vertex_uniform_vectors")
    int("max_varying_vectors")
    int("max_fragment_uniform_vectors")
    int("max_vertex_output_vectors")
    int("max_fragment_input_vectors")
    int("min_program_texel_offset")
    int("max_program_texel_offset")
    int("max_clip_distances")
    int("max_compute_work_group_count_x")
    int("max_compute_work_group_count_y")
    int("max_compute_work_group_count_z")
    int("max_compute_work_group_size_x")
    int("max_compute_work_group_size_y")
    int("max_compute_work_group_size_z")
    int("max_compute_uniform_components")
    int("max_compute_texture_image_units")
    int("max_compute_image_uniforms")
    int("max_compute_atomic_counters")
    int("max_compute_atomic_counter_buffers")
    int("max_varying_components")
    int("max_vertex_output_components")
    int("max_geometry_input_components")
    int("max_geometry_output_components")
    int("max_fragment_input_components")
    int("max_image_units")
    int("max_combined_image_units_and_fragment_outputs")
    int("max_combined_shader_output_resources")
    int("max_image_samples")
    int("max_vertex_image_uniforms")
    int("max_tess_control_image_uniforms")
    int("max_tess_evaluation_image_uniforms")
    int("max_geometry_image_uniforms")
    int("max_fragment_image_uniforms")
    int("max_combined_image_uniforms")
    int("max_geometry_texture_image_units")
    int("max_geometry_output_vertices")
    int("max_geometry_total_output_components")
    int("max_geometry_uniform_components")
    int("max_geometry_varying_components")
    int("max_tess_control_input_components")
    int("max_tess_control_output_components")
    int("max_tess_control_texture_image_units")
    int("max_tess_control_uniform_components")
    int("max_tess_control_total_output_components")
    int("max_tess_evaluation_input_components")
    int("max_tess_evaluation_output_components")
    int("max_tess_evaluation_texture_image_units")
    int("max_tess_evaluation_uniform_components")
    int("max_tess_patch_components")
    int("max_patch_vertices")
    int("max_tess_gen_level")
    int("max_viewports")
    int("max_vertex_atomic_counters")
    int("max_tess_control_atomic_counters")
    int("max_tess_evaluation_atomic_counters")
    int("max_geometry_atomic_counters")
    int("max_fragment_atomic_counters")
    int("max_combined_atomic_counters")
    int("max_atomic_counter_bindings")
    int("max_vertex_atomic_counter_buffers")
    int("max_tess_control_atomic_counter_buffers")
    int("max_tess_evaluation_atomic_counter_buffers")
    int("max_geometry_atomic_counter_buffers")
    int("max_fragment_atomic_counter_buffers")
    int("max_combined_atomic_counter_buffers")
    int("max_atomic_counter_buffer_size")
    int("max_transform_feedback_buffers")
    int("max_transform_feedback_interleaved_components")
    int("max_cull_distances")
    int("max_combined_clip_and_cull_distances")
    int("max_samples")
    int("max_mesh_output_vertices_nv")
    int("max_mesh_output_primitives_nv")
    int("max_mesh_work_group_size_x_nv")
    int("max_mesh_work_group_size_y_nv")
    int("max_mesh_work_group_size_z_nv")
    int("max_task_work_group_size_x_nv")
    int("max_task_work_group_size_y_nv")
    int("max_task_work_group_size_z_nv")
    int("max_mesh_view_count_nv")
    int("max_mesh_output_vertices_ext")
    int("max_mesh_output_primitives_ext")
    int("max_mesh_work_group_size_x_ext")
    int("max_mesh_work_group_size_y_ext")
    int("max_mesh_work_group_size_z_ext")
    int("max_task_work_group_size_x_ext")
    int("max_task_work_group_size_y_ext")
    int("max_task_work_group_size_z_ext")
    int("max_mesh_view_count_ext")
    int("max_dual_source_draw_buffers_ext")
    glslang_limits_t("limits")
}

val glsl_include_result_t = struct(Module.SHADERC, "GLSLIncludeResult", nativeName = "glsl_include_result_t") {
    nullable..charUTF8.const.p("header_name")
    nullable..char.const.p("header_data")
    AutoSize("header_data")..size_t("header_length")
}

val glsl_include_local_func = Module.SHADERC.callback {
    glsl_include_result_t.p(
        "GLSLIncludeLocalFunc",

        nullable..opaque_p("ctx"),
        charUTF8.const.p("header_name"),
        charUTF8.const.p("includer_name"),
        size_t("include_depth"),

        nativeType = "glsl_include_local_func"
    )
}

val glsl_include_system_func = Module.SHADERC.callback {
    glsl_include_result_t.p(
        "GLSLIncludeSystemFunc",

        nullable..opaque_p("ctx"),
        charUTF8.const.p("header_name"),
        charUTF8.const.p("includer_name"),
        size_t("include_depth"),

        nativeType = "glsl_include_system_func"
    )
}

val glsl_free_include_result_func = Module.SHADERC.callback {
    int(
        "GLSLFreeIncludeResultFunc",

        nullable..opaque_p("ctx"),
        glsl_include_result_t.p("result"),

        nativeType = "glsl_free_include_result_func"
    )
}

val glsl_include_callbacks_t = struct(Module.SHADERC, "GLSLIncludeCallbacks", nativeName = "glsl_include_callbacks_t") {
    nullable..glsl_include_system_func("include_system")
    nullable..glsl_include_local_func("include_local")
    nullable..glsl_free_include_result_func("free_include_result")
}

val glslang_input_t = struct(Module.SHADERC, "GLSLangInput", nativeName = "glslang_input_t") {
    glslang_source_t("language")
    glslang_stage_t("stage")
    glslang_client_t("client")
    glslang_target_client_version_t("client_version")
    glslang_target_language_t("target_language")
    glslang_target_language_version_t("target_language_version")
    nullable..charUTF8.const.p("code")
    int("default_version")
    glslang_profile_t("default_profile")
    intb("force_default_version_and_profile")
    intb("forward_compatible")
    glslang_messages_t("messages")
    nullable..glslang_resource_t.const.p("resource")
    glsl_include_callbacks_t("callbacks")
    nullable..opaque_p("callbacks_ctx")
}

val glslang_spv_options_t = struct(Module.SHADERC, "GLSLangSPVOptions", nativeName = "glslang_spv_options_t") {
    bool("generate_debug_info")
    bool("strip_debug_info")
    bool("disable_optimizer")
    bool("optimize_size")
    bool("disassemble")
    bool("validate")
    bool("emit_nonsemantic_shader_debug_info")
    bool("emit_nonsemantic_shader_debug_source")
    bool("compile_only")
    bool("optimize_allow_expanded_id_bound")
}