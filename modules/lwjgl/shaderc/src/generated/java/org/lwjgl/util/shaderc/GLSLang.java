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

public class GLSLang {

    private static final SharedLibrary SHADERC = Library.loadNative(GLSLang.class, "org.lwjgl.shaderc", Configuration.GLSLANG_LIBRARY_NAME, Shaderc::getLibrary);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            get_version                                      = apiGetFunctionAddress(SHADERC, "glslang_get_version"),
            initialize_process                               = apiGetFunctionAddress(SHADERC, "glslang_initialize_process"),
            finalize_process                                 = apiGetFunctionAddress(SHADERC, "glslang_finalize_process"),
            shader_create                                    = apiGetFunctionAddress(SHADERC, "glslang_shader_create"),
            shader_delete                                    = apiGetFunctionAddress(SHADERC, "glslang_shader_delete"),
            shader_set_preamble                              = apiGetFunctionAddress(SHADERC, "glslang_shader_set_preamble"),
            shader_set_entry_point                           = apiGetFunctionAddress(SHADERC, "glslang_shader_set_entry_point"),
            shader_set_invert_y                              = apiGetFunctionAddress(SHADERC, "glslang_shader_set_invert_y"),
            shader_shift_binding                             = apiGetFunctionAddress(SHADERC, "glslang_shader_shift_binding"),
            shader_shift_binding_for_set                     = apiGetFunctionAddress(SHADERC, "glslang_shader_shift_binding_for_set"),
            shader_set_options                               = apiGetFunctionAddress(SHADERC, "glslang_shader_set_options"),
            shader_set_glsl_version                          = apiGetFunctionAddress(SHADERC, "glslang_shader_set_glsl_version"),
            shader_set_default_uniform_block_set_and_binding = apiGetFunctionAddress(SHADERC, "glslang_shader_set_default_uniform_block_set_and_binding"),
            shader_set_default_uniform_block_name            = apiGetFunctionAddress(SHADERC, "glslang_shader_set_default_uniform_block_name"),
            shader_set_resource_set_binding                  = apiGetFunctionAddress(SHADERC, "glslang_shader_set_resource_set_binding"),
            shader_preprocess                                = apiGetFunctionAddress(SHADERC, "glslang_shader_preprocess"),
            shader_parse                                     = apiGetFunctionAddress(SHADERC, "glslang_shader_parse"),
            shader_get_preprocessed_code                     = apiGetFunctionAddress(SHADERC, "glslang_shader_get_preprocessed_code"),
            shader_set_preprocessed_code                     = apiGetFunctionAddress(SHADERC, "glslang_shader_set_preprocessed_code"),
            shader_get_info_log                              = apiGetFunctionAddress(SHADERC, "glslang_shader_get_info_log"),
            shader_get_info_debug_log                        = apiGetFunctionAddress(SHADERC, "glslang_shader_get_info_debug_log"),
            program_create                                   = apiGetFunctionAddress(SHADERC, "glslang_program_create"),
            program_delete                                   = apiGetFunctionAddress(SHADERC, "glslang_program_delete"),
            program_add_shader                               = apiGetFunctionAddress(SHADERC, "glslang_program_add_shader"),
            program_link                                     = apiGetFunctionAddress(SHADERC, "glslang_program_link"),
            program_add_source_text                          = apiGetFunctionAddress(SHADERC, "glslang_program_add_source_text"),
            program_set_source_file                          = apiGetFunctionAddress(SHADERC, "glslang_program_set_source_file"),
            program_map_io                                   = apiGetFunctionAddress(SHADERC, "glslang_program_map_io"),
            program_map_io_with_resolver_and_mapper          = apiGetFunctionAddress(SHADERC, "glslang_program_map_io_with_resolver_and_mapper"),
            program_SPIRV_generate                           = apiGetFunctionAddress(SHADERC, "glslang_program_SPIRV_generate"),
            program_SPIRV_generate_with_options              = apiGetFunctionAddress(SHADERC, "glslang_program_SPIRV_generate_with_options"),
            program_SPIRV_get_size                           = apiGetFunctionAddress(SHADERC, "glslang_program_SPIRV_get_size"),
            program_SPIRV_get                                = apiGetFunctionAddress(SHADERC, "glslang_program_SPIRV_get"),
            program_SPIRV_get_ptr                            = apiGetFunctionAddress(SHADERC, "glslang_program_SPIRV_get_ptr"),
            program_SPIRV_get_messages                       = apiGetFunctionAddress(SHADERC, "glslang_program_SPIRV_get_messages"),
            program_get_info_log                             = apiGetFunctionAddress(SHADERC, "glslang_program_get_info_log"),
            program_get_info_debug_log                       = apiGetFunctionAddress(SHADERC, "glslang_program_get_info_debug_log"),
            glsl_mapper_create                               = apiGetFunctionAddress(SHADERC, "glslang_glsl_mapper_create"),
            glsl_mapper_delete                               = apiGetFunctionAddress(SHADERC, "glslang_glsl_mapper_delete"),
            glsl_resolver_create                             = apiGetFunctionAddress(SHADERC, "glslang_glsl_resolver_create"),
            glsl_resolver_delete                             = apiGetFunctionAddress(SHADERC, "glslang_glsl_resolver_delete");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    public static final int
        GLSLANG_STAGE_VERTEX         = 0,
        GLSLANG_STAGE_TESSCONTROL    = 1,
        GLSLANG_STAGE_TESSEVALUATION = 2,
        GLSLANG_STAGE_GEOMETRY       = 3,
        GLSLANG_STAGE_FRAGMENT       = 4,
        GLSLANG_STAGE_COMPUTE        = 5,
        GLSLANG_STAGE_RAYGEN         = 6,
        GLSLANG_STAGE_RAYGEN_NV      = GLSLANG_STAGE_RAYGEN,
        GLSLANG_STAGE_INTERSECT      = 7,
        GLSLANG_STAGE_INTERSECT_NV   = GLSLANG_STAGE_INTERSECT,
        GLSLANG_STAGE_ANYHIT         = 8,
        GLSLANG_STAGE_ANYHIT_NV      = GLSLANG_STAGE_ANYHIT,
        GLSLANG_STAGE_CLOSESTHIT     = 9,
        GLSLANG_STAGE_CLOSESTHIT_NV  = GLSLANG_STAGE_CLOSESTHIT,
        GLSLANG_STAGE_MISS           = 10,
        GLSLANG_STAGE_MISS_NV        = GLSLANG_STAGE_MISS,
        GLSLANG_STAGE_CALLABLE       = 11,
        GLSLANG_STAGE_CALLABLE_NV    = GLSLANG_STAGE_CALLABLE,
        GLSLANG_STAGE_TASK           = 12,
        GLSLANG_STAGE_TASK_NV        = GLSLANG_STAGE_TASK,
        GLSLANG_STAGE_MESH           = 13,
        GLSLANG_STAGE_MESH_NV        = GLSLANG_STAGE_MESH;

