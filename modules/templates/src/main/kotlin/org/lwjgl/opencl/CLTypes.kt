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

val cl_uchar_p = cl_uchar.p
val cl_int_p = cl_int.p
val cl_uint_p = cl_uint.p
val cl_long_p = cl_long.p
val cl_ulong_p = cl_ulong.p
val cl_half_p = cl_half.p
val cl_float_p = cl_float.p
val cl_double_p = cl_double.p

val cl_uchar_pp = cl_uchar_p.p

// objects

val cl_platform_id = "cl_platform_id".opaque_p
val cl_device_id = "cl_device_id".opaque_p
val cl_context = "cl_context".opaque_p
val cl_command_queue = "cl_command_queue".opaque_p
val cl_mem = "cl_mem".opaque_p
val cl_program = "cl_program".opaque_p
val cl_kernel = "cl_kernel".opaque_p
val cl_event = "cl_event".opaque_p
val cl_sampler = "cl_sampler".opaque_p

val cl_platform_id_p = cl_platform_id.p
val cl_device_id_p = cl_device_id.p
val cl_context_p = cl_context.p
val cl_command_queue_p = cl_command_queue.p
val cl_mem_p = cl_mem.p
val cl_program_p = cl_program.p
val cl_kernel_p = cl_kernel.p
val cl_event_p = cl_event.p
val cl_sampler_p = cl_sampler.p

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

val cl_context_properties = PrimitiveType("cl_context_properties", PrimitiveMapping.POINTER)
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

val cl_context_properties_p = cl_context_properties.p

// OpenCL 2.0
val cl_command_queue_properties_p = cl_command_queue_properties.p

val cl_sampler_properties = typedef(cl_uint, "cl_sampler_properties")
val cl_sampler_properties_p = cl_sampler_properties.p

val cl_pipe_properties = typedef(cl_uint, "cl_pipe_properties")
val cl_pipe_properties_p = cl_pipe_properties.p
val cl_pipe_info = typedef(cl_uint, "cl_pipe_info")

val cl_kernel_exec_info = typedef(cl_uint, "cl_kernel_exec_info")
val cl_svm_mem_flags = typedef(cl_bitfield, "cl_svm_mem_flags")

// strings

val cl_charASCII_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.ASCII)
val cl_charASCII_pp = cl_charASCII_p.p

val cl_charUTF8_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.UTF8)
val cl_charUTF8_pp = cl_charUTF8_p.p

// structs

val cl_image_format_p = struct_p(OPENCL_PACKAGE, "CLImageFormat", structName = "cl_image_format") {
	documentation = "Image format struct."
	nativeImport("OpenCL.h")
	cl_channel_order.member("image_channel_order")
	cl_channel_type.member("image_channel_data_type")
}

