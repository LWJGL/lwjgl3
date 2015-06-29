/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_terminate_context = "KHRTerminateContext".nativeClassCL("khr_terminate_context", KHR) {
	nativeImport(
		"OpenCL.h"
	)

	documentation =
		"""
		Native bindings to the $extensionName extension.

		OpenCL provides an API to release a context. This operation is done only after all queues, memory object, programs and kernels are released, which in
		turn might wait for all ongoing operations to complete. However, there are cases in which a fast release is required, or release operation cannot be
		done, as commands are stuck in mid execution. An example of the first case can be program termination due to exception, or quick shutdown due to low
		power. Examples of the second case are when a kernel is running too long, or gets stuck, or it may result from user action which makes the results of
		the computation unnecessary.

		In many cases, the driver or the device is capable of speeding up the closure of ongoing operations when the results are no longer required in a much
		more expedient manner than waiting for all previously enqueued operations to finish.

		This extension implements a new query to check whether a device can terminate an OpenCL context and adds an API to terminate a context.
		"""

	IntConstant(
		"""
		Describes the termination capability of the OpenCL device. This is a bitfield where a value of {@code CL_DEVICE_TERMINATE_CAPABILITY_CONTEXT_KHR}
		indicates that context termination is supported.
		""",

		"DEVICE_TERMINATE_CAPABILITY_KHR" _ 0x200F
	)

	IntConstant(
		"Specifies whether the context can be terminated. The default value is $FALSE.",

		"CONTEXT_TERMINATE_KHR" _ 0x2010
	)

	// TODO: Find CL_TERMINATED_KHR & CL_CONTEXT_TERMINATED_KHR values.

	cl_int(
		"TerminateContextKHR",
		"""
		Terminates all pending work associated with the context and renders all data owned by the context invalid. It is the responsibility of the application
		to release all objects associated with the context being terminated.

		When a context is terminated:
		${ul(
			"""
			The execution status of enqueued commands will be #TERMINATED_KHR. Event objects can be queried using CL10#GetEventInfo(). Event
			callbacks can be registered and registered event callbacks will be called with {@code event_command_exec_status} set to #TERMINATED_KHR.
			CL10#WaitForEvents() will return immediately for commands associated with event objects specified in {@code event_list}. The status of user
			events can be set. Event objects can be retained and released. CL10#GetEventProfilingInfo() returns CL10#PROFILING_INFO_NOT_AVAILABLE.
			""",
			"""
			The context is considered to be terminated. A callback function registered when the context was created will be called. Only queries, retain and
			release operations can be performed on the context. All other APIs that use a context as an argument will return #CONTEXT_TERMINATED_KHR.
			""",
			"""
			The contents of the memory regions of the memory objects is undefined. Queries, registering a destructor callback, retain and release operations can
			be performed on the memory objects.
			""",
			"""
			Once a context has been terminated, all OpenCL API calls that create objects or enqueue commands will return #CONTEXT_TERMINATED_KHR. APIs
			that release OpenCL objects will continue to operate as though {@code clTerminateContextKHR} was not called.
			""",
			"""
			The behavior of callbacks will remain unchanged, and will report appropriate error, if executing after termination of context. This behavior is
			similar to enqueued commands, after the command queue has become invalid.
			"""
		)}
		""",

		cl_context.IN("context", "the context to terminate"),

		returnDoc =
		"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
			"$INVALID_CONTEXT if {@code context} is not a valid OpenCL context.",
			"#CONTEXT_TERMINATED_KHR if {@code context} has already been terminated.",
			"$INVALID_OPERATION if {@code context} was not created with #CONTEXT_TERMINATE_KHR set to $TRUE.",
			OORE,
			OOHME
		"""
	)

}