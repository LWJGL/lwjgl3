/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val KHR = "KHR"

val AMD = "AMD"
val APPLE = "APPLE"
val INTEL = "INTEL"
val NV = "NV"

fun khr_3d_image_writes() = EXT_FLAG.nativeClassCL("khr_3d_image_writes", KHR)
fun khr_byte_addressable_store() = EXT_FLAG.nativeClassCL("khr_byte_addressable_store", KHR)

fun khr_global_int32_base_atomics() = EXT_FLAG.nativeClassCL("khr_global_int32_base_atomics", KHR)
fun khr_global_int32_extended_atomics() = EXT_FLAG.nativeClassCL("khr_global_int32_extended_atomics", KHR)

fun khr_local_int32_base_atomics() = EXT_FLAG.nativeClassCL("khr_local_int32_base_atomics", KHR)
fun khr_local_int32_extended_atomics() = EXT_FLAG.nativeClassCL("khr_local_int32_extended_atomics", KHR)

fun khr_int64_base_atomics() = EXT_FLAG.nativeClassCL("khr_int64_base_atomics", KHR)
fun khr_int64_extended_atomics() = EXT_FLAG.nativeClassCL("khr_int64_extended_atomics", KHR)

fun khr_select_fprounding_mode() = EXT_FLAG.nativeClassCL("khr_select_fprounding_mode", KHR)

fun khr_spir() = EXT_FLAG.nativeClassCL("khr_spir", KHR)

fun amd_fp64() = EXT_FLAG.nativeClassCL("amd_fp64", AMD)
fun amd_vec3() = EXT_FLAG.nativeClassCL("amd_vec3", AMD)
fun amd_compile_options() = EXT_FLAG.nativeClassCL("amd_compile_options", AMD)
fun amd_event_callback() = EXT_FLAG.nativeClassCL("amd_event_callback", AMD)
fun amd_popcnt() = EXT_FLAG.nativeClassCL("amd_popcnt", AMD)
fun amd_media_ops() = EXT_FLAG.nativeClassCL("amd_media_ops", AMD)
fun amd_media_ops2() = EXT_FLAG.nativeClassCL("amd_media_ops2", AMD)
fun amd_printf() = EXT_FLAG.nativeClassCL("amd_printf", AMD)
fun amd_predefined_macros() = EXT_FLAG.nativeClassCL("amd_predefined_macros", AMD)

fun intel_printf() = EXT_FLAG.nativeClassCL("intel_printf", INTEL)

fun nv_compiler_options() = EXT_FLAG.nativeClassCL("nv_compiler_options", NV)
fun nv_pragma_unroll() = EXT_FLAG.nativeClassCL("nv_pragma_unroll", NV)