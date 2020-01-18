/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the libshaderc_spvc C API of the <a target="_blank" href="https://github.com/google/shaderc/">shaderc</a> library. */
public class ShadercSpvc {

    /**
     * SPIR-V decorations supported by spvc. ({@code shaderc_spvc_decoration}
     * 
     * <p>This is not an exhaustive list of all of the values in the spec, but more can be added if needed.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_decoration_specid decoration_specid}</li>
     * <li>{@link #shaderc_spvc_decoration_block decoration_block}</li>
     * <li>{@link #shaderc_spvc_decoration_rowmajor decoration_rowmajor}</li>
     * <li>{@link #shaderc_spvc_decoration_colmajor decoration_colmajor}</li>
     * <li>{@link #shaderc_spvc_decoration_arraystride decoration_arraystride}</li>
     * <li>{@link #shaderc_spvc_decoration_matrixstride decoration_matrixstride}</li>
     * <li>{@link #shaderc_spvc_decoration_builtin decoration_builtin}</li>
     * <li>{@link #shaderc_spvc_decoration_noperspective decoration_noperspective}</li>
     * <li>{@link #shaderc_spvc_decoration_flat decoration_flat}</li>
     * <li>{@link #shaderc_spvc_decoration_centroid decoration_centroid}</li>
     * <li>{@link #shaderc_spvc_decoration_restrict decoration_restrict}</li>
     * <li>{@link #shaderc_spvc_decoration_aliased decoration_aliased}</li>
     * <li>{@link #shaderc_spvc_decoration_nonwritable decoration_nonwritable}</li>
     * <li>{@link #shaderc_spvc_decoration_nonreadable decoration_nonreadable}</li>
     * <li>{@link #shaderc_spvc_decoration_uniform decoration_uniform}</li>
     * <li>{@link #shaderc_spvc_decoration_location decoration_location}</li>
     * <li>{@link #shaderc_spvc_decoration_component decoration_component}</li>
     * <li>{@link #shaderc_spvc_decoration_index decoration_index}</li>
     * <li>{@link #shaderc_spvc_decoration_binding decoration_binding}</li>
     * <li>{@link #shaderc_spvc_decoration_descriptorset decoration_descriptorset}</li>
     * <li>{@link #shaderc_spvc_decoration_offset decoration_offset}</li>
     * <li>{@link #shaderc_spvc_decoration_nocontraction decoration_nocontraction}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_decoration_specid        = 0,
        shaderc_spvc_decoration_block         = 1,
        shaderc_spvc_decoration_rowmajor      = 2,
        shaderc_spvc_decoration_colmajor      = 3,
        shaderc_spvc_decoration_arraystride   = 4,
        shaderc_spvc_decoration_matrixstride  = 5,
        shaderc_spvc_decoration_builtin       = 6,
        shaderc_spvc_decoration_noperspective = 7,
        shaderc_spvc_decoration_flat          = 8,
        shaderc_spvc_decoration_centroid      = 9,
        shaderc_spvc_decoration_restrict      = 10,
        shaderc_spvc_decoration_aliased       = 11,
        shaderc_spvc_decoration_nonwritable   = 12,
        shaderc_spvc_decoration_nonreadable   = 13,
        shaderc_spvc_decoration_uniform       = 14,
        shaderc_spvc_decoration_location      = 15,
        shaderc_spvc_decoration_component     = 16,
        shaderc_spvc_decoration_index         = 17,
        shaderc_spvc_decoration_binding       = 18,
        shaderc_spvc_decoration_descriptorset = 19,
        shaderc_spvc_decoration_offset        = 20,
        shaderc_spvc_decoration_nocontraction = 21;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_msl_platform_ios msl_platform_ios}</li>
     * <li>{@link #shaderc_spvc_msl_platform_macos msl_platform_macos}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_msl_platform_ios   = 0,
        shaderc_spvc_msl_platform_macos = 1;

    /**
     * Return code for spvc API calls. ({@code shaderc_spvc_status})
     * 
     * <p>{@code shaderc_spvc_status_success} indicates success completion of the operation, all others indicate some sort of failure.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_status_success status_success}</li>
     * <li>{@link #shaderc_spvc_status_compilation_error status_compilation_error}</li>
     * <li>{@link #shaderc_spvc_status_internal_error status_internal_error}</li>
     * <li>{@link #shaderc_spvc_status_validation_error status_validation_error}</li>
     * <li>{@link #shaderc_spvc_status_transformation_error status_transformation_error}</li>
     * <li>{@link #shaderc_spvc_status_configuration_error status_configuration_error}</li>
     * <li>{@link #shaderc_spvc_status_uninitialized_compiler_error status_uninitialized_compiler_error}</li>
     * <li>{@link #shaderc_spvc_status_missing_context_error status_missing_context_error}</li>
     * <li>{@link #shaderc_spvc_status_invalid_out_param status_invalid_out_param}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_status_success                      = 0,
        shaderc_spvc_status_compilation_error            = 1,
        shaderc_spvc_status_internal_error               = 2,
        shaderc_spvc_status_validation_error             = 3,
        shaderc_spvc_status_transformation_error         = 4,
        shaderc_spvc_status_configuration_error          = 5,
        shaderc_spvc_status_uninitialized_compiler_error = 6,
        shaderc_spvc_status_missing_context_error        = 7,
        shaderc_spvc_status_invalid_out_param            = 8;

    /**
     * {@code shaderc_spvc_execution_model}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_execution_model_vertex execution_model_vertex}</li>
     * <li>{@link #shaderc_spvc_execution_model_fragment execution_model_fragment}</li>
     * <li>{@link #shaderc_spvc_execution_model_glcompute execution_model_glcompute}</li>
     * <li>{@link #shaderc_spvc_execution_model_invalid execution_model_invalid}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_execution_model_vertex    = 0,
        shaderc_spvc_execution_model_fragment  = 1,
        shaderc_spvc_execution_model_glcompute = 2,
        shaderc_spvc_execution_model_invalid   = 3;

    /**
     * {@code shaderc_spvc_binding_type}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_binding_type_uniform_buffer binding_type_uniform_buffer}</li>
     * <li>{@link #shaderc_spvc_binding_type_storage_buffer binding_type_storage_buffer}</li>
     * <li>{@link #shaderc_spvc_binding_type_readonly_storage_buffer binding_type_readonly_storage_buffer}</li>
     * <li>{@link #shaderc_spvc_binding_type_sampler binding_type_sampler}</li>
     * <li>{@link #shaderc_spvc_binding_type_sampled_texture binding_type_sampled_texture}</li>
     * <li>{@link #shaderc_spvc_binding_type_storage_texture binding_type_storage_texture}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_binding_type_uniform_buffer          = 0x0,
        shaderc_spvc_binding_type_storage_buffer          = 0x1,
        shaderc_spvc_binding_type_readonly_storage_buffer = 0x2,
        shaderc_spvc_binding_type_sampler                 = 0x3,
        shaderc_spvc_binding_type_sampled_texture         = 0x4,
        shaderc_spvc_binding_type_storage_texture         = 0x5;

    /**
     * {@code shaderc_spvc_texture_view_dimension}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_texture_view_dimension_undefined texture_view_dimension_undefined}</li>
     * <li>{@link #shaderc_spvc_texture_view_dimension_e1D texture_view_dimension_e1D}</li>
     * <li>{@link #shaderc_spvc_texture_view_dimension_e2D texture_view_dimension_e2D}</li>
     * <li>{@link #shaderc_spvc_texture_view_dimension_e2D_array texture_view_dimension_e2D_array}</li>
     * <li>{@link #shaderc_spvc_texture_view_dimension_cube texture_view_dimension_cube}</li>
     * <li>{@link #shaderc_spvc_texture_view_dimension_cube_array texture_view_dimension_cube_array}</li>
     * <li>{@link #shaderc_spvc_texture_view_dimension_e3D texture_view_dimension_e3D}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_texture_view_dimension_undefined  = 0x0,
        shaderc_spvc_texture_view_dimension_e1D        = 0x1,
        shaderc_spvc_texture_view_dimension_e2D        = 0x2,
        shaderc_spvc_texture_view_dimension_e2D_array  = 0x3,
        shaderc_spvc_texture_view_dimension_cube       = 0x4,
        shaderc_spvc_texture_view_dimension_cube_array = 0x5,
        shaderc_spvc_texture_view_dimension_e3D        = 0x6;

    /**
     * {@code shaderc_spvc_texture_format_type}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_shaderc_spvc_texture_format_type_float shaderc_spvc_texture_format_type_float}</li>
     * <li>{@link #shaderc_spvc_shaderc_spvc_texture_format_type_sint shaderc_spvc_texture_format_type_sint}</li>
     * <li>{@link #shaderc_spvc_shaderc_spvc_texture_format_type_uint shaderc_spvc_texture_format_type_uint}</li>
     * <li>{@link #shaderc_spvc_shaderc_spvc_texture_format_type_other shaderc_spvc_texture_format_type_other}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_shaderc_spvc_texture_format_type_float = 0,
        shaderc_spvc_shaderc_spvc_texture_format_type_sint  = 1,
        shaderc_spvc_shaderc_spvc_texture_format_type_uint  = 2,
        shaderc_spvc_shaderc_spvc_texture_format_type_other = 3;

    /**
     * {@code shaderc_spvc_shader_resource}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #shaderc_spvc_shaderc_spvc_shader_resource_uniform_buffers shaderc_spvc_shader_resource_uniform_buffers}</li>
     * <li>{@link #shaderc_spvc_shaderc_spvc_shader_resource_separate_images shaderc_spvc_shader_resource_separate_images}</li>
     * <li>{@link #shaderc_spvc_shaderc_spvc_shader_resource_separate_samplers shaderc_spvc_shader_resource_separate_samplers}</li>
     * <li>{@link #shaderc_spvc_shaderc_spvc_shader_resource_storage_buffers shaderc_spvc_shader_resource_storage_buffers}</li>
     * </ul>
     */
    public static final int
        shaderc_spvc_shaderc_spvc_shader_resource_uniform_buffers   = 0,
        shaderc_spvc_shaderc_spvc_shader_resource_separate_images   = 1,
        shaderc_spvc_shaderc_spvc_shader_resource_separate_samplers = 2,
        shaderc_spvc_shaderc_spvc_shader_resource_storage_buffers   = 3;

