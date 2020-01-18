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
    opaque_p("user_data", "user data to be passed along with this request")
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

        opaque_p("user_data", ""),
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

// libshaderc_spvc

val shaderc_spvc_context_t = "shaderc_spvc_context_t".handle

val shaderc_spvc_binding_type = "shaderc_spvc_binding_type".enumType
val shaderc_spvc_decoration = "shaderc_spvc_decoration".enumType
val shaderc_spvc_execution_model = "shaderc_spvc_execution_model".enumType
val shaderc_spvc_shader_resource = "shaderc_spvc_shader_resource".enumType
val shaderc_spvc_status = "shaderc_spvc_status".enumType
val shaderc_spvc_texture_format_type = "shaderc_spvc_texture_format_type".enumType
val shaderc_spvc_texture_view_dimension = "shaderc_spvc_texture_view_dimension".enumType

val shaderc_spvc_msl_platform = "shaderc_spvc_msl_platform".enumType
val shaderc_spvc_compilation_result_t = "shaderc_spvc_compilation_result_t".handle
val shaderc_spvc_compile_options_t = "shaderc_spvc_compile_options_t".handle

val shaderc_spvc_combined_image_sampler = struct(Module.SHADERC, "ShadercSPVCCombinedImageSampler", nativeName = "shaderc_spvc_combined_image_sampler", mutable = false) {
    uint32_t("combined_id", "")
    uint32_t("image_id", "")
    uint32_t("sampler_id", "")
}

val shaderc_spvc_msl_resource_binding = struct(Module.SHADERC, "ShadercSPVCMSLResourceBinding", nativeName = "shaderc_spvc_msl_resource_binding") {
    shaderc_spvc_execution_model("stage", "")
    uint32_t("desc_set", "")
    uint32_t("binding", "")
    uint32_t("msl_buffer", "")
    uint32_t("msl_texture", "")
    uint32_t("msl_sampler", "")
}

val shaderc_spvc_workgroup_size = struct(Module.SHADERC, "ShadercSPVCWorkgroupSize", nativeName = "shaderc_spvc_workgroup_size", mutable = false) {
    uint32_t("x", "")
    uint32_t("y", "")
    uint32_t("z", "")
    uint32_t("constant", "")
}

val shaderc_spvc_binding_info = struct(Module.SHADERC, "ShadercSPVCBindingInfo", nativeName = "shaderc_spvc_binding_info", mutable = false) {
    uint32_t("set", "")
    uint32_t("binding", "")
    uint32_t("id", "")
    uint32_t("base_type_id", "")
    shaderc_spvc_binding_type("binding_type", "")
    shaderc_spvc_texture_view_dimension("texture_dimension", "")
    shaderc_spvc_texture_format_type("texture_component_type", "")
    bool("multisampled", "")
}

val shaderc_spvc_resource_location_info = struct(Module.SHADERC, "ShadercSPVCResourceLocationInfo", nativeName = "shaderc_spvc_resource_location_info", mutable = false) {
    uint32_t("id", "")
    bool("has_location", "")
    uint32_t("location", "")
}

val shaderc_spvc_resource_type_info = struct(Module.SHADERC, "ShadercSPVCResourceTypeInfo", nativeName = "shaderc_spvc_resource_type_info", mutable = false) {
    uint32_t("location", "")
    shaderc_spvc_texture_format_type("type", "")
}