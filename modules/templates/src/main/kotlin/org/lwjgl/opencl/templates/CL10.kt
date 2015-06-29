/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

// -- [ Reusable definitions ] --

val SUCCESS = "CL10#SUCCESS"
val TRUE = "CL10#TRUE"
val FALSE = "CL10#FALSE"

// Error codes

val INVALID_VALUE = "CL10#INVALID_VALUE"
val INVALID_DEVICE_TYPE = "CL10#INVALID_DEVICE_TYPE"
val INVALID_PLATFORM = "CL10#INVALID_PLATFORM"
val INVALID_DEVICE = "CL10#INVALID_DEVICE"
val INVALID_CONTEXT = "CL10#INVALID_CONTEXT"
val INVALID_QUEUE_PROPERTIES = "CL10#INVALID_QUEUE_PROPERTIES"
val INVALID_COMMAND_QUEUE = "CL10#INVALID_COMMAND_QUEUE"
val INVALID_HOST_PTR = "CL10#INVALID_HOST_PTR"
val INVALID_MEM_OBJECT = "CL10#INVALID_MEM_OBJECT"
val INVALID_IMAGE_FORMAT_DESCRIPTOR = "CL10#INVALID_IMAGE_FORMAT_DESCRIPTOR"
val INVALID_IMAGE_SIZE = "CL10#INVALID_IMAGE_SIZE"
val INVALID_SAMPLER = "CL10#INVALID_SAMPLER"
val INVALID_BINARY = "CL10#INVALID_BINARY"
val INVALID_BUILD_OPTIONS = "CL10#INVALID_BUILD_OPTIONS"
val INVALID_PROGRAM = "CL10#INVALID_PROGRAM"
val INVALID_PROGRAM_EXECUTABLE = "CL10#INVALID_PROGRAM_EXECUTABLE"
val INVALID_KERNEL_NAME = "CL10#INVALID_KERNEL_NAME"
val INVALID_KERNEL_DEFINITION = "CL10#INVALID_KERNEL_DEFINITION"
val INVALID_KERNEL = "CL10#INVALID_KERNEL"
val INVALID_ARG_INDEX = "CL10#INVALID_ARG_INDEX"
val INVALID_ARG_VALUE = "CL10#INVALID_ARG_VALUE"
val INVALID_ARG_SIZE = "CL10#INVALID_ARG_SIZE"
val INVALID_KERNEL_ARGS = "CL10#INVALID_KERNEL_ARGS"
val INVALID_WORK_DIMENSION = "CL10#INVALID_WORK_DIMENSION"
val INVALID_WORK_GROUP_SIZE = "CL10#INVALID_WORK_GROUP_SIZE"
val INVALID_WORK_ITEM_SIZE = "CL10#INVALID_WORK_ITEM_SIZE"
val INVALID_GLOBAL_OFFSET = "CL10#INVALID_GLOBAL_OFFSET"
val INVALID_EVENT_WAIT_LIST = "CL10#INVALID_EVENT_WAIT_LIST"
val INVALID_EVENT = "CL10#INVALID_EVENT"
val INVALID_OPERATION = "CL10#INVALID_OPERATION"
val INVALID_BUFFER_SIZE = "CL10#INVALID_BUFFER_SIZE"
val INVALID_GLOBAL_WORK_SIZE = "CL10#INVALID_GLOBAL_WORK_SIZE"

// Errors

val OORE = "CL10#OUT_OF_RESOURCES if there is a failure to allocate resources required by the OpenCL implementation on the device."
val OOHME = "CL10#OUT_OF_HOST_MEMORY if there is a failure to allocate resources required by the OpenCL implementation on the host."

val ICQE = "$INVALID_COMMAND_QUEUE if {@code command_queue} is not a valid command-queue."
val ICE = "$INVALID_CONTEXT if {@code context} is not a valid context."
val IEWLE =
	"""
	$INVALID_EVENT_WAIT_LIST if {@code event_wait_list} is $NULL and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	$NULL and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.
	"""

fun MSBOE(buffer: String) =
	"""
	CL11#MISALIGNED_SUB_BUFFER_OFFSET if {@code $buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
	not aligned to CL10#DEVICE_MEM_BASE_ADDR_ALIGN value for device associated with queue.
	"""

fun ESEFEIWLE(operation: String) =
	"""
	CL11#EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST if the $operation operation is blocking and the execution status of any of the events in
	{@code event_wait_list} is a negative integer value.
	"""

val errcode_ret = "{@code errcode_ret}"
val param_value = "a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is $NULL, it is ignored."

// Arguments

val NEWL = AutoSize("event_wait_list") _ cl_uint.IN("num_events_in_wait_list", "the number of events in {@code event_wait_list}")

val EWL = const _ nullable _ cl_event_p.IN(
	"event_wait_list",
	"""
	a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is $NULL, then this particular command
	does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	{@code event_wait_list} and {@code command_queue} must be the same.
	"""
)

val EVENT = Check(1) _ nullable _ cl_event_p.OUT(
	"event",
	"""
	Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	{@code event} can be $NULL in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	complete. If the {@code event_wait_list} and the {@code event} arguments are not $NULL, the event argument should not refer to an element of the
	{@code event_wait_list} array.
	"""
)

val ERROR_RET = Check(1) _ nullable _ cl_int_p.OUT(
	"errcode_ret",
	"will return an appropriate error code. If $errcode_ret is $NULL, no error code is returned."
)

val PARAM_VALUE_SIZE = AutoSize("param_value") _ size_t.IN(
	"param_value_size",
	"the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is $NULL, it is ignored."
)

val PARAM_VALUE_SIZE_RET = Check(1) _ nullable _ size_t_p.OUT(
	"param_value_size_ret",
	"the actual size in bytes of data being queried by {@code param_value}. If $NULL, it is ignored."
)

