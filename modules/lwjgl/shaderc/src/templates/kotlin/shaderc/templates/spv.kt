/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val spv = "SPV".nativeClass(Module.SHADERC, prefix = "SPV", prefixMethod = "spv", binding = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.SPIRV_TOOLS_LIBRARY_NAME, Shaderc::getLibrary"""
)) {
    EnumConstant(
        "SUCCESS".enum("0"),
        "UNSUPPORTED".enum,
        "END_OF_STREAM".enum,
        "WARNING".enum,
        "FAILED_MATCH".enum,
        "REQUESTED_TERMINATION".enum,
        "ERROR_INTERNAL".enum("-1"),
        "ERROR_OUT_OF_MEMORY".enum("-2"),
        "ERROR_INVALID_POINTER".enum("-3"),
        "ERROR_INVALID_BINARY".enum("-4"),
        "ERROR_INVALID_TEXT".enum("-5"),
        "ERROR_INVALID_TABLE".enum("-6"),
        "ERROR_INVALID_VALUE".enum("-7"),
        "ERROR_INVALID_DIAGNOSTIC".enum("-8"),
        "ERROR_INVALID_LOOKUP".enum("-9"),
        "ERROR_INVALID_ID".enum("-10"),
        "ERROR_INVALID_CFG".enum("-11"),
        "ERROR_INVALID_LAYOUT".enum("-12"),
        "ERROR_INVALID_CAPABILITY".enum("-13"),
        "ERROR_INVALID_DATA".enum("-14"),
        "ERROR_MISSING_EXTENSION".enum("-15"),
        "ERROR_WRONG_VERSION".enum("-16"),
        "ERROR_FNVAR".enum("-17")
    )

    EnumConstant(
        "MSG_FATAL".enum("0"),
        "MSG_INTERNAL_ERROR".enum,
        "MSG_ERROR".enum,
        "MSG_WARNING".enum,
        "MSG_INFO".enum,
        "MSG_DEBUG".enum
    )

    EnumConstant(
        "ENDIANNESS_LITTLE".enum("0"),
        "ENDIANNESS_BIG".enum
    )

    EnumConstant(
        "OPERAND_TYPE_NONE".enum("0"),
        "OPERAND_TYPE_ID".enum,
        "OPERAND_TYPE_TYPE_ID".enum,
        "OPERAND_TYPE_RESULT_ID".enum,
        "OPERAND_TYPE_MEMORY_SEMANTICS_ID".enum,
        "OPERAND_TYPE_SCOPE_ID".enum,
        "OPERAND_TYPE_LITERAL_INTEGER".enum,
        "OPERAND_TYPE_EXTENSION_INSTRUCTION_NUMBER".enum,
        "OPERAND_TYPE_SPEC_CONSTANT_OP_NUMBER".enum,
        "OPERAND_TYPE_TYPED_LITERAL_NUMBER".enum,
        "OPERAND_TYPE_LITERAL_FLOAT".enum,
        "OPERAND_TYPE_LITERAL_STRING".enum,
        "OPERAND_TYPE_SOURCE_LANGUAGE".enum,
        "OPERAND_TYPE_EXECUTION_MODEL".enum,
        "OPERAND_TYPE_ADDRESSING_MODEL".enum,
        "OPERAND_TYPE_MEMORY_MODEL".enum,
        "OPERAND_TYPE_EXECUTION_MODE".enum,
        "OPERAND_TYPE_STORAGE_CLASS".enum,
        "OPERAND_TYPE_DIMENSIONALITY".enum,
        "OPERAND_TYPE_SAMPLER_ADDRESSING_MODE".enum,
        "OPERAND_TYPE_SAMPLER_FILTER_MODE".enum,
        "OPERAND_TYPE_SAMPLER_IMAGE_FORMAT".enum,
        "OPERAND_TYPE_IMAGE_CHANNEL_ORDER".enum,
        "OPERAND_TYPE_IMAGE_CHANNEL_DATA_TYPE".enum,
        "OPERAND_TYPE_FP_ROUNDING_MODE".enum,
        "OPERAND_TYPE_LINKAGE_TYPE".enum,
        "OPERAND_TYPE_ACCESS_QUALIFIER".enum,
        "OPERAND_TYPE_FUNCTION_PARAMETER_ATTRIBUTE".enum,
        "OPERAND_TYPE_DECORATION".enum,
        "OPERAND_TYPE_BUILT_IN".enum,
        "OPERAND_TYPE_GROUP_OPERATION".enum,
        "OPERAND_TYPE_KERNEL_ENQ_FLAGS".enum,
        "OPERAND_TYPE_KERNEL_PROFILING_INFO".enum,
        "OPERAND_TYPE_CAPABILITY".enum,
        "OPERAND_TYPE_FPENCODING".enum,
        "OPERAND_TYPE_IMAGE".enum,
        "OPERAND_TYPE_FP_FAST_MATH_MODE".enum,
        "OPERAND_TYPE_SELECTION_CONTROL".enum,
        "OPERAND_TYPE_LOOP_CONTROL".enum,
        "OPERAND_TYPE_FUNCTION_CONTROL".enum,
        "OPERAND_TYPE_MEMORY_ACCESS".enum,
        "OPERAND_TYPE_FRAGMENT_SHADING_RATE".enum,
        "OPERAND_TYPE_OPTIONAL_ID".enum,
        "OPERAND_TYPE_OPTIONAL_IMAGE".enum,
        "OPERAND_TYPE_OPTIONAL_MEMORY_ACCESS".enum,
        "OPERAND_TYPE_OPTIONAL_LITERAL_INTEGER".enum,
        "OPERAND_TYPE_OPTIONAL_LITERAL_NUMBER".enum,
        "OPERAND_TYPE_OPTIONAL_TYPED_LITERAL_INTEGER".enum,
        "OPERAND_TYPE_OPTIONAL_LITERAL_STRING".enum,
        "OPERAND_TYPE_OPTIONAL_ACCESS_QUALIFIER".enum,
        "OPERAND_TYPE_OPTIONAL_CIV".enum,
        "OPERAND_TYPE_OPTIONAL_FPENCODING".enum,
        "OPERAND_TYPE_VARIABLE_ID".enum,
        "OPERAND_TYPE_VARIABLE_LITERAL_INTEGER".enum,
        "OPERAND_TYPE_VARIABLE_LITERAL_INTEGER_ID".enum,
        "OPERAND_TYPE_VARIABLE_ID_LITERAL_INTEGER".enum,
        "OPERAND_TYPE_DEBUG_INFO_FLAGS".enum,
        "OPERAND_TYPE_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING".enum,
        "OPERAND_TYPE_DEBUG_COMPOSITE_TYPE".enum,
        "OPERAND_TYPE_DEBUG_TYPE_QUALIFIER".enum,
        "OPERAND_TYPE_DEBUG_OPERATION".enum,
        "OPERAND_TYPE_CLDEBUG100_DEBUG_INFO_FLAGS".enum,
        "OPERAND_TYPE_CLDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING".enum,
        "OPERAND_TYPE_CLDEBUG100_DEBUG_COMPOSITE_TYPE".enum,
        "OPERAND_TYPE_CLDEBUG100_DEBUG_TYPE_QUALIFIER".enum,
        "OPERAND_TYPE_CLDEBUG100_DEBUG_OPERATION".enum,
        "OPERAND_TYPE_CLDEBUG100_DEBUG_IMPORTED_ENTITY".enum,
        "OPERAND_TYPE_FPDENORM_MODE".enum,
        "OPERAND_TYPE_FPOPERATION_MODE".enum,
        "OPERAND_TYPE_QUANTIZATION_MODES".enum,
        "OPERAND_TYPE_OVERFLOW_MODES".enum,
        "OPERAND_TYPE_RAY_FLAGS".enum,
        "OPERAND_TYPE_RAY_QUERY_INTERSECTION".enum,
        "OPERAND_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TYPE".enum,
        "OPERAND_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TYPE".enum,
        "OPERAND_TYPE_PACKED_VECTOR_FORMAT".enum,
        "OPERAND_TYPE_OPTIONAL_PACKED_VECTOR_FORMAT".enum,
        "OPERAND_TYPE_COOPERATIVE_MATRIX_OPERANDS".enum,
        "OPERAND_TYPE_OPTIONAL_COOPERATIVE_MATRIX_OPERANDS".enum,
        "OPERAND_TYPE_COOPERATIVE_MATRIX_LAYOUT".enum,
        "OPERAND_TYPE_COOPERATIVE_MATRIX_USE".enum,
        "OPERAND_TYPE_INITIALIZATION_MODE_QUALIFIER".enum,
        "OPERAND_TYPE_HOST_ACCESS_QUALIFIER".enum,
        "OPERAND_TYPE_LOAD_CACHE_CONTROL".enum,
        "OPERAND_TYPE_STORE_CACHE_CONTROL".enum,
        "OPERAND_TYPE_NAMED_MAXIMUM_NUMBER_OF_REGISTERS".enum,
        "OPERAND_TYPE_RAW_ACCESS_CHAIN_OPERANDS".enum,
        "OPERAND_TYPE_OPTIONAL_RAW_ACCESS_CHAIN_OPERANDS".enum,
        "OPERAND_TYPE_TENSOR_CLAMP_MODE".enum,
        "OPERAND_TYPE_COOPERATIVE_MATRIX_REDUCE".enum,
        "OPERAND_TYPE_TENSOR_ADDRESSING_OPERANDS".enum,
        "OPERAND_TYPE_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS".enum,
        "OPERAND_TYPE_OPTIONAL_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS".enum,
        "OPERAND_TYPE_COOPERATIVE_VECTOR_MATRIX_LAYOUT".enum,
        "OPERAND_TYPE_COMPONENT_TYPE".enum,
        "OPERAND_TYPE_KERNEL_PROPERTY_FLAGS".enum,
        "OPERAND_TYPE_SHDEBUG100_BUILD_IDENTIFIER_FLAGS".enum,
        "OPERAND_TYPE_SHDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING".enum,
        "OPERAND_TYPE_SHDEBUG100_DEBUG_COMPOSITE_TYPE".enum,
        "OPERAND_TYPE_SHDEBUG100_DEBUG_IMPORTED_ENTITY".enum,
        "OPERAND_TYPE_SHDEBUG100_DEBUG_INFO_FLAGS".enum,
        "OPERAND_TYPE_SHDEBUG100_DEBUG_OPERATION".enum,
        "OPERAND_TYPE_SHDEBUG100_DEBUG_TYPE_QUALIFIER".enum,
        "OPERAND_TYPE_TENSOR_OPERANDS".enum,
        "OPERAND_TYPE_OPTIONAL_TENSOR_OPERANDS".enum,
        "OPERAND_TYPE_OPTIONAL_CAPABILITY".enum,
        "OPERAND_TYPE_VARIABLE_CAPABILITY".enum,
        "OPERAND_TYPE_NUM_OPERAND_TYPES".enum
    )

    EnumConstant(
        "EXT_INST_TYPE_NONE".enum("0"),
        "EXT_INST_TYPE_GLSL_STD_450".enum,
        "EXT_INST_TYPE_OPENCL_STD".enum,
        "EXT_INST_TYPE_SPV_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER".enum,
        "EXT_INST_TYPE_SPV_AMD_SHADER_TRINARY_MINMAX".enum,
        "EXT_INST_TYPE_SPV_AMD_GCN_SHADER".enum,
        "EXT_INST_TYPE_SPV_AMD_SHADER_BALLOT".enum,
        "EXT_INST_TYPE_DEBUGINFO".enum,
        "EXT_INST_TYPE_OPENCL_DEBUGINFO_100".enum,
        "EXT_INST_TYPE_NONSEMANTIC_CLSPVREFLECTION".enum,
        "EXT_INST_TYPE_NONSEMANTIC_SHADER_DEBUGINFO_100".enum,
        "EXT_INST_TYPE_NONSEMANTIC_VKSPREFLECTION".enum,
        "EXT_INST_TYPE_TOSA_001000_1".enum,
        "EXT_INST_TYPE_ARM_MOTION_ENGINE_100".enum,
        "EXT_INST_TYPE_NONSEMANTIC_UNKNOWN".enum
    )

    EnumConstant(
        "NUMBER_NONE".enum("0"),
        "NUMBER_UNSIGNED_INT".enum,
        "NUMBER_SIGNED_INT".enum,
        "NUMBER_FLOATING".enum
    )

    EnumConstant(
        "FP_ENCODING_UNKNOWN".enum("0"),
        "FP_ENCODING_IEEE754_BINARY16".enum,
        "FP_ENCODING_IEEE754_BINARY32".enum,
        "FP_ENCODING_IEEE754_BINARY64".enum,
        "FP_ENCODING_BFLOAT16".enum,
        "FP_ENCODING_FLOAT8_E4M3".enum,
        "FP_ENCODING_FLOAT8_E5M2".enum
    )

    EnumConstant(
        "TEXT_TO_BINARY_OPTION_NONE".enum("1 << 0"),
        "TEXT_TO_BINARY_OPTION_PRESERVE_NUMERIC_IDS".enum("1 << 1")
    )

    EnumConstant(
        "BINARY_TO_TEXT_OPTION_NONE".enum("1 << 0"),
        "BINARY_TO_TEXT_OPTION_PRINT".enum("1 << 1"),
        "BINARY_TO_TEXT_OPTION_COLOR".enum("1 << 2"),
        "BINARY_TO_TEXT_OPTION_INDENT".enum("1 << 3"),
        "BINARY_TO_TEXT_OPTION_SHOW_BYTE_OFFSET".enum("1 << 4"),
        "BINARY_TO_TEXT_OPTION_NO_HEADER".enum("1 << 5"),
        "BINARY_TO_TEXT_OPTION_FRIENDLY_NAMES".enum("1 << 6"),
        "BINARY_TO_TEXT_OPTION_COMMENT".enum("1 << 7"),
        "BINARY_TO_TEXT_OPTION_NESTED_INDENT".enum("1 << 8"),
        "BINARY_TO_TEXT_OPTION_REORDER_BLOCKS".enum("1 << 9")
    )

    IntConstant(
        "kDefaultMaxIdBound"..0x3FFFFF
    ).noPrefix()

    EnumConstant(
        "ENV_UNIVERSAL_1_0".enum("0"),
        "ENV_VULKAN_1_0".enum,
        "ENV_UNIVERSAL_1_1".enum,
        "ENV_OPENCL_2_1".enum,
        "ENV_OPENCL_2_2".enum,
        "ENV_OPENGL_4_0".enum,
        "ENV_OPENGL_4_1".enum,
        "ENV_OPENGL_4_2".enum,
        "ENV_OPENGL_4_3".enum,
        "ENV_OPENGL_4_5".enum,
        "ENV_UNIVERSAL_1_2".enum,
        "ENV_OPENCL_1_2".enum,
        "ENV_OPENCL_EMBEDDED_1_2".enum,
        "ENV_OPENCL_2_0".enum,
        "ENV_OPENCL_EMBEDDED_2_0".enum,
        "ENV_OPENCL_EMBEDDED_2_1".enum,
        "ENV_OPENCL_EMBEDDED_2_2".enum,
        "ENV_UNIVERSAL_1_3".enum,
        "ENV_VULKAN_1_1".enum,
        "ENV_WEBGPU_0".enum,
        "ENV_UNIVERSAL_1_4".enum,
        "ENV_VULKAN_1_1_SPIRV_1_4".enum,
        "ENV_UNIVERSAL_1_5".enum,
        "ENV_VULKAN_1_2".enum,
        "ENV_UNIVERSAL_1_6".enum,
        "ENV_VULKAN_1_3".enum,
        "ENV_VULKAN_1_4".enum
    )

    EnumConstant(
        "spv_validator_limit_max_struct_members".enum("0"),
        "spv_validator_limit_max_struct_depth".enum,
        "spv_validator_limit_max_local_variables".enum,
        "spv_validator_limit_max_global_variables".enum,
        "spv_validator_limit_max_switch_branches".enum,
        "spv_validator_limit_max_function_args".enum,
        "spv_validator_limit_max_control_flow_nesting_depth".enum,
        "spv_validator_limit_max_access_chain_indexes".enum,
        "spv_validator_limit_max_id_bound".enum
    ).noPrefix()

    charASCII.const.p(
        "SoftwareVersionString",

        void()
    )

    charASCII.const.p(
        "SoftwareVersionDetailsString",

        void()
    )

    charASCII.const.p(
        "TargetEnvDescription",

        spv_target_env("env")
    )

    bool(
        "ParseTargetEnv",

        charASCII.const.p("s"),
        Check(1)..spv_target_env.p("env")
    )

    bool(
        "ParseVulkanEnv",

        uint32_t("vulkan_ver"),
        uint32_t("spirv_ver"),
        Check(1)..spv_target_env.p("env")
    )

    spv_context(
        "ContextCreate",

        spv_target_env("env")
    )

    void(
        "ContextDestroy",

        spv_context("context")
    )

    spv_validator_options(
        "ValidatorOptionsCreate",

        void()
    )

    void(
        "ValidatorOptionsDestroy",

        spv_validator_options("options")
    )

    void(
        "ValidatorOptionsSetUniversalLimit",

        spv_validator_options("options"),
        spv_validator_limit("limit_type"),
        uint32_t("limit")
    )

    void(
        "ValidatorOptionsSetRelaxStoreStruct",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetRelaxLogicalPointer",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetBeforeHlslLegalization",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetRelaxBlockLayout",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetUniformBufferStandardLayout",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetScalarBlockLayout",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetWorkgroupScalarBlockLayout",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetSkipBlockLayout",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetAllowLocalSizeId",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetAllowOffsetTextureOperand",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetAllowVulkan32BitBitwise",

        spv_validator_options("options"),
        bool("val")
    )

    void(
        "ValidatorOptionsSetFriendlyNames",

        spv_validator_options("options"),
        bool("val")
    )

    spv_optimizer_options(
        "OptimizerOptionsCreate",

        void()
    )

    void(
        "OptimizerOptionsDestroy",

        spv_optimizer_options("options")
    )

    void(
        "OptimizerOptionsSetRunValidator",

        spv_optimizer_options("options"),
        bool("val")
    )

    void(
        "OptimizerOptionsSetValidatorOptions",

        spv_optimizer_options("options"),
        spv_validator_options("val")
    )

    void(
        "OptimizerOptionsSetMaxIdBound",

        spv_optimizer_options("options"),
        uint32_t("val")
    )

    void(
        "OptimizerOptionsSetPreserveBindings",

        spv_optimizer_options("options"),
        bool("val")
    )

    void(
        "OptimizerOptionsSetPreserveSpecConstants",

        spv_optimizer_options("options"),
        bool("val")
    )

    spv_reducer_options(
        "ReducerOptionsCreate",

        void()
    )

    void(
        "ReducerOptionsDestroy",

        spv_reducer_options("options")
    )

    void(
        "ReducerOptionsSetStepLimit",

        spv_reducer_options("options"),
        uint32_t("step_limit")
    )

    void(
        "ReducerOptionsSetFailOnValidationError",

        spv_reducer_options("options"),
        bool("fail_on_validation_error")
    )

    void(
        "ReducerOptionsSetTargetFunction",

        spv_reducer_options("options"),
        uint32_t("target_function")
    )

    spv_fuzzer_options(
        "FuzzerOptionsCreate",

        void()
    )

    void(
        "FuzzerOptionsDestroy",

        spv_fuzzer_options("options")
    )

    void(
        "FuzzerOptionsEnableReplayValidation",

        spv_fuzzer_options("options")
    )

    void(
        "FuzzerOptionsSetRandomSeed",

        spv_fuzzer_options("options"),
        uint32_t("seed")
    )

    void(
        "FuzzerOptionsSetReplayRange",

        spv_fuzzer_options("options"),
        int32_t("replay_range")
    )

    void(
        "FuzzerOptionsSetShrinkerStepLimit",

        spv_fuzzer_options("options"),
        uint32_t("shrinker_step_limit")
    )

    void(
        "FuzzerOptionsEnableFuzzerPassValidation",

        spv_fuzzer_options("options")
    )

    void(
        "FuzzerOptionsEnableAllPasses",

        spv_fuzzer_options("options")
    )

    spv_result_t(
        "TextToBinary",

        spv_const_context.const("context"),
        charUTF8.const.p("text"),
        AutoSize("text")..size_t.const("length"),
        Check(1)..spv_binary.p("binary"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )

    spv_result_t(
        "TextToBinaryWithOptions",

        spv_const_context.const("context"),
        charUTF8.const.p("text"),
        AutoSize("text")..size_t.const("length"),
        uint32_t("options"),
        Check(1)..spv_binary.p("binary"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )

    void(
        "TextDestroy",

        nullable..spv_text("text")
    )

    spv_result_t(
        "BinaryToText",

        spv_const_context.const("context"),
        uint32_t.const.p("binary"),
        AutoSize("binary")..size_t.const("word_count"),
        uint32_t("options"),
        Check(1)..spv_text.p("text"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )

    void(
        "BinaryDestroy",

        spv_binary("binary")
    )

    spv_result_t(
        "Validate",

        spv_const_context.const("context"),
        spv_const_binary.const("binary"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )

    spv_result_t(
        "ValidateWithOptions",

        spv_const_context.const("context"),
        spv_const_validator_options.const("options"),
        spv_const_binary.const("binary"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )

    spv_result_t(
        "ValidateBinary",

        spv_const_context.const("context"),
        uint32_t.const.p("words"),
        AutoSize("words")..size_t.const("num_words"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )

    spv_diagnostic(
        "DiagnosticCreate",

        spv_position.const("position"),
        charUTF8.const.p("message")
    )

    void(
        "DiagnosticDestroy",

        spv_diagnostic("diagnostic")
    )

    spv_result_t(
        "DiagnosticPrint",

        spv_diagnostic.const("diagnostic")
    )

    charASCII.const.p(
        "OpcodeString",

        uint32_t.const("opcode")
    )

    spv_result_t(
        "BinaryParse",

        spv_const_context.const("context"),
        nullable..opaque_p("user_data"),
        uint32_t.const.p("words"),
        AutoSize("words")..size_t.const("num_words"),
        nullable..spv_parsed_header_fn_t("parse_header"),
        nullable..spv_parsed_instruction_fn_t("parse_instruction"),
        Check(1)..nullable..spv_diagnostic.p("diagnostic")
    )
}