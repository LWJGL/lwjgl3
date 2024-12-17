/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val SHADERC_BINDING = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.SHADERC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc"))""",
    bundledWithLWJGL = true
)
val Shaderc = "Shaderc".nativeClass(Module.SHADERC, prefix = "shaderc_", prefixMethod = "shaderc_", binding = SHADERC_BINDING) {
    EnumConstant(
        "target_env_vulkan".enum("0"),
        "target_env_opengl".enum,
        "target_env_opengl_compat".enum,
        "target_env_webgpu".enum,
        "target_env_default".enum("shaderc_target_env_vulkan")
    )

    EnumConstant(
        "env_version_vulkan_1_0".enum("((1 << 22))"),
        "env_version_vulkan_1_1".enum("((1 << 22) | (1 << 12))"),
        "env_version_vulkan_1_2".enum("((1 << 22) | (2 << 12))"),
        "env_version_vulkan_1_3".enum("((1 << 22) | (3 << 12))"),
        "env_version_vulkan_1_4".enum("((1 << 22) | (4 << 12))"),
        "env_version_opengl_4_5".enum("450"),
        "env_version_webgpu".enum
    )

    EnumConstant(
        "spirv_version_1_0".enum(0x010000),
        "spirv_version_1_1".enum(0x010100),
        "spirv_version_1_2".enum(0x010200),
        "spirv_version_1_3".enum(0x010300),
        "spirv_version_1_4".enum(0x010400),
        "spirv_version_1_5".enum(0x010500),
        "spirv_version_1_6".enum(0x010600)
    )

    EnumConstant(
        "compilation_status_success".enum("0"),
        "compilation_status_invalid_stage".enum,
        "compilation_status_compilation_error".enum,
        "compilation_status_internal_error".enum,
        "compilation_status_null_result_object".enum,
        "compilation_status_invalid_assembly".enum,
        "compilation_status_validation_error".enum,
        "compilation_status_transformation_error".enum,
        "compilation_status_configuration_error".enum
    )

    EnumConstant(
        "source_language_glsl".enum,
        "source_language_hlsl".enum
    )

    EnumConstant(
        "vertex_shader".enum("0"),
        "fragment_shader".enum,
        "compute_shader".enum,
        "geometry_shader".enum,
        "tess_control_shader".enum,
        "tess_evaluation_shader".enum,
        "glsl_vertex_shader".enum("shaderc_vertex_shader"),
        "glsl_fragment_shader".enum("shaderc_fragment_shader"),
        "glsl_compute_shader".enum("shaderc_compute_shader"),
        "glsl_geometry_shader".enum("shaderc_geometry_shader"),
        "glsl_tess_control_shader".enum("shaderc_tess_control_shader"),
        "glsl_tess_evaluation_shader".enum("shaderc_tess_evaluation_shader"),
        "glsl_infer_from_source".enum("6"),
        "glsl_default_vertex_shader".enum,
        "glsl_default_fragment_shader".enum,
        "glsl_default_compute_shader".enum,
        "glsl_default_geometry_shader".enum,
        "glsl_default_tess_control_shader".enum,
        "glsl_default_tess_evaluation_shader".enum,
        "spirv_assembly".enum,
        "raygen_shader".enum,
        "anyhit_shader".enum,
        "closesthit_shader".enum,
        "miss_shader".enum,
        "intersection_shader".enum,
        "callable_shader".enum,
        "glsl_raygen_shader".enum("shaderc_raygen_shader"),
        "glsl_anyhit_shader".enum("shaderc_anyhit_shader"),
        "glsl_closesthit_shader".enum("shaderc_closesthit_shader"),
        "glsl_miss_shader".enum("shaderc_miss_shader"),
        "glsl_intersection_shader".enum("shaderc_intersection_shader"),
        "glsl_callable_shader".enum("shaderc_callable_shader"),
        "glsl_default_raygen_shader".enum("20"),
        "glsl_default_anyhit_shader".enum,
        "glsl_default_closesthit_shader".enum,
        "glsl_default_miss_shader".enum,
        "glsl_default_intersection_shader".enum,
        "glsl_default_callable_shader".enum,
        "task_shader".enum,
        "mesh_shader".enum,
        "glsl_task_shader".enum("shaderc_task_shader"),
        "glsl_mesh_shader".enum("shaderc_mesh_shader"),
        "glsl_default_task_shader".enum("28"),
        "glsl_default_mesh_shader".enum
    )

    EnumConstant(
        "profile_none".enum("0"),
        "profile_core".enum,
        "profile_compatibility".enum,
        "profile_es".enum
    )

    EnumConstant(
        "optimization_level_zero".enum("0"),
        "optimization_level_size".enum,
        "optimization_level_performance".enum
    )

    EnumConstant(
        "limit_max_lights".enum("0"),
        "limit_max_clip_planes".enum,
        "limit_max_texture_units".enum,
        "limit_max_texture_coords".enum,
        "limit_max_vertex_attribs".enum,
        "limit_max_vertex_uniform_components".enum,
        "limit_max_varying_floats".enum,
        "limit_max_vertex_texture_image_units".enum,
        "limit_max_combined_texture_image_units".enum,
        "limit_max_texture_image_units".enum,
        "limit_max_fragment_uniform_components".enum,
        "limit_max_draw_buffers".enum,
        "limit_max_vertex_uniform_vectors".enum,
        "limit_max_varying_vectors".enum,
        "limit_max_fragment_uniform_vectors".enum,
        "limit_max_vertex_output_vectors".enum,
        "limit_max_fragment_input_vectors".enum,
        "limit_min_program_texel_offset".enum,
        "limit_max_program_texel_offset".enum,
        "limit_max_clip_distances".enum,
        "limit_max_compute_work_group_count_x".enum,
        "limit_max_compute_work_group_count_y".enum,
        "limit_max_compute_work_group_count_z".enum,
        "limit_max_compute_work_group_size_x".enum,
        "limit_max_compute_work_group_size_y".enum,
        "limit_max_compute_work_group_size_z".enum,
        "limit_max_compute_uniform_components".enum,
        "limit_max_compute_texture_image_units".enum,
        "limit_max_compute_image_uniforms".enum,
        "limit_max_compute_atomic_counters".enum,
        "limit_max_compute_atomic_counter_buffers".enum,
        "limit_max_varying_components".enum,
        "limit_max_vertex_output_components".enum,
        "limit_max_geometry_input_components".enum,
        "limit_max_geometry_output_components".enum,
        "limit_max_fragment_input_components".enum,
        "limit_max_image_units".enum,
        "limit_max_combined_image_units_and_fragment_outputs".enum,
        "limit_max_combined_shader_output_resources".enum,
        "limit_max_image_samples".enum,
        "limit_max_vertex_image_uniforms".enum,
        "limit_max_tess_control_image_uniforms".enum,
        "limit_max_tess_evaluation_image_uniforms".enum,
        "limit_max_geometry_image_uniforms".enum,
        "limit_max_fragment_image_uniforms".enum,
        "limit_max_combined_image_uniforms".enum,
        "limit_max_geometry_texture_image_units".enum,
        "limit_max_geometry_output_vertices".enum,
        "limit_max_geometry_total_output_components".enum,
        "limit_max_geometry_uniform_components".enum,
        "limit_max_geometry_varying_components".enum,
        "limit_max_tess_control_input_components".enum,
        "limit_max_tess_control_output_components".enum,
        "limit_max_tess_control_texture_image_units".enum,
        "limit_max_tess_control_uniform_components".enum,
        "limit_max_tess_control_total_output_components".enum,
        "limit_max_tess_evaluation_input_components".enum,
        "limit_max_tess_evaluation_output_components".enum,
        "limit_max_tess_evaluation_texture_image_units".enum,
        "limit_max_tess_evaluation_uniform_components".enum,
        "limit_max_tess_patch_components".enum,
        "limit_max_patch_vertices".enum,
        "limit_max_tess_gen_level".enum,
        "limit_max_viewports".enum,
        "limit_max_vertex_atomic_counters".enum,
        "limit_max_tess_control_atomic_counters".enum,
        "limit_max_tess_evaluation_atomic_counters".enum,
        "limit_max_geometry_atomic_counters".enum,
        "limit_max_fragment_atomic_counters".enum,
        "limit_max_combined_atomic_counters".enum,
        "limit_max_atomic_counter_bindings".enum,
        "limit_max_vertex_atomic_counter_buffers".enum,
        "limit_max_tess_control_atomic_counter_buffers".enum,
        "limit_max_tess_evaluation_atomic_counter_buffers".enum,
        "limit_max_geometry_atomic_counter_buffers".enum,
        "limit_max_fragment_atomic_counter_buffers".enum,
        "limit_max_combined_atomic_counter_buffers".enum,
        "limit_max_atomic_counter_buffer_size".enum,
        "limit_max_transform_feedback_buffers".enum,
        "limit_max_transform_feedback_interleaved_components".enum,
        "limit_max_cull_distances".enum,
        "limit_max_combined_clip_and_cull_distances".enum,
        "limit_max_samples".enum,
        "limit_max_mesh_output_vertices_nv".enum,
        "limit_max_mesh_output_primitives_nv".enum,
        "limit_max_mesh_work_group_size_x_nv".enum,
        "limit_max_mesh_work_group_size_y_nv".enum,
        "limit_max_mesh_work_group_size_z_nv".enum,
        "limit_max_task_work_group_size_x_nv".enum,
        "limit_max_task_work_group_size_y_nv".enum,
        "limit_max_task_work_group_size_z_nv".enum,
        "limit_max_mesh_view_count_nv".enum,
        "limit_max_mesh_output_vertices_ext".enum,
        "limit_max_mesh_output_primitives_ext".enum,
        "limit_max_mesh_work_group_size_x_ext".enum,
        "limit_max_mesh_work_group_size_y_ext".enum,
        "limit_max_mesh_work_group_size_z_ext".enum,
        "limit_max_task_work_group_size_x_ext".enum,
        "limit_max_task_work_group_size_y_ext".enum,
        "limit_max_task_work_group_size_z_ext".enum,
        "limit_max_mesh_view_count_ext".enum,
        "limit_max_dual_source_draw_buffers_ext".enum,
    )

    EnumConstant(
        "uniform_kind_image".enum("0"),
        "uniform_kind_sampler".enum,
        "uniform_kind_texture".enum,
        "uniform_kind_buffer".enum,
        "uniform_kind_storage_buffer".enum,
        "uniform_kind_unordered_access_view".enum
    )

    EnumConstant(
        "include_type_relative".enum("0"),
        "include_type_standard".enum
    )

    shaderc_compiler_t(
        "compiler_initialize",

        void()
    )

    void(
        "compiler_release",

        shaderc_compiler_t("compiler")
    )

    shaderc_compile_options_t(
        "compile_options_initialize",

        void()
    )

    shaderc_compile_options_t(
        "compile_options_clone",

        nullable..shaderc_compile_options_t.const("options")
    )

    void(
        "compile_options_release",

        nullable..shaderc_compile_options_t("options")
    )

    void(
        "compile_options_add_macro_definition",

        shaderc_compile_options_t("options"),
        charUTF8.const.p("name"),
        AutoSize("name")..size_t("name_length"),
        nullable..charUTF8.const.p("value"),
        AutoSize("value")..size_t("value_length")
    )

    void(
        "compile_options_set_source_language",

        shaderc_compile_options_t("options"),
        shaderc_source_language("lang")
    )

    void(
        "compile_options_set_generate_debug_info",

        shaderc_compile_options_t("options")
    )

    void(
        "compile_options_set_optimization_level",

        shaderc_compile_options_t("options"),
        shaderc_optimization_level("level")
    )

    void(
        "compile_options_set_forced_version_profile",

        shaderc_compile_options_t("options"),
        int("version"),
        shaderc_profile("profile")
    )

    void(
        "compile_options_set_include_callbacks",

        shaderc_compile_options_t("options"),
        nullable..shaderc_include_resolve_fn("resolver"),
        nullable..shaderc_include_result_release_fn("result_releaser"),
        nullable..opaque_p("user_data")
    )

    void(
        "compile_options_set_suppress_warnings",

        shaderc_compile_options_t("options")
    )

    void(
        "compile_options_set_target_env",

        shaderc_compile_options_t("options"),
        shaderc_target_env("target"),
        uint32_t("version")
    )

    void(
        "compile_options_set_target_spirv",

        shaderc_compile_options_t("options"),
        shaderc_spirv_version("version")
    )

    void(
        "compile_options_set_warnings_as_errors",

        shaderc_compile_options_t("options")
    )

    void(
        "compile_options_set_limit",

        shaderc_compile_options_t("options"),
        shaderc_limit("limit"),
        int("value")
    )

    void(
        "compile_options_set_auto_bind_uniforms",

        shaderc_compile_options_t("options"),
        bool("auto_bind")
    )

    void(
        "compile_options_set_auto_combined_image_sampler",

        shaderc_compile_options_t("options"),
        bool("upgrade")
    )

    void(
        "compile_options_set_hlsl_io_mapping",

        shaderc_compile_options_t("options"),
        bool("hlsl_iomap")
    )

    void(
        "compile_options_set_hlsl_offsets",

        shaderc_compile_options_t("options"),
        bool("hlsl_offsets")
    )

    void(
        "compile_options_set_binding_base",

        shaderc_compile_options_t("options"),
        shaderc_uniform_kind("kind"),
        uint32_t("base")
    )

    void(
        "compile_options_set_binding_base_for_stage",

        shaderc_compile_options_t("options"),
        shaderc_shader_kind("shader_kind"),
        shaderc_uniform_kind("kind"),
        uint32_t("base")
    )

    void(
        "compile_options_set_preserve_bindings",

        shaderc_compile_options_t("options"),
        bool("preserve_bindings")
    )

    void(
        "compile_options_set_auto_map_locations",

        shaderc_compile_options_t("options"),
        bool("auto_map")
    )

    void(
        "compile_options_set_hlsl_register_set_and_binding_for_stage",

        shaderc_compile_options_t("options"),
        shaderc_shader_kind("shader_kind"),
        charUTF8.const.p("reg"),
        charUTF8.const.p("set"),
        charUTF8.const.p("binding")
    )

    void(
        "compile_options_set_hlsl_register_set_and_binding",

        shaderc_compile_options_t("options"),
        charUTF8.const.p("reg"),
        charUTF8.const.p("set"),
        charUTF8.const.p("binding")
    )

    void(
        "compile_options_set_hlsl_functionality1",

        shaderc_compile_options_t("options"),
        bool("enable")
    )

    void(
        "compile_options_set_hlsl_16bit_types",

        shaderc_compile_options_t("options"),
        bool("enable")
    )

    void(
        "compile_options_set_vulkan_rules_relaxed",

        shaderc_compile_options_t("options"),
        bool("enable")
    )

    void(
        "compile_options_set_invert_y",

        shaderc_compile_options_t("options"),
        bool("enable")
    )

    void(
        "compile_options_set_nan_clamp",

        shaderc_compile_options_t("options"),
        bool("enable")
    )

    shaderc_compilation_result_t(
        "compile_into_spv",

        shaderc_compiler_t.const("compiler"),
        charUTF8.const.p("source_text"),
        AutoSize("source_text")..size_t("source_text_size"),
        shaderc_shader_kind("shader_kind"),
        charUTF8.const.p("input_file_name"),
        charUTF8.const.p("entry_point_name"),
        nullable..shaderc_compile_options_t.const("additional_options")
    )

    shaderc_compilation_result_t(
        "compile_into_spv_assembly",

        shaderc_compiler_t.const("compiler"),
        charUTF8.const.p("source_text"),
        AutoSize("source_text")..size_t("source_text_size"),
        shaderc_shader_kind("shader_kind"),
        charUTF8.const.p("input_file_name"),
        charUTF8.const.p("entry_point_name"),
        nullable..shaderc_compile_options_t.const("additional_options")
    )

    shaderc_compilation_result_t(
        "compile_into_preprocessed_text",

        shaderc_compiler_t.const("compiler"),
        charUTF8.const.p("source_text"),
        AutoSize("source_text")..size_t("source_text_size"),
        shaderc_shader_kind("shader_kind"),
        charUTF8.const.p("input_file_name"),
        charUTF8.const.p("entry_point_name"),
        nullable..shaderc_compile_options_t.const("additional_options")
    )

    shaderc_compilation_result_t(
        "assemble_into_spv",

        shaderc_compiler_t.const("compiler"),
        charUTF8.const.p("source_assembly"),
        AutoSize("source_assembly")..size_t("source_assembly_size"),
        nullable..shaderc_compile_options_t.const("additional_options")
    )

    void(
        "result_release",

        shaderc_compilation_result_t("result")
    )

    size_t(
        "result_get_length",

        shaderc_compilation_result_t.const("result")
    )

    size_t(
        "result_get_num_warnings",

        shaderc_compilation_result_t.const("result")
    )

    size_t(
        "result_get_num_errors",

        shaderc_compilation_result_t.const("result")
    )

    shaderc_compilation_status(
        "result_get_compilation_status",

        shaderc_compilation_result_t.const("result")
    )

    MapPointer("shaderc_result_get_length(result)")..char.const.p(
        "result_get_bytes",

        shaderc_compilation_result_t.const("result")
    )

    charUTF8.const.p(
        "result_get_error_message",

        shaderc_compilation_result_t.const("result")
    )

    void(
        "get_spv_version",

        Check(1)..unsigned_int.p("version"),
        Check(1)..unsigned_int.p("revision")
    )

    bool(
        "parse_version_profile",

        charUTF8.const.p("str"),
        Check(1)..int.p("version"),
        Check(1)..shaderc_profile.p("profile")
    )
}