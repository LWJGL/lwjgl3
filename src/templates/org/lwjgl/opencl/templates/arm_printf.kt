/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val arm_printf = "ARMPrintf".nativeClassCL("arm_printf", ARM) {
	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension enables the device side printf built in function for OpenCL C versions prior to 1.2. It also extends the cl_context_properties
		enumeration to allow a user defined printf callback and/or printf buffer size.

		The printf built in function should be used for debugging purposes only and may have a significant negative impact on the performance of an OpenCL
		application.
		"""

	IntConstant(
		"""
		Accepted by the {@code properties} argument to CL10#CreateContext().

		Property value: ${code("void printf_callback(const char *buffer, size_t len, size_t complete, void *user_data)")}

		Specifies a pointer to function to be invoked when printf data is available. Upon invocation the arguments are set to the following values.
		${ul(
			"{@code buffer} is a pointer to a character array of size {@code len} created by printf.",
		    "{@code len} is the number of new characters in {@code buffer}.",
		    "{@code complete} is set to a non zero value if there is no more data in the device's printf buffer.",
			"{@code user_data} is the {@code user_data} parameter specified to CL10#CreateContext()."
		)}
		If this property is not specified, no callback will be registered and any printf output from a kernel will be discarded.
		""",

		"PRINTF_CALLBACK_ARM" _ 0x40B0
	)

	IntConstant(
		"""
		Accepted by the {@code properties} argument to CL10#CreateContext().

		Property value: {@code size_t}

		Specifies the size of printf buffer allocations to use within the driver. A printf buffer is allocated per device per context, within a context the
		buffer will be shared between kernels executing on a device. The implementation is free to round up or ignore this value.

		If this property is not specified an implementation defined default size will be chosen. For OpenCL driver versions prior to OpenCL 1.2 this value will
		be 1 MiB. For driver versions of OpenCL 1.2 or greater this value is defined by the CL12#DEVICE_PRINTF_BUFFER_SIZE parameter name for
		CL10#GetDeviceInfo().
		""",

		"PRINTF_BUFFERSIZE_ARM" _ 0x40B1
	)
}