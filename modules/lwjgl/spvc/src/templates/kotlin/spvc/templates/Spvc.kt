/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package spvc.templates

import spvc.*
import org.lwjgl.generator.*

val SPVC_BINDING = simpleBinding(
    Module.SPVC,
    libraryExpression = """Configuration.SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("spirv-cross"))""",
    bundledWithLWJGL = true
)
val Spvc = "Spvc".nativeClass(Module.SPVC, prefix = "SPVC_", prefixMethod = "spvc_", binding = SPVC_BINDING) {
    documentation =
        """
        Native bindings to the C API of ${url("https://github.com/KhronosGroup/SPIRV-Cross", "SPIRV-Cross")}.
 
        SPIRV-Cross is a tool designed for parsing and converting SPIR-V to other shader languages.
        ${ul(
            "Convert SPIR-V to readable, usable and efficient GLSL",
            "Convert SPIR-V to readable, usable and efficient Metal Shading Language (MSL)",
            "Convert SPIR-V to readable, usable and efficient HLSL",
            "Convert SPIR-V to debuggable C++ [DEPRECATED]",
            "Convert SPIR-V to a JSON reflection format [EXPERIMENTAL]",
            "Reflection API to simplify the creation of Vulkan pipeline layouts",
            "Reflection API to modify and tweak OpDecorations",
            "Supports \"all\" of vertex, fragment, tessellation, geometry and compute shaders."            
        )}
        SPIRV-Cross tries hard to emit readable and clean output from the SPIR-V. The goal is to emit GLSL or MSL that looks like it was written by a human and
        not awkward IR/assembly-like code.
        """

    IntConstant("", "C_API_VERSION_MAJOR".."0")
    IntConstant("", "C_API_VERSION_MINOR".."18")
    IntConstant("", "C_API_VERSION_PATCH".."0")

    IntConstant("", "COMPILER_OPTION_COMMON_BIT"..0x1000000)
    IntConstant("", "COMPILER_OPTION_GLSL_BIT"..0x2000000)
    IntConstant("", "COMPILER_OPTION_HLSL_BIT"..0x4000000)
    IntConstant("", "COMPILER_OPTION_MSL_BIT"..0x8000000)
    IntConstant("", "COMPILER_OPTION_LANG_BITS"..0x0f000000)
    IntConstant("", "COMPILER_OPTION_ENUM_BITS"..0xffffff)

    IntConstant(
        "Special constant used in a {@code MSLResourceBinding} {@code desc_set} element to indicate the bindings for the push constants.",

        "MSL_PUSH_CONSTANT_DESC_SET".."~0"
    )

    IntConstant(
        "Special constant used in a {@code MSLResourceBinding} binding element to indicate the bindings for the push constants.",

        "MSL_PUSH_CONSTANT_BINDING".."0"
    )
    IntConstant(
        "Special constant used in a {@code MSLResourceBinding} binding element to indicate the buffer binding for swizzle buffers.",

        "MSL_SWIZZLE_BUFFER_BINDING".."~1"
    )
    IntConstant(
        """
        Special constant used in a {@code MSLResourceBinding} binding element to indicate the buffer binding for buffer size buffers to support
        {@code OpArrayLength}.
        """,

        "MSL_BUFFER_SIZE_BUFFER_BINDING".."~2"
    )
    IntConstant(
        """
        Special constant used in a {@code MSLResourceBinding} binding element to indicate the buffer binding used for the argument buffer itself.

        This buffer binding should be kept as small as possible as all automatic bindings for buffers will start at {@code max(kArgumentBufferBinding) + 1}.
        """,

        "MSL_ARGUMENT_BUFFER_BINDING".."~3"
    )

    IntConstant("", "MSL_AUX_BUFFER_STRUCT_VERSION"..1)

    EnumConstant(
        "{@code spvc_result}",

        "SUCCESS".enum("Success.", "0"),
        "ERROR_INVALID_SPIRV".enum("The SPIR-V is invalid. Should have been caught by validation ideally.", "-1"),
        "ERROR_UNSUPPORTED_SPIRV".enum(
            "The SPIR-V might be valid or invalid, but SPIRV-Cross currently cannot correctly translate this to your target language.",
            "-2"
        ),
        "ERROR_OUT_OF_MEMORY".enum("If for some reason we hit this, new or malloc failed.", "-3"),
        "ERROR_INVALID_ARGUMENT".enum("Invalid API argument.", "-4")
    )

    EnumConstant(
        "{@code spvc_capture_mode}",

        "CAPTURE_MODE_COPY".enum("The Parsed IR payload will be copied, and the handle can be reused to create other compiler instances.", "0"),
        "CAPTURE_MODE_TAKE_OWNERSHIP".enum(
            """
            The payload will now be owned by the compiler. parsed_ir should now be considered a dead blob and must not be used further. This is optimal for
            performance and should be the go-to option.
            """
        )
    )

    EnumConstant(
        "{@code spvc_backend}",

        "BACKEND_NONE".enum("This backend can only perform reflection, no compiler options are supported. Maps to spirv_cross::Compiler.", "0"),
        "BACKEND_GLSL".enum("spirv_cross::CompilerGLSL"),
        "BACKEND_HLSL".enum("CompilerHLSL"),
        "BACKEND_MSL".enum("CompilerMSL"),
        "BACKEND_CPP".enum("CompilerCPP"),
        "BACKEND_JSON".enum("CompilerReflection w/ JSON backend")
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_resource_type})
        """,

        "RESOURCE_TYPE_UNKNOWN".enum("", "0"),
        "RESOURCE_TYPE_UNIFORM_BUFFER".enum,
        "RESOURCE_TYPE_STORAGE_BUFFER".enum,
        "RESOURCE_TYPE_STAGE_INPUT".enum,
        "RESOURCE_TYPE_STAGE_OUTPUT".enum,
        "RESOURCE_TYPE_SUBPASS_INPUT".enum,
        "RESOURCE_TYPE_STORAGE_IMAGE".enum,
        "RESOURCE_TYPE_SAMPLED_IMAGE".enum,
        "RESOURCE_TYPE_ATOMIC_COUNTER".enum,
        "RESOURCE_TYPE_PUSH_CONSTANT".enum,
        "RESOURCE_TYPE_SEPARATE_IMAGE".enum,
        "RESOURCE_TYPE_SEPARATE_SAMPLERS".enum,
        "RESOURCE_TYPE_ACCELERATION_STRUCTURE".enum
    )

    EnumConstant(
        """
        Maps to spirv_cross::SPIRType::BaseType.

        ({@code spvc_basetype})
        """,

        "BASETYPE_UNKNOWN".enum("", "0"),
        "BASETYPE_VOID".enum,
        "BASETYPE_BOOLEAN".enum,
        "BASETYPE_INT8".enum,
        "BASETYPE_UINT8".enum,
        "BASETYPE_INT16".enum,
        "BASETYPE_UINT16".enum,
        "BASETYPE_INT32".enum,
        "BASETYPE_UINT32".enum,
        "BASETYPE_INT64".enum,
        "BASETYPE_UINT64".enum,
        "BASETYPE_ATOMIC_COUNTER".enum,
        "BASETYPE_FP16".enum,
        "BASETYPE_FP32".enum,
        "BASETYPE_FP64".enum,
        "BASETYPE_STRUCT".enum,
        "BASETYPE_IMAGE".enum,
        "BASETYPE_SAMPLED_IMAGE".enum,
        "BASETYPE_SAMPLER".enum,
        "BASETYPE_ACCELERATION_STRUCTURE".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_platform})
        """,

        "MSL_PLATFORM_IOS".enum("", "0"),
        "MSL_PLATFORM_MACOS".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_vertex_format})
        """,

        "MSL_VERTEX_FORMAT_OTHER".enum("", "0"),
        "MSL_VERTEX_FORMAT_UINT8".enum,
        "MSL_VERTEX_FORMAT_UINT16".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_coord})
        """,

        "MSL_SAMPLER_COORD_NORMALIZED".enum("", "0"),
        "MSL_SAMPLER_COORD_PIXEL".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_filter})
        """,

        "MSL_SAMPLER_FILTER_NEAREST".enum("", "0"),
        "MSL_SAMPLER_FILTER_LINEAR".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_mip_filter})
        """,

        "MSL_SAMPLER_MIP_FILTER_NONE".enum("", "0"),
        "MSL_SAMPLER_MIP_FILTER_NEAREST".enum,
        "MSL_SAMPLER_MIP_FILTER_LINEAR".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_address})
        """,

        "MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO".enum("", "0"),
        "MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE".enum,
        "MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER".enum,
        "MSL_SAMPLER_ADDRESS_REPEAT".enum,
        "MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_compare_func})
        """,

        "MSL_SAMPLER_COMPARE_FUNC_NEVER".enum("", "0"),
        "MSL_SAMPLER_COMPARE_FUNC_LESS".enum,
        "MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_GREATER".enum,
        "MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_ALWAYS".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_border_color})
        """,

        "MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK".enum("", "0"),
        "MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK".enum,
        "MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_format_resolution})
        """,

        "MSL_FORMAT_RESOLUTION_444".enum("", "0"),
        "MSL_FORMAT_RESOLUTION_422".enum,
        "MSL_FORMAT_RESOLUTION_420".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_chroma_location})
        """,

        "MSL_CHROMA_LOCATION_COSITED_EVEN".enum("", "0"),
        "MSL_CHROMA_LOCATION_MIDPOINT".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_component_swizzle})
        """,

        "MSL_COMPONENT_SWIZZLE_IDENTITY".enum("", "0"),
        "MSL_COMPONENT_SWIZZLE_ZERO".enum,
        "MSL_COMPONENT_SWIZZLE_ONE".enum,
        "MSL_COMPONENT_SWIZZLE_R".enum,
        "MSL_COMPONENT_SWIZZLE_G".enum,
        "MSL_COMPONENT_SWIZZLE_B".enum,
        "MSL_COMPONENT_SWIZZLE_A".enum
    )

    EnumConstant(
        """
        Maps to C++ API.

        ({@code spvc_msl_sampler_ycbcr_model_conversion})
        """,

        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY".enum("", "0"),
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY".enum,
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709".enum,
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601".enum,
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020".enum
    )

    EnumConstant(
        """
        Maps to C+ API.

        ({@code spvc_msl_sampler_ycbcr_range})
        """,

        "MSL_SAMPLER_YCBCR_RANGE_ITU_FULL".enum("", "0"),
        "MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW".enum
    )

    EnumConstant(
        """
        Maps to the various spirv_cross::Compiler*::Option structures. See C++ API for defaults and details.

        ({@code spvc_compiler_option})
        """,

        "COMPILER_OPTION_UNKNOWN".enum("", "0"),
        "COMPILER_OPTION_FORCE_TEMPORARY".enum("", "1 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS".enum("", "2 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_FIXUP_DEPTH_CONVENTION".enum("", "3 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_FLIP_VERTEX_Y".enum("", "4 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE".enum("", "5 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS".enum("", "6 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION".enum("", "7 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_VERSION".enum("", "8 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ES".enum("", "9 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_VULKAN_SEMANTICS".enum("", "10 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP".enum("", "11 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP".enum("", "12 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_HLSL_SHADER_MODEL".enum("", "13 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT".enum("", "14 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_POINT_COORD_COMPAT".enum("", "15 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE".enum("", "16 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_MSL_VERSION".enum("", "17 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH".enum("", "18 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_AUX_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "19 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "19 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "20 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "21 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "22 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "23 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "24 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "25 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DISABLE_RASTERIZATION".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "26 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "27 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "28 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "29 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "30 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_PLATFORM".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "31 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ARGUMENT_BUFFERS".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "32 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "33 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "34 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "35 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "36 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_EMIT_LINE_DIRECTIVES".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "37 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_MSL_MULTIVIEW".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "38 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "39 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DEVICE_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "40 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "41 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DISPATCH_BASE".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "42 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX".enum("Obsolete, use SWIZZLE_BUFFER_INDEX instead.", "43 | SPVC_COMPILER_OPTION_MSL_BIT")
    )

    void(
        "get_version",
        "Gets the {@code SPVC_C_API_VERSION_*} used to build this library. Can be used to check for ABI mismatch if so-versioning did not catch it.",

        Check(1)..unsigned_int.p("major", ""),
        Check(1)..unsigned_int.p("minor", ""),
        Check(1)..unsigned_int.p("patch", "")
    )

    charUTF8.const.p(
        "get_commit_revision_and_timestamp",
        "Gets a human readable version string to identify which commit a particular binary was created from.",

        void()
    )

    void(
        "msl_vertex_attribute_init",
        "Initializes the vertex attribute struct.",

        spvc_msl_vertex_attribute.p("attr", "")
    )

    void(
        "msl_resource_binding_init",
        "Initializes the resource binding struct. The defaults are non-zero.",

        spvc_msl_resource_binding.p("binding", "")
    )

    unsigned_int(
        "msl_get_aux_buffer_struct_version",
        "Runtime check for incompatibility. Obsolete.",

        void()
    )

    void(
        "msl_constexpr_sampler_init",
        "Initializes the {@code constexpr} sampler struct. The defaults are non-zero.",

        spvc_msl_constexpr_sampler.p("sampler", "")
    )

    void(
        "msl_sampler_ycbcr_conversion_init",
        "Initializes the {@code constexpr} sampler struct. The defaults are non-zero.",

        spvc_msl_sampler_ycbcr_conversion.p("conv", "")
    )

    spvc_result(
        "context_create",
        """
        Context is the highest-level API construct.
        
        The context owns all memory allocations made by its child object hierarchy, including various non-opaque structs and strings. This means that the API
        user only has to care about one "destroy" call ever when using the C API. All pointers handed out by the APIs are only valid as long as the context is
        alive and #context_release_allocations() has not been called.
        """,

        Check(1)..spvc_context.p("context", "")
    )

    void(
        "context_destroy",
        "Frees all memory allocations and objects associated with the context and its child objects.",

        spvc_context("context", "")
    )

    void(
        "context_release_allocations",
        "Frees all memory allocations and objects associated with the context and its child objects, but keeps the context alive.",

        spvc_context("context", "")
    )

    charUTF8.const.p(
        "context_get_last_error_string",
        "Get the string for the last error which was logged.",

        spvc_context("context", "")
    )

    void(
        "context_set_error_callback",
        "Get notified in a callback when an error triggers. Useful for debugging.",

        spvc_context("context", ""),
        spvc_error_callback("cb", ""),
        nullable..opaque_p("userdata", "")
    )

    spvc_result(
        "context_parse_spirv",
        "SPIR-V parsing interface. Maps to {@code Parser} which then creates a {@code ParsedIR}, and that IR is extracted into the handle.",

        spvc_context("context", ""),
        Check(1)..SpvId.const.p("spirv", ""),
        size_t("word_count", ""),
        Check(1)..spvc_parsed_ir.p("parsed_ir", "")
    )

    spvc_result(
        "context_create_compiler",
        """
        Create a compiler backend.
        
        Capture mode controls if we construct by copy or move semantics. It is always recommended to use #CAPTURE_MODE_TAKE_OWNERSHIP if you only intend to
        cross-compile the IR once.
        """,

        spvc_context("context", ""),
        spvc_backend("backend", ""),
        spvc_parsed_ir("parsed_ir", ""),
        spvc_capture_mode("mode", ""),
        Check(1)..spvc_compiler.p("compiler", "")
    )

    unsigned_int(
        "compiler_get_current_id_bound",
        "Maps directly to C++ API.",

        spvc_compiler("compiler", "")
    )

    spvc_result(
        "compiler_create_compiler_options",
        "Create compiler options, which will initialize defaults.",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_compiler_options.p("options", "")
    )

    spvc_result(
        "compiler_options_set_bool",
        "Override options. Will return error if e.g. MSL options are used for the HLSL backend, etc.",

        spvc_compiler_options("options", ""),
        spvc_compiler_option("option", ""),
        spvc_bool("value", "")
    )

    spvc_result(
        "compiler_options_set_uint",
        "",

        spvc_compiler_options("options", ""),
        spvc_compiler_option("option", ""),
        unsigned_int("value", "")
    )

    spvc_result(
        "compiler_install_compiler_options",
        "Set compiler options.",

        spvc_compiler("compiler", ""),
        spvc_compiler_options("options", "")
    )

    spvc_result(
        "compiler_compile",
        "Compile IR into a string.",

        spvc_compiler("compiler", ""),
        Check(1)..charUTF8.const.p.p("source", "owned by the context, and caller must not free it themselves")
    )

    spvc_result(
        "compiler_add_header_line",
        "Maps to C++ API.",

        spvc_compiler("compiler", ""),
        charUTF8.const.p("line", "")
    )

    spvc_result(
        "compiler_require_extension",
        "",

        spvc_compiler("compiler", ""),
        charUTF8.const.p("ext", "")
    )

    spvc_result(
        "compiler_flatten_buffer_block",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", "")
    )

    spvc_result(
        "compiler_hlsl_set_root_constants_layout",
        "HLSL specifics. Maps to C++ API.",

        spvc_compiler("compiler", ""),
        spvc_hlsl_root_constants.const.p("constant_info", ""),
        size_t("count", "")
    )

    spvc_result(
        "compiler_hlsl_add_vertex_attribute_remap",
        "",

        spvc_compiler("compiler", ""),
        spvc_hlsl_vertex_attribute_remap.const.p("remap", ""),
        size_t("remaps", "")
    )

    spvc_variable_id(
        "compiler_hlsl_remap_num_workgroups_builtin",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_bool(
        "compiler_msl_is_rasterization_disabled",
        "MSL specifics. Maps to C++ API.",

        spvc_compiler("compiler", "")
    )

    spvc_bool(
        "compiler_msl_needs_swizzle_buffer",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_bool(
        "compiler_msl_needs_buffer_size_buffer",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_bool(
        "compiler_msl_needs_output_buffer",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_bool(
        "compiler_msl_needs_patch_output_buffer",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_bool(
        "compiler_msl_needs_input_threadgroup_mem",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_result(
        "compiler_msl_add_vertex_attribute",
        "",

        spvc_compiler("compiler", ""),
        spvc_msl_vertex_attribute.const.p("attrs", "")
    )

    spvc_result(
        "compiler_msl_add_resource_binding",
        "",

        spvc_compiler("compiler", ""),
        spvc_msl_resource_binding.const.p("binding", "")
    )

    spvc_result(
        "compiler_msl_add_discrete_descriptor_set",
        "",

        spvc_compiler("compiler", ""),
        unsigned_int("desc_set", "")
    )

    spvc_bool(
        "compiler_msl_is_vertex_attribute_used",
        "",

        spvc_compiler("compiler", ""),
        unsigned_int("location", "")
    )

    spvc_bool(
        "compiler_msl_is_resource_used",
        "",

        spvc_compiler("compiler", ""),
        SpvExecutionModel("model", ""),
        unsigned_int("set", ""),
        unsigned_int("binding", "")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", ""),
        spvc_msl_constexpr_sampler.const.p("sampler", "")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler_by_binding",
        "",

        spvc_compiler("compiler", ""),
        unsigned_int("desc_set", ""),
        unsigned_int("binding", ""),
        spvc_msl_constexpr_sampler.const.p("sampler", "")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler_ycbcr",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", ""),
        spvc_msl_constexpr_sampler.const.p("sampler", ""),
        spvc_msl_sampler_ycbcr_conversion.const.p("conv", "")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler_by_binding_ycbcr",
        "",

        spvc_compiler("compiler", ""),
        unsigned_int("desc_set", ""),
        unsigned_int("binding", ""),
        spvc_msl_constexpr_sampler.const.p("sampler", ""),
        spvc_msl_sampler_ycbcr_conversion.const.p("conv", "")
    )

    spvc_result(
        "compiler_msl_set_fragment_output_components",
        "",

        spvc_compiler("compiler", ""),
        unsigned_int("location", ""),
        unsigned_int("components", "")
    )

    unsigned_int(
        "compiler_msl_get_automatic_resource_binding",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", "")
    )

    unsigned_int(
        "compiler_msl_get_automatic_resource_binding_secondary",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", "")
    )

    spvc_result(
        "compiler_msl_add_dynamic_buffer",
        "",

        spvc_compiler("compiler", ""),
        unsigned_int("desc_set", ""),
        unsigned_int("binding", ""),
        unsigned_int("index", "")
    )

    spvc_result(
        "compiler_get_active_interface_variables",
        "Reflect resources. Maps almost 1:1 to C++ API.",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_set.p("set", "")
    )

    spvc_result(
        "compiler_set_enabled_interface_variables",
        "",

        spvc_compiler("compiler", ""),
        spvc_set("set", "")
    )

    spvc_result(
        "compiler_create_shader_resources",
        "",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_resources.p("resources", "")
    )

    spvc_result(
        "compiler_create_shader_resources_for_active_variables",
        "",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_resources.p("resources", ""),
        spvc_set("active", "")
    )

    spvc_result(
        "resources_get_resource_list_for_type",
        "",

        spvc_resources("resources", ""),
        spvc_resource_type("type", ""),
        Check(1)..spvc_reflected_resource.const.p.p("resource_list", ""),
        Check(1)..size_t.p("resource_size", "")
    )

    void(
        "compiler_set_decoration",
        "Decorations. Maps to C++ API.",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        SpvDecoration("decoration", ""),
        unsigned_int("argument", "")
    )

    void(
        "compiler_set_decoration_string",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        SpvDecoration("decoration", ""),
        charUTF8.const.p("argument", "")
    )

    void(
        "compiler_set_name",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        charUTF8.const.p("argument", "")
    )

    void(
        "compiler_set_member_decoration",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        SpvDecoration("decoration", ""),
        unsigned_int("argument", "")
    )

    void(
        "compiler_set_member_decoration_string",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        SpvDecoration("decoration", ""),
        charUTF8.const.p("argument", "")
    )

    void(
        "compiler_set_member_name",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        charUTF8.const.p("argument", "")
    )

    void(
        "compiler_unset_decoration",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        SpvDecoration("decoration", "")
    )

    void(
        "compiler_unset_member_decoration",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        SpvDecoration("decoration", "")
    )

    spvc_bool(
        "compiler_has_decoration",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        SpvDecoration("decoration", "")
    )

    spvc_bool(
        "compiler_has_member_decoration",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        SpvDecoration("decoration", "")
    )

    charUTF8.const.p(
        "compiler_get_name",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", "")
    )

    unsigned_int(
        "compiler_get_decoration",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        SpvDecoration("decoration", "")
    )

    charUTF8.const.p(
        "compiler_get_decoration_string",
        "",

        spvc_compiler("compiler", ""),
        SpvId("id", ""),
        SpvDecoration("decoration", "")
    )

    unsigned_int(
        "compiler_get_member_decoration",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        SpvDecoration("decoration", "")
    )

    charUTF8.const.p(
        "compiler_get_member_decoration_string",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", ""),
        SpvDecoration("decoration", "")
    )

    charUTF8.const.p(
        "compiler_get_member_name",
        "",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", ""),
        unsigned_int("member_index", "")
    )

    spvc_result(
        "compiler_get_entry_points",
        "Entry points. Maps to C++ API.",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_entry_point.const.p.p("entry_points", ""),
        Check(1)..size_t.p("num_entry_points", "")
    )

    spvc_result(
        "compiler_set_entry_point",
        "",

        spvc_compiler("compiler", ""),
        charUTF8.const.p("name", ""),
        SpvExecutionModel("model", "")
    )

    spvc_result(
        "compiler_rename_entry_point",
        "",

        spvc_compiler("compiler", ""),
        charUTF8.const.p("old_name", ""),
        charUTF8.const.p("new_name", ""),
        SpvExecutionModel("model", "")
    )

    charUTF8.const.p(
        "compiler_get_cleansed_entry_point_name",
        "",

        spvc_compiler("compiler", ""),
        charUTF8.const.p("name", ""),
        SpvExecutionModel("model", "")
    )

    void(
        "compiler_set_execution_mode",
        "",

        spvc_compiler("compiler", ""),
        SpvExecutionMode("mode", "")
    )

    void(
        "compiler_unset_execution_mode",
        "",

        spvc_compiler("compiler", ""),
        SpvExecutionMode("mode", "")
    )

    void(
        "compiler_set_execution_mode_with_arguments",
        "",

        spvc_compiler("compiler", ""),
        SpvExecutionMode("mode", ""),
        unsigned_int("arg0", ""),
        unsigned_int("arg1", ""),
        unsigned_int("arg2", "")
    )

    spvc_result(
        "compiler_get_execution_modes",
        "",

        spvc_compiler("compiler", ""),
        Check(1)..SpvExecutionMode.const.p.p("modes", ""),
        Check(1)..size_t.p("num_modes", "")
    )

    unsigned_int(
        "compiler_get_execution_mode_argument",
        "",

        spvc_compiler("compiler", ""),
        SpvExecutionMode("mode", "")
    )

    unsigned_int(
        "compiler_get_execution_mode_argument_by_index",
        "",

        spvc_compiler("compiler", ""),
        SpvExecutionMode("mode", ""),
        unsigned_int("index", "")
    )

    SpvExecutionModel(
        "compiler_get_execution_model",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_type(
        "compiler_get_type_handle",
        "Type query interface. Maps to C++ API, except it's read-only.",

        spvc_compiler("compiler", ""),
        spvc_type_id("id", "")
    )

    spvc_basetype(
        "type_get_basetype",
        "",

        spvc_type("type", "")
    )

    unsigned_int(
        "type_get_bit_width",
        "",

        spvc_type("type", "")
    )

    unsigned_int(
        "type_get_vector_size",
        "",

        spvc_type("type", "")
    )

    unsigned_int(
        "type_get_columns",
        "",

        spvc_type("type", "")
    )

    unsigned_int(
        "type_get_num_array_dimensions",
        "",

        spvc_type("type", "")
    )

    spvc_bool(
        "type_array_dimension_is_literal",
        "",

        spvc_type("type", ""),
        unsigned_int("dimension", "")
    )

    SpvId(
        "type_get_array_dimension",
        "",

        spvc_type("type", ""),
        unsigned_int("dimension", "")
    )

    unsigned_int(
        "type_get_num_member_types",
        "",

        spvc_type("type", "")
    )

    spvc_type_id(
        "type_get_member_type",
        "",

        spvc_type("type", ""),
        unsigned_int("index", "")
    )

    SpvStorageClass(
        "type_get_storage_class",
        "",

        spvc_type("type", "")
    )

    spvc_type_id(
        "type_get_image_sampled_type",
        "Image type query.",

        spvc_type("type", "")
    )

    SpvDim(
        "type_get_image_dimension",
        "",

        spvc_type("type", "")
    )

    spvc_bool(
        "type_get_image_is_depth",
        "",

        spvc_type("type", "")
    )

    spvc_bool(
        "type_get_image_arrayed",
        "",

        spvc_type("type", "")
    )

    spvc_bool(
        "type_get_image_multisampled",
        "",

        spvc_type("type", "")
    )

    spvc_bool(
        "type_get_image_is_storage",
        "",

        spvc_type("type", "")
    )

    SpvImageFormat(
        "type_get_image_storage_format",
        "",

        spvc_type("type", "")
    )

    SpvAccessQualifier(
        "type_get_image_access_qualifier",
        "",

        spvc_type("type", "")
    )

    spvc_result(
        "compiler_get_declared_struct_size",
        "Buffer layout query. Maps to C++ API.",

        spvc_compiler("compiler", ""),
        spvc_type("struct_type", ""),
        Check(1)..size_t.p("size", "")
    )

    spvc_result(
        "compiler_get_declared_struct_size_runtime_array",
        "",

        spvc_compiler("compiler", ""),
        spvc_type("struct_type", ""),
        size_t("array_size", ""),
        Check(1)..size_t.p("size", "")
    )

    spvc_result(
        "compiler_get_declared_struct_member_size",
        "",

        spvc_compiler("compiler", ""),
        spvc_type("type", ""),
        unsigned_int("index", ""),
        Check(1)..size_t.p("size", "")
    )

    spvc_result(
        "compiler_type_struct_member_offset",
        "",

        spvc_compiler("compiler", ""),
        spvc_type("type", ""),
        unsigned_int("index", ""),
        Check(1)..unsigned_int.p("offset", "")
    )

    spvc_result(
        "compiler_type_struct_member_array_stride",
        "",

        spvc_compiler("compiler", ""),
        spvc_type("type", ""),
        unsigned_int("index", ""),
        Check(1)..unsigned_int.p("stride", "")
    )

    spvc_result(
        "compiler_type_struct_member_matrix_stride",
        "",

        spvc_compiler("compiler", ""),
        spvc_type("type", ""),
        unsigned_int("index", ""),
        Check(1)..unsigned_int.p("stride", "")
    )

    spvc_result(
        "compiler_build_dummy_sampler_for_combined_images",
        "Workaround helper functions. Maps to C++ API.",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_variable_id.p("id", "")
    )

    spvc_result(
        "compiler_build_combined_image_samplers",
        "",

        spvc_compiler("compiler", "")
    )

    spvc_result(
        "compiler_get_combined_image_samplers",
        "",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_combined_image_sampler.const.p.p("samplers", ""),
        Check(1)..size_t.p("num_samplers", "")
    )

    spvc_result(
        "compiler_get_specialization_constants",
        "Constants Maps to C++ API.",

        spvc_compiler("compiler", ""),
        Check(1)..spvc_specialization_constant.const.p.p("constants", ""),
        Check(1)..size_t.p("num_constants", "")
    )

    spvc_constant(
        "compiler_get_constant_handle",
        "",

        spvc_compiler("compiler", ""),
        spvc_constant_id("id", "")
    )

    spvc_constant_id(
        "compiler_get_work_group_size_specialization_constants",
        "",

        spvc_compiler("compiler", ""),
        spvc_specialization_constant.p("x", ""),
        spvc_specialization_constant.p("y", ""),
        spvc_specialization_constant.p("z", "")
    )

    spvc_result(
        "compiler_get_active_buffer_ranges",
        "Buffer ranges Maps to C++ API.",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", ""),
        Check(1)..spvc_buffer_range.const.p.p("ranges", ""),
        Check(1)..size_t.p("num_ranges", "")
    )

    float(
        "constant_get_scalar_fp16",
        """
        No stdint.h until C99, sigh :( For smaller types, the result is sign or zero-extended as appropriate. Maps to C++ API. TODO: The SPIRConstant query
        interface and modification interface is not quite complete.
        """,

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    float(
        "constant_get_scalar_fp32",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    double(
        "constant_get_scalar_fp64",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    unsigned_int(
        "constant_get_scalar_u32",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    int(
        "constant_get_scalar_i32",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    unsigned_int(
        "constant_get_scalar_u16",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    int(
        "constant_get_scalar_i16",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    unsigned_int(
        "constant_get_scalar_u8",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    int(
        "constant_get_scalar_i8",
        "",

        spvc_constant("constant", ""),
        unsigned_int("column", ""),
        unsigned_int("row", "")
    )

    void(
        "constant_get_subconstants",
        "",

        spvc_constant("constant", ""),
        Check(1)..spvc_constant_id.const.p.p("constituents", ""),
        Check(1)..size_t.p("count", "")
    )

    spvc_type_id(
        "constant_get_type",
        "",

        spvc_constant("constant", "")
    )

    spvc_bool(
        "compiler_get_binary_offset_for_decoration",
        "Misc reflection Maps to C++ API.",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", ""),
        SpvDecoration("decoration", ""),
        Check(1)..unsigned_int.p("word_offset", "")
    )

    spvc_bool(
        "compiler_buffer_is_hlsl_counter_buffer",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", "")
    )

    spvc_bool(
        "compiler_buffer_get_hlsl_counter_buffer",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", ""),
        Check(1)..spvc_variable_id.p("counter_id", "")
    )

    spvc_result(
        "compiler_get_declared_capabilities",
        "",

        spvc_compiler("compiler", ""),
        Check(1)..SpvCapability.const.p.p("capabilities", ""),
        Check(1)..size_t.p("num_capabilities", "")
    )

    spvc_result(
        "compiler_get_declared_extensions",
        "",

        spvc_compiler("compiler", ""),
        Check(1)..charUTF8.const.p.p.p("extensions", ""),
        Check(1)..size_t.p("num_extensions", "")
    )

    charUTF8.const.p(
        "compiler_get_remapped_declared_block_name",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", "")
    )

    spvc_result(
        "compiler_get_buffer_block_decorations",
        "",

        spvc_compiler("compiler", ""),
        spvc_variable_id("id", ""),
        Check(1)..SpvDecoration.const.p.p("decorations", ""),
        Check(1)..size_t.p("num_decorations", "")
    )
}
