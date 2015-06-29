/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_gl_depth_images = dependsOn(Module.OPENGL) {
	"KHRGLDepthImages".nativeClassCL("khr_gl_depth_images", KHR) {
		documentation = "Native bindings to the $extensionName extension."

		IntConstant(
			"cl_channel_order",

			"DEPTH_STENCIL" _ 0x10BE
		)

		IntConstant(
			"cl_channel_type",

			"UNORM_INT24" _ 0x10DF
		)
	}
}