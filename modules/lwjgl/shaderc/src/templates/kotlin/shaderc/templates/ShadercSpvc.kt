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
        "status_invalid_out_param".enum,
        "spvc_status_missing_options_error".enum,
        "spvc_status_invalid_in_param".enum,
        "spvc_status_missing_result_error".enum
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
        "binding_type_comparison_sampler".enum("", 0x00000004),
        "binding_type_storage_texture".enum("", 0x00000006),
        "binding_type_sampled_texture".enum("", 0x00000005),
        "binding_type_readonly_storage_texture".enum("", 0x00000007),
        "binding_type_writeonly_storage_texture".enum("", 0x00000008)
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

        "texture_format_type_float".enum,
        "texture_format_type_sint".enum,
        "texture_format_type_uint".enum,
        "texture_format_type_other".enum
    )

    EnumConstant(
        "{@code shaderc_spvc_shader_resource}",

        "shader_resource_uniform_buffers".enum,
        "shader_resource_separate_images".enum,
        "shader_resource_separate_samplers".enum,
        "shader_resource_storage_buffers".enum,
        "shader_resource_storage_images".enum
    )

    EnumConstant(
        "{@code shaderc_spvc_storage_texture_format}",

        "storage_texture_format_undefined".enum("", 0x00000000),
        "storage_texture_format_r8unorm".enum("", 0x00000001),
        "storage_texture_format_r8snorm".enum("", 0x00000002),
        "storage_texture_format_r8uint".enum("", 0x00000003),
        "storage_texture_format_r8sint".enum("", 0x00000004),
        "storage_texture_format_r16uint".enum("", 0x00000005),
        "storage_texture_format_r16sint".enum("", 0x00000006),
        "storage_texture_format_r16float".enum("", 0x00000007),
        "storage_texture_format_rg8unorm".enum("", 0x00000008),
        "storage_texture_format_rg8snorm".enum("", 0x00000009),
        "storage_texture_format_rg8uint".enum("", 0x0000000a),
        "storage_texture_format_rg8sint".enum("", 0x0000000b),
        "storage_texture_format_r32float".enum("", 0x0000000c),
        "storage_texture_format_r32uint".enum("", 0x0000000d),
        "storage_texture_format_r32sint".enum("", 0x0000000e),
        "storage_texture_format_rg16uint".enum("", 0x0000000f),
        "storage_texture_format_rg16sint".enum("", 0x00000010),
        "storage_texture_format_rg16float".enum("", 0x00000011),
        "storage_texture_format_rgba8unorm".enum("", 0x00000012),
        "storage_texture_format_rgba8unormsrgb".enum("", 0x00000013),
        "storage_texture_format_rgba8snorm".enum("", 0x00000014),
        "storage_texture_format_rgba8uint".enum("", 0x00000015),
        "storage_texture_format_rgba8sint".enum("", 0x00000016),
        "storage_texture_format_bgra8unorm".enum("", 0x00000017),
        "storage_texture_format_bgra8unormsrgb".enum("", 0x00000018),
        "storage_texture_format_rgb10a2unorm".enum("", 0x00000019),
        "storage_texture_format_rg11b10float".enum("", 0x0000001A),
        "storage_texture_format_rg32float".enum("", 0x0000001B),
        "storage_texture_format_rg32uint".enum("", 0x0000001C),
        "storage_texture_format_rg32sint".enum("", 0x0000001D),
        "storage_texture_format_rgba16uint".enum("", 0x0000001E),
        "storage_texture_format_rgba16sint".enum("", 0x0000001F),
        "storage_texture_format_rgba16float".enum("", 0x00000020),
        "storage_texture_format_rgba32float".enum("", 0x00000021),
        "storage_texture_format_rgba32uint".enum("", 0x00000022),
        "storage_texture_format_rgba32sint".enum("", 0x00000023),
        "storage_texture_format_depth32float".enum("", 0x00000024),
        "storage_texture_format_depth24plus".enum("", 0x00000025),
        "storage_texture_format_depth24plusstencil8".enum("", 0x00000026),
        "storage_texture_format_bc1rgbaunorm".enum("", 0x00000027),
        "storage_texture_format_bc1rgbaunormsrgb".enum("", 0x00000028),
        "storage_texture_format_bc2rgbaunorm".enum("", 0x00000029),
        "storage_texture_format_bc2rgbaunormsrgb".enum("", 0x0000002A),
        "storage_texture_format_bc3rgbaunorm".enum("", 0x0000002B),
        "storage_texture_format_bc3rgbaunormsrgb".enum("", 0x0000002C),
        "storage_texture_format_bc4runorm".enum("", 0x0000002D),
        "storage_texture_format_bc4rsnorm".enum("", 0x0000002E),
        "storage_texture_format_bc5rgunorm".enum("", 0x0000002F),
        "storage_texture_format_bc5rgsnorm".enum("", 0x00000030),
        "storage_texture_format_bc6hrgbufloat".enum("", 0x00000031),
        "storage_texture_format_bc6hrgbsfloat".enum("", 0x00000032),
        "storage_texture_format_bc7rgbaunorm".enum("", 0x00000033),
        "storage_texture_format_bc7rgbaunormsrgb".enum("", 0x00000034)
    )

    EnumConstant(
        "{@code shaderc_spvc_spv_env}",

        "spv_env_universal_1_0".enum,
        "spv_env_vulkan_1_0".enum,
        "spv_env_universal_1_1".enum,
        "spv_env_opencl_2_1".enum,
        "spv_env_opencl_2_2".enum,
        "spv_env_opengl_4_0".enum,
        "spv_env_opengl_4_1".enum,
        "spv_env_opengl_4_2".enum,
        "spv_env_opengl_4_3".enum,
        "spv_env_opengl_4_5".enum,
        "spv_env_universal_1_2".enum,
        "spv_env_opencl_1_2".enum,
        "spv_env_opencl_embedded_1_2".enum,
        "spv_env_opencl_2_0".enum,
        "spv_env_opencl_embedded_2_0".enum,
        "spv_env_opencl_embedded_2_1".enum,
        "spv_env_opencl_embedded_2_2".enum,
        "spv_env_universal_1_3".enum,
        "spv_env_vulkan_1_1".enum,
        "spv_env_webgpu_0".enum,
        "spv_env_universal_1_4".enum,
        "spv_env_vulkan_1_1_spirv_1_4".enum,
        "spv_env_universal_1_5".enum,
        "spv_env_vulkan_1_2".enum
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

    shaderc_spvc_status(
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

        shaderc_spvc_spv_env("source_env", ""),
        shaderc_spvc_spv_env("target_env", "")
    )

    shaderc_spvc_compile_options_t(
        "compile_options_clone",
        "Returns a copy of the given options.",

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

    shaderc_spvc_status(
        "compile_options_set_source_env",
        """
        Sets the source shader environment, affecting which warnings or errors will be issued during validation.

        Default value for environment is Vulkan 1.0.
        
        This function is deprecated.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_target_env("env", ""),
        shaderc_env_version("version", "")
    )

    shaderc_spvc_status(
        "compile_options_set_target_env",
        """
        Sets the target shader environment, if this is different from the source environment, then a transform between the environments will be performed if
        possible.
        
        Currently only WebGPU &lt;-&gt; Vulkan 1.1 are defined. Default value for environment is Vulkan 1.0.
        
        This function is deprecated.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_target_env("env", ""),
        shaderc_env_version("version", "")
    )

    shaderc_spvc_status(
        "compile_options_set_entry_point",
        "Sets the entry point.",

        shaderc_spvc_compile_options_t("options", ""),
        charUTF8.const.p("entry_point", "")
    )

    shaderc_spvc_status(
        "compile_options_set_remove_unused_variables",
        "If true, unused variables will not appear in the output.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_robust_buffer_access_pass",
        """
        If true, enable robust buffer access pass in the spirv-opt, meaning:
 
        Inject code to clamp indexed accesses to buffers and internal arrays, providing guarantees satisfying Vulkan's {@code robustBufferAccess} rules. This
        is useful when an implementation does not support robust-buffer access as a driver option.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_emit_line_directives",
        "",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_vulkan_semantics",
        "If true, Vulkan GLSL features are used instead of GL-compatible features.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_separate_shader_objects",
        """
        If true, {@code gl_PerVertex} is explicitly redeclared in vertex, geometry and tessellation shaders.

        The members of {@code gl_PerVertex} is determined by which built-ins are declared by the shader.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_flatten_ubo",
        "Flatten uniform or push constant variable into {@code (i|u)vec4} array.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_glsl_language_version",
        """
        Set GLSL language version.

        Default is 450 (i.e. 4.5).
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("version", "")
    )

    shaderc_spvc_status(
        "compile_options_set_flatten_multidimensional_arrays",
        "If true, flatten multidimensional arrays, e.g. {@code foo[a][b][c] -> foo[a*b*c]}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_force_zero_initialized_variables",
        "If true, initialize new variables from cross-compile to 0 if possible. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_es",
        "Force interpretion as ES, or not. Default is to detect from source.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_glsl_emit_push_constant_as_ubo",
        "If true, emit push constants as uniform buffer objects. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_language_version",
        """
        Set MSL language version.

        Default is 10200 (i.e. 1.2).
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("version", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_swizzle_texture_samples",
        "If true, swizzle MSL texture samples. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_platform",
        "Choose MSL platform. Default is MacOS.",

        shaderc_spvc_compile_options_t("options", ""),
        shaderc_spvc_msl_platform("platform", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_pad_fragment_output",
        "If true, pad MSL fragment output. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_capture",
        "If true, capture MSL output to buffer. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_domain_lower_left",
        "If true, flip the Y-coord of the built-in {@code TessCoord}. Default is top left.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_argument_buffers",
        "Enable use of MSL 2.0 indirect argument buffers. Default is not to use them.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_discrete_descriptor_sets",
        """
        When using MSL argument buffers, force "classic" MSL 1.0 binding for the given descriptor sets. This corresponds to {@code VK_KHR_push_descriptor} in
        Vulkan.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t.const.p("descriptors", ""),
        AutoSize("descriptors")..size_t("num_descriptors", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_enable_point_size_builtin",
        "Set whether or not {@code PointSize} builtin is used for MSL shaders.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_buffer_size_buffer_index",
        "Set the index in the buffer size in the buffer for MSL.",

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("index", "")
    )

    shaderc_spvc_status(
        "compile_options_set_msl_additional_fixed_sample_mask",
        "Set the additional fixed sample mask for MSL.",

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("mask", "")
    )

    shaderc_spvc_status(
        "compile_options_set_hlsl_shader_model",
        """
        Set HLSL shader model.

        Default is 30.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        uint32_t("model", "")
    )

    shaderc_spvc_status(
        "compile_options_set_hlsl_point_size_compat",
        "If true, ignore {@code PointSize}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_hlsl_point_coord_compat",
        "If true, ignore {@code PointCoord}. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_hlsl_enable_16bit_types",
        "If true, enable 16-bit types. Default is false.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_hlsl_nonwritable_uav_texture_as_srv",
        "If true, set non-writable storage images to be SRV, see {@code spirv_hlsl.hpp} in SPIRV-Cross for more details.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "set_hlsl_force_storage_buffer_as_uav",
        "Set storage buffers to be always declared as UAV, even if the read-only declaration is used, see {@code spirv_hlsl.hpp} in SPIRV-Cross for more details.",

        shaderc_spvc_context_t.const("context", ""),
        uint32_t("desc_set", ""),
        uint32_t("binding", "")
    )

    shaderc_spvc_status(
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

    shaderc_spvc_status(
        "compile_options_set_flip_vert_y",
        """
        If true invert {@code gl_Position.y} or equivalent.

        Default is false.
        """,

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
        "compile_options_set_validate",
        "Set if validation should be performed. Default is true.",

        shaderc_spvc_compile_options_t("options", ""),
        bool("b", "")
    )

    shaderc_spvc_status(
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

    shaderc_spvc_status(
        "set_name",
        """
        Set {@code name} on a given {@code id}.

        Assuming {@code id} is valid.        
        """,

        shaderc_spvc_context_t.const("context", ""),
        uint32_t("id", ""),
        charASCII.const.p("name", "")
    )

    shaderc_spvc_status(
        "build_combined_image_samplers",
        "Analyzes all separate image and samplers used from the currently selected entry point, and re-routes them all to a combined image sampler instead.",

        shaderc_spvc_context_t.const("context", "")
    )

    shaderc_spvc_status(
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

    shaderc_spvc_status(
        "result_get_string_output",
        """
        Get validation/compilation result as a string.
        
        This is only supported compiling to GLSL, HSL, and MSL.
        """,

        shaderc_spvc_compilation_result_t.const("result", ""),
        Check(1)..charUTF8.const.p.p("str", "")
    )

    shaderc_spvc_status(
        "result_get_binary_output",
        """
        Get validation/compilation result as a binary buffer.
        
        This is only supported compiling to Vulkan.
        """,

        shaderc_spvc_compilation_result_t.const("result", ""),
        Check(1)..uint32_t.const.p.p("data", "")
    )

    shaderc_spvc_status(
        "result_get_binary_length",
        """
        Get length of validation/compilation result as a binary buffer.
        
        This is only supported compiling to Vulkan.
        """,

        shaderc_spvc_compilation_result_t.const("result", ""),
        Check(1)..uint32_t.p("len", "")
    )
}