val cl_image_desc_p = struct_p(OPENCL_PACKAGE, "CLImageDesc", structName = "cl_image_desc") {
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

val cl_bus_address_amd_p = struct_p(OPENCL_PACKAGE, "CLBusAddressAMD", structName = "cl_bus_address_amd") {
	documentation = "Used in AMDBusAddressableMemory##clEnqueueMakeBuffersResidentAMD()."
	nativeImport("OpenCL.h")
	cl_long.member("surface_bus_address")
	cl_long.member("marker_bus_address")
}

fun config() {
	struct(OPENCL_PACKAGE, "CLBufferRegion", structName = "cl_buffer_region") {
		documentation = "Buffer region struct."
		nativeImport("OpenCL.h")
		size_t.member("origin")
		size_t.member("size")
	}

	struct(OPENCL_PACKAGE, "CLDeviceTopologyAMD", structName = "cl_device_topology_amd", mutable = false) {
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
val cl_create_context_callback = "cl_create_context_callback".callback(
	OPENCL_PACKAGE, void, "CLCreateContextCallback",
	"Will be called when a debug message is generated.",
	NullTerminated..const..cl_charUTF8_p.IN("errinfo", "a pointer to the message string representation"),
	const..void_p.IN(
		"private_info",
		"a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in debugging the error"
	),
	AutoSize("private_info")..size_t.IN("cb", "the number of bytes in the {@code private_info} pointer"),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL10##clCreateContext() or CL10##clCreateContextFromType()")
) {
	documentation = "Instances of this interface may be passed to the CL10##clCreateContext() and CL10##clCreateContextFromType() methods."
	useSystemCallConvention()
	additionalCode = """
	/** A functional interface for {@link CLCreateContextCallback}. */
	public interface SAMString {
		void invoke(String errinfo, ByteBuffer private_info, long user_data);
	}

	/**
	 * Creates a {@link CLCreateContextCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLCreateContextCallback} instance
	 */
	public static CLCreateContextCallback createString(final SAMString sam) {
		return new CLCreateContextCallback() {
			@Override
			public void invoke(long errinfo, long private_info, long cb, long user_data) {
				sam.invoke(memDecodeUTF8(errinfo), memByteBuffer(private_info, (int)cb), user_data);
			}
		};
	}
	"""
}

val cl_program_callback = "cl_program_callback".callback(
	OPENCL_PACKAGE, void, "CLProgramCallback",
	"Will be called when the program is built, compiled or linked.",
	cl_program.IN("program", "the program that was built, compiled or linked"),
	void_p.IN(
		"user_data",
		"the user-specified value that was passed when calling CL10##clBuildProgram(), CL12##clCompileProgram() or CL12##clLinkProgram()"
	)
) {
	documentation = "Instances of this interface may be passed to the CL10##clBuildProgram(), CL12##clCompileProgram() and CL12##clLinkProgram() methods."
	useSystemCallConvention()
}

val cl_native_kernel = "cl_native_kernel".callback(
	OPENCL_PACKAGE, void, "CLNativeKernel",
	"Will be called by the OpenCL using CL10##clEnqueueNativeKernel().",
	void_p.IN("args", "a pointer to the arguments list")
) {
	documentation = "Instances of this interface may be passed to the CL10##clEnqueueNativeKernel() method."
	useSystemCallConvention()
}

val cl_mem_object_destructor_callback = "cl_mem_object_destructor_callback".callback(
	OPENCL_PACKAGE, void, "CLMemObjectDestructorCallback",
	"Will be called when a memory object is deleted.",
	cl_mem.IN("memobj", "the memory object that was deleted"),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL11##clSetMemObjectDestructorCallback()")
) {
	documentation = "Instances of this interface may be passed to the CL11##clSetMemObjectDestructorCallback() method."
	useSystemCallConvention()
}

val cl_event_callback = "cl_event_callback".callback(
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
	void_p.IN("user_data", "the user-specified value that was passed when calling CL11##clSetEventCallback()")
) {
	documentation = "Instances of this interface may be passed to the CL11##clSetEventCallback() method."
	useSystemCallConvention()
}

val cl_svmfree_callback = "cl_svmfree_callback".callback(
	OPENCL_PACKAGE, void, "CLSVMFreeCallback",
	"Will be called to free shared virtual memory pointers.",
	cl_command_queue.IN("queue", "a valid host command-queue"),
	AutoSize("svm_pointers")..cl_uint.IN("num_svm_pointers", "the number of pointers in the {@code svm_pointers} array"),
	void_pp.IN("svm_pointers", "an array of shared virtual memory pointers to be freed"),
	void_p.IN("user_data", "the user-specified value that was passed when calling CL20##clEnqueueSVMFree()")
) {
	documentation = "Instances of this interface may be passed to the CL20##clEnqueueSVMFree() method."
	useSystemCallConvention()
	additionalCode = """
	/** A functional interface for {@link CLSVMFreeCallback}. */
	public interface SAMBuffer {
		void invoke(long queue, PointerBuffer svm_pointers, long user_data);
	}

	/**
	 * Creates a {@link CLSVMFreeCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLSVMFreeCallback} instance
	 */
	public static CLSVMFreeCallback createBuffer(final SAMBuffer sam) {
		return new CLSVMFreeCallback() {
			@Override
			public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
				sam.invoke(queue, memPointerBuffer(svm_pointers, num_svm_pointers), user_data);
			}
		};
	}
	"""
}

// OpenGL interop

val cl_gl_context_info = IntegerType("cl_gl_context_info", PrimitiveMapping.INT)
val cl_gl_platform_info = IntegerType("cl_gl_platform_info", PrimitiveMapping.INT)

val cl_gl_object_type = IntegerType("cl_gl_object_type", PrimitiveMapping.INT)
val cl_gl_object_type_p = cl_gl_object_type.p

val cl_gl_texture_info = IntegerType("cl_gl_texture_info", PrimitiveMapping.INT)

// APPLE

val cl_queue_properties_APPLE = typedef(intptr_t, "cl_queue_properties_APPLE")
val cl_queue_properties_APPLE_p = cl_queue_properties_APPLE.p

// EXT

val cl_mem_migration_flags_ext = typedef(cl_bitfield, "cl_mem_migration_flags_ext")

// INTEL

val cl_accelerator_intel = "cl_accelerator_intel".opaque_p
val cl_accelerator_type_intel = typedef(cl_uint, "cl_accelerator_type_intel")
val cl_accelerator_info_intel = typedef(cl_uint, "cl_accelerator_info_intel")