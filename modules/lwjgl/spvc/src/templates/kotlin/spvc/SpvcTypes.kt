/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package spvc

import org.lwjgl.generator.*

val SpvId = typedef(unsigned_int, "SpvId")

/* spirv.h */
val SpvAccessQualifier = "SpvAccessQualifier".enumType
val SpvBuiltIn = "SpvBuiltIn".enumType
val SpvCapability = "SpvCapability".enumType
val SpvDecoration = "SpvDecoration".enumType
val SpvDim = "SpvDim".enumType
val SpvExecutionMode = "SpvExecutionMode".enumType
val SpvExecutionModel = "SpvExecutionModel".enumType
val SpvImageFormat = "SpvImageFormat".enumType
val SpvStorageClass = "SpvStorageClass".enumType

/* spirv_cross_c.h */
val spvc_compiler = "spvc_compiler".handle
val spvc_compiler_options = "spvc_compiler_options".handle
val spvc_constant = "spvc_constant".handle
val spvc_context = "spvc_context".handle
val spvc_parsed_ir = "spvc_parsed_ir".handle
val spvc_resources = "spvc_resources".handle
val spvc_set = "spvc_set".handle
val spvc_type = "spvc_type".handle

val spvc_bool = typedef(PrimitiveType("unsigned char", PrimitiveMapping.BOOLEAN), "spvc_bool")
val spvc_constant_id = typedef(SpvId, "spvc_constant_id")
val spvc_type_id = typedef(SpvId, "spvc_type_id")
val spvc_variable_id = typedef(SpvId, "spvc_variable_id")

val spvc_backend = "spvc_backend".enumType
val spvc_basetype = "spvc_basetype".enumType
val spvc_builtin_resource_type = "spvc_builtin_resource_type".enumType
val spvc_capture_mode = "spvc_capture_mode".enumType
val spvc_compiler_option = "spvc_compiler_option".enumType
val spvc_hlsl_binding_flags = "spvc_hlsl_binding_flags".enumType
val spvc_msl_chroma_location = "spvc_msl_chroma_location".enumType
val spvc_msl_component_swizzle = "spvc_msl_component_swizzle".enumType
val spvc_msl_format_resolution = "spvc_msl_format_resolution".enumType
val spvc_msl_sampler_address = "spvc_msl_sampler_address".enumType
val spvc_msl_sampler_border_color = "spvc_msl_sampler_border_color".enumType
val spvc_msl_sampler_compare_func = "spvc_msl_sampler_compare_func".enumType
val spvc_msl_sampler_coord = "spvc_msl_sampler_coord".enumType
val spvc_msl_sampler_filter = "spvc_msl_sampler_filter".enumType
val spvc_msl_sampler_mip_filter = "spvc_msl_sampler_mip_filter".enumType
val spvc_msl_sampler_ycbcr_model_conversion = "spvc_msl_sampler_ycbcr_model_conversion".enumType
val spvc_msl_sampler_ycbcr_range = "spvc_msl_sampler_ycbcr_range".enumType
val spvc_msl_shader_variable_format = "spvc_msl_shader_variable_format".enumType
val spvc_msl_shader_variable_rate = "spvc_msl_shader_variable_rate".enumType
val spvc_msl_vertex_format = "spvc_msl_vertex_format".enumType
val spvc_resource_type = "spvc_resource_type".enumType
val spvc_result = "spvc_result".enumType

val spvc_reflected_resource = struct(Module.SPVC, "SpvcReflectedResource", nativeName = "spvc_reflected_resource") {
    spvc_variable_id("id")
    spvc_type_id("base_type_id")
    spvc_type_id("type_id")
    charUTF8.const.p("name")
}

val spvc_reflected_builtin_resource = struct(Module.SPVC, "SpvcReflectedBuiltinResource", nativeName = "spvc_reflected_builtin_resource") {
    SpvBuiltIn("builtin")
    spvc_type_id("value_type_id")
    spvc_reflected_resource("resource")
}


val spvc_entry_point = struct(Module.SPVC, "SpvcEntryPoint", nativeName = "spvc_entry_point") {
    SpvExecutionModel("execution_model")
    charUTF8.const.p("name")
}

val spvc_combined_image_sampler = struct(Module.SPVC, "SpvcCombinedImageSampler", nativeName = "spvc_combined_image_sampler") {
    spvc_variable_id("combined_id")
    spvc_variable_id("image_id")
    spvc_variable_id("sampler_id")
}

val spvc_specialization_constant = struct(Module.SPVC, "SpvcSpecializationConstant", nativeName = "spvc_specialization_constant") {
    spvc_constant_id("id")
    unsigned_int("constant_id")
}

val spvc_buffer_range = struct(Module.SPVC, "SpvcBufferRange", nativeName = "spvc_buffer_range") {
    unsigned_int("index")
    size_t("offset")
    size_t("range")
}

val spvc_hlsl_root_constants = struct(Module.SPVC, "SpvcHlslRootConstants", nativeName = "spvc_hlsl_root_constants") {
    unsigned_int("start")
    unsigned_int("end")
    unsigned_int("binding")
    unsigned_int("space")
}

