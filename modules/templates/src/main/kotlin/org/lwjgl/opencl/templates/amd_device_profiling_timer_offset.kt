/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val amd_device_profiling_timer_offset = "AMDDeviceProfilingTimerOffset".nativeClassCL("amd_device_profiling_timer_offset", AMD) {
	documentation = "Native bindings to the $extensionName extension."

	IntConstant(
		"Accepted as the {@code param_name} parameter of CL10#GetDeviceInfo(). Returns the offset in nanoseconds between event timestamps.",

		"DEVICE_PROFILING_TIMER_OFFSET_AMD" _ 0x4036
	)
}