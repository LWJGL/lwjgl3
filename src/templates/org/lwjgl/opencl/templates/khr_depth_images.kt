/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

fun khr_depth_images() = "KHRDepthImages".nativeClassCL("khr_depth_images", KHR) {

	javaDoc("Native bindings to the $extensionName extension.")

	IntConstant.block(
		"cl_channel_order",

		"DEPTH" _ 0x10BD
	)

}