    public static final int
        GLSLANG_STAGE_VERTEX_MASK         = (1 << GLSLANG_STAGE_VERTEX),
        GLSLANG_STAGE_TESSCONTROL_MASK    = (1 << GLSLANG_STAGE_TESSCONTROL),
        GLSLANG_STAGE_TESSEVALUATION_MASK = (1 << GLSLANG_STAGE_TESSEVALUATION),
        GLSLANG_STAGE_GEOMETRY_MASK       = (1 << GLSLANG_STAGE_GEOMETRY),
        GLSLANG_STAGE_FRAGMENT_MASK       = (1 << GLSLANG_STAGE_FRAGMENT),
        GLSLANG_STAGE_COMPUTE_MASK        = (1 << GLSLANG_STAGE_COMPUTE),
        GLSLANG_STAGE_RAYGEN_MASK         = (1 << GLSLANG_STAGE_RAYGEN),
        GLSLANG_STAGE_RAYGEN_NV_MASK      = GLSLANG_STAGE_RAYGEN_MASK,
        GLSLANG_STAGE_INTERSECT_MASK      = (1 << GLSLANG_STAGE_INTERSECT),
        GLSLANG_STAGE_INTERSECT_NV_MASK   = GLSLANG_STAGE_INTERSECT_MASK,
        GLSLANG_STAGE_ANYHIT_MASK         = (1 << GLSLANG_STAGE_ANYHIT),
        GLSLANG_STAGE_ANYHIT_NV_MASK      = GLSLANG_STAGE_ANYHIT_MASK,
        GLSLANG_STAGE_CLOSESTHIT_MASK     = (1 << GLSLANG_STAGE_CLOSESTHIT),
        GLSLANG_STAGE_CLOSESTHIT_NV_MASK  = GLSLANG_STAGE_CLOSESTHIT_MASK,
        GLSLANG_STAGE_MISS_MASK           = (1 << GLSLANG_STAGE_MISS),
        GLSLANG_STAGE_MISS_NV_MASK        = GLSLANG_STAGE_MISS_MASK,
        GLSLANG_STAGE_CALLABLE_MASK       = (1 << GLSLANG_STAGE_CALLABLE),
        GLSLANG_STAGE_CALLABLE_NV_MASK    = GLSLANG_STAGE_CALLABLE_MASK,
        GLSLANG_STAGE_TASK_MASK           = (1 << GLSLANG_STAGE_TASK),
        GLSLANG_STAGE_TASK_NV_MASK        = GLSLANG_STAGE_TASK_MASK,
        GLSLANG_STAGE_MESH_MASK           = (1 << GLSLANG_STAGE_MESH),
        GLSLANG_STAGE_MESH_NV_MASK        = GLSLANG_STAGE_MESH_MASK;

    public static final int
        GLSLANG_SOURCE_NONE = 0,
        GLSLANG_SOURCE_GLSL = 1,
        GLSLANG_SOURCE_HLSL = 2;

    public static final int
        GLSLANG_CLIENT_NONE   = 0,
        GLSLANG_CLIENT_VULKAN = 1,
        GLSLANG_CLIENT_OPENGL = 2;

    public static final int
        GLSLANG_TARGET_NONE = 0,
        GLSLANG_TARGET_SPV  = 1;

