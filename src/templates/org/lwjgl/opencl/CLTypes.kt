/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl

import org.lwjgl.generator.*

val OPENCL_PACKAGE = "org.lwjgl.opencl"

// numeric

val cl_char = IntegerType("cl_char", PrimitiveMapping.BYTE)
val cl_uchar = IntegerType("cl_uchar", PrimitiveMapping.BYTE, unsigned = true)
val cl_short = IntegerType("cl_short", PrimitiveMapping.SHORT)
val cl_ushort = IntegerType("cl_ushort", PrimitiveMapping.SHORT, unsigned = true)
val cl_int = IntegerType("cl_int", PrimitiveMapping.INT)
val cl_uint = IntegerType("cl_uint", PrimitiveMapping.INT, unsigned = true)
val cl_long = IntegerType("cl_long", PrimitiveMapping.LONG)
val cl_ulong = IntegerType("cl_ulong", PrimitiveMapping.LONG, unsigned = true)
val cl_half = PrimitiveType("cl_half", PrimitiveMapping.SHORT)
val cl_float = PrimitiveType("cl_float", PrimitiveMapping.FLOAT)
val cl_double = PrimitiveType("cl_double", PrimitiveMapping.DOUBLE)

val cl_uchar_p = PointerType(cl_uchar)
val cl_int_p = PointerType(cl_int)
val cl_uint_p = PointerType(cl_uint)
val cl_long_p = PointerType(cl_long)
val cl_ulong_p = PointerType(cl_ulong)
val cl_half_p = PointerType(cl_half)
val cl_float_p = PointerType(cl_float)
val cl_double_p = PointerType(cl_double)

val cl_uchar_pp = PointerType(cl_uchar_p)

// custom numeric

val size_t = PrimitiveType("size_t", PrimitiveMapping.PTR)
val size_t_p = PointerType(size_t)

// objects

val cl_platform_id = PointerType("cl_platform_id", includesPointer = true)
val cl_device_id = PointerType("cl_device_id", includesPointer = true)
val cl_context = PointerType("cl_context", includesPointer = true)
val cl_command_queue = PointerType("cl_command_queue", includesPointer = true)
val cl_mem = PointerType("cl_mem", includesPointer = true)
val cl_program = PointerType("cl_program", includesPointer = true)
val cl_kernel = PointerType("cl_kernel", includesPointer = true)
val cl_event = PointerType("cl_event", includesPointer = true)
val cl_sampler = PointerType("cl_sampler", includesPointer = true)

val cl_platform_id_p = PointerType(cl_platform_id)
val cl_device_id_p = PointerType(cl_device_id)
val cl_context_p = PointerType(cl_context)
val cl_command_queue_p = PointerType(cl_command_queue)
val cl_mem_p = PointerType(cl_mem)
val cl_program_p = PointerType(cl_program)
val cl_kernel_p = PointerType(cl_kernel)
val cl_event_p = PointerType(cl_event)
val cl_sampler_p = PointerType(cl_sampler)

// typedefs

val cl_bool = typedef(cl_uint, "cl_bool");
val cl_bitfield = typedef(cl_ulong, "cl_bitfield")
val cl_device_type = typedef(cl_bitfield, "cl_device_type")
val cl_platform_info = typedef(cl_uint, "cl_platform_info")
val cl_device_info = typedef(cl_uint, "cl_device_info")
val cl_device_fp_config = typedef(cl_bitfield, "cl_device_fp_config")
val cl_device_mem_cache_type = typedef(cl_uint, "cl_device_mem_cache_type")
val cl_device_local_mem_type = typedef(cl_uint, "cl_device_local_mem_type")
val cl_device_exec_capabilities = typedef(cl_bitfield, "cl_device_exec_capabilities")
val cl_command_queue_properties = typedef(cl_bitfield, "cl_command_queue_properties")
val cl_device_partition_property = PointerType("cl_device_partition_property", PointerMapping.DATA_POINTER)
val cl_device_affinity_domain = typedef(cl_bitfield, "cl_device_affinity_domain")

val cl_context_properties = PrimitiveType("cl_context_properties", PrimitiveMapping.PTR)
val cl_context_info = typedef(cl_uint, "cl_context_info")
val cl_command_queue_info = typedef(cl_uint, "cl_command_queue_info")
val cl_channel_order = typedef(cl_uint, "cl_channel_order")
val cl_channel_type = typedef(cl_uint, "cl_channel_type")
val cl_mem_flags = typedef(cl_bitfield, "cl_mem_flags")
val cl_mem_object_type = typedef(cl_uint, "cl_mem_object_type")
val cl_mem_info = typedef(cl_uint, "cl_mem_info")
val cl_mem_migration_flags = typedef(cl_bitfield, "cl_mem_migration_flags")
val cl_image_info = typedef(cl_uint, "cl_image_info")
val cl_buffer_create_type = typedef(cl_uint, "cl_buffer_create_type")
val cl_addressing_mode = typedef(cl_uint, "cl_addressing_mode")
val cl_filter_mode = typedef(cl_uint, "cl_filter_mode")
val cl_sampler_info = typedef(cl_uint, "cl_sampler_info")
val cl_map_flags = typedef(cl_bitfield, "cl_map_flags")
val cl_program_info = typedef(cl_uint, "cl_program_info")
val cl_program_build_info = typedef(cl_uint, "cl_program_build_info")
val cl_program_binary_type = typedef(cl_uint, "cl_program_binary_type")
val cl_build_status = typedef(cl_int, "cl_build_status")
val cl_kernel_info = typedef(cl_uint, "cl_kernel_info")
val cl_kernel_arg_info = typedef(cl_uint, "cl_kernel_arg_info")
val cl_kernel_arg_address_qualifier = typedef(cl_uint, "cl_kernel_arg_address_qualifier")
val cl_kernel_arg_access_qualifier = typedef(cl_uint, "cl_kernel_arg_access_qualifier")
val cl_kernel_arg_type_qualifier = typedef(cl_bitfield, "cl_kernel_arg_type_qualifier")
val cl_kernel_work_group_info = typedef(cl_uint, "cl_kernel_work_group_info")
val cl_event_info = typedef(cl_uint, "cl_event_info")
val cl_command_type = typedef(cl_uint, "cl_command_type")
val cl_profiling_info = typedef(cl_uint, "cl_profiling_info")

