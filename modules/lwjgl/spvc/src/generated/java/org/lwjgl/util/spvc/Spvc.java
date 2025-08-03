/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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
            msl_shader_interface_var_init                         = apiGetFunctionAddress(SPVC, "spvc_msl_shader_interface_var_init"),
            msl_shader_input_init                                 = apiGetFunctionAddress(SPVC, "spvc_msl_shader_input_init"),
            msl_shader_interface_var_init_2                       = apiGetFunctionAddress(SPVC, "spvc_msl_shader_interface_var_init_2"),
            msl_resource_binding_init                             = apiGetFunctionAddress(SPVC, "spvc_msl_resource_binding_init"),
            msl_resource_binding_init_2                           = apiGetFunctionAddress(SPVC, "spvc_msl_resource_binding_init_2"),
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
            compiler_get_num_required_extensions                  = apiGetFunctionAddress(SPVC, "spvc_compiler_get_num_required_extensions"),
            compiler_get_required_extension                       = apiGetFunctionAddress(SPVC, "spvc_compiler_get_required_extension"),
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
            compiler_msl_add_resource_binding_2                   = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_resource_binding_2"),
            compiler_msl_add_shader_input                         = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_shader_input"),
            compiler_msl_add_shader_input_2                       = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_shader_input_2"),
            compiler_msl_add_shader_output                        = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_shader_output"),
            compiler_msl_add_shader_output_2                      = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_shader_output_2"),
            compiler_msl_add_discrete_descriptor_set              = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_add_discrete_descriptor_set"),
            compiler_msl_set_argument_buffer_device_address_space = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_set_argument_buffer_device_address_space"),
            compiler_msl_is_vertex_attribute_used                 = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_vertex_attribute_used"),
            compiler_msl_is_shader_input_used                     = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_shader_input_used"),
            compiler_msl_is_shader_output_used                    = apiGetFunctionAddress(SPVC, "spvc_compiler_msl_is_shader_output_used"),
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
            constant_get_scalar_u64                               = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_u64"),
            constant_get_scalar_i64                               = apiGetFunctionAddress(SPVC, "spvc_constant_get_scalar_i64"),
            constant_get_type                                     = apiGetFunctionAddress(SPVC, "spvc_constant_get_type"),
            constant_set_scalar_fp16                              = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_fp16"),
            constant_set_scalar_fp32                              = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_fp32"),
            constant_set_scalar_fp64                              = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_fp64"),
            constant_set_scalar_u32                               = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_u32"),
            constant_set_scalar_i32                               = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_i32"),
            constant_set_scalar_u64                               = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_u64"),
            constant_set_scalar_i64                               = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_i64"),
            constant_set_scalar_u16                               = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_u16"),
            constant_set_scalar_i16                               = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_i16"),
            constant_set_scalar_u8                                = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_u8"),
            constant_set_scalar_i8                                = apiGetFunctionAddress(SPVC, "spvc_constant_set_scalar_i8"),
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

    public static final int
        SPVC_C_API_VERSION_MAJOR = 0,
        SPVC_C_API_VERSION_MINOR = 67,
        SPVC_C_API_VERSION_PATCH = 0;

    public static final int
        SPVC_COMPILER_OPTION_COMMON_BIT = 0x1000000,
        SPVC_COMPILER_OPTION_GLSL_BIT   = 0x2000000,
        SPVC_COMPILER_OPTION_HLSL_BIT   = 0x4000000,
        SPVC_COMPILER_OPTION_MSL_BIT    = 0x8000000,
        SPVC_COMPILER_OPTION_LANG_BITS  = 0xF000000,
        SPVC_COMPILER_OPTION_ENUM_BITS  = 0xFFFFFF;

    public static final int
        SPVC_MSL_PUSH_CONSTANT_DESC_SET     = ~0,
        SPVC_MSL_PUSH_CONSTANT_BINDING      = 0,
        SPVC_MSL_SWIZZLE_BUFFER_BINDING     = ~1,
        SPVC_MSL_BUFFER_SIZE_BUFFER_BINDING = ~2,
        SPVC_MSL_ARGUMENT_BUFFER_BINDING    = ~3;

    public static final int SPVC_MSL_AUX_BUFFER_STRUCT_VERSION = 0x1;

    public static final int
        SPVC_SUCCESS                 = 0,
        SPVC_ERROR_INVALID_SPIRV     = -1,
        SPVC_ERROR_UNSUPPORTED_SPIRV = -2,
        SPVC_ERROR_OUT_OF_MEMORY     = -3,
        SPVC_ERROR_INVALID_ARGUMENT  = -4;

    public static final int
        SPVC_CAPTURE_MODE_COPY           = 0,
        SPVC_CAPTURE_MODE_TAKE_OWNERSHIP = 1;

    public static final int
        SPVC_BACKEND_NONE = 0,
        SPVC_BACKEND_GLSL = 1,
        SPVC_BACKEND_HLSL = 2,
        SPVC_BACKEND_MSL  = 3,
        SPVC_BACKEND_CPP  = 4,
        SPVC_BACKEND_JSON = 5;

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
        SPVC_RESOURCE_TYPE_RAY_QUERY              = 13,
        SPVC_RESOURCE_TYPE_SHADER_RECORD_BUFFER   = 14,
        SPVC_RESOURCE_TYPE_GL_PLAIN_UNIFORM       = 15,
        SPVC_RESOURCE_TYPE_TENSOR                 = 16;

    public static final int
        SPVC_BUILTIN_RESOURCE_TYPE_UNKNOWN      = 0,
        SPVC_BUILTIN_RESOURCE_TYPE_STAGE_INPUT  = 1,
        SPVC_BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT = 2;

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

    public static final int
        SPVC_MSL_PLATFORM_IOS   = 0,
        SPVC_MSL_PLATFORM_MACOS = 1;

    public static final int
        SPVC_MSL_INDEX_TYPE_NONE   = 0,
        SPVC_MSL_INDEX_TYPE_UINT16 = 1,
        SPVC_MSL_INDEX_TYPE_UINT32 = 2;

    public static final int
        SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER  = 0,
        SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8  = 1,
        SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16 = 2,
        SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY16  = 3,
        SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY32  = 4;

    public static final int
        SPVC_MSL_VERTEX_FORMAT_OTHER  = SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER,
        SPVC_MSL_VERTEX_FORMAT_UINT8  = SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8,
        SPVC_MSL_VERTEX_FORMAT_UINT16 = SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16;

    public static final int
        SPVC_MSL_SHADER_INPUT_FORMAT_OTHER  = SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER,
        SPVC_MSL_SHADER_INPUT_FORMAT_UINT8  = SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8,
        SPVC_MSL_SHADER_INPUT_FORMAT_UINT16 = SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16,
        SPVC_MSL_SHADER_INPUT_FORMAT_ANY16  = SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY16,
        SPVC_MSL_SHADER_INPUT_FORMAT_ANY32  = SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY32;

    public static final int
        SPVC_MSL_SHADER_VARIABLE_RATE_PER_VERTEX    = 0,
        SPVC_MSL_SHADER_VARIABLE_RATE_PER_PRIMITIVE = 1,
        SPVC_MSL_SHADER_VARIABLE_RATE_PER_PATCH     = 2;

    public static final int
        SPVC_MSL_SAMPLER_COORD_NORMALIZED = 0,
        SPVC_MSL_SAMPLER_COORD_PIXEL      = 1;

    public static final int
        SPVC_MSL_SAMPLER_FILTER_NEAREST = 0,
        SPVC_MSL_SAMPLER_FILTER_LINEAR  = 1;

    public static final int
        SPVC_MSL_SAMPLER_MIP_FILTER_NONE    = 0,
        SPVC_MSL_SAMPLER_MIP_FILTER_NEAREST = 1,
        SPVC_MSL_SAMPLER_MIP_FILTER_LINEAR  = 2;

    public static final int
        SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO   = 0,
        SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE   = 1,
        SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER = 2,
        SPVC_MSL_SAMPLER_ADDRESS_REPEAT          = 3,
        SPVC_MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT = 4;

    public static final int
        SPVC_MSL_SAMPLER_COMPARE_FUNC_NEVER         = 0,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS          = 1,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL    = 2,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER       = 3,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL = 4,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_EQUAL         = 5,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL     = 6,
        SPVC_MSL_SAMPLER_COMPARE_FUNC_ALWAYS        = 7;

    public static final int
        SPVC_MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK = 0,
        SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK      = 1,
        SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE      = 2;

    public static final int
        SPVC_MSL_FORMAT_RESOLUTION_444 = 0,
        SPVC_MSL_FORMAT_RESOLUTION_422 = 1,
        SPVC_MSL_FORMAT_RESOLUTION_420 = 2;

    public static final int
        SPVC_MSL_CHROMA_LOCATION_COSITED_EVEN = 0,
        SPVC_MSL_CHROMA_LOCATION_MIDPOINT     = 1;

    public static final int
        SPVC_MSL_COMPONENT_SWIZZLE_IDENTITY = 0,
        SPVC_MSL_COMPONENT_SWIZZLE_ZERO     = 1,
        SPVC_MSL_COMPONENT_SWIZZLE_ONE      = 2,
        SPVC_MSL_COMPONENT_SWIZZLE_R        = 3,
        SPVC_MSL_COMPONENT_SWIZZLE_G        = 4,
        SPVC_MSL_COMPONENT_SWIZZLE_B        = 5,
        SPVC_MSL_COMPONENT_SWIZZLE_A        = 6;

    public static final int
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY   = 0,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709   = 2,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601   = 3,
        SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020  = 4;

    public static final int
        SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_FULL   = 0,
        SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;

    public static final int
        SPVC_HLSL_BINDING_AUTO_NONE_BIT          = 0,
        SPVC_HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT = 1 << 0,
        SPVC_HLSL_BINDING_AUTO_CBV_BIT           = 1 << 1,
        SPVC_HLSL_BINDING_AUTO_SRV_BIT           = 1 << 2,
        SPVC_HLSL_BINDING_AUTO_UAV_BIT           = 1 << 3,
        SPVC_HLSL_BINDING_AUTO_SAMPLER_BIT       = 1 << 4,
        SPVC_HLSL_BINDING_AUTO_ALL               = 0x7FFFFFFF;

    public static final int SPVC_HLSL_PUSH_CONSTANT_DESC_SET = ~0;

    public static final int SPVC_HLSL_PUSH_CONSTANT_BINDING = 0;

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
        SPVC_COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT                  = 77 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_RELAX_NAN_CHECKS                               = 78 | SPVC_COMPILER_OPTION_COMMON_BIT,
        SPVC_COMPILER_OPTION_MSL_RAW_BUFFER_TESE_INPUT                      = 79 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_INPUT_BUFFER_INDEX            = 80 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_MANUAL_HELPER_INVOCATION_UPDATES           = 81 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_CHECK_DISCARDED_FRAG_STORES                = 82 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_GLSL_ENABLE_ROW_MAJOR_LOAD_WORKAROUND          = 83 | SPVC_COMPILER_OPTION_GLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS_TIER                      = 84 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_SAMPLE_DREF_LOD_ARRAY_AS_GRAD              = 85 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_READWRITE_TEXTURE_FENCES                   = 86 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_REPLACE_RECURSIVE_INPUTS                   = 87 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_AGX_MANUAL_CUBE_GRAD_FIXUP                 = 88 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_FORCE_FRAGMENT_WITH_SIDE_EFFECTS_EXECUTION = 89 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_USE_ENTRY_POINT_NAME                      = 90 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_HLSL_PRESERVE_STRUCTURED_BUFFERS               = 91 | SPVC_COMPILER_OPTION_HLSL_BIT,
        SPVC_COMPILER_OPTION_MSL_AUTO_DISABLE_RASTERIZATION                 = 92 | SPVC_COMPILER_OPTION_MSL_BIT,
        SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_DEFAULT                  = 93 | SPVC_COMPILER_OPTION_MSL_BIT;

    protected Spvc() {
        throw new UnsupportedOperationException();
    }

    // --- [ spvc_get_version ] ---

    /** {@code void spvc_get_version(unsigned int * major, unsigned int * minor, unsigned int * patch)} */
    public static void nspvc_get_version(long major, long minor, long patch) {
        long __functionAddress = Functions.get_version;
        invokePPPV(major, minor, patch, __functionAddress);
    }

    /** {@code void spvc_get_version(unsigned int * major, unsigned int * minor, unsigned int * patch)} */
    public static void spvc_get_version(@NativeType("unsigned int *") IntBuffer major, @NativeType("unsigned int *") IntBuffer minor, @NativeType("unsigned int *") IntBuffer patch) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
            check(patch, 1);
        }
        nspvc_get_version(memAddress(major), memAddress(minor), memAddress(patch));
    }

    // --- [ spvc_get_commit_revision_and_timestamp ] ---

    /** {@code char const * spvc_get_commit_revision_and_timestamp(void)} */
    public static long nspvc_get_commit_revision_and_timestamp() {
        long __functionAddress = Functions.get_commit_revision_and_timestamp;
        return invokeP(__functionAddress);
    }

    /** {@code char const * spvc_get_commit_revision_and_timestamp(void)} */
    @NativeType("char const *")
    public static @Nullable String spvc_get_commit_revision_and_timestamp() {
        long __result = nspvc_get_commit_revision_and_timestamp();
        return memUTF8Safe(__result);
    }

    // --- [ spvc_msl_vertex_attribute_init ] ---

    /** {@code void spvc_msl_vertex_attribute_init(spvc_msl_vertex_attribute * attr)} */
    public static void nspvc_msl_vertex_attribute_init(long attr) {
        long __functionAddress = Functions.msl_vertex_attribute_init;
        invokePV(attr, __functionAddress);
    }

    /** {@code void spvc_msl_vertex_attribute_init(spvc_msl_vertex_attribute * attr)} */
    public static void spvc_msl_vertex_attribute_init(@NativeType("spvc_msl_vertex_attribute *") SpvcMslVertexAttribute attr) {
        nspvc_msl_vertex_attribute_init(attr.address());
    }

    // --- [ spvc_msl_shader_interface_var_init ] ---

    /** {@code void spvc_msl_shader_interface_var_init(spvc_msl_shader_interface_var * var)} */
    public static void nspvc_msl_shader_interface_var_init(long var) {
        long __functionAddress = Functions.msl_shader_interface_var_init;
        invokePV(var, __functionAddress);
    }

    /** {@code void spvc_msl_shader_interface_var_init(spvc_msl_shader_interface_var * var)} */
    public static void spvc_msl_shader_interface_var_init(@NativeType("spvc_msl_shader_interface_var *") SpvcMslShaderInterfaceVar var) {
        nspvc_msl_shader_interface_var_init(var.address());
    }

    // --- [ spvc_msl_shader_input_init ] ---

    /** {@code void spvc_msl_shader_input_init(spvc_msl_shader_input * input)} */
    public static void nspvc_msl_shader_input_init(long input) {
        long __functionAddress = Functions.msl_shader_input_init;
        invokePV(input, __functionAddress);
    }

    /** {@code void spvc_msl_shader_input_init(spvc_msl_shader_input * input)} */
    public static void spvc_msl_shader_input_init(@NativeType("spvc_msl_shader_input *") SpvcMslShaderInput input) {
        nspvc_msl_shader_input_init(input.address());
    }

    // --- [ spvc_msl_shader_interface_var_init_2 ] ---

    /** {@code void spvc_msl_shader_interface_var_init_2(spvc_msl_shader_interface_var_2 * var)} */
    public static void nspvc_msl_shader_interface_var_init_2(long var) {
        long __functionAddress = Functions.msl_shader_interface_var_init_2;
        invokePV(var, __functionAddress);
    }

    /** {@code void spvc_msl_shader_interface_var_init_2(spvc_msl_shader_interface_var_2 * var)} */
    public static void spvc_msl_shader_interface_var_init_2(@NativeType("spvc_msl_shader_interface_var_2 *") SpvcMslShaderInterfaceVar2 var) {
        nspvc_msl_shader_interface_var_init_2(var.address());
    }

    // --- [ spvc_msl_resource_binding_init ] ---

    /** {@code void spvc_msl_resource_binding_init(spvc_msl_resource_binding * binding)} */
    public static void nspvc_msl_resource_binding_init(long binding) {
        long __functionAddress = Functions.msl_resource_binding_init;
        invokePV(binding, __functionAddress);
    }

    /** {@code void spvc_msl_resource_binding_init(spvc_msl_resource_binding * binding)} */
    public static void spvc_msl_resource_binding_init(@NativeType("spvc_msl_resource_binding *") SpvcMslResourceBinding binding) {
        nspvc_msl_resource_binding_init(binding.address());
    }

    // --- [ spvc_msl_resource_binding_init_2 ] ---

    /** {@code void spvc_msl_resource_binding_init_2(spvc_msl_resource_binding_2 * binding)} */
    public static void nspvc_msl_resource_binding_init_2(long binding) {
        long __functionAddress = Functions.msl_resource_binding_init_2;
        invokePV(binding, __functionAddress);
    }

    /** {@code void spvc_msl_resource_binding_init_2(spvc_msl_resource_binding_2 * binding)} */
    public static void spvc_msl_resource_binding_init_2(@NativeType("spvc_msl_resource_binding_2 *") SpvcMslResourceBinding2 binding) {
        nspvc_msl_resource_binding_init_2(binding.address());
    }

    // --- [ spvc_msl_get_aux_buffer_struct_version ] ---

    /** {@code unsigned int spvc_msl_get_aux_buffer_struct_version(void)} */
    @NativeType("unsigned int")
    public static int spvc_msl_get_aux_buffer_struct_version() {
        long __functionAddress = Functions.msl_get_aux_buffer_struct_version;
        return invokeI(__functionAddress);
    }

    // --- [ spvc_msl_constexpr_sampler_init ] ---

    /** {@code void spvc_msl_constexpr_sampler_init(spvc_msl_constexpr_sampler * sampler)} */
    public static void nspvc_msl_constexpr_sampler_init(long sampler) {
        long __functionAddress = Functions.msl_constexpr_sampler_init;
        invokePV(sampler, __functionAddress);
    }

    /** {@code void spvc_msl_constexpr_sampler_init(spvc_msl_constexpr_sampler * sampler)} */
    public static void spvc_msl_constexpr_sampler_init(@NativeType("spvc_msl_constexpr_sampler *") SpvcMslConstexprSampler sampler) {
        nspvc_msl_constexpr_sampler_init(sampler.address());
    }

    // --- [ spvc_msl_sampler_ycbcr_conversion_init ] ---

    /** {@code void spvc_msl_sampler_ycbcr_conversion_init(spvc_msl_sampler_ycbcr_conversion * conv)} */
    public static void nspvc_msl_sampler_ycbcr_conversion_init(long conv) {
        long __functionAddress = Functions.msl_sampler_ycbcr_conversion_init;
        invokePV(conv, __functionAddress);
    }

    /** {@code void spvc_msl_sampler_ycbcr_conversion_init(spvc_msl_sampler_ycbcr_conversion * conv)} */
    public static void spvc_msl_sampler_ycbcr_conversion_init(@NativeType("spvc_msl_sampler_ycbcr_conversion *") SpvcMslSamplerYcbcrConversion conv) {
        nspvc_msl_sampler_ycbcr_conversion_init(conv.address());
    }

    // --- [ spvc_hlsl_resource_binding_init ] ---

    /** {@code void spvc_hlsl_resource_binding_init(spvc_hlsl_resource_binding * binding)} */
    public static void nspvc_hlsl_resource_binding_init(long binding) {
        long __functionAddress = Functions.hlsl_resource_binding_init;
        invokePV(binding, __functionAddress);
    }

    /** {@code void spvc_hlsl_resource_binding_init(spvc_hlsl_resource_binding * binding)} */
    public static void spvc_hlsl_resource_binding_init(@NativeType("spvc_hlsl_resource_binding *") SpvcHLSLResourceBinding binding) {
        nspvc_hlsl_resource_binding_init(binding.address());
    }

    // --- [ spvc_context_create ] ---

    /** {@code spvc_result spvc_context_create(spvc_context * context)} */
    public static int nspvc_context_create(long context) {
        long __functionAddress = Functions.context_create;
        return invokePI(context, __functionAddress);
    }

    /** {@code spvc_result spvc_context_create(spvc_context * context)} */
    @NativeType("spvc_result")
    public static int spvc_context_create(@NativeType("spvc_context *") PointerBuffer context) {
        if (CHECKS) {
            check(context, 1);
        }
        return nspvc_context_create(memAddress(context));
    }

    // --- [ spvc_context_destroy ] ---

    /** {@code void spvc_context_destroy(spvc_context context)} */
    public static void spvc_context_destroy(@NativeType("spvc_context") long context) {
        long __functionAddress = Functions.context_destroy;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ spvc_context_release_allocations ] ---

    /** {@code void spvc_context_release_allocations(spvc_context context)} */
    public static void spvc_context_release_allocations(@NativeType("spvc_context") long context) {
        long __functionAddress = Functions.context_release_allocations;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ spvc_context_get_last_error_string ] ---

    /** {@code char const * spvc_context_get_last_error_string(spvc_context context)} */
    public static long nspvc_context_get_last_error_string(long context) {
        long __functionAddress = Functions.context_get_last_error_string;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    /** {@code char const * spvc_context_get_last_error_string(spvc_context context)} */
    @NativeType("char const *")
    public static @Nullable String spvc_context_get_last_error_string(@NativeType("spvc_context") long context) {
        long __result = nspvc_context_get_last_error_string(context);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_context_set_error_callback ] ---

    /** {@code void spvc_context_set_error_callback(spvc_context context, spvc_error_callback cb, void * userdata)} */
    public static void nspvc_context_set_error_callback(long context, long cb, long userdata) {
        long __functionAddress = Functions.context_set_error_callback;
        if (CHECKS) {
            check(context);
        }
        invokePPPV(context, cb, userdata, __functionAddress);
    }

    /** {@code void spvc_context_set_error_callback(spvc_context context, spvc_error_callback cb, void * userdata)} */
    public static void spvc_context_set_error_callback(@NativeType("spvc_context") long context, @NativeType("spvc_error_callback") SpvcErrorCallbackI cb, @NativeType("void *") long userdata) {
        nspvc_context_set_error_callback(context, cb.address(), userdata);
    }

    // --- [ spvc_context_parse_spirv ] ---

    /** {@code spvc_result spvc_context_parse_spirv(spvc_context context, SpvId const * spirv, size_t word_count, spvc_parsed_ir * parsed_ir)} */
    public static int nspvc_context_parse_spirv(long context, long spirv, long word_count, long parsed_ir) {
        long __functionAddress = Functions.context_parse_spirv;
        if (CHECKS) {
            check(context);
        }
        return invokePPPPI(context, spirv, word_count, parsed_ir, __functionAddress);
    }

    /** {@code spvc_result spvc_context_parse_spirv(spvc_context context, SpvId const * spirv, size_t word_count, spvc_parsed_ir * parsed_ir)} */
    @NativeType("spvc_result")
    public static int spvc_context_parse_spirv(@NativeType("spvc_context") long context, @NativeType("SpvId const *") IntBuffer spirv, @NativeType("size_t") long word_count, @NativeType("spvc_parsed_ir *") PointerBuffer parsed_ir) {
        if (CHECKS) {
            check(spirv, 1);
            check(parsed_ir, 1);
        }
        return nspvc_context_parse_spirv(context, memAddress(spirv), word_count, memAddress(parsed_ir));
    }

    // --- [ spvc_context_create_compiler ] ---

    /** {@code spvc_result spvc_context_create_compiler(spvc_context context, spvc_backend backend, spvc_parsed_ir parsed_ir, spvc_capture_mode mode, spvc_compiler * compiler)} */
    public static int nspvc_context_create_compiler(long context, int backend, long parsed_ir, int mode, long compiler) {
        long __functionAddress = Functions.context_create_compiler;
        if (CHECKS) {
            check(context);
            check(parsed_ir);
        }
        return invokePPPI(context, backend, parsed_ir, mode, compiler, __functionAddress);
    }

    /** {@code spvc_result spvc_context_create_compiler(spvc_context context, spvc_backend backend, spvc_parsed_ir parsed_ir, spvc_capture_mode mode, spvc_compiler * compiler)} */
    @NativeType("spvc_result")
    public static int spvc_context_create_compiler(@NativeType("spvc_context") long context, @NativeType("spvc_backend") int backend, @NativeType("spvc_parsed_ir") long parsed_ir, @NativeType("spvc_capture_mode") int mode, @NativeType("spvc_compiler *") PointerBuffer compiler) {
        if (CHECKS) {
            check(compiler, 1);
        }
        return nspvc_context_create_compiler(context, backend, parsed_ir, mode, memAddress(compiler));
    }

    // --- [ spvc_compiler_get_current_id_bound ] ---

    /** {@code unsigned int spvc_compiler_get_current_id_bound(spvc_compiler compiler)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_get_current_id_bound(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_current_id_bound;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_create_compiler_options ] ---

    /** {@code spvc_result spvc_compiler_create_compiler_options(spvc_compiler compiler, spvc_compiler_options * options)} */
    public static int nspvc_compiler_create_compiler_options(long compiler, long options) {
        long __functionAddress = Functions.compiler_create_compiler_options;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, options, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_create_compiler_options(spvc_compiler compiler, spvc_compiler_options * options)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_create_compiler_options(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_compiler_options *") PointerBuffer options) {
        if (CHECKS) {
            check(options, 1);
        }
        return nspvc_compiler_create_compiler_options(compiler, memAddress(options));
    }

    // --- [ spvc_compiler_options_set_bool ] ---

    /** {@code spvc_result spvc_compiler_options_set_bool(spvc_compiler_options options, spvc_compiler_option option, spvc_bool value)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_options_set_bool(@NativeType("spvc_compiler_options") long options, @NativeType("spvc_compiler_option") int option, @NativeType("spvc_bool") boolean value) {
        long __functionAddress = Functions.compiler_options_set_bool;
        if (CHECKS) {
            check(options);
        }
        return invokePI(options, option, value, __functionAddress);
    }

    // --- [ spvc_compiler_options_set_uint ] ---

    /** {@code spvc_result spvc_compiler_options_set_uint(spvc_compiler_options options, spvc_compiler_option option, unsigned int value)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_options_set_uint(@NativeType("spvc_compiler_options") long options, @NativeType("spvc_compiler_option") int option, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.compiler_options_set_uint;
        if (CHECKS) {
            check(options);
        }
        return invokePI(options, option, value, __functionAddress);
    }

    // --- [ spvc_compiler_install_compiler_options ] ---

    /** {@code spvc_result spvc_compiler_install_compiler_options(spvc_compiler compiler, spvc_compiler_options options)} */
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

    /** {@code spvc_result spvc_compiler_compile(spvc_compiler compiler, char const ** source)} */
    public static int nspvc_compiler_compile(long compiler, long source) {
        long __functionAddress = Functions.compiler_compile;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, source, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_compile(spvc_compiler compiler, char const ** source)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_compile(@NativeType("spvc_compiler") long compiler, @NativeType("char const **") PointerBuffer source) {
        if (CHECKS) {
            check(source, 1);
        }
        return nspvc_compiler_compile(compiler, memAddress(source));
    }

    // --- [ spvc_compiler_add_header_line ] ---

    /** {@code spvc_result spvc_compiler_add_header_line(spvc_compiler compiler, char const * line)} */
    public static int nspvc_compiler_add_header_line(long compiler, long line) {
        long __functionAddress = Functions.compiler_add_header_line;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, line, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_add_header_line(spvc_compiler compiler, char const * line)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer line) {
        if (CHECKS) {
            checkNT1(line);
        }
        return nspvc_compiler_add_header_line(compiler, memAddress(line));
    }

    /** {@code spvc_result spvc_compiler_add_header_line(spvc_compiler compiler, char const * line)} */
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

    /** {@code spvc_result spvc_compiler_require_extension(spvc_compiler compiler, char const * ext)} */
    public static int nspvc_compiler_require_extension(long compiler, long ext) {
        long __functionAddress = Functions.compiler_require_extension;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, ext, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_require_extension(spvc_compiler compiler, char const * ext)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer ext) {
        if (CHECKS) {
            checkNT1(ext);
        }
        return nspvc_compiler_require_extension(compiler, memAddress(ext));
    }

    /** {@code spvc_result spvc_compiler_require_extension(spvc_compiler compiler, char const * ext)} */
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

    // --- [ spvc_compiler_get_num_required_extensions ] ---

    /** {@code size_t spvc_compiler_get_num_required_extensions(spvc_compiler compiler)} */
    @NativeType("size_t")
    public static long spvc_compiler_get_num_required_extensions(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_num_required_extensions;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_get_required_extension ] ---

    /** {@code char const * spvc_compiler_get_required_extension(spvc_compiler compiler, size_t index)} */
    public static long nspvc_compiler_get_required_extension(long compiler, long index) {
        long __functionAddress = Functions.compiler_get_required_extension;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPP(compiler, index, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_required_extension(spvc_compiler compiler, size_t index)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_required_extension(@NativeType("spvc_compiler") long compiler, @NativeType("size_t") long index) {
        long __result = nspvc_compiler_get_required_extension(compiler, index);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_flatten_buffer_block ] ---

    /** {@code spvc_result spvc_compiler_flatten_buffer_block(spvc_compiler compiler, spvc_variable_id id)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_flatten_buffer_block(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_flatten_buffer_block;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_variable_is_depth_or_compare ] ---

    /** {@code spvc_bool spvc_compiler_variable_is_depth_or_compare(spvc_compiler compiler, spvc_variable_id id)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_variable_is_depth_or_compare(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_variable_is_depth_or_compare;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_mask_stage_output_by_location ] ---

    /** {@code spvc_result spvc_compiler_mask_stage_output_by_location(spvc_compiler compiler, unsigned location, unsigned component)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_location(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location, @NativeType("unsigned") int component) {
        long __functionAddress = Functions.compiler_mask_stage_output_by_location;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, location, component, __functionAddress);
    }

    // --- [ spvc_compiler_mask_stage_output_by_builtin ] ---

    /** {@code spvc_result spvc_compiler_mask_stage_output_by_builtin(spvc_compiler compiler, SpvBuiltIn builtin)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_builtin(@NativeType("spvc_compiler") long compiler, @NativeType("SpvBuiltIn") int builtin) {
        long __functionAddress = Functions.compiler_mask_stage_output_by_builtin;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, builtin, __functionAddress);
    }

    // --- [ spvc_compiler_hlsl_set_root_constants_layout ] ---

    /** {@code spvc_result spvc_compiler_hlsl_set_root_constants_layout(spvc_compiler compiler, spvc_hlsl_root_constants const * constant_info, size_t count)} */
    public static int nspvc_compiler_hlsl_set_root_constants_layout(long compiler, long constant_info, long count) {
        long __functionAddress = Functions.compiler_hlsl_set_root_constants_layout;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, constant_info, count, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_hlsl_set_root_constants_layout(spvc_compiler compiler, spvc_hlsl_root_constants const * constant_info, size_t count)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_root_constants_layout(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_root_constants const *") SpvcHlslRootConstants constant_info, @NativeType("size_t") long count) {
        return nspvc_compiler_hlsl_set_root_constants_layout(compiler, constant_info.address(), count);
    }

    // --- [ spvc_compiler_hlsl_add_vertex_attribute_remap ] ---

    /** {@code spvc_result spvc_compiler_hlsl_add_vertex_attribute_remap(spvc_compiler compiler, spvc_hlsl_vertex_attribute_remap const * remap, size_t remaps)} */
    public static int nspvc_compiler_hlsl_add_vertex_attribute_remap(long compiler, long remap, long remaps) {
        long __functionAddress = Functions.compiler_hlsl_add_vertex_attribute_remap;
        if (CHECKS) {
            check(compiler);
            SpvcHlslVertexAttributeRemap.validate(remap);
        }
        return invokePPPI(compiler, remap, remaps, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_hlsl_add_vertex_attribute_remap(spvc_compiler compiler, spvc_hlsl_vertex_attribute_remap const * remap, size_t remaps)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_vertex_attribute_remap(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_vertex_attribute_remap const *") SpvcHlslVertexAttributeRemap remap, @NativeType("size_t") long remaps) {
        return nspvc_compiler_hlsl_add_vertex_attribute_remap(compiler, remap.address(), remaps);
    }

    // --- [ spvc_compiler_hlsl_remap_num_workgroups_builtin ] ---

    /** {@code spvc_variable_id spvc_compiler_hlsl_remap_num_workgroups_builtin(spvc_compiler compiler)} */
    @NativeType("spvc_variable_id")
    public static int spvc_compiler_hlsl_remap_num_workgroups_builtin(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_hlsl_remap_num_workgroups_builtin;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_hlsl_set_resource_binding_flags ] ---

    /** {@code spvc_result spvc_compiler_hlsl_set_resource_binding_flags(spvc_compiler compiler, spvc_hlsl_binding_flags flags)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_resource_binding_flags(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_binding_flags") int flags) {
        long __functionAddress = Functions.compiler_hlsl_set_resource_binding_flags;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, flags, __functionAddress);
    }

    // --- [ spvc_compiler_hlsl_add_resource_binding ] ---

    /** {@code spvc_result spvc_compiler_hlsl_add_resource_binding(spvc_compiler compiler, spvc_hlsl_resource_binding const * binding)} */
    public static int nspvc_compiler_hlsl_add_resource_binding(long compiler, long binding) {
        long __functionAddress = Functions.compiler_hlsl_add_resource_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, binding, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_hlsl_add_resource_binding(spvc_compiler compiler, spvc_hlsl_resource_binding const * binding)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_resource_binding const *") SpvcHLSLResourceBinding binding) {
        return nspvc_compiler_hlsl_add_resource_binding(compiler, binding.address());
    }

    // --- [ spvc_compiler_hlsl_is_resource_used ] ---

    /** {@code spvc_bool spvc_compiler_hlsl_is_resource_used(spvc_compiler compiler, SpvExecutionModel model, unsigned set, unsigned binding)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_hlsl_is_resource_used(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionModel") int model, @NativeType("unsigned") int set, @NativeType("unsigned") int binding) {
        long __functionAddress = Functions.compiler_hlsl_is_resource_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, model, set, binding, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_rasterization_disabled ] ---

    /** {@code spvc_bool spvc_compiler_msl_is_rasterization_disabled(spvc_compiler compiler)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_rasterization_disabled(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_is_rasterization_disabled;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_swizzle_buffer ] ---

    /** {@code spvc_bool spvc_compiler_msl_needs_swizzle_buffer(spvc_compiler compiler)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_swizzle_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_swizzle_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_buffer_size_buffer ] ---

    /** {@code spvc_bool spvc_compiler_msl_needs_buffer_size_buffer(spvc_compiler compiler)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_buffer_size_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_buffer_size_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_output_buffer ] ---

    /** {@code spvc_bool spvc_compiler_msl_needs_output_buffer(spvc_compiler compiler)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_output_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_output_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_patch_output_buffer ] ---

    /** {@code spvc_bool spvc_compiler_msl_needs_patch_output_buffer(spvc_compiler compiler)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_patch_output_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_patch_output_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_needs_input_threadgroup_mem ] ---

    /** {@code spvc_bool spvc_compiler_msl_needs_input_threadgroup_mem(spvc_compiler compiler)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_input_threadgroup_mem(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_input_threadgroup_mem;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_msl_add_vertex_attribute ] ---

    /** {@code spvc_result spvc_compiler_msl_add_vertex_attribute(spvc_compiler compiler, spvc_msl_vertex_attribute const * attrs)} */
    public static int nspvc_compiler_msl_add_vertex_attribute(long compiler, long attrs) {
        long __functionAddress = Functions.compiler_msl_add_vertex_attribute;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, attrs, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_vertex_attribute(spvc_compiler compiler, spvc_msl_vertex_attribute const * attrs)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_vertex_attribute(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_vertex_attribute const *") SpvcMslVertexAttribute attrs) {
        return nspvc_compiler_msl_add_vertex_attribute(compiler, attrs.address());
    }

    // --- [ spvc_compiler_msl_add_resource_binding ] ---

    /** {@code spvc_result spvc_compiler_msl_add_resource_binding(spvc_compiler compiler, spvc_msl_resource_binding const * binding)} */
    public static int nspvc_compiler_msl_add_resource_binding(long compiler, long binding) {
        long __functionAddress = Functions.compiler_msl_add_resource_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, binding, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_resource_binding(spvc_compiler compiler, spvc_msl_resource_binding const * binding)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_resource_binding const *") SpvcMslResourceBinding binding) {
        return nspvc_compiler_msl_add_resource_binding(compiler, binding.address());
    }

    // --- [ spvc_compiler_msl_add_resource_binding_2 ] ---

    /** {@code spvc_result spvc_compiler_msl_add_resource_binding_2(spvc_compiler compiler, spvc_msl_resource_binding_2 const * binding)} */
    public static int nspvc_compiler_msl_add_resource_binding_2(long compiler, long binding) {
        long __functionAddress = Functions.compiler_msl_add_resource_binding_2;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, binding, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_resource_binding_2(spvc_compiler compiler, spvc_msl_resource_binding_2 const * binding)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding_2(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_resource_binding_2 const *") SpvcMslResourceBinding2 binding) {
        return nspvc_compiler_msl_add_resource_binding_2(compiler, binding.address());
    }

    // --- [ spvc_compiler_msl_add_shader_input ] ---

    /** {@code spvc_result spvc_compiler_msl_add_shader_input(spvc_compiler compiler, spvc_msl_shader_interface_var const * input)} */
    public static int nspvc_compiler_msl_add_shader_input(long compiler, long input) {
        long __functionAddress = Functions.compiler_msl_add_shader_input;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, input, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_shader_input(spvc_compiler compiler, spvc_msl_shader_interface_var const * input)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var const *") SpvcMslShaderInterfaceVar input) {
        return nspvc_compiler_msl_add_shader_input(compiler, input.address());
    }

    // --- [ spvc_compiler_msl_add_shader_input_2 ] ---

    /** {@code spvc_result spvc_compiler_msl_add_shader_input_2(spvc_compiler compiler, spvc_msl_shader_interface_var_2 const * input)} */
    public static int nspvc_compiler_msl_add_shader_input_2(long compiler, long input) {
        long __functionAddress = Functions.compiler_msl_add_shader_input_2;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, input, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_shader_input_2(spvc_compiler compiler, spvc_msl_shader_interface_var_2 const * input)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input_2(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var_2 const *") SpvcMslShaderInterfaceVar2 input) {
        return nspvc_compiler_msl_add_shader_input_2(compiler, input.address());
    }

    // --- [ spvc_compiler_msl_add_shader_output ] ---

    /** {@code spvc_result spvc_compiler_msl_add_shader_output(spvc_compiler compiler, spvc_msl_shader_interface_var const * output)} */
    public static int nspvc_compiler_msl_add_shader_output(long compiler, long output) {
        long __functionAddress = Functions.compiler_msl_add_shader_output;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, output, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_shader_output(spvc_compiler compiler, spvc_msl_shader_interface_var const * output)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_output(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var const *") SpvcMslShaderInterfaceVar output) {
        return nspvc_compiler_msl_add_shader_output(compiler, output.address());
    }

    // --- [ spvc_compiler_msl_add_shader_output_2 ] ---

    /** {@code spvc_result spvc_compiler_msl_add_shader_output_2(spvc_compiler compiler, spvc_msl_shader_interface_var_2 const * output)} */
    public static int nspvc_compiler_msl_add_shader_output_2(long compiler, long output) {
        long __functionAddress = Functions.compiler_msl_add_shader_output_2;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, output, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_add_shader_output_2(spvc_compiler compiler, spvc_msl_shader_interface_var_2 const * output)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_output_2(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var_2 const *") SpvcMslShaderInterfaceVar2 output) {
        return nspvc_compiler_msl_add_shader_output_2(compiler, output.address());
    }

    // --- [ spvc_compiler_msl_add_discrete_descriptor_set ] ---

    /** {@code spvc_result spvc_compiler_msl_add_discrete_descriptor_set(spvc_compiler compiler, unsigned int desc_set)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_discrete_descriptor_set(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set) {
        long __functionAddress = Functions.compiler_msl_add_discrete_descriptor_set;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, __functionAddress);
    }

    // --- [ spvc_compiler_msl_set_argument_buffer_device_address_space ] ---

    /** {@code spvc_result spvc_compiler_msl_set_argument_buffer_device_address_space(spvc_compiler compiler, unsigned desc_set, spvc_bool device_address)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_argument_buffer_device_address_space(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int desc_set, @NativeType("spvc_bool") boolean device_address) {
        long __functionAddress = Functions.compiler_msl_set_argument_buffer_device_address_space;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, device_address, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_vertex_attribute_used ] ---

    /** {@code spvc_bool spvc_compiler_msl_is_vertex_attribute_used(spvc_compiler compiler, unsigned int location)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_vertex_attribute_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int location) {
        long __functionAddress = Functions.compiler_msl_is_vertex_attribute_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, location, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_shader_input_used ] ---

    /** {@code spvc_bool spvc_compiler_msl_is_shader_input_used(spvc_compiler compiler, unsigned location)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_input_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location) {
        long __functionAddress = Functions.compiler_msl_is_shader_input_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, location, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_shader_output_used ] ---

    /** {@code spvc_bool spvc_compiler_msl_is_shader_output_used(spvc_compiler compiler, unsigned location)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_output_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location) {
        long __functionAddress = Functions.compiler_msl_is_shader_output_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, location, __functionAddress);
    }

    // --- [ spvc_compiler_msl_is_resource_used ] ---

    /** {@code spvc_bool spvc_compiler_msl_is_resource_used(spvc_compiler compiler, SpvExecutionModel model, unsigned int set, unsigned int binding)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_resource_used(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionModel") int model, @NativeType("unsigned int") int set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.compiler_msl_is_resource_used;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, model, set, binding, __functionAddress);
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler ] ---

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler(spvc_compiler compiler, spvc_variable_id id, spvc_msl_constexpr_sampler const * sampler)} */
    public static int nspvc_compiler_msl_remap_constexpr_sampler(long compiler, int id, long sampler) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, id, sampler, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler(spvc_compiler compiler, spvc_variable_id id, spvc_msl_constexpr_sampler const * sampler)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler) {
        return nspvc_compiler_msl_remap_constexpr_sampler(compiler, id, sampler.address());
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler_by_binding ] ---

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler_by_binding(spvc_compiler compiler, unsigned int desc_set, unsigned int binding, spvc_msl_constexpr_sampler const * sampler)} */
    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding(long compiler, int desc_set, int binding, long sampler) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_by_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, desc_set, binding, sampler, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler_by_binding(spvc_compiler compiler, unsigned int desc_set, unsigned int binding, spvc_msl_constexpr_sampler const * sampler)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler) {
        return nspvc_compiler_msl_remap_constexpr_sampler_by_binding(compiler, desc_set, binding, sampler.address());
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler_ycbcr ] ---

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler_ycbcr(spvc_compiler compiler, spvc_variable_id id, spvc_msl_constexpr_sampler const * sampler, spvc_msl_sampler_ycbcr_conversion const * conv)} */
    public static int nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(long compiler, int id, long sampler, long conv) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_ycbcr;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, id, sampler, conv, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler_ycbcr(spvc_compiler compiler, spvc_variable_id id, spvc_msl_constexpr_sampler const * sampler, spvc_msl_sampler_ycbcr_conversion const * conv)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_ycbcr(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler, @NativeType("spvc_msl_sampler_ycbcr_conversion const *") SpvcMslSamplerYcbcrConversion conv) {
        return nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(compiler, id, sampler.address(), conv.address());
    }

    // --- [ spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr ] ---

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(spvc_compiler compiler, unsigned int desc_set, unsigned int binding, spvc_msl_constexpr_sampler const * sampler, spvc_msl_sampler_ycbcr_conversion const * conv)} */
    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(long compiler, int desc_set, int binding, long sampler, long conv) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_by_binding_ycbcr;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, desc_set, binding, sampler, conv, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(spvc_compiler compiler, unsigned int desc_set, unsigned int binding, spvc_msl_constexpr_sampler const * sampler, spvc_msl_sampler_ycbcr_conversion const * conv)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler, @NativeType("spvc_msl_sampler_ycbcr_conversion const *") SpvcMslSamplerYcbcrConversion conv) {
        return nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(compiler, desc_set, binding, sampler.address(), conv.address());
    }

    // --- [ spvc_compiler_msl_set_fragment_output_components ] ---

    /** {@code spvc_result spvc_compiler_msl_set_fragment_output_components(spvc_compiler compiler, unsigned int location, unsigned int components)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_fragment_output_components(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int location, @NativeType("unsigned int") int components) {
        long __functionAddress = Functions.compiler_msl_set_fragment_output_components;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, location, components, __functionAddress);
    }

    // --- [ spvc_compiler_msl_get_automatic_resource_binding ] ---

    /** {@code unsigned int spvc_compiler_msl_get_automatic_resource_binding(spvc_compiler compiler, spvc_variable_id id)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_msl_get_automatic_resource_binding;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_msl_get_automatic_resource_binding_secondary ] ---

    /** {@code unsigned int spvc_compiler_msl_get_automatic_resource_binding_secondary(spvc_compiler compiler, spvc_variable_id id)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding_secondary(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_msl_get_automatic_resource_binding_secondary;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_msl_add_dynamic_buffer ] ---

    /** {@code spvc_result spvc_compiler_msl_add_dynamic_buffer(spvc_compiler compiler, unsigned int desc_set, unsigned int binding, unsigned int index)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_dynamic_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.compiler_msl_add_dynamic_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, binding, index, __functionAddress);
    }

    // --- [ spvc_compiler_msl_add_inline_uniform_block ] ---

    /** {@code spvc_result spvc_compiler_msl_add_inline_uniform_block(spvc_compiler compiler, unsigned int desc_set, unsigned int binding)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_inline_uniform_block(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.compiler_msl_add_inline_uniform_block;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, desc_set, binding, __functionAddress);
    }

    // --- [ spvc_compiler_msl_set_combined_sampler_suffix ] ---

    /** {@code spvc_result spvc_compiler_msl_set_combined_sampler_suffix(spvc_compiler compiler, char const * suffix)} */
    public static int nspvc_compiler_msl_set_combined_sampler_suffix(long compiler, long suffix) {
        long __functionAddress = Functions.compiler_msl_set_combined_sampler_suffix;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, suffix, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_msl_set_combined_sampler_suffix(spvc_compiler compiler, char const * suffix)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer suffix) {
        if (CHECKS) {
            checkNT1(suffix);
        }
        return nspvc_compiler_msl_set_combined_sampler_suffix(compiler, memAddress(suffix));
    }

    /** {@code spvc_result spvc_compiler_msl_set_combined_sampler_suffix(spvc_compiler compiler, char const * suffix)} */
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

    /** {@code char const * spvc_compiler_msl_get_combined_sampler_suffix(spvc_compiler compiler)} */
    public static long nspvc_compiler_msl_get_combined_sampler_suffix(long compiler) {
        long __functionAddress = Functions.compiler_msl_get_combined_sampler_suffix;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, __functionAddress);
    }

    /** {@code char const * spvc_compiler_msl_get_combined_sampler_suffix(spvc_compiler compiler)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_msl_get_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler) {
        long __result = nspvc_compiler_msl_get_combined_sampler_suffix(compiler);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_active_interface_variables ] ---

    /** {@code spvc_result spvc_compiler_get_active_interface_variables(spvc_compiler compiler, spvc_set * set)} */
    public static int nspvc_compiler_get_active_interface_variables(long compiler, long set) {
        long __functionAddress = Functions.compiler_get_active_interface_variables;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, set, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_active_interface_variables(spvc_compiler compiler, spvc_set * set)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_active_interface_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_set *") PointerBuffer set) {
        if (CHECKS) {
            check(set, 1);
        }
        return nspvc_compiler_get_active_interface_variables(compiler, memAddress(set));
    }

    // --- [ spvc_compiler_set_enabled_interface_variables ] ---

    /** {@code spvc_result spvc_compiler_set_enabled_interface_variables(spvc_compiler compiler, spvc_set set)} */
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

    /** {@code spvc_result spvc_compiler_create_shader_resources(spvc_compiler compiler, spvc_resources * resources)} */
    public static int nspvc_compiler_create_shader_resources(long compiler, long resources) {
        long __functionAddress = Functions.compiler_create_shader_resources;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, resources, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_create_shader_resources(spvc_compiler compiler, spvc_resources * resources)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_resources *") PointerBuffer resources) {
        if (CHECKS) {
            check(resources, 1);
        }
        return nspvc_compiler_create_shader_resources(compiler, memAddress(resources));
    }

    // --- [ spvc_compiler_create_shader_resources_for_active_variables ] ---

    /** {@code spvc_result spvc_compiler_create_shader_resources_for_active_variables(spvc_compiler compiler, spvc_resources * resources, spvc_set active)} */
    public static int nspvc_compiler_create_shader_resources_for_active_variables(long compiler, long resources, long active) {
        long __functionAddress = Functions.compiler_create_shader_resources_for_active_variables;
        if (CHECKS) {
            check(compiler);
            check(active);
        }
        return invokePPPI(compiler, resources, active, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_create_shader_resources_for_active_variables(spvc_compiler compiler, spvc_resources * resources, spvc_set active)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources_for_active_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_resources *") PointerBuffer resources, @NativeType("spvc_set") long active) {
        if (CHECKS) {
            check(resources, 1);
        }
        return nspvc_compiler_create_shader_resources_for_active_variables(compiler, memAddress(resources), active);
    }

    // --- [ spvc_resources_get_resource_list_for_type ] ---

    /** {@code spvc_result spvc_resources_get_resource_list_for_type(spvc_resources resources, spvc_resource_type type, spvc_reflected_resource const ** resource_list, size_t * resource_size)} */
    public static int nspvc_resources_get_resource_list_for_type(long resources, int type, long resource_list, long resource_size) {
        long __functionAddress = Functions.resources_get_resource_list_for_type;
        if (CHECKS) {
            check(resources);
        }
        return invokePPPI(resources, type, resource_list, resource_size, __functionAddress);
    }

    /** {@code spvc_result spvc_resources_get_resource_list_for_type(spvc_resources resources, spvc_resource_type type, spvc_reflected_resource const ** resource_list, size_t * resource_size)} */
    @NativeType("spvc_result")
    public static int spvc_resources_get_resource_list_for_type(@NativeType("spvc_resources") long resources, @NativeType("spvc_resource_type") int type, @NativeType("spvc_reflected_resource const **") PointerBuffer resource_list, @NativeType("size_t *") PointerBuffer resource_size) {
        if (CHECKS) {
            check(resource_list, 1);
            check(resource_size, 1);
        }
        return nspvc_resources_get_resource_list_for_type(resources, type, memAddress(resource_list), memAddress(resource_size));
    }

    // --- [ spvc_resources_get_builtin_resource_list_for_type ] ---

    /** {@code spvc_result spvc_resources_get_builtin_resource_list_for_type(spvc_resources resources, spvc_builtin_resource_type type, spvc_reflected_builtin_resource const ** resource_list, size_t * resource_size)} */
    public static int nspvc_resources_get_builtin_resource_list_for_type(long resources, int type, long resource_list, long resource_size) {
        long __functionAddress = Functions.resources_get_builtin_resource_list_for_type;
        if (CHECKS) {
            check(resources);
        }
        return invokePPPI(resources, type, resource_list, resource_size, __functionAddress);
    }

    /** {@code spvc_result spvc_resources_get_builtin_resource_list_for_type(spvc_resources resources, spvc_builtin_resource_type type, spvc_reflected_builtin_resource const ** resource_list, size_t * resource_size)} */
    @NativeType("spvc_result")
    public static int spvc_resources_get_builtin_resource_list_for_type(@NativeType("spvc_resources") long resources, @NativeType("spvc_builtin_resource_type") int type, @NativeType("spvc_reflected_builtin_resource const **") PointerBuffer resource_list, @NativeType("size_t *") PointerBuffer resource_size) {
        if (CHECKS) {
            check(resource_list, 1);
            check(resource_size, 1);
        }
        return nspvc_resources_get_builtin_resource_list_for_type(resources, type, memAddress(resource_list), memAddress(resource_size));
    }

    // --- [ spvc_compiler_set_decoration ] ---

    /** {@code void spvc_compiler_set_decoration(spvc_compiler compiler, SpvId id, SpvDecoration decoration, unsigned int argument)} */
    public static void spvc_compiler_set_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int") int argument) {
        long __functionAddress = Functions.compiler_set_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, decoration, argument, __functionAddress);
    }

    // --- [ spvc_compiler_set_decoration_string ] ---

    /** {@code void spvc_compiler_set_decoration_string(spvc_compiler compiler, SpvId id, SpvDecoration decoration, char const * argument)} */
    public static void nspvc_compiler_set_decoration_string(long compiler, int id, int decoration, long argument) {
        long __functionAddress = Functions.compiler_set_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, decoration, argument, __functionAddress);
    }

    /** {@code void spvc_compiler_set_decoration_string(spvc_compiler compiler, SpvId id, SpvDecoration decoration, char const * argument)} */
    public static void spvc_compiler_set_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_decoration_string(compiler, id, decoration, memAddress(argument));
    }

    /** {@code void spvc_compiler_set_decoration_string(spvc_compiler compiler, SpvId id, SpvDecoration decoration, char const * argument)} */
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

    /** {@code void spvc_compiler_set_name(spvc_compiler compiler, SpvId id, char const * argument)} */
    public static void nspvc_compiler_set_name(long compiler, int id, long argument) {
        long __functionAddress = Functions.compiler_set_name;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, argument, __functionAddress);
    }

    /** {@code void spvc_compiler_set_name(spvc_compiler compiler, SpvId id, char const * argument)} */
    public static void spvc_compiler_set_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_name(compiler, id, memAddress(argument));
    }

    /** {@code void spvc_compiler_set_name(spvc_compiler compiler, SpvId id, char const * argument)} */
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

    /** {@code void spvc_compiler_set_member_decoration(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration, unsigned int argument)} */
    public static void spvc_compiler_set_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int") int argument) {
        long __functionAddress = Functions.compiler_set_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, member_index, decoration, argument, __functionAddress);
    }

    // --- [ spvc_compiler_set_member_decoration_string ] ---

    /** {@code void spvc_compiler_set_member_decoration_string(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration, char const * argument)} */
    public static void nspvc_compiler_set_member_decoration_string(long compiler, int id, int member_index, int decoration, long argument) {
        long __functionAddress = Functions.compiler_set_member_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, member_index, decoration, argument, __functionAddress);
    }

    /** {@code void spvc_compiler_set_member_decoration_string(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration, char const * argument)} */
    public static void spvc_compiler_set_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_member_decoration_string(compiler, id, member_index, decoration, memAddress(argument));
    }

    /** {@code void spvc_compiler_set_member_decoration_string(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration, char const * argument)} */
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

    /** {@code void spvc_compiler_set_member_name(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, char const * argument)} */
    public static void nspvc_compiler_set_member_name(long compiler, int id, int member_index, long argument) {
        long __functionAddress = Functions.compiler_set_member_name;
        if (CHECKS) {
            check(compiler);
        }
        invokePPV(compiler, id, member_index, argument, __functionAddress);
    }

    /** {@code void spvc_compiler_set_member_name(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, char const * argument)} */
    public static void spvc_compiler_set_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("char const *") ByteBuffer argument) {
        if (CHECKS) {
            checkNT1(argument);
        }
        nspvc_compiler_set_member_name(compiler, id, member_index, memAddress(argument));
    }

    /** {@code void spvc_compiler_set_member_name(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, char const * argument)} */
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

    /** {@code void spvc_compiler_unset_decoration(spvc_compiler compiler, SpvId id, SpvDecoration decoration)} */
    public static void spvc_compiler_unset_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_unset_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_unset_member_decoration ] ---

    /** {@code void spvc_compiler_unset_member_decoration(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration)} */
    public static void spvc_compiler_unset_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_unset_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, id, member_index, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_has_decoration ] ---

    /** {@code spvc_bool spvc_compiler_has_decoration(spvc_compiler compiler, SpvId id, SpvDecoration decoration)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_has_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_has_member_decoration ] ---

    /** {@code spvc_bool spvc_compiler_has_member_decoration(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_has_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, member_index, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_get_name ] ---

    /** {@code char const * spvc_compiler_get_name(spvc_compiler compiler, SpvId id)} */
    public static long nspvc_compiler_get_name(long compiler, int id) {
        long __functionAddress = Functions.compiler_get_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_name(spvc_compiler compiler, SpvId id)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id) {
        long __result = nspvc_compiler_get_name(compiler, id);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_decoration ] ---

    /** {@code unsigned int spvc_compiler_get_decoration(spvc_compiler compiler, SpvId id, SpvDecoration decoration)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_get_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_get_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_get_decoration_string ] ---

    /** {@code char const * spvc_compiler_get_decoration_string(spvc_compiler compiler, SpvId id, SpvDecoration decoration)} */
    public static long nspvc_compiler_get_decoration_string(long compiler, int id, int decoration) {
        long __functionAddress = Functions.compiler_get_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, decoration, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_decoration_string(spvc_compiler compiler, SpvId id, SpvDecoration decoration)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __result = nspvc_compiler_get_decoration_string(compiler, id, decoration);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_member_decoration ] ---

    /** {@code unsigned int spvc_compiler_get_member_decoration(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_get_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_get_member_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, id, member_index, decoration, __functionAddress);
    }

    // --- [ spvc_compiler_get_member_decoration_string ] ---

    /** {@code char const * spvc_compiler_get_member_decoration_string(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration)} */
    public static long nspvc_compiler_get_member_decoration_string(long compiler, int id, int member_index, int decoration) {
        long __functionAddress = Functions.compiler_get_member_decoration_string;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, member_index, decoration, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_member_decoration_string(spvc_compiler compiler, spvc_type_id id, unsigned int member_index, SpvDecoration decoration)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __result = nspvc_compiler_get_member_decoration_string(compiler, id, member_index, decoration);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_member_name ] ---

    /** {@code char const * spvc_compiler_get_member_name(spvc_compiler compiler, spvc_type_id id, unsigned int member_index)} */
    public static long nspvc_compiler_get_member_name(long compiler, int id, int member_index) {
        long __functionAddress = Functions.compiler_get_member_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, member_index, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_member_name(spvc_compiler compiler, spvc_type_id id, unsigned int member_index)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index) {
        long __result = nspvc_compiler_get_member_name(compiler, id, member_index);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_entry_points ] ---

    /** {@code spvc_result spvc_compiler_get_entry_points(spvc_compiler compiler, spvc_entry_point const ** entry_points, size_t * num_entry_points)} */
    public static int nspvc_compiler_get_entry_points(long compiler, long entry_points, long num_entry_points) {
        long __functionAddress = Functions.compiler_get_entry_points;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, entry_points, num_entry_points, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_entry_points(spvc_compiler compiler, spvc_entry_point const ** entry_points, size_t * num_entry_points)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_entry_points(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_entry_point const **") PointerBuffer entry_points, @NativeType("size_t *") PointerBuffer num_entry_points) {
        if (CHECKS) {
            check(entry_points, 1);
            check(num_entry_points, 1);
        }
        return nspvc_compiler_get_entry_points(compiler, memAddress(entry_points), memAddress(num_entry_points));
    }

    // --- [ spvc_compiler_set_entry_point ] ---

    /** {@code spvc_result spvc_compiler_set_entry_point(spvc_compiler compiler, char const * name, SpvExecutionModel model)} */
    public static int nspvc_compiler_set_entry_point(long compiler, long name, int model) {
        long __functionAddress = Functions.compiler_set_entry_point;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, name, model, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_set_entry_point(spvc_compiler compiler, char const * name, SpvExecutionModel model)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer name, @NativeType("SpvExecutionModel") int model) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nspvc_compiler_set_entry_point(compiler, memAddress(name), model);
    }

    /** {@code spvc_result spvc_compiler_set_entry_point(spvc_compiler compiler, char const * name, SpvExecutionModel model)} */
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

    /** {@code spvc_result spvc_compiler_rename_entry_point(spvc_compiler compiler, char const * old_name, char const * new_name, SpvExecutionModel model)} */
    public static int nspvc_compiler_rename_entry_point(long compiler, long old_name, long new_name, int model) {
        long __functionAddress = Functions.compiler_rename_entry_point;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, old_name, new_name, model, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_rename_entry_point(spvc_compiler compiler, char const * old_name, char const * new_name, SpvExecutionModel model)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer old_name, @NativeType("char const *") ByteBuffer new_name, @NativeType("SpvExecutionModel") int model) {
        if (CHECKS) {
            checkNT1(old_name);
            checkNT1(new_name);
        }
        return nspvc_compiler_rename_entry_point(compiler, memAddress(old_name), memAddress(new_name), model);
    }

    /** {@code spvc_result spvc_compiler_rename_entry_point(spvc_compiler compiler, char const * old_name, char const * new_name, SpvExecutionModel model)} */
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

    /** {@code char const * spvc_compiler_get_cleansed_entry_point_name(spvc_compiler compiler, char const * name, SpvExecutionModel model)} */
    public static long nspvc_compiler_get_cleansed_entry_point_name(long compiler, long name, int model) {
        long __functionAddress = Functions.compiler_get_cleansed_entry_point_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPP(compiler, name, model, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_cleansed_entry_point_name(spvc_compiler compiler, char const * name, SpvExecutionModel model)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_cleansed_entry_point_name(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer name, @NativeType("SpvExecutionModel") int model) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nspvc_compiler_get_cleansed_entry_point_name(compiler, memAddress(name), model);
        return memUTF8Safe(__result);
    }

    /** {@code char const * spvc_compiler_get_cleansed_entry_point_name(spvc_compiler compiler, char const * name, SpvExecutionModel model)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_cleansed_entry_point_name(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence name, @NativeType("SpvExecutionModel") int model) {
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

    /** {@code void spvc_compiler_set_execution_mode(spvc_compiler compiler, SpvExecutionMode mode)} */
    public static void spvc_compiler_set_execution_mode(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_set_execution_mode;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, mode, __functionAddress);
    }

    // --- [ spvc_compiler_unset_execution_mode ] ---

    /** {@code void spvc_compiler_unset_execution_mode(spvc_compiler compiler, SpvExecutionMode mode)} */
    public static void spvc_compiler_unset_execution_mode(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_unset_execution_mode;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, mode, __functionAddress);
    }

    // --- [ spvc_compiler_set_execution_mode_with_arguments ] ---

    /** {@code void spvc_compiler_set_execution_mode_with_arguments(spvc_compiler compiler, SpvExecutionMode mode, unsigned int arg0, unsigned int arg1, unsigned int arg2)} */
    public static void spvc_compiler_set_execution_mode_with_arguments(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode, @NativeType("unsigned int") int arg0, @NativeType("unsigned int") int arg1, @NativeType("unsigned int") int arg2) {
        long __functionAddress = Functions.compiler_set_execution_mode_with_arguments;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, mode, arg0, arg1, arg2, __functionAddress);
    }

    // --- [ spvc_compiler_get_execution_modes ] ---

    /** {@code spvc_result spvc_compiler_get_execution_modes(spvc_compiler compiler, SpvExecutionMode const ** modes, size_t * num_modes)} */
    public static int nspvc_compiler_get_execution_modes(long compiler, long modes, long num_modes) {
        long __functionAddress = Functions.compiler_get_execution_modes;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, modes, num_modes, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_execution_modes(spvc_compiler compiler, SpvExecutionMode const ** modes, size_t * num_modes)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_execution_modes(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode const **") PointerBuffer modes, @NativeType("size_t *") PointerBuffer num_modes) {
        if (CHECKS) {
            check(modes, 1);
            check(num_modes, 1);
        }
        return nspvc_compiler_get_execution_modes(compiler, memAddress(modes), memAddress(num_modes));
    }

    // --- [ spvc_compiler_get_execution_mode_argument ] ---

    /** {@code unsigned int spvc_compiler_get_execution_mode_argument(spvc_compiler compiler, SpvExecutionMode mode)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_get_execution_mode_argument;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, mode, __functionAddress);
    }

    // --- [ spvc_compiler_get_execution_mode_argument_by_index ] ---

    /** {@code unsigned int spvc_compiler_get_execution_mode_argument_by_index(spvc_compiler compiler, SpvExecutionMode mode, unsigned int index)} */
    @NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument_by_index(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.compiler_get_execution_mode_argument_by_index;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, mode, index, __functionAddress);
    }

    // --- [ spvc_compiler_get_execution_model ] ---

    /** {@code SpvExecutionModel spvc_compiler_get_execution_model(spvc_compiler compiler)} */
    @NativeType("SpvExecutionModel")
    public static int spvc_compiler_get_execution_model(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_execution_model;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_update_active_builtins ] ---

    /** {@code void spvc_compiler_update_active_builtins(spvc_compiler compiler)} */
    public static void spvc_compiler_update_active_builtins(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_update_active_builtins;
        if (CHECKS) {
            check(compiler);
        }
        invokePV(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_has_active_builtin ] ---

    /** {@code spvc_bool spvc_compiler_has_active_builtin(spvc_compiler compiler, SpvBuiltIn builtin, SpvStorageClass storage)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_active_builtin(@NativeType("spvc_compiler") long compiler, @NativeType("SpvBuiltIn") int builtin, @NativeType("SpvStorageClass") int storage) {
        long __functionAddress = Functions.compiler_has_active_builtin;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, builtin, storage, __functionAddress);
    }

    // --- [ spvc_compiler_get_type_handle ] ---

    /** {@code spvc_type spvc_compiler_get_type_handle(spvc_compiler compiler, spvc_type_id id)} */
    @NativeType("spvc_type")
    public static long spvc_compiler_get_type_handle(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id) {
        long __functionAddress = Functions.compiler_get_type_handle;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    // --- [ spvc_type_get_base_type_id ] ---

    /** {@code spvc_type_id spvc_type_get_base_type_id(spvc_type type)} */
    @NativeType("spvc_type_id")
    public static int spvc_type_get_base_type_id(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_base_type_id;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_basetype ] ---

    /** {@code spvc_basetype spvc_type_get_basetype(spvc_type type)} */
    @NativeType("spvc_basetype")
    public static int spvc_type_get_basetype(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_basetype;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_bit_width ] ---

    /** {@code unsigned int spvc_type_get_bit_width(spvc_type type)} */
    @NativeType("unsigned int")
    public static int spvc_type_get_bit_width(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_bit_width;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_vector_size ] ---

    /** {@code unsigned int spvc_type_get_vector_size(spvc_type type)} */
    @NativeType("unsigned int")
    public static int spvc_type_get_vector_size(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_vector_size;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_columns ] ---

    /** {@code unsigned int spvc_type_get_columns(spvc_type type)} */
    @NativeType("unsigned int")
    public static int spvc_type_get_columns(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_columns;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_num_array_dimensions ] ---

    /** {@code unsigned int spvc_type_get_num_array_dimensions(spvc_type type)} */
    @NativeType("unsigned int")
    public static int spvc_type_get_num_array_dimensions(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_num_array_dimensions;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_array_dimension_is_literal ] ---

    /** {@code spvc_bool spvc_type_array_dimension_is_literal(spvc_type type, unsigned int dimension)} */
    @NativeType("spvc_bool")
    public static boolean spvc_type_array_dimension_is_literal(@NativeType("spvc_type") long type, @NativeType("unsigned int") int dimension) {
        long __functionAddress = Functions.type_array_dimension_is_literal;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, dimension, __functionAddress);
    }

    // --- [ spvc_type_get_array_dimension ] ---

    /** {@code SpvId spvc_type_get_array_dimension(spvc_type type, unsigned int dimension)} */
    @NativeType("SpvId")
    public static int spvc_type_get_array_dimension(@NativeType("spvc_type") long type, @NativeType("unsigned int") int dimension) {
        long __functionAddress = Functions.type_get_array_dimension;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, dimension, __functionAddress);
    }

    // --- [ spvc_type_get_num_member_types ] ---

    /** {@code unsigned int spvc_type_get_num_member_types(spvc_type type)} */
    @NativeType("unsigned int")
    public static int spvc_type_get_num_member_types(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_num_member_types;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_member_type ] ---

    /** {@code spvc_type_id spvc_type_get_member_type(spvc_type type, unsigned int index)} */
    @NativeType("spvc_type_id")
    public static int spvc_type_get_member_type(@NativeType("spvc_type") long type, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.type_get_member_type;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, index, __functionAddress);
    }

    // --- [ spvc_type_get_storage_class ] ---

    /** {@code SpvStorageClass spvc_type_get_storage_class(spvc_type type)} */
    @NativeType("SpvStorageClass")
    public static int spvc_type_get_storage_class(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_storage_class;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_sampled_type ] ---

    /** {@code spvc_type_id spvc_type_get_image_sampled_type(spvc_type type)} */
    @NativeType("spvc_type_id")
    public static int spvc_type_get_image_sampled_type(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_sampled_type;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_dimension ] ---

    /** {@code SpvDim spvc_type_get_image_dimension(spvc_type type)} */
    @NativeType("SpvDim")
    public static int spvc_type_get_image_dimension(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_dimension;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_is_depth ] ---

    /** {@code spvc_bool spvc_type_get_image_is_depth(spvc_type type)} */
    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_depth(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_is_depth;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_arrayed ] ---

    /** {@code spvc_bool spvc_type_get_image_arrayed(spvc_type type)} */
    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_arrayed(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_arrayed;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_multisampled ] ---

    /** {@code spvc_bool spvc_type_get_image_multisampled(spvc_type type)} */
    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_multisampled(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_multisampled;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_is_storage ] ---

    /** {@code spvc_bool spvc_type_get_image_is_storage(spvc_type type)} */
    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_storage(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_is_storage;
        if (CHECKS) {
            check(type);
        }
        return invokePZ(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_storage_format ] ---

    /** {@code SpvImageFormat spvc_type_get_image_storage_format(spvc_type type)} */
    @NativeType("SpvImageFormat")
    public static int spvc_type_get_image_storage_format(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_storage_format;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_type_get_image_access_qualifier ] ---

    /** {@code SpvAccessQualifier spvc_type_get_image_access_qualifier(spvc_type type)} */
    @NativeType("SpvAccessQualifier")
    public static int spvc_type_get_image_access_qualifier(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_access_qualifier;
        if (CHECKS) {
            check(type);
        }
        return invokePI(type, __functionAddress);
    }

    // --- [ spvc_compiler_get_declared_struct_size ] ---

    /** {@code spvc_result spvc_compiler_get_declared_struct_size(spvc_compiler compiler, spvc_type struct_type, size_t * size)} */
    public static int nspvc_compiler_get_declared_struct_size(long compiler, long struct_type, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_size;
        if (CHECKS) {
            check(compiler);
            check(struct_type);
        }
        return invokePPPI(compiler, struct_type, size, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_declared_struct_size(spvc_compiler compiler, spvc_type struct_type, size_t * size)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long struct_type, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nspvc_compiler_get_declared_struct_size(compiler, struct_type, memAddress(size));
    }

    // --- [ spvc_compiler_get_declared_struct_size_runtime_array ] ---

    /** {@code spvc_result spvc_compiler_get_declared_struct_size_runtime_array(spvc_compiler compiler, spvc_type struct_type, size_t array_size, size_t * size)} */
    public static int nspvc_compiler_get_declared_struct_size_runtime_array(long compiler, long struct_type, long array_size, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_size_runtime_array;
        if (CHECKS) {
            check(compiler);
            check(struct_type);
        }
        return invokePPPPI(compiler, struct_type, array_size, size, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_declared_struct_size_runtime_array(spvc_compiler compiler, spvc_type struct_type, size_t array_size, size_t * size)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size_runtime_array(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long struct_type, @NativeType("size_t") long array_size, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nspvc_compiler_get_declared_struct_size_runtime_array(compiler, struct_type, array_size, memAddress(size));
    }

    // --- [ spvc_compiler_get_declared_struct_member_size ] ---

    /** {@code spvc_result spvc_compiler_get_declared_struct_member_size(spvc_compiler compiler, spvc_type type, unsigned int index, size_t * size)} */
    public static int nspvc_compiler_get_declared_struct_member_size(long compiler, long type, int index, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_member_size;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, size, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_declared_struct_member_size(spvc_compiler compiler, spvc_type type, unsigned int index, size_t * size)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_member_size(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
        }
        return nspvc_compiler_get_declared_struct_member_size(compiler, type, index, memAddress(size));
    }

    // --- [ spvc_compiler_type_struct_member_offset ] ---

    /** {@code spvc_result spvc_compiler_type_struct_member_offset(spvc_compiler compiler, spvc_type type, unsigned int index, unsigned int * offset)} */
    public static int nspvc_compiler_type_struct_member_offset(long compiler, long type, int index, long offset) {
        long __functionAddress = Functions.compiler_type_struct_member_offset;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, offset, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_type_struct_member_offset(spvc_compiler compiler, spvc_type type, unsigned int index, unsigned int * offset)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_offset(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer offset) {
        if (CHECKS) {
            check(offset, 1);
        }
        return nspvc_compiler_type_struct_member_offset(compiler, type, index, memAddress(offset));
    }

    // --- [ spvc_compiler_type_struct_member_array_stride ] ---

    /** {@code spvc_result spvc_compiler_type_struct_member_array_stride(spvc_compiler compiler, spvc_type type, unsigned int index, unsigned int * stride)} */
    public static int nspvc_compiler_type_struct_member_array_stride(long compiler, long type, int index, long stride) {
        long __functionAddress = Functions.compiler_type_struct_member_array_stride;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, stride, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_type_struct_member_array_stride(spvc_compiler compiler, spvc_type type, unsigned int index, unsigned int * stride)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_array_stride(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer stride) {
        if (CHECKS) {
            check(stride, 1);
        }
        return nspvc_compiler_type_struct_member_array_stride(compiler, type, index, memAddress(stride));
    }

    // --- [ spvc_compiler_type_struct_member_matrix_stride ] ---

    /** {@code spvc_result spvc_compiler_type_struct_member_matrix_stride(spvc_compiler compiler, spvc_type type, unsigned int index, unsigned int * stride)} */
    public static int nspvc_compiler_type_struct_member_matrix_stride(long compiler, long type, int index, long stride) {
        long __functionAddress = Functions.compiler_type_struct_member_matrix_stride;
        if (CHECKS) {
            check(compiler);
            check(type);
        }
        return invokePPPI(compiler, type, index, stride, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_type_struct_member_matrix_stride(spvc_compiler compiler, spvc_type type, unsigned int index, unsigned int * stride)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_matrix_stride(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer stride) {
        if (CHECKS) {
            check(stride, 1);
        }
        return nspvc_compiler_type_struct_member_matrix_stride(compiler, type, index, memAddress(stride));
    }

    // --- [ spvc_compiler_build_dummy_sampler_for_combined_images ] ---

    /** {@code spvc_result spvc_compiler_build_dummy_sampler_for_combined_images(spvc_compiler compiler, spvc_variable_id * id)} */
    public static int nspvc_compiler_build_dummy_sampler_for_combined_images(long compiler, long id) {
        long __functionAddress = Functions.compiler_build_dummy_sampler_for_combined_images;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPI(compiler, id, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_build_dummy_sampler_for_combined_images(spvc_compiler compiler, spvc_variable_id * id)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_build_dummy_sampler_for_combined_images(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id *") IntBuffer id) {
        if (CHECKS) {
            check(id, 1);
        }
        return nspvc_compiler_build_dummy_sampler_for_combined_images(compiler, memAddress(id));
    }

    // --- [ spvc_compiler_build_combined_image_samplers ] ---

    /** {@code spvc_result spvc_compiler_build_combined_image_samplers(spvc_compiler compiler)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_build_combined_image_samplers(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_build_combined_image_samplers;
        if (CHECKS) {
            check(compiler);
        }
        return invokePI(compiler, __functionAddress);
    }

    // --- [ spvc_compiler_get_combined_image_samplers ] ---

    /** {@code spvc_result spvc_compiler_get_combined_image_samplers(spvc_compiler compiler, spvc_combined_image_sampler const ** samplers, size_t * num_samplers)} */
    public static int nspvc_compiler_get_combined_image_samplers(long compiler, long samplers, long num_samplers) {
        long __functionAddress = Functions.compiler_get_combined_image_samplers;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, samplers, num_samplers, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_combined_image_samplers(spvc_compiler compiler, spvc_combined_image_sampler const ** samplers, size_t * num_samplers)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_combined_image_samplers(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_combined_image_sampler const **") PointerBuffer samplers, @NativeType("size_t *") PointerBuffer num_samplers) {
        if (CHECKS) {
            check(samplers, 1);
            check(num_samplers, 1);
        }
        return nspvc_compiler_get_combined_image_samplers(compiler, memAddress(samplers), memAddress(num_samplers));
    }

    // --- [ spvc_compiler_get_specialization_constants ] ---

    /** {@code spvc_result spvc_compiler_get_specialization_constants(spvc_compiler compiler, spvc_specialization_constant const ** constants, size_t * num_constants)} */
    public static int nspvc_compiler_get_specialization_constants(long compiler, long constants, long num_constants) {
        long __functionAddress = Functions.compiler_get_specialization_constants;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, constants, num_constants, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_specialization_constants(spvc_compiler compiler, spvc_specialization_constant const ** constants, size_t * num_constants)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_specialization_constants(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_specialization_constant const **") PointerBuffer constants, @NativeType("size_t *") PointerBuffer num_constants) {
        if (CHECKS) {
            check(constants, 1);
            check(num_constants, 1);
        }
        return nspvc_compiler_get_specialization_constants(compiler, memAddress(constants), memAddress(num_constants));
    }

    // --- [ spvc_compiler_get_constant_handle ] ---

    /** {@code spvc_constant spvc_compiler_get_constant_handle(spvc_compiler compiler, spvc_constant_id id)} */
    @NativeType("spvc_constant")
    public static long spvc_compiler_get_constant_handle(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_constant_id") int id) {
        long __functionAddress = Functions.compiler_get_constant_handle;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_get_work_group_size_specialization_constants ] ---

    /** {@code spvc_constant_id spvc_compiler_get_work_group_size_specialization_constants(spvc_compiler compiler, spvc_specialization_constant * x, spvc_specialization_constant * y, spvc_specialization_constant * z)} */
    public static int nspvc_compiler_get_work_group_size_specialization_constants(long compiler, long x, long y, long z) {
        long __functionAddress = Functions.compiler_get_work_group_size_specialization_constants;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPPI(compiler, x, y, z, __functionAddress);
    }

    /** {@code spvc_constant_id spvc_compiler_get_work_group_size_specialization_constants(spvc_compiler compiler, spvc_specialization_constant * x, spvc_specialization_constant * y, spvc_specialization_constant * z)} */
    @NativeType("spvc_constant_id")
    public static int spvc_compiler_get_work_group_size_specialization_constants(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant x, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant y, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant z) {
        return nspvc_compiler_get_work_group_size_specialization_constants(compiler, x.address(), y.address(), z.address());
    }

    // --- [ spvc_compiler_get_active_buffer_ranges ] ---

    /** {@code spvc_result spvc_compiler_get_active_buffer_ranges(spvc_compiler compiler, spvc_variable_id id, spvc_buffer_range const ** ranges, size_t * num_ranges)} */
    public static int nspvc_compiler_get_active_buffer_ranges(long compiler, int id, long ranges, long num_ranges) {
        long __functionAddress = Functions.compiler_get_active_buffer_ranges;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, id, ranges, num_ranges, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_active_buffer_ranges(spvc_compiler compiler, spvc_variable_id id, spvc_buffer_range const ** ranges, size_t * num_ranges)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_active_buffer_ranges(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_buffer_range const **") PointerBuffer ranges, @NativeType("size_t *") PointerBuffer num_ranges) {
        if (CHECKS) {
            check(ranges, 1);
            check(num_ranges, 1);
        }
        return nspvc_compiler_get_active_buffer_ranges(compiler, id, memAddress(ranges), memAddress(num_ranges));
    }

    // --- [ spvc_constant_get_scalar_fp16 ] ---

    /** {@code float spvc_constant_get_scalar_fp16(spvc_constant constant, unsigned int column, unsigned int row)} */
    public static float spvc_constant_get_scalar_fp16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp16;
        if (CHECKS) {
            check(constant);
        }
        return invokePF(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_fp32 ] ---

    /** {@code float spvc_constant_get_scalar_fp32(spvc_constant constant, unsigned int column, unsigned int row)} */
    public static float spvc_constant_get_scalar_fp32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp32;
        if (CHECKS) {
            check(constant);
        }
        return invokePF(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_fp64 ] ---

    /** {@code double spvc_constant_get_scalar_fp64(spvc_constant constant, unsigned int column, unsigned int row)} */
    public static double spvc_constant_get_scalar_fp64(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp64;
        if (CHECKS) {
            check(constant);
        }
        return invokePD(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_u32 ] ---

    /** {@code unsigned int spvc_constant_get_scalar_u32(spvc_constant constant, unsigned int column, unsigned int row)} */
    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u32;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i32 ] ---

    /** {@code int spvc_constant_get_scalar_i32(spvc_constant constant, unsigned int column, unsigned int row)} */
    public static int spvc_constant_get_scalar_i32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i32;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_u16 ] ---

    /** {@code unsigned int spvc_constant_get_scalar_u16(spvc_constant constant, unsigned int column, unsigned int row)} */
    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u16;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i16 ] ---

    /** {@code int spvc_constant_get_scalar_i16(spvc_constant constant, unsigned int column, unsigned int row)} */
    public static int spvc_constant_get_scalar_i16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i16;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_u8 ] ---

    /** {@code unsigned int spvc_constant_get_scalar_u8(spvc_constant constant, unsigned int column, unsigned int row)} */
    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u8(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u8;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i8 ] ---

    /** {@code int spvc_constant_get_scalar_i8(spvc_constant constant, unsigned int column, unsigned int row)} */
    public static int spvc_constant_get_scalar_i8(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i8;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_subconstants ] ---

    /** {@code void spvc_constant_get_subconstants(spvc_constant constant, spvc_constant_id const ** constituents, size_t * count)} */
    public static void nspvc_constant_get_subconstants(long constant, long constituents, long count) {
        long __functionAddress = Functions.constant_get_subconstants;
        if (CHECKS) {
            check(constant);
        }
        invokePPPV(constant, constituents, count, __functionAddress);
    }

    /** {@code void spvc_constant_get_subconstants(spvc_constant constant, spvc_constant_id const ** constituents, size_t * count)} */
    public static void spvc_constant_get_subconstants(@NativeType("spvc_constant") long constant, @NativeType("spvc_constant_id const **") PointerBuffer constituents, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(constituents, 1);
            check(count, 1);
        }
        nspvc_constant_get_subconstants(constant, memAddress(constituents), memAddress(count));
    }

    // --- [ spvc_constant_get_scalar_u64 ] ---

    /** {@code unsigned long long spvc_constant_get_scalar_u64(spvc_constant constant, unsigned column, unsigned row)} */
    @NativeType("unsigned long long")
    public static long spvc_constant_get_scalar_u64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row) {
        long __functionAddress = Functions.constant_get_scalar_u64;
        if (CHECKS) {
            check(constant);
        }
        return invokePJ(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_scalar_i64 ] ---

    /** {@code long long spvc_constant_get_scalar_i64(spvc_constant constant, unsigned column, unsigned row)} */
    @NativeType("long long")
    public static long spvc_constant_get_scalar_i64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row) {
        long __functionAddress = Functions.constant_get_scalar_i64;
        if (CHECKS) {
            check(constant);
        }
        return invokePJ(constant, column, row, __functionAddress);
    }

    // --- [ spvc_constant_get_type ] ---

    /** {@code spvc_type_id spvc_constant_get_type(spvc_constant constant)} */
    @NativeType("spvc_type_id")
    public static int spvc_constant_get_type(@NativeType("spvc_constant") long constant) {
        long __functionAddress = Functions.constant_get_type;
        if (CHECKS) {
            check(constant);
        }
        return invokePI(constant, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_fp16 ] ---

    /** {@code void spvc_constant_set_scalar_fp16(spvc_constant constant, unsigned column, unsigned row, unsigned short value)} */
    public static void spvc_constant_set_scalar_fp16(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned short") short value) {
        long __functionAddress = Functions.constant_set_scalar_fp16;
        if (CHECKS) {
            check(constant);
        }
        invokePCV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_fp32 ] ---

    /** {@code void spvc_constant_set_scalar_fp32(spvc_constant constant, unsigned column, unsigned row, float value)} */
    public static void spvc_constant_set_scalar_fp32(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, float value) {
        long __functionAddress = Functions.constant_set_scalar_fp32;
        if (CHECKS) {
            check(constant);
        }
        invokePV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_fp64 ] ---

    /** {@code void spvc_constant_set_scalar_fp64(spvc_constant constant, unsigned column, unsigned row, double value)} */
    public static void spvc_constant_set_scalar_fp64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, double value) {
        long __functionAddress = Functions.constant_set_scalar_fp64;
        if (CHECKS) {
            check(constant);
        }
        invokePV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_u32 ] ---

    /** {@code void spvc_constant_set_scalar_u32(spvc_constant constant, unsigned column, unsigned row, unsigned value)} */
    public static void spvc_constant_set_scalar_u32(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned") int value) {
        long __functionAddress = Functions.constant_set_scalar_u32;
        if (CHECKS) {
            check(constant);
        }
        invokePV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_i32 ] ---

    /** {@code void spvc_constant_set_scalar_i32(spvc_constant constant, unsigned column, unsigned row, int value)} */
    public static void spvc_constant_set_scalar_i32(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, int value) {
        long __functionAddress = Functions.constant_set_scalar_i32;
        if (CHECKS) {
            check(constant);
        }
        invokePV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_u64 ] ---

    /** {@code void spvc_constant_set_scalar_u64(spvc_constant constant, unsigned column, unsigned row, unsigned long long value)} */
    public static void spvc_constant_set_scalar_u64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned long long") long value) {
        long __functionAddress = Functions.constant_set_scalar_u64;
        if (CHECKS) {
            check(constant);
        }
        invokePJV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_i64 ] ---

    /** {@code void spvc_constant_set_scalar_i64(spvc_constant constant, unsigned column, unsigned row, long long value)} */
    public static void spvc_constant_set_scalar_i64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("long long") long value) {
        long __functionAddress = Functions.constant_set_scalar_i64;
        if (CHECKS) {
            check(constant);
        }
        invokePJV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_u16 ] ---

    /** {@code void spvc_constant_set_scalar_u16(spvc_constant constant, unsigned column, unsigned row, unsigned short value)} */
    public static void spvc_constant_set_scalar_u16(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned short") short value) {
        long __functionAddress = Functions.constant_set_scalar_u16;
        if (CHECKS) {
            check(constant);
        }
        invokePCV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_i16 ] ---

    /** {@code void spvc_constant_set_scalar_i16(spvc_constant constant, unsigned column, unsigned row, short value)} */
    public static void spvc_constant_set_scalar_i16(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, short value) {
        long __functionAddress = Functions.constant_set_scalar_i16;
        if (CHECKS) {
            check(constant);
        }
        invokePSV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_u8 ] ---

    /** {@code void spvc_constant_set_scalar_u8(spvc_constant constant, unsigned column, unsigned row, unsigned char value)} */
    public static void spvc_constant_set_scalar_u8(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned char") byte value) {
        long __functionAddress = Functions.constant_set_scalar_u8;
        if (CHECKS) {
            check(constant);
        }
        invokePUV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_constant_set_scalar_i8 ] ---

    /** {@code void spvc_constant_set_scalar_i8(spvc_constant constant, unsigned column, unsigned row, char value)} */
    public static void spvc_constant_set_scalar_i8(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("char") byte value) {
        long __functionAddress = Functions.constant_set_scalar_i8;
        if (CHECKS) {
            check(constant);
        }
        invokePBV(constant, column, row, value, __functionAddress);
    }

    // --- [ spvc_compiler_get_binary_offset_for_decoration ] ---

    /** {@code spvc_bool spvc_compiler_get_binary_offset_for_decoration(spvc_compiler compiler, spvc_variable_id id, SpvDecoration decoration, unsigned int * word_offset)} */
    public static boolean nspvc_compiler_get_binary_offset_for_decoration(long compiler, int id, int decoration, long word_offset) {
        long __functionAddress = Functions.compiler_get_binary_offset_for_decoration;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPZ(compiler, id, decoration, word_offset, __functionAddress);
    }

    /** {@code spvc_bool spvc_compiler_get_binary_offset_for_decoration(spvc_compiler compiler, spvc_variable_id id, SpvDecoration decoration, unsigned int * word_offset)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_get_binary_offset_for_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int *") IntBuffer word_offset) {
        if (CHECKS) {
            check(word_offset, 1);
        }
        return nspvc_compiler_get_binary_offset_for_decoration(compiler, id, decoration, memAddress(word_offset));
    }

    // --- [ spvc_compiler_buffer_is_hlsl_counter_buffer ] ---

    /** {@code spvc_bool spvc_compiler_buffer_is_hlsl_counter_buffer(spvc_compiler compiler, spvc_variable_id id)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_is_hlsl_counter_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_buffer_is_hlsl_counter_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePZ(compiler, id, __functionAddress);
    }

    // --- [ spvc_compiler_buffer_get_hlsl_counter_buffer ] ---

    /** {@code spvc_bool spvc_compiler_buffer_get_hlsl_counter_buffer(spvc_compiler compiler, spvc_variable_id id, spvc_variable_id * counter_id)} */
    public static boolean nspvc_compiler_buffer_get_hlsl_counter_buffer(long compiler, int id, long counter_id) {
        long __functionAddress = Functions.compiler_buffer_get_hlsl_counter_buffer;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPZ(compiler, id, counter_id, __functionAddress);
    }

    /** {@code spvc_bool spvc_compiler_buffer_get_hlsl_counter_buffer(spvc_compiler compiler, spvc_variable_id id, spvc_variable_id * counter_id)} */
    @NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_get_hlsl_counter_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_variable_id *") IntBuffer counter_id) {
        if (CHECKS) {
            check(counter_id, 1);
        }
        return nspvc_compiler_buffer_get_hlsl_counter_buffer(compiler, id, memAddress(counter_id));
    }

    // --- [ spvc_compiler_get_declared_capabilities ] ---

    /** {@code spvc_result spvc_compiler_get_declared_capabilities(spvc_compiler compiler, SpvCapability const ** capabilities, size_t * num_capabilities)} */
    public static int nspvc_compiler_get_declared_capabilities(long compiler, long capabilities, long num_capabilities) {
        long __functionAddress = Functions.compiler_get_declared_capabilities;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, capabilities, num_capabilities, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_declared_capabilities(spvc_compiler compiler, SpvCapability const ** capabilities, size_t * num_capabilities)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_capabilities(@NativeType("spvc_compiler") long compiler, @NativeType("SpvCapability const **") PointerBuffer capabilities, @NativeType("size_t *") PointerBuffer num_capabilities) {
        if (CHECKS) {
            check(capabilities, 1);
            check(num_capabilities, 1);
        }
        return nspvc_compiler_get_declared_capabilities(compiler, memAddress(capabilities), memAddress(num_capabilities));
    }

    // --- [ spvc_compiler_get_declared_extensions ] ---

    /** {@code spvc_result spvc_compiler_get_declared_extensions(spvc_compiler compiler, char const *** extensions, size_t * num_extensions)} */
    public static int nspvc_compiler_get_declared_extensions(long compiler, long extensions, long num_extensions) {
        long __functionAddress = Functions.compiler_get_declared_extensions;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, extensions, num_extensions, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_declared_extensions(spvc_compiler compiler, char const *** extensions, size_t * num_extensions)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_extensions(@NativeType("spvc_compiler") long compiler, @NativeType("char const ***") PointerBuffer extensions, @NativeType("size_t *") PointerBuffer num_extensions) {
        if (CHECKS) {
            check(extensions, 1);
            check(num_extensions, 1);
        }
        return nspvc_compiler_get_declared_extensions(compiler, memAddress(extensions), memAddress(num_extensions));
    }

    // --- [ spvc_compiler_get_remapped_declared_block_name ] ---

    /** {@code char const * spvc_compiler_get_remapped_declared_block_name(spvc_compiler compiler, spvc_variable_id id)} */
    public static long nspvc_compiler_get_remapped_declared_block_name(long compiler, int id) {
        long __functionAddress = Functions.compiler_get_remapped_declared_block_name;
        if (CHECKS) {
            check(compiler);
        }
        return invokePP(compiler, id, __functionAddress);
    }

    /** {@code char const * spvc_compiler_get_remapped_declared_block_name(spvc_compiler compiler, spvc_variable_id id)} */
    @NativeType("char const *")
    public static @Nullable String spvc_compiler_get_remapped_declared_block_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __result = nspvc_compiler_get_remapped_declared_block_name(compiler, id);
        return memUTF8Safe(__result);
    }

    // --- [ spvc_compiler_get_buffer_block_decorations ] ---

    /** {@code spvc_result spvc_compiler_get_buffer_block_decorations(spvc_compiler compiler, spvc_variable_id id, SpvDecoration const ** decorations, size_t * num_decorations)} */
    public static int nspvc_compiler_get_buffer_block_decorations(long compiler, int id, long decorations, long num_decorations) {
        long __functionAddress = Functions.compiler_get_buffer_block_decorations;
        if (CHECKS) {
            check(compiler);
        }
        return invokePPPI(compiler, id, decorations, num_decorations, __functionAddress);
    }

    /** {@code spvc_result spvc_compiler_get_buffer_block_decorations(spvc_compiler compiler, spvc_variable_id id, SpvDecoration const ** decorations, size_t * num_decorations)} */
    @NativeType("spvc_result")
    public static int spvc_compiler_get_buffer_block_decorations(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("SpvDecoration const **") PointerBuffer decorations, @NativeType("size_t *") PointerBuffer num_decorations) {
        if (CHECKS) {
            check(decorations, 1);
            check(num_decorations, 1);
        }
        return nspvc_compiler_get_buffer_block_decorations(compiler, id, memAddress(decorations), memAddress(num_decorations));
    }

}