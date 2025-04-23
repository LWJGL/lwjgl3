/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

const val KHR = "KHR"
const val EXT = "EXT"

const val ALTERA = "ALTERA"
const val AMD = "AMD"
const val APPLE = "APPLE"
const val ARM = "ARM"
const val IMG = "IMG"
const val INTEL = "INTEL"
const val NV = "NV"
const val POCL = "POCL"
const val QCOM = "QCOM"

val khr_3d_image_writes = EXT_FLAG.nativeClassCL("khr_3d_image_writes", KHR)
val khr_async_work_group_copy_fence = EXT_FLAG.nativeClassCL("khr_async_work_group_copy_fence", KHR)
val khr_byte_addressable_store = EXT_FLAG.nativeClassCL("khr_byte_addressable_store", KHR)
val khr_device_enqueue_local_arg_types = EXT_FLAG.nativeClassCL("khr_device_enqueue_local_arg_types", KHR)
val khr_expect_assume = EXT_FLAG.nativeClassCL("khr_expect_assume", KHR)
val khr_extended_async_copies = EXT_FLAG.nativeClassCL("khr_extended_async_copies", KHR)
val khr_extended_bit_ops = EXT_FLAG.nativeClassCL("khr_extended_bit_ops", KHR)
val khr_global_int32_base_atomics = EXT_FLAG.nativeClassCL("khr_global_int32_base_atomics", KHR)
val khr_global_int32_extended_atomics = EXT_FLAG.nativeClassCL("khr_global_int32_extended_atomics", KHR)
val khr_int64_base_atomics = EXT_FLAG.nativeClassCL("khr_int64_base_atomics", KHR)
val khr_int64_extended_atomics = EXT_FLAG.nativeClassCL("khr_int64_extended_atomics", KHR)
val khr_local_int32_base_atomics = EXT_FLAG.nativeClassCL("khr_local_int32_base_atomics", KHR)
val khr_local_int32_extended_atomics = EXT_FLAG.nativeClassCL("khr_local_int32_extended_atomics", KHR)
val khr_mipmap_image_writes = EXT_FLAG.nativeClassCL("khr_mipmap_image_writes", KHR)
val khr_select_fprounding_mode = EXT_FLAG.nativeClassCL("khr_select_fprounding_mode", KHR)
val khr_spirv_extended_debug_info = EXT_FLAG.nativeClassCL("khr_spirv_extended_debug_info", KHR)
val khr_spirv_linkonce_odr = EXT_FLAG.nativeClassCL("khr_spirv_linkonce_odr", KHR)
val khr_spirv_no_integer_wrap_decoration = EXT_FLAG.nativeClassCL("khr_spirv_no_integer_wrap_decoration", KHR)
val khr_srgb_image_writes = EXT_FLAG.nativeClassCL("khr_srgb_image_writes", KHR)
val khr_subgroup_ballot = EXT_FLAG.nativeClassCL("khr_subgroup_ballot", KHR)
val khr_subgroup_clustered_reduce = EXT_FLAG.nativeClassCL("khr_subgroup_clustered_reduce", KHR)
val khr_subgroup_extended_types = EXT_FLAG.nativeClassCL("khr_subgroup_extended_types", KHR)
val khr_subgroup_non_uniform_arithmetic = EXT_FLAG.nativeClassCL("khr_subgroup_non_uniform_arithmetic", KHR)
val khr_subgroup_non_uniform_vote = EXT_FLAG.nativeClassCL("khr_subgroup_non_uniform_vote", KHR)
val khr_subgroup_rotate = EXT_FLAG.nativeClassCL("khr_subgroup_rotate", KHR)
val khr_subgroup_shuffle_relative = EXT_FLAG.nativeClassCL("khr_subgroup_shuffle_relative", KHR)
val khr_subgroup_shuffle = EXT_FLAG.nativeClassCL("khr_subgroup_shuffle", KHR)
val khr_work_group_uniform_arithmetic = EXT_FLAG.nativeClassCL("khr_work_group_uniform_arithmetic", KHR)