val CL10 = "CL10".nativeClassCL("CL10") {
	javaImport (
		"static org.lwjgl.opencl.Info.*"
	)

	nativeImport (
		"OpenCL.h"
	)

	documentation = "The core OpenCL 1.0 functionality."

	IntConstant(
		"Error Codes",

		"SUCCESS" _ 0,
		// We use expr here so that they are not converted to hex by the generator.
		"DEVICE_NOT_FOUND" expr "-1",
		"DEVICE_NOT_AVAILABLE" expr "-2",
		"COMPILER_NOT_AVAILABLE" expr "-3",
		"MEM_OBJECT_ALLOCATION_FAILURE" expr "-4",
		"OUT_OF_RESOURCES" expr "-5",
		"OUT_OF_HOST_MEMORY" expr "-6",
		"PROFILING_INFO_NOT_AVAILABLE" expr "-7",
		"MEM_COPY_OVERLAP" expr "-8",
		"IMAGE_FORMAT_MISMATCH" expr "-9",
		"IMAGE_FORMAT_NOT_SUPPORTED" expr "-10",
		"BUILD_PROGRAM_FAILURE" expr "-11",
		"MAP_FAILURE" expr "-12",

		"INVALID_VALUE" expr "-30",
		"INVALID_DEVICE_TYPE" expr "-31",
		"INVALID_PLATFORM" expr "-32",
		"INVALID_DEVICE" expr "-33",
		"INVALID_CONTEXT" expr "-34",
		"INVALID_QUEUE_PROPERTIES" expr "-35",
		"INVALID_COMMAND_QUEUE" expr "-36",
		"INVALID_HOST_PTR" expr "-37",
		"INVALID_MEM_OBJECT" expr "-38",
		"INVALID_IMAGE_FORMAT_DESCRIPTOR" expr "-39",
		"INVALID_IMAGE_SIZE" expr "-40",
		"INVALID_SAMPLER" expr "-41",
		"INVALID_BINARY" expr "-42",
		"INVALID_BUILD_OPTIONS" expr "-43",
		"INVALID_PROGRAM" expr "-44",
		"INVALID_PROGRAM_EXECUTABLE" expr "-45",
		"INVALID_KERNEL_NAME" expr "-46",
		"INVALID_KERNEL_DEFINITION" expr "-47",
		"INVALID_KERNEL" expr "-48",
		"INVALID_ARG_INDEX" expr "-49",
		"INVALID_ARG_VALUE" expr "-50",
		"INVALID_ARG_SIZE" expr "-51",
		"INVALID_KERNEL_ARGS" expr "-52",
		"INVALID_WORK_DIMENSION" expr "-53",
		"INVALID_WORK_GROUP_SIZE" expr "-54",
		"INVALID_WORK_ITEM_SIZE" expr "-55",
		"INVALID_GLOBAL_OFFSET" expr "-56",
		"INVALID_EVENT_WAIT_LIST" expr "-57",
		"INVALID_EVENT" expr "-58",
		"INVALID_OPERATION" expr "-59",
		"INVALID_BUFFER_SIZE" expr "-61",
		"INVALID_GLOBAL_WORK_SIZE" expr "-63"
	)

	IntConstant(
		"OpenCL Version",

		"VERSION_1_0" _ 1
	)

	IntConstant(
		"cl_bool",

		"FALSE" _ 0,
		"TRUE" _ 1
	)

	val PlatformInfo = IntConstant(
		"cl_platform_info",

		"PLATFORM_PROFILE" _ 0x0900,
		"PLATFORM_VERSION" _ 0x0901,
		"PLATFORM_NAME" _ 0x0902,
		"PLATFORM_VENDOR" _ 0x0903,
		"PLATFORM_EXTENSIONS" _ 0x0904
	).javaDocLinks

	val DeviceTypes = IntConstant(
		"cl_device_type - bitfield",

		"DEVICE_TYPE_DEFAULT" expr "1 << 0",
		"DEVICE_TYPE_CPU" expr "1 << 1",
		"DEVICE_TYPE_GPU" expr "1 << 2",
		"DEVICE_TYPE_ACCELERATOR" expr "1 << 3",
		"DEVICE_TYPE_ALL" _ 0xFFFFFFFF.i
	).javaDocLinks + " CL12#DEVICE_TYPE_CUSTOM"

	val DeviceInfo = IntConstant(
		"cl_device_info",

		"DEVICE_TYPE" _ 0x1000,
		"DEVICE_VENDOR_ID" _ 0x1001,
		"DEVICE_MAX_COMPUTE_UNITS" _ 0x1002,
		"DEVICE_MAX_WORK_ITEM_DIMENSIONS" _ 0x1003,
		"DEVICE_MAX_WORK_GROUP_SIZE" _ 0x1004,
		"DEVICE_MAX_WORK_ITEM_SIZES" _ 0x1005,
		"DEVICE_PREFERRED_VECTOR_WIDTH_CHAR" _ 0x1006,
		"DEVICE_PREFERRED_VECTOR_WIDTH_SHORT" _ 0x1007,
		"DEVICE_PREFERRED_VECTOR_WIDTH_" _ 0x1008,
		"DEVICE_PREFERRED_VECTOR_WIDTH_LONG" _ 0x1009,
		"DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT" _ 0x100A,
		"DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE" _ 0x100B,
		"DEVICE_MAX_CLOCK_FREQUENCY" _ 0x100C,
		"DEVICE_ADDRESS_BITS" _ 0x100D,
		"DEVICE_MAX_READ_IMAGE_ARGS" _ 0x100E,
		"DEVICE_MAX_WRITE_IMAGE_ARGS" _ 0x100F,
		"DEVICE_MAX_MEM_ALLOC_SIZE" _ 0x1010,
		"DEVICE_IMAGE2D_MAX_WIDTH" _ 0x1011,
		"DEVICE_IMAGE2D_MAX_HEIGHT" _ 0x1012,
		"DEVICE_IMAGE3D_MAX_WIDTH" _ 0x1013,
		"DEVICE_IMAGE3D_MAX_HEIGHT" _ 0x1014,
		"DEVICE_IMAGE3D_MAX_DEPTH" _ 0x1015,
		"DEVICE_IMAGE_SUPPORT" _ 0x1016,
		"DEVICE_MAX_PARAMETER_SIZE" _ 0x1017,
		"DEVICE_MAX_SAMPLERS" _ 0x1018,
		"DEVICE_MEM_BASE_ADDR_ALIGN" _ 0x1019,
		"DEVICE_MIN_DATA_TYPE_ALIGN_SIZE" _ 0x101A,
		"DEVICE_SINGLE_FP_CONFIG" _ 0x101B,
		"DEVICE_GLOBAL_MEM_CACHE_TYPE" _ 0x101C,
		"DEVICE_GLOBAL_MEM_CACHELINE_SIZE" _ 0x101D,
		"DEVICE_GLOBAL_MEM_CACHE_SIZE" _ 0x101E,
		"DEVICE_GLOBAL_MEM_SIZE" _ 0x101F,
		"DEVICE_MAX_CONSTANT_BUFFER_SIZE" _ 0x1020,
		"DEVICE_MAX_CONSTANT_ARGS" _ 0x1021,
		"DEVICE_LOCAL_MEM_TYPE" _ 0x1022,
		"DEVICE_LOCAL_MEM_SIZE" _ 0x1023,
		"DEVICE_ERROR_CORRECTION_SUPPORT" _ 0x1024,
		"DEVICE_PROFILING_TIMER_RESOLUTION" _ 0x1025,
		"DEVICE_ENDIAN_LITTLE" _ 0x1026,
		"DEVICE_AVAILABLE" _ 0x1027,
		"DEVICE_COMPILER_AVAILABLE" _ 0x1028,
		"DEVICE_EXECUTION_CAPABILITIES" _ 0x1029,
		"DEVICE_QUEUE_PROPERTIES" _ 0x102A,
		"DEVICE_NAME" _ 0x102B,
		"DEVICE_VENDOR" _ 0x102C,
		"DRIVER_VERSION" _ 0x102D,
		"DEVICE_PROFILE" _ 0x102E,
		"DEVICE_VERSION" _ 0x102F,
		"DEVICE_EXTENSIONS" _ 0x1030,
		"DEVICE_PLATFORM" _ 0x1031
	).javaDocLinks + """ CL11#DEVICE_PREFERRED_VECTOR_WIDTH_HALF CL11#DEVICE_HOST_UNIFIED_MEMORY CL11#DEVICE_NATIVE_VECTOR_WIDTH_CHAR
	CL11#DEVICE_NATIVE_VECTOR_WIDTH_SHORT CL11#DEVICE_NATIVE_VECTOR_WIDTH_INT CL11#DEVICE_NATIVE_VECTOR_WIDTH_LONG
	CL11#DEVICE_NATIVE_VECTOR_WIDTH_FLOAT CL11#DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE CL11#DEVICE_NATIVE_VECTOR_WIDTH_HALF CL11#DEVICE_OPENCL_C_VERSION"""

	IntConstant(
		"cl_device_fp_config - bitfield",

		"FP_DENORM" expr "1 << 0",
		"FP_INF_NAN" expr "1 << 1",
		"FP_ROUND_TO_NEAREST" expr "1 << 2",
		"FP_ROUND_TO_ZERO" expr "1 << 3",
		"FP_ROUND_TO_INF" expr "1 << 4",
		"FP_FMA" expr "1 << 5"
	)

	IntConstant(
		"cl_device_mem_cache_type",

		"NONE" _ 0x0,
		"READ_ONLY_CACHE" _ 0x1,
		"READ_WRITE_CACHE" _ 0x2
	)

	IntConstant(
		"cl_device_local_mem_type",

		"LOCAL" _ 0x1,
		"GLOBAL" _ 0x2
	)

	IntConstant(
		"cl_device_exec_capabilities - bitfield",

		"EXEC_KERNEL" expr "1 << 0",
		"EXEC_NATIVE_KERNEL" expr "1 << 1"
	)

	val CommandQueueProperties = IntConstant(
		"cl_command_queue_properties - bitfield",

		"QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE" expr "1 << 0",
		"QUEUE_PROFILING_ENABLE" expr "1 << 1"
	).javaDocLinks

	val ContextInfo = IntConstant(
		"cl_context_info",

		"CONTEXT_REFERENCE_COUNT" _ 0x1080,
		"CONTEXT_DEVICES" _ 0x1081,
		"CONTEXT_PROPERTIES" _ 0x1082
	).javaDocLinks + " CL11#CONTEXT_NUM_DEVICES"

	val ContextProperties = IntConstant(
		"cl_context_info + cl_context_properties",

		"CONTEXT_PLATFORM" _ 0x1084
	).javaDocLinks + """ CL12#CONTEXT_INTEROP_USER_SYNC KHRGLSharing#GL_CONTEXT_KHR KHRGLSharing#EGL_DISPLAY_KHR KHRGLSharing#GLX_DISPLAY_KHR
	KHRGLSharing#WGL_HDC_KHR KHRGLSharing#CGL_SHAREGROUP_KHR
	"""

	val CommandQueueInfo = IntConstant(
		"cl_command_queue_info",

		"QUEUE_CONTEXT" _ 0x1090,
		"QUEUE_DEVICE" _ 0x1091,
		"QUEUE_REFERENCE_COUNT" _ 0x1092,
		"QUEUE_PROPERTIES" _ 0x1093
	).javaDocLinks + " CL20#QUEUE_SIZE"

	val MemFlags = IntConstant(
		"cl_mem_flags - bitfield",

		"MEM_READ_WRITE" expr "1 << 0",
		"MEM_WRITE_ONLY" expr "1 << 1",
		"MEM_READ_ONLY" expr "1 << 2",
		"MEM_USE_HOST_PTR" expr "1 << 3",
		"MEM_ALLOC_HOST_PTR" expr "1 << 4",
		"MEM_COPY_HOST_PTR" expr "1 << 5"
	).javaDocLinks + " CL12#MEM_HOST_WRITE_ONLY CL12#MEM_HOST_READ_ONLY CL12#MEM_HOST_NO_ACCESS"

	IntConstant(
		"cl_channel_order",

		"R" _ 0x10B0,
		"A" _ 0x10B1,
		"RG" _ 0x10B2,
		"RA" _ 0x10B3,
		"RGB" _ 0x10B4,
		"RGBA" _ 0x10B5,
		"BGRA" _ 0x10B6,
		"ARGB" _ 0x10B7,
		"INTENSITY" _ 0x10B8,
		"LUMINANCE" _ 0x10B9
	)

	IntConstant(
		"cl_channel_type",

		"SNORM_INT8" _ 0x10D0,
		"SNORM_INT16" _ 0x10D1,
		"UNORM_INT8" _ 0x10D2,
		"UNORM_INT16" _ 0x10D3,
		"UNORM_SHORT_565" _ 0x10D4,
		"UNORM_SHORT_555" _ 0x10D5,
		"UNORM_INT_101010" _ 0x10D6,
		"SIGNED_INT8" _ 0x10D7,
		"SIGNED_INT16" _ 0x10D8,
		"SIGNED_INT32" _ 0x10D9,
		"UNSIGNED_INT8" _ 0x10DA,
		"UNSIGNED_INT16" _ 0x10DB,
		"UNSIGNED_INT32" _ 0x10DC,
		"HALF_FLOAT" _ 0x10DD,
		"FLOAT" _ 0x10DE
	)

	IntConstant(
		"cl_mem_object_type",

		"MEM_OBJECT_BUFFER" _ 0x10F0,
		"MEM_OBJECT_IMAGE2D" _ 0x10F1,
		"MEM_OBJECT_IMAGE3D" _ 0x10F2
	)

	val MemInfo = IntConstant(
		"cl_mem_info",

		"MEM_TYPE" _ 0x1100,
		"MEM_FLAGS" _ 0x1101,
		"MEM_SIZE" _ 0x1102,
		"MEM_HOST_PTR" _ 0x1103,
		"MEM_MAP_COUNT" _ 0x1104,
		"MEM_REFERENCE_COUNT" _ 0x1105,
		"MEM_CONTEXT" _ 0x1106
	).javaDocLinks + " CL11#MEM_ASSOCIATED_MEMOBJECT CL11#MEM_OFFSET"

	val ImageInfo = IntConstant(
		"cl_image_info",

		"IMAGE_FORMAT" _ 0x1110,
		"IMAGE_ELEMENT_SIZE" _ 0x1111,
		"IMAGE_ROW_PITCH" _ 0x1112,
		"IMAGE_SLICE_PITCH" _ 0x1113,
		"IMAGE_WIDTH" _ 0x1114,
		"IMAGE_HEIGHT" _ 0x1115,
		"IMAGE_DEPTH" _ 0x1116
	).javaDocLinks + " CL12#IMAGE_ARRAY_SIZE CL12#IMAGE_BUFFER CL12#IMAGE_NUM_MIP_LEVELS CL12#IMAGE_NUM_SAMPLES"

	val AddressingModes = IntConstant(
		"cl_addressing_mode",

		"ADDRESS_NONE" _ 0x1130,
		"ADDRESS_CLAMP_TO_EDGE" _ 0x1131,
		"ADDRESS_CLAMP" _ 0x1132,
		"ADDRESS_REPEAT" _ 0x1133
	).javaDocLinks + " CL11#ADDRESS_MIRRORED_REPEAT"

	val FilterModes = IntConstant(
		"cl_filter_mode",

		"FILTER_NEAREST" _ 0x1140,
		"FILTER_LINEAR" _ 0x1141
	).javaDocLinks

	val SamplerInfo = IntConstant(
		"cl_sampler_info",

		"SAMPLER_REFERENCE_COUNT" _ 0x1150,
		"SAMPLER_CONTEXT" _ 0x1151,
		"SAMPLER_NORMALIZED_COORDS" _ 0x1152,
		"SAMPLER_ADDRESSING_MODE" _ 0x1153,
		"SAMPLER_FILTER_MODE" _ 0x1154
	).javaDocLinks

	val MapFlags = IntConstant(
		"cl_map_flags - bitfield",

		"MAP_READ" expr "1 << 0",
		"MAP_WRITE" expr "1 << 1"
	).javaDocLinks + " CL12#MAP_WRITE_INVALIDATE_REGION"

	val ProgramInfo = IntConstant(
		"cl_program_info",

		"PROGRAM_REFERENCE_COUNT" _ 0x1160,
		"PROGRAM_CONTEXT" _ 0x1161,
		"PROGRAM_NUM_DEVICES" _ 0x1162,
		"PROGRAM_DEVICES" _ 0x1163,
		"PROGRAM_SOURCE" _ 0x1164,
		"PROGRAM_BINARY_SIZES" _ 0x1165,
		"PROGRAM_BINARIES" _ 0x1166
	).javaDocLinks + " CL12#PROGRAM_NUM_KERNELS CL12#PROGRAM_KERNEL_NAMES"

	val ProgramBuildInfo = IntConstant(
		"cl_program_build_info",

		"PROGRAM_BUILD_STATUS" _ 0x1181,
		"PROGRAM_BUILD_OPTIONS" _ 0x1182,
		"PROGRAM_BUILD_LOG" _ 0x1183
	).javaDocLinks + " CL12#PROGRAM_BINARY_TYPE"

	IntConstant(
		"cl_build_status",

		"BUILD_SUCCESS" _ 0,
		"BUILD_NONE" _ -1,
		"BUILD_ERROR" _ -2,
		"BUILD_IN_PROGRESS" _ -3
	)

	val KernelInfo = IntConstant(
		"cl_kernel_info",

		"KERNEL_FUNCTION_NAME" _ 0x1190,
		"KERNEL_NUM_ARGS" _ 0x1191,
		"KERNEL_REFERENCE_COUNT" _ 0x1192,
		"KERNEL_CONTEXT" _ 0x1193,
		"KERNEL_PROGRAM" _ 0x1194
	).javaDocLinks + " CL12#KERNEL_ATTRIBUTES"

	val KernelWorkGroupInfo = IntConstant(
		"cl_kernel_work_group_info",

		"KERNEL_WORK_GROUP_SIZE" _ 0x11B0,
		"KERNEL_COMPILE_WORK_GROUP_SIZE" _ 0x11B1,
		"KERNEL_LOCAL_MEM_SIZE" _ 0x11B2
	).javaDocLinks + " CL11#KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE CL11#KERNEL_PRIVATE_MEM_SIZE CL12#KERNEL_GLOBAL_WORK_SIZE"

	val EventInfo = IntConstant(
		"cl_event_info",

		"EVENT_COMMAND_QUEUE" _ 0x11D0,
		"EVENT_COMMAND_TYPE" _ 0x11D1,
		"EVENT_REFERENCE_COUNT" _ 0x11D2,
		"EVENT_COMMAND_EXECUTION_STATUS" _ 0x11D3
	).javaDocLinks + " CL11#EVENT_CONTEXT"

	IntConstant(
		"cl_command_type",

		"COMMAND_NDRANGE_KERNEL" _ 0x11F0,
		"COMMAND_TASK" _ 0x11F1,
		"COMMAND_NATIVE_KERNEL" _ 0x11F2,
		"COMMAND_READ_BUFFER" _ 0x11F3,
		"COMMAND_WRITE_BUFFER" _ 0x11F4,
		"COMMAND_COPY_BUFFER" _ 0x11F5,
		"COMMAND_READ_IMAGE" _ 0x11F6,
		"COMMAND_WRITE_IMAGE" _ 0x11F7,
		"COMMAND_COPY_IMAGE" _ 0x11F8,
		"COMMAND_COPY_IMAGE_TO_BUFFER" _ 0x11F9,
		"COMMAND_COPY_BUFFER_TO_IMAGE" _ 0x11FA,
		"COMMAND_MAP_BUFFER" _ 0x11FB,
		"COMMAND_MAP_IMAGE" _ 0x11FC,
		"COMMAND_UNMAP_MEM_OBJECT" _ 0x11FD,
		"COMMAND_MARKER" _ 0x11FE,
		"COMMAND_ACQUIRE_GL_OBJECTS" _ 0x11FF,
		"COMMAND_RELEASE_GL_OBJECTS" _ 0x1200
	)

	IntConstant(
		"command execution status",

		"COMPLETE" _ 0x0,
		"RUNNING" _ 0x1,
		"SUBMITTED" _ 0x2,
		"QUEUED" _ 0x3
	)

	val ProfilingInfo = IntConstant(
		"cl_profiling_info",

		"PROFILING_COMMAND_QUEUED" _ 0x1280,
		"PROFILING_COMMAND_SUBMIT" _ 0x1281,
		"PROFILING_COMMAND_START" _ 0x1282,
		"PROFILING_COMMAND_END" _ 0x1283
	).javaDocLinks

	// ------------------[ OPENCL Platform Layer ]------------------

	cl_int(
		"GetPlatformIDs",
		"Obtains the list of available platforms.",

		AutoSize("platforms") _ cl_uint.IN(
			"num_entries",
			"""
			the number of {@code cl_platform_id} entries that can be added to {@code platforms}. If {@code platforms} is not $NULL, the {@code num_entries} must
			be greater than zero.
			"""
		),
		nullable _ cl_platform_id_p.OUT(
			"platforms",
			"""
			returns a list of OpenCL platforms found. The {@code cl_platform_id} values returned in {@code platforms} can be used to identify a specific OpenCL
			platform. If {@code platforms} argument is $NULL, this argument is ignored. The number of OpenCL platforms returned is the minimum of the value
			specified by {@code num_entries} or the number of OpenCL platforms available.
			"""
		),
		Check(1) _ nullable _ cl_uint_p.OUT(
			"num_platforms",
			"returns the number of OpenCL platforms available. If {@code num_platforms} is $NULL, this argument is ignored."
		),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code num_entries} is equal to zero and {@code platforms} is not $NULL or if both {@code num_platforms} and
			{@code platforms} are $NULL.
			""",
			OOHME
		)}
		"""
	)

	cl_int(
		"GetPlatformInfo",
		"Returns information about the specified OpenCL platform.",

		cl_platform_id.IN("platform", "the platform to query"),
		cl_platform_info.IN("param_name", "the parameter to query", PlatformInfo),
		PARAM_VALUE_SIZE,
		nullable _ void_p.OUT("param_value", "the memory location where appropriate values for a given {@code param_name} will be returned"),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PLATFORM if {@code platform} is not a valid platform.",
			"""
			$INVALID_VALUE if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
			size of return type and {@code param_value} is not a $NULL value.
			""",
			OOHME
		)}
		"""
	)

	cl_int(
		"GetDeviceIDs",
		"Obtains the list of devices available on a platform.",

		cl_platform_id.IN("platform", "the platform to query"),
		cl_device_type.IN(
			"device_type",
			"""
			a bitfield that identifies the type of OpenCL device. The {@code device_type} can be used to query specific OpenCL devices or all OpenCL devices
			available.
			""",
			DeviceTypes, LinkMode.BITFIELD
		),
		AutoSize("devices") _ cl_uint.IN(
			"num_entries",
			"""
			the number of {@code cl_device_id} entries that can be added to devices. If {@code devices} is not $NULL, the {@code num_entries} must be greater
			than zero.
			"""
		),
		nullable _ cl_device_id_p.OUT(
			"devices",
			"""
			returns a list of OpenCL devices found. The {@code cl_device_id} values returned in {@code devices} can be used to identify a specific OpenCL
			device. If {@code devices} argument is $NULL, this argument is ignored. The number of OpenCL devices returned is the minimum of the value specified
			by {@code num_entries} or the number of OpenCL devices whose type matches {@code device_type}.
			"""
		),
		Check(1) _ nullable _ cl_uint_p.OUT(
			"num_devices",
			"returns the number of OpenCL devices available that match {@code device_type}. If {@code num_devices} is $NULL, this argument is ignored."
		),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PLATFORM if {@code platform} is not a valid platform.",
			"$INVALID_DEVICE_TYPE if {@code device_type} is not a valid value.",
			"$INVALID_VALUE if {@code num_entries} is equal to zero and {@code devices} is not $NULL or if both {@code num_devices} and {@code devices} are $NULL.",
			"#DEVICE_NOT_FOUND if no OpenCL devices that matched {@code device_type} were found.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetDeviceInfo",
		"""
		Returns specific information about an OpenCL device. {@code device} may be a device returned by #GetDeviceIDs() or a sub-device created by
		CL12#CreateSubDevices(). If {@code device} is a sub-device, the specific information for the sub-device will be returned.
		""",

		cl_device_id.IN("device", "the device to query"),
		cl_device_info.IN(
			"param_name",
			"an enumeration constant tha identifies the device information being queried",
			DeviceInfo
		),
		PARAM_VALUE_SIZE,
		MultiType(
			PointerMapping.DATA_INT, PointerMapping.DATA_LONG, PointerMapping.DATA_POINTER
		) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_DEVICE if {@code device} is not valid.",
			"""
			$INVALID_VALUE if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
			size of return type and {@code param_value} is not a $NULL value or if {@code param_name} is a value that is available as an extension and the
			corresponding extension is not supported by the device.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_context(
		"CreateContext",
		"""
		Creates an OpenCL context. An OpenCL context is created with one or more devices. Contexts are used by the OpenCL runtime for managing objects such as
		command-queues, memory, program and kernel objects and for executing kernels on one or more devices specified in the context.
		""",

		const _ Check(3) _ cl_context_properties_p.IN(
			"properties",
			"""
			a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
			list is terminated with 0.
			""",
			ContextProperties
		),
		AutoSize("devices") _ cl_uint.IN("num_devices", "the number of devices specified in the {@code devices} argument"),
		const _ SingleValue("device") _ cl_device_id_p.IN(
			"devices",
			"a list of unique devices returned by #GetDeviceIDs() or sub-devices created by CL12#CreateSubDevices() for a platform"
		),
		nullable _ cl_create_context_callback.IN(
			"pfn_notify",
			"""
			a callback function that can be registered by the application. This callback function will be used by the OpenCL implementation to report
			information on errors during context creation as well as errors that occur at runtime in this context. This callback function may be called
			asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.

			If {@code pfn_notify} is $NULL, no callback function is registered.
			"""
		),
		nullable _ voidptr.IN("user_data", "will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be $NULL."),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero context and $errcode_ret is set to $SUCCESS if the context is created successfully. Otherwise, it returns a $NULL value with the
		following error values returned in $errcode_ret:
		${ul(
			"""
			$INVALID_PLATFORM if {@code properties} is $NULL and no platform could be selected or if platform value specified in properties is not a
			valid platform.
			""",
			"""
			$INVALID_PROPERTY if context property name in {@code properties} is not a supported property name, if the value specified for a
			supported property name is not valid, or if the same property name is specified more than once.
			""",
			"$INVALID_VALUE if {@code devices} is $NULL.",
			"$INVALID_VALUE if {@code num_devices} is equal to zero.",
			"$INVALID_VALUE if {@code pfn_notify} is $NULL but {@code user_data} is not $NULL.",
			"$INVALID_DEVICE if {@code devices} contains an invalid device.",
			"#DEVICE_NOT_AVAILABLE if a device in {@code devices} is currently not available even though the device was returned by #GetDeviceIDs().",
			OORE,
			OOHME
		)}
		"""
	)

	cl_context(
		"CreateContextFromType",
		"Creates a context using devices of the specified type. See #CreateContext() for details.",

		const _ Check(3) _ cl_context_properties_p.IN(
			"properties",
			"""
			a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
			list is terminated with 0.
			"""
		),
		cl_device_type.IN("device_type", "a bit-field that identifies the type of device", DeviceTypes),
		nullable _ cl_create_context_callback.IN("pfn_notify", "a callback function that can be registered by the application"),
		nullable _ voidptr.IN("user_data", "will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be $NULL."),
		ERROR_RET
	)

	cl_int(
		"RetainContext",
		"""
		Increments the context reference count.

		#CreateContext() and #CreateContextFromType() perform an implicit retain. This is very helpful for 3rd party libraries, which typically get a context passed
		to them by the application. However, it is possible that the application may delete the context without informing the library. Allowing functions to
		attach to (i.e. retain) and release a context solves the problem of a context being used by a library no longer being valid.
		""",

		cl_context.IN("context", "the context to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseContext",
		"""
		Decrements the context reference count.

		After the context reference count becomes zero and all the objects attached to context (such as memory objects, command-queues) are released, the
		context is deleted.
		""",

		cl_context.IN("context", "the context to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetContextInfo",
		"Queries information about a context.",

		cl_context.IN("context", "the OpenCL context being queried"),
		cl_context_info.IN("param_name", "an enumeration constant that specifies the information to query", ContextInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICE,
			"""
			$INVALID_VALUE if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
			size of return type and {@code param_value} is not a $NULL value.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	// ------------------[ OPENCL Runtime ]------------------

	cl_command_queue(
		"CreateCommandQueue",
		"""
		Creates a command-queue on a specific device.

		OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
		The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
		queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
		of objects across multiple command-queues will require the application to perform appropriate synchronization.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		cl_device_id.IN(
			"device",
			"""
			a device associated with context. It can either be in the list of devices specified when context is created using #CreateContext() or have the same
			device type as device type specified when context is created using #CreateContextFromType().
			"""
		),
		cl_command_queue_properties.IN("properties", "a bit-field of properties for the command-queue", CommandQueueProperties),
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

	cl_int(
		"RetainCommandQueue",
		"""
		Increments the {@code command_queue} reference count.

		#CreateCommandQueue() performs an implicit retain. This is very helpful for 3rd party libraries, which typically get a command-queue passed to them by the
		application. However, it is possible that the application may delete the command-queue without informing the library. Allowing functions to attach to
		(i.e. retain) and release a command-queue solves the problem of a command-queue being used by a library no longer being valid.
		""",

		cl_command_queue.IN("command_queue", "the command-queue to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseCommandQueue",
		"""
		Decrements the {@code command_queue} reference count.

		After the {@code command_queue} reference count becomes zero and all commands queued to {@code command_queue} have finished (eg. kernel executions,
		memory object updates etc.), the command-queue is deleted.

		{@code clReleaseCommandQueue} performs an implicit flush to issue any previously queued OpenCL commands in command_queue.
		""",

		cl_command_queue.IN("command_queue", "the command-queue to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetCommandQueueInfo",
		"Queries information about a command-queue.",

		cl_command_queue.IN("command_queue", "the command-queue being queried"),
		cl_command_queue_info.IN("param_name", "the information to query", CommandQueueInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_VALUE if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
			size of return type and {@code param_value} is not a $NULL value.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_mem(
		"CreateBuffer",
		"Creates a buffer object.",

		cl_context.IN("context", "a valid OpenCL context used to create the buffer object"),
		cl_mem_flags.IN(
			"flags",
			"""
			a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
			how it will be used. If value specified for flags is 0, the default is used which is #MEM_READ_WRITE.
			""",
			MemFlags
		),
		AutoSize("host_ptr") _ size_t.IN("size", "the size in bytes of the buffer memory object to be allocated"),
		MultiType(PointerMapping.DATA_BYTE, PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ optional _ void_p.IN(
			"host_ptr",
			"""
			a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
			&#x2265; {@code size} bytes.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero buffer object and $errcode_ret is set to $SUCCESS if the buffer object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_VALUE if values specified in flags are not valid.",
			"""
			$INVALID_BUFFER_SIZE if size is 0. Implementations may return $INVALID_BUFFER_SIZE if size is greater than
			#DEVICE_MAX_MEM_ALLOC_SIZE value all devices in context.
			""",
			"""
			$INVALID_HOST_PTR if {@code host_ptr} is $NULL and #MEM_USE_HOST_PTR or #MEM_COPY_HOST_PTR are set in flags or if
			{@code host_ptr} is not $NULL but #MEM_COPY_HOST_PTR or #MEM_USE_HOST_PTR are not set in flags.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for buffer object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueReadBuffer",
		"""
		Enqueues a command to read from a buffer object to host memory.

		Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
		{@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with #MEM_USE_HOST_PTR, must meet
		the following requirements in order to avoid undefined behavior:
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
			indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>

			If {@code blocking_read} is $TRUE i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
			read and copied into memory pointed to by {@code ptr}.

			If {@code blocking_read} is $FALSE i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
			returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
			returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
			the buffer that {@code ptr} points to can be used by the application.
			"""
		),
		size_t.IN("offset", "the offset in bytes in the buffer object to read from"),
		AutoSize("ptr") _ size_t.IN("size", "the size in bytes of data being read"),
		MultiType(
			PointerMapping.DATA_BYTE, PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
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
			"""
			$INVALID_VALUE if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a $NULL value or if
			{@code size} is 0.
			""",
			IEWLE,
			MSBOE("buffer"),
			ESEFEIWLE("read"),
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with buffer.",
			"""
			$INVALID_OPERATION if {@code clEnqueueReadBuffer} is called on buffer which has been created with CL12#MEM_HOST_WRITE_ONLY or
			CL12#MEM_HOST_NO_ACCESS.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueWriteBuffer",
		"""
		Enqueues a command to write to a buffer object from host memory.

		Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
		{@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
		#MEM_USE_HOST_PTR, must meet the following requirements in order to avoid undefined behavior:
		${ul(
			"The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.",
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
			indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>

			If {@code blocking_write} is $TRUE, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
			command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.

			If {@code blocking_write} is $FALSE, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
			the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
			{@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
			completed, the memory pointed to by {@code ptr} can then be reused by the application.
			"""
		),
		size_t.IN("offset", "the offset in bytes in the buffer object to write to"),
		AutoSize("ptr") _ size_t.IN("size", "the size in bytes of data being written"),
		MultiType(PointerMapping.DATA_BYTE, PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ const _ void_p.IN("ptr", "the pointer to buffer in host memory where data is to be written from"),
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
			"""
			$INVALID_VALUE if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a $NULL value or if
			{@code size} is 0.
			""",
			IEWLE,
			MSBOE("buffer"),
			ESEFEIWLE("write"),
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with buffer.",
			"""
			$INVALID_OPERATION if {@code clEnqueueWriteBuffer} is called on buffer which has been created with CL12#MEM_HOST_READ_ONLY or
			CL12#MEM_HOST_NO_ACCESS.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueCopyBuffer",
		"Enqueues a command to copy a buffer object identified by {@code src_buffer} to another buffer object identified by {@code dst_buffer}.",

		cl_command_queue.IN(
			"command_queue",
			"""
			the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
			{@code dst_buffer} must be the same.
			"""
		),
		cl_mem.IN("src_buffer", "the source buffer"),
		cl_mem.IN("dst_buffer", "the destination buffer"),
		size_t.IN("src_offset", "the offset where to begin copying data from {@code src_buffer}."),
		size_t.IN("dst_offset", "the offset where to begin copying data into {@code dst_buffer}"),
		size_t.IN("size", "the size in bytes to copy"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or if
			the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.",
			"""
			$INVALID_VALUE if {@code src_offset}, {@code dst_offset}, {@code size}, {@code src_offset + size} or {@code dst_offset + size} require
			accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.
			""",
			"$INVALID_VALUE if {@code size} is 0.",
			IEWLE,
			MSBOE("src_buffer"),
			MSBOE("dst_buffer"),
			"""
			#MEM_COPY_OVERLAP if {@code src_buffer} and {@code dst_buffer} are the same buffer or sub-buffer object and the source and destination
			regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap. The
			regions overlap if ${code("src_offset &#x2264 dst_offset &#x2264 src_offset + size – 1")} or if
			${code("dst_offset &#x2264 src_offset &#x2264 dst_offset + size – 1")}.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.",
			OORE,
			OOHME
		)}
		"""
	)

	(MapPointer("size") _ void_p)(
		"EnqueueMapBuffer",
		"""
		Enqueues a command to map a region of the buffer object given by buffer into the host address space and returns a pointer to this mapped region.


		The pointer returned maps a region starting at {@code offset} and is at least {@code size} bytes in size. The result of a memory access outside this
		region is undefined.

		If the buffer object is created with #MEM_USE_HOST_PTR set in {@code mem_flags}, the following will be true:
		${ul(
			"""
			The {@code host_ptr} specified in #CreateBuffer() is guaranteed to contain the latest bits in the region being mapped when the
			{@code clEnqueueMapBuffer} command has completed.
			""",
			"The pointer value returned by {@code clEnqueueMapBuffer} will be derived from the {@code host_ptr} specified when the buffer object is created."
		)}

		Mapped buffer objects are unmapped using #EnqueueUnmapMemObject().
		""",

		cl_command_queue.IN("command_queue", "a valid command-queue"),
		cl_mem.IN("buffer", "a valid buffer object. The OpenCL context associated with command_queue and buffer must be the same."),
		cl_bool.IN(
			"blocking_map",
			"""
			indicates if the map operation is blocking or non-blocking.

			If {@code blocking_map} is $TRUE, {@code clEnqueueMapBuffer} does not return until the specified region in buffer is mapped into the host address
			space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapBuffer}.

			If {@code blocking_map} is $FALSE i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapBuffer}
			cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
			status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
			returned by {@code clEnqueueMapBuffer}.
			"""
		),
		cl_map_flags.IN("map_flags", "a bit-field", MapFlags),
		size_t.IN("offset", "the offset in bytes of the region in the buffer object that is being mapped"),
		size_t.IN("size", "the size in bytes of the region in the buffer object that is being mapped"),
		NEWL,
		EWL,
		EVENT,
		ERROR_RET,

		returnDoc =
		"""
		a pointer to the mapped region. The $errcode_ret is set to $SUCCESS. A $NULL pointer is returned otherwise with one of the following error values
		returned in $errcode_ret:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated with
			{@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code buffer} is not a valid buffer object.",
			"""
			$INVALID_VALUE if region being mapped given by {@code (offset, size)} is out of bounds or if {@code size} is 0 or if values specified in
			{@code map_flags} are not valid.
			""",
			IEWLE,
			MSBOE("buffer"),
			"""
			#MAP_FAILURE if there is a failure to map the requested region into the host address space. This error cannot occur for buffer objects
			created with #MEM_USE_HOST_PTR or #MEM_ALLOC_HOST_PTR.
			""",
			ESEFEIWLE("map"),
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code buffer}.",
			"""
			$INVALID_OPERATION if buffer has been created with CL12#MEM_HOST_WRITE_ONLY or CL12#MEM_HOST_NO_ACCESS and
			#MAP_READ is set in {@code map_flags} or if {@code buffer} has been created with CL12#MEM_HOST_READ_ONLY or
			CL12#MEM_HOST_NO_ACCESS and #MAP_WRITE or CL12#MAP_WRITE_INVALIDATE_REGION is set in {@code map_flags}.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_mem(
		"CreateImage2D",
		"Creates a 2D image object.",

		cl_context.IN("context", "a valid OpenCL context on which the image object is to be created"),
		cl_mem_flags.IN("flags", "a bit-field that is used to specify allocation and usage information about the image memory object being created", MemFlags),
		const _ cl_image_format_p.IN("image_format", "a pointer to a ##CLImageFormat structure that describes format properties of the image to be allocated"),
		size_t.IN("image_width", "the width of the image in pixels"),
		size_t.IN("image_height", "the height of the image in pixels"),
		size_t.IN(
			"image_row_pitch",
			"""
			the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is $NULL and can be either 0 or &#x2265; {@code image_width * size} of element in
			bytes if {@code host_ptr} is not $NULL. If {@code host_ptr} is not $NULL and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
			{@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
			"""
		),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT) _ nullable _ void_p.IN(
			"host_ptr",
			"""
			a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
			{@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
			stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero image object and $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_VALUE if values specified in {@code flags} are not valid.",
			"$INVALID_IMAGE_FORMAT_DESCRIPTOR if values specified in {@code image_format} are not valid or if {@code image_format} is $NULL.",
			"""
			$INVALID_IMAGE_SIZE if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
			#DEVICE_IMAGE2D_MAX_WIDTH or #DEVICE_IMAGE2D_MAX_HEIGHT respectively for all devices in {@code context} or if values specified
			by {@code image_row_pitch} do not follow rules described in the argument description.
			""",
			"""
			$INVALID_HOST_PTR if {@code host_ptr} is $NULL and #MEM_USE_HOST_PTR or #MEM_COPY_HOST_PTR are set in flags or if
			{@code host_ptr} is not $NULL but #MEM_COPY_HOST_PTR or #MEM_USE_HOST_PTR are not set in flags.
			""",
			"#IMAGE_FORMAT_NOT_SUPPORTED if the {@code image_format} is not supported.",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for image object.",
			"""
			$INVALID_OPERATION if there are no devices in {@code context} that support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_mem(
		"CreateImage3D",
		"Creates a 3D image object.",

		cl_context.IN("context", "a valid OpenCL context on which the image object is to be created"),
		cl_mem_flags.IN("flags", "a bit-field that is used to specify allocation and usage information about the image memory object being created", MemFlags),
		const _ cl_image_format_p.IN("image_format", "a pointer to a ##CLImageFormat structure that describes format properties of the image to be allocated"),
		size_t.IN("image_width", "the width of the image in pixels"),
		size_t.IN("image_height", "the height of the image in pixels"),
		size_t.IN("image_depth", "the depth of the image in pixels. This must be a value &gt; 1."),
		size_t.IN(
			"image_row_pitch",
			"""
			the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is $NULL and can be either 0 or &#x2265; {@code image_width * size} of element in
			bytes if {@code host_ptr} is not $NULL. If {@code host_ptr} is not $NULL and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
			{@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
			"""
		),
		size_t.IN(
			"image_slice_pitch",
			"""
			the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is $NULL and can be either 0 or &#x2265;
			{@code image_row_pitch * image_height} if {@code host_ptr} is not $NULL. If {@code host_ptr} is not $NULL and {@code image_slice_pitch = 0},
			{@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
			the {@code image_row_pitch}.
			"""
		),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT) _ nullable _ void_p.IN(
			"host_ptr",
			"""
			a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
			{@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
			stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
			image elements.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero image object and $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_VALUE if values specified in {@code flags} are not valid.",
			"$INVALID_IMAGE_FORMAT_DESCRIPTOR if values specified in {@code image_format} are not valid or if {@code image_format} is $NULL.",
			"""
			$INVALID_IMAGE_SIZE if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
			specified in #DEVICE_IMAGE3D_MAX_WIDTH, #DEVICE_IMAGE3D_MAX_HEIGHT or #DEVICE_IMAGE3D_MAX_DEPTH respectively for
			all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
			argument descriptions.
			""",
			"""
			$INVALID_HOST_PTR if {@code host_ptr} is $NULL and #MEM_USE_HOST_PTR or #MEM_COPY_HOST_PTR are set in flags or if
			{@code host_ptr} is not $NULL but #MEM_COPY_HOST_PTR or #MEM_USE_HOST_PTR are not set in flags.
			""",
			"#IMAGE_FORMAT_NOT_SUPPORTED if the {@code image_format} is not supported.",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for image object.",
			"""
			$INVALID_OPERATION if there are no devices in {@code context} that support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetSupportedImageFormats",
		"""
		Can be used to get the list of image formats supported by an OpenCL implementation when the following information about an image memory object is
		specified:
		${ul(
			"Context",
			"Image type – 1D, 2D, or 3D image, 1D image buffer, 1D or 2D image array",
			"Image object allocation information"
		)}

		{@code clGetSupportedImageFormats} returns a union of image formats supported by all devices in the context.
		""",

		cl_context.IN("context", "a valid OpenCL context on which the image object(s) will be created"),
		cl_mem_flags.IN("flags", "a bit-field that is used to specify allocation and usage information about the image memory object being created", MemFlags),
		cl_mem_object_type.IN(
			"image_type",
			"the image type",
			"""
			CL12#MEM_OBJECT_IMAGE1D CL12#MEM_OBJECT_IMAGE1D_BUFFER #MEM_OBJECT_IMAGE2D #MEM_OBJECT_IMAGE3D CL12#MEM_OBJECT_IMAGE1D_ARRAY
			CL12#MEM_OBJECT_IMAGE2D_ARRAY
			"""
		),
		AutoSize("image_formats") _ cl_uint.IN(
			"num_entries",
			"the number of entries that can be returned in the memory location given by {@code image_formats}"
		),
		nullable _ cl_image_format_p.OUT(
			"image_formats",
			"""
			a pointer to a memory location where the list of supported image formats are returned. Each entry describes a ##CLImageFormat structure
			supported by the OpenCL implementation. If {@code image_formats} is $NULL, it is ignored.
			"""
		),
		Check(1) _ nullable _ cl_uint_p.OUT(
			"num_image_formats",
			"""
			the actual number of supported image formats for a specific context and values specified by {@code flags}. If {@code num_image_formats} is $NULL, it
			is ignored.
			"""
		),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICE,
			"$INVALID_VALUE if {@code flags} or {@code image_type} are not valid, or if {@code num_entries} is 0 and {@code image_formats} is not $NULL.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueReadImage",
		"""
		Enqueues a command to read from an image or image array object to host memory.

		Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
		${code("host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)")}, where {@code host_ptr} is a pointer
		to the memory region specified when the image being read is created with #MEM_USE_HOST_PTR, must meet the following requirements in order to
		avoid undefined behavior:
		${ul(
			"All commands that use this image object have finished execution before the read command begins execution.",
			"The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.",
			"The image object is not mapped.",
			"The image object is not used by any command-queue until the read command has finished execution."
		)}
		""",

		cl_command_queue.IN(
			"command_queue",
			"the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context."
		),
		cl_mem.IN("image", "a valid image or image array object"),
		cl_bool.IN(
			"blocking_read",
			"""
			indicates if the read operation is blocking or non-blocking.

			If {@code blocking_read} is $TRUE i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
			been read and copied into memory pointed to by {@code ptr}.

			If {@code blocking_read} is $FALSE i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
			and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
			returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
			the buffer that {@code ptr} points to can be used by the application.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"origin",
			"""
			defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
			is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
			{@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
			{@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"region",
			"""
			defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
			the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
			{@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
			{@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
			"""
		),
		size_t.IN(
			"row_pitch",
			"""
			the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
			to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
			"""
		),
		size_t.IN(
			"slice_pitch",
			"""
			the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
			is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
			slice pitch is calculated based on the {@code row_pitch * height}.
			"""
		),
		MultiType(
			PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE
		) _ void_p.OUT("ptr", "the pointer to a buffer in host memory where image data is to be read from"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
			with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code image} is not a valid image object.",
			"""
			$INVALID_VALUE if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
			$NULL value.
			""",
			"""
			$INVALID_VALUE if values in {@code origin} and {@code region} do not follow rules described in the argument description for
			{@code origin} and {@code region}.
			""",
			IEWLE,
			"""
			$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
			supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code image} are not supported by device associated
			with queue.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code image}.",
			"""
			$INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			"""
			$INVALID_OPERATION if {@code clEnqueueReadImage} is called on image which has been created with CL12#MEM_HOST_WRITE_ONLY or
			CL12#MEM_HOST_NO_ACCESS.
			""",
			"""
			$INVALID_OPERATION if {@code clEnqueueWriteImage} is called on image which has been created with CL12#MEM_HOST_READ_ONLY or
			CL12#MEM_HOST_NO_ACCESS.
			""",
			ESEFEIWLE("read"),
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueWriteImage",
		"""
		Enqueues a command to write to an image or image array object from host memory.

		Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
		${code("host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)")}, where {@code host_ptr} is a pointer
		to the memory region specified when the image being written is created with #MEM_USE_HOST_PTR, must meet the following requirements in order
		to avoid undefined behavior:
		${ul(
			"The host memory region being written contains the latest bits when the enqueued write command begins execution.",
			"The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.",
			"The image object is not mapped.",
			"The image object is not used by any command-queue until the write command has finished execution."
		)}
		""",

		cl_command_queue.IN(
			"command_queue",
			"the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context."
		),
		cl_mem.IN("image", "a valid image or image array object"),
		cl_bool.IN(
			"blocking_write",
			"""
			indicates if the read operation is blocking or non-blocking.

			If {@code blocking_write} is $TRUE, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
			command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.

			If {@code blocking_write} is $FALSE, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
			the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
			{@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
			completed, the memory pointed to by {@code ptr} can then be reused by the application.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"origin",
			"""
			defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
			is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
			{@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
			{@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"region",
			"""
			defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
			the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
			{@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
			{@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
			"""
		),
		size_t.IN(
			"input_row_pitch",
			"""
			the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
			to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
			"""
		),
		size_t.IN(
			"input_slice_pitch",
			"""
			the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
			is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
			slice pitch is calculated based on the {@code input_row_pitch * height}.
			"""
		),
		MultiType(PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT, PointerMapping.DATA_DOUBLE) _ const _ void_p.IN("ptr", "the pointer to a buffer in host memory where image data is to be written to"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
			with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code image} is not a valid image object.",
			"""
			$INVALID_VALUE if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
			$NULL value.
			""",
			"""
			$INVALID_VALUE if values in {@code origin} and {@code region} do not follow rules described in the argument description for
			{@code origin} and {@code region}.
			""",
			IEWLE,
			"""
			$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
			supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code image} are not supported by device associated
			with queue.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code image}.",
			"""
			$INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			"""
			$INVALID_OPERATION if {@code clEnqueueReadImage} is called on image which has been created with CL12#MEM_HOST_WRITE_ONLY or
			CL12#MEM_HOST_NO_ACCESS.
			""",
			"""
			$INVALID_OPERATION if {@code clEnqueueWriteImage} is called on image which has been created with CL12#MEM_HOST_READ_ONLY or
			CL12#MEM_HOST_NO_ACCESS.
			""",
			ESEFEIWLE("write"),
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueCopyImage",
		"""
		Enqueues a command to copy image objects. {@code src_image} and {@code dst_image} can be 1D, 2D, 3D image or a 1D, 2D image array objects allowing us to
		perform the following actions:
		${ul(
			"Copy a 1D image object to a 1D image object.",
			"Copy a 1D image object to a scanline of a 2D image object and vice-versa.",
			"Copy a 1D image object to a scanline of a 2D slice of a 3D image object and vice-versa.",
			"Copy a 1D image object to a scanline of a specific image index of a 1D or 2D image array object and vice-versa.",
			"Copy a 2D image object to a 2D image object.",
			"Copy a 2D image object to a 2D slice of a 3D image object and vice-versa.",
			"Copy a 2D image object to a specific image index of a 2D image array object and vice-versa.",
			"Copy images from a 1D image array object to a 1D image array object.",
			"Copy images from a 2D image array object to a 2D image array object.",
			"Copy a 3D image object to a 3D image object."
		)}
		""",

		cl_command_queue.IN(
			"command_queue",
			"""
			the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_image} and
			{@code dst_image} must be the same.
			"""
		),
		cl_mem.IN("src_image", ""),
		cl_mem.IN("dst_image", ""),
		const _ Check(3) _ size_t_p.IN(
			"src_origin",
			"""
			the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
			{@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
			{@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
			array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"dst_origin",
			"""
			the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
			{@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
			image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
			index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"region",
			"""
			the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
			of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
			{@code src_image} or {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image or
			1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image array object,
			{@code region[2]} must be 1. The values in {@code region} cannot be 0.
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
			$INVALID_CONTEXT if the context associated with {@code command_queue}, {@code src_image} and {@code dst_image} are not the same or if the
			context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code src_image} and {@code dst_image} are not valid image objects.",
			"#IMAGE_FORMAT_MISMATCH if {@code src_image} and {@code dst_image} do not use the same image format.",
			"""
			$INVALID_VALUE if the 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
			outside {@code src_image}, or if the 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refers to a region
			outside {@code dst_image}.
			""",
			"""
			$INVALID_VALUE if values in {@code src_origin}, {@code dst_origin} and {@code region} do not follow rules described in the argument
			description for {@code src_origin}, {@code dst_origin} and {@code region}.
			""",
			IEWLE,
			"""
			$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} or
			{@code dst_image} are not supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code src_image} or {@code dst_image} are not
			supported by device associated with queue.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_image}.",
			OORE,
			OOHME,
			"""
			$INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			"#MEM_COPY_OVERLAP if {@code src_image} and {@code dst_image} are the same image object and the source and destination regions overlap."
		)}
		"""
	)

	cl_int(
		"EnqueueCopyImageToBuffer",
		"Enqueues a command to copy an image object to a buffer object.",

		cl_command_queue.IN(
			"command_queue",
			"a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} must be the same."
		),
		cl_mem.IN("src_image", "a valid image object"),
		cl_mem.IN("dst_buffer", "a valid buffer object"),
		const _ Check(3) _ size_t_p.IN(
			"src_origin",
			"""
			the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
			{@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
			{@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
			array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"region",
			"""
			the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
			of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
			{@code src_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} is a 1D image or 1D image buffer object, {@code region[1]}
			and {@code region[2]} must be 1. If {@code src_image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot
			be 0.
			"""
		),
		size_t.IN(
			"dst_offset",
			"""
			the offset where to begin copying data into {@code dst_buffer}. The size in bytes of the region to be copied referred to as {@code dst_cb} is
			computed as ${code("width * height * depth * bytes/image element")} if {@code src_image} is a 3D image object, is computed as
			${code("width * height * bytes/image element")} if {@code src_image} is a 2D image, is computed as
			${code("width * height * arraysize * bytes/image element")} if {@code src_image} is a 2D image array object, is computed as
			${code("width * bytes/image element")} if {@code src_image} is a 1D image or 1D image buffer object and is computed as
			${code("width * arraysize * bytes/image element")} if {@code src_image} is a 1D image array object.
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
			$INVALID_CONTEXT if the context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} are not the same or if
			the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"""
			$INVALID_MEM_OBJECT if {@code src_image} is not a valid image object or {@code dst_buffer} is not a valid buffer object or if
			{@code src_image} is a 1D image buffer object created from {@code dst_buffer}.
			""",
			"""
			$INVALID_VALUE if the 1D, 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
			outside {@code src_image}, or if the region specified by {@code dst_offset} and {@code dst_offset + dst_cb} to a region outside {@code dst_buffer}.
			""",
			"""
			$INVALID_VALUE if values in {@code src_origin} and region do not follow rules described in the argument description for
			{@code src_origin} and {@code region}.
			""",
			IEWLE,
			MSBOE("dst_buffer"),
			"""
			$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} are not
			supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code src_image} are not supported by device
			associated with queue.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_buffer}.",
			"""
			$INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueCopyBufferToImage",
		"Enqueues a command to copy a buffer object to an image object.",

		cl_command_queue.IN(
			"command_queue",
			"a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} must be the same."
		),
		cl_mem.IN("src_buffer", "a valid buffer object"),
		cl_mem.IN("dst_image", "a valid image object"),
		size_t.IN("src_offset", "the offset where to begin copying data from {@code src_buffer}"),
		const _ Check(3) _ size_t_p.IN(
			"dst_origin",
			"""
			the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
			{@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
			image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
			index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"region",
			"""
			the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
			of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
			{@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code dst_image} is a 1D image or
			1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code dst_image} is a 1D image array object,
			{@code region[2]} must be 1. The values in {@code region} cannot be 0.
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
			$INVALID_CONTEXT if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} are not the same or if
			the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"""
			$INVALID_MEM_OBJECT if {@code src_buffer} is not a valid buffer object or {@code dst_image} is not a valid image object or if
			{@code dst_image} is a 1D image buffer object created from {@code src_buffer}.
			""",
			"""
			$INVALID_VALUE if the 1D, 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refer to a region
			outside {@code dst_image}, or if the region specified by {@code src_offset} and {@code src_offset + src_cb refer} to a region outside
			{@code src_buffer}.
			""",
			"""
			$INVALID_VALUE if values in {@code dst_origin} and {@code region} do not follow rules described in the argument description for
			{@code dst_origin} and {@code region}.
			""",
			IEWLE,
			MSBOE("src_buffer"),
			"""
			$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code dst_image} are not
			supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code dst_image} are not supported by device
			associated with queue.
			""",
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_image}.",
			"""
			$INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			OORE,
			OOHME
		)}
		"""
	)

	(MapPointer("(int)clGetMemObjectInfoPointer(image, CL_MEM_SIZE)") _ void_p)(
		"EnqueueMapImage",
		"""
		Enqueues a command to map a region in the image object given by {@code image} into the host address space and returns a pointer to this mapped region.

		The pointer returned maps a 1D, 2D or 3D region starting at {@code origin} and is at least {@code region[0]} pixels in size for a 1D image, 1D image
		buffer or 1D image array, {@code (image_row_pitch * region[1])} pixels in size for a 2D image or 2D image array, and
		{@code (image_slice_pitch * region[2])} pixels in size for a 3D image. The result of a memory access outside this region is undefined.

		If the image object is created with #MEM_USE_HOST_PTR set in {@code mem_flags}, the following will be true:
		${ul(
			"""
			The {@code host_ptr} specified in CL12#CreateImage() is guaranteed to contain the latest bits in the region being mapped when the
			{@code clEnqueueMapImage} command has completed.
			""",
			"The pointer value returned by {@code clEnqueueMapImage} will be derived from the {@code host_ptr} specified when the image object is created."
		)}
		Mapped image objects are unmapped using #EnqueueUnmapMemObject().
		""",

		cl_command_queue.IN("command_queue", "a valid command-queue"),
		cl_mem.IN("image", "a valid image object. The OpenCL context associated with {@code command_queue} and {@code image} must be the same."),
		cl_bool.IN(
			"blocking_map",
			"""
			indicates if the map operation is blocking or non-blocking.

			If {@code blocking_map} is $TRUE, {@code clEnqueueMapImage} does not return until the specified region in image is mapped into the host address
			space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapImage}.

			If {@code blocking_map} is $FALSE i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapImage}
			cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
			status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
			returned by {@code clEnqueueMapImage}.
			"""
		),
		cl_map_flags.IN("map_flags", "a bit-field", MapFlags),
		const _ Check(3) _ size_t_p.IN(
			"origin",
			"""
			the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
			{@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
			is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
			{@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
			{@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
			"""
		),
		const _ Check(3) _ size_t_p.IN(
			"region",
			"""
			the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
			of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If {@code image} is
			a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]}
			must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
			"""
		),
		Check(1) _ size_t_p.OUT("image_row_pitch", "the scan-line pitch in bytes for the mapped region. This must be a non-$NULL value."),
		Check(1) _ nullable _ size_t_p.OUT(
			"image_slice_pitch",
			"""
			returns the size in bytes of each 2D slice of a 3D image or the size of each 1D or 2D image in a 1D or 2D image array for the mapped region. For a
			1D and 2D image, zero is returned if this argument is not $NULL. For a 3D image, 1D and 2D image array, {@code image_slice_pitch} must be a non-$NULL
			value.
			"""
		),
		NEWL,
		EWL,
		EVENT,
		ERROR_RET,

		returnDoc =
		"""
		a pointer to the mapped region. The $errcode_ret is set to $SUCCESS. A $NULL pointer is returned otherwise with one of the following error values
		returned in $errcode_ret:
		${ul(
			ICQE,
			"""
			$INVALID_CONTEXT if context associated with {@code command_queue} and image are not the same or if context associated with
			{@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_MEM_OBJECT if {@code image} is not a valid image object.",
			"""
			$INVALID_VALUE if region being mapped given by {@code (origin, origin+region)} is out of bounds or if values specified in
			{@code map_flags} are not valid.
			""",
			"""
			$INVALID_VALUE if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin}
			and {@code region}.
			""",
			"$INVALID_VALUE if {@code image_row_pitch} is $NULL.",
			"$INVALID_VALUE if {@code image} is a 3D image, 1D or 2D image array object and {@code image_slice_pitch} is $NULL.",
			IEWLE,
			"""
			$INVALID_IMAGE_SIZE if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
			supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if image format (image channel order and data type) for {@code image} are not supported by device associated
			with queue.
			""",
			"""
			#MAP_FAILURE if there is a failure to map the requested region into the host address space. This error cannot occur for image objects
			created with #MEM_USE_HOST_PTR or #MEM_ALLOC_HOST_PTR.
			""",
			ESEFEIWLE("map"),
			"#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with {@code image}.",
			"""
			$INVALID_OPERATION if the device associated with {@code command_queue} does not support images (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			"""
			$INVALID_OPERATION if {@code image} has been created with CL12#MEM_HOST_WRITE_ONLY or CL12#MEM_HOST_NO_ACCESS and
			#MAP_READ is set in {@code map_flags} or if image has been created with CL12#MEM_HOST_READ_ONLY or
			CL12#MEM_HOST_NO_ACCESS and #MAP_WRITE or CL12#MAP_WRITE_INVALIDATE_REGION is set in {@code map_flags}.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetImageInfo",
		"Returns information specific to an image object.",

		cl_mem.IN("image", "the image object being queried"),
		cl_image_info.IN("param_name", "the information to query", ImageInfo),
		PARAM_VALUE_SIZE,
		MultiType(
			PointerMapping.DATA_INT,
			PointerMapping.DATA_POINTER
		) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_MEM_OBJECT if {@code image} is a not a valid image object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"RetainMemObject",
		"""
		Increments the {@code memobj} reference count.

		#CreateBuffer(), CL11#CreateSubBuffer() and CL12#CreateImage() perform an implicit retain.
		""",

		cl_mem.IN("memobj", "the memory object to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_MEM_OBJECT if {@code memobj} is not a valid memory object (buffer or image object).",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseMemObject",
		"""
		Decrements the {@code memobj} reference count.

		After the {@code memobj} reference count becomes zero and commands queued for execution on a command-queue(s) that use {@code memobj} have finished, the
		memory object is deleted. If {@code memobj} is a buffer object, {@code memobj} cannot be deleted until all sub-buffer objects associated with
		{@code memobj} are deleted.
		""",

		cl_mem.IN("memobj", "the memory object to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_MEM_OBJECT if {@code memobj} is not a valid memory object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueUnmapMemObject",
		"""
		Enqueues a command to unmap a previously mapped region of a memory object. Reads or writes from the host using the pointer returned by
		#EnqueueMapBuffer() or #EnqueueMapImage() are considered to be complete.

		#EnqueueMapBuffer(), and #EnqueueMapImage() increments the mapped count of the memory object. The initial mapped count value of the memory object is zero.
		Multiple calls to #EnqueueMapBuffer(), or #EnqueueMapImage() on the same memory object will increment this mapped count by appropriate number of calls.
		{@code clEnqueueUnmapMemObject} decrements the mapped count of the memory object. #EnqueueMapBuffer(), and #EnqueueMapImage() act as synchronization points
		for a region of the buffer object being mapped.
		""",

		cl_command_queue.IN("command_queue", "a valid command-queue"),
		cl_mem.IN("memobj", "a valid memory object. The OpenCL context associated with {@code command_queue} and {@code memobj} must be the same."),
		void_p.IN("mapped_ptr", "the host address returned by a previous call to #EnqueueMapBuffer(), or #EnqueueMapImage() for {@code memobj}"),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_MEM_OBJECT if {@code memobj} is not a valid memory object.",
			"$INVALID_VALUE if {@code mapped_ptr} is not a valid pointer returned by #EnqueueMapBuffer(), or #EnqueueMapImage() for {@code memobj}.",
			IEWLE,
			OORE,
			OOHME,
			"""
			$INVALID_CONTEXT if context associated with {@code command_queue} and {@code memobj} are not the same or if the context associated with
			{@code command_queue} and events in {@code event_wait_list} are not the same.
			"""
		)}
		"""
	)

	cl_int(
		"GetMemObjectInfo",
		"Returns information that is common to all memory objects (buffer and image objects).",

		cl_mem.IN("memobj", "the memory object being queried"),
		cl_mem_info.IN("param_name", "the information to query", MemInfo),
		PARAM_VALUE_SIZE,
		MultiType(
			PointerMapping.DATA_INT,
			PointerMapping.DATA_LONG,
			PointerMapping.DATA_POINTER
		) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_MEM_OBJECT if {@code memobj} is a not a valid memory object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_sampler(
		"CreateSampler",
		"""
		Creates a sampler object.

		A sampler object describes how to sample an image when the image is read in the kernel. The built-in functions to read from an image in a kernel take a
		sampler as an argument. The sampler arguments to the image read function can be sampler objects created using OpenCL functions and passed as argument
		values to the kernel or can be samplers declared inside a kernel.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		cl_bool.IN("normalized_coords", "determines if the image coordinates specified are normalized or not"),
		cl_addressing_mode.IN("addressing_mode", "specifies how out-of-range image coordinates are handled when reading from an image", AddressingModes),
		cl_filter_mode.IN("filter_mode", "the type of filter that must be applied when reading an image", FilterModes),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero sampler object and $errcode_ret is set to $SUCCESS if the sampler object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"""
			$INVALID_VALUE if {@code addressing_mode}, {@code filter_mode} or {@code normalized_coords} or combination of these argument values are
			not valid.
			""",
			"""
			$INVALID_OPERATION if images are not supported by any device associated with {@code context} (i.e. #DEVICE_IMAGE_SUPPORT is
			$FALSE).
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"RetainSampler",
		"Increments the sampler reference count. #CreateSampler() performs an implicit retain.",

		cl_sampler.IN("sampler", "the sample object to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_SAMPLER if sampler is not a valid sampler object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseSampler",
		"""
		Decrements the sampler reference count. The sampler object is deleted after the reference count becomes zero and commands queued for execution on a
		command-queue(s) that use sampler have finished.
		""",

		cl_sampler.IN("sampler", "the sample object to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_SAMPLER if {@code sampler} is not a valid sampler object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetSamplerInfo",
		"Returns information about a sampler object.",

		cl_sampler.IN("sampler", "the sampler being queried"),
		cl_sampler_info.IN("param_name", "the information to query", SamplerInfo),
		PARAM_VALUE_SIZE,
		MultiType(
			PointerMapping.DATA_INT,
			PointerMapping.DATA_POINTER
		) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_SAMPLER if {@code sampler} is a not a valid sampler object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_program(
		"CreateProgramWithSource",
		"""
		Creates a program object for a context, and loads the source code specified by the text strings in the strings array into the program object. The
		devices associated with the program object are the devices associated with {@code context}. The source code specified by strings is either an OpenCL C
		program source, header or implementation-defined source for custom devices that support an online compiler.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		AutoSize("strings", "lengths") _ cl_uint.IN("count", "the number of elements in the {@code strings} and {@code lengths} arrays"),
		const _ PointerArray(cl_charUTF8_p, "string", "lengths") _ cl_charUTF8_pp.IN(
			"strings",
			"an array of {@code count} pointers to optionally null-terminated character strings that make up the source code"
		),
		const _ nullable _ size_t_p.IN(
			"lengths",
			"""
			an array with the number of chars in each string (the string length). If an element in {@code lengths} is zero, its accompanying string is
			null-terminated. If {@code lengths} is $NULL, all strings in the {@code strings} argument are considered null-terminated. Any length value passed in
			that is greater than zero excludes the null terminator in its count.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero program object and $errcode_ret is set to $SUCCESS if the program object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_VALUE if {@code count} is zero or if {@code strings} or any entry in {@code strings} is $NULL.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_program(
		"CreateProgramWithBinary",
		"""
		Creates a program object for a context, and loads the binary bits specified by {@code binary} into the program object.

		The program binaries specified by {@code binaries} contain the bits that describe one of the following:
		${ul(
			"a program executable to be run on the device(s) associated with {@code context},",
			"a compiled program for device(s) associated with {@code context}, or",
			"a library of compiled programs for device(s) associated with {@code context}."
		)}
		The program binary can consist of either or both:
		${ul(
			"Device-specific code and/or,",
			"Implementation-specific intermediate representation (IR) which will be converted to the device-specific code."
		)}
		OpenCL allows applications to create a program object using the program source or binary and build appropriate program executables. This can be very
		useful as it allows applications to load program source and then compile and link to generate a program executable online on its first instance for
		appropriate OpenCL devices in the system. These executables can now be queried and cached by the application. Future instances of the application
		launching will no longer need to compile and link the program executables. The cached executables can be read and loaded by the application, which can
		help significantly reduce the application initialization time.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		AutoSize("binaries", "device_list", "lengths", "binary_status") _ cl_uint.IN("num_devices", "the number of devices listed in {@code device_list}"),
		const _ cl_device_id_p.IN(
			"device_list",
			"""
			a pointer to a list of devices that are in {@code context}. device_list must be a non-$NULL value. The binaries are loaded for devices specified in
			this list.
			"""
		),
		const _ size_t_p.IN(
			"lengths",
			"an array of the size in bytes of the program binaries to be loaded for devices specified by {@code device_list}."
		),
		const _ PointerArray(cl_uchar_p, "binary", "lengths") _ cl_uchar_pp.IN(
			"binaries",
			"""
			an array of pointers to program binaries to be loaded for devices specified by {@code device_list}. For each device given by {@code device_list[i]},
			the pointer to the program binary for that device is given by {@code binaries[i]} and the length of this corresponding binary is given by
			{@code lengths[i]}. {@code lengths[i]} cannot be zero and {@code binaries[i]} cannot be a $NULL pointer.
			"""
		),
		nullable _ cl_int_p.OUT(
			"binary_status",
			"""
			returns whether the program binary for each device specified in device_list was loaded successfully or not. It is an array of {@code num_devices}
			entries and returns $SUCCESS in {@code binary_status[i]} if binary was successfully loaded for device specified by {@code device_list[i]};
			otherwise returns $INVALID_VALUE if {@code lengths[i]} is zero or if {@code binaries[i]} is a $NULL value or $INVALID_BINARY in
			{@code binary_status[i]} if program binary is not a valid binary for the specified device. If {@code binary_status} is $NULL, it is ignored.
			"""
		),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero program object and $errcode_ret is set to $SUCCESS if the program object is created successfully. Otherwise, it returns a $NULL
		value with one of the following error values returned in $errcode_ret:
		${ul(
			ICE,
			"$INVALID_VALUE if {@code device_list} is $NULL or {@code num_devices} is zero.",
			"$INVALID_DEVICE if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.",
			"$INVALID_VALUE if {@code lengths} or {@code binaries} are NULL or if any entry in {@code lengths[i]} is zero or {@code binaries[i]} is $NULL.",
			"$INVALID_BINARY if an invalid program binary was encountered for any device. {@code binary_status} will return specific status for each device.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"RetainProgram",
		"Increments the {@code program} reference count. {@code clCreateProgram} does an implicit retain.",

		cl_program.IN("program", "the program object to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PROGRAM if {@code program} is not a valid program object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseProgram",
		"""
		Decrements the {@code program} reference count. The program object is deleted after all kernel objects associated with program have been deleted and the
		program reference count becomes zero.
		""",

		cl_program.IN("program", "the program object to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PROGRAM if {@code program} is not a valid program object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"BuildProgram",
		"""
		Builds (compiles & links) a program executable from the program source or binary for all the devices or a specific device(s) in the OpenCL context
		associated with {@code program}. OpenCL allows program executables to be built using the source or the binary. {@code clBuildProgram} must be called for
		{@code program} created using either #CreateProgramWithSource() or #CreateProgramWithBinary() to build the program executable for one or more devices
		associated with {@code program}. If {@code program} is created with #CreateProgramWithBinary(), then the program binary must be an executable binary (not
		a compiled binary or library).

		The executable binary can be queried using #GetProgramInfo() and can be specified to #CreateProgramWithBinary() to create a new program object.
		""",

		cl_program.IN("program", "the program object"),
		AutoSize("device_list") _ cl_uint.IN("num_devices", "the number of devices listed in {@code device_list}"),
		const _ nullable _ SingleValue("device") _ cl_device_id_p.IN(
		"device_list",
		"""
			a pointer to a list of devices associated with {@code program}. If {@code device_list} is a $NULL value, the program executable is built for all
			devices associated with {@code program} for which a source or binary has been loaded. If {@code device_list} is a non-$NULL value, the program
			executable is built for devices specified in this list for which a source or binary has been loaded.
			"""
	),
		const _ cl_charASCII_p.IN(
			"options",
			"a pointer to a null-terminated string of characters that describes the build options to be used for building the program executable"
		),
		nullable _ cl_program_callback.IN(
			"pfn_notify",
			"""
			a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
			called when the program executable has been built (successfully or unsuccessfully). If {@code pfn_notify} is not $NULL, {@code clBuildProgram} does
			not need to wait for the build to complete and can return immediately once the build operation can begin. The build operation can begin if the
			context, program whose sources are being compiled and linked, list of devices and build options specified are all valid and appropriate host and
			device resources needed to perform the build are available. If {@code pfn_notify} is $NULL, {@code clBuildProgram} does not return until the build
			has completed. This callback function may be called asynchronously by the OpenCL implementation. It is the application's responsibility to ensure
			that the callback function is thread-safe.
			"""
		),
		nullable _ voidptr.IN("user_data", "will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be NULL."),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PROGRAM if {@code program} is not a valid program object.",
			"$INVALID_VALUE if {@code device_list} is $NULL and {@code num_devices} is &gt; 0, or if {@code device_list} is not $NULL and {@code num_devices} is 0.",
			"$INVALID_VALUE if {@code pfn_notify} is $NULL but {@code user_data} is not $NULL.",
			"$INVALID_DEVICE if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.",
			"""
			$INVALID_BINARY if {@code program} is created with #CreateProgramWithBinary() and devices listed in {@code device_list} do not have a valid
			program binary loaded.
			""",
			"$INVALID_BUILD_OPTIONS if the build options specified by {@code options} are invalid.",
			"""
			$INVALID_OPERATION if the build of a program executable for any of the devices listed in {@code device_list} by a previous call to
			{@code clBuildProgram} for {@code program} has not completed.
			""",
			"""
			#COMPILER_NOT_AVAILABLE if {@code program} is created with #CreateProgramWithSource() and a compiler is not available i.e.
			#DEVICE_COMPILER_AVAILABLE is set to $FALSE.
			""",
			"""
			#BUILD_PROGRAM_FAILURE if there is a failure to build the program executable. This error will be returned if {@code clBuildProgram} does
			not return until the build has completed.
			""",
			"$INVALID_OPERATION if there are kernel objects attached to {@code program}.",
			"$INVALID_OPERATION if program was not created with #CreateProgramWithSource() or #CreateProgramWithBinary().",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"UnloadCompiler",
		"""
		Allows the implementation to release the resources allocated by the OpenCL compiler. This is a hint from the application and does not guarantee that the
		compiler will not be used in the future or that the compiler will actually be unloaded by the implementation.

		Calls to #BuildProgram() after #UnloadCompiler() will reload the compiler, if necessary, to build the appropriate program executable.
		""",

		returnDoc = "always $SUCCESS"
	)

	cl_int(
		"GetProgramInfo",
		"Returns information about a program object.",

		cl_program.IN("program", "the program object being queried"),
		cl_program_info.IN("param_name", "the information to query", ProgramInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_PROGRAM if {@code program} is a not a valid program object.",
			"""
			$INVALID_PROGRAM_EXECUTABLE if {@code param_name} is CL12#PROGRAM_NUM_KERNELS or CL12#PROGRAM_KERNEL_NAMES and a
			successful program executable has not been built for at least one device in the list of devices associated with {@code program}.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetProgramBuildInfo",
		"Returns build information for each device in the program object.",

		cl_program.IN("program", "the program object being queried"),
		cl_device_id.IN("device", "the device for which build information is being queried. {@code device} must be a valid device associated with {@code program}."),
		cl_program_info.IN("param_name", "the information to query", ProgramBuildInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_DEVICE if {@code device} is not in the list of devices associated with program.",
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_PROGRAM if {@code program} is a not a valid program object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_kernel(
		"CreateKernel",
		"""
		Creates a kernel object.

		A kernel is a function declared in a program. A kernel is identified by the {@code __kernel} qualifier applied to any function in a program. A kernel
		object encapsulates the specific {@code __kernel} function declared in a program and the argument values to be used when executing this {@code __kernel}
		function.

		Kernel objects can only be created once you have a program object with a valid program source or binary loaded into the program object and the program
		executable has been successfully built for one or more devices associated with program. No changes to the program executable are allowed while there are
		kernel objects associated with a program object. This means that calls to #BuildProgram() and CL12#CompileProgram() return
		$INVALID_OPERATION if there are kernel objects attached to a program object. The OpenCL context associated with program will be the context
		associated with kernel. The list of devices associated with program are the devices associated with kernel. Devices associated with a program object for
		which a valid program executable has been built can be used to execute kernels declared in the program object.
		""",

		cl_program.IN("program", "a program object with a successfully built executable"),
		const _ cl_charASCII_p.IN("kernel_name", "a function name in the program declared with the {@code __kernel} qualifier"),
		ERROR_RET,

		returnDoc =
		"""
		a valid non-zero kernel object and $errcode_ret is set to $SUCCESS if the kernel object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		${ul(
			"$INVALID_PROGRAM if {@code program} is not a valid program object.",
			"$INVALID_PROGRAM_EXECUTABLE if there is no successfully built executable for {@code program}.",
			"$INVALID_KERNEL_NAME if {@code kernel_name} is not found in {@code program}.",
			"""
			$INVALID_KERNEL_DEFINITION if the function definition for {@code __kernel} function given by {@code kernel_name} such as the number of
			arguments, the argument types are not the same for all devices for which the program executable has been built.
			""",
			"$INVALID_VALUE if {@code kernel_name} is $NULL.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"CreateKernelsInProgram",
		"""
		Creates kernel objects for all kernel functions in {@code program}. Kernel objects are not created for any {@code __kernel} functions in {@code program}
		that do not have the same function definition across all devices for which a program executable has been successfully built.

		See #CreateKernel() for more details.
		""",

		cl_program.IN("program", "a program object with a successfully built executable"),
		AutoSize("kernels") _ cl_uint.IN("num_kernels", "the size of memory pointed to by kernels specified as the number of cl_kernel entries"),
		nullable _ cl_kernel_p.OUT(
			"kernels",
			"""
			the buffer where the kernel objects for kernels in {@code program} will be returned. If {@code kernels} is $NULL, it is ignored. If {@code kernels}
			is not $NULL, {@code num_kernels} must be greater than or equal to the number of kernels in {@code program}.
			"""
		),
		Check(1) _ nullable _ cl_uint_p.OUT(
			"num_kernels_ret",
			"the number of kernels in {@code program}. If {@code num_kernels_ret} is $NULL, it is ignored."
		),

		returnDoc =
		"""
		$SUCCESS if the kernel objects were successfully allocated. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PROGRAM if {@code program} is not a valid program object.",
			"$INVALID_PROGRAM_EXECUTABLE if there is no successfully built executable for any device in {@code program}.",
			"$INVALID_VALUE if {@code kernels} is not $NULL and {@code num_kernels} is less than the number of kernels in {@code program}.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"RetainKernel",
		"Increments the {@code kernel} reference count. #CreateKernel() or #CreateKernelsInProgram() do an implicit retain.",

		cl_kernel.IN("kernel", "the kernel to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_KERNEL if kernel is not a valid kernel object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseKernel",
		"""
		Decrements the {@code kernel} reference count.

		The kernel object is deleted once the number of instances that are retained to {@code kernel} become zero and the kernel object is no longer needed by
		any enqueued commands that use {@code kernel}.
		""",

		cl_kernel.IN("kernel", "the kernel to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_KERNEL if kernel is not a valid kernel object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"SetKernelArg",
		"Set the argument value for a specific argument of a kernel.",

		cl_kernel.IN("kernel", "a valid kernel object"),
		cl_uint.IN(
			"arg_index",
			"""
			the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
			the total number of arguments declared by a kernel.

			For example, consider the following kernel:
			${codeBlock("""
kernel void image_filter (
	int n, int m,
	__constant float *filter_weights,
	__read_only image2d_t src_image,
	__write_only image2d_t dst_image
) {
	&hellip;
}
			""")}
			Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
			{@code dst_image}.

			<strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
			by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.
			"""
		),
		AutoSize("arg_value") _ size_t.IN(
			"arg_size",
			"""
			the size of the argument value. If the argument is a memory object, the size is the size of the buffer or image object type. For arguments declared
			with the {@code __local} qualifier, the size specified will be the size in bytes of the buffer that must be allocated for the {@code __local}
			argument. If the argument is of type {@code sampler_t}, the {@code arg_size} value must be equal to {@code sizeof(cl_sampler)}. For all other
			arguments, the size will be the size of argument type.
			"""
		),
		// optional generates clSetKernelArg(long kernel, int arg_index, long arg_size)
		// MultiType generates clSetKernalArg(long kernel, int arg_index, <type>Buffer arg_value)
		// SingleValue generates clSetKernelArg<xp>(long kernel, int arg_index, <p> arg<x-1>, ...), where x = 1..4
		optional _ MultiType(
			PointerMapping.DATA_BYTE,
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_LONG,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE,
			PointerMapping.DATA_POINTER
		) _ SingleValue("arg") _ const _ void_p.IN(
			"arg_value",
			"""
			a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
			{@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
			argument value specified is the value used by all API calls that enqueue kernel (#EnqueueNDRangeKernel() and #EnqueueTask()) until
			the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.

			If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
			image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
			{@code arg_value} pointer can be $NULL or point to a $NULL value in which case a $NULL value will be used as the value for the argument declared as
			a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
			{@code arg_value} entry must be $NULL. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
			object.

			If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
			space, the memory object specified as argument value must be a buffer object (or $NULL). If the argument is declared with the {@code __constant}
			qualifier, the size in bytes of the memory object cannot exceed #DEVICE_MAX_CONSTANT_BUFFER_SIZE and the number of arguments declared as
			pointers to {@code __constant} memory cannot exceed #DEVICE_MAX_CONSTANT_ARGS.

			The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
			object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
			argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
			must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
			must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
			a 2D image array object if argument is declared to be of type {@code image2d_array_t}.

			For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.
			"""
		),

		returnDoc =
		"""
		$SUCCESS if the function was executed successfully. Otherwise, it returns one of the following errors:
			${ul(
			"$INVALID_KERNEL if {@code kernel} is not a valid kernel object.",
			"$INVALID_ARG_INDEX if {@code arg_index} is not a valid argument index.",
			"$INVALID_ARG_VALUE if {@code arg_value} specified is not a valid value.",
			"$INVALID_MEM_OBJECT for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.",
			"$INVALID_SAMPLER for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.",
			"""
			$INVALID_ARG_SIZE if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
			argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
			{@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.
			""",
			"""
			$INVALID_ARG_VALUE if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
			object created with {@code cl_mem_flags} of #MEM_WRITE_ONLY or if the image argument is declared with the {@code write_only} qualifier
			and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of #MEM_READ_ONLY.
			""",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetKernelInfo",
		"Returns information about a kernel object.",

		cl_kernel.IN("kernel", "the kernel object being queried"),
		cl_kernel_info.IN("param_name", "the information to query", KernelInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_KERNEL if {@code kernel} is a not a valid kernel object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetKernelWorkGroupInfo",
		"Returns information about the kernel object that may be specific to a device.",

		cl_kernel.IN("kernel", "the kernel object being queried"),
		cl_device_id.IN(
			"device",
			"""
			identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context
			that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a $NULL value.
			"""
		),
		cl_kernel_work_group_info.IN("param_name", "the information to query", KernelWorkGroupInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_DEVICE if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is $NULL but there is
			more than one device associated with {@code kernel}.
			""",
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"""
			$INVALID_VALUE if {@code param_name} is CL12#KERNEL_GLOBAL_WORK_SIZE and {@code device} is not a custom device or kernel is
			not a built-in kernel.
			""",
			"$INVALID_KERNEL if {@code kernel} is a not a valid kernel object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueNDRangeKernel",
		"Enqueues a command to execute a kernel on a device.",

		cl_command_queue.IN("command_queue", "a valid command-queue. The kernel will be queued for execution on the device associated with {@code command_queue}."),
		cl_kernel.IN("kernel", "a valid kernel object. The OpenCL context associated with {@code kernel} and {@code command_queue} must be the same."),
		cl_uint.IN(
			"work_dim",
			"""
			the number of dimensions used to specify the global work-items and work-items in the work-group. {@code work_dim} must be greater than zero and less
			than or equal to #DEVICE_MAX_WORK_ITEM_DIMENSIONS.
			"""
		),
		const _ Check("work_dim") _ nullable _ size_t_p.IN(
		"global_work_offset",
		"""
			can be used to specify an array of {@code work_dim} unsigned values that describe the offset used to calculate the global ID of a work-item. If
			{@code global_work_offset} is $NULL, the global IDs start at offset ${code("(0, 0, &hellip; 0)")}.
			"""
	),
		const _ Check("work_dim") _ nullable _ size_t_p.IN(
		"global_work_size",
		"""
			points to an array of {@code work_dim} unsigned values that describe the number of global work-items in {@code work_dim} dimensions that will
			execute the kernel function. The total number of global work-items is computed as ${code("global_work_size[0] * &hellip; * global_work_size[work_dim – 1]")}.
			"""
	),
		const _ Check("work_dim") _ nullable _ size_t_p.IN(
		"local_work_size",
		"""
			points to an array of {@code work_dim} unsigned values that describe the number of work-items that make up a work-group (also referred to as the
			size of the work-group) that will execute the kernel specified by {@code kernel}. The total number of work-items in a work-group is computed as
			${code("local_work_size[0] * &hellip; * local_work_size[work_dim – 1]")}. The total number of work-items in the work-group must be less than or equal to
			the #DEVICE_MAX_WORK_GROUP_SIZE value and the number of work-items specified in ${code("local_work_size[0], &hellip; local_work_size[work_dim – 1]")}
			must be less than or equal to the corresponding values specified by #DEVICE_MAX_WORK_ITEM_SIZES${code("[0]")}, &hellip;
			#DEVICE_MAX_WORK_ITEM_SIZES${code("[work_dim – 1]")}. The explicitly specified {@code local_work_size} will be used to determine how to
			break the global work-items specified by {@code global_work_size} into appropriate work-group instances. If {@code local_work_size} is specified, the
			values specified in ${code("global_work_size[0], &hellip; global_work_size[work_dim - 1]")} must be evenly divisible by the corresponding values
			specified in ${code("local_work_size[0], &hellip; local_work_size[work_dim – 1]")}.

			The work-group size to be used for kernel can also be specified in the program source using the
			${code("__attribute__((reqd_work_group_size(X, Y, Z)))")} qualifier. In this case the size of work group specified by {@code local_work_size} must
			match the value specified by the {@code reqd_work_group_size} attribute qualifier.

			{@code local_work_size} can also be a $NULL value in which case the OpenCL implementation will determine how to be break the global work-items into
			appropriate work-group instances.
			"""
	),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the kernel execution was successfully queued. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_PROGRAM_EXECUTABLE if there is no successfully built program executable available for device associated with {@code command_queue}.",
			ICQE,
			"$INVALID_KERNEL if {@code kernel} is not a valid kernel object.",
			"""
			$INVALID_CONTEXT if context associated with {@code command_queue} and {@code kernel} are not the same or if the context associated with
			{@code command_queue} and events in {@code event_wait_list} are not the same.
			""",
			"$INVALID_KERNEL_ARGS if the kernel argument values have not been specified.",
			"$INVALID_WORK_DIMENSION if {@code work_dim} is not a valid value (i.e. a value between 1 and 3).",
			"""
			$INVALID_GLOBAL_WORK_SIZE if {@code global_work_size} is $NULL, or if any of the values specified in
			${code("global_work_size[0], &hellip; global_work_size[work_dim – 1]")} are 0 or exceed the range given by the {@code sizeof(size_t)} for the device
			on which the kernel execution will be enqueued.
			""",
			"""
			$INVALID_GLOBAL_OFFSET if the value specified in {@code global_work_size} + the corresponding values in {@code global_work_offset} for
			any dimensions is greater than the {@code sizeof(size_t)} for the device on which the kernel execution will be enqueued.
			""",
			"""
			$INVALID_WORK_GROUP_SIZE if {@code local_work_size} is specified and number of work-items specified by {@code global_work_size} is not
			evenly divisible by size of work-group given by {@code local_work_size} or does not match the work-group size specified for kernel using the
			${code("__attribute__((reqd_work_group_size(X, Y, Z)))")} qualifier in program source.
			""",
			"""
			$INVALID_WORK_GROUP_SIZE if {@code local_work_size} is specified and the total number of work-items in the work-group computed as
			${code("local_work_size[0] * &hellip; * local_work_size[work_dim – 1]")} is greater than the value specified by #DEVICE_MAX_WORK_GROUP_SIZE
			""",
			"""
			$INVALID_WORK_GROUP_SIZE if {@code local_work_size} is $NULL and the ${code("__attribute__((reqd_work_group_size(X, Y, Z)))")} qualifier
			is used to declare the work-group size for kernel in the program source.
			""",
			"""
			$INVALID_WORK_ITEM_SIZE if the number of work-items specified in any of ${code("local_work_size[0], &hellip; local_work_size[work_dim – 1]")}
			is greater than the corresponding values specified by #DEVICE_MAX_WORK_ITEM_SIZES{@code [0]}, &hellip; #DEVICE_MAX_WORK_ITEM_SIZES{@code [work_dim – 1]}.
			""",
			"""
			CL11#MISALIGNED_SUB_BUFFER_OFFSET if a sub-buffer object is specified as the value for an argument that is a buffer object and the offset
			specified when the sub-buffer object is created is not aligned to #DEVICE_MEM_BASE_ADDR_ALIGN value for device associated with queue.
			""",
			"""
			$INVALID_IMAGE_SIZE if an image object is specified as an argument value and the image dimensions (image width, height, specified or
			compute row and/or slice pitch) are not supported by device associated with queue.
			""",
			"""
			#IMAGE_FORMAT_NOT_SUPPORTED if an image object is specified as an argument value and the image format (image channel order and data type)
			is not supported by device associated with queue.
			""",
			"""
			#OUT_OF_RESOURCES if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
			needed to execute the kernel. For example, the explicitly specified {@code local_work_size} causes a failure to execute the kernel because of
			insufficient resources such as registers or local memory. Another example would be the number of read-only image args used in kernel exceed the
			#DEVICE_MAX_READ_IMAGE_ARGS value for device or the number of write-only image args used in kernel exceed the
			#DEVICE_MAX_WRITE_IMAGE_ARGS value for device or the number of samplers used in kernel exceed #DEVICE_MAX_SAMPLERS for device.
			""",
			"""
			#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with image or buffer objects specified
			as arguments to kernel.
			""",
			IEWLE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueTask",
		"""
		Enqueues a command to execute a kernel on a device. The kernel is executed using a single work-item.

		{@code clEnqueueTask} is equivalent to calling #EnqueueNDRangeKernel() with {@code work_dim = 1}, {@code global_work_offset = NULL},
		{@code global_work_size[0]} set to 1 and {@code local_work_size[0]} set to 1.
		""",

		cl_command_queue.IN("command_queue", "a valid command-queue. The kernel will be queued for execution on the device associated with {@code command_queue}."),
		cl_kernel.IN("kernel", "a valid kernel object. The OpenCL context associated with {@code kernel} and {@code command_queue} must be the same."),
		NEWL,
		EWL,
		EVENT,

		returnDoc = "$SUCCESS if the kernel execution was successfully queued. Otherwise, see #EnqueueNDRangeKernel()."
	)

	cl_int(
		"EnqueueNativeKernel",
		"Enqueues a command to execute a native C/C++ function not compiled using the OpenCL compiler.",

		cl_command_queue.IN(
			"command_queue",
			"""
			a valid command-queue. A native user function can only be executed on a command-queue created on a device that has #EXEC_NATIVE_KERNEL
			capability set in #DEVICE_EXECUTION_CAPABILITIES.
			"""
		),
		cl_native_kernel.IN("user_func", "a pointer to a host-callable user function"),
		nullable _ void_p.IN("args", "a pointer to the args list that {@code user_func} should be called with"),
		AutoSize("args") _ size_t.IN(
			"cb_args",
			"""
			the size in bytes of the args list that {@code args} points to.

			The data pointed to by {@code args} and {@code cb_args} bytes in size will be copied and a pointer to this copied region will be passed to
			{@code user_func}. The copy needs to be done because the memory objects (cl_mem values) that args may contain need to be modified and replaced by
			appropriate pointers to global memory. When {@code clEnqueueNativeKernel} returns, the memory region pointed to by args can be reused by the
			application.
			"""
		),
		AutoSize("mem_list", "args_mem_loc") _ cl_uint.IN("num_mem_objects", "the number of buffer objects that are passed in {@code args}"),
		const _ nullable _ SingleValue("memobj") _ cl_mem_p.IN(
		"mem_list",
		"""
			a list of valid buffer objects, if {@code num_mem_objects} &gt; 0. The buffer object values specified in {@code mem_list} are memory object handles
			(cl_mem values) returned by #CreateBuffer() or $NULL.
			"""
	),
		const _ nullable _ SingleValue("memobj_loc") _ void_pp.IN(
		"args_mem_loc",
		"""
			a pointer to appropriate locations that {@code args} points to where memory object handles (cl_mem values) are stored. Before the user function is
			executed, the memory object handles are replaced by pointers to global memory.
			"""
	),
		NEWL,
		EWL,
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the user function execution instance was successfully queued. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_CONTEXT if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.",
			"$INVALID_VALUE if {@code user_func} is $NULL.",
			"""
			$INVALID_VALUE if {@code args} is a $NULL value and {@code cb_args} &gt; 0, or if {@code args} is a $NULL value and
			{@code num_mem_objects} &gt; 0.
			""",
			"$INVALID_VALUE if {@code args} is not $NULL and {@code cb_args} is 0.",
			"$INVALID_VALUE if {@code num_mem_objects} &gt; 0 and {@code mem_list} or {@code args_mem_loc} are $NULL.",
			"$INVALID_VALUE if {@code num_mem_objects} = 0 and {@code mem_list} or {@code args_mem_loc} are not $NULL.",
			"$INVALID_OPERATION if the device associated with {@code command_queue} cannot execute the native kernel.",
			"$INVALID_MEM_OBJECT if one or more memory objects specified in {@code mem_list} are not valid or are not buffer objects.",
			"""
			#OUT_OF_RESOURCES if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
			needed to execute the kernel.
			""",
			"""
			#MEM_OBJECT_ALLOCATION_FAILURE if there is a failure to allocate memory for data store associated with buffer objects specified as
			arguments to kernel.
			""",
			IEWLE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"WaitForEvents",
		"""
		Waits on the host thread for commands identified by event objects in {@code event_list} to complete. A command is considered complete if its execution
		status is #COMPLETE or a negative value. The events specified in {@code event_list} act as synchronization points.
		""",

		AutoSize("event_list") _ cl_uint.IN("num_events", "the number of events in {@code event_list}"),
		const _ SingleValue("event") _ cl_event_p.IN("event_list", "the list of events"),

		returnDoc =
		"""
		$SUCCESS if the execution status of all events in event_list is #COMPLETE. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_VALUE if {@code num_events} is zero or {@code event_list} is $NULL.",
			"$INVALID_CONTEXT if events specified in {@code event_list} do not belong to the same context.",
			"$INVALID_EVENT if event objects specified in {@code event_list} are not valid event objects.",
			"CL11#EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST if the execution status of any of the events in {@code event_list} is a negative integer value.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetEventInfo",
		"""
		Returns information about an event object.

		Using {@code clGetEventInfo} to determine if a command identified by event has finished execution (i.e. #EVENT_COMMAND_EXECUTION_STATUS
		returns #COMPLETE) is not a synchronization point. There are no guarantees that the memory objects being modified by command associated with
		event will be visible to other enqueued commands.
		""",

		cl_event.IN("event", "the event object being queried"),
		cl_event_info.IN("param_name", "the information to query", EventInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_VALUE if information to query given in {@code param_name} cannot be queried for event.",
			"$INVALID_EVENT if {@code event} is a not a valid event object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"RetainEvent",
		"Increments the event reference count. The OpenCL commands that return an event perform an implicit retain.",

		cl_event.IN("event", "the event to retain"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_EVENT if {@code event} is not a valid event object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"ReleaseEvent",
		"""
		Decrements the event reference count.

		The event object is deleted once the reference count becomes zero, the specific command identified by this event has completed (or terminated) and there
		are no commands in the command-queues of a context that require a wait for this event to complete.

		<strong>NOTE</strong>: Developers should be careful when releasing their last reference count on events created by CL11#CreateUserEvent() that
		have not yet been set to status of #COMPLETE or an error. If the user event was used in the {@code event_wait_list} argument passed to a
		clEnqueue*** API or another application host thread is waiting for it in #WaitForEvents(), those commands and host threads will continue to wait for the
		event status to reach #COMPLETE or error, even after the user has released the object. Since in this scenario the developer has released his
		last reference count to the user event, it would be in principle no longer valid for him to change the status of the event to unblock all the other
		machinery. As a result the waiting tasks will wait forever, and associated events, cl_mem objects, command queues and contexts are likely to leak.
		In-order command-queues caught up in this deadlock may cease to do any work.
		""",

		cl_event.IN("event", "the event to release"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			"$INVALID_EVENT if {@code event} is not a valid event object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueMarker",
		"""
		Enqueues a marker command to {@code command_queue}. The marker command is not completed until all commands enqueued before it have completed. The marker
		command returns an event which can be waited on, i.e. this event can be waited on to insure that all commands, which have been queued before the marker
		command, have been completed.
		""",

		cl_command_queue.IN("command_queue", "the command-queue to insert the marker to"),
		EVENT,

		returnDoc =
		"""
		$SUCCESS if the function is successfully executed. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_VALUE if {@code event} is a $NULL value.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueBarrier",
		"""
		Enqueues a barrier operation. The {@code clEnqueueBarrier} command ensures that all queued commands in {@code command_queue} have finished execution
		before the next batch of commands can begin execution. The {@code clEnqueueBarrier} command is a synchronization point.
		""",

		cl_command_queue.IN("command_queue", "the command-queue to insert the barrier to"),

		returnDoc =
		"""
		$SUCCESS if the function is successfully executed. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"EnqueueWaitForEvents",
		"Enqueues a wait for a specific event or a list of events to complete before any future commands queued in the command-queue are executed.",

		cl_command_queue.IN("command_queue", "the command-queue"),
		AutoSize("event_list") _ cl_uint.IN("num_events", "the number of events in {@code event_list}"),
		const _ SingleValue("event") _ cl_event_p.IN("event_list", "the list of events"),

		returnDoc =
		"""
		$SUCCESS if the function was successfully executed. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			"$INVALID_CONTEXT if the context associated with {@code command_queue} and events in {@code event_list} are not the same.",
			"$INVALID_VALUE if {@code num_events} is zero or {@code event_list} is $NULL.",
			"$INVALID_EVENT if event objects specified in {@code event_list} are not valid events.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"GetEventProfilingInfo",
		"Returns profiling information for the command associated with {@code event}.",

		cl_event.IN("event", "the event object"),
		cl_profiling_info.IN("param_name", "the profiling data to query", ProfilingInfo),
		PARAM_VALUE_SIZE,
		MultiType(PointerMapping.DATA_LONG) _ nullable _ void_p.OUT("param_value", param_value),
		PARAM_VALUE_SIZE_RET,

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully and the profiling information has been recorded. Otherwise, it returns one of the following errors:
		${ul(
			"""
			#PROFILING_INFO_NOT_AVAILABLE if the #QUEUE_PROFILING_ENABLE flag is not set for the command-queue, if the execution status of
			the command identified by {@code event} is not #COMPLETE or if {@code event} is a user event object.
			""",
			"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
			and {@code param_value} is not $NULL.
			""",
			"$INVALID_EVENT if {@code event} is a not a valid event object.",
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"Flush",
		"""
		Issues all previously queued OpenCL commands in {@code command_queue} to the device associated with {@code command_queue}. {@code clFlush} only
		guarantees that all queued commands to {@code command_queue} will eventually be submitted to the appropriate device. There is no guarantee that they
		will be complete after {@code clFlush} returns.

		Any blocking commands queued in a command-queue and #ReleaseCommandQueue() perform an implicit flush of the command-queue. These blocking commands are
		#EnqueueReadBuffer(), CL11#EnqueueReadBufferRect(), #EnqueueReadImage(), with {@code blocking_read} set to $TRUE; #EnqueueWriteBuffer(),
		CL11#EnqueueWriteBufferRect(), #EnqueueWriteImage() with {@code blocking_write} set to $TRUE; #EnqueueMapBuffer(), #EnqueueMapImage() with
		{@code blocking_map} set to $TRUE; or #WaitForEvents().

		To use event objects that refer to commands enqueued in a command-queue as event objects to wait on by commands enqueued in a different command-queue,
		the application must call a {@code clFlush} or any blocking commands that perform an implicit flush of the command-queue where the commands that refer
		to these event objects are enqueued.
		""",

		cl_command_queue.IN("command_queue", "the command-queue"),

		returnDoc =
		"""
		$SUCCESS if the function call was executed successfully. Otherwise, it returns one of the following errors:
		${ul(
			ICQE,
			OORE,
			OOHME
		)}
		"""
	)

	cl_int(
		"Finish",
		"""
		Blocks until all previously queued OpenCL commands in {@code command_queue} are issued to the associated device and have completed. {@code clFinish}
		does not return until all previously queued commands in {@code command_queue} have been processed and completed. {@code clFinish} is also a
		synchronization point.
		""",

		cl_command_queue.IN("command_queue", "the command-queue")
	)

	voidptr(
		"GetExtensionFunctionAddress",
		"""
		Returns the address of the extension function named by {@code funcname}. The pointer returned should be cast to a function pointer type matching the
		extension function's definition defined in the appropriate extension specification and header file. A return value of $NULL indicates that the specified
		function does not exist for the implementation. A non-$NULL return value for {@code clGetExtensionFunctionAddress} does not guarantee that an extension
		function is actually supported. The application must also make a corresponding query using ${code("clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )")}
		or ${code("clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )")} to determine if an extension is supported by the OpenCL implementation.

		{@code clGetExtensionFunctionAddress} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
		{@code clGetExtensionFunctionAddress}, implementations may choose to also export those functions statically from the object libraries implementing those
		functions. However, portable applications cannot rely on this behavior.
		""",

		const _ cl_charASCII_p.IN("funcname", "the extension function name"),

		returnDoc = "the extension function address"
	)

}