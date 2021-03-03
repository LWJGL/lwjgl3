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
    documentation = "An include result."

    charUTF8.const.p(
        "source_name",
        """
        the name of the source file.

        The name should be fully resolved in the sense that it should be a unique name in the context of the includer. For example, if the includer maps source
        names to files in a filesystem, then this name should be the absolute path of the file. For a failed inclusion, this string is empty.
        """
    )
    AutoSize("source_name")..size_t("source_name_length", "")
    charUTF8.const.p("content", "the text contents of the source file in the normal case. For a failed inclusion, this contains the error message.")
    AutoSize("content")..size_t("content_length", "")
    nullable..opaque_p("user_data", "user data to be passed along with this request")
}

val shaderc_include_resolve_fn = Module.SHADERC.callback {
    shaderc_include_result.p(
        "ShadercIncludeResolve",
        """
        An includer callback type for mapping an \#include request to an include result.

        The {@code user_data} parameter specifies the client context. The {@code requested_source} parameter specifies the name of the source being requested.
        The {@code type} parameter specifies the kind of inclusion request being made. The {@code requesting_source} parameter specifies the name of the source
        containing the \#include request. The includer owns the result object and its contents, and both must remain valid until the release callback is called
        on the result object.
        """,

        nullable..opaque_p("user_data", ""),
        charUTF8.const.p("requested_source", ""),
        int("type", ""),
        charUTF8.const.p("requesting_source", ""),
        size_t("include_depth", ""),

        nativeType = "shaderc_include_resolve_fn"
    ) {
        documentation = "Instances of this interface may be passed to the #compile_options_set_include_callbacks() function."
    }
}

val shaderc_include_result_release_fn = Module.SHADERC.callback {
    void(
        "ShadercIncludeResultRelease",
        "An includer callback type for destroying an include result.",

        opaque_p("user_data", ""),
        shaderc_include_result.p("include_result", ""),

        nativeType = "shaderc_include_result_release_fn"
    ) {
        documentation = "Instances of this interface may be passed to the #compile_options_set_include_callbacks() function."
    }
}