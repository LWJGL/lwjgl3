/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val intel_motion_estimation = "INTELMotionEstimation".nativeClassCL("intel_motion_estimation", INTEL) {
	documentation =
		"""
		Native bindings to the $extensionLink extension.

		This document presents the motion estimation extension for OpenCL. This extension includes a set of host-callable functions for frame-based motion
		estimation and introduces motion estimators, or also "motion estimation accelerator objects". These accelerator objects provide an abstraction of
		software- and/or hardware-accelerated functions for motion estimation, which can be provided by select OpenCL vendors.

		This extension depends on the OpenCL 1.2 built-in kernel infrastructure and on the accelerator extension, which provides an abstraction for
		domain-specific acceleration in the OpenCL runtime.

		Requires ${intel_accelerator.link}.
		"""

	IntConstant(
		"""
		Accepted as a type in the {@code accelerator_type} parameter of INTELAccelerator#CreateAcceleratorINTEL(). Creates a full-frame motion estimation
		accelerator.
		""",

		"ACCELERATOR_TYPE_MOTION_ESTIMATION_INTEL" _ 0x0
	)

	IntConstant(
		"Accepted as types to the fields of {@code cl_motion_estimator_desc_intel}.",

		"ME_MB_TYPE_16x16_INTEL" _ 0x0,
		"ME_MB_TYPE_8x8_INTEL" _ 0x1,
		"ME_MB_TYPE_4x4_INTEL" _ 0x2,
		"ME_SUBPIXEL_MODE_INTEGER_INTEL" _ 0x0,
		"ME_SUBPIXEL_MODE_HPEL_INTEL" _ 0x1,
		"ME_SUBPIXEL_MODE_QPEL_INTEL" _ 0x2,
		"ME_SAD_ADJUST_MODE_NONE_INTEL" _ 0x0,
		"ME_SAD_ADJUST_MODE_HAAR_INTEL" _ 0x1,
		"ME_SEARCH_PATH_RADIUS_2_2_INTEL" _ 0x0,
		"ME_SEARCH_PATH_RADIUS_4_4_INTEL" _ 0x1,
		"ME_SEARCH_PATH_RADIUS_16_12_INTEL" _ 0x5
	)
}