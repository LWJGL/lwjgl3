/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

fun intel_device_partition_by_names() = "INTELDevicePartitionByNames".nativeClassCL("intel_device_partition_by_names", INTEL) {

	javaDoc(
		"""
		Native bindings to the $extensionLink extension.

		This extension allows the user to create sub-devices containing specific compute units. {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL} is a
		{@code cl_device_partition_property} that is followed by a list of compute unit names, teminated by {@link #CL_PARTITION_BY_NAMES_LIST_END_INTEL}.
		Compute unit names are integers that count up from zero to the number of compute units minus one. Only one sub-device may be created at a time with this
		selector. An individual compute unit name may not appear more than once in the sub-device description. A sub-device created with
		{@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL} cannot be further sub-divided. A sub-device created with another partitioning mode cannot be further
		sub-divided by {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL}.

		Example: To create a three compute unit sub-device using compute units, [ 0, 1, 3 ], pass:

        [ {@link #CL_DEVICE_PARTITION_BY_NAMES_INTEL}, 0, 1, 3, {@link CL_PARTITION_BY_NAMES_LIST_END_INTEL}, 0 ]

		The meaning of these numbers are, in order:
		${ul(
			"0 the name of the first compute unit in the sub-device",
			"1 the name of the second compute unit in the sub-device",
			"3 the name of the third compute unit in the sub-device"
		)}
		"""
	)

	IntConstant.block(
		"Accepted in the {@properties} argument of {@link CL12#clCreateSubDevices}.",

		"CL_DEVICE_PARTITION_BY_NAMES_INTEL" _ 0x4052
	)

	IntConstant.block(
		"The name list terminator.",

		"CL_PARTITION_BY_NAMES_LIST_END_INTEL".expr<Int>("-1")
	)

}