    protected ShadercSpvc() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary SHADERC = Library.loadNative(ShadercSpvc.class, "org.lwjgl.shaderc", Configuration.SHADERC_SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc_spvc")), true);

    /** Contains the function pointers loaded from the shaderc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            context_create                                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_context_create"),
            context_destroy                                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_context_destroy"),
            context_get_messages                                = apiGetFunctionAddress(SHADERC, "shaderc_spvc_context_get_messages"),
            context_set_use_spvc_parser                         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_context_set_use_spvc_parser"),
            compile_options_create                              = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_create"),
            compile_options_clone                               = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_clone"),
            compile_options_destroy                             = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_destroy"),
            compile_options_set_entry_point                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_entry_point"),
            compile_options_set_remove_unused_variables         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_remove_unused_variables"),
            compile_options_set_robust_buffer_access_pass       = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_robust_buffer_access_pass"),
            compile_options_set_emit_line_directives            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_emit_line_directives"),
            compile_options_set_source_env                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_source_env"),
            compile_options_set_target_env                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_target_env"),
            compile_options_set_vulkan_semantics                = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_vulkan_semantics"),
            compile_options_set_separate_shader_objects         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_separate_shader_objects"),
            compile_options_set_flatten_ubo                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_flatten_ubo"),
            compile_options_set_glsl_language_version           = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_glsl_language_version"),
            compile_options_set_flatten_multidimensional_arrays = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_flatten_multidimensional_arrays"),
            compile_options_set_es                              = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_es"),
            compile_options_set_glsl_emit_push_constant_as_ubo  = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_glsl_emit_push_constant_as_ubo"),
            compile_options_set_msl_language_version            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_language_version"),
            compile_options_set_msl_swizzle_texture_samples     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_swizzle_texture_samples"),
            compile_options_set_msl_platform                    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_platform"),
            compile_options_set_msl_pad_fragment_output         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_pad_fragment_output"),
            compile_options_set_msl_capture                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_capture"),
            compile_options_set_msl_domain_lower_left           = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_domain_lower_left"),
            compile_options_set_msl_argument_buffers            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_argument_buffers"),
            compile_options_set_msl_discrete_descriptor_sets    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets"),
            compile_options_set_msl_enable_point_size_builtin   = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_enable_point_size_builtin"),
            compile_options_set_msl_buffer_size_buffer_index    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_msl_buffer_size_buffer_index"),
            compile_options_set_hlsl_shader_model               = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_hlsl_shader_model"),
            compile_options_set_hlsl_point_size_compat          = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_hlsl_point_size_compat"),
            compile_options_set_hlsl_point_coord_compat         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_hlsl_point_coord_compat"),
            compile_options_set_fixup_clipspace                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_fixup_clipspace"),
            compile_options_set_flip_vert_y                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_flip_vert_y"),
            compile_options_set_validate                        = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_validate"),
            compile_options_set_optimize                        = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_optimize"),
            compile_options_set_for_fuzzing                     = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_options_set_for_fuzzing"),
            initialize_for_glsl                                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_initialize_for_glsl"),
            initialize_for_hlsl                                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_initialize_for_hlsl"),
            initialize_for_msl                                  = apiGetFunctionAddress(SHADERC, "shaderc_spvc_initialize_for_msl"),
            initialize_for_vulkan                               = apiGetFunctionAddress(SHADERC, "shaderc_spvc_initialize_for_vulkan"),
            compile_shader                                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_compile_shader"),
            get_decoration                                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_decoration"),
            unset_decoration                                    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_unset_decoration"),
            set_name                                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_set_name"),
            build_combined_image_samplers                       = apiGetFunctionAddress(SHADERC, "shaderc_spvc_build_combined_image_samplers"),
            get_combined_image_samplers                         = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_combined_image_samplers"),
            set_decoration                                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_set_decoration"),
            add_msl_resource_binding                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_add_msl_resource_binding"),
            get_workgroup_size                                  = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_workgroup_size"),
            needs_buffer_size_buffer                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_needs_buffer_size_buffer"),
            get_execution_model                                 = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_execution_model"),
            get_push_constant_buffer_count                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_push_constant_buffer_count"),
            get_binding_info                                    = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_binding_info"),
            get_input_stage_location_info                       = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_input_stage_location_info"),
            get_output_stage_location_info                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_output_stage_location_info"),
            get_output_stage_type_info                          = apiGetFunctionAddress(SHADERC, "shaderc_spvc_get_output_stage_type_info"),
            result_create                                       = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_create"),
            result_destroy                                      = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_destroy"),
            result_get_string_output                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_string_output"),
            result_get_binary_output                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_binary_output"),
            result_get_binary_length                            = apiGetFunctionAddress(SHADERC, "shaderc_spvc_result_get_binary_length");

    }

    /** Returns the shaderc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    // --- [ shaderc_spvc_context_create ] ---

    /**
     * Create a spvc state handle.
     * 
     * <p>A return of {@code NULL} indicates that there was an error. Any function operating on a {@code *_context_t} must offer the <a target="_blank" href="http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/">basic thread-safety guarantee</a>. That is: concurrent invocation of these functions on DIFFERENT objects needs no synchronization; concurrent invocation of these functions on the
     * SAME object requires synchronization IF AND ONLY IF some of them take a non-const argument.</p>
     */
    @NativeType("shaderc_spvc_context_t")
    public static long shaderc_spvc_context_create() {
        long __functionAddress = Functions.context_create;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_spvc_context_destroy ] ---

    /**
     * Release resources.
     * 
     * <p>After this the handle cannot be used.</p>
     */
    public static void shaderc_spvc_context_destroy(@NativeType("shaderc_spvc_context_t") long context) {
        long __functionAddress = Functions.context_destroy;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ shaderc_spvc_context_get_messages ] ---

    /** Unsafe version of: {@link #shaderc_spvc_context_get_messages context_get_messages} */
    public static long nshaderc_spvc_context_get_messages(long context) {
        long __functionAddress = Functions.context_get_messages;
        if (CHECKS) {
            check(context);
        }
        return invokePP(context, __functionAddress);
    }

    /** Get validation/compilation error or informational messages. */
    @Nullable
    @NativeType("char const *")
    public static String shaderc_spvc_context_get_messages(@NativeType("shaderc_spvc_context_t const") long context) {
        long __result = nshaderc_spvc_context_get_messages(context);
        return memASCIISafe(__result);
    }

    // --- [ shaderc_spvc_context_set_use_spvc_parser ] ---

    /** If true, use spvc built in parser to generate IR for spirv-cross, otherwise use spirv-cross's implementation. */
    public static void shaderc_spvc_context_set_use_spvc_parser(@NativeType("shaderc_spvc_context_t") long context, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.context_set_use_spvc_parser;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_create ] ---

    /**
     * Creates default compiler options.
     * 
     * <p>A return of {@code NULL} indicates that there was an error initializing the options. Any function operating on {@code shaderc_spvc_compile_options_t} must
     * offer the basic thread-safety guarantee.</p>
     */
    @NativeType("shaderc_spvc_compile_options_t")
    public static long shaderc_spvc_compile_options_create() {
        long __functionAddress = Functions.compile_options_create;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_clone ] ---

    /**
     * Returns a copy of the given options.
     * 
     * <p>If {@code NULL} is passed as the parameter the call is the same as {@link Shaderc#shaderc_compile_options_initialize compile_options_initialize}.</p>
     */
    @NativeType("shaderc_spvc_compile_options_t")
    public static long shaderc_spvc_compile_options_clone(@NativeType("shaderc_spvc_compile_options_t const") long options) {
        long __functionAddress = Functions.compile_options_clone;
        return invokePP(options, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_destroy ] ---

    /**
     * Destroys the compilation options.
     * 
     * <p>It is invalid to use the given option object in any future calls. It is safe to pass {@code NULL} to this function, and doing such will have no effect.</p>
     */
    public static void shaderc_spvc_compile_options_destroy(@NativeType("shaderc_spvc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_destroy;
        invokePV(options, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_entry_point ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_options_set_entry_point compile_options_set_entry_point} */
    public static void nshaderc_spvc_compile_options_set_entry_point(long options, long entry_point) {
        long __functionAddress = Functions.compile_options_set_entry_point;
        if (CHECKS) {
            check(options);
        }
        invokePPV(options, entry_point, __functionAddress);
    }

    /** Sets the entry point. */
    public static void shaderc_spvc_compile_options_set_entry_point(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("char const *") ByteBuffer entry_point) {
        if (CHECKS) {
            checkNT1(entry_point);
        }
        nshaderc_spvc_compile_options_set_entry_point(options, memAddress(entry_point));
    }

    /** Sets the entry point. */
    public static void shaderc_spvc_compile_options_set_entry_point(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("char const *") CharSequence entry_point) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(entry_point, true);
            long entry_pointEncoded = stack.getPointerAddress();
            nshaderc_spvc_compile_options_set_entry_point(options, entry_pointEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_spvc_compile_options_set_remove_unused_variables ] ---

    /** If true, unused variables will not appear in the output. */
    public static void shaderc_spvc_compile_options_set_remove_unused_variables(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_remove_unused_variables;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_robust_buffer_access_pass ] ---

    /**
     * If true, enable robust buffer access pass in the spirv-opt, meaning:
     * 
     * <p>Inject code to clamp indexed accesses to buffers and internal arrays, providing guarantees satisfying Vulkan's {@code robustBufferAccess} rules. This
     * is useful when an implementation does not support robust-buffer access as a driver option.</p>
     */
    public static void shaderc_spvc_compile_options_set_robust_buffer_access_pass(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_robust_buffer_access_pass;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_emit_line_directives ] ---

    public static void shaderc_spvc_compile_options_set_emit_line_directives(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_emit_line_directives;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_source_env ] ---

    /**
     * Sets the source shader environment, affecting which warnings or errors will be issued during validation.
     * 
     * <p>Default value for environment is Vulkan 1.0.</p>
     */
    public static void shaderc_spvc_compile_options_set_source_env(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("shaderc_target_env") int env, @NativeType("shaderc_env_version") int version) {
        long __functionAddress = Functions.compile_options_set_source_env;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, env, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_target_env ] ---

    /**
     * Sets the target shader environment, if this is different from the source environment, then a transform between the environments will be performed if
     * possible.
     * 
     * <p>Currently only WebGPU &lt;-&gt; Vulkan 1.1 are defined. Default value for environment is Vulkan 1.0.</p>
     */
    public static void shaderc_spvc_compile_options_set_target_env(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("shaderc_target_env") int env, @NativeType("shaderc_env_version") int version) {
        long __functionAddress = Functions.compile_options_set_target_env;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, env, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_vulkan_semantics ] ---

    /** If true, Vulkan GLSL features are used instead of GL-compatible features. */
    public static void shaderc_spvc_compile_options_set_vulkan_semantics(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_vulkan_semantics;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_separate_shader_objects ] ---

    /**
     * If true, {@code gl_PerVertex} is explicitly redeclared in vertex, geometry and tessellation shaders.
     * 
     * <p>The members of {@code gl_PerVertex} is determined by which built-ins are declared by the shader.</p>
     */
    public static void shaderc_spvc_compile_options_set_separate_shader_objects(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_separate_shader_objects;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_flatten_ubo ] ---

    /** Flatten uniform or push constant variable into {@code (i|u)vec4} array. */
    public static void shaderc_spvc_compile_options_set_flatten_ubo(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_flatten_ubo;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_glsl_language_version ] ---

    /**
     * Set GLSL language version.
     * 
     * <p>Default is 450 (i.e. 4.5).</p>
     */
    public static void shaderc_spvc_compile_options_set_glsl_language_version(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_glsl_language_version;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_flatten_multidimensional_arrays ] ---

    /** If true, flatten multidimensional arrays, e.g. {@code foo[a][b][c] -> foo[a*b*c]}. Default is false. */
    public static void shaderc_spvc_compile_options_set_flatten_multidimensional_arrays(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_flatten_multidimensional_arrays;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_es ] ---

    /** Force interpretion as ES, or not. Default is to detect from source. */
    public static void shaderc_spvc_compile_options_set_es(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_es;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_glsl_emit_push_constant_as_ubo ] ---

    /** If true, emit push constants as uniform buffer objects. Default is false. */
    public static void shaderc_spvc_compile_options_set_glsl_emit_push_constant_as_ubo(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_glsl_emit_push_constant_as_ubo;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_language_version ] ---

    /**
     * Set MSL language version.
     * 
     * <p>Default is 10200 (i.e. 1.2).</p>
     */
    public static void shaderc_spvc_compile_options_set_msl_language_version(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_msl_language_version;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, version, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_swizzle_texture_samples ] ---

    /** If true, swizzle MSL texture samples. Default is false. */
    public static void shaderc_spvc_compile_options_set_msl_swizzle_texture_samples(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_swizzle_texture_samples;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_platform ] ---

    /** Choose MSL platform. Default is MacOS. */
    public static void shaderc_spvc_compile_options_set_msl_platform(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("shaderc_spvc_msl_platform") int platform) {
        long __functionAddress = Functions.compile_options_set_msl_platform;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, platform, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_pad_fragment_output ] ---

    /** If true, pad MSL fragment output. Default is false. */
    public static void shaderc_spvc_compile_options_set_msl_pad_fragment_output(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_pad_fragment_output;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_capture ] ---

    /** If true, capture MSL output to buffer. Default is false. */
    public static void shaderc_spvc_compile_options_set_msl_capture(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_capture;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_domain_lower_left ] ---

    /** If true, flip the Y-coord of the built-in {@code TessCoord}. Default is top left. */
    public static void shaderc_spvc_compile_options_set_msl_domain_lower_left(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_domain_lower_left;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_argument_buffers ] ---

    /** Enable use of MSL 2.0 indirect argument buffers. Default is not to use them. */
    public static void shaderc_spvc_compile_options_set_msl_argument_buffers(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_argument_buffers;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets compile_options_set_msl_discrete_descriptor_sets} */
    public static void nshaderc_spvc_compile_options_set_msl_discrete_descriptor_sets(long options, long descriptors, long num_descriptors) {
        long __functionAddress = Functions.compile_options_set_msl_discrete_descriptor_sets;
        if (CHECKS) {
            check(options);
        }
        invokePPPV(options, descriptors, num_descriptors, __functionAddress);
    }

    /**
     * When using MSL argument buffers, force "classic" MSL 1.0 binding for the given descriptor sets. This corresponds to {@code VK_KHR_push_descriptor} in
     * Vulkan.
     */
    public static void shaderc_spvc_compile_options_set_msl_discrete_descriptor_sets(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t const *") IntBuffer descriptors) {
        nshaderc_spvc_compile_options_set_msl_discrete_descriptor_sets(options, memAddress(descriptors), descriptors.remaining());
    }

    // --- [ shaderc_spvc_compile_options_set_msl_enable_point_size_builtin ] ---

    /** Set whether or not {@code PointSize} builtin is used for MSL shaders. */
    public static void shaderc_spvc_compile_options_set_msl_enable_point_size_builtin(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_msl_enable_point_size_builtin;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_msl_buffer_size_buffer_index ] ---

    /** Set the index in the buffer size in the buffer for MSL. */
    public static void shaderc_spvc_compile_options_set_msl_buffer_size_buffer_index(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int index) {
        long __functionAddress = Functions.compile_options_set_msl_buffer_size_buffer_index;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, index, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_hlsl_shader_model ] ---

    /**
     * Set HLSL shader model.
     * 
     * <p>Default is 30.</p>
     */
    public static void shaderc_spvc_compile_options_set_hlsl_shader_model(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint32_t") int model) {
        long __functionAddress = Functions.compile_options_set_hlsl_shader_model;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, model, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_hlsl_point_size_compat ] ---

    /** If true, ignore {@code PointSize}. Default is false. */
    public static void shaderc_spvc_compile_options_set_hlsl_point_size_compat(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_hlsl_point_size_compat;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_hlsl_point_coord_compat ] ---

    /** If true, ignore {@code PointCoord}. Default is false. */
    public static void shaderc_spvc_compile_options_set_hlsl_point_coord_compat(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_hlsl_point_coord_compat;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_fixup_clipspace ] ---

    /**
     * If true (default is false):
     * 
     * <ul>
     * <li>GLSL: map depth from Vulkan/D3D style to GL style, i.e. {@code [ 0,w] -> [-w,w]}</li>
     * <li>MSL : map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}</li>
     * <li>HLSL: map depth from GL style to Vulkan/D3D style, i.e. {@code [-w,w] -> [ 0,w]}</li>
     * </ul>
     */
    public static void shaderc_spvc_compile_options_set_fixup_clipspace(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_fixup_clipspace;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_flip_vert_y ] ---

    /**
     * If true invert {@code gl_Position.y} or equivalent.
     * 
     * <p>Default is false.</p>
     */
    public static void shaderc_spvc_compile_options_set_flip_vert_y(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_flip_vert_y;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_validate ] ---

    /** Set if validation should be performed. Default is true. */
    public static void shaderc_spvc_compile_options_set_validate(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_validate;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_optimize ] ---

    /** Set if optimization should be performed. Default is true. */
    public static void shaderc_spvc_compile_options_set_optimize(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("bool") boolean b) {
        long __functionAddress = Functions.compile_options_set_optimize;
        if (CHECKS) {
            check(options);
        }
        invokePV(options, b, __functionAddress);
    }

    // --- [ shaderc_spvc_compile_options_set_for_fuzzing ] ---

    /** Unsafe version of: {@link #shaderc_spvc_compile_options_set_for_fuzzing compile_options_set_for_fuzzing} */
    public static long nshaderc_spvc_compile_options_set_for_fuzzing(long options, long data, long size) {
        long __functionAddress = Functions.compile_options_set_for_fuzzing;
        if (CHECKS) {
            check(options);
        }
        return invokePPPP(options, data, size, __functionAddress);
    }

    /**
     * Fill options with given data.
     *
     * @return amount of data used, or zero if not enough data was given
     */
    @NativeType("size_t")
    public static long shaderc_spvc_compile_options_set_for_fuzzing(@NativeType("shaderc_spvc_compile_options_t") long options, @NativeType("uint8_t const *") ByteBuffer data) {
        return nshaderc_spvc_compile_options_set_for_fuzzing(options, memAddress(data), data.remaining());
    }

    // --- [ shaderc_spvc_initialize_for_glsl ] ---

    /** Unsafe version of: {@link #shaderc_spvc_initialize_for_glsl initialize_for_glsl} */
    public static int nshaderc_spvc_initialize_for_glsl(long context, long source, long source_len, long options) {
        long __functionAddress = Functions.initialize_for_glsl;
        if (CHECKS) {
            check(context);
            check(options);
        }
        return invokePPPPI(context, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to GLSL and performing reflection. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_initialize_for_glsl(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_initialize_for_glsl(context, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_initialize_for_hlsl ] ---

    /** Unsafe version of: {@link #shaderc_spvc_initialize_for_hlsl initialize_for_hlsl} */
    public static int nshaderc_spvc_initialize_for_hlsl(long context, long source, long source_len, long options) {
        long __functionAddress = Functions.initialize_for_hlsl;
        if (CHECKS) {
            check(context);
            check(options);
        }
        return invokePPPPI(context, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to HLSL and performing reflection. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_initialize_for_hlsl(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_initialize_for_hlsl(context, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_initialize_for_msl ] ---

    /** Unsafe version of: {@link #shaderc_spvc_initialize_for_msl initialize_for_msl} */
    public static int nshaderc_spvc_initialize_for_msl(long context, long source, long source_len, long options) {
        long __functionAddress = Functions.initialize_for_msl;
        if (CHECKS) {
            check(context);
            check(options);
        }
        return invokePPPPI(context, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to MSL and performing reflection. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_initialize_for_msl(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_initialize_for_msl(context, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_initialize_for_vulkan ] ---

    /** Unsafe version of: {@link #shaderc_spvc_initialize_for_vulkan initialize_for_vulkan} */
    public static int nshaderc_spvc_initialize_for_vulkan(long context, long source, long source_len, long options) {
        long __functionAddress = Functions.initialize_for_vulkan;
        if (CHECKS) {
            check(context);
            check(options);
        }
        return invokePPPPI(context, source, source_len, options, __functionAddress);
    }

    /** Takes SPIR-V as a sequence of 32-bit words, validates it, then creates the internal compiler for translating to Vulkan and performing reflection. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_initialize_for_vulkan(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t const *") IntBuffer source, @NativeType("shaderc_spvc_compile_options_t") long options) {
        return nshaderc_spvc_initialize_for_vulkan(context, memAddress(source), source.remaining(), options);
    }

    // --- [ shaderc_spvc_compile_shader ] ---

    /** Given an initialized compiler, generates a shader of the appropriate language. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_compile_shader(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("shaderc_spvc_compilation_result_t") long result) {
        long __functionAddress = Functions.compile_shader;
        if (CHECKS) {
            check(context);
            check(result);
        }
        return invokePPI(context, result, __functionAddress);
    }

    // --- [ shaderc_spvc_get_decoration ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_decoration get_decoration} */
    public static int nshaderc_spvc_get_decoration(long context, int id, int decoration, long value) {
        long __functionAddress = Functions.get_decoration;
        if (CHECKS) {
            check(context);
        }
        return invokePPI(context, id, decoration, value, __functionAddress);
    }

    /**
     * Get spirv_cross decoration.
     * 
     * <p>Given an id and a decoration, result is sent out through {@code argument}. If {@code id} does not exist, returns an error.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_decoration(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t") int id, @NativeType("shaderc_spvc_decoration") int decoration, @NativeType("uint32_t *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nshaderc_spvc_get_decoration(context, id, decoration, memAddress(value));
    }

    // --- [ shaderc_spvc_unset_decoration ] ---

    /**
     * Unset spirv_cross decoration.
     * 
     * <p>Given an id and a decoration. Assuming {@code id} is valid.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_unset_decoration(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t") int id, @NativeType("shaderc_spvc_decoration") int decoration) {
        long __functionAddress = Functions.unset_decoration;
        if (CHECKS) {
            check(context);
        }
        return invokePI(context, id, decoration, __functionAddress);
    }

    // --- [ shaderc_spvc_set_name ] ---

    /** Unsafe version of: {@link #shaderc_spvc_set_name set_name} */
    public static void nshaderc_spvc_set_name(long context, int id, long name) {
        long __functionAddress = Functions.set_name;
        if (CHECKS) {
            check(context);
        }
        invokePPV(context, id, name, __functionAddress);
    }

    /**
     * Set {@code name} on a given {@code id}.
     * 
     * <p>Assuming {@code id} is valid.</p>
     */
    public static void shaderc_spvc_set_name(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t") int id, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nshaderc_spvc_set_name(context, id, memAddress(name));
    }

    /**
     * Set {@code name} on a given {@code id}.
     * 
     * <p>Assuming {@code id} is valid.</p>
     */
    public static void shaderc_spvc_set_name(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t") int id, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nshaderc_spvc_set_name(context, id, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_spvc_build_combined_image_samplers ] ---

    /** Analyzes all separate image and samplers used from the currently selected entry point, and re-routes them all to a combined image sampler instead. */
    public static void shaderc_spvc_build_combined_image_samplers(@NativeType("shaderc_spvc_context_t const") long context) {
        long __functionAddress = Functions.build_combined_image_samplers;
        if (CHECKS) {
            check(context);
        }
        invokePV(context, __functionAddress);
    }

    // --- [ shaderc_spvc_get_combined_image_samplers ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_combined_image_samplers get_combined_image_samplers} */
    public static void nshaderc_spvc_get_combined_image_samplers(long context, long samplers, long num_samplers) {
        long __functionAddress = Functions.get_combined_image_samplers;
        if (CHECKS) {
            check(context);
        }
        invokePPPV(context, samplers, num_samplers, __functionAddress);
    }

    /**
     * Returns the combined image samplers.
     * 
     * <p>If {@code samplers} is {@code NULL}, then {@code num_samplers} is set, and no data is copied. The caller is responsible for {@code samplers} being large
     * enough to contain all of the data.</p>
     */
    public static void shaderc_spvc_get_combined_image_samplers(@NativeType("shaderc_spvc_context_t const") long context, @Nullable @NativeType("shaderc_spvc_combined_image_sampler *") ShadercSPVCCombinedImageSampler samplers, @NativeType("size_t *") PointerBuffer num_samplers) {
        if (CHECKS) {
            check(num_samplers, 1);
        }
        nshaderc_spvc_get_combined_image_samplers(context, memAddressSafe(samplers), memAddress(num_samplers));
    }

    // --- [ shaderc_spvc_set_decoration ] ---

    /**
     * Set spirv_cross decoration.
     * 
     * <p>Given an {@code id}, {@code decoration} and {@code argument}, the {@code decoration} flag on the {@code id} is set. Assuming {@code id} is valid.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_set_decoration(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("uint32_t") int id, @NativeType("shaderc_spvc_decoration") int decoration, @NativeType("uint32_t") int argument) {
        long __functionAddress = Functions.set_decoration;
        if (CHECKS) {
            check(context);
        }
        return invokePI(context, id, decoration, argument, __functionAddress);
    }

    // --- [ shaderc_spvc_add_msl_resource_binding ] ---

    /** Unsafe version of: {@link #shaderc_spvc_add_msl_resource_binding add_msl_resource_binding} */
    public static native int nshaderc_spvc_add_msl_resource_binding(long context, long binding, long __functionAddress);

    /** Unsafe version of: {@link #shaderc_spvc_add_msl_resource_binding add_msl_resource_binding} */
    public static int nshaderc_spvc_add_msl_resource_binding(long context, long binding) {
        long __functionAddress = Functions.add_msl_resource_binding;
        if (CHECKS) {
            check(context);
        }
        return nshaderc_spvc_add_msl_resource_binding(context, binding, __functionAddress);
    }

    /** Adds a binding to indicate the MSL buffer, texture or sampler index to use for a particular SPIR-V description set and binding. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_add_msl_resource_binding(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("shaderc_spvc_msl_resource_binding const") ShadercSPVCMSLResourceBinding binding) {
        return nshaderc_spvc_add_msl_resource_binding(context, binding.address());
    }

    // --- [ shaderc_spvc_get_workgroup_size ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_workgroup_size get_workgroup_size} */
    public static int nshaderc_spvc_get_workgroup_size(long context, long function_name, int execution_model, long workgroup_size) {
        long __functionAddress = Functions.get_workgroup_size;
        if (CHECKS) {
            check(context);
        }
        return invokePPPI(context, function_name, execution_model, workgroup_size, __functionAddress);
    }

    /** Gets workgroup size for an entry point defined by a given execution model and function name. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_workgroup_size(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("char const *") ByteBuffer function_name, @NativeType("shaderc_spvc_execution_model") int execution_model, @NativeType("shaderc_spvc_workgroup_size *") ShadercSPVCWorkgroupSize.Buffer workgroup_size) {
        if (CHECKS) {
            checkNT1(function_name);
            check(workgroup_size, 1);
        }
        return nshaderc_spvc_get_workgroup_size(context, memAddress(function_name), execution_model, workgroup_size.address());
    }

    /** Gets workgroup size for an entry point defined by a given execution model and function name. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_workgroup_size(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("char const *") CharSequence function_name, @NativeType("shaderc_spvc_execution_model") int execution_model, @NativeType("shaderc_spvc_workgroup_size *") ShadercSPVCWorkgroupSize.Buffer workgroup_size) {
        if (CHECKS) {
            check(workgroup_size, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(function_name, true);
            long function_nameEncoded = stack.getPointerAddress();
            return nshaderc_spvc_get_workgroup_size(context, function_nameEncoded, execution_model, workgroup_size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ shaderc_spvc_needs_buffer_size_buffer ] ---

    /** Unsafe version of: {@link #shaderc_spvc_needs_buffer_size_buffer needs_buffer_size_buffer} */
    public static int nshaderc_spvc_needs_buffer_size_buffer(long context, long b) {
        long __functionAddress = Functions.needs_buffer_size_buffer;
        if (CHECKS) {
            check(context);
        }
        return invokePPI(context, b, __functionAddress);
    }

    /** Gets whether or not the shader needes a buffer of buffer sizes. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_needs_buffer_size_buffer(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("bool *") ByteBuffer b) {
        if (CHECKS) {
            check(b, 1);
        }
        return nshaderc_spvc_needs_buffer_size_buffer(context, memAddress(b));
    }

    // --- [ shaderc_spvc_get_execution_model ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_execution_model get_execution_model} */
    public static int nshaderc_spvc_get_execution_model(long context, long execution_model) {
        long __functionAddress = Functions.get_execution_model;
        if (CHECKS) {
            check(context);
        }
        return invokePPI(context, execution_model, __functionAddress);
    }

    /** Gets the execution model for the shader parsed by the compiler. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_execution_model(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("shaderc_spvc_execution_model *") IntBuffer execution_model) {
        if (CHECKS) {
            check(execution_model, 1);
        }
        return nshaderc_spvc_get_execution_model(context, memAddress(execution_model));
    }

    // --- [ shaderc_spvc_get_push_constant_buffer_count ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_push_constant_buffer_count get_push_constant_buffer_count} */
    public static int nshaderc_spvc_get_push_constant_buffer_count(long context, long count) {
        long __functionAddress = Functions.get_push_constant_buffer_count;
        if (CHECKS) {
            check(context);
        }
        return invokePPI(context, count, __functionAddress);
    }

    /** Gets the number of push constants buffers used by the shader. */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_push_constant_buffer_count(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return nshaderc_spvc_get_push_constant_buffer_count(context, memAddress(count));
    }

    // --- [ shaderc_spvc_get_binding_info ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_binding_info get_binding_info} */
    public static int nshaderc_spvc_get_binding_info(long context, int resource, int binding_type, long bindings, long binding_count) {
        long __functionAddress = Functions.get_binding_info;
        if (CHECKS) {
            check(context);
        }
        return invokePPPI(context, resource, binding_type, bindings, binding_count, __functionAddress);
    }

    /**
     * Fetches all of the binding info for a given shader resource.
     * 
     * <p>If {@code bindings} is null, then {@code binding_count} is populated with the number of entries that would have been written out. The caller is
     * responsible for ensuring that {@code bindings} has enough space allocated to contain all of the entries.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_binding_info(@NativeType("shaderc_spvc_context_t const") long context, @NativeType("shaderc_spvc_shader_resource") int resource, @NativeType("shaderc_spvc_binding_type") int binding_type, @Nullable @NativeType("shaderc_spvc_binding_info *") ShadercSPVCBindingInfo.Buffer bindings, @NativeType("size_t *") PointerBuffer binding_count) {
        if (CHECKS) {
            check(binding_count, 1);
            checkSafe(bindings, binding_count.get(binding_count.position()));
        }
        return nshaderc_spvc_get_binding_info(context, resource, binding_type, memAddressSafe(bindings), memAddress(binding_count));
    }

    // --- [ shaderc_spvc_get_input_stage_location_info ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_input_stage_location_info get_input_stage_location_info} */
    public static int nshaderc_spvc_get_input_stage_location_info(long context, long locations, long location_count) {
        long __functionAddress = Functions.get_input_stage_location_info;
        if (CHECKS) {
            check(context);
        }
        return invokePPPI(context, locations, location_count, __functionAddress);
    }

    /**
     * Fetches the Location decoration information for the stage inputs.
     * 
     * <p>If {@code locations} is null, then {@code location_count} is populated with the number of entries that would have been written out. The caller is
     * responsible for ensuring that {@code locations} has enough space allocated to contain all of the entries.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_input_stage_location_info(@NativeType("shaderc_spvc_context_t const") long context, @Nullable @NativeType("shaderc_spvc_resource_location_info *") ShadercSPVCResourceLocationInfo.Buffer locations, @NativeType("size_t *") PointerBuffer location_count) {
        if (CHECKS) {
            check(location_count, 1);
            checkSafe(locations, location_count.get(location_count.position()));
        }
        return nshaderc_spvc_get_input_stage_location_info(context, memAddressSafe(locations), memAddress(location_count));
    }

    // --- [ shaderc_spvc_get_output_stage_location_info ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_output_stage_location_info get_output_stage_location_info} */
    public static int nshaderc_spvc_get_output_stage_location_info(long context, long locations, long location_count) {
        long __functionAddress = Functions.get_output_stage_location_info;
        if (CHECKS) {
            check(context);
        }
        return invokePPPI(context, locations, location_count, __functionAddress);
    }

    /**
     * Fetches the Location decoration information for the stage outputs.
     * 
     * <p>If {@code locations} is null, then {@code location_count} is populated with the number of entries that would have been written out. The caller is
     * responsible for ensuring that {@code locations} has enough space allocated to contain all of the entries.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_output_stage_location_info(@NativeType("shaderc_spvc_context_t const") long context, @Nullable @NativeType("shaderc_spvc_resource_location_info *") ShadercSPVCResourceLocationInfo.Buffer locations, @NativeType("size_t *") PointerBuffer location_count) {
        if (CHECKS) {
            check(location_count, 1);
            checkSafe(locations, location_count.get(location_count.position()));
        }
        return nshaderc_spvc_get_output_stage_location_info(context, memAddressSafe(locations), memAddress(location_count));
    }

    // --- [ shaderc_spvc_get_output_stage_type_info ] ---

    /** Unsafe version of: {@link #shaderc_spvc_get_output_stage_type_info get_output_stage_type_info} */
    public static int nshaderc_spvc_get_output_stage_type_info(long context, long types, long type_count) {
        long __functionAddress = Functions.get_output_stage_type_info;
        if (CHECKS) {
            check(context);
        }
        return invokePPPI(context, types, type_count, __functionAddress);
    }

    /**
     * Fetches the type information for the stage outputs.
     * 
     * <p>If {@code types} is null, then {@code type_count} is populated with the number of entries that would have been written out. The caller is responsible
     * for ensuring that {@code types} has enough space allocated to contain all of the entries.</p>
     */
    @NativeType("shaderc_spvc_status")
    public static int shaderc_spvc_get_output_stage_type_info(@NativeType("shaderc_spvc_context_t const") long context, @Nullable @NativeType("shaderc_spvc_resource_type_info *") ShadercSPVCResourceTypeInfo.Buffer types, @NativeType("size_t *") PointerBuffer type_count) {
        if (CHECKS) {
            check(type_count, 1);
            checkSafe(types, type_count.get(type_count.position()));
        }
        return nshaderc_spvc_get_output_stage_type_info(context, memAddressSafe(types), memAddress(type_count));
    }

    // --- [ shaderc_spvc_result_create ] ---

    /**
     * Creates an instant of compilation result data structure.
     * 
     * <p>A return of {@code NULL} indicates that there was an error creating the structure. Any function operating on {@code shaderc_spvc_compilation_result_t} must
     * offer the basic thread-safety guarantee.</p>
     */
    @NativeType("shaderc_spvc_compilation_result_t")
    public static long shaderc_spvc_result_create() {
        long __functionAddress = Functions.result_create;
        return invokeP(__functionAddress);
    }

    // --- [ shaderc_spvc_result_destroy ] ---

    /**
     * Destroys the resources held by the result object.
     * 
     * <p>It is invalid to use the result object for any further operations.</p>
     */
    public static void shaderc_spvc_result_destroy(@NativeType("shaderc_spvc_compilation_result_t") long result) {
        long __functionAddress = Functions.result_destroy;
        if (CHECKS) {
            check(result);
        }
        invokePV(result, __functionAddress);
    }

    // --- [ shaderc_spvc_result_get_string_output ] ---

    /** Unsafe version of: {@link #shaderc_spvc_result_get_string_output result_get_string_output} */
    public static long nshaderc_spvc_result_get_string_output(long result) {
        long __functionAddress = Functions.result_get_string_output;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /**
     * Get validation/compilation result as a string.
     * 
     * <p>This is only supported compiling to GLSL, HSL, and MSL.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String shaderc_spvc_result_get_string_output(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __result = nshaderc_spvc_result_get_string_output(result);
        return memUTF8Safe(__result);
    }

    // --- [ shaderc_spvc_result_get_binary_output ] ---

    /** Unsafe version of: {@link #shaderc_spvc_result_get_binary_output result_get_binary_output} */
    public static long nshaderc_spvc_result_get_binary_output(long result) {
        long __functionAddress = Functions.result_get_binary_output;
        if (CHECKS) {
            check(result);
        }
        return invokePP(result, __functionAddress);
    }

    /**
     * Get validation/compilation result as a binary buffer.
     * 
     * <p>This is only supported compiling to Vulkan.</p>
     */
    @Nullable
    @NativeType("uint32_t const *")
    public static IntBuffer shaderc_spvc_result_get_binary_output(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __result = nshaderc_spvc_result_get_binary_output(result);
        return memIntBufferSafe(__result, shaderc_spvc_result_get_binary_length(result));
    }

    /**
     * Get validation/compilation result as a binary buffer.
     * 
     * <p>This is only supported compiling to Vulkan.</p>
     */
    @Nullable
    @NativeType("uint32_t const *")
    public static IntBuffer shaderc_spvc_result_get_binary_output(@NativeType("shaderc_spvc_compilation_result_t const") long result, long length) {
        long __result = nshaderc_spvc_result_get_binary_output(result);
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ shaderc_spvc_result_get_binary_length ] ---

    /**
     * Get length of validation/compilation result as a binary buffer.
     * 
     * <p>This is only supported compiling to Vulkan.</p>
     */
    @NativeType("uint32_t")
    public static int shaderc_spvc_result_get_binary_length(@NativeType("shaderc_spvc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_binary_length;
        if (CHECKS) {
            check(result);
        }
        return invokePI(result, __functionAddress);
    }

}