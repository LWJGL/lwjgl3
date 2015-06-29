/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_fp64 = "KHRFP64".nativeClassCL("khr_fp64", KHR) {

	documentation = "Native bindings to the $extensionLink  extension."

	IntConstant(
		"cl_device_info",

		"DEVICE_DOUBLE_FP_CONFIG" _ 0x1032
	)

}