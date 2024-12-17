/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc

import org.lwjgl.generator.*

val shaderc_compilation_result_t = "shaderc_compilation_result_t".handle
val shaderc_compile_options_t = "shaderc_compile_options_t".handle
val shaderc_compiler_t = "shaderc_compiler_t".handle

val shaderc_compilation_status = "shaderc_compilation_status".enumType
val shaderc_env_version = "shaderc_env_version".enumType
val shaderc_include_type = "enum shaderc_include_type".enumType
val shaderc_limit = "shaderc_limit".enumType
val shaderc_optimization_level = "shaderc_optimization_level".enumType
val shaderc_profile = "shaderc_profile".enumType
val shaderc_shader_kind = "shaderc_shader_kind".enumType
val shaderc_source_language = "shaderc_source_language".enumType
val shaderc_spirv_version = "shaderc_spirv_version".enumType
val shaderc_target_env = "shaderc_target_env".enumType
val shaderc_uniform_kind = "shaderc_uniform_kind".enumType

val shaderc_include_result = struct(Module.SHADERC, "ShadercIncludeResult", nativeName = "shaderc_include_result") {
    charUTF8.const.p("source_name")
    AutoSize("source_name")..size_t("source_name_length")
    charUTF8.const.p("content")
    AutoSize("content")..size_t("content_length")
    nullable..opaque_p("user_data")
}

val shaderc_include_resolve_fn = Module.SHADERC.callback {
    shaderc_include_result.p(
        "ShadercIncludeResolve",

        nullable..opaque_p("user_data"),
        charUTF8.const.p("requested_source"),
        int("type"),
        charUTF8.const.p("requesting_source"),
        size_t("include_depth"),

        nativeType = "shaderc_include_resolve_fn"
    ) {
    }
}

val shaderc_include_result_release_fn = Module.SHADERC.callback {
    void(
        "ShadercIncludeResultRelease",

        opaque_p("user_data"),
        shaderc_include_result.p("include_result"),

        nativeType = "shaderc_include_result_release_fn"
    ) {
    }
}