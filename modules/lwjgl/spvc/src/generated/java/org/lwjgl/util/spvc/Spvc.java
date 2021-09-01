/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the C API of <a target="_blank" href="https://github.com/KhronosGroup/SPIRV-Cross">SPIRV-Cross</a>.
 * 
 * <p>SPIRV-Cross is a tool designed for parsing and converting SPIR-V to other shader languages.</p>
 * 
 * <ul>
 * <li>Convert SPIR-V to readable, usable and efficient GLSL</li>
 * <li>Convert SPIR-V to readable, usable and efficient Metal Shading Language (MSL)</li>
 * <li>Convert SPIR-V to readable, usable and efficient HLSL</li>
 * <li>Convert SPIR-V to debuggable C++ [DEPRECATED]</li>
 * <li>Convert SPIR-V to a JSON reflection format [EXPERIMENTAL]</li>
 * <li>Reflection API to simplify the creation of Vulkan pipeline layouts</li>
 * <li>Reflection API to modify and tweak OpDecorations</li>
 * <li>Supports "all" of vertex, fragment, tessellation, geometry and compute shaders.</li>
 * </ul>
 * 
 * <p>SPIRV-Cross tries hard to emit readable and clean output from the SPIR-V. The goal is to emit GLSL or MSL that looks like it was written by a human and
 * not awkward IR/assembly-like code.</p>
 */
public class Spvc {