    public static final int
        GLSLANG_TARGET_VULKAN_1_0 = (1 << 22),
        GLSLANG_TARGET_VULKAN_1_1 = (1 << 22) | (1 << 12),
        GLSLANG_TARGET_VULKAN_1_2 = (1 << 22) | (2 << 12),
        GLSLANG_TARGET_VULKAN_1_3 = (1 << 22) | (3 << 12),
        GLSLANG_TARGET_VULKAN_1_4 = (1 << 22) | (4 << 12),
        GLSLANG_TARGET_OPENGL_450 = 450;

    public static final int
        GLSLANG_TARGET_SPV_1_0 = (1 << 16),
        GLSLANG_TARGET_SPV_1_1 = (1 << 16) | (1 << 8),
        GLSLANG_TARGET_SPV_1_2 = (1 << 16) | (2 << 8),
        GLSLANG_TARGET_SPV_1_3 = (1 << 16) | (3 << 8),
        GLSLANG_TARGET_SPV_1_4 = (1 << 16) | (4 << 8),
        GLSLANG_TARGET_SPV_1_5 = (1 << 16) | (5 << 8),
        GLSLANG_TARGET_SPV_1_6 = (1 << 16) | (6 << 8);

    public static final int
        GLSLANG_EX_VERTEX_FRAGMENT = 0,
        GLSLANG_EX_FRAGMENT        = 1;

    public static final int
        GLSLANG_OPT_NO_GENERATION = 0,
        GLSLANG_OPT_NONE          = 1,
        GLSLANG_OPT_SIMPLE        = 2,
        GLSLANG_OPT_FULL          = 3;

    public static final int
        GLSLANG_TEX_SAMP_TRANS_KEEP                           = 0,
        GLSLANG_TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER = 1;

    public static final int
        GLSLANG_MSG_DEFAULT_BIT                 = 0,
        GLSLANG_MSG_RELAXED_ERRORS_BIT          = (1 << 0),
        GLSLANG_MSG_SUPPRESS_WARNINGS_BIT       = (1 << 1),
        GLSLANG_MSG_AST_BIT                     = (1 << 2),
        GLSLANG_MSG_SPV_RULES_BIT               = (1 << 3),
        GLSLANG_MSG_VULKAN_RULES_BIT            = (1 << 4),
        GLSLANG_MSG_ONLY_PREPROCESSOR_BIT       = (1 << 5),
        GLSLANG_MSG_READ_HLSL_BIT               = (1 << 6),
        GLSLANG_MSG_CASCADING_ERRORS_BIT        = (1 << 7),
        GLSLANG_MSG_KEEP_UNCALLED_BIT           = (1 << 8),
        GLSLANG_MSG_HLSL_OFFSETS_BIT            = (1 << 9),
        GLSLANG_MSG_DEBUG_INFO_BIT              = (1 << 10),
        GLSLANG_MSG_HLSL_ENABLE_16BIT_TYPES_BIT = (1 << 11),
        GLSLANG_MSG_HLSL_LEGALIZATION_BIT       = (1 << 12),
        GLSLANG_MSG_HLSL_DX9_COMPATIBLE_BIT     = (1 << 13),
        GLSLANG_MSG_BUILTIN_SYMBOL_TABLE_BIT    = (1 << 14),
        GLSLANG_MSG_ENHANCED                    = (1 << 15),
        GLSLANG_MSG_ABSOLUTE_PATH               = (1 << 16),
        GLSLANG_MSG_DISPLAY_ERROR_COLUMN        = (1 << 17),
        GLSLANG_MSG_LINK_TIME_OPTIMIZATION_BIT  = (1 << 18),
        GLSLANG_MSG_VALIDATE_CROSS_STAGE_IO_BIT = (1 << 19);

    public static final int
        GLSLANG_REFLECTION_DEFAULT_BIT             = 0,
        GLSLANG_REFLECTION_STRICT_ARRAY_SUFFIX_BIT = (1 << 0),
        GLSLANG_REFLECTION_BASIC_ARRAY_SUFFIX_BIT  = (1 << 1),
        GLSLANG_REFLECTION_INTERMEDIATE_IOO_BIT    = (1 << 2),
        GLSLANG_REFLECTION_SEPARATE_BUFFERS_BIT    = (1 << 3),
        GLSLANG_REFLECTION_ALL_BLOCK_VARIABLES_BIT = (1 << 4),
        GLSLANG_REFLECTION_UNWRAP_IO_BLOCKS_BIT    = (1 << 5),
        GLSLANG_REFLECTION_ALL_IO_VARIABLES_BIT    = (1 << 6),
        GLSLANG_REFLECTION_SHARED_STD140_SSBO_BIT  = (1 << 7),
        GLSLANG_REFLECTION_SHARED_STD140_UBO_BIT   = (1 << 8);

    public static final int
        GLSLANG_BAD_PROFILE           = 0,
        GLSLANG_NO_PROFILE            = (1 << 0),
        GLSLANG_CORE_PROFILE          = (1 << 1),
        GLSLANG_COMPATIBILITY_PROFILE = (1 << 2),
        GLSLANG_ES_PROFILE            = (1 << 3);

