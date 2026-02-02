/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val glslang = "GLSLang".nativeClass(Module.SHADERC, prefix = "GLSLANG", prefixMethod = "glslang_", binding = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.GLSLANG_LIBRARY_NAME, Shaderc::getLibrary"""
)) {
    EnumConstant(
        "STAGE_VERTEX".enum("0"),
        "STAGE_TESSCONTROL".enum,
        "STAGE_TESSEVALUATION".enum,
        "STAGE_GEOMETRY".enum,
        "STAGE_FRAGMENT".enum,
        "STAGE_COMPUTE".enum,
        "STAGE_RAYGEN".enum,
        "STAGE_RAYGEN_NV".enum("GLSLANG_STAGE_RAYGEN"),
        "STAGE_INTERSECT".enum("7"),
        "STAGE_INTERSECT_NV".enum("GLSLANG_STAGE_INTERSECT"),
        "STAGE_ANYHIT".enum("8"),
        "STAGE_ANYHIT_NV".enum("GLSLANG_STAGE_ANYHIT"),
        "STAGE_CLOSESTHIT".enum("9"),
        "STAGE_CLOSESTHIT_NV".enum("GLSLANG_STAGE_CLOSESTHIT"),
        "STAGE_MISS".enum("10"),
        "STAGE_MISS_NV".enum("GLSLANG_STAGE_MISS"),
        "STAGE_CALLABLE".enum("11"),
        "STAGE_CALLABLE_NV".enum("GLSLANG_STAGE_CALLABLE"),
        "STAGE_TASK".enum("12"),
        "STAGE_TASK_NV".enum("GLSLANG_STAGE_TASK"),
        "STAGE_MESH".enum("13"),
        "STAGE_MESH_NV".enum("GLSLANG_STAGE_MESH")
    )

    EnumConstant(
        "STAGE_VERTEX_MASK".enum("(1 << GLSLANG_STAGE_VERTEX)"),
        "STAGE_TESSCONTROL_MASK".enum("(1 << GLSLANG_STAGE_TESSCONTROL)"),
        "STAGE_TESSEVALUATION_MASK".enum("(1 << GLSLANG_STAGE_TESSEVALUATION)"),
        "STAGE_GEOMETRY_MASK".enum("(1 << GLSLANG_STAGE_GEOMETRY)"),
        "STAGE_FRAGMENT_MASK".enum("(1 << GLSLANG_STAGE_FRAGMENT)"),
        "STAGE_COMPUTE_MASK".enum("(1 << GLSLANG_STAGE_COMPUTE)"),
        "STAGE_RAYGEN_MASK".enum("(1 << GLSLANG_STAGE_RAYGEN)"),
        "STAGE_RAYGEN_NV_MASK".enum("GLSLANG_STAGE_RAYGEN_MASK"),
        "STAGE_INTERSECT_MASK".enum("(1 << GLSLANG_STAGE_INTERSECT)"),
        "STAGE_INTERSECT_NV_MASK".enum("GLSLANG_STAGE_INTERSECT_MASK"),
        "STAGE_ANYHIT_MASK".enum("(1 << GLSLANG_STAGE_ANYHIT)"),
        "STAGE_ANYHIT_NV_MASK".enum("GLSLANG_STAGE_ANYHIT_MASK"),
        "STAGE_CLOSESTHIT_MASK".enum("(1 << GLSLANG_STAGE_CLOSESTHIT)"),
        "STAGE_CLOSESTHIT_NV_MASK".enum("GLSLANG_STAGE_CLOSESTHIT_MASK"),
        "STAGE_MISS_MASK".enum("(1 << GLSLANG_STAGE_MISS)"),
        "STAGE_MISS_NV_MASK".enum("GLSLANG_STAGE_MISS_MASK"),
        "STAGE_CALLABLE_MASK".enum("(1 << GLSLANG_STAGE_CALLABLE)"),
        "STAGE_CALLABLE_NV_MASK".enum("GLSLANG_STAGE_CALLABLE_MASK"),
        "STAGE_TASK_MASK".enum("(1 << GLSLANG_STAGE_TASK)"),
        "STAGE_TASK_NV_MASK".enum("GLSLANG_STAGE_TASK_MASK"),
        "STAGE_MESH_MASK".enum("(1 << GLSLANG_STAGE_MESH)"),
        "STAGE_MESH_NV_MASK".enum("GLSLANG_STAGE_MESH_MASK")
    )

    EnumConstant(
        "SOURCE_NONE".enum("0"),
        "SOURCE_GLSL".enum,
        "SOURCE_HLSL".enum
    )

    EnumConstant(
        "CLIENT_NONE".enum("0"),
        "CLIENT_VULKAN".enum,
        "CLIENT_OPENGL".enum
    )

    EnumConstant(
        "TARGET_NONE".enum("0"),
        "TARGET_SPV".enum
    )

    EnumConstant(
        "TARGET_VULKAN_1_0".enum("(1 << 22)"),
        "TARGET_VULKAN_1_1".enum("(1 << 22) | (1 << 12)"),
        "TARGET_VULKAN_1_2".enum("(1 << 22) | (2 << 12)"),
        "TARGET_VULKAN_1_3".enum("(1 << 22) | (3 << 12)"),
        "TARGET_VULKAN_1_4".enum("(1 << 22) | (4 << 12)"),
        "TARGET_OPENGL_450".enum("450")
    )

    EnumConstant(
        "TARGET_SPV_1_0".enum("(1 << 16)"),
        "TARGET_SPV_1_1".enum("(1 << 16) | (1 << 8)"),
        "TARGET_SPV_1_2".enum("(1 << 16) | (2 << 8)"),
        "TARGET_SPV_1_3".enum("(1 << 16) | (3 << 8)"),
        "TARGET_SPV_1_4".enum("(1 << 16) | (4 << 8)"),
        "TARGET_SPV_1_5".enum("(1 << 16) | (5 << 8)"),
        "TARGET_SPV_1_6".enum("(1 << 16) | (6 << 8)")
    )

    EnumConstant(
        "EX_VERTEX_FRAGMENT".enum("0"),
        "EX_FRAGMENT".enum
    )

    EnumConstant(
        "OPT_NO_GENERATION".enum("0"),
        "OPT_NONE".enum,
        "OPT_SIMPLE".enum,
        "OPT_FULL".enum
    )

    EnumConstant(
        "TEX_SAMP_TRANS_KEEP".enum("0"),
        "TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER".enum
    )

    EnumConstant(
        "MSG_DEFAULT_BIT".enum("0"),
        "MSG_RELAXED_ERRORS_BIT".enum("(1 << 0)"),
        "MSG_SUPPRESS_WARNINGS_BIT".enum("(1 << 1)"),
        "MSG_AST_BIT".enum("(1 << 2)"),
        "MSG_SPV_RULES_BIT".enum("(1 << 3)"),
        "MSG_VULKAN_RULES_BIT".enum("(1 << 4)"),
        "MSG_ONLY_PREPROCESSOR_BIT".enum("(1 << 5)"),
        "MSG_READ_HLSL_BIT".enum("(1 << 6)"),
        "MSG_CASCADING_ERRORS_BIT".enum("(1 << 7)"),
        "MSG_KEEP_UNCALLED_BIT".enum("(1 << 8)"),
        "MSG_HLSL_OFFSETS_BIT".enum("(1 << 9)"),
        "MSG_DEBUG_INFO_BIT".enum("(1 << 10)"),
        "MSG_HLSL_ENABLE_16BIT_TYPES_BIT".enum("(1 << 11)"),
        "MSG_HLSL_LEGALIZATION_BIT".enum("(1 << 12)"),
        "MSG_HLSL_DX9_COMPATIBLE_BIT".enum("(1 << 13)"),
        "MSG_BUILTIN_SYMBOL_TABLE_BIT".enum("(1 << 14)"),
        "MSG_ENHANCED".enum("(1 << 15)"),
        "MSG_ABSOLUTE_PATH".enum("(1 << 16)"),
        "MSG_DISPLAY_ERROR_COLUMN".enum("(1 << 17)"),
        "MSG_LINK_TIME_OPTIMIZATION_BIT".enum("(1 << 18)"),
        "MSG_VALIDATE_CROSS_STAGE_IO_BIT".enum("(1 << 19)")
    )

    EnumConstant(
        "REFLECTION_DEFAULT_BIT".enum("0"),
        "REFLECTION_STRICT_ARRAY_SUFFIX_BIT".enum("(1 << 0)"),
        "REFLECTION_BASIC_ARRAY_SUFFIX_BIT".enum("(1 << 1)"),
        "REFLECTION_INTERMEDIATE_IOO_BIT".enum("(1 << 2)"),
        "REFLECTION_SEPARATE_BUFFERS_BIT".enum("(1 << 3)"),
        "REFLECTION_ALL_BLOCK_VARIABLES_BIT".enum("(1 << 4)"),
        "REFLECTION_UNWRAP_IO_BLOCKS_BIT".enum("(1 << 5)"),
        "REFLECTION_ALL_IO_VARIABLES_BIT".enum("(1 << 6)"),
        "REFLECTION_SHARED_STD140_SSBO_BIT".enum("(1 << 7)"),
        "REFLECTION_SHARED_STD140_UBO_BIT".enum("(1 << 8)")
    )

    EnumConstant(
        "BAD_PROFILE".enum("0"),
        "NO_PROFILE".enum("(1 << 0)"),
        "CORE_PROFILE".enum("(1 << 1)"),
        "COMPATIBILITY_PROFILE".enum("(1 << 2)"),
        "ES_PROFILE".enum("(1 << 3)")
    )

    EnumConstant(
        "SHADER_DEFAULT_BIT".enum("0"),
        "SHADER_AUTO_MAP_BINDINGS".enum("(1 << 0)"),
        "SHADER_AUTO_MAP_LOCATIONS".enum("(1 << 1)"),
        "SHADER_VULKAN_RULES_RELAXED".enum("(1 << 2)"),
        "SHADER_BINDINGS_PER_RESOURCE_TYPE".enum("(1 << 3)")
    )

    EnumConstant(
        "RESOURCE_TYPE_SAMPLER".enum("0"),
        "RESOURCE_TYPE_TEXTURE".enum,
        "RESOURCE_TYPE_IMAGE".enum,
        "RESOURCE_TYPE_UBO".enum,
        "RESOURCE_TYPE_SSBO".enum,
        "RESOURCE_TYPE_UAV".enum,
        "RESOURCE_TYPE_COMBINED_SAMPLER".enum,
        "RESOURCE_TYPE_AS".enum,
        "RESOURCE_TYPE_TENSOR".enum
    )

    void(
        "get_version",

        glslang_version_t.p("version")
    )

    intb(
        "initialize_process",

        void()
    )

    void(
        "finalize_process",

        void()
    )

    glslang_shader_t.p(
        "shader_create",

        glslang_input_t.const.p("input")
    )

    void(
        "shader_delete",

        glslang_shader_t.p("shader")
    )

    void(
        "shader_set_preamble",

        glslang_shader_t.p("shader"),
        charUTF8.const.p("s")
    )

    void(
        "shader_set_entry_point",

        glslang_shader_t.p("shader"),
        charUTF8.const.p("s")
    )

    void(
        "shader_set_invert_y",

        glslang_shader_t.p("shader"),
        bool("y")
    )

    void(
        "shader_shift_binding",

        glslang_shader_t.p("shader"),
        glslang_resource_type_t("res"),
        unsigned_int("base")
    )

    void(
        "shader_shift_binding_for_set",

        glslang_shader_t.p("shader"),
        glslang_resource_type_t("res"),
        unsigned_int("base"),
        unsigned_int("set")
    )

    void(
        "shader_set_options",

        glslang_shader_t.p("shader"),
        int("options")
    )

    void(
        "shader_set_glsl_version",

        glslang_shader_t.p("shader"),
        int("version")
    )

    void(
        "shader_set_default_uniform_block_set_and_binding",

        glslang_shader_t.p("shader"),
        unsigned_int("set"),
        unsigned_int("binding")
    )

    void(
        "shader_set_default_uniform_block_name",

        glslang_shader_t.p("shader"),
        charUTF8.const.p("name")
    )

    void(
        "shader_set_resource_set_binding",

        glslang_shader_t.p("shader"),
        charUTF8.const.p.const.p("bindings"),
        AutoSize("bindings")..unsigned_int("num_bindings")
    )

    intb(
        "shader_preprocess",

        glslang_shader_t.p("shader"),
        glslang_input_t.const.p("input")
    )

    intb(
        "shader_parse",

        glslang_shader_t.p("shader"),
        glslang_input_t.const.p("input")
    )

    charUTF8.const.p(
        "shader_get_preprocessed_code",

        glslang_shader_t.p("shader")
    )

    void(
        "shader_set_preprocessed_code",

        glslang_shader_t.p("shader"),
        charUTF8.const.p("code")
    )

    charUTF8.const.p(
        "shader_get_info_log",

        glslang_shader_t.p("shader")
    )

    charUTF8.const.p(
        "shader_get_info_debug_log",

        glslang_shader_t.p("shader")
    )

    glslang_program_t.p(
        "program_create",

        void()
    )

    void(
        "program_delete",

        glslang_program_t.p("program")
    )

    void(
        "program_add_shader",

        glslang_program_t.p("program"),
        glslang_shader_t.p("shader")
    )

    intb(
        "program_link",

        glslang_program_t.p("program"),
        int("messages")
    )

    void(
        "program_add_source_text",

        glslang_program_t.p("program"),
        glslang_stage_t("stage"),
        charUTF8.const.p("text"),
        AutoSize("text")..size_t("len")
    )

    void(
        "program_set_source_file",

        glslang_program_t.p("program"),
        glslang_stage_t("stage"),
        charUTF8.const.p("file")
    )

    intb(
        "program_map_io",

        glslang_program_t.p("program")
    )

    intb(
        "program_map_io_with_resolver_and_mapper",

        glslang_program_t.p("program"),
        glslang_resolver_t.p("resolver"),
        glslang_mapper_t.p("mapper")
    )

    void(
        "program_SPIRV_generate",

        glslang_program_t.p("program"),
        glslang_stage_t("stage")
    )

    void(
        "program_SPIRV_generate_with_options",

        glslang_program_t.p("program"),
        glslang_stage_t("stage"),
        glslang_spv_options_t.p("spv_options")
    )

    size_t(
        "program_SPIRV_get_size",

        glslang_program_t.p("program")
    )

    void(
        "program_SPIRV_get",

        glslang_program_t.p("program"),
        Check("glslang_program_SPIRV_get_size(program)", debug = true)..unsigned_int.p("out")
    )

    MapPointer("glslang_program_SPIRV_get_size(program)")..unsigned_int.p(
        "program_SPIRV_get_ptr",

        glslang_program_t.p("program")
    )

    charUTF8.const.p(
        "program_SPIRV_get_messages",

        glslang_program_t.p("program")
    )

    charUTF8.const.p(
        "program_get_info_log",

        glslang_program_t.p("program")
    )

    charUTF8.const.p(
        "program_get_info_debug_log",

        glslang_program_t.p("program")
    )

    glslang_mapper_t.p(
        "glsl_mapper_create",

        void()
    )

    void(
        "glsl_mapper_delete",

        glslang_mapper_t.p("mapper")
    )

    glslang_resolver_t.p(
        "glsl_resolver_create",

        glslang_program_t.p("program"),
        glslang_stage_t("stage")
    )

    void(
        "glsl_resolver_delete",

        glslang_resolver_t.p("resolver")
    )
}