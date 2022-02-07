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

val spvc_bool = typedef(IntegerType("unsigned char", PrimitiveMapping.BOOLEAN, unsigned = true), "spvc_bool")
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
val spvc_msl_vertex_format = "spvc_msl_vertex_format".enumType
val spvc_resource_type = "spvc_resource_type".enumType
val spvc_result = "spvc_result".enumType

val spvc_reflected_resource = struct(Module.SPVC, "SpvcReflectedResource", nativeName = "spvc_reflected_resource") {
    spvc_variable_id("id", "Resources are identified with their SPIR-V ID. This is the ID of the OpVariable.")
    spvc_type_id(
        "base_type_id",
        """
        The base type of the declared resource.

        This type is the base type which ignores pointers and arrays of the {@code type_id}. This is mostly useful to parse decorations of the underlying
        type. {@code base_type_id} can also be obtained with {@code get_type(get_type(type_id).self)}.
        """
    )
    spvc_type_id(
        "type_id",
        """
        The type ID of the variable which includes arrays and all type modifications.
        
        This type ID is not suitable for parsing {@code OpMemberDecoration} of a struct and other decorations in general since these modifications typically
        happen on the {@code base_type_id}.
        """
    )
    charUTF8.const.p(
        "name",
        """
        The declared name ({@code OpName}) of the resource.
	
        For Buffer blocks, the name actually reflects the externally visible {@code Block} name. This name can be retrieved again by using either
        {@code get_name(id)} or {@code get_name(base_type_id)} depending if it's a buffer block or not. This name can be an empty string in which case
        {@code get_fallback_name(id)} can be used which obtains a suitable fallback identifier for an ID.
        """
    )
}

val spvc_reflected_builtin_resource = struct(Module.SPVC, "SpvcReflectedBuiltinResource", nativeName = "spvc_reflected_builtin_resource") {
    SpvBuiltIn(
        "builtin",
        """
        This is mostly here to support reflection of builtins such as {@code Position/PointSize/CullDistance/ClipDistance}.
        
	    This needs to be different from {@code Resource} since we can collect builtins from blocks. A builtin present here does not necessarily mean it's
        considered an active builtin, since variable ID "activeness" is only tracked on {@code OpVariable} level, not {@code Block} members. For that,
        #compiler_update_active_builtins() -&gt; #compiler_has_active_builtin() can be used to further refine the reflection.
        """
    )
    spvc_type_id(
        "value_type_id",
        """
        This is the actual value type of the builtin.
        
        Typically {@code float4}, {@code float}, {@code array<float, N>} for the {@code gl_PerVertex} builtins. If the builtin is a control point, the control
        point array type will be stripped away here as appropriate.
        """
    )
    spvc_reflected_resource(
        "resource",
        """
        This refers to the base resource which contains the builtin.
        
        If resource is a {@code Block}, it can hold multiple builtins, or it might not be a block. For advanced reflection scenarios, all information in
        builtin/{@code value_type_id} can be deduced, it's just more convenient this way.
        """
    )
}


val spvc_entry_point = struct(Module.SPVC, "SpvcEntryPoint", nativeName = "spvc_entry_point") {
    SpvExecutionModel("execution_model", "")
    charUTF8.const.p("name", "")
}

val spvc_combined_image_sampler = struct(Module.SPVC, "SpvcCombinedImageSampler", nativeName = "spvc_combined_image_sampler") {
    spvc_variable_id("combined_id", "the ID of the {@code sampler2D} variable")
    spvc_variable_id("image_id", "the ID of the {@code texture2D} variable")
    spvc_variable_id("sampler_id", "the ID of the {@code sampler} variable")
}

val spvc_specialization_constant = struct(Module.SPVC, "SpvcSpecializationConstant", nativeName = "spvc_specialization_constant") {
    spvc_constant_id("id", "the ID of the specialization constant")
    unsigned_int("constant_id", "the constant ID of the constant, used in Vulkan during pipeline creation")
}

val spvc_buffer_range = struct(Module.SPVC, "SpvcBufferRange", nativeName = "spvc_buffer_range") {
    unsigned_int("index", "")
    size_t("offset", "")
    size_t("range", "")
}

val spvc_hlsl_root_constants = struct(Module.SPVC, "SpvcHlslRootConstants", nativeName = "spvc_hlsl_root_constants") {
    documentation =
        """
        Specifying a root constant (d3d12) or push constant range (vulkan).

        {@code start} and {@code end} denotes the range of the root constant in bytes. Both values need to be multiple of 4.
        """

    unsigned_int("start", "")
    unsigned_int("end", "")
    unsigned_int("binding", "")
    unsigned_int("space", "")
}

val spvc_hlsl_vertex_attribute_remap = struct(Module.SPVC, "SpvcHlslVertexAttributeRemap", nativeName = "spvc_hlsl_vertex_attribute_remap") {
    documentation = "Interface which remaps vertex inputs to a fixed semantic name to make linking easier."

    unsigned_int("location", "")
    charUTF8.const.p("semantic", "")
}

