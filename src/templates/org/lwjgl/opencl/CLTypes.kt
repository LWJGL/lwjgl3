/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl

import org.lwjgl.generator.*

val OPENCL_PACKAGE = "org.lwjgl.opencl"

// void

val cl_void_p = PointerType("cl_void", PointerMapping.DATA)
val cl_void_pp = PointerType(cl_void_p) // same as above

val voidptr = PointerType("void") // Naked pointer

// numeric

val cl_char = PrimitiveType("cl_char", PrimitiveMapping.BYTE)
val cl_uchar = PrimitiveType("cl_uchar", PrimitiveMapping.BYTE)
val cl_short = PrimitiveType("cl_short", PrimitiveMapping.SHORT)
val cl_ushort = PrimitiveType("cl_ushort", PrimitiveMapping.SHORT)
val cl_int = PrimitiveType("cl_int", PrimitiveMapping.INT)
val cl_uint = PrimitiveType("cl_uint", PrimitiveMapping.INT)
val cl_long = PrimitiveType("cl_long", PrimitiveMapping.LONG)
val cl_ulong = PrimitiveType("cl_ulong", PrimitiveMapping.LONG)
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

val cl_platform_id = ObjectType("CLPlatform", "cl_platform_id")
val cl_device_id = ObjectType("CLDevice", "cl_device_id")
val cl_context = ObjectType("CLContext", "cl_context")
val cl_command_queue = ObjectType("CLCommandQueue", "cl_command_queue")
val cl_mem = ObjectType("CLMem", "cl_mem")
val cl_program = ObjectType("CLProgram", "cl_program")
val cl_kernel = ObjectType("CLKernel", "cl_kernel")
val cl_event = ObjectType("CLEvent", "cl_event")
val cl_sampler = ObjectType("CLSampler", "cl_sampler")

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

val cl_bool = PrimitiveType("cl_bool", cl_uint);
val cl_bitfield = PrimitiveType("cl_bitfield", cl_ulong)
val cl_device_type = PrimitiveType("cl_device_type", cl_bitfield)
val cl_platform_info = PrimitiveType("cl_platform_info", cl_uint)
val cl_device_info = PrimitiveType("cl_device_info", cl_uint)
val cl_device_fp_config = PrimitiveType("cl_device_fp_config", cl_bitfield)
val cl_device_mem_cache_type = PrimitiveType("cl_device_mem_cache_type", cl_uint)
val cl_device_local_mem_type = PrimitiveType("cl_device_local_mem_type", cl_uint)
val cl_device_exec_capabilities = PrimitiveType("cl_device_exec_capabilities", cl_bitfield)
val cl_command_queue_properties = PrimitiveType("cl_command_queue_properties", cl_bitfield)
val cl_device_partition_property = PointerType("cl_device_partition_property", PointerMapping.DATA_POINTER)
val cl_device_affinity_domain = PrimitiveType("cl_device_affinity_domain", cl_bitfield)

