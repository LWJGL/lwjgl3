/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_gl_msaa_sharing = "KHRGLMSAASharing".nativeClassCL("khr_gl_msaa_sharing", KHR) {

	documentation = "Native bindings to the $extensionName extension."

	IntConstant.block(
		"cl_gl_texture_info",

		"GL_NUM_SAMPLES" _ 0x2012
	)

}