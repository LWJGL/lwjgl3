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

val cl_image_format = struct(OPENCL_PACKAGE, "CLImageFormat", structName = "cl_image_format") {
	documentation = "Image format struct."
	nativeImport("OpenCL.h")
	cl_channel_order.member("image_channel_order")
	cl_channel_type.member("image_channel_data_type")
}.nativeType
val cl_image_format_p = StructType(cl_image_format)

val cl_image_desc = struct(OPENCL_PACKAGE, "CLImageDesc", structName = "cl_image_desc") {
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
}.nativeType
val cl_image_desc_p = StructType(cl_image_desc)

val cl_bus_address_amd = struct(OPENCL_PACKAGE, "CLBusAddressAMD", structName = "cl_bus_address_amd") {
	documentation = "Used in AMDBusAddressableMemory##clEnqueueMakeBuffersResidentAMD()."
	nativeImport("OpenCL.h")
	cl_long.member("surface_bus_address")
	cl_long.member("marker_bus_address")
}.nativeType
val cl_bus_address_amd_p = StructType(cl_bus_address_amd)

fun config() {
	struct(OPENCL_PACKAGE, "CLBufferRegion", structName = "cl_buffer_region") {
		documentation = "Buffer region struct."
		nativeImport("OpenCL.h")
		size_t.member("origin")
		size_t.member("size")
	}

	struct(OPENCL_PACKAGE, "CLDeviceTopologyAMD", structName = "cl_device_topology_amd") {
		documentation =
			"The struct returned by CL10##clGetDeviceInfo() with {@code param_name} set to AMDDeviceTopology##CL_DEVICE_TOPOLOGY_AMD."
		nativeImport("OpenCL.h")
		struct {
			cl_uint.member("type")
			cl_uint.member("data", size = 5)
		}.member("raw")
		struct {
			cl_uint.member("type")
			//cl_char.member("unused", size = 17)
			cl_char.member("bus")
			cl_char.member("device")
			cl_char.member("function")
		}.member("pcie")
	}

	struct(OPENCL_PACKAGE, "CLMotionEstimationDescINTEL", structName = "cl_motion_estimation_desc_intel") {
		documentation = "Describes the configuration of the motion estimation algorithm."
		nativeImport("OpenCL.h")
		cl_uint.member("mb_block_type");
		cl_uint.member("subpixel_mode");
		cl_uint.member("sad_adjust_mode");
		cl_uint.member("search_path_type");
	}
}

// callback functions
val cl_create_context_callback = CallbackType(callback(
	OPENCL_PACKAGE, void, "CLCreateContextCallback",
	"Will be called when a debug message is generated.",
	const _ cl_charUTF8_p.IN("errinfo", "a pointer to the message string representation"),
	const _ void_p.IN(
		"private_info",
		"a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in debugging the error"
	),
	size_t.IN("cb", "the number of bytes in the {@code private_info} pointer"),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL10##clCreateContext() or CL10##clCreateContextFromType()"),
	samConstructor = "CL10"
) {
	documentation = "Instances of this interface may be passed to the CL10##clCreateContext() and CL10##clCreateContextFromType() methods."
	CALL_CONVENTION_SYSTEM
}, "cl_create_context_callback")

val cl_program_callback = CallbackType(callback(
	OPENCL_PACKAGE, void, "CLProgramCallback",
	"Will be called when the program is built, compiled or linked.",
	cl_program.IN("program", "the program that was built, compiled or linked"),
	void_p.IN(
		"user_data",
		"the user-specified value that was passed when calling CL10##clBuildProgram(), CL12##clCompileProgram() or CL12##clLinkProgram()"
	),
	samConstructor = "CL10"
) {
	documentation = "Instances of this interface may be passed to the CL10##clBuildProgram(), CL12##clCompileProgram() and CL12##clLinkProgram() methods."
	CALL_CONVENTION_SYSTEM
}, "cl_program_callback")