val spvc_hlsl_vertex_attribute_remap = struct(Module.SPVC, "SpvcHlslVertexAttributeRemap", nativeName = "spvc_hlsl_vertex_attribute_remap") {
    unsigned_int("location")
    charUTF8.const.p("semantic")
}

val spvc_msl_vertex_attribute = struct(Module.SPVC, "SpvcMslVertexAttribute", nativeName = "spvc_msl_vertex_attribute") {
    unsigned_int("location")
    unsigned_int("msl_buffer")
    unsigned_int("msl_offset")
    unsigned_int("msl_stride")
    spvc_bool("per_instance")
    spvc_msl_vertex_format("format")
    SpvBuiltIn("builtin")
}

val spvc_msl_shader_interface_var = struct(Module.SPVC, "SpvcMslShaderInterfaceVar", nativeName = "spvc_msl_shader_interface_var") {
	unsigned("location")
	spvc_msl_vertex_format("format")
	SpvBuiltIn("builtin")
	unsigned("vecsize")
}
val spvc_msl_shader_input = typedef(spvc_msl_shader_interface_var, "spvc_msl_shader_input", "SpvcMslShaderInput")

val spvc_msl_shader_interface_var_2 = struct(Module.SPVC, "SpvcMslShaderInterfaceVar2", nativeName = "spvc_msl_shader_interface_var_2") {
    unsigned("location")
    spvc_msl_shader_variable_format("format")
    SpvBuiltIn("builtin")
    unsigned("vecsize")
    spvc_msl_shader_variable_rate("rate")
}

val spvc_msl_resource_binding = struct(Module.SPVC, "SpvcMslResourceBinding", nativeName = "spvc_msl_resource_binding") {
    SpvExecutionModel("stage")
    unsigned_int("desc_set")
    unsigned_int("binding")
    unsigned_int("msl_buffer")
    unsigned_int("msl_texture")
    unsigned_int("msl_sampler")
}

val spvc_msl_resource_binding_2 = struct(Module.SPVC, "SpvcMslResourceBinding2", nativeName = "spvc_msl_resource_binding_2") {
    SpvExecutionModel("stage")
    unsigned_int("desc_set")
    unsigned_int("binding")
    unsigned_int("count")
    unsigned_int("msl_buffer")
    unsigned_int("msl_texture")
    unsigned_int("msl_sampler")
}

val spvc_msl_constexpr_sampler = struct(Module.SPVC, "SpvcMslConstexprSampler", nativeName = "spvc_msl_constexpr_sampler") {
    spvc_msl_sampler_coord("coord")
    spvc_msl_sampler_filter("min_filter")
    spvc_msl_sampler_filter("mag_filter")
    spvc_msl_sampler_mip_filter("mip_filter")
    spvc_msl_sampler_address("s_address")
    spvc_msl_sampler_address("t_address")
    spvc_msl_sampler_address("r_address")
    spvc_msl_sampler_compare_func("compare_func")
    spvc_msl_sampler_border_color("border_color")
    float("lod_clamp_min")
    float("lod_clamp_max")
    int("max_anisotropy")
    spvc_bool("compare_enable")
    spvc_bool("lod_clamp_enable")
    spvc_bool("anisotropy_enable")
}

val spvc_msl_sampler_ycbcr_conversion = struct(Module.SPVC, "SpvcMslSamplerYcbcrConversion", nativeName = "spvc_msl_sampler_ycbcr_conversion") {
    unsigned_int("planes")
    spvc_msl_format_resolution("resolution")
    spvc_msl_sampler_filter("chroma_filter")
    spvc_msl_chroma_location("x_chroma_offset")
    spvc_msl_chroma_location("y_chroma_offset")
    spvc_msl_component_swizzle("swizzle")[4]
    spvc_msl_sampler_ycbcr_model_conversion("ycbcr_model")
    spvc_msl_sampler_ycbcr_range("ycbcr_range")
    unsigned_int("bpc")
}

val spvc_hlsl_resource_binding_mapping = struct(Module.SPVC, "SpvcHLSLResourceBindingMapping", nativeName = "spvc_hlsl_resource_binding_mapping") {
    unsigned("register_space")
    unsigned("register_binding")
}

val spvc_hlsl_resource_binding = struct(Module.SPVC, "SpvcHLSLResourceBinding", nativeName = "spvc_hlsl_resource_binding") {
    SpvExecutionModel("stage")
    unsigned("desc_set")
    unsigned("binding")

    spvc_hlsl_resource_binding_mapping("cbv")
    spvc_hlsl_resource_binding_mapping("uav")
    spvc_hlsl_resource_binding_mapping("srv")
    spvc_hlsl_resource_binding_mapping("sampler")
}

val spvc_error_callback = Module.SPVC.callback {
    void(
        "SpvcErrorCallback",

        opaque_p("userdata"),
        charUTF8.const.p("error"),

        nativeType = "spvc_error_callback"
    ) {
        additionalCode = """
    /**
     * Converts the specified {@code spvc_error_callback} argument to a String.
     *
     * <p>This method may only be used inside a {@code SpvcErrorCallback} invocation.</p>
     *
     * @param error the error argument to decode
     *
     * @return the error message as a String
     */
    public static String getError(long error) {
        return memUTF8(error);
    }
    """
    }
}
