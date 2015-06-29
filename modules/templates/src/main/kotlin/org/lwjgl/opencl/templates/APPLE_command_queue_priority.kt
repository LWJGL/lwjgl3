/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val APPLE_command_queue_priority = "APPLECommandQueuePriority".nativeClassCL("APPLE_command_queue_priority", APPLE) {
	nativeImport(
		"OpenCL.h"
	)

	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"",

		"QUEUE_PRIORITY_APPLE" _ 0x10000013,
		"QUEUE_PRIORITY_BACKGROUND_APPLE" _ 0x10000015,
		"QUEUE_PRIORITY_DEFAULT_APPLE" _ 0x10000017
	)

	cl_command_queue(
		"CreateCommandQueueWithPropertiesAPPLE",
		"",

		cl_context.IN("context", ""),
		cl_device_id.IN("device", ""),
		const _ cl_queue_properties_APPLE_p.IN("properties", ""),
		ERROR_RET
	)
}