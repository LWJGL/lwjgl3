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

val khr_3d_image_writes = EXT_FLAG.nativeClassCL("khr_3d_image_writes", KHR)
val khr_byte_addressable_store = EXT_FLAG.nativeClassCL("khr_byte_addressable_store", KHR)

val khr_global_int32_base_atomics = EXT_FLAG.nativeClassCL("khr_global_int32_base_atomics", KHR)
val khr_global_int32_extended_atomics = EXT_FLAG.nativeClassCL("khr_global_int32_extended_atomics", KHR)

val khr_local_int32_base_atomics = EXT_FLAG.nativeClassCL("khr_local_int32_base_atomics", KHR)
val khr_local_int32_extended_atomics = EXT_FLAG.nativeClassCL("khr_local_int32_extended_atomics", KHR)

val khr_int64_base_atomics = EXT_FLAG.nativeClassCL("khr_int64_base_atomics", KHR)
val khr_int64_extended_atomics = EXT_FLAG.nativeClassCL("khr_int64_extended_atomics", KHR)

val khr_select_fprounding_mode = EXT_FLAG.nativeClassCL("khr_select_fprounding_mode", KHR)

val khr_spir = EXT_FLAG.nativeClassCL("khr_spir", KHR)

val amd_fp64 = EXT_FLAG.nativeClassCL("amd_fp64", AMD)
val amd_vec3 = EXT_FLAG.nativeClassCL("amd_vec3", AMD)
val amd_compile_options = EXT_FLAG.nativeClassCL("amd_compile_options", AMD)
val amd_event_callback = EXT_FLAG.nativeClassCL("amd_event_callback", AMD)
val amd_popcnt = EXT_FLAG.nativeClassCL("amd_popcnt", AMD)
val amd_media_ops = EXT_FLAG.nativeClassCL("amd_media_ops", AMD)
val amd_media_ops2 = EXT_FLAG.nativeClassCL("amd_media_ops2", AMD)
val amd_printf = EXT_FLAG.nativeClassCL("amd_printf", AMD)
val amd_predefined_macros = EXT_FLAG.nativeClassCL("amd_predefined_macros", AMD)

val intel_printf = EXT_FLAG.nativeClassCL("intel_printf", INTEL)

val nv_compiler_options = EXT_FLAG.nativeClassCL("nv_compiler_options", NV)
val nv_pragma_unroll = EXT_FLAG.nativeClassCL("nv_pragma_unroll", NV)