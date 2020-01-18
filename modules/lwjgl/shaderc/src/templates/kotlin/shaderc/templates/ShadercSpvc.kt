/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val SHADERC_SPVC_BINDING = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.SHADERC_SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc_spvc"))""",
    bundledWithLWJGL = true
)
val ShadercSpvc = "ShadercSpvc".nativeClass(Module.SHADERC, prefix = "shaderc_spvc_", prefixMethod = "shaderc_spvc_", binding = SHADERC_SPVC_BINDING) {
    documentation =
        "Native bindings to the libshaderc_spvc C API of the ${url("https://github.com/google/shaderc/", "shaderc")} library."

    EnumConstant(
        """
        SPIR-V decorations supported by spvc. ({@code shaderc_spvc_decoration}

        This is not an exhaustive list of all of the values in the spec, but more can be added if needed.
        """,

        "decoration_specid".enum,
        "decoration_block".enum,
        "decoration_rowmajor".enum,
        "decoration_colmajor".enum,
        "decoration_arraystride".enum,
        "decoration_matrixstride".enum,
        "decoration_builtin".enum,
        "decoration_noperspective".enum,
        "decoration_flat".enum,
        "decoration_centroid".enum,
        "decoration_restrict".enum,
        "decoration_aliased".enum,
        "decoration_nonwritable".enum,
        "decoration_nonreadable".enum,
        "decoration_uniform".enum,
        "decoration_location".enum,
        "decoration_component".enum,
        "decoration_index".enum,
        "decoration_binding".enum,
        "decoration_descriptorset".enum,
        "decoration_offset".enum,
        "decoration_nocontraction".enum
    )

    EnumConstant(
        "",

        "msl_platform_ios".enum,
        "msl_platform_macos".enum
    )

    EnumConstant(
        """
        Return code for spvc API calls. ({@code shaderc_spvc_status})
            
        {@code shaderc_spvc_status_success} indicates success completion of the operation, all others indicate some sort of failure.
        """,

        "status_success".enum,
        "status_compilation_error".enum,
        "status_internal_error".enum,
        "status_validation_error".enum,
        "status_transformation_error".enum,
        "status_configuration_error".enum,
        "status_uninitialized_compiler_error".enum,
        "status_missing_context_error".enum,
        "status_invalid_out_param".enum
    )

    EnumConstant(
        "{@code shaderc_spvc_execution_model}",

        "execution_model_vertex".enum,
        "execution_model_fragment".enum,
        "execution_model_glcompute".enum,
        "execution_model_invalid".enum
    )
    
    EnumConstant(
        "{@code shaderc_spvc_binding_type}",

        "binding_type_uniform_buffer".enum("", 0x00000000),
        "binding_type_storage_buffer".enum("", 0x00000001),
        "binding_type_readonly_storage_buffer".enum("", 0x00000002),
        "binding_type_sampler".enum("", 0x00000003),
        "binding_type_sampled_texture".enum("", 0x00000004),
        "binding_type_storage_texture".enum("", 0x00000005)
    )

    EnumConstant(
        "{@code shaderc_spvc_texture_view_dimension}",
        
        "texture_view_dimension_undefined".enum("", 0x00000000),
        "texture_view_dimension_e1D".enum("", 0x00000001),
        "texture_view_dimension_e2D".enum("", 0x00000002),
        "texture_view_dimension_e2D_array".enum("", 0x00000003),
        "texture_view_dimension_cube".enum("", 0x00000004),
        "texture_view_dimension_cube_array".enum("", 0x00000005),
        "texture_view_dimension_e3D".enum("", 0x00000006)
    )

    EnumConstant(
        "{@code shaderc_spvc_texture_format_type}",

        "shaderc_spvc_texture_format_type_float".enum,
        "shaderc_spvc_texture_format_type_sint".enum,
        "shaderc_spvc_texture_format_type_uint".enum,
        "shaderc_spvc_texture_format_type_other".enum
    )

    EnumConstant(
        "{@code shaderc_spvc_shader_resource}",

        "shaderc_spvc_shader_resource_uniform_buffers".enum,
        "shaderc_spvc_shader_resource_separate_images".enum,
        "shaderc_spvc_shader_resource_separate_samplers".enum,
        "shaderc_spvc_shader_resource_storage_buffers".enum
    )

    shaderc_spvc_context_t(
        "context_create",
        """
        Create a spvc state handle.

        A return of #NULL indicates that there was an error. Any function operating on a {@code *_context_t} must offer the ${url(
            "http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/",
            "basic thread-safety guarantee"
        )}. That is: concurrent invocation of these functions on DIFFERENT objects needs no synchronization; concurrent invocation of these functions on the
        SAME object requires synchronization IF AND ONLY IF some of them take a non-const argument.
        """,

        void()
    )

    void(
        "context_destroy",
        """
        Release resources.

        After this the handle cannot be used.
        """,

        shaderc_spvc_context_t("context", "")
    )

    charASCII.const.p(
        "context_get_messages",
        "Get validation/compilation error or informational messages.",

        shaderc_spvc_context_t.const("context", "")
    )

    void(
        "context_set_use_spvc_parser",
        "If true, use spvc built in parser to generate IR for spirv-cross, otherwise use spirv-cross's implementation.",

        shaderc_spvc_context_t("context", ""),
        bool("b", "")
    )

    shaderc_spvc_compile_options_t(
        "compile_options_create",
        """
        Creates default compiler options.

        A return of #NULL indicates that there was an error initializing the options. Any function operating on {@code shaderc_spvc_compile_options_t} must
        offer the basic thread-safety guarantee.
        """,

        void()
    )

    shaderc_spvc_compile_options_t(
        "compile_options_clone",
        """
        Returns a copy of the given options.

        If #NULL is passed as the parameter the call is the same as #compile_options_initialize().
        """,

        nullable..shaderc_spvc_compile_options_t.const("options", "")
    )

    void(
        "compile_options_destroy",
        """
        Destroys the compilation options.

        It is invalid to use the given option object in any future calls. It is safe to pass #NULL to this function, and doing such will have no effect.
        """,

        nullable..shaderc_spvc_compile_options_t("options", "")
    )

    void(
        "compile_options_set_entry_point",
        "Sets the entry point.",

        shaderc_spvc_compile_options_t("options", ""),
        charUTF8.const.p("entry_point", "")
    )

    void(
        "compile_options_set_remove_unused_variables",
        "If true, unused variables will not appear in the output.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_robust_buffer_access_pass",
        """
        If true, enable robust buffer access pass in the spirv-opt, meaning:
 
        Inject code to clamp indexed accesses to buffers and internal arrays, providing guarantees satisfying Vulkan's {@code robustBufferAccess} rules. This
        is useful when an implementation does not support robust-buffer access as a driver option.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_emit_line_directives",
        "",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_source_env",
        """
        Sets the source shader environment, affecting which warnings or errors will be issued during validation.

        Default value for environment is Vulkan 1.0.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_target_env("env", ""),
        shaderc_env_version("version", "")
    )

    void(
        "compile_options_set_target_env",
        """
        Sets the target shader environment, if this is different from the source environment, then a transform between the environments will be performed if
        possible.
        
        Currently only WebGPU &lt;-&gt; Vulkan 1.1 are defined. Default value for environment is Vulkan 1.0.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_target_env("env", ""),
        shaderc_env_version("version", "")
    )

    void(
        "compile_options_set_vulkan_semantics",
        "If true, Vulkan GLSL features are used instead of GL-compatible features.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_separate_shader_objects",
        """
        If true, {@code gl_PerVertex} is explicitly redeclared in vertex, geometry and tessellation shaders.

        The members of {@code gl_PerVertex} is determined by which built-ins are declared by the shader.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_flatten_ubo",
        "Flatten uniform or push constant variable into {@code (i|u)vec4} array.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_glsl_language_version",
        """
        Set GLSL language version.

        Default is 450 (i.e. 4.5).
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("version", "")
    )

    //
    void(
        "compile_options_set_flatten_multidimensional_arrays",
        "If true, flatten multidimensional arrays, e.g. {@code foo[a][b][c] -> foo[a*b*c]}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_es",
        "Force interpretion as ES, or not. Default is to detect from source.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_glsl_emit_push_constant_as_ubo",
        "If true, emit push constants as uniform buffer objects. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_language_version",
        """
        Set MSL language version.

        Default is 10200 (i.e. 1.2).
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("version", "")
    )

    void(
        "compile_options_set_msl_swizzle_texture_samples",
        "If true, swizzle MSL texture samples. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_platform",
        "Choose MSL platform. Default is MacOS.",

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_spvc_msl_platform("platform", "")
    )

    void(
        "compile_options_set_msl_pad_fragment_output",
        "If true, pad MSL fragment output. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_capture",
        "If true, capture MSL output to buffer. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_domain_lower_left",
        "If true, flip the Y-coord of the built-in {@code TessCoord}. Default is top left.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_argument_buffers",
        "Enable use of MSL 2.0 indirect argument buffers. Default is not to use them.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_discrete_descriptor_sets",
        """
        When using MSL argument buffers, force "classic" MSL 1.0 binding for the given descriptor sets. This corresponds to {@code VK_KHR_push_descriptor} in
        Vulkan.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t.const.p("descriptors", ""),
        AutoSize("descriptors")..size_t("num_descriptors", "")
    )

    void(
        "compile_options_set_msl_enable_point_size_builtin",
        "Set whether or not {@code PointSize} builtin is used for MSL shaders.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_msl_buffer_size_buffer_index",
        "Set the index in the buffer size in the buffer for MSL.",

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("index", "")
    )

    void(
        "compile_options_set_hlsl_shader_model",
        """
        Set HLSL shader model.

        Default is 30.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("model", "")
    )

    void(
        "compile_options_set_hlsl_point_size_compat",
        "If true, ignore {@code PointSize}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_hlsl_point_coord_compat",
        "If true, ignore {@code PointCoord}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_fixup_clipspace",
        """
        If true (default is false):
        ${ul(
            "GLSL: map depth from Vulkan/D3D style to GL style, i.e. {@code [ 0,w] -> [-w,w]}",
            "MSL : map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}",
            "HLSL: map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}"
        )}
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_flip_vert_y",
        """
        If true invert {@code gl_Position.y} or equivalent.

        Default is false.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_validate",
        "Set if validation should be performed. Default is true.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    void(
        "compile_options_set_optimize",
        "Set if optimization should be performed. Default is true.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    size_t(
        "compile_options_set_for_fuzzing",
        "Fill options with given data.",

        shaderc_spvc_compile_options_t("options", ""),
        uint8_t.const.p("data", ""),
        AutoSize("data")..size_t("size", ""),

        returnDoc = "amount of data used, or zero if not enough data was given"
    )

    shaderc_spvc_status(
        "initialize_for_glsl",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to GLSL and performing reflection.",

        shaderc_spvc_context_t.const("context", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    shaderc_spvc_status(
        "initialize_for_hlsl",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to HLSL and performing reflection.",

        shaderc_spvc_context_t.const("context", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    shaderc_spvc_status(
        "initialize_for_msl",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to MSL and performing reflection.",

        shaderc_spvc_context_t.const("context", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    shaderc_spvc_status(
        "initialize_for_vulkan",
        "Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to Vulkan and performing reflection.",

        shaderc_spvc_context_t.const("context", ""),
        uint32_t.const.p("source", ""),
        AutoSize("source")..size_t("source_len", ""),
        shaderc_spvc_compile_options_t("options", "")
    )

    shaderc_spvc_status(
        "compile_shader",
        "Given an initialized compiler, generates a shader of the appropriate language.",

        shaderc_spvc_context_t.const("context", ""),
        shaderc_spvc_compilation_result_t("result", "")
    )

    shaderc_spvc_status(
        "get_decoration",
        """
        Get spirv_cross decoration.
        
        Given an id and a decoration, result is sent out through {@code argument}. If {@code id} does not exist, returns an error.
        """,

        shaderc_spvc_context_t.const("context", ""),
        uint32_t("id", ""),
        shaderc_spvc_decoration("decoration", ""),
        Check(1)..uint32_t.p("value", "")
    )

    shaderc_spvc_status(
        "unset_decoration",
        """
        Unset spirv_cross decoration.
        
        Given an id and a decoration. Assuming {@code id} is valid.
        """,

        shaderc_spvc_context_t.const("context", ""),
        uint32_t("id", ""),
        shaderc_spvc_decoration("decoration", "")
    )

    void(
        "set_name",
        """
        Set {@code name} on a given {@code id}.

        Assuming {@code id} is valid.        
        """,

        shaderc_spvc_context_t.const("context", ""),
        uint32_t("id", ""),
        charASCII.const.p("name", "")
    )

    void(
        "build_combined_image_samplers",
        "Analyzes all separate image and samplers used from the currently selected entry point, and re-routes them all to a combined image sampler instead.",

        shaderc_spvc_context_t.const("context", "")
    )

    void(
        "get_combined_image_samplers",
        """
        Returns the combined image samplers.
        
        If {@code samplers} is #NULL, then {@code num_samplers} is set, and no data is copied. The caller is responsible for {@code samplers} being large
        enough to contain all of the data.
        """,

        shaderc_spvc_context_t.const("context", ""),
        nullable..shaderc_spvc_combined_image_sampler.p("samplers", ""),
        Check(1)..size_t.p("num_samplers", "")
    )

    shaderc_spvc_status(
        "set_decoration",
        """
        Set spirv_cross decoration.
        
        Given an {@code id}, {@code decoration} and {@code argument}, the {@code decoration} flag on the {@code id} is set. Assuming {@code id} is valid.
        """,

        shaderc_spvc_context_t.const("context", ""),
        uint32_t("id", ""),
        shaderc_spvc_decoration("decoration", ""),
        uint32_t("argument", "")
    )

    shaderc_spvc_status(
        "add_msl_resource_binding",
        "Adds a binding to indicate the MSL buffer, texture or sampler index to use for a particular SPIR-V description set and binding.",

        shaderc_spvc_context_t.const("context", ""),
        shaderc_spvc_msl_resource_binding.const("binding", "")
    )

    shaderc_spvc_status(
        "get_workgroup_size",
        "Gets workgroup size for an entry point defined by a given execution model and function name.",

        shaderc_spvc_context_t.const("context", ""),
        charASCII.const.p("function_name", ""),
        shaderc_spvc_execution_model("execution_model", ""),
        Check(1)..shaderc_spvc_workgroup_size.p("workgroup_size", "")
    )

    shaderc_spvc_status(
        "needs_buffer_size_buffer",
        "Gets whether or not the shader needes a buffer of buffer sizes.",

        shaderc_spvc_context_t.const("context", ""),
        Check(1)..bool.p("b", "")
    )

    shaderc_spvc_status(
        "get_execution_model",
        "Gets the execution model for the shader parsed by the compiler.",

        shaderc_spvc_context_t.const("context", ""),
        Check(1)..shaderc_spvc_execution_model.p("execution_model", "")
    )

    shaderc_spvc_status(
        "get_push_constant_buffer_count",
        "Gets the number of push constants buffers used by the shader.",

        shaderc_spvc_context_t.const("context", ""),
        Check(1)..size_t.p("count", "")
    )

    shaderc_spvc_status(
        "get_binding_info",
        """
        Fetches all of the binding info for a given shader resource.
        
        If {@code bindings} is null, then {@code binding_count} is populated with the number of entries that would have been written out. The caller is
        responsible for ensuring that {@code bindings} has enough space allocated to contain all of the entries.
        """,

        shaderc_spvc_context_t.const("context", ""),
        shaderc_spvc_shader_resource("resource", ""),
        shaderc_spvc_binding_type("binding_type", ""),
        nullable..shaderc_spvc_binding_info.p("bindings", ""),
        AutoSize("bindings")..Check(1)..size_t.p("binding_count", "")
    )

    shaderc_spvc_status(
        "get_input_stage_location_info",
        """
        Fetches the Location decoration information for the stage inputs.

        If {@code locations} is null, then {@code location_count} is populated with the number of entries that would have been written out. The caller is
        responsible for ensuring that {@code locations} has enough space allocated to contain all of the entries.
        """,

        shaderc_spvc_context_t.const("context", ""),
        nullable..shaderc_spvc_resource_location_info.p("locations", ""),
        AutoSize("locations")..Check(1)..size_t.p("location_count", "")
    )

    shaderc_spvc_status(
        "get_output_stage_location_info",
        """
        Fetches the Location decoration information for the stage outputs.
        
        If {@code locations} is null, then {@code location_count} is populated with the number of entries that would have been written out. The caller is
        responsible for ensuring that {@code locations} has enough space allocated to contain all of the entries.
        """,

        shaderc_spvc_context_t.const("context", ""),
        nullable..shaderc_spvc_resource_location_info.p("locations", ""),
        AutoSize("locations")..Check(1)..size_t.p("location_count", "")
    )

    shaderc_spvc_status(
        "get_output_stage_type_info",
        """
        Fetches the type information for the stage outputs.
        
        If {@code types} is null, then {@code type_count} is populated with the number of entries that would have been written out. The caller is responsible
        for ensuring that {@code types} has enough space allocated to contain all of the entries.
        """,

        shaderc_spvc_context_t.const("context", ""),
        nullable..shaderc_spvc_resource_type_info.p("types", ""),
        AutoSize("types")..Check(1)..size_t.p("type_count", "")
    )

    shaderc_spvc_compilation_result_t(
        "result_create",
        """
        Creates an instant of compilation result data structure.
        
        A return of #NULL indicates that there was an error creating the structure. Any function operating on {@code shaderc_spvc_compilation_result_t} must
        offer the basic thread-safety guarantee.
        """,

        void()
    )

    void(
        "result_destroy",
        """
        Destroys the resources held by the result object.

        It is invalid to use the result object for any further operations.
        """,

        shaderc_spvc_compilation_result_t("result", "")
    )

    charUTF8.const.p(
        "result_get_string_output",
        """
        Get validation/compilation result as a string.
        
        This is only supported compiling to GLSL, HSL, and MSL.
        """,

        shaderc_spvc_compilation_result_t.const("result", "")
    )

    MapPointer("shaderc_spvc_result_get_binary_length(result)")..uint32_t.const.p(
        "result_get_binary_output",
        """
        Get validation/compilation result as a binary buffer.
        
        This is only supported compiling to Vulkan.
        """,

        shaderc_spvc_compilation_result_t.const("result", "")
    )

    uint32_t(
        "result_get_binary_length",
        """
        Get length of validation/compilation result as a binary buffer.
        
        This is only supported compiling to Vulkan.
        """,

        shaderc_spvc_compilation_result_t.const("result", "")
    )
}