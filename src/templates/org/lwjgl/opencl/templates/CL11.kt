/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val INVALID_PROPERTY = "CL11#INVALID_PROPERTY"

val CL11 = "CL11".nativeClassCL("CL11") {
	nativeImport (
		"OpenCL.h"
	)

	documentation = "The core OpenCL 1.1 functionality."

	IntConstant(
		"Error Codes.",

		"MISALIGNED_SUB_BUFFER_OFFSET" expr "-13",
		"EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST" expr "-14",
		"INVALID_PROPERTY" expr "-64"
	)

	IntConstant(
		"OpenCL Version.",

		"VERSION_1_1" _ 0x1
	)

	IntConstant(
		"cl_device_info.",

		"DEVICE_PREFERRED_VECTOR_WIDTH_HALF" _ 0x1034,
		"DEVICE_HOST_UNIFIED_MEMORY" _ 0x1035,
		"DEVICE_NATIVE_VECTOR_WIDTH_CHAR" _ 0x1036,
		"DEVICE_NATIVE_VECTOR_WIDTH_SHORT" _ 0x1037,
		"DEVICE_NATIVE_VECTOR_WIDTH_INT" _ 0x1038,
		"DEVICE_NATIVE_VECTOR_WIDTH_LONG" _ 0x1039,
		"DEVICE_NATIVE_VECTOR_WIDTH_FLOAT" _ 0x103A,
		"DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE" _ 0x103B,
		"DEVICE_NATIVE_VECTOR_WIDTH_HALF" _ 0x103C,
		"DEVICE_OPENCL_C_VERSION" _ 0x103D
	)

	IntConstant(
		"cl_device_fp_config - bitfield.",

		"FP_SOFT_FLOAT" expr "1 << 6"
	)

	IntConstant(
		"cl_context_info.",

		"CONTEXT_NUM_DEVICES" _ 0x1083
	)

	IntConstant(
		"cl_channel_order.",

		"Rx" _ 0x10BA,
		"RGx" _ 0x10BB,
		"RGBx" _ 0x10BC
	)

	IntConstant(
		"cl_mem_info.",

		"MEM_ASSOCIATED_MEMOBJECT" _ 0x1107,
		"MEM_OFFSET" _ 0x1108
	)

	IntConstant(
		"cl_addressing_mode.",

		"ADDRESS_MIRRORED_REPEAT" _ 0x1134
	)

	IntConstant(
		"cl_kernel_work_group_info.",

		"KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE" _ 0x11B3,
		"KERNEL_PRIVATE_MEM_SIZE" _ 0x11B4
	)

	IntConstant(
		"cl_event_info.",

		"EVENT_CONTEXT" _ 0x11D4
	)

	IntConstant(
		"cl_command_type.",

		"COMMAND_READ_BUFFER_RECT" _ 0x1201,
		"COMMAND_WRITE_BUFFER_RECT" _ 0x1202,
		"COMMAND_COPY_BUFFER_RECT" _ 0x1203,
		"COMMAND_USER" _ 0x1204
	)

	val BufferCreateType = IntConstant(
		"cl_buffer_create_type.",

		"BUFFER_CREATE_TYPE_REGION" _ 0x1220
	).javaDocLinks

	cl_mem(
		"CreateSubBuffer",
		"""
		Creates a new buffer object (referred to as a sub-buffer object) from an existing buffer object.

		<strong>NOTE</strong>: Concurrent reading from, writing to and copying between both a buffer object and its sub-buffer object(s) is undefined.
		Concurrent reading from, writing to and copying between overlapping sub-buffer objects created with the same buffer object is undefined. Only reading
		from both a buffer object and its sub-buffer objects or reading from multiple overlapping sub-buffer objects is defined.
		""",

		cl_mem.IN("buffer", "a valid buffer object and cannot be a sub-buffer object"),
		cl_mem_flags.IN(
			"flags",
			"""
			a bit-field that is used to specify allocation and usage information about the sub-buffer memory object being created.

			If the CL10#MEM_READ_WRITE, CL10#MEM_READ_ONLY or CL10#MEM_WRITE_ONLY values are not specified in flags, they are
			inherited from the corresponding memory access qualifers associated with buffer. The CL10#MEM_USE_HOST_PTR, CL10#MEM_ALLOC_HOST_PTR
			and CL10#MEM_COPY_HOST_PTR values cannot be specified in flags but are inherited from the corresponding memory access qualifiers
			associated with buffer. If CL10#MEM_COPY_HOST_PTR is specified in the memory access qualifier values associated with buffer it does not
			imply any additional copies when the sub-buffer is created from buffer. If the CL12#MEM_HOST_WRITE_ONLY, CL12#MEM_HOST_READ_ONLY
			or CL12#MEM_HOST_NO_ACCESS values are not specified in flags, they are inherited from the corresponding memory access qualifiers
			associated with buffer.
			"""
		),
		cl_buffer_create_type.IN(
			"buffer_create_type",
			"the type of buffer object to be created",
			BufferCreateType
		),
		const _ void_p.IN(
			"buffer_create_info",
			"""
			details about the buffer object to be created.

			When {@code buffer_create_type} is #BUFFER_CREATE_TYPE_REGION, then {@code buffer_create_info} is a pointer to a ##CLBufferRegion
			structure. {@code (origin, size)} defines the offset and size in bytes in buffer.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors in $errcode_ret:
		${ul(
			"$INVALID_MEM_OBJECT if {@code buffer} is not a valid buffer object or is a sub-buffer object.",
			"""
			$INVALID_VALUE if {@code buffer} was created with CL10#MEM_WRITE_ONLY and {@code flags} specifies CL10#MEM_READ_WRITE
			or CL10#MEM_READ_ONLY, or if {@code buffer} was created with CL10#MEM_READ_ONLY and {@code flags} specifies
			CL10#MEM_READ_WRITE or CL10#MEM_WRITE_ONLY, or if {@code flags} specifies CL10#MEM_USE_HOST_PTR or
			CL10#MEM_ALLOC_HOST_PTR or CL10#MEM_COPY_HOST_PTR.
			""",
			"""
			$INVALID_VALUE if {@code buffer} was created with CL12#MEM_HOST_WRITE_ONLY and {@code flags} specify CL12#MEM_HOST_READ_ONLY,
			or if {@code buffer} was created with CL12#MEM_HOST_READ_ONLY and {@code flags} specify CL12#MEM_HOST_WRITE_ONLY, or if
			{@code buffer} was created with CL12#MEM_HOST_NO_ACCESS and {@code flags} specify CL12#MEM_HOST_READ_ONLY or CL12#MEM_HOST_WRITE_ONLY.
			""",
			"$INVALID_VALUE if value specified in {@code buffer_create_type} is not valid.",
			"""
			$INVALID_VALUE if value(s) specified in {@code buffer_create_info} (for a given {@code buffer_create_type}) is not valid or if
			{@code buffer_create_info} is $NULL.
			""",
			"$INVALID_BUFFER_SIZE if {@code size} is 0.",
			"CL10#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for sub-buffer object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"SetMemObjectDestructorCallback",
		"""
		Registers a user callback function with a memory object. Each call to {@code clSetMemObjectDestructorCallback} registers the specified user callback
		function on a callback stack associated with {@code memobj}. The registered user callback functions are called in the reverse order in which they were
		registered. The user callback functions are called and then the memory object's resources are freed and the memory object is deleted. This provides a
		mechanism for the application (and libraries) using {@code memobj} to be notified when the memory referenced by {@code host_ptr}, specified when the
		memory object is created and used as the storage bits for the memory object, can be reused or freed.
		""",

		cl_mem.IN("memobj", "a valid memory object"),
		cl_mem_object_destructor_callback.IN(
			"pfn_notify",
			"""
			the callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL implementation.
			It is the application's responsibility to ensure that the callback function is thread-safe.
			"""
		),
		nullable _ voidptr.IN("user_data", "will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be $NULL."),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_MEM_OBJECT if {@code memobj} is not a valid memory object.",
			"$INVALID_VALUE if {@code pfn_notify} is NULL.",
			OORE,
			OOHME
		)}
		"""
	)

	val BufferRectBufferOffset = const _ Check(3) _ size_t_p.IN(
		"buffer_offset",
		"""
		the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
		should be 0. The offset in bytes is computed as ${code("buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]")}.
		"""
	)
	val BufferRectHostOffset = const _ Check(3) _ size_t_p.IN(
		"host_offset",
		"""
		the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
		should be 0. The offset in bytes is computed as ${code("host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]")}.
		"""
	)
	val BufferRectRegion = const _ Check(3) _ size_t_p.IN(
		"region",
		"""
		the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
		given by {@code region[2]} should be 1. The values in region cannot be 0.
		"""
	)
	val BufferRectBufferRowPitch = size_t.IN(
		"buffer_row_pitch",
		"""
		the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
		{@code buffer_row_pitch} is computed as {@code region[0]}.
		"""
	)
	val BufferRectBufferSlicePitch = size_t.IN(
		"buffer_slice_pitch",
		"""
		the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
		{@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
		"""
	)
	val BufferRectHostRowPitch = size_t.IN(
		"host_row_pitch",
		"""
		the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
		is computed as {@code region[0]}.
		"""
	)
	val BufferRectHostSlicePitch = size_t.IN(
		"host_slice_pitch",
		"""
		the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
		{@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
		"""
	)

	cl_int(
		"EnqueueReadBufferRect",
		"""
		Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.

		Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
		{@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
		object being read is created with CL10#MEM_USE_HOST_PTR, must meet the following requirements in order to avoid undefined behavior:
		${ul(
			"""
			All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
			read command begins execution.
			""",
			"The buffer object or memory objects created from this buffer object are not mapped.",
			"The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution."
		)}
		""",

		cl_command_queue.IN(
			"command_queue",
			"the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context."
		),
		cl_mem.IN("buffer", "a valid buffer object"),
		cl_bool.IN(
			"blocking_read",
			"""
			indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.

			If {@code blocking_read} is $TRUE i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
			been read and copied into memory pointed to by {@code ptr}.

			If {@code blocking_read} is $FALSE i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
			returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
			returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
			the buffer that {@code ptr} points to can be used by the application.
			"""
		),
		BufferRectBufferOffset,
		BufferRectHostOffset,
		BufferRectRegion,
		BufferRectBufferRowPitch,
		BufferRectBufferSlicePitch,
		BufferRectHostRowPitch,
		BufferRectHostSlicePitch,
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ void_p.OUT("ptr", "the pointer to buffer in host memory where data is to be read into"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
			with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code buffer} is not a valid buffer object.",
			"$INVALID_VALUE if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.",
			"$INVALID_VALUE if {@code ptr} is a $NULL value.",
			"$INVALID_VALUE if any {@code region} array element is 0.",
			"$INVALID_VALUE if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.",
			"$INVALID_VALUE if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.",
			"$INVALID_VALUE if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.",
			"$INVALID_VALUE if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.",
			IEWLE,
			MSBOE("buffer"),
			ESEFEIWLE("read"),
			"CL10#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code buffer}.",
			"$INVALID_OPERATION if {@code clEnqueueReadBufferRect} is called on buffer which has been created with CL12#MEM_HOST_WRITE_ONLY or CL12#MEM_HOST_NO_ACCESS.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueWriteBufferRect",
		"""
		Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.

		Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
		{@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
		when the buffer object being written is created with CL10#MEM_USE_HOST_PTR, must meet the following requirements in order to avoid undefined
		behavior:
		${ul(
			"The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.",
			"The buffer object or memory objects created from this buffer object are not mapped.",
			"The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution."
		)}
		""",

		cl_command_queue.IN(
			"command_queue",
			"the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context."
		),
		cl_mem.IN("buffer", "a valid buffer object"),
		cl_bool.IN(
			"blocking_write",
			"""
			indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.

			If {@code blocking_write} is $TRUE, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
			command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.

			If {@code blocking_write} is $FALSE, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
			the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
			{@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
			completed, the memory pointed to by {@code ptr} can then be reused by the application.
			"""
		),
		BufferRectBufferOffset,
		BufferRectHostOffset,
		BufferRectRegion,
		BufferRectBufferRowPitch,
		BufferRectBufferSlicePitch,
		BufferRectHostRowPitch,
		BufferRectHostSlicePitch,
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ const _ void_p.IN("ptr", "the pointer to buffer in host memory where data is to be written from"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
			with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code buffer} is not a valid buffer object.",
			"$INVALID_VALUE if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.",
			"$INVALID_VALUE if {@code ptr} is a $NULL value.",
			"$INVALID_VALUE if any {@code region} array element is 0.",
			"$INVALID_VALUE if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.",
			"$INVALID_VALUE if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.",
			"$INVALID_VALUE if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.",
			"$INVALID_VALUE if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.",
			IEWLE,
			MSBOE("buffer"),
			ESEFEIWLE("write"),
			"CL10#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code buffer}.",
			"$INVALID_OPERATION if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with CL12#MEM_HOST_READ_ONLY or CL12#MEM_HOST_NO_ACCESS.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueCopyBufferRect",
		"""
		Enqueues a command to copy a 2D or 3D rectangular region from the buffer object identified by {@code src_buffer} to a 2D or 3D region in the buffer
		object identified by {@code dst_buffer}. Copying begins at the source offset and destination offset which are computed as described below in the
		description for {@code src_origin} and {@code dst_origin}. Each byte of the region's width is copied from the source offset to the destination offset.
		After copying each width, the source and destination offsets are incremented by their respective source and destination row pitches. After copying each
		2D rectangle, the source and destination offsets are incremented by their respective source and destination slice pitches.

		<strong>NOTE</strong>: If {@code src_buffer} and {@code dst_buffer} are the same buffer object, {@code src_row_pitch} must equal {@code dst_row_pitch}
		and {@code src_slice_pitch} must equal {@code dst_slice_pitch}.
		""",

		cl_command_queue.IN(
			"command_queue",
			"""
			the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
			{@code dst_buffer} must be the same.
			"""
		),
		cl_mem.IN("src_buffer", "the source buffer"),
		cl_mem.IN("dst_buffer", "the destination buffer"),
		Check(3) _ size_t_p.IN(
			"src_origin",
			"""
			the {@code (x, y, z)} offset in the memory region associated with {@code src_buffer}. For a 2D rectangle region, the z value given by {@code src_origin[2]}
			should be 0. The offset in bytes is computed as ${code("src_origin[2] * src_slice_pitch + src_origin[1] * src_row_pitch + src_origin[0]")}.
			"""
		),
		Check(3) _ size_t_p.IN(
			"dst_origin",
			"""
			the {@code (x, y, z)} offset in the memory region associated with {@code dst_buffer}. For a 2D rectangle region, the z value given by {@code dst_origin[2]}
			should be 0. The offset in bytes is computed as ${code("dst_origin[2] * dst_slice_pitch + dst_origin[1] * dst_row_pitch + dst_origin[0]")}.
			"""
		),
		Check(3) _ size_t_p.IN(
			"region",
			"""
			the ({@code width} in bytes, {@code height} in rows, {@code depth} in slices) of the 2D or 3D rectangle being copied. For a 2D rectangle, the depth
			value given by {@code region[2]} should be 1. The values in {@code region} cannot be 0.
			"""
		),
		size_t.IN(
			"src_row_pitch",
			"""
			the length of each row in bytes to be used for the memory region associated with {@code src_buffer}. If {@code src_row_pitch} is 0, {@code src_row_pitch}
			is computed as {@code region[0]}.
			"""
		),
		size_t.IN(
			"src_slice_pitch",
			"""
			the length of each 2D slice in bytes to be used for the memory region associated with {@code src_buffer}. If {@code src_slice_pitch} is 0,
			{@code src_slice_pitch} is computed as {@code region[1] * src_row_pitch}.
			"""
		),
		size_t.IN(
			"dst_row_pitch",
			"""
			the length of each row in bytes to be used for the memory region associated with {@code dst_buffer}. If {@code dst_row_pitch} is 0, {@code dst_row_pitch}
			is computed as {@code region[0]}.
			"""
		),
		size_t.IN(
			"dst_slice_pitch",
			"""
			the length of each 2D slice in bytes to be used for the memory region associated with {@code dst_buffer}. If {@code dst_slice_pitch} is 0,
			{@code dst_slice_pitch} is computed as {@code region[1] * dst_row_pitch}.
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
			"""
			$INVALID_CONTEXT if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or
			if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.",
			"""
			$INVALID_VALUE if {@code (src_origin, region, src_row_pitch, src_slice_pitch)} or {@code (dst_origin, region, dst_row_pitch, dst_slice_pitch)}
			require accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.
			""",
			"$INVALID_VALUE if any {@code region} array element is 0.",
			"$INVALID_VALUE if {@code src_row_pitch} is not 0 and is less than {@code region[0]}.",
			"$INVALID_VALUE if {@code dst_row_pitch} is not 0 and is less than {@code region[0]}.",
			"""
			$INVALID_VALUE if {@code src_slice_pitch} is not 0 and is less than {@code region[1] * src_row_pitch} or if {@code src_slice_pitch}
			is not 0 and is not a multiple of {@code src_row_pitch}.
			""",
			"""
			$INVALID_VALUE if {@code dst_slice_pitch} is not 0 and is less than {@code region[1] * dst_row_pitch} or if {@code dst_slice_pitch}
			is not 0 and is not a multiple of {@code dst_row_pitch}.
			""",
			"""
			$INVALID_VALUE if {@code src_buffer} and {@code dst_buffer} are the same buffer object and {@code src_slice_pitch} is not equal to
			{@code dst_slice_pitch} and {@code src_row_pitch} is not equal to {@code dst_row_pitch}.
			""",
			IEWLE,
			"""
			CL10#MEM_COPY_OVERLAP if {@code src_buffer} and {@code dst_buffer} are the same buffer or subbuffer object and the source and destination
			regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap.
			""",
			MSBOE("src_buffer"),
			MSBOE("dst_buffer"),
			"CL10#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_event(
		"CreateUserEvent",
		"""
		Creates a user event object. User events allow applications to enqueue commands that wait on a user event to finish before the command is executed by
		the device.

		The execution status of the user event object created is set to CL10#SUBMITTED.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero event object and $errcode_ret is set to $SUCCESS if the user event object is created successfully. Otherwise, it returns a $NULL
		value with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"SetUserEventStatus",
		"""
		Sets the execution status of a user event object.

		<strong>NOTE</strong>: Enqueued commands that specify user events in the {@code event_wait_list} argument of {@code clEnqueue***} commands must ensure
		that the status of these user events being waited on are set using {@code clSetUserEventStatus} before any OpenCL APIs that release OpenCL objects
		except for event objects are called; otherwise the behavior is undefined.

		For example, the following code sequence will result in undefined behavior of CL10#ReleaseMemObject().
		${codeBlock("""
ev1 = clCreateUserEvent(ctx, NULL);
clEnqueueWriteBuffer(cq, buf1, CL_FALSE, ..., 1, &ev1, NULL);
clEnqueueWriteBuffer(cq, buf2, CL_FALSE, ...);
clReleaseMemObject(buf2);
clSetUserEventStatus(ev1, CL_COMPLETE);
		""")}
		The following code sequence, however, works correctly.
		${codeBlock("""
ev1 = clCreateUserEvent(ctx, NULL);
clEnqueueWriteBuffer(cq, buf1, CL_FALSE, ..., 1, &ev1, NULL);
clEnqueueWriteBuffer(cq, buf2, CL_FALSE, ...);
clSetUserEventStatus(ev1, CL_COMPLETE);
clReleaseMemObject(buf2);
		""")}
		""",

		cl_event.IN("event", "a user event object created using #CreateUserEvent()"),
		cl_int.IN(
			"execution_status",
			"""
			the new execution status to be set and can be CL10#COMPLETE or a negative integer value to indicate an error. A negative integer value
			causes all enqueued commands that wait on this user event to be terminated. {@code clSetUserEventStatus} can only be called once to change the
			execution status of event.
			"""
		),

		returnDoc =
		"""
		$SUCCESS if the function was executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_EVENT if {@code event} is not a valid user event object.",
			"$INVALID_VALUE if the {@code execution_status} is not CL10#COMPLETE or a negative integer value.",
			"$INVALID_OPERATION if the {@code execution_status} for event has already been changed by a previous call to {@code clSetUserEventStatus}.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"SetEventCallback",
		"""
		Registers a user callback function for a specific command execution status. The registered callback function will be called when the execution status of
		command associated with event changes to an execution status equal to or past the status specified by {@code command_exec_status}.

		Each call to {@code clSetEventCallback} registers the specified user callback function on a callback stack associated with event. The order in which the
		registered user callback functions are called is undefined.

		All callbacks registered for an event object must be called. All enqueued callbacks shall be called before the event object is destroyed. Callbacks must
		return promptly. The behavior of calling expensive system routines, OpenCL API calls to create contexts or command-queues, or blocking OpenCL operations
		from the following list below, in a callback is undefined.
		${ul(
			"CL10#Finish(),",
			"CL10#WaitForEvents(),",
			"blocking calls to CL10#EnqueueReadBuffer(), #EnqueueReadBufferRect(), CL10#EnqueueWriteBuffer(), #EnqueueWriteBufferRect(),",
			"blocking calls to CL10#EnqueueReadImage() and CL10#EnqueueWriteImage(),",
			"blocking calls to CL10#EnqueueMapBuffer() and CL10#EnqueueMapImage(),",
			"blocking calls to CL10#BuildProgram(), CL12#CompileProgram() or CL12#LinkProgram()"
		)}
		If an application needs to wait for completion of a routine from the above list in a callback, please use the non-blocking form of the function, and
		assign a completion callback to it to do the remainder of your work. Note that when a callback (or other code) enqueues commands to a command-queue, the
		commands are not required to begin execution until the queue is flushed. In standard usage, blocking enqueue calls serve this role by implicitly
		flushing the queue. Since blocking calls are not permitted in callbacks, those callbacks that enqueue commands on a command queue should either call
		CL10#Flush() on the queue before returning or arrange for CL10#Flush() to be called later on another thread.
		""",

		cl_event.IN("event", "a valid event object"),
		cl_int.IN(
			"command_exec_callback_type",
			"""
			the command execution status for which the callback is registered. There is no guarantee that the callback functions registered for various
			execution status values for an event will be called in the exact order that the execution status of a command changes. Furthermore, it should be
			noted that receiving a call back for an event with a status other than CL10#COMPLETE, in no way implies that the memory model or
			execution model as defined by the OpenCL specification has changed. For example, it is not valid to assume that a corresponding memory transfer has
			completed unless the event is in a state CL10#COMPLETE.
			""",
			"CL10#SUBMITTED CL10#RUNNING CL10#COMPLETE"
		),
		cl_event_callback.IN(
			"pfn_notify",
			"""
			the event callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL
			implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
			"""
		),
		nullable _ voidptr.IN("user_data", "will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be $NULL."),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_EVENT if {@code event} is not a valid event object.",
			"""
			$INVALID_VALUE if {@code pfn_event_notify} is $NULL or if {@code command_exec_callback_type} is not CL10#SUBMITTED,
			CL10#RUNNING or CL10#COMPLETE.
			""",
			"$INVALID_VALUE if {@code event} is a user event object and {@code command_exec_callback_type} is not CL10#COMPLETE.",
			OORE,
			OOHME
		)}
		"""
	)

}