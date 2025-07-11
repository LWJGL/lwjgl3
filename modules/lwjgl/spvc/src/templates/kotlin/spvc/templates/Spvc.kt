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
    IntConstant(
        "C_API_VERSION_MAJOR".."0",
        "C_API_VERSION_MINOR".."66",
        "C_API_VERSION_PATCH".."0"
    )

    IntConstant(
        "COMPILER_OPTION_COMMON_BIT"..0x1000000,
        "COMPILER_OPTION_GLSL_BIT"..0x2000000,
        "COMPILER_OPTION_HLSL_BIT"..0x4000000,
        "COMPILER_OPTION_MSL_BIT"..0x8000000,
        "COMPILER_OPTION_LANG_BITS"..0x0f000000,
        "COMPILER_OPTION_ENUM_BITS"..0xffffff
    )

    IntConstant(
        "MSL_PUSH_CONSTANT_DESC_SET".."~0",
        "MSL_PUSH_CONSTANT_BINDING".."0",
        "MSL_SWIZZLE_BUFFER_BINDING".."~1",
        "MSL_BUFFER_SIZE_BUFFER_BINDING".."~2",
        "MSL_ARGUMENT_BUFFER_BINDING".."~3"
    )

    IntConstant("MSL_AUX_BUFFER_STRUCT_VERSION"..1)

    EnumConstant(
        "SUCCESS".enum("0"),
        "ERROR_INVALID_SPIRV".enum("-1"),
        "ERROR_UNSUPPORTED_SPIRV".enum("-2"),
        "ERROR_OUT_OF_MEMORY".enum("-3"),
        "ERROR_INVALID_ARGUMENT".enum("-4")
    )

    EnumConstant(
        "CAPTURE_MODE_COPY".enum("0"),
        "CAPTURE_MODE_TAKE_OWNERSHIP".enum
    )

    EnumConstant(
        "BACKEND_NONE".enum("0"),
        "BACKEND_GLSL".enum,
        "BACKEND_HLSL".enum,
        "BACKEND_MSL".enum,
        "BACKEND_CPP".enum,
        "BACKEND_JSON".enum
    )

    EnumConstant(
        "RESOURCE_TYPE_UNKNOWN".enum("0"),
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
        "RESOURCE_TYPE_ACCELERATION_STRUCTURE".enum,
        "RESOURCE_TYPE_RAY_QUERY".enum,
        "RESOURCE_TYPE_SHADER_RECORD_BUFFER".enum,
        "RESOURCE_TYPE_GL_PLAIN_UNIFORM".enum
    )

    EnumConstant(
        "BUILTIN_RESOURCE_TYPE_UNKNOWN".enum("0"),
        "BUILTIN_RESOURCE_TYPE_STAGE_INPUT".enum,
        "BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT".enum
    )

    EnumConstant(
        "BASETYPE_UNKNOWN".enum("0"),
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
        "MSL_PLATFORM_IOS".enum("0"),
        "MSL_PLATFORM_MACOS".enum
    )

    EnumConstant(
        "MSL_INDEX_TYPE_NONE".enum("0"),
        "MSL_INDEX_TYPE_UINT16".enum,
        "MSL_INDEX_TYPE_UINT32".enum
    )

    EnumConstant(
        "MSL_SHADER_VARIABLE_FORMAT_OTHER".enum("0"),
        "MSL_SHADER_VARIABLE_FORMAT_UINT8".enum,
        "MSL_SHADER_VARIABLE_FORMAT_UINT16".enum,
        "MSL_SHADER_VARIABLE_FORMAT_ANY16".enum,
        "MSL_SHADER_VARIABLE_FORMAT_ANY32".enum
    )

    EnumConstant(
        "MSL_VERTEX_FORMAT_OTHER".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER"),
        "MSL_VERTEX_FORMAT_UINT8".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8"),
        "MSL_VERTEX_FORMAT_UINT16".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16")
    )

    EnumConstant(
        "MSL_SHADER_INPUT_FORMAT_OTHER".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER"),
        "MSL_SHADER_INPUT_FORMAT_UINT8".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8"),
        "MSL_SHADER_INPUT_FORMAT_UINT16".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16"),
        "MSL_SHADER_INPUT_FORMAT_ANY16".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY16"),
        "MSL_SHADER_INPUT_FORMAT_ANY32".enum("SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY32")
    )

    EnumConstant(
        "MSL_SHADER_VARIABLE_RATE_PER_VERTEX".enum("0"),
        "MSL_SHADER_VARIABLE_RATE_PER_PRIMITIVE".enum,
        "MSL_SHADER_VARIABLE_RATE_PER_PATCH".enum,
    )

    EnumConstant(
        "MSL_SAMPLER_COORD_NORMALIZED".enum("0"),
        "MSL_SAMPLER_COORD_PIXEL".enum
    )

    EnumConstant(
        "MSL_SAMPLER_FILTER_NEAREST".enum("0"),
        "MSL_SAMPLER_FILTER_LINEAR".enum
    )

    EnumConstant(
        "MSL_SAMPLER_MIP_FILTER_NONE".enum("0"),
        "MSL_SAMPLER_MIP_FILTER_NEAREST".enum,
        "MSL_SAMPLER_MIP_FILTER_LINEAR".enum
    )

    EnumConstant(
        "MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO".enum("0"),
        "MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE".enum,
        "MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER".enum,
        "MSL_SAMPLER_ADDRESS_REPEAT".enum,
        "MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT".enum
    )

    EnumConstant(
        "MSL_SAMPLER_COMPARE_FUNC_NEVER".enum("0"),
        "MSL_SAMPLER_COMPARE_FUNC_LESS".enum,
        "MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_GREATER".enum,
        "MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL".enum,
        "MSL_SAMPLER_COMPARE_FUNC_ALWAYS".enum
    )

    EnumConstant(
        "MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK".enum("0"),
        "MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK".enum,
        "MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE".enum
    )

    EnumConstant(
        "MSL_FORMAT_RESOLUTION_444".enum("0"),
        "MSL_FORMAT_RESOLUTION_422".enum,
        "MSL_FORMAT_RESOLUTION_420".enum
    )

    EnumConstant(
        "MSL_CHROMA_LOCATION_COSITED_EVEN".enum("0"),
        "MSL_CHROMA_LOCATION_MIDPOINT".enum
    )

    EnumConstant(
        "MSL_COMPONENT_SWIZZLE_IDENTITY".enum("0"),
        "MSL_COMPONENT_SWIZZLE_ZERO".enum,
        "MSL_COMPONENT_SWIZZLE_ONE".enum,
        "MSL_COMPONENT_SWIZZLE_R".enum,
        "MSL_COMPONENT_SWIZZLE_G".enum,
        "MSL_COMPONENT_SWIZZLE_B".enum,
        "MSL_COMPONENT_SWIZZLE_A".enum
    )

    EnumConstant(
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY".enum("0"),
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY".enum,
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709".enum,
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601".enum,
        "MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020".enum
    )

    EnumConstant(
        "MSL_SAMPLER_YCBCR_RANGE_ITU_FULL".enum("0"),
        "MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW".enum
    )

    EnumConstant(
        "HLSL_BINDING_AUTO_NONE_BIT".enum("0"),
        "HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT".enum("1 << 0"),
	    "HLSL_BINDING_AUTO_CBV_BIT".enum("1 << 1"),
        "HLSL_BINDING_AUTO_SRV_BIT".enum("1 << 2"),
        "HLSL_BINDING_AUTO_UAV_BIT".enum("1 << 3"),
        "HLSL_BINDING_AUTO_SAMPLER_BIT".enum("1 << 4"),
        "HLSL_BINDING_AUTO_ALL".enum(0x7fffffff)
    )

    IntConstant(
        "HLSL_PUSH_CONSTANT_DESC_SET".."~0"
    )

    IntConstant(
        "HLSL_PUSH_CONSTANT_BINDING".."0"
    )

    EnumConstant(
        "COMPILER_OPTION_UNKNOWN".enum("0"),
        "COMPILER_OPTION_FORCE_TEMPORARY".enum("1 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS".enum("2 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_FIXUP_DEPTH_CONVENTION".enum("3 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_FLIP_VERTEX_Y".enum("4 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE".enum("5 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS".enum("6 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION".enum("7 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_VERSION".enum("8 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ES".enum("9 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_VULKAN_SEMANTICS".enum("10 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP".enum("11 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP".enum("12 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_HLSL_SHADER_MODEL".enum("13 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT".enum("14 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_POINT_COORD_COMPAT".enum("15 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE".enum("16 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_MSL_VERSION".enum("17 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH".enum("18 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_AUX_BUFFER_INDEX".enum("19 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX".enum("19 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX".enum("20 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX".enum("21 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX".enum("22 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX".enum("23 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX".enum("24 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN".enum("25 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DISABLE_RASTERIZATION".enum("26 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER".enum("27 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES".enum("28 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS".enum("29 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT".enum("30 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_PLATFORM".enum("31 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ARGUMENT_BUFFERS".enum("32 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER".enum("33 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE".enum("34 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS".enum("35 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX".enum("36 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_EMIT_LINE_DIRECTIVES".enum("37 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_MSL_MULTIVIEW".enum("38 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX".enum("39 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DEVICE_INDEX".enum("40 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX".enum("41 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DISPATCH_BASE".enum("42 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX".enum("43 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_TEXTURE_1D_AS_2D".enum("44 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_BASE_INDEX_ZERO".enum("45 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_IOS_FRAMEBUFFER_FETCH_SUBPASS".enum("46 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_FRAMEBUFFER_FETCH_SUBPASS".enum("46 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_INVARIANT_FP_MATH".enum("47 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_EMULATE_CUBEMAP_ARRAY".enum("48 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_DECORATION_BINDING".enum("49 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_FORCE_ACTIVE_ARGUMENT_BUFFER_RESOURCES".enum("50 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_FORCE_NATIVE_ARRAYS".enum("51 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_ENABLE_STORAGE_IMAGE_QUALIFIER_DEDUCTION".enum("52 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_HLSL_FORCE_STORAGE_BUFFER_AS_UAV".enum("53 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_FORCE_ZERO_INITIALIZED_VARIABLES".enum("54 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_HLSL_NONWRITABLE_UAV_TEXTURE_AS_SRV".enum("55 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_FRAG_OUTPUT_MASK".enum("56 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_FRAG_DEPTH_BUILTIN".enum("57 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_FRAG_STENCIL_REF_BUILTIN".enum("58 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_CLIP_DISTANCE_USER_VARYING".enum("59 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_HLSL_ENABLE_16BIT_TYPES".enum("60 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_MSL_MULTI_PATCH_WORKGROUP".enum("61 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_INPUT_BUFFER_INDEX".enum("62 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_INDEX_BUFFER_INDEX".enum("63 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_VERTEX_FOR_TESSELLATION".enum("64 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_VERTEX_INDEX_TYPE".enum("65 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_FORCE_FLATTENED_IO_BLOCKS".enum("66 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_MSL_MULTIVIEW_LAYERED_RENDERING".enum("67 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ARRAYED_SUBPASS_INPUT".enum("68 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_R32UI_LINEAR_TEXTURE_ALIGNMENT".enum("69 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_R32UI_ALIGNMENT_CONSTANT_ID".enum("70 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_HLSL_FLATTEN_MATRIX_VERTEX_INPUT_SEMANTICS".enum("71 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_MSL_IOS_USE_SIMDGROUP_FUNCTIONS".enum("72 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_EMULATE_SUBGROUPS".enum("73 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_FIXED_SUBGROUP_SIZE".enum("74 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_FORCE_SAMPLE_RATE_SHADING".enum("75 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_IOS_SUPPORT_BASE_VERTEX_INSTANCE".enum("76 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT".enum("77 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_RELAX_NAN_CHECKS".enum("78 | SPVC_COMPILER_OPTION_COMMON_BIT"),
        "COMPILER_OPTION_MSL_RAW_BUFFER_TESE_INPUT".enum("79 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SHADER_PATCH_INPUT_BUFFER_INDEX".enum("80 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_MANUAL_HELPER_INVOCATION_UPDATES".enum("81 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_CHECK_DISCARDED_FRAG_STORES".enum("82 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_GLSL_ENABLE_ROW_MAJOR_LOAD_WORKAROUND".enum("83 | SPVC_COMPILER_OPTION_GLSL_BIT"),
        "COMPILER_OPTION_MSL_ARGUMENT_BUFFERS_TIER".enum("84 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_SAMPLE_DREF_LOD_ARRAY_AS_GRAD".enum("85 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_READWRITE_TEXTURE_FENCES".enum("86 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_REPLACE_RECURSIVE_INPUTS".enum("87 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_AGX_MANUAL_CUBE_GRAD_FIXUP".enum("88 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_FORCE_FRAGMENT_WITH_SIDE_EFFECTS_EXECUTION".enum("89 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_HLSL_USE_ENTRY_POINT_NAME".enum("90 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_HLSL_PRESERVE_STRUCTURED_BUFFERS".enum("91 | SPVC_COMPILER_OPTION_HLSL_BIT"),
        "COMPILER_OPTION_MSL_AUTO_DISABLE_RASTERIZATION".enum("92 | SPVC_COMPILER_OPTION_MSL_BIT"),
        "COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_DEFAULT".enum("93 | SPVC_COMPILER_OPTION_MSL_BIT"),
    )

    void(
        "get_version",

        Check(1)..unsigned_int.p("major"),
        Check(1)..unsigned_int.p("minor"),
        Check(1)..unsigned_int.p("patch")
    )

    charUTF8.const.p(
        "get_commit_revision_and_timestamp",

        void()
    )

    void(
        "msl_vertex_attribute_init",

        spvc_msl_vertex_attribute.p("attr")
    )

    void(
        "msl_shader_interface_var_init",

        spvc_msl_shader_interface_var.p("var")
    )

    void(
        "msl_shader_input_init",

        spvc_msl_shader_input.p("input")
    )

    void(
        "msl_shader_interface_var_init_2",

        spvc_msl_shader_interface_var_2.p("var")
    )

    void(
        "msl_resource_binding_init",

        spvc_msl_resource_binding.p("binding")
    )

    void(
        "msl_resource_binding_init_2",

        spvc_msl_resource_binding_2.p("binding")
    )

    unsigned_int(
        "msl_get_aux_buffer_struct_version",

        void()
    )

    void(
        "msl_constexpr_sampler_init",

        spvc_msl_constexpr_sampler.p("sampler")
    )

    void(
        "msl_sampler_ycbcr_conversion_init",

        spvc_msl_sampler_ycbcr_conversion.p("conv")
    )

    void(
        "hlsl_resource_binding_init",

        spvc_hlsl_resource_binding.p("binding")
    )

    spvc_result(
        "context_create",

        Check(1)..spvc_context.p("context")
    )

    void(
        "context_destroy",

        spvc_context("context")
    )

    void(
        "context_release_allocations",

        spvc_context("context")
    )

    charUTF8.const.p(
        "context_get_last_error_string",

        spvc_context("context")
    )

    void(
        "context_set_error_callback",

        spvc_context("context"),
        spvc_error_callback("cb"),
        nullable..opaque_p("userdata")
    )

    spvc_result(
        "context_parse_spirv",

        spvc_context("context"),
        Check(1)..SpvId.const.p("spirv"),
        size_t("word_count"),
        Check(1)..spvc_parsed_ir.p("parsed_ir")
    )

    spvc_result(
        "context_create_compiler",

        spvc_context("context"),
        spvc_backend("backend"),
        spvc_parsed_ir("parsed_ir"),
        spvc_capture_mode("mode"),
        Check(1)..spvc_compiler.p("compiler")
    )

    unsigned_int(
        "compiler_get_current_id_bound",

        spvc_compiler("compiler")
    )

    spvc_result(
        "compiler_create_compiler_options",

        spvc_compiler("compiler"),
        Check(1)..spvc_compiler_options.p("options")
    )

    spvc_result(
        "compiler_options_set_bool",

        spvc_compiler_options("options"),
        spvc_compiler_option("option"),
        spvc_bool("value")
    )

    spvc_result(
        "compiler_options_set_uint",

        spvc_compiler_options("options"),
        spvc_compiler_option("option"),
        unsigned_int("value")
    )

    spvc_result(
        "compiler_install_compiler_options",

        spvc_compiler("compiler"),
        spvc_compiler_options("options")
    )

    spvc_result(
        "compiler_compile",

        spvc_compiler("compiler"),
        Check(1)..charUTF8.const.p.p("source")
    )

    spvc_result(
        "compiler_add_header_line",

        spvc_compiler("compiler"),
        charUTF8.const.p("line")
    )

    spvc_result(
        "compiler_require_extension",

        spvc_compiler("compiler"),
        charUTF8.const.p("ext")
    )

    size_t(
        "compiler_get_num_required_extensions",

        spvc_compiler("compiler")
    )

    charUTF8.const.p(
        "compiler_get_required_extension",

        spvc_compiler("compiler"),
        size_t("index")
    )

    spvc_result(
        "compiler_flatten_buffer_block",

        spvc_compiler("compiler"),
        spvc_variable_id("id")
    )

    spvc_bool(
        "compiler_variable_is_depth_or_compare",

        spvc_compiler("compiler"),
        spvc_variable_id("id")
    )

    spvc_result(
        "compiler_mask_stage_output_by_location",

        spvc_compiler("compiler"),
        unsigned("location"),
        unsigned("component")
    )

    spvc_result(
        "compiler_mask_stage_output_by_builtin",

        spvc_compiler("compiler"),
        SpvBuiltIn("builtin")
    )

    spvc_result(
        "compiler_hlsl_set_root_constants_layout",

        spvc_compiler("compiler"),
        spvc_hlsl_root_constants.const.p("constant_info"),
        size_t("count")
    )

    spvc_result(
        "compiler_hlsl_add_vertex_attribute_remap",

        spvc_compiler("compiler"),
        spvc_hlsl_vertex_attribute_remap.const.p("remap"),
        size_t("remaps")
    )

    spvc_variable_id(
        "compiler_hlsl_remap_num_workgroups_builtin",

        spvc_compiler("compiler")
    )

    spvc_result(
        "compiler_hlsl_set_resource_binding_flags",

        spvc_compiler("compiler"),
        spvc_hlsl_binding_flags("flags")
    )

    spvc_result(
        "compiler_hlsl_add_resource_binding",

        spvc_compiler("compiler"),
        spvc_hlsl_resource_binding.const.p("binding")
    )

    spvc_bool(
        "compiler_hlsl_is_resource_used",

        spvc_compiler("compiler"),
        SpvExecutionModel("model"),
        unsigned("set"),
        unsigned("binding")
    )

    spvc_bool(
        "compiler_msl_is_rasterization_disabled",

        spvc_compiler("compiler")
    )

    spvc_bool(
        "compiler_msl_needs_swizzle_buffer",

        spvc_compiler("compiler")
    )

    spvc_bool(
        "compiler_msl_needs_buffer_size_buffer",

        spvc_compiler("compiler")
    )

    spvc_bool(
        "compiler_msl_needs_output_buffer",

        spvc_compiler("compiler")
    )

    spvc_bool(
        "compiler_msl_needs_patch_output_buffer",

        spvc_compiler("compiler")
    )

    spvc_bool(
        "compiler_msl_needs_input_threadgroup_mem",

        spvc_compiler("compiler")
    )

    spvc_result(
        "compiler_msl_add_vertex_attribute",

        spvc_compiler("compiler"),
        spvc_msl_vertex_attribute.const.p("attrs")
    )

    spvc_result(
        "compiler_msl_add_resource_binding",

        spvc_compiler("compiler"),
        spvc_msl_resource_binding.const.p("binding")
    )

    spvc_result(
        "compiler_msl_add_resource_binding_2",

        spvc_compiler("compiler"),
        spvc_msl_resource_binding_2.const.p("binding")
    )

    spvc_result(
        "compiler_msl_add_shader_input",

        spvc_compiler("compiler"),
        spvc_msl_shader_interface_var.const.p("input")
    )

    spvc_result(
        "compiler_msl_add_shader_input_2",

        spvc_compiler("compiler"),
        spvc_msl_shader_interface_var_2.const.p("input")
    )

    spvc_result(
        "compiler_msl_add_shader_output",

        spvc_compiler("compiler"),
        spvc_msl_shader_interface_var.const.p("output")
    )

    spvc_result(
        "compiler_msl_add_shader_output_2",

        spvc_compiler("compiler"),
        spvc_msl_shader_interface_var_2.const.p("output")
    )

    spvc_result(
        "compiler_msl_add_discrete_descriptor_set",

        spvc_compiler("compiler"),
        unsigned_int("desc_set")
    )

    spvc_result(
        "compiler_msl_set_argument_buffer_device_address_space",

        spvc_compiler("compiler"),
        unsigned("desc_set"),
        spvc_bool("device_address")
    )

    spvc_bool(
        "compiler_msl_is_vertex_attribute_used",

        spvc_compiler("compiler"),
        unsigned_int("location")
    )

    spvc_bool(
        "compiler_msl_is_shader_input_used",

        spvc_compiler("compiler"),
        unsigned("location")
    )

    spvc_bool(
        "compiler_msl_is_shader_output_used",

        spvc_compiler("compiler"),
        unsigned("location")
    )

    spvc_bool(
        "compiler_msl_is_resource_used",

        spvc_compiler("compiler"),
        SpvExecutionModel("model"),
        unsigned_int("set"),
        unsigned_int("binding")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler",

        spvc_compiler("compiler"),
        spvc_variable_id("id"),
        spvc_msl_constexpr_sampler.const.p("sampler")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler_by_binding",

        spvc_compiler("compiler"),
        unsigned_int("desc_set"),
        unsigned_int("binding"),
        spvc_msl_constexpr_sampler.const.p("sampler")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler_ycbcr",

        spvc_compiler("compiler"),
        spvc_variable_id("id"),
        spvc_msl_constexpr_sampler.const.p("sampler"),
        spvc_msl_sampler_ycbcr_conversion.const.p("conv")
    )

    spvc_result(
        "compiler_msl_remap_constexpr_sampler_by_binding_ycbcr",

        spvc_compiler("compiler"),
        unsigned_int("desc_set"),
        unsigned_int("binding"),
        spvc_msl_constexpr_sampler.const.p("sampler"),
        spvc_msl_sampler_ycbcr_conversion.const.p("conv")
    )

    spvc_result(
        "compiler_msl_set_fragment_output_components",

        spvc_compiler("compiler"),
        unsigned_int("location"),
        unsigned_int("components")
    )

    unsigned_int(
        "compiler_msl_get_automatic_resource_binding",

        spvc_compiler("compiler"),
        spvc_variable_id("id")
    )

    unsigned_int(
        "compiler_msl_get_automatic_resource_binding_secondary",

        spvc_compiler("compiler"),
        spvc_variable_id("id")
    )

    spvc_result(
        "compiler_msl_add_dynamic_buffer",

        spvc_compiler("compiler"),
        unsigned_int("desc_set"),
        unsigned_int("binding"),
        unsigned_int("index")
    )

    spvc_result(
        "compiler_msl_add_inline_uniform_block",

        spvc_compiler("compiler"),
        unsigned_int("desc_set"),
        unsigned_int("binding")
    )

    spvc_result(
        "compiler_msl_set_combined_sampler_suffix",

        spvc_compiler("compiler"),
        charUTF8.const.p("suffix")
    )

    charUTF8.const.p(
        "compiler_msl_get_combined_sampler_suffix",

        spvc_compiler("compiler")
    )

    spvc_result(
        "compiler_get_active_interface_variables",

        spvc_compiler("compiler"),
        Check(1)..spvc_set.p("set")
    )

    spvc_result(
        "compiler_set_enabled_interface_variables",

        spvc_compiler("compiler"),
        spvc_set("set")
    )

    spvc_result(
        "compiler_create_shader_resources",

        spvc_compiler("compiler"),
        Check(1)..spvc_resources.p("resources")
    )

    spvc_result(
        "compiler_create_shader_resources_for_active_variables",

        spvc_compiler("compiler"),
        Check(1)..spvc_resources.p("resources"),
        spvc_set("active")
    )

    spvc_result(
        "resources_get_resource_list_for_type",

        spvc_resources("resources"),
        spvc_resource_type("type"),
        Check(1)..spvc_reflected_resource.const.p.p("resource_list"),
        Check(1)..size_t.p("resource_size")
    )

    spvc_result(
        "resources_get_builtin_resource_list_for_type",

        spvc_resources("resources"),
        spvc_builtin_resource_type("type"),
        Check(1)..spvc_reflected_builtin_resource.const.p.p("resource_list"),
        Check(1)..size_t.p("resource_size")
    )

    void(
        "compiler_set_decoration",

        spvc_compiler("compiler"),
        SpvId("id"),
        SpvDecoration("decoration"),
        unsigned_int("argument")
    )

    void(
        "compiler_set_decoration_string",

        spvc_compiler("compiler"),
        SpvId("id"),
        SpvDecoration("decoration"),
        charUTF8.const.p("argument")
    )

    void(
        "compiler_set_name",

        spvc_compiler("compiler"),
        SpvId("id"),
        charUTF8.const.p("argument")
    )

    void(
        "compiler_set_member_decoration",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        SpvDecoration("decoration"),
        unsigned_int("argument")
    )

    void(
        "compiler_set_member_decoration_string",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        SpvDecoration("decoration"),
        charUTF8.const.p("argument")
    )

    void(
        "compiler_set_member_name",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        charUTF8.const.p("argument")
    )

    void(
        "compiler_unset_decoration",

        spvc_compiler("compiler"),
        SpvId("id"),
        SpvDecoration("decoration")
    )

    void(
        "compiler_unset_member_decoration",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        SpvDecoration("decoration")
    )

    spvc_bool(
        "compiler_has_decoration",

        spvc_compiler("compiler"),
        SpvId("id"),
        SpvDecoration("decoration")
    )

    spvc_bool(
        "compiler_has_member_decoration",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        SpvDecoration("decoration")
    )

    charUTF8.const.p(
        "compiler_get_name",

        spvc_compiler("compiler"),
        SpvId("id")
    )

    unsigned_int(
        "compiler_get_decoration",

        spvc_compiler("compiler"),
        SpvId("id"),
        SpvDecoration("decoration")
    )

    charUTF8.const.p(
        "compiler_get_decoration_string",

        spvc_compiler("compiler"),
        SpvId("id"),
        SpvDecoration("decoration")
    )

    unsigned_int(
        "compiler_get_member_decoration",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        SpvDecoration("decoration")
    )

    charUTF8.const.p(
        "compiler_get_member_decoration_string",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index"),
        SpvDecoration("decoration")
    )

    charUTF8.const.p(
        "compiler_get_member_name",

        spvc_compiler("compiler"),
        spvc_type_id("id"),
        unsigned_int("member_index")
    )

    spvc_result(
        "compiler_get_entry_points",

        spvc_compiler("compiler"),
        Check(1)..spvc_entry_point.const.p.p("entry_points"),
        Check(1)..size_t.p("num_entry_points")
    )

    spvc_result(
        "compiler_set_entry_point",

        spvc_compiler("compiler"),
        charUTF8.const.p("name"),
        SpvExecutionModel("model")
    )

    spvc_result(
        "compiler_rename_entry_point",

        spvc_compiler("compiler"),
        charUTF8.const.p("old_name"),
        charUTF8.const.p("new_name"),
        SpvExecutionModel("model")
    )

    charUTF8.const.p(
        "compiler_get_cleansed_entry_point_name",

        spvc_compiler("compiler"),
        charUTF8.const.p("name"),
        SpvExecutionModel("model")
    )

    void(
        "compiler_set_execution_mode",

        spvc_compiler("compiler"),
        SpvExecutionMode("mode")
    )

    void(
        "compiler_unset_execution_mode",

        spvc_compiler("compiler"),
        SpvExecutionMode("mode")
    )

    void(
        "compiler_set_execution_mode_with_arguments",

        spvc_compiler("compiler"),
        SpvExecutionMode("mode"),
        unsigned_int("arg0"),
        unsigned_int("arg1"),
        unsigned_int("arg2")
    )

    spvc_result(
        "compiler_get_execution_modes",

        spvc_compiler("compiler"),
        Check(1)..SpvExecutionMode.const.p.p("modes"),
        Check(1)..size_t.p("num_modes")
    )

    unsigned_int(
        "compiler_get_execution_mode_argument",

        spvc_compiler("compiler"),
        SpvExecutionMode("mode")
    )

    unsigned_int(
        "compiler_get_execution_mode_argument_by_index",

        spvc_compiler("compiler"),
        SpvExecutionMode("mode"),
        unsigned_int("index")
    )

    SpvExecutionModel(
        "compiler_get_execution_model",

        spvc_compiler("compiler")
    )

    void(
        "compiler_update_active_builtins",

        spvc_compiler("compiler")
    )

    spvc_bool(
        "compiler_has_active_builtin",

        spvc_compiler("compiler"),
        SpvBuiltIn("builtin"),
        SpvStorageClass("storage")
    )

    spvc_type(
        "compiler_get_type_handle",

        spvc_compiler("compiler"),
        spvc_type_id("id")
    )

    spvc_type_id(
        "type_get_base_type_id",

        spvc_type("type")
    )

    spvc_basetype(
        "type_get_basetype",

        spvc_type("type")
    )

    unsigned_int(
        "type_get_bit_width",

        spvc_type("type")
    )

    unsigned_int(
        "type_get_vector_size",

        spvc_type("type")
    )

    unsigned_int(
        "type_get_columns",

        spvc_type("type")
    )

    unsigned_int(
        "type_get_num_array_dimensions",

        spvc_type("type")
    )

    spvc_bool(
        "type_array_dimension_is_literal",

        spvc_type("type"),
        unsigned_int("dimension")
    )

    SpvId(
        "type_get_array_dimension",

        spvc_type("type"),
        unsigned_int("dimension")
    )

    unsigned_int(
        "type_get_num_member_types",

        spvc_type("type")
    )

    spvc_type_id(
        "type_get_member_type",

        spvc_type("type"),
        unsigned_int("index")
    )

    SpvStorageClass(
        "type_get_storage_class",

        spvc_type("type")
    )

    spvc_type_id(
        "type_get_image_sampled_type",

        spvc_type("type")
    )

    SpvDim(
        "type_get_image_dimension",

        spvc_type("type")
    )

    spvc_bool(
        "type_get_image_is_depth",

        spvc_type("type")
    )

    spvc_bool(
        "type_get_image_arrayed",

        spvc_type("type")
    )

    spvc_bool(
        "type_get_image_multisampled",

        spvc_type("type")
    )

    spvc_bool(
        "type_get_image_is_storage",

        spvc_type("type")
    )

    SpvImageFormat(
        "type_get_image_storage_format",

        spvc_type("type")
    )

    SpvAccessQualifier(
        "type_get_image_access_qualifier",

        spvc_type("type")
    )

    spvc_result(
        "compiler_get_declared_struct_size",

        spvc_compiler("compiler"),
        spvc_type("struct_type"),
        Check(1)..size_t.p("size")
    )

    spvc_result(
        "compiler_get_declared_struct_size_runtime_array",

        spvc_compiler("compiler"),
        spvc_type("struct_type"),
        size_t("array_size"),
        Check(1)..size_t.p("size")
    )

    spvc_result(
        "compiler_get_declared_struct_member_size",

        spvc_compiler("compiler"),
        spvc_type("type"),
        unsigned_int("index"),
        Check(1)..size_t.p("size")
    )

    spvc_result(
        "compiler_type_struct_member_offset",

        spvc_compiler("compiler"),
        spvc_type("type"),
        unsigned_int("index"),
        Check(1)..unsigned_int.p("offset")
    )

    spvc_result(
        "compiler_type_struct_member_array_stride",

        spvc_compiler("compiler"),
        spvc_type("type"),
        unsigned_int("index"),
        Check(1)..unsigned_int.p("stride")
    )

    spvc_result(
        "compiler_type_struct_member_matrix_stride",

        spvc_compiler("compiler"),
        spvc_type("type"),
        unsigned_int("index"),
        Check(1)..unsigned_int.p("stride")
    )

    spvc_result(
        "compiler_build_dummy_sampler_for_combined_images",

        spvc_compiler("compiler"),
        Check(1)..spvc_variable_id.p("id")
    )

    spvc_result(
        "compiler_build_combined_image_samplers",

        spvc_compiler("compiler")
    )

    spvc_result(
        "compiler_get_combined_image_samplers",

        spvc_compiler("compiler"),
        Check(1)..spvc_combined_image_sampler.const.p.p("samplers"),
        Check(1)..size_t.p("num_samplers")
    )

    spvc_result(
        "compiler_get_specialization_constants",

        spvc_compiler("compiler"),
        Check(1)..spvc_specialization_constant.const.p.p("constants"),
        Check(1)..size_t.p("num_constants")
    )

    spvc_constant(
        "compiler_get_constant_handle",

        spvc_compiler("compiler"),
        spvc_constant_id("id")
    )

    spvc_constant_id(
        "compiler_get_work_group_size_specialization_constants",

        spvc_compiler("compiler"),
        spvc_specialization_constant.p("x"),
        spvc_specialization_constant.p("y"),
        spvc_specialization_constant.p("z")
    )

    spvc_result(
        "compiler_get_active_buffer_ranges",

        spvc_compiler("compiler"),
        spvc_variable_id("id"),
        Check(1)..spvc_buffer_range.const.p.p("ranges"),
        Check(1)..size_t.p("num_ranges")
    )

    float(
        "constant_get_scalar_fp16",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    float(
        "constant_get_scalar_fp32",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    double(
        "constant_get_scalar_fp64",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    unsigned_int(
        "constant_get_scalar_u32",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    int(
        "constant_get_scalar_i32",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    unsigned_int(
        "constant_get_scalar_u16",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    int(
        "constant_get_scalar_i16",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    unsigned_int(
        "constant_get_scalar_u8",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    int(
        "constant_get_scalar_i8",

        spvc_constant("constant"),
        unsigned_int("column"),
        unsigned_int("row")
    )

    void(
        "constant_get_subconstants",

        spvc_constant("constant"),
        Check(1)..spvc_constant_id.const.p.p("constituents"),
        Check(1)..size_t.p("count")
    )

    unsigned_long_long(
        "constant_get_scalar_u64",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row")
    )

    long_long(
        "constant_get_scalar_i64",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row")
    )

    spvc_type_id(
        "constant_get_type",

        spvc_constant("constant")
    )

    void(
        "constant_set_scalar_fp16",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        unsigned_short("value")
    )

    void(
        "constant_set_scalar_fp32",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        float("value")
    )

    void(
        "constant_set_scalar_fp64",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        double("value")
    )

    void(
        "constant_set_scalar_u32",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        unsigned("value")
    )

    void(
        "constant_set_scalar_i32",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        int("value")
    )

    void(
        "constant_set_scalar_u64",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        unsigned_long_long("value")
    )

    void(
        "constant_set_scalar_i64",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        long_long("value")
    )

    void(
        "constant_set_scalar_u16",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        unsigned_short("value")
    )

    void(
        "constant_set_scalar_i16",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        short("value")
    )

    void(
        "constant_set_scalar_u8",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        unsigned_char("value")
    )

    void(
        "constant_set_scalar_i8",

        spvc_constant("constant"),
        unsigned("column"),
        unsigned("row"),
        char("value")
    )


    spvc_bool(
        "compiler_get_binary_offset_for_decoration",

        spvc_compiler("compiler"),
        spvc_variable_id("id"),
        SpvDecoration("decoration"),
        Check(1)..unsigned_int.p("word_offset")
    )

    spvc_bool(
        "compiler_buffer_is_hlsl_counter_buffer",

        spvc_compiler("compiler"),
        spvc_variable_id("id")
    )

    spvc_bool(
        "compiler_buffer_get_hlsl_counter_buffer",

        spvc_compiler("compiler"),
        spvc_variable_id("id"),
        Check(1)..spvc_variable_id.p("counter_id")
    )

    spvc_result(
        "compiler_get_declared_capabilities",

        spvc_compiler("compiler"),
        Check(1)..SpvCapability.const.p.p("capabilities"),
        Check(1)..size_t.p("num_capabilities")
    )

    spvc_result(
        "compiler_get_declared_extensions",

        spvc_compiler("compiler"),
        Check(1)..charUTF8.const.p.p.p("extensions"),
        Check(1)..size_t.p("num_extensions")
    )

    charUTF8.const.p(
        "compiler_get_remapped_declared_block_name",

        spvc_compiler("compiler"),
        spvc_variable_id("id")
    )

    spvc_result(
        "compiler_get_buffer_block_decorations",

        spvc_compiler("compiler"),
        spvc_variable_id("id"),
        Check(1)..SpvDecoration.const.p.p("decorations"),
        Check(1)..size_t.p("num_decorations")
    )
}