val cl_context_properties_p = PointerType(cl_context_properties)

// OpenCL 2.0
val cl_command_queue_properties_p = PointerType(cl_command_queue_properties)

val cl_sampler_properties = typedef(cl_uint, "cl_sampler_properties")
val cl_sampler_properties_p = PointerType(cl_sampler_properties)

val cl_pipe_properties = typedef(cl_uint, "cl_pipe_properties")
val cl_pipe_properties_p = PointerType(cl_pipe_properties)
val cl_pipe_info = typedef(cl_uint, "cl_pipe_info")

val cl_kernel_exec_info = typedef(cl_uint, "cl_kernel_exec_info")
val cl_svm_mem_flags = typedef(cl_bitfield, "cl_svm_mem_flags")

// strings

val cl_charASCII_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.ASCII)
val cl_charASCII_pp = PointerType(cl_charASCII_p)

val cl_charUTF8_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.UTF8)
val cl_charUTF8_pp = PointerType(cl_charUTF8_p)

// structs

val cl_image_format = StructType(
	struct(OPENCL_PACKAGE, "cl_image_format") {
		documentation = "Image format struct."
		nativeImport("OpenCL.h")
		cl_channel_order.member("image_channel_order")
		cl_channel_type.member("image_channel_data_type")
	}
)
val cl_image_format_p = StructType(cl_image_format)

val cl_image_desc = StructType(
	struct(OPENCL_PACKAGE, "cl_image_desc") {
		documentation = "Image description struct."
		nativeImport("OpenCL.h")
		cl_mem_object_type.member("image_type")
		size_t.member("image_width")
		size_t.member("image_height")
		size_t.member("image_depth")
		size_t.member("image_array_size")
		size_t.member("image_row_pitch")
		size_t.member("image_slice_pitch")
		cl_uint.member("num_mip_levels")
		cl_uint.member("num_samples")
		//union {
		cl_mem.member("buffer")
		//cl_mem.member("mem_object") TODO: Missing from Apple's headers
		//}
	}
)
val cl_image_desc_p = StructType(cl_image_desc)

val cl_bus_address_amd = StructType(
	struct(OPENCL_PACKAGE, "cl_bus_address_amd") {
		documentation = "Used in AMDBusAddressableMemory##clEnqueueMakeBuffersResidentAMD()."
		nativeImport("OpenCL.h")
		cl_ulong.member("surface_bus_address")
		cl_ulong.member("marker_bus_address")
	}
)
val cl_bus_address_amd_p = StructType(cl_bus_address_amd)

fun config() {
	struct(OPENCL_PACKAGE, "cl_buffer_region") {
		documentation = "Buffer region struct."
		nativeImport("OpenCL.h")
		size_t.member("origin")
		size_t.member("size")
	}

	struct(OPENCL_PACKAGE, "cl_device_topology_amd") {
		documentation =
			"The struct returned by CL10##clGetDeviceInfo() with {@code param_name} set to AMDDeviceTopology##CL_DEVICE_TOPOLOGY_AMD."
		nativeImport("OpenCL.h")
		struct {
			cl_uint.member("type")
			cl_uint.member("data", size = 5)
		}.member("raw")
		struct {
			cl_uint.member("type")
			cl_char.member("unused", size = 17)
			cl_char.member("bus")
			cl_char.member("device")
			cl_char.member("function")
		}.member("pcie")
	}
}

// callback functions

val cl_create_context_callback = PointerType(name = "cl_create_context_callback", includesPointer = true)
val cl_program_callback = PointerType(name = "cl_program_callback", includesPointer = true)
val cl_native_kernel_func = PointerType(name = "cl_native_kernel_func", includesPointer = true)
val cl_mem_object_destructor_callback = PointerType(name = "cl_mem_object_destructor_callback", includesPointer = true)
val cl_event_callback = PointerType(name = "cl_event_callback", includesPointer = true)
val cl_svmfree_callback = PointerType(name = "cl_svmfree_callback", includesPointer = true)

// OpenGL interop

val cl_gl_context_info = IntegerType("cl_gl_context_info", PrimitiveMapping.INT)
val cl_gl_platform_info = IntegerType("cl_gl_platform_info", PrimitiveMapping.INT)

val cl_gl_object_type = IntegerType("cl_gl_object_type", PrimitiveMapping.INT)
val cl_gl_object_type_p = PointerType(cl_gl_object_type)

val cl_gl_texture_info = IntegerType("cl_gl_texture_info", PrimitiveMapping.INT)