    private static final SharedLibrary SPVC = Library.loadNative(Spvc.class, "org.lwjgl.spvc", Configuration.SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("spirv-cross")), true);

    /** Contains the function pointers loaded from the spvc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            get_version                                           = apiGetFunctionAddress(SPVC, "spvc_get_version"),
            get_commit_revision_and_timestamp                     = apiGetFunctionAddress(SPVC, "spvc_get_commit_revision_and_timestamp"),
            msl_vertex_attribute_init                             = apiGetFunctionAddress(SPVC, "spvc_msl_vertex_attribute_init"),
            msl_shader_input_init                                 = apiGetFunctionAddress(SPVC, "spvc_msl_shader_input_init"),
            msl_resource_binding_init                             = apiGetFunctionAddress(SPVC, "spvc_msl_resource_binding_init"),
            msl_get_aux_buffer_struct_version                     = apiGetFunctionAddress(SPVC, "spvc_msl_get_aux_buffer_struct_version"),
            msl_constexpr_sampler_init                            = apiGetFunctionAddress(SPVC, "spvc_msl_constexpr_sampler_init"),
            msl_sampler_ycbcr_conversion_init                     = apiGetFunctionAddress(SPVC, "spvc_msl_sampler_ycbcr_conversion_init"),
            hlsl_resource_binding_init                            = apiGetFunctionAddress(SPVC, "spvc_hlsl_resource_binding_init"),
            context_create                                        = apiGetFunctionAddress(SPVC, "spvc_context_create"),
            context_destroy                                       = apiGetFunctionAddress(SPVC, "spvc_context_destroy"),
            context_release_allocations                           = apiGetFunctionAddress(SPVC, "spvc_context_release_allocations"),
            context_get_last_error_string                         = apiGetFunctionAddress(SPVC, "spvc_context_get_last_error_string"),
            context_set_error_callback                            = apiGetFunctionAddress(SPVC, "spvc_context_set_error_callback"),
            context_parse_spirv                                   = apiGetFunctionAddress(SPVC, "spvc_context_parse_spirv"),
            context_create_compiler                               = apiGetFunctionAddress(SPVC, "spvc_context_create_compiler"),
            compiler_get_current_id_bound                         = apiGetFunctionAddress(SPVC, "spvc_compiler_get_current_id_bound"),
            compiler_create_compiler_options                      = apiGetFunctionAddress(SPVC, "spvc_compiler_create_compiler_options"),
            compiler_options_set_bool                             = apiGetFunctionAddress(SPVC, "spvc_compiler_options_set_bool"),
            compiler_options_set_uint                             = apiGetFunctionAddress(SPVC, "spvc_compiler_options_set_uint"),
            compiler_install_compiler_options                     = apiGetFunctionAddress(SPVC, "spvc_compiler_install_compiler_options"),
            compiler_compile                                      = apiGetFunctionAddress(SPVC, "spvc_compiler_compile"),
            compiler_add_header_line                              = apiGetFunctionAddress(SPVC, "spvc_compiler_add_header_line"),
            compiler_require_extension                            = apiGetFunctionAddress(SPVC, "spvc_compiler_require_extension"),
            compiler_flatten_buffer_block                         = apiGetFunctionAddress(SPVC, "spvc_compiler_flatten_buffer_block"),
            compiler_variable_is_depth_or_compare                 = apiGetFunctionAddress(SPVC, "spvc_compiler_variable_is_depth_or_compare"),
            compiler_mask_stage_output_by_location                = apiGetFunctionAddress(SPVC, "spvc_compiler_mask_stage_output_by_location"),
            compiler_mask_stage_output_by_builtin                 = apiGetFunctionAddress(SPVC, "spvc_compiler_mask_stage_output_by_builtin"),
            compiler_hlsl_set_root_constants_layout               = apiGetFunctionAddress(SPVC, "spvc_compiler_hlsl_set_root_constants_layout"),
            compiler_hlsl_add_vertex_attribute_remap              = apiGetFunctionAddress(SPVC, "spvc_compiler_hlsl_add_vertex_attribute_remap"),
            compiler_hlsl_remap_num_workgroups_builtin            = apiGetFunctionAddress(SPVC, "spvc_compiler_hlsl_remap_num_workgroups_builtin"),
            compiler_hlsl_set_resource_binding_flags              = apiGetFunctionAddress(SPVC, "spvc_compiler_hlsl_set_resource_binding_flags"),
            compiler_hlsl_add_resource_binding                    = apiGetFunctionAddress(SPVC, "spvc_compiler_hlsl_add_resource_binding"),
            compiler_hlsl_is_resource_used                        = apiGetFunctionAddress(SPVC, "spvc_compiler_hlsl_is_resource_used"),
            compiler_msl_is_rasterization_disabled                = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_rasterization_disabled"),
            compiler_msl_needs_swizzle_buffer                     = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_needs_swizzle_buffer"),
            compiler_msl_needs_buffer_size_buffer                 = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_needs_buffer_size_buffer"),
            compiler_msl_needs_output_buffer                      = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_needs_output_buffer"),
            compiler_msl_needs_patch_output_buffer                = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_needs_patch_output_buffer"),
            compiler_msl_needs_input_threadgroup_mem              = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_needs_input_threadgroup_mem"),
            compiler_msl_add_vertex_attribute                     = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_vertex_attribute"),
            compiler_msl_add_resource_binding                     = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_resource_binding"),
            compiler_msl_add_shader_input                         = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_shader_input"),
            compiler_msl_add_discrete_descriptor_set              = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_discrete_descriptor_set"),
            compiler_msl_set_argument_buffer_device_address_space = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_set_argument_buffer_device_address_space"),
            compiler_msl_is_vertex_attribute_used                 = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_vertex_attribute_used"),
            compiler_msl_is_shader_input_used                     = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_shader_input_used"),
            compiler_msl_is_resource_used                         = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_resource_used"),
            compiler_msl_remap_constexpr_sampler                  = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_remap_constexpr_sampler"),
            compiler_msl_remap_constexpr_sampler_by_binding       = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_remap_constexpr_sampler_by_binding"),
            compiler_msl_remap_constexpr_sampler_ycbcr            = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_remap_constexpr_sampler_ycbcr"),
            compiler_msl_remap_constexpr_sampler_by_binding_ycbcr = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr"),
            compiler_msl_set_fragment_output_components           = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_set_fragment_output_components"),
            compiler_msl_get_automatic_resource_binding           = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_get_automatic_resource_binding"),
            compiler_msl_get_automatic_resource_binding_secondary = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_get_automatic_resource_binding_secondary"),
            compiler_msl_add_dynamic_buffer                       = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_dynamic_buffer"),
            compiler_msl_add_inline_uniform_block                 = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_inline_uniform_block"),
            compiler_msl_set_combined_sampler_suffix              = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_set_combined_sampler_suffix"),
            compiler_msl_get_combined_sampler_suffix              = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_get_combined_sampler_suffix"),
            compiler_get_active_interface_variables               = apiGetFunctionAddress(SPVC, "spvc_compiler_get_active_interface_variables"),
            compiler_set_enabled_interface_variables              = apiGetFunctionAddress(SPVC, "spvc_compiler_set_enabled_interface_variables"),
            compiler_create_shader_resources                      = apiGetFunctionAddress(SPVC, "spvc_compiler_create_shader_resources"),
            compiler_create_shader_resources_for_active_variables = apiGetFunctionAddress(SPVC, "spvc_compiler_create_shader_resources_for_active_variables"),
            resources_get_resource_list_for_type                  = apiGetFunctionAddress(SPVC, "spvc_resources_get_resource_list_for_type"),
            resources_get_builtin_resource_list_for_type          = apiGetFunctionAddress(SPVC, "spvc_resources_get_builtin_resource_list_for_type"),
            compiler_set_decoration                               = apiGetFunctionAddress(SPVC, "spvc_compiler_set_decoration"),
            compiler_set_decoration_string                        = apiGetFunctionAddress(SPVC, "spvc_compiler_set_decoration_string"),
            compiler_set_name                                     = apiGetFunctionAddress(SPVC, "spvc_compiler_set_name"),
            compiler_set_member_decoration                        = apiGetFunctionAddress(SPVC, "spvc_compiler_set_member_decoration"),
            compiler_set_member_decoration_string                 = apiGetFunctionAddress(SPVC, "spvc_compiler_set_member_decoration_string"),
            compiler_set_member_name                              = apiGetFunctionAddress(SPVC, "spvc_compiler_set_member_name"),
            compiler_unset_decoration                             = apiGetFunctionAddress(SPVC, "spvc_compiler_unset_decoration"),
            compiler_unset_member_decoration                      = apiGetFunctionAddress(SPVC, "spvc_compiler_unset_member_decoration"),
            compiler_has_decoration                               = apiGetFunctionAddress(SPVC, "spvc_compiler_has_decoration"),
            compiler_has_member_decoration                        = apiGetFunctionAddress(SPVC, "spvc_compiler_has_member_decoration"),
            compiler_get_name                                     = apiGetFunctionAddress(SPVC, "spvc_compiler_get_name"),
            compiler_get_decoration                               = apiGetFunctionAddress(SPVC, "spvc_compiler_get_decoration"),
            compiler_get_decoration_string                        = apiGetFunctionAddress(SPVC, "spvc_compiler_get_decoration_string"),
            compiler_get_member_decoration                        = apiGetFunctionAddress(SPVC, "spvc_compiler_get_member_decoration"),
            compiler_get_member_decoration_string                 = apiGetFunctionAddress(SPVC, "spvc_compiler_get_member_decoration_string"),
            compiler_get_member_name                              = apiGetFunctionAddress(SPVC, "spvc_compiler_get_member_name"),
            compiler_get_entry_points                             = apiGetFunctionAddress(SPVC, "spvc_compiler_get_entry_points"),
            compiler_set_entry_point                              = apiGetFunctionAddress(SPVC, "spvc_compiler_set_entry_point"),
            compiler_rename_entry_point                           = apiGetFunctionAddress(SPVC, "spvc_compiler_rename_entry_point"),
            compiler_get_cleansed_entry_point_name                = apiGetFunctionAddress(SPVC, "spvc_compiler_get_cleansed_entry_point_name"),
            compiler_set_execution_mode                           = apiGetFunctionAddress(SPVC, "spvc_compiler_set_execution_mode"),
            compiler_unset_execution_mode                         = apiGetFunctionAddress(SPVC, "spvc_compiler_unset_execution_mode"),
            compiler_set_execution_mode_with_arguments            = apiGetFunctionAddress(SPVC, "spvc_compiler_set_execution_mode_with_arguments"),
            compiler_get_execution_modes                          = apiGetFunctionAddress(SPVC, "spvc_compiler_get_execution_modes"),
            compiler_get_execution_mode_argument                  = apiGetFunctionAddress(SPVC, "spvc_compiler_get_execution_mode_argument"),
            compiler_get_execution_mode_argument_by_index         = apiGetFunctionAddress(SPVC, "spvc_compiler_get_execution_mode_argument_by_index"),
            compiler_get_execution_model                          = apiGetFunctionAddress(SPVC, "spvc_compiler_get_execution_model"),
            compiler_update_active_builtins                       = apiGetFunctionAddress(SPVC, "spvc_compiler_update_active_builtins"),
            compiler_has_active_builtin                           = apiGetFunctionAddress(SPVC, "spvc_compiler_has_active_builtin"),
            compiler_get_type_handle                              = apiGetFunctionAddress(SPVC, "spvc_compiler_get_type_handle"),
            type_get_base_type_id                                 = apiGetFunctionAddress(SPVC, "spvc_type_get_base_type_id"),
            type_get_basetype                                     = apiGetFunctionAddress(SPVC, "spvc_type_get_basetype"),
            type_get_bit_width                                    = apiGetFunctionAddress(SPVC, "spvc_type_get_bit_width"),
            type_get_vector_size                                  = apiGetFunctionAddress(SPVC, "spvc_type_get_vector_size"),
            type_get_columns                                      = apiGetFunctionAddress(SPVC, "spvc_type_get_columns"),
            type_get_num_array_dimensions                         = apiGetFunctionAddress(SPVC, "spvc_type_get_num_array_dimensions"),
            type_array_dimension_is_literal                       = apiGetFunctionAddress(SPVC, "spvc_type_array_dimension_is_literal"),
            type_get_array_dimension                              = apiGetFunctionAddress(SPVC, "spvc_type_get_array_dimension"),
            type_get_num_member_types                             = apiGetFunctionAddress(SPVC, "spvc_type_get_num_member_types"),
            type_get_member_type                                  = apiGetFunctionAddress(SPVC, "spvc_type_get_member_type"),
            type_get_storage_class                                = apiGetFunctionAddress(SPVC, "spvc_type_get_storage_class"),
            type_get_image_sampled_type                           = apiGetFunctionAddress(SPVC, "spvc_type_get_image_sampled_type"),
            type_get_image_dimension                              = apiGetFunctionAddress(SPVC, "spvc_type_get_image_dimension"),
            type_get_image_is_depth                               = apiGetFunctionAddress(SPVC, "spvc_type_get_image_is_depth"),
            type_get_image_arrayed                                = apiGetFunctionAddress(SPVC, "spvc_type_get_image_arrayed"),
            type_get_image_multisampled                           = apiGetFunctionAddress(SPVC, "spvc_type_get_image_multisampled"),
            type_get_image_is_storage                             = apiGetFunctionAddress(SPVC, "spvc_type_get_image_is_storage"),
            type_get_image_storage_format                         = apiGetFunctionAddress(SPVC, "spvc_type_get_image_storage_format"),
            type_get_image_access_qualifier                       = apiGetFunctionAddress(SPVC, "spvc_type_get_image_access_qualifier"),
            compiler_get_declared_struct_size                     = apiGetFunctionAddress(SPVC, "spvc_compiler_get_declared_struct_size"),
            compiler_get_declared_struct_size_runtime_array       = apiGetFunctionAddress(SPVC, "spvc_compiler_get_declared_struct_size_runtime_array"),
            compiler_get_declared_struct_member_size              = apiGetFunctionAddress(SPVC, "spvc_compiler_get_declared_struct_member_size"),
            compiler_type_struct_member_offset                    = apiGetFunctionAddress(SPVC, "spvc_compiler_type_struct_member_offset"),
            compiler_type_struct_member_array_stride              = apiGetFunctionAddress(SPVC, "spvc_compiler_type_struct_member_array_stride"),
            compiler_type_struct_member_matrix_stride             = apiGetFunctionAddress(SPVC, "spvc_compiler_type_struct_member_matrix_stride"),
            compiler_build_dummy_sampler_for_combined_images      = apiGetFunctionAddress(SPVC, "spvc_compiler_build_dummy_sampler_for_combined_images"),
            compiler_build_combined_image_samplers                = apiGetFunctionAddress(SPVC, "spvc_compiler_build_combined_image_samplers"),
            compiler_get_combined_image_samplers                  = apiGetFunctionAddress(SPVC, "spvc_compiler_get_combined_image_samplers"),
            compiler_get_specialization_constants                 = apiGetFunctionAddress(SPVC, "spvc_compiler_get_specialization_constants"),
            compiler_get_constant_handle                          = apiGetFunctionAddress(SPVC, "spvc_compiler_get_constant_handle"),
            compiler_get_work_group_size_specialization_constants = apiGetFunctionAddress(SPVC, "spvc_compiler_get_work_group_size_specialization_constants"),
            compiler_get_active_buffer_ranges                     = apiGetFunctionAddress(SPVC, "spvc_compiler_get_active_buffer_ranges"),
            constant_get_scalar_fp16                              = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_fp16"),
            constant_get_scalar_fp32                              = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_fp32"),
            constant_get_scalar_fp64                              = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_fp64"),
            constant_get_scalar_u32                               = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_u32"),
            constant_get_scalar_i32                               = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_i32"),
            constant_get_scalar_u16                               = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_u16"),
            constant_get_scalar_i16                               = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_i16"),
            constant_get_scalar_u8                                = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_u8"),
            constant_get_scalar_i8                                = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_i8"),
            constant_get_subconstants                             = apiGetFunctionAddress(SPVC, "spvc_constant_get_subconstants"),
            constant_get_type                                     = apiGetFunctionAddress(SPVC, "spvc_constant_get_type"),
            compiler_get_binary_offset_for_decoration             = apiGetFunctionAddress(SPVC, "spvc_compiler_get_binary_offset_for_decoration"),
            compiler_buffer_is_hlsl_counter_buffer                = apiGetFunctionAddress(SPVC, "spvc_compiler_buffer_is_hlsl_counter_buffer"),
            compiler_buffer_get_hlsl_counter_buffer               = apiGetFunctionAddress(SPVC, "spvc_compiler_buffer_get_hlsl_counter_buffer"),
            compiler_get_declared_capabilities                    = apiGetFunctionAddress(SPVC, "spvc_compiler_get_declared_capabilities"),
            compiler_get_declared_extensions                      = apiGetFunctionAddress(SPVC, "spvc_compiler_get_declared_extensions"),
            compiler_get_remapped_declared_block_name             = apiGetFunctionAddress(SPVC, "spvc_compiler_get_remapped_declared_block_name"),
            compiler_get_buffer_block_decorations                 = apiGetFunctionAddress(SPVC, "spvc_compiler_get_buffer_block_decorations");

    }

    /** Returns the spvc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SPVC;
    }

    public static final int SPVC_C_API_VERSION_MAJOR = 0;

    public static final int SPVC_C_API_VERSION_MINOR = 48;

    public static final int SPVC_C_API_VERSION_PATCH = 0;

    public static final int SPVC_COMPILER_OPTION_COMMON_BIT = 0x1000000;

    public static final int SPVC_COMPILER_OPTION_GLSL_BIT = 0x2000000;

    public static final int SPVC_COMPILER_OPTION_HLSL_BIT = 0x4000000;

    public static final int SPVC_COMPILER_OPTION_MSL_BIT = 0x8000000;

    public static final int SPVC_COMPILER_OPTION_LANG_BITS = 0xF000000;

    public static final int SPVC_COMPILER_OPTION_ENUM_BITS = 0xFFFFFF;

    /** Special constant used in a {@code MSLResourceBinding} {@code desc_set} element to indicate the bindings for the push constants. */
    public static final int SPVC_MSL_PUSH_CONSTANT_DESC_SET = ~0;

    /** Special constant used in a {@code MSLResourceBinding} binding element to indicate the bindings for the push constants. */
    public static final int SPVC_MSL_PUSH_CONSTANT_BINDING = 0;

    /** Special constant used in a {@code MSLResourceBinding} binding element to indicate the buffer binding for swizzle buffers. */
    public static final int SPVC_MSL_SWIZZLE_BUFFER_BINDING = ~1;

    /**
     * Special constant used in a {@code MSLResourceBinding} binding element to indicate the buffer binding for buffer size buffers to support
     * {@code OpArrayLength}.
     */
    public static final int SPVC_MSL_BUFFER_SIZE_BUFFER_BINDING = ~2;

    /**
     * Special constant used in a {@code MSLResourceBinding} binding element to indicate the buffer binding used for the argument buffer itself.
     * 
     * <p>This buffer binding should be kept as small as possible as all automatic bindings for buffers will start at {@code max(kArgumentBufferBinding) + 1}.</p>
     */
    public static final int SPVC_MSL_ARGUMENT_BUFFER_BINDING = ~3;

    public static final int SPVC_MSL_AUX_BUFFER_STRUCT_VERSION = 0x1;

    /**
     * {@code spvc_result}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_SUCCESS SUCCESS} - Success.</li>
     * <li>{@link #SPVC_ERROR_INVALID_SPIRV ERROR_INVALID_SPIRV} - The SPIR-V is invalid. Should have been caught by validation ideally.</li>
     * <li>{@link #SPVC_ERROR_UNSUPPORTED_SPIRV ERROR_UNSUPPORTED_SPIRV} - The SPIR-V might be valid or invalid, but SPIRV-Cross currently cannot correctly translate this to your target language.</li>
     * <li>{@link #SPVC_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY} - If for some reason we hit this, new or malloc failed.</li>
     * <li>{@link #SPVC_ERROR_INVALID_ARGUMENT ERROR_INVALID_ARGUMENT} - Invalid API argument.</li>
     * </ul>
     */
    public static final int
        SPVC_SUCCESS                 = 0,
        SPVC_ERROR_INVALID_SPIRV     = -1,
        SPVC_ERROR_UNSUPPORTED_SPIRV = -2,
        SPVC_ERROR_OUT_OF_MEMORY     = -3,
        SPVC_ERROR_INVALID_ARGUMENT  = -4;

    /**
     * {@code spvc_capture_mode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_CAPTURE_MODE_COPY CAPTURE_MODE_COPY} - The Parsed IR payload will be copied, and the handle can be reused to create other compiler instances.</li>
     * <li>{@link #SPVC_CAPTURE_MODE_TAKE_OWNERSHIP CAPTURE_MODE_TAKE_OWNERSHIP} - 
     * The payload will now be owned by the compiler. parsed_ir should now be considered a dead blob and must not be used further. This is optimal for
     * performance and should be the go-to option.
     * </li>
     * </ul>
     */
    public static final int
        SPVC_CAPTURE_MODE_COPY           = 0,
        SPVC_CAPTURE_MODE_TAKE_OWNERSHIP = 1;

    /**
     * {@code spvc_backend}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_BACKEND_NONE BACKEND_NONE} - This backend can only perform reflection, no compiler options are supported. Maps to spirv_cross::Compiler.</li>
     * <li>{@link #SPVC_BACKEND_GLSL BACKEND_GLSL} - spirv_cross::CompilerGLSL</li>
     * <li>{@link #SPVC_BACKEND_HLSL BACKEND_HLSL} - CompilerHLSL</li>
     * <li>{@link #SPVC_BACKEND_MSL BACKEND_MSL} - CompilerMSL</li>
     * <li>{@link #SPVC_BACKEND_CPP BACKEND_CPP} - CompilerCPP</li>
     * <li>{@link #SPVC_BACKEND_JSON BACKEND_JSON} - CompilerReflection w/ JSON backend</li>
     * </ul>
     */
    public static final int
        SPVC_BACKEND_NONE = 0,
        SPVC_BACKEND_GLSL = 1,
        SPVC_BACKEND_HLSL = 2,
        SPVC_BACKEND_MSL  = 3,
        SPVC_BACKEND_CPP  = 4,
        SPVC_BACKEND_JSON = 5;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_resource_type})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_RESOURCE_TYPE_UNKNOWN RESOURCE_TYPE_UNKNOWN}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_UNIFORM_BUFFER RESOURCE_TYPE_UNIFORM_BUFFER}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_STORAGE_BUFFER RESOURCE_TYPE_STORAGE_BUFFER}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_STAGE_INPUT RESOURCE_TYPE_STAGE_INPUT}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_STAGE_OUTPUT RESOURCE_TYPE_STAGE_OUTPUT}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_SUBPASS_INPUT RESOURCE_TYPE_SUBPASS_INPUT}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_STORAGE_IMAGE RESOURCE_TYPE_STORAGE_IMAGE}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_SAMPLED_IMAGE RESOURCE_TYPE_SAMPLED_IMAGE}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_ATOMIC_COUNTER RESOURCE_TYPE_ATOMIC_COUNTER}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_PUSH_CONSTANT RESOURCE_TYPE_PUSH_CONSTANT}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_SEPARATE_IMAGE RESOURCE_TYPE_SEPARATE_IMAGE}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_SEPARATE_SAMPLERS RESOURCE_TYPE_SEPARATE_SAMPLERS}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_ACCELERATION_STRUCTURE RESOURCE_TYPE_ACCELERATION_STRUCTURE}</li>
     * <li>{@link #SPVC_RESOURCE_TYPE_RAY_QUERY RESOURCE_TYPE_RAY_QUERY}</li>
     * </ul>
     */
    public static final int
        SPVC_RESOURCE_TYPE_UNKNOWN                = 0,
        SPVC_RESOURCE_TYPE_UNIFORM_BUFFER         = 1,
        SPVC_RESOURCE_TYPE_STORAGE_BUFFER         = 2,
        SPVC_RESOURCE_TYPE_STAGE_INPUT            = 3,
        SPVC_RESOURCE_TYPE_STAGE_OUTPUT           = 4,
        SPVC_RESOURCE_TYPE_SUBPASS_INPUT          = 5,
        SPVC_RESOURCE_TYPE_STORAGE_IMAGE          = 6,
        SPVC_RESOURCE_TYPE_SAMPLED_IMAGE          = 7,
        SPVC_RESOURCE_TYPE_ATOMIC_COUNTER         = 8,
        SPVC_RESOURCE_TYPE_PUSH_CONSTANT          = 9,
        SPVC_RESOURCE_TYPE_SEPARATE_IMAGE         = 10,
        SPVC_RESOURCE_TYPE_SEPARATE_SAMPLERS      = 11,
        SPVC_RESOURCE_TYPE_ACCELERATION_STRUCTURE = 12,
        SPVC_RESOURCE_TYPE_RAY_QUERY              = 13;

    /**
     * {@code spvc_builtin_resource_type}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_BUILTIN_RESOURCE_TYPE_UNKNOWN BUILTIN_RESOURCE_TYPE_UNKNOWN}</li>
     * <li>{@link #SPVC_BUILTIN_RESOURCE_TYPE_STAGE_INPUT BUILTIN_RESOURCE_TYPE_STAGE_INPUT}</li>
     * <li>{@link #SPVC_BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT}</li>
     * </ul>
     */
    public static final int
        SPVC_BUILTIN_RESOURCE_TYPE_UNKNOWN      = 0,
        SPVC_BUILTIN_RESOURCE_TYPE_STAGE_INPUT  = 1,
        SPVC_BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT = 2;

    /**
     * Maps to spirv_cross::SPIRType::BaseType.
     * 
     * <p>({@code spvc_basetype})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_BASETYPE_UNKNOWN BASETYPE_UNKNOWN}</li>
     * <li>{@link #SPVC_BASETYPE_VOID BASETYPE_VOID}</li>
     * <li>{@link #SPVC_BASETYPE_BOOLEAN BASETYPE_BOOLEAN}</li>
     * <li>{@link #SPVC_BASETYPE_INT8 BASETYPE_INT8}</li>
     * <li>{@link #SPVC_BASETYPE_UINT8 BASETYPE_UINT8}</li>
     * <li>{@link #SPVC_BASETYPE_INT16 BASETYPE_INT16}</li>
     * <li>{@link #SPVC_BASETYPE_UINT16 BASETYPE_UINT16}</li>
     * <li>{@link #SPVC_BASETYPE_INT32 BASETYPE_INT32}</li>
     * <li>{@link #SPVC_BASETYPE_UINT32 BASETYPE_UINT32}</li>
     * <li>{@link #SPVC_BASETYPE_INT64 BASETYPE_INT64}</li>
     * <li>{@link #SPVC_BASETYPE_UINT64 BASETYPE_UINT64}</li>
     * <li>{@link #SPVC_BASETYPE_ATOMIC_COUNTER BASETYPE_ATOMIC_COUNTER}</li>
     * <li>{@link #SPVC_BASETYPE_FP16 BASETYPE_FP16}</li>
     * <li>{@link #SPVC_BASETYPE_FP32 BASETYPE_FP32}</li>
     * <li>{@link #SPVC_BASETYPE_FP64 BASETYPE_FP64}</li>
     * <li>{@link #SPVC_BASETYPE_STRUCT BASETYPE_STRUCT}</li>
     * <li>{@link #SPVC_BASETYPE_IMAGE BASETYPE_IMAGE}</li>
     * <li>{@link #SPVC_BASETYPE_SAMPLED_IMAGE BASETYPE_SAMPLED_IMAGE}</li>
     * <li>{@link #SPVC_BASETYPE_SAMPLER BASETYPE_SAMPLER}</li>
     * <li>{@link #SPVC_BASETYPE_ACCELERATION_STRUCTURE BASETYPE_ACCELERATION_STRUCTURE}</li>
     * </ul>
     */
    public static final int
        SPVC_BASETYPE_UNKNOWN                = 0,
        SPVC_BASETYPE_VOID                   = 1,
        SPVC_BASETYPE_BOOLEAN                = 2,
        SPVC_BASETYPE_INT8                   = 3,
        SPVC_BASETYPE_UINT8                  = 4,
        SPVC_BASETYPE_INT16                  = 5,
        SPVC_BASETYPE_UINT16                 = 6,
        SPVC_BASETYPE_INT32                  = 7,
        SPVC_BASETYPE_UINT32                 = 8,
        SPVC_BASETYPE_INT64                  = 9,
        SPVC_BASETYPE_UINT64                 = 10,
        SPVC_BASETYPE_ATOMIC_COUNTER         = 11,
        SPVC_BASETYPE_FP16                   = 12,
        SPVC_BASETYPE_FP32                   = 13,
        SPVC_BASETYPE_FP64                   = 14,
        SPVC_BASETYPE_STRUCT                 = 15,
        SPVC_BASETYPE_IMAGE                  = 16,
        SPVC_BASETYPE_SAMPLED_IMAGE          = 17,
        SPVC_BASETYPE_SAMPLER                = 18,
        SPVC_BASETYPE_ACCELERATION_STRUCTURE = 19;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_platform})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_PLATFORM_IOS MSL_PLATFORM_IOS}</li>
     * <li>{@link #SPVC_MSL_PLATFORM_MACOS MSL_PLATFORM_MACOS}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_PLATFORM_IOS   = 0,
        SPVC_MSL_PLATFORM_MACOS = 1;

    /**
     * The type of index in the index buffer, if present.
     * 
     * <p>({@code spvc_msl_index_type})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_INDEX_TYPE_NONE MSL_INDEX_TYPE_NONE}</li>
     * <li>{@link #SPVC_MSL_INDEX_TYPE_UINT16 MSL_INDEX_TYPE_UINT16}</li>
     * <li>{@link #SPVC_MSL_INDEX_TYPE_UINT32 MSL_INDEX_TYPE_UINT32}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_INDEX_TYPE_NONE   = 0,
        SPVC_MSL_INDEX_TYPE_UINT16 = 1,
        SPVC_MSL_INDEX_TYPE_UINT32 = 2;

    /**
     * Indicates the format of a shader input.
     * 
     * <p>Currently limited to specifying if the input is an 8-bit unsigned integer, 16-bit unsigned integer, or some other format.</p>
     * 
     * <p>({@code spvc_msl_shader_input_format})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SHADER_INPUT_FORMAT_OTHER MSL_SHADER_INPUT_FORMAT_OTHER}</li>
     * <li>{@link #SPVC_MSL_SHADER_INPUT_FORMAT_UINT8 MSL_SHADER_INPUT_FORMAT_UINT8}</li>
     * <li>{@link #SPVC_MSL_SHADER_INPUT_FORMAT_UINT16 MSL_SHADER_INPUT_FORMAT_UINT16}</li>
     * <li>{@link #SPVC_MSL_SHADER_INPUT_FORMAT_ANY16 MSL_SHADER_INPUT_FORMAT_ANY16}</li>
     * <li>{@link #SPVC_MSL_SHADER_INPUT_FORMAT_ANY32 MSL_SHADER_INPUT_FORMAT_ANY32}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SHADER_INPUT_FORMAT_OTHER  = 0,
        SPVC_MSL_SHADER_INPUT_FORMAT_UINT8  = 1,
        SPVC_MSL_SHADER_INPUT_FORMAT_UINT16 = 2,
        SPVC_MSL_SHADER_INPUT_FORMAT_ANY16  = 3,
        SPVC_MSL_SHADER_INPUT_FORMAT_ANY32  = 4;

    /**
     * Deprecated.
     * 
     * <p>({@code spvc_msl_vertex_format})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_VERTEX_FORMAT_OTHER MSL_VERTEX_FORMAT_OTHER}</li>
     * <li>{@link #SPVC_MSL_VERTEX_FORMAT_UINT8 MSL_VERTEX_FORMAT_UINT8}</li>
     * <li>{@link #SPVC_MSL_VERTEX_FORMAT_UINT16 MSL_VERTEX_FORMAT_UINT16}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_VERTEX_FORMAT_OTHER  = SPVC_MSL_SHADER_INPUT_FORMAT_OTHER,
        SPVC_MSL_VERTEX_FORMAT_UINT8  = SPVC_MSL_SHADER_INPUT_FORMAT_UINT8,
        SPVC_MSL_VERTEX_FORMAT_UINT16 = SPVC_MSL_SHADER_INPUT_FORMAT_UINT16;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_coord})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_COORD_NORMALIZED MSL_SAMPLER_COORD_NORMALIZED}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COORD_PIXEL MSL_SAMPLER_COORD_PIXEL}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_COORD_NORMALIZED = 0,
        SPVC_MSL_SAMPLER_COORD_PIXEL      = 1;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_filter})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_FILTER_NEAREST MSL_SAMPLER_FILTER_NEAREST}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_FILTER_LINEAR MSL_SAMPLER_FILTER_LINEAR}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_FILTER_NEAREST = 0,
        SPVC_MSL_SAMPLER_FILTER_LINEAR  = 1;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_mip_filter})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_MIP_FILTER_NONE MSL_SAMPLER_MIP_FILTER_NONE}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_MIP_FILTER_NEAREST MSL_SAMPLER_MIP_FILTER_NEAREST}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_MIP_FILTER_LINEAR MSL_SAMPLER_MIP_FILTER_LINEAR}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_MIP_FILTER_NONE    = 0,
        SPVC_MSL_SAMPLER_MIP_FILTER_NEAREST = 1,
        SPVC_MSL_SAMPLER_MIP_FILTER_LINEAR  = 2;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_address})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_ADDRESS_REPEAT MSL_SAMPLER_ADDRESS_REPEAT}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO   = 0,
        SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE   = 1,
        SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER = 2,
        SPVC_MSL_SAMPLER_ADDRESS_REPEAT          = 3,
        SPVC_MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT = 4;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_compare_func})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_NEVER MSL_SAMPLER_COMPARE_FUNC_NEVER}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS MSL_SAMPLER_COMPARE_FUNC_LESS}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER MSL_SAMPLER_COMPARE_FUNC_GREATER}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_EQUAL MSL_SAMPLER_COMPARE_FUNC_EQUAL}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_COMPARE_FUNC_ALWAYS MSL_SAMPLER_COMPARE_FUNC_ALWAYS}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_COMPARE_FUNC_NEVER         = 0,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS          = 1,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL    = 2,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER       = 3,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL = 4,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_EQUAL         = 5,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL     = 6,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_ALWAYS        = 7;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_border_color})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK = 0,
        SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK      = 1,
        SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE      = 2;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_format_resolution})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_FORMAT_RESOLUTION_444 MSL_FORMAT_RESOLUTION_444}</li>
     * <li>{@link #SPVC_MSL_FORMAT_RESOLUTION_422 MSL_FORMAT_RESOLUTION_422}</li>
     * <li>{@link #SPVC_MSL_FORMAT_RESOLUTION_420 MSL_FORMAT_RESOLUTION_420}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_FORMAT_RESOLUTION_444 = 0,
        SPVC_MSL_FORMAT_RESOLUTION_422 = 1,
        SPVC_MSL_FORMAT_RESOLUTION_420 = 2;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_chroma_location})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_CHROMA_LOCATION_COSITED_EVEN MSL_CHROMA_LOCATION_COSITED_EVEN}</li>
     * <li>{@link #SPVC_MSL_CHROMA_LOCATION_MIDPOINT MSL_CHROMA_LOCATION_MIDPOINT}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_CHROMA_LOCATION_COSITED_EVEN = 0,
        SPVC_MSL_CHROMA_LOCATION_MIDPOINT     = 1;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_component_swizzle})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_IDENTITY MSL_COMPONENT_SWIZZLE_IDENTITY}</li>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_ZERO MSL_COMPONENT_SWIZZLE_ZERO}</li>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_ONE MSL_COMPONENT_SWIZZLE_ONE}</li>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_R MSL_COMPONENT_SWIZZLE_R}</li>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_G MSL_COMPONENT_SWIZZLE_G}</li>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_B MSL_COMPONENT_SWIZZLE_B}</li>
     * <li>{@link #SPVC_MSL_COMPONENT_SWIZZLE_A MSL_COMPONENT_SWIZZLE_A}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_COMPONENT_SWIZZLE_IDENTITY = 0,
        SPVC_MSL_COMPONENT_SWIZZLE_ZERO     = 1,
        SPVC_MSL_COMPONENT_SWIZZLE_ONE      = 2,
        SPVC_MSL_COMPONENT_SWIZZLE_R        = 3,
        SPVC_MSL_COMPONENT_SWIZZLE_G        = 4,
        SPVC_MSL_COMPONENT_SWIZZLE_B        = 5,
        SPVC_MSL_COMPONENT_SWIZZLE_A        = 6;

    /**
     * Maps to C++ API.
     * 
     * <p>({@code spvc_msl_sampler_ycbcr_model_conversion})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709 MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601 MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020 MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY   = 0,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709   = 2,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601   = 3,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020  = 4;

    /**
     * Maps to C+ API.
     * 
     * <p>({@code spvc_msl_sampler_ycbcr_range})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_FULL MSL_SAMPLER_YCBCR_RANGE_ITU_FULL}</li>
     * <li>{@link #SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW}</li>
     * </ul>
     */
    public static final int
        SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_FULL   = 0,
        SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;

    /**
     * Maps to the various spirv_cross::Compiler*::Option structures. See C++ API for defaults and details.
     * 
     * <p>({@code spvc_hlsl_binding_flags})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_NONE_BIT HLSL_BINDING_AUTO_NONE_BIT}</li>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT} - 
     * Push constant (root constant) resources will be declared as CBVs (b-space) without a register() declaration.
     * 
     * <p>A register will be automatically assigned by the D3D compiler, but must therefore be reflected in D3D-land. Push constants do not normally have a
     * {@code DecorationBinding} set, but if they do, this can be used to ignore it.</p>
     * </li>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_CBV_BIT HLSL_BINDING_AUTO_CBV_BIT} - 
     * {@code cbuffer} resources will be declared as CBVs (b-space) without a register() declaration.
     * 
     * <p>A register will be automatically assigned, but must be reflected in D3D-land.</p>
     * </li>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_SRV_BIT HLSL_BINDING_AUTO_SRV_BIT} - All SRVs (t-space) will be declared without a {@code register()} declaration.</li>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_UAV_BIT HLSL_BINDING_AUTO_UAV_BIT} - All UAVs (u-space) will be declared without a {@code register()} declaration.</li>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_SAMPLER_BIT HLSL_BINDING_AUTO_SAMPLER_BIT} - All samplers (s-space) will be declared without a {@code register()} declaration.</li>
     * <li>{@link #SPVC_HLSL_BINDING_AUTO_ALL HLSL_BINDING_AUTO_ALL} - No resources will be declared with {@code register()}.</li>
     * </ul>
     */
    public static final int
        SPVC_HLSL_BINDING_AUTO_NONE_BIT          = 0,
        SPVC_HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT = 1 << 0,
        SPVC_HLSL_BINDING_AUTO_CBV_BIT           = 1 << 1,
        SPVC_HLSL_BINDING_AUTO_SRV_BIT           = 1 << 2,
        SPVC_HLSL_BINDING_AUTO_UAV_BIT           = 1 << 3,
        SPVC_HLSL_BINDING_AUTO_SAMPLER_BIT       = 1 << 4,
        SPVC_HLSL_BINDING_AUTO_ALL               = 0x7FFFFFFF;

    /** Special constant used in an HLSL {@code ResourceBinding} {@code desc_set} element to indicate the bindings for the push constants. */
    public static final int SPVC_HLSL_PUSH_CONSTANT_DESC_SET = ~0;

    /** Special constant used in an HLSL {@code ResourceBinding} binding element to indicate the bindings for the push constants. */
    public static final int SPVC_HLSL_PUSH_CONSTANT_BINDING = 0;

    /**
     * Maps to the various spirv_cross::Compiler*::Option structures. See C++ API for defaults and details.
     * 
     * <p>({@code spvc_compiler_option})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SPVC_COMPILER_OPTION_UNKNOWN COMPILER_OPTION_UNKNOWN}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_FORCE_TEMPORARY COMPILER_OPTION_FORCE_TEMPORARY}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_FIXUP_DEPTH_CONVENTION COMPILER_OPTION_FIXUP_DEPTH_CONVENTION}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_FLIP_VERTEX_Y COMPILER_OPTION_FLIP_VERTEX_Y}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_VERSION COMPILER_OPTION_GLSL_VERSION}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_ES COMPILER_OPTION_GLSL_ES}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_VULKAN_SEMANTICS COMPILER_OPTION_GLSL_VULKAN_SEMANTICS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_SHADER_MODEL COMPILER_OPTION_HLSL_SHADER_MODEL}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_POINT_COORD_COMPAT COMPILER_OPTION_HLSL_POINT_COORD_COMPAT}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_VERSION COMPILER_OPTION_MSL_VERSION}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_AUX_BUFFER_INDEX COMPILER_OPTION_MSL_AUX_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_DISABLE_RASTERIZATION COMPILER_OPTION_MSL_DISABLE_RASTERIZATION} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_PLATFORM COMPILER_OPTION_MSL_PLATFORM} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS COMPILER_OPTION_MSL_ARGUMENT_BUFFERS} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_EMIT_LINE_DIRECTIVES COMPILER_OPTION_EMIT_LINE_DIRECTIVES} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_MULTIVIEW COMPILER_OPTION_MSL_MULTIVIEW} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_DEVICE_INDEX COMPILER_OPTION_MSL_DEVICE_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_DISPATCH_BASE COMPILER_OPTION_MSL_DISPATCH_BASE} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX} - Obsolete, use SWIZZLE_BUFFER_INDEX instead.</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_TEXTURE_1D_AS_2D COMPILER_OPTION_MSL_TEXTURE_1D_AS_2D}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_BASE_INDEX_ZERO COMPILER_OPTION_MSL_ENABLE_BASE_INDEX_ZERO}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_IOS_FRAMEBUFFER_FETCH_SUBPASS COMPILER_OPTION_MSL_IOS_FRAMEBUFFER_FETCH_SUBPASS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_FRAMEBUFFER_FETCH_SUBPASS COMPILER_OPTION_MSL_FRAMEBUFFER_FETCH_SUBPASS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_INVARIANT_FP_MATH COMPILER_OPTION_MSL_INVARIANT_FP_MATH}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_EMULATE_CUBEMAP_ARRAY COMPILER_OPTION_MSL_EMULATE_CUBEMAP_ARRAY}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_DECORATION_BINDING COMPILER_OPTION_MSL_ENABLE_DECORATION_BINDING}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_FORCE_ACTIVE_ARGUMENT_BUFFER_RESOURCES COMPILER_OPTION_MSL_FORCE_ACTIVE_ARGUMENT_BUFFER_RESOURCES}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_FORCE_NATIVE_ARRAYS COMPILER_OPTION_MSL_FORCE_NATIVE_ARRAYS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_ENABLE_STORAGE_IMAGE_QUALIFIER_DEDUCTION COMPILER_OPTION_ENABLE_STORAGE_IMAGE_QUALIFIER_DEDUCTION}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_FORCE_STORAGE_BUFFER_AS_UAV COMPILER_OPTION_HLSL_FORCE_STORAGE_BUFFER_AS_UAV}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_FORCE_ZERO_INITIALIZED_VARIABLES COMPILER_OPTION_FORCE_ZERO_INITIALIZED_VARIABLES}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_NONWRITABLE_UAV_TEXTURE_AS_SRV COMPILER_OPTION_HLSL_NONWRITABLE_UAV_TEXTURE_AS_SRV}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_OUTPUT_MASK COMPILER_OPTION_MSL_ENABLE_FRAG_OUTPUT_MASK}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_DEPTH_BUILTIN COMPILER_OPTION_MSL_ENABLE_FRAG_DEPTH_BUILTIN}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_STENCIL_REF_BUILTIN COMPILER_OPTION_MSL_ENABLE_FRAG_STENCIL_REF_BUILTIN}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ENABLE_CLIP_DISTANCE_USER_VARYING COMPILER_OPTION_MSL_ENABLE_CLIP_DISTANCE_USER_VARYING}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_ENABLE_16BIT_TYPES COMPILER_OPTION_HLSL_ENABLE_16BIT_TYPES}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_MULTI_PATCH_WORKGROUP COMPILER_OPTION_MSL_MULTI_PATCH_WORKGROUP}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_BUFFER_INDEX COMPILER_OPTION_MSL_SHADER_INPUT_BUFFER_INDEX}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_SHADER_INDEX_BUFFER_INDEX COMPILER_OPTION_MSL_SHADER_INDEX_BUFFER_INDEX}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_VERTEX_FOR_TESSELLATION COMPILER_OPTION_MSL_VERTEX_FOR_TESSELLATION}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_VERTEX_INDEX_TYPE COMPILER_OPTION_MSL_VERTEX_INDEX_TYPE}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_FORCE_FLATTENED_IO_BLOCKS COMPILER_OPTION_GLSL_FORCE_FLATTENED_IO_BLOCKS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_MULTIVIEW_LAYERED_RENDERING COMPILER_OPTION_MSL_MULTIVIEW_LAYERED_RENDERING}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_ARRAYED_SUBPASS_INPUT COMPILER_OPTION_MSL_ARRAYED_SUBPASS_INPUT}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_R32UI_LINEAR_TEXTURE_ALIGNMENT COMPILER_OPTION_MSL_R32UI_LINEAR_TEXTURE_ALIGNMENT}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_R32UI_ALIGNMENT_CONSTANT_ID COMPILER_OPTION_MSL_R32UI_ALIGNMENT_CONSTANT_ID}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_HLSL_FLATTEN_MATRIX_VERTEX_INPUT_SEMANTICS COMPILER_OPTION_HLSL_FLATTEN_MATRIX_VERTEX_INPUT_SEMANTICS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_IOS_USE_SIMDGROUP_FUNCTIONS COMPILER_OPTION_MSL_IOS_USE_SIMDGROUP_FUNCTIONS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_EMULATE_SUBGROUPS COMPILER_OPTION_MSL_EMULATE_SUBGROUPS}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_FIXED_SUBGROUP_SIZE COMPILER_OPTION_MSL_FIXED_SUBGROUP_SIZE}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_FORCE_SAMPLE_RATE_SHADING COMPILER_OPTION_MSL_FORCE_SAMPLE_RATE_SHADING}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_MSL_IOS_SUPPORT_BASE_VERTEX_INSTANCE COMPILER_OPTION_MSL_IOS_SUPPORT_BASE_VERTEX_INSTANCE}</li>
     * <li>{@link #SPVC_COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT}</li>
     * </ul>
     */
    public static final int
        SPVC_COMPILER_OPTION_UNKNOWN                                        = 0,
        SPVC_COMPILER_OPTION_FORCE_TEMPORARY                                = 1 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS                = 2 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_FIXUP_DEPTH_CONVENTION                         = 3 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_FLIP_VERTEX_Y                                  = 4 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE             = 5 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS                   = 6 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION                  = 7 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_VERSION                                   = 8 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_ES                                        = 9 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_VULKAN_SEMANTICS                          = 10 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP          = 11 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP            = 12 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_SHADER_MODEL                              = 13 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT                         = 14 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_POINT_COORD_COMPAT                        = 15 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE = 16 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_VERSION                                    = 17 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH                 = 18 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_AUX_BUFFER_INDEX                           = 19 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX                       = 19 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX               = 20 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX                 = 21 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX           = 22 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX     = 23 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX               = 24 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN                  = 25 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_DISABLE_RASTERIZATION                      = 26 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER                   = 27 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES                    = 28 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS             = 29 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT              = 30 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_PLATFORM                                   = 31 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS                           = 32 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER      = 33 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE                      = 34 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS     = 35 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX                   = 36 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_EMIT_LINE_DIRECTIVES                           = 37 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_MSL_MULTIVIEW                                  = 38 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX                     = 39 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_DEVICE_INDEX                               = 40 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX               = 41 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_DISPATCH_BASE                              = 42 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX               = 43 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_TEXTURE_1D_AS_2D                           = 44 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_BASE_INDEX_ZERO                     = 45 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_IOS_FRAMEBUFFER_FETCH_SUBPASS              = 46 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_FRAMEBUFFER_FETCH_SUBPASS                  = 46 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_INVARIANT_FP_MATH                          = 47 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_EMULATE_CUBEMAP_ARRAY                      = 48 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_DECORATION_BINDING                  = 49 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_FORCE_ACTIVE_ARGUMENT_BUFFER_RESOURCES     = 50 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_FORCE_NATIVE_ARRAYS                        = 51 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_ENABLE_STORAGE_IMAGE_QUALIFIER_DEDUCTION       = 52 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_HLSL_FORCE_STORAGE_BUFFER_AS_UAV               = 53 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_FORCE_ZERO_INITIALIZED_VARIABLES               = 54 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_HLSL_NONWRITABLE_UAV_TEXTURE_AS_SRV            = 55 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_OUTPUT_MASK                    = 56 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_DEPTH_BUILTIN                  = 57 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_STENCIL_REF_BUILTIN            = 58 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_CLIP_DISTANCE_USER_VARYING          = 59 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_ENABLE_16BIT_TYPES                        = 60 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_MULTI_PATCH_WORKGROUP                      = 61 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_BUFFER_INDEX                  = 62 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_INDEX_BUFFER_INDEX                  = 63 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_VERTEX_FOR_TESSELLATION                    = 64 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_VERTEX_INDEX_TYPE                          = 65 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_FORCE_FLATTENED_IO_BLOCKS                 = 66 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_MULTIVIEW_LAYERED_RENDERING                = 67 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ARRAYED_SUBPASS_INPUT                      = 68 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_R32UI_LINEAR_TEXTURE_ALIGNMENT             = 69 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_R32UI_ALIGNMENT_CONSTANT_ID                = 70 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_FLATTEN_MATRIX_VERTEX_INPUT_SEMANTICS     = 71 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_IOS_USE_SIMDGROUP_FUNCTIONS                = 72 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_EMULATE_SUBGROUPS                          = 73 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_FIXED_SUBGROUP_SIZE                        = 74 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_FORCE_SAMPLE_RATE_SHADING                  = 75 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_IOS_SUPPORT_BASE_VERTEX_INSTANCE           = 76 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT                  = 77 | SPVC_COMPILER_OPTION_GLSL_BIT;

    protected Spvc() {
        throw new UnsupportedOperationException();
    }

    // --- [ spvc_get_version ] ---

    /** Unsafe version of: {@link #spvc_get_version get_version} */
    public static void nspvc_get_version(long major, long minor, long patch) {
        long __functionAddress = Functions.get_version;
        invokePPPV(major, minor, patch, __functionAddress);
    }

    /** Gets the {@code SPVC_C_API_VERSION_*} used to build this library. Can be used to check for ABI mismatch if so-versioning did not catch it. */
    public static void spvc_get_version(@NativeType("unsigned int *") IntBuffer major, @NativeType("unsigned int *") IntBuffer minor, @NativeType("unsigned int *") IntBuffer patch) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
            check(patch, 1);
        }
        nspvc_get_version(memAddress(major), memAddress(minor), memAddress(patch));
    }

    // --- [ spvc_get_commit_revision_and_timestamp ] ---

    /** Unsafe version of: {@link #spvc_get_commit_revision_and_timestamp get_commit_revision_and_timestamp} */
    public static long nspvc_get_commit_revision_and_timestamp() {
        long __functionAddress = Functions.get_commit_revision_and_timestamp;
        return invokeP(__functionAddress);
    }

    /** Gets a human readable version string to identify which commit a particular binary was created from. */
    @Nullable
    @NativeType("char const *")
    public static String spvc_get_commit_revision_and_timestamp() {
        long __result = nspvc_get_commit_revision_and_timestamp();
        return memUTF8Safe(__result);
    }

    // --- [ spvc_msl_vertex_attribute_init ] ---

    /** Unsafe version of: {@link #spvc_msl_vertex_attribute_init msl_vertex_attribute_init} */
    public static void nspvc_msl_vertex_attribute_init(long attr) {
        long __functionAddress = Functions.msl_vertex_attribute_init;
        invokePV(attr, __functionAddress);
    }

    /** Initializes the vertex attribute struct. */
    public static void spvc_msl_vertex_attribute_init(@NativeType("spvc_msl_vertex_attribute *") SpvcMslVertexAttribute attr) {
        nspvc_msl_vertex_attribute_init(attr.address());
    }

    // --- [ spvc_msl_shader_input_init ] ---

    /** Unsafe version of: {@link #spvc_msl_shader_input_init msl_shader_input_init} */
    public static void nspvc_msl_shader_input_init(long input) {
        long __functionAddress = Functions.msl_shader_input_init;
        invokePV(input, __functionAddress);
    }

    /** Initializes the shader input struct. */
    public static void spvc_msl_shader_input_init(@NativeType("spvc_msl_shader_input *") SpvcMslShaderInput input) {
        nspvc_msl_shader_input_init(input.address());
    }

    // --- [ spvc_msl_resource_binding_init ] ---

    /** Unsafe version of: {@link #spvc_msl_resource_binding_init msl_resource_binding_init} */
    public static void nspvc_msl_resource_binding_init(long binding) {
        long __functionAddress = Functions.msl_resource_binding_init;
        invokePV(binding, __functionAddress);
    }

    /** Initializes the resource binding struct. The defaults are non-zero. */
    public static void spvc_msl_resource_binding_init(@NativeType("spvc_msl_resource_binding *") SpvcMslResourceBinding binding) {
        nspvc_msl_resource_binding_init(binding.address());
    }

    // --- [ spvc_msl_get_aux_buffer_struct_version ] ---

    /** Runtime check for incompatibility. Obsolete. */
    @NativeType("unsigned int")
    public static int spvc_msl_get_aux_buffer_struct_version() {
        long __functionAddress = Functions.msl_get_aux_buffer_struct_version;
        return invokeI(__functionAddress);
    }

    // --- [ spvc_msl_constexpr_sampler_init ] ---

    /** Unsafe version of: {@link #spvc_msl_constexpr_sampler_init msl_constexpr_sampler_init} */
    public static void nspvc_msl_constexpr_sampler_init(long sampler) {
        long __functionAddress = Functions.msl_constexpr_sampler_init;
        invokePV(sampler, __functionAddress);
    }

    /** Initializes the {@code constexpr} sampler struct. The defaults are non-zero. */
    public static void spvc_msl_constexpr_sampler_init(@NativeType("spvc_msl_constexpr_sampler *") SpvcMslConstexprSampler sampler) {
        nspvc_msl_constexpr_sampler_init(sampler.address());
    }

    // --- [ spvc_msl_sampler_ycbcr_conversion_init ] ---

    /** Unsafe version of: {@link #spvc_msl_sampler_ycbcr_conversion_init msl_sampler_ycbcr_conversion_init} */
    public static void nspvc_msl_sampler_ycbcr_conversion_init(long conv) {
        long __functionAddress = Functions.msl_sampler_ycbcr_conversion_init;
        invokePV(conv, __functionAddress);
    }

    /** Initializes the {@code constexpr} sampler struct. The defaults are non-zero. */
    public static void spvc_msl_sampler_ycbcr_conversion_init(@NativeType("spvc_msl_sampler_ycbcr_conversion *") SpvcMslSamplerYcbcrConversion conv) {
        nspvc_msl_sampler_ycbcr_conversion_init(conv.address());
    }

    // --- [ spvc_hlsl_resource_binding_init ] ---

    /** Unsafe version of: {@link #spvc_hlsl_resource_binding_init hlsl_resource_binding_init} */
    public static void nspvc_hlsl_resource_binding_init(long binding) {
        long __functionAddress = Functions.hlsl_resource_binding_init;
        invokePV(binding, __functionAddress);
    }

    /**
     * Initializes the resource binding struct.
     * 
     * <p>The defaults are non-zero.</p>
     */
    public static void spvc_hlsl_resource_binding_init(@NativeType("spvc_hlsl_resource_binding *") SpvcHLSLResourceBinding binding) {
        nspvc_hlsl_resource_binding_init(binding.address());
    }

    // --- [ spvc_context_create ] ---

    /** Unsafe version of: {@link #spvc_context_create context_create} */
    public static int nspvc_context_create(long context) {
        long __functionAddress = Functions.context_create;
        return invokePI(context, __functionAddress);
    }

    /**
     * Context is the highest-level API construct.
     * 
     * <p>The context owns all memory allocations made by its child object hierarchy, including various non-opaque structs and strings. This means that the API
     * user only has to care about one "destroy" call ever when using the C API. All pointers handed out by the APIs are only valid as long as the context is
     * alive and {@link #spvc_context_release_allocations context_release_allocations} has not been called.</p>
     */
    @NativeType("spvc_result")
    public static int spvc_context_create(@NativeType("spvc_context *") PointerBuffer context) {
        if (CHECKS) {
            check(context, 1);
        }
        return nspvc_context_create(memAddress(context));
    }

    // --- [ spvc_context_destroy ] ---

    /** Frees all memory allocations and objects associated with the context and its child objects. */
    public static void spvc_context_destroy(@NativeType("spvc_context") long context) {
        long __functionAddress = Functions.context_destroy;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ spvc_context_release_allocations ] ---

    /** Frees all memory allocations and objects associated with the context and its child objects, but keeps the context alive. */
    public static void spvc_context_release_allocations(@NativeType("spvc_context") long context) {
        long __functionAddress = Functions.context_release_allocations;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ spvc_context_get_last_error_string ] ---

    /** Unsafe version of: {@link #spvc_context_get_last_error_string context_get_last_error_string} */
    public static long nspvc_context_get_last_error_string(long context) {
        long __functionAddress = Functions.context_get_last_error_string;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    /** Get the string for the last error which was logged. */
    @Nullable
    @NativeType("char const *")
    public static String spvc_context_get_last_error_string(@NativeType("spvc_context") long context) {
        long __result = nspvc_context_get_last_error_string(context);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_context_set_error_callback ] ---

    /** Unsafe version of: {@link #spvc_context_set_error_callback context_set_error_callback} */
    public static void nspvc_context_set_error_callback(long context, long cb, long userdata) {
        long __functionAddress = Functions.context_set_error_callback;
        if (CHECKS) {
            check(context);
        }
        invokePPPV(context, cb, userdata, __functionAddress);
    }

    /** Get notified in a callback when an error triggers. Useful for debugging. */
    public static void spvc_context_set_error_callback(@NativeType("spvc_context") long context, @NativeType("spvc_error_callback") SpvcErrorCallbackI cb, @NativeType("void *") long userdata) {
        nspvc_context_set_error_callback(context, cb.address(), userdata);
    }

    // --- [ spvc_context_parse_spirv ] ---

    /** Unsafe version of: {@link #spvc_context_parse_spirv context_parse_spirv} */
    public static int nspvc_context_parse_spirv(long context, long spirv, long word_count, long parsed_ir) {
        long __functionAddress = Functions.context_parse_spirv;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPI(context, spirv, word_count, parsed_ir, __functionAddress);
    }

    /** SPIR-V parsing interface. Maps to {@code Parser} which then creates a {@code ParsedIR}, and that IR is extracted into the handle. */
    @NativeType("spvc_result")
    public static int spvc_context_parse_spirv(@NativeType("spvc_context") long context, @NativeType("SpvId const *") IntBuffer spirv, @NativeType("size_t") long word_count, @NativeType("spvc_parsed_ir *") PointerBuffer parsed_ir) {
        if (CHECKS) {
            check(spirv, 1);
            check(parsed_ir, 1);
        }
        return nspvc_context_parse_spirv(context, memAddress(spirv), word_count, memAddress(parsed_ir));
    }

    // --- [ spvc_context_create_compiler ] ---

    /** Unsafe version of: {@link #spvc_context_create_compiler context_create_compiler} */
    public static int nspvc_context_create_compiler(long context, int backend, long parsed_ir, int mode, long compiler) {
        long __functionAddress = Functions.context_create_compiler;
        if (CHECKS) {
            check(context);
            check(parsed_ir);
        }
        return invokePPPI(context, backend, parsed_ir, mode, compiler, __functionAddress);
    }

    /**
     * Create a compiler backend.
     * 
     * <p>Capture mode controls if we construct by copy or move semantics. It is always recommended to use {@link #SPVC_CAPTURE_MODE_TAKE_OWNERSHIP CAPTURE_MODE_TAKE_OWNERSHIP} if you only intend to
     * cross-compile the IR once.</p>
     */
    @NativeType("spvc_result")
    public static int spvc_context_create_compiler(@NativeType("spvc_context") long context, @NativeType("spvc_backend") int backend, @NativeType("spvc_parsed_ir") long parsed_ir, @NativeType("spvc_capture_mode") int mode, @NativeType("spvc_compiler *") PointerBuffer compiler) {
        if (CHECKS) {
            check(compiler, 1);
        }
        return nspvc_context_create_compiler(context, backend, parsed_ir, mode, memAddress(compiler));
    }

    // --- [ spvc_compiler_get_current_id_bound ] ---

    /** Maps directly to C++ API. */
    @NativeType("unsigned int")
    public static int spvc_compiler_get_current_id_bound(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_current_id_bound;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_create_compiler_options ] ---

    /** Unsafe version of: {@link #spvc_compiler_create_compiler_options compiler_create_compiler_options} */
    public static int nspvc_compiler_create_compiler_options(long compiler, long options) {
        long __functionAddress = Functions.compiler_create_compiler_options;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, options, __functionAddress);
    }

    /** Create compiler options, which will initialize defaults. */
    @NativeType("spvc_result")
    public static int spvc_compiler_create_compiler_options(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_compiler_options *") PointerBuffer options) {
        if (CHECKS) {
            check(options, 1);
        }
        return nspvc_compiler_create_compiler_options(compiler, memAddress(options));
    }

    // --- [ spvc_compiler_options_set_bool ] ---

    /** Override options. Will return error if e.g. MSL options are used for the HLSL backend, etc. */
    @NativeType("spvc_result")
    public static int spvc_compiler_options_set_bool(@NativeType("spvc_compiler_options") long options, @NativeType("spvc_compiler_option") int option, @NativeType("spvc_bool") boolean value) {
        long __functionAddress = Functions.compiler_options_set_bool;
        if (CHECKS) {
            check(options);
        }
        return invokePI(options, option, value, __functionAddress);
    }

    // --- [ spvc_compiler_options_set_uint ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_options_set_uint(@NativeType("spvc_compiler_options") long options, @NativeType("spvc_compiler_option") int option, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.compiler_options_set_uint;
        if (CHECKS) {
            check(options);
        }
        return invokePI(options, option, value, __functionAddress);
    }

    // --- [ spvc_compiler_install_compiler_options ] ---

    /** Set compiler options. */
    @NativeType("spvc_result")
    public static int spvc_compiler_install_compiler_options(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_compiler_options") long options) {
        long __functionAddress = Functions.compiler_install_compiler_options;
        if (CHECKS) {
            check(compiler);
            check(options);
        }
        return invokePPI(compiler, options, __functionAddress);
    }

    // --- [ spvc_compiler_compile ] ---

    /** Unsafe version of: {@link #spvc_compiler_compile compiler_compile} */
    public static int nspvc_compiler_compile(long compiler, long source) {
        long __functionAddress = Functions.compiler_compile;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, source, __functionAddress);
    }

    /**
     * Compile IR into a string.
     *
     * @param source owned by the context, and caller must not free it themselves
     */
    @NativeType("spvc_result")
    public static int spvc_compiler_compile(@NativeType("spvc_compiler") long compiler, @NativeType("char const **") PointerBuffer source) {
        if (CHECKS) {
            check(source, 1);
        }
        return nspvc_compiler_compile(compiler, memAddress(source));
    }

    // --- [ spvc_compiler_add_header_line ] ---

    /** Unsafe version of: {@link #spvc_compiler_add_header_line compiler_add_header_line} */
    public static int nspvc_compiler_add_header_line(long compiler, long line) {
        long __functionAddress = Functions.compiler_add_header_line;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, line, __functionAddress);
    }

    /** Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer line) {
        if (CHECKS) {
            checkNT1(line);
        }
        return nspvc_compiler_add_header_line(compiler, memAddress(line));
    }

    /** Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence line) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(line, true);
            long lineEncoded = stack.getPointerAddress();
            return nspvc_compiler_add_header_line(compiler, lineEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_require_extension ] ---

    public static int nspvc_compiler_require_extension(long compiler, long ext) {
        long __functionAddress = Functions.compiler_require_extension;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, ext, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer ext) {
        if (CHECKS) {
            checkNT1(ext);
        }
        return nspvc_compiler_require_extension(compiler, memAddress(ext));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence ext) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ext, true);
            long extEncoded = stack.getPointerAddress();
            return nspvc_compiler_require_extension(compiler, extEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_flatten_buffer_block ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_flatten_buffer_block(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_flatten_buffer_block;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_variable_is_depth_or_compare ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_variable_is_depth_or_compare(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_variable_is_depth_or_compare;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_mask_stage_output_by_location ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_location(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location, @NativeType("unsigned") int component) {
        long __functionAddress = Functions.compiler_mask_stage_output_by_location;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, location, component, __functionAddress);
    }

    // --- [ spvc_compiler_mask_stage_output_by_builtin ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_builtin(@NativeType("spvc_compiler") long compiler, @NativeType("SpvBuiltIn") int builtin) {
        long __functionAddress = Functions.compiler_mask_stage_output_by_builtin;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, builtin, __functionAddress);
    }

    // --- [ spvc_compiler_hlsl_set_root_constants_layout ] ---

    /** Unsafe version of: {@link #spvc_compiler_hlsl_set_root_constants_layout compiler_hlsl_set_root_constants_layout} */
    public static int nspvc_compiler_hlsl_set_root_constants_layout(long compiler, long constant_info, long count) {
        long __functionAddress = Functions.compiler_hlsl_set_root_constants_layout;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, constant_info, count, __functionAddress);
    }

    /** HLSL specifics. Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_root_constants_layout(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_root_constants const *") SpvcHlslRootConstants constant_info, @NativeType("size_t") long count) {
        return nspvc_compiler_hlsl_set_root_constants_layout(compiler, constant_info.address(), count);
    }

    // --- [ spvc_compiler_hlsl_add_vertex_attribute_remap ] ---

    public static int nspvc_compiler_hlsl_add_vertex_attribute_remap(long compiler, long remap, long remaps) {
        long __functionAddress = Functions.compiler_hlsl_add_vertex_attribute_remap;
        if (CHECKS) {
            check(compiler);
            SpvcHlslVertexAttributeRemap.validate(remap);
        }
        return invokePPPI(compiler, remap, remaps, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_vertex_attribute_remap(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_vertex_attribute_remap const *") SpvcHlslVertexAttributeRemap remap, @NativeType("size_t") long remaps) {
        return nspvc_compiler_hlsl_add_vertex_attribute_remap(compiler, remap.address(), remaps);
    }

    // --- [ spvc_compiler_hlsl_remap_num_workgroups_builtin ] ---

    @NativeType("spvc_variable_id")
    public static int spvc_compiler_hlsl_remap_num_workgroups_builtin(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_hlsl_remap_num_workgroups_builtin;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_hlsl_set_resource_binding_flags ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_resource_binding_flags(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_binding_flags") int flags) {
        long __functionAddress = Functions.compiler_hlsl_set_resource_binding_flags;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, flags, __functionAddress);
    }

    // --- [ spvc_compiler_hlsl_add_resource_binding ] ---

    public static int nspvc_compiler_hlsl_add_resource_binding(long compiler, long binding) {
        long __functionAddress = Functions.compiler_hlsl_add_resource_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, binding, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_resource_binding const *") SpvcHLSLResourceBinding binding) {
        return nspvc_compiler_hlsl_add_resource_binding(compiler, binding.address());
    }

    // --- [ spvc_compiler_hlsl_is_resource_used ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_hlsl_is_resource_used(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionModel") int model, @NativeType("unsigned") int set, @NativeType("unsigned") int binding) {
        long __functionAddress = Functions.compiler_hlsl_is_resource_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, model, set, binding, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_rasterization_disabled ] ---

    /** MSL specifics. Maps to C++ API. */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_rasterization_disabled(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_is_rasterization_disabled;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_swizzle_buffer ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_swizzle_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_swizzle_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_buffer_size_buffer ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_buffer_size_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_buffer_size_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_output_buffer ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_output_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_output_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_patch_output_buffer ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_patch_output_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_patch_output_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_input_threadgroup_mem ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_input_threadgroup_mem(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_input_threadgroup_mem;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_add_vertex_attribute ] ---

    public static int nspvc_compiler_msl_add_vertex_attribute(long compiler, long attrs) {
        long __functionAddress = Functions.compiler_msl_add_vertex_attribute;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, attrs, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_vertex_attribute(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_vertex_attribute const *") SpvcMslVertexAttribute attrs) {
        return nspvc_compiler_msl_add_vertex_attribute(compiler, attrs.address());
    }

    // --- [ spvc_compiler_msl_add_resource_binding ] ---

    public static int nspvc_compiler_msl_add_resource_binding(long compiler, long binding) {
        long __functionAddress = Functions.compiler_msl_add_resource_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, binding, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_resource_binding const *") SpvcMslResourceBinding binding) {
        return nspvc_compiler_msl_add_resource_binding(compiler, binding.address());
    }

    // --- [ spvc_compiler_msl_add_shader_input ] ---

    public static int nspvc_compiler_msl_add_shader_input(long compiler, long input) {
        long __functionAddress = Functions.compiler_msl_add_shader_input;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, input, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_input const *") SpvcMslShaderInput input) {
        return nspvc_compiler_msl_add_shader_input(compiler, input.address());
    }

    // --- [ spvc_compiler_msl_add_discrete_descriptor_set ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_discrete_descriptor_set(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set) {
        long __functionAddress = Functions.compiler_msl_add_discrete_descriptor_set;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, __functionAddress);
    }

    // --- [ spvc_compiler_msl_set_argument_buffer_device_address_space ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_argument_buffer_device_address_space(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int desc_set, @NativeType("spvc_bool") boolean device_address) {
        long __functionAddress = Functions.compiler_msl_set_argument_buffer_device_address_space;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, device_address, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_vertex_attribute_used ] ---

    /** Obsolete, use {@link #spvc_compiler_msl_is_shader_input_used compiler_msl_is_shader_input_used}. */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_vertex_attribute_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int location) {
        long __functionAddress = Functions.compiler_msl_is_vertex_attribute_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, location, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_shader_input_used ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_input_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location) {
        long __functionAddress = Functions.compiler_msl_is_shader_input_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, location, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_resource_used ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_resource_used(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionModel") int model, @NativeType("unsigned int") int set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.compiler_msl_is_resource_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, model, set, binding, __functionAddress);
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler ] ---

    public static int nspvc_compiler_msl_remap_constexpr_sampler(long compiler, int id, long sampler) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, id, sampler, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler) {
        return nspvc_compiler_msl_remap_constexpr_sampler(compiler, id, sampler.address());
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler_by_binding ] ---

    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding(long compiler, int desc_set, int binding, long sampler) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_by_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, desc_set, binding, sampler, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler) {
        return nspvc_compiler_msl_remap_constexpr_sampler_by_binding(compiler, desc_set, binding, sampler.address());
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler_ycbcr ] ---

    public static int nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(long compiler, int id, long sampler, long conv) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_ycbcr;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, id, sampler, conv, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_ycbcr(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler, @NativeType("spvc_msl_sampler_ycbcr_conversion const *") SpvcMslSamplerYcbcrConversion conv) {
        return nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(compiler, id, sampler.address(), conv.address());
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr ] ---

    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(long compiler, int desc_set, int binding, long sampler, long conv) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_by_binding_ycbcr;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, desc_set, binding, sampler, conv, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler, @NativeType("spvc_msl_sampler_ycbcr_conversion const *") SpvcMslSamplerYcbcrConversion conv) {
        return nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(compiler, desc_set, binding, sampler.address(), conv.address());
    }

    // --- [ spvc_compiler_msl_set_fragment_output_components ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_fragment_output_components(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int location, @NativeType("unsigned int") int components) {
        long __functionAddress = Functions.compiler_msl_set_fragment_output_components;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, location, components, __functionAddress);
    }

    // --- [ spvc_compiler_msl_get_automatic_resource_binding ] ---

    @NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_msl_get_automatic_resource_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_msl_get_automatic_resource_binding_secondary ] ---

    @NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding_secondary(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_msl_get_automatic_resource_binding_secondary;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_msl_add_dynamic_buffer ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_dynamic_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.compiler_msl_add_dynamic_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, binding, index, __functionAddress);
    }

    // --- [ spvc_compiler_msl_add_inline_uniform_block ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_inline_uniform_block(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.compiler_msl_add_inline_uniform_block;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, binding, __functionAddress);
    }

    // --- [ spvc_compiler_msl_set_combined_sampler_suffix ] ---

    public static int nspvc_compiler_msl_set_combined_sampler_suffix(long compiler, long suffix) {
        long __functionAddress = Functions.compiler_msl_set_combined_sampler_suffix;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, suffix, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer suffix) {
        if (CHECKS) {
            checkNT1(suffix);
        }
        return nspvc_compiler_msl_set_combined_sampler_suffix(compiler, memAddress(suffix));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence suffix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(suffix, true);
            long suffixEncoded = stack.getPointerAddress();
            return nspvc_compiler_msl_set_combined_sampler_suffix(compiler, suffixEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_msl_get_combined_sampler_suffix ] ---

    public static long nspvc_compiler_msl_get_combined_sampler_suffix(long compiler) {
        long __functionAddress = Functions.compiler_msl_get_combined_sampler_suffix;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_msl_get_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler) {
        long __result = nspvc_compiler_msl_get_combined_sampler_suffix(compiler);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_active_interface_variables ] ---

    /** Unsafe version of: {@link #spvc_compiler_get_active_interface_variables compiler_get_active_interface_variables} */
    public static int nspvc_compiler_get_active_interface_variables(long compiler, long set) {
        long __functionAddress = Functions.compiler_get_active_interface_variables;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, set, __functionAddress);
    }

    /** Reflect resources. Maps almost 1:1 to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_active_interface_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_set *") PointerBuffer set) {
        if (CHECKS) {
            check(set, 1);
        }
        return nspvc_compiler_get_active_interface_variables(compiler, memAddress(set));
    }

    // --- [ spvc_compiler_set_enabled_interface_variables ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_set_enabled_interface_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_set") long set) {
        long __functionAddress = Functions.compiler_set_enabled_interface_variables;
        if (CHECKS) {
            check(compiler);
            check(set);
        }
        return invokePPI(compiler, set, __functionAddress);
    }

    // --- [ spvc_compiler_create_shader_resources ] ---

    public static int nspvc_compiler_create_shader_resources(long compiler, long resources) {
        long __functionAddress = Functions.compiler_create_shader_resources;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, resources, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_resources *") PointerBuffer resources) {
        if (CHECKS) {
            check(resources, 1);
        }
        return nspvc_compiler_create_shader_resources(compiler, memAddress(resources));
    }

    // --- [ spvc_compiler_create_shader_resources_for_active_variables ] ---

    public static int nspvc_compiler_create_shader_resources_for_active_variables(long compiler, long resources, long active) {
        long __functionAddress = Functions.compiler_create_shader_resources_for_active_variables;
        if (CHECKS) {
            check(compiler);
            check(active);
        }
        return invokePPPI(compiler, resources, active, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources_for_active_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_resources *") PointerBuffer resources, @NativeType("spvc_set") long active) {
        if (CHECKS) {
            check(resources, 1);
        }
        return nspvc_compiler_create_shader_resources_for_active_variables(compiler, memAddress(resources), active);
    }

    // --- [ spvc_resources_get_resource_list_for_type ] ---

    public static int nspvc_resources_get_resource_list_for_type(long resources, int type, long resource_list, long resource_size) {
        long __functionAddress = Functions.resources_get_resource_list_for_type;
        if (CHECKS) {
            check(resources);
        }
        return invokePPPI(resources, type, resource_list, resource_size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_resources_get_resource_list_for_type(@NativeType("spvc_resources") long resources, @NativeType("spvc_resource_type") int type, @NativeType("spvc_reflected_resource const **") PointerBuffer resource_list, @NativeType("size_t *") PointerBuffer resource_size) {
        if (CHECKS) {
            check(resource_list, 1);
            check(resource_size, 1);
        }
        return nspvc_resources_get_resource_list_for_type(resources, type, memAddress(resource_list), memAddress(resource_size));
    }

    // --- [ spvc_resources_get_builtin_resource_list_for_type ] ---

    public static int nspvc_resources_get_builtin_resource_list_for_type(long resources, int type, long resource_list, long resource_size) {
        long __functionAddress = Functions.resources_get_builtin_resource_list_for_type;
        if (CHECKS) {
            check(resources);
        }
        return invokePPPI(resources, type, resource_list, resource_size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_resources_get_builtin_resource_list_for_type(@NativeType("spvc_resources") long resources, @NativeType("spvc_builtin_resource_type") int type, @NativeType("spvc_reflected_builtin_resource const **") PointerBuffer resource_list, @NativeType("size_t *") PointerBuffer resource_size) {
        if (CHECKS) {
            check(resource_list, 1);
            check(resource_size, 1);
        }
        return nspvc_resources_get_builtin_resource_list_for_type(resources, type, memAddress(resource_list), memAddress(resource_size));
    }

    // --- [ spvc_compiler_set_decoration ] ---

    /** Decorations. Maps to C++ API. */
    public static void spvc_compiler_set_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int") int argument) {
        long __functionAddress = Functions.compiler_set_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, decoration, argument, __functionAddress);
    }

    // --- [ spvc_compiler_set_decoration_string ] ---

    public static void nspvc_compiler_set_decoration_string(long compiler, int id, int decoration, long argument) {
        long __functionAddress = Functions.compiler_set_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, decoration, argument, __functionAddress);
    }

    public static void spvc_compiler_set_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_decoration_string(compiler, id, decoration, memAddress(argument));
    }

    public static void spvc_compiler_set_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_decoration_string(compiler, id, decoration, argumentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_set_name ] ---

    public static void nspvc_compiler_set_name(long compiler, int id, long argument) {
        long __functionAddress = Functions.compiler_set_name;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, argument, __functionAddress);
    }

    public static void spvc_compiler_set_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_name(compiler, id, memAddress(argument));
    }

    public static void spvc_compiler_set_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_name(compiler, id, argumentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_set_member_decoration ] ---

    public static void spvc_compiler_set_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int") int argument) {
        long __functionAddress = Functions.compiler_set_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, member_index, decoration, argument, __functionAddress);
    }

    // --- [ spvc_compiler_set_member_decoration_string ] ---

    public static void nspvc_compiler_set_member_decoration_string(long compiler, int id, int member_index, int decoration, long argument) {
        long __functionAddress = Functions.compiler_set_member_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, member_index, decoration, argument, __functionAddress);
    }

    public static void spvc_compiler_set_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_member_decoration_string(compiler, id, member_index, decoration, memAddress(argument));
    }

    public static void spvc_compiler_set_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_member_decoration_string(compiler, id, member_index, decoration, argumentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_set_member_name ] ---

    public static void nspvc_compiler_set_member_name(long compiler, int id, int member_index, long argument) {
        long __functionAddress = Functions.compiler_set_member_name;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, member_index, argument, __functionAddress);
    }

    public static void spvc_compiler_set_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_member_name(compiler, id, member_index, memAddress(argument));
    }

    public static void spvc_compiler_set_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_member_name(compiler, id, member_index, argumentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_unset_decoration ] ---

    public static void spvc_compiler_unset_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_unset_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_unset_member_decoration ] ---

    public static void spvc_compiler_unset_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_unset_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, member_index, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_has_decoration ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_has_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_has_member_decoration ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_has_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, member_index, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_get_name ] ---

    public static long nspvc_compiler_get_name(long compiler, int id) {
        long __functionAddress = Functions.compiler_get_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id) {
        long __result = nspvc_compiler_get_name(compiler, id);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_decoration ] ---

    @NativeType("unsigned int")
    public static int spvc_compiler_get_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_get_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_get_decoration_string ] ---

    public static long nspvc_compiler_get_decoration_string(long compiler, int id, int decoration) {
        long __functionAddress = Functions.compiler_get_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, decoration, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __result = nspvc_compiler_get_decoration_string(compiler, id, decoration);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_member_decoration ] ---

    @NativeType("unsigned int")
    public static int spvc_compiler_get_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_get_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, member_index, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_get_member_decoration_string ] ---

    public static long nspvc_compiler_get_member_decoration_string(long compiler, int id, int member_index, int decoration) {
        long __functionAddress = Functions.compiler_get_member_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, member_index, decoration, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __result = nspvc_compiler_get_member_decoration_string(compiler, id, member_index, decoration);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_member_name ] ---

    public static long nspvc_compiler_get_member_name(long compiler, int id, int member_index) {
        long __functionAddress = Functions.compiler_get_member_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, member_index, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index) {
        long __result = nspvc_compiler_get_member_name(compiler, id, member_index);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_entry_points ] ---

    /** Unsafe version of: {@link #spvc_compiler_get_entry_points compiler_get_entry_points} */
    public static int nspvc_compiler_get_entry_points(long compiler, long entry_points, long num_entry_points) {
        long __functionAddress = Functions.compiler_get_entry_points;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, entry_points, num_entry_points, __functionAddress);
    }

    /** Entry points. Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_entry_points(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_entry_point const **") PointerBuffer entry_points, @NativeType("size_t *") PointerBuffer num_entry_points) {
        if (CHECKS) {
            check(entry_points, 1);
            check(num_entry_points, 1);
        }
        return nspvc_compiler_get_entry_points(compiler, memAddress(entry_points), memAddress(num_entry_points));
    }

    // --- [ spvc_compiler_set_entry_point ] ---

    public static int nspvc_compiler_set_entry_point(long compiler, long name, int model) {
        long __functionAddress = Functions.compiler_set_entry_point;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, name, model, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer name, @NativeType("SpvExecutionModel") int model) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nspvc_compiler_set_entry_point(compiler, memAddress(name), model);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence name, @NativeType("SpvExecutionModel") int model) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nspvc_compiler_set_entry_point(compiler, nameEncoded, model);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_rename_entry_point ] ---

    public static int nspvc_compiler_rename_entry_point(long compiler, long old_name, long new_name, int model) {
        long __functionAddress = Functions.compiler_rename_entry_point;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, old_name, new_name, model, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer old_name, @NativeType("char const *") ByteBuffer new_name, @NativeType("SpvExecutionModel") int model) {
        if (CHECKS) {
            checkNT1(old_name);
            checkNT1(new_name);
        }
        return nspvc_compiler_rename_entry_point(compiler, memAddress(old_name), memAddress(new_name), model);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence old_name, @NativeType("char const *") CharSequence new_name, @NativeType("SpvExecutionModel") int model) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(old_name, true);
            long old_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(new_name, true);
            long new_nameEncoded = stack.getPointerAddress();
            return nspvc_compiler_rename_entry_point(compiler, old_nameEncoded, new_nameEncoded, model);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_get_cleansed_entry_point_name ] ---

    public static long nspvc_compiler_get_cleansed_entry_point_name(long compiler, long name, int model) {
        long __functionAddress = Functions.compiler_get_cleansed_entry_point_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPP(compiler, name, model, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_cleansed_entry_point_name(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer name, @NativeType("SpvExecutionModel") int model) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nspvc_compiler_get_cleansed_entry_point_name(compiler, memAddress(name), model);
        return memUTF8Safe(__result);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_cleansed_entry_point_name(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence name, @NativeType("SpvExecutionModel") int model) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nspvc_compiler_get_cleansed_entry_point_name(compiler, nameEncoded, model);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spvc_compiler_set_execution_mode ] ---

    public static void spvc_compiler_set_execution_mode(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_set_execution_mode;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, mode, __functionAddress);
    }

    // --- [ spvc_compiler_unset_execution_mode ] ---

    public static void spvc_compiler_unset_execution_mode(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_unset_execution_mode;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, mode, __functionAddress);
    }

    // --- [ spvc_compiler_set_execution_mode_with_arguments ] ---

    public static void spvc_compiler_set_execution_mode_with_arguments(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode, @NativeType("unsigned int") int arg0, @NativeType("unsigned int") int arg1, @NativeType("unsigned int") int arg2) {
        long __functionAddress = Functions.compiler_set_execution_mode_with_arguments;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, mode, arg0, arg1, arg2, __functionAddress);
    }

    // --- [ spvc_compiler_get_execution_modes ] ---

    public static int nspvc_compiler_get_execution_modes(long compiler, long modes, long num_modes) {
        long __functionAddress = Functions.compiler_get_execution_modes;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, modes, num_modes, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_execution_modes(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode const **") PointerBuffer modes, @NativeType("size_t *") PointerBuffer num_modes) {
        if (CHECKS) {
            check(modes, 1);
            check(num_modes, 1);
        }
        return nspvc_compiler_get_execution_modes(compiler, memAddress(modes), memAddress(num_modes));
    }

    // --- [ spvc_compiler_get_execution_mode_argument ] ---

    @NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_get_execution_mode_argument;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, mode, __functionAddress);
    }

    // --- [ spvc_compiler_get_execution_mode_argument_by_index ] ---

    @NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument_by_index(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.compiler_get_execution_mode_argument_by_index;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, mode, index, __functionAddress);
    }

    // --- [ spvc_compiler_get_execution_model ] ---

    @NativeType("SpvExecutionModel")
    public static int spvc_compiler_get_execution_model(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_execution_model;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_update_active_builtins ] ---

    public static void spvc_compiler_update_active_builtins(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_update_active_builtins;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_has_active_builtin ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_active_builtin(@NativeType("spvc_compiler") long compiler, @NativeType("SpvBuiltIn") int builtin, @NativeType("SpvStorageClass") int storage) {
        long __functionAddress = Functions.compiler_has_active_builtin;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, builtin, storage, __functionAddress);
    }

    // --- [ spvc_compiler_get_type_handle ] ---

    /** Type query interface. Maps to C++ API, except it's read-only. */
    @NativeType("spvc_type")
    public static long spvc_compiler_get_type_handle(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id) {
        long __functionAddress = Functions.compiler_get_type_handle;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    // --- [ spvc_type_get_base_type_id ] ---

    /**
     * Pulls out {@code SPIRType::self}.
     * 
     * <p>This effectively gives the type ID without array or pointer qualifiers. This is necessary when reflecting decoration/name information on members of a
     * struct, which are placed in the base type, not the qualified type. This is similar to {@code spvc_reflected_resource::base_type_id}.</p>
     */
    @NativeType("spvc_type_id")
    public static int spvc_type_get_base_type_id(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_base_type_id;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_basetype ] ---

    @NativeType("spvc_basetype")
    public static int spvc_type_get_basetype(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_basetype;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_bit_width ] ---

    @NativeType("unsigned int")
    public static int spvc_type_get_bit_width(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_bit_width;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_vector_size ] ---

    @NativeType("unsigned int")
    public static int spvc_type_get_vector_size(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_vector_size;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_columns ] ---

    @NativeType("unsigned int")
    public static int spvc_type_get_columns(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_columns;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_num_array_dimensions ] ---

    @NativeType("unsigned int")
    public static int spvc_type_get_num_array_dimensions(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_num_array_dimensions;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_array_dimension_is_literal ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_type_array_dimension_is_literal(@NativeType("spvc_type") long type, @NativeType("unsigned int") int dimension) {
        long __functionAddress = Functions.type_array_dimension_is_literal;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, dimension, __functionAddress);
    }

    // --- [ spvc_type_get_array_dimension ] ---

    @NativeType("SpvId")
    public static int spvc_type_get_array_dimension(@NativeType("spvc_type") long type, @NativeType("unsigned int") int dimension) {
        long __functionAddress = Functions.type_get_array_dimension;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, dimension, __functionAddress);
    }

    // --- [ spvc_type_get_num_member_types ] ---

    @NativeType("unsigned int")
    public static int spvc_type_get_num_member_types(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_num_member_types;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_member_type ] ---

    @NativeType("spvc_type_id")
    public static int spvc_type_get_member_type(@NativeType("spvc_type") long type, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.type_get_member_type;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, index, __functionAddress);
    }

    // --- [ spvc_type_get_storage_class ] ---

    @NativeType("SpvStorageClass")
    public static int spvc_type_get_storage_class(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_storage_class;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_sampled_type ] ---

    /** Image type query. */
    @NativeType("spvc_type_id")
    public static int spvc_type_get_image_sampled_type(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_sampled_type;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_dimension ] ---

    @NativeType("SpvDim")
    public static int spvc_type_get_image_dimension(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_dimension;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_is_depth ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_depth(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_is_depth;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_arrayed ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_arrayed(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_arrayed;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_multisampled ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_multisampled(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_multisampled;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_is_storage ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_storage(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_is_storage;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_storage_format ] ---

    @NativeType("SpvImageFormat")
    public static int spvc_type_get_image_storage_format(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_storage_format;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_access_qualifier ] ---

    @NativeType("SpvAccessQualifier")
    public static int spvc_type_get_image_access_qualifier(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_access_qualifier;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_compiler_get_declared_struct_size ] ---

    /** Unsafe version of: {@link #spvc_compiler_get_declared_struct_size compiler_get_declared_struct_size} */
    public static int nspvc_compiler_get_declared_struct_size(long compiler, long struct_type, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_size;
        if (CHECKS) {
            check(compiler);
            check(struct_type);
        }
        return invokePPPI(compiler, struct_type, size, __functionAddress);
    }

    /** Buffer layout query. Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long struct_type, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nspvc_compiler_get_declared_struct_size(compiler, struct_type, memAddress(size));
    }

    // --- [ spvc_compiler_get_declared_struct_size_runtime_array ] ---

    public static int nspvc_compiler_get_declared_struct_size_runtime_array(long compiler, long struct_type, long array_size, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_size_runtime_array;
        if (CHECKS) {
            check(compiler);
            check(struct_type);
        }
        return invokePPPPI(compiler, struct_type, array_size, size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size_runtime_array(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long struct_type, @NativeType("size_t") long array_size, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nspvc_compiler_get_declared_struct_size_runtime_array(compiler, struct_type, array_size, memAddress(size));
    }

    // --- [ spvc_compiler_get_declared_struct_member_size ] ---

    public static int nspvc_compiler_get_declared_struct_member_size(long compiler, long type, int index, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_member_size;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_member_size(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nspvc_compiler_get_declared_struct_member_size(compiler, type, index, memAddress(size));
    }

    // --- [ spvc_compiler_type_struct_member_offset ] ---

    public static int nspvc_compiler_type_struct_member_offset(long compiler, long type, int index, long offset) {
        long __functionAddress = Functions.compiler_type_struct_member_offset;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, offset, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_offset(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer offset) {
        if (CHECKS) {
            check(offset, 1);
        }
        return nspvc_compiler_type_struct_member_offset(compiler, type, index, memAddress(offset));
    }

    // --- [ spvc_compiler_type_struct_member_array_stride ] ---

    public static int nspvc_compiler_type_struct_member_array_stride(long compiler, long type, int index, long stride) {
        long __functionAddress = Functions.compiler_type_struct_member_array_stride;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, stride, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_array_stride(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer stride) {
        if (CHECKS) {
            check(stride, 1);
        }
        return nspvc_compiler_type_struct_member_array_stride(compiler, type, index, memAddress(stride));
    }

    // --- [ spvc_compiler_type_struct_member_matrix_stride ] ---

    public static int nspvc_compiler_type_struct_member_matrix_stride(long compiler, long type, int index, long stride) {
        long __functionAddress = Functions.compiler_type_struct_member_matrix_stride;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, stride, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_matrix_stride(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer stride) {
        if (CHECKS) {
            check(stride, 1);
        }
        return nspvc_compiler_type_struct_member_matrix_stride(compiler, type, index, memAddress(stride));
    }

    // --- [ spvc_compiler_build_dummy_sampler_for_combined_images ] ---

    /** Unsafe version of: {@link #spvc_compiler_build_dummy_sampler_for_combined_images compiler_build_dummy_sampler_for_combined_images} */
    public static int nspvc_compiler_build_dummy_sampler_for_combined_images(long compiler, long id) {
        long __functionAddress = Functions.compiler_build_dummy_sampler_for_combined_images;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, id, __functionAddress);
    }

    /** Workaround helper functions. Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_build_dummy_sampler_for_combined_images(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id *") IntBuffer id) {
        if (CHECKS) {
            check(id, 1);
        }
        return nspvc_compiler_build_dummy_sampler_for_combined_images(compiler, memAddress(id));
    }

    // --- [ spvc_compiler_build_combined_image_samplers ] ---

    @NativeType("spvc_result")
    public static int spvc_compiler_build_combined_image_samplers(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_build_combined_image_samplers;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_get_combined_image_samplers ] ---

    public static int nspvc_compiler_get_combined_image_samplers(long compiler, long samplers, long num_samplers) {
        long __functionAddress = Functions.compiler_get_combined_image_samplers;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, samplers, num_samplers, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_combined_image_samplers(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_combined_image_sampler const **") PointerBuffer samplers, @NativeType("size_t *") PointerBuffer num_samplers) {
        if (CHECKS) {
            check(samplers, 1);
            check(num_samplers, 1);
        }
        return nspvc_compiler_get_combined_image_samplers(compiler, memAddress(samplers), memAddress(num_samplers));
    }

    // --- [ spvc_compiler_get_specialization_constants ] ---

    /** Unsafe version of: {@link #spvc_compiler_get_specialization_constants compiler_get_specialization_constants} */
    public static int nspvc_compiler_get_specialization_constants(long compiler, long constants, long num_constants) {
        long __functionAddress = Functions.compiler_get_specialization_constants;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, constants, num_constants, __functionAddress);
    }

    /** Constants Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_specialization_constants(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_specialization_constant const **") PointerBuffer constants, @NativeType("size_t *") PointerBuffer num_constants) {
        if (CHECKS) {
            check(constants, 1);
            check(num_constants, 1);
        }
        return nspvc_compiler_get_specialization_constants(compiler, memAddress(constants), memAddress(num_constants));
    }

    // --- [ spvc_compiler_get_constant_handle ] ---

    @NativeType("spvc_constant")
    public static long spvc_compiler_get_constant_handle(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_constant_id") int id) {
        long __functionAddress = Functions.compiler_get_constant_handle;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_get_work_group_size_specialization_constants ] ---

    public static int nspvc_compiler_get_work_group_size_specialization_constants(long compiler, long x, long y, long z) {
        long __functionAddress = Functions.compiler_get_work_group_size_specialization_constants;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPI(compiler, x, y, z, __functionAddress);
    }

    @NativeType("spvc_constant_id")
    public static int spvc_compiler_get_work_group_size_specialization_constants(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant x, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant y, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant z) {
        return nspvc_compiler_get_work_group_size_specialization_constants(compiler, x.address(), y.address(), z.address());
    }

    // --- [ spvc_compiler_get_active_buffer_ranges ] ---

    /** Unsafe version of: {@link #spvc_compiler_get_active_buffer_ranges compiler_get_active_buffer_ranges} */
    public static int nspvc_compiler_get_active_buffer_ranges(long compiler, int id, long ranges, long num_ranges) {
        long __functionAddress = Functions.compiler_get_active_buffer_ranges;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, id, ranges, num_ranges, __functionAddress);
    }

    /** Buffer ranges Maps to C++ API. */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_active_buffer_ranges(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_buffer_range const **") PointerBuffer ranges, @NativeType("size_t *") PointerBuffer num_ranges) {
        if (CHECKS) {
            check(ranges, 1);
            check(num_ranges, 1);
        }
        return nspvc_compiler_get_active_buffer_ranges(compiler, id, memAddress(ranges), memAddress(num_ranges));
    }

    // --- [ spvc_constant_get_scalar_fp16 ] ---

    /**
     * No stdint.h until C99, sigh :( For smaller types, the result is sign or zero-extended as appropriate. Maps to C++ API. TODO: The SPIRConstant query
     * interface and modification interface is not quite complete.
     */
    public static float spvc_constant_get_scalar_fp16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp16;
        if (CHECKS) {
            check(constant);
        }
        return invokePF(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_fp32 ] ---

    public static float spvc_constant_get_scalar_fp32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp32;
        if (CHECKS) {
            check(constant);
        }
        return invokePF(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_fp64 ] ---

    public static double spvc_constant_get_scalar_fp64(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp64;
        if (CHECKS) {
            check(constant);
        }
        return invokePD(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_u32 ] ---

    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u32;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i32 ] ---

    public static int spvc_constant_get_scalar_i32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i32;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_u16 ] ---

    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u16;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i16 ] ---

    public static int spvc_constant_get_scalar_i16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i16;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_u8 ] ---

    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u8(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u8;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i8 ] ---

    public static int spvc_constant_get_scalar_i8(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i8;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_subconstants ] ---

    public static void nspvc_constant_get_subconstants(long constant, long constituents, long count) {
        long __functionAddress = Functions.constant_get_subconstants;
        if (CHECKS) {
            check(constant);
        }
        invokePPPV(constant, constituents, count, __functionAddress);
    }

    public static void spvc_constant_get_subconstants(@NativeType("spvc_constant") long constant, @NativeType("spvc_constant_id const **") PointerBuffer constituents, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(constituents, 1);
            check(count, 1);
        }
        nspvc_constant_get_subconstants(constant, memAddress(constituents), memAddress(count));
    }

    // --- [ spvc_constant_get_type ] ---

    @NativeType("spvc_type_id")
    public static int spvc_constant_get_type(@NativeType("spvc_constant") long constant) {
        long __functionAddress = Functions.constant_get_type;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, __functionAddress);
    }

    // --- [ spvc_compiler_get_binary_offset_for_decoration ] ---

    /** Unsafe version of: {@link #spvc_compiler_get_binary_offset_for_decoration compiler_get_binary_offset_for_decoration} */
    public static boolean nspvc_compiler_get_binary_offset_for_decoration(long compiler, int id, int decoration, long word_offset) {
        long __functionAddress = Functions.compiler_get_binary_offset_for_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPZ(compiler, id, decoration, word_offset, __functionAddress);
    }

    /** Misc reflection Maps to C++ API. */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_get_binary_offset_for_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int *") IntBuffer word_offset) {
        if (CHECKS) {
            check(word_offset, 1);
        }
        return nspvc_compiler_get_binary_offset_for_decoration(compiler, id, decoration, memAddress(word_offset));
    }

    // --- [ spvc_compiler_buffer_is_hlsl_counter_buffer ] ---

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_is_hlsl_counter_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_buffer_is_hlsl_counter_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_buffer_get_hlsl_counter_buffer ] ---

    public static boolean nspvc_compiler_buffer_get_hlsl_counter_buffer(long compiler, int id, long counter_id) {
        long __functionAddress = Functions.compiler_buffer_get_hlsl_counter_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPZ(compiler, id, counter_id, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_get_hlsl_counter_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_variable_id *") IntBuffer counter_id) {
        if (CHECKS) {
            check(counter_id, 1);
        }
        return nspvc_compiler_buffer_get_hlsl_counter_buffer(compiler, id, memAddress(counter_id));
    }

    // --- [ spvc_compiler_get_declared_capabilities ] ---

    public static int nspvc_compiler_get_declared_capabilities(long compiler, long capabilities, long num_capabilities) {
        long __functionAddress = Functions.compiler_get_declared_capabilities;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, capabilities, num_capabilities, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_capabilities(@NativeType("spvc_compiler") long compiler, @NativeType("SpvCapability const **") PointerBuffer capabilities, @NativeType("size_t *") PointerBuffer num_capabilities) {
        if (CHECKS) {
            check(capabilities, 1);
            check(num_capabilities, 1);
        }
        return nspvc_compiler_get_declared_capabilities(compiler, memAddress(capabilities), memAddress(num_capabilities));
    }

    // --- [ spvc_compiler_get_declared_extensions ] ---

    public static int nspvc_compiler_get_declared_extensions(long compiler, long extensions, long num_extensions) {
        long __functionAddress = Functions.compiler_get_declared_extensions;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, extensions, num_extensions, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_extensions(@NativeType("spvc_compiler") long compiler, @NativeType("char const ***") PointerBuffer extensions, @NativeType("size_t *") PointerBuffer num_extensions) {
        if (CHECKS) {
            check(extensions, 1);
            check(num_extensions, 1);
        }
        return nspvc_compiler_get_declared_extensions(compiler, memAddress(extensions), memAddress(num_extensions));
    }

    // --- [ spvc_compiler_get_remapped_declared_block_name ] ---

    public static long nspvc_compiler_get_remapped_declared_block_name(long compiler, int id) {
        long __functionAddress = Functions.compiler_get_remapped_declared_block_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String spvc_compiler_get_remapped_declared_block_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __result = nspvc_compiler_get_remapped_declared_block_name(compiler, id);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_buffer_block_decorations ] ---

    public static int nspvc_compiler_get_buffer_block_decorations(long compiler, int id, long decorations, long num_decorations) {
        long __functionAddress = Functions.compiler_get_buffer_block_decorations;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, id, decorations, num_decorations, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_buffer_block_decorations(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("SpvDecoration const **") PointerBuffer decorations, @NativeType("size_t *") PointerBuffer num_decorations) {
        if (CHECKS) {
            check(decorations, 1);
            check(num_decorations, 1);
        }
        return nspvc_compiler_get_buffer_block_decorations(compiler, id, memAddress(decorations), memAddress(num_decorations));
    }

}