    public static final int
        GLSLANG_SHADER_DEFAULT_BIT                = 0,
        GLSLANG_SHADER_AUTO_MAP_BINDINGS          = (1 << 0),
        GLSLANG_SHADER_AUTO_MAP_LOCATIONS         = (1 << 1),
        GLSLANG_SHADER_VULKAN_RULES_RELAXED       = (1 << 2),
        GLSLANG_SHADER_BINDINGS_PER_RESOURCE_TYPE = (1 << 3);

    public static final int
        GLSLANG_RESOURCE_TYPE_SAMPLER          = 0,
        GLSLANG_RESOURCE_TYPE_TEXTURE          = 1,
        GLSLANG_RESOURCE_TYPE_IMAGE            = 2,
        GLSLANG_RESOURCE_TYPE_UBO              = 3,
        GLSLANG_RESOURCE_TYPE_SSBO             = 4,
        GLSLANG_RESOURCE_TYPE_UAV              = 5,
        GLSLANG_RESOURCE_TYPE_COMBINED_SAMPLER = 6,
        GLSLANG_RESOURCE_TYPE_AS               = 7,
        GLSLANG_RESOURCE_TYPE_TENSOR           = 8;

    protected GLSLang() {
        throw new UnsupportedOperationException();
    }

    // --- [ glslang_get_version ] ---

    /** {@code void glslang_get_version(glslang_version_t * version)} */
    public static void nglslang_get_version(long version) {
        long __functionAddress = Functions.get_version;
        invokePV(version, __functionAddress);
    }

    /** {@code void glslang_get_version(glslang_version_t * version)} */
    public static void glslang_get_version(@NativeType("glslang_version_t *") GLSLangVersion version) {
        nglslang_get_version(version.address());
    }

    // --- [ glslang_initialize_process ] ---

    /** {@code int glslang_initialize_process(void)} */
    @NativeType("int")
    public static boolean glslang_initialize_process() {
        long __functionAddress = Functions.initialize_process;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glslang_finalize_process ] ---

    /** {@code void glslang_finalize_process(void)} */
    public static void glslang_finalize_process() {
        long __functionAddress = Functions.finalize_process;
        invokeV(__functionAddress);
    }

    // --- [ glslang_shader_create ] ---

    /** {@code glslang_shader_t * glslang_shader_create(glslang_input_t const * input)} */
    public static long nglslang_shader_create(long input) {
        long __functionAddress = Functions.shader_create;
        return invokePP(input, __functionAddress);
    }

    /** {@code glslang_shader_t * glslang_shader_create(glslang_input_t const * input)} */
    @NativeType("glslang_shader_t *")
    public static long glslang_shader_create(@NativeType("glslang_input_t const *") GLSLangInput input) {
        return nglslang_shader_create(input.address());
    }

    // --- [ glslang_shader_delete ] ---

