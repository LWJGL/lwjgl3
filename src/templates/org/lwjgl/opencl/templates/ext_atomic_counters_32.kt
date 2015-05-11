/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val ext_atomic_counters_32 = "EXTAtomicCounters32".nativeClassCL("ext_atomic_counters_32", EXT) {
	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This extension adds support in the OpenCL C language for 32-bit atomic counters. Atomic counter is a device-level counter that can be added /
		decremented by work-items in a work-group or across work-groups executing a kernel, where the atomicity of the operation is guaranteed. The access to
		the counter is done only via add/dec built-in functions, and as such no two workitems will see the same value returned in the case that a given kernel
		only increments or decrements the counter.

		This feature is highly useful for produce/consume to unordered queues.
		"""

	IntConstant(
		"""
		Accepted as the {@code param_name} parameter of CL10#GetDeviceInfo().

		Max number of atomic counters that can be used by a kernel. The minimum value is 8.
		""",

		"DEVICE_MAX_ATOMIC_COUNTERS_EXT" _ 0x4032
	)
}