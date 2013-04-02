/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

fun khr_fp16() = "KHRFP16".nativeClassCL("khr_fp16", KHR) {

	javaDoc("Native bindings to the <strong>$templateName</strong>  extension.")

	IntConstant.block(
		"cl_device_info",

		"DEVICE_HALF_FP_CONFIG" _ 0x1033
	)

}