    /** {@code void glslang_shader_delete(glslang_shader_t * shader)} */
    public static void glslang_shader_delete(@NativeType("glslang_shader_t *") long shader) {
        long __functionAddress = Functions.shader_delete;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, __functionAddress);
    }

    // --- [ glslang_shader_set_preamble ] ---

    /** {@code void glslang_shader_set_preamble(glslang_shader_t * shader, char const * s)} */
    public static void nglslang_shader_set_preamble(long shader, long s) {
        long __functionAddress = Functions.shader_set_preamble;
        if (CHECKS) {
            check(shader);
        }
        invokePPV(shader, s, __functionAddress);
    }

    /** {@code void glslang_shader_set_preamble(glslang_shader_t * shader, char const * s)} */
    public static void glslang_shader_set_preamble(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer s) {
        if (CHECKS) {
            checkNT1(s);
        }
        nglslang_shader_set_preamble(shader, memAddress(s));
    }

    /** {@code void glslang_shader_set_preamble(glslang_shader_t * shader, char const * s)} */
    public static void glslang_shader_set_preamble(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence s) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s, true);
            long sEncoded = stack.getPointerAddress();
            nglslang_shader_set_preamble(shader, sEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glslang_shader_set_entry_point ] ---

    /** {@code void glslang_shader_set_entry_point(glslang_shader_t * shader, char const * s)} */
    public static void nglslang_shader_set_entry_point(long shader, long s) {
        long __functionAddress = Functions.shader_set_entry_point;
        if (CHECKS) {
            check(shader);
        }
        invokePPV(shader, s, __functionAddress);
    }

    /** {@code void glslang_shader_set_entry_point(glslang_shader_t * shader, char const * s)} */
    public static void glslang_shader_set_entry_point(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer s) {
        if (CHECKS) {
            checkNT1(s);
        }
        nglslang_shader_set_entry_point(shader, memAddress(s));
    }

    /** {@code void glslang_shader_set_entry_point(glslang_shader_t * shader, char const * s)} */
    public static void glslang_shader_set_entry_point(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence s) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s, true);
            long sEncoded = stack.getPointerAddress();
            nglslang_shader_set_entry_point(shader, sEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glslang_shader_set_invert_y ] ---

    /** {@code void glslang_shader_set_invert_y(glslang_shader_t * shader, bool y)} */
    public static void glslang_shader_set_invert_y(@NativeType("glslang_shader_t *") long shader, @NativeType("bool") boolean y) {
        long __functionAddress = Functions.shader_set_invert_y;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, y, __functionAddress);
    }

    // --- [ glslang_shader_shift_binding ] ---

    /** {@code void glslang_shader_shift_binding(glslang_shader_t * shader, glslang_resource_type_t res, unsigned int base)} */
    public static void glslang_shader_shift_binding(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_resource_type_t") int res, @NativeType("unsigned int") int base) {
        long __functionAddress = Functions.shader_shift_binding;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, res, base, __functionAddress);
    }

    // --- [ glslang_shader_shift_binding_for_set ] ---

    /** {@code void glslang_shader_shift_binding_for_set(glslang_shader_t * shader, glslang_resource_type_t res, unsigned int base, unsigned int set)} */
    public static void glslang_shader_shift_binding_for_set(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_resource_type_t") int res, @NativeType("unsigned int") int base, @NativeType("unsigned int") int set) {
        long __functionAddress = Functions.shader_shift_binding_for_set;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, res, base, set, __functionAddress);
    }

    // --- [ glslang_shader_set_options ] ---

    /** {@code void glslang_shader_set_options(glslang_shader_t * shader, int options)} */
    public static void glslang_shader_set_options(@NativeType("glslang_shader_t *") long shader, int options) {
        long __functionAddress = Functions.shader_set_options;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, options, __functionAddress);
    }

    // --- [ glslang_shader_set_glsl_version ] ---

    /** {@code void glslang_shader_set_glsl_version(glslang_shader_t * shader, int version)} */
    public static void glslang_shader_set_glsl_version(@NativeType("glslang_shader_t *") long shader, int version) {
        long __functionAddress = Functions.shader_set_glsl_version;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, version, __functionAddress);
    }

    // --- [ glslang_shader_set_default_uniform_block_set_and_binding ] ---

    /** {@code void glslang_shader_set_default_uniform_block_set_and_binding(glslang_shader_t * shader, unsigned int set, unsigned int binding)} */
    public static void glslang_shader_set_default_uniform_block_set_and_binding(@NativeType("glslang_shader_t *") long shader, @NativeType("unsigned int") int set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.shader_set_default_uniform_block_set_and_binding;
        if (CHECKS) {
            check(shader);
        }
        invokePV(shader, set, binding, __functionAddress);
    }

    // --- [ glslang_shader_set_default_uniform_block_name ] ---

    /** {@code void glslang_shader_set_default_uniform_block_name(glslang_shader_t * shader, char const * name)} */
    public static void nglslang_shader_set_default_uniform_block_name(long shader, long name) {
        long __functionAddress = Functions.shader_set_default_uniform_block_name;
        if (CHECKS) {
            check(shader);
        }
        invokePPV(shader, name, __functionAddress);
    }

    /** {@code void glslang_shader_set_default_uniform_block_name(glslang_shader_t * shader, char const * name)} */
    public static void glslang_shader_set_default_uniform_block_name(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglslang_shader_set_default_uniform_block_name(shader, memAddress(name));
    }

    /** {@code void glslang_shader_set_default_uniform_block_name(glslang_shader_t * shader, char const * name)} */
    public static void glslang_shader_set_default_uniform_block_name(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglslang_shader_set_default_uniform_block_name(shader, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glslang_shader_set_resource_set_binding ] ---

    /** {@code void glslang_shader_set_resource_set_binding(glslang_shader_t * shader, char const * const * bindings, unsigned int num_bindings)} */
    public static void nglslang_shader_set_resource_set_binding(long shader, long bindings, int num_bindings) {
        long __functionAddress = Functions.shader_set_resource_set_binding;
        if (CHECKS) {
            check(shader);
        }
        invokePPV(shader, bindings, num_bindings, __functionAddress);
    }

    /** {@code void glslang_shader_set_resource_set_binding(glslang_shader_t * shader, char const * const * bindings, unsigned int num_bindings)} */
    public static void glslang_shader_set_resource_set_binding(@NativeType("glslang_shader_t *") long shader, @NativeType("char const * const *") PointerBuffer bindings) {
        nglslang_shader_set_resource_set_binding(shader, memAddress(bindings), bindings.remaining());
    }

    // --- [ glslang_shader_preprocess ] ---

    /** {@code int glslang_shader_preprocess(glslang_shader_t * shader, glslang_input_t const * input)} */
    public static int nglslang_shader_preprocess(long shader, long input) {
        long __functionAddress = Functions.shader_preprocess;
        if (CHECKS) {
            check(shader);
        }
        return invokePPI(shader, input, __functionAddress);
    }

    /** {@code int glslang_shader_preprocess(glslang_shader_t * shader, glslang_input_t const * input)} */
    @NativeType("int")
    public static boolean glslang_shader_preprocess(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_input_t const *") GLSLangInput input) {
        return nglslang_shader_preprocess(shader, input.address()) != 0;
    }

    // --- [ glslang_shader_parse ] ---

    /** {@code int glslang_shader_parse(glslang_shader_t * shader, glslang_input_t const * input)} */
    public static int nglslang_shader_parse(long shader, long input) {
        long __functionAddress = Functions.shader_parse;
        if (CHECKS) {
            check(shader);
        }
        return invokePPI(shader, input, __functionAddress);
    }

    /** {@code int glslang_shader_parse(glslang_shader_t * shader, glslang_input_t const * input)} */
    @NativeType("int")
    public static boolean glslang_shader_parse(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_input_t const *") GLSLangInput input) {
        return nglslang_shader_parse(shader, input.address()) != 0;
    }

    // --- [ glslang_shader_get_preprocessed_code ] ---

    /** {@code char const * glslang_shader_get_preprocessed_code(glslang_shader_t * shader)} */
    public static long nglslang_shader_get_preprocessed_code(long shader) {
        long __functionAddress = Functions.shader_get_preprocessed_code;
        if (CHECKS) {
            check(shader);
        }
        return invokePP(shader, __functionAddress);
    }

    /** {@code char const * glslang_shader_get_preprocessed_code(glslang_shader_t * shader)} */
    @NativeType("char const *")
    public static @Nullable String glslang_shader_get_preprocessed_code(@NativeType("glslang_shader_t *") long shader) {
        long __result = nglslang_shader_get_preprocessed_code(shader);
        return memUTF8Safe(__result);
    }

    // --- [ glslang_shader_set_preprocessed_code ] ---

    /** {@code void glslang_shader_set_preprocessed_code(glslang_shader_t * shader, char const * code)} */
    public static void nglslang_shader_set_preprocessed_code(long shader, long code) {
        long __functionAddress = Functions.shader_set_preprocessed_code;
        if (CHECKS) {
            check(shader);
        }
        invokePPV(shader, code, __functionAddress);
    }

    /** {@code void glslang_shader_set_preprocessed_code(glslang_shader_t * shader, char const * code)} */
    public static void glslang_shader_set_preprocessed_code(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer code) {
        if (CHECKS) {
            checkNT1(code);
        }
        nglslang_shader_set_preprocessed_code(shader, memAddress(code));
    }

    /** {@code void glslang_shader_set_preprocessed_code(glslang_shader_t * shader, char const * code)} */
    public static void glslang_shader_set_preprocessed_code(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence code) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(code, true);
            long codeEncoded = stack.getPointerAddress();
            nglslang_shader_set_preprocessed_code(shader, codeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glslang_shader_get_info_log ] ---

    /** {@code char const * glslang_shader_get_info_log(glslang_shader_t * shader)} */
    public static long nglslang_shader_get_info_log(long shader) {
        long __functionAddress = Functions.shader_get_info_log;
        if (CHECKS) {
            check(shader);
        }
        return invokePP(shader, __functionAddress);
    }

    /** {@code char const * glslang_shader_get_info_log(glslang_shader_t * shader)} */
    @NativeType("char const *")
    public static @Nullable String glslang_shader_get_info_log(@NativeType("glslang_shader_t *") long shader) {
        long __result = nglslang_shader_get_info_log(shader);
        return memUTF8Safe(__result);
    }

    // --- [ glslang_shader_get_info_debug_log ] ---

    /** {@code char const * glslang_shader_get_info_debug_log(glslang_shader_t * shader)} */
    public static long nglslang_shader_get_info_debug_log(long shader) {
        long __functionAddress = Functions.shader_get_info_debug_log;
        if (CHECKS) {
            check(shader);
        }
        return invokePP(shader, __functionAddress);
    }

    /** {@code char const * glslang_shader_get_info_debug_log(glslang_shader_t * shader)} */
    @NativeType("char const *")
    public static @Nullable String glslang_shader_get_info_debug_log(@NativeType("glslang_shader_t *") long shader) {
        long __result = nglslang_shader_get_info_debug_log(shader);
        return memUTF8Safe(__result);
    }

    // --- [ glslang_program_create ] ---

    /** {@code glslang_program_t * glslang_program_create(void)} */
    @NativeType("glslang_program_t *")
    public static long glslang_program_create() {
        long __functionAddress = Functions.program_create;
        return invokeP(__functionAddress);
    }

    // --- [ glslang_program_delete ] ---

    /** {@code void glslang_program_delete(glslang_program_t * program)} */
    public static void glslang_program_delete(@NativeType("glslang_program_t *") long program) {
        long __functionAddress = Functions.program_delete;
        if (CHECKS) {
            check(program);
        }
        invokePV(program, __functionAddress);
    }

    // --- [ glslang_program_add_shader ] ---

    /** {@code void glslang_program_add_shader(glslang_program_t * program, glslang_shader_t * shader)} */
    public static void glslang_program_add_shader(@NativeType("glslang_program_t *") long program, @NativeType("glslang_shader_t *") long shader) {
        long __functionAddress = Functions.program_add_shader;
        if (CHECKS) {
            check(program);
            check(shader);
        }
        invokePPV(program, shader, __functionAddress);
    }

    // --- [ glslang_program_link ] ---

    /** {@code int glslang_program_link(glslang_program_t * program, int messages)} */
    @NativeType("int")
    public static boolean glslang_program_link(@NativeType("glslang_program_t *") long program, int messages) {
        long __functionAddress = Functions.program_link;
        if (CHECKS) {
            check(program);
        }
        return invokePI(program, messages, __functionAddress) != 0;
    }

    // --- [ glslang_program_add_source_text ] ---

    /** {@code void glslang_program_add_source_text(glslang_program_t * program, glslang_stage_t stage, char const * text, size_t len)} */
    public static void nglslang_program_add_source_text(long program, int stage, long text, long len) {
        long __functionAddress = Functions.program_add_source_text;
        if (CHECKS) {
            check(program);
        }
        invokePPPV(program, stage, text, len, __functionAddress);
    }

    /** {@code void glslang_program_add_source_text(glslang_program_t * program, glslang_stage_t stage, char const * text, size_t len)} */
    public static void glslang_program_add_source_text(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") ByteBuffer text) {
        nglslang_program_add_source_text(program, stage, memAddress(text), text.remaining());
    }

    /** {@code void glslang_program_add_source_text(glslang_program_t * program, glslang_stage_t stage, char const * text, size_t len)} */
    public static void glslang_program_add_source_text(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            nglslang_program_add_source_text(program, stage, textEncoded, textEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glslang_program_set_source_file ] ---

    /** {@code void glslang_program_set_source_file(glslang_program_t * program, glslang_stage_t stage, char const * file)} */
    public static void nglslang_program_set_source_file(long program, int stage, long file) {
        long __functionAddress = Functions.program_set_source_file;
        if (CHECKS) {
            check(program);
        }
        invokePPV(program, stage, file, __functionAddress);
    }

    /** {@code void glslang_program_set_source_file(glslang_program_t * program, glslang_stage_t stage, char const * file)} */
    public static void glslang_program_set_source_file(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        nglslang_program_set_source_file(program, stage, memAddress(file));
    }

    /** {@code void glslang_program_set_source_file(glslang_program_t * program, glslang_stage_t stage, char const * file)} */
    public static void glslang_program_set_source_file(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            nglslang_program_set_source_file(program, stage, fileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glslang_program_map_io ] ---

    /** {@code int glslang_program_map_io(glslang_program_t * program)} */
    @NativeType("int")
    public static boolean glslang_program_map_io(@NativeType("glslang_program_t *") long program) {
        long __functionAddress = Functions.program_map_io;
        if (CHECKS) {
            check(program);
        }
        return invokePI(program, __functionAddress) != 0;
    }

    // --- [ glslang_program_map_io_with_resolver_and_mapper ] ---

    /** {@code int glslang_program_map_io_with_resolver_and_mapper(glslang_program_t * program, glslang_resolver_t * resolver, glslang_mapper_t * mapper)} */
    @NativeType("int")
    public static boolean glslang_program_map_io_with_resolver_and_mapper(@NativeType("glslang_program_t *") long program, @NativeType("glslang_resolver_t *") long resolver, @NativeType("glslang_mapper_t *") long mapper) {
        long __functionAddress = Functions.program_map_io_with_resolver_and_mapper;
        if (CHECKS) {
            check(program);
            check(resolver);
            check(mapper);
        }
        return invokePPPI(program, resolver, mapper, __functionAddress) != 0;
    }

    // --- [ glslang_program_SPIRV_generate ] ---

    /** {@code void glslang_program_SPIRV_generate(glslang_program_t * program, glslang_stage_t stage)} */
    public static void glslang_program_SPIRV_generate(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage) {
        long __functionAddress = Functions.program_SPIRV_generate;
        if (CHECKS) {
            check(program);
        }
        invokePV(program, stage, __functionAddress);
    }

    // --- [ glslang_program_SPIRV_generate_with_options ] ---

    /** {@code void glslang_program_SPIRV_generate_with_options(glslang_program_t * program, glslang_stage_t stage, glslang_spv_options_t * spv_options)} */
    public static void nglslang_program_SPIRV_generate_with_options(long program, int stage, long spv_options) {
        long __functionAddress = Functions.program_SPIRV_generate_with_options;
        if (CHECKS) {
            check(program);
        }
        invokePPV(program, stage, spv_options, __functionAddress);
    }

    /** {@code void glslang_program_SPIRV_generate_with_options(glslang_program_t * program, glslang_stage_t stage, glslang_spv_options_t * spv_options)} */
    public static void glslang_program_SPIRV_generate_with_options(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("glslang_spv_options_t *") GLSLangSPVOptions spv_options) {
        nglslang_program_SPIRV_generate_with_options(program, stage, spv_options.address());
    }

    // --- [ glslang_program_SPIRV_get_size ] ---

    /** {@code size_t glslang_program_SPIRV_get_size(glslang_program_t * program)} */
    @NativeType("size_t")
    public static long glslang_program_SPIRV_get_size(@NativeType("glslang_program_t *") long program) {
        long __functionAddress = Functions.program_SPIRV_get_size;
        if (CHECKS) {
            check(program);
        }
        return invokePP(program, __functionAddress);
    }

    // --- [ glslang_program_SPIRV_get ] ---

    /** {@code void glslang_program_SPIRV_get(glslang_program_t * program, unsigned int * out)} */
    public static void nglslang_program_SPIRV_get(long program, long out) {
        long __functionAddress = Functions.program_SPIRV_get;
        if (CHECKS) {
            check(program);
        }
        invokePPV(program, out, __functionAddress);
    }

    /** {@code void glslang_program_SPIRV_get(glslang_program_t * program, unsigned int * out)} */
    public static void glslang_program_SPIRV_get(@NativeType("glslang_program_t *") long program, @NativeType("unsigned int *") IntBuffer out) {
        if (CHECKS) {
            if (DEBUG) {
                check(out, glslang_program_SPIRV_get_size(program));
            }
        }
        nglslang_program_SPIRV_get(program, memAddress(out));
    }

    // --- [ glslang_program_SPIRV_get_ptr ] ---

    /** {@code unsigned int * glslang_program_SPIRV_get_ptr(glslang_program_t * program)} */
    public static long nglslang_program_SPIRV_get_ptr(long program) {
        long __functionAddress = Functions.program_SPIRV_get_ptr;
        if (CHECKS) {
            check(program);
        }
        return invokePP(program, __functionAddress);
    }

    /** {@code unsigned int * glslang_program_SPIRV_get_ptr(glslang_program_t * program)} */
    @NativeType("unsigned int *")
    public static @Nullable IntBuffer glslang_program_SPIRV_get_ptr(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_SPIRV_get_ptr(program);
        return memIntBufferSafe(__result, (int)glslang_program_SPIRV_get_size(program));
    }

    /** {@code unsigned int * glslang_program_SPIRV_get_ptr(glslang_program_t * program)} */
    @NativeType("unsigned int *")
    public static @Nullable IntBuffer glslang_program_SPIRV_get_ptr(@NativeType("glslang_program_t *") long program, long length) {
        long __result = nglslang_program_SPIRV_get_ptr(program);
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ glslang_program_SPIRV_get_messages ] ---

    /** {@code char const * glslang_program_SPIRV_get_messages(glslang_program_t * program)} */
    public static long nglslang_program_SPIRV_get_messages(long program) {
        long __functionAddress = Functions.program_SPIRV_get_messages;
        if (CHECKS) {
            check(program);
        }
        return invokePP(program, __functionAddress);
    }

    /** {@code char const * glslang_program_SPIRV_get_messages(glslang_program_t * program)} */
    @NativeType("char const *")
    public static @Nullable String glslang_program_SPIRV_get_messages(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_SPIRV_get_messages(program);
        return memUTF8Safe(__result);
    }

    // --- [ glslang_program_get_info_log ] ---

    /** {@code char const * glslang_program_get_info_log(glslang_program_t * program)} */
    public static long nglslang_program_get_info_log(long program) {
        long __functionAddress = Functions.program_get_info_log;
        if (CHECKS) {
            check(program);
        }
        return invokePP(program, __functionAddress);
    }

    /** {@code char const * glslang_program_get_info_log(glslang_program_t * program)} */
    @NativeType("char const *")
    public static @Nullable String glslang_program_get_info_log(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_get_info_log(program);
        return memUTF8Safe(__result);
    }

    // --- [ glslang_program_get_info_debug_log ] ---

    /** {@code char const * glslang_program_get_info_debug_log(glslang_program_t * program)} */
    public static long nglslang_program_get_info_debug_log(long program) {
        long __functionAddress = Functions.program_get_info_debug_log;
        if (CHECKS) {
            check(program);
        }
        return invokePP(program, __functionAddress);
    }

    /** {@code char const * glslang_program_get_info_debug_log(glslang_program_t * program)} */
    @NativeType("char const *")
    public static @Nullable String glslang_program_get_info_debug_log(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_get_info_debug_log(program);
        return memUTF8Safe(__result);
    }

    // --- [ glslang_glsl_mapper_create ] ---

    /** {@code glslang_mapper_t * glslang_glsl_mapper_create(void)} */
    @NativeType("glslang_mapper_t *")
    public static long glslang_glsl_mapper_create() {
        long __functionAddress = Functions.glsl_mapper_create;
        return invokeP(__functionAddress);
    }

    // --- [ glslang_glsl_mapper_delete ] ---

    /** {@code void glslang_glsl_mapper_delete(glslang_mapper_t * mapper)} */
    public static void glslang_glsl_mapper_delete(@NativeType("glslang_mapper_t *") long mapper) {
        long __functionAddress = Functions.glsl_mapper_delete;
        if (CHECKS) {
            check(mapper);
        }
        invokePV(mapper, __functionAddress);
    }

    // --- [ glslang_glsl_resolver_create ] ---

    /** {@code glslang_resolver_t * glslang_glsl_resolver_create(glslang_program_t * program, glslang_stage_t stage)} */
    @NativeType("glslang_resolver_t *")
    public static long glslang_glsl_resolver_create(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage) {
        long __functionAddress = Functions.glsl_resolver_create;
        if (CHECKS) {
            check(program);
        }
        return invokePP(program, stage, __functionAddress);
    }

    // --- [ glslang_glsl_resolver_delete ] ---

    /** {@code void glslang_glsl_resolver_delete(glslang_resolver_t * resolver)} */
    public static void glslang_glsl_resolver_delete(@NativeType("glslang_resolver_t *") long resolver) {
        long __functionAddress = Functions.glsl_resolver_delete;
        if (CHECKS) {
            check(resolver);
        }
        invokePV(resolver, __functionAddress);
    }

}