val cl_native_kernel = CallbackType(callback(
	OPENCL_PACKAGE, void, "CLNativeKernel",
	"Will be called by the OpenCL using CL10##clEnqueueNativeKernel().",
	void_p.IN("args", "a pointer to the arguments list"),
	samConstructor = "CL10"
) {
	documentation = "Instances of this interface may be passed to the CL10##clEnqueueNativeKernel() method."
	CALL_CONVENTION_SYSTEM
}, "cl_native_kernel")

val cl_mem_object_destructor_callback = CallbackType(callback(
	OPENCL_PACKAGE, void, "CLMemObjectDestructorCallback",
	"Will be called when a memory object is deleted.",
	cl_mem.IN("memobj", "the memory object that was deleted"),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL11##clSetMemObjectDestructorCallback()"),
	samConstructor = "CL11"
) {
	documentation = "Instances of this interface may be passed to the CL11##clSetMemObjectDestructorCallback() method."
	CALL_CONVENTION_SYSTEM
}, "cl_mem_object_destructor_callback")

val cl_event_callback = CallbackType(callback(
	OPENCL_PACKAGE, void, "CLEventCallback",
	"""
	Will be called when the execution status of the command associated with {@code event} changes to an execution status equal or past the status specified by
	{@code command_exec_status}."
	""",
	cl_event.IN("event", "the event"),
	cl_int.IN(
		"event_command_exec_status",
	    """
	    represents the execution status of command for which this callback function is invoked. If the callback is called as the result of the command
	    associated with event being abnormally terminated, an appropriate error code for the error that caused the termination will be passed to
	    {@code event_command_exec_status} instead.
	    """
	),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL11##clSetEventCallback()"),
	samConstructor = "CL11"
) {
	documentation = "Instances of this interface may be passed to the CL11##clSetEventCallback() method."
	CALL_CONVENTION_SYSTEM
}, "cl_event_callback")

val cl_svmfree_callback = CallbackType(callback(
	OPENCL_PACKAGE, void, "CLSVMFreeCallback",
	"Will be called to free shared virtual memory pointers.",
	cl_command_queue.IN("queue", "a valid host command-queue"),
	cl_uint.IN("num_svm_pointers", "the number of pointers in the {@code svm_pointers} array"),
	void_pp.IN("svm_pointers", "an array of shared virtual memory pointers to be freed"),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL20##clEnqueueSVMFree()"),
	samConstructor = "CL20"
) {
	documentation = "Instances of this interface may be passed to the CL20##clEnqueueSVMFree() method."
	CALL_CONVENTION_SYSTEM
}, "cl_svmfree_callback")


// OpenGL interop

val cl_gl_context_info = IntegerType("cl_gl_context_info", PrimitiveMapping.INT)
val cl_gl_platform_info = IntegerType("cl_gl_platform_info", PrimitiveMapping.INT)

val cl_gl_object_type = IntegerType("cl_gl_object_type", PrimitiveMapping.INT)
val cl_gl_object_type_p = PointerType(cl_gl_object_type)

val cl_gl_texture_info = IntegerType("cl_gl_texture_info", PrimitiveMapping.INT)

// APPLE

val intptr_t = PrimitiveType("intptr_t", PrimitiveMapping.PTR)
val cl_queue_properties_APPLE = typedef(intptr_t, "cl_queue_properties_APPLE")
val cl_queue_properties_APPLE_p = PointerType(cl_queue_properties_APPLE)

// EXT

val cl_mem_migration_flags_ext = typedef(cl_bitfield, "cl_mem_migration_flags_ext")

// INTEL

val cl_accelerator_intel = PointerType("cl_accelerator_intel", includesPointer = true)
val cl_accelerator_type_intel = typedef(cl_uint, "cl_accelerator_type_intel")
val cl_accelerator_info_intel = typedef(cl_uint, "cl_accelerator_info_intel")