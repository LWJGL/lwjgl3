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
    documentation =
        "Native bindings to the libshaderc C API of the ${url("https://github.com/google/shaderc/", "shaderc")} library."

    EnumConstant(
        "{@code shaderc_target_env}",

        "target_env_vulkan".enum("SPIR-V under Vulkan semantics", "0"),
        "target_env_opengl".enum("SPIR-V under OpenGL semantics. SPIR-V code generation is not supported for shaders under OpenGL compatibility profile."),
        "target_env_opengl_compat".enum("SPIR-V under OpenGL semantics, including compatibility profile functions"),
        "target_env_webgpu".enum("deprecated, SPIR-V under WebGPU semantics"),
        "target_env_default".enum("", "shaderc_target_env_vulkan")
    )

    EnumConstant(
        "{@code shaderc_env_version}",

        "env_version_vulkan_1_0".enum("", "((1 << 22))"),
        "env_version_vulkan_1_1".enum("", "((1 << 22) | (1 << 12))"),
        "env_version_vulkan_1_2".enum("", "((1 << 22) | (2 << 12))"),
        "env_version_vulkan_1_3".enum("", "((1 << 22) | (3 << 12))"),
        "env_version_opengl_4_5".enum("", "450"),
        "env_version_webgpu".enum("deprecated, WebGPU env never defined versions")
    )

    EnumConstant(
        "The known versions of SPIR-V. ({@code shaderc_spirv_version}",

        "spirv_version_1_0".enum("", 0x010000),
        "spirv_version_1_1".enum("", 0x010100),
        "spirv_version_1_2".enum("", 0x010200),
        "spirv_version_1_3".enum("", 0x010300),
        "spirv_version_1_4".enum("", 0x010400),
        "spirv_version_1_5".enum("", 0x010500),
        "spirv_version_1_6".enum("", 0x010600)
    )

    EnumConstant(
        "Indicate the status of a compilation. ({@code shaderc_compilation_status})",

        "compilation_status_success".enum("", "0"),
        "compilation_status_invalid_stage".enum("error stage deduction"),
        "compilation_status_compilation_error".enum,
        "compilation_status_internal_error".enum("unexpected failure"),
        "compilation_status_null_result_object".enum,
        "compilation_status_invalid_assembly".enum,
        "compilation_status_validation_error".enum,
        "compilation_status_transformation_error".enum,
        "compilation_status_configuration_error".enum
    )

    EnumConstant(
        "Source language kind. ({@code shaderc_source_language})",

        "source_language_glsl".enum,
        "source_language_hlsl".enum
    )

    EnumConstant(
        "{@code shaderc_shader_kind}",

        "vertex_shader".enum("", "0"),
        "fragment_shader".enum("Forced the compiler to compile the source code as a fragment shader."),
        "compute_shader".enum("Forced the compiler to compile the source code as a compute shader."),
        "geometry_shader".enum("Forced the compiler to compile the source code as a geometry shader."),
        "tess_control_shader".enum("Forced the compiler to compile the source code as a tessellation control shader."),
        "tess_evaluation_shader".enum("Forced the compiler to compile the source code as a tessellation evaluation shader."),
        "glsl_vertex_shader".enum("Forced the compiler to compile the source code as a GLSL vertex shader.", "shaderc_vertex_shader"),
        "glsl_fragment_shader".enum("Forced the compiler to compile the source code as a GLSL fragment shader.", "shaderc_fragment_shader"),
        "glsl_compute_shader".enum("Forced the compiler to compile the source code as a GLSL compute shader.", "shaderc_compute_shader"),
        "glsl_geometry_shader".enum("Forced the compiler to compile the source code as a GLSL geometry shader.", "shaderc_geometry_shader"),
        "glsl_tess_control_shader".enum(
            "Forced the compiler to compile the source code as a GLSL tessellation control shader.",
            "shaderc_tess_control_shader"
        ),
        "glsl_tess_evaluation_shader".enum(
            "Forced the compiler to compile the source code as a GLSL tessellation evaluation shader.",
            "shaderc_tess_evaluation_shader"
        ),
        "glsl_infer_from_source".enum(
            "Deduce the shader kind from \\#pragma annotation in the source code. Compiler will emit error if \\#pragma annotation is not found.",
            "6"
        ),
        "glsl_default_vertex_shader".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "glsl_default_fragment_shader".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "glsl_default_compute_shader".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "glsl_default_geometry_shader".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "glsl_default_tess_control_shader".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "glsl_default_tess_evaluation_shader".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "spirv_assembly".enum(
            """
            Default shader kinds. Compiler will fall back to compile the source code as the specified kind of shader when \#pragma annotation is not found in
            the source code.
            """
        ),
        "raygen_shader".enum,
        "anyhit_shader".enum,
        "closesthit_shader".enum,
        "miss_shader".enum,
        "intersection_shader".enum,
        "callable_shader".enum,
        "glsl_raygen_shader".enum("", "shaderc_raygen_shader"),
        "glsl_anyhit_shader".enum("", "shaderc_anyhit_shader"),
        "glsl_closesthit_shader".enum("", "shaderc_closesthit_shader"),
        "glsl_miss_shader".enum("", "shaderc_miss_shader"),
        "glsl_intersection_shader".enum("", "shaderc_intersection_shader"),
        "glsl_callable_shader".enum("", "shaderc_callable_shader"),
        "glsl_default_raygen_shader".enum("", "20"),
        "glsl_default_anyhit_shader".enum,
        "glsl_default_closesthit_shader".enum,
        "glsl_default_miss_shader".enum,
        "glsl_default_intersection_shader".enum,
        "glsl_default_callable_shader".enum,
        "task_shader".enum,
        "mesh_shader".enum,
        "glsl_task_shader".enum("", "shaderc_task_shader"),
        "glsl_mesh_shader".enum("", "shaderc_mesh_shader"),
        "glsl_default_task_shader".enum("", "28"),
        "glsl_default_mesh_shader".enum
    )

    EnumConstant(
        "{@code shaderc_profile}",

        "profile_none".enum("Used if and only if GLSL version did not specify profiles.", "0"),
        "profile_core".enum,
        "profile_compatibility".enum("Disabled. This generates an error."),
        "profile_es".enum
    )

    EnumConstant(
        "Optimization level. ({@code shaderc_optimization_level})",

        "optimization_level_zero".enum("no optimization", "0"),
        "optimization_level_size".enum("optimize towards reducing code size"),
        "optimization_level_performance".enum("optimize towards performance")
    )

    EnumConstant(
        "Resource limits. ({@code shaderc_limit})",

        "limit_max_lights".enum("", "0"),
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
        "limit_max_samples".enum
    )

    EnumConstant(
        """
        Uniform resource kinds. In Vulkan, uniform resources are bound to the pipeline via descriptors with numbered bindings and sets.

        ({@code shaderc_uniform_kind})
        """,

        "uniform_kind_image".enum("Image and image buffer.", "0"),
        "uniform_kind_sampler".enum("Pure sampler."),
        "uniform_kind_texture".enum("Sampled texture in GLSL, and Shader Resource View in HLSL."),
        "uniform_kind_buffer".enum("Uniform Buffer Object (UBO) in GLSL.  Cbuffer in HLSL."),
        "uniform_kind_storage_buffer".enum("Shader Storage Buffer Object (SSBO) in GLSL."),
        "uniform_kind_unordered_access_view".enum("Unordered Access View, in HLSL.  (Writable storage image or storage buffer.)")
    )

    EnumConstant(
        """
        The kinds of include requests.

        ({@code enum shaderc_include_type})
        """,

        "include_type_relative".enum("E.g. \\#include \"source\"", "0"),
        "include_type_standard".enum("E.g. \\#include &lt;source&gt;")
    )

    shaderc_compiler_t(
        "compiler_initialize",
        """
        Returns a {@code shaderc_compiler_t} that can be used to compile modules.

        A return of #NULL indicates that there was an error initializing the compiler. Any function operating on {@code shaderc_compiler_t} must offer the
        ${url("http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/", "basic thread-safety guarantee")}. That is: concurrent
        invocation of these functions on DIFFERENT objects needs no synchronization; concurrent invocation of these functions on the SAME object requires
        synchronization IF AND ONLY IF some of them take a non-const argument.
        """,

        void()
    )

    void(
        "compiler_release",
        """
        Releases the resources held by the {@code shaderc_compiler_t}.

        After this call it is invalid to make any future calls to functions involving this {@code shaderc_compiler_t}.
        """,

        shaderc_compiler_t("compiler", "")
    )

    shaderc_compile_options_t(
        "compile_options_initialize",
        """
        Returns a default-initialized {@code shaderc_compile_options_t} that can be used to modify the functionality of a compiled module.

        A return of #NULL indicates that there was an error initializing the options. Any function operating on {@code shaderc_compile_options_t} must offer
        the basic thread-safety guarantee.
        """,

        void()
    )

    shaderc_compile_options_t(
        "compile_options_clone",
        """
        Returns a copy of the given {@code shaderc_compile_options_t}.

        If #NULL is passed as the parameter the call is the same as #compile_options_initialize().
        """,

        nullable..shaderc_compile_options_t.const("options", "")
    )

    void(
        "compile_options_release",
        """
        Releases the compilation options.

        It is invalid to use the given {@code shaderc_compile_options_t} object in any future calls. It is safe to pass #NULL to this function, and doing such
        will have no effect.
        """,

        nullable..shaderc_compile_options_t("options", "")
    )

    void(
        "compile_options_add_macro_definition",
        """
        Adds a predefined macro to the compilation options.

        This has the same effect as passing {@code -Dname=value} to the command-line compiler. If {@code value} is #NULL, it has the same effect as passing
        {@code -Dname} to the command-line compiler. If a macro definition with the same name has previously been added, the value is replaced with the new
        value. The macro name and value are passed in with char pointers, which point to their data, and the lengths of their data. The strings {@code name}
        and {@code value} must remain valid for the duration of the call, but can be modified or deleted after this function has returned. In case of adding a
        valueless macro, the {@code value} argument should be {@code null}.
        """,

        shaderc_compile_options_t("options", ""),
        charUTF8.const.p("name", ""),
        AutoSize("name")..size_t("name_length", ""),
        nullable..charUTF8.const.p("value", ""),
        AutoSize("value")..size_t("value_length", "")
    )

    void(
        "compile_options_set_source_language",
        """
        Sets the source language.

        The default is GLSL.
        """,

        shaderc_compile_options_t("options", ""),
        shaderc_source_language("lang", "")
    )

    void(
        "compile_options_set_generate_debug_info",
        "Sets the compiler mode to generate debug information in the output.",

        shaderc_compile_options_t("options", "")
    )

    void(
        "compile_options_set_optimization_level",
        """
        Sets the compiler optimization level to the given level.

        Only the last one takes effect if multiple calls of this function exist.
        """,

        shaderc_compile_options_t("options", ""),
        shaderc_optimization_level("level", "")
    )

    void(
        "compile_options_set_forced_version_profile",
        """
        Forces the GLSL language version and profile to a given pair.

        The {@code version} number is the same as would appear in the \#version annotation in the source. The {@code version} and {@code profile} specified
        here override the \#version annotation in the source. Use {@code profile: 'shaderc_profile_none'} for GLSL versions that do not define profiles, e.g.
        versions below 150.
        """,

        shaderc_compile_options_t("options", ""),
        int("version", ""),
        shaderc_profile("profile", "")
    )

    void(
        "compile_options_set_include_callbacks",
        "Sets includer callback functions.",

        shaderc_compile_options_t("options", ""),
        nullable..shaderc_include_resolve_fn("resolver", ""),
        nullable..shaderc_include_result_release_fn("result_releaser", ""),
        nullable..opaque_p("user_data", "")
    )

    void(
        "compile_options_set_suppress_warnings",
        """
        Sets the compiler mode to suppress warnings, overriding warnings-as-errors mode.

        When both suppress-warnings and warnings-as-errors modes are turned on, warning messages will be inhibited, and will not be emitted as error messages.
        """,

        shaderc_compile_options_t("options", "")
    )

    void(
        "compile_options_set_target_env",
        """
        Sets the target shader environment, affecting which warnings or errors will be issued.

        The {@code version} will be for distinguishing between different versions of the target environment. The {@code version} value should be either 0 or a
        value listed in {@code shaderc_env_version}. The 0 value maps to Vulkan 1.0 if {@code target} is Vulkan, and it maps to OpenGL 4.5 if {@code target} is
        OpenGL.
        """,

        shaderc_compile_options_t("options", ""),
        shaderc_target_env("target", ""),
        uint32_t("version", "")
    )

    void(
        "compile_options_set_target_spirv",
        """
        Sets the target SPIR-V version.
        
        The generated module will use this version of SPIR-V. Each target environment determines what versions of SPIR-V it can consume. Defaults to the
        highest version of SPIR-V 1.0 which is required to be supported by the target environment. E.g. Default to SPIR-V 1.0 for Vulkan 1.0 and SPIR-V 1.3 for
        Vulkan 1.1.
        """,

        shaderc_compile_options_t("options", ""),
        shaderc_spirv_version("version", "")
    )

    void(
        "compile_options_set_warnings_as_errors",
        """
        Sets the compiler mode to treat all warnings as errors.

        Note the suppress-warnings mode overrides this option, i.e. if both warning-as-errors and suppress-warnings modes are set, warnings will not be emitted
        as error messages.
        """,

        shaderc_compile_options_t("options", "")
    )

    void(
        "compile_options_set_limit",
        "Sets a resource limit.",

        shaderc_compile_options_t("options", ""),
        shaderc_limit("limit", ""),
        int("value", "")
    )

    void(
        "compile_options_set_auto_bind_uniforms",
        "Sets whether the compiler should automatically assign bindings to uniforms that aren't already explicitly bound in the shader source.",

        shaderc_compile_options_t("options", ""),
        bool("auto_bind", "")
    )

    void(
        "compile_options_set_auto_combined_image_sampler",
        "Sets whether the compiler should automatically remove sampler variables and convert image variables to combined image-sampler variables.",

        shaderc_compile_options_t("options", ""),
        bool("upgrade", "")
    )

    void(
        "compile_options_set_hlsl_io_mapping",
        """
        Sets whether the compiler should use HLSL IO mapping rules for bindings.

        Defaults to {@code false}.
        """,

        shaderc_compile_options_t("options", ""),
        bool("hlsl_iomap", "")
    )

    void(
        "compile_options_set_hlsl_offsets",
        """
        Sets whether the compiler should determine block member offsets using HLSL packing rules instead of standard GLSL rules.

        Defaults to {@code false}. Only affects GLSL compilation. HLSL rules are always used when compiling HLSL.
        """,

        shaderc_compile_options_t("options", ""),
        bool("hlsl_offsets", "")
    )

    void(
        "compile_options_set_binding_base",
        """
        Sets the base binding number used for for a uniform resource type when automatically assigning bindings.

        For GLSL compilation, sets the lowest automatically assigned number. For HLSL compilation, the register number assigned to the resource is added to
        this specified base.
        """,

        shaderc_compile_options_t("options", ""),
        shaderc_uniform_kind("kind", ""),
        uint32_t("base", "")
    )

    void(
        "compile_options_set_binding_base_for_stage",
        """
        Like #compile_options_set_binding_base(), but only takes effect when compiling a given shader stage.

        The stage is assumed to be one of vertex, fragment, tessellation evaluation, tesselation control, geometry, or compute.
        """,

        shaderc_compile_options_t("options", ""),
        shaderc_shader_kind("shader_kind", ""),
        shaderc_uniform_kind("kind", ""),
        uint32_t("base", "")
    )

    void(
        "compile_options_set_auto_map_locations",
        "Sets whether the compiler should automatically assign locations to uniform variables that don't have explicit locations in the shader source.",

        shaderc_compile_options_t("options", ""),
        bool("auto_map", "")
    )

    void(
        "compile_options_set_hlsl_register_set_and_binding_for_stage",
        "Sets a descriptor set and binding for an HLSL register in the given stage. This method keeps a copy of the string data.",

        shaderc_compile_options_t("options", ""),
        shaderc_shader_kind("shader_kind", ""),
        charUTF8.const.p("reg", ""),
        charUTF8.const.p("set", ""),
        charUTF8.const.p("binding", "")
    )

    void(
        "compile_options_set_hlsl_register_set_and_binding",
        "Like #compile_options_set_hlsl_register_set_and_binding_for_stage(), but affects all shader stages.",

        shaderc_compile_options_t("options", ""),
        charUTF8.const.p("reg", ""),
        charUTF8.const.p("set", ""),
        charUTF8.const.p("binding", "")
    )

    void(
        "compile_options_set_hlsl_functionality1",
        "Sets whether the compiler should enable extension {@code SPV_GOOGLE_hlsl_functionality1}.",

        shaderc_compile_options_t("options", ""),
        bool("enable", "")
    )

    void(
        "compile_options_set_invert_y",
        "Sets whether the compiler should invert {@code position.Y} output in vertex shader.",

        shaderc_compile_options_t("options", ""),
        bool("enable", "")
    )

    void(
        "compile_options_set_nan_clamp",
        """
        Sets whether the compiler generates code for {@code max} and {@code min} builtins which, if given a {@code NaN} operand, will return the other operand.
        
        Similarly, the {@code clamp} builtin will favour the non-{@code NaN} operands, as if {@code clamp} were implemented as a composition of {@code max} and
        {@code min}.
        """,

        shaderc_compile_options_t("options", ""),
        bool("enable", "")
    )

    shaderc_compilation_result_t(
        "compile_into_spv",
        """
        Takes a GLSL source string and the associated shader kind, input file name, compiles it according to the given {@code additional_options}.

        If the shader kind is not set to a specified kind, but #glsl_infer_from_source, the compiler will try to deduce the shader kind from the source string
        and a failure in deducing will generate an error. Currently only \#pragma annotation is supported. If the shader kind is set to one of the default
        shader kinds, the compiler will fall back to the default shader kind in case it failed to deduce the shader kind from source string. The
        {@code input_file_name} is a null-termintated string. It is used as a tag to identify the source string in cases like emitting error messages. It
        doesn't have to be a 'file name'. The source string will be compiled into SPIR-V binary and a {@code shaderc_compilation_result_t} will be returned to
        hold the results. The {@code entry_point_name} null-terminated string defines the name of the entry point to associate with this GLSL source. If the
        {@code additional_options} parameter is not #NULL, then the compilation is modified by any options present. May be safely called from multiple threads
        without explicit synchronization. If there was failure in allocating the compiler object, #NULL will be returned.
        """,

        shaderc_compiler_t.const("compiler", ""),
        charUTF8.const.p("source_text", ""),
        AutoSize("source_text")..size_t("source_text_size", ""),
        shaderc_shader_kind("shader_kind", ""),
        charUTF8.const.p("input_file_name", ""),
        charUTF8.const.p("entry_point_name", ""),
        nullable..shaderc_compile_options_t.const("additional_options", "")
    )

    shaderc_compilation_result_t(
        "compile_into_spv_assembly",
        """
        Like #compile_into_spv(), but the result contains SPIR-V assembly text instead of a SPIR-V binary module.

        The SPIR-V assembly syntax is as defined by the SPIRV-Tools open source project.
        """,

        shaderc_compiler_t.const("compiler", ""),
        charUTF8.const.p("source_text", ""),
        AutoSize("source_text")..size_t("source_text_size", ""),
        shaderc_shader_kind("shader_kind", ""),
        charUTF8.const.p("input_file_name", ""),
        charUTF8.const.p("entry_point_name", ""),
        nullable..shaderc_compile_options_t.const("additional_options", "")
    )

    shaderc_compilation_result_t(
        "compile_into_preprocessed_text",
        "Like #compile_into_spv(), but the result contains preprocessed source code instead of a SPIR-V binary module",

        shaderc_compiler_t.const("compiler", ""),
        charUTF8.const.p("source_text", ""),
        AutoSize("source_text")..size_t("source_text_size", ""),
        shaderc_shader_kind("shader_kind", ""),
        charUTF8.const.p("input_file_name", ""),
        charUTF8.const.p("entry_point_name", ""),
        nullable..shaderc_compile_options_t.const("additional_options", "")
    )

    shaderc_compilation_result_t(
        "assemble_into_spv",
        """
        Takes an assembly string of the format defined in the ${url("https://github.com/KhronosGroup/SPIRV-Tools/blob/master/syntax.md", "SPIRV-Tools project")},
        assembles it into SPIR-V binary and a {@code shaderc_compilation_result_t} will be returned to hold the results. The assembling will pick options
        suitable for assembling specified in the {@code additional_options} parameter. May be safely called from multiple threads without explicit
        synchronization. If there was failure in allocating the compiler object, #NULL will be returned.
        """,

        shaderc_compiler_t.const("compiler", ""),
        charUTF8.const.p("source_assembly", ""),
        AutoSize("source_assembly")..size_t("source_assembly_size", ""),
        nullable..shaderc_compile_options_t.const("additional_options", "")
    )

    void(
        "result_release",
        """
        Releases the resources held by the {@code result} object.

        It is invalid to use the result object for any further operations.
        """,

        shaderc_compilation_result_t("result", "")
    )

    size_t(
        "result_get_length",
        "Returns the number of bytes of the compilation output data in the given {@code result} object.",

        shaderc_compilation_result_t.const("result", "")
    )

    size_t(
        "result_get_num_warnings",
        "Returns the number of warnings generated during the compilation.",

        shaderc_compilation_result_t.const("result", "")
    )

    size_t(
        "result_get_num_errors",
        "Returns the number of errors generated during the compilation.",

        shaderc_compilation_result_t.const("result", "")
    )

    shaderc_compilation_status(
        "result_get_compilation_status",
        """
        Returns the compilation status, indicating whether the compilation succeeded, or failed due to some reasons, like invalid shader stage or compilation
        errors.
        """,

        shaderc_compilation_result_t.const("result", "")
    )

    MapPointer("shaderc_result_get_length(result)")..char.const.p(
        "result_get_bytes",
        """
        Returns the compilation output data bytes, either SPIR-V binary or char string.

        When the source string is compiled into SPIR-V binary, this is guaranteed to be castable to a {@code uint32_t*}. If the result contains assembly text
        or preprocessed source text, the pointer will point to the resulting array of characters.
        """,

        shaderc_compilation_result_t.const("result", "")
    )

    charUTF8.const.p(
        "result_get_error_message",
        "Returns a null-terminated string that contains any error messages generated during the compilation.",

        shaderc_compilation_result_t.const("result", "")
    )

    void(
        "get_spv_version",
        "Provides the version and revision of the SPIR-V which will be produced",

        Check(1)..unsigned_int.p("version", ""),
        Check(1)..unsigned_int.p("revision", "")
    )

    bool(
        "parse_version_profile",
        """
        Parses the version and profile from a given null-terminated string containing both version and profile, like: {@code '450core'}.

        Returns false if the string can not be parsed. Returns true when the parsing succeeds. The parsed version and profile are returned through arguments.
        """,

        charUTF8.const.p("str", ""),
        Check(1)..int.p("version", ""),
        Check(1)..shaderc_profile.p("profile", "")
    )
}