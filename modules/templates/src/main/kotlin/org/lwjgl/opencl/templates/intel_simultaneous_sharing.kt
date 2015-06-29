/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_simultaneous_sharing = "INTELSimultaneousSharing".nativeClassCL("intel_simultaneous_sharing", INTEL) {
	documentation =
		"""
		Native bindings to the $extensionLink extension.

		Currently OpenCL 1.2 Extension Spec forbids to specify interoperability with multiple graphics APIs at CL10#CreateContext() or
		CL10#CreateContextFromType() time and defines that CL10#INVALID_OPERATION should be returned in such cases as noted e.g. in chapters dedicated to
		sharing memory objects with Direct3D 10 and Direct3D 11.

		The goal of this extension is to relax the restrictions and allow to specify simultaneously these combinations of interoperabilities that are supported
		by a given OpenCL device.

		Requires ${CL12.link}.
		"""

	IntConstant(
		"""
		Accepted as a property being queried in the {@code param_name} parameter of CL10#GetDeviceInfo().

		Returns the number ({@code cl_uint}) of supported combinations of graphics API interoperabilities that can be enabled simultaneously within the same
		context.

        The minimum value is 1.
		""",

		"DEVICE_SIMULTANEOUS_INTEROPS_INTEL" _ 0x4104
	)

	IntConstant(
		"""
		Accepted as a property being queried in the {@code param_name} parameter of CL10#GetDeviceInfo().

		Returns a {@code cl_uint} list of {@code n} combinations of context property names describing graphic APIs that the device can interoperate with
		simultaneously by specifying the combination in the {@code properties} parameter of CL10#CreateContext() and CL10#CreateContextFromType().

		Each combination is a set of 2 or more property names and is terminated with zero.

		{@code n} is the value returned by the query for #DEVICE_NUM_SIMULTANEOUS_INTEROPS_INTEL.
		""",

		"DEVICE_NUM_SIMULTANEOUS_INTEROPS_INTEL" _ 0x4105
	)
}