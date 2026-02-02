/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SPV {

    private static final SharedLibrary SHADERC = Library.loadNative(SPV.class, "org.lwjgl.shaderc", Configuration.SPIRV_TOOLS_LIBRARY_NAME, Shaderc::getLibrary);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftwareVersionString                          = apiGetFunctionAddress(SHADERC, "spvSoftwareVersionString"),
            SoftwareVersionDetailsString                   = apiGetFunctionAddress(SHADERC, "spvSoftwareVersionDetailsString"),
            TargetEnvDescription                           = apiGetFunctionAddress(SHADERC, "spvTargetEnvDescription"),
            ParseTargetEnv                                 = apiGetFunctionAddress(SHADERC, "spvParseTargetEnv"),
            ParseVulkanEnv                                 = apiGetFunctionAddress(SHADERC, "spvParseVulkanEnv"),
            ContextCreate                                  = apiGetFunctionAddress(SHADERC, "spvContextCreate"),
            ContextDestroy                                 = apiGetFunctionAddress(SHADERC, "spvContextDestroy"),
            ValidatorOptionsCreate                         = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsCreate"),
            ValidatorOptionsDestroy                        = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsDestroy"),
            ValidatorOptionsSetUniversalLimit              = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetUniversalLimit"),
            ValidatorOptionsSetRelaxStoreStruct            = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetRelaxStoreStruct"),
            ValidatorOptionsSetRelaxLogicalPointer         = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetRelaxLogicalPointer"),
            ValidatorOptionsSetBeforeHlslLegalization      = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetBeforeHlslLegalization"),
            ValidatorOptionsSetRelaxBlockLayout            = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetRelaxBlockLayout"),
            ValidatorOptionsSetUniformBufferStandardLayout = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetUniformBufferStandardLayout"),
            ValidatorOptionsSetScalarBlockLayout           = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetScalarBlockLayout"),
            ValidatorOptionsSetWorkgroupScalarBlockLayout  = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetWorkgroupScalarBlockLayout"),
            ValidatorOptionsSetSkipBlockLayout             = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetSkipBlockLayout"),
            ValidatorOptionsSetAllowLocalSizeId            = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetAllowLocalSizeId"),
            ValidatorOptionsSetAllowOffsetTextureOperand   = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetAllowOffsetTextureOperand"),
            ValidatorOptionsSetAllowVulkan32BitBitwise     = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetAllowVulkan32BitBitwise"),
            ValidatorOptionsSetFriendlyNames               = apiGetFunctionAddress(SHADERC, "spvValidatorOptionsSetFriendlyNames"),
            OptimizerOptionsCreate                         = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsCreate"),
            OptimizerOptionsDestroy                        = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsDestroy"),
            OptimizerOptionsSetRunValidator                = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsSetRunValidator"),
            OptimizerOptionsSetValidatorOptions            = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsSetValidatorOptions"),
            OptimizerOptionsSetMaxIdBound                  = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsSetMaxIdBound"),
            OptimizerOptionsSetPreserveBindings            = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsSetPreserveBindings"),
            OptimizerOptionsSetPreserveSpecConstants       = apiGetFunctionAddress(SHADERC, "spvOptimizerOptionsSetPreserveSpecConstants"),
            ReducerOptionsCreate                           = apiGetFunctionAddress(SHADERC, "spvReducerOptionsCreate"),
            ReducerOptionsDestroy                          = apiGetFunctionAddress(SHADERC, "spvReducerOptionsDestroy"),
            ReducerOptionsSetStepLimit                     = apiGetFunctionAddress(SHADERC, "spvReducerOptionsSetStepLimit"),
            ReducerOptionsSetFailOnValidationError         = apiGetFunctionAddress(SHADERC, "spvReducerOptionsSetFailOnValidationError"),
            ReducerOptionsSetTargetFunction                = apiGetFunctionAddress(SHADERC, "spvReducerOptionsSetTargetFunction"),
            FuzzerOptionsCreate                            = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsCreate"),
            FuzzerOptionsDestroy                           = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsDestroy"),
            FuzzerOptionsEnableReplayValidation            = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsEnableReplayValidation"),
            FuzzerOptionsSetRandomSeed                     = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsSetRandomSeed"),
            FuzzerOptionsSetReplayRange                    = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsSetReplayRange"),
            FuzzerOptionsSetShrinkerStepLimit              = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsSetShrinkerStepLimit"),
            FuzzerOptionsEnableFuzzerPassValidation        = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsEnableFuzzerPassValidation"),
            FuzzerOptionsEnableAllPasses                   = apiGetFunctionAddress(SHADERC, "spvFuzzerOptionsEnableAllPasses"),
            TextToBinary                                   = apiGetFunctionAddress(SHADERC, "spvTextToBinary"),
            TextToBinaryWithOptions                        = apiGetFunctionAddress(SHADERC, "spvTextToBinaryWithOptions"),
            TextDestroy                                    = apiGetFunctionAddress(SHADERC, "spvTextDestroy"),
            BinaryToText                                   = apiGetFunctionAddress(SHADERC, "spvBinaryToText"),
            BinaryDestroy                                  = apiGetFunctionAddress(SHADERC, "spvBinaryDestroy"),
            Validate                                       = apiGetFunctionAddress(SHADERC, "spvValidate"),
            ValidateWithOptions                            = apiGetFunctionAddress(SHADERC, "spvValidateWithOptions"),
            ValidateBinary                                 = apiGetFunctionAddress(SHADERC, "spvValidateBinary"),
            DiagnosticCreate                               = apiGetFunctionAddress(SHADERC, "spvDiagnosticCreate"),
            DiagnosticDestroy                              = apiGetFunctionAddress(SHADERC, "spvDiagnosticDestroy"),
            DiagnosticPrint                                = apiGetFunctionAddress(SHADERC, "spvDiagnosticPrint"),
            OpcodeString                                   = apiGetFunctionAddress(SHADERC, "spvOpcodeString"),
            BinaryParse                                    = apiGetFunctionAddress(SHADERC, "spvBinaryParse");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    public static final int
        SPV_SUCCESS                  = 0,
        SPV_UNSUPPORTED              = 1,
        SPV_END_OF_STREAM            = 2,
        SPV_WARNING                  = 3,
        SPV_FAILED_MATCH             = 4,
        SPV_REQUESTED_TERMINATION    = 5,
        SPV_ERROR_INTERNAL           = -1,
        SPV_ERROR_OUT_OF_MEMORY      = -2,
        SPV_ERROR_INVALID_POINTER    = -3,
        SPV_ERROR_INVALID_BINARY     = -4,
        SPV_ERROR_INVALID_TEXT       = -5,
        SPV_ERROR_INVALID_TABLE      = -6,
        SPV_ERROR_INVALID_VALUE      = -7,
        SPV_ERROR_INVALID_DIAGNOSTIC = -8,
        SPV_ERROR_INVALID_LOOKUP     = -9,
        SPV_ERROR_INVALID_ID         = -10,
        SPV_ERROR_INVALID_CFG        = -11,
        SPV_ERROR_INVALID_LAYOUT     = -12,
        SPV_ERROR_INVALID_CAPABILITY = -13,
        SPV_ERROR_INVALID_DATA       = -14,
        SPV_ERROR_MISSING_EXTENSION  = -15,
        SPV_ERROR_WRONG_VERSION      = -16,
        SPV_ERROR_FNVAR              = -17;

    public static final int
        SPV_MSG_FATAL          = 0,
        SPV_MSG_INTERNAL_ERROR = 1,
        SPV_MSG_ERROR          = 2,
        SPV_MSG_WARNING        = 3,
        SPV_MSG_INFO           = 4,
        SPV_MSG_DEBUG          = 5;

    public static final int
        SPV_ENDIANNESS_LITTLE = 0,
        SPV_ENDIANNESS_BIG    = 1;

    public static final int
        SPV_OPERAND_TYPE_NONE                                          = 0,
        SPV_OPERAND_TYPE_ID                                            = 1,
        SPV_OPERAND_TYPE_TYPE_ID                                       = 2,
        SPV_OPERAND_TYPE_RESULT_ID                                     = 3,
        SPV_OPERAND_TYPE_MEMORY_SEMANTICS_ID                           = 4,
        SPV_OPERAND_TYPE_SCOPE_ID                                      = 5,
        SPV_OPERAND_TYPE_LITERAL_INTEGER                               = 6,
        SPV_OPERAND_TYPE_EXTENSION_INSTRUCTION_NUMBER                  = 7,
        SPV_OPERAND_TYPE_SPEC_CONSTANT_OP_NUMBER                       = 8,
        SPV_OPERAND_TYPE_TYPED_LITERAL_NUMBER                          = 9,
        SPV_OPERAND_TYPE_LITERAL_FLOAT                                 = 10,
        SPV_OPERAND_TYPE_LITERAL_STRING                                = 11,
        SPV_OPERAND_TYPE_SOURCE_LANGUAGE                               = 12,
        SPV_OPERAND_TYPE_EXECUTION_MODEL                               = 13,
        SPV_OPERAND_TYPE_ADDRESSING_MODEL                              = 14,
        SPV_OPERAND_TYPE_MEMORY_MODEL                                  = 15,
        SPV_OPERAND_TYPE_EXECUTION_MODE                                = 16,
        SPV_OPERAND_TYPE_STORAGE_CLASS                                 = 17,
        SPV_OPERAND_TYPE_DIMENSIONALITY                                = 18,
        SPV_OPERAND_TYPE_SAMPLER_ADDRESSING_MODE                       = 19,
        SPV_OPERAND_TYPE_SAMPLER_FILTER_MODE                           = 20,
        SPV_OPERAND_TYPE_SAMPLER_IMAGE_FORMAT                          = 21,
        SPV_OPERAND_TYPE_IMAGE_CHANNEL_ORDER                           = 22,
        SPV_OPERAND_TYPE_IMAGE_CHANNEL_DATA_TYPE                       = 23,
        SPV_OPERAND_TYPE_FP_ROUNDING_MODE                              = 24,
        SPV_OPERAND_TYPE_LINKAGE_TYPE                                  = 25,
        SPV_OPERAND_TYPE_ACCESS_QUALIFIER                              = 26,
        SPV_OPERAND_TYPE_FUNCTION_PARAMETER_ATTRIBUTE                  = 27,
        SPV_OPERAND_TYPE_DECORATION                                    = 28,
        SPV_OPERAND_TYPE_BUILT_IN                                      = 29,
        SPV_OPERAND_TYPE_GROUP_OPERATION                               = 30,
        SPV_OPERAND_TYPE_KERNEL_ENQ_FLAGS                              = 31,
        SPV_OPERAND_TYPE_KERNEL_PROFILING_INFO                         = 32,
        SPV_OPERAND_TYPE_CAPABILITY                                    = 33,
        SPV_OPERAND_TYPE_FPENCODING                                    = 34,
        SPV_OPERAND_TYPE_IMAGE                                         = 35,
        SPV_OPERAND_TYPE_FP_FAST_MATH_MODE                             = 36,
        SPV_OPERAND_TYPE_SELECTION_CONTROL                             = 37,
        SPV_OPERAND_TYPE_LOOP_CONTROL                                  = 38,
        SPV_OPERAND_TYPE_FUNCTION_CONTROL                              = 39,
        SPV_OPERAND_TYPE_MEMORY_ACCESS                                 = 40,
        SPV_OPERAND_TYPE_FRAGMENT_SHADING_RATE                         = 41,
        SPV_OPERAND_TYPE_OPTIONAL_ID                                   = 42,
        SPV_OPERAND_TYPE_OPTIONAL_IMAGE                                = 43,
        SPV_OPERAND_TYPE_OPTIONAL_MEMORY_ACCESS                        = 44,
        SPV_OPERAND_TYPE_OPTIONAL_LITERAL_INTEGER                      = 45,
        SPV_OPERAND_TYPE_OPTIONAL_LITERAL_NUMBER                       = 46,
        SPV_OPERAND_TYPE_OPTIONAL_TYPED_LITERAL_INTEGER                = 47,
        SPV_OPERAND_TYPE_OPTIONAL_LITERAL_STRING                       = 48,
        SPV_OPERAND_TYPE_OPTIONAL_ACCESS_QUALIFIER                     = 49,
        SPV_OPERAND_TYPE_OPTIONAL_CIV                                  = 50,
        SPV_OPERAND_TYPE_OPTIONAL_FPENCODING                           = 51,
        SPV_OPERAND_TYPE_VARIABLE_ID                                   = 52,
        SPV_OPERAND_TYPE_VARIABLE_LITERAL_INTEGER                      = 53,
        SPV_OPERAND_TYPE_VARIABLE_LITERAL_INTEGER_ID                   = 54,
        SPV_OPERAND_TYPE_VARIABLE_ID_LITERAL_INTEGER                   = 55,
        SPV_OPERAND_TYPE_DEBUG_INFO_FLAGS                              = 56,
        SPV_OPERAND_TYPE_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING            = 57,
        SPV_OPERAND_TYPE_DEBUG_COMPOSITE_TYPE                          = 58,
        SPV_OPERAND_TYPE_DEBUG_TYPE_QUALIFIER                          = 59,
        SPV_OPERAND_TYPE_DEBUG_OPERATION                               = 60,
        SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_INFO_FLAGS                   = 61,
        SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 62,
        SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_COMPOSITE_TYPE               = 63,
        SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_TYPE_QUALIFIER               = 64,
        SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_OPERATION                    = 65,
        SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_IMPORTED_ENTITY              = 66,
        SPV_OPERAND_TYPE_FPDENORM_MODE                                 = 67,
        SPV_OPERAND_TYPE_FPOPERATION_MODE                              = 68,
        SPV_OPERAND_TYPE_QUANTIZATION_MODES                            = 69,
        SPV_OPERAND_TYPE_OVERFLOW_MODES                                = 70,
        SPV_OPERAND_TYPE_RAY_FLAGS                                     = 71,
        SPV_OPERAND_TYPE_RAY_QUERY_INTERSECTION                        = 72,
        SPV_OPERAND_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TYPE         = 73,
        SPV_OPERAND_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TYPE         = 74,
        SPV_OPERAND_TYPE_PACKED_VECTOR_FORMAT                          = 75,
        SPV_OPERAND_TYPE_OPTIONAL_PACKED_VECTOR_FORMAT                 = 76,
        SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_OPERANDS                   = 77,
        SPV_OPERAND_TYPE_OPTIONAL_COOPERATIVE_MATRIX_OPERANDS          = 78,
        SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_LAYOUT                     = 79,
        SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_USE                        = 80,
        SPV_OPERAND_TYPE_INITIALIZATION_MODE_QUALIFIER                 = 81,
        SPV_OPERAND_TYPE_HOST_ACCESS_QUALIFIER                         = 82,
        SPV_OPERAND_TYPE_LOAD_CACHE_CONTROL                            = 83,
        SPV_OPERAND_TYPE_STORE_CACHE_CONTROL                           = 84,
        SPV_OPERAND_TYPE_NAMED_MAXIMUM_NUMBER_OF_REGISTERS             = 85,
        SPV_OPERAND_TYPE_RAW_ACCESS_CHAIN_OPERANDS                     = 86,
        SPV_OPERAND_TYPE_OPTIONAL_RAW_ACCESS_CHAIN_OPERANDS            = 87,
        SPV_OPERAND_TYPE_TENSOR_CLAMP_MODE                             = 88,
        SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_REDUCE                     = 89,
        SPV_OPERAND_TYPE_TENSOR_ADDRESSING_OPERANDS                    = 90,
        SPV_OPERAND_TYPE_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS           = 91,
        SPV_OPERAND_TYPE_OPTIONAL_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS  = 92,
        SPV_OPERAND_TYPE_COOPERATIVE_VECTOR_MATRIX_LAYOUT              = 93,
        SPV_OPERAND_TYPE_COMPONENT_TYPE                                = 94,
        SPV_OPERAND_TYPE_KERNEL_PROPERTY_FLAGS                         = 95,
        SPV_OPERAND_TYPE_SHDEBUG100_BUILD_IDENTIFIER_FLAGS             = 96,
        SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 97,
        SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_COMPOSITE_TYPE               = 98,
        SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_IMPORTED_ENTITY              = 99,
        SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_INFO_FLAGS                   = 100,
        SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_OPERATION                    = 101,
        SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_TYPE_QUALIFIER               = 102,
        SPV_OPERAND_TYPE_TENSOR_OPERANDS                               = 103,
        SPV_OPERAND_TYPE_OPTIONAL_TENSOR_OPERANDS                      = 104,
        SPV_OPERAND_TYPE_OPTIONAL_CAPABILITY                           = 105,
        SPV_OPERAND_TYPE_VARIABLE_CAPABILITY                           = 106,
        SPV_OPERAND_TYPE_NUM_OPERAND_TYPES                             = 107;

    public static final int
        SPV_EXT_INST_TYPE_NONE                                     = 0,
        SPV_EXT_INST_TYPE_GLSL_STD_450                             = 1,
        SPV_EXT_INST_TYPE_OPENCL_STD                               = 2,
        SPV_EXT_INST_TYPE_SPV_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER = 3,
        SPV_EXT_INST_TYPE_SPV_AMD_SHADER_TRINARY_MINMAX            = 4,
        SPV_EXT_INST_TYPE_SPV_AMD_GCN_SHADER                       = 5,
        SPV_EXT_INST_TYPE_SPV_AMD_SHADER_BALLOT                    = 6,
        SPV_EXT_INST_TYPE_DEBUGINFO                                = 7,
        SPV_EXT_INST_TYPE_OPENCL_DEBUGINFO_100                     = 8,
        SPV_EXT_INST_TYPE_NONSEMANTIC_CLSPVREFLECTION              = 9,
        SPV_EXT_INST_TYPE_NONSEMANTIC_SHADER_DEBUGINFO_100         = 10,
        SPV_EXT_INST_TYPE_NONSEMANTIC_VKSPREFLECTION               = 11,
        SPV_EXT_INST_TYPE_TOSA_001000_1                            = 12,
        SPV_EXT_INST_TYPE_ARM_MOTION_ENGINE_100                    = 13,
        SPV_EXT_INST_TYPE_NONSEMANTIC_UNKNOWN                      = 14;

    public static final int
        SPV_NUMBER_NONE         = 0,
        SPV_NUMBER_UNSIGNED_INT = 1,
        SPV_NUMBER_SIGNED_INT   = 2,
        SPV_NUMBER_FLOATING     = 3;

    public static final int
        SPV_FP_ENCODING_UNKNOWN          = 0,
        SPV_FP_ENCODING_IEEE754_BINARY16 = 1,
        SPV_FP_ENCODING_IEEE754_BINARY32 = 2,
        SPV_FP_ENCODING_IEEE754_BINARY64 = 3,
        SPV_FP_ENCODING_BFLOAT16         = 4,
        SPV_FP_ENCODING_FLOAT8_E4M3      = 5,
        SPV_FP_ENCODING_FLOAT8_E5M2      = 6;

    public static final int
        SPV_TEXT_TO_BINARY_OPTION_NONE                 = 1 << 0,
        SPV_TEXT_TO_BINARY_OPTION_PRESERVE_NUMERIC_IDS = 1 << 1;

    public static final int
        SPV_BINARY_TO_TEXT_OPTION_NONE             = 1 << 0,
        SPV_BINARY_TO_TEXT_OPTION_PRINT            = 1 << 1,
        SPV_BINARY_TO_TEXT_OPTION_COLOR            = 1 << 2,
        SPV_BINARY_TO_TEXT_OPTION_INDENT           = 1 << 3,
        SPV_BINARY_TO_TEXT_OPTION_SHOW_BYTE_OFFSET = 1 << 4,
        SPV_BINARY_TO_TEXT_OPTION_NO_HEADER        = 1 << 5,
        SPV_BINARY_TO_TEXT_OPTION_FRIENDLY_NAMES   = 1 << 6,
        SPV_BINARY_TO_TEXT_OPTION_COMMENT          = 1 << 7,
        SPV_BINARY_TO_TEXT_OPTION_NESTED_INDENT    = 1 << 8,
        SPV_BINARY_TO_TEXT_OPTION_REORDER_BLOCKS   = 1 << 9;

    public static final int kDefaultMaxIdBound = 0x3FFFFF;

    public static final int
        SPV_ENV_UNIVERSAL_1_0        = 0,
        SPV_ENV_VULKAN_1_0           = 1,
        SPV_ENV_UNIVERSAL_1_1        = 2,
        SPV_ENV_OPENCL_2_1           = 3,
        SPV_ENV_OPENCL_2_2           = 4,
        SPV_ENV_OPENGL_4_0           = 5,
        SPV_ENV_OPENGL_4_1           = 6,
        SPV_ENV_OPENGL_4_2           = 7,
        SPV_ENV_OPENGL_4_3           = 8,
        SPV_ENV_OPENGL_4_5           = 9,
        SPV_ENV_UNIVERSAL_1_2        = 10,
        SPV_ENV_OPENCL_1_2           = 11,
        SPV_ENV_OPENCL_EMBEDDED_1_2  = 12,
        SPV_ENV_OPENCL_2_0           = 13,
        SPV_ENV_OPENCL_EMBEDDED_2_0  = 14,
        SPV_ENV_OPENCL_EMBEDDED_2_1  = 15,
        SPV_ENV_OPENCL_EMBEDDED_2_2  = 16,
        SPV_ENV_UNIVERSAL_1_3        = 17,
        SPV_ENV_VULKAN_1_1           = 18,
        SPV_ENV_WEBGPU_0             = 19,
        SPV_ENV_UNIVERSAL_1_4        = 20,
        SPV_ENV_VULKAN_1_1_SPIRV_1_4 = 21,
        SPV_ENV_UNIVERSAL_1_5        = 22,
        SPV_ENV_VULKAN_1_2           = 23,
        SPV_ENV_UNIVERSAL_1_6        = 24,
        SPV_ENV_VULKAN_1_3           = 25,
        SPV_ENV_VULKAN_1_4           = 26;

    public static final int
        spv_validator_limit_max_struct_members             = 0,
        spv_validator_limit_max_struct_depth               = 1,
        spv_validator_limit_max_local_variables            = 2,
        spv_validator_limit_max_global_variables           = 3,
        spv_validator_limit_max_switch_branches            = 4,
        spv_validator_limit_max_function_args              = 5,
        spv_validator_limit_max_control_flow_nesting_depth = 6,
        spv_validator_limit_max_access_chain_indexes       = 7,
        spv_validator_limit_max_id_bound                   = 8;

    protected SPV() {
        throw new UnsupportedOperationException();
    }

    // --- [ spvSoftwareVersionString ] ---

    /** {@code char const * spvSoftwareVersionString(void)} */
    public static long nspvSoftwareVersionString() {
        long __functionAddress = Functions.SoftwareVersionString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * spvSoftwareVersionString(void)} */
    @NativeType("char const *")
    public static @Nullable String spvSoftwareVersionString() {
        long __result = nspvSoftwareVersionString();
        return memASCIISafe(__result);
    }

    // --- [ spvSoftwareVersionDetailsString ] ---

    /** {@code char const * spvSoftwareVersionDetailsString(void)} */
    public static long nspvSoftwareVersionDetailsString() {
        long __functionAddress = Functions.SoftwareVersionDetailsString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * spvSoftwareVersionDetailsString(void)} */
    @NativeType("char const *")
    public static @Nullable String spvSoftwareVersionDetailsString() {
        long __result = nspvSoftwareVersionDetailsString();
        return memASCIISafe(__result);
    }

    // --- [ spvTargetEnvDescription ] ---

    /** {@code char const * spvTargetEnvDescription(spv_target_env env)} */
    public static long nspvTargetEnvDescription(int env) {
        long __functionAddress = Functions.TargetEnvDescription;
        return invokeP(env, __functionAddress);
    }

    /** {@code char const * spvTargetEnvDescription(spv_target_env env)} */
    @NativeType("char const *")
    public static @Nullable String spvTargetEnvDescription(@NativeType("spv_target_env") int env) {
        long __result = nspvTargetEnvDescription(env);
        return memASCIISafe(__result);
    }

    // --- [ spvParseTargetEnv ] ---

    /** {@code bool spvParseTargetEnv(char const * s, spv_target_env * env)} */
    public static boolean nspvParseTargetEnv(long s, long env) {
        long __functionAddress = Functions.ParseTargetEnv;
        return invokePPZ(s, env, __functionAddress);
    }

    /** {@code bool spvParseTargetEnv(char const * s, spv_target_env * env)} */
    @NativeType("bool")
    public static boolean spvParseTargetEnv(@NativeType("char const *") ByteBuffer s, @NativeType("spv_target_env *") IntBuffer env) {
        if (CHECKS) {
            checkNT1(s);
            check(env, 1);
        }
        return nspvParseTargetEnv(memAddress(s), memAddress(env));
    }

    /** {@code bool spvParseTargetEnv(char const * s, spv_target_env * env)} */
    @NativeType("bool")
    public static boolean spvParseTargetEnv(@NativeType("char const *") CharSequence s, @NativeType("spv_target_env *") IntBuffer env) {
        if (CHECKS) {
            check(env, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(s, true);
            long sEncoded = stack.getPointerAddress();
            return nspvParseTargetEnv(sEncoded, memAddress(env));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvParseVulkanEnv ] ---

    /** {@code bool spvParseVulkanEnv(uint32_t vulkan_ver, uint32_t spirv_ver, spv_target_env * env)} */
    public static boolean nspvParseVulkanEnv(int vulkan_ver, int spirv_ver, long env) {
        long __functionAddress = Functions.ParseVulkanEnv;
        return invokePZ(vulkan_ver, spirv_ver, env, __functionAddress);
    }

    /** {@code bool spvParseVulkanEnv(uint32_t vulkan_ver, uint32_t spirv_ver, spv_target_env * env)} */
    @NativeType("bool")
    public static boolean spvParseVulkanEnv(@NativeType("uint32_t") int vulkan_ver, @NativeType("uint32_t") int spirv_ver, @NativeType("spv_target_env *") IntBuffer env) {
        if (CHECKS) {
            check(env, 1);
        }
        return nspvParseVulkanEnv(vulkan_ver, spirv_ver, memAddress(env));
    }

    // --- [ spvContextCreate ] ---

    /** {@code spv_context spvContextCreate(spv_target_env env)} */
    @NativeType("spv_context")
    public static long spvContextCreate(@NativeType("spv_target_env") int env) {
        long __functionAddress = Functions.ContextCreate;
        return invokeP(env, __functionAddress);
    }

    // --- [ spvContextDestroy ] ---

    /** {@code void spvContextDestroy(spv_context context)} */
    public static void spvContextDestroy(@NativeType("spv_context") long context) {
        long __functionAddress = Functions.ContextDestroy;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ spvValidatorOptionsCreate ] ---

    /** {@code spv_validator_options spvValidatorOptionsCreate(void)} */
    @NativeType("spv_validator_options")
    public static long spvValidatorOptionsCreate() {
        long __functionAddress = Functions.ValidatorOptionsCreate;
        return invokeP(__functionAddress);
    }

    // --- [ spvValidatorOptionsDestroy ] ---

    /** {@code void spvValidatorOptionsDestroy(spv_validator_options options)} */
    public static void spvValidatorOptionsDestroy(@NativeType("spv_validator_options") long options) {
        long __functionAddress = Functions.ValidatorOptionsDestroy;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetUniversalLimit ] ---

    /** {@code void spvValidatorOptionsSetUniversalLimit(spv_validator_options options, spv_validator_limit limit_type, uint32_t limit)} */
    public static void spvValidatorOptionsSetUniversalLimit(@NativeType("spv_validator_options") long options, @NativeType("spv_validator_limit") int limit_type, @NativeType("uint32_t") int limit) {
        long __functionAddress = Functions.ValidatorOptionsSetUniversalLimit;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, limit_type, limit, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetRelaxStoreStruct ] ---

    /** {@code void spvValidatorOptionsSetRelaxStoreStruct(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetRelaxStoreStruct(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetRelaxStoreStruct;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetRelaxLogicalPointer ] ---

    /** {@code void spvValidatorOptionsSetRelaxLogicalPointer(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetRelaxLogicalPointer(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetRelaxLogicalPointer;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetBeforeHlslLegalization ] ---

    /** {@code void spvValidatorOptionsSetBeforeHlslLegalization(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetBeforeHlslLegalization(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetBeforeHlslLegalization;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetRelaxBlockLayout ] ---

    /** {@code void spvValidatorOptionsSetRelaxBlockLayout(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetRelaxBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetRelaxBlockLayout;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetUniformBufferStandardLayout ] ---

    /** {@code void spvValidatorOptionsSetUniformBufferStandardLayout(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetUniformBufferStandardLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetUniformBufferStandardLayout;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetScalarBlockLayout ] ---

    /** {@code void spvValidatorOptionsSetScalarBlockLayout(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetScalarBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetScalarBlockLayout;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetWorkgroupScalarBlockLayout ] ---

    /** {@code void spvValidatorOptionsSetWorkgroupScalarBlockLayout(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetWorkgroupScalarBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetWorkgroupScalarBlockLayout;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetSkipBlockLayout ] ---

    /** {@code void spvValidatorOptionsSetSkipBlockLayout(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetSkipBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetSkipBlockLayout;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetAllowLocalSizeId ] ---

    /** {@code void spvValidatorOptionsSetAllowLocalSizeId(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetAllowLocalSizeId(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetAllowLocalSizeId;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetAllowOffsetTextureOperand ] ---

    /** {@code void spvValidatorOptionsSetAllowOffsetTextureOperand(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetAllowOffsetTextureOperand(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetAllowOffsetTextureOperand;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetAllowVulkan32BitBitwise ] ---

    /** {@code void spvValidatorOptionsSetAllowVulkan32BitBitwise(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetAllowVulkan32BitBitwise(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetAllowVulkan32BitBitwise;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvValidatorOptionsSetFriendlyNames ] ---

    /** {@code void spvValidatorOptionsSetFriendlyNames(spv_validator_options options, bool val)} */
    public static void spvValidatorOptionsSetFriendlyNames(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetFriendlyNames;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvOptimizerOptionsCreate ] ---

    /** {@code spv_optimizer_options spvOptimizerOptionsCreate(void)} */
    @NativeType("spv_optimizer_options")
    public static long spvOptimizerOptionsCreate() {
        long __functionAddress = Functions.OptimizerOptionsCreate;
        return invokeP(__functionAddress);
    }

    // --- [ spvOptimizerOptionsDestroy ] ---

    /** {@code void spvOptimizerOptionsDestroy(spv_optimizer_options options)} */
    public static void spvOptimizerOptionsDestroy(@NativeType("spv_optimizer_options") long options) {
        long __functionAddress = Functions.OptimizerOptionsDestroy;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvOptimizerOptionsSetRunValidator ] ---

    /** {@code void spvOptimizerOptionsSetRunValidator(spv_optimizer_options options, bool val)} */
    public static void spvOptimizerOptionsSetRunValidator(@NativeType("spv_optimizer_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.OptimizerOptionsSetRunValidator;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvOptimizerOptionsSetValidatorOptions ] ---

    /** {@code void spvOptimizerOptionsSetValidatorOptions(spv_optimizer_options options, spv_validator_options val)} */
    public static void spvOptimizerOptionsSetValidatorOptions(@NativeType("spv_optimizer_options") long options, @NativeType("spv_validator_options") long val) {
        long __functionAddress = Functions.OptimizerOptionsSetValidatorOptions;
        if (CHECKS) {
            check(options);
            check(val);
        }
        invokePPV(options, val, __functionAddress);
    }

    // --- [ spvOptimizerOptionsSetMaxIdBound ] ---

    /** {@code void spvOptimizerOptionsSetMaxIdBound(spv_optimizer_options options, uint32_t val)} */
    public static void spvOptimizerOptionsSetMaxIdBound(@NativeType("spv_optimizer_options") long options, @NativeType("uint32_t") int val) {
        long __functionAddress = Functions.OptimizerOptionsSetMaxIdBound;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvOptimizerOptionsSetPreserveBindings ] ---

    /** {@code void spvOptimizerOptionsSetPreserveBindings(spv_optimizer_options options, bool val)} */
    public static void spvOptimizerOptionsSetPreserveBindings(@NativeType("spv_optimizer_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.OptimizerOptionsSetPreserveBindings;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvOptimizerOptionsSetPreserveSpecConstants ] ---

    /** {@code void spvOptimizerOptionsSetPreserveSpecConstants(spv_optimizer_options options, bool val)} */
    public static void spvOptimizerOptionsSetPreserveSpecConstants(@NativeType("spv_optimizer_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.OptimizerOptionsSetPreserveSpecConstants;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, val, __functionAddress);
    }

    // --- [ spvReducerOptionsCreate ] ---

    /** {@code spv_reducer_options spvReducerOptionsCreate(void)} */
    @NativeType("spv_reducer_options")
    public static long spvReducerOptionsCreate() {
        long __functionAddress = Functions.ReducerOptionsCreate;
        return invokeP(__functionAddress);
    }

    // --- [ spvReducerOptionsDestroy ] ---

    /** {@code void spvReducerOptionsDestroy(spv_reducer_options options)} */
    public static void spvReducerOptionsDestroy(@NativeType("spv_reducer_options") long options) {
        long __functionAddress = Functions.ReducerOptionsDestroy;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvReducerOptionsSetStepLimit ] ---

    /** {@code void spvReducerOptionsSetStepLimit(spv_reducer_options options, uint32_t step_limit)} */
    public static void spvReducerOptionsSetStepLimit(@NativeType("spv_reducer_options") long options, @NativeType("uint32_t") int step_limit) {
        long __functionAddress = Functions.ReducerOptionsSetStepLimit;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, step_limit, __functionAddress);
    }

    // --- [ spvReducerOptionsSetFailOnValidationError ] ---

    /** {@code void spvReducerOptionsSetFailOnValidationError(spv_reducer_options options, bool fail_on_validation_error)} */
    public static void spvReducerOptionsSetFailOnValidationError(@NativeType("spv_reducer_options") long options, @NativeType("bool") boolean fail_on_validation_error) {
        long __functionAddress = Functions.ReducerOptionsSetFailOnValidationError;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, fail_on_validation_error, __functionAddress);
    }

    // --- [ spvReducerOptionsSetTargetFunction ] ---

    /** {@code void spvReducerOptionsSetTargetFunction(spv_reducer_options options, uint32_t target_function)} */
    public static void spvReducerOptionsSetTargetFunction(@NativeType("spv_reducer_options") long options, @NativeType("uint32_t") int target_function) {
        long __functionAddress = Functions.ReducerOptionsSetTargetFunction;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, target_function, __functionAddress);
    }

    // --- [ spvFuzzerOptionsCreate ] ---

    /** {@code spv_fuzzer_options spvFuzzerOptionsCreate(void)} */
    @NativeType("spv_fuzzer_options")
    public static long spvFuzzerOptionsCreate() {
        long __functionAddress = Functions.FuzzerOptionsCreate;
        return invokeP(__functionAddress);
    }

    // --- [ spvFuzzerOptionsDestroy ] ---

    /** {@code void spvFuzzerOptionsDestroy(spv_fuzzer_options options)} */
    public static void spvFuzzerOptionsDestroy(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsDestroy;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvFuzzerOptionsEnableReplayValidation ] ---

    /** {@code void spvFuzzerOptionsEnableReplayValidation(spv_fuzzer_options options)} */
    public static void spvFuzzerOptionsEnableReplayValidation(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsEnableReplayValidation;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvFuzzerOptionsSetRandomSeed ] ---

    /** {@code void spvFuzzerOptionsSetRandomSeed(spv_fuzzer_options options, uint32_t seed)} */
    public static void spvFuzzerOptionsSetRandomSeed(@NativeType("spv_fuzzer_options") long options, @NativeType("uint32_t") int seed) {
        long __functionAddress = Functions.FuzzerOptionsSetRandomSeed;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, seed, __functionAddress);
    }

    // --- [ spvFuzzerOptionsSetReplayRange ] ---

    /** {@code void spvFuzzerOptionsSetReplayRange(spv_fuzzer_options options, int32_t replay_range)} */
    public static void spvFuzzerOptionsSetReplayRange(@NativeType("spv_fuzzer_options") long options, @NativeType("int32_t") int replay_range) {
        long __functionAddress = Functions.FuzzerOptionsSetReplayRange;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, replay_range, __functionAddress);
    }

    // --- [ spvFuzzerOptionsSetShrinkerStepLimit ] ---

    /** {@code void spvFuzzerOptionsSetShrinkerStepLimit(spv_fuzzer_options options, uint32_t shrinker_step_limit)} */
    public static void spvFuzzerOptionsSetShrinkerStepLimit(@NativeType("spv_fuzzer_options") long options, @NativeType("uint32_t") int shrinker_step_limit) {
        long __functionAddress = Functions.FuzzerOptionsSetShrinkerStepLimit;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, shrinker_step_limit, __functionAddress);
    }

    // --- [ spvFuzzerOptionsEnableFuzzerPassValidation ] ---

    /** {@code void spvFuzzerOptionsEnableFuzzerPassValidation(spv_fuzzer_options options)} */
    public static void spvFuzzerOptionsEnableFuzzerPassValidation(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsEnableFuzzerPassValidation;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvFuzzerOptionsEnableAllPasses ] ---

    /** {@code void spvFuzzerOptionsEnableAllPasses(spv_fuzzer_options options)} */
    public static void spvFuzzerOptionsEnableAllPasses(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsEnableAllPasses;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, __functionAddress);
    }

    // --- [ spvTextToBinary ] ---

    /** {@code spv_result_t spvTextToBinary(spv_const_context const context, char const * text, size_t const length, spv_binary * binary, spv_diagnostic * diagnostic)} */
    public static int nspvTextToBinary(long context, long text, long length, long binary, long diagnostic) {
        long __functionAddress = Functions.TextToBinary;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPPI(context, text, length, binary, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvTextToBinary(spv_const_context const context, char const * text, size_t const length, spv_binary * binary, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvTextToBinary(@NativeType("spv_const_context const") long context, @NativeType("char const *") ByteBuffer text, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            check(binary, 1);
            checkSafe(diagnostic, 1);
        }
        return nspvTextToBinary(context, memAddress(text), text.remaining(), memAddress(binary), memAddressSafe(diagnostic));
    }

    /** {@code spv_result_t spvTextToBinary(spv_const_context const context, char const * text, size_t const length, spv_binary * binary, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvTextToBinary(@NativeType("spv_const_context const") long context, @NativeType("char const *") CharSequence text, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            check(binary, 1);
            checkSafe(diagnostic, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nspvTextToBinary(context, textEncoded, textEncodedLength, memAddress(binary), memAddressSafe(diagnostic));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvTextToBinaryWithOptions ] ---

    /** {@code spv_result_t spvTextToBinaryWithOptions(spv_const_context const context, char const * text, size_t const length, uint32_t options, spv_binary * binary, spv_diagnostic * diagnostic)} */
    public static int nspvTextToBinaryWithOptions(long context, long text, long length, int options, long binary, long diagnostic) {
        long __functionAddress = Functions.TextToBinaryWithOptions;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPPI(context, text, length, options, binary, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvTextToBinaryWithOptions(spv_const_context const context, char const * text, size_t const length, uint32_t options, spv_binary * binary, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvTextToBinaryWithOptions(@NativeType("spv_const_context const") long context, @NativeType("char const *") ByteBuffer text, @NativeType("uint32_t") int options, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            check(binary, 1);
            checkSafe(diagnostic, 1);
        }
        return nspvTextToBinaryWithOptions(context, memAddress(text), text.remaining(), options, memAddress(binary), memAddressSafe(diagnostic));
    }

    /** {@code spv_result_t spvTextToBinaryWithOptions(spv_const_context const context, char const * text, size_t const length, uint32_t options, spv_binary * binary, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvTextToBinaryWithOptions(@NativeType("spv_const_context const") long context, @NativeType("char const *") CharSequence text, @NativeType("uint32_t") int options, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            check(binary, 1);
            checkSafe(diagnostic, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nspvTextToBinaryWithOptions(context, textEncoded, textEncodedLength, options, memAddress(binary), memAddressSafe(diagnostic));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvTextDestroy ] ---

    /** {@code void spvTextDestroy(spv_text text)} */
    public static void nspvTextDestroy(long text) {
        long __functionAddress = Functions.TextDestroy;
        invokePV(text, __functionAddress);
    }

    /** {@code void spvTextDestroy(spv_text text)} */
    public static void spvTextDestroy(@NativeType("spv_text") @Nullable SPVText text) {
        nspvTextDestroy(memAddressSafe(text));
    }

    // --- [ spvBinaryToText ] ---

    /** {@code spv_result_t spvBinaryToText(spv_const_context const context, uint32_t const * binary, size_t const word_count, uint32_t options, spv_text * text, spv_diagnostic * diagnostic)} */
    public static int nspvBinaryToText(long context, long binary, long word_count, int options, long text, long diagnostic) {
        long __functionAddress = Functions.BinaryToText;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPPI(context, binary, word_count, options, text, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvBinaryToText(spv_const_context const context, uint32_t const * binary, size_t const word_count, uint32_t options, spv_text * text, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvBinaryToText(@NativeType("spv_const_context const") long context, @NativeType("uint32_t const *") IntBuffer binary, @NativeType("uint32_t") int options, @NativeType("spv_text *") PointerBuffer text, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            check(text, 1);
            checkSafe(diagnostic, 1);
        }
        return nspvBinaryToText(context, memAddress(binary), binary.remaining(), options, memAddress(text), memAddressSafe(diagnostic));
    }

    // --- [ spvBinaryDestroy ] ---

    /** {@code void spvBinaryDestroy(spv_binary binary)} */
    public static void nspvBinaryDestroy(long binary) {
        long __functionAddress = Functions.BinaryDestroy;
        invokePV(binary, __functionAddress);
    }

    /** {@code void spvBinaryDestroy(spv_binary binary)} */
    public static void spvBinaryDestroy(@NativeType("spv_binary") SPVBinary binary) {
        nspvBinaryDestroy(binary.address());
    }

    // --- [ spvValidate ] ---

    /** {@code spv_result_t spvValidate(spv_const_context const context, spv_const_binary const binary, spv_diagnostic * diagnostic)} */
    public static int nspvValidate(long context, long binary, long diagnostic) {
        long __functionAddress = Functions.Validate;
        if (CHECKS) {
            check(context);
        }
        return invokePPPI(context, binary, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvValidate(spv_const_context const context, spv_const_binary const binary, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvValidate(@NativeType("spv_const_context const") long context, @NativeType("spv_const_binary const") SPVBinary binary, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            checkSafe(diagnostic, 1);
        }
        return nspvValidate(context, binary.address(), memAddressSafe(diagnostic));
    }

    // --- [ spvValidateWithOptions ] ---

    /** {@code spv_result_t spvValidateWithOptions(spv_const_context const context, spv_const_validator_options const options, spv_const_binary const binary, spv_diagnostic * diagnostic)} */
    public static int nspvValidateWithOptions(long context, long options, long binary, long diagnostic) {
        long __functionAddress = Functions.ValidateWithOptions;
        if (CHECKS) {
            check(context);
            check(options);
        }
        return invokePPPPI(context, options, binary, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvValidateWithOptions(spv_const_context const context, spv_const_validator_options const options, spv_const_binary const binary, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvValidateWithOptions(@NativeType("spv_const_context const") long context, @NativeType("spv_const_validator_options const") long options, @NativeType("spv_const_binary const") SPVBinary binary, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            checkSafe(diagnostic, 1);
        }
        return nspvValidateWithOptions(context, options, binary.address(), memAddressSafe(diagnostic));
    }

    // --- [ spvValidateBinary ] ---

    /** {@code spv_result_t spvValidateBinary(spv_const_context const context, uint32_t const * words, size_t const num_words, spv_diagnostic * diagnostic)} */
    public static int nspvValidateBinary(long context, long words, long num_words, long diagnostic) {
        long __functionAddress = Functions.ValidateBinary;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPI(context, words, num_words, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvValidateBinary(spv_const_context const context, uint32_t const * words, size_t const num_words, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvValidateBinary(@NativeType("spv_const_context const") long context, @NativeType("uint32_t const *") IntBuffer words, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            checkSafe(diagnostic, 1);
        }
        return nspvValidateBinary(context, memAddress(words), words.remaining(), memAddressSafe(diagnostic));
    }

    // --- [ spvDiagnosticCreate ] ---

    /** {@code spv_diagnostic spvDiagnosticCreate(spv_position const position, char const * message)} */
    public static long nspvDiagnosticCreate(long position, long message) {
        long __functionAddress = Functions.DiagnosticCreate;
        return invokePPP(position, message, __functionAddress);
    }

    /** {@code spv_diagnostic spvDiagnosticCreate(spv_position const position, char const * message)} */
    @NativeType("spv_diagnostic")
    public static @Nullable SPVDiagnostic spvDiagnosticCreate(@NativeType("spv_position const") SPVPosition position, @NativeType("char const *") ByteBuffer message) {
        if (CHECKS) {
            checkNT1(message);
        }
        long __result = nspvDiagnosticCreate(position.address(), memAddress(message));
        return SPVDiagnostic.createSafe(__result);
    }

    /** {@code spv_diagnostic spvDiagnosticCreate(spv_position const position, char const * message)} */
    @NativeType("spv_diagnostic")
    public static @Nullable SPVDiagnostic spvDiagnosticCreate(@NativeType("spv_position const") SPVPosition position, @NativeType("char const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            long __result = nspvDiagnosticCreate(position.address(), messageEncoded);
            return SPVDiagnostic.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvDiagnosticDestroy ] ---

    /** {@code void spvDiagnosticDestroy(spv_diagnostic diagnostic)} */
    public static void nspvDiagnosticDestroy(long diagnostic) {
        long __functionAddress = Functions.DiagnosticDestroy;
        invokePV(diagnostic, __functionAddress);
    }

    /** {@code void spvDiagnosticDestroy(spv_diagnostic diagnostic)} */
    public static void spvDiagnosticDestroy(@NativeType("spv_diagnostic") SPVDiagnostic diagnostic) {
        nspvDiagnosticDestroy(diagnostic.address());
    }

    // --- [ spvDiagnosticPrint ] ---

    /** {@code spv_result_t spvDiagnosticPrint(spv_diagnostic const diagnostic)} */
    public static int nspvDiagnosticPrint(long diagnostic) {
        long __functionAddress = Functions.DiagnosticPrint;
        return invokePI(diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvDiagnosticPrint(spv_diagnostic const diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvDiagnosticPrint(@NativeType("spv_diagnostic const") SPVDiagnostic diagnostic) {
        return nspvDiagnosticPrint(diagnostic.address());
    }

    // --- [ spvOpcodeString ] ---

    /** {@code char const * spvOpcodeString(uint32_t const opcode)} */
    public static long nspvOpcodeString(int opcode) {
        long __functionAddress = Functions.OpcodeString;
        return invokeP(opcode, __functionAddress);
    }

    /** {@code char const * spvOpcodeString(uint32_t const opcode)} */
    @NativeType("char const *")
    public static @Nullable String spvOpcodeString(@NativeType("uint32_t const") int opcode) {
        long __result = nspvOpcodeString(opcode);
        return memASCIISafe(__result);
    }

    // --- [ spvBinaryParse ] ---

    /** {@code spv_result_t spvBinaryParse(spv_const_context const context, void * user_data, uint32_t const * words, size_t const num_words, spv_parsed_header_fn_t parse_header, spv_parsed_instruction_fn_t parse_instruction, spv_diagnostic * diagnostic)} */
    public static int nspvBinaryParse(long context, long user_data, long words, long num_words, long parse_header, long parse_instruction, long diagnostic) {
        long __functionAddress = Functions.BinaryParse;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPPPPI(context, user_data, words, num_words, parse_header, parse_instruction, diagnostic, __functionAddress);
    }

    /** {@code spv_result_t spvBinaryParse(spv_const_context const context, void * user_data, uint32_t const * words, size_t const num_words, spv_parsed_header_fn_t parse_header, spv_parsed_instruction_fn_t parse_instruction, spv_diagnostic * diagnostic)} */
    @NativeType("spv_result_t")
    public static int spvBinaryParse(@NativeType("spv_const_context const") long context, @NativeType("void *") long user_data, @NativeType("uint32_t const *") IntBuffer words, @NativeType("spv_parsed_header_fn_t") @Nullable SPVParsedHeaderFnI parse_header, @NativeType("spv_parsed_instruction_fn_t") @Nullable SPVParsedInstructionFnI parse_instruction, @NativeType("spv_diagnostic *") @Nullable PointerBuffer diagnostic) {
        if (CHECKS) {
            checkSafe(diagnostic, 1);
        }
        return nspvBinaryParse(context, user_data, memAddress(words), words.remaining(), memAddressSafe(parse_header), memAddressSafe(parse_instruction), memAddressSafe(diagnostic));
    }

}