val cl_context_properties = PrimitiveType("cl_context_properties", PrimitiveMapping.PTR)
val cl_context_info = PrimitiveType("cl_context_info", cl_uint)
val cl_command_queue_info = PrimitiveType("cl_command_queue_info", cl_uint)
val cl_channel_order = PrimitiveType("cl_channel_order", cl_uint)
val cl_channel_type = PrimitiveType("cl_channel_type", cl_uint)
val cl_mem_flags = PrimitiveType("cl_mem_flags", cl_bitfield)
val cl_mem_object_type = PrimitiveType("cl_mem_object_type", cl_uint)
val cl_mem_info = PrimitiveType("cl_mem_info", cl_uint)
val cl_mem_migration_flags = PrimitiveType("cl_mem_migration_flags", cl_bitfield)
val cl_image_info = PrimitiveType("cl_image_info", cl_uint)
val cl_buffer_create_type = PrimitiveType("cl_buffer_create_type", cl_uint)
val cl_addressing_mode = PrimitiveType("cl_addressing_mode", cl_uint)
val cl_filter_mode = PrimitiveType("cl_filter_mode", cl_uint)
val cl_sampler_info = PrimitiveType("cl_sampler_info", cl_uint)
val cl_map_flags = PrimitiveType("cl_map_flags", cl_bitfield)
val cl_program_info = PrimitiveType("cl_program_info", cl_uint)
val cl_program_build_info = PrimitiveType("cl_program_build_info", cl_uint)
val cl_program_binary_type = PrimitiveType("cl_program_binary_type", cl_uint)
val cl_build_status = PrimitiveType("cl_build_status", cl_int)
val cl_kernel_info = PrimitiveType("cl_kernel_info", cl_uint)
val cl_kernel_arg_info = PrimitiveType("cl_kernel_arg_info", cl_uint)
val cl_kernel_arg_address_qualifier = PrimitiveType("cl_kernel_arg_address_qualifier", cl_uint)
val cl_kernel_arg_access_qualifier = PrimitiveType("cl_kernel_arg_access_qualifier", cl_uint)
val cl_kernel_arg_type_qualifier = PrimitiveType("cl_kernel_arg_type_qualifier", cl_bitfield)
val cl_kernel_work_group_info = PrimitiveType("cl_kernel_work_group_info", cl_uint)
val cl_event_info = PrimitiveType("cl_event_info", cl_uint)
val cl_command_type = PrimitiveType("cl_command_type", cl_uint)
val cl_profiling_info = PrimitiveType("cl_profiling_info", cl_uint)

val cl_context_properties_p = PointerType(cl_context_properties)

// strings

val cl_charASCII_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.ASCII)
val cl_charASCII_pp = PointerType(cl_charASCII_p)

val cl_charUTF8_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.UTF8)
val cl_charUTF8_pp = PointerType(cl_charUTF8_p)

// structs

val cl_image_format = StructType(
	struct(OPENCL_PACKAGE, "cl_image_format") {
		javaDoc("Image format struct.")
		nativeImport("OpenCL.h")
		cl_channel_order.member("image_channel_order")
		cl_channel_type.member("image_channel_data_type")
	}
)
val cl_image_format_p = StructType(cl_image_format)

val cl_image_desc = StructType(
	struct(OPENCL_PACKAGE, "cl_image_desc") {
		javaDoc("Image description struct.")
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
		cl_mem.member("buffer")
	}
)
val cl_image_desc_p = StructType(cl_image_desc)

val cl_bus_address_amd = StructType(
	struct(OPENCL_PACKAGE, "cl_bus_address_amd") {
		javaDoc("Used in {@link AMDBusAddressableMemory#clEnqueueMakeBuffersResidentAMD}.")
		nativeImport("OpenCL.h")
		cl_ulong.member("surface_bus_address")
		cl_ulong.member("marker_bus_address")
	}
)
val cl_bus_address_amd_p = StructType(cl_bus_address_amd)

fun config() {
	struct(OPENCL_PACKAGE, "cl_buffer_region") {
		javaDoc("Buffer region struct.")
		nativeImport("OpenCL.h")
		size_t.member("origin")
		size_t.member("size")
	}

	struct(OPENCL_PACKAGE, "cl_device_topology_amd") {
		javaDoc("The struct returned by {@link CL10#clGetDeviceInfo} with {@code param_name} set to {@link AMDDeviceTopology#CL_DEVICE_TOPOLOGY_AMD}.")
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

// OpenGL interop

val cl_gl_context_info = PrimitiveType("cl_gl_context_info", PrimitiveMapping.INT)
val cl_gl_platform_info = PrimitiveType("cl_gl_platform_info", PrimitiveMapping.INT)

val cl_gl_object_type = PrimitiveType("cl_gl_object_type", PrimitiveMapping.INT)
val cl_gl_object_type_p = PointerType(cl_gl_object_type)

val cl_gl_texture_info = PrimitiveType("cl_gl_texture_info", PrimitiveMapping.INT)