val amd_compile_options = EXT_FLAG.nativeClassCL("amd_compile_options", AMD)
val amd_event_callback = EXT_FLAG.nativeClassCL("amd_event_callback", AMD)
val amd_fp64 = EXT_FLAG.nativeClassCL("amd_fp64", AMD)
val amd_media_ops = EXT_FLAG.nativeClassCL("amd_media_ops", AMD)
val amd_media_ops2 = EXT_FLAG.nativeClassCL("amd_media_ops2", AMD)
val amd_popcnt = EXT_FLAG.nativeClassCL("amd_popcnt", AMD)
val amd_predefined_macros = EXT_FLAG.nativeClassCL("amd_predefined_macros", AMD)
val amd_printf = EXT_FLAG.nativeClassCL("amd_printf", AMD)
val amd_vec3 = EXT_FLAG.nativeClassCL("amd_vec3", AMD)

val APPLE_fp64_basic_ops = EXT_FLAG.nativeClassCL("APPLE_fp64_basic_ops", APPLE)

val arm_import_memory_host = EXT_FLAG.nativeClassCL("cl_arm_import_memory_host", ARM)
val arm_import_memory_dma_buf = EXT_FLAG.nativeClassCL("cl_arm_import_memory_dma_buf", ARM)
val arm_import_memory_protected = EXT_FLAG.nativeClassCL("cl_arm_import_memory_protected", ARM)
val arm_import_memory_android_hardware_buffer = EXT_FLAG.nativeClassCL("cl_arm_import_memory_android_hardware_buffer", ARM)
val arm_integer_dot_product_int8 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_int8", ARM)
val arm_integer_dot_product_accumulate_int8 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_accumulate_int8", ARM)
val arm_integer_dot_product_accumulate_int16 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_accumulate_int16", ARM)
val arm_integer_dot_product_accumulate_saturate_int8 = EXT_FLAG.nativeClassCL("arm_integer_dot_product_accumulate_saturate_int8", ARM)
val arm_non_uniform_work_group_size = EXT_FLAG.nativeClassCL("arm_non_uniform_work_group_size", ARM)
val arm_thread_limit_hint = EXT_FLAG.nativeClassCL("arm_thread_limit_hint", ARM)

val img_memory_management = EXT_FLAG.nativeClassCL("img_memory_management", IMG)
val img_swap_ops = EXT_FLAG.nativeClassCL("img_swap_ops", IMG)
val img_bitwise_ops = EXT_FLAG.nativeClassCL("img_bitwise_ops", IMG)
val img_matrix_multiply = EXT_FLAG.nativeClassCL("img_matrix_multiply", IMG)

val intel_bfloat16_conversions = EXT_FLAG.nativeClassCL("intel_bfloat16_conversions", INTEL)
val intel_media_block_io = EXT_FLAG.nativeClassCL("intel_media_block_io", INTEL)
val intel_printf = EXT_FLAG.nativeClassCL("intel_printf", INTEL)
val intel_spirv_device_side_avc_motion_estimation = EXT_FLAG.nativeClassCL("intel_spirv_device_side_avc_motion_estimation", INTEL)
val intel_spirv_media_block_io = EXT_FLAG.nativeClassCL("intel_spirv_media_block_io", INTEL)
val intel_spirv_subgroups = EXT_FLAG.nativeClassCL("intel_spirv_subgroups", INTEL)
val intel_split_work_group_barrier = EXT_FLAG.nativeClassCL("intel_split_work_group_barrier", INTEL)
val intel_subgroup_2d_block_io = EXT_FLAG.nativeClassCL("intel_subgroup_2d_block_io", INTEL)
val intel_subgroup_buffer_prefetch = EXT_FLAG.nativeClassCL("intel_subgroup_buffer_prefetch", INTEL)
val intel_subgroup_local_block_io = EXT_FLAG.nativeClassCL("intel_subgroup_local_block_io", INTEL)
val intel_subgroup_matrix_multiply_accumulate = EXT_FLAG.nativeClassCL("intel_subgroup_matrix_multiply_accumulate", INTEL)
val intel_subgroup_split_matrix_multiply_accumulate = EXT_FLAG.nativeClassCL("intel_subgroup_split_matrix_multiply_accumulate", INTEL)
val intel_subgroups_char = EXT_FLAG.nativeClassCL("intel_subgroups_char", INTEL)
val intel_subgroups_long = EXT_FLAG.nativeClassCL("intel_subgroups_long", INTEL)
val intel_subgroups_short = EXT_FLAG.nativeClassCL("intel_subgroups_short", INTEL)

val nv_compiler_options = EXT_FLAG.nativeClassCL("nv_compiler_options", NV)
val nv_copy_opts = EXT_FLAG.nativeClassCL("nv_copy_opts", NV)
val nv_pragma_unroll = EXT_FLAG.nativeClassCL("nv_pragma_unroll", NV)