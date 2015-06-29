/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val CL20 = "CL20".nativeClassCL("CL20") {
	nativeImport (
		"OpenCL.h"
	)

	documentation = "The core OpenCL 2.0 functionality."

	IntConstant(
		"OpenCL Version.",

		"VERSION_2_0" _ 1
	)

	IntConstant(
		"Error Codes",

		"INVALID_PIPE_SIZE" _ -69,
		"INVALID_DEVICE_QUEUE" _ -70
	)

	IntConstant(
		"cl_device_info",

		"DEVICE_QUEUE_ON_HOST_PROPERTIES" _ 0x102A,
		"DEVICE_MAX_READ_WRITE_IMAGE_ARGS" _ 0x104C,
		"DEVICE_MAX_GLOBAL_VARIABLE_SIZE" _ 0x104D,
		"DEVICE_QUEUE_ON_DEVICE_PROPERTIES" _ 0x104E,
		"DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE" _ 0x104F,
		"DEVICE_QUEUE_ON_DEVICE_MAX_SIZE" _ 0x1050,
		"DEVICE_MAX_ON_DEVICE_QUEUES" _ 0x1051,
		"DEVICE_MAX_ON_DEVICE_EVENTS" _ 0x1052,
		"DEVICE_SVM_CAPABILITIES" _ 0x1053,
		"DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE" _ 0x1054,
		"DEVICE_MAX_PIPE_ARGS" _ 0x1055,
		"DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS" _ 0x1056,
		"DEVICE_PIPE_MAX_PACKET_SIZE" _ 0x1057,
		"DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT" _ 0x1058,
		"DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT" _ 0x1059,
		"DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT" _ 0x105A
	)

	IntConstant(
		"cl_command_queue_properties",

		"QUEUE_ON_DEVICE" expr "1 << 2",
		"QUEUE_ON_DEVICE_DEFAULT" expr "1 << 3"
	)

	IntConstant(
		"cl_device_svm_capabilities",

		"DEVICE_SVM_COARSE_GRAIN_BUFFER" expr "1 << 0",
		"DEVICE_SVM_FINE_GRAIN_BUFFER" expr "1 << 1",
		"DEVICE_SVM_FINE_GRAIN_SYSTEM" expr "1 << 2",
		"DEVICE_SVM_ATOMICS" expr "1 << 3"
	)

	IntConstant(
		"cl_command_queue_info",

		"QUEUE_SIZE" _ 0x1094
	)

	IntConstant(
		"cl_svm_mem_flags",

		"MEM_SVM_FINE_GRAIN_BUFFER" expr "1 << 10",
		"MEM_SVM_ATOMICS" expr "1 << 11"
	)

	IntConstant(
		"cl_mem_object_type",

		"MEM_OBJECT_PIPE" _ 0x10F7
	)

	IntConstant(
		"cl_mem_info",

		"MEM_USES_SVM_POINTER" _ 0x1109
	)

	IntConstant(
		"cl_channel_order",

		"sRGB" _ 0x10BF,
		"sRGBx" _ 0x10C0,
		"sRGBA" _ 0x10C1,
		"sBGRA" _ 0x10C2,
		"ABGR" _ 0x10C3
	)

	IntConstant(
		"cl_pipe_info",

		"PIPE_PACKET_SIZE" _ 0x1120,
		"PIPE_MAX_PACKETS" _ 0x1121
	)

	IntConstant(
		"cl_sampler_info",

		"SAMPLER_MIP_FILTER_MODE" _ 0x1155,
		"SAMPLER_LOD_MIN" _ 0x1156,
		"SAMPLER_LOD_MAX" _ 0x1157
	)

	IntConstant(
		"cl_program_build_info",

		"PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE" _ 0x1185
	)


	IntConstant(
		"cl_kernel_arg_type_qualifer",

		"KERNEL_ARG_TYPE_PIPE" expr "1 << 3"
	)

	IntConstant(
		"cl_kernel_exec_info",

		"KERNEL_EXEC_INFO_SVM_PTRS" _ 0x11B6,
		"KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM" _ 0x11B7
	)

	IntConstant(
		"cl_command_type",

		"COMMAND_SVM_FREE" _ 0x1209,
		"COMMAND_SVM_MEMCPY" _ 0x120A,
		"COMMAND_SVM_MEMFILL" _ 0x120B,
		"COMMAND_SVM_MAP" _ 0x120C,
		"COMMAND_SVM_UNMAP" _ 0x120D
	)

	IntConstant(
		"cl_profiling_info",

		"PROFILING_COMMAND_COMPLETE" _ 0x1284
	)

	cl_command_queue(
		"CreateCommandQueueWithProperties",
		"""
		Creates a host or device command-queue on a specific device.

		OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
		The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
		queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
		of objects across multiple command-queues will require the application to perform appropriate synchronization.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		cl_device_id.IN(
			"device",
			"""
			a device associated with context. It can either be in the list of devices specified when context is created using CL10#CreateContext() or have the same
			device type as device type specified when context is created using CL10#CreateContextFromType().
			"""
		),
		const _ cl_command_queue_properties_p.IN(
			"properties",
			"""
			a list of properties for the command-queue and their corresponding values. Each property name is immediately followed by the corresponding desired
			value. The list is terminated with {@code 0}. If a supported property and its value is not specified in properties, its default value will be used.
			{@code properties} can be $NULL in which case the default values for supported command-queue properties will be used.
			""",
			"CL10#QUEUE_PROPERTIES #QUEUE_SIZE"
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero command-queue and $errcode_ret is set to $SUCCESS if the command-queue is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_DEVICE if {@code device} is not a valid device or is not associated with {@code context}.",
			"$INVALID_VALUE if values specified in {@code properties} are not valid.",
			"$INVALID_QUEUE_PROPERTIES if values specified in {@code properties} are valid but are not supported by the device.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_mem(
		"CreatePipe",
		"Creates a pipe object.",

		cl_context.IN("context", "a valid OpenCL context used to create the pipe object"),
		cl_mem_flags.IN(
			"flags",
			"""
			a bit-field that is used to specify allocation and usage information such as the memory arena that should be used to allocate the pipe object and
			how it will be used. If value specified for flags is 0, the default is used which is CL10#MEM_READ_WRITE.
			"""
		),
		cl_uint.IN("pipe_packet_size", "the size in bytes of a pipe packet"),
		cl_uint.IN("pipe_max_packets", "the pipe capacity by specifying the maximum number of packets the pipe can hold"),
		const _ cl_pipe_properties_p.IN(
			"properties",
			"""
			a list of properties for the pipe and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
			list is terminated with {@code 0}. In OpenCL 2.0, {@code properties} must be $NULL.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero pipe object and $errcode_ret is set to $SUCCESS if the pipe object is created successfully. Otherwise, it returns a $NULL value with
		one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_VALUE if values specified in {@code flags} are invalid.",
			"$INVALID_VALUE if {@code properties} is not $NULL.",
			"""
			#INVALID_PIPE_SIZE if {@code pipe_packet_size} is {@code 0} or the {@code pipe_packet_size} exceeds CL20#DEVICE_PIPE_MAX_PACKET_SIZE
			value for all devices in {@code context} or if {@code pipe_max_packets} is {@code 0}.
			""",
			"CL10#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for the pipe object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetPipeInfo",
		"Queries information specific to a pipe object.",

		cl_mem.IN("pipe", "the pipe object being queried"),
		cl_pipe_info.IN("param_name", "the information to query"),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT) _ nullable _ void_p.IN("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type and
			{@code param_value} is not $NULL.
			""",
			"$INVALID_MEM_OBJECT if {@code pipe} is not a valid pipe object.",
			OORE,
			OOHME
		)}
		"""
	)

	void_p(
		"SVMAlloc",
		"""
		Allocates a shared virtual memory buffer (referred to as a SVM buffer) that can be shared by the host and all devices in an OpenCL context that support
		shared virtual memory.

		If #MEM_SVM_FINE_GRAIN_BUFFER is not specified, the buffer can be created as a coarse grained SVM allocation. Similarly, if
		#MEM_SVM_ATOMICS is not specified, the buffer can be created without support for the OpenCL 2.0 SVM atomic operations.

		Calling {@code SVMAlloc} does not itself provide consistency for the shared memory region. When the host can't use the SVM atomic operations, it must
		rely on OpenCL's guaranteed memory consistency at synchronization points. To initialize a buffer to be shared with a kernel, the host can create the
		buffer and use the resulting virtual memory pointer to initialize the buffer's contents.

		For SVM to be used efficiently, the host and any devices sharing a buffer containing virtual memory pointers should have the same endianness. If the
		context passed to {@code SVMAlloc} has devices with mixed endianness and the OpenCL implementation is unable to implement SVM because of that mixed
		endianness, {@code SVMAlloc} will fail and return $NULL.

		Although SVM is generally not supported for image objects, CL12#CreateImage() may create an image from a buffer (a 1D image from a buffer
		or a 2D image from buffer) if the buffer specified in its image description parameter is a SVM buffer. Such images have a linear memory representation
		so their memory can be shared using SVM. However, fine grained sharing and atomics are not supported for image reads and writes in a kernel.

		If CL10#CreateBuffer() is called with a pointer returned by {@code SVMAlloc} as its {@code host_ptr} argument, and
		CL10#MEM_USE_HOST_PTR is set in its {@code flags} argument, {@code CreateBuffer} will succeed and return a valid non-zero buffer object as
		long as the {@code size} argument to {@code CreateBuffer} is no larger than the {@code size} argument passed in the original {@code SVMAlloc} call. The
		new buffer object returned has the shared memory as the underlying storage. Locations in the buffer's underlying shared memory can be operated on using,
		e.g., atomic operations if the device supports them.
		""",

		cl_context.IN("context", "a valid OpenCL context used to create the SVM buffer"),
		cl_svm_mem_flags.IN(
			"flags",
			"a bit-field that is used to specify allocation and usage information",
			"CL10#MEM_READ_WRITE CL10#MEM_WRITE_ONLY CL10#MEM_READ_ONLY #MEM_SVM_FINE_GRAIN_BUFFER #MEM_SVM_ATOMICS"
		),
		autoSizeResult _ size_t.IN("size", "the size in bytes of the SVM buffer to be allocated"),
		unsigned_int.IN(
			"alignment",
			"""
			the minimum alignment in bytes that is required for the newly created buffer's memory region. It must be a power of two up to the largest data type
			supported by the OpenCL device. For the full profile, the largest data type is {@code long16}. For the embedded profile, it is {@code long16} if the
			device supports 64-bit integers; otherwise it is {@code int16}. If alignment is {@code 0}, a default alignment will be used that is equal to the
			size of largest data type supported by the OpenCL implementation.
			"""
		),

		returnDoc =
		"""
		a valid non-$NULL shared virtual memory address if the SVM buffer is successfully allocated. Otherwise, like {@code malloc}, it returns a $NULL pointer
		value. {@code SVMAlloc} will fail if:
		${ul(
			"{@code context} is not a valid context.",
			"{@code flags} does not contain #MEM_SVM_FINE_GRAIN_BUFFER but does contain #MEM_SVM_ATOMICS.",
			"Values specified in {@code flags} do not follow rules for supported values.",
			"#MEM_SVM_FINE_GRAIN_BUFFER or #MEM_SVM_ATOMICS is specified in flags and these are not supported by at least one device in context.",
			"The values specified in {@code flags} are not valid.",
			"{@code size} is {@code 0} or &gt; CL10#DEVICE_MAX_MEM_ALLOC_SIZE value for any device in context.",
			"{@code alignment} is not a power of two or the OpenCL implementation cannot support the specified alignment for at least one device in context.",
			"There was a failure to allocate resources."
		)}
		"""
	)

	void(
		"SVMFree",
		"""
		Frees a shared virtual memory buffer allocated using #SVMAlloc().

		Note that {@code SVMFree} does not wait for previously enqueued commands that may be using {@code svm_pointer} to finish before freeing
		{@code svm_pointer}. It is the responsibility of the application to make sure that enqueued commands that use {@code svm_pointer} have finished before
		freeing {@code svm_pointer}. This can be done by enqueuing a blocking operation such as CL10#Finish(), CL10#WaitForEvents(),
		CL10#EnqueueReadBuffer() or by registering a callback with the events associated with enqueued commands and when the last enqueued command
		has finished freeing {@code svm_pointer}.

		The behavior of using {@code svm_pointer} after it has been freed is undefined. In addition, if a buffer object is created using
		CL10#CreateBuffer() with {@code svm_pointer}, the buffer object must first be released before the {@code svm_pointer} is freed.
		""",

		cl_context.IN("context", "a valid OpenCL context used to create the SVM buffer"),
		void_p.IN("svm_pointer", "must be the value returned by a call to #SVMAlloc(). If a $NULL pointer is passed in {@code svm_pointer}, no action occurs.")
	)

	cl_int(
		"EnqueueSVMFree",
		"Enqueues a command to free the shared virtual memory buffer allocated using #SVMAlloc() or a shared system memory pointer.",

		cl_command_queue.IN("command_queue", "a valid host command-queue"),
		AutoSize("svm_pointers") _ cl_uint.IN("num_svm_pointers", "the number of pointers in the {@code svm_pointers} array"),
		void_pp.IN(
			"svm_pointers",
			"""
			the shared virtual memory pointers to be freed. Each pointer in {@code svm_pointers} that was allocated using #SVMAlloc() must have been allocated
			from the same context from which {@code command_queue} was created. The memory associated with {@code svm_pointers} can be reused or freed after the
			function returns.
			"""
		),
		nullable _ cl_svmfree_callback.IN(
			"pfn_free_func",
			"""
			the callback function to be called to free the SVM pointers. If pfn_free_func is $NULL, all pointers specified in {@code svm_pointers} must be
			allocated using #SVMAlloc() and the OpenCL implementation will free these SVM pointers. {@code pfn_free_func} must be a valid callback function if any
			SVM pointer to be freed is a shared system memory pointer i.e. not allocated using #SVMAlloc(). If {@code pfn_free_func} is a valid callback function,
			the OpenCL implementation will call {@code pfn_free_func} to free all the SVM pointers specified in {@code svm_pointers}.
			"""
		),
		nullable _ void_p.IN("user_data", "will be passed as the {@code user_data} argument when {@code pfn_free_func} is called. {@code user_data} can be $NULL."),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_VALUE if {@code num_svm_pointers} is {@code 0} or if {@code svm_pointers} is $NULL or if any of the pointers specified in
			{@code svm_pointers} array is $NULL.
			""",
			IEWLE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueSVMMemcpy",
		"""
		Enqueues a command to do a {@code memcpy} operation.

		If {@code dst_ptr} and/or {@code src_ptr} are allocated using #SVMAlloc() then they must be allocated from the same context from which
		{@code command_queue} was created. Otherwise the behavior is undefined.
		""",

		cl_command_queue.IN("command_queue", "the host command-queue in which the read / write command will be queued"),
		cl_bool.IN(
			"blocking_copy",
			"""
			indicates if the copy operation is <em>blocking</em> or <em>non-blocking</em>.

			If {@code blocking_copy} is $TRUE i.e. the copy command is blocking, {@code EnqueueSVMMemcpy} does not return until the buffer data has been copied
			into memory pointed to by {@code dst_ptr}.

			If {@code blocking_copy} is $FALSE i.e. the copy command is non-blocking, {@code EnqueueSVMMemcpy} queues a non-blocking copy command and returns.
			The contents of the buffer that {@code dst_ptr} point to cannot be used until the copy command has completed. The event argument returns an event
			object which can be used to query the execution status of the read command. When the copy command has completed, the contents of the buffer that
			{@code dst_ptr} points to can be used by the application.
			"""
		),
		void_p.IN("dst_ptr", "the pointer to a memory region where data is copied to"),
		const _ void_p.IN("src_ptr", "the pointer to a memory region where data is copied from"),
		size_t.IN("size", "the size in bytes of data being copied"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
			IEWLE,
			ESEFEIWLE("copy"),
			"$INVALID_VALUE if {@code dst_ptr} or {@code src_ptr} are $NULL.",
			"$INVALID_VALUE if {@code size} is {@code 0}.",
			"CL10#MEM_COPY_OVERLAP if the values specified for {@code dst_ptr}, {@code src_ptr} and {@code size} result in an overlapping copy.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueSVMMemFill",
		"Enqueues a command to fill a region in memory with a pattern of a given pattern size.",

		cl_command_queue.IN("command_queue", "the host command-queue in which the fill command will be queued"),
		void_p.IN(
			"svm_ptr",
			"""
			a pointer to a memory region that will be filled with pattern. It must be aligned to {@code pattern_size} bytes. If {@code svm_ptr} is allocated
			using #SVMAlloc() then it must be allocated from the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
			"""
		),
		const _ void_p.IN(
			"pattern",
			"""
			a pointer to the data pattern of size {@code pattern_size} in bytes. {@code pattern} will be used to fill a region in buffer starting at
			{@code svm_ptr} and is {@code size} bytes in size. The data pattern must be a scalar or vector integer or floating-point data type supported by
			OpenCL. For example, if region pointed to by {@code svm_ptr} is to be filled with a pattern of float4 values, then pattern will be a pointer to a
			{@code cl_float4} value and {@code pattern_size} will be {@code sizeof(cl_float4)}. The maximum value of {@code pattern_size} is the size of the
			largest integer or floating-point vector data type supported by the OpenCL device. The memory associated with pattern can be reused or freed after
			the function returns.
			"""
		),
		AutoSize("pattern") _ size_t.IN("pattern_size", "the size of the {@code pattern} array, in bytes"),
		size_t.IN("size", "the size in bytes of region being filled starting with {@code svm_ptr} and must be a multiple of {@code pattern_size}"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
			"$INVALID_VALUE if {@code svm_ptr} is $NULL.",
			"$INVALID_VALUE if {@code svm_ptr} is not aligned to {@code pattern_size} bytes.",
			"""
			$INVALID_VALUE if {@code pattern} is $NULL or if {@code pattern_size} is {@code 0} or if {@code pattern_size} is not one of
			{@code &#123;1, 2, 4, 8, 16, 32, 64, 128&#125;}.
			""",
			"$INVALID_VALUE if {@code size} is {@code 0} or is not a multiple of {@code pattern_size}.",
			IEWLE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueSVMMap",
		"""
		Enqueues a command that will allow the host to update a region of a SVM buffer. Note that since we are enqueuing a command with a SVM buffer, the region
		is already mapped in the host address space.
		""",

		cl_command_queue.IN("command_queue", "a valid host command-queue"),
		cl_bool.IN(
			"blocking_map",
			"""
			indicates if the map operation is blocking or non-blocking.

			If {@code blocking_map} is $TRUE, {@code EnqueueSVMMap} does not return until the application can access the contents of the SVM region specified by
			{@code svm_ptr} and {@code size} on the host.

			If {@code blocking_map} is $FALSE i.e. map operation is non-blocking, the region specified by {@code svm_ptr} and {@code size} cannot be used until
			the map command has completed. The event argument returns an event object which can be used to query the execution status of the map command. When
			the map command is completed, the application can access the contents of the region specified by {@code svm_ptr} and {@code size}.
			"""
		),
		cl_map_flags.IN("map_flags", "a bit-field"),
		void_p.IN(
			"svm_ptr",
			"""
			a pointer to a memory region and {@code size} in bytes that will be updated by the host. If {@code svm_ptr} is allocated using #SVMAlloc() then it
			must be allocated from the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
			"""
		),
		AutoSize("svm_ptr") _ size_t.IN("size", "the size of the memory region to map, in bytes"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
			"$INVALID_VALUE if {@code svm_ptr} is $NULL.",
			"$INVALID_VALUE if {@code size} is {@code 0} or if values specified in {@code map_flags} are not valid.",
			IEWLE,
			ESEFEIWLE("map"),
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueSVMUnmap",
		"""
		Enqueues a command to indicate that the host has completed updating the region given by {@code svm_ptr} and which was specified in a previous call to
		#EnqueueSVMMap().
		""",

		cl_command_queue.IN("command_queue", "a valid host command-queue"),
		void_p.IN(
			"svm_ptr",
			"""
			a pointer that was specified in a previous call to #EnqueueSVMMap(). If {@code svm_ptr} is allocated using #SVMAlloc() then it must be allocated from
			the same context from which {@code command_queue} was created. Otherwise the behavior is undefined.
			"""
		),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
			"$INVALID_VALUE if {@code svm_ptr} is $NULL.",
			IEWLE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"SetKernelArgSVMPointer",
		"Set a SVM pointer as the argument value for a specific argument of a kernel.",

		cl_kernel.IN("kernel", "a valid kernel object"),
		cl_uint.IN(
			"arg_index",
			"""
			the argument index. Arguments to the kernel are referred by indices that go from {@code 0} for the leftmost argument to {@code n - 1}, where
			{@code n} is the total number of arguments declared by a kernel.
			"""
		),
		const _ void_p.IN(
			"arg_value",
			"""
			the SVM pointer that should be used as the argument value for argument specified by {@code arg_index}. The SVM pointer specified is the value used
			by all API calls that enqueue kernel (CL10#EnqueueNDRangeKernel()) until the argument value is changed by a call to
			{@code SetKernelArgSVMPointer} for {@code kernel}. The SVM pointer can only be used for arguments that are declared to be a pointer to global or
			constant memory. The SVM pointer value must be aligned according to the argument's type. For example, if the argument is declared to be
			{@code global float4 *p}, the SVM pointer value passed for {@code p} must be at a minimum aligned to a {@code float4}. The SVM pointer value
			specified as the argument value can be the pointer returned by #SVMAlloc() or can be a pointer + offset into the SVM region.
			"""
		),

		returnDoc =
		"""
		$SUCCESS if the function was executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_KERNEL if {@code kernel} is not a valid kernel object.",
			"$INVALID_ARG_INDEX if {@code arg_index} is not a valid argument index.",
			"$INVALID_ARG_VALUE if {@code arg_value} specified is not a valid value.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"SetKernelExecInfo",
		"""
		Can be used to pass additional information other than argument values to a kernel.

		NOTES

		1. Coarse-grain or fine-grain buffer SVM pointers used by a kernel which are not passed as a kernel arguments must be specified using
		{@code SetKernelExecInfo} with #KERNEL_EXEC_INFO_SVM_PTRS. For example, if SVM buffer A contains a pointer to another SVM buffer B, and the
		kernel dereferences that pointer, then a pointer to B must either be passed as an argument in the call to that kernel or it must be made available to
		the kernel using {@code SetKernelExecInfo}. For example, we might pass extra SVM pointers as follows:

		${code("clSetKernelExecInfo(kernel, CL_KERNEL_EXEC_INFO_SVM_PTRS, num_ptrs * sizeof(void *), extra_svm_ptr_list);")}

		Here {@code num_ptrs} specifies the number of additional SVM pointers while {@code extra_svm_ptr_list} specifies a pointer to memory containing those
		SVM pointers. When calling {@code SetKernelExecInfo} with #KERNEL_EXEC_INFO_SVM_PTRS to specify pointers to non-argument SVM buffers as extra
		arguments to a kernel, each of these pointers can be the SVM pointer returned by #SVMAlloc() or can be a pointer + offset into the SVM region. It is
		sufficient to provide one pointer for each SVM buffer used.

		2. #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM is used to indicate whether SVM pointers used by a kernel will refer to system allocations or not.

		#KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM = $FALSE indicates that the OpenCL implementation may assume that system pointers are not passed as
		kernel arguments and are not stored inside SVM allocations passed as kernel arguments.

		#KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM = $TRUE indicates that the OpenCL implementation must assume that system pointers might be passed as
		kernel arguments and/or stored inside SVM allocations passed as kernel arguments. In this case, if the device to which the kernel is enqueued does not
		support system SVM pointers, CL10#EnqueueNDRangeKernel() will return a $INVALID_OPERATION error. If none of the devices in the context
		associated with kernel support fine-grain system SVM allocations, {@code SetKernelExecInfo} will return a $INVALID_OPERATION error.

		If {@code SetKernelExecInfo} has not been called with a value for #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM, the default value is used for this
		kernel attribute. The default value depends on whether the device on which the kernel is enqueued supports fine-grain system SVM allocations. If so, the
		default value used is $TRUE (system pointers might be passed); otherwise, the default is $FALSE.
		""",

		cl_kernel.IN("kernel", "the kernel object being queried"),
		cl_kernel_exec_info.IN("param_name", "the information to be passed to {@code kernel}"),
		AutoSize("param_value") _ size_t.IN("param_value_size", "the size in bytes of the memory pointed to by {@code param_value}"),
		const _ MultiType(PointerMapping.DATA_POINTER, PointerMapping.DATA_INT) _ void_p.IN("param_value", "a pointer to memory where the appropriate values determined by {@code param_name} are specified"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_KERNEL if {@code kernel} is a not a valid kernel object.",
			"$INVALID_VALUE if {@code param_name} is not valid, if {@code param_value} is $NULL or if the size specified by {@code param_value_size} is not valid.",
			"""
			$INVALID_OPERATION if {@code param_name} = #KERNEL_EXEC_INFO_SVM_FINE_GRAIN_SYSTEM and {@code param_value} = $TRUE but no devices in
			context associated with kernel support fine-grain system SVM allocations.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_sampler(
		"CreateSamplerWithProperties",
		"Creates a sampler object.",

		cl_context.IN("context", "a valid OpenCL context"),
		nullable _ nullTerminated _ const _ cl_sampler_properties_p.IN(
			"sampler_properties",
			"""
			a list of sampler property names and their corresponding values. Each sampler property name is immediately followed by the corresponding desired
			value. The list is terminated with {@code 0}. If a supported property and its value is not specified in {@code sampler_properties}, its default
			value will be used. {@code sampler_properties} can be $NULL in which case the default values for supported sampler properties will be used.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero sampler object and $errcode_ret is set to $SUCCESS if the sampler object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"""
			$INVALID_VALUE if the property name in {@code sampler_properties} is not a supported property name, if the value specified for a supported property
			name is not valid, or if the same property name is specified more than once.
			""",
			"$INVALID_OPERATION if images are not supported by any device associated with context.",
			OORE,
			OOHME
		)}
		"""
	)

}