val spvc_msl_vertex_attribute = struct(Module.SPVC, "SpvcMslVertexAttribute", nativeName = "spvc_msl_vertex_attribute") {
    documentation =
        """
        Defines MSL characteristics of a vertex attribute at a particular location.

        After compilation, it is possible to query whether or not this location was used.
        """

    unsigned_int("location", "")
    unsigned_int("msl_buffer", "Obsolete, do not use. Only lingers on for ABI compatibility.")
    unsigned_int("msl_offset", "Obsolete, do not use. Only lingers on for ABI compatibility.")
    unsigned_int("msl_stride", "Obsolete, do not use. Only lingers on for ABI compatibility.")
    spvc_bool("per_instance", "Obsolete, do not use. Only lingers on for ABI compatibility.")
    spvc_msl_vertex_format("format", "")
    SpvBuiltIn("builtin", "")
}

val spvc_msl_shader_input = struct(Module.SPVC, "SpvcMslShaderInput", nativeName = "spvc_msl_shader_input") {
    documentation =
        """
        Defines MSL characteristics of an input variable at a particular location.

        After compilation, it is possible to query whether or not this location was used. If {@code vecsize} is nonzero, it must be greater than or equal to
        the {@code vecsize} declared in the shader, or behavior is undefined.
        """

	unsigned("location", "")
	spvc_msl_vertex_format("format", "")
	SpvBuiltIn("builtin", "")
	unsigned("vecsize", "")
}

val spvc_msl_resource_binding = struct(Module.SPVC, "SpvcMslResourceBinding", nativeName = "spvc_msl_resource_binding") {
    documentation =
        """
        Matches the binding index of a MSL resource for a binding within a descriptor set.

        Taken together, the {@code stage}, {@code desc_set} and {@code binding} combine to form a reference to a resource descriptor used in a particular
        shading stage. If using MSL 2.0 argument buffers, the descriptor set is not marked as a discrete descriptor set, and (for iOS only) the resource is not
        a storage image ({@code sampled != 2}), the binding reference we remap to will become an {@code [[id(N)]]} attribute within the "descriptor set"
        argument buffer structure. For resources which are bound in the "classic" MSL 1.0 way or discrete descriptors, the remap will become a
        {@code [[buffer(N)]]}, {@code [[texture(N)]]} or {@code [[sampler(N)]]} depending on the resource types used.
        """

    SpvExecutionModel("stage", "")
    unsigned_int("desc_set", "")
    unsigned_int("binding", "")
    unsigned_int("msl_buffer", "")
    unsigned_int("msl_texture", "")
    unsigned_int("msl_sampler", "")
}

val spvc_msl_constexpr_sampler = struct(Module.SPVC, "SpvcMslConstexprSampler", nativeName = "spvc_msl_constexpr_sampler") {
    spvc_msl_sampler_coord("coord", "")
    spvc_msl_sampler_filter("min_filter", "")
    spvc_msl_sampler_filter("mag_filter", "")
    spvc_msl_sampler_mip_filter("mip_filter", "")
    spvc_msl_sampler_address("s_address", "")
    spvc_msl_sampler_address("t_address", "")
    spvc_msl_sampler_address("r_address", "")
    spvc_msl_sampler_compare_func("compare_func", "")
    spvc_msl_sampler_border_color("border_color", "")
    float("lod_clamp_min", "")
    float("lod_clamp_max", "")
    int("max_anisotropy", "")
    spvc_bool("compare_enable", "")
    spvc_bool("lod_clamp_enable", "")
    spvc_bool("anisotropy_enable", "")
}

val spvc_msl_sampler_ycbcr_conversion = struct(Module.SPVC, "SpvcMslSamplerYcbcrConversion", nativeName = "spvc_msl_sampler_ycbcr_conversion") {
    documentation = "Maps to the sampler Y'CbCr conversion-related portions of {@code MSLConstexprSampler}."

    unsigned_int("planes", "")
    spvc_msl_format_resolution("resolution", "")
    spvc_msl_sampler_filter("chroma_filter", "")
    spvc_msl_chroma_location("x_chroma_offset", "")
    spvc_msl_chroma_location("y_chroma_offset", "")
    spvc_msl_component_swizzle("swizzle", "")[4]
    spvc_msl_sampler_ycbcr_model_conversion("ycbcr_model", "")
    spvc_msl_sampler_ycbcr_range("ycbcr_range", "")
    unsigned_int("bpc", "")
}

val spvc_hlsl_resource_binding_mapping = struct(Module.SPVC, "SpvcHLSLResourceBindingMapping", nativeName = "spvc_hlsl_resource_binding_mapping") {
    unsigned("register_space", "")
    unsigned("register_binding", "")
}

val spvc_hlsl_resource_binding = struct(Module.SPVC, "SpvcHLSLResourceBinding", nativeName = "spvc_hlsl_resource_binding") {
    SpvExecutionModel("stage", "")
    unsigned("desc_set", "")
    unsigned("binding", "")

    spvc_hlsl_resource_binding_mapping("cbv", "")
    spvc_hlsl_resource_binding_mapping("uav", "")
    spvc_hlsl_resource_binding_mapping("srv", "")
    spvc_hlsl_resource_binding_mapping("sampler", "")
}

val spvc_error_callback = Module.SPVC.callback {
    void(
        "SpvcErrorCallback",
        "Get notified in a callback when an error triggers. Useful for debugging.",

        opaque_p("userdata", ""),
        charUTF8.const.p("error", ""),

        nativeType = "spvc_error_callback"
    ) {
        documentation = "Instances of this interface may be passed to the #context_set_